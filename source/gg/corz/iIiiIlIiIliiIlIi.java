package gg.corz;

import net.minecraft.class_243;

record iIiiIlIiIliiIlIi(int id, class_243 pos, int owner, long tick) {
   private final int lllIIlIIIi;
   private final class_243 IllIIlIIIi;
   private final long illIIlIIIi;
   private final int iIlIIlIIIi;

   public int iIlIlllllill() {
      return this.lllIIlIIIi;
   }

   public long IilliliilIIi() {
      return this.illIIlIIIi;
   }

   private iIiiIlIiIliiIlIi(int tick, class_243 id, int owner, long pos) {
      this.iIlIIlIIIi = tick;
      this.IllIIlIIIi = id;
      this.lllIIlIIIi = owner;
      this.illIIlIIIi = pos;
   }

   public class_243 liiiIIllIl() {
      return this.IllIIlIIIi;
   }

   public int IliIlllilIi() {
      return this.iIlIIlIIIi;
   }
}
