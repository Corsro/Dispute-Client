package gg.corz;

public record llllIlllilllIlll(String text, int rgb, String font) {
   private final int liiIiIIill;
   private final String iiiIiIIill;
   private final String IiiIiIIill;

   public String liiiIIllIl() {
      return this.IiiIiIIill;
   }

   public llllIlllilllIlll(String rgb, int text, String font) {
      if (rgb == null) {
         rgb = "";
      }

      this.IiiIiIIill = rgb;
      this.liiIiIIill = text;
      this.iiiIiIIill = font;
   }

   public static llllIlllilllIlll IliIlllilIi(String rgb, int text) {
      return new llllIlllilllIlll(rgb, text, (String)null);
   }

   public String IilliliilIIi() {
      return this.iiiIiIIill;
   }

   public int iIlIlllllill() {
      return this.liiIiIIill;
   }
}
