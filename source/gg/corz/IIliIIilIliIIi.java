package gg.corz;

public record IIliIIilIliIIi(long from, long to, iiiIIiilIIIlIiil transition, IIlIliIllIlIliIl mode) {
   private final iiiIIiilIIIlIiil liiliiiliiiiliiili;
   private final long Ililiiililliliiili;
   private final IIlIliIllIlIliIl IIIiiiililIIiiiili;
   private final long ililiiiliIiiliiili;

   public IIlIliIllIlIliIl IilliliilIIi() {
      return this.IIIiiiililIIiiiili;
   }

   public long liiiIIllIl() {
      return this.ililiiiliIiiliiili;
   }

   public long IliIlllilIi() {
      return this.Ililiiililliliiili;
   }

   public IIliIIilIliIIi(long mode, long transition, iiiIIiilIIIlIiil from, IIlIliIllIlIliIl to) {
      this.Ililiiililliliiili = mode;
      this.ililiiiliIiiliiili = transition;
      this.liiliiiliiiiliiili = from;
      this.IIIiiiililIIiiiili = to;
   }

   public iiiIIiilIIIlIiil iIlIlllllill() {
      return this.liiliiiliiiiliiili;
   }
}
