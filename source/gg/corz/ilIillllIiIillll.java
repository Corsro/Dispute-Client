package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1661;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_7923;

final class ilIillllIiIillll implements llIillIlilIillIl {
   // $FF: synthetic field
   final iIlIilIlIllIilIl iiIIliIill;

   public int IilliliilIIi() {
      iIilliIlIlilliIl var1 = this.iiIIliIill.iiililliIl.lIiiIiIlilli();
      return var1 == null ? 0 : var1.liiIiiiIll;
   }

   public String Iliilliiilii() {
      try {
         return ilIllIiIll.Iiiilllliiilll.method_1548().method_1676();
      } catch (Throwable var2) {
         return iIiIlIliIl<invokedynamic>();
      }
   }

   public int iliIiiliiiii() {
      return this.illIlIilIl();
   }

   public IIlIiIilIlIiIi IiIIlliIIl() {
      return IIlIiIilIlIiIi.IliIlllilIi(this.iiIIliIill.IiiiIiliIl.Iilllilliill());
   }

   public lliIiIIliliIiIIl llIIlilIIl() {
      lliIiIIliliIiIIl var10000;
      switch (this.iiIIliIill.iiIliiliIl.ordinal()) {
         case 0:
         case 20:
            var10000 = lliIiIIliliIiIIl.IIIllIilIl;
            break;
         case 1:
         case 6:
         case 9:
         case 10:
         case 11:
         case 12:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 27:
         default:
            var10000 = lliIiIIliliIiIIl.lIIllIilIl;
            break;
         case 2:
         case 3:
         case 4:
         case 5:
         case 7:
         case 8:
         case 19:
            var10000 = lliIiIIliliIiIIl.iIIllIilIl;
            break;
         case 13:
         case 24:
         case 25:
         case 26:
         case 28:
            var10000 = lliIiIIliliIiIIl.IlIllIilIl;
            break;
         case 21:
            var10000 = lliIiIIliliIiIIl.llIllIilIl;
            break;
         case 22:
         case 23:
            var10000 = lliIiIIliliIiIIl.ilIllIilIl;
      }

      return var10000;
   }

