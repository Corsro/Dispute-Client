package gg.corz;

import net.minecraft.class_2338;
import net.minecraft.class_243;

public record iiIIllilIIlIllil(class_243 stand, class_2338 anchor, double value, float selfBound, int prepTicks, boolean arrived) {
   private final double liiIlliIil;
   private final float iiiIlliIil;
   private final boolean lIIllliIil;
   private final class_243 iliIlliIil;
   private final class_2338 IiiIlliIil;
   private final int IIIllliIil;

   public int lIiiIiIlilli() {
      return this.IIIllliIil;
   }

   public class_2338 liiiIIllIl() {
      return this.IiiIlliIil;
   }

   public class_243 IliIlllilIi() {
      return this.iliIlliIil;
   }

   public boolean iliIiiliiiii() {
      return this.lIIllliIil;
   }

   public iiIIllilIIlIllil(class_243 prepTicks, class_2338 selfBound, double value, float anchor, int arrived, boolean stand) {
      this.iliIlliIil = prepTicks;
      this.IiiIlliIil = selfBound;
      this.liiIlliIil = value;
      this.iiiIlliIil = anchor;
      this.IIIllliIil = arrived;
      this.lIIllliIil = stand;
   }

   public double iIlIlllllill() {
      return this.liiIlliIil;
   }

   public float IilliliilIIi() {
      return this.iiiIlliIil;
   }
}
