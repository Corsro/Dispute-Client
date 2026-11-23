package gg.corz;

import net.minecraft.class_10185;
import net.minecraft.class_2596;
import net.minecraft.class_2793;
import net.minecraft.class_2813;
import net.minecraft.class_2815;
import net.minecraft.class_2824;
import net.minecraft.class_2828;
import net.minecraft.class_2846;
import net.minecraft.class_2848;
import net.minecraft.class_2851;
import net.minecraft.class_2868;
import net.minecraft.class_2879;
import net.minecraft.class_2885;
import net.minecraft.class_2886;
import net.minecraft.class_9836;
import net.minecraft.class_2848.class_2849;

public final class iIlllillIllllill {
   public static llIIiiililIIiiil IliIlllilIi(class_2596<?> p) {
      if (p == null) {
         return llIIiiililIIiiil.iiiliIIiil;
      } else if (p instanceof class_2828) {
         class_2828 var4 = (class_2828)p;
         return var4.method_36172() ? llIIiiililIIiiil.iilliIIiil : llIIiiililIIiiil.lilliIIiil;
      } else if (p instanceof class_9836) {
         return llIIiiililIIiiil.IiiliIIiil;
      } else if (p instanceof class_2851) {
         return llIIiiililIIiiil.IIiliIIiil;
      } else if (p instanceof class_2824) {
         class_2824 var3 = (class_2824)p;
         return IIIliiIilIIliiIi.IliIlllilIi(var3) ? llIIiiililIIiiil.liIliIIiil : llIIiiililIIiiil.iiIliIIiil;
      } else if (p instanceof class_2885) {
         return llIIiiililIIiiil.IIlliIIiil;
      } else if (p instanceof class_2886) {
         return llIIiiililIIiiil.lIlliIIiil;
      } else if (p instanceof class_2846) {
         class_2846 var2 = (class_2846)p;
         return iliIiiliiiii(var2.method_12363());
      } else if (p instanceof class_2868) {
         return llIIiiililIIiiil.IilliIIiil;
      } else if (p instanceof class_2879) {
         return llIIiiililIIiiil.liiliIIiil;
      } else if (p instanceof class_2848) {
         class_2848 var1 = (class_2848)p;
         return IIIllIIliIIl(var1.method_12365());
      } else if (p instanceof class_2813) {
         return llIIiiililIIiiil.IliliIIiil;
      } else if (p instanceof class_2815) {
         return llIIiiililIIiiil.lliliIIiil;
      } else {
         return p instanceof class_2793 ? llIIiiililIIiiil.ililiIIiil : llIIiiililIIiiil.iiiliIIiil;
      }
   }

   private iIlllillIllllill() {
   }

   public static float[] iIlIlllllill(class_2596<?> p) {
      if (p instanceof class_2828 var1) {
         if (var1.method_36172()) {
            return new float[]{var1.method_12271(0.0F), var1.method_12270(0.0F)};
         }
      }

      return null;
   }

   public static int liiiIIllIl(class_2596<?> p) {
      int var10000;
      if (p instanceof class_2868 var1) {
         var10000 = var1.method_12442();
      } else {
         var10000 = -1;
      }

      return var10000;
   }

   private static llIIiiililIIiiil IIIllIIliIIl(class_2848.class_2849 mode) {
      if (mode == class_2849.field_12981) {
         return llIIiiililIIiiil.lIiliIIiil;
      } else {
         return mode == class_2849.field_12985 ? llIIiiililIIiiil.iIiliIIiil : llIIiiililIIiiil.iiiliIIiil;
      }
   }

   private static llIIiiililIIiiil iliIiiliiiii(class_2846.class_2847 action) {
      if (action == null) {
         return llIIiiililIIiiil.iiiliIIiil;
      } else {
         llIIiiililIIiiil var10000;
         switch (action) {
            case field_12969:
               var10000 = llIIiiililIIiiil.illliIIiil;
               break;
            case field_12974:
               var10000 = llIIiiililIIiiil.IllliIIiil;
               break;
            case field_12975:
            case field_12970:
               var10000 = llIIiiililIIiiil.lllliIIiil;
               break;
            case field_12968:
            case field_12973:
            case field_12971:
               var10000 = llIIiiililIIiiil.iIlliIIiil;
               break;
            case field_63165:
               var10000 = llIIiiililIIiiil.liIliIIiil;
               break;
            default:
               var10000 = llIIiiililIIiiil.iiiliIIiil;
         }

         return var10000;
      }
   }

   public static class_10185 IilliliilIIi(class_2596<?> p) {
      class_10185 var10000;
      if (p instanceof class_2851 var1) {
         var10000 = var1.comp_3139();
      } else {
         var10000 = null;
      }

      return var10000;
   }

   public static float[] lIiiIiIlilli(class_2596<?> p) {
      float[] var10000;
      if (p instanceof class_2886 var1) {
         var10000 = new float[]{var1.method_60586(), var1.method_60587()};
      } else {
         var10000 = null;
      }

      return var10000;
   }
}
