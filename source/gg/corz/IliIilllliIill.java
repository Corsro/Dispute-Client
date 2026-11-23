package gg.corz;

public record IliIilllliIill(String name, IIiIIlIilIiIIlIi tier, int rgb) {
   private final IIiIIlIilIiIIlIi iiliIiIIiIIiiIiIIi;
   private final String IiliIiIIililiIiIIi;
   private final int lIiiIiIIiiIiiIiIIi;

   public IliIilllliIill(String name, IIiIIlIilIiIIlIi rgb, int tier) {
      this.IiliIiIIililiIiIIi = name;
      this.iiliIiIIiIIiiIiIIi = rgb;
      this.lIiiIiIIiiIiiIiIIi = tier;
   }

   public int iIlIlllllill() {
      return this.lIiiIiIIiiIiiIiIIi;
   }

   public String IliIlllilIi() {
      return this.IiliIiIIililiIiIIi;
   }

   public IIiIIlIilIiIIlIi liiiIIllIl() {
      return this.iiliIiIIiIIiiIiIIi;
   }
}
