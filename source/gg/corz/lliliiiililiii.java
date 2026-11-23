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
import net.minecraft.class_243;

public class lliliiiililiii extends ilIllIiIll implements liliIiliiliIil, lilIliiiilIlii, IIiIliilIiIlii {
   public static final float IliIllIlIl = 1.15F;
   private final liIlIIIliiIlIIIl lIIlllIlIl;
   private final iiIiiilIIliiil liiIllIlIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil iiiIllIlIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iilliIlIIiliIl iliIllIlIl = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 16, 6, 32, 1);
   public static final float lIiIllIlIl = 0.75F;
   private final iiIiiilIIliiil IIIlllIlIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final lliliIIiililiIIi lliIllIlIl = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private final lliliIIiililiIIi IiiIllIlIl = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   public static final float iIiIllIlIl = 1.0F;

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) + var5) ^ '럒') + var5))) - var5) - var5) << 6 | (char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) + var5) ^ '럒') + var5))) - var5) - var5) >>> 10))) >>> 10 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) + var5) ^ '럒') + var5))) - var5) - var5) << 6 | (char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) + var5) ^ '럒') + var5))) - var5) - var5) >>> 10))) << 6) ^ '\udfa8') - 17641) - var5))) - var5) >>> 6 | (char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) + var5) ^ '럒') + var5))) - var5) - var5) << 6 | (char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) + var5) ^ '럒') + var5))) - var5) - var5) >>> 10))) >>> 10 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) + var5) ^ '럒') + var5))) - var5) - var5) << 6 | (char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) + var5) ^ '럒') + var5))) - var5) - var5) >>> 10))) << 6) ^ '\udfa8') - 17641) - var5))) - var5) << 10));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] - 8060) + var5) - var5) >>> 7 | (char)((char)((char)(var4[var5] - 8060) + var5) - var5) << 9))))) + 13185))) - var5) ^ 8987) ^ 16749) ^ var5) << 10 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] - 8060) + var5) - var5) >>> 7 | (char)((char)((char)(var4[var5] - 8060) + var5) - var5) << 9))))) + 13185))) - var5) ^ 8987) ^ 16749) ^ var5) >>> 6) - '\uf1f2') - 'ꆩ'))) << 8 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] - 8060) + var5) - var5) >>> 7 | (char)((char)((char)(var4[var5] - 8060) + var5) - var5) << 9))))) + 13185))) - var5) ^ 8987) ^ 16749) ^ var5) << 10 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] - 8060) + var5) - var5) >>> 7 | (char)((char)((char)(var4[var5] - 8060) + var5) - var5) << 9))))) + 13185))) - var5) ^ 8987) ^ 16749) ^ var5) >>> 6) - '\uf1f2') - 'ꆩ'))) >>> 8) + 31445));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public lliliiiililiii() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.lIllIIIiiIllIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lliIllIlIl, this.iliIllIlIl, this.IiiIllIlIl, this.liiIllIlIl, this.iiiIllIlIl, this.IIIlllIlIl});
      this.lIIlllIlIl = new liIlIIIliiIlIIIl(this);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(~((char)(-var4[var5]))) - var5) ^ var5))) + var5))) + '陫') ^ var5) + var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(~((char)(-var4[var5]))) - var5) ^ var5))) + var5))) + '陫') ^ var5) + var5) + var5))) >>> 13) + var5))))) ^ 31275));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void lIlIliIlIl(IIilllilIillli e) {
      this.lIIlllIlIl.Illlllllilll(e);
   }

   public static float lllllillll(String value) {
      if (IliIlllilIi<invokedynamic>().equalsIgnoreCase(value)) {
         return 0.75F;
      } else {
         return IliIlllilIi<invokedynamic>().equalsIgnoreCase(value) ? 1.15F : 1.0F;
      }
   }

   protected void lilIliilIl(IiiIlllliiIlll e) {
      this.lIIlllIlIl.IlIlllIlilIl(e);
   }

   public static boolean Iillllilll() {
      ilIllIiIll var0 = llilIllililIll.iliIiiliiiii(lliliiiililiii.class);
      boolean var10000;
      if (var0 instanceof lliliiiililiii var1) {
         if (var1.IliIlllilIi() && var1.lIIlllIlIl.Ililllililil()) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(-((char)((char)(~((char)((char)((char)(~((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ var5) ^ 15064) - 'ꋙ') ^ 12810) ^ '\uea90'))))) ^ var5) ^ var5))) - var5) + '\uda3d'))) + '쁲'))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void IiIIlliIIl(IliIliIllliIliIl e) {
      this.lIIlllIlIl.iliIiiliiiii(e);
   }

   protected void iiIIlIIlIl(iIIlIlIlIlIlIlIl e) {
      this.lIIlllIlIl.IIIllIIliIIl(e);
   }

   public iIlIllllIllIllll IIllllIlll() {
      return new iIlIllllIllIllll(IliIlllilIi<invokedynamic>().equalsIgnoreCase(this.lliIllIlIl.Iilllilliill()), this.iliIllIlIl.Iilllilliill(), lllllillll(this.IiiIllIlIl.Iilllilliill()), this.liiIllIlIl.Iilllilliill(), this.iiiIllIlIl.Iilllilliill(), this.IIIlllIlIl.Iilllilliill());
   }

   protected void Illillliilli() {
      this.lIIlllIlIl.liiiIIllIl();
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -4738677326385402903L ^ Long.rotateLeft(8687727244170339486L, 52) ^ -6602087170930427618L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6593711590474357307L ^ Long.rotateLeft(6655705051567156084L, 37) ^ -490842169386413174L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -8597655041337738972L ^ Long.rotateLeft(6738242617803592397L, 52) ^ -7556257808767801904L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 5682030718526660623L ^ Long.rotateLeft(5017500992770583882L, 52) ^ -2740083868409593645L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3987789200091523401L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2155880612806707084L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 371980589150909071L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7486942041014010762L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -5797532793123647460L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -8275860103473405233L;
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

   public boolean iiiIlIIIll() {
      return this.IliIlllilIi() && this.lIIlllIlIl.IIillIiliIil();
   }

   protected void illIlIilIl(iilIIlilIIiIIlil e) {
      this.lIIlllIlIl.IIlllIlliIll(e);
   }

   protected void iIIIlIlIIl() {
      this.lIIlllIlIl.IilliliilIIi();
   }

   protected void IllIllllIl(IiiiIIIlliiiIIIl e) {
      this.lIIlllIlIl.IiIlliIliiIl(e);
   }

   protected void llIIlilIIl(IiIiIlIiliIiIlIi e) {
      this.lIIlllIlIl.lIiiIiIlilli(e);
   }

   public IlillIIillillIIi liIlliiIll() {
      if (!this.IliIlllilIi()) {
         return IlillIIillillIIi.lIiIIIiiil;
      } else {
         IlillIIillillIIi var1 = this.lIIlllIlIl.Iiilliiliiil();
         return var1 == null ? IlillIIillillIIi.lIiIIIiiil : var1;
      }
   }

   protected void Iilililiiili() {
      this.lIIlllIlIl.iIlIlllllill();
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) << 2 | (char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) >>> 14) + var5) << 6 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) << 2 | (char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) >>> 14) + var5) >>> 10) << 11 | (char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) << 2 | (char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) >>> 14) + var5) << 6 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) << 2 | (char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) >>> 14) + var5) >>> 10) >>> 5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) << 2 | (char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) >>> 14) + var5) << 6 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) << 2 | (char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) >>> 14) + var5) >>> 10) << 11 | (char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) << 2 | (char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) >>> 14) + var5) << 6 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) << 2 | (char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) >>> 14) + var5) >>> 10) >>> 5) << 11) ^ var5) + var5))))) << 14 | (char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) << 2 | (char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) >>> 14) + var5) << 6 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) << 2 | (char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) >>> 14) + var5) >>> 10) << 11 | (char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) << 2 | (char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) >>> 14) + var5) << 6 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) << 2 | (char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) >>> 14) + var5) >>> 10) >>> 5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) << 2 | (char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) >>> 14) + var5) << 6 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) << 2 | (char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) >>> 14) + var5) >>> 10) << 11 | (char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) << 2 | (char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) >>> 14) + var5) << 6 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) << 2 | (char)((char)((char)((char)(-((char)(-((char)(~((char)(-var4[var5]))))))) << 7 | (char)(-((char)(-((char)(~((char)(-var4[var5]))))))) >>> 9) ^ var5) - var5) >>> 14) + var5) >>> 10) >>> 5) << 11) ^ var5) + var5))))) >>> 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iIlllIllll(class_243 explosion, boolean velocity) {
      if (this.IliIlllilIi()) {
         this.lIIlllIlIl.Iilllilliill(explosion, velocity);
      }

   }
}
