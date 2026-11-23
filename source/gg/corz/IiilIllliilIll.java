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
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IiilIllliilIll {
   public static final int[][] lIIllIliliIIllIlil = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
   private IilliIillilliIil IllIlIlillllIlIlil;
   private int lilIlIliliilIlIlil;
   public static final int llIIlIlililIIlIlil = 4;
   private static final double[] IlIllIlilllIllIlil = new double[]{(double)0.5F, (double)0.5F, (double)0.5F};
   public static final int iliiIIlilIiiiIIlil = 0;
   public static final int iiIIlIlilIIlIlIlil = 1;
   private int IIiIlIlillIiIlIlil;
   public static final int liiiIIliliiiiIIlil = 1;
   public static final int IIIIlIlillIIIlIlil = 2;
   public static final int lIlIlIliliIlIlIlil = 12;
   private int illIlIlilIilIlIlil;
   private String iiiIlIlilIIIllIlil;
   private int iIiIlIlilIliIlIlil;
   public static final int iIIIlIlilIlIIlIlil = 3;
   private boolean IiiIlIlilliiIlIlil;
   private boolean lliIlIlililiIlIlil;
   private static final double[][] IIlllIlillIlllIlil = new double[][]{{(double)0.0F, (double)-1.0F, (double)0.0F}, {(double)0.0F, (double)1.0F, (double)0.0F}, {(double)0.0F, (double)0.0F, (double)-1.0F}, {(double)0.0F, (double)0.0F, (double)1.0F}, {(double)-1.0F, (double)0.0F, (double)0.0F}, {(double)1.0F, (double)0.0F, (double)0.0F}};
   public static final double liIllIliliiIllIlil = 0.1;
   private static final double ilIllIlilIiIllIlil = 1.0E-7;
   public static final int IiIIlIlilliIIlIlil = 5;

   static double[][] IIillIiliIil(double[] box) {
      double var1 = box[3] - box[0];
      double var3 = box[4] - box[1];
      double var5 = box[5] - box[2];
      if (!(var1 <= (double)0.0F) && !(var3 <= (double)0.0F) && !(var5 <= (double)0.0F)) {
         double var7 = (double)1.0F / (var1 * (double)2.0F + (double)1.0F);
         double var9 = (double)1.0F / (var3 * (double)2.0F + (double)1.0F);
         double var11 = (double)1.0F / (var5 * (double)2.0F + (double)1.0F);
         double var13 = ((double)1.0F - Math.floor((double)1.0F / var7) * var7) / (double)2.0F;
         double var15 = ((double)1.0F - Math.floor((double)1.0F / var11) * var11) / (double)2.0F;
         ArrayList var17 = new ArrayList();

         for(double var18 = (double)0.0F; var18 <= (double)1.0F; var18 += var7) {
            for(double var20 = (double)0.0F; var20 <= (double)1.0F; var20 += var9) {
               for(double var22 = (double)0.0F; var22 <= (double)1.0F; var22 += var11) {
                  var17.add(new double[]{box[0] + (box[3] - box[0]) * var18 + var13, box[1] + (box[4] - box[1]) * var20, box[2] + (box[5] - box[2]) * var22 + var15});
               }
            }
         }

         return (double[][])var17.toArray(new double[0][]);
      } else {
         return new double[0][];
      }
   }

   public static boolean IIIilIIiiIIi(double[] face, int reach, double eye) {
      if (reach >= 0 && reach < 6) {
         double[] var4 = IIlllIlillIlllIlil[reach];
         double var5 = face[0] - ((double)0.5F + (double)0.5F * var4[0]);
         double var7 = face[1] - ((double)0.5F + (double)0.5F * var4[1]);
         double var9 = face[2] - ((double)0.5F + (double)0.5F * var4[2]);
         double var11 = var5 * var4[0] + var7 * var4[1] + var9 * var4[2];
         if (var11 < 0.1) {
            return false;
         } else {
            return var5 * var5 + var7 * var7 + var9 * var9 <= eye * eye;
         }
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-var4[var5]) ^ var5) - 15383) ^ var5))) - var5) >>> 15 | (char)((char)(-((char)((char)((char)((char)(-var4[var5]) ^ var5) - 15383) ^ var5))) - var5) << 1)) ^ var5) >>> 10 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-var4[var5]) ^ var5) - 15383) ^ var5))) - var5) >>> 15 | (char)((char)(-((char)((char)((char)((char)(-var4[var5]) ^ var5) - 15383) ^ var5))) - var5) << 1)) ^ var5) << 6) >>> 11 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-var4[var5]) ^ var5) - 15383) ^ var5))) - var5) >>> 15 | (char)((char)(-((char)((char)((char)((char)(-var4[var5]) ^ var5) - 15383) ^ var5))) - var5) << 1)) ^ var5) >>> 10 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-var4[var5]) ^ var5) - 15383) ^ var5))) - var5) >>> 15 | (char)((char)(-((char)((char)((char)((char)(-var4[var5]) ^ var5) - 15383) ^ var5))) - var5) << 1)) ^ var5) << 6) << 5) + var5) ^ 11450) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '랪') >>> 1 | (char)(var4[var5] ^ '랪') << 15) ^ 10337) >>> 1 | (char)((char)((char)(var4[var5] ^ '랪') >>> 1 | (char)(var4[var5] ^ '랪') << 15) ^ 10337) << 15) ^ var5) - 9617) >>> 6 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '랪') >>> 1 | (char)(var4[var5] ^ '랪') << 15) ^ 10337) >>> 1 | (char)((char)((char)(var4[var5] ^ '랪') >>> 1 | (char)(var4[var5] ^ '랪') << 15) ^ 10337) << 15) ^ var5) - 9617) << 10) ^ var5) ^ var5) + var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '랪') >>> 1 | (char)(var4[var5] ^ '랪') << 15) ^ 10337) >>> 1 | (char)((char)((char)(var4[var5] ^ '랪') >>> 1 | (char)(var4[var5] ^ '랪') << 15) ^ 10337) << 15) ^ var5) - 9617) >>> 6 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '랪') >>> 1 | (char)(var4[var5] ^ '랪') << 15) ^ 10337) >>> 1 | (char)((char)((char)(var4[var5] ^ '랪') >>> 1 | (char)(var4[var5] ^ '랪') << 15) ^ 10337) << 15) ^ var5) - 9617) << 10) ^ var5) ^ var5) + var5) << 7) ^ 16999) ^ 17247) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static boolean Ililllililil(double[] by, double[] a, int b, int bz, int bx) {
      long var25 = 8873176426601403359L;
      double var5 = (double)0.0F;
      double var7 = (double)1.0F;
      int[] var9 = new int[]{b, bz, bx};

      for(long var27 = var25 ^ (0L ^ var25) & -1L << 32; (int)(var27 >>> 32) < 3; var27 += 4294967296L) {
         double var11 = by[(int)(var27 >>> 32)];
         double var13 = a[(int)(var27 >>> 32)] - by[(int)(var27 >>> 32)];
         double var15 = (double)var9[(int)(var27 >>> 32)];
         double var17 = (double)var9[(int)(var27 >>> 32)] + (double)1.0F;
         if (Math.abs(var13) < 1.0E-12) {
            if (var11 <= var15 || var11 >= var17) {
               return false;
            }
         } else {
            double var19 = (var15 - var11) / var13;
            double var21 = (var17 - var11) / var13;
            if (var19 > var21) {
               double var23 = var19;
               var19 = var21;
               var21 = var23;
            }

            var5 = Math.max(var5, var19);
            var7 = Math.min(var7, var21);
            if (var5 >= var7) {
               return false;
            }
         }
      }

      return var7 - var5 > 1.0E-7;
   }

   private liIIlIiliiIIlIil Illlllllilll() {
      long var2 = 4692192673008182569L;
      var2 ^= ((long)(this.lliIlIlililiIlIlil && !this.IiiIlIlilliiIlIlil ? 1 : 0) << 32 ^ var2) & -1L << 32;
      this.IiiIlIlilliiIlIlil = this.IiiIlIlilliiIlIlil || (int)(var2 >>> 32) != 0;
      this.IllIlIlillllIlIlil = IilliIillilliIil.IillIilIil;
      this.illIlIlilIilIlIlil = 0;
      ++this.iIiIlIlilIliIlIlil;
      return (int)(var2 >>> 32) != 0 ? liIIlIiliiIIlIil.lliliiIIil : liIIlIiliiIIlIil.iilliiIIil;
   }

   public liIIlIiliiIIlIil IIIllIIliIIl(ilIiliIlIiIiliIl s) {
      long var3 = -3633695660515804083L;
      if (s.ilIiiiiIll) {
         if (IlIlllIlilIl(this.IllIlIlillllIlIlil) && !s.IiIiiiiIll) {
            return this.IIlllIlliIll(Iilililiiili<invokedynamic>());
         } else {
            switch (this.IllIlIlillllIlIlil.ordinal()) {
               case 0:
                  if (!s.IiIiiiiIll) {
                     return liIIlIiliiIIlIil.iilliiIIil;
                  } else if (s.liIiiiiIll) {
                     if (!s.llliiiiIll) {
                        return this.Illlllllilll();
                     }

                     this.lliIlIlililiIlIlil = true;
                     this.IiIlliIliiIl(IilliIillilliIil.llllIilIil);
                     return liIIlIiliiIIlIil.iIiliiIIil;
                  } else if (!s.lIliiiiIll) {
                     return this.IIlllIlliIll(Iilililiiili<invokedynamic>());
                  } else if (!s.iiIiiiiIll) {
                     return this.IIlllIlliIll(Iilililiiili<invokedynamic>());
                  } else {
                     if (!s.IIliiiiIll) {
                        return this.IIlllIlliIll(Iilililiiili<invokedynamic>());
                     }

                     this.lliIlIlililiIlIlil = true;
                     this.IiIlliIliiIl(IilliIillilliIil.iIllIilIil);
                     return liIIlIiliiIIlIil.IIiliiIIil;
                  }
               case 1:
                  if (s.iIliiiiIll) {
                     if (!s.llliiiiIll) {
                        return this.Illlllllilll();
                     }

                     this.IiIlliIliiIl(IilliIillilliIil.llllIilIil);
                     return liIIlIiliiIIlIil.iIiliiIIil;
                  } else if (!s.lIliiiiIll) {
                     return this.IIlllIlliIll(Iilililiiili<invokedynamic>());
                  } else if (!s.iiIiiiiIll) {
                     return this.IIlllIlliIll(Iilililiiili<invokedynamic>());
                  } else if (!s.IIliiiiIll) {
                     return this.IIlllIlliIll(Iilililiiili<invokedynamic>());
                  } else {
                     if (!s.illiiiiIll) {
                        if (++this.illIlIlilIilIlIlil > 12) {
                           return this.IIlllIlliIll(Iilililiiili<invokedynamic>());
                        }

                        return liIIlIiliiIIlIil.IIiliiIIil;
                     }

                     ++this.IIiIlIlillIiIlIlil;
                     this.IiIlliIliiIl(IilliIillilliIil.IlllIilIil);
                     return liIIlIiliiIIlIil.lIiliiIIil;
                  }
               case 2:
                  if (s.iIliiiiIll) {
                     if (!s.llliiiiIll) {
                        return this.Illlllllilll();
                     }

                     this.IiIlliIliiIl(IilliIillilliIil.llllIilIil);
                     return liIIlIiliiIIlIil.iIiliiIIil;
                  } else if (!s.IlliiiiIll && ++this.illIlIlilIilIlIlil < s.liliiiiIll) {
                     return liIIlIiliiIIlIil.iilliiIIil;
                  } else {
                     if (this.lilIlIliliilIlIlil < 1 && s.lIliiiiIll && s.iiIiiiiIll && s.IIliiiiIll) {
                        ++this.lilIlIliliilIlIlil;
                        this.IiIlliIliiIl(IilliIillilliIil.iIllIilIil);
                        return liIIlIiliiIIlIil.iilliiIIil;
                     }

                     return this.IIlllIlliIll(s.IlliiiiIll ? Iilililiiili<invokedynamic>() : Iilililiiili<invokedynamic>());
                  }
               case 3:
                  if (!s.IiliiiiIll) {
                     if (!s.IiIiiiiIll) {
                        return this.IIlllIlliIll(Iilililiiili<invokedynamic>());
                     }

                     if (++this.illIlIlilIilIlIlil > 12) {
                        return this.IIlllIlliIll(Iilililiiili<invokedynamic>());
                     }

                     return liIIlIiliiIIlIil.iIiliiIIil;
                  }

                  this.IiIlliIliiIl(IilliIillilliIil.illlIilIil);
                  return liIIlIiliiIIlIil.IliliiIIil;
               case 4:
                  this.IiIlliIliiIl(IilliIillilliIil.IillIilIil);
                  if (this.lliIlIlililiIlIlil && !this.IiiIlIlilliiIlIlil) {
                     this.IiiIlIlilliiIlIlil = true;
                     return liIIlIiliiIIlIil.lliliiIIil;
                  }

                  return liIIlIiliiIIlIil.iilliiIIil;
               case 5:
                  if (this.lliIlIlililiIlIlil && !this.IiiIlIlilliiIlIlil) {
                     this.IiiIlIlilliiIlIlil = true;
                     return liIIlIiliiIIlIil.lliliiIIil;
                  }

                  return liIIlIiliiIIlIil.iilliiIIil;
               case 6:
               default:
                  return liIIlIiliiIIlIil.iilliiIIil;
            }
         }
      } else {
         var3 ^= ((long)(this.lliIlIlililiIlIlil && !this.IiiIlIlilliiIlIlil && this.IllIlIlillllIlIlil != IilliIillilliIil.lIllIilIil ? 1 : 0) << 32 ^ var3) & -1L << 32;
         this.iliIiiliiiii();
         return (int)(var3 >>> 32) != 0 ? liIIlIiliiIIlIil.lliliiIIil : liIIlIiliiIIlIil.iilliiIIil;
      }
   }

   public int IilliliilIIi() {
      return this.IIiIlIlillIiIlIlil;
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6388891559204202003L ^ Long.rotateLeft(6332925777645668137L, 28) ^ -4207835454344752061L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 3813938971219847174L ^ Long.rotateLeft(-8688306713878928525L, 55) ^ 7479577279328163998L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 4435865863964910232L ^ Long.rotateLeft(-6484298575978993757L, 49) ^ -3973503465168098730L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 7576307173745047573L ^ Long.rotateLeft(-3613779897293539667L, 29) ^ -3677719300744244700L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2380391512611139299L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2794014413089206107L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -1894568626156461092L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7236790489202867102L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 229550664615960321L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1905235423670312800L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIiilIiiiIii<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iliilliiilii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iiiiliiiiiii<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIIIllIIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iIIIlIlIIl<invokedynamic>());
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
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(-((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - 6174) + 10177) ^ var5))) ^ 25696) ^ var5) - 32677))))))) - var5) + var5) << 12 | (char)((char)((char)(~((char)(-((char)(-((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - 6174) + 10177) ^ var5))) ^ 25696) ^ var5) - 32677))))))) - var5) + var5) >>> 4) << 15 | (char)((char)((char)((char)(~((char)(-((char)(-((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - 6174) + 10177) ^ var5))) ^ 25696) ^ var5) - 32677))))))) - var5) + var5) << 12 | (char)((char)((char)(~((char)(-((char)(-((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - 6174) + 10177) ^ var5))) ^ 25696) ^ var5) - 32677))))))) - var5) + var5) >>> 4) >>> 1) ^ '\udda5'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static int Illillliilli(boolean[] hotbarIsGlowstone) {
      long var3 = -911721362965933792L;
      var3 ^= ((long)Math.min(9, hotbarIsGlowstone.length) << 32 ^ var3) & -1L << 32;

      for(long var6 = var3 ^ (0L ^ var3) & -1L >>> 32; (int)var6 < (int)(var6 >>> 32); var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32) {
         if (hotbarIsGlowstone[(int)var6]) {
            return (int)var6;
         }
      }

      return -1;
   }

   public static lIIliiiliIIliiil Iilllilliill(double[] solid, boolean[] box, boolean[] placeable) {
      long var17 = 7485627197049581438L;
      long var19 = 7115768799822087728L;
      long var21 = -4126889809932245293L;
      long var23 = -3788816965566179459L;
      long var15 = -331950229801999849L;
      var15 ^= ((long)lIIllIliliIIllIlil.length << 32 ^ var15) & -1L << 32;
      int[] var4 = new int[(int)(var15 >>> 32)];
      var15 ^= (0L ^ var15) & -1L >>> 32;
      var17 ^= (0L ^ var17) & -1L << 32;
      boolean[] var7 = new boolean[(int)(var15 >>> 32)];
      double[][] var8 = IIillIiliIil(solid);
      var17 ^= ((long)var8.length ^ var17) & -1L >>> 32;

      for(var19 ^= (0L ^ var19) & -1L << 32; (int)(var19 >>> 32) < (int)var17; var19 += 4294967296L) {
         double[] var11 = var8[(int)(var19 >>> 32)];
         var19 ^= (0L ^ var19) & -1L >>> 32;
         var21 ^= (0L ^ var21) & -1L << 32;

         for(var21 ^= (0L ^ var21) & -1L >>> 32; (int)var21 < (int)(var15 >>> 32); var21 ^= (var21 ^ var21 + (long)1) & -1L >>> 32) {
            var7[(int)var21] = Ililllililil(var11, IlIllIlilllIllIlil, lIIllIliliIIllIlil[(int)var21][0], 0, lIIllIliliIIllIlil[(int)var21][1]);
            var19 ^= ((long)((int)var19 | var7[(int)var21]) ^ var19) & -1L >>> 32;
            var21 ^= ((long)((int)(var21 >>> 32) | (var7[(int)var21] && box[(int)var21] ? 1 : 0)) << 32 ^ var21) & -1L << 32;
         }

         if ((int)var19 != 0) {
            var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32;
            if ((int)(var21 >>> 32) != 0) {
               var17 += 4294967296L;
            } else {
               for(var21 ^= (0L ^ var21) & -1L >>> 32; (int)var21 < (int)(var15 >>> 32); var21 ^= (var21 ^ var21 + (long)1) & -1L >>> 32) {
                  if (var7[(int)var21] && placeable[(int)var21] && !box[(int)var21]) {
                     ++var4[(int)var21];
                  }
               }
            }
         }
      }

      var23 ^= (-4294967296L ^ var23) & -1L << 32;

      for(var17 ^= (0L ^ var17) & -1L >>> 32; (int)var17 < (int)(var15 >>> 32); var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32) {
         if (var4[(int)var17] > 0 && ((int)(var23 >>> 32) == -1 || var4[(int)var17] > var4[(int)(var23 >>> 32)])) {
            var23 ^= ((long)((int)var17) << 32 ^ var23) & -1L << 32;
         }
      }

      return new lIIliiiliIIliiil((int)(var23 >>> 32), (int)(var23 >>> 32) == -1 ? 0 : var4[(int)(var23 >>> 32)], (int)var15, (int)(var17 >>> 32));
   }

   public static int IlIillIiilIi(double[] reach, double[] eye, double look) {
      long var10 = -2843649431997593424L;
      var10 ^= (-4294967296L ^ var10) & -1L << 32;
      double var5 = (double)-2.0F;

      for(var10 ^= (0L ^ var10) & -1L >>> 32; (int)var10 < 6; var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
         if (IIIilIIiiIIi(reach, (int)var10, look)) {
            double var8 = IIlilIliiIli(reach, eye, IIlllIlillIlllIlil[(int)var10]);
            if (var8 > var5) {
               var5 = var8;
               var10 ^= ((long)((int)var10) << 32 ^ var10) & -1L << 32;
            }
         }
      }

      return (int)(var10 >>> 32);
   }

   public IilliIillilliIil IliIlllilIi() {
      return this.IllIlIlillllIlIlil;
   }

   public static int Iiilliiliiil(int dir) {
      switch (dir) {
         case 0 -> {
            return 1;
         }
         case 1 -> {
            return 0;
         }
         case 2 -> {
            return 3;
         }
         case 3 -> {
            return 2;
         }
         case 4 -> {
            return 5;
         }
         case 5 -> {
            return 4;
         }
         default -> {
            return dir;
         }
      }
   }

   public String liiiIIllIl() {
      return this.iiiIlIlilIIIllIlil;
   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 3103) + '튷'))) - 23611) - '징') >>> 11 | (char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 3103) + '튷'))) - 23611) - '징') << 5) + var5) + 17435) ^ var5) + var5))) - '鋒'))))) - '텷') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int iIlIlllllill() {
      return this.lilIlIliliilIlIlil;
   }

   public IiilIllliilIll() {
      this.IllIlIlillllIlIlil = IilliIillilliIil.lIllIilIil;
      this.iiiIlIlilIIIllIlil = "";
   }

   private static double IIlilIliiIli(double[] eye, double[] look, double[] n) {
      double var3 = (double)0.5F + (double)0.5F * n[0] - eye[0];
      double var5 = (double)0.5F + (double)0.5F * n[1] - eye[1];
      double var7 = (double)0.5F + (double)0.5F * n[2] - eye[2];
      double var9 = Math.sqrt(var3 * var3 + var5 * var5 + var7 * var7);
      double var11 = Math.sqrt(look[0] * look[0] + look[1] * look[1] + look[2] * look[2]);
      return !(var9 < 1.0E-9) && !(var11 < 1.0E-9) ? (var3 * look[0] + var5 * look[1] + var7 * look[2]) / (var9 * var11) : (double)-1.0F;
   }

   private static boolean IlIlllIlilIl(IilliIillilliIil s) {
      return s == IilliIillilliIil.iIllIilIil || s == IilliIillilliIil.IlllIilIil;
   }

   public int lIiiIiIlilli() {
      return this.iIiIlIlilIliIlIlil;
   }

   private liIIlIiliiIIlIil IIlllIlliIll(String reason) {
      long var3 = 325927817359126711L;
      this.iiiIlIlilIIIllIlil = reason;
      var3 ^= ((long)(this.lliIlIlililiIlIlil && !this.IiiIlIlilliiIlIlil ? 1 : 0) << 32 ^ var3) & -1L << 32;
      this.IiiIlIlilliiIlIlil = this.IiiIlIlilliiIlIlil || (int)(var3 >>> 32) != 0;
      this.IllIlIlillllIlIlil = IilliIillilliIil.lillIilIil;
      this.illIlIlilIilIlIlil = 0;
      ++this.iIiIlIlilIliIlIlil;
      return (int)(var3 >>> 32) != 0 ? liIIlIiliiIIlIil.lliliiIIil : liIIlIiliiIIlIil.iilliiIIil;
   }

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '\udb8f') + var5) << 1 | (char)((char)((char)(var4[var5] ^ var5) - '\udb8f') + var5) >>> 15) + var5) + var5)))) - var5) - '悔') ^ var5) + var5) ^ var5) + 27619) - 17719) ^ var5) ^ 28887))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iliIiiliiiii() {
      this.IllIlIlillllIlIlil = IilliIillilliIil.lIllIilIil;
      this.illIlIlilIilIlIlil = 0;
      this.lilIlIliliilIlIlil = 0;
      this.IIiIlIlillIiIlIlil = 0;
      this.iIiIlIlilIliIlIlil = 0;
      this.lliIlIlililiIlIlil = false;
      this.IiiIlIlilliiIlIlil = false;
      this.iiiIlIlilIIIllIlil = "";
   }

   public static int IiIiliIiiiIi(boolean[] look, int reach, double[] anchorDir, double[] eye, double neighborSolid) {
      long var14 = -171151089260271415L;
      var14 ^= (-4294967296L ^ var14) & -1L << 32;
      double var7 = (double)-2.0F;

      for(var14 ^= (0L ^ var14) & -1L >>> 32; (int)var14 < 6; var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32) {
         if ((int)var14 != reach && (int)var14 < look.length && look[(int)var14]) {
            double[] var10 = IIlllIlillIlllIlil[(int)var14];
            double[] var11 = new double[]{anchorDir[0] - var10[0], anchorDir[1] - var10[1], anchorDir[2] - var10[2]};
            if (IIIilIIiiIIi(var11, Iiilliiliiil((int)var14), neighborSolid)) {
               double var12 = IIlilIliiIli(anchorDir, eye, var10);
               if (var12 > var7) {
                  var7 = var12;
                  var14 ^= ((long)((int)var14) << 32 ^ var14) & -1L << 32;
               }
            }
         }
      }

      return (int)(var14 >>> 32);
   }

   private void IiIlliIliiIl(IilliIillilliIil next) {
      this.IllIlIlillllIlIlil = next;
      this.illIlIlilIilIlIlil = 0;
      ++this.iIiIlIlilIliIlIlil;
   }
}
