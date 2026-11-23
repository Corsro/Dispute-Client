package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_4969;
import net.minecraft.class_638;
import net.minecraft.class_746;

public final class liIlIllliiIlIlll {
   private boolean iIlilIIill;
   private static final float IiillIIill = 0.5F;
   private long iililIIill;
   private class_2338 ilIilIIill;
   private String IiiilIIill;
   public static final int IlillIIill = 8;
   private int iiIilIIill;
   private final IlIIiIIillIIiIIi iIIilIIill;
   private Iiilllliilll llIilIIill;
   private long lllilIIill;
   private boolean IllilIIill;
   private static final int iiillIIill = 9;
   private class_243 lliilIIill;
   public static final int llillIIill = 10;
   private int lIiilIIill;
   public static final int iIillIIill = 4;
   private static final int ilillIIill = 20;
   private boolean IililIIill;
   private int liIilIIill;
   private int illilIIill;
   private long IliilIIill;
   private boolean lIlilIIill;
   private int IIiilIIill;
   private boolean lililIIill;
   private int IIlilIIill;
   public static final int lIillIIill = 10;
   private iIilIlilIlilIlil IlIilIIill;
   private class_2338 IiIilIIill;
   private final illlllllIillllll lIIilIIill;
   private long iIiilIIill;
   private class_2350 iliilIIill;
   private static final String IIIilIIill = "unsafe without cover";
   private static final int liillIIill = 40;

   public void IIIilIIiiIIi() {
      this.iIIilIIill.IiIlliIliiIl();
      this.IlIilIIill = iIilIlilIlilIlil.lllilIiIil;
      this.llIilIIill = null;
      this.ilIilIIill = null;
      this.IiIilIIill = null;
      this.liIilIIill = -1;
      this.iiIilIIill = -1;
      this.IIlilIIill = -1;
      this.lIlilIIill = false;
      this.iIlilIIill = false;
      this.IllilIIill = false;
      this.IililIIill = false;
      this.lililIIill = false;
      this.iililIIill = Long.MIN_VALUE;
      this.IIiilIIill = 0;
      this.lliilIIill = null;
      this.iliilIIill = null;
      this.IiiilIIill = null;
      this.iIiilIIill = Long.MIN_VALUE;
      this.IliilIIill = Long.MIN_VALUE;
   }

   public String Iiilliiliiil() {
      return this.IiiilIIill;
   }

   static int IIllllIlll(int counts, int[] blocked, boolean[] current) {
      long var5 = -9081490532189540057L;
      if (blocked == null) {
         return 0;
      } else {
         var5 ^= (0L ^ var5) & -1L << 32;

         for(var5 ^= (0L ^ var5) & -1L >>> 32; (int)var5 < blocked.length && (int)var5 < 9; var5 ^= (var5 ^ var5 + (long)1) & -1L >>> 32) {
            if (blocked[(int)var5] > 0 && ((int)var5 == counts || !lllllillll(current, (int)var5))) {
               var5 ^= ((long)((int)(var5 >>> 32) + blocked[(int)var5]) << 32 ^ var5) & -1L << 32;
            }
         }

         return (int)(var5 >>> 32);
      }
   }

