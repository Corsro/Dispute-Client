package gg.corz.rpc.cloud;

public final class MinerTarget {
   private final long target;
   private final boolean onFaceLayer;
   private final int neighbours;

   public MinerTarget(long target, boolean onFaceLayer, int neighbours) {
      this.target = target;
      this.onFaceLayer = onFaceLayer;
      this.neighbours = neighbours;
   }

   public long getTarget() {
      return target;
   }

   public boolean getOnFaceLayer() {
      return onFaceLayer;
   }

   public int getNeighbours() {
      return neighbours;
   }

   public static Builder newBuilder() {
      return new Builder();
   }

   public static final class Builder {
      private long target;
      private boolean onFaceLayer;
      private int neighbours;

      public Builder setTarget(long target) {
         this.target = target;
         return this;
      }

      public Builder setOnFaceLayer(boolean onFaceLayer) {
         this.onFaceLayer = onFaceLayer;
         return this;
      }

      public Builder setNeighbours(int neighbours) {
         this.neighbours = neighbours;
         return this;
      }

      public MinerTarget build() {
         return new MinerTarget(target, onFaceLayer, neighbours);
      }
   }
}
