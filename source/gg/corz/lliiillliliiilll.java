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
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.function.LongSupplier;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class lliiillliliiilll {
   private final ArrayList<ilIIiIIiIiIIiIIi> llIIlllill;
   private final ArrayList<illIIIilIilIIIil> iiiiIllill;
   private int IiiIlllill;
   private liiIiIlliiiIiIll iliiIllill;
   private int illIlllill;
   private int iIIIlllill;
   private long ilIIlllill;
   private int iIlIlllill;
   private int iIiIlllill;
   private int lliIlllill;
   private int iiIIlllill;
   private int lllIlllill;
   private int IllIlllill;
   private int iliIlllill;
   private int liIIlllill;
   private Iiilliiliiil liiiIllill;
   private int IliIlllill;
   private final HashMap<Long, Long> IIIIlllill;
   private int lIiIlllill;
   private String iilIlllill;
   private final HashSet<Long> lIIIlllill;
   private lliIllililiIllil lilIlllill;
   private int lIlIlllill;
   private int IiiiIllill;
   private ilIIiIIiIiIIiIIi IlIIlllill;
   private int IIiIlllill;
   private boolean IilIlllill;
   private long IiIIlllill;
   private int IIlIlllill;

   public String IllIllllIl() {
      return this.iilIlllill;
   }

   public void Illlllllilll() {
      this.IIlllIlliIll();
      this.IiiiIllill = Integer.MIN_VALUE;
      this.liiiIllill = null;
      this.lilIlllill = null;
      this.iilIlllill = Iillllilll<invokedynamic>();
      this.iiIIlllill = this.IIlIlllill = this.lIlIlllill = this.iIlIlllill = this.IllIlllill = this.lllIlllill = this.illIlllill = 0;
      this.IIiIlllill = this.lIiIlllill = this.iIiIlllill = this.IliIlllill = this.lliIlllill = this.iliIlllill = this.IiiIlllill = 0;
      this.IilIlllill = false;
   }

   public int Iiiiliiiiiii() {
      return this.IIlIlllill;
   }

   public ilIIiIIiIiIIiIIi Illillliilli() {
      return this.IlIIlllill;
   }

   public int Iliilliiilii() {
      return this.iIIIlllill;
   }

   public int llIIlilIIl() {
      return this.iiIIlllill;
   }

   public int IIiIllIiIl() {
      return this.lIiIlllill;
   }

   public liiIiIlliiiIiIll IIillIiliIil() {
      return this.iliiIllill;
   }

   public int lilIliilIl() {
      return this.IIiIlllill;
   }

   public int IiiIlliiIl() {
      return this.lliIlllill;
   }

   public boolean Ililllililil() {
      return this.iliiIllill == liiIiIlliiiIiIll.lIilililll || this.iliiIllill == liiIiIlliiiIiIll.iIilililll;
   }

   public int lliIliliIl() {
      return this.IliIlllill;
   }

   public void IiIlliIliiIl(String why) {
      if (this.Ililllililil() || this.Iiilliiliiil()) {
         ++this.iIiIlllill;
      }

      this.iliiIllill = liiIiIlliiiIiIll.ililililll;
      this.IlIIlllill = null;
      this.llIIlllill.clear();
      this.iilIlllill = Iillllilll<invokedynamic>() + why;
   }

   public int iIIIlIlIIl() {
      return this.iIlIlllill;
   }

   // $FF: synthetic method
   private static CallSite Iillllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1256212472323603707L ^ Long.rotateLeft(-2250020286455140073L, 25) ^ 1181011165745195731L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -364165380962644203L ^ Long.rotateLeft(-9163642693015848967L, 27) ^ -3146312310050093822L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -1090216671647181154L ^ Long.rotateLeft(-8052112305558082226L, 30) ^ -5662782568116506547L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 826274034300048995L ^ Long.rotateLeft(8496835548605200614L, 42) ^ 8226901147021743234L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8804745017780619806L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 3892211282512118774L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6968366841193990790L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -4475283100605118889L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -1241771645762656985L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8259988419665670868L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iilllIIill<invokedynamic>());
      var7.init(new SecretKeySpec(var5, lIilliIill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Ilillllill<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, ilillIiill<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(liilliiill<invokedynamic>());
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

   public int IIIIllIIIl() {
      return this.lIlIlllill;
   }

   public boolean IIIilIIiiIIi() {
      return this.iliiIllill == liiIiIlliiiIiIll.llilililll;
   }

   public void iliIiiliiiii() {
      this.iilIlllill = Iillllilll<invokedynamic>();
   }

   public List<Long> illIlIilIl() {
      return new ArrayList(this.lIIIlllill);
   }

   public int iIiIlIliIl() {
      return this.iIiIlllill;
   }

   public lllIiIllillIiIll Iilllilliill(illIliIilIli prover, iiIIIIliIIlIIIli ctx, iIIiIlllIlIiIlll feet, lllilIlillilIl ledger, long nanos, int b, LongSupplier tick) {
      long var17 = -2434168915334557124L;
      long var19 = 9031369338688336141L;
      if (!this.Ililllililil()) {
         return new lllIiIllillIiIll(this.iliiIllill, 0, 0, 0, false, (String)null);
      } else {
         String var9 = null;
         if (this.iliiIllill == liiIiIlliiiIiIll.lIilililll) {
            this.iliiIllill = liiIiIlliiiIiIll.iIilililll;
            var9 = Iillllilll<invokedynamic>();
         }

         var17 ^= (0L ^ var17) & -1L << 32;
         var17 ^= (0L ^ var17) & -1L >>> 32;
         var19 ^= (0L ^ var19) & -1L << 32;
         var19 ^= (0L ^ var19) & -1L >>> 32;

         while(this.iIIIlllill < this.iiiiIllill.size()) {
            if ((int)(var17 >>> 32) >= prover.IliIlllilIi() || tick.getAsLong() > prover.iIlIlllllill()) {
               var19 ^= (1L ^ var19) & -1L >>> 32;
               break;
            }

            illIIIilIilIIIil var14 = (illIIIilIilIIIil)this.iiiiIllill.get(this.iIIIlllill);
            if (ctx.lIiiIiIlilli(this.IiiiIllill, var14.liiiIIllIl(), feet) != null) {
               var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32;
               ++this.iIIIlllill;
            } else {
               IllIiillllIiil var15 = ledger.prove(var14, (int)(var19 >>> 32) < prover.liiiIIllIl());
               if (var15 == null) {
                  var15 = IllIiillllIiil.iIilliIliIlilliIli;
               }

               if (var15.Illlllllilll()) {
                  var19 ^= (1L ^ var19) & -1L >>> 32;
                  break;
               }

               var17 += 4294967296L;
               if (var15.IIlllIlliIll()) {
                  var19 += 4294967296L;
               }

               if (var15.IilliliilIIi()) {
                  ++this.iIlIlllill;
                  ilIIiIIiIiIIiIIi var16 = new ilIIiIIiIiIIiIIi(var14.IliIlllilIi(), var14.liiiIIllIl(), var15.iliIiiliiiii(), var15.IIIllIIliIIl(), var15.IlIlllIlilIl(), nanos);
                  this.llIIlllill.add(var16);
                  if (this.IlIIlllill == null || var15.IlIlllIlilIl() < this.IlIIlllill.lIiiIiIlilli()) {
                     this.IlIIlllill = var16;
                  }
               } else {
                  ++this.lIlIlllill;
                  ctx.iIlIlllllill(this.IiiiIllill, var14.liiiIIllIl(), var15.lIiiIiIlilli(), var15.iliIiiliiiii(), nanos, var15.IiIlliIliiIl(), b, var15.Iilllilliill());
               }

               ++this.iIIIlllill;
            }
         }

         this.IIlIlllill += (int)(var17 >>> 32);
         this.IiiIlllill += (int)(var17 >>> 32);
         this.IllIlllill += (int)var17;
         ++this.iiIIlllill;
         this.lllIlllill = (int)(var17 >>> 32);
         this.illIlllill = (int)var17;
         this.IilIlllill = (boolean)((int)var19);
         if (this.IlIIlllill != null) {
            this.iliiIllill = liiIiIlliiiIiIll.Ililililll;
            ++this.lliIlllill;
            var9 = Iillllilll<invokedynamic>();
         } else if (this.iIIIlllill >= this.iiiiIllill.size()) {
            this.iliiIllill = liiIiIlliiiIiIll.llilililll;
            ++this.lIiIlllill;
            var9 = Iillllilll<invokedynamic>();
         } else if ((int)var19 != 0) {
            ++this.IliIlllill;
         }

         if (var9 != null) {
            this.iilIlllill = var9;
         }

         return new lllIiIllillIiIll(this.iliiIllill, (int)(var17 >>> 32), (int)var17, (int)(var19 >>> 32), (boolean)((int)var19), var9);
      }
   }

   private int IilliliilIIi(List<long[]> feet, long entries) {
      long var9 = -1558715397882507525L;
      var9 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(entries) << 32 ^ var9) & -1L << 32;
      var9 ^= ((long)llIiIiililIiIiil.Illlllllilll(entries) ^ var9) & -1L >>> 32;
      ArrayList var6 = new ArrayList();

      for(long[] var8 : feet) {
         if (this.lIIIlllill.add(var8[1])) {
            var6.add(new illIIIilIilIIIil(var8[0], var8[1]));
            this.IIIIlllill.put(var8[1], var8[0]);
         }
      }

      var6.sort(Comparator.comparingInt((fz) -> Math.max(Math.abs(llIiIiililIiIiil.IiIlliIliiIl(fz.liiiIIllIl()) - fx), Math.abs(llIiIiililIiIiil.Illlllllilll(fz.liiiIIllIl()) - c))).thenComparingInt((c) -> llIiIiililIiIiil.IiIlliIliiIl(c.liiiIIllIl())).thenComparingInt((c) -> llIiIiililIiIiil.Illlllllilll(c.liiiIIllIl())));
      this.iiiiIllill.addAll(var6);
      return var6.size();
   }

   public void IIIllIIliIIl(long why, String failedTop) {
      if (this.iliiIllill != liiIiIlliiiIiIll.ililililll && this.iliiIllill != liiIiIlliiiIiIll.IIilililll) {
         this.llIIlllill.removeIf((failedTopx) -> failedTopx.liiiIIllIl() == why);
         this.IlIIlllill = null;

         for(ilIIiIIiIiIIiIIi var5 : this.llIIlllill) {
            if (this.IlIIlllill == null || var5.lIiiIiIlilli() < this.IlIIlllill.lIiiIiIlilli()) {
               this.IlIIlllill = var5;
            }
         }

         if (this.IlIIlllill != null) {
            this.iliiIllill = liiIiIlliiiIiIll.Ililililll;
            ++this.lliIlllill;
            ++this.iliIlllill;
            this.iilIlllill = Iillllilll<invokedynamic>() + failedTop + Iillllilll<invokedynamic>();
         } else {
            this.iliiIllill = this.iIIIlllill < this.iiiiIllill.size() ? liiIiIlliiiIiIll.iIilililll : liiIiIlliiiIiIll.llilililll;
            if (this.iliiIllill == liiIiIlliiiIiIll.llilililll) {
               ++this.lIiIlllill;
            }

            ++this.iliIlllill;
            this.iilIlllill = Iillllilll<invokedynamic>() + failedTop;
         }
      }
   }

   public Iiilliiliiil IIlilIliiIli() {
      return this.liiiIllill;
   }

   // $FF: synthetic method
   private static CallSite liilliiill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-var4[var5]) ^ '삮') + var5) ^ 'ꡏ'))) << 12 | (char)(-((char)((char)((char)((char)(-var4[var5]) ^ '삮') + var5) ^ 'ꡏ'))) >>> 4) - 20374) ^ var5) - '롛') - var5) - '𥳐') ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IIlllIlliIll() {
      this.iliiIllill = liiIiIlliiiIiIll.IIilililll;
      this.IlIIlllill = null;
      this.llIIlllill.clear();
      this.iiiiIllill.clear();
      this.IIIIlllill.clear();
      this.lIIIlllill.clear();
      this.iIIIlllill = 0;
      this.iilIlllill = Iillllilll<invokedynamic>();
   }

   public String ilIllIiIll() {
      return Iillllilll<invokedynamic>() + this.IIiIlllill + Iillllilll<invokedynamic>() + this.lIiIlllill + Iillllilll<invokedynamic>() + this.iIiIlllill + Iillllilll<invokedynamic>() + this.IliIlllill + Iillllilll<invokedynamic>() + this.iliIlllill + Iillllilll<invokedynamic>() + this.lliIlllill + Iillllilll<invokedynamic>() + this.IiiIlllill;
   }

   public void liiiIIllIl(Iiilliiliiil d) {
      if (d != null && d.IiiiIlliiiIl == this.IiiiIllill) {
         this.liiiIllill = d;
      }

   }

   public String IlIllllIll() {
      return Iillllilll<invokedynamic>() + (this.IiiiIllill == Integer.MIN_VALUE ? Iillllilll<invokedynamic>() : String.valueOf(this.IiiiIllill)) + Iillllilll<invokedynamic>() + this.iliiIllill + Iillllilll<invokedynamic>() + this.iiiiIllill.size() + Iillllilll<invokedynamic>() + this.iIIIlllill + Iillllilll<invokedynamic>() + this.lllIlllill + Iillllilll<invokedynamic>() + this.IIlIlllill + Iillllilll<invokedynamic>() + this.iIlIlllill + Iillllilll<invokedynamic>() + this.iiIIlllill + Iillllilll<invokedynamic>() + this.IilIlllill + Iillllilll<invokedynamic>() + this.illIlllill + Iillllilll<invokedynamic>() + (this.lilIlllill == null ? Iillllilll<invokedynamic>() : this.lilIlllill);
   }

   public void lIiiIiIlilli(Collection<Long> why, lliIllililiIllil tops) {
      if (!why.isEmpty() && this.IiiiIllill != Integer.MIN_VALUE) {
         for(long var4 : why) {
            Long var6 = (Long)this.IIIIlllill.get(var4);
            if (var6 != null) {
               this.iiiiIllill.add(new illIIIilIilIIIil(var6, var4));
            }
         }

         if (this.iliiIllill == liiIiIlliiiIiIll.llilililll || this.iliiIllill == liiIiIlliiiIiIll.Ililililll || this.iliiIllill == liiIiIlliiiIiIll.ililililll) {
            this.iliiIllill = liiIiIlliiiIiIll.iIilililll;
            ++this.iliIlllill;
         }

         this.lilIlllill = tops;
         this.iilIlllill = Iillllilll<invokedynamic>() + tops;
      }
   }

   public int IIiilIiiiIii() {
      return this.iiiiIllill.size();
   }

   public lliIllililiIllil lIlIliIlIl() {
      return this.lilIlllill;
   }

   public int iiiIlIIIll() {
      return this.iliIlllill;
   }

   // $FF: synthetic method
   private static CallSite ilillIiill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)(~((char)((char)(-((char)(~((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) ^ 21415))))) ^ 6381))) - var5))) - var5) - 21216));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iilllIIill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(~((char)(-var4[var5]))))) ^ var5))) - 29004) >>> 7 | (char)((char)(~((char)((char)(-((char)(~((char)(-var4[var5]))))) ^ var5))) - 29004) << 9) + '顉') ^ 28658) - '\ue58c') ^ var5) ^ 26153) + var5))) - var5) << 3 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(~((char)(-var4[var5]))))) ^ var5))) - 29004) >>> 7 | (char)((char)(~((char)((char)(-((char)(~((char)(-var4[var5]))))) ^ var5))) - 29004) << 9) + '顉') ^ 28658) - '\ue58c') ^ var5) ^ 26153) + var5))) - var5) >>> 13) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IlIlllIlilIl(String why) {
      this.IIIllIIliIIl(Long.MIN_VALUE, why);
   }

   // $FF: synthetic method
   private static CallSite Ilillllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - '閕') - 10385) ^ '키') - var5) << 2 | (char)((char)((char)((char)(var4[var5] - '閕') - 10385) ^ '키') - var5) >>> 14))) - 13721) << 12 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - '閕') - 10385) ^ '키') - var5) << 2 | (char)((char)((char)((char)(var4[var5] - '閕') - 10385) ^ '키') - var5) >>> 14))) - 13721) >>> 4) >>> 13 | (char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - '閕') - 10385) ^ '키') - var5) << 2 | (char)((char)((char)((char)(var4[var5] - '閕') - 10385) ^ '키') - var5) >>> 14))) - 13721) << 12 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - '閕') - 10385) ^ '키') - var5) << 2 | (char)((char)((char)((char)(var4[var5] - '閕') - 10385) ^ '키') - var5) >>> 14))) - 13721) >>> 4) << 3) - var5) + 30715) + 20114) - '꽙'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IlIillIiilIi(int y) {
      return this.IiiiIllill == y && (this.Ililllililil() || this.Iiilliiliiil() || this.IIIilIIiiIIi());
   }

   public int iIlIlllllill(List<long[]> entries, long feet) {
      long var5 = -5527929440500413364L;
      if (!this.IlIillIiilIi(this.IiiiIllill)) {
         return 0;
      } else {
         var5 ^= ((long)this.IilliliilIIi(entries, feet) << 32 ^ var5) & -1L << 32;
         if ((int)(var5 >>> 32) > 0 && this.iliiIllill == liiIiIlliiiIiIll.llilililll) {
            this.iliiIllill = liiIiIlliiiIiIll.iIilililll;
            ++this.iliIlllill;
            this.lilIlllill = lliIllililiIllil.IIlIiliIil;
            this.iilIlllill = Iillllilll<invokedynamic>();
         }

         return (int)(var5 >>> 32);
      }
   }

   public int Iilililiiili() {
      return this.llIIlllill.size();
   }

   public int IiIiliIiiiIi() {
      return this.IiiiIllill;
   }

   public long iiIIlIIlIl() {
      return this.IiIIlllill;
   }

   // $FF: synthetic method
   private static CallSite lIilliIill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) ^ var5) + 15010) >>> 15 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) ^ var5) + 15010) << 1) ^ var5) >>> 15 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) ^ var5) + 15010) >>> 15 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) ^ var5) + 15010) << 1) ^ var5) << 1) + 11528) + var5))) + var5))) ^ var5) + '駷') >>> 2 | (char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) ^ var5) + 15010) >>> 15 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) ^ var5) + 15010) << 1) ^ var5) >>> 15 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) ^ var5) + 15010) >>> 15 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) ^ var5) + 15010) << 1) ^ var5) << 1) + 11528) + var5))) + var5))) ^ var5) + '駷') << 14) - '隟') + 5325) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IliIlllilIi(Iiilliiliiil d, List<long[]> revision, long tick, int entries, long feet) {
      if (this.Ililllililil()) {
         this.IiIlliIliiIl(Iillllilll<invokedynamic>());
      }

      this.iliiIllill = liiIiIlliiiIiIll.lIilililll;
      this.IiiiIllill = d.IiiiIlliiiIl;
      this.liiiIllill = d;
      this.iiiiIllill.clear();
      this.IIIIlllill.clear();
      this.lIIIlllill.clear();
      this.iIIIlllill = 0;
      this.IlIIlllill = null;
      this.llIIlllill.clear();
      this.ilIIlllill = tick;
      this.liIIlllill = entries;
      this.IiIIlllill = feet;
      this.iiIIlllill = this.IIlIlllill = this.lIlIlllill = this.iIlIlllill = this.IllIlllill = this.lllIlllill = this.illIlllill = 0;
      this.IilIlllill = false;
      this.lilIlllill = null;
      this.iilIlllill = Iillllilll<invokedynamic>();
      ++this.IIiIlllill;
      this.IilliliilIIi(revision, tick);
   }

   public boolean Iiilliiliiil() {
      return this.iliiIllill == liiIiIlliiiIiIll.Ililililll && this.IlIIlllill != null;
   }

   public int lIIlliIIll() {
      return this.IiiIlllill;
   }

   public lliiillliliiilll() {
      this.iliiIllill = liiIiIlliiiIiIll.IIilililll;
      this.IiiiIllill = Integer.MIN_VALUE;
      this.iiiiIllill = new ArrayList();
      this.IIIIlllill = new HashMap();
      this.lIIIlllill = new HashSet();
      this.llIIlllill = new ArrayList();
      this.iilIlllill = Iillllilll<invokedynamic>();
   }

   public int IiIIlliIIl() {
      return this.liIIlllill;
   }
}
