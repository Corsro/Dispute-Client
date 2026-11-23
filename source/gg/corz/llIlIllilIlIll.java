package gg.corz;

public record llIlIllilIlIll(lllIlIliillIlIli kind, String text) {
   public static final llIlIllilIlIll iIllIiIilIlllIiIil;
   private final String liIlIiIiliiIlIiIil;
   public static final llIlIllilIlIll IIllIiIillIllIiIil;
   private final lllIlIliillIlIli ilIlIiIilIiIlIiIil;

   public String liiiIIllIl() {
      return this.liIlIiIiliiIlIiIil;
   }

   public lllIlIliillIlIli IliIlllilIi() {
      return this.ilIlIiIilIiIlIiIil;
   }

   static {
      IIllIiIillIllIiIil = new llIlIllilIlIll(lllIlIliillIlIli.iiliiiIlIi, (String)null);
      iIllIiIilIlllIiIil = new llIlIllilIlIll(lllIlIliillIlIli.lIiiiiIlIi, (String)null);
   }

   public llIlIllilIlIll(lllIlIliillIlIli text, String kind) {
      this.ilIlIiIilIiIlIiIil = text;
      this.liIlIiIiliiIlIiIil = kind;
   }
}
