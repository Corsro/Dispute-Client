package com.corz.client.bots;

import corzbot.CorzBot;
import de.neo.uhcbot.UhcBotMod;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_4185;
import net.minecraft.class_437;

/**
 * Touch-friendly Master Bot Control Hub for Android Mojo Launcher & PC.
 * Gives single-tap toggles, settings, and sub-menus for:
 *  - SMP PvP Bot (corzbot)
 *  - UHC PvP Bot (de.neo.uhcbot)
 *  - Mace PvP + SpearMace Bot (LocalCombat)
 *  - Tree Farmer Bot (LocalCompute.tree)
 *  - Auto Ore Miner Bot (LocalCompute.miner)
 */
public final class CorzBotsScreen extends class_437 {
   private int tab = 0; // 0=All Bots, 1=Mace+SpearMace, 2=Tree Farmer, 3=Auto Ore Miner

   public CorzBotsScreen() {
      super(class_2561.method_43470("Dispute Bots Hub"));
   }

   public CorzBotsScreen(int initialTab) {
      this();
      this.tab = Math.max(0, Math.min(3, initialTab));
   }

   protected void method_25426() {
      int panelW = Math.min(360, this.field_22789 - 12);
      int left = (this.field_22789 - panelW) / 2;
      int tabW = (panelW - 12) / 4;
      int topY = 26;

      String[] tabs = new String[]{"Overview", "Mace/Spear", "Tree Farm", "Ore Miner"};
      for (int i = 0; i < tabs.length; i++) {
         final int idx = i;
         String label = (this.tab == idx ? "§e" : "§7") + tabs[idx];
         this.method_37063(
            class_4185.method_46430(class_2561.method_43470(label), (b) -> {
               this.tab = idx;
               this.method_41843();
            }).method_46434(left + idx * (tabW + 4), topY, tabW, 20).method_46431()
         );
      }

      int y = topY + 26;
      switch (this.tab) {
         case 1 -> buildMaceTab(left, panelW, y);
         case 2 -> buildTreeTab(left, panelW, y);
         case 3 -> buildMinerTab(left, panelW, y);
         default -> buildOverviewTab(left, panelW, y);
      }

      int bottomY = Math.min(this.field_22790 - 26, y + 148);
      int halfW = (panelW - 6) / 2;
      this.method_37063(
         class_4185.method_46430(class_2561.method_43470("§cStop All Bots"), (b) -> {
            CorzBotsAddon.stopAllBots();
            this.method_41843();
         }).method_46434(left, bottomY, halfW, 20).method_46431()
      );
      this.method_37063(
         class_4185.method_46430(class_2561.method_43470("Save & Close"), (b) -> this.method_25419())
            .method_46434(left + halfW + 6, bottomY, halfW, 20).method_46431()
      );
   }

