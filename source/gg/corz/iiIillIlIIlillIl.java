package gg.corz;

public record iiIillIlIIlillIl(Iiiiilllliiiilll reject, int deckY, Iiilliiliiil deck, iIlillIllill probe, String detail) {
   private final Iiilliiliiil lliIIlliIl;
   private final iIlillIllill iliIIlliIl;
   private final int IliIIlliIl;
   private final String IiiIIlliIl;
   private final Iiiiilllliiiilll iIiIIlliIl;

   public Iiilliiliiil IilliliilIIi() {
      return this.lliIIlliIl;
   }

   public String iliIiiliiiii() {
      return this.IiiIIlliIl;
   }

   public boolean IliIlllilIi() {
      return this.iIiIIlliIl == Iiiiilllliiiilll.liiIlllill && this.lliIIlliIl != null;
   }

   public Iiiiilllliiiilll liiiIIllIl() {
      return this.iIiIIlliIl;
   }

   public iiIillIlIIlillIl(Iiiiilllliiiilll probe, int deckY, Iiilliiliiil detail, iIlillIllill reject, String deck) {
      this.iIiIIlliIl = probe;
      this.IliIIlliIl = deckY;
      this.lliIIlliIl = detail;
      this.iliIIlliIl = reject;
      this.IiiIIlliIl = deck;
   }

   public iIlillIllill lIiiIiIlilli() {
      return this.iliIIlliIl;
   }

   public int iIlIlllllill() {
      return this.IliIIlliIl;
   }
}
