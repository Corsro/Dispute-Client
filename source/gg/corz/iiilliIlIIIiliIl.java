package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class iiilliIlIIIiliIl {
   private long ililiiiIll = Long.MIN_VALUE;
   private final LinkedHashMap<Long, liiiiiIiiiiiiiIi> IliliiiIll = new LinkedHashMap();
   private final HashMap<Long, Long> iIiliiiIll = new HashMap();
   private int lliliiiIll;
   private static final int[][] lIiliiiIll = new int[][]{{1, 0, 0}, {-1, 0, 0}, {0, 1, 0}, {0, -1, 0}, {0, 0, 1}, {0, 0, -1}};
   public static final int IIiliiiIll = 4096;
   public static final int iilliiiIll = 512;

   public long IiIiliIiiiIi() {
      return this.ililiiiIll;
   }

   public int IIIilIIiiIIi() {
      return this.lliliiiIll;
   }

   public IIiiiiillIiiiiil IiIlliIliiIl(long root) {
      liiiiiIiiiiiiiIi var3 = (liiiiiIiiiiiiiIi)this.IliliiiIll.get(root);
      return var3 == null ? null : new IIiiiiillIiiiiil(root, Collections.unmodifiableSet(var3.IIIiiIIlIi), var3.lIIiiIIlIi, var3.iIIiiIIlIi, var3.IlIiiIIlIi);
   }

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) + 27476) - var5) + 2271))) >>> 15 | (char)(~((char)((char)((char)((char)(var4[var5] + var5) + 27476) - var5) + 2271))) << 1) - var5))) + 7139) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Ililllililil() {
      return this.IliliiiIll.size();
   }

   public long IIlllIlliIll(long target) {
      return (Long)this.iIiliiiIll.getOrDefault(target, Long.MIN_VALUE);
   }

   public static Map<Long, Long> liiiIIllIl(Collection<Long> radius, int cells) {
      return IilliliilIIi(radius, Math.max(0, cells), false);
   }

   public boolean Illlllllilll(long attemptsLimit, int root) {
      liiiiiIiiiiiiiIi var4 = (liiiiiIiiiiiiiIi)this.IliliiiIll.get(attemptsLimit);
      return var4 != null && var4.lIIiiIIlIi >= root;
   }

   public static Map<Long, Long> IliIlllilIi(Collection<Long> cells) {
      return IilliliilIIi(cells, -1, false);
   }

   public Set<Long> IIillIiliIil(long root) {
      liiiiiIiiiiiiiIi var3 = (liiiiiIiiiiiiiIi)this.IliliiiIll.get(root);
      return var3 == null ? Set.of() : Collections.unmodifiableSet(var3.IIIiiIIlIi);
   }

   public void IIlilIliiIli(long root) {
      liiiiiIiiiiiiiIi var3 = (liiiiiIiiiiiiiIi)this.IliliiiIll.remove(root);
      if (var3 != null) {
         for(Long var5 : var3.IIIiiIIlIi) {
            this.iIiliiiIll.remove(var5);
         }

         if (this.ililiiiIll == root) {
            this.ililiiiIll = Long.MIN_VALUE;
         }

      }
   }

   private static Map<Long, Long> IilliliilIIi(Collection<Long> radius, int cells, boolean horizontal) {
      HashSet var3 = new HashSet(radius);
      HashMap var4 = new HashMap(Math.max(16, var3.size() * 2));
      ArrayDeque var5 = new ArrayDeque();
      ArrayList var6 = new ArrayList();

      for(Long var8 : radius) {
         if (var3.remove(var8)) {
            var6.clear();
            var5.add(var8);

            long var9;
            long var11;
            for(var9 = var8; !var5.isEmpty(); lIiiIiIlilli(var11, cells, horizontal, var3, var5)) {
               var11 = (Long)var5.poll();
               var6.add(var11);
               if (var11 < var9) {
                  var9 = var11;
               }
            }

            for(Long var12 : var6) {
               var4.put(var12, var9);
            }
         }
      }

      return var4;
   }

   private static void lIiiIiIlilli(long pending, int horizontal, boolean radius, HashSet<Long> c, ArrayDeque<Long> queue) {
      long var17 = -1856493546228130521L;
      long var19 = 7545297902837514525L;
      long var15 = 2560044564732574430L;
      var15 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(pending) << 32 ^ var15) & -1L << 32;
      var15 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(pending) ^ var15) & -1L >>> 32;
      var17 ^= ((long)llIiIiililIiIiil.Illlllllilll(pending) << 32 ^ var17) & -1L << 32;
      if (horizontal < 0) {
         int[][] var9 = lIiliiiIll;
         var17 ^= ((long)var9.length ^ var17) & -1L >>> 32;

         for(long var27 = var19 ^ (0L ^ var19) & -1L << 32; (int)(var27 >>> 32) < (int)var17; var27 += 4294967296L) {
            int[] var21 = var9[(int)(var27 >>> 32)];
            long var13 = llIiIiililIiIiil.IIIllIIliIIl((int)(var15 >>> 32) + var21[0], (int)var15 + var21[1], (int)(var17 >>> 32) + var21[2]);
            if (c.remove(var13)) {
               queue.add(var13);
            }
         }

      } else {
         for(long var26 = var19 ^ ((long)(-horizontal) ^ var19) & -1L >>> 32; (int)var26 <= horizontal; var26 ^= (var26 ^ var26 + (long)1) & -1L >>> 32) {
            for(var17 ^= ((long)(radius ? 0 : -horizontal) ^ var17) & -1L >>> 32; (int)var17 <= (radius ? 0 : horizontal); var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32) {
               for(var26 ^= ((long)(-horizontal) << 32 ^ var26) & -1L << 32; (int)(var26 >>> 32) <= horizontal; var26 += 4294967296L) {
                  if ((int)var26 != 0 || (int)var17 != 0 || (int)(var26 >>> 32) != 0) {
                     long var12 = llIiIiililIiIiil.IIIllIIliIIl((int)(var15 >>> 32) + (int)var26, (int)var15 + (int)var17, (int)(var17 >>> 32) + (int)(var26 >>> 32));
                     if (c.remove(var12)) {
                        queue.add(var12);
                     }
                  }
               }
            }
         }

      }
   }

   public int Iilllilliill(long root, long epoch) {
      liiiiiIiiiiiiiIi var5 = (liiiiiIiiiiiiiIi)this.IliliiiIll.get(root);
      return var5 != null && var5.iIIiiIIlIi == epoch ? var5.lIIiiIIlIi : 0;
   }

   // $FF: synthetic method
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) << 8 | (char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) >>> 8) + var5) - '衑') ^ var5) >>> 15 | (char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) << 8 | (char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) >>> 8) + var5) - '衑') ^ var5) << 1) ^ var5) << 8 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) << 8 | (char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) >>> 8) + var5) - '衑') ^ var5) >>> 15 | (char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) << 8 | (char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) >>> 8) + var5) - '衑') ^ var5) << 1) ^ var5) >>> 8) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) << 8 | (char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) >>> 8) + var5) - '衑') ^ var5) >>> 15 | (char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) << 8 | (char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) >>> 8) + var5) - '衑') ^ var5) << 1) ^ var5) << 8 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) << 8 | (char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) >>> 8) + var5) - '衑') ^ var5) >>> 15 | (char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) << 8 | (char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) >>> 8) + var5) - '衑') ^ var5) << 1) ^ var5) >>> 8) << 13) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) << 8 | (char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) >>> 8) + var5) - '衑') ^ var5) >>> 15 | (char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) << 8 | (char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) >>> 8) + var5) - '衑') ^ var5) << 1) ^ var5) << 8 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) << 8 | (char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) >>> 8) + var5) - '衑') ^ var5) >>> 15 | (char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) << 8 | (char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) >>> 8) + var5) - '衑') ^ var5) << 1) ^ var5) >>> 8) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) << 8 | (char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) >>> 8) + var5) - '衑') ^ var5) >>> 15 | (char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) << 8 | (char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) >>> 8) + var5) - '衑') ^ var5) << 1) ^ var5) << 8 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) << 8 | (char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) >>> 8) + var5) - '衑') ^ var5) >>> 15 | (char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) << 8 | (char)(~((char)((char)((char)(~((char)(-var4[var5]))) << 14 | (char)(~((char)(-var4[var5]))) >>> 2) - 23170))) >>> 8) + var5) - '衑') ^ var5) << 1) ^ var5) >>> 8) << 13) << 8) + 21920));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Iiilliiliiil(int attemptsLimit) {
      long var5 = 3174183494592143127L;
      var5 ^= (0L ^ var5) & -1L << 32;

      for(liiiiiIiiiiiiiIi var4 : this.IliliiiIll.values()) {
         if (var4.lIIiiIIlIi >= attemptsLimit) {
            var5 += 4294967296L;
         }
      }

      return (int)(var5 >>> 32);
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3302230154350810087L ^ Long.rotateLeft(-5739486018628221346L, 18) ^ 257508905254487023L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2218487465272523988L ^ Long.rotateLeft(2472522841237393202L, 48) ^ -5096534166314188041L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 4189647227243925916L ^ Long.rotateLeft(-6408254506323878121L, 47) ^ -2523530951577241685L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 5028281454529072266L ^ Long.rotateLeft(5680868561819276419L, 33) ^ 4973198869787904400L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6219038621361918963L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 8058582772892914326L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4851979684583768176L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7263848693810283708L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4196685979544703230L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1031029674550397491L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iliilliiilii<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iiiiliiiiiii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIIllIIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, iIIIlIlIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(llIIlilIIl<invokedynamic>());
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

   public int IlIillIiilIi() {
      return this.iIiliiiIll.size();
   }

   private void IIIllIIliIIl(long target, long prior) {
      liiiiiIiiiiiiiIi var5 = (liiiiiIiiiiiiiIi)this.IliliiiIll.get(prior);
      if (var5 != null) {
         var5.IIIiiIIlIi.remove(target);
         if (var5.IIIiiIIlIi.isEmpty()) {
            this.IliliiiIll.remove(prior);
         }

      }
   }

   public static Map<Long, Long> iIlIlllllill(Collection<Long> cells, int radius) {
      return IilliliilIIi(cells, Math.max(0, radius), true);
   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ '菉') - '\uef00') - 8314) ^ 13294) >>> 13 | (char)((char)((char)((char)(var4[var5] ^ '菉') - '\uef00') - 8314) ^ 13294) << 3) + var5))) ^ '菖') - var5) + 30036) + var5) - 2783) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '쉺') - var5) + '芬') >>> 3 | (char)((char)((char)(var4[var5] ^ '쉺') - var5) + '芬') << 13) + var5) ^ '\uf15a') - 8883))))) + '蝞') >>> 12 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '쉺') - var5) + '芬') >>> 3 | (char)((char)((char)(var4[var5] ^ '쉺') - var5) + '芬') << 13) + var5) ^ '\uf15a') - 8883))))) + '蝞') << 4))) ^ 24329) + '턙') << 9 | (char)((char)((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '쉺') - var5) + '芬') >>> 3 | (char)((char)((char)(var4[var5] ^ '쉺') - var5) + '芬') << 13) + var5) ^ '\uf15a') - 8883))))) + '蝞') >>> 12 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '쉺') - var5) + '芬') >>> 3 | (char)((char)((char)(var4[var5] ^ '쉺') - var5) + '芬') << 13) + var5) ^ '\uf15a') - 8883))))) + '蝞') << 4))) ^ 24329) + '턙') >>> 7) + '\uf735') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int iliIiiliiiii(long root, long epoch, long target) {
      liiiiiIiiiiiiiIi var7 = (liiiiiIiiiiiiiIi)this.IliliiiIll.remove(epoch);
      if (var7 == null) {
         var7 = new liiiiiIiiiiiiiIi();
      }

      this.IliliiiIll.put(epoch, var7);

      while(this.IliliiiIll.size() > 512) {
         this.IlIlllIlilIl();
      }

      if (var7.iIIiiIIlIi != target) {
         var7.iIIiiIIlIi = target;
         var7.lIIiiIIlIi = 0;
      }

      ++var7.lIIiiIIlIi;
      ++var7.IlIiiIIlIi;
      ++this.lliliiiIll;
      this.ililiiiIll = epoch;
      Long var8 = (Long)this.iIiliiiIll.get(root);
      if (var8 != null && var8 != epoch) {
         this.IIIllIIliIIl(root, var8);
      }

      if (var7.IIIiiIIlIi.size() < 4096 && var7.IIIiiIIlIi.add(root)) {
         this.iIiliiiIll.put(root, epoch);
      }

      return var7.lIIiiIIlIi;
   }

   public void Illillliilli() {
      this.IliliiiIll.clear();
      this.iIiliiiIll.clear();
      this.lliliiiIll = 0;
      this.ililiiiIll = Long.MIN_VALUE;
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) - '臚')) - var5) - '센') + '跿') + var5) ^ var5))) ^ var5))) << 5 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) - '臚')) - var5) - '센') + '跿') + var5) ^ var5))) ^ var5))) >>> 11) << 5 | (char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) - '臚')) - var5) - '센') + '跿') + var5) ^ var5))) ^ var5))) << 5 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) - '臚')) - var5) - '센') + '跿') + var5) ^ var5))) ^ var5))) >>> 11) >>> 11))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String Iilililiiili() {
      liiiiiIiiiiiiiIi var1 = (liiiiiIiiiiiiiIi)this.IliliiiIll.get(this.ililiiiIll);
      String var2 = var1 == null ? IIiilIiiiIii<invokedynamic>() : llIiIiililIiIiil.IlIlllIlilIl(this.ililiiiIll) + IIiilIiiiIii<invokedynamic>() + var1.IIIiiIIlIi.size() + IIiilIiiiIii<invokedynamic>() + var1.lIIiiIIlIi + IIiilIiiiIii<invokedynamic>() + var1.iIIiiIIlIi + IIiilIiiiIii<invokedynamic>() + var1.IlIiiIIlIi;
      return IIiilIiiiIii<invokedynamic>() + this.IliliiiIll.size() + IIiilIiiiIii<invokedynamic>() + this.iIiliiiIll.size() + IIiilIiiiIii<invokedynamic>() + this.lliliiiIll + IIiilIiiiIii<invokedynamic>() + var2;
   }

   private void IlIlllIlilIl() {
      Iterator var1 = this.IliliiiIll.entrySet().iterator();

      for(Long var3 : ((liiiiiIiiiiiiiIi)((Map.Entry)var1.next()).getValue()).IIIiiIIlIi) {
         this.iIiliiiIll.remove(var3);
      }

      var1.remove();
   }
}
