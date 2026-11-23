package gg.corz;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
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
import net.minecraft.class_4184;

public class IiIliIllliIliIll extends ilIllIiIll {
   private String lIIIIiilll;
   private long llIIIiilll;
   private static final long llliililll = 650000000L;
   private final iliiliilIiiiliil iIiiililll;
   private String IIIIIiilll;
   private final IIIIlilllIIIlill lIiiililll;
   private final lIIIlIiliIIIlIil liiiililll;
   private final IIIIlilllIIIlill IIiiililll;
   private final IIIIlilllIIIlill iiliililll;
   private final IiIliiliIlii Iiiiililll;
   private final IIIIlilllIIIlill lliiililll;
   private float IlIIIiilll;
   private final IIIIlilllIIIlill liliililll;
   private static final float illiililll = 1.8181818E-9F;
   public static final String[] Illiililll;
   private long iIIIIiilll;
   private float ilIIIiilll;
   private final IIIIlilllIIIlill Iliiililll;
   private long iiiiililll;
   private final lliliIIiililiIIi Iiliililll;
   private final IIIIlilllIIIlill iliiililll;

   public float lIIlliIIll() {
      long var7 = -8920481423199622134L;
      long var1 = System.nanoTime();
      if (this.llIIIiilll < (1273847539879831100L ^ 1273847539879831100L)) {
         this.llIIIiilll = var1;
      }

      long var3 = Math.max(0L, Math.min(var1 - this.llIIIiilll, 7148269001850155692L ^ 7148269001893756972L));
      this.llIIIiilll = var1;
      var7 ^= ((long)(this.IliIlllilIi() && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null ? 1 : 0) << 32 ^ var7) & -1L << 32;
      float var6 = (float)var3 * 1.8181818E-9F;
      this.IlIIIiilll = (int)(var7 >>> 32) != 0 ? Math.min(1.0F, this.IlIIIiilll + var6) : Math.max(0.0F, this.IlIIIiilll - var6);
      return IIllllIlll(this.IlIIIiilll);
   }

