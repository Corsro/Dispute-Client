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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IIilIlllIilIll {
   private float IlIiIIlilllIiIIlil;
   private int IiilIIlilliilIIlil = -1;
   private int llilIIlilililIIlil;
   private int iIilIIlilIlilIIlil;
   private final iiIiiiilIIliiiil[] IIilIIlillIilIIlil = new iiIiiiilIIliiiil[128];
   private float ilIiIIlilIiIiIIlil;
   private int lIIiIIliliIIiIIlil = -1;
   private final Map<Long, lIlilIlliIlilIll> IIliIIlillIliIIlil = new LinkedHashMap();
   public static final int liIiIIliliiIiIIlil = 64;
   public static final int lillIIliliillIIlil = 128;
   private long iiilIIlilIIIiIIlil;
   private lIlilIlliIlilIll iIliIIlilIlliIIlil;

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -4678637465918949811L ^ Long.rotateLeft(8386167163418214191L, 8) ^ 4613692364604955615L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -3318068332710858111L ^ Long.rotateLeft(3426544034972760729L, 63) ^ -4574132768993337467L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -1386073677561877075L ^ Long.rotateLeft(5652696974862733347L, 7) ^ -4074055672631061975L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8556236928962640553L ^ Long.rotateLeft(6895351611224094457L, 22) ^ -5924915013013707005L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4506380486738606301L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 8496165052376104362L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6257931189624961296L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 6257029106033548948L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4257635852274903307L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2175728998249849533L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIIilIIiiIIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IlIillIiilIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IiIiliIiiiIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIlilIliiIli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Illillliilli<invokedynamic>());
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

   public int lIiiIiIlilli(long block, String face, String support, long tick, int target) {
      long var12 = 8761995746379360169L;
      iiIiiiilIIliiiil var8 = this.Iilllilliill();
      var12 ^= ((long)(this.lIIiIIliliIIiIIlil >= 0 && this.iiilIIlilIIIiIIlil == block ? 1 : 0) << 32 ^ var12) & -1L << 32;
      lIlilIlliIlilIll var10 = new lIlilIlliIlilIll();
      var10.iIiIlIilll = ++this.llilIIlilililIIlil;
      var10.iliIlIilll = block;
      var10.IiiIlIilll = tick;
      var10.liiIlIilll = face == null ? "" : face;
      var10.iiiIlIilll = support == null ? "" : support;
      var10.IIIllIilll = (int)(var12 >>> 32) != 0 ? this.IlIiIIlilllIiIIlil : (var8 == null ? 0.0F : var8.liiiIIllIl());
      var10.iIIllIilll = (int)(var12 >>> 32) != 0 ? this.ilIiIIlilIiIiIIlil : (var8 == null ? 0.0F : var8.iIlIlllllill());
      var10.lIIllIilll = var8 == null ? var10.IIIllIilll : var8.liiiIIllIl();
      var10.IlIllIilll = var8 == null ? var10.iIIllIilll : var8.iIlIlllllill();
      var10.IliIlIilll = (int)(var12 >>> 32) != 0 ? target - this.lIIiIIliliIIiIIlil : 0;
      var10.liIllIilll = var8 != null && var8.IilliliilIIi();
      var10.iiIllIilll = var8 != null && var8.lIiiIiIlilli();
      var10.IIlllIilll = var8 != null && var8.iliIiiliiiii();
      var10.lliIlIilll = this.IiilIIlilliilIIlil < 0 ? -1 : target - this.IiilIIlilliilIIlil;
      this.Ililllililil(var10, (int)(var12 >>> 32) != 0 ? this.lIIiIIliliIIiIIlil : target);
      this.IiilIIlilliilIIlil = target;
      this.IIliIIlillIliIIlil.put(block, var10);

      while(this.IIliIIlillIliIIlil.size() > 64) {
         Iterator var11 = this.IIliIIlillIliIIlil.keySet().iterator();
         var11.next();
         var11.remove();
      }

      this.iIliIIlilIlliIIlil = var10;
      return var10.iIiIlIilll;
   }

   public long IilliliilIIi() {
      return this.lIIiIIliliIIiIIlil < 0 ? 0L : this.iiilIIlilIIIiIIlil;
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) ^ 6447))) >>> 6 | (char)(~((char)((char)(var4[var5] + var5) ^ 6447))) << 10) ^ var5)) << 11 | (char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) ^ 6447))) >>> 6 | (char)(~((char)((char)(var4[var5] + var5) ^ 6447))) << 10) ^ var5)) >>> 5) << 3 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) ^ 6447))) >>> 6 | (char)(~((char)((char)(var4[var5] + var5) ^ 6447))) << 10) ^ var5)) << 11 | (char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) ^ 6447))) >>> 6 | (char)(~((char)((char)(var4[var5] + var5) ^ 6447))) << 10) ^ var5)) >>> 5) >>> 13) >>> 15 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) ^ 6447))) >>> 6 | (char)(~((char)((char)(var4[var5] + var5) ^ 6447))) << 10) ^ var5)) << 11 | (char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) ^ 6447))) >>> 6 | (char)(~((char)((char)(var4[var5] + var5) ^ 6447))) << 10) ^ var5)) >>> 5) << 3 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) ^ 6447))) >>> 6 | (char)(~((char)((char)(var4[var5] + var5) ^ 6447))) << 10) ^ var5)) << 11 | (char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) ^ 6447))) >>> 6 | (char)(~((char)((char)(var4[var5] + var5) ^ 6447))) << 10) ^ var5)) >>> 5) >>> 13) << 1) + '늧'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5) - '苰')) ^ var5) - 26499) >>> 4 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5) - '苰')) ^ var5) - 26499) << 12))) << 5 | (char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5) - '苰')) ^ var5) - 26499) >>> 4 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5) - '苰')) ^ var5) - 26499) << 12))) >>> 11)) - 'ꁷ') << 13 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5) - '苰')) ^ var5) - 26499) >>> 4 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5) - '苰')) ^ var5) - 26499) << 12))) << 5 | (char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5) - '苰')) ^ var5) - 26499) >>> 4 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5) - '苰')) ^ var5) - 26499) << 12))) >>> 11)) - 'ꁷ') >>> 3) - '\ud86d') - '鸥') - 16297) + var5) - 22403));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iiIiiiilIIliiiil Iilllilliill() {
      return this.iIilIIlilIlilIIlil == 0 ? null : this.IIilIIlillIilIIlil[Math.floorMod(this.iIilIIlilIlilIIlil - 1, 128)];
   }

   public int IIIllIIliIIl() {
      return this.iIliIIlilIlliIIlil == null ? 0 : this.iIliIIlilIlliIIlil.iIiIlIilll;
   }

   public void iIlIlllllill() {
      this.lIIiIIliliIIiIIlil = -1;
      this.iiilIIlilIIIiIIlil = 0L;
   }

   public float IiIlliIliiIl() {
      return this.iIliIIlilIlliIIlil == null ? 0.0F : liillilliiillill.Ililllililil(this.iIliIIlilIlliIIlil.lIIllIilll - this.iIliIIlilIlliIIlil.IIIllIilll);
   }

   public List<iiIiiiilIIliiiil> Illlllllilll() {
      long var5 = 8309391542717160157L;
      ArrayList var1 = new ArrayList(Math.min(this.iIilIIlilIlilIIlil, 128));
      var5 ^= ((long)Math.max(0, this.iIilIIlilIlilIIlil - 128) << 32 ^ var5) & -1L << 32;

      for(long var8 = var5 ^ ((long)((int)(var5 >>> 32)) ^ var5) & -1L >>> 32; (int)var8 < this.iIilIIlilIlilIIlil; var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         iiIiiiilIIliiiil var4 = this.IIilIIlillIilIIlil[Math.floorMod((int)var8, 128)];
         if (var4 != null) {
            var1.add(var4);
         }
      }

      return var1;
   }

   public void IliIlllilIi(iiIiiiilIIliiiil s) {
      if (s != null) {
         this.IIilIIlillIilIIlil[Math.floorMod(this.iIilIIlilIlilIIlil, 128)] = s;
         ++this.iIilIIlilIlilIIlil;
      }
   }

   public String iliIiiliiiii(long target, String result) {
      lIlilIlliIlilIll var4 = (lIlilIlliIlilIll)this.IIliIIlillIliIIlil.remove(target);
      if (var4 == null) {
         var4 = this.iIliIIlilIlliIIlil != null && this.iIliIIlilIlliIIlil.iliIlIilll == target ? this.iIliIIlilIlliIIlil : new lIlilIlliIlilIll();
      }

      this.iIliIIlilIlliIIlil = var4;
      return String.format(Locale.ROOT, Iiilliiliiil<invokedynamic>(), var4.iIiIlIilll, var4.iliIlIilll, var4.liiIlIilll, var4.IIIllIilll, var4.lIIllIilll, liillilliiillill.Ililllililil(var4.lIIllIilll - var4.IIIllIilll), var4.iIIllIilll, var4.IlIllIilll, liillilliiillill.Ililllililil(var4.IlIllIilll - var4.iIIllIilll), var4.IliIlIilll, var4.llIllIilll, var4.ilIllIilll, var4.IiIllIilll, var4.lliIlIilll, var4.liIllIilll, var4.iiIllIilll, var4.IIlllIilll, var4.IiiIlIilll, var4.iiiIlIilll, result == null ? "" : result);
   }

   public void liiiIIllIl(long tick, int target) {
      if (this.lIIiIIliliIIiIIlil >= 0 && this.iiilIIlilIIIiIIlil == tick && target - this.lIIiIIliliIIiIIlil > 128) {
         this.iIlIlllllill();
      }

      if (this.lIIiIIliliIIiIIlil < 0 || this.iiilIIlilIIIiIIlil != tick) {
         iiIiiiilIIliiiil var4 = this.IIillIiliIil(target);
         if (var4 == null) {
            var4 = this.Iilllilliill();
         }

         this.iiilIIlilIIIiIIlil = tick;
         this.lIIiIIliliIIiIIlil = target;
         this.IlIiIIlilllIiIIlil = var4 == null ? 0.0F : var4.liiiIIllIl();
         this.ilIiIIlilIiIiIIlil = var4 == null ? 0.0F : var4.iIlIlllllill();
      }
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 4 | (char)(var4[var5] + var5) << 12) + 'ꦼ') + '\ue6fa') - var5) + '郗') + 4852) - 6185) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 4 | (char)(var4[var5] + var5) << 12) + 'ꦼ') + '\ue6fa') - var5) + '郗') + 4852) - 6185) << 12) + var5) ^ '逝') - 'ꍐ') ^ var5) - '骥') ^ var5) + '\uf259'))) ^ 32135));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))) << 13 | (char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))) >>> 3) << 7 | (char)((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))) << 13 | (char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))) >>> 3) >>> 9) ^ var5) ^ var5) - var5))) ^ 18401) + '錳') ^ var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private iiIiiiilIIliiiil IIillIiliIil(int tick) {
      for(iiIiiiilIIliiiil var3 : this.Illlllllilll()) {
         if (var3.IliIlllilIi() == tick) {
            return var3;
         }
      }

      return null;
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ '꜍') ^ var5) ^ '\ueea0') + 2615) >>> 15 | (char)((char)((char)((char)((char)(var4[var5] - var5) ^ '꜍') ^ var5) ^ '\ueea0') + 2615) << 1) << 4 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ '꜍') ^ var5) ^ '\ueea0') + 2615) >>> 15 | (char)((char)((char)((char)((char)(var4[var5] - var5) ^ '꜍') ^ var5) ^ '\ueea0') + 2615) << 1) >>> 12) - 14823) ^ 24796) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ '꜍') ^ var5) ^ '\ueea0') + 2615) >>> 15 | (char)((char)((char)((char)((char)(var4[var5] - var5) ^ '꜍') ^ var5) ^ '\ueea0') + 2615) << 1) << 4 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ '꜍') ^ var5) ^ '\ueea0') + 2615) >>> 15 | (char)((char)((char)((char)((char)(var4[var5] - var5) ^ '꜍') ^ var5) ^ '\ueea0') + 2615) << 1) >>> 12) - 14823) ^ 24796) << 8) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ '꜍') ^ var5) ^ '\ueea0') + 2615) >>> 15 | (char)((char)((char)((char)((char)(var4[var5] - var5) ^ '꜍') ^ var5) ^ '\ueea0') + 2615) << 1) << 4 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ '꜍') ^ var5) ^ '\ueea0') + 2615) >>> 15 | (char)((char)((char)((char)((char)(var4[var5] - var5) ^ '꜍') ^ var5) ^ '\ueea0') + 2615) << 1) >>> 12) - 14823) ^ 24796) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ '꜍') ^ var5) ^ '\ueea0') + 2615) >>> 15 | (char)((char)((char)((char)((char)(var4[var5] - var5) ^ '꜍') ^ var5) ^ '\ueea0') + 2615) << 1) << 4 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ '꜍') ^ var5) ^ '\ueea0') + 2615) >>> 15 | (char)((char)((char)((char)((char)(var4[var5] - var5) ^ '꜍') ^ var5) ^ '\ueea0') + 2615) << 1) >>> 12) - 14823) ^ 24796) << 8) << 10) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IIlllIlliIll() {
      Arrays.fill(this.IIilIIlillIilIIlil, (Object)null);
      this.iIilIIlilIlilIIlil = 0;
      this.llilIIlilililIIlil = 0;
      this.IiilIIlilliilIIlil = -1;
      this.iiilIIlilIIIiIIlil = 0L;
      this.lIIiIIliliIIiIIlil = -1;
      this.IlIiIIlilllIiIIlil = 0.0F;
      this.ilIiIIlilIiIiIIlil = 0.0F;
      this.IIliIIlillIliIIlil.clear();
      this.iIliIIlilIlliIIlil = null;
   }

   private void Ililllililil(lIlilIlliIlilIll fromTick, int r) {
      long var11 = 7873108215537099560L;
      iiIiiiilIIliiiil var3 = null;
      float var4 = Float.NaN;
      float var5 = Float.NaN;

      for(iiIiiiilIIliiiil var7 : this.Illlllllilll()) {
         if (var7.IliIlllilIi() >= r) {
            if (var3 != null) {
               var11 ^= ((long)Math.max(1, var7.IliIlllilIi() - var3.IliIlllilIi()) << 32 ^ var11) & -1L << 32;
               float var9 = liillilliiillill.Ililllililil(var7.liiiIIllIl() - var3.liiiIIllIl()) / (float)((int)(var11 >>> 32));
               float var10 = liillilliiillill.Ililllililil(var7.iIlIlllllill() - var3.iIlIlllllill()) / (float)((int)(var11 >>> 32));
               fromTick.llIllIilll = Math.max(fromTick.llIllIilll, Math.abs(var9));
               fromTick.ilIllIilll = Math.max(fromTick.ilIllIilll, Math.abs(var10));
               if (!Float.isNaN(var4)) {
                  fromTick.IiIllIilll = Math.max(fromTick.IiIllIilll, Math.max(Math.abs(var9 - var4), Math.abs(var10 - var5)));
               }

               var4 = var9;
               var5 = var10;
            }

            var3 = var7;
         }
      }

   }

   public int IlIlllIlilIl() {
      return this.iIliIIlilIlliIIlil == null ? 0 : this.iIliIIlilIlliIIlil.IliIlIilll;
   }
}
