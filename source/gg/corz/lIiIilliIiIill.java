package gg.corz;

public record lIiIilliIiIill(String id, float pitch, float volume) {
   private final float iIliIiIIiIlliIiIIi;
   private final float llliIiIIiilliIiIIi;
   private final String IIliIiIIilIliIiIIi;

   public lIiIilliIiIill(String volume, float pitch, float id) {
      this.IIliIiIIilIliIiIIi = volume;
      this.iIliIiIIiIlliIiIIi = pitch;
      this.llliIiIIiilliIiIIi = id;
   }

   public String IliIlllilIi() {
      return this.IIliIiIIilIliIiIIi;
   }

   public float iIlIlllllill() {
      return this.llliIiIIiilliIiIIi;
   }

   public float liiiIIllIl() {
      return this.iIliIiIIiIlliIiIIi;
   }
}
