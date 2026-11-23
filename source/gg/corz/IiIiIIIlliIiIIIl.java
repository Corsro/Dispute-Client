package gg.corz;

record IiIiIIIlliIiIIIl(int id, int x, int y, IilIIIlllilIIIll kind, int count, int hash) {
   private final IilIIIlllilIIIll IiiliIllIl;
   private final int iiiliIllIl;
   private final int liiliIllIl;
   private final int IliliIllIl;
   private final int lliliIllIl;
   private final int ililiIllIl;

   public int liiiIIllIl() {
      return this.lliliIllIl;
   }

   public int iIlIlllllill() {
      return this.ililiIllIl;
   }

   public IilIIIlllilIIIll IilliliilIIi() {
      return this.IiiliIllIl;
   }

   public int lIiiIiIlilli() {
      return this.liiliIllIl;
   }

   IiIiIIIlliIiIIIl(int kind, int hash, int id, IilIIIlllilIIIll x, int y, int count) {
      this.IliliIllIl = kind;
      this.lliliIllIl = hash;
      this.ililiIllIl = id;
      this.IiiliIllIl = x;
      this.liiliIllIl = y;
      this.iiiliIllIl = count;
   }

   public int IliIlllilIi() {
      return this.IliliIllIl;
   }

   public int iliIiiliiiii() {
      return this.iiiliIllIl;
   }
}