   // $FF: synthetic method
   private static CallSite IIIillIIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) << 6 | (char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 10) << 10 | (char)((char)(var4[var5] >>> 2 | var4[var5] << 14) << 6 | (char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 10) >>> 6) + var5) + var5) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) << 6 | (char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 10) << 10 | (char)((char)(var4[var5] >>> 2 | var4[var5] << 14) << 6 | (char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 10) >>> 6) + var5) + var5) << 15) >>> 1 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) << 6 | (char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 10) << 10 | (char)((char)(var4[var5] >>> 2 | var4[var5] << 14) << 6 | (char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 10) >>> 6) + var5) + var5) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) << 6 | (char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 10) << 10 | (char)((char)(var4[var5] >>> 2 | var4[var5] << 14) << 6 | (char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 10) >>> 6) + var5) + var5) << 15) << 15) ^ '镔') + var5) ^ 20715) ^ '짙') ^ 14825) - 6852) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite ilillIiill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 569260618241272348L ^ Long.rotateLeft(-2004735419758794678L, 18) ^ -2550728200610302626L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8976899216822777937L ^ Long.rotateLeft(844179469654766625L, 49) ^ -7957983756790049379L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -8021035772010302251L ^ Long.rotateLeft(3809614630932819083L, 33) ^ -8902776624917373060L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 4669792844503740080L ^ Long.rotateLeft(3139914509741987662L, 60) ^ -4609051383040219356L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 4641589392947826808L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 6049723840628009594L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 9036003892913122437L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 647985098909108684L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 2238070341457980596L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -7827410364659624793L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(liilliiill<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIIillIIil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, iIIilIlIil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, llIililIil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIilliIil<invokedynamic>());
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

   private static boolean[] ilIllIiIll() {
      long var3 = -402887643416520893L;
      boolean[] var0 = new boolean[9];
      var3 ^= ((long)IIIIilIilIIIilIi.IlIllllIll() << 32 ^ var3) & -1L << 32;

      for(long var6 = var3 ^ (0L ^ var3) & -1L >>> 32; (int)var6 < 9; var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32) {
         var0[(int)var6] = (int)var6 == (int)(var6 >>> 32) || IIIIilIilIIIilIi.ilIllIiIll((int)var6) || IIIIilIilIIIilIi.iiiIlIIIll((int)var6);
      }

      return var0;
   }

   private static boolean Ilillllill(class_2680 s) {
      return !s.method_27852(class_2246.field_23152);
   }

   private static boolean lllllillll(boolean[] blocked, int i) {
      return blocked != null && i >= 0 && i < blocked.length && blocked[i];
   }

   private boolean iiIIlIIlIl() {
      return this.lililIIill && this.lIIilIIill.IIillIiliIil() - this.iililIIill <= (long)this.illilIIill;
   }

   public void iliIiiliiiii(boolean on) {
      this.IllilIIill = on;
   }

   private boolean iIiIlIliIl(class_746 player) {
      return Iillllilll(this.IIlilIIill) && player.method_31548().method_5438(this.IIlilIIill).method_31574(class_1802.field_8288) || player.method_6079().method_31574(class_1802.field_8288);
   }

   static int liIlliiIll(int counts, int[] blocked, boolean[] current) {
      long var4 = 1484437589009780501L;
      if (blocked == null) {
         return -1;
      } else if (counts >= 0 && counts < blocked.length && blocked[counts] > 0) {
         return counts;
      } else {
         for(long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < blocked.length && (int)(var6 >>> 32) < 9; var6 += 4294967296L) {
            if (blocked[(int)(var6 >>> 32)] > 0 && !lllllillll(current, (int)(var6 >>> 32))) {
               return (int)(var6 >>> 32);
            }
         }

         return -1;
      }
   }

   private lilIillliilIilll IiIiliIiiiIi(class_746 player) {
      if (this.IiIilIIill != null && lliiIliliiIl.lIiiIiIlilli(this.IiIilIIill)) {
         if (lliiIliliiIl.IilliliilIIi(this.ilIilIIill) < 0) {
            return this.IIIIllIIIl(ilillIiill<invokedynamic>());
         } else if (!this.lIlIliIlIl() && lIIlliIIll(player, this.iiIilIIill, class_1802.field_8801)) {
            if (!this.IililIIill) {
               if (lliiIliliiIl.IilliliilIIi(this.ilIilIIill) <= 0 && IIllllIlll(this.iiIilIIill, IlIllllIll(player, class_1802.field_8801), ilIllIiIll()) < 2 || !lliiIliliiIl.iliIiiliiiii(this.IiIilIIill, class_2246.field_10171.method_9564()) || !iliIiillIiiIiill.IIiilIiiiIii(player.method_33571(), this.lIIilIIill.Iilllilliill(), this.ilIilIIill, this.IiIilIIill, (class_238)null, (class_238)null) || !this.iIIilIIill.IliIlllilIi(this.IiIilIIill, this.iiIilIIill, class_2246.field_10171.method_9564(), this.ilIilIIill, this.illilIIill)) {
                  return this.Iiiiliiiiiii();
               }

               this.IililIIill = true;
            }

            lilIillliilIilll var2 = this.iIIilIIill.iIlIlllllill();
            if (var2 == lilIillliilIilll.IIIllIlill) {
               this.IiIIlliIIl();
            }

            if (var2 == lilIillliilIilll.lIIllIlill) {
               this.Iliilliiilii(this.IIiilIiiiIii(iIilIlilIlilIlil.IililIiIil));
               return lilIillliilIilll.iiiIlIlill;
            } else if (var2 == lilIillliilIilll.iIIllIlill) {
               return this.Iiiiliiiiiii();
            } else {
               return var2;
            }
         } else {
            return this.Iiiiliiiiiii();
         }
      } else {
         this.Iliilliiilii(this.IIiilIiiiIii(iIilIlilIlilIlil.IililIiIil));
         return lilIillliilIilll.iiiIlIlill;
      }
   }

   public void lIiiIiIlilli() {
      this.iIlilIIill = true;
   }

   private boolean lilIliilIl() {
      if (this.llIilIIill != null && this.llIilIIill.iIlIlllllill() != null) {
         class_638 var1 = class_310.method_1551().field_1687;
         return var1 == null || !var1.method_8320(this.llIilIIill.iIlIlllllill()).method_27852(class_2246.field_10171);
      } else {
         return false;
      }
   }

   public liIlIllliiIlIlll(illlllllIillllll host) {
      this.IlIilIIill = iIilIlilIlilIlil.lllilIiIil;
      this.liIilIIill = -1;
      this.iiIilIIill = -1;
      this.IIlilIIill = -1;
      this.iililIIill = Long.MIN_VALUE;
      this.iIiilIIill = Long.MIN_VALUE;
      this.IliilIIill = Long.MIN_VALUE;
      this.lIIilIIill = host;
      this.iIIilIIill = new IlIIiIIillIIiIIi(host, 2, true);
   }

   // $FF: synthetic method
   private static CallSite IiIilliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(~((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 'ꘂ') - '藕') ^ 6170) - var5) ^ 'ꓟ') ^ 12039) + 18495) << 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + 'ꘂ') - '藕') ^ 6170) - var5) ^ 'ꓟ') ^ 12039) + 18495) >>> 6))) - '萢') - var5))) ^ 'ﳫ'))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IiIlliIliiIl() {
      return this.IlIilIIill == iIilIlilIlilIlil.illilIiIil && this.iIIilIIill.lIiiIiIlilli();
   }

   private boolean lliIliliIl(class_746 player) {
      long var4 = -7155992393190338469L;
      var4 ^= ((long)(player.method_31548().method_5438(this.IIlilIIill).method_31574(class_1802.field_8288) && !IIIIilIilIIIilIi.iiiIlIIIll(this.IIlilIIill) ? 1 : 0) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)(player.method_6079().method_31574(class_1802.field_8288) && !IIIIilIilIIIilIi.iiiIlIIIll(40) ? 1 : 0) ^ var4) & -1L >>> 32;
      return (int)(var4 >>> 32) != 0 || (int)var4 != 0;
   }

   public boolean IlIlllIlilIl() {
      return this.IlIilIIill == iIilIlilIlilIlil.illilIiIil && this.iIIilIIill.iliIiiliiiii();
   }

   // $FF: synthetic method
   private static CallSite liilliiill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ 4906) + var5) - var5) - var5))) ^ var5) + var5) ^ 'ꘛ') + var5) ^ 'ﾡ') - var5) - var5))))) - 14856) + '웬') << 15 | (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ 4906) + var5) - var5) - var5))) ^ var5) + var5) ^ 'ꘛ') + var5) ^ 'ﾡ') - var5) - var5))))) - 14856) + '웬') >>> 1));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void IiIIlliIIl() {
      this.lililIIill = true;
      this.iililIIill = this.lIIilIIill.IIillIiliIil();
   }

   private static boolean lIIlliIIll(class_746 player, int item, class_1792 slot) {
      return Iillllilll(item) && player.method_31548().method_5438(item).method_31574(slot);
   }

   private static int iilllIIill() {
      return Math.round((float)illIllilIilIllil.IiIlliIliiIl() / 50.0F);
   }

   private static int[] IlIllllIll(class_746 player, class_1792 item) {
      long var5 = -45151889138647625L;
      int[] var2 = new int[9];

      for(long var7 = var5 ^ (0L ^ var5) & -1L << 32; (int)(var7 >>> 32) < 9; var7 += 4294967296L) {
         class_1799 var4 = player.method_31548().method_5438((int)(var7 >>> 32));
         var2[(int)(var7 >>> 32)] = var4.method_31574(item) ? var4.method_7947() : 0;
      }

      return var2;
   }

   private lilIillliilIilll Iiiiliiiiiii() {
      this.IiIilIIill = null;
      this.Iliilliiilii(this.IIiilIiiiIii(iIilIlilIlilIlil.IililIiIil));
      return lilIillliilIilll.iiiIlIlill;
   }

   private lilIillliilIilll Illillliilli(class_746 player) {
      long var3 = -6435675727117075923L;
      var3 ^= ((long)lliiIliliiIl.IilliliilIIi(this.ilIilIIill) << 32 ^ var3) & -1L << 32;
      if ((int)(var3 >>> 32) < 0) {
         return this.IIIIllIIIl(ilillIiill<invokedynamic>());
      } else if ((int)(var3 >>> 32) == 0) {
         return this.IIIIllIIIl(ilillIiill<invokedynamic>());
      } else if (this.iIlilIIill) {
         if (this.lIIilIIill.IIillIiliIil() > this.lllilIIill) {
            this.iIiilIIill = this.lIIilIIill.IIillIiliIil();
         }

         this.Iliilliiilii(iIilIlilIlilIlil.IIiilIiIil);
         return lilIillliilIilll.iiiIlIlill;
      } else if (this.lIIilIIill.IIillIiliIil() - this.lllilIIill >= 10L) {
         return this.IIIIllIIIl(ilillIiill<invokedynamic>());
      } else {
         this.lIIilIIill.IlIlllIlilIl(this.IIlilIIill);
         this.IiiIlliiIl(player, true);
         return lilIillliilIilll.iiiIlIlill;
      }
   }

   public void Illlllllilll(int slot) {
      if (Iillllilll(slot) && slot != this.IIlilIIill) {
         this.IIlilIIill = slot;
         if (this.IlIilIIill == iIilIlilIlilIlil.IIiilIiIil && this.IililIIill && !this.iiIIlIIlIl()) {
            this.iIIilIIill.IiIlliIliiIl();
            this.IililIIill = false;
         }

      }
   }

   private lilIillliilIilll Iilililiiili(class_746 player) {
      long var6 = 2649121076601408460L;
      var6 ^= ((long)lliiIliliiIl.IilliliilIIi(this.ilIilIIill) << 32 ^ var6) & -1L << 32;
      if ((int)(var6 >>> 32) < 0) {
         return this.lililIIill ? this.iIIIlIlIIl() : this.IIIIllIIIl(ilillIiill<invokedynamic>());
      } else {
         if (!this.iiIIlIIlIl()) {
            if ((int)(var6 >>> 32) == 0) {
               return this.IIIIllIIIl(ilillIiill<invokedynamic>());
            }

            if (player.method_6079().method_31574(class_1802.field_8801)) {
               return this.IIIIllIIIl(ilillIiill<invokedynamic>());
            }

            if (!lliiIliliiIl.IlIillIiilIi(player.method_31548().method_5438(this.IIlilIIill))) {
               return this.IIIIllIIIl(ilillIiill<invokedynamic>());
            }

            if (this.lIlIliIlIl()) {
               return this.IIIIllIIIl(ilillIiill<invokedynamic>());
            }

            if (this.lIIilIIill.IiIlliIliiIl()) {
               this.lIIilIIill.IlIlllIlilIl(this.IIlilIIill);
               this.IiiIlliiIl(player, true);
               return lilIillliilIilll.iiiIlIlill;
            }

            float var3 = this.IllIllllIl(player);
            float var4 = this.illIlIilIl(var3);
            var6 ^= ((long)(!this.llIilIIill.IiIlliIliiIl() && !(var3 >= player.method_6032() + player.method_6067() - 1.0F) ? 0 : 1) ^ var6) & -1L >>> 32;
            if ((int)var6 != 0 && !this.lliIliliIl(player)) {
               if (++this.IIiilIIill > 10) {
                  return this.IIIIllIIIl(ilillIiill<invokedynamic>());
               }

               this.lIIilIIill.IlIlllIlilIl(this.IIlilIIill);
               this.IiiIlliiIl(player, true);
               return lilIillliilIilll.iiiIlIlill;
            }

            if (!this.lIIilIIill.IIlllIlliIll(var3, var4, this.llIilIIill.IIlllIlliIll() && iIlllIllll(this.iIiilIIill, this.IliilIIill)) && !this.IllilIIill) {
               return this.IIIIllIIIl(ilillIiill<invokedynamic>());
            }
         }

         if (!this.IililIIill) {
            if (!this.iIIilIIill.liiiIIllIl(this.ilIilIIill, this.IIlilIIill, liIlIllliiIlIlll::Ilillllill, this.illilIIill)) {
               return this.IIIIllIIIl(ilillIiill<invokedynamic>());
            }

            this.IililIIill = true;
         }

         lilIillliilIilll var8 = this.iIIilIIill.iIlIlllllill();
         if (var8 == lilIillliilIilll.IIIllIlill) {
            this.IiIIlliIIl();
         }

         if (var8 == lilIillliilIilll.lIIllIlill) {
            return this.iIIIlIlIIl();
         } else {
            return var8 == lilIillliilIilll.iIIllIlill ? this.IIIIllIIIl(this.llIIlilIIl(ilillIiill<invokedynamic>())) : var8;
         }
      }
   }

   public Iiilllliilll iIlIlllllill() {
      return this.llIilIIill;
   }

   public boolean liiiIIllIl(Iiilllliilll fresh) {
      if (this.IlIilIIill == iIilIlilIlilIlil.iililIiIil && fresh != null && this.ilIilIIill != null && this.ilIilIIill.equals(fresh.liiiIIllIl())) {
         this.llIilIIill = fresh;
         this.IliilIIill = this.lIIilIIill.IIillIiliIil();
         return true;
      } else {
         return false;
      }
   }

   private lilIillliilIilll IlIillIiilIi(class_746 player) {
      if (lliiIliliiIl.IilliliilIIi(this.ilIilIIill) >= 0) {
         this.Iliilliiilii(this.IIiilIiiiIii(iIilIlilIlilIlil.illilIiIil));
         return lilIillliilIilll.iiiIlIlill;
      } else if (this.lIlIliIlIl()) {
         return this.IIIIllIIIl(ilillIiill<invokedynamic>());
      } else if (!this.lililIIill && this.lIIilIIill.IIillIiliIil() - this.lllilIIill > (long)(8 + iliIiillIiiIiill.IlIillIiilIi(this.llIilIIill.Ililllililil()))) {
         return this.IIIIllIIIl(ilillIiill<invokedynamic>());
      } else {
         if (!this.IililIIill) {
            if (!lIIlliIIll(player, this.liIilIIill, class_1802.field_23141)) {
               return this.IIIIllIIIl(ilillIiill<invokedynamic>());
            }

            if (!this.iIIilIIill.IliIlllilIi(this.ilIilIIill, this.liIilIIill, class_2246.field_23152.method_9564(), (class_2338)null, this.illilIIill)) {
               return this.IIIIllIIIl(ilillIiill<invokedynamic>());
            }

            this.IililIIill = true;
         }

         lilIillliilIilll var2 = this.iIIilIIill.iIlIlllllill();
         if (var2 == lilIillliilIilll.IIIllIlill) {
            this.IiIIlliIIl();
         }

         if (var2 == lilIillliilIilll.lIIllIlill) {
            this.Iliilliiilii(this.IIiilIiiiIii(iIilIlilIlilIlil.illilIiIil));
            return lilIillliilIilll.iiiIlIlill;
         } else {
            return var2 == lilIillliilIilll.iIIllIlill ? this.IIIIllIIIl(this.llIIlilIIl(ilillIiill<invokedynamic>())) : var2;
         }
      }
   }

   private static boolean lIilliIill(class_2680 s) {
      return s.method_27852(class_2246.field_23152) && (Integer)s.method_11654(class_4969.field_23153) > 0;
   }

   static boolean iIlllIllll(long armedExit, long killTick) {
      return armedExit == Long.MIN_VALUE || killTick >= armedExit;
   }

   private float IllIllllIl(class_746 player) {
      float var2 = IiliiIililiiIi.liiiIIllIl(this.ilIilIIill, (class_2338)null, (iIIlIIiIlIlIIi)null);
      return iiIiiliIIliili.lIiiIiIlilli(var2, lllIliIlillIliIl.iiiIlIIIll(player));
   }

   private boolean lIlIliIlIl() {
      return this.lIIilIIill.IIillIiliIil() - this.lllilIIill > 20L + 2L * (long)this.illilIIill;
   }

   private lilIillliilIilll iIIIlIlIIl() {
      this.iIIilIIill.IiIlliIliiIl();
      this.IlIilIIill = iIilIlilIlilIlil.lIiilIiIil;
      this.IiiilIIill = null;
      this.IililIIill = false;
      return lilIillliilIilll.lIIllIlill;
   }

   public class_2338 Ililllililil() {
      return this.ilIilIIill;
   }

   public lilIillliilIilll IilliliilIIi() {
      long var6 = 5062008240477647218L;
      if (!this.Iilllilliill()) {
         return lilIillliilIilll.IiiIlIlill;
      } else {
         class_310 var1 = class_310.method_1551();
         class_746 var2 = var1.field_1724;
         if (var2 != null && var1.field_1687 != null) {
            if (!lliiIliliiIl.iIlIlllllill()) {
               return this.IIIIllIIIl(ilillIiill<invokedynamic>());
            } else {
               lilIillliilIilll var3 = lilIillliilIilll.iiiIlIlill;

               for(var6 ^= (0L ^ var6) & -1L << 32; (int)(var6 >>> 32) < iIilIlilIlilIlil.values().length; var6 += 4294967296L) {
                  var6 ^= ((long)this.lIiilIIill ^ var6) & -1L >>> 32;
                  lilIillliilIilll var10000;
                  switch (this.IlIilIIill.ordinal()) {
                     case 1 -> var10000 = this.IlIillIiilIi(var2);
                     case 2 -> var10000 = this.IiIiliIiiiIi(var2);
                     case 3 -> var10000 = this.IIlilIliiIli(var2);
                     case 4 -> var10000 = this.Illillliilli(var2);
                     case 5 -> var10000 = this.Iilililiiili(var2);
                     default -> var10000 = lilIillliilIilll.IiiIlIlill;
                  }

                  var3 = var10000;
                  if (this.IlIilIIill == iIilIlilIlilIlil.lIiilIiIil) {
                     return lilIillliilIilll.lIIllIlill;
                  }

                  if (this.IlIilIIill == iIilIlilIlilIlil.iIiilIiIil) {
                     return lilIillliilIilll.iIIllIlill;
                  }

                  if (this.lIiilIIill == (int)var6 || var3 == lilIillliilIilll.IIIllIlill) {
                     return var3;
                  }
               }

               return var3;
            }
         } else {
            return this.IIIIllIIIl(ilillIiill<invokedynamic>());
         }
      }
   }

   private void IiiIlliiIl(class_746 player, boolean settle) {
      class_243 var3 = player.method_33571();
      double var4 = this.lIIilIIill.Iilllilliill();
      if (this.lliilIIill == null || !this.iiiIlIIIll(this.lliilIIill, this.iliilIIill, var3, var4)) {
         this.lliilIIill = null;
         this.iliilIIill = null;
         float[] var6 = ilIiiIiIii.Ililllililil(var3, class_243.method_24953(this.ilIilIIill));
         class_3965 var7 = IiIiiiilliIiiiil.iIlIlllllill(this.ilIilIIill, var4, var6[0], var6[1]);
         if (var7 != null) {
            this.iliilIIill = var7.method_17780();
            class_243 var8 = lllIliIlillIliIl.illilIilil(this.ilIilIIill, this.iliilIIill);
            this.lliilIIill = this.iiiIlIIIll(var8, this.iliilIIill, var3, var4) ? var8 : var7.method_17784();
         }
      }

      this.lIIilIIill.lIiiIiIlilli(this.lliilIIill != null ? this.lliilIIill : class_243.method_24953(this.ilIilIIill), settle);
   }

   public iIilIlilIlilIlil IIillIiliIil() {
      return this.IlIilIIill;
   }

   public boolean Iilllilliill() {
      return this.IlIilIIill == iIilIlilIlilIlil.illilIiIil || this.IlIilIIill == iIilIlilIlilIlil.IililIiIil || this.IlIilIIill == iIilIlilIlilIlil.lililIiIil || this.IlIilIIill == iIilIlilIlilIlil.iililIiIil || this.IlIilIIill == iIilIlilIlilIlil.IIiilIiIil;
   }

   public boolean IliIlllilIi(Iiilllliilll glowSlot, int plan, int detonateSlot, int anchorSlot, boolean holdDetonate) {
      long var9 = -5678277655350170716L;
      if (!this.Iilllilliill() && glowSlot != null && glowSlot.liiiIIllIl() != null) {
         class_310 var6 = class_310.method_1551();
         if (var6.field_1724 != null && var6.field_1687 != null && lliiIliliiIl.iIlIlllllill()) {
            if (!Iillllilll(anchorSlot)) {
               return false;
            } else {
               class_2338 var7 = glowSlot.liiiIIllIl().method_10062();
               var9 ^= ((long)lliiIliliiIl.IilliliilIIi(var7) << 32 ^ var9) & -1L << 32;
               if ((int)(var9 >>> 32) >= 0 || lIIlliIIll(var6.field_1724, plan, class_1802.field_23141) && lliiIliliiIl.lIiiIiIlilli(var7)) {
                  if ((int)(var9 >>> 32) <= 0 && !lIIlliIIll(var6.field_1724, detonateSlot, class_1802.field_8801)) {
                     return false;
                  } else {
                     this.iIIilIIill.IiIlliIliiIl();
                     this.llIilIIill = glowSlot;
                     this.ilIilIIill = var7;
                     this.IiIilIIill = glowSlot.iIlIlllllill() != null && lIIlliIIll(var6.field_1724, detonateSlot, class_1802.field_8801) ? glowSlot.iIlIlllllill().method_10062() : null;
                     this.liIilIIill = plan;
                     this.iiIilIIill = detonateSlot;
                     this.IIlilIIill = anchorSlot;
                     this.lIlilIIill = holdDetonate;
                     this.iIlilIIill = false;
                     this.IllilIIill = false;
                     this.lliilIIill = null;
                     this.iliilIIill = null;
                     this.IiiilIIill = null;
                     this.iIiilIIill = Long.MIN_VALUE;
                     this.IliilIIill = this.lIIilIIill.IIillIiliIil();
                     this.Iliilliiilii(this.IIiilIiiiIii(iIilIlilIlilIlil.lllilIiIil));
                     return true;
                  }
               } else {
                  return false;
               }
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite iIIilIlIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) >>> 1 | (char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) << 15) - var5))) << 6 | (char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) >>> 1 | (char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) << 15) - var5))) >>> 10) << 9 | (char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) >>> 1 | (char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) << 15) - var5))) << 6 | (char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) >>> 1 | (char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) << 15) - var5))) >>> 10) >>> 7) + var5))))) ^ var5) + var5) + 26105) << 5 | (char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) >>> 1 | (char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) << 15) - var5))) << 6 | (char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) >>> 1 | (char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) << 15) - var5))) >>> 10) << 9 | (char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) >>> 1 | (char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) << 15) - var5))) << 6 | (char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) >>> 1 | (char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) << 15) - var5))) >>> 10) >>> 7) + var5))))) ^ var5) + var5) + 26105) >>> 11) >>> 5 | (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) >>> 1 | (char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) << 15) - var5))) << 6 | (char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) >>> 1 | (char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) << 15) - var5))) >>> 10) << 9 | (char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) >>> 1 | (char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) << 15) - var5))) << 6 | (char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) >>> 1 | (char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) << 15) - var5))) >>> 10) >>> 7) + var5))))) ^ var5) + var5) + 26105) << 5 | (char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) >>> 1 | (char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) << 15) - var5))) << 6 | (char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) >>> 1 | (char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) << 15) - var5))) >>> 10) << 9 | (char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) >>> 1 | (char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) << 15) - var5))) << 6 | (char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) >>> 1 | (char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) << 8 | (char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) >>> 8) + var5))) << 15) - var5))) >>> 10) >>> 7) + var5))))) ^ var5) + var5) + 26105) >>> 11) << 11) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private String llIIlilIIl(String what) {
      String var2 = this.iIIilIIill.IIlllIlliIll();
      return var2 == null ? what + ilillIiill<invokedynamic>() : what + ilillIiill<invokedynamic>() + var2;
   }

   // $FF: synthetic method
   private static CallSite llIililIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(~((char)((char)((char)(var4[var5] - '\ue040') ^ var5) >>> 13 | (char)((char)(var4[var5] - '\ue040') ^ var5) << 3))) >>> 9 | (char)(~((char)((char)((char)(var4[var5] - '\ue040') ^ var5) >>> 13 | (char)((char)(var4[var5] - '\ue040') ^ var5) << 3))) << 7))) ^ 6840) - 4333))) - '룹') + var5) << 3 | (char)((char)((char)(-((char)((char)((char)(-((char)((char)(~((char)((char)((char)(var4[var5] - '\ue040') ^ var5) >>> 13 | (char)((char)(var4[var5] - '\ue040') ^ var5) << 3))) >>> 9 | (char)(~((char)((char)((char)(var4[var5] - '\ue040') ^ var5) >>> 13 | (char)((char)(var4[var5] - '\ue040') ^ var5) << 3))) << 7))) ^ 6840) - 4333))) - '룹') + var5) >>> 13) ^ 15927))))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean iiiIlIIIll(class_243 point, class_2350 side, class_243 reach, double eye) {
      if (reach.method_1025(point) > eye * eye) {
         return false;
      } else {
         float[] var6 = ilIiiIiIii.Ililllililil(reach, point);
         return IiIiiiilliIiiiil.IliIlllilIi(this.ilIilIIill, side, eye, var6[0], var6[1]) != null;
      }
   }

   private static boolean Iillllilll(int slot) {
      return slot >= 0 && slot <= 8;
   }

   private lilIillliilIilll IIIIllIIIl(String reason) {
      this.iIIilIIill.IiIlliIliiIl();
      this.IlIilIIill = iIilIlilIlilIlil.iIiilIiIil;
      this.IiiilIIill = reason;
      this.IililIIill = false;
      return lilIillliilIilll.iIIllIlill;
   }

   private boolean IIiIllIiIl(class_746 player) {
      long var4 = -6436253298482568788L;
      float var2 = this.IllIllllIl(player);
      var4 ^= ((long)(!this.llIilIIill.IiIlliIliiIl() && !(var2 >= player.method_6032() + player.method_6067() - 1.0F) ? 0 : 1) << 32 ^ var4) & -1L << 32;
      return (int)(var4 >>> 32) != 0 && !this.iIiIlIliIl(player) ? false : this.lIIilIIill.IIlllIlliIll(var2, this.illIlIilIl(var2), this.llIilIIill.IIlllIlliIll());
   }

   private float illIlIilIl(float full) {
      float var2 = this.llIilIIill.IlIlllIlilIl();
      return !(var2 <= 0.001F) && !(full > var2 + 0.5F) ? Math.min(full, this.llIilIIill.IIIllIIliIIl() * full / var2) : full;
   }

   private iIilIlilIlilIlil IIiilIiiiIii(iIilIlilIlilIlil p) {
      iIilIlilIlilIlil var10000;
      switch (p.ordinal()) {
         case 0 -> var10000 = lliiIliliiIl.IilliliilIIi(this.ilIilIIill) < 0 ? iIilIlilIlilIlil.illilIiIil : this.IIiilIiiiIii(iIilIlilIlilIlil.illilIiIil);
         case 1 -> var10000 = this.IiIilIIill != null && lliiIliliiIl.lIiiIiIlilli(this.IiIilIIill) ? iIilIlilIlilIlil.IililIiIil : this.IIiilIiiiIii(iIilIlilIlilIlil.IililIiIil);
         case 2 -> var10000 = lliiIliliiIl.IilliliilIIi(this.ilIilIIill) > 0 ? this.IIiilIiiiIii(iIilIlilIlilIlil.lililIiIil) : iIilIlilIlilIlil.lililIiIil;
         case 3 -> var10000 = this.lIlilIIill && !this.iIlilIIill ? iIilIlilIlilIlil.iililIiIil : iIilIlilIlilIlil.IIiilIiIil;
         case 4 -> var10000 = iIilIlilIlilIlil.IIiilIiIil;
         default -> var10000 = iIilIlilIlilIlil.lIiilIiIil;
      }

      return var10000;
   }

   private void Iliilliiilii(iIilIlilIlilIlil next) {
      this.iIIilIIill.IiIlliIliiIl();
      this.IlIilIIill = next;
      this.lllilIIill = this.lIIilIIill.IIillIiliIil();
      this.illilIIill = (next == iIilIlilIlilIlil.IIiilIiIil ? 10 : 4) + iilllIIill();
      this.IililIIill = false;
      this.lililIIill = false;
      this.iililIIill = Long.MIN_VALUE;
      this.IIiilIIill = 0;
      ++this.lIiilIIill;
   }

   public int IIIllIIliIIl() {
      return this.Iilllilliill() ? this.iIIilIIill.IlIlllIlilIl() : Integer.MAX_VALUE;
   }

   public boolean IIlllIlliIll() {
      return this.IlIilIIill == iIilIlilIlilIlil.illilIiIil && this.iIIilIIill.IIIllIIliIIl();
   }

   private lilIillliilIilll IIlilIliiIli(class_746 player) {
      long var4 = 8694781272874024790L;
      var4 ^= ((long)lliiIliliiIl.IilliliilIIi(this.ilIilIIill) << 32 ^ var4) & -1L << 32;
      if ((int)(var4 >>> 32) < 0) {
         return this.IIIIllIIIl(ilillIiill<invokedynamic>());
      } else if ((int)(var4 >>> 32) > 0) {
         this.Iliilliiilii(this.IIiilIiiiIii(iIilIlilIlilIlil.lililIiIil));
         return lilIillliilIilll.iiiIlIlill;
      } else if (this.lIlIliIlIl()) {
         return this.IIIIllIIIl(ilillIiill<invokedynamic>());
      } else {
         if (!this.iiIIlIIlIl()) {
            if (!lIIlliIIll(player, this.iiIilIIill, class_1802.field_8801)) {
               var4 ^= ((long)liIlliiIll(this.iiIilIIill, IlIllllIll(player, class_1802.field_8801), ilIllIiIll()) ^ var4) & -1L >>> 32;
               if ((int)var4 < 0) {
                  return this.IIIIllIIIl(ilillIiill<invokedynamic>());
               }

               this.iiIilIIill = (int)var4;
               this.iIIilIIill.IiIlliIliiIl();
               this.IililIIill = false;
            }

            if (this.lIIilIIill.IiIlliIliiIl()) {
               this.IiiIlliiIl(player, false);
               return lilIillliilIilll.iiiIlIlill;
            }
         }

         if (!this.IililIIill) {
            if (this.lilIliilIl() && !this.IIiIllIiIl(player)) {
               return this.IIIIllIIIl(ilillIiill<invokedynamic>());
            }

            if (!this.IllilIIill && !this.IIiIllIiIl(player)) {
               return this.IIIIllIIIl(ilillIiill<invokedynamic>());
            }

            if ((this.llIilIIill.IiIlliIliiIl() || this.IllIllllIl(player) >= player.method_6032() + player.method_6067() - 1.0F) && !this.lliIliliIl(player)) {
               if (++this.IIiilIIill > 10) {
                  return this.IIIIllIIIl(ilillIiill<invokedynamic>());
               }

               this.IiiIlliiIl(player, false);
               return lilIillliilIilll.iiiIlIlill;
            }

            if (!this.iIIilIIill.liiiIIllIl(this.ilIilIIill, this.iiIilIIill, liIlIllliiIlIlll::lIilliIill, this.illilIIill)) {
               return this.IIIIllIIIl(ilillIiill<invokedynamic>());
            }

            this.IililIIill = true;
         }

         lilIillliilIilll var3 = this.iIIilIIill.iIlIlllllill();
         if (var3 == lilIillliilIilll.IIIllIlill) {
            this.IiIIlliIIl();
         }

         if (var3 == lilIillliilIilll.lIIllIlill) {
            this.Iliilliiilii(this.IIiilIiiiIii(iIilIlilIlilIlil.lililIiIil));
            return lilIillliilIilll.iiiIlIlill;
         } else {
            return var3 == lilIillliilIilll.iIIllIlill ? this.IIIIllIIIl(this.llIIlilIIl(ilillIiill<invokedynamic>())) : var3;
         }
      }
   }
}
