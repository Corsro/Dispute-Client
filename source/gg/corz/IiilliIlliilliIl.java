package gg.corz;

public record IiilliIlliilliIl(iiiIlIIiIIIllIIi from, iiiIlIIiIIIllIIi to, lIllIIIiiIllIIIi next, String why) {
   private final String lilliiiIll;
   private final iiiIlIIiIIIllIIi illliiiIll;
   private final lIllIIIiiIllIIIi IilliiiIll;
   private final iiiIlIIiIIIllIIi lllliiiIll;

   public IiilliIlliilliIl(iiiIlIIiIIIllIIi next, iiiIlIIiIIIllIIi to, lIllIIIiiIllIIIi why, String from) {
      this.lllliiiIll = next;
      this.illliiiIll = to;
      this.IilliiiIll = why;
      this.lilliiiIll = from;
   }

   public String IilliliilIIi() {
      return this.lilliiiIll;
   }

   public iiiIlIIiIIIllIIi IliIlllilIi() {
      return this.lllliiiIll;
   }

   public iiiIlIIiIIIllIIi liiiIIllIl() {
      return this.illliiiIll;
   }

   public lIllIIIiiIllIIIi iIlIlllllill() {
      return this.IilliiiIll;
   }
}
