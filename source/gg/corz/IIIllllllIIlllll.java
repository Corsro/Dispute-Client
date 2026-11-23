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
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IIIllllllIIlllll {
   public String IlililIill = null;
   public final List<String> iIililIill = new ArrayList();
   public boolean IlllilIill = false;
   public boolean llllilIill = false;
   public boolean IIililIill = false;
   public int illlilIill = 0;
   public final List<String> lIililIill = new ArrayList();
   public int lillilIill = 0;
   public int iillilIill = 0;
   public int IillilIill = 0;

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) << 7 | (char)(var4[var5] << 5 | var4[var5] >>> 11) >>> 9) + var5) >>> 7 | (char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) << 7 | (char)(var4[var5] << 5 | var4[var5] >>> 11) >>> 9) + var5) << 9) >>> 4 | (char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) << 7 | (char)(var4[var5] << 5 | var4[var5] >>> 11) >>> 9) + var5) >>> 7 | (char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) << 7 | (char)(var4[var5] << 5 | var4[var5] >>> 11) >>> 9) + var5) << 9) << 12))))) - var5) + var5) + var5) ^ 'ꥌ') ^ '괄') + '댇'))) - var5) + '鸨'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1415073623517673498L ^ Long.rotateLeft(-7376735087588722124L, 55) ^ -6323264324141092684L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1181329567214621117L ^ Long.rotateLeft(64075450311142650L, 8) ^ -358189583576544456L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -7162897451598424610L ^ Long.rotateLeft(8191341877105858798L, 34) ^ -8620462483527917865L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 2725069329150657919L ^ Long.rotateLeft(-109699386757398592L, 1) ^ 6889392931891816107L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1397141930534363650L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 1349609385949467352L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4390988352869886421L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -6930868422436962820L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4988813188378187215L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -188232175521487215L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(lIiiIiIlilli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iliIiiliiiii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIllIIliIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IlIlllIlilIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIlliIliiIl<invokedynamic>());
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

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(var4[var5] - var5) - 229) ^ var5)))))) << 12 | (char)(-((char)((char)(~((char)((char)((char)(var4[var5] - var5) - 229) ^ var5)))))) >>> 4) ^ var5) << 2 | (char)((char)((char)(-((char)((char)(~((char)((char)((char)(var4[var5] - var5) - 229) ^ var5)))))) << 12 | (char)(-((char)((char)(~((char)((char)((char)(var4[var5] - var5) - 229) ^ var5)))))) >>> 4) ^ var5) >>> 14) << 2 | (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(var4[var5] - var5) - 229) ^ var5)))))) << 12 | (char)(-((char)((char)(~((char)((char)((char)(var4[var5] - var5) - 229) ^ var5)))))) >>> 4) ^ var5) << 2 | (char)((char)((char)(-((char)((char)(~((char)((char)((char)(var4[var5] - var5) - 229) ^ var5)))))) << 12 | (char)(-((char)((char)(~((char)((char)((char)(var4[var5] - var5) - 229) ^ var5)))))) >>> 4) ^ var5) >>> 14) >>> 14) - var5) - '큁') ^ var5) + '퇆'))))) - 'ꟷ') + var5));
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
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))) ^ var5) + var5) - 19965) + 24104) + 18044) >>> 4 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))) ^ var5) + var5) - 19965) + 24104) + 18044) << 12) - var5) + var5) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))) ^ var5) + var5) - 19965) + 24104) + 18044) >>> 4 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))) ^ var5) + var5) - 19965) + 24104) + 18044) << 12) - var5) + var5) >>> 1))) << 8 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))) ^ var5) + var5) - 19965) + 24104) + 18044) >>> 4 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))) ^ var5) + var5) - 19965) + 24104) + 18044) << 12) - var5) + var5) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))) ^ var5) + var5) - 19965) + 24104) + 18044) >>> 4 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))) ^ var5) + var5) - 19965) + 24104) + 18044) << 12) - var5) + var5) >>> 1))) >>> 8) - 'ꆏ') - 32342) >>> 3 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))) ^ var5) + var5) - 19965) + 24104) + 18044) >>> 4 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))) ^ var5) + var5) - 19965) + 24104) + 18044) << 12) - var5) + var5) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))) ^ var5) + var5) - 19965) + 24104) + 18044) >>> 4 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))) ^ var5) + var5) - 19965) + 24104) + 18044) << 12) - var5) + var5) >>> 1))) << 8 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))) ^ var5) + var5) - 19965) + 24104) + 18044) >>> 4 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))) ^ var5) + var5) - 19965) + 24104) + 18044) << 12) - var5) + var5) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))) ^ var5) + var5) - 19965) + 24104) + 18044) >>> 4 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))) ^ var5) + var5) - 19965) + 24104) + 18044) << 12) - var5) + var5) >>> 1))) >>> 8) - 'ꆏ') - 32342) << 13))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) >>> 5 | (char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) << 11) + var5) - '툱') - var5))) + var5))) >>> 13 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) >>> 5 | (char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) << 11) + var5) - '툱') - var5))) + var5))) << 3))) + var5) << 12 | (char)((char)(-((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) >>> 5 | (char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) << 11) + var5) - '툱') - var5))) + var5))) >>> 13 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) >>> 5 | (char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) << 11) + var5) - '툱') - var5))) + var5))) << 3))) + var5) >>> 4) << 13 | (char)((char)((char)(-((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) >>> 5 | (char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) << 11) + var5) - '툱') - var5))) + var5))) >>> 13 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) >>> 5 | (char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) << 11) + var5) - '툱') - var5))) + var5))) << 3))) + var5) << 12 | (char)((char)(-((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) >>> 5 | (char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) << 11) + var5) - '툱') - var5))) + var5))) >>> 13 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) >>> 5 | (char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) << 11) + var5) - '툱') - var5))) + var5))) << 3))) + var5) >>> 4) >>> 3) << 12 | (char)((char)((char)((char)(-((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) >>> 5 | (char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) << 11) + var5) - '툱') - var5))) + var5))) >>> 13 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) >>> 5 | (char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) << 11) + var5) - '툱') - var5))) + var5))) << 3))) + var5) << 12 | (char)((char)(-((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) >>> 5 | (char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) << 11) + var5) - '툱') - var5))) + var5))) >>> 13 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) >>> 5 | (char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) << 11) + var5) - '툱') - var5))) + var5))) << 3))) + var5) >>> 4) << 13 | (char)((char)((char)(-((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) >>> 5 | (char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) << 11) + var5) - '툱') - var5))) + var5))) >>> 13 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) >>> 5 | (char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) << 11) + var5) - '툱') - var5))) + var5))) << 3))) + var5) << 12 | (char)((char)(-((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) >>> 5 | (char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) << 11) + var5) - '툱') - var5))) + var5))) >>> 13 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) >>> 5 | (char)((char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) >>> 2 | (char)(~var4[var5]) << 14) + 18025) + var5) >>> 3) << 11) + var5) - '툱') - var5))) + var5))) << 3))) + var5) >>> 4) >>> 3) >>> 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)(~((char)(~((char)(-((char)((char)(~((char)((char)(var4[var5] + 20328) - 27883))) - '꾸'))))))))) + var5) - var5) - '얯') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IliIlllilIi() {
      return this.iillilIill <= 0 ? null : this.iillilIill + (this.iillilIill == 1 ? IilliliilIIi<invokedynamic>() : IilliliilIIi<invokedynamic>()) + IilliliilIIi<invokedynamic>();
   }

   public String iIlIlllllill() {
      String var1 = this.IliIlllilIi();
      String var2 = this.liiiIIllIl();
      if (var1 == null) {
         return var2;
      } else {
         return var2 == null ? var1 : var1 + IilliliilIIi<invokedynamic>() + var2;
      }
   }

   public String liiiIIllIl() {
      return this.lIililIill.isEmpty() ? null : IilliliilIIi<invokedynamic>() + String.join(IilliliilIIi<invokedynamic>(), this.lIililIill) + IilliliilIIi<invokedynamic>();
   }
}
