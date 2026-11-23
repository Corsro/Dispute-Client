package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_11908;
import net.minecraft.class_1661;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_408;
import net.minecraft.class_433;
import net.minecraft.class_437;
import net.minecraft.class_465;
import net.minecraft.class_490;
import net.minecraft.class_9284;
import net.minecraft.class_9290;
import net.minecraft.class_9334;

public final class iIliIIllIlliIIll {
   private int IliiiIllll;
   static final int liIliIllll = 40;
   private boolean iliiiIllll;
   private final List<Ilililllllililll> lIiliIllll = new ArrayList();
   private boolean lliiiIllll;
   private int IlliiIllll;
   private long iIIiiIllll;
   private volatile iiiIIliIIIlIli iIiliIllll;
   private int iIliiIllll;
   private int iiliiIllll;
   private int ilIIIlllll;
   private int ilIiiIllll;
   private long lIlIIlllll;
   private static final String lIlliIllll = "not enough money";
   private boolean IIIIIlllll;
   private class_310 IiiliIllll;
   private int IiIIIlllll;
   static final int ilIliIllll = 30;
   static final int IiiIiIllll = 60;
   static final int iliIiIllll = 60;
   private final Set<Ilililllllililll> IIiliIllll = new HashSet();
   private int IIliiIllll;
   private int iiiliIllll;
   private final ConcurrentLinkedQueue<String> lilliIllll = new ConcurrentLinkedQueue();
   static final int IIlliIllll = 64;
   static final int IIIliIllll = 3;
   static final String IIiIiIllll = "next page";
   private int iiIIIlllll;
   static final int iIiIiIllll = 16;
   private static final ilIIIIllIiIIIIll illliIllll = new ilIIIIllIiIIIIll();
   static final int IiIliIllll = 4;
   private int llIIIlllll;
   static final int IlIliIllll = 3;
   private volatile String lliliIllll;
   private volatile String IliliIllll;
   private String IlIiiIllll;
   private static final long lllliIllll = System.nanoTime();
   private int IIiiiIllll;
   static final int iIIliIllll = 4;
   static final int lIIliIllll = 8;
   private final List<IIIililIIili> iilliIllll = new ArrayList();
   private int iiIiiIllll;
   private int lIiiiIllll;
   static final String lilIiIllll = "ah enchanting";
   private static long IilliIllll = System.nanoTime() - (-996284652647354444L ^ -996284651457757004L);
   private iiilllIiIIIillIi liiliIllll;
   static final String iilIiIllll = "$";
   private volatile boolean illIIlllll;
   private volatile long iIlIIlllll;
   static final int IliIiIllll = 64;
   private volatile int lllIIlllll;
   private boolean IIlIIlllll;
   static final int llIliIllll = 4;
   static final int liiIiIllll = 3600;
   private static final long IllliIllll = 1500000000L;
   private Ilililllllililll IlIIIlllll;
   private int IiliiIllll;
   private int liliiIllll;
   private static final String iIlliIllll = "inventory full";
   private int liIIIlllll;
   static final double lIiIiIllll = 0.15;
   private String iIIIIlllll;
   private boolean lIIIIlllll;
   private int illiiIllll;
   private volatile int IllIIlllll;
   static final int iiiIiIllll = 7;
   private static final int IilIIlllll = 100;
   static final String illIiIllll = "ah firework rocket";
   static final int iiIliIllll = 60;
   private boolean IiiiiIllll;
   private boolean liiiiIllll;
   private int liIiiIllll;
   private boolean iiiiiIllll;
   private int llIiiIllll;
   static final String IilIiIllll = "ah bottle o' enchanting";
   private volatile iIiilllIliilll ililiIllll;
   private int iIiiiIllll;
   private int IIIiiIllll;
   private int llliiIllll;
   private long lIIiiIllll;
   static final int lliIiIllll = 100;
   private int lIliiIllll;
   private int IiIiiIllll;

   public void liiiIIllIl() {
      if (this.iIiliIllll != iiiIIliIIIlIli.IlIIIIIIIl) {
         if (this.iIliiIllll > 0) {
            this.iIIilIlIil();
         }

      } else {
         this.IiiliIllll = class_310.method_1551();

         try {
            this.iiIIlIIlIl();
         } catch (Throwable var2) {
            this.ilillIiill(iiiIIliIIIlIli.ilIIIIIIIl, IiIliliIli<invokedynamic>() + var2.getClass().getSimpleName());
         }

      }
   }

   static IIllillllIllilll IIIIllIIIl(String raw) {
      if (raw == null) {
         return IIllillllIllilll.lIiilIlill;
      } else {
         String var1 = iIIiiilIlIiiil.IliIlllilIi(raw).toLowerCase(Locale.ROOT).trim();
         if (var1.isEmpty()) {
            return IIllillllIllilll.lIiilIlill;
         } else if (!var1.startsWith(IiIliliIli<invokedynamic>()) && !var1.startsWith(IiIliliIli<invokedynamic>()) && !var1.equals(IiIliliIli<invokedynamic>()) && !var1.equals(IiIliliIli<invokedynamic>()) && !var1.equals(IiIliliIli<invokedynamic>())) {
            if (!var1.startsWith(IiIliliIli<invokedynamic>()) && !var1.startsWith(IiIliliIli<invokedynamic>()) && !var1.startsWith(IiIliliIli<invokedynamic>())) {
               if (var1.startsWith(IiIliliIli<invokedynamic>())) {
                  return IIllillllIllilll.lliilIlill;
               } else {
                  return iIIiiilIlIiiil.iliIiiliiiii(raw).isPresent() ? IIllillllIllilll.iliilIlill : IIllillllIllilll.lIiilIlill;
               }
            } else {
               return IIllillllIllilll.IliilIlill;
            }
         } else {
            return IIllillllIllilll.iIiilIlill;
         }
      }
   }

   private void iIIilIlIil() {
      --this.iIliiIllll;

      try {
         this.IiiliIllll = class_310.method_1551();
         if (this.IiiliIllll == null || this.IiiliIllll.field_1724 == null) {
            this.iIliiIllll = 0;
            return;
         }

         if (this.lIIIiiIIIi()) {
            this.IlIIillIIi();
            return;
         }

         if (this.illilIilil()) {
            this.IiiliIllll.field_1724.method_7346();
            this.iIliiIllll = 0;
         }
      } catch (Throwable var2) {
         this.iIliiIllll = 0;
      }

   }

   private void iiIIlIIlIl() {
      if (this.IiiliIllll != null && this.IiiliIllll.field_1724 != null && this.IiiliIllll.field_1761 != null && this.IiiliIllll.field_1724.field_3944 != null) {
         ++this.llIiiIllll;
         this.lIlIliIlIl();
         if (this.iIIIIlllll != null) {
            String var1 = this.iIIIIlllll;
            this.iIIIIlllll = null;
            if (this.IIllllIlll()) {
               if (IiIliliIli<invokedynamic>().equals(var1)) {
                  this.illIIlllll = true;
                  this.ilillIiill(iiiIIliIIIlIli.ilIIIIIIIl, IiIliliIli<invokedynamic>());
               } else {
                  this.ilillIiill(this.IllIIlllll > 0 ? iiiIIliIIIlIli.llIIIIIIIl : iiiIIliIIIlIli.ilIIIIIIIl, IiIliliIli<invokedynamic>());
               }

            }
         } else if (this.llIiiIllll > 3600) {
            if (this.IIllllIlll()) {
               this.ilillIiill(this.IllIIlllll > 0 ? iiiIIliIIIlIli.llIIIIIIIl : iiiIIliIIIlIli.ilIIIIIIIl, IiIliliIli<invokedynamic>());
            }

         } else {
            if (this.liiliIllll != iiilllIiIIIillIi.illiiiIIIi && this.liiliIllll != iiilllIiIIIillIi.IiliiiIIIi && this.liiliIllll != iiilllIiIIIillIi.liliiiIIIi) {
               this.ilIllIiIll();
               if (this.iIiliIllll != iiiIIliIIIlIli.IlIIIIIIIl) {
                  return;
               }
            }

            switch (this.liiliIllll.ordinal()) {
               case 0 -> this.IllIllllIl();
               case 1 -> this.illIlIilIl();
               case 2 -> this.lilIliilIl();
               case 3 -> this.IIiIllIiIl();
               case 4 -> this.iIiIlIliIl();
               case 5 -> this.lliIliliIl();
               case 6 -> this.IiiIlliiIl();
               case 7 -> this.iiiIlIIIll();
               case 8 -> this.IlIllllIll();
            }

         }
      } else {
         this.ilillIiill(iiiIIliIIIlIli.ilIIIIIIIl, IiIliliIli<invokedynamic>());
      }
   }

