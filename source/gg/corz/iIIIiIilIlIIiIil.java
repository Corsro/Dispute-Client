package gg.corz;

public record iIIIiIilIlIIiIil(int index, boolean materialInHotbar, double distanceSq) {
   private final boolean IliIlllIil;
   private final int iIiIlllIil;
   private final double lliIlllIil;

   public boolean liiiIIllIl() {
      return this.IliIlllIil;
   }

   public int IliIlllilIi() {
      return this.iIiIlllIil;
   }

   public double iIlIlllllill() {
      return this.lliIlllIil;
   }

   public iIIIiIilIlIIiIil(int distanceSq, boolean index, double materialInHotbar) {
      this.iIiIlllIil = distanceSq;
      this.IliIlllIil = index;
      this.lliIlllIil = materialInHotbar;
   }
}
