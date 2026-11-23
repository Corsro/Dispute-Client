package gg.corz;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1297;
import net.minecraft.class_1429;
import net.minecraft.class_1439;
import net.minecraft.class_1646;
import net.minecraft.class_2246;
import net.minecraft.class_2281;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_2404;
import net.minecraft.class_2680;
import net.minecraft.class_2745;
import net.minecraft.class_2818;
import net.minecraft.class_638;
import net.minecraft.class_2902.class_2903;

public final class llliliIlilliliIl {
   static final int iIiIIIIlll = 3;
   private class_638 llllIIIlll;
   static final int IllIIIIlll = 2;
   private final lIIlIiIliIIlIiIl liiIIIIlll = new lIIlIiIliIIlIiIl();
   public static final int iilIIIIlll = 0;
   private int iiIlIIIlll;
   static final int IIiIIIIlll = 2;
   private final Map<Long, Boolean> IlilIIIlll = new LinkedHashMap<Long, Boolean>(this, -361655082 - 61 + -117 ^ 15 ^ -361655189, 0.75F) {
      protected boolean removeEldestEntry(Map.Entry<Long, Boolean> eldest) {
         return this.size() > (((1428874473 << 23 | 1428874473 >>> 9) - -33 << 19 | (1428874473 << 23 | 1428874473 >>> 9) - -33 >>> 13) ^ -1399085228);
      }
   };
   static final int IilIIIIlll = 65536;
   static final int liIIIIIlll = 700;
   static final long iiIIIIIlll = 45000L;
   private int IIllIIIlll = -1;
   static final int lllIIIIlll = 8;
   private int iIilIIIlll;
   static final int IliIIIIlll = 30000;
   private boolean llIlIIIlll = true;
   private lliIIIliliIIIl illlIIIlll;
   private int lIllIIIlll;
   private final llllIliilllIli IiiIIIIlll = new llllIliilllIli();
   private int lIilIIIlll;
   static final long illIIIIlll = 2000L;
   private final iIIlIIIiIlIlIIIi iliIIIIlll = new iIIlIIIiIlIlIIIi();
   private int iIllIIIlll;
   static final int lilIIIIlll = 25;
   static final int lIiIIIIlll = 4;
   private final LongOpenHashSet iillIIIlll = new LongOpenHashSet();
   static final double lliIIIIlll = 0.6;
   private volatile IlIillIillIillIi lIIlIIIlll;
   static final long lIlIIIIlll = 20000L;
   private final ExecutorService IIIlIIIlll = Executors.newSingleThreadExecutor((r) -> {
      Thread var1 = new Thread(r, IiIIlliIIl<invokedynamic>());
      var1.setDaemon(true);
      var1.setPriority(1);
      return var1;
   });
   private int IlllIIIlll;
   private int lillIIIlll;
   private final Map<Long, iliiilIlIiiiilIl> iiiIIIIlll = new ConcurrentHashMap();
   static final long IIlIIIIlll = 2000L;
   private long ilIlIIIlll;
   private long IiIlIIIlll;
   private boolean iIIlIIIlll;
   private long IillIIIlll;
   private int liIlIIIlll;
   private int IIilIIIlll = -(-1332666442 * 128207979) ^ 43 ^ -749357363;
   private boolean IlIlIIIlll;
   static final int iIlIIIIlll = 6;

   static boolean IIiilIiiiIii(Illiilllllliilll sig) {
      return sig.iIIlIllill || sig.lIIlIllill > 0 || sig.IiilIllill;
   }

   private void Iliilliiilii(lIiiIIIiiIiiIIIi sc, iliIiiiIiiIiii e) {
      if (this.llllIIIlll != null) {
         try {
            class_238 var3 = new class_238((double)(sc.IiIIlliIIl() - 16), (double)(sc.lIlIliIlIl() - 8), (double)(sc.illIlIilIl() - 16), (double)(sc.iiIIlIIlIl() + 17), (double)(sc.IllIllllIl() + 9), (double)(sc.lilIliilIl() + 17));
            int var4 = 0;
            int var5 = 0;
            HashMap var6 = new HashMap();

            for(class_1297 var8 : this.llllIIIlll.method_8335((class_1297)null, var3)) {
               if (var8 instanceof class_1646) {
                  ++var4;
               } else if (var8 instanceof class_1439) {
                  ++var5;
               } else if (var8 instanceof class_1429) {
                  var6.merge(var8.method_5864(), 1, Integer::sum);
               }
            }

            int var11 = 0;

            for(int var9 : var6.values()) {
               var11 = Math.max(var11, var9);
            }

            e.IIilliiIIl = var4;
            e.lIilliiIIl = var5;
            e.IlilliiIIl = var11;
            sc.lIiiIiIlilli(var4, var5, 0, var11);
         } catch (Throwable var10) {
         }

      }
   }

