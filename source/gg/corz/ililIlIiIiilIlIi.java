package gg.corz;

import java.util.List;
import net.minecraft.class_243;

public record ililIlIiIiilIlIi(int pearlId, int ownerId, class_243 landing, int eta, List<class_243> tail, long seenTick) {
   private final List<class_243> IllIlIIIIi;
   private final int iIlIlIIIIi;
   private final class_243 lIlIlIIIIi;
   private final long lllIlIIIIi;
   private final int IIlIlIIIIi;
   private final int iiIIlIIIIi;

   public int IilliliilIIi() {
      return this.iIlIlIIIIi;
   }

   public ililIlIiIiilIlIi(int seenTick, int eta, class_243 tail, int pearlId, List<class_243> landing, long ownerId) {
      this.iiIIlIIIIi = seenTick;
      this.IIlIlIIIIi = eta;
      this.lIlIlIIIIi = tail;
      this.iIlIlIIIIi = pearlId;
      this.IllIlIIIIi = landing;
      this.lllIlIIIIi = ownerId;
   }

   public long iliIiiliiiii() {
      return this.lllIlIIIIi;
   }

   public List<class_243> lIiiIiIlilli() {
      return this.IllIlIIIIi;
   }

   public int liiiIIllIl() {
      return this.IIlIlIIIIi;
   }

   public class_243 iIlIlllllill() {
      return this.lIlIlIIIIi;
   }

   public int IliIlllilIi() {
      return this.iiIIlIIIIi;
   }
}
