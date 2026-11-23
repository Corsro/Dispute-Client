package gg.corz;

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
import net.minecraft.class_243;

public record IIlilIIllIlilIIl(int entityId, int causeId, int directId, class_243 source, String type) implements IlIillIiilIi {
   private final class_243 IiiiiillIl;
   private final int IliiiillIl;
   private final int lliiiillIl;
   private final int iliiiillIl;
   private final String liiiiillIl;

   public IIlilIIllIlilIIl(int causeId, int entityId, int directId, class_243 source) {
      this(causeId, entityId, directId, source, iliIiiliiiii<invokedynamic>());
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) ^ '놸') >>> 2 | (char)((char)((char)(-var4[var5]) ^ var5) ^ '놸') << 14) ^ 30477) ^ var5) - 23099) + 5057))) ^ var5) ^ '둑') + 5230) - '蟃') >>> 15 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) ^ '놸') >>> 2 | (char)((char)((char)(-var4[var5]) ^ var5) ^ '놸') << 14) ^ 30477) ^ var5) - 23099) + 5057))) ^ var5) ^ '둑') + 5230) - '蟃') << 1) + var5) + var5))) - var5));
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
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)(~((char)(var4[var5] ^ 20259))) - 17377) >>> 2 | (char)((char)(~((char)(var4[var5] ^ 20259))) - 17377) << 14) - '노'))))) ^ var5) << 4 | (char)((char)(~((char)(-((char)((char)((char)((char)(~((char)(var4[var5] ^ 20259))) - 17377) >>> 2 | (char)((char)(~((char)(var4[var5] ^ 20259))) - 17377) << 14) - '노'))))) ^ var5) >>> 12) + 18516) + var5))) ^ '긷'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)(~((char)(-((char)((char)((char)((char)(var4[var5] - var5) ^ 7779) - 28360) - var5))))) + var5))) + 1979) ^ var5))) >>> 4 | (char)(-((char)((char)((char)(~((char)((char)(~((char)(-((char)((char)((char)((char)(var4[var5] - var5) ^ 7779) - 28360) - var5))))) + var5))) + 1979) ^ var5))) << 12) << 4 | (char)((char)(-((char)((char)((char)(~((char)((char)(~((char)(-((char)((char)((char)((char)(var4[var5] - var5) ^ 7779) - 28360) - var5))))) + var5))) + 1979) ^ var5))) >>> 4 | (char)(-((char)((char)((char)(~((char)((char)(~((char)(-((char)((char)((char)((char)(var4[var5] - var5) ^ 7779) - 28360) - var5))))) + var5))) + 1979) ^ var5))) << 12) >>> 12))) ^ var5) ^ var5) + var5)) << 8 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)(~((char)(-((char)((char)((char)((char)(var4[var5] - var5) ^ 7779) - 28360) - var5))))) + var5))) + 1979) ^ var5))) >>> 4 | (char)(-((char)((char)((char)(~((char)((char)(~((char)(-((char)((char)((char)((char)(var4[var5] - var5) ^ 7779) - 28360) - var5))))) + var5))) + 1979) ^ var5))) << 12) << 4 | (char)((char)(-((char)((char)((char)(~((char)((char)(~((char)(-((char)((char)((char)((char)(var4[var5] - var5) ^ 7779) - 28360) - var5))))) + var5))) + 1979) ^ var5))) >>> 4 | (char)(-((char)((char)((char)(~((char)((char)(~((char)(-((char)((char)((char)((char)(var4[var5] - var5) ^ 7779) - 28360) - var5))))) + var5))) + 1979) ^ var5))) << 12) >>> 12))) ^ var5) ^ var5) + var5)) >>> 8));
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
         var4[var5] = (char)((char)(-((char)(~((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] ^ 'ꉾ') >>> 8 | (char)(var4[var5] ^ 'ꉾ') << 8))) ^ var5) ^ 2848))) ^ 21812) + 21120))) >>> 8 | (char)(-((char)((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] ^ 'ꉾ') >>> 8 | (char)(var4[var5] ^ 'ꉾ') << 8))) ^ var5) ^ 2848))) ^ 21812) + 21120))) << 8) >>> 6 | (char)((char)(-((char)((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] ^ 'ꉾ') >>> 8 | (char)(var4[var5] ^ 'ꉾ') << 8))) ^ var5) ^ 2848))) ^ 21812) + 21120))) >>> 8 | (char)(-((char)((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] ^ 'ꉾ') >>> 8 | (char)(var4[var5] ^ 'ꉾ') << 8))) ^ var5) ^ 2848))) ^ 21812) + 21120))) << 8) << 10) + 10393))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int liiiIIllIl() {
      return this.lliiiillIl;
   }

   public String lIiiIiIlilli() {
      return this.liiiiillIl;
   }

   public int IliIlllilIi() {
      return this.IliiiillIl;
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -1615142724556811301L ^ Long.rotateLeft(-8366484865234481393L, 35) ^ -4826258965176767067L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 5348878237393604551L ^ Long.rotateLeft(7592412162376877691L, 51) ^ 5431198460345220238L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5269458526516589145L ^ Long.rotateLeft(-4311974029470005486L, 34) ^ -552697334867984478L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5749919356078989187L ^ Long.rotateLeft(-1805596882378835129L, 1) ^ -1744294325318022830L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6922203065431098561L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8661602845329054851L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 29692311638908518L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3381529069714142171L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 1217640613480507186L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -6053872301366911771L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIIllIIliIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IlIlllIlilIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IiIlliIliiIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IIlllIlliIll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Illlllllilll<invokedynamic>());
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

   public class_243 IilliliilIIi() {
      return this.IiiiiillIl;
   }

   public int iIlIlllllill() {
      return this.iliiiillIl;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(~var4[var5])) - 7848))))) << 14 | (char)(-((char)(-((char)((char)((char)(~var4[var5])) - 7848))))) >>> 2) ^ '톼')) - '\uea5d') << 9 | (char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(~var4[var5])) - 7848))))) << 14 | (char)(-((char)(-((char)((char)((char)(~var4[var5])) - 7848))))) >>> 2) ^ '톼')) - '\uea5d') >>> 7) << 5 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(~var4[var5])) - 7848))))) << 14 | (char)(-((char)(-((char)((char)((char)(~var4[var5])) - 7848))))) >>> 2) ^ '톼')) - '\uea5d') << 9 | (char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(~var4[var5])) - 7848))))) << 14 | (char)(-((char)(-((char)((char)((char)(~var4[var5])) - 7848))))) >>> 2) ^ '톼')) - '\uea5d') >>> 7) >>> 11) - '\ue746') ^ 24463) ^ 'ｅ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IIlilIIllIlilIIl(int type, int entityId, int source, class_243 directId, String causeId) {
      this.IliiiillIl = type;
      this.lliiiillIl = entityId;
      this.iliiiillIl = source;
      this.IiiiiillIl = directId;
      this.liiiiillIl = causeId;
   }
}
