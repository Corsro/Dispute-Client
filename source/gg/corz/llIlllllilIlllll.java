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
import java.util.Locale;
import java.util.function.IntConsumer;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_437;

public class llIlllllilIlllll extends Iliilliiilii {
   private static final float lIIiilIill = 1.2F;
   private static final float iIIiilIill = 14.0F;
   private int liiiilIill = -1;
   private final Runnable IliiilIill;
   private static final float IiIiilIill = 240.0F;
   private float iIIIIiIill = -1.0F;
   private final Runnable iIiiilIill;
   private static final float iiIiilIill = 8.0F;
   private final Runnable IIiiilIill;
   private int iliiilIill = Integer.MIN_VALUE;
   private static final float liililIill = 1.0F;
   private static final float liIiilIill = 3.2F;
   private float IlIIIiIill;
   private static final float ilIiilIill = 1.5F;
   private final float[] IlliilIill;
   private float lIIIIiIill = -1.0F;
   private float llIIIiIill;
   private final IntConsumer liliilIill;
   private final IntConsumer IiliilIill;
   private final IntConsumer illiilIill;
   private int iiiiilIill = Integer.MIN_VALUE;
   private static final float llIiilIill = 0.36F;
   private final List<String> iIliilIill;
   private final Runnable lIiiilIill;
   private final IntConsumer iiliilIill;
   private final liIlliiiIlli lIliilIill;
   private String IiIIIiIill = "";
   private final int llliilIill;
   private int IiiiilIill = -1;
   private long IIIIIiIill;
   private static final float IIIiilIill = 4.0F;
   private static final float iiililIill = 8.0F;
   private final Runnable lliiilIill;
   private static int IIliilIill = 0;
   private String ilIIIiIill;
   private static final float IlIiilIill = 0.4F;

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2977082727820864752L ^ Long.rotateLeft(2286563162819537200L, 24) ^ -3147809309003891477L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 2493460756900070696L ^ Long.rotateLeft(-3102867990741318262L, 51) ^ 4091450438802594728L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 9214378644141779820L ^ Long.rotateLeft(7317963751400067260L, 21) ^ -5640066004722739184L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 213493468689753132L ^ Long.rotateLeft(-7282088611320182433L, 38) ^ 5075345508999619156L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -262024642342269111L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 7500952469546826456L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 3187935346367235969L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 8665828883673400293L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 8479991073602081746L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -8039672335796793383L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(liiiIIllIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIlliIliiIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIillIiliIil<invokedynamic>()));
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

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + '쒯') >>> 8 | (char)((char)(var4[var5] ^ var5) + '쒯') << 8) - var5) >>> 1 | (char)((char)((char)((char)(var4[var5] ^ var5) + '쒯') >>> 8 | (char)((char)(var4[var5] ^ var5) + '쒯') << 8) - var5) << 15) + 20519))) - '\udc14'))) ^ 2888) + var5) + 17644))) + var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IIlllIlliIll(iiIiIlIIliIl f) {
      f.IlIlllIlilIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this.lIliilIill.iilllIIill().Iilllilliill(), this.illiilIill).IlIlllIlilIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this.lIliilIill.lIilliIill().Iilllilliill(), this.IiliilIill).IlIlllIlilIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this.lIliilIill.Ilillllill().Iilllilliill(), this.liliilIill).IIIllIIliIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this.lIliilIill.ilillIiill().Iilllilliill(), this.IIiiilIill).IIIllIIliIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this.lIliilIill.liilliiill().Iilllilliill(), this.lIiiilIill).IIIllIIliIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this.lIliilIill.IIIillIIil().Iilllilliill(), this.iIiiilIill).IIIllIIliIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this.lIliilIill.iIIilIlIil().Iilllilliill(), this.IliiilIill).IilliliilIIi().iliIiiliiiii(IliIlllilIi<invokedynamic>(), this.lIilliIill(), this.lliiilIill).IIlllIlliIll(IliIlllilIi<invokedynamic>(), liiIIiiiiIIi.iIiliiiiIliliiii, IIliilIill, this.iiliilIill);
   }

   private float lllllillll() {
      long var2 = -5255703231510460055L;
      var2 ^= ((long)Math.max(1, class_310.method_1551().method_22683().method_4495()) << 32 ^ var2) & -1L << 32;
      return (float)this.llliilIill / (float)((int)(var2 >>> 32));
   }

   public float lIiiIiIlilli() {
      return 308.0F;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] + 13361) + var5) + 22233))) ^ 7737))) - var5))) - var5) + '韈') >>> 2 | (char)((char)((char)(-((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] + 13361) + var5) + 22233))) ^ 7737))) - var5))) - var5) + '韈') << 14) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iliIiiliiiii(float dt) {
      long var5 = 5771968926051603567L;
      long var7 = -7315334976556562153L;
      this.llIIIiIill += dt;
      var5 ^= ((long)this.lIliilIill.lllllillll() << 32 ^ var5) & -1L << 32;
      if ((int)(var5 >>> 32) != this.iiilllIIIill.iliIiiliiiii() && (int)(var5 >>> 32) >= 0 && (int)(var5 >>> 32) < this.iIliilIill.size()) {
         this.iiilllIIIill.Iilllilliill((int)(var5 >>> 32), true);
      }

      var5 ^= ((long)this.lIliilIill.liIlliiIll() ^ var5) & -1L >>> 32;
      if ((int)var5 != this.iliiilIill) {
         this.iliiilIill = (int)var5;

         for(long var11 = var7 ^ (0L ^ var7) & -1L << 32; (int)(var11 >>> 32) < this.iIliilIill.size(); var11 += 4294967296L) {
            this.IlliilIill[(int)(var11 >>> 32)] = this.lIliilIill.ilIllIiIll((String)this.iIliilIill.get((int)(var11 >>> 32)));
         }
      }

      this.IlIIIiIill = lliiiIliliiiIl.iliIiiliiiii(this.IlIIIiIill, this.lIliilIill.iIIilIlIil().Iilllilliill() ? 1.0F : 0.0F, 8.0F, dt);
   }

   private static void IIIillIIil(iiIiiilIIliiil setting) {
      setting.Ililllililil();
   }

   public void IIIllIIliIIl(class_332 ctx, iIIiliiIlIilii stage) {
      long var6 = 406642586643378385L;
      var6 ^= ((long)stage.iIlIlliIIl << 32 ^ var6) & -1L << 32;
      if ((int)(var6 >>> 32) >= 0 && (int)(var6 >>> 32) < this.iIliilIill.size()) {
         float var4 = Math.max(0.05F, this.iIIIIiIill) * this.lllllillll();
         float var5 = this.IlIIIiIill > 0.001F ? this.lIliilIill.IIllllIlll(this.iilllIIill() * this.IlIIIiIill) * var4 : 0.0F;
         this.iIlllIllll((String)this.iIliilIill.get((int)(var6 >>> 32)), stage.IliIlllilIi(), stage.liiiIIllIl(), var4, var5);
      }
   }

   public String iIlIlllllill() {
      long var2 = -507784608009102286L;
      var2 ^= ((long)this.iiilllIIIill.iliIiiliiiii() << 32 ^ var2) & -1L << 32;
      if ((int)(var2 >>> 32) != this.liiiilIill) {
         this.liiiilIill = (int)(var2 >>> 32);
         this.ilIIIiIill = (int)(var2 >>> 32) >= 0 && (int)(var2 >>> 32) < this.iIliilIill.size() ? (String)this.iIliilIill.get((int)(var2 >>> 32)) + IliIlllilIi<invokedynamic>() + ((int)(var2 >>> 32) + 1) + IliIlllilIi<invokedynamic>() + this.iIliilIill.size() : "";
      }

      return this.ilIIIiIill;
   }

   private String lIilliIill() {
      long var2 = -7453771209964491858L;
      var2 ^= ((long)Math.round(Math.max(0.0F, this.iIIIIiIill) * 10.0F) << 32 ^ var2) & -1L << 32;
      if ((int)(var2 >>> 32) != this.iiiiilIill) {
         this.iiiiilIill = (int)(var2 >>> 32);
         this.IiIIIiIill = (int)(var2 >>> 32) <= 10 ? IliIlllilIi<invokedynamic>() : String.format(Locale.ROOT, IliIlllilIi<invokedynamic>(), (float)((int)(var2 >>> 32)) / 10.0F);
      }

      return this.IiIIIiIill;
   }

   public void Iiilliiliiil(class_332 y, int ctx, float size, float x, float index) {
      this.IIllllIlll(y, size, x, index, index, 5.0F);
      float var6 = Math.min(1.5F, index * 0.36F / Math.max(1.0F, this.IlliilIill[ctx]));
      this.iIlllIllll((String)this.iIliilIill.get(ctx), size + index / 2.0F, x + index / 2.0F, var6, 0.0F);
   }

   private void IIllllIlll(class_332 x, float radius, float y, float ctx, float w, float h) {
      float var7 = this.IiiiilIill < 0 ? 1.0F : (float)(System.nanoTime() - this.IIIIIiIill) / 1000000.0F / 240.0F;
      if (var7 >= 1.0F) {
         this.IiiiilIill = -1;
      }

      if (this.IiiiilIill < 0) {
         ilIiiiiIiIiiii.IilliliilIIi(x, IIliilIill, radius, y, ctx, w, h);
      } else {
         ilIiiiiIiIiiii.IilliliilIIi(x, this.IiiiilIill, radius, y, ctx, w, h);
         float var8 = IliiIilliiIi.IilliliilIIi(lliiiIliliiiIl.iIlIlllllill(var7));

         try {
            ilIiiiiIiIiiii.IilliliilIIi(x, IIliilIill, radius, y, ctx, w, h);
         } finally {
            IliiIilliiIi.lIiiIiIlilli(var8);
         }

      }
   }

   public void IlIlllIlilIl(class_332 stage, iIIiliiIlIilii ctx) {
      long var6 = -1722225142479798895L;
      var6 ^= ((long)Math.max(0, this.iiilllIIIill.iliIiiliiiii()) << 32 ^ var6) & -1L << 32;
      float var4 = this.Iillllilll((int)(var6 >>> 32), ctx);
      if (this.lIIIIiIill < 0.0F) {
         this.lIIIIiIill = Math.min(4.0F, var4);
      }

      float var5 = Math.max(1.0F, Math.min(this.lIIIIiIill, var4));
      this.iIIIIiIill = this.iIIIIiIill < 0.0F ? var5 : lliiiIliliiiIl.IIIllIIliIIl(this.iIIIIiIill, var5, 14.0F, ctx.illIlliIIl, 0.002F);
      this.IIllllIlll(stage, ctx.lIIIlliIIl, ctx.iIIIlliIIl, ctx.IlIIlliIIl, ctx.llIIlliIIl, ctx.IilIlliIIl);
   }

   public void IlIillIiilIi(int index) {
      this.lIliilIill.Iillllilll(index);
   }

   public boolean IiIIlliIIl(iIIiliiIlIilii x, double y, double amount, double stage) {
      if (this.lIIIIiIill < 0.0F) {
         return true;
      } else {
         float var8 = this.Iillllilll(Math.max(0, this.iiilllIIIill.iliIiiliiiii()), x);
         float var9 = Math.min(this.lIIIIiIill, var8);
         this.lIIIIiIill = Math.max(1.0F, Math.min(8.0F, var9 * (float)Math.pow((double)1.2F, stage)));
         return true;
      }
   }

   public int Illlllllilll() {
      return this.iIliilIill.size();
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6) + '낺') - var5) ^ var5) ^ var5) - var5) - var5) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6) + '낺') - var5) ^ var5) ^ var5) - var5) - var5) << 14) - '\uf8fd') >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6) + '낺') - var5) ^ var5) ^ var5) - var5) - var5) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6) + '낺') - var5) ^ var5) ^ var5) - var5) - var5) << 14) - '\uf8fd') << 5) + '촷') ^ var5) ^ var5));
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
         var4[var5] = (char)((char)((char)((char)(~((char)(~((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] - 25610) + 'ꄫ') - '锒'))) >>> 6 | (char)(-((char)((char)((char)(var4[var5] - 25610) + 'ꄫ') - '锒'))) << 10))) ^ 9199) + 31287))))) >>> 5 | (char)(~((char)(~((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] - 25610) + 'ꄫ') - '锒'))) >>> 6 | (char)(-((char)((char)((char)(var4[var5] - 25610) + 'ꄫ') - '锒'))) << 10))) ^ 9199) + 31287))))) << 11) << 13 | (char)((char)(~((char)(~((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] - 25610) + 'ꄫ') - '锒'))) >>> 6 | (char)(-((char)((char)((char)(var4[var5] - 25610) + 'ꄫ') - '锒'))) << 10))) ^ 9199) + 31287))))) >>> 5 | (char)(~((char)(~((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] - 25610) + 'ꄫ') - '锒'))) >>> 6 | (char)(-((char)((char)((char)(var4[var5] - 25610) + 'ꄫ') - '锒'))) << 10))) ^ 9199) + 31287))))) << 11) >>> 3));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void ilillIiill(int kind) {
      if (kind >= 0 && kind < 4 && kind != IIliilIill) {
         this.IiiiilIill = IIliilIill;
         IIliilIill = kind;
         this.IIIIIiIill = System.nanoTime();
      }
   }

   private float Iillllilll(int stage, iIIiliiIlIilii index) {
      if (stage >= 0 && stage < this.IlliilIill.length && !(index.IlIIlliIIl <= 0.0F) && !(index.llIIlliIIl <= 0.0F)) {
         float var3 = Math.min(index.IlIIlliIIl, index.llIIlliIIl) * 0.4F;
         float var4 = var3 / (Math.max(1.0F, this.IlliilIill[stage]) * this.lllllillll());
         return Math.max(1.0F, Math.min(8.0F, var4));
      } else {
         return 1.0F;
      }
   }

   public float IilliliilIIi() {
      return 460.0F;
   }

   private static void liilliiill(iilliIlIIiliIl dir, int setting) {
      long var3 = 7940695409760652053L;
      var3 ^= ((long)(dir.Iilllilliill() + setting * Math.max(1, dir.IlIillIiilIi())) << 32 ^ var3) & -1L << 32;
      dir.IIillIiliIil(Math.max(dir.Ililllililil(), Math.min(dir.Iiilliiliiil(), (int)(var3 >>> 32))));
   }

   private float iilllIIill() {
      float var1 = this.llIIIiIill % 3.2F;
      if (var1 < 0.28F) {
         return lliiiIliliiiIl.liiiIIllIl(var1 / 0.28F);
      } else if (var1 < 1.5F) {
         return 1.0F;
      } else {
         return var1 < 2.1F ? 1.0F - lliiiIliliiiIl.iIlIlllllill((var1 - 1.5F) / 0.6F) : 0.0F;
      }
   }

   public String Iilllilliill(int index) {
      return (String)this.iIliilIill.get(index);
   }

   private void Ilillllill() {
      if (!(this.lIIIIiIill < 0.0F)) {
         iIIiliiIlIilii var1 = this.iiilllIIIill.IlIlllIlilIl();
         float var2 = this.Iillllilll(Math.max(0, this.iiilllIIIill.iliIiiliiiii()), var1);
         this.lIIIIiIill = Math.min(this.lIIIIiIill, var2) > 1.05F ? 1.0F : Math.min(4.0F, var2);
      }
   }

   public float IIIilIIiiIIi() {
      return 122.0F;
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '뛗') - var5) + 18737) - var5) - var5) - '\udbaa') << 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '뛗') - var5) + 18737) - var5) - var5) - '\udbaa') >>> 8) - var5) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '뛗') - var5) + 18737) - var5) - var5) - '\udbaa') << 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '뛗') - var5) + 18737) - var5) - var5) - '\udbaa') >>> 8) - var5) >>> 1) - var5) + '틠') >>> 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '뛗') - var5) + 18737) - var5) - var5) - '\udbaa') << 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '뛗') - var5) + 18737) - var5) - var5) - '\udbaa') >>> 8) - var5) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '뛗') - var5) + 18737) - var5) - var5) - '\udbaa') << 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '뛗') - var5) + 18737) - var5) - var5) - '\udbaa') >>> 8) - var5) >>> 1) - var5) + '틠') << 9));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public llIlllllilIlllll(class_437 module, liIlliiiIlli parent) {
      super(module, IliIlllilIi<invokedynamic>());
      this.lIliilIill = parent;
      this.iIliilIill = parent.iIlllIllll();
      this.IlliilIill = new float[this.iIliilIill.size()];
      class_310 var3 = class_310.method_1551();
      this.llliilIill = lIIIIiiiIIIIii.IIillIiliIil((Integer)var3.field_1690.method_42474().method_41753(), var3.method_22683().method_4489(), var3.method_22683().method_4506(), var3.method_1573());
      this.illiilIill = (d) -> liilliiill(parent.iilllIIill(), d);
      this.IiliilIill = (d) -> liilliiill(parent.lIilliIill(), d);
      this.liliilIill = (modulex) -> liilliiill(parent.Ilillllill(), modulex);
      this.IIiiilIill = () -> IIIillIIil(parent.ilillIiill());
      this.lIiiilIill = () -> IIIillIIil(parent.liilliiill());
      this.iIiiilIill = () -> IIIillIIil(parent.IIIillIIil());
      this.IliiilIill = () -> IIIillIIil(parent.iIIilIlIil());
      this.lliiilIill = this::Ilillllill;
      this.iiliilIill = this::ilillIiill;
      this.iiilllIIIill.Iilllilliill(parent.lllllillll(), false);
      ilIiiiiIiIiiii.iIlIlllllill();
   }

   private void iIlllIllll(String y, float x, float spreadUnits, float style, float scale) {
      float var6 = IIIiiIillIIiiIil.Illlllllilll();
      float var7 = lIlIIIliIlIIIl.IIiilIiiiIii();
      float var8 = (float)Math.round(lIlIIIliIlIIIl.Illillliilli(x) / var6) * var6;
      float var9 = (float)Math.round(lIlIIIliIlIIIl.Iilililiiili(spreadUnits) / var6) * var6;
      this.lIliilIill.IlIllllIll(y, var8, var9, style * var7, scale * var7);
   }

   public boolean iiIIlIIlIl(int modifiers, int key) {
      if (modifiers >= 49 && modifiers < 53) {
         this.ilillIiill(modifiers - 49);
         return true;
      } else if (modifiers == 48) {
         this.Ilillllill();
         return true;
      } else {
         return false;
      }
   }

   public boolean Ililllililil() {
      return true;
   }
}
