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
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class lIiiIIiiIiiIIi {
   private long IiilIIIiiliilIIIii = 1L;
   private int IlIiIIIiillIiIIIii;
   private int iiilIIIiiIIIiIIIii;
   public static final int IIilIIIiilIilIIIii = 256;
   private int lIIiIIIiiiIIiIIIii;
   private final LinkedHashMap<Long, iIlIliIlIllIliIl> iIilIIIiiIlilIIIii = new LinkedHashMap();
   private final HashMap<Long, Long> llilIIIiiililIIIii = new HashMap();

   public List<liiililiiiilil> Iilililiiili() {
      ArrayList var1 = new ArrayList(this.iIilIIIiiIlilIIIii.size());

      for(iIlIliIlIllIliIl var3 : this.iIilIIIiiIlilIIIii.values()) {
         var1.add(var3.liiiIIllIl());
      }

      return var1;
   }

   public int Iiilliiliiil() {
      return this.iiilIIIiiIIIiIIIii;
   }

   public void IiIlliIliiIl(long cell) {
      Long var3 = (Long)this.llilIIIiiililIIIii.remove(cell);
      if (var3 != null) {
         ++this.lIIiIIIiiiIIiIIIii;
         iIlIliIlIllIliIl var4 = (iIlIliIlIllIliIl)this.iIilIIIiiIlilIIIii.get(var3);
         if (var4 != null) {
            if (var4.IliIlllilIi()) {
               ++this.iiilIIIiiIIIiIIIii;
            }

            var4.lIliiliIll.remove(cell);
            if (var4.lIliiliIll.isEmpty()) {
               var4.IIliiliIll = llliillilliill.iiIIlllIiIIlIlllIi;
            }

         }
      }
   }

   // $FF: synthetic method
   private static CallSite iiIIlIIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 'ꏮ') ^ var5) ^ '옴') - 'ꢛ') - 'ꓩ') ^ var5) + 27753) ^ 27608) ^ var5) + '\uf50b') + var5) - var5) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 'ꏮ') ^ var5) ^ '옴') - 'ꢛ') - 'ꓩ') ^ var5) + 27753) ^ 27608) ^ var5) + '\uf50b') + var5) - var5) << 2) - 29139) + var5) ^ 17477) + '몹'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IIillIiliIil(llliillilliill s) {
      long var5 = -8707627282194286701L;
      var5 ^= (0L ^ var5) & -1L << 32;

      for(iIlIliIlIllIliIl var4 : this.iIilIIIiiIlilIIIii.values()) {
         if (var4.IIliiliIll == s) {
            var5 += 4294967296L;
         }
      }

      return (int)(var5 >>> 32);
   }

   public long IilliliilIIi(long cell) {
      return (Long)this.llilIIIiiililIIIii.getOrDefault(cell, 0L);
   }

   public void IIIllIIliIIl(long networkId, long feetCell) {
      iIlIliIlIllIliIl var5 = (iIlIliIlIllIliIl)this.iIilIIIiiIlilIIIii.get(networkId);
      if (var5 != null && var5.IIliiliIll == llliillilliill.llIIlllIiilIIlllIi) {
         if (!var5.lIliiliIll.contains(feetCell) && !var5.lIliiliIll.contains(IIIIllIIIl(feetCell))) {
            var5.IIliiliIll = llliillilliill.IiIIlllIiliIIlllIi;
         }
      }
   }

   public void IlIlllIlilIl(long ownerKey, long networkId) {
      iIlIliIlIllIliIl var5 = (iIlIliIlIllIliIl)this.iIilIIIiiIlilIIIii.get(ownerKey);
      if (var5 != null && var5.IIliiliIll != llliillilliill.iiIIlllIiIIlIlllIi) {
         var5.IIliiliIll = llliillilliill.iIIIlllIiIlIIlllIi;
         var5.iiIiiliIll = networkId;
      }
   }

   public long[] Illillliilli(llliillilliill s) {
      long var7 = 5593966621671252770L;
      var7 ^= (0L ^ var7) & -1L << 32;

      for(iIlIliIlIllIliIl var4 : this.iIilIIIiiIlilIIIii.values()) {
         if (var4.IIliiliIll == s) {
            var7 += 4294967296L;
         }
      }

      long[] var9 = new long[(int)(var7 >>> 32)];
      var7 ^= (0L ^ var7) & -1L >>> 32;

      for(iIlIliIlIllIliIl var6 : this.iIilIIIiiIlilIIIii.values()) {
         if (var6.IIliiliIll == s) {
            int var10001 = (int)var7;
            var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32;
            var9[var10001] = var6.IiIiiliIll;
         }
      }

      return var9;
   }

   public void IIiilIiiiIii() {
      this.iIilIIIiiIlilIIIii.clear();
      this.llilIIIiiililIIIii.clear();
      this.IiilIIIiiliilIIIii = 1L;
      this.iiilIIIiiIIIiIIIii = 0;
      this.lIIiIIIiiiIIiIIIii = 0;
      this.IlIiIIIiillIiIIIii = 0;
   }

   public String Iliilliiilii() {
      return iIIIlIlIIl<invokedynamic>() + this.iIilIIIiiIlilIIIii.size() + iIIIlIlIIl<invokedynamic>() + this.IIillIiliIil(llliillilliill.iIIIlllIiIlIIlllIi) + iIIIlIlIIl<invokedynamic>() + this.IIillIiliIil(llliillilliill.llIIlllIiilIIlllIi) + iIIIlIlIIl<invokedynamic>() + this.IIillIiliIil(llliillilliill.IiIIlllIiliIIlllIi) + iIIIlIlIIl<invokedynamic>() + this.IIillIiliIil(llliillilliill.iiIIlllIiIIlIlllIi) + iIIIlIlIIl<invokedynamic>() + this.Iilllilliill() + iIIIlIlIIl<invokedynamic>() + this.IIlllIlliIll().size() + iIIIlIlIIl<invokedynamic>() + this.lIIiIIIiiiIIiIIIii + iIIIlIlIIl<invokedynamic>() + this.iiilIIIiiIIIiIIIii + iIIIlIlIIl<invokedynamic>() + this.IlIiIIIiillIiIIIii;
   }

   // $FF: synthetic method
   private static CallSite IiIIlliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5))) + var5) - var5) ^ 2211))) + var5) ^ var5) + var5) << 4 | (char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5))) + var5) - var5) ^ 2211))) + var5) ^ var5) + var5) >>> 12) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IlIillIiilIi() {
      return this.IlIiIIIiillIiIIIii;
   }

   public void iliIiiliiiii(long networkId) {
      iIlIliIlIllIliIl var3 = (iIlIliIlIllIliIl)this.iIilIIIiiIlilIIIii.get(networkId);
      if (var3 != null && var3.IIliiliIll == llliillilliill.iIIIlllIiIlIIlllIi) {
         var3.IIliiliIll = llliillilliill.llIIlllIiilIIlllIi;
      }

   }

   public liiililiiiilil IIlilIliiIli(long networkId) {
      iIlIliIlIllIliIl var3 = (iIlIliIlIllIliIl)this.iIilIIIiiIlilIIIii.get(networkId);
      return var3 == null ? null : var3.liiiIIllIl();
   }

   public int IiIiliIiiiIi() {
      return this.iIilIIIiiIlilIIIii.size();
   }

   public Set<Long> Ililllililil(Collection<Long> ownedTempCells) {
      LinkedHashSet var2 = new LinkedHashSet();
      if (ownedTempCells == null) {
         return var2;
      } else {
         for(Long var4 : ownedTempCells) {
            if (var4 != null && !this.llilIIIiiililIIIii.containsKey(var4)) {
               var2.add(var4);
            }
         }

         return var2;
      }
   }

   public Set<Long> IIlllIlliIll() {
      LinkedHashSet var1 = new LinkedHashSet();

      for(iIlIliIlIllIliIl var3 : this.iIilIIIiiIlilIIIii.values()) {
         if (var3.IIliiliIll == llliillilliill.IiIIlllIiliIIlllIi) {
            var1.addAll(var3.lIliiliIll);
         }
      }

      return Collections.unmodifiableSet(var1);
   }

   public int IIIilIIiiIIi() {
      return this.lIIiIIIiiiIIiIIIii;
   }

   public void liiiIIllIl(long networkId, long cell) {
      iIlIliIlIllIliIl var5 = (iIlIliIlIllIliIl)this.iIilIIIiiIlilIIIii.get(networkId);
      if (var5 != null && var5.IIliiliIll != llliillilliill.iiIIlllIiIIlIlllIi) {
         Long var6 = (Long)this.llilIIIiiililIIIii.put(cell, networkId);
         if (var6 != null && var6 != networkId) {
            iIlIliIlIllIliIl var7 = (iIlIliIlIllIliIl)this.iIilIIIiiIlilIIIii.get(var6);
            if (var7 != null) {
               var7.lIliiliIll.remove(cell);
            }
         }

         var5.lIliiliIll.add(cell);
      }
   }

   // $FF: synthetic method
   private static CallSite lIlIliIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(var4[var5] + '쨩') >>> 4 | (char)(var4[var5] + '쨩') << 12) - var5) >>> 15 | (char)((char)((char)(var4[var5] + '쨩') >>> 4 | (char)(var4[var5] + '쨩') << 12) - var5) << 1))))) - var5) << 5 | (char)((char)(-((char)(-((char)((char)((char)((char)(var4[var5] + '쨩') >>> 4 | (char)(var4[var5] + '쨩') << 12) - var5) >>> 15 | (char)((char)((char)(var4[var5] + '쨩') >>> 4 | (char)(var4[var5] + '쨩') << 12) - var5) << 1))))) - var5) >>> 11) - var5) ^ 27693) ^ var5))) - '\uf626') ^ 'ꁛ') + var5) - var5) + '\uf6f0') ^ var5) ^ '뾠'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static long IIIIllIIIl(long cell) {
      return llIiIiililIiIiil.IIIllIIliIIl(llIiIiililIiIiil.IiIlliIliiIl(cell), llIiIiililIiIiil.IIlllIlliIll(cell) - 1, llIiIiililIiIiil.Illlllllilll(cell));
   }

   public long IliIlllilIi(long tick, int ownerKey) {
      while(this.iIilIIIiiIlilIIIii.size() >= 256) {
         this.Iiiiliiiiiii();
      }

      long var4 = (long)(this.IiilIIIiiliilIIIii++);
      this.iIilIIIiiIlilIIIii.put(var4, new iIlIliIlIllIliIl(var4, tick, ownerKey));
      return var4;
   }

   public int Iilllilliill() {
      long var4 = 2117953152477494070L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for(iIlIliIlIllIliIl var3 : this.iIilIIIiiIlilIIIii.values()) {
         if (var3.IIliiliIll != llliillilliill.iiIIlllIiIIlIlllIi) {
            var4 ^= ((long)((int)(var4 >>> 32) + var3.lIliiliIll.size()) << 32 ^ var4) & -1L << 32;
         }
      }

      return (int)(var4 >>> 32);
   }

   // $FF: synthetic method
   private static CallSite IllIllllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - '︲'))) - var5) + var5) ^ 7509) >>> 15 | (char)((char)((char)((char)(~((char)(var4[var5] - '︲'))) - var5) + var5) ^ 7509) << 1) - 18482) + 29849)))) - 'ﴙ') + var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void Iiiiliiiiiii() {
      iIlIliIlIllIliIl var1 = null;

      for(iIlIliIlIllIliIl var3 : this.iIilIIIiiIlilIIIii.values()) {
         if (var3.IIliiliIll == llliillilliill.iiIIlllIiIIlIlllIi) {
            var1 = var3;
            break;
         }
      }

      if (var1 == null) {
         var1 = (iIlIliIlIllIliIl)this.iIilIIIiiIlilIIIii.values().iterator().next();
      }

      this.iIilIIIiiIlilIIIii.remove(var1.IiIiiliIll);

      for(Long var5 : var1.lIliiliIll) {
         this.llilIIIiiililIIIii.remove(var5, var1.IiIiiliIll);
      }

      ++this.IlIiIIIiillIiIIIii;
   }

   public void iIlIlllllill(long networkId, long target) {
      iIlIliIlIllIliIl var5 = (iIlIliIlIllIliIl)this.iIilIIIiiIlilIIIii.get(networkId);
      if (var5 != null) {
         var5.iIliiliIll.add(target);
      }

   }

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) << 2 | (char)(var4[var5] >>> 5 | var4[var5] << 11) >>> 14) ^ '\uf551'))))) + var5) << 5 | (char)((char)(-((char)(~((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) << 2 | (char)(var4[var5] >>> 5 | var4[var5] << 11) >>> 14) ^ '\uf551'))))) + var5) >>> 11))) + var5) << 13 | (char)((char)(~((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) << 2 | (char)(var4[var5] >>> 5 | var4[var5] << 11) >>> 14) ^ '\uf551'))))) + var5) << 5 | (char)((char)(-((char)(~((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) << 2 | (char)(var4[var5] >>> 5 | var4[var5] << 11) >>> 14) ^ '\uf551'))))) + var5) >>> 11))) + var5) >>> 3) >>> 12 | (char)((char)((char)(~((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) << 2 | (char)(var4[var5] >>> 5 | var4[var5] << 11) >>> 14) ^ '\uf551'))))) + var5) << 5 | (char)((char)(-((char)(~((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) << 2 | (char)(var4[var5] >>> 5 | var4[var5] << 11) >>> 14) ^ '\uf551'))))) + var5) >>> 11))) + var5) << 13 | (char)((char)(~((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) << 2 | (char)(var4[var5] >>> 5 | var4[var5] << 11) >>> 14) ^ '\uf551'))))) + var5) << 5 | (char)((char)(-((char)(~((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) << 2 | (char)(var4[var5] >>> 5 | var4[var5] << 11) >>> 14) ^ '\uf551'))))) + var5) >>> 11))) + var5) >>> 3) << 4) + '蜒') ^ 9311) + var5) - 'ꒅ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean Illlllllilll(long cell) {
      Long var3 = (Long)this.llilIIIiiililIIIii.get(cell);
      if (var3 == null) {
         return false;
      } else {
         iIlIliIlIllIliIl var4 = (iIlIliIlIllIliIl)this.iIilIIIiiIlilIIIii.get(var3);
         return var4 != null && var4.IliIlllilIi();
      }
   }

   // $FF: synthetic method
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -5348828815858659935L ^ Long.rotateLeft(3569256764748505753L, 46) ^ -2641574819745284885L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5106729685014624259L ^ Long.rotateLeft(-8726704798644369342L, 51) ^ -7742752716685646389L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 2108440969408087848L ^ Long.rotateLeft(30440516460668278L, 19) ^ -3187107492773313427L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -2729880130720963563L ^ Long.rotateLeft(-1846771368813262010L, 6) ^ -8463146427823815844L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8681410012789321620L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -811206366179279388L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 6639754003904681849L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3002524975949272059L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6042210987258399681L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -919328971594844674L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(llIIlilIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIIlliIIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, iiIIlIIlIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, lIlIliIlIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IllIllllIl<invokedynamic>());
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

   public llliillilliill lIiiIiIlilli(long networkId) {
      iIlIliIlIllIliIl var3 = (iIlIliIlIllIliIl)this.iIilIIIiiIlilIIIii.get(networkId);
      return var3 == null ? null : var3.IIliiliIll;
   }
}
