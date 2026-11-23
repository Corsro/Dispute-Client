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

public final class iIliIiIlliIi {
   private int IIlIIlIIllIlIIlIIl = -1;
   private int liIIIlIIliiIIIlIIl;
   private final Map<String, Long> ilIIIlIIlIiIIIlIIl = new LinkedHashMap();

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6850160563102867067L ^ Long.rotateLeft(4018501717090113188L, 34) ^ -7517913211025992137L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 5845535116243231318L ^ Long.rotateLeft(-9052250254796752181L, 41) ^ 4456034599220472439L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -8866317714771861437L ^ Long.rotateLeft(-4721578643941444412L, 63) ^ 4069138457769901795L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4768730033017276437L ^ Long.rotateLeft(-3999299930044821731L, 24) ^ 8887316738535741148L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3735917829617279506L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 6712802472645262957L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4068957704480317822L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7482164904256772569L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 3755959833114868774L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1676252723920297984L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Illlllllilll<invokedynamic>());
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
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(~var4[var5]))) + var5) << 14 | (char)((char)(~((char)(~var4[var5]))) + var5) >>> 2))) ^ 'ﮰ') - var5) << 13 | (char)((char)((char)(-((char)((char)((char)(~((char)(~var4[var5]))) + var5) << 14 | (char)((char)(~((char)(~var4[var5]))) + var5) >>> 2))) ^ 'ﮰ') - var5) >>> 3) ^ var5) - 17681) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long lIiiIiIlilli(String name, long lifetimeNow) {
      return lifetimeNow - (Long)this.ilIIIlIIlIiIIIlIIl.getOrDefault(name, 0L);
   }

   public void IliIlllilIi(int lifetime, Map<String, Long> tick) {
      ++this.liIIIlIIliiIIIlIIl;
      this.IIlIIlIIllIlIIlIIl = lifetime;
      this.ilIIIlIIlIiIIIlIIl.clear();
      this.ilIIIlIIlIiIIIlIIl.putAll(tick);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)var4[var5] ^ var5) + var5) + var5) + var5) << 4 | (char)((char)((char)((char)((char)var4[var5] ^ var5) + var5) + var5) + var5) >>> 12))) - var5) ^ 13814) + 'ﳺ') + '핔'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) - var5) << 4 | (char)((char)(~((char)(var4[var5] ^ var5))) - var5) >>> 12) - 29070) ^ 29187))) + var5) >>> 13 | (char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) - var5) << 4 | (char)((char)(~((char)(var4[var5] ^ var5))) - var5) >>> 12) - 29070) ^ 29187))) + var5) << 3) + '荦') >>> 13 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) - var5) << 4 | (char)((char)(~((char)(var4[var5] ^ var5))) - var5) >>> 12) - 29070) ^ 29187))) + var5) >>> 13 | (char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) - var5) << 4 | (char)((char)(~((char)(var4[var5] ^ var5))) - var5) >>> 12) - 29070) ^ 29187))) + var5) << 3) + '荦') << 3) - 'ꗲ') - var5))) - '錟') ^ '\udba8') << 8 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) - var5) << 4 | (char)((char)(~((char)(var4[var5] ^ var5))) - var5) >>> 12) - 29070) ^ 29187))) + var5) >>> 13 | (char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) - var5) << 4 | (char)((char)(~((char)(var4[var5] ^ var5))) - var5) >>> 12) - 29070) ^ 29187))) + var5) << 3) + '荦') >>> 13 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) - var5) << 4 | (char)((char)(~((char)(var4[var5] ^ var5))) - var5) >>> 12) - 29070) ^ 29187))) + var5) >>> 13 | (char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) - var5) << 4 | (char)((char)(~((char)(var4[var5] ^ var5))) - var5) >>> 12) - 29070) ^ 29187))) + var5) << 3) + '荦') << 3) - 'ꗲ') - var5))) - '錟') ^ '\udba8') >>> 8) ^ 26011) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String iliIiiliiiii(int tick, Map<String, Long> lifetime) {
      StringBuilder var3 = (new StringBuilder(IIIllIIliIIl<invokedynamic>())).append(this.liIIIlIIliiIIIlIIl).append(IIIllIIliIIl<invokedynamic>()).append(this.IIlIIlIIllIlIIlIIl < 0 ? 0 : (tick - this.IIlIIlIIllIlIIlIIl) / 20).append('s');

      for(Map.Entry var5 : lifetime.entrySet()) {
         String var6 = (String)var5.getKey();
         var3.append(IIIllIIliIIl<invokedynamic>()).append(Character.toUpperCase(var6.charAt(0))).append(var6.substring(1)).append('=').append(this.lIiiIiIlilli(var6, (Long)var5.getValue()));
      }

      return var3.toString();
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] + 13175))) + '뷔') + '鿁'))) - 14416) ^ var5) + 29099) - var5) << 1 | (char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] + 13175))) + '뷔') + '鿁'))) - 14416) ^ var5) + 29099) - var5) >>> 15))) ^ var5) >>> 10 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] + 13175))) + '뷔') + '鿁'))) - 14416) ^ var5) + 29099) - var5) << 1 | (char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] + 13175))) + '뷔') + '鿁'))) - 14416) ^ var5) + 29099) - var5) >>> 15))) ^ var5) << 6) << 4 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] + 13175))) + '뷔') + '鿁'))) - 14416) ^ var5) + 29099) - var5) << 1 | (char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] + 13175))) + '뷔') + '鿁'))) - 14416) ^ var5) + 29099) - var5) >>> 15))) ^ var5) >>> 10 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] + 13175))) + '뷔') + '鿁'))) - 14416) ^ var5) + 29099) - var5) << 1 | (char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] + 13175))) + '뷔') + '鿁'))) - 14416) ^ var5) + 29099) - var5) >>> 15))) ^ var5) << 6) >>> 12) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IilliliilIIi() {
      return this.IIlIIlIIllIlIIlIIl >= 0;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) >>> 5 | (char)((char)(var4[var5] - var5) - var5) << 11) << 11 | (char)((char)((char)(var4[var5] - var5) - var5) >>> 5 | (char)((char)(var4[var5] - var5) - var5) << 11) >>> 5) - var5) >>> 10 | (char)((char)((char)((char)((char)(var4[var5] - var5) - var5) >>> 5 | (char)((char)(var4[var5] - var5) - var5) << 11) << 11 | (char)((char)((char)(var4[var5] - var5) - var5) >>> 5 | (char)((char)(var4[var5] - var5) - var5) << 11) >>> 5) - var5) << 6) + var5) + 26936) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) >>> 5 | (char)((char)(var4[var5] - var5) - var5) << 11) << 11 | (char)((char)((char)(var4[var5] - var5) - var5) >>> 5 | (char)((char)(var4[var5] - var5) - var5) << 11) >>> 5) - var5) >>> 10 | (char)((char)((char)((char)((char)(var4[var5] - var5) - var5) >>> 5 | (char)((char)(var4[var5] - var5) - var5) << 11) << 11 | (char)((char)((char)(var4[var5] - var5) - var5) >>> 5 | (char)((char)(var4[var5] - var5) - var5) << 11) >>> 5) - var5) << 6) + var5) + 26936) >>> 11) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int iIlIlllllill() {
      return this.IIlIIlIIllIlIIlIIl;
   }

   public int liiiIIllIl() {
      return this.liIIIlIIliiIIIlIIl;
   }
}
