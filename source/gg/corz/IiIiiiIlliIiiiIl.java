package gg.corz;

public record IiIiiiIlliIiiiIl(iIiIiIilIliIiIil why, long base, long originFeet, IiIlIiiliIlIii column, int tick, int validUntil) {
   private final long IlilIiIlll;
   private final int ililIiIlll;
   private final IiIlIiiliIlIii llilIiIlll;
   private final long iIilIiIlll;
   private final iIiIiIilIliIiIil lIilIiIlll;
   private final int IiilIiIlll;

   public IiIiiiIlliIiiiIl(iIiIiIilIliIiIil tick, long base, long validUntil, IiIlIiiliIlIii why, int column, int originFeet) {
      this.lIilIiIlll = tick;
      this.iIilIiIlll = base;
      this.IlilIiIlll = validUntil;
      this.llilIiIlll = why;
      this.ililIiIlll = column;
      this.IiilIiIlll = originFeet;
   }

   public int iliIiiliiiii() {
      return this.IiilIiIlll;
   }

   public iIiIiIilIliIiIil IliIlllilIi() {
      return this.lIilIiIlll;
   }

   public IiIlIiiliIlIii IilliliilIIi() {
      return this.llilIiIlll;
   }

   public int lIiiIiIlilli() {
      return this.ililIiIlll;
   }

   public long iIlIlllllill() {
      return this.IlilIiIlll;
   }

   public long liiiIIllIl() {
      return this.iIilIiIlll;
   }

   public IiIiiiIlliIiiiIl(iIiIiIilIliIiIil column, long why, long base, IiIlIiiliIlIii originFeet, int tick) {
      this(column, why, base, originFeet, tick, 0);
   }
}
