package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class iillilIIilil {
   public static final double lllliiliillliili = 0.3;
   private int lIiIIIiiiIiIIIii;
   public static final int iIIiiiliIlIiiili = 5;
   public static final long Illiiilillliiili = 100L;
   public static final int IIIiiililIIiiili = 99;
   public static final int llIiiiliilIiiili = 3;
   private boolean iIlIIIiiIllIIIii;
   private long IIlIIIiilIlIIIii = Long.MIN_VALUE;
   public static final int lIliiiliiIliiili = 32;
   public static final double illiiiliIiliiili = (double)3.0F;
   private final boolean[] lllIIIiiillIIIii = new boolean[5];
   public static final double Iiiiiililiiiiili = (double)6.0F;
   public static final int IIiiiililIiiiili = 60;
   public static final double iilliiliIIiliili = (double)40.0F;
   public static final int IiIiiililiIiiili = 1;
   private double IlIIIIiillIIIIii = (double)12.0F;
   public static final double ililiiliIiiliili = (double)40.0F;
   private int iilIIIiiIIiIIIii;
   private final Map<Integer, Long> IliIIIiilliIIIii = new LinkedHashMap();
   public static final double liiliiliiiiliili = (double)4.0F;
   private final ArrayDeque<IiiilIiliiilIi> iliIIIiiIiiIIIii = new ArrayDeque();
   public static final int liliiiliiiliiili = 2;
   public static final double iiiiiiliIIIIIIii = (double)1.0F;
   private long liIIIIiiiiIIIIii = Long.MIN_VALUE;
   public static final long iiIiiiliIIliiili = 80L;
   public static final int lliiiiliiliiiili = 4;
   public static final int iIiiiiliIliiiili = 10;
   private double ilIIIIiiIiIIIIii = (double)4.0F;
   public static final double Iilliilililliili = (double)3.0F;
   public static final double lIIIIIiiiIIIIIii = (double)5.5F;
   public static final double Ililiililliliili = (double)1.0F;
   private int IilIIIiililIIIii;
   public static final double lIiliiliiIiliili = (double)12.0F;

   public void liiiIIllIl(long ourReadyInAtBoom, boolean radius, int tick, double cx, double nearUs, double cy, float cz) {
      long var18 = -7845644550320052097L;
      long var20 = 5252752411668057463L;
      this.IliIlllilIi(ourReadyInAtBoom, radius, tick);
      if ((double)cz >= (double)5.5F && Double.isFinite(cx) && Double.isFinite(nearUs) && Double.isFinite(cy)) {
         var18 ^= ((long)((int)Math.floor(cx)) << 32 ^ var18) & -1L << 32;
         var18 ^= ((long)((int)Math.floor(nearUs + 0.001) - 1) ^ var18) & -1L >>> 32;
         var20 ^= ((long)((int)Math.floor(cy)) << 32 ^ var20) & -1L << 32;
         IiiilIiliiilIi var15 = null;

         for(IiiilIiliiilIi var17 : this.iliIIIiiIiiIIIii) {
            if (var17.iliiIlliiIiiiIllii == (int)(var18 >>> 32) && var17.liiiIlliiiiiiIllii == (int)var18 && var17.IIIIllliilIIIlllii == (int)(var20 >>> 32)) {
               var15 = var17;
               break;
            }
         }

         if (var15 != null) {
            long var22 = ourReadyInAtBoom - var15.llIIllliiilIIlllii;
            if (var22 > 0L) {
               if (var22 <= 60L) {
                  ++var15.iIIIllliiIlIIlllii;
                  var15.IiIIllliiliIIlllii = var15.iIIIllliiIlIIlllii == 2 ? IIIilIIiiIIi((double)var22, (double)1.0F, (double)40.0F) : IIIilIIiiIIi(var15.IiIIllliiliIIlllii + 0.3 * ((double)var22 - var15.IiIIllliiliIIlllii), (double)1.0F, (double)40.0F);
               } else {
                  var15.iIIIllliiIlIIlllii = 1;
                  var15.IiIIllliiliIIlllii = (double)6.0F;
               }

               var15.llIIllliiilIIlllii = ourReadyInAtBoom;
               this.iliIIIiiIiiIIIii.remove(var15);
               this.iliIIIiiIiiIIIii.addLast(var15);
            }
         } else {
            this.iliIIIiiIiiIIIii.addLast(new IiiilIiliiilIi((int)(var18 >>> 32), (int)var18, (int)(var20 >>> 32), ourReadyInAtBoom));

            while(this.iliIIIiiIiiIIIii.size() > 4) {
               this.iliIIIiiIiiIIIii.pollFirst();
            }

         }
      }
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + '鳙') + var5))) >>> 4 | (char)(~((char)((char)((char)(~var4[var5]) + '鳙') + var5))) << 12) + '腚') >>> 1 | (char)((char)((char)(~((char)((char)((char)(~var4[var5]) + '鳙') + var5))) >>> 4 | (char)(~((char)((char)((char)(~var4[var5]) + '鳙') + var5))) << 12) + '腚') << 15) << 10 | (char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + '鳙') + var5))) >>> 4 | (char)(~((char)((char)((char)(~var4[var5]) + '鳙') + var5))) << 12) + '腚') >>> 1 | (char)((char)((char)(~((char)((char)((char)(~var4[var5]) + '鳙') + var5))) >>> 4 | (char)(~((char)((char)((char)(~var4[var5]) + '鳙') + var5))) << 12) + '腚') << 15) >>> 6) ^ var5) + '죍'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IiIlliIliiIl(double boomInterval, double placeToBreak) {
      if (!this.iIlIIIiiIllIIIii) {
         if (Double.isFinite(boomInterval)) {
            this.IlIIIIiillIIIIii = IIIilIIiiIIi(boomInterval, (double)3.0F, (double)40.0F);
         }

         if (Double.isFinite(placeToBreak)) {
            this.ilIIIIiiIiIIIIii = IIIilIIiiIIi(placeToBreak, (double)1.0F, (double)40.0F);
         }

      }
   }

   public double Illlllllilll() {
      return this.ilIIIIiiIiIIIIii;
   }

   public int IilliliilIIi(long now) {
      iIilIiIiIlilIiIi var3 = this.iIlIlllllill(now);
      if (var3 == null) {
         return 99;
      } else {
         long var4 = Math.max(1L, Math.round(var3.IIlllIlliIll()));
         long var6 = Math.max(0L, now - var3.IiIlliIliiIl());
         long var8 = var6 < var4 ? var4 - var6 : (var4 - var6 % var4) % var4;
         return (int)Math.min(99L, var8);
      }
   }

   public double IIlllIlliIll() {
      return this.IlIIIIiillIIIIii;
   }

   public boolean Iilllilliill() {
      return this.lIiIIIiiiIiIIIii >= 3 && this.IilIIIiililIIIii >= 3;
   }

   public long Ililllililil() {
      return this.liIIIIiiiiIIIIii;
   }

   public void Iiilliiliiil() {
      this.IlIIIIiillIIIIii = (double)12.0F;
      this.ilIIIIiiIiIIIIii = (double)4.0F;
      this.liIIIIiiiiIIIIii = Long.MIN_VALUE;
      this.IIlIIIiilIlIIIii = Long.MIN_VALUE;
      this.iIlIIIiiIllIIIii = false;
      Arrays.fill(this.lllIIIiiillIIIii, false);
      this.IilIIIiililIIIii = 0;
      this.iilIIIiiIIiIIIii = 0;
      this.lIiIIIiiiIiIIIii = 0;
      this.IliIIIiilliIIIii.clear();
      this.iliIIIiiIiiIIIii.clear();
   }

   public void IliIlllilIi(long ourReadyInAtBoom, boolean nearUs, int tick) {
      long var7 = 2498360923051523872L;
      if (this.liIIIIiiiiIIIIii != Long.MIN_VALUE) {
         long var5 = ourReadyInAtBoom - this.liIIIIiiiiIIIIii;
         if (var5 > 0L && var5 <= 80L) {
            this.IlIIIIiillIIIIii = IIIilIIiiIIi(this.IlIIIIiillIIIIii + 0.3 * ((double)var5 - this.IlIIIIiillIIIIii), (double)3.0F, (double)40.0F);
         }
      }

      this.liIIIIiiiiIIIIii = ourReadyInAtBoom;
      this.iIlIIIiiIllIIIii = true;
      if (nearUs) {
         var7 ^= ((long)(Math.abs(tick) <= 1 ? 1 : 0) << 32 ^ var7) & -1L << 32;
         if (this.lllIIIiiillIIIii[this.iilIIIiiIIiIIIii]) {
            --this.IilIIIiililIIIii;
         }

         this.lllIIIiiillIIIii[this.iilIIIiiIIiIIIii] = (boolean)((int)(var7 >>> 32));
         if ((int)(var7 >>> 32) != 0) {
            ++this.IilIIIiililIIIii;
         }

         this.iilIIIiiIIiIIIii = (this.iilIIIiiIIiIIIii + 1) % 5;
         ++this.lIiIIIiiiIiIIIii;
      }

   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) + var5))))) + var5) << 9 | (char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) + var5))))) + var5) >>> 7) ^ var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) ^ var5) << 11 | (char)((char)(~((char)(~var4[var5]))) ^ var5) >>> 5) >>> 14 | (char)((char)((char)(~((char)(~var4[var5]))) ^ var5) << 11 | (char)((char)(~((char)(~var4[var5]))) ^ var5) >>> 5) << 2) ^ var5) - var5) + 5124) << 4 | (char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) ^ var5) << 11 | (char)((char)(~((char)(~var4[var5]))) ^ var5) >>> 5) >>> 14 | (char)((char)((char)(~((char)(~var4[var5]))) ^ var5) << 11 | (char)((char)(~((char)(~var4[var5]))) ^ var5) >>> 5) << 2) ^ var5) - var5) + 5124) >>> 12) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) ^ var5) << 11 | (char)((char)(~((char)(~var4[var5]))) ^ var5) >>> 5) >>> 14 | (char)((char)((char)(~((char)(~var4[var5]))) ^ var5) << 11 | (char)((char)(~((char)(~var4[var5]))) ^ var5) >>> 5) << 2) ^ var5) - var5) + 5124) << 4 | (char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) ^ var5) << 11 | (char)((char)(~((char)(~var4[var5]))) ^ var5) >>> 5) >>> 14 | (char)((char)((char)(~((char)(~var4[var5]))) ^ var5) << 11 | (char)((char)(~((char)(~var4[var5]))) ^ var5) >>> 5) << 2) ^ var5) - var5) + 5124) >>> 12) >>> 13));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String lIiiIiIlilli(long now) {
      iIilIiIiIlilIiIi var3 = this.iIlIlllllill(now);
      return var3 == null ? IiIiliIiiiIi<invokedynamic>() : String.format(Locale.ROOT, IiIiliIiiiIi<invokedynamic>(), var3.lIiiIiIlilli(), var3.iliIiiliiiii(), var3.IIIllIIliIIl(), var3.IlIlllIlilIl(), var3.IIlllIlliIll(), this.IilliliilIIi(now));
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(-((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ '艇') + '聵') >>> 5 | (char)((char)((char)(~var4[var5]) ^ '艇') + '聵') << 11))) << 4 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ '艇') + '聵') >>> 5 | (char)((char)((char)(~var4[var5]) ^ '艇') + '聵') << 11))) >>> 12) + var5) << 2 | (char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ '艇') + '聵') >>> 5 | (char)((char)((char)(~var4[var5]) ^ '艇') + '聵') << 11))) << 4 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ '艇') + '聵') >>> 5 | (char)((char)((char)(~var4[var5]) ^ '艇') + '聵') << 11))) >>> 12) + var5) >>> 14)))))) << 3 | (char)(-((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ '艇') + '聵') >>> 5 | (char)((char)((char)(~var4[var5]) ^ '艇') + '聵') << 11))) << 4 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ '艇') + '聵') >>> 5 | (char)((char)((char)(~var4[var5]) ^ '艇') + '聵') << 11))) >>> 12) + var5) << 2 | (char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ '艇') + '聵') >>> 5 | (char)((char)((char)(~var4[var5]) ^ '艇') + '聵') << 11))) << 4 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ '艇') + '聵') >>> 5 | (char)((char)((char)(~var4[var5]) ^ '艇') + '聵') << 11))) >>> 12) + var5) >>> 14)))))) >>> 13))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iIilIiIiIlilIiIi iIlIlllllill(long now) {
      IiiilIiliiilIi var3 = null;

      for(IiiilIiliiilIi var5 : this.iliIIIiiIiiIIIii) {
         if (var5.iIIIllliiIlIIlllii >= 2) {
            long var6 = now - var5.llIIllliiilIIlllii;
            if (var6 >= 0L && var6 <= Math.max(10L, Math.round((double)2.0F * var5.IiIIllliiliIIlllii)) && (var3 == null || var5.iIIIllliiIlIIlllii > var3.iIIIllliiIlIIlllii || var5.iIIIllliiIlIIlllii == var3.iIIIllliiIlIIlllii && var5.llIIllliiilIIlllii >= var3.llIIllliiilIIlllii)) {
               var3 = var5;
            }
         }
      }

      return var3 == null ? null : new iIilIiIiIlilIiIi(var3.iliiIlliiIiiiIllii, var3.liiiIlliiiiiiIllii, var3.IIIIllliilIIIlllii, var3.iIIIllliiIlIIlllii, var3.llIIllliiilIIlllii, var3.IiIIllliiliIIlllii);
   }

   public int IIillIiliIil(long now) {
      long var3 = Long.MAX_VALUE;
      if (this.liIIIIiiiiIIIIii != Long.MIN_VALUE && now - this.liIIIIiiiiIIIIii <= Math.round((double)3.0F * this.IlIIIIiillIIIIii)) {
         var3 = Math.max(0L, this.liIIIIiiiiIIIIii + Math.round(this.IlIIIIiillIIIIii) - now);
      }

      this.IliIIIiilliIIIii.values().removeIf((nowx) -> now - nowx > 100L);

      for(long var6 : this.IliIIIiilliIIIii.values()) {
         long var8 = Math.max(0L, var6 + Math.round(this.ilIIIIiiIiIIIIii) - now);
         if (this.IIlIIIiilIlIIIii != Long.MIN_VALUE && now - this.IIlIIIiilIlIIIii <= 1L) {
            var8 = 0L;
         }

         var3 = Math.min(var3, var8);
      }

      if (var3 == Long.MAX_VALUE) {
         return 99;
      } else {
         return (int)Math.min(99L, var3);
      }
   }

   public void iliIiiliiiii(int tick, long crystalId) {
      this.IliIIIiilliIIIii.put(tick, crystalId);
      if (this.IliIIIiilliIIIii.size() > 32) {
         Iterator var4 = this.IliIIIiilliIIIii.keySet().iterator();
         var4.next();
         var4.remove();
      }

   }

   private static double IIIilIIiiIIi(double v, double hi, double lo) {
      return v < hi ? hi : Math.min(v, lo);
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ '豉') << 15 | (char)((char)(~((char)(var4[var5] ^ var5))) ^ '豉') >>> 1) >>> 7 | (char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ '豉') << 15 | (char)((char)(~((char)(var4[var5] ^ var5))) ^ '豉') >>> 1) << 9))))) >>> 12 | (char)(-((char)(-((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ '豉') << 15 | (char)((char)(~((char)(var4[var5] ^ var5))) ^ '豉') >>> 1) >>> 7 | (char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ '豉') << 15 | (char)((char)(~((char)(var4[var5] ^ var5))) ^ '豉') >>> 1) << 9))))) << 4) ^ '鞘') + 8765) ^ 21155))) ^ var5) >>> 3 | (char)((char)(~((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ '豉') << 15 | (char)((char)(~((char)(var4[var5] ^ var5))) ^ '豉') >>> 1) >>> 7 | (char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ '豉') << 15 | (char)((char)(~((char)(var4[var5] ^ var5))) ^ '豉') >>> 1) << 9))))) >>> 12 | (char)(-((char)(-((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ '豉') << 15 | (char)((char)(~((char)(var4[var5] ^ var5))) ^ '豉') >>> 1) >>> 7 | (char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ '豉') << 15 | (char)((char)(~((char)(var4[var5] ^ var5))) ^ '豉') >>> 1) << 9))))) << 4) ^ '鞘') + 8765) ^ 21155))) ^ var5) << 13) - var5) - var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IlIlllIlilIl(long tick) {
      this.IIlIIIiilIlIIIii = tick;
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 360376655859399059L ^ Long.rotateLeft(2449817807773010218L, 34) ^ 5268127762272435108L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 2012876144915186499L ^ Long.rotateLeft(5231546896414087830L, 53) ^ -7483271662621594025L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3547798841471455387L ^ Long.rotateLeft(7621555258646476821L, 61) ^ -7187764345161495062L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6810598258858220841L ^ Long.rotateLeft(-5422000576228488296L, 48) ^ -6234546708814587827L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2677803126595792654L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1191043506167075257L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4092290933063675160L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4576622386561447296L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5122482497702042474L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 200317271112910566L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIlilIliiIli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Illillliilli<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iilililiiili<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IIiilIiiiIii<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iliilliiilii<invokedynamic>());
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

   public void IIIllIIliIIl(int tick, long crystalId) {
      Long var4 = (Long)this.IliIIIiilliIIIii.remove(tick);
      if (var4 != null) {
         long var5 = crystalId - var4;
         if (var5 >= 0L && var5 <= 100L) {
            this.ilIIIIiiIiIIIIii = IIIilIIiiIIi(this.ilIIIIiiIiIIIIii + 0.3 * ((double)var5 - this.ilIIIIiiIiIIIIii), (double)1.0F, (double)40.0F);
            this.iIlIIIiiIllIIIii = true;
         }
      }
   }
}
