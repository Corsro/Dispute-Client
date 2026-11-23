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
import net.minecraft.class_1792;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;

public final class iilIillIIiIill {
   public Boolean illlIiIIiIillIiIIi;
   public class_2338 llIlIiIIiilIlIiIIi;
   public final class_2338 IliIIiIIilliIIiIIi;
   public Integer IlllIiIIillllIiIIi;
   public lllillillill liIiIiIIiiiIiIiIIi;
   public final List<class_2350> lIIiIiIIiiIIiIiIIi;
   public class_2350 IiIlIiIIiliIlIiIIi;
   public class_2680 IiilIiIIiliilIiIIi;
   public class_2338 iIIlIiIIiIlIlIiIIi;
   public int llilIiIIiililIiIIi;
   public final class_2680 iliIIiIIiIiiIIiIIi;
   public boolean lillIiIIiiillIiIIi;
   public boolean IIilIiIIilIilIiIIi;
   public IIiIllllIiIlll IIIlIiIIilIIlIiIIi;
   public Float iiIlIiIIiIIllIiIIi;
   public final List<class_2338> iIilIiIIiIlilIiIIi;
   public final List<class_2338> iiilIiIIiIIIiIiIIi;
   public boolean ilIiIiIIiIiIiIiIIi;
   public Float lIllIiIIiiIllIiIIi;
   public int IlIiIiIIillIiIiIIi;
   public final class_1792 liiIIiIIiiiiIIiIIi;

   public iilIillIIiIill liiiIIllIl(class_2338 p) {
      this.iIIlIiIIiIlIlIiIIi = p;
      return this;
   }