   private void buildOverviewTab(int left, int panelW, int y) {
      int mainW = panelW - 76;
      int cfgW = 72;
      int cfgX = left + mainW + 4;

      // 1. SMP PvP Bot
      this.method_37063(
         class_4185.method_46430(smpLabel(), (b) -> {
            if (CorzBot.BOT != null) {
               CorzBot.BOT.setEnabled(!CorzBot.BOT.isEnabled());
            }
            b.method_25355(smpLabel());
         }).method_46434(left, y, mainW, 20).method_46431()
      );
      this.method_37063(
         class_4185.method_46430(class_2561.method_43470("Config"), (b) -> {
            class_310.method_1551().method_1507(new corzbot.gui.BotScreen());
         }).method_46434(cfgX, y, cfgW, 20).method_46431()
      );
      y += 23;

      // 2. UHC PvP Bot
      this.method_37063(
         class_4185.method_46430(uhcLabel(), (b) -> {
            if (UhcBotMod.fighter != null) {
               UhcBotMod.fighter.toggle();
            }
            b.method_25355(uhcLabel());
         }).method_46434(left, y, mainW, 20).method_46431()
      );
      this.method_37063(
         class_4185.method_46430(class_2561.method_43470("Config"), (b) -> {
            if (UhcBotMod.config() != null && UhcBotMod.fighter != null) {
               class_310.method_1551().method_1507(new de.neo.uhcbot.BotScreen(UhcBotMod.config(), UhcBotMod.fighter));
            }
         }).method_46434(cfgX, y, cfgW, 20).method_46431()
      );
      y += 23;

      // 3. Mace + SpearMace Bot
      this.method_37063(
         class_4185.method_46430(maceLabel(), (b) -> {
            MaceSpearBot.INSTANCE.setEnabled(!MaceSpearBot.INSTANCE.isEnabled(), CorzBotsAddon.config());
            b.method_25355(maceLabel());
         }).method_46434(left, y, mainW, 20).method_46431()
      );
      this.method_37063(
         class_4185.method_46430(class_2561.method_43470("Settings"), (b) -> {
            this.tab = 1;
            this.method_41843();
         }).method_46434(cfgX, y, cfgW, 20).method_46431()
      );
      y += 23;

      // 4. Tree Farmer Bot
      this.method_37063(
         class_4185.method_46430(treeLabel(), (b) -> {
            TreeFarmerBot.INSTANCE.setEnabled(!TreeFarmerBot.INSTANCE.isEnabled(), CorzBotsAddon.config());
            b.method_25355(treeLabel());
         }).method_46434(left, y, mainW, 20).method_46431()
      );
      this.method_37063(
         class_4185.method_46430(class_2561.method_43470("Settings"), (b) -> {
            this.tab = 2;
            this.method_41843();
         }).method_46434(cfgX, y, cfgW, 20).method_46431()
      );
      y += 23;

      // 5. Auto Ore Miner Bot
      this.method_37063(
         class_4185.method_46430(minerLabel(), (b) -> {
            AutoOreMinerBot.INSTANCE.setEnabled(!AutoOreMinerBot.INSTANCE.isEnabled(), CorzBotsAddon.config());
            b.method_25355(minerLabel());
         }).method_46434(left, y, mainW, 20).method_46431()
      );
      this.method_37063(
         class_4185.method_46430(class_2561.method_43470("Settings"), (b) -> {
            this.tab = 3;
            this.method_41843();
         }).method_46434(cfgX, y, cfgW, 20).method_46431()
      );
      y += 23;

      // HUD badge toggle
      BotAddonConfig cfg = CorzBotsAddon.config();
      this.method_37063(
         class_4185.method_46430(class_2561.method_43470("Bot Hub HUD: " + (cfg.showHud ? "§aON" : "§cOFF")), (b) -> {
            cfg.showHud = !cfg.showHud;
            b.method_25355(class_2561.method_43470("Bot Hub HUD: " + (cfg.showHud ? "§aON" : "§cOFF")));
         }).method_46434(left, y, panelW, 20).method_46431()
      );
   }

   private void buildMaceTab(int left, int panelW, int y) {
      BotAddonConfig cfg = CorzBotsAddon.config();
      int halfW = (panelW - 4) / 2;

      this.method_37063(
         class_4185.method_46430(maceLabel(), (b) -> {
            MaceSpearBot.INSTANCE.setEnabled(!MaceSpearBot.INSTANCE.isEnabled(), cfg);
            b.method_25355(maceLabel());
         }).method_46434(left, y, panelW, 20).method_46431()
      );
      y += 23;

      this.method_37063(
         class_4185.method_46430(class_2561.method_43470("SpearMace: §e" + cfg.maceSpearMode.label), (b) -> {
            cfg.maceSpearMode = cfg.maceSpearMode.next();
            b.method_25355(class_2561.method_43470("SpearMace: §e" + cfg.maceSpearMode.label));
         }).method_46434(left, y, halfW, 20).method_46431()
      );
      this.method_37063(
         class_4185.method_46430(class_2561.method_43470("Launch: §e" + cfg.maceLaunch.label), (b) -> {
            cfg.maceLaunch = cfg.maceLaunch.next();
            b.method_25355(class_2561.method_43470("Launch: §e" + cfg.maceLaunch.label));
         }).method_46434(left + halfW + 4, y, halfW, 20).method_46431()
      );
      y += 23;

      this.method_37063(
         class_4185.method_46430(class_2561.method_43470("Shield Break: §e" + cfg.maceShieldBreak.label), (b) -> {
            cfg.maceShieldBreak = cfg.maceShieldBreak.next();
            b.method_25355(class_2561.method_43470("Shield Break: §e" + cfg.maceShieldBreak.label));
         }).method_46434(left, y, halfW, 20).method_46431()
      );
      this.method_37063(
         class_4185.method_46430(class_2561.method_43470("Dive Height: §e" + cfg.maceDiveHeight + "m"), (b) -> {
            cfg.maceDiveHeight = cfg.maceDiveHeight >= 24 ? 6 : cfg.maceDiveHeight + 2;
            b.method_25355(class_2561.method_43470("Dive Height: §e" + cfg.maceDiveHeight + "m"));
         }).method_46434(left + halfW + 4, y, halfW, 20).method_46431()
      );
      y += 23;

      this.method_37063(
         class_4185.method_46430(class_2561.method_43470("Heal Below: §e" + cfg.maceHealBelow + " HP"), (b) -> {
            cfg.maceHealBelow = cfg.maceHealBelow >= 18 ? 4 : cfg.maceHealBelow + 2;
            b.method_25355(class_2561.method_43470("Heal Below: §e" + cfg.maceHealBelow + " HP"));
         }).method_46434(left, y, halfW, 20).method_46431()
      );
      this.method_37063(
         class_4185.method_46430(class_2561.method_43470("Max Range: §e" + cfg.maceMaxRange + "m"), (b) -> {
            cfg.maceMaxRange = cfg.maceMaxRange >= 48 ? 12 : cfg.maceMaxRange + 6;
            b.method_25355(class_2561.method_43470("Max Range: §e" + cfg.maceMaxRange + "m"));
         }).method_46434(left + halfW + 4, y, halfW, 20).method_46431()
      );
   }

