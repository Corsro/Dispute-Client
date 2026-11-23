package gg.corz;

public record lllIllIiillIllIi(iillIlIiIIilIlIi verdict, int componentBefore, int componentAfter) {
   private final int IllIIiIIIi;
   private final iillIlIiIIilIlIi lIlIIiIIIi;
   private final int iIlIIiIIIi;

   public lllIllIiillIllIi(iillIlIiIIilIlIi componentBefore, int componentAfter, int verdict) {
      this.lIlIIiIIIi = componentBefore;
      this.iIlIIiIIIi = componentAfter;
      this.IllIIiIIIi = verdict;
   }

   public boolean liiiIIllIl() {
      return this.lIlIIiIIIi == iillIlIiIIilIlIi.ilIiIIIIIi;
   }

   public boolean IliIlllilIi() {
      return this.lIlIIiIIIi == iillIlIiIIilIlIi.IlIiIIIIIi;
   }

   public int IilliliilIIi() {
      return this.iIlIIiIIIi;
   }

   public int lIiiIiIlilli() {
      return this.IllIIiIIIi;
   }

   public iillIlIiIIilIlIi iIlIlllllill() {
      return this.lIlIIiIIIi;
   }
}