   private void IiIlliIliiIl() {
      ArrayList var1 = new ArrayList();
      ArrayList var2 = new ArrayList();

      for(iliiilIlIiiiilIl var4 : this.iiiIIIIlll.values()) {
         var1.addAll(var4.IliiIIiIll);
         var2.addAll(var4.IiiiIIiIll);
      }

      IlIillIillIillIi var6 = new IlIillIillIillIi(this.liIlIIIlll, this.IlllIIIlll, this.IillIIIlll, var1, var2);

      for(ilIlIIilIiIlIIil var5 : var1) {
         if (Ililllililil(var5)) {
            var6.IilIIIlIIi.add(var5);
         }
      }

      for(int var8 = -this.IIilIIIlll; var8 <= this.IIilIIIlll; ++var8) {
         for(int var9 = -this.IIilIIIlll; var9 <= this.IIilIIIlll; ++var9) {
            if (this.IIlllIlliIll(this.lIilIIIlll + var8, this.iIilIIIlll + var9)) {
               var6.illIIIlIIi.add(lliIIIliliIIIl.IliIlllilIi(this.lIilIIIlll + var8, this.iIilIIIlll + var9));
            }
         }
      }

      this.iIIlIIIlll = true;
      this.IIIlIIIlll.submit(() -> {
         try {
            var6.lilIIIlIIi = iiiiliIIIIii.IliIlllilIi(var6.IilIIIlIIi, ((1165878620 * -49 >>> 31 | 1165878620 * -49 << 1) << 25 | (1165878620 * -49 >>> 31 | 1165878620 * -49 << 1) >>> 7) * 125 ^ -1385472681, 1);
         } catch (Throwable var3) {
            var6.lilIIIlIIi = new ArrayList();
         }

         this.lIIlIIIlll = var6;
      });
   }

   static boolean Ililllililil(ilIlIIilIiIlIIil c) {
      if (c.IiIiIlIIil != lIlliIIiiIlliIIi.IIiilliiil && c.IiIiIlIIil != lIlliIIiiIlliIIi.lIiilliiil && c.IiIiIlIIil != lIlliIIiiIlliIIi.liiilliiil) {
         boolean var10000;
         switch (c.IlliIlIIil) {
            case 7:
            case 9:
            case 15:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 108:
               var10000 = true;
               break;
            default:
               var10000 = false;
         }

         return var10000;
      } else {
         return true;
      }
   }

   private boolean IIlllIlliIll(int cz, int cx) {
      for(int var3 = -1; var3 <= 1; ++var3) {
         for(int var4 = -1; var4 <= 1; ++var4) {
            if (!this.iliIIIIlll.IIIllIIliIIl(lliIIIliliIIIl.IliIlllilIi(cz + var3, cx + var4)) || this.llllIIIlll.method_2935().method_21730(cz + var3, cx + var4) == null) {
               return false;
            }
         }
      }

      return true;
   }

