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
import net.minecraft.class_310;
import net.minecraft.class_746;

public final class illillIlIilillIl {
   private String IIilIlliIl;
   private int iillIlliIl;
   private static final long liIlIlliIl = 100L;
   private static final float IiIlIlliIl = 1.0E-4F;
   private final iilllIiIIillIi lIllIlliIl;
   private long IillIlliIl;
   private boolean illlIlliIl;
   private static final String ilIlIlliIl = "-";
   private IiIIilllliIIilll IlllIlliIl;
   public static final int iiIlIlliIl = 10;
   private boolean llllIlliIl;
   private long lillIlliIl;
   private final IlIIiiIillIIiiIi iIllIlliIl = this::Ililllililil;
   private final IIllllIlll IIllIlliIl;

   public String IIillIiliIil() {
      return this.IIilIlliIl;
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') >>> 12 | (char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') << 4) + '\uf409') << 12 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') >>> 12 | (char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') << 4) + '\uf409') >>> 4) >>> 10 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') >>> 12 | (char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') << 4) + '\uf409') << 12 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') >>> 12 | (char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') << 4) + '\uf409') >>> 4) << 6) >>> 5 | (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') >>> 12 | (char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') << 4) + '\uf409') << 12 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') >>> 12 | (char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') << 4) + '\uf409') >>> 4) >>> 10 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') >>> 12 | (char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') << 4) + '\uf409') << 12 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') >>> 12 | (char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') << 4) + '\uf409') >>> 4) << 6) << 11) - 29719) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') >>> 12 | (char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') << 4) + '\uf409') << 12 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') >>> 12 | (char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') << 4) + '\uf409') >>> 4) >>> 10 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') >>> 12 | (char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') << 4) + '\uf409') << 12 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') >>> 12 | (char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') << 4) + '\uf409') >>> 4) << 6) >>> 5 | (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') >>> 12 | (char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') << 4) + '\uf409') << 12 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') >>> 12 | (char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') << 4) + '\uf409') >>> 4) >>> 10 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') >>> 12 | (char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') << 4) + '\uf409') << 12 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') >>> 12 | (char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) >>> 6 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 32172) ^ 8639))) << 10) ^ var5))) - '섴'))) - 'ﯿ') << 4) + '\uf409') >>> 4) << 6) << 11) - 29719) >>> 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private String IIIilIIiiIIi() {
      if (this.IlllIlliIl != IiIIilllliIIilll.iilIIIlill) {
         return IiIiliIiiiIi<invokedynamic>();
      } else if (this.lillIlliIl >= this.IillIlliIl) {
         return IiIiliIiiiIi<invokedynamic>();
      } else {
         class_310 var1 = class_310.method_1551();
         class_746 var2 = var1.field_1724;
         if (var2 != null && var1.field_1761 != null) {
            if (!this.IIllIlliIl.Illillliilli()) {
               return IiIiliIiiiIi<invokedynamic>();
            } else if (IIllIIlilIllIIli.IliIlllilIi()) {
               return IiIiliIiiiIi<invokedynamic>();
            } else if (IIIIilIilIIIilIi.lIIlliIIll()) {
               return IiIiliIiiiIi<invokedynamic>();
            } else if (var2.method_6115()) {
               return IiIiliIiiiIi<invokedynamic>();
            } else if (var1.field_1755 != null) {
               return IiIiliIiiiIi<invokedynamic>();
            } else if (var1.method_18506() != null) {
               return IiIiliIiiiIi<invokedynamic>();
            } else if (var1.field_1761.method_2923()) {
               return IiIiliIiiiIi<invokedynamic>();
            } else if (iiIliillIIlliill.liiiIIllIl()) {
               return IiIiliIiiiIi<invokedynamic>();
            } else if ((!lIlIiIliIlIiIl.Illlllllilll() || lIlIiIliIlIiIl.IIIilIIiiIIi() < 3) && !lIlIiIliIlIiIl.IIillIiliIil()) {
               if (var2.method_31548().method_67532() != this.IIllIlliIl.Iiiiliiiiiii()) {
                  return IiIiliIiiiIi<invokedynamic>();
               } else {
                  return this.IIllIlliIl.IIiilIiiiIii() ? IiIiliIiiiIi<invokedynamic>() : null;
               }
            } else {
               return IiIiliIiiiIi<invokedynamic>();
            }
         } else {
            return IiIiliIiiiIi<invokedynamic>();
         }
      }
   }

   public void IilliliilIIi(boolean on) {
      this.illlIlliIl = on;
   }

   public boolean IlIlllIlilIl(int slot) {
      class_746 var2 = class_310.method_1551().field_1724;
      if (var2 == null) {
         return false;
      } else {
         return var2.method_31548().method_67532() == slot && this.IIllIlliIl.Iiiiliiiiiii() == slot && !this.IIllIlliIl.IIiilIiiiIii();
      }
   }

   public void Iilllilliill(int ticks) {
      if (ticks > 0) {
         long var2 = IIllIIlilIllIIli.IlIlllIlilIl() + (long)ticks;
         if (var2 > this.lillIlliIl) {
            this.lillIlliIl = var2;
         }

      }
   }

   public boolean IiIlliIliiIl() {
      class_746 var1 = class_310.method_1551().field_1724;
      if (var1 != null && this.IIllIlliIl.iIIIlIlIIl()) {
         return Math.abs(var1.method_36454() - this.IIllIlliIl.llIIlilIIl()) < 1.0E-4F && Math.abs(var1.method_36455() - this.IIllIlliIl.IiIIlliIIl()) < 1.0E-4F && IIIiillllIIiilll.IliIlllilIi() - IIIiillllIIiilll.iIlIlllllill() > 100L;
      } else {
         return false;
      }
   }

   private String IlIillIiilIi() {
      if (this.IlllIlliIl != IiIIilllliIIilll.iilIIIlill) {
         return IiIiliIiiiIi<invokedynamic>();
      } else {
         class_310 var1 = class_310.method_1551();
         class_746 var2 = var1.field_1724;
         if (var2 == null) {
            return IiIiliIiiiIi<invokedynamic>();
         } else if (!this.IIllIlliIl.Iliilliiilii()) {
            return IiIiliIiiiIi<invokedynamic>();
         } else if (IIIIilIilIIIilIi.lIIlliIIll()) {
            return IiIiliIiiiIi<invokedynamic>();
         } else if (var2.method_6115()) {
            return IiIiliIiiiIi<invokedynamic>();
         } else if (var1.field_1755 != null) {
            return IiIiliIiiiIi<invokedynamic>();
         } else if (var1.method_18506() != null) {
            return IiIiliIiiiIi<invokedynamic>();
         } else {
            return IilIIililIIi.IilliliilIIi() ? IiIiliIiiiIi<invokedynamic>() : null;
         }
      }
   }

   public boolean lIiiIiIlilli() {
      String var1 = this.IIIilIIiiIIi();
      if (var1 == null && !this.lIllIlliIl.iliIiiliiiii()) {
         var1 = IiIiliIiiiIi<invokedynamic>();
      }

      if (var1 == null && this.llllIlliIl) {
         var1 = IiIiliIiiiIi<invokedynamic>();
      }

      if (var1 == null && this.illlIlliIl) {
         var1 = IiIiliIiiiIi<invokedynamic>();
      }

      return this.Iiilliiliiil(var1);
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6892179658058677555L ^ Long.rotateLeft(4905689796627290331L, 5) ^ 1450386075200333848L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 666953222002115079L ^ Long.rotateLeft(-1383487033870925849L, 13) ^ -8226866955723198723L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -3268251667741402864L ^ Long.rotateLeft(3802816852268556536L, 45) ^ -5736325461997790468L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -2734298533223162227L ^ Long.rotateLeft(3228732132773050997L, 48) ^ 2710276776641088530L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 9053254270238425754L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 3091520069795906910L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -9120683457136576651L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4434043873587826201L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -4627802578896201545L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 224804767330510326L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIlilIliiIli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Illillliilli<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iilililiiili<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IIiilIiiiIii<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iliilliiilii<invokedynamic>());
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
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(~((char)(~((char)((char)((char)(~((char)((char)((char)((char)(~((char)(-((char)(var4[var5] - 20960))))) << 5 | (char)(~((char)(-((char)(var4[var5] - 20960))))) >>> 11) >>> 6 | (char)((char)(~((char)(-((char)(var4[var5] - 20960))))) << 5 | (char)(~((char)(-((char)(var4[var5] - 20960))))) >>> 11) << 10) - var5))) << 11 | (char)(~((char)((char)((char)((char)(~((char)(-((char)(var4[var5] - 20960))))) << 5 | (char)(~((char)(-((char)(var4[var5] - 20960))))) >>> 11) >>> 6 | (char)((char)(~((char)(-((char)(var4[var5] - 20960))))) << 5 | (char)(~((char)(-((char)(var4[var5] - 20960))))) >>> 11) << 10) - var5))) >>> 5) ^ '뛸'))))))) ^ var5) ^ var5) << 5 | (char)((char)((char)(~((char)(~((char)(~((char)((char)((char)(~((char)((char)((char)((char)(~((char)(-((char)(var4[var5] - 20960))))) << 5 | (char)(~((char)(-((char)(var4[var5] - 20960))))) >>> 11) >>> 6 | (char)((char)(~((char)(-((char)(var4[var5] - 20960))))) << 5 | (char)(~((char)(-((char)(var4[var5] - 20960))))) >>> 11) << 10) - var5))) << 11 | (char)(~((char)((char)((char)((char)(~((char)(-((char)(var4[var5] - 20960))))) << 5 | (char)(~((char)(-((char)(var4[var5] - 20960))))) >>> 11) >>> 6 | (char)((char)(~((char)(-((char)(var4[var5] - 20960))))) << 5 | (char)(~((char)(-((char)(var4[var5] - 20960))))) >>> 11) << 10) - var5))) >>> 5) ^ '뛸'))))))) ^ var5) ^ var5) >>> 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IliIlllilIi(IiIIilllliIIilll lookUnconfirmed, boolean level) {
      this.IlllIlliIl = lookUnconfirmed == null ? IiIIilllliIIilll.lIiIIIlill : lookUnconfirmed;
      this.llllIlliIl = level;
      this.illlIlliIl = false;
      this.IillIlliIl = IIllIIlilIllIIli.IlIlllIlilIl();
      this.iillIlliIl = 0;
      this.IIilIlliIl = IiIiliIiiiIi<invokedynamic>();
   }

   public illillIlIilillIl(IIllllIlll aim, iilllIiIIillIi ledger) {
      this.IlllIlliIl = IiIIilllliIIilll.lIiIIIlill;
      this.lillIlliIl = Long.MIN_VALUE;
      this.IIilIlliIl = IiIiliIiiiIi<invokedynamic>();
      this.IIllIlliIl = aim;
      this.lIllIlliIl = ledger;
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)(~var4[var5]) + var5))) + 6403) - var5) << 15 | (char)((char)((char)(~((char)((char)(~var4[var5]) + var5))) + 6403) - var5) >>> 1))) ^ var5) - var5) ^ 22115) + var5) >>> 13 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)(~var4[var5]) + var5))) + 6403) - var5) << 15 | (char)((char)((char)(~((char)((char)(~var4[var5]) + var5))) + 6403) - var5) >>> 1))) ^ var5) - var5) ^ 22115) + var5) << 3))) ^ '\ueffd') + '鸤') << 1 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)(~var4[var5]) + var5))) + 6403) - var5) << 15 | (char)((char)((char)(~((char)((char)(~var4[var5]) + var5))) + 6403) - var5) >>> 1))) ^ var5) - var5) ^ 22115) + var5) >>> 13 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)(~var4[var5]) + var5))) + 6403) - var5) << 15 | (char)((char)((char)(~((char)((char)(~var4[var5]) + var5))) + 6403) - var5) >>> 1))) ^ var5) - var5) ^ 22115) + var5) << 3))) ^ '\ueffd') + '鸤') >>> 15) ^ var5) - var5) ^ '鵴'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) + var5) + var5) ^ '龢'))) ^ 16800) ^ var5) + 23306))) + var5))) + var5) + '\ue1b7') ^ var5) ^ var5) - '뇠') - '딋') + 14985));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean iliIiiliiiii(int age, long eta, int pingTicks) {
      long var4 = (long)age - Math.max(0L, eta);
      return var4 <= (long)Math.max(0, pingTicks) + 1L && var4 >= -10L;
   }

   public boolean liiiIIllIl() {
      return this.Iiilliiliiil(this.IIIilIIiiIIi());
   }

   public boolean IIIllIIliIIl() {
      return this.Iiilliiliiil(this.IlIillIiilIi());
   }

   private void Ililllililil() {
      if (this.iillIlliIl > 0) {
         --this.iillIlliIl;
      }

   }

   public boolean Illlllllilll() {
      return this.iillIlliIl > 0;
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(-((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6) >>> 1 | (char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6) << 15) - '龩') ^ 3262) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6) >>> 1 | (char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6) << 15) - '龩') ^ 3262) << 8) >>> 11 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6) >>> 1 | (char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6) << 15) - '龩') ^ 3262) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6) >>> 1 | (char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6) << 15) - '龩') ^ 3262) << 8) << 5) ^ var5) + var5))))))))) - '뢄'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean Iiilliiliiil(String failing) {
      this.IIilIlliIl = failing == null ? IiIiliIiiiIi<invokedynamic>() : failing;
      return failing == null;
   }

   public boolean iIlIlllllill() {
      String var1 = this.IIIilIIiiIIi();
      if (var1 == null && !this.lIllIlliIl.iliIiiliiiii()) {
         var1 = IiIiliIiiiIi<invokedynamic>();
      }

      if (var1 == null && this.llllIlliIl) {
         var1 = IiIiliIiiiIi<invokedynamic>();
      }

      return this.Iiilliiliiil(var1);
   }

   public IlIIiiIillIIiiIi IIlllIlliIll() {
      ++this.iillIlliIl;
      return this.iIllIlliIl;
   }
}
