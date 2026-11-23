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
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_11473;
import net.minecraft.class_11908;
import net.minecraft.class_1661;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_339;
import net.minecraft.class_3489;
import net.minecraft.class_364;
import net.minecraft.class_4069;
import net.minecraft.class_408;
import net.minecraft.class_410;
import net.minecraft.class_433;
import net.minecraft.class_437;
import net.minecraft.class_465;
import net.minecraft.class_490;
import net.minecraft.class_7439;
import net.minecraft.class_7923;
import net.minecraft.class_9290;
import net.minecraft.class_9334;

public class IIlilIllIlilIl extends ilIllIiIll {
   private liIiiiiiiIiiii lIlliiIlliIlliiIll;
   private static final String lIiiIiIlliIiiIiIll = "Buy Best";
   private final IIiiIIIllIiiIIIl ilIlliIllIiIlliIll = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
   private static final String iIiiliIllIliiliIll = "Didn't buy: it no longer fits your limits.";
   private final iiIiiilIIliiil IIIIliIlllIIIliIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final IIiiIIIllIiiIIIl IlIlliIllllIlliIll = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
   private boolean iIlIiiIllIllIiiIll;
   private long llIliiIllilIliiIll;
   private static final int liilliIlliiilliIll = 100;
   private int lIIiiiIlliIIiiiIll;
   private final List<iIiiIIlIliiIIl> IiiliiIllliiliiIll;
   private final iiIiiilIIliiil IliiIiIlllliiIiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private String iliIiiIllIiiIiiIll;
   private int illliiIllIilliiIll;
   private final Map<iIiiIIlIliiIIl, IiIillIlliIillIl> llllIIlllilllIIlll;
   private String iIIliiIllIlIliiIll;
   private final iilliIlIIiliIl illIliIllIilIliIll = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0, 0, 2000000000, 100000);
   private int ilIiiiIllIiIiiiIll;
   private IiIillIlliIillIl IliiiiIlllliiiiIll;
   private static final int llIiliIllilIiliIll = 3;
   private static final int IIIiliIlllIIiliIll = 1200;
   private illIlllIilIlll IlIIiiIllllIIiiIll;
   private final IIiiIIIllIiiIIIl iIllliIllIlllliIll = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
   private iIiiIIlIliiIIl ilIlIIlllIiIlIIlll;
   private volatile boolean iiiIIIlllIIIlIIlll;
   private final IIiiIIIllIiiIIIl iIiIliIllIliIliIll = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
   private int iIIIIIlllIlIIIIlll;
   private int iIiIIIlllIliIIIlll;
   private Object lIlIIIllliIlIIIlll;
   private int liIiiiIlliiIiiiIll;
   private static final long lIliliIlliIliliIll = 1500000000L;
   private final IIiiIIIllIiiIIIl llllliIllilllliIll = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
   private final iilliIlIIiliIl IiIIliIllliIIliIll = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 60, 0, 1440);
   private final IIiiIIIllIiiIIIl liIlliIlliiIlliIll = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
   private illIlllIilIlll lllIiiIllillIiiIll;
   private volatile boolean lIIlIIllliIIlIIlll;
   private final List<IiIillIlliIillIl> iiiliiIllIIIiiiIll;
   private static final String illiliIllIililiIll = "That listing is gone or changed, so I didn't buy anything. Press Scan again.";
   private boolean IIIliiIlllIIliiIll;
   private long IllIIIllllllIIIlll;
   private volatile String IiiIIIlllliiIIIlll;
   private final iilliIlIIiliIl IllIliIlllllIliIll = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 3, 2, 20);
   private int iiIIIIlllIIlIIIlll;
   private final Map<iIiiIIlIliiIIl, IiIillIlliIillIl> iIllIIlllIlllIIlll;
   private final IIiiIIIllIiiIIIl lIIlliIlliIIlliIll = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
   private static final class_1792[] IillliIlllillliIll;
   private IiIillIlliIillIl liiiiiIlliiiiiiIll;
   private int llIIIIlllilIIIIlll;
   private long liIlIIllliiIlIIlll;
   private final IIiiIIIllIiiIIIl lliIliIlliliIliIll = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
   private boolean IIlIiiIlllIlIiiIll;
   private static final String IiiiliIllliiiliIll;
   private long liiIiiIlliiiIiiIll;
   private final iiIiiilIIliiil iiIIliIllIIlIliIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final long iiIiliIllIIliliIll = 180L;
   private volatile String lliIIIllliliIIIlll;
   private Runnable liIIiiIlliiIIiiIll;
   private final iilliIlIIiliIl lIlIliIlliIlIliIll = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 5, 1, 20);
   private Runnable iilIiiIllIIiIiiIll;
   private int llliiiIllilliiiIll;
   private static final String lliiliIlliliiliIll = "Didn't buy: your inventory is full.";
   private final iiIiiilIIliiil liiiIiIlliiiiIiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iilliIlIIiliIl llIIliIllilIIliIll = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0, 0, 2000000000, 100000);
   private int IIiIIIllllIiIIIlll;
   private final IIiiIIIllIiiIIIl IiiIliIllliiIliIll = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
   private final Set<String> lIiIiiIlliIiIiiIll;
   private boolean IiIIIIlllliIIIIlll;
   private boolean IllliiIlllllliiIll;
   private iIiiIIlIliiIIl IlIiiiIllllIiiiIll;
   private IiIillIlliIillIl iliiiiIllIiiiiiIll;
   private int IIiliiIlllIiliiIll;
   private final IIiiIIIllIiiIIIl IIiIliIlllIiIliIll = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
   private static final String IlliliIllllliliIll = "Turn off Auto Builder, Auto Auction Flipper and the elytra bots first. They use /ah too.";
   private long lliliiIllililiiIll;
   private boolean lIiiiiIlliIiiiiIll;
   private IiIillIlliIillIl ilIIiiIllIiIIiiIll;
   private volatile boolean IlIlIIlllllIlIIlll;
   private static final int lIilliIlliIilliIll = 100;
   private boolean IIIIIIllllIIIIIlll;
   private int IIliiiIlllIliiiIll;
   private static final int IlilliIllllilliIll = 40;
   private Set<String> iiliiiIllIIiiiiIll;
   private IiIiliiliIilii iiIliiIllIIlliiIll;
   private static final String iiliIiIllIIiiIiIll = "Show Deals";
   private final Map<iIiiIIlIliiIIl, llililIlilililIl> IiIliiIllliIliiIll;
   private static final String iiiiliIllIIIIiiIll = "On/Off Switch Only";
   private int lilliiIlliilliiIll;
   private final IIiiIIIllIiiIIIl lilIliIlliilIliIll = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
   private static final int ililliIllIiilliIll = 80;
   private static final String IIiiliIlllIiiliIll = "Didn't buy: that listing was sold or changed. Press Scan again.";
   private static final String lililiIlliililiIll = "That listing doesn't fit your limits anymore (Max Price, Min Time Left or Max Total Spend), so I didn't buy anything.";
   private final Set<String> IliIiiIlllliIiiIll;
   private static final int iIIiliIllIlIiliIll = 6;
   private long lilIIIllliilIIIlll;
   private static final class_1792[] iillliIllIIilliIll;
   private final iiIiiilIIliiil iliiIiIllIiiiIiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private String IiliiiIllliliiiIll;
   private final IIiiIIIllIiiIIIl iiiIliIllIIIlliIll = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
   private IiIillIlliIillIl IilIiiIlllilIiiIll;
   private int iIiliiIllIliliiIll;
   private long illIIIlllIilIIIlll;
   private final lliliIIiililiIIi iIIIliIllIlIIliIll = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private final IIiiIIIllIiiIIIl IIllliIlllIllliIll = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
   private final ConcurrentLinkedQueue<iIilIIiIlilIIi> IIllIIllllIllIIlll;
   private static final int IiIiliIllliIiliIll = 3;
   private static final long lIIIiiIlliIIIiiIll = 60000L;
   private int iIliiiIllIlliiiIll;

   public llililIlilililIl IIIiIllIIiIl(iIiiIIlIliiIIl k) {
      return k == null ? null : (llililIlilililIl)this.IiIliiIllliIliiIll.get(k);
   }

   private static Ilililillilili iIiliIlili(class_1799 st) {
      return new Ilililillilili(st.method_7964().getString(), lliliilili(st), Iiililiili(st), iiiliIIIii(st));
   }

   private Set<String> iiIliIIlli() {
      HashSet var1 = new HashSet();
      if (!this.IllIIllllIIl()) {
         return var1;
      } else {
         class_1703 var2 = Iiiilllliiilll.field_1724.field_7512;

         for(int var3 = 0; var3 < this.lIlliiIlli(); ++var3) {
            class_1799 var4 = var2.method_7611(var3).method_7677();
            if (!var4.method_7960()) {
               var1.add(this.Illlilllli(var4));
            }
         }

         return var1;
      }
   }

   private void IIllllIlll() {
      this.iiiliiIllIIIiiiIll.clear();
      this.lIiIiiIlliIiIiiIll.clear();
      this.IliIiiIlllliIiiIll.clear();
      this.IIliiiIlllIliiiIll = -1;
      this.iIliiiIllIlliiiIll = 1;
      this.llliiiIllilliiiIll = 0;
      this.IiliiiIllliliiiIll = null;
      this.iiliiiIllIIiiiiIll = null;
      this.lIiiiiIlliIiiiiIll = false;
      this.IliiiiIlllliiiiIll = null;
      this.iliiiiIllIiiiiiIll = null;
      this.iIIIIIlllIlIIIIlll = 0;
      this.llIIIIlllilIIIIlll = 0;
      this.IiIIIIlllliIIIIlll = false;
      this.iiIIIIlllIIlIIIlll = -1;
      this.lIlliiIlliIlliiIll = liIiiiiiiIiiii.IlIillIlIl;
      this.iillIlIIilIl(IiIiliiliIilii.IliIlliIIl);
   }

   private boolean Iliiilliii(class_1799 words, String st) {
      if (st != null && !st.isBlank()) {
         String var3 = iIIiiilIlIiiil.IliIlllilIi(words.method_7964().getString()).toLowerCase(Locale.ROOT);

         for(String var7 : st.toLowerCase(Locale.ROOT).split(IliIlllilIi<invokedynamic>())) {
            String var8 = var7.trim();
            if (!var8.isEmpty() && var3.contains(var8)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private String iIIIIlIlIIIl() {
      StringBuilder var1 = new StringBuilder();
      if (Iiiilllliiilll.field_1755 != null) {
         llIIIlilIIIl(Iiiilllliiilll.field_1755, var1, 0);
      }

      return var1.toString();
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) << 9 | (char)(var4[var5] >>> 1 | var4[var5] << 15) >>> 7) + var5) ^ '\uf808') ^ 31423) << 7 | (char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) << 9 | (char)(var4[var5] >>> 1 | var4[var5] << 15) >>> 7) + var5) ^ '\uf808') ^ 31423) >>> 9) - 27758) ^ var5) + '댫'))) ^ var5) + var5) ^ var5) ^ 25307))) << 10 | (char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) << 9 | (char)(var4[var5] >>> 1 | var4[var5] << 15) >>> 7) + var5) ^ '\uf808') ^ 31423) << 7 | (char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) << 9 | (char)(var4[var5] >>> 1 | var4[var5] << 15) >>> 7) + var5) ^ '\uf808') ^ 31423) >>> 9) - 27758) ^ var5) + '댫'))) ^ var5) + var5) ^ var5) ^ 25307))) >>> 6));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean IiIIIlliIIIl() {
      return this.iiIIIlIIlIIl(llllililllil.class) || this.iiIIIlIIlIIl(iIlIilIlIllIilIl.class) || this.iiIIIlIIlIIl(iIIiIlIlIiIl.class) || this.iiIIIlIIlIIl(lIIIlIIliIIIlIIl.class);
   }

   private String lllIiillIi() {
      return this.IlIIiiIllllIIiiIll == illIlllIilIlll.iIlIlIiilIllIlIiil ? IliIlllilIi<invokedynamic>() : (this.IlIIiiIllllIIiiIll == illIlllIilIlll.IIlIlIiillIlIlIiil ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>());
   }

   public boolean IIlilIliiIli() {
      return this.IliIlllilIi();
   }

   private String iliIiIiiIi() {
      if (this.iiiliiIllIIIiiiIll.isEmpty()) {
         return this.IliIiiIlllliIiiIll.isEmpty() ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>() + IlilIlllilIl(this.IliIiiIlllliIiiIll.size(), IliIlllilIi<invokedynamic>()) + IliIlllilIi<invokedynamic>();
      } else {
         long var1 = (long)this.llIIliIllilIIliIll.Iilllilliill();
         long var3 = (long)this.IiIIliIllliIIliIll.Iilllilliill() * 60L;
         long var5 = this.liiIiiiiIi().iIlIlllllill();
         int var7 = 0;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.iiiliiIllIIIiiiIll.size();

         for(IiIillIlliIillIl var12 : this.iiiliiIllIIIiiiIll) {
            if (var1 > 0L && var12.IIIllIIliIIl() > var1) {
               ++var7;
            }

            if (var12.IlIlllIlilIl() < var3) {
               ++var8;
            }

            if (var5 > 0L && var12.IIIllIIliIIl() > var5) {
               ++var9;
            }
         }

         if (var8 == var10) {
            return IliIlllilIi<invokedynamic>() + this.IiIIliIllliIIliIll.Iilllilliill() + IliIlllilIi<invokedynamic>();
         } else if (var7 == var10) {
            return IliIlllilIi<invokedynamic>() + ililIlIiilIl(var1) + IliIlllilIi<invokedynamic>();
         } else if (var9 == var10) {
            return IliIlllilIi<invokedynamic>() + ililIlIiilIl(var5) + IliIlllilIi<invokedynamic>();
         } else {
            return IliIlllilIi<invokedynamic>();
         }
      }
   }

   private boolean iIiilIliil(IiIillIlliIillIl note, String l) {
      boolean var3 = this.ilIlIIlllIiIlIIlll == this.IlIiiiIllllIiiiIll && this.liIlIIllliiIlIIlll > 0L;
      long var4 = var3 ? this.liIlIIllliiIlIIlll : note.iliIiiliiiii();
      long var6 = Math.max(var4, note.iliIiiliiiii());
      this.IllIIIllllllIIIlll += var6;
      this.lilIIIllliilIIIlll += Math.max(0L, note.IIIllIIliIIl() - var6);
      ++this.IIiIIIllllIiIIIlll;
      this.liiiiiIlliiiiiiIll = null;
      this.IIIIIIllllIIIIIlll = false;
      if (!var3) {
         this.llllIIlllilllIIlll.put(this.IlIiiiIllllIiiiIll, note);
      }

      llililIlilililIl var8 = (llililIlilililIl)this.IiIliiIllliIliiIll.get(this.IlIiiiIllllIiiiIll);
      if (var8 != null) {
         this.IiIliiIllliIliiIll.put(this.IlIiiiIllllIiiiIll, iiIiiIIlIIliiIIl.iliIiiliiiii(var8, this.IliiiiIlllliiiiIll != null ? this.IliiiiIlllliiiiIll : note));
      }

      this.IiiiIlliiiIl(IliIlllilIi<invokedynamic>() + this.IlIiiiIllllIiiiIll.IliIlllilIi() + IliIlllilIi<invokedynamic>() + ililIlIiilIl(var4) + IliIlllilIi<invokedynamic>() + lIilIliIilIl(note) + IliIlllilIi<invokedynamic>() + iIIiIiilIlIiIiil.iIlIlllllill(note.IlIlllIlilIl()) + IliIlllilIi<invokedynamic>() + l);
      this.lIIIlliIIIll(IliIlllilIi<invokedynamic>() + this.IlIiiiIllllIiiiIll.IliIlllilIi(), ililIlIiilIl(var4) + IliIlllilIi<invokedynamic>() + lIilIliIilIl(note), true);
      if (var3 && IilIiIlllilIiIll.IIIllIIliIIl(var4, note)) {
         this.iilIiIIiIi(this.iiiilIIIIi(var4, note));
         return false;
      } else {
         return true;
      }
   }

   private static List<String> lliliilili(class_1799 st) {
      ArrayList var1 = new ArrayList();
      class_9290 var2 = (class_9290)st.method_58694(class_9334.field_49632);
      if (var2 != null) {
         for(class_2561 var4 : var2.comp_2400()) {
            var1.add(var4.getString());
         }
      }

      return var1;
   }

   public String llIiIlilIiIl() {
      iIiiIIlIliiIIl var1 = this.IlIiiiIllllIiiiIll;
      if (this.iiIliiIllIIlliiIll == IiIiliiliIilii.iIiIlliIIl) {
         return "";
      } else if (var1 == null) {
         return IliIlllilIi<invokedynamic>();
      } else if (this.iiIliiIllIIlliiIll == IiIiliiliIilii.IliIlliIIl && this.IIIliiIlllIIliiIll) {
         return IliIlllilIi<invokedynamic>();
      } else if (this.lIlliiIlliIlliiIll == liIiiiiiiIiiii.IlIillIlIl) {
         return IliIlllilIi<invokedynamic>() + var1.IliIlllilIi() + IliIlllilIi<invokedynamic>() + Math.max(1, this.iIliiiIllIlliiiIll);
      } else {
         IiIillIlliIillIl var2 = this.IliiiiIlllliiiiIll;
         return IliIlllilIi<invokedynamic>() + var1.IliIlllilIi() + (var2 != null ? IliIlllilIi<invokedynamic>() + ililIlIiilIl(var2.iliIiiliiiii()) : "");
      }
   }

   private llIIIIlilIIIIl IIIlilIIli(long used) {
      long var3 = 0L;
      if (this.illIliIllIilIliIll.Iilllilliill() > 0) {
         var3 = Math.max(1L, (long)this.illIliIllIilIliIll.Iilllilliill() - used);
      }

      return new llIIIIlilIIIIl((long)this.llIIliIllilIIliIll.Iilllilliill(), (long)this.IiIIliIllliIIliIll.Iilllilliill() * (-616207287829909414L ^ -616207287829909402L), var3);
   }

   private boolean iIIliIlIli() {
      return this.illIliIllIilIliIll.Iilllilliill() > 0 && this.IllIIIllllllIIIlll + this.illIIIlllIilIIIlll + this.lilIIIllliilIIIlll >= (long)this.illIliIllIilIliIll.Iilllilliill();
   }

   private void IlIllllIll() {
      this.iiIliiIllIIlliiIll = IiIiliiliIilii.iIiIlliIIl;
      this.lIlliiIlliIlliiIll = liIiiiiiiIiiii.IlIillIlIl;
      this.illliiIllIilliiIll = 0;
      this.lilliiIlliilliiIll = 0;
      this.IIiliiIlllIiliiIll = -(1429097755 - 65) ^ 1429098302;
      this.iIiliiIllIliliiIll = -1;
      this.IiiliiIllliiliiIll.clear();
      this.lIIiiiIlliIIiiiIll = -1;
      this.IlIiiiIllllIiiiIll = null;
      this.lIlIIIllliIlIIIlll = null;
      this.IlIIiiIllllIIiiIll = illIlllIilIlll.liIIlIiiliiIIlIiil;
      this.ilIIiiIllIiIIiiIll = null;
      this.liIIiiIlliiIIiiIll = null;
      this.IIlIiiIlllIlIiiIll = false;
      this.iIlIiiIllIllIiiIll = false;
      this.IIIliiIlllIIliiIll = false;
      this.IIllIIllllIllIIlll.clear();
      this.iIllIIlllIlllIIlll.clear();
      this.llllIIlllilllIIlll.clear();
      this.ilIllIiIll();
   }

   private boolean IllIIllllIIl() {
      return Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1755 instanceof class_465 && !(Iiiilllliiilll.field_1755 instanceof class_490) && Iiiilllliiilll.field_1724.field_7512 != null && Iiiilllliiilll.field_1724.field_7512 != Iiiilllliiilll.field_1724.field_7498;
   }

   private void IIlIilIlIi() {
      if (this.IlIIiiIllllIIiiIll == illIlllIilIlll.iIlIlIiilIllIlIiil && this.ilIIiiIllIiIIiiIll != null) {
         llililIlilililIl var1 = (llililIlilililIl)this.IiIliiIllliIliiIll.get(this.ilIIiiIllIiIIiiIll.liiiIIllIl());
         if (var1 != null) {
            this.IiIliiIllliIliiIll.put(this.ilIIiiIllIiIIiiIll.liiiIIllIl(), iiIiiIIlIIliiIIl.iliIiiliiiii(var1, this.ilIIiiIllIiIIiiIll));
         }

      }
   }

   private void lIIIlliIIIll(String good, String msg, boolean title) {
      Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(good, msg, title);
   }

   private void iilIiIIiIi(String msg) {
      this.lIiIiiIiIi(msg, msg);
   }

   private void iiiIlIIIll() {
      this.IIlIiiIlllIlIiiIll = true;
      this.IIillIiliIil(false);
   }

   private String iiiilIIIIi(long l, IiIillIlliIillIl paid) {
      return IliIlllilIi<invokedynamic>() + ililIlIiilIl(l) + IliIlllilIi<invokedynamic>() + paid.liiiIIllIl().IliIlllilIi() + IliIlllilIi<invokedynamic>() + ililIlIiilIl(paid.iliIiiliiiii()) + IliIlllilIi<invokedynamic>();
   }

   private boolean llliiillii() {
      long var3 = 1119745553420344979L;
      if (!this.IllIIllllIIl()) {
         return false;
      } else {
         var3 ^= ((long)(Iiiilllliiilll.field_1724.field_7512.field_7761.size() - (~(~1425781788) * -25 ^ -1284806304)) << 32 ^ var3) & -1L << 32;
         var3 ^= ((long)this.iiliiIIiii(this.ilIlliIllIiIlliIll.Iilllilliill()) ^ var3) & -1L >>> 32;
         if ((int)var3 < 0) {
            var3 ^= ((long)this.Iiliililii(IillliIlllillliIll) ^ var3) & -1L >>> 32;
         }

         if ((int)var3 >= 0 && (int)var3 < (int)(var3 >>> 32)) {
            this.iIliiIllii((int)var3);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean IIililIili() {
      class_1661 var1 = Iiiilllliiilll.field_1724.method_31548();

      for(int var2 = 0; var2 < 36; ++var2) {
         if (var1.method_5438(var2).method_7960()) {
            return true;
         }
      }

      return false;
   }

   protected void IiIIlliIIl(IliIliIllliIliIl e) {
      if (this.iiIliiIllIIlliiIll != IiIiliiliIilii.iIiIlliIIl) {
         class_2596 var3 = e.iilIIiiIll;
         if (var3 instanceof class_7439) {
            class_7439 var2 = (class_7439)var3;
            if (!var2.comp_906() && var2.comp_763() != null) {
               this.lIIiiiIIii(var2.comp_763().getString());
               return;
            }
         }
      }

   }

   private boolean liIlIliiIlIl() {
      if (this.IlIIiiIllllIIiiIll == illIlllIilIlll.iIlIlIiilIllIlIiil) {
         return false;
      } else {
         return this.IlIIiiIllllIIiiIll == illIlllIilIlll.IIlIlIiillIlIlIiil || !this.IllliiIlllllliiIll || !IliIlllilIi<invokedynamic>().equals(this.iIIIliIllIlIIliIll.Iilllilliill());
      }
   }

   private void lIIlIliIIlIl(int glfwKey) {
      class_437 var2 = Iiiilllliiilll.field_1755;
      this.IIiliiIlllIiliiIll = this.illliiIllIilliiIll;
      if (var2 != null) {
         try {
            class_11908 var3 = new class_11908(glfwKey, 0, 0);
            var2.method_25404(var3);
            var2.method_16803(var3);
         } catch (Throwable var4) {
         }

      }
   }

   private static double iiiliIIIii(class_1799 st) {
      return st.method_7963() && st.method_7936() > 0 ? (double)1.0F - (double)st.method_7919() / (double)st.method_7936() : (double)1.0F;
   }

   private void lIiIiiIiIi(String msg, String boardMsg) {
      this.IiiIIlliiIIl();
      String var3 = this.liiiiiIlliiiiiiIll != null && this.IIIIIIllllIIIIIlll ? IliIlllilIi<invokedynamic>() + ililIlIiilIl(this.liiiiiIlliiiiiiIll.iliIiiliiiii()) + IliIlllilIi<invokedynamic>() : "";
      this.IiiiIlliiiIl(IliIlllilIi<invokedynamic>() + msg + var3 + (this.IIiIIIllllIiIIIlll > 0 ? IliIlllilIi<invokedynamic>() + IlilIlllilIl(this.IIiIIIllllIiIIIlll, IliIlllilIi<invokedynamic>()) + IliIlllilIi<invokedynamic>() + ililIlIiilIl(this.IllIIIllllllIIIlll) + IliIlllilIi<invokedynamic>() : ""));
      this.lIIIlliIIIll(this.IilliliilIIi(), msg, false);
      this.iIlIiIllIi(boardMsg + var3);
      this.iiiIlIIIll();
   }

   private void lIIIiiIIIi(String why) {
      this.IiiIIlliiIIl();
      if (this.llIIIIlllilIIIIlll > 0) {
         this.liIIiiiIIi();
      } else {
         this.IIIIIIllllIIIIIlll = false;
         this.IlIIillIIi(why);
      }
   }

   private void lllllillll() {
      if (!this.illIIlIilIIl()) {
         this.iIiliiIllIliliiIll = -1;
         if (this.IillIllillIl() > 100) {
            this.llIililIil();
         }

      } else {
         this.IIliiiIlllIliiiIll = Iiiilllliiilll.field_1724.field_7512.field_7763;
         if (this.IiliiiIllliliiiIll != null) {
            String var1 = this.IiIliliIli();
            if (var1.equals(this.IiliiiIllliliiiIll) || IilIiIlllilIiIll.IiIlliIliiIl(this.iiliiiIllIIiiiiIll, this.iiIliIIlli())) {
               this.IiliiiIllliliiiIll = var1;
               if (this.IillIllillIl() > 40) {
                  this.IiliiiIllliliiiIll = null;
                  this.iiliiiIllIIiiiiIll = null;
                  this.iIIilIlIil();
               }

               return;
            }

            this.IiliiiIllliliiiIll = null;
            this.iiliiiIllIIiiiiIll = null;
            this.iIiliiIllIliliiIll = this.illliiIllIilliiIll;
         }

         if (this.iIiliiIllIliliiIll < 0) {
            this.iIiliiIllIliliiIll = this.illliiIllIilliiIll;
         }

         if (this.illliiIllIilliiIll - this.iIiliiIllIliliiIll >= 6) {
            if (this.lIlliiIlliIlliiIll == liIiiiiiiIiiii.IlIillIlIl) {
               this.iilllIIill();
            } else {
               this.liilliiill();
            }

         }
      }
   }

   private void IiiIIlliiIIl() {
      if (Iiiilllliiilll.field_1724 != null) {
         if (this.IllIIllllIIl()) {
            Iiiilllliiilll.field_1724.method_7346();
         } else if (Iiiilllliiilll.field_1755 instanceof class_11473 || this.lliIIliliIIl()) {
            this.iiiIIlIIIlIl();
         }

      }
   }

   private void IlIIillIIi(String why) {
      ++this.liIiiiIlliiIiiiIll;
      this.IiiIIlliiIIl();
      if (this.IlIIiiIllllIIiiIll == illIlllIilIlll.iIlIlIiilIllIlIiil) {
         if (ilIIiIiIIi(why)) {
            this.IIlIilIlIi();
            this.lIiIiiIiIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
         } else {
            this.lIiIiiIiIi(IliIlllilIi<invokedynamic>() + why + IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>() + why + IliIlllilIi<invokedynamic>());
         }

      } else if (this.liIiiiIlliiIiiiIll >= (((-405771312 - -119 >>> 31 | -405771312 - -119 << 1) << 7 | (-405771312 - -119 >>> 31 | -405771312 - -119 << 1) >>> 25) ^ -798210076)) {
         this.IiiiIlliiiIl(IliIlllilIi<invokedynamic>() + this.IlIiiiIllllIiiiIll.IliIlllilIi() + IliIlllilIi<invokedynamic>() + this.liIiiiIlliiIiiiIll + IliIlllilIi<invokedynamic>() + why + IliIlllilIi<invokedynamic>());
         this.liIlliiIll();
      } else {
         this.iiiiIlIIIIll(IliIlllilIi<invokedynamic>() + this.IlIiiiIllllIiiiIll.IliIlllilIi() + IliIlllilIi<invokedynamic>() + why + IliIlllilIi<invokedynamic>());
         this.IIllllIlll();
      }
   }

   private void Illillllil() {
      if (!this.lililiilil()) {
         if (this.illilIilil()) {
            this.IIiillIiil(this.liiiiiIlliiiiiiIll);
         } else if (this.iiiIIIlllIIIlIIlll) {
            this.iiiIIIlllIIIlIIlll = false;
            this.IIIIIIllllIIIIIlll = false;
            this.IlIIillIIi(IliIlllilIi<invokedynamic>());
         } else {
            if (this.llllIlilllIl() && this.llIIIIlllilIIIIlll < 3) {
               if (this.IllIIllllIIl() && this.IIiIIllIiIIl()) {
                  String var1 = this.IIIIIllIIIIl();
                  if (var1 != null) {
                     this.lIIIiiIIIi(var1);
                     return;
                  }

                  if (this.llliiillii()) {
                     ++this.llIIIIlllilIIIIlll;
                  }
               } else if (this.lliIIliliIIl() && this.illliiIllIilliiIll - this.IIiliiIlllIiliiIll >= this.iIllIlIlllIl() * 3) {
                  this.iIIIIIlllIlIIIIlll = 0;
                  this.iillIlIIilIl(IiIiliiliIilii.liiIlliIIl);
                  return;
               }
            }

            if (this.IillIllillIl() > 100) {
               this.liIIiiiIIi();
            }

         }
      }
   }

   private void IlIiillIii() {
      this.lliIIIllliliIIIlll = liilIliiilIl(this.iIllliIllIlllliIll.Iilllilliill());
      this.IiiIIIlllliiIIIlll = liilIliiilIl(this.llllliIllilllliIll.Iilllilliill());
      this.iiiIIIlllIIIlIIlll = false;
      this.lIIlIIllliIIlIIlll = false;
      this.IlIlIIlllllIlIIlll = false;
      this.ilIlIIlllIiIlIIlll = null;
      this.liIlIIllliiIlIIlll = 0L;
   }

   private void liIlliiIll() {
      if (this.lliililiil()) {
         this.ilIllIiIll();
         ++this.lIIiiiIlliIIiiiIll;
         if (this.lIIiiiIlliIIiiiIll >= this.IiiliiIllliiliiIll.size()) {
            this.IilIililIi((String)null);
         } else {
            this.IlIiiiIllllIiiiIll = (iIiiIIlIliiIIl)this.IiiliiIllliiliiIll.get(this.lIIiiiIlliIIiiiIll);
            if (!this.liIlIliiIlIl() && this.iIIliIlIli()) {
               this.IilIililIi(IliIlllilIi<invokedynamic>() + ililIlIiilIl(this.IllIIIllllllIIIlll + this.illIIIlllIilIIIlll) + IliIlllilIi<invokedynamic>());
            } else {
               this.ilIiiiIllIiIiiiIll = this.lilliiilli(this.IlIiiiIllllIiiiIll);
               if (this.ilIIiiIllIiIIiiIll != null) {
                  this.IliiiiIlllliiiiIll = this.ilIIiiIllIiIIiiIll;
                  this.lIlliiIlliIlliiIll = liIiiiiiiIiiii.llIillIlIl;
                  this.llliiiIllilliiiIll = 0;
                  this.lIiiiiIlliIiiiiIll = true;
                  this.iillIlIIilIl(IiIiliiliIilii.IliIlliIIl);
               } else {
                  this.lIlliiIlliIlliiIll = liIiiiiiiIiiii.IlIillIlIl;
                  this.iillIlIIilIl(IiIiliiliIilii.IliIlliIIl);
               }
            }
         }
      }
   }

   private void IIiillIiil(IiIillIlliIillIl l) {
      if (this.iIiilIliil(l, "")) {
         this.IiiIIlliiIIl();
         this.liIlliiIll();
      }
   }

   private int IIllIllIllIl() {
      return Math.max(1, this.lIlIliIlliIlIliIll.Iilllilliill());
   }

   protected void Illillliilli() {
      illIlllIilIlll var1 = this.lllIiiIllillIiiIll == null ? illIlllIilIlll.liIIlIiiliiIIlIiil : this.lllIiiIllillIiiIll;
      IiIillIlliIillIl var2 = this.IilIiiIlllilIiiIll;
      Runnable var3 = this.iilIiiIllIIiIiiIll;
      this.lllIiiIllillIiiIll = null;
      this.IilIiiIlllilIiiIll = null;
      this.iilIiiIllIIiIiiIll = null;
      this.IlIllllIll();
      this.IlIIiiIllllIIiiIll = var1;
      this.liIIiiIlliiIIiiIll = var3;
      this.iIlIiiIllIllIiiIll = var1 != illIlllIilIlll.liIIlIiiliiIIlIiil;
      this.ilIIiiIllIiIIiiIll = var1 == illIlllIilIlll.iIlIlIiilIllIlIiil ? var2 : null;
      this.IllIIIllllllIIIlll = 0L;
      this.illIIIlllIilIIIlll = 0L;
      this.lilIIIllliilIIIlll = 0L;
      this.IIiIIIllllIiIIIlll = 0;
      this.iIiIIIlllIliIIIlll = 0;
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         if (this.IiIIIlliIIIl()) {
            this.IiiiIlliiiIl(IliIlllilIi<invokedynamic>());
            this.lIIIlliIIIll(this.IilliliilIIi(), IliIlllilIi<invokedynamic>(), false);
            this.iiiIlIIIll();
         } else if (var1 != illIlllIilIlll.iIlIlIiilIllIlIiil || var2 != null && var2.liiiIIllIl() != null) {
            if (var1 == illIlllIilIlll.IIlIlIiillIlIlIiil) {
               this.IiiliiIllliiliiIll.addAll(List.of(iIiiIIlIliiIIl.values()));
            } else if (var1 == illIlllIilIlll.iIlIlIiilIllIlIiil) {
               this.IiiliiIllliiliiIll.add(var2.liiiIIllIl());
            } else {
               if (this.IliiIiIlllliiIiIll.Iilllilliill()) {
                  this.IiiliiIllliiliiIll.add(iIiiIIlIliiIIl.llIIiiiIlilIIiiiIl);
               }

               if (this.iliiIiIllIiiiIiIll.Iilllilliill()) {
                  this.IiiliiIllliiliiIll.add(iIiiIIlIliiIIl.IiIIiiiIlliIIiiiIl);
               }

               if (this.liiiIiIlliiiiIiIll.Iilllilliill()) {
                  this.IiiliiIllliiliiIll.add(iIiiIIlIliiIIl.iiIIiiiIlIIlIiiiIl);
               }

               if (this.IIIIliIlllIIIliIll.Iilllilliill()) {
                  this.IiiliiIllliiliiIll.add(iIiiIIlIliiIIl.lIlIiiiIliIlIiiiIl);
               }
            }

            if (this.IiiliiIllliiliiIll.isEmpty()) {
               this.IiiiIlliiiIl(IliIlllilIi<invokedynamic>());
               this.lIIIlliIIIll(this.IilliliilIIi(), IliIlllilIi<invokedynamic>(), false);
               this.iiiIlIIIll();
            } else {
               this.IllliiIlllllliiIll = var1 == illIlllIilIlll.iIlIlIiilIllIlIiil || var1 == illIlllIilIlll.liIIlIiiliiIIlIiil && IliIlllilIi<invokedynamic>().equals(this.iIIIliIllIlIIliIll.Iilllilliill());
               this.lIlIIIllliIlIIIlll = Iiiilllliiilll.method_1562();
               this.IlIiillIii();
               if (var1 == illIlllIilIlll.liIIlIiiliiIIlIiil) {
                  this.lIIlliIIll();
               } else if (var1 == illIlllIilIlll.iIlIlIiilIllIlIiil) {
                  this.iiiiIlIIIIll(IliIlllilIi<invokedynamic>() + var2.liiiIIllIl().IliIlllilIi() + IliIlllilIi<invokedynamic>() + ililIlIiilIl(var2.iliIiiliiiii()) + IliIlllilIi<invokedynamic>() + lIilIliIilIl(var2) + IliIlllilIi<invokedynamic>());
               }

               this.liIlliiIll();
            }
         } else {
            this.iiiIlIIIll();
         }
      } else {
         this.lIIIlliIIIll(this.IilliliilIIi(), IliIlllilIi<invokedynamic>(), false);
         this.iiiIlIIIll();
      }
   }

   private IIiiIIIllIiiIIIl liIiiiiIii(iIiiIIlIliiIIl k) {
      IIiiIIIllIiiIIIl var10000;
      switch (k) {
         case llIIiiiIlilIIiiiIl -> var10000 = this.lilIliIlliilIliIll;
         case IiIIiiiIlliIIiiiIl -> var10000 = this.IIiIliIlllIiIliIll;
         case iiIIiiiIlIIlIiiiIl -> var10000 = this.iIiIliIllIliIliIll;
         case lIlIiiiIliIlIiiiIl -> var10000 = this.lliIliIlliliIliIll;
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   private String IiIliliIli() {
      if (!this.IllIIllllIIl()) {
         return "";
      } else {
         class_1703 var1 = Iiiilllliiilll.field_1724.field_7512;
         StringBuilder var2 = new StringBuilder();

         for(int var3 = 0; var3 < this.lIlliiIlli(); ++var3) {
            class_1799 var4 = var1.method_7611(var3).method_7677();
            if (!var4.method_7960()) {
               var2.append(var3).append(':').append(this.Illlilllli(var4)).append(';');
            }
         }

         return var2.toString();
      }
   }

   private static boolean ilIIiIiIIi(String why) {
      return why.startsWith(IliIlllilIi<invokedynamic>()) || why.startsWith(IliIlllilIi<invokedynamic>()) || why.contains(IliIlllilIi<invokedynamic>());
   }

   protected void iIIIlIlIIl() {
      if (this.iiIliiIllIIlliiIll != IiIiliiliIilii.iIiIlliIIl) {
         if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1761 != null && Iiiilllliiilll.field_1724.field_3944 != null) {
            if (Iiiilllliiilll.method_1562() != this.lIlIIIllliIlIIIlll) {
               this.iilIiIIiIi(IliIlllilIi<invokedynamic>() + this.lllIiillIi() + IliIlllilIi<invokedynamic>());
            } else if (this.IiIIIlliIIIl()) {
               this.iilIiIIiIi(IliIlllilIi<invokedynamic>());
            } else {
               ++this.illliiIllIilliiIll;
               if (this.Iiiilliiil()) {
                  if (this.liiiiiIlliiiiiiIll != null && this.iiIliiIllIIlliiIll != IiIiliiliIilii.liiIlliIIl && this.iiIliiIllIIlliiIll != IiIiliiliIilii.iiiIlliIIl && this.illilIilil()) {
                     this.IIiillIiil(this.liiiiiIlliiiiiiIll);
                  } else {
                     switch (this.iiIliiIllIIlliiIll.ordinal()) {
                        case 1 -> this.iIlllIllll();
                        case 2 -> this.lllllillll();
                        case 3 -> this.Iillllilll();
                        case 4 -> this.iiIilIIlil();
                        case 5 -> this.lIliliIlil();
                        case 6 -> this.Illillllil();
                     }

                  }
               }
            }
         } else {
            this.iiiIlIIIll();
         }
      }
   }

   private boolean illIIlIilIIl() {
      if (!this.IllIIllllIIl()) {
         return false;
      } else {
         String var1 = liilIliiilIl(this.IiiIliIllliiIliIll.Iilllilliill());
         return !var1.isEmpty() && this.IlIlIlllIlIl().contains(var1) ? true : this.lIlIIliIlIIl();
      }
   }

   private boolean iiIIIlIIlIIl(Class<? extends ilIllIiIll> cls) {
      ilIllIiIll var2 = llilIllililIll.iliIiiliiiii(cls);
      return var2 != null && var2 != this && var2.IliIlllilIi();
   }

   private void liIIiiiIIi() {
      if (this.liiiiiIlliiiiiiIll != null) {
         this.illIIIlllIilIIIlll += this.liiiiiIlliiiiiiIll.iliIiiliiiii();
         this.lilIIIllliilIIIlll += this.liiiiiIlliiiiiiIll.IIIllIIliIIl() - this.liiiiiIlliiiiiiIll.iliIiiliiiii();
         this.iIllIIlllIlllIIlll.put(this.IlIiiiIllllIiiiIll, this.liiiiiIlliiiiiiIll);
      }

      this.liiiiiIlliiiiiiIll = null;
      this.IIIIIIllllIIIIIlll = false;
      ++this.iIiIIIlllIliIIIlll;
      this.IiiiIlliiiIl(IliIlllilIi<invokedynamic>() + this.IlIiiiIllllIiiiIll.IliIlllilIi() + IliIlllilIi<invokedynamic>() + this.IlIiiiIllllIiiiIll.IliIlllilIi() + IliIlllilIi<invokedynamic>());
      this.IIlIilIlIi();
      this.IiiIIlliiIIl();
      this.liIlliiIll();
   }

   private void IIIillIIil() {
      if (!this.lIiiiiIlliIiiiiIll) {
         this.lIiiiiIlliIiiiiIll = true;
         this.llliiiIllilliiiIll = 0;
         this.iillIlIIilIl(IiIiliiliIilii.IliIlliIIl);
      } else {
         this.IlIIillIIi(IliIlllilIi<invokedynamic>());
      }
   }

   private int Iiliililii(class_1792... mats) {
      if (!this.IllIIllllIIl()) {
         return -1;
      } else {
         class_1703 var2 = Iiiilllliiilll.field_1724.field_7512;
         int var3 = var2.field_7761.size() - 36;

         for(int var4 = 0; var4 < var3; ++var4) {
            class_1799 var5 = var2.method_7611(var4).method_7677();
            if (!var5.method_7960() && !this.iliiiIiiii(var5)) {
               for(class_1792 var9 : mats) {
                  if (var5.method_31574(var9)) {
                     return var4;
                  }
               }
            }
         }

         return -1;
      }
   }

   private void lliiIliliiIl(illIlllIilIlll l, IiIillIlliIillIl r, Runnable done) {
      this.iliIiiIllIiiIiiIll = "";
      this.llIliiIllilIliiIll = -1L;
      this.lllIiiIllillIiiIll = l;
      this.IilIiiIlllilIiiIll = r;
      this.iilIiiIllIIiIiiIll = done;
      this.IIillIiliIil(true);
      this.lllIiiIllillIiiIll = null;
      this.IilIiiIlllilIiiIll = null;
      this.iilIiiIllIIiIiiIll = null;
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -647573344910732536L ^ Long.rotateLeft(4662005760993752530L, 58) ^ 455407145190509565L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -7654595177010534239L ^ Long.rotateLeft(3877347680622110838L, 44) ^ 6029533842613908726L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 1044557201669984048L ^ Long.rotateLeft(1817071789679894668L, 51) ^ -5572490577274211284L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1760593451775178646L ^ Long.rotateLeft(-2090009476133160745L, 58) ^ -3892171736783442076L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4983129980914794067L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8802066403997997419L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1226483785751212703L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5823714820520635470L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 3892962864861793413L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -6906715792510314183L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, lIiiIiIlilli<invokedynamic>());
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

   private boolean lIlIIliIlIIl() {
      if (this.IlIiiiIllllIiiiIll != null && this.IllIIllllIIl()) {
         class_1703 var1 = Iiiilllliiilll.field_1724.field_7512;
         int var2 = var1.field_7761.size() - 36;

         for(int var3 = 0; var3 < var2; ++var3) {
            class_1799 var4 = var1.method_7611(var3).method_7677();
            if (!var4.method_7960() && iIiiIIlIliiIIl.iliIiiliiiii(var4.method_7964().getString()).orElse((Object)null) == this.IlIiiiIllllIiiiIll) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public String illiIlIiliIl() {
      if (this.iIIiIlIlIiIl()) {
         return this.llIiIlilIiIl();
      } else {
         long var1 = System.currentTimeMillis();
         long var3 = var1 / 1000L;
         if (var3 == this.llIliiIllilIliiIll) {
            return this.iIIliiIllIlIliiIll;
         } else {
            this.llIliiIllilIliiIll = var3;
            llIIIIlilIIIIl var5 = this.IIIlilIIli(0L);
            long var6 = 0L;
            String var8 = null;

            for(iIiiIIlIliiIIl var12 : iIiiIIlIliiIIl.values()) {
               llililIlilililIl var13 = iiIiiIIlIIliiIIl.iIlIlllllill((llililIlilililIl)this.IiIliiIllliIliiIll.get(var12), var5, var1);
               if (var13 != null) {
                  IiIillIlliIillIl var14 = var13.IliIlllilIi();
                  if (var14 != null) {
                     var8 = IliIlllilIi<invokedynamic>() + var12.IliIlllilIi().toLowerCase(Locale.ROOT) + IliIlllilIi<invokedynamic>() + iiiiiliIIIIIii.iliIiiliiiii(var14, var13.IIillIiliIil(), var1) + IliIlllilIi<invokedynamic>() + iiiiiliIIIIIii.liiiIIllIl(var13.IIillIiliIil(), var1);
                     break;
                  }

                  var6 = Math.max(var6, var13.IIillIiliIil());
               }
            }

            this.iIIliiIllIlIliiIll = var8 != null ? var8 : (var6 > 0L ? IliIlllilIi<invokedynamic>() + iiiiiliIIIIIii.liiiIIllIl(var6, var1) : IliIlllilIi<invokedynamic>());
            return this.iIIliiIllIlIliiIll;
         }
      }
   }

   private void iIliiIllii(int slot) {
      Iiiilllliiilll.field_1761.method_2906(Iiiilllliiilll.field_1724.field_7512.field_7763, slot, 0, class_1713.field_7790, Iiiilllliiilll.field_1724);
      this.IIiliiIlllIiliiIll = this.illliiIllIilliiIll;
   }

   private int lIlliiIlli() {
      long var2 = -919848115930418330L;
      var2 ^= ((long)(Iiiilllliiilll.field_1724.field_7512.field_7761.size() - (~((193636285 >>> 7 | 193636285 << 25) << 23 | (193636285 >>> 7 | 193636285 << 25) >>> 9) ^ 1480782929)) << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) >= ((-(1387519568 >>> 13 | 1387519568 << 19) >>> 27 | -(1387519568 >>> 13 | 1387519568 << 19) << 5) ^ -1347597229) ? (int)(var2 >>> 32) - (-((~-1238980706 - 9) * 1059797125) ^ -1745233343) : Math.max(0, (int)(var2 >>> 32));
   }

   private void ilIiiIiIii() {
      this.lliIIIllliliIIIlll = "";
      this.IiiIIIlllliiIIIlll = "";
      this.iiiIIIlllIIIlIIlll = false;
      this.lIIlIIllliIIlIIlll = false;
      this.IlIlIIlllllIlIIlll = false;
      this.ilIlIIlllIiIlIIlll = null;
      this.liIlIIllliiIlIIlll = 0L;
      this.IIllIIllllIllIIlll.clear();
   }

   private boolean llllIlilllIl() {
      return this.illliiIllIilliiIll - this.IIiliiIlllIiliiIll >= this.iIllIlIlllIl();
   }

   private void IiIilliIil() {
      if (this.lIlliiIlliIlliiIll == liIiiiiiiIiiii.IlIillIlIl) {
         this.ilillIiill();
      } else {
         this.IlIIillIIi(IliIlllilIi<invokedynamic>());
      }

   }

   private int iiliiIIiii(String word) {
      if (!this.IllIIllllIIl()) {
         return -1;
      } else {
         class_1703 var2 = Iiiilllliiilll.field_1724.field_7512;
         int var3 = var2.field_7761.size() - 36;

         for(int var4 = 0; var4 < var3; ++var4) {
            class_1799 var5 = var2.method_7611(var4).method_7677();
            if (!var5.method_7960() && !this.iliiiIiiii(var5) && this.Iliiilliii(var5, word)) {
               return var4;
            }
         }

         return -1;
      }
   }

   private static String liilIliiilIl(String s) {
      return s == null ? "" : s.toLowerCase(Locale.ROOT).trim();
   }

   private int IillIllillIl() {
      return this.illliiIllIilliiIll - this.lilliiIlliilliiIll;
   }

   private static String lIilIliIilIl(IiIillIlliIillIl l) {
      return iiiiiliIIIIIii.lIiiIiIlilli(l);
   }

   private void iiiIIlIIIlIl() {
      class_437 var1 = Iiiilllliiilll.field_1755;
      if (var1 != null) {
         try {
            var1.method_25419();
         } catch (Throwable var3) {
            Iiiilllliiilll.method_1507((class_437)null);
         }

      }
   }

   private void IiiiIlliiiIl(String msg) {
      if (Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1724.method_7353(class_2561.method_43470(msg), false);
      }

   }

   public Integer liliIliiliIl() {
      return this.iIIiIlIlIiIl() ? (this.iiIliiIllIIlliiIll == IiIiliiliIilii.IliIlliIIl && this.IIIliiIlllIIliiIll ? -(-631974187 * 75 * 1749801491) ^ 154395511 : -570755832 * -1047552999 ^ 2100633769) : 0;
   }

   private boolean lilIIliilIIl() {
      return this.illIIlIilIIl() && Iiiilllliiilll.field_1724.field_7512.field_7763 == this.IIliiiIlllIliiiIll;
   }

   private void iIiiIlIliiIl(String toastText, String chat) {
      this.IiiiIlliiiIl(IliIlllilIi<invokedynamic>() + toastText);
      this.lIIIlliIIIll(this.IilliliilIIi(), chat, false);
      this.iliIiiIllIiiIiiIll = toastText;
      this.liiIiiIlliiiIiiIll = System.currentTimeMillis();
   }

   private boolean Iiiilliiil() {
      for(iIilIIiIlilIIi var1 = (iIilIIiIlilIIi)this.IIllIIllllIllIIlll.poll(); var1 != null; var1 = (iIilIIiIlilIIi)this.IIllIIllllIllIIlll.poll()) {
         if (var1.IliIlllilIi() == this.IlIiiiIllllIiiiIll && this.liiiiiIlliiiiiiIll != null && this.ilIlIIlllIiIlIIlll == null) {
            this.ilIlIIlllIiIlIIlll = var1.IliIlllilIi();
            this.liIlIIllliiIlIIlll = var1.liiiIIllIl();
         } else {
            IiIillIlliIillIl var2 = (IiIillIlliIillIl)this.llllIIlllilllIIlll.remove(var1.IliIlllilIi());
            if (var2 != null) {
               long var3 = Math.max(var2.iliIiiliiiii(), var2.IIIllIIliIIl());
               if (var1.liiiIIllIl() > var3) {
                  this.IllIIIllllllIIIlll += var1.liiiIIllIl() - var3;
               }

               if (IilIiIlllilIiIll.IIIllIIliIIl(var1.liiiIIllIl(), var2)) {
                  this.iilIiIIiIi(this.iiiilIIIIi(var1.liiiIIllIl(), var2));
                  return false;
               }
            } else {
               IiIillIlliIillIl var5 = (IiIillIlliIillIl)this.iIllIIlllIlllIIlll.remove(var1.IliIlllilIi());
               if (var5 != null) {
                  this.illIIIlllIilIIIlll -= var5.iliIiiliiiii();
                  --this.iIiIIIlllIliIIIlll;
                  this.IllIIIllllllIIIlll += var5.iliIiiliiiii() + Math.max(0L, var1.liiiIIllIl() - Math.max(var5.iliIiiliiiii(), var5.IIIllIIliIIl()));
                  ++this.IIiIIIllllIiIIIlll;
                  this.IiiiIlliiiIl(IliIlllilIi<invokedynamic>() + var1.IliIlllilIi().IliIlllilIi() + IliIlllilIi<invokedynamic>() + ililIlIiilIl(var1.liiiIIllIl()) + IliIlllilIi<invokedynamic>());
                  if (IilIiIlllilIiIll.IIIllIIliIIl(var1.liiiIIllIl(), var5)) {
                     this.iilIiIIiIi(this.iiiilIIIIi(var1.liiiIIllIl(), var5));
                     return false;
                  }
               } else {
                  this.IllIIIllllllIIIlll += var1.liiiIIllIl();
                  ++this.IIiIIIllllIiIIIlll;
                  this.IiiiIlliiiIl(IliIlllilIi<invokedynamic>() + var1.IliIlllilIi().IliIlllilIi() + IliIlllilIi<invokedynamic>() + ililIlIiilIl(var1.liiiIIllIl()) + IliIlllilIi<invokedynamic>());
               }
            }
         }
      }

      return true;
   }

   private static lIillIIiiIillIIi Iiililiili(class_1799 st) {
      if (st.method_31573(class_3489.field_42614)) {
         return lIillIIiiIillIIi.iiIIIIiiil;
      } else if (st.method_31573(class_3489.field_42612)) {
         return lIillIIiiIillIIi.IIlIIIiiil;
      } else {
         return st.method_31573(class_3489.field_42615) ? lIillIIiiIillIIi.lIlIIIiiil : lIillIIiiIillIIi.iIlIIIiiil;
      }
   }

   private static String IlilIlllilIl(int word, String n) {
      return word + IliIlllilIi<invokedynamic>() + n + (word == ((-(~(~-1610080740)) >>> 31 | -(~(~-1610080740)) << 1) ^ -1074805815) ? "" : IliIlllilIi<invokedynamic>());
   }

   private static String ililIlIiilIl(long coins) {
      return llIIilIiilIIilIi.liiiIIllIl(coins);
   }

   private int lIiiiiIiii() {
      if (!this.IllIIllllIIl()) {
         return -1;
      } else {
         class_1703 var1 = Iiiilllliiilll.field_1724.field_7512;
         int var2 = var1.field_7761.size() - 36;
         int var3 = var2 >= 18 ? var2 - 9 : 0;

         for(int var4 = var2 - 1; var4 >= var3; --var4) {
            class_1799 var5 = var1.method_7611(var4).method_7677();
            if (!var5.method_7960() && !this.iliiiIiiii(var5) && this.Iliiilliii(var5, this.IlIlliIllllIlliIll.Iilllilliill())) {
               return var4;
            }
         }

         return -1;
      }
   }

   private void lIIiiiIIii(String raw) {
      if (raw != null) {
         if (IilIiIlllilIiIll.IliIlllilIi(raw, this.lliIIIllliliIIIlll)) {
            this.iiiIIIlllIIIlIIlll = true;
         }

         if (IilIiIlllilIiIll.liiiIIllIl(raw, this.IiiIIIlllliiIIIlll)) {
            this.lIIlIIllliIIlIIlll = true;
         }

         if (IilIiIlllilIiIll.iIlIlllllill(raw)) {
            this.IlIlIIlllllIlIIlll = true;
         }

         iIIiiilIlIiiil.iliIiiliiiii(raw).ifPresent((p) -> iIiiIIlIliiIIl.iliIiiliiiii(p.iIlIlllllill()).ifPresent((k) -> this.IIllIIllllIllIIlll.add(new iIilIIiIlilIIi(k, p.liiiIIllIl()))));
      }
   }

   private boolean lliIIliliIIl() {
      class_437 var1 = Iiiilllliiilll.field_1755;
      if (var1 != null && !(var1 instanceof class_465) && !(var1 instanceof class_408) && !(var1 instanceof class_410)) {
         String var2 = this.IlIlIlllIlIl();
         String var3 = liilIliiilIl(this.IIllliIlllIllliIll.Iilllilliill());
         String var4 = liilIliiilIl(this.liIlliIlliiIlliIll.Iilllilliill());
         if (!var3.isEmpty() && var2.contains(var3)) {
            return true;
         } else {
            return var1 instanceof class_11473 && !var4.isEmpty() && var2.contains(var4);
         }
      } else {
         return false;
      }
   }

   private String IlIlIlllIlIl() {
      class_437 var1 = Iiiilllliiilll.field_1755;
      return var1 == null ? "" : liilIliiilIl(iIIiiilIlIiiil.IliIlllilIi(var1.method_25440().getString()));
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(-((char)((char)(~((char)((char)((char)(-var4[var5]) + '饐') >>> 11 | (char)((char)(-var4[var5]) + '饐') << 5))) - '빪'))) - 179))) ^ var5) >>> 4 | (char)((char)(-((char)((char)(-((char)((char)(~((char)((char)((char)(-var4[var5]) + '饐') >>> 11 | (char)((char)(-var4[var5]) + '饐') << 5))) - '빪'))) - 179))) ^ var5) << 12))) ^ var5) ^ 15233) >>> 5 | (char)((char)((char)(-((char)((char)((char)(-((char)((char)(-((char)((char)(~((char)((char)((char)(-var4[var5]) + '饐') >>> 11 | (char)((char)(-var4[var5]) + '饐') << 5))) - '빪'))) - 179))) ^ var5) >>> 4 | (char)((char)(-((char)((char)(-((char)((char)(~((char)((char)((char)(-var4[var5]) + '饐') >>> 11 | (char)((char)(-var4[var5]) + '饐') << 5))) - '빪'))) - 179))) ^ var5) << 12))) ^ var5) ^ 15233) << 11) - var5) - var5) - 27910) - 16957));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean lliililiil() {
      if (this.IlIiiiIllllIiiiIll != null && this.liiiiiIlliiiiiiIll != null) {
         IiIillIlliIillIl var1 = this.liiiiiIlliiiiiiIll;
         if (this.illilIilil()) {
            return this.iIiilIliil(var1, IliIlllilIi<invokedynamic>());
         } else {
            if (this.IIIIIIllllIIIIIlll) {
               this.illIIIlllIilIIIlll += var1.iliIiiliiiii();
               this.lilIIIllliilIIIlll += var1.IIIllIIliIIl() - var1.iliIiiliiiii();
               ++this.iIiIIIlllIliIIIlll;
               this.iIllIIlllIlllIIlll.put(this.IlIiiiIllllIiiiIll, var1);
               this.IiiiIlliiiIl(IliIlllilIi<invokedynamic>() + this.IlIiiiIllllIiiiIll.IliIlllilIi() + IliIlllilIi<invokedynamic>() + ililIlIiilIl(var1.iliIiiliiiii()) + IliIlllilIi<invokedynamic>());
            }

            this.liiiiiIlliiiiiiIll = null;
            this.IIIIIIllllIIIIIlll = false;
            return true;
         }
      } else {
         return true;
      }
   }

   private boolean illilIilil() {
      return this.ilIlIIlllIiIlIIlll == this.IlIiiiIllllIiiiIll || this.lilliiilli(this.IlIiiiIllllIiiiIll) > this.ilIiiiIllIiIiiiIll;
   }

   private boolean IIiIIllIiIIl() {
      if (this.IllIIllllIIl() && Iiiilllliiilll.field_1724.field_7512.field_7763 != this.IIliiiIlllIliiiIll && this.iIiIIlIliIIl() < (~(-(-1648699581 ^ 75)) ^ -1648699643)) {
         String var1 = liilIliiilIl(this.liIlliIlliiIlliIll.Iilllilliill());
         if (!var1.isEmpty() && this.IlIlIlllIlIl().contains(var1)) {
            return true;
         } else {
            return this.Iiliililii(IillliIlllillliIll) >= 0 && this.Iiliililii(iillliIllIIilliIll) >= 0;
         }
      } else {
         return false;
      }
   }

   private void iIlIiIllIi(String text) {
      if (this.IlIIiiIllllIIiiIll != illIlllIilIlll.liIIlIiiliiIIlIiil) {
         this.iliIiiIllIiiIiiIll = text == null ? "" : text;
         this.liiIiiIlliiiIiiIll = System.currentTimeMillis();
      }
   }

   private String IliIilliIi(List<IiIillIlliIillIl> ranked) {
      if (ranked.isEmpty()) {
         return IliIlllilIi<invokedynamic>() + this.IlIiiiIllllIiiiIll.IliIlllilIi() + IliIlllilIi<invokedynamic>() + this.iliIiIiiIi() + IliIlllilIi<invokedynamic>();
      } else {
         IiIillIlliIillIl var2 = (IiIillIlliIillIl)ranked.get(0);
         StringBuilder var3 = (new StringBuilder(IliIlllilIi<invokedynamic>())).append(this.IlIiiiIllllIiiiIll.IliIlllilIi()).append(IliIlllilIi<invokedynamic>()).append(lIilIliIilIl(var2)).append(IliIlllilIi<invokedynamic>()).append(ililIlIiilIl(var2.iliIiiliiiii())).append(IliIlllilIi<invokedynamic>()).append(iIIiIiilIlIiIiil.iIlIlllllill(var2.IlIlllIlilIl())).append(IliIlllilIi<invokedynamic>()).append(var2.iIlIlllllill()).append(')');

         for(int var4 = 1; var4 < Math.min(3, ranked.size()); ++var4) {
            IiIillIlliIillIl var5 = (IiIillIlliIillIl)ranked.get(var4);
            var3.append(var4 == 1 ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>()).append(lIilIliIilIl(var5)).append(IliIlllilIi<invokedynamic>()).append(ililIlIiilIl(var5.iliIiiliiiii())).append(IliIlllilIi<invokedynamic>()).append(iIIiIiilIlIiIiil.iIlIlllllill(var5.IlIlllIlilIl())).append(')');
         }

         return var3.toString();
      }
   }

   private boolean IIiiIllIiiIl() {
      if (!this.iIIiIlIlIiIl() && !this.IliIlllilIi()) {
         if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
            if (this.IiIIIlliIIIl()) {
               this.iIiiIlIliiIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
               return true;
            } else {
               return false;
            }
         } else {
            this.iIiiIlIliiIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
            return true;
         }
      } else {
         String var1 = this.llIiIlilIiIl();
         this.IiiiIlliiiIl(IliIlllilIi<invokedynamic>() + (var1.isEmpty() ? "" : IliIlllilIi<invokedynamic>() + var1 + IliIlllilIi<invokedynamic>()) + IliIlllilIi<invokedynamic>());
         this.lIIIlliIIIll(this.IilliliilIIi(), IliIlllilIi<invokedynamic>(), false);
         return true;
      }
   }

   private int illliIilli() {
      return this.iIliiiIllIlliiiIll;
   }

   private String IIIIIllIIIIl() {
      if (this.liiiiiIlliiiiiiIll != null && this.IlIiiiIllllIiiiIll != null) {
         String var1 = this.iiiIliIllIIIlliIll.Iilllilliill();
         ArrayList var2 = new ArrayList();
         if (this.IllIIllllIIl()) {
            class_1703 var8 = Iiiilllliiilll.field_1724.field_7512;
            int var9 = var8.field_7761.size() - 36;

            for(int var5 = 0; var5 < var9; ++var5) {
               class_1799 var6 = var8.method_7611(var5).method_7677();
               if (!var6.method_7960()) {
                  iIiiIIlIliiIIl var7 = (iIiiIIlIliiIIl)iIiiIIlIliiIIl.iliIiiliiiii(var6.method_7964().getString()).orElse((Object)null);
                  if (var7 != null && (var7 != this.IlIiiiIllllIiiiIll || Iiililiili(var6) != this.IlIiiiIllllIiiiIll.IilliliilIIi())) {
                     return IliIlllilIi<invokedynamic>();
                  }

                  var2.addAll(IilIiIlllilIiIll.IilliliilIIi(String.join(IliIlllilIi<invokedynamic>(), lliliilili(var6)), var1));
               }
            }
         } else {
            String var3 = this.iIIIIlIlIIIl();
            var2.addAll(IilIiIlllilIiIll.IilliliilIIi(var3, var1));
            Set var4 = IilIiIlllilIiIll.IlIlllIlilIl(var3);
            if (!var4.isEmpty() && !var4.contains(this.IlIiiiIllllIiiiIll)) {
               return IliIlllilIi<invokedynamic>();
            }
         }

         if (!var2.isEmpty() && !IilIiIlllilIiIll.iliIiiliiiii(var2, this.liiiiiIlliiiiiiIll.iliIiiliiiii())) {
            return IliIlllilIi<invokedynamic>();
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private int lilliiilli(iIiiIIlIliiIIl k) {
      if (Iiiilllliiilll.field_1724 != null && k != null) {
         class_1661 var2 = Iiiilllliiilll.field_1724.method_31548();
         String var3 = this.lIIlliIlliIIlliIll.Iilllilliill();
         int var4 = 0;

         for(int var5 = 0; var5 < 36; ++var5) {
            class_1799 var6 = var2.method_5438(var5);
            if (!var6.method_7960() && iiliIlilIIiiIlil.iIlIlllllill(iIiliIlili(var6), k, var3)) {
               ++var4;
            }
         }

         return var4;
      } else {
         return 0;
      }
   }

   private void iiIilIIlil() {
      if (this.iliiiiIllIiiiiiIll != null && this.lilIIliilIIl()) {
         if (this.llllIlilllIl()) {
            int var1 = this.lilliiilli(this.IlIiiiIllllIiiiIll);
            if (this.liiiiiIlliiiiiiIll == null || var1 <= this.ilIiiiIllIiIiiiIll && this.ilIlIIlllIiIlIIlll != this.IlIiiiIllllIiiiIll) {
               this.ilIiiiIllIiIiiiIll = var1;
               class_1799 var2 = Iiiilllliiilll.field_1724.field_7512.method_7611(this.iliiiiIllIiiiiiIll.IilliliilIIi()).method_7677();
               IiIillIlliIillIl var3 = var2.method_7960() ? null : (IiIillIlliIillIl)iiliIlilIIiiIlil.IliIlllilIi(iIiliIlili(var2), this.iliiiiIllIiiiiiIll.iIlIlllllill(), this.iliiiiIllIiiiiiIll.IilliliilIIi(), this.iiiIliIllIIIlliIll.Iilllilliill(), this.lIIlliIlliIIlliIll.Iilllilliill()).orElse((Object)null);
               if (var3 != null && iiliIlilIIiiIlil.lIiiIiIlilli(this.IliiiiIlllliiiiIll, var3, 180L)) {
                  if (this.iIIliIlIli()) {
                     this.IilIililIi(IliIlllilIi<invokedynamic>() + ililIlIiilIl(this.IllIIIllllllIIIlll + this.illIIIlllIilIIIlll) + IliIlllilIi<invokedynamic>());
                  } else if (lIlilIIiiIlilIIi.IliIlllilIi(List.of(var3), this.liiIiiiiIi()).isEmpty()) {
                     if (this.IlIIiiIllllIIiiIll == illIlllIilIlll.iIlIlIiilIllIlIiil) {
                        this.IIlIilIlIi();
                        this.lIiIiiIiIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
                     } else {
                        this.IiiiIlliiiIl(IliIlllilIi<invokedynamic>() + this.IlIiiiIllllIiiiIll.IliIlllilIi() + IliIlllilIi<invokedynamic>());
                        this.IiiIIlliiIIl();
                        this.liIlliiIll();
                     }
                  } else if (this.liIlIliiIlIl()) {
                     this.IilIililIi(IliIlllilIi<invokedynamic>());
                  } else if (!this.IIililIili()) {
                     this.lIiIiiIiIi(IliIlllilIi<invokedynamic>() + this.lllIiillIi() + IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
                  } else {
                     this.IlIiillIii();
                     this.liiiiiIlliiiiiiIll = var3;
                     this.IIIIIIllllIIIIIlll = true;
                     this.iIIIIIlllIlIIIIlll = 0;
                     this.IiIIIIlllliIIIIlll = false;
                     this.iiIIIIlllIIlIIIlll = -1;
                     this.iIliiIllii(var3.IilliliilIIi());
                     this.iillIlIIilIl(IiIiliiliIilii.liiIlliIIl);
                  }
               } else {
                  this.IlIIillIIi(IliIlllilIi<invokedynamic>());
               }
            } else {
               this.IIiillIiil(this.liiiiiIlliiiiiiIll);
            }
         }
      } else {
         this.IlIIillIIi(IliIlllilIi<invokedynamic>());
      }
   }

   private void Ilillllill() {
      if (this.IlIiiiIllllIiiiIll != null) {
         this.IiIliiIllliIliiIll.put(this.IlIiiiIllllIiiiIll, iiIiiIIlIIliiIIl.liiiIIllIl(this.IlIiiiIllllIiiiIll, this.iiiliiIllIIIiiiIll, this.lIiIiiIlliIiIiiIll.size(), this.IliIiiIlllliIiiIll.size(), this.liiIiiiiIi(), this.llliiiIllilliiiIll, this.llliiiIllilliiiIll > 0, System.currentTimeMillis()));
      }
   }

   private boolean lililiilil() {
      if (this.lIIlIIllliIIlIIlll) {
         this.IIIIIIllllIIIIIlll = false;
         this.lIiIiiIiIi(IliIlllilIi<invokedynamic>() + this.IlIiiiIllllIiiiIll.IliIlllilIi() + (this.liiiiiIlliiiiiiIll != null ? IliIlllilIi<invokedynamic>() + ililIlIiilIl(this.liiiiiIlliiiiiiIll.iliIiiliiiii()) + IliIlllilIi<invokedynamic>() : "") + IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
         return true;
      } else if (this.IlIlIIlllllIlIIlll) {
         this.IIIIIIllllIIIIIlll = false;
         this.lIiIiiIiIi(IliIlllilIi<invokedynamic>() + this.lllIiillIi() + IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
         return true;
      } else {
         return false;
      }
   }

   private void llIililIil() {
      if (this.lIlliiIlliIlliiIll == liIiiiiiiIiiii.llIillIlIl) {
         this.IlIIillIIi(IliIlllilIi<invokedynamic>());
      } else if (this.llliiiIllilliiiIll > 0) {
         this.ilillIiill();
      } else {
         this.Ilillllill();
         this.IiiiIlliiiIl(IliIlllilIi<invokedynamic>() + this.IlIiiiIllllIiiiIll.IliIlllilIi() + IliIlllilIi<invokedynamic>() + this.liIiiiiIii(this.IlIiiiIllllIiiiIll).IliIlllilIi() + IliIlllilIi<invokedynamic>());
         this.liIlliiIll();
      }
   }

   public llIIIIlilIIIIl IiIiIlliIiIl() {
      return this.IIIlilIIli(0L);
   }

   private void iiiiIlIIIIll(String msg) {
      if (this.iiIIliIllIIlIliIll.Iilllilliill()) {
         this.IiiiIlliiiIl(msg);
      }

   }

   private void lIIlliIIll() {
      StringBuilder var1 = new StringBuilder();

      for(iIiiIIlIliiIIl var3 : this.IiiliiIllliiliiIll) {
         var1.append(var1.length() == 0 ? "" : IliIlllilIi<invokedynamic>()).append(var3.IliIlllilIi());
      }

      String var4 = IliIlllilIi<invokedynamic>() + (this.llIIliIllilIIliIll.Iilllilliill() > 0 ? ililIlIiilIl((long)this.llIIliIllilIIliIll.Iilllilliill()) : IliIlllilIi<invokedynamic>()) + IliIlllilIi<invokedynamic>() + this.IiIIliIllliIIliIll.Iilllilliill() + IliIlllilIi<invokedynamic>() + (this.illIliIllIilIliIll.Iilllilliill() > 0 ? IliIlllilIi<invokedynamic>() + ililIlIiilIl((long)this.illIliIllIilIliIll.Iilllilliill()) : "");
      if (this.liIlIliiIlIl()) {
         this.IiiiIlliiiIl(IliIlllilIi<invokedynamic>() + var1 + IliIlllilIi<invokedynamic>() + this.IIllIllIllIl() + IliIlllilIi<invokedynamic>() + var4 + IliIlllilIi<invokedynamic>());
      } else {
         this.IiiiIlliiiIl(IliIlllilIi<invokedynamic>() + var1 + IliIlllilIi<invokedynamic>() + var4 + IliIlllilIi<invokedynamic>());
      }

   }

   private void IilIililIi(String why) {
      if (this.lliililiil()) {
         this.IiiIIlliiIIl();
         if (this.IlIIiiIllllIIiiIll == illIlllIilIlll.IIlIlIiillIlIlIiil) {
            this.IiiiIlliiiIl(why == null ? IliIlllilIi<invokedynamic>() + IlilIlllilIl(this.IiiliiIllliiliiIll.size(), IliIlllilIi<invokedynamic>()) + IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>() + why + IliIlllilIi<invokedynamic>());
            if (why != null) {
               this.iIlIiIllIi(why + IliIlllilIi<invokedynamic>());
            }

            this.iiiIlIIIll();
         } else {
            StringBuilder var2 = new StringBuilder(why == null ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>() + why + IliIlllilIi<invokedynamic>());
            if (this.IIiIIIllllIiIIIlll > 0) {
               var2.append(IliIlllilIi<invokedynamic>()).append(IlilIlllilIl(this.IIiIIIllllIiIIIlll, IliIlllilIi<invokedynamic>())).append(IliIlllilIi<invokedynamic>()).append(ililIlIiilIl(this.IllIIIllllllIIIlll)).append('.');
            } else if (!this.IllliiIlllllliiIll) {
               var2.append(IliIlllilIi<invokedynamic>()).append(IlilIlllilIl(this.IiiliiIllliiliiIll.size(), IliIlllilIi<invokedynamic>())).append('.');
            } else {
               var2.append(IliIlllilIi<invokedynamic>());
            }

            if (this.iIiIIIlllIliIIIlll > 0) {
               var2.append(' ').append(this.iIiIIIlllIliIIIlll).append(IliIlllilIi<invokedynamic>());
            }

            this.IiiiIlliiiIl(var2.toString());
            if (this.IlIIiiIllllIIiiIll == illIlllIilIlll.iIlIlIiilIllIlIiil) {
               String var3 = this.IlIiiiIllllIiiiIll == null ? IliIlllilIi<invokedynamic>() : this.IlIiiiIllllIiiiIll.IliIlllilIi();
               this.iIlIiIllIi(this.IIiIIIllllIiIIIlll > 0 ? IliIlllilIi<invokedynamic>() + var3 + IliIlllilIi<invokedynamic>() + ililIlIiilIl(this.IllIIIllllllIIIlll) + IliIlllilIi<invokedynamic>() : (this.iIiIIIlllIliIIIlll > 0 ? IliIlllilIi<invokedynamic>() : (why != null ? IliIlllilIi<invokedynamic>() + why + IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>())));
            }

            this.iiiIlIIIll();
         }
      }
   }

   public void IlliIlllliIl(IiIillIlliIillIl whenDone, Runnable l) {
      if (whenDone != null && whenDone.liiiIIllIl() != null) {
         if (!this.IIiiIllIiiIl()) {
            llililIlilililIl var3 = (llililIlilililIl)this.IiIliiIllliIliiIll.get(whenDone.liiiIIllIl());
            long var4 = System.currentTimeMillis();
            if (var3 == null) {
               this.iIiiIlIliiIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
            } else if (iiIiiIIlIIliiIIl.lIiiIiIlilli(var3, var4)) {
               this.iIiiIlIliiIl(IiiiliIllliiiliIll, IliIlllilIi<invokedynamic>());
            } else {
               IiIillIlliIillIl var6 = iiIiiIIlIIliiIIl.IIIllIIliIIl(var3, whenDone, var4);
               if (var6.IlIlllIlilIl() <= (-7225170335194591070L ^ -7225170335194591070L)) {
                  this.iIiiIlIliiIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
               } else {
                  llIIIIlilIIIIl var7 = this.IIIlilIIli(0L);
                  if (lIlilIIiiIlilIIi.IliIlllilIi(List.of(var6), var7).isEmpty()) {
                     this.iIiiIlIliiIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
                  } else if (!iiIiiIIlIIliiIIl.IilliliilIIi(var3, whenDone, var7, var4)) {
                     this.iIiiIlIliiIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
                  } else if (!this.IIililIili()) {
                     this.iIiiIlIliiIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
                  } else {
                     this.lliiIliliiIl(illIlllIilIlll.iIlIlIiilIllIlIiil, var6, l);
                  }
               }
            }
         }
      } else {
         this.iIiiIlIliiIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
      }
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] + 26551))) << 1 | (char)(~((char)(var4[var5] + 26551))) >>> 15) - 4441))) >>> 8 | (char)(~((char)((char)((char)(~((char)(var4[var5] + 26551))) << 1 | (char)(~((char)(var4[var5] + 26551))) >>> 15) - 4441))) << 8) ^ 17743) + var5) ^ var5) ^ '쁤') ^ var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] + 26551))) << 1 | (char)(~((char)(var4[var5] + 26551))) >>> 15) - 4441))) >>> 8 | (char)(~((char)((char)((char)(~((char)(var4[var5] + 26551))) << 1 | (char)(~((char)(var4[var5] + 26551))) >>> 15) - 4441))) << 8) ^ 17743) + var5) ^ var5) ^ '쁤') ^ var5) << 15) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean iliiiIiiii(class_1799 st) {
      return iIIiiilIlIiiil.lIiiIiIlilli(lliliilili(st), this.iiiIliIllIIIlliIll.Iilllilliill()) || iIiiIIlIliiIIl.iliIiiliiiii(st.method_7964().getString()).isPresent();
   }

   private void iIIilIlIil() {
      if (this.lIlliiIlliIlliiIll == liIiiiiiiIiiii.IlIillIlIl) {
         this.ilillIiill();
      } else {
         this.IIIillIIil();
      }

   }

   private String Illlilllli(class_1799 st) {
      String var2 = liilIliiilIl(this.lIIlliIlliIIlliIll.Iilllilliill());
      String var3 = liilIliiilIl(this.iiiIliIllIIIlliIll.Iilllilliill());
      StringBuilder var4 = (new StringBuilder()).append(class_7923.field_41178.method_10221(st.method_7909())).append('x').append(st.method_7947()).append(':').append(st.method_7964().getString());

      for(String var6 : lliliilili(st)) {
         String var7 = liilIliiilIl(iIIiiilIlIiiil.IliIlllilIi(var6));
         if ((var2.isEmpty() || !var7.contains(var2)) && (!var3.isEmpty() && var7.contains(var3) || !iIIiIiilIlIiIiil.liiiIIllIl(var7).isPresent())) {
            var4.append('|').append(var6);
         }
      }

      return var4.toString();
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) >>> 8 | (char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) << 8) + '\ued7f') << 11 | (char)((char)((char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) >>> 8 | (char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) << 8) + '\ued7f') >>> 5) >>> 1 | (char)((char)((char)((char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) >>> 8 | (char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) << 8) + '\ued7f') << 11 | (char)((char)((char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) >>> 8 | (char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) << 8) + '\ued7f') >>> 5) << 15))) - 'ꖆ') ^ '趯') << 5 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) >>> 8 | (char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) << 8) + '\ued7f') << 11 | (char)((char)((char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) >>> 8 | (char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) << 8) + '\ued7f') >>> 5) >>> 1 | (char)((char)((char)((char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) >>> 8 | (char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) << 8) + '\ued7f') << 11 | (char)((char)((char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) >>> 8 | (char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) << 8) + '\ued7f') >>> 5) << 15))) - 'ꖆ') ^ '趯') >>> 11) ^ var5) << 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) >>> 8 | (char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) << 8) + '\ued7f') << 11 | (char)((char)((char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) >>> 8 | (char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) << 8) + '\ued7f') >>> 5) >>> 1 | (char)((char)((char)((char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) >>> 8 | (char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) << 8) + '\ued7f') << 11 | (char)((char)((char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) >>> 8 | (char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) << 8) + '\ued7f') >>> 5) << 15))) - 'ꖆ') ^ '趯') << 5 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) >>> 8 | (char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) << 8) + '\ued7f') << 11 | (char)((char)((char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) >>> 8 | (char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) << 8) + '\ued7f') >>> 5) >>> 1 | (char)((char)((char)((char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) >>> 8 | (char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) << 8) + '\ued7f') << 11 | (char)((char)((char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) >>> 8 | (char)(-((char)((char)(var4[var5] ^ 25340) - 2997))) << 8) + '\ued7f') >>> 5) << 15))) - 'ꖆ') ^ '趯') >>> 11) ^ var5) >>> 7));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean iIIiIlIlIiIl() {
      return this.iiIliiIllIIlliiIll != IiIiliiliIilii.iIiIlliIIl;
   }

   private int iIiIIlIliIIl() {
      class_1703 var1 = Iiiilllliiilll.field_1724.field_7512;
      int var2 = var1.field_7761.size() - 36;
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         class_1799 var5 = var1.method_7611(var4).method_7677();
         if (!var5.method_7960() && iIIiiilIlIiiil.lIiiIiIlilli(lliliilili(var5), this.iiiIliIllIIIlliIll.Iilllilliill())) {
            ++var3;
         }
      }

      return var3;
   }

   private void iIlllIllll() {
      this.IIIliiIlllIIliiIll = false;
      if (this.iIlIiiIllIllIiiIll || this.IlIIiiIllllIIiiIll != illIlllIilIlll.liIIlIiiliiIIlIiil && Iiiilllliiilll.field_1755 instanceof llIIlIllilIIlIll) {
         this.iIlIiiIllIllIiiIll = false;
         class_437 var1 = Iiiilllliiilll.field_1755;
         if (var1 != null && !(var1 instanceof class_465) && !(var1 instanceof class_11473)) {
            Iiiilllliiilll.method_1507((class_437)null);
            this.IIiliiIlllIiliiIll = this.illliiIllIilliiIll;
            return;
         }
      }

      if (this.IllIIllllIIl()) {
         if (this.llllIlilllIl()) {
            Iiiilllliiilll.field_1724.method_7346();
            this.IIiliiIlllIiliiIll = this.illliiIllIilliiIll;
         }

      } else if (!(Iiiilllliiilll.field_1755 instanceof class_11473) && !this.lliIIliliIIl()) {
         if (Iiiilllliiilll.field_1755 != null && !(Iiiilllliiilll.field_1755 instanceof class_433)) {
            this.IIIliiIlllIIliiIll = true;
            if (this.IillIllillIl() > 1200) {
               this.iilIiIIiIi(IliIlllilIi<invokedynamic>() + this.lllIiillIi() + IliIlllilIi<invokedynamic>());
            }

         } else if (this.llllIlilllIl() && System.nanoTime() - this.lliliiIllililiiIll >= 1500000000L) {
            this.lliliiIllililiiIll = System.nanoTime();
            Iiiilllliiilll.field_1724.field_3944.method_45730(this.IIliilIlii(this.IlIiiiIllllIiiiIll));
            this.IIiliiIlllIiliiIll = this.illliiIllIilliiIll;
            this.IIliiiIlllIliiiIll = -1;
            this.iIliiiIllIlliiiIll = 1;
            this.llliiiIllilliiiIll = 0;
            this.IiliiiIllliliiiIll = null;
            this.ilIlIlIiIlIl();
         }
      } else {
         if (this.llllIlilllIl()) {
            this.iiiIIlIIIlIl();
            this.IIiliiIlllIiliiIll = this.illliiIllIilliiIll;
         }

      }
   }

   private void iillIlIIilIl(IiIiliiliIilii s) {
      this.iiIliiIllIIlliiIll = s;
      this.lilliiIlliilliiIll = this.illliiIllIilliiIll;
      this.IIIliiIlllIIliiIll = false;
   }

   private void lIliliIlil() {
      if (!this.lililiilil()) {
         if (this.illilIilil()) {
            this.IIiillIiil(this.liiiiiIlliiiiiiIll);
         } else if (this.iiiIIIlllIIIlIIlll) {
            this.iiiIIIlllIIIlIIlll = false;
            this.IIIIIIllllIIIIIlll = false;
            this.IlIIillIIi(IliIlllilIi<invokedynamic>());
         } else if (this.llIIIIlllilIIIIlll == 0 && this.liIlIliiIlIl()) {
            this.IilIililIi(IliIlllilIi<invokedynamic>());
         } else if (this.lliIIliliIIl()) {
            this.IiIIIIlllliIIIIlll = true;
            this.iiIIIIlllIIlIIIlll = -1;
            if (this.llIIIIlllilIIIIlll >= 3) {
               if (this.IillIllillIl() > 80) {
                  this.liIIiiiIIi();
               }

            } else if (this.llllIlilllIl()) {
               if (this.iIIIIIlllIlIIIIlll == 0) {
                  String var2 = this.IIIIIllIIIIl();
                  if (var2 != null) {
                     this.lIIIiiIIIi(var2);
                  } else {
                     this.lIIlIliIIlIl(263);
                     this.iIIIIIlllIlIIIIlll = 1;
                  }
               } else {
                  this.lIIlIliIIlIl(257);
                  this.iIIIIIlllIlIIIIlll = 0;
                  ++this.llIIIIlllilIIIIlll;
                  this.iillIlIIilIl(IiIiliiliIilii.iiiIlliIIl);
               }
            }
         } else if (this.IiIIIIlllliIIIIlll && this.llIIIIlllilIIIIlll == 0) {
            if (this.iiIIIIlllIIlIIIlll < 0) {
               this.iiIIIIlllIIlIIIlll = this.illliiIllIilliiIll;
            }

            if (this.illliiIllIilliiIll - this.iiIIIIlllIIlIIIlll >= 12) {
               this.IIIIIIllllIIIIIlll = false;
               this.lIiIiiIiIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
            }
         } else if (!this.IllIIllllIIl() || !this.IIiIIllIiIIl() && (this.illIIlIilIIl() || Iiiilllliiilll.field_1724.field_7512.field_7763 == this.IIliiiIlllIliiiIll)) {
            if (this.IillIllillIl() > 80) {
               if (this.llIIIIlllilIIIIlll > 0) {
                  this.liIIiiiIIi();
               } else {
                  this.IlIIillIIi(Iiiilllliiilll.field_1755 instanceof class_11473 ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>());
               }
            }
         } else if (this.llIIIIlllilIIIIlll >= 3) {
            if (this.IillIllillIl() > 80) {
               this.liIIiiiIIi();
            }

         } else if (this.llllIlilllIl()) {
            String var1 = this.IIIIIllIIIIl();
            if (var1 != null) {
               this.lIIIiiIIIi(var1);
            } else if (this.llliiillii()) {
               ++this.llIIIIlllilIIIIlll;
               this.iillIlIIilIl(IiIiliiliIilii.iiiIlliIIl);
            } else if (this.IillIllillIl() > 80) {
               if (this.llIIIIlllilIIIIlll > 0) {
                  this.liIIiiiIIi();
               } else {
                  this.IlIIillIIi(IliIlllilIi<invokedynamic>());
               }

            }
         }
      }
   }

   private void ilIllIiIll() {
      this.iiiliiIllIIIiiiIll.clear();
      this.lIiIiiIlliIiIiiIll.clear();
      this.IliIiiIlllliIiiIll.clear();
      this.liIiiiIlliiIiiiIll = 0;
      this.ilIiiiIllIiIiiiIll = 0;
      this.IIliiiIlllIliiiIll = -1;
      this.iIliiiIllIlliiiIll = 1;
      this.llliiiIllilliiiIll = 0;
      this.IiliiiIllliliiiIll = null;
      this.iiliiiIllIIiiiiIll = null;
      this.lIiiiiIlliIiiiiIll = false;
      this.IliiiiIlllliiiiIll = null;
      this.iliiiiIllIiiiiiIll = null;
      this.liiiiiIlliiiiiiIll = null;
      this.IIIIIIllllIIIIIlll = false;
      this.iIIIIIlllIlIIIIlll = 0;
      this.llIIIIlllilIIIIlll = 0;
      this.IiIIIIlllliIIIIlll = false;
      this.iiIIIIlllIIlIIIlll = -1;
   }

   private void iilllIIill() {
      int var1 = this.illliIilli();

      for(IiIillIlliIillIl var3 : this.llIliilIli(var1, this.lIiIiiIlliIiIiiIll, this.IliIiiIlllliIiiIll)) {
         this.lIilliIill(var3);
      }

      ++this.llliiiIllilliiiIll;
      if (this.llliiiIllilliiiIll < this.IIllIllIllIl() && this.liiiiiiiii()) {
         this.iillIlIIilIl(IiIiliiliIilii.iliIlliIIl);
      } else {
         this.ilillIiill();
      }
   }

   private static void llIIIlilIIIl(class_4069 depth, StringBuilder out, int parent) {
      if (parent <= 8) {
         for(class_364 var4 : depth.method_25396()) {
            if (var4 instanceof class_339) {
               class_339 var5 = (class_339)var4;
               if (var5.method_25369() != null) {
                  out.append(var5.method_25369().getString()).append('\n');
               }
            }

            if (var4 instanceof class_4069) {
               class_4069 var6 = (class_4069)var4;
               llIIIlilIIIl(var6, out, parent + 1);
            }
         }

      }
   }

   private void ilIlIlIiIlIl() {
      this.iillIlIIilIl(IiIiliiliIilii.lliIlliIIl);
      this.iIiliiIllIliliiIll = -1;
   }

   public void lIliIliIliIl(Runnable whenDone) {
      if (!this.IIiiIllIiiIl()) {
         this.lliiIliliiIl(illIlllIilIlll.IIlIlIiillIlIlIiil, (IiIillIlliIillIl)null, whenDone);
      }
   }

   static {
      IillliIlllillliIll = new class_1792[]{class_1802.field_8581, class_1802.field_8656, class_1802.field_19049, class_1802.field_19057, class_1802.field_8131, class_1802.field_8687, class_1802.field_8733};
      iillliIllIIilliIll = new class_1792[]{class_1802.field_8879, class_1802.field_19058, class_1802.field_8077};
      IiiiliIllliiiliIll = IliIlllilIi<invokedynamic>() + iIIiIiilIlIiIiil.iIlIlllllill(600L) + IliIlllilIi<invokedynamic>();
   }

   private void ilillIiill() {
      this.Ilillllill();
      if (this.IlIIiiIllllIIiiIll == illIlllIilIlll.IIlIlIiillIlIlIiil) {
         this.liIlliiIll();
      } else {
         List var1 = lIlilIIiiIlilIIi.IliIlllilIi(this.iiiliiIllIIIiiiIll, this.liiIiiiiIi());
         if (this.liIlIliiIlIl()) {
            this.IiiiIlliiiIl(this.IliIilliIi(var1));
            this.liIlliiIll();
         } else if (var1.isEmpty()) {
            this.IiiiIlliiiIl(IliIlllilIi<invokedynamic>() + this.IlIiiiIllllIiiiIll.IliIlllilIi() + IliIlllilIi<invokedynamic>() + this.iliIiIiiIi() + IliIlllilIi<invokedynamic>());
            this.liIlliiIll();
         } else {
            this.IliiiiIlllliiiiIll = (IiIillIlliIillIl)var1.get(0);
            this.iiiiIlIIIIll(IliIlllilIi<invokedynamic>() + this.IlIiiiIllllIiiiIll.IliIlllilIi() + IliIlllilIi<invokedynamic>() + ililIlIiilIl(this.IliiiiIlllliiiiIll.iliIiiliiiii()) + IliIlllilIi<invokedynamic>() + lIilIliIilIl(this.IliiiiIlllliiiiIll) + IliIlllilIi<invokedynamic>() + iIIiIiilIlIiIiil.iIlIlllllill(this.IliiiiIlllliiiiIll.IlIlllIlilIl()) + IliIlllilIi<invokedynamic>() + this.IliiiiIlllliiiiIll.iIlIlllllill() + IliIlllilIi<invokedynamic>());
            this.lIlliiIlliIlliiIll = liIiiiiiiIiiii.llIillIlIl;
            this.llliiiIllilliiiIll = 0;
            if (this.lilIIliilIIl() && this.illliIilli() == this.IliiiiIlllliiiiIll.iIlIlllllill()) {
               this.lIiiiiIlliIiiiiIll = false;
               this.IiliiiIllliliiiIll = null;
               this.iillIlIIilIl(IiIiliiliIilii.lliIlliIIl);
               this.iIiliiIllIliliiIll = this.illliiIllIilliiIll - 6;
            } else {
               this.lIiiiiIlliIiiiiIll = true;
               this.iillIlIIilIl(IiIiliiliIilii.IliIlliIIl);
            }
         }
      }
   }

   private void lIilliIill(IiIillIlliIillIl l) {
      for(IiIillIlliIillIl var3 : this.iiiliiIllIIIiiiIll) {
         if (iiliIlilIIiiIlil.lIiiIiIlilli(var3, l, 60L)) {
            return;
         }
      }

      this.iiiliiIllIIIiiiIll.add(l);
   }

   private String IIliilIlii(iIiiIIlIliiIIl k) {
      String var2 = this.liIiiiiIii(k).Iilllilliill();
      var2 = var2 == null ? "" : var2.trim();
      if (var2.startsWith(IliIlllilIi<invokedynamic>())) {
         var2 = var2.substring(1).trim();
      }

      return var2.isEmpty() ? k.lIiiIiIlilli() : var2;
   }

   private void liilliiill() {
      ++this.llliiiIllilliiiIll;

      for(IiIillIlliIillIl var2 : this.llIliilIli(this.illliIilli(), (Set)null, (Set)null)) {
         if (iiliIlilIIiiIlil.lIiiIiIlilli(this.IliiiiIlllliiiiIll, var2, 180L)) {
            this.iliiiiIllIiiiiiIll = var2;
            this.iillIlIIilIl(IiIiliiliIilii.IiiIlliIIl);
            return;
         }
      }

      if (this.lIiiiiIlliIiiiiIll && this.illliIilli() <= this.IliiiiIlllliiiiIll.iIlIlllllill() && this.llliiiIllilliiiIll <= Math.max(this.IIllIllIllIl(), this.IliiiiIlllliiiiIll.iIlIlllllill()) && this.liiiiiiiii()) {
         this.iillIlIIilIl(IiIiliiliIilii.iliIlliIIl);
      } else {
         this.IIIillIIil();
      }
   }

   protected void Iilililiiili() {
      long var3 = -1825027099176009374L;
      var3 ^= ((long)(this.iiIliiIllIIlliiIll != IiIiliiliIilii.iIiIlliIIl ? 1 : 0) << 32 ^ var3) & -1L << 32;
      Runnable var2 = this.IIlIiiIlllIlIiiIll ? this.liIIiiIlliiIIiiIll : null;
      this.ilIiiIiIii();
      if ((int)(var3 >>> 32) != 0) {
         this.IiiIIlliiIIl();
      }

      this.IlIllllIll();
      if (var2 != null && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1755 == null) {
         var2.run();
      }

   }

   public IIlilIllIlilIl() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.IlIIiiIllllIIiiIll = illIlllIilIlll.liIIlIiiliiIIlIiil;
      this.lIiIiiIlliIiIiiIll = new HashSet();
      this.IliIiiIlllliIiiIll = new HashSet();
      this.iliIiiIllIiiIiiIll = "";
      this.iIIliiIllIlIliiIll = "";
      this.llIliiIllilIliiIll = -1L;
      this.IiIliiIllliIliiIll = new EnumMap(iIiiIIlIliiIIl.class);
      this.iiIliiIllIIlliiIll = IiIiliiliIilii.iIiIlliIIl;
      this.lIlliiIlliIlliiIll = liIiiiiiiIiiii.IlIillIlIl;
      this.IiiliiIllliiliiIll = new ArrayList();
      this.iiiliiIllIIIiiiIll = new ArrayList();
      this.IIliiiIlllIliiiIll = -1;
      this.iiIIIIlllIIlIIIlll = -1;
      this.lliIIIllliliIIIlll = "";
      this.IiiIIIlllliiIIIlll = "";
      this.IIllIIllllIllIIlll = new ConcurrentLinkedQueue();
      this.iIllIIlllIlllIIlll = new EnumMap(iIiiIIlIliiIIl.class);
      this.llllIIlllilllIIlll = new EnumMap(iIiiIIlIliiIIl.class);

      for(IilliIllilliIl var4 : new IilliIllilliIl[]{this.IliiIiIlllliiIiIll, this.iliiIiIllIiiiIiIll, this.liiiIiIlliiiiIiIll, this.IIIIliIlllIIIliIll, this.iIIIliIllIlIIliIll}) {
         var4.iIlIlllllill(IliIlllilIi<invokedynamic>());
      }

      for(IilliIllilliIl var11 : new IilliIllilliIl[]{this.lIlIliIlliIlIliIll, this.IllIliIlllllIliIll, this.illIliIllIilIliIll}) {
         var11.iIlIlllllill(IliIlllilIi<invokedynamic>());
      }

      for(IilliIllilliIl var12 : new IilliIllilliIl[]{this.lilIliIlliilIliIll, this.IIiIliIlllIiIliIll, this.iIiIliIllIliIliIll, this.lliIliIlliliIliIll, this.IiiIliIllliiIliIll, this.iiiIliIllIIIlliIll, this.lIIlliIlliIIlliIll, this.IlIlliIllllIlliIll, this.ilIlliIllIiIlliIll, this.liIlliIlliiIlliIll, this.IIllliIlllIllliIll, this.iIllliIllIlllliIll, this.llllliIllilllliIll}) {
         var12.iIlIlllllill(IliIlllilIi<invokedynamic>());
      }

      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IliiIiIlllliiIiIll, this.iliiIiIllIiiiIiIll, this.liiiIiIlliiiiIiIll, this.IIIIliIlllIIIliIll, this.iIIIliIllIlIIliIll, this.llIIliIllilIIliIll, this.IiIIliIllliIIliIll, this.iiIIliIllIIlIliIll, this.lIlIliIlliIlIliIll, this.IllIliIlllllIliIll, this.illIliIllIilIliIll, this.lilIliIlliilIliIll, this.IIiIliIlllIiIliIll, this.iIiIliIllIliIliIll, this.lliIliIlliliIliIll, this.IiiIliIllliiIliIll, this.iiiIliIllIIIlliIll, this.lIIlliIlliIIlliIll, this.IlIlliIllllIlliIll, this.ilIlliIllIiIlliIll, this.liIlliIlliiIlliIll, this.IIllliIlllIllliIll, this.iIllliIllIlllliIll, this.llllliIllilllliIll});
   }

   private boolean liiiiiiiii() {
      return this.lIiiiiIiii() >= 0;
   }

   private int iIllIlIlllIl() {
      return Math.max(2, this.IllIliIlllllIliIll.Iilllilliill());
   }

   private llIIIIlilIIIIl liiIiiiiIi() {
      return this.IIIlilIIli(this.IllIIIllllllIIIlll + this.illIIIlllIilIIIlll + this.lilIIIllliilIIIlll);
   }

   public String iiIiIlIIliIl(long nowMs) {
      return !this.iIIiIlIlIiIl() && !this.iliIiiIllIiiIiiIll.isEmpty() && nowMs - this.liiIiiIlliiiIiiIll <= (2368408716140148750L ^ 2368408716140089966L) ? this.iliIiiIllIiiIiiIll : "";
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) >>> 2 | (char)((char)(var4[var5] ^ var5) + var5) << 14) + '뿡') ^ 12432) + '룭') ^ 28437) - var5))))) >>> 3 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) >>> 2 | (char)((char)(var4[var5] ^ var5) + var5) << 14) + '뿡') ^ 12432) + '룭') ^ 28437) - var5))))) << 13) - '\ue481') >>> 10 | (char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) >>> 2 | (char)((char)(var4[var5] ^ var5) + var5) << 14) + '뿡') ^ 12432) + '룭') ^ 28437) - var5))))) >>> 3 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) >>> 2 | (char)((char)(var4[var5] ^ var5) + var5) << 14) + '뿡') ^ 12432) + '룭') ^ 28437) - var5))))) << 13) - '\ue481') << 6) >>> 13 | (char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) >>> 2 | (char)((char)(var4[var5] ^ var5) + var5) << 14) + '뿡') ^ 12432) + '룭') ^ 28437) - var5))))) >>> 3 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) >>> 2 | (char)((char)(var4[var5] ^ var5) + var5) << 14) + '뿡') ^ 12432) + '룭') ^ 28437) - var5))))) << 13) - '\ue481') >>> 10 | (char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) >>> 2 | (char)((char)(var4[var5] ^ var5) + var5) << 14) + '뿡') ^ 12432) + '룭') ^ 28437) - var5))))) >>> 3 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) >>> 2 | (char)((char)(var4[var5] ^ var5) + var5) << 14) + '뿡') ^ 12432) + '룭') ^ 28437) - var5))))) << 13) - '\ue481') << 6) << 3) ^ '퉈') + '\ue342') + 23956) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) >>> 2 | (char)((char)(var4[var5] ^ var5) + var5) << 14) + '뿡') ^ 12432) + '룭') ^ 28437) - var5))))) >>> 3 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) >>> 2 | (char)((char)(var4[var5] ^ var5) + var5) << 14) + '뿡') ^ 12432) + '룭') ^ 28437) - var5))))) << 13) - '\ue481') >>> 10 | (char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) >>> 2 | (char)((char)(var4[var5] ^ var5) + var5) << 14) + '뿡') ^ 12432) + '룭') ^ 28437) - var5))))) >>> 3 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) >>> 2 | (char)((char)(var4[var5] ^ var5) + var5) << 14) + '뿡') ^ 12432) + '룭') ^ 28437) - var5))))) << 13) - '\ue481') << 6) >>> 13 | (char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) >>> 2 | (char)((char)(var4[var5] ^ var5) + var5) << 14) + '뿡') ^ 12432) + '룭') ^ 28437) - var5))))) >>> 3 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) >>> 2 | (char)((char)(var4[var5] ^ var5) + var5) << 14) + '뿡') ^ 12432) + '룭') ^ 28437) - var5))))) << 13) - '\ue481') >>> 10 | (char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) >>> 2 | (char)((char)(var4[var5] ^ var5) + var5) << 14) + '뿡') ^ 12432) + '룭') ^ 28437) - var5))))) >>> 3 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) >>> 2 | (char)((char)(var4[var5] ^ var5) + var5) << 14) + '뿡') ^ 12432) + '룭') ^ 28437) - var5))))) << 13) - '\ue481') << 6) << 3) ^ '퉈') + '\ue342') + 23956) << 3));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void Iillllilll() {
      if (!this.lilIIliilIIl()) {
         this.IiIilliIil();
      } else if (this.llllIlilllIl()) {
         int var1 = this.lIiiiiIiii();
         if (var1 < 0) {
            this.iIIilIlIil();
         } else {
            this.IiliiiIllliliiiIll = this.IiIliliIli();
            this.iiliiiIllIIiiiiIll = this.iiIliIIlli();
            this.iIliiIllii(var1);
            ++this.iIliiiIllIlliiiIll;
            this.ilIlIlIiIlIl();
         }
      }
   }

   private List<IiIillIlliIillIl> llIliilIli(int unreadOut, Set<String> page, Set<String> fakesOut) {
      ArrayList var4 = new ArrayList();
      if (!this.IllIIllllIIl()) {
         return var4;
      } else {
         class_1703 var5 = Iiiilllliiilll.field_1724.field_7512;
         int var6 = var5.field_7761.size() - 36;
         int var7 = this.lIlliiIlli();
         String var8 = this.iiiIliIllIIIlliIll.Iilllilliill();
         String var9 = this.lIIlliIlliIIlliIll.Iilllilliill();

         for(int var10 = 0; var10 < var6; ++var10) {
            class_1799 var11 = var5.method_7611(var10).method_7677();
            if (!var11.method_7960()) {
               Ilililillilili var12 = iIiliIlili(var11);
               IiIillIlliIillIl var13 = (IiIillIlliIillIl)iiliIlilIIiiIlil.IliIlllilIi(var12, unreadOut, var10, var8, var9).orElse((Object)null);
               if (var13 != null) {
                  if (var13.liiiIIllIl() == this.IlIiiiIllllIiiiIll) {
                     var4.add(var13);
                  }
               } else if (var10 < var7 && iIiiIIlIliiIIl.iliIiiliiiii(var12.IliIlllilIi()).orElse((Object)null) == this.IlIiiiIllllIiiiIll) {
                  Set var14 = iiliIlilIIiiIlil.IilliliilIIi(var12, this.IlIiiiIllllIiiiIll) ? page : fakesOut;
                  if (var14 != null) {
                     var14.add(unreadOut + IliIlllilIi<invokedynamic>() + var10);
                  }
               }
            }
         }

         return var4;
      }
   }
}
