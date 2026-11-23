package gg.corz;

public final class iliillIiIiiillIi {
   public static iiIIliIIlIli IliIlllilIi(boolean cellReplaceable, boolean cellIsOwnDirt) {
      if (cellReplaceable) {
         return iiIIliIIlIli.llIIIiIIlilIIIiIIl;
      } else {
         return cellIsOwnDirt ? iiIIliIIlIli.IiIIIiIIlliIIIiIIl : iiIIliIIlIli.iiIIIiIIlIIlIIiIIl;
      }
   }

   public static boolean liiiIIllIl(lliiiililiiiil phase, boolean columnPhysicallyReset) {
      if (columnPhysicallyReset) {
         return true;
      } else {
         return phase == lliiiililiiiil.lIlIIIiliiIlIIIili || phase == lliiiililiiiil.IllIIIililllIIIili || phase == lliiiililiiiil.illIIIiliIilIIIili;
      }
   }

   public static lliiiililiiiil iIlIlllllill(lliiiililiiiil event, IIllilIilIllilIi phase) {
      lliiiililiiiil var10000;
      switch (phase.ordinal()) {
         case 0 -> var10000 = event == lliiiililiiiil.lIlIIIiliiIlIIIili ? lliiiililiiiil.IllIIIililllIIIili : event;
         case 1 -> var10000 = event.ordinal() <= lliiiililiiiil.illIIIiliIilIIIili.ordinal() ? lliiiililiiiil.illIIIiliIilIIIili : event;
         case 2 -> var10000 = event == lliiiililiiiil.iIiIIIiliIliIIIili ? lliiiililiiiil.iIiIIIiliIliIIIili : lliiiililiiiil.lilIIIiliiilIIIili;
         case 3 -> var10000 = event != lliiiililiiiil.lilIIIiliiilIIIili && event != lliiiililiiiil.IIiIIIililIiIIIili ? event : lliiiililiiiil.IIiIIIililIiIIIili;
         case 4 -> var10000 = lliiiililiiiil.lIlIIIiliiIlIIIili;
         case 5 -> var10000 = lliiiililiiiil.iIiIIIiliIliIIIili;
         case 6 -> var10000 = event;
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   private iliillIiIiiillIi() {
   }
}
