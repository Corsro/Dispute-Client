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

public record Iillillillil(List<Ilililllllililll> listings, int items, int transactions, long price, int overbuy) {
   private final int ilIliiliIiIliili;
   private final int liIliiliiiIliili;
   private final int iIlliiliIllliili;
   private final List<Ilililllllililll> IlIliilillIliili;
   private final long IIlliililIlliili;

   public int lIiiIiIlilli() {
      return this.liIliiliiiIliili;
   }

   public int IilliliilIIi() {
      return this.ilIliiliIiIliili;
   }

   public String liiiIIllIl() {
      return IlIlllIlilIl<invokedynamic>() + this.liIliiliiiIliili + IlIlllIlilIl<invokedynamic>() + this.ilIliiliIiIliili + IlIlllIlilIl<invokedynamic>() + this.IIlliililIlliili + IlIlllIlilIl<invokedynamic>() + this.iIlliiliIllliili;
   }

   public long iliIiiliiiii() {
      return this.IIlliililIlliili;
   }

   public int IIIllIIliIIl() {
      return this.iIlliiliIllliili;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) ^ var5))) << 7 | (char)(-((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) ^ var5))) >>> 9) + var5))))))) + var5) ^ '﵄') - var5) - var5) >>> 7 | (char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) ^ var5))) << 7 | (char)(-((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) ^ var5))) >>> 9) + var5))))))) + var5) ^ '﵄') - var5) - var5) << 9));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public Iillillillil(List<Ilililllllililll> items, int price, int listings, long transactions, int overbuy) {
      this.IlIliilillIliili = items;
      this.ilIliiliIiIliili = price;
      this.liIliiliiiIliili = listings;
      this.IIlliililIlliili = transactions;
      this.iIlliiliIllliili = overbuy;
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ '\ue358') >>> 15 | (char)((char)(var4[var5] + var5) ^ '\ue358') << 1) ^ '鐕') << 5 | (char)((char)((char)((char)(var4[var5] + var5) ^ '\ue358') >>> 15 | (char)((char)(var4[var5] + var5) ^ '\ue358') << 1) ^ '鐕') >>> 11) ^ var5) ^ 25207) + '菟') >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ '\ue358') >>> 15 | (char)((char)(var4[var5] + var5) ^ '\ue358') << 1) ^ '鐕') << 5 | (char)((char)((char)((char)(var4[var5] + var5) ^ '\ue358') >>> 15 | (char)((char)(var4[var5] + var5) ^ '\ue358') << 1) ^ '鐕') >>> 11) ^ var5) ^ 25207) + '菟') << 15))) >>> 11 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ '\ue358') >>> 15 | (char)((char)(var4[var5] + var5) ^ '\ue358') << 1) ^ '鐕') << 5 | (char)((char)((char)((char)(var4[var5] + var5) ^ '\ue358') >>> 15 | (char)((char)(var4[var5] + var5) ^ '\ue358') << 1) ^ '鐕') >>> 11) ^ var5) ^ 25207) + '菟') >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ '\ue358') >>> 15 | (char)((char)(var4[var5] + var5) ^ '\ue358') << 1) ^ '鐕') << 5 | (char)((char)((char)((char)(var4[var5] + var5) ^ '\ue358') >>> 15 | (char)((char)(var4[var5] + var5) ^ '\ue358') << 1) ^ '鐕') >>> 11) ^ var5) ^ 25207) + '菟') << 15))) << 5) - var5) << 14 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ '\ue358') >>> 15 | (char)((char)(var4[var5] + var5) ^ '\ue358') << 1) ^ '鐕') << 5 | (char)((char)((char)((char)(var4[var5] + var5) ^ '\ue358') >>> 15 | (char)((char)(var4[var5] + var5) ^ '\ue358') << 1) ^ '鐕') >>> 11) ^ var5) ^ 25207) + '菟') >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ '\ue358') >>> 15 | (char)((char)(var4[var5] + var5) ^ '\ue358') << 1) ^ '鐕') << 5 | (char)((char)((char)((char)(var4[var5] + var5) ^ '\ue358') >>> 15 | (char)((char)(var4[var5] + var5) ^ '\ue358') << 1) ^ '鐕') >>> 11) ^ var5) ^ 25207) + '菟') << 15))) >>> 11 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ '\ue358') >>> 15 | (char)((char)(var4[var5] + var5) ^ '\ue358') << 1) ^ '鐕') << 5 | (char)((char)((char)((char)(var4[var5] + var5) ^ '\ue358') >>> 15 | (char)((char)(var4[var5] + var5) ^ '\ue358') << 1) ^ '鐕') >>> 11) ^ var5) ^ 25207) + '菟') >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ '\ue358') >>> 15 | (char)((char)(var4[var5] + var5) ^ '\ue358') << 1) ^ '鐕') << 5 | (char)((char)((char)((char)(var4[var5] + var5) ^ '\ue358') >>> 15 | (char)((char)(var4[var5] + var5) ^ '\ue358') << 1) ^ '鐕') >>> 11) ^ var5) ^ 25207) + '菟') << 15))) << 5) - var5) >>> 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) ^ 3981) - '鶷'))) - var5) ^ '\uf8ed') - '銈') + 21607))) >>> 4 | (char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) ^ 3981) - '鶷'))) - var5) ^ '\uf8ed') - '銈') + 21607))) << 12));
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
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) - var5) + var5) << 14 | (char)((char)((char)(~((char)(-var4[var5]))) - var5) + var5) >>> 2) << 15 | (char)((char)((char)((char)(~((char)(-var4[var5]))) - var5) + var5) << 14 | (char)((char)((char)(~((char)(-var4[var5]))) - var5) + var5) >>> 2) >>> 1) + var5) ^ '갻') << 1 | (char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) - var5) + var5) << 14 | (char)((char)((char)(~((char)(-var4[var5]))) - var5) + var5) >>> 2) << 15 | (char)((char)((char)((char)(~((char)(-var4[var5]))) - var5) + var5) << 14 | (char)((char)((char)(~((char)(-var4[var5]))) - var5) + var5) >>> 2) >>> 1) + var5) ^ '갻') >>> 15) - var5) - var5))) + 32746));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IliIlllilIi() {
      return this.IlIliilillIliili.isEmpty();
   }

   public List<Ilililllllililll> iIlIlllllill() {
      return this.IlIliilillIliili;
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -1325867284107587962L ^ Long.rotateLeft(-8726539840239598000L, 7) ^ -794870108025816872L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2585955968169236071L ^ Long.rotateLeft(2485136471558098825L, 42) ^ -3085425081257914717L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8449006288121862142L ^ Long.rotateLeft(-2938839926615200990L, 24) ^ -1962802707708030631L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 489519027557741884L ^ Long.rotateLeft(-6425868910119029365L, 26) ^ -1619510640429019728L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6210222180089643986L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 8947328740126396988L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7004518079575057337L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3702489663478495208L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4830585052012967105L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -3654390633815658292L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Iilllilliill<invokedynamic>());
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

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)var4[var5] - var5) - 'ꡳ') >>> 5 | (char)((char)((char)var4[var5] - var5) - 'ꡳ') << 11))) + var5) - 8599) ^ var5) - '\uf5cc'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
