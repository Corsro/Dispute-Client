package gg.corz;

public record IiIlIlIlliIlIlIl(boolean loaded, boolean active, int total, int placed, int activeLayer, String section, int blocked) {
   private final boolean lIiIliilIl;
   private final int liiIliilIl;
   private final String IiiIliilIl;
   private final int IliIliilIl;
   private final boolean iIiIliilIl;
   private final int lliIliilIl;
   private final int iliIliilIl;

   public int liiiIIllIl() {
      return Math.round(this.IliIlllilIi() * 100.0F);
   }

   public boolean lIiiIiIlilli() {
      return this.iIiIliilIl;
   }

   public IiIlIlIlliIlIlIl(boolean active, boolean activeLayer, int section, int total, int loaded, String blocked, int placed) {
      this.lIiIliilIl = active;
      this.iIiIliilIl = activeLayer;
      this.IliIliilIl = section;
      this.lliIliilIl = total;
      this.iliIliilIl = loaded;
      this.IiiIliilIl = blocked;
      this.liiIliilIl = placed;
   }

   public int iliIiiliiiii() {
      return this.IliIliilIl;
   }

   public int IlIlllIlilIl() {
      return this.iliIliilIl;
   }

   public boolean iIlIlllllill() {
      return this.lIiIliilIl && this.iIiIliilIl && this.IliIliilIl > 0;
   }

   public boolean IilliliilIIi() {
      return this.lIiIliilIl;
   }

   public int IIlllIlliIll() {
      return this.liiIliilIl;
   }

   public int IIIllIIliIIl() {
      return this.lliIliilIl;
   }

   public String IiIlliIliiIl() {
      return this.IiiIliilIl;
   }

   public float IliIlllilIi() {
      return this.IliIliilIl <= 0 ? 0.0F : (float)this.lliIliilIl / (float)this.IliIliilIl;
   }
}
