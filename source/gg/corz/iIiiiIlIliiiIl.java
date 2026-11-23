package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class iIiiiIlIliiiIl {
   public static final Set<String> llliiiillilliiiill = Set.of(lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>());

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ var5) << 5 | (char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ var5) >>> 11) - var5) >>> 6 | (char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ var5) << 5 | (char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ var5) >>> 11) - var5) << 10) + 16504) ^ var5) - '鿟'))) ^ 27225) >>> 1 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ var5) << 5 | (char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ var5) >>> 11) - var5) >>> 6 | (char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ var5) << 5 | (char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ var5) >>> 11) - var5) << 10) + 16504) ^ var5) - '鿟'))) ^ 27225) << 15))) - 31916))) ^ var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static iIilIllIlilIll iIlIlllllill(Map<String, String> wanted, Map<String, String> actual) {
      return IliIlllilIi(wanted, actual, (Set)null);
   }

   public static iIilIllIlilIll IliIlllilIi(Map<String, String> actual, Map<String, String> wanted, Set<String> extraIgnore) {
      return liiiIIllIl(actual, wanted, extraIgnore, (Set)null);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 8362141781579311057L ^ Long.rotateLeft(2278006253074661289L, 32) ^ 4604037782162303933L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -4697334158292738694L ^ Long.rotateLeft(4228838557443384124L, 19) ^ -6062071078918224228L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5205104255773386573L ^ Long.rotateLeft(407641581284836710L, 23) ^ -6886672635207968829L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3947536873773601719L ^ Long.rotateLeft(-6845920447633573837L, 61) ^ -3169334662425185777L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 5251939139302163238L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3784564845409731271L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -18733826808515629L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -8783747241845335982L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -687553420713778977L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6028685548296778625L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iliIiiliiiii<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIIllIIliIIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IlIlllIlilIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IiIlliIliiIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIlllIlliIll<invokedynamic>());
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

   public static iIilIllIlilIll liiiIIllIl(Map<String, String> actual, Map<String, String> wanted, Set<String> extraIgnore, Set<String> forceCompare) {
      ArrayList var4 = new ArrayList();

      for(Map.Entry var6 : actual.entrySet()) {
         String var7 = (String)var6.getKey();
         if ((!llliiiillilliiiill.contains(var7) || forceCompare != null && forceCompare.contains(var7)) && (extraIgnore == null || !extraIgnore.contains(var7))) {
            String var8 = (String)wanted.get(var7);
            if (var8 == null || !var8.equals(var6.getValue())) {
               var4.add(var7 + lIiiIiIlilli<invokedynamic>() + (String)var6.getValue() + lIiiIiIlilli<invokedynamic>() + var8);
            }
         }
      }

      return new iIilIllIlilIll(var4.isEmpty(), var4);
   }

   private iIiiiIlIliiiIl() {
   }

   public static boolean IilliliilIIi(String prop) {
      return llliiiillilliiiill.contains(prop);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(~var4[var5]) << 1 | (char)(~var4[var5]) >>> 15) ^ var5))) + 22058))) - var5) + 26127) ^ var5) ^ 29162) - 22997))) << 10 | (char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(~var4[var5]) << 1 | (char)(~var4[var5]) >>> 15) ^ var5))) + 22058))) - var5) + 26127) ^ var5) ^ 29162) - 22997))) >>> 6));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '봂') << 7 | (char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '봂') >>> 9))) + '\udbab') ^ 'ꦩ') ^ 17281) - '\uf120') >>> 10 | (char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '봂') << 7 | (char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '봂') >>> 9))) + '\udbab') ^ 'ꦩ') ^ 17281) - '\uf120') << 6) << 12 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '봂') << 7 | (char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '봂') >>> 9))) + '\udbab') ^ 'ꦩ') ^ 17281) - '\uf120') >>> 10 | (char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '봂') << 7 | (char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '봂') >>> 9))) + '\udbab') ^ 'ꦩ') ^ 17281) - '\uf120') << 6) >>> 4) - var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '봂') << 7 | (char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '봂') >>> 9))) + '\udbab') ^ 'ꦩ') ^ 17281) - '\uf120') >>> 10 | (char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '봂') << 7 | (char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '봂') >>> 9))) + '\udbab') ^ 'ꦩ') ^ 17281) - '\uf120') << 6) << 12 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '봂') << 7 | (char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '봂') >>> 9))) + '\udbab') ^ 'ꦩ') ^ 17281) - '\uf120') >>> 10 | (char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '봂') << 7 | (char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '봂') >>> 9))) + '\udbab') ^ 'ꦩ') ^ 17281) - '\uf120') << 6) >>> 4) - var5) << 12));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ '곈') >>> 2 | (char)((char)(~var4[var5]) ^ '곈') << 14) - var5) << 6 | (char)((char)((char)((char)(~var4[var5]) ^ '곈') >>> 2 | (char)((char)(~var4[var5]) ^ '곈') << 14) - var5) >>> 10) ^ var5) ^ var5))) + '\ue234') - var5) - var5) + 18265) + 15430));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) << 7 | (char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) >>> 9) + 4059) >>> 12 | (char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) << 7 | (char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) >>> 9) + 4059) << 4) + var5) - var5))) >>> 13 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) << 7 | (char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) >>> 9) + 4059) >>> 12 | (char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) << 7 | (char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) >>> 9) + 4059) << 4) + var5) - var5))) << 3) ^ var5) >>> 11 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) << 7 | (char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) >>> 9) + 4059) >>> 12 | (char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) << 7 | (char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) >>> 9) + 4059) << 4) + var5) - var5))) >>> 13 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) << 7 | (char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) >>> 9) + 4059) >>> 12 | (char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) << 7 | (char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) >>> 9) + 4059) << 4) + var5) - var5))) << 3) ^ var5) << 5) ^ '\udc60'))) >>> 5 | (char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) << 7 | (char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) >>> 9) + 4059) >>> 12 | (char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) << 7 | (char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) >>> 9) + 4059) << 4) + var5) - var5))) >>> 13 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) << 7 | (char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) >>> 9) + 4059) >>> 12 | (char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) << 7 | (char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) >>> 9) + 4059) << 4) + var5) - var5))) << 3) ^ var5) >>> 11 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) << 7 | (char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) >>> 9) + 4059) >>> 12 | (char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) << 7 | (char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) >>> 9) + 4059) << 4) + var5) - var5))) >>> 13 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) << 7 | (char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) >>> 9) + 4059) >>> 12 | (char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) << 7 | (char)((char)(-((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11))) + var5) >>> 9) + 4059) << 4) + var5) - var5))) << 3) ^ var5) << 5) ^ '\udc60'))) << 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
