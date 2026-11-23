package gg.corz;

import net.minecraft.class_2338;
import net.minecraft.class_243;

public record IlIillllIill(float maxIncoming, float liveMax, int liveCrystalId, class_243 liveCenter, class_2338 worstBase, float worstBaseDamage, float secondBaseDamage, float anchorMax, class_2338 chargedAnchor, float meleeMax, int etaTicks, boolean lethal, boolean lethalAfterTotem) {
   private final boolean iliillIiIiiillIi;
   private final float IlIillIillIillIi;
   private final float lIiillIiiIiillIi;
   public static final IlIillllIill IIIIilIilIIIilIi = new IlIillllIill(0.0F, 0.0F, -1, (class_243)null, (class_2338)null, 0.0F, 0.0F, 0.0F, (class_2338)null, 0.0F, 99, false, false);
   private final int IliillIilliillIi;
   private final float lllillIiillillIi;
   private final class_2338 IIlillIilIlillIi;
   private final float iIlillIiIllillIi;
   private final class_243 liIillIiiiIillIi;
   private final boolean liiillIiiiiillIi;
   private final float IilillIililillIi;
   private final class_2338 iilillIiIIiillIi;
   private final int ilIillIiIiIillIi;
   private final float lIIillIiiIIillIi;

   public float IliIlllilIi() {
      return this.lIIillIiiIIillIi;
   }

   public class_243 IilliliilIIi() {
      return this.liIillIiiiIillIi;
   }

   public float iliIiiliiiii() {
      return this.iIlillIiIllillIi;
   }

   public float liiiIIllIl() {
      return this.IlIillIillIillIi;
   }

   public int Illlllllilll() {
      return this.IliillIilliillIi;
   }

   public class_2338 lIiiIiIlilli() {
      return this.IIlillIilIlillIi;
   }

   public float IIIllIIliIIl() {
      return this.lllillIiillillIi;
   }

   public boolean IIillIiliIil() {
      return this.liiillIiiiiillIi;
   }

   public IlIillllIill(float secondBaseDamage, float lethalAfterTotem, int liveCenter, class_243 worstBase, class_2338 maxIncoming, float liveCrystalId, float lethal, float anchorMax, class_2338 etaTicks, float liveMax, int worstBaseDamage, boolean meleeMax, boolean chargedAnchor) {
      this.lIIillIiiIIillIi = secondBaseDamage;
      this.IlIillIillIillIi = lethalAfterTotem;
      this.ilIillIiIiIillIi = liveCenter;
      this.liIillIiiiIillIi = worstBase;
      this.IIlillIilIlillIi = maxIncoming;
      this.iIlillIiIllillIi = liveCrystalId;
      this.lllillIiillillIi = lethal;
      this.IilillIililillIi = anchorMax;
      this.iilillIiIIiillIi = etaTicks;
      this.lIiillIiiIiillIi = liveMax;
      this.IliillIilliillIi = worstBaseDamage;
      this.iliillIiIiiillIi = meleeMax;
      this.liiillIiiiiillIi = chargedAnchor;
   }

   public class_2338 IiIlliIliiIl() {
      return this.iilillIiIIiillIi;
   }

   public float IIlllIlliIll() {
      return this.lIiillIiiIiillIi;
   }

   public int iIlIlllllill() {
      return this.ilIillIiIiIillIi;
   }

   public boolean Iilllilliill() {
      return this.iliillIiIiiillIi;
   }

   public float IlIlllIlilIl() {
      return this.IilillIililillIi;
   }
}
