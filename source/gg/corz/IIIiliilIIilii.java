package gg.corz;

import net.minecraft.class_2350;

public final class IIIiliilIIilii {
   public final int lliiIliIIl;
   public final int liiiIliIIl;
   public final int iliiIliIIl;
   public final int IIIIlliIIl;
   public final int IiiiIliIIl;
   public final int iiiiIliIIl;

   int liiiIIllIl(class_2350.class_2351 a) {
      int var10000;
      switch (a) {
         case field_11048 -> var10000 = this.lliiIliIIl;
         case field_11052 -> var10000 = this.iliiIliIIl;
         case field_11051 -> var10000 = this.IiiiIliIIl;
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   int iIlIlllllill(class_2350.class_2351 a) {
      int var10000;
      switch (a) {
         case field_11048 -> var10000 = this.liiiIliIIl;
         case field_11052 -> var10000 = this.iiiiIliIIl;
         case field_11051 -> var10000 = this.IIIIlliIIl;
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   public IIIiliilIIilii(int maxZ, int minX, int minZ, int maxY, int minY, int maxX) {
      this.lliiIliIIl = maxZ;
      this.iliiIliIIl = minX;
      this.IiiiIliIIl = minZ;
      this.liiiIliIIl = maxY;
      this.iiiiIliIIl = minY;
      this.IIIIlliIIl = maxX;
   }

   public boolean IliIlllilIi(int x, int z, int y) {
      return x >= this.lliiIliIIl && x <= this.liiiIliIIl && z >= this.iliiIliIIl && z <= this.iiiiIliIIl && y >= this.IiiiIliIIl && y <= this.IIIIlliIIl;
   }
}
