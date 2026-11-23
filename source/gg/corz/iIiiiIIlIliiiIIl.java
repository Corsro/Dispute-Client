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
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2350.class_2351;

public final class iIiiiIIlIliiiIIl {
   private final int IlllllilIl;
   private final int iiIlllilIl;
   private final int llIlllilIl;
   public final int IIIlllilIl;
   private final int lIllllilIl;
   public final class_2350.class_2351 lIIlllilIl;
   public final boolean iIIlllilIl;
   private final int illlllilIl;
   private final int lillllilIl;
   private int IlilllilIl;
   private final int IiIlllilIl;
   private final int iillllilIl;
   private final int liIlllilIl;
   public final int iiiIllilIl;
   private int lIilllilIl;
   private final int IIllllilIl;
   private final int IillllilIl;
   private final int llllllilIl;
   public final boolean IlIlllilIl;
   private boolean llilllilIl;
   private final int iIllllilIl;
   private int iIilllilIl;
   private final int IIilllilIl;
   private final int ilIlllilIl;
   private boolean ililllilIl;

   public class_2338 IiIiliIiiiIi() {
      return this.IIlilIliiIli(this.IiIlliIliiIl(), this.Iiilliiliiil(), this.iIlIlllllill());
   }

   // $FF: synthetic method
   private static CallSite lIIlliIIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] << 5 | var4[var5] >>> 11)))) + 11188))) + 13798) + var5))) + 5366))) ^ var5) >>> 3 | (char)((char)(-((char)((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] << 5 | var4[var5] >>> 11)))) + 11188))) + 13798) + var5))) + 5366))) ^ var5) << 13));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean Illillliilli() {
      return this.ililllilIl;
   }

   public void Iiiiliiiiiii() {
      this.iIilllilIl = 0;
      this.IlilllilIl = 0;
      this.llilllilIl = false;
   }

   // $FF: synthetic method
   private static CallSite iIiIlIliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6310980286707079086L ^ Long.rotateLeft(7764620224624358615L, 7) ^ -5420676469619016671L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8614379288988321738L ^ Long.rotateLeft(6978562914017006049L, 24) ^ -3654480249238577535L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2662711281950889754L ^ Long.rotateLeft(1470229564625817733L, 15) ^ -562495044111670797L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 1710827310558047070L ^ Long.rotateLeft(5577445993993616813L, 58) ^ -3221063252030283138L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -5544983537565788921L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 2733329944464405060L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -5810874440540019290L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7053415915097697559L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6322527134636705476L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -3892645541201234356L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(lliIliliIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiiIlliiIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, iiiIlIIIll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, lIIlliIIll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IlIllllIll<invokedynamic>());
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

   private static int IIIilIIiiIIi(int v, int lo, int hi) {
      return hi - lo < 2 ? v : Math.max(lo + 1, Math.min(hi - 1, v));
   }

   public int llIIlilIIl() {
      return this.IlllllilIl;
   }

   public boolean Iilllilliill() {
      return this.IIlllIlliIll() == this.IIIlllilIl && this.Illlllllilll() == this.iiiIllilIl;
   }

   public void IIiilIiiiIii() {
      if (!this.llilllilIl) {
         ++this.IlilllilIl;
         if (this.IlilllilIl >= this.IIilllilIl) {
            this.IlilllilIl = 0;
            ++this.iIilllilIl;
            if (this.iIilllilIl >= this.iillllilIl) {
               this.llilllilIl = true;
            }
         }

      }
   }

   public int liiiIIllIl() {
      return this.IillllilIl - this.lIilllilIl * this.iiiIllilIl;
   }

   // $FF: synthetic method
   private static CallSite IlIllllIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '큪') - 13547) ^ '퀹') + 29020))) ^ var5) - var5) ^ '뱩') ^ '깾') + '쿛'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int iiIIlIIlIl() {
      return this.lIilllilIl;
   }

   private int IIIllIIliIIl() {
      return Math.min(this.llllllilIl, this.iliIiiliiiii() + this.IIIlllilIl - 1);
   }

   public boolean Iilililiiili() {
      return this.llilllilIl;
   }

   public class_2338 IIlilIliiIli(int y, int cross, int travel) {
      return this.lIIlllilIl == class_2351.field_11048 ? new class_2338(y, travel, cross) : new class_2338(cross, travel, y);
   }

   public float illIlIilIl() {
      if (this.ililllilIl) {
         return 1.0F;
      } else {
         double var1 = this.llilllilIl ? (double)1.0F : ((double)this.iIilllilIl + (double)this.IlilllilIl / (double)Math.max(1, this.IIilllilIl)) / (double)Math.max(1, this.iillllilIl);
         return (float)Math.min((double)1.0F, ((double)this.lIilllilIl + var1) / (double)this.lillllilIl);
      }
   }

   public int Iiilliiliiil() {
      long var2 = -1570951281555746079L;
      var2 ^= ((long)this.lIiiIiIlilli() << 32 ^ var2) & -1L << 32;
      return this.IIlllIlliIll() == 1 ? (int)(var2 >>> 32) : IIIilIIiiIIi((int)(var2 >>> 32), this.IlllllilIl, this.llllllilIl);
   }

   public int Illlllllilll() {
      return this.liiiIIllIl() - this.iIlIlllllill() + 1;
   }

   public int lIlIliIlIl() {
      return this.lillllilIl;
   }

   // $FF: synthetic method
   private static CallSite lliIliliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) << 13 | (char)(var4[var5] + var5) >>> 3) - 23116) >>> 13 | (char)((char)((char)(var4[var5] + var5) << 13 | (char)(var4[var5] + var5) >>> 3) - 23116) << 3) << 9 | (char)((char)((char)((char)(var4[var5] + var5) << 13 | (char)(var4[var5] + var5) >>> 3) - 23116) >>> 13 | (char)((char)((char)(var4[var5] + var5) << 13 | (char)(var4[var5] + var5) >>> 3) - 23116) << 3) >>> 7) + var5) + 17616) - '\uecb7') ^ '躨') - var5)));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int iIIIlIlIIl() {
      return this.iIllllilIl;
   }

   public boolean IIiIllIiIl(llilIIIiililIIIi sel) {
      if (sel != null && sel.IIIllIIliIIl()) {
         return this.llIlllilIl == sel.IlIlllIlilIl() && this.ilIlllilIl == sel.IiIlliIliiIl() && this.IiIlllilIl == sel.IIlllIlliIll() && this.liIlllilIl == sel.Illlllllilll() && this.iiIlllilIl == sel.Iilllilliill() && this.IIllllilIl == sel.IIillIiliIil();
      } else {
         return false;
      }
   }

   public int IlIlllIlilIl() {
      long var2 = -425825298314648670L;
      var2 ^= ((long)((this.lIilllilIl * this.iillllilIl + this.iIilllilIl) % 2 == 0 ? 1 : -1) << 32 ^ var2) & -1L << 32;
      return this.IlIlllilIl ? -((int)(var2 >>> 32)) : (int)(var2 >>> 32);
   }

   public class_2338 IlIillIiilIi() {
      long var2 = -3920334120173236362L;
      var2 ^= ((long)(this.IiIlliIliiIl() - this.IlIlllIlilIl()) << 32 ^ var2) & -1L << 32;
      if ((int)(var2 >>> 32) < this.lIllllilIl) {
         var2 ^= ((long)this.lIllllilIl << 32 ^ var2) & -1L << 32;
      } else if ((int)(var2 >>> 32) > this.iIllllilIl) {
         var2 ^= ((long)this.iIllllilIl << 32 ^ var2) & -1L << 32;
      }

      return this.IIlilIliiIli((int)(var2 >>> 32), this.Iiilliiliiil(), this.iIlIlllllill());
   }

   public int IiIlliIliiIl() {
      return this.IlIlllIlilIl() > 0 ? this.lIllllilIl + this.IlilllilIl : this.iIllllilIl - this.IlilllilIl;
   }

   public int lIiiIiIlilli() {
      return Math.min(this.llllllilIl, this.IlllllilIl + this.IIIlllilIl / 2 + this.IilliliilIIi() * this.IIIlllilIl);
   }

   private int IilliliilIIi() {
      long var2 = 6832814731055194575L;
      var2 ^= ((long)(this.lIilllilIl % 2 == 0 != this.iIIlllilIl ? 1 : 0) << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) != 0 ? this.iIilllilIl : this.iillllilIl - 1 - this.iIilllilIl;
   }

   public int iIlIlllllill() {
      return Math.max(this.illlllilIl, this.liiiIIllIl() - (this.iiiIllilIl - 1));
   }

   private static int IliIlllilIi(int a, int b) {
      return (a + b - 1) / b;
   }

   private int iliIiiliiiii() {
      return Math.max(this.IlllllilIl, this.lIiiIiIlilli() - this.IIIlllilIl / 2);
   }

   public class_2338 Ililllililil() {
      long var2 = -2787426276825503354L;
      var2 ^= ((long)(this.iIlIlllllill() + (this.liiiIIllIl() - this.iIlIlllllill()) / 2) << 32 ^ var2) & -1L << 32;
      return this.IIlilIliiIli(this.IiIlliIliiIl(), this.Iiilliiliiil(), this.Illlllllilll() == 1 ? (int)(var2 >>> 32) : IIIilIIiiIIi((int)(var2 >>> 32), this.illlllilIl, this.IillllilIl));
   }

   // $FF: synthetic method
   private static CallSite iiiIlIIIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) + 19391) + 22394) + 10750) - var5) - var5) ^ '赐') + 32278) + '\ue212')) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) + 19391) + 22394) + 10750) - var5) - var5) ^ '赐') + 32278) + '\ue212')) >>> 11))) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IIlllIlliIll() {
      return this.IIIllIIliIIl() - this.iliIiiliiiii() + 1;
   }

   public String lilIliilIl() {
      return this.llilllilIl ? iIiIlIliIl<invokedynamic>() + (this.lIilllilIl + 1) + iIiIlIliIl<invokedynamic>() + this.lillllilIl + iIiIlIliIl<invokedynamic>() : iIiIlIliIl<invokedynamic>() + (this.lIilllilIl + 1) + iIiIlIliIl<invokedynamic>() + this.lillllilIl + iIiIlIliIl<invokedynamic>() + (this.IilliliilIIi() + 1) + iIiIlIliIl<invokedynamic>() + this.iillllilIl + iIiIlIliIl<invokedynamic>() + (this.IlilllilIl + 1) + iIiIlIliIl<invokedynamic>() + this.IIilllilIl + iIiIlIliIl<invokedynamic>() + this.IIlllIlliIll() + iIiIlIliIl<invokedynamic>() + this.Illlllllilll() + iIiIlIliIl<invokedynamic>() + this.IIlllIlliIll() * this.Illlllllilll() + iIiIlIliIl<invokedynamic>() + (this.lIIlllilIl == class_2351.field_11048 ? iIiIlIliIl<invokedynamic>() : iIiIlIliIl<invokedynamic>()) + (!this.iIIlllilIl && !this.IlIlllilIl ? "" : iIiIlIliIl<invokedynamic>());
   }

   public int IiIIlliIIl() {
      return this.llllllilIl;
   }

   public List<class_2338> IIillIiliIil() {
      long var6 = -8055705685831795531L;
      long var8 = 8862997477651151473L;
      class_2338 var1 = this.Ililllililil();
      var6 ^= ((long)this.IiIlliIliiIl() << 32 ^ var6) & -1L << 32;
      var6 ^= ((long)(this.lIIlllilIl == class_2351.field_11048 ? var1.method_10260() : var1.method_10263()) ^ var6) & -1L >>> 32;
      var8 ^= ((long)var1.method_10264() << 32 ^ var8) & -1L << 32;
      ArrayList var5 = new ArrayList(9);
      var5.add(this.IIlilIliiIli((int)(var6 >>> 32), (int)var6, (int)(var8 >>> 32)));
      var5.add(this.IIlilIliiIli((int)(var6 >>> 32), (int)var6, (int)(var8 >>> 32) + 1));
      var5.add(this.IIlilIliiIli((int)(var6 >>> 32), (int)var6, (int)(var8 >>> 32) - 1));
      var5.add(this.IIlilIliiIli((int)(var6 >>> 32), (int)var6 - 1, (int)(var8 >>> 32)));
      var5.add(this.IIlilIliiIli((int)(var6 >>> 32), (int)var6 + 1, (int)(var8 >>> 32)));
      var5.add(this.IIlilIliiIli((int)(var6 >>> 32), (int)var6 - 1, (int)(var8 >>> 32) + 1));
      var5.add(this.IIlilIliiIli((int)(var6 >>> 32), (int)var6 + 1, (int)(var8 >>> 32) + 1));
      var5.add(this.IIlilIliiIli((int)(var6 >>> 32), (int)var6 - 1, (int)(var8 >>> 32) - 1));
      var5.add(this.IIlilIliiIli((int)(var6 >>> 32), (int)var6 + 1, (int)(var8 >>> 32) - 1));
      return var5;
   }

   public int IIIIllIIIl() {
      return this.lIllllilIl;
   }

   // $FF: synthetic method
   private static CallSite IiiIlliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 5026) + '\ue9e9') >>> 3 | (char)((char)(var4[var5] - 5026) + '\ue9e9') << 13) ^ '뭻') >>> 10 | (char)((char)((char)((char)(var4[var5] - 5026) + '\ue9e9') >>> 3 | (char)((char)(var4[var5] - 5026) + '\ue9e9') << 13) ^ '뭻') << 6) - '\uf6a5') + 21366) - var5) - var5) + 21782) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IllIllllIl() {
      return this.iIilllilIl;
   }

   public boolean Iliilliiilii() {
      ++this.lIilllilIl;
      if (this.lIilllilIl >= this.lillllilIl) {
         this.ililllilIl = true;
         return false;
      } else {
         this.iIilllilIl = 0;
         this.IlilllilIl = 0;
         this.llilllilIl = false;
         if (!this.Iilllilliill()) {
            this.IIiilIiiiIii();
         }

         return true;
      }
   }

   public iIiiiIIlIliiiIIl(llilIIIiililIIIi layerHeight, int passWidth, int travelMirrored, boolean crossMirrored, boolean sel) {
      this.iiiIllilIl = Math.max(1, passWidth);
      this.IIIlllilIl = Math.max(1, travelMirrored);
      this.iIIlllilIl = crossMirrored;
      this.IlIlllilIl = sel;
      this.llIlllilIl = layerHeight.IlIlllIlilIl();
      this.ilIlllilIl = layerHeight.IiIlliIliiIl();
      this.IiIlllilIl = layerHeight.IIlllIlliIll();
      this.liIlllilIl = layerHeight.Illlllllilll();
      this.iiIlllilIl = layerHeight.Iilllilliill();
      this.IIllllilIl = layerHeight.IIillIiliIil();
      this.lIIlllilIl = layerHeight.Ililllililil() >= layerHeight.IIIilIIiiIIi() ? class_2351.field_11048 : class_2351.field_11051;
      if (this.lIIlllilIl == class_2351.field_11048) {
         this.lIllllilIl = layerHeight.IlIlllIlilIl();
         this.iIllllilIl = layerHeight.Illlllllilll();
         this.IlllllilIl = layerHeight.IIlllIlliIll();
         this.llllllilIl = layerHeight.IIillIiliIil();
      } else {
         this.lIllllilIl = layerHeight.IIlllIlliIll();
         this.iIllllilIl = layerHeight.IIillIiliIil();
         this.IlllllilIl = layerHeight.IlIlllIlilIl();
         this.llllllilIl = layerHeight.Illlllllilll();
      }

      this.illlllilIl = layerHeight.IiIlliIliiIl();
      this.IillllilIl = layerHeight.Iilllilliill();
      this.lillllilIl = IliIlllilIi(this.IillllilIl - this.illlllilIl + 1, this.iiiIllilIl);
      this.iillllilIl = IliIlllilIi(this.llllllilIl - this.IlllllilIl + 1, this.IIIlllilIl);
      this.IIilllilIl = this.iIllllilIl - this.lIllllilIl + 1;
      if (!this.Iilllilliill()) {
         this.IIiilIiiiIii();
      }

   }
}
