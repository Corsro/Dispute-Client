package gg.corz;

public final class iiIiIIIlIIliIIIl {
   public static final double llliiIllIl = (double)4.0F;
   public static final double IlliiIllIl = (double)3.0F;
   public static final double ilIiiIllIl = (double)3.0F;
   public static final double liliiIllIl = (double)0.5F;
   public static final int llIIIlllIl = 40;
   public static final double IlIIIlllIl = 0.98;
   public static final double lIIiiIllIl = (double)0.5F;
   public static final double illiiIllIl = (double)0.75F;
   public static final int IIIIIlllIl = 2;
   public static final float IliiiIllIl = 1.0F;
   public static final int lIIIIlllIl = 3;
   public static final double ilIIIlllIl = (double)0.25F;
   public static final double iIliiIllIl = (double)4.5F;
   public static final double IIliiIllIl = (double)1.0F;
   public static final float iIiiiIllIl = 0.5F;
   public static final double liIiiIllIl = (double)0.5F;
   public static final int iiiiiIllIl = 1;
   public static final double IIIiiIllIl = (double)20.0F;
   public static final double llIiiIllIl = (double)1.5F;
   public static final double iiIiiIllIl = 1.3;
   public static final float IiiiiIllIl = 2.0F;
   public static final int liiiiIllIl = 9;
   public static final double iiliiIllIl = (double)0.5F;
   public static final double IIiiiIllIl = (double)1.5F;
   public static final double IlIiiIllIl = (double)10.0F;
   public static final double lIliiIllIl = (double)0.5F;
   public static final double IiliiIllIl = (double)0.5F;
   public static final double iIIIIlllIl = 0.08;
   public static final double lIiiiIllIl = (double)0.5F;
   public static final float lliiiIllIl = 0.9F;
   public static final float iliiiIllIl = 2.0F;
   public static final double IiIiiIllIl = (double)1.5F;
   public static final double iIIiiIllIl = (double)4.0F;

   public static double iIlIlllllill(IiIIlillliIIlill turnDeg, double kind, int wait) {
      return Math.max(IliIlllilIi(kind) + (double)liiiIIllIl(turnDeg), (double)Math.max(0, wait));
   }

   public static boolean IiIlliIliiIl(boolean busy, double owed, boolean available, boolean value) {
      return busy && Double.isFinite(owed) && (owed > (double)0.25F || available || value);
   }

   public static double Illlllllilll(boolean centreDeg, double onLook) {
      return centreDeg ? (double)0.0F : onLook;
   }

   public static boolean IiIiliIiiiIi(int readyIn, int act) {
      return readyIn - Math.max(0, act) <= 4;
   }

   public static IiliiIIililiiIIi IIiilIiiiIii(boolean crystalDealt, boolean owed, boolean crystal, boolean pearl, boolean meleeKills, boolean anchor, double anchorUnplaced, boolean crystalBreak, double pearlAiming, double melee, boolean anchorValue, boolean dist, boolean crystalHold, boolean anchorBusy) {
      if (anchorValue && dist) {
         return IiliiIIililiiIIi.lIllliiiil;
      } else if (crystalDealt) {
         return pearl && meleeKills && owed && anchorUnplaced >= pearlAiming ? IiliiIIililiiIIi.iiIlliiiil : IiliiIIililiiIIi.IIllliiiil;
      } else if (!crystalHold || !(melee > (double)3.0F) || pearl && meleeKills) {
         if (crystalBreak && crystal) {
            return IiliiIIililiiIIi.IIllliiiil;
         } else if (!pearl || !meleeKills && crystalBreak && !(1.3 * anchorUnplaced >= pearlAiming)) {
            if (!anchor || crystalBreak && !(1.3 * anchorUnplaced >= pearlAiming)) {
               if (crystalBreak) {
                  return IiliiIIililiiIIi.IIllliiiil;
               } else if (pearl) {
                  return IiliiIIililiiIIi.iiIlliiiil;
               } else if (anchorValue) {
                  return IiliiIIililiiIIi.lIllliiiil;
               } else {
                  return anchorBusy && melee > (double)3.0F ? IiliiIIililiiIIi.iIllliiiil : IiliiIIililiiIIi.Illlliiiil;
               }
            } else {
               return IiliiIIililiiIIi.Illlliiiil;
            }
         } else {
            return IiliiIIililiiIIi.iiIlliiiil;
         }
      } else {
         return IiliiIIililiiIIi.iIllliiiil;
      }
   }

   public static boolean IIIllIIliIIl(IiIIlillliIIlill kind, double turnDeg, int airLeft, int readyIn) {
      return readyIn > 0 && Double.isFinite(turnDeg) && iIlIlllllill(kind, turnDeg, airLeft) + (double)1.0F <= (double)readyIn;
   }

