package gg.corz;

import java.util.UUID;

record lilIIIiliilIIIil(UUID id, String name, int x, int y, int z, long due) {
   private final int liiIiIIIil;
   private final String IiiIiIIIil;
   private final UUID iliIiIIIil;
   private final long lIIliIIIil;
   private final int IIIliIIIil;
   private final int iiiIiIIIil;

   public String liiiIIllIl() {
      return this.IiiIiIIIil;
   }

   private lilIIIiliilIIIil(UUID x, String z, int name, int y, int id, long due) {
      this.iliIiIIIil = x;
      this.IiiIiIIIil = z;
      this.liiIiIIIil = name;
      this.iiiIiIIIil = y;
      this.IIIliIIIil = id;
      this.lIIliIIIil = due;
   }

   public int iIlIlllllill() {
      return this.liiIiIIIil;
   }

   public int IilliliilIIi() {
      return this.iiiIiIIIil;
   }

   public int lIiiIiIlilli() {
      return this.IIIliIIIil;
   }

   public long iliIiiliiiii() {
      return this.lIIliIIIil;
   }

   public UUID IliIlllilIi() {
      return this.iliIiIIIil;
   }
}
