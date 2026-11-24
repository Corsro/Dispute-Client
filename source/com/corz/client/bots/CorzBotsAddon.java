package com.corz.client.bots;

import com.corz.client.android.MojoInputBridge;
import corzbot.CorzBot;
import de.neo.uhcbot.UhcBotMod;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.class_1041;
import net.minecraft.class_2561;
import net.minecraft.class_310;

/**
 * Clean Fabric ClientModInitializer unifying all 5 missing 2.0.3 bots on top of
 * the 2.0.1 Android ARM64 / Mojo Launcher QVM port:
 *  1) SMP PvP Bot (corzbot + LocalCompute.combat CloudTuning)
 *  2) UHC PvP Bot (de.neo.uhcbot + LocalCombat offline policy)
 *  3) Mace PvP + SpearMace Bot (LocalCombat mace/spear FSM)
 *  4) Tree Farmer Bot (LocalCompute.tree)
 *  5) Auto Ore Miner Bot (LocalCompute.miner)
 */
public final class CorzBotsAddon implements ClientModInitializer {
   private static BotAddonConfig config;
   private static boolean initialized;
   private static boolean hubKeyWasDown;

   public static BotAddonConfig config() {
      if (config == null) {
         class_310 mc = class_310.method_1551();
         config = BotAddonConfig.load(mc.field_1697.toPath());
      }
      return config;
   }

   @Override
   public void onInitializeClient() {
      if (initialized) {
         return;
      }
      initialized = true;

      config();
      CorzBot.ensureInitialized();
      UhcBotMod.ensureInitialized();

      ClientTickEvents.END_CLIENT_TICK.register(this::onClientTick);
      HudRenderCallback.EVENT.register((drawContext, tickCounter) -> CorzBotsHud.render(drawContext, tickCounter));
   }

   private void onClientTick(class_310 mc) {
      if (mc == null) {
         return;
      }
      BotAddonConfig cfg = config();

      if (mc.field_1755 == null && mc.field_1724 != null) {
         class_1041 win = mc.method_22683();
         boolean down = (cfg.hubKey > 0 && MojoInputBridge.isKeyDown(win, cfg.hubKey))
            || (cfg.hubAltKey > 0 && MojoInputBridge.isKeyDown(win, cfg.hubAltKey));
         if (down && !hubKeyWasDown) {
            mc.method_1507(new CorzBotsScreen());
         }
         hubKeyWasDown = down;
      } else {
         hubKeyWasDown = false;
      }

      MaceSpearBot.INSTANCE.onTick(mc, cfg);
      TreeFarmerBot.INSTANCE.onTick(mc, cfg);
      AutoOreMinerBot.INSTANCE.onTick(mc, cfg);
   }

   public static void stopAllBots() {
      BotAddonConfig cfg = config();
      if (CorzBot.BOT != null) {
         CorzBot.BOT.setEnabled(false);
      }
      if (UhcBotMod.fighter != null && UhcBotMod.fighter.enabled) {
         UhcBotMod.fighter.toggle();
      }
      MaceSpearBot.INSTANCE.setEnabled(false, cfg);
      TreeFarmerBot.INSTANCE.setEnabled(false, cfg);
      AutoOreMinerBot.INSTANCE.setEnabled(false, cfg);
   }

   public static boolean handleCommand(String raw) {
      if (raw == null) {
         return false;
      }
      String trimmed = raw.trim();
      String lower = trimmed.toLowerCase();
      if (!(lower.equals(".bots") || lower.startsWith(".bots ") || lower.equals("/corzbots") || lower.startsWith("/corzbots ")
         || lower.equals(".dispute") || lower.startsWith(".dispute ") || lower.equals("/dispute") || lower.startsWith("/dispute ")
         || lower.equals("dispute") || lower.startsWith("dispute ") || lower.equals("corzbots") || lower.startsWith("corzbots "))) {
         return false;
      }

      String[] parts = trimmed.split("\\s+");
      String sub = parts.length >= 2 ? parts[1].toLowerCase() : "menu";
      class_310 mc = class_310.method_1551();
      BotAddonConfig cfg = config();

      mc.execute(() -> {
         switch (sub) {
            case "smp":
               if (CorzBot.BOT != null) {
                  boolean next = !CorzBot.BOT.isEnabled();
                  CorzBot.BOT.setEnabled(next);
                  msg(mc, "SMP PvP Bot: " + (next ? "ON" : "OFF"));
               }
               break;
            case "uhc":
               if (UhcBotMod.fighter != null) {
                  UhcBotMod.fighter.toggle();
                  msg(mc, "UHC PvP Bot: " + (UhcBotMod.fighter.enabled ? "ON" : "OFF"));
               }
               break;
            case "mace":
            case "spear":
               MaceSpearBot.INSTANCE.setEnabled(!MaceSpearBot.INSTANCE.isEnabled(), cfg);
               msg(mc, "Mace + SpearMace Bot: " + (MaceSpearBot.INSTANCE.isEnabled() ? "ON" : "OFF"));
               break;
            case "tree":
               TreeFarmerBot.INSTANCE.setEnabled(!TreeFarmerBot.INSTANCE.isEnabled(), cfg);
               msg(mc, "Tree Farmer Bot: " + (TreeFarmerBot.INSTANCE.isEnabled() ? "ON" : "OFF"));
               break;
            case "mine":
            case "miner":
               AutoOreMinerBot.INSTANCE.setEnabled(!AutoOreMinerBot.INSTANCE.isEnabled(), cfg);
               msg(mc, "Auto Ore Miner Bot: " + (AutoOreMinerBot.INSTANCE.isEnabled() ? "ON" : "OFF"));
               break;
            case "stop":
            case "off":
               stopAllBots();
               msg(mc, "Stopped all bots.");
               break;
            case "help":
               msg(mc, ".dispute [menu|smp|uhc|mace|tree|miner|stop]");
               break;
            case "menu":
            default:
               mc.method_1507(new CorzBotsScreen());
               break;
         }
      });
      return true;
   }

   private static void msg(class_310 mc, String text) {
      if (mc != null && mc.field_1724 != null) {
         mc.field_1724.method_7353(class_2561.method_43470("[Dispute] " + text), false);
      }
   }
}
