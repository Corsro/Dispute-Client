package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.joml.Matrix4f;

public final class lIiiiIiiIiiiIi {
   public static final float llIiIliiiilIiIliii = 1.0F;
   public static final float ililIliiiIiilIliii = 21.55F;
   public static final float IIIiIliiilIIiIliii = 2.403F;
   public static final String[] lIilIliiiiIilIliii = new String[]{IlIlllIlilIl<invokedynamic>(), IlIlllIlilIl<invokedynamic>(), IlIlllIlilIl<invokedynamic>()};
   public static final float liilIliiiiiilIliii = -11.802F;
   public static final float IiIiIliiiliIiIliii = -1.0F;
   public static final float iIIiIliiiIlIiIliii = 8.0F;
   public static final String[] IlilIliiillilIliii = new String[]{IlIlllIlilIl<invokedynamic>(), IlIlllIlilIl<invokedynamic>(), IlIlllIlilIl<invokedynamic>()};

   public static Matrix4f[] IIIllIIliIIl(lIIiilIliIIiilIl model) {
      Matrix4f[] var1 = iliIiiliiiii(model);
      Matrix4f var2 = iIlIlllllill();
      Matrix4f[] var3 = new Matrix4f[lIilIliiiiIilIliii.length];

      for(int var4 = 0; var4 < var3.length; ++var4) {
         int var5 = IilliliilIIi(model, var4);
         var3[var4] = var5 < 0 ? null : (new Matrix4f(var1[var5])).invert().mul(var2);
      }

      return var3;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) << 7 | (char)(var4[var5] - var5) >>> 9) + 20495) ^ var5))) - var5))) ^ 1503) - 832) << 12 | (char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) << 7 | (char)(var4[var5] - var5) >>> 9) + 20495) ^ var5))) - var5))) ^ 1503) - 832) >>> 4))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static Matrix4f iIlIlllllill() {
      return liiiIIllIl().invert();
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) + var5) + var5)) + '\udd88'))) << 11 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) + var5) + var5)) + '\udd88'))) >>> 5))) ^ '薾'))) << 15 | (char)(-((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) + var5) + var5)) + '\udd88'))) << 11 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) + var5) + var5)) + '\udd88'))) >>> 5))) ^ '薾'))) >>> 1))) ^ var5) + '龎') ^ '车'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static Matrix4f[] iliIiiliiiii(lIIiilIliIIiilIl model) {
      Matrix4f[] var1 = model.Iilllilliill();
      model.IIillIiliIil(model.Illlllllilll(), var1);
      return var1;
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2363049121195508474L ^ Long.rotateLeft(8008797485021518085L, 44) ^ -1416086091512059365L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -3197993341555835330L ^ Long.rotateLeft(-8933623771294473958L, 46) ^ 2523351801046877600L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 293401294803278761L ^ Long.rotateLeft(4735960769844117153L, 52) ^ -8876738154779796190L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -287059001133209844L ^ Long.rotateLeft(7931069774222485793L, 11) ^ -908647583675543707L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8978457296716138965L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5330189158771894397L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2761706218825391887L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -466199519894344176L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -5335315777792837973L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8722316354234201669L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Iilllilliill<invokedynamic>());
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

   private lIiiiIiiIiiiIi() {
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '\uf755') >>> 1 | (char)(var4[var5] + '\uf755') << 15) + var5) - 20046) - 16270) << 11 | (char)((char)((char)((char)((char)(var4[var5] + '\uf755') >>> 1 | (char)(var4[var5] + '\uf755') << 15) + var5) - 20046) - 16270) >>> 5) + var5) - '\uf6c1') >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '\uf755') >>> 1 | (char)(var4[var5] + '\uf755') << 15) + var5) - 20046) - 16270) << 11 | (char)((char)((char)((char)((char)(var4[var5] + '\uf755') >>> 1 | (char)(var4[var5] + '\uf755') << 15) + var5) - 20046) - 16270) >>> 5) + var5) - '\uf6c1') << 8) - '鴬'))) << 14 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '\uf755') >>> 1 | (char)(var4[var5] + '\uf755') << 15) + var5) - 20046) - 16270) << 11 | (char)((char)((char)((char)((char)(var4[var5] + '\uf755') >>> 1 | (char)(var4[var5] + '\uf755') << 15) + var5) - 20046) - 16270) >>> 5) + var5) - '\uf6c1') >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '\uf755') >>> 1 | (char)(var4[var5] + '\uf755') << 15) + var5) - 20046) - 16270) << 11 | (char)((char)((char)((char)((char)(var4[var5] + '\uf755') >>> 1 | (char)(var4[var5] + '\uf755') << 15) + var5) - 20046) - 16270) >>> 5) + var5) - '\uf6c1') << 8) - '鴬'))) >>> 2) + '뺘'))) - 32764) + 5007))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static int[] lIiiIiIlilli(lIIiilIliIIiilIl part, int model) {
      int var2 = IilliliilIIi(part, model);
      ArrayList var3 = new ArrayList();
      if (var2 >= 0) {
         for(int var4 = 0; var4 < part.liiililIll.length; ++var4) {
            for(int var5 = var4; var5 >= 0; var5 = part.liiililIll[var5].liiiIIllIl()) {
               if (var5 == var2) {
                  var3.add(var4);
                  break;
               }
            }
         }
      }

      int[] var6 = new int[var3.size()];

      for(int var7 = 0; var7 < var6.length; ++var7) {
         var6[var7] = (Integer)var3.get(var7);
      }

      return var6;
   }

   public static Matrix4f liiiIIllIl() {
      return (new Matrix4f()).translate(-11.802F, 2.403F, 8.0F).scale(21.55F).mul(IliIlllilIi());
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - 32273) - var5) ^ var5) << 13 | (char)((char)((char)(var4[var5] - 32273) - var5) ^ var5) >>> 3))) + '릑') ^ var5) >>> 1 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - 32273) - var5) ^ var5) << 13 | (char)((char)((char)(var4[var5] - 32273) - var5) ^ var5) >>> 3))) + '릑') ^ var5) << 15) + '\ue7de') - var5) ^ '퉌') ^ var5))) << 2 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - 32273) - var5) ^ var5) << 13 | (char)((char)((char)(var4[var5] - 32273) - var5) ^ var5) >>> 3))) + '릑') ^ var5) >>> 1 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - 32273) - var5) ^ var5) << 13 | (char)((char)((char)(var4[var5] - 32273) - var5) ^ var5) >>> 3))) + '릑') ^ var5) << 15) + '\ue7de') - var5) ^ '퉌') ^ var5))) >>> 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)(-var4[var5]) - 15824) << 15 | (char)((char)(-var4[var5]) - 15824) >>> 1))) ^ '믈') >>> 11 | (char)((char)(~((char)((char)((char)(-var4[var5]) - 15824) << 15 | (char)((char)(-var4[var5]) - 15824) >>> 1))) ^ '믈') << 5))) + '\uf802') ^ 27828) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static Matrix4f IliIlllilIi() {
      float var0 = -1.0F;
      return new Matrix4f(0.0F, 0.0F, var0, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
   }

   public static int IilliliilIIi(lIIiilIliIIiilIl model, int part) {
      return part >= 0 && part < lIilIliiiiIilIliii.length ? model.IiIlliIliiIl(lIilIliiiiIilIliii[part]) : -1;
   }
}
