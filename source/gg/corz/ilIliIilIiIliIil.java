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

public final class ilIliIilIiIliIil {
   public static final String lIiIIilIil = "Not enough restock containers marked before autobuy";

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') >>> 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') << 10))) >>> 11 | (char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') >>> 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') << 10))) << 5) << 1 | (char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') >>> 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') << 10))) >>> 11 | (char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') >>> 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') << 10))) << 5) >>> 15) << 10 | (char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') >>> 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') << 10))) >>> 11 | (char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') >>> 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') << 10))) << 5) << 1 | (char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') >>> 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') << 10))) >>> 11 | (char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') >>> 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') << 10))) << 5) >>> 15) >>> 6) << 10 | (char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') >>> 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') << 10))) >>> 11 | (char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') >>> 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') << 10))) << 5) << 1 | (char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') >>> 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') << 10))) >>> 11 | (char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') >>> 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') << 10))) << 5) >>> 15) << 10 | (char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') >>> 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') << 10))) >>> 11 | (char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') >>> 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') << 10))) << 5) << 1 | (char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') >>> 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') << 10))) >>> 11 | (char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') >>> 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] + var5) ^ 16355))))) + 27178) + var5) ^ var5) + var5))) ^ '\uf40d') + 'Ꝓ') << 10))) << 5) >>> 15) >>> 6) >>> 6) + 28816) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static <K> List<iillllIlIIilllIl<K>> IliIlllilIi(Map<K, Integer> maxStack, Map<K, Integer> required, Map<K, Integer> inventory, Map<K, Integer> placed, ToIntFunction<K> stored) {
      ArrayList var5 = new ArrayList();

      for(Map.Entry var7 : maxStack.entrySet()) {
         Object var8 = var7.getKey();
         var5.add(iillllIlIIilllIl.IliIlllilIi(var8, (Integer)var7.getValue(), (Integer)required.getOrDefault(var8, 0), (Integer)inventory.getOrDefault(var8, 0), (Integer)placed.getOrDefault(var8, 0), stored.applyAsInt(var8)));
      }

      return var5;
   }

   public static <K> String iliIiiliiiii(List<iillllIlIIilllIl<K>> c, IiIlIIllliIlIIll containers, int rows) {
      return IIIllIIliIIl<invokedynamic>() + c.size() + IIIllIIliIIl<invokedynamic>() + IilliliilIIi(c) + IIIllIIliIIl<invokedynamic>() + lIiiIiIlilli(c) + IIIllIIliIIl<invokedynamic>() + containers.iIlIlllllill() + IIIllIIliIIl<invokedynamic>() + containers.IilliliilIIi() + IIIllIIliIIl<invokedynamic>() + rows + IIIllIIliIIl<invokedynamic>() + containers.iliIiiliiiii();
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -4591948454955907375L ^ Long.rotateLeft(9167780510301539496L, 30) ^ -771160494277024175L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -6594407039866812107L ^ Long.rotateLeft(-7576559048056848305L, 49) ^ -8532651538090456238L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 2367104224873302983L ^ Long.rotateLeft(-9177669156522868958L, 7) ^ -688928879539679333L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1083964098942607246L ^ Long.rotateLeft(4163321589220612290L, 14) ^ 5176335847611267008L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1585782668012221317L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -5691626688239951130L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -3280545019918653865L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 9137934142177378895L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -5735097965579360906L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -2264816134405333462L;
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

   public static <K> int lIiiIiIlilli(List<iillllIlIIilllIl<K>> rows) {
      long var4 = 7271095937976835821L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for(iillllIlIIilllIl var3 : rows) {
         var4 ^= ((long)((int)(var4 >>> 32) + var3.IiIlliIliiIl()) << 32 ^ var4) & -1L << 32;
      }

      return (int)(var4 >>> 32);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + var5) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + var5) << 7) << 8 | (char)((char)((char)(-((char)(var4[var5] ^ var5))) + var5) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + var5) << 7) >>> 8) << 3 | (char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + var5) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + var5) << 7) << 8 | (char)((char)((char)(-((char)(var4[var5] ^ var5))) + var5) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + var5) << 7) >>> 8) >>> 13) + var5) << 6 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + var5) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + var5) << 7) << 8 | (char)((char)((char)(-((char)(var4[var5] ^ var5))) + var5) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + var5) << 7) >>> 8) << 3 | (char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + var5) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + var5) << 7) << 8 | (char)((char)((char)(-((char)(var4[var5] ^ var5))) + var5) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + var5) << 7) >>> 8) >>> 13) + var5) >>> 10))) + var5) + var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + 23670) ^ var5) << 12 | (char)((char)(var4[var5] + 23670) ^ var5) >>> 4) << 3 | (char)((char)((char)(var4[var5] + 23670) ^ var5) << 12 | (char)((char)(var4[var5] + 23670) ^ var5) >>> 4) >>> 13))) - var5) - 19402) + var5) << 6 | (char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + 23670) ^ var5) << 12 | (char)((char)(var4[var5] + 23670) ^ var5) >>> 4) << 3 | (char)((char)((char)(var4[var5] + 23670) ^ var5) << 12 | (char)((char)(var4[var5] + 23670) ^ var5) >>> 4) >>> 13))) - var5) - 19402) + var5) >>> 10) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static <K> IiIlIIllliIlIIll liiiIIllIl(List<iillllIlIIilllIl<K>> accessibleContainerFreeSlots, int usableContainers, int freeInventorySlots, int rows, int inaccessibleContainers) {
      long var8 = -3034575539478112189L;
      var8 ^= (0L ^ var8) & -1L << 32;

      for(iillllIlIIilllIl var7 : accessibleContainerFreeSlots) {
         var8 ^= ((long)((int)(var8 >>> 32) + var7.Illlllllilll()) << 32 ^ var8) & -1L << 32;
      }

      var8 ^= ((long)(Math.max(0, usableContainers) + Math.max(0, freeInventorySlots)) ^ var8) & -1L >>> 32;
      return new IiIlIIllliIlIIll((int)(var8 >>> 32), (int)var8, Math.max(0, (int)(var8 >>> 32) - (int)var8), rows, inaccessibleContainers);
   }

   public static <K> int IilliliilIIi(List<iillllIlIIilllIl<K>> rows) {
      long var4 = -691817011860512192L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for(iillllIlIIilllIl var3 : rows) {
         var4 ^= ((long)((int)(var4 >>> 32) + var3.iliIiiliiiii()) << 32 ^ var4) & -1L << 32;
      }

      return (int)(var4 >>> 32);
   }

   private ilIliIilIiIliIil() {
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)(-((char)(~((char)((char)(-var4[var5]) >>> 2 | (char)(-var4[var5]) << 14))))))))) >>> 2 | (char)(~((char)(~((char)(-((char)(~((char)((char)(-var4[var5]) >>> 2 | (char)(-var4[var5]) << 14))))))))) << 14) + '둋') ^ '\uf433') ^ var5) - 32444) - 22451));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static <K> LinkedHashMap<K, Integer> iIlIlllllill(List<iillllIlIIilllIl<K>> rows) {
      LinkedHashMap var1 = new LinkedHashMap();

      for(iillllIlIIilllIl var3 : rows) {
         if (var3.IiIlliIliiIl() > 0) {
            var1.put(var3.iIlIlllllill(), var3.IiIlliIliiIl());
         }
      }

      return var1;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) ^ 25764) << 1 | (char)((char)(var4[var5] + var5) ^ 25764) >>> 15) << 13 | (char)((char)((char)(var4[var5] + var5) ^ 25764) << 1 | (char)((char)(var4[var5] + var5) ^ 25764) >>> 15) >>> 3))) + 29628))) ^ var5) ^ '\uf4dd') << 15 | (char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) ^ 25764) << 1 | (char)((char)(var4[var5] + var5) ^ 25764) >>> 15) << 13 | (char)((char)((char)(var4[var5] + var5) ^ 25764) << 1 | (char)((char)(var4[var5] + var5) ^ 25764) >>> 15) >>> 3))) + 29628))) ^ var5) ^ '\uf4dd') >>> 1) << 11 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) ^ 25764) << 1 | (char)((char)(var4[var5] + var5) ^ 25764) >>> 15) << 13 | (char)((char)((char)(var4[var5] + var5) ^ 25764) << 1 | (char)((char)(var4[var5] + var5) ^ 25764) >>> 15) >>> 3))) + 29628))) ^ var5) ^ '\uf4dd') << 15 | (char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) ^ 25764) << 1 | (char)((char)(var4[var5] + var5) ^ 25764) >>> 15) << 13 | (char)((char)((char)(var4[var5] + var5) ^ 25764) << 1 | (char)((char)(var4[var5] + var5) ^ 25764) >>> 15) >>> 3))) + 29628))) ^ var5) ^ '\uf4dd') >>> 1) >>> 5) ^ var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
