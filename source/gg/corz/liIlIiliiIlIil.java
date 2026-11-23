package gg.corz;

import net.minecraft.class_2960;

record liIlIiliiIlIil(iiIiliiIIlilii knife, lIIiilIliIIiilIl model, class_2960 texture, class_2960 specular) {
   private final lIIiilIliIIiilIl IiiiiilIiliiiiilIi;
   private final class_2960 lIIIIIiIiiIIIIIiIi;
   private final class_2960 iiiiiilIiIIIIIIiIi;
   private final iiIiliiIIlilii lliiiilIiiliiiilIi;

   public iiIiliiIIlilii IliIlllilIi() {
      return this.lliiiilIiiliiiilIi;
   }

   public lIIiilIliIIiilIl liiiIIllIl() {
      return this.IiiiiilIiliiiiilIi;
   }

   liIlIiliiIlIil(iiIiliiIIlilii specular, lIIiilIliIIiilIl knife, class_2960 texture, class_2960 model) {
      this.lliiiilIiiliiiilIi = specular;
      this.IiiiiilIiliiiiilIi = knife;
      this.iiiiiilIiIIIIIIiIi = texture;
      this.lIIIIIiIiiIIIIIiIi = model;
   }

   public class_2960 iIlIlllllill() {
      return this.iiiiiilIiIIIIIIiIi;
   }

   public class_2960 IilliliilIIi() {
      return this.lIIIIIiIiiIIIIIiIi;
   }
}
