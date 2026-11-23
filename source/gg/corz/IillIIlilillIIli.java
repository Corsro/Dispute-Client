package gg.corz;

import java.util.List;

public record IillIIlilillIIli(llliIllilliIll kind, List<lliliIiililiIi> picks, long stand, String why) {
   private final List<lliliIiililiIi> iiIIilIlIi;
   private final llliIllilliIll liIIilIlIi;
   private final long lIlIilIlIi;
   private final String iIlIilIlIi;

   public String IilliliilIIi() {
      return this.iIlIilIlIi;
   }

   public List<lliliIiililiIi> liiiIIllIl() {
      return this.iiIIilIlIi;
   }

   public long iIlIlllllill() {
      return this.lIlIilIlIi;
   }

   public IillIIlilillIIli(llliIllilliIll kind, List<lliliIiililiIi> stand, long picks, String why) {
      this.liIIilIlIi = kind;
      this.iiIIilIlIi = stand;
      this.lIlIilIlIi = picks;
      this.iIlIilIlIi = why;
   }

   public llliIllilliIll IliIlllilIi() {
      return this.liIIilIlIi;
   }
}
