package gg.corz;

public record IllIIIIllllIIIIl(IIiIiillIiIiil kind, long waitMs) {
   public static final IllIIIIllllIIIIl llIIliIlIl;
   private final IIiIiillIiIiil iIIIliIlIl;
   private final long IlIIliIlIl;

   public IIiIiillIiIiil liiiIIllIl() {
      return this.iIIIliIlIl;
   }

   public IllIIIIllllIIIIl(IIiIiillIiIiil waitMs, long kind) {
      this.iIIIliIlIl = waitMs;
      this.IlIIliIlIl = kind;
   }

   public long iIlIlllllill() {
      return this.IlIIliIlIl;
   }

   static {
      llIIliIlIl = new IllIIIIllllIIIIl(IIiIiillIiIiil.IlIiliIlillIiliIli, -1L);
   }

   static IllIIIIllllIIIIl IliIlllilIi(IIiIiillIiIiil kind) {
      return new IllIIIIllllIIIIl(kind, -1L);
   }
}
