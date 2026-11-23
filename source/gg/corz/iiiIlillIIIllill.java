package gg.corz;

import java.util.List;
import net.minecraft.class_2338;

record iiiIlillIIIllill(List<lliiIliiliiIli> boxes, List<class_2338> blocks, int raw, int exposed, int ghost) {
   private final int iIIiIIiill;
   private final int IlIiIIiill;
   private final List<class_2338> IIIiIIiill;
   private final int lIIiIIiill;
   private final List<lliiIliiliiIli> iiilIIiill;

   private iiiIlillIIIllill(List<lliiIliiliiIli> exposed, List<class_2338> blocks, int ghost, int raw, int boxes) {
      this.iiilIIiill = exposed;
      this.IIIiIIiill = blocks;
      this.lIIiIIiill = ghost;
      this.iIIiIIiill = raw;
      this.IlIiIIiill = boxes;
   }

   public int lIiiIiIlilli() {
      return this.IlIiIIiill;
   }

   public int iIlIlllllill() {
      return this.lIIiIIiill;
   }

   public List<class_2338> liiiIIllIl() {
      return this.IIIiIIiill;
   }

   public int IilliliilIIi() {
      return this.iIIiIIiill;
   }

   public List<lliiIliiliiIli> IliIlllilIi() {
      return this.iiilIIiill;
   }
}
