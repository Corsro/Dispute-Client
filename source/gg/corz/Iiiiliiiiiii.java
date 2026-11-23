package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.IntConsumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_437;
import org.joml.Matrix4f;

public class Iiiiliiiiiii extends Iliilliiilii {
   private static final float iIIiilIlIiil = 12.0F;
   private float llIlIiilIlIi;
   private int iIilIiIlilIi;
   private float lIllIiiIllIi;
   private static final String IiiIilliiIil = "Partial preview";
   private long liiIIiiiiIIi;
   private static final float ilililIiilil = 0.72F;
   private static final String iIiIilIliIil = "File missing: ";
   private int iliiIiIiiiIi;
   private final IntConsumer iIiiilIliiil;
   private float lIiiIiiIiiIi;
   private final lIIiIiIiiIIiIiIi Illiilllliil;
   private final Runnable Iiiiilliiiil;
   private final Matrix4f liliiliiliil;
   private boolean lillIiiillIi;
   private static final long liiilliiiill = 300000000L;
   private static final float IiIiilliIiil = 5.0F;
   private String llliIiilliIi;
   private String iIlIIiIllIIi;
   private String iilIIiIIiIIi;
   private int IiilIiliilIi;
   private static final int IllIillllIil = 2;
   private float iiIlIiIIllIi;
   private final IntConsumer lliiililiiil;
   private static final String lliIililiIil = "corzclient/schematics";
   private static final float liililiiilil = 5.0F;
   private static final float iillilIIilil = 6.0F;
   private float IIIlIilIIlIi;
   private String IlIiIillIiIi;
   private int IiliIililiIi;
   private final Runnable IlIIIillIIIi;
   private int IIilIilIilIi;
   private static final float iIllilIlllil = 3.0F;
   private long iliIIiIiiIIi;
   private static final String IIiIillIiIil = "Failed to load ";
   private String[] liIIIiiiIIIi;
   private static final float llIiililIiil = 0.7F;
   private String lIIiIiiIIiIi;
   private static final String IlIlilllIlil = " -_+&·.,";
   private String iIliIiIlliIi;
   private static final float Iliilllliill = 134.0F;
   private iIilliIlIlilliIl IIliIilIliIi;
   private String IilIIililIIi;
   private static final float IIIiillIIiil = 4.0F;
   private final Map<String, iIIiilllIlIiilll> IIiiillIiiil;
   private long IliIIilliIIi;
   private static final Pattern lIIliliIIlil = Pattern.compile(IliIlllilIi<invokedynamic>());
   private static boolean iiIiilIIliil;
   private static final String illIilIilIil = "Drag to rotate  ·  Scroll to zoom  ·  Right-drag to pan";
   private static final float lIiilliIiill = 340.0F;
   private int lIiIIiiIiIIi;
   private static final float llllililllil = 7.0F;
   private List<String> IIlIIilIlIIi;
   private static final Pattern ilIlilIiIlil = Pattern.compile(IliIlllilIi<invokedynamic>());
   private static final float iilillIIiill = 500.0F;
   private int liIiIiiiIiIi;
   private final iIIllilIlIllil illiilIiliil;
   private float IlllIillllIi;
   private static final float iiIIilIIlIil = 1.1F;
   private static final Set<String> liIliliiIlil = Set.of(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
   private static final float iIIIilIlIIil = 8.0F;
   private static final long iliillIiiill = 1500000000L;
   private final Runnable iiiiilIIIIIi;
   private float iiliIiIIiiIi;
   private float iIIlIiIlIlIi;
   private static final float lIililiIilil = 13.0F;
   private static final float IIllillIllil = 6.0F;
   private String lllIIiillIIi;
   private final Runnable lIIIIiiIIIIi;
   private static final float IIIIillIIIil = 20.0F;
   private static final float llIIililIIil = 4.0F;
   private static final float Ilililllilil = 13.0F;
   private static final float Iillillillil = 12.0F;
   private static final float IiIIilliIIil = 7.0F;
   private float IliiIilliiIi;
   private static final float lIlIiliIlIil = 1.5F;
   private int ilIiIiIiIiIi;
   private float IiIlIiliIlIi;
   private static final String iiiIilIIIlil = "Reset view";
   private String iiilIiIIIiIi;
   private String[] ilIIIiIiIIIi;
   private static final String lilIiliilIil = "Loading schematic";
   private static Iiiiliiiiiii lIliiliIliil;
   private float illlIiIillIi;
   private int llilIiililIi;

   protected final int Illlilllli() {
      return this.ilIIIiIiIIIi.length;
   }

   protected final void IiIliliIli() {
      this.IlIiillIii();
   }

   protected final int lIlliiIlli() {
      return this.lIiIIiiIiIIi;
   }

   protected void lilIliilIl() {
      this.IIllllIlll();
   }

   public float IIIilIIiiIIi() {
      return 134.0F;
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -580830058240765913L ^ Long.rotateLeft(2664887869883337291L, 36) ^ -4088589497469339449L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -9200953559307561917L ^ Long.rotateLeft(5122429064654711741L, 21) ^ -6480658518733601946L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 4362974119320731159L ^ Long.rotateLeft(-753849890514004150L, 33) ^ -3305143284013111851L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 427350271863505787L ^ Long.rotateLeft(-2925359500146342121L, 60) ^ 2919221768223046744L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7259003610246139947L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 6745940197762258051L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 892005180500624431L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7531358839742651302L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 174689796803506854L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -2729549340074744365L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(liiiIIllIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIillIiliIil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Ililllililil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Iiilliiliiil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIiliIiiiIi<invokedynamic>());
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

   private void IliIilliIi(class_332 live, iIIiliiIlIilii x, float stage, float h, float ctx, boolean y) {
      long var17 = 2324010779992055668L;
      long var19 = -7085506339396485583L;
      var17 ^= ((long)this.IiliIililiIi << 32 ^ var17) & -1L << 32;
      if ((int)(var17 >>> 32) > 1) {
         String var8 = this.IIililIili();
         if ((int)(var17 >>> 32) != this.iliiIiIiiiIi) {
            this.iliiIiIiiiIi = (int)(var17 >>> 32);
            this.IliiIilliiIi = 42.0F + (float)Math.ceil((double)lIlIIIliIlIIIl.IIlllIlliIll(IliIlllilIi<invokedynamic>() + (int)(var17 >>> 32) + IliIlllilIi<invokedynamic>() + (int)(var17 >>> 32), 0.72F));
         }

         float var9 = this.IliiIilliiIi;
         var17 ^= ((long)(this.IIilIilIilIi >= 0 ? 1 : 0) ^ var17) & -1L >>> 32;
         lIlIIIliIlIIIl.IIIllIIliIIl(live, stage, h, var9, ctx, 4.0F, 0.0F, (int)var17 != 0 ? 1.0F : 0.0F);
         var19 ^= ((long)((int)var17 != 0 ? this.IIilIilIilIi : (int)(var17 >>> 32) - 1) << 32 ^ var19) & -1L << 32;
         this.iliIiIiiIi(live, x, IliIlllilIi<invokedynamic>(), lIlIIiliIlIIil.IiiIlliiIl(IliIlllilIi<invokedynamic>()), stage, h, ctx, y && (int)(var19 >>> 32) > 0, this.iiiiilIIIIIi);
         this.iliIiIiiIi(live, x, IliIlllilIi<invokedynamic>(), lIlIIiliIlIIil.IiiIlliiIl(IliIlllilIi<invokedynamic>()), stage + var9 - 12.0F, h, ctx, y && (int)var17 != 0, this.lIIIIiiIIIIi);
         float var12 = var9 - 24.0F;
         float var13 = 10.0F + lIlIIIliIlIIIl.IIlllIlliIll(var8, 0.72F);
         float var14 = llilliilililliil.IIIllIIliIIl(stage + 12.0F + (var12 - var13) / 2.0F);
         float var15 = y ? x.lIiiIiIlilli(IliIlllilIi<invokedynamic>(), stage + 12.0F, h, var12, ctx) : 0.0F;
         var19 ^= ((long)((int)var17 != 0 ? lIlIIIliIlIIIl.IiIlliIliiIl(var15, 1.0F) : IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)var15)) ^ var19) & -1L >>> 32;
         lIlIIIliIlIIIl.IIIilIIiiIIi(lIlIIiliIlIIil.IiiIlliiIl(IliIlllilIi<invokedynamic>()), var14, llilliilililliil.IIIllIIliIIl(h + (ctx - 7.0F) / 2.0F), 7.0F, (int)var19);
         lIlIIIliIlIIIl.Illlllllilll(var8, var14 + 7.0F + 3.0F, h, ctx, 0.72F, (int)var19);
         if (y) {
            x.IlIlllIlilIl(IliIlllilIi<invokedynamic>(), stage + 12.0F, h, var12, ctx, this.lliiililiiil);
         }

      }
   }

   private static float IilIililIi(String s) {
      return (float)Math.ceil((double)lIlIIIliIlIIIl.IIlllIlliIll(s, 0.7F)) + 10.0F;
   }

