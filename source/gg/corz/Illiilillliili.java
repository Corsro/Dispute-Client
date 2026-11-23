package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Illiilillliili {
   private static final lIIiIliliIIiIlil[] lllIIllIIl = lIIiIliliIIiIlil.values();
   public static final int iIlIIllIIl = 4096;
   private final int[] lilIIllIIl;
   private final LinkedHashMap<Long, long[]> IIiIIllIIl;
   private long illIIllIIl = 1L;
   private int IilIIllIIl;
   private final int[] iilIIllIIl;
   private static final iIiIiiilIliIiiil[] IllIIllIIl = iIiIiiilIliIiiil.values();

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) << 6 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) >>> 10) << 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) << 6 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) >>> 10) >>> 3) ^ var5) - var5) - var5) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) << 6 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) >>> 10) << 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) << 6 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) >>> 10) >>> 3) ^ var5) - var5) - var5) >>> 9) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) << 6 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) >>> 10) << 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) << 6 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) >>> 10) >>> 3) ^ var5) - var5) - var5) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) << 6 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) >>> 10) << 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) << 6 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) >>> 10) >>> 3) ^ var5) - var5) - var5) >>> 9) << 7) ^ var5))) << 13 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) << 6 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) >>> 10) << 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) << 6 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) >>> 10) >>> 3) ^ var5) - var5) - var5) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) << 6 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) >>> 10) << 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) << 6 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) >>> 10) >>> 3) ^ var5) - var5) - var5) >>> 9) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) << 6 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) >>> 10) << 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) << 6 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) >>> 10) >>> 3) ^ var5) - var5) - var5) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) << 6 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) >>> 10) << 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) << 6 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) << 1 | (char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) ^ '\ued6f') + 20084) >>> 15) + var5) >>> 10) >>> 3) ^ var5) - var5) - var5) >>> 9) << 7) ^ var5))) >>> 3));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iIlIlllllill(lIIiIliliIIiIlil e) {
      int var10002 = this.iilIIllIIl[e.ordinal()]++;
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -5183384082691343253L ^ Long.rotateLeft(4981860708261896202L, 52) ^ 1920908309485022510L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7508672182889416524L ^ Long.rotateLeft(261441862431833704L, 42) ^ -7046698143394723166L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -6974849148284872769L ^ Long.rotateLeft(-5026747767385143929L, 7) ^ 2949902598600987644L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 7460956448522580964L ^ Long.rotateLeft(4116280594254281957L, 7) ^ 6774262521215755102L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6915629260982907530L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -9161781966807108039L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -346932530042107768L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -1750983005112524292L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 671523828529593611L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 5106786106360793475L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iiilliiliiil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIIilIIiiIIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IlIillIiilIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IiIiliIiiiIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIlilIliiIli<invokedynamic>());
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

   public int IiIlliIliiIl(lIIiIliliIIiIlil e) {
      return this.iilIIllIIl[e.ordinal()];
   }

   public int Illlllllilll() {
      return this.IIiIIllIIl.size();
   }

   public int IlIlllIlilIl(iIiIiiilIliIiiil e) {
      return this.lilIIllIIl[e.ordinal()];
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) ^ var5))) - '쪑') + '뫕') + 14748) + 30117) ^ 8436) ^ var5) - var5))) >>> 13 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) ^ var5))) - '쪑') + '뫕') + 14748) + 30117) ^ 8436) ^ var5) - var5))) << 3) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long IIIllIIliIIl(long familyKey) {
      long[] var3 = (long[])this.IIiIIllIIl.get(familyKey);
      return var3 == null ? 0L : var3[0];
   }

   public int IilliliilIIi(long familyKey) {
      long[] var3 = (long[])this.IIiIIllIIl.remove(familyKey);
      if (var3 == null || var3[0] != this.illIIllIIl) {
         var3 = new long[]{this.illIIllIIl, 0L};
         ++this.IilIIllIIl;
      }

      int var10002 = var3[1]++;
      this.IIiIIllIIl.put(familyKey, var3);
      return (int)var3[1];
   }

   public long IliIlllilIi() {
      return this.illIIllIIl;
   }

   public String IIillIiliIil() {
      long var8 = -6896165943769131997L;
      long var10 = -8862941452015922712L;
      StringBuilder var1 = new StringBuilder(160);
      var1.append(Ililllililil<invokedynamic>()).append(this.illIIllIIl).append(Ililllililil<invokedynamic>()).append(this.IilIIllIIl).append(Ililllililil<invokedynamic>());
      var8 ^= (4294967296L ^ var8) & -1L << 32;
      iIiIiiilIliIiiil[] var3 = IllIIllIIl;
      var8 ^= ((long)var3.length ^ var8) & -1L >>> 32;

      for(var10 ^= (0L ^ var10) & -1L << 32; (int)(var10 >>> 32) < (int)var8; var10 += 4294967296L) {
         iIiIiiilIliIiiil var6 = var3[(int)(var10 >>> 32)];
         var10 ^= ((long)this.lilIIllIIl[var6.ordinal()] ^ var10) & -1L >>> 32;
         if ((int)var10 != 0) {
            if ((int)(var8 >>> 32) == 0) {
               var1.append(',');
            }

            var1.append(var6.name()).append('=').append((int)var10);
            var8 ^= (0L ^ var8) & -1L << 32;
         }
      }

      var1.append(Ililllililil<invokedynamic>());
      var8 ^= (4294967296L ^ var8) & -1L << 32;
      lIIiIliliIIiIlil[] var12 = lllIIllIIl;
      var8 ^= ((long)var12.length ^ var8) & -1L >>> 32;

      for(var10 ^= (0L ^ var10) & -1L << 32; (int)(var10 >>> 32) < (int)var8; var10 += 4294967296L) {
         lIIiIliliIIiIlil var13 = var12[(int)(var10 >>> 32)];
         var10 ^= ((long)this.iilIIllIIl[var13.ordinal()] ^ var10) & -1L >>> 32;
         if ((int)var10 != 0) {
            if ((int)(var8 >>> 32) == 0) {
               var1.append(',');
            }

            var1.append(var13.name()).append('=').append((int)var10);
            var8 ^= (0L ^ var8) & -1L << 32;
         }
      }

      return var1.append('}').toString();
   }

   public Illiilillliili() {
      this.lilIIllIIl = new int[IllIIllIIl.length];
      this.iilIIllIIl = new int[lllIIllIIl.length];
      this.IIiIIllIIl = new LinkedHashMap<Long, long[]>(this, 0.75F, false) {
         protected boolean removeEldestEntry(Map.Entry<Long, long[]> e) {
            if (this.size() <= 4096) {
               return false;
            } else {
               if (((long[])e.getValue())[0] == Illiilillliili.this.illIIllIIl) {
                  --Illiilillliili.this.IilIIllIIl;
               }

               return true;
            }
         }
      };
   }

   public boolean iliIiiliiiii(long limit, int familyKey) {
      return this.lIiiIiIlilli(limit) >= familyKey;
   }

   public long liiiIIllIl(iIiIiiilIliIiiil e) {
      int var10002 = this.lilIIllIIl[e.ordinal()]++;
      ++this.illIIllIIl;
      this.IilIIllIIl = 0;
      return this.illIIllIIl;
   }

   public void Iilllilliill() {
      this.illIIllIIl = 1L;
      this.IilIIllIIl = 0;
      this.IIiIIllIIl.clear();
      Arrays.fill(this.lilIIllIIl, 0);
      Arrays.fill(this.iilIIllIIl, 0);
   }

   public int IIlllIlliIll() {
      return this.IilIIllIIl;
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(-((char)(~((char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) ^ '홿') ^ var5) >>> 10 | (char)((char)((char)(~var4[var5]) ^ '홿') ^ var5) << 6) ^ var5))) ^ var5))) ^ '\ue2f6') + 6141) << 8 | (char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) ^ '홿') ^ var5) >>> 10 | (char)((char)((char)(~var4[var5]) ^ '홿') ^ var5) << 6) ^ var5))) ^ var5))) ^ '\ue2f6') + 6141) >>> 8))))) << 4 | (char)(~((char)(~((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) ^ '홿') ^ var5) >>> 10 | (char)((char)((char)(~var4[var5]) ^ '홿') ^ var5) << 6) ^ var5))) ^ var5))) ^ '\ue2f6') + 6141) << 8 | (char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) ^ '홿') ^ var5) >>> 10 | (char)((char)((char)(~var4[var5]) ^ '홿') ^ var5) << 6) ^ var5))) ^ var5))) ^ '\ue2f6') + 6141) >>> 8))))) >>> 12) + 25410))))) ^ '긱'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int lIiiIiIlilli(long familyKey) {
      long[] var3 = (long[])this.IIiIIllIIl.get(familyKey);
      return var3 != null && var3[0] == this.illIIllIIl ? (int)var3[1] : 0;
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '뻭') - var5) - '뵵') ^ var5) >>> 6 | (char)((char)((char)((char)(var4[var5] - '뻭') - var5) - '뵵') ^ var5) << 10) + var5) - 21122) ^ 30175) - var5) - '궎'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)(~((char)(~((char)((char)(~((char)((char)(~((char)(-((char)((char)((char)((char)((char)(-((char)(var4[var5] + 14082))) + '跗') >>> 3 | (char)((char)(-((char)(var4[var5] + 14082))) + '跗') << 13) - '\ue40c') + var5))))) ^ '쨿'))) + '\uf64e'))))) ^ 4823))) + var5) - '\ueef9'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
