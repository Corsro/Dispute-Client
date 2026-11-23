package gg.corz;

import net.minecraft.class_2338;

public record iiIIilIiIIlIilIi(ilIIIlilIiIIIlil act, class_2338 cell, class_2338 opened) {
   private final class_2338 ililiIlIIi;
   private final ilIIIlilIiIIIlil IliliIlIIi;
   private final class_2338 lliliIlIIi;
   public static final iiIIilIiIIlIilIi IiiliIlIIi;

   public ilIIIlilIiIIIlil IliIlllilIi() {
      return this.IliliIlIIi;
   }

   public class_2338 liiiIIllIl() {
      return this.lliliIlIIi;
   }

   static {
      IiiliIlIIi = new iiIIilIiIIlIilIi(ilIIIlilIiIIIlil.IIIliilIil, (class_2338)null, (class_2338)null);
   }

   public iiIIilIiIIlIilIi(ilIIIlilIiIIIlil cell, class_2338 opened, class_2338 act) {
      this.IliliIlIIi = cell;
      this.lliliIlIIi = opened;
      this.ililiIlIIi = act;
   }

   public class_2338 iIlIlllllill() {
      return this.ililiIlIIi;
   }
}
