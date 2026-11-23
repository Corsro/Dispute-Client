package gg.corz;

import net.minecraft.class_2338;

public record IllliiIilllliiIi(class_2338 cell, class_2338 fluid, IllIIIillllIIIil kind, boolean lava, int level, double score) {
   private final boolean IliIlIIlIi;
   private final IllIIIillllIIIil iIiIlIIlIi;
   private final int lliIlIIlIi;
   private final class_2338 lIiIlIIlIi;
   private final class_2338 IIiIlIIlIi;
   private final double iliIlIIlIi;

   public int lIiiIiIlilli() {
      return this.lliIlIIlIi;
   }

   public boolean IilliliilIIi() {
      return this.IliIlIIlIi;
   }

   public class_2338 IliIlllilIi() {
      return this.IIiIlIIlIi;
   }

   public IllliiIilllliiIi(class_2338 level, class_2338 lava, IllIIIillllIIIil fluid, boolean score, int kind, double cell) {
      this.IIiIlIIlIi = level;
      this.lIiIlIIlIi = lava;
      this.iIiIlIIlIi = fluid;
      this.IliIlIIlIi = score;
      this.lliIlIIlIi = kind;
      this.iliIlIIlIi = cell;
   }

   public class_2338 liiiIIllIl() {
      return this.lIiIlIIlIi;
   }

   public double iliIiiliiiii() {
      return this.iliIlIIlIi;
   }

   public IllIIIillllIIIil iIlIlllllill() {
      return this.iIiIlIIlIi;
   }
}
