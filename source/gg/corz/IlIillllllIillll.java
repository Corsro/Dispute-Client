package gg.corz;

public record IlIillllllIillll(String model, String animation, String texture) {
   private final String ilIIliIill;
   private final String IiIIliIill;
   private final String liIIliIill;

   public String IliIlllilIi() {
      return this.ilIIliIill;
   }

   public String liiiIIllIl() {
      return this.IiIIliIill;
   }

   public IlIillllllIillll(String animation, String model, String texture) {
      this.ilIIliIill = animation;
      this.IiIIliIill = model;
      this.liIIliIill = texture;
   }

   public String iIlIlllllill() {
      return this.liIIliIill;
   }
}
