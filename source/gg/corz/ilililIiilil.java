package gg.corz;

final class ilililIiilil {
   private final int IliiIIiilliiIIii;
   private final iliIlilIiiIlil liIiIIiiiiIiIIii;
   private lIiiilIliIiiilIl IIIIlIiilIIIlIii;
   private int IiIIlIiiliIIlIii;
   private final double IiliIIiililiIIii;
   private final boolean liiiIIiiiiiiIIii;
   private boolean llIIlIiiilIIlIii;
   private double iiIIlIiiIIlIlIii;
   private final double IIliIIiilIliIIii;
   private final double lIiiIIiiiIiiIIii;
   private final double iiliIIiiIIiiIIii;
   private final double iIliIIiiIlliIIii;
   private boolean iIIIlIiiIlIIlIii;
   private final double llliIIiiilliIIii;
   private final boolean iliiIIiiIiiiIIii;

   lIiiilIliIiiilIl IliIlllilIi() {
      double var1 = this.iiliIIiiIIiiIIii == (double)0.0F && this.lIiiIIiiiIiiIIii == (double)0.0F ? (double)0.0F : StrictMath.atan2(this.lIiiIIiiiIiiIIii, this.iiliIIiiIIiiIIii);
      int var3 = -1;

      for(int var4 = 0; this.IIIIlIiilIIIlIii == null || !((double)var4 - 2.2 - (double)9.5F >= this.IIIIlIiilIIIlIii.IilliliilIIi()); var4 = Math.min(this.IliiIIiilliiIIii, var4 + 3)) {
         this.liiiIIllIl(var4, var1);
         if (this.llIIlIiiilIIlIii) {
            break;
         }

         if (var3 >= 0) {
            ++var3;
         } else if (this.iIIIlIiiIlIIlIii) {
            var3 = 0;
         }

         if (var3 >= 2 || var4 >= this.IliiIIiilliiIIii) {
            break;
         }
      }

      return this.IIIIlIiilIIIlIii;
   }

   private boolean IilliliilIIi(int f) {
      return f == 0 || this.iliiIIiiIiiiIIii && f == (~(~-1522346808 ^ 119) ^ -1522346818) || this.iliiIIiiIiiiIIii && this.liiiIIiiiiiiIIii && f == ((1615032735 >>> 1 | 1615032735 << 31) + -57 - 11 ^ -1339967352);
   }

   private double IIIllIIliIIl(int rMax, int allow, int x, int az, int y, int ax, int aim, boolean step, double rMin, double z) {
      int var13 = y * y;
      int var14 = ax * ax;
      int var15 = 0;
      int var16 = Math.floorDiv(rMax - ax + az - 1, az) * az;
      int var17 = Math.floorDiv(x - ax + az - 1, az) * az;
      double var18 = (double)0.0F;

      for(int var20 = var16; var20 <= rMax + ax; var20 += az) {
         int var21 = var20 - rMax;

         for(int var22 = var17; var22 <= x + ax; var22 += az) {
            int var23 = var22 - x;
            int var24 = var21 * var21 + var23 * var23;
            if (var24 >= var13 && var24 <= var14) {
               ++var15;
               int var25 = this.liIiIIiiiiIiIIii.IliIlllilIi(var20, var22);
               if (var25 == Integer.MIN_VALUE) {
                  var18 += (double)0.5F;
               } else {
                  int var26 = var25 - allow - aim;
                  if (var26 > 0) {
                     double var27 = step ? 0.7 + 0.3 * ((double)var21 * rMin + (double)var23 * z) / Math.sqrt((double)var24) : 0.7;
                     var18 += var27 * (double)Math.min(var26, 30);
                  }
               }
            }
         }
      }

      return var15 == 0 ? (double)0.0F : var18 / (double)var15;
   }

