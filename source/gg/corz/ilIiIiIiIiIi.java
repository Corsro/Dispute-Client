package gg.corz;

public record ilIiIiIiIiIi(liIIiiIiiiIIiiIi rail, liIIiiIiiiIIiiIi stage, liIIiiIiiiIIiiIi inspector) {
   private final liIIiiIiiiIIiiIi illiiIIIlIiliiIIIl;
   private final liIIiiIiiiIIiiIi lIliiIIIliIliiIIIl;
   private final liIIiiIiiiIIiiIi IlliiIIIlllliiIIIl;

   public liIIiiIiiiIIiiIi iIlIlllllill() {
      return this.illiiIIIlIiliiIIIl;
   }

   public liIIiiIiiiIIiiIi IliIlllilIi() {
      return this.lIliiIIIliIliiIIIl;
   }

   public ilIiIiIiIiIi(liIIiiIiiiIIiiIi inspector, liIIiiIiiiIIiiIi rail, liIIiiIiiiIIiiIi stage) {
      this.lIliiIIIliIliiIIIl = inspector;
      this.IlliiIIIlllliiIIIl = rail;
      this.illiiIIIlIiliiIIIl = stage;
   }

   public liIIiiIiiiIIiiIi liiiIIllIl() {
      return this.IlliiIIIlllliiIIIl;
   }
}