   public int Iiilliiliiil() {
      return this.iiiliIllll;
   }

   private void ilIllIiIll() {
      long var2 = 3174688433398791205L;
      if (this.IiIIIlllll >= 0) {
         if (this.lIIIIlllll) {
            this.lIIIIlllll = false;
            this.ilIIIlllll = Math.max(0, this.ilIIIlllll - this.liIIIlllll);
            this.IiIIIlllll = -1;
         } else {
            var2 ^= ((long)(this.IilIililIi() - this.IiIIIlllll) << 32 ^ var2) & -1L << 32;
            if ((int)(var2 >>> 32) > 0) {
               this.IiIIIlllll = -1;
               this.ilIIIlllll = Math.max(0, this.ilIIIlllll - (int)(var2 >>> 32));
               if (this.liIlliiIll((int)(var2 >>> 32), this.lIlIIlllll)) {
                  if (this.IilIililIi() >= this.iiiliIllll) {
                     this.ilillIiill(iiiIIliIIIlIli.llIIIIIIIl, "");
                  }

               }
            }
         }
      }
   }

   private void iIiIlIliIl() {
      if (this.Ilillllill()) {
         this.IlIIIlllll = null;
      } else if (this.IlIIIlllll == null) {
         this.liiIiiiiIi(iiilllIiIIIillIi.iIliiiIIIi);
      } else if (this.llIiiIllll - this.IiIiiIllll >= this.liIiiIllll) {
         if (this.iilIiIIiIi() == 0) {
            this.ilillIiill(this.IllIIlllll > 0 ? iiiIIliIIIlIli.llIIIIIIIl : iiiIIliIIIlIli.ilIIIIIIIl, IiIliliIli<invokedynamic>());
         } else {
            Ilililllllililll var1 = this.IiIilliIil(this.IiiliIllll.field_1724.field_7512, this.IlIIIlllll.liiiIIllIl());
            int var2 = this.IilIililIi();
            boolean var3 = this.iIIiiIllll > 0L && this.IlIIIlllll.IilliliilIIi() > this.iIIiiIllll - this.iIlIIlllll;
            if (var1 != null && var1.equals(this.IlIIIlllll) && var2 < this.iiiliIllll && var2 + this.ilIIIlllll + this.IlIIIlllll.iIlIlllllill() <= this.IIIiiIllll && !var3) {
               if (this.IiIIIlllll >= 0) {
                  if (this.llIiiIllll - this.iiIIIlllll < 100) {
                     return;
                  }

                  this.ilIIIlllll = Math.max(0, this.ilIIIlllll - this.liIIIlllll);
                  this.IiIIIlllll = -1;
               }

               this.llIIIlllll = var2;
               this.lIIIIlllll = false;
               this.iilliIllll.clear();
               this.IIiiiIllll = 0;
               this.lIiiiIllll = 0;
               this.IiiliIllll.field_1761.method_2906(this.IlliiIllll, this.IlIIIlllll.liiiIIllIl(), 0, class_1713.field_7790, this.IiiliIllll.field_1724);
               this.iliIiIiiIi();
               this.liiIiiiiIi(iiilllIiIIIillIi.illiiiIIIi);
            } else {
               this.IlIIIlllll = null;
               this.lllIiillIi();
               this.liiIiiiiIi(iiilllIiIIIillIi.iIliiiIIIi);
            }
         }
      }
   }

   private void Iillllilll(String why) {
      if (this.IlIIIlllll != null) {
         this.IiIIIlllll = this.llIIIlllll;
         this.iiIIIlllll = this.llIiiIllll;
         this.liIIIlllll = this.IlIIIlllll.iIlIlllllill();
         this.lIlIIlllll = this.IlIIIlllll.IilliliilIIi();
         this.ilIIIlllll += this.IlIIIlllll.iIlIlllllill();
         this.IIiliIllll.add(this.IlIIIlllll);
      }

      this.IlIIillIIi();
      this.iilllIIill(why, true);
   }

   public void iIlIlllllill(String rawLine) {
      try {
         if (rawLine == null || this.iIiliIllll != iiiIIliIIIlIli.IlIIIIIIIl || IIIIllIIIl(rawLine) == IIllillllIllilll.lIiilIlill) {
            return;
         }

         while(this.lilliIllll.size() >= 64) {
            this.lilliIllll.poll();
         }

         this.lilliIllll.offer(rawLine);
      } catch (Throwable var3) {
      }

   }

