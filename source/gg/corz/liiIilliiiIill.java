package gg.corz;

public record liiIilliiiIill(boolean empty, String name, boolean greenPane) {
   private final String iliiIiIIiIiiiIiIIi;
   public static final liiIilliiiIill IIIIliIIilIIIliIIi = new liiIilliiiIill(true, "", false);
   private final boolean IliiIiIIilliiIiIIi;
   private final boolean liiiIiIIiiiiiIiIIi;

   public liiIilliiiIill(boolean empty, String greenPane, boolean name) {
      this.IliiIiIIilliiIiIIi = empty;
      this.iliiIiIIiIiiiIiIIi = greenPane;
      this.liiiIiIIiiiiiIiIIi = name;
   }

   public String liiiIIllIl() {
      return this.iliiIiIIiIiiiIiIIi;
   }

   public boolean iIlIlllllill() {
      return this.liiiIiIIiiiiiIiIIi;
   }

   public boolean IliIlllilIi() {
      return this.IliiIiIIilliiIiIIi;
   }
}
