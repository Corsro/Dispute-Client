package gg.corz;

import java.util.UUID;

record ilIlIlIiIiIlIlIi(IIllliilIlllii kind, String name, int a, int b, double x, double y, double z, UUID id, int[] ids, long ms) {
   private final IIllliilIlllii iIIIIIIIIi;
   private final UUID IIlIIIIIIi;
   private final long iIlIIIIIIi;
   private final int ilIIIIIIIi;
   private final double iiIIIIIIIi;
   private final int[] lIlIIIIIIi;
   private final double liIIIIIIIi;
   private final double IiIIIIIIIi;
   private final String IlIIIIIIIi;
   private final int llIIIIIIIi;

   public int iIlIlllllill() {
      return this.llIIIIIIIi;
   }

   public String liiiIIllIl() {
      return this.IlIIIIIIIi;
   }

   public double lIiiIiIlilli() {
      return this.IiIIIIIIIi;
   }

   public double iliIiiliiiii() {
      return this.liIIIIIIIi;
   }

   public int[] IiIlliIliiIl() {
      return this.lIlIIIIIIi;
   }

   public double IIIllIIliIIl() {
      return this.iiIIIIIIIi;
   }

   public IIllliilIlllii IliIlllilIi() {
      return this.iIIIIIIIIi;
   }

   public long IIlllIlliIll() {
      return this.iIlIIIIIIi;
   }

   ilIlIlIiIiIlIlIi(IIllliilIlllii x, String name, int ms, int a, double kind, double y, double b, UUID id, int[] z, long ids) {
      this.iIIIIIIIIi = x;
      this.IlIIIIIIIi = name;
      this.llIIIIIIIi = ms;
      this.ilIIIIIIIi = a;
      this.IiIIIIIIIi = kind;
      this.liIIIIIIIi = y;
      this.iiIIIIIIIi = b;
      this.IIlIIIIIIi = id;
      this.lIlIIIIIIi = z;
      this.iIlIIIIIIi = ids;
   }

   public int IilliliilIIi() {
      return this.ilIIIIIIIi;
   }

   public UUID IlIlllIlilIl() {
      return this.IIlIIIIIIi;
   }
}
