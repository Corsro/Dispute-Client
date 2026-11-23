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

public final class iiIIilIIlIil {
   private final long iIlilIliIllilIli;
   private final long IililIlilililIli;
   private final int iililIliIIiilIli;
   private final int lIiilIliiIiilIli;
   private int IIIIiIlilIIIiIli;
   private int liiilIliiiiilIli;
   private final IIiIlIilIiIlIi lllilIliillilIli;
   private iiiilllIIIIill IliilIlilliilIli;
   private String iliilIliIiiilIli;

   public long IilliliilIIi() {
      return this.lllilIliillilIli.IIIllIIliIIl();
   }

   public long iIlIlllllill() {
      return this.lllilIliillilIli.iliIiiliiiii();
   }

   public iiiilllIIIIill iliIiiliiiii() {
      return this.IliilIlilliilIli;
   }

   public void IIlllIlliIll(int tick) {
      if (this.IliilIlilliilIli == iiiilllIIIIill.iIlillIIiIllillIIi) {
         this.IliilIlilliilIli = iiiilllIIIIill.lllillIIiillillIIi;
         this.liiilIliiiiilIli = tick;
      }

   }

   public long lIiiIiIlilli() {
      return this.IililIlilililIli;
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6842755537217986520L ^ Long.rotateLeft(-7383496475724981869L, 45) ^ -2010197604101955605L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 4246267818060795958L ^ Long.rotateLeft(-7171566329605566267L, 27) ^ 4163196702837145846L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 1637813252068311084L ^ Long.rotateLeft(2495802354871312531L, 8) ^ 4237796992868622722L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 4648415957523375275L ^ Long.rotateLeft(4440000018833430306L, 19) ^ 8127249071731060141L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3541597228487179902L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 2327985481517861620L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 8364741160106628137L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1393064369991147164L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -3983767694458089812L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 5644824487782261390L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iiilliiliiil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIIilIIiiIIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IlIillIiilIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IiIiliIiiiIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIlilIliiIli<invokedynamic>());
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

   public String IlIlllIlilIl() {
      return this.iliilIliIiiilIli;
   }

