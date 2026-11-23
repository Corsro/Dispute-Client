package gg.corz;

import java.util.List;

public record lliIllliliIlll(List<Ilililllilil> exposed, List<Ilililllilil> dig, int reachable, int lavaFloor, int wet, int hard) {
   private final int liIliIiiliiIliIiil;
   private final List<Ilililllilil> IlIliIiilllIliIiil;
   private final List<Ilililllilil> lIIliIiiliIIliIiil;
   private final int ilIliIiilIiIliIiil;
   private final int iIlliIiilIllliIiil;
   private final int IIlliIiillIlliIiil;

   public int IlIlllIlilIl() {
      return this.IIlliIiillIlliIiil;
   }

   public boolean IliIlllilIi(boolean allowDig) {
      return !this.lIIliIiiliIIliIiil.isEmpty() || allowDig && !this.IlIliIiilllIliIiil.isEmpty();
   }

   public int IIIllIIliIIl() {
      return this.liIliIiiliiIliIiil;
   }

   public int iliIiiliiiii() {
      return this.ilIliIiilIiIliIiil;
   }

   public List<Ilililllilil> iIlIlllllill(boolean allowDig) {
      return this.lIIliIiiliIIliIiil.isEmpty() && allowDig ? this.IlIliIiilllIliIiil : this.lIIliIiiliIIliIiil;
   }

   public List<Ilililllilil> IilliliilIIi() {
      return this.lIIliIiiliIIliIiil;
   }

   public Ilililllilil liiiIIllIl(boolean allowDig) {
      if (!this.lIIliIiiliIIliIiil.isEmpty()) {
         return (Ilililllilil)this.lIIliIiiliIIliIiil.get(0);
      } else {
         return allowDig && !this.IlIliIiilllIliIiil.isEmpty() ? (Ilililllilil)this.IlIliIiilllIliIiil.get(0) : null;
      }
   }

   public List<Ilililllilil> lIiiIiIlilli() {
      return this.IlIliIiilllIliIiil;
   }

   public lliIllliliIlll(List<Ilililllilil> exposed, List<Ilililllilil> reachable, int hard, int dig, int lavaFloor, int wet) {
      this.lIIliIiiliIIliIiil = exposed;
      this.IlIliIiilllIliIiil = reachable;
      this.ilIliIiilIiIliIiil = hard;
      this.liIliIiiliiIliIiil = dig;
      this.IIlliIiillIlliIiil = lavaFloor;
      this.iIlliIiilIllliIiil = wet;
   }

   public int IiIlliIliiIl() {
      return this.iIlliIiilIllliIiil;
   }
}
