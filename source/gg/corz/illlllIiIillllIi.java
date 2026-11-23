package gg.corz;

import net.minecraft.class_243;

public record illlllIiIillllIi(liiiiIiiiiiiIi view, IiIiiIlliIiiIl box, iIIlIIllIlIlIIll tools, class_243 selfFeet, boolean crystals, boolean anchors, boolean obsidian, float ehp, IiiIIlliiIIl damage, IIiIIiIllIiIIiIl path) {
   private final float IIlliiIIIi;
   private final IIiIIiIllIiIIiIl iIlliiIIIi;
   private final iIIlIIllIlIlIIll llIliiIIIi;
   private final class_243 ilIliiIIIi;
   private final boolean liIliiIIIi;
   private final boolean IiIliiIIIi;
   private final boolean iiIliiIIIi;
   private final IiIiiIlliIiiIl IlIliiIIIi;
   private final IiiIIlliiIIl lIlliiIIIi;
   private final liiiiIiiiiiiIi iIIliiIIIi;

   public boolean IIIllIIliIIl() {
      return this.iiIliiIIIi;
   }

   public illlllIiIillllIi(liiiiIiiiiiiIi view, IiIiiIlliIiiIl path, iIIlIIllIlIlIIll anchors, class_243 damage, boolean selfFeet, boolean ehp, boolean crystals, float tools, IiiIIlliiIIl box, IIiIIiIllIiIIiIl obsidian) {
      this.iIIliiIIIi = view;
      this.IlIliiIIIi = path;
      this.llIliiIIIi = anchors;
      this.ilIliiIIIi = damage;
      this.IiIliiIIIi = selfFeet;
      this.liIliiIIIi = ehp;
      this.iiIliiIIIi = crystals;
      this.IIlliiIIIi = tools;
      this.lIlliiIIIi = box;
      this.iIlliiIIIi = obsidian;
   }

   public float IlIlllIlilIl() {
      return this.IIlliiIIIi;
   }

   public IIiIIiIllIiIIiIl IIlllIlliIll() {
      return this.iIlliiIIIi;
   }

   public boolean iliIiiliiiii() {
      return this.liIliiIIIi;
   }

   public IiiIIlliiIIl IiIlliIliiIl() {
      return this.lIlliiIIIi;
   }

   public boolean lIiiIiIlilli() {
      return this.IiIliiIIIi;
   }

   public IiIiiIlliIiiIl liiiIIllIl() {
      return this.IlIliiIIIi;
   }

   public iIIlIIllIlIlIIll iIlIlllllill() {
      return this.llIliiIIIi;
   }

   public liiiiIiiiiiiIi IliIlllilIi() {
      return this.iIIliiIIIi;
   }

   public class_243 IilliliilIIi() {
      return this.ilIliiIIIi;
   }
}
