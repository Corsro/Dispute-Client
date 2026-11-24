package de.neo.uhcbot;

public final class HeuristicPolicy {
   public final BotConfig p;

   public HeuristicPolicy(BotConfig config) {
      this.p = (config != null) ? config : new BotConfig();
   }

   public static class Obs {
      public double distance;
      public float health;
      public float targetHealth;
      public boolean targetShield;
      public boolean inWater;
      public boolean onGround;
   }

   public static class Action {
      public float forward;
      public float strafe;
      public double aimSpeed;
      public boolean jump;
      public boolean sprint;
      public boolean attack;
      public boolean useItem;
   }
}