   // $FF: synthetic method
   private static CallSite lIIlliIIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + var5) << 12 | (char)((char)((char)(var4[var5] - var5) ^ var5) + var5) >>> 4) + '\uf3b1') ^ 6702))) ^ 11854) + var5) - var5) << 6 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + var5) << 12 | (char)((char)((char)(var4[var5] - var5) ^ var5) + var5) >>> 4) + '\uf3b1') ^ 6702))) ^ 11854) + var5) - var5) >>> 10) + '褠') + '켟'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IIIIllIIIl() {
      return this.iiIIliIill.lIIIliliIl.Iilllilliill();
   }

   public Set<String> lIlIliIlIl() {
      String var1 = this.iiIIliIill.IIIIliliIl.Iilllilliill();
      if (var1 != null && !var1.isBlank()) {
         HashSet var2 = new HashSet();

         for(String var6 : var1.split(iIiIlIliIl<invokedynamic>())) {
            if (!var6.isBlank()) {
               var2.add(var6.trim().toLowerCase(Locale.ROOT));
            }
         }

         return var2;
      } else {
         return Collections.emptySet();
      }
   }

   private boolean lilIliilIl(class_2680 want) {
      return want != null && iIlIilIlIllIilIl.liIiiiiIii(want) != class_1802.field_8162;
   }

   public String Iiiiliiiiiii() {
      return ilIllIiIll.Iiiilllliiilll.field_1724 == null ? "" : ilIllIiIll.Iiiilllliiilll.field_1724.method_5667().toString();
   }

   public int Illlllllilll() {
      return this.iiIIliIill.lliiilliIl.Ililllililil();
   }

   public boolean IIIilIIiiIIi() {
      return this.iiIIliIill.IliIlllilIi();
   }

   public llIIliIiilIIliIi Ililllililil() {
      return this.iiIIliIill.iiililliIl.lIiiIiIlilli() != null && ilIllIiIll.Iiiilllliiilll.field_1687 != null ? new llIIliIiilIIliIi(new iIliIlIlIlliIlIl(this.iiIIliIill.lIIiilliIl, this.iiIIliIill.iIIiilliIl, this.iiIIliIill.IlIiilliIl, this.iiIIliIill.IliiilliIl.Ililllililil(), this.iiIIliIill.lliiilliIl.Ililllililil()), this.iiIIliIill.lliillIliliillIl()) : null;
   }

   public double Illillliilli() {
      return ilIllIiIll.Iiiilllliiilll.field_1724 == null ? (double)0.0F : ilIllIiIll.Iiiilllliiilll.field_1724.method_73189().field_1351;
   }

   public String IIiilIiiiIii() {
      return this.iiIIliIill.lliillIliliillIl();
   }

   private int illIlIilIl() {
      if (!this.iiIIliIill.iilIiIllIIiIiIll()) {
         return 0;
      } else {
         List var1 = this.iiIIliIill.IIIiilliIl.Iilllilliill();
         int var2 = Math.min(this.iiIIliIill.IIIiilliIl.Illlllllilll().size(), var1.size());
         int var3 = 0;

         for(int var4 = 0; var4 < var2; ++var4) {
            if (iIlIilIlIllIilIl.liIiiiiIii((class_2680)var1.get(var4)) != class_1802.field_8162) {
               ++var3;
            }
         }

         return var3;
      }
   }

   public int IlIlllIlilIl() {
      return this.iiIIliIill.iIIiilliIl;
   }

   public IiiIIlllliiIIlll iIIIlIlIIl() {
      IiiIIlllliiIIlll var1 = new IiiIIlllliiIIlll();
      if (this.iiIIliIill.lIIIliliIl.Iilllilliill() && ilIllIiIll.Iiiilllliiilll.field_1724 != null && this.iiIIliIill.iilIiIllIIiIiIll()) {
         Set var2 = this.iiIIliIill.lIiIiIlliIiIiIll(this.iiIIliIill.IIIiilliIl.Iilllilliill());
         class_1661 var3 = ilIllIiIll.Iiiilllliiilll.field_1724.method_31548();

         for(int var4 = 0; var4 <= 35; ++var4) {
            class_1799 var5 = var3.method_5438(var4);
            if (!var5.method_7960() && var2.contains(var5.method_7909())) {
               var1.IliIlllilIi(class_7923.field_41178.method_10221(var5.method_7909()).toString(), var5.method_7947());
            }
         }

         return var1;
      } else {
         return var1;
      }
   }

   private ilIillllIiIillll(final iIlIilIlIllIilIl var1) {
      this.iiIIliIill = var1;
   }

   public void IllIllllIl(String msg) {
      long var3 = -4383417521390749925L;
      var3 ^= ((long)(!msg.startsWith(iIiIlIliIl<invokedynamic>()) && !msg.contains(iIiIlIliIl<invokedynamic>()) && !msg.contains(iIiIlIliIl<invokedynamic>()) ? 0 : 1) << 32 ^ var3) & -1L << 32;
      if ((int)(var3 >>> 32) != 0) {
         this.iiIIliIill.IiilIiiliilIii(msg);
      }

      if ((int)(var3 >>> 32) == 0) {
         this.iiIIliIill.iiilIiiIIIiIii(msg);
      }

   }

   public String iiIIlIIlIl() {
      return this.iiIIliIill.liiiIiliIl.Iilllilliill() == null ? "" : this.iiIIliIill.liiiIiliIl.Iilllilliill().trim();
   }

   public IIIIliilIIIlii IIillIiliIil() {
      iIilliIlIlilliIl var1 = this.iiIIliIill.iiililliIl.lIiiIiIlilli();
      if (var1 == null) {
         return IIIIliilIIIlii.IliIlllilIi("", 0, 0, 0, 0, 0L);
      } else if (var1 == this.iiIIliIill.lliIlllIll && this.iiIIliIill.iliIlllIll != null) {
         return this.iiIIliIill.iliIlllIll;
      } else {
         IIiillIllIiillIl var2 = IlilIlllilIl.liiiIIllIl(var1);
         this.iiIIliIill.iliIlllIll = IIIIliilIIIlii.IliIlllilIi(var1.iliIiiiIll, var1.IiiIiiiIll, var1.liiIiiiIll, var1.iiiIiiiIll, var2.liiiIIllIl(), var2.IliIlllilIi());
         this.iiIIliIill.lliIlllIll = var1;
         return this.iiIIliIill.iliIlllIll;
      }
   }

   public int IiIlliIliiIl() {
      return this.iiIIliIill.IlIiilliIl;
   }

   // $FF: synthetic method
   private static CallSite IlIllllIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 'ꐵ') - 30214) + 20521) ^ var5) >>> 2 | (char)((char)((char)((char)(var4[var5] ^ 'ꐵ') - 30214) + 20521) ^ var5) << 14) - 13313) << 8 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 'ꐵ') - 30214) + 20521) ^ var5) >>> 2 | (char)((char)((char)((char)(var4[var5] ^ 'ꐵ') - 30214) + 20521) ^ var5) << 14) - 13313) >>> 8))) << 2 | (char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 'ꐵ') - 30214) + 20521) ^ var5) >>> 2 | (char)((char)((char)((char)(var4[var5] ^ 'ꐵ') - 30214) + 20521) ^ var5) << 14) - 13313) << 8 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 'ꐵ') - 30214) + 20521) ^ var5) >>> 2 | (char)((char)((char)((char)(var4[var5] ^ 'ꐵ') - 30214) + 20521) ^ var5) << 14) - 13313) >>> 8))) >>> 14))) << 5 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 'ꐵ') - 30214) + 20521) ^ var5) >>> 2 | (char)((char)((char)((char)(var4[var5] ^ 'ꐵ') - 30214) + 20521) ^ var5) << 14) - 13313) << 8 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 'ꐵ') - 30214) + 20521) ^ var5) >>> 2 | (char)((char)((char)((char)(var4[var5] ^ 'ꐵ') - 30214) + 20521) ^ var5) << 14) - 13313) >>> 8))) << 2 | (char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 'ꐵ') - 30214) + 20521) ^ var5) >>> 2 | (char)((char)((char)((char)(var4[var5] ^ 'ꐵ') - 30214) + 20521) ^ var5) << 14) - 13313) << 8 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 'ꐵ') - 30214) + 20521) ^ var5) >>> 2 | (char)((char)((char)((char)(var4[var5] ^ 'ꐵ') - 30214) + 20521) ^ var5) << 14) - 13313) >>> 8))) >>> 14))) >>> 11) ^ 27099) + '６') ^ 'ﴞ') ^ '뜱') ^ '\uf8e7'))) - '졡'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IIlllIlliIll() {
      return this.iiIIliIill.IliiilliIl.Ililllililil();
   }

   public String liiiIIllIl() {
      iIilliIlIlilliIl var1 = this.iiIIliIill.iiililliIl.lIiiIiIlilli();
      return var1 == null ? "" : var1.iliIiiiIll;
   }

   public boolean Iiilliiliiil(llIIliIiilIIliIi a) {
      return this.iiIIliIill.IiiillIlliiillIl(a, iIiIlIliIl<invokedynamic>());
   }

   public llliiiIiilliiiIi IlIillIiilIi(IiiiIiIlliiiIiIl gen, long job) {
      if (ilIllIiIll.Iiiilllliiilll.field_1687 != null && this.iiIIliIill.liiliiliIl != null && this.iiIIliIill.iiiliiliIl != null) {
         this.iiIIliIill.llIilIiilIilIi(new class_2338(gen.IliilliIll, gen.lliilliIll, gen.iliilliIll));
         if (this.iiIIliIill.IlilliIIll != null && this.iiIIliIill.IlilliIIll.size() == this.iiIIliIill.liiliiliIl.size()) {
            if (this.iiIIliIill.liiIlllIll != null && !this.iiIIliIill.liiIlllIll.equals(this.iiIIliIill.lliillIliliillIl())) {
               return this.IIiIllIiIl(gen, job);
            } else {
               int var4 = 0;
               int var5 = 0;
               int var6 = 0;
               int var7 = 0;
               int var8 = 0;
               class_2338.class_2339 var9 = new class_2338.class_2339();

               for(int var10 = gen.IliilliIll; var10 <= gen.IiiilliIll; ++var10) {
                  for(int var11 = gen.lliilliIll; var11 <= gen.liiilliIll; ++var11) {
                     for(int var12 = gen.iliilliIll; var12 <= gen.iiiilliIll; ++var12) {
                        Integer var13 = (Integer)this.iiIIliIill.IlilliIIll.get(class_2338.method_10064(var10, var11, var12));
                        if (var13 != null && var13 >= 0 && var13 < this.iiIIliIill.iiiliiliIl.size()) {
                           class_2680 var14 = (class_2680)this.iiIIliIill.iiiliiliIl.get(var13);
                           if (this.lilIliilIl(var14)) {
                              ++var8;
                              if (!ilIllIiIll.Iiiilllliiilll.field_1687.method_31601(var11) && ilIllIiIll.Iiiilllliiilll.field_1687.method_8393(var10 >> 4, var12 >> 4)) {
                                 var9.method_10103(var10, var11, var12);
                                 class_2680 var15 = ilIllIiIll.Iiiilllliiilll.field_1687.method_8320(var9);
                                 if (var15.method_26204() != var14.method_26204()) {
                                    if (!var15.method_26215() && !var15.method_45474()) {
                                       ++var6;
                                    } else {
                                       ++var5;
                                    }
                                 } else if (this.iiIIliIill.IIIllllIIlll(var9.method_10062(), var14)) {
                                    ++var4;
                                 } else {
                                    ++var6;
                                 }
                              } else {
                                 ++var7;
                              }
                           }
                        }
                     }
                  }
               }

               var7 += Math.max(0, gen.IIIIiliIll - var8);
               return new llliiiIiilliiiIi(gen.iililliIll, job, gen.IIIIiliIll, var4, var5, var6, var7, iIlIilIlIllIilIl.llIilIiiIl);
            }
         } else {
            return this.IIiIllIiIl(gen, job);
         }
      } else {
         return this.IIiIllIiIl(gen, job);
      }
   }

   public int lIiiIiIlilli() {
      iIilliIlIlilliIl var1 = this.iiIIliIill.iiililliIl.lIiiIiIlilli();
      return var1 == null ? 0 : var1.iiiIiiiIll;
   }

   public double IIlilIliiIli() {
      return ilIllIiIll.Iiiilllliiilll.field_1724 == null ? (double)0.0F : ilIllIiIll.Iiiilllliiilll.field_1724.method_73189().field_1352;
   }

   public int iIlIlllllill() {
      iIilliIlIlilliIl var1 = this.iiIIliIill.iiililliIl.lIiiIiIlilli();
      return var1 == null ? 0 : var1.IiiIiiiIll;
   }

   // $FF: synthetic method
   private static CallSite iIiIlIliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6075363922543775460L ^ Long.rotateLeft(-1857175034245832590L, 31) ^ 5349429317917587866L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -624119702173012070L ^ Long.rotateLeft(-5636329980674172894L, 23) ^ 1207606882856680882L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 2377466841623949061L ^ Long.rotateLeft(-2530529816416797918L, 18) ^ -7042695272301720404L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4977805626274889495L ^ Long.rotateLeft(4115505675052862779L, 20) ^ -5395722712055957666L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3759619904376369853L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8491033182641188686L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7037450529411987433L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3400347267351624551L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 108068541677266897L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 7596393914079328918L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(lliIliliIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiiIlliiIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, iiiIlIIIll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, lIIlliIIll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IlIllllIll<invokedynamic>());
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

   public iIIllIlIlIllIl IiIiliIiiiIi() {
      return new iIIllIlIlIllIl(2, iIiIlIliIl<invokedynamic>(), iIiIlIliIl<invokedynamic>(), iIiIlIliIl<invokedynamic>(), iIiIlIliIl<invokedynamic>(), this.IIillIiliIil().Ililllililil(), this.IIlllIlliIll() + iIiIlIliIl<invokedynamic>() + this.Illlllllilll() + iIiIlIliIl<invokedynamic>() + this.IIIllIIliIIl() + iIiIlIliIl<invokedynamic>() + this.IlIlllIlilIl() + iIiIlIliIl<invokedynamic>() + this.IiIlliIliiIl());
   }

   // $FF: synthetic method
   private static CallSite lliIliliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] + 5285) - '\ue8a6') - 27907))) >>> 12 | (char)(~((char)((char)((char)(var4[var5] + 5285) - '\ue8a6') - 27907))) << 4))) + var5))) ^ var5) ^ var5))) - '씚') - var5) + var5) + var5) + var5) ^ 31827) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iiiIlIIIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] + '鼈') >>> 14 | (char)(var4[var5] + '鼈') << 2) + var5))) - var5))) + 27592) + 9950) ^ var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IIIllIIliIIl() {
      return this.iiIIliIill.lIIiilliIl;
   }

   // $FF: synthetic method
   private static CallSite IiiIlliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 26300) - var5) + 9595) >>> 7 | (char)((char)((char)(var4[var5] - 26300) - var5) + 9595) << 9) - var5) ^ var5) >>> 10 | (char)((char)((char)((char)((char)((char)(var4[var5] - 26300) - var5) + 9595) >>> 7 | (char)((char)((char)(var4[var5] - 26300) - var5) + 9595) << 9) - var5) ^ var5) << 6))) - 24876) << 1 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 26300) - var5) + 9595) >>> 7 | (char)((char)((char)(var4[var5] - 26300) - var5) + 9595) << 9) - var5) ^ var5) >>> 10 | (char)((char)((char)((char)((char)((char)(var4[var5] - 26300) - var5) + 9595) >>> 7 | (char)((char)((char)(var4[var5] - 26300) - var5) + 9595) << 9) - var5) ^ var5) << 6))) - 24876) >>> 15) ^ var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private llliiiIiilliiiIi IIiIllIiIl(IiiiIiIlliiiIiIl job, long gen) {
      return new llliiiIiilliiiIi(job.iililliIll, gen, job.IIIIiliIll, 0, 0, 0, job.IIIIiliIll, iIlIilIlIllIilIl.llIilIiiIl);
   }

   public double Iilililiiili() {
      return ilIllIiIll.Iiiilllliiilll.field_1724 == null ? (double)0.0F : ilIllIiIll.Iiiilllliiilll.field_1724.method_73189().field_1350;
   }

   public void Iilllilliill(iiIlIIiIIllIIi c) {
      if (this.iiIIliIill.iilIiIllIIiIiIll()) {
         List var2 = this.iiIIliIill.IIIiilliIl.Illlllllilll();
         List var3 = this.iiIIliIill.IIIiilliIl.Iilllilliill();
         int var4 = Math.min(var2.size(), var3.size());

         for(int var5 = 0; var5 < var4; ++var5) {
            class_1792 var6 = iIlIilIlIllIilIl.liIiiiiIii((class_2680)var3.get(var5));
            if (var6 != class_1802.field_8162) {
               class_2338 var7 = (class_2338)var2.get(var5);
               c.accept(var7.method_10263(), var7.method_10264(), var7.method_10260(), class_7923.field_41178.method_10221(var6).toString());
            }
         }

      }
   }

   public boolean IliIlllilIi() {
      return this.iiIIliIill.iiililliIl.lIiiIiIlilli() != null;
   }
}
