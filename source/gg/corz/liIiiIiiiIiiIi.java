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
import java.util.Locale;
import java.util.Map;
import java.util.function.LongPredicate;
import java.util.function.LongUnaryOperator;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class liIiiIiiiIiiIi {
   public static final int llIliIiiiilIliIiii = 1024;
   private int illliIiiiIilliIiii;
   private final int[] lIlliIiiiiIlliIiii = new int[ilIIlliIiIIlli.values().length];
   private final Map<ilIIlliIiIIlli, LinkedHashMap<Long, iIiIliIliIli>> IiIliIiiiliIliIiii = new LinkedHashMap();
   private final int[] IllliIiiilllliIiii = new int[ilIIlliIiIIlli.values().length];
   private int lilliIiiiiilliIiii;
   private final int[] iiIliIiiiIIlliIiii = new int[ilIIlliIiIIlli.values().length];

   public int IlIlllIlilIl(LongUnaryOperator stateOf) {
      long var7 = 1450792382632839211L;
      long var9 = -2891065429105834508L;
      var7 ^= (0L ^ var7) & -1L << 32;
      ilIIlliIiIIlli[] var3 = ilIIlliIiIIlli.values();
      var7 ^= ((long)var3.length ^ var7) & -1L >>> 32;

      for(long var13 = var9 ^ (0L ^ var9) & -1L << 32; (int)(var13 >>> 32) < (int)var7; var13 += 4294967296L) {
         ilIIlliIiIIlli var6 = var3[(int)(var13 >>> 32)];
         var7 ^= ((long)((int)(var7 >>> 32) + this.iliIiiliiiii(var6, stateOf)) << 32 ^ var7) & -1L << 32;
      }

      return (int)(var7 >>> 32);
   }

   // $FF: synthetic method
   private static CallSite iiIIlIIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(var4[var5] - 16818) ^ 16118) + '폷'))) ^ '횴'))) << 3 | (char)(-((char)((char)(~((char)((char)((char)(var4[var5] - 16818) ^ 16118) + '폷'))) ^ '횴'))) >>> 13) - var5) - var5) + var5) >>> 5 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(var4[var5] - 16818) ^ 16118) + '폷'))) ^ '횴'))) << 3 | (char)(-((char)((char)(~((char)((char)((char)(var4[var5] - 16818) ^ 16118) + '폷'))) ^ '횴'))) >>> 13) - var5) - var5) + var5) << 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IIIllIIliIIl(ilIIlliIiIIlli targetMatches, LongPredicate kind) {
      LinkedHashMap var3 = this.IliIlllilIi(targetMatches);
      ArrayList var4 = new ArrayList();

      for(Map.Entry var6 : var3.entrySet()) {
         if (kind.test(((iIiIliIliIli)var6.getValue()).IiIlliIliiIl())) {
            var4.add((Long)var6.getKey());
         }
      }

      for(long var9 : var4) {
         var3.remove(var9);
      }

      this.illliIiiiIilliIiii += var4.size();
      return var4.size();
   }

   private LinkedHashMap<Long, iIiIliIliIli> IliIlllilIi(ilIIlliIiIIlli k) {
      return (LinkedHashMap)this.IiIliIiiiliIliIiii.computeIfAbsent(k, (x) -> new LinkedHashMap());
   }

   public int lIiiIiIlilli(ilIIlliIiIIlli kind) {
      long var3 = 6677360837181234223L;
      var3 ^= ((long)this.IliIlllilIi(kind).size() << 32 ^ var3) & -1L << 32;
      this.IliIlllilIi(kind).clear();
      this.illliIiiiIilliIiii += (int)(var3 >>> 32);
      return (int)(var3 >>> 32);
   }

   public List<Long> IIlllIlliIll(ilIIlliIiIIlli k) {
      return new ArrayList(this.IliIlllilIi(k).keySet());
   }

   // $FF: synthetic method
   private static CallSite lIlIliIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) << 12 | (char)((char)(var4[var5] ^ var5) + var5) >>> 4) ^ var5) ^ 15143) >>> 5 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) << 12 | (char)((char)(var4[var5] ^ var5) + var5) >>> 4) ^ var5) ^ 15143) << 11)) << 12 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) << 12 | (char)((char)(var4[var5] ^ var5) + var5) >>> 4) ^ var5) ^ 15143) >>> 5 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) << 12 | (char)((char)(var4[var5] ^ var5) + var5) >>> 4) ^ var5) ^ 15143) << 11)) >>> 4) - 3122) ^ var5) ^ var5) ^ 5455) - var5) + var5) ^ '뀮') ^ var5) + 16800))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IilliliilIIi(ilIIlliIiIIlli kind, long stateOf, LongUnaryOperator semanticKey, iiiIlIllIIIllIll use) {
      return this.iIlIlllllill(kind, stateOf, semanticKey, use) != null;
   }

   private static String Iliilliiilii(ilIIlliIiIIlli k) {
      String var10000;
      switch (k) {
         case llIillIIIl -> var10000 = IIIIllIIIl<invokedynamic>();
         case ilIillIIIl -> var10000 = IIIIllIIIl<invokedynamic>();
         case IiIillIIIl -> var10000 = IIIIllIIIl<invokedynamic>();
         case liIillIIIl -> var10000 = IIIIllIIIl<invokedynamic>();
         case iiIillIIIl -> var10000 = IIIIllIIIl<invokedynamic>();
         case IIlillIIIl -> var10000 = IIIIllIIIl<invokedynamic>();
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   public String IIiilIiiiIii() {
      long var6 = -4877353859616963910L;
      StringBuilder var1 = new StringBuilder();
      ilIIlliIiIIlli[] var2 = ilIIlliIiIIlli.values();
      var6 ^= ((long)var2.length << 32 ^ var6) & -1L << 32;

      for(long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
         ilIIlliIiIIlli var5 = var2[(int)var9];
         if (this.iiIliIiiiIIlliIiii[var5.ordinal()] != 0 || this.lIlliIiiiiIlliIiii[var5.ordinal()] != 0 || this.IllliIiiilllliIiii[var5.ordinal()] != 0) {
            if (var1.length() > 0) {
               var1.append(' ');
            }

            var1.append(String.format(Locale.ROOT, IIIIllIIIl<invokedynamic>(), Iliilliiilii(var5), this.iiIliIiiiIIlliIiii[var5.ordinal()], this.lIlliIiiiiIlliIiii[var5.ordinal()], this.IllliIiiilllliIiii[var5.ordinal()], this.IiIlliIliiIl(var5)));
         }
      }

      return String.format(Locale.ROOT, IIIIllIIIl<invokedynamic>(), this.IlIillIiilIi(), this.Iiilliiliiil(), this.IIIilIIiiIIi(), this.Illillliilli(), this.illliIiiiIilliIiii, this.lilliIiiiiilliIiii, var1);
   }

   public int IIillIiliIil(ilIIlliIiIIlli k) {
      return this.IllliIiiilllliIiii[k.ordinal()];
   }

   public void Iilililiiili() {
      this.IiIliIiiiliIliIiii.clear();
      Arrays.fill(this.iiIliIiiiIIlliIiii, 0);
      Arrays.fill(this.lIlliIiiiiIlliIiii, 0);
      Arrays.fill(this.IllliIiiilllliIiii, 0);
      this.illliIiiiIilliIiii = this.lilliIiiiiilliIiii = 0;
   }

   public int IiIlliIliiIl(ilIIlliIiIIlli k) {
      return this.IliIlllilIi(k).size();
   }

   // $FF: synthetic method
   private static CallSite IiIIlliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 'ꬹ') - var5) ^ var5) - '댭') + var5) + var5) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 'ꬹ') - var5) ^ var5) - '댭') + var5) + var5) >>> 5) - var5) + var5))) + 29128));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Iilllilliill(ilIIlliIiIIlli k) {
      return this.lIlliIiiiiIlliIiii[k.ordinal()];
   }

   public void Ililllililil(ilIIlliIiIIlli kind, int n) {
      if (n > 0) {
         int[] var10000 = this.lIlliIiiiiIlliIiii;
         int var10001 = kind.ordinal();
         var10000[var10001] += n;
      }

   }

   public int IIlilIliiIli() {
      return this.lilliIiiiiilliIiii;
   }

   public iIiIliIliIli iIlIlllllill(ilIIlliIiIIlli use, long semanticKey, LongUnaryOperator kind, iiiIlIllIIIllIll stateOf) {
      iIiIliIliIli var6 = (iIiIliIliIli)this.IliIlllilIi(use).get(semanticKey);
      if (var6 != null && var6.iIlIlllllill(kind)) {
         if (stateOf == iiiIlIllIIIllIll.iliIiillll) {
            int var10002 = this.lIlliIiiiiIlliIiii[use.ordinal()]++;
         } else {
            int var7 = this.IllliIiiilllliIiii[use.ordinal()]++;
         }

         return var6;
      } else {
         return null;
      }
   }

   public double Illillliilli() {
      long var2 = 275672249383852397L;
      var2 ^= ((long)(this.Iiilliiliiil() + this.IIIilIIiiIIi()) << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) == 0 ? (double)-1.0F : (double)this.Iiilliiliiil() / (double)((int)(var2 >>> 32));
   }

   // $FF: synthetic method
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 21065) ^ var5) - var5) + var5) - var5) << 6 | (char)((char)((char)((char)((char)(var4[var5] ^ 21065) ^ var5) - var5) + var5) - var5) >>> 10))))) + '첲'))) + var5) ^ var5) ^ 26552) >>> 10 | (char)((char)((char)((char)(~((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 21065) ^ var5) - var5) + var5) - var5) << 6 | (char)((char)((char)((char)((char)(var4[var5] ^ 21065) ^ var5) - var5) + var5) - var5) >>> 10))))) + '첲'))) + var5) ^ var5) ^ 26552) << 6))) - 27658));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Illlllllilll(ilIIlliIiIIlli k) {
      return this.iiIliIiiiIIlliIiii[k.ordinal()];
   }

   public int IlIillIiilIi() {
      long var6 = -4614125313992147197L;
      long var8 = 5011297098661072479L;
      var6 ^= (0L ^ var6) & -1L << 32;
      int[] var2 = this.iiIliIiiiIIlliIiii;
      var6 ^= ((long)var2.length ^ var6) & -1L >>> 32;

      for(var8 ^= (0L ^ var8) & -1L << 32; (int)(var8 >>> 32) < (int)var6; var8 += 4294967296L) {
         var8 ^= ((long)var2[(int)(var8 >>> 32)] ^ var8) & -1L >>> 32;
         var6 ^= ((long)((int)(var6 >>> 32) + (int)var8) << 32 ^ var6) & -1L << 32;
      }

      return (int)(var6 >>> 32);
   }

   public int IiIiliIiiiIi() {
      return this.illliIiiiIilliIiii;
   }

   public int iliIiiliiiii(ilIIlliIiIIlli kind, LongUnaryOperator stateOf) {
      LinkedHashMap var3 = this.IliIlllilIi(kind);
      ArrayList var4 = new ArrayList();

      for(Map.Entry var6 : var3.entrySet()) {
         if (!((iIiIliIliIli)var6.getValue()).iIlIlllllill(stateOf)) {
            var4.add((Long)var6.getKey());
         }
      }

      for(long var9 : var4) {
         var3.remove(var9);
      }

      this.illliIiiiIilliIiii += var4.size();
      return var4.size();
   }

   public boolean liiiIIllIl(iIiIliIliIli c) {
      if (c == null) {
         return false;
      } else {
         LinkedHashMap var2 = this.IliIlllilIi(c.IIIllIIliIIl());
         iIiIliIliIli var3 = (iIiIliIliIli)var2.get(c.IlIlllIlilIl());
         if (var3 != null && var3.Ililllililil() == c.Ililllililil()) {
            ++this.lilliIiiiiilliIiii;
            return false;
         } else {
            if (var3 == null && var2.size() >= 1024) {
               Iterator var4 = var2.keySet().iterator();
               var4.next();
               var4.remove();
            }

            var2.put(c.IlIlllIlilIl(), c);
            int var10002 = this.iiIliIiiiIIlliIiii[c.IIIllIIliIIl().ordinal()]++;
            return true;
         }
      }
   }

   public int Iiilliiliiil() {
      long var6 = 1297388078786870891L;
      long var8 = -4871898859223803291L;
      var6 ^= (0L ^ var6) & -1L << 32;
      int[] var2 = this.lIlliIiiiiIlliIiii;
      var6 ^= ((long)var2.length ^ var6) & -1L >>> 32;

      for(var8 ^= (0L ^ var8) & -1L << 32; (int)(var8 >>> 32) < (int)var6; var8 += 4294967296L) {
         var8 ^= ((long)var2[(int)(var8 >>> 32)] ^ var8) & -1L >>> 32;
         var6 ^= ((long)((int)(var6 >>> 32) + (int)var8) << 32 ^ var6) & -1L << 32;
      }

      return (int)(var6 >>> 32);
   }

   public int IIIilIIiiIIi() {
      long var6 = 6443235697313898991L;
      long var8 = -8341745835659437755L;
      var6 ^= (0L ^ var6) & -1L << 32;
      int[] var2 = this.IllliIiiilllliIiii;
      var6 ^= ((long)var2.length ^ var6) & -1L >>> 32;

      for(var8 ^= (0L ^ var8) & -1L << 32; (int)(var8 >>> 32) < (int)var6; var8 += 4294967296L) {
         var8 ^= ((long)var2[(int)(var8 >>> 32)] ^ var8) & -1L >>> 32;
         var6 ^= ((long)((int)(var6 >>> 32) + (int)var8) << 32 ^ var6) & -1L << 32;
      }

      return (int)(var6 >>> 32);
   }

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(~((char)((char)(~var4[var5]) >>> 8 | (char)(~var4[var5]) << 8))) + 'ﺉ'))))) ^ var5) ^ var5) - 185) ^ var5))) >>> 15 | (char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(~((char)((char)(~var4[var5]) >>> 8 | (char)(~var4[var5]) << 8))) + 'ﺉ'))))) ^ var5) ^ var5) - 185) ^ var5))) << 1) << 15 | (char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(~((char)((char)(~var4[var5]) >>> 8 | (char)(~var4[var5]) << 8))) + 'ﺉ'))))) ^ var5) ^ var5) - 185) ^ var5))) >>> 15 | (char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(~((char)((char)(~var4[var5]) >>> 8 | (char)(~var4[var5]) << 8))) + 'ﺉ'))))) ^ var5) ^ var5) - 185) ^ var5))) << 1) >>> 1) - var5) ^ '\ue9f1'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2714476808294496350L ^ Long.rotateLeft(7179274887546136853L, 59) ^ 6273187146046730252L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8363441145100504928L ^ Long.rotateLeft(2860467327820567371L, 18) ^ -7877942562011806787L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -1395438408141465521L ^ Long.rotateLeft(-1943064833311097206L, 18) ^ -5198540494066320441L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3194070964272420270L ^ Long.rotateLeft(398748607474121923L, 62) ^ 7200108198498999909L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7942866481956448044L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 6347229134430640367L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 3125929187212711072L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5182861291598472267L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 9090993003041189786L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -2541680007464683719L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iIIIlIlIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, llIIlilIIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IiIIlliIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, iiIIlIIlIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(lIlIliIlIl<invokedynamic>());
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
}
