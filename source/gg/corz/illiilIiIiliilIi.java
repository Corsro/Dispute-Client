package gg.corz;

import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;

record illiilIiIiliilIi(class_2338 base, boolean build, class_243 landing, int top, class_2350 face, long until) {
   private final class_2350 lIliillIIi;
   private final long iIliillIIi;
   private final class_243 iiIiillIIi;
   private final class_2338 IiIiillIIi;
   private final boolean liIiillIIi;
   private final int IIliillIIi;

   public class_2350 lIiiIiIlilli() {
      return this.lIliillIIi;
   }

   public boolean liiiIIllIl() {
      return this.liIiillIIi;
   }

   public long iliIiiliiiii() {
      return this.iIliillIIi;
   }

   public int IilliliilIIi() {
      return this.IIliillIIi;
   }

   private illiilIiIiliilIi(class_2338 landing, boolean top, class_243 base, int until, class_2350 face, long build) {
      this.IiIiillIIi = landing;
      this.liIiillIIi = top;
      this.iiIiillIIi = base;
      this.IIliillIIi = until;
      this.lIliillIIi = face;
      this.iIliillIIi = build;
   }

   public class_2338 IliIlllilIi() {
      return this.IiIiillIIi;
   }

   public class_243 iIlIlllllill() {
      return this.iiIiillIIi;
   }
}
