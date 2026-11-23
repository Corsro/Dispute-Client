package gg.corz;

public final class lIIlliiiIIllii {
   private static final double IilIIliIIl = 0.8;
   private static final double illIIliIIl = 0.4;

   public static IiIllIilliIllIil IliIlllilIi(double explosionKnockbackResistance) {
      if (explosionKnockbackResistance < 0.4) {
         return IiIllIilliIllIil.IiIilIlIil;
      } else {
         return explosionKnockbackResistance < 0.8 ? IiIllIilliIllIil.liIilIlIil : IiIllIilliIllIil.iiIilIlIil;
      }
   }

   private lIIlliiiIIllii() {
   }

   public static double liiiIIllIl(IiIllIilliIllIil l) {
      if (l == null) {
         return (double)0.0F;
      } else {
         double var10000;
         switch (l.ordinal()) {
            case 0 -> var10000 = (double)1.0F;
            case 1 -> var10000 = (double)0.25F;
            case 2 -> var10000 = (double)0.0F;
            default -> throw new MatchException((String)null, (Throwable)null);
         }

         return var10000;
      }
   }
}
