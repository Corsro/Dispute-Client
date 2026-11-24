package gg.corz.rpc.cloud;

import java.util.ArrayList;
import java.util.List;

public final class TreePlanInput {
   private final float yaw;
   private final boolean farFirst;
   private final List<TreeCandidate> candidates;

   public TreePlanInput(float yaw, boolean farFirst, List<TreeCandidate> candidates) {
      this.yaw = yaw;
      this.farFirst = farFirst;
      this.candidates = candidates;
   }

   public float getYaw() {
      return yaw;
   }

   public boolean isFarFirst() {
      return farFirst;
   }

   public List<TreeCandidate> getCandidatesList() {
      return candidates;
   }

   public static Builder newBuilder() {
      return new Builder();
   }

   public static final class Builder {
      private float yaw;
      private boolean farFirst;
      private final List<TreeCandidate> candidates = new ArrayList<>();

      public Builder setYaw(float yaw) {
         this.yaw = yaw;
         return this;
      }

      public Builder setFarFirst(boolean farFirst) {
         this.farFirst = farFirst;
         return this;
      }

      public Builder addCandidates(TreeCandidate candidate) {
         this.candidates.add(candidate);
         return this;
      }

      public TreePlanInput build() {
         return new TreePlanInput(yaw, farFirst, new ArrayList<>(candidates));
      }
   }
}
