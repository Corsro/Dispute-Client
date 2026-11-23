package gg.corz;

import java.util.function.Predicate;
import net.minecraft.class_1309;
import net.minecraft.class_243;

public record iiilililIIIiilil(class_1309 target, lIiillIiiIiillIi tuning, float maxSelfDamage, boolean allowTotemTrade, boolean autoObsidian, int predictTicks, class_243 spread, iIIlIIiIlIlIIi self, IilIlIIllilIlIIl targetWindow, IilIlIIllilIlIIl selfWindow, float targetEhp, boolean targetTotem, Predicate<class_243> veto, ilIIllIiIiIIllIi directive) {
   private final boolean iIilIlllil;
   private final int llilIlllil;
   private final float lIilIlllil;
   private final float IIIiIlllil;
   private final boolean IlilIlllil;
   private final ilIIllIiIiIIllIi IlIiIlllil;
   private final IilIlIIllilIlIIl iiilIlllil;
   private final boolean lIIiIlllil;
   private final iIIlIIiIlIlIIi IiilIlllil;
   private final class_243 ililIlllil;
   private final class_1309 iillIlllil;
   private final Predicate<class_243> iIIiIlllil;
   private final IilIlIIllilIlIIl liilIlllil;
   private final lIiillIiiIiillIi IIilIlllil;

   public iiilililIIIiilil IliIlllilIi(ilIIllIiIiIIllIi d) {
      return new iiilililIIIiilil(this.iillIlllil, this.IIilIlllil, this.lIilIlllil, this.iIilIlllil, this.IlilIlllil, this.llilIlllil, this.ililIlllil, this.IiilIlllil, this.liilIlllil, this.iiilIlllil, this.IIIiIlllil, this.lIIiIlllil, this.iIIiIlllil, d);
   }

   public ilIIllIiIiIIllIi Iiilliiliiil() {
      return this.IlIiIlllil;
   }

   public Predicate<class_243> Ililllililil() {
      return this.iIIiIlllil;
   }

   public lIiillIiiIiillIi iIlIlllllill() {
      return this.IIilIlllil;
   }

   public boolean IIillIiliIil() {
      return this.lIIiIlllil;
   }

   public IilIlIIllilIlIIl Illlllllilll() {
      return this.iiilIlllil;
   }

   public float Iilllilliill() {
      return this.IIIiIlllil;
   }

   public boolean iliIiiliiiii() {
      return this.IlilIlllil;
   }

   public float IilliliilIIi() {
      return this.lIilIlllil;
   }

   public iiilililIIIiilil(class_1309 predictTicks, lIiillIiiIiillIi targetEhp, float target, boolean targetWindow, boolean selfWindow, int autoObsidian, class_243 self, iIIlIIiIlIlIIi tuning, IilIlIIllilIlIIl targetTotem, IilIlIIllilIlIIl allowTotemTrade, float spread, boolean maxSelfDamage, Predicate<class_243> veto) {
      this(predictTicks, targetEhp, target, targetWindow, selfWindow, autoObsidian, self, tuning, targetTotem, allowTotemTrade, spread, maxSelfDamage, veto, (ilIIllIiIiIIllIi)null);
   }

   public class_243 IlIlllIlilIl() {
      return this.ililIlllil;
   }

   public class_1309 liiiIIllIl() {
      return this.iillIlllil;
   }

   public int IIIllIIliIIl() {
      return this.llilIlllil;
   }

   public boolean lIiiIiIlilli() {
      return this.iIilIlllil;
   }

   public iIIlIIiIlIlIIi IiIlliIliiIl() {
      return this.IiilIlllil;
   }

   public IilIlIIllilIlIIl IIlllIlliIll() {
      return this.liilIlllil;
   }

   public iiilililIIIiilil(class_1309 target, lIiillIiiIiillIi predictTicks, float selfWindow, boolean veto, boolean allowTotemTrade, int directive, class_243 spread, iIIlIIiIlIlIIi targetTotem, IilIlIIllilIlIIl self, IilIlIIllilIlIIl autoObsidian, float targetWindow, boolean maxSelfDamage, Predicate<class_243> targetEhp, ilIIllIiIiIIllIi tuning) {
      this.iillIlllil = target;
      this.IIilIlllil = predictTicks;
      this.lIilIlllil = selfWindow;
      this.iIilIlllil = veto;
      this.IlilIlllil = allowTotemTrade;
      this.llilIlllil = directive;
      this.ililIlllil = spread;
      this.IiilIlllil = targetTotem;
      this.liilIlllil = self;
      this.iiilIlllil = autoObsidian;
      this.IIIiIlllil = targetWindow;
      this.lIIiIlllil = maxSelfDamage;
      this.iIIiIlllil = targetEhp;
      this.IlIiIlllil = tuning;
   }
}
