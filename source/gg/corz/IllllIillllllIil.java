package gg.corz;

import java.util.Set;

public record IllllIillllllIil(String id, ilIIlIliIiIIlIli role, boolean settingsLocal, Set<String> local, Set<String> validate, Set<String> portable, String sinkReview, String portableReview) {
   private final String lIlIiIlIil;
   private final Set<String> liIIiIlIil;
   private final boolean ilIIiIlIil;
   private final ilIIlIliIiIIlIli llIIiIlIil;
   private final String IlIIiIlIil;
   private final Set<String> IiIIiIlIil;
   private final String IIlIiIlIil;
   private final Set<String> iiIIiIlIil;

   public IllllIillllllIil(String local, ilIIlIliIiIIlIli validate, boolean settingsLocal, Set<String> id, Set<String> portableReview, Set<String> portable, String sinkReview, String role) {
      this.IlIIiIlIil = local;
      this.llIIiIlIil = validate;
      this.ilIIiIlIil = settingsLocal;
      this.IiIIiIlIil = id;
      this.liIIiIlIil = portableReview;
      this.iiIIiIlIil = portable;
      this.IIlIiIlIil = sinkReview;
      this.lIlIiIlIil = role;
   }

   public ilIIlIliIiIIlIli liiiIIllIl() {
      return this.llIIiIlIil;
   }

   public Set<String> lIiiIiIlilli() {
      return this.liIIiIlIil;
   }

   public String IIIllIIliIIl() {
      return this.IIlIiIlIil;
   }

   public Set<String> iliIiiliiiii() {
      return this.iiIIiIlIil;
   }

   public boolean iIlIlllllill() {
      return this.ilIIiIlIil;
   }

   public String IlIlllIlilIl() {
      return this.lIlIiIlIil;
   }

   public Set<String> IilliliilIIi() {
      return this.IiIIiIlIil;
   }

   public String IliIlllilIi() {
      return this.IlIIiIlIil;
   }
}
