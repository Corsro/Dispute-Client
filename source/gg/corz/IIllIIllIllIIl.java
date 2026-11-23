package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public record IIllIIllIllIIl(long tick, lliiilIiiliiilIi self, liiilIiliiiilIil target, int enemiesWithin8, IlIillllIill threat, int targetReadyIn, int selfClosedFor, boolean nether, llilIlIlililIlIl cfg, Map<iIlIIIIiIllIIIIi, IilliIIllilliIIl> options, iIlIIIIiIllIIIIi committed, iIlIIIIiIllIIIIi lastLane, int ticksSinceOwnPop, int stallWindows, boolean lootNearby, double nearestEnemy, boolean pearlIncoming, IiIililiIili lastPosture, iiliiiIiIIiiiiIi combo, float selfSpent, IIIilIIiiIIi anchor, iiliiiIiIIiiiiIi breach, boolean popPending) {
   private final llilIlIlililIlIl IliiIliIllliiIliIl;
   private final int iIliIliIlIlliIliIl;
   private final float lilIlliIliilIlliIl;
   private final long ilIiIliIlIiIiIliIl;
   private final int llIIlliIlilIIlliIl;
   private final Map<iIlIIIIiIllIIIIi, IilliIIllilliIIl> iliiIliIlIiiiIliIl;
   private final int IiliIliIlliliIliIl;
   private final boolean lIlIlliIliIlIlliIl;
   private final double iiIIlliIlIIlIlliIl;
   private final IIIilIIiiIIi IIiIlliIllIiIlliIl;
   private final iiliiiIiIIiiiiIi illIlliIlIilIlliIl;
   private final iiliiiIiIIiiiiIi iIiIlliIlIliIlliIl;
   private final boolean lliIlliIliliIlliIl;
   private final iIlIIIIiIllIIIIi IIIIlliIllIIIlliIl;
   private final boolean lIiiIliIliIiiIliIl;
   private final liiilIiliiiilIil IIliIliIllIliIliIl;
   private final int iIIIlliIlIlIIlliIl;
   private final boolean IiIIlliIlliIIlliIl;
   private final IiIililiIili IllIlliIllllIlliIl;
   private final iIlIIIIiIllIIIIi liiiIliIliiiiIliIl;
   private final IlIillllIill llliIliIlilliIliIl;
   private final lliiilIiiliiilIi liIiIliIliiIiIliIl;
   private final int iiliIliIlIIiiIliIl;

   public ilIiliilIiIiliil IliIlllilIi() {
      IlIIIlilllIIIlil var1 = this.IliiIliIllliiIliIl != null && this.IliiIliIllliiIliIl.IliIlllilIi() != null ? this.IliiIliIllliiIliIl.IliIlllilIi() : IlIIIlilllIIIlil.iliIiilIil;
      if (this.liIiIliIliiIiIliIl == null) {
         return ilIiliilIiIiliil.IiIlIIIiil;
      } else {
         return var1 == IlIIIlilllIIIlil.iliIiilIil ? ilIiliilIiIiliil.IilliliilIIi(this.liIiIliIliiIiIliIl.Iilllilliill() && this.liIiIliIliiIiIliIl.IIillIiliIil() >= 1 && !this.lliIlliIliliIlliIl && this.iIIIlliIlIlIIlliIl > 2, this.liIiIliIliiIiIliIl.IIillIiliIil(), this.liIiIliIliiIiIliIl.IliIlllilIi(), this.liiiIIllIl()) : ilIiliilIiIiliil.iIlIlllllill(var1 == IlIIIlilllIIIlil.iliIiilIil, this.liIiIliIliiIiIliIl.Iilllilliill(), this.liIiIliIliiIiIliIl.IIillIiliIil(), this.liIiIliIliiIiIliIl.IliIlllilIi(), this.lliIlliIliliIlliIl || this.iIIIlliIlIlIIlliIl <= 5, this.liiiIIllIl());
      }
   }

   public iIlIIIIiIllIIIIi IlIillIiilIi() {
      return this.liiiIliIliiiiIliIl;
   }

   public boolean Iilililiiili() {
      return this.IiIIlliIlliIIlliIl;
   }

   public int Iilllilliill() {
      return this.IiliIliIlliliIliIl;
   }

   public IIllIIllIllIIl lIiiIiIlilli(iiliiiIiIIiiiiIi c) {
      return new IIllIIllIllIIl(this.ilIiIliIlIiIiIliIl, this.liIiIliIliiIiIliIl, this.IIliIliIllIliIliIl, this.iIliIliIlIlliIliIl, this.llliIliIlilliIliIl, this.IiliIliIlliliIliIl, this.iiliIliIlIIiiIliIl, this.lIiiIliIliIiiIliIl, this.IliiIliIllliiIliIl, this.iliiIliIlIiiiIliIl, this.liiiIliIliiiiIliIl, this.IIIIlliIllIIIlliIl, this.iIIIlliIlIlIIlliIl, this.llIIlliIlilIIlliIl, this.IiIIlliIlliIIlliIl, this.iiIIlliIlIIlIlliIl, this.lIlIlliIliIlIlliIl, this.IllIlliIllllIlliIl, c == null ? iiliiiIiIIiiiiIi.iIiliIIlIi : c, this.lilIlliIliilIlliIl, this.IIiIlliIllIiIlliIl, this.iIiIlliIlIliIlliIl, this.lliIlliIliliIlliIl);
   }

   public float iIIIlIlIIl() {
      return this.lilIlliIliilIlliIl;
   }

   // $FF: synthetic method
   private static CallSite lilIliilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(~((char)(-((char)((char)(var4[var5] + '碑') ^ '襼'))))) - var5))) - var5) - var5))) ^ var5) + 'ꬄ') >>> 9 | (char)((char)((char)(~((char)((char)((char)(~((char)((char)(~((char)(-((char)((char)(var4[var5] + '碑') ^ '襼'))))) - var5))) - var5) - var5))) ^ var5) + 'ꬄ') << 7) + var5) ^ 3831))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public double IIiilIiiiIii() {
      return this.iiIIlliIlIIlIlliIl;
   }

   // $FF: synthetic method
   private static CallSite iIiIlIliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) << 1 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) >>> 15) + var5))))) ^ 25439) << 1 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) << 1 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) >>> 15) + var5))))) ^ 25439) >>> 15) ^ var5) << 5 | (char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) << 1 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) >>> 15) + var5))))) ^ 25439) << 1 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) << 1 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) >>> 15) + var5))))) ^ 25439) >>> 15) ^ var5) >>> 11) >>> 9 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) << 1 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) >>> 15) + var5))))) ^ 25439) << 1 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) << 1 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) >>> 15) + var5))))) ^ 25439) >>> 15) ^ var5) << 5 | (char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) << 1 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) >>> 15) + var5))))) ^ 25439) << 1 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) << 1 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) >>> 15) + var5))))) ^ 25439) >>> 15) ^ var5) >>> 11) << 7) << 15 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) << 1 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) >>> 15) + var5))))) ^ 25439) << 1 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) << 1 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) >>> 15) + var5))))) ^ 25439) >>> 15) ^ var5) << 5 | (char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) << 1 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) >>> 15) + var5))))) ^ 25439) << 1 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) << 1 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) >>> 15) + var5))))) ^ 25439) >>> 15) ^ var5) >>> 11) >>> 9 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) << 1 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) >>> 15) + var5))))) ^ 25439) << 1 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) << 1 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) >>> 15) + var5))))) ^ 25439) >>> 15) ^ var5) << 5 | (char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) << 1 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) >>> 15) + var5))))) ^ 25439) << 1 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) << 1 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 12814) + '쩫') + var5) >>> 15) + var5))))) ^ 25439) >>> 15) ^ var5) >>> 11) << 7) >>> 1));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IIlilIliiIli() {
      return this.iIIIlliIlIlIIlliIl;
   }

   public boolean iiIIlIIlIl() {
      return this.lliIlliIliliIlliIl;
   }

   public boolean Ililllililil() {
      return this.lIiiIliIliIiiIliIl;
   }

   public int IIillIiliIil() {
      return this.iiliIliIlIIiiIliIl;
   }

   public IiIililiIili Iiiiliiiiiii() {
      return this.IllIlliIllllIlliIl;
   }

   public Map<iIlIIIIiIllIIIIi, IilliIIllilliIIl> IIIilIIiiIIi() {
      return this.iliiIliIlIiiiIliIl;
   }

   public static boolean iIlIlllllill(lliiilIiiliiilIi t, liiilIiliiiilIil self) {
      return t != null && self != null && t.llIIlilIIl() > self.iiIIlIIlIl();
   }

   // $FF: synthetic method
   private static CallSite IIiIllIiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] - var5) - var5) << 10 | (char)((char)(var4[var5] - var5) - var5) >>> 6))) - 15363))) - '郥') >>> 14 | (char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] - var5) - var5) << 10 | (char)((char)(var4[var5] - var5) - var5) >>> 6))) - 15363))) - '郥') << 2) + 6117) ^ var5))) >>> 9 | (char)(-((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] - var5) - var5) << 10 | (char)((char)(var4[var5] - var5) - var5) >>> 6))) - 15363))) - '郥') >>> 14 | (char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] - var5) - var5) << 10 | (char)((char)(var4[var5] - var5) - var5) >>> 6))) - 15363))) - '郥') << 2) + 6117) ^ var5))) << 7) + var5) + '薈'))) >>> 7 | (char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] - var5) - var5) << 10 | (char)((char)(var4[var5] - var5) - var5) >>> 6))) - 15363))) - '郥') >>> 14 | (char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] - var5) - var5) << 10 | (char)((char)(var4[var5] - var5) - var5) >>> 6))) - 15363))) - '郥') << 2) + 6117) ^ var5))) >>> 9 | (char)(-((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] - var5) - var5) << 10 | (char)((char)(var4[var5] - var5) - var5) >>> 6))) - 15363))) - '郥') >>> 14 | (char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] - var5) - var5) << 10 | (char)((char)(var4[var5] - var5) - var5) >>> 6))) - 15363))) - '郥') << 2) + 6117) ^ var5))) << 7) + var5) + '薈'))) << 9) ^ var5))) ^ 12852));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public liiilIiliiiilIil IiIlliIliiIl() {
      return this.IIliIliIllIliIliIl;
   }

   public IIllIIllIllIIl(long threat, lliiilIiiliiilIi lastLane, liiilIiliiiilIil tick, int lastPosture, IlIillllIill cfg, int lootNearby, int nearestEnemy, boolean committed, llilIlIlililIlIl target, Map<iIlIIIIiIllIIIIi, IilliIIllilliIIl> pearlIncoming, iIlIIIIiIllIIIIi ticksSinceOwnPop, iIlIIIIiIllIIIIi self, int combo, int options, boolean selfClosedFor, double stallWindows, boolean targetReadyIn, IiIililiIili nether, iiliiiIiIIiiiiIi enemiesWithin8) {
      this(threat, lastLane, tick, lastPosture, cfg, lootNearby, nearestEnemy, committed, target, pearlIncoming, ticksSinceOwnPop, self, combo, options, selfClosedFor, stallWindows, targetReadyIn, nether, enemiesWithin8, 0.0F);
   }

   public llilIlIlililIlIl Iiilliiliiil() {
      return this.IliiIliIllliiIliIl;
   }

   public IIllIIllIllIIl iliIiiliiiii(iiliiiIiIIiiiiIi b) {
      return new IIllIIllIllIIl(this.ilIiIliIlIiIiIliIl, this.liIiIliIliiIiIliIl, this.IIliIliIllIliIliIl, this.iIliIliIlIlliIliIl, this.llliIliIlilliIliIl, this.IiliIliIlliliIliIl, this.iiliIliIlIIiiIliIl, this.lIiiIliIliIiiIliIl, this.IliiIliIllliiIliIl, this.iliiIliIlIiiiIliIl, this.liiiIliIliiiiIliIl, this.IIIIlliIllIIIlliIl, this.iIIIlliIlIlIIlliIl, this.llIIlliIlilIIlliIl, this.IiIIlliIlliIIlliIl, this.iiIIlliIlIIlIlliIl, this.lIlIlliIliIlIlliIl, this.IllIlliIllllIlliIl, this.illIlliIlIilIlliIl, this.lilIlliIliilIlliIl, this.IIiIlliIllIiIlliIl, b == null ? iiliiiIiIIiiiiIi.iIiliIIlIi : b, this.lliIlliIliliIlliIl);
   }

   public boolean Iliilliiilii() {
      return this.lIlIlliIliIlIlliIl;
   }

   public iiliiiIiIIiiiiIi IIIIllIIIl() {
      return this.illIlliIlIilIlliIl;
   }

   // $FF: synthetic method
   private static CallSite lIlIliIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -7088871445102722109L ^ Long.rotateLeft(894639694440056437L, 36) ^ 2685695226776535817L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -736994516079473322L ^ Long.rotateLeft(8014147289102260745L, 17) ^ -7414063169077454513L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -8577669462097854414L ^ Long.rotateLeft(8497647980890544976L, 59) ^ -3939001818516957140L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8116737672451521067L ^ Long.rotateLeft(-5927997984517401502L, 32) ^ -915290861213118263L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3827444566512216355L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 628935889203711820L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7046024104505845419L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4372413383866660082L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 7846221478192332582L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6785941464033504898L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IllIllllIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, illIlIilIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, lilIliilIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIiIllIiIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iIiIlIliIl<invokedynamic>());
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

   public lliiilIiiliiilIi IlIlllIlilIl() {
      return this.liIiIliIliiIiIliIl;
   }

   public iiliiiIiIIiiiiIi IiIIlliIIl() {
      return this.iIiIlliIlIliIlliIl;
   }

   public IIllIIllIllIIl(long pearlIncoming, lliiilIiiliiilIi options, liiilIiliiiilIil cfg, int nether, IlIillllIill self, int lastPosture, int selfClosedFor, boolean targetReadyIn, llilIlIlililIlIl lootNearby, Map<iIlIIIIiIllIIIIi, IilliIIllilliIIl> target, iIlIIIIiIllIIIIi tick, iIlIIIIiIllIIIIi committed, int enemiesWithin8, int stallWindows, boolean combo, double nearestEnemy, boolean ticksSinceOwnPop, IiIililiIili lastLane, iiliiiIiIIiiiiIi threat, float selfSpent) {
      this(pearlIncoming, options, cfg, nether, self, lastPosture, selfClosedFor, targetReadyIn, lootNearby, target, tick, committed, enemiesWithin8, stallWindows, combo, nearestEnemy, ticksSinceOwnPop, lastLane, threat, selfSpent, IIIilIIiiIIi.IIIllllIIlll, iiliiiIiIIiiiiIi.iIiliIIlIi);
   }

   public IlIillllIill Illlllllilll() {
      return this.llliIliIlilliIliIl;
   }

   public boolean liiiIIllIl() {
      return iIlIlllllill(this.liIiIliIliiIiIliIl, this.IIliIliIllIliIliIl);
   }

   public IIIilIIiiIIi llIIlilIIl() {
      return this.IIiIlliIllIiIlliIl;
   }

   public IIllIIllIllIIl(long lootNearby, lliiilIiiliiilIi threat, liiilIiliiiilIil tick, int nether, IlIillllIill breach, int nearestEnemy, int lastPosture, boolean anchor, llilIlIlililIlIl self, Map<iIlIIIIiIllIIIIi, IilliIIllilliIIl> targetReadyIn, iIlIIIIiIllIIIIi target, iIlIIIIiIllIIIIi combo, int selfClosedFor, int stallWindows, boolean pearlIncoming, double options, boolean enemiesWithin8, IiIililiIili cfg, iiliiiIiIIiiiiIi selfSpent, float lastLane, IIIilIIiiIIi committed, iiliiiIiIIiiiiIi ticksSinceOwnPop) {
      this(lootNearby, threat, tick, nether, breach, nearestEnemy, lastPosture, anchor, self, targetReadyIn, target, combo, selfClosedFor, stallWindows, pearlIncoming, options, enemiesWithin8, cfg, selfSpent, lastLane, committed, ticksSinceOwnPop, false);
   }

   public IilliIIllilliIIl IilliliilIIi(iIlIIIIiIllIIIIi l) {
      IilliIIllilliIIl var2 = this.iliiIliIlIiiiIliIl == null ? null : (IilliIIllilliIIl)this.iliiIliIlIiiiIliIl.get(l);
      return var2 != null ? var2 : IilliIIllilliIIl.IliIlllilIi(l, lIlIliIlIl<invokedynamic>());
   }

   // $FF: synthetic method
   private static CallSite illIlIilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(~var4[var5]) - var5))) - var5) >>> 15 | (char)((char)(~((char)((char)(~var4[var5]) - var5))) - var5) << 1) >>> 2 | (char)((char)((char)(~((char)((char)(~var4[var5]) - var5))) - var5) >>> 15 | (char)((char)(~((char)((char)(~var4[var5]) - var5))) - var5) << 1) << 14) + 28981))) ^ '颚'))) << 4 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(~var4[var5]) - var5))) - var5) >>> 15 | (char)((char)(~((char)((char)(~var4[var5]) - var5))) - var5) << 1) >>> 2 | (char)((char)((char)(~((char)((char)(~var4[var5]) - var5))) - var5) >>> 15 | (char)((char)(~((char)((char)(~var4[var5]) - var5))) - var5) << 1) << 14) + 28981))) ^ '颚'))) >>> 12) ^ var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iIlIIIIiIllIIIIi IiIiliIiiiIi() {
      return this.IIIIlliIllIIIlliIl;
   }

   // $FF: synthetic method
   private static CallSite IllIllllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) << 13 | (char)((char)(var4[var5] + var5) ^ var5) >>> 3) + var5) - var5) ^ var5))) >>> 13 | (char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) << 13 | (char)((char)(var4[var5] + var5) ^ var5) >>> 3) + var5) - var5) ^ var5))) << 3) + var5) - '\uddf1') + 19568) ^ var5) >>> 6 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) << 13 | (char)((char)(var4[var5] + var5) ^ var5) >>> 3) + var5) - var5) ^ var5))) >>> 13 | (char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) << 13 | (char)((char)(var4[var5] + var5) ^ var5) >>> 3) + var5) - var5) ^ var5))) << 3) + var5) - '\uddf1') + 19568) ^ var5) << 10) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IIllIIllIllIIl(long combo, lliiilIiiliiilIi self, liiilIiliiiilIil targetReadyIn, int tick, IlIillllIill lastLane, int breach, int ticksSinceOwnPop, boolean target, llilIlIlililIlIl threat, Map<iIlIIIIiIllIIIIi, IilliIIllilliIIl> enemiesWithin8, iIlIIIIiIllIIIIi popPending, iIlIIIIiIllIIIIi nearestEnemy, int pearlIncoming, int selfClosedFor, boolean cfg, double lastPosture, boolean stallWindows, IiIililiIili options, iiliiiIiIIiiiiIi lootNearby, float committed, IIIilIIiiIIi selfSpent, iiliiiIiIIiiiiIi anchor, boolean nether) {
      selfSpent = selfSpent == null ? IIIilIIiiIIi.IIIllllIIlll : selfSpent;
      anchor = anchor == null ? iiliiiIiIIiiiiIi.iIiliIIlIi : anchor;
      this.ilIiIliIlIiIiIliIl = combo;
      this.liIiIliIliiIiIliIl = self;
      this.IIliIliIllIliIliIl = targetReadyIn;
      this.iIliIliIlIlliIliIl = tick;
      this.llliIliIlilliIliIl = lastLane;
      this.IiliIliIlliliIliIl = breach;
      this.iiliIliIlIIiiIliIl = ticksSinceOwnPop;
      this.lIiiIliIliIiiIliIl = target;
      this.IliiIliIllliiIliIl = threat;
      this.iliiIliIlIiiiIliIl = enemiesWithin8;
      this.liiiIliIliiiiIliIl = popPending;
      this.IIIIlliIllIIIlliIl = nearestEnemy;
      this.iIIIlliIlIlIIlliIl = pearlIncoming;
      this.llIIlliIlilIIlliIl = selfClosedFor;
      this.IiIIlliIlliIIlliIl = cfg;
      this.iiIIlliIlIIlIlliIl = lastPosture;
      this.lIlIlliIliIlIlliIl = stallWindows;
      this.IllIlliIllllIlliIl = options;
      this.illIlliIlIilIlliIl = lootNearby;
      this.lilIlliIliilIlliIl = committed;
      this.IIiIlliIllIiIlliIl = selfSpent;
      this.iIiIlliIlIliIlliIl = anchor;
      this.lliIlliIliliIlliIl = nether;
   }

   public long IIIllIIliIIl() {
      return this.ilIiIliIlIiIiIliIl;
   }

   public int Illillliilli() {
      return this.llIIlliIlilIIlliIl;
   }

   public int IIlllIlliIll() {
      return this.iIliIliIlIlliIliIl;
   }
}
