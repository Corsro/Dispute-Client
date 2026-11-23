package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Base64;
import java.util.Deque;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1657;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import net.minecraft.class_1716;
import net.minecraft.class_1799;
import net.minecraft.class_2561;
import net.minecraft.class_746;

public class iIliiIllii extends ilIllIiIll {
   private static final int llIillIlilIillIl = 9;
   private static final int iiIillIlIIlillIl = 45;
   private static final int IiIillIlliIillIl = 9;
   private int IiiillIlliiillIl;
   private final int[] lIIIilIliIIIilIl;
   private final class_1799[] iiiillIlIIIIilIl;
   private int ilIIilIlIiIIilIl;
   private int lliillIliliillIl;
   private final iiIiiilIIliiil lilillIliilillIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final int lIlillIliIlillIl = 0;
   private ilIiiIIiIiIiiIIi iIiillIlIliillIl;
   private final iilliIlIIiliIl illillIlIilillIl = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0, 0, 10);
   private final Deque<int[]> IlIIilIlllIIilIl;
   private final iiIiiilIIliiil IIiillIllIiillIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final int IllillIllllillIl = 1;

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + '\ueb6d') ^ 32264) + var5))) + var5) - '툖') + var5) - var5) + var5) + 'ﶸ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void lllllillll() {
      if (this.liIlliiIll()) {
         class_746 var1 = Iiiilllliiilll.field_1724;
         if (var1 != null) {
            class_1703 var3 = var1.field_7512;
            if (var3 instanceof class_1716) {
               class_1716 var2 = (class_1716)var3;
               if (var2.field_7763 == this.IiiillIlliiillIl) {
                  this.IlIIilIlllIIilIl.clear();
                  this.ilIIilIlIiIIilIl = 0;
                  boolean[] var8 = new boolean[45];
                  int var4 = 0;

                  for(int var5 = 0; var5 < 9; ++var5) {
                     if (var5 != this.lliillIliliillIl) {
                        class_1799 var6 = this.iiiillIlIIIIilIl[var5];
                        if (var6 != null && !var6.method_7960()) {
                           int var7 = this.liilliiill(var2, var6, var5, var8);
                           if (var7 < 0) {
                              ++var4;
                           } else {
                              var8[var7] = true;
                              this.IlIIilIlllIIilIl.add(new int[]{0, var7, var5});
                           }
                        }
                     }
                  }

                  this.iIiillIlIliillIl = ilIiiIIiIiIiiIIi.IlliIiiiil;
                  if (var4 > 0) {
                     this.llIililIil(IliIlllilIi<invokedynamic>() + var4 + IliIlllilIi<invokedynamic>());
                  }

                  return;
               }
            }
         }

         this.IIIillIIil(true);
      }
   }

   private void iIIilIlIil() {
      this.iIiillIlIliillIl = ilIiiIIiIiIiiIIi.IIliIiiiil;
      this.lliillIliliillIl = -1;
      this.IiiillIlliiillIl = -1;
      this.IlIIilIlllIIilIl.clear();
      this.ilIIilIlIiIIilIl = 0;

      for(int var1 = 0; var1 < 9; ++var1) {
         this.iiiillIlIIIIilIl[var1] = null;
         this.lIIIilIliIIIilIl[var1] = -1;
      }

   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -4867979888797780316L ^ Long.rotateLeft(901036743597225385L, 55) ^ 7506818765114204024L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -3580509428811342537L ^ Long.rotateLeft(6676969502469029537L, 36) ^ -2973933841236068275L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7107377689744491982L ^ Long.rotateLeft(-7156127886718330842L, 18) ^ -8451042039119323094L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3065947736823134296L ^ Long.rotateLeft(6235202387567897640L, 21) ^ 7024765155498897499L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 2167385177616588448L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1624905041798301650L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -603515084741041357L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5735658640701875747L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 7938317914965084295L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -3876162282016927451L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(liiiIIllIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iIlIlllllill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IilliliilIIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, lIiiIiIlilli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iliIiiliiiii<invokedynamic>());
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
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 14 | (char)(var4[var5] - var5) << 2) ^ 26352) << 14 | (char)((char)((char)(var4[var5] - var5) >>> 14 | (char)(var4[var5] - var5) << 2) ^ 26352) >>> 2) - var5) >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) >>> 14 | (char)(var4[var5] - var5) << 2) ^ 26352) << 14 | (char)((char)((char)(var4[var5] - var5) >>> 14 | (char)(var4[var5] - var5) << 2) ^ 26352) >>> 2) - var5) << 5))) >>> 3 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 14 | (char)(var4[var5] - var5) << 2) ^ 26352) << 14 | (char)((char)((char)(var4[var5] - var5) >>> 14 | (char)(var4[var5] - var5) << 2) ^ 26352) >>> 2) - var5) >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) >>> 14 | (char)(var4[var5] - var5) << 2) ^ 26352) << 14 | (char)((char)((char)(var4[var5] - var5) >>> 14 | (char)(var4[var5] - var5) << 2) ^ 26352) >>> 2) - var5) << 5))) << 13))) ^ 'ꔽ') - var5))))) + var5) ^ var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void Ilillllill(class_1657 p, int slot, int type, class_1713 button) {
      Iiiilllliiilll.field_1761.method_2906(this.IiiillIlliiillIl, slot, type, button, p);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(~((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(var4[var5] - var5) + 13875) >>> 15 | (char)((char)(var4[var5] - var5) + 13875) << 1) + var5))) >>> 11 | (char)(~((char)((char)((char)((char)(var4[var5] - var5) + 13875) >>> 15 | (char)((char)(var4[var5] - var5) + 13875) << 1) + var5))) << 5))) - '쭠') << 15 | (char)((char)(~((char)((char)(~((char)((char)((char)((char)(var4[var5] - var5) + 13875) >>> 15 | (char)((char)(var4[var5] - var5) + 13875) << 1) + var5))) >>> 11 | (char)(~((char)((char)((char)((char)(var4[var5] - var5) + 13875) >>> 15 | (char)((char)(var4[var5] - var5) + 13875) << 1) + var5))) << 5))) - '쭠') >>> 1) + '\udad7'))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - '\uee89') << 11 | (char)((char)(-var4[var5]) - '\uee89') >>> 5) ^ var5) + var5) ^ 4081) >>> 15 | (char)((char)((char)((char)((char)((char)(-var4[var5]) - '\uee89') << 11 | (char)((char)(-var4[var5]) - '\uee89') >>> 5) ^ var5) + var5) ^ 4081) << 1) << 14 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - '\uee89') << 11 | (char)((char)(-var4[var5]) - '\uee89') >>> 5) ^ var5) + var5) ^ 4081) >>> 15 | (char)((char)((char)((char)((char)((char)(-var4[var5]) - '\uee89') << 11 | (char)((char)(-var4[var5]) - '\uee89') >>> 5) ^ var5) + var5) ^ 4081) << 1) >>> 2) - 8240) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iIlllIllll(int slot) {
      if (this.ilIllIiIll() && slot >= 0 && slot < 9) {
         class_746 var2 = Iiiilllliiilll.field_1724;
         if (var2 != null) {
            class_1703 var4 = var2.field_7512;
            if (var4 instanceof class_1716) {
               class_1716 var3 = (class_1716)var4;
               this.IiiillIlliiillIl = var3.field_7763;
               this.lliillIliliillIl = slot;
               this.IlIIilIlllIIilIl.clear();
               this.ilIIilIlIiIIilIl = 0;
               boolean[] var8 = new boolean[45];
               int var5 = 0;

               for(int var6 = 0; var6 < 9; ++var6) {
                  this.iiiillIlIIIIilIl[var6] = var3.method_7611(var6).method_7677().method_7972();
                  this.lIIIilIliIIIilIl[var6] = -1;
               }

               for(int var9 = 0; var9 < 9; ++var9) {
                  if ((!this.lilillIliilillIl.Iilllilliill() || var9 != this.lliillIliliillIl) && !this.iiiillIlIIIIilIl[var9].method_7960()) {
                     int var7 = this.ilillIiill(var3, var8);
                     if (var7 >= 0) {
                        var8[var7] = true;
                        this.lIIIilIliIIIilIl[var9] = var7;
                        this.IlIIilIlllIIilIl.add(new int[]{0, var9, var7});
                     } else {
                        ++var5;
                        this.IlIIilIlllIIilIl.add(new int[]{1, var9, 0});
                     }
                  }
               }

               if (this.IlIIilIlllIIilIl.isEmpty()) {
                  this.iIiillIlIliillIl = ilIiiIIiIiIiiIIi.iIliIiiiil;
                  this.llIililIil(IliIlllilIi<invokedynamic>());
                  return;
               }

               this.iIiillIlIliillIl = ilIiiIIiIiIiiIIi.lIliIiiiil;
               if (var5 > 0) {
                  this.llIililIil(IliIlllilIi<invokedynamic>() + var5 + IliIlllilIi<invokedynamic>());
               }

               return;
            }
         }

      }
   }

   protected void Iilililiiili() {
      this.IIIillIIil(false);
   }

   public boolean liIlliiIll() {
      return this.iIiillIlIliillIl == ilIiiIIiIiIiiIIi.iIliIiiiil && this.IIllllIlll();
   }

   protected void iIIIlIlIIl() {
      if (this.IlIIilIlllIIilIl.isEmpty()) {
         this.iilllIIill();
      } else {
         class_746 var1 = Iiiilllliiilll.field_1724;
         if (var1 != null && Iiiilllliiilll.field_1761 != null && var1.field_7512 instanceof class_1716 && var1.field_7512.field_7763 == this.IiiillIlliiillIl) {
            boolean var2 = this.illillIlIilillIl.Iilllilliill() <= 0;

            while(!this.IlIIilIlllIIilIl.isEmpty()) {
               if (this.ilIIilIlIiIIilIl > 0) {
                  --this.ilIIilIlIiIIilIl;
                  return;
               }

               this.lIilliIill(var1, (int[])this.IlIIilIlllIIilIl.poll());
               this.ilIIilIlIiIIilIl = this.illillIlIilillIl.Iilllilliill();
               if (!var2) {
                  return;
               }
            }

            this.iilllIIill();
         } else {
            this.IIIillIIil(true);
         }
      }
   }

   public boolean ilIllIiIll() {
      return this.iIiillIlIliillIl == ilIiiIIiIiIiiIIi.IIliIiiiil && this.IIllllIlll();
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '뀃') ^ '薮') + '\udcdf') + var5) + '\ue9bb') >>> 8 | (char)((char)((char)((char)((char)(var4[var5] ^ '뀃') ^ '薮') + '\udcdf') + var5) + '\ue9bb') << 8) + var5) ^ '\ue1d6') + var5) - var5))) ^ 20776) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void Iillllilll() {
      long var2 = 1807640989502410261L;
      var2 ^= ((long)(this.iIiillIlIliillIl == ilIiiIIiIiIiiIIi.IIliIiiiil && this.lliillIliliillIl < 0 ? 0 : 1) << 32 ^ var2) & -1L << 32;
      this.iIIilIlIil();
      if ((int)(var2 >>> 32) != 0) {
         this.llIililIil(IliIlllilIi<invokedynamic>());
      }

   }

   private int liilliiill(class_1703 menu, class_1799 used, int want, boolean[] j) {
      int var5 = this.lIIIilIliIIIilIl[want];
      if (var5 >= 9 && var5 < 45 && !j[var5] && class_1799.method_7973(menu.method_7611(var5).method_7677(), used)) {
         return var5;
      } else {
         for(int var6 = 9; var6 < 45; ++var6) {
            if (!j[var6] && class_1799.method_7973(menu.method_7611(var6).method_7677(), used)) {
               return var6;
            }
         }

         for(int var8 = 9; var8 < 45; ++var8) {
            class_1799 var7 = menu.method_7611(var8).method_7677();
            if (!j[var8] && !var7.method_7960() && class_1799.method_31577(var7, used)) {
               return var8;
            }
         }

         return -1;
      }
   }

   private boolean IIllllIlll() {
      return Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1724.field_7512 instanceof class_1716;
   }

   private void llIililIil(String msg) {
      if (this.IIiillIllIiillIl.Iilllilliill() && Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1724.method_7353(class_2561.method_43470(msg), false);
      }
   }

   private void lIilliIill(class_1657 p, int[] step) {
      class_1703 var3 = p.field_7512;
      if (step[0] == 1) {
         this.Ilillllill(p, step[1], 0, class_1713.field_7794);
      } else {
         this.Ilillllill(p, step[1], 0, class_1713.field_7790);
         if (!var3.method_34255().method_7960()) {
            this.Ilillllill(p, step[2], 0, class_1713.field_7790);
         }

         if (!var3.method_34255().method_7960()) {
            this.Ilillllill(p, step[1], 0, class_1713.field_7790);
         }

      }
   }

   public int lIIlliIIll() {
      return this.lliillIliliillIl;
   }

   public int IlIllllIll() {
      return this.IlIIilIlllIIilIl.size();
   }

   private void IIIillIIil(boolean warn) {
      long var3 = 99281824806123258L;
      var3 ^= ((long)(this.iIiillIlIliillIl != ilIiiIIiIiIiiIIi.IIliIiiiil ? 1 : 0) << 32 ^ var3) & -1L << 32;
      this.iIIilIlIil();
      if (warn && (int)(var3 >>> 32) != 0) {
         this.llIililIil(IliIlllilIi<invokedynamic>());
      }

   }

   private int ilillIiill(class_1703 menu, boolean[] reserved) {
      for(int var3 = 9; var3 < 45; ++var3) {
         if (!reserved[var3] && menu.method_7611(var3).method_7677().method_7960()) {
            return var3;
         }
      }

      return -1;
   }

   private void iilllIIill() {
      if (this.IlIIilIlllIIilIl.isEmpty()) {
         if (this.iIiillIlIliillIl == ilIiiIIiIiIiiIIi.lIliIiiiil) {
            this.iIiillIlIliillIl = ilIiiIIiIiIiiIIi.iIliIiiiil;
            this.llIililIil(IliIlllilIi<invokedynamic>() + (this.lliillIliliillIl + 1) + IliIlllilIi<invokedynamic>());
         } else if (this.iIiillIlIliillIl == ilIiiIIiIiIiiIIi.IlliIiiiil) {
            this.llIililIil(IliIlllilIi<invokedynamic>() + (this.lliillIliliillIl + 1) + IliIlllilIi<invokedynamic>());
            this.iIIilIlIil();
         }

      }
   }

   public ilIiiIIiIiIiiIIi iiiIlIIIll() {
      return this.iIiillIlIliillIl;
   }

   public iIliiIllii() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.iIiillIlIliillIl = ilIiiIIiIiIiiIIi.IIliIiiiil;
      this.lliillIliliillIl = -1;
      this.IiiillIlliiillIl = -1;
      this.iiiillIlIIIIilIl = new class_1799[9];
      this.lIIIilIliIIIilIl = new int[9];
      this.IlIIilIlllIIilIl = new ArrayDeque();
      this.ilIIilIlIiIIilIl = 0;
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.illillIlIilillIl, this.lilillIliilillIl, this.IIiillIllIiillIl});
   }
}
