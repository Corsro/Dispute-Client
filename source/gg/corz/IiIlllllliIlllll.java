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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1058;
import net.minecraft.class_10889;
import net.minecraft.class_2248;
import net.minecraft.class_2350;
import net.minecraft.class_5611;
import net.minecraft.class_777;
import org.joml.Vector3fc;

public final class IiIlllllliIlllll {
   private static final float IilIIiIill = 0.0625F;
   private static final class_2350[] lIlIIiIill;
   private static final int IllIIiIill = 1;
   private static final float[] lilIIiIill;
   public static final int iiIIIiIill = 4159204;
   private static final int illIIiIill = Integer.MIN_VALUE;
   private static final ExecutorService iilIIiIill;
   public static final int liIIIiIill = 360000;
   private static final int lllIIiIill = 2;
   public static final float IIlIIiIill = 0.875F;
   private static final int iIlIIiIill = 0;

   private static void IlIlllIlilIl(Iillililillili fd, int wz, int prep, int wy, int wx, IlliIIIlllliIIIl sc) {
      long var32 = 8223994976970325952L;
      long var34 = -340458271582209223L;
      long var36 = 112360166302745492L;
      long var38 = -2682144208458369825L;
      long var24 = 6595851354240160483L;
      long var40 = -2735185367819687502L;
      long var26 = -6162144725306941733L;
      long var28 = -6921222035045247750L;
      long var30 = -4397220200230417220L;
      int[] var6 = lllIIiIiillIIiIi.llIililIIi[wz];
      var24 ^= ((long)(prep + var6[0]) << 32 ^ var24) & -1L << 32;
      var24 ^= ((long)(wy + var6[1]) ^ var24) & -1L >>> 32;
      var26 ^= ((long)(wx + var6[2]) << 32 ^ var26) & -1L << 32;
      if (var6[1] != 0) {
         var26 ^= (0L ^ var26) & -1L >>> 32;
         var28 ^= (8589934592L ^ var28) & -1L << 32;
      } else if (var6[2] != 0) {
         var26 ^= (0L ^ var26) & -1L >>> 32;
         var28 ^= (4294967296L ^ var28) & -1L << 32;
      } else {
         var26 ^= (1L ^ var26) & -1L >>> 32;
         var28 ^= (8589934592L ^ var28) & -1L << 32;
      }

      for(long var47 = var28 ^ (0L ^ var28) & -1L >>> 32; (int)var47 < 4; var47 ^= (var47 ^ var47 + (long)1) & -1L >>> 32) {
         long var48 = var30 ^ ((long)iIlliIIlIllliIIl.IilliliilIIi(sc.IliiIlllIl[(int)var47][(int)var26]) << 32 ^ var30) & -1L << 32;
         var30 = var48 ^ ((long)iIlliIIlIllliIIl.IilliliilIIi(sc.IliiIlllIl[(int)var47][(int)(var47 >>> 32)]) ^ var48) & -1L >>> 32;
         long var49 = var32 ^ ((long)((int)var26 == 0 ? (int)(var30 >>> 32) : 0) << 32 ^ var32) & -1L << 32;
         var32 = var49 ^ ((long)((int)var26 == 1 ? (int)(var30 >>> 32) : 0) ^ var49) & -1L >>> 32;
         long var50 = var34 ^ ((long)((int)var26 == 2 ? (int)(var30 >>> 32) : 0) << 32 ^ var34) & -1L << 32;
         var34 = var50 ^ ((long)((int)(var47 >>> 32) == 0 ? (int)var30 : 0) ^ var50) & -1L >>> 32;
         long var51 = var36 ^ ((long)((int)(var47 >>> 32) == 1 ? (int)var30 : 0) << 32 ^ var36) & -1L << 32;
         var36 = var51 ^ ((long)((int)(var47 >>> 32) == 2 ? (int)var30 : 0) ^ var51) & -1L >>> 32;
         long var52 = var38 ^ ((long)fd.lIiiIiIlilli((int)(var24 >>> 32) + (int)(var32 >>> 32), (int)var24 + (int)var32, (int)(var26 >>> 32) + (int)(var34 >>> 32)) << 32 ^ var38) & -1L << 32;
         var38 = var52 ^ ((long)fd.lIiiIiIlilli((int)(var24 >>> 32) + (int)var34, (int)var24 + (int)(var36 >>> 32), (int)(var26 >>> 32) + (int)var36) ^ var52) & -1L >>> 32;
         var40 ^= ((long)fd.lIiiIiIlilli((int)(var24 >>> 32) + (int)(var32 >>> 32) + (int)var34, (int)var24 + (int)var32 + (int)(var36 >>> 32), (int)(var26 >>> 32) + (int)(var34 >>> 32) + (int)var36) << 32 ^ var40) & -1L << 32;
         sc.iliiIlllIl[(int)var47] = iIlliIIlIllliIIl.IliIlllilIi((boolean)((int)(var38 >>> 32)), (boolean)((int)var38), (boolean)((int)(var40 >>> 32)));
      }

   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - 7140) - 'ꥣ')) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) - 7140) - 'ꥣ')) << 4) - 25609) ^ 9345) + var5))))) ^ 22376) << 4 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - 7140) - 'ꥣ')) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) - 7140) - 'ꥣ')) << 4) - 25609) ^ 9345) + var5))))) ^ 22376) >>> 12) >>> 3 | (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - 7140) - 'ꥣ')) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) - 7140) - 'ꥣ')) << 4) - 25609) ^ 9345) + var5))))) ^ 22376) << 4 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - 7140) - 'ꥣ')) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) - 7140) - 'ꥣ')) << 4) - 25609) ^ 9345) + var5))))) ^ 22376) >>> 12) << 13) >>> 2 | (char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - 7140) - 'ꥣ')) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) - 7140) - 'ꥣ')) << 4) - 25609) ^ 9345) + var5))))) ^ 22376) << 4 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - 7140) - 'ꥣ')) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) - 7140) - 'ꥣ')) << 4) - 25609) ^ 9345) + var5))))) ^ 22376) >>> 12) >>> 3 | (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - 7140) - 'ꥣ')) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) - 7140) - 'ꥣ')) << 4) - 25609) ^ 9345) + var5))))) ^ 22376) << 4 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - 7140) - 'ꥣ')) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) - 7140) - 'ꥣ')) << 4) - 25609) ^ 9345) + var5))))) ^ 22376) >>> 12) << 13) << 14))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void lIiiIiIlilli(Iillililillili wx, IilIiIIililIiIIi translucent, int prep, int wy, int wz, iiIllIilIIlllIil info, iiIllIilIIlllIil solid, iiIllIilIIlllIil chest, IlliIIIlllliIIIl sc) {
      long var18 = 5151178314709081242L;
      long var20 = 5951071022440615800L;
      long var22 = 2099046715020740853L;
      if (translucent.IiIIlliiil) {
         if (translucent.iIlIlliiil) {
            if (translucent.illIlliiil != null) {
               translucent.illIlliiil.IliIlllilIi((float)(prep - wx.llilIIlIIl), (float)(wy - wx.ililIIlIIl), (float)(wz - wx.IiilIIlIIl), chest);
            } else {
               IIlllIlliIll(wx, translucent, prep, wy, wz, info, sc);
            }
         } else {
            iiIllIilIIlllIil var9 = translucent.liIIlliiil ? solid : info;
            sc.IIiiIlllIl.method_43052(translucent.IlIIlliiil.method_26190(sc.iIiiIlllIl.method_10103(prep, wy, wz)));
            sc.lIiiIlllIl.clear();
            translucent.lIlIlliiil.method_68513(sc.IIiiIlllIl, sc.lIiiIlllIl);

            for(var18 ^= (0L ^ var18) & -1L << 32; (int)(var18 >>> 32) < sc.lIiiIlllIl.size(); var18 += 4294967296L) {
               class_10889 var11 = (class_10889)sc.lIiiIlllIl.get((int)(var18 >>> 32));
               var18 ^= ((long)(translucent.iiIIlliiil == 0 && var11.comp_3751() ? 1 : 0) ^ var18) & -1L >>> 32;

               for(var20 ^= (0L ^ var20) & -1L << 32; (int)(var20 >>> 32) < 6; var20 += 4294967296L) {
                  List var14 = var11.method_68509(lIlIIiIill[(int)(var20 >>> 32)]);
                  if (!var14.isEmpty()) {
                     int[] var15 = lllIIiIiillIIiIi.llIililIIi[(int)(var20 >>> 32)];
                     IilIiIIililIiIIi var16 = wx.liiiIIllIl(prep + var15[0], wy + var15[1], wz + var15[2]);
                     if (class_2248.method_9607(translucent.IlIIlliiil, var16.IlIIlliiil, lIlIIiIill[(int)(var20 >>> 32)])) {
                        for(var20 ^= (0L ^ var20) & -1L >>> 32; (int)var20 < var14.size(); var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32) {
                           IIIllIIliIIl(wx, translucent, (class_777)var14.get((int)var20), prep, wy, wz, (boolean)((int)var18), var9, sc);
                        }
                     }
                  }
               }

               List var13 = var11.method_68509((class_2350)null);

               for(var22 ^= (0L ^ var22) & -1L << 32; (int)(var22 >>> 32) < var13.size(); var22 += 4294967296L) {
                  IIIllIIliIIl(wx, translucent, (class_777)var13.get((int)(var22 >>> 32)), prep, wy, wz, (boolean)((int)var18), var9, sc);
               }
            }
         }
      }

      if (translucent.IIlIlliiil != 0) {
         IiIlliIliiIl(wx, translucent, prep, wy, wz, info, solid, sc, false);
      }

   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)(-((char)((char)(~((char)((char)(~((char)(var4[var5] + var5))) << 14 | (char)(~((char)(var4[var5] + var5))) >>> 2))) - 1534))) + '뼨') - 13519))) >>> 5 | (char)(~((char)((char)((char)(-((char)((char)(~((char)((char)(~((char)(var4[var5] + var5))) << 14 | (char)(~((char)(var4[var5] + var5))) >>> 2))) - 1534))) + '뼨') - 13519))) << 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void Iilllilliill(float[] sc, int tint, class_1058 wy, int box, int sink, int wz, int prep, Iillililillili d, iiIllIilIIlllIil sprite, IlliIIIlllliIIIl wx) {
      long var23 = 5872126258142330822L;
      long var25 = -7154515419827290369L;
      var23 ^= ((long)iIlliIIlIllliIIl.iliIiiliiiii(box, iIlliIIlIllliIIl.lIiiIiIlilli(tint)) << 32 ^ var23) & -1L << 32;
      var23 ^= ((long)iiIllIilIIlllIil.liiiIIllIl((int)(var23 >>> 32)) ^ var23) & -1L >>> 32;
      float var12 = wy.method_4594();
      float var13 = wy.method_4577();
      float var14 = wy.method_4593();
      float var15 = wy.method_4575();
      float var16 = (float)(sink - d.llilIIlIIl);
      float var17 = (float)(wz - d.ililIIlIIl);
      float var18 = (float)(prep - d.IiilIIlIIl);
      float[] var19 = wx.IiiiIlllIl;

      for(long var29 = var25 ^ (0L ^ var25) & -1L << 32; (int)(var29 >>> 32) < 4; var29 += 4294967296L) {
         lllIIiIiillIIiIi.IliIlllilIi(tint, (int)(var29 >>> 32), sc, var19);
         float var21 = var12 + (var13 - var12) * lllIIiIiillIIiIi.liiiIIllIl(tint, var19[0], var19[1], var19[2]);
         float var22 = var14 + (var15 - var14) * lllIIiIiillIIiIi.iIlIlllllill(tint, var19[0], var19[1], var19[2]);
         sprite.IilliliilIIi(var16 + var19[0], var17 + var19[1], var18 + var19[2], var21, var22, (int)var23);
      }

   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 622577604431866168L ^ Long.rotateLeft(-458714512889077667L, 31) ^ -4269849100154739283L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1253037770109541006L ^ Long.rotateLeft(1752967894293998434L, 52) ^ -6322690912076422444L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3221453209610451180L ^ Long.rotateLeft(-5033205057402398364L, 11) ^ 3623330934646414185L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8784769406642491186L ^ Long.rotateLeft(8330649970160527214L, 34) ^ -6280986234143619245L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6103041979300644932L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8584737993283411280L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4924236812751186729L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -1948418245375333869L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8490875250223413332L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -2778437635280131562L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIIilIIiiIIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IlIillIiilIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IiIiliIiiiIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIlilIliiIli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Illillliilli<invokedynamic>());
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

   private static void IiIlliIliiIl(Iillililillili capOnly, IilIiIIililIiIIi solid, int sc, int info, int wx, iiIllIilIIlllIil wy, iiIllIilIIlllIil translucent, IlliIIIlllliIIIl prep, boolean wz) {
      long var19 = 2195971663295117715L;
      long var21 = 6216453631016803755L;
      var19 ^= ((long)(solid.IIlIlliiil == 1 ? 1 : 0) << 32 ^ var19) & -1L << 32;
      class_1058 var10 = (int)(var19 >>> 32) != 0 ? capOnly.iiilIIlIIl.lIiiIiIlilli() : capOnly.iiilIIlIIl.iliIiiliiiii();
      if (var10 != null) {
         iiIllIilIIlllIil var11 = (int)(var19 >>> 32) != 0 ? translucent : wy;
         IilIiIIililIiIIi var12 = capOnly.liiiIIllIl(sc, info + 1, wx);
         float var13 = var12.IIlIlliiil == solid.IIlIlliiil ? 1.0F : 0.875F;
         float[] var14 = new float[]{0.0F, 0.0F, 0.0F, 1.0F, var13, 1.0F};
         var19 ^= ((long)((int)(var19 >>> 32) != 0 ? 4159204 : 16777215) ^ var19) & -1L >>> 32;

         for(long var25 = var21 ^ (0L ^ var21) & -1L << 32; (int)(var25 >>> 32) < 6; var25 += 4294967296L) {
            if (!wz || (int)(var25 >>> 32) == 1) {
               if (!wz) {
                  int[] var17 = lllIIiIiillIIiIi.llIililIIi[(int)(var25 >>> 32)];
                  IilIiIIililIiIIi var18 = (int)(var25 >>> 32) == 1 ? var12 : capOnly.liiiIIllIl(sc + var17[0], info + var17[1], wx + var17[2]);
                  if (var18.IIlIlliiil == solid.IIlIlliiil || var18.ilIIlliiil) {
                     continue;
                  }
               }

               Iilllilliill(var14, (int)(var25 >>> 32), var10, (int)var19, sc, info, wx, capOnly, var11, prep);
            }
         }

      }
   }

   static liIIliIliiIIliIl iIlIlllllill(iIilliIlIlilliIl s, IllliIIilllliIIi env, iIiiIIIlIliiIIIl job) {
      long var32 = -5785132912948030668L;
      long var34 = 7953734243961190808L;
      long var36 = -8445437382613419154L;
      long var38 = 4834542822286002012L;
      long var40 = 462031072290959703L;
      long var42 = 7122467033920976912L;
      long var44 = -892078527036123061L;
      long var30 = 483754537820515266L;
      long var46 = 5484398391257030718L;
      IlliIIIlllliIIIl var3 = new IlliIIIlllliIIIl();
      Iillililillili var4 = new Iillililillili(s, env, var3.IIiiIlllIl);
      var30 ^= ((long)var4.liilIIlIIl << 32 ^ var30) & -1L << 32;
      iiIllIilIIlllIil var6 = new iiIllIilIIlllIil((int)(var30 >>> 32), 4096);
      iiIllIilIIlllIil var7 = new iiIllIilIIlllIil((int)(var30 >>> 32), 256);
      iiIllIilIIlllIil var8 = new iiIllIilIIlllIil((int)(var30 >>> 32), 64);
      var30 ^= (2147483647L ^ var30) & -1L >>> 32;
      var32 ^= (9223372032559808512L ^ var32) & -1L << 32;
      var32 ^= (2147483647L ^ var32) & -1L >>> 32;
      var34 ^= (Long.MIN_VALUE ^ var34) & -1L << 32;
      var34 ^= (-2147483648L ^ var34) & -1L >>> 32;
      var36 ^= (Long.MIN_VALUE ^ var36) & -1L << 32;
      var36 ^= (0L ^ var36) & -1L >>> 32;
      var38 ^= (0L ^ var38) & -1L << 32;

      label105:
      for(var38 ^= (0L ^ var38) & -1L >>> 32; (int)var38 < (int)(var30 >>> 32); var38 ^= (var38 ^ var38 + (long)1) & -1L >>> 32) {
         if (job != null && job.lllIllllIl) {
            return null;
         }

         var40 ^= ((long)(var4.ililIIlIIl + (int)var38) << 32 ^ var40) & -1L << 32;
         var6.iIlIlllllill((int)var38);
         var7.iIlIlllllill((int)var38);
         var8.iIlIlllllill((int)var38);

         for(var40 ^= (0L ^ var40) & -1L >>> 32; (int)var40 < var4.lillIIlIIl.length; var40 ^= (var40 ^ var40 + (long)1) & -1L >>> 32) {
            IiliIIIililiIIIi var20 = var4.lillIIlIIl[(int)var40];
            var42 ^= ((long)((int)(var40 >>> 32) - var4.IIilIIlIIl[(int)var40]) << 32 ^ var42) & -1L << 32;
            if ((int)(var42 >>> 32) >= 0 && (int)(var42 >>> 32) < var20.liIIIlliil) {
               IilIiIIililIiIIi[] var22 = var4.iIilIIlIIl[(int)var40];

               for(var42 ^= (0L ^ var42) & -1L >>> 32; (int)var42 < var20.iiIIIlliil; var42 ^= (var42 ^ var42 + (long)1) & -1L >>> 32) {
                  for(var44 ^= (0L ^ var44) & -1L << 32; (int)(var44 >>> 32) < var20.IiIIIlliil; var44 += 4294967296L) {
                     var44 ^= ((long)var20.iliIiiliiiii((int)(var44 >>> 32), (int)(var42 >>> 32), (int)var42) ^ var44) & -1L >>> 32;
                     if ((int)var44 >= 0 && (int)var44 < var22.length) {
                        IilIiIIililIiIIi var26 = var22[(int)var44];
                        if (!var26.llIIlliiil) {
                           var46 ^= ((long)(var4.iillIIlIIl[(int)var40] + (int)(var44 >>> 32)) << 32 ^ var46) & -1L << 32;
                           var46 ^= ((long)(var4.lIilIIlIIl[(int)var40] + (int)var42) ^ var46) & -1L >>> 32;
                           if (!var4.IlilIIlIIl[(int)var40] || var4.iIlIlllllill((int)(var46 >>> 32), (int)(var40 >>> 32), (int)var46) == (int)var40) {
                              if (var6.IlIlllIlilIl() + var7.IlIlllIlilIl() + var8.IlIlllIlilIl() >= 360000) {
                                 var38 ^= (4294967296L ^ var38) & -1L << 32;
                                 break label105;
                              }

                              var36 ^= (var36 ^ var36 + (long)1) & -1L >>> 32;
                              if ((int)(var46 >>> 32) < (int)var30) {
                                 var30 ^= ((long)((int)(var46 >>> 32)) ^ var30) & -1L >>> 32;
                              }

                              if ((int)(var46 >>> 32) > (int)(var34 >>> 32)) {
                                 var34 ^= ((long)((int)(var46 >>> 32)) << 32 ^ var34) & -1L << 32;
                              }

                              if ((int)(var40 >>> 32) < (int)(var32 >>> 32)) {
                                 var32 ^= ((long)((int)(var40 >>> 32)) << 32 ^ var32) & -1L << 32;
                              }

                              if ((int)(var40 >>> 32) > (int)var34) {
                                 var34 ^= ((long)((int)(var40 >>> 32)) ^ var34) & -1L >>> 32;
                              }

                              if ((int)var46 < (int)var32) {
                                 var32 ^= ((long)((int)var46) ^ var32) & -1L >>> 32;
                              }

                              if ((int)var46 > (int)(var36 >>> 32)) {
                                 var36 ^= ((long)((int)var46) << 32 ^ var36) & -1L << 32;
                              }

                              try {
                                 lIiiIiIlilli(var4, var26, (int)(var46 >>> 32), (int)(var40 >>> 32), (int)var46, var6, var7, var8, var3);
                              } catch (Throwable var48) {
                                 if (var3.liiiIlllIl++ == 0) {
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      var6.iliIiiliiiii();
      var7.iliIiiliiiii();
      var8.iliIiiliiiii();
      if ((int)var36 == 0) {
         return new liIIliIliiIIliIl(var6, var7, var8, var4, 0, (boolean)((int)(var38 >>> 32)), 1, 0, 1.0F, 1.0F, 1.0F, 0.5F, 0.5F, 0.5F, 0.0F);
      } else {
         float var17 = (float)((int)(var34 >>> 32) - (int)var30 + 1);
         float var18 = (float)((int)var34 - (int)(var32 >>> 32) + 1);
         float var19 = (float)((int)(var36 >>> 32) - (int)var32 + 1);
         float var49 = (float)((int)var30 - var4.llilIIlIIl) + var17 * 0.5F;
         float var21 = (float)((int)(var32 >>> 32) - var4.ililIIlIIl) + var18 * 0.5F;
         float var50 = (float)((int)var32 - var4.IiilIIlIIl) + var19 * 0.5F;
         return new liIIliIliiIIliIl(var6, var7, var8, var4, (int)var36, (boolean)((int)(var38 >>> 32)), (int)var34 - (int)(var32 >>> 32) + 1, (int)(var32 >>> 32) - var4.ililIIlIIl, var17, var18, var19, var49, var21, var50, (float)((int)(var32 >>> 32) - var4.ililIIlIIl));
      }
   }

   public static lliiIIIliliiIIIl IliIlllilIi(iIilliIlIlilliIl schematic, IllliIIilllliIIi env) {
      lliiIIIliliiIIIl var2 = new lliiIIIliliiIIIl(schematic, env);
      iilIIiIill.execute(var2);
      return var2;
   }

   private static void Illlllllilll(IilIiIIililIiIIi wy, int info, int wz, int sink, int prep, Iillililillili d, iiIllIilIIlllIil wx, IlliIIIlllliIIIl sc) {
      if (wy.lllIlliiil != null) {
         Iilllilliill(wy.IllIlliiil, info, wy.lllIlliiil, 16777215, wz, sink, prep, d, wx, sc);
      }
   }

   private IiIlllllliIlllll() {
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(~((char)(var4[var5] << 3 | var4[var5] >>> 13))))) << 3 | (char)(~((char)(~((char)(var4[var5] << 3 | var4[var5] >>> 13))))) >>> 13))) - var5) ^ 11720) ^ 30601) + var5) + var5) - var5) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(~((char)(var4[var5] << 3 | var4[var5] >>> 13))))) << 3 | (char)(~((char)(~((char)(var4[var5] << 3 | var4[var5] >>> 13))))) >>> 13))) - var5) ^ 11720) ^ 30601) + var5) + var5) - var5) << 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void IIillIiliIil(float[][] a, int j, int i) {
      float[] var3 = a[j];
      a[j] = a[i];
      a[i] = var3;
   }

   private static void iliIiiliiiii(Iillililillili wx, IilIiIIililIiIIi solid, int wz, int sc, int prep, iiIllIilIIlllIil wy, iiIllIilIIlllIil info, IlliIIIlllliIIIl translucent) {
      long var13 = -1576859346490750950L;
      IilIiIIililIiIIi var8 = wx.liiiIIllIl(wz, sc + 1, prep);
      if (solid.IiIIlliiil) {
         if (solid.iIlIlliiil) {
            if (solid.illIlliiil == null && lllIIiIiillIIiIi.IilliliilIIi(1, solid.IllIlliiil) && var8.ilIIlliiil) {
               Illlllllilll(solid, 1, wz, sc, prep, wx, wy, translucent);
            }
         } else {
            iiIllIilIIlllIil var9 = solid.liIIlliiil ? info : wy;
            if (!class_2248.method_9607(solid.IlIIlliiil, var8.IlIIlliiil, class_2350.field_11036)) {
               translucent.IIiiIlllIl.method_43052(solid.IlIIlliiil.method_26190(translucent.iIiiIlllIl.method_10103(wz, sc, prep)));
               translucent.lIiiIlllIl.clear();
               solid.lIlIlliiil.method_68513(translucent.IIiiIlllIl, translucent.lIiiIlllIl);

               for(var13 ^= (0L ^ var13) & -1L << 32; (int)(var13 >>> 32) < translucent.lIiiIlllIl.size(); var13 += 4294967296L) {
                  List var11 = ((class_10889)translucent.lIiiIlllIl.get((int)(var13 >>> 32))).method_68509(class_2350.field_11036);

                  for(var13 ^= (0L ^ var13) & -1L >>> 32; (int)var13 < var11.size(); var13 ^= (var13 ^ var13 + (long)1) & -1L >>> 32) {
                     IIIllIIliIIl(wx, solid, (class_777)var11.get((int)var13), wz, sc, prep, false, var9, translucent);
                  }
               }
            }
         }
      }

      if (solid.IIlIlliiil != 0 && (var8.IIlIlliiil == solid.IIlIlliiil || var8.ilIIlliiil)) {
         IiIlliIliiIl(wx, solid, wz, sc, prep, wy, info, translucent, true);
      }

   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) << 3 | (char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) >>> 13) - var5) + '﹤') + var5) - '\ud990') - var5) << 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) << 3 | (char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) >>> 13) - var5) + '﹤') + var5) - '\ud990') - var5) >>> 7))) >>> 11 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) << 3 | (char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) >>> 13) - var5) + '﹤') + var5) - '\ud990') - var5) << 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) << 3 | (char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) >>> 13) - var5) + '﹤') + var5) - '\ud990') - var5) >>> 7))) << 5) >>> 5 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) << 3 | (char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) >>> 13) - var5) + '﹤') + var5) - '\ud990') - var5) << 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) << 3 | (char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) >>> 13) - var5) + '﹤') + var5) - '\ud990') - var5) >>> 7))) >>> 11 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) << 3 | (char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) >>> 13) - var5) + '﹤') + var5) - '\ud990') - var5) << 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) << 3 | (char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) >>> 13) - var5) + '﹤') + var5) - '\ud990') - var5) >>> 7))) << 5) << 11) << 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) << 3 | (char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) >>> 13) - var5) + '﹤') + var5) - '\ud990') - var5) << 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) << 3 | (char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) >>> 13) - var5) + '﹤') + var5) - '\ud990') - var5) >>> 7))) >>> 11 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) << 3 | (char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) >>> 13) - var5) + '﹤') + var5) - '\ud990') - var5) << 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) << 3 | (char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) >>> 13) - var5) + '﹤') + var5) - '\ud990') - var5) >>> 7))) << 5) >>> 5 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) << 3 | (char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) >>> 13) - var5) + '﹤') + var5) - '\ud990') - var5) << 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) << 3 | (char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) >>> 13) - var5) + '﹤') + var5) - '\ud990') - var5) >>> 7))) >>> 11 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) << 3 | (char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) >>> 13) - var5) + '﹤') + var5) - '\ud990') - var5) << 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) << 3 | (char)((char)((char)((char)(var4[var5] - 9593) + var5) ^ var5) + var5) >>> 13) - var5) + '﹤') + var5) - '\ud990') - var5) >>> 7))) << 5) << 11) >>> 13) ^ var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static {
      lIlIIiIill = new class_2350[]{class_2350.field_11033, class_2350.field_11036, class_2350.field_11043, class_2350.field_11035, class_2350.field_11039, class_2350.field_11034};
      lilIIiIill = new float[]{0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F};
      iilIIiIill = Executors.newSingleThreadExecutor((r) -> {
         Thread var1 = new Thread(r, Iiilliiliiil<invokedynamic>());
         var1.setDaemon(true);
         var1.setPriority(4);
         return var1;
      });
   }

   static iiiIiIilIIIliIil IilliliilIIi(Iillililillili job, int prep, iIiiIIIlIliiIIIl unionLayer) {
      long var18 = 1184008703355081993L;
      long var20 = -7723795377844555793L;
      long var22 = 4131690388881068122L;
      long var24 = 1471755193137348188L;
      IlliIIIlllliIIIl var3 = new IlliIIIlllliIIIl();
      iiIllIilIIlllIil var4 = new iiIllIilIIlllIil(1, 512);
      iiIllIilIIlllIil var5 = new iiIllIilIIlllIil(1, 64);
      var18 ^= ((long)(job.ililIIlIIl + prep) << 32 ^ var18) & -1L << 32;

      for(long var28 = var18 ^ (0L ^ var18) & -1L >>> 32; (int)var28 < job.lillIIlIIl.length; var28 ^= (var28 ^ var28 + (long)1) & -1L >>> 32) {
         if (unionLayer != null && unionLayer.lllIllllIl) {
            return null;
         }

         IiliIIIililiIIIi var8 = job.lillIIlIIl[(int)var28];
         var20 ^= ((long)((int)(var28 >>> 32) - job.IIilIIlIIl[(int)var28]) << 32 ^ var20) & -1L << 32;
         if ((int)(var20 >>> 32) >= 0 && (int)(var20 >>> 32) < var8.liIIIlliil) {
            IilIiIIililIiIIi[] var10 = job.iIilIIlIIl[(int)var28];

            for(var20 ^= (0L ^ var20) & -1L >>> 32; (int)var20 < var8.iiIIIlliil; var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32) {
               for(var22 ^= (0L ^ var22) & -1L << 32; (int)(var22 >>> 32) < var8.IiIIIlliil; var22 += 4294967296L) {
                  var22 ^= ((long)var8.iliIiiliiiii((int)(var22 >>> 32), (int)(var20 >>> 32), (int)var20) ^ var22) & -1L >>> 32;
                  if ((int)var22 >= 0 && (int)var22 < var10.length) {
                     IilIiIIililIiIIi var14 = var10[(int)var22];
                     if (!var14.llIIlliiil) {
                        var24 ^= ((long)(job.iillIIlIIl[(int)var28] + (int)(var22 >>> 32)) << 32 ^ var24) & -1L << 32;
                        var24 ^= ((long)(job.lIilIIlIIl[(int)var28] + (int)var20) ^ var24) & -1L >>> 32;
                        if (!job.IlilIIlIIl[(int)var28] || job.iIlIlllllill((int)(var24 >>> 32), (int)(var28 >>> 32), (int)var24) == (int)var28) {
                           try {
                              iliIiiliiiii(job, var14, (int)(var24 >>> 32), (int)(var28 >>> 32), (int)var24, var4, var5, var3);
                           } catch (Throwable var26) {
                              if (var3.liiiIlllIl++ == 0) {
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      var4.iliIiiliiiii();
      var5.iliIiiliiiii();
      return new iiiIiIilIIIliIil(var4, var5, prep);
   }

   private static void IIIllIIliIIl(Iillililillili info, IilIiIIililIiIIi ao, class_777 q, int sc, int prep, int sink, boolean wy, iiIllIilIIlllIil wx, IlliIIIlllliIIIl wz) {
      long var21 = -8597031319890449427L;
      long var23 = 7512474105423400249L;
      long var25 = 7801973063556396981L;
      long var27 = 5760589784368964182L;
      class_2350 var9 = q.comp_3723();
      var21 ^= ((long)(var9 == null ? 1 : var9.ordinal()) << 32 ^ var21) & -1L << 32;

      for(var21 ^= (0L ^ var21) & -1L >>> 32; (int)var21 < 4; var21 ^= (var21 ^ var21 + (long)1) & -1L >>> 32) {
         Vector3fc var12 = q.method_76648((int)var21);
         wz.IliiIlllIl[(int)var21][0] = var12.x();
         wz.IliiIlllIl[(int)var21][1] = var12.y();
         wz.IliiIlllIl[(int)var21][2] = var12.z();
         long var13 = q.method_76649((int)var21);
         wz.lliiIlllIl[(int)var21][0] = class_5611.method_76641(var13);
         wz.lliiIlllIl[(int)var21][1] = class_5611.method_76642(var13);
      }

      int[] var11 = lllIIiIiillIIiIi.llIililIIi[(int)(var21 >>> 32)];
      if (!lllIIiIiillIIiIi.lIiiIiIlilli(wz.IliiIlllIl[0], wz.IliiIlllIl[1], wz.IliiIlllIl[2], wz.IliiIlllIl[3], (float)var11[0], (float)var11[1], (float)var11[2])) {
         IIillIiliIil(wz.IliiIlllIl, 1, 3);
         IIillIiliIil(wz.lliiIlllIl, 1, 3);
      }

      var23 ^= ((long)(q.method_3360() ? ao.IliIlllilIi(q.comp_3722(), info.iiilIIlIIl.IilliliilIIi()) : 16777215) << 32 ^ var23) & -1L << 32;
      float var29 = q.comp_3725() ? iIlliIIlIllliIIl.lIiiIiIlilli((int)(var21 >>> 32)) : 1.0F;
      if (wy && q.comp_3725()) {
         IlIlllIlilIl(info, (int)(var21 >>> 32), sc, prep, sink, wz);
      } else {
         for(var23 ^= (0L ^ var23) & -1L >>> 32; (int)var23 < 4; var23 ^= (var23 ^ var23 + (long)1) & -1L >>> 32) {
            wz.iliiIlllIl[(int)var23] = 3;
         }
      }

      var23 ^= ((long)(iIlliIIlIllliIIl.iIlIlllllill(wz.iliiIlllIl[0], wz.iliiIlllIl[1], wz.iliiIlllIl[2], wz.iliiIlllIl[3]) ? 1 : 0) ^ var23) & -1L >>> 32;
      float var15 = (float)(sc - info.llilIIlIIl);
      float var16 = (float)(prep - info.ililIIlIIl);
      float var17 = (float)(sink - info.IiilIIlIIl);

      for(var25 ^= (0L ^ var25) & -1L << 32; (int)(var25 >>> 32) < 4; var25 += 4294967296L) {
         var25 ^= ((long)((int)var23 + (int)(var25 >>> 32) & 3) ^ var25) & -1L >>> 32;
         var27 ^= ((long)iIlliIIlIllliIIl.iliIiiliiiii((int)(var23 >>> 32), var29 * iIlliIIlIllliIIl.liiiIIllIl(wz.iliiIlllIl[(int)var25])) << 32 ^ var27) & -1L << 32;
         wx.IilliliilIIi(var15 + wz.IliiIlllIl[(int)var25][0], var16 + wz.IliiIlllIl[(int)var25][1], var17 + wz.IliiIlllIl[(int)var25][2], wz.lliiIlllIl[(int)var25][0], wz.lliiIlllIl[(int)var25][1], iiIllIilIIlllIil.liiiIIllIl((int)(var27 >>> 32)));
      }

   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + '꦳') + var5) + var5) - var5) ^ 31333))) ^ var5) - '켊') ^ '칾'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static lIlIlilliIlIlill liiiIIllIl(Iillililillili prepared, int layer) {
      lIlIlilliIlIlill var2 = new lIlIlilliIlIlill(prepared, layer);
      iilIIiIill.execute(var2);
      return var2;
   }

   private static void IIlllIlliIll(Iillililillili solid, IilIiIIililIiIIi sc, int wx, int info, int prep, iiIllIilIIlllIil wy, IlliIIIlllliIIIl wz) {
      long var9 = -2376488129507164192L;

      for(long var11 = var9 ^ (0L ^ var9) & -1L << 32; (int)(var11 >>> 32) < 6; var11 += 4294967296L) {
         if (lllIIiIiillIIiIi.IilliliilIIi((int)(var11 >>> 32), sc.IllIlliiil)) {
            int[] var8 = lllIIiIiillIIiIi.llIililIIi[(int)(var11 >>> 32)];
            if (solid.lIiiIiIlilli(wx + var8[0], info + var8[1], prep + var8[2])) {
               continue;
            }
         }

         Illlllllilll(sc, (int)(var11 >>> 32), wx, info, prep, solid, wy, wz);
      }

   }
}
