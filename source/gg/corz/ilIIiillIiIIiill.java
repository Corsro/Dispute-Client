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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class ilIIiillIiIIiill {
   private int IlIIiliill;
   private final iIIilIllIlIilIll illilliill;
   private int liiilliill;
   private boolean llIIiliill;
   private IiIilliIil ilIIiliill;
   private int iiiilliill;
   private double lIIIiliill;
   private String IiIIiliill;
   private int Iiiilliill;
   private final int IIiilliill;
   private int liIIiliill;
   private double IIIIiliill;
   private final List<Long> iililliill;
   private final String[] lliilliill;
   private final int lIiilliill;
   private final List<IilIiiililIiii> lililliill;
   private final IliIlIillliIlIil[] Iliilliill;
   private int iIIIiliill;
   private final long lllilliill;
   private int iliilliill;
   private final long Iililliill;
   private final Map<Long, Integer> iIiilliill;

   public long IliIlllilIi() {
      return this.lllilliill;
   }

   // $FF: synthetic method
   private static CallSite liIlliiIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - var5))) ^ 3527) - 14844) << 13 | (char)((char)((char)(-((char)((char)(var4[var5] + var5) - var5))) ^ 3527) - 14844) >>> 3) - 60) + var5) - '뇚') >>> 10 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - var5))) ^ 3527) - 14844) << 13 | (char)((char)((char)(-((char)((char)(var4[var5] + var5) - var5))) ^ 3527) - 14844) >>> 3) - 60) + var5) - '뇚') << 6) - var5) + 20007) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - var5))) ^ 3527) - 14844) << 13 | (char)((char)((char)(-((char)((char)(var4[var5] + var5) - var5))) ^ 3527) - 14844) >>> 3) - 60) + var5) - '뇚') >>> 10 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - var5))) ^ 3527) - 14844) << 13 | (char)((char)((char)(-((char)((char)(var4[var5] + var5) - var5))) ^ 3527) - 14844) >>> 3) - 60) + var5) - '뇚') << 6) - var5) + 20007) << 11))) ^ var5) - var5) << 10 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - var5))) ^ 3527) - 14844) << 13 | (char)((char)((char)(-((char)((char)(var4[var5] + var5) - var5))) ^ 3527) - 14844) >>> 3) - 60) + var5) - '뇚') >>> 10 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - var5))) ^ 3527) - 14844) << 13 | (char)((char)((char)(-((char)((char)(var4[var5] + var5) - var5))) ^ 3527) - 14844) >>> 3) - 60) + var5) - '뇚') << 6) - var5) + 20007) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - var5))) ^ 3527) - 14844) << 13 | (char)((char)((char)(-((char)((char)(var4[var5] + var5) - var5))) ^ 3527) - 14844) >>> 3) - 60) + var5) - '뇚') >>> 10 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - var5))) ^ 3527) - 14844) << 13 | (char)((char)((char)(-((char)((char)(var4[var5] + var5) - var5))) ^ 3527) - 14844) >>> 3) - 60) + var5) - '뇚') << 6) - var5) + 20007) << 11))) ^ var5) - var5) >>> 6) - 13650));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IilIiiililIiii IiIlliIliiIl(long target) {
      Integer var3 = (Integer)this.iIiilliill.get(target);
      return var3 == null ? null : (IilIiiililIiii)this.lililliill.get(var3);
   }

   public void IiIIlliIIl() {
      ++this.iIIIiliill;
   }

   public String IiiIlliiIl() {
      return this.IiIIiliill;
   }

   public boolean IlIillIiilIi() {
      return this.llIIiliill || this.Iilllilliill() == 0;
   }

   public List<Long> lIiiIiIlilli() {
      return this.iililliill;
   }

   public boolean Illillliilli(long tick, String why, int target) {
      Integer var5 = (Integer)this.iIiilliill.get(tick);
      if (var5 != null && this.Iliilliill[var5] != IliIlIillliIlIil.lIIlIIlIil) {
         if (this.Iliilliill[var5] != IliIlIillliIlIil.iIIlIIlIil) {
            ++this.liiilliill;
         }

         if (this.Iliilliill[var5] == IliIlIillliIlIil.IlIlIIlIil) {
            --this.iiiilliill;
         }

         this.Iliilliill[var5] = IliIlIillliIlIil.iIIlIIlIil;
         this.lliilliill[var5] = why == null ? "" : why;
         if (this.iliilliill == var5) {
            this.iliilliill = -1;
         }

         this.liIIiliill = target;
         return true;
      } else {
         return false;
      }
   }

   public boolean iIiIlIliIl() {
      return this.llIIiliill;
   }

   public IiIilliIil lliIliliIl() {
      return this.ilIIiliill;
   }

   public ilIIiillIiIIiill(long lane, iIIilIllIlIilIll steps, long startTick, List<IilIiiililIiii> kind, List<Long> regionKey, int entryCostNodes, int id) {
      long var12 = 4588362095098693512L;
      super();
      this.iIiilliill = new HashMap();
      this.iliilliill = -1;
      this.IiIIiliill = "";
      this.lllilliill = lane;
      this.illilliill = steps;
      this.Iililliill = startTick;
      ArrayList var10 = new ArrayList(kind == null ? List.of() : kind);
      this.lililliill = Collections.unmodifiableList(var10);
      this.iililliill = Collections.unmodifiableList(new ArrayList(regionKey == null ? List.of() : regionKey));
      this.IIiilliill = entryCostNodes;
      this.lIiilliill = id;
      this.liIIiliill = id;
      this.Iliilliill = new IliIlIillliIlIil[var10.size()];
      this.lliilliill = new String[var10.size()];

      for(long var14 = var12 ^ (0L ^ var12) & -1L << 32; (int)(var14 >>> 32) < var10.size(); var14 += 4294967296L) {
         this.Iliilliill[(int)(var14 >>> 32)] = IliIlIillliIlIil.iiiIIIlIil;
         this.iIiilliill.putIfAbsent(((IilIiiililIiii)var10.get((int)(var14 >>> 32))).IliIlllilIi(), (int)(var14 >>> 32));
      }

   }

   public IliIlIillliIlIil IIlllIlliIll(long target) {
      Integer var3 = (Integer)this.iIiilliill.get(target);
      return var3 == null ? null : this.Iliilliill[var3];
   }

   public int IIIllIIliIIl() {
      return this.liIIiliill;
   }

   public long iIlIlllllill() {
      return this.Iililliill;
   }

   public void llIIlilIIl(double degrees) {
      if (degrees > (double)0.0F) {
         this.lIIIiliill += degrees;
      }

   }

   public int Iiiiliiiiiii(long stillValid, int changedCell, Predicate<IilIiiililIiii> chebyshevRadius) {
      long var8 = -8967552160825933118L;
      var8 ^= (0L ^ var8) & -1L << 32;

      for(var8 ^= (0L ^ var8) & -1L >>> 32; (int)var8 < this.Iliilliill.length; var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         if (this.Iliilliill[(int)var8] == IliIlIillliIlIil.iiiIIIlIil) {
            IilIiiililIiii var7 = (IilIiiililIiii)this.lililliill.get((int)var8);
            if ((IIIIllIIIl(stillValid, var7.IliIlllilIi(), changedCell) || IIIIllIIIl(stillValid, var7.liiiIIllIl(), changedCell) || IIIIllIIIl(stillValid, var7.iIlIlllllill(), changedCell)) && !chebyshevRadius.test(var7)) {
               this.Illillliilli(var7.IliIlllilIi(), lIIlliIIll<invokedynamic>(), this.liIIiliill);
               var8 += 4294967296L;
            }
         }
      }

      return (int)(var8 >>> 32);
   }

   public IilIiiililIiii IlIlllIlilIl() {
      long var2 = 3334749035764322104L;
      if (this.iliilliill >= 0) {
         return (IilIiiililIiii)this.lililliill.get(this.iliilliill);
      } else {
         for(long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < this.Iliilliill.length; var4 += 4294967296L) {
            if (this.Iliilliill[(int)(var4 >>> 32)] == IliIlIillliIlIil.iiiIIIlIil) {
               return (IilIiiililIiii)this.lililliill.get((int)(var4 >>> 32));
            }
         }

         return null;
      }
   }

   public int Iliilliiilii(Predicate<IilIiiililIiii> stillValid) {
      long var4 = 3466781772427715983L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for(var4 ^= (0L ^ var4) & -1L >>> 32; (int)var4 < this.Iliilliill.length; var4 ^= (var4 ^ var4 + (long)1) & -1L >>> 32) {
         if (this.Iliilliill[(int)var4] == IliIlIillliIlIil.iiiIIIlIil && !stillValid.test((IilIiiililIiii)this.lililliill.get((int)var4))) {
            this.Illillliilli(((IilIiiililIiii)this.lililliill.get((int)var4)).IliIlllilIi(), lIIlliIIll<invokedynamic>(), this.liIIiliill);
            var4 += 4294967296L;
         }
      }

      return (int)(var4 >>> 32);
   }

   public int IIIilIIiiIIi() {
      return this.iiiilliill;
   }

   // $FF: synthetic method
   private static CallSite lIIlliIIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1232081079569031150L ^ Long.rotateLeft(8426982527196866897L, 56) ^ 330395216131919645L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1574599834920763206L ^ Long.rotateLeft(3023100643469983932L, 45) ^ -6945590731740489657L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 4210585134661299657L ^ Long.rotateLeft(188759240070401098L, 43) ^ -3113090083292909200L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 7057212410016947869L ^ Long.rotateLeft(7943214943901712162L, 63) ^ -7261836583147466192L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 7126421406608129289L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -611965183444156709L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 6832560264869545812L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5792871361903341692L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8605375799924678857L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 9042418132313307463L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IlIllllIll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, ilIllIiIll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, liIlliiIll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIllllIlll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iIlllIllll<invokedynamic>());
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

   public int lilIliilIl() {
      return this.IlIIiliill;
   }

   // $FF: synthetic method
   private static CallSite iIlllIllll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ '둷') - '웯') + '땛'))) >>> 13 | (char)(-((char)((char)((char)(var4[var5] ^ '둷') - '웯') + '땛'))) << 3) ^ 19260) - var5))) + var5) - '\ue020') + '훚') << 11 | (char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ '둷') - '웯') + '땛'))) >>> 13 | (char)(-((char)((char)((char)(var4[var5] ^ '둷') - '웯') + '땛'))) << 3) ^ 19260) - var5))) + var5) - '\ue020') + '훚') >>> 5))))) << 2 | (char)(~((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ '둷') - '웯') + '땛'))) >>> 13 | (char)(-((char)((char)((char)(var4[var5] ^ '둷') - '웯') + '땛'))) << 3) ^ 19260) - var5))) + var5) - '\ue020') + '훚') << 11 | (char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ '둷') - '웯') + '땛'))) >>> 13 | (char)(-((char)((char)((char)(var4[var5] ^ '둷') - '웯') + '땛'))) << 3) ^ 19260) - var5))) + var5) - '\ue020') + '훚') >>> 5))))) >>> 14) - 'ꈴ'))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int illIlIilIl() {
      return this.iIIIiliill;
   }

   public List<IilIiiililIiii> IilliliilIIi() {
      return this.lililliill;
   }

   public void IiIiliIiiiIi(long target, int tick) {
      Integer var4 = (Integer)this.iIiilliill.get(target);
      if (var4 != null) {
         if (this.Iliilliill[var4] == IliIlIillliIlIil.iiiIIIlIil || this.Iliilliill[var4] == IliIlIillliIlIil.IIIlIIlIil) {
            if (this.iliilliill >= 0 && this.iliilliill != var4 && this.Iliilliill[this.iliilliill] == IliIlIillliIlIil.IIIlIIlIil) {
               this.Iliilliill[this.iliilliill] = IliIlIillliIlIil.iiiIIIlIil;
            }

            this.Iliilliill[var4] = IliIlIillliIlIil.IIIlIIlIil;
            this.iliilliill = var4;
            this.liIIiliill = tick;
         }
      }
   }

   public boolean Illlllllilll(long target) {
      return this.iIiilliill.containsKey(target);
   }

   public static boolean IIIIllIIIl(long radius, long b, int a) {
      return Math.abs(llIiIiililIiIiil.IiIlliIliiIl(radius) - llIiIiililIiIiil.IiIlliIliiIl(b)) <= a && Math.abs(llIiIiililIiIiil.IIlllIlliIll(radius) - llIiIiililIiIiil.IIlllIlliIll(b)) <= a && Math.abs(llIiIiililIiIiil.Illlllllilll(radius) - llIiIiililIiIiil.Illlllllilll(b)) <= a;
   }

   public int iliIiiliiiii() {
      return this.lIiilliill;
   }

   public boolean IIlilIliiIli(long tick, int target) {
      Integer var4 = (Integer)this.iIiilliill.get(tick);
      if (var4 == null) {
         return false;
      } else {
         if (this.Iliilliill[var4] != IliIlIillliIlIil.lIIlIIlIil) {
            ++this.Iiiilliill;
         }

         if (this.Iliilliill[var4] == IliIlIillliIlIil.iIIlIIlIil) {
            --this.liiilliill;
         }

         if (this.Iliilliill[var4] == IliIlIillliIlIil.IlIlIIlIil) {
            --this.iiiilliill;
         }

         this.Iliilliill[var4] = IliIlIillliIlIil.lIIlIIlIil;
         this.lliilliill[var4] = null;
         if (this.iliilliill == var4) {
            this.iliilliill = -1;
         }

         this.liIIiliill = target;
         return true;
      }
   }

   public void iiIIlIIlIl() {
      ++this.IlIIiliill;
   }

   public double lIlIliIlIl() {
      return this.IIIIiliill;
   }

   public iIIilIllIlIilIll liiiIIllIl() {
      return this.illilliill;
   }

   public int IIillIiliIil() {
      return this.lililliill.size();
   }

   public void IIiIllIiIl(IiIilliIil tick, String detail, int reason) {
      if (!this.llIIiliill) {
         this.llIIiliill = true;
         this.ilIIiliill = tick;
         this.IiIIiliill = detail == null ? "" : detail;
         if (this.iliilliill >= 0 && this.Iliilliill[this.iliilliill] == IliIlIillliIlIil.IIIlIIlIil) {
            this.Iliilliill[this.iliilliill] = IliIlIillliIlIil.iiiIIIlIil;
         }

         this.iliilliill = -1;
         this.liIIiliill = reason;
      }
   }

   public boolean Iilililiiili(long target, String why) {
      Integer var4 = (Integer)this.iIiilliill.get(target);
      if (var4 != null && this.Iliilliill[var4] != IliIlIillliIlIil.lIIlIIlIil) {
         if (this.Iliilliill[var4] != IliIlIillliIlIil.IlIlIIlIil) {
            ++this.iiiilliill;
         }

         if (this.Iliilliill[var4] == IliIlIillliIlIil.iIIlIIlIil) {
            --this.liiilliill;
         }

         this.Iliilliill[var4] = IliIlIillliIlIil.IlIlIIlIil;
         this.lliilliill[var4] = why == null ? "" : why;
         if (this.iliilliill == var4) {
            this.iliilliill = -1;
         }

         return true;
      } else {
         return false;
      }
   }

   public int Iiilliiliiil() {
      return this.liiilliill;
   }

   public int Ililllililil() {
      return this.Iiiilliill;
   }

   public String iiiIlIIIll(int tick) {
      return String.format(Locale.ROOT, lIIlliIIll<invokedynamic>(), this.lllilliill, this.illilliill, this.Iililliill, this.iIiilliill.size(), this.lililliill.size(), this.Iiiilliill, this.IIiilliill, this.IIIIiliill, this.lIIIiliill, this.iIIIiliill, this.IlIIiliill, this.liiilliill, Math.max(0, tick - this.lIiilliill) / 20, this.llIIiliill && this.ilIIiliill != null ? this.ilIIiliill.name() : lIIlliIIll<invokedynamic>());
   }

   public void iIIIlIlIIl(double blocks) {
      if (blocks > (double)0.0F) {
         this.IIIIiliill += blocks;
      }

   }

   public String IIiilIiiiIii(long target) {
      Integer var3 = (Integer)this.iIiilliill.get(target);
      return var3 == null ? null : this.lliilliill[var3];
   }

   public int Iilllilliill() {
      long var6 = 8563400001382309494L;
      long var8 = -1005254481102147298L;
      var6 ^= (0L ^ var6) & -1L << 32;
      IliIlIillliIlIil[] var2 = this.Iliilliill;
      var6 ^= ((long)var2.length ^ var6) & -1L >>> 32;

      for(long var12 = var8 ^ (0L ^ var8) & -1L << 32; (int)(var12 >>> 32) < (int)var6; var12 += 4294967296L) {
         IliIlIillliIlIil var5 = var2[(int)(var12 >>> 32)];
         if (var5 == IliIlIillliIlIil.iiiIIIlIil || var5 == IliIlIillliIlIil.IIIlIIlIil) {
            var6 += 4294967296L;
         }
      }

      return (int)(var6 >>> 32);
   }

   // $FF: synthetic method
   private static CallSite IIllllIlll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + '뙤') + 22711) >>> 14 | (char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + '뙤') + 22711) << 2)) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + '뙤') + 22711) >>> 14 | (char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + '뙤') + 22711) << 2)) << 14))) ^ var5))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite ilIllIiIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] + var5))) - var5) >>> 6 | (char)((char)(-((char)(var4[var5] + var5))) - var5) << 10) - '츊'))) - var5) << 7 | (char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] + var5))) - var5) >>> 6 | (char)((char)(-((char)(var4[var5] + var5))) - var5) << 10) - '츊'))) - var5) >>> 9) - '\ue609'))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIllllIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)var4[var5] - var5) + 24966) ^ 21151) << 11 | (char)((char)((char)((char)var4[var5] - var5) + 24966) ^ 21151) >>> 5) - var5) >>> 10 | (char)((char)((char)((char)((char)((char)var4[var5] - var5) + 24966) ^ 21151) << 11 | (char)((char)((char)((char)var4[var5] - var5) + 24966) ^ 21151) >>> 5) - var5) << 6))) ^ var5) << 6 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)var4[var5] - var5) + 24966) ^ 21151) << 11 | (char)((char)((char)((char)var4[var5] - var5) + 24966) ^ 21151) >>> 5) - var5) >>> 10 | (char)((char)((char)((char)((char)((char)var4[var5] - var5) + 24966) ^ 21151) << 11 | (char)((char)((char)((char)var4[var5] - var5) + 24966) ^ 21151) >>> 5) - var5) << 6))) ^ var5) >>> 10) - 13796) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public double IllIllllIl() {
      return this.lIIIiliill;
   }
}
