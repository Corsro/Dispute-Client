package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class liIIiIiiiIIiIi {
   private final LinkedHashMap<Long, IiIIIlllliIIIlll> IiIillliiliIilllii = new LinkedHashMap<Long, IiIIIlllliIIIlll>(this, 64, 0.75F) {
      protected boolean removeEldestEntry(Map.Entry<Long, IiIIIlllliIIIlll> e) {
         return this.size() > 8192;
      }
   };
   private static final String[] IIIillliilIIilllii = new String[]{IIIilIIiiIIi<invokedynamic>(), IIIilIIiiIIi<invokedynamic>(), IIIilIIiiIIi<invokedynamic>(), IIIilIIiiIIi<invokedynamic>(), IIIilIIiiIIi<invokedynamic>(), IIIilIIiiIIi<invokedynamic>(), IIIilIIiiIIi<invokedynamic>(), IIIilIIiiIIi<invokedynamic>(), IIIilIIiiIIi<invokedynamic>(), IIIilIIiiIIi<invokedynamic>()};
   private IlilIIilllilIIil Illillliilllilllii;
   private int lIlillliiiIlilllii;
   private static final String[] llIillliiilIilllii = new String[]{IIIilIIiiIIi<invokedynamic>(), IIIilIIiiIIi<invokedynamic>(), IIIilIIiiIIi<invokedynamic>(), IIIilIIiiIIi<invokedynamic>(), IIIilIIiiIIi<invokedynamic>()};
   public static final int liilllliiiiillllii = 8192;
   private static final String[] iIIillliiIlIilllii = new String[]{IIIilIIiiIIi<invokedynamic>(), IIIilIIiiIIi<invokedynamic>(), IIIilIIiiIIi<invokedynamic>(), IIIilIIiiIIi<invokedynamic>()};
   private int iiIillliiIIlilllii;

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) ^ var5) << 7 | (char)((char)((char)(-var4[var5]) ^ var5) ^ var5) >>> 9) + 17288) - var5) - '廊') ^ var5) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) ^ var5) << 7 | (char)((char)((char)(-var4[var5]) ^ var5) ^ var5) >>> 9) + 17288) - var5) - '廊') ^ var5) >>> 11) - 25186));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 9 | (char)(var4[var5] - var5) << 7) + '訐') >>> 10 | (char)((char)((char)(var4[var5] - var5) >>> 9 | (char)(var4[var5] - var5) << 7) + '訐') << 6) << 5 | (char)((char)((char)((char)(var4[var5] - var5) >>> 9 | (char)(var4[var5] - var5) << 7) + '訐') >>> 10 | (char)((char)((char)(var4[var5] - var5) >>> 9 | (char)(var4[var5] - var5) << 7) + '訐') << 6) >>> 11))))) + 5000) - 12482) ^ var5) + 20927));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IIillIiliIil() {
      return this.IiIillliiliIilllii.size();
   }

   public boolean IlIlllIlilIl(long target) {
      return this.IiIillliiliIilllii.containsKey(target);
   }

   public int Iilllilliill() {
      return this.lIlillliiiIlilllii;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -2360697648818740944L ^ Long.rotateLeft(1201946130174017869L, 5) ^ -8112781939854732217L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -6455898594843042916L ^ Long.rotateLeft(6454016334384080725L, 43) ^ 3196144886268836744L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -3634532295712799203L ^ Long.rotateLeft(2551834120429636571L, 15) ^ 6170491733934177166L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4008020479840928260L ^ Long.rotateLeft(-7631505754960389215L, 18) ^ -169651723949475334L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1973931314309950623L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2262438357560858353L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -5798631929696563357L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -8624213236053617408L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5249387299950750170L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 5193687015041909335L;
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

   public IlilIIilllilIIil IIlllIlliIll() {
      return this.Illillliilllilllii;
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + '锪') << 1 | (char)(var4[var5] + '锪') >>> 15) - 19961) ^ 'ꝃ') - '봘') << 4 | (char)((char)((char)((char)((char)(var4[var5] + '锪') << 1 | (char)(var4[var5] + '锪') >>> 15) - 19961) ^ 'ꝃ') - '봘') >>> 12))) - '술') - 30595) - var5) ^ var5) + 18245) ^ 31488))) - var5) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static IlilIIilllilIIil IliIlllilIi(IiIIIlllliIIIlll tick, int geometryNow, int floorTicks, long componentNow, long deferred) {
      if (tick == null) {
         return IlilIIilllilIIil.lIIlllIIil;
      } else if (componentNow != tick.liiiIIllIl()) {
         return IlilIIilllilIIil.iiiIllIIil;
      } else if (deferred != tick.iIlIlllllill()) {
         return IlilIIilllilIIil.IIIlllIIil;
      } else if (tick.IilliliilIIi() == lIlIliIlIl.IlIlIIlllIlIIl) {
         return IlilIIilllilIIil.iIIlllIIil;
      } else {
         return geometryNow - tick.IliIlllilIi() < floorTicks ? IlilIIilllilIIil.IlIlllIIil : IlilIIilllilIIil.lIIlllIIil;
      }
   }

   public void Ililllililil() {
      this.IiIillliiliIilllii.clear();
      this.iiIillliiIIlilllii = 0;
      this.lIlillliiiIlilllii = 0;
      this.Illillliilllilllii = null;
   }

   public static boolean liiiIIllIl(IlilIIilllilIIil v) {
      return v == IlilIIilllilIIil.iiiIllIIil || v == IlilIIilllilIIil.IIIlllIIil || v == IlilIIilllilIIil.lIIlllIIil;
   }

   public IlilIIilllilIIil IiIlliIliiIl(long target, int geometryNow, int componentNow, long tick, long floorTicks) {
      IlilIIilllilIIil var9 = IliIlllilIi((IiIIIlllliIIIlll)this.IiIillliiliIilllii.get(target), geometryNow, componentNow, tick, floorTicks);
      if (liiiIIllIl(var9)) {
         ++this.lIlillliiiIlilllii;
      } else {
         ++this.iiIillliiIIlilllii;
      }

      this.Illillliilllilllii = var9;
      return var9;
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(~((char)(-var4[var5]))) - 23829))))) << 6 | (char)(-((char)(~((char)((char)(~((char)(-var4[var5]))) - 23829))))) >>> 10) - 22614) + var5) ^ '鸹') >>> 5 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(~((char)(-var4[var5]))) - 23829))))) << 6 | (char)(-((char)(~((char)((char)(~((char)(-var4[var5]))) - 23829))))) >>> 10) - 22614) + var5) ^ '鸹') << 11) ^ 26495) << 14 | (char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(~((char)(-var4[var5]))) - 23829))))) << 6 | (char)(-((char)(~((char)((char)(~((char)(-var4[var5]))) - 23829))))) >>> 10) - 22614) + var5) ^ '鸹') >>> 5 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(~((char)(-var4[var5]))) - 23829))))) << 6 | (char)(-((char)(~((char)((char)(~((char)(-var4[var5]))) - 23829))))) >>> 10) - 22614) + var5) ^ '鸹') << 11) ^ 26495) >>> 2) - '赻') >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(~((char)(-var4[var5]))) - 23829))))) << 6 | (char)(-((char)(~((char)((char)(~((char)(-var4[var5]))) - 23829))))) >>> 10) - 22614) + var5) ^ '鸹') >>> 5 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(~((char)(-var4[var5]))) - 23829))))) << 6 | (char)(-((char)(~((char)((char)(~((char)(-var4[var5]))) - 23829))))) >>> 10) - 22614) + var5) ^ '鸹') << 11) ^ 26495) << 14 | (char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(~((char)(-var4[var5]))) - 23829))))) << 6 | (char)(-((char)(~((char)((char)(~((char)(-var4[var5]))) - 23829))))) >>> 10) - 22614) + var5) ^ '鸹') >>> 5 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(~((char)(-var4[var5]))) - 23829))))) << 6 | (char)(-((char)(~((char)((char)(~((char)(-var4[var5]))) - 23829))))) >>> 10) - 22614) + var5) ^ '鸹') << 11) ^ 26495) >>> 2) - '赻') << 12) ^ '骢'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String Iiilliiliiil() {
      return String.format(Locale.ROOT, IIIilIIiiIIi<invokedynamic>(), this.IiIillliiliIilllii.size(), this.iiIillliiIIlilllii, this.lIlillliiiIlilllii, this.Illillliilllilllii == null ? IIIilIIiiIIi<invokedynamic>() : this.Illillliilllilllii);
   }

   public static lIlIliIlIl iIlIlllllill(String reason) {
      if (reason == null) {
         return lIlIliIlIl.liIlIIliiIlIIl;
      } else {
         String var1 = reason.toLowerCase(Locale.ROOT);
         if (IilliliilIIi(var1, IIIillliilIIilllii)) {
            return lIlIliIlIl.IlIlIIlllIlIIl;
         } else if (IilliliilIIi(var1, iIIillliiIlIilllii)) {
            return lIlIliIlIl.ilIlIIlIiIlIIl;
         } else {
            return IilliliilIIi(var1, llIillliiilIilllii) ? lIlIliIlIl.IIllIIllIllIIl : lIlIliIlIl.liIlIIliiIlIIl;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(~((char)((char)(~((char)(-((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5)) << 5 | (char)((char)(var4[var5] >>> 11 | var4[var5] << 5)) >>> 11))))) ^ var5))) - 435) - '钊'))))) ^ var5) + 28829) ^ var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Illlllllilll() {
      return this.iiIillliiIIlilllii;
   }

   private static boolean IilliliilIIi(String words, String[] s) {
      long var6 = 4879447485765769449L;
      String[] var2 = s;
      var6 ^= ((long)s.length << 32 ^ var6) & -1L << 32;

      for(long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
         String var5 = var2[(int)var9];
         if (words.contains(var5)) {
            return true;
         }
      }

      return false;
   }

   public IiIIIlllliIIIlll iliIiiliiiii(long target) {
      return (IiIIIlllliIIIlll)this.IiIillliiliIilllii.get(target);
   }

   public void lIiiIiIlilli(long s, IiIIIlllliIIIlll target) {
      if (target == null) {
         this.IiIillliiliIilllii.remove(s);
      } else {
         this.IiIillliiliIilllii.remove(s);
         this.IiIillliiliIilllii.put(s, target);
      }
   }

   public void IIIllIIliIIl(long target) {
      this.IiIillliiliIilllii.remove(target);
   }
}