   protected final void iiIliIIlli() {
      if (this.lIiIIiiIiIIi >= 0) {
         this.iiilllIIIill.Iilllilliill(this.lIiIIiiIiIIi, false);
      }

   }

   private static String IIIillIIil(String file) {
      long var2 = -2976869230224327679L;
      var2 ^= ((long)file.lastIndexOf(46) << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) > 0 ? file.substring(0, (int)(var2 >>> 32)) : file;
   }

   private static void iilIiIIiIi(class_332 ctx, String w, float y, float x, float ink, float s, int h) {
      lIlIIIliIlIIIl.IIIllIIliIIl(ctx, y, x, ink, s, 4.0F, 0.0F, 0.0F);
      lIlIIIliIlIIIl.Illlllllilll(w, y + 5.0F, x, s, 0.7F, h);
   }

   private void ilIiiIiIii() {
      this.illiilIiliil.IliIlllilIi(0.0F);
      iiIiilIIliil = true;
   }

   private void lliililiil(iIIiilllIlIiilll job, lIlIlilliIlIlill s) {
      iiiIiIilIIIliIil var3 = s.IIIllIIliIIl();

      IlIIllillIIlli var4;
      try {
         var4 = IlIIllillIIlli.IliIlllilIi(var3.iiIIIilIil, var3.IIlIIilIil, (iiIllIilIIlllIil)null, IliIlllilIi<invokedynamic>());
      } catch (Throwable var6) {
         iilIIiiIIiIIii.IilliliilIIi(IliIlllilIi<invokedynamic>(), var6);
         return;
      }

      if (job.iIliiIlill != null) {
         job.iIliiIlill.close();
      }

      job.iIliiIlill = var4;
      job.IlliiIlill = var3.lIlIIilIil - job.IiIiiIlill.llililiIll;
   }

   protected void illIlIilIl() {
      this.iliIIiIiiIIi = System.nanoTime();
      this.IliIIilliIIi = this.iliIIiIiiIIi;
      lIliiliIliil = this;
   }

   private boolean iIIilIlIil() {
      String var1 = this.Illiilllliil.IIIllIIliIIl();
      return var1 != null && var1.startsWith(IliIlllilIi<invokedynamic>()) && var1.endsWith(IliIlllilIi<invokedynamic>());
   }

   public boolean IiIIlliIIl(iIIiliiIlIilii x, double y, double amount, double stage) {
      this.illiilIiliil.iliIiiliiiii(stage);
      iIIiilllIlIiilll var8 = (iIIiilllIlIiilll)this.IIiiillIiiil.get(this.iIlIIiIllIIi);
      if (var8 != null && var8.IiIiiIlill != null && var8.IiliiIlill > 0.0F) {
         float var9 = 1.0F / gg.corz.IliiIilliiIi.Illlllllilll();
         this.iiIlIiIIllIi = (float)(y - (double)x.IliIlllilIi()) * var9 / var8.IiliiIlill;
         this.lIllIiiIllIi = (float)(-(amount - (double)x.liiiIIllIl())) * var9 / var8.IiliiIlill;
         this.lillIiiillIi = true;
      }

      return true;
   }

   protected final boolean IIIlilIIli() {
      return this.llIililIil(this.iIlIIiIllIIi);
   }

   protected final boolean llIliilIli() {
      return this.ilIIIiIiIIIi.length > 0 || this.Illiilllliil.lIiiIiIlilli() != null;
   }

