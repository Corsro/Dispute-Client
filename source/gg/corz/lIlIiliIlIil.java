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
import net.minecraft.class_11659;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public final class lIlIiliIlIil {
   final IllIlIilllIlIi iiIIiIliIIlIiIli = new IllIlIilllIlIi();
   public final lliIililiIil iIIIiIliIlIIiIli = new lliIililiIil();
   boolean IllIiIlilllIiIli;
   final Iililillililil lIlIiIliiIlIiIli = new Iililillililil();
   private final Vector3f iIiIiIliIliIiIli = new Vector3f();
   private final Vector3f lliIiIliiliIiIli = new Vector3f();
   int IIiIiIlilIiIiIli;
   final class_11659.class_11660 IiiIiIliliiIiIli = this::liiiIIllIl;
   final float[] llIIiIliilIIiIli = new float[14];
   final float[] IiIIiIliliIIiIli = new float[14];
   int illIiIliIilIiIli;
   int lilIiIliiilIiIli;
   final class_11659.class_11660 iiiIiIliIIIliIli = this::iIlIlllllill;

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)(-((char)(var4[var5] >>> 10 | var4[var5] << 6))) >>> 10 | (char)(-((char)(var4[var5] >>> 10 | var4[var5] << 6))) << 6) ^ var5))) >>> 6 | (char)(~((char)((char)((char)(-((char)(var4[var5] >>> 10 | var4[var5] << 6))) >>> 10 | (char)(-((char)(var4[var5] >>> 10 | var4[var5] << 6))) << 6) ^ var5))) << 10) >>> 7 | (char)((char)(~((char)((char)((char)(-((char)(var4[var5] >>> 10 | var4[var5] << 6))) >>> 10 | (char)(-((char)(var4[var5] >>> 10 | var4[var5] << 6))) << 6) ^ var5))) >>> 6 | (char)(~((char)((char)((char)(-((char)(var4[var5] >>> 10 | var4[var5] << 6))) >>> 10 | (char)(-((char)(var4[var5] >>> 10 | var4[var5] << 6))) << 6) ^ var5))) << 10) << 9) - var5))) + var5) ^ var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iIlIlllllill(class_4587.class_4665 vc, class_4588 entry) {
      long var8 = -542093887852482557L;
      long var10 = 2615586143206459790L;

      try {
         Matrix4f var3 = vc.method_23761();
         float[] var4 = this.lIlIiIliiIlIiIli.IiililIliliililIli;
         var8 ^= ((long)(this.lIlIiIliiIlIiIli.IliIlllilIi() & -4) << 32 ^ var8) & -1L << 32;
         var8 ^= (0L ^ var8) & -1L >>> 32;

         for(long var15 = var10 ^ (0L ^ var10) & -1L << 32; (int)var8 < (int)(var8 >>> 32); var15 += 34359738368L) {
            var3.transformPosition(var4[(int)(var15 >>> 32)], var4[(int)(var15 >>> 32) + 1], var4[(int)(var15 >>> 32) + 2], this.iIiIiIliIliIiIli);
            entry.method_22912(this.iIiIiIliIliIiIli.x, this.iIiIiIliIliIiIli.y, this.iIiIiIliIliIiIli.z).method_39415(this.IIiIiIlilIiIiIli).method_22913(var4[(int)(var15 >>> 32) + 3], var4[(int)(var15 >>> 32) + 4]);
            var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32;
         }
      } catch (Throwable var12) {
         llliIIllilliIIll.Ililllililil(IilliliilIIi<invokedynamic>(), var12);
      }

   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) + var5))) ^ '貲') + var5) >>> 7 | (char)((char)((char)(-((char)((char)(var4[var5] ^ var5) + var5))) ^ '貲') + var5) << 9) + 28997) + 23834) - '鎬'))))) + var5));
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
         var4[var5] = (char)((char)(-((char)((char)((char)((char)(~((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - 2733))) + 22743) - var5))) - var5) << 14 | (char)((char)(-((char)((char)((char)(~((char)(var4[var5] - 2733))) + 22743) - var5))) - var5) >>> 2))))) + var5) >>> 15 | (char)((char)(~((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - 2733))) + 22743) - var5))) - var5) << 14 | (char)((char)(-((char)((char)((char)(~((char)(var4[var5] - 2733))) + 22743) - var5))) - var5) >>> 2))))) + var5) << 1) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void liiiIIllIl(class_4587.class_4665 entry, class_4588 vc) {
      long var8 = -3762801494558328408L;
      long var10 = 1008142542367401543L;

      try {
         Matrix4f var3 = entry.method_23761();
         float[] var4 = this.lIlIiIliiIlIiIli.IiililIliliililIli;
         var8 ^= ((long)(this.lIlIiIliiIlIiIli.IliIlllilIi() & -4) << 32 ^ var8) & -1L << 32;
         var8 ^= (0L ^ var8) & -1L >>> 32;

         for(long var15 = var10 ^ (0L ^ var10) & -1L << 32; (int)var8 < (int)(var8 >>> 32); var15 += 34359738368L) {
            var3.transformPosition(var4[(int)(var15 >>> 32)], var4[(int)(var15 >>> 32) + 1], var4[(int)(var15 >>> 32) + 2], this.iIiIiIliIliIiIli);
            entry.method_56820(var4[(int)(var15 >>> 32) + 5], var4[(int)(var15 >>> 32) + 6], var4[(int)(var15 >>> 32) + 7], this.lliIiIliiliIiIli);
            vc.method_23919(this.iIiIiIliIliIiIli.x, this.iIiIiIliIliIiIli.y, this.iIiIiIliIliIiIli.z, -1, var4[(int)(var15 >>> 32) + 3], var4[(int)(var15 >>> 32) + 4], this.lilIiIliiilIiIli, this.illIiIliIilIiIli, this.lliIiIliiliIiIli.x, this.lliIiIliiliIiIli.y, this.lliIiIliiliIiIli.z);
            var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32;
         }
      } catch (Throwable var12) {
         llliIIllilliIIll.Ililllililil(IilliliilIIi<invokedynamic>(), var12);
      }

   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -5543124839470927614L ^ Long.rotateLeft(-2701067829242628532L, 45) ^ 8517984095350246302L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -9153385050110581885L ^ Long.rotateLeft(-6493403067261745884L, 1) ^ 6070412706008780405L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -204289680829446821L ^ Long.rotateLeft(-1519518858588337181L, 30) ^ -7177615617718190059L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5409649481558425748L ^ Long.rotateLeft(4912487657308352012L, 20) ^ 7814988957012000721L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8422716429095806598L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -9087061493540827020L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4617670193517255423L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -208587289171074347L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6297122775588373026L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -3132720565597455389L;
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
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 26656) ^ var5) + 2348) << 6 | (char)((char)((char)(var4[var5] ^ 26656) ^ var5) + 2348) >>> 10) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ 26656) ^ var5) + 2348) << 6 | (char)((char)((char)(var4[var5] ^ 26656) ^ var5) + 2348) >>> 10) << 12) ^ var5) >>> 1 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 26656) ^ var5) + 2348) << 6 | (char)((char)((char)(var4[var5] ^ 26656) ^ var5) + 2348) >>> 10) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ 26656) ^ var5) + 2348) << 6 | (char)((char)((char)(var4[var5] ^ 26656) ^ var5) + 2348) >>> 10) << 12) ^ var5) << 15) - var5) + '썜') + '컮'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   void IliIlllilIi() {
      if (!this.IllIiIlilllIiIli) {
         lIIIIilliIIIIill.iIlIlllllill(this.llIIiIliilIIiIli, this.IiIIiIliliIIiIli, this.iiIIiIliIIlIiIli);
      }

      this.lIlIiIliiIlIiIli.IilliliilIIi(this.llIIiIliilIIiIli, this.IiIIiIliliIIiIli);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ var5) - var5) >>> 3 | (char)((char)(var4[var5] ^ var5) - var5) << 13))) - var5) - 441))) ^ 7617) ^ var5) - var5) + var5) ^ 22629) >>> 13 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ var5) - var5) >>> 3 | (char)((char)(var4[var5] ^ var5) - var5) << 13))) - var5) - 441))) ^ 7617) ^ var5) - var5) + var5) ^ 22629) << 3))) + 16338) ^ 18577))) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
