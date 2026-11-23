package gg.corz;

public record iIIIIIliIlIIIIli(float p, String sound, float volume, float pitch) {
   private final float IiIiiIIlIi;
   private final float IIliiIIlIi;
   private final String liIiiIIlIi;
   private final float iiIiiIIlIi;

   public String liiiIIllIl() {
      return this.liIiiIIlIi;
   }

   public float IilliliilIIi() {
      return this.IIliiIIlIi;
   }

   public iIIIIIliIlIIIIli(float p, String pitch, float volume, float sound) {
      this.IiIiiIIlIi = p;
      this.liIiiIIlIi = pitch;
      this.iiIiiIIlIi = volume;
      this.IIliiIIlIi = sound;
   }

   public float iIlIlllllill() {
      return this.iiIiiIIlIi;
   }

   public float IliIlllilIi() {
      return this.IiIiiIIlIi;
   }
}
