package gg.corz;

import com.corz.client.CorzClient;
import com.google.gson.Gson;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.io.InputStream;
import java.io.InputStreamReader;
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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import org.joml.Matrix4f;

public final class IIlIiIlllIlIiIll {
   private boolean liiillilll;
   private float Iliillilll;
   private final String iIlillilll;
   private boolean iliillilll;
   private final class_2960 Illillilll;
   private IIlillilIlilli[] Iilillilll = new IIlillilIlilli[0];
   private boolean Iiiillilll;
   private static final Map<String, IIlIiIlllIlIiIll> lIlillilll = new HashMap();
   private final Map<Integer, IIlillilIlilli> lllillilll = new HashMap();
   private float iIiillilll;
   private final Map<Long, Float> illillilll = new HashMap();
   private int IIiillilll;
   private long[] lilillilll = new long[0];
   private class_1011 lliillilll;
   private int lIiillilll;
   private float[] iilillilll = new float[0];

   public static IIlIiIlllIlIiIll IliIlllilIi(String name) {
      return (IIlIiIlllIlIiIll)lIlillilll.computeIfAbsent(name, IIlIiIlllIlIiIll::new);
   }

   public static IIlIiIlllIlIiIll iliIiiliiiii() {
      return IliIlllilIi(llIIlilIIl<invokedynamic>());
   }

   private void IIIllIIliIIl() {
      long var17 = -3077524091243961190L;
      long var19 = -5078685669096287171L;
      long var21 = -5467173871646617103L;
      String var1 = llIIlilIIl<invokedynamic>() + this.iIlillilll + llIIlilIIl<invokedynamic>();
      InputStream var3 = IIlllIlliIll(var1 + llIIlilIIl<invokedynamic>());

      lIiiiiIiiIiiiiIi var2;
      try {
         if (var3 == null) {
            throw new IllegalStateException(llIIlilIIl<invokedynamic>() + var1 + llIIlilIIl<invokedynamic>());
         }

         var2 = (lIiiiiIiiIiiiiIi)(new Gson()).fromJson(new InputStreamReader(var3, StandardCharsets.UTF_8), lIiiiiIiiIiiiiIi.class);
      } catch (Throwable var26) {
         if (var3 != null) {
            try {
               var3.close();
            } catch (Throwable var23) {
               var26.addSuppressed(var23);
            }
         }

         throw var26;
      }

      if (var3 != null) {
         var3.close();
      }

      if (var2 != null && var2.IliliIIlIi != null && var2.lliliIIlIi != null && var2.ililiIIlIi != null) {
         this.Iliillilll = var2.lliliIIlIi.llliiIIill;
         this.iIiillilll = var2.lliliIIlIi.illiiIIill;
         float var27 = var2.IliliIIlIi.IllllIIlIi;
         float var4 = var2.IliliIIlIi.lllllIIlIi;

         for(illlliilIillliil var6 : var2.ililiIIlIi) {
            this.lllillilll.put(var6.IiIlIiilil, new IIlillilIlilli(var6, var27, var4));
         }

         if (var2.IiiliIIlIi != null) {
            for(iIIIlIIiIlIIlIIi var30 : var2.IiiliIIlIi) {
               this.illillilll.put(Illlllllilll(var30.IlliIlliil, var30.llliIlliil), var30.illiIlliil);
            }
         }

         InputStream var29 = IIlllIlliIll(var1 + llIIlilIIl<invokedynamic>());

         try {
            if (var29 == null) {
               throw new IllegalStateException(llIIlilIIl<invokedynamic>() + var1 + llIIlilIIl<invokedynamic>());
            }

            this.lliillilll = class_1011.method_4309(var29);
         } catch (Throwable var25) {
            if (var29 != null) {
               try {
                  var29.close();
               } catch (Throwable var24) {
                  var25.addSuppressed(var24);
               }
            }

            throw var25;
         }

         if (var29 != null) {
            var29.close();
         }

         var17 ^= (-4294967296L ^ var17) & -1L << 32;
         Iterator var31 = this.lllillilll.keySet().iterator();

         while(var31.hasNext()) {
            var17 ^= ((long)(Integer)var31.next() ^ var17) & -1L >>> 32;
            if ((int)var17 >= 0 && (int)var17 <= 65535 && (int)var17 > (int)(var17 >>> 32)) {
               var17 ^= ((long)((int)var17) << 32 ^ var17) & -1L << 32;
            }
         }

         IIlillilIlilli[] var32 = new IIlillilIlilli[(int)(var17 >>> 32) + 1];

         for(Map.Entry var8 : this.lllillilll.entrySet()) {
            var19 ^= ((long)(Integer)var8.getKey() << 32 ^ var19) & -1L << 32;
            if ((int)(var19 >>> 32) >= 0 && (int)(var19 >>> 32) <= 65535) {
               var32[(int)(var19 >>> 32)] = (IIlillilIlilli)var8.getValue();
            }
         }

         this.Iilillilll = var32;
         var17 ^= (0L ^ var17) & -1L >>> 32;

         for(long var9 : this.illillilll.keySet()) {
            if (var9 >>> 32 <= 65535L && (var9 & 4294967295L) <= 65535L) {
               var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32;
            }
         }

         for(var19 ^= (2L ^ var19) & -1L >>> 32; (int)var19 < (int)var17 * 2; var19 ^= ((long)((int)var19 << 1) ^ var19) & -1L >>> 32) {
         }

         long[] var34 = new long[(int)var19];
         float[] var10 = new float[(int)var19];
         Arrays.fill(var34, Long.MIN_VALUE);
         var21 ^= ((long)(64 - Integer.numberOfTrailingZeros((int)var19)) << 32 ^ var21) & -1L << 32;

         for(Map.Entry var13 : this.illillilll.entrySet()) {
            long var14 = (Long)var13.getKey();
            if (var14 >>> 32 <= 65535L && (var14 & 4294967295L) <= 65535L) {
               for(var21 ^= ((long)((int)(var14 * -7046029254386353131L >>> (int)(var21 >>> 32))) ^ var21) & -1L >>> 32; var34[(int)var21] != Long.MIN_VALUE; var21 ^= ((long)((int)var21 + 1 & (int)var19 - 1) ^ var21) & -1L >>> 32) {
               }

               var34[(int)var21] = var14;
               var10[(int)var21] = (Float)var13.getValue();
            }
         }

         this.lilillilll = var34;
         this.iilillilll = var10;
         this.IIiillilll = (int)(var21 >>> 32);
         this.lIiillilll = (int)var17;
         this.iliillilll = true;
      } else {
         throw new IllegalStateException(llIIlilIIl<invokedynamic>() + this.iIlillilll);
      }
   }

