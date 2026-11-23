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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiPredicate;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1646;
import net.minecraft.class_1657;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2261;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_2480;
import net.minecraft.class_2561;
import net.minecraft.class_2588;
import net.minecraft.class_2596;
import net.minecraft.class_2623;
import net.minecraft.class_2673;
import net.minecraft.class_2680;
import net.minecraft.class_2703;
import net.minecraft.class_2716;
import net.minecraft.class_2767;
import net.minecraft.class_3414;
import net.minecraft.class_3419;
import net.minecraft.class_3481;
import net.minecraft.class_638;
import net.minecraft.class_7417;
import net.minecraft.class_7439;
import net.minecraft.class_746;
import net.minecraft.class_7828;
import net.minecraft.class_2703.class_5893;

public final class IlIiiIillIiiIi {
   private final ConcurrentLinkedQueue<ilIlIlIiIiIlIlIi> lililIiiiiililIiii = new ConcurrentLinkedQueue();
   private final Map<UUID, Long> iiiilIiiiIIIIiIiii = new HashMap();
   private final Set<UUID> IlIIiIiiillIIiIiii = new HashSet();
   static final long liillIiiiiiillIiii = 2000L;
   private final Map<UUID, Long> IiiilIiiiliiilIiii = new HashMap();
   private class_638 liIIiIiiiiiIIiIiii;
   static final double IlillIiiillillIiii = (double)8.0F;
   static BiPredicate<UUID, String> illilIiiiIililIiii = IlIiiIillIiiIi::Ililllililil;
   static final long IIIilIiiilIIilIiii = 3000L;
   static final long llIilIiiiilIilIiii = 5000L;
   static final int lIillIiiiiIillIiii = 4096;
   static final int IllilIiiilllilIiii = 4096;
   private final Map<UUID, liIiIIlliiIiIIll> lliilIiiiiliilIiii = new HashMap();
   private int IIlIiIiiilIlIiIiii;
   static final double ilillIiiiIiillIiii = (double)17.0F;
   private final Map<Integer, liIiIIlliiIiIIll> iIiilIiiiIliilIiii = new HashMap();
   private final Map<String, Long> lIIIiIiiiiIIIiIiii = new HashMap();
   private final List<lilIIIiliilIIIil> ilIIiIiiiIiIIiIiii = new ArrayList();
   static final long iIIilIiiiIlIilIiii = 2000L;
   static final double IiIilIiiiliIilIiii = (double)160.0F;
   private final AtomicInteger IIiilIiiilIiilIiii = new AtomicInteger();
   static final int iiIilIiiiIIlilIiii = 16;
   static final int lIlilIiiiiIlilIiii = 12;

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\udb1e') + var5)) << 7 | (char)((char)((char)(var4[var5] ^ '\udb1e') + var5)) >>> 9) + '\uf77c') ^ '맟') + 'ꓧ') ^ '곜') + '\uec35'))) ^ var5) ^ var5) ^ var5) + '雿') >>> 11 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\udb1e') + var5)) << 7 | (char)((char)((char)(var4[var5] ^ '\udb1e') + var5)) >>> 9) + '\uf77c') ^ '맟') + 'ꓧ') ^ '곜') + '\uec35'))) ^ var5) ^ var5) ^ var5) + '雿') << 5) + 21024))) - '뒭') >>> 5 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\udb1e') + var5)) << 7 | (char)((char)((char)(var4[var5] ^ '\udb1e') + var5)) >>> 9) + '\uf77c') ^ '맟') + 'ꓧ') ^ '곜') + '\uec35'))) ^ var5) ^ var5) ^ var5) + '雿') >>> 11 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\udb1e') + var5)) << 7 | (char)((char)((char)(var4[var5] ^ '\udb1e') + var5)) >>> 9) + '\uf77c') ^ '맟') + 'ꓧ') ^ '곜') + '\uec35'))) ^ var5) ^ var5) ^ var5) + '雿') << 5) + 21024))) - '뒭') << 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iIlIlllllill(ilIlIlIiIiIlIlIi e) {
      this.IIiilIiiilIiilIiii.incrementAndGet();
      this.lililIiiiiililIiii.offer(e);
   }

   static String lIiiIiIlilli(class_2561 text) {
      if (text != null) {
         class_7417 var2 = text.method_10851();
         if (var2 instanceof class_2588) {
            class_2588 var1 = (class_2588)var2;
            if (Iiiiliiiiiii<invokedynamic>().equals(var1.method_11022()) && var1.method_11023().length != 0) {
               Object var4 = var1.method_11023()[0];
               String var10000;
               if (var4 instanceof class_2561) {
                  class_2561 var3 = (class_2561)var4;
                  var10000 = var3.getString();
               } else {
                  var10000 = String.valueOf(var4);
               }

               return var10000;
            }

            return null;
         }
      }

      return null;
   }

   // $FF: synthetic method
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + '븃') >>> 5 | (char)(var4[var5] + '븃') << 11) + 6876) >>> 14 | (char)((char)((char)(var4[var5] + '븃') >>> 5 | (char)(var4[var5] + '븃') << 11) + 6876) << 2) ^ 4033) << 5 | (char)((char)((char)((char)((char)(var4[var5] + '븃') >>> 5 | (char)(var4[var5] + '븃') << 11) + 6876) >>> 14 | (char)((char)((char)(var4[var5] + '븃') >>> 5 | (char)(var4[var5] + '븃') << 11) + 6876) << 2) ^ 4033) >>> 11))) - '\ue705') - 15611))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void liiiIIllIl(class_2596<?> packet) {
      if (this.IIiilIiiilIiilIiii.get() < 4096) {
         long var2 = System.currentTimeMillis();
         if (packet instanceof class_2767) {
            class_2767 var4 = (class_2767)packet;

            String var11;
            try {
               var11 = ((class_3414)var4.method_11894().comp_349()).comp_3319().method_12832();
            } catch (Throwable var13) {
               return;
            }

            boolean var12 = var4.method_11888() == class_3419.field_15245;
            if (lIIilliIIill.IliIlllilIi(var11, var12) == null) {
               return;
            }

            this.iIlIlllllill(new ilIlIlIiIiIlIlIi(IIllliilIlllii.lIIlIliIIl, var11, var12 ? 1 : 0, 0, var4.method_11890(), var4.method_11889(), var4.method_11893(), (UUID)null, (int[])null, var2));
         } else if (packet instanceof class_2673) {
            class_2673 var5 = (class_2673)packet;
            if (lIIilliIIill.liiiIIllIl(var5.method_11532()) == null) {
               return;
            }

            if (var5.method_11532() == 2001 && IilliliilIIi(var5.method_11534())) {
               return;
            }

            class_2338 var14 = var5.method_11531();
            this.iIlIlllllill(new ilIlIlIiIiIlIlIi(IIllliilIlllii.iIIlIliIIl, (String)null, var5.method_11532(), var5.method_11534(), (double)var14.method_10263() + (double)0.5F, (double)var14.method_10264() + (double)0.5F, (double)var14.method_10260() + (double)0.5F, (UUID)null, (int[])null, var2));
         } else if (packet instanceof class_2623) {
            class_2623 var6 = (class_2623)packet;
            lIilllliIillll var15 = iliIiiliiiii(var6.method_11295(), var6.method_11294(), var6.method_11296());
            if (var15 == null) {
               return;
            }

            class_2338 var19 = var6.method_11298();
            this.iIlIlllllill(new ilIlIlIiIiIlIlIi(IIllliilIlllii.IlIlIliIIl, var15.name(), 0, 0, (double)var19.method_10263() + (double)0.5F, (double)var19.method_10264() + (double)0.5F, (double)var19.method_10260() + (double)0.5F, (UUID)null, (int[])null, var2));
         } else if (packet instanceof class_2716) {
            class_2716 var7 = (class_2716)packet;
            this.iIlIlllllill(new ilIlIlIiIiIlIlIi(IIllliilIlllii.llIlIliIIl, (String)null, 0, 0, (double)0.0F, (double)0.0F, (double)0.0F, (UUID)null, var7.method_36548().toIntArray(), var2));
         } else if (packet instanceof class_7828) {
            class_7828 var8 = (class_7828)packet;

            for(UUID var20 : var8.comp_1105()) {
               this.iIlIlllllill(new ilIlIlIiIiIlIlIi(IIllliilIlllii.ilIlIliIIl, (String)null, 0, 0, (double)0.0F, (double)0.0F, (double)0.0F, var20, (int[])null, var2));
            }
         } else {
            if (packet instanceof class_2703) {
               class_2703 var9 = (class_2703)packet;
               if (var9.method_46327().contains(class_5893.field_29136)) {
                  for(class_2703.class_2705 var21 : var9.method_46329()) {
                     this.iIlIlllllill(new ilIlIlIiIiIlIlIi(IIllliilIlllii.liIlIliIIl, (String)null, 0, 0, (double)0.0F, (double)0.0F, (double)0.0F, var21.comp_1106(), (int[])null, var2));
                  }

                  return;
               }
            }

            if (packet instanceof class_7439) {
               class_7439 var10 = (class_7439)packet;
               if (!var10.comp_906()) {
                  String var17 = lIiiIiIlilli(var10.comp_763());
                  if (var17 != null) {
                     this.iIlIlllllill(new ilIlIlIiIiIlIlIi(IIllliilIlllii.IiIlIliIIl, var17, 0, 0, (double)0.0F, (double)0.0F, (double)0.0F, (UUID)null, (int[])null, var2));
                  }
               }
            }
         }

      }
   }

   private boolean Iilllilliill(String ms, long name) {
      Long var4 = (Long)this.lIIIiIiiiiIIIiIiii.get(ms.toLowerCase(Locale.ROOT));
      return var4 != null && Math.abs(name - var4) <= (1251226725064000222L ^ 1251226725064000782L);
   }

   private void IIillIiliIil(liIiIIlliiIiIIll s, lliIIIliliIIIl book, long now) {
      if (!s.lIIIiIllll && !this.IlIIiIiiillIIiIiii.contains(s.lliilIllll) && illilIiiiIililIiii.test(s.lliilIllll, s.iliilIllll)) {
         book.iliIiiliiiii(lIilllliIillll.iIiiiiiilIliiiiiil, (int)Math.floor(s.IiiilIllll), (int)Math.floor(s.liiilIllll), (int)Math.floor(s.iiiilIllll), Iiiiliiiiiii<invokedynamic>() + s.lliilIllll + Iiiiliiiiiii<invokedynamic>() + now / (453981766192429720L ^ 453981766192435448L), lIilllliIillll.iIiiiiiilIliiiiiil.IlIIIIIIillIIIIIIi, s.iliilIllll + Iiiiliiiiiii<invokedynamic>(), now);
      }
   }

   static boolean IilliliilIIi(int rawState) {
      try {
         class_2680 var1 = class_2248.method_9531(rawState);
         return var1.method_26204() instanceof class_2261 || var1.method_26164(class_3481.field_15503) || var1.method_26164(class_3481.field_20339) || var1.method_26164(class_3481.field_20341) || var1.method_27852(class_2246.field_10479) || var1.method_27852(class_2246.field_10214) || var1.method_27852(class_2246.field_10219) || var1.method_27852(class_2246.field_10477) || var1.method_27852(class_2246.field_10195) || var1.method_27852(class_2246.field_10424) || var1.method_27852(class_2246.field_10362);
      } catch (Throwable var2) {
         return false;
      }
   }

   private boolean Illlllllilll(ilIlIlIiIiIlIlIi e) {
      if (this.liIIiIiiiiiIIiIiii == null) {
         return false;
      } else {
         try {
            return !this.liIIiIiiiiiIIiIiii.method_8390(class_1646.class, new class_238(e.IiIIIIIIIi - Double.longBitsToDouble(-2497494407450977465L ^ -7113684025505735865L), e.liIIIIIIIi - Double.longBitsToDouble(8856346288014462012L ^ 4242408469773388860L), e.iiIIIIIIIi - Double.longBitsToDouble(4658355147609178681L ^ 51172728809161273L), e.IiIIIIIIIi + Double.longBitsToDouble(8785023684722505832L ^ 4177841265922488424L), e.liIIIIIIIi + Double.longBitsToDouble(-4484921231384856914L ^ -9094355449998559570L), e.iiIIIIIIIi + Double.longBitsToDouble(5600752589940972647L ^ 984562971886214247L)), (v) -> true).isEmpty();
         } catch (Throwable var3) {
            return false;
         }
      }
   }

   void IlIlllIlilIl(int z, UUID now, String entityId, double id, double name, double y, long x) {
      long var14 = -7972478419820749554L;
      var14 ^= ((long)(!this.IlIIiIiiillIIiIiii.contains(now) && illilIiiiIililIiii.test(now, entityId) ? 0 : 1) << 32 ^ var14) & -1L << 32;
      if ((int)(var14 >>> 32) != 0 && this.IlIIiIiiillIIiIiii.size() < (((1324583265 ^ -19) + 89) * 81 ^ 82939509)) {
         this.IlIIiIiiillIIiIiii.add(now);
      }

      Long var13 = (Long)this.iiiilIiiiIIIIiIiii.remove(now);
      if (var13 != null && x - var13 <= (3928527012096018482L ^ 3928527012096017290L) && (int)(var14 >>> 32) == 0) {
         this.ilIIiIiiiIiIIiIiii.add(new lilIIIiliilIIIil(now, entityId, (int)Math.floor(id), (int)Math.floor(name), (int)Math.floor(y), x + (-365779106515828113L ^ -365779106515827265L)));
      }

      this.iIiilIiiiIliilIiii.put(z, new liIiIIlliiIiIIll(now, entityId, id, name, y, x, (boolean)((int)(var14 >>> 32))));
   }

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] - 16867))))) + 24001) + '軑') + 13114) ^ 1929) - 4440))) ^ '\uecc2') + 21427));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static boolean Ililllililil(UUID name, String id) {
      try {
         if (id != null) {
            for(String var5 : lllIIIIiillIIIIi.liIIiiIiil) {
               if (var5 != null && var5.trim().equalsIgnoreCase(id)) {
                  return false;
               }
            }
         }

         if (lllIIIIiillIIIIi.iiiIlIIIll(name, id)) {
            return false;
         } else {
            return id == null || !iIIiIiIlIlIiIiIl.IliIlllilIi(id);
         }
      } catch (Throwable var6) {
         return false;
      }
   }

   void IIlllIlliIll(ilIlIlIiIiIlIlIi sx, double book, double e, double sz, lliIIIliliIIIl now, long sy) {
      switch (sx.iIIIIIIIIi.ordinal()) {
         case 0:
            Iiilliiliiil(lIIilliIIill.IliIlllilIi(sx.IlIIIIIIIi, sx.llIIIIIIIi == 1), sx, book, e, sz, now, sy);
            break;
         case 1:
            if (sx.llIIIIIIIi == 1500 && this.Illlllllilll(sx)) {
               return;
            }

            Iiilliiliiil(lIIilliIIill.liiiIIllIl(sx.llIIIIIIIi), sx, book, e, sz, now, sy);
            break;
         case 2:
            Iiilliiliiil(lIilllliIillll.valueOf(sx.IlIIIIIIIi), sx, book, e, sz, now, sy);
            break;
         case 3:
            for(int var14 : sx.lIlIIIIIIi) {
               liIiIIlliiIiIIll var15 = (liIiIIlliiIiIIll)this.iIiilIiiiIliilIiii.remove(var14);
               if (var15 != null) {
                  Long var16 = (Long)this.IiiilIiiiliiilIiii.remove(var15.lliilIllll);
                  if (var16 != null && Math.abs(sx.iIlIIIIIIi - var16) <= 2000L) {
                     this.IIillIiliIil(var15, now, sy);
                  } else if (this.Iilllilliill(var15.iliilIllll, sx.iIlIIIIIIi)) {
                     this.IIillIiliIil(var15, now, sy);
                  } else {
                     this.lliilIiiiiliilIiii.put(var15.lliilIllll, new liIiIIlliiIiIIll(var15.lliilIllll, var15.iliilIllll, var15.IiiilIllll, var15.liiilIllll, var15.iiiilIllll, sx.iIlIIIIIIi, var15.lIIIiIllll));
                  }
               }
            }
            break;
         case 4:
            liIiIIlliiIiIIll var17 = (liIiIIlliiIiIIll)this.lliilIiiiiliilIiii.remove(sx.IIlIIIIIIi);
            if (var17 != null && Math.abs(sx.iIlIIIIIIi - var17.IIIIiIllll) <= 2000L) {
               this.IIillIiliIil(var17, now, sy);
            } else {
               this.IiiilIiiiliiilIiii.put(sx.IIlIIIIIIi, sx.iIlIIIIIIi);
            }

            this.ilIIiIiiiIiIIiIiii.removeIf((a) -> a.iliIiIIIil.equals(sx.IIlIIIIIIi));
            break;
         case 5:
            this.lIIIiIiiiiIIIiIiii.put(sx.IlIIIIIIIi.toLowerCase(Locale.ROOT), sx.iIlIIIIIIi);
            Iterator var11 = this.lliilIiiiiliilIiii.values().iterator();

            while(var11.hasNext()) {
               liIiIIlliiIiIIll var12 = (liIiIIlliiIiIIll)var11.next();
               if (var12.iliilIllll.equalsIgnoreCase(sx.IlIIIIIIIi) && Math.abs(sx.iIlIIIIIIi - var12.IIIIiIllll) <= 2000L) {
                  var11.remove();
                  this.IIillIiliIil(var12, now, sy);
               }
            }
            break;
         case 6:
            this.iiiilIiiiIIIIiIiii.put(sx.IIlIIIIIIi, sx.iIlIIIIIIi);
      }

   }

   public void IIIllIIliIIl(class_638 now, class_746 self, lliIIIliliIIIl w, long book) {
      this.liIIiIiiiiiIIiIiii = now;
      double var6 = self.method_23317();
      double var8 = self.method_23321();

      for(class_1657 var11 : now.method_18456()) {
         if (var11 != self) {
            double var12 = var11.method_23317() - var6;
            double var14 = var11.method_23321() - var8;
            if (!(var12 * var12 + var14 * var14 > (double)25600.0F)) {
               this.IlIlllIlilIl(var11.method_5628(), var11.method_5667(), var11.method_7334().name(), var11.method_23317(), var11.method_23318(), var11.method_23321(), book);
            }
         }
      }

      this.IiIlliIliiIl(w, book);
      int var17 = 512;

      ilIlIlIiIiIlIlIi var16;
      while(var17-- > 0 && (var16 = (ilIlIlIiIiIlIlIi)this.lililIiiiiililIiii.poll()) != null) {
         this.IIiilIiiilIiilIiii.decrementAndGet();
         this.IIlllIlliIll(var16, self.method_23317(), self.method_23318(), self.method_23321(), w, book);
      }

      this.iIiilIiiiIliilIiii.values().removeIf((s) -> book - s.IIIIiIllll > 5000L);
      this.lliilIiiiiliilIiii.values().removeIf((s) -> book - s.IIIIiIllll > 2000L);
      this.IiiilIiiiliiilIiii.values().removeIf((nowx) -> book - nowx > 2000L);
      this.iiiilIiiiIIIIiIiii.values().removeIf((t) -> book - t > 3000L);
      this.lIIIiIiiiiIIIiIiii.values().removeIf((t) -> book - t > 2000L);
      if (++this.IIlIiIiiilIlIiIiii % 40 == 0) {
         this.IIIilIIiiIIi(self, w, book);
      }

   }

   void IiIlliIliiIl(lliIIIliliIIIl now, long book) {
      Iterator var4 = this.ilIIiIiiiIiIIiIiii.iterator();

      while(var4.hasNext()) {
         lilIIIiliilIIIil var5 = (lilIIIiliilIIIil)var4.next();
         if (book >= var5.lIIliIIIil) {
            var4.remove();
            if (!this.IlIIiIiiillIIiIiii.contains(var5.iliIiIIIil) && illilIiiiIililIiii.test(var5.iliIiIIIil, var5.IiiIiIIIil)) {
               now.iliIiiliiiii(lIilllliIillll.lliiiiiililiiiiiil, var5.liiIiIIIil, var5.iiiIiIIIil, var5.IIIliIIIil, Iiiiliiiiiii<invokedynamic>() + var5.iliIiIIIil + Iiiiliiiiiii<invokedynamic>() + var5.lIIliIIIil / 60000L, lIilllliIillll.lliiiiiililiiiiiil.IlIIIIIIillIIIIIIi, var5.IiiIiIIIil + Iiiiliiiiiii<invokedynamic>(), book);
            } else {
               this.IlIIiIiiillIIiIiii.add(var5.iliIiIIIil);
            }
         }
      }

   }

   // $FF: synthetic method
   private static CallSite iiIIlIIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 2155) - 'Ｃ') ^ 12399) ^ 11499) << 6 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ 2155) - 'Ｃ') ^ 12399) ^ 11499) >>> 10))) >>> 9 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 2155) - 'Ｃ') ^ 12399) ^ 11499) << 6 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ 2155) - 'Ｃ') ^ 12399) ^ 11499) >>> 10))) << 7) << 1 | (char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 2155) - 'Ｃ') ^ 12399) ^ 11499) << 6 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ 2155) - 'Ｃ') ^ 12399) ^ 11499) >>> 10))) >>> 9 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 2155) - 'Ｃ') ^ 12399) ^ 11499) << 6 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ 2155) - 'Ｃ') ^ 12399) ^ 11499) >>> 10))) << 7) >>> 15))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -5003562116716865635L ^ Long.rotateLeft(7599113306948484537L, 18) ^ 4371400089636576231L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -8778614154189279966L ^ Long.rotateLeft(-3909107117924272458L, 10) ^ -1666539403424749273L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5341311773746240968L ^ Long.rotateLeft(8035980146807654555L, 19) ^ 8563859161141773562L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 4068656829182400106L ^ Long.rotateLeft(2128498052761265936L, 10) ^ 4630319751865880443L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -739907202239225018L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 8992529884028543515L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -1507701445180057107L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 8889605459557079100L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5245556687453359598L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4948319204410153998L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIIIllIIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iIIIlIlIIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, llIIlilIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IiIIlliIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iiIIlIIlIl<invokedynamic>());
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

   private static void Iiilliiliiil(lIilllliIillll sz, ilIlIlIiIiIlIlIi sx, double clue, double now, double book, lliIIIliliIIIl e, long sy) {
      long var22 = 5716560906540543433L;
      long var24 = 6942493655879992236L;
      if (sz != null) {
         double var11 = sx.IiIIIIIIIi - clue;
         double var13 = sx.liIIIIIIIi - now;
         double var15 = sx.iiIIIIIIIi - book;
         double var17 = sz == lIilllliIillll.liliiiiiliiliiiiil ? Double.longBitsToDouble(-1527605375634642780L ^ -6125499120203208540L) : Double.longBitsToDouble(-2238190976081451015L ^ -6858884193763579911L);
         if (!(var11 * var11 + var13 * var13 + var15 * var15 <= var17 * var17)) {
            var22 ^= ((long)((int)Math.floor(sx.IiIIIIIIIi)) << 32 ^ var22) & -1L << 32;
            var22 ^= ((long)((int)Math.floor(sx.liIIIIIIIi)) ^ var22) & -1L >>> 32;
            var24 ^= ((long)((int)Math.floor(sx.iiIIIIIIIi)) << 32 ^ var24) & -1L << 32;
            e.lIiiIiIlilli(sz, (int)(var22 >>> 32), (int)var22, (int)(var24 >>> 32), Iiiiliiiiiii<invokedynamic>() + sz.ordinal() + Iiiiliiiiiii<invokedynamic>() + (int)(var22 >>> 32) + Iiiiliiiiiii<invokedynamic>() + (int)var22 + Iiiiliiiiiii<invokedynamic>() + (int)(var24 >>> 32) + Iiiiliiiiiii<invokedynamic>() + sx.iIlIIIIIIi / (-6928045380134841686L ^ -6928045380134881078L), sy);
         }
      }
   }

   // $FF: synthetic method
   private static CallSite IiIIlliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') << 1 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') >>> 15))) >>> 14 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') << 1 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') >>> 15))) << 2) - '냬') >>> 12 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') << 1 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') >>> 15))) >>> 14 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') << 1 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') >>> 15))) << 2) - '냬') << 4) << 9 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') << 1 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') >>> 15))) >>> 14 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') << 1 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') >>> 15))) << 2) - '냬') >>> 12 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') << 1 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') >>> 15))) >>> 14 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') << 1 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') >>> 15))) << 2) - '냬') << 4) >>> 7) ^ var5) - '듻') << 14 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') << 1 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') >>> 15))) >>> 14 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') << 1 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') >>> 15))) << 2) - '냬') >>> 12 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') << 1 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') >>> 15))) >>> 14 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') << 1 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') >>> 15))) << 2) - '냬') << 4) << 9 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') << 1 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') >>> 15))) >>> 14 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') << 1 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') >>> 15))) << 2) - '냬') >>> 12 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') << 1 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') >>> 15))) >>> 14 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') << 1 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') >>> 3 | (char)((char)((char)((char)(-var4[var5]) + 7309) - var5) - '\udb5b') << 13) << 14) ^ '辝') >>> 15))) << 2) - '냬') << 4) >>> 7) ^ var5) - '듻') >>> 2) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static lIilllliIillll iliIiiliiiii(class_2248 block, int type, int data) {
      if (block != class_2246.field_10560 && block != class_2246.field_10615) {
         if (block == class_2246.field_10179) {
            return lIilllliIillll.iiIiiiiilIIliiiiil;
         } else {
            boolean var3 = block == class_2246.field_10034 || block == class_2246.field_10380 || block == class_2246.field_10443 || block instanceof class_2480;
            return var3 && type == 1 && data > 0 ? lIilllliIillll.IiIiiiiilliIiiiiil : null;
         }
      } else {
         return lIilllliIillll.iiIiiiiilIIliiiiil;
      }
   }

   private void IIIilIIiiIIi(class_746 now, lliIIIliliIIIl self, long book) {
      int var5 = now.method_31477() >> 4;
      int var6 = now.method_31479() >> 4;

      try {
         for(iIiilIllIliilIll var8 : liilliIiiiilliIi.ilIiiliIIi.iIliiliIIi.values()) {
            if (Math.abs(var8.liIiIlilll - var5) <= 12 && Math.abs(var8.iiIiIlilll - var6) <= 12 && (Math.abs(var8.liIiIlilll - var5) > 1 || Math.abs(var8.iiIiIlilll - var6) > 1)) {
               for(int var9 = 1; var9 <= var8.IIliIlilll; ++var9) {
                  int var10 = (var8.lIliIlilll + (var9 - 1)) * 16;
                  if (var10 + 15 >= 16) {
                     break;
                  }

                  if (var8.iIliIlilll[var9] == lilIlIiiilIlIi.IlIlIlIiillIlIlIii) {
                     self.lIiiIiIlilli(lIilllliIillll.Iiiiiiiilliiiiiiil, var8.liIiIlilll * 16 + 8, var10 + 8, var8.iiIiIlilll * 16 + 8, Iiiiliiiiiii<invokedynamic>() + var8.liIiIlilll + Iiiiliiiiiii<invokedynamic>() + var8.iiIiIlilll, book);
                     break;
                  }
               }
            }
         }
      } catch (Throwable var11) {
      }

   }

   public void IliIlllilIi() {
      this.lililIiiiiililIiii.clear();
      this.IIiilIiiilIiilIiii.set(0);
      this.iIiilIiiiIliilIiii.clear();
      this.lliilIiiiiliilIiii.clear();
      this.IiiilIiiiliiilIiii.clear();
      this.iiiilIiiiIIIIiIiii.clear();
      this.lIIIiIiiiiIIIiIiii.clear();
      this.ilIIiIiiiIiIIiIiii.clear();
   }
}
