package gg.corz;

public record IlIlilillIlili(llliIIIiilliIIIi mode, IiilIlIlliilIlIl interiorClarity, Iiiliiiliiliii layerMode, float ghostOpacity, float missingOpacity, float wrongBlockOpacity, float wrongStateOpacity, float occludedOpacity, float interiorFadeRadius, boolean renderCorrect, boolean renderMissing, boolean renderIncorrect, boolean missingThroughWalls, boolean outlines, float outlineWidth, float outlineOpacity, int renderDistance, int rebuildBudget, int playerY, boolean showBox, boolean showOrigin, boolean textured, int correctColor, int missingColor, int wrongBlockColor, int wrongStateColor, int extraColor, IIliIiilIliIii style, boolean litematicaTranslucent) {
   private final float liIiiiIIIl;
   private final int iiliiiIIIl;
   private final int liiiiiIIIl;
   private final int IiiiiiIIIl;
   private final boolean IlliiiIIIl;
   private final boolean iIliiiIIIl;
   private final IiilIlIlliilIlIl lIIiiiIIIl;
   private final boolean iIiiiiIIIl;
   private final int iiiiiiIIIl;
   private final int iliiiiIIIl;
   private final Iiiliiiliiliii iIIiiiIIIl;
   private final float IiliiiIIIl;
   private final IIliIiilIliIii IIIIIIlIIl;
   private final boolean lIiiiiIIIl;
   private final float illiiiIIIl;
   private final int liliiiIIIl;
   private final float IlIiiiIIIl;
   private final float llIiiiIIIl;
   private final float iiIiiiIIIl;
   private final boolean lIIIIIlIIl;
   private final int IIiiiiIIIl;
   private final int lliiiiIIIl;
   private final float ilIiiiIIIl;
   private final boolean lIliiiIIIl;
   private final float IiIiiiIIIl;
   private final boolean IIliiiIIIl;
   private final boolean IliiiiIIIl;
   private final boolean llliiiIIIl;
   private final llliIIIiilliIIIi IIIiiiIIIl;

   static float Iiilliiliiil(float edge0, float edge1, float x) {
      if (edge1 <= edge0) {
         return x < edge0 ? 0.0F : 1.0F;
      } else {
         float var3 = Math.max(0.0F, Math.min(1.0F, (x - edge0) / (edge1 - edge0)));
         return var3 * var3 * (3.0F - 2.0F * var3);
      }
   }

   public float IIIIllIIIl() {
      return this.IiIiiiIIIl;
   }

   public IiilIlIlliilIlIl Illillliilli() {
      return this.lIIiiiIIIl;
   }

   public boolean liiiIIllIl() {
      return this.IIIIIIlIIl == IIliIiilIliIii.lIIIlIiIIl;
   }

   public int iIlllIllll() {
      return this.iiiiiiIIIl;
   }

   public float IIillIiliIil() {
      IiilIlIlliilIlIl var1 = this.IIlllIlliIll();
      if (var1 == IiilIlIlliilIlIl.iiIIIIIiIl) {
         return 1.0F;
      } else {
         return var1 == IiilIlIlliilIlIl.lIlIIIIiIl ? 0.0F : 0.01F;
      }
   }

   public float iIIIlIlIIl() {
      return this.liIiiiIIIl;
   }

   public float lilIliilIl() {
      return this.illiiiIIIl;
   }