   private void iIlIlllllill(int sx, int sz) {
      if (this.liIiIIiiiiIiIIii.llIliiiIiilIliiiIi + 400 > 12000) {
         this.llIIlIiiilIIlIii = true;
      } else {
         int var3 = this.liIiIIiiiiIiIIii.IliIlllilIi(sx, sz);
         if (var3 != Integer.MIN_VALUE) {
            int var4 = this.liIiIIiiiiIiIIii.liiiIIllIl(sx, var3, sz);
            if (this.IilliliilIIi(var4)) {
               if (this.IIIIlIiilIIIlIii != null) {
                  double var5 = (double)sx + (double)0.5F - this.IIliIIiilIliIIii;
                  double var7 = (double)sz + (double)0.5F - this.iIliIIiiIlliIIii;
                  if (Math.sqrt(var5 * var5 + var7 * var7) - (double)1.5F - (double)9.5F >= this.IIIIlIiilIIIlIii.IilliliilIIi()) {
                     return;
                  }
               }

               double var16 = this.lIiiIiIlilli(sx, sz);
               if (!(this.iiIIlIiiIIlIlIii <= 0.6) && !this.llIIlIiiilIIlIii) {
                  if (var4 == 0 || this.IIIIlIiilIIIlIii == null) {
                     if (Double.isNaN(var16)) {
                        int var17 = 0;

                        for(int var8 = 1; var8 <= 4; ++var8) {
                           if (this.liIiIIiiiiIiIIii.IliIlllilIi(sx + lliIilIiiliIilIi.iIIllllIIi[var8], sz + lliIilIiiliIilIi.IlIllllIIi[var8]) == var3) {
                              ++var17;
                           }
                        }

                        if (var17 < 2) {
                           return;
                        }
                     }

                     int var18 = sx;
                     int var19 = sz;

                     for(int var9 = 1; var9 < 9 && !this.llIIlIiiilIIlIii; ++var9) {
                        double var10 = this.lIiiIiIlilli(sx + lliIilIiiliIilIi.iIIllllIIi[var9], sz + lliIilIiiliIilIi.IlIllllIIi[var9]);
                        if (!Double.isNaN(var10)) {
                           if (this.iiIIlIiiIIlIlIii <= 0.6) {
                              return;
                           }

                           if (Double.isNaN(var16) || var10 < var16) {
                              var16 = var10;
                              var18 = sx + lliIilIiiliIilIi.iIIllllIIi[var9];
                              var19 = sz + lliIilIiiliIilIi.IlIllllIIi[var9];
                           }
                        }
                     }

                     if (!Double.isNaN(var16)) {
                        int var20 = 0;

                        while(true) {
                           if (var20 < 4 && !this.llIIlIiiilIIlIii) {
                              int var21 = var18;
                              int var11 = var19;
                              boolean var12 = false;

                              for(int var13 = 1; var13 < 9 && !this.llIIlIiiilIIlIii; ++var13) {
                                 double var14 = this.lIiiIiIlilli(var18 + lliIilIiiliIilIi.iIIllllIIi[var13], var19 + lliIilIiiliIilIi.IlIllllIIi[var13]);
                                 if (!Double.isNaN(var14) && var14 < var16) {
                                    var16 = var14;
                                    var21 = var18 + lliIilIiiliIilIi.iIIllllIIi[var13];
                                    var11 = var19 + lliIilIiiliIilIi.IlIllllIIi[var13];
                                    var12 = this.iiIIlIiiIIlIlIii <= 0.6;
                                 }
                              }

                              if (!var12 && (var21 != var18 || var11 != var19)) {
                                 var18 = var21;
                                 var19 = var11;
                                 ++var20;
                                 continue;
                              }

                              return;
                           }

                           return;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   ilililIiilil(IliIlillliIlil cz, double fromZ, double allowWater, double radius, double cx, int relaxed, boolean p, boolean fromX) {
      this.liiiIIiiiiiiIIii = fromX;
      this.liIiIIiiiiIiIIii = new iliIlilIiiIlil(cz, (int)Math.floor(fromZ), (int)Math.floor(allowWater));
      this.IIliIIiilIliIIii = fromZ;
      this.iIliIIiiIlliIIii = allowWater;
      this.llliIIiiilliIIii = radius;
      this.IiliIIiililiIIii = cx;
      this.IliiIIiilliiIIii = relaxed;
      this.iliiIIiiIiiiIIii = p;
      double var13 = radius - fromZ;
      double var15 = cx - allowWater;
      double var17 = Math.sqrt(var13 * var13 + var15 * var15);
      this.iiliIIiiIIiiIIii = var17 > Double.longBitsToDouble(4004584090139780728L ^ 604366371475056248L) ? var13 / var17 : (double)0.0F;
      this.lIiiIIiiiIiiIIii = var17 > Double.longBitsToDouble(-2397691537836745348L ^ -2213043953114555012L) ? var15 / var17 : (double)0.0F;
   }

   private void liiiIIllIl(int r, double start) {
      int var4 = r == 0 ? 1 : Math.max(6, (int)Math.ceil((Math.PI * 2D) * (double)r / (double)3.5F));
      int var5 = Integer.MIN_VALUE;
      int var6 = Integer.MIN_VALUE;

      for(int var7 = 0; var7 < var4 && !this.llIIlIiiilIIlIii; ++var7) {
         double var8 = start + (Math.PI * 2D) * (double)var7 / (double)var4;
         int var10 = (int)Math.floor(this.IIliIIiilIliIIii + (double)r * StrictMath.cos(var8));
         int var11 = (int)Math.floor(this.iIliIIiiIlliIIii + (double)r * StrictMath.sin(var8));
         if (var10 != var5 || var11 != var6) {
            var5 = var10;
            var6 = var11;
            this.iIlIlllllill(var10, var11);
         }
      }

   }

   private double lIiiIiIlilli(int x, int z) {
      this.iiIIlIiiIIlIlIii = Double.NaN;
      if (this.liIiIIiiiiIiIIii.llIliiiIiilIliiiIi + 400 > 12000) {
         this.llIIlIiiilIIlIii = true;
         return Double.NaN;
      } else {
         double var3 = (double)x + (double)0.5F - this.IIliIIiilIliIIii;
         double var5 = (double)z + (double)0.5F - this.iIliIIiiIlliIIii;
         double var7 = Math.sqrt(var3 * var3 + var5 * var5);
         if (!(var7 > (double)this.IliiIIiilliiIIii + (double)0.75F) && this.liIiIIiiiiIiIIii.iIlIlllllill(x, z)) {
            int var9 = this.liIiIIiiiiIiIIii.IliIlllilIi(x, z);
            if (var9 == Integer.MIN_VALUE) {
               return Double.NaN;
            } else {
               int var10 = this.liIiIIiiiiIiIIii.liiiIIllIl(x, var9, z);
               if (!this.IilliliilIIi(var10)) {
                  return Double.NaN;
               } else {
                  boolean var11 = var10 == 1;
                  double var12 = var7 + (var11 ? (double)400.0F : (double)0.0F) + (var10 == 3 ? (double)240.0F : (double)0.0F);
                  if (this.IIIIlIiilIIIlIii != null && var12 - (double)9.5F >= this.IIIIlIiilIIIlIii.IilliliilIIi()) {
                     return Double.NaN;
                  } else {
                     boolean var14 = false;
                     if (!lliIilIiiliIilIi.iliIiiliiiii(this.liIiIIiiiiIiIIii, x, var9, z, var10)) {
                        if (!this.liiiIIiiiiiiIIii || var10 != 0 || !lliIilIiiliIilIi.lIiiIiIlilli(this.liIiIIiiiiIiIIii, x, var9, z)) {
                           return Double.NaN;
                        }

                        var14 = true;
                     }

                     double var15 = this.iliIiiliiiii(x, var9, z, var11);
                     if (Double.isNaN(var15)) {
                        return Double.NaN;
                     } else {
                        double var17 = var7 > (double)0.5F ? 0.35 * Math.min(var7, (double)10.0F) * (var3 * this.iiliIIiiIIiiIIii + var5 * this.lIiiIIiiiIiiIIii) / var7 : (double)0.0F;
                        double var19 = var12 + (double)5.0F * var15 - (double)6.0F * (double)this.IiIIlIiiliIIlIii / (double)16.0F - var17 + (var14 ? (double)25.0F : (double)0.0F);
                        if (this.IIIIlIiilIIIlIii == null || var19 < this.IIIIlIiilIIIlIii.IilliliilIIi()) {
                           this.IIIIlIiilIIIlIii = new lIiiilIliIiiilIl(x, var9, z, var19, var11);
                           this.iIIIlIiiIlIIlIii = !var11 && var19 - var7 <= (double)15.0F;
                        }

                        this.iiIIlIiiIIlIlIii = var15;
                        return var19;
                     }
                  }
               }
            }
         } else {
            return Double.NaN;
         }
      }
   }

   private double iliIiiliiiii(int z, int water, int x, boolean y) {
      double var5 = (double)0.0F;
      int var7 = 0;

      for(int var8 = 0; var8 < lliIilIiiliIilIi.llIllllIIi.length; ++var8) {
         int var9 = this.liIiIIiiiiIiIIii.IliIlllilIi(z + lliIilIiiliIilIi.llIllllIIi[var8], x + lliIilIiiliIilIi.ilIllllIIi[var8]);
         if (var9 == Integer.MIN_VALUE) {
            var5 += (double)0.5F;
         } else {
            int var10 = var9 - water;
            if (var10 > 3) {
               if (lliIilIiiliIilIi.llIllllIIi[var8] * lliIilIiiliIilIi.llIllllIIi[var8] + lliIilIiiliIilIi.ilIllllIIi[var8] * lliIilIiiliIilIi.ilIllllIIi[var8] <= 9) {
                  return Double.NaN;
               }

               ++var7;
               var5 += (double)6.0F;
            } else {
               var5 += var10 == 3 ? (double)3.0F : (var10 == 2 ? 1.2 : (var10 == 1 ? 0.4 : (var10 < -4 ? (double)0.25F : (double)0.0F)));
            }
         }
      }

      if (var7 * 3 > lliIilIiiliIilIi.llIllllIIi.length) {
         return Double.NaN;
      } else {
         double var18 = (double)10.0F * var5 / (double)lliIilIiiliIilIi.llIllllIIi.length;
         int var21 = y ? 1 : 0;
         this.IiIIlIiiliIIlIii = 0;

         for(int var11 = 0; var11 < lliIilIiiliIilIi.IiIllllIIi.length; ++var11) {
            int var12 = z + lliIilIiiliIilIi.IiIllllIIi[var11];
            int var13 = x + lliIilIiiliIilIi.liIllllIIi[var11];
            int var14 = this.liIiIIiiiiIiIIii.IliIlllilIi(var12, var13);
            if (var14 != Integer.MIN_VALUE) {
               int var15 = this.liIiIIiiiiIiIIii.liiiIIllIl(var12, var14, var13);
               if (var15 == 2) {
                  ++var18;
               } else if (var15 == 4) {
                  ++var18;
               } else if (var14 == water && var15 == var21) {
                  ++this.IiIIlIiiliIIlIii;
               }
            }
         }

         double var22 = this.llliIIiiilliIIii - ((double)z + (double)0.5F);
         double var23 = this.IiliIIiililiIIii - ((double)x + (double)0.5F);
         double var24 = Math.sqrt(var22 * var22 + var23 * var23);
         boolean var17 = var24 >= (double)4.0F;
         if (var17) {
            var22 /= var24;
            var23 /= var24;
         }

         var18 += (double)2.0F * this.IIIllIIliIIl(z, water, x, 2, 6, 14, 6, var17, var22, var23);
         var18 += (double)1.0F * this.IIIllIIliIIl(z, water, x, 4, 15, 28, 14, var17, var22, var23);
         return var18;
      }
   }
}
