package gg.corz;

import net.minecraft.class_2338;
import net.minecraft.class_243;

record IlIllIillIllIi(class_243 feet, class_2338 base, double rel, double angle) {
   private final double illlllIiiIillllIii;
   private final double lillllIiiiillllIii;
   private final class_2338 IlllllIiillllllIii;
   private final class_243 lIllllIiiiIllllIii;

   public double IilliliilIIi() {
      return this.lillllIiiiillllIii;
   }

   public class_243 IliIlllilIi() {
      return this.lIllllIiiiIllllIii;
   }

   public class_2338 liiiIIllIl() {
      return this.IlllllIiillllllIii;
   }

   private IlIllIillIllIi(class_243 rel, class_2338 feet, double base, double angle) {
      this.lIllllIiiiIllllIii = rel;
      this.IlllllIiillllllIii = feet;
      this.illlllIiiIillllIii = base;
      this.lillllIiiiillllIii = angle;
   }

   public double iIlIlllllill() {
      return this.illlllIiiIillllIii;
   }
}
