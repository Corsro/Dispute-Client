package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IlIlilllIlil {
   private String lIllilliiIllilli = "";
   private int iiIlilliIIllilli;
   public static final int iIIlilliIlIlilli = 512;
   public static final int llIlilliilIlilli = 64;
   private final LinkedHashMap<Long, LinkedHashMap<Long, lliIIliiliIIli>> IiIlilliliIlilli = new LinkedHashMap<Long, LinkedHashMap<Long, lliIIliiliIIli>>(this, 16, false) {
      protected boolean removeEldestEntry(Map.Entry<Long, LinkedHashMap<Long, lliIIliiliIIli>> e) {
         return this.size() > 64;
      }
   };

   public int IIlllIlliIll() {
      return this.IiIlilliliIlilli.size();
   }

   public String Iilllilliill() {
      return this.lIllilliiIllilli;
   }

   public Set<Long> iliIiiliiiii(long component) {
      Map var3 = (Map)this.IiIlilliliIlilli.get(component);
      if (var3 == null) {
         return Set.of();
      } else {
         LinkedHashSet var4 = new LinkedHashSet();

         for(lliIIliiliIIli var6 : var3.values()) {
            if (var6.iIlIlllllill() == IiIIiiilliIIiiil.iIIiiIIiil) {
               var4.add(var6.IliIlllilIi());
            }
         }

         return Collections.unmodifiableSet(var4);
      }
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(~var4[var5]))))) + var5) + var5) + var5) + var5) + 9228) + var5) << 8 | (char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(~var4[var5]))))) + var5) + var5) + var5) + var5) + 9228) + var5) >>> 8) + '\udb93') + 1612) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(~var4[var5]))))) + var5) + var5) + var5) + var5) + 9228) + var5) << 8 | (char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(~var4[var5]))))) + var5) + var5) + var5) + var5) + 9228) + var5) >>> 8) + '\udb93') + 1612) << 13));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private lliIIliiliIIli lIiiIiIlilli(lliIIliiliIIli c) {
      LinkedHashMap var2 = (LinkedHashMap)this.IiIlilliliIlilli.computeIfAbsent(c.liiiIIllIl(), (k) -> new LinkedHashMap<Long, lliIIliiliIIli>(this, 0.75F, false) {
            protected boolean removeEldestEntry(Map.Entry<Long, lliIIliiliIIli> e) {
               return this.size() > 512;
            }
         });
      lliIIliiliIIli var3 = (lliIIliiliIIli)var2.remove(c.IliIlllilIi());
      var2.put(c.IliIlllilIi(), c);
      return var3;
   }

   public void IIillIiliIil() {
      this.IiIlilliliIlilli.clear();
      this.iiIlilliIIllilli = 0;
      this.lIllilliiIllilli = "";
   }

   public int iIlIlllllill(long component, long geometryRevision, long stand) {
      lliIIliiliIIli var7 = this.lIiiIiIlilli(new lliIIliiliIIli(component, geometryRevision, IiIIiiilliIIiiil.lIIiiIIiil, stand, 0, ""));
      if (var7 != null && var7.iIlIlllllill() == IiIIiiilliIIiiil.iIIiiIIiil) {
         ++this.iiIlilliIIllilli;
         return 1;
      } else {
         return 0;
      }
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(-((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) + 25784) - 27563) ^ var5) - var5) - var5) << 14 | (char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) + 25784) - 27563) ^ var5) - var5) - var5) >>> 2) + '큍') << 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) + 25784) - 27563) ^ var5) - var5) - var5) << 14 | (char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) + 25784) - 27563) ^ var5) - var5) - var5) >>> 2) + '큍') >>> 7))))))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IiIIiiilliIIiiil IliIlllilIi(long geometryRevision, long stand, long component) {
      lliIIliiliIIli var7 = this.liiiIIllIl(geometryRevision, stand);
      return var7 != null && var7.IilliliilIIi() == component ? var7.iIlIlllllill() : IiIIiiilliIIiiil.IlIiiIIiil;
   }

   public int IilliliilIIi(long geometryRevision, long component, long failureClass, String stand) {
      long var11 = 6843918761858518634L;
      String var8 = stand == null ? "" : stand;
      this.lIllilliiIllilli = var8;
      lliIIliiliIIli var9 = this.liiiIIllIl(geometryRevision, component);
      var11 ^= ((long)(var9 != null && var9.iIlIlllllill() == IiIIiiilliIIiiil.iIIiiIIiil ? var9.lIiiIiIlilli() + 1 : 1) << 32 ^ var11) & -1L << 32;
      this.lIiiIiIlilli(new lliIIliiliIIli(geometryRevision, component, IiIIiiilliIIiiil.iIIiiIIiil, failureClass, (int)(var11 >>> 32), var8));
      return (int)(var11 >>> 32);
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + var5) >>> 7 | (char)((char)(var4[var5] - var5) + var5) << 9) - var5) - 3296) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] - var5) + var5) >>> 7 | (char)((char)(var4[var5] - var5) + var5) << 9) - var5) - 3296) << 15)) + 22699) - var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + var5) >>> 7 | (char)((char)(var4[var5] - var5) + var5) << 9) - var5) - 3296) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] - var5) + var5) >>> 7 | (char)((char)(var4[var5] - var5) + var5) << 9) - var5) - 3296) << 15)) + 22699) - var5) << 4))) ^ var5) + var5))) + var5) >>> 5 | (char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + var5) >>> 7 | (char)((char)(var4[var5] - var5) + var5) << 9) - var5) - 3296) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] - var5) + var5) >>> 7 | (char)((char)(var4[var5] - var5) + var5) << 9) - var5) - 3296) << 15)) + 22699) - var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + var5) >>> 7 | (char)((char)(var4[var5] - var5) + var5) << 9) - var5) - 3296) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] - var5) + var5) >>> 7 | (char)((char)(var4[var5] - var5) + var5) << 9) - var5) - 3296) << 15)) + 22699) - var5) << 4))) ^ var5) + var5))) + var5) << 11))) + 30732));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public lliIIliiliIIli liiiIIllIl(long component, long stand) {
      Map var5 = (Map)this.IiIlilliliIlilli.get(stand);
      return var5 == null ? null : (lliIIliiliIIli)var5.get(component);
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5)) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5)) + var5) ^ var5) + var5) >>> 9))))) - 19261))))) >>> 8 | (char)(~((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5)) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5)) + var5) ^ var5) + var5) >>> 9))))) - 19261))))) << 8) + var5) + var5) + 11802));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IlIlllIlilIl(long stand, long component) {
      lliIIliiliIIli var5 = this.liiiIIllIl(stand, component);
      return var5 == null ? 0 : var5.lIiiIiIlilli();
   }

   public int Illlllllilll() {
      long var4 = 220391487608220932L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for(Map var3 : this.IiIlilliliIlilli.values()) {
         var4 ^= ((long)((int)(var4 >>> 32) + var3.size()) << 32 ^ var4) & -1L << 32;
      }

      return (int)(var4 >>> 32);
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ 25388) - 10496))) - var5) << 13 | (char)((char)(-((char)((char)(var4[var5] ^ 25388) - 10496))) - var5) >>> 3) ^ var5) - '\udfd9') ^ 18736) + var5) << 4 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ 25388) - 10496))) - var5) << 13 | (char)((char)(-((char)((char)(var4[var5] ^ 25388) - 10496))) - var5) >>> 3) ^ var5) - '\udfd9') ^ 18736) + var5) >>> 12))))))) ^ var5) << 5 | (char)((char)(-((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ 25388) - 10496))) - var5) << 13 | (char)((char)(-((char)((char)(var4[var5] ^ 25388) - 10496))) - var5) >>> 3) ^ var5) - '\udfd9') ^ 18736) + var5) << 4 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ 25388) - 10496))) - var5) << 13 | (char)((char)(-((char)((char)(var4[var5] ^ 25388) - 10496))) - var5) >>> 3) ^ var5) - '\udfd9') ^ 18736) + var5) >>> 12))))))) ^ var5) >>> 11) + var5) ^ '\udc6f') << 10 | (char)((char)((char)((char)((char)(-((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ 25388) - 10496))) - var5) << 13 | (char)((char)(-((char)((char)(var4[var5] ^ 25388) - 10496))) - var5) >>> 3) ^ var5) - '\udfd9') ^ 18736) + var5) << 4 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ 25388) - 10496))) - var5) << 13 | (char)((char)(-((char)((char)(var4[var5] ^ 25388) - 10496))) - var5) >>> 3) ^ var5) - '\udfd9') ^ 18736) + var5) >>> 12))))))) ^ var5) << 5 | (char)((char)(-((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ 25388) - 10496))) - var5) << 13 | (char)((char)(-((char)((char)(var4[var5] ^ 25388) - 10496))) - var5) >>> 3) ^ var5) - '\udfd9') ^ 18736) + var5) << 4 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ 25388) - 10496))) - var5) << 13 | (char)((char)(-((char)((char)(var4[var5] ^ 25388) - 10496))) - var5) >>> 3) ^ var5) - '\udfd9') ^ 18736) + var5) >>> 12))))))) ^ var5) >>> 11) + var5) ^ '\udc6f') >>> 6));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -4352109278872366747L ^ Long.rotateLeft(2297457746559749074L, 15) ^ -3061319052078051350L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -8752632511159319217L ^ Long.rotateLeft(4035082500693694053L, 25) ^ 4012555781499616608L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6011377487802799619L ^ Long.rotateLeft(6513082494576349709L, 9) ^ 5522453506689159682L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -2581737265633524492L ^ Long.rotateLeft(-8753146129568466066L, 49) ^ -6733449054381838833L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8976824186142610977L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3762342514798226493L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1838467165350302440L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5046595033498970312L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 8203016990934752564L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -334348860970450876L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IlIillIiilIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIiliIiiiIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIlilIliiIli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Illillliilli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iilililiiili<invokedynamic>());
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

   public int IiIlliIliiIl() {
      return this.iiIlilliIIllilli;
   }

   public boolean IIIllIIliIIl(long component, long stand) {
      lliIIliiliIIli var5 = this.liiiIIllIl(component, stand);
      return var5 != null && var5.iIlIlllllill() == IiIIiiilliIIiiil.iIIiiIIiil;
   }

   public String Ililllililil() {
      long var7 = -5180561275536861636L;
      var7 ^= (0L ^ var7) & -1L << 32;
      var7 ^= (0L ^ var7) & -1L >>> 32;

      for(Map var4 : this.IiIlilliliIlilli.values()) {
         for(lliIIliiliIIli var6 : var4.values()) {
            if (var6.iIlIlllllill() == IiIIiiilliIIiiil.iIIiiIIiil) {
               var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32;
            } else {
               var7 += 4294967296L;
            }
         }
      }

      return IIIilIIiiIIi<invokedynamic>() + this.IiIlilliliIlilli.size() + IIIilIIiiIIi<invokedynamic>() + (int)(var7 >>> 32) + IIIilIIiiIIi<invokedynamic>() + (int)var7 + IIIilIIiiIIi<invokedynamic>() + this.iiIlilliIIllilli + (this.lIllilliiIllilli.isEmpty() ? "" : IIIilIIiiIIi<invokedynamic>() + this.lIllilliiIllilli);
   }
}