   private void buildTreeTab(int left, int panelW, int y) {
      BotAddonConfig cfg = CorzBotsAddon.config();
      int halfW = (panelW - 4) / 2;

      this.method_37063(
         class_4185.method_46430(treeLabel(), (b) -> {
            TreeFarmerBot.INSTANCE.setEnabled(!TreeFarmerBot.INSTANCE.isEnabled(), cfg);
            b.method_25355(treeLabel());
         }).method_46434(left, y, panelW, 20).method_46431()
      );
      y += 23;

      this.method_37063(
         class_4185.method_46430(class_2561.method_43470("Scan Radius: §e" + cfg.treeRadius + "m"), (b) -> {
            cfg.treeRadius = cfg.treeRadius >= 48 ? 12 : cfg.treeRadius + 6;
            b.method_25355(class_2561.method_43470("Scan Radius: §e" + cfg.treeRadius + "m"));
         }).method_46434(left, y, halfW, 20).method_46431()
      );
      this.method_37063(
         class_4185.method_46430(class_2561.method_43470("Auto Replant: " + (cfg.treeReplant ? "§aON" : "§cOFF")), (b) -> {
            cfg.treeReplant = !cfg.treeReplant;
            b.method_25355(class_2561.method_43470("Auto Replant: " + (cfg.treeReplant ? "§aON" : "§cOFF")));
         }).method_46434(left + halfW + 4, y, halfW, 20).method_46431()
      );
      y += 23;

      this.method_37063(
         class_4185.method_46430(class_2561.method_43470("Clear Leaves: " + (cfg.treeClearLeaves ? "§aON" : "§cOFF")), (b) -> {
            cfg.treeClearLeaves = !cfg.treeClearLeaves;
            b.method_25355(class_2561.method_43470("Clear Leaves: " + (cfg.treeClearLeaves ? "§aON" : "§cOFF")));
         }).method_46434(left, y, halfW, 20).method_46431()
      );
      this.method_37063(
         class_4185.method_46430(class_2561.method_43470("Order: §e" + (cfg.treeFarFirst ? "Far First" : "Nearest")), (b) -> {
            cfg.treeFarFirst = !cfg.treeFarFirst;
            b.method_25355(class_2561.method_43470("Order: §e" + (cfg.treeFarFirst ? "Far First" : "Nearest")));
         }).method_46434(left + halfW + 4, y, halfW, 20).method_46431()
      );
   }

