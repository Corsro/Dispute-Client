package gg.corz;

import net.minecraft.class_2338;

public record IIIilIIiiIIi(class_2338 cell, int charges, float rawUs, float fullUs, float hitUs, float dmgHim, int eta, float pDet, int ownerId, boolean shieldedFromHim, boolean busy) {
   private final int liIIlliiIIll;
   private final int IliIlllliIll;
   private final boolean liiIlliiiIll;
   private final float IIlIlllIlIll;
   private final float iIlIllIllIll;
   private final boolean iliIllIiiIll;
   public static final IIIilIIiiIIi IIIllllIIlll = new IIIilIIiiIIi((class_2338)null, 0, 0.0F, 0.0F, 0.0F, 0.0F, 99, 0.0F, -1, false, false);
   private final float lllIllillIll;
   private final float IilIlllilIll;
   private final float lIiIlliIiIll;
   private final class_2338 ilIIllIiIIll;
   private final int iilIllIIiIll;

   public IIIilIIiiIIi(class_2338 eta, int dmgHim, float fullUs, float busy, float rawUs, float hitUs, int shieldedFromHim, float cell, int pDet, boolean ownerId, boolean charges) {
      this.ilIIllIiIIll = eta;
      this.liIIlliiIIll = dmgHim;
      this.IIlIlllIlIll = fullUs;
      this.iIlIllIllIll = busy;
      this.lllIllillIll = rawUs;
      this.IilIlllilIll = hitUs;
      this.iilIllIIiIll = shieldedFromHim;
      this.lIiIlliIiIll = cell;
      this.IliIlllliIll = pDet;
      this.iliIllIiiIll = ownerId;
      this.liiIlliiiIll = charges;
   }

   public int iliIiiliiiii() {
      return this.liIIlliiIIll;
   }

   public int IIillIiliIil() {
      return this.IliIlllliIll;
   }

   public class_2338 lIiiIiIlilli() {
      return this.ilIIllIiIIll;
   }

   public float IiIlliIliiIl() {
      return this.lllIllillIll;
   }

   public boolean iIlIlllllill(float ehp) {
      return this.IliIlllilIi() && this.iilIllIIiIll <= 1 && this.liIIlliiIIll >= 1 && this.lllIllillIll >= 0.5F * ehp;
   }

   public boolean IliIlllilIi() {
      return this.ilIIllIiIIll != null;
   }

   public int Illlllllilll() {
      return this.iilIllIIiIll;
   }

   public boolean IilliliilIIi(float ehp) {
      return this.IliIlllilIi() && this.iilIllIIiIll <= 2 && this.lllIllillIll >= Math.max(3.0F, 0.3F * ehp);
   }

   public boolean Iiilliiliiil() {
      return this.liiIlliiiIll;
   }

   public float IIlllIlliIll() {
      return this.IilIlllilIll;
   }

   public float Iilllilliill() {
      return this.lIiIlliIiIll;
   }

   public float IlIlllIlilIl() {
      return this.iIlIllIllIll;
   }

   public boolean Ililllililil() {
      return this.iliIllIiiIll;
   }

   public float liiiIIllIl() {
      return this.lIiIlliIiIll * this.lllIllillIll;
   }

   public float IIIllIIliIIl() {
      return this.IIlIlllIlIll;
   }
}
