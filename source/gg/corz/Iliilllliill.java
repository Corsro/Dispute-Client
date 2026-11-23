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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Iliilllliill {
   public static final int lliiIIliiliiIIli = 1;
   private final Map<Long, List<liiIllIiiiiIllIi>> ilIIlIliIiIIlIli = new LinkedHashMap();
   private int liIIlIliiiIIlIli;
   public static final int IiiiIIliliiiIIli = 2;
   private int iIlIlIliIllIlIli;
   public static final int iIiiIIliIliiIIli = 0;
   private int IIlIlIlilIlIlIli;
   public static final int IlIIlIlillIIlIli = 2048;
   private int lllIlIliillIlIli;
   public static final int iiiiIIliIIIIlIli = -1;
   private static final String lIIIlIliiIIIlIli = "executor proof invalid at arrival";

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) >>> 12 | (char)(var4[var5] + var5) << 4) - var5))) ^ var5) - var5) + '\uecbd') + 14477) << 2 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) >>> 12 | (char)(var4[var5] + var5) << 4) - var5))) ^ var5) - var5) + '\uecbd') + 14477) >>> 14) ^ var5) - 9492))))) << 3 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) >>> 12 | (char)(var4[var5] + var5) << 4) - var5))) ^ var5) - var5) + '\uecbd') + 14477) << 2 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) >>> 12 | (char)(var4[var5] + var5) << 4) - var5))) ^ var5) - var5) + '\uecbd') + 14477) >>> 14) ^ var5) - 9492))))) >>> 13)))) - '\ue0d5'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2959882051138279933L ^ Long.rotateLeft(-864749597165475546L, 27) ^ -6794191367774604383L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 906835658158934612L ^ Long.rotateLeft(-7367959285736366697L, 53) ^ 2580604458678701653L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 2521455612520003517L ^ Long.rotateLeft(7176980451562672978L, 51) ^ 3811076279759815976L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 4364339159582779222L ^ Long.rotateLeft(8217304478888210628L, 34) ^ -6087909473976646888L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1392455486282364375L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1179825937043193140L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -2967195868250978600L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 8243242599730004039L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 7976427223651413154L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -7385481689001846167L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IIlilIliiIli<invokedynamic>());
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

   public static boolean IIIllIIliIIl(long a, long b) {
      return llIiIiililIiIiil.IIlllIlliIll(a) == llIiIiililIiIiil.IIlllIlliIll(b) && Math.abs(llIiIiililIiIiil.IiIlliIliiIl(a) - llIiIiililIiIiil.IiIlliIliiIl(b)) <= 1 && Math.abs(llIiIiililIiIiil.Illlllllilll(a) - llIiIiililIiIiil.Illlllllilll(b)) <= 1;
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ '輝') - var5))) - 17762))) - 8499) ^ var5) >>> 7 | (char)((char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ '輝') - var5))) - 17762))) - 8499) ^ var5) << 9))) + 18184) + var5) << 8 | (char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ '輝') - var5))) - 17762))) - 8499) ^ var5) >>> 7 | (char)((char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ '輝') - var5))) - 17762))) - 8499) ^ var5) << 9))) + 18184) + var5) >>> 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static boolean iliIiiliiiii(int queried, int recorded) {
      return queried == -1 || queried == recorded;
   }

   public void IIillIiliIil() {
      this.ilIIlIliIiIIlIli.clear();
      this.liIIlIliiiIIlIli = 0;
      this.IIlIlIlilIlIlIli = 0;
      this.iIlIlIliIllIlIli = 0;
      this.lllIlIliillIlIli = 0;
   }

   public int iIlIlllllill(long target, long dependencyFingerprint) {
      long var8 = -4311679774898853645L;
      List var5 = (List)this.ilIIlIliIiIIlIli.get(target);
      if (var5 == null) {
         return 0;
      } else {
         var8 ^= (0L ^ var8) & -1L << 32;
         Iterator var7 = var5.iterator();

         while(var7.hasNext()) {
            if (((liiIllIiiiiIllIi)var7.next()).iliIiiliiiii() != dependencyFingerprint) {
               var7.remove();
               var8 += 4294967296L;
            }
         }

         if (var5.isEmpty()) {
            this.ilIIlIliIiIIlIli.remove(target);
         }

         this.liIIlIliiiIIlIli -= (int)(var8 >>> 32);
         this.lllIlIliillIlIli += (int)(var8 >>> 32);
         return (int)(var8 >>> 32);
      }
   }

   public int IIlllIlliIll() {
      return this.iIlIlIliIllIlIli;
   }

   public void IilliliilIIi(long target) {
      List var3 = (List)this.ilIIlIliIiIIlIli.remove(target);
      if (var3 != null) {
         this.liIIlIliiiIIlIli -= var3.size();
      }

   }

   public int IlIlllIlilIl() {
      return this.liIIlIliiiIIlIli;
   }

   public String liiiIIllIl(long target, long stand, int supportFace, int poseClass, long dependencyFingerprint) {
      List var9 = (List)this.ilIIlIliIiIIlIli.get(target);
      if (var9 == null) {
         return null;
      } else {
         for(liiIllIiiiiIllIi var11 : var9) {
            if (var11.iliIiiliiiii() == dependencyFingerprint && IIIllIIliIIl(var11.liiiIIllIl(), stand) && lIiiIiIlilli(var11.iIlIlllllill(), supportFace) && iliIiiliiiii(var11.IilliliilIIi(), poseClass)) {
               ++this.iIlIlIliIllIlIli;
               return var11.lIiiIiIlilli();
            }
         }

         return null;
      }
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)(-((char)(~((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + '꼱') + var5) - var5) + '렌') << 1 | (char)((char)((char)((char)(var4[var5] + '꼱') + var5) - var5) + '렌') >>> 15) ^ var5))) ^ '쪴') - var5) - var5))))) << 8 | (char)(~((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + '꼱') + var5) - var5) + '렌') << 1 | (char)((char)((char)((char)(var4[var5] + '꼱') + var5) - var5) + '렌') >>> 15) ^ var5))) ^ '쪴') - var5) - var5))))) >>> 8))))) - var5) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IliIlllilIi(long stand, long target, int tick, int poseClass, String dependencyFingerprint, long supportFace, int reason) {
      long var16 = 3354346049927563364L;
      String var11 = dependencyFingerprint != null && !dependencyFingerprint.isBlank() ? dependencyFingerprint : Iiilliiliiil<invokedynamic>();
      liiIllIiiiiIllIi var12 = new liiIllIiiiiIllIi(stand, target, tick, poseClass, var11, supportFace, reason);
      if (this.ilIIlIliIiIIlIli.size() >= 2048 && !this.ilIIlIliIiIIlIli.containsKey(stand)) {
         Iterator var13 = this.ilIIlIliIiIIlIli.keySet().iterator();
         var13.next();
         var13.remove();
      }

      List var18 = (List)this.ilIIlIliIiIIlIli.computeIfAbsent(stand, (k) -> new ArrayList());

      for(long var19 = var16 ^ (0L ^ var16) & -1L << 32; (int)(var19 >>> 32) < var18.size(); var19 += 4294967296L) {
         liiIllIiiiiIllIi var15 = (liiIllIiiiiIllIi)var18.get((int)(var19 >>> 32));
         if (var15.liiiIIllIl() == target && var15.iIlIlllllill() == tick && var15.IilliliilIIi() == poseClass) {
            var18.set((int)(var19 >>> 32), var12);
            return false;
         }
      }

      var18.add(var12);
      ++this.liIIlIliiiIIlIli;
      ++this.IIlIlIlilIlIlIli;
      return true;
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(-((char)((char)(~((char)(var4[var5] + 28817))) ^ '免'))) >>> 10 | (char)(-((char)((char)(~((char)(var4[var5] + 28817))) ^ '免'))) << 6))))) ^ var5) - 29558) >>> 1 | (char)((char)((char)(~((char)(~((char)((char)(-((char)((char)(~((char)(var4[var5] + 28817))) ^ '免'))) >>> 10 | (char)(-((char)((char)(~((char)(var4[var5] + 28817))) ^ '免'))) << 6))))) ^ var5) - 29558) << 15) + 27486) - var5) ^ var5) + var5))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)(var4[var5] - '\ufe75'))) + var5) ^ var5) + var5))) - 32601) - var5) - var5) + '뺭') << 5 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)(var4[var5] - '\ufe75'))) + var5) ^ var5) + var5))) - 32601) - var5) - var5) + '뺭') >>> 11) << 15 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)(var4[var5] - '\ufe75'))) + var5) ^ var5) + var5))) - 32601) - var5) - var5) + '뺭') << 5 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)(var4[var5] - '\ufe75'))) + var5) ^ var5) + var5))) - 32601) - var5) - var5) + '뺭') >>> 11) >>> 1))) >>> 10 | (char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)(var4[var5] - '\ufe75'))) + var5) ^ var5) + var5))) - 32601) - var5) - var5) + '뺭') << 5 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)(var4[var5] - '\ufe75'))) + var5) ^ var5) + var5))) - 32601) - var5) - var5) + '뺭') >>> 11) << 15 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)(var4[var5] - '\ufe75'))) + var5) ^ var5) + var5))) - 32601) - var5) - var5) + '뺭') << 5 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)(var4[var5] - '\ufe75'))) + var5) ^ var5) + var5))) - 32601) - var5) - var5) + '뺭') >>> 11) >>> 1))) << 6) - '蕥') ^ 13858) - var5) - 11060) + 6463));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String Iilllilliill() {
      return Iiilliiliiil<invokedynamic>() + this.IIlIlIlilIlIlIli + Iiilliiliiil<invokedynamic>() + this.iIlIlIliIllIlIli + Iiilliiliiil<invokedynamic>() + this.liIIlIliiiIIlIli + Iiilliiliiil<invokedynamic>() + this.lllIlIliillIlIli;
   }

   public int IiIlliIliiIl() {
      return this.IIlIlIlilIlIlIli;
   }

   private static boolean lIiiIiIlilli(int recorded, int queried) {
      return recorded == 0 || queried == 0 || recorded == queried;
   }

   public int Illlllllilll() {
      return this.lllIlIliillIlIli;
   }
}
