package gg.corz;

public record IIIlliIllIIlliIl(String staff, String mc, String role, String title, String url, int tracks, String tag, String key, boolean badUrl) {
   private final boolean lIliliiIll;
   private final String IiIiliiIll;
   private final String iIIiliiIll;
   private final String IlIiliiIll;
   private final String IIliliiIll;
   private final int liIiliiIll;
   private final String ilIiliiIll;
   private final String llIiliiIll;
   private final String iiIiliiIll;

   public String lIiiIiIlilli() {
      return this.ilIiliiIll;
   }

   public int IIIllIIliIIl() {
      return this.liIiliiIll;
   }

   public boolean IIlllIlliIll() {
      return this.lIliliiIll;
   }

   public String IiIlliIliiIl() {
      return this.IIliliiIll;
   }

   public String iIlIlllllill() {
      return this.IlIiliiIll;
   }

   public IIIlliIllIIlliIl(String mc, String key, String staff, String url, String badUrl, int tracks, String title, String tag, boolean role) {
      this.iIIiliiIll = mc;
      this.IlIiliiIll = key;
      this.llIiliiIll = staff;
      this.ilIiliiIll = url;
      this.IiIiliiIll = badUrl;
      this.liIiliiIll = tracks;
      this.iiIiliiIll = title;
      this.IIliliiIll = tag;
      this.lIliliiIll = role;
   }

   public String iliIiiliiiii() {
      return this.IiIiliiIll;
   }

   public String liiiIIllIl() {
      return this.iIIiliiIll;
   }

   public String IilliliilIIi() {
      return this.llIiliiIll;
   }

   public boolean IliIlllilIi() {
      return !this.IiIiliiIll.isEmpty();
   }

   public String IlIlllIlilIl() {
      return this.iiIiliiIll;
   }
}