   public static boolean Iilllilliill(boolean ownDealt, boolean topPops, float topKills, double ownScore, boolean ownKills, boolean topScore, double ownPops) {
      if (ownDealt) {
         return true;
      } else if (!ownKills && (!topScore || topPops)) {
         if (topPops || Float.isFinite(topKills) && topKills >= 2.0F) {
            return Double.isFinite(ownScore) && (!Double.isFinite(ownPops) || ownScore >= (double)0.5F * ownPops);
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static boolean iIIIlIlIIl(IiliiIIililiiIIi kitHasCrystals, boolean crystalsOffHotbar, boolean swordKills, boolean pick) {
      if (swordKills && pick && kitHasCrystals != null) {
         return kitHasCrystals == IiliiIIililiiIIi.Illlliiiil || kitHasCrystals == IiliiIIililiiIIi.lIllliiiil && !crystalsOffHotbar;
      } else {
         return false;
      }
   }

   public static boolean IIIIllIIIl(IiIIlillliIIlill staged, boolean kills, boolean ready, boolean kind) {
      return kills && ready && !kind && (staged == IiIIlillliIIlill.liIIiilill || staged == IiIIlillliIIlill.IIlIiilill);
   }

   public static boolean IiIIlliIIl(double rel, double h, double min) {
      if (!Double.isNaN(rel) && !Double.isNaN(h)) {
         return rel <= (double)-0.5F || h >= min;
      } else {
         return false;
      }
   }

   public static boolean Iiiiliiiiiii(boolean owed, boolean crystalKills, boolean crystal, boolean anchor, boolean anchorBusy, boolean anchorKills, boolean anchorUnplaced) {
      if (anchor && anchorBusy) {
         if (owed && !crystalKills) {
            return false;
         } else {
            return !crystal || !anchorKills || !anchorUnplaced;
         }
      } else {
         return false;
      }
   }

   public static double Ililllililil(double feetY, double blastY) {
      if (!Double.isNaN(feetY) && !Double.isNaN(blastY)) {
         double var4 = blastY - feetY - (double)0.5F;
         return var4 <= (double)0.0F ? (double)1.0F : (double)1.0F / ((double)1.0F + (double)0.5F * var4);
      } else {
         return (double)1.0F;
      }
   }

   public static int iliIiiliiiii(boolean onGround, double above, double vy) {
      long var10 = 6217851956567761696L;
      if (!onGround && Double.isFinite(above) && Double.isFinite(vy) && !(vy < (double)0.75F)) {
         double var5 = vy;
         double var7 = above;

         for(var10 ^= (0L ^ var10) & -1L << 32; (int)(var10 >>> 32) < 40; var10 += 4294967296L) {
            var5 += var7;
            var7 = (var7 - 0.08) * 0.98;
            if (var5 < (double)0.75F) {
               break;
            }
         }

         return (int)(var10 >>> 32);
      } else {
         return 0;
      }
   }

   public static int liiiIIllIl(IiIIlillliIIlill kind) {
      if (kind == null) {
         return 0;
      } else {
         byte var10000;
         switch (kind.ordinal()) {
            case 0:
            case 1:
               var10000 = 0;
               break;
            case 2:
               var10000 = 1;
               break;
            case 3:
               var10000 = 2;
               break;
            default:
               throw new MatchException((String)null, (Throwable)null);
         }

         return var10000;
      }
   }

   public static double Illillliilli(IiIIlillliIIlill wait, float selfCost, float selfFull, float kind, boolean pops, boolean spot, boolean dealt, boolean kills, double ours, int turnDeg) {
      if (wait != null && Float.isFinite(selfCost)) {
         double var11 = (double)Math.max(0.0F, selfCost);
         double var13 = Float.isFinite(selfFull) ? (double)Math.max(0.0F, selfFull) : (double)0.0F;
         double var15 = Float.isFinite(kind) ? (double)Math.max(0.0F, kind) : var13;
         double var17 = var11 + (pops ? (double)4.0F : (double)0.0F) + (spot ? (double)10.0F : (double)0.0F) - (double)0.5F * var15 + (kills ? (double)3.0F : (double)0.0F);
         if (wait == IiIIlillliIIlill.liIIiilill || wait == IiIIlillliIIlill.iiIIiilill) {
            ++var17;
            if (!dealt) {
               var17 += (double)0.5F * Math.max((double)0.0F, var13 - var15);
            }
         }

         return var17 / ((double)1.0F + iIlIlllllill(wait, ours, turnDeg));
      } else {
         return Double.NEGATIVE_INFINITY;
      }
   }

   public static boolean Iilililiiili(double focusPops, boolean focusKills, boolean focusScore, double kills, boolean score, boolean pops) {
      if (!Double.isFinite(focusPops)) {
         return true;
      } else if (!Double.isFinite(kills)) {
         return false;
      } else if (pops && !focusScore) {
         return true;
      } else if (score && !focusKills && !focusScore) {
         return true;
      } else {
         return kills >= focusPops + Math.max((double)1.0F, (double)0.5F * Math.abs(focusPops));
      }
   }

   public static boolean IIIilIIiiIIi(IiIIlillliIIlill pops, float selfCost, float ours, float dealt, boolean kind, boolean selfFull) {
      long var7 = 4880849384290609983L;
      var7 ^= ((long)(Float.isFinite(selfCost) && selfCost >= 0.5F ? 1 : 0) << 32 ^ var7) & -1L << 32;
      if (pops == IiIIlillliIIlill.liIIiilill && !kind) {
         if (Float.isFinite(ours) && Float.isFinite(dealt)) {
            return (int)(var7 >>> 32) != 0 && (selfFull || selfCost >= dealt) || ours - dealt >= 1.0F;
         } else {
            return false;
         }
      } else {
         return (boolean)((int)(var7 >>> 32));
      }
   }

   public static double IIlllIlliIll(boolean feetY, double floorY, double onGround, double vy) {
      return !feetY && floorY < (double)0.0F && !Double.isNaN(onGround) && !Double.isNaN(vy) && vy < onGround && !(onGround - vy > (double)4.0F) ? vy : Double.NaN;
   }

   public static boolean llIIlilIIl(boolean itemLane, boolean defends, boolean heal, boolean breaching, boolean escape) {
      return itemLane || defends || heal || breaching || escape;
   }

   public static double Iiilliiliiil(IiIIlillliIIlill spot, double turnDeg, double bound, boolean kind, boolean focus) {
      double var7 = Double.isFinite(turnDeg) ? Math.max((double)0.0F, turnDeg) : (double)0.0F;
      return var7 / ((double)1.0F + iIlIlllllill(spot, bound, 0)) + (kind ? (double)3.0F : (double)0.0F) + (focus ? (double)1.5F : (double)0.0F) + (spot != IiIIlillliIIlill.liIIiilill && spot != IiIIlillliIIlill.iiIIiilill ? (double)0.0F : (double)1.5F);
   }

   public static int IilliliilIIi(double feetY) {
      return (int)Math.floor(feetY - (double)0.75F);
   }

   public static IiliiIIililiiIIi Iliilliiilii(boolean pearl, boolean crystalKills, boolean crystalDealt, boolean meleeKills, boolean anchorValue, boolean anchor, double crystalHold, boolean anchorBusy, double anchorUnplaced, double owed, boolean pearlAiming, boolean anchorKills, boolean crystalBreak, boolean crystal, boolean melee, boolean dist) {
      return (!pearlAiming || !anchorKills) && Iiiiliiiiiii(pearl, crystalKills, crystalDealt, meleeKills, melee, anchorBusy, dist) ? IiliiIIililiiIIi.iiIlliiiil : IIiilIiiiIii(pearl, crystalKills, crystalDealt, meleeKills, anchorValue, anchor, crystalHold, anchorBusy, anchorUnplaced, owed, pearlAiming, anchorKills, crystalBreak, crystal);
   }

   public static boolean IlIlllIlilIl(boolean value, boolean unplaced, double bare) {
      return value && unplaced && !(bare > (double)0.25F);
   }

   public static double lIiiIiIlilli(boolean floorY, double feetY, double onGround) {
      return !floorY && !Double.isNaN(feetY) && !Double.isNaN(onGround) && !(onGround > feetY) ? onGround : feetY;
   }

   public static boolean IlIillIiilIi(boolean pops, int real, boolean ok, float ours, boolean readyIn) {
      if (pops && real > 0 && !readyIn) {
         return !ok || !(ours >= 2.0F);
      } else {
         return false;
      }
   }

   private iiIiIIIlIIliIIIl() {
   }

   public static double IliIlllilIi(double deg) {
      if (!Double.isNaN(deg) && !Double.isInfinite(deg)) {
         return !(deg > (double)0.0F) ? (double)0.0F : Math.min((double)9.0F, Math.ceil(deg / (double)20.0F));
      } else {
         return (double)9.0F;
      }
   }

   public static boolean IIillIiliIil(IiIIlillliIIlill kind, double backDeg, double readyIn, int toDeg) {
      return iIlIlllllill(kind, backDeg, 0) + IliIlllilIi(readyIn) <= (double)Math.max(1, toDeg);
   }

   public static double[] iiIIlIIlIl(double hz, double ux, double radius, double uz, double hx) {
      double var10 = Math.hypot(radius - hz, uz - ux);
      double var12 = var10 < 0.001 ? (double)1.0F : (radius - hz) / var10;
      double var14 = var10 < 0.001 ? (double)0.0F : (uz - ux) / var10;
      double var16 = Double.isFinite(hx) ? Math.max((double)0.0F, hx) : (double)0.0F;
      return new double[]{hz + var12 * var16, ux + var14 * var16};
   }

   public static boolean IIlilIliiIli(double dealt, boolean kills, double cost, float usFeetY, float pops, boolean usGround, boolean blastY) {
      if (blastY) {
         return true;
      } else if (Float.isFinite(usFeetY) && Float.isFinite(pops) && !Double.isNaN(dealt) && !Double.isNaN(cost)) {
         if (!(pops <= 2.0F) && !(dealt <= cost - (double)0.5F)) {
            if (!kills && dealt > cost + (double)0.5F) {
               return false;
            } else {
               return (double)usFeetY >= (usGround ? (double)0.5F : (double)1.5F) * (double)pops;
            }
         } else {
            return true;
         }
      } else {
         return false;
      }
   }
}
