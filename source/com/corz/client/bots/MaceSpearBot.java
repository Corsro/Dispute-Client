package com.corz.client.bots;

import com.corz.client.LocalCombat;
import com.google.gson.JsonObject;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_3959;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import net.minecraft.class_239.class_240;
import net.minecraft.class_746;

/**
 * Clean Mace PvP + SpearMace Bot backed by com.corz.client.LocalCombat ("mace" FSM).
 *
 * Supports:
 *  - Mace PvP smash dives (Auto / Elytra + Rocket / Wind Charge hop & safety catch)
 *  - SpearMace 1.21.11 Lunge & Lunge + Stab combo modes
 *  - Shield break with Axe (Fast / Shield Only / Always / Off)
 *  - Gapple healing / recovery & Chestplate-Elytra armor switching
 */
public final class MaceSpearBot {
   public static final MaceSpearBot INSTANCE = new MaceSpearBot();

   private volatile boolean enabled;
   private volatile String status = "Idle";
   private volatile String phase = "IDLE";
   private class_1657 currentTarget;

   private int sinceSwing = 20;
   private int windCooldown = 0;
   private int lungeCooldown = 0;
   private int eatTicksLeft = 0;
   private boolean holdingUse = false;
   private boolean holdingAttack = false;
   private String lastActionName = "";
   private boolean lastActionOk = false;
   private long lastExchangeSeq = 0L;

   private float desiredYaw;
   private float desiredPitch;
   private boolean hasAimTarget;
   private int strafeDir = 1;
   private int tickCounter = 0;

   private MaceSpearBot() {
   }

   public boolean isEnabled() {
      return this.enabled;
   }

   public void setEnabled(boolean on, BotAddonConfig cfg) {
      if (this.enabled == on) {
         return;
      }
      this.enabled = on;
      this.hasAimTarget = false;
      this.holdingUse = false;
      this.holdingAttack = false;
      this.eatTicksLeft = 0;
      this.currentTarget = null;
      this.phase = "IDLE";
      this.status = on ? "Scanning targets..." : "Off";
      if (!on) {
         class_310 mc = class_310.method_1551();
         BotItemHelper.releaseAllMovementKeys(mc);
      }
   }

   public String status() {
      return this.status;
   }

   public String phase() {
      return this.phase;
   }

   public class_1657 target() {
      return this.currentTarget;
   }

   public void onFrame() {
      if (!this.enabled || !this.hasAimTarget) {
         return;
      }
      class_310 mc = class_310.method_1551();
      if (mc.field_1724 != null && mc.field_1755 == null) {
         BotItemHelper.stepAimTowards(mc.field_1724, this.desiredYaw, this.desiredPitch, 14.0F, 12.0F);
      }
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
         this.hasAimTarget = false;
         return;
      }

      this.tickCounter++;
      this.sinceSwing++;
      if (this.windCooldown > 0) this.windCooldown--;
      if (this.lungeCooldown > 0) this.lungeCooldown--;
      if (this.tickCounter % 24 == 0) this.strafeDir = -this.strafeDir;

      class_746 player = mc.field_1724;
      class_1657 target = findTarget(mc, player, cfg);
      this.currentTarget = target;

      if (target == null) {
         this.hasAimTarget = false;
         this.phase = "IDLE";
         this.status = "No target in " + cfg.maceMaxRange + "m";
         BotItemHelper.releaseAllMovementKeys(mc);
         return;
      }

      JsonObject sensors = buildSensors(mc, player, target, cfg);
      JsonObject profile = new JsonObject();
      profile.addProperty("launch", cfg.maceLaunch.name());
      profile.addProperty("shieldBreak", cfg.maceShieldBreak.name());
      profile.addProperty("spearMode", cfg.maceSpearMode.name());

