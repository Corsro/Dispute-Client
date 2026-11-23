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
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import net.minecraft.class_7833;

public final class iiilIiiIIIiIii implements iiiiIilIIIIlil {
   private static final float iIllIIiIIl = 10.0F;
   private float llIiIIiIIl;
   private final Map<String, Float> liilIIiIIl;
   private float iIIiIIiIIl;
   private static final int iiIlIIiIIl = 20;
   private static final float IlllIIiIIl = 6.0F;
   private static final float lIilIIiIIl = 4.0F;
   private static final float iIilIIiIIl = 0.04F;
   private float lIIiIIiIIl;
   private float IiIiIIiIIl;
   private static final float iillIIiIIl = 90.0F;
   private static final float IIilIIiIIl = 8.0F;
   private final Map<String, Boolean> llilIIiIIl;
   private static final float illlIIiIIl = 18.0F;
   private static final float llllIIiIIl = 26.0F;
   private float IIIiIIiIIl;
   private static final int lIllIIiIIl = -10000;
   private static final int IIllIIiIIl = 200;
   private final Map<String, liIliIliiIliIl> ililIIiIIl;
   private static final int llIlIIiIIl = 20;
   private float ilIiIIiIIl;
   private static final float lillIIiIIl = 0.82F;
   private static final float IillIIiIIl = 8.0F;
   private static final int IiIlIIiIIl = 32;
   private static final int ilIlIIiIIl = 24;
   private final Map<String, float[]> IiilIIiIIl;
   private final List<lllllillll> IlilIIiIIl;
   private IiiIllIlliiIllIl liIiIIiIIl;
   private static final int liIlIIiIIl = 44;
   private lllllillll iiIiIIiIIl;
   private final Map<String, Float> iiilIIiIIl;
   private float IlIiIIiIIl;

   private static void IIillIiliIil(lllllillll r, int w, int y, int x) {
      Object var4 = r.IiIIiilliIIiil;
      if (var4 instanceof iilIIIiIIiIIIi var5) {
         var5.IiIlliIliiIl(w, y, x, r.iiIIiilIIlIiil);
      } else if (var4 instanceof lIIiiIiiIIiiIi var6) {
         var6.IIIllIIliIIl(w, y, x, r.iiIIiilIIlIiil);
      } else if (var4 instanceof iilliilIIiliil var7) {
         var7.iliIiiliiiii(w, y, x, r.iiIIiilIIlIiil);
      } else if (var4 instanceof IillIIllillIIl var8) {
         var8.iliIiiliiiii(w, y, x, r.iiIIiilIIlIiil);
      } else if (var4 instanceof iiIlIIllIIllIIll var9) {
         var9.IiIlliIliiIl(w, y, x, r.iiIIiilIIlIiil);
      } else if (var4 instanceof illIIilIilIIil var10) {
         var10.IiIlliIliiIl(w, y, x, r.iiIIiilIIlIiil);
      } else if (var4 instanceof IiiIllIlliiIllIl var11) {
         var11.IIlllIlliIll(w, y, x, r.iiIIiilIIlIiil);
      }

   }

   private static void Ililllililil(class_332 my, lllllillll r, int mx, int ctx) {
      Object var4 = r.IiIIiilliIIiil;
      if (var4 instanceof iilIIIiIIiIIIi var5) {
         var5.IliIlllilIi(my, mx, ctx);
      } else if (var4 instanceof lIIiiIiiIIiiIi var6) {
         var6.liiiIIllIl(my, mx, ctx);
      } else if (var4 instanceof iilliilIIiliil var7) {
         var7.IliIlllilIi(my, mx, ctx);
      } else if (var4 instanceof IillIIllillIIl var8) {
         var8.IliIlllilIi(my, mx, ctx);
      } else if (var4 instanceof iiIlIIllIIllIIll var9) {
         var9.liiiIIllIl(my, mx, ctx);
      } else if (var4 instanceof illIIilIilIIil var10) {
         var10.liiiIIllIl(my, mx, ctx);
      } else if (var4 instanceof IiiIllIlliiIllIl var11) {
         var11.lIiiIiIlilli(my, mx, ctx);
      }

   }

