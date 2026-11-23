package gg.corz;

import net.minecraft.class_2338;
import net.minecraft.class_243;

record llilllIiililllIi(float pitch, class_243 landing, class_2338 stand, int flight) {
   private final int liIiiiIIIi;
   private final class_2338 IiIiiiIIIi;
   private final class_243 ilIiiiIIIi;
   private final float llIiiiIIIi;

   public float IliIlllilIi() {
      return this.llIiiiIIIi;
   }

   public int IilliliilIIi() {
      return this.liIiiiIIIi;
   }

   private llilllIiililllIi(float stand, class_243 flight, class_2338 landing, int pitch) {
      this.llIiiiIIIi = stand;
      this.ilIiiiIIIi = flight;
      this.IiIiiiIIIi = landing;
      this.liIiiiIIIi = pitch;
   }

   public class_243 liiiIIllIl() {
      return this.ilIiiiIIIi;
   }

   public class_2338 iIlIlllllill() {
      return this.IiIiiiIIIi;
   }
}
