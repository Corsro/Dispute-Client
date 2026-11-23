package gg.corz;

public record lIiIIlliIiIIll(int before, int retained, int removed) {
   private final int IIiIiIIillIiIiIIil;
   private final int lilIiIIiliilIiIIil;
   private final int illIiIIilIilIiIIil;

   public int iIlIlllllill() {
      return this.IIiIiIIillIiIiIIil;
   }

   public int liiiIIllIl() {
      return this.lilIiIIiliilIiIIil;
   }

   public lIiIIlliIiIIll(int removed, int retained, int before) {
      this.illIiIIilIilIiIIil = removed;
      this.lilIiIIiliilIiIIil = retained;
      this.IIiIiIIillIiIiIIil = before;
   }

   public int IliIlllilIi() {
      return this.illIiIIilIilIiIIil;
   }
}
