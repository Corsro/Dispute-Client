package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public record IiilIIllliilIIll(iiiillIlIIIIilIl decision, IliiIlIllliiIlIl roi, IIiIlIilIiIlIi alternative, List<llIllliilIllli> phantoms, String reason) {
   private final List<llIllliilIllli> IiiIlIllll;
   private final IliiIlIllliiIlIl lliIlIllll;
   private final String liiIlIllll;
   private final iiiillIlIIIIilIl IliIlIllll;
   private final IIiIlIilIiIlIi iliIlIllll;

   public IliiIlIllliiIlIl lIiiIiIlilli() {
      return this.lliIlIllll;
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] - 'ꎊ'))) - '赩') << 4 | (char)((char)(~((char)(var4[var5] - 'ꎊ'))) - '赩') >>> 12) + var5) ^ var5))) ^ '韵') - '聿') + '\ue8a5') + var5) - '쨃') + var5))) + 29054) + 3781))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(-var4[var5]) >>> 15 | (char)(-var4[var5]) << 1))) - var5) + var5) ^ 16799)) - var5))) >>> 6 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(-var4[var5]) >>> 15 | (char)(-var4[var5]) << 1))) - var5) + var5) ^ 16799)) - var5))) << 10) - 24814) + var5) << 6 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(-var4[var5]) >>> 15 | (char)(-var4[var5]) << 1))) - var5) + var5) ^ 16799)) - var5))) >>> 6 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(-var4[var5]) >>> 15 | (char)(-var4[var5]) << 1))) - var5) + var5) ^ 16799)) - var5))) << 10) - 24814) + var5) >>> 10) + 5711) >>> 6 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(-var4[var5]) >>> 15 | (char)(-var4[var5]) << 1))) - var5) + var5) ^ 16799)) - var5))) >>> 6 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(-var4[var5]) >>> 15 | (char)(-var4[var5]) << 1))) - var5) + var5) ^ 16799)) - var5))) << 10) - 24814) + var5) << 6 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(-var4[var5]) >>> 15 | (char)(-var4[var5]) << 1))) - var5) + var5) ^ 16799)) - var5))) >>> 6 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(-var4[var5]) >>> 15 | (char)(-var4[var5]) << 1))) - var5) + var5) ^ 16799)) - var5))) << 10) - 24814) + var5) >>> 10) + 5711) << 10) + 24666) + var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IlIlllIlilIl() {
      return this.liiIlIllll;
   }

   public String iIlIlllllill() {
      return IiIlliIliiIl<invokedynamic>() + this.IliIlIllll + IiIlliIliiIl<invokedynamic>() + (this.lliIlIllll == null ? IiIlliIliiIl<invokedynamic>() : this.lliIlIllll.IliIlllilIi()) + IiIlliIliiIl<invokedynamic>() + this.IiiIlIllll.size() + (this.iliIlIllll == null ? "" : IiIlliIliiIl<invokedynamic>() + this.iliIlIllll.IilliliilIIi()) + IiIlliIliiIl<invokedynamic>() + this.liiIlIllll;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)((char)(~((char)(var4[var5] + 17903))) + '钶'))) + 21513) << 8 | (char)((char)(~((char)((char)(~((char)(var4[var5] + 17903))) + '钶'))) + 21513) >>> 8) << 12 | (char)((char)((char)(~((char)((char)(~((char)(var4[var5] + 17903))) + '钶'))) + 21513) << 8 | (char)((char)(~((char)((char)(~((char)(var4[var5] + 17903))) + '钶'))) + 21513) >>> 8) >>> 4))))) ^ 'ﰢ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IliIlllilIi() {
      return this.IliIlIllll == iiiillIlIIIIilIl.iiilIlliIl;
   }

   public IiilIIllliilIIll(iiiillIlIIIIilIl phantoms, IliiIlIllliiIlIl roi, IIiIlIilIiIlIi reason, List<llIllliilIllli> decision, String alternative) {
      this.IliIlIllll = phantoms;
      this.lliIlIllll = roi;
      this.iliIlIllll = reason;
      this.IiiIlIllll = decision;
      this.liiIlIllll = alternative;
   }

   public iiiillIlIIIIilIl IilliliilIIi() {
      return this.IliIlIllll;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5175915061806328991L ^ Long.rotateLeft(-7537379198189328087L, 30) ^ 1698241630145660622L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6896136473910850899L ^ Long.rotateLeft(8958813867395191439L, 11) ^ -3882509974338863211L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7726548664081946246L ^ Long.rotateLeft(7139419606199760180L, 63) ^ -5619858493094262079L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4961159346717712280L ^ Long.rotateLeft(-3561296343998028955L, 31) ^ 4010882503040401158L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -9102007988573686376L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -4543197832279457120L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7818689515786436910L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5056182333085941301L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 1698091356969794914L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 422517089117822579L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIlllIlliIll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Illlllllilll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iilllilliill<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IIillIiliIil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Ililllililil<invokedynamic>());
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
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) >>> 9 | (char)((char)(var4[var5] ^ var5) - var5) << 7) ^ '뒦') - var5) - var5))) + var5) + 8273) + 6932) + var5))));
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
         var4[var5] = (char)((char)(-((char)(~((char)(-((char)((char)(-((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + 28857))))) ^ 'ꮦ'))))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IIiIlIilIiIlIi iliIiiliiiii() {
      return this.iliIlIllll;
   }

   public int liiiIIllIl() {
      return this.IiiIlIllll.size();
   }

   public List<llIllliilIllli> IIIllIIliIIl() {
      return this.IiiIlIllll;
   }
}
