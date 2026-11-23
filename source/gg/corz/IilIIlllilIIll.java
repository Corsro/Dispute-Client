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
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1703;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_2535;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_418;
import net.minecraft.class_465;
import net.minecraft.class_5894;
import net.minecraft.class_5903;
import net.minecraft.class_5904;
import net.minecraft.class_634;
import net.minecraft.class_640;
import net.minecraft.class_7439;
import net.minecraft.class_746;
import net.minecraft.class_8038;

public class IilIIlllilIIll extends ilIllIiIll {
   private final lliliIIiililiIIi lIlllIIiliIlllIIil;
   private class_2535 ilIilIIilIiIilIIil;
   private final ConcurrentLinkedQueue<String> iIillIIilIlillIIil;
   private IliIilillliIilil IlIilIIilllIilIIil;
   private final iiiIIIIlIIIlIIIl IiillIIilliillIIil;
   private static final long IIillIIillIillIIil = 2000L;
   public static final List<Class<? extends ilIllIiIll>> illllIIilIilllIIil = List.of(iIiIIiIlIliIIiIl.class, iiIlIIIiIIllIIIi.class, IlllilIlllllilIl.class);
   private static final int lilllIIiliilllIIil = 256;
   private final iiIiiilIIliiil IllllIIillllllIIil;
   private volatile long iiillIIilIIIilIIil;
   private final IIiiIIIllIiiIIIl iiIllIIilIIlllIIil = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
   private int IIlilIIillIlilIIil;
   private final AtomicInteger llillIIililillIIil;
   private volatile Set<String> lIIilIIiliIIilIIil;
   private long liIilIIiliiIilIIil;

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -7730307828740781242L ^ Long.rotateLeft(-3020534843497479548L, 42) ^ -7631393499112106874L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6525995431041335360L ^ Long.rotateLeft(5266966209458708786L, 60) ^ -7086410747933555580L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -8982520488783522355L ^ Long.rotateLeft(3484049798019313493L, 22) ^ 7853687644714532934L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5216012837892545853L ^ Long.rotateLeft(-4524438263555700615L, 38) ^ -5434556556675891034L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1774721134938103920L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -5568738710862472174L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 8804616370097538546L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -8753738240557038732L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 3234862845652203478L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4858103467523574095L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, lIiiIiIlilli<invokedynamic>());
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

   private void ilIllIiIll(String cmd) {
      class_634 var2 = Iiiilllliiilll.method_1562();
      if (var2 != null && cmd != null && !cmd.isBlank()) {
         this.iiillIIilIIIilIIil = System.currentTimeMillis() + (5277877377665050553L ^ 5277877377665048681L);
         var2.method_45730(cmd);
      }
   }

   private List<String> IlIllllIll() {
      ArrayList var1 = new ArrayList();

      String var2;
      while((var2 = (String)this.iIillIIilIlillIIil.poll()) != null) {
         this.llillIIililillIIil.decrementAndGet();
         var1.add(var2);
      }

      return var1;
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ 6665) + var5) - var5) >>> 9 | (char)((char)((char)(var4[var5] ^ 6665) + var5) - var5) << 7) ^ '\uf086'))) - var5) << 7 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ 6665) + var5) - var5) >>> 9 | (char)((char)((char)(var4[var5] ^ 6665) + var5) - var5) << 7) ^ '\uf086'))) - var5) >>> 9) - 27924) - var5) ^ '\udc1b'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private String iIlllIllll() {
      for(Class var2 : illllIIilIilllIIil) {
         ilIllIiIll var3 = llilIllililIll.iliIiiliiiii(var2);
         if (var3 != null && var3 != this && var3.IliIlllilIi()) {
            return var3.IilliliilIIi();
         }
      }

      return null;
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ 13785) + var5))) ^ var5) - var5) ^ 25490) + '쎰') << 6 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ 13785) + var5))) ^ var5) - var5) ^ 25490) + '쎰') >>> 10))) - var5) + var5) ^ var5) ^ var5) ^ var5) << 10 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ 13785) + var5))) ^ var5) - var5) ^ 25490) + '쎰') << 6 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ 13785) + var5))) ^ var5) - var5) ^ 25490) + '쎰') >>> 10))) - var5) + var5) ^ var5) ^ var5) ^ var5) >>> 6) ^ '\udfc6') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private Set<String> lllllillll() {
      HashSet var1 = new HashSet();
      class_634 var2 = Iiiilllliiilll.method_1562();
      if (var2 == null) {
         return var1;
      } else {
         for(class_640 var4 : var2.method_2880()) {
            if (var4 != null && var4.method_2966() != null && var4.method_2966().name() != null) {
               var1.add(var4.method_2966().name().toLowerCase(Locale.ROOT));
            }
         }

         return var1;
      }
   }

   private void iilllIIill(String good, boolean msg) {
      if (good != null) {
         if (!IliiliIllliiliIl.iiiIlIIIll()) {
            if (Iiiilllliiilll.field_1724 != null) {
               Iiiilllliiilll.field_1724.method_7353(class_2561.method_43470(IliIlllilIi<invokedynamic>() + good), false);
            }

         } else {
            Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<invokedynamic>(), good, msg);
         }
      }
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)((char)(~((char)((char)(var4[var5] - var5) ^ var5))) >>> 3 | (char)(~((char)((char)(var4[var5] - var5) ^ var5))) << 13) << 11 | (char)((char)(~((char)((char)(var4[var5] - var5) ^ var5))) >>> 3 | (char)(~((char)((char)(var4[var5] - var5) ^ var5))) << 13) >>> 5))))))) >>> 8 | (char)(-((char)(-((char)(~((char)((char)((char)(~((char)((char)(var4[var5] - var5) ^ var5))) >>> 3 | (char)(~((char)((char)(var4[var5] - var5) ^ var5))) << 13) << 11 | (char)((char)(~((char)((char)(var4[var5] - var5) ^ var5))) >>> 3 | (char)(~((char)((char)(var4[var5] - var5) ^ var5))) << 13) >>> 5))))))) << 8) << 14 | (char)((char)(-((char)(-((char)(~((char)((char)((char)(~((char)((char)(var4[var5] - var5) ^ var5))) >>> 3 | (char)(~((char)((char)(var4[var5] - var5) ^ var5))) << 13) << 11 | (char)((char)(~((char)((char)(var4[var5] - var5) ^ var5))) >>> 3 | (char)(~((char)((char)(var4[var5] - var5) ^ var5))) << 13) >>> 5))))))) >>> 8 | (char)(-((char)(-((char)(~((char)((char)((char)(~((char)((char)(var4[var5] - var5) ^ var5))) >>> 3 | (char)(~((char)((char)(var4[var5] - var5) ^ var5))) << 13) << 11 | (char)((char)(~((char)((char)(var4[var5] - var5) ^ var5))) >>> 3 | (char)(~((char)((char)(var4[var5] - var5) ^ var5))) << 13) >>> 5))))))) << 8) >>> 2) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void IIllllIlll() {
      class_746 var1 = Iiiilllliiilll.field_1724;
      if (var1 != null && Iiiilllliiilll.field_1755 instanceof class_465 && var1.field_7512 != var1.field_7498) {
         var1.method_7346();
      }

   }

   private void iiiIlIIIll(class_2596<?> p) {
      if (p instanceof class_7439 var2) {
         if (var2.comp_763() != null) {
            this.lIIlliIIll(var2.comp_763().getString());
         }
      } else if (p instanceof class_5894 var3) {
         if (var3.comp_2279() != null) {
            this.lIIlliIIll(var3.comp_2279().getString());
         }
      } else if (p instanceof class_5904 var4) {
         if (var4.comp_2281() != null) {
            this.lIIlliIIll(var4.comp_2281().getString());
         }
      } else if (p instanceof class_5903 var5) {
         if (var5.comp_2280() != null) {
            this.lIIlliIIll(var5.comp_2280().getString());
         }
      }

   }

   private void Iillllilll(String msg, boolean good) {
      this.IlIilIIilllIilIIil = null;
      this.liIilIIiliiIilIIil = 0L;
      if (this.IliIlllilIi()) {
         try (AutoCloseable var3 = Iliiiiilliiiii.IliIlllilIi().liiiIIllIl()) {
            this.IIillIiliIil(false);
         } catch (Exception var8) {
            this.IlIilIIilllIilIIil = null;
         }
      }

      if (msg != null) {
         this.iilllIIill(msg, good);
      }

   }

   public IilIIlllilIIll() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.lIlllIIiliIlllIIil = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (String[])iiiIIIIlIIIlIIIl.iIiIliIlIl.toArray(new String[0]));
      this.IllllIIillllllIIil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
      this.iIillIIilIlillIIil = new ConcurrentLinkedQueue();
      this.llillIIililillIIil = new AtomicInteger();
      this.IiillIIilliillIIil = new iiiIIIIlIIIlIIIl();
      this.lIIilIIiliIIilIIil = Set.of();
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iiIllIIilIIlllIIil, this.lIlllIIiliIlllIIil, this.IllllIIillllllIIil});
   }

   protected void Iilililiiili() {
      this.IlIilIIilllIilIIil = null;
      this.ilIilIIilIiIilIIil = null;
      this.iiillIIilIIIilIIil = 0L;
      this.iIillIIilIlillIIil.clear();
      this.llillIIililillIIil.set(0);
   }

   private void lIIlliIIll(String s) {
      if (s != null && !s.isBlank() && this.llillIIililillIIil.get() < (~(-(~-1350370206)) * 1527099483 ^ 351766900)) {
         this.iIillIIilIlillIIil.offer(s);
         this.llillIIililillIIil.incrementAndGet();
      }
   }

   protected void Illillliilli() {
      this.iIillIIilIlillIIil.clear();
      this.llillIIililillIIil.set(0);
      this.IlIilIIilllIilIIil = null;
      this.ilIilIIilIiIilIIil = null;
      this.liIilIIiliiIilIIil = 0L;
      this.IIlilIIillIlilIIil = 0;
      if (Iiiilllliiilll != null) {
         if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.method_1562() != null) {
            String var1 = this.iIlllIllll();
            if (var1 != null) {
               Iiiilllliiilll.method_63588(() -> this.Iillllilll(IliIlllilIi<invokedynamic>() + var1 + IliIlllilIi<invokedynamic>(), false));
            } else {
               String var2 = this.iiIllIIilIIlllIIil.Iilllilliill() == null ? "" : this.iiIllIIilIIlllIIil.Iilllilliill().trim();
               if (!IliIilillliIilil.IliIlllilIi(var2)) {
                  Iiiilllliiilll.method_63588(() -> this.Iillllilll(IliIlllilIi<invokedynamic>(), false));
               } else {
                  this.IlIilIIilllIilIIil = new IliIilillliIilil(var2, this.lIlllIIiliIlllIIil.Iilllilliill(), this.IiillIIilliillIIil);
                  this.ilIilIIilIiIilIIil = Iiiilllliiilll.method_1562().method_48296();
                  this.lIIilIIiliIIilIIil = this.lllllillll();
                  this.iiillIIilIIIilIIil = System.currentTimeMillis() + (-1749968427398981313L ^ -1749968427398979857L);
               }
            }
         } else {
            Iiiilllliiilll.method_63588(() -> this.Iillllilll((String)null, false));
         }
      }
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] << 5 | var4[var5] >>> 11))))) - var5) + 27890) + 'ꫮ') + var5) + var5) << 3 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] << 5 | var4[var5] >>> 11))))) - var5) + 27890) + 'ꫮ') + var5) + var5) >>> 13))) + var5) - var5) >>> 14 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] << 5 | var4[var5] >>> 11))))) - var5) + 27890) + 'ꫮ') + var5) + var5) << 3 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] << 5 | var4[var5] >>> 11))))) - var5) + 27890) + 'ꫮ') + var5) + var5) >>> 13))) + var5) - var5) << 2))))) - '\uf036') >>> 6 | (char)((char)(-((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] << 5 | var4[var5] >>> 11))))) - var5) + 27890) + 'ꫮ') + var5) + var5) << 3 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] << 5 | var4[var5] >>> 11))))) - var5) + 27890) + 'ꫮ') + var5) + var5) >>> 13))) + var5) - var5) >>> 14 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] << 5 | var4[var5] >>> 11))))) - var5) + 27890) + 'ꫮ') + var5) + var5) << 3 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] << 5 | var4[var5] >>> 11))))) - var5) + 27890) + 'ꫮ') + var5) + var5) >>> 13))) + var5) - var5) << 2))))) - '\uf036') << 10) ^ var5) << 7 | (char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] << 5 | var4[var5] >>> 11))))) - var5) + 27890) + 'ꫮ') + var5) + var5) << 3 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] << 5 | var4[var5] >>> 11))))) - var5) + 27890) + 'ꫮ') + var5) + var5) >>> 13))) + var5) - var5) >>> 14 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] << 5 | var4[var5] >>> 11))))) - var5) + 27890) + 'ꫮ') + var5) + var5) << 3 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] << 5 | var4[var5] >>> 11))))) - var5) + 27890) + 'ꫮ') + var5) + var5) >>> 13))) + var5) - var5) << 2))))) - '\uf036') >>> 6 | (char)((char)(-((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] << 5 | var4[var5] >>> 11))))) - var5) + 27890) + 'ꫮ') + var5) + var5) << 3 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] << 5 | var4[var5] >>> 11))))) - var5) + 27890) + 'ꫮ') + var5) + var5) >>> 13))) + var5) - var5) >>> 14 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] << 5 | var4[var5] >>> 11))))) - var5) + 27890) + 'ꫮ') + var5) + var5) << 3 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] << 5 | var4[var5] >>> 11))))) - var5) + 27890) + 'ꫮ') + var5) + var5) >>> 13))) + var5) - var5) << 2))))) - '\uf036') << 10) ^ var5) >>> 9));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.method_1562() != null) {
         long var1 = System.currentTimeMillis();
         if (this.IlIilIIilllIilIIil == null) {
            if (this.liIilIIiliiIilIIil > 0L && var1 >= this.liIilIIiliiIilIIil) {
               this.Iillllilll((String)null, false);
            }

         } else if (Iiiilllliiilll.method_1562().method_48296() != this.ilIilIIilIiIilIIil) {
            this.Iillllilll(IliIlllilIi<invokedynamic>(), false);
         } else {
            ++this.IIlilIIillIlilIIil;
            if (this.IIlilIIillIlilIIil % 20 == 0) {
               this.lIIilIIiliIIilIIil = this.lllllillll();
            }

            class_746 var3 = Iiiilllliiilll.field_1724;
            List var4 = this.IlIllllIll();
            IIIiIiillIIiIiil var5 = new IIIiIiillIIiIiil(Iiiilllliiilll.field_1687.method_27983().method_29177().toString(), var3.method_23317(), var3.method_23318(), var3.method_23321());
            boolean var6 = Iiiilllliiilll.field_1755 instanceof class_465 && var3.field_7512 != var3.field_7498;
            boolean var7 = !var3.method_5805() || Iiiilllliiilll.field_1755 instanceof class_418;
            Set var8 = this.lIIilIIiliIIilIIil;
            lllIiIiillIiIi var9 = this.IlIilIIilllIilIIil.IiIlliIliiIl(new IilIiilllilIiill(var1, var5, var3.method_24828() || var3.method_5799(), var6, var7, var4, (names) -> var8.contains(names.toLowerCase(Locale.ROOT))));
            if (this.IlIilIIilllIilIIil.IlIlllIlilIl(var1)) {
               this.iiillIIilIIIilIIil = var1 + 2000L;
            }

            switch (var9.IliIlllilIi()) {
               case liIiIlllll:
                  this.ilIllIiIll(var9.liiiIIllIl());
                  break;
               case iiIiIlllll:
                  this.liIlliiIll(var9.liiiIIllIl());
                  break;
               case iIliIlllll:
                  this.IIllllIlll();
                  this.Iillllilll(var9.liiiIIllIl(), false);
                  break;
               case lIliIlllll:
                  this.Iillllilll(var9.liiiIIllIl(), false);
                  break;
               case IIliIlllll:
                  this.IlIilIIilllIilIIil = null;
                  this.liIilIIiliiIilIIil = var1 + 2000L;
                  this.iilllIIill(var9.liiiIIllIl(), true);
            }

         }
      }
   }

   private void liIlliiIll(String arg) {
      class_746 var2 = Iiiilllliiilll.field_1724;
      if (var2 != null && arg != null) {
         class_1703 var4 = var2.field_7512;
         if (var4 instanceof class_1707) {
            class_1707 var3 = (class_1707)var4;
            String var12 = arg.toLowerCase(Locale.ROOT);
            String var5 = var12.replace(IliIlllilIi<invokedynamic>(), "");
            int var6 = var3.method_17388() * 9;

            for(int var7 = 0; var7 < var6 && var7 < var3.field_7761.size(); ++var7) {
               class_1799 var8 = var3.method_7611(var7).method_7677();
               if (!var8.method_7960()) {
                  String var9 = iiilliilIIIiliil.IliIlllilIi(var8.method_7964().getString());
                  if (var9.contains(var12) || var9.replace(IliIlllilIi<invokedynamic>(), "").replace(IliIlllilIi<invokedynamic>(), "").contains(var5)) {
                     int var10 = var3.field_7763;
                     lIlIiIliIlIiIl.iIlIlllllill(() -> {
                        if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1761 != null && Iiiilllliiilll.field_1724.field_7512.field_7763 == var10) {
                           Iiiilllliiilll.field_1761.method_2906(var10, var7, 0, class_1713.field_7790, Iiiilllliiilll.field_1724);
                        }
                     }, false);
                     return;
                  }
               }
            }

            return;
         }
      }

   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 8 | (char)(var4[var5] - var5) << 8) - var5) << 7 | (char)((char)((char)(var4[var5] - var5) >>> 8 | (char)(var4[var5] - var5) << 8) - var5) >>> 9) - '軠') - var5) + var5))) - var5) - 13450) ^ '짵') - '\ue3d4') << 15 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 8 | (char)(var4[var5] - var5) << 8) - var5) << 7 | (char)((char)((char)(var4[var5] - var5) >>> 8 | (char)(var4[var5] - var5) << 8) - var5) >>> 9) - '軠') - var5) + var5))) - var5) - 13450) ^ '짵') - '\ue3d4') >>> 1));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void IiIIlliIIl(IliIliIllliIliIl e) {
      if (e != null && e.iilIIiiIll != null) {
         class_2596 var3 = e.iilIIiiIll;
         if (!(var3 instanceof class_8038)) {
            var3 = e.iilIIiiIll;
            if (var3 instanceof class_7439) {
               class_7439 var5 = (class_7439)var3;
               if (var5.comp_763() != null) {
                  String var8 = var5.comp_763().getString();
                  this.lIIlliIIll(var8);
                  if (!var5.comp_906() && this.IllllIIillllllIIil.Iilllilliill() && System.currentTimeMillis() <= this.iiillIIilIIIilIIil) {
                     Set var9 = this.lIIilIIiliIIilIIil;
                     if (lIlIlliliIlIllil.iIlIlllllill(var8, (n) -> var9.contains(n.toLowerCase(Locale.ROOT)))) {
                        e.IliIlllilIi();
                     }
                  }

                  return;
               }
            }

            this.iiiIlIIIll(e.iilIIiiIll);
         } else {
            class_8038 var2 = (class_8038)var3;

            for(class_2596 var4 : var2.method_48324()) {
               this.iiiIlIIIll(var4);
            }

         }
      }
   }
}