   public boolean liilliiill(GpuTextureView target, int size) {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && target != null && size > 0) {
         long var3 = System.nanoTime();
         this.Iillllilll(var3, size, size, true);
         this.lIilliIill(target, var3, 1.0F);
         return true;
      } else {
         return false;
      }
   }

   private float lllllillll(long now) {
      String var3 = this.Iiliililll.Iilllilliill();
      if (this.IIIIIiilll == null) {
         this.IIIIIiilll = var3;
      }

      if (!var3.equals(this.IIIIIiilll)) {
         this.lIIIIiilll = this.IIIIIiilll;
         this.IIIIIiilll = var3;
         this.iIIIIiilll = now;
      }

      if (this.lIIIIiilll == null) {
         return 1.0F;
      } else {
         float var4 = (float)(now - this.iIIIIiilll) / 6.5E8F;
         if (var4 >= 1.0F) {
            this.lIIIIiilll = null;
            return 1.0F;
         } else {
            return IIllllIlll(Math.max(0.0F, var4));
         }
      }
   }

   public void Illillliilli() {
      this.llIIIiilll = System.nanoTime();
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)var4[var5] - var5))) - 9804) + 32585) ^ var5) - var5) + var5) ^ 'ﬣ'))))))) + '쓦') - 27025) ^ var5) ^ var5) - var5) >>> 11 | (char)((char)((char)((char)((char)((char)(~((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)var4[var5] - var5))) - 9804) + 32585) ^ var5) - var5) + var5) ^ 'ﬣ'))))))) + '쓦') - 27025) ^ var5) ^ var5) - var5) << 5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void Ilillllill(float fade) {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && !(fade <= 0.0F)) {
         GpuTextureView var2 = Iiiilllliiilll.method_1522().method_71639();
         if (var2 != null) {
            long var3 = System.nanoTime();
            this.Iillllilll(var3, Iiiilllliiilll.method_22683().method_4489(), Iiiilllliiilll.method_22683().method_4506(), false);
            this.lIilliIill(var2, var3, (float)this.lIiiililll.Iilllilliill() * fade);
         }
      }
   }

   static {
      String[] var10000 = new String[-1760515852 - 55 ^ 17 ^ -1760515925];
      var10000[0] = IliIlllilIi<invokedynamic>();
      var10000[1] = IliIlllilIi<invokedynamic>();
      var10000[2] = IliIlllilIi<invokedynamic>();
      var10000[3] = IliIlllilIi<invokedynamic>();
      var10000[4] = IliIlllilIi<invokedynamic>();
      var10000[5] = IliIlllilIi<invokedynamic>();
      var10000[-549142971 * -57 * 1059797125 ^ -1824643415] = IliIlllilIi<invokedynamic>();
      Illiililll = var10000;
   }

   private float iIlllIllll(long now) {
      if (this.iiiiililll < (6114779675756264733L ^ 6114779675756264733L)) {
         this.iiiiililll = now;
      }

      return (float)((double)(now - this.iiiiililll) / Double.longBitsToDouble(6965283864163526122L ^ 2406159840188179946L) % Double.longBitsToDouble(-4923786713211057223L ^ -353794175708935239L));
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + 7127))) - var5) - var5) ^ var5) ^ '\uefb7') ^ var5)) ^ var5) + '屢') + var5) + '욢') + var5) - 17507) - '蟛'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void lIilliIill(GpuTextureView now, long baseAlpha, float target) {
      float var5 = this.lllllillll(baseAlpha);
      if (this.lIIIIiilll != null) {
         this.iilllIIill(now, this.lIIIIiilll, target);
      }

      this.iilllIIill(now, this.IIIIIiilll, target * var5);
   }

   public float IlIllllIll() {
      this.ilIIIiilll = this.lIIlliIIll();
      return this.ilIIIiilll;
   }

   public void ilillIiill() {
      this.Ilillllill(1.0F);
   }

   private boolean iilllIIill(GpuTextureView target, String which, float layerAlpha) {
      RenderPipeline var4 = IiIliiliIlii.IliIlllilIi(which);
      if (!this.Iiiiililll.liiiIIllIl(var4)) {
         var4 = IiIliiliIlii.IliIlllilIi(IliIlllilIi<invokedynamic>());
      }

      if (!this.Iiiiililll.liiiIIllIl(var4)) {
         return false;
      } else {
         this.liiiililll.iililiIIil = layerAlpha;

         try {
            this.Iiiiililll.IilliliilIIi(target, var4, this.liiiililll);
            return true;
         } catch (Throwable var6) {
            this.Iiiiililll.iIlIlllllill(var4);
            return false;
         }
      }
   }

   private void Iillllilll(long height, int width, int hemisphere, boolean now) {
      class_4184 var6 = Iiiilllliiilll.field_1773.method_19418();
      this.liiiililll.IIliliIIil = (float)width;
      this.liiiililll.lIliliIIil = (float)hemisphere;
      this.liiiililll.iIliliIIil = (float)Math.toRadians((double)(-var6.method_19330()));
      this.liiiililll.IlliliIIil = (float)Math.toRadians((double)var6.method_19329());
      this.liiiililll.IliIlllilIi(this.iIiiililll.Iilllilliill() & ((--1896691920 >>> 11 | --1896691920 << 21) ^ 452058712));
      this.liiiililll.lililiIIil = this.iIlllIllll(height);
      this.liiiililll.IIiiliIIil = (float)this.liliililll.Iilllilliill();
      this.liiiililll.lIiiliIIil = (float)this.iiliililll.Iilllilliill();
      this.liiiililll.iIiiliIIil = (float)this.IIiiililll.Iilllilliill();
      this.liiiililll.IliiliIIil = IiilIIiliilIIi.liiiIIllIl();
      this.liiiililll.lliiliIIil = (float)this.Iliiililll.Iilllilliill();
      this.liiiililll.iliiliIIil = (float)this.lliiililll.Iilllilliill();
      this.liiiililll.IiiiliIIil = (float)this.iliiililll.Iilllilliill();
      this.liiiililll.liiiliIIil = now;
      this.liiiililll.iiiiliIIil = !now && iIIiliIiIlIiliIi.lIiiIiIlilli(iliIliIlIiiIliIl.lIiIIiiIll, var6.method_23767(), this.liiiililll.IIIIiiIIil);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -3562860133935157610L ^ Long.rotateLeft(8817572546631476754L, 25) ^ 1110651442767140262L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6172457583871828361L ^ Long.rotateLeft(551055935460029241L, 31) ^ 5594027604869996805L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7660919852342305925L ^ Long.rotateLeft(-6479062108184699858L, 41) ^ 6187567297746481450L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -9036698273631135898L ^ Long.rotateLeft(-1627577795301024916L, 35) ^ 6654751060336936789L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6791864153443322196L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -9107839574158512540L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4408158925957707661L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 8413267396156921521L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -1525901172310438754L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -569599128585838115L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(liiiIIllIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iIlIlllllill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IilliliilIIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, lIiiIiIlilli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iliIiiliiiii<invokedynamic>());
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
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(~((char)(-((char)(-((char)((char)((char)((char)(-((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) - var5))) + 10820))) << 12 | (char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) - var5))) + 10820))) >>> 4))) + '\uf673') + var5) ^ 2032))))))) + var5) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public float ilIllIiIll() {
      return this.ilIIIiilll;
   }

   public boolean liIlliiIll() {
      return this.IliIlllilIi() || this.IlIIIiilll > 0.5F;
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + '酷') << 15 | (char)(var4[var5] + '酷') >>> 1) - '잆') ^ 10633) >>> 14 | (char)((char)((char)((char)(var4[var5] + '酷') << 15 | (char)(var4[var5] + '酷') >>> 1) - '잆') ^ 10633) << 2))) >>> 4 | (char)(-((char)((char)((char)((char)((char)(var4[var5] + '酷') << 15 | (char)(var4[var5] + '酷') >>> 1) - '잆') ^ 10633) >>> 14 | (char)((char)((char)((char)(var4[var5] + '酷') << 15 | (char)(var4[var5] + '酷') >>> 1) - '잆') ^ 10633) << 2))) << 12) + 9013) + '덑'))) << 14 | (char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + '酷') << 15 | (char)(var4[var5] + '酷') >>> 1) - '잆') ^ 10633) >>> 14 | (char)((char)((char)((char)(var4[var5] + '酷') << 15 | (char)(var4[var5] + '酷') >>> 1) - '잆') ^ 10633) << 2))) >>> 4 | (char)(-((char)((char)((char)((char)((char)(var4[var5] + '酷') << 15 | (char)(var4[var5] + '酷') >>> 1) - '잆') ^ 10633) >>> 14 | (char)((char)((char)((char)(var4[var5] + '酷') << 15 | (char)(var4[var5] + '酷') >>> 1) - '잆') ^ 10633) << 2))) << 12) + 9013) + '덑'))) >>> 2) ^ 2991) - '뿓') + '섗') + 8096))) + '\uec69') - var5) + var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ 31454) >>> 2 | (char)(var4[var5] ^ 31454) << 14) + var5))) - var5) >>> 14 | (char)((char)(-((char)((char)((char)(var4[var5] ^ 31454) >>> 2 | (char)(var4[var5] ^ 31454) << 14) + var5))) - var5) << 2) - var5) - '闖') - var5))) - var5) >>> 7 | (char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ 31454) >>> 2 | (char)(var4[var5] ^ 31454) << 14) + var5))) - var5) >>> 14 | (char)((char)(-((char)((char)((char)(var4[var5] ^ 31454) >>> 2 | (char)(var4[var5] ^ 31454) << 14) + var5))) - var5) << 2) - var5) - '闖') - var5))) - var5) << 9) - 29586)));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IiIliIllliIliIll() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.llIlIIIiilIlIIIi);
      this.Iiliililll = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), Illiililll);
      this.liliililll = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)1.0F, 0.1, (double)5.0F, 0.1);
      this.iiliililll = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)5.0F, (double)1.0F, (double)20.0F, (double)0.5F);
      this.IIiiililll = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0.01, 0.001, 0.05, 0.001);
      this.lIiiililll = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)1.0F, 0.3, (double)1.0F, 0.05);
      this.iIiiililll = new iliiliilIiiiliil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), -16738561);
      this.Iliiililll = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)1.0F, 0.4, (double)2.5F, 0.05);
      this.lliiililll = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0.3, (double)0.0F, (double)1.0F, 0.05);
      this.iliiililll = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)1.0F, (double)0.0F, (double)2.0F, 0.05);
      this.Iiiiililll = new IiIliiliIlii();
      this.liiiililll = new lIIIlIiliIIIlIil();
      this.iiiiililll = -1L;
      this.llIIIiilll = -1L;
      this.Iliiililll.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.lliiililll.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.iliiililll.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.Iiliililll, this.liliililll, this.iiliililll, this.IIiiililll, this.lIiiililll, this.iIiiililll, this.Iliiililll, this.lliiililll, this.iliiililll});
   }

   public static IiIliIllliIliIll iiiIlIIIll() {
      return (IiIliIllliIliIll)llilIllililIll.iliIiiliiiii(IiIliIllliIliIll.class);
   }

   public void Iilililiiili() {
      this.llIIIiilll = System.nanoTime();
   }

   private static float IIllllIlll(float x) {
      return x * x * (3.0F - 2.0F * x);
   }
}