      JsonObject response = LocalCombat.exchange(
         this,
         "mace",
         profile,
         () -> sensors,
         () -> {
            JsonObject fb = new JsonObject();
            fb.addProperty("sequence", this.lastExchangeSeq);
            fb.addProperty("action", this.lastActionName);
            fb.addProperty("ok", this.lastActionOk);
            return fb;
         },
         false
      );

      this.lastExchangeSeq = response.has("sequence") ? response.get("sequence").getAsLong() : this.lastExchangeSeq + 1L;
      JsonObject plan = response.has("plan") && response.get("plan").isJsonObject()
         ? response.getAsJsonObject("plan")
         : new JsonObject();

      this.phase = str(plan, "phase", "IDLE");
      String action = str(plan, "action", "NONE");
      String look = str(plan, "look", "NONE");
      String move = str(plan, "move", "NONE");
      boolean wantEat = plan.has("eat") && plan.get("eat").getAsBoolean();

      applyAim(player, target, look);
      this.lastActionName = action;
      this.lastActionOk = executeAction(mc, player, target, cfg, action, wantEat);
      applyMovement(mc, player, move, action);

      double dist = player.method_5739(target);
      this.status = String.format("%s | %s (%.1fm)", this.phase, action, dist);
   }

   private class_1657 findTarget(class_310 mc, class_746 self, BotAddonConfig cfg) {
      String filter = cfg.maceTargetName == null ? "" : cfg.maceTargetName.trim().toLowerCase();
      class_1657 best = null;
      double bestDist = (double)cfg.maceMaxRange;
      for (class_1657 p : mc.field_1687.method_18456()) {
         if (p == self || !p.method_5805() || p.method_7325()) {
            continue;
         }
         if (!filter.isEmpty() && !p.method_5477().getString().toLowerCase().contains(filter)) {
            continue;
         }
         double d = self.method_5739(p);
         if (d <= bestDist) {
            bestDist = d;
            best = p;
         }
      }
      return best;
   }

   private JsonObject buildSensors(class_310 mc, class_746 player, class_1657 target, BotAddonConfig cfg) {
      JsonObject s = new JsonObject();
      int maceSlot = BotItemHelper.findHotbarSlot(player, BotItemHelper::isMace);
      int axeSlot = BotItemHelper.findBestHotbarTool(player, BotItemHelper::isAxe);
      int spearSlot = BotItemHelper.findBestLungeSpearSlot(player);
      int windSlot = BotItemHelper.findHotbarSlot(player, BotItemHelper::isWindCharge);
      int elytraSlot = BotItemHelper.findHotbarSlot(player, BotItemHelper::isElytra);
      int rocketSlot = BotItemHelper.findHotbarSlot(player, BotItemHelper::isFireworkRocket);
      int chestSlot = BotItemHelper.findHotbarSlot(player, BotItemHelper::isChestplate);
      int gappleSlot = BotItemHelper.findHotbarSlot(player, BotItemHelper::isGapple);

      boolean wearingElytra = BotItemHelper.isWearingElytra(player);
      boolean allowElytra = cfg.maceLaunch != BotAddonConfig.LaunchMode.WIND_CHARGE;
      boolean allowWind = cfg.maceLaunch != BotAddonConfig.LaunchMode.ELYTRA;

      class_238 box = target.method_5829();
      class_243 eye = player.method_33571();
      double boxDist = Math.sqrt(box.method_49271(eye));
      double above = player.method_23318() - target.method_23318();
      class_243 vel = player.method_18798();
      double horizDist = Math.hypot(target.method_23317() - player.method_23317(), target.method_23321() - player.method_23321());

      boolean los = mc.field_1687.method_17742(
         new class_3959(eye, target.method_33571(), class_3960.field_17558, class_242.field_1348, player)
      ).method_17783() == class_240.field_1333;

      float hp = player.method_6032() + player.method_6067();
      boolean shieldUp = target.method_6039();
      boolean wantShieldBreak = axeSlot >= 0 && (
         cfg.maceShieldBreak == BotAddonConfig.ShieldBreakMode.ALWAYS
            || (cfg.maceShieldBreak != BotAddonConfig.ShieldBreakMode.OFF && shieldUp)
      );

      boolean useSpear = spearSlot >= 0 && cfg.maceSpearMode != BotAddonConfig.SpearMode.OFF;
      boolean wantLunge = useSpear && this.lungeCooldown == 0 && horizDist > 3.6D && horizDist < 12.0D;
      boolean wantStab = useSpear && cfg.maceSpearMode == BotAddonConfig.SpearMode.LUNGE_AND_STAB && boxDist <= 3.6D;
      boolean flightClear = isHeadroomClear(mc, player, 5);
      boolean hopRoom = isHeadroomClear(mc, player, 4);
      boolean lastChance = !player.method_24828() && !player.method_6128() && player.field_6017 > 7.5F && vel.field_1351 < -0.55D;

      s.addProperty("target", true);
      s.addProperty("onGround", player.method_24828());
      s.addProperty("gliding", player.method_6128());
      s.addProperty("wantEat", (hp < (float)cfg.maceHealBelow && gappleSlot >= 0) || this.eatTicksLeft > 0);
      s.addProperty("eating", this.eatTicksLeft > 0 || player.method_6115());
      s.addProperty("hp", hp);
      s.addProperty("eatBelow", (double)cfg.maceHealBelow);
      s.addProperty("boxDist", boxDist);
      s.addProperty("h", horizDist);
      s.addProperty("above", above);
      s.addProperty("vy", vel.field_1351);
      s.addProperty("sinceSwing", this.sinceSwing);
      s.addProperty("fallDistance", (double)player.field_6017);
      s.addProperty("diveHeight", (double)cfg.maceDiveHeight);
      s.addProperty("reach", 3.1D);
      s.addProperty("rayOnTarget", los && boxDist <= 3.3D);
      s.addProperty("smashCharged", player.field_6017 >= 1.5F || (!player.method_24828() && vel.field_1351 < -0.35D));
      s.addProperty("smashReach", boxDist <= 3.4D && los);
      s.addProperty("hasMace", maceSlot >= 0);
      s.addProperty("hasAxe", axeSlot >= 0);
      s.addProperty("targetShield", wantShieldBreak);
      s.addProperty("hasSpear", useSpear);
      s.addProperty("lungeReady", wantLunge);
      s.addProperty("lungeWant", wantLunge);
      s.addProperty("lungeAimed", los);
      s.addProperty("groundLungeSafe", player.method_24828() && los && horizDist > 3.6D);
      s.addProperty("airLungeSafe", !player.method_24828() && los && horizDist > 3.2D);
      s.addProperty("groundStabSafe", wantStab && los);
      s.addProperty("stabRay", los && boxDist <= 3.6D);
      s.addProperty("hasWind", allowWind && windSlot >= 0);
      s.addProperty("windReady", allowWind && windSlot >= 0 && this.windCooldown == 0);
      s.addProperty("windAimed", true);
      s.addProperty("hopRoom", hopRoom);
      s.addProperty("lastChance", lastChance);
      s.addProperty("hasElytra", allowElytra && (wearingElytra || elytraSlot >= 0));
      s.addProperty("wearingElytra", wearingElytra);
      s.addProperty("hasRockets", allowElytra && rocketSlot >= 0);
      s.addProperty("flightClear", flightClear);
      s.addProperty("rocketBurning", player.method_6128() && vel.field_1351 > 0.35D);
      s.addProperty("hasChest", chestSlot >= 0);
      return s;
   }

   private void applyAim(class_746 player, class_1657 target, String look) {
      if ("NONE".equals(look)) {
         this.hasAimTarget = false;
         return;
      }
      if ("DOWN".equals(look) || "CATCH".equals(look)) {
         this.desiredYaw = player.method_36454();
         this.desiredPitch = 88.0F;
         this.hasAimTarget = true;
         return;
      }
      if ("TAKEOFF".equals(look)) {
         float[] a = BotItemHelper.anglesTo(player.method_33571(), target.method_33571());
         this.desiredYaw = a[0];
         this.desiredPitch = -55.0F;
         this.hasAimTarget = true;
         return;
      }
      if ("CLIMB".equals(look)) {
         float[] a = BotItemHelper.anglesTo(player.method_33571(), target.method_33571());
         this.desiredYaw = a[0];
         this.desiredPitch = -42.0F;
         this.hasAimTarget = true;
         return;
      }
      // TARGET or LUNGE
      class_243 aimPoint = target.method_33571().method_1031(0.0D, -0.35D, 0.0D);
      float[] a = BotItemHelper.anglesTo(player.method_33571(), aimPoint);
      this.desiredYaw = a[0];
      this.desiredPitch = "LUNGE".equals(look) ? Math.min(a[1], -12.0F) : a[1];
      this.hasAimTarget = true;
   }

   private boolean executeAction(
      class_310 mc,
      class_746 player,
      class_1657 target,
      BotAddonConfig cfg,
      String action,
      boolean wantEat
   ) {
      if (wantEat) {
         int gapSlot = BotItemHelper.findHotbarSlot(player, BotItemHelper::isGapple);
         if (gapSlot >= 0) {
            BotItemHelper.selectSlot(player, gapSlot);
            this.eatTicksLeft = Math.max(this.eatTicksLeft, 24);
            this.holdingUse = true;
            BotItemHelper.setKeyDown(mc.field_1690.field_1904, true);
            if (!player.method_6115()) {
               mc.field_1761.method_2919(player, class_1268.field_5808);
            }
            if (this.eatTicksLeft > 0) this.eatTicksLeft--;
            return true;
         }
      }
      if (this.holdingUse && !"LUNGE".equals(action)) {
         this.holdingUse = false;
         this.eatTicksLeft = 0;
         BotItemHelper.setKeyDown(mc.field_1690.field_1904, false);
      }

      switch (action) {
         case "SMASH": {
            int slot = BotItemHelper.findHotbarSlot(player, BotItemHelper::isMace);
            if (slot >= 0) {
               BotItemHelper.selectSlot(player, slot);
               BotItemHelper.stepAimTowards(player, this.desiredYaw, this.desiredPitch, 35.0F, 35.0F);
               if (player.method_7261(0.5F) >= 0.85F) {
                  mc.field_1761.method_2918(player, target);
                  player.method_6104(class_1268.field_5808);
                  this.sinceSwing = 0;
                  return true;
               }
            }
            return false;
         }
         case "AXE": {
            int slot = BotItemHelper.findBestHotbarTool(player, BotItemHelper::isAxe);
            if (slot >= 0) {
               BotItemHelper.selectSlot(player, slot);
               BotItemHelper.stepAimTowards(player, this.desiredYaw, this.desiredPitch, 30.0F, 30.0F);
               mc.field_1761.method_2918(player, target);
               player.method_6104(class_1268.field_5808);
               this.sinceSwing = 0;
               return true;
            }
            return false;
         }
         case "LUNGE": {
            int slot = BotItemHelper.findBestLungeSpearSlot(player);
            if (slot >= 0) {
               BotItemHelper.selectSlot(player, slot);
               BotItemHelper.stepAimTowards(player, this.desiredYaw, this.desiredPitch, 25.0F, 25.0F);
               // 1.21.11 Spear Lunge attacks / triggers kinetic charge thrust
               mc.field_1761.method_2918(player, target);
               player.method_6104(class_1268.field_5808);
               this.lungeCooldown = 14;
               this.sinceSwing = 0;
               return true;
            }
            return false;
         }
         case "STAB": {
            int slot = BotItemHelper.findBestLungeSpearSlot(player);
            if (slot >= 0) {
               BotItemHelper.selectSlot(player, slot);
               BotItemHelper.stepAimTowards(player, this.desiredYaw, this.desiredPitch, 25.0F, 25.0F);
               if (player.method_7261(0.5F) >= 0.9F) {
                  mc.field_1761.method_2918(player, target);
                  player.method_6104(class_1268.field_5808);
                  this.sinceSwing = 0;
                  return true;
               }
            }
            return false;
         }
         case "WIND_FEET":
         case "SAFETY_WIND": {
            int slot = BotItemHelper.findHotbarSlot(player, BotItemHelper::isWindCharge);
            if (slot >= 0 && this.windCooldown == 0) {
               BotItemHelper.selectSlot(player, slot);
               BotItemHelper.stepAimTowards(player, player.method_36454(), 88.0F, 45.0F, 45.0F);
               mc.field_1761.method_2919(player, class_1268.field_5808);
               player.method_6104(class_1268.field_5808);
               this.windCooldown = 12;
               return true;
            }
            return false;
         }
         case "EQUIP_ELYTRA": {
            int slot = BotItemHelper.findHotbarSlot(player, BotItemHelper::isElytra);
            if (slot >= 0) {
               BotItemHelper.selectSlot(player, slot);
               mc.field_1761.method_2919(player, class_1268.field_5808);
               return true;
            }
            return false;
         }
         case "EQUIP_CHEST": {
            int slot = BotItemHelper.findHotbarSlot(player, BotItemHelper::isChestplate);
            if (slot >= 0) {
               BotItemHelper.selectSlot(player, slot);
               mc.field_1761.method_2919(player, class_1268.field_5808);
               return true;
            }
            return false;
         }
         case "ROCKET": {
            int slot = BotItemHelper.findHotbarSlot(player, BotItemHelper::isFireworkRocket);
            if (slot >= 0) {
               BotItemHelper.selectSlot(player, slot);
               mc.field_1761.method_2919(player, class_1268.field_5808);
               return true;
            }
            return false;
         }
         default:
            return false;
      }
   }

   private void applyMovement(class_310 mc, class_746 player, String move, String action) {
      class_315 o = mc.field_1690;
      boolean fwd = false;
      boolean back = false;
      boolean left = false;
      boolean right = false;
      boolean jump = false;
      boolean sprint = false;

      switch (move) {
         case "CHASE":
            fwd = true;
            sprint = true;
            break;
         case "STRAFE":
            fwd = true;
            sprint = true;
            left = this.strafeDir < 0;
            right = this.strafeDir > 0;
            break;
         case "LEAP":
            fwd = true;
            sprint = true;
            jump = player.method_24828();
            break;
         case "JUMP":
         case "GLIDE_KEY":
            fwd = true;
            jump = (this.tickCounter % 2 == 0) || player.method_24828();
            break;
         case "AIR_CRIT":
            fwd = true;
            break;
         case "BACK":
            back = true;
            break;
         case "AIR":
         case "STOP":
         default:
            break;
      }

      BotItemHelper.setKeyDown(o.field_1894, fwd);
      BotItemHelper.setKeyDown(o.field_1881, back);
      BotItemHelper.setKeyDown(o.field_1913, left);
      BotItemHelper.setKeyDown(o.field_1849, right);
      BotItemHelper.setKeyDown(o.field_1903, jump);
      BotItemHelper.setKeyDown(o.field_1867, sprint);
   }

   private static boolean isHeadroomClear(class_310 mc, class_746 player, int heightBlocks) {
      class_2338 base = player.method_24515();
      for (int dy = 2; dy <= heightBlocks + 1; dy++) {
         if (!mc.field_1687.method_8320(base.method_10086(dy)).method_26215()) {
            return false;
         }
      }
      return true;
   }

   private static String str(JsonObject obj, String key, String def) {
      try {
         return obj.has(key) ? obj.get(key).getAsString() : def;
      } catch (RuntimeException ignored) {
         return def;
      }
   }
}
