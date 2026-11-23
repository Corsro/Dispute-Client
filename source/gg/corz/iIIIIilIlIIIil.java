package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class iIIIIilIlIIIil {
   public static String lIiiIiIlilli(iiIiliiIIlilii toModel, lIIiilIliIIiilIl clip, String to, iiIiliiIIlilii fromModel, lIIiilIliIIiilIl from) {
      long var7 = 7461574534672357675L;
      if (to != null && fromModel != null && from != null) {
         if (from.iiiililIll.containsKey(to) && fromModel.IlIlllIlilIl(to)) {
            return to;
         } else if (to.startsWith(IIIllIIliIIl<invokedynamic>())) {
            return liiiIIllIl(fromModel, from);
         } else if (to.startsWith(IIIllIIliIIl<invokedynamic>())) {
            List var5 = iIlIlllllill(fromModel, from);
            if (var5.isEmpty()) {
               return null;
            } else {
               var7 ^= ((long)(toModel != null && clip != null ? Math.max(0, iIlIlllllill(toModel, clip).indexOf(to)) : 0) << 32 ^ var7) & -1L << 32;
               return (String)var5.get((int)(var7 >>> 32) % var5.size());
            }
         } else if (!to.startsWith(IIIllIIliIIl<invokedynamic>())) {
            return null;
         } else {
            var7 ^= ((long)(to.length() > (((439420091 << 3 | 439420091 >>> 29) >>> 19 | (439420091 << 3 | 439420091 >>> 29) << 13) ^ 79370807) && Character.isDigit(to.charAt(((--1863806464 - -9 ^ 29) << 11 | (--1863806464 - -9 ^ 29) >>> 21) ^ -1150246018)) ? to.charAt(-(-2054404453 * -9 >>> 27 | -2054404453 * -9 << 5) ^ 1037004369) - (((1527121484 << 9 | 1527121484 >>> 23) * -619094385 >>> 11 | (1527121484 << 9 | 1527121484 >>> 23) * -619094385 << 21) ^ 895409268) : 1) ^ var7) & -1L >>> 32;
            return IilliliilIIi(fromModel, from, (int)var7 == ((~(1658910695 ^ -11) << 1 | ~(1658910695 ^ -11) >>> 31) ^ -977145895), (int)var7 - 1);
         }
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] ^ var5))))) ^ var5) >>> 9 | (char)((char)(~((char)(-((char)(var4[var5] ^ var5))))) ^ var5) << 7))) ^ var5) + 14636) + '휰') ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String liiiIIllIl(iiIiliiIIlilii knife, lIIiilIliIIiilIl model) {
      String var2 = knife.IIIllIIliIIl();
      return model.iiiililIll.containsKey(var2) ? var2 : IIIllIIliIIl<invokedynamic>();
   }

   public static String IliIlllilIi(iiIiliiIIlilii knife, lIIiilIliIIiilIl model) {
      String var2 = knife.iliIiiliiiii();
      return model.iiiililIll.containsKey(var2) ? var2 : IIIllIIliIIl<invokedynamic>();
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6018202392657619043L ^ Long.rotateLeft(1510638784379707943L, 58) ^ -4998610005591080882L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1751809964044057506L ^ Long.rotateLeft(-4659096869775696989L, 7) ^ 9026384682415878878L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7603044339840487607L ^ Long.rotateLeft(-1208553176732703294L, 32) ^ 4476797211175385586L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 9036190340455789221L ^ Long.rotateLeft(3168412989264679901L, 59) ^ 1739304567199754734L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1826256523007279268L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -643418560184261257L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -3127044516788754802L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3788875930539715770L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -4951482870085030954L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -7991776696467460778L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IlIlllIlilIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIlliIliiIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIlllIlliIll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Illlllllilll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iilllilliill<invokedynamic>());
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

   private iIIIIilIlIIIil() {
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(~((char)((char)(var4[var5] + 4502) + var5))) ^ '볞') - var5))))) - '蕍') - '郫') << 14 | (char)((char)((char)(~((char)(-((char)((char)((char)(~((char)((char)(var4[var5] + 4502) + var5))) ^ '볞') - var5))))) - '蕍') - '郫') >>> 2) - var5) + '퉓') - '땈') + 9773) + var5))) ^ 10689));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String IilliliilIIi(iiIiliiIIlilii model, lIIiilIliIIiilIl heavy, boolean knife, int sequence) {
      String var4 = knife ? IIIllIIliIIl<invokedynamic>() : IIIllIIliIIl<invokedynamic>() + (1 + Math.floorMod(sequence, 2));
      if (!heavy.iiiililIll.containsKey(var4)) {
         var4 = IIIllIIliIIl<invokedynamic>();
      }

      if (model.iIlIlllllill() && heavy.iiiililIll.containsKey(var4 + IIIllIIliIIl<invokedynamic>())) {
         var4 = var4 + IIIllIIliIIl<invokedynamic>();
      }

      return var4;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] ^ 3287) ^ '賮')))) + 9465))) ^ 13549) ^ '運')) >>> 1 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] ^ 3287) ^ '賮')))) + 9465))) ^ 13549) ^ '運')) << 15) - var5) + 6685) ^ var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] ^ 3287) ^ '賮')))) + 9465))) ^ 13549) ^ '運')) >>> 1 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] ^ 3287) ^ '賮')))) + 9465))) ^ 13549) ^ '運')) << 15) - var5) + 6685) ^ var5) << 13) + 12031) ^ var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) >>> 11 | (char)(var4[var5] - var5) << 5)))) - '\ueaab') + var5) - var5))) + var5) + var5) + 4858) ^ var5) + var5) - 16051) ^ '뉗'))) + '\udded') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static List<String> iIlIlllllill(iiIiliiIIlilii model, lIIiilIliIIiilIl knife) {
      return knife.iiiililIll.keySet().stream().filter((knifex) -> knifex.startsWith(IIIllIIliIIl<invokedynamic>()) && model.IlIlllIlilIl(knifex)).toList();
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(~var4[var5]))) + var5))) ^ var5) ^ '禮') - 15872) - var5) ^ 30168) ^ 12359) ^ 11107));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
