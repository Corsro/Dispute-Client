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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class ilIIlilIiIIlil {
   private static final Map<String, String> iIIIliiIiIlIIliiIi = new HashMap();
   private static final Set<String> lIiiIiiIiiIiiIiiIi = Set.of(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
   private static final Map<String, String> IIIIliiIilIIIliiIi = Map.of(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
   public static final List<String> liiiIiiIiiiiiIiiIi = List.of(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
   public static final List<String> iliiIiiIiIiiiIiiIi = List.of(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
   private static final Map<String, String> IliiIiiIilliiIiiIi = Map.of(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
   private static final Set<String> iiliIiiIiIIiiIiiIi = Set.of(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
   private static final Set<String> IiIIliiIiliIIliiIi;
   private static final Set<String> llIIliiIiilIIliiIi;

   private ilIIlilIiIIlil() {
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 43611685424382730L ^ Long.rotateLeft(-7870772572067346812L, 40) ^ -5959312660512274210L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -6550164968062633779L ^ Long.rotateLeft(146300951659347349L, 26) ^ -5942059528633763983L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 4976041114757297959L ^ Long.rotateLeft(-8613863654952399264L, 41) ^ 6470828795817636224L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7005318747394139961L ^ Long.rotateLeft(6906181722565308175L, 62) ^ 4338519903634701110L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -372939111221376775L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 629132259988512943L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 8336607491916960119L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -6997844888099618060L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 8490832530896960833L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1505535273977430190L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIIilIIiiIIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IlIillIiilIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IiIiliIiiiIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIlilIliiIli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Illillliilli<invokedynamic>());
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
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)(~((char)(var4[var5] << 7 | var4[var5] >>> 9))) ^ var5) << 1 | (char)((char)(~((char)(var4[var5] << 7 | var4[var5] >>> 9))) ^ var5) >>> 15) >>> 1 | (char)((char)((char)(~((char)(var4[var5] << 7 | var4[var5] >>> 9))) ^ var5) << 1 | (char)((char)(~((char)(var4[var5] << 7 | var4[var5] >>> 9))) ^ var5) >>> 15) << 15) + 8938))))) ^ var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean liiiIIllIl(ilIllIiIll module) {
      return iiliIiiIiIIiiIiiIi.contains(module.lIiiIiIlilli());
   }

   public static boolean Illlllllilll(ilIllIiIll module) {
      String var1 = module.lIiiIiIlilli();
      return iliiIiiIiIiiiIiiIi.contains(var1) || liiiIiiIiiiiiIiiIi.contains(var1);
   }

   public static String IliIlllilIi(ilIllIiIll module) {
      return (String)iIIIliiIiIlIIliiIi.getOrDefault(module.lIiiIiIlilli(), "");
   }

   public static String iliIiiliiiii(ilIllIiIll module) {
      return (String)IIIIliiIilIIIliiIi.getOrDefault(module.lIiiIiIlilli(), "");
   }

   public static boolean lIiiIiIlilli(ilIllIiIll module) {
      return IIIIliiIilIIIliiIi.containsKey(module.lIiiIiIlilli());
   }

   static {
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(liiliIIliiiliIIl.liiiIIllIl(iiliililIIiiilil.class), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      iIIIliiIiIlIIliiIi.put(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      llIIliiIiilIIliiIi = Set.of(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
      IiIIliiIiliIIliiIi = new HashSet();
   }

   public static boolean IilliliilIIi(ilIllIiIll module) {
      return lIiiIiiIiiIiiIiiIi.contains(module.lIiiIiIlilli());
   }

   public static void Ililllililil(ilIllIiIll module) {
      IiIIliiIiliIIliiIi.add(module.lIiiIiIlilli());
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)(~((char)(-((char)(-((char)(-var4[var5]))))))) ^ var5) - '赈') - var5))))) + var5) + var5) + '뫦') - var5) ^ '轒') ^ 9925) ^ '铩') + 14376));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean IIIllIIliIIl(ilIllIiIll module) {
      return IliiIiiIilliiIiiIi.containsKey(module.lIiiIiIlilli());
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + var5) >>> 5 | (char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + var5) << 11))))) - '\uf3d0') ^ var5) ^ 32378) - var5) << 4 | (char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + var5) >>> 5 | (char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + var5) << 11))))) - '\uf3d0') ^ var5) ^ 32378) - var5) >>> 12))) << 6 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + var5) >>> 5 | (char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + var5) << 11))))) - '\uf3d0') ^ var5) ^ 32378) - var5) << 4 | (char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + var5) >>> 5 | (char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + var5) << 11))))) - '\uf3d0') ^ var5) ^ 32378) - var5) >>> 12))) >>> 10))) ^ 15859) << 12 | (char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + var5) >>> 5 | (char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + var5) << 11))))) - '\uf3d0') ^ var5) ^ 32378) - var5) << 4 | (char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + var5) >>> 5 | (char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + var5) << 11))))) - '\uf3d0') ^ var5) ^ 32378) - var5) >>> 12))) << 6 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + var5) >>> 5 | (char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + var5) << 11))))) - '\uf3d0') ^ var5) ^ 32378) - var5) << 4 | (char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + var5) >>> 5 | (char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + var5) << 11))))) - '\uf3d0') ^ var5) ^ 32378) - var5) >>> 12))) >>> 10))) ^ 15859) >>> 4) - 24160));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean IIillIiliIil(ilIllIiIll module) {
      return IiIIliiIiliIIliiIi.contains(module.lIiiIiIlilli());
   }

   public static boolean IIlllIlliIll(ilIllIiIll module) {
      return liiiIiiIiiiiiIiiIi.contains(module.lIiiIiIlilli());
   }

   public static boolean IiIlliIliiIl(ilIllIiIll module) {
      return iliiIiiIiIiiiIiiIi.contains(module.lIiiIiIlilli());
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + 'ﱾ') - var5) - var5) ^ '꺡') << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + 'ﱾ') - var5) - var5) ^ '꺡') >>> 5) ^ 3567) ^ var5) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + 'ﱾ') - var5) - var5) ^ '꺡') << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + 'ﱾ') - var5) - var5) ^ '꺡') >>> 5) ^ 3567) ^ var5) ^ var5) >>> 13))) << 2 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + 'ﱾ') - var5) - var5) ^ '꺡') << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + 'ﱾ') - var5) - var5) ^ '꺡') >>> 5) ^ 3567) ^ var5) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + 'ﱾ') - var5) - var5) ^ '꺡') << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + 'ﱾ') - var5) - var5) ^ '꺡') >>> 5) ^ 3567) ^ var5) ^ var5) >>> 13))) >>> 14) >>> 2 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + 'ﱾ') - var5) - var5) ^ '꺡') << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + 'ﱾ') - var5) - var5) ^ '꺡') >>> 5) ^ 3567) ^ var5) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + 'ﱾ') - var5) - var5) ^ '꺡') << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + 'ﱾ') - var5) - var5) ^ '꺡') >>> 5) ^ 3567) ^ var5) ^ var5) >>> 13))) << 2 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + 'ﱾ') - var5) - var5) ^ '꺡') << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + 'ﱾ') - var5) - var5) ^ '꺡') >>> 5) ^ 3567) ^ var5) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + 'ﱾ') - var5) - var5) ^ '꺡') << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + 'ﱾ') - var5) - var5) ^ '꺡') >>> 5) ^ 3567) ^ var5) ^ var5) >>> 13))) >>> 14) << 14) + var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean iIlIlllllill(ilIllIiIll module) {
      return liiiIIllIl(module) && !llIIliiIiilIIliiIi.contains(module.lIiiIiIlilli());
   }

   public static String IlIlllIlilIl(ilIllIiIll module) {
      return (String)IliiIiiIilliiIiiIi.getOrDefault(module.lIiiIiIlilli(), "");
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') << 8) ^ var5) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') << 8) ^ var5) >>> 8) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') << 8) ^ var5) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') << 8) ^ var5) >>> 8) << 12) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') << 8) ^ var5) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') << 8) ^ var5) >>> 8) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') << 8) ^ var5) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') << 8) ^ var5) >>> 8) << 12) >>> 14) << 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') << 8) ^ var5) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') << 8) ^ var5) >>> 8) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') << 8) ^ var5) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') << 8) ^ var5) >>> 8) << 12) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') << 8) ^ var5) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') << 8) ^ var5) >>> 8) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') << 8) ^ var5) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') << 7 | (char)((char)((char)((char)(var4[var5] + '뵇') - 27847) + var5) + '\uf4bb') >>> 9) << 8) ^ '軍') << 8) ^ var5) >>> 8) << 12) >>> 14) >>> 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static int Iilllilliill(ilIllIiIll module) {
      long var3 = 8387321645836876990L;
      String var1 = module.lIiiIiIlilli();
      var3 ^= ((long)iliiIiiIiIiiiIiiIi.indexOf(var1) << 32 ^ var3) & -1L << 32;
      if ((int)(var3 >>> 32) < 0) {
         var3 ^= ((long)liiiIiiIiiiiiIiiIi.indexOf(var1) << 32 ^ var3) & -1L << 32;
      }

      return (int)(var3 >>> 32) < 0 ? Integer.MAX_VALUE : (int)(var3 >>> 32);
   }
}
