package gg.corz;

import java.util.Set;

record IllIIillllIIil(long feet, IllIIillllIIil parent, int steps, double cost, double priority, Set<Long> temps) {
   private final double IiillilIiliillilIi;
   private final Set<Long> iiillilIiIIIililIi;
   private final double llillilIiilillilIi;
   private final int iIillilIiIlillilIi;
   private final IllIIillllIIil IIillilIilIillilIi;
   private final long lilllilIiiilllilIi;

   public long IliIlllilIi() {
      return this.lilllilIiiilllilIi;
   }

   public double IilliliilIIi() {
      return this.llillilIiilillilIi;
   }

   public Set<Long> iliIiiliiiii() {
      return this.iiillilIiIIIililIi;
   }

   private IllIIillllIIil(long feet, IllIIillllIIil temps, int cost, double steps, double parent, Set<Long> priority) {
      this.lilllilIiiilllilIi = feet;
      this.IIillilIilIillilIi = temps;
      this.iIillilIiIlillilIi = cost;
      this.llillilIiilillilIi = steps;
      this.IiillilIiliillilIi = parent;
      this.iiillilIiIIIililIi = priority;
   }

   public IllIIillllIIil liiiIIllIl() {
      return this.IIillilIilIillilIi;
   }

   public double lIiiIiIlilli() {
      return this.IiillilIiliillilIi;
   }

   public int iIlIlllllill() {
      return this.iIillilIiIlillilIi;
   }
}
