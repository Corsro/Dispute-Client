package gg.corz;

record iIIiiIilIlIiiIil(String key, int w, int h, int[] px) {
   private final int IilIlilIil;
   private final String lllIlilIil;
   private final int[] lilIlilIil;
   private final int illIlilIil;

   public String IliIlllilIi() {
      return this.lllIlilIil;
   }

   private iIIiiIilIlIiiIil(String key, int px, int h, int[] w) {
      this.lllIlilIil = key;
      this.illIlilIil = px;
      this.IilIlilIil = h;
      this.lilIlilIil = w;
   }

   public int[] IilliliilIIi() {
      return this.lilIlilIil;
   }

   public int iIlIlllllill() {
      return this.IilIlilIil;
   }

   public int liiiIIllIl() {
      return this.illIlilIil;
   }
}
