package gg.corz;

record IlIiillIii(String key, lillIIlliillIIll kind, String label, String desc, IilliIllilliIl setting, String haystack) {
   private final lillIIlliillIIll iiilIlIlIIIiIlIl;
   private final String lIIiIlIliIIiIlIl;
   private final String IiilIlIlliilIlIl;
   private final String IlIiIlIlllIiIlIl;
   private final String liIiIlIliiIiIlIl;
   private final IilliIllilliIl ilIiIlIlIiIiIlIl;

   public lillIIlliillIIll liiiIIllIl() {
      return this.iiilIlIlIIIiIlIl;
   }

   public String IliIlllilIi() {
      return this.IiilIlIlliilIlIl;
   }

   public String iIlIlllllill() {
      return this.lIIiIlIliIIiIlIl;
   }

   private IlIiillIii(String label, lillIIlliillIIll kind, String haystack, String key, IilliIllilliIl desc, String setting) {
      this.IiilIlIlliilIlIl = label;
      this.iiilIlIlIIIiIlIl = kind;
      this.lIIiIlIliIIiIlIl = haystack;
      this.IlIiIlIlllIiIlIl = key;
      this.ilIiIlIlIiIiIlIl = desc;
      this.liIiIlIliiIiIlIl = setting;
   }

   public String iliIiiliiiii() {
      return this.liIiIlIliiIiIlIl;
   }

   public IilliIllilliIl lIiiIiIlilli() {
      return this.ilIiIlIlIiIiIlIl;
   }

   public String IilliliilIIi() {
      return this.IlIiIlIlllIiIlIl;
   }
}
