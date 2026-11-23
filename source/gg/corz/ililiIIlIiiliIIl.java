package gg.corz;

import net.minecraft.class_2338;
import net.minecraft.class_2350;

public record ililiIIlIiiliIIl(class_2338 pos, int level, class_2350 side, IlIlIiilllIlIiil cls, int ticksHotbar, int ticksBest, int bestSlot, boolean crystalFloor, boolean solidFloor) {
   private final class_2350 liiIiIilIl;
   private final boolean IlIliIilIl;
   private final IlIlIiilllIlIiil iiiIiIilIl;
   private final int iIIliIilIl;
   private final int IIIliIilIl;
   private final int IiiIiIilIl;
   private final class_2338 iliIiIilIl;
   private final int lIIliIilIl;
   private final boolean llIliIilIl;

   public boolean IliIlllilIi(int maxTicks) {
      return this.iiiIiIilIl != IlIlIiilllIlIiil.illIiillil && this.lIIliIilIl != Integer.MAX_VALUE && this.lIIliIilIl <= maxTicks;
   }

   public int IIIllIIliIIl() {
      return this.lIIliIilIl;
   }

   public IlIlIiilllIlIiil lIiiIiIlilli() {
      return this.iiiIiIilIl;
   }

   public class_2350 IilliliilIIi() {
      return this.liiIiIilIl;
   }

   public class_2338 liiiIIllIl() {
      return this.iliIiIilIl;
   }

   public int iIlIlllllill() {
      return this.IiiIiIilIl;
   }

   public int iliIiiliiiii() {
      return this.IIIliIilIl;
   }

   public boolean IIlllIlliIll() {
      return this.llIliIilIl;
   }

   public int IlIlllIlilIl() {
      return this.iIIliIilIl;
   }

   public ililiIIlIiiliIIl(class_2338 crystalFloor, int ticksBest, class_2350 side, IlIlIiilllIlIiil ticksHotbar, int solidFloor, int pos, int level, boolean cls, boolean bestSlot) {
      this.iliIiIilIl = crystalFloor;
      this.IiiIiIilIl = ticksBest;
      this.liiIiIilIl = side;
      this.iiiIiIilIl = ticksHotbar;
      this.IIIliIilIl = solidFloor;
      this.lIIliIilIl = pos;
      this.iIIliIilIl = level;
      this.IlIliIilIl = cls;
      this.llIliIilIl = bestSlot;
   }

   public boolean IiIlliIliiIl() {
      return this.IlIliIilIl;
   }
}
