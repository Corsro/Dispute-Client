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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class illIiIIlIilIiIIl {
   public static final List<String> iIiiIIilIl = List.of(IIlilIliiIli<invokedynamic>(), IIlilIliiIli<invokedynamic>(), IIlilIliiIli<invokedynamic>(), IIlilIliiIli<invokedynamic>(), IIlilIliiIli<invokedynamic>(), IIlilIliiIli<invokedynamic>());

   public static int liiiIIllIl(int wantedFacing, boolean facesPlacer) {
      if (wantedFacing >= 0 && !iiIiIIilIIliIIil.iIlIlllllill(wantedFacing)) {
         return facesPlacer ? iiIiIIilIIliIIil.IliIlllilIi(wantedFacing) : wantedFacing;
      } else {
         return -1;
      }
   }

   public static boolean Iilllilliill(boolean anyMissing, boolean anyPlacementItemAvailable) {
      return anyMissing && !anyPlacementItemAvailable;
   }

   private static float lIiiIiIlilli(float degrees) {
      float var1 = degrees % 360.0F;
      if (var1 >= 180.0F) {
         var1 -= 360.0F;
      }

      if (var1 < -180.0F) {
         var1 += 360.0F;
      }

      return var1;
   }

   public static boolean IIlllIlliIll(Map<String, String> actual, Map<String, String> wanted) {
      for(String var3 : iIiiIIilIl) {
         if (!Boolean.parseBoolean((String)actual.getOrDefault(var3, IIlilIliiIli<invokedynamic>())) && Boolean.parseBoolean((String)wanted.getOrDefault(var3, IIlilIliiIli<invokedynamic>()))) {
            return true;
         }
      }

      return false;
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ var5) ^ '\uefef'))) ^ var5) >>> 4 | (char)((char)(~((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ var5) ^ '\uefef'))) ^ var5) << 12) << 14 | (char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ var5) ^ '\uefef'))) ^ var5) >>> 4 | (char)((char)(~((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ var5) ^ '\uefef'))) ^ var5) << 12) >>> 2))))) + var5) - var5))) + 21746) << 6 | (char)((char)(~((char)((char)((char)(~((char)(-((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ var5) ^ '\uefef'))) ^ var5) >>> 4 | (char)((char)(~((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ var5) ^ '\uefef'))) ^ var5) << 12) << 14 | (char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ var5) ^ '\uefef'))) ^ var5) >>> 4 | (char)((char)(~((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ var5) ^ '\uefef'))) ^ var5) << 12) >>> 2))))) + var5) - var5))) + 21746) >>> 10) + 24358));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean IiIiliIiiiIi(int axis, String look) {
      long var4 = -1763151530296262652L;
      if (look == null) {
         return true;
      } else {
         var4 ^= ((long)(axis != 5 && axis != 4 ? 0 : 1) << 32 ^ var4) & -1L << 32;
         var4 ^= ((long)(axis != 2 && axis != 3 ? 0 : 1) ^ var4) & -1L >>> 32;
         return (boolean)(IIlilIliiIli<invokedynamic>().equals(look) ? (int)(var4 >>> 32) : (IIlilIliiIli<invokedynamic>().equals(look) ? (int)var4 : 0));
      }
   }

   public static boolean Illlllllilll(String actualType, String partnerPresent, boolean wantedType) {
      return !wantedType && !IIlilIliiIli<invokedynamic>().equals(actualType) && IIlilIliiIli<invokedynamic>().equals(partnerPresent);
   }

   private illIiIIlIilIiIIl() {
   }

   public static boolean iliIiiliiiii(String actualFacing, String wantFacing, String wantType, String actualType) {
      if (actualFacing != null && wantFacing != null && wantType != null && actualType != null) {
         if (!IIlilIliiIli<invokedynamic>().equals(wantFacing) && !IIlilIliiIli<invokedynamic>().equals(actualType)) {
            return IIIllIIliIIl(actualFacing).equals(wantType) && IlIlllIlilIl(wantFacing).equals(actualType);
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static int IliIlllilIi(illIlIIiIilIlIIi wantedFacing, int mount) {
      int var10000;
      switch (wantedFacing.ordinal()) {
         case 0 -> var10000 = 0;
         case 1 -> var10000 = iiIiIIilIIliIIil.IliIlllilIi(mount);
         case 2 -> var10000 = 1;
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   private static String IlIlllIlilIl(String t) {
      long var3 = -4480652488857412657L;
      var3 ^= (-4294967296L ^ var3) & -1L << 32;
      switch (t.hashCode()) {
         case 3317767:
            if (t.equals(IIlilIliiIli<invokedynamic>())) {
               var3 ^= (0L ^ var3) & -1L << 32;
            }
            break;
         case 108511772:
            if (t.equals(IIlilIliiIli<invokedynamic>())) {
               var3 ^= (4294967296L ^ var3) & -1L << 32;
            }
      }

      String var10000;
      switch ((int)(var3 >>> 32)) {
         case 0 -> var10000 = IIlilIliiIli<invokedynamic>();
         case 1 -> var10000 = IIlilIliiIli<invokedynamic>();
         default -> var10000 = "";
      }

      return var10000;
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ 5107) << 8 | (char)(var4[var5] ^ 5107) >>> 8) ^ '\udc78')))) >>> 12 | (char)((char)(~((char)((char)((char)(var4[var5] ^ 5107) << 8 | (char)(var4[var5] ^ 5107) >>> 8) ^ '\udc78')))) << 4) ^ var5) ^ var5) >>> 4 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ 5107) << 8 | (char)(var4[var5] ^ 5107) >>> 8) ^ '\udc78')))) >>> 12 | (char)((char)(~((char)((char)((char)(var4[var5] ^ 5107) << 8 | (char)(var4[var5] ^ 5107) >>> 8) ^ '\udc78')))) << 4) ^ var5) ^ var5) << 12) >>> 1 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ 5107) << 8 | (char)(var4[var5] ^ 5107) >>> 8) ^ '\udc78')))) >>> 12 | (char)((char)(~((char)((char)((char)(var4[var5] ^ 5107) << 8 | (char)(var4[var5] ^ 5107) >>> 8) ^ '\udc78')))) << 4) ^ var5) ^ var5) >>> 4 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ 5107) << 8 | (char)(var4[var5] ^ 5107) >>> 8) ^ '\udc78')))) >>> 12 | (char)((char)(~((char)((char)((char)(var4[var5] ^ 5107) << 8 | (char)(var4[var5] ^ 5107) >>> 8) ^ '\udc78')))) << 4) ^ var5) ^ var5) << 12) << 15))) ^ 30144) ^ var5) ^ '끝'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static int IilliliilIIi(float playerYaw) {
      return Math.floorMod((int)Math.floor((double)((playerYaw + 180.0F) / 22.5F + 0.5F)), 16);
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '꽓') >>> 15 | (char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '꽓') << 1))))) ^ 'ﭰ') - '軤') ^ var5) + '藘') + var5) - 8531) ^ 16280))))) + var5))) << 3 | (char)(-((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '꽓') >>> 15 | (char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '꽓') << 1))))) ^ 'ﭰ') - '軤') ^ var5) + '藘') + var5) - 8531) ^ 16280))))) + var5))) >>> 13) + var5) >>> 11 | (char)((char)((char)(-((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '꽓') >>> 15 | (char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '꽓') << 1))))) ^ 'ﭰ') - '軤') ^ var5) + '藘') + var5) - 8531) ^ 16280))))) + var5))) << 3 | (char)(-((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '꽓') >>> 15 | (char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '꽓') << 1))))) ^ 'ﭰ') - '軤') ^ var5) + '藘') + var5) - 8531) ^ 16280))))) + var5))) >>> 13) + var5) << 5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static float iIlIlllllill(int rotation) {
      long var2 = 6637069553845437879L;
      var2 ^= ((long)Math.floorMod(rotation, 16) << 32 ^ var2) & -1L << 32;
      return lIiiIiIlilli((float)((int)(var2 >>> 32)) * 22.5F - 180.0F);
   }

   private static String IIIllIIliIIl(String f) {
      long var3 = -5730347011090844812L;
      var3 ^= (-4294967296L ^ var3) & -1L << 32;
      switch (f.hashCode()) {
         case 3105789:
            if (f.equals(IIlilIliiIli<invokedynamic>())) {
               var3 ^= (8589934592L ^ var3) & -1L << 32;
            }
            break;
         case 3645871:
            if (f.equals(IIlilIliiIli<invokedynamic>())) {
               var3 ^= (12884901888L ^ var3) & -1L << 32;
            }
            break;
         case 105007365:
            if (f.equals(IIlilIliiIli<invokedynamic>())) {
               var3 ^= (0L ^ var3) & -1L << 32;
            }
            break;
         case 109627853:
            if (f.equals(IIlilIliiIli<invokedynamic>())) {
               var3 ^= (4294967296L ^ var3) & -1L << 32;
            }
      }

      String var10000;
      switch ((int)(var3 >>> 32)) {
         case 0 -> var10000 = IIlilIliiIli<invokedynamic>();
         case 1 -> var10000 = IIlilIliiIli<invokedynamic>();
         case 2 -> var10000 = IIlilIliiIli<invokedynamic>();
         case 3 -> var10000 = IIlilIliiIli<invokedynamic>();
         default -> var10000 = "";
      }

      return var10000;
   }

   public static List<String> IiIlliIliiIl(Map<String, String> wanted, Map<String, String> actual) {
      ArrayList var2 = new ArrayList();

      for(String var4 : iIiiIIilIl) {
         if (Boolean.parseBoolean((String)wanted.getOrDefault(var4, IIlilIliiIli<invokedynamic>())) && !Boolean.parseBoolean((String)actual.getOrDefault(var4, IIlilIliiIli<invokedynamic>()))) {
            var2.add(var4);
         }
      }

      return var2;
   }

   public static String IIIilIIiiIIi(String shape) {
      long var3 = 1734403786409753045L;
      if (shape == null) {
         return null;
      } else {
         var3 ^= (-4294967296L ^ var3) & -1L << 32;
         switch (shape.hashCode()) {
            case -1823545122:
               if (shape.equals(IIlilIliiIli<invokedynamic>())) {
                  var3 ^= (4294967296L ^ var3) & -1L << 32;
               }
               break;
            case -1818924634:
               if (shape.equals(IIlilIliiIli<invokedynamic>())) {
                  var3 ^= (8589934592L ^ var3) & -1L << 32;
               }
               break;
            case 617340435:
               if (shape.equals(IIlilIliiIli<invokedynamic>())) {
                  var3 ^= (0L ^ var3) & -1L << 32;
               }
               break;
            case 1603462404:
               if (shape.equals(IIlilIliiIli<invokedynamic>())) {
                  var3 ^= (17179869184L ^ var3) & -1L << 32;
               }
               break;
            case 1604002486:
               if (shape.equals(IIlilIliiIli<invokedynamic>())) {
                  var3 ^= (21474836480L ^ var3) & -1L << 32;
               }
               break;
            case 1780673713:
               if (shape.equals(IIlilIliiIli<invokedynamic>())) {
                  var3 ^= (12884901888L ^ var3) & -1L << 32;
               }
         }

         String var10000;
         switch ((int)(var3 >>> 32)) {
            case 0:
            case 1:
            case 2:
               var10000 = IIlilIliiIli<invokedynamic>();
               break;
            case 3:
            case 4:
            case 5:
               var10000 = IIlilIliiIli<invokedynamic>();
               break;
            default:
               var10000 = null;
         }

         return var10000;
      }
   }

   public static boolean Ililllililil(int confirmedBreaks, int limit) {
      return confirmedBreaks < Math.max(0, limit);
   }

   public static boolean IlIillIiilIi(String neighboursComplete, String got, boolean want) {
      if (neighboursComplete != null && got != null) {
         if (neighboursComplete.equals(got)) {
            return true;
         } else if (!want && Iiilliiliiil(got)) {
            String var3 = IIIilIIiiIIi(neighboursComplete);
            return var3 == null || var3.equals(IIIilIIiiIIi(got));
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ 5622) + '闘') ^ var5) >>> 7 | (char)((char)((char)(var4[var5] ^ 5622) + '闘') ^ var5) << 9))) ^ 18145) >>> 7 | (char)((char)(~((char)((char)((char)((char)(var4[var5] ^ 5622) + '闘') ^ var5) >>> 7 | (char)((char)((char)(var4[var5] ^ 5622) + '闘') ^ var5) << 9))) ^ 18145) << 9) - 17301) + '챗') + var5))))) << 9 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ 5622) + '闘') ^ var5) >>> 7 | (char)((char)((char)(var4[var5] ^ 5622) + '闘') ^ var5) << 9))) ^ 18145) >>> 7 | (char)((char)(~((char)((char)((char)((char)(var4[var5] ^ 5622) + '闘') ^ var5) >>> 7 | (char)((char)((char)(var4[var5] ^ 5622) + '闘') ^ var5) << 9))) ^ 18145) << 9) - 17301) + '챗') + var5))))) >>> 7) ^ var5) - '\ud8e9') ^ 9097) << 14 | (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ 5622) + '闘') ^ var5) >>> 7 | (char)((char)((char)(var4[var5] ^ 5622) + '闘') ^ var5) << 9))) ^ 18145) >>> 7 | (char)((char)(~((char)((char)((char)((char)(var4[var5] ^ 5622) + '闘') ^ var5) >>> 7 | (char)((char)((char)(var4[var5] ^ 5622) + '闘') ^ var5) << 9))) ^ 18145) << 9) - 17301) + '챗') + var5))))) << 9 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ 5622) + '闘') ^ var5) >>> 7 | (char)((char)((char)(var4[var5] ^ 5622) + '闘') ^ var5) << 9))) ^ 18145) >>> 7 | (char)((char)(~((char)((char)((char)((char)(var4[var5] ^ 5622) + '闘') ^ var5) >>> 7 | (char)((char)((char)(var4[var5] ^ 5622) + '闘') ^ var5) << 9))) ^ 18145) << 9) - 17301) + '챗') + var5))))) >>> 7) ^ var5) - '\ud8e9') ^ 9097) >>> 2) + var5) ^ 23466));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) + 28036) + var5) - var5) ^ '\uda0e') >>> 7 | (char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) + 28036) + var5) - var5) ^ '\uda0e') << 9) - var5))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4007268332078791473L ^ Long.rotateLeft(-6549279903626951013L, 54) ^ 4859162628901779084L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -4234108566029457807L ^ Long.rotateLeft(7487782481450941285L, 13) ^ 6127670476549721437L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -7304090131667405539L ^ Long.rotateLeft(6064066696882525767L, 31) ^ 6744056235750215371L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 4645332053227694222L ^ Long.rotateLeft(5098493578553927510L, 58) ^ -5096001145119926040L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7524752346453653222L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8676999814886679303L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4000111812741820339L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -1883960496200317104L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 7896847992475275758L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -693698982407813389L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Illillliilli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iilililiiili<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIiilIiiiIii<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Iliilliiilii<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iiiiliiiiiii<invokedynamic>());
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

   private static boolean Iiilliiliiil(String shape) {
      return IIlilIliiIli<invokedynamic>().equals(shape) || IIlilIliiIli<invokedynamic>().equals(shape);
   }

   public static boolean IIillIiliIil(boolean interactive, boolean fullCube, boolean materialInHotbar, boolean defaultState, boolean stateful) {
      return !interactive && !fullCube && materialInHotbar && defaultState && stateful;
   }
}
