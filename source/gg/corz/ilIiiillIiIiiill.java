package gg.corz;

public final class ilIiiillIiIiiill {
   public static IlillIIillillIIi liiiIIllIl(IIiIliilIiIlii bot) {
      if (bot == null) {
         return IlillIIillillIIi.lIiIIIiiil;
      } else {
         try {
            IlillIIillillIIi var1 = bot.liIlliiIll();
            return var1 != null ? var1 : IlillIIillillIIi.lIiIIIiiil;
         } catch (RuntimeException var2) {
            return IlillIIillillIIi.lIiIIIiiil;
         }
      }
   }

   private ilIiiillIiIiiill() {
   }

   public static IlillIIillillIIi IliIlllilIi(ilIllIiIll m) {
      IlillIIillillIIi var10000;
      if (m instanceof IIiIliilIiIlii var1) {
         var10000 = liiiIIllIl(var1);
      } else {
         var10000 = null;
      }

      return var10000;
   }
}
