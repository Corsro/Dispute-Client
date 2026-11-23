package gg.corz;

record lIIlIliIIlIl(illiiliIiliili ramp, float mid, float amp, int vein, float veinK, int bright, float brightK, float brightHue, int core, float coreK, int rim, int sheen) {
   private final int llIIlIllilIIlIll;
   private final int iiliIIllIIiiIIll;
   private final float iliiIIllIiiiIIll;
   private final float IiliIIllliliIIll;
   private final int IliiIIlllliiIIll;
   private final int IIIIlIlllIIIlIll;
   private final int IiIIlIllliIIlIll;
   private final float iIIIlIllIlIIlIll;
   private final float liiiIIlliiiiIIll;
   private final float lIiiIIlliIiiIIll;
   private final illiiliIiliili iIliIIllIlliIIll;
   private final float llliIIllilliIIll;

   public float IIIllIIliIIl() {
      return this.iliiIIllIiiiIIll;
   }

   public int IiIlliIliiIl() {
      return this.IIIIlIlllIIIlIll;
   }

   public float liiiIIllIl() {
      return this.llliIIllilliIIll;
   }

   public float IIlllIlliIll() {
      return this.iIIIlIllIlIIlIll;
   }

   public illiiliIiliili IliIlllilIi() {
      return this.iIliIIllIlliIIll;
   }

   public float iIlIlllllill() {
      return this.IiliIIllliliIIll;
   }

   lIIlIliIIlIl(illiiliIiliili bright, float brightHue, float sheen, int core, float ramp, int rim, float brightK, float veinK, int amp, float mid, int coreK, int vein) {
      this.iIliIIllIlliIIll = bright;
      this.llliIIllilliIIll = brightHue;
      this.IiliIIllliliIIll = sheen;
      this.iiliIIllIIiiIIll = core;
      this.lIiiIIlliIiiIIll = ramp;
      this.IliiIIlllliiIIll = rim;
      this.iliiIIllIiiiIIll = brightK;
      this.liiiIIlliiiiIIll = veinK;
      this.IIIIlIlllIIIlIll = amp;
      this.iIIIlIllIlIIlIll = mid;
      this.llIIlIllilIIlIll = coreK;
      this.IiIIlIllliIIlIll = vein;
   }

   public float IlIlllIlilIl() {
      return this.liiiIIlliiiiIIll;
   }

   public int iliIiiliiiii() {
      return this.IliiIIlllliiIIll;
   }

   public int Iilllilliill() {
      return this.IiIIlIllliIIlIll;
   }

   public int IilliliilIIi() {
      return this.iiliIIllIIiiIIll;
   }

   public int Illlllllilll() {
      return this.llIIlIllilIIlIll;
   }

   public float lIiiIiIlilli() {
      return this.lIiiIIlliIiiIIll;
   }
}