   public long IliIlllilIi() {
      long var1 = (long)this.IIIiiiIIIl.ordinal();
      var1 = var1 * 31L + (long)this.IIIIIIlIIl.ordinal();
      var1 = var1 * 31L + (long)this.iIIiiiIIIl.ordinal();
      var1 = var1 * 31L + (long)(this.IIliiiIIIl ? 1 : 0);
      var1 = var1 * 31L + (long)(this.lIliiiIIIl ? 1 : 0);
      var1 = var1 * 31L + (long)(this.iIliiiIIIl ? 1 : 0);
      var1 = var1 * 31L + (long)(this.llliiiIIIl ? 1 : 0);
      var1 = var1 * 31L + (long)(this.IliiiiIIIl ? 1 : 0);
      var1 = var1 * 31L + (long)Math.round(this.llIiiiIIIl * 50.0F);
      var1 = var1 * 31L + (long)Math.round(this.ilIiiiIIIl * 50.0F);
      var1 = var1 * 31L + (long)Math.round(this.IiIiiiIIIl * 50.0F);
      var1 = var1 * 31L + (long)Math.round(this.illiiiIIIl * 4.0F);
      var1 = var1 * 31L + (long)Math.round(this.IiliiiIIIl * 50.0F);
      var1 = var1 * 31L + (long)(this.lIIiiiIIIl == IiilIlIlliilIlIl.iIlIIIIiIl ? 1 : 0);
      if (this.iIIiiiIIIl != Iiiliiiliiliii.iIIlllIlIl || this.lIIiiiIIIl == IiilIlIlliilIlIl.iIlIIIIiIl) {
         var1 = var1 * 31L + (long)this.IIiiiiIIIl;
      }

      return var1;
   }

   public boolean IiIIlliIIl() {
      return this.IIliiiIIIl;
   }

   public float Ililllililil(float densityScale, float dist) {
      if (this.IIlllIlliIll() == IiilIlIlliilIlIl.iiIIIIIiIl) {
         return 1.0F;
      } else {
         float var3 = this.Illlllllilll(dist);
         float var4 = this.Iilllilliill(dist);
         float var5 = Iiilliiliiil(var3, var4, densityScale);
         return this.IIillIiliIil() + (1.0F - this.IIillIiliIil()) * var5;
      }
   }

   public boolean illIlIilIl() {
      return this.llliiiIIIl;
   }

   public float IIiilIiiiIii() {
      return this.IlIiiiIIIl;
   }

   public float Iilllilliill(float densityScale) {
      return this.IIlllIlliIll() == IiilIlIlliilIlIl.iiIIIIIiIl ? 0.0F : Math.max(0.5F, this.iiIiiiIIIl) * densityScale;
   }

   public float llIIlilIIl() {
      return this.iiIiiiIIIl;
   }

   public float IlIlllIlilIl() {
      return this.liiiIIllIl() ? 1.0F : this.IiliiiIIIl;
   }

   public float Iiiiliiiiiii() {
      return this.ilIiiiIIIl;
   }

   public int ilIllIiIll() {
      return this.iliiiiIIIl;
   }

   private IiilIlIlliilIlIl IIlllIlliIll() {
      return this.liiiIIllIl() ? IiilIlIlliilIlIl.iiIIIIIiIl : this.lIIiiiIIIl;
   }

   public float IiIlliIliiIl() {
      if (!this.liiiIIllIl()) {
         return this.illiiiIIIl;
      } else {
         return this.IlliiiIIIl ? 3.0F : 1.0F;
      }
   }

   public float IIIllIIliIIl(IIlIlIllIlIlIl cls, boolean ghostDrawn) {
      if (this.liiiIIllIl()) {
         return IililIllililIl.liiiIIllIl(cls);
      } else if (cls == IIlIlIllIlIlIl.lllIIIIllillIIIIll && ghostDrawn) {
         return 0.0F;
      } else {
         return cls == IIlIlIllIlIlIl.iIlIIIIllIllIIIIll ? 0.0F : this.lIiiIiIlilli(cls);
      }
   }

   private int IiIiliIiiiIi() {
      long var2 = -8792142579211459646L;
      var2 ^= ((long)this.iIIiiiIIIl.IliIlllilIi() << 32 ^ var2) & -1L << 32;
      if (this.lIIiiiIIIl == IiilIlIlliilIlIl.iIlIIIIiIl && (int)(var2 >>> 32) < 0) {
         var2 ^= (4294967296L ^ var2) & -1L << 32;
      }

      return (int)(var2 >>> 32);
   }

   public int IIiIllIiIl() {
      return this.liliiiIIIl;
   }

   public int IIllllIlll() {
      return this.liiiiiIIIl;
   }

   public boolean iiiIlIIIll() {
      return this.iIiiiiIIIl;
   }

   public int liIlliiIll() {
      return this.IiiiiiIIIl;
   }

