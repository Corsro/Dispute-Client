package com.corz.client.bots;

import com.corz.client.LocalCombat;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import de.neo.uhcbot.Action;
import de.neo.uhcbot.HeuristicPolicy;
import de.neo.uhcbot.Obs;
import gg.corz.rpc.CombatWire;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * Clean offline UHC PvP bridge connecting de.neo.uhcbot.HeuristicPolicy to
 * com.corz.client.LocalCombat without any obfuscated gg.corz bytecode or QVM.
 */
public final class LocalUhcBridge {
   private static final Map<HeuristicPolicy, Boolean> SECOND_WEB_CACHE =
      Collections.synchronizedMap(new WeakHashMap<>());

   private LocalUhcBridge() {
   }

   public static Action decide(HeuristicPolicy policy, Obs observation) {
      if (policy == null || observation == null) {
         return safeWait("No observation");
      }
      try {
         JsonObject profile = new JsonObject();
         profile.addProperty("healAt", policy.p.healAt);
         profile.addProperty("spacing", policy.p.spacing);
         profile.addProperty("engageDist", policy.p.engageDist);
         profile.addProperty("useBow", policy.p.useBow);
         profile.addProperty("useCrossbow", policy.p.useCrossbow);
         profile.addProperty("useLava", policy.p.useLava);
         profile.addProperty("useWater", policy.p.useWater);
         profile.addProperty("useWeb", policy.p.useWeb);
         profile.addProperty("useShield", policy.p.useShield);
         profile.addProperty("useAxe", policy.p.useAxe);

         JsonObject response = LocalCombat.exchange(
            policy,
            "uhc",
            profile,
            () -> CombatWire.snapshot(observation),
            () -> null,
            false
         );
         if (response == null || !response.has("action") || !response.get("action").isJsonObject()) {
            return safeWait("No local action");
         }

         Action action = CombatWire.read(Action.class, response.getAsJsonObject("action"));
         if (action == null
            || Math.abs(action.forward) > 1
            || Math.abs(action.strafe) > 1
            || !Double.isFinite(action.aimSpeed)
            || Math.abs(action.aimSpeed) > 100.0D) {
            return safeWait("Clamped invalid action");
         }

         JsonElement secondWebElem = response.get("secondWeb");
         boolean secondWeb = secondWebElem != null && secondWebElem.isJsonPrimitive() && secondWebElem.getAsBoolean();
         SECOND_WEB_CACHE.put(policy, secondWeb);
         return action;
      } catch (Throwable ignored) {
         return safeWait("Local UHC fallback");
      }
   }

   public static boolean secondWeb(HeuristicPolicy policy, Obs observation) {
      if (policy == null) {
         return false;
      }
      Boolean cached = SECOND_WEB_CACHE.get(policy);
      return cached != null && cached;
   }

   private static Action safeWait(String note) {
      Action wait = new Action();
      wait.forward = 0;
      wait.strafe = 0;
      wait.aimSpeed = 12.0D;
      wait.note = note;
      return wait;
   }
}
