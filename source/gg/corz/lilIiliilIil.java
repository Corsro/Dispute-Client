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
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class lilIiliilIil {
   public long IliliIlilliliIli;
   public long ililiIliIiiliIli;
   private final Map<lIliillliIliilll, ililiIlIiiliIl> lIiliIliiIiliIli = new HashMap();
   private static final int iilliIliIIiliIli = 256;
   public static final int IilliIlililliIli = 2;
   public static final double lllliIliillliIli = 0.6;

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '듕') - 6720) >>> 10 | (char)((char)(var4[var5] ^ '듕') - 6720) << 6) ^ var5) ^ var5) + 18857) << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '듕') - 6720) >>> 10 | (char)((char)(var4[var5] ^ '듕') - 6720) << 6) ^ var5) ^ var5) + 18857) >>> 5) << 6 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '듕') - 6720) >>> 10 | (char)((char)(var4[var5] ^ '듕') - 6720) << 6) ^ var5) ^ var5) + 18857) << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '듕') - 6720) >>> 10 | (char)((char)(var4[var5] ^ '듕') - 6720) << 6) ^ var5) ^ var5) + 18857) >>> 5) >>> 10) ^ var5) ^ 27286) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '듕') - 6720) >>> 10 | (char)((char)(var4[var5] ^ '듕') - 6720) << 6) ^ var5) ^ var5) + 18857) << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '듕') - 6720) >>> 10 | (char)((char)(var4[var5] ^ '듕') - 6720) << 6) ^ var5) ^ var5) + 18857) >>> 5) << 6 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '듕') - 6720) >>> 10 | (char)((char)(var4[var5] ^ '듕') - 6720) << 6) ^ var5) ^ var5) + 18857) << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '듕') - 6720) >>> 10 | (char)((char)(var4[var5] ^ '듕') - 6720) << 6) ^ var5) ^ var5) + 18857) >>> 5) >>> 10) ^ var5) ^ 27286) << 14) + var5))))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(-((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ var5) + var5) - '蕆'))) - var5))) - '엃'))) - 13074) + var5) << 4 | (char)((char)((char)(~((char)((char)(~((char)((char)(-((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ var5) + var5) - '蕆'))) - var5))) - '엃'))) - 13074) + var5) >>> 12)))) ^ '蹴') >>> 12 | (char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(-((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ var5) + var5) - '蕆'))) - var5))) - '엃'))) - 13074) + var5) << 4 | (char)((char)((char)(~((char)((char)(~((char)((char)(-((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) ^ var5) + var5) - '蕆'))) - var5))) - '엃'))) - 13074) + var5) >>> 12)))) ^ '蹴') << 4) - 12832) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean iIlIlllllill(lIliillliIliilll key, long supportShapes) {
      ililiIlIiiliIl var4 = (ililiIlIiiliIl)this.lIiliIliiIiliIli.get(key);
      return var4 != null && var4.IlIIIiillllIIIiill && var4.lIIIIiilliIIIIiill == supportShapes;
   }

   public String iliIiiliiiii() {
      return IIIllIIliIIl<invokedynamic>() + this.IliliIlilliliIli + IIIllIIliIIl<invokedynamic>() + this.ililiIliIiiliIli + IIIllIIliIIl<invokedynamic>() + this.lIiliIliiIiliIli.size();
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)(~((char)(~((char)((char)(~((char)((char)((char)((char)(-var4[var5]) << 1 | (char)(-var4[var5]) >>> 15) - '釾') + '\ufbc3'))) << 4 | (char)(~((char)((char)((char)((char)(-var4[var5]) << 1 | (char)(-var4[var5]) >>> 15) - '釾') + '\ufbc3'))) >>> 12))))) - var5) ^ 29400))) ^ '\uf234') ^ 12949));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IilliliilIIi() {
      return this.lIiliIliiIiliIli.size();
   }

   public lillIiIiiillIiIi IliIlllilIi(lIliillliIliilll supportShapes, long key, double tick, int distance) {
      ++this.IliliIlilliliIli;
      ililiIlIiiliIl var7 = (ililiIlIiiliIl)this.lIiliIliiIiliIli.get(supportShapes);
      if (var7 == null) {
         if (this.lIiliIliiIiliIli.size() >= 256) {
            this.lIiliIliiIiliIli.clear();
         }

         var7 = new ililiIlIiiliIl();
         this.lIiliIliiIiliIli.put(supportShapes, var7);
      }

      if (var7.lIIIIiilliIIIIiill != key) {
         var7.lliiililliliiilill = 0;
         var7.Iiiiilillliiiilill = (double)0.0F;
         var7.IlIIIiillllIIIiill = false;
         var7.lIIIIiilliIIIIiill = key;
      }

      ++var7.lliiililliliiilill;
      var7.iiiiilillIIIIIiill = tick;
      var7.Iiiiilillliiiilill = Math.max(var7.Iiiiilillliiiilill, tick);
      var7.ilIIIiillIiIIIiill = distance;
      if (var7.IlIIIiillllIIIiill) {
         return lillIiIiiillIiIi.iiIiIIiIIi;
      } else if (var7.lliiililliliiilill < 2 && !(tick >= 0.6)) {
         return lillIiIiiillIiIi.IiIiIIiIIi;
      } else {
         var7.IlIIIiillllIIIiill = true;
         ++this.ililiIliIiiliIli;
         return lillIiIiiillIiIi.liIiIIiIIi;
      }
   }

   public void lIiiIiIlilli() {
      this.lIiliIliiIiliIli.clear();
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) ^ 29772) - '\ue152') ^ '\ue594') ^ var5) + '镐') >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) ^ 29772) - '\ue152') ^ '\ue594') ^ var5) + '镐') << 8) + var5) - 29258))) - var5) + var5) - 6743) - var5) - 20957) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2255607527993839566L ^ Long.rotateLeft(-4606254124772286802L, 19) ^ 3694641456950852171L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -3366705805604467119L ^ Long.rotateLeft(-7958101467577607890L, 41) ^ -3868233272344695908L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 286665067232346670L ^ Long.rotateLeft(-1664863069051409721L, 47) ^ -8590094333944208156L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8776820716652348183L ^ Long.rotateLeft(5501041139549911112L, 54) ^ 3511443631980902397L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4323480205079376226L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -4269951224003256327L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7656037063493866301L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 2879212841815637459L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 8904696970319690683L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1635869364884109428L;
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
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) >>> 6 | (char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) << 10) >>> 4 | (char)((char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) >>> 6 | (char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) << 10) << 12) << 12 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) >>> 6 | (char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) << 10) >>> 4 | (char)((char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) >>> 6 | (char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) << 10) << 12) >>> 4) + 21461) ^ var5))) + var5) << 1 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) >>> 6 | (char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) << 10) >>> 4 | (char)((char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) >>> 6 | (char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) << 10) << 12) << 12 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) >>> 6 | (char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) << 10) >>> 4 | (char)((char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) >>> 6 | (char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) << 10) << 12) >>> 4) + 21461) ^ var5))) + var5) >>> 15))))) - 23774) + 4161) << 10 | (char)((char)((char)(-((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) >>> 6 | (char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) << 10) >>> 4 | (char)((char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) >>> 6 | (char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) << 10) << 12) << 12 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) >>> 6 | (char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) << 10) >>> 4 | (char)((char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) >>> 6 | (char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) << 10) << 12) >>> 4) + 21461) ^ var5))) + var5) << 1 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) >>> 6 | (char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) << 10) >>> 4 | (char)((char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) >>> 6 | (char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) << 10) << 12) << 12 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) >>> 6 | (char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) << 10) >>> 4 | (char)((char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) >>> 6 | (char)((char)((char)((char)((char)(var4[var5] - '엩') + var5) - var5) - 14209) ^ var5) << 10) << 12) >>> 4) + 21461) ^ var5))) + var5) >>> 15))))) - 23774) + 4161) >>> 6) ^ '钚'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public ililiIlIiiliIl liiiIIllIl(lIliillliIliilll key) {
      return (ililiIlIiiliIl)this.lIiliIliiIiliIli.get(key);
   }
}
