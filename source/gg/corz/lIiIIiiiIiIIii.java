package gg.corz;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_7923;

public class lIiIIiiiIiIIii extends ilIllIiIll {
   private final IIIIlilllIIIlill lIllillIIl = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 1.3, 0.45, (double)2.5F, 0.1);
   private final iiIiiilIIliiil iiiIillIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final IIIIlilllIIIlill iiIlillIIl = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 1.55, 0.2, (double)3.0F, 0.01);
   private final IIIIlilllIIIlill iIIlillIIl = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0.55, 0.1, (double)1.0F, 0.01);
   private final iliiliilIiiiliil IIilillIIl = new iliiliilIiiiliil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), -6275841);
   private final IIIIlilllIIIlill iIllillIIl = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 1.4, 0.2, (double)3.0F, 0.1);
   private final iiIiiilIIliiil ilIlillIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final IIIIlilllIIIlill IillillIIl = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 1.8, 0.2, (double)4.0F, 0.1);
   private final IIIIlilllIIIlill lillillIIl = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0.85, 0.1, (double)1.0F, 0.05);
   private final IIIIlilllIIIlill illlillIIl = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)3.0F, (double)1.0F, (double)8.0F, 0.1);
   private final IIIIlilllIIIlill liIlillIIl = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 1.35, 0.45, (double)2.5F, 0.01);
   private final iiIiiilIIliiil lIilillIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private final iiIiiilIIliiil llIlillIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final IIIIlilllIIIlill IIIlillIIl = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0.8, 0.1, (double)1.5F, 0.1);
   private final iiIiiilIIliiil iillillIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private final iiIiiilIIliiil IlllillIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private final IIIIlilllIIIlill lIIlillIIl = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)1.0F, 0.2, (double)3.0F, 0.1);
   private final lliliIIiililiIIi llllillIIl = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private final IIIIlilllIIIlill IiIlillIIl = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0.84, 0.55, 0.96, 0.01);
   private final IIIIlilllIIIlill IlIlillIIl = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0.55, (double)0.0F, 0.8, 0.01);
   private final IIIIlilllIIIlill IIllillIIl = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0.68, 0.45, 0.9, 0.01);

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(-((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))))))) + '\ueb7a') >>> 2 | (char)((char)(~((char)(-((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))))))) + '\ueb7a') << 14) ^ var5) << 1 | (char)((char)((char)((char)(~((char)(-((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))))))) + '\ueb7a') >>> 2 | (char)((char)(~((char)(-((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))))))) + '\ueb7a') << 14) ^ var5) >>> 15))) ^ 13157) + var5) ^ 15895) >>> 10 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(-((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))))))) + '\ueb7a') >>> 2 | (char)((char)(~((char)(-((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))))))) + '\ueb7a') << 14) ^ var5) << 1 | (char)((char)((char)((char)(~((char)(-((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))))))) + '\ueb7a') >>> 2 | (char)((char)(~((char)(-((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))))))) + '\ueb7a') << 14) ^ var5) >>> 15))) ^ 13157) + var5) ^ 15895) << 6) >>> 10 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(-((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))))))) + '\ueb7a') >>> 2 | (char)((char)(~((char)(-((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))))))) + '\ueb7a') << 14) ^ var5) << 1 | (char)((char)((char)((char)(~((char)(-((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))))))) + '\ueb7a') >>> 2 | (char)((char)(~((char)(-((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))))))) + '\ueb7a') << 14) ^ var5) >>> 15))) ^ 13157) + var5) ^ 15895) >>> 10 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(-((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))))))) + '\ueb7a') >>> 2 | (char)((char)(~((char)(-((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))))))) + '\ueb7a') << 14) ^ var5) << 1 | (char)((char)((char)((char)(~((char)(-((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))))))) + '\ueb7a') >>> 2 | (char)((char)(~((char)(-((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))))))) + '\ueb7a') << 14) ^ var5) >>> 15))) ^ 13157) + var5) ^ 15895) << 6) << 6) - var5)) + 9478));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public lIiIIiiiIiIIii() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.llIlIIIiilIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iiiIillIIl, this.IIIlillIIl, this.lIIlillIIl, this.iIIlillIIl, this.IlIlillIIl, this.llIlillIIl, this.ilIlillIIl, this.IiIlillIIl, this.liIlillIIl, this.iiIlillIIl, this.IIllillIIl, this.lIllillIIl, this.iIllillIIl, this.IlllillIIl, this.llllillIIl, this.illlillIIl, this.IillillIIl, this.lillillIIl, this.iillillIIl, this.IIilillIIl, this.lIilillIIl});
   }

   protected void Iilililiiili() {
      IilliiIllilliiIl.IliIlllilIi().iIlIlllllill(false);
   }

   public static lIiIIiiiIiIIii iiiIlIIIll() {
      return (lIiIIiiiIiIIii)llilIllililIll.iliIiiliiiii(lIiIIiiiIiIIii.class);
   }

   protected void Illillliilli() {
      this.lIIlliIIll();
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6055795798820385705L ^ Long.rotateLeft(-5260974136493219701L, 53) ^ -5354864157664050198L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -3152507424680190799L ^ Long.rotateLeft(-7329553817159931556L, 22) ^ 7239020771763124342L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5016368157810431575L ^ Long.rotateLeft(188633186718580482L, 40) ^ 5894489057829829539L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6864048599237122942L ^ Long.rotateLeft(-8012101841885895556L, 38) ^ 4322249828298859271L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4694489106638228493L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -4308101555721291357L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -2216345613600660142L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -8229900200462801126L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6254268027540817299L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4394430718491213126L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(liiiIIllIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iIlIlllllill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IilliliilIIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, lIiiIiIlilli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iliIiiliiiii<invokedynamic>());
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
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + '녕') >>> 7 | (char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + '녕') << 9) - 32420) << 14 | (char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + '녕') >>> 7 | (char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + '녕') << 9) - 32420) >>> 2) ^ '\uedfc') ^ '鹦') << 9 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + '녕') >>> 7 | (char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + '녕') << 9) - 32420) << 14 | (char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + '녕') >>> 7 | (char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + '녕') << 9) - 32420) >>> 2) ^ '\uedfc') ^ '鹦') >>> 7) >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + '녕') >>> 7 | (char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + '녕') << 9) - 32420) << 14 | (char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + '녕') >>> 7 | (char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + '녕') << 9) - 32420) >>> 2) ^ '\uedfc') ^ '鹦') << 9 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + '녕') >>> 7 | (char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + '녕') << 9) - 32420) << 14 | (char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + '녕') >>> 7 | (char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + '녕') << 9) - 32420) >>> 2) ^ '\uedfc') ^ '鹦') >>> 7) << 1) + 21171) - var5) - var5) + var5))) + 23809))) + 18703) ^ var5) + 15031));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] ^ 'ꕛ') << 5 | (char)(var4[var5] ^ 'ꕛ') >>> 11) ^ var5) - '肷'))))) + var5) << 13 | (char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] ^ 'ꕛ') << 5 | (char)(var4[var5] ^ 'ꕛ') >>> 11) ^ var5) - '肷'))))) + var5) >>> 3))) + var5) ^ var5) >>> 14 | (char)((char)((char)(~((char)((char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] ^ 'ꕛ') << 5 | (char)(var4[var5] ^ 'ꕛ') >>> 11) ^ var5) - '肷'))))) + var5) << 13 | (char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] ^ 'ꕛ') << 5 | (char)(var4[var5] ^ 'ꕛ') >>> 11) ^ var5) - '肷'))))) + var5) >>> 3))) + var5) ^ var5) << 2) << 2 | (char)((char)((char)((char)(~((char)((char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] ^ 'ꕛ') << 5 | (char)(var4[var5] ^ 'ꕛ') >>> 11) ^ var5) - '肷'))))) + var5) << 13 | (char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] ^ 'ꕛ') << 5 | (char)(var4[var5] ^ 'ꕛ') >>> 11) ^ var5) - '肷'))))) + var5) >>> 3))) + var5) ^ var5) >>> 14 | (char)((char)((char)(~((char)((char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] ^ 'ꕛ') << 5 | (char)(var4[var5] ^ 'ꕛ') >>> 11) ^ var5) - '肷'))))) + var5) << 13 | (char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] ^ 'ꕛ') << 5 | (char)(var4[var5] ^ 'ꕛ') >>> 11) ^ var5) - '肷'))))) + var5) >>> 3))) + var5) ^ var5) << 2) >>> 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void lIIlliIIll() {
      IilliiIllilliiIl var1 = IilliiIllilliiIl.IliIlllilIi();
      boolean var2 = this.IliIlllilIi() && (this.iiiIillIIl.Iilllilliill() || this.IlllillIIl.Iilllilliill());
      var1.iIlIlllllill(var2);
      if (var2) {
         var1.lIiiIiIlilli(this.iiiIillIIl.Iilllilliill());
         var1.iliIiiliiiii((float)this.IIIlillIIl.Iilllilliill());
         var1.IIIllIIliIIl(0.35F);
         var1.Illlllllilll((float)this.lIIlillIIl.Iilllilliill());
         var1.Iilllilliill((float)this.iIIlillIIl.Iilllilliill());
         var1.Iiilliiliiil((float)this.IiIlillIIl.Iilllilliill());
         var1.IIillIiliIil((float)this.liIlillIIl.Iilllilliill());
         var1.IiIlliIliiIl((float)this.iiIlillIIl.Iilllilliill());
         var1.IIIilIIiiIIi((float)this.IIllillIIl.Iilllilliill());
         var1.Ililllililil((float)this.lIllillIIl.Iilllilliill());
         var1.IIlllIlliIll((float)this.iIllillIIl.Iilllilliill());
         var1.IlIillIiilIi((float)this.IlIlillIIl.Iilllilliill());
         Color var3 = this.ilIllIiIll();
         var1.IiIiliIiiiIi((float)var3.getRed() / 255.0F, (float)var3.getGreen() / 255.0F, (float)var3.getBlue() / 255.0F, 1.0F);
         var1.IIlilIliiIli(this.IlllillIIl.Iilllilliill());
         var1.Illillliilli((float)this.illlillIIl.Iilllilliill());
         var1.Iilililiiili((float)this.IillillIIl.Iilllilliill());
         String var5 = this.llllillIIl.Iilllilliill();
         byte var6 = -1;
         switch (var5.hashCode()) {
            case -1814666802:
               if (var5.equals(IliIlllilIi<invokedynamic>())) {
                  var6 = 1;
               }
               break;
            case 80066187:
               if (var5.equals(IliIlllilIi<invokedynamic>())) {
                  var6 = 0;
               }
         }

         byte var10000;
         switch (var6) {
            case 0 -> var10000 = 0;
            case 1 -> var10000 = 2;
            default -> var10000 = 1;
         }

         byte var4 = var10000;
         var1.IIiilIiiiIii(var4);
         Color var7 = this.IlIllllIll();
         var1.Iliilliiilii((float)var7.getRed() / 255.0F, (float)var7.getGreen() / 255.0F, (float)var7.getBlue() / 255.0F, (float)var7.getAlpha() / 255.0F * (float)this.lillillIIl.Iilllilliill());
      }
   }

   public Color IlIllllIll() {
      if (this.iillillIIl.Iilllilliill()) {
         return new Color(this.IIilillIIl.Iilllilliill(), true);
      } else if (this.lIilillIIl.Iilllilliill()) {
         float var1 = (float)(System.currentTimeMillis() % (5471575725099124532L ^ 5471575725099125900L)) / 3000.0F;
         return Color.getHSBColor(var1, 0.8F, 1.0F);
      } else {
         return this.ilIllIiIll();
      }
   }

   public Color ilIllIiIll() {
      if (this.llIlillIIl.Iilllilliill()) {
         return this.liIlliiIll();
      } else {
         return this.ilIlillIIl.Iilllilliill() ? new Color(IlIIilIlllIIilIl.lliiIlliIl, true) : new Color(-1885099743 * 1762037865 + 125 ^ 2037308665);
      }
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 6143) << 15 | (char)(var4[var5] ^ 6143) >>> 1) - '靉') << 10 | (char)((char)((char)(var4[var5] ^ 6143) << 15 | (char)(var4[var5] ^ 6143) >>> 1) - '靉') >>> 6)) + var5) >>> 3 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 6143) << 15 | (char)(var4[var5] ^ 6143) >>> 1) - '靉') << 10 | (char)((char)((char)(var4[var5] ^ 6143) << 15 | (char)(var4[var5] ^ 6143) >>> 1) - '靉') >>> 6)) + var5) << 13))) - var5) ^ '\ude01') - 4489) - var5) + '둛'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uef9a') - var5) + var5) >>> 15 | (char)((char)((char)(var4[var5] - '\uef9a') - var5) + var5) << 1) ^ '멄') >>> 6 | (char)((char)((char)((char)((char)(var4[var5] - '\uef9a') - var5) + var5) >>> 15 | (char)((char)((char)(var4[var5] - '\uef9a') - var5) + var5) << 1) ^ '멄') << 10) - '\uf8c1'))))) - var5))))) ^ var5) ^ 26502) >>> 6 | (char)((char)((char)(-((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uef9a') - var5) + var5) >>> 15 | (char)((char)((char)(var4[var5] - '\uef9a') - var5) + var5) << 1) ^ '멄') >>> 6 | (char)((char)((char)((char)((char)(var4[var5] - '\uef9a') - var5) + var5) >>> 15 | (char)((char)((char)(var4[var5] - '\uef9a') - var5) + var5) << 1) ^ '멄') << 10) - '\uf8c1'))))) - var5))))) ^ var5) ^ 26502) << 10) ^ 32506) + '뼩'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iIIIlIlIIl() {
      this.lIIlliIIll();
   }

   public Color liIlliiIll() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 == null) {
         return Color.WHITE;
      } else {
         class_1799 var2 = var1.field_1724.method_6047();
         if (var2.method_7960()) {
            var2 = var1.field_1724.method_6079();
         }

         if (var2.method_7960()) {
            return Color.WHITE;
         } else {
            String var3 = class_7923.field_41178.method_10221(var2.method_7909()).method_12832();
            if (var3.contains(IliIlllilIi<invokedynamic>())) {
               return new Color(~(1910986598 + -87) ^ -1907526384);
            } else if (var3.contains(IliIlllilIi<invokedynamic>())) {
               return new Color(~(-(-1754203878 >>> 23 | -1754203878 << 9)) ^ -508985526);
            } else if (var3.contains(IliIlllilIi<invokedynamic>())) {
               return new Color(-((640290969 << 15 | 640290969 >>> 17) ^ -103) ^ 145966894);
            } else if (var3.contains(IliIlllilIi<invokedynamic>())) {
               return new Color(-(1581142354 + 69 + 11 + -27) ^ -1592168303);
            } else if (var3.contains(IliIlllilIi<invokedynamic>())) {
               return new Color(((713595232 - -25) * 1762037865 << 25 | (713595232 - -25) * 1762037865 >>> 7) * 65 ^ 69808938);
            } else if (var3.contains(IliIlllilIi<invokedynamic>())) {
               return new Color(-(1748826133 - -81 + 31) ^ -1759429568);
            } else {
               return var3.contains(IliIlllilIi<invokedynamic>()) ? new Color((-190788699 - -103) * 125 * -750576809 ^ 2102616848) : new Color(~1007884004 * 1332920885 ^ 996040305);
            }
         }
      }
   }
}