   public boolean iIlIlllllill(IIlIlIllIlIlIl cls) {
      if (this.IliiiiIIIl && this.IIIiiiIIIl != llliIIIiilliIIIi.IiiiiIliil && this.IIIiiiIIIl != llliIIIiilliIIIi.liiiiIliil) {
         if (this.liiiIIllIl()) {
            return cls == IIlIlIllIlIlIl.lllIIIIllillIIIIll && this.lIliiiIIIl && this.IIIiiiIIIl != llliIIIiilliIIIi.lliiiIliil;
         } else {
            boolean var10000;
            switch (cls) {
               case lllIIIIllillIIIIll:
                  var10000 = this.lIliiiIIIl && this.IIIiiiIIIl != llliIIIiilliIIIi.lliiiIliil;
                  break;
               case IilIIIIlllilIIIIll:
               case iilIIIIllIIiIIIIll:
                  var10000 = this.iIliiiIIIl && this.IIIiiiIIIl != llliIIIiilliIIIi.iIiiiIliil;
                  break;
               case iIlIIIIllIllIIIIll:
                  var10000 = this.IIliiiIIIl && this.IIIiiiIIIl == llliIIIiilliIIIi.lIiiiIliil;
                  break;
               case lIiIIIIlliIiIIIIll:
               case IliIIIIlllliIIIIll:
                  var10000 = false;
                  break;
               default:
                  throw new MatchException((String)null, (Throwable)null);
            }

            return var10000;
         }
      } else {
         return false;
      }
   }

   public boolean iiIIlIIlIl() {
      return this.lIliiiIIIl;
   }

   public Iiiliiiliiliii Iilililiiili() {
      return this.iIIiiiIIIl;
   }

   public llliIIIiilliIIIi IIlilIliiIli() {
      return this.IIIiiiIIIl;
   }

   public boolean IlIillIiilIi(int sectionMinY) {
      long var3 = 2961883210343031180L;
      var3 ^= ((long)this.IiIiliIiiiIi() << 32 ^ var3) & -1L << 32;
      if ((int)(var3 >>> 32) < 0) {
         return true;
      } else {
         return sectionMinY <= this.IIiiiiIIIl + (int)(var3 >>> 32) && sectionMinY + 15 >= this.IIiiiiIIIl - (int)(var3 >>> 32);
      }
   }

   public IIliIiilIliIii lllllillll() {
      return this.IIIIIIlIIl;
   }

   public boolean IilliliilIIi(IIlIlIllIlIlIl cls) {
      if (this.IIIiiiIIIl != llliIIIiilliIIIi.liiiiIliil && this.IIIiiiIIIl != llliIIIiilliIIIi.iliiiIliil) {
         if (this.liiiIIllIl() && cls == IIlIlIllIlIlIl.iIlIIIIllIllIIIIll) {
            return false;
         } else {
            boolean var10000;
            switch (cls) {
               case lllIIIIllillIIIIll:
                  var10000 = this.lIliiiIIIl && this.IIIiiiIIIl != llliIIIiilliIIIi.lliiiIliil;
                  break;
               case IilIIIIlllilIIIIll:
               case iilIIIIllIIiIIIIll:
               case lIiIIIIlliIiIIIIll:
                  var10000 = this.iIliiiIIIl && this.IIIiiiIIIl != llliIIIiilliIIIi.iIiiiIliil;
                  break;
               case iIlIIIIllIllIIIIll:
                  var10000 = this.IIliiiIIIl && this.IIIiiiIIIl == llliIIIiilliIIIi.lIiiiIliil;
                  break;
               case IliIIIIlllliIIIIll:
                  var10000 = false;
                  break;
               default:
                  throw new MatchException((String)null, (Throwable)null);
            }

            return var10000;
         }
      } else {
         return false;
      }
   }

   public int iIiIlIliIl() {
      return this.iiliiiIIIl;
   }

   public boolean lIlIliIlIl() {
      return this.iIliiiIIIl;
   }

   public int lliIliliIl() {
      return this.IIiiiiIIIl;
   }

   public float Iliilliiilii() {
      return this.llIiiiIIIl;
   }

   public boolean IiiIlliiIl() {
      return this.lIiiiiIIIl;
   }

   public boolean lIIlliIIll() {
      return this.IliiiiIIIl;
   }