   public boolean IIIllIIliIIl() {
      return this.IliilIlilliilIli == iiiilllIIIIill.iIlillIIiIllillIIi || this.IliilIlilliilIli == iiiilllIIIIill.lllillIIiillillIIi;
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) - var5) + var5))) - var5) - 15463) + var5) >>> 11 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) - var5) + var5))) - var5) - 15463) + var5) << 5) << 13 | (char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) - var5) + var5))) - var5) - 15463) + var5) >>> 11 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) - var5) + var5))) - var5) - 15463) + var5) << 5) >>> 3) + var5) + '쬌'))) ^ var5) + var5))) + '鶽') >>> 11 | (char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) - var5) + var5))) - var5) - 15463) + var5) >>> 11 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) - var5) + var5))) - var5) - 15463) + var5) << 5) << 13 | (char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) - var5) + var5))) - var5) - 15463) + var5) >>> 11 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) - var5) + var5))) - var5) - 15463) + var5) << 5) >>> 3) + var5) + '쬌'))) ^ var5) + var5))) + '鶽') << 5) - '뿠') >>> 7 | (char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) - var5) + var5))) - var5) - 15463) + var5) >>> 11 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) - var5) + var5))) - var5) - 15463) + var5) << 5) << 13 | (char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) - var5) + var5))) - var5) - 15463) + var5) >>> 11 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) - var5) + var5))) - var5) - 15463) + var5) << 5) >>> 3) + var5) + '쬌'))) ^ var5) + var5))) + '鶽') >>> 11 | (char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) - var5) + var5))) - var5) - 15463) + var5) >>> 11 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) - var5) + var5))) - var5) - 15463) + var5) << 5) << 13 | (char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) - var5) + var5))) - var5) - 15463) + var5) >>> 11 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) - var5) + var5))) - var5) - 15463) + var5) << 5) >>> 3) + var5) + '쬌'))) ^ var5) + var5))) + '鶽') << 5) - '뿠') << 9));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) >>> 2 | (char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) << 14) + '뜗') + '\udb1d') >>> 7 | (char)((char)((char)((char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) >>> 2 | (char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) << 14) + '뜗') + '\udb1d') << 9) << 9 | (char)((char)((char)((char)((char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) >>> 2 | (char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) << 14) + '뜗') + '\udb1d') >>> 7 | (char)((char)((char)((char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) >>> 2 | (char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) << 14) + '뜗') + '\udb1d') << 9) >>> 7))) >>> 4 | (char)(-((char)((char)((char)((char)((char)((char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) >>> 2 | (char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) << 14) + '뜗') + '\udb1d') >>> 7 | (char)((char)((char)((char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) >>> 2 | (char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) << 14) + '뜗') + '\udb1d') << 9) << 9 | (char)((char)((char)((char)((char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) >>> 2 | (char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) << 14) + '뜗') + '\udb1d') >>> 7 | (char)((char)((char)((char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) >>> 2 | (char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) << 14) + '뜗') + '\udb1d') << 9) >>> 7))) << 12) + 9293) >>> 7 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) >>> 2 | (char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) << 14) + '뜗') + '\udb1d') >>> 7 | (char)((char)((char)((char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) >>> 2 | (char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) << 14) + '뜗') + '\udb1d') << 9) << 9 | (char)((char)((char)((char)((char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) >>> 2 | (char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) << 14) + '뜗') + '\udb1d') >>> 7 | (char)((char)((char)((char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) >>> 2 | (char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) << 14) + '뜗') + '\udb1d') << 9) >>> 7))) >>> 4 | (char)(-((char)((char)((char)((char)((char)((char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) >>> 2 | (char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) << 14) + '뜗') + '\udb1d') >>> 7 | (char)((char)((char)((char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) >>> 2 | (char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) << 14) + '뜗') + '\udb1d') << 9) << 9 | (char)((char)((char)((char)((char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) >>> 2 | (char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) << 14) + '뜗') + '\udb1d') >>> 7 | (char)((char)((char)((char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) >>> 2 | (char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15) << 14) + '뜗') + '\udb1d') << 9) >>> 7))) << 12) + 9293) << 9) + '鉑') - 32111) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IIiIlIilIiIlIi liiiIIllIl() {
      return this.lllilIliillilIli;
   }

   public void Iilllilliill(String tick, int reason) {
      if (this.IIIllIIliIIl()) {
         this.IliilIlilliilIli = iiiilllIIIIill.iilillIIiIIiillIIi;
         this.iliilIliIiiilIli = tick == null ? "" : tick;
         this.IIIIiIlilIIIiIli = reason;
      }
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) >>> 2 | (char)(-var4[var5]) << 14) ^ 1293) >>> 8 | (char)((char)((char)(-var4[var5]) >>> 2 | (char)(-var4[var5]) << 14) ^ 1293) << 8))) + var5) - 7203) ^ 22693) ^ 26478))) + var5) + '鵶') - 14865) >>> 15 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) >>> 2 | (char)(-var4[var5]) << 14) ^ 1293) >>> 8 | (char)((char)((char)(-var4[var5]) >>> 2 | (char)(-var4[var5]) << 14) ^ 1293) << 8))) + var5) - 7203) ^ 22693) ^ 26478))) + var5) + '鵶') - 14865) << 1) + '\ue7c2') + var5) << 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) >>> 2 | (char)(-var4[var5]) << 14) ^ 1293) >>> 8 | (char)((char)((char)(-var4[var5]) >>> 2 | (char)(-var4[var5]) << 14) ^ 1293) << 8))) + var5) - 7203) ^ 22693) ^ 26478))) + var5) + '鵶') - 14865) >>> 15 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) >>> 2 | (char)(-var4[var5]) << 14) ^ 1293) >>> 8 | (char)((char)((char)(-var4[var5]) >>> 2 | (char)(-var4[var5]) << 14) ^ 1293) << 8))) + var5) - 7203) ^ 22693) ^ 26478))) + var5) + '鵶') - 14865) << 1) + '\ue7c2') + var5) >>> 11) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) >>> 2 | (char)(-var4[var5]) << 14) ^ 1293) >>> 8 | (char)((char)((char)(-var4[var5]) >>> 2 | (char)(-var4[var5]) << 14) ^ 1293) << 8))) + var5) - 7203) ^ 22693) ^ 26478))) + var5) + '鵶') - 14865) >>> 15 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) >>> 2 | (char)(-var4[var5]) << 14) ^ 1293) >>> 8 | (char)((char)((char)(-var4[var5]) >>> 2 | (char)(-var4[var5]) << 14) ^ 1293) << 8))) + var5) - 7203) ^ 22693) ^ 26478))) + var5) + '鵶') - 14865) << 1) + '\ue7c2') + var5) << 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) >>> 2 | (char)(-var4[var5]) << 14) ^ 1293) >>> 8 | (char)((char)((char)(-var4[var5]) >>> 2 | (char)(-var4[var5]) << 14) ^ 1293) << 8))) + var5) - 7203) ^ 22693) ^ 26478))) + var5) + '鵶') - 14865) >>> 15 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) >>> 2 | (char)(-var4[var5]) << 14) ^ 1293) >>> 8 | (char)((char)((char)(-var4[var5]) >>> 2 | (char)(-var4[var5]) << 14) ^ 1293) << 8))) + var5) - 7203) ^ 22693) ^ 26478))) + var5) + '鵶') - 14865) << 1) + '\ue7c2') + var5) >>> 11) >>> 6) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)(~((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ '뜬') ^ var5) ^ var5) - var5) ^ var5)))))))) >>> 10 | (char)((char)(-((char)(~((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ '뜬') ^ var5) ^ var5) - var5) ^ var5)))))))) << 6) - var5) + 27847));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IiIlliIliiIl() {
      return this.lIiilIliiIiilIli;
   }

   public String IIillIiliIil() {
      return String.format(Locale.ROOT, Ililllililil<invokedynamic>(), this.iIlilIliIllilIli, this.IliilIlilliilIli, this.lllilIliillilIli.lIiiIiIlilli(), this.lllilIliillilIli.iliIiiliiiii(), this.lllilIliillilIli.IIIllIIliIIl(), this.lllilIliillilIli.Iilllilliill(), this.lllilIliillilIli.IiIlliIliiIl(), this.lllilIliillilIli.IIlllIlliIll(), this.IililIlilililIli, this.iililIliIIiilIli, (this.IIIIiIlilIIIiIli >= 0 ? this.IIIIiIlilIIIiIli : Math.max(this.lIiilIliiIiilIli, this.liiilIliiiiilIli)) - this.lIiilIliiIiilIli, this.iliilIliIiiilIli.isEmpty() ? "" : Ililllililil<invokedynamic>() + this.iliilIliIiiilIli);
   }

   public long IliIlllilIi() {
      return this.iIlilIliIllilIli;
   }

   public iiIIilIIlIil(long createdTick, IIiIlIilIiIlIi id, long alternative, int refusedTarget, int refusedRouteLen) {
      this.IliilIlilliilIli = iiiilllIIIIill.iIlillIIiIllillIIi;
      this.iliilIliIiiilIli = "";
      this.liiilIliiiiilIli = -1;
      this.IIIIiIlilIIIiIli = -1;
      this.iIlilIliIllilIli = createdTick;
      this.lllilIliillilIli = id;
      this.IililIlilililIli = alternative;
      this.iililIliIIiilIli = refusedTarget;
      this.lIiilIliiIiilIli = refusedRouteLen;
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + var5) ^ var5) + var5) - '靪') << 13 | (char)((char)((char)((char)((char)(var4[var5] - var5) + var5) ^ var5) + var5) - '靪') >>> 3) - 25502) - var5) + '\uf289') << 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + var5) ^ var5) + var5) - '靪') << 13 | (char)((char)((char)((char)((char)(var4[var5] - var5) + var5) ^ var5) + var5) - '靪') >>> 3) - 25502) - var5) + '\uf289') >>> 14) - '뻾') - 8056));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean Illlllllilll(long cell, int tick) {
      if (this.IIIllIIliIIl() && cell == this.lllilIliillilIli.iliIiiliiiii()) {
         this.IliilIlilliilIli = iiiilllIIIIill.IilillIIililillIIi;
         this.IIIIiIlilIIIiIli = tick;
         return true;
      } else {
         return false;
      }
   }
}
