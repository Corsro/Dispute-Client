package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2535;
import net.minecraft.class_2561;
import net.minecraft.class_412;
import net.minecraft.class_437;
import net.minecraft.class_442;
import net.minecraft.class_500;
import net.minecraft.class_638;
import net.minecraft.class_639;
import net.minecraft.class_642;
import net.minecraft.class_9112;

public class iliIIiiIiiIIii extends ilIllIiIll {
   private static long llIiillIIl;
   private class_2535 liIiillIIl;
   private long iiIiillIIl;
   private IIiIIllllIiIIlll ilIiillIIl;
   private int IIliillIIl;
   private final iilliIlIIiliIl IlIiillIIl = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0, 0, (-459298961 >>> 21 | -459298961 << 11) ^ 31 ^ -46432463);
   private class_642 IiIiillIIl;

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - 16621) ^ 4226))) + var5) >>> 7 | (char)((char)(~((char)((char)(var4[var5] - 16621) ^ 4226))) + var5) << 9) + var5) - 32363) + var5) + var5) + var5) + '靱') << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - 16621) ^ 4226))) + var5) >>> 7 | (char)((char)(~((char)((char)(var4[var5] - 16621) ^ 4226))) + var5) << 9) + var5) - 32363) + var5) + var5) + var5) + '靱') >>> 5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iliIIiiIiiIIii() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.ilIiillIIl = IIiIIllllIiIIlll.IilIIIIill;
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IlIiillIIl});
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1012597846955095879L ^ Long.rotateLeft(7664684176426871425L, 60) ^ -4166980927932714733L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 9000799852204337000L ^ Long.rotateLeft(-7518712518642474660L, 44) ^ -6811324347337860233L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -9003404082357723802L ^ Long.rotateLeft(4870336082124091098L, 6) ^ -2797932178034216266L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 3310021898657622910L ^ Long.rotateLeft(1392082238165235771L, 10) ^ -3859353347751039041L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8995125034490789838L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 7686803597783983403L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -1307833727283662449L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 2474378894212782482L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -3463799685885990472L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -39569884025441298L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, lIiiIiIlilli<invokedynamic>());
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

   protected void Iilililiiili() {
      ++this.IIliillIIl;
      this.ilIiillIIl = IIiIIllllIiIIlll.IilIIIIill;
      this.IiIiillIIl = null;
      this.liIiillIIl = null;
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(-((char)(~((char)((char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ var5))) << 15 | (char)(~((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ var5))) >>> 1))))) ^ 1880))) ^ '＂') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void ilIllIiIll(String msg, boolean good) {
      this.ilIiillIIl = IIiIIllllIiIIlll.IilIIIIill;
      if (this.IliIlllilIi()) {
         try (AutoCloseable var3 = Iliiiiilliiiii.IliIlllilIi().liiiIIllIl()) {
            this.IIillIiliIil(false);
         } catch (Exception var8) {
            this.ilIiillIIl = IIiIIllllIiIIlll.IilIIIIill;
         }
      }

      if (msg != null) {
         this.liIlliiIll(msg, good);
      }

   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)(-((char)((char)(~((char)(~((char)(~var4[var5]))))) + 27253))) << 7 | (char)(-((char)((char)(~((char)(~((char)(~var4[var5]))))) + 27253))) >>> 9))) - '\uf672') - var5) << 3 | (char)((char)((char)(~((char)((char)(-((char)((char)(~((char)(~((char)(~var4[var5]))))) + 27253))) << 7 | (char)(-((char)((char)(~((char)(~((char)(~var4[var5]))))) + 27253))) >>> 9))) - '\uf672') - var5) >>> 13))) ^ var5) - 21475));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void liIlliiIll(String good, boolean msg) {
      if (!IliiliIllliiliIl.iiiIlIIIll()) {
         if (Iiiilllliiilll.field_1724 != null) {
            Iiiilllliiilll.field_1724.method_7353(class_2561.method_43470(IliIlllilIi<invokedynamic>() + good), false);
         }

      } else {
         Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<invokedynamic>(), good, msg);
      }
   }

   protected void iIIIlIlIIl() {
      if (this.ilIiillIIl == IIiIIllllIiIIlll.iilIIIIill && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.method_1562() != null) {
         if (Iiiilllliiilll.method_1562().method_48296() != this.liIiillIIl) {
            class_642 var1 = Iiiilllliiilll.method_1558();
            long var2 = System.currentTimeMillis() - this.iiIiillIIl;
            String var4 = this.IiIiillIIl == null ? null : this.IiIiillIIl.field_3761;
            if (IIlIlIillIlIlIil.lIiiIiIlilli(var4, var1 == null ? null : var1.field_3761, var2)) {
               this.ilIllIiIll(IliIlllilIi<invokedynamic>() + IlIllllIll(this.IiIiillIIl) + IliIlllilIi<invokedynamic>(), true);
            } else {
               this.ilIllIiIll((String)null, false);
            }

         }
      }
   }

   private void iiiIlIIIll(int t) {
      if (t == this.IIliillIIl && this.ilIiillIIl == IIiIIllllIiIIlll.lilIIIIill && this.IliIlllilIi() && this.IiIiillIIl != null) {
         if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.method_1562() != null && Iiiilllliiilll.method_1562().method_48296() == this.liIiillIIl) {
            this.ilIiillIIl = IIiIIllllIiIIlll.iilIIIIill;
            Iiiilllliiilll.method_73360(class_638.field_61021);
            class_437 var4 = Iiiilllliiilll.field_1755;
            class_500 var10000;
            if (var4 instanceof class_500) {
               class_500 var3 = (class_500)var4;
               var10000 = var3;
            } else {
               var10000 = new class_500(new class_442());
            }

            class_500 var2 = var10000;
            long var6 = IIlIlIillIlIlIil.iIlIlllllill(this.IlIiillIIl.Iilllilliill());
            if (var6 <= (3115445281409273701L ^ 3115445281409273701L)) {
               this.lIIlliIIll(t, var2, (class_437)null);
            } else {
               if (Iiiilllliiilll.field_1755 != var2) {
                  Iiiilllliiilll.method_1507(var2);
               }

               class_437 var5 = Iiiilllliiilll.field_1755;
               CompletableFuture.delayedExecutor(var6, TimeUnit.MILLISECONDS).execute(() -> Iiiilllliiilll.execute(() -> this.lIIlliIIll(t, var2, var5)));
            }
         } else {
            this.ilIllIiIll((String)null, false);
         }
      }
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) << 14 | (char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) >>> 2) << 10 | (char)((char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) << 14 | (char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) >>> 2) >>> 6) - 7419) + 11210) >>> 14 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) << 14 | (char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) >>> 2) << 10 | (char)((char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) << 14 | (char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) >>> 2) >>> 6) - 7419) + 11210) << 2) - var5) - 'ꌕ') << 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) << 14 | (char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) >>> 2) << 10 | (char)((char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) << 14 | (char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) >>> 2) >>> 6) - 7419) + 11210) >>> 14 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) << 14 | (char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) >>> 2) << 10 | (char)((char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) << 14 | (char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) >>> 2) >>> 6) - 7419) + 11210) << 2) - var5) - 'ꌕ') >>> 14) - var5) ^ var5) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) << 14 | (char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) >>> 2) << 10 | (char)((char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) << 14 | (char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) >>> 2) >>> 6) - 7419) + 11210) >>> 14 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) << 14 | (char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) >>> 2) << 10 | (char)((char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) << 14 | (char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) >>> 2) >>> 6) - 7419) + 11210) << 2) - var5) - 'ꌕ') << 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) << 14 | (char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) >>> 2) << 10 | (char)((char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) << 14 | (char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) >>> 2) >>> 6) - 7419) + 11210) >>> 14 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) << 14 | (char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) >>> 2) << 10 | (char)((char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) << 14 | (char)((char)(~((char)((char)(var4[var5] - var5)))) + var5) >>> 2) >>> 6) - 7419) + 11210) << 2) - var5) - 'ꌕ') >>> 14) - var5) ^ var5) << 8) - '蜌'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void lIIlliIIll(int t, class_437 expect, class_437 back) {
      if (t == this.IIliillIIl && this.ilIiillIIl == IIiIIllllIiIIlll.iilIIIIill && this.IliIlllilIi() && this.IiIiillIIl != null) {
         if (Iiiilllliiilll.field_1687 == null && (back == null || Iiiilllliiilll.field_1755 == back)) {
            class_412.method_36877(expect, Iiiilllliiilll, class_639.method_2950(this.IiIiillIIl.field_3761), this.IiIiillIIl, false, (class_9112)null);
         } else {
            this.ilIllIiIll((String)null, false);
         }
      }
   }

   private static String IlIllllIll(class_642 info) {
      if (info == null) {
         return IliIlllilIi<invokedynamic>();
      } else {
         return info.field_3752 != null && !info.field_3752.isBlank() ? info.field_3752 : info.field_3761;
      }
   }

   protected void Illillliilli() {
      long var8 = 7993811135103125443L;
      if (Iiiilllliiilll != null) {
         var8 ^= ((long)(++this.IIliillIIl) << 32 ^ var8) & -1L << 32;
         this.ilIiillIIl = IIiIIllllIiIIlll.IilIIIIill;
         this.IiIiillIIl = null;
         this.liIiillIIl = null;
         long var2 = System.currentTimeMillis();
         var8 ^= ((long)(Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.method_1562() != null ? 1 : 0) ^ var8) & -1L >>> 32;
         class_642 var5 = (int)var8 != 0 ? Iiiilllliiilll.method_1558() : null;
         ilIIiIllIiIIiIll var6 = IIlIlIillIlIlIil.IliIlllilIi((boolean)((int)var8), Iiiilllliiilll.method_1542(), var5 == null ? null : var5.field_3761, var5 != null && var5.method_52811(), var2, llIiillIIl);
         if (var6 != ilIIiIllIiIIiIll.IIIillilll) {
            String var7 = IIlIlIillIlIlIil.liiiIIllIl(var6);
            Iiiilllliiilll.method_63588(() -> {
               if (msg == this.IIliillIIl) {
                  this.ilIllIiIll(var7, false);
               }

            });
         } else {
            llIiillIIl = var2;
            this.IiIiillIIl = var5;
            this.liIiillIIl = Iiiilllliiilll.method_1562().method_48296();
            this.iiIiillIIl = var2;
            this.ilIiillIIl = IIiIIllllIiIIlll.lilIIIIill;
            Iiiilllliiilll.method_63588(() -> this.iiiIlIIIll(t));
         }
      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - var5) << 6 | (char)((char)(-((char)(var4[var5] - var5))) - var5) >>> 10) >>> 2 | (char)((char)((char)(-((char)(var4[var5] - var5))) - var5) << 6 | (char)((char)(-((char)(var4[var5] - var5))) - var5) >>> 10) << 14) + 32164) + 32072))) + 20337) ^ 3180) << 14 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - var5) << 6 | (char)((char)(-((char)(var4[var5] - var5))) - var5) >>> 10) >>> 2 | (char)((char)((char)(-((char)(var4[var5] - var5))) - var5) << 6 | (char)((char)(-((char)(var4[var5] - var5))) - var5) >>> 10) << 14) + 32164) + 32072))) + 20337) ^ 3180) >>> 2) + var5) >>> 12 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - var5) << 6 | (char)((char)(-((char)(var4[var5] - var5))) - var5) >>> 10) >>> 2 | (char)((char)((char)(-((char)(var4[var5] - var5))) - var5) << 6 | (char)((char)(-((char)(var4[var5] - var5))) - var5) >>> 10) << 14) + 32164) + 32072))) + 20337) ^ 3180) << 14 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - var5) << 6 | (char)((char)(-((char)(var4[var5] - var5))) - var5) >>> 10) >>> 2 | (char)((char)((char)(-((char)(var4[var5] - var5))) - var5) << 6 | (char)((char)(-((char)(var4[var5] - var5))) - var5) >>> 10) << 14) + 32164) + 32072))) + 20337) ^ 3180) >>> 2) + var5) << 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
