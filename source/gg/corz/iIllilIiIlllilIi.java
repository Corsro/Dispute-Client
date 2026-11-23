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
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_5321;

public final class iIllilIiIlllilIi {
   private final Map<Long, Integer> llIIillIIi;
   private final AtomicInteger IIlIillIIi = new AtomicInteger();
   private final List<class_2338> lIIIillIIi;
   private int liIIillIIi;
   private final class_5321<class_1937> ilIIillIIi;
   private final AtomicInteger lIlIillIIi = new AtomicInteger();
   private final AtomicInteger iiIIillIIi = new AtomicInteger();
   private final long IiIIillIIi = System.currentTimeMillis();
   private volatile boolean iIlIillIIi;
   private final List<class_2680> iIIIillIIi;
   public static final int IIIIillIIi = 4096;

   public class_2338 lIiiIiIlilli(int i) {
      return (class_2338)this.lIIIillIIi.get(i);
   }

   public class_2680 iliIiiliiiii(int i) {
      return (class_2680)this.iIIIillIIi.get(i);
   }

   public iIllilIiIlllilIi(List<class_2338> crafterMasks, List<class_2680> positions, Map<Long, Integer> dimension, class_5321<class_1937> states) {
      if (crafterMasks.size() != positions.size()) {
         throw new IllegalArgumentException(Iilililiiili<invokedynamic>() + crafterMasks.size() + Iilililiiili<invokedynamic>() + positions.size());
      } else {
         this.lIIIillIIi = crafterMasks;
         this.iIIIillIIi = positions;
         this.llIIillIIi = dimension == null ? Map.of() : dimension;
         this.ilIIillIIi = states;
      }
   }

   public Integer IIIllIIliIIl(class_2338 pos) {
      return (Integer)this.llIIillIIi.get(pos.method_10063());
   }

   public int IliIlllilIi() {
      return this.lIIIillIIi.size();
   }

   public int Iiilliiliiil() {
      return this.iiIIillIIi.get();
   }

   public void Iilllilliill() {
      this.iiIIillIIi.incrementAndGet();
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 8111684924685807506L ^ Long.rotateLeft(-2808792204752623887L, 17) ^ -7862326340008546572L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 2815484311258866234L ^ Long.rotateLeft(-6615329807577559151L, 45) ^ -3168449843847207276L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -8239014884532372573L ^ Long.rotateLeft(5427358010276813112L, 31) ^ -531849662308904446L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 7444804880427099613L ^ Long.rotateLeft(-5164860329782391496L, 37) ^ 86486378785388470L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6647851006898376967L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -4444850373576468758L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 855477965103731820L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3582342561365520101L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -693703156703898343L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 58570208175402462L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIiilIiiiIii<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iliilliiilii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iiiiliiiiiii<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIIIllIIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iIIIlIlIIl<invokedynamic>());
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

   public boolean Illillliilli() {
      return this.iIlIillIIi;
   }

   public int IlIillIiilIi() {
      return this.lIlIillIIi.get();
   }

   public float IiIiliIiiiIi() {
      return this.IliIlllilIi() == 0 ? 1.0F : Math.min(1.0F, (float)this.IIlllIlliIll() / (float)this.IliIlllilIi());
   }

   // $FF: synthetic method
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))) ^ 18454) - var5) << 12 | (char)((char)((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))) ^ 18454) - var5) >>> 4) ^ var5) - var5))))) << 8 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))) ^ 18454) - var5) << 12 | (char)((char)((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))) ^ 18454) - var5) >>> 4) ^ var5) - var5))))) >>> 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IiIlliIliiIl() {
      return this.liIIillIIi >= this.IliIlllilIi();
   }

   public int liiiIIllIl() {
      return this.liIIillIIi;
   }

   public long IilliliilIIi() {
      return this.IiIIillIIi;
   }

   public boolean Illlllllilll() {
      return this.IiIlliIliiIl() && this.IIlllIlliIll() >= this.IliIlllilIi();
   }

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(var4[var5] ^ 22908))) - 3664) - '雰') << 3 | (char)((char)((char)(-((char)(var4[var5] ^ 22908))) - 3664) - '雰') >>> 13))) + var5) ^ '엯') - 8054) + var5) - var5) >>> 8 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(var4[var5] ^ 22908))) - 3664) - '雰') << 3 | (char)((char)((char)(-((char)(var4[var5] ^ 22908))) - 3664) - '雰') >>> 13))) + var5) ^ '엯') - 8054) + var5) - var5) << 8) + var5) + '\uf57f'))) ^ '젅'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IIlilIliiIli() {
      this.iIlIillIIi = true;
   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) ^ var5))) >>> 12 | (char)(-((char)((char)(var4[var5] + var5) ^ var5))) << 4) ^ 19263)) + '삜') << 3 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) ^ var5))) >>> 12 | (char)(-((char)((char)(var4[var5] + var5) ^ var5))) << 4) ^ 19263)) + '삜') >>> 13))) ^ var5) - var5) ^ '\uf580') - var5) + 8785));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IIIilIIiiIIi() {
      return this.IIlIillIIi.get();
   }

   public int IIlllIlliIll() {
      return this.iiIIillIIi.get() + this.IIlIillIIi.get() + this.lIlIillIIi.get();
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(-((char)((char)(-((char)((char)(~((char)((char)(-((char)(var4[var5] + 1552))) + var5))) + var5))) ^ var5))))) + var5) ^ '\ueb20') >>> 6 | (char)((char)((char)(~((char)(-((char)((char)(-((char)((char)(~((char)((char)(-((char)(var4[var5] + 1552))) + var5))) + var5))) ^ var5))))) + var5) ^ '\ueb20') << 10));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IIillIiliIil() {
      this.IIlIillIIi.incrementAndGet();
   }

   public void Ililllililil(int n) {
      if (n > 0) {
         this.lIlIillIIi.addAndGet(n);
      }

   }

   public int IlIlllIlilIl(int budget) {
      this.liIIillIIi = Math.min(this.IliIlllilIi(), this.liIIillIIi + Math.max(0, budget));
      return this.liIIillIIi;
   }

   public class_5321<class_1937> iIlIlllllill() {
      return this.ilIIillIIi;
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(~((char)(~((char)(var4[var5] + var5))))) >>> 10 | (char)(~((char)(~((char)(var4[var5] + var5))))) << 6))) << 14 | (char)(~((char)((char)(~((char)(~((char)(var4[var5] + var5))))) >>> 10 | (char)(~((char)(~((char)(var4[var5] + var5))))) << 6))) >>> 2) + 27570) - '兩') - 27896))) << 4 | (char)(~((char)((char)((char)((char)((char)(~((char)((char)(~((char)(~((char)(var4[var5] + var5))))) >>> 10 | (char)(~((char)(~((char)(var4[var5] + var5))))) << 6))) << 14 | (char)(~((char)((char)(~((char)(~((char)(var4[var5] + var5))))) >>> 10 | (char)(~((char)(~((char)(var4[var5] + var5))))) << 6))) >>> 2) + 27570) - '兩') - 27896))) >>> 12));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
