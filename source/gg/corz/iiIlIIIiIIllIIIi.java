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
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_11473;
import net.minecraft.class_11908;
import net.minecraft.class_1937;
import net.minecraft.class_2535;
import net.minecraft.class_2596;
import net.minecraft.class_2708;
import net.minecraft.class_332;
import net.minecraft.class_339;
import net.minecraft.class_364;
import net.minecraft.class_4069;
import net.minecraft.class_418;
import net.minecraft.class_4264;
import net.minecraft.class_437;
import net.minecraft.class_465;
import net.minecraft.class_481;
import net.minecraft.class_634;
import net.minecraft.class_640;
import net.minecraft.class_742;
import net.minecraft.class_7439;
import net.minecraft.class_746;

public class iiIlIIIiIIllIIIi extends ilIllIiIll implements IIiIliilIiIlii {
   private class_2535 iiiiIIliil;
   private String llIIlIliil;
   private class_437 IiIIlIliil;
   private final iilliIlIIiliIl lIiiIIliil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 10, 1, 60, 1);
   private final iilliIlIIiliIl iIiiIIliil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 15, 5, 60, 1);
   private volatile IlillIIillillIIi IIlIlIliil;
   private long liIIlIliil;
   private static final ConcurrentLinkedQueue<String> IiliIIliil = new ConcurrentLinkedQueue();
   public static final String iIliIIliil = "You left the server";
   private String lIIIlIliil;
   public static final long IlliIIliil = 8000L;
   public static final long llliIIliil = 350L;
   private final lIIiiIIiiIIiiIIi IiiiIIliil = new lIIiiIIiiIIiiIIi(new Random());
   private static volatile iiIlIIIiIIllIIIi liliIIliil;
   public static final int illiIIliil = 8;
   private final iilliIlIIiliIl IIiiIIliil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 10, 3, 60, 1);
   private Set<String> iIIIlIliil = Set.of();
   public static final int lIliIIliil = 32;
   private final IIiiIIIllIiiIIIl iiliIIliil = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), "");
   private final llIiIIililIiIIil liiiIIliil = new llIiIIililIiIIil();
   private final iiIiiilIIliiil lliiIIliil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private boolean iiIIlIliil;
   private long ilIIlIliil;
   private final IIiiIIIllIiiIIIl iliiIIliil = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), "");
   private class_1937 IIIIlIliil;
   private final iiIiiilIIliiil IliiIIliil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private volatile boolean IlIIlIliil;

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '頻') + 24399) + 26613) + '\ua8c9') - var5))) << 6 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '頻') + 24399) + 26613) + '\ua8c9') - var5))) >>> 10) ^ 28512) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static boolean Iillllilll(class_437 s) {
      ArrayList var1 = new ArrayList();
      iilllIIill(s, var1, 0);
      class_4264 var2 = null;

      for(class_364 var4 : var1) {
         if (var4 instanceof class_4264 var5) {
            if (var5.field_22763 && var5.field_22764) {
               String var6 = iiilliilIIIiliil.IliIlllilIi(var5.method_25369().getString());
               if (var6.contains(IliIlllilIi<invokedynamic>()) && !var6.contains(IliIlllilIi<invokedynamic>())) {
                  if (var2 != null && var2 != var5) {
                     return false;
                  }

                  var2 = var5;
               }
            }
         }
      }

      return var2 != null && var2.method_25404(new class_11908(257, 0, 0));
   }

   private static Collection<String> liilliiill(class_634 h) {
      ArrayList var1 = new ArrayList();

      for(class_640 var3 : h.method_2880()) {
         if (var3 != null && var3.method_2966() != null) {
            var1.add(var3.method_2966().name());
         }
      }

      return var1;
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(-((char)(var4[var5] << 15 | var4[var5] >>> 1))) >>> 7 | (char)(-((char)(var4[var5] << 15 | var4[var5] >>> 1))) << 9))) - var5) >>> 9 | (char)((char)(-((char)((char)(-((char)(var4[var5] << 15 | var4[var5] >>> 1))) >>> 7 | (char)(-((char)(var4[var5] << 15 | var4[var5] >>> 1))) << 9))) - var5) << 7))) + 'ꏫ') << 3 | (char)((char)(~((char)((char)((char)(-((char)((char)(-((char)(var4[var5] << 15 | var4[var5] >>> 1))) >>> 7 | (char)(-((char)(var4[var5] << 15 | var4[var5] >>> 1))) << 9))) - var5) >>> 9 | (char)((char)(-((char)((char)(-((char)(var4[var5] << 15 | var4[var5] >>> 1))) >>> 7 | (char)(-((char)(var4[var5] << 15 | var4[var5] >>> 1))) << 9))) - var5) << 7))) + 'ꏫ') >>> 13) - 32705));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + var5) - var5) + var5) ^ '\uedc7') << 13 | (char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + var5) - var5) + var5) ^ '\uedc7') >>> 3) - 2757) + 19003))))) + '\udeb7'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static void lIIlliIIll(String line) {
      if (liliIIliil != null && line != null && !line.isBlank()) {
         while(IiliIIliil.size() >= 32) {
            IiliIIliil.poll();
         }

         IiliIIliil.offer(line);
      }
   }

   public void IlIllllIll(class_332 ctx) {
      if (ctx != null && Iiiilllliiilll.field_1724 != null) {
         this.liiiIIliil.liiiIIllIl(ctx, this.IIlIlIliil, this.IiiiIIliil.Ilillllill(), this.IiiiIIliil.ilillIiill());
      }

   }

   public IlillIIillillIIi liIlliiIll() {
      return this.IliIlllilIi() ? this.IIlIlIliil : IlillIIillillIIi.lIiIIIiiil;
   }

   private void ilIllIiIll(String command) {
      class_634 var2 = Iiiilllliiilll.method_1562();
      if (var2 != null && command != null && !command.isBlank()) {
         var2.method_45730(command);
         String var3 = command.trim();
         if (var3.regionMatches(true, 0, IliIlllilIi<invokedynamic>(), 0, -((1552411621 << 3 | 1552411621 >>> 29) << 7 | (1552411621 << 3 | 1552411621 >>> 29) >>> 25) ^ -531600762)) {
            this.llIIlIliil = var3.substring(((-1227229749 * -1108378657 << 31 | -1227229749 * -1108378657 >>> 1) << 25 | (-1227229749 * -1108378657 << 31 | -1227229749 * -1108378657 >>> 1) >>> 7) ^ -715621716).trim();
            this.ilIIlIliil = System.currentTimeMillis();
         }

      }
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 9 | (char)(var4[var5] + var5) << 7) << 12 | (char)((char)(var4[var5] + var5) >>> 9 | (char)(var4[var5] + var5) << 7) >>> 4) + var5) ^ '﹔'))) - 31056) + var5) >>> 9 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 9 | (char)(var4[var5] + var5) << 7) << 12 | (char)((char)(var4[var5] + var5) >>> 9 | (char)(var4[var5] + var5) << 7) >>> 4) + var5) ^ '﹔'))) - 31056) + var5) << 7))) ^ '캄') >>> 4 | (char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 9 | (char)(var4[var5] + var5) << 7) << 12 | (char)((char)(var4[var5] + var5) >>> 9 | (char)(var4[var5] + var5) << 7) >>> 4) + var5) ^ '﹔'))) - 31056) + var5) >>> 9 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 9 | (char)(var4[var5] + var5) << 7) << 12 | (char)((char)(var4[var5] + var5) >>> 9 | (char)(var4[var5] + var5) << 7) >>> 4) + var5) ^ '﹔'))) - 31056) + var5) << 7))) ^ '캄') << 12) ^ var5) + 32559));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void iilllIIill(class_4069 out, List<class_364> parent, int depth) {
      if (depth <= 8) {
         for(class_364 var4 : out.method_25396()) {
            parent.add(var4);
            if (var4 instanceof class_4069) {
               class_4069 var5 = (class_4069)var4;
               iilllIIill(var5, parent, depth + 1);
            }
         }

      }
   }

   protected void Iliilliiilii(lIiIlliiIiIlli e) {
      if (e != null && Iiiilllliiilll.field_1755 == null && !Iiiilllliiilll.field_1690.field_1842 && Iiiilllliiilll.field_1724 != null) {
         this.liiiIIliil.liiiIIllIl(e.IIiIilIIIl, this.IIlIlIliil, this.IiiiIIliil.Ilillllill(), this.IiiiIIliil.ilillIiill());
      }
   }

   protected void iIIIlIlIIl() {
      class_746 var1 = Iiiilllliiilll.field_1724;
      class_634 var2 = Iiiilllliiilll.method_1562();
      if (var1 != null && var2 != null && Iiiilllliiilll.field_1687 != null) {
         class_2535 var3 = var2.method_48296();
         if (this.iiiiIIliil == null) {
            this.iiiiIIliil = var3;
         } else if (this.iiiiIIliil != var3) {
            this.lIilliIill(IliIlllilIi<invokedynamic>());
            return;
         }

         long var4;
         boolean var6;
         boolean var7;
         boolean var9;
         boolean var10;
         boolean var10000;
         label88: {
            var4 = System.currentTimeMillis();
            var6 = Iiiilllliiilll.field_1687 != this.IIIIlIliil;
            this.IIIIlIliil = Iiiilllliiilll.field_1687;
            var7 = this.IlIIlIliil;
            this.IlIIlIliil = false;
            class_437 var8 = Iiiilllliiilll.field_1755;
            var9 = var1.method_29504() || var1.method_6032() <= 0.0F || var8 instanceof class_418;
            var10 = var8 != null && !(var8 instanceof class_418);
            boolean var11 = this.iIlllIllll(var8, var4);
            if (var11 || !(var8 instanceof class_11473)) {
               label86: {
                  if (var8 instanceof class_465) {
                     class_465 var13 = (class_465)var8;
                     if (!(var8 instanceof class_481) && var13.method_17577() != var1.field_7498) {
                        break label86;
                     }
                  }

                  var10000 = false;
                  break label88;
               }
            }

            var10000 = true;
         }

         boolean var12 = var10000;
         IIIiIiillIIiIiil var19 = new IIIiIiillIIiIiil(Iiiilllliiilll.field_1687.method_27983().method_29177().toString(), var1.method_23317(), var1.method_23318(), var1.method_23321());
         lIIliiliIIliil var14 = this.Ilillllill();
         IIIIIllIIIIl var15 = new IIIIIllIIIIl(var4, var9, var10, var12, var19, var7, var6, Iiiilllliiilll.method_1548().method_1676(), () -> liilliiill(var2), this.IIIillIIil(var1), iIIilIlIil());

         llIlIllilIlIll var16;
         try {
            var16 = this.IiiiIIliil.IIlllIlliIll(var15, var14);
         } catch (RuntimeException var18) {
            this.lIilliIill(IliIlllilIi<invokedynamic>());
            return;
         }

         switch (var16.IliIlllilIi()) {
            case IIiiiiIlIi:
               this.ilIllIiIll(var16.liiiIIllIl());
               break;
            case lIiiiiIlIi:
               var1.method_7331();
               break;
            case iIiiiiIlIi:
               this.lIilliIill(var16.liiiIIllIl());
               return;
         }

         this.IIlIlIliil = this.IiiiIIliil.IiiIlliiIl(var4, var14);
      }
   }

   private void lIilliIill(String reason) {
      AutoCloseable var2 = Iliiiiilliiiii.IliIlllilIi().liiiIIllIl();

      try {
         this.IIillIiliIil(false);
      } finally {
         try {
            var2.close();
         } catch (Exception var9) {
         }

      }

      Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(this.IilliliilIIi(), reason, false);
   }

   private static String lllllillll(class_437 s) {
      StringBuilder var1 = new StringBuilder(s.method_25440().getString());
      ArrayList var2 = new ArrayList();
      iilllIIill(s, var2, 0);

      for(class_364 var4 : var2) {
         if (var4 instanceof class_339 var5) {
            if (!(var5 instanceof class_4264)) {
               var1.append(' ').append(var5.method_25369().getString());
            }
         }
      }

      return var1.toString();
   }

   private void IIllllIlll() {
      this.llIIlIliil = null;
      this.ilIIlIliil = 0L;
      this.IiIIlIliil = null;
      this.iiIIlIliil = false;
   }

   public static boolean iiiIlIIIll() {
      return liliIIliil != null;
   }

   protected void Illillliilli() {
      IiliIIliil.clear();
      this.iiiiIIliil = null;
      this.IlIIlIliil = false;
      this.IIIIlIliil = Iiiilllliiilll.field_1687;
      this.liiiIIliil.IliIlllilIi();
      this.IIllllIlll();
      this.IiiiIIliil.IIIllIIliIIl(Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null);
      liliIIliil = this;
      this.IIlIlIliil = this.IiiiIIliil.IiiIlliiIl(System.currentTimeMillis(), this.Ilillllill());
   }

   private lIIliiliIIliil Ilillllill() {
      return new lIIliiliIIliil(this.iiliIIliil.Iilllilliill(), this.IIiiIIliil.Iilllilliill(), this.lIiiIIliil.Iilllilliill(), this.iIiiIIliil.Iilllilliill(), this.IliiIIliil.Iilllilliill(), this.ilillIiill());
   }

   public iiIlIIIiIIllIIIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.lIllIIIiiIllIIIi);
      this.IIlIlIliil = IlillIIillillIIi.lIiIIIiiil;
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iiliIIliil, this.IIiiIIliil, this.lIiiIIliil, this.iIiiIIliil, this.IliiIIliil, this.lliiIIliil, this.iliiIIliil});
   }

   private Predicate<String> ilillIiill() {
      String var1 = this.iliiIIliil.Iilllilliill();
      if (var1 == null) {
         var1 = "";
      }

      if (!var1.equals(this.lIIIlIliil)) {
         HashSet var2 = new HashSet();

         for(String var6 : var1.split(IliIlllilIi<invokedynamic>())) {
            String var7 = var6.trim();
            if (!var7.isEmpty()) {
               var2.add(lllliiIlillliiIl.liiiIIllIl(var7));
            }
         }

         this.lIIIlIliil = var1;
         this.iIIIlIliil = Set.copyOf(var2);
      }

      Set var8 = this.iIIIlIliil;
      boolean var9 = this.lliiIIliil.Iilllilliill();
      return (n) -> var8.contains(lllliiIlillliiIl.liiiIIllIl(n)) || var9 && iIIiIiIlIlIiIiIl.IliIlllilIi(n);
   }

   private boolean iIlllIllll(class_437 open, long now) {
      if (!(open instanceof class_11473)) {
         return false;
      } else if (open != this.IiIIlIliil) {
         if (this.llIIlIliil != null && now - this.ilIIlIliil <= (-5501328937772148905L ^ -5501328937772152809L) && iiilliilIIIiliil.IiIlliIliiIl(lllllillll(open), this.llIIlIliil)) {
            this.IiIIlIliil = open;
            this.liIIlIliil = now;
            this.iiIIlIliil = false;
            return true;
         } else {
            return false;
         }
      } else {
         if (!this.iiIIlIliil && now - this.liIIlIliil >= (7048368664171824079L ^ 7048368664171823761L) && Iillllilll(open)) {
            this.iiIIlIliil = true;
            this.llIIlIliil = null;
         }

         return true;
      }
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(-((char)((char)(~((char)(~((char)(-((char)((char)((char)((char)(-((char)(-var4[var5]))) ^ var5) + var5) - var5)))))))))) + var5))) + var5) + 29101) ^ 19946))) - 753) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void Iilililiiili() {
      liliIIliil = null;
      IiliIIliil.clear();
      this.IiiiIIliil.IlIlllIlilIl();
      this.iiiiIIliil = null;
      this.IIIIlIliil = null;
      this.IIllllIlll();
      this.IIlIlIliil = IlillIIillillIIi.lIiIIIiiil;
   }

   protected void IiIIlliIIl(IliIliIllliIliIl e) {
      if (e.iilIIiiIll instanceof class_2708) {
         this.IlIIlIliil = true;
      } else {
         class_2596 var3 = e.iilIIiiIll;
         if (var3 instanceof class_7439) {
            class_7439 var2 = (class_7439)var3;
            if (var2.comp_906() && var2.comp_763() != null) {
               lIIlliIIll(var2.comp_763().getString());
            }
         }
      }

   }

   private static List<String> iIIilIlIil() {
      if (IiliIIliil.isEmpty()) {
         return List.of();
      } else {
         ArrayList var0 = new ArrayList(IiliIIliil.size());

         String var1;
         while((var1 = (String)IiliIIliil.poll()) != null) {
            var0.add(var1);
         }

         return var0;
      }
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2883340842975698258L ^ Long.rotateLeft(6760769149653695763L, 33) ^ 7460916902806740730L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -3131073927070603908L ^ Long.rotateLeft(-7845451964619845037L, 34) ^ 1489417976743232705L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 2818537259917402669L ^ Long.rotateLeft(4405137266561974230L, 24) ^ 2340858606251046599L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8988476708796265722L ^ Long.rotateLeft(807931295832388683L, 62) ^ -6462716652224891445L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 5098936499307160026L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 7708335471554263662L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 973017919931716090L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -6294971946783464206L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6123139375612566014L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8480949925642097354L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(liiiIIllIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iIlIlllllill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IilliliilIIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, lIiiIiIlilli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iliIiiliiiii<invokedynamic>());
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

   private Collection<String> IIIillIIil(class_746 p) {
      ArrayList var2 = new ArrayList(2);
      double var3 = (double)36.0F;

      for(class_742 var6 : Iiiilllliiilll.field_1687.method_18456()) {
         if (var6 != p && !(var6.method_5858(p) > var3)) {
            var2.add(var6.method_7334().name());
         }
      }

      return var2;
   }
}
