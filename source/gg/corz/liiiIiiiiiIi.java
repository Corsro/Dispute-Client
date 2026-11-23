package gg.corz;

public record liiiIiiiiiIi(boolean threat, boolean rtpReady, boolean rtpAwaiting, boolean warmup, double nearest, long cooldownLeftMs, boolean logoutOn, long sincePlayerHitMs) {
   private final boolean IIlIilIIllIlIilIIl;
   private final double lllIilIIlillIilIIl;
   private final long lIiIilIIliIiIilIIl;
   private final boolean ilIIilIIlIiIIilIIl;
   private final boolean iilIilIIlIIiIilIIl;
   private final boolean iIlIilIIlIllIilIIl;
   private final boolean liIIilIIliiIIilIIl;
   private final long IilIilIIllilIilIIl;

   public boolean iIlIlllllill() {
      return this.IIlIilIIllIlIilIIl;
   }

   public boolean liiiIIllIl() {
      return this.liIIilIIliiIIilIIl;
   }

   public liiiIiiiiiIi(boolean rtpReady, boolean warmup, boolean cooldownLeftMs, boolean logoutOn, double nearest, long rtpAwaiting, boolean sincePlayerHitMs, long threat) {
      this.ilIIilIIlIiIIilIIl = rtpReady;
      this.liIIilIIliiIIilIIl = warmup;
      this.IIlIilIIllIlIilIIl = cooldownLeftMs;
      this.iIlIilIIlIllIilIIl = logoutOn;
      this.lllIilIIlillIilIIl = nearest;
      this.IilIilIIllilIilIIl = rtpAwaiting;
      this.iilIilIIlIIiIilIIl = sincePlayerHitMs;
      this.lIiIilIIliIiIilIIl = threat;
   }

   public long IlIlllIlilIl() {
      return this.lIiIilIIliIiIilIIl;
   }

   public boolean IliIlllilIi() {
      return this.ilIIilIIlIiIIilIIl;
   }

   public double lIiiIiIlilli() {
      return this.lllIilIIlillIilIIl;
   }

   public boolean IilliliilIIi() {
      return this.iIlIilIIlIllIilIIl;
   }

   public boolean IIIllIIliIIl() {
      return this.iilIilIIlIIiIilIIl;
   }

   public long iliIiiliiiii() {
      return this.IilIilIIllilIilIIl;
   }
}
