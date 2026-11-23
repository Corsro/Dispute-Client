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
import net.minecraft.class_10444;
import net.minecraft.class_11659;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_310;
import net.minecraft.class_3489;
import net.minecraft.class_4587;
import net.minecraft.class_4608;
import net.minecraft.class_7833;
import net.minecraft.class_811;
import org.joml.Matrix4f;

public final class illIilllIilIilll {
   private class_1799 lllIlIlill;
   private String IilIlIlill;
   static final float llIIlIlill = 0.31F;
   private static final float[] iiIIlIlill = new float[]{-0.26F, 0.0F, 0.26F};
   private float lliIlIlill;
   static final float liiiIIlill = 28.0F;
   public static final int IiiiIIlill = 15728880;
   static final float iiiiIIlill = 0.9F;
   private final class_10444 IIlIlIlill = new class_10444();
   private final Matrix4f lIlIlIlill = new Matrix4f();
   private final IiiIIilliiIIil iIlIlIlill = this::Illlllllilll;
   static final Matrix4f ilIIlIlill = new Matrix4f(0.0F, 0.0F, 1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
   private float iIiIlIlill;
   private float IliIlIlill;
   private float lIiIlIlill;
   static final float IlIIlIlill = 0.74F;
   private static final String[] IiIIlIlill = new String[]{Ililllililil<invokedynamic>(), Ililllililil<invokedynamic>(), Ililllililil<invokedynamic>()};
   private lIIllIiiIIllIi IIiIlIlill;
   static final float IIIIlIlill = 0.97F;
   static final float lIIIlIlill = -38.0F;
   private String illIlIlill;
   private static final float[] liIIlIlill = new float[]{-34.0F, 0.0F, 34.0F};
   private final IiiIIilliiIIil IllIlIlill = this::IIillIiliIil;
   private String lilIlIlill;
   private iliiiIiiii iilIlIlill;
   static final float iIIIlIlill = 0.05F;
   private float iliIlIlill;

   private void IIillIiliIil(class_4587 m, class_11659 q) {
      long var6 = 7674957378124844112L;
      String var3 = this.lilIlIlill;
      m.method_46416(0.0F, 0.0F, -this.iliIlIlill);
      if (!Ililllililil<invokedynamic>().equals(var3)) {
         m.method_22907(class_7833.field_40714.rotationDegrees(10.0F));
         var6 ^= ~var6 & -1L >>> 32;
         switch (var3.hashCode()) {
            case -728496969:
               if (var3.equals(Ililllililil<invokedynamic>())) {
                  var6 ^= (2L ^ var6) & -1L >>> 32;
               }
               break;
            case 2192525:
               if (var3.equals(Ililllililil<invokedynamic>())) {
                  var6 ^= (1L ^ var6) & -1L >>> 32;
               }
               break;
            case 2583650:
               if (var3.equals(Ililllililil<invokedynamic>())) {
                  var6 ^= (0L ^ var6) & -1L >>> 32;
               }
               break;
            case 2612795:
               if (var3.equals(Ililllililil<invokedynamic>())) {
                  var6 ^= (4L ^ var6) & -1L >>> 32;
               }
               break;
            case 81225440:
               if (var3.equals(Ililllililil<invokedynamic>())) {
                  var6 ^= (3L ^ var6) & -1L >>> 32;
               }
         }

         switch ((int)var6) {
            case 0:
               m.method_22907(class_7833.field_40716.rotationDegrees(58.0F));
               break;
            case 1:
               m.method_22907(class_7833.field_40714.rotationDegrees(-52.0F));
               break;
            case 2:
               m.method_22907(class_7833.field_40718.rotationDegrees(-45.0F));
               break;
            case 3:
               m.method_22907(class_7833.field_40718.rotationDegrees(28.0F));
               m.method_22907(class_7833.field_40716.rotationDegrees(30.0F));
               break;
            case 4:
               m.method_46416(0.0F, 0.12F, 0.0F);
               m.method_22907(class_7833.field_40714.rotationDegrees(30.0F));
               break;
            default:
               m.method_22907(class_7833.field_40716.rotationDegrees(26.0F));
         }

         this.Iilllilliill(m, q, var3, (String)null, (iliiiIiiii)null, 0.0F, 0.0F, false);
      } else {
         for(long var8 = var6 ^ (0L ^ var6) & -1L << 32; (int)(var8 >>> 32) < IiIIlIlill.length; var8 += 4294967296L) {
            m.method_22903();
            m.method_46416(iiIIlIlill[(int)(var8 >>> 32)], 0.0F, -0.1F * Math.abs(iiIIlIlill[(int)(var8 >>> 32)]));
            m.method_22907(class_7833.field_40718.rotationDegrees(liIIlIlill[(int)(var8 >>> 32)] - -38.0F));
            m.method_22907(class_7833.field_40716.rotationDegrees(18.0F));
            m.method_22905(0.62F, 0.62F, 0.62F);
            this.Iilllilliill(m, q, IiIIlIlill[(int)(var8 >>> 32)], (String)null, (iliiiIiiii)null, 0.0F, 0.0F, false);
            m.method_22909();
         }

      }
   }

   public static void lIiiIiIlilli(String f, lIIllIiiIIllIi subject) {
      if (subject != null && !subject.IliIlllilIi() && f != null) {
         if (Ililllililil<invokedynamic>().equals(f)) {
            iiiIIlllIIIlIlll.iliIiiliiiii(illIIlllIilIIlll.iiIIIIIill, subject);
         } else if (iliiiIiiii.lIiiIiIlilli(f)) {
            iiiIIlllIIIlIlll.iliIiiliiiii(illIIlllIilIIlll.IIIllIIliIIl(f), subject);
         }

      }
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] - var5))) + 8571))) + var5) + var5) + 14703) >>> 13 | (char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] - var5))) + 8571))) + var5) + var5) + 14703) << 3) + 14374) - 11229) + var5))) ^ var5) ^ 27918) - var5) << 11 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] - var5))) + 8571))) + var5) + var5) + 14703) >>> 13 | (char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] - var5))) + 8571))) + var5) + var5) + 14703) << 3) + 14374) - 11229) + var5))) ^ var5) ^ 27918) - var5) >>> 5) >>> 12 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] - var5))) + 8571))) + var5) + var5) + 14703) >>> 13 | (char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] - var5))) + 8571))) + var5) + var5) + 14703) << 3) + 14374) - 11229) + var5))) ^ var5) ^ 27918) - var5) << 11 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] - var5))) + 8571))) + var5) + var5) + 14703) >>> 13 | (char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] - var5))) + 8571))) + var5) + var5) + 14703) << 3) + 14374) - 11229) + var5))) ^ var5) ^ 27918) - var5) >>> 5) << 4))) + '\ue98e'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static float IIIllIIliIIl(float aspect, float fit, float zoom) {
      double var3 = Math.toRadians((double)28.0F) / (double)2.0F;
      double var5 = (double)1.0F / Math.sin(var3) / (double)fit;
      if (aspect < 1.0F) {
         double var7 = Math.atan(Math.tan(var3) * (double)aspect);
         var5 = Math.max(var5, (double)1.0F / Math.sin(var7) / (double)fit);
      }

      return (float)(var5 / (double)Math.max(0.05F, zoom));
   }

   public static boolean IilliliilIIi(String subject, lIIllIiiIIllIi f) {
      if (f != null && !f.IliIlllilIi() && subject != null) {
         if (Ililllililil<invokedynamic>().equals(subject)) {
            return llIiilIiilIiilIi.Iilililiiili(f) || iiiIIlllIIIlIlll.IIIllIIliIIl(illIIlllIilIIlll.iiIIIIIill, f);
         } else if (!iliiiIiiii.lIiiIiIlilli(subject)) {
            return true;
         } else {
            return IiIIilIiliIIilIi.iIlIlllllill(subject, f) || iiiIIlllIIIlIlll.IIIllIIliIIl(illIIlllIilIIlll.IIIllIIliIIl(subject), f);
         }
      } else {
         return true;
      }
   }

   private void Illlllllilll(class_4587 m, class_11659 q) {
      m.method_46416(0.0F, 0.05F, -this.iliIlIlill);
      m.method_22907(class_7833.field_40714.rotationDegrees(this.lliIlIlill));
      m.method_22907(class_7833.field_40716.rotationDegrees(this.IliIlIlill));
      float var3 = this.iIiIlIlill > 0.0F ? Math.max(0.0F, Math.min(1.0F, this.lIiIlIlill / this.iIiIlIlill)) : 0.0F;
      this.Iilllilliill(m, q, this.illIlIlill, this.IilIlIlill, this.iilIlIlill, this.lIiIlIlill, var3, true);
   }

   public void IiIlliIliiIl(IIllIllllIllIlll ph, int pw, int clipTime, String f, String pitchDeg, iliiiIiiii zoom, float clipName, float knifeClip, float stage, float clipLength, float subject, lIIllIiiIIllIi yawDeg) {
      float var13 = (float)pw / (float)Math.max(1, clipTime);
      this.illIlIlill = f;
      this.IilIlIlill = pitchDeg;
      this.iilIlIlill = zoom;
      this.lIiIlIlill = clipName;
      this.iIiIlIlill = knifeClip;
      this.IliIlIlill = stage;
      this.lliIlIlill = clipLength;
      this.IIiIlIlill = yawDeg;
      this.iliIlIlill = IIIllIIliIIl(var13, 0.9F, subject);
      this.IlIlllIlilIl(var13, this.iliIlIlill);
      ph.IIIllIIliIIl(0, 0, pw, clipTime, this.lIlIlIlill, this.iIlIlIlill);
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ '騮') + '鉧') + var5) + 20258) >>> 10 | (char)((char)((char)((char)(var4[var5] ^ '騮') + '鉧') + var5) + 20258) << 6))) - var5) ^ '쒿') - '쬮') + 10663) - var5) << 9 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ '騮') + '鉧') + var5) + 20258) >>> 10 | (char)((char)((char)((char)(var4[var5] ^ '騮') + '鉧') + var5) + 20258) << 6))) - var5) ^ '쒿') - '쬮') + 10663) - var5) >>> 7) - 19463) + var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(~var4[var5]) ^ '쪈') << 4 | (char)((char)(~var4[var5]) ^ '쪈') >>> 12) << 14 | (char)((char)((char)(~var4[var5]) ^ '쪈') << 4 | (char)((char)(~var4[var5]) ^ '쪈') >>> 12) >>> 2))))) - var5) ^ var5) << 12 | (char)((char)((char)(-((char)(-((char)((char)((char)((char)(~var4[var5]) ^ '쪈') << 4 | (char)((char)(~var4[var5]) ^ '쪈') >>> 12) << 14 | (char)((char)((char)(~var4[var5]) ^ '쪈') << 4 | (char)((char)(~var4[var5]) ^ '쪈') >>> 12) >>> 2))))) - var5) ^ var5) >>> 4) - 21767) + '쒷') + var5) - 2037))) ^ '볇'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4974022421593485590L ^ Long.rotateLeft(4831398816834275032L, 43) ^ 2551989714456918707L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5737515743997434914L ^ Long.rotateLeft(-218538748700751823L, 12) ^ -1416970574829144162L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -5916892984078758435L ^ Long.rotateLeft(4296573301807804142L, 39) ^ 5297458384993217393L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5595565902569348174L ^ Long.rotateLeft(5818223952760927482L, 41) ^ 3423760259925456935L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -6562423388164599305L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1428274810215724754L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4121698144296143388L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7857266579273084173L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5719106972034682012L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -5642627803361478697L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iiilliiliiil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIIilIIiiIIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IlIillIiilIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IiIiliIiiiIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIlilIliiIli<invokedynamic>());
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
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] + var5) + var5))) - '\ud94c') >>> 8 | (char)((char)(-((char)((char)(var4[var5] + var5) + var5))) - '\ud94c') << 8))) >>> 3 | (char)(-((char)((char)((char)(-((char)((char)(var4[var5] + var5) + var5))) - '\ud94c') >>> 8 | (char)((char)(-((char)((char)(var4[var5] + var5) + var5))) - '\ud94c') << 8))) << 13) << 2 | (char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] + var5) + var5))) - '\ud94c') >>> 8 | (char)((char)(-((char)((char)(var4[var5] + var5) + var5))) - '\ud94c') << 8))) >>> 3 | (char)(-((char)((char)((char)(-((char)((char)(var4[var5] + var5) + var5))) - '\ud94c') >>> 8 | (char)((char)(-((char)((char)(var4[var5] + var5) + var5))) - '\ud94c') << 8))) << 13) >>> 14) + var5))) ^ 1508) ^ var5) + 9125) ^ var5) + var5) ^ var5))) ^ '鵤'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean iliIiiliiiii(lIIllIiiIIllIi f) {
      long var4 = -3186980854954687033L;
      long var6 = 3159947354070796807L;
      var4 ^= ((long)llIiilIiilIiilIi.Iilililiiili(f) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)IiIIilIiliIIilIi.iIlIlllllill(Ililllililil<invokedynamic>(), f) ^ var4) & -1L >>> 32;
      var6 ^= ((long)IiIIilIiliIIilIi.iIlIlllllill(Ililllililil<invokedynamic>(), f) << 32 ^ var6) & -1L << 32;
      return (int)(var4 >>> 32) != 0 && (int)var4 != 0 && (int)(var6 >>> 32) != 0;
   }

   private void IlIlllIlilIl(float aspect, float d) {
      float var3 = Math.max(0.05F, d - 2.0F);
      float var4 = d + 2.0F;
      this.lIlIlIlill.setPerspective((float)Math.toRadians((double)28.0F), aspect, var3, var4);
   }

   public boolean iIlIlllllill(String subject) {
      iiIiliiIIlilii var2 = iiIiliiIIlilii.IIillIiliIil(subject);
      if (var2 != null) {
         return llIiilIiilIiilIi.IIIllIIliIIl(var2);
      } else {
         return Ililllililil<invokedynamic>().equals(subject) && llIiilIiilIiilIi.iliIiiliiiii();
      }
   }

   public boolean IIlllIlliIll(IIllIllllIllIlll atlas, int tile, int px, String f, lIIllIiiIIllIi item) {
      long var8 = 3601930165275833346L;
      var8 ^= ((long)(Ililllililil<invokedynamic>().equals(f) ? (this.liiiIIllIl(Ililllililil<invokedynamic>()) && this.liiiIIllIl(Ililllililil<invokedynamic>()) && this.liiiIIllIl(Ililllililil<invokedynamic>()) ? 1 : 0) : this.liiiIIllIl(f)) << 32 ^ var8) & -1L << 32;
      if ((int)(var8 >>> 32) != 0) {
         var8 ^= ((long)(Ililllililil<invokedynamic>().equals(f) ? IilliliilIIi(Ililllililil<invokedynamic>(), item) & IilliliilIIi(Ililllililil<invokedynamic>(), item) & IilliliilIIi(Ililllililil<invokedynamic>(), item) : IilliliilIIi(f, item)) ^ var8) & -1L >>> 32;
         this.lilIlIlill = f;
         this.IIiIlIlill = item;
         this.iliIlIlill = IIIllIIliIIl(1.0F, 0.97F, 1.0F);
         this.IlIlllIlilIl(1.0F, this.iliIlIlill);
         atlas.IIIllIIliIIl(tile, 0, px, px, this.lIlIlIlill, this.IllIlIlill);
         return (boolean)((int)var8);
      } else {
         return (Ililllililil<invokedynamic>().equals(f) || Ililllililil<invokedynamic>().equals(f)) && llIiilIiilIiilIi.iliIiiliiiii() || this.iIlIlllllill(f);
      }
   }

   private void Iilllilliill(class_4587 p, class_11659 q, String animate, String subject, iliiiIiiii knifeClip, float m, float clipTime, boolean clipName) {
      long var12 = 1261651675726778822L;
      iiIiliiIIlilii var9 = iiIiliiIIlilii.IIillIiliIil(animate);
      if (var9 != null) {
         p.method_22903();
         p.method_22907(class_7833.field_40718.rotationDegrees(-38.0F));
         p.method_34425(ilIIlIlill);
         float var10 = 1.0F / llIiilIiilIiilIi.Iiilliiliiil(var9);
         p.method_22905(var10, var10, var10);
         llIiilIiilIiilIi.IIlilIliiIli(var9, p, q, this.IIiIlIlill, clipName ? subject : null, m, clipName, 15728880);
         p.method_22909();
      } else if (Ililllililil<invokedynamic>().equals(animate)) {
         p.method_22903();
         p.method_22907(class_7833.field_40718.rotationDegrees(-38.0F));
         p.method_34425(ilIIlIlill);
         float var14 = 1.0F / llIiilIiilIiilIi.Ililllililil();
         p.method_22905(var14, var14, var14);
         llIiilIiilIiilIi.IiIiliIiiiIi(p, q, this.IIiIlIlill, clipName ? subject : null, m, clipName, 15728880);
         p.method_22909();
      } else if (iliiiIiiii.lIiiIiIlilli(animate)) {
         p.method_22903();
         p.method_22907(class_7833.field_40718.rotationDegrees(-38.0F));
         float var15 = 1.0F / IiIIilIiliIIilIi.liiiIIllIl(animate);
         p.method_22905(var15, var15, var15);
         IiIIilIiliIIilIi.IIIllIIliIIl(p, q, animate, this.IIiIlIlill, clipName ? knifeClip : null, clipTime, clipName, 15728880);
         p.method_22909();
      } else {
         p.method_22903();
         var12 ^= ((long)(clipName && Ililllililil<invokedynamic>().equals(animate) ? 1 : 0) << 32 ^ var12) & -1L << 32;
         float var11 = 1.0F / (0.74F + ((int)(var12 >>> 32) != 0 ? 0.31F : 0.0F));
         p.method_22905(var11, var11, var11);
         if ((int)(var12 >>> 32) != 0) {
            p.method_46416(0.0F, -0.31F, 0.0F);
         }

         if (clipName) {
            IIlllIIilIlllIIi.illliIilli(p, animate, clipTime);
         }

         this.IIlIlIlill.method_65604(p, q, 15728880, class_4608.field_21444, 0);
         p.method_22909();
      }

   }

   public void IliIlllilIi(IIlllIIilIlllIIi module) {
      class_310 var2 = class_310.method_1551();
      class_1799 var3 = var2.field_1724 != null ? var2.field_1724.method_6047() : class_1799.field_8037;
      if (var3 == null || var3.method_7960() || !var3.method_31573(class_3489.field_42611)) {
         if (this.lllIlIlill == null) {
            this.lllIlIlill = new class_1799(class_1802.field_22022);
         }

         var3 = this.lllIlIlill;
      }

      var2.method_65386().method_65598(this.IIlIlIlill, var3, class_811.field_4315, var2.field_1687, var2.field_1724, 0);
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(-((char)(-((char)(-((char)((char)(~((char)(var4[var5] + '诞'))) ^ '\ue79e'))))))) ^ var5) + '铏')) + 26639) - var5))))) - '곛')))) + '싢'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean liiiIIllIl(String subject) {
      if (Ililllililil<invokedynamic>().equals(subject)) {
         return llIiilIiilIiilIi.IilliliilIIi();
      } else {
         iiIiliiIIlilii var2 = iiIiliiIIlilii.IIillIiliIil(subject);
         if (var2 != null) {
            return llIiilIiilIiilIi.lIiiIiIlilli(var2);
         } else if (iliiiIiiii.lIiiIiIlilli(subject)) {
            return IiIIilIiliIIilIi.IliIlllilIi(subject);
         } else {
            return !this.IIlIlIlill.method_65606();
         }
      }
   }
}