   public static IIlIiIlllIlIiIll liiiIIllIl() {
      return IliIlllilIi(llIIlilIIl<invokedynamic>());
   }

   public float Iiilliiliiil(String size, float text) {
      long var10 = 8790171246755030399L;
      long var12 = -7481857204341657070L;
      if (this.iliillilll && size != null && !size.isEmpty()) {
         float var3 = Ililllililil(text);
         float var4 = 0.0F;
         var10 ^= (-4294967296L ^ var10) & -1L << 32;

         for(var10 ^= (0L ^ var10) & -1L >>> 32; (int)var10 < size.length(); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
            var12 ^= ((long)size.charAt((int)var10) << 32 ^ var12) & -1L << 32;
            IIlillilIlilli var8 = this.IlIlllIlilIl((int)(var12 >>> 32));
            if (var8 == null) {
               var10 ^= ((long)((int)(var12 >>> 32)) << 32 ^ var10) & -1L << 32;
            } else {
               if ((int)(var10 >>> 32) != -1) {
                  var12 ^= ((long)this.IiIlliIliiIl(Illlllllilll((int)(var10 >>> 32), (int)(var12 >>> 32))) ^ var12) & -1L >>> 32;
                  if ((int)var12 >= 0) {
                     var4 += this.iilillilll[(int)var12] * var3;
                  }
               }

               var4 += var8.iillliIIIl * var3;
               var10 ^= ((long)((int)(var12 >>> 32)) << 32 ^ var10) & -1L << 32;
            }
         }

         return var4;
      } else {
         return 0.0F;
      }
   }

