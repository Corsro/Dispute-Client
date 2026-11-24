package com.corz.client.bots;

import com.corz.client.LocalCompute;
import gg.corz.rpc.cloud.MinerPlanInput;
import gg.corz.rpc.cloud.MinerPlanOutput;
import gg.corz.rpc.cloud.MinerTarget;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_1268;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_3486;
import net.minecraft.class_746;

/**
 * Clean Auto Ore Miner Bot backed by com.corz.client.LocalCompute.miner(MinerPlanInput).
 *
 * Scans configured ore veins (Diamond, Ancient Debris, Emerald, Gold, Iron, Copper,
 * Redstone, Lapis, Coal, Nether Quartz) inside bounds, computes optimal 3D mining order
 * via LocalCompute.miner(...), avoids lava hazards, auto-selects best Pickaxe, and mines!
 */
public final class AutoOreMinerBot {
   public static final AutoOreMinerBot INSTANCE = new AutoOreMinerBot();

   private volatile boolean enabled;
   private volatile String status = "Off";
   private class_2338 currentOreTarget;
   private int targetTicks;
   private int oresMined;
   private int tickCounter;

   private AutoOreMinerBot() {
   }

   public boolean isEnabled() {
      return this.enabled;
   }

   public void setEnabled(boolean on, BotAddonConfig cfg) {
      if (this.enabled == on) {
         return;
      }
      this.enabled = on;
      this.currentOreTarget = null;
      this.targetTicks = 0;
      this.status = on ? "Scanning ores..." : "Off";
      class_310 mc = class_310.method_1551();
      if (!on) {
         if (mc.field_1761 != null) {
            mc.field_1761.method_2925();
         }
         BotItemHelper.releaseAllMovementKeys(mc);
      }
   }

   public String status() {
      return this.status;
   }

