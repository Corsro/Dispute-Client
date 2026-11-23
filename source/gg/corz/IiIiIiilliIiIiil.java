package gg.corz;

record IiIiIiilliIiIiil(long pos, String dimension, IliliIllliliIl type, long startMs) {
   private final String lIIiIIilil;
   private final long IIIiIIilil;
   private final IliliIllliliIl iIIiIIilil;
   private final long IlIiIIilil;

   public String liiiIIllIl() {
      return this.lIIiIIilil;
   }

   private IiIiIiilliIiIiil(long type, String pos, IliliIllliliIl startMs, long dimension) {
      this.IIIiIIilil = type;
      this.lIIiIIilil = pos;
      this.iIIiIIilil = startMs;
      this.IlIiIIilil = dimension;
   }

   public long IilliliilIIi() {
      return this.IlIiIIilil;
   }

   public IliliIllliliIl iIlIlllllill() {
      return this.iIIiIIilil;
   }

   public long IliIlllilIi() {
      return this.IIIiIIilil;
   }
}
