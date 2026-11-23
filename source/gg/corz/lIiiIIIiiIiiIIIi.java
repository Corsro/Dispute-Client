package gg.corz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class lIiiIIIiiIiiIIIi {
   private int IlIlIlliil = 0;
   private int iiiIIlliil = 0;
   private int lIIlIlliil = 0;
   private final List<ilIlIIilIiIlIIil> iilIIlliil = new ArrayList();
   private int llllIlliil = Integer.MAX_VALUE;
   private int IiIlIlliil = 0;
   private final int[] iIiIIlliil = new int[148];
   private int iIIlIlliil = 0;
   private int liIlIlliil = 0;
   private final int[] IIiIIlliil = new int[lIlliIIiiIlliIIi.values().length];
   private int ilIlIlliil = 0;
   private boolean IiiIIlliil = false;
   private int IillIlliil = Integer.MIN_VALUE;
   private int liiIIlliil = 0;
   private int lIllIlliil = 0;
   private int IlllIlliil = Integer.MAX_VALUE;
   private int IIIlIlliil = 0;
   private int IIllIlliil = 0;
   private int illlIlliil = Integer.MIN_VALUE;
   private long iliIIlliil = 0L;
   private final int[] lIiIIlliil = new int[lIlliIIiiIlliIIi.values().length];
   private final Set<Long> lliIIlliil = new HashSet();
   private int iIllIlliil = Integer.MAX_VALUE;
   private int llIlIlliil = 0;
   private int iiIlIlliil = 0;
   private int lillIlliil = Integer.MIN_VALUE;
   private final Set<Integer> IliIIlliil = new HashSet();

   public void iliIiiliiiii(lIiiIIIiiIiiIIIi o) {
      for(ilIlIIilIiIlIIil var3 : o.iilIIlliil) {
         this.liiiIIllIl(var3);
      }

      this.liiIIlliil += o.liiIIlliil;
      this.liIlIlliil = Math.max(this.liIlIlliil, o.liIlIlliil);
      this.iiIlIlliil = Math.max(this.iiIlIlliil, o.iiIlIlliil);
      this.IIllIlliil = Math.max(this.IIllIlliil, o.IIllIlliil);
      this.lIllIlliil = Math.max(this.lIllIlliil, o.lIllIlliil);
   }

   public int IIlilIliiIli() {
      return this.ilIlIlliil;
   }

   public void liiiIIllIl(ilIlIIilIiIlIIil c) {
      long var5 = 2860806055111453973L;
      this.iilIIlliil.add(c);
      var5 ^= ((long)c.IiIiIlIIil.ordinal() << 32 ^ var5) & -1L << 32;
      int var10002 = this.IIiIIlliil[(int)(var5 >>> 32)]++;
      int[] var10000 = this.lIiIIlliil;
      var10000[(int)(var5 >>> 32)] += c.liIiIlIIil;
      if (c.IlliIlIIil > 0 && c.IlliIlIIil < 148) {
         var10002 = this.iIiIIlliil[c.IlliIlIIil]++;
      }

      if (c.iIliIlIIil != 0) {
         this.IliIIlliil.add(c.iIliIlIIil);
      }

      if (c.iliIiiliiiii(1)) {
         ++this.iiiIIlliil;
      }

      if (c.iliIiiliiiii(2)) {
         ++this.IIIlIlliil;
      }

      if (c.iliIiiliiiii(8)) {
         ++this.lIIlIlliil;
      }

      if (c.iliIiiliiiii(16)) {
         ++this.iIIlIlliil;
      }

      if (c.iliIiiliiiii(32)) {
         ++this.IlIlIlliil;
      }

      if (c.iliIiiliiiii(128)) {
         ++this.llIlIlliil;
      }

      if (c.iliIiiliiiii(256)) {
         ++this.ilIlIlliil;
      }

      if (c.iliIiiliiiii(16) && c.IiIiIlIIil == lIlliIIiiIlliIIi.IIiilliiil) {
         ++this.IiIlIlliil;
      }

      long var3 = IliIlllilIi(c.IlIiIlIIil >> 4, c.ilIiIlIIil >> 4);
      if (!this.IiiIIlliil || var3 != this.iliIIlliil) {
         this.lliIIlliil.add(var3);
         this.iliIIlliil = var3;
         this.IiiIIlliil = true;
      }

      if (c.IlIiIlIIil < this.iIllIlliil) {
         this.iIllIlliil = c.IlIiIlIIil;
      }

      if (c.IlIiIlIIil > this.illlIlliil) {
         this.illlIlliil = c.IlIiIlIIil;
      }

      if (c.llIiIlIIil < this.IlllIlliil) {
         this.IlllIlliil = c.llIiIlIIil;
      }

      if (c.llIiIlIIil > this.IillIlliil) {
         this.IillIlliil = c.llIiIlIIil;
      }

      if (c.ilIiIlIIil < this.llllIlliil) {
         this.llllIlliil = c.ilIiIlIIil;
      }

      if (c.ilIiIlIIil > this.lillIlliil) {
         this.lillIlliil = c.ilIiIlIIil;
      }

   }

   public int Iiiiliiiiiii() {
      return this.IIllIlliil;
   }

   public double lliIliliIl() {
      return (double)(this.llllIlliil + this.lillIlliil) / (double)2.0F;
   }

   public int IIIIllIIIl() {
      return this.lIllIlliil;
   }

   public int Iilllilliill() {
      return this.IliIIlliil.size();
   }

   public int IIillIiliIil() {
      return this.liiIIlliil;
   }

   public int Iliilliiilii() {
      return this.iiIlIlliil;
   }

   public double iIiIlIliIl() {
      return (double)(this.IlllIlliil + this.IillIlliil) / (double)2.0F;
   }

   public int IIIilIIiiIIi() {
      return this.iIIlIlliil;
   }

   public void iIlIlllllill(int n) {
      this.liiIIlliil += n;
   }

   public int IiIiliIiiiIi() {
      return this.llIlIlliil;
   }

   public int iiiIlIIIll() {
      return this.IIiIIlliil[lIlliIIiiIlliIIi.IIiilliiil.ordinal()] + this.IIiIIlliil[lIlliIIiiIlliIIi.lIiilliiil.ordinal()] + this.IIiIIlliil[lIlliIIiiIlliIIi.iIiilliiil.ordinal()] + this.IIiIIlliil[lIlliIIiiIlliIIi.Iliilliiil.ordinal()] + this.IIiIIlliil[lIlliIIiiIlliIIi.lliilliiil.ordinal()] + this.IIiIIlliil[lIlliIIiiIlliIIi.iiiilliiil.ordinal()] + this.IIiIIlliil[lIlliIIiiIlliIIi.IIIIiliiil.ordinal()] + this.IIiIIlliil[lIlliIIiiIlliIIi.iliilliiil.ordinal()];
   }

   public double lIIlliIIll() {
      long var3 = -4293630549788511335L;
      var3 ^= ((long)this.iiiIlIIIll() << 32 ^ var3) & -1L << 32;
      var3 ^= ((long)Math.min(this.liiIIlliil, (int)(var3 >>> 32) * 4 + 16) ^ var3) & -1L >>> 32;
      return (double)((int)var3) / (double)((int)var3 + (int)(var3 >>> 32) + 1);
   }

   public int Ililllililil() {
      return this.iiiIIlliil;
   }

   public int iiIIlIIlIl() {
      return this.illlIlliil;
   }

   public List<ilIlIIilIiIlIIil> IIIllIIliIIl() {
      return this.iilIIlliil;
   }

   public int IllIllllIl() {
      return this.IillIlliil;
   }

   public int IIlllIlliIll(lIlliIIiiIlliIIi k) {
      return this.lIiIIlliil[k.ordinal()];
   }

   public int Illlllllilll(int family) {
      return family > 0 && family < 148 ? this.iIiIIlliil[family] : 0;
   }

   public int IIiilIiiiIii() {
      return this.liIlIlliil;
   }

   public int IiIIlliIIl() {
      return this.iIllIlliil;
   }

   public Set<Long> iIIIlIlIIl() {
      return this.lliIIlliil;
   }

   public static long IliIlllilIi(int chunkX, int chunkZ) {
      return (long)chunkX & 4294967295L | (long)chunkZ << 32;
   }

   public int IlIillIiilIi() {
      return this.IlIlIlliil;
   }

   public int lilIliilIl() {
      return this.lillIlliil;
   }

   public int lIlIliIlIl() {
      return this.IlllIlliil;
   }

   public int IiIlliIliiIl(lIlliIIiiIlliIIi k) {
      return this.IIiIIlliil[k.ordinal()];
   }

   public int IlIlllIlilIl() {
      return this.iilIIlliil.size();
   }

   public void IilliliilIIi() {
   }

   public long IlIllllIll() {
      long var3 = 3033658864884659708L;
      var3 ^= ((long)(this.iIllIlliil >> 4) << 32 ^ var3) & -1L << 32;
      var3 ^= ((long)(this.llllIlliil >> 4) ^ var3) & -1L >>> 32;
      return IliIlllilIi((int)(var3 >>> 32), (int)var3) ^ (long)(this.IlllIlliil >> 4) << 20;
   }

   public double IIiIllIiIl() {
      return (double)(this.iIllIlliil + this.illlIlliil) / (double)2.0F;
   }

   public int llIIlilIIl() {
      return this.lliIIlliil.size();
   }

   public int Iiilliiliiil() {
      return this.IIIlIlliil;
   }

   public int IiiIlliiIl() {
      long var3 = 3399121554314012872L;
      var3 ^= (0L ^ var3) & -1L << 32;

      for(var3 ^= (1L ^ var3) & -1L >>> 32; (int)var3 < 148; var3 ^= (var3 ^ var3 + (long)1) & -1L >>> 32) {
         if (this.iIiIIlliil[(int)var3] > 0 && iliiIllIiiiIll.liiiIIllIl((int)var3)) {
            var3 += 4294967296L;
         }
      }

      return (int)(var3 >>> 32);
   }

   public void lIiiIiIlilli(int animals, int golems, int villagers, int pillagers) {
      this.liIlIlliil = animals;
      this.iiIlIlliil = golems;
      this.IIllIlliil = villagers;
      this.lIllIlliil = pillagers;
   }

   public int illIlIilIl() {
      return this.llllIlliil;
   }

   public int Illillliilli() {
      return this.IiIlIlliil;
   }

   public int Iilililiiili() {
      long var2 = 4882832858604978889L;
      var2 ^= (0L ^ var2) & -1L << 32;
      if (this.Illlllllilll(139) > 0) {
         var2 += 4294967296L;
      }

      if (this.Illlllllilll(140) > 0) {
         var2 += 4294967296L;
      }

      if (this.Illlllllilll(141) > 0) {
         var2 += 4294967296L;
      }

      if (this.Illlllllilll(147) > 0) {
         var2 += 4294967296L;
      }

      return (int)(var2 >>> 32);
   }
}
