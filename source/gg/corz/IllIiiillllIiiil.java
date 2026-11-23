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
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IllIiiillllIiiil {
   public static final float IiIIIlIiil = 0.34F;
   public static final float iiiiiIIiil = 0.3F;
   public static final float iIliiIIiil = 30.0F;
   public static final float IlliiIIiil = 60.0F;
   public static final float lIiiiIIiil = 15.0F;
   public static final float liiiiIIiil = 1.0E-4F;
   public static final float IlIIIlIiil = 0.3F;
   public static final float iIIIIlIiil = 0.62F;
   private static final Map<String, List<iIiiiilIliiiil>> iIlIIlIiil = new HashMap();
   public static final float IIIIIlIiil = 0.46F;
   public static final float lIIIIlIiil = 0.4F;
   static final String[] IIlIIlIiil = new String[]{IlIillIiilIi<invokedynamic>(), IlIillIiilIi<invokedynamic>(), IlIillIiilIi<invokedynamic>()};
   public static final float iIiiiIIiil = 90.0F;
   public static final float liliiIIiil = 0.15F;
   public static final float liIIIlIiil = 0.46F;
   public static final float iiliiIIiil = 3.0F;
   public static final float llliiIIiil = 300.0F;
   private static lIIiilIliIIiilIl lIlIIlIiil;
   public static final float ilIIIlIiil = 0.24F;
   public static final float lliiiIIiil = 0.04F;
   public static final float IiliiIIiil = 2400.0F;
   public static final int iiIIIlIiil = 16;
   public static final float IiiiiIIiil = 0.06F;
   public static final float iliiiIIiil = 0.07F;
   public static final float illiiIIiil = 450.0F;
   public static final float IIiiiIIiil = 4.0F;
   public static final float IliiiIIiil = 0.035F;
   public static final float llIIIlIiil = 0.48F;

   static float Iiilliiliiil(float a, float t, float b) {
      return a + (t - a) * b;
   }

   private static void IiIlliIliiIl(float[] out, float[] s, float[] b, float[] handle, boolean start, int peak, int h, float stopped, boolean end, List<iIlIIiiIllIIii> t) {
      float var10 = handle[h];
      int var11 = h;
      int var12 = h;

      for(int var13 = peak + 1; var13 <= h; ++var13) {
         if (Math.abs(handle[var13] - var10) <= 3.0F) {
            var11 = var13;
            break;
         }
      }

      int var16 = peak + 1;

      for(int var14 = peak + 1; var14 <= h; ++var14) {
         if (IIillIiliIil(out, handle, var14) >= stopped) {
            var16 = var14;
            break;
         }
      }

      for(int var17 = var16; var17 < h; ++var17) {
         if (IIillIiliIil(out, handle, var17 + 1) < 0.15F * stopped) {
            var12 = var17;
            break;
         }
      }

      int var18 = Math.min(var11, var12);
      if (start) {
         if (Math.abs(Ililllililil(var10)) <= 4.0F) {
            t.add(new iIlIIiiIllIIii(out[var11], ilIIIIIiIiIIIIIi.IlIiliIiil, stopped));
         } else if (stopped >= 450.0F && Math.abs(Ililllililil(s[var11] - b[var11] - 180.0F)) <= 15.0F) {
            t.add(new iIlIIiiIllIIii(out[var11], ilIIIIIiIiIIIIIi.iIIiliIiil, stopped));
         } else if (stopped >= 450.0F && end) {
            t.add(new iIlIIiiIllIIii(out[var18], ilIIIIIiIiIIIIIi.IIIiliIiil, stopped));
         }

         if (stopped >= 450.0F && Math.abs(var10 - handle[peak]) >= 90.0F) {
            for(int var15 = peak + 1; var15 <= h; ++var15) {
               if (IIillIiliIil(out, handle, var15) >= 450.0F) {
                  t.add(new iIlIIiiIllIIii(out[var15 - 1], ilIIIIIiIiIIIIIi.iiilliIiil, stopped));
                  break;
               }
            }
         }
      } else if (stopped >= 450.0F) {
         t.add(new iIlIIiiIllIIii(out[var18], ilIIIIIiIiIIIIIi.lIIiliIiil, stopped));
      }

   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 8383562629189189652L ^ Long.rotateLeft(-2462599231941646209L, 49) ^ 7898027400317005015L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7439516201326406922L ^ Long.rotateLeft(9209857854356668471L, 45) ^ 7286643515816283997L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -728991791671293096L ^ Long.rotateLeft(3385762889460210764L, 44) ^ -1010401727102841241L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 5997028384601874131L ^ Long.rotateLeft(-3245699607636811834L, 2) ^ 8594704895418643370L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8007880649161344681L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 9196951893788604805L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -2795186966479125007L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5990101790049569508L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5768043636776601923L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2369671989251488949L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IiIiliIiiiIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIlilIliiIli<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Illillliilli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Iilililiiili<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIiilIiiiIii<invokedynamic>());
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
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ 22767) - 31524))) - 30487) >>> 9 | (char)((char)(~((char)((char)(var4[var5] ^ 22767) - 31524))) - 30487) << 7) >>> 5 | (char)((char)((char)(~((char)((char)(var4[var5] ^ 22767) - 31524))) - 30487) >>> 9 | (char)((char)(~((char)((char)(var4[var5] ^ 22767) - 31524))) - 30487) << 7) << 11) + var5) ^ var5) - var5) - '\uf652') ^ 22476))) - '\ud99f'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static float[] lIiiIiIlilli(lIIiilIliIIiilIl model, lliIiiililiIiiil clip) {
      ArrayList var2 = new ArrayList();

      for(String var6 : IIlIIlIiil) {
         int var7 = model.IiIlliIliiIl(var6);
         if (var7 >= 0 && var7 < clip.IilliliilIIi().length && clip.IilliliilIIi()[var7][1] != null) {
            for(float var11 : clip.IilliliilIIi()[var7][1].IilliliilIIi()) {
               if (var11 >= 0.0F && var11 <= clip.iIlIlllllill()) {
                  var2.add(var11);
               }
            }
         }
      }

      var2.add(0.0F);
      var2.add(clip.iIlIlllllill());
      var2.sort(Float::compare);
      ArrayList var12 = new ArrayList();

      for(float var15 : var2) {
         if (var12.isEmpty() || var15 - (Float)var12.get(var12.size() - 1) > 1.0E-4F) {
            var12.add(var15);
         }
      }

      float[] var14 = new float[var12.size()];

      for(int var16 = 0; var16 < var14.length; ++var16) {
         var14[var16] = (Float)var12.get(var16);
      }

      return var14;
   }

   public static List<iIiiiilIliiiil> IIlllIlliIll(List<iIlIIiiIllIIii> length, float events) {
      ArrayList var2 = new ArrayList();

      for(iIlIIiiIllIIii var4 : length) {
         if (!(var4.IliIlllilIi() < 0.0F) && !(var4.IliIlllilIi() > events - 0.06F)) {
            iIlIIiiIllIIii var5 = var2.isEmpty() ? null : (iIlIIiiIllIIii)var2.get(var2.size() - 1);
            if (var5 != null && var4.IliIlllilIi() - var5.IliIlllilIi() < 0.035F) {
               iIlIIiiIllIIii var6 = var4.liiiIIllIl().ilIiliIiil > var5.liiiIIllIl().ilIiliIiil ? var4 : var5;
               var2.set(var2.size() - 1, new iIlIIiiIllIIii(var6.IliIlllilIi(), var6.liiiIIllIl(), Math.max(var4.iIlIlllllill(), var5.iIlIlllllill())));
            } else {
               var2.add(var4);
            }
         }
      }

      ArrayList var10 = new ArrayList();
      Iterator var11 = var2.iterator();

      while(true) {
         iIlIIiiIllIIii var14;
         boolean var17;
         do {
            if (!var11.hasNext()) {
               while(var10.size() > 16) {
                  iIlIIiiIllIIii var12 = null;

                  for(iIlIIiiIllIIii var19 : var10) {
                     if (var12 == null || Illlllllilll(var19) < Illlllllilll(var12)) {
                        var12 = var19;
                     }
                  }

                  var10.remove(var12);
               }

               ArrayList var13 = new ArrayList(var10.size());

               for(iIlIIiiIllIIii var20 : var10) {
                  var13.add(Iilllilliill(var20));
               }

               return List.copyOf(var13);
            }

            var14 = (iIlIIiiIllIIii)var11.next();
            if (var14.liiiIIllIl() != ilIIIIIiIiIIIIIi.iiilliIiil) {
               break;
            }

            var17 = false;

            for(iIlIIiiIllIIii var8 : var2) {
               if (var8.liiiIIllIl() != ilIIIIIiIiIIIIIi.iiilliIiil) {
                  float var9 = var14.IliIlllilIi() - var8.IliIlllilIi();
                  if (var9 >= 0.0F && var9 < 0.07F) {
                     var17 = true;
                  }
               }
            }
         } while(var17);

         iIlIIiiIllIIii var18 = var10.isEmpty() ? null : (iIlIIiiIllIIii)var10.get(var10.size() - 1);
         if (var18 != null && var14.IliIlllilIi() - var18.IliIlllilIi() < 0.04F) {
            if (var14.liiiIIllIl().ilIiliIiil > var18.liiiIIllIl().ilIiliIiil) {
               var10.set(var10.size() - 1, var14);
            }
         } else {
            var10.add(var14);
         }
      }
   }

   static float IIillIiliIil(float[] s, float[] t, int i) {
      float var3 = s[i] - s[i - 1];
      return var3 <= 0.0F ? 0.0F : Math.abs(t[i] - t[i - 1]) / var3;
   }

   public static iIiiiilIliiiil Iilllilliill(iIlIIiiIllIIii e) {
      float var1 = Math.clamp((e.iIlIlllllill() - 450.0F) / 1950.0F, 0.0F, 1.0F);
      float var10000;
      switch (e.liiiIIllIl().ordinal()) {
         case 0 -> var10000 = Iiilliiliiil(0.3F, 0.46F, var1);
         case 1 -> var10000 = Iiilliiliiil(0.24F, 0.34F, var1);
         case 2 -> var10000 = Iiilliiliiil(0.3F, 0.48F, var1);
         case 3 -> var10000 = Iiilliiliiil(0.4F, 0.62F, var1 * 0.85F);
         case 4 -> var10000 = Iiilliiliiil(0.4F, 0.62F, Math.clamp((e.iIlIlllllill() - 300.0F) / 2100.0F, 0.0F, 1.0F));
         case 5 -> var10000 = 0.46F;
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      float var2 = var10000;
      switch (e.liiiIIllIl().ordinal()) {
         case 1 -> var10000 = Iiilliiliiil(0.94F, 1.0F, var1);
         case 5 -> var10000 = 1.0F;
         default -> var10000 = Iiilliiliiil(0.97F, 1.04F, var1);
      }

      float var3 = var10000;
      return new iIiiiilIliiiil(e.IliIlllilIi(), e.liiiIIllIl().IiIiliIiil, var2, var3);
   }

   static float Ililllililil(float a) {
      float var1 = a % 360.0F;
      if (var1 > 180.0F) {
         var1 -= 360.0F;
      }

      if (var1 < -180.0F) {
         var1 += 360.0F;
      }

      return var1;
   }

   static List<iIiiiilIliiiil> liiiIIllIl(lIIiilIliIIiilIl model, lliIiiililiIiiil clip) {
      List var2 = iliIiiliiiii(model, clip);
      if (var2.isEmpty() && !clip.lIiiIiIlilli().isEmpty()) {
         var2 = iIlIlllllill(clip);
      }

      return IIlllIlliIll(var2, clip.iIlIlllllill());
   }

   static float Illlllllilll(iIlIIiiIllIIii e) {
      return (float)e.liiiIIllIl().ilIiliIiil + Math.min(1.0F, e.iIlIlllllill() / 2400.0F) * 0.5F;
   }

   public static List<iIlIIiiIllIIii> iliIiiliiiii(lIIiilIliIIiilIl clip, lliIiiililiIiiil model) {
      float[] var2 = lIiiIiIlilli(clip, model);
      int var3 = clip.IiIlliIliiIl(IlIillIiilIi<invokedynamic>());
      int var4 = clip.IiIlliIliiIl(IlIillIiilIi<invokedynamic>());
      int var5 = clip.IiIlliIliiIl(IlIillIiilIi<invokedynamic>());
      if (var3 >= 0 && var4 >= 0 && var5 >= 0 && var2.length >= 2) {
         float[] var6 = clip.Illlllllilll();
         float[] var7 = new float[var2.length];
         float[] var8 = new float[var2.length];

         for(int var9 = 0; var9 < var2.length; ++var9) {
            Arrays.fill(var6, 0.0F);
            model.IliIlllilIi(var2[var9], var6);
            float var10 = var6[var3 * 9 + 3];
            var7[var9] = var6[var4 * 9 + 3] - var10;
            var8[var9] = var6[var5 * 9 + 3] - var10;
         }

         return IIIllIIliIIl(var2, var7, var8);
      } else {
         return List.of();
      }
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - '\udd33') ^ var5) + 4324) + var5) + 21601))))) >>> 14 | (char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - '\udd33') ^ var5) + 4324) + var5) + 21601))))) << 2) ^ 22100) >>> 11 | (char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - '\udd33') ^ var5) + 4324) + var5) + 21601))))) >>> 14 | (char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - '\udd33') ^ var5) + 4324) + var5) + 21601))))) << 2) ^ 22100) << 5) - var5) ^ '\uf64e') - '\ude90') + 15427) + '鰧') ^ 6000) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + '贋') + '퍊'))) + var5) + var5) >>> 6 | (char)((char)((char)(~((char)((char)(var4[var5] + '贋') + '퍊'))) + var5) + var5) << 10) << 15 | (char)((char)((char)((char)(~((char)((char)(var4[var5] + '贋') + '퍊'))) + var5) + var5) >>> 6 | (char)((char)((char)(~((char)((char)(var4[var5] + '贋') + '퍊'))) + var5) + var5) << 10) >>> 1) - '강') ^ 18238) + var5) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + '贋') + '퍊'))) + var5) + var5) >>> 6 | (char)((char)((char)(~((char)((char)(var4[var5] + '贋') + '퍊'))) + var5) + var5) << 10) << 15 | (char)((char)((char)((char)(~((char)((char)(var4[var5] + '贋') + '퍊'))) + var5) + var5) >>> 6 | (char)((char)((char)(~((char)((char)(var4[var5] + '贋') + '퍊'))) + var5) + var5) << 10) >>> 1) - '강') ^ 18238) + var5) >>> 10) ^ 24941));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static ilIIIIIiIiIIIIIi IilliliilIIi(String effect) {
      String var1 = effect.toLowerCase(Locale.ROOT);
      if (!var1.contains(IlIillIiilIi<invokedynamic>()) && !var1.contains(IlIillIiilIi<invokedynamic>()) && !var1.contains(IlIillIiilIi<invokedynamic>()) && !var1.contains(IlIillIiilIi<invokedynamic>())) {
         return !var1.contains(IlIillIiilIi<invokedynamic>()) && !var1.contains(IlIillIiilIi<invokedynamic>()) && !var1.contains(IlIillIiilIi<invokedynamic>()) && !var1.endsWith(IlIillIiilIi<invokedynamic>()) ? ilIIIIIiIiIIIIIi.IIIiliIiil : ilIIIIIiIiIIIIIi.IlIiliIiil;
      } else {
         return ilIIIIIiIiIIIIIi.iiilliIiil;
      }
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(~((char)(~((char)((char)((char)(-((char)((char)(-((char)(var4[var5] ^ var5))) + var5))) - 22680) + '蒺'))))) ^ var5) + '껳'))))) << 12 | (char)(-((char)(~((char)((char)((char)(~((char)(~((char)((char)((char)(-((char)((char)(-((char)(var4[var5] ^ var5))) + var5))) - 22680) + '蒺'))))) ^ var5) + '껳'))))) >>> 4) + 'ꌻ')) ^ 25708) ^ 17578));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static synchronized List<iIiiiilIliiiil> IliIlllilIi(lIIiilIliIIiilIl clip, lliIiiililiIiiil model) {
      if (clip != null && model != null && model.liiiIIllIl().startsWith(IlIillIiilIi<invokedynamic>())) {
         if (lIlIIlIiil != clip) {
            iIlIIlIiil.clear();
            lIlIIlIiil = clip;
         }

         return (List)iIlIIlIiil.computeIfAbsent(model.liiiIIllIl(), (clipx) -> liiiIIllIl(clip, model));
      } else {
         return List.of();
      }
   }

   static List<iIlIIiiIllIIii> iIlIlllllill(lliIiiililiIiiil clip) {
      ArrayList var1 = new ArrayList();
      float var2 = 1230.0F;

      for(IIIilIIilIIilIIi var4 : clip.lIiiIiIlilli()) {
         var1.add(new iIlIIiiIllIIii(var4.IliIlllilIi(), IilliliilIIi(var4.liiiIIllIl()), var2));
      }

      var1.sort(Comparator.comparingDouble(iIlIIiiIllIIii::IliIlllilIi));
      return var1;
   }

   public static List<iIlIIiiIllIIii> IIIllIIliIIl(float[] t, float[] b, float[] h) {
      ArrayList var3 = new ArrayList();
      IlIlllIlilIl(t, b, h, true, var3);
      IlIlllIlilIl(t, b, h, false, var3);
      var3.sort(Comparator.comparingDouble(iIlIIiiIllIIii::IliIlllilIi));
      int var4 = -1;

      for(int var5 = 0; var5 < var3.size(); ++var5) {
         if (((iIlIIiiIllIIii)var3.get(var5)).liiiIIllIl() == ilIIIIIiIiIIIIIi.IlIiliIiil) {
            var4 = var5;
         }
      }

      if (var4 >= 0) {
         boolean var7 = false;

         for(int var6 = var4 + 1; var6 < var3.size(); ++var6) {
            if (((iIlIIiiIllIIii)var3.get(var6)).liiiIIllIl() != ilIIIIIiIiIIIIIi.iiilliIiil) {
               var7 = true;
            }
         }

         iIlIIiiIllIIii var8 = (iIlIIiiIllIIii)var3.get(var4);
         if (!var7) {
            var3.set(var4, new iIlIIiiIllIIii(var8.IliIlllilIi(), ilIIIIIiIiIIIIIi.llIiliIiil, var8.iIlIlllllill()));
         }
      }

      return var3;
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] << 13 | var4[var5] >>> 3))) - var5) - var5))) << 1 | (char)(-((char)((char)((char)(~((char)(var4[var5] << 13 | var4[var5] >>> 3))) - var5) - var5))) >>> 15) ^ var5) + 22148) + '錹') + '衐'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private IllIiiillllIiiil() {
   }

   private static void IlIlllIlilIl(float[] out, float[] h, float[] b, boolean t, List<iIlIIiiIllIIii> handle) {
      float[] var5 = t ? h : b;
      int var6 = out.length;
      int var7 = 1;

      while(var7 < var6) {
         float var8 = var5[var7] - var5[var7 - 1];
         float var9 = IIillIiliIil(out, var5, var7);
         if (var9 < 30.0F) {
            ++var7;
         } else {
            float var10 = Math.signum(var8);
            float var11 = 0.0F;
            int var12 = var7 - 1;
            int var13 = var12;

            for(int var14 = var7; var14 < var6; var13 = var14++) {
               float var15 = var5[var14] - var5[var14 - 1];
               float var16 = IIillIiliIil(out, var5, var14);
               if (Math.signum(var15) != var10 || var16 < 60.0F) {
                  break;
               }

               var11 = Math.max(var11, var16);
            }

            if (var13 == var12) {
               ++var7;
            } else {
               boolean var17 = var13 + 1 < var6 && IIillIiliIil(out, var5, var13 + 1) < 60.0F;
               if (var11 >= 300.0F) {
                  IiIlliIliiIl(out, h, b, var5, t, var12, var13, var11, var17, handle);
               }

               var7 = var13 + 1;
            }
         }
      }

   }
}
