package gg.corz;

public record iiIIIlIiIIlIIlIi(boolean maces, boolean smashOnly, double minFall, lIiiilliIiiill preference, boolean stunSlam, boolean axes, boolean swords, boolean swapBack) {
   public static final double lliIiiiiil = (double)1.5F;
   private final boolean illIiiiiil;
   private final double lilIiiiiil;
   private final lIiiilliIiiill iilIiiiiil;
   private final boolean iIiIiiiiil;
   private final boolean IilIiiiiil;
   private final boolean IliIiiiiil;
   private final boolean IIiIiiiiil;
   private final boolean lIiIiiiiil;

   public boolean IIIllIIliIIl() {
      return this.lIiIiiiiil;
   }

   public boolean IiIlliIliiIl() {
      return this.IliIiiiiil;
   }

   public iiIIIlIiIIlIIlIi(boolean stunSlam, boolean preference, double smashOnly, lIiiilliIiiill minFall, boolean swords, boolean maces, boolean swapBack, boolean axes) {
      if (minFall == null) {
         minFall = lIiiilliIiiill.llIilllIiilIilllIi;
      }

      if (!(smashOnly >= (double)1.5F)) {
         smashOnly = (double)1.5F;
      }

      this.illIiiiiil = stunSlam;
      this.IilIiiiiil = preference;
      this.lilIiiiiil = smashOnly;
      this.iilIiiiiil = minFall;
      this.IIiIiiiiil = swords;
      this.lIiIiiiiil = maces;
      this.iIiIiiiiil = swapBack;
      this.IliIiiiiil = axes;
   }

   public double IilliliilIIi() {
      return this.lilIiiiiil;
   }

   public boolean IlIlllIlilIl() {
      return this.iIiIiiiiil;
   }

   public boolean iliIiiliiiii() {
      return this.IIiIiiiiil;
   }

   public lIiiilliIiiill lIiiIiIlilli() {
      return this.iilIiiiiil;
   }

   public static iiIIIlIiIIlIIlIi IliIlllilIi(boolean swapBack) {
      return new iiIIIlIiIIlIIlIi(false, true, (double)1.5F, lIiiilliIiiill.llIilllIiilIilllIi, false, true, false, swapBack);
   }

   public boolean liiiIIllIl() {
      return this.illIiiiiil;
   }

   public boolean iIlIlllllill() {
      return this.IilIiiiiil;
   }
}
