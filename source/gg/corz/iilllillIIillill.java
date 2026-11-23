package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class iilllillIIillill {
   public static final double IIlllIiill = (double)8.0F;
   public static final int ilIllIiill = 10;
   public static final int IiIllIiill = 3;
   public static final String iiiIlIiill = "unplaced";
   private final IlIIiiillIIiii iilllIiill;
   private long IIillIiill = Long.MIN_VALUE;
   public static final String iIIllIiill = "owed";
   public static final String lIIllIiill = "camp";
   private long lIillIiill = Long.MIN_VALUE;
   public static final float IllllIiill = 0.5F;
   public static final int lilllIiill = 6;
   public static final String IiiIlIiill = "Backing off";
   public static final double illllIiill = (double)1.5F;
   public static final double IilllIiill = (double)8.0F;
   public static final String IIIllIiill = "placed";
   public static final float iiIllIiill = 4.0F;
   public static final float llIllIiill = 6.0F;
   public static final float IlIllIiill = 2.0F;
   public static final float lllllIiill = 0.8F;
   public static final double iIlllIiill = (double)4.0F;
   public static final String liiIlIiill = "Anti-anchor";
   public static final int liIllIiill = 3;
   public static final double lIlllIiill = (double)1000.0F;

   static String iIiIlIliIl(iIllIliIlllIli mode) {
      String var10000;
      switch (mode) {
         case IlliIIIIIl -> var10000 = lIilliIill<invokedynamic>();
         case llliIIIIIl -> var10000 = lIilliIill<invokedynamic>();
         case IliiIIIIIl -> var10000 = lIilliIill<invokedynamic>();
         case lliiIIIIIl -> var10000 = lIilliIill<invokedynamic>();
         case iliiIIIIIl -> var10000 = lIilliIill<invokedynamic>();
         case iiiiIIIIIl -> var10000 = lIilliIill<invokedynamic>();
         case liiiIIIIIl -> var10000 = lIilliIill<invokedynamic>();
         case IIIIlIIIIl -> var10000 = lIilliIill<invokedynamic>();
         case lIIIlIIIIl -> var10000 = lIilliIill<invokedynamic>();
         default -> var10000 = lIilliIill<invokedynamic>();
      }

      return var10000;
   }

   static boolean illIlIilIl(iiliiiIiIIiiiiIi committed, iIlIIIIiIllIIIIi c, IiIililiIili p) {
      if (committed != null && committed.IliIlllilIi()) {
         if (committed.IIIllIIliIIl() == c) {
            return true;
         } else {
            return c == iIlIIIIiIllIIIIi.IiiiliIiil && committed.iliIiiliiiii() == iiiIiiIlIIIliiIl.lliiIlIlll && p != IiIililiIili.liIiiIlIliiIiiIlIl && p != IiIililiIili.IIliiIlIllIliiIlIl;
         }
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite lIilliIill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -3191479476147366522L ^ Long.rotateLeft(-6341919201042798346L, 23) ^ -7218447283502173267L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -7646483452234749222L ^ Long.rotateLeft(4349716526937433416L, 1) ^ 6238688499105085240L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8346326688767039653L ^ Long.rotateLeft(8885537789891605882L, 26) ^ -3288999778328489678L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 5926430444302242735L ^ Long.rotateLeft(-1639446707459845185L, 35) ^ 3139696554417313320L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6637547820535320918L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 4770016878940623981L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7314601437759574828L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -1371705897573660359L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 1454921935752069940L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6500100862702762194L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Ilillllill<invokedynamic>());
      var7.init(new SecretKeySpec(var5, ilillIiill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, liilliiill<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIIillIIil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iIIilIlIil<invokedynamic>());
      byte[] var13 = var11.decode(var3);
      var12.init(2, var10, new GCMParameterSpec(128, var13, 0, 12));
      byte[] var15 = var12.doFinal(var13, 12, var13.length - 12);
      String var16 = new String(var15, StandardCharsets.UTF_8);
      Arrays.fill(var4, (byte)0);
      Arrays.fill(var5, (byte)0);
      Arrays.fill(var6, (byte)0);
      Arrays.fill(var8, (byte)0);
      Arrays.fill(var9, (byte)0);
      Arrays.fill(var15, (byte)0);
      MethodHandle var17 = MethodHandles.constant(String.class, var16);
      return new ConstantCallSite(var17);
   }

   static boolean Illlllllilll(IIllIIllIllIIl s) {
      IilliIIllilliIIl var1 = s.IilliliilIIi(iIlIIIIiIllIIIIi.llIIiiIiil);
      return var1.iIlIlllllill() && lIilliIill<invokedynamic>().equals(var1.IlIlllIlilIl());
   }

   static boolean iliIiiliiiii(IIllIIllIllIIl threat, IlIillllIill s) {
      liiilIiliiiilIil var2 = threat.IiIlliIliiIl();
      if (var2 != null && var2.iliIiiliiiii() != null && s != null && s.IilliliilIIi() != null) {
         return var2.iliIiiliiiii().method_1022(s.IilliliilIIi()) <= (double)3.0F;
      } else {
         return false;
      }
   }

   static double IllIllllIl(IIllIIllIllIIl s, iiliiiIiIIiiiiIi c) {
      long var9 = 8986487144216450739L;
      double var2 = Double.NEGATIVE_INFINITY;
      iIlIIIIiIllIIIIi[] var4 = new iIlIIIIiIllIIIIi[]{iIlIIIIiIllIIIIi.iliiliIiil, iIlIIIIiIllIIIIi.IiiiliIiil, iIlIIIIiIllIIIIi.liiiliIiil};
      var9 ^= ((long)var4.length << 32 ^ var9) & -1L << 32;

      for(long var12 = var9 ^ (0L ^ var9) & -1L >>> 32; (int)var12 < (int)(var12 >>> 32); var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32) {
         iIlIIIIiIllIIIIi var7 = var4[(int)var12];
         if (var7 != iIlIIIIiIllIIIIi.IiiiliIiil || lllllillll(s)) {
            IilliIIllilliIIl var8 = s.IilliliilIIi(var7);
            if (var8.iIlIlllllill() && Double.isFinite(var8.IilliliilIIi())) {
               var2 = Math.max(var2, var8.IilliliilIIi());
            }
         }
      }

      if (c != null && c.IIIllIIliIIl() != null && c.IIIllIIliIIl() != iIlIIIIiIllIIIIi.lliiliIiil && Double.isFinite(c.lIiiIiIlilli())) {
         var2 = Math.max(var2, c.lIiiIiIlilli());
      }

      return var2;
   }

   private static iIlIIIIiIllIIIIi Iillllilll(iIlIIIIiIllIIIIi lane) {
      return lane == null ? iIlIIIIiIllIIIIi.lliiliIiil : lane;
   }

   static boolean IIIilIIiiIIi(IIllIIllIllIIl s, iiliiiIiIIiiiiIi c) {
      return IlIillIiilIi(s, c, true);
   }

   // $FF: synthetic method
   private static CallSite ilillIiill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)((char)(~var4[var5]) - var5))) ^ var5) ^ '쳣') + var5))))) + 'ꓩ') - var5) + var5) << 10 | (char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)((char)(~var4[var5]) - var5))) ^ var5) ^ '쳣') + var5))))) + 'ꓩ') - var5) + var5) >>> 6))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static IlIIIillllIIIill IIllllIlll(iIlIIIIiIllIIIIi p, IiIililiIili lane) {
      IlIIIillllIIIill var10000;
      switch (p) {
         case IIIIiiIiil:
            var10000 = lane == IiIililiIili.liIiiIlIliiIiiIlIl ? IlIIIillllIIIill.liIilllill : IlIIIillllIIIill.llIilllill;
            break;
         case iIIIiiIiil:
         case IlIIiiIiil:
         case iiiiliIiil:
            var10000 = IlIIIillllIIIill.llIilllill;
            break;
         case ilIIiiIiil:
            var10000 = IlIIIillllIIIill.iIIilllill;
            break;
         case IiiiliIiil:
         case lIIIiiIiil:
         case liiiliIiil:
            var10000 = lane == IiIililiIili.IIliiIlIllIliiIlIl && p == iIlIIIIiIllIIIIi.lIIIiiIiil ? IlIIIillllIIIill.IiIilllill : IlIIIillllIIIill.iIIilllill;
            break;
         case iliiliIiil:
         case llIIiiIiil:
            var10000 = IlIIIillllIIIill.IlIilllill;
            break;
         case lliiliIiil:
            var10000 = IlIIIillllIIIill.llIilllill;
            break;
         default:
            throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   static boolean IIlilIliiIli(IIllIIllIllIIl c, iiliiiIiIIiiiiIi s) {
      if (s != null && s.liiiIIllIl()) {
         IlIIIlilllIIIlil var2 = c.Iiilliiliiil() != null && c.Iiilliiliiil().IliIlllilIi() != null ? c.Iiilliiliiil().IliIlllilIi() : IlIIIlilllIIIlil.iliIiilIil;
         lliiilIiiliiilIi var3 = c.IlIlllIlilIl();
         return var2 == IlIIIlilllIIIlil.iliIiilIil && var3 != null && var3.Iilllilliill() && var3.IIillIiliIil() >= 2;
      } else {
         return false;
      }
   }

   private static IiiIliliiIli iilllIIill(lIiIlIliiIiIlIli combo, iIllIliIlllIli mode, iIlIIIIiIllIIIIi lane, IlIIIillllIIIill stance, String status, iiliiiIiIIiiiiIi x, boolean comboYield) {
      return new IiiIliliiIli(mode, combo.liIIIIllIi, combo.iiIIIIllIi, lane, stance, combo.iilIIIllIi, combo.lIlIIIllIi, combo.iIlIIIllIi, combo.IllIIIllIi, combo.lllIIIllIi, combo.IilIIIllIi, combo.lilIIIllIi, combo.illIIIllIi, status, x, comboYield, combo.IIlIIIllIi);
   }

   static illIiiilIilIiiil IilliliilIIi(IIllIIllIllIIl style, IlIIIlilllIIIlil s) {
      long var11 = 7722023141424593772L;
      lliiilIiiliiilIi var2 = style.IlIlllIlilIl();
      liiilIiliiiilIil var3 = style.IiIlliIliiIl();
      IlIillllIill var4 = style.Illlllllilll() != null ? style.Illlllllilll() : IlIillllIill.IIIIilIilIIIilIi;
      float var5 = 0.0F;
      iIlIIIIiIllIIIIi[] var6 = new iIlIIIIiIllIIIIi[]{iIlIIIIiIllIIIIi.iliiliIiil, iIlIIIIiIllIIIIi.IiiiliIiil, iIlIIIIiIllIIIIi.liiiliIiil};
      var11 ^= ((long)var6.length << 32 ^ var11) & -1L << 32;

      for(long var14 = var11 ^ (0L ^ var11) & -1L >>> 32; (int)var14 < (int)(var14 >>> 32); var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32) {
         iIlIIIIiIllIIIIi var9 = var6[(int)var14];
         IilliIIllilliIIl var10 = style.IilliliilIIi(var9);
         if (var10.iIlIlllllill() && Double.isFinite(var10.IilliliilIIi())) {
            var5 = Math.max(var5, (float)var10.IilliliilIIi());
         }
      }

      return new illIiiilIilIiiil(var2.IliIlllilIi(), var2.IIillIiliIil(), var2.Iilllilliill(), var4.IliIlllilIi(), var4.Iilllilliill(), var5, var3 == null ? 20.0F : var3.IliIlllilIi(), var3 != null && var3.IllIllllIl(), var3 != null && var3.Iiiiliiiiiii(), var3 == null ? 1.0F : var3.IIlilIliiIli(), style.IIlllIlliIll(), var2.Illillliilli() > 0, s);
   }

   static boolean IiIiliIiiiIi(IIllIIllIllIIl strikeTick, iIlIIIIiIllIIIIi committed, long s) {
      if (committed == iIlIIIIiIllIIIIi.IiiiliIiil && lIilliIill<invokedynamic>().equals(strikeTick.IilliliilIIi(iIlIIIIiIllIIIIi.IiiiliIiil).IlIlllIlilIl()) && strikeTick.IiIiliIiiiIi() == iIlIIIIiIllIIIIi.IiiiliIiil) {
         if (s != Long.MIN_VALUE && strikeTick.IIIllIIliIIl() >= s && strikeTick.IIIllIIliIIl() - s <= 6L) {
            return !strikeTick.IilliliilIIi(iIlIIIIiIllIIIIi.liiiliIiil).IIIllIIliIIl();
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   static String lliIliliIl(iiliiiIiIIiiiiIi c) {
      return c.IIIilIIiiIIi() != null && !c.IIIilIIiiIIi().isBlank() ? c.IIIilIIiiIIi() : iIiIlIliIl(iIllIliIlllIli.lIiiIIIIIl);
   }

   static boolean Illillliilli(IIllIIllIllIIl s, iiliiiIiIIiiiiIi guard, IilliIIllilliIIl c, boolean must) {
      if (c != null && c.iIlIlllllill()) {
         if (must) {
            return true;
         } else if (s.IliIlllilIi().iiIIlIIlIl() && IIiilIiiiIii(s, guard)) {
            return false;
         } else if (lIilliIill<invokedynamic>().equals(c.IlIlllIlilIl())) {
            return !Iilililiiili(s, guard);
         } else if (lIilliIill<invokedynamic>().equals(c.IlIlllIlilIl()) && IIlilIliiIli(s, guard)) {
            return false;
         } else if (IIiilIiiiIii(s, guard) && !lIilliIill<invokedynamic>().equals(c.IlIlllIlilIl())) {
            return false;
         } else {
            return c.IilliliilIIi() >= IllIllllIl(s, guard);
         }
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite liilliiill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(~((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 18222) + '맨') ^ var5) - '쮃') << 2 | (char)((char)((char)((char)(var4[var5] - 18222) + '맨') ^ var5) - '쮃') >>> 14) ^ var5) + var5) + 17575))) + '荎') ^ 'ﬦ') - 13825) + 23393))))) >>> 12 | (char)(~((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 18222) + '맨') ^ var5) - '쮃') << 2 | (char)((char)((char)((char)(var4[var5] - 18222) + '맨') ^ var5) - '쮃') >>> 14) ^ var5) + var5) + 17575))) + '荎') ^ 'ﬦ') - 13825) + 23393))))) << 4))) ^ var5) >>> 13 | (char)((char)(~((char)((char)(~((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 18222) + '맨') ^ var5) - '쮃') << 2 | (char)((char)((char)((char)(var4[var5] - 18222) + '맨') ^ var5) - '쮃') >>> 14) ^ var5) + var5) + 17575))) + '荎') ^ 'ﬦ') - 13825) + 23393))))) >>> 12 | (char)(~((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 18222) + '맨') ^ var5) - '쮃') << 2 | (char)((char)((char)((char)(var4[var5] - 18222) + '맨') ^ var5) - '쮃') >>> 14) ^ var5) + var5) + 17575))) + '荎') ^ 'ﬦ') - 13825) + 23393))))) << 4))) ^ var5) << 3));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static IlIIIillllIIIill lilIliilIl(iiliiiIiIIiiiiIi c) {
      if (c != null && c.Iilllilliill() != null) {
         return c.Iilllilliill().IliIlllilIi() == IIliIilIliIi.IiiiiIIIlliiiiIIIl ? IlIIIillllIIIill.ilIilllill : IlIIIillllIIIill.iIIilllill;
      } else {
         return IlIIIillllIIIill.IlIilllill;
      }
   }

   private static IilliIIllilliIIl ilIllIiIll(IIllIIllIllIIl ref, boolean s) {
      long var12 = 3621501080972351314L;
      IilliIIllilliIIl var2 = null;
      double var3 = Double.NEGATIVE_INFINITY;
      iIlIIIIiIllIIIIi[] var5 = new iIlIIIIiIllIIIIi[]{iIlIIIIiIllIIIIi.iliiliIiil, iIlIIIIiIllIIIIi.IiiiliIiil, iIlIIIIiIllIIIIi.liiiliIiil};
      var12 ^= ((long)var5.length << 32 ^ var12) & -1L << 32;

      for(long var15 = var12 ^ (0L ^ var12) & -1L >>> 32; (int)var15 < (int)(var15 >>> 32); var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32) {
         iIlIIIIiIllIIIIi var8 = var5[(int)var15];
         if (var8 != iIlIIIIiIllIIIIi.IiiiliIiil || lllllillll(ref)) {
            IilliIIllilliIIl var9 = ref.IilliliilIIi(var8);
            if (var9.iIlIlllllill() && (!s || var8 != iIlIIIIiIllIIIIi.liiiliIiil || ref.Iilllilliill() <= 3 && var9.lIiiIiIlilli() <= 3)) {
               double var10 = var9.IIIllIIliIIl() ? (double)1000.0F - (double)var9.lIiiIiIlilli() : var9.IilliliilIIi();
               if (var10 > var3) {
                  var3 = var10;
                  var2 = var9;
               }
            }
         }
      }

      return var2;
   }

   static boolean IlIillIiilIi(IIllIIllIllIIl s, iiliiiIiIIiiiiIi held, boolean c) {
      IilliIIllilliIIl var3 = s.IilliliilIIi(iIlIIIIiIllIIIIi.IiiiliIiil);
      IilliIIllilliIIl var4 = s.IilliliilIIi(iIlIIIIiIllIIIIi.iliiliIiil);
      if (held.IIIllIIliIIl() == iIlIIIIiIllIIIIi.iliiliIiil && lIilliIill<invokedynamic>().equals(var3.IlIlllIlilIl()) && var4.iIlIlllllill()) {
         if (var3.lIiiIiIlilli() > 9 && var4.IilliliilIIi() > var3.IilliliilIIi()) {
            return true;
         } else {
            return var4.IIIllIIliIIl() || c && held.IlIlllIlilIl() != null && s.Iilllilliill() > 9 && var4.IilliliilIIi() >= (double)1.5F * var3.IilliliilIIi() && var4.IilliliilIIi() - var3.IilliliilIIi() >= (double)8.0F;
         }
      } else {
         return false;
      }
   }

   static boolean IIillIiliIil(IIllIIllIllIIl c, iiliiiIiIIiiiiIi s) {
      long var7 = 2952164666060709668L;
      if (!Illlllllilll(c)) {
         return false;
      } else if (Iilllilliill(c)) {
         return true;
      } else if (c.IliIlllilIi().iiIIlIIlIl() && IIiilIiiiIii(c, s)) {
         return false;
      } else if (s != null && s.iIlIlllllill() == iIliIiIiIlliIiIi.IliIiIiIIi && s.Ililllililil() <= 1) {
         return false;
      } else {
         iIlIIIIiIllIIIIi[] var2 = new iIlIIIIiIllIIIIi[]{iIlIIIIiIllIIIIi.iliiliIiil, iIlIIIIiIllIIIIi.IiiiliIiil, iIlIIIIiIllIIIIi.liiiliIiil};
         var7 ^= ((long)var2.length << 32 ^ var7) & -1L << 32;

         for(long var10 = var7 ^ (0L ^ var7) & -1L >>> 32; (int)var10 < (int)(var10 >>> 32); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
            iIlIIIIiIllIIIIi var5 = var2[(int)var10];
            if (var5 != iIlIIIIiIllIIIIi.IiiiliIiil || lllllillll(c)) {
               IilliIIllilliIIl var6 = c.IilliliilIIi(var5);
               if (var6.iIlIlllllill() && (var6.iliIiiliiiii() || var6.IIIllIIliIIl()) && var6.lIiiIiIlilli() <= 1) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   static boolean IlIlllIlilIl(IIllIIllIllIIl committed, iiliiiIiIIiiiiIi c, iIlIIIIiIllIIIIi cryHeld, IiIililiIili s, boolean p) {
      long var6 = -3393286549316192769L;
      if (c != null && c.liiiIIllIl()) {
         var6 ^= ((long)(committed.Iilllilliill() <= 0 && c.IiIlliIliiIl() != null ? 1 : 0) << 32 ^ var6) & -1L << 32;
         if (cryHeld == iIlIIIIiIllIIIIi.IiiiliIiil) {
            return c.IiIlliIliiIl() != null && Iiilliiliiil(committed) || IlIillIiilIi(committed, c, p);
         } else if (cryHeld == iIlIIIIiIllIIIIi.lIIIiiIiil) {
            if (s == IiIililiIili.IIliiIlIllIliiIlIl) {
               return false;
            } else if (lIilliIill<invokedynamic>().equals(committed.IilliliilIIi(iIlIIIIiIllIIIIi.lIIIiiIiil).IlIlllIlilIl())) {
               return (boolean)((int)(var6 >>> 32));
            } else {
               return c.IIIllIIliIIl() != iIlIIIIiIllIIIIi.lIIIiiIiil || (int)(var6 >>> 32) != 0;
            }
         } else if (cryHeld == iIlIIIIiIllIIIIi.llIIiiIiil) {
            if (lIilliIill<invokedynamic>().equals(committed.IilliliilIIi(iIlIIIIiIllIIIIi.llIIiiIiil).IlIlllIlilIl())) {
               return committed.IilliliilIIi(iIlIIIIiIllIIIIi.liiiliIiil).IIIllIIliIIl();
            } else if (c.iliIiiliiiii() == iiiIiiIlIIIliiIl.lliiIlIlll && !IIlllIlliIll(committed)) {
               return (int)(var6 >>> 32) != 0 || lIilliIill<invokedynamic>().equals(committed.IilliliilIIi(iIlIIIIiIllIIIIi.llIIiiIiil).IlIlllIlilIl()) && IIiilIiiiIii(committed, c);
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private static IiiIliliiIli IlIllllIll(lIiIlIliiIiIlIli self, IIllIIllIllIIl a, IIIilIIiiIIi x, lliiilIiiliiilIi s) {
      if (a.Iilllilliill() > 3 && !self.IIlIIIllIi.iiIIlIIlIl()) {
         return null;
      } else if (x.IlIlllIlilIl() >= s.IliIlllilIi() - 0.5F && !s.Iilllilliill()) {
         return null;
      } else {
         IilliIIllilliIIl var4 = ilIllIiIll(a, self.IIlIIIllIi.iiIIlIIlIl());
         return var4 != null && var4.IIIllIIliIIl() ? liIlliiIll(self, a, var4) : null;
      }
   }

   static boolean Iiilliiliiil(IIllIIllIllIIl s) {
      String var1 = s.IilliliilIIi(iIlIIIIiIllIIIIi.IiiiliIiil).IlIlllIlilIl();
      if (lIilliIill<invokedynamic>().equals(var1)) {
         return s.IilliliilIIi(iIlIIIIiIllIIIIi.IiiiliIiil).lIiiIiIlilli() >= 2 || s.IilliliilIIi(iIlIIIIiIllIIIIi.liiiliIiil).IIIllIIliIIl();
      } else if (!lIilliIill<invokedynamic>().equals(var1)) {
         return false;
      } else {
         lliiilIiiliiilIi var2 = s.IlIlllIlilIl();
         return var2 != null && var2.Iliilliiilii() >= 0.8F || s.IilliliilIIi(iIlIIIIiIllIIIIi.liiiliIiil).IIIllIIliIIl();
      }
   }

   static boolean IIlllIlliIll(IIllIIllIllIIl s) {
      IIIilIIiiIIi var1 = s.llIIlilIIl();
      lliiilIiiliiilIi var2 = s.IlIlllIlilIl();
      if (var1 != null && var1.IliIlllilIi() && var2 != null) {
         return var1.iIlIlllllill(var2.IliIlllilIi()) || !var2.Iilllilliill() && var1.IlIlllIlilIl() >= var2.IliIlllilIi() - 0.5F;
      } else {
         return false;
      }
   }

   static boolean IIiilIiiiIii(IIllIIllIllIIl c, iiliiiIiIIiiiiIi s) {
      if (s != null && s.liiiIIllIl() && s.iliIiiliiiii() == iiiIiiIlIIIliiIl.lliiIlIlll) {
         if (s.IlIlllIlilIl() == null && s.Illlllllilll() == null) {
            if (s.IiIlliIliiIl() != null && c.Iilllilliill() <= 0) {
               return true;
            } else {
               return s.IIIllIIliIIl() == iIlIIIIiIllIIIIi.iliiliIiil || s.IIIllIIliIIl() == iIlIIIIiIllIIIIi.IiiiliIiil;
            }
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public IiIililiIili liiiIIllIl() {
      return this.iilllIiill.liiiIIllIl();
   }

   public iilllillIIillill(IlIIiiillIIiii posture) {
      this.iilllIiill = posture == null ? new IlIIiiillIIiii() : posture;
   }

   // $FF: synthetic method
   private static CallSite iIIilIlIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(var4[var5] ^ var5))) << 2 | (char)(-((char)(var4[var5] ^ var5))) >>> 14))) - var5) >>> 5 | (char)((char)(-((char)((char)(-((char)(var4[var5] ^ var5))) << 2 | (char)(-((char)(var4[var5] ^ var5))) >>> 14))) - var5) << 11) - 30333) - var5) + 11384) >>> 7 | (char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(var4[var5] ^ var5))) << 2 | (char)(-((char)(var4[var5] ^ var5))) >>> 14))) - var5) >>> 5 | (char)((char)(-((char)((char)(-((char)(var4[var5] ^ var5))) << 2 | (char)(-((char)(var4[var5] ^ var5))) >>> 14))) - var5) << 11) - 30333) - var5) + 11384) << 9))))) ^ '軂') - var5) + var5))) + var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static boolean IIIIllIIIl(IIllIIllIllIIl c, iiliiiIiIIiiiiIi s) {
      return s != null && s.liiiIIllIl() && s.IIIllIIliIIl() == iIlIIIIiIllIIIIi.lIIIiiIiil && s.IiIlliIliiIl() != null && c.Iilllilliill() <= 0;
   }

   private static IiiIliliiIli iiiIlIIIll(lIiIlIliiIiIlIli x, iIllIliIlllIli mode, iiliiiIiIIiiiiIi b) {
      lIIlliIIll(x, b);
      iIlIIIIiIllIIIIi var3 = b.IIIllIIliIIl() != null && b.IIIllIIliIIl() != iIlIIIIiIllIIIIi.lliiliIiil ? b.IIIllIIliIIl() : iIlIIIIiIllIIIIi.ilIIiiIiil;
      return iilllIIill(x, mode, var3, lilIliilIl(b), iIiIlIliIl(mode), b, false);
   }

   static boolean Ililllililil(iIlIIIIiIllIIIIi committed, String why) {
      if (committed == null) {
         return false;
      } else {
         boolean var10000;
         switch (committed) {
            case IIIIiiIiil:
            case iIIIiiIiil:
            case IlIIiiIiil:
            case iiiiliIiil:
            case ilIIiiIiil:
               var10000 = true;
               break;
            case IiiiliIiil:
               var10000 = lIilliIill<invokedynamic>().equals(why);
               break;
            default:
               var10000 = false;
         }

         return var10000;
      }
   }

   public void iIlIlllllill() {
      this.iilllIiill.iIlIlllllill();
      this.IIillIiill = Long.MIN_VALUE;
      this.lIillIiill = Long.MIN_VALUE;
   }

   static boolean iiIIlIIlIl(String why) {
      return lIilliIill<invokedynamic>().equals(why) || lIilliIill<invokedynamic>().equals(why);
   }

   private static IiiIliliiIli IiiIlliiIl(lIiIlIliiIiIlIli threat, IIllIIllIllIIl x, iiliiiIiIIiiiiIi c, IlIillllIill s) {
      if (c.Iiilliiliiil() < 3 && lIiiIiIlilli(x, s)) {
         return iilllIIill(threat, iIllIliIlllIli.iIiiIIIIIl, iIlIIIIiIllIIIIi.iliiliIiil, lilIliilIl(c), iIiIlIliIl(iIllIliIlllIli.iIiiIIIIIl), c, true);
      } else {
         lIIlliIIll(threat, c);
         iIlIIIIiIllIIIIi var4 = IIIIllIIIl(x, c) ? iIlIIIIiIllIIIIi.liiiliIiil : Iillllilll(c.IIIllIIliIIl());
         return iilllIIill(threat, iIllIliIlllIli.lIiiIIIIIl, var4, lilIliilIl(c), lliIliliIl(c), c, false);
      }
   }

   static boolean Iilllilliill(IIllIIllIllIIl s) {
      IIIilIIiiIIi var1 = s.llIIlilIIl();
      lliiilIiiliiilIi var2 = s.IlIlllIlilIl();
      return var1 != null && var1.IliIlllilIi() && var2 != null && var1.IiIlliIliiIl() >= var2.IliIlllilIi() - 0.5F;
   }

   // $FF: synthetic method
   private static CallSite Ilillllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)(-((char)(-((char)(var4[var5] << 7 | var4[var5] >>> 9))))))) >>> 6 | (char)(-((char)(-((char)(-((char)(var4[var5] << 7 | var4[var5] >>> 9))))))) << 10) ^ var5) ^ 5053) + 1290) ^ 10894))) + var5) >>> 4 | (char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)(-((char)(-((char)(var4[var5] << 7 | var4[var5] >>> 9))))))) >>> 6 | (char)(-((char)(-((char)(-((char)(var4[var5] << 7 | var4[var5] >>> 9))))))) << 10) ^ var5) ^ 5053) + 1290) ^ 10894))) + var5) << 12) - 'ꗜ') ^ 2009))) - '\ue448') << 2 | (char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)(-((char)(-((char)(var4[var5] << 7 | var4[var5] >>> 9))))))) >>> 6 | (char)(-((char)(-((char)(-((char)(var4[var5] << 7 | var4[var5] >>> 9))))))) << 10) ^ var5) ^ 5053) + 1290) ^ 10894))) + var5) >>> 4 | (char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)(-((char)(-((char)(var4[var5] << 7 | var4[var5] >>> 9))))))) >>> 6 | (char)(-((char)(-((char)(-((char)(var4[var5] << 7 | var4[var5] >>> 9))))))) << 10) ^ var5) ^ 5053) + 1290) ^ 10894))) + var5) << 12) - 'ꗜ') ^ 2009))) - '\ue448') >>> 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static boolean llIIlilIIl(iIlIIIIiIllIIIIi committed) {
      return committed != iIlIIIIiIllIIIIi.ilIIiiIiil && committed != iIlIIIIiIllIIIIi.lIIIiiIiil;
   }

   static boolean Iliilliiilii(liiilIiliiiilIil self, lliiilIiiliiilIi t) {
      if (self != null && self.Iiiiliiiiiii() && t != null && !lIllilIliIllilIl.IIIllIIliIIl(t)) {
         return t.IIillIiliIil() >= 1 && t.IliIlllilIi() > 8.0F;
      } else {
         return false;
      }
   }

   static boolean iIIIlIlIIl(String why) {
      return why != null && (why.equals(lIilliIill<invokedynamic>()) || why.startsWith(lIilliIill<invokedynamic>()));
   }

   // $FF: synthetic method
   private static CallSite IIIillIIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)(var4[var5] ^ var5))) >>> 8 | (char)(-((char)(var4[var5] ^ var5))) << 8) + var5))) ^ '웯') - 6621) - var5) + 13349) ^ var5) - 20561))) - '豍') + var5)))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean IiIlliIliiIl(IIllIIllIllIIl s) {
      long var4 = 2065317216494468911L;
      IIIilIIiiIIi var1 = s.llIIlilIIl();
      lliiilIiiliiilIi var2 = s.IlIlllIlilIl();
      if (var1 != null && var2 != null) {
         var4 ^= ((long)(!s.IilliliilIIi(iIlIIIIiIllIIIIi.llIIiiIiil).iIlIlllllill() || !var1.iIlIlllllill(var2.IliIlllilIi()) && !IIlllIlliIll(s) ? 0 : 1) << 32 ^ var4) & -1L << 32;
         return (int)(var4 >>> 32) != 0 || Illlllllilll(s) && Iilllilliill(s);
      } else {
         return false;
      }
   }

   static boolean lIiiIiIlilli(IIllIIllIllIIl s, IlIillllIill threat) {
      return threat.iIlIlllllill() >= 0 && threat.Illlllllilll() <= 2 && threat.liiiIIllIl() >= Math.max(6.0F, 0.3F * s.IlIlllIlilIl().IliIlllilIi()) && iIlllIllll(s) && (s.IIillIiliIil() >= 1 || iliIiiliiiii(s, threat));
   }

   private static boolean lllllillll(IIllIIllIllIIl s) {
      return s.Iiilliiliiil() != null && s.Iiilliiliiil().iliIiiliiiii() && !s.Ililllililil();
   }

   static boolean IIIllIIliIIl(IIllIIllIllIIl c, iiliiiIiIIiiiiIi s, iIlIIIIiIllIIIIi committed, IiIililiIili p) {
      return IlIlllIlilIl(c, s, committed, p, true);
   }

   public IiiIliliiIli IliIlllilIi(IIllIIllIllIIl s) {
      long var48 = 665921129934004602L;
      long var50 = -1291971205022817826L;
      long var52 = 918365361533944669L;
      long var54 = 3037208312220895959L;
      long var56 = 6059868363844217299L;
      long var58 = 1224986626593200187L;
      long var44 = -1596975577752462591L;
      long var60 = -8110325567726786894L;
      long var46 = -1676756768369706949L;
      IlIIIlilllIIIlil var2 = s.Iiilliiliiil() != null && s.Iiilliiliiil().IliIlllilIi() != null ? s.Iiilliiliiil().IliIlllilIi() : IlIIIlilllIIIlil.iliIiilIil;
      IiIililiIili var3 = this.iilllIiill.IliIlllilIi(IilliliilIIi(s, var2));
      lilliIiiilliIi var4 = lilliIiiilliIi.IliIlllilIi(var3, var2);
      liiilIiliiiilIil var5 = s.IiIlliIliiIl();
      lliiilIiiliiilIi var6 = s.IlIlllIlilIl();
      iiliiiIiIIiiiiIi var7 = s.IIIIllIIIl() != null ? s.IIIIllIIIl() : iiliiiIiIIiiiiIi.iIiliIIlIi;
      var44 ^= ((long)(var7.IIIllIIliIIl() == iIlIIIIiIllIIIIi.iliiliIiil && this.lIillIiill == s.IIIllIIliIIl() - 1L ? 1 : 0) << 32 ^ var44) & -1L << 32;
      this.lIillIiill = var7.IIIllIIliIIl() == iIlIIIIiIllIIIIi.iliiliIiil ? s.IIIllIIliIIl() : Long.MIN_VALUE;
      iiliiiIiIIiiiiIi var9 = s.IiIIlliIIl() != null ? s.IiIIlliIIl() : iiliiiIiIIiiiiIi.iIiliIIlIi;
      IIIilIIiiIIi var10 = s.llIIlilIIl() != null ? s.llIIlilIIl() : IIIilIIiiIIi.IIIllllIIlll;
      IlIillllIill var11 = s.Illlllllilll() != null ? s.Illlllllilll() : IlIillllIill.IIIIilIilIIIilIi;
      llilIlIlililIlIl var12 = s.Iiilliiliiil();
      var44 ^= ((long)(var5 == null || !var5.liiiIIllIl() || !(var5.IliIlllilIi() <= 10.0F) && !(var5.IIlilIliiIli() <= 0.25F) && s.Illillliilli() < 3 ? 0 : 1) ^ var44) & -1L >>> 32;
      lIiIlIliiIiIlIli var14 = new lIiIlIliiIiIlIli(var3, var4);
      var14.IIlIIIllIi = s.IliIlllilIi();
      var14.lIlIIIllIi = (int)var44 != 0 ? 2.5F : var4.IiIlliIliiIl();
      var14.iIlIIIllIi = var4.iIlIlllllill();
      var14.IllIIIllIi = illIIIIlIilIIIIl.liiiIIllIl(var6.IIIllIIliIIl(), var6.IlIlllIlilIl(), var6.Iilllilliill(), s.IIlilIliiIli(), var4.IIlllIlliIll(), var14.IIlIIIllIi);
      var14.lllIIIllIi = var2 == IlIIIlilllIIIlil.iliIiilIil ? var6.Iilllilliill() && var6.IIillIiliIil() >= 2 : var3 == IiIililiIili.IlIiiIlIlllIiiIlIl && var6.Iilllilliill() && var6.IIillIiliIil() >= 3;
      var46 ^= ((long)(s.IIlllIlliIll() != 0 && (var6.illIlIilIl() == null || var6.illIlIilIl().iIlIlllllill() != 0) && !(var11.IliIlllilIi() < 4.0F) ? 0 : 1) << 32 ^ var46) & -1L << 32;
      var14.illIIIllIi = (int)(var46 >>> 32) != 0 && (var2 == IlIIIlilllIIIlil.liiIiilIil || var5 == null || var5.Illlllllilll() > (double)8.0F);
      var14.IilIIIllIi = illlliIlIillliIl.IilIiiiIll;
      var14.lilIIIllIi = s.Iilllilliill() <= 0 || var14.IIlIIIllIi.iiIIlIIlIl();
      var14.iilIIIllIi = false;
      var46 ^= ((long)(var11.Illlllllilll() <= 2 && var11.liiiIIllIl() >= Math.max(6.0F, 0.3F * var6.IliIlllilIi()) && s.IIillIiliIil() == 0 ? 1 : 0) ^ var46) & -1L >>> 32;
      var48 ^= ((long)(var10.IilliliilIIi(var6.IliIlllilIi()) && s.IIillIiliIil() == 0 ? 1 : 0) << 32 ^ var48) & -1L << 32;
      var48 ^= ((long)((int)var46 == 0 && (int)(var48 >>> 32) == 0 ? 0 : 1) ^ var48) & -1L >>> 32;
      var50 ^= ((long)(var10.iIlIlllllill(var6.IliIlllilIi()) && s.IilliliilIIi(iIlIIIIiIllIIIIi.llIIiiIiil).iIlIlllllill() ? 1 : 0) << 32 ^ var50) & -1L << 32;
      var50 ^= ((long)((int)(var50 >>> 32) == 0 && !IIlllIlliIll(s) ? 0 : 1) ^ var50) & -1L >>> 32;
      var52 ^= ((long)(var5 != null && IIillIiliIil(s, var7) ? 1 : 0) << 32 ^ var52) & -1L << 32;
      var52 ^= ((long)((int)(var52 >>> 32) != 0 && Iilllilliill(s) ? 1 : 0) ^ var52) & -1L >>> 32;
      IilliIIllilliIIl var23 = s.IilliliilIIi(iIlIIIIiIllIIIIi.IiiiliIiil);
      iIlIIIIiIllIIIIi var24 = s.IlIillIiilIi();
      var54 ^= ((long)(var24 != null && var24 != iIlIIIIiIllIIIIi.lliiliIiil && s.IilliliilIIi(var24).iIlIlllllill() ? 1 : 0) << 32 ^ var54) & -1L << 32;
      if (var5 != null && (int)var50 == 0 && (int)var52 == 0 && var23.iIlIlllllill() && lIilliIill<invokedynamic>().equals(var23.IlIlllIlilIl()) && !IiIIlliIIl(var3, var23.IIIllIIliIIl(), var24, (boolean)((int)(var54 >>> 32)), (int)(var54 >>> 32) != 0 && var24 == iIlIIIIiIllIIIIi.IIIIiiIiil && lIllilIliIllilIl.iIlIlllllill(s))) {
         var14.lilIIIllIi = true;
         return iilllIIill(var14, iIllIliIlllIli.liliIIIIIl, iIlIIIIiIllIIIIi.IiiiliIiil, IlIIIillllIIIill.iIIilllill, iIiIlIliIl(iIllIliIlllIli.liliIIIIIl), var7.IliIlllilIi() ? var7 : null, var7.IliIlllilIi());
      } else {
         iIlIIIIiIllIIIIi var26 = s.IlIillIiilIi();
         var54 ^= ((long)(var26 != null && var26 != iIlIIIIiIllIIIIi.lliiliIiil && s.IilliliilIIi(var26).iIlIlllllill() ? 1 : 0) ^ var54) & -1L >>> 32;
         var56 ^= ((long)((int)var54 != 0 && IlIlllIlilIl(s, var7, var26, var3, (boolean)((int)(var44 >>> 32))) && !IiIiliIiiiIi(s, var26, this.IIillIiill) ? 1 : 0) << 32 ^ var56) & -1L << 32;
         if ((int)(var56 >>> 32) != 0 && var26 == iIlIIIIiIllIIIIi.IiiiliIiil && lIilliIill<invokedynamic>().equals(s.IilliliilIIi(var26).IlIlllIlilIl())) {
            this.IIillIiill = s.IIIllIIliIIl();
         }

         if ((int)var54 != 0 && (int)(var56 >>> 32) == 0) {
            var56 ^= ((long)((var26 != iIlIIIIiIllIIIIi.iIIIiiIiil && var26 != iIlIIIIiIllIIIIi.IlIIiiIiil && var26 != iIlIIIIiIllIIIIi.iiiiliIiil || !var11.Iilllilliill()) && (var26 != iIlIIIIiIllIIIIi.IIIIiiIiil || lIllilIliIllilIl.iIlIlllllill(s)) && ((int)(var50 >>> 32) == 0 || !lIlIliIlIl(var26, s.IilliliilIIi(var26).IlIlllIlilIl())) && ((int)(var52 >>> 32) == 0 || !Ililllililil(var26, s.IilliliilIIi(var26).IlIlllIlilIl())) && ((int)(var48 >>> 32) == 0 || var26 != iIlIIIIiIllIIIIi.IiiiliIiil || !lIilliIill<invokedynamic>().equals(s.IilliliilIIi(var26).IlIlllIlilIl())) ? 0 : 1) ^ var56) & -1L >>> 32;
            if ((int)var56 == 0) {
               if (var26 == iIlIIIIiIllIIIIi.llIIiiIiil && Illlllllilll(s)) {
                  var14.iilIIIllIi = false;
                  return iilllIIill(var14, iIllIliIlllIli.iIiiIIIIIl, iIlIIIIiIllIIIIi.llIIiiIiil, IlIIIillllIIIill.llIilllill, lIilliIill<invokedynamic>(), var7.IliIlllilIi() ? var7 : null, var7.IliIlllilIi());
               }

               iiliiiIiIIiiiiIi var30 = var26 == iIlIIIIiIllIIIIi.ilIIiiIiil ? var9 : var7;
               iiliiiIiIIiiiiIi var31 = illIlIilIl(var30, var26, var3) ? var30 : null;
               IlIIIillllIIIill var65 = var31 != null ? lilIliilIl(var31) : IIllllIlll(var26, var3);
               iIllIliIlllIli var69 = IIiIllIiIl(var26, var3);
               String var73 = var26 == iIlIIIIiIllIIIIi.llIIiiIiil ? lIilliIill<invokedynamic>() : (var31 != null && var26 != iIlIIIIiIllIIIIi.ilIIiiIiil ? lliIliliIl(var31) : iIiIlIliIl(var69));
               var14.iilIIIllIi = (int)var48 != 0 && (var26 != iIlIIIIiIllIIIIi.IiiiliIiil || !lIilliIill<invokedynamic>().equals(s.IilliliilIIi(var26).IlIlllIlilIl()));
               return iilllIIill(var14, var69, var26, var65, var73, var31, false);
            }
         }

         var56 ^= ((long)(var12 != null && var12.IlIlllIlilIl() ? 1 : 0) ^ var56) & -1L >>> 32;
         var58 ^= ((long)((int)var56 != 0 && lIllilIliIllilIl.IlIlllIlilIl(var6, var2) && lIllilIliIllilIl.IliIlllilIi(s) && s.IilliliilIIi(iIlIIIIiIllIIIIi.IIIIiiIiil).iIlIlllllill() ? 1 : 0) << 32 ^ var58) & -1L << 32;
         var58 ^= ((long)((int)(var58 >>> 32) == 0 || Iliilliiilii(var5, var6) && Iiiiliiiiiii(var2, var3) ? 0 : 1) ^ var58) & -1L >>> 32;
         if (var3 == IiIililiIili.IIliiIlIllIliiIlIl) {
            if ((int)(var58 >>> 32) != 0) {
               return iilllIIill(var14, iIllIliIlllIli.IliiIIIIIl, iIlIIIIiIllIIIIi.IIIIiiIiil, IlIIIillllIIIill.llIilllill, iIiIlIliIl(iIllIliIlllIli.IliiIIIIIl), (iiliiiIiIIiiiiIi)null, false);
            } else {
               iIlIIIIiIllIIIIi var64 = var12 != null && var12.IiIlliIliiIl() && s.IilliliilIIi(iIlIIIIiIllIIIIi.lIIIiiIiil).iIlIlllllill() ? iIlIIIIiIllIIIIi.lIIIiiIiil : (iIlllIllll(s) ? iIlIIIIiIllIIIIi.iliiliIiil : iIlIIIIiIllIIIIi.lliiliIiil);
               return iilllIIill(var14, iIllIliIlllIli.iliiIIIIIl, var64, IlIIIillllIIIill.IiIilllill, iIiIlIliIl(iIllIliIlllIli.iliiIIIIIl), (iiliiiIiIIiiiiIi)null, false);
            }
         } else if (s.IIlilIliiIli() > 10 || var14.IIlIIIllIi.iIIIlIlIIl() || var2 == IlIIIlilllIIIlil.iliIiilIil && var6.IIillIiliIil() >= 1 || var7.iIlIlllllill() == iIliIiIiIlliIiIi.IliIiIiIIi && var7.Ililllililil() <= 3) {
            if ((int)var58 != 0) {
               return iilllIIill(var14, iIllIliIlllIli.IliiIIIIIl, iIlIIIIiIllIIIIi.IIIIiiIiil, IlIIIillllIIIill.llIilllill, iIiIlIliIl(iIllIliIlllIli.IliiIIIIIl), (iiliiiIiIIiiiiIi)null, false);
            } else if ((int)var56 != 0 && lIllilIliIllilIl.lIiiIiIlilli(var6, var2) && var3 == IiIililiIili.liIiiIlIliiIiiIlIl && var2 != IlIIIlilllIIIlil.iliIiilIil && var5 != null && var5.Illlllllilll() < (double)24.0F) {
               iIlIIIIiIllIIIIi var63 = iIlllIllll(s) ? iIlIIIIiIllIIIIi.iliiliIiil : iIlIIIIiIllIIIIi.lliiliIiil;
               IlIIIillllIIIill var68 = var5.Illlllllilll() < (double)20.0F ? IlIIIillllIIIill.IiIilllill : IlIIIillllIIIill.llIilllill;
               return iilllIIill(var14, iIllIliIlllIli.iIiiIIIIIl, var63, var68, lIilliIill<invokedynamic>(), (iiliiiIiIIiiiiIi)null, false);
            } else {
               var14.iilIIIllIi = (boolean)((int)var48);
               IilliIIllilliIIl var62 = s.IilliliilIIi(iIlIIIIiIllIIIIi.llIIiiIiil);
               if ((int)(var52 >>> 32) != 0) {
                  IiiIliliiIli var67 = IlIllllIll(var14, s, var10, var6);
                  if (var67 != null) {
                     return var67;
                  } else {
                     var14.iilIIIllIi = false;
                     return iilllIIill(var14, iIllIliIlllIli.iIiiIIIIIl, iIlIIIIiIllIIIIi.llIIiiIiil, IlIIIillllIIIill.llIilllill, lIilliIill<invokedynamic>(), var7.IliIlllilIi() ? var7 : null, var7.IliIlllilIi());
                  }
               } else if (var5 != null && Illillliilli(s, var7, var62, (boolean)((int)var50))) {
                  IiiIliliiIli var66 = IlIllllIll(var14, s, var10, var6);
                  return var66 != null ? var66 : iilllIIill(var14, iIllIliIlllIli.iIiiIIIIIl, iIlIIIIiIllIIIIi.llIIiiIiil, IlIIIillllIIIill.IlIilllill, lIilliIill<invokedynamic>(), (iiliiiIiIIiiiiIi)null, false);
               } else {
                  IilliIIllilliIIl var33 = s.IilliliilIIi(iIlIIIIiIllIIIIi.ilIIiiIiil);
                  if (var5 != null && var33.iIlIlllllill() && var9.IliIlllilIi()) {
                     IiiIliliiIli var72 = IlIllllIll(var14, s, var10, var6);
                     if (var72 != null) {
                        return var72;
                     } else if (iIIIlIlIIl(var33.IlIlllIlilIl())) {
                        var14.illIIIllIi = true;
                        if (lIilliIill<invokedynamic>().equals(var33.IlIlllIlilIl())) {
                           if (s.IilliliilIIi(iIlIIIIiIllIIIIi.iIIIiiIiil).iIlIlllllill()) {
                              return iilllIIill(var14, iIllIliIlllIli.lliiIIIIIl, iIlIIIIiIllIIIIi.iIIIiiIiil, IlIIIillllIIIill.llIilllill, iIiIlIliIl(iIllIliIlllIli.lliiIIIIIl), (iiliiiIiIIiiiiIi)null, false);
                           }

                           if (s.IilliliilIIi(iIlIIIIiIllIIIIi.IlIIiiIiil).iIlIlllllill()) {
                              return iilllIIill(var14, iIllIliIlllIli.iiiiIIIIIl, iIlIIIIiIllIIIIi.IlIIiiIiil, IlIIIillllIIIill.llIilllill, iIiIlIliIl(iIllIliIlllIli.iiiiIIIIIl), (iiliiiIiIIiiiiIi)null, false);
                           }
                        }

                        return iiiIlIIIll(var14, iIllIliIlllIli.lIIIlIIIIl, var9);
                     } else {
                        return iiiIlIIIll(var14, iIllIliIlllIli.IIIIlIIIIl, var9);
                     }
                  } else if (var7.iIlIlllllill() == iIliIiIiIlliIiIi.lliIiIiIIi && var7.iliIiiliiiii() == iiiIiiIlIIIliiIl.lliiIlIlll && var3 != IiIililiIili.liIiiIlIliiIiiIlIl && var3 != IiIililiIili.IIliiIlIllIliiIlIl && var5 != null) {
                     IilliIIllilliIIl var71 = s.Iilllilliill() > 3 && !var14.IIlIIIllIi.iiIIlIIlIl() ? null : ilIllIiIll(s, var14.IIlIIIllIi.iiIIlIIlIl());
                     return var71 != null && var71.IIIllIIliIIl() ? liIlliiIll(var14, s, var71) : IiiIlliiIl(var14, s, var7, var11);
                  } else if (var7.IliIlllilIi() && var7.iIlIlllllill() != iIliIiIiIlliIiIi.lliIiIiIIi && var7.iliIiiliiiii() == iiiIiiIlIIIliiIl.lliiIlIlll && var3 != IiIililiIili.liIiiIlIliiIiiIlIl) {
                     return IiiIlliiIl(var14, s, var7, var11);
                  } else {
                     if (var5 != null && (var5.IllIllllIl() || var5.IliIlllilIi() <= 9.0F) && (s.Iilllilliill() <= 3 || var14.IIlIIIllIi.iiIIlIIlIl())) {
                        IilliIIllilliIIl var34 = ilIllIiIll(s, var14.IIlIIIllIi.iiIIlIIlIl());
                        if (var34 != null) {
                           return liIlliiIll(var14, s, var34);
                        }
                     }

                     if (var5 == null) {
                        if (s.IIiilIiiiIii() >= (double)12.0F && !s.Iliilliiilii() && s.IilliliilIIi(iIlIIIIiIllIIIIi.iIIIiiIiil).iIlIlllllill()) {
                           return iilllIIill(var14, iIllIliIlllIli.lliiIIIIIl, iIlIIIIiIllIIIIi.iIIIiiIiil, IlIIIillllIIIill.llIilllill, iIiIlIliIl(iIllIliIlllIli.lliiIIIIIl), (iiliiiIiIIiiiiIi)null, false);
                        } else if (var14.illIIIllIi && s.IilliliilIIi(iIlIIIIiIllIIIIi.IlIIiiIiil).iIlIlllllill()) {
                           return iilllIIill(var14, iIllIliIlllIli.iiiiIIIIIl, iIlIIIIiIllIIIIi.IlIIiiIiil, IlIIIillllIIIill.llIilllill, iIiIlIliIl(iIllIliIlllIli.iiiiIIIIIl), (iiliiiIiIIiiiiIi)null, false);
                        } else {
                           return var12 != null && var12.Illlllllilll() && s.Iilililiiili() ? iilllIIill(var14, iIllIliIlllIli.liiiIIIIIl, iIlIIIIiIllIIIIi.lliiliIiil, IlIIIillllIIIill.IIlilllill, iIiIlIliIl(iIllIliIlllIli.liiiIIIIIl), (iiliiiIiIIiiiiIi)null, false) : iilllIIill(var14, iIllIliIlllIli.IlliIIIIIl, iIlIIIIiIllIIIIi.lliiliIiil, IlIIIillllIIIill.llIilllill, iIiIlIliIl(iIllIliIlllIli.IlliIIIIIl), (iiliiiIiIIiiiiIi)null, false);
                        }
                     } else if (var7.IilliliilIIi() == iIlIIillIllIIill.liiilllill) {
                        return iilllIIill(var14, iIllIliIlllIli.lIiiIIIIIl, Iillllilll(var7.IIIllIIliIIl()), IlIIIillllIIIill.ilIilllill, lliIliliIl(var7), var7, false);
                     } else {
                        IilliIIllilliIIl var70 = null;
                        double var35 = Double.NEGATIVE_INFINITY;
                        iIlIIIIiIllIIIIi var37 = new iIlIIIIiIllIIIIi[]{iIlIIIIiIllIIIIi.iliiliIiil, iIlIIIIiIllIIIIi.IiiiliIiil, iIlIIIIiIllIIIIi.liiiliIiil};
                        var60 ^= ((long)((Object[])var37).length << 32 ^ var60) & -1L << 32;

                        for(long var94 = var60 ^ (0L ^ var60) & -1L >>> 32; (int)var94 < (int)(var94 >>> 32); var94 ^= (var94 ^ var94 + (long)1) & -1L >>> 32) {
                           iIlIIIIiIllIIIIi var40 = ((Object[])var37)[(int)var94];
                           if (var40 != iIlIIIIiIllIIIIi.IiiiliIiil || lllllillll(s)) {
                              IilliIIllilliIIl var41 = s.IilliliilIIi(var40);
                              if (var41.iIlIlllllill() && Double.isFinite(var41.IilliliilIIi())) {
                                 double var42 = var41.IilliliilIIi() + (var40 == s.IiIiliIiiiIi() ? (double)1.0F : (double)0.0F);
                                 if (var42 > var35) {
                                    var35 = var42;
                                    var70 = var41;
                                 }
                              }
                           }
                        }

                        if ((var7.IilliliilIIi() == iIlIIillIllIIill.iliilllill || var7.IilliliilIIi() == iIlIIillIllIIill.Iiiilllill) && var7.lIiiIiIlilli() >= Math.max((double)var4.IiIlliIliiIl(), (double)Iliiilliii.liliIiIliiliIiIl[var2.ordinal()] * (var70 == null ? (double)0.0F : var70.IilliliilIIi()))) {
                           return iilllIIill(var14, iIllIliIlllIli.lIiiIIIIIl, Iillllilll(var7.IIIllIIliIIl()), lilIliilIl(var7), lliIliliIl(var7), var7, false);
                        } else if (var5.Illlllllilll() > (double)6.0F) {
                           var37 = s.IilliliilIIi(iIlIIIIiIllIIIIi.iliiliIiil).iIlIlllllill() ? iIlIIIIiIllIIIIi.iliiliIiil : iIlIIIIiIllIIIIi.lliiliIiil;
                           return iilllIIill(var14, iIllIliIlllIli.llliIIIIIl, var37, IlIIIillllIIIill.ilIilllill, iIiIlIliIl(iIllIliIlllIli.llliIIIIIl), (iiliiiIiIIiiiiIi)null, false);
                        } else if (var70 != null && var70.IilliliilIIi() >= (double)var14.lIlIIIllIi * (double)0.5F) {
                           iIllIliIlllIli var75 = var70.liiiIIllIl() == iIlIIIIiIllIIIIi.iliiliIiil ? ((int)var44 != 0 ? iIllIliIlllIli.IiliIIIIIl : iIllIliIlllIli.illiIIIIIl) : IIiIllIiIl(var70.liiiIIllIl(), var3);
                           IlIIIillllIIIill var38 = var70.liiiIIllIl() != iIlIIIIiIllIIIIi.IiiiliIiil && var70.liiiIIllIl() != iIlIIIIiIllIIIIi.liiiliIiil ? IlIIIillllIIIill.IlIilllill : IlIIIillllIIIill.iIIilllill;
                           return iilllIIill(var14, var75, var70.liiiIIllIl(), var38, iIiIlIliIl(var75), (iiliiiIiIIiiiiIi)null, false);
                        } else if (var2 == IlIIIlilllIIIlil.liiIiilIil && var3 == IiIililiIili.liIiiIlIliiIiiIlIl && s.IilliliilIIi(iIlIIIIiIllIIIIi.iiiiliIiil).iIlIlllllill()) {
                           return iilllIIill(var14, iIllIliIlllIli.iIiiIIIIIl, iIlIIIIiIllIIIIi.iiiiliIiil, IlIIIillllIIIill.llIilllill, iIiIlIliIl(iIllIliIlllIli.iIiiIIIIIl), (iiliiiIiIIiiiiIi)null, false);
                        } else {
                           var37 = s.IilliliilIIi(iIlIIIIiIllIIIIi.iliiliIiil).iIlIlllllill() ? iIlIIIIiIllIIIIi.iliiliIiil : iIlIIIIiIllIIIIi.lliiliIiil;
                           return iilllIIill(var14, iIllIliIlllIli.illiIIIIIl, var37, IlIIIillllIIIill.IlIilllill, iIiIlIliIl(iIllIliIlllIli.illiIIIIIl), (iiliiiIiIIiiiiIi)null, false);
                        }
                     }
                  }
               }
            }
         } else {
            var14.iIlIIIllIi = 2.0F;
            var14.IllIIIllIi = Math.min(var14.IllIIIllIi, 6.0F);
            iIlIIIIiIllIIIIi var32 = s.IilliliilIIi(iIlIIIIiIllIIIIi.iliiliIiil).iIlIlllllill() ? iIlIIIIiIllIIIIi.iliiliIiil : iIlIIIIiIllIIIIi.lliiliIiil;
            return iilllIIill(var14, iIllIliIlllIli.IiiiIIIIIl, var32, IlIIIillllIIIill.iiIilllill, iIiIlIliIl(iIllIliIlllIli.IiiiIIIIIl), (iiliiiIiIIiiiiIi)null, false);
         }
      }
   }

   static boolean IiIIlliIIl(IiIililiIili committed, boolean committedLive, iIlIIIIiIllIIIIi killsHim, boolean keepEating, boolean p) {
      if (committed == IiIililiIili.IIliiIlIllIliiIlIl && !committedLive) {
         return true;
      } else if (!llIIlilIIl(killsHim)) {
         return true;
      } else {
         return killsHim == iIlIIIIiIllIIIIi.IIIIiiIiil && keepEating && p;
      }
   }

   static iIllIliIlllIli IIiIllIiIl(iIlIIIIiIllIIIIi lane, IiIililiIili p) {
      if (lane == null) {
         return iIllIliIlllIli.IlliIIIIIl;
      } else {
         iIllIliIlllIli var10000;
         switch (lane) {
            case IIIIiiIiil:
               var10000 = iIllIliIlllIli.IliiIIIIIl;
               break;
            case iIIIiiIiil:
               var10000 = iIllIliIlllIli.lliiIIIIIl;
               break;
            case IlIIiiIiil:
               var10000 = iIllIliIlllIli.iiiiIIIIIl;
               break;
            case iiiiliIiil:
            case llIIiiIiil:
               var10000 = iIllIliIlllIli.iIiiIIIIIl;
               break;
            case ilIIiiIiil:
               var10000 = iIllIliIlllIli.IIIIlIIIIl;
               break;
            case IiiiliIiil:
               var10000 = iIllIliIlllIli.liliIIIIIl;
               break;
            case lIIIiiIiil:
               var10000 = p == IiIililiIili.IIliiIlIllIliiIlIl ? iIllIliIlllIli.iliiIIIIIl : iIllIliIlllIli.llliIIIIIl;
               break;
            case iliiliIiil:
               var10000 = iIllIliIlllIli.illiIIIIIl;
               break;
            case liiiliIiil:
               var10000 = iIllIliIlllIli.iiliIIIIIl;
               break;
            case lliiliIiil:
               var10000 = iIllIliIlllIli.IlliIIIIIl;
               break;
            default:
               throw new MatchException((String)null, (Throwable)null);
         }

         return var10000;
      }
   }

   static boolean Iiiiliiiiiii(IlIIIlilllIIIlil style, IiIililiIili p) {
      return style != IlIIIlilllIIIlil.liiIiilIil && p != IiIililiIili.liIiiIlIliiIiiIlIl && p != IiIililiIili.IIliiIlIllIliiIlIl;
   }

   private static void lIIlliIIll(lIiIlIliiIiIlIli x, iiliiiIiIIiiiiIi c) {
      llillIIlilillIIl var2 = c.IlIlllIlilIl();
      x.IilIIIllIi = var2 == null ? illlliIlIillliIl.IilIiiiIll : (var2.lIiiIiIlilli() ? illlliIlIillliIl.iilIiiiIll : (var2.IilliliilIIi() ? illlliIlIillliIl.lilIiiiIll : illlliIlIillliIl.IilIiiiIll));
      if (c.Illlllllilll() != null) {
         x.lilIIIllIi = c.Illlllllilll().liiiIIllIl();
      }

   }

   static boolean Iilililiiili(IIllIIllIllIIl c, iiliiiIiIIiiiiIi s) {
      return s != null && s.liiiIIllIl() && s.iliIiiliiiii() == iiiIiiIlIIIliiIl.lliiIlIlll && (s.IlIlllIlilIl() != null || s.Illlllllilll() != null || s.IiIlliIliiIl() != null && c.Iilllilliill() <= 0);
   }

   static boolean lIlIliIlIl(iIlIIIIiIllIIIIi committed, String why) {
      if (committed == null) {
         return false;
      } else {
         boolean var10000;
         switch (committed) {
            case IIIIiiIiil:
            case iIIIiiIiil:
            case IlIIiiIiil:
            case iiiiliIiil:
            case ilIIiiIiil:
            case lIIIiiIiil:
               var10000 = true;
               break;
            case IiiiliIiil:
               var10000 = iiIIlIIlIl(why);
               break;
            default:
               var10000 = false;
         }

         return var10000;
      }
   }

   private static IiiIliliiIli liIlliiIll(lIiIlIliiIiIlIli x, IIllIIllIllIIl s, IilliIIllilliIIl kill) {
      x.IilIIIllIi = s.Iilllilliill() > 0 && !x.IIlIIIllIi.iiIIlIIlIl() ? illlliIlIillliIl.IilIiiiIll : illlliIlIillliIl.iilIiiiIll;
      x.lilIIIllIi = s.Iilllilliill() <= 0 || x.IIlIIIllIi.iiIIlIIlIl();
      IlIIIillllIIIill var3 = kill.liiiIIllIl() != iIlIIIIiIllIIIIi.IiiiliIiil && kill.liiiIIllIl() != iIlIIIIiIllIIIIi.liiiliIiil ? IlIIIillllIIIill.IlIilllill : IlIIIillllIIIill.iIIilllill;
      return iilllIIill(x, iIllIliIlllIli.IIiiIIIIIl, kill.liiiIIllIl(), var3, iIiIlIliIl(iIllIliIlllIli.IIiiIIIIIl), (iiliiiIiIIiiiiIi)null, false);
   }

   private static boolean iIlllIllll(IIllIIllIllIIl s) {
      IilliIIllilliIIl var1 = s.IilliliilIIi(iIlIIIIiIllIIIIi.iliiliIiil);
      return var1.iIlIlllllill() && lIilliIill<invokedynamic>().equals(var1.IlIlllIlilIl());
   }
}
