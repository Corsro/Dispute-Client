package gg.corz;

public record lIIilllliIIillll(String id, String name, boolean present) {
   private final String iIIIliIill;
   private final String IlIIliIill;
   private final boolean llIIliIill;

   public String liiiIIllIl() {
      return this.IlIIliIill;
   }

   public lIIilllliIIillll(String name, String id, boolean present) {
      this.iIIIliIill = name;
      this.IlIIliIill = id;
      this.llIIliIill = present;
   }

   public String IliIlllilIi() {
      return this.iIIIliIill;
   }

   public boolean iIlIlllllill() {
      return this.llIIliIill;
   }
}
