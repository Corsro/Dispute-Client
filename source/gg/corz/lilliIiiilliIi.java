package gg.corz;

public record lilliIiiilliIi(float off, float self, float def, float move, float space, float elev, float haz, float minUseful, float maxSelfOpen) {
   private final float IlIililiillIililii;
   private final float iIilliliiIlillilii;
   private final float illlliliiIilllilii;
   private final float Iiilliliiliillilii;
   private final float IIilliliilIillilii;
   private final float iiilliliiIIIililii;
   private final float llilliliiilillilii;
   private final float lillliliiiilllilii;
   private final float lIIililiiiIIililii;

   public float liiiIIllIl() {
      return this.illlliliiIilllilii;
   }

   public lilliIiiilliIi(float off, float maxSelfOpen, float self, float space, float elev, float move, float minUseful, float def, float haz) {
      this.illlliliiIilllilii = off;
      this.lillliliiiilllilii = maxSelfOpen;
      this.IIilliliilIillilii = self;
      this.iIilliliiIlillilii = space;
      this.llilliliiilillilii = elev;
      this.Iiilliliiliillilii = move;
      this.iiilliliiIIIililii = minUseful;
      this.lIIililiiiIIililii = def;
      this.IlIililiillIililii = haz;
   }

   public float IilliliilIIi() {
      return this.IIilliliilIillilii;
   }

   public float lIiiIiIlilli() {
      return this.iIilliliiIlillilii;
   }

   public float IlIlllIlilIl() {
      return this.iiilliliiIIIililii;
   }

   public float iIlIlllllill() {
      return this.lillliliiiilllilii;
   }

   public float IIlllIlliIll() {
      return this.IlIililiillIililii;
   }

   public float IIIllIIliIIl() {
      return this.Iiilliliiliillilii;
   }

   public static lilliIiiilliIi IliIlllilIi(IiIililiIili p, IlIIIlilllIIIlil s) {
      IiIililiIili var2 = p == null ? IiIililiIili.ilIiiIlIlIiIiiIlIl : p;
      IlIIIlilllIIIlil var3 = s == null ? IlIIIlilllIIIlil.iliIiilIil : s;
      lilliIiiilliIi var10000;
      switch (var2) {
         case IlIiiIlIlllIiiIlIl -> var10000 = new lilliIiiilliIi(1.2F, 0.6F, 0.7F, 0.25F, 0.6F, 0.3F, 2.0F, 3.0F, 14.0F);
         case ilIiiIlIlIiIiiIlIl -> var10000 = new lilliIiiilliIi(1.0F, 0.9F, 1.0F, 0.3F, 0.8F, 0.3F, 2.0F, 4.0F, 11.0F);
         case liIiiIlIliiIiiIlIl -> var10000 = new lilliIiiilliIi(0.7F, 1.3F, 1.6F, 0.35F, 0.6F, 0.4F, 2.5F, 5.0F, 8.0F);
         case IIliiIlIllIliiIlIl -> var10000 = new lilliIiiilliIi(0.0F, 1.5F, 2.0F, 0.2F, 0.0F, 0.2F, 3.0F, 99.0F, 4.0F);
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      lilliIiiilliIi var4 = var10000;
      float var7;
      switch (var3) {
         case iliIiilIil -> var7 = 1.15F;
         case IiiIiilIil -> var7 = 1.0F;
         case liiIiilIil -> var7 = 0.85F;
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      float var5 = var7;
      switch (var3) {
         case iliIiilIil -> var7 = 2.0F;
         case IiiIiilIil -> var7 = 0.0F;
         case liiIiilIil -> var7 = -2.0F;
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      float var6 = var7;
      return new lilliIiiilliIi(var4.illlliliiIilllilii * var5, var4.lillliliiiilllilii, var4.IIilliliilIillilii, var4.iIilliliiIlillilii, var4.llilliliiilillilii, var4.Iiilliliiliillilii, var4.iiilliliiIIIililii, var4.lIIililiiiIIililii, var4.IlIililiillIililii + var6);
   }

   public float iliIiiliiiii() {
      return this.llilliliiilillilii;
   }

   public float IiIlliIliiIl() {
      return this.lIIililiiiIIililii;
   }
}
