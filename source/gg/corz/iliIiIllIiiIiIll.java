package gg.corz;

public final class iliIiIllIiiIiIll {
   private int iillililll = Integer.MIN_VALUE;
   private long lillililll = Long.MIN_VALUE;

   public void liiiIIllIl() {
      this.lillililll = Long.MIN_VALUE;
   }

   public boolean IliIlllilIi(long tick, int minIntervalTicks, int revisionKey) {
      if (tick == this.lillililll && minIntervalTicks - this.iillililll < revisionKey) {
         return false;
      } else {
         this.lillililll = tick;
         this.iillililll = minIntervalTicks;
         return true;
      }
   }
}
