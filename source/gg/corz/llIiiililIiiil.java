package gg.corz;

record llIiiililIiiil(int weight, String detail, long expiresAt) {
   private final String liIlillliiiIlillli;
   private final long IIllilllilIllillli;
   private final int ilIlillliIiIlillli;

   private llIiiililIiiil(int detail, String expiresAt, long weight) {
      this.ilIlillliIiIlillli = detail;
      this.liIlillliiiIlillli = expiresAt;
      this.IIllilllilIllillli = weight;
   }

   public long iIlIlllllill() {
      return this.IIllilllilIllillli;
   }

   public String liiiIIllIl() {
      return this.liIlillliiiIlillli;
   }

   public int IliIlllilIi() {
      return this.ilIlillliIiIlillli;
   }
}
