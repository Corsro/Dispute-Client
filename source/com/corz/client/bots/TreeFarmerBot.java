package com.corz.client.bots;

import com.corz.client.LocalCompute;
import gg.corz.rpc.cloud.TreeCandidate;
import gg.corz.rpc.cloud.TreePlanInput;
import gg.corz.rpc.cloud.TreePlanOutput;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_1268;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_3965;
import net.minecraft.class_746;

/**
 * Clean Tree Farmer Bot powered by com.corz.client.LocalCompute.tree(TreePlanInput).
 *
 * Automatically scans nearby logs, routes and chops trees with the best hotbar axe,
 * clears blocking canopy leaves when needed, and replants saplings on valid soil.
 */
public final class TreeFarmerBot {
   public static final TreeFarmerBot INSTANCE = new TreeFarmerBot();

   private volatile boolean enabled;
   private volatile String status = "Off";
   private final Map<Long, Integer> replantSpots = new HashMap<>();
   private class_2338 activeTarget;
   private int targetTicks;
   private int treesChopped;
   private int saplingsPlanted;
   private int tickCounter;

   private TreeFarmerBot() {
   }

   public boolean isEnabled() {
      return this.enabled;
   }

   public void setEnabled(boolean on, BotAddonConfig cfg) {
      if (this.enabled == on) {
         return;
      }
      this.enabled = on;
      this.activeTarget = null;
      this.targetTicks = 0;
      this.status = on ? "Scanning trees..." : "Off";
      class_310 mc = class_310.method_1551();
      if (!on) {
         if (mc.field_1761 != null) {
            mc.field_1761.method_2925();
         }
         BotItemHelper.releaseAllMovementKeys(mc);
         this.replantSpots.clear();
      }
   }

   public String status() {
      return this.status;
   }

   public int treesChopped() {
      return this.treesChopped;
   }

   public int saplingsPlanted() {
      return this.saplingsPlanted;
   }

   public void onTick(class_310 mc, BotAddonConfig cfg) {
      if (!this.enabled) {
         return;
      }
      if (mc == null || mc.field_1724 == null || mc.field_1687 == null || mc.field_1761 == null) {
         this.status = "Waiting for world";
         return;
      }
      if (mc.field_1755 != null) {
         BotItemHelper.releaseAllMovementKeys(mc);
         return;
      }

      this.tickCounter++;
      class_746 player = mc.field_1724;

      // 1. Handle pending sapling replant spots when reachable
      if (cfg.treeReplant && tryReplant(mc, player)) {
         return;
      }

      // 2. Refresh or acquire target log using LocalCompute.tree(...)
      if (this.activeTarget != null) {
         class_2680 st = mc.field_1687.method_8320(this.activeTarget);
         if (!BotItemHelper.isLog(st) && !(cfg.treeClearLeaves && BotItemHelper.isLeaves(st))) {
            recordReplantCandidateIfBase(mc, this.activeTarget);
            this.treesChopped++;
            this.activeTarget = null;
            this.targetTicks = 0;
         } else if (++this.targetTicks > 140) {
            this.activeTarget = null;
            this.targetTicks = 0;
         }
      }

      if (this.activeTarget == null || this.tickCounter % 15 == 0) {
         class_2338 planned = planNextLog(mc, player, cfg);
         if (planned != null) {
            this.activeTarget = planned;
            this.targetTicks = 0;
         }
      }

      if (this.activeTarget == null) {
         BotItemHelper.releaseAllMovementKeys(mc);
         this.status = "No trees in " + cfg.treeRadius + "m (chopped " + this.treesChopped + ")";
         return;
      }

      // 3. Approach or chop active target
      class_243 eye = player.method_33571();
      class_243 center = class_243.method_24953(this.activeTarget);
      double dist = eye.method_1022(center);
      float[] angles = BotItemHelper.anglesTo(eye, center);
      BotItemHelper.stepAimTowards(player, angles[0], angles[1], 24.0F, 24.0F);

      class_315 o = mc.field_1690;
      if (dist > 4.2D) {
         BotItemHelper.setKeyDown(o.field_1894, true);
         BotItemHelper.setKeyDown(o.field_1867, dist > 6.5D);
         BotItemHelper.setKeyDown(o.field_1903, player.field_5976 && player.method_24828());
         BotItemHelper.setKeyDown(o.field_1886, false);

         // If leaves directly block movement at head/chest height, clear them if enabled
         if (cfg.treeClearLeaves) {
            class_2350 facing = class_2350.method_10150((double)player.method_36454());
            class_2338 ahead = player.method_24515().method_10093(facing).method_10084();
            if (BotItemHelper.isLeaves(mc.field_1687.method_8320(ahead))) {
               this.activeTarget = ahead;
               this.targetTicks = 0;
            }
         }
         this.status = String.format("Walking -> log (%.1fm) | %d chopped", dist, this.treesChopped);
      } else {
         BotItemHelper.setKeyDown(o.field_1894, dist > 2.3D);
         BotItemHelper.setKeyDown(o.field_1867, false);
         BotItemHelper.setKeyDown(o.field_1903, false);

         int axeSlot = BotItemHelper.findBestHotbarTool(player, BotItemHelper::isAxe);
         if (axeSlot >= 0) {
            BotItemHelper.selectSlot(player, axeSlot);
         }
         class_2350 face = closestFace(eye, center);
         mc.field_1761.method_2902(this.activeTarget, face);
         player.method_6104(class_1268.field_5808);
         this.status = String.format("Chopping (%d logs | %d replanted)", this.treesChopped, this.saplingsPlanted);
      }
   }