   public int oresMined() {
      return this.oresMined;
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

      // Safety pause if standing next to lava when avoid-lava is enabled
      if (cfg.minerAvoidLava && hasAdjacentLava(mc, player.method_24515())) {
         BotItemHelper.releaseAllMovementKeys(mc);
         BotItemHelper.setKeyDown(mc.field_1690.field_1881, true);
         this.status = "Paused: Lava hazard detected!";
         return;
      }

      if (this.currentOreTarget != null) {
         if (!isWantedOre(mc.field_1687.method_8320(this.currentOreTarget), cfg)) {
            this.oresMined++;
            this.currentOreTarget = null;
            this.targetTicks = 0;
         } else if (++this.targetTicks > 180) {
            this.currentOreTarget = null;
            this.targetTicks = 0;
         }
      }

      if (this.currentOreTarget == null || this.tickCounter % 20 == 0) {
         class_2338 next = planNextOre(mc, player, cfg);
         if (next != null) {
            this.currentOreTarget = next;
            this.targetTicks = 0;
         }
      }

      if (this.currentOreTarget == null) {
         BotItemHelper.releaseAllMovementKeys(mc);
         this.status = "No ores in " + cfg.minerRadius + "m (mined " + this.oresMined + ")";
         return;
      }

      class_243 eye = player.method_33571();
      class_243 oreCenter = class_243.method_24953(this.currentOreTarget);
      double dist = eye.method_1022(oreCenter);

      int pickSlot = BotItemHelper.findBestHotbarTool(player, BotItemHelper::isPickaxe);
      if (pickSlot >= 0) {
         BotItemHelper.selectSlot(player, pickSlot);
      }

      class_315 o = mc.field_1690;
      if (dist <= 4.3D) {
         float[] ang = BotItemHelper.anglesTo(eye, oreCenter);
         BotItemHelper.stepAimTowards(player, ang[0], ang[1], 28.0F, 28.0F);
         BotItemHelper.setKeyDown(o.field_1894, dist > 2.2D);
         BotItemHelper.setKeyDown(o.field_1881, false);
         BotItemHelper.setKeyDown(o.field_1867, false);
         BotItemHelper.setKeyDown(o.field_1903, false);

         class_2350 face = closestFace(eye, oreCenter);
         mc.field_1761.method_2902(this.currentOreTarget, face);
         player.method_6104(class_1268.field_5808);
         this.status = String.format("Mining %s (%.1fm | %d mined)", BotItemHelper.blockPath(mc.field_1687.method_8320(this.currentOreTarget).method_26204()), dist, this.oresMined);
      } else {
         // Approach or tunnel safely toward ore target
         class_243 stepTarget = new class_243(
            this.currentOreTarget.method_10263() + 0.5D,
            Math.max(player.method_23318(), this.currentOreTarget.method_10264() + 0.5D),
            this.currentOreTarget.method_10260() + 0.5D
         );
         float[] ang = BotItemHelper.anglesTo(eye, stepTarget);
         BotItemHelper.stepAimTowards(player, ang[0], ang[1], 20.0F, 20.0F);

         class_2350 facing = class_2350.method_10150((double)player.method_36454());
         class_2338 blockAheadHead = player.method_24515().method_10093(facing).method_10084();
         class_2338 blockAheadFeet = player.method_24515().method_10093(facing);
         class_2338 tunnelBlock = !mc.field_1687.method_8320(blockAheadHead).method_26215()
            ? blockAheadHead
            : (!mc.field_1687.method_8320(blockAheadFeet).method_26215() ? blockAheadFeet : null);

         if (tunnelBlock != null && !(cfg.minerAvoidLava && hasAdjacentLava(mc, tunnelBlock))) {
            class_243 tCenter = class_243.method_24953(tunnelBlock);
            float[] tAng = BotItemHelper.anglesTo(eye, tCenter);
            BotItemHelper.stepAimTowards(player, tAng[0], tAng[1], 28.0F, 28.0F);
            mc.field_1761.method_2902(tunnelBlock, closestFace(eye, tCenter));
            player.method_6104(class_1268.field_5808);
            BotItemHelper.setKeyDown(o.field_1894, false);
         } else {
            BotItemHelper.setKeyDown(o.field_1894, true);
            BotItemHelper.setKeyDown(o.field_1903, player.field_5976 && player.method_24828());
         }
         BotItemHelper.setKeyDown(o.field_1881, false);
         this.status = String.format("Tunneling -> %s (%.1fm | %d mined)", BotItemHelper.blockPath(mc.field_1687.method_8320(this.currentOreTarget).method_26204()), dist, this.oresMined);
      }
   }

