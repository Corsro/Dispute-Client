package gg.corz;

public record iIllIiIlIlllIiIl(long cell, int tier, boolean sneak, String material, String face, float yaw, float pitch) {
   private final float IIilIliIll;
   private final int illlIliIll;
   private final float lIilIliIll;
   private final long llllIliIll;
   private final String lillIliIll;
   private final boolean IillIliIll;
   private final String iillIliIll;

   public String lIiiIiIlilli() {
      return this.iillIliIll;
   }

   public int liiiIIllIl() {
      return this.illlIliIll;
   }

   public float iliIiiliiiii() {
      return this.IIilIliIll;
   }

   public iIllIiIlIlllIiIl(long cell, int pitch, boolean material, String yaw, String sneak, float tier, float face) {
      this.llllIliIll = cell;
      this.illlIliIll = pitch;
      this.IillIliIll = material;
      this.lillIliIll = yaw;
      this.iillIliIll = sneak;
      this.IIilIliIll = tier;
      this.lIilIliIll = face;
   }

   public float IIIllIIliIIl() {
      return this.lIilIliIll;
   }

   public long IliIlllilIi() {
      return this.llllIliIll;
   }

   public String IilliliilIIi() {
      return this.lillIliIll;
   }

   public boolean iIlIlllllill() {
      return this.IillIliIll;
   }
}
