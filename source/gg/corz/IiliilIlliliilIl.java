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
import java.util.List;
import java.util.function.ToIntFunction;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

final class IiliilIlliliilIl {
   static final int IiIIIIiIll = 3;
   static final int IIiIIIiIll = 100;
   static final int lliiiilIll = 24;
   static final int lIlIIIiIll = 8;
   static final int iIiiiilIll = 6;
   static final int IIiiiilIll = 6;
   static final int liliiilIll = 1;
   static final int iiIIIIiIll = 3;
   static final int illIIIiIll = 8;
   static final int llIIIIiIll = 2;
   static final int liiiiilIll = 5;
   static final int lIiiiilIll = 48;
   static final int IIlIIIiIll = 4;
   static final int lllIIIiIll = 2;
   static final int liIIIIiIll = 3;
   static final int iIIIIIiIll = 3;
   static final int iIiIIIiIll = 8;
   static final int iilIIIiIll = 40;
   static final double IiiiiilIll = (double)1.5F;
   static final int IliiiilIll = 36;
   static final int iliiiilIll = 9;
   static final int IlIIIIiIll = 3;
   static final int iiliiilIll = 2;
   static final int iiiiiilIll = 3;
   static final int lIIIIIiIll = 8;
   static final int ilIIIIiIll = 6;
   static final int lilIIIiIll = 3;
   static final int iIlIIIiIll = 4;
   static final int IiliiilIll = 0;
   static final int IIIIIIiIll = 3;
   static final int lIiIIIiIll = 3;
   static final int IllIIIiIll = 20;
   static final int IilIIIiIll = 3;

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3326109905633076161L ^ Long.rotateLeft(251767759114252554L, 37) ^ -5316646389915544264L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1848610288538154886L ^ Long.rotateLeft(3108356421084538619L, 34) ^ 7262173165076350420L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3339697780004924518L ^ Long.rotateLeft(-3487945087974031996L, 21) ^ -6579402969175701867L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1875606423840019815L ^ Long.rotateLeft(-632097865028511766L, 36) ^ -6179783155144257808L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4869528025476235162L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1177256685245038566L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 6535163587867910597L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -9164827038410280099L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -53196848162219158L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -3389568874269290630L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(lIiiIiIlilli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iliIiiliiiii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIllIIliIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IlIlllIlilIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIlliIliiIl<invokedynamic>());
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
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(~var4[var5]) - var5))) - var5))) + '푞')) - var5) + var5) - var5) + '邫') ^ var5) - var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) << 1 | (char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) >>> 15) ^ '톌') << 3 | (char)((char)((char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) << 1 | (char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) >>> 15) ^ '톌') >>> 13) + 21350) >>> 8 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) << 1 | (char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) >>> 15) ^ '톌') << 3 | (char)((char)((char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) << 1 | (char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) >>> 15) ^ '톌') >>> 13) + 21350) << 8) ^ var5) >>> 14 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) << 1 | (char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) >>> 15) ^ '톌') << 3 | (char)((char)((char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) << 1 | (char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) >>> 15) ^ '톌') >>> 13) + 21350) >>> 8 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) << 1 | (char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) >>> 15) ^ '톌') << 3 | (char)((char)((char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) << 1 | (char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) >>> 15) ^ '톌') >>> 13) + 21350) << 8) ^ var5) << 2))) >>> 2 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) << 1 | (char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) >>> 15) ^ '톌') << 3 | (char)((char)((char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) << 1 | (char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) >>> 15) ^ '톌') >>> 13) + 21350) >>> 8 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) << 1 | (char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) >>> 15) ^ '톌') << 3 | (char)((char)((char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) << 1 | (char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) >>> 15) ^ '톌') >>> 13) + 21350) << 8) ^ var5) >>> 14 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) << 1 | (char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) >>> 15) ^ '톌') << 3 | (char)((char)((char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) << 1 | (char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) >>> 15) ^ '톌') >>> 13) + 21350) >>> 8 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) << 1 | (char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) >>> 15) ^ '톌') << 3 | (char)((char)((char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) << 1 | (char)(-((char)((char)(var4[var5] + '\uec01') + 5118))) >>> 15) ^ '톌') >>> 13) + 21350) << 8) ^ var5) << 2))) << 14) ^ var5) + '\uf315') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static boolean iIlIlllllill(List<ilIlIIilIiIlIIil> spawners) {
      for(ilIlIIilIiIlIIil var2 : spawners) {
         for(ilIlIIilIiIlIIil var4 : spawners) {
            if (var2 != var4 && Math.max(Math.abs(var2.IlIiIlIIil - var4.IlIiIlIIil), Math.max(Math.abs(var2.llIiIlIIil - var4.llIiIlIIil), Math.abs(var2.ilIiIlIIil - var4.ilIiIlIIil))) <= 2) {
               return true;
            }
         }
      }

      return false;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(-((char)(-((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(-((char)((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11) - var5))) >>> 9 | (char)(-((char)((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11) - var5))) << 7) + 29235)))))) ^ var5) ^ var5) ^ var5) - var5) + var5))))))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private IiliilIlliliilIl() {
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(~((char)(-((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(-((char)(~var4[var5]))) - '譾') + 31716) >>> 5 | (char)((char)((char)(-((char)(~var4[var5]))) - '譾') + 31716) << 11))))) - var5)) >>> 10 | (char)((char)((char)(~((char)(~((char)((char)((char)((char)(-((char)(~var4[var5]))) - '譾') + 31716) >>> 5 | (char)((char)((char)(-((char)(~var4[var5]))) - '譾') + 31716) << 11))))) - var5)) << 6) + var5))))) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static int IliIlllilIi(int sensitivity) {
      return (748955201 * 1749801491 * 25 * 65 ^ 58387279) - Math.max(1, Math.min(((-1190970143 << 17 | -1190970143 >>> 15) >>> 31 | (-1190970143 << 17 | -1190970143 >>> 15) << 1) - 127 ^ -209263739, sensitivity));
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '諡') - var5) << 14 | (char)((char)(var4[var5] ^ '諡') - var5) >>> 2) ^ var5) - '\ue84a') + var5) + '艹') - var5) - 14774) + '쯣') - 28153) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '諡') - var5) << 14 | (char)((char)(var4[var5] ^ '諡') - var5) >>> 2) ^ var5) - '\ue84a') + var5) + '艹') - var5) - 14774) + '쯣') - 28153) << 14))))) - var5) + '﹎'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static lilIiIIliilIiIIl liiiIIllIl(List<ilIlIIilIiIlIIil> chestType, ToIntFunction<ilIlIIilIiIlIIil> dimension, int cells, IIllillIllil sensitivity, int guard) {
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;
      int var14 = 0;
      int var15 = 0;
      int var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      int var20 = 0;
      int var21 = 0;
      int var22 = 0;
      int var23 = 0;
      int var24 = 0;
      ArrayList var25 = new ArrayList();

      for(ilIlIIilIiIlIIil var27 : chestType) {
         switch (var27.IlliIlIIil) {
            case 1:
               int var28 = dimension.applyAsInt(var27);
               if (var28 == 1) {
                  ++var5;
               } else if (var28 == 2) {
                  ++var6;
               } else if (!var27.iliIiiliiiii(64)) {
                  ++var7;
               }
               break;
            case 2:
               if (!var27.iliIiiliiiii(64)) {
                  ++var7;
               }
               break;
            case 3:
               ++var9;
               break;
            case 4:
               ++var10;
               break;
            case 5:
               ++var8;
               break;
            case 6:
               ++var18;
               break;
            case 7:
               ++var21;
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 47:
            case 48:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 107:
            default:
               break;
            case 9:
            case 15:
               ++var22;
               break;
            case 23:
               ++var19;
               break;
            case 24:
               ++var20;
               break;
            case 25:
               ++var12;
               break;
            case 26:
               ++var11;
               break;
            case 27:
               ++var13;
               break;
            case 28:
               ++var14;
               break;
            case 29:
            case 33:
            case 45:
            case 46:
               ++var23;
               break;
            case 30:
               ++var15;
               break;
            case 31:
               ++var16;
               break;
            case 32:
               ++var17;
               break;
            case 49:
               var25.add(var27);
               break;
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 108:
               ++var24;
         }
      }

      int var45 = Math.max(var5, var6);
      var7 += var5 + var6 - 2 * Math.min(var5, var6);
      boolean var46 = sensitivity == IIllillIllil.lilIIiliiilIIili;
      boolean var47 = sensitivity != IIllillIllil.iIiIIiliIliIIili;
      boolean var29 = !var25.isEmpty() && (var21 > 0 || iIlIlllllill(var25));
      int var30 = var9 + var8 + var11 + var14 + var16 + var23 + var22;
      int var31 = (sensitivity == IIllillIllil.iIiIIiliIliIIili ? 0 : Math.min(48, 6 * var45)) + Math.min(36, 6 * var9) + (int)Math.min(24L, Math.round((double)1.5F * (double)(var8 + (var46 ? var7 : 0))));
      int var32 = (var14 > 0 ? 8 : 0) + (var11 > 0 ? 5 : 0) + (var16 > 0 ? 3 : 0) + Math.min(4, var22 + (var47 ? var21 : 0)) + (var23 > 0 ? 3 : 0);
      int var33 = (var15 + 1) / 2;
      if (var46) {
         var32 += (var12 > 0 ? 3 : 0) + (var13 > 0 ? 3 : 0) + (var33 > 0 ? 3 : 0) + (var17 >= 6 ? 3 : 0) + Math.min(3, var18) + Math.min(1, var19) + Math.min(3, var20) + (var10 > 0 && guard != 2 ? 2 : 0);
      }

      int var34 = var29 && var47 ? Math.min(20, 8 + 4 * (var25.size() - 1)) : 0;
      int var35 = var24 >= 8 && var46 ? 3 : 0;
      int var36 = (var12 > 0 ? 1 : 0) + (var13 > 0 ? 1 : 0) + (var33 > 0 ? 1 : 0) + (var16 > 0 ? 1 : 0) + (var14 > 0 ? 1 : 0);
      boolean var37 = var11 > 0 && var36 >= 2 && var46;
      boolean var38 = var31 >= 9 || var14 > 0 || var34 > 0 || var37;
      if (guard != 0 && var30 == 0 && var45 < 3) {
         var38 = false;
      }

      int var39 = var31 + var32 + var34 + var35;
      int var40 = IliIlllilIi(cells);
      if (var38 && var39 >= var40) {
         int var41 = Math.max(40, Math.min(100, 40 + 3 * (var39 - var40)));
         ArrayList var42 = new ArrayList(4);
         if (var45 > 0 && sensitivity != IIllillIllil.iIiIIiliIliIIili) {
            var42.add(var45 == 1 ? IilliliilIIi<invokedynamic>() : var45 + IilliliilIIi<invokedynamic>());
         }

         if (var9 > 0) {
            var42.add(var9 == 1 ? IilliliilIIi<invokedynamic>() : var9 + IilliliilIIi<invokedynamic>());
         }

         if (var14 > 0) {
            var42.add(IilliliilIIi<invokedynamic>());
         }

         if (var34 > 0) {
            var42.add(var25.size() == 1 ? IilliliilIIi<invokedynamic>() : var25.size() + IilliliilIIi<invokedynamic>());
         }

         if (var11 > 0) {
            var42.add(IilliliilIIi<invokedynamic>());
         }

         if (var46 && var7 + var8 > 0) {
            var42.add(var7 + var8 == 1 ? IilliliilIIi<invokedynamic>() : var7 + var8 + IilliliilIIi<invokedynamic>());
         }

         if (var46 && var12 > 0) {
            var42.add(IilliliilIIi<invokedynamic>());
         }

         if (var46 && var13 > 0) {
            var42.add(IilliliilIIi<invokedynamic>());
         }

         if (var46 && var33 > 0) {
            var42.add(var33 == 1 ? IilliliilIIi<invokedynamic>() : var33 + IilliliilIIi<invokedynamic>());
         }

         String var43 = String.join(IilliliilIIi<invokedynamic>(), var42.subList(0, Math.min(3, var42.size())));
         if (!var43.isEmpty()) {
            var43 = Character.toUpperCase(var43.charAt(0)) + var43.substring(1);
         }

         return new lilIiIIliilIiIIl(var41, var39, var43);
      } else {
         return lilIiIIliilIiIIl.IiiiIIilIl;
      }
   }
}