   // $FF: synthetic method
   private static CallSite iiIliIIlli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') >>> 10 | (char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') << 6) ^ 29211) + var5) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') >>> 10 | (char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') << 6) ^ 29211) + var5) << 8) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') >>> 10 | (char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') << 6) ^ 29211) + var5) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') >>> 10 | (char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') << 6) ^ 29211) + var5) << 8) >>> 5) - var5) ^ 'ꮶ') << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') >>> 10 | (char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') << 6) ^ 29211) + var5) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') >>> 10 | (char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') << 6) ^ 29211) + var5) << 8) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') >>> 10 | (char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') << 6) ^ 29211) + var5) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') >>> 10 | (char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') << 6) ^ 29211) + var5) << 8) >>> 5) - var5) ^ 'ꮶ') >>> 5))) ^ var5) << 7 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') >>> 10 | (char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') << 6) ^ 29211) + var5) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') >>> 10 | (char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') << 6) ^ 29211) + var5) << 8) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') >>> 10 | (char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') << 6) ^ 29211) + var5) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') >>> 10 | (char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') << 6) ^ 29211) + var5) << 8) >>> 5) - var5) ^ 'ꮶ') << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') >>> 10 | (char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') << 6) ^ 29211) + var5) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') >>> 10 | (char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') << 6) ^ 29211) + var5) << 8) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') >>> 10 | (char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') << 6) ^ 29211) + var5) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') >>> 10 | (char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) << 2 | (char)((char)(-((char)((char)(var4[var5] + var5) - 2079))) - var5) >>> 14) ^ '뎭') << 6) ^ 29211) + var5) << 8) >>> 5) - var5) ^ 'ꮶ') >>> 5))) ^ var5) >>> 9))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void IlIIillIIi() {
      if (this.lIIIiiIIIi()) {
         try {
            this.IiiliIllll.field_1755.method_25419();
         } catch (Throwable var2) {
         }

      }
   }

   public boolean iliIiiliiiii() {
      return this.iIiliIllll == iiiIIliIIIlIli.IlIIIIIIIl;
   }

   private boolean IliIilliIi() {
      return this.llIiiIllll - this.IiIiiIllll >= (((-605367826 + -55 ^ 7) << 15 | (-605367826 + -55 ^ 7) >>> 17) ^ 1759014385);
   }

   public String IlIlllIlilIl() {
      return this.IliliIllll;
   }

   public static int Illillliilli(class_1661 inv, iIiilllIliilll g) {
      if (inv != null && g != null) {
         int var2 = 0;

         for(int var3 = 0; var3 < 36; ++var3) {
            class_1799 var4 = inv.method_5438(var3);
            if (Iilililiiili(var4, g)) {
               var2 += var4.method_7947();
            }
         }

         if (g == iIiilllIliilll.ilIillIIiIiIillIIi) {
            class_1799 var5 = inv.method_5438(40);
            if (IlIillIiilIi(var5)) {
               var2 += var5.method_7947();
            }
         }

         return var2;
      } else {
         return 0;
      }
   }

   public static boolean IiIiliIiiiIi(class_1799 s) {
      if (s != null && !s.method_7960() && s.method_31574(class_1802.field_8639)) {
         class_9284 var1 = (class_9284)s.method_58694(class_9334.field_49616);
         return var1 == null || var1.comp_2392().isEmpty();
      } else {
         return false;
      }
   }

   public int IIIilIIiiIIi() {
      return this.IIIiiIllll;
   }

   private String liIIiiiIIi() {
      return this.IiiliIllll == null ? "" : IIlIilIlIi(this.IiiliIllll.field_1755);
   }

   static Optional<Ilililllllililll> Iliilliiilii(List<Ilililllllililll> have, int target, int budgetLeft, int invRoom, long maxUnitPrice, long minLot, int cap, int listings) {
      if (have != null && !have.isEmpty()) {
         int var10 = budgetLeft - target;
         int var11 = Math.min(invRoom - target, cap);
         if (var10 > 0 && var11 > 0) {
            int var12 = Math.max(1, Math.min(listings, Math.min(var10, var11)));
            ArrayList var13 = new ArrayList(have.size());

            for(Ilililllllililll var15 : have) {
               if (var15 != null && var15.iIlIlllllill() > 0 && var15.IilliliilIIi() >= 0L && var15.iIlIlllllill() <= var11 && var15.iIlIlllllill() >= var12 && (maxUnitPrice <= 0L || var15.IliIlllilIi() <= maxUnitPrice) && (minLot <= 0L || var15.IilliliilIIi() <= minLot)) {
                  var13.add(var15);
               }
            }

            if (var13.isEmpty()) {
               return Optional.empty();
            } else {
               return iIIlllIlIlll.IilliliilIIi(var13, var10, maxUnitPrice, minLot, 0.15, var11);
            }
         } else {
            return Optional.empty();
         }
      } else {
         return Optional.empty();
      }
   }

   private void lllIiillIi() {
      this.IlliiIllll = this.IiiliIllll.field_1724.field_7512.field_7763;
      this.iiIiiIllll = this.llIiiIllll + 4 + iIIliIlIli(4);
   }

   private boolean iIiilIliil(boolean green) {
      class_1703 var2 = this.IiiliIllll.field_1724.field_7512;
      int var3 = 0;
      int var4 = var2.field_7761.size() - 36;

      while(true) {
         if (var3 >= var4) {
            return false;
         }

         class_1799 var5 = var2.method_7611(var3).method_7677();
         if (green) {
            if (lliililiil(var5)) {
               break;
            }
         } else if (Iiiilliiil(var5)) {
            break;
         }

         ++var3;
      }

      return true;
   }

   private void IlIllllIll() {
      if (this.lIIIiiIIIi()) {
         if (this.IliIilliIi()) {
            this.IlIIillIIi();
            this.iliIiIiiIi();
         }

      } else if (this.iiiilIIIIi()) {
         if (this.IliIilliIi()) {
            this.IiiliIllll.field_1724.method_7346();
            this.iliIiIiiIi();
         }

      } else {
         if (this.llIiiIllll >= this.IIliiIllll) {
            this.liiIiiiiIi(iiilllIiIIIillIi.IIliiiIIIi);
         }

      }
   }

   public int IIlllIlliIll() {
      return this.IllIIlllll;
   }

   static OptionalLong Iiiiliiiiiii(List<String> nameThenLore) {
      if (nameThenLore != null && nameThenLore.size() >= (((246641844 ^ 25 ^ -23) >>> 15 | (246641844 ^ 25 ^ -23) << 17) ^ 91 ^ 378135232)) {
         List var1 = nameThenLore.subList(1, nameThenLore.size());
         return !iIIiiilIlIiiil.lIiiIiIlilli(var1, IiIliliIli<invokedynamic>()) ? OptionalLong.empty() : iIIiiilIlIiiil.IilliliilIIi(var1, IiIliliIli<invokedynamic>());
      } else {
         return OptionalLong.empty();
      }
   }

   // $FF: synthetic method
   private static CallSite IiIliliIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -1042375223177267494L ^ Long.rotateLeft(4843353797863079797L, 16) ^ 5286304894254949133L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -6679923647663846748L ^ Long.rotateLeft(5225083120358655756L, 40) ^ -4428411351935384963L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5014540454106491459L ^ Long.rotateLeft(6242170738088035984L, 48) ^ 7013371710794681104L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1596079553814513952L ^ Long.rotateLeft(1817407838892700654L, 50) ^ -7803974080655704215L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6796887415716195994L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -4172227017780134172L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -5254090321036558405L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3533811750804879269L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7729322173738802079L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -3136855220186012823L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iiIliIIlli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, lIlliiIlli<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Illlilllli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, illliIilli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(lilliiilli<invokedynamic>());
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

   private boolean illilIilil() {
      if (!this.iiiilIIIIi()) {
         return false;
      } else {
         String var1 = this.liIIiiiIIi();
         if (!var1.contains(IiIliliIli<invokedynamic>()) && !var1.contains(IiIliliIli<invokedynamic>())) {
            if (var1.contains(IiIliliIli<invokedynamic>())) {
               return true;
            } else {
               return this.IIiillIiil() && (!this.iIiilIliil(true) || !this.iIiilIliil(false));
            }
         } else {
            return false;
         }
      }
   }

   private boolean Ilillllill() {
      if (this.illilIilil()) {
         if (this.IiiliIllll.field_1724.field_7512.field_7763 == this.IlliiIllll) {
            return false;
         } else {
            this.IIiliIllll.clear();
            this.lllIiillIi();
            this.liiIiiiiIi(iiilllIiIIIillIi.iIliiiIIIi);
            return true;
         }
      } else if (++this.iiliiIllll >= (~(-(-2004164648) - 13) ^ -2004164640)) {
         this.iiliiIllll = 0;
         this.iilllIIill(IiIliliIli<invokedynamic>(), false);
         return true;
      } else {
         this.liiIiiiiIi(iiilllIiIIIillIi.IIliiiIIIi);
         return true;
      }
   }

   // $FF: synthetic method
   private static CallSite illliIilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ 19126))))) ^ 22784) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ 19126))))) ^ 22784) << 2) - '\ud821'))))) + 21465))) >>> 1 | (char)(-((char)((char)(-((char)(~((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ 19126))))) ^ 22784) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ 19126))))) ^ 22784) << 2) - '\ud821'))))) + 21465))) << 15))) + '\uf049') + 25742) >>> 14 | (char)((char)((char)(~((char)((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ 19126))))) ^ 22784) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ 19126))))) ^ 22784) << 2) - '\ud821'))))) + 21465))) >>> 1 | (char)(-((char)((char)(-((char)(~((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ 19126))))) ^ 22784) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ 19126))))) ^ 22784) << 2) - '\ud821'))))) + 21465))) << 15))) + '\uf049') + 25742) << 2))) ^ '\ud86b'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static int iIIliIlIli(int bound) {
      return ThreadLocalRandom.current().nextInt(Math.max(1, bound));
   }

   private boolean iiiilIIIIi() {
      return this.IiiliIllll != null && this.IiiliIllll.field_1724 != null && this.IiiliIllll.field_1755 instanceof class_465 && !(this.IiiliIllll.field_1755 instanceof class_490) && this.IiiliIllll.field_1724.field_7512 != null && this.IiiliIllll.field_1724.field_7512 != this.IiiliIllll.field_1724.field_7498;
   }

   private void IIIillIIil() {
      if (this.IIIIIlllll) {
         try {
            if (this.IiiliIllll == null || this.IiiliIllll.field_1724 == null) {
               return;
            }

            if (this.lIIIiiIIIi()) {
               this.IlIIillIIi();
            }

            if (this.iiiilIIIIi()) {
               this.IiiliIllll.field_1724.method_7346();
            }
         } catch (Throwable var2) {
         }

      }
   }

   private static boolean lliililiil(class_1799 st) {
      return st != null && !st.method_7960() && (st.method_31574(class_1802.field_8581) || st.method_31574(class_1802.field_8656) || st.method_31574(class_1802.field_19049) || st.method_31574(class_1802.field_19057) || st.method_31574(class_1802.field_8131) || st.method_31574(class_1802.field_8687) || st.method_31574(class_1802.field_8733));
   }

   // $FF: synthetic method
   private static CallSite Illlilllli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 2 | (char)(var4[var5] + var5) << 14) + var5) + 25198) + var5) << 12 | (char)((char)((char)((char)((char)(var4[var5] + var5) >>> 2 | (char)(var4[var5] + var5) << 14) + var5) + 25198) + var5) >>> 4) ^ var5) + var5))) >>> 8 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 2 | (char)(var4[var5] + var5) << 14) + var5) + 25198) + var5) << 12 | (char)((char)((char)((char)((char)(var4[var5] + var5) >>> 2 | (char)(var4[var5] + var5) << 14) + var5) + 25198) + var5) >>> 4) ^ var5) + var5))) << 8) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static boolean IiIIlliIIl(String name) {
      if (name == null) {
         return false;
      } else {
         String var1 = iIIiiilIlIiiil.IliIlllilIi(name).toLowerCase(Locale.ROOT).trim();
         if (!var1.contains(IiIliliIli<invokedynamic>()) && !var1.contains(IiIliliIli<invokedynamic>()) && !var1.contains(IiIliliIli<invokedynamic>()) && !var1.startsWith(IiIliliIli<invokedynamic>())) {
            return var1.contains(IiIliliIli<invokedynamic>()) || var1.contains(IiIliliIli<invokedynamic>()) || var1.contains(IiIliliIli<invokedynamic>());
         } else {
            return false;
         }
      }
   }

   private int iiIilIIlil() {
      class_1703 var1 = this.IiiliIllll.field_1724.field_7512;
      int var2 = var1.field_7761.size() - 36;

      for(int var3 = var2 - 1; var3 >= 0; --var3) {
         class_1799 var4 = var1.method_7611(var3).method_7677();
         if (!var4.method_7960() && iIIiiilIlIiiil.IliIlllilIi(var4.method_7964().getString()).toLowerCase(Locale.ROOT).contains(IiIliliIli<invokedynamic>())) {
            List var5 = iIlIiIllIi(var4);
            if (var3 >= var2 - 9 || !iIIiiilIlIiiil.lIiiIiIlilli(var5.subList(1, var5.size()), IiIliliIli<invokedynamic>())) {
               return var3;
            }
         }
      }

      return -1;
   }

   private boolean lIilliIill() {
      if (this.ililiIllll == iIiilllIliilll.liIillIIiiiIillIIi && !this.lliiiIllll && !this.iliiiIllll) {
         this.lliiiIllll = true;
         this.IlIiiIllll = IIiilIiiiIii(this.ililiIllll, true);
         this.liiIiiiiIi(iiilllIiIIIillIi.IIliiiIIIi);
         return true;
      } else {
         return false;
      }
   }

   public static boolean IlIillIiilIi(class_1799 s) {
      if (s != null && !s.method_7960() && s.method_31574(class_1802.field_8639)) {
         class_9284 var1 = (class_9284)s.method_58694(class_9334.field_49616);
         return var1 != null && var1.comp_2391() == (((-233140815 >>> 9 | -233140815 << 23) * 678152731 >>> 7 | (-233140815 >>> 9 | -233140815 << 23) * 678152731 << 25) + -45 ^ -976879852) && var1.comp_2392().isEmpty();
      } else {
         return false;
      }
   }

   private void ilIIiIiIIi(int glfwKey) {
      if (this.IiiliIllll.field_1755 != null) {
         try {
            class_11908 var2 = new class_11908(glfwKey, 0, 0);
            this.IiiliIllll.field_1755.method_25404(var2);
            this.IiiliIllll.field_1755.method_16803(var2);
         } catch (Throwable var3) {
         }

      }
   }

   public static boolean IIlilIliiIli(class_1799 s) {
      return s != null && !s.method_7960() && s.method_31574(class_1802.field_8287);
   }

   private static List<String> iIlIiIllIi(class_1799 st) {
      ArrayList var1 = new ArrayList();
      var1.add(st.method_7964().getString());
      class_9290 var2 = (class_9290)st.method_58694(class_9334.field_49632);
      if (var2 != null) {
         for(class_2561 var4 : var2.comp_2400()) {
            var1.add(var4.getString());
         }
      }

      return var1;
   }

   private void ilillIiill(iiiIIliIIIlIli s, String why) {
      long var5 = -3971363526894690438L;
      String var3 = why == null ? "" : why;
      var5 ^= ((long)(this.liiliIllll != iiilllIiIIIillIi.lIliiiIIIi && this.llIiiIllll - this.lIliiIllll >= (-((-1100321708 * -1041204193 >>> 17 | -1100321708 * -1041204193 << 15) + 39) ^ 417972464) ? 0 : 1) << 32 ^ var5) & -1L << 32;
      this.lliliIllll = var3;
      this.iIiliIllll = s;
      if (s == iiiIIliIIIlIli.llIIIIIIIl) {
         this.IliliIllll = this.IllIIlllll > 0 ? IiIliliIli<invokedynamic>() + this.IllIIlllll + IiIliliIli<invokedynamic>() + this.lIiIiiIiIi(this.IllIIlllll) : IiIliliIli<invokedynamic>();
      } else {
         this.IliliIllll = IiIliliIli<invokedynamic>() + (var3.isEmpty() ? IiIliliIli<invokedynamic>() : var3);
      }

      this.IlIIIlllll = null;
      this.lilliIllll.clear();
      this.IIIillIIil();
      lIlillliIlilll.liiiIIllIl(this);
      this.iIliiIllll = this.IIIIIlllll && (int)(var5 >>> 32) != 0 ? ~(-(-(215566227 * 91))) ^ 1858309762 : 0;
   }

   private int lIliliIlil() {
      class_1703 var1 = this.IiiliIllll.field_1724.field_7512;
      int var2 = 1;
      int var3 = 0;

      for(int var4 = var1.field_7761.size() - 36; var3 < var4; ++var3) {
         class_1799 var5 = var1.method_7611(var3).method_7677();
         var2 = 31 * var2 + (var5.method_7960() ? 0 : Objects.hash(new Object[]{var5.method_7909(), var5.method_7947(), iIlIiIllIi(var5)}));
      }

      return var2;
   }

   public iIliIIllIlliIIll() {
      this.iIiliIllll = iiiIIliIIIlIli.iIIIIIIIIl;
      this.IliliIllll = "";
      this.lliliIllll = "";
      this.ililiIllll = iIiilllIliilll.ilIillIIiIiIillIIi;
      this.liiliIllll = iiilllIiIIIillIi.IIliiiIIIi;
      this.IlIiiIllll = IiIliliIli<invokedynamic>();
      this.IlliiIllll = -1;
      this.IiIIIlllll = -1;
   }

   public String IIIllIIliIIl() {
      return this.lliliIllll;
   }

   private void iilllIIill(String why, boolean rescan) {
      this.lliliIllll = why;
      this.IlIIIlllll = null;
      if (++this.IiliiIllll >= ((-1571774395 + 107) * 1056139499 ^ -396689005)) {
         this.ilillIiill(iiiIIliIIIlIli.ilIIIIIIIl, why);
      } else {
         this.IliliIllll = IiIliliIli<invokedynamic>() + why;
         if (rescan && this.illilIilil()) {
            this.lllIiillIi();
            this.liiIiiiiIi(iiilllIiIIIillIi.iIliiiIIIi);
         } else {
            this.IIliiIllll = this.llIiiIllll + (81302496 ^ -69 ^ 119 ^ -81302524) + iIIliIlIli(~(463185662 >>> 15 | 463185662 << 17) ^ -1308374820);
            this.liiIiiiiIi(iiilllIiIIIillIi.iiliiiIIIi);
         }
      }
   }

   private int IIIlilIIli() {
      return this.llIiiIllll - this.ilIiiIllll;
   }

   private boolean liilliiill(String why) {
      this.lliliIllll = why;
      this.IliliIllll = IiIliliIli<invokedynamic>() + why;
      this.iIiliIllll = iiiIIliIIIlIli.ilIIIIIIIl;
      return false;
   }

   private boolean IIllllIlll() {
      long var3 = 4830222317634142470L;
      if (this.IlIIIlllll != null && (this.liiliIllll == iiilllIiIIIillIi.illiiiIIIi || this.liiliIllll == iiilllIiIIIillIi.IiliiiIIIi || this.liiliIllll == iiilllIiIIIillIi.liliiiIIIi)) {
         var3 ^= ((long)Math.max(this.liiliIllll == iiilllIiIIIillIi.liliiiIIIi ? this.IliiiIllll : 0, this.IilIililIi() - this.llIIIlllll) << 32 ^ var3) & -1L << 32;
         if ((int)(var3 >>> 32) <= 0) {
            return true;
         } else {
            Ilililllllililll var2 = this.IlIIIlllll;
            this.IlIIIlllll = null;
            return this.liIlliiIll((int)(var3 >>> 32), var2.IilliliilIIi());
         }
      } else {
         return true;
      }
   }

   private void IllIllllIl() {
      if (this.lIIIiiIIIi()) {
         if (this.IliIilliIi()) {
            this.IlIIillIIi();
            this.iliIiIiiIi();
         }

      } else if (this.iiiilIIIIi()) {
         if (this.IliIilliIi()) {
            this.IiiliIllll.field_1724.method_7346();
            this.iliIiIiiIi();
         }

      } else {
         class_437 var1 = this.IiiliIllll.field_1755;
         if (var1 != null && !(var1 instanceof class_433)) {
            this.IliliIllll = IiIliliIli<invokedynamic>();
            if (this.IIIlilIIli() > 100) {
               this.iilllIIill(IiIliliIli<invokedynamic>(), false);
            }

         } else if (this.IliIilliIi()) {
            if (!lIlillliIlilll.IliIlllilIi(this)) {
               this.IliliIllll = IiIliliIli<invokedynamic>();
               if (this.IIIlilIIli() > 100) {
                  this.iilllIIill(IiIliliIli<invokedynamic>(), false);
               }

            } else {
               int var2 = llIliilIli();
               if (System.nanoTime() - IilliIllll >= 1500000000L && illliIllll.liiiIIllIl(var2)) {
                  IilliIllll = System.nanoTime();
                  illliIllll.iIlIlllllill(var2, 20 + iIIliIlIli(20));
                  this.IiiliIllll.field_1724.field_3944.method_45730(this.IlIiiIllll);
                  this.IIIIIlllll = true;
                  this.lIliiIllll = this.llIiiIllll;
                  this.iliIiIiiIi();
                  this.IlliiIllll = -1;
                  this.llliiIllll = 0;
                  this.iiiiiIllll = false;
                  this.iliiiIllll = false;
                  this.IiiiiIllll = false;
                  this.liliiIllll = 0;
                  this.IlIIIlllll = null;
                  this.IIiliIllll.clear();
                  this.IliliIllll = IiIliliIli<invokedynamic>() + this.lIiIiiIiIi(2);
                  this.liiIiiiiIi(iiilllIiIIIillIi.lIliiiIIIi);
               } else {
                  this.IliliIllll = IiIliliIli<invokedynamic>();
               }
            }
         }
      }
   }

   private void lilIliilIl() {
      if (!this.Ilillllill()) {
         if (this.llIiiIllll >= this.iiIiiIllll && this.IliIilliIi()) {
            int var1 = this.IilIililIi();
            if (var1 >= this.iiiliIllll) {
               this.ilillIiill(iiiIIliIIIlIli.llIIIIIIIl, "");
            } else {
               int var2 = this.IIIiiIllll - this.ilIIIlllll;
               if (var1 >= var2) {
                  this.ilillIiill(iiiIIliIIIlIli.llIIIIIIIl, IiIliliIli<invokedynamic>());
               } else {
                  long var3 = 0L;
                  if (this.iIIiiIllll > 0L) {
                     var3 = this.iIIiiIllll - this.iIlIIlllll;
                     if (var3 <= 0L) {
                        this.ilillIiill(iiiIIliIIIlIli.llIIIIIIIl, IiIliliIli<invokedynamic>());
                        return;
                     }
                  }

                  int var5 = this.iilIiIIiIi();
                  if (var5 == 0) {
                     this.ilillIiill(this.IllIIlllll > 0 ? iiiIIliIIIlIli.llIIIIIIIl : iiiIIliIIIlIli.ilIIIIIIIl, IiIliliIli<invokedynamic>());
                  } else {
                     this.llIililIil();
                     int var6 = var5 * 64;
                     Optional var7 = Iliilliiilii(this.lIiliIllll, var1, this.iiiliIllll, var2, this.lIIiiIllll, var3, var6, this.liiiiIllll ? 1 : 16);
                     if (var7.isPresent()) {
                        this.IlIIIlllll = (Ilililllllililll)var7.get();
                        this.liIiiIllll = 4 + iIIliIlIli(3);
                        this.IliliIllll = IiIliliIli<invokedynamic>() + this.IlIIIlllll.iIlIlllllill() + IiIliliIli<invokedynamic>() + this.lIiIiiIiIi(this.IlIIIlllll.iIlIlllllill()) + IiIliliIli<invokedynamic>() + llIIilIiilIIilIi.liiiIIllIl(this.IlIIIlllll.IilliliilIIi());
                        this.liiIiiiiIi(iiilllIiIIIillIi.llliiiIIIi);
                     } else {
                        boolean var8 = !this.liiiiIllll && Iliilliiilii(this.lIiliIllll, var1, this.iiiliIllll, var2, this.lIIiiIllll, var3, var6, 1).isPresent();
                        if (var8) {
                           this.IiiiiIllll = true;
                        }

                        if (!this.iiiiiIllll && this.llliiIllll < 7) {
                           int var9 = this.iiIilIIlil();
                           if (var9 >= 0) {
                              this.illiiIllll = this.lIliliIlil();
                              this.IiiliIllll.field_1761.method_2906(this.IlliiIllll, var9, 0, class_1713.field_7790, this.IiiliIllll.field_1724);
                              this.iliIiIiiIi();
                              ++this.llliiIllll;
                              this.IliliIllll = IiIliliIli<invokedynamic>() + (this.llliiIllll + 1) + IiIliliIli<invokedynamic>();
                              this.liiIiiiiIi(iiilllIiIIIillIi.IlliiiIIIi);
                              return;
                           }
                        }

                        if (this.IiiiiIllll && !this.liiiiIllll) {
                           this.liiiiIllll = true;
                           if (!var8) {
                              this.liiIiiiiIi(iiilllIiIIIillIi.IIliiiIIIi);
                           }

                        } else if (!this.lIilliIill()) {
                           this.iilllIIill(this.iliiiIllll ? IiIliliIli<invokedynamic>() : IiIliliIli<invokedynamic>(), false);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private int IilIililIi() {
      return Illillliilli(this.IiiliIllll.field_1724.method_31548(), this.ililiIllll);
   }

   // $FF: synthetic method
   private static CallSite lilliiilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) + 25667))))) >>> 7 | (char)(-((char)(-((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) + 25667))))) << 9) + var5) - var5) ^ var5) - 11343) + 10285) << 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) + 25667))))) >>> 7 | (char)(-((char)(-((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) + 25667))))) << 9) + var5) - var5) ^ var5) - 11343) + 10285) >>> 11) - var5) + 28716) + 10962) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) + 25667))))) >>> 7 | (char)(-((char)(-((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) + 25667))))) << 9) + var5) - var5) ^ var5) - 11343) + 10285) << 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) + 25667))))) >>> 7 | (char)(-((char)(-((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) + 25667))))) << 9) + var5) - var5) ^ var5) - 11343) + 10285) >>> 11) - var5) + 28716) + 10962) >>> 2)) ^ '\uf091'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iiiIlIIIll() {
      int var1 = Math.max(this.IliiiIllll, this.IilIililIi() - this.llIIIlllll);
      this.IliiiIllll = var1;
      if (this.iIlllIllll(var1) != null || this.llIiiIllll - this.iIiiiIllll >= 4) {
         int var2 = this.IlIIIlllll == null ? var1 : this.IlIIIlllll.iIlIlllllill();
         long var3 = this.IlIIIlllll == null ? 0L : this.IlIIIlllll.IilliliilIIi();
         if (var1 > var2) {
            this.ilIIIlllll = Math.max(0, this.ilIIIlllll - (var1 - var2));
         }

         if (this.liIlliiIll(var1, var3)) {
            this.IlIIIlllll = null;
            this.IlIIillIIi();
            if (this.IilIililIi() >= this.iiiliIllll) {
               this.ilillIiill(iiiIIliIIIlIli.llIIIIIIIl, "");
            } else if (this.illilIilil()) {
               this.lllIiillIi();
               this.liiIiiiiIi(iiilllIiIIIillIi.iIliiiIIIi);
            } else {
               this.liiIiiiiIi(iiilllIiIIIillIi.IIliiiIIIi);
            }
         }
      }
   }

   public iIiilllIliilll Ililllililil() {
      return this.ililiIllll;
   }

   private int iilIiIIiIi() {
      class_1661 var1 = this.IiiliIllll.field_1724.method_31548();
      int var2 = 0;

      for(int var3 = 0; var3 < 36; ++var3) {
         if (var1.method_5438(var3).method_7960()) {
            ++var2;
         }
      }

      return var2;
   }

   private boolean lIIIiiIIIi() {
      if (this.IiiliIllll == null) {
         return false;
      } else {
         class_437 var1 = this.IiiliIllll.field_1755;
         return var1 != null && !(var1 instanceof class_465) && !(var1 instanceof class_408) && !(var1 instanceof class_433) ? IIlIilIlIi(var1).contains(IiIliliIli<invokedynamic>()) : false;
      }
   }

   private static int llIliilIli() {
      return (int)((System.nanoTime() - lllliIllll) / (831884882154986075L ^ 831884882109491931L));
   }

   private void lllllillll() {
      this.lIIIIlllll = false;
      if (this.IlIIIlllll != null) {
         this.IIiliIllll.add(this.IlIIIlllll);
      }

      this.IlIIIlllll = null;
      ++this.liliiIllll;
      this.IliliIllll = IiIliliIli<invokedynamic>();
      if (this.lIIIiiIIIi()) {
         this.IlIIillIIi();
         this.iliIiIiiIi();
      }

      if (this.liliiIllll >= (-((1640420063 ^ -117) * 858993459) ^ 1389902924)) {
         this.liliiIllll = 0;
         this.liiIiiiiIi(iiilllIiIIIillIi.IIliiiIIIi);
      } else if (this.illilIilil()) {
         this.lllIiillIi();
         this.liiIiiiiIi(iiilllIiIIIillIi.iIliiiIIIi);
      } else {
         this.liiIiiiiIi(iiilllIiIIIillIi.IIliiiIIIi);
      }
   }

   private boolean liIlliiIll(int gain, long listingTotal) {
      IIIililIIili var4 = this.iIlllIllll(gain);
      if (var4 != null) {
         this.iilliIllll.remove(var4);
      }

      long var5 = var4 != null ? var4.liiiIIllIl() : listingTotal;
      this.iIlIIlllll += var5;
      ++this.lllIIlllll;
      this.IllIIlllll += gain;
      this.IiliiIllll = 0;
      this.iiliiIllll = 0;
      this.IliliIllll = IiIliliIli<invokedynamic>() + gain + IiIliliIli<invokedynamic>() + this.lIiIiiIiIi(gain) + IiIliliIli<invokedynamic>() + llIIilIiilIIilIi.liiiIIllIl(var5);
      if (lllIillillIill.lIiiIiIlilli(var5, listingTotal)) {
         this.IIlIIlllll = true;
         this.ilillIiill(iiiIIliIIIlIli.ilIIIIIIIl, IiIliliIli<invokedynamic>());
         return false;
      } else {
         return true;
      }
   }

   public boolean IIillIiliIil() {
      return this.IIlIIlllll;
   }

   public void IilliliilIIi() {
      long var3 = 4775783708288201705L;
      var3 ^= ((long)(this.iIiliIllll == iiiIIliIIIlIli.IlIIIIIIIl ? 1 : 0) << 32 ^ var3) & -1L << 32;
      this.IiiliIllll = class_310.method_1551();
      if ((int)(var3 >>> 32) != 0) {
         try {
            if (this.IlIIIlllll != null && this.liiliIllll == iiilllIiIIIillIi.IiliiiIIIi && this.IiiliIllll != null && this.IiiliIllll.field_1724 != null && this.IilIililIi() <= this.llIIIlllll) {
               this.iIlIIlllll += this.IlIIIlllll.IilliliilIIi();
               ++this.lllIIlllll;
            } else {
               this.IIllllIlll();
            }
         } catch (Throwable var5) {
         }
      }

      var3 ^= ((long)((int)(var3 >>> 32) == 0 || this.liiliIllll != iiilllIiIIIillIi.lIliiiIIIi && this.llIiiIllll - this.lIliiIllll >= (-((207436904 << 1 | 207436904 >>> 31) - -21) ^ -414873817) ? 0 : 1) ^ var3) & -1L >>> 32;
      this.iIiliIllll = iiiIIliIIIlIli.iIIIIIIIIl;
      this.IliliIllll = "";
      this.IlIIIlllll = null;
      this.lilliIllll.clear();
      if ((int)(var3 >>> 32) != 0) {
         this.IIIillIIil();
         this.iIliiIllll = this.IIIIIlllll && (int)var3 != 0 ? ~519025425 ^ -35 ^ 519025423 : 0;
      }

      lIlillliIlilll.liiiIIllIl(this);
   }

   private void IIiIllIiIl() {
      if (!this.illilIilil()) {
         if (this.IIIlilIIli() > 30) {
            this.Ilillllill();
         }

      } else if (this.IiiliIllll.field_1724.field_7512.field_7763 == this.IlliiIllll && this.lIliliIlil() == this.illiiIllll) {
         if (this.IIIlilIIli() > 30) {
            this.iiiiiIllll = true;
            this.iiIiiIllll = this.llIiiIllll;
            this.liiIiiiiIi(iiilllIiIIIillIi.iIliiiIIIi);
         }

      } else {
         this.IIiliIllll.clear();
         this.lllIiillIi();
         this.liiIiiiiIi(iiilllIiIIIillIi.iIliiiIIIi);
      }
   }

   public boolean IliIlllilIi(iIiilllIliilll maxUnitPrice, int budgetLeft, int targetCount, long goods, long capCount) {
      if (this.iIiliIllll == iiiIIliIIIlIli.IlIIIIIIIl) {
         this.IilliliilIIi();
      }

      this.IiiliIllll = class_310.method_1551();
      this.ililiIllll = maxUnitPrice == null ? iIiilllIliilll.ilIillIIiIiIillIIi : maxUnitPrice;
      this.IIIiiIllll = targetCount > 0 ? targetCount : Math.max(0, budgetLeft);
      this.iiiliIllll = Math.min(Math.max(0, budgetLeft), this.IIIiiIllll);
      this.lIIiiIllll = Math.max(0L, goods);
      this.iIIiiIllll = Math.max(0L, capCount);
      this.IlIiiIllll = IIiilIiiiIii(this.ililiIllll, false);
      this.lilliIllll.clear();
      this.iilliIllll.clear();
      this.IIiliIllll.clear();
      this.lIiliIllll.clear();
      this.llIiiIllll = 0;
      this.ilIiiIllll = 0;
      this.IiIiiIllll = -1000;
      this.liIiiIllll = 4;
      this.iiIiiIllll = 0;
      this.IIliiIllll = 0;
      this.lIliiIllll = -1000;
      this.iIliiIllll = 0;
      this.IlliiIllll = -1;
      this.llliiIllll = 0;
      this.illiiIllll = 0;
      this.IiliiIllll = 0;
      this.liliiIllll = 0;
      this.iiliiIllll = 0;
      this.IIiiiIllll = 0;
      this.lIiiiIllll = 0;
      this.iIiiiIllll = 0;
      this.IliiiIllll = 0;
      this.lliiiIllll = false;
      this.iliiiIllll = false;
      this.IiiiiIllll = false;
      this.liiiiIllll = false;
      this.iiiiiIllll = false;
      this.IIIIIlllll = false;
      this.lIIIIlllll = false;
      this.iIIIIlllll = null;
      this.IlIIIlllll = null;
      this.llIIIlllll = 0;
      this.ilIIIlllll = 0;
      this.IiIIIlllll = -1;
      this.liIIIlllll = 0;
      this.lIlIIlllll = 0L;
      this.iIlIIlllll = 0L;
      this.IllIIlllll = 0;
      this.lllIIlllll = 0;
      this.illIIlllll = false;
      this.lliliIllll = "";
      this.IIlIIlllll = false;
      this.iiIIIlllll = 0;
      this.liiliIllll = iiilllIiIIIillIi.IIliiiIIIi;

      try {
         if (this.IiiliIllll == null || this.IiiliIllll.field_1724 == null || this.IiiliIllll.field_1761 == null || this.IiiliIllll.field_1724.field_3944 == null) {
            return this.liilliiill(IiIliliIli<invokedynamic>());
         }

         int var8 = Illillliilli(this.IiiliIllll.field_1724.method_31548(), this.ililiIllll);
         if (this.iiiliIllll <= 0 || var8 >= this.iiiliIllll) {
            return this.liilliiill(IiIliliIli<invokedynamic>() + this.lIiIiiIiIi(2));
         }

         if (this.iilIiIIiIi() == 0) {
            return this.liilliiill(IiIliliIli<invokedynamic>());
         }
      } catch (Throwable var9) {
         return this.liilliiill(IiIliliIli<invokedynamic>() + var9.getClass().getSimpleName());
      }

      this.IliliIllll = IiIliliIli<invokedynamic>() + this.lIiIiiIiIi(2);
      this.iIiliIllll = iiiIIliIIIlIli.IlIIIIIIIl;
      return true;
   }

   private IIIililIIili iIlllIllll(int gain) {
      for(int var2 = this.iilliIllll.size() - 1; var2 >= 0; --var2) {
         if (((IIIililIIili)this.iilliIllll.get(var2)).IliIlllilIi() == gain) {
            return (IIIililIIili)this.iilliIllll.get(var2);
         }
      }

      return null;
   }

   private static String IIlIilIlIi(class_437 s) {
      if (s == null) {
         return "";
      } else {
         class_2561 var1 = s.method_25440();
         return var1 == null ? "" : iIIiiilIlIiiil.IliIlllilIi(var1.getString()).toLowerCase(Locale.ROOT);
      }
   }

   private String lIiIiiIiIi(int n) {
      if (this.ililiIllll == iIiilllIliilll.liIillIIiiiIillIIi) {
         return n == ((965337349 << 21 | 965337349 >>> 11) * -121 * 29 ^ 1816798357) ? IiIliliIli<invokedynamic>() : IiIliliIli<invokedynamic>();
      } else {
         return n == (((751387861 ^ 77) - -77 << 27 | (751387861 ^ 77) - -77 >>> 5) ^ 694569510) ? IiIliliIli<invokedynamic>() : IiIliliIli<invokedynamic>();
      }
   }

   private void iliIiIiiIi() {
      this.IiIiiIllll = this.llIiiIllll;
   }

   public int Illlllllilll() {
      return this.lllIIlllll;
   }

   private void IiiIlliiIl() {
      if (this.lIIIIlllll) {
         this.lllllillll();
      } else if (this.IilIililIi() > this.llIIIlllll) {
         this.lIIlliIIll();
      } else {
         this.IliliIllll = IiIliliIli<invokedynamic>();
         if (this.lIiiiIllll >= 3 || this.llIiiIllll - this.IiIiiIllll < 12 || !this.lIIIiiIIIi() && !this.lililiilil()) {
            if (this.IIIlilIIli() > 60) {
               this.Iillllilll(IiIliliIli<invokedynamic>());
            }

         } else {
            this.IIiiiIllll = 0;
            this.liiIiiiiIi(iiilllIiIIIillIi.illiiiIIIi);
         }
      }
   }

   private void liiIiiiiIi(iiilllIiIIIillIi p) {
      this.liiliIllll = p;
      this.ilIiiIllll = this.llIiiIllll;
   }

   private void lIlIliIlIl() {
      String var1;
      while((var1 = (String)this.lilliIllll.poll()) != null) {
         switch (IIIIllIIIl(var1).ordinal()) {
            case 1:
               this.lIIIIlllll = true;
               break;
            case 2:
               this.iIIIIlllll = IiIliliIli<invokedynamic>();
               break;
            case 3:
               if (this.iIIIIlllll == null) {
                  this.iIIIIlllll = IiIliliIli<invokedynamic>();
               }
               break;
            case 4:
               IIIililIIili var2 = llIIlilIIl(var1, this.ililiIllll);
               if (var2 != null) {
                  if (this.iilliIllll.size() >= 8) {
                     this.iilliIllll.remove(0);
                  }

                  this.iilliIllll.add(var2);
               }
         }
      }

   }

   private boolean Illillllil() {
      class_1703 var1 = this.IiiliIllll.field_1724.field_7512;
      int var2 = var1.field_7761.size() - 36;
      int var3 = -1;

      for(int var4 = 0; var4 < 2 && var3 < 0; ++var4) {
         for(int var5 = 0; var5 < var2 && var3 < 0; ++var5) {
            class_1799 var6 = var1.method_7611(var5).method_7677();
            if (!var6.method_7960() && !Iilililiiili(var6, this.ililiIllll)) {
               List var7 = iIlIiIllIi(var6);
               if (!iIIiiilIlIiiil.lIiiIiIlilli(var7.subList(1, var7.size()), IiIliliIli<invokedynamic>())) {
                  if (var4 == 0) {
                     if (!IiIIlliIIl((String)var7.get(0))) {
                        continue;
                     }
                  } else if (!lliililiil(var6)) {
                     continue;
                  }

                  var3 = var5;
               }
            }
         }
      }

      if (var3 < 0) {
         return false;
      } else {
         this.IiiliIllll.field_1761.method_2906(var1.field_7763, var3, 0, class_1713.field_7790, this.IiiliIllll.field_1724);
         return true;
      }
   }

   static String IIiilIiiiIii(iIiilllIliilll g, boolean alternate) {
      if (g == iIiilllIliilll.liIillIIiiiIillIIi) {
         return alternate ? IiIliliIli<invokedynamic>() : IiIliliIli<invokedynamic>();
      } else {
         return IiIliliIli<invokedynamic>();
      }
   }

   public iiiIIliIIIlIli lIiiIiIlilli() {
      return this.iIiliIllll;
   }

   static IIIililIIili llIIlilIIl(String g, iIiilllIliilll raw) {
      Optional var2 = iIIiiilIlIiiil.iliIiiliiiii(g);
      return !var2.isEmpty() && iIIIlIlIIl(((IIIililIIili)var2.get()).iIlIlllllill(), raw) ? (IIIililIIili)var2.get() : null;
   }

   // $FF: synthetic method
   private static CallSite lIlliiIlli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') >>> 7 | (char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') << 9))) ^ 31973) >>> 6 | (char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') >>> 7 | (char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') << 9))) ^ 31973) << 10) >>> 15 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') >>> 7 | (char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') << 9))) ^ 31973) >>> 6 | (char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') >>> 7 | (char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') << 9))) ^ 31973) << 10) << 1) + var5) << 5 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') >>> 7 | (char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') << 9))) ^ 31973) >>> 6 | (char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') >>> 7 | (char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') << 9))) ^ 31973) << 10) >>> 15 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') >>> 7 | (char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') << 9))) ^ 31973) >>> 6 | (char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') >>> 7 | (char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') << 9))) ^ 31973) << 10) << 1) + var5) >>> 11))))) - '\ud9e8') - var5) + var5))) + var5) >>> 4 | (char)((char)(~((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') >>> 7 | (char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') << 9))) ^ 31973) >>> 6 | (char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') >>> 7 | (char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') << 9))) ^ 31973) << 10) >>> 15 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') >>> 7 | (char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') << 9))) ^ 31973) >>> 6 | (char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') >>> 7 | (char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') << 9))) ^ 31973) << 10) << 1) + var5) << 5 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') >>> 7 | (char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') << 9))) ^ 31973) >>> 6 | (char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') >>> 7 | (char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') << 9))) ^ 31973) << 10) >>> 15 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') >>> 7 | (char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') << 9))) ^ 31973) >>> 6 | (char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') >>> 7 | (char)((char)((char)(var4[var5] - var5) + 16729) ^ '﯁') << 9))) ^ 31973) << 10) << 1) + var5) >>> 11))))) - '\ud9e8') - var5) + var5))) + var5) << 12) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static boolean Iilililiiili(class_1799 s, iIiilllIliilll g) {
      return g == iIiilllIliilll.liIillIIiiiIillIIi ? IIlilIliiIli(s) : IlIillIiilIi(s);
   }

   public long IiIlliIliiIl() {
      return this.iIlIIlllll;
   }

   private boolean lililiilil() {
      if (!this.iiiilIIIIi()) {
         return false;
      } else {
         String var1 = this.liIIiiiIIi();
         if (!var1.contains(IiIliliIli<invokedynamic>()) && !var1.contains(IiIliliIli<invokedynamic>())) {
            if (var1.contains(IiIliliIli<invokedynamic>())) {
               return false;
            } else {
               return this.IiiliIllll.field_1724.field_7512.field_7763 != this.IlliiIllll || this.iIiilIliil(true) && this.iIiilIliil(false);
            }
         } else {
            return true;
         }
      }
   }

   static boolean iIIIlIlIIl(String name, iIiilllIliilll g) {
      if (name != null && g != null) {
         String var2 = iIIiiilIlIiiil.IliIlllilIi(name).toLowerCase(Locale.ROOT).trim();
         if (g == iIiilllIliilll.liIillIIiiiIillIIi) {
            return var2.startsWith(IiIliliIli<invokedynamic>()) && var2.contains(IiIliliIli<invokedynamic>());
         } else {
            StringBuilder var3 = new StringBuilder(var2.length());

            for(int var4 = 0; var4 < var2.length(); ++var4) {
               if (Character.isLetterOrDigit(var2.charAt(var4))) {
                  var3.append(var2.charAt(var4));
               }
            }

            String var5 = var3.toString();
            return var5.startsWith(IiIliliIli<invokedynamic>()) && !var5.contains(IiIliliIli<invokedynamic>());
         }
      } else {
         return false;
      }
   }

   private Ilililllllililll IiIilliIil(class_1703 h, int slot) {
      if (h != null && slot >= 0 && slot < h.field_7761.size() - (1025636133 + -101 + -39 ^ 1025636029)) {
         class_1799 var3 = h.method_7611(slot).method_7677();
         if (!Iilililiiili(var3, this.ililiIllll)) {
            return null;
         } else {
            OptionalLong var4 = Iiiiliiiiiii(iIlIiIllIi(var3));
            return var4.isEmpty() ? null : new Ilililllllililll(slot, Math.max(1, var3.method_7947()), var4.getAsLong());
         }
      } else {
         return null;
      }
   }

   private void illIlIilIl() {
      if (!this.illilIilil()) {
         this.IliliIllll = IiIliliIli<invokedynamic>();
         if (this.IIIlilIIli() > 100 && !this.lIilliIill()) {
            this.iilllIIill(IiIliliIli<invokedynamic>(), false);
         }

      } else {
         this.lllIiillIi();
         this.IliliIllll = IiIliliIli<invokedynamic>();
         this.liiIiiiiIi(iiilllIiIIIillIi.iIliiiIIIi);
      }
   }

   private void lIIlliIIll() {
      this.iIiiiIllll = this.llIiiIllll;
      this.IliiiIllll = this.IilIililIi() - this.llIIIlllll;
      this.IliliIllll = IiIliliIli<invokedynamic>();
      this.liiIiiiiIi(iiilllIiIIIillIi.liliiiIIIi);
   }

   private static boolean Iiiilliiil(class_1799 st) {
      return st != null && !st.method_7960() && (st.method_31574(class_1802.field_8879) || st.method_31574(class_1802.field_19058) || st.method_31574(class_1802.field_8077));
   }

   private boolean IIiillIiil() {
      class_1703 var1 = this.IiiliIllll.field_1724.field_7512;
      int var2 = 0;

      for(int var3 = var1.field_7761.size() - 36; var2 < var3; ++var2) {
         if (Iilililiiili(var1.method_7611(var2).method_7677(), this.ililiIllll)) {
            return true;
         }
      }

      return false;
   }

   private void llIililIil() {
      this.lIiliIllll.clear();
      class_1703 var1 = this.IiiliIllll.field_1724.field_7512;
      int var2 = 0;

      for(int var3 = var1.field_7761.size() - 36; var2 < var3; ++var2) {
         if (Iilililiiili(var1.method_7611(var2).method_7677(), this.ililiIllll)) {
            this.iliiiIllll = true;
            Ilililllllililll var4 = this.IiIilliIil(var1, var2);
            if (var4 != null && !this.IIiliIllll.contains(var4)) {
               this.lIiliIllll.add(var4);
            }
         }
      }

   }

   private void lliIliliIl() {
      if (this.lIIIIlllll) {
         this.lllllillll();
      } else if (this.IilIililIi() > this.llIIIlllll) {
         this.lIIlliIIll();
      } else if (this.lIIIiiIIIi()) {
         this.IliliIllll = IiIliliIli<invokedynamic>();
         if (this.IliIilliIi()) {
            if (this.IIiiiIllll == 0) {
               this.ilIIiIiIIi(263);
               this.IIiiiIllll = 1;
               this.iliIiIiiIi();
            } else {
               this.ilIIiIiIIi(257);
               this.IIiiiIllll = 0;
               ++this.lIiiiIllll;
               this.iliIiIiiIi();
               this.liiIiiiiIi(iiilllIiIIIillIi.IiliiiIIIi);
            }
         }
      } else {
         if (this.lililiilil()) {
            this.IliliIllll = IiIliliIli<invokedynamic>();
            if (!this.IliIilliIi()) {
               return;
            }

            if (this.Illillllil()) {
               ++this.lIiiiIllll;
               this.iliIiIiiIi();
               this.liiIiiiiIi(iiilllIiIIIillIi.IiliiiIIIi);
               return;
            }
         }

         if (this.IIIlilIIli() > 60) {
            this.Iillllilll(IiIliliIli<invokedynamic>());
         }

      }
   }

   public boolean Iilllilliill() {
      return this.illIIlllll;
   }
}
