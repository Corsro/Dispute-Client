package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_2960;
import net.minecraft.class_7923;

public final class IiiIlliiIl {
   public static final int Iillllllilllll = 5;
   public static final String lllllllillllll = "XP Bottle";
   private static final Map<String, class_1792> iIlllllIllllll = new LinkedHashMap();
   private static final Map<String, class_1792> IIllllllIlllll = new LinkedHashMap();

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) << 7 | (char)(-var4[var5]) >>> 9) ^ var5) + '쬴') - '﵅') ^ var5) + var5) ^ '쿘') - '갼') + 18117))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3833524186809913498L ^ Long.rotateLeft(-5834171554719366715L, 15) ^ -1658146108035054559L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2867791603636846318L ^ Long.rotateLeft(3222570767074361530L, 52) ^ -1090949844896640516L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -7392063714914964336L ^ Long.rotateLeft(4215657147310197618L, 44) ^ 4650989245520287657L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3176661834594008671L ^ Long.rotateLeft(-7110923488321367365L, 41) ^ 8911667725521613924L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 5388945571703043730L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 3840391111047951159L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4839479361311764823L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 2725554258673350178L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 494166819850255886L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6080677967005833608L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIlllIlliIll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Illlllllilll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iilllilliill<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIillIiliIil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Ililllililil<invokedynamic>());
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

   public static boolean iliIiiliiiii(class_1792 item) {
      return item == class_1802.field_8287;
   }

   public static String IilliliilIIi(class_1792 item) {
      if (item == null) {
         return null;
      } else {
         for(Map.Entry var2 : IIllllllIlllll.entrySet()) {
            if (var2.getValue() == item) {
               return (String)var2.getKey();
            }
         }

         return class_7923.field_41178.method_10221(item).toString();
      }
   }

   public static int IIIllIIliIIl(class_1792 item) {
      return iliIiiliiiii(item) ? 5 : 0;
   }

   public static String lIiiIiIlilli(String nameOrId) {
      if (nameOrId == null) {
         return IiIlliIliiIl<invokedynamic>();
      } else if (!IIllllllIlllll.containsKey(nameOrId) && !iIlllllIllllll.containsKey(nameOrId) && nameOrId.indexOf(58) >= 0) {
         class_1792 var1 = iIlIlllllill(nameOrId);
         return var1 == null ? nameOrId : IlIlllIlilIl(var1);
      } else {
         return nameOrId;
      }
   }

   private IiiIlliiIl() {
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - 21343) ^ var5) + 5641) - var5) ^ 10889) - var5))) + var5) << 8 | (char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - 21343) ^ var5) + 5641) - var5) ^ 10889) - var5))) + var5) >>> 8))))) + '藭') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String[] liiiIIllIl() {
      return new String[]{IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>()};
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ '\uecc4') - 2318) ^ var5) << 4 | (char)((char)((char)(var4[var5] ^ '\uecc4') - 2318) ^ var5) >>> 12))) ^ var5))) + var5) - '쿢') >>> 13 | (char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ '\uecc4') - 2318) ^ var5) << 4 | (char)((char)((char)(var4[var5] ^ '\uecc4') - 2318) ^ var5) >>> 12))) ^ var5))) + var5) - '쿢') << 3) + 24702));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ 16091) - var5))) + var5) - '\uec79') - 28713) - 5991) + var5) << 12 | (char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ 16091) - var5))) + var5) - '\uec79') - 28713) - 5991) + var5) >>> 4) - '鞾') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static class_1792 iIlIlllllill(String displayName) {
      if (displayName == null) {
         return null;
      } else {
         class_1792 var1 = (class_1792)IIllllllIlllll.get(displayName);
         if (var1 != null) {
            return var1;
         } else {
            var1 = (class_1792)iIlllllIllllll.get(displayName);
            if (var1 == null && displayName.indexOf(58) >= 0) {
               class_2960 var2 = class_2960.method_12829(displayName);
               if (var2 == null) {
                  return null;
               } else {
                  class_1792 var3 = (class_1792)class_7923.field_41178.method_63535(var2);
                  return var3 != null && var3 != class_1802.field_8162 ? var3 : null;
               }
            } else {
               return var1;
            }
         }
      }
   }

   public static String IlIlllIlilIl(class_1792 item) {
      long var10 = 8020285730239638188L;
      long var12 = -1575344090154421178L;
      if (item == null) {
         return IiIlliIliiIl<invokedynamic>();
      } else {
         for(Map.Entry var2 : IIllllllIlllll.entrySet()) {
            if (var2.getValue() == item) {
               return (String)var2.getKey();
            }
         }

         for(Map.Entry var16 : iIlllllIllllll.entrySet()) {
            if (var16.getValue() == item) {
               return (String)var16.getKey();
            }
         }

         String var15 = item.method_7876();
         var10 ^= ((long)var15.lastIndexOf(46) << 32 ^ var10) & -1L << 32;
         String var3 = (int)(var10 >>> 32) >= 0 ? var15.substring((int)(var10 >>> 32) + 1) : var15;
         String[] var4 = var3.replace('_', ' ').split(IiIlliIliiIl<invokedynamic>());
         StringBuilder var5 = new StringBuilder();
         String[] var6 = var4;
         var10 ^= ((long)var4.length ^ var10) & -1L >>> 32;

         for(long var19 = var12 ^ (0L ^ var12) & -1L << 32; (int)(var19 >>> 32) < (int)var10; var19 += 4294967296L) {
            String var9 = var6[(int)(var19 >>> 32)];
            if (!var9.isEmpty()) {
               if (var5.length() > 0) {
                  var5.append(' ');
               }

               var5.append(Character.toUpperCase(var9.charAt(0))).append(var9.substring(1));
            }
         }

         return var5.toString();
      }
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) - '쟢') - 14684) - var5) << 13 | (char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) - '쟢') - 14684) - var5) >>> 3) ^ 20569))) - var5))) + var5))))) + var5) >>> 13 | (char)((char)(~((char)(-((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) - '쟢') - 14684) - var5) << 13 | (char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) - '쟢') - 14684) - var5) >>> 3) ^ 20569))) - var5))) + var5))))) + var5) << 3))) + var5) + 24024));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String[] IliIlllilIi() {
      long var4 = -3954698031844370073L;
      String[] var0 = new String[IIllllllIlllll.size() + iIlllllIllllll.size()];
      var4 ^= (0L ^ var4) & -1L << 32;

      for(String var3 : IIllllllIlllll.keySet()) {
         int var10001 = (int)(var4 >>> 32);
         var4 += 4294967296L;
         var0[var10001] = var3;
      }

      for(String var7 : iIlllllIllllll.keySet()) {
         int var9 = (int)(var4 >>> 32);
         var4 += 4294967296L;
         var0[var9] = var7;
      }

      return var0;
   }

   static {
      IIllllllIlllll.put(IiIlliIliiIl<invokedynamic>(), class_1802.field_8687);
      IIllllllIlllll.put(IiIlliIliiIl<invokedynamic>(), class_1802.field_8598);
      IIllllllIlllll.put(IiIlliIliiIl<invokedynamic>(), class_1802.field_8529);
      IIllllllIlllll.put(IiIlliIliiIl<invokedynamic>(), class_1802.field_8407);
      IIllllllIlllll.put(IiIlliIliiIl<invokedynamic>(), class_1802.field_17518);
      IIllllllIlllll.put(IiIlliIliiIl<invokedynamic>(), class_1802.field_8497);
      IIllllllIlllll.put(IiIlliIliiIl<invokedynamic>(), class_1802.field_8861);
      IIllllllIlllll.put(IiIlliIliiIl<invokedynamic>(), class_1802.field_8179);
      IIllllllIlllll.put(IiIlliIliiIl<invokedynamic>(), class_1802.field_8567);
      IIllllllIlllll.put(IiIlliIliiIl<invokedynamic>(), class_1802.field_8186);
      IIllllllIlllll.put(IiIlliIliiIl<invokedynamic>(), class_1802.field_16998);
      IIllllllIlllll.put(IiIlliIliiIl<invokedynamic>(), class_1802.field_8600);
      IIllllllIlllll.put(IiIlliIliiIl<invokedynamic>(), class_1802.field_8713);
      IIllllllIlllll.put(IiIlliIliiIl<invokedynamic>(), class_1802.field_8620);
      IIllllllIlllll.put(IiIlliIliiIl<invokedynamic>(), class_1802.field_8695);
      IIllllllIlllll.put(IiIlliIliiIl<invokedynamic>(), class_1802.field_8511);
      IIllllllIlllll.put(IiIlliIliiIl<invokedynamic>(), class_1802.field_8276);
      IIllllllIlllll.put(IiIlliIliiIl<invokedynamic>(), class_1802.field_8745);
      IIllllllIlllll.put(IiIlliIliiIl<invokedynamic>(), class_1802.field_8141);
      IIllllllIlllll.put(IiIlliIliiIl<invokedynamic>(), class_1802.field_8696);
      IIllllllIlllll.put(IiIlliIliiIl<invokedynamic>(), class_1802.field_17533);
      iIlllllIllllll.put(IiIlliIliiIl<invokedynamic>(), class_1802.field_8287);
   }
}
