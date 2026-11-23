package gg.corz;

import java.util.List;

public record iiillliIIIilli(List<iiliilIlIIiiilIl> steps, boolean reached, int expanded) {
   private final boolean IlIIliIIIl;
   private final List<iiliilIlIIiiilIl> iIIIliIIIl;
   private final int llIIliIIIl;

   public List<iiliilIlIIiiilIl> IliIlllilIi() {
      return this.iIIIliIIIl;
   }

   public int iIlIlllllill() {
      return this.llIIliIIIl;
   }

   public iiillliIIIilli(List<iiliilIlIIiiilIl> reached, boolean expanded, int steps) {
      this.iIIIliIIIl = reached;
      this.IlIIliIIIl = expanded;
      this.llIIliIIIl = steps;
   }

   public boolean liiiIIllIl() {
      return this.IlIIliIIIl;
   }
}
