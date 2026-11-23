package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class iiIiliIiIIliliIi {
   private int illIIiiIIi;
   private iiIiIlIiIIliIlIi lIlIIiiIIi;
   public static final int ilIIIiiIIi = 16;
   public static final int IlIIIiiIIi = 40;
   private int iIlIIiiIIi;
   public static final int IiIIIiiIIi = 20;
   private final IlliIIlllliIIl iiIIIiiIIi;
   public static final double iIIIIiiIIi = 0.02;
   private int IllIIiiIIi;
   private boolean lilIIiiIIi;
   private int lllIIiiIIi;
   public static final int llIIIiiIIi = 4;
   private int IilIIiiIIi;
   public static final double lIIIIiiIIi = (double)1.0F;
   public static final int liIIIiiIIi = 2;
   private iliIllIiiIll IIlIIiiIIi;

   public int Ililllililil(int tick) {
      return this.iIlIIiiIIi == Integer.MIN_VALUE ? 0 : tick - this.iIlIIiiIIi;
   }

   public boolean IlIlllIlilIl() {
      return this.IIlIIiiIIi == iliIllIiiIll.llIIlIIiilIIlIIi || this.IIlIIiiIIi == iliIllIiiIll.IiIIlIIiliIIlIIi;
   }

   public String Iiilliiliiil(int tick) {
      return String.format(Locale.ROOT, IIIilIIiiIIi<invokedynamic>(), this.IIlIIiiIIi, this.lllIIiiIIi, 2, this.illIIiiIIi, this.Ililllililil(tick), this.IilIIiiIIi, this.lilIIiiIIi, this.lIlIIiiIIi);
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(-var4[var5]))) + 30607) - 17095))) ^ '잹') + 28082) - 4158) >>> 8 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)(-var4[var5]))) + 30607) - 17095))) ^ '잹') + 28082) - 4158) << 8) >>> 13 | (char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(-var4[var5]))) + 30607) - 17095))) ^ '잹') + 28082) - 4158) >>> 8 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)(-var4[var5]))) + 30607) - 17095))) ^ '잹') + 28082) - 4158) << 8) << 3) - '\uf6e8') ^ var5))))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Illlllllilll() {
      return this.lllIIiiIIi;
   }

   public iliIllIiiIll iliIiiliiiii() {
      return this.IIlIIiiIIi;
   }

   public iiIiliIiIIliliIi(IlliIIlllliIIl cert) {
      this.IIlIIiiIIi = iliIllIiiIll.iliiIIIiIiiiIIIi;
      this.lIlIIiiIIi = iiIiIlIiIIliIlIi.iliilIIIIi;
      this.iIlIIiiIIi = Integer.MIN_VALUE;
      this.IllIIiiIIi = Integer.MIN_VALUE;
      this.iiIIIiiIIi = cert;
      if (cert == null || !cert.IliIlllilIi()) {
         this.IIlIIiiIIi = iliIllIiiIll.IiIIlIIiliIIlIIi;
         this.lIlIIiiIIi = iiIiIlIiIIliIlIi.IiiilIIIIi;
      }

   }

   public iiIiIlIiIIliIlIi IIIllIIliIIl() {
      return this.lIlIIiiIIi;
   }

   public int Iilllilliill() {
      return this.illIIiiIIi;
   }

   public lliIillliliIilll IilliliilIIi(iiIiIlIiIIliIlIi why, String note) {
      return this.lIiiIiIlilli(why, note);
   }

   public boolean IiIlliIliiIl() {
      return this.IIlIIiiIIi == iliIllIiiIll.llIIlIIiilIIlIIi;
   }

   private lliIillliliIilll lIiiIiIlilli(iiIiIlIiIIliIlIi note, String why) {
      this.IIlIIiiIIi = iliIllIiiIll.IiIIlIIiliIIlIIi;
      this.lIlIIiiIIi = note;
      return new lliIillliliIilll(false, false, false, this.IIlIIiiIIi, why);
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 15 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 1) ^ var5))) + 23771) - var5) + var5) >>> 2 | (char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 15 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 1) ^ var5))) + 23771) - var5) + var5) << 14) - '캣') ^ var5))) << 10 | (char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 15 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 1) ^ var5))) + 23771) - var5) + var5) >>> 2 | (char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 15 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 1) ^ var5))) + 23771) - var5) + var5) << 14) - '캣') ^ var5))) >>> 6) >>> 6 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 15 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 1) ^ var5))) + 23771) - var5) + var5) >>> 2 | (char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 15 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 1) ^ var5))) + 23771) - var5) + var5) << 14) - '캣') ^ var5))) << 10 | (char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 15 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 1) ^ var5))) + 23771) - var5) + var5) >>> 2 | (char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 15 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 1) ^ var5))) + 23771) - var5) + var5) << 14) - '캣') ^ var5))) >>> 6) << 10))) + '\ude81') ^ var5))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public lliIillliliIilll IliIlllilIi(IIlIilIllIlIilIl s) {
      if (this.iIlIIiiIIi == Integer.MIN_VALUE) {
         this.iIlIIiiIIi = s.IliIlllilIi();
         this.IllIIiiIIi = s.IliIlllilIi();
      }

      if (this.IIlIIiiIIi != iliIllIiiIll.llIIlIIiilIIlIIi && this.IIlIIiiIIi != iliIllIiiIll.IiIIlIIiliIIlIIi) {
         if (s.IIlllIlliIll()) {
            this.IIlIIiiIIi = iliIllIiiIll.llIIlIIiilIIlIIi;
            return new lliIillliliIilll(false, false, false, this.IIlIIiiIIi, IIIilIIiiIIi<invokedynamic>());
         } else if (!s.lIiiIiIlilli()) {
            return this.lIiiIiIlilli(iiIiIlIiIIliIlIi.llIIiIIIIi, IIIilIIiiIIi<invokedynamic>());
         } else {
            switch (this.IIlIIiiIIi.ordinal()) {
               case 0:
                  if (s.IliIlllilIi() - this.IllIIiiIIi > 40) {
                     return this.lIiiIiIlilli(iiIiIlIiIIliIlIi.liiilIIIIi, IIIilIIiiIIi<invokedynamic>());
                  } else if (s.IilliliilIIi() > 0.02) {
                     return new lliIillliliIilll(false, false, s.Illlllllilll(), this.IIlIIiiIIi, s.Illlllllilll() ? IIIilIIiiIIi<invokedynamic>() : IIIilIIiiIIi<invokedynamic>());
                  } else if (!s.IIIllIIliIIl()) {
                     return new lliIillliliIilll(false, false, false, this.IIlIIiiIIi, IIIilIIiiIIi<invokedynamic>());
                  } else {
                     if (!s.iIlIlllllill()) {
                        return new lliIillliliIilll(false, false, false, this.IIlIIiiIIi, IIIilIIiiIIi<invokedynamic>());
                     }

                     ++this.lllIIiiIIi;
                     this.IIlIIiiIIi = iliIllIiiIll.liiiIIIiiiiiIIIi;
                     this.IllIIiiIIi = s.IliIlllilIi();
                     this.IilIIiiIIi = 0;
                     this.lilIIiiIIi = false;
                     return new lliIillliliIilll(true, false, false, this.IIlIIiiIIi, IIIilIIiiIIi<invokedynamic>() + this.lllIIiiIIi + IIIilIIiiIIi<invokedynamic>() + 2);
                  }
               case 1:
                  if (!s.iIlIlllllill()) {
                     this.IIlIIiiIIi = iliIllIiiIll.IIIIlIIilIIIlIIi;
                     this.IllIIiiIIi = s.IliIlllilIi();
                     return this.liiiIIllIl(s);
                  } else {
                     if (s.IliIlllilIi() - this.IllIIiiIIi > 4) {
                        return this.lIiiIiIlilli(iiIiIlIiIIliIlIi.IIIIiIIIIi, IIIilIIiiIIi<invokedynamic>());
                     }

                     return new lliIillliliIilll(false, false, false, this.IIlIIiiIIi, IIIilIIiiIIi<invokedynamic>());
                  }
               case 2:
                  return this.liiiIIllIl(s);
               case 3:
                  if (s.IliIlllilIi() - this.IllIIiiIIi > 20) {
                     return this.lIiiIiIlilli(iiIiIlIiIIliIlIi.IlIIiIIIIi, IIIilIIiiIIi<invokedynamic>());
                  }

                  return new lliIillliliIilll(false, false, false, this.IIlIIiiIIi, IIIilIIiiIIi<invokedynamic>());
               default:
                  return new lliIillliliIilll(false, false, false, this.IIlIIiiIIi, this.lIlIIiiIIi.name());
            }
         }
      } else {
         return new lliIillliliIilll(false, false, false, this.IIlIIiiIIi, this.IIlIIiiIIi == iliIllIiiIll.IiIIlIIiliIIlIIi ? this.lIlIIiiIIi.name() : IIIilIIiiIIi<invokedynamic>());
      }
   }

   private lliIillliliIilll iIlIlllllill(IIlIilIllIlIilIl why, String s) {
      if (this.lllIIiiIIi >= 2) {
         return this.lIiiIiIlilli(iiIiIlIiIIliIlIi.iIIIiIIIIi, s + IIIilIIiiIIi<invokedynamic>());
      } else {
         this.IIlIIiiIIi = iliIllIiiIll.iliiIIIiIiiiIIIi;
         this.IllIIiiIIi = why.IliIlllilIi();
         return new lliIillliliIilll(false, false, false, this.IIlIIiiIIi, IIIilIIiiIIi<invokedynamic>() + this.lllIIiiIIi + IIIilIIiiIIi<invokedynamic>() + s + IIIilIIiiIIi<invokedynamic>());
      }
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] >>> 2 | var4[var5] << 14))) - '\ue6b1') + var5) + 10647))) >>> 3 | (char)(~((char)((char)((char)((char)(-((char)(var4[var5] >>> 2 | var4[var5] << 14))) - '\ue6b1') + var5) + 10647))) << 13) ^ 20259) ^ var5) - var5) + 13173) >>> 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] >>> 2 | var4[var5] << 14))) - '\ue6b1') + var5) + 10647))) >>> 3 | (char)(~((char)((char)((char)((char)(-((char)(var4[var5] >>> 2 | var4[var5] << 14))) - '\ue6b1') + var5) + 10647))) << 13) ^ 20259) ^ var5) - var5) + 13173) << 3) << 2 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] >>> 2 | var4[var5] << 14))) - '\ue6b1') + var5) + 10647))) >>> 3 | (char)(~((char)((char)((char)((char)(-((char)(var4[var5] >>> 2 | var4[var5] << 14))) - '\ue6b1') + var5) + 10647))) << 13) ^ 20259) ^ var5) - var5) + 13173) >>> 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] >>> 2 | var4[var5] << 14))) - '\ue6b1') + var5) + 10647))) >>> 3 | (char)(~((char)((char)((char)((char)(-((char)(var4[var5] >>> 2 | var4[var5] << 14))) - '\ue6b1') + var5) + 10647))) << 13) ^ 20259) ^ var5) - var5) + 13173) << 3) >>> 14))) - var5) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IlliIIlllliIIl IIillIiliIil() {
      return this.iiIIIiiIIi;
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) << 15 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) >>> 1) >>> 5 | (char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) << 15 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) >>> 1) << 11)) >>> 5 | (char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) << 15 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) >>> 1) >>> 5 | (char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) << 15 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) >>> 1) << 11)) << 11) << 6 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) << 15 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) >>> 1) >>> 5 | (char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) << 15 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) >>> 1) << 11)) >>> 5 | (char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) << 15 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) >>> 1) >>> 5 | (char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) << 15 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) >>> 1) << 11)) << 11) >>> 10) << 7 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) << 15 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) >>> 1) >>> 5 | (char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) << 15 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) >>> 1) << 11)) >>> 5 | (char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) << 15 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) >>> 1) >>> 5 | (char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) << 15 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) >>> 1) << 11)) << 11) << 6 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) << 15 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) >>> 1) >>> 5 | (char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) << 15 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) >>> 1) << 11)) >>> 5 | (char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) << 15 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) >>> 1) >>> 5 | (char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) << 15 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + 21375) - 2571))) << 1) >>> 1) << 11)) << 11) >>> 10) >>> 9))) - '\udff3') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IIlllIlliIll() {
      return this.IIlIIiiIIi == iliIllIiiIll.IiIIlIIiliIIlIIi;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6484219580857469411L ^ Long.rotateLeft(8378287511694750106L, 18) ^ 3634769258258923490L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 5662712339283685478L ^ Long.rotateLeft(-4350343961237112834L, 31) ^ 4221743289586298468L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -1726153233975882564L ^ Long.rotateLeft(-6197984559333920234L, 49) ^ -4610529891338563595L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7884561400153967903L ^ Long.rotateLeft(2888206087224037711L, 39) ^ -1228843504966223610L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8960160091236218387L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 7642554098343673621L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8186147314176676911L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5171119070079311947L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -1129561958419088606L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 3867157050634970852L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IlIillIiilIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIiliIiiiIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIlilIliiIli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Illillliilli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iilililiiili<invokedynamic>());
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

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - 31466))) ^ '쒻'))) + 18376) ^ 'ﺇ') ^ 21919))) - var5) >>> 2 | (char)((char)(~((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - 31466))) ^ '쒻'))) + 18376) ^ 'ﺇ') ^ 21919))) - var5) << 14) >>> 10 | (char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - 31466))) ^ '쒻'))) + 18376) ^ 'ﺇ') ^ 21919))) - var5) >>> 2 | (char)((char)(~((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - 31466))) ^ '쒻'))) + 18376) ^ 'ﺇ') ^ 21919))) - var5) << 14) << 6) + var5) << 4 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - 31466))) ^ '쒻'))) + 18376) ^ 'ﺇ') ^ 21919))) - var5) >>> 2 | (char)((char)(~((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - 31466))) ^ '쒻'))) + 18376) ^ 'ﺇ') ^ 21919))) - var5) << 14) >>> 10 | (char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - 31466))) ^ '쒻'))) + 18376) ^ 'ﺇ') ^ 21919))) - var5) >>> 2 | (char)((char)(~((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - 31466))) ^ '쒻'))) + 18376) ^ 'ﺇ') ^ 21919))) - var5) << 14) << 6) + var5) >>> 12) >>> 7 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - 31466))) ^ '쒻'))) + 18376) ^ 'ﺇ') ^ 21919))) - var5) >>> 2 | (char)((char)(~((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - 31466))) ^ '쒻'))) + 18376) ^ 'ﺇ') ^ 21919))) - var5) << 14) >>> 10 | (char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - 31466))) ^ '쒻'))) + 18376) ^ 'ﺇ') ^ 21919))) - var5) >>> 2 | (char)((char)(~((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - 31466))) ^ '쒻'))) + 18376) ^ 'ﺇ') ^ 21919))) - var5) << 14) << 6) + var5) << 4 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - 31466))) ^ '쒻'))) + 18376) ^ 'ﺇ') ^ 21919))) - var5) >>> 2 | (char)((char)(~((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - 31466))) ^ '쒻'))) + 18376) ^ 'ﺇ') ^ 21919))) - var5) << 14) >>> 10 | (char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - 31466))) ^ '쒻'))) + 18376) ^ 'ﺇ') ^ 21919))) - var5) >>> 2 | (char)((char)(~((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - 31466))) ^ '쒻'))) + 18376) ^ 'ﺇ') ^ 21919))) - var5) << 14) << 6) + var5) >>> 12) << 9) + '낁'))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private lliIillliliIilll liiiIIllIl(IIlIilIllIlIilIl s) {
      ++this.IilIIiiIIi;
      if (s.iliIiiliiiii()) {
         this.lilIIiiIIi = true;
      }

      if (s.iliIiiliiiii() && s.IlIlllIlilIl() && s.IiIlliIliiIl()) {
         ++this.illIIiiIIi;
         this.IIlIIiiIIi = iliIllIiiIll.iIIIlIIiIlIIlIIi;
         this.IllIIiiIIi = s.IliIlllilIi();
         return new lliIillliliIilll(false, true, false, this.IIlIIiiIIi, IIIilIIiiIIi<invokedynamic>());
      } else if (s.iIlIlllllill() && this.IilIIiiIIi > 1) {
         return this.iIlIlllllill(s, this.lilIIiiIIi ? IIIilIIiiIIi<invokedynamic>() : IIIilIIiiIIi<invokedynamic>());
      } else {
         return this.IilIIiiIIi > 16 ? this.iIlIlllllill(s, IIIilIIiiIIi<invokedynamic>()) : new lliIillliliIilll(false, false, false, this.IIlIIiiIIi, s.iliIiiliiiii() ? IIIilIIiiIIi<invokedynamic>() : IIIilIIiiIIi<invokedynamic>());
      }
   }
}
