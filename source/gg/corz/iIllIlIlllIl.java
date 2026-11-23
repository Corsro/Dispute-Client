package gg.corz;

import net.minecraft.class_1268;
import net.minecraft.class_1657;
import net.minecraft.class_1747;
import net.minecraft.class_1750;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2248;
import net.minecraft.class_2680;
import net.minecraft.class_3965;

public final class iIllIlIlllIl {
   public static class_2680 liiiIIllIl(class_1657 block, class_1268 hit, class_1799 player, class_3965 stack, class_2248 hand) {
      if (block != null && player != null && stack != null && hand != null) {
         if (!(player.method_7909() instanceof class_1747)) {
            return null;
         } else {
            class_1750 var5 = new class_1750(block, hit, player, stack);
            return hand.method_9605(var5);
         }
      } else {
         return null;
      }
   }

   public static class_2680 IliIlllilIi(class_1657 hit, class_1268 hand, class_1799 stack, class_3965 player) {
      if (hit != null && stack != null && player != null) {
         class_1792 var5 = stack.method_7909();
         if (var5 instanceof class_1747) {
            class_1747 var4 = (class_1747)var5;
            class_1750 var7 = new class_1750(hit, hand, stack, player);
            class_2248 var6 = var4.method_7711();
            return var6.method_9605(var7);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private iIllIlIlllIl() {
   }
}