   private static void IIlllIlliIll(class_2960 y, float degrees, float argb, float x, int icon) {
      class_4587 var5 = IIIiiIillIIiiIil.liiiIIllIl();
      float var6 = degrees + 4.0F;
      float var7 = argb + 4.0F;
      var5.method_22903();

      try {
         var5.method_46416(var6, var7, 0.0F);
         var5.method_22907(class_7833.field_40718.rotationDegrees(x));
         var5.method_46416(-var6, -var7, 0.0F);
         lIlIIIliIlIIIl.IIIilIIiiIIi(y, degrees, argb, 8.0F, icon);
      } finally {
         var5.method_22909();
      }

   }

   public void IilliliilIIi(class_332 ctx, iIIiliiIlIilii stage) {
      long var16 = 6680168117655468844L;
      long var18 = 4568931053456657024L;
      long var20 = 9076125762302419096L;
      long var14 = -6787838156974277117L;
      this.ilIiIIiIIl = stage.lIIIlliIIl + 10.0F;
      this.IiIiIIiIIl = stage.IlIIlliIIl - 20.0F;
      this.llIiIIiIIl = stage.iIIIlliIIl + 6.0F;
      this.IlIiIIiIIl = stage.llIIlliIIl - 12.0F;
      this.IIIiIIiIIl = lliiiIliliiiIl.IIIllIIliIIl(this.IIIiIIiIIl, this.lIIiIIiIIl, 18.0F, stage.illIlliIIl, 0.05F);
      this.iIIiIIiIIl = this.lIiiIiIlilli();
      this.Iilililiiili();
      var14 ^= ((long)Math.round(stage.ilIIlliIIl) << 32 ^ var14) & -1L << 32;
      var14 ^= ((long)Math.round(stage.liIIlliIIl) ^ var14) & -1L >>> 32;
      var16 ^= ((long)stage.iiIIlliIIl << 32 ^ var16) & -1L << 32;
      float var6 = this.llIiIIiIIl - llilliilililliil.IIIllIIliIIl(this.IIIiIIiIIl);
      this.iiilIIiIIl.clear();
      var16 ^= (0L ^ var16) & -1L >>> 32;

      for(long var27 = var18 ^ ((long)this.IlilIIiIIl.size() << 32 ^ var18) & -1L << 32; (int)var16 < (int)(var27 >>> 32); var16 ^= ((long)((int)var27) ^ var16) & -1L >>> 32) {
         String var9 = ((lllllillll)this.IlilIIiIIl.get((int)var16)).llIIiililIIiil;
         var27 ^= ((long)((int)var16) ^ var27) & -1L >>> 32;

         int var10000;
         int var10002;
         for(var20 ^= (0L ^ var20) & -1L << 32; (int)var27 < (int)(var27 >>> 32) && ((lllllillll)this.IlilIIiIIl.get((int)var27)).llIIiililIIiil.equals(var9); var20 ^= ((long)(var10000 + ((lllllillll)this.IlilIIiIIl.get(var10002)).iiIIiilIIlIiil) << 32 ^ var20) & -1L << 32) {
            var10000 = (int)(var20 >>> 32);
            var10002 = (int)var27;
            var27 ^= (var27 ^ var27 + (long)1) & -1L >>> 32;
         }

         float var12 = (Float)this.liilIIiIIl.getOrDefault(var9, 0.0F);
         this.iiilIIiIIl.put(var9, var6);
         this.IlIlllIlilIl(ctx, var9, var6, var12, (int)(var16 >>> 32) != 0 && (float)((int)var14) >= var6 && (float)((int)var14) < var6 + 20.0F && (float)((int)(var14 >>> 32)) >= this.ilIiIIiIIl && (float)((int)(var14 >>> 32)) <= this.ilIiIIiIIl + this.IiIiIIiIIl, stage.illIlliIIl);
         var6 += 20.0F;
         var20 ^= ((long)Math.round((float)((int)(var20 >>> 32)) * var12) ^ var20) & -1L >>> 32;
         this.iliIiiliiiii(ctx, stage, (int)var16, (int)var27, var6, (int)var20, var12, (int)(var16 >>> 32) != 0 ? (int)(var14 >>> 32) : -10000, (int)(var16 >>> 32) != 0 ? (int)var14 : -10000);
         var6 += (float)((int)var20);
      }

   }

