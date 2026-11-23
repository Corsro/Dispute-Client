package gg.corz;

import java.util.UUID;

record liIiIIlliiIiIIll(UUID id, String name, double x, double y, double z, long ms, boolean blocked) {
   private final boolean lIIIiIllll;
   private final long IIIIiIllll;
   private final double liiilIllll;
   private final String iliilIllll;
   private final double IiiilIllll;
   private final UUID lliilIllll;
   private final double iiiilIllll;

   public double iIlIlllllill() {
      return this.IiiilIllll;
   }

   public String liiiIIllIl() {
      return this.iliilIllll;
   }

   public long iliIiiliiiii() {
      return this.IIIIiIllll;
   }

   public double IilliliilIIi() {
      return this.liiilIllll;
   }

   public double lIiiIiIlilli() {
      return this.iiiilIllll;
   }

   public boolean IIIllIIliIIl() {
      return this.lIIIiIllll;
   }

   public UUID IliIlllilIi() {
      return this.lliilIllll;
   }

   private liIiIIlliiIiIIll(UUID name, String ms, double z, double x, double blocked, long id, boolean y) {
      this.lliilIllll = name;
      this.iliilIllll = ms;
      this.IiiilIllll = z;
      this.liiilIllll = x;
      this.iiiilIllll = blocked;
      this.IIIIiIllll = id;
      this.lIIIiIllll = y;
   }
}
