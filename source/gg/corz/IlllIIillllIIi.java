package gg.corz;

public record IlllIIillllIIi(iIliIiIiIlliIiIi state, iIliIiIiIlliIiIi previous, boolean episodeStarted, boolean episodeEnded, String reason) {
   private final boolean llIiIiiliilIiIiili;
   private final iIliIiIiIlliIiIi iIIiIiiliIlIiIiili;
   private final iIliIiIiIlliIiIi IIIiIiililIIiIiili;
   private final String iiIiIiiliIIliIiili;
   private final boolean IiIiIiililiIiIiili;

   public IlllIIillllIIi(iIliIiIiIlliIiIi state, iIliIiIiIlliIiIi previous, boolean reason, boolean episodeEnded, String episodeStarted) {
      this.IIIiIiililIIiIiili = state;
      this.iIIiIiiliIlIiIiili = previous;
      this.llIiIiiliilIiIiili = reason;
      this.IiIiIiililiIiIiili = episodeEnded;
      this.iiIiIiiliIIliIiili = episodeStarted;
   }

   public boolean IilliliilIIi() {
      return this.IiIiIiililiIiIiili;
   }

   public boolean iIlIlllllill() {
      return this.llIiIiiliilIiIiili;
   }

   public iIliIiIiIlliIiIi IliIlllilIi() {
      return this.IIIiIiililIIiIiili;
   }

   public String lIiiIiIlilli() {
      return this.iiIiIiiliIIliIiili;
   }

   public iIliIiIiIlliIiIi liiiIIllIl() {
      return this.iIIiIiiliIlIiIiili;
   }
}
