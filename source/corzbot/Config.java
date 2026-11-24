package corzbot;

public final class Config {
   public boolean hud = true;
   public Reaction reaction = Reaction.NORMAL;
   public Mode mode = Mode.SMP;

   public enum Reaction {
      FAST("Fast"),
      NORMAL("Normal"),
      LEGIT("Legit");

      public final String label;

      Reaction(String label) {
         this.label = label;
      }
   }

   public enum Mode {
      SMP("SMP"),
      DUELS("Duels"),
      CRYSTAL("Crystal");

      public final String label;

      Mode(String label) {
         this.label = label;
      }
   }
}
