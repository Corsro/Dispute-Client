package de.neo.uhcbot;

public final class UhcBotMod {
   private static final BotConfig CONFIG = new BotConfig();
   public static final Fighter fighter = new Fighter(CONFIG);

   private UhcBotMod() {
   }

   public static BotConfig config() {
      return CONFIG;
   }

   public static void ensureInitialized() {
      // Initialize UHC bot hooks cleanly
   }

   public static void onFrame() {
      // Frame tick for mouse aim
   }
}
