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
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class iiIIIIliIIlIIIli {
   private int IiiiiIIlIi;
   private int lliiiIIlIi;
   private lliIllililiIllil lIIIIlIlIi;
   private final EnumMap<lliIllililiIllil, Integer> iIiiiIIlIi = new EnumMap(lliIllililiIllil.class);
   private int liiiiIIlIi;
   public static final int IiliiIIlIi = 8;
   private final HashMap<Integer, Illlllllllllllll> IIiiiIIlIi = new HashMap();
   public static final int liliiIIlIi = 4096;
   private int iliiiIIlIi;
   private final LinkedHashMap<Integer, LinkedHashMap<Long, IiIiiiIlliIiiiIl>> iiliiIIlIi = new LinkedHashMap();
   private int IIIIIlIlIi;
   private int IliiiIIlIi;
   private int iiiiiIIlIi;
   private final HashSet<Integer> lIiiiIIlIi = new HashSet();

   private void IiIlliIliiIl(int deckY, long why, lliIllililiIllil top) {
      Map var5 = (Map)this.iiliiIIlIi.get(deckY);
      if (var5 != null) {
         var5.remove(why);
      }

      this.IIlllIlliIll(top);
   }

   public int Iilililiiili() {
      return this.lliiiIIlIi;
   }

   public lliIllililiIllil Illlllllilll() {
      return this.lIIIIlIlIi;
   }

   // $FF: synthetic method
   private static CallSite lilIliilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~var4[var5])) + '陑') - 'ꯑ') >>> 9 | (char)((char)((char)((char)(~var4[var5])) + '陑') - 'ꯑ') << 7) - var5))) << 14 | (char)(-((char)((char)((char)((char)((char)((char)(~var4[var5])) + '陑') - 'ꯑ') >>> 9 | (char)((char)((char)((char)(~var4[var5])) + '陑') - 'ꯑ') << 7) - var5))) >>> 2) - 'ꁺ'))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void Iiilliiliiil(int cap, Illlllllllllllll deckY) {
      this.IIiiiIIlIi.put(cap, deckY);
      ++this.iiiiiIIlIi;
   }

   public int llIIlilIIl(int deckY) {
      Map var2 = (Map)this.iiliiIIlIi.get(deckY);
      return var2 == null ? 0 : var2.size();
   }

   public void IIlilIliiIli(int deckY) {
      this.iiliiIIlIi.remove(deckY);
      this.IIiiiIIlIi.remove(deckY);
      this.lIiiiIIlIi.remove(deckY);
   }

   public void Ililllililil(int deckY) {
      if (this.lIiiiIIlIi.remove(deckY)) {
         this.IIlllIlliIll(lliIllililiIllil.IIlIiliIil);
      }

   }

   public int IiIIlliIIl() {
      long var4 = 2431821551018355446L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for(Map var3 : this.iiliiIIlIi.values()) {
         var4 ^= ((long)((int)(var4 >>> 32) + var3.size()) << 32 ^ var4) & -1L << 32;
      }

      return (int)(var4 >>> 32);
   }

   public String IllIllllIl() {
      return String.format(Locale.ROOT, illIlIilIl<invokedynamic>(), this.IliiiIIlIi, this.IiiiiIIlIi, this.lliiiIIlIi, this.iliiiIIlIi, this.IiIIlliIIl(), this.liiiiIIlIi, this.iiiiiIIlIi, this.IIIIllIIIl(lliIllililiIllil.IlIIiliIil), this.lIlIliIlIl());
   }

   public IiIiiiIlliIiiiIl IilliliilIIi(int deckY, long top) {
      Map var4 = (Map)this.iiliiIIlIi.get(deckY);
      return var4 == null ? null : (IiIiiiIlliIiiiIl)var4.get(top);
   }

   // $FF: synthetic method
   private static CallSite IiiIlliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '천')) - var5) << 13 | (char)((char)((char)((char)(~var4[var5]) + '천')) - var5) >>> 3) + var5) >>> 1 | (char)((char)((char)((char)((char)((char)(~var4[var5]) + '천')) - var5) << 13 | (char)((char)((char)((char)(~var4[var5]) + '천')) - var5) >>> 3) + var5) << 15) ^ 23749) + var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Illillliilli() {
      return this.IliiiIIlIi;
   }

   public int Iiiiliiiiiii() {
      return this.liiiiIIlIi;
   }

   public IiIiiiIlliIiiiIl lIiiIiIlilli(int deckY, long ctx, iIIiIlllIlIiIlll top) {
      IiIiiiIlliIiiiIl var5 = this.IilliliilIIi(deckY, ctx);
      if (var5 == null) {
         return null;
      } else {
         lliIllililiIllil var6 = this.IlIlllIlilIl(deckY, ctx, var5, top, true);
         if (var6 == null) {
            ++this.lliiiIIlIi;
            return this.IilliliilIIi(deckY, ctx);
         } else {
            this.IiIlliIliiIl(deckY, ctx, var6);
            return null;
         }
      }
   }

   public int IIiilIiiiIii() {
      return this.iliiiIIlIi;
   }

   public int Iliilliiilii() {
      return this.IiiiiIIlIi;
   }

   // $FF: synthetic method
   private static CallSite lliIliliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) << 12 | (char)((char)(var4[var5] ^ var5) + var5) >>> 4) ^ 27745) - var5) << 2 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) << 12 | (char)((char)(var4[var5] ^ var5) + var5) >>> 4) ^ 27745) - var5) >>> 14) << 10 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) << 12 | (char)((char)(var4[var5] ^ var5) + var5) >>> 4) ^ 27745) - var5) << 2 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) << 12 | (char)((char)(var4[var5] ^ var5) + var5) >>> 4) ^ 27745) - var5) >>> 14) >>> 6))) ^ 'ꢀ') + '荘'))) ^ 21172) ^ 6421));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iIlIlllllill(int top, long originFeet, iIiIiIilIliIiIil base, long validUntil, long deckY, IiIlIiiliIlIii why, int column, int tick) {
      LinkedHashMap var12 = (LinkedHashMap)this.iiliiIIlIi.get(top);
      if (var12 == null) {
         var12 = new LinkedHashMap();
         this.iiliiIIlIi.put(top, var12);

         while(this.iiliiIIlIi.size() > 8) {
            Iterator var13 = this.iiliiIIlIi.keySet().iterator();
            var13.next();
            var13.remove();
         }
      }

      if (var12.put(originFeet, new IiIiiiIlliIiiiIl(base, validUntil, deckY, why == null ? IiIlIiiliIlIii.IiIIiilIIl : why, column, Math.max(0, tick))) == null) {
         ++this.IliiiIIlIi;
      }

      while(var12.size() > 4096) {
         Iterator var14 = var12.keySet().iterator();
         var14.next();
         var14.remove();
      }

   }

   public int IIIIllIIIl(lliIllililiIllil why) {
      return (Integer)this.iIiiiIIlIi.getOrDefault(why, 0);
   }

   public void IIlllIlliIll(lliIllililiIllil why) {
      this.iIiiiIIlIi.merge(why, 1, Integer::sum);
      this.lIIIIlIlIi = why;
   }

   public void IiIiliIiiiIi() {
      ++this.IiiiiIIlIi;
   }

   // $FF: synthetic method
   private static CallSite IIiIllIiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) ^ 26385) - var5)))) >>> 10 | (char)(~((char)((char)((char)((char)(~var4[var5]) ^ 26385) - var5)))) << 6) ^ '邆') ^ 21505) - 26221) - var5) - var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public Illlllllllllllll IIIilIIiiIIi(int deckY) {
      return (Illlllllllllllll)this.IIiiiIIlIi.get(deckY);
   }

   private boolean IIIllIIliIIl(IiIiiiIlliIiiiIl p, iIIiIlllIlIiIlll ctx) {
      long var5 = -5876748120135134141L;
      if (p.IliIlllilIi() == iIiIiIilIliIiIil.IliiillIil) {
         return false;
      } else {
         IiIlIiiliIlIii var3 = p.IilliliilIIi();

         for(long var7 = var5 ^ (0L ^ var5) & -1L << 32; (int)(var7 >>> 32) < var3.iliIiiliiiii().length; var7 += 4294967296L) {
            if (ctx.iliIiiliiiii().contentHash(var3.iliIiiliiiii()[(int)(var7 >>> 32)]) != var3.IIIllIIliIIl()[(int)(var7 >>> 32)]) {
               return true;
            }
         }

         return false;
      }
   }

   public void Iilllilliill(int deckY) {
      this.lIiiiIIlIi.add(deckY);
      ++this.liiiiIIlIi;
   }

   public boolean IIillIiliIil(int deckY) {
      return this.lIiiiIIlIi.contains(deckY);
   }

   public void IlIillIiilIi(int now, Illlllllllllllll deckY) {
      Illlllllllllllll var3 = (Illlllllllllllll)this.IIiiiIIlIi.remove(now);
      if (var3 != null) {
         this.IIlllIlliIll(var3.iIlIlllllill() != deckY.iIlIlllllill() ? lliIllililiIllil.IiIIiliIil : lliIllililiIllil.liIIiliIil);
      }
   }

   private lliIllililiIllil IlIlllIlilIl(int deckY, long ctx, IiIiiiIlliIiiiIl p, iIIiIlllIlIiIlll mayRecompute, boolean top) {
      long var10 = 1197950872529213214L;
      switch (p.IliIlllilIi().ordinal()) {
         case 0:
            return null;
         case 1:
         case 2:
         case 3:
         default:
            break;
         case 4:
            if (mayRecompute.IliIlllilIi().test(p.liiiIIllIl())) {
               return lliIllililiIllil.IlIIiliIil;
            }
            break;
         case 5:
         case 6:
            if (mayRecompute.liiiIIllIl()) {
               if (!mayRecompute.IliIlllilIi().test(p.iIlIlllllill())) {
                  return lliIllililiIllil.iiIIiliIil;
               }
            } else if (Math.abs(llIiIiililIiIiil.IIlllIlliIll(p.iIlIlllllill()) - mayRecompute.iIlIlllllill()) >= 2) {
               return lliIllililiIllil.iiIIiliIil;
            }
      }

      if (p.iliIiiliiiii() > 0 && mayRecompute.IilliliilIIi() >= p.iliIiiliiiii()) {
         return lliIllililiIllil.ilIIiliIil;
      } else if (!this.IIIllIIliIIl(p, mayRecompute)) {
         return null;
      } else if (!top) {
         return lliIllililiIllil.lIlIiliIil;
      } else {
         IiIlIiiliIlIii var7 = mayRecompute.lIiiIiIlilli().read(ctx, p.liiiIIllIl());
         ++this.iliiiIIlIi;
         if (var7 == null) {
            return lliIllililiIllil.lIlIiliIil;
         } else if (var7.IilliliilIIi() != p.IilliliilIIi().IilliliilIIi()) {
            return lliIllililiIllil.llIIiliIil;
         } else if (var7.lIiiIiIlilli() != p.IilliliilIIi().lIiiIiIlilli()) {
            return lliIllililiIllil.ilIIiliIil;
         } else {
            long[] var8 = new long[p.IilliliilIIi().iliIiiliiiii().length];

            for(long var12 = var10 ^ (0L ^ var10) & -1L << 32; (int)(var12 >>> 32) < var8.length; var12 += 4294967296L) {
               var8[(int)(var12 >>> 32)] = mayRecompute.iliIiiliiiii().contentHash(p.IilliliilIIi().iliIiiliiiii()[(int)(var12 >>> 32)]);
            }

            ((LinkedHashMap)this.iiliiIIlIi.get(deckY)).put(ctx, new IiIiiiIlliIiiiIl(p.IliIlllilIi(), p.liiiIIllIl(), p.iIlIlllllill(), p.IilliliilIIi().IliIlllilIi(var8), p.lIiiIiIlilli(), p.iliIiiliiiii()));
            return null;
         }
      }
   }

   public void liiiIIllIl(int tick, long top, iIiIiIilIliIiIil deckY, long column, long originFeet, IiIlIiiliIlIii base, int why) {
      this.iIlIlllllill(tick, top, deckY, column, originFeet, base, why, 0);
   }

   // $FF: synthetic method
   private static CallSite iIiIlIliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 31722) + var5) + var5) << 9 | (char)((char)((char)(var4[var5] + 31722) + var5) + var5) >>> 7) + var5) - '錉') << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] + 31722) + var5) + var5) << 9 | (char)((char)((char)(var4[var5] + 31722) + var5) + var5) >>> 7) + var5) - '錉') >>> 1) - var5) ^ var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 31722) + var5) + var5) << 9 | (char)((char)((char)(var4[var5] + 31722) + var5) + var5) >>> 7) + var5) - '錉') << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] + 31722) + var5) + var5) << 9 | (char)((char)((char)(var4[var5] + 31722) + var5) + var5) >>> 7) + var5) - '錉') >>> 1) - var5) ^ var5) << 13) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 31722) + var5) + var5) << 9 | (char)((char)((char)(var4[var5] + 31722) + var5) + var5) >>> 7) + var5) - '錉') << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] + 31722) + var5) + var5) << 9 | (char)((char)((char)(var4[var5] + 31722) + var5) + var5) >>> 7) + var5) - '錉') >>> 1) - var5) ^ var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 31722) + var5) + var5) << 9 | (char)((char)((char)(var4[var5] + 31722) + var5) + var5) >>> 7) + var5) - '錉') << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] + 31722) + var5) + var5) << 9 | (char)((char)((char)(var4[var5] + 31722) + var5) + var5) >>> 7) + var5) - '錉') >>> 1) - var5) ^ var5) << 13) >>> 13) ^ var5) - 'Ｔ') + var5))) >>> 8 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 31722) + var5) + var5) << 9 | (char)((char)((char)(var4[var5] + 31722) + var5) + var5) >>> 7) + var5) - '錉') << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] + 31722) + var5) + var5) << 9 | (char)((char)((char)(var4[var5] + 31722) + var5) + var5) >>> 7) + var5) - '錉') >>> 1) - var5) ^ var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 31722) + var5) + var5) << 9 | (char)((char)((char)(var4[var5] + 31722) + var5) + var5) >>> 7) + var5) - '錉') << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] + 31722) + var5) + var5) << 9 | (char)((char)((char)(var4[var5] + 31722) + var5) + var5) >>> 7) + var5) - '錉') >>> 1) - var5) ^ var5) << 13) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 31722) + var5) + var5) << 9 | (char)((char)((char)(var4[var5] + 31722) + var5) + var5) >>> 7) + var5) - '錉') << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] + 31722) + var5) + var5) << 9 | (char)((char)((char)(var4[var5] + 31722) + var5) + var5) >>> 7) + var5) - '錉') >>> 1) - var5) ^ var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 31722) + var5) + var5) << 9 | (char)((char)((char)(var4[var5] + 31722) + var5) + var5) >>> 7) + var5) - '錉') << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] + 31722) + var5) + var5) << 9 | (char)((char)((char)(var4[var5] + 31722) + var5) + var5) >>> 7) + var5) - '錉') >>> 1) - var5) ^ var5) << 13) >>> 13) ^ var5) - 'Ｔ') + var5))) << 8) + var5) ^ var5) ^ 20956));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite illIlIilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 295803303481766218L ^ Long.rotateLeft(4609565983699575654L, 4) ^ -8821627783844508806L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -4234168471782455062L ^ Long.rotateLeft(7928234787132717792L, 16) ^ -1004607707493779322L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 2683619980685981890L ^ Long.rotateLeft(3388426089086238352L, 37) ^ -3288592735547809109L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 6039387394430260814L ^ Long.rotateLeft(5173754962470012964L, 57) ^ -6531820451287515047L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4377367948727448802L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 2160786590251371793L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6812052015806941577L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3823019815274072598L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4132848691825747852L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1517025708901046875L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(lilIliilIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIiIllIiIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, iIiIlIliIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, lliIliliIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiiIlliiIl<invokedynamic>());
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

   public String lIlIliIlIl() {
      long var6 = -6117646905415832223L;
      StringBuilder var1 = new StringBuilder(illIlIilIl<invokedynamic>());
      lliIllililiIllil[] var2 = lliIllililiIllil.values();
      var6 ^= ((long)var2.length << 32 ^ var6) & -1L << 32;

      for(long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
         lliIllililiIllil var5 = var2[(int)var9];
         if (var1.length() > 1) {
            var1.append(illIlIilIl<invokedynamic>());
         }

         var1.append(var5).append('=').append(this.iIiiiIIlIi.getOrDefault(var5, 0));
      }

      return var1.append('}').toString();
   }

   public static long IliIlllilIi(long v) {
      v ^= v >>> 33;
      v *= -49064778989728563L;
      v ^= v >>> 33;
      v *= -4265267296055464877L;
      v ^= v >>> 33;
      return v;
   }

   public int iIIIlIlIIl() {
      long var4 = 3161379435598357327L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for(Iterator var2 = this.iIiiiIIlIi.values().iterator(); var2.hasNext(); var4 ^= ((long)((int)(var4 >>> 32) + (int)var4) << 32 ^ var4) & -1L << 32) {
         var4 ^= ((long)(Integer)var2.next() ^ var4) & -1L >>> 32;
      }

      return (int)(var4 >>> 32);
   }

   public void iiIIlIIlIl() {
      this.iiliiIIlIi.clear();
      this.IIiiiIIlIi.clear();
      this.lIiiiIIlIi.clear();
      this.iIiiiIIlIi.clear();
      this.IliiiIIlIi = this.lliiiIIlIi = this.iliiiIIlIi = this.IiiiiIIlIi = this.liiiiIIlIi = this.iiiiiIIlIi = this.IIIIIlIlIi = 0;
      this.lIIIIlIlIi = null;
   }

   public List<Long> iliIiiliiiii(int ctx, List<Long> deckY, iIIiIlllIlIiIlll tops, int recomputeBudget) {
      long var16 = 2373750543042743445L;
      long var18 = -8177457407594451954L;
      long var20 = 6018995818045460979L;
      ArrayList var5 = new ArrayList();
      Map var6 = (Map)this.iiliiIIlIi.get(ctx);
      if (var6 != null && !deckY.isEmpty()) {
         var16 ^= ((long)deckY.size() << 32 ^ var16) & -1L << 32;
         var16 ^= ((long)(this.IIIIIlIlIi % (int)(var16 >>> 32)) ^ var16) & -1L >>> 32;
         var18 ^= (0L ^ var18) & -1L << 32;

         for(long var25 = var18 ^ (0L ^ var18) & -1L >>> 32; (int)var25 < (int)(var16 >>> 32); var25 ^= (var25 ^ var25 + (long)1) & -1L >>> 32) {
            var20 ^= ((long)(((int)var16 + (int)var25) % (int)(var16 >>> 32)) << 32 ^ var20) & -1L << 32;
            long var12 = (Long)deckY.get((int)(var20 >>> 32));
            IiIiiiIlliIiiiIl var14 = (IiIiiiIlliIiiiIl)var6.get(var12);
            if (var14 != null) {
               if (this.IIIllIIliIIl(var14, tops)) {
                  if ((int)(var25 >>> 32) >= recomputeBudget) {
                     this.IIIIIlIlIi = (int)(var20 >>> 32);
                     return var5;
                  }

                  var25 += 4294967296L;
               }

               lliIllililiIllil var15 = this.IlIlllIlilIl(ctx, var12, var14, tops, true);
               if (var15 != null) {
                  this.IiIlliIliiIl(ctx, var12, var15);
                  var5.add(var12);
               }
            }
         }

         this.IIIIIlIlIi = 0;
         return var5;
      } else {
         return var5;
      }
   }
}
