package gg.corz;

import net.minecraft.class_2338;
import net.minecraft.class_243;

public record llIiiliilIiili(iIiIiilIliIiil shot, String why, class_243 landing, int landIndex, class_2338 comboBase) {
   private final class_243 iIlllIlIIl;
   private final int IllllIlIIl;
   private final String lIlllIlIIl;
   private final iIiIiilIliIiil IIlllIlIIl;
   private final class_2338 lllllIlIIl;

   public llIiiliilIiili(iIiIiilIliIiil landing, String comboBase, class_243 shot, int why, class_2338 landIndex) {
      this.IIlllIlIIl = landing;
      this.lIlllIlIIl = comboBase;
      this.iIlllIlIIl = shot;
      this.IllllIlIIl = why;
      this.lllllIlIIl = landIndex;
   }

   public int IilliliilIIi() {
      return this.IllllIlIIl;
   }

   public iIiIiilIliIiil IliIlllilIi() {
      return this.IIlllIlIIl;
   }

   public class_243 iIlIlllllill() {
      return this.iIlllIlIIl;
   }

   public class_2338 lIiiIiIlilli() {
      return this.lllllIlIIl;
   }

   public String liiiIIllIl() {
      return this.lIlllIlIIl;
   }
}
