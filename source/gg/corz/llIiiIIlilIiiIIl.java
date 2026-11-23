package gg.corz;

import com.corz.client.mixins.AccessorHandledScreen;
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
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_465;

public class llIiiIIlilIiiIIl {
   private static final int iIilIlilIl = 16;
   private final class_465<?> ililIlilIl;
   private static final int IlilIlilIl = 12;
   private final AccessorHandledScreen IiilIlilIl;
   private static final int lIilIlilIl = 26;
   private final iIliiIllii liilIlilIl;
   private static final int IIilIlilIl = 22;
   private static final int lillIlilIl = 74;
   private static final int iillIlilIl = 74;
   private static final int llilIlilIl = 16;

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ '遭') + 22607) - var5) ^ var5) + '뿿') << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ '遭') + 22607) - var5) ^ var5) + '뿿') >>> 1) ^ '칩') ^ var5) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ '遭') + 22607) - var5) ^ var5) + '뿿') << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ '遭') + 22607) - var5) ^ var5) + '뿿') >>> 1) ^ '칩') ^ var5) >>> 5) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ '遭') + 22607) - var5) ^ var5) + '뿿') << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ '遭') + 22607) - var5) ^ var5) + '뿿') >>> 1) ^ '칩') ^ var5) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ '遭') + 22607) - var5) ^ var5) + '뿿') << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ '遭') + 22607) - var5) ^ var5) + '뿿') >>> 1) ^ '칩') ^ var5) >>> 5) >>> 11))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6646356193349462775L ^ Long.rotateLeft(-5974450365724084434L, 41) ^ 7831987809877339261L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1436160629170625098L ^ Long.rotateLeft(7857042427087731095L, 41) ^ -458748337247362323L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2235928376388558491L ^ Long.rotateLeft(4455622039231863170L, 1) ^ -6519044799814460774L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -9064615536175737328L ^ Long.rotateLeft(-1398600169993090948L, 31) ^ 7077588364710298377L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3738183422907041454L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -4799614361634219883L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4459978549134137685L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2166367924528253215L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5787971848131875865L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -897597952326855632L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIIIllIIIl<invokedynamic>());
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

   private void IIIilIIiiIIi(class_332 shadow, class_327 cx, String y, int font, int color, int text, boolean g) {
      shadow.method_51439(cx, class_2561.method_43470(y), font - cx.method_1727(y) / 2, color, text, g);
   }

   private void Ililllililil(class_332 i, class_327 my, int pickable, int accent, int mx, boolean font, int g) {
      long var16 = -3662964967163043455L;
      long var18 = -7752408022436615176L;
      long var20 = -7069645639688436851L;
      long var22 = -8475213726379095366L;
      var16 ^= ((long)this.IiIlliIliiIl(pickable) << 32 ^ var16) & -1L << 32;
      var16 ^= ((long)this.IIlllIlliIll(pickable) ^ var16) & -1L >>> 32;
      var18 ^= ((long)(this.liilIlilIl.lIIlliIIll() == pickable && this.liilIlilIl.iiiIlIIIll() != ilIiiIIiIiIiiIIi.IIliIiiiil ? 1 : 0) << 32 ^ var18) & -1L << 32;
      var18 ^= ((long)(font && Iilllilliill((double)accent, (double)mx, (int)(var16 >>> 32), (int)var16, 22, 22) ? 1 : 0) ^ var18) & -1L >>> 32;
      String var12 = Integer.toString(pickable + 1);
      var20 ^= ((long)((int)(var16 >>> 32) + 11) << 32 ^ var20) & -1L << 32;
      var20 ^= ((long)((int)var16 + 7) ^ var20) & -1L >>> 32;
      if ((int)(var18 >>> 32) != 0) {
         i.method_25294((int)(var16 >>> 32), (int)var16, (int)(var16 >>> 32) + 22, (int)var16 + 22, g);
         IlIillIiilIi(i, (int)(var16 >>> 32), (int)var16, 22, 22, Illillliilli(g));
         this.IIIilIIiiIIi(i, my, var12, (int)(var20 >>> 32), (int)var20, -16119284, false);
      } else {
         i.method_25294((int)(var16 >>> 32), (int)var16, (int)(var16 >>> 32) + 22, (int)var16 + 22, (int)var18 != 0 ? IIlilIliiIli(g, 0.22F) : -15460837);
         IlIillIiilIi(i, (int)(var16 >>> 32), (int)var16, 22, 22, (int)var18 != 0 ? IIlilIliiIli(g, 0.6F) : -14013389);
         var22 ^= ((long)(!font ? -8421505 : ((int)var18 != 0 ? Illillliilli(g) : -1)) << 32 ^ var22) & -1L << 32;
         this.IIIilIIiiIIi(i, my, var12, (int)(var20 >>> 32), (int)var20, (int)(var22 >>> 32), false);
      }

   }

   private int IilliliilIIi() {
      return this.iIlIlllllill() + 8 + 12 + 4;
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) >>> 14 | (char)(~((char)(var4[var5] ^ var5))) << 2) + 4768) ^ 2853) - '鵑') - var5) >>> 8 | (char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) >>> 14 | (char)(~((char)(var4[var5] ^ var5))) << 2) + 4768) ^ 2853) - '鵑') - var5) << 8) ^ var5) + '뷑') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private int IiIlliIliiIl(int i) {
      return this.liiiIIllIl() + 8 + i % 3 * 26;
   }

   private static void IlIillIiilIi(class_332 w, int g, int h, int y, int x, int color) {
      w.method_25294(g, h, g + y, h + 1, color);
      w.method_25294(g, h + x - 1, g + y, h + x, color);
      w.method_25294(g, h, g + 1, h + x, color);
      w.method_25294(g + y - 1, h, g + y, h + x, color);
   }

   private int lIiiIiIlilli() {
      return this.IilliliilIIi() + 74 + 6;
   }

   private int IlIlllIlilIl() {
      return this.IIIllIIliIIl() + 16 + 7 - this.iIlIlllllill();
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5)) - 31582) ^ var5) ^ var5) - 19502) ^ var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5)) - 31582) ^ var5) ^ var5) - 19502) ^ var5) << 6) >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5)) - 31582) ^ var5) ^ var5) - 19502) ^ var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5)) - 31582) ^ var5) ^ var5) - 19502) ^ var5) << 6) << 4) - var5))) + '萯') ^ 32307) ^ var5) ^ var5) + var5) >>> 9 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5)) - 31582) ^ var5) ^ var5) - 19502) ^ var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5)) - 31582) ^ var5) ^ var5) - 19502) ^ var5) << 6) >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5)) - 31582) ^ var5) ^ var5) - 19502) ^ var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5)) - 31582) ^ var5) ^ var5) - 19502) ^ var5) << 6) << 4) - var5))) + '萯') ^ 32307) ^ var5) ^ var5) + var5) << 7) >>> 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5)) - 31582) ^ var5) ^ var5) - 19502) ^ var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5)) - 31582) ^ var5) ^ var5) - 19502) ^ var5) << 6) >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5)) - 31582) ^ var5) ^ var5) - 19502) ^ var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5)) - 31582) ^ var5) ^ var5) - 19502) ^ var5) << 6) << 4) - var5))) + '萯') ^ 32307) ^ var5) ^ var5) + var5) >>> 9 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5)) - 31582) ^ var5) ^ var5) - 19502) ^ var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5)) - 31582) ^ var5) ^ var5) - 19502) ^ var5) << 6) >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5)) - 31582) ^ var5) ^ var5) - 19502) ^ var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5)) - 31582) ^ var5) ^ var5) - 19502) ^ var5) << 6) << 4) - var5))) + '萯') ^ 32307) ^ var5) ^ var5) + var5) << 7) << 11))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private int Illlllllilll() {
      return this.liiiIIllIl() + 8;
   }

   public boolean IiIiliIiiiIi(double button, double mx, int my) {
      long var7 = 4512976229583434942L;
      if (!this.liilIlilIl.IliIlllilIi()) {
         return false;
      } else if (!Iilllilliill(button, mx, this.liiiIIllIl(), this.iIlIlllllill(), this.IliIlllilIi(), this.IlIlllIlilIl())) {
         return false;
      } else {
         if (my == 0) {
            if (this.liilIlilIl.ilIllIiIll()) {
               for(long var9 = var7 ^ (0L ^ var7) & -1L << 32; (int)(var9 >>> 32) < 9; var9 += 4294967296L) {
                  if (Iilllilliill(button, mx, this.IiIlliIliiIl((int)(var9 >>> 32)), this.IIlllIlliIll((int)(var9 >>> 32)), 22, 22)) {
                     this.liilIlilIl.iIlllIllll((int)(var9 >>> 32));
                     return true;
                  }
               }
            }

            if (this.liilIlilIl.liIlliiIll() && Iilllilliill(button, mx, this.Illlllllilll(), this.lIiiIiIlilli(), 74, 16)) {
               this.liilIlilIl.lllllillll();
               return true;
            }

            if (Iilllilliill(button, mx, this.Illlllllilll(), this.iliIiiliiiii(), 74, 12)) {
               this.liilIlilIl.Iillllilll();
               return true;
            }
         }

         return true;
      }
   }

   // $FF: synthetic method
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ 5432) + var5) + var5)) ^ 2228) - var5) + '븺') ^ var5) - '諭'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public llIiiIIlilIiiIIl(class_465<?> screen, iIliiIllii mod) {
      this.ililIlilIl = screen;
      this.IiilIlilIl = (AccessorHandledScreen)screen;
      this.liilIlilIl = mod;
   }

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)(-((char)(~((char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 18778)))))))) >>> 2 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 18778)))))))) << 14))))) ^ 26635))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IIillIiliIil(class_332 my, int mx, int g) {
      long var17 = -3075593261685028625L;
      long var19 = -3861513072252212081L;
      long var13 = 6345739592893423409L;
      long var15 = -1925944279665469416L;
      if (this.liilIlilIl.IliIlllilIi()) {
         class_327 var4 = class_310.method_1551().field_1772;
         var13 ^= ((long)IlIIilIlllIIilIl.lliiIlliIl << 32 ^ var13) & -1L << 32;
         var13 ^= ((long)this.liiiIIllIl() ^ var13) & -1L >>> 32;
         var15 ^= ((long)this.iIlIlllllill() << 32 ^ var15) & -1L << 32;
         var15 ^= ((long)this.IliIlllilIi() ^ var15) & -1L >>> 32;
         var17 ^= ((long)this.IlIlllIlilIl() << 32 ^ var17) & -1L << 32;
         my.method_25294((int)var13 - 1, (int)(var15 >>> 32) - 1, (int)var13 + (int)var15 + 1, (int)(var15 >>> 32) + (int)(var17 >>> 32) + 1, -435549171);
         my.method_25294((int)var13, (int)(var15 >>> 32), (int)var13 + (int)var15, (int)(var15 >>> 32) + (int)(var17 >>> 32), -16184564);
         IlIillIiilIi(my, (int)var13, (int)(var15 >>> 32), (int)var15, (int)(var17 >>> 32), IIlilIliiIli((int)(var13 >>> 32), 0.45F));
         this.IIIilIIiiIIi(my, var4, Iilililiiili<invokedynamic>(), (int)var13 + (int)var15 / 2, (int)(var15 >>> 32) + 8, (int)(var13 >>> 32), false);
         var17 ^= ((long)this.liilIlilIl.ilIllIiIll() ^ var17) & -1L >>> 32;

         for(var19 ^= (0L ^ var19) & -1L << 32; (int)(var19 >>> 32) < 9; var19 += 4294967296L) {
            this.Ililllililil(my, var4, (int)(var19 >>> 32), mx, g, (boolean)((int)var17), (int)(var13 >>> 32));
         }

         this.Iiilliiliiil(my, var4, this.Illlllllilll(), this.lIiiIiIlilli(), 74, 16, Iilililiiili<invokedynamic>(), this.liilIlilIl.liIlliiIll(), mx, g, (int)(var13 >>> 32));
         var19 ^= ((long)(this.liilIlilIl.iiiIlIIIll() == ilIiiIIiIiIiiIIi.IIliIiiiil && this.liilIlilIl.lIIlliIIll() < 0 ? 0 : 1) << 32 ^ var19) & -1L << 32;
         this.Iiilliiliiil(my, var4, this.Illlllllilll(), this.iliIiiliiiii(), 74, 12, Iilililiiili<invokedynamic>(), (boolean)((int)(var19 >>> 32)), mx, g, (int)(var13 >>> 32));
         String var10000;
         switch (this.liilIlilIl.iiiIlIIIll()) {
            case lIliIiiiil -> var10000 = Iilililiiili<invokedynamic>() + this.liilIlilIl.IlIllllIll();
            case iIliIiiiil -> var10000 = Iilililiiili<invokedynamic>() + (this.liilIlilIl.lIIlliIIll() + 1);
            case IlliIiiiil -> var10000 = Iilililiiili<invokedynamic>() + this.liilIlilIl.IlIllllIll();
            default -> var10000 = Iilililiiili<invokedynamic>();
         }

         String var12 = var10000;
         this.IIIilIIiiIIi(my, var4, var12, (int)var13 + (int)var15 / 2, this.IIIllIIliIIl() + 4, -8421505, false);
      }
   }

   private int liiiIIllIl() {
      long var3 = -1166019695130942978L;
      var3 ^= ((long)(this.IiilIlilIl.corzX() + this.IiilIlilIl.corzBackgroundWidth() + 6) << 32 ^ var3) & -1L << 32;
      if ((int)(var3 >>> 32) + this.IliIlllilIi() > this.ililIlilIl.field_22789) {
         var3 ^= ((long)(this.IiilIlilIl.corzX() - this.IliIlllilIi() - 6) ^ var3) & -1L >>> 32;
         if ((int)var3 >= 2) {
            return (int)var3;
         }
      }

      return (int)(var3 >>> 32);
   }

   private int IIIllIIliIIl() {
      return this.iliIiiliiiii() + 12 + 5;
   }

   private int IliIlllilIi() {
      return 90;
   }

   private int iIlIlllllill() {
      return this.IiilIlilIl.corzY();
   }

   private static int IIlilIliiIli(int a, float argb) {
      return ((int)(argb * 255.0F) & 255) << 24 | a & 16777215;
   }

   private int IIlllIlliIll(int i) {
      return this.IilliliilIIi() + i / 3 * 26;
   }

   private static boolean Iilllilliill(double x, double h, int y, int w, int mx, int my) {
      return x >= (double)y && x < (double)(y + mx) && h >= (double)w && h < (double)(w + my);
   }

   private static int Illillliilli(int argb) {
      long var4 = 7374608021735598212L;
      long var6 = -879340164416409040L;
      var4 ^= ((long)Math.min(255, (argb >> 16 & 255) + 60) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)Math.min(255, (argb >> 8 & 255) + 60) ^ var4) & -1L >>> 32;
      var6 ^= ((long)Math.min(255, (argb & 255) + 60) << 32 ^ var6) & -1L << 32;
      return -16777216 | (int)(var4 >>> 32) << 16 | (int)var4 << 8 | (int)(var6 >>> 32);
   }

   private int iliIiiliiiii() {
      return this.lIiiIiIlilli() + 16 + 3;
   }

   private void Iiilliiliiil(class_332 mx, class_327 y, int label, int enabled, int h, int w, String my, boolean accent, int x, int g, int font) {
      long var17 = 1779892621130315745L;
      long var15 = 4385427236656344529L;
      var15 ^= ((long)(accent && Iilllilliill((double)x, (double)g, label, enabled, h, w) ? 1 : 0) << 32 ^ var15) & -1L << 32;
      var15 ^= ((long)(!accent ? -15724010 : ((int)(var15 >>> 32) != 0 ? IIlilIliiIli(font, 0.28F) : -15263200)) ^ var15) & -1L >>> 32;
      mx.method_25294(label, enabled, label + h, enabled + w, (int)var15);
      IlIillIiilIi(mx, label, enabled, h, w, accent ? IIlilIliiIli(font, (int)(var15 >>> 32) != 0 ? 0.7F : 0.4F) : -14013389);
      var17 ^= ((long)(!accent ? -8421505 : ((int)(var15 >>> 32) != 0 ? Illillliilli(font) : -1)) << 32 ^ var17) & -1L << 32;
      this.IIIilIIiiIIi(mx, y, my, label + h / 2, enabled + (w - 8) / 2, (int)(var17 >>> 32), false);
   }
}
