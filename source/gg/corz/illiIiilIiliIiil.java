package gg.corz;

public record illiIiilIiliIiil(IiIIilllliIIilll level, iiiiiiIlIIIIIIll reason, String detail, boolean resetState, boolean moveAllowed, boolean quiet) {
   private final boolean iIliIIilil;
   private final boolean llliIIilil;
   private final IiIIilllliIIilll iiIiIIilil;
   private final iiiiiiIlIIIIIIll IIliIIilil;
   private final String lIliIIilil;
   private final boolean IlliIIilil;

   public iiiiiiIlIIIIIIll liiiIIllIl() {
      return this.IIliIIilil;
   }

   public boolean iliIiiliiiii() {
      return this.llliIIilil;
   }

   public IiIIilllliIIilll IliIlllilIi() {
      return this.iiIiIIilil;
   }

   public boolean IilliliilIIi() {
      return this.iIliIIilil;
   }

   public illiIiilIiliIiil(IiIIilllliIIilll resetState, iiiiiiIlIIIIIIll detail, String quiet, boolean moveAllowed, boolean reason, boolean level) {
      this.iiIiIIilil = resetState;
      this.IIliIIilil = detail;
      this.lIliIIilil = quiet;
      this.iIliIIilil = moveAllowed;
      this.IlliIIilil = reason;
      this.llliIIilil = level;
   }

   public String iIlIlllllill() {
      return this.lIliIIilil;
   }

   public boolean lIiiIiIlilli() {
      return this.IlliIIilil;
   }
}
