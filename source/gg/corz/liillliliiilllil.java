package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class liillliliiilllil {
   private final int IlilliiIil;
   private final ArrayDeque<iIllIiIlIlllIiIl> llilliiIil = new ArrayDeque();
   private final long lIilliiIil;
   private int IiilliiIil;
   private int ililliiIil;
   private final long iIilliiIil;

   public String Iiilliiliiil() {
      iIllIiIlIlllIiIl var1 = (iIllIiIlIlllIiIl)this.llilliiIil.peek();
      return var1 == null ? null : var1.IilliliilIIi();
   }

   public boolean IIIllIIliIIl() {
      return this.llilliiIil.isEmpty();
   }

   public int iliIiiliiiii() {
      return this.IiilliiIil;
   }

   public iIllIiIlIlllIiIl IlIlllIlilIl() {
      return (iIllIiIlIlllIiIl)this.llilliiIil.peek();
   }

   public boolean IIillIiliIil(long feet) {
      return feet == this.lIilliiIil;
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)(-((char)(-((char)(var4[var5] >>> 14 | var4[var5] << 2))))))) + var5) << 5 | (char)((char)(~((char)(-((char)(-((char)(var4[var5] >>> 14 | var4[var5] << 2))))))) + var5) >>> 11) << 1 | (char)((char)((char)(~((char)(-((char)(-((char)(var4[var5] >>> 14 | var4[var5] << 2))))))) + var5) << 5 | (char)((char)(~((char)(-((char)(-((char)(var4[var5] >>> 14 | var4[var5] << 2))))))) + var5) >>> 11) >>> 15) ^ '옄') + var5))) << 5 | (char)(-((char)((char)((char)((char)((char)((char)(~((char)(-((char)(-((char)(var4[var5] >>> 14 | var4[var5] << 2))))))) + var5) << 5 | (char)((char)(~((char)(-((char)(-((char)(var4[var5] >>> 14 | var4[var5] << 2))))))) + var5) >>> 11) << 1 | (char)((char)((char)(~((char)(-((char)(-((char)(var4[var5] >>> 14 | var4[var5] << 2))))))) + var5) << 5 | (char)((char)(~((char)(-((char)(-((char)(var4[var5] >>> 14 | var4[var5] << 2))))))) + var5) >>> 11) >>> 15) ^ '옄') + var5))) >>> 11) - '︰'))) + 5578) ^ 9566) << 7 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)(-((char)(-((char)(var4[var5] >>> 14 | var4[var5] << 2))))))) + var5) << 5 | (char)((char)(~((char)(-((char)(-((char)(var4[var5] >>> 14 | var4[var5] << 2))))))) + var5) >>> 11) << 1 | (char)((char)((char)(~((char)(-((char)(-((char)(var4[var5] >>> 14 | var4[var5] << 2))))))) + var5) << 5 | (char)((char)(~((char)(-((char)(-((char)(var4[var5] >>> 14 | var4[var5] << 2))))))) + var5) >>> 11) >>> 15) ^ '옄') + var5))) << 5 | (char)(-((char)((char)((char)((char)((char)((char)(~((char)(-((char)(-((char)(var4[var5] >>> 14 | var4[var5] << 2))))))) + var5) << 5 | (char)((char)(~((char)(-((char)(-((char)(var4[var5] >>> 14 | var4[var5] << 2))))))) + var5) >>> 11) << 1 | (char)((char)((char)(~((char)(-((char)(-((char)(var4[var5] >>> 14 | var4[var5] << 2))))))) + var5) << 5 | (char)((char)(~((char)(-((char)(-((char)(var4[var5] >>> 14 | var4[var5] << 2))))))) + var5) >>> 11) >>> 15) ^ '옄') + var5))) >>> 11) - '︰'))) + 5578) ^ 9566) >>> 9));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean Ililllililil() {
      if (this.llilliiIil.isEmpty()) {
         return false;
      } else {
         for(iIllIiIlIlllIiIl var2 : this.llilliiIil) {
            if (var2.liiiIIllIl() == 0 || !var2.iIlIlllllill()) {
               return false;
            }
         }

         return true;
      }
   }

   public long IliIlllilIi() {
      return this.lIilliiIil;
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) >>> 15 | (char)(~((char)(var4[var5] - var5))) << 1) - var5) ^ 16415) ^ '\uf8dc') + 24770) + var5) + '\uf103') - 5148) ^ var5) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) >>> 15 | (char)(~((char)(var4[var5] - var5))) << 1) - var5) ^ 16415) ^ '\uf8dc') + 24770) + var5) + '\uf103') - 5148) ^ var5) >>> 14) + var5))) ^ 17571) >>> 11 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) >>> 15 | (char)(~((char)(var4[var5] - var5))) << 1) - var5) ^ 16415) ^ '\uf8dc') + 24770) + var5) + '\uf103') - 5148) ^ var5) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) >>> 15 | (char)(~((char)(var4[var5] - var5))) << 1) - var5) ^ 16415) ^ '\uf8dc') + 24770) + var5) + '\uf103') - 5148) ^ var5) >>> 14) + var5))) ^ 17571) << 5) + '貂') - 3936));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void Iilllilliill(long cell) {
      ++this.ililliiIil;
      this.llilliiIil.removeIf((m) -> m.IliIlllilIi() == cell);
   }

   public void IIlllIlliIll(iIllIiIlIlllIiIl m) {
      if (m != null) {
         this.llilliiIil.addFirst(m);
      }

   }

   public int iIlIlllllill() {
      return this.IlilliiIil;
   }

   public long liiiIIllIl() {
      return this.iIilliiIil;
   }

   public iIllIiIlIlllIiIl IiIlliIliiIl() {
      return (iIllIiIlIlllIiIl)this.llilliiIil.poll();
   }

   public liillliliiilllil(long stand, long geometry, List<iIllIiIlIlllIiIl> members) {
      this.lIilliiIil = stand;
      this.iIilliiIil = geometry;
      this.IlilliiIil = members.size();
      this.llilliiIil.addAll(members);
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) - '\ueb3b') + '챢') + '룂') - 16126) >>> 15 | (char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) - '\ueb3b') + '챢') + '룂') - 16126) << 1) + 13318) ^ '\ue956') << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) - '\ueb3b') + '챢') + '룂') - 16126) >>> 15 | (char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) - '\ueb3b') + '챢') + '룂') - 16126) << 1) + 13318) ^ '\ue956') >>> 8) - var5) << 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) - '\ueb3b') + '챢') + '룂') - 16126) >>> 15 | (char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) - '\ueb3b') + '챢') + '룂') - 16126) << 1) + 13318) ^ '\ue956') << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) - '\ueb3b') + '챢') + '룂') - 16126) >>> 15 | (char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) - '\ueb3b') + '챢') + '룂') - 16126) << 1) + 13318) ^ '\ue956') >>> 8) - var5) >>> 7) - '쩬') ^ var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IilliliilIIi() {
      return this.llilliiIil.size();
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6830140483006040498L ^ Long.rotateLeft(5113960955502786814L, 52) ^ 7161780189833332404L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7619549709612640406L ^ Long.rotateLeft(-866889511224697181L, 44) ^ 8471187207328675333L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2569331004252696188L ^ Long.rotateLeft(6345271075332726609L, 57) ^ 8541542074581831705L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7364752386110641314L ^ Long.rotateLeft(-1651810731541557181L, 49) ^ -8997875234876765381L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3032006689469425904L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5619100936779472842L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1321323901189159747L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4283592821741990531L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -314450399274312680L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -5924554799137064633L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIlilIliiIli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Illillliilli<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iilililiiili<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIiilIiiiIii<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iliilliiilii<invokedynamic>());
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

   public String toString() {
      return IiIiliIiiiIi<invokedynamic>() + llIiIiililIiIiil.IiIlliIliiIl(this.lIilliiIil) + IiIiliIiiiIi<invokedynamic>() + llIiIiililIiIiil.IIlllIlliIll(this.lIilliiIil) + IiIiliIiiiIi<invokedynamic>() + llIiIiililIiIiil.Illlllllilll(this.lIilliiIil) + IiIiliIiiiIi<invokedynamic>() + this.IlilliiIil + IiIiliIiiiIi<invokedynamic>() + this.llilliiIil.size() + IiIiliIiiiIi<invokedynamic>() + this.ililliiIil + IiIiliIiiiIi<invokedynamic>() + this.IiilliiIil + IiIiliIiiiIi<invokedynamic>();
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) ^ var5) >>> 10 | (char)((char)((char)(-var4[var5]) ^ var5) ^ var5) << 6) - var5))) + 16754))) + var5) << 13 | (char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) ^ var5) >>> 10 | (char)((char)((char)(-var4[var5]) ^ var5) ^ var5) << 6) - var5))) + 16754))) + var5) >>> 3) ^ var5) ^ var5) + var5) >>> 9 | (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) ^ var5) >>> 10 | (char)((char)((char)(-var4[var5]) ^ var5) ^ var5) << 6) - var5))) + 16754))) + var5) << 13 | (char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) ^ var5) >>> 10 | (char)((char)((char)(-var4[var5]) ^ var5) ^ var5) << 6) - var5))) + 16754))) + var5) >>> 3) ^ var5) ^ var5) + var5) << 7) + 28541));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int lIiiIiIlilli() {
      return this.ililliiIil;
   }

   public boolean Illlllllilll(long cell) {
      long var4 = -5272830342775385739L;
      var4 ^= ((long)this.llilliiIil.removeIf((cellx) -> cellx.IliIlllilIi() == cell) << 32 ^ var4) & -1L << 32;
      if ((int)(var4 >>> 32) != 0) {
         ++this.IiilliiIil;
      }

      return (boolean)((int)(var4 >>> 32));
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~var4[var5]) - '뺟'))) + var5) + 15280) ^ var5) + 18464) ^ '쥛') + var5) + 6111));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
