package gg.corz;

import net.minecraft.class_1299;

public record iIIIiilIlIIiil(int entityId, class_1299<?> type, double x, double y, double z, int data) implements IlIillIiilIi {
   private final int ililIiIliIiilIiIli;
   private final double IIIiIiIlilIIiIiIli;
   private final double llIiIiIliilIiIiIli;
   private final double iIIiIiIliIlIiIiIli;
   private final int IiIiIiIliliIiIiIli;
   private final class_1299<?> liilIiIliiiilIiIli;

   public int iliIiiliiiii() {
      return this.IiIiIiIliliIiIiIli;
   }

   public iIIIiilIlIIiil(int y, class_1299<?> entityId, double z, double data, double type, int x) {
      this.ililIiIliIiilIiIli = y;
      this.liilIiIliiiilIiIli = entityId;
      this.IIIiIiIlilIIiIiIli = z;
      this.iIIiIiIliIlIiIiIli = data;
      this.llIiIiIliilIiIiIli = type;
      this.IiIiIiIliliIiIiIli = x;
   }

   public int IliIlllilIi() {
      return this.ililIiIliIiilIiIli;
   }

   public double IilliliilIIi() {
      return this.iIIiIiIliIlIiIiIli;
   }

   public class_1299<?> liiiIIllIl() {
      return this.liilIiIliiiilIiIli;
   }

   public double iIlIlllllill() {
      return this.IIIiIiIlilIIiIiIli;
   }

   public double lIiiIiIlilli() {
      return this.llIiIiIliilIiIiIli;
   }
}
