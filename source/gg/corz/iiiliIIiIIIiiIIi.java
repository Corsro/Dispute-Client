package gg.corz;

import it.unimi.dsi.fastutil.objects.Reference2ByteOpenHashMap;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2682;
import net.minecraft.class_2741;
import net.minecraft.class_7923;
import net.minecraft.class_2350.class_2351;

public final class iiiliIIiIIIiiIIi {
   private static final Reference2ByteOpenHashMap<class_2680> lIililiiil = new Reference2ByteOpenHashMap();
   private static final byte IIililiiil = -1;

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] - var5))))) + var5) - 'ﰯ') ^ 14114) - 20495) >>> 5 | (char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] - var5))))) + var5) - 'ﰯ') ^ 14114) - 20495) << 11) - var5) + var5) - 8842) + '鄡') - 20452) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] - var5))))) + var5) - 'ﰯ') ^ 14114) - 20495) >>> 5 | (char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] - var5))))) + var5) - 'ﰯ') ^ 14114) - 20495) << 11) - var5) + var5) - 8842) + '鄡') - 20452) << 5) - var5) + 25149));
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
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) << 1 | (char)((char)(var4[var5] ^ var5) - var5) >>> 15) - var5) - var5) + 19631))) - 'ꯕ'))) ^ '뽠') + var5) ^ var5))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static boolean IIIllIIliIIl(String p) {
      return p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.endsWith(Illlllllilll<invokedynamic>()) || p.endsWith(Illlllllilll<invokedynamic>());
   }

   private iiiliIIiIIIiiIIi() {
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + '솞') + '鄍') ^ var5) + 3857) >>> 9 | (char)((char)((char)((char)(var4[var5] + '솞') + '鄍') ^ var5) + 3857) << 7) - '\udc48'))))) - 8619) - '쐜') ^ var5) ^ var5) - 14626) + var5) - 25333));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3933641907549217182L ^ Long.rotateLeft(-2880497615888772928L, 35) ^ 2121026873927864288L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5520925369461682895L ^ Long.rotateLeft(2445387943843823942L, 55) ^ 4176029779062283537L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -6904046897418643606L ^ Long.rotateLeft(-6750655043847449657L, 17) ^ 9000619690623988503L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3611903337172207364L ^ Long.rotateLeft(-8896851884248563062L, 4) ^ 6656610277495250911L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4930956730343278840L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 2053254920694104687L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 6590559919290254226L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5064450310598232597L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 7277871191966142639L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1603384020964617478L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iilllilliill<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIillIiliIil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Ililllililil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Iiilliiliiil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIIilIIiiIIi<invokedynamic>());
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

   static {
      lIililiiil.defaultReturnValue((byte)-1);
   }

   private static byte liiiIIllIl(class_2680 state) {
      long var6 = 8232551309735725762L;
      if (state.method_26215()) {
         return illliillIilliill.lIIiliiill;
      } else {
         class_2248 var1 = state.method_26204();

         String var2;
         try {
            var2 = class_7923.field_41175.method_10221(var1).method_12832();
         } catch (Throwable var9) {
            var2 = "";
         }

         class_265 var3;
         try {
            var3 = state.method_26220(class_2682.field_12294, class_2338.field_10980);
         } catch (Throwable var8) {
            var3 = null;
         }

         var6 ^= ((long)(var3 != null && var3.method_1110() ? 1 : 0) << 32 ^ var6) & -1L << 32;
         var6 ^= ((long)(var3 != null && !var3.method_1110() && var3.method_1105(class_2351.field_11052) <= (double)0.1875F ? 1 : 0) ^ var6) & -1L >>> 32;
         if (var1 == class_2246.field_10343) {
            return illliillIilliill.IliIlllilIi(1, 6);
         } else if (var2.endsWith(Illlllllilll<invokedynamic>())) {
            return illliillIilliill.IliIlllilIi(1, 5);
         } else if (state.method_26227().method_15769() || (int)(var6 >>> 32) == 0 && (int)var6 == 0 && var1 != class_2246.field_10382 && var1 != class_2246.field_10164) {
            if (iIlIlllllill(var2)) {
               return illliillIilliill.IliIlllilIi(1, iliIiiliiiii(var2) ? 7 : 9);
            } else if ((int)(var6 >>> 32) == 0 && (int)var6 == 0) {
               if (var1 == class_2246.field_10260) {
                  return illliillIilliill.IliIlllilIi(2, 2);
               } else if (var2.startsWith(Illlllllilll<invokedynamic>())) {
                  return illliillIilliill.IliIlllilIi(2, 1);
               } else if (var1 != class_2246.field_10161 && var1 != class_2246.field_10075) {
                  if (var1 != class_2246.field_10620 && var1 != class_2246.field_10132) {
                     if (lIiiIiIlilli(var2)) {
                        return illliillIilliill.IliIlllilIi(2, 7);
                     } else if (IIIllIIliIIl(var2)) {
                        return illliillIilliill.IliIlllilIi(2, 10);
                     } else if (IlIlllIlilIl(var2)) {
                        return illliillIilliill.IliIlllilIi(2, 8);
                     } else if (IiIlliIliiIl(var1, state, var2)) {
                        return illliillIilliill.IliIlllilIi(2, 11);
                     } else {
                        return IIlllIlliIll(var2) ? illliillIilliill.IliIlllilIi(2, 9) : illliillIilliill.iIIiliiill;
                     }
                  } else {
                     return illliillIilliill.IliIlllilIi(2, 4);
                  }
               } else {
                  return illliillIilliill.IliIlllilIi(2, 3);
               }
            } else {
               return illliillIilliill.IliIlllilIi(1, IilliliilIIi(var2));
            }
         } else {
            return illliillIilliill.IlIiliiill;
         }
      }
   }

   private static boolean iliIiiliiiii(String p) {
      if (!p.endsWith(Illlllllilll<invokedynamic>()) && !p.startsWith(Illlllllilll<invokedynamic>()) && p.contains(Illlllllilll<invokedynamic>())) {
         return p.contains(Illlllllilll<invokedynamic>()) || p.contains(Illlllllilll<invokedynamic>()) || p.contains(Illlllllilll<invokedynamic>()) || p.contains(Illlllllilll<invokedynamic>()) || p.endsWith(Illlllllilll<invokedynamic>()) || p.endsWith(Illlllllilll<invokedynamic>()) || p.endsWith(Illlllllilll<invokedynamic>()) || p.endsWith(Illlllllilll<invokedynamic>()) || p.endsWith(Illlllllilll<invokedynamic>()) || p.endsWith(Illlllllilll<invokedynamic>());
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(~((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) ^ '颹'))))) ^ '霩')))) + var5) + var5) << 9 | (char)((char)((char)((char)(~((char)((char)(-((char)(~((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) ^ '颹'))))) ^ '霩')))) + var5) + var5) >>> 7) - var5) - 29817) - 4136) - 'ꯍ') >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(~((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) ^ '颹'))))) ^ '霩')))) + var5) + var5) << 9 | (char)((char)((char)((char)(~((char)((char)(-((char)(~((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) ^ '颹'))))) ^ '霩')))) + var5) + var5) >>> 7) - var5) - 29817) - 4136) - 'ꯍ') << 8))) ^ 17827)));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static boolean iIlIlllllill(String p) {
      return p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.endsWith(Illlllllilll<invokedynamic>()) || p.endsWith(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.endsWith(Illlllllilll<invokedynamic>()) || p.endsWith(Illlllllilll<invokedynamic>()) || p.endsWith(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.endsWith(Illlllllilll<invokedynamic>()) || p.endsWith(Illlllllilll<invokedynamic>()) || p.startsWith(Illlllllilll<invokedynamic>());
   }

   private static boolean IiIlliIliiIl(class_2248 state, class_2680 p, String block) {
      if (!block.equals(Illlllllilll<invokedynamic>()) && !block.equals(Illlllllilll<invokedynamic>())) {
         if ((state == class_2246.field_28888 || state == class_2246.field_22091) && p.method_28498(class_2741.field_12496)) {
            return p.method_11654(class_2741.field_12496) != class_2351.field_11052;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   private static boolean IIlllIlliIll(String p) {
      return p.equals(Illlllllilll<invokedynamic>()) || p.endsWith(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.contains(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.endsWith(Illlllllilll<invokedynamic>()) || p.endsWith(Illlllllilll<invokedynamic>()) || p.endsWith(Illlllllilll<invokedynamic>()) || p.contains(Illlllllilll<invokedynamic>()) || p.endsWith(Illlllllilll<invokedynamic>()) || p.endsWith(Illlllllilll<invokedynamic>()) || p.endsWith(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.endsWith(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.endsWith(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.endsWith(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.contains(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.endsWith(Illlllllilll<invokedynamic>()) || p.endsWith(Illlllllilll<invokedynamic>());
   }

   private static boolean IlIlllIlilIl(String p) {
      return p.contains(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.contains(Illlllllilll<invokedynamic>()) || p.contains(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>());
   }

   private static boolean lIiiIiIlilli(String p) {
      return p.contains(Illlllllilll<invokedynamic>()) || p.contains(Illlllllilll<invokedynamic>()) || p.contains(Illlllllilll<invokedynamic>()) || p.contains(Illlllllilll<invokedynamic>()) || p.startsWith(Illlllllilll<invokedynamic>()) || p.startsWith(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.contains(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.contains(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.startsWith(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.contains(Illlllllilll<invokedynamic>()) || p.contains(Illlllllilll<invokedynamic>()) || p.contains(Illlllllilll<invokedynamic>()) && !p.startsWith(Illlllllilll<invokedynamic>()) || p.startsWith(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.startsWith(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || p.equals(Illlllllilll<invokedynamic>()) || iliIiiliiiii(p);
   }

   private static int IilliliilIIi(String p) {
      if (p.contains(Illlllllilll<invokedynamic>())) {
         return 7;
      } else if (!p.contains(Illlllllilll<invokedynamic>()) && !p.contains(Illlllllilll<invokedynamic>()) && !p.equals(Illlllllilll<invokedynamic>()) && !p.equals(Illlllllilll<invokedynamic>()) && !p.contains(Illlllllilll<invokedynamic>()) && !p.contains(Illlllllilll<invokedynamic>()) && !p.contains(Illlllllilll<invokedynamic>())) {
         return !p.endsWith(Illlllllilll<invokedynamic>()) && !p.contains(Illlllllilll<invokedynamic>()) && !p.contains(Illlllllilll<invokedynamic>()) && !p.endsWith(Illlllllilll<invokedynamic>()) && !p.equals(Illlllllilll<invokedynamic>()) && !p.endsWith(Illlllllilll<invokedynamic>()) && !p.endsWith(Illlllllilll<invokedynamic>()) && !p.equals(Illlllllilll<invokedynamic>()) && !p.equals(Illlllllilll<invokedynamic>()) && !p.equals(Illlllllilll<invokedynamic>()) && !p.startsWith(Illlllllilll<invokedynamic>()) && !p.endsWith(Illlllllilll<invokedynamic>()) ? 0 : 9;
      } else {
         return 8;
      }
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - 477) >>> 1 | (char)(var4[var5] - 477) << 15) ^ var5))) - '맭') + var5) - 10921) - var5) ^ '\udf24') ^ var5) << 6 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - 477) >>> 1 | (char)(var4[var5] - 477) << 15) ^ var5))) - '맭') + var5) - 10921) - var5) ^ '\udf24') ^ var5) >>> 10))) + var5) - '샙') - var5) + '뢻'))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static byte IliIlllilIi(class_2680 state) {
      long var2 = -8977452333830930830L;
      var2 ^= ((long)lIililiiil.getByte(state) << 32 ^ var2) & -1L << 32;
      if ((int)(var2 >>> 32) == -1) {
         var2 ^= ((long)liiiIIllIl(state) << 32 ^ var2) & -1L << 32;
         lIililiiil.put(state, (byte)((int)(var2 >>> 32)));
      }

      return (byte)((int)(var2 >>> 32));
   }
}
