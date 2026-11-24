package com.corz.client.bots;

import corzbot.CorzBot;
import de.neo.uhcbot.UhcBotMod;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_9779;

/**
 * Compact top-right HUD overlay listing any active added bots without interfering
 * with CorzBot's top-left card or CorzClient ClickGUI.
 */
public final class CorzBotsHud {
   private CorzBotsHud() {
   }

   public static void render(class_332 g, class_9779 tickCounter) {
      class_310 mc = class_310.method_1551();
      if (mc == null || mc.field_1724 == null || mc.field_1690.field_1842 || mc.field_1755 instanceof CorzBotsScreen) {
         return;
      }
      if (!CorzBotsAddon.config().showHud) {
         return;
      }

      List<String> lines = new ArrayList<>(5);
      if (CorzBot.BOT != null && CorzBot.BOT.isEnabled()) {
         lines.add("SMP PvP: " + (CorzBot.BOT.doing != null ? CorzBot.BOT.doing : "Active"));
      }
      if (UhcBotMod.fighter != null && UhcBotMod.fighter.enabled) {
         lines.add("UHC PvP: " + UhcBotMod.fighter.status());
      }
      if (MaceSpearBot.INSTANCE.isEnabled()) {
         lines.add("Mace/Spear: " + MaceSpearBot.INSTANCE.status());
      }
      if (TreeFarmerBot.INSTANCE.isEnabled()) {
         lines.add("Tree Farm: " + TreeFarmerBot.INSTANCE.status());
      }
      if (AutoOreMinerBot.INSTANCE.isEnabled()) {
         lines.add("Ore Miner: " + AutoOreMinerBot.INSTANCE.status());
      }

      if (lines.isEmpty()) {
         return;
      }

      class_327 font = mc.field_1772;
      int maxW = 0;
      for (String l : lines) {
         maxW = Math.max(maxW, font.method_1727(l));
      }
      int boxW = maxW + 12;
      int boxH = 8 + lines.size() * 11;
      int screenW = mc.method_22683().method_4486();
      int x = Math.max(6, screenW - boxW - 6);
      int y = 6;

      g.method_25294(x, y, x + boxW, y + boxH, 0xA811131A);
      for (int i = 0; i < lines.size(); i++) {
         g.method_51433(font, lines.get(i), x + 6, y + 5 + i * 11, 0xFFEAF2FF, true);
      }
   }
}
