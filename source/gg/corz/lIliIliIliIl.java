package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class lIliIliIliIl {
   public final String Iiilililliililil;
   public final String iiilililIIIiilil;
   public final long lIIiililiIIiilil;

   public int hashCode() {
      return this.iiilililIIIiilil.hashCode() * 31 + Long.hashCode(this.lIIiililiIIiilil);
   }

   public boolean equals(Object o) {
      boolean var10000;
      if (o instanceof lIliIliIliIl var2) {
         if (var2.iiilililIIIiilil.equals(this.iiilililIIIiilil) && var2.lIIiililiIIiilil == this.lIIiililiIIiilil) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   public String toString() {
      return this.IIIllIIliIIl();
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) ^ '겟'))) + 'ꄅ') ^ 15036) + var5) << 13 | (char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) ^ '겟'))) + 'ꄅ') ^ 15036) + var5) >>> 3) + var5) >>> 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) ^ '겟'))) + 'ꄅ') ^ 15036) + var5) << 13 | (char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) ^ '겟'))) + 'ꄅ') ^ 15036) + var5) >>> 3) + var5) << 3) + var5))) >>> 14 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) ^ '겟'))) + 'ꄅ') ^ 15036) + var5) << 13 | (char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) ^ '겟'))) + 'ꄅ') ^ 15036) + var5) >>> 3) + var5) >>> 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) ^ '겟'))) + 'ꄅ') ^ 15036) + var5) << 13 | (char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) ^ '겟'))) + 'ꄅ') ^ 15036) + var5) >>> 3) + var5) << 3) + var5))) << 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)(-((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) ^ '펺') ^ var5))) >>> 8 | (char)(-((char)((char)((char)(~var4[var5]) ^ '펺') ^ var5))) << 8) << 3 | (char)((char)(-((char)((char)((char)(~var4[var5]) ^ '펺') ^ var5))) >>> 8 | (char)(-((char)((char)((char)(~var4[var5]) ^ '펺') ^ var5))) << 8) >>> 13) >>> 5 | (char)((char)((char)(-((char)((char)((char)(~var4[var5]) ^ '펺') ^ var5))) >>> 8 | (char)(-((char)((char)((char)(~var4[var5]) ^ '펺') ^ var5))) << 8) << 3 | (char)((char)(-((char)((char)((char)(~var4[var5]) ^ '펺') ^ var5))) >>> 8 | (char)(-((char)((char)((char)(~var4[var5]) ^ '펺') ^ var5))) << 8) >>> 13) << 11) ^ var5) + var5))) + '\udf67'))) + var5))) ^ 21358) + 2769))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IiIliliIli iliIiiliiiii(String msgSessionUuid, long msgEpoch) {
      if (msgSessionUuid != null && !msgSessionUuid.isEmpty()) {
         if (!this.iiilililIIIiilil.equals(msgSessionUuid)) {
            return IiIliliIli.iiillIIlIIIilIIl;
         } else if (msgEpoch < this.lIIiililiIIiilil) {
            return IiIliliIli.lIIilIIliIIilIIl;
         } else {
            return msgEpoch > this.lIIiililiIIiilil ? IiIliliIli.IlIilIIlllIilIIl : IiIliliIli.IiillIIlliillIIl;
         }
      } else {
         return IiIliliIli.ilIilIIlIiIilIIl;
      }
   }

   public lIliIliIliIl(String epoch, String displayCode, long sessionUuid) {
      this.Iiilililliililil = epoch == null ? "" : epoch;
      this.iiilililIIIiilil = displayCode == null ? "" : displayCode;
      this.lIIiililiIIiilil = sessionUuid;
   }

   public static lIliIliIliIl liiiIIllIl(String displayCode, String startedAtMs, long coordinatorMemberId) {
      String var4 = (startedAtMs == null ? IlIlllIlilIl<invokedynamic>() : startedAtMs) + '@' + coordinatorMemberId;
      return new lIliIliIliIl(displayCode, Long.toHexString((long)var4.hashCode() & 4294967295L) + '-' + Long.toHexString(coordinatorMemberId), 1L);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(-((char)((char)(~((char)(~((char)(-((char)(-((char)((char)((char)((char)(~((char)(~((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) - '듁'))))) ^ var5) << 10 | (char)((char)(~((char)(~((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) - '듁'))))) ^ var5) >>> 6) << 12 | (char)((char)((char)(~((char)(~((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) - '듁'))))) ^ var5) << 10 | (char)((char)(~((char)(~((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) - '듁'))))) ^ var5) >>> 6) >>> 4))))))))) >>> 4 | (char)(~((char)(~((char)(-((char)(-((char)((char)((char)((char)(~((char)(~((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) - '듁'))))) ^ var5) << 10 | (char)((char)(~((char)(~((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) - '듁'))))) ^ var5) >>> 6) << 12 | (char)((char)((char)(~((char)(~((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) - '듁'))))) ^ var5) << 10 | (char)((char)(~((char)(~((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) - '듁'))))) ^ var5) >>> 6) >>> 4))))))))) << 12))) << 15 | (char)(-((char)((char)(~((char)(~((char)(-((char)(-((char)((char)((char)((char)(~((char)(~((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) - '듁'))))) ^ var5) << 10 | (char)((char)(~((char)(~((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) - '듁'))))) ^ var5) >>> 6) << 12 | (char)((char)((char)(~((char)(~((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) - '듁'))))) ^ var5) << 10 | (char)((char)(~((char)(~((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) - '듁'))))) ^ var5) >>> 6) >>> 4))))))))) >>> 4 | (char)(~((char)(~((char)(-((char)(-((char)((char)((char)((char)(~((char)(~((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) - '듁'))))) ^ var5) << 10 | (char)((char)(~((char)(~((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) - '듁'))))) ^ var5) >>> 6) << 12 | (char)((char)((char)(~((char)(~((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) - '듁'))))) ^ var5) << 10 | (char)((char)(~((char)(~((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) - '듁'))))) ^ var5) >>> 6) >>> 4))))))))) << 12))) >>> 1))) + var5));
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
         var4[var5] = (char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) >>> 12 | (char)(~((char)(var4[var5] ^ var5))) << 4) + '\uf1a8') ^ 'ꥮ') + var5))) ^ var5) - var5) ^ var5))) - var5) >>> 12 | (char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) >>> 12 | (char)(~((char)(var4[var5] ^ var5))) << 4) + '\uf1a8') ^ 'ꥮ') + var5))) ^ var5) - var5) ^ var5))) - var5) << 4) + var5) + 25251) << 14 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) >>> 12 | (char)(~((char)(var4[var5] ^ var5))) << 4) + '\uf1a8') ^ 'ꥮ') + var5))) ^ var5) - var5) ^ var5))) - var5) >>> 12 | (char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) >>> 12 | (char)(~((char)(var4[var5] ^ var5))) << 4) + '\uf1a8') ^ 'ꥮ') + var5))) ^ var5) - var5) ^ var5))) - var5) << 4) + var5) + 25251) >>> 2) + var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static lIliIliIliIl IliIlllilIi() {
      return new lIliIliIliIl("", "", 0L);
   }

   public boolean IilliliilIIi() {
      return !this.iiilililIIIiilil.isEmpty();
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) - var5) + 19292) ^ var5) - '謎') ^ var5) - var5) ^ 10848) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) - var5) + 19292) ^ var5) - '謎') ^ var5) - var5) ^ 10848) >>> 12) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) - var5) + 19292) ^ var5) - '謎') ^ var5) - var5) ^ 10848) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) - var5) + 19292) ^ var5) - '謎') ^ var5) - var5) ^ 10848) >>> 12) >>> 10) + 18267))) - var5) >>> 10 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) - var5) + 19292) ^ var5) - '謎') ^ var5) - var5) ^ 10848) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) - var5) + 19292) ^ var5) - '謎') ^ var5) - var5) ^ 10848) >>> 12) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) - var5) + 19292) ^ var5) - '謎') ^ var5) - var5) ^ 10848) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) - var5) + 19292) ^ var5) - '謎') ^ var5) - var5) ^ 10848) >>> 12) >>> 10) + 18267))) - var5) << 6))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean lIiiIiIlilli(String msgSessionUuid, long msgEpoch) {
      return this.IilliliilIIi() && this.iiilililIIIiilil.equals(msgSessionUuid) && this.lIIiililiIIiilil == msgEpoch;
   }

   public lIliIliIliIl iIlIlllllill() {
      return new lIliIliIliIl(this.Iiilililliililil, this.iiilililIIIiilil, this.lIIiililiIIiilil + 1L);
   }

   public String IIIllIIliIIl() {
      return String.format(Locale.ROOT, IlIlllIlilIl<invokedynamic>(), this.iiilililIIIiilil.isEmpty() ? IlIlllIlilIl<invokedynamic>() : this.iiilililIIIiilil, this.Iiilililliililil, this.lIIiililiIIiilil);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6680797250009762880L ^ Long.rotateLeft(6057586336214094722L, 58) ^ 9087644830207335566L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -8398117666462002056L ^ Long.rotateLeft(-8593126056418921393L, 28) ^ 6544421151740292202L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -5144200341285736244L ^ Long.rotateLeft(-7543011083665215531L, 53) ^ -7620138064668479207L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 8211454226129464380L ^ Long.rotateLeft(8998746438189516944L, 45) ^ -7884700138667345959L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1381081505218242852L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8306322935884025941L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6666344090616213401L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7765329136627319716L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -3715038866235148058L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4388599716774419963L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Iilllilliill<invokedynamic>());
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
}