   public float Illlllllilll(float densityScale) {
      IiilIlIlliilIlIl var2 = this.IIlllIlliIll();
      if (var2 == IiilIlIlliilIlIl.iiIIIIIiIl) {
         return 0.0F;
      } else {
         float var3 = Math.max(0.5F, this.iiIiiiIIIl) * densityScale;
         return var3 * (var2 == IiilIlIlliilIlIl.lIlIIIIiIl ? 0.55F : 0.3F);
      }
   }

   public float iliIiiliiiii(IIlIlIllIlIlIl cls) {
      return this.IIIllIIliIIl(cls, this.iIlIlllllill(cls));
   }

   public float lIiiIiIlilli(IIlIlIllIlIlIl cls) {
      float var10000;
      switch (cls) {
         case lllIIIIllillIIIIll -> var10000 = this.llIiiiIIIl;
         case IilIIIIlllilIIIIll -> var10000 = this.ilIiiiIIIl;
         case iilIIIIllIIiIIIIll -> var10000 = this.IiIiiiIIIl;
         case iIlIIIIllIllIIIIll -> var10000 = 0.1F;
         case lIiIIIIlliIiIIIIll -> var10000 = this.ilIiiiIIIl;
         case IliIIIIlllliIIIIll -> var10000 = 0.0F;
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   public boolean Iillllilll() {
      return this.lIIIIIlIIl;
   }

   public boolean IllIllllIl() {
      return this.IlliiiIIIl;
   }

   public IlIlilillIlili(llliIIIiilliIIIi playerY, IiilIlIlliilIlIl renderIncorrect, Iiiliiiliiliii wrongBlockOpacity, float showOrigin, float occludedOpacity, float style, float showBox, float wrongBlockColor, float mode, boolean renderDistance, boolean outlineOpacity, boolean litematicaTranslucent, boolean extraColor, boolean ghostOpacity, float outlineWidth, float layerMode, int correctColor, int outlines, int wrongStateColor, boolean missingThroughWalls, boolean interiorFadeRadius, boolean rebuildBudget, int renderCorrect, int textured, int interiorClarity, int renderMissing, int missingOpacity, IIliIiilIliIii wrongStateOpacity, boolean missingColor) {
      this.IIIiiiIIIl = playerY;
      this.lIIiiiIIIl = renderIncorrect;
      this.iIIiiiIIIl = wrongBlockOpacity;
      this.IlIiiiIIIl = showOrigin;
      this.llIiiiIIIl = occludedOpacity;
      this.ilIiiiIIIl = style;
      this.IiIiiiIIIl = showBox;
      this.liIiiiIIIl = wrongBlockColor;
      this.iiIiiiIIIl = mode;
      this.IIliiiIIIl = renderDistance;
      this.lIliiiIIIl = outlineOpacity;
      this.iIliiiIIIl = litematicaTranslucent;
      this.IlliiiIIIl = extraColor;
      this.llliiiIIIl = ghostOpacity;
      this.illiiiIIIl = outlineWidth;
      this.IiliiiIIIl = layerMode;
      this.liliiiIIIl = correctColor;
      this.iiliiiIIIl = outlines;
      this.IIiiiiIIIl = wrongStateColor;
      this.lIiiiiIIIl = missingThroughWalls;
      this.iIiiiiIIIl = interiorFadeRadius;
      this.IliiiiIIIl = rebuildBudget;
      this.lliiiiIIIl = renderCorrect;
      this.iliiiiIIIl = textured;
      this.IiiiiiIIIl = interiorClarity;
      this.liiiiiIIIl = renderMissing;
      this.iiiiiiIIIl = missingOpacity;
      this.IIIIIIlIIl = wrongStateOpacity;
      this.lIIIIIlIIl = missingColor;
   }

   public boolean IIIilIIiiIIi(int y) {
      long var3 = -3649321484629671784L;
      var3 ^= ((long)this.IiIiliIiiiIi() << 32 ^ var3) & -1L << 32;
      if ((int)(var3 >>> 32) < 0) {
         return true;
      } else {
         return Math.abs(y - this.IIiiiiIIIl) <= (int)(var3 >>> 32);
      }
   }

   public int IlIllllIll() {
      return this.lliiiiIIIl;
   }
}