   public void Iliilliiilii(String size, float text, float argbL, int argbR, int x, float y) {
      long var24 = -742617672806149170L;
      long var26 = 1783491504022062764L;
      long var28 = 6906439111353187877L;
      if (this.IIillIiliIil() && size != null && !size.isEmpty()) {
         this.Iilllilliill();
         if (this.liiillilll) {
            float var7 = this.Iiilliiliiil(size, y);
            if (var7 <= 0.0F) {
               this.IIlilIliiIli(size, text, argbL, argbR, y);
            } else {
               class_4587 var8 = CorzClient.fontManager.liiiIIllIl();
               Matrix4f var9 = var8.method_23760().method_23761();
               float var10 = Ililllililil(y);
               float var11 = argbL + this.iIiillilll * var10;
               float var12 = text;
               var24 ^= (-4294967296L ^ var24) & -1L << 32;
               class_287 var14 = null;

               for(var24 ^= (0L ^ var24) & -1L >>> 32; (int)var24 < size.length(); var24 ^= (var24 ^ var24 + (long)1) & -1L >>> 32) {
                  var26 ^= ((long)size.charAt((int)var24) << 32 ^ var26) & -1L << 32;
                  IIlillilIlilli var17 = this.IlIlllIlilIl((int)(var26 >>> 32));
                  if (var17 == null) {
                     var24 ^= ((long)((int)(var26 >>> 32)) << 32 ^ var24) & -1L << 32;
                  } else {
                     if ((int)(var24 >>> 32) != -1) {
                        var26 ^= ((long)this.IiIlliIliiIl(Illlllllilll((int)(var24 >>> 32), (int)(var26 >>> 32))) ^ var26) & -1L >>> 32;
                        if ((int)var26 >= 0) {
                           var12 += this.iilillilll[(int)var26] * var10;
                        }
                     }

                     if (var17.IliIlllilIi()) {
                        if (var14 == null) {
                           var14 = class_289.method_1348().method_60827(class_5596.field_27382, class_290.field_1575);
                        }

                        float var19 = var11 - var17.lillliIIIl * var10;
                        float var20 = var17.illlliIIIl * var10;
                        float var21 = var17.IillliIIIl * var10;
                        long var33 = var28 ^ ((long)IIIIllIIIl(argbR, x, (var12 - text) / var7) << 32 ^ var28) & -1L << 32;
                        var28 = var33 ^ ((long)IIIIllIIIl(argbR, x, (var12 + var20 - text) / var7) ^ var33) & -1L >>> 32;
                        Iiiiliiiiiii(var14, var9, var12, var19 + var21, var17.lIllliIIIl, var17.llllliIIIl, (int)(var28 >>> 32));
                        Iiiiliiiiiii(var14, var9, var12 + var20, var19 + var21, var17.iIllliIIIl, var17.llllliIIIl, (int)var28);
                        Iiiiliiiiiii(var14, var9, var12 + var20, var19, var17.iIllliIIIl, var17.IlllliIIIl, (int)var28);
                        Iiiiliiiiiii(var14, var9, var12, var19, var17.lIllliIIIl, var17.IlllliIIIl, (int)(var28 >>> 32));
                     }

                     var12 += var17.iillliIIIl * var10;
                     var24 ^= ((long)((int)(var26 >>> 32)) << 32 ^ var24) & -1L << 32;
                  }
               }

               if (var14 != null) {
                  IliiIilliiIi.llIIlilIIl(var14.method_60800(), this.Illillilll);
               }

            }
         }
      }
   }

