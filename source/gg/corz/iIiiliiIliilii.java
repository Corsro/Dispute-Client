package gg.corz;

public record iIiiliiIliilii(long target, long stand, IIlIiiIilIlIiiIi eyeMode, long fingerprint, String reason, long certificateId, long[] cells) {
   private final long iIiIiliIIl;
   private final IIlIiiIilIlIiiIi lliIiliIIl;
   private final long iliIiliIIl;
   private final long IliIiliIIl;
   private final long[] iiiIiliIIl;
   private final String IiiIiliIIl;
   private final long liiIiliIIl;

   public long liiiIIllIl() {
      return this.IliIiliIIl;
   }

   public long IliIlllilIi() {
      return this.iIiIiliIIl;
   }

   public IIlIiiIilIlIiiIi iIlIlllllill() {
      return this.lliIiliIIl;
   }

   public iIiiliiIliilii(long certificateId, long stand, IIlIiiIilIlIiiIi reason, long fingerprint, String cells, long target, long[] eyeMode) {
      this.iIiIiliIIl = certificateId;
      this.IliIiliIIl = stand;
      this.lliIiliIIl = reason;
      this.iliIiliIIl = fingerprint;
      this.IiiIiliIIl = cells;
      this.liiIiliIIl = target;
      this.iiiIiliIIl = eyeMode;
   }

   public long IilliliilIIi() {
      return this.iliIiliIIl;
   }

   public String lIiiIiIlilli() {
      return this.IiiIiliIIl;
   }

   public iIiiliiIliilii(long reason, long stand, IIlIiiIilIlIiiIi eyeMode, long fingerprint, String target, long certificateId) {
      this(reason, stand, eyeMode, fingerprint, target, certificateId, (long[])null);
   }

   public long[] IIIllIIliIIl() {
      return this.iiiIiliIIl;
   }

   public long iliIiiliiiii() {
      return this.liiIiliIIl;
   }
}
