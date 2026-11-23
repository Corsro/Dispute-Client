package gg.corz;

import com.corz.client.mixins.AccessorInput;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.Random;
import net.minecraft.class_10185;
import net.minecraft.class_241;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_7172;
import net.minecraft.class_746;

public final class lIIIililiIIIilil {
   private static int[] IiiIiIIlil;
   private static final int IilIiIIlil = 7;
   public static final long iilIiIIlil = 120L;
   private static boolean IIIliIIlil;
   private static final illIliiIilIlii lIiIiIIlil = new illIliiIilIlii(new Random());
   public static final int lilIiIIlil = 2;
   public static final long IIiIiIIlil = 1000L;
   private static liIiIIiiiIiIIi iIIliIIlil;
   private static boolean iiiIiIIlil;
   private static final int[] illIiIIlil = new int[]{0, 0};
   private static final lilIIIIliilIIIIl IliIiIIlil = new lilIIIIliilIIIIl();
   private static long liiIiIIlil;
   private static IiiIlIllliiIlIll lliIiIIlil;
   private static boolean lIIliIIlil;
   private static WeakReference<class_746> iliIiIIlil = new WeakReference((Object)null);
   private static final iIliliilIlliliil iIiIiIIlil = new iIliliilIlliliil();

   public static void iIlIlllllill(AccessorInput in, class_746 p) {
      long var33 = 4430509449851018555L;
      long var35 = -4380571256311947497L;
      long var37 = -4829644189294772779L;
      long var39 = -2434379518051020814L;
      long var41 = -9135404434372701176L;
      long var43 = -1916298945185796681L;
      long var45 = -3721787845382461520L;
      long var47 = -5009815962421574673L;
      iiiIiIIlil = false;
      IIIliIIlil = false;
      lIIliIIlil = false;
      if (in != null && p != null) {
         if (iliIiIIlil.get() != p) {
            lIiIiIIlil.IliIlllilIi(liIiIIiiiIiIIi.lIiliiiliiIiliiili);
            iIiIiIIlil.IliIlllilIi();
            IliIiIIlil.IliIlllilIi();
            iliIiIIlil = new WeakReference(p);
            IiiIiIIlil = illIiIIlil;
            liiIiIIlil = Long.MIN_VALUE;
         }

         IiiIlIllliiIlIll var2 = lliIiIIlil;
         lliIiIIlil = null;
         long var3 = IIllIIlilIllIIli.IlIlllIlilIl();
         var33 ^= ((long)IliIiIIlil.liiiIIllIl(var3, IIIiillllIIiilll.iIlIlllllill(), IIIiillllIIiilll.IliIlllilIi()) << 32 ^ var33) & -1L << 32;
         if (var2 != null && var2.IilliliilIIi() == var3) {
            class_310 var6 = class_310.method_1551();
            if (var6 != null && var6.field_1690 != null) {
               if (var6.field_1755 == null && p.method_5805() && !p.method_5765() && !p.method_7325() && !p.method_31549().field_7479 && !p.method_6128()) {
                  lIIliIIlil = IIlllIlliIll(var6.field_1690);
                  if (!lIIliIIlil) {
                     if (!ilIiiIiIii.IiIlliIliiIl() || ilIiiIiIii.IIlllIlliIll()) {
                        class_10185 var15 = in.getPlayerInput();
                        if (var15 instanceof class_10185) {
                           class_10185 var10000 = var15;

                           try {
                              var90 = var10000.comp_3159();
                           } catch (Throwable var62) {
                              throw new MatchException(var62.toString(), var62);
                           }

                           var33 ^= ((long)var90 ^ var33) & -1L >>> 32;
                           var35 ^= ((long)((int)var33) << 32 ^ var35) & -1L << 32;
                           var10000 = var15;

                           try {
                              var92 = var10000.comp_3160();
                           } catch (Throwable var61) {
                              throw new MatchException(var61.toString(), var61);
                           }

                           var33 ^= ((long)var92 ^ var33) & -1L >>> 32;
                           long var93 = var35 ^ ((long)((int)var33) ^ var35) & -1L >>> 32;
                           class_10185 var94 = var15;

                           try {
                              var95 = var94.comp_3161();
                           } catch (Throwable var60) {
                              throw new MatchException(var60.toString(), var60);
                           }

                           var33 ^= ((long)var95 ^ var33) & -1L >>> 32;
                           var37 ^= ((long)((int)var33) << 32 ^ var37) & -1L << 32;
                           var94 = var15;

                           try {
                              var97 = var94.comp_3162();
                           } catch (Throwable var59) {
                              throw new MatchException(var59.toString(), var59);
                           }

                           var33 ^= ((long)var97 ^ var33) & -1L >>> 32;
                           long var98 = var37 ^ ((long)((int)var33) ^ var37) & -1L >>> 32;
                           class_10185 var99 = var15;

                           try {
                              var100 = var99.comp_3163();
                           } catch (Throwable var58) {
                              throw new MatchException(var58.toString(), var58);
                           }

                           var33 ^= ((long)var100 ^ var33) & -1L >>> 32;
                           var39 ^= ((long)((int)var33) << 32 ^ var39) & -1L << 32;
                           var99 = var15;

                           try {
                              var102 = var99.comp_3164();
                           } catch (Throwable var57) {
                              throw new MatchException(var57.toString(), var57);
                           }

                           var33 ^= ((long)var102 ^ var33) & -1L >>> 32;
                           var39 ^= ((long)((int)var33) ^ var39) & -1L >>> 32;
                           var99 = var15;

                           try {
                              var104 = var99.comp_3165();
                           } catch (Throwable var56) {
                              throw new MatchException(var56.toString(), var56);
                           }

                           var33 ^= ((long)var104 ^ var33) & -1L >>> 32;
                           var41 ^= ((long)((int)var33) << 32 ^ var41) & -1L << 32;
                           iIllllIlIlllllIl var24 = var2.liiiIIllIl();
                           if (var24 instanceof iIllllIlIlllllIl) {
                              iIllllIlIlllllIl var105 = var24;

                              try {
                                 var106 = var105.IlIlllIlilIl();
                              } catch (Throwable var55) {
                                 throw new MatchException(var55.toString(), var55);
                              }

                              var41 ^= ((long)var106 ^ var41) & -1L >>> 32;
                              var43 ^= ((long)((int)var41) << 32 ^ var43) & -1L << 32;
                              var105 = var24;

                              try {
                                 var108 = var105.IiIlliIliiIl();
                              } catch (Throwable var54) {
                                 throw new MatchException(var54.toString(), var54);
                              }

                              double var25 = var108;
                              double var63 = var25;
                              var105 = var24;

                              try {
                                 var110 = var105.IIlllIlliIll();
                              } catch (Throwable var53) {
                                 throw new MatchException(var53.toString(), var53);
                              }

                              var25 = var110;
                              double var17 = var25;
                              var105 = var24;

                              try {
                                 var112 = var105.Illlllllilll();
                              } catch (Throwable var52) {
                                 throw new MatchException(var52.toString(), var52);
                              }

                              IilIIIililIIIi var66 = var112;
                              IilIIIililIIIi var19 = var66;
                              var105 = var24;

                              try {
                                 var114 = var105.Iilllilliill();
                              } catch (Throwable var51) {
                                 throw new MatchException(var51.toString(), var51);
                              }

                              var66 = var114;
                              IilIIIililIIIi var20 = var66;
                              var105 = var24;

                              try {
                                 var116 = var105.IIillIiliIil();
                              } catch (Throwable var50) {
                                 throw new MatchException(var50.toString(), var50);
                              }

                              var66 = var116;
                              var105 = var24;

                              try {
                                 var118 = var105.Ililllililil();
                              } catch (Throwable var49) {
                                 throw new MatchException(var49.toString(), var49);
                              }

                              var41 ^= ((long)var118 ^ var41) & -1L >>> 32;
                              var43 ^= ((long)((int)var41) ^ var43) & -1L >>> 32;
                              var45 ^= ((long)ilIiiIiIii.IIlllIlliIll() << 32 ^ var45) & -1L << 32;
                              float var64 = (int)(var45 >>> 32) != 0 ? ilIiiIiIii.Iilllilliill() : p.method_36454();
                              if (liiIiIIlil != var3 - 1L) {
                                 lIiIiIIlil.liiiIIllIl(IIillIiliIil(p.method_71091()));
                              }

                              var41 ^= ((long)iliilliIiiilli.Illlllllilll(p) ^ var41) & -1L >>> 32;
                              var45 ^= ((long)((int)var41 == 0 && (int)(var33 >>> 32) == 0 ? 0 : 1) ^ var45) & -1L >>> 32;
                              int[] var27 = (int)var45 == 0 && (int)(var43 >>> 32) != 0 ? Iillllillillllil.IliIlllilIi(var63, var17, var64, IiiIiIIlil) : new int[]{0, 0};
                              IiiIiIIlil = var27;
                              var47 ^= ((long)((int)(var33 >>> 32) == 0 && (!p.method_24828() || !iliilliIiiilli.IIlllIlliIll(p) && (int)var41 == 0) ? 0 : 1) << 32 ^ var47) & -1L << 32;
                              liIiIIiiiIiIIi var29 = new liIiIIiiiIiIIi(var27[1] > 0, var27[1] < 0, var27[0] > 0, var27[0] < 0, IIlilIliiIli(var19, (boolean)((int)(var39 >>> 32))) && (int)(var47 >>> 32) == 0, IIlilIliiIli(var20, (boolean)((int)var39)), IIlilIliiIli(var66, (boolean)((int)(var41 >>> 32))) && (int)var45 == 0);
                              liIiIIiiiIiIIi var30 = iIiIiIIlil.liiiIIllIl(lIiIiIIlil, var3, var29, (boolean)((int)var43), var66 == IilIIIililIIIi.iIillIiliIlillIili, p.method_5624() && !p.method_5681(), Illlllllilll(p.method_71091()), Iilllilliill(var6.field_1690));
                              if ((int)(var47 >>> 32) != 0 && Iiilliiliiil(var30)) {
                                 var30 = IiIiliIiiiIi(var30);
                                 lIiIiIIlil.liiiIIllIl(var30);
                              }

                              if ((int)var45 != 0 && IIIilIIiiIIi(var30)) {
                                 var30 = IlIillIiilIi(var30);
                                 lIiIiIIlil.liiiIIllIl(var30);
                              }

                              in.setPlayerInput(Ililllililil(var30));
                              float[] var31 = Iillllillillllil.liiiIIllIl(var30);
                              in.setMovementVector(new class_241(var31[0], var31[1]));
                              iIIliIIlil = var30;
                              iiiIiIIlil = true;
                              IIIliIIlil = (boolean)((int)(var45 >>> 32));
                              liiIiIIlil = var3;
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   static liIiIIiiiIiIIi IlIillIiilIi(liIiIIiiiIiIIi keys) {
      long var16 = 3489310229526852866L;
      long var10 = 3707304729677542611L;
      long var12 = 7620473811236085618L;
      long var14 = 7548306333024328556L;
      if (keys instanceof liIiIIiiiIiIIi) {
         liIiIIiiiIiIIi var10000 = keys;

         try {
            var38 = var10000.IliIlllilIi();
         } catch (Throwable var24) {
            throw new MatchException(var24.toString(), var24);
         }

         var10 ^= ((long)var38 << 32 ^ var10) & -1L << 32;
         var10 ^= ((long)((int)(var10 >>> 32)) ^ var10) & -1L >>> 32;
         var10000 = keys;

         try {
            var40 = var10000.liiiIIllIl();
         } catch (Throwable var23) {
            throw new MatchException(var23.toString(), var23);
         }

         var10 ^= ((long)var40 << 32 ^ var10) & -1L << 32;
         var12 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var12) & -1L << 32;
         var10000 = keys;

         try {
            var42 = var10000.iIlIlllllill();
         } catch (Throwable var22) {
            throw new MatchException(var22.toString(), var22);
         }

         var10 ^= ((long)var42 << 32 ^ var10) & -1L << 32;
         long var43 = var12 ^ ((long)((int)(var10 >>> 32)) ^ var12) & -1L >>> 32;
         liIiIIiiiIiIIi var44 = keys;

         try {
            var45 = var44.IilliliilIIi();
         } catch (Throwable var21) {
            throw new MatchException(var21.toString(), var21);
         }

         var10 ^= ((long)var45 << 32 ^ var10) & -1L << 32;
         var14 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var14) & -1L << 32;
         var44 = keys;

         try {
            var47 = var44.lIiiIiIlilli();
         } catch (Throwable var20) {
            throw new MatchException(var20.toString(), var20);
         }

         var10 ^= ((long)var47 << 32 ^ var10) & -1L << 32;
         var14 ^= ((long)((int)(var10 >>> 32)) ^ var14) & -1L >>> 32;
         var44 = keys;

         try {
            var49 = var44.iliIiiliiiii();
         } catch (Throwable var19) {
            throw new MatchException(var19.toString(), var19);
         }

         var10 ^= ((long)var49 << 32 ^ var10) & -1L << 32;
         var16 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var16) & -1L << 32;
         var44 = keys;

         try {
            var51 = var44.IIIllIIliIIl();
         } catch (Throwable var18) {
            throw new MatchException(var18.toString(), var18);
         }

         var10 ^= ((long)var51 << 32 ^ var10) & -1L << 32;
         var16 ^= ((long)((int)(var10 >>> 32)) ^ var16) & -1L >>> 32;
         return new liIiIIiiiIiIIi(false, false, false, false, (boolean)((int)var14), (boolean)((int)(var16 >>> 32)), false);
      } else {
         return liIiIIiiiIiIIi.lIiliiiliiIiliiili;
      }
   }

   public static boolean lIiiIiIlilli() {
      return IIIliIIlil;
   }

   public static void IlIlllIlilIl(Object owner) {
      IiiIlIllliiIlIll var1 = lliIiIIlil;
      if (owner != null && var1 != null && var1.IliIlllilIi() == owner) {
         lliIiIIlil = null;
      }

   }

   private static boolean Illlllllilll(class_10185 sent) {
      return sent != null && sent.comp_3159() && !sent.comp_3160();
   }

   static boolean IIIilIIiiIIi(liIiIIiiiIiIIi keys) {
      long var16 = -5027991502196380620L;
      long var10 = -3170861735279230032L;
      long var12 = -7400206060963381533L;
      long var14 = -9028358219857170205L;
      boolean var52;
      if (keys instanceof liIiIIiiiIiIIi) {
         liIiIIiiiIiIIi var10000 = keys;

         try {
            var39 = var10000.IliIlllilIi();
         } catch (Throwable var24) {
            throw new MatchException(var24.toString(), var24);
         }

         var10 ^= ((long)var39 << 32 ^ var10) & -1L << 32;
         var10 ^= ((long)((int)(var10 >>> 32)) ^ var10) & -1L >>> 32;
         var10000 = keys;

         try {
            var41 = var10000.liiiIIllIl();
         } catch (Throwable var23) {
            throw new MatchException(var23.toString(), var23);
         }

         var10 ^= ((long)var41 << 32 ^ var10) & -1L << 32;
         var12 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var12) & -1L << 32;
         var10000 = keys;

         try {
            var43 = var10000.iIlIlllllill();
         } catch (Throwable var22) {
            throw new MatchException(var22.toString(), var22);
         }

         var10 ^= ((long)var43 << 32 ^ var10) & -1L << 32;
         var12 ^= ((long)((int)(var10 >>> 32)) ^ var12) & -1L >>> 32;
         var10000 = keys;

         try {
            var45 = var10000.IilliliilIIi();
         } catch (Throwable var21) {
            throw new MatchException(var21.toString(), var21);
         }

         var10 ^= ((long)var45 << 32 ^ var10) & -1L << 32;
         var14 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var14) & -1L << 32;
         var10000 = keys;

         try {
            var47 = var10000.lIiiIiIlilli();
         } catch (Throwable var20) {
            throw new MatchException(var20.toString(), var20);
         }

         var10 ^= ((long)var47 << 32 ^ var10) & -1L << 32;
         var14 ^= ((long)((int)(var10 >>> 32)) ^ var14) & -1L >>> 32;
         var10000 = keys;

         try {
            var49 = var10000.iliIiiliiiii();
         } catch (Throwable var19) {
            throw new MatchException(var19.toString(), var19);
         }

         var10 ^= ((long)var49 << 32 ^ var10) & -1L << 32;
         var16 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var16) & -1L << 32;
         var10000 = keys;

         try {
            var51 = var10000.IIIllIIliIIl();
         } catch (Throwable var18) {
            throw new MatchException(var18.toString(), var18);
         }

         var10 ^= ((long)var51 << 32 ^ var10) & -1L << 32;
         var16 ^= ((long)((int)(var10 >>> 32)) ^ var16) & -1L >>> 32;
         if ((int)var10 != 0 || (int)(var12 >>> 32) != 0 || (int)var12 != 0 || (int)(var14 >>> 32) != 0 || (int)var16 != 0) {
            var52 = true;
            return var52;
         }
      }

      var52 = false;
      return var52;
   }

   static {
      IiiIiIIlil = illIiIIlil;
      liiIiIIlil = Long.MIN_VALUE;
      iIIliIIlil = liIiIIiiiIiIIi.lIiliiiliiIiliiili;
   }

   private static class_10185 Ililllililil(liIiIIiiiIiIIi keys) {
      long var16 = 4405401535294595420L;
      long var18 = -6923461611882961362L;
      long var20 = 4228933837955310196L;
      long var12 = -1518616186095572493L;
      long var14 = -5218167879009604981L;
      Objects.requireNonNull(keys);
      var12 ^= (0L ^ var12) & -1L << 32;
      //$FF: (int)(var12 >>> 32)->value
      //0->gg/corz/liIiIIiiiIiIIi
      switch (keys.typeSwitch<invokedynamic>(keys, (int)(var12 >>> 32))) {
         case 0:
            liIiIIiiiIiIIi var10000 = keys;

            try {
               var44 = var10000.IliIlllilIi();
            } catch (Throwable var28) {
               throw new MatchException(var28.toString(), var28);
            }

            var12 ^= ((long)var44 ^ var12) & -1L >>> 32;
            var14 ^= ((long)((int)var12) << 32 ^ var14) & -1L << 32;
            var10000 = keys;

            try {
               var46 = var10000.liiiIIllIl();
            } catch (Throwable var27) {
               throw new MatchException(var27.toString(), var27);
            }

            var12 ^= ((long)var46 ^ var12) & -1L >>> 32;
            var14 ^= ((long)((int)var12) ^ var14) & -1L >>> 32;
            var10000 = keys;

            try {
               var48 = var10000.iIlIlllllill();
            } catch (Throwable var26) {
               throw new MatchException(var26.toString(), var26);
            }

            var12 ^= ((long)var48 ^ var12) & -1L >>> 32;
            var16 ^= ((long)((int)var12) << 32 ^ var16) & -1L << 32;
            var10000 = keys;

            try {
               var50 = var10000.IilliliilIIi();
            } catch (Throwable var25) {
               throw new MatchException(var25.toString(), var25);
            }

            var12 ^= ((long)var50 ^ var12) & -1L >>> 32;
            var16 ^= ((long)((int)var12) ^ var16) & -1L >>> 32;
            var10000 = keys;

            try {
               var52 = var10000.lIiiIiIlilli();
            } catch (Throwable var24) {
               throw new MatchException(var24.toString(), var24);
            }

            var12 ^= ((long)var52 ^ var12) & -1L >>> 32;
            var18 ^= ((long)((int)var12) << 32 ^ var18) & -1L << 32;
            var10000 = keys;

            try {
               var54 = var10000.iliIiiliiiii();
            } catch (Throwable var23) {
               throw new MatchException(var23.toString(), var23);
            }

            var12 ^= ((long)var54 ^ var12) & -1L >>> 32;
            var18 ^= ((long)((int)var12) ^ var18) & -1L >>> 32;
            var10000 = keys;

            try {
               var56 = var10000.IIIllIIliIIl();
            } catch (Throwable var22) {
               throw new MatchException(var22.toString(), var22);
            }

            var12 ^= ((long)var56 ^ var12) & -1L >>> 32;
            var20 ^= ((long)((int)var12) << 32 ^ var20) & -1L << 32;
            return new class_10185((boolean)((int)(var14 >>> 32)), (boolean)((int)var14), (boolean)((int)(var16 >>> 32)), (boolean)((int)var16), (boolean)((int)(var18 >>> 32)), (boolean)((int)var18), (int)(var20 >>> 32) != 0 && (int)(var14 >>> 32) != 0 && (int)var14 == 0);
         default:
            throw new MatchException((String)null, (Throwable)null);
      }
   }

   public static boolean iliIiiliiiii() {
      return lIIliIIlil;
   }

   private static boolean IIlilIliiIli(IilIIIililIIIi t, boolean vanilla) {
      if (t == IilIIIililIIIi.IIillIililIillIili) {
         return true;
      } else {
         return t == IilIIIililIIIi.iIillIiliIlillIili ? false : vanilla;
      }
   }

   public static void liiiIIllIl() {
      IiiIlIllliiIlIll var0 = lliIiIIlil;
      if (var0 != null && var0.IilliliilIIi() != IIllIIlilIllIIli.IlIlllIlilIl()) {
         lliIiIIlil = null;
      }

      iiiIiIIlil = false;
      IIIliIIlil = false;
   }

   public static void IliIlllilIi(Object owner, iIllllIlIlllllIl intent, int prio) {
      if (owner != null && intent != null) {
         long var3 = IIllIIlilIllIIli.IlIlllIlilIl();
         IiiIlIllliiIlIll var5 = lliIiIIlil;
         if (var5 == null || var5.IilliliilIIi() != var3 || prio > var5.iIlIlllllill()) {
            lliIiIIlil = new IiiIlIllliiIlIll(owner, intent, prio, var3);
         }

      }
   }

   private lIIIililiIIIilil() {
   }

   public static liIiIIiiiIiIIi IIIllIIliIIl() {
      return iIIliIIlil;
   }

   public static void IiIlliIliiIl() {
      lliIiIIlil = null;
      lIiIiIIlil.IliIlllilIi(liIiIIiiiIiIIi.lIiliiiliiIiliiili);
      iIiIiIIlil.IliIlllilIi();
      IliIiIIlil.IliIlllilIi();
      iliIiIIlil = new WeakReference((Object)null);
      IiiIiIIlil = illIiIIlil;
      liiIiIIlil = Long.MIN_VALUE;
      iiiIiIIlil = false;
      IIIliIIlil = false;
      lIIliIIlil = false;
      iIIliIIlil = liIiIIiiiIiIIi.lIiliiiliiIiliiili;
   }

   public static boolean IilliliilIIi() {
      return iiiIiIIlil;
   }

   private static boolean IIlllIlliIll(class_315 o) {
      return IillIIIllillIIIl.IliIlllilIi(o.field_1894) || IillIIIllillIIIl.IliIlllilIi(o.field_1881) || IillIIIllillIIIl.IliIlllilIi(o.field_1913) || IillIIIllillIIIl.IliIlllilIi(o.field_1849) || IillIIIllillIIIl.IliIlllilIi(o.field_1903) || IillIIIllillIIIl.IliIlllilIi(o.field_1832);
   }

   static boolean Iiilliiliiil(liIiIIiiiIiIIi keys) {
      long var16 = -2062878000770698257L;
      long var10 = 4026311913404030811L;
      long var12 = -7529013131447186599L;
      long var14 = 2746915490072384219L;
      boolean var52;
      if (keys instanceof liIiIIiiiIiIIi) {
         liIiIIiiiIiIIi var10000 = keys;

         try {
            var37 = var10000.IliIlllilIi();
         } catch (Throwable var24) {
            throw new MatchException(var24.toString(), var24);
         }

         var10 ^= ((long)var37 << 32 ^ var10) & -1L << 32;
         var10 ^= ((long)((int)(var10 >>> 32)) ^ var10) & -1L >>> 32;
         var10000 = keys;

         try {
            var39 = var10000.liiiIIllIl();
         } catch (Throwable var23) {
            throw new MatchException(var23.toString(), var23);
         }

         var10 ^= ((long)var39 << 32 ^ var10) & -1L << 32;
         var12 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var12) & -1L << 32;
         var10000 = keys;

         try {
            var41 = var10000.iIlIlllllill();
         } catch (Throwable var22) {
            throw new MatchException(var22.toString(), var22);
         }

         var10 ^= ((long)var41 << 32 ^ var10) & -1L << 32;
         long var42 = var12 ^ ((long)((int)(var10 >>> 32)) ^ var12) & -1L >>> 32;
         liIiIIiiiIiIIi var43 = keys;

         try {
            var44 = var43.IilliliilIIi();
         } catch (Throwable var21) {
            throw new MatchException(var21.toString(), var21);
         }

         var10 ^= ((long)var44 << 32 ^ var10) & -1L << 32;
         var14 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var14) & -1L << 32;
         var43 = keys;

         try {
            var46 = var43.lIiiIiIlilli();
         } catch (Throwable var20) {
            throw new MatchException(var20.toString(), var20);
         }

         var10 ^= ((long)var46 << 32 ^ var10) & -1L << 32;
         var14 ^= ((long)((int)(var10 >>> 32)) ^ var14) & -1L >>> 32;
         var43 = keys;

         try {
            var48 = var43.iliIiiliiiii();
         } catch (Throwable var19) {
            throw new MatchException(var19.toString(), var19);
         }

         var10 ^= ((long)var48 << 32 ^ var10) & -1L << 32;
         var16 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var16) & -1L << 32;
         var43 = keys;

         try {
            var50 = var43.IIIllIIliIIl();
         } catch (Throwable var18) {
            throw new MatchException(var18.toString(), var18);
         }

         var10 ^= ((long)var50 << 32 ^ var10) & -1L << 32;
         long var51 = var16 ^ ((long)((int)(var10 >>> 32)) ^ var16) & -1L >>> 32;
         if ((int)var14 != 0) {
            var52 = true;
            return var52;
         }
      }

      var52 = false;
      return var52;
   }

