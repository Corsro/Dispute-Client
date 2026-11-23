package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.IntToDoubleFunction;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class illIIlllIilIIlll {
   public static final illIIlllIilIIlll iiIIIIIill = new illIIlllIilIIlll(Illlllllilll<invokedynamic>(), Illlllllilll<invokedynamic>(), true, new liIIlliiIIll[]{new liIIlliiIIll(Illlllllilll<invokedynamic>(), -1, 0.0F, 0.0F, -1), new liIIlliiIIll(Illlllllilll<invokedynamic>(), -1, 0.0F, 0.0F, -1), new liIIlliiIIll(Illlllllilll<invokedynamic>(), -1, 0.0F, 0.0F, -1)});
   public static final illIIlllIilIIlll liIIIIIill = new illIIlllIilIIlll(Illlllllilll<invokedynamic>(), new liIIlliiIIll[]{new liIIlliiIIll(Illlllllilll<invokedynamic>(), -1, 0.0F, 0.0F, -1), new liIIlliiIIll(Illlllllilll<invokedynamic>(), 0, 7.4F, 6.2F, 15), new liIIlliiIIll(Illlllllilll<invokedynamic>(), 1, 8.6F, 6.2F, 16)});
   public static final double IIIIIIIill = (double)30.0F;
   public static final String IlIIIIIill = "/assets/corzclient/textures/knife/knife.png";
   public static final String llIIIIIill = "/assets/corzclient/c2visuals/butterfly/texture.png";
   public static final double iiiiiiilll = 10.46;
   public static final float iIiiiiilll = 8.0F;
   public static final illIIlllIilIIlll ilIIIIIill = new illIIlllIilIIlll(Illlllllilll<invokedynamic>(), new liIIlliiIIll[]{new liIIlliiIIll(Illlllllilll<invokedynamic>(), -1, 0.0F, 0.0F, -1)});
   private final liIIlliiIIll[] lllIIIIill;
   private final String iIlIIIIill;
   public static final float iliiiiilll = 7.4F;
   public static final float Iiiiiiilll = 8.6F;
   public static final String IIlIIIIill = "C2 Butterfly";
   public static final float lliiiiilll = 6.2F;
   public static final illIIlllIilIIlll IiIIIIIill = new illIIlllIilIIlll(Illlllllilll<invokedynamic>(), new liIIlliiIIll[]{new liIIlliiIIll(Illlllllilll<invokedynamic>(), -1, 0.0F, 0.0F, -1), new liIIlliiIIll(Illlllllilll<invokedynamic>(), 0, 8.0F, 6.3F, 14)});
   private final String lIlIIIIill;
   public static final double lIIIIIIill = 0.3;
   public static final float Iliiiiilll = 6.3F;
   private final boolean IllIIIIill;
   public static final double liiiiiilll = 0.02;
   public static final float lIiiiiilll = 8.0F;
   public static final double iIIIIIIill = 0.11;

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -5052930286727684520L ^ Long.rotateLeft(406713821322011796L, 9) ^ 6009460260015033972L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -7158632240397045627L ^ Long.rotateLeft(2771315192028267280L, 59) ^ -6172198902385762190L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8124959059200767299L ^ Long.rotateLeft(-2705852789407268977L, 51) ^ -8935173321553578364L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 1271266395431277892L ^ Long.rotateLeft(-2968061310269404826L, 62) ^ 7878929117158431757L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 4065683185829809239L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -4895429473751221460L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -1813032283801792684L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -6329348162836719472L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 865317743297093659L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1127078502595933083L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iilllilliill<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIillIiliIil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Ililllililil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Iiilliiliiil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIIilIIiiIIi<invokedynamic>());
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

   public String IilliliilIIi() {
      return this.iIlIIIIill;
   }

   public static illIIlllIilIIlll iliIiiliiiii(String name) {
      return Illlllllilll<invokedynamic>().equals(name) ? iiIIIIIill : IIIllIIliIIl(name);
   }

   public static double IliIlllilIi(double y) {
      double var2 = Math.max((double)0.0F, (Double.longBitsToDouble(-2616101743416093824L ^ -7230122794902137984L) - y) / Double.longBitsToDouble(-1088096388595903007L ^ -5709819286459825139L));
      return Math.toRadians(Double.longBitsToDouble(-1907361521158346905L ^ -6504973790750202009L)) * var2 * (Double.longBitsToDouble(1638345030225450315L ^ 2985782291964257912L) + Double.longBitsToDouble(5367893005274362475L ^ 8473786964440044557L) * var2);
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(-((char)(var4[var5] ^ '꥓')))))) - 6972))) ^ var5) >>> 3 | (char)((char)(-((char)((char)(~((char)((char)(-((char)(var4[var5] ^ '꥓')))))) - 6972))) ^ var5) << 13) + '\udd82') ^ var5) - 29414) + 27068));
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
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\ue1f7') >>> 11 | (char)(var4[var5] ^ '\ue1f7') << 5) ^ var5) ^ 1991) + 8305) >>> 15 | (char)((char)((char)((char)((char)(var4[var5] ^ '\ue1f7') >>> 11 | (char)(var4[var5] ^ '\ue1f7') << 5) ^ var5) ^ 1991) + 8305) << 1) >>> 7 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '\ue1f7') >>> 11 | (char)(var4[var5] ^ '\ue1f7') << 5) ^ var5) ^ 1991) + 8305) >>> 15 | (char)((char)((char)((char)((char)(var4[var5] ^ '\ue1f7') >>> 11 | (char)(var4[var5] ^ '\ue1f7') << 5) ^ var5) ^ 1991) + 8305) << 1) << 9))) + var5) ^ var5) + var5) - 30583))) - var5) + 4505))) - var5) - '쁼'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean lIiiIiIlilli() {
      return this.IllIIIIill;
   }

   public int IlIlllIlilIl() {
      return this.lllIIIIill.length;
   }

   public static double[] liiiIIllIl(double y, double x) {
      double var4 = (double)6.2F - x;
      if (var4 <= (double)0.0F) {
         return new double[]{y, x, (double)0.0F};
      } else {
         double var6 = y - (double)8.0F;
         double var8 = Math.abs(var6);
         double var10 = var4 / 10.46;
         double var12 = var8 <= 0.02 ? var6 : Math.copySign(0.02 + (var8 - 0.02) * ((double)1.0F - 0.11 * var10 * var10), var6);
         int var14 = 2 * (int)Math.ceil(var4 * (double)8.0F);
         double var15 = var4 / (double)var14;
         double var17 = (double)0.0F;
         double var19 = (double)0.0F;

         for(int var21 = 0; var21 <= var14; ++var21) {
            double var22 = var21 != 0 && var21 != var14 ? ((var21 & 1) == 1 ? (double)4.0F : (double)2.0F) : (double)1.0F;
            double var24 = IliIlllilIi((double)6.2F - (double)var21 * var15);
            var17 += var22 * Math.sin(var24);
            var19 += var22 * Math.cos(var24);
         }

         double var26 = IliIlllilIi(x);
         return new double[]{(double)8.0F + var17 * var15 / (double)3.0F + var12 * Math.cos(var26), (double)6.2F - var19 * var15 / (double)3.0F + var12 * Math.sin(var26), var26};
      }
   }

   public liIIlliiIIll IiIlliIliiIl(int i) {
      return this.lllIIIIill[i];
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(var4[var5] + 11036) + '蛁'))) << 15 | (char)(-((char)((char)(var4[var5] + 11036) + '蛁'))) >>> 1) - 489) ^ var5))) ^ 15719) + var5) << 10 | (char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(var4[var5] + 11036) + '蛁'))) << 15 | (char)(-((char)((char)(var4[var5] + 11036) + '蛁'))) >>> 1) - 489) ^ var5))) ^ 15719) + var5) >>> 6))) - var5) + 25598))) ^ '飆') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private illIIlllIilIIlll(String parts, liIIlliiIIll... thirdPersonModel) {
      this(parts, Illlllllilll<invokedynamic>(), false, thirdPersonModel);
   }

   public static illIIlllIilIIlll IIIllIIliIIl(String style) {
      if (style == null) {
         return null;
      } else {
         byte var2 = -1;
         switch (style.hashCode()) {
            case -919081164:
               if (style.equals(Illlllllilll<invokedynamic>())) {
                  var2 = 0;
               }
               break;
            case 1604506830:
               if (style.equals(Illlllllilll<invokedynamic>())) {
                  var2 = 1;
               }
               break;
            case 2006435411:
               if (style.equals(Illlllllilll<invokedynamic>())) {
                  var2 = 2;
               }
         }

         illIIlllIilIIlll var10000;
         switch (var2) {
            case 0 -> var10000 = ilIIIIIill;
            case 1 -> var10000 = IiIIIIIill;
            case 2 -> var10000 = liIIIIIill;
            default -> var10000 = null;
         }

         return var10000;
      }
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) - '돴') + var5) + var5))) + var5) ^ '숍') - 26938) - var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String iIlIlllllill() {
      return this.lIlIIIIill;
   }

   private illIIlllIilIIlll(String thirdPersonModel, String atlas, boolean parts, liIIlliiIIll... materialTints) {
      for(int var5 = 0; var5 < materialTints.length; ++var5) {
         if (materialTints[var5].liiiIIllIl() >= var5) {
            throw new IllegalArgumentException(Illlllllilll<invokedynamic>());
         }
      }

      this.lIlIIIIill = thirdPersonModel;
      this.iIlIIIIill = atlas;
      this.IllIIIIill = parts;
      this.lllIIIIill = materialTints;
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(~var4[var5]) - 12679))) - var5))) + var5) - 'ꭾ') ^ var5) - var5))) + 'ꉣ') << 15 | (char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(~var4[var5]) - 12679))) - var5))) + var5) - 'ꭾ') ^ var5) - var5))) + 'ꉣ') >>> 1) ^ var5) << 7 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(~var4[var5]) - 12679))) - var5))) + var5) - 'ꭾ') ^ var5) - var5))) + 'ꉣ') << 15 | (char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(~var4[var5]) - 12679))) - var5))) + var5) - 'ꭾ') ^ var5) - var5))) + 'ꉣ') >>> 1) ^ var5) >>> 9) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IIlllIlliIll(int channel, IntToDoubleFunction i, float[] out) {
      double var4 = (double)0.0F;
      double var6 = (double)0.0F;
      double var8 = (double)0.0F;
      int[] var10 = new int[this.lllIIIIill.length];
      int var11 = 0;

      for(int var12 = channel; var12 >= 0; var12 = this.lllIIIIill[var12].liiiIIllIl()) {
         var10[var11++] = var12;
      }

      for(int var28 = var11 - 1; var28 >= 0; --var28) {
         liIIlliiIIll var13 = this.lllIIIIill[var10[var28]];
         if (var13.lIiiIiIlilli() >= 0) {
            double var14 = Math.toRadians(i.applyAsDouble(var13.lIiiIiIlilli()));
            double var16 = Math.cos(var14);
            double var18 = Math.sin(var14);
            double var20 = (double)var13.iIlIlllllill() - (var16 * (double)var13.iIlIlllllill() - var18 * (double)var13.IilliliilIIi());
            double var22 = (double)var13.IilliliilIIi() - (var18 * (double)var13.iIlIlllllill() + var16 * (double)var13.IilliliilIIi());
            double var24 = Math.cos(var4);
            double var26 = Math.sin(var4);
            var6 += var24 * var20 - var26 * var22;
            var8 += var26 * var20 + var24 * var22;
            var4 += var14;
         }
      }

      out[0] = (float)Math.toDegrees(var4);
      out[1] = (float)var6;
      out[2] = (float)var8;
   }
}
