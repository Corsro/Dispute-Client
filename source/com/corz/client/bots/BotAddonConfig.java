package com.corz.client.bots;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;
import org.lwjgl.glfw.GLFW;

/**
 * Persistent settings for the clean Android/Mojo bots addon
 * (Mace + SpearMace, Tree Farmer, Auto Ore Miner, and Unified Hub HUD/Hotkeys).
 */
public final class BotAddonConfig {
   public enum LaunchMode {
      AUTO("Auto"),
      ELYTRA("Elytra"),
      WIND_CHARGE("Wind Charge");

      public final String label;
      LaunchMode(String label) { this.label = label; }
      public LaunchMode next() { return values()[(ordinal() + 1) % values().length]; }
   }

   public enum ShieldBreakMode {
      FAST("Fast"),
      SHIELD_ONLY("Shield Only"),
      ALWAYS("Always"),
      OFF("Off");

      public final String label;
      ShieldBreakMode(String label) { this.label = label; }
      public ShieldBreakMode next() { return values()[(ordinal() + 1) % values().length]; }
   }

   public enum SpearMode {
      OFF("Off"),
      LUNGE("Lunge"),
      LUNGE_AND_STAB("Lunge + Stab");

      public final String label;
      SpearMode(String label) { this.label = label; }
      public SpearMode next() { return values()[(ordinal() + 1) % values().length]; }
   }

   private Path file;

   // Hub / HUD
   public boolean showHud = true;
   public int hubKey = GLFW.GLFW_KEY_RIGHT_ALT;
   public int hubAltKey = GLFW.GLFW_KEY_F8;

   // Mace + SpearMace Bot
   public LaunchMode maceLaunch = LaunchMode.AUTO;
   public ShieldBreakMode maceShieldBreak = ShieldBreakMode.FAST;
   public SpearMode maceSpearMode = SpearMode.LUNGE_AND_STAB;
   public int maceDiveHeight = 10;
   public int maceHealBelow = 10;
   public int maceMaxRange = 48;
   public String maceTargetName = "";

   // Tree Farmer Bot
   public int treeRadius = 24;
   public boolean treeReplant = true;
   public boolean treeClearLeaves = true;
   public boolean treeFarFirst = false;

   // Auto Ore Miner Bot
   public int minerRadius = 20;
   public int minerMinY = -64;
   public int minerMaxY = 320;
   public boolean mineDiamond = true;
   public boolean mineDebris = true;
   public boolean mineEmerald = true;
   public boolean mineGold = true;
   public boolean mineIron = true;
   public boolean mineCopper = false;
   public boolean mineRedstone = false;
   public boolean mineLapis = false;
   public boolean mineCoal = false;
   public boolean mineQuartz = false;
   public boolean minerAvoidLava = true;

   public static BotAddonConfig load(Path gameDir) {
      BotAddonConfig cfg = new BotAddonConfig();
      cfg.file = gameDir.resolve("config").resolve("corzbots-addon.properties");
      Properties p = new Properties();
      if (Files.exists(cfg.file)) {
         try (Reader r = Files.newBufferedReader(cfg.file, StandardCharsets.UTF_8)) {
            p.load(r);
         } catch (IOException ignored) {
         }
      }

      cfg.showHud = bool(p, "showHud", cfg.showHud);
      cfg.hubKey = integer(p, "hubKey", cfg.hubKey, 0, 512);
      cfg.hubAltKey = integer(p, "hubAltKey", cfg.hubAltKey, 0, 512);

      cfg.maceLaunch = parseEnum(p.getProperty("maceLaunch"), LaunchMode.class, cfg.maceLaunch);
      cfg.maceShieldBreak = parseEnum(p.getProperty("maceShieldBreak"), ShieldBreakMode.class, cfg.maceShieldBreak);
      cfg.maceSpearMode = parseEnum(p.getProperty("maceSpearMode"), SpearMode.class, cfg.maceSpearMode);
      cfg.maceDiveHeight = integer(p, "maceDiveHeight", cfg.maceDiveHeight, 6, 24);
      cfg.maceHealBelow = integer(p, "maceHealBelow", cfg.maceHealBelow, 0, 20);
      cfg.maceMaxRange = integer(p, "maceMaxRange", cfg.maceMaxRange, 8, 48);
      cfg.maceTargetName = p.getProperty("maceTargetName", "").trim();

      cfg.treeRadius = integer(p, "treeRadius", cfg.treeRadius, 8, 48);
      cfg.treeReplant = bool(p, "treeReplant", cfg.treeReplant);
      cfg.treeClearLeaves = bool(p, "treeClearLeaves", cfg.treeClearLeaves);
      cfg.treeFarFirst = bool(p, "treeFarFirst", cfg.treeFarFirst);

      cfg.minerRadius = integer(p, "minerRadius", cfg.minerRadius, 6, 36);
      cfg.minerMinY = integer(p, "minerMinY", cfg.minerMinY, -64, 320);
      cfg.minerMaxY = integer(p, "minerMaxY", cfg.minerMaxY, -64, 320);
      cfg.mineDiamond = bool(p, "mineDiamond", cfg.mineDiamond);
      cfg.mineDebris = bool(p, "mineDebris", cfg.mineDebris);
      cfg.mineEmerald = bool(p, "mineEmerald", cfg.mineEmerald);
      cfg.mineGold = bool(p, "mineGold", cfg.mineGold);
      cfg.mineIron = bool(p, "mineIron", cfg.mineIron);
      cfg.mineCopper = bool(p, "mineCopper", cfg.mineCopper);
      cfg.mineRedstone = bool(p, "mineRedstone", cfg.mineRedstone);
      cfg.mineLapis = bool(p, "mineLapis", cfg.mineLapis);
      cfg.mineCoal = bool(p, "mineCoal", cfg.mineCoal);
      cfg.mineQuartz = bool(p, "mineQuartz", cfg.mineQuartz);
      cfg.minerAvoidLava = bool(p, "minerAvoidLava", cfg.minerAvoidLava);

      if (!Files.exists(cfg.file)) {
         cfg.save();
      }
      return cfg;
   }

