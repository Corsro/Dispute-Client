package gg.corz.rpc.cloud;

import java.util.ArrayList;
import java.util.List;

public final class TreePlanOutput {
   private final List<Long> orders;

   public TreePlanOutput(List<Long> orders) {
      this.orders = orders;
   }

   public int getOrderCount() {
      return orders.size();
   }

   public long getOrder(int index) {
      return orders.get(index);
   }

   public static Builder newBuilder() {
      return new Builder();
   }

   public static final class Builder {
      private final List<Long> orders = new ArrayList<>();

      public Builder addOrder(long order) {
         this.orders.add(order);
         return this;
      }

      public TreePlanOutput build() {
         return new TreePlanOutput(new ArrayList<>(orders));
      }
   }
}
