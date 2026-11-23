package gg.corz;

public record lliiIiililiiIiil(iIliIiiIlliIii action, IIilliIllIilliIl from, IIilliIllIilliIl to, IIilliIllIilliIl dirtTarget, IIilliIllIilliIl support, String supportFace, boolean jumpPlacement) {
   private final boolean IlIIlIilil;
   private final IIilliIllIilliIl IIIIlIilil;
   private final IIilliIllIilliIl iiiiIIilil;
   private final IIilliIllIilliIl liiiIIilil;
   private final IIilliIllIilliIl lIIIlIilil;
   private final String iIIIlIilil;
   private final iIliIiiIlliIii IiiiIIilil;

   public IIilliIllIilliIl lIiiIiIlilli() {
      return this.lIIIlIilil;
   }

   public IIilliIllIilliIl IilliliilIIi() {
      return this.IIIIlIilil;
   }

   public boolean IIIllIIliIIl() {
      return this.IlIIlIilil;
   }

   public IIilliIllIilliIl liiiIIllIl() {
      return this.liiiIIilil;
   }

   public String iliIiiliiiii() {
      return this.iIIIlIilil;
   }

   public iIliIiiIlliIii IliIlllilIi() {
      return this.IiiiIIilil;
   }

   public lliiIiililiiIiil(iIliIiiIlliIii support, IIilliIllIilliIl to, IIilliIllIilliIl dirtTarget, IIilliIllIilliIl supportFace, IIilliIllIilliIl jumpPlacement, String action, boolean from) {
      this.IiiiIIilil = support;
      this.liiiIIilil = to;
      this.iiiiIIilil = dirtTarget;
      this.IIIIlIilil = supportFace;
      this.lIIIlIilil = jumpPlacement;
      this.iIIIlIilil = action;
      this.IlIIlIilil = from;
   }

   public IIilliIllIilliIl iIlIlllllill() {
      return this.iiiiIIilil;
   }
}
