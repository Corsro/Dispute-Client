package gg.corz;

import net.minecraft.class_238;
import net.minecraft.class_243;

public record iliiIIIiIiiiIIIi(class_243 feet, class_238 box, class_243 velocity, boolean airborne, double sigma, class_243 lateral) {
   private final class_243 iiilIlliil;
   private final class_238 llilIlliil;
   private final double liilIlliil;
   private final class_243 IlilIlliil;
   private final class_243 ililIlliil;
   private final boolean IiilIlliil;

   public class_238 liiiIIllIl() {
      return this.llilIlliil;
   }

   public class_243 iIlIlllllill() {
      return this.ililIlliil;
   }

   public double lIiiIiIlilli() {
      return this.liilIlliil;
   }

   public boolean IilliliilIIi() {
      return this.IiilIlliil;
   }

   public iliiIIIiIiiiIIIi(class_243 velocity, class_238 box, class_243 sigma, boolean lateral, double airborne, class_243 feet) {
      this.IlilIlliil = velocity;
      this.llilIlliil = box;
      this.ililIlliil = sigma;
      this.IiilIlliil = lateral;
      this.liilIlliil = airborne;
      this.iiilIlliil = feet;
   }

   public class_243 IliIlllilIi() {
      return this.IlilIlliil;
   }

   public class_243 iliIiiliiiii() {
      return this.iiilIlliil;
   }
}