   public iilIillIIiIill iIlIlllllill(class_2338 pos, class_2350 face) {
      this.llIlIiIIiilIlIiIIi = pos;
      this.IiIlIiIIiliIlIiIIi = face;
      return this;
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ 13155) - '\uf3db'))) ^ 7396) >>> 15 | (char)((char)(-((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ 13155) - '\uf3db'))) ^ 7396) << 1) + '镆'))) + '쇪') - var5) - '\ue00f') - var5) + var5) ^ var5))) - var5) + var5));
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
         var4[var5] = (char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) << 7 | (char)(var4[var5] << 13 | var4[var5] >>> 3) >>> 9) + var5) ^ '韫'))) >>> 15 | (char)(~((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) << 7 | (char)(var4[var5] << 13 | var4[var5] >>> 3) >>> 9) + var5) ^ '韫'))) << 1) ^ '쐿') - '\uf2fd') ^ 'ꢓ') ^ var5) >>> 6 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) << 7 | (char)(var4[var5] << 13 | var4[var5] >>> 3) >>> 9) + var5) ^ '韫'))) >>> 15 | (char)(~((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) << 7 | (char)(var4[var5] << 13 | var4[var5] >>> 3) >>> 9) + var5) ^ '韫'))) << 1) ^ '쐿') - '\uf2fd') ^ 'ꢓ') ^ var5) << 10) << 7 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) << 7 | (char)(var4[var5] << 13 | var4[var5] >>> 3) >>> 9) + var5) ^ '韫'))) >>> 15 | (char)(~((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) << 7 | (char)(var4[var5] << 13 | var4[var5] >>> 3) >>> 9) + var5) ^ '韫'))) << 1) ^ '쐿') - '\uf2fd') ^ 'ꢓ') ^ var5) >>> 6 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) << 7 | (char)(var4[var5] << 13 | var4[var5] >>> 3) >>> 9) + var5) ^ '韫'))) >>> 15 | (char)(~((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) << 7 | (char)(var4[var5] << 13 | var4[var5] >>> 3) >>> 9) + var5) ^ '韫'))) << 1) ^ '쐿') - '\uf2fd') ^ 'ꢓ') ^ var5) << 10) >>> 9))))) ^ var5) - 20142) << 13 | (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) << 7 | (char)(var4[var5] << 13 | var4[var5] >>> 3) >>> 9) + var5) ^ '韫'))) >>> 15 | (char)(~((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) << 7 | (char)(var4[var5] << 13 | var4[var5] >>> 3) >>> 9) + var5) ^ '韫'))) << 1) ^ '쐿') - '\uf2fd') ^ 'ꢓ') ^ var5) >>> 6 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) << 7 | (char)(var4[var5] << 13 | var4[var5] >>> 3) >>> 9) + var5) ^ '韫'))) >>> 15 | (char)(~((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) << 7 | (char)(var4[var5] << 13 | var4[var5] >>> 3) >>> 9) + var5) ^ '韫'))) << 1) ^ '쐿') - '\uf2fd') ^ 'ꢓ') ^ var5) << 10) << 7 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) << 7 | (char)(var4[var5] << 13 | var4[var5] >>> 3) >>> 9) + var5) ^ '韫'))) >>> 15 | (char)(~((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) << 7 | (char)(var4[var5] << 13 | var4[var5] >>> 3) >>> 9) + var5) ^ '韫'))) << 1) ^ '쐿') - '\uf2fd') ^ 'ꢓ') ^ var5) >>> 6 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) << 7 | (char)(var4[var5] << 13 | var4[var5] >>> 3) >>> 9) + var5) ^ '韫'))) >>> 15 | (char)(~((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) << 7 | (char)(var4[var5] << 13 | var4[var5] >>> 3) >>> 9) + var5) ^ '韫'))) << 1) ^ '쐿') - '\uf2fd') ^ 'ꢓ') ^ var5) << 10) >>> 9))))) ^ var5) - 20142) >>> 3));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iilIillIIiIill lIiiIiIlilli(Float p) {
      this.lIllIiIIiiIllIiIIi = p;
      return this;
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5948996968249804054L ^ Long.rotateLeft(2647702083138044683L, 31) ^ -5669254824791116880L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6859028208998076903L ^ Long.rotateLeft(-5992443910545344454L, 35) ^ -3859810553783264866L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 208053036637096906L ^ Long.rotateLeft(-2793924469753672522L, 4) ^ -1606362601896778127L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 364333037243877274L ^ Long.rotateLeft(6430541586176835420L, 57) ^ 3310173419299144830L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3536662623822604739L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 7943796732392605597L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4143747972265811940L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 663943226997399355L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6045210047406457994L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -8605951169374177080L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIlilIliiIli<invokedynamic>());
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

   public iilIillIIiIill IliIlllilIi(IIiIllllIiIlll k) {
      this.IIIlIiIIilIIlIiIIi = k;
      return this;
   }

   public iilIillIIiIill IlIlllIlilIl(boolean s) {
      this.lillIiIIiiillIiIIi = s;
      return this;
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(~((char)((char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] ^ '\ud8d4') ^ var5) >>> 9 | (char)((char)(var4[var5] ^ '\ud8d4') ^ var5) << 7))) << 8 | (char)(-((char)((char)((char)(var4[var5] ^ '\ud8d4') ^ var5) >>> 9 | (char)((char)(var4[var5] ^ '\ud8d4') ^ var5) << 7))) >>> 8))) << 14 | (char)(-((char)((char)(-((char)((char)((char)(var4[var5] ^ '\ud8d4') ^ var5) >>> 9 | (char)((char)(var4[var5] ^ '\ud8d4') ^ var5) << 7))) << 8 | (char)(-((char)((char)((char)(var4[var5] ^ '\ud8d4') ^ var5) >>> 9 | (char)((char)(var4[var5] ^ '\ud8d4') ^ var5) << 7))) >>> 8))) >>> 2) ^ 23607))) + var5))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iilIillIIiIill IIIllIIliIIl(Boolean s) {
      this.illlIiIIiIillIiIIi = s;
      return this;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] << 5 | var4[var5] >>> 11))) ^ var5) >>> 8 | (char)((char)(~((char)(var4[var5] << 5 | var4[var5] >>> 11))) ^ var5) << 8) + var5) - '薆'))) ^ var5) + 16187))))) << 2 | (char)(-((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] << 5 | var4[var5] >>> 11))) ^ var5) >>> 8 | (char)((char)(~((char)(var4[var5] << 5 | var4[var5] >>> 11))) ^ var5) << 8) + var5) - '薆'))) ^ var5) + 16187))))) >>> 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iilIillIIiIill(class_2338 wanted, class_2680 target, class_1792 requiredItem) {
      this.IIIlIiIIilIIlIiIIi = IIiIllllIiIlll.liiIlIiiliiiIlIiil;
      this.iIilIiIIiIlilIiIIi = new ArrayList();
      this.iiilIiIIiIIIiIiIIi = new ArrayList();
      this.lIIiIiIIiiIIiIiIIi = new ArrayList();
      this.liIiIiIIiiiIiIiIIi = lllillillill.IIiiilIilIiiilIi;
      this.IliIIiIIilliIIiIIi = wanted;
      this.iliIIiIIiIiiIIiIIi = target;
      this.IiilIiIIiliilIiIIi = target;
      this.liiIIiIIiiiiIIiIIi = requiredItem;
   }

   public iilIillIIiIill Illlllllilll(int ticks) {
      this.IlIiIiIIillIiIiIIi = Math.max(0, ticks);
      return this;
   }

   public iilIillIIiIill IIillIiliIil(lllillillill f) {
      this.liIiIiIIiiiIiIiIIi = f;
      return this;
   }

   public iilIillIIiIill iliIiiliiiii(int r) {
      this.IlllIiIIillllIiIIi = Math.floorMod(r, 16);
      return this;
   }

   public iilIillIIiIill IIlllIlliIll(class_2350 face) {
      this.lIIiIiIIiiIIiIiIIi.add(face);
      return this;
   }

   public String toString() {
      return Iiilliiliiil<invokedynamic>() + (this.IliIIiIIilliIIiIIi == null ? Iiilliiliiil<invokedynamic>() : this.IliIIiIIilliIIiIIi.method_23854()) + Iiilliiliiil<invokedynamic>() + (this.iliIIiIIiIiiIIiIIi == null ? Iiilliiliiil<invokedynamic>() : this.iliIIiIIiIiiIIiIIi.method_26204()) + Iiilliiliiil<invokedynamic>() + this.IIIlIiIIilIIlIiIIi + (this.IiIlIiIIiliIlIiIIi != null ? Iiilliiliiil<invokedynamic>() + this.IiIlIiIIiliIlIiIIi : "") + (this.iiIlIiIIiIIllIiIIi != null ? Iiilliiliiil<invokedynamic>() + this.iiIlIiIIiIIllIiIIi : "") + (this.IlllIiIIillllIiIIi != null ? Iiilliiliiil<invokedynamic>() + this.IlllIiIIillllIiIIi : "") + (!this.lIIiIiIIiiIIiIiIIi.isEmpty() ? Iiilliiliiil<invokedynamic>() + this.lIIiIiIIiiIIiIiIIi : "") + (this.illlIiIIiIillIiIIi != null ? Iiilliiliiil<invokedynamic>() + this.illlIiIIiIillIiIIi : "") + (this.lillIiIIiiillIiIIi ? Iiilliiliiil<invokedynamic>() : "") + (this.IIilIiIIilIilIiIIi ? Iiilliiliiil<invokedynamic>() + this.iIilIiIIiIlilIiIIi : "") + (this.llilIiIIiililIiIIi > 0 ? Iiilliiliiil<invokedynamic>() + this.llilIiIIiililIiIIi : "") + (this.liIiIiIIiiiIiIiIIi != lllillillill.IIiiilIilIiiilIi ? Iiilliiliiil<invokedynamic>() + this.liIiIiIIiiiIiIiIIi : "") + Iiilliiliiil<invokedynamic>();
   }

   public iilIillIIiIill IilliliilIIi(Float y) {
      this.iiIlIiIIiIIllIiIIi = y;
      return this;
   }

   public iilIillIIiIill IiIlliIliiIl(class_2338 p) {
      this.IIilIiIIilIilIiIIi = true;
      this.iIilIiIIiIlilIiIIi.add(p);
      return this;
   }

   public iilIillIIiIill Iilllilliill(boolean allowed) {
      this.ilIiIiIIiIiIiIiIIi = allowed;
      return this;
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) << 5 | (char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) >>> 11) ^ var5))) + '\uf3bc') << 13 | (char)((char)(-((char)((char)((char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) << 5 | (char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) >>> 11) ^ var5))) + '\uf3bc') >>> 3) + '첬') ^ var5) >>> 11 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) << 5 | (char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) >>> 11) ^ var5))) + '\uf3bc') << 13 | (char)((char)(-((char)((char)((char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) << 5 | (char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) >>> 11) ^ var5))) + '\uf3bc') >>> 3) + '첬') ^ var5) << 5) - '錝') + 23997) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) << 5 | (char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) >>> 11) ^ var5))) + '\uf3bc') << 13 | (char)((char)(-((char)((char)((char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) << 5 | (char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) >>> 11) ^ var5))) + '\uf3bc') >>> 3) + '첬') ^ var5) >>> 11 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) << 5 | (char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) >>> 11) ^ var5))) + '\uf3bc') << 13 | (char)((char)(-((char)((char)((char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) << 5 | (char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) >>> 11) ^ var5))) + '\uf3bc') >>> 3) + '첬') ^ var5) << 5) - '錝') + 23997) >>> 6) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) << 5 | (char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) >>> 11) ^ var5))) + '\uf3bc') << 13 | (char)((char)(-((char)((char)((char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) << 5 | (char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) >>> 11) ^ var5))) + '\uf3bc') >>> 3) + '첬') ^ var5) >>> 11 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) << 5 | (char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) >>> 11) ^ var5))) + '\uf3bc') << 13 | (char)((char)(-((char)((char)((char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) << 5 | (char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) >>> 11) ^ var5))) + '\uf3bc') >>> 3) + '첬') ^ var5) << 5) - '錝') + 23997) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) << 5 | (char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) >>> 11) ^ var5))) + '\uf3bc') << 13 | (char)((char)(-((char)((char)((char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) << 5 | (char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) >>> 11) ^ var5))) + '\uf3bc') >>> 3) + '첬') ^ var5) >>> 11 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) << 5 | (char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) >>> 11) ^ var5))) + '\uf3bc') << 13 | (char)((char)(-((char)((char)((char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) << 5 | (char)((char)(~((char)(-((char)(var4[var5] - 19934)))))) >>> 11) ^ var5))) + '\uf3bc') >>> 3) + '첬') ^ var5) << 5) - '錝') + 23997) >>> 6) << 7))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean Ililllililil() {
      return this.liIiIiIIiiiIiIiIIi == lllillillill.IIiiilIilIiiilIi;
   }
}
