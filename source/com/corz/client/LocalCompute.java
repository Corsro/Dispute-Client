package com.corz.client;

import gg.corz.rpc.cloud.MinerPlanInput;
import gg.corz.rpc.cloud.MinerPlanOutput;
import gg.corz.rpc.cloud.MinerTarget;
import gg.corz.rpc.cloud.TreeCandidate;
import gg.corz.rpc.cloud.TreePlanInput;
import gg.corz.rpc.cloud.TreePlanOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class LocalCompute {
   private LocalCompute() {
   }

   public static TreePlanOutput tree(TreePlanInput in) {
      if (in == null || in.getCandidatesList().isEmpty()) {
         return TreePlanOutput.newBuilder().build();
      }
      List<TreeCandidate> list = new ArrayList<>(in.getCandidatesList());
      list.sort(Comparator.comparingDouble(TreeCandidate::getDistance));

      TreePlanOutput.Builder out = TreePlanOutput.newBuilder();
      for (TreeCandidate c : list) {
         out.addOrder(c.getTarget());
      }
      return out.build();
   }

   public static MinerPlanOutput miner(MinerPlanInput in) {
      if (in == null || in.getTargetsList().isEmpty()) {
         return MinerPlanOutput.newBuilder().build();
      }
      List<MinerTarget> list = new ArrayList<>(in.getTargetsList());
      // Prioritize exposed blocks, then lower neighbors
      list.sort((a, b) -> {
         if (a.getOnFaceLayer() != b.getOnFaceLayer()) {
            return a.getOnFaceLayer() ? -1 : 1;
         }
         return Integer.compare(b.getNeighbours(), a.getNeighbours());
      });

      MinerPlanOutput.Builder out = MinerPlanOutput.newBuilder();
      for (MinerTarget t : list) {
         out.addOrder(t.getTarget());
      }
      return out.build();
   }
}
