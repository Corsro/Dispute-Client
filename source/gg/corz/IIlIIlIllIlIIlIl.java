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

public final class IIlIIlIllIlIIlIl {
   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ 22214))) ^ var5) ^ '萻') ^ 30809) - var5))) ^ 16034) >>> 15 | (char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ 22214))) ^ var5) ^ '萻') ^ 30809) - var5))) ^ 16034) << 1) ^ 7178) >>> 10 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ 22214))) ^ var5) ^ '萻') ^ 30809) - var5))) ^ 16034) >>> 15 | (char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ 22214))) ^ var5) ^ '萻') ^ 30809) - var5))) ^ 16034) << 1) ^ 7178) << 6))) - 2939) << 1 | (char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ 22214))) ^ var5) ^ '萻') ^ 30809) - var5))) ^ 16034) >>> 15 | (char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ 22214))) ^ var5) ^ '萻') ^ 30809) - var5))) ^ 16034) << 1) ^ 7178) >>> 10 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ 22214))) ^ var5) ^ '萻') ^ 30809) - var5))) ^ 16034) >>> 15 | (char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ 22214))) ^ var5) ^ '萻') ^ 30809) - var5))) ^ 16034) << 1) ^ 7178) << 6))) - 2939) >>> 15));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private IIlIIlIllIlIIlIl() {
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) >>> 1 | (char)(~((char)(-var4[var5]))) << 15) - 7690) << 5 | (char)((char)((char)(~((char)(-var4[var5]))) >>> 1 | (char)(~((char)(-var4[var5]))) << 15) - 7690) >>> 11) - var5) - var5) << 6 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) >>> 1 | (char)(~((char)(-var4[var5]))) << 15) - 7690) << 5 | (char)((char)((char)(~((char)(-var4[var5]))) >>> 1 | (char)(~((char)(-var4[var5]))) << 15) - 7690) >>> 11) - var5) - var5) >>> 10))) >>> 8 | (char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) >>> 1 | (char)(~((char)(-var4[var5]))) << 15) - 7690) << 5 | (char)((char)((char)(~((char)(-var4[var5]))) >>> 1 | (char)(~((char)(-var4[var5]))) << 15) - 7690) >>> 11) - var5) - var5) << 6 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) >>> 1 | (char)(~((char)(-var4[var5]))) << 15) - 7690) << 5 | (char)((char)((char)(~((char)(-var4[var5]))) >>> 1 | (char)(~((char)(-var4[var5]))) << 15) - 7690) >>> 11) - var5) - var5) >>> 10))) << 8) ^ 19840) ^ var5))))) >>> 10 | (char)(-((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) >>> 1 | (char)(~((char)(-var4[var5]))) << 15) - 7690) << 5 | (char)((char)((char)(~((char)(-var4[var5]))) >>> 1 | (char)(~((char)(-var4[var5]))) << 15) - 7690) >>> 11) - var5) - var5) << 6 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) >>> 1 | (char)(~((char)(-var4[var5]))) << 15) - 7690) << 5 | (char)((char)((char)(~((char)(-var4[var5]))) >>> 1 | (char)(~((char)(-var4[var5]))) << 15) - 7690) >>> 11) - var5) - var5) >>> 10))) >>> 8 | (char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) >>> 1 | (char)(~((char)(-var4[var5]))) << 15) - 7690) << 5 | (char)((char)((char)(~((char)(-var4[var5]))) >>> 1 | (char)(~((char)(-var4[var5]))) << 15) - 7690) >>> 11) - var5) - var5) << 6 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) >>> 1 | (char)(~((char)(-var4[var5]))) << 15) - 7690) << 5 | (char)((char)((char)(~((char)(-var4[var5]))) >>> 1 | (char)(~((char)(-var4[var5]))) << 15) - 7690) >>> 11) - var5) - var5) >>> 10))) << 8) ^ 19840) ^ var5))))) << 6)) + '酴') + '膠'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static String iIlIlllllill(int escalation) {
      return escalation <= 0 ? iilIlliIIiIlli.illIilIIIl.name() : iilIlliIIiIlli.IilIilIIIl.name();
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -5020175244346816954L ^ Long.rotateLeft(-2603593648079126733L, 3) ^ -4547713357303619664L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 936612214399986618L ^ Long.rotateLeft(6281702395941035008L, 60) ^ 8144811490797589763L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 1007304325102119150L ^ Long.rotateLeft(-914701364191337827L, 18) ^ -2694978727834820113L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -2901621408509104271L ^ Long.rotateLeft(-7226867926582142886L, 13) ^ -5748289607700440716L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -6746300949985964930L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -226329963370912471L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2668494901854982646L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 644818612658880728L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 818238053514122720L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2681763070281674783L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IlIlllIlilIl<invokedynamic>());
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

   public static iillIiilIIilIiil IliIlllilIi(String accessEscalation, boolean blocker, int regionsExcludable, boolean missionAvailable) {
      return liiiIIllIl(accessEscalation, blocker, regionsExcludable, missionAvailable, IilliliilIIi<invokedynamic>().equals(accessEscalation));
   }

   public static iillIiilIIilIiil liiiIIllIl(String blocker, boolean missionAvailable, int regionsExcludable, boolean accessEscalation, boolean playerIsolated) {
      long var7 = -7261183223237164663L;
      if (!playerIsolated || !IilliliilIIi<invokedynamic>().equals(blocker) && !IilliliilIIi<invokedynamic>().equals(blocker) && !IilliliilIIi<invokedynamic>().equals(blocker) && !IilliliilIIi<invokedynamic>().equals(blocker) && !IilliliilIIi<invokedynamic>().equals(blocker)) {
         var7 ^= (-4294967296L ^ var7) & -1L << 32;
         switch (blocker.hashCode()) {
            case -1602411592:
               if (blocker.equals(IilliliilIIi<invokedynamic>())) {
                  var7 ^= (21474836480L ^ var7) & -1L << 32;
               }
               break;
            case -1518100810:
               if (blocker.equals(IilliliilIIi<invokedynamic>())) {
                  var7 ^= (4294967296L ^ var7) & -1L << 32;
               }
               break;
            case -1209509987:
               if (blocker.equals(IilliliilIIi<invokedynamic>())) {
                  var7 ^= (30064771072L ^ var7) & -1L << 32;
               }
               break;
            case -534871379:
               if (blocker.equals(IilliliilIIi<invokedynamic>())) {
                  var7 ^= (0L ^ var7) & -1L << 32;
               }
               break;
            case -470340276:
               if (blocker.equals(IilliliilIIi<invokedynamic>())) {
                  var7 ^= (17179869184L ^ var7) & -1L << 32;
               }
               break;
            case 545091468:
               if (blocker.equals(IilliliilIIi<invokedynamic>())) {
                  var7 ^= (12884901888L ^ var7) & -1L << 32;
               }
               break;
            case 980190238:
               if (blocker.equals(IilliliilIIi<invokedynamic>())) {
                  var7 ^= (25769803776L ^ var7) & -1L << 32;
               }
               break;
            case 1400776477:
               if (blocker.equals(IilliliilIIi<invokedynamic>())) {
                  var7 ^= (8589934592L ^ var7) & -1L << 32;
               }
         }

         switch ((int)(var7 >>> 32)) {
            case 0:
               if (accessEscalation) {
                  return new iillIiilIIilIiil(blocker, iiIiIlllIIliIlll.IIiiiIIill, IilliliilIIi<invokedynamic>());
               }

               return new iillIiilIIilIiil(blocker, iiIiIlllIIliIlll.IliiiIIill, IilliliilIIi<invokedynamic>());
            case 1:
               return new iillIiilIIilIiil(blocker, iiIiIlllIIliIlll.IiliiIIill, IilliliilIIi<invokedynamic>());
            case 2:
               return new iillIiilIIilIiil(blocker, iiIiIlllIIliIlll.lIiiiIIill, IilliliilIIi<invokedynamic>());
            case 3:
            case 4:
               if (regionsExcludable < 2) {
                  return new iillIiilIIilIiil(blocker, iiIiIlllIIliIlll.liliiIIill, IilliliilIIi<invokedynamic>() + iIlIlllllill(regionsExcludable));
               } else if (missionAvailable) {
                  return new iillIiilIIilIiil(blocker, iiIiIlllIIliIlll.iiliiIIill, IilliliilIIi<invokedynamic>());
               } else {
                  if (accessEscalation) {
                     return new iillIiilIIilIiil(blocker, iiIiIlllIIliIlll.IIiiiIIill, IilliliilIIi<invokedynamic>());
                  }

                  return new iillIiilIIilIiil(blocker, iiIiIlllIIliIlll.IliiiIIill, IilliliilIIi<invokedynamic>());
               }
            case 5:
            case 6:
            case 7:
               if (missionAvailable) {
                  return new iillIiilIIilIiil(blocker, iiIiIlllIIliIlll.iiliiIIill, IilliliilIIi<invokedynamic>());
               } else {
                  if (accessEscalation) {
                     return new iillIiilIIilIiil(blocker, iiIiIlllIIliIlll.IIiiiIIill, IilliliilIIi<invokedynamic>());
                  }

                  return new iillIiilIIilIiil(blocker, iiIiIlllIIliIlll.IliiiIIill, IilliliilIIi<invokedynamic>());
               }
            default:
               return missionAvailable ? new iillIiilIIilIiil(blocker, iiIiIlllIIliIlll.iiliiIIill, IilliliilIIi<invokedynamic>()) : new iillIiilIIilIiil(blocker, iiIiIlllIIliIlll.IliiiIIill, IilliliilIIi<invokedynamic>());
         }
      } else {
         return new iillIiilIIilIiil(blocker, iiIiIlllIIliIlll.iIiiiIIill, IilliliilIIi<invokedynamic>());
      }
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(-((char)(-((char)(-((char)((char)((char)((char)(var4[var5] - 1071) + '쪋') ^ var5) >>> 8 | (char)((char)((char)(var4[var5] - 1071) + '쪋') ^ var5) << 8))))))) - '\ua6fc'))) >>> 14 | (char)(~((char)((char)(-((char)(-((char)(-((char)((char)((char)((char)(var4[var5] - 1071) + '쪋') ^ var5) >>> 8 | (char)((char)((char)(var4[var5] - 1071) + '쪋') ^ var5) << 8))))))) - '\ua6fc'))) << 2) + var5))) + 32163) + '펗') ^ 17455) >>> 8 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(-((char)(-((char)(-((char)((char)((char)((char)(var4[var5] - 1071) + '쪋') ^ var5) >>> 8 | (char)((char)((char)(var4[var5] - 1071) + '쪋') ^ var5) << 8))))))) - '\ua6fc'))) >>> 14 | (char)(~((char)((char)(-((char)(-((char)(-((char)((char)((char)((char)(var4[var5] - 1071) + '쪋') ^ var5) >>> 8 | (char)((char)((char)(var4[var5] - 1071) + '쪋') ^ var5) << 8))))))) - '\ua6fc'))) << 2) + var5))) + 32163) + '펗') ^ 17455) << 8) + 19347))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) << 6 | (char)(-var4[var5]) >>> 10) + 30406) >>> 5 | (char)((char)((char)(-var4[var5]) << 6 | (char)(-var4[var5]) >>> 10) + 30406) << 11) << 10 | (char)((char)((char)((char)(-var4[var5]) << 6 | (char)(-var4[var5]) >>> 10) + 30406) >>> 5 | (char)((char)((char)(-var4[var5]) << 6 | (char)(-var4[var5]) >>> 10) + 30406) << 11) >>> 6) ^ '혬') + 2464) ^ var5) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) << 6 | (char)(-var4[var5]) >>> 10) + 30406) >>> 5 | (char)((char)((char)(-var4[var5]) << 6 | (char)(-var4[var5]) >>> 10) + 30406) << 11) << 10 | (char)((char)((char)((char)(-var4[var5]) << 6 | (char)(-var4[var5]) >>> 10) + 30406) >>> 5 | (char)((char)((char)(-var4[var5]) << 6 | (char)(-var4[var5]) >>> 10) + 30406) << 11) >>> 6) ^ '혬') + 2464) ^ var5) >>> 2))))))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)(-((char)(-((char)((char)(var4[var5] ^ '黛') ^ var5))))))) - var5) + '륔'))) + var5) >>> 6 | (char)((char)(~((char)((char)((char)(-((char)(-((char)(-((char)((char)(var4[var5] ^ '黛') ^ var5))))))) - var5) + '륔'))) + var5) << 10) << 2 | (char)((char)((char)(~((char)((char)((char)(-((char)(-((char)(-((char)((char)(var4[var5] ^ '黛') ^ var5))))))) - var5) + '륔'))) + var5) >>> 6 | (char)((char)(~((char)((char)((char)(-((char)(-((char)(-((char)((char)(var4[var5] ^ '黛') ^ var5))))))) - var5) + '륔'))) + var5) << 10) >>> 14) ^ var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
