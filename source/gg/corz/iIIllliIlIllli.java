package gg.corz;

public record iIIllliIlIllli(lllllIiillllIi verdict, String why) {
   private final String llililIIIl;
   private final lllllIiillllIi IlililIIIl;

   public iIIllliIlIllli(lllllIiillllIi why, String verdict) {
      this.IlililIIIl = why;
      this.llililIIIl = verdict;
   }

   public boolean liiiIIllIl() {
      return this.IlililIIIl == lllllIiillllIi.iIIiilIiiIlIiilIii;
   }

   public lllllIiillllIi iIlIlllllill() {
      return this.IlililIIIl;
   }

   public boolean IliIlllilIi() {
      return this.IlililIIIl == lllllIiillllIi.liililIiiiiililIii;
   }

   public String IilliliilIIi() {
      return this.llililIIIl;
   }
}
