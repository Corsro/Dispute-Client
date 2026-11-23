package gg.corz;

import com.mojang.brigadier.suggestion.Suggestion;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1109;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1676;
import net.minecraft.class_1934;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_2588;
import net.minecraft.class_2596;
import net.minecraft.class_2639;
import net.minecraft.class_2675;
import net.minecraft.class_2703;
import net.minecraft.class_2739;
import net.minecraft.class_2765;
import net.minecraft.class_2767;
import net.minecraft.class_2805;
import net.minecraft.class_2960;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_7417;
import net.minecraft.class_7439;
import net.minecraft.class_7923;
import net.minecraft.class_2703.class_5893;

public final class iliIlIilIiiIlIil extends ilIllIiIll {
   private volatile List<String> IlllIIlIil;
   private Object llllIIlIil;
   private final IiiiiIilliiiiIil IiIlIIlIil = new IiiiiIilliiiiIil();
   private int IillIIlIil = -(-1690489094 << 3 | -1690489094 >>> 29) ^ 638986244;
   private final Map<String, Long> lIllIIlIil = new HashMap();
   private final ConcurrentLinkedQueue<lIliliIlil> iiIlIIlIil = new ConcurrentLinkedQueue();
   private final lllliilillliil liIlIIlIil = new lllliilillliil();
   private final Set<Integer> IIllIIlIil = ConcurrentHashMap.newKeySet();
   private final Deque<iIiiiIilIliiiIil> iIllIIlIil = new ArrayDeque();
   private int illlIIlIil;
   private static final double ilIlIIlIil = (double)4096.0F;

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + 'ꇓ'))) - var5) ^ var5) - 28485) ^ '\uf787') ^ '낚'))) - '艭') ^ 22155) - '린') << 2 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + 'ꇓ'))) - var5) ^ var5) - 28485) ^ '\uf787') ^ '낚'))) - '艭') ^ 22155) - '린') >>> 14) ^ 4898) + 2386) ^ 'ꭑ') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static long lliililiil() {
      return System.currentTimeMillis();
   }

   private boolean llIililIil(String name) {
      if (name == null) {
         return false;
      } else {
         String var2 = name.toLowerCase(Locale.ROOT);
         long var3 = lliililiil();
         return this.iIllIIlIil.stream().anyMatch((line) -> var3 - line.llIIiilIil < (-6298364803633148003L ^ -6298364803633147683L) && line.IlIIiilIil.toLowerCase(Locale.ROOT).contains(var2) && (line.IlIIiilIil.toLowerCase(Locale.ROOT).contains(IliIlllilIi<invokedynamic>()) || line.IlIIiilIil.toLowerCase(Locale.ROOT).contains(IliIlllilIi<invokedynamic>()) || line.IlIIiilIil.toLowerCase(Locale.ROOT).contains(IliIlllilIi<invokedynamic>())));
      }
   }

   private void IIllllIlll(int entityId) {
      class_1297 var3 = Iiiilllliiilll.field_1687.method_8469(entityId);
      if (var3 instanceof class_1657 var2) {
         if (var2 != Iiiilllliiilll.field_1724 && var2.method_5767() && var2.method_5858(Iiiilllliiilll.field_1724) <= Double.longBitsToDouble(4870242424765702146L ^ 227031208946720770L) && this.IiIlIIlIil.liiiIIllIl(var2.method_5667())) {
            this.Ilillllill(var2.method_5667(), this.IiIlIIlIil.iIlIlllllill(var2.method_5667()), IiiIIIliliiIIIli.lIIIllIlIi, IliIlllilIi<invokedynamic>());
         }
      }

   }

   private boolean liilliiill(class_243 point) {
      if (point != null && !(point.method_1025(Iiiilllliiilll.field_1724.method_73189()) > (double)4096.0F)) {
         for(class_1297 var3 : Iiiilllliiilll.field_1687.method_18112()) {
            if (var3 != Iiiilllliiilll.field_1724) {
               if (var3 instanceof class_1657) {
                  class_1657 var4 = (class_1657)var3;
                  if (!var4.method_5767() && var3.method_73189().method_1025(point) <= (double)16.0F) {
                     return true;
                  }
               }

               if (var3 instanceof class_1676 && var3.method_73189().method_1025(point) <= (double)16.0F) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return true;
      }
   }

   protected void Iilililiiili() {
      this.lIliliIlil();
   }

   private void Ilillllill(UUID id, String clue, IiiIIIliliiIIIli detail, String subject) {
      llilllllililllll var5 = this.liIlIIlIil.IliIlllilIi(id, clue, detail, subject, lliililiil());
      if (var5.lIiiIiIlilli()) {
         String var6 = liIlliIiiiIlliIi.Iillllilll(var5.liiiIIllIl());
         String var7 = var6 + IliIlllilIi<invokedynamic>() + var5.iIlIlllllill() + IliIlllilIi<invokedynamic>() + var5.IilliliilIIi() + IliIlllilIi<invokedynamic>();
         Iiiilllliiilll.field_1724.method_7353(class_2561.method_43470(IliIlllilIi<invokedynamic>() + var7), false);
         Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<invokedynamic>(), var7, false);
         Iiiilllliiilll.method_1483().method_4873(class_1109.method_4757(class_3417.field_15203, 1.0F, 1.0F));
      }
   }

   private static boolean illilIilil(String value) {
      String var1 = IIiillIiil(value);
      return (var1.contains(IliIlllilIi<invokedynamic>()) || var1.contains(IliIlllilIi<invokedynamic>()) || var1.contains(IliIlllilIi<invokedynamic>()) || var1.contains(IliIlllilIi<invokedynamic>()) || var1.contains(IliIlllilIi<invokedynamic>()) || var1.contains(IliIlllilIi<invokedynamic>()) || var1.contains(IliIlllilIi<invokedynamic>())) && (var1.contains(IliIlllilIi<invokedynamic>()) || var1.contains(IliIlllilIi<invokedynamic>()) || var1.contains(IliIlllilIi<invokedynamic>()) || var1.contains(IliIlllilIi<invokedynamic>()));
   }

   private UUID Illillllil(class_2561 text) {
      if (text != null) {
         class_7417 var3 = text.method_10851();
         if (var3 instanceof class_2588) {
            class_2588 var2 = (class_2588)var3;
            if (IliIlllilIi<invokedynamic>().equals(var2.method_11022()) && var2.method_11023().length != 0) {
               Object var6 = var2.method_11023()[0];
               String var10000;
               if (var6 instanceof class_2561) {
                  class_2561 var5 = (class_2561)var6;
                  var10000 = var5.getString();
               } else {
                  var10000 = String.valueOf(var6);
               }

               String var4 = var10000;
               return this.IiIlIIlIil.IilliliilIIi(var4);
            }
         }
      }

      return null;
   }

   private void lllllillll(class_243 sound, String point) {
      if (illilIilil(point) && !this.liilliiill(sound)) {
         String var3 = this.IiIilliIil(sound);
         this.ilillIiill(IliIlllilIi<invokedynamic>() + var3 + IIiillIiil(point), (UUID)null, var3, IiiIIIliliiIIIli.IlIIllIlIi, IliIlllilIi<invokedynamic>(), -2412575630095131436L ^ -2412575630095133836L);
      }
   }

   private static String IIiillIiil(String value) {
      long var2 = -3952348811750376344L;
      if (value == null) {
         return IliIlllilIi<invokedynamic>();
      } else {
         var2 ^= ((long)value.indexOf(--1960892740 * -1643291835 ^ 1850325870) << 32 ^ var2) & -1L << 32;
         return ((int)(var2 >>> 32) < 0 ? value : value.substring((int)(var2 >>> 32) + 1)).toLowerCase(Locale.ROOT);
      }
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 9713) << 2 | (char)(var4[var5] - 9713) >>> 14) << 14 | (char)((char)(var4[var5] - 9713) << 2 | (char)(var4[var5] - 9713) >>> 14) >>> 2) ^ '鷄') + '쪘') + var5) + 32528) ^ 23045) - var5) - var5) << 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 9713) << 2 | (char)(var4[var5] - 9713) >>> 14) << 14 | (char)((char)(var4[var5] - 9713) << 2 | (char)(var4[var5] - 9713) >>> 14) >>> 2) ^ '鷄') + '쪘') + var5) + 32528) ^ 23045) - var5) - var5) >>> 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static String iIiilIliil(class_3414 sound) {
      return sound != null && sound.comp_3319() != null ? sound.comp_3319().toString() : "";
   }

   private void IlIllllIll() {
      for(class_1657 var2 : Iiiilllliiilll.field_1687.method_18456()) {
         if (var2 != Iiiilllliiilll.field_1724 && var2.method_5767() && !(var2.method_5858(Iiiilllliiilll.field_1724) > (double)4096.0F) && this.IiIlIIlIil.liiiIIllIl(var2.method_5667())) {
            this.Ilillllill(var2.method_5667(), this.IiIlIIlIil.iIlIlllllill(var2.method_5667()), IiiIIIliliiIIIli.lIIIllIlIi, IliIlllilIi<invokedynamic>());
         }
      }

   }

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.method_1562() != null) {
         if (this.llllIIlIil != null && this.llllIIlIil != Iiiilllliiilll.field_1687) {
            this.lIliliIlil();
         }

         this.llllIIlIil = Iiiilllliiilll.field_1687;
         ++this.illlIIlIil;
         this.ilIllIiIll();
         if (this.illlIIlIil % 5 == 0) {
            this.lIIlliIIll();
            this.IlIllllIll();
         }

         if (this.illlIIlIil % 120 == 0) {
            this.iilllIIill();
         }

         this.lIilliIill();
         this.iiIilIIlil();
      } else {
         this.lIliliIlil();
      }
   }

   private void iIIilIlIil(String text) {
      this.iIllIIlIil.addLast(new iIiiiIilIliiiIil(text, lliililiil()));

      while(this.iIllIIlIil.size() > 48) {
         this.iIllIIlIil.removeFirst();
      }

   }

   private boolean IIIillIIil(class_243 particle, String point) {
      if (!IIiillIiil(point).contains(IliIlllilIi<invokedynamic>())) {
         return false;
      } else {
         class_2338 var3 = class_2338.method_49638(particle);

         for(int var4 = -2; var4 <= 2; ++var4) {
            for(int var5 = -2; var5 <= 2; ++var5) {
               for(int var6 = -2; var6 <= 2; ++var6) {
                  class_2960 var7 = class_7923.field_41175.method_10221(Iiiilllliiilll.field_1687.method_8320(var3.method_10069(var4, var5, var6)).method_26204());
                  String var8 = IIiillIiil(var7 == null ? "" : var7.toString());
                  if (var8.contains(IliIlllilIi<invokedynamic>()) || var8.contains(IliIlllilIi<invokedynamic>()) || var8.contains(IliIlllilIi<invokedynamic>()) || var8.contains(IliIlllilIi<invokedynamic>()) || var8.contains(IliIlllilIi<invokedynamic>())) {
                     return true;
                  }
               }
            }
         }

         return false;
      }
   }

   private void liIlliiIll(UUID id, String mode) {
      if (id != null && this.IiIlIIlIil.liiiIIllIl(id) && class_1934.field_9219.method_8381().equals(mode)) {
         this.Ilillllill(id, this.IiIlIIlIil.iIlIlllllill(id), IiiIIIliliiIIIli.IIIIllIlIi, IliIlllilIi<invokedynamic>());
      }

   }

   public List<IilIilIllilIilIl> iiiIlIIIll() {
      return this.liIlIIlIil.iIlIlllllill(lliililiil()).stream().limit(4L).map((decision) -> new IilIilIllilIilIl(decision.liiiIIllIl(), decision.iIlIlllllill())).toList();
   }

   private void iIlllIllll(int sound, String entityId) {
      if (illilIilil(entityId)) {
         class_1297 var4 = Iiiilllliiilll.field_1687.method_8469(sound);
         if (var4 instanceof class_1657) {
            class_1657 var3 = (class_1657)var4;
            if (var3 != Iiiilllliiilll.field_1724 && var3.method_5767() && this.IiIlIIlIil.liiiIIllIl(var3.method_5667())) {
               this.Ilillllill(var3.method_5667(), this.IiIlIIlIil.iIlIlllllill(var3.method_5667()), IiiIIIliliiIIIli.iIIIllIlIi, IliIlllilIi<invokedynamic>());
            }
         }

      }
   }

   private void ilIllIiIll() {
      for(int var1 = 0; var1 < 384; ++var1) {
         lIliliIlil var2 = (lIliliIlil)this.iiIlIIlIil.poll();
         if (var2 == null) {
            break;
         }

         switch (var2.ilIilliIiIilli.ordinal()) {
            case 0:
               this.liIlliiIll(var2.liIilliiiIilli, var2.iililliIIiilli);
               break;
            case 1:
               this.IIllllIlll(var2.IIlillilIlilli);
               break;
            case 2:
               this.iIlllIllll(var2.IIlillilIlilli, var2.iililliIIiilli);
               break;
            case 3:
               this.lllllillll(var2.lIiiIiIlilli(), var2.iililliIIiilli);
               break;
            case 4:
               this.Iillllilll(var2.lIiiIiIlilli(), var2.iililliIIiilli);
               break;
            case 5:
               this.iIIilIlIil(var2.iililliIIiilli);
               break;
            case 6:
               this.liIlIIlIil.liiiIIllIl(var2.liIilliiiIilli);
         }
      }

      while(this.iiIlIIlIil.size() > 2048) {
         this.iiIlIIlIil.poll();
      }

   }

   private void Iillllilll(class_243 particle, String point) {
      if (lililiilil(point) && !this.liilliiill(particle) && !this.IIIillIIil(particle, point)) {
         String var3 = this.IiIilliIil(particle);
         this.ilillIiill(IliIlllilIi<invokedynamic>() + var3 + IIiillIiil(point), (UUID)null, var3, IiiIIIliliiIIIli.llIIllIlIi, IliIlllilIi<invokedynamic>(), 1809503060858530444L ^ 1809503060858529068L);
      }
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) << 9) >>> 1 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) << 9) << 15) << 15 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) << 9) >>> 1 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) << 9) << 15) >>> 1) ^ var5) >>> 2 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) << 9) >>> 1 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) << 9) << 15) << 15 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) << 9) >>> 1 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) << 9) << 15) >>> 1) ^ var5) << 14) << 10 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) << 9) >>> 1 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) << 9) << 15) << 15 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) << 9) >>> 1 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) << 9) << 15) >>> 1) ^ var5) >>> 2 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) << 9) >>> 1 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) << 9) << 15) << 15 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) << 9) >>> 1 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ '锔'))))) - 23219) - '\uf133') + 'ﱬ') - var5) << 12) - var5))) << 9) << 15) >>> 1) ^ var5) << 14) >>> 6) + '욭'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void Illillliilli() {
      this.lIliliIlil();
      this.lIIlliIIll();
   }

   private void lIilliIill() {
      List var1 = this.IlllIIlIil;
      if (var1 != null) {
         this.IlllIIlIil = null;
         Set var2 = this.IiIlIIlIil.lIiiIiIlilli(Iiiilllliiilll);
         List var3 = var1.stream().filter(IiiiiIilliiiiIil::IIIllIIliIIl).filter((name) -> !var2.contains(name.toLowerCase(Locale.ROOT))).filter((name) -> !name.equalsIgnoreCase(Iiiilllliiilll.field_1724.method_5477().getString())).filter((name) -> !this.llIililIil(name)).toList();
         if (var3.size() <= 3) {
            for(String var5 : var3) {
               this.Ilillllill(this.IiIlIIlIil.IilliliilIIi(var5), var5, IiiIIIliliiIIIli.iiiiIlIlIi, IliIlllilIi<invokedynamic>());
            }

         }
      }
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -100619198373915275L ^ Long.rotateLeft(2119520499410115464L, 16) ^ 5270345218173159409L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2902938356676723383L ^ Long.rotateLeft(6635904086887580134L, 59) ^ -4402662763841014748L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -4914518174954216518L ^ Long.rotateLeft(8985114580270092960L, 2) ^ -3656998161991471179L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6010713748928614862L ^ Long.rotateLeft(-4672202428071701145L, 30) ^ -6841881364138527750L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -6636906053145674209L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1575689947179376209L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5886245798693492817L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3442158171104749805L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7180172171645529482L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -8880783294206396371L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(liiiIIllIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iIlIlllllill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IilliliilIIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, lIiiIiIlilli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iliIiiliiiii<invokedynamic>());
      byte[] var13 = var11.decode(var3);
      var12.init(2, var10, new GCMParameterSpec(128, var13, 0, 12));
      byte[] var15 = var12.doFinal(var13, 12, var13.length - 12);
      String var16 = new String(var15, StandardCharsets.UTF_8);
      Arrays.fill(var4, (byte)0);
      Arrays.fill(var5, (byte)0);
      Arrays.fill(var6, (byte)0);
      Arrays.fill(var8, (byte)0);
      Arrays.fill(var9, (byte)0);
      Arrays.fill(var15, (byte)0);
      MethodHandle var17 = MethodHandles.constant(String.class, var16);
      return new ConstantCallSite(var17);
   }

   private String IiIilliIil(class_243 point) {
      class_243 var2 = Iiiilllliiilll.field_1724.method_73189();
      double var3 = point.field_1352 - var2.field_1352;
      double var5 = point.field_1351 - var2.field_1351;
      double var7 = point.field_1350 - var2.field_1350;
      String var9 = var7 < Double.longBitsToDouble(1571367773067110399L ^ -6179327185637513217L) ? IliIlllilIi<invokedynamic>() : (var7 > Double.longBitsToDouble(-2119235580012396428L ^ -2493034349084147596L) ? IliIlllilIi<invokedynamic>() : "");
      String var10 = var3 < Double.longBitsToDouble(6519308326303228308L ^ -1906926576506969708L) ? IliIlllilIi<invokedynamic>() : (var3 > Double.longBitsToDouble(3439175983784408250L ^ 1173865371217048762L) ? IliIlllilIi<invokedynamic>() : "");
      return Math.round(Math.sqrt(var3 * var3 + var5 * var5 + var7 * var7)) + IliIlllilIi<invokedynamic>() + var9 + var10;
   }

   private void iiIilIIlil() {
      long var1 = lliililiil();

      while(!this.iIllIIlIil.isEmpty() && var1 - ((iIiiiIilIliiiIil)this.iIllIIlIil.peekFirst()).llIIiilIil > 8000L) {
         this.iIllIIlIil.removeFirst();
      }

      this.lIllIIlIil.entrySet().removeIf((timestamp) -> var1 - (Long)timestamp.getValue() > (3225693962436829388L ^ 3225693962436840108L));
      this.liIlIIlIil.iIlIlllllill(var1);
   }

   private void lIIlliIIll() {
      long var1 = lliililiil();

      for(llIiIlIiilIiIlIi var4 : this.IiIlIIlIil.IliIlllilIi(Iiiilllliiilll, var1)) {
         if (!this.llIililIil(var4.liiiIIllIl())) {
            this.Ilillllill(var4.IliIlllilIi(), var4.liiiIIllIl(), IiiIIIliliiIIIli.liiiIlIlIi, IliIlllilIi<invokedynamic>());
         } else {
            this.liIlIIlIil.liiiIIllIl(var4.IliIlllilIi());
         }
      }

   }

   public iliIlIilIiiIlIil() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.iIIlIIIiIlIlIIIi);
   }

   private void iilllIIill() {
      int var1 = this.IillIIlIil++;
      if (this.IillIIlIil > 49000) {
         this.IillIIlIil = 41000;
      }

      this.IIllIIlIil.add(var1);

      while(this.IIllIIlIil.size() > 6) {
         this.IIllIIlIil.remove(this.IIllIIlIil.iterator().next());
      }

      try {
         Iiiilllliiilll.method_1562().method_52787(new class_2805(var1, IliIlllilIi<invokedynamic>()));
      } catch (Throwable var3) {
         this.IIllIIlIil.remove(var1);
      }

   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - var5) ^ 27715) + var5) << 13 | (char)((char)((char)(var4[var5] - var5) ^ 27715) + var5) >>> 3))) - var5) - 'ﱌ') ^ var5) + 24108) << 13 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - var5) ^ 27715) + var5) << 13 | (char)((char)((char)(var4[var5] - var5) ^ 27715) + var5) >>> 3))) - var5) - 'ﱌ') ^ var5) + 24108) >>> 3))) + 14284) ^ '요'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void ilillIiill(String detail, UUID subject, String id, IiiIIIliliiIIIli clue, String delay, long key) {
      long var8 = lliililiil();
      if (var8 - (Long)this.lIllIIlIil.getOrDefault(detail, 0L) >= key) {
         this.lIllIIlIil.put(detail, var8);
         this.Ilillllill(subject, id, clue, delay);
      }
   }

   private static boolean lililiilil(String value) {
      String var1 = IIiillIiil(value);
      return var1.contains(IliIlllilIi<invokedynamic>()) || var1.contains(IliIlllilIi<invokedynamic>()) || var1.contains(IliIlllilIi<invokedynamic>()) || var1.contains(IliIlllilIi<invokedynamic>());
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '遙') ^ 'ꈎ') - var5) - var5) - var5) << 8 | (char)((char)((char)((char)((char)(var4[var5] ^ '遙') ^ 'ꈎ') - var5) - var5) - var5) >>> 8) + var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '遙') ^ 'ꈎ') - var5) - var5) - var5) << 8 | (char)((char)((char)((char)((char)(var4[var5] ^ '遙') ^ 'ꈎ') - var5) - var5) - var5) >>> 8) + var5) << 5) + var5) + 16992) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '遙') ^ 'ꈎ') - var5) - var5) - var5) << 8 | (char)((char)((char)((char)((char)(var4[var5] ^ '遙') ^ 'ꈎ') - var5) - var5) - var5) >>> 8) + var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '遙') ^ 'ꈎ') - var5) - var5) - var5) << 8 | (char)((char)((char)((char)((char)(var4[var5] ^ '遙') ^ 'ꈎ') - var5) - var5) - var5) >>> 8) + var5) << 5) + var5) + 16992) >>> 15) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '遙') ^ 'ꈎ') - var5) - var5) - var5) << 8 | (char)((char)((char)((char)((char)(var4[var5] ^ '遙') ^ 'ꈎ') - var5) - var5) - var5) >>> 8) + var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '遙') ^ 'ꈎ') - var5) - var5) - var5) << 8 | (char)((char)((char)((char)((char)(var4[var5] ^ '遙') ^ 'ꈎ') - var5) - var5) - var5) >>> 8) + var5) << 5) + var5) + 16992) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '遙') ^ 'ꈎ') - var5) - var5) - var5) << 8 | (char)((char)((char)((char)((char)(var4[var5] ^ '遙') ^ 'ꈎ') - var5) - var5) - var5) >>> 8) + var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '遙') ^ 'ꈎ') - var5) - var5) - var5) << 8 | (char)((char)((char)((char)((char)(var4[var5] ^ '遙') ^ 'ꈎ') - var5) - var5) - var5) >>> 8) + var5) << 5) + var5) + 16992) >>> 15) >>> 6) + '쓬'))) ^ var5) - var5) + var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void IiIIlliIIl(IliIliIllliIliIl event) {
      class_2596 var2 = event.iilIIiiIll;
      if (var2 instanceof class_2639 var3) {
         if (this.IIllIIlIil.remove(var3.comp_2262())) {
            ArrayList var15 = new ArrayList();

            for(Suggestion var12 : var3.method_11397().getList()) {
               String var13 = var12.getText();
               if (var13 != null && !var13.isBlank()) {
                  var15.add(var13.trim());
               }
            }

            this.IlllIIlIil = var15;
            event.IliIlllilIi();
            return;
         }
      }

      if (var2 instanceof class_2703 var4) {
         if (var4.method_46327().contains(class_5893.field_29137)) {
            var4.method_46329().stream().filter((entry) -> entry.comp_1110() != null).forEach((entry) -> this.iiIlIIlIil.offer(lIliliIlil.IliIlllilIi(iIilllllIlilllll.iiilIiIill, entry.comp_1106(), entry.comp_1110().method_8381())));
            return;
         }
      }

      if (var2 instanceof class_2739 var5) {
         this.iiIlIIlIil.offer(lIliliIlil.liiiIIllIl(iIilllllIlilllll.IIIiIiIill, var5.comp_1127(), ""));
      } else if (var2 instanceof class_2765 var6) {
         this.iiIlIIlIil.offer(lIliliIlil.liiiIIllIl(iIilllllIlilllll.lIIiIiIill, var6.method_11883(), iIiilIliil((class_3414)var6.method_11882().comp_349())));
      } else if (var2 instanceof class_2767 var7) {
         this.iiIlIIlIil.offer(lIliliIlil.iIlIlllllill(iIilllllIlilllll.iIIiIiIill, var7.method_11890(), var7.method_11889(), var7.method_11893(), iIiilIliil((class_3414)var7.method_11894().comp_349())));
      } else if (var2 instanceof class_2675 var8) {
         class_2960 var10 = class_7923.field_41180.method_10221(var8.method_11551().method_10295());
         this.iiIlIIlIil.offer(lIliliIlil.iIlIlllllill(iIilllllIlilllll.IlIiIiIill, var8.method_11544(), var8.method_11547(), var8.method_11546(), var10 == null ? "" : var10.toString()));
      } else if (var2 instanceof class_7439 var9) {
         String var14 = var9.comp_763() == null ? "" : var9.comp_763().getString();
         if (!var14.isBlank()) {
            this.iiIlIIlIil.offer(lIliliIlil.IilliliilIIi(iIilllllIlilllll.llIiIiIill, var14));
         }

         UUID var11 = this.Illillllil(var9.comp_763());
         if (var11 != null) {
            this.iiIlIIlIil.offer(lIliliIlil.IliIlllilIi(iIilllllIlilllll.ilIiIiIill, var11, ""));
         }
      }

   }

   private void lIliliIlil() {
      this.IiIlIIlIil.iliIiiliiiii();
      this.liIlIIlIil.IilliliilIIi();
      this.iiIlIIlIil.clear();
      this.IIllIIlIil.clear();
      this.lIllIIlIil.clear();
      this.iIllIIlIil.clear();
      this.IlllIIlIil = null;
      this.llllIIlIil = null;
      this.illlIIlIil = 0;
      this.IillIIlIil = (~-1082778582 >>> 1 | ~-1082778582 << 31) ^ -1606135358;
   }
}
