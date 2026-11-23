package gg.corz;

public record iIiiIlllIliiIlll(String title, String place, String line, boolean good) {
   private final String IlIlllIill;
   private final String iIIlllIill;
   private final String llIlllIill;
   private final boolean ilIlllIill;

   public String iIlIlllllill() {
      return this.llIlllIill;
   }

   public String liiiIIllIl() {
      return this.IlIlllIill;
   }

   public iIiiIlllIliiIlll(String place, String line, String title, boolean good) {
      this.iIIlllIill = place;
      this.IlIlllIill = line;
      this.llIlllIill = title;
      this.ilIlllIill = good;
   }

   public boolean IilliliilIIi() {
      return this.ilIlllIill;
   }

   public String IliIlllilIi() {
      return this.iIIlllIill;
   }
}
