package com.corz.client;

import com.google.gson.JsonObject;
import java.util.function.Supplier;

public final class LocalCombat {
   private static long sequenceCounter = 1L;

   private LocalCombat() {
   }

   public static JsonObject exchange(
      Object owner,
      String mode,
      JsonObject profile,
      Supplier<JsonObject> sensorsSupplier,
      Supplier<JsonObject> feedbackSupplier,
      boolean async
   ) {
      long seq = sequenceCounter++;
      JsonObject resp = new JsonObject();
      resp.addProperty("sequence", seq);
      resp.addProperty("ok", true);

      JsonObject sensors = (sensorsSupplier != null) ? sensorsSupplier.get() : null;
      if (sensors == null) {
         sensors = new JsonObject();
      }

      if ("mace".equalsIgnoreCase(mode)) {
         JsonObject plan = computeMacePlan(sensors, profile);
         resp.add("plan", plan);
      } else if ("uhc".equalsIgnoreCase(mode)) {
         JsonObject action = computeUhcAction(sensors, profile);
         resp.add("action", action);
         resp.addProperty("secondWeb", false);
      } else {
         JsonObject plan = new JsonObject();
         plan.addProperty("phase", "COMBAT");
         plan.addProperty("action", "ATTACK");
         resp.add("plan", plan);
      }

      return resp;
   }

   private static JsonObject computeMacePlan(JsonObject sensors, JsonObject profile) {
      JsonObject plan = new JsonObject();

      double dist = sensors.has("distance") ? sensors.get("distance").getAsDouble() : 10.0D;
      boolean falling = sensors.has("falling") && sensors.get("falling").getAsBoolean();
      double fallDist = sensors.has("fallDistance") ? sensors.get("fallDistance").getAsDouble() : 0.0D;
      boolean targetShield = sensors.has("targetShield") && sensors.get("targetShield").getAsBoolean();
      boolean lowHealth = sensors.has("health") && sensors.get("health").getAsDouble() <= 8.0D;

      if (lowHealth && sensors.has("hasGapple") && sensors.get("hasGapple").getAsBoolean()) {
         plan.addProperty("phase", "RECOVER");
         plan.addProperty("action", "EAT_GAPPLE");
         plan.addProperty("look", "NONE");
         return plan;
      }

      if (falling && fallDist >= 1.5D && dist <= 4.5D) {
         plan.addProperty("phase", "DIVE");
         plan.addProperty("action", "MACE_SMASH");
         plan.addProperty("look", "TARGET_HEAD");
         return plan;
      }

      if (targetShield && dist <= 3.8D) {
         plan.addProperty("phase", "SHIELD_BREAK");
         plan.addProperty("action", "SHIELD_BREAK");
         plan.addProperty("look", "TARGET_BODY");
         return plan;
      }

      if (dist <= 3.8D) {
         String spearMode = profile.has("spearMode") ? profile.get("spearMode").getAsString() : "OFF";
         if (!"OFF".equalsIgnoreCase(spearMode) && sensors.has("hasSpear") && sensors.get("hasSpear").getAsBoolean()) {
            plan.addProperty("phase", "LUNGE");
            plan.addProperty("action", "SPEAR_LUNGE");
            plan.addProperty("look", "TARGET_BODY");
            return plan;
         }
         plan.addProperty("phase", "ENGAGE");
         plan.addProperty("action", "MACE_SMASH");
         plan.addProperty("look", "TARGET_HEAD");
         return plan;
      }

      // Medium to far range: launch dive
      String launch = profile.has("launch") ? profile.get("launch").getAsString() : "AUTO";
      if (!"OFF".equalsIgnoreCase(launch) && !falling && dist >= 5.0D && dist <= 24.0D) {
         if (sensors.has("hasWindCharge") && sensors.get("hasWindCharge").getAsBoolean()) {
            plan.addProperty("phase", "LAUNCH");
            plan.addProperty("action", "USE_WIND_CHARGE");
            plan.addProperty("look", "GROUND");
            return plan;
         }
         if (sensors.has("hasRocket") && sensors.get("hasRocket").getAsBoolean()) {
            plan.addProperty("phase", "LAUNCH");
            plan.addProperty("action", "FIRE_ROCKET");
            plan.addProperty("look", "TARGET_HEAD");
            return plan;
         }
      }

      plan.addProperty("phase", "APPROACH");
      plan.addProperty("action", "NONE");
      plan.addProperty("look", "TARGET_BODY");
      return plan;
   }

   private static JsonObject computeUhcAction(JsonObject sensors, JsonObject profile) {
      JsonObject act = new JsonObject();
      act.addProperty("forward", 1.0F);
      act.addProperty("strafe", 0.0F);
      act.addProperty("aimSpeed", 18.0D);
      act.addProperty("jump", false);
      act.addProperty("sprint", true);
      act.addProperty("attack", true);
      act.addProperty("useItem", false);
      return act;
   }
}
