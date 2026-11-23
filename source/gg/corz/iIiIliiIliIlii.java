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

public class iIiIliiIliIlii extends ilIllIiIll implements liliIiliiliIil, lilIliiiilIlii, IIiIliilIiIlii {
   public static final float IIiiiIiIIl = 1.15F;
   private final iiIiiilIIliiil lliiiIiIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iIIliiiIlIliii IlIIIliIIl;
   private final iiIiiilIIliiil iliiiIiIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil iIIIIliIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil IiiiiIiIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil lIIIIliIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final lliliIIiililiIIi IliiiIiIIl = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   public static final float liliiIiIIl = 0.75F;
   private final iiIiiilIIliiil liiiiIiIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil IIIIIliIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final lliliIIiililiIIi lIiiiIiIIl = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   public static final float iiliiIiIIl = 1.0F;
   private final iilliIlIIiliIl iIiiiIiIIl = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 16, 8, 32, 1);
   private final iiIiiilIIliiil iiiiiIiIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + '\uee4d') + 24441) + '칡') + '躧') >>> 9 | (char)((char)((char)((char)((char)(-var4[var5]) + '\uee4d') + 24441) + '칡') + '躧') << 7) ^ var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + '\uee4d') + 24441) + '칡') + '躧') >>> 9 | (char)((char)((char)((char)((char)(-var4[var5]) + '\uee4d') + 24441) + '칡') + '躧') << 7) ^ var5) << 15))) - var5) + '踧'))))) ^ '뵢') >>> 10 | (char)((char)(~((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + '\uee4d') + 24441) + '칡') + '躧') >>> 9 | (char)((char)((char)((char)((char)(-var4[var5]) + '\uee4d') + 24441) + '칡') + '躧') << 7) ^ var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + '\uee4d') + 24441) + '칡') + '躧') >>> 9 | (char)((char)((char)((char)((char)(-var4[var5]) + '\uee4d') + 24441) + '칡') + '躧') << 7) ^ var5) << 15))) - var5) + '踧'))))) ^ '뵢') << 6) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void llIIlilIIl(IiIiIlIiliIiIlIi e) {
      this.IlIIIliIIl.lIiiIiIlilli(e);
   }

   public iIiIliiIliIlii() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.lIllIIIiiIllIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lIiiiIiIIl, this.iIiiiIiIIl, this.IliiiIiIIl, this.lliiiIiIIl, this.iliiiIiIIl, this.IiiiiIiIIl, this.liiiiIiIIl, this.iiiiiIiIIl, this.IIIIIliIIl, this.lIIIIliIIl, this.iIIIIliIIl});
      this.IlIIIliIIl = new iIIliiiIlIliii(this);
   }

   protected void IiIIlliIIl(IliIliIllliIliIl e) {
      this.IlIIIliIIl.iliIiiliiiii(e);
   }

   protected void illIlIilIl(iilIIlilIIiIIlil e) {
      this.IlIIIliIIl.Illlllllilll(e);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + '캷') ^ var5) + var5) - var5))) ^ '땎') ^ var5) - '쨗') ^ 28833) - 5822) >>> 2 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + '캷') ^ var5) + var5) - var5))) ^ '땎') ^ var5) - '쨗') ^ 28833) - 5822) << 14) - 10627) - 28361));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public llilIlIlililIlIl IIllllIlll() {
      return new llilIlIlililIlIl(IlIIIlilllIIIlil.IliIlllilIi(this.lIiiiIiIIl.Iilllilliill()), (double)this.iIiiiIiIIl.Iilllilliill(), lllllillll(this.IliiiIiIIl.Iilllilliill()), this.lliiiIiIIl.Iilllilliill(), this.iliiiIiIIl.Iilllilliill(), this.IiiiiIiIIl.Iilllilliill(), this.liiiiIiIIl.Iilllilliill(), this.iiiiiIiIIl.Iilllilliill(), this.IIIIIliIIl.Iilllilliill(), this.lIIIIliIIl.Iilllilliill(), this.iIIIIliIIl.Iilllilliill());
   }

   protected void IllIllllIl(IiiiIIIlliiiIIIl e) {
      this.IlIIIliIIl.IIlllIlliIll(e);
   }

   public boolean lIIlliIIll() {
      return this.IliIlllilIi() && this.IlIIIliIIl.Ililllililil();
   }

   public static void iilllIIill(double dx, double dy) {
   }

   public static boolean Iillllilll() {
      ilIllIiIll var0 = llilIllililIll.iliIiiliiiii(iIiIliiIliIlii.class);
      boolean var10000;
      if (var0 instanceof iIiIliiIliIlii var1) {
         if (var1.IliIlllilIi() && var1.IlIIIliIIl.IIIilIIiiIIi()) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   protected void Illillliilli() {
      this.IlIIIliIIl.IliIlllilIi();
   }

   protected void lilIliilIl(IiiIlllliiIlll e) {
      this.IlIIIliIIl.IiIlliIliiIl(e);
   }

   protected void iIIIlIlIIl() {
      this.IlIIIliIIl.IilliliilIIi();
   }

   public IlillIIillillIIi liIlliiIll() {
      if (!this.IliIlllilIi()) {
         return IlillIIillillIIi.lIiIIIiiil;
      } else {
         IlillIIillillIIi var1 = this.IlIIIliIIl.IlIillIiilIi();
         return var1 == null ? IlillIIillillIIi.lIiIIIiiil : var1;
      }
   }

   protected void Iilililiiili() {
      this.IlIIIliIIl.liiiIIllIl();
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '뚰') ^ '\ue546') - var5) + var5) ^ var5) - var5) + '艝'))) - '녯'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean ilIllIiIll() {
      return this.IliIlllilIi() && this.IlIIIliIIl.Iiilliiliiil();
   }

   public void iIlllIllll(class_243 explosion, boolean velocity) {
      if (this.IliIlllilIi()) {
         this.IlIIIliIIl.IIillIiliIil(explosion, velocity);
      }

   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 7138510673600152454L ^ Long.rotateLeft(-1540961039069693787L, 49) ^ 8949475772664190496L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -3737307634377884150L ^ Long.rotateLeft(4313168058373648368L, 28) ^ 2251310713922831810L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -3764888932613719888L ^ Long.rotateLeft(-1126494702694248615L, 42) ^ -4041423120550515359L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -2913170753573949219L ^ Long.rotateLeft(1379245813125983845L, 9) ^ 7063900400010556770L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8571160003497684722L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2319351552721225686L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7203810480607320960L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5023588822516965788L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -1721389509939612954L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 10921968194278354L;
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

   public boolean IlIllllIll() {
      return this.IliIlllilIi() && this.IlIIIliIIl.Ililllililil();
   }

   protected void IIiilIiiiIii(illlllIillll e) {
      this.IlIIIliIIl.IIIllIIliIIl(e);
   }

   public static float lllllillll(String value) {
      if (IliIlllilIi<invokedynamic>().equalsIgnoreCase(value)) {
         return 0.75F;
      } else {
         return IliIlllilIi<invokedynamic>().equalsIgnoreCase(value) ? 1.15F : 1.0F;
      }
   }

   public boolean iiiIlIIIll() {
      return this.IliIlllilIi() && this.IlIIIliIIl.Ililllililil();
   }

   protected void iiIIlIIlIl(iIIlIlIlIlIlIlIl e) {
      this.IlIIIliIIl.IlIlllIlilIl(e);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) + var5) + var5))) - var5) ^ var5) - 348) - 1854) - var5))) << 14 | (char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) + var5) + var5))) - var5) ^ var5) - 348) - 1854) - var5))) >>> 2))))) + var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void lIlIliIlIl(IIilllilIillli e) {
      this.IlIIIliIIl.Iilllilliill(e);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) - var5) + var5) >>> 10 | (char)((char)((char)(~((char)(var4[var5] + var5))) - var5) + var5) << 6) ^ '\udd0e') + var5))) ^ var5) ^ 24395) << 12 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) - var5) + var5) >>> 10 | (char)((char)((char)(~((char)(var4[var5] + var5))) - var5) + var5) << 6) ^ '\udd0e') + var5))) ^ var5) ^ 24395) >>> 4) ^ '\ue410') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
