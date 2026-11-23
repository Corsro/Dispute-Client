package gg.corz;

public record iillliiIIillii(int expanded, int budget, boolean success, boolean budgetExhausted, int openRemaining, int distance) {
   private final boolean iillIliIIl;
   private final int IillIliIIl;
   private final boolean IIilIliIIl;
   private final int lIilIliIIl;
   private final int iIilIliIIl;
   private final int lillIliIIl;

   public int IliIlllilIi() {
      return this.IillIliIIl;
   }

   public int iliIiiliiiii() {
      return this.iIilIliIIl;
   }

   public iillliiIIillii(int budget, int success, boolean budgetExhausted, boolean openRemaining, int distance, int expanded) {
      this.IillIliIIl = budget;
      this.lillIliIIl = success;
      this.iillIliIIl = budgetExhausted;
      this.IIilIliIIl = openRemaining;
      this.lIilIliIIl = distance;
      this.iIilIliIIl = expanded;
   }

   public boolean IilliliilIIi() {
      return this.IIilIliIIl;
   }

   public boolean iIlIlllllill() {
      return this.iillIliIIl;
   }

   public int lIiiIiIlilli() {
      return this.lIilIliIIl;
   }

   public int liiiIIllIl() {
      return this.lillIliIIl;
   }
}
