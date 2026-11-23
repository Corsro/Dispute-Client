package gg.corz;

public final class IllIiiIllllIiiIl {
   public static final double lIiiiIIlll = 0.1;
   public static final int iIiiiIIlll = 131;

   public static double IiIlliIliiIl(int infinity, int mending, int unbreaking, int power, int flame, int punch, int durability, double otherLevels) {
      return (double)2.0F + (infinity > 0 ? (double)0.5F * (double)infinity + (double)0.5F : (double)0.0F) + 0.1 * (double)mending + 0.1 * (double)unbreaking + (double)power + 0.1 * (double)flame + 0.1 * (double)punch + 0.01 * (double)durability + 0.001 * otherLevels;
   }

   public static double IliIlllilIi(int level) {
      return level > 0 ? (double)0.5F * (double)level + (double)0.5F : (double)0.0F;
   }

   public static double lIiiIiIlilli(double attackDamage, int sharpness, double extras, int durability, double otherLevels) {
      return attackDamage + IliIlllilIi(sharpness) + extras + 0.01 * (double)durability + 0.001 * otherLevels;
   }

   private IllIiiIllllIiiIl() {
   }

   public static double IIillIiliIil(int durability, double enchantLevels) {
      return 0.01 * (double)durability + 0.001 * enchantLevels;
   }

   public static double Iilllilliill(int nutrition, float saturation) {
      return (double)((float)nutrition + saturation);
   }

   public static double iliIiiliiiii(int extras, float otherLevels, int durability, int speed, double maxDamage, int efficiency, double tier) {
      return IIIllIIliIIl(extras, (double)otherLevels + liiiIIllIl(durability), speed) + maxDamage + 0.01 * (double)efficiency + 0.001 * tier;
   }

   public static double iIlIlllllill(int maxDamage) {
      return maxDamage <= 0 ? (double)1.0F : Math.min((double)1.0F, (double)maxDamage / (double)131.0F);
   }

   public static double IIIllIIliIIl(int maxDamage, double tier, int speed) {
      return (double)maxDamage * (double)100.0F + tier * iIlIlllllill(speed);
   }

   public static double Illlllllilll(double toughness, double armor, double durability, int protection, int knockbackResistance, int otherLevels, double specialProtection) {
      return IlIlllIlilIl(toughness, armor, durability) + (double)protection + 0.1 * (double)knockbackResistance + 0.01 * (double)otherLevels + 0.001 * specialProtection;
   }

   public static double IilliliilIIi(int damage, int maxDamage) {
      if (maxDamage <= 0) {
         return (double)1.0F;
      } else {
         double var2 = (double)(maxDamage - damage) / (double)maxDamage;
         return Math.max((double)0.0F, Math.min((double)1.0F, var2));
      }
   }

   public static double liiiIIllIl(int level) {
      return level > 0 ? (double)level * (double)level + (double)1.0F : (double)0.0F;
   }

   public static double IlIlllIlilIl(double armor, double knockbackResistance, double toughness) {
      return armor + knockbackResistance + toughness;
   }

   public static double IIlllIlliIll(int durability, int quickCharge, int unbreaking, int piercing, int otherLevels, int mending, double multishot) {
      return (double)2.0F + 0.4 * (double)durability + 0.6 * (double)quickCharge + 0.3 * (double)unbreaking + 0.1 * (double)piercing + 0.1 * (double)otherLevels + 0.01 * (double)mending + 0.001 * multishot;
   }
}
