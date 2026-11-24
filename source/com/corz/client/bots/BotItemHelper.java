package com.corz.client.bots;

import corzbot.mixin.KeyMappingAccessor;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Set;
import java.util.function.Predicate;
import net.minecraft.class_1304;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1887;
import net.minecraft.class_1893;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_3481;
import net.minecraft.class_3489;
import net.minecraft.class_3532;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_746;
import net.minecraft.class_7923;
import net.minecraft.class_9334;

/**
 * Shared MC 1.21.11 intermediary inventory, item/block classification,
 * smooth aim interpolation, and key-hold release helpers for clean bots.
 */
public final class BotItemHelper {
   private static final Set<String> PLANTABLE_SOIL = Set.of(
      "dirt", "grass_block", "podzol", "coarse_dirt",
      "rooted_dirt", "mycelium", "moss_block", "mud", "muddy_mangrove_roots"
   );

   private BotItemHelper() {
   }

   public static String itemPath(class_1799 stack) {
      if (stack == null || stack.method_7960()) {
         return "";
      }
      return class_7923.field_41178.method_10221(stack.method_7909()).method_12832();
   }

   public static String blockPath(class_2248 block) {
      if (block == null) {
         return "";
      }
      return class_7923.field_41175.method_10221(block).method_12832();
   }

   public static int enchantLevel(class_1799 stack, class_5321<class_1887> key) {
      if (stack == null || stack.method_7960() || key == null) {
         return 0;
      }
      for (Object2IntMap.Entry<class_6880<class_1887>> entry : stack.method_58657().method_57539()) {
         if (entry.getKey().method_40225(key)) {
            return entry.getIntValue();
         }
      }
      return 0;
   }

   public static boolean isMace(class_1799 stack) {
      return stack != null && !stack.method_7960() && stack.method_31574(class_1802.field_49098);
   }

   public static boolean isSpear(class_1799 stack) {
      if (stack == null || stack.method_7960()) {
         return false;
      }
      return stack.method_31573(class_3489.field_63257) && stack.method_57826(class_9334.field_63631);
   }

   public static int spearLungeLevel(class_1799 stack) {
      return isSpear(stack) ? enchantLevel(stack, class_1893.field_63420) : 0;
   }

   public static boolean isWindCharge(class_1799 stack) {
      if (stack == null || stack.method_7960()) {
         return false;
      }
      return "wind_charge".equals(itemPath(stack));
   }

   public static boolean isFireworkRocket(class_1799 stack) {
      return stack != null && !stack.method_7960() && stack.method_31574(class_1802.field_8639);
   }

   public static boolean isElytra(class_1799 stack) {
      return stack != null && !stack.method_7960() && stack.method_57826(class_9334.field_54197) && !stack.method_63692();
   }

   public static boolean isChestplate(class_1799 stack) {
      if (stack == null || stack.method_7960() || isElytra(stack)) {
         return false;
      }
      return itemPath(stack).endsWith("_chestplate");
   }

   public static boolean isAxe(class_1799 stack) {
      if (stack == null || stack.method_7960()) {
         return false;
      }
      return stack.method_31573(class_3489.field_42612) || itemPath(stack).endsWith("_axe");
   }

   public static boolean isPickaxe(class_1799 stack) {
      if (stack == null || stack.method_7960()) {
         return false;
      }
      return itemPath(stack).endsWith("_pickaxe");
   }

   public static boolean isGapple(class_1799 stack) {
      return stack != null && (stack.method_31574(class_1802.field_8463) || stack.method_31574(class_1802.field_8367));
   }

   public static boolean isSapling(class_1799 stack) {
      if (stack == null || stack.method_7960()) {
         return false;
      }
      if (stack.method_31573(class_3489.field_15528)) {
         return true;
      }
      String p = itemPath(stack);
      return p.endsWith("_sapling") || p.equals("mangrove_propagule") || p.equals("azalea") || p.equals("flowering_azalea");
   }

   public static int toolTierScore(class_1799 stack) {
      String p = itemPath(stack);
      int base = 1;
      if (p.startsWith("netherite_")) base = 700;
      else if (p.startsWith("diamond_")) base = 600;
      else if (p.startsWith("iron_")) base = 500;
      else if (p.startsWith("copper_")) base = 400;
      else if (p.startsWith("stone_")) base = 300;
      else if (p.startsWith("golden_")) base = 250;
      else if (p.startsWith("wooden_")) base = 150;
      int eff = enchantLevel(stack, class_1893.field_9131); // EFFICIENCY
      return base + eff * 25;
   }

   public static int findHotbarSlot(class_1657 player, Predicate<class_1799> match) {
      if (player == null) {
         return -1;
      }
      class_1661 inv = player.method_31548();
      int cur = inv.method_67532();
      if (cur >= 0 && cur < 9 && match.test(inv.method_5438(cur))) {
         return cur;
      }
      for (int i = 0; i < 9; i++) {
         if (match.test(inv.method_5438(i))) {
            return i;
         }
      }
      return -1;
   }

