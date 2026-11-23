package gg.corz;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_290;
import org.lwjgl.system.MemoryUtil;

public final class IlIIllillIIlli implements AutoCloseable {
   private GpuBuffer iiilllIIIl;
   private final int lIIillIIIl;
   private GpuBuffer liilllIIIl;
   private final int iIIillIIIl;
   private final int IIIillIIIl;
   private GpuBuffer IiilllIIIl;
   private boolean IlIillIIIl;

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6510966367902166070L ^ Long.rotateLeft(-2840001791827587077L, 56) ^ 1569053064329494707L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1959190062640268026L ^ Long.rotateLeft(7880082437763463654L, 61) ^ 8834659547411468826L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8372841768438997790L ^ Long.rotateLeft(3587975514053151557L, 52) ^ -8488551764468583791L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 7635739429461919251L ^ Long.rotateLeft(6428903714086623652L, 52) ^ -5033971123125985477L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 762429820081698873L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -4823397040526610537L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -1982862916350438539L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -6667727950333291357L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 8938466462496887723L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1802727120969345044L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iilllilliill<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIillIiliIil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Ililllililil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Iiilliiliiil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIIilIIiiIIi<invokedynamic>());
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

   public GpuBuffer iIlIlllllill() {
      return this.IlIillIIIl ? null : this.IiilllIIIl;
   }

   public static IlIIllillIIlli IliIlllilIi(iiIllIilIIlllIil solid, iiIllIilIIlllIil translucent, iiIllIilIIlllIil label, String chest) {
      if (class_290.field_1575.getVertexSize() != 24) {
         throw new IllegalStateException(Illlllllilll<invokedynamic>() + class_290.field_1575.getVertexSize());
      } else {
         GpuBuffer var4 = liiiIIllIl(solid, chest + Illlllllilll<invokedynamic>());
         GpuBuffer var5 = null;

         GpuBuffer var6;
         try {
            var5 = liiiIIllIl(translucent, chest + Illlllllilll<invokedynamic>());
            var6 = liiiIIllIl(label, chest + Illlllllilll<invokedynamic>());
         } catch (Throwable var8) {
            if (var4 != null) {
               var4.close();
            }

            if (var5 != null) {
               var5.close();
            }

            throw var8;
         }

         return new IlIIllillIIlli(var4, solid.IlIlllIlilIl(), var5, translucent.IlIlllIlilIl(), var6, label == null ? 0 : label.IlIlllIlilIl());
      }
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ '넍') ^ var5) ^ 12290) - var5) << 7 | (char)((char)((char)((char)(var4[var5] ^ '넍') ^ var5) ^ 12290) - var5) >>> 9))) ^ 'ﲢ') + var5) - var5) + var5) - var5) + 19468) ^ '苆') ^ '\udd85'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IiIlliIliiIl() {
      return this.IlIillIIIl;
   }

   public int iliIiiliiiii() {
      return this.IIIillIIIl;
   }

   public void close() {
      if (!this.IlIillIIIl) {
         this.IlIillIIIl = true;
         if (this.IiilllIIIl != null) {
            try {
               this.IiilllIIIl.close();
            } catch (Throwable var4) {
            }

            this.IiilllIIIl = null;
         }

         if (this.liilllIIIl != null) {
            try {
               this.liilllIIIl.close();
            } catch (Throwable var3) {
            }

            this.liilllIIIl = null;
         }

         if (this.iiilllIIIl != null) {
            try {
               this.iiilllIIIl.close();
            } catch (Throwable var2) {
            }

            this.iiilllIIIl = null;
         }

      }
   }

   public int IlIlllIlilIl() {
      return this.iIIillIIIl;
   }

   private static GpuBuffer liiiIIllIl(iiIllIilIIlllIil sink, String label) {
      long var6 = -3782044517661849667L;
      if (sink != null && sink.IlIlllIlilIl() != 0 && sink.IiIlliIliiIl() != 0) {
         var6 ^= ((long)(sink.IlIlllIlilIl() * 24) << 32 ^ var6) & -1L << 32;
         if ((int)(var6 >>> 32) > sink.IiIlliIliiIl()) {
            throw new IllegalStateException(Illlllllilll<invokedynamic>());
         } else {
            ByteBuffer var3 = MemoryUtil.memAlloc((int)(var6 >>> 32) * 4);

            GpuBuffer var4;
            try {
               var3.asIntBuffer().put(sink.IIlllIlliIll(), 0, (int)(var6 >>> 32));
               var3.position(0).limit((int)(var6 >>> 32) * 4);
               var4 = RenderSystem.getDevice().createBuffer(() -> label, 32, var3);
            } finally {
               MemoryUtil.memFree(var3);
            }

            return var4;
         }
      } else {
         return null;
      }
   }

   public GpuBuffer lIiiIiIlilli() {
      return this.IlIillIIIl ? null : this.iiilllIIIl;
   }

   private IlIIllillIIlli(GpuBuffer translucent, int solidQuads, GpuBuffer translucentQuads, int chest, GpuBuffer solid, int chestQuads) {
      this.IiilllIIIl = translucent;
      this.IIIillIIIl = translucent == null ? 0 : solidQuads;
      this.liilllIIIl = translucentQuads;
      this.lIIillIIIl = translucentQuads == null ? 0 : chest;
      this.iiilllIIIl = solid;
      this.iIIillIIIl = solid == null ? 0 : chestQuads;
   }

   public GpuBuffer IilliliilIIi() {
      return this.IlIillIIIl ? null : this.liilllIIIl;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + 18877) ^ var5) - '걃') ^ var5) ^ var5) << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + 18877) ^ var5) - '걃') ^ var5) ^ var5) >>> 1) << 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + 18877) ^ var5) - '걃') ^ var5) ^ var5) << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + 18877) ^ var5) - '걃') ^ var5) ^ var5) >>> 1) >>> 8) ^ var5) + '쾕'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) << 6 | (char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) >>> 10) + var5) + '뺤') - var5) >>> 11 | (char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) << 6 | (char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) >>> 10) + var5) + '뺤') - var5) << 5) >>> 1 | (char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) << 6 | (char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) >>> 10) + var5) + '뺤') - var5) >>> 11 | (char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) << 6 | (char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) >>> 10) + var5) + '뺤') - var5) << 5) << 15) ^ '빶') << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) << 6 | (char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) >>> 10) + var5) + '뺤') - var5) >>> 11 | (char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) << 6 | (char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) >>> 10) + var5) + '뺤') - var5) << 5) >>> 1 | (char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) << 6 | (char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) >>> 10) + var5) + '뺤') - var5) >>> 11 | (char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) << 6 | (char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) >>> 10) + var5) + '뺤') - var5) << 5) << 15) ^ '빶') >>> 9) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) << 6 | (char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) >>> 10) + var5) + '뺤') - var5) >>> 11 | (char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) << 6 | (char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) >>> 10) + var5) + '뺤') - var5) << 5) >>> 1 | (char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) << 6 | (char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) >>> 10) + var5) + '뺤') - var5) >>> 11 | (char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) << 6 | (char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) >>> 10) + var5) + '뺤') - var5) << 5) << 15) ^ '빶') << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) << 6 | (char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) >>> 10) + var5) + '뺤') - var5) >>> 11 | (char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) << 6 | (char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) >>> 10) + var5) + '뺤') - var5) << 5) >>> 1 | (char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) << 6 | (char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) >>> 10) + var5) + '뺤') - var5) >>> 11 | (char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) << 6 | (char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10))) >>> 10) + var5) + '뺤') - var5) << 5) << 15) ^ '빶') >>> 9) >>> 10) ^ 5738) ^ var5) - var5) ^ var5) ^ '걫'));
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
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '谬') + var5) >>> 11 | (char)((char)(var4[var5] ^ '谬') + var5) << 5) - 3203) - 11661) - '\uee7f') + var5))) << 11 | (char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '谬') + var5) >>> 11 | (char)((char)(var4[var5] ^ '谬') + var5) << 5) - 3203) - 11661) - '\uee7f') + var5))) >>> 5) - '銃') ^ var5) - var5) << 10 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '谬') + var5) >>> 11 | (char)((char)(var4[var5] ^ '谬') + var5) << 5) - 3203) - 11661) - '\uee7f') + var5))) << 11 | (char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '谬') + var5) >>> 11 | (char)((char)(var4[var5] ^ '谬') + var5) << 5) - 3203) - 11661) - '\uee7f') + var5))) >>> 5) - '銃') ^ var5) - var5) >>> 6) - var5))) + var5) + 21122));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IIIllIIliIIl() {
      return this.lIIillIIIl;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) - 27557) + 29840) - var5) ^ var5) ^ var5) - var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) - 27557) + 29840) - var5) ^ var5) ^ var5) - var5) << 5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) - 27557) + 29840) - var5) ^ var5) ^ var5) - var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) - 27557) + 29840) - var5) ^ var5) ^ var5) - var5) << 5) << 7)) ^ 26984) + var5) - var5)) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
