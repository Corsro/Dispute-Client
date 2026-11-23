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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class lllliilillliil {
   private static final int lIiiiIlliiIiiiIlli = 70;
   private static final long iliiiIlliIiiiiIlli = 12000L;
   private static final long IliiiIllilliiiIlli = 15000L;
   private final Map<String, ilIiIIiIiIiIIi> liiiiIlliiiiiiIlli = new HashMap();

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3479707711739701151L ^ Long.rotateLeft(7452822985457737179L, 41) ^ -5051916436567336040L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7696149418074164241L ^ Long.rotateLeft(-274642518717443549L, 37) ^ -4756223931525508274L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 62227748479657460L ^ Long.rotateLeft(-912729899748708748L, 31) ^ -1210742659862249871L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 7115219676832382985L ^ Long.rotateLeft(-595997127917038933L, 24) ^ 8959180173143208003L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 256524010314409824L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -5880387336819438922L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5223928877462468800L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5040568109293157848L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -2179618035821635252L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -300317825712945481L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIillIiliIil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Ililllililil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iiilliiliiil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIIilIIiiIIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IlIillIiilIi<invokedynamic>());
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

   public void IilliliilIIi() {
      this.liiiiIlliiiiiiIlli.clear();
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 27964) << 2 | (char)(var4[var5] - 27964) >>> 14) + '\ue653') + 15880) ^ 31363) ^ 26326) + var5) << 2 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - 27964) << 2 | (char)(var4[var5] - 27964) >>> 14) + '\ue653') + 15880) ^ 31363) ^ 26326) + var5) >>> 14))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(-((char)((char)((char)(-((char)(var4[var5] ^ 28821))) + var5) << 4 | (char)((char)(-((char)(var4[var5] ^ 28821))) + var5) >>> 12))))) ^ var5))) - var5) ^ '끯') - '輙') + 13843) << 5 | (char)((char)((char)((char)((char)(-((char)((char)(-((char)(-((char)((char)((char)(-((char)(var4[var5] ^ 28821))) + var5) << 4 | (char)((char)(-((char)(var4[var5] ^ 28821))) + var5) >>> 12))))) ^ var5))) - var5) ^ '끯') - '輙') + 13843) >>> 11))) >>> 4 | (char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(-((char)((char)((char)(-((char)(var4[var5] ^ 28821))) + var5) << 4 | (char)((char)(-((char)(var4[var5] ^ 28821))) + var5) >>> 12))))) ^ var5))) - var5) ^ '끯') - '輙') + 13843) << 5 | (char)((char)((char)((char)((char)(-((char)((char)(-((char)(-((char)((char)((char)(-((char)(var4[var5] ^ 28821))) + var5) << 4 | (char)((char)(-((char)(var4[var5] ^ 28821))) + var5) >>> 12))))) ^ var5))) - var5) ^ '끯') - '輙') + 13843) >>> 11))) << 12) + '\ud98b'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public llilllllililllll IliIlllilIi(UUID now, String subject, IiiIIIliliiIIIli detail, String id, long clue) {
      long var12 = -9142423799250922841L;
      String var7 = subject != null && !subject.isBlank() ? subject : Iilllilliill<invokedynamic>();
      String var8 = now == null ? Iilllilliill<invokedynamic>() + var7 : Iilllilliill<invokedynamic>() + now;
      ilIiIIiIiIiIIi var9 = (ilIiIIiIiIiIIi)this.liiiiIlliiiiiiIlli.computeIfAbsent(var8, (idx) -> new ilIiIIiIiIiIIi(now, var7));
      var9.iiiIiiiliIIIliiili = var7;
      var9.IlIliiilillIliiili.put(detail, new llIiiililIiiil(detail.ilIIllIlIi, id, clue + (2430722625418404777L ^ 2430722625418402097L)));
      var12 ^= ((long)lIiiIiIlilli(var9, clue) << 32 ^ var12) & -1L << 32;
      var12 ^= ((long)((int)(var12 >>> 32) >= (-(--126414971 * -107) ^ 641499951) && clue - var9.lIIliiiliiIIliiili >= (8129634910369829266L ^ 8129634910369841010L) ? 1 : 0) ^ var12) & -1L >>> 32;
      if ((int)var12 != 0) {
         var9.lIIliiiliiIIliiili = clue;
      }

      return new llilllllililllll(var9.IiiIiiililiiIiiili, var9.iiiIiiiliIIIliiili, id, (int)(var12 >>> 32), (boolean)((int)var12), clue + (-5851351795673278595L ^ -5851351795673294499L));
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] << 13 | var4[var5] >>> 3))) ^ var5) - var5) + '꒻') ^ var5) << 14 | (char)((char)((char)((char)((char)(~((char)(var4[var5] << 13 | var4[var5] >>> 3))) ^ var5) - var5) + '꒻') ^ var5) >>> 2))) + 28552) << 3 | (char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] << 13 | var4[var5] >>> 3))) ^ var5) - var5) + '꒻') ^ var5) << 14 | (char)((char)((char)((char)((char)(~((char)(var4[var5] << 13 | var4[var5] >>> 3))) ^ var5) - var5) + '꒻') ^ var5) >>> 2))) + 28552) >>> 13));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static int lIiiIiIlilli(ilIiIIiIiIiIIi now, long file) {
      now.IlIliiilillIliiili.entrySet().removeIf((entry) -> ((llIiiililIiiil)entry.getValue()).IIllilllilIllillli <= file);
      return now.IlIliiilillIliiili.values().stream().mapToInt(llIiiililIiiil::IliIlllilIi).sum();
   }

   public List<llilllllililllll> iIlIlllllill(long now) {
      ArrayList var3 = new ArrayList();
      this.liiiiIlliiiiiiIlli.entrySet().removeIf((entry) -> lIiiIiIlilli((ilIiIIiIiIiIIi)entry.getValue(), now) == 0);

      for(ilIiIIiIiIiIIi var5 : this.liiiiIlliiiiiiIlli.values()) {
         llIiiililIiiil var6 = (llIiiililIiiil)var5.IlIliiilillIliiili.values().stream().filter((item) -> item.IIllilllilIllillli > now).max((b, a) -> Integer.compare(b.ilIlillliIiIlillli, a.ilIlillliIiIlillli)).orElse((Object)null);
         if (var6 != null) {
            var3.add(new llilllllililllll(var5.IiiIiiililiiIiiili, var5.iiiIiiiliIIIliiili, var6.liIlillliiiIlillli, lIiiIiIlilli(var5, now), false, var6.IIllilllilIllillli));
         }
      }

      var3.sort((a, b) -> Integer.compare(b.lIliIiIill, a.lIliIiIill));
      return var3;
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(~((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) << 5 | (char)(var4[var5] >>> 6 | var4[var5] << 10) >>> 11)) ^ 1999) + 6229) + var5) ^ '\uef3c'))) ^ 28724) ^ var5) - '귺'))))))) >>> 10 | (char)(~((char)(-((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) << 5 | (char)(var4[var5] >>> 6 | var4[var5] << 10) >>> 11)) ^ 1999) + 6229) + var5) ^ '\uef3c'))) ^ 28724) ^ var5) - '귺'))))))) << 6))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - var5) - '묫') ^ var5) + var5) - '龍') + '싂'))) ^ var5) + var5))))) - '뚆'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void liiiIIllIl(UUID id) {
      if (id != null) {
         this.liiiiIlliiiiiiIlli.remove(Iilllilliill<invokedynamic>() + id);
      }

   }
}