   private class_2338 planNextOre(class_310 mc, class_746 player, BotAddonConfig cfg) {
      int r = cfg.minerRadius;
      class_2338 feet = player.method_24515();
      int minX = feet.method_10263() - r;
      int maxX = feet.method_10263() + r;
      int minY = Math.max(cfg.minerMinY, feet.method_10264() - 12);
      int maxY = Math.min(cfg.minerMaxY, feet.method_10264() + 12);
      int minZ = feet.method_10260() - r;
      int maxZ = feet.method_10260() + r;
      if (minY > maxY) {
         return null;
      }

      MinerPlanInput.Builder in = MinerPlanInput.newBuilder()
         .setFeet(BotItemHelper.packBlockPos(feet))
         .setMinX(minX).setMaxX(maxX)
         .setMinY(minY).setMaxY(maxY)
         .setMinZ(minZ).setMaxZ(maxZ)
         .setLayerHeight(3)
         .setPassWidth(2);

      Map<Long, Integer> priorityMap = new HashMap<>();
      class_2338 bestPriorityPos = null;
      double bestScore = Double.MAX_VALUE;
      int count = 0;

      for (int y = minY; y <= maxY && count < 8192; y++) {
         for (int x = minX; x <= maxX && count < 8192; x++) {
            for (int z = minZ; z <= maxZ && count < 8192; z++) {
               class_2338 pos = new class_2338(x, y, z);
               class_2680 st = mc.field_1687.method_8320(pos);
               if (!isWantedOre(st, cfg)) {
                  continue;
               }
               if (cfg.minerAvoidLava && hasAdjacentLava(mc, pos)) {
                  continue;
               }
               long packed = BotItemHelper.packBlockPos(pos);
               boolean exposed = isExposed(mc, pos);
               in.addTargets(
                  MinerTarget.newBuilder()
                     .setTarget(packed)
                     .setOnFaceLayer(exposed)
                     .setNeighbours(countAirNeighbors(mc, pos))
                     .build()
               );
               count++;

               double dist = player.method_33571().method_1022(class_243.method_24953(pos));
               double score = dist - (exposed ? 2.5D : 0.0D) - oreWeight(st) * 0.6D;
               if (score < bestScore) {
                  bestScore = score;
                  bestPriorityPos = pos;
               }
            }
         }
      }

      if (count == 0) {
         return null;
      }
      MinerPlanOutput out = LocalCompute.miner(in.build());
      if (out.getOrderCount() > 0 && bestPriorityPos == null) {
         return BotItemHelper.unpackBlockPos(out.getOrder(0));
      }
      // Prefer nearby exposed high-value vein; fallback to LocalCompute strip sweep
      if (bestPriorityPos != null && player.method_33571().method_1022(class_243.method_24953(bestPriorityPos)) <= 10.0D) {
         return bestPriorityPos;
      }
      return out.getOrderCount() > 0 ? BotItemHelper.unpackBlockPos(out.getOrder(0)) : bestPriorityPos;
   }

   private static boolean isWantedOre(class_2680 state, BotAddonConfig cfg) {
      if (state == null || state.method_26215()) {
         return false;
      }
      String name = BotItemHelper.blockPath(state.method_26204());
      if (name.equals("ancient_debris")) return cfg.mineDebris;
      if (name.contains("diamond_ore")) return cfg.mineDiamond;
      if (name.contains("emerald_ore")) return cfg.mineEmerald;
      if (name.contains("gold_ore")) return cfg.mineGold;
      if (name.contains("iron_ore")) return cfg.mineIron;
      if (name.contains("copper_ore")) return cfg.mineCopper;
      if (name.contains("redstone_ore")) return cfg.mineRedstone;
      if (name.contains("lapis_ore")) return cfg.mineLapis;
      if (name.contains("coal_ore")) return cfg.mineCoal;
      if (name.equals("nether_quartz_ore")) return cfg.mineQuartz;
      return false;
   }

   private static int oreWeight(class_2680 state) {
      String name = BotItemHelper.blockPath(state.method_26204());
      if (name.equals("ancient_debris")) return 10;
      if (name.contains("diamond")) return 9;
      if (name.contains("emerald")) return 7;
      if (name.contains("gold")) return 5;
      if (name.contains("iron")) return 4;
      return 2;
   }

   private static boolean isExposed(class_310 mc, class_2338 pos) {
      for (class_2350 dir : class_2350.values()) {
         if (mc.field_1687.method_8320(pos.method_10093(dir)).method_26215()) {
            return true;
         }
      }
      return false;
   }

   private static int countAirNeighbors(class_310 mc, class_2338 pos) {
      int n = 0;
      for (class_2350 dir : class_2350.values()) {
         if (mc.field_1687.method_8320(pos.method_10093(dir)).method_26215()) {
            n++;
         }
      }
      return n;
   }

   private static boolean hasAdjacentLava(class_310 mc, class_2338 pos) {
      for (int dx = -1; dx <= 1; dx++) {
         for (int dy = -1; dy <= 1; dy++) {
            for (int dz = -1; dz <= 1; dz++) {
               if (mc.field_1687.method_8320(pos.method_10069(dx, dy, dz)).method_26227().method_15767(class_3486.field_15518)) {
                  return true;
               }
            }
         }
      }
      return false;
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
