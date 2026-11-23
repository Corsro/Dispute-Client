package gg.corz;

public final class IiIiilIiliIiilIi {
   public static boolean liiiIIllIl(boolean tempActive, boolean confirming, boolean falling, boolean anyScreenOpen, boolean grounded, boolean placing, boolean cleanupActive) {
      return tempActive && !confirming && !falling && !anyScreenOpen && !grounded && !placing && !cleanupActive;
   }

   public static iIIliiIlIlii IliIlllilIi(IIIliiilIIliii in, lililiiilili p) {
      iIIliiIlIlii var10000;
      switch (in.ordinal()) {
         case 0:
            var10000 = iIIliiIlIlii.IliIlllilIi(IIIliiilIIliii.iIIiliiIIl);
            break;
         case 1:
            var10000 = p.iIlIlllllill() ? iIIliiIlIlii.liiiIIllIl(iiiIliiIIIllii.iIlIIliIIl) : (p.IliIlllilIi() ? iIIliiIlIlii.IliIlllilIi(IIIliiilIIliii.IlIiliiIIl) : iIIliiIlIlii.IliIlllilIi(IIIliiilIIliii.iIIiliiIIl));
            break;
         case 2:
            var10000 = iIIliiIlIlii.IliIlllilIi(IIIliiilIIliii.llIiliiIIl);
            break;
         case 3:
            var10000 = p.iIlIlllllill() ? iIIliiIlIlii.liiiIIllIl(iiiIliiIIIllii.IllIIliIIl) : (p.liiiIIllIl() ? iIIliiIlIlii.IliIlllilIi(IIIliiilIIliii.ilIiliiIIl) : iIIliiIlIlii.IliIlllilIi(IIIliiilIIliii.llIiliiIIl));
            break;
         case 4:
         case 5:
            var10000 = iIIliiIlIlii.IliIlllilIi(in);
            break;
         default:
            throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   private IiIiilIiliIiilIi() {
   }
}
