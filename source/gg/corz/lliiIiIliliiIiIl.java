package gg.corz;

public record lliiIiIliliiIiIl(String kind, long cluster, long geometryFingerprint, long supportFingerprint) {
   private final String lllilliIll;
   private final long lililliIll;
   private final long illilliIll;
   private final long IililliIll;

   public long iIlIlllllill() {
      return this.IililliIll;
   }

   public String IliIlllilIi() {
      return this.lllilliIll;
   }

   public lliiIiIliliiIiIl(String geometryFingerprint, long kind, long cluster, long supportFingerprint) {
      this.lllilliIll = geometryFingerprint;
      this.illilliIll = kind;
      this.IililliIll = cluster;
      this.lililliIll = supportFingerprint;
   }

   public long IilliliilIIi() {
      return this.lililliIll;
   }

   public long liiiIIllIl() {
      return this.illilliIll;
   }
}