   // $FF: synthetic method
   private static CallSite iiIIlIIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] ^ '蒯') ^ var5))) + var5))) - var5) - var5) << 12 | (char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] ^ '蒯') ^ var5))) + var5))) - var5) - var5) >>> 4) - 25657) - var5)) + var5))) - var5) << 9 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] ^ '蒯') ^ var5))) + var5))) - var5) - var5) << 12 | (char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] ^ '蒯') ^ var5))) + var5))) - var5) - var5) >>> 4) - 25657) - var5)) + var5))) - var5) >>> 7))) << 1 | (char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] ^ '蒯') ^ var5))) + var5))) - var5) - var5) << 12 | (char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] ^ '蒯') ^ var5))) + var5))) - var5) - var5) >>> 4) - 25657) - var5)) + var5))) - var5) << 9 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] ^ '蒯') ^ var5))) + var5))) - var5) - var5) << 12 | (char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] ^ '蒯') ^ var5))) + var5))) - var5) - var5) >>> 4) - 25657) - var5)) + var5))) - var5) >>> 7))) >>> 15) ^ 'ꨈ') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void Illlllllilll(IlIillIillIillIi sensitivity, int job) {
      LinkedHashMap var3 = new LinkedHashMap();
      HashSet var4 = new HashSet(sensitivity.illIIIlIIi);

      for(lIiiIIIiiIiiIIIi var6 : sensitivity.lilIIIlIIi) {
         if (var6.IIIllIIliIIl().size() >= 2) {
            if (!sensitivity.illIIIlIIi.containsAll(var6.iIIIlIlIIl())) {
               for(int var14 = var6.IiIIlliIIl() >> 4; var14 <= var6.iiIIlIIlIl() >> 4; ++var14) {
                  for(int var15 = var6.illIlIilIl() >> 4; var15 <= var6.lilIliilIl() >> 4; ++var15) {
                     var4.remove(lliIIIliliIIIl.IliIlllilIi(var14, var15));
                  }
               }
            } else if (IiliilIlliliilIl.liiiIIllIl(var6.IIIllIIliIIl(), this::Iiilliiliiil, job, IIllillIllil.lilIIiliiilIIili, sensitivity.lIlIIIlIIi).IliIlllilIi() > 0 && (!this.llIlIIIlll || sensitivity.lIlIIIlIIi != 0 || this.IIIilIIiiIIi(var6))) {
               iliIiiiIiiIiii var7 = this.IiIiliIiiiIi(var6, sensitivity);
               Illiilllllliilll var8 = iiIliiIiIIlliiIi.IliIlllilIi(var7);
               IIllillIllil var9 = !var8.iillIllill && !var8.iiIlIllill ? (!Illillliilli(var6, var8) && !IIiilIiiiIii(var8) && !Iilililiiili(var6, var7) ? IIllillIllil.lilIIiliiilIIili : IIllillIllil.IIiIIililIiIIili) : IIllillIllil.iIiIIiliIliIIili;
               lilIiIIliilIiIIl var10 = IiliilIlliliilIl.liiiIIllIl(var6.IIIllIIliIIl(), this::Iiilliiliiil, job, var9, sensitivity.lIlIIIlIIi);
               if (var10.IliIlllilIi() > 0 && (sensitivity.lIlIIIlIIi != 0 || !this.Iilllilliill(var6))) {
                  double[] var11 = IIlilIliiIli(var6);
                  String var12 = IiIIlliIIl<invokedynamic>() + var6.IlIllllIll();

                  for(int var13 = 2; var3.containsKey(var12); ++var13) {
                     var12 = IiIIlliIIl<invokedynamic>() + var6.IlIllllIll() + IiIIlliIIl<invokedynamic>() + var13;
                  }

                  var3.put(var12, new IllllIIllllllIIl(lIilllliIillll.iIlliiiilIllliiiil, (int)Math.round(var11[0]), (int)Math.round(var11[1]), (int)Math.round(var11[2]), var12, var10.IliIlllilIi(), var10.iIlIlllllill()));
               }
            }
         }
      }

      this.illlIIIlll.IlIlllIlilIl(new ArrayList(var3.values()), var4, this.IillIIIlll);
   }

   public int iIlIlllllill() {
      return this.iiiIIIIlll.size();
   }

   static boolean Iilililiiili(lIiiIIIiiIiiIIIi e, iliIiiiIiiIiii sc) {
      long var4 = -3122698402311165094L;
      var4 ^= ((long)sc.IIlllIlliIll(~-1180213583 * 15 ^ 523334422) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)(sc.IIlllIlliIll(~(~(-816140560 + 61)) ^ -816140376) + sc.IIlllIlliIll(~(-(-(1341224582 - -45))) ^ -1341224502) + sc.IIlllIlliIll((((1835599685 << 19 | 1835599685 >>> 13) + 47 ^ -43) >>> 5 | ((1835599685 << 19 | 1835599685 >>> 13) + 47 ^ -43) << 27) ^ 372155426) + sc.IIlllIlliIll((-510171213 << 15 | -510171213 >>> 17) * 5 ^ -2092846209) + sc.IIlllIlliIll(1513789937 * -15 * 87 - 5 + 27 ^ 189088263)) ^ var4) & -1L >>> 32;
      return (int)(var4 >>> 32) >= ((~-1882779341 * 119 - 97 << 7 | ~-1882779341 * 119 - 97 >>> 25) ^ 998259092) && (int)var4 == 0 && (sc.IIlllIlliIll((-375159197 >>> 23 | -375159197 << 9) * -7 + 125 ^ 245795121) > 0 || sc.IIlllIlliIll(~(-1040954775 * 991146299) ^ -1401601907) > 0) && e.IiIlliIliiIl(lIlliIIiiIlliIIi.lIiilliiil) == 0 && e.IiIlliIliiIl(lIlliIIiiIlliIIi.Iliilliiil) == 0 && e.IiIlliIliiIl(lIlliIIiiIlliIIi.IIiilliiil) <= 2 * (int)(var4 >>> 32);
   }

   // $FF: synthetic method
   private static CallSite illIlIilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '谏') - var5) ^ 9180) ^ 25050))) + var5))) + var5) >>> 15 | (char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '谏') - var5) ^ 9180) ^ 25050))) + var5))) + var5) << 1) + var5) << 13 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '谏') - var5) ^ 9180) ^ 25050))) + var5))) + var5) >>> 15 | (char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '谏') - var5) ^ 9180) ^ 25050))) + var5))) + var5) << 1) + var5) >>> 3) ^ 'ꦊ') - var5) - 24660) - 23941) + '윐'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   int Iiilliiliiil(ilIlIIilIiIlIIil c) {
      if (this.llllIIIlll == null) {
         return 0;
      } else {
         try {
            class_2680 var2 = this.llllIIIlll.method_8320(new class_2338(c.IlIiIlIIil, c.llIiIlIIil, c.ilIiIlIIil));
            if (var2.method_26204() instanceof class_2281 && var2.method_28498(class_2281.field_10770)) {
               class_2745 var3 = (class_2745)var2.method_11654(class_2281.field_10770);
               return var3 == class_2745.field_12574 ? 1 : (var3 == class_2745.field_12571 ? 2 : 0);
            } else {
               return 0;
            }
         } catch (Throwable var4) {
            return 0;
         }
      }
   }

   static int IlIillIiilIi(List<Integer> v) {
      ArrayList var1 = new ArrayList(v);
      Collections.sort(var1);
      return (Integer)var1.get(var1.size() / 2);
   }

   boolean Iilllilliill(lIiiIIIiiIiiIIIi e) {
      if (this.llllIIIlll == null) {
         return false;
      } else {
         Boolean var2 = (Boolean)this.IlilIIIlll.get(e.IlIllllIll());
         if (var2 != null) {
            return var2;
         } else {
            int var3 = e.IiIIlliIIl() - 3;
            int var4 = Math.max(this.lIllIIIlll, e.lIlIliIlIl() - 3);
            int var5 = e.illIlIilIl() - 3;
            int var6 = e.iiIIlIIlIl() + 3;
            int var7 = Math.min(this.iIllIIIlll, e.IllIllllIl() + 3);
            int var8 = e.lilIliilIl() + 3;
            int var9 = 0;
            int var10 = 0;
            class_2338.class_2339 var11 = new class_2338.class_2339();

            for(int var12 = var3; var12 <= var6 && var10 < 30000; ++var12) {
               for(int var13 = var4; var13 <= var7 && var10 < 30000; ++var13) {
                  for(int var14 = var5; var14 <= var8 && var10 < 30000; ++var14) {
                     ++var10;
                     class_2680 var15 = this.llllIIIlll.method_8320(var11.method_10103(var12, var13, var14));
                     if (var15.method_26215() || var15.method_26204() instanceof class_2404 || var15.method_27852(class_2246.field_10422)) {
                        ++var9;
                     }
                  }
               }
            }

            boolean var16 = IIillIiliIil(var9, var10);
            this.IlilIIIlll.put(e.IlIllllIll(), var16);
            return var16;
         }
      }
   }

   private static long IlIlllIlilIl(List<ilIlIIilIiIlIIil> cells, lililIIiiililIIi s) {
      long var2 = 1125899906842597L;

      for(ilIlIIilIiIlIIil var5 : cells) {
         var2 = 31L * var2 + (long)var5.IlIiIlIIil;
         var2 = 31L * var2 + (long)var5.llIiIlIIil;
         var2 = 31L * var2 + (long)var5.ilIiIlIIil;
         var2 = 31L * var2 + (long)var5.IlliIlIIil;
         var2 = 31L * var2 + (long)var5.llliIlIIil;
         var2 = 31L * var2 + (long)var5.liIiIlIIil;
      }

      var2 = 31L * var2 + (long)s.lliilIiiil;
      var2 = 31L * var2 + (long)s.IiiilIiiil.size();

      for(int var13 = 1; var13 < 148; ++var13) {
         var2 = 31L * var2 + (long)s.iliilIiiil.IIlllIlliIll(var13);
      }

      return var2;
   }

   public void IliIlllilIi() {
      this.iliIIIIlll.liiiIIllIl();
      this.iiiIIIIlll.clear();
      this.liiIIIIlll.IIlllIlliIll();
      ++this.liIlIIIlll;
      this.lIIlIIIlll = null;
      this.iIIlIIIlll = false;
      this.IlIlIIIlll = false;
      this.ilIlIIIlll = 0L;
      this.IiIlIIIlll = 0L;
      this.iiIlIIIlll = 0;
      this.lillIIIlll = 0;
      this.iillIIIlll.clear();
      this.IlilIIIlll.clear();
   }

   // $FF: synthetic method
   private static CallSite IiIIlliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5586853510037276678L ^ Long.rotateLeft(1207588037198114591L, 17) ^ 7622021230656142775L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -8371031904858498080L ^ Long.rotateLeft(-646499769904848343L, 9) ^ -7292978459408589670L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2766633048955661418L ^ Long.rotateLeft(2281335934504946435L, 36) ^ -3625946239692531362L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4101756830447117697L ^ Long.rotateLeft(5410923203182061267L, 46) ^ -7912058349118534462L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8212143883413886921L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 7205655064390319540L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8071236064540433137L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3904844646716835277L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -5373309737850222447L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4191919095984331685L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iiIIlIIlIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, lIlIliIlIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IllIllllIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, illIlIilIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(lilIliilIl<invokedynamic>());
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

   static double[] IIlilIliiIli(lIiiIIIiiIiiIIIi e) {
      double var1 = (double)0.0F;
      double var3 = (double)0.0F;
      double var5 = (double)0.0F;
      double var7 = (double)0.0F;

      for(ilIlIIilIiIlIIil var10 : e.IIIllIIliIIl()) {
         double var11 = var10.IiIiIlIIil == lIlliIIiiIlliIIi.IIiilliiil ? (double)4.0F : (double)1.0F;
         var1 += (double)var10.IlIiIlIIil * var11;
         var3 += (double)var10.llIiIlIIil * var11;
         var5 += (double)var10.ilIiIlIIil * var11;
         var7 += var11;
      }

      if (var7 <= (double)0.0F) {
         return new double[]{e.IIiIllIiIl(), e.iIiIlIliIl(), e.lliIliliIl()};
      } else {
         return new double[]{var1 / var7, var3 / var7, var5 / var7};
      }
   }

   // $FF: synthetic method
   private static CallSite IllIllllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') >>> 3 | (char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') << 13) << 8 | (char)((char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') >>> 3 | (char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') << 13) >>> 8))) >>> 8 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') >>> 3 | (char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') << 13) << 8 | (char)((char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') >>> 3 | (char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') << 13) >>> 8))) << 8))) ^ '\ueb0e') >>> 9 | (char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') >>> 3 | (char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') << 13) << 8 | (char)((char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') >>> 3 | (char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') << 13) >>> 8))) >>> 8 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') >>> 3 | (char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') << 13) << 8 | (char)((char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') >>> 3 | (char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') << 13) >>> 8))) << 8))) ^ '\ueb0e') << 7) + '薤') << 10 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') >>> 3 | (char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') << 13) << 8 | (char)((char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') >>> 3 | (char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') << 13) >>> 8))) >>> 8 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') >>> 3 | (char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') << 13) << 8 | (char)((char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') >>> 3 | (char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') << 13) >>> 8))) << 8))) ^ '\ueb0e') >>> 9 | (char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') >>> 3 | (char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') << 13) << 8 | (char)((char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') >>> 3 | (char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') << 13) >>> 8))) >>> 8 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') >>> 3 | (char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') << 13) << 8 | (char)((char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') >>> 3 | (char)((char)((char)(var4[var5] - '蔊') ^ '쯂') - '빂') << 13) >>> 8))) << 8))) ^ '\ueb0e') << 7) + '薤') >>> 6) + 18274) ^ 6468));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static boolean Illillliilli(lIiiIIIiiIiiIIIi sig, Illiilllllliilll e) {
      long var3 = 4117107675026653478L;
      var3 ^= ((long)(sig.IllIllllIl() < ((1870170616 << 25 | 1870170616 >>> 7) * -619094385 + -85 ^ 887661393) ? 1 : 0) << 32 ^ var3) & -1L << 32;
      return e.IlIlIllill || e.llIlIllill || e.ilIlIllill || e.IiIlIllill || e.liIlIllill || e.iiIlIllill || e.IIllIllill || e.lIllIllill || e.iIllIllill || e.IlllIllill || e.llllIllill || e.illlIllill || e.IillIllill || e.lillIllill || e.iillIllill || e.iIilIllill || e.IlilIllill || (int)(var3 >>> 32) == 0 && (e.IIilIllill || e.lIilIllill);
   }

   public void lIiiIiIlilli(class_2338 oldState, class_2680 pos, class_2680 newState) {
      if (pos != newState) {
         int var4 = lIiliIliIiliIl.liiiIIllIl(pos);
         int var5 = lIiliIliIiliIl.liiiIIllIl(newState);
         boolean var6 = var4 == 3 || var5 == 3;
         if (var6) {
            this.liiIIIIlll.liiiIIllIl(oldState.method_10263(), oldState.method_10264(), oldState.method_10260(), var4, var5, pos, newState, System.currentTimeMillis());
         }

         if (var6 || pos.method_26213() != newState.method_26213()) {
            this.iliIIIIlll.iliIiiliiiii(oldState.method_10263() >> 4, oldState.method_10260() >> 4, 2000L);
         }

      }
   }

   public void iliIiiliiiii(class_638 undergroundOnly, int sensitivity, int radius, int nowMs, lliIIIliliIIIl b, int pcz, boolean pcx, long w) {
      this.llllIIIlll = undergroundOnly;
      this.illlIIIlll = b;
      this.IillIIIlll = w;
      this.lIllIIIlll = undergroundOnly.method_31607();
      this.iIllIIIlll = undergroundOnly.method_31600();
      this.IlllIIIlll = iiIiiIlIIliiIl.IliIlllilIi(undergroundOnly);
      this.IIilIIIlll = nowMs;
      this.lIilIIIlll = sensitivity;
      this.iIilIIIlll = radius;
      if (this.llIlIIIlll != pcx || this.IIllIIIlll != pcz) {
         this.llIlIIIlll = pcx;
         this.IIllIIIlll = pcz;
         this.IlIlIIIlll = true;
      }

      this.iliIIIIlll.IIlllIlliIll(undergroundOnly, sensitivity, radius, nowMs, 45000L, iIIlIIIiIlIlIIIi.IliIlllilIi(700), this::IIIllIIliIIl);
      if (++this.iiIlIIIlll % 10 == 0) {
         int var10 = nowMs + 4;
         this.iiiIIIIlll.keySet().removeIf((maxDist) -> {
            int var4 = (int)(maxDist & 4294967295L);
            int var5 = (int)(maxDist >> 32);
            return Math.abs(var4 - sensitivity) > var10 || Math.abs(var5 - radius) > var10;
         });
         this.iliIIIIlll.IiIlliIliiIl(sensitivity, radius, var10);
         if (this.iiIlIIIlll % 600 == 0) {
            this.liiIIIIlll.IlIlllIlilIl(w, sensitivity, radius, nowMs + 24);
         }

         IlIillIillIillIi var11 = this.lIIlIIIlll;
         if (var11 != null) {
            this.lIIlIIIlll = null;
            this.iIIlIIIlll = false;
            if (var11.IIlIIIlIIi == this.liIlIIIlll && var11.lilIIIlIIi != null) {
               this.Illlllllilll(var11, pcz);
               this.IiIlIIIlll = var11.iIlIIIlIIi;
            }
         }

         if (w - this.ilIlIIIlll >= 20000L) {
            this.IlIlIIIlll = true;
         }

         if (this.IlIlIIIlll && !this.iIIlIIIlll && w - this.ilIlIIIlll >= 2000L) {
            this.IlIlIIIlll = false;
            this.ilIlIIIlll = w;
            this.IiIlliIliiIl();
         }

      }
   }

   public void Iiiiliiiiiii() {
      this.IIIlIIIlll.shutdownNow();
   }

   public int liiiIIllIl() {
      return this.lillIIIlll;
   }

   boolean IIIilIIiiIIi(lIiiIIIiiIiiIIIi e) {
      if (this.llllIIIlll == null) {
         return true;
      } else {
         ArrayList var2 = new ArrayList();
         ArrayList var3 = new ArrayList();

         for(ilIlIIilIiIlIIil var5 : e.IIIllIIliIIl()) {
            if (var5.IiIiIlIIil == lIlliIIiiIlliIIi.IIiilliiil || var5.IiIiIlIIil == lIlliIIiiIlliIIi.lIiilliiil || var5.IiIiIlIIil == lIlliIIiiIlliIIi.liiilliiil) {
               int var6 = this.llllIIIlll.method_8624(class_2903.field_13203, var5.IlIiIlIIil, var5.ilIiIlIIil);
               if (var6 <= this.lIllIIIlll) {
                  var6 = this.llllIIIlll.method_8624(class_2903.field_13197, var5.IlIiIlIIil, var5.ilIiIlIIil);
               }

               var2.add(var5.llIiIlIIil);
               var3.add(var6 - var5.llIiIlIIil);
            }
         }

         if (var2.isEmpty()) {
            return false;
         } else {
            return IlIillIiilIi(var2) <= 0 && IlIillIiilIi(var3) >= 4;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite lIlIliIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - 18368) ^ var5) >>> 1 | (char)((char)((char)(var4[var5] + var5) - 18368) ^ var5) << 15) + 26333) - 875) + var5) - 26303) + var5) ^ var5) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - 18368) ^ var5) >>> 1 | (char)((char)((char)(var4[var5] + var5) - 18368) ^ var5) << 15) + 26333) - 875) + var5) - 26303) + var5) ^ var5) << 2) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private iliIiiiIiiIiii IiIiliIiiiIi(lIiiIIIiiIiiIIIi job, IlIillIillIillIi e) {
      int var3 = job.IiIIlliIIl() - 8;
      int var4 = job.lIlIliIlIl() - 8;
      int var5 = job.illIlIilIl() - 8;
      int var6 = job.iiIIlIIlIl() + 8;
      int var7 = job.IllIllllIl() + 8;
      int var8 = job.lilIliilIl() + 8;
      ArrayList var9 = new ArrayList();
      int var10 = 0;

      for(int var11 = var3 >> 4; var11 <= var6 >> 4; ++var11) {
         for(int var12 = var5 >> 4; var12 <= var8 >> 4; ++var12) {
            iliiilIlIiiiilIl var13 = (iliiilIlIiiiilIl)this.iiiIIIIlll.get(lliIIIliliIIIl.IliIlllilIi(var11, var12));
            if (var13 != null) {
               for(ilIlIIilIiIlIIil var15 : var13.IliiIIiIll) {
                  if (var15.IlIiIlIIil >= var3 && var15.IlIiIlIIil <= var6 && var15.llIiIlIIil >= var4 && var15.llIiIlIIil <= var7 && var15.ilIiIlIIil >= var5 && var15.ilIiIlIIil <= var8) {
                     var9.add(var15);
                  }
               }

               var10 += var13.lliiIIiIll;
            }
         }
      }

      iliIiiiIiiIiii var16 = iliIiiiIiiIiii.IliIlllilIi(var9, e.lIlIIIlIIi);

      for(int var17 = var3 >> 4; var17 <= var6 >> 4; ++var17) {
         for(int var19 = var5 >> 4; var19 <= var8 >> 4; ++var19) {
            iliiilIlIiiiilIl var21 = (iliiilIlIiiiilIl)this.iiiIIIIlll.get(lliIIIliliIIIl.IliIlllilIi(var17, var19));
            if (var21 != null) {
               var16.iIlIlllllill(var21.iliiIIiIll);
            }
         }
      }

      job.iIlIlllllill(var10);

      for(iiliIiIiIIiiIiIi var20 : e.lllIIIlIIi) {
         if (var20.iliIiiliiiii(job.IiIIlliIIl(), job.lIlIliIlIl(), job.illIlIilIl(), job.iiIIlIIlIl(), job.IllIllllIl(), job.lilIliilIl())) {
            var16.IilliliilIIi(var20.ilIliIiIIi);
         } else if (var20.IilliliilIIi(job.IiIIlliIIl(), job.lIlIliIlIl(), job.illIlIilIl(), job.iiIIlIIlIl(), job.IllIllllIl(), job.lilIliilIl())) {
            var16.IlIlllIlilIl(var20.ilIliIiIIi);
         }
      }

      this.Iliilliiilii(job, var16);
      return var16;
   }

   public boolean IilliliilIIi(long ms) {
      return !this.IlIlIIIlll && !this.iIIlIIIlll || this.IiIlIIIlll >= ms;
   }

   static boolean IIillIiliIil(int volume, int open) {
      return open > 0 && (double)volume > Double.longBitsToDouble(1440740493087374931L ^ 3178902432164695392L) * (double)open;
   }

   // $FF: synthetic method
   private static CallSite lilIliilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) - var5) + var5) ^ var5) - 8235) + 18156) - var5) ^ var5) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) - var5) + var5) ^ var5) - 8235) + 18156) - var5) ^ var5) << 14) ^ var5)) - var5)) - 295) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) - var5) + var5) ^ var5) - 8235) + 18156) - var5) ^ var5) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) - var5) + var5) ^ var5) - 8235) + 18156) - var5) ^ var5) << 14) ^ var5)) - var5)) - 295) << 13));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void IIIllIIliIIl(class_2818 key, long chunk) {
      try {
         lililIIiiililIIi var4 = iiIiiIlIIliiIl.lIiiIiIlilli(key, this.llllIIIlll, this.IiiIIIIlll, this.lIllIIIlll, this.iIllIIIlll, this.liiIIIIlll.iliIiiliiiii(chunk), false, 0L, 0L);
         ArrayList var5 = new ArrayList(var4.IliilIiiil.size());

         for(ilIlIIilIiIlIIil var7 : var4.IliilIiiil) {
            if (var7.IlliIlIIil != 146 && var7.IiIiIlIIil != lIlliIIiiIlliIIi.IIIIiliiil && (!var4.liIIiIiiil || var7.iIliIlIIil != 0 || !var7.iliIiiliiiii(64))) {
               var5.add(var7);
            }
         }

         for(lIIIIlIliIIIIlIl var13 : var4.IIlIiIiiil) {
            this.liiIIIIlll.IIIllIIliIIl(var13.llIIIiilIl, var13.ilIIIiilIl, var13.IiIIIiilIl, (Object)null, this.IillIIIlll);
         }

         for(lIIIIlIliIIIIlIl var14 : var4.iiIIiIiiil) {
            this.liiIIIIlll.lIiiIiIlilli(var14.llIIIiilIl, var14.ilIIIiilIl, var14.IiIIIiilIl);
         }

         if (var5.isEmpty() && var4.lliilIiiil == 0 && !var4.iliilIiiil.IiIiliIiiiIi()) {
            if (this.iiiIIIIlll.remove(chunk) != null) {
               this.IlIlIIIlll = true;
            }
         } else {
            long var12 = IlIlllIlilIl(var5, var4);
            iliiilIlIiiiilIl var8 = (iliiilIlIiiiilIl)this.iiiIIIIlll.put(chunk, new iliiilIlIiiiilIl(var5, var4.liIIiIiiil ? 0 : var4.lliilIiiil, var4.iliilIiiil, var4.IiiilIiiil, var12));
            if (var8 == null || var8.liiiIIiIll != var12) {
               this.IlIlIIIlll = true;
            }
         }

         if (this.iillIIIlll.size() >= 65536) {
            this.iillIIIlll.clear();
         }

         if (this.iillIIIlll.add(chunk)) {
            ++this.lillIIIlll;
         }
      } catch (Throwable var9) {
      }

   }
}
