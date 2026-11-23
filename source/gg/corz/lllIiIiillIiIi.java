package gg.corz;

public record lllIiIiillIiIi(liiiIIlliiiiIIll kind, String text) {
   private final liiiIIlliiiiIIll IilIilliililIillii;
   public static final lllIiIiillIiIi lIiIilliiiIiIillii;
   private final String iilIilliiIIiIillii;

   public lllIiIiillIiIi(liiiIIlliiiiIIll kind, String text) {
      this.IilIilliililIillii = kind;
      this.iilIilliiIIiIillii = text;
   }

   public liiiIIlliiiiIIll IliIlllilIi() {
      return this.IilIilliililIillii;
   }

   static {
      lIiIilliiiIiIillii = new lllIiIiillIiIi(liiiIIlliiiiIIll.IiIiIlllll, (String)null);
   }

   public String liiiIIllIl() {
      return this.iilIilliiIIiIillii;
   }
}
