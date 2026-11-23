package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1959;
import net.minecraft.class_1972;
import net.minecraft.class_5321;
import net.minecraft.class_6880;

public final class llllIliilllIli {
   private final Map<class_5321<class_1959>, Integer> IlIIlIIIIl = new HashMap();

   public int IliIlllilIi(class_6880<class_1959> dimension, int entry) {
      if (dimension == null) {
         return liiiIIllIl(entry);
      } else {
         Optional var3 = dimension.method_40230();
         if (var3.isEmpty()) {
            return liiiIIllIl(entry);
         } else {
            class_5321 var4 = (class_5321)var3.get();
            Integer var5 = (Integer)this.IlIIlIIIIl.get(var4);
            if (var5 == null) {
               var5 = iIlIlllllill(var4, entry);
               this.IlIIlIIIIl.put(var4, var5);
            }

            return var5;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4823730705710712890L ^ Long.rotateLeft(5418680558388448499L, 16) ^ 1537860820963338392L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1019490135388682385L ^ Long.rotateLeft(6116565051891000994L, 5) ^ 2366174983344533887L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -8224252764039655781L ^ Long.rotateLeft(5304061863705877548L, 2) ^ -1575304478333929119L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 8573000325928839446L ^ Long.rotateLeft(3538538904610354094L, 19) ^ 838708464137349412L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -6767141680332299247L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 3424673762734058510L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1358529241135931459L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -1424073720833157746L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -980361351801934405L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4652989555966149511L;
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
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)(~((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] ^ var5))) - '땔') + 8111))) ^ var5) ^ var5))) + 31737)))))) + var5) - 11818));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static boolean IilliliilIIi(class_5321<class_1959> ref, class_5321<class_1959> k) {
      return ref == k || ref.equals(k);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) << 4 | (char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) >>> 12) + var5) ^ var5) + 4499) - '鈙') << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) << 4 | (char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) >>> 12) + var5) ^ var5) + 4499) - '鈙') >>> 2) + var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) << 4 | (char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) >>> 12) + var5) ^ var5) + 4499) - '鈙') << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) << 4 | (char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) >>> 12) + var5) ^ var5) + 4499) - '鈙') >>> 2) + var5) << 5) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) << 4 | (char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) >>> 12) + var5) ^ var5) + 4499) - '鈙') << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) << 4 | (char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) >>> 12) + var5) ^ var5) + 4499) - '鈙') >>> 2) + var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) << 4 | (char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) >>> 12) + var5) ^ var5) + 4499) - '鈙') << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) << 4 | (char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) >>> 12) + var5) ^ var5) + 4499) - '鈙') >>> 2) + var5) << 5) >>> 12) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) << 4 | (char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) >>> 12) + var5) ^ var5) + 4499) - '鈙') << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) << 4 | (char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) >>> 12) + var5) ^ var5) + 4499) - '鈙') >>> 2) + var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) << 4 | (char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) >>> 12) + var5) ^ var5) + 4499) - '鈙') << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) << 4 | (char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) >>> 12) + var5) ^ var5) + 4499) - '鈙') >>> 2) + var5) << 5) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) << 4 | (char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) >>> 12) + var5) ^ var5) + 4499) - '鈙') << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) << 4 | (char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) >>> 12) + var5) ^ var5) + 4499) - '鈙') >>> 2) + var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) << 4 | (char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) >>> 12) + var5) ^ var5) + 4499) - '鈙') << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) << 4 | (char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 13) - var5) >>> 12) + var5) ^ var5) + 4499) - '鈙') >>> 2) + var5) << 5) >>> 12) << 10) + '鯥'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static int liiiIIllIl(int dimension) {
      if (dimension == 1) {
         return 21;
      } else {
         return dimension == 2 ? 26 : 1;
      }
   }

   private static int iIlIlllllill(class_5321<class_1959> k, int dimension) {
      if (IilliliilIIi(k, class_1972.field_37543)) {
         return 2;
      } else if (IilliliilIIi(k, class_1972.field_29218)) {
         return 3;
      } else if (IilliliilIIi(k, class_1972.field_28107)) {
         return 4;
      } else if (!IilliliilIIi(k, class_1972.field_9423) && !IilliliilIIi(k, class_1972.field_9446) && !IilliliilIIi(k, class_1972.field_9467) && !IilliliilIIi(k, class_1972.field_9470) && !IilliliilIIi(k, class_1972.field_9441) && !IilliliilIIi(k, class_1972.field_9439) && !IilliliilIIi(k, class_1972.field_9408) && !IilliliilIIi(k, class_1972.field_9435) && !IilliliilIIi(k, class_1972.field_9418)) {
         if (!IilliliilIIi(k, class_1972.field_9438) && !IilliliilIIi(k, class_1972.field_9463)) {
            if (!IilliliilIIi(k, class_1972.field_9434) && !IilliliilIIi(k, class_1972.field_9478) && !IilliliilIIi(k, class_1972.field_9419)) {
               if (IilliliilIIi(k, class_1972.field_9424)) {
                  return 8;
               } else if (!IilliliilIIi(k, class_1972.field_9415) && !IilliliilIIi(k, class_1972.field_9443) && !IilliliilIIi(k, class_1972.field_35110)) {
                  if (!IilliliilIIi(k, class_1972.field_9417) && !IilliliilIIi(k, class_1972.field_35118) && !IilliliilIIi(k, class_1972.field_9440)) {
                     if (!IilliliilIIi(k, class_1972.field_9420) && !IilliliilIIi(k, class_1972.field_9454) && !IilliliilIIi(k, class_1972.field_35119) && !IilliliilIIi(k, class_1972.field_35113)) {
                        if (!IilliliilIIi(k, class_1972.field_35117) && !IilliliilIIi(k, class_1972.field_9453) && !IilliliilIIi(k, class_1972.field_34472) && !IilliliilIIi(k, class_1972.field_35115) && !IilliliilIIi(k, class_1972.field_34474) && !IilliliilIIi(k, class_1972.field_34471)) {
                           if (!IilliliilIIi(k, class_1972.field_9471) && !IilliliilIIi(k, class_1972.field_38748)) {
                              if (IilliliilIIi(k, class_1972.field_9475)) {
                                 return 14;
                              } else if (IilliliilIIi(k, class_1972.field_55052)) {
                                 return 15;
                              } else if (!IilliliilIIi(k, class_1972.field_9451) && !IilliliilIIi(k, class_1972.field_9455) && !IilliliilIIi(k, class_1972.field_34470)) {
                                 if (!IilliliilIIi(k, class_1972.field_9449) && !IilliliilIIi(k, class_1972.field_9430) && !IilliliilIIi(k, class_1972.field_35114)) {
                                    if (IilliliilIIi(k, class_1972.field_9462)) {
                                       return 18;
                                    } else if (!IilliliilIIi(k, class_1972.field_9409) && !IilliliilIIi(k, class_1972.field_9414) && !IilliliilIIi(k, class_1972.field_9412) && !IilliliilIIi(k, class_1972.field_35112) && !IilliliilIIi(k, class_1972.field_42720) && !IilliliilIIi(k, class_1972.field_35120)) {
                                       if (!IilliliilIIi(k, class_1972.field_35116) && !IilliliilIIi(k, class_1972.field_35111) && !IilliliilIIi(k, class_1972.field_34475)) {
                                          if (IilliliilIIi(k, class_1972.field_9461)) {
                                             return 21;
                                          } else if (IilliliilIIi(k, class_1972.field_22077)) {
                                             return 22;
                                          } else if (IilliliilIIi(k, class_1972.field_22075)) {
                                             return 23;
                                          } else if (IilliliilIIi(k, class_1972.field_22076)) {
                                             return 24;
                                          } else if (IilliliilIIi(k, class_1972.field_23859)) {
                                             return 25;
                                          } else if (!IilliliilIIi(k, class_1972.field_9411) && !IilliliilIIi(k, class_1972.field_9442) && !IilliliilIIi(k, class_1972.field_9447) && !IilliliilIIi(k, class_1972.field_9457) && !IilliliilIIi(k, class_1972.field_9465)) {
                                             String var2 = k.method_29177().method_12832();
                                             if (var2.contains(lIiiIiIlilli<invokedynamic>())) {
                                                return 2;
                                             } else if (var2.contains(lIiiIiIlilli<invokedynamic>())) {
                                                return 3;
                                             } else if (var2.contains(lIiiIiIlilli<invokedynamic>())) {
                                                return 4;
                                             } else if (var2.contains(lIiiIiIlilli<invokedynamic>())) {
                                                return 5;
                                             } else if (var2.contains(lIiiIiIlilli<invokedynamic>())) {
                                                return 6;
                                             } else if (!var2.contains(lIiiIiIlilli<invokedynamic>()) && !var2.contains(lIiiIiIlilli<invokedynamic>())) {
                                                if (var2.contains(lIiiIiIlilli<invokedynamic>())) {
                                                   return 8;
                                                } else if (!var2.contains(lIiiIiIlilli<invokedynamic>()) && !var2.contains(lIiiIiIlilli<invokedynamic>())) {
                                                   if (var2.contains(lIiiIiIlilli<invokedynamic>())) {
                                                      return 10;
                                                   } else if (var2.contains(lIiiIiIlilli<invokedynamic>())) {
                                                      return 11;
                                                   } else if (!var2.contains(lIiiIiIlilli<invokedynamic>()) && !var2.contains(lIiiIiIlilli<invokedynamic>()) && !var2.contains(lIiiIiIlilli<invokedynamic>())) {
                                                      if (!var2.contains(lIiiIiIlilli<invokedynamic>()) && !var2.contains(lIiiIiIlilli<invokedynamic>())) {
                                                         if (var2.contains(lIiiIiIlilli<invokedynamic>())) {
                                                            return 14;
                                                         } else if (var2.contains(lIiiIiIlilli<invokedynamic>())) {
                                                            return 15;
                                                         } else if (!var2.contains(lIiiIiIlilli<invokedynamic>()) && !var2.contains(lIiiIiIlilli<invokedynamic>())) {
                                                            if (var2.contains(lIiiIiIlilli<invokedynamic>())) {
                                                               return 17;
                                                            } else if (var2.contains(lIiiIiIlilli<invokedynamic>())) {
                                                               return 18;
                                                            } else if (var2.contains(lIiiIiIlilli<invokedynamic>())) {
                                                               return 22;
                                                            } else if (var2.contains(lIiiIiIlilli<invokedynamic>())) {
                                                               return 23;
                                                            } else if (var2.contains(lIiiIiIlilli<invokedynamic>())) {
                                                               return 24;
                                                            } else if (var2.contains(lIiiIiIlilli<invokedynamic>())) {
                                                               return 25;
                                                            } else if (var2.contains(lIiiIiIlilli<invokedynamic>())) {
                                                               return 21;
                                                            } else if (var2.contains(lIiiIiIlilli<invokedynamic>())) {
                                                               return 26;
                                                            } else {
                                                               return var2.contains(lIiiIiIlilli<invokedynamic>()) ? 20 : liiiIIllIl(dimension);
                                                            }
                                                         } else {
                                                            return 16;
                                                         }
                                                      } else {
                                                         return 13;
                                                      }
                                                   } else {
                                                      return 12;
                                                   }
                                                } else {
                                                   return 9;
                                                }
                                             } else {
                                                return 7;
                                             }
                                          } else {
                                             return 26;
                                          }
                                       } else {
                                          return 19;
                                       }
                                    } else {
                                       return 20;
                                    }
                                 } else {
                                    return 17;
                                 }
                              } else {
                                 return 16;
                              }
                           } else {
                              return 13;
                           }
                        } else {
                           return 12;
                        }
                     } else {
                        return 11;
                     }
                  } else {
                     return 10;
                  }
               } else {
                  return 9;
               }
            } else {
               return 7;
            }
         } else {
            return 6;
         }
      } else {
         return 5;
      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) - 12641))) ^ 572) - var5) ^ var5))) + var5) + var5) ^ '\udc01'))) + var5) ^ var5) + '줃') - var5))))));
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
         var4[var5] = (char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) << 13 | (char)(var4[var5] >>> 3 | var4[var5] << 13) >>> 3) + 28631) ^ 22440)) + var5))) + var5) + '\udafe') - '템') ^ '辮'))) ^ '윑'))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)(var4[var5] - 1880))))) - '蒉') >>> 11 | (char)((char)(~((char)(~((char)(var4[var5] - 1880))))) - '蒉') << 5) ^ '\uf1a4') + '\ue6a1') + 'ꓡ') << 6 | (char)((char)((char)((char)((char)((char)(~((char)(~((char)(var4[var5] - 1880))))) - '蒉') >>> 11 | (char)((char)(~((char)(~((char)(var4[var5] - 1880))))) - '蒉') << 5) ^ '\uf1a4') + '\ue6a1') + 'ꓡ') >>> 10) + var5) ^ var5) + 15323) - var5) ^ 31326) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
