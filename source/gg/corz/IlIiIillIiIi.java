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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IlIiIillIiIi<K> {
   public final LinkedHashMap<K, Integer> IilliIIIllilliIIIl = new LinkedHashMap();
   public int IiIiiIIIlliIiiIIIl;
   public final List<K> iilliIIIlIIiliIIIl = new ArrayList();
   public int IliliIIIllliliIIIl = Integer.MIN_VALUE;
   public int liiliIIIliiiliIIIl;
   public int IIIiiIIIllIIiiIIIl;
   public int llIiiIIIlilIiiIIIl;
   public int ililiIIIlIiiliIIIl;
   public int lIiliIIIliIiliIIIl = Integer.MAX_VALUE;
   public final LinkedHashMap<K, Integer> lllliIIIlillliIIIl = new LinkedHashMap();
   public boolean iiIiiIIIlIIliiIIIl;
   public int iIIiiIIIlIlIiiIIIl;

   public String IilliliilIIi() {
      return lIiiIiIlilli<invokedynamic>() + this.IilliIIIllilliIIIl.size() + lIiiIiIlilli<invokedynamic>() + this.IiIiiIIIlliIiiIIIl + lIiiIiIlilli<invokedynamic>() + this.llIiiIIIlilIiiIIIl + lIiiIiIlilli<invokedynamic>() + this.ililiIIIlIiiliIIIl + lIiiIiIlilli<invokedynamic>() + this.liiliIIIliiiliIIIl + (this.lIiliIIIliIiliIIIl <= this.IliliIIIllliliIIIl ? lIiiIiIlilli<invokedynamic>() + this.lIiliIIIliIiliIIIl + lIiiIiIlilli<invokedynamic>() + this.IliliIIIllliliIIIl : "") + lIiiIiIlilli<invokedynamic>() + this.IIIiiIIIllIIiiIIIl + lIiiIiIlilli<invokedynamic>() + this.iIIiiIIIlIlIiiIIIl + (this.iilliIIIlIIiliIIIl.isEmpty() ? "" : lIiiIiIlilli<invokedynamic>() + this.iilliIIIlIIiliIIIl.size()) + (this.iiIiiIIIlIIliiIIIl ? lIiiIiIlilli<invokedynamic>() : "");
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) << 1 | (char)(var4[var5] >>> 7 | var4[var5] << 9) >>> 15))) ^ var5))) - '贌') + var5) + var5) >>> 7 | (char)((char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) << 1 | (char)(var4[var5] >>> 7 | var4[var5] << 9) >>> 15))) ^ var5))) - '贌') + var5) + var5) << 9) << 14 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) << 1 | (char)(var4[var5] >>> 7 | var4[var5] << 9) >>> 15))) ^ var5))) - '贌') + var5) + var5) >>> 7 | (char)((char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) << 1 | (char)(var4[var5] >>> 7 | var4[var5] << 9) >>> 15))) ^ var5))) - '贌') + var5) + var5) << 9) >>> 2) + var5) - 23766)));
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
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 32390) + var5) + var5) - var5) + var5))) ^ 'ꚁ') - '\ueed8'))) ^ 'ﺋ') - '蚾') ^ '鮴') << 13 | (char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 32390) + var5) + var5) - var5) + var5))) ^ 'ꚁ') - '\ueed8'))) ^ 'ﺋ') - '蚾') ^ '鮴') >>> 3) - var5))) >>> 4 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 32390) + var5) + var5) - var5) + var5))) ^ 'ꚁ') - '\ueed8'))) ^ 'ﺋ') - '蚾') ^ '鮴') << 13 | (char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 32390) + var5) + var5) - var5) + var5))) ^ 'ꚁ') - '\ueed8'))) ^ 'ﺋ') - '蚾') ^ '鮴') >>> 3) - var5))) << 12));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IliIlllilIi() {
      return this.IilliIIIllilliIIIl.isEmpty();
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ '護') >>> 3 | (char)(var4[var5] ^ '護') << 13))) - var5) ^ 15252) ^ var5) - var5) >>> 4 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ '護') >>> 3 | (char)(var4[var5] ^ '護') << 13))) - var5) ^ 15252) ^ var5) - var5) << 12))) << 7 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ '護') >>> 3 | (char)(var4[var5] ^ '護') << 13))) - var5) ^ 15252) ^ var5) - var5) >>> 4 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ '護') >>> 3 | (char)(var4[var5] ^ '護') << 13))) - var5) ^ 15252) ^ var5) - var5) << 12))) >>> 9))))) + var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int iIlIlllllill(ToIntFunction<K> maxStack) {
      long var5 = -627504902179137635L;
      var5 ^= (0L ^ var5) & -1L << 32;

      for(Map.Entry var4 : this.IilliIIIllilliIIIl.entrySet()) {
         var5 ^= ((long)((int)(var5 >>> 32) + iIIIilIiIlIIilIi.IliIlllilIi((Integer)var4.getValue(), maxStack.applyAsInt(var4.getKey()))) << 32 ^ var5) & -1L << 32;
      }

      return (int)(var5 >>> 32);
   }

   public boolean liiiIIllIl() {
      return this.iilliIIIlIIiliIIIl.isEmpty() && this.IIIiiIIIllIIiiIIIl >= this.iIIiiIIIlIlIiiIIIl;
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 182146442050736927L ^ Long.rotateLeft(2971022406332917387L, 45) ^ -7974373562960219180L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 558117356086092496L ^ Long.rotateLeft(5789388047471825962L, 36) ^ -8738551813154874170L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 2248666419200403348L ^ Long.rotateLeft(-1327583261432001635L, 8) ^ -5288873968791658816L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 7450651749553450832L ^ Long.rotateLeft(-7249777426883968686L, 8) ^ 7516839565709040590L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2570605307205011890L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 6870440369239282255L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6920957223859260470L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2241993902542223739L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 3077876951010781804L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -6216844033690445197L;
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

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') << 12 | (char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') >>> 4) >>> 4 | (char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') << 12 | (char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') >>> 4) << 12) + var5) >>> 15 | (char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') << 12 | (char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') >>> 4) >>> 4 | (char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') << 12 | (char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') >>> 4) << 12) + var5) << 1) ^ var5))) ^ '蚌'))) - var5) << 15 | (char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') << 12 | (char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') >>> 4) >>> 4 | (char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') << 12 | (char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') >>> 4) << 12) + var5) >>> 15 | (char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') << 12 | (char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') >>> 4) >>> 4 | (char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') << 12 | (char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') >>> 4) << 12) + var5) << 1) ^ var5))) ^ '蚌'))) - var5) >>> 1))) >>> 10 | (char)(-((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') << 12 | (char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') >>> 4) >>> 4 | (char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') << 12 | (char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') >>> 4) << 12) + var5) >>> 15 | (char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') << 12 | (char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') >>> 4) >>> 4 | (char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') << 12 | (char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') >>> 4) << 12) + var5) << 1) ^ var5))) ^ '蚌'))) - var5) << 15 | (char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') << 12 | (char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') >>> 4) >>> 4 | (char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') << 12 | (char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') >>> 4) << 12) + var5) >>> 15 | (char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') << 12 | (char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') >>> 4) >>> 4 | (char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') << 12 | (char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 30852) - '\uf039'))))) + '멚') >>> 4) << 12) + var5) << 1) ^ var5))) ^ '蚌'))) - var5) >>> 1))) << 6));
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
         var4[var5] = (char)((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)(~((char)((char)(~((char)(-((char)(-var4[var5]))))) >>> 9 | (char)(~((char)(-((char)(-var4[var5]))))) << 7))) + var5) ^ '궨') << 13 | (char)((char)((char)(~((char)((char)(~((char)(-((char)(-var4[var5]))))) >>> 9 | (char)(~((char)(-((char)(-var4[var5]))))) << 7))) + var5) ^ '궨') >>> 3))))) ^ 27758))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
