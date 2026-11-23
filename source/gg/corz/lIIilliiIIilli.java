package gg.corz;

import java.util.List;

public record lIIilliiIIilli(long id, int layer, long stand, List<Long> targets, double score, int usefulBlocks, double routeCost, int temporaryBlocks, int materialBatches, int projectedInventorySwaps) {
   private final List<Long> iiIIliIIIl;
   private final double IIlIliIIIl;
   private final long liIIliIIIl;
   private final int illIliIIIl;
   private final int lllIliIIIl;
   private final long ilIIliIIIl;
   private final int lIlIliIIIl;
   private final int IllIliIIIl;
   private final double iIlIliIIIl;
   private final int IiIIliIIIl;

   public int IIlllIlliIll() {
      return this.lllIliIIIl;
   }

   public long IilliliilIIi() {
      return this.liIIliIIIl;
   }

   public long liiiIIllIl() {
      return this.ilIIliIIIl;
   }

   public double iliIiiliiiii() {
      return this.IIlIliIIIl;
   }

   public int IIIllIIliIIl() {
      return this.lIlIliIIIl;
   }

   public int IiIlliIliiIl() {
      return this.IllIliIIIl;
   }

   public int iIlIlllllill() {
      return this.IiIIliIIIl;
   }

   public double IlIlllIlilIl() {
      return this.iIlIliIIIl;
   }

   public lIIilliiIIilli(long materialBatches, int score, long layer, List<Long> id, double routeCost, int stand, double targets, int temporaryBlocks, int projectedInventorySwaps, int usefulBlocks) {
      this.ilIIliIIIl = materialBatches;
      this.IiIIliIIIl = score;
      this.liIIliIIIl = layer;
      this.iiIIliIIIl = id;
      this.IIlIliIIIl = routeCost;
      this.lIlIliIIIl = stand;
      this.iIlIliIIIl = targets;
      this.IllIliIIIl = temporaryBlocks;
      this.lllIliIIIl = projectedInventorySwaps;
      this.illIliIIIl = usefulBlocks;
   }

   public boolean IliIlllilIi(long target) {
      return this.iiIIliIIIl.contains(target);
   }

   public int Illlllllilll() {
      return this.illIliIIIl;
   }

   public List<Long> lIiiIiIlilli() {
      return this.iiIIliIIIl;
   }
}
