package gg.corz;

record liIlIliiiIlIli(String name, long firstSeenMs, boolean staff) {
   private final String IiilIIIIIl;
   private final boolean iiilIIIIIl;
   private final long liilIIIIIl;

   private liIlIliiiIlIli(String firstSeenMs, long staff, boolean name) {
      this.IiilIIIIIl = firstSeenMs;
      this.liilIIIIIl = staff;
      this.iiilIIIIIl = name;
   }

   public long liiiIIllIl() {
      return this.liilIIIIIl;
   }

   public boolean iIlIlllllill() {
      return this.iiilIIIIIl;
   }

   public String IliIlllilIi() {
      return this.IiilIIIIIl;
   }
}
