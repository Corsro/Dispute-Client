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
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class lllliiIlillliiIl {
   public static final Pattern lIilllIlll = Pattern.compile(IIIllIIliIIl<invokedynamic>());

   public static boolean IliIlllilIi(String name) {
      return name != null && lIilllIlll.matcher(name).matches();
   }

   private lllliiIlillliiIl() {
   }

   public static String IilliliilIIi(Collection<String> online, String now, Predicate<String> rng, Map<String, Long> skip, long askedUntil, Random self) {
      List var7 = iIlIlllllill(online, now, rng, skip, askedUntil);
      return var7.isEmpty() ? null : (String)var7.get(self == null ? 0 : self.nextInt(var7.size()));
   }

   public static List<String> iIlIlllllill(Collection<String> skip, String now, Predicate<String> online, Map<String, Long> self, long askedUntil) {
      ArrayList var6 = new ArrayList();
      if (skip == null) {
         return var6;
      } else {
         HashSet var7 = new HashSet();
         String var8 = liiiIIllIl(now);

         for(String var10 : skip) {
            if (IliIlllilIi(var10)) {
               String var11 = liiiIIllIl(var10);
               if (!var11.equals(var8) && var7.add(var11) && (online == null || !online.test(var10))) {
                  Long var12 = self == null ? null : (Long)self.get(var11);
                  if (var12 == null || var12 <= askedUntil) {
                     var6.add(var10);
                  }
               }
            }
         }

         return var6;
      }
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(-((char)(var4[var5] + 9066))) + 12443))))) + '觔') - 2469) - '흿') ^ var5) ^ 26515))))) + var5) ^ 24677)) + var5)) + 25966));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) >>> 8 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) << 8) << 8 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) >>> 8 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) << 8) >>> 8) ^ '놄') >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) >>> 8 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) << 8) << 8 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) >>> 8 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) << 8) >>> 8) ^ '놄') << 14))) << 10 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) >>> 8 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) << 8) << 8 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) >>> 8 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) << 8) >>> 8) ^ '놄') >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) >>> 8 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) << 8) << 8 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) >>> 8 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) << 8) >>> 8) ^ '놄') << 14))) >>> 6) << 2 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) >>> 8 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) << 8) << 8 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) >>> 8 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) << 8) >>> 8) ^ '놄') >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) >>> 8 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) << 8) << 8 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) >>> 8 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) << 8) >>> 8) ^ '놄') << 14))) << 10 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) >>> 8 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) << 8) << 8 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) >>> 8 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) << 8) >>> 8) ^ '놄') >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) >>> 8 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) << 8) << 8 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) >>> 8 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 6 | (char)((char)(var4[var5] + var5) ^ var5) >>> 10))) + var5) - var5) - '鈆') - 15997) ^ var5) << 8) >>> 8) ^ '놄') << 14))) >>> 6) >>> 14) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String liiiIIllIl(String name) {
      return name == null ? "" : name.toLowerCase(Locale.ROOT);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ 24992) - '쪪'))) + 20535) << 11 | (char)((char)(~((char)((char)((char)(-var4[var5]) ^ 24992) - '쪪'))) + 20535) >>> 5))) + '\ue2d4') - var5) + '\ue87e') >>> 8 | (char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ 24992) - '쪪'))) + 20535) << 11 | (char)((char)(~((char)((char)((char)(-var4[var5]) ^ 24992) - '쪪'))) + 20535) >>> 5))) + '\ue2d4') - var5) + '\ue87e') << 8))) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -5144484987837816877L ^ Long.rotateLeft(3121188998992439347L, 4) ^ -8052946177648305999L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8963497202420058006L ^ Long.rotateLeft(2499856613605390004L, 28) ^ 2906706892990032455L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 9064151792682267217L ^ Long.rotateLeft(1690546747289888636L, 58) ^ -6641574458521452310L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 7404842764642399165L ^ Long.rotateLeft(-4426997510832653013L, 43) ^ -4005211982998382191L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8286184524440894301L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2117532516281997454L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2088388356511070622L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4398875340542279213L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7218221641621706985L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6689037929978267504L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IlIlllIlilIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIlliIliiIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIlllIlliIll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Illlllllilll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iilllilliill<invokedynamic>());
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
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(-((char)((char)((char)(-((char)((char)(-((char)(-((char)(var4[var5] + var5))))) << 9 | (char)(-((char)(-((char)(var4[var5] + var5))))) >>> 7))) >>> 7 | (char)(-((char)((char)(-((char)(-((char)(var4[var5] + var5))))) << 9 | (char)(-((char)(-((char)(var4[var5] + var5))))) >>> 7))) << 9) + '즛'))))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static void lIiiIiIlilli(Map<String, Long> max, long askedUntil, int now) {
      if (max != null) {
         max.values().removeIf((nowx) -> nowx == null || nowx <= askedUntil);

         while(max.size() > Math.max(0, now)) {
            String var4 = null;
            long var5 = Long.MAX_VALUE;

            for(Map.Entry var8 : max.entrySet()) {
               if (var4 == null || (Long)var8.getValue() < var5) {
                  var5 = (Long)var8.getValue();
                  var4 = (String)var8.getKey();
               }
            }

            max.remove(var4);
         }

      }
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 11 | var4[var5] >>> 5))) - '\uf709') ^ var5) ^ var5) ^ var5))))) + 30028))))) << 14 | (char)(-((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 11 | var4[var5] >>> 5))) - '\uf709') ^ var5) ^ var5) ^ var5))))) + 30028))))) >>> 2) - 8987))) ^ '쁼') + var5) << 8 | (char)((char)((char)(-((char)((char)((char)(-((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 11 | var4[var5] >>> 5))) - '\uf709') ^ var5) ^ var5) ^ var5))))) + 30028))))) << 14 | (char)(-((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 11 | var4[var5] >>> 5))) - '\uf709') ^ var5) ^ var5) ^ var5))))) + 30028))))) >>> 2) - 8987))) ^ '쁼') + var5) >>> 8) >>> 1 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 11 | var4[var5] >>> 5))) - '\uf709') ^ var5) ^ var5) ^ var5))))) + 30028))))) << 14 | (char)(-((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 11 | var4[var5] >>> 5))) - '\uf709') ^ var5) ^ var5) ^ var5))))) + 30028))))) >>> 2) - 8987))) ^ '쁼') + var5) << 8 | (char)((char)((char)(-((char)((char)((char)(-((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 11 | var4[var5] >>> 5))) - '\uf709') ^ var5) ^ var5) ^ var5))))) + 30028))))) << 14 | (char)(-((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 11 | var4[var5] >>> 5))) - '\uf709') ^ var5) ^ var5) ^ var5))))) + 30028))))) >>> 2) - 8987))) ^ '쁼') + var5) >>> 8) << 15) ^ 2314));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
