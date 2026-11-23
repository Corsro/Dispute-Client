package gg.corz;

public record iIlIIiiIllIIii(float time, ilIIIIIiIiIIIIIi kind, float speed) {
   private final float IlillllIIl;
   private final ilIIIIIiIiIIIIIi llillllIIl;
   private final float ilillllIIl;

   public float IliIlllilIi() {
      return this.IlillllIIl;
   }

   public iIlIIiiIllIIii(float speed, ilIIIIIiIiIIIIIi time, float kind) {
      this.IlillllIIl = speed;
      this.llillllIIl = time;
      this.ilillllIIl = kind;
   }

   public float iIlIlllllill() {
      return this.ilillllIIl;
   }

   public ilIIIIIiIiIIIIIi liiiIIllIl() {
      return this.llillllIIl;
   }
}
