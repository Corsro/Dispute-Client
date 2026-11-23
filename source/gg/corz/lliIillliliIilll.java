package gg.corz;

public record lliIillliliIilll(boolean jump, boolean click, boolean brake, iliIllIiiIll phase, String note) {
   private final iliIllIiiIll illllIlill;
   private final boolean iIlllIlill;
   private final boolean lllllIlill;
   private final String IilllIlill;
   private final boolean IllllIlill;

   public boolean liiiIIllIl() {
      return this.IllllIlill;
   }

   public lliIillliliIilll(boolean phase, boolean jump, boolean brake, iliIllIiiIll click, String note) {
      this.iIlllIlill = phase;
      this.IllllIlill = jump;
      this.lllllIlill = brake;
      this.illllIlill = click;
      this.IilllIlill = note;
   }

   public boolean iIlIlllllill() {
      return this.lllllIlill;
   }

   public String lIiiIiIlilli() {
      return this.IilllIlill;
   }

   public boolean IliIlllilIi() {
      return this.iIlllIlill;
   }

   public iliIllIiiIll IilliliilIIi() {
      return this.illllIlill;
   }
}
