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
import java.util.Locale;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public record IIllIlilIllIli(long target, long causalConfirmedCell, int lostDurablePoses, int previousCapability, long[] causalCells, long geometryFingerprint, long tempAssetFingerprint, int createdTick, IIIIlIlllIIIlIll state, List<lIilllIliIilllIl> tried, iilililIIiilil scope, int firstActionTick) {
   private final iilililIIiilil lIliIIIIIl;
   private final IIIIlIlllIIIlIll iiIiIIIIIl;
   private final int iIIiIIIIIl;
   private final long lIIiIIIIIl;
   private final long ilIiIIIIIl;
   private final long[] llIiIIIIIl;
   private final int IlIiIIIIIl;
   private final long IIIiIIIIIl;
   private final long IiIiIIIIIl;
   private final int iIliIIIIIl;
   private final int liIiIIIIIl;
   private final List<lIilllIliIilllIl> IIliIIIIIl;

   public long Ililllililil() {
      return this.IiIiIIIIIl;
   }

   public int IIlllIlliIll() {
      return this.iIIiIIIIIl;
   }

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) << 15 | (char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) >>> 1) + var5))) + var5) + '배') << 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) << 15 | (char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) >>> 1) + var5))) + var5) + '배') >>> 10) + 8009) << 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) << 15 | (char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) >>> 1) + var5))) + var5) + '배') << 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) << 15 | (char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) >>> 1) + var5))) + var5) + '배') >>> 10) + 8009) >>> 7) << 9 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) << 15 | (char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) >>> 1) + var5))) + var5) + '배') << 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) << 15 | (char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) >>> 1) + var5))) + var5) + '배') >>> 10) + 8009) << 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) << 15 | (char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) >>> 1) + var5))) + var5) + '배') << 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) << 15 | (char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) >>> 1) + var5))) + var5) + '배') >>> 10) + 8009) >>> 7) >>> 7) + var5))) ^ 4277) - var5) >>> 14 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) << 15 | (char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) >>> 1) + var5))) + var5) + '배') << 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) << 15 | (char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) >>> 1) + var5))) + var5) + '배') >>> 10) + 8009) << 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) << 15 | (char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) >>> 1) + var5))) + var5) + '배') << 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) << 15 | (char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) >>> 1) + var5))) + var5) + '배') >>> 10) + 8009) >>> 7) << 9 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) << 15 | (char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) >>> 1) + var5))) + var5) + '배') << 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) << 15 | (char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) >>> 1) + var5))) + var5) + '배') >>> 10) + 8009) << 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) << 15 | (char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) >>> 1) + var5))) + var5) + '배') << 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) << 15 | (char)((char)((char)(var4[var5] ^ var5) ^ 16286) << 6 | (char)((char)(var4[var5] ^ var5) ^ 16286) >>> 10) >>> 1) + var5))) + var5) + '배') >>> 10) + 8009) >>> 7) >>> 7) + var5))) ^ 4277) - var5) << 2) + '궊'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ '\ue896') ^ '饇') - var5))) - var5) - 13288) - '잹') + '쨖'))) + 20336) ^ '쁫'))) >>> 12 | (char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ '\ue896') ^ '饇') - var5))) - var5) - 13288) - '잹') + '쨖'))) + 20336) ^ '쁫'))) << 4) - var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + '鞦') >>> 1 | (char)(var4[var5] + '鞦') << 15))) - '샬') + '鴮') + var5) ^ '쎢') ^ var5) ^ '褅') + 26376))) << 2 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + '鞦') >>> 1 | (char)(var4[var5] + '鞦') << 15))) - '샬') + '鴮') + var5) ^ '쎢') ^ var5) ^ '褅') + 26376))) >>> 14))) >>> 13 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + '鞦') >>> 1 | (char)(var4[var5] + '鞦') << 15))) - '샬') + '鴮') + var5) ^ '쎢') ^ var5) ^ '褅') + 26376))) << 2 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + '鞦') >>> 1 | (char)(var4[var5] + '鞦') << 15))) - '샬') + '鴮') + var5) ^ '쎢') ^ var5) ^ '褅') + 26376))) >>> 14))) << 3)))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Illlllllilll() {
      return this.IlIiIIIIIl;
   }

   public iilililIIiilil IiIiliIiiiIi() {
      return this.lIliIIIIIl;
   }

   public Optional<lIilllIliIilllIl> iliIiiliiiii() {
      long var5 = -247063489978688742L;
      lIilllIliIilllIl[] var1 = lIilllIliIilllIl.values();
      var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

      for(long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         lIilllIliIilllIl var4 = var1[(int)var8];
         if (!this.IIliIIIIIl.contains(var4)) {
            return Optional.of(var4);
         }
      }

      return Optional.empty();
   }

   public IIllIlilIllIli iIlIlllllill(lIilllIliIilllIl a) {
      ArrayList var2 = new ArrayList(this.IIliIIIIIl);
      if (!var2.contains(a)) {
         var2.add(a);
      }

      return new IIllIlilIllIli(this.IIIiIIIIIl, this.lIIiIIIIIl, this.iIIiIIIIIl, this.IlIiIIIIIl, this.llIiIIIIIl, this.ilIiIIIIIl, this.IiIiIIIIIl, this.liIiIIIIIl, IIIIlIlllIIIlIll.illiIlllll, var2, this.lIliIIIIIl, this.iIliIIIIIl);
   }

   public long IIillIiliIil() {
      return this.ilIiIIIIIl;
   }

   public int lIiiIiIlilli() {
      return this.iIliIIIIIl < 0 ? -1 : this.iIliIIIIIl - this.liIiIIIIIl;
   }

   public boolean IliIlllilIi() {
      return this.iiIiIIIIIl == IIIIlIlllIIIlIll.llliIlllll || this.iiIiIIIIIl == IIIIlIlllIIIlIll.illiIlllll;
   }

   public IIllIlilIllIli(long geometryFingerprint, long lostDurablePoses, int firstActionTick, int causalConfirmedCell, long[] state, long causalCells, long previousCapability, int tried, IIIIlIlllIIIlIll target, List<lIilllIliIilllIl> createdTick, iilililIIiilil scope, int tempAssetFingerprint) {
      state = state == null ? new long[0] : (long[])(([J)state).clone();
      createdTick = createdTick == null ? List.of() : List.copyOf(createdTick);
      this.IIIiIIIIIl = geometryFingerprint;
      this.lIIiIIIIIl = lostDurablePoses;
      this.iIIiIIIIIl = firstActionTick;
      this.IlIiIIIIIl = causalConfirmedCell;
      this.llIiIIIIIl = state;
      this.ilIiIIIIIl = causalCells;
      this.IiIiIIIIIl = previousCapability;
      this.liIiIIIIIl = tried;
      this.iiIiIIIIIl = target;
      this.IIliIIIIIl = createdTick;
      this.lIliIIIIIl = scope;
      this.iIliIIIIIl = tempAssetFingerprint;
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(-((char)((char)(-var4[var5])))))))) + var5) ^ 11629) + '쓓') - var5) + '藜') - var5))) >>> 9 | (char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(-((char)((char)(-var4[var5])))))))) + var5) ^ 11629) + '쓓') - var5) + '藜') - var5))) << 7) - var5) << 12 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(-((char)((char)(-var4[var5])))))))) + var5) ^ 11629) + '쓓') - var5) + '藜') - var5))) >>> 9 | (char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(-((char)((char)(-var4[var5])))))))) + var5) ^ 11629) + '쓓') - var5) + '藜') - var5))) << 7) - var5) >>> 4) ^ 'ﰠ') + var5) ^ var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public List<lIilllIliIilllIl> IlIillIiilIi() {
      return this.IIliIIIIIl;
   }

   public int IIlilIliiIli() {
      return this.iIliIIIIIl;
   }

   public int Iiilliiliiil() {
      return this.liIiIIIIIl;
   }

   public IIllIlilIllIli liiiIIllIl(IIIIlIlllIIIlIll s) {
      return new IIllIlilIllIli(this.IIIiIIIIIl, this.lIIiIIIIIl, this.iIIiIIIIIl, this.IlIiIIIIIl, this.llIiIIIIIl, this.ilIiIIIIIl, this.IiIiIIIIIl, this.liIiIIIIIl, s, this.IIliIIIIIl, this.lIliIIIIIl, this.iIliIIIIIl);
   }

   public IIllIlilIllIli IilliliilIIi(int tick) {
      return this.iIliIIIIIl >= 0 ? this : new IIllIlilIllIli(this.IIIiIIIIIl, this.lIIiIIIIIl, this.iIIiIIIIIl, this.IlIiIIIIIl, this.llIiIIIIIl, this.ilIiIIIIIl, this.IiIiIIIIIl, this.liIiIIIIIl, this.iiIiIIIIIl, this.IIliIIIIIl, this.lIliIIIIIl, tick);
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -7280465824546159711L ^ Long.rotateLeft(3614906674710770157L, 60) ^ 6035565176232427362L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -920854531431981540L ^ Long.rotateLeft(-8009638054735276709L, 41) ^ 5890417210664217703L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 9177361293113139562L ^ Long.rotateLeft(2956427068453843002L, 60) ^ -5835311369938335535L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5631696037494892647L ^ Long.rotateLeft(-5947967976033817227L, 1) ^ 5530597806301707054L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 2480029203811391361L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -962122231363088327L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 3495491139682813654L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3193832810096874189L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5323200331927907553L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1575010451097676928L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iilililiiili<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIiilIiiiIii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iliilliiilii<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Iiiiliiiiiii<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIIIllIIIl<invokedynamic>());
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

   public long IlIlllIlilIl() {
      return this.IIIiIIIIIl;
   }

   public String IIIllIIliIIl() {
      return String.format(Locale.ROOT, Illillliilli<invokedynamic>(), iiiliIIIii.IliIlllilIi(this.IIIiIIIIIl), iiiliIIIii.IliIlllilIi(this.lIIiIIIIIl), this.IlIiIIIIIl, this.iiIiIIIIIl, this.IIliIIIIIl, this.liIiIIIIIl, this.lIliIIIIIl == null ? Illillliilli<invokedynamic>() : this.lIliIIIIIl.lIiiIiIlilli(), this.lIiiIiIlilli());
   }

   public IIIIlIlllIIIlIll IIIilIIiiIIi() {
      return this.iiIiIIIIIl;
   }

   public long[] Iilllilliill() {
      return this.llIiIIIIIl;
   }

   public long IiIlliIliiIl() {
      return this.lIIiIIIIIl;
   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)(~((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '\uf1fd') ^ var5) << 6 | (char)((char)((char)(~var4[var5]) + '\uf1fd') ^ var5) >>> 10) + var5) ^ '遱') ^ 2460) - var5) >>> 7 | (char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '\uf1fd') ^ var5) << 6 | (char)((char)((char)(~var4[var5]) + '\uf1fd') ^ var5) >>> 10) + var5) ^ '遱') ^ 2460) - var5) << 9) + 6392))))))) + var5) + var5))) - '꼺'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
