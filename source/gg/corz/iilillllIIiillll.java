package gg.corz;

import com.corz.client.CorzClient;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import org.joml.Matrix4f;

public final class iilillllIIiillll {
   private final int[] IIilliIill = new int[~-1055185798 + -73 ^ 1055185468];
   static final float iIllliIill = 2.2F;
   static final float lIllliIill = 0.11F;
   static final int illlliIill = 256;
   private final lllIiiillIii IillliIill = new lllIiiillIii();
   static final double llllliIill = 1.35;
   private final double[] iillliIill = new double[~(-1561289569 + -87) ^ -35 ^ -1561288854];
   static final float IIllliIill = 40.0F;
   private boolean iIilliIill;
   private final class_4587 lillliIill = new class_4587();
   static final float IlllliIill = 1.0F;

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)(-((char)((char)(-((char)((char)(~((char)(~((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] + '갍') + '큷'))) << 12 | (char)(-((char)((char)(var4[var5] + '갍') + '큷'))) >>> 4) - 27861))) << 1 | (char)(-((char)((char)((char)(-((char)((char)(var4[var5] + '갍') + '큷'))) << 12 | (char)(-((char)((char)(var4[var5] + '갍') + '큷'))) >>> 4) - 27861))) >>> 15) >>> 4 | (char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] + '갍') + '큷'))) << 12 | (char)(-((char)((char)(var4[var5] + '갍') + '큷'))) >>> 4) - 27861))) << 1 | (char)(-((char)((char)((char)(-((char)((char)(var4[var5] + '갍') + '큷'))) << 12 | (char)(-((char)((char)(var4[var5] + '갍') + '큷'))) >>> 4) - 27861))) >>> 15) << 12))))) >>> 12 | (char)(~((char)(~((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] + '갍') + '큷'))) << 12 | (char)(-((char)((char)(var4[var5] + '갍') + '큷'))) >>> 4) - 27861))) << 1 | (char)(-((char)((char)((char)(-((char)((char)(var4[var5] + '갍') + '큷'))) << 12 | (char)(-((char)((char)(var4[var5] + '갍') + '큷'))) >>> 4) - 27861))) >>> 15) >>> 4 | (char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] + '갍') + '큷'))) << 12 | (char)(-((char)((char)(var4[var5] + '갍') + '큷'))) >>> 4) - 27861))) << 1 | (char)(-((char)((char)((char)(-((char)((char)(var4[var5] + '갍') + '큷'))) << 12 | (char)(-((char)((char)(var4[var5] + '갍') + '큷'))) >>> 4) - 27861))) >>> 15) << 12))))) << 4))) - var5))) - var5) >>> 11 | (char)((char)(-((char)((char)(-((char)((char)(~((char)(~((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] + '갍') + '큷'))) << 12 | (char)(-((char)((char)(var4[var5] + '갍') + '큷'))) >>> 4) - 27861))) << 1 | (char)(-((char)((char)((char)(-((char)((char)(var4[var5] + '갍') + '큷'))) << 12 | (char)(-((char)((char)(var4[var5] + '갍') + '큷'))) >>> 4) - 27861))) >>> 15) >>> 4 | (char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] + '갍') + '큷'))) << 12 | (char)(-((char)((char)(var4[var5] + '갍') + '큷'))) >>> 4) - 27861))) << 1 | (char)(-((char)((char)((char)(-((char)((char)(var4[var5] + '갍') + '큷'))) << 12 | (char)(-((char)((char)(var4[var5] + '갍') + '큷'))) >>> 4) - 27861))) >>> 15) << 12))))) >>> 12 | (char)(~((char)(~((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] + '갍') + '큷'))) << 12 | (char)(-((char)((char)(var4[var5] + '갍') + '큷'))) >>> 4) - 27861))) << 1 | (char)(-((char)((char)((char)(-((char)((char)(var4[var5] + '갍') + '큷'))) << 12 | (char)(-((char)((char)(var4[var5] + '갍') + '큷'))) >>> 4) - 27861))) >>> 15) >>> 4 | (char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] + '갍') + '큷'))) << 12 | (char)(-((char)((char)(var4[var5] + '갍') + '큷'))) >>> 4) - 27861))) << 1 | (char)(-((char)((char)((char)(-((char)((char)(var4[var5] + '갍') + '큷'))) << 12 | (char)(-((char)((char)(var4[var5] + '갍') + '큷'))) >>> 4) - 27861))) >>> 15) << 12))))) << 4))) - var5))) - var5) << 5) - 20980))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 212760149230939669L ^ Long.rotateLeft(4614231859823566871L, 55) ^ -8121011506929894324L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 4548600281435428430L ^ Long.rotateLeft(4972882286339272983L, 20) ^ 6106310475279918178L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 4396549492582371608L ^ Long.rotateLeft(-305903894671549623L, 28) ^ -1530994584829656544L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 266536929684483149L ^ Long.rotateLeft(4675272739161495906L, 48) ^ 1994888748727073470L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1736383070096039693L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5494249820026726514L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4086356908776932536L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -1740147260084773230L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 1199470789538945771L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -3611256621761131097L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iliIiiliiiii<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIIllIIliIIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IlIlllIlilIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IiIlliIliiIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIlllIlliIll<invokedynamic>());
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
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) + var5) ^ var5))) << 1 | (char)(~((char)((char)((char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) + var5) ^ var5))) >>> 15) - var5) >>> 8 | (char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) + var5) ^ var5))) << 1 | (char)(~((char)((char)((char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) + var5) ^ var5))) >>> 15) - var5) << 8))) ^ var5) >>> 11 | (char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) + var5) ^ var5))) << 1 | (char)(~((char)((char)((char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) + var5) ^ var5))) >>> 15) - var5) >>> 8 | (char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) + var5) ^ var5))) << 1 | (char)(~((char)((char)((char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) + var5) ^ var5))) >>> 15) - var5) << 8))) ^ var5) << 5) ^ 1247) - 806) - var5) << 3 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) + var5) ^ var5))) << 1 | (char)(~((char)((char)((char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) + var5) ^ var5))) >>> 15) - var5) >>> 8 | (char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) + var5) ^ var5))) << 1 | (char)(~((char)((char)((char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) + var5) ^ var5))) >>> 15) - var5) << 8))) ^ var5) >>> 11 | (char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) + var5) ^ var5))) << 1 | (char)(~((char)((char)((char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) + var5) ^ var5))) >>> 15) - var5) >>> 8 | (char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) + var5) ^ var5))) << 1 | (char)(~((char)((char)((char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) + var5) ^ var5))) >>> 15) - var5) << 8))) ^ var5) << 5) ^ 1247) - 806) - var5) >>> 13) + var5) ^ '햆') + var5) - '\uec3d'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) << 7 | (char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) >>> 9) + 29428) >>> 5 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) << 7 | (char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) >>> 9) + 29428) << 11) << 4 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) << 7 | (char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) >>> 9) + 29428) >>> 5 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) << 7 | (char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) >>> 9) + 29428) << 11) >>> 12) - var5))) ^ '\uea26') >>> 14 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) << 7 | (char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) >>> 9) + 29428) >>> 5 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) << 7 | (char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) >>> 9) + 29428) << 11) << 4 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) << 7 | (char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) >>> 9) + 29428) >>> 5 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) << 7 | (char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) >>> 9) + 29428) << 11) >>> 12) - var5))) ^ '\uea26') << 2))) + '葆') + 4095) ^ var5) + var5) >>> 12 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) << 7 | (char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) >>> 9) + 29428) >>> 5 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) << 7 | (char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) >>> 9) + 29428) << 11) << 4 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) << 7 | (char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) >>> 9) + 29428) >>> 5 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) << 7 | (char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) >>> 9) + 29428) << 11) >>> 12) - var5))) ^ '\uea26') >>> 14 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) << 7 | (char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) >>> 9) + 29428) >>> 5 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) << 7 | (char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) >>> 9) + 29428) << 11) << 4 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) << 7 | (char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) >>> 9) + 29428) >>> 5 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) << 7 | (char)((char)((char)((char)(var4[var5] ^ 7159) ^ var5) << 4 | (char)((char)(var4[var5] ^ 7159) ^ var5) >>> 12) + 198) >>> 9) + 29428) << 11) >>> 12) - var5))) ^ '\uea26') << 2))) + '葆') + 4095) ^ var5) + var5) << 4))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void liiiIIllIl(class_2338 t) {
      class_310 var2 = class_310.method_1551();
      class_243 var3 = var2.field_1773.method_19418().method_71156();
      double var4 = (double)t.method_10263() + (double)0.5F;
      double var6 = (double)t.method_10264() + (double)1.0F;
      double var8 = (double)t.method_10260() + (double)0.5F;
      double var10 = var4 - var3.field_1352;
      double var12 = var8 - var3.field_1350;
      double var14 = Math.sqrt(var10 * var10 + var12 * var12);
      if (!(var14 < (double)2.0F)) {
         Matrix4f var16 = iIiiIIilIliiIIil.IIillIiliIil();
         class_4588 var17 = iIiiIIilIliiIIil.IilliliilIIi();
         int var18 = IlIIilIlllIIilIl.lliiIlliIl & 16777215;
         float var19 = 0.8F + 0.2F * (float)Math.sin((double)(System.currentTimeMillis() % 10000L) / (double)1000.0F * 2.2);
         float var20 = (float)(var12 / var14);
         float var21 = (float)(-var10 / var14);
         float var22 = 0.11F * (float)class_3532.method_15350(var14 / (double)32.0F, (double)1.0F, (double)5.0F);
         float var23 = iIiiIIilIliiIIil.Ililllililil(var4);
         float var24 = iIiiIIilIliiIIil.IIIilIIiiIIi(var8);
         float var25 = iIiiIIilIliiIIil.Iiilliiliiil(var6);
         float var26 = iIiiIIilIliiIIil.Iiilliiliiil(var6 + (double)40.0F);
         int var27 = iIillliIlillli.IIIilIIiiIIi(var18 | -16777216, 0.55F * var19);
         iIiiIIilIliiIIil.IlIlllIlilIl(var17, var16, var23 + var20 * var22, var25, var24 + var21 * var22, var27, var23 - var20 * var22, var25, var24 - var21 * var22, var27, var23 - var20 * var22, var26, var24 - var21 * var22, var18, var23 + var20 * var22, var26, var24 + var21 * var22, var18);
      }
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10) + var5) ^ 21126) ^ var5) ^ var5) - var5))) >>> 1 | (char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10) + var5) ^ 21126) ^ var5) ^ var5) - var5))) << 15) - 2121) + 26365))) >>> 7 | (char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10) + var5) ^ 21126) ^ var5) ^ var5) - var5))) >>> 1 | (char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10) + var5) ^ 21126) ^ var5) ^ var5) - var5))) << 15) - 2121) + 26365))) << 9))))))) - 15841) - '鸸') << 2 | (char)((char)((char)(-((char)(-((char)(~((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10) + var5) ^ 21126) ^ var5) ^ var5) - var5))) >>> 1 | (char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10) + var5) ^ 21126) ^ var5) ^ var5) - var5))) << 15) - 2121) + 26365))) >>> 7 | (char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10) + var5) ^ 21126) ^ var5) ^ var5) - var5))) >>> 1 | (char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10) + var5) ^ 21126) ^ var5) ^ var5) - var5))) << 15) - 2121) + 26365))) << 9))))))) - 15841) - '鸸') >>> 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IliIlllilIi(float target, boolean pearl, class_2338 route, List<class_2338> show, class_2338 tickDelta, lIIIlliIIIll goal) {
      if (!this.iIilliIill) {
         try {
            IiiIIiilliiIIiil var7 = this.IillliIill.IliIlllilIi();
            var7.IliIlllilIi();
            var7.IlIilillil = pearl;
            var7.iIIilillil = pearl;
            if (route != null) {
               var7.iIlIlllllill(route.method_10263(), route.method_10264(), route.method_10260(), route.method_10263(), route.method_10264(), route.method_10260());
               var7.iliilillil = route;
            }

            if (show != null && !show.isEmpty() && tickDelta != null) {
               var7.Iiiilillil = show;
               var7.liiilillil = tickDelta;
               var7.iiiilillil = true;
            }

            this.IillliIill.liiiIIllIl(pearl, target);
            if (!pearl || route == null) {
               return;
            }

            this.liiiIIllIl(route);
            if (goal != null && goal.iliIiiliiiii() != null) {
               this.iIlIlllllill(goal);
            }
         } catch (Throwable var8) {
            this.iIilliIill = true;
         }

      }
   }

   public void IilliliilIIi(class_332 ctx, class_2338 title, String target, String detail) {
      if (!this.iIilliIill && ctx != null && title != null) {
         class_310 var5 = class_310.method_1551();
         if (var5.field_1724 != null && var5.field_1755 == null) {
            CorzClient.fontManager.iIlIlllllill(this.lillliIill);
            IIIiiIillIIiiIil.IliIlllilIi(this.lillliIill);
            double var6 = (double)var5.method_22683().method_4495();
            int var8 = var5.method_22683().method_4476(IIililillIililil.iiiIlIIIll(var5), var5.method_1573());
            float var9 = (float)((double)var8 / var6);
            boolean var10 = Math.abs(var9 - 1.0F) > 1.0E-4F;
            if (var10) {
               IliiIilliiIi.lIIlllIIliIIlllIIl = (float)Math.round((float)var5.method_22683().method_4486() / var9);
               IliiIilliiIi.IlIlllIIlllIlllIIl = (float)Math.round((float)var5.method_22683().method_4502() / var9);
            }

            try {
               IIlIiIlllIlIiIll var11 = IIlIiIlllIlIiIll.lIiiIiIlilli();
               IIlIiIlllIlIiIll var12 = var11.IIillIiliIil() ? var11 : IIlIiIlllIlIiIll.liiiIIllIl();
               if (var12.IIillIiliIil()) {
                  class_243 var13 = llilllililll.iIlIlllllill(new class_243((double)title.method_10263() + (double)0.5F, (double)title.method_10264() + 1.35, (double)title.method_10260() + (double)0.5F));
                  if (var13 == null || var13.field_1350 <= (double)0.0F || var13.field_1350 >= (double)1.0F) {
                     return;
                  }

                  float var14 = (float)(var13.field_1352 / (double)var9);
                  float var15 = (float)(var13.field_1351 / (double)var9);
                  float var16 = 18.0F;
                  float var17 = 7.0F;
                  float var18 = 11.0F;
                  float var19 = 5.0F;
                  String var20 = lIiiIiIlilli<invokedynamic>();
                  float var21 = var12.Iiilliiliiil(target, var18);
                  float var22 = var12.Iiilliiliiil(var20, var18);
                  float var23 = detail != null && !detail.isEmpty() ? var12.Iiilliiliiil(detail, var18) : 0.0F;
                  float var24 = var17 + var21 + (var23 > 0.0F ? var22 + var23 : 0.0F) + var17;
                  float var25 = var14 - var24 / 2.0F;
                  float var26 = var15 - var16;
                  IIIiiIillIIiiIil.Ililllililil(ctx, var25, var26, var24, var16, var19, -233499369, 620756991);
                  float var27 = var26 + (var16 - var12.IlIillIiilIi(var18)) / 2.0F;
                  var12.IIlilIliiIli(target, var25 + var17, var27, -16777216 | IlIIilIlllIIilIl.lliiIlliIl, var18);
                  if (var23 > 0.0F) {
                     var12.IIlilIliiIli(detail, var25 + var17 + var21 + var22, var27, -6645087, var18);
                  }

                  return;
               }
            } finally {
               if (var10) {
                  IliiIilliiIi.lIIlllIIliIIlllIIl = 0.0F;
                  IliiIilliiIi.IlIlllIIlllIlllIIl = 0.0F;
               }

            }

         }
      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5)) + var5) + var5) ^ 15524) ^ 3255) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5)) + var5) + var5) ^ 15524) ^ 3255) >>> 5) ^ var5))) + '곴'))) + '뵏'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iIlIlllllill(lIIIlliIIIll s) {
      class_310 var2 = class_310.method_1551();
      class_4184 var3 = var2.field_1773.method_19418();
      if (var3 != null) {
         List var4 = s.iliIiiliiiii();
         int var5 = Math.min(256, var4.size());
         if (var5 >= 2) {
            int var6 = -16777216 | IlIIilIlllIIilIl.lliiIlliIl;
            int var7 = IilIIIIililIIIIi.Illlllllilll(var6, -1, 0.55);

            for(int var8 = 0; var8 < var5; ++var8) {
               class_243 var9 = (class_243)var4.get(var8);
               this.iillliIill[var8 * 3] = var9.field_1352;
               this.iillliIill[var8 * 3 + 1] = var9.field_1351;
               this.iillliIill[var8 * 3 + 2] = var9.field_1350;
               float var10 = iIillliIlillli.Ililllililil(Math.min(1.0F, (float)var8 / 6.0F));
               this.IIilliIill[var8] = iIillliIlillli.IIIilIIiiIIi(var7, 0.85F * var10);
            }

            float var11 = Math.max(1.0F, (float)var2.method_22683().method_4506() / 1080.0F);
            IIillllIilll.liiiIIllIl(iIiiIIilIliiIIil.IilliliilIIi(), iIiiIIilIliiIIil.IIillIiliIil(), var3, this.iillliIill, this.IIilliIill, var5, 2.2F * var11, 1.0F, false, false);
         }
      }
   }
}
