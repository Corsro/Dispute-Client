package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class ilIlliIiIlli {
   private int IliliiIIllliliiIIl;
   private boolean ililiiIIlIiiliiIIl;
   private final StringBuilder lIiliiIIliIiliiIIl = new StringBuilder(1048576);

   public ilIlliIiIlli Illlllllilll(String key, boolean v) {
      this.liiiIIllIl();
      this.IliIlllilIi();
      this.lIiliiIIliIiliiIIl.append('"').append(iIlIlllllill(key)).append(IIIilIIiiIIi<invokedynamic>()).append(v);
      this.ililiiIIlIiiliiIIl = true;
      return this;
   }

   public ilIlliIiIlli IilliliilIIi(String key) {
      this.liiiIIllIl();
      this.IliIlllilIi();
      this.lIiliiIIliIiliiIIl.append('"').append(iIlIlllllill(key)).append(IIIilIIiiIIi<invokedynamic>());
      ++this.IliliiIIllliliiIIl;
      return this;
   }

   public ilIlliIiIlli IIlllIlliIll(String v, double key) {
      this.liiiIIllIl();
      this.IliIlllilIi();
      this.lIiliiIIliIiliiIIl.append('"').append(iIlIlllllill(v)).append(IIIilIIiiIIi<invokedynamic>()).append(String.format(Locale.ROOT, IIIilIIiiIIi<invokedynamic>(), key));
      this.ililiiIIlIiiliiIIl = true;
      return this;
   }

   public static String Ililllililil(int rawStateId, int z, int x, int y) {
      return IIIilIIiiIIi<invokedynamic>() + rawStateId + IIIilIIiiIIi<invokedynamic>() + z + IIIilIIiiIIi<invokedynamic>() + x + IIIilIIiiIIi<invokedynamic>() + y + IIIilIIiiIIi<invokedynamic>();
   }

   public ilIlliIiIlli IlIlllIlilIl(String v, String key) {
      this.liiiIIllIl();
      this.IliIlllilIi();
      this.lIiliiIIliIiliiIIl.append('"').append(iIlIlllllill(v)).append(IIIilIIiiIIi<invokedynamic>());
      if (key == null) {
         this.lIiliiIIliIiliiIIl.append(IIIilIIiiIIi<invokedynamic>());
      } else {
         this.lIiliiIIliIiliiIIl.append('"').append(iIlIlllllill(key)).append('"');
      }

      this.ililiiIIlIiiliiIIl = true;
      return this;
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) - var5) ^ var5) ^ var5) << 5 | (char)((char)((char)((char)(~((char)(var4[var5] - var5))) - var5) ^ var5) ^ var5) >>> 11))) + var5))) + 3047) - '낸'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void IliIlllilIi() {
      this.lIiliiIIliIiliiIIl.append(IIIilIIiiIIi<invokedynamic>().repeat(this.IliliiIIllliliiIIl));
   }

   public String Iiilliiliiil() {
      this.lIiliiIIliIiliiIIl.append(IIIilIIiiIIi<invokedynamic>());
      return this.lIiliiIIliIiliiIIl.toString();
   }

   public static String IIillIiliIil(int x, int y, int z) {
      return IIIilIIiiIIi<invokedynamic>() + x + IIIilIIiiIIi<invokedynamic>() + y + IIIilIIiiIIi<invokedynamic>() + z + IIIilIIiiIIi<invokedynamic>();
   }

   public ilIlliIiIlli IIIllIIliIIl() {
      this.lIiliiIIliIiliiIIl.append('\n');
      --this.IliliiIIllliliiIIl;
      this.IliIlllilIi();
      this.lIiliiIIliIiliiIIl.append(']');
      this.ililiiIIlIiiliiIIl = true;
      return this;
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) << 1 | (char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) >>> 15) + 4953) + var5))) - var5) >>> 7 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) << 1 | (char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) >>> 15) + 4953) + var5))) - var5) << 9) >>> 13 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) << 1 | (char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) >>> 15) + 4953) + var5))) - var5) >>> 7 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) << 1 | (char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) >>> 15) + 4953) + var5))) - var5) << 9) << 3) << 9 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) << 1 | (char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) >>> 15) + 4953) + var5))) - var5) >>> 7 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) << 1 | (char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) >>> 15) + 4953) + var5))) - var5) << 9) >>> 13 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) << 1 | (char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) >>> 15) + 4953) + var5))) - var5) >>> 7 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) << 1 | (char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) >>> 15) + 4953) + var5))) - var5) << 9) << 3) >>> 7) - 9762) - 1141) + var5) ^ var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) << 1 | (char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) >>> 15) + 4953) + var5))) - var5) >>> 7 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) << 1 | (char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) >>> 15) + 4953) + var5))) - var5) << 9) >>> 13 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) << 1 | (char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) >>> 15) + 4953) + var5))) - var5) >>> 7 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) << 1 | (char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) >>> 15) + 4953) + var5))) - var5) << 9) << 3) << 9 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) << 1 | (char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) >>> 15) + 4953) + var5))) - var5) >>> 7 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) << 1 | (char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) >>> 15) + 4953) + var5))) - var5) << 9) >>> 13 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) << 1 | (char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) >>> 15) + 4953) + var5))) - var5) >>> 7 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) << 1 | (char)((char)((char)((char)(var4[var5] + '놪') + 1970) - var5) >>> 3 | (char)((char)((char)(var4[var5] + '놪') + 1970) - var5) << 13) >>> 15) + 4953) + var5))) - var5) << 9) << 3) >>> 7) - 9762) - 1141) + var5) ^ var5) << 13))) + 12254));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public ilIlliIiIlli Iilllilliill(String rawJson) {
      if (this.ililiiIIlIiiliiIIl) {
         this.lIiliiIIliIiliiIIl.append(IIIilIIiiIIi<invokedynamic>());
         this.IliIlllilIi();
      }

      this.lIiliiIIliIiliiIIl.append(rawJson);
      this.ililiiIIlIiiliiIIl = true;
      return this;
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 12607) ^ var5) << 6 | (char)((char)(var4[var5] + 12607) ^ var5) >>> 10) + 14900) << 15 | (char)((char)((char)((char)(var4[var5] + 12607) ^ var5) << 6 | (char)((char)(var4[var5] + 12607) ^ var5) >>> 10) + 14900) >>> 1))) - var5) << 12 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 12607) ^ var5) << 6 | (char)((char)(var4[var5] + 12607) ^ var5) >>> 10) + 14900) << 15 | (char)((char)((char)((char)(var4[var5] + 12607) ^ var5) << 6 | (char)((char)(var4[var5] + 12607) ^ var5) >>> 10) + 14900) >>> 1))) - var5) >>> 4) - '잤') - 5569) << 12 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 12607) ^ var5) << 6 | (char)((char)(var4[var5] + 12607) ^ var5) >>> 10) + 14900) << 15 | (char)((char)((char)((char)(var4[var5] + 12607) ^ var5) << 6 | (char)((char)(var4[var5] + 12607) ^ var5) >>> 10) + 14900) >>> 1))) - var5) << 12 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 12607) ^ var5) << 6 | (char)((char)(var4[var5] + 12607) ^ var5) >>> 10) + 14900) << 15 | (char)((char)((char)((char)(var4[var5] + 12607) ^ var5) << 6 | (char)((char)(var4[var5] + 12607) ^ var5) >>> 10) + 14900) >>> 1))) - var5) >>> 4) - '잤') - 5569) >>> 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public ilIlliIiIlli() {
      this.lIiliiIIliIiliiIIl.append(IIIilIIiiIIi<invokedynamic>());
      this.IliliiIIllliliiIIl = 1;
   }

   private static String iIlIlllllill(String s) {
      long var4 = -6847846719396869161L;
      StringBuilder var1 = new StringBuilder(s.length() + 8);

      for(var4 ^= (0L ^ var4) & -1L << 32; (int)(var4 >>> 32) < s.length(); var4 += 4294967296L) {
         var4 ^= ((long)s.charAt((int)(var4 >>> 32)) ^ var4) & -1L >>> 32;
         switch ((int)var4) {
            case 9:
               var1.append(IIIilIIiiIIi<invokedynamic>());
               break;
            case 10:
               var1.append(IIIilIIiiIIi<invokedynamic>());
               break;
            case 13:
               var1.append(IIIilIIiiIIi<invokedynamic>());
               break;
            case 34:
               var1.append(IIIilIIiiIIi<invokedynamic>());
               break;
            case 92:
               var1.append(IIIilIIiiIIi<invokedynamic>());
               break;
            default:
               if ((int)var4 < 32) {
                  var1.append(String.format(IIIilIIiiIIi<invokedynamic>(), (int)var4));
               } else {
                  var1.append((char)((int)var4));
               }
         }
      }

      return var1.toString();
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8362437776508919114L ^ Long.rotateLeft(-68027104332107651L, 58) ^ 7934914961475523743L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1969783532682399485L ^ Long.rotateLeft(5271406660337531883L, 42) ^ -8498972421708635733L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -1328322956987392237L ^ Long.rotateLeft(-664949630361912193L, 51) ^ 2747073648172485790L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3153782692865337126L ^ Long.rotateLeft(7115915607723525686L, 17) ^ -1331309973347556494L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 2709811394315136127L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 8050333483301854664L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6864428569827239114L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -6449481305486665548L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4113341503486223809L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2894189220087805539L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IlIillIiilIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIiliIiiiIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIlilIliiIli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Illillliilli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iilililiiili<invokedynamic>());
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

   public ilIlliIiIlli iliIiiliiiii(String key) {
      this.liiiIIllIl();
      this.IliIlllilIi();
      this.lIiliiIIliIiliiIIl.append('"').append(iIlIlllllill(key)).append(IIIilIIiiIIi<invokedynamic>());
      ++this.IliliiIIllliliiIIl;
      this.IliIlllilIi();
      return this;
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] + var5) + var5) >>> 12 | (char)((char)(var4[var5] + var5) + var5) << 4) - var5))))) + var5) ^ var5) - '\ue8a9') >>> 8 | (char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] + var5) + var5) >>> 12 | (char)((char)(var4[var5] + var5) + var5) << 4) - var5))))) + var5) ^ var5) - '\ue8a9') << 8) + 3198))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - '\ue6a0') ^ '싿') + 8114) + 'ꕏ') + '컛') >>> 1 | (char)((char)((char)((char)((char)(var4[var5] - '\ue6a0') ^ '싿') + 8114) + 'ꕏ') + '컛') << 15))) + var5) + var5)));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void liiiIIllIl() {
      if (this.ililiiIIlIiiliiIIl) {
         this.lIiliiIIliIiliiIIl.append(IIIilIIiiIIi<invokedynamic>());
      }

      this.ililiiIIlIiiliiIIl = false;
   }

   public ilIlliIiIlli lIiiIiIlilli() {
      this.lIiliiIIliIiliiIIl.append('\n');
      --this.IliliiIIllliliiIIl;
      this.IliIlllilIi();
      this.lIiliiIIliIiliiIIl.append('}');
      this.ililiiIIlIiiliiIIl = true;
      return this;
   }

   public ilIlliIiIlli IiIlliIliiIl(String v, long key) {
      this.liiiIIllIl();
      this.IliIlllilIi();
      this.lIiliiIIliIiliiIIl.append('"').append(iIlIlllllill(v)).append(IIIilIIiiIIi<invokedynamic>()).append(key);
      this.ililiiIIlIiiliiIIl = true;
      return this;
   }
}