   private void buildMinerTab(int left, int panelW, int y) {
      BotAddonConfig cfg = CorzBotsAddon.config();
      int thirdW = (panelW - 8) / 3;
      int halfW = (panelW - 4) / 2;

      this.method_37063(
         class_4185.method_46430(minerLabel(), (b) -> {
            AutoOreMinerBot.INSTANCE.setEnabled(!AutoOreMinerBot.INSTANCE.isEnabled(), cfg);
            b.method_25355(minerLabel());
         }).method_46434(left, y, panelW, 20).method_46431()
      );
      y += 23;

      this.method_37063(
         class_4185.method_46430(class_2561.method_43470("Radius: §e" + cfg.minerRadius + "m"), (b) -> {
            cfg.minerRadius = cfg.minerRadius >= 36 ? 8 : cfg.minerRadius + 4;
            b.method_25355(class_2561.method_43470("Radius: §e" + cfg.minerRadius + "m"));
         }).method_46434(left, y, halfW, 20).method_46431()
      );
      this.method_37063(
         class_4185.method_46430(class_2561.method_43470("Lava Safety: " + (cfg.minerAvoidLava ? "§aON" : "§cOFF")), (b) -> {
            cfg.minerAvoidLava = !cfg.minerAvoidLava;
            b.method_25355(class_2561.method_43470("Lava Safety: " + (cfg.minerAvoidLava ? "§aON" : "§cOFF")));
         }).method_46434(left + halfW + 4, y, halfW, 20).method_46431()
      );
      y += 23;

      addOreToggle(left, y, thirdW, "Diamond", () -> cfg.mineDiamond, (v) -> cfg.mineDiamond = v);
      addOreToggle(left + thirdW + 4, y, thirdW, "Debris", () -> cfg.mineDebris, (v) -> cfg.mineDebris = v);
      addOreToggle(left + (thirdW + 4) * 2, y, thirdW, "Emerald", () -> cfg.mineEmerald, (v) -> cfg.mineEmerald = v);
      y += 23;

      addOreToggle(left, y, thirdW, "Gold", () -> cfg.mineGold, (v) -> cfg.mineGold = v);
      addOreToggle(left + thirdW + 4, y, thirdW, "Iron", () -> cfg.mineIron, (v) -> cfg.mineIron = v);
      addOreToggle(left + (thirdW + 4) * 2, y, thirdW, "Copper", () -> cfg.mineCopper, (v) -> cfg.mineCopper = v);
      y += 23;

      addOreToggle(left, y, thirdW, "Redstone", () -> cfg.mineRedstone, (v) -> cfg.mineRedstone = v);
      addOreToggle(left + thirdW + 4, y, thirdW, "Lapis", () -> cfg.mineLapis, (v) -> cfg.mineLapis = v);
      addOreToggle(left + (thirdW + 4) * 2, y, thirdW, "Coal", () -> cfg.mineCoal, (v) -> cfg.mineCoal = v);
   }

   private void addOreToggle(
      int x,
      int y,
      int w,
      String name,
      java.util.function.BooleanSupplier get,
      java.util.function.Consumer<Boolean> set
   ) {
      this.method_37063(
         class_4185.method_46430(
            class_2561.method_43470(name + ": " + (get.getAsBoolean() ? "§aON" : "§cOFF")),
            (b) -> {
               boolean next = !get.getAsBoolean();
               set.accept(next);
               b.method_25355(class_2561.method_43470(name + ": " + (next ? "§aON" : "§cOFF")));
            }
         ).method_46434(x, y, w, 20).method_46431()
      );
   }

   private static class_2561 smpLabel() {
      boolean on = CorzBot.BOT != null && CorzBot.BOT.isEnabled();
      return class_2561.method_43470("SMP PvP Bot: " + (on ? "§aON" : "§cOFF"));
   }

   private static class_2561 uhcLabel() {
      boolean on = UhcBotMod.fighter != null && UhcBotMod.fighter.enabled;
      return class_2561.method_43470("UHC PvP Bot: " + (on ? "§aON" : "§cOFF"));
   }

   private static class_2561 maceLabel() {
      boolean on = MaceSpearBot.INSTANCE.isEnabled();
      return class_2561.method_43470("Mace + SpearMace: " + (on ? "§aON" : "§cOFF"));
   }

   private static class_2561 treeLabel() {
      boolean on = TreeFarmerBot.INSTANCE.isEnabled();
      return class_2561.method_43470("Tree Farmer Bot: " + (on ? "§aON" : "§cOFF"));
   }

   private static class_2561 minerLabel() {
      boolean on = AutoOreMinerBot.INSTANCE.isEnabled();
      return class_2561.method_43470("Auto Ore Miner: " + (on ? "§aON" : "§cOFF"));
   }

   public void method_25394(class_332 g, int mouseX, int mouseY, float partialTick) {
      super.method_25394(g, mouseX, mouseY, partialTick);
      g.method_25300(this.field_22793, "Dispute Bots Hub (Mojo Touch + Offline Solvers)", this.field_22789 / 2, 8, 0xFFFFFFFF);
      g.method_25300(this.field_22793, "Hotkeys: Right-Alt / F8 or chat .dispute / .bots | ClickGUI: Right-Shift", this.field_22789 / 2, this.field_22790 - 12, 0xFFAAAAAA);
   }

   public void method_25419() {
      CorzBotsAddon.config().save();
      super.method_25419();
   }

   public boolean method_25421() {
      return false;
   }
}
