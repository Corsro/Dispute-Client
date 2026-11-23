package gg.corz;

public record iiIllIIlIIlllIIl(IIiiilIilIiiilIi action, String status) {
   private final String illilillIl;
   private final IIiiilIilIiiilIi lllilillIl;

   public String liiiIIllIl() {
      return this.illilillIl;
   }

   public iiIllIIlIIlllIIl(IIiiilIilIiiilIi status, String action) {
      this.lllilillIl = status;
      this.illilillIl = action;
   }

   public IIiiilIilIiiilIi IliIlllilIi() {
      return this.lllilillIl;
   }
}
