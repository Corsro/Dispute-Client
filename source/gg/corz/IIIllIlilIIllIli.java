package gg.corz;

public record IIIllIlilIIllIli(long target, iIlillIiIllillIi ctx) {
   private final long iiilIIllIi;
   private final iIlillIiIllillIi IIIiIIllIi;

   public IIIllIlilIIllIli(long ctx, iIlillIiIllillIi target) {
      this.iiilIIllIi = ctx;
      this.IIIiIIllIi = target;
   }

   public long IliIlllilIi() {
      return this.iiilIIllIi;
   }

   public iIlillIiIllillIi liiiIIllIl() {
      return this.IIIiIIllIi;
   }
}
