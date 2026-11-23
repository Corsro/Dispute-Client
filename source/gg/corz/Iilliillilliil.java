package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.fabricmc.loader.api.FabricLoader;

public final class Iilliillilliil {
   static final String IIIIIlllilIIIIllli = "corz";
   private static final String iIIIIllliIlIIIllli = "Loading ";
   private static final String llIIIllliilIIIllli = " mods:";

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - '쯺') ^ 27716) + '\ue2e0'))) - 8695) << 15 | (char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - '쯺') ^ 27716) + '\ue2e0'))) - 8695) >>> 1) - 11958) ^ 20975) + 13334) + 9538) << 7 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - '쯺') ^ 27716) + '\ue2e0'))) - 8695) << 15 | (char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - '쯺') ^ 27716) + '\ue2e0'))) - 8695) >>> 1) - 11958) ^ 20975) + 13334) + 9538) >>> 9) - 1682) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - '쯺') ^ 27716) + '\ue2e0'))) - 8695) << 15 | (char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - '쯺') ^ 27716) + '\ue2e0'))) - 8695) >>> 1) - 11958) ^ 20975) + 13334) + 9538) << 7 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - '쯺') ^ 27716) + '\ue2e0'))) - 8695) << 15 | (char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - '쯺') ^ 27716) + '\ue2e0'))) - 8695) >>> 1) - 11958) ^ 20975) + 13334) + 9538) >>> 9) - 1682) << 13))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static boolean liiiIIllIl(String line) {
      return line.toLowerCase(Locale.ROOT).contains(lIiiIiIlilli<invokedynamic>());
   }

   public static boolean IilliliilIIi() {
      try {
         Path var0 = FabricLoader.getInstance().getGameDir().resolve(lIiiIiIlilli<invokedynamic>()).resolve(lIiiIiIlilli<invokedynamic>());
         if (!Files.exists(var0, new LinkOption[0])) {
            return false;
         } else {
            List var1 = IliIlllilIi(Files.readAllLines(var0, StandardCharsets.UTF_8));
            Files.write(var0, var1, StandardCharsets.UTF_8);
            return true;
         }
      } catch (Exception var2) {
         return false;
      }
   }

   private Iilliillilliil() {
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] - var5) - 18474))) - 5547) << 4 | (char)((char)(-((char)((char)(var4[var5] - var5) - 18474))) - 5547) >>> 12))) ^ var5) - '\uf289') - 18982) >>> 1 | (char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] - var5) - 18474))) - 5547) << 4 | (char)((char)(-((char)((char)(var4[var5] - var5) - 18474))) - 5547) >>> 12))) ^ var5) - '\uf289') - 18982) << 15) >>> 5 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] - var5) - 18474))) - 5547) << 4 | (char)((char)(-((char)((char)(var4[var5] - var5) - 18474))) - 5547) >>> 12))) ^ var5) - '\uf289') - 18982) >>> 1 | (char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] - var5) - 18474))) - 5547) << 4 | (char)((char)(-((char)((char)(var4[var5] - var5) - 18474))) - 5547) >>> 12))) ^ var5) - '\uf289') - 18982) << 15) << 11) << 14 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] - var5) - 18474))) - 5547) << 4 | (char)((char)(-((char)((char)(var4[var5] - var5) - 18474))) - 5547) >>> 12))) ^ var5) - '\uf289') - 18982) >>> 1 | (char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] - var5) - 18474))) - 5547) << 4 | (char)((char)(-((char)((char)(var4[var5] - var5) - 18474))) - 5547) >>> 12))) ^ var5) - '\uf289') - 18982) << 15) >>> 5 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] - var5) - 18474))) - 5547) << 4 | (char)((char)(-((char)((char)(var4[var5] - var5) - 18474))) - 5547) >>> 12))) ^ var5) - '\uf289') - 18982) >>> 1 | (char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] - var5) - 18474))) - 5547) << 4 | (char)((char)(-((char)((char)(var4[var5] - var5) - 18474))) - 5547) >>> 12))) ^ var5) - '\uf289') - 18982) << 15) << 11) >>> 2) - var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 7526148869704530645L ^ Long.rotateLeft(4183500927961629383L, 5) ^ -7702731846124243030L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2665437885819822914L ^ Long.rotateLeft(-8768148710789215216L, 10) ^ 6638836954622607415L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6887610307689071131L ^ Long.rotateLeft(-2688681260460858157L, 60) ^ -1460326678092400713L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4088546456491472129L ^ Long.rotateLeft(-1134885398350761510L, 41) ^ 6138257957700650629L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6465360534244187042L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8767657662089838301L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 6208882132055567354L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3812208332152400278L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -336130444126672622L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -5897924805417402834L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IiIlliIliiIl<invokedynamic>());
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

   static String iIlIlllllill(String line) {
      long var7 = 5511359555434457782L;
      long var9 = 9091786877252121853L;
      long var11 = -2168373132838334946L;
      var7 ^= ((long)line.indexOf(lIiiIiIlilli<invokedynamic>()) << 32 ^ var7) & -1L << 32;
      if ((int)(var7 >>> 32) < 0) {
         return null;
      } else {
         var7 ^= ((long)((int)(var7 >>> 32) + lIiiIiIlilli<invokedynamic>().length()) ^ var7) & -1L >>> 32;
         var9 ^= ((long)line.indexOf(lIiiIiIlilli<invokedynamic>(), (int)var7) << 32 ^ var9) & -1L << 32;
         if ((int)(var9 >>> 32) < 0) {
            return null;
         } else {
            String var4 = line.substring((int)var7, (int)(var9 >>> 32)).trim();

            try {
               var9 ^= ((long)Integer.parseInt(var4) ^ var9) & -1L >>> 32;
            } catch (NumberFormatException var13) {
               return null;
            }

            var11 ^= ((long)Math.max(0, (int)var9 - 1) << 32 ^ var11) & -1L << 32;
            return line.substring(0, (int)var7) + (int)(var11 >>> 32) + line.substring((int)(var9 >>> 32));
         }
      }
   }

   public static List<String> IliIlllilIi(List<String> lines) {
      ArrayList var1 = new ArrayList(lines.size());

      for(String var3 : lines) {
         String var4 = iIlIlllllill(var3);
         if (var4 != null) {
            var1.add(var4);
         } else if (!liiiIIllIl(var3)) {
            var1.add(var3);
         }
      }

      return var1;
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(-((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) - 7735) ^ var5) + '\uf3a6'))))) - var5))) >>> 3 | (char)(~((char)((char)(-((char)(-((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) - 7735) ^ var5) + '\uf3a6'))))) - var5))) << 13) - var5) ^ var5) >>> 15 | (char)((char)((char)((char)(~((char)((char)(-((char)(-((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) - 7735) ^ var5) + '\uf3a6'))))) - var5))) >>> 3 | (char)(~((char)((char)(-((char)(-((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) - 7735) ^ var5) + '\uf3a6'))))) - var5))) << 13) - var5) ^ var5) << 1) - 29211))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 11 | (char)(~var4[var5]) << 5) << 4 | (char)((char)(~var4[var5]) >>> 11 | (char)(~var4[var5]) << 5) >>> 12) ^ '쒧') << 5 | (char)((char)((char)((char)(~var4[var5]) >>> 11 | (char)(~var4[var5]) << 5) << 4 | (char)((char)(~var4[var5]) >>> 11 | (char)(~var4[var5]) << 5) >>> 12) ^ '쒧') >>> 11) + 16103) + var5))) - 2429) ^ var5) + var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ var5) + var5) + var5) + 4684) + var5))) - var5) << 5 | (char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ var5) + var5) + var5) + 4684) + var5))) - var5) >>> 11) ^ var5) - 30449) ^ var5) - 29779) << 9 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ var5) + var5) + var5) + 4684) + var5))) - var5) << 5 | (char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ var5) + var5) + var5) + 4684) + var5))) - var5) >>> 11) ^ var5) - 30449) ^ var5) - 29779) >>> 7) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ var5) + var5) + var5) + 4684) + var5))) - var5) << 5 | (char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ var5) + var5) + var5) + 4684) + var5))) - var5) >>> 11) ^ var5) - 30449) ^ var5) - 29779) << 9 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ var5) + var5) + var5) + 4684) + var5))) - var5) << 5 | (char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ var5) + var5) + var5) + 4684) + var5))) - var5) >>> 11) ^ var5) - 30449) ^ var5) - 29779) >>> 7) << 11) ^ '\uddf2'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