   public static int findBestHotbarTool(class_1657 player, Predicate<class_1799> match) {
      if (player == null) {
         return -1;
      }
      class_1661 inv = player.method_31548();
      int bestSlot = -1;
      int bestScore = Integer.MIN_VALUE;
      for (int i = 0; i < 9; i++) {
         class_1799 s = inv.method_5438(i);
         if (match.test(s)) {
            int score = toolTierScore(s);
            if (score > bestScore) {
               bestScore = score;
               bestSlot = i;
            }
         }
      }
      return bestSlot;
   }

   public static int findBestLungeSpearSlot(class_1657 player) {
      if (player == null) {
         return -1;
      }
      class_1661 inv = player.method_31548();
      int bestSlot = -1;
      int bestScore = -1;
      for (int i = 0; i < 9; i++) {
         class_1799 s = inv.method_5438(i);
         if (isSpear(s)) {
            int score = spearLungeLevel(s) * 1000 + toolTierScore(s);
            if (score > bestScore) {
               bestScore = score;
               bestSlot = i;
            }
         }
      }
      return bestSlot;
   }

   public static void selectSlot(class_746 player, int slot) {
      if (player != null && slot >= 0 && slot < 9) {
         class_1661 inv = player.method_31548();
         if (inv.method_67532() != slot) {
            inv.method_61496(slot);
         }
      }
   }

   public static boolean isWearingElytra(class_1657 player) {
      return player != null && isElytra(player.method_6118(class_1304.field_6174));
   }

   public static boolean isLog(class_2680 state) {
      if (state == null || state.method_26215()) {
         return false;
      }
      if (state.method_26164(class_3481.field_15462)) {
         return true;
      }
      String name = blockPath(state.method_26204());
      return name.endsWith("_log") || name.endsWith("_stem") || name.equals("mangrove_roots") || name.equals("muddy_mangrove_roots");
   }

   public static boolean isLeaves(class_2680 state) {
      if (state == null || state.method_26215()) {
         return false;
      }
      if (state.method_26164(class_3481.field_15475)) {
         return true;
      }
      String name = blockPath(state.method_26204());
      return name.endsWith("_leaves") || name.equals("azalea_leaves") || name.equals("flowering_azalea_leaves");
   }

   public static boolean isPlantableSoil(class_2680 state) {
      return state != null && PLANTABLE_SOIL.contains(blockPath(state.method_26204()));
   }

   public static long packBlockPos(class_2338 pos) {
      return ((long)pos.method_10263() & 67108863L) << 38
         | ((long)pos.method_10260() & 67108863L) << 12
         | (long)pos.method_10264() & 4095L;
   }

   public static class_2338 unpackBlockPos(long packed) {
      int x = (int)(packed >> 38);
      int y = (int)(packed << 52 >> 52);
      int z = (int)(packed << 26 >> 38);
      return new class_2338(x, y, z);
   }

   public static float[] anglesTo(class_243 from, class_243 to) {
      double dx = to.field_1352 - from.field_1352;
      double dy = to.field_1351 - from.field_1351;
      double dz = to.field_1350 - from.field_1350;
      double horiz = Math.hypot(dx, dz);
      float yaw = (float)(Math.atan2(dz, dx) * (180.0D / Math.PI)) - 90.0F;
      float pitch = (float)(-Math.atan2(dy, horiz) * (180.0D / Math.PI));
      return new float[]{class_3532.method_15393(yaw), class_3532.method_15363(pitch, -89.9F, 89.9F)};
   }

   public static void stepAimTowards(class_746 player, float targetYaw, float targetPitch, float maxYawStep, float maxPitchStep) {
      if (player == null) {
         return;
      }
      float curYaw = player.method_36454();
      float curPitch = player.method_36455();
      float dYaw = class_3532.method_15393(targetYaw - curYaw);
      float dPitch = targetPitch - curPitch;
      float stepYaw = class_3532.method_15363(dYaw, -maxYawStep, maxYawStep);
      float stepPitch = class_3532.method_15363(dPitch, -maxPitchStep, maxPitchStep);
      player.method_36456(curYaw + stepYaw);
      player.method_36457(class_3532.method_15363(curPitch + stepPitch, -89.9F, 89.9F));
   }

   public static void setKeyDown(class_304 key, boolean down) {
      if (key != null) {
         ((KeyMappingAccessor)key).corzbot$setDown(down);
      }
   }

   public static void releaseAllMovementKeys(class_310 mc) {
      if (mc == null || mc.field_1690 == null) {
         return;
      }
      class_315 o = mc.field_1690;
      setKeyDown(o.field_1894, false);
      setKeyDown(o.field_1881, false);
      setKeyDown(o.field_1913, false);
      setKeyDown(o.field_1849, false);
      setKeyDown(o.field_1903, false);
      setKeyDown(o.field_1832, false);
      setKeyDown(o.field_1867, false);
      setKeyDown(o.field_1904, false);
      setKeyDown(o.field_1886, false);
   }
}
