package gg.corz;

import java.util.Map;

public record lIliIlIiiIliIlIi(int slot, int kind, double score, boolean keep, boolean junk, double durability, double base, Map<String, Integer> enchants, Map<String, Integer> curses) {
   private final Map<String, Integer> IilIiIIIIi;
   private final int IIlIiIIIIi;
   private final Map<String, Integer> lilIiIIIIi;
   private final double illIiIIIIi;
   private final int iiIIiIIIIi;
   private final boolean iIlIiIIIIi;
   private final double lIlIiIIIIi;
   private final double lllIiIIIIi;
   private final boolean IllIiIIIIi;

   public Map<String, Integer> IiIlliIliiIl() {
      return this.lilIiIIIIi;
   }

   public double IIIllIIliIIl() {
      return this.illIiIIIIi;
   }

   public lIliIlIiiIliIlIi(int keep, int curses, double score, boolean kind, boolean junk, double enchants, double durability, Map<String, Integer> base, Map<String, Integer> slot) {
      this.iiIIiIIIIi = keep;
      this.IIlIiIIIIi = curses;
      this.lIlIiIIIIi = score;
      this.iIlIiIIIIi = kind;
      this.IllIiIIIIi = junk;
      this.lllIiIIIIi = enchants;
      this.illIiIIIIi = durability;
      this.IilIiIIIIi = base;
      this.lilIiIIIIi = slot;
   }

   public boolean IilliliilIIi() {
      return this.iIlIiIIIIi;
   }

   public boolean lIiiIiIlilli() {
      return this.IllIiIIIIi;
   }

   public double iIlIlllllill() {
      return this.lIlIiIIIIi;
   }

   public double iliIiiliiiii() {
      return this.lllIiIIIIi;
   }

   public Map<String, Integer> IlIlllIlilIl() {
      return this.IilIiIIIIi;
   }

   public lIliIlIiiIliIlIi(int kind, int junk, double slot, boolean keep, boolean durability, double score) {
      this(kind, junk, slot, keep, durability, score, slot, Map.of(), Map.of());
   }

   public int liiiIIllIl() {
      return this.IIlIiIIIIi;
   }

   public int IliIlllilIi() {
      return this.iiIIiIIIIi;
   }
}
