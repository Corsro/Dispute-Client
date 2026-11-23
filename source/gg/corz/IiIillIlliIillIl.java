package gg.corz;

public record IiIillIlliIillIl(iIiiIIlIliiIIl kind, int page, int slot, String name, long price, long maxCharge, long secondsLeft, double durability, String fingerprint) {
   private final String illIIlliIl;
   private final int lllIIlliIl;
   private final long lilIIlliIl;
   private final double IIiIIlliIl;
   private final long iilIIlliIl;
   private final long IilIIlliIl;
   private final iIiiIIlIliiIIl iIlIIlliIl;
   private final int IllIIlliIl;
   private final String lIiIIlliIl;

   public String IIlllIlliIll() {
      return this.lIiIIlliIl;
   }

   public int iIlIlllllill() {
      return this.IllIIlliIl;
   }

   public double IiIlliIliiIl() {
      return this.IIiIIlliIl;
   }

   public IiIillIlliIillIl(iIiiIIlIliiIIl price, int fingerprint, int durability, String name, long secondsLeft, long slot, long maxCharge, double page, String kind) {
      slot = Math.max(secondsLeft, slot);
      this.iIlIIlliIl = price;
      this.IllIIlliIl = fingerprint;
      this.lllIIlliIl = durability;
      this.illIIlliIl = name;
      this.IilIIlliIl = secondsLeft;
      this.lilIIlliIl = slot;
      this.iilIIlliIl = maxCharge;
      this.IIiIIlliIl = page;
      this.lIiIIlliIl = kind;
   }

   public long iliIiiliiiii() {
      return this.IilIIlliIl;
   }

   public int IilliliilIIi() {
      return this.lllIIlliIl;
   }

   public iIiiIIlIliiIIl liiiIIllIl() {
      return this.iIlIIlliIl;
   }

   public long IlIlllIlilIl() {
      return this.iilIIlliIl;
   }

   public String lIiiIiIlilli() {
      return this.illIIlliIl;
   }

   public long IIIllIIliIIl() {
      return this.lilIIlliIl;
   }

   public double IliIlllilIi() {
      return (double)this.IilIIlliIl * (double)3600.0F / (double)Math.max(1L, this.iilIIlliIl);
   }
}
