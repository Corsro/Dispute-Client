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
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class ilIilliIiIilli {
   private final Map<llIliIIiilIliIIi, illIIiilIilIIiil> iiiIliIIIl = new LinkedHashMap();
   private int IIIlliIIIl;

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)(~((char)((char)(~((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) ^ 32734) ^ 'ꞩ'))) + '쀁') << 6 | (char)((char)(~((char)((char)((char)(var4[var5] - var5) ^ 32734) ^ 'ꞩ'))) + '쀁') >>> 10))) + var5))) ^ var5))) - 1938));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - '\ufae7') ^ '耒') - var5) >>> 4 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) - '\ufae7') ^ '耒') - var5) << 12))) - 9144) >>> 5 | (char)((char)(~((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - '\ufae7') ^ '耒') - var5) >>> 4 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) - '\ufae7') ^ '耒') - var5) << 12))) - 9144) << 11))) + var5) + 26748) << 11 | (char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - '\ufae7') ^ '耒') - var5) >>> 4 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) - '\ufae7') ^ '耒') - var5) << 12))) - 9144) >>> 5 | (char)((char)(~((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - '\ufae7') ^ '耒') - var5) >>> 4 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) - '\ufae7') ^ '耒') - var5) << 12))) - 9144) << 11))) + var5) + 26748) >>> 5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String liiiIIllIl(long dependencyFingerprint, long stand, long target) {
      llIliIIiilIliIIi var7 = new llIliIIiilIliIIi(dependencyFingerprint, stand);
      illIIiilIilIIiil var8 = (illIIiilIilIIiil)this.iiiIliIIIl.get(var7);
      if (var8 == null) {
         return null;
      } else if (var8.IliIlllilIi() != target) {
         this.iiiIliIIIl.remove(var7);
         return null;
      } else {
         ++this.IIIlliIIIl;
         return var8.liiiIIllIl();
      }
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -5599295775239504275L ^ Long.rotateLeft(8885708742667383264L, 27) ^ -6129940346955791721L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -3885329415836669731L ^ Long.rotateLeft(-2368056130618485531L, 4) ^ -7223983473611192806L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -7202515518050083306L ^ Long.rotateLeft(-210600679651304844L, 4) ^ -3151786729774564357L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -973736662196955242L ^ Long.rotateLeft(3165633889884672238L, 35) ^ 4992496227006108912L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3009917332624810511L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 893860108672780796L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -2870026915425342515L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4683654166349975673L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -2102033892770757757L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8408665078002320933L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IiIlliIliiIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIlllIlliIll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Illlllllilll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Iilllilliill<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIillIiliIil<invokedynamic>());
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

   public void IliIlllilIi(long tick, long why, long dependencyFingerprint, String target, int stand) {
      this.iiiIliIIIl.put(new llIliIIiilIliIIi(tick, why), new illIIiilIilIIiil(dependencyFingerprint, target != null && !target.isBlank() ? target : IlIlllIlilIl<invokedynamic>(), stand));
   }

   public String iIlIlllllill(long dependencyFingerprint, long target) {
      ArrayList var5 = new ArrayList();
      String var6 = null;

      for(Map.Entry var8 : this.iiiIliIIIl.entrySet()) {
         if (((llIliIIiilIliIIi)var8.getKey()).IliIlllilIi() == dependencyFingerprint) {
            if (((illIIiilIilIIiil)var8.getValue()).IliIlllilIi() != target) {
               var5.add((llIliIIiilIliIIi)var8.getKey());
            } else if (var6 == null) {
               var6 = ((illIIiilIilIIiil)var8.getValue()).liiiIIllIl();
            }
         }
      }

      for(llIliIIiilIliIIi var10 : var5) {
         this.iiiIliIIIl.remove(var10);
      }

      if (var6 != null) {
         ++this.IIIlliIIIl;
      }

      return var6;
   }

   public int lIiiIiIlilli() {
      return this.IIIlliIIIl;
   }

   public String IIIllIIliIIl() {
      return IlIlllIlilIl<invokedynamic>() + this.iiiIliIIIl.size() + IlIlllIlilIl<invokedynamic>() + this.IIIlliIIIl;
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)var4[var5] - '퇋') + var5))) + '츇') - var5))) >>> 2 | (char)(-((char)((char)((char)(~((char)((char)((char)var4[var5] - '퇋') + var5))) + '츇') - var5))) << 14) >>> 14 | (char)((char)(-((char)((char)((char)(~((char)((char)((char)var4[var5] - '퇋') + var5))) + '츇') - var5))) >>> 2 | (char)(-((char)((char)((char)(~((char)((char)((char)var4[var5] - '퇋') + var5))) + '츇') - var5))) << 14) << 2))) - '\ued9b') ^ 12691) - 1271) << 12 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)var4[var5] - '퇋') + var5))) + '츇') - var5))) >>> 2 | (char)(-((char)((char)((char)(~((char)((char)((char)var4[var5] - '퇋') + var5))) + '츇') - var5))) << 14) >>> 14 | (char)((char)(-((char)((char)((char)(~((char)((char)((char)var4[var5] - '퇋') + var5))) + '츇') - var5))) >>> 2 | (char)(-((char)((char)((char)(~((char)((char)((char)var4[var5] - '퇋') + var5))) + '츇') - var5))) << 14) << 2))) - '\ued9b') ^ 12691) - 1271) >>> 4) + '\ue45a')));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-var4[var5]) ^ 23122) - '虌') << 15 | (char)((char)((char)(-var4[var5]) ^ 23122) - '虌') >>> 1) - var5))) >>> 14 | (char)(-((char)((char)((char)((char)((char)(-var4[var5]) ^ 23122) - '虌') << 15 | (char)((char)((char)(-var4[var5]) ^ 23122) - '虌') >>> 1) - var5))) << 2) >>> 10 | (char)((char)(-((char)((char)((char)((char)((char)(-var4[var5]) ^ 23122) - '虌') << 15 | (char)((char)((char)(-var4[var5]) ^ 23122) - '虌') >>> 1) - var5))) >>> 14 | (char)(-((char)((char)((char)((char)((char)(-var4[var5]) ^ 23122) - '虌') << 15 | (char)((char)((char)(-var4[var5]) ^ 23122) - '虌') >>> 1) - var5))) << 2) << 6) ^ var5) + '욿') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IilliliilIIi() {
      return this.iiiIliIIIl.size();
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) + var5) >>> 11 | (char)((char)(var4[var5] + var5) + var5) << 5))) - var5) - var5) + 21129))) << 9 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) + var5) >>> 11 | (char)((char)(var4[var5] + var5) + var5) << 5))) - var5) - var5) + 21129))) >>> 7) + var5) + '鎓'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iliIiiliiiii() {
      this.iiiIliIIIl.clear();
      this.IIIlliIIIl = 0;
   }
}
