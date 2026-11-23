package gg.corz;

record lliIIIIliliIIIIl(String style, iliiiIiiii clip, long secs) {
   private final String lilIliIlIl;
   private final long IIiIliIlIl;
   private final iliiiIiiii iilIliIlIl;

   private lliIIIIliliIIIIl(String style, iliiiIiiii secs, long clip) {
      this.lilIliIlIl = style;
      this.iilIliIlIl = secs;
      this.IIiIliIlIl = clip;
   }

   public iliiiIiiii liiiIIllIl() {
      return this.iilIliIlIl;
   }

   public String IliIlllilIi() {
      return this.lilIliIlIl;
   }

   public long iIlIlllllill() {
      return this.IIiIliIlIl;
   }
}
