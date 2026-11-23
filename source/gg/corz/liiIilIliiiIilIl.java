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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_10256;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1304;
import net.minecraft.class_1308;
import net.minecraft.class_1321;
import net.minecraft.class_1429;
import net.minecraft.class_1439;
import net.minecraft.class_1496;
import net.minecraft.class_1531;
import net.minecraft.class_1533;
import net.minecraft.class_1646;
import net.minecraft.class_1657;
import net.minecraft.class_1693;
import net.minecraft.class_1694;
import net.minecraft.class_1802;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_9817;
import net.minecraft.class_2902.class_2903;

public final class liiIilIliiiIilIl {
   static final int IliiillIll = 4;
   static final int IiiiillIll = 4;
   static final int liiiillIll = 0;
   static final int llIIIilIll = 3;
   static final int iiiiillIll = 5;
   static final int iIIIIilIll = 12;
   static final double iIiiillIll = (double)192.0F;
   static final int lliiillIll = 10;
   static final int lIIIIilIll = 16;
   static final int IlIIIilIll = 10;
   static final int iliiillIll = 2;
   static final int IIIIIilIll = 3;
   private final Set<UUID> ilIIIilIll = new HashSet();

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 'ﻗ') - var5))) - '텠') + 6099) ^ 29314) + 5493) + var5) + 'ꑩ') >>> 10 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 'ﻗ') - var5))) - '텠') + 6099) ^ 29314) + 5493) + var5) + 'ꑩ') << 6) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 'ﻗ') - var5))) - '텠') + 6099) ^ 29314) + 5493) + var5) + 'ꑩ') >>> 10 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 'ﻗ') - var5))) - '텠') + 6099) ^ 29314) + 5493) + var5) + 'ꑩ') << 6) << 11))) + '\ue324') - '錬'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) >>> 7 | (char)(var4[var5] << 8 | var4[var5] >>> 8) << 9))))) + var5) << 11 | (char)((char)(~((char)(-((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) >>> 7 | (char)(var4[var5] << 8 | var4[var5] >>> 8) << 9))))) + var5) >>> 5))) + '녤'))) - 19864) + var5) - var5) ^ '솎'))) ^ var5)) ^ 4114) + 23456) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static void IIIllIIliIIl(List<Ililiillliliil> now, lliIIIliliIIIl villagers, long book) {
      ArrayList var4 = new ArrayList();

      for(Ililiillliliil var6 : now) {
         if (!IiIlliIliiIl(var4, var6, 20)) {
            int var7 = 0;
            int var8 = 0;

            for(Ililiillliliil var10 : now) {
               if (Math.abs(var10.iIllIllliIlllIllli - var6.iIllIllliIlllIllli) <= 10 && Math.abs(var10.IillIlllilillIllli - var6.IillIlllilillIllli) <= 10 && Math.abs(var10.llllIllliilllIllli - var6.llllIllliilllIllli) <= 4) {
                  ++var7;
                  if (var10.iillIllliIIilIllli) {
                     ++var8;
                  }
               }
            }

            if (var7 >= 4) {
               villagers.iliIiiliiiii(lIilllliIillll.lllliiiilillliiiil, var6.iIllIllliIlllIllli, var6.llllIllliilllIllli, var6.IillIlllilillIllli, Illlllllilll<invokedynamic>() + (var6.iIllIllliIlllIllli >> 4) + Illlllllilll<invokedynamic>() + (var6.IillIlllilillIllli >> 4), lIilllliIillll.lllliiiilillliiiil.IlIIIIIIillIIIIIIi + (var8 >= 2 ? 5 : 0), var7 + Illlllllilll<invokedynamic>(), book);
               var4.add(var6);
            }
         }
      }

   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 9214879418380431559L ^ Long.rotateLeft(7699546738790651422L, 23) ^ -8589448249419790494L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5595378295397665017L ^ Long.rotateLeft(4297611457604562598L, 7) ^ 7437505618419894403L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2005642933061165800L ^ Long.rotateLeft(-1759274708407464036L, 50) ^ 8611155859615758810L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1211243935247332935L ^ Long.rotateLeft(1507768888084371128L, 3) ^ 429325737637649870L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8239355197893162437L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5781709262615141351L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -1858317305617948573L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 6996710858895595761L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -5352113351784130947L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -7008439147117346955L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iilllilliill<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIillIiliIil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Ililllililil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Iiilliiliiil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIIilIIiiIIi<invokedynamic>());
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

   private static boolean iliIiiliiiii(class_1531 a) {
      for(class_1304 var4 : class_1304.values()) {
         if (var4 != class_1304.field_48824 && var4 != class_1304.field_55946 && !a.method_6118(var4).method_7960()) {
            return true;
         }
      }

      return a.method_6929();
   }

   public void liiiIIllIl(class_638 end, class_746 book, lliIIIliliIIIl self, boolean now, boolean undergroundOnly, long world) {
      double var8 = book.method_23317();
      double var10 = book.method_23321();
      if (book.method_5854() != null && this.ilIIIilIll.size() < 64) {
         this.ilIIIilIll.add(book.method_5854().method_5667());
      }

      double var12 = (double)36864.0F;
      ArrayList var14 = new ArrayList();
      ArrayList var15 = new ArrayList();
      HashMap var16 = new HashMap();

      for(class_1297 var18 : end.method_18112()) {
         if (var18 != book && var18.method_5805() && !(var18 instanceof class_1657)) {
            double var19 = var18.method_23317() - var8;
            double var21 = var18.method_23321() - var10;
            if (!(var19 * var19 + var21 * var21 > var12)) {
               int var23 = var18.method_31477();
               int var24 = var18.method_31478();
               int var25 = var18.method_31479();
               if (!this.iIlIlllllill(var18, book)) {
                  String var26 = var18.method_5845();
                  boolean var27 = !undergroundOnly || lIiiIiIlilli(end, var23, var24, var25);
                  if (var18 instanceof class_1646) {
                     class_1646 var28 = (class_1646)var18;
                     boolean var31 = var28.method_7231().comp_3522() >= 2;
                     if (var27 && IilliliilIIi(var28)) {
                        var14.add(new Ililiillliliil(var23, var24, var25, var31));
                     }

                     if (var31) {
                        self.lIiiIiIlilli(lIilllliIillll.iilliiiilIIiliiiil, var23, var24, var25, Illlllllilll<invokedynamic>() + var26, world);
                     }
                  } else if (var18 instanceof class_1439) {
                     if (var27) {
                        var15.add(new Ililiillliliil(var23, var24, var25, false));
                     }
                  } else if (var18 instanceof class_1533) {
                     class_1533 var29 = (class_1533)var18;
                     if (var29.method_6940().method_7960() || now && var29.method_6940().method_31574(class_1802.field_8833)) {
                        continue;
                     }

                     self.lIiiIiIlilli(lIilllliIillll.liiliiiiliiiliiiil, var23, var24, var25, Illlllllilll<invokedynamic>() + var26, world);
                  } else if (var18 instanceof class_1531) {
                     class_1531 var30 = (class_1531)var18;
                     if (var30.method_6912()) {
                        continue;
                     }

                     self.iliIiiliiiii(lIilllliIillll.IIIiiiiillIIiiiiil, var23, var24, var25, Illlllllilll<invokedynamic>() + var26, iliIiiliiiii(var30) ? lIilllliIillll.IIIiiiiillIIiiiiil.IlIIIIIIillIIIIIIi : 3, (String)null, world);
                  } else if (var18 instanceof class_1693 && !(var18 instanceof class_1694) || var18 instanceof class_10256) {
                     self.lIiiIiIlilli(lIilllliIillll.iIIiiiiilIlIiiiiil, var23, var24, var25, Illlllllilll<invokedynamic>() + var26, world);
                  }

                  label115: {
                     label148: {
                        if (var18 instanceof class_1321) {
                           class_1321 var34 = (class_1321)var18;
                           if (var34.method_6181()) {
                              break label148;
                           }
                        }

                        if (var18 instanceof class_1496) {
                           class_1496 var36 = (class_1496)var18;
                           if (var36.method_6727()) {
                              break label148;
                           }
                        }

                        if (var18 instanceof class_1308) {
                           class_1308 var37 = (class_1308)var18;
                           if (var37.method_16914() && !(var18 instanceof class_1646)) {
                              self.lIiiIiIlilli(lIilllliIillll.Ililiiiillliliiiil, var23, var24, var25, Illlllllilll<invokedynamic>() + var26, world);
                           }
                        }
                        break label115;
                     }

                     self.lIiiIiIlilli(lIilllliIillll.lIiliiiiliIiliiiil, var23, var24, var25, Illlllllilll<invokedynamic>() + var26, world);
                  }

                  if (var18 instanceof class_9817) {
                     class_9817 var35 = (class_9817)var18;
                     if (var35.method_60953()) {
                        self.lIiiIiIlilli(lIilllliIillll.ililiiiilIiiliiiil, var23, var24, var25, Illlllllilll<invokedynamic>() + var26, world);
                     }
                  }

                  if (var18 instanceof class_1429 && !(var18 instanceof class_1321)) {
                     ((List)var16.computeIfAbsent(var18.method_5864(), (k) -> new ArrayList())).add(new Ililiillliliil(var23, var24, var25, false));
                  }
               }
            }
         }
      }

      IIIllIIliIIl(var14, self, world);
      IlIlllIlilIl(var15, 3, 16, lIilllliIillll.Iilliiiillilliiiil, Illlllllilll<invokedynamic>(), self, world);

      for(Map.Entry var33 : var16.entrySet()) {
         IlIlllIlilIl((List)var33.getValue(), 12, 10, lIilllliIillll.llIiiiiililIiiiiil, Illlllllilll<invokedynamic>() + class_1299.method_5890((class_1299)var33.getKey()) + Illlllllilll<invokedynamic>(), self, world);
      }

   }

   static boolean lIiiIiIlilli(class_638 x, int world, int y, int z) {
      long var5 = -3702432958284130927L;
      var5 ^= ((long)x.method_8624(class_2903.field_13203, world, z) << 32 ^ var5) & -1L << 32;
      if ((int)(var5 >>> 32) <= x.method_31607()) {
         var5 ^= ((long)x.method_8624(class_2903.field_13197, world, z) << 32 ^ var5) & -1L << 32;
      }

      return y <= 0 && (int)(var5 >>> 32) - y >= (((971916941 << 15 | 971916941 >>> 17) ^ 39) * -37 ^ -422881804);
   }

   private static boolean IiIlliIliiIl(List<Ililiillliliil> r, Ililiillliliil done, int s) {
      for(Ililiillliliil var4 : r) {
         if (Math.abs(var4.iIllIllliIlllIllli - done.iIllIllliIlllIllli) <= s && Math.abs(var4.IillIlllilillIllli - done.IillIlllilillIllli) <= s) {
            return true;
         }
      }

      return false;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 19360)) + '软') ^ var5) - 2329) + var5))) + 18453) - 32645) - 6036) - var5) >>> 5 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 19360)) + '软') ^ var5) - 2329) + var5))) + 18453) - 32645) - 6036) - var5) << 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static void IlIlllIlilIl(List<Ililiillliliil> clue, int spots, int prefix, lIilllliIillll radius, String now, lliIIIliliIIIl min, long book) {
      if (clue.size() >= spots) {
         ArrayList var8 = new ArrayList();

         for(Ililiillliliil var10 : clue) {
            if (!IiIlliIliiIl(var8, var10, prefix * 2)) {
               int var11 = 0;

               for(Ililiillliliil var13 : clue) {
                  if (Math.abs(var13.iIllIllliIlllIllli - var10.iIllIllliIlllIllli) <= prefix && Math.abs(var13.IillIlllilillIllli - var10.IillIlllilillIllli) <= prefix && Math.abs(var13.llllIllliilllIllli - var10.llllIllliilllIllli) <= prefix) {
                     ++var11;
                  }
               }

               if (var11 >= spots) {
                  min.lIiiIiIlilli(radius, var10.iIllIllliIlllIllli, var10.llllIllliilllIllli, var10.IillIlllilillIllli, now + (var10.iIllIllliIlllIllli >> 4) + Illlllllilll<invokedynamic>() + (var10.IillIlllilillIllli >> 4), book);
                  var8.add(var10);
               }
            }
         }

      }
   }

   private boolean iIlIlllllill(class_1297 e, class_746 self) {
      if (!e.method_5626(self) && self.method_5854() != e && !this.ilIIIilIll.contains(e.method_5667())) {
         if (e instanceof class_1321) {
            class_1321 var3 = (class_1321)e;
            if (var3.method_6181() && var3.method_6171(self)) {
               return true;
            }
         }

         boolean var10000;
         if (e instanceof class_9817) {
            class_9817 var4 = (class_9817)e;
            if (var4.method_60953() && var4.method_60952() == self) {
               var10000 = true;
               return var10000;
            }
         }

         var10000 = false;
         return var10000;
      } else {
         return true;
      }
   }

   private static boolean IilliliilIIi(class_1646 v) {
      String var1 = v.method_7231().comp_3521().method_55840();
      return !var1.endsWith(Illlllllilll<invokedynamic>()) && !var1.endsWith(Illlllllilll<invokedynamic>());
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) - 29284) >>> 9 | (char)((char)((char)(~var4[var5]) ^ var5) - 29284) << 7) + var5) - var5) >>> 15 | (char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) - 29284) >>> 9 | (char)((char)((char)(~var4[var5]) ^ var5) - 29284) << 7) + var5) - var5) << 1) + var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) - 29284) >>> 9 | (char)((char)((char)(~var4[var5]) ^ var5) - 29284) << 7) + var5) - var5) >>> 15 | (char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) - 29284) >>> 9 | (char)((char)((char)(~var4[var5]) ^ var5) - 29284) << 7) + var5) - var5) << 1) + var5) << 6))) ^ '쒚') << 8 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) - 29284) >>> 9 | (char)((char)((char)(~var4[var5]) ^ var5) - 29284) << 7) + var5) - var5) >>> 15 | (char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) - 29284) >>> 9 | (char)((char)((char)(~var4[var5]) ^ var5) - 29284) << 7) + var5) - var5) << 1) + var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) - 29284) >>> 9 | (char)((char)((char)(~var4[var5]) ^ var5) - 29284) << 7) + var5) - var5) >>> 15 | (char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) - 29284) >>> 9 | (char)((char)((char)(~var4[var5]) ^ var5) - 29284) << 7) + var5) - var5) << 1) + var5) << 6))) ^ '쒚') >>> 8))) + 1833) << 15 | (char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) - 29284) >>> 9 | (char)((char)((char)(~var4[var5]) ^ var5) - 29284) << 7) + var5) - var5) >>> 15 | (char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) - 29284) >>> 9 | (char)((char)((char)(~var4[var5]) ^ var5) - 29284) << 7) + var5) - var5) << 1) + var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) - 29284) >>> 9 | (char)((char)((char)(~var4[var5]) ^ var5) - 29284) << 7) + var5) - var5) >>> 15 | (char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) - 29284) >>> 9 | (char)((char)((char)(~var4[var5]) ^ var5) - 29284) << 7) + var5) - var5) << 1) + var5) << 6))) ^ '쒚') << 8 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) - 29284) >>> 9 | (char)((char)((char)(~var4[var5]) ^ var5) - 29284) << 7) + var5) - var5) >>> 15 | (char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) - 29284) >>> 9 | (char)((char)((char)(~var4[var5]) ^ var5) - 29284) << 7) + var5) - var5) << 1) + var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) - 29284) >>> 9 | (char)((char)((char)(~var4[var5]) ^ var5) - 29284) << 7) + var5) - var5) >>> 15 | (char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) - 29284) >>> 9 | (char)((char)((char)(~var4[var5]) ^ var5) - 29284) << 7) + var5) - var5) << 1) + var5) << 6))) ^ '쒚') >>> 8))) + 1833) >>> 1) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IliIlllilIi() {
      this.ilIIIilIll.clear();
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(~var4[var5]))) + var5) + var5) + var5) ^ var5) - var5))) ^ var5) >>> 6 | (char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(~var4[var5]))) + var5) + var5) + var5) ^ var5) - var5))) ^ var5) << 10) ^ var5) - '\uea4d'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
