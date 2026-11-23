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
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class iiiIIIIlIIIlIIIl {
   public static final String lIiIliIlIl = "Random";
   private final Map<String, Integer> iliIliIlIl = new HashMap();
   public static final List<String> IliIliIlIl = List.of(IlIlllIlilIl<invokedynamic>(), IlIlllIlilIl<invokedynamic>(), IlIlllIlilIl<invokedynamic>(), IlIlllIlilIl<invokedynamic>(), IlIlllIlilIl<invokedynamic>(), IlIlllIlilIl<invokedynamic>());
   public static final int lliIliIlIl = 2;
   private int IiiIliIlIl;
   public static final List<String> iIiIliIlIl = List.of(IlIlllIlilIl<invokedynamic>(), IlIlllIlilIl<invokedynamic>(), IlIlllIlilIl<invokedynamic>(), IlIlllIlilIl<invokedynamic>(), IlIlllIlilIl<invokedynamic>(), IlIlllIlilIl<invokedynamic>(), IlIlllIlilIl<invokedynamic>());

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) ^ '쁶') >>> 6 | (char)((char)(var4[var5] << 12 | var4[var5] >>> 4) ^ '쁶') << 10) ^ var5) - var5))) - var5) ^ '阆') ^ 22814) >>> 14 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) ^ '쁶') >>> 6 | (char)((char)(var4[var5] << 12 | var4[var5] >>> 4) ^ '쁶') << 10) ^ var5) - var5))) - var5) ^ '阆') ^ 22814) << 2) >>> 15 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) ^ '쁶') >>> 6 | (char)((char)(var4[var5] << 12 | var4[var5] >>> 4) ^ '쁶') << 10) ^ var5) - var5))) - var5) ^ '阆') ^ 22814) >>> 14 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) ^ '쁶') >>> 6 | (char)((char)(var4[var5] << 12 | var4[var5] >>> 4) ^ '쁶') << 10) ^ var5) - var5))) - var5) ^ '阆') ^ 22814) << 2) << 1));
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
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) >>> 3 | (char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) << 13) - var5) << 3 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) >>> 3 | (char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) << 13) - var5) >>> 13) ^ 14799) << 10 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) >>> 3 | (char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) << 13) - var5) << 3 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) >>> 3 | (char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) << 13) - var5) >>> 13) ^ 14799) >>> 6) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) >>> 3 | (char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) << 13) - var5) << 3 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) >>> 3 | (char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) << 13) - var5) >>> 13) ^ 14799) << 10 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) >>> 3 | (char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) << 13) - var5) << 3 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) >>> 3 | (char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) << 13) - var5) >>> 13) ^ 14799) >>> 6) >>> 1))) >>> 15 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) >>> 3 | (char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) << 13) - var5) << 3 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) >>> 3 | (char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) << 13) - var5) >>> 13) ^ 14799) << 10 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) >>> 3 | (char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) << 13) - var5) << 3 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) >>> 3 | (char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) << 13) - var5) >>> 13) ^ 14799) >>> 6) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) >>> 3 | (char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) << 13) - var5) << 3 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) >>> 3 | (char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) << 13) - var5) >>> 13) ^ 14799) << 10 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) >>> 3 | (char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) << 13) - var5) << 3 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) >>> 3 | (char)((char)((char)(-var4[var5]) - var5) << 2 | (char)((char)(-var4[var5]) - var5) >>> 14) << 13) - var5) >>> 13) ^ 14799) >>> 6) >>> 1))) << 1));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iliIiiliiiii(String region) {
      if (region != null) {
         this.iliIliIlIl.remove(region);
      }

   }

   public int IIIllIIliIIl(String region) {
      return (Integer)this.iliIliIlIl.getOrDefault(region, 0);
   }

   public void lIiiIiIlilli(String region) {
      if (liiiIIllIl(region)) {
         this.iliIliIlIl.merge(region, 1, Integer::sum);
      }

   }

   public void IliIlllilIi() {
      this.iliIliIlIl.clear();
      this.IiiIliIlIl = 0;
   }

   public static String iIlIlllllill(String choice) {
      if (choice == null) {
         return null;
      } else {
         String var1 = choice.trim().toLowerCase(Locale.ROOT);
         return liiiIIllIl(var1) ? var1 : null;
      }
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ 21661) - '둢') ^ 17054))) ^ var5))) << 12 | (char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ 21661) - '둢') ^ 17054))) ^ var5))) >>> 4) ^ var5) + var5) + var5) + var5) + var5) - var5) ^ '腵') + var5) ^ '虵') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(-((char)((char)((char)(-((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) + var5) >>> 6 | (char)((char)((char)(~var4[var5]) - var5) + var5) << 10) - 15986) ^ 25003) ^ 29190) - 15810) - '鼄'))) + '\ud988'))))) << 2 | (char)(-((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) + var5) >>> 6 | (char)((char)((char)(~var4[var5]) - var5) + var5) << 10) - 15986) ^ 25003) ^ 29190) - 15810) - '鼄'))) + '\ud988'))))) >>> 14) + var5))))) << 15 | (char)(-((char)(-((char)((char)((char)(-((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) + var5) >>> 6 | (char)((char)((char)(~var4[var5]) - var5) + var5) << 10) - 15986) ^ 25003) ^ 29190) - 15810) - '鼄'))) + '\ud988'))))) << 2 | (char)(-((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) + var5) >>> 6 | (char)((char)((char)(~var4[var5]) - var5) + var5) << 10) - 15986) ^ 25003) ^ 29190) - 15810) - '鼄'))) + '\ud988'))))) >>> 14) + var5))))) >>> 1));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IilliliilIIi(String choice) {
      String var2 = iIlIlllllill(choice);
      if (var2 != null) {
         return var2;
      } else {
         int var3 = IliIliIlIl.size();

         for(int var4 = 0; var4 < var3; ++var4) {
            String var5 = (String)IliIliIlIl.get(Math.floorMod(this.IiiIliIlIl + var4, var3));
            if ((Integer)this.iliIliIlIl.getOrDefault(var5, 0) < 2) {
               this.IiiIliIlIl = Math.floorMod(this.IiiIliIlIl + var4 + 1, var3);
               return var5;
            }
         }

         this.iliIliIlIl.clear();
         String var6 = (String)IliIliIlIl.get(Math.floorMod(this.IiiIliIlIl, var3));
         this.IiiIliIlIl = Math.floorMod(this.IiiIliIlIl + 1, var3);
         return var6;
      }
   }

   public static boolean liiiIIllIl(String region) {
      return region != null && IliIliIlIl.contains(region);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) >>> 1 | (char)(-((char)(-var4[var5]))) << 15) << 5 | (char)((char)(-((char)(-var4[var5]))) >>> 1 | (char)(-((char)(-var4[var5]))) << 15) >>> 11) ^ '魈') - 14889) ^ 18477) ^ '趢'))))) + var5) >>> 6 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) >>> 1 | (char)(-((char)(-var4[var5]))) << 15) << 5 | (char)((char)(-((char)(-var4[var5]))) >>> 1 | (char)(-((char)(-var4[var5]))) << 15) >>> 11) ^ '魈') - 14889) ^ 18477) ^ '趢'))))) + var5) << 10) >>> 5 | (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) >>> 1 | (char)(-((char)(-var4[var5]))) << 15) << 5 | (char)((char)(-((char)(-var4[var5]))) >>> 1 | (char)(-((char)(-var4[var5]))) << 15) >>> 11) ^ '魈') - 14889) ^ 18477) ^ '趢'))))) + var5) >>> 6 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) >>> 1 | (char)(-((char)(-var4[var5]))) << 15) << 5 | (char)((char)(-((char)(-var4[var5]))) >>> 1 | (char)(-((char)(-var4[var5]))) << 15) >>> 11) ^ '魈') - 14889) ^ 18477) ^ '趢'))))) + var5) << 10) << 11) - var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1996191746312171731L ^ Long.rotateLeft(5575200891353801712L, 19) ^ 3520694103219023271L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6325782357990952278L ^ Long.rotateLeft(3745865194312383901L, 20) ^ 5687498608266074923L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8958867078770474556L ^ Long.rotateLeft(-4212459612336010814L, 30) ^ -2577191871220339636L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 3278099565360148587L ^ Long.rotateLeft(5986973125299693979L, 60) ^ -8878134862024124621L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8642097116216634390L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 9063074823907524301L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -1119725774154670761L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5066993785410643415L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -3978010233240615529L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 7025181121349781952L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IiIlliIliiIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIlllIlliIll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Illlllllilll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Iilllilliill<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIillIiliIil<invokedynamic>());
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
}
