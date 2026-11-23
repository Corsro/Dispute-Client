package gg.corz;

public record liIiIIiiiIiIIi(boolean forward, boolean back, boolean left, boolean right, boolean jump, boolean sneak, boolean sprint) {
   private final boolean ilIliiiliIiIliiili;
   private final boolean lllliiiliillliiili;
   private final boolean Iilliiilililliiili;
   private final boolean liIliiiliiiIliiili;
   private final boolean IIlliiililIlliiili;
   public static final liIiIIiiiIiIIi lIiliiiliiIiliiili = new liIiIIiiiIiIIi(false, false, false, false, false, false, false);
   private final boolean iilliiiliIIiliiili;
   private final boolean iIlliiiliIllliiili;

   public boolean IIIllIIliIIl() {
      return this.iilliiiliIIiliiili;
   }

   public boolean iIlIlllllill() {
      return this.IIlliiililIlliiili;
   }

   public boolean lIiiIiIlilli() {
      return this.lllliiiliillliiili;
   }

   public boolean IilliliilIIi() {
      return this.iIlliiiliIllliiili;
   }

   public boolean IliIlllilIi() {
      return this.ilIliiiliIiIliiili;
   }

   public boolean liiiIIllIl() {
      return this.liIliiiliiiIliiili;
   }

   public liIiIIiiiIiIIi(boolean left, boolean right, boolean sneak, boolean jump, boolean sprint, boolean back, boolean forward) {
      this.ilIliiiliIiIliiili = left;
      this.liIliiiliiiIliiili = right;
      this.IIlliiililIlliiili = sneak;
      this.iIlliiiliIllliiili = jump;
      this.lllliiiliillliiili = sprint;
      this.Iilliiilililliiili = back;
      this.iilliiiliIIiliiili = forward;
   }

   public boolean iliIiiliiiii() {
      return this.Iilliiilililliiili;
   }
}
