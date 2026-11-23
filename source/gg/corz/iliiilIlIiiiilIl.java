package gg.corz;

import java.util.List;

record iliiilIlIiiiilIl(List<ilIlIIilIiIlIIil> cells, int natural, iliIiiiIiiIiii counts, List<iiliIiIiIIiiIiIi> markers, long signature) {
   private final List<iiliIiIiIIiiIiIi> IiiiIIiIll;
   private final List<ilIlIIilIiIlIIil> IliiIIiIll;
   private final int lliiIIiIll;
   private final iliIiiiIiiIiii iliiIIiIll;
   private final long liiiIIiIll;

   public long lIiiIiIlilli() {
      return this.liiiIIiIll;
   }

   public int liiiIIllIl() {
      return this.lliiIIiIll;
   }

   public iliIiiiIiiIiii iIlIlllllill() {
      return this.iliiIIiIll;
   }

   public List<iiliIiIiIIiiIiIi> IilliliilIIi() {
      return this.IiiiIIiIll;
   }

   private iliiilIlIiiiilIl(List<ilIlIIilIiIlIIil> counts, int cells, iliIiiiIiiIiii markers, List<iiliIiIiIIiiIiIi> signature, long natural) {
      this.IliiIIiIll = counts;
      this.lliiIIiIll = cells;
      this.iliiIIiIll = markers;
      this.IiiiIIiIll = signature;
      this.liiiIIiIll = natural;
   }

   public List<ilIlIIilIiIlIIil> IliIlllilIi() {
      return this.IliiIIiIll;
   }
}
