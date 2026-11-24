package de.neo.uhcbot;

public final class Fighter {
   public volatile boolean enabled;
   public final HeuristicPolicy policy;

   public Fighter(BotConfig config) {
      this.policy = new HeuristicPolicy(config);
   }

   public void toggle() {
      this.enabled = !this.enabled;
   }

   public String status() {
      return this.enabled ? "Active" : "Off";
   }
}