   // $FF: synthetic method
   private static CallSite iiIIlIIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(-var4[var5]) >>> 14 | (char)(-var4[var5]) << 2))) - var5) + var5))) << 11 | (char)(-((char)((char)((char)(~((char)((char)(-var4[var5]) >>> 14 | (char)(-var4[var5]) << 2))) - var5) + var5))) >>> 5) - '聂') ^ 26768) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IIlilIliiIli(double my, double mx, int button) {
      if (this.iiIiIIiIIl != null) {
         Object var8 = this.iiIiIIiIIl.IiIIiilliIIiil;
         if (var8 instanceof iilliilIIiliil) {
            iilliilIIiliil var6 = (iilliilIIiliil)var8;
            var6.IilliliilIIi(my, mx, button);
         } else {
            var8 = this.iiIiIIiIIl.IiIIiilliIIiil;
            if (var8 instanceof IillIIllillIIl) {
               IillIIllillIIl var7 = (IillIIllillIIl)var8;
               var7.IilliliilIIi(my, mx, button);
            }
         }

         this.iiIiIIiIIl = null;
      }
   }

   private void iliIiiliiiii(class_332 to, iIIiliiIlIilii top, int t, int shown, float mx, int my, float stage, int ctx, int from) {
      long var17 = -1167785027008284896L;
      long var19 = -6244898619862127486L;
      var17 ^= ((long)(stage >= 1.0F ? 1 : 0) << 32 ^ var17) & -1L << 32;
      float var11 = (int)(var17 >>> 32) != 0 ? mx : mx - (float)Math.round(8.0F * (1.0F - stage));

      for(var17 ^= ((long)t ^ var17) & -1L >>> 32; (int)var17 < shown; var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32) {
         lllllillll var13 = (lllllillll)this.IlilIIiIIl.get((int)var17);
         var13.lIlIiiliIlIiil = var11;
         var13.IllIiillllIiil = (boolean)((int)(var17 >>> 32));
         var11 += (float)var13.iiIIiilIIlIiil;
      }

      if (my > 0) {
         if ((int)(var17 >>> 32) != 0) {
            for(long var26 = var17 ^ ((long)t ^ var17) & -1L >>> 32; (int)var26 < shown; var26 ^= (var26 ^ var26 + (long)1) & -1L >>> 32) {
               this.IIIllIIliIIl(to, (lllllillll)this.IlilIIiIIl.get((int)var26), top.iIIIlliIIl, top.iIIIlliIIl + top.llIIlliIIl, ctx, from);
            }

         } else {
            lIlIIIliIlIIIl.Iliilliiilii(to, this.ilIiIIiIIl - 4.0F, mx, this.IiIiIIiIIl + 8.0F, (float)my);
            float var12 = IliiIilliiIi.IilliliilIIi(stage);

            try {
               float var23 = Math.max(top.iIIIlliIIl, mx);
               float var14 = Math.min(top.iIIIlliIIl + top.llIIlliIIl, mx + (float)my);

               for(long var27 = var19 ^ ((long)t << 32 ^ var19) & -1L << 32; (int)(var27 >>> 32) < shown; var27 += 4294967296L) {
                  this.IIIllIIliIIl(to, (lllllillll)this.IlilIIiIIl.get((int)(var27 >>> 32)), var23, var14, -10000, -10000);
               }
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var12);
               to.method_44380();
            }

         }
      }
   }

   public String Iiiiliiiiiii(int index) {
      long var8 = 8589343885673029085L;
      var8 ^= (0L ^ var8) & -1L << 32;

      for(Map.Entry var4 : this.iiilIIiIIl.entrySet()) {
         int var10000 = (int)(var8 >>> 32);
         var8 += 4294967296L;
         if (var10000 == index) {
            float var5 = this.ilIiIIiIIl + this.IiIiIIiIIl / 2.0F;
            float var6 = (Float)var4.getValue() + 10.0F;
            var8 ^= ((long)this.Iiilliiliiil((double)var5, (double)var6, 0) ^ var8) & -1L >>> 32;
            return (String)var4.getKey() + llIIlilIIl<invokedynamic>() + Math.round(var5) + llIIlilIIl<invokedynamic>() + Math.round(var6) + llIIlilIIl<invokedynamic>() + (int)var8 + llIIlilIIl<invokedynamic>() + this.llilIIiIIl.get(var4.getKey());
         }
      }

      return llIIlilIIl<invokedynamic>() + index + llIIlilIIl<invokedynamic>() + this.iiilIIiIIl.size();
   }

   public iiilIiiIIIiIii(Map<String, List<IilliIllilliIl>> groups) {
      long var8 = 3603384291533210266L;
      super();
      this.IlilIIiIIl = new ArrayList();
      this.llilIIiIIl = new LinkedHashMap();
      this.ililIIiIIl = new HashMap();
      this.IiilIIiIIl = new HashMap();
      this.liilIIiIIl = new HashMap();
      this.iiilIIiIIl = new LinkedHashMap();
      var8 ^= (4294967296L ^ var8) & -1L << 32;

      for(Map.Entry var4 : groups.entrySet()) {
         this.llilIIiIIl.put((String)var4.getKey(), Boolean.valueOf((boolean)((int)(var8 >>> 32))));
         this.ililIIiIIl.put((String)var4.getKey(), new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 200, (int)(var8 >>> 32) != 0 ? (double)1.0F : (double)0.0F));
         var8 ^= (0L ^ var8) & -1L << 32;

         for(IilliIllilliIl var6 : (List)var4.getValue()) {
            lllllillll var7 = this.iIlIlllllill((String)var4.getKey(), var6);
            if (var7 != null) {
               this.IlilIIiIIl.add(var7);
            }
         }
      }

   }

   private void Iilililiiili() {
      float var1 = Math.max(0.0F, this.iIIiIIiIIl - this.IlIiIIiIIl);
      if (this.lIIiIIiIIl > var1) {
         this.lIIiIIiIIl = var1;
      }

      if (this.lIIiIIiIIl < 0.0F) {
         this.lIIiIIiIIl = 0.0F;
      }

      if (this.IIIiIIiIIl > var1) {
         this.IIIiIIiIIl = var1;
      }

   }

   private void IlIillIiilIi(Object keep) {
      for(lllllillll var3 : this.IlilIIiIIl) {
         Object var5 = var3.IiIIiilliIIiil;
         if (var5 instanceof illIIilIilIIil var4) {
            if (var4 != keep && var4.IIIllIIliIIl()) {
               var4.IlIlllIlilIl(false);
            }
         }
      }

   }

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6052636719943042363L ^ Long.rotateLeft(-5309752037536318418L, 30) ^ 7274962497526197374L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 3139359330797068389L ^ Long.rotateLeft(4862310408439892168L, 48) ^ 7589068489901014511L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -605968655170550226L ^ Long.rotateLeft(-1727894828886085724L, 48) ^ 6489342891052435465L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6911552274956566570L ^ Long.rotateLeft(-8250773969165995330L, 10) ^ 7853463247502255708L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 200571850525390714L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 136793915685361865L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6710412080773352755L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 8777707049738707374L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 1791205042594443823L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 7788313582089596824L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IiIIlliIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iiIIlIIlIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, lIlIliIlIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IllIllllIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(illIlIilIl<invokedynamic>());
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
   private static CallSite IllIllllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - '莓') << 5 | (char)(var4[var5] - '莓') >>> 11) - var5) ^ 28763) + '훅'))) - var5) ^ var5) << 1 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - '莓') << 5 | (char)(var4[var5] - '莓') >>> 11) - var5) ^ 28763) + '훅'))) - var5) ^ var5) >>> 15) - var5) - '숧') - 9684))) >>> 13 | (char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - '莓') << 5 | (char)(var4[var5] - '莓') >>> 11) - var5) ^ 28763) + '훅'))) - var5) ^ var5) << 1 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - '莓') << 5 | (char)(var4[var5] - '莓') >>> 11) - var5) ^ 28763) + '훅'))) - var5) ^ var5) >>> 15) - var5) - '숧') - 9684))) << 3) >>> 7 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - '莓') << 5 | (char)(var4[var5] - '莓') >>> 11) - var5) ^ 28763) + '훅'))) - var5) ^ var5) << 1 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - '莓') << 5 | (char)(var4[var5] - '莓') >>> 11) - var5) ^ 28763) + '훅'))) - var5) ^ var5) >>> 15) - var5) - '숧') - 9684))) >>> 13 | (char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - '莓') << 5 | (char)(var4[var5] - '莓') >>> 11) - var5) ^ 28763) + '훅'))) - var5) ^ var5) << 1 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - '莓') << 5 | (char)(var4[var5] - '莓') >>> 11) - var5) ^ 28763) + '훅'))) - var5) ^ var5) >>> 15) - var5) - '숧') - 9684))) << 3) << 9) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean Iiilliiliiil(double my, double button, int mx) {
      if (this.liIiIIiIIl != null) {
         IiiIllIlliiIllIl var10 = this.liIiIIiIIl;
         this.liIiIIiIIl = null;
         var10.IlIlllIlilIl(mx);
         return true;
      } else if (!(my < (double)(this.ilIiIIiIIl - 4.0F)) && !(my > (double)(this.ilIiIIiIIl + this.IiIiIIiIIl + 4.0F)) && !(button < (double)this.llIiIIiIIl) && !(button > (double)(this.llIiIIiIIl + this.IlIiIIiIIl))) {
         for(Map.Entry var7 : this.iiilIIiIIl.entrySet()) {
            float var8 = (Float)var7.getValue();
            if (button >= (double)var8 && button < (double)(var8 + 20.0F)) {
               if (mx == 0) {
                  this.Iilllilliill((String)var7.getKey());
               }

               this.IlIillIiilIi((Object)null);
               return true;
            }
         }

         for(lllllillll var11 : this.IlilIIiIIl) {
            if (var11.IllIiillllIiil && !(button < (double)var11.lIlIiiliIlIiil) && !(button >= (double)(var11.lIlIiiliIlIiil + (float)var11.iiIIiilIIlIiil))) {
               this.IlIillIiilIi(var11.IiIIiilliIIiil);
               if (!IIIilIIiiIIi(var11, my, button, mx)) {
                  return false;
               }

               if (var11.IiIIiilliIIiil instanceof iilliilIIiliil || var11.IiIIiilliIIiil instanceof IillIIllillIIl) {
                  this.iiIiIIiIIl = var11;
               }

               return true;
            }
         }

         this.IlIillIiilIi((Object)null);
         return false;
      } else {
         return false;
      }
   }

   private float lIiiIiIlilli() {
      long var8 = -4506034735011835387L;
      long var10 = -7220239664016695715L;
      float var1 = 0.0F;
      this.liilIIiIIl.clear();
      var8 ^= (0L ^ var8) & -1L << 32;

      for(long var13 = var8 ^ ((long)this.IlilIIiIIl.size() ^ var8) & -1L >>> 32; (int)(var13 >>> 32) < (int)var13; var13 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var13) & -1L << 32) {
         String var4 = ((lllllillll)this.IlilIIiIIl.get((int)(var13 >>> 32))).llIIiililIIiil;
         var10 ^= ((long)((int)(var13 >>> 32)) << 32 ^ var10) & -1L << 32;

         int var10000;
         int var10002;
         for(var10 ^= (0L ^ var10) & -1L >>> 32; (int)(var10 >>> 32) < (int)var13 && ((lllllillll)this.IlilIIiIIl.get((int)(var10 >>> 32))).llIIiililIIiil.equals(var4); var10 ^= ((long)(var10000 + ((lllllillll)this.IlilIIiIIl.get(var10002)).iiIIiilIIlIiil) ^ var10) & -1L >>> 32) {
            var10000 = (int)var10;
            var10002 = (int)(var10 >>> 32);
            var10 += 4294967296L;
         }

         float var7 = this.Illlllllilll(var4);
         this.liilIIiIIl.put(var4, var7);
         var1 += (float)(20 + Math.round((float)((int)var10) * var7));
      }

      return var1;
   }

   private void IlIlllIlilIl(class_332 hot, String y, float ctx, float dt, boolean label, float t) {
      float[] var7 = (float[])this.IiilIIiIIl.computeIfAbsent(y, (k) -> new float[1]);
      var7[0] = lliiiIliliiiIl.IIIllIIliIIl(var7[0], label ? 1.0F : 0.0F, label ? 16.0F : 11.0F, t, 0.002F);
      float var8 = var7[0];
      float var9 = IIIiiIillIIiiIil.Illlllllilll();
      if (var8 > 0.002F) {
         IIIiiIillIIiiIil.IlIlllIlilIl(hot, this.ilIiIIiIIl - 4.0F, ctx + 1.0F, this.IiIiIIiIIl + 8.0F, 18.0F, 5.0F, llilliilililliil.IIIIllIIIl(-1, 0.04F * var8));
      }

      float var10 = this.ilIiIIiIIl + 1.0F;
      IiIlliIliiIl(var10, llilliilililliil.IIIllIIliIIl(ctx + 10.0F - 4.0F), dt, IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)dt));
      lIlIIIliIlIIIl.Illlllllilll(y, var10 + 8.0F + 6.0F, ctx, 20.0F, 0.82F, IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)Math.max(var8, dt)));
      IIIiiIillIIiiIil.IilliliilIIi(hot, this.ilIiIIiIIl, llilliilililliil.IIIllIIliIIl(ctx + 20.0F - var9), this.IiIiIIiIIl, var9, IilIIIIililIIIIi.IIillIiliIil());
   }

   // $FF: synthetic method
   private static CallSite lIlIliIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)(-((char)(-((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + '\uf1b1') - var5) ^ var5))) << 12 | (char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + '\uf1b1') - var5) ^ var5))) >>> 4))) + '쁄') >>> 5 | (char)((char)(-((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + '\uf1b1') - var5) ^ var5))) << 12 | (char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + '\uf1b1') - var5) ^ var5))) >>> 4))) + '쁄') << 11) - 'ￄ') - 4073))))) >>> 15 | (char)(-((char)(-((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + '\uf1b1') - var5) ^ var5))) << 12 | (char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + '\uf1b1') - var5) ^ var5))) >>> 4))) + '쁄') >>> 5 | (char)((char)(-((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + '\uf1b1') - var5) ^ var5))) << 12 | (char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + '\uf1b1') - var5) ^ var5))) >>> 4))) + '쁄') << 11) - 'ￄ') - 4073))))) << 1))) ^ '\uf5b6'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void IiIlliIliiIl(float t, float x, float ink, int y) {
      if (!(ink <= 0.0F) && !(ink >= 1.0F)) {
         IIlllIlliIll(lIlIIiliIlIIil.IliIlllilIi(), t, x, 90.0F * ink, llilliilililliil.IIIIllIIIl(y, lliiiIliliiiIl.IliIlllilIi(2.0F - 2.0F * ink)));
         IIlllIlliIll(lIlIIiliIlIIil.IIlilIliiIli(), t, x, 90.0F * (ink - 1.0F), llilliilililliil.IIIIllIIIl(y, lliiiIliliiiIl.IliIlllilIi(2.0F * ink)));
      } else {
         lIlIIIliIlIIIl.IIIilIIiiIIi(ink >= 1.0F ? lIlIIiliIlIIil.IIlilIliiIli() : lIlIIiliIlIIil.IliIlllilIi(), t, x, 8.0F, y);
      }
   }

   private lllllillll iIlIlllllill(String s, IilliIllilliIl group) {
      if (group instanceof iiIiiilIIliiil var9) {
         return new lllllillll(s, new iilIIIiIIiIIIi(var9, 0, 0, 0, 20), 20);
      } else if (group instanceof ililliIiIiilliIi var8) {
         return new lllllillll(s, new lIIiiIiiIIiiIi(var8, 0, 0, 0, 24), 24);
      } else if (group instanceof iilliIlIIiliIl var7) {
         return new lllllillll(s, new iilliilIIiliil(var7, 0, 0, 0, 32), 32);
      } else if (group instanceof IIIIlilllIIIlill var6) {
         return new lllllillll(s, new IillIIllillIIl(var6, 0, 0, 0, 32), 32);
      } else if (group instanceof lliliIIiililiIIi var5) {
         return new lllllillll(s, new iiIlIIllIIllIIll(var5, 0, 0, 0, 24), 24);
      } else if (group instanceof IIiiIIIllIiiIIIl var4) {
         return new lllllillll(s, new illIIilIilIIil(var4, 0, 0, 0, 44), 44);
      } else if (group instanceof illlIlIlIillIlIl var3) {
         return new lllllillll(s, new IiiIllIlliiIllIl(var3, 0, 0, 0, 24, this), 24);
      } else {
         return null;
      }
   }

   public boolean IIiilIiiiIii(int key, int modifiers) {
      if (this.liIiIIiIIl != null) {
         IiiIllIlliiIllIl var7 = this.liIiIIiIIl;
         this.liIiIIiIIl = null;
         var7.IIIllIIliIIl(key);
         return true;
      } else {
         for(lllllillll var4 : this.IlilIIiIIl) {
            Object var6 = var4.IiIIiilliIIiil;
            if (var6 instanceof illIIilIilIIil) {
               illIIilIilIIil var5 = (illIIilIilIIil)var6;
               if (var5.IIIllIIliIIl()) {
                  return var5.IilliliilIIi(key, 0, modifiers);
               }
            }
         }

         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite illIlIilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) - var5) + var5) + 7632) ^ '\ue3e4') - var5) + var5) - var5) + var5) - 21866) + 17272) ^ '벪') + var5))))) ^ '놞') + '适'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean Iliilliiilii(int codepoint, int modifiers) {
      for(lllllillll var4 : this.IlilIIiIIl) {
         Object var6 = var4.IiIIiilliIIiil;
         if (var6 instanceof illIIilIilIIil var5) {
            if (var5.IIIllIIliIIl()) {
               return var5.lIiiIiIlilli((char)codepoint, modifiers);
            }
         }
      }

      return false;
   }

   public void IliIlllilIi(IiiIllIlliiIllIl component) {
      this.liIiIIiIIl = component;
   }

   public void Illillliilli(double amount) {
      this.lIIiIIiIIl -= (float)amount * 26.0F;
      this.Iilililiiili();
   }

   // $FF: synthetic method
   private static CallSite IiIIlliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) ^ 11952) - '貑') + var5) - 7262))) + var5) - 10614))) ^ var5) - 4724))) ^ '앷') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static boolean IIIilIIiiIIi(lllllillll b, double r, double mx, int my) {
      Object var6 = b.IiIIiilliIIiil;
      if (var6 instanceof iilIIIiIIiIIIi var13) {
         return var13.iliIiiliiiii(r, mx, my);
      } else if (var6 instanceof lIIiiIiiIIiiIi var12) {
         return var12.lIiiIiIlilli(r, mx, my);
      } else if (var6 instanceof iilliilIIiliil var11) {
         return var11.liiiIIllIl(r, mx, my);
      } else if (var6 instanceof IillIIllillIIl var10) {
         return var10.liiiIIllIl(r, mx, my);
      } else if (var6 instanceof iiIlIIllIIllIIll var9) {
         return var9.iliIiiliiiii(r, mx, my);
      } else if (var6 instanceof illIIilIilIIil var8) {
         return var8.iIlIlllllill(r, mx, my);
      } else if (var6 instanceof IiiIllIlliiIllIl var7) {
         return var7.iliIiiliiiii(r, mx, my);
      } else {
         return false;
      }
   }

   private float Illlllllilll(String group) {
      liIliIliiIliIl var2 = (liIliIliiIliIl)this.ililIIiIIl.get(group);
      if (var2 == null) {
         return (Boolean)this.llilIIiIIl.getOrDefault(group, false) ? 1.0F : 0.0F;
      } else {
         return lliiiIliliiiIl.IliIlllilIi((float)var2.iIlIlllllill());
      }
   }

   private void Iilllilliill(String group) {
      long var6 = 5901596462216828293L;
      var6 ^= ((long)(!(Boolean)this.llilIIiIIl.getOrDefault(group, false) ? 1 : 0) << 32 ^ var6) & -1L << 32;
      this.llilIIiIIl.put(group, Boolean.valueOf((boolean)((int)(var6 >>> 32))));
      liIliIliiIliIl var3 = (liIliIliiIliIl)this.ililIIiIIl.get(group);
      if (var3 != null) {
         var3.lIiiIiIlilli((int)(var6 >>> 32) != 0 ? (double)1.0F : (double)0.0F);
      }

      for(lllllillll var5 : this.IlilIIiIIl) {
         if (var5.llIIiililIIiil.equals(group)) {
            var5.IllIiillllIiil = false;
         }
      }

   }

   public void IIIIllIIIl() {
      this.liIiIIiIIl = null;
      this.iiIiIIiIIl = null;
      this.IlIillIiilIi((Object)null);
   }

   public boolean liiiIIllIl(IiiIllIlliiIllIl component) {
      return this.liIiIIiIIl == component;
   }

   public void IiIiliIiiiIi(double button, double my, int mx) {
      if (this.iiIiIIiIIl != null) {
         Object var8 = this.iiIiIIiIIl.IiIIiilliIIiil;
         if (var8 instanceof iilliilIIiliil) {
            iilliilIIiliil var6 = (iilliilIIiliil)var8;
            var6.iIlIlllllill(button, my, mx);
         } else {
            var8 = this.iiIiIIiIIl.IiIIiilliIIiil;
            if (var8 instanceof IillIIllillIIl) {
               IillIIllillIIl var7 = (IillIIllillIIl)var8;
               var7.iIlIlllllill(button, my, mx);
            }
         }

      }
   }

   private void IIIllIIliIIl(class_332 mx, lllllillll my, float hi, float lo, int ctx, int r) {
      IIillIiliIil(my, (int)this.ilIiIIiIIl, Math.round(my.lIlIiiliIlIiil), (int)this.IiIiIIiIIl);
      if (my.lIlIiiliIlIiil + (float)my.iiIIiilIIlIiil >= hi && my.lIlIiiliIlIiil <= lo) {
         Ililllililil(mx, my, ctx, r);
      }

   }
}
