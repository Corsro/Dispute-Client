package gg.corz.rpc.cloud;

import java.util.ArrayList;
import java.util.List;

public final class MinerPlanInput {
   private final long feet;
   private final int minX, maxX, minY, maxY, minZ, maxZ;
   private final int layerHeight;
   private final int passWidth;
   private final List<MinerTarget> targets;

   public MinerPlanInput(long feet, int minX, int maxX, int minY, int maxY, int minZ, int maxZ, int layerHeight, int passWidth, List<MinerTarget> targets) {
      this.feet = feet;
      this.minX = minX;
      this.maxX = maxX;
      this.minY = minY;
      this.maxY = maxY;
      this.minZ = minZ;
      this.maxZ = maxZ;
      this.layerHeight = layerHeight;
      this.passWidth = passWidth;
      this.targets = targets;
   }

   public long getFeet() {
      return feet;
   }

   public int getMinX() { return minX; }
   public int getMaxX() { return maxX; }
   public int getMinY() { return minY; }
   public int getMaxY() { return maxY; }
   public int getMinZ() { return minZ; }
   public int getMaxZ() { return maxZ; }
   public int getLayerHeight() { return layerHeight; }
   public int getPassWidth() { return passWidth; }
   public List<MinerTarget> getTargetsList() { return targets; }

   public static Builder newBuilder() {
      return new Builder();
   }

   public static final class Builder {
      private long feet;
      private int minX, maxX, minY, maxY, minZ, maxZ;
      private int layerHeight;
      private int passWidth;
      private final List<MinerTarget> targets = new ArrayList<>();

      public Builder setFeet(long feet) {
         this.feet = feet;
         return this;
      }

      public Builder setMinX(int minX) {
         this.minX = minX;
         return this;
      }

      public Builder setMaxX(int maxX) {
         this.maxX = maxX;
         return this;
      }

      public Builder setMinY(int minY) {
         this.minY = minY;
         return this;
      }

      public Builder setMaxY(int maxY) {
         this.maxY = maxY;
         return this;
      }

      public Builder setMinZ(int minZ) {
         this.minZ = minZ;
         return this;
      }

      public Builder setMaxZ(int maxZ) {
         this.maxZ = maxZ;
         return this;
      }

      public Builder setLayerHeight(int layerHeight) {
         this.layerHeight = layerHeight;
         return this;
      }

      public Builder setPassWidth(int passWidth) {
         this.passWidth = passWidth;
         return this;
      }

      public Builder addTargets(MinerTarget target) {
         this.targets.add(target);
         return this;
      }

      public MinerPlanInput build() {
         return new MinerPlanInput(feet, minX, maxX, minY, maxY, minZ, maxZ, layerHeight, passWidth, new ArrayList<>(targets));
      }
   }
}
