package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2346;
import net.minecraft.class_2680;
import net.minecraft.class_2682;
import net.minecraft.class_7923;
import net.minecraft.class_9334;

public enum IIilIiilIilIii {
   IiiliilIIl(IIlllIlliIll<invokedynamic>(), (ilIlIiilIiIlIiil)null),
   lllliilIIl(IIlllIlliIll<invokedynamic>(), (ilIlIiilIiIlIiil)null),
   ilIliilIIl(IIlllIlliIll<invokedynamic>(), ilIlIiilIiIlIiil.lliIiillil);

   private final ilIlIiilIiIlIiil llIiiilIIl;
   IilliilIIl(IIlllIlliIll<invokedynamic>(), (ilIlIiilIiIlIiil)null),
   IllliilIIl(IIlllIlliIll<invokedynamic>(), (ilIlIiilIiIlIiil)null),
   lIlliilIIl(IIlllIlliIll<invokedynamic>(), ilIlIiilIiIlIiil.iiiIiillil),
   lIIiiilIIl(IIlllIlliIll<invokedynamic>(), (ilIlIiilIiIlIiil)null),
   illliilIIl(IIlllIlliIll<invokedynamic>(), (ilIlIiilIiIlIiil)null),
   iIiliilIIl(IIlllIlliIll<invokedynamic>(), (ilIlIiilIiIlIiil)null),
   IlIliilIIl(IIlllIlliIll<invokedynamic>(), ilIlIiilIiIlIiil.lIiIiillil),
   IiIliilIIl(IIlllIlliIll<invokedynamic>(), ilIlIiilIiIlIiil.IliIiillil),
   lliliilIIl(IIlllIlliIll<invokedynamic>(), (ilIlIiilIiIlIiil)null),
   ililiilIIl(IIlllIlliIll<invokedynamic>(), (ilIlIiilIiIlIiil)null),
   iIIliilIIl(IIlllIlliIll<invokedynamic>(), ilIlIiilIiIlIiil.IIiIiillil);

   private final String IlIiiilIIl;
   iiIliilIIl(IIlllIlliIll<invokedynamic>(), ilIlIiilIiIlIiil.IiiIiillil),
   lIIliilIIl(IIlllIlliIll<invokedynamic>(), (ilIlIiilIiIlIiil)null),
   IIlliilIIl(IIlllIlliIll<invokedynamic>(), ilIlIiilIiIlIiil.liiIiillil),
   iilliilIIl(IIlllIlliIll<invokedynamic>(), (ilIlIiilIiIlIiil)null),
   IIIiiilIIl(IIlllIlliIll<invokedynamic>(), (ilIlIiilIiIlIiil)null),
   iIlliilIIl(IIlllIlliIll<invokedynamic>(), (ilIlIiilIiIlIiil)null),
   lIiliilIIl(IIlllIlliIll<invokedynamic>(), (ilIlIiilIiIlIiil)null),
   liiliilIIl(IIlllIlliIll<invokedynamic>(), (ilIlIiilIiIlIiil)null);

