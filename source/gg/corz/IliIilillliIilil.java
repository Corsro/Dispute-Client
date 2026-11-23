package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IliIilillliIilil {
   private long llIlIlIlil;
   public static final String IIlIIlIlil = "This server has no /rtp - you're still at home.";
   public static final double IliiiIIlil = (double)6.0F;
   private long IIllIlIlil;
   private boolean llllIlIlil;
   public static final long iiliiIIlil = 10000L;
   public static final long iiIiiIIlil = 1500L;
   public static final String iIlIIlIlil = "/rtp opened a menu it couldn't use - still at home.";
   public static final String lIlIIlIlil = "/rtp did not teleport you - you're still at home.";
   public static final String lIIIIlIlil = "Home Name can only use letters, numbers, - and _.";
   public static final String IiIIIlIlil = "No free home slot - stopped before /rtp.";
   public static final long llliiIIlil = 60000L;
   public static final String llIIIlIlil = "/sethome did not answer - stopped before /rtp.";
   public static final String lilIIlIlil = "/home did not bring you back. Try /home yourself.";
   private final iiiIIIIlIIIlIIIl IliIIlIlil;
   public static final String iiIIIlIlil = "Couldn't replace the old home - stopped before /rtp.";
   private long IlIlIlIlil;
   public static final int IlliiIIlil = 2;
   private final iliIIlilIiiIIlil iIiIIlIlil = new iliIIlilIiiIIlil();
   private IIIiIiillIIiIiil IIIlIlIlil;
   private final String lliIIlIlil;
   private int IillIlIlil;
   public static final long liiiiIIlil = 3000L;
   public static final long IiliiIIlil = 6000L;
   public static final String ilIIIlIlil = "/sethome opened a menu - stopped before /rtp.";
   public static final long lIliiIIlil = 3000L;
   private long ilIlIlIlil;
   private IIIiIiillIIiIiil iiiIIlIlil;
   public static final long IIliiIIlil = 5000L;
   public static final int IiiiiIIlil = 3;
   public static final long illiiIIlil = 5000L;
   private long iIIlIlIlil;
   public static final String lIiIIlIlil = "Back home.";
   public static final long iliiiIIlil = 30000L;
   private String lIIlIlIlil;
   public static final String iilIIlIlil = "/home got cancelled - hold still and try /home.";
   private final String iliIIlIlil;
   public static final long iIliiIIlil = 2500L;
   private long lIllIlIlil;
   public static final String IllIIlIlil = "In combat - /rtp refused, you're still at home.";
   public static final String IilIIlIlil = "/home opened a menu. Use /home to go back yourself.";
   private long iIllIlIlil;
   private long IiIlIlIlil;
   public static final double lIiiiIIlil = 0.6;
   public static final long IIIIIlIlil = 2000L;
   private IIIiIiillIIiIiil liiIIlIlil;
   public static final long lliiiIIlil = 15000L;
   public static final String illIIlIlil = "This server has no /home.";
   public static final long IIiiiIIlil = 1000L;
   private long iiIlIlIlil;
   public static final String lllIIlIlil = "/rtp cancelled - hold still during the countdown.";
   private boolean IlllIlIlil;
   private int lillIlIlil;
   public static final String IlIIIlIlil = "This server has no /sethome.";
   private long liIlIlIlil;
   public static final long liliiIIlil = 1500L;
   private iiIliIiIIlliIi IiiIIlIlil;
   public static final String liIIIlIlil = "Can't set a home here - stopped before /rtp.";
   public static final String iIIIIlIlil = "You died - Silent Home stopped.";
   public static final double iIiiiIIlil = (double)24.0F;
   public static final long iiiiiIIlil = 180000L;
   private boolean illlIlIlil;
   public static final String IIiIIlIlil = "Took too long and stopped - use /home to go back.";

   private boolean iIIIlIlIIl(IIIiIiillIIiIiil at) {
      return this.liiIIlIlil != null && at != null && this.liiIIlIlil.IliIlllilIi(at) && this.liiIIlIlil.liiiIIllIl(at) <= Double.longBitsToDouble(8720449750890887977L ^ 4115519131904555817L);
   }

   // $FF: synthetic method
   private static CallSite lIIlliIIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) ^ var5) ^ 16807) - 14693) + var5) + 19553) ^ var5) ^ var5))) ^ '뵣') + 27039) - 29895) - 13666));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private lllIiIiillIiIi Iilllilliill(IilIiilllilIiill in, long now) {
      if (in.IilliliilIIi()) {
         return this.lilIliilIl(IIiIllIiIl<invokedynamic>(), now);
      } else if (now < this.ilIlIlIlil) {
         return lllIiIiillIiIi.lIiIilliiiIiIillii;
      } else if (this.IiiIIlIlil == iiIliIiIIlliIi.lllIliliiillIlilii) {
         this.IiiIIlIlil = iiIliIiIIlliIi.liIIliliiiiIIlilii;
         this.IiIlIlIlil = now;
         return lllIiIiillIiIi.lIiIilliiiIiIillii;
      } else {
         return this.illIlIilIl(IIiIllIiIl<invokedynamic>(), now);
      }
   }

   private lllIiIiillIiIi IIiilIiiiIii(String now, long line) {
      IilIIiililIIii var4 = iiilliilIIIiliil.liiiIIllIl(now);
      boolean var5 = line - this.llIlIlIlil <= 5000L;
      if (var4 == IilIIiililIIii.IililllIIl && iiilliilIIIiliil.IilliliilIIi(now)) {
         var4 = IilIIiililIIii.lliilllIIl;
      }

      switch (var4) {
         case IliilllIIl:
            if (var5) {
               return this.illIlIilIl(liiiIIllIl(this.lliIIlIlil), line);
            }
            break;
         case iililllIIl:
            if (var5 && iiilliilIIIiliil.iliIiiliiiii(now)) {
               return this.illIlIilIl(IIiIllIiIl<invokedynamic>(), line);
            }
            break;
         case lliilllIIl:
            long var8 = iiilliilIIIiliil.iIlIlllllill(now);
            this.llllIlIlil = true;
            this.ilIlIlIlil = Math.max(this.ilIlIlIlil, line + (var8 > 0L ? var8 : 5000L) + 5000L);
            break;
         case IiiilllIIl:
            if (iiilliilIIIiliil.IIIllIIliIIl(now)) {
               return this.Iliilliiilii(line, 0L, IIiIllIiIl<invokedynamic>());
            }
            break;
         case IililllIIl:
         case lililllIIl:
            if (var5 && iiilliilIIIiliil.iliIiiliiiii(now)) {
               long var6 = var4 == IilIIiililIIii.IililllIIl ? iiilliilIIIiliil.iIlIlllllill(now) : -1L;
               if (var6 > 30000L) {
                  return this.illIlIilIl(IilliliilIIi(var6), line);
               }

               return this.Iliilliiilii(line, var6 > 0L ? var6 + 1000L : 5000L, var4 == IilIIiililIIii.IililllIIl ? IilliliilIIi(var6) : IIiIllIiIl<invokedynamic>());
            }
      }

      return null;
   }

   public static String IilliliilIIi(long waitMs) {
      String var2 = waitMs > (-4154989917894627822L ^ -4154989917894627822L) ? IIiIllIiIl<invokedynamic>() + lIIiiIIiiIIiiIIi.iliIiiliiiii(waitMs) : "";
      return IIiIllIiIl<invokedynamic>() + var2 + IIiIllIiIl<invokedynamic>();
   }

   private lllIiIiillIiIi IIlllIlliIll(IilIiilllilIiill in, long now) {
      if (!IliIlllilIi(this.lliIIlIlil)) {
         return this.illIlIilIl(IIiIllIiIl<invokedynamic>(), now);
      } else if (!this.llIIlilIIl(now)) {
         return lllIiIiillIiIi.lIiIilliiiIiIillii;
      } else {
         this.liiIIlIlil = in.liiiIIllIl();
         this.iiIIlIIlIl(iiIliIiIIlliIi.IIlIliliilIlIlilii, now, 6071186184516024940L ^ 6071186184516020708L);
         return this.lIlIliIlIl(IIiIllIiIl<invokedynamic>() + this.lliIIlIlil, now);
      }
   }

   // $FF: synthetic method
   private static CallSite IiiIlliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(-((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + '헑') + 'ﭷ') ^ var5) - '\udd10') << 7 | (char)((char)((char)((char)((char)(var4[var5] + var5) + '헑') + 'ﭷ') ^ var5) - '\udd10') >>> 9) << 5 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) + '헑') + 'ﭷ') ^ var5) - '\udd10') << 7 | (char)((char)((char)((char)((char)(var4[var5] + var5) + '헑') + 'ﭷ') ^ var5) - '\udd10') >>> 9) >>> 11) ^ 'ﺐ') + var5))))))) + 994))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private lllIiIiillIiIi IIillIiliIil(long now) {
      if (!this.llIIlilIIl(now)) {
         return lllIiIiillIiIi.lIiIilliiiIiIillii;
      } else {
         String var3 = this.IliIIlIlil.IilliliilIIi(this.iliIIlIlil);
         this.lIIlIlIlil = iiiIIIIlIIIlIIIl.liiiIIllIl(var3) ? var3 : IIiIllIiIl<invokedynamic>();
         this.iIiIIlIlil.IlIlllIlilIl(now);
         this.llllIlIlil = false;
         this.illlIlIlil = false;
         this.IIllIlIlil = 0L;
         this.iiIIlIIlIl(iiIliIiIIlliIi.iilIliliiIIiIlilii, now, 5462517417921645302L ^ 5462517417921634454L);
         return this.lIlIliIlIl(IIiIllIiIl<invokedynamic>() + this.lIIlIlIlil, now);
      }
   }

   private lllIiIiillIiIi Iiiiliiiiiii(iiIliIiIIlliIi back, long now, String failText) {
      if (this.lillIlIlil >= (-(-(262768358 ^ -37)) ^ -262768321)) {
         return this.illIlIilIl(failText, now);
      } else {
         ++this.lillIlIlil;
         this.IiiIIlIlil = back;
         this.IiIlIlIlil = now + (3756669920099255841L ^ 3756669920099258341L);
         return lllIiIiillIiIi.lIiIilliiiIiIillii;
      }
   }

   private boolean llIIlilIIl(long now) {
      return now >= this.IiIlIlIlil && (this.IlIlIlIlil == (-7500142733239796953L ^ -7500142733239796953L) || now - this.IlIlIlIlil >= (-7161647308745624782L ^ -7161647308745623826L));
   }

   public static String liiiIIllIl(String name) {
      return IIiIllIiIl<invokedynamic>() + name + IIiIllIiIl<invokedynamic>();
   }

   public static boolean IliIlllilIi(String name) {
      return name != null && !name.isBlank() && lIIiiIIiiIIiiIIi.iIlIlllllill(name);
   }

   public String iliIiiliiiii() {
      return this.lIIlIlIlil;
   }

   private lllIiIiillIiIi IllIllllIl(long now) {
      this.IiiIIlIlil = iiIliIiIIlliIi.liiIliliiiiiIlilii;
      this.iIllIlIlil = now;
      return new lllIiIiillIiIi(liiiIIlliiiiIIll.IIliIlllll, IIiIllIiIl<invokedynamic>());
   }

   private boolean IiIIlliIIl(long now) {
      return now - this.llIlIlIlil <= (-7586643139502819892L ^ -7586643139502817676L);
   }

   // $FF: synthetic method
   private static CallSite iIiIlIliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ua48f') - '썄') << 4 | (char)((char)(var4[var5] ^ '\ua48f') - '썄') >>> 12) - '\ue1cf') - var5))) ^ var5))) >>> 1 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ua48f') - '썄') << 4 | (char)((char)(var4[var5] ^ '\ua48f') - '썄') >>> 12) - '\ue1cf') - var5))) ^ var5))) << 15) + 1814) ^ 20180) - var5) << 4 | (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ua48f') - '썄') << 4 | (char)((char)(var4[var5] ^ '\ua48f') - '썄') >>> 12) - '\ue1cf') - var5))) ^ var5))) >>> 1 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ua48f') - '썄') << 4 | (char)((char)(var4[var5] ^ '\ua48f') - '썄') >>> 12) - '\ue1cf') - var5))) ^ var5))) << 15) + 1814) ^ 20180) - var5) >>> 12) + var5) ^ var5) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ua48f') - '썄') << 4 | (char)((char)(var4[var5] ^ '\ua48f') - '썄') >>> 12) - '\ue1cf') - var5))) ^ var5))) >>> 1 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ua48f') - '썄') << 4 | (char)((char)(var4[var5] ^ '\ua48f') - '썄') >>> 12) - '\ue1cf') - var5))) ^ var5))) << 15) + 1814) ^ 20180) - var5) << 4 | (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ua48f') - '썄') << 4 | (char)((char)(var4[var5] ^ '\ua48f') - '썄') >>> 12) - '\ue1cf') - var5))) ^ var5))) >>> 1 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ua48f') - '썄') << 4 | (char)((char)(var4[var5] ^ '\ua48f') - '썄') >>> 12) - '\ue1cf') - var5))) ^ var5))) << 15) + 1814) ^ 20180) - var5) >>> 12) + var5) ^ var5) << 3) ^ 1730) + var5) ^ '뤶'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private lllIiIiillIiIi illIlIilIl(String text, long now) {
      this.IiiIIlIlil = iiIliIiIIlliIi.liiIliliiiiiIlilii;
      this.iIllIlIlil = now;
      return new lllIiIiillIiIi(liiiIIlliiiiIIll.lIliIlllll, text);
   }

   // $FF: synthetic method
   private static CallSite lliIliliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) >>> 3 | (char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) << 13) - '챖') + var5) << 6 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) >>> 3 | (char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) << 13) - '챖') + var5) >>> 10) << 4 | (char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) >>> 3 | (char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) << 13) - '챖') + var5) << 6 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) >>> 3 | (char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) << 13) - '챖') + var5) >>> 10) >>> 12) - '\ueedf') - '兀') >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) >>> 3 | (char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) << 13) - '챖') + var5) << 6 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) >>> 3 | (char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) << 13) - '챖') + var5) >>> 10) << 4 | (char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) >>> 3 | (char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) << 13) - '챖') + var5) << 6 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) >>> 3 | (char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) << 13) - '챖') + var5) >>> 10) >>> 12) - '\ueedf') - '兀') << 7) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) >>> 3 | (char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) << 13) - '챖') + var5) << 6 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) >>> 3 | (char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) << 13) - '챖') + var5) >>> 10) << 4 | (char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) >>> 3 | (char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) << 13) - '챖') + var5) << 6 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) >>> 3 | (char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) << 13) - '챖') + var5) >>> 10) >>> 12) - '\ueedf') - '兀') >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) >>> 3 | (char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) << 13) - '챖') + var5) << 6 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) >>> 3 | (char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) << 13) - '챖') + var5) >>> 10) << 4 | (char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) >>> 3 | (char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) << 13) - '챖') + var5) << 6 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) >>> 3 | (char)(-((char)((char)((char)(-((char)(var4[var5] + 9128))) << 2 | (char)(-((char)(var4[var5] + 9128))) >>> 14) + '정'))) << 13) - '챖') + var5) >>> 10) >>> 12) - '\ueedf') - '兀') << 7) >>> 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private lllIiIiillIiIi IiIiliIiiiIi(IilIiilllilIiill now, long in) {
      List var4 = now.iliIiiliiiii();
      if (var4 != null && !var4.isEmpty()) {
         for(String var6 : var4) {
            if (var6 != null && !var6.isBlank() && !iiilliilIIIiliil.IlIlllIlilIl(var6, now.IIIllIIliIIl())) {
               lllIiIiillIiIi var10000;
               switch (this.IiiIIlIlil.ordinal()) {
                  case 1:
                     var10000 = this.IIlilIliiIli(var6, in);
                     break;
                  case 2:
                  case 4:
                  case 6:
                  case 7:
                  default:
                     var10000 = null;
                     break;
                  case 3:
                     var10000 = this.Illillliilli(var6, in);
                     break;
                  case 5:
                     var10000 = this.Iilililiiili(var6, in, now.IIIllIIliIIl());
                     break;
                  case 8:
                     var10000 = this.IIiilIiiiIii(var6, in);
               }

               lllIiIiillIiIi var7 = var10000;
               if (var7 != null) {
                  return var7;
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private lllIiIiillIiIi IlIillIiilIi(IilIiilllilIiill in, long now) {
      if (this.iIIIlIlIIl(in.liiiIIllIl())) {
         return this.IllIllllIl(now);
      } else if (in.IilliliilIIi()) {
         return this.lilIliilIl(IIiIllIiIl<invokedynamic>(), now);
      } else {
         return now >= this.ilIlIlIlil ? this.Iliilliiilii(now, 0L, IIiIllIiIl<invokedynamic>()) : lllIiIiillIiIi.lIiIilliiiIiIillii;
      }
   }

   public IIIiIiillIIiIiil IIIllIIliIIl() {
      return this.liiIIlIlil;
   }

   public lllIiIiillIiIi IiIlliIliiIl(IilIiilllilIiill in) {
      if (this.IiiIIlIlil != iiIliIiIIlliIi.liiIliliiiiiIlilii && in != null) {
         long var2 = in.IliIlllilIi();
         if (this.iIIlIlIlil == 0L) {
            this.iIIlIlIlil = var2;
         }

         IIIiIiillIIiIiil var4 = in.liiiIIllIl();
         boolean var5 = this.iiiIIlIlil != null && var4 != null && (!this.iiiIIlIlil.IliIlllilIi(var4) || this.iiiIIlIlil.liiiIIllIl(var4) > (double)24.0F);
         if (var4 != null) {
            this.iiiIIlIlil = var4;
         }

         if (in.lIiiIiIlilli()) {
            return this.illIlIilIl(IIiIllIiIl<invokedynamic>(), var2);
         } else if (var2 - this.iIIlIlIlil > 180000L) {
            return this.illIlIilIl(IIiIllIiIl<invokedynamic>(), var2);
         } else if (var4 == null) {
            return lllIiIiillIiIi.lIiIilliiiIiIillii;
         } else {
            lllIiIiillIiIi var6 = this.IiIiliIiiiIi(in, var2);
            if (var6 != null) {
               return var6;
            } else {
               lllIiIiillIiIi var10000;
               switch (this.IiiIIlIlil.ordinal()) {
                  case 0:
                     var10000 = this.IIlllIlliIll(in, var2);
                     break;
                  case 1:
                  case 3:
                     var10000 = this.Iilllilliill(in, var2);
                     break;
                  case 2:
                     var10000 = this.Illlllllilll(var2);
                     break;
                  case 4:
                     var10000 = this.IIillIiliIil(var2);
                     break;
                  case 5:
                     var10000 = this.Ililllililil(in, var2, var5);
                     break;
                  case 6:
                     var10000 = this.Iiilliiliiil(in, var2);
                     break;
                  case 7:
                     var10000 = this.IIIilIIiiIIi(var2);
                     break;
                  case 8:
                     var10000 = this.IlIillIiilIi(in, var2);
                     break;
                  case 9:
                     var10000 = lllIiIiillIiIi.lIiIilliiiIiIillii;
                     break;
                  default:
                     throw new MatchException((String)null, (Throwable)null);
               }

               return var10000;
            }
         }
      } else {
         return lllIiIiillIiIi.lIiIilliiiIiIillii;
      }
   }

   private lllIiIiillIiIi lilIliilIl(String now, long text) {
      this.IiiIIlIlil = iiIliIiIIlliIi.liiIliliiiiiIlilii;
      this.iIllIlIlil = text;
      return new lllIiIiillIiIi(liiiIIlliiiiIIll.iIliIlllll, now);
   }

   private lllIiIiillIiIi lIlIliIlIl(String now, long text) {
      this.IlIlIlIlil = text;
      return new lllIiIiillIiIi(liiiIIlliiiiIIll.liIiIlllll, now);
   }

   private boolean IIIIllIIIl(IIIiIiillIIiIiil at) {
      return this.liiIIlIlil != null && at != null && (!this.liiIIlIlil.IliIlllilIi(at) || this.liiIIlIlil.liiiIIllIl(at) > Double.longBitsToDouble(-8480324334844286031L ^ -3857379317348471887L));
   }

   public boolean IlIlllIlilIl(long now) {
      return this.IiiIIlIlil != iiIliIiIIlliIi.liiIliliiiiiIlilii || now - this.iIllIlIlil < (7425516292098216218L ^ 7425516292098217674L);
   }

   private void iiIIlIIlIl(iiIliIiIIlliIi now, long timeoutMs, long p) {
      this.IiiIIlIlil = now;
      this.llIlIlIlil = timeoutMs;
      this.ilIlIlIlil = timeoutMs + p;
   }

   // $FF: synthetic method
   private static CallSite iiiIlIIIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) << 9 | (char)(~var4[var5]) >>> 7) << 14 | (char)((char)(~var4[var5]) << 9 | (char)(~var4[var5]) >>> 7) >>> 2) >>> 9 | (char)((char)((char)(~var4[var5]) << 9 | (char)(~var4[var5]) >>> 7) << 14 | (char)((char)(~var4[var5]) << 9 | (char)(~var4[var5]) >>> 7) >>> 2) << 7) >>> 15 | (char)((char)((char)((char)(~var4[var5]) << 9 | (char)(~var4[var5]) >>> 7) << 14 | (char)((char)(~var4[var5]) << 9 | (char)(~var4[var5]) >>> 7) >>> 2) >>> 9 | (char)((char)((char)(~var4[var5]) << 9 | (char)(~var4[var5]) >>> 7) << 14 | (char)((char)(~var4[var5]) << 9 | (char)(~var4[var5]) >>> 7) >>> 2) << 7) << 1) ^ var5) + var5) ^ var5) ^ var5) - 29911) ^ 24520))) ^ '퇔') + var5) - 25207));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iiIliIiIIlliIi lIiiIiIlilli() {
      return this.IiiIIlIlil;
   }

   private lllIiIiillIiIi Illillliilli(String line, long now) {
      if (lIlIlliliIlIllil.liiiIIllIl(line)) {
         this.IiiIIlIlil = iiIliIiIIlliIi.liIIliliiiiIIlilii;
         this.IiIlIlIlil = now;
         return null;
      } else {
         IIlIiilIlIii var4 = lIlIlliliIlIllil.IliIlllilIi(line);
         if (var4 == IIlIiilIlIii.lIIilllIliIIilllIl && this.IiIIlliIIl(now)) {
            return this.Iiiiliiiiiii(iiIliIiIIlliIi.iIlIliliiIllIlilii, now, IIiIllIiIl<invokedynamic>());
         } else {
            return var4 == IIlIiilIlIii.iiillllIlIIIilllIl && this.IiIIlliIIl(now) ? this.illIlIilIl(IIiIllIiIl<invokedynamic>(), now) : null;
         }
      }
   }

   private lllIiIiillIiIi IIlilIliiIli(String line, long now) {
      switch (lIlIlliliIlIllil.IliIlllilIi(line)) {
         case IIillllIllIillllIl:
            this.IiiIIlIlil = iiIliIiIIlliIi.IilIliliililIlilii;
            this.IiIlIlIlil = now;
            break;
         case iIillllIlIlillllIl:
            if (this.IlllIlIlil) {
               return this.illIlIilIl(IIiIllIiIl<invokedynamic>(), now);
            }

            this.IiiIIlIlil = iiIliIiIIlliIi.iIlIliliiIllIlilii;
            this.IiIlIlIlil = now;
            break;
         case llillllIlilillllIl:
            return this.illIlIilIl(IIiIllIiIl<invokedynamic>(), now);
         case IiillllIlliillllIl:
            return this.illIlIilIl(IIiIllIiIl<invokedynamic>(), now);
         case iiillllIlIIIilllIl:
            if (this.IiIIlliIIl(now)) {
               return this.illIlIilIl(IIiIllIiIl<invokedynamic>(), now);
            }
            break;
         case lIIilllIliIIilllIl:
            if (this.IiIIlliIIl(now)) {
               return this.Iiiiliiiiiii(iiIliIiIIlliIi.liIIliliiiiIIlilii, now, IIiIllIiIl<invokedynamic>());
            }
      }

      return null;
   }

   public IliIilillliIilil(String name, String region, iiiIIIIlIIIlIIIl regions) {
      this.IiiIIlIlil = iiIliIiIIlliIi.liIIliliiiiIIlilii;
      this.lIIlIlIlil = "";
      this.lliIIlIlil = name == null ? "" : name.trim();
      this.iliIIlIlil = region;
      this.IliIIlIlil = regions == null ? new iiiIIIIlIIIlIIIl() : regions;
   }

   // $FF: synthetic method
   private static CallSite IIiIllIiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -3450417502226908837L ^ Long.rotateLeft(-500967147843369866L, 60) ^ 8183458448566910803L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7333036674364779533L ^ Long.rotateLeft(7768103666334041437L, 61) ^ 3039615094634967241L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2572448076706383898L ^ Long.rotateLeft(-4126476783896598059L, 28) ^ -1877762083136966993L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 1040031756657046585L ^ Long.rotateLeft(6459537410539184279L, 7) ^ 1338077235120996850L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6978030618848071016L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -5864372109866522770L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -5306702447949401355L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 540016985660238938L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -81607408942660648L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2033285935468253055L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iIiIlIliIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, lliIliliIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IiiIlliiIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, iiiIlIIIll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(lIIlliIIll<invokedynamic>());
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

   private lllIiIiillIiIi IIIilIIiiIIi(long now) {
      if (!this.llIIlilIIl(now)) {
         return lllIiIiillIiIi.lIiIilliiiIiIillii;
      } else {
         ++this.IillIlIlil;
         this.llllIlIlil = false;
         this.iiIIlIIlIl(iiIliIiIIlliIi.iliIliliiIiiIlilii, now, 2125167629798609525L ^ 2125167629798615277L);
         return this.lIlIliIlIl(IIiIllIiIl<invokedynamic>() + this.lliIIlIlil, now);
      }
   }

   private lllIiIiillIiIi Iilililiiili(String line, long now, Predicate<String> online) {
      IllIIIIllllIIIIl var5 = iiilIllIIIiIll.IliIlllilIi(line, now - this.llIlIlIlil, online);
      switch (var5.liiiIIllIl()) {
         case ilIiliIliIiIiliIli:
            this.iIiIIlIlil.IiIlliIliiIl(now);
            break;
         case lIiiliIliiIiiliIli:
            long var6 = iiilIllIIIiIll.liiiIIllIl(line);
            this.llllIlIlil = true;
            this.lIllIlIlil = Math.max(this.lIllIlIlil, now + Math.max(var6, 5000L) + 6000L);
            break;
         case liIiliIliiiIiliIli:
            this.llllIlIlil = true;
            this.lIllIlIlil = Math.max(this.lIllIlIlil, now + 6000L);
            break;
         case IIliliIlilIliliIli:
            this.iIiIIlIlil.Illlllllilll(now, var5.iIlIlllllill());
            return this.illIlIilIl(iIlIlllllill(var5.iIlIlllllill()), now);
         case llliliIliilliliIli:
            return this.illIlIilIl(IIiIllIiIl<invokedynamic>(), now);
         case iIliliIliIlliliIli:
            if (this.IiIIlliIIl(now)) {
               this.iIiIIlIlil.IIillIiliIil(now);
               return this.Iiiiliiiiiii(iiIliIiIIlliIi.IilIliliililIlilii, now, IIiIllIiIl<invokedynamic>());
            }
            break;
         case iililiIliIIiiliIli:
            return this.illIlIilIl(IIiIllIiIl<invokedynamic>(), now);
         case IliiliIlilliiliIli:
            return this.illIlIilIl(IIiIllIiIl<invokedynamic>(), now);
      }

      return null;
   }

   private lllIiIiillIiIi Iliilliiilii(long now, long waitMs, String failText) {
      if (this.IillIlIlil >= (((-65005847 * -123 ^ -19) << 27 | (-65005847 * -123 ^ -19) >>> 5) ^ 18569228)) {
         return this.illIlIilIl(failText, now);
      } else {
         this.IiiIIlIlil = iiIliIiIIlliIi.IliIliliilliIlilii;
         this.IiIlIlIlil = now + Math.max(-8637659937506988862L ^ -8637659937506989794L, waitMs);
         return lllIiIiillIiIi.lIiIilliiiIiIillii;
      }
   }

   private lllIiIiillIiIi Illlllllilll(long now) {
      if (!this.llIIlilIIl(now)) {
         return lllIiIiillIiIi.lIiIilliiiIiIillii;
      } else {
         this.IlllIlIlil = true;
         this.iiIIlIIlIl(iiIliIiIIlliIi.lllIliliiillIlilii, now, 3400443401615341200L ^ 3400443401615336728L);
         return this.lIlIliIlIl(IIiIllIiIl<invokedynamic>() + this.lliIIlIlil, now);
      }
   }

   private lllIiIiillIiIi Ililllililil(IilIiilllilIiill jumped, long now, boolean in) {
      if (!in && !this.IIIIllIIIl(jumped.liiiIIllIl())) {
         if (jumped.IilliliilIIi()) {
            if (this.IIllIlIlil == (6264009489288438851L ^ 6264009489288438851L)) {
               this.IIllIlIlil = now;
            }

            if (!this.illlIlIlil) {
               this.illlIlIlil = true;
               return new lllIiIiillIiIi(liiiIIlliiiiIIll.iiIiIlllll, this.lIIlIlIlil);
            } else {
               return now - this.IIllIlIlil > (8495006004003341445L ^ 8495006004003344189L) ? this.lilIliilIl(IIiIllIiIl<invokedynamic>(), now) : lllIiIiillIiIi.lIiIilliiiIiIillii;
            }
         } else {
            this.IIllIlIlil = 0L;
            if (now >= this.ilIlIlIlil) {
               return this.illIlIilIl(IIiIllIiIl<invokedynamic>(), now);
            } else if (this.llllIlIlil) {
               return now > this.lIllIlIlil ? this.illIlIilIl(IIiIllIiIl<invokedynamic>(), now) : lllIiIiillIiIi.lIiIilliiiIiIillii;
            } else {
               return this.iIiIIlIlil.IIlllIlliIll(now) ? this.illIlIilIl(IIiIllIiIl<invokedynamic>(), now) : lllIiIiillIiIi.lIiIilliiiIiIillii;
            }
         }
      } else {
         this.iIiIIlIlil.Iiilliiliiil(now);
         this.IliIIlIlil.iliIiiliiiii(this.lIIlIlIlil);
         this.IiiIIlIlil = iiIliIiIIlliIi.lIiIliliiiIiIlilii;
         this.liIlIlIlil = now;
         this.IIIlIlIlil = null;
         return lllIiIiillIiIi.lIiIilliiiIiIillii;
      }
   }

   public static String iIlIlllllill(long waitMs) {
      String var2 = waitMs > (-8082341399059031835L ^ -8082341399059031835L) ? IIiIllIiIl<invokedynamic>() + lIIiiIIiiIIiiIIi.iliIiiliiiii(waitMs) : "";
      return IIiIllIiIl<invokedynamic>() + var2 + IIiIllIiIl<invokedynamic>();
   }

   private lllIiIiillIiIi Iiilliiliiil(IilIiilllilIiill now, long in) {
      long var6 = 1846099144428915982L;
      IIIiIiillIIiIiil var4 = now.liiiIIllIl();
      if (this.IIIlIlIlil == null || !this.IIIlIlIlil.IliIlllilIi(var4) || this.IIIlIlIlil.liiiIIllIl(var4) > Double.longBitsToDouble(2397501671663332068L ^ 2208611144801114583L)) {
         this.IIIlIlIlil = var4;
         this.iiIlIlIlil = in;
      }

      var6 ^= ((long)(now.iIlIlllllill() && in - this.iiIlIlIlil >= (3925479713716150060L ^ 3925479713716149444L) && in - this.liIlIlIlil >= (4663433583825356713L ^ 4663433583825355381L) ? 1 : 0) << 32 ^ var6) & -1L << 32;
      if ((int)(var6 >>> 32) != 0 || in - this.liIlIlIlil >= (-3122446797197375458L ^ -3122446797197365490L)) {
         this.IiiIIlIlil = iiIliIiIIlliIi.IliIliliilliIlilii;
         this.IillIlIlil = 0;
         this.IiIlIlIlil = in;
      }

      return lllIiIiillIiIi.lIiIilliiiIiIillii;
   }
}