   public void IIIllIIliIIl(class_332 ctx, iIIiliiIlIilii stage) {
      String var3 = this.IlIIillIIi(stage.iIlIlliIIl);
      iIIiilllIlIiilll var4 = (iIIiilllIlIiilll)this.IIiiillIiiil.get(var3);
      if (var4 != null && var4.liIiiIlill != null && var4.IiIiiIlill != null) {
         float var5 = var4.iiIiiIlill == 0L ? Float.MAX_VALUE : (float)(System.nanoTime() - var4.iiIiiIlill) / 1000000.0F;
         float var6 = var4.iiIiiIlill == 0L ? 1.0F : lliiiIliliiiIl.Iilililiiili(var5);
         if (var6 < 1.0F) {
            this.IIlIilIlIi(ctx, stage, 1.0F - var6);
         }

         this.liIIiiiIIi(ctx, stage, var4, var6, var4.iiIiiIlill == 0L ? 1.0F : lliiiIliliiiIl.IIiilIiiiIii(var5));
      } else if (this.ilIIIiIiIIIi.length == 0 && this.Illiilllliil.lIiiIiIlilli() == null) {
         lIlIIIliIlIIIl.Iiilliiliiil(ctx, stage.lIIIlliIIl, stage.iIIIlliIIl, stage.IlIIlliIIl, stage.llIIlliIIl, lIlIIiliIlIIil.IIIIllIIIl(IliIlllilIi<invokedynamic>()), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
      } else if (var3.isEmpty()) {
         lIlIIIliIlIIIl.Iiilliiliiil(ctx, stage.lIIIlliIIl, stage.iIIIlliIIl, stage.IlIIlliIIl, stage.llIIlliIIl, lIlIIIliIlIIIl.IlIillIiilIi(IliIlllilIi<invokedynamic>()), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
      } else if (var4 != null && var4.IiIiiIlill != null && var4.IiIiiIlill.IliIlllilIi()) {
         lIlIIIliIlIIIl.Iiilliiliiil(ctx, stage.lIIIlliIIl, stage.iIIIlliIIl, stage.IlIIlliIIl, stage.llIIlliIIl, lIlIIIliIlIIIl.IlIillIiilIi(IliIlllilIi<invokedynamic>()), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
      } else if (var4 != null && var4.IiIiiIlill != null && iilIIiiIIiIIii.iIlIlllllill()) {
         this.ilIIiIiIIi(ctx, stage);
      } else if (this.llIililIil(var3)) {
         lIlIIIliIlIIIl.Iiilliiliiil(ctx, stage.lIIIlliIIl, stage.iIIIlliIIl, stage.IlIIlliIIl, stage.llIIlliIIl, lIlIIIliIlIIIl.IlIillIiilIi(IliIlllilIi<invokedynamic>()), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
      } else if (var4 != null && var4.IIliiIlill) {
         lIlIIIliIlIIIl.Iiilliiliiil(ctx, stage.lIIIlliIIl, stage.iIIIlliIIl, stage.IlIIlliIIl, stage.llIIlliIIl, lIlIIIliIlIIIl.IlIillIiilIi(IliIlllilIi<invokedynamic>()), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
      } else {
         this.IIlIilIlIi(ctx, stage, 1.0F);
      }
   }

   private void iIiliIlili(int dir) {
      long var4 = 1183034291329014831L;
      var4 ^= ((long)this.IiliIililiIi << 32 ^ var4) & -1L << 32;
      if ((int)(var4 >>> 32) > 1 && dir != 0) {
         var4 ^= ((long)(this.IIilIilIilIi < 0 ? (int)(var4 >>> 32) - 1 : this.IIilIilIilIi) ^ var4) & -1L >>> 32;
         var4 ^= ((long)Math.floorMod((int)var4 - Integer.signum(dir), (int)(var4 >>> 32)) ^ var4) & -1L >>> 32;
         this.IIilIilIilIi = (int)var4 >= (int)(var4 >>> 32) - 1 ? -1 : (int)var4;
      }
   }

   private void ilIIiIiIIi(class_332 stage, iIIiliiIlIilii ctx) {
      lIlIIIliIlIIIl.Iiilliiliiil(stage, ctx.lIIIlliIIl, ctx.iIIIlliIIl, ctx.IlIIlliIIl, ctx.llIIlliIIl, lIlIIIliIlIIIl.IlIillIiilIi(IliIlllilIi<invokedynamic>()), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
   }

   public static String liIiiiiIii(String arg) {
      long var7 = -6746214662658995039L;
      long var9 = -187561428285648895L;
      Iiiiliiiiiii var1 = lIliiliIliil;
      if (var1 != null && class_310.method_1551().field_1755 == var1) {
         String[] var2 = arg.trim().split(IliIlllilIi<invokedynamic>());

         try {
            String var3 = var2[0].toLowerCase(Locale.ROOT);
            var7 ^= (-4294967296L ^ var7) & -1L << 32;
            switch (var3.hashCode()) {
               case 110749:
                  if (var3.equals(IliIlllilIi<invokedynamic>())) {
                     var7 ^= (17179869184L ^ var7) & -1L << 32;
                  }
                  break;
               case 3440673:
                  if (var3.equals(IliIlllilIi<invokedynamic>())) {
                     var7 ^= (12884901888L ^ var7) & -1L << 32;
                  }
                  break;
               case 3536962:
                  if (var3.equals(IliIlllilIi<invokedynamic>())) {
                     var7 ^= (25769803776L ^ var7) & -1L << 32;
                  }
                  break;
               case 3744723:
                  if (var3.equals(IliIlllilIi<invokedynamic>())) {
                     var7 ^= (4294967296L ^ var7) & -1L << 32;
                  }
                  break;
               case 102749521:
                  if (var3.equals(IliIlllilIi<invokedynamic>())) {
                     var7 ^= (8589934592L ^ var7) & -1L << 32;
                  }
                  break;
               case 106004554:
                  if (var3.equals(IliIlllilIi<invokedynamic>())) {
                     var7 ^= (0L ^ var7) & -1L << 32;
                  }
                  break;
               case 108404047:
                  if (var3.equals(IliIlllilIi<invokedynamic>())) {
                     var7 ^= (21474836480L ^ var7) & -1L << 32;
                  }
            }

            switch ((int)(var7 >>> 32)) {
               case 0:
                  var1.ilIiiIiIii();
                  float var5 = Float.parseFloat(var2[1]);
                  float var6 = var2.length > 2 ? Float.parseFloat(var2[2]) : 26.0F;
                  var1.illiilIiliil.liiiIIllIl();
                  var1.illiilIiliil.iIlIlllllill((double)(-(var5 - var1.illiilIiliil.Illlllllilll()) / 1.6F), (double)((var6 - var1.illiilIiliil.Iilllilliill()) / 0.6F));
                  var1.illiilIiliil.IilliliilIIi();
                  break;
               case 1:
                  var1.illiilIiliil.IIIllIIliIIl(Float.parseFloat(var2[1]));
                  break;
               case 2:
                  var7 ^= ((long)var1.IiliIililiIi ^ var7) & -1L >>> 32;
                  var9 ^= ((long)(var2[1].equalsIgnoreCase(IliIlllilIi<invokedynamic>()) ? -1 : Integer.parseInt(var2[1]) - 1) << 32 ^ var9) & -1L << 32;
                  var1.IIilIilIilIi = (int)(var9 >>> 32) >= 0 && (int)(var9 >>> 32) < (int)var7 - 1 ? (int)(var9 >>> 32) : -1;
                  break;
               case 3:
                  var7 ^= ((long)(Integer.parseInt(var2[1]) - 1) ^ var7) & -1L >>> 32;
                  if ((int)var7 >= 0 && (int)var7 < var1.ilIIIiIiIIIi.length) {
                     var1.lIliliIlil(var1.ilIIIiIiIIIi[(int)var7]);
                     var1.iiilllIIIill.Iilllilliill(var1.lIiIIiiIiIIi, true);
                  }
                  break;
               case 4:
                  var1.ilIiiIiIii();
                  var1.llIlIiilIlIi = Float.parseFloat(var2[1]);
                  var1.IiIlIiliIlIi = Float.parseFloat(var2[2]);
                  var1.lIIIiiIIIi();
                  break;
               case 5:
                  var1.lIIiiiIIii();
                  break;
               case 6:
                  var1.illiilIiliil.IliIlllilIi(var2.length > 1 && var2[1].equalsIgnoreCase(IliIlllilIi<invokedynamic>()) ? 0.0F : 9.0F);
                  break;
               default:
                  return IliIlllilIi<invokedynamic>() + arg;
            }
         } catch (RuntimeException var11) {
            return IliIlllilIi<invokedynamic>() + arg;
         }

         iIIiilllIlIiilll var12 = (iIIiilllIlIiilll)var1.IIiiillIiiil.get(var1.iIlIIiIllIIi);
         return String.format(Locale.ROOT, IliIlllilIi<invokedynamic>(), arg, var1.iIlIIiIllIIi, var12 != null && var12.liIiiIlill != null, var12 != null && var12.IiIiiIlill != null ? var12.IiIiiIlill.IlililiIll : 0, var1.iIilIiIlilIi, var1.illiilIiliil.Illlllllilll(), var1.illiilIiliil.Iilllilliill(), var1.illiilIiliil.IIillIiliIil(), iilIIiiIIiIIii.iIlIlllllill() ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>());
      } else {
         return IliIlllilIi<invokedynamic>();
      }
   }

   public static String lIilliIill(String file) {
      return ilillIiill(file, true, false);
   }

   private void lllIiillIi(class_332 stage, iIIiliiIlIilii ctx, boolean partial) {
      if (this.iIliIiIlliIi != null && this.llliIiilliIi != null) {
         float var4 = 12.0F;
         float var5 = llilliilililliil.IIIllIIliIIl(ctx.iIIIlliIIl + 6.0F);
         float var6 = ctx.lIIIlliIIl + ctx.IlIIlliIIl - 6.0F;
         float var7 = IilIililIi(this.llliIiilliIi);
         float var8 = IilIililIi(this.iIliIiIlliIi);
         iilIiIIiIi(stage, this.llliIiilliIi, var6 - var7, var5, var7, var4, -7630437);
         iilIiIIiIi(stage, this.iIliIiIlliIi, var6 - var7 - 3.0F - var8, var5, var8, var4, -7630437);
         if (partial) {
            float var9 = IilIililIi(IliIlllilIi<invokedynamic>());
            iilIiIIiIi(stage, IliIlllilIi<invokedynamic>(), var6 - var7 - var8 - 6.0F - var9, var5, var9, var4, -1535700);
         }

      }
   }

   public void iIIIlIlIIl(iIIiliiIlIilii dx, double dy, double y, double x, double stage, int button) {
      if (button != 0) {
         iIIiilllIlIiilll var11 = (iIIiilllIlIiilll)this.IIiiillIiiil.get(this.iIlIIiIllIIi);
         if (var11 != null && var11.IiIiiIlill != null) {
            float var12 = var11.IiliiIlill * this.illiilIiliil.IIillIiliIil();
            if (!(var12 <= 0.0F)) {
               float var13 = 1.0F / gg.corz.IliiIilliiIi.Illlllllilll();
               this.llIlIiilIlIi += (float)x * var13 / var12;
               this.IiIlIiliIlIi -= (float)stage * var13 / var12;
               this.lIIIiiIIIi();
            }
         }
      } else {
         if (x != (double)0.0F || stage != (double)0.0F) {
            this.liiIIiiiiIIi = 0L;
         }

         this.illiilIiliil.iIlIlllllill(x, stage);
      }
   }

   protected final boolean liiIiiiiIi() {
      String var1 = this.Illiilllliil.iliIiiliiiii();
      return !this.iIlIIiIllIIi.isEmpty() && this.iIlIIiIllIIi.equals(var1) && this.Illiilllliil.lIiiIiIlilli() != null && this.iilIIiIIiIIi == null && !this.iIIilIlIil();
   }

   public void method_25432() {
      super.method_25432();
      this.IIllllIlll();
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(~((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ var5) ^ var5))))))) - var5) << 6 | (char)((char)(-((char)(~((char)(~((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ var5) ^ var5))))))) - var5) >>> 10) + '鱖') - 2950) + var5) + '긱') + 30529)))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iiIilIIlil(String file) {
      this.lllIIiillIIi = this.iIlIIiIllIIi;
      this.iIlIIiIllIIi = file;
      this.lIiIIiiIiIIi = this.liilliiill(file);
      this.Illillllil();
      if (this.lIiIIiiIiIIi >= 0) {
         this.iiilllIIIill.Iilllilliill(this.lIiIIiiIiIIi, true);
      }

   }

   private void liIIiiiIIi(class_332 scale, iIIiliiIlIilii alpha, iIIiilllIlIiilll ctx, float stage, float s) {
      long var20 = -4527457329113842842L;
      long var22 = 3222446146031490025L;
      long var24 = 3848973334062474433L;
      if (!iilIIiiIIiIIii.liiiIIllIl()) {
         this.ilIIiIiIIi(scale, alpha);
      } else if (!(stage <= 0.002F)) {
         liIIliIliiIIliIl var6 = ctx.IiIiiIlill;
         float var7 = 1.0F / gg.corz.IliiIilliiIi.Illlllllilll();
         var20 ^= ((long)Math.max(1, Math.round(alpha.IlIIlliIIl * var7)) << 32 ^ var20) & -1L << 32;
         var20 ^= ((long)Math.max(1, Math.round(alpha.llIIlliIIl * var7)) ^ var20) & -1L >>> 32;
         if (ctx.llliiIlill != (int)(var20 >>> 32) || ctx.illiiIlill != (int)var20) {
            ctx.llliiIlill = (int)(var20 >>> 32);
            ctx.illiiIlill = (int)var20;
            ctx.IiliiIlill = ilIIliilIiIIliil.iIlIlllllill(var6.ilililiIll, var6.IiililiIll, var6.liililiIll, (float)((int)(var20 >>> 32)), (float)((int)var20), 26.0F);
         }

         var22 ^= ((long)ctx.IlIiiIlill.equals(this.iIlIIiIllIIi) << 32 ^ var22) & -1L << 32;
         var22 ^= ((long)((int)(var22 >>> 32) != 0 ? this.iIilIiIlilIi : -1) ^ var22) & -1L >>> 32;
         float var12 = ctx.IiliiIlill * this.illiilIiliil.IIillIiliIil();
         float var13 = ilIIliilIiIIliil.liiiIIllIl(var6.ilililiIll, var6.IiililiIll, var6.liililiIll);
         ilIIliilIiIIliil.IilliliilIIi(this.liliiliiliil, var6.iiililiIll, var6.IIIiiliIll, var6.lIIiiliIll, var13, this.illiilIiliil.Illlllllilll(), this.illiilIiliil.Iilllilliill(), var12, (int)(var22 >>> 32) != 0 ? this.IIIlIilIIlIi : 0.0F, (int)(var22 >>> 32) != 0 ? this.iIIlIiIlIlIi : 0.0F, (float)((int)(var20 >>> 32)), (float)((int)var20));
         IlIIllillIIlli var14 = (int)var22 >= 0 && ctx.IlliiIlill == (int)var22 ? ctx.iIliiIlill : null;
         var24 ^= ((long)iilIIiiIIiIIii.iliIiiliiiii((int)(var20 >>> 32), (int)var20) << 32 ^ var24) & -1L << 32;
         float var16 = gg.corz.IliiIilliiIi.IilliliilIIi(stage);
         var24 ^= ((long)lIlIIIliIlIIIl.IiIiliIiiiIi(scale, alpha.IliIlllilIi(), alpha.liiiIIllIl(), s, 0.0F) ^ var24) & -1L >>> 32;

         try {
            iilIIiiIIiIIii.IIIllIIliIIl(ctx.liIiiIlill, var6.liiiIIllIl((int)var22), var6.iIlIlllllill((int)var22), (int)var22 > 0 ? var6.liiiIIllIl((int)var22 - 1) : 0, (int)var22 > 0 ? var6.iIlIlllllill((int)var22 - 1) : 0, var6.IilliliilIIi((int)var22), (int)var22 > 0 ? var6.IilliliilIIi((int)var22 - 1) : 0, var14, this.liliiliiliil, (int)(var20 >>> 32) * (int)(var24 >>> 32), (int)var20 * (int)(var24 >>> 32));
            iilIIiiIIiIIii.IIlllIlliIll(IIIiiIillIIiiIil.liiiIIllIl().method_23760().method_23761(), alpha.lIIIlliIIl, alpha.iIIIlliIIl, alpha.IlIIlliIIl, alpha.llIIlliIIl, alpha.IilIlliIIl, gg.corz.IliiIilliiIi.IIIllIIliIIl());
         } catch (Throwable var28) {
            iilIIiiIIiIIii.IilliliilIIi(IliIlllilIi<invokedynamic>(), var28);
         } finally {
            lIlIIIliIlIIIl.IIlilIliiIli(scale, (boolean)((int)var24));
            gg.corz.IliiIilliiIi.lIiiIiIlilli(var16);
         }

      }
   }

   public float IilliliilIIi() {
      return 500.0F;
   }

   public void IIlllIlliIll(iiIiIlIIliIl f) {
      if (this.ilIIIiIiIIIi.length == 0 && this.Illiilllliil.lIiiIiIlilli() == null) {
         f.iIlIlllllill(IliIlllilIi<invokedynamic>()).IilliliilIIi().Iilllilliill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this.IlIIIillIIIi);
      }

   }

   public Iiiiliiiiiii(class_437 parent, lIIiIiIiiIIiIiIi manager) {
      this(parent, manager, IliIlllilIi<invokedynamic>());
   }

   public void IlIillIiilIi(int index) {
      if (index >= 0 && index < this.ilIIIiIiIIIi.length) {
         this.lIliliIlil(this.ilIIIiIiIIIi[index]);
      }

   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~var4[var5]))) + var5) << 9 | (char)((char)(-((char)(~var4[var5]))) + var5) >>> 7) + var5) - 9596) ^ var5) + var5) - 'ꄳ') - 8694))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iliIiiliiiii(float dt) {
      long var6 = -3724284162366865747L;
      long var2 = System.nanoTime();
      if (var2 - this.IliIIilliIIi > 1500000000L) {
         this.IliIIilliIIi = var2;
         this.iIlllIllll();
      }

      this.illiilIiliil.IIlllIlliIll(dt);
      this.iiiilIIIIi(dt);
      this.IiIilliIil();
      this.IIiillIiil();
      this.Iiiilliiil();
      iIIiilllIlIiilll var4 = (iIIiilllIlIiilll)this.IIiiillIiiil.get(this.iIlIIiIllIIi);
      var6 ^= ((long)(var4 != null && var4.liIiiIlill != null ? 1 : 0) << 32 ^ var6) & -1L << 32;
      this.illlIiIillIi = lliiiIliliiiIl.IIIllIIliIIl(this.illlIiIillIi, !iiIiilIIliil && (int)(var6 >>> 32) != 0 ? 1.0F : 0.0F, 8.0F, dt, 0.002F);
   }

   private String IlIIillIIi(int item) {
      return this.Illlllllilll() != 0 && item >= 0 && item < this.ilIIIiIiIIIi.length ? this.ilIIIiIiIIIi[item] : this.iIlIIiIllIIi;
   }

   private int liilliiill(String file) {
      long var3 = -2289766204081353311L;
      if (file != null && !file.isEmpty()) {
         for(long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < this.ilIIIiIiIIIi.length; var5 += 4294967296L) {
            if (this.ilIIIiIiIIIi[(int)(var5 >>> 32)].equals(file)) {
               return (int)(var5 >>> 32);
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   private void Iillllilll(List<String> list) {
      long var8 = 6628420503380646037L;
      long var10 = -1092414143266685031L;
      this.IIlIIilIlIIi = List.copyOf(list);
      var8 ^= ((long)list.size() << 32 ^ var8) & -1L << 32;
      String[] var3 = (String[])list.toArray(new String[0]);
      String[] var4 = new String[(int)(var8 >>> 32)];
      HashMap var5 = new HashMap();

      for(var8 ^= (0L ^ var8) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         var4[(int)var8] = Ilillllill(var3[(int)var8], true);
         var5.merge(var4[(int)var8].toLowerCase(Locale.ROOT), 1, Integer::sum);
      }

      for(var8 ^= (0L ^ var8) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         if ((Integer)var5.get(var4[(int)var8].toLowerCase(Locale.ROOT)) > 1) {
            var4[(int)var8] = Ilillllill(var3[(int)var8], false);
         }
      }

      Integer[] var6 = new Integer[(int)(var8 >>> 32)];

      for(var10 ^= (0L ^ var10) & -1L << 32; (int)(var10 >>> 32) < (int)(var8 >>> 32); var10 += 4294967296L) {
         var6[(int)(var10 >>> 32)] = (int)(var10 >>> 32);
      }

      Arrays.sort(var6, (b, a) -> {
         long var5 = 3706270926422621657L;
         var5 ^= ((long)String.CASE_INSENSITIVE_ORDER.compare(var4[b], var4[a]) << 32 ^ var5) & -1L << 32;
         return (int)(var5 >>> 32) != 0 ? (int)(var5 >>> 32) : var3[b].compareTo(var3[a]);
      });
      this.ilIIIiIiIIIi = new String[(int)(var8 >>> 32)];
      this.liIIIiiiIIIi = new String[(int)(var8 >>> 32)];

      for(long var16 = var10 ^ (0L ^ var10) & -1L << 32; (int)(var16 >>> 32) < (int)(var8 >>> 32); var16 += 4294967296L) {
         this.ilIIIiIiIIIi[(int)(var16 >>> 32)] = var3[var6[(int)(var16 >>> 32)]];
         this.liIIIiiiIIIi[(int)(var16 >>> 32)] = var4[var6[(int)(var16 >>> 32)]];
      }

   }

   public boolean IIIIllIIIl(iIIiliiIlIilii y, double stage, double x, int button) {
      long var7 = System.nanoTime();
      if (button == 0) {
         if (this.liiIIiiiiIIi != 0L && var7 - this.liiIIiiiiIIi < 300000000L) {
            this.liiIIiiiiIIi = 0L;
            this.lIIiiiIIii();
            return true;
         } else {
            this.liiIIiiiiIIi = var7;
            this.ilIiiIiIii();
            this.illiilIiliil.liiiIIllIl();
            return true;
         }
      } else {
         this.ilIiiIiIii();
         return true;
      }
   }

   public boolean iiIIlIIlIl(int key, int modifiers) {
      switch (key) {
         case 82:
            this.lIIiiiIIii();
            return true;
         case 266:
            this.iiiliIIIii(1);
            return true;
         case 267:
            this.iiiliIIIii(-1);
            return true;
         default:
            return false;
      }
   }

   private void lIIiiiIIii() {
      this.illiilIiliil.IlIlllIlilIl();
      this.illiilIiliil.IliIlllilIi(9.0F);
      this.llIlIiilIlIi = this.IiIlIiliIlIi = 0.0F;
      this.lillIiiillIi = false;
   }

   private void iIlllIllll() {
      long var4 = 7485400474461539597L;

      try {
         this.Illiilllliil.iIlIlllllill();
      } catch (Throwable var6) {
      }

      List var1 = this.Illiilllliil.IilliliilIIi();
      if (!this.lllllillll(var1)) {
         var4 ^= ((long)this.lIiIIiiIiIIi << 32 ^ var4) & -1L << 32;
         this.Iillllilll(var1);
         this.lIiIIiiIiIIi = this.liilliiill(this.iIlIIiIllIIi);
         if (this.lIiIIiiIiIIi >= 0) {
            this.iiilllIIIill.Iilllilliill(this.lIiIIiiIiIIi, false);
         } else if (this.ilIIIiIiIIIi.length > 0 && !this.Iilililiiili()) {
            var4 ^= ((long)Math.max(0, Math.min(this.ilIIIiIiIIIi.length - 1, (int)(var4 >>> 32))) ^ var4) & -1L >>> 32;
            this.lIliliIlil(this.ilIIIiIiIIIi[(int)var4]);
            this.iiilllIIIill.Iilllilliill(this.lIiIIiiIiIIi, true);
         }

      }
   }

   public int Illlllllilll() {
      return this.ilIIIiIiIIIi.length >= 2 ? this.ilIIIiIiIIIi.length : 0;
   }

   private void iliIiIiiIi(class_332 enabled, iIIiliiIlIilii x, String stage, class_2960 ctx, float y, float h, float icon, boolean act, Runnable id) {
      float var10 = act ? x.lIiiIiIlilli(stage, y, h, 12.0F, icon) : 0.0F;
      if (var10 > 0.01F) {
         IIIiiIillIIiiIil.IlIlllIlilIl(enabled, y + 1.5F, h + 1.5F, 9.0F, icon - 3.0F, 2.5F, llilliilililliil.IIIIllIIIl(-1, 0.07F * var10));
      }

      lIlIIIliIlIIIl.IIIilIIiiIIi(ctx, llilliilililliil.IIIllIIliIIl(y + 3.0F), llilliilililliil.IIIllIIliIIl(h + (icon - 6.0F) / 2.0F), 6.0F, act ? IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)var10) : -11117467);
      if (act) {
         x.IIIllIIliIIl(stage, y, h, 12.0F, icon, id);
      }

   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 23660) + '꫱') ^ '쓤') - var5) ^ var5) + 'ꔨ') + 28075) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - 23660) + '꫱') ^ '쓤') - var5) ^ var5) + 'ꔨ') + 28075) << 6) - 30976) - var5))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void lIliliIlil(String file) {
      if (file != null && !file.equals(this.iIlIIiIllIIi)) {
         this.lllIIiillIIi = this.iIlIIiIllIIi;
         this.iIlIIiIllIIi = file;
         this.lIiIIiiIiIIi = this.liilliiill(file);
         this.Illillllil();
         String var2 = this.Illiilllliil.iliIiiliiiii();
         this.iilIIiIIiIIi = file.equals(var2) && this.Illiilllliil.lIiiIiIlilli() != null ? null : file;
      }
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) - '\uebd7') + 27248) >>> 8 | (char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) - '\uebd7') + 27248) << 8) + '릔') + var5))) << 2 | (char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) - '\uebd7') + 27248) >>> 8 | (char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) - '\uebd7') + 27248) << 8) + '릔') + var5))) >>> 14))) + 30813) + var5) - 19462));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void lIiIiiIiIi(class_332 y, iIIiliiIlIilii ctx, float live, boolean stage) {
      long var13 = -3108088637460609705L;
      float var5 = 13.0F;
      float var6 = 10.0F + (float)Math.ceil((double)lIlIIIliIlIIIl.IIlllIlliIll(IliIlllilIi<invokedynamic>(), 0.72F)) + 10.0F;
      float var7 = llilliilililliil.IIIllIIliIIl(ctx.lIIIlliIIl + ctx.IlIIlliIIl - 6.0F - var6);
      float var8 = stage ? ctx.lIiiIiIlilli(IliIlllilIi<invokedynamic>(), var7, live, var6, var5) : 0.0F;
      var13 ^= ((long)lIlIIIliIlIIIl.IiIiliIiiiIi(y, var7 + var6 / 2.0F, live + var5 / 2.0F, ctx.iliIiiliiiii(IliIlllilIi<invokedynamic>(), 0.05F), 0.0F) << 32 ^ var13) & -1L << 32;

      try {
         lIlIIIliIlIIIl.IIIllIIliIIl(y, var7, live, var6, var5, 4.0F, var8, 0.0F);
         float var10 = var7 + 5.0F;
         var13 ^= ((long)lIlIIIliIlIIIl.IiIlliIliiIl(var8, 0.0F) ^ var13) & -1L >>> 32;
         lIlIIIliIlIIIl.IIIilIIiiIIi(lIlIIiliIlIIil.IiiIlliiIl(IliIlllilIi<invokedynamic>()), var10, llilliilililliil.IIIllIIliIIl(live + (var5 - 7.0F) / 2.0F), 7.0F, (int)var13);
         lIlIIIliIlIIIl.Illlllllilll(IliIlllilIi<invokedynamic>(), var10 + 7.0F + 3.0F, live, var5, 0.72F, (int)var13);
      } finally {
         lIlIIIliIlIIIl.IIlilIliiIli(y, (boolean)((int)(var13 >>> 32)));
      }

      if (stage) {
         ctx.IIIllIIliIIl(IliIlllilIi<invokedynamic>(), var7, live, var6, var5, this.Iiiiilliiiil);
      }

   }

   private void iIiilIliil(iIIiilllIlIiilll r, liIIliIliiIIliIl s) {
      long var5 = 4161277761229367707L;
      IlIIllillIIlli var3 = null;
      if (!s.IliIlllilIi() && iilIIiiIIiIIii.liiiIIllIl()) {
         try {
            var3 = IlIIllillIIlli.IliIlllilIi(s.IilliliIll, s.lilliliIll, s.iilliliIll, IliIlllilIi<invokedynamic>());
         } catch (Throwable var7) {
            iilIIiiIIiIIii.IilliliilIIi(IliIlllilIi<invokedynamic>(), var7);
         }
      }

      s.IilliliIll.Iiilliiliiil();
      s.lilliliIll.Iiilliiliiil();
      s.iilliliIll.Iiilliiliiil();
      var5 ^= ((long)(r.liIiiIlill != null ? 1 : 0) << 32 ^ var5) & -1L << 32;
      if (r.liIiiIlill != null) {
         r.liIiiIlill.close();
      }

      if (r.iIliiIlill != null) {
         r.iIliiIlill.close();
      }

      if (r.lIliiIlill != null) {
         r.lIliiIlill.IliIlllilIi();
      }

      r.iIliiIlill = null;
      r.lIliiIlill = null;
      r.IlliiIlill = -1;
      r.liIiiIlill = var3;
      r.IiIiiIlill = s;
      r.IIliiIlill = false;
      r.llliiIlill = r.illiiIlill = -1;
      r.iiIiiIlill = (int)(var5 >>> 32) != 0 ? 0L : System.nanoTime();
      if (r.IlIiiIlill.equals(this.iIlIIiIllIIi)) {
         this.iIilIiIlilIi = -1;
         if (this.IIilIilIilIi >= s.IlililiIll - 1) {
            this.IIilIilIilIi = -1;
         }
      }

   }

   public void llIIlilIIl(iIIiliiIlIilii x, double button, double y, int stage) {
      if (stage == 0) {
         this.illiilIiliil.IilliliilIIi();
      }

   }

   private void IIllllIlll() {
      for(iIIiilllIlIiilll var2 : this.IIiiillIiiil.values()) {
         var2.IliIlllilIi();
      }

      this.IIiiillIiiil.clear();
      iilIIiiIIiIIii.lIiiIiIlilli();
      if (lIliiliIliil == this) {
         lIliiliIliil = null;
      }

   }

   private static String ilillIiill(String dropTags, boolean file, boolean dropAuthor) {
      long var10 = -1913385819736997959L;
      long var12 = -3133802211993370669L;
      String var3 = IIIillIIil(dropTags == null ? "" : dropTags);
      String var4 = var3;

      String var5;
      do {
         var5 = var4;
         var4 = var4.replaceAll(IliIlllilIi<invokedynamic>(), "");
      } while(!var4.equals(var5) && !var4.isEmpty());

      if (file) {
         Matcher var6 = lIIliliIIlil.matcher(var4);
         StringBuilder var7 = new StringBuilder();

         while(var6.find()) {
            var10 ^= (0L ^ var10) & -1L << 32;

            for(var10 ^= ((long)var6.start() ^ var10) & -1L >>> 32; (int)var10 < var6.end(); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
               if (Character.isLetter(var4.charAt((int)var10))) {
                  var10 += 4294967296L;
               }
            }

            var6.appendReplacement(var7, (int)(var10 >>> 32) >= 4 ? IliIlllilIi<invokedynamic>() : Matcher.quoteReplacement(var6.group()));
         }

         var6.appendTail(var7);
         if (var7.toString().trim().length() >= 3) {
            var4 = var7.toString();
         }
      }

      if (var4.indexOf(95) >= 0) {
         var4 = var4.replaceAll(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()).replace('_', ' ');
      }

      if (var4.indexOf(32) < 0) {
         var4 = var4.replace('-', ' ');
      }

      var4 = var4.replaceAll(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()).trim();
      if (dropAuthor) {
         Matcher var16 = ilIlilIiIlil.matcher(var4);
         if (var16.find() && !var16.group(1).equalsIgnoreCase(var16.group(2)) && !liIliliiIlil.contains(var16.group(2).toLowerCase(Locale.ROOT))) {
            String var17 = var4.substring(0, var16.end(1)).trim();
            if (var17.length() >= 3) {
               var4 = var17;
            }
         }
      }

      var12 ^= (0L ^ var12) & -1L << 32;

      for(var12 ^= ((long)var4.length() ^ var12) & -1L >>> 32; (int)(var12 >>> 32) < (int)var12 && IliIlllilIi<invokedynamic>().indexOf(var4.charAt((int)(var12 >>> 32))) >= 0; var12 += 4294967296L) {
      }

      while((int)var12 > (int)(var12 >>> 32) && IliIlllilIi<invokedynamic>().indexOf(var4.charAt((int)var12 - 1)) >= 0) {
         var12 ^= (var12 ^ var12 + (long)-1) & -1L >>> 32;
      }

      var4 = var4.substring((int)(var12 >>> 32), (int)var12);
      if (var4.isEmpty()) {
         return var3;
      } else {
         var10 ^= (0L ^ var10) & -1L << 32;

         for(var10 ^= (0L ^ var10) & -1L >>> 32; (int)var10 < var4.length() && (int)(var10 >>> 32) == 0; var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
            var10 ^= ((long)Character.isUpperCase(var4.charAt((int)var10)) << 32 ^ var10) & -1L << 32;
         }

         return (int)(var10 >>> 32) != 0 ? var4 : Character.toUpperCase(var4.charAt(0)) + var4.substring(1);
      }
   }

   protected Iiiiliiiiiii(class_437 manager, lIIiIiIiiIIiIiIi parent, String title) {
      super(manager, title);
      this.illiilIiliil = (new iIIllilIlIllil(35.0F, 26.0F, 1.0F, 0.45F, 12.0F, 80.0F)).IliIlllilIi(9.0F);
      this.liliiliiliil = new Matrix4f();
      this.IIiiillIiiil = new LinkedHashMap();
      this.iIiiilIliiil = this::iiiliIIIii;
      this.lliiililiiil = this::iIiliIlili;
      this.Iiiiilliiiil = this::lIIiiiIIii;
      this.iiiiilIIIIIi = () -> this.iiiliIIIii(-1);
      this.lIIIIiiIIIIi = () -> this.iiiliIIIii(1);
      this.IlIIIillIIIi = this::IlIiillIii;
      this.ilIIIiIiIIIi = new String[0];
      this.liIIIiiiIIIi = new String[0];
      this.IIlIIilIlIIi = List.of();
      this.iIlIIiIllIIi = "";
      this.lllIIiillIIi = "";
      this.IilIIililIIi = "";
      this.lIiIIiiIiIIi = -1;
      this.IlllIillllIi = -1.0F;
      this.IIilIilIilIi = -1;
      this.iIilIiIlilIi = -1;
      this.llilIiililIi = Integer.MIN_VALUE;
      this.IiilIiliilIi = -1;
      this.iiilIiIIIiIi = IliIlllilIi<invokedynamic>();
      this.ilIiIiIiIiIi = Integer.MIN_VALUE;
      this.liIiIiiiIiIi = -1;
      this.iiliIiIIiiIi = -1.0F;
      this.lIiiIiiIiiIi = -1.0F;
      this.iliiIiIiiiIi = -1;
      this.Illiilllliil = parent;
      this.Iillllilll(parent.IilliliilIIi());
      String var4 = parent.iliIiiliiiii() == null ? "" : parent.iliIiiliiiii();
      this.IilIIililIIi = var4;
      this.iIlIIiIllIIi = !var4.isEmpty() ? var4 : (this.ilIIIiIiIIIi.length > 0 ? this.ilIIIiIiIIIi[0] : "");
      this.lIiIIiiIiIIi = this.liilliiill(this.iIlIIiIllIIi);
      if (this.lIiIIiiIiIIi >= 0) {
         this.iiilllIIIill.Iilllilliill(this.lIiIIiiIiIIi, false);
      }

      if (!this.iIlIIiIllIIi.isEmpty() && (!this.iIlIIiIllIIi.equals(var4) || parent.lIiiIiIlilli() == null)) {
         this.iilIIiIIiIIi = this.iIlIIiIllIIi;
      }

   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 12 | (char)(var4[var5] + var5) << 4) - '휄') + var5) + '\uf1f7') + var5))) ^ var5) >>> 11 | (char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 12 | (char)(var4[var5] + var5) << 4) - '휄') + var5) + '\uf1f7') + var5))) ^ var5) << 5) + 10083))) << 3 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 12 | (char)(var4[var5] + var5) << 4) - '휄') + var5) + '\uf1f7') + var5))) ^ var5) >>> 11 | (char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 12 | (char)(var4[var5] + var5) << 4) - '휄') + var5) + '\uf1f7') + var5))) ^ var5) << 5) + 10083))) >>> 13) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void IiIilliIil() {
      long var6 = -1966281275851199948L;
      String var1 = this.Illiilllliil.iliIiiliiiii() == null ? "" : this.Illiilllliil.iliIiiliiiii();
      iIilliIlIlilliIl var2 = this.Illiilllliil.lIiiIiIlilli();
      var6 ^= ((long)this.iIIilIlIil() << 32 ^ var6) & -1L << 32;
      var6 ^= ((long)this.Iilililiiili() ^ var6) & -1L >>> 32;
      if (this.iilIIiIIiIIi == null && (int)(var6 >>> 32) == 0 && (int)var6 == 0 && var1.isEmpty() && var2 != null && this.lIiIIiiIiIIi >= 0 && !this.llIililIil(this.iIlIIiIllIIi)) {
         this.iilIIiIIiIIi = this.iIlIIiIllIIi;
      }

      if (this.iilIIiIIiIIi != null && (int)(var6 >>> 32) == 0 && (int)var6 == 0) {
         String var5 = this.iilIIiIIiIIi;
         this.iilIIiIIiIIi = null;
         if (!var5.equals(var1) || var2 == null) {
            this.Illiilllliil.IiIlliIliiIl(var5);
            var6 ^= (4294967296L ^ var6) & -1L << 32;
         }
      }

      if (!var1.equals(this.IilIIililIIi)) {
         this.IilIIililIIi = var1;
         if (!var1.isEmpty() && !var1.equals(this.iIlIIiIllIIi) && this.iilIIiIIiIIi == null && (int)(var6 >>> 32) == 0) {
            this.iiIilIIlil(var1);
         } else if (var1.isEmpty() && var2 == null && this.iilIIiIIiIIi == null && (int)(var6 >>> 32) == 0 && !this.iIlIIiIllIIi.isEmpty() && !this.llIililIil(this.iIlIIiIllIIi)) {
            this.lllIIiillIIi = this.iIlIIiIllIIi;
            this.iIlIIiIllIIi = "";
            this.lIiIIiiIiIIi = -1;
            this.iiilllIIIill.IIillIiliIil();
         }
      }

      if (var2 != null && this.iIlIIiIllIIi.equals(var1)) {
         this.lililiilil(this.illilIilil(this.iIlIIiIllIIi), var2);
      }

   }

   private void iIlIiIllIi(iIIiliiIlIilii stage, float y) {
      if (!(this.illlIiIillIi <= 0.004F)) {
         if (this.iiliIiIIiiIi < 0.0F) {
            this.iiliIiIIiiIi = lIlIIIliIlIIIl.IIlllIlliIll(IliIlllilIi<invokedynamic>(), 0.72F);
         }

         if (!(this.iiliIiIIiiIi > stage.IlIIlliIIl - 16.0F)) {
            float var3 = gg.corz.IliiIilliiIi.IilliliilIIi(this.illlIiIillIi);

            try {
               lIlIIIliIlIIIl.Illlllllilll(IliIlllilIi<invokedynamic>(), llilliilililliil.IIIllIIliIIl(stage.IliIlllilIi() - this.iiliIiIIiiIi / 2.0F), y, 10.0F, 0.72F, -7630437);
            } finally {
               gg.corz.IliiIilliiIi.lIiiIiIlilli(var3);
            }

         }
      }
   }

   private String IIililIili() {
      long var3 = -1577166952661859822L;
      var3 ^= ((long)Math.max(1, this.IiliIililiIi) << 32 ^ var3) & -1L << 32;
      var3 ^= ((long)(this.IIilIilIilIi < 0 ? (int)(var3 >>> 32) - 1 : Math.min(this.IIilIilIilIi, (int)(var3 >>> 32) - 1)) ^ var3) & -1L >>> 32;
      if ((int)var3 != this.llilIiililIi || (int)(var3 >>> 32) != this.IiilIiliilIi) {
         this.llilIiililIi = (int)var3;
         this.IiilIiliilIi = (int)(var3 >>> 32);
         this.iiilIiIIIiIi = (int)var3 >= (int)(var3 >>> 32) - 1 ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>() + ((int)var3 + 1) + IliIlllilIi<invokedynamic>() + (int)(var3 >>> 32);
      }

      return this.iiilIiIIIiIi;
   }

   public void IlIlllIlilIl(class_332 s, iIIiliiIlIilii ctx) {
      ilIiiiiIiIiiii.IilliliilIIi(s, 0, ctx.lIIIlliIIl, ctx.iIIIlliIIl, ctx.IlIIlliIIl, ctx.llIIlliIIl, ctx.IilIlliIIl);
      float var3 = ctx.IliIlllilIi();
      float var4 = ctx.liiiIIllIl() - ctx.llIIlliIIl * 0.03F;
      float var5 = ctx.IlIIlliIIl * 0.34F;
      float var6 = ctx.llIIlliIIl * 0.34F;
      IIIiiIillIIiiIil.IiIlliIliiIl(s, var3 - var5 / 2.0F, var4 - var6 / 2.0F, var5, var6, Math.min(var5, var6) / 2.0F, IilIIIIililIIIIi.IIlllIlliIll(0.07), Math.min(ctx.IlIIlliIIl, ctx.llIIlliIIl) * 0.22F, 1.0F);
   }

   private void iiiilIIIIi(float dt) {
      float var2 = this.illiilIiliil.IIillIiliIil();
      if (this.lillIiiillIi && this.IlllIillllIi > 0.0F && var2 != this.IlllIillllIi) {
         float var3 = 1.0F / var2 - 1.0F / this.IlllIillllIi;
         float var4 = this.iiIlIiIIllIi * var3;
         float var5 = this.lIllIiiIllIi * var3;
         this.IIIlIilIIlIi += var4;
         this.iIIlIiIlIlIi += var5;
         this.llIlIiilIlIi += var4;
         this.IiIlIiliIlIi += var5;
         this.lIIIiiIIIi();
      }

      if (var2 == this.illiilIiliil.Ililllililil()) {
         this.lillIiiillIi = false;
      }

      this.IlllIillllIi = var2;
      this.IIIlIilIIlIi = lliiiIliliiiIl.IIIllIIliIIl(this.IIIlIilIIlIi, this.llIlIiilIlIi, 20.0F, dt, 1.0E-4F);
      this.iIIlIiIlIlIi = lliiiIliliiiIl.IIIllIIliIIl(this.iIIlIiIlIlIi, this.IiIlIiliIlIi, 20.0F, dt, 1.0E-4F);
   }

   protected final String illliIilli() {
      return this.lIiIIiiIiIIi >= 0 && this.lIiIIiiIiIIi < this.liIIIiiiIIIi.length ? this.liIIIiiiIIIi[this.lIiIIiiIiIIi] : "";
   }

   private boolean lllllillll(List<String> list) {
      return list.equals(this.IIlIIilIlIIi);
   }

   public void IiIlliIliiIl(class_332 ctx, iIIiliiIlIilii stage) {
      long var10 = 2838214913219886654L;
      iIIiilllIlIiilll var3 = (iIIiilllIlIiilll)this.IIiiillIiiil.get(this.iIlIIiIllIIi);
      var10 ^= ((long)(var3 != null && var3.liIiiIlill != null && var3.IiIiiIlill != null && this.liiIiiiiIi() ? 1 : 0) << 32 ^ var10) & -1L << 32;
      float var5 = llilliilililliil.IIIllIIliIIl(stage.iIIIlliIIl + stage.llIIlliIIl - 6.0F - 13.0F);
      if ((int)(var10 >>> 32) != 0) {
         float var6 = var3.iiIiiIlill == 0L ? Float.MAX_VALUE : (float)(System.nanoTime() - var3.iiIiiIlill) / 1000000.0F;
         float var7 = var3.iiIiiIlill == 0L ? 1.0F : lliiiIliliiiIl.Iilililiiili(var6);
         float var8 = gg.corz.IliiIilliiIi.IilliliilIIi(var7);

         try {
            this.lilliiilli();
            this.lllIiillIi(ctx, stage, var3.IiIiiIlill.iIililiIll);
            this.IliIilliIi(ctx, stage, llilliilililliil.IIIllIIliIIl(stage.lIIIlliIIl + 6.0F), var5, 13.0F, var7 > 0.5F);
            this.lIiIiiIiIi(ctx, stage, var5, var7 > 0.5F);
         } finally {
            gg.corz.IliiIilliiIi.lIiiIiIlilli(var8);
         }
      }

      this.iIlIiIllIi(stage, (int)(var10 >>> 32) != 0 ? var5 - 13.0F : stage.iIIIlliIIl + stage.llIIlliIIl - 20.0F);
   }

   private void lililiilil(iIIiilllIlIiilll s, iIilliIlIlilliIl schematic) {
      if (s.llIiiIlill != schematic) {
         if (s.ilIiiIlill != null) {
            s.ilIiiIlill.IliIlllilIi();
         }

         s.llIiiIlill = schematic;
         s.IIliiIlill = false;

         try {
            s.ilIiiIlill = IiIlllllliIlllll.IliIlllilIi(schematic, IllliIIilllliIIi.IliIlllilIi());
         } catch (Throwable var4) {
            s.ilIiiIlill = null;
            s.IIliiIlill = true;
         }

      }
   }

   private boolean llIililIil(String file) {
      if (file != null && !file.isEmpty()) {
         String var2 = this.Illiilllliil.IIIllIIliIIl();
         if (var2 != null && var2.endsWith(file)) {
            return var2.startsWith(IliIlllilIi<invokedynamic>()) && var2.length() == IliIlllilIi<invokedynamic>().length() + file.length() || var2.startsWith(IliIlllilIi<invokedynamic>()) && var2.length() == IliIlllilIi<invokedynamic>().length() + file.length();
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void Iiiilliiil() {
      long var5 = 4535039680295749299L;
      iIIiilllIlIiilll var1 = (iIIiilllIlIiilll)this.IIiiillIiiil.get(this.iIlIIiIllIIi);
      if (var1 != null && var1.IiIiiIlill != null && var1.liIiiIlill != null) {
         var5 ^= ((long)var1.IiIiiIlill.IlililiIll << 32 ^ var5) & -1L << 32;
         if (this.IIilIilIilIi >= (int)(var5 >>> 32) - 1) {
            this.IIilIilIilIi = -1;
         }

         if (this.IIilIilIilIi < 0) {
            this.iIilIiIlilIi = -1;
         } else if (var1.IlliiIlill == this.IIilIilIilIi) {
            this.iIilIiIlilIi = this.IIilIilIilIi;
         } else {
            if (this.iIilIiIlilIi >= 0 && var1.IlliiIlill != this.iIilIiIlilIi) {
               this.iIilIiIlilIi = -1;
            }

            var5 ^= ((long)(var1.IiIiiIlill.llililiIll + this.IIilIilIilIi) ^ var5) & -1L >>> 32;
            if (var1.lIliiIlill == null || var1.lIliiIlill.iliIiiliiiii() != (int)var5) {
               if (var1.lIliiIlill != null) {
                  var1.lIliiIlill.IliIlllilIi();
               }

               try {
                  var1.lIliiIlill = IiIlllllliIlllll.liiiIIllIl(var1.IiIiiIlill.IIililiIll, (int)var5);
               } catch (Throwable var7) {
                  var1.lIliiIlill = null;
               }
            }

         }
      } else {
         this.iIilIiIlilIi = -1;
      }
   }

   public String iIlIlllllill() {
      if (!this.iIlIIiIllIIi.equals(this.IlIiIillIiIi) || this.lIiIIiiIiIIi != this.ilIiIiIiIiIi || this.ilIIIiIiIIIi.length != this.liIiIiiiIiIi) {
         this.IlIiIillIiIi = this.iIlIIiIllIIi;
         this.ilIiIiIiIiIi = this.lIiIIiiIiIIi;
         this.liIiIiiiIiIi = this.ilIIIiIiIIIi.length;
         iIilliIlIlilliIl var1 = this.Illiilllliil.lIiiIiIlilli();
         String var2;
         if (!this.iIlIIiIllIIi.isEmpty()) {
            var2 = IIIillIIil(this.iIlIIiIllIIi);
         } else if (var1 != null && var1.iliIiiiIll != null && !var1.iliIiiiIll.isBlank()) {
            var2 = var1.iliIiiiIll;
         } else {
            var2 = this.ilIIIiIiIIIi.length == 0 ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>();
         }

         this.lIIiIiiIIiIi = this.lIiIIiiIiIIi >= 0 && this.ilIIIiIiIIIi.length >= 2 ? var2 + IliIlllilIi<invokedynamic>() + (this.lIiIIiiIiIIi + 1) + IliIlllilIi<invokedynamic>() + this.ilIIIiIiIIIi.length : var2;
      }

      return this.lIIiIiiIIiIi;
   }

   private void IIlIilIlIi(class_332 ctx, iIIiliiIlIilii a, float stage) {
      long var13 = -3760107145721321568L;
      if (!(stage <= 0.002F)) {
         float var4 = gg.corz.IliiIilliiIi.IilliliilIIi(stage);

         try {
            float var5 = (float)(System.nanoTime() - this.iliIIiIiiIIi) / 1.0E9F;
            float var6 = a.IliIlllilIi();
            float var7 = a.liiiIIllIl() - 6.0F;

            for(long var17 = var13 ^ (0L ^ var13) & -1L << 32; (int)(var17 >>> 32) < 3; var17 += 4294967296L) {
               float var9 = 0.5F + 0.5F * (float)Math.sin((double)(var5 * 1.1F) * Math.PI * (double)2.0F - (double)((int)(var17 >>> 32)) * 0.7);
               float var10 = var6 + (float)((int)(var17 >>> 32) - 1) * 11.0F - 2.0F;
               float var11 = var7 - 2.0F - 1.5F * var9;
               IIIiiIillIIiiIil.IlIlllIlilIl(ctx, var10, var11, 4.0F, 4.0F, 2.0F, IilIIIIililIIIIi.IIlllIlliIll(0.3 + 0.7 * (double)var9));
            }

            if (this.lIiiIiiIiiIi < 0.0F) {
               this.lIiiIiiIiiIi = lIlIIIliIlIIIl.IIlllIlliIll(IliIlllilIi<invokedynamic>(), 0.82F);
            }

            lIlIIIliIlIIIl.Illlllllilll(IliIlllilIi<invokedynamic>(), llilliilililliil.IIIllIIliIIl(var6 - this.lIiiIiiIiiIi / 2.0F), var7 + 8.0F, 10.0F, 0.82F, -7630437);
         } finally {
            gg.corz.IliiIilliiIi.lIiiIiIlilli(var4);
         }

      }
   }

   private void lIIIiiIIIi() {
      iIIiilllIlIiilll var1 = (iIIiilllIlIiilll)this.IIiiillIiiil.get(this.iIlIIiIllIIi);
      if (var1 != null && var1.IiIiiIlill != null) {
         float var2 = ilIIliilIiIIliil.liiiIIllIl(var1.IiIiiIlill.ilililiIll, var1.IiIiiIlill.IiililiIll, var1.IiIiiIlill.liililiIll);
         this.llIlIiilIlIi = ilIIliilIiIIliil.iliIiiliiiii(this.llIlIiilIlIi, var2);
         this.IiIlIiliIlIi = ilIIliilIiIIliil.iliIiiliiiii(this.IiIlIiliIlIi, var2);
         this.IIIlIilIIlIi = ilIIliilIiIIliil.iliIiiliiiii(this.IIIlIilIIlIi, var2);
         this.iIIlIiIlIlIi = ilIIliilIiIIliil.iliIiiliiiii(this.iIIlIiIlIlIi, var2);
      }
   }

   private void IIiillIiil() {
      for(iIIiilllIlIiilll var2 : this.IIiiillIiiil.values()) {
         lliiIIIliliiIIIl var3 = var2.ilIiiIlill;
         if (var3 != null && var3.liiiIIllIl()) {
            var2.ilIiiIlill = null;
            if (!var3.iIlIlllllill()) {
               liIIliIliiIIliIl var4 = var3.iliIiiliiiii();
               if (var3.IilliliilIIi() == null && var4 != null) {
                  this.iIiilIliil(var2, var4);
               } else {
                  var2.IIliiIlill = true;
                  if (var3.IilliliilIIi() != null) {
                  }
               }
            }
         }

         lIlIlilliIlIlill var5 = var2.lIliiIlill;
         if (var5 != null && var5.liiiIIllIl()) {
            var2.lIliiIlill = null;
            if (!var5.iIlIlllllill() && var5.IIIllIIliIIl() != null && var2.IiIiiIlill != null) {
               this.lliililiil(var2, var5);
            }
         }
      }

   }

   private void lilliiilli() {
      String var1 = this.Illiilllliil.iliIiiliiiii() == null ? "" : this.Illiilllliil.iliIiiliiiii();
      iIilliIlIlilliIl var2 = this.Illiilllliil.lIiiIiIlilli();
      iIilliIlIlilliIl var3 = var2 != null && this.iIlIIiIllIIi.equals(var1) ? var2 : null;
      if (var3 != null && var3 != this.IIliIilIliIi) {
         this.IIliIilIliIi = var3;
         this.iIliIiIlliIi = var3.IiiIiiiIll + IliIlllilIi<invokedynamic>() + var3.liiIiiiIll + IliIlllilIi<invokedynamic>() + var3.iiiIiiiIll;
         this.llliIiilliIi = String.format(Locale.ROOT, IliIlllilIi<invokedynamic>(), var3.iIIliiiIll) + (var3.iIIliiiIll == 1 ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>());
      }

      iIIiilllIlIiilll var4 = (iIIiilllIlIiilll)this.IIiiillIiiil.get(this.iIlIIiIllIIi);
      if (var4 != null && var4.IiIiiIlill != null) {
         this.IiliIililiIi = var4.IiIiiIlill.IlililiIll;
      } else if (this.IIliIilIliIi != null) {
         this.IiliIililiIi = this.IIliIilIliIi.liiIiiiIll;
      }

   }

   public String Iilllilliill(int index) {
      return index >= 0 && index < this.liIIIiiiIIIi.length ? this.liIIIiiiIIIi[index] : "";
   }

   private void Illillllil() {
      this.IIIlIilIIlIi = this.iIIlIiIlIlIi = this.llIlIiilIlIi = this.IiIlIiliIlIi = 0.0F;
      this.lillIiiillIi = false;
      this.IIilIilIilIi = -1;
      this.iIilIiIlilIi = -1;
   }

   private void IlIiillIii() {
      this.Illiilllliil.IlIlllIlilIl();
   }

   protected final void lliliilili(int index) {
      if (index >= 0 && index < this.ilIIIiIiIIIi.length) {
         this.lIliliIlil(this.ilIIIiIiIIIi[index]);
         this.iiilllIIIill.Iilllilliill(this.lIiIIiiIiIIi, true);
      }
   }

   public float lIiiIiIlilli() {
      return 340.0F;
   }

   protected final String iIIliIlIli() {
      return this.iIlIIiIllIIi;
   }

   private iIIiilllIlIiilll illilIilil(String file) {
      iIIiilllIlIiilll var2 = (iIIiilllIlIiilll)this.IIiiillIiiil.get(file);
      if (var2 != null) {
         return var2;
      } else {
         if (this.IIiiillIiiil.size() >= 2) {
            Iterator var3 = this.IIiiillIiiil.entrySet().iterator();

            while(var3.hasNext() && this.IIiiillIiiil.size() >= 2) {
               Map.Entry var4 = (Map.Entry)var3.next();
               if (!((String)var4.getKey()).equals(this.iIlIIiIllIIi) && !((String)var4.getKey()).equals(this.lllIIiillIIi)) {
                  ((iIIiilllIlIiilll)var4.getValue()).IliIlllilIi();
                  var3.remove();
               }
            }

            if (this.IIiiillIiiil.size() >= 2) {
               var3 = this.IIiiillIiiil.entrySet().iterator();

               while(var3.hasNext() && this.IIiiillIiiil.size() >= 2) {
                  Map.Entry var7 = (Map.Entry)var3.next();
                  if (!((String)var7.getKey()).equals(this.iIlIIiIllIIi)) {
                     ((iIIiilllIlIiilll)var7.getValue()).IliIlllilIi();
                     var3.remove();
                  }
               }
            }
         }

         var2 = new iIIiilllIlIiilll(file);
         this.IIiiillIiiil.put(file, var2);
         return var2;
      }
   }

   protected final void Iiililiili() {
      this.iilIIiIIiIIi = null;
      if (!this.iIlIIiIllIIi.isEmpty()) {
         this.lllIIiillIIi = this.iIlIIiIllIIi;
         this.iIlIIiIllIIi = "";
         this.lIiIIiiIiIIi = -1;
         this.iiilllIIIill.IIillIiliIil();
      }
   }

   public static String iilllIIill(String file) {
      return Ilillllill(file, true);
   }

   private static String Ilillllill(String dropTags, boolean file) {
      return ilillIiill(dropTags, file, file);
   }

   private void iiiliIIIii(int dir) {
      long var4 = -2831443882364206537L;
      var4 ^= ((long)this.IiliIililiIi << 32 ^ var4) & -1L << 32;
      if ((int)(var4 >>> 32) > 1 && dir != 0) {
         var4 ^= ((long)(this.IIilIilIilIi < 0 ? (int)(var4 >>> 32) - 1 : this.IIilIilIilIi) ^ var4) & -1L >>> 32;
         var4 ^= ((long)Math.max(0, Math.min((int)(var4 >>> 32) - 1, (int)var4 + Integer.signum(dir))) ^ var4) & -1L >>> 32;
         this.IIilIilIilIi = (int)var4 >= (int)(var4 >>> 32) - 1 ? -1 : (int)var4;
      }
   }
}
