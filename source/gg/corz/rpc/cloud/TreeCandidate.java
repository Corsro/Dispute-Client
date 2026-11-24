package gg.corz.rpc.cloud;

public final class TreeCandidate {
   private final long target;
   private final double distance;
   private final float yaw;

   public TreeCandidate(long target, double distance, float yaw) {
      this.target = target;
      this.distance = distance;
      this.yaw = yaw;
   }

   public long getTarget() {
      return target;
   }

   public double getDistance() {
      return distance;
   }

   public float getYaw() {
      return yaw;
   }

   public static Builder newBuilder() {
      return new Builder();
   }

   public static final class Builder {
      private long target;
      private double distance;
      private float yaw;

      public Builder setTarget(long target) {
         this.target = target;
         return this;
      }

      public Builder setDistance(double distance) {
         this.distance = distance;
         return this;
      }

      public Builder setYaw(float yaw) {
         this.yaw = yaw;
         return this;
      }

      public TreeCandidate build() {
         return new TreeCandidate(target, distance, yaw);
      }
   }
}