   static liIiIIiiiIiIIi IiIiliIiiiIi(liIiIIiiiIiIIi keys) {
      long var16 = 2521534005870465462L;
      long var10 = 8854513352768055192L;
      long var12 = -7233802437519186307L;
      long var14 = 8342658463965740021L;
      if (keys instanceof liIiIIiiiIiIIi) {
         liIiIIiiiIiIIi var10000 = keys;

         try {
            var39 = var10000.IliIlllilIi();
         } catch (Throwable var24) {
            throw new MatchException(var24.toString(), var24);
         }

         var10 ^= ((long)var39 << 32 ^ var10) & -1L << 32;
         var10 ^= ((long)((int)(var10 >>> 32)) ^ var10) & -1L >>> 32;
         var10000 = keys;

         try {
            var41 = var10000.liiiIIllIl();
         } catch (Throwable var23) {
            throw new MatchException(var23.toString(), var23);
         }

         var10 ^= ((long)var41 << 32 ^ var10) & -1L << 32;
         var12 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var12) & -1L << 32;
         var10000 = keys;

         try {
            var43 = var10000.iIlIlllllill();
         } catch (Throwable var22) {
            throw new MatchException(var22.toString(), var22);
         }

         var10 ^= ((long)var43 << 32 ^ var10) & -1L << 32;
         var12 ^= ((long)((int)(var10 >>> 32)) ^ var12) & -1L >>> 32;
         var10000 = keys;

         try {
            var45 = var10000.IilliliilIIi();
         } catch (Throwable var21) {
            throw new MatchException(var21.toString(), var21);
         }

         var10 ^= ((long)var45 << 32 ^ var10) & -1L << 32;
         var14 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var14) & -1L << 32;
         var10000 = keys;

