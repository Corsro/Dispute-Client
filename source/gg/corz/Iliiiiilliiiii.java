package gg.corz;

import com.corz.client.CorzClient;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_4587;

public class Iliiiiilliiiii {
   private static final String IIllilIlIl = "Module Disabled";
   private static final String iIllilIlIl = " disabled";
   private static final String llllilIlIl = "Disabled";
   private int lillilIlIl = 0;
   private static final int ilIlilIlIl = 8;
   private static final String IlllilIlIl = "Enabled";
   private static final Iliiiiilliiiii llIlilIlIl = new Iliiiiilliiiii();
   private final List<liiiiiiiiiiiii> illlilIlIl = new ArrayList();
   private static final int IiIlilIlIl = 4;
   private static final int liIlilIlIl = 4;
   private static final String iiIlilIlIl = "Module Enabled";
   private final class_4587 IillilIlIl = new class_4587();
   private static final String lIllilIlIl = " enabled";

   public AutoCloseable liiiIIllIl() {
      ++this.lillilIlIl;
      return () -> {
         if (this.lillilIlIl > 0) {
            --this.lillilIlIl;
         }

      };
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '\ue77b') >>> 1 | (char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '\ue77b') << 15) - var5) - '隮') + '梨') - var5))) >>> 2 | (char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '\ue77b') >>> 1 | (char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '\ue77b') << 15) - var5) - '隮') + '梨') - var5))) << 14) ^ var5) + var5) + var5) >>> 3 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '\ue77b') >>> 1 | (char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '\ue77b') << 15) - var5) - '隮') + '梨') - var5))) >>> 2 | (char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '\ue77b') >>> 1 | (char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '\ue77b') << 15) - var5) - '隮') + '梨') - var5))) << 14) ^ var5) + var5) + var5) << 13));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IilliliilIIi(class_332 ctx) {
      long var16 = -3841841052320029291L;
      long var18 = 666732261439923189L;
      long var20 = 598358315787624420L;
      this.illlilIlIl.removeIf(liiiiiiiiiiiii::iliIiiliiiii);
      if (!this.illlilIlIl.isEmpty()) {
         if (!IliiliIllliiliIl.iiiIlIIIll()) {
            for(liiiiiiiiiiiii var3 : this.illlilIlIl) {
               var3.IliIlllilIi();
            }
         }

         class_310 var24 = class_310.method_1551();
         double var25 = (double)var24.method_22683().method_4495();
         var16 ^= ((long)var24.method_22683().method_4476(IIililillIililil.iiiIlIIIll(var24), var24.method_1573()) << 32 ^ var16) & -1L << 32;
         float var6 = (float)((double)((int)(var16 >>> 32)) / var25);
         var16 ^= ((long)(Math.abs(var6 - 1.0F) > 1.0E-4F ? 1 : 0) ^ var16) & -1L >>> 32;
         if ((int)var16 != 0) {
            var18 ^= ((long)Math.round((float)var24.method_22683().method_4486() / var6) << 32 ^ var18) & -1L << 32;
            var18 ^= ((long)Math.round((float)var24.method_22683().method_4502() / var6) ^ var18) & -1L >>> 32;
         } else {
            var18 ^= ((long)var24.method_22683().method_4486() << 32 ^ var18) & -1L << 32;
            var18 ^= ((long)var24.method_22683().method_4502() ^ var18) & -1L >>> 32;
         }

         class_4587 var10 = CorzClient.fontManager.liiiIIllIl();
         class_4587 var11 = IIIiiIillIIiiIil.liiiIIllIl();
         CorzClient.fontManager.iIlIlllllill(this.IillilIlIl);
         IIIiiIillIIiiIil.IliIlllilIi(this.IillilIlIl);
         if ((int)var16 != 0) {
            IliiIilliiIi.lIIlllIIliIIlllIIl = (float)((int)(var18 >>> 32));
            IliiIilliiIi.IlIlllIIlllIlllIIl = (float)((int)var18);
         }

         try {
            float var12 = (float)((int)var18 - 8) - llliIlIlilliIlIl.liilliiill();

            for(long var31 = var20 ^ ((long)(this.illlilIlIl.size() - 1) << 32 ^ var20) & -1L << 32; (int)(var31 >>> 32) >= 0; var31 += -4294967296L) {
               liiiiiiiiiiiii var14 = (liiiiiiiiiiiii)this.illlilIlIl.get((int)(var31 >>> 32));
               var14.IIIilIIiiIIi(ctx, (int)(var18 >>> 32) - 8, var12 - (float)var14.IIIllIIliIIl());
               var12 -= (float)(var14.IIIllIIliIIl() + 4) * var14.lIiiIiIlilli();
            }
         } finally {
            if ((int)var16 != 0) {
               IliiIilliiIi.lIIlllIIliIIlllIIl = 0.0F;
               IliiIilliiIi.IlIlllIIlllIlllIIl = 0.0F;
            }

            CorzClient.fontManager.iIlIlllllill(var10);
            IIIiiIillIIiiIil.IliIlllilIi(var11);
         }

      }
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) << 9 | (char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) >>> 7) ^ '냤') >>> 10 | (char)((char)((char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) << 9 | (char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) >>> 7) ^ '냤') << 6))))) + 7541) << 2 | (char)((char)(~((char)(~((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) << 9 | (char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) >>> 7) ^ '냤') >>> 10 | (char)((char)((char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) << 9 | (char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) >>> 7) ^ '냤') << 6))))) + 7541) >>> 14) << 4 | (char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) << 9 | (char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) >>> 7) ^ '냤') >>> 10 | (char)((char)((char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) << 9 | (char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) >>> 7) ^ '냤') << 6))))) + 7541) << 2 | (char)((char)(~((char)(~((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) << 9 | (char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) >>> 7) ^ '냤') >>> 10 | (char)((char)((char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) << 9 | (char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) >>> 7) ^ '냤') << 6))))) + 7541) >>> 14) >>> 12) ^ var5))) + var5) ^ 28731) >>> 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) << 9 | (char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) >>> 7) ^ '냤') >>> 10 | (char)((char)((char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) << 9 | (char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) >>> 7) ^ '냤') << 6))))) + 7541) << 2 | (char)((char)(~((char)(~((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) << 9 | (char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) >>> 7) ^ '냤') >>> 10 | (char)((char)((char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) << 9 | (char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) >>> 7) ^ '냤') << 6))))) + 7541) >>> 14) << 4 | (char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) << 9 | (char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) >>> 7) ^ '냤') >>> 10 | (char)((char)((char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) << 9 | (char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) >>> 7) ^ '냤') << 6))))) + 7541) << 2 | (char)((char)(~((char)(~((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) << 9 | (char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) >>> 7) ^ '냤') >>> 10 | (char)((char)((char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) << 9 | (char)((char)(-((char)((char)(-var4[var5]) ^ 'ꐂ'))) - var5) >>> 7) ^ '냤') << 6))))) + 7541) >>> 14) >>> 12) ^ var5))) + var5) ^ 28731) << 13));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + var5) + var5) - '\ue2a4') ^ '\udeb1') - '赕') >>> 4 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + var5) + var5) - '\ue2a4') ^ '\udeb1') - '赕') << 12) ^ 27158) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + var5) + var5) - '\ue2a4') ^ '\udeb1') - '赕') >>> 4 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + var5) + var5) - '\ue2a4') ^ '\udeb1') - '赕') << 12) ^ 27158) << 13) + var5) - 15182));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - '膌') + '\ue8bb') >>> 12 | (char)((char)(var4[var5] - '膌') + '\ue8bb') << 4) - '얥') - 20478) << 14 | (char)((char)((char)((char)((char)(var4[var5] - '膌') + '\ue8bb') >>> 12 | (char)((char)(var4[var5] - '膌') + '\ue8bb') << 4) - '얥') - 20478) >>> 2))))) - '\ue9ab') + '묽') + var5) + 13988) - 9346))))) - var5));
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
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) + 20990) >>> 13 | (char)((char)((char)(~var4[var5]) - var5) + 20990) << 3))))) >>> 15 | (char)(~((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) + 20990) >>> 13 | (char)((char)((char)(~var4[var5]) - var5) + 20990) << 3))))) << 1) ^ var5) >>> 4 | (char)((char)((char)(~((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) + 20990) >>> 13 | (char)((char)((char)(~var4[var5]) - var5) + 20990) << 3))))) >>> 15 | (char)(~((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) + 20990) >>> 13 | (char)((char)((char)(~var4[var5]) - var5) + 20990) << 3))))) << 1) ^ var5) << 12) ^ var5) << 13 | (char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) + 20990) >>> 13 | (char)((char)((char)(~var4[var5]) - var5) + 20990) << 3))))) >>> 15 | (char)(~((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) + 20990) >>> 13 | (char)((char)((char)(~var4[var5]) - var5) + 20990) << 3))))) << 1) ^ var5) >>> 4 | (char)((char)((char)(~((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) + 20990) >>> 13 | (char)((char)((char)(~var4[var5]) - var5) + 20990) << 3))))) >>> 15 | (char)(~((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) + 20990) >>> 13 | (char)((char)((char)(~var4[var5]) - var5) + 20990) << 3))))) << 1) ^ var5) << 12) ^ var5) >>> 3) - var5) - 21989))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static Iliiiiilliiiii IliIlllilIi() {
      return llIlilIlIl;
   }

   public void iIlIlllllill(String subtitle, String title, boolean enabled) {
      if (this.lillilIlIl <= 0 && IliiliIllliiliIl.iiiIlIIIll()) {
         String var4 = enabled ? IlIlllIlilIl<invokedynamic>() : IlIlllIlilIl<invokedynamic>();
         if ((enabled ? IlIlllIlilIl<invokedynamic>() : IlIlllIlilIl<invokedynamic>()).equals(subtitle) && title != null && title.length() > var4.length() && title.endsWith(var4)) {
            subtitle = title.substring(0, title.length() - var4.length());
            title = enabled ? IlIlllIlilIl<invokedynamic>() : IlIlllIlilIl<invokedynamic>();
         }

         subtitle = liIlliIiiiIlliIi.Iillllilll(subtitle);
         title = liIlliIiiiIlliIi.Iillllilll(title);
         subtitle = IlIllllllIllll.Iillllilll(subtitle);
         title = IlIllllllIllll.Iillllilll(title);
         subtitle = IiiIliiliiIlii.liiiIIllIl(subtitle);
         title = IiiIliiliiIlii.liiiIIllIl(title);

         for(liiiiiiiiiiiii var6 : this.illlilIlIl) {
            if (!var6.liiiIIllIl() && var6.iIlIlllllill(subtitle, title, enabled)) {
               var6.IilliliilIIi();
               return;
            }
         }

         long var13 = this.illlilIlIl.stream().filter((t) -> !t.liiiIIllIl()).count();
         if (var13 >= 4L) {
            this.illlilIlIl.stream().filter((t) -> !t.liiiIIllIl()).findFirst().ifPresent(liiiiiiiiiiiii::IliIlllilIi);
         }

         this.illlilIlIl.add(new liiiiiiiiiiiii(subtitle, title, enabled));
      }
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -1920065862405849352L ^ Long.rotateLeft(-596802025008906318L, 55) ^ -6506469581537713662L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -3910582446953449941L ^ Long.rotateLeft(-5529495919113423517L, 53) ^ 378615312587502367L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 2378387986335993344L ^ Long.rotateLeft(2021779446914693432L, 38) ^ -5923753572924187435L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 7647595825327316881L ^ Long.rotateLeft(8326117062051043951L, 16) ^ 3284571335561042L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -696800394957671863L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 1749234519332168768L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2437621442060473579L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3475388938763743041L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -511465246903949557L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -551740303684725535L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IiIlliIliiIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIlllIlliIll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Illlllllilll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Iilllilliill<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIillIiliIil<invokedynamic>());
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
}
