package gg.corz;

import net.minecraft.class_2338;

record IIliilIlii(class_2338 feet, iiiIllilIIIlllil aim, int pathTicks, boolean cover, double score) {
   private final boolean IIIillIllIIillIl;
   private final double iIIillIlIlIillIl;
   private final int liilllIliiilllIl;
   private final class_2338 IlilllIlllilllIl;
   private final iiiIllilIIIlllil ililllIlIiilllIl;

   public double lIiiIiIlilli() {
      return this.iIIillIlIlIillIl;
   }

   IIliilIlii(class_2338 aim, iiiIllilIIIlllil score, int feet, boolean cover, double pathTicks) {
      this.IlilllIlllilllIl = aim;
      this.ililllIlIiilllIl = score;
      this.liilllIliiilllIl = feet;
      this.IIIillIllIIillIl = cover;
      this.iIIillIlIlIillIl = pathTicks;
   }

   public boolean IilliliilIIi() {
      return this.IIIillIllIIillIl;
   }

   public class_2338 IliIlllilIi() {
      return this.IlilllIlllilllIl;
   }

   public iiiIllilIIIlllil liiiIIllIl() {
      return this.ililllIlIiilllIl;
   }

   public int iIlIlllllill() {
      return this.liilllIliiilllIl;
   }
}