         try {
            var47 = var10000.lIiiIiIlilli();
         } catch (Throwable var20) {
            throw new MatchException(var20.toString(), var20);
         }

         var10 ^= ((long)var47 << 32 ^ var10) & -1L << 32;
         var14 ^= ((long)((int)(var10 >>> 32)) ^ var14) & -1L >>> 32;
         var10000 = keys;

         try {
            var49 = var10000.iliIiiliiiii();
         } catch (Throwable var19) {
            throw new MatchException(var19.toString(), var19);
         }

         var10 ^= ((long)var49 << 32 ^ var10) & -1L << 32;
         var16 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var16) & -1L << 32;
         var10000 = keys;

         try {
            var51 = var10000.IIIllIIliIIl();
         } catch (Throwable var18) {
            throw new MatchException(var18.toString(), var18);
         }

         var10 ^= ((long)var51 << 32 ^ var10) & -1L << 32;
         var16 ^= ((long)((int)(var10 >>> 32)) ^ var16) & -1L >>> 32;
         return new liIiIIiiiIiIIi((boolean)((int)var10), (boolean)((int)(var12 >>> 32)), (boolean)((int)var12), (boolean)((int)(var14 >>> 32)), false, (boolean)((int)(var16 >>> 32)), (boolean)((int)var16));
      } else {
         return liIiIIiiiIiIIi.lIiliiiliiIiliiili;
      }
   }

   private static liIiIIiiiIiIIi IIillIiliIil(class_10185 sent) {
      long var16 = 1231763062115917418L;
      long var10 = 8215620162359686075L;
      long var12 = -8912537885770003314L;
      long var14 = -6235072801863487517L;
      if (sent instanceof class_10185) {
         class_10185 var10000 = sent;

         try {
            var39 = var10000.comp_3159();
         } catch (Throwable var24) {
            throw new MatchException(var24.toString(), var24);
         }

         var10 ^= ((long)var39 << 32 ^ var10) & -1L << 32;
         var10 ^= ((long)((int)(var10 >>> 32)) ^ var10) & -1L >>> 32;
         var10000 = sent;

         try {
            var41 = var10000.comp_3160();
         } catch (Throwable var23) {
            throw new MatchException(var23.toString(), var23);
         }

         var10 ^= ((long)var41 << 32 ^ var10) & -1L << 32;
         var12 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var12) & -1L << 32;
         var10000 = sent;

         try {
            var43 = var10000.comp_3161();
         } catch (Throwable var22) {
            throw new MatchException(var22.toString(), var22);
         }

         var10 ^= ((long)var43 << 32 ^ var10) & -1L << 32;
         var12 ^= ((long)((int)(var10 >>> 32)) ^ var12) & -1L >>> 32;
         var10000 = sent;

         try {
            var45 = var10000.comp_3162();
         } catch (Throwable var21) {
            throw new MatchException(var21.toString(), var21);
         }

         var10 ^= ((long)var45 << 32 ^ var10) & -1L << 32;
         var14 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var14) & -1L << 32;
         var10000 = sent;

         try {
            var47 = var10000.comp_3163();
         } catch (Throwable var20) {
            throw new MatchException(var20.toString(), var20);
         }

         var10 ^= ((long)var47 << 32 ^ var10) & -1L << 32;
         var14 ^= ((long)((int)(var10 >>> 32)) ^ var14) & -1L >>> 32;
         var10000 = sent;

         try {
            var49 = var10000.comp_3164();
         } catch (Throwable var19) {
            throw new MatchException(var19.toString(), var19);
         }

         var10 ^= ((long)var49 << 32 ^ var10) & -1L << 32;
         var16 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var16) & -1L << 32;
         var10000 = sent;

         try {
            var51 = var10000.comp_3165();
         } catch (Throwable var18) {
            throw new MatchException(var18.toString(), var18);
         }

         var10 ^= ((long)var51 << 32 ^ var10) & -1L << 32;
         var16 ^= ((long)((int)(var10 >>> 32)) ^ var16) & -1L >>> 32;
         return new liIiIIiiiIiIIi((boolean)((int)var10), (boolean)((int)(var12 >>> 32)), (boolean)((int)var12), (boolean)((int)(var14 >>> 32)), (boolean)((int)var14), (boolean)((int)(var16 >>> 32)), (boolean)((int)var16));
      } else {
         return liIiIIiiiIiIIi.lIiliiiliiIiliiili;
      }
   }

   private static int Iilllilliill(class_315 o) {
      class_7172 var1 = o.method_72709();
      Integer var2 = var1 != null ? (Integer)var1.method_41753() : null;
      return var2 != null ? Math.max(0, var2) : 7;
   }
}
