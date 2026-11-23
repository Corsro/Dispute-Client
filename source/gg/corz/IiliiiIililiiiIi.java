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
import net.minecraft.class_1297;

public class IiliiiIililiiiIi extends ilIllIiIll implements liIIIiiiiIIIii, ilIIIiiIiIIIii {
   private final lliliIIiililiIIi lIIliIIlIi;
   private final iiIiiilIIliiil IlIliIIlIi;
   private final iiIiiilIIliiil llIliIIlIi;
   private final iiIiiilIIliiil iIIliIIlIi;
   private final iiIiiilIIliiil iiiIiIIlIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil IIIliIIlIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 8128) ^ 10253) ^ var5) - var5)))) ^ '\ue505'))) - var5) << 7 | (char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 8128) ^ 10253) ^ var5) - var5)))) ^ '\ue505'))) - var5) >>> 9) + '프') >>> 10 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 8128) ^ 10253) ^ var5) - var5)))) ^ '\ue505'))) - var5) << 7 | (char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 8128) ^ 10253) ^ var5) - var5)))) ^ '\ue505'))) - var5) >>> 9) + '프') << 6) + '\uf3e8'))))) - 21043))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iilllIllIIillIll IIllllIlll(Object presser, class_1297 target) {
      return iIIiIlIiIlIiIlIi.liiiIIllIl(presser, target);
   }

   protected void iIIIlIlIIl() {
      iIIiIlIiIlIiIlIi.IliIlllilIi();
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1991629715463578798L ^ Long.rotateLeft(4717707574323229011L, 44) ^ -8516891013816633912L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2903182987474958852L ^ Long.rotateLeft(6087268368085591922L, 23) ^ -5026780445653173751L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6768379024204332022L ^ Long.rotateLeft(159360442995809071L, 4) ^ -6529434989360316734L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -9040133839530662087L ^ Long.rotateLeft(-1864908174168182842L, 9) ^ 520620376254654826L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3178515392667623208L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -6849747171552251693L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5924598616694542574L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3082802965254866874L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4983721253282919990L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6199176770912387529L;
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

   protected void Iilililiiili() {
      iIIiIlIiIlIiIlIi.Illlllllilll(this);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 18372) - '뼺') << 2 | (char)((char)((char)(var4[var5] ^ var5) ^ 18372) - '뼺') >>> 14) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ 18372) - '뼺') << 2 | (char)((char)((char)(var4[var5] ^ var5) ^ 18372) - '뼺') >>> 14) << 12) - var5) + var5))) - var5) + var5) + '谙') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int liIlliiIll() {
      return ~(1757716738 ^ -101) + 11 ^ 1757716757;
   }

   public iiIIIlIiIIlIIlIi lIIlliIIll() {
      return new iiIIIlIiIIlIIlIi(this.iiiIiIIlIi.Iilllilliill(), this.IIIliIIlIi.Iilllilliill(), Double.longBitsToDouble(5408271536297371457L ^ 8427935086449289025L), lIiiilliIiiill.iIlIlllllill(this.lIIliIIlIi.Iilllilliill()), this.iIIliIIlIi.Iilllilliill(), this.IlIliIIlIi.Iilllilliill(), this.llIliIIlIi.Iilllilliill(), true);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) << 13 | (char)(-var4[var5]) >>> 3) >>> 1 | (char)((char)(-var4[var5]) << 13 | (char)(-var4[var5]) >>> 3) << 15) ^ var5))) - 11271) << 5 | (char)((char)(~((char)((char)((char)((char)(-var4[var5]) << 13 | (char)(-var4[var5]) >>> 3) >>> 1 | (char)((char)(-var4[var5]) << 13 | (char)(-var4[var5]) >>> 3) << 15) ^ var5))) - 11271) >>> 11) << 10 | (char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) << 13 | (char)(-var4[var5]) >>> 3) >>> 1 | (char)((char)(-var4[var5]) << 13 | (char)(-var4[var5]) >>> 3) << 15) ^ var5))) - 11271) << 5 | (char)((char)(~((char)((char)((char)((char)(-var4[var5]) << 13 | (char)(-var4[var5]) >>> 3) >>> 1 | (char)((char)(-var4[var5]) << 13 | (char)(-var4[var5]) >>> 3) << 15) ^ var5))) - 11271) >>> 11) >>> 6) ^ var5) + '锽'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) - '铂') ^ var5))) ^ var5) + '诨')))) << 14 | (char)((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) - '铂') ^ var5))) ^ var5) + '诨')))) >>> 2) ^ '\uec7a') - var5) << 10 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) - '铂') ^ var5))) ^ var5) + '诨')))) << 14 | (char)((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) - '铂') ^ var5))) ^ var5) + '诨')))) >>> 2) ^ '\uec7a') - var5) >>> 6))) + var5) + var5))))) ^ 27779) ^ 16331));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int iiiIlIIIll() {
      return 1;
   }

   public IiliiiIililiiiIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.lIIliIIlIi = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), lIiiilliIiiill.IIIilllIilIIilllIi.IliIlllilIi(), lIiiilliIiiill.liiiIIllIl());
      this.iIIliIIlIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
      this.IlIliIIlIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
      this.llIliIIlIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
      IilliIllilliIl[] var10001 = new IilliIllilliIl[(-((-4851143 << 9 | -4851143 >>> 23) ^ -27) << 7 | -((-4851143 << 9 | -4851143 >>> 23) ^ -27) >>> 25) ^ -96865485];
      var10001[0] = this.iiiIiIIlIi;
      var10001[1] = this.IIIliIIlIi;
      var10001[2] = this.lIIliIIlIi;
      var10001[3] = this.iIIliIIlIi;
      var10001[4] = this.IlIliIIlIi;
      var10001[5] = this.llIliIIlIi;
      this.IlIlllIlilIl(var10001);
   }

   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      iIIiIlIiIlIiIlIi.IIlllIlliIll(event);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + var5) - var5) + 29049) + 14040) >>> 9 | (char)((char)((char)((char)((char)(var4[var5] - var5) + var5) - var5) + 29049) + 14040) << 7) - 7370))) + 5945) ^ var5) - var5) - 26007));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