   public void save() {
      if (this.file == null) {
         return;
      }
      StringBuilder sb = new StringBuilder();
      sb.append("# CorzClient Android/Mojo Clean Bots Addon Configuration\n");
      sb.append("showHud=").append(this.showHud).append('\n');
      sb.append("hubKey=").append(this.hubKey).append('\n');
      sb.append("hubAltKey=").append(this.hubAltKey).append('\n');
      sb.append("maceLaunch=").append(this.maceLaunch.name()).append('\n');
      sb.append("maceShieldBreak=").append(this.maceShieldBreak.name()).append('\n');
      sb.append("maceSpearMode=").append(this.maceSpearMode.name()).append('\n');
      sb.append("maceDiveHeight=").append(this.maceDiveHeight).append('\n');
      sb.append("maceHealBelow=").append(this.maceHealBelow).append('\n');
      sb.append("maceMaxRange=").append(this.maceMaxRange).append('\n');
      sb.append("maceTargetName=").append(this.maceTargetName).append('\n');
      sb.append("treeRadius=").append(this.treeRadius).append('\n');
      sb.append("treeReplant=").append(this.treeReplant).append('\n');
      sb.append("treeClearLeaves=").append(this.treeClearLeaves).append('\n');
      sb.append("treeFarFirst=").append(this.treeFarFirst).append('\n');
      sb.append("minerRadius=").append(this.minerRadius).append('\n');
      sb.append("minerMinY=").append(this.minerMinY).append('\n');
      sb.append("minerMaxY=").append(this.minerMaxY).append('\n');
      sb.append("mineDiamond=").append(this.mineDiamond).append('\n');
      sb.append("mineDebris=").append(this.mineDebris).append('\n');
      sb.append("mineEmerald=").append(this.mineEmerald).append('\n');
      sb.append("mineGold=").append(this.mineGold).append('\n');
      sb.append("mineIron=").append(this.mineIron).append('\n');
      sb.append("mineCopper=").append(this.mineCopper).append('\n');
      sb.append("mineRedstone=").append(this.mineRedstone).append('\n');
      sb.append("mineLapis=").append(this.mineLapis).append('\n');
      sb.append("mineCoal=").append(this.mineCoal).append('\n');
      sb.append("mineQuartz=").append(this.mineQuartz).append('\n');
      sb.append("minerAvoidLava=").append(this.minerAvoidLava).append('\n');
      try {
         Files.createDirectories(this.file.getParent());
         Files.writeString(this.file, sb.toString(), StandardCharsets.UTF_8);
      } catch (IOException ignored) {
      }
   }

   private static boolean bool(Properties p, String k, boolean def) {
      String v = p.getProperty(k);
      return v == null ? def : Boolean.parseBoolean(v.trim());
   }

   private static int integer(Properties p, String k, int def, int min, int max) {
      String v = p.getProperty(k);
      if (v == null) {
         return def;
      }
      try {
         int parsed = Integer.parseInt(v.trim());
         return Math.max(min, Math.min(max, parsed));
      } catch (NumberFormatException ignored) {
         return def;
      }
   }

   private static <E extends Enum<E>> E parseEnum(String val, Class<E> cls, E def) {
      if (val == null || val.isBlank()) {
         return def;
      }
      try {
         return Enum.valueOf(cls, val.trim().toUpperCase());
      } catch (IllegalArgumentException ignored) {
         return def;
      }
   }
}