   private class_2338 planNextLog(class_310 mc, class_746 player, BotAddonConfig cfg) {
      int r = cfg.treeRadius;
      class_2338 origin = player.method_24515();
      class_243 eye = player.method_33571();
      TreePlanInput.Builder in = TreePlanInput.newBuilder()
         .setYaw(player.method_36454())
         .setFarFirst(cfg.treeFarFirst);

      int count = 0;
      for (int dx = -r; dx <= r && count < 4096; dx++) {
         for (int dz = -r; dz <= r && count < 4096; dz++) {
            for (int dy = -4; dy <= 16 && count < 4096; dy++) {
               class_2338 pos = origin.method_10069(dx, dy, dz);
               if (BotItemHelper.isLog(mc.field_1687.method_8320(pos))) {
                  class_243 c = class_243.method_24953(pos);
                  float[] ang = BotItemHelper.anglesTo(eye, c);
                  in.addCandidates(
                     TreeCandidate.newBuilder()
                        .setTarget(BotItemHelper.packBlockPos(pos))
                        .setDistance(eye.method_1022(c))
                        .setYaw(ang[0])
                        .build()
                  );
                  count++;
               }
            }
         }
      }
      if (count == 0) {
         return null;
      }
      TreePlanOutput out = LocalCompute.tree(in.build());
      if (out.getOrderCount() == 0) {
         return null;
      }
      return BotItemHelper.unpackBlockPos(out.getOrder(0));
   }

   private void recordReplantCandidateIfBase(class_310 mc, class_2338 brokenPos) {
      class_2338 below = brokenPos.method_10074();
      if (BotItemHelper.isPlantableSoil(mc.field_1687.method_8320(below))) {
         this.replantSpots.put(BotItemHelper.packBlockPos(brokenPos), 240);
      }
   }

   private boolean tryReplant(class_310 mc, class_746 player) {
      if (this.replantSpots.isEmpty()) {
         return false;
      }
      int saplingSlot = BotItemHelper.findHotbarSlot(player, BotItemHelper::isSapling);
      if (saplingSlot < 0) {
         this.replantSpots.clear();
         return false;
      }

      Long matchedKey = null;
      class_2338 matchedPos = null;
      for (Map.Entry<Long, Integer> e : this.replantSpots.entrySet()) {
         if (e.getValue() <= 0) {
            continue;
         }
         e.setValue(e.getValue() - 1);
         class_2338 pos = BotItemHelper.unpackBlockPos(e.getKey());
         if (mc.field_1687.method_8320(pos).method_26215()
            && BotItemHelper.isPlantableSoil(mc.field_1687.method_8320(pos.method_10074()))
            && player.method_33571().method_1022(class_243.method_24953(pos)) <= 4.3D) {
            matchedKey = e.getKey();
            matchedPos = pos;
            break;
         }
      }

      this.replantSpots.entrySet().removeIf((e) -> e.getValue() <= 0);

      if (matchedPos == null) {
         return false;
      }

      class_2338 soil = matchedPos.method_10074();
      class_243 hitPos = class_243.method_24953(soil).method_1031(0.0D, 0.5D, 0.0D);
      float[] ang = BotItemHelper.anglesTo(player.method_33571(), hitPos);
      BotItemHelper.stepAimTowards(player, ang[0], ang[1], 32.0F, 32.0F);
      BotItemHelper.selectSlot(player, saplingSlot);
      mc.field_1761.method_2896(
         player,
         class_1268.field_5808,
         new class_3965(hitPos, class_2350.field_11036, soil, false)
      );
      player.method_6104(class_1268.field_5808);
      this.replantSpots.remove(matchedKey);
      this.saplingsPlanted++;
      this.status = "Replanted sapling (" + this.saplingsPlanted + ")";
      return true;
   }

   private static class_2350 closestFace(class_243 eye, class_243 center) {
      double dx = eye.field_1352 - center.field_1352;
      double dy = eye.field_1351 - center.field_1351;
      double dz = eye.field_1350 - center.field_1350;
      double ax = Math.abs(dx);
      double ay = Math.abs(dy);
      double az = Math.abs(dz);
      if (ay >= ax && ay >= az) {
         return dy >= 0 ? class_2350.field_11036 : class_2350.field_11033;
      }
      if (ax >= az) {
         return dx >= 0 ? class_2350.field_11034 : class_2350.field_11039;
      }
      return dz >= 0 ? class_2350.field_11035 : class_2350.field_11043;
   }
}
