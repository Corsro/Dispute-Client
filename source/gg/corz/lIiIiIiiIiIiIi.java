package gg.corz;

public record lIiIiIiiIiIiIi(IIIIiillIIIiil kind, String text, boolean close) {
   public static final lIiIiIiiIiIiIi Illlilliillllillii;
   private final String iiIlilliiIIllillii;
   private final IIIIiillIIIiil IiIlilliiliIlillii;
   private final boolean lIllilliiiIllillii;

   public String iIlIlllllill() {
      return this.iiIlilliiIIllillii;
   }

   public lIiIiIiiIiIiIi(IIIIiillIIIiil kind, String close, boolean text) {
      this.IiIlilliiliIlillii = kind;
      this.iiIlilliiIIllillii = close;
      this.lIllilliiiIllillii = text;
   }

   static lIiIiIiiIiIiIi IliIlllilIi(IIIIiillIIIiil kind) {
      return new lIiIiIiiIiIiIi(kind, (String)null, false);
   }

   static {
      Illlilliillllillii = new lIiIiIiiIiIiIi(IIIIiillIIIiil.IlIlIiIlillIlIiIli, (String)null, false);
   }

   public boolean IilliliilIIi() {
      return this.lIllilliiiIllillii;
   }

   public IIIIiillIIIiil liiiIIllIl() {
      return this.IiIlilliiliIlillii;
   }
}