   // $FF: synthetic method
   private static CallSite iiIIlIIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 8 | (char)(-var4[var5]) << 8) + var5) ^ '锱') ^ '\ue9ff') - var5) - var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 8 | (char)(-var4[var5]) << 8) + var5) ^ '锱') ^ '\ue9ff') - var5) - var5) << 12) - '龷') + var5) + var5) + var5) - var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 8 | (char)(-var4[var5]) << 8) + var5) ^ '锱') ^ '\ue9ff') - var5) - var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 8 | (char)(-var4[var5]) << 8) + var5) ^ '锱') ^ '\ue9ff') - var5) - var5) << 12) - '龷') + var5) + var5) + var5) - var5) << 4) + 1035) - '脙') ^ '\uf366') + '\uee07'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void Iiiiliiiiiii(class_287 argb, Matrix4f v, float y, float u, float m, float x, int buf) {
      float var7 = (float)(buf >>> 24 & 255) / 255.0F * IliiIilliiIi.ilIlllIIlIiIlllIIl;
      argb.method_22918(v, y, u, 0.0F).method_22913(m, x).method_22915((float)(buf >> 16 & 255) / 255.0F, (float)(buf >> 8 & 255) / 255.0F, (float)(buf & 255) / 255.0F, var7);
   }

   public float IIIilIIiiIIi(char size, float c) {
      if (!this.iliillilll) {
         return 0.0F;
      } else {
         IIlillilIlilli var3 = this.IlIlllIlilIl(size);
         if (var3 == null) {
            return 0.0F;
         } else {
            float var4 = 0.0F;
            var4 += var3.iillliIIIl * Ililllililil(c);
            return var4;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite IllIllllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(~var4[var5]))) - var5) - 20335) + 'ꃺ'))) + 6219) - 3831) >>> 8 | (char)((char)((char)(-((char)((char)((char)((char)(-((char)(~var4[var5]))) - var5) - 20335) + 'ꃺ'))) + 6219) - 3831) << 8) + 16634) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static IIlIiIlllIlIiIll lIiiIiIlilli() {
      return IliIlllilIi(llIIlilIIl<invokedynamic>());
   }

   private class_287 IIiilIiiiIii(class_287 g, Matrix4f to, String baseline, int a, int b, float x, float text, float s, float from, float r, float matrix, float buf) {
      long var22 = -3904156584467749860L;
      long var24 = 6668589244076766581L;
      float var13 = x;
      var22 ^= (-4294967296L ^ var22) & -1L << 32;

      for(var22 ^= ((long)a ^ var22) & -1L >>> 32; (int)var22 < b; var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32) {
         var24 ^= ((long)baseline.charAt((int)var22) << 32 ^ var24) & -1L << 32;
         IIlillilIlilli var17 = this.IlIlllIlilIl((int)(var24 >>> 32));
         if (var17 == null) {
            var22 ^= ((long)((int)(var24 >>> 32)) << 32 ^ var22) & -1L << 32;
         } else {
            if ((int)(var22 >>> 32) != -1) {
               var24 ^= ((long)this.IiIlliIliiIl(Illlllllilll((int)(var22 >>> 32), (int)(var24 >>> 32))) ^ var24) & -1L >>> 32;
               if ((int)var24 >= 0) {
                  var13 += this.iilillilll[(int)var24] * s;
               }
            }

            if (var17.IliIlllilIi()) {
               if (g == null) {
                  g = class_289.method_1348().method_60827(class_5596.field_27382, class_290.field_1575);
               }

               float var19 = text - var17.lillliIIIl * s;
               float var20 = var17.illlliIIIl * s;
               float var21 = var17.IillliIIIl * s;
               g.method_22918(to, var13, var19 + var21, 0.0F).method_22913(var17.lIllliIIIl, var17.llllliIIIl).method_22915(from, r, matrix, buf);
               g.method_22918(to, var13 + var20, var19 + var21, 0.0F).method_22913(var17.iIllliIIIl, var17.llllliIIIl).method_22915(from, r, matrix, buf);
               g.method_22918(to, var13 + var20, var19, 0.0F).method_22913(var17.iIllliIIIl, var17.IlllliIIIl).method_22915(from, r, matrix, buf);
               g.method_22918(to, var13, var19, 0.0F).method_22913(var17.lIllliIIIl, var17.IlllliIIIl).method_22915(from, r, matrix, buf);
            }

            var13 += var17.iillliIIIl * s;
            var22 ^= ((long)((int)(var24 >>> 32)) << 32 ^ var22) & -1L << 32;
         }
      }

      return g;
   }

   private int IiIlliIliiIl(long key) {
      long var8 = 1986588519388659359L;
      if (this.lIiillilll == 0) {
         return -1;
      } else {
         long[] var3 = this.lilillilll;
         var8 ^= ((long)(var3.length - 1) << 32 ^ var8) & -1L << 32;
         var8 ^= ((long)((int)(key * -7046029254386353131L >>> this.IIiillilll)) ^ var8) & -1L >>> 32;

         while(true) {
            long var6 = var3[(int)var8];
            if (var6 == key) {
               return (int)var8;
            }

            if (var6 == Long.MIN_VALUE) {
               return -1;
            }

            var8 ^= ((long)((int)var8 + 1 & (int)(var8 >>> 32)) ^ var8) & -1L >>> 32;
         }
      }
   }

   private IIlillilIlilli IlIlllIlilIl(int cp) {
      return cp < this.Iilillilll.length ? this.Iilillilll[cp] : null;
   }

   public static IIlIiIlllIlIiIll iIlIlllllill() {
      return IliIlllilIi(llIIlilIIl<invokedynamic>());
   }

   public void Illillliilli(String n, float[] size, int text, float argb, int y, float xs) {
      long var17 = -5062521879920636658L;
      if (this.IIillIiliIil() && n != null && text > 0) {
         this.Iilllilliill();
         if (this.liiillilll) {
            class_4587 var7 = CorzClient.fontManager.liiiIIllIl();
            Matrix4f var8 = var7.method_23760().method_23761();
            float var9 = Ililllililil(xs);
            float var10 = (float)(y >>> 24 & 255) / 255.0F * IliiIilliiIi.ilIlllIIlIiIlllIIl;
            float var11 = (float)(y >> 16 & 255) / 255.0F;
            float var12 = (float)(y >> 8 & 255) / 255.0F;
            float var13 = (float)(y & 255) / 255.0F;
            float var14 = argb + this.iIiillilll * var9;
            class_287 var15 = null;

            for(long var19 = var17 ^ (0L ^ var17) & -1L << 32; (int)(var19 >>> 32) < text; var19 += 4294967296L) {
               var15 = this.IIiilIiiiIii(var15, var8, n, (int)(var19 >>> 32), (int)(var19 >>> 32) + 1, size[(int)(var19 >>> 32)], var14, var9, var11, var12, var13, var10);
            }

            if (var15 != null) {
               IliiIilliiIi.llIIlilIIl(var15.method_60800(), this.Illillilll);
            }

         }
      }
   }

   private static float Ililllililil(float size) {
      return size * 0.5F;
   }

   private static long Illlllllilll(int l, int r) {
      return (long)l << 32 | (long)r & 4294967295L;
   }

   private IIlIiIlllIlIiIll(String name) {
      this.iIlillilll = name;
      this.Illillilll = class_2960.method_60655(llIIlilIIl<invokedynamic>(), llIIlilIIl<invokedynamic>() + name);

      try {
         this.IIIllIIliIIl();
      } catch (Throwable var3) {
         this.Iiiillilll = true;
         var3.printStackTrace();
      }

   }

   // $FF: synthetic method
   private static CallSite illIlIilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(~((char)((char)((char)(var4[var5] - var5) ^ 647) - var5))))) - 756))) >>> 8 | (char)(~((char)((char)(-((char)(~((char)((char)((char)(var4[var5] - var5) ^ 647) - var5))))) - 756))) << 8) + var5) - 11928) + var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static int IIIIllIIIl(int c2, int t, float c1) {
      long var17 = 7866160525439960809L;
      long var11 = -2979665421221713809L;
      long var13 = 1290806166937026123L;
      long var15 = 4441974274336168191L;
      c1 = c1 < 0.0F ? 0.0F : (c1 > 1.0F ? 1.0F : c1);
      var11 ^= ((long)(c2 >>> 24 & 255) << 32 ^ var11) & -1L << 32;
      var11 ^= ((long)(c2 >> 16 & 255) ^ var11) & -1L >>> 32;
      var13 ^= ((long)(c2 >> 8 & 255) << 32 ^ var13) & -1L << 32;
      var13 ^= ((long)(c2 & 255) ^ var13) & -1L >>> 32;
      var15 ^= ((long)(t >>> 24 & 255) << 32 ^ var15) & -1L << 32;
      var15 ^= ((long)(t >> 16 & 255) ^ var15) & -1L >>> 32;
      var17 ^= ((long)(t >> 8 & 255) << 32 ^ var17) & -1L << 32;
      var17 ^= ((long)(t & 255) ^ var17) & -1L >>> 32;
      return (int)((float)((int)(var11 >>> 32)) + (float)((int)(var15 >>> 32) - (int)(var11 >>> 32)) * c1) << 24 | (int)((float)((int)var11) + (float)((int)var15 - (int)var11) * c1) << 16 | (int)((float)((int)(var13 >>> 32)) + (float)((int)(var17 >>> 32) - (int)(var13 >>> 32)) * c1) << 8 | (int)((float)((int)var13) + (float)((int)var17 - (int)var13) * c1);
   }

   private void Iilllilliill() {
      if (!this.liiillilll && this.lliillilll != null) {
         class_1043 var1 = new class_1043(() -> llIIlilIIl<invokedynamic>() + this.iIlillilll, this.lliillilll);
         class_310.method_1551().method_1531().method_4616(this.Illillilll, var1);
         this.liiillilll = true;
      }
   }

   // $FF: synthetic method
   private static CallSite IiIIlliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)((char)((char)(-((char)(var4[var5] - 20748))) - '鿎') ^ 3121) << 3 | (char)((char)((char)(-((char)(var4[var5] - 20748))) - '鿎') ^ 3121) >>> 13))))) << 1 | (char)(~((char)(-((char)((char)((char)((char)(-((char)(var4[var5] - 20748))) - '鿎') ^ 3121) << 3 | (char)((char)((char)(-((char)(var4[var5] - 20748))) - '鿎') ^ 3121) >>> 13))))) >>> 15) ^ var5))) + '큠') - '雋') + var5) ^ var5))) - '뤋'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lIlIliIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ var5) + var5) - 25492) >>> 11 | (char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ var5) + var5) - 25492) << 5))) >>> 8 | (char)(-((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ var5) + var5) - 25492) >>> 11 | (char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ var5) + var5) - 25492) << 5))) << 8) - '\ue045') + var5) - 13189) + '\ufbd1') ^ var5) + 28117) ^ var5) ^ 9798));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IIlilIliiIli(String text, float size, float x, int y, float argb) {
      if (this.IIillIiliIil() && text != null && !text.isEmpty()) {
         this.Iilllilliill();
         if (this.liiillilll) {
            class_4587 var6 = CorzClient.fontManager.liiiIIllIl();
            Matrix4f var7 = var6.method_23760().method_23761();
            float var8 = Ililllililil(argb);
            float var9 = (float)(y >>> 24 & 255) / 255.0F * IliiIilliiIi.ilIlllIIlIiIlllIIl;
            float var10 = (float)(y >> 16 & 255) / 255.0F;
            float var11 = (float)(y >> 8 & 255) / 255.0F;
            float var12 = (float)(y & 255) / 255.0F;
            float var13 = x + this.iIiillilll * var8;
            class_287 var14 = this.IIiilIiiiIii((class_287)null, var7, text, 0, text.length(), size, var13, var8, var10, var11, var12, var9);
            if (var14 != null) {
               IliiIilliiIi.llIIlilIIl(var14.method_60800(), this.Illillilll);
            }

         }
      }
   }

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1880929481860142798L ^ Long.rotateLeft(-2175365868744252758L, 60) ^ 7365866705782716603L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8888796341387896801L ^ Long.rotateLeft(-3066636170688658026L, 53) ^ -1602080390930387284L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 1735305122658371521L ^ Long.rotateLeft(8435294372426432798L, 20) ^ -759799592397957395L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4658852233233388963L ^ Long.rotateLeft(2362963294772006034L, 58) ^ -702236024490131099L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4848286170009006010L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8305958826258617133L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7178089526928958604L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -4381345000404154471L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -4723913872633493168L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1502482510202926381L;
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

   public void Iilililiiili(String[] size, float[] argbs, float[] texts, int[] xs, int n, float ys) {
      long var19 = -591046821501329625L;
      if (this.IIillIiliIil()) {
         class_4587 var7 = CorzClient.fontManager.liiiIIllIl();
         Matrix4f var8 = var7.method_23760().method_23761();
         float var9 = Ililllililil(ys);
         class_287 var10 = null;

         for(long var21 = var19 ^ (0L ^ var19) & -1L << 32; (int)(var21 >>> 32) < n; var21 += 4294967296L) {
            String var12 = size[(int)(var21 >>> 32)];
            if (var12 != null && !var12.isEmpty()) {
               this.Iilllilliill();
               if (!this.liiillilll) {
                  break;
               }

               var21 ^= ((long)xs[(int)(var21 >>> 32)] ^ var21) & -1L >>> 32;
               float var14 = (float)((int)var21 >>> 24 & 255) / 255.0F * IliiIilliiIi.ilIlllIIlIiIlllIIl;
               float var15 = (float)((int)var21 >> 16 & 255) / 255.0F;
               float var16 = (float)((int)var21 >> 8 & 255) / 255.0F;
               float var17 = (float)((int)var21 & 255) / 255.0F;
               float var18 = texts[(int)(var21 >>> 32)] + this.iIiillilll * var9;
               var10 = this.IIiilIiiiIii(var10, var8, var12, 0, var12.length(), argbs[(int)(var21 >>> 32)], var18, var9, var15, var16, var17, var14);
            }
         }

         if (var10 != null) {
            IliiIilliiIi.llIIlilIIl(var10.method_60800(), this.Illillilll);
         }

      }
   }

   public boolean IIillIiliIil() {
      return this.iliillilll && !this.Iiiillilll;
   }

   public float IlIillIiilIi(float size) {
      return this.Iliillilll * Ililllililil(size);
   }

   private static InputStream IIlllIlliIll(String p) {
      return CorzClient.class.getClassLoader().getResourceAsStream(p);
   }

   public static IIlIiIlllIlIiIll IilliliilIIi() {
      return IliIlllilIi(llIIlilIIl<invokedynamic>());
   }

   public float IiIiliIiiiIi(float size) {
      return this.iIiillilll * Ililllililil(size);
   }
}
