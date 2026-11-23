package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_11659;
import net.minecraft.class_1921;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4608;
import org.joml.Matrix4f;

public final class llIiilIiilIiilIi {
   public static final float lIllillIIi = 0.2F;
   private static final Matrix4f lillillIIi = new Matrix4f();
   private static final Set<iiIiliiIIlilii> IlllillIIi = EnumSet.noneOf(iiIiliiIIlilii.class);
   private static final Matrix4f illlillIIi = new Matrix4f();
   private static final Map<iiIiliiIIlilii, IIIiIlIilIIiIlIi> iIllillIIi = new EnumMap(iiIiliiIIlilii.class);
   private static final Matrix4f llllillIIi = new Matrix4f();
   private static final Matrix4f IillillIIi = new Matrix4f();
   private static final float IIllillIIi = 1.0E-10F;
   private static final float iiIlillIIi = 0.033333335F;

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) - 12393) - var5) >>> 9 | (char)((char)((char)(-var4[var5]) - 12393) - var5) << 7) + 22634) ^ var5))) - 18472) - '\ue970') + var5) + var5))) >>> 5 | (char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) - 12393) - var5) >>> 9 | (char)((char)((char)(-var4[var5]) - 12393) - var5) << 7) + 22634) ^ var5))) - 18472) - '\ue970') + var5) + var5))) << 11) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static float IlIillIiilIi(float time, float length) {
      float var2;
      if (time < 0.0F) {
         var2 = 1.0F + time / 0.2F;
      } else {
         if (!(time > length)) {
            return 1.0F;
         }

         var2 = 1.0F - (time - length) / 0.2F;
      }

      var2 = Math.max(0.0F, Math.min(1.0F, var2));
      return var2 * var2 * (3.0F - 2.0F * var2);
   }

   // $FF: synthetic method
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1508845039614416212L ^ Long.rotateLeft(1831611985761997401L, 45) ^ 4350531803647310034L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8809630322765251272L ^ Long.rotateLeft(7790426911293596833L, 1) ^ -6724472201372334597L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6559677144388826838L ^ Long.rotateLeft(-8269812383716982390L, 23) ^ 7558625108051433687L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7510462282066719225L ^ Long.rotateLeft(2145590993062467474L, 21) ^ -9021889184218893180L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4261544823959894821L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -996500509338065369L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -2630859556610427539L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -6619443203827732663L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 9176278878035149553L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4712077562934490282L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(llIIlilIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIIlliIIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, iiIIlIIlIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, lIlIliIlIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IllIllllIl<invokedynamic>());
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

   public static List<String> IiIlliIliiIl(iiIiliiIIlilii knife) {
      IIIiIlIilIIiIlIi var1 = lIiiIiIlilli(knife) ? (IIIiIlIilIIiIlIi)iIllillIIi.get(knife) : null;
      return var1 == null ? List.of() : var1.ilIllIIIIi;
   }

   public static List<iIiiiilIliiiil> Iilllilliill(String clip) {
      return IIillIiliIil(iiIiliiIIlilii.lIIllliIIl, clip);
   }

   private static boolean liiiIIllIl(lIIiilIliIIiilIl root, int model, int except) {
      for(int var3 = 0; var3 < root.liiililIll.length; ++var3) {
         if (root.liiililIll[var3].lIiiIiIlilli().length != 0 && root.IIlllIlliIll(var3, model) && (except < 0 || !root.IIlllIlliIll(except, var3))) {
            return true;
         }
      }

      return false;
   }

   public static float Illlllllilll(iiIiliiIIlilii clip, String knife) {
      lliIiiililiIiiil var2 = IIIilIIiiIIi(clip, knife);
      return var2 == null ? 0.0F : var2.iIlIlllllill();
   }

   public static boolean IiIiliIiiiIi(class_4587 light, class_11659 matrices, lIIllIiiIIllIi queue, String clipName, float twirl, boolean finish, int time) {
      return IIlilIliiIli(iiIiliiIIlilii.lIIllliIIl, light, matrices, queue, clipName, twirl, finish, time);
   }

   public static boolean Iilililiiili(lIIllIiiIIllIi finish) {
      if (finish != null && !finish.IliIlllilIi()) {
         return iiiIIlllIIIlIlll.liiiIIllIl(illIIlllIilIIlll.iiIIIIIill, finish) != null;
      } else {
         return true;
      }
   }

   public static List<iIiiiilIliiiil> IIillIiliIil(iiIiliiIIlilii clip, String knife) {
      lliIiiililiIiiil var2 = IIIilIIiiIIi(clip, knife);
      if (var2 == null) {
         return List.of();
      } else {
         List var3 = IillIlilillIli.IiIiliIiiiIi(clip, var2);
         return var3 != null ? var3 : IllIiiillllIiiil.IliIlllilIi(((IIIiIlIilIIiIlIi)iIllillIIi.get(clip)).IIIllIIIIi, var2);
      }
   }

   public static boolean lIiiIiIlilli(iiIiliiIIlilii knife) {
      return iIlIlllllill(knife) != null;
   }

   private static IIIiIlIilIIiIlIi iIlIlllllill(iiIiliiIIlilii knife) {
      if (knife == null) {
         return null;
      } else {
         iIllliIlllli.iIlIlllllill(knife);
         liIlIiliiIlIil var1 = iIllliIlllli.iliIiiliiiii(knife);
         if (var1 == null) {
            return null;
         } else {
            IIIiIlIilIIiIlIi var2 = (IIIiIlIilIIiIlIi)iIllillIIi.get(knife);
            if (var2 == null || var2.iiiIlIIIIi != var1) {
               if (IlllillIIi.contains(knife)) {
                  return null;
               }

               try {
                  var2 = new IIIiIlIilIIiIlIi(var1);
               } catch (RuntimeException var4) {
                  IlllillIIi.add(knife);
                  System.err.println(iIIIlIlIIl<invokedynamic>() + knife.lililliIIl + iIIIlIlIIl<invokedynamic>() + var4);
                  return null;
               }

               iIllillIIi.put(knife, var2);
            }

            return var2;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite IllIllllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) - 16243))) >>> 12 | (char)(-((char)((char)(-var4[var5]) - 16243))) << 4) >>> 4 | (char)((char)(-((char)((char)(-var4[var5]) - 16243))) >>> 12 | (char)(-((char)((char)(-var4[var5]) - 16243))) << 4) << 12) + '\ue0ec') ^ var5))) - var5) << 4 | (char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) - 16243))) >>> 12 | (char)(-((char)((char)(-var4[var5]) - 16243))) << 4) >>> 4 | (char)((char)(-((char)((char)(-var4[var5]) - 16243))) >>> 12 | (char)(-((char)((char)(-var4[var5]) - 16243))) << 4) << 12) + '\ue0ec') ^ var5))) - var5) >>> 12) ^ var5) + var5) + '\uf194'))))) - var5) ^ var5) + var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void Illillliilli(float[] v, class_4587.class_4665 light, class_4588 out, int m) {
      for(int var4 = 0; var4 < v.length; var4 += 8) {
         out.method_56824(light, v[var4], v[var4 + 1], v[var4 + 2]).method_39415(-1).method_22913(v[var4 + 3], v[var4 + 4]).method_22922(class_4608.field_21444).method_60803(m).method_60831(light, v[var4 + 5], v[var4 + 6], v[var4 + 7]);
      }

   }

   // $FF: synthetic method
   private static CallSite IiIIlliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 13017) ^ 5280) ^ var5) - 26812) - var5) ^ var5) - var5) + 4473) >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 13017) ^ 5280) ^ var5) - 26812) - var5) ^ var5) - var5) + 4473) << 1) - var5) - 3765) ^ var5) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 13017) ^ 5280) ^ var5) - 26812) - var5) ^ var5) - var5) + 4473) >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 13017) ^ 5280) ^ var5) - 26812) - var5) ^ var5) - var5) + 4473) << 1) - var5) - 3765) ^ var5) >>> 8) + 30369))) - var5) + 29494))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean iliIiiliiiii() {
      return IIIllIIliIIl(iiIiliiIIlilii.lIIllliIIl);
   }

   private static lliIiiililiIiiil IIIilIIiiIIi(iiIiliiIIlilii name, String knife) {
      return lIiiIiIlilli(name) && knife != null ? (lliIiiililiIiiil)((IIIiIlIilIIiIlIi)iIllillIIi.get(name)).IIIllIIIIi.iiiililIll.get(knife) : null;
   }

   public static float Iiilliiliiil(iiIiliiIIlilii knife) {
      IIIiIlIilIIiIlIi var1 = lIiiIiIlilli(knife) ? (IIIiIlIilIIiIlIi)iIllillIIi.get(knife) : null;
      return var1 == null ? 1.0F : var1.iIlllIIIIi;
   }

   private static boolean IIiilIiiiIii(lIIiilIliIIiilIl queue, Matrix4f[] matrices, class_4587 bones, class_11659 finish, int light, lllIlIlillIlIl model) {
      int var6 = lIiiiIiiIiiiIi.IlilIliiillilIliii.length;
      Matrix4f[] var7 = IIililIili.lIiiIiIlilli(queue);

      for(int var8 = 0; var8 < var6; ++var8) {
         IIIiIllllIIiIlll var9 = IIIiIllllIIiIlll.iliIiiliiiii(lIiiiIiiIiiiIi.IlilIliiillilIliii[var8]);
         if (var9 == null || !var9.Iiilliiliiil(model.IliIlllilIi(var8)) || lIiiiIiiIiiiIi.IilliliilIIi(queue, var8) < 0 || var7[var8] == null) {
            return false;
         }
      }

      for(int var15 = 0; var15 < var6; ++var15) {
         int var16 = lIiiiIiiIiiiIi.IilliliilIIi(queue, var15);
         IIIiIllllIIiIlll var10 = IIIiIllllIIiIlll.iliIiiliiiii(lIiiiIiiIiiiIi.IlilIliiillilIliii[var15]);
         iIiiliIiIliiliIi var11 = model.IliIlllilIi(var15);
         bones.method_22903();

         try {
            bones.method_34425(lillillIIi.set(matrices[var16]).mul(var7[var15]));
            finish.method_73483(bones, model.llIlIIIllilIlIIIll, (entry, skin) -> var10.IIIilIIiiIIi(entry, skin, light, class_4608.field_21444, var11));
            if (model.liiiIIllIl(var15)) {
               finish.method_73529(1).method_73483(bones, model.IiIlIIIllliIlIIIll, (skin, mesh) -> var10.IlIillIiilIi(skin, mesh, var11));
            }
         } finally {
            bones.method_22909();
         }
      }

      return true;
   }

   // $FF: synthetic method
   private static CallSite lIlIliIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(~((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ '괃') >>> 10 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ '괃') << 6) - 'ꛠ') + var5) ^ '싃') - var5) - var5))) << 13 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ '괃') >>> 10 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ '괃') << 6) - 'ꛠ') + var5) ^ '싃') - var5) - var5))) >>> 3) ^ 18865) + var5) + 23937) << 8 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ '괃') >>> 10 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ '괃') << 6) - 'ꛠ') + var5) ^ '싃') - var5) - var5))) << 13 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ '괃') >>> 10 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ '괃') << 6) - 'ꛠ') + var5) ^ '싃') - var5) - var5))) >>> 3) ^ 18865) + var5) + 23937) >>> 8))))))) << 2 | (char)(-((char)(~((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ '괃') >>> 10 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ '괃') << 6) - 'ꛠ') + var5) ^ '싃') - var5) - var5))) << 13 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ '괃') >>> 10 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ '괃') << 6) - 'ꛠ') + var5) ^ '싃') - var5) - var5))) >>> 3) ^ 18865) + var5) + 23937) << 8 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ '괃') >>> 10 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ '괃') << 6) - 'ꛠ') + var5) ^ '싃') - var5) - var5))) << 13 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ '괃') >>> 10 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ '괃') << 6) - 'ꛠ') + var5) ^ '싃') - var5) - var5))) >>> 3) ^ 18865) + var5) + 23937) >>> 8))))))) >>> 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean IilliliilIIi() {
      return lIiiIiIlilli(iiIiliiIIlilii.lIIllliIIl);
   }

   public static float IIlllIlliIll(String clip) {
      return Illlllllilll(iiIiliiIIlilii.lIIllliIIl, clip);
   }

   private llIiilIiilIiilIi() {
   }

   public static boolean IIlilIliiIli(iiIiliiIIlilii clipName, class_4587 matrices, class_11659 light, lIIllIiiIIllIi knife, String finish, float time, boolean queue, int twirl) {
      if (!lIiiIiIlilli(clipName)) {
         return false;
      } else {
         IIIiIlIilIIiIlIi var8 = (IIIiIlIilIIiIlIi)iIllillIIi.get(clipName);
         lIIiilIliIIiilIl var9 = var8.IIIllIIIIi;
         var8.lIiiIiIlilli(finish == null ? null : (lliIiiililiIiiil)var9.iiiililIll.get(finish), time);
         Matrix4f[] var10 = var8.lIlllIIIIi;
         IillillIIi.set(var10[var8.iIIllIIIIi]).invert();
         llllillIIi.identity();
         if (queue) {
            llllillIIi.set(var8.liIllIIIIi).mul(var8.liiiIIllIl()).setTranslation(0.0F, 0.0F, 0.0F);
         }

         llllillIIi.translate(-var8.IiIllIIIIi.x, -var8.IiIllIIIIi.y, -var8.IiIllIIIIi.z).mul(IillillIIi);
         matrices.method_22903();

         try {
            matrices.method_34425(llllillIIi);
            lllIlIlillIlIl var11 = clipName.IliIlllilIi() ? iiiIIlllIIIlIlll.liiiIIllIl(illIIlllIilIIlll.iiIIIIIill, knife) : null;
            if (var11 == null || !IIiilIiiiIii(var9, var10, matrices, light, twirl, var11)) {
               class_1921 var12 = IIililIili.IilliliilIIi(var8.iiiIlIIIIi);

               for(int var13 = 0; var13 < var9.liiililIll.length; ++var13) {
                  if (var8.llIllIIIIi[var13] && !(Math.abs(var10[var13].determinant3x3()) < 1.0E-10F)) {
                     float[] var14 = var9.liiililIll[var13].lIiiIiIlilli();
                     matrices.method_22903();

                     try {
                        matrices.method_34425(var10[var13]);
                        light.method_73483(matrices, var12, (lightx, v) -> Illillliilli(var14, lightx, v, twirl));
                     } finally {
                        matrices.method_22909();
                     }
                  }
               }
            }
         } finally {
            matrices.method_22909();
         }

         return true;
      }
   }

   public static List<String> IlIlllIlilIl() {
      return IiIlliIliiIl(iiIiliiIIlilii.lIIllliIIl);
   }

   public static boolean IIIllIIliIIl(iiIiliiIIlilii knife) {
      return iIllliIlllli.IlIlllIlilIl(knife) || IlllillIIi.contains(knife);
   }

   public static float Ililllililil() {
      return Iiilliiliiil(iiIiliiIIlilii.lIIllliIIl);
   }

   static int[] IliIlllilIi(lIIiilIliIIiilIl knife, iiIiliiIIlilii model) {
      if (model.IliIlllilIi()) {
         int var6 = knife.IiIlliIliiIl(iIIIlIlIIl<invokedynamic>());
         int var7 = knife.IiIlliIliiIl(iIIIlIlIIl<invokedynamic>());
         if (var6 >= 0 && var7 >= 0) {
            return new int[]{var7, var6};
         } else {
            throw new IllegalStateException(iIIIlIlIIl<invokedynamic>());
         }
      } else {
         int var2 = knife.IiIlliIliiIl(iIIIlIlIIl<invokedynamic>());
         int var3 = -1;

         for(int var4 = var2 < 0 ? -1 : knife.liiililIll[var2].liiiIIllIl(); var4 >= 0; var4 = knife.liiililIll[var4].liiiIIllIl()) {
            if (liiiIIllIl(knife, var4, var2)) {
               var3 = var4;
               break;
            }
         }

         if (var3 >= 0) {
            for(int var9 = 0; var9 < knife.liiililIll.length; ++var9) {
               if (knife.liiililIll[var9].liiiIIllIl() == var3 && (var2 < 0 || !knife.IIlllIlliIll(var2, var9)) && liiiIIllIl(knife, var9, -1)) {
                  return new int[]{var3, var9};
               }
            }

            return new int[]{var3, var3};
         } else {
            for(int var8 = 0; var8 < knife.liiililIll.length; ++var8) {
               if (knife.liiililIll[var8].lIiiIiIlilli().length > 0) {
                  int var5;
                  for(var5 = var8; knife.liiililIll[var5].liiiIIllIl() >= 0 && knife.liiililIll[knife.liiililIll[var5].liiiIIllIl()].liiiIIllIl() >= 0; var5 = knife.liiililIll[var5].liiiIIllIl()) {
                  }

                  return new int[]{-1, var5};
               }
            }

            throw new IllegalStateException(iIIIlIlIIl<invokedynamic>());
         }
      }
   }

   // $FF: synthetic method
   private static CallSite iiIIlIIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) << 7 | (char)(var4[var5] >>> 14 | var4[var5] << 2) >>> 9) - '遵') ^ '\ufefd') >>> 3 | (char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) << 7 | (char)(var4[var5] >>> 14 | var4[var5] << 2) >>> 9) - '遵') ^ '\ufefd') << 13) + '貸') + 9831))) ^ 28142) ^ var5) - 126) ^ var5) << 5 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) << 7 | (char)(var4[var5] >>> 14 | var4[var5] << 2) >>> 9) - '遵') ^ '\ufefd') >>> 3 | (char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) << 7 | (char)(var4[var5] >>> 14 | var4[var5] << 2) >>> 9) - '遵') ^ '\ufefd') << 13) + '貸') + 9831))) ^ 28142) ^ var5) - 126) ^ var5) >>> 11) >>> 11 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) << 7 | (char)(var4[var5] >>> 14 | var4[var5] << 2) >>> 9) - '遵') ^ '\ufefd') >>> 3 | (char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) << 7 | (char)(var4[var5] >>> 14 | var4[var5] << 2) >>> 9) - '遵') ^ '\ufefd') << 13) + '貸') + 9831))) ^ 28142) ^ var5) - 126) ^ var5) << 5 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) << 7 | (char)(var4[var5] >>> 14 | var4[var5] << 2) >>> 9) - '遵') ^ '\ufefd') >>> 3 | (char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) << 7 | (char)(var4[var5] >>> 14 | var4[var5] << 2) >>> 9) - '遵') ^ '\ufefd') << 13) + '貸') + 9831))) ^ 28142) ^ var5) - 126) ^ var5) >>> 11) << 5))) ^ var5) << 1 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) << 7 | (char)(var4[var5] >>> 14 | var4[var5] << 2) >>> 9) - '遵') ^ '\ufefd') >>> 3 | (char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) << 7 | (char)(var4[var5] >>> 14 | var4[var5] << 2) >>> 9) - '遵') ^ '\ufefd') << 13) + '貸') + 9831))) ^ 28142) ^ var5) - 126) ^ var5) << 5 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) << 7 | (char)(var4[var5] >>> 14 | var4[var5] << 2) >>> 9) - '遵') ^ '\ufefd') >>> 3 | (char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) << 7 | (char)(var4[var5] >>> 14 | var4[var5] << 2) >>> 9) - '遵') ^ '\ufefd') << 13) + '貸') + 9831))) ^ 28142) ^ var5) - 126) ^ var5) >>> 11) >>> 11 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) << 7 | (char)(var4[var5] >>> 14 | var4[var5] << 2) >>> 9) - '遵') ^ '\ufefd') >>> 3 | (char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) << 7 | (char)(var4[var5] >>> 14 | var4[var5] << 2) >>> 9) - '遵') ^ '\ufefd') << 13) + '貸') + 9831))) ^ 28142) ^ var5) - 126) ^ var5) << 5 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) << 7 | (char)(var4[var5] >>> 14 | var4[var5] << 2) >>> 9) - '遵') ^ '\ufefd') >>> 3 | (char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) << 7 | (char)(var4[var5] >>> 14 | var4[var5] << 2) >>> 9) - '遵') ^ '\ufefd') << 13) + '貸') + 9831))) ^ 28142) ^ var5) - 126) ^ var5) >>> 11) << 5))) ^ var5) >>> 15) + 9373) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
