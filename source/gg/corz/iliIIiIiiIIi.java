package gg.corz;

import net.minecraft.class_1799;

record iliIIiIiiIIi(int swordSlot, int knockback, class_1799 sword, int crystalSlot, int obsidianSlot, int selectedItem) {
   private final int llIliiiiilIliiii;
   private final int liiIiiiiiiiIiiii;
   private final int iliIiiiiIiiIiiii;
   private final int IiIliiiiliIliiii;
   private final int iIIliiiiIlIliiii;
   private final class_1799 IIIliiiilIIliiii;

   public int liiiIIllIl() {
      return this.liiIiiiiiiiIiiii;
   }

   public int lIiiIiIlilli() {
      return this.llIliiiiilIliiii;
   }

   iliIIiIiiIIi(int selectedItem, int knockback, class_1799 swordSlot, int crystalSlot, int obsidianSlot, int sword) {
      this.iliIiiiiIiiIiiii = selectedItem;
      this.liiIiiiiiiiIiiii = knockback;
      this.IIIliiiilIIliiii = swordSlot;
      this.iIIliiiiIlIliiii = crystalSlot;
      this.llIliiiiilIliiii = obsidianSlot;
      this.IiIliiiiliIliiii = sword;
   }

   public int IliIlllilIi() {
      return this.iliIiiiiIiiIiiii;
   }

   public class_1799 iIlIlllllill() {
      return this.IIIliiiilIIliiii;
   }

   public int iliIiiliiiii() {
      return this.IiIliiiiliIliiii;
   }

   public int IilliliilIIi() {
      return this.iIIliiiiIlIliiii;
   }
}
