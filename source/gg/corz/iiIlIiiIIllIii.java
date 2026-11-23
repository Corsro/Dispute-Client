package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public record iiIlIiiIIllIii(int minUnlocks, Set<Long> scope, int tempBudget, String why) {
   private final int liIIiilIIl;
   private final Set<Long> iiIIiilIIl;
   private final String lIlIiilIIl;
   private final int IIlIiilIIl;

   public int IlIlllIlilIl() {
      return this.IIlIiilIIl;
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(-var4[var5]) + var5) >>> 3 | (char)((char)(-var4[var5]) + var5) << 13) ^ 24929))) - var5))) + '걉') - 10767) - var5))) + '퀵') << 2 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(-var4[var5]) + var5) >>> 3 | (char)((char)(-var4[var5]) + var5) << 13) ^ 24929))) - var5))) + '걉') - 10767) - var5))) + '퀵') >>> 14) ^ 1948) ^ var5) ^ var5) + '뀍'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public Set<Long> IIIllIIliIIl() {
      return this.iiIIiilIIl;
   }

   public int iliIiiliiiii() {
      return this.liIIiilIIl;
   }

   public static iiIlIiiIIllIii liiiIIllIl(Set<Long> tempBudget, int blocked) {
      long var3 = -5563370856641991169L;
      var3 ^= ((long)(tempBudget == null ? 0 : tempBudget.size()) << 32 ^ var3) & -1L << 32;
      return new iiIlIiiIIllIii(Math.max(1, Math.min(3, (int)(var3 >>> 32))), tempBudget, blocked, IIlllIlliIll<invokedynamic>());
   }

   public boolean lIiiIiIlilli() {
      return this.liIIiilIIl >= 3 || this.iIlIlllllill();
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3553960008194841600L ^ Long.rotateLeft(2519479587803029232L, 38) ^ 6674417803643449393L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -517793205786879341L ^ Long.rotateLeft(-5046733443282365881L, 53) ^ 2637217013358755958L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -4215772397591053722L ^ Long.rotateLeft(7576831634647512561L, 44) ^ 6082342468155392981L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5504577695590023680L ^ Long.rotateLeft(-6352819417038695276L, 56) ^ 8518577196089650825L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8309742661789515072L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8414901376484481328L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -2176521819209120877L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5321653113635559556L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -2489510923627788931L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -7589912280246618690L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Illlllllilll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iilllilliill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIillIiliIil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Ililllililil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iiilliiliiil<invokedynamic>());
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
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(-((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) >>> 15 | (char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) << 1))))))))) + var5))) ^ var5) << 5 | (char)((char)(-((char)((char)(-((char)(-((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) >>> 15 | (char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) << 1))))))))) + var5))) ^ var5) >>> 11) + var5) - '꺾') << 14 | (char)((char)((char)((char)((char)(-((char)((char)(-((char)(-((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) >>> 15 | (char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) << 1))))))))) + var5))) ^ var5) << 5 | (char)((char)(-((char)((char)(-((char)(-((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) >>> 15 | (char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) << 1))))))))) + var5))) ^ var5) >>> 11) + var5) - '꺾') >>> 2) - '裊') >>> 15 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(-((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) >>> 15 | (char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) << 1))))))))) + var5))) ^ var5) << 5 | (char)((char)(-((char)((char)(-((char)(-((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) >>> 15 | (char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) << 1))))))))) + var5))) ^ var5) >>> 11) + var5) - '꺾') << 14 | (char)((char)((char)((char)((char)(-((char)((char)(-((char)(-((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) >>> 15 | (char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) << 1))))))))) + var5))) ^ var5) << 5 | (char)((char)(-((char)((char)(-((char)(-((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) >>> 15 | (char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) << 1))))))))) + var5))) ^ var5) >>> 11) + var5) - '꺾') >>> 2) - '裊') << 1))) >>> 1 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(-((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) >>> 15 | (char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) << 1))))))))) + var5))) ^ var5) << 5 | (char)((char)(-((char)((char)(-((char)(-((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) >>> 15 | (char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) << 1))))))))) + var5))) ^ var5) >>> 11) + var5) - '꺾') << 14 | (char)((char)((char)((char)((char)(-((char)((char)(-((char)(-((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) >>> 15 | (char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) << 1))))))))) + var5))) ^ var5) << 5 | (char)((char)(-((char)((char)(-((char)(-((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) >>> 15 | (char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) << 1))))))))) + var5))) ^ var5) >>> 11) + var5) - '꺾') >>> 2) - '裊') >>> 15 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(-((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) >>> 15 | (char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) << 1))))))))) + var5))) ^ var5) << 5 | (char)((char)(-((char)((char)(-((char)(-((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) >>> 15 | (char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) << 1))))))))) + var5))) ^ var5) >>> 11) + var5) - '꺾') << 14 | (char)((char)((char)((char)((char)(-((char)((char)(-((char)(-((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) >>> 15 | (char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) << 1))))))))) + var5))) ^ var5) << 5 | (char)((char)(-((char)((char)(-((char)(-((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) >>> 15 | (char)((char)((char)(var4[var5] + '냽') << 4 | (char)(var4[var5] + '냽') >>> 12) - var5) << 1))))))))) + var5))) ^ var5) >>> 11) + var5) - '꺾') >>> 2) - '裊') << 1))) << 15));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) - 26660) ^ '襜') << 6 | (char)((char)((char)(-((char)(var4[var5] + var5))) - 26660) ^ '襜') >>> 10) - '믰') + 5714) << 8 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) - 26660) ^ '襜') << 6 | (char)((char)((char)(-((char)(var4[var5] + var5))) - 26660) ^ '襜') >>> 10) - '믰') + 5714) >>> 8) + 23619) - var5) + 'ﳚ') ^ var5) - 24791) ^ 8713) + '괙') ^ '뤥'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean iIlIlllllill() {
      return !this.iiIIiilIIl.isEmpty();
   }

   public boolean IilliliilIIi(Collection<Long> cluster) {
      if (!this.iIlIlllllill()) {
         return true;
      } else {
         for(long var3 : cluster) {
            if (this.iiIIiilIIl.contains(var3)) {
               return true;
            }
         }

         return false;
      }
   }

   public String IiIlliIliiIl() {
      return this.lIlIiilIIl;
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 9228) ^ var5) - 15755) + '鄾') ^ '뷰'))))) - '\udab1') ^ var5) + 15146));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static iiIlIiiIIllIii IliIlllilIi() {
      return new iiIlIiiIIllIii(3, Set.of(), 12, IIlllIlliIll<invokedynamic>());
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)(var4[var5] ^ '츽') + '멝'))))) - var5) - var5))) + '褾'))) ^ '璉'))) - '\ue1f7') - var5) + var5) >>> 6 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)(var4[var5] ^ '츽') + '멝'))))) - var5) - var5))) + '褾'))) ^ '璉'))) - '\ue1f7') - var5) + var5) << 10) << 4 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)(var4[var5] ^ '츽') + '멝'))))) - var5) - var5))) + '褾'))) ^ '璉'))) - '\ue1f7') - var5) + var5) >>> 6 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)(var4[var5] ^ '츽') + '멝'))))) - var5) - var5))) + '褾'))) ^ '璉'))) - '\ue1f7') - var5) + var5) << 10) >>> 12) << 10 | (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)(var4[var5] ^ '츽') + '멝'))))) - var5) - var5))) + '褾'))) ^ '璉'))) - '\ue1f7') - var5) + var5) >>> 6 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)(var4[var5] ^ '츽') + '멝'))))) - var5) - var5))) + '褾'))) ^ '璉'))) - '\ue1f7') - var5) + var5) << 10) << 4 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)(var4[var5] ^ '츽') + '멝'))))) - var5) - var5))) + '褾'))) ^ '璉'))) - '\ue1f7') - var5) + var5) >>> 6 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)(var4[var5] ^ '츽') + '멝'))))) - var5) - var5))) + '褾'))) ^ '璉'))) - '\ue1f7') - var5) + var5) << 10) >>> 12) >>> 6) ^ var5) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)(var4[var5] ^ '츽') + '멝'))))) - var5) - var5))) + '褾'))) ^ '璉'))) - '\ue1f7') - var5) + var5) >>> 6 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)(var4[var5] ^ '츽') + '멝'))))) - var5) - var5))) + '褾'))) ^ '璉'))) - '\ue1f7') - var5) + var5) << 10) << 4 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)(var4[var5] ^ '츽') + '멝'))))) - var5) - var5))) + '褾'))) ^ '璉'))) - '\ue1f7') - var5) + var5) >>> 6 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)(var4[var5] ^ '츽') + '멝'))))) - var5) - var5))) + '褾'))) ^ '璉'))) - '\ue1f7') - var5) + var5) << 10) >>> 12) << 10 | (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)(var4[var5] ^ '츽') + '멝'))))) - var5) - var5))) + '褾'))) ^ '璉'))) - '\ue1f7') - var5) + var5) >>> 6 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)(var4[var5] ^ '츽') + '멝'))))) - var5) - var5))) + '褾'))) ^ '璉'))) - '\ue1f7') - var5) + var5) << 10) << 4 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)(var4[var5] ^ '츽') + '멝'))))) - var5) - var5))) + '褾'))) ^ '璉'))) - '\ue1f7') - var5) + var5) >>> 6 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)(var4[var5] ^ '츽') + '멝'))))) - var5) - var5))) + '褾'))) ^ '璉'))) - '\ue1f7') - var5) + var5) << 10) >>> 12) >>> 6) ^ var5) << 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iiIlIiiIIllIii(int scope, Set<Long> why, int minUnlocks, String tempBudget) {
      why = why == null ? Set.of() : Set.copyOf(why);
      scope = Math.max(1, scope);
      this.liIIiilIIl = scope;
      this.iiIIiilIIl = why;
      this.IIlIiilIIl = minUnlocks;
      this.lIlIiilIIl = tempBudget;
   }
}