   private static final Set<String> iIIiiilIIl = Set.of(IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>());
   liIliilIIl(IIlllIlliIll<invokedynamic>(), ilIlIiilIiIlIiil.iliIiillil),
   iiiliilIIl(IIlllIlliIll<invokedynamic>(), (ilIlIiilIiIlIiil)null),
   IliliilIIl(IIlllIlliIll<invokedynamic>(), (ilIlIiilIiIlIiil)null),
   lilliilIIl(IIlllIlliIll<invokedynamic>(), (ilIlIiilIiIlIiil)null),
   IIiliilIIl(IIlllIlliIll<invokedynamic>(), (ilIlIiilIiIlIiil)null),
   llIliilIIl(IIlllIlliIll<invokedynamic>(), ilIlIiilIiIlIiil.iIiIiillil);

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(-((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ 15954) << 7 | (char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ 15954) >>> 9) + var5) - 20323) - 6680) - var5) - var5) - var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ 15954) << 7 | (char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ 15954) >>> 9) + var5) - 20323) - 6680) - var5) - var5) - var5) << 11))))) >>> 6 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ 15954) << 7 | (char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ 15954) >>> 9) + var5) - 20323) - 6680) - var5) - var5) - var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ 15954) << 7 | (char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ 15954) >>> 9) + var5) - 20323) - 6680) - var5) - var5) - var5) << 11))))) << 10))))) + 18734) + 'ꆫ') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private IIilIiilIilIii(String var3, ilIlIiilIiIlIiil label) {
      this.IlIiiilIIl = var3;
      this.llIiiilIIl = label;
   }

   public static IIilIiilIilIii IilliliilIIi(String label) {
      long var5 = -2560950061587866105L;
      IIilIiilIilIii[] var1 = values();
      var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

      for(long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         IIilIiilIilIii var4 = var1[(int)var8];
         if (var4.IlIiiilIIl.equals(label)) {
            return var4;
         }
      }

      return lIIliilIIl;
   }

   public ilIlIiilIiIlIiil liiiIIllIl() {
      return this.llIiiilIIl;
   }

   // $FF: synthetic method
   private static IIilIiilIilIii[] IiIlliIliiIl() {
      return new IIilIiilIilIii[]{lIIliilIIl, iIIliilIIl, IlIliilIIl, llIliilIIl, ilIliilIIl, IiIliilIIl, liIliilIIl, iiIliilIIl, IIlliilIIl, lIlliilIIl, iIlliilIIl, IllliilIIl, lllliilIIl, illliilIIl, IilliilIIl, lilliilIIl, iilliilIIl, IIiliilIIl, lIiliilIIl, iIiliilIIl, IliliilIIl, lliliilIIl, ililiilIIl, IiiliilIIl, liiliilIIl, iiiliilIIl, IIIiiilIIl, lIIiiilIIl};
   }

   static boolean IlIlllIlilIl(class_1799 s) {
      class_1792 var2 = s.method_7909();
      if (var2 instanceof class_1747 var1) {
         class_2248 var5 = var1.method_7711();
         if (var5 instanceof class_2346) {
            return false;
         } else {
            String var3 = class_7923.field_41178.method_10221(s.method_7909()).method_12832();
            if (!var3.endsWith(IIlllIlliIll<invokedynamic>()) && !iIIiiilIIl.contains(var3)) {
               class_2680 var4 = var5.method_9564();
               return !var4.method_31709() && !(var5.method_9499() > 0.6F) ? var4.method_26234(class_2682.field_12294, class_2338.field_10980) : false;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ var5) << 6 | (char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ var5) >>> 10) << 4 | (char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ var5) << 6 | (char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ var5) >>> 10) >>> 12) - 15645) >>> 11 | (char)((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ var5) << 6 | (char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ var5) >>> 10) << 4 | (char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ var5) << 6 | (char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ var5) >>> 10) >>> 12) - 15645) << 5))))) ^ var5))))))) ^ var5) >>> 5 | (char)((char)(~((char)(-((char)(~((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ var5) << 6 | (char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ var5) >>> 10) << 4 | (char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ var5) << 6 | (char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ var5) >>> 10) >>> 12) - 15645) >>> 11 | (char)((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ var5) << 6 | (char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ var5) >>> 10) << 4 | (char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ var5) << 6 | (char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ var5) >>> 10) >>> 12) - 15645) << 5))))) ^ var5))))))) ^ var5) << 11) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IliIlllilIi() {
      return this.IlIiiilIIl;
   }

   public double iliIiiliiiii(class_1799 s) {
      if (s != null && !s.method_7960()) {
         if (this.llIiiilIIl != null) {
            return iIliilIlIlliilIl.IliIlllilIi(s, this.llIiiilIIl);
         } else {
            double var10000;
            switch (this.ordinal()) {
               case 16:
                  var10000 = s.method_31574(class_1802.field_8367) ? (double)2.0F : (double)1.0F;
                  break;
               case 17:
                  var10000 = iIliilIlIlliilIl.lIiiIiIlilli(s);
                  break;
               case 18:
               case 19:
               case 20:
               case 21:
               case 23:
               case 25:
               default:
                  var10000 = (double)0.0F;
                  break;
               case 22:
                  var10000 = iIliilIlIlliilIl.IIIllIIliIIl(s);
                  break;
               case 24:
               case 26:
                  var10000 = iIliilIlIlliilIl.iliIiiliiiii(s);
            }

            return var10000;
         }
      } else {
         return (double)0.0F;
      }
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 5 | (char)((char)(var4[var5] - var5) ^ var5) << 11) + var5))) << 4 | (char)(~((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 5 | (char)((char)(var4[var5] - var5) ^ var5) << 11) + var5))) >>> 12) ^ var5) - var5) ^ var5) - 9626))) + var5) ^ 4601));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ '\ueb0b') + var5) - 15394) - var5))) + '숈') + var5) + var5) + 2594) - var5) ^ 21330) - 32042) - var5) - var5) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ '\ueb0b') + var5) - 15394) - var5))) + '숈') + var5) + var5) + 2594) - var5) ^ 21330) - 32042) - var5) - var5) << 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(~((char)(-((char)(-var4[var5]))))) - var5))) << 14 | (char)(~((char)((char)(~((char)(-((char)(-var4[var5]))))) - var5))) >>> 2))) + 3594) ^ var5) ^ var5) - '긵') ^ 13643) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean lIiiIiIlilli(class_1799 s) {
      if (s != null && !s.method_7960() && this != lIIliilIIl) {
         if (this.llIiiilIIl != null) {
            return ilIlIiilIiIlIiil.iIlIlllllill(s) == this.llIiiilIIl;
         } else {
            boolean var10000;
            switch (this.ordinal()) {
               case 10 -> var10000 = IlIlllIlilIl(s);
               case 11 -> var10000 = s.method_31574(class_1802.field_8281);
               case 12 -> var10000 = s.method_31574(class_1802.field_8301);
               case 13 -> var10000 = s.method_31574(class_1802.field_23141);
               case 14 -> var10000 = s.method_31574(class_1802.field_8801);
               case 15 -> var10000 = s.method_31574(class_1802.field_8786);
               case 16 -> var10000 = s.method_31574(class_1802.field_8463) || s.method_31574(class_1802.field_8367);
               case 17 -> var10000 = IIIllIIliIIl(s);
               case 18 -> var10000 = s.method_31574(class_1802.field_8634);
               case 19 -> var10000 = s.method_31574(class_1802.field_49098);
               case 20 -> var10000 = s.method_31574(class_1802.field_8705);
               case 21 -> var10000 = s.method_31574(class_1802.field_8187);
               case 22 -> var10000 = (s.method_31574(class_1802.field_8574) || s.method_31574(class_1802.field_8436) || s.method_31574(class_1802.field_8150)) && iIliilIlIlliilIl.IlIlllIlilIl(s);
               case 23 -> var10000 = s.method_31574(class_1802.field_8639);
               case 24 -> var10000 = s.method_31574(class_1802.field_8378);
               case 25 -> var10000 = s.method_31574(class_1802.field_8543) || s.method_31574(class_1802.field_8803) || s.method_31574(class_1802.field_56557) || s.method_31574(class_1802.field_56558);
               case 26 -> var10000 = s.method_31574(class_1802.field_8884);
               case 27 -> var10000 = s.method_31574(class_1802.field_8287);
               default -> var10000 = false;
            }

            return var10000;
         }
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 7385758271907205406L ^ Long.rotateLeft(-2880570267239631245L, 18) ^ 2008848934757087511L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 4935124513615613441L ^ Long.rotateLeft(-4896822878520776233L, 45) ^ -2247860366427193543L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8819844400607554387L ^ Long.rotateLeft(-5624198039217189184L, 1) ^ -3368924386535608962L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 8059958504247390464L ^ Long.rotateLeft(-5849022821511309327L, 5) ^ 6765639582087594668L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1309984002422482970L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1469794022669913626L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2573945511836148289L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2980818808797104644L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 8591548703207855003L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -8060496278028214730L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Illlllllilll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iilllilliill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIillIiliIil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Ililllililil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iiilliiliiil<invokedynamic>());
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

   static boolean IIIllIIliIIl(class_1799 s) {
      if (!s.method_57826(class_9334.field_50075)) {
         return false;
      } else {
         return !s.method_31574(class_1802.field_8463) && !s.method_31574(class_1802.field_8367) && !s.method_31574(class_1802.field_8511) && !s.method_31574(class_1802.field_8680) && !s.method_31574(class_1802.field_8635) && !s.method_31574(class_1802.field_8323) && !s.method_31574(class_1802.field_8726) && !s.method_31574(class_1802.field_8233) && !s.method_31574(class_1802.field_8766);
      }
   }

   public static String[] iIlIlllllill() {
      long var3 = 2116946081672578945L;
      IIilIiilIilIii[] var0 = values();
      String[] var1 = new String[var0.length];

      for(long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < var0.length; var5 += 4294967296L) {
         var1[(int)(var5 >>> 32)] = var0[(int)(var5 >>> 32)].IlIiiilIIl;
      }

      return var1;
   }
}
