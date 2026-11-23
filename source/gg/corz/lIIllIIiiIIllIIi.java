package gg.corz;

import java.awt.Color;
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
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import org.joml.Matrix4f;

public class lIIllIIiiIIllIIi extends ilIllIiIll {
   private final iiIiiilIIliiil Illiilliil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private final iiIiiilIIliiil iIliilliil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final IIIIlilllIIIlill lIliilliil = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), Double.longBitsToDouble(4594276787086233533L ^ 9221725404209418173L), Double.longBitsToDouble(4685581856254347628L ^ 78399437454330220L), Double.longBitsToDouble(-1016368338075212288L ^ -5641565155384711680L), (double)1.0F);

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~var4[var5]) + '뙨') << 7 | (char)((char)(~var4[var5]) + '뙨') >>> 9) << 15 | (char)((char)((char)(~var4[var5]) + '뙨') << 7 | (char)((char)(~var4[var5]) + '뙨') >>> 9) >>> 1) << 15 | (char)((char)((char)((char)(~var4[var5]) + '뙨') << 7 | (char)((char)(~var4[var5]) + '뙨') >>> 9) << 15 | (char)((char)((char)(~var4[var5]) + '뙨') << 7 | (char)((char)(~var4[var5]) + '뙨') >>> 9) >>> 1) >>> 1) + 773))) ^ var5) << 15 | (char)((char)(-((char)((char)((char)((char)((char)((char)(~var4[var5]) + '뙨') << 7 | (char)((char)(~var4[var5]) + '뙨') >>> 9) << 15 | (char)((char)((char)(~var4[var5]) + '뙨') << 7 | (char)((char)(~var4[var5]) + '뙨') >>> 9) >>> 1) << 15 | (char)((char)((char)((char)(~var4[var5]) + '뙨') << 7 | (char)((char)(~var4[var5]) + '뙨') >>> 9) << 15 | (char)((char)((char)(~var4[var5]) + '뙨') << 7 | (char)((char)(~var4[var5]) + '뙨') >>> 9) >>> 1) >>> 1) + 773))) ^ var5) >>> 1) ^ var5) - var5) << 7 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~var4[var5]) + '뙨') << 7 | (char)((char)(~var4[var5]) + '뙨') >>> 9) << 15 | (char)((char)((char)(~var4[var5]) + '뙨') << 7 | (char)((char)(~var4[var5]) + '뙨') >>> 9) >>> 1) << 15 | (char)((char)((char)((char)(~var4[var5]) + '뙨') << 7 | (char)((char)(~var4[var5]) + '뙨') >>> 9) << 15 | (char)((char)((char)(~var4[var5]) + '뙨') << 7 | (char)((char)(~var4[var5]) + '뙨') >>> 9) >>> 1) >>> 1) + 773))) ^ var5) << 15 | (char)((char)(-((char)((char)((char)((char)((char)((char)(~var4[var5]) + '뙨') << 7 | (char)((char)(~var4[var5]) + '뙨') >>> 9) << 15 | (char)((char)((char)(~var4[var5]) + '뙨') << 7 | (char)((char)(~var4[var5]) + '뙨') >>> 9) >>> 1) << 15 | (char)((char)((char)((char)(~var4[var5]) + '뙨') << 7 | (char)((char)(~var4[var5]) + '뙨') >>> 9) << 15 | (char)((char)((char)(~var4[var5]) + '뙨') << 7 | (char)((char)(~var4[var5]) + '뙨') >>> 9) >>> 1) >>> 1) + 773))) ^ var5) >>> 1) ^ var5) - var5) >>> 9) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5256549814777067691L ^ Long.rotateLeft(229578105704305057L, 17) ^ -7447728591592353921L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -3877601112520999987L ^ Long.rotateLeft(750161663003387119L, 54) ^ 5663194770533991954L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8312882193882018296L ^ Long.rotateLeft(1192329554988784413L, 56) ^ 5560917192174546934L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 3521384291606307905L ^ Long.rotateLeft(-932972199274680349L, 59) ^ 1937166663544881209L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7883848855843934432L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3520511708784552724L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2928543531279583119L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -1781571162360099150L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6846571743446171742L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 3664660175118618218L;
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

   public lIIllIIiiIIllIIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.llIlIIIiilIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lIliilliil, this.iIliilliil, this.Illiilliil});
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) >>> 5 | (char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) << 11) << 10 | (char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) >>> 5 | (char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) << 11) >>> 6) << 7 | (char)((char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) >>> 5 | (char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) << 11) << 10 | (char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) >>> 5 | (char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) << 11) >>> 6) >>> 9) + var5) - var5) - var5) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) >>> 5 | (char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) << 11) << 10 | (char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) >>> 5 | (char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) << 11) >>> 6) << 7 | (char)((char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) >>> 5 | (char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) << 11) << 10 | (char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) >>> 5 | (char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) << 11) >>> 6) >>> 9) + var5) - var5) - var5) >>> 2) << 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) >>> 5 | (char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) << 11) << 10 | (char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) >>> 5 | (char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) << 11) >>> 6) << 7 | (char)((char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) >>> 5 | (char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) << 11) << 10 | (char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) >>> 5 | (char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) << 11) >>> 6) >>> 9) + var5) - var5) - var5) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) >>> 5 | (char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) << 11) << 10 | (char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) >>> 5 | (char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) << 11) >>> 6) << 7 | (char)((char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) >>> 5 | (char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) << 11) << 10 | (char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) >>> 5 | (char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) << 2 | (char)(~((char)(~((char)((char)((char)(var4[var5] - var5) + '\ue464') - '韑'))))) >>> 14) << 11) >>> 6) >>> 9) + var5) - var5) - var5) >>> 2) >>> 7) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 12 | (char)(var4[var5] + var5) << 4) - 16786) - var5) ^ var5))) + var5))) + 10896) << 6 | (char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 12 | (char)(var4[var5] + var5) << 4) - 16786) - var5) ^ var5))) + var5))) + 10896) >>> 10) - '릎') << 6 | (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 12 | (char)(var4[var5] + var5) << 4) - 16786) - var5) ^ var5))) + var5))) + 10896) << 6 | (char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 12 | (char)(var4[var5] + var5) << 4) - 16786) - var5) ^ var5))) + var5))) + 10896) >>> 10) - '릎') >>> 10) ^ var5) ^ '輣') + 16721) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) + var5))) << 4 | (char)(~((char)((char)(var4[var5] ^ var5) + var5))) >>> 12) - '\ue03c') << 14 | (char)((char)((char)(~((char)((char)(var4[var5] ^ var5) + var5))) << 4 | (char)(~((char)((char)(var4[var5] ^ var5) + var5))) >>> 12) - '\ue03c') >>> 2) + var5) >>> 6 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) + var5))) << 4 | (char)(~((char)((char)(var4[var5] ^ var5) + var5))) >>> 12) - '\ue03c') << 14 | (char)((char)((char)(~((char)((char)(var4[var5] ^ var5) + var5))) << 4 | (char)(~((char)((char)(var4[var5] ^ var5) + var5))) >>> 12) - '\ue03c') >>> 2) + var5) << 10) - var5) + var5) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) + var5))) << 4 | (char)(~((char)((char)(var4[var5] ^ var5) + var5))) >>> 12) - '\ue03c') << 14 | (char)((char)((char)(~((char)((char)(var4[var5] ^ var5) + var5))) << 4 | (char)(~((char)((char)(var4[var5] ^ var5) + var5))) >>> 12) - '\ue03c') >>> 2) + var5) >>> 6 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) + var5))) << 4 | (char)(~((char)((char)(var4[var5] ^ var5) + var5))) >>> 12) - '\ue03c') << 14 | (char)((char)((char)(~((char)((char)(var4[var5] ^ var5) + var5))) << 4 | (char)(~((char)((char)(var4[var5] ^ var5) + var5))) >>> 12) - '\ue03c') >>> 2) + var5) << 10) - var5) + var5) << 8) + '蟙')) - var5));
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
         var4[var5] = (char)((char)(-((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ '핟') << 10 | (char)(var4[var5] ^ '핟') >>> 6) ^ '\uddfa') + var5))) + '꯶') + 25614) - var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IIiilIiiiIii(illlllIillll event) {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         class_4184 var2 = Iiiilllliiilll.field_1773.method_19418();
         if (var2 != null) {
            class_243 var3 = var2.method_71156();
            class_243 var4 = Iiiilllliiilll.field_1724.method_33571();
            double var5 = this.lIliilliil.Iilllilliill() * this.lIliilliil.Iilllilliill();
            float var7 = event.liiiiIIiiiiiiIIi;
            event.IliiiIIilliiiIIi.method_22903();
            event.IliiiIIilliiiIIi.method_22904(-var3.field_1352, -var3.field_1351, -var3.field_1350);
            Matrix4f var8 = event.IliiiIIilliiiIIi.method_23760().method_23761();
            boolean var9 = false;

            for(class_1297 var11 : Iiiilllliiilll.field_1687.method_18112()) {
               if ((var11 != Iiiilllliiilll.field_1724 || iIIlIllIlIlIll.IlIlllIlilIl()) && var11 instanceof class_1309) {
                  class_1309 var12 = (class_1309)var11;
                  if (var12.method_5805() && (!this.iIliilliil.Iilllilliill() || var11 instanceof class_1657) && !(var4.method_1025(var12.method_33571()) > var5)) {
                     float var13 = var12.method_6063() <= 0.0F ? 1.0F : class_3532.method_15363(var12.method_6032() / var12.method_6063(), 0.0F, 1.0F);
                     Color var14 = Color.getHSBColor(var13 * 0.333F, 1.0F, 1.0F);
                     int var15 = -16777216 | var14.getRGB() & 16777215;
                     class_243 var16 = var12.method_30950(var7);
                     float var17 = var12.method_17681() / 2.0F;
                     float var18 = var12.method_17682();
                     float var19 = (float)(var16.field_1352 - (double)var17);
                     float var20 = (float)var16.field_1351;
                     float var21 = (float)(var16.field_1350 - (double)var17);
                     float var22 = (float)(var16.field_1352 + (double)var17);
                     float var23 = (float)(var16.field_1351 + (double)var18);
                     float var24 = (float)(var16.field_1350 + (double)var17);
                     if (this.Illiilliil.Iilllilliill()) {
                        iIiiIIilIliiIIil.IIlilIliiIli(var8, var19, var20, var21, var22, var23, var24, (float)var14.getRed() / 255.0F, (float)var14.getGreen() / 255.0F, (float)var14.getBlue() / 255.0F, 0.25F);
                     }

                     iIiiIIilIliiIIil.iIIIlIlIIl(var8, var19, var20, var21, var22, var23, var24, var15, 1.5F);
                     var9 = true;
                  }
               }
            }

            event.IliiiIIilliiiIIi.method_22909();
            if (var9) {
               iIiiIIilIliiIIil.IiIiliIiiiIi();
            }

         }
      }
   }
}
