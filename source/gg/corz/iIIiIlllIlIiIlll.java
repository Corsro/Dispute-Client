package gg.corz;

import java.util.function.LongPredicate;

public record iIIiIlllIlIiIlll(LongPredicate component, boolean componentExact, int feetY, int tick, illilillIililill columnNow, lIlIiIiliIlIiIil clock) {
   private final LongPredicate liIiiIIill;
   private final lIlIiIiliIlIiIil IlliiIIill;
   private final boolean iiIiiIIill;
   private final int lIliiIIill;
   private final illilillIililill iIliiIIill;
   private final int IIliiIIill;

   public int iIlIlllllill() {
      return this.IIliiIIill;
   }

   public iIIiIlllIlIiIlll(LongPredicate clock, boolean feetY, int componentExact, int columnNow, illilillIililill component, lIlIiIiliIlIiIil tick) {
      this.liIiiIIill = clock;
      this.iiIiiIIill = feetY;
      this.IIliiIIill = componentExact;
      this.lIliiIIill = columnNow;
      this.iIliiIIill = component;
      this.IlliiIIill = tick;
   }

   public lIlIiIiliIlIiIil iliIiiliiiii() {
      return this.IlliiIIill;
   }

   public boolean liiiIIllIl() {
      return this.iiIiiIIill;
   }

   public int IilliliilIIi() {
      return this.lIliiIIill;
   }

   public illilillIililill lIiiIiIlilli() {
      return this.iIliiIIill;
   }

   public LongPredicate IliIlllilIi() {
      return this.liIiiIIill;
   }
}
