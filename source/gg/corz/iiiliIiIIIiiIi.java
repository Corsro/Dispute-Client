package gg.corz;

public record iiiliIiIIIiiIi(IlIiIIllllIiIIll verdict, int minY, int size) {
   private final int illIlIiiiIilIlIiii;
   private final int lilIlIiiiiilIlIiii;
   private final IlIiIIllllIiIIll IllIlIiiilllIlIiii;

   public iiiliIiIIIiiIi(IlIiIIllllIiIIll minY, int size, int verdict) {
      this.IllIlIiiilllIlIiii = minY;
      this.illIlIiiiIilIlIiii = size;
      this.lilIlIiiiiilIlIiii = verdict;
   }

   public int iIlIlllllill() {
      return this.lilIlIiiiiilIlIiii;
   }

   public IlIiIIllllIiIIll IliIlllilIi() {
      return this.IllIlIiiilllIlIiii;
   }

   public int liiiIIllIl() {
      return this.illIlIiiiIilIlIiii;
   }
}
