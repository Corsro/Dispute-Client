package gg.corz;

import com.corz.client.mixins.AccessorKeyBinding;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_3675;
import net.minecraft.class_4666;
import net.minecraft.class_3675.class_307;
import org.lwjgl.glfw.GLFW;

public final class IlillIillillIi {
   private final Map<class_304, Boolean> ilIlliIiiIiIlliIii = new LinkedHashMap();
   private final Map<class_304, Boolean> IlIlliIiillIlliIii = new LinkedHashMap();

   public double IlIlllIlilIl(class_304 positive, class_304 negative) {
      return (this.IIIllIIliIIl(positive) ? (double)1.0F : (double)0.0F) - (this.IIIllIIliIIl(negative) ? (double)1.0F : (double)0.0F);
   }

   public void liiiIIllIl() {
      this.IlIlliIiillIlliIii.clear();
   }

   public void lIiiIiIlilli() {
      this.IlIlliIiillIlliIii.clear();
      this.IilliliilIIi();
   }

   public void iliIiiliiiii() {
      for(Map.Entry var2 : this.ilIlliIiiIiIlliIii.entrySet()) {
         class_304 var3 = (class_304)var2.getKey();
         if (IIlllIlliIll(var3)) {
            if (var3 instanceof class_4666) {
               class_4666 var4 = (class_4666)var3;
               var4.method_73364();
            }

            illIilIilIil.IliIlllilIi(var3, (Boolean)var2.getValue());
         }
      }

      this.IlIlliIiillIlliIii.clear();
      this.ilIlliIiiIiIlliIii.clear();
   }

   private static boolean IIlllIlliIll(class_304 key) {
      class_310 var1 = class_310.method_1551();
      if (var1 != null && var1.field_1690 != null) {
         if (key == var1.field_1690.field_1832) {
            return (Boolean)var1.field_1690.method_42449().method_41753();
         } else {
            return key == var1.field_1690.field_1867 ? (Boolean)var1.field_1690.method_42450().method_41753() : false;
         }
      } else {
         return false;
      }
   }

   private static boolean Illlllllilll(class_304 key) {
      class_310 var1 = class_310.method_1551();
      if (var1 != null && var1.method_22683() != null && var1.method_1569()) {
         class_3675.class_306 var2 = ((AccessorKeyBinding)key).getBoundKey();
         if (var2 != null && var2.method_1444() >= 0) {
            if (var2.method_1442() == class_307.field_1668) {
               return class_3675.method_15987(var1.method_22683(), var2.method_1444());
            } else if (var2.method_1442() == class_307.field_1672) {
               return GLFW.glfwGetMouseButton(var1.method_22683().method_4490(), var2.method_1444()) == 1;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private static boolean IiIlliIliiIl(class_304 key) {
      return ((AccessorKeyBinding)key).getPressedRaw();
   }

   public void IliIlllilIi(class_304 down, boolean key) {
      if (down != null) {
         this.IlIlliIiillIlliIii.put(down, key);
      }

   }

   public void IilliliilIIi() {
      for(Map.Entry var2 : this.IlIlliIiillIlliIii.entrySet()) {
         class_304 var3 = (class_304)var2.getKey();
         if (!this.ilIlliIiiIiIlliIii.containsKey(var3)) {
            this.ilIlliIiiIiIlliIii.put(var3, IiIlliIliiIl(var3));
         }

         illIilIilIil.IliIlllilIi(var3, (Boolean)var2.getValue());
      }

      Iterator var4 = this.ilIlliIiiIiIlliIii.entrySet().iterator();

      while(var4.hasNext()) {
         Map.Entry var5 = (Map.Entry)var4.next();
         if (!this.IlIlliIiillIlliIii.containsKey(var5.getKey())) {
            illIilIilIil.IliIlllilIi((class_304)var5.getKey(), IIlllIlliIll((class_304)var5.getKey()) ? (Boolean)var5.getValue() : Illlllllilll((class_304)var5.getKey()));
            var4.remove();
         }
      }

      this.IlIlliIiillIlliIii.clear();
   }

   public boolean IIIllIIliIIl(class_304 key) {
      if (key == null) {
         return false;
      } else if (IIlllIlliIll(key)) {
         Boolean var2 = (Boolean)this.ilIlliIiiIiIlliIii.get(key);
         return var2 != null ? var2 : IiIlliIliiIl(key);
      } else {
         return Illlllllilll(key);
      }
   }

   public boolean iIlIlllllill() {
      return !this.ilIlliIiiIiIlliIii.isEmpty();
   }
}
