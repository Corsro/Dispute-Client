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
import java.util.function.LongUnaryOperator;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class iiiliIIIii {
   private final Map<Long, IIllIlilIllIli> lIllIlIliIllIlIl = new LinkedHashMap();

   public int IiIlliIliiIl(LongUnaryOperator tick, int stateOf) {
      long var7 = 4672754004003716196L;
      var7 ^= (0L ^ var7) & -1L << 32;

      for(Map.Entry var5 : this.lIllIlIliIllIlIl.entrySet()) {
         IIllIlilIllIli var6 = (IIllIlilIllIli)var5.getValue();
         if (var6.IIIilIIiiIIi() != IIIIlIlllIIIlIll.IiliIlllll && IlIlllIlilIl(var6, tick)) {
            var5.setValue(new IIllIlilIllIli(var6.IlIlllIlilIl(), var6.IiIlliIliiIl(), var6.IIlllIlliIll(), var6.Illlllllilll(), var6.Iilllilliill(), iIiIliIliIli.liiiIIllIl(var6.Iilllilliill(), tick), var6.IiIiliIiiiIi() == null ? 0L : var6.IiIiliIiiiIi().IilliliilIIi(tick), stateOf, IIIIlIlllIIIlIll.llliIlllll, List.of(), var6.IiIiliIiiiIi(), -1));
            var7 += 4294967296L;
         }
      }

      return (int)(var7 >>> 32);
   }

   public void IilliliilIIi(IIllIlilIllIli o) {
      this.lIllIlIliIllIlIl.put(o.IlIlllIlilIl(), o);
   }

   public IIllIlilIllIli liiiIIllIl(long previousCapability, long stateOf, int causalCell, long[] tick, LongUnaryOperator causalCells, iilililIIiilil target, int scope) {
      IIllIlilIllIli var10 = (IIllIlilIllIli)this.lIllIlIliIllIlIl.get(previousCapability);
      if (var10 != null && var10.IliIlllilIi()) {
         return var10;
      } else {
         IIllIlilIllIli var11 = new IIllIlilIllIli(previousCapability, stateOf, causalCell, causalCell, tick, iIiIliIliIli.liiiIIllIl(tick, causalCells), target == null ? 0L : target.IilliliilIIi(causalCells), scope, IIIIlIlllIIIlIll.llliIlllll, List.of(), target, -1);
         this.lIllIlIliIllIlIl.put(previousCapability, var11);
         return var11;
      }
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) + '촸'))) - var5) ^ '쩢') - '\ue05d') ^ var5) - 11119) >>> 15 | (char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) + '촸'))) - var5) ^ '쩢') - '\ue05d') ^ var5) - 11119) << 1))))) ^ var5) >>> 5 | (char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) + '촸'))) - var5) ^ '쩢') - '\ue05d') ^ var5) - 11119) >>> 15 | (char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) + '촸'))) - var5) ^ '쩢') - '\ue05d') ^ var5) - 11119) << 1))))) ^ var5) << 11) << 2 | (char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) + '촸'))) - var5) ^ '쩢') - '\ue05d') ^ var5) - 11119) >>> 15 | (char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) + '촸'))) - var5) ^ '쩢') - '\ue05d') ^ var5) - 11119) << 1))))) ^ var5) >>> 5 | (char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) + '촸'))) - var5) ^ '쩢') - '\ue05d') ^ var5) - 11119) >>> 15 | (char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) + '촸'))) - var5) ^ '쩢') - '\ue05d') ^ var5) - 11119) << 1))))) ^ var5) << 11) >>> 14) - var5) ^ var5) + var5) ^ var5) - 19813));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -399521935465676062L ^ Long.rotateLeft(-3345395217584793441L, 4) ^ 6360783568763206129L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8344778149327147382L ^ Long.rotateLeft(-3871242962520501599L, 28) ^ -287005989427052468L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3311244215195055310L ^ Long.rotateLeft(-2344120600153129759L, 39) ^ -5186054886586786561L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 2216379114181315290L ^ Long.rotateLeft(1286631956481899722L, 36) ^ 3670835950994242855L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3032561611082242746L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2979027771883760824L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7780175943193701854L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7299681554586006426L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8797692934133980921L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4568749108037386172L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iilllilliill<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIillIiliIil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Ililllililil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Iiilliiliiil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIIilIIiiIIi<invokedynamic>());
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) + '뚛') << 8 | (char)((char)(var4[var5] >>> 14 | var4[var5] << 2) + '뚛') >>> 8) - 29972) + var5) ^ '要') ^ '뺰') - var5) + '鹬') ^ '꽇') - var5)) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String IliIlllilIi(long packed) {
      return llIiIiililIiIiil.IiIlliIliiIl(packed) + Illlllllilll<invokedynamic>() + llIiIiililIiIiil.IIlllIlliIll(packed) + Illlllllilll<invokedynamic>() + llIiIiililIiIiil.Illlllllilll(packed);
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 9056) + var5) - 17148) << 2 | (char)((char)((char)(var4[var5] ^ 9056) + var5) - 17148) >>> 14) - 21551) - 'ꊩ'))))) >>> 4 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 9056) + var5) - 17148) << 2 | (char)((char)((char)(var4[var5] ^ 9056) + var5) - 17148) >>> 14) - 21551) - 'ꊩ'))))) << 12))) >>> 2 | (char)(-((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 9056) + var5) - 17148) << 2 | (char)((char)((char)(var4[var5] ^ 9056) + var5) - 17148) >>> 14) - 21551) - 'ꊩ'))))) >>> 4 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 9056) + var5) - 17148) << 2 | (char)((char)((char)(var4[var5] ^ 9056) + var5) - 17148) >>> 14) - 21551) - 'ꊩ'))))) << 12))) << 14) + var5) >>> 6 | (char)((char)((char)(-((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 9056) + var5) - 17148) << 2 | (char)((char)((char)(var4[var5] ^ 9056) + var5) - 17148) >>> 14) - 21551) - 'ꊩ'))))) >>> 4 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 9056) + var5) - 17148) << 2 | (char)((char)((char)(var4[var5] ^ 9056) + var5) - 17148) >>> 14) - 21551) - 'ꊩ'))))) << 12))) >>> 2 | (char)(-((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 9056) + var5) - 17148) << 2 | (char)((char)((char)(var4[var5] ^ 9056) + var5) - 17148) >>> 14) - 21551) - 'ꊩ'))))) >>> 4 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 9056) + var5) - 17148) << 2 | (char)((char)((char)(var4[var5] ^ 9056) + var5) - 17148) >>> 14) - 21551) - 'ꊩ'))))) << 12))) << 14) + var5) << 10) ^ '蒀'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 26847) + var5) + '\uab08') + var5) - var5) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 26847) + var5) + '\uab08') + var5) - var5) + var5) >>> 4) ^ '\uebe9') - var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 26847) + var5) + '\uab08') + var5) - var5) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 26847) + var5) + '\uab08') + var5) - var5) + var5) >>> 4) ^ '\uebe9') - var5) << 5) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 26847) + var5) + '\uab08') + var5) - var5) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 26847) + var5) + '\uab08') + var5) - var5) + var5) >>> 4) ^ '\uebe9') - var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 26847) + var5) + '\uab08') + var5) - var5) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 26847) + var5) + '\uab08') + var5) - var5) + var5) >>> 4) ^ '\uebe9') - var5) << 5) >>> 5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IIIllIIliIIl() {
      this.lIllIlIliIllIlIl.clear();
   }

   public int iliIiiliiiii() {
      return this.lIllIlIliIllIlIl.size();
   }

   public boolean IIlllIlliIll(long cell) {
      for(IIllIlilIllIli var4 : this.lIllIlIliIllIlIl.values()) {
         if (var4.IliIlllilIi() && var4.IiIiliIiiiIi() != null && var4.IiIiliIiiiIi().liiiIIllIl(cell)) {
            return false;
         }
      }

      return true;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ '\uea1e') ^ var5) ^ '랻') - 1017) - 'ꤋ') ^ '龿'))) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean IlIlllIlilIl(IIllIlilIllIli o, LongUnaryOperator stateOf) {
      if (o == null) {
         return false;
      } else {
         long var2 = o.IiIiliIiiiIi() == null ? 0L : o.IiIiliIiiiIi().IilliliilIIi(stateOf);
         return iIiIliIliIli.liiiIIllIl(o.Iilllilliill(), stateOf) != o.IIillIiliIil() || var2 != o.Ililllililil();
      }
   }

   public List<IIllIlilIllIli> lIiiIiIlilli() {
      ArrayList var1 = new ArrayList();

      for(IIllIlilIllIli var3 : this.lIllIlIliIllIlIl.values()) {
         if (var3.IliIlllilIi()) {
            var1.add(var3);
         }
      }

      return var1;
   }

   public IIllIlilIllIli iIlIlllllill(long target) {
      return (IIllIlilIllIli)this.lIllIlIliIllIlIl.get(target);
   }
}
