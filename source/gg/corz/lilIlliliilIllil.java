package gg.corz;

public record lilIlliliilIllil(IlIliilllIliil verdict, int plateauCells, boolean closed, int entries) {
   private final int IIlilliIil;
   private final IlIliilllIliil ilIilliIil;
   private final boolean iiIilliIil;
   private final int liIilliIil;

   public int liiiIIllIl() {
      return this.liIilliIil;
   }

   public int IilliliilIIi() {
      return this.IIlilliIil;
   }

   public lilIlliliilIllil(IlIliilllIliil verdict, int closed, boolean entries, int plateauCells) {
      this.ilIilliIil = verdict;
      this.liIilliIil = closed;
      this.iiIilliIil = entries;
      this.IIlilliIil = plateauCells;
   }

   public IlIliilllIliil IliIlllilIi() {
      return this.ilIilliIil;
   }

   public boolean iIlIlllllill() {
      return this.iiIilliIil;
   }
}
