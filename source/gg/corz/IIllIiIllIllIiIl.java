package gg.corz;

public record IIllIiIllIllIiIl(boolean forward, boolean jump, boolean sprint, boolean sneak) {
   private final boolean IIllIliIll;
   public static final IIllIiIllIllIiIl IlllIliIll = new IIllIiIllIllIiIl(false, false, false, false);
   private final boolean lIllIliIll;
   private final boolean iiIlIliIll;
   private final boolean iIllIliIll;

   public boolean IliIlllilIi() {
      return this.iiIlIliIll;
   }

   public boolean IilliliilIIi() {
      return this.iIllIliIll;
   }

   public boolean iIlIlllllill() {
      return this.lIllIliIll;
   }

   public IIllIiIllIllIiIl(boolean sneak, boolean forward, boolean sprint, boolean jump) {
      this.iiIlIliIll = sneak;
      this.IIllIliIll = forward;
      this.lIllIliIll = sprint;
      this.iIllIliIll = jump;
   }

   public boolean liiiIIllIl() {
      return this.IIllIliIll;
   }
}
