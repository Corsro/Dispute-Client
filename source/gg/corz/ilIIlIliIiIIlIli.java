package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum ilIIlIliIiIIlIli {
   llIiiiIlIi,
   iIIiiiIlIi,
   IiIiiiIlIi,
   IlIiiiIlIi,
   ilIiiiIlIi;

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      MethodType var16 = var2;
      int[] var13 = new int[13];
      int var9 = System.identityHashCode(var13) + 1954353678;
      int var11 = (System.identityHashCode(var13) ^ -697218244) + -2130362717;
      int var12 = System.identityHashCode(var13) + -1891102212;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) << 1 | (char)(var4[var5] << 10 | var4[var5] >>> 6) >>> 15) >>> 15 | (char)((char)(var4[var5] << 10 | var4[var5] >>> 6) << 1 | (char)(var4[var5] << 10 | var4[var5] >>> 6) >>> 15) << 1))) ^ '웄') >>> 6 | (char)((char)(~((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) << 1 | (char)(var4[var5] << 10 | var4[var5] >>> 6) >>> 15) >>> 15 | (char)((char)(var4[var5] << 10 | var4[var5] >>> 6) << 1 | (char)(var4[var5] << 10 | var4[var5] >>> 6) >>> 15) << 1))) ^ '웄') << 10) - '蔞') ^ var5) ^ var5) ^ 17800) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) << 1 | (char)(var4[var5] << 10 | var4[var5] >>> 6) >>> 15) >>> 15 | (char)((char)(var4[var5] << 10 | var4[var5] >>> 6) << 1 | (char)(var4[var5] << 10 | var4[var5] >>> 6) >>> 15) << 1))) ^ '웄') >>> 6 | (char)((char)(~((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) << 1 | (char)(var4[var5] << 10 | var4[var5] >>> 6) >>> 15) >>> 15 | (char)((char)(var4[var5] << 10 | var4[var5] >>> 6) << 1 | (char)(var4[var5] << 10 | var4[var5] >>> 6) >>> 15) << 1))) ^ '웄') << 10) - '蔞') ^ var5) ^ var5) ^ 17800) << 15) - var5));
         ++var5;
         if ((System.identityHashCode(var16) ^ System.identityHashCode(var16)) != 0) {
            throw new VerifyError("Inconsistent flow at 22513");
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      int[] var13 = new int[6];
      int var9 = System.identityHashCode(var13) ^ -1871340386;
      int var11 = (System.identityHashCode(var13) ^ -55314193) + -109104752;
      int var12 = System.identityHashCode(var13) + -655748428;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] << 14 | var4[var5] >>> 2))) + '\ue7b3') >>> 5 | (char)((char)(~((char)(var4[var5] << 14 | var4[var5] >>> 2))) + '\ue7b3') << 11) ^ var5) + var5) - var5))) - 14915) >>> 8 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] << 14 | var4[var5] >>> 2))) + '\ue7b3') >>> 5 | (char)((char)(~((char)(var4[var5] << 14 | var4[var5] >>> 2))) + '\ue7b3') << 11) ^ var5) + var5) - var5))) - 14915) << 8))))) - var5) + '쏣') - '鏂') - 21228));
         ++var5;
         if (var12 - var12 != 0) {
            IIllllIlll = ~IIllllIlll;
            throw null;
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static Class liiiIIllIl(String var0, ClassLoader var1) {
      if (var0 != null && !var0.isEmpty()) {
         return MethodType.fromMethodDescriptorString("()".concat(var0), var1).returnType();
      } else {
         throw new IllegalArgumentException("Input string cannot be null or empty");
      }
   }

   public static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      if ((var1.hashCode() ^ System.identityHashCode(var0)) != (var1.hashCode() ^ System.identityHashCode(var0))) {
         throw new BootstrapMethodError();
      } else {
         MutableCallSite var4 = new MutableCallSite(var2);
         String var5 = "IilliliilIIi";
         Object[] var6 = new Object[]{var4, var0, var2, var3, var1.hashCode()};
         MethodHandle var7 = MethodHandles.insertArguments(var5, 0, var6).asCollector(Object[].class, var2.parameterCount()).asType(var2);
         if ((var1.hashCode() ^ System.identityHashCode(var0)) != (var1.hashCode() ^ System.identityHashCode(var0))) {
            throw new BootstrapMethodError();
         } else {
            var4.setTarget(var7);
            return var4;
         }
      }
   }

   private static Object IilliliilIIi(MutableCallSite var0, MethodHandles.Lookup var1, MethodType var2, String var3, int var4, Object[] var5) {
      int var6 = (Integer)var5[var5.length - 1];
      String[] var7 = lIiiIiIlilli(var3, var4 ^ var6, 120).split("\n");
      int var8 = Integer.parseInt(var7[0]);
      Class var10 = var1.lookupClass();
      ClassLoader var11 = Thread.currentThread().getContextClassLoader();
      if (var11 == null) {
         var11 = var10.getClassLoader();
      }

      Class var9 = Class.forName(var7[1], false, var11);
      int var16 = var6 ^ System.identityHashCode(var0) ^ System.identityHashCode(var5);
      MethodHandle var12;
      if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -1701315140) != (Integer.rotateLeft(-1450498496 ^ var16, var16 & 31) ^ -1701315140)) {
         if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 131243401) != (Integer.rotateLeft(372464658 ^ var16, var16 & 31) ^ 131243401)) {
            if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -1698648053) != (Integer.rotateLeft(-38957607 ^ var16, var16 & 31) ^ -1698648053)) {
               if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -2003337748) != (Integer.rotateLeft(1139836191 ^ var16, var16 & 31) ^ -2003337748)) {
                  if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -1891688420) != (Integer.rotateLeft(1035171342 ^ var16, var16 & 31) ^ -1891688420)) {
                     if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -1246307279) != (Integer.rotateLeft(-1806279430 ^ var16, var16 & 31) ^ -1246307279)) {
                        if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -1624139351) != (Integer.rotateLeft(1449840661 ^ var16, var16 & 31) ^ -1624139351)) {
                           throw new BootstrapMethodError();
                        }

                        var12 = var1.findSetter(var9, var7[2], liiiIIllIl(var7[3], var11));
                     } else {
                        var12 = var1.findStatic(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11));
                     }
                  } else {
                     var12 = var1.findGetter(var9, var7[2], liiiIIllIl(var7[3], var11));
                  }
               } else {
                  var12 = var1.findStaticSetter(var9, var7[2], liiiIIllIl(var7[3], var11));
               }
            } else {
               var12 = var1.findSpecial(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11), var10);
            }
         } else {
            var12 = var1.findStaticGetter(var9, var7[2], liiiIIllIl(var7[3], var11));
         }
      } else {
         var12 = var1.findVirtual(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11));
      }

      MethodType var13 = var2.dropParameterTypes(var2.parameterCount() - 1, var2.parameterCount());
      var12 = var12.asFixedArity().asType(var13);
      MethodHandle var14 = MethodHandles.dropArguments(var12, var13.parameterCount(), new Class[]{Integer.TYPE});
      var0.setTarget(var14);
      MutableCallSite.syncAll(new MutableCallSite[]{var0});
      Object[] var15 = Arrays.copyOf(var5, var5.length - 1);
      return var12.invokeWithArguments(var15);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 679528808392839135L ^ Long.rotateLeft(7834515203434563134L, 39) ^ 8077014133170519424L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -8802947074903417069L ^ Long.rotateLeft(-1349859082487256509L, 54) ^ 3582948007468365602L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -4154783112528800286L ^ Long.rotateLeft(-5934598634362836000L, 7) ^ 2685347317103589238L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1162247079933668468L ^ Long.rotateLeft(-3420940385005418769L, 12) ^ -3591318000226637750L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8708115421737160079L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 4597510559857522073L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8260528004296923828L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 8536446842280606660L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -2977414584439491711L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 3837852803519257044L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIIllIIliIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IlIlllIlilIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IiIlliIliiIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIlllIlliIll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Illlllllilll<invokedynamic>());
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
   private static ilIIlIliIiIIlIli[] IliIlllilIi() {
      return new ilIIlIliIiIIlIli[]{iIIiiiIlIi, IlIiiiIlIi, llIiiiIlIi, ilIiiiIlIi, IiIiiiIlIi};
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      int[] var13 = new int[10];
      int var8;
      int var9 = (var8 = System.identityHashCode(var13)) ^ 821953140;
      int var11 = System.identityHashCode(var13) ^ -380648840 ^ 1809662140;
      int var12 = System.identityHashCode(var13) + -2018647835;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 23940) - 21633) - '캃') + '膭') + var5) ^ '뉺'))))) ^ 22584) + '辈'))) >>> 6 | (char)(-((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 23940) - 21633) - '캃') + '膭') + var5) ^ '뉺'))))) ^ 22584) + '辈'))) << 10) ^ 3443) + var5) >>> 11 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 23940) - 21633) - '캃') + '膭') + var5) ^ '뉺'))))) ^ 22584) + '辈'))) >>> 6 | (char)(-((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 23940) - 21633) - '캃') + '膭') + var5) ^ '뉺'))))) ^ 22584) + '辈'))) << 10) ^ 3443) + var5) << 5) - var5))));
         ++var5;
         if ((var9 ^ var8 ^ 821953140 ^ 1) == 0) {
            iIlllIllll = ~iIlllIllll;
            throw null;
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      int[] var13 = new int[6];
      int var9 = System.identityHashCode(var13) + -1982371291;
      int var11 = (System.identityHashCode(var13) ^ -1217281861) + 1559817779;
      int var12 = System.identityHashCode(var13) + -302895564;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)(~((char)(~((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] + '녈') + 28391) - var5))) ^ 10233) ^ var5))))))) << 1 | (char)(~((char)(~((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] + '녈') + 28391) - var5))) ^ 10233) ^ var5))))))) >>> 15))) ^ '쑧') ^ '폟') + var5));
         ++var5;
         if ((var13.length ^ 6 ^ 1) == 0) {
            throw null;
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static String lIiiIiIlilli(String var0, int var1, int var2) {
      byte[] var3 = Base64.getDecoder().decode(var0);

      for(int var5 = 0; var5 < var3.length; ++var5) {
         var3[var5] = (byte)(var3[var5] + var5 - var2 ^ var1);
      }

      return new String(var3, StandardCharsets.UTF_8);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      int[] var13 = new int[25];
      int var9 = System.identityHashCode(var13) + -250980605;
      int var10;
      int var11 = (var10 = System.identityHashCode(var13) ^ -627783765) + 1695408374;
      int var12 = System.identityHashCode(var13) + -2138578851;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) - var5))) ^ var5) + '\uf2d7') + 29734) >>> 1 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) - var5))) ^ var5) + '\uf2d7') + 29734) << 15) ^ '\ue0a8') ^ var5) << 8 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) - var5))) ^ var5) + '\uf2d7') + 29734) >>> 1 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) - var5))) ^ var5) + '\uf2d7') + 29734) << 15) ^ '\ue0a8') ^ var5) >>> 8) ^ var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) - var5))) ^ var5) + '\uf2d7') + 29734) >>> 1 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) - var5))) ^ var5) + '\uf2d7') + 29734) << 15) ^ '\ue0a8') ^ var5) << 8 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) - var5))) ^ var5) + '\uf2d7') + 29734) >>> 1 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) - var5))) ^ var5) + '\uf2d7') + 29734) << 15) ^ '\ue0a8') ^ var5) >>> 8) ^ var5) << 12));
         ++var5;
         if (var11 - var10 - 1695408374 != 0) {
            throw null;
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
