package gg.corz;

import com.corz.client.mixins.AccessorClientConnection;
import io.netty.channel.Channel;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2535;
import net.minecraft.class_2547;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_2661;
import net.minecraft.class_2678;
import net.minecraft.class_2708;
import net.minecraft.class_2724;
import net.minecraft.class_2987;
import net.minecraft.class_634;
import net.minecraft.class_8588;

public final class iillIlllIIilIlll {
   private static final iIIIIlIlIIIl<class_2596<?>> lIIliIIill = new iIIIIlIlIIIl<class_2596<?>>(1000L);
   private static final ililliIiilli IlIliIIill = new ililliIiilli();
   private static final Object IIIliIIill = new Object();
   private static final AtomicBoolean iIIliIIill = new AtomicBoolean();
   private static class_2535 llIliIIill;

   private static boolean Ililllililil(class_2596<?> p) {
      return p instanceof class_2708 || p instanceof class_8588 || p instanceof class_2661 || p instanceof class_2678 || p instanceof class_2724;
   }

   public static void IlIlllIlilIl() {
      Iiilliiliiil(true);
   }

   private static void Iiilliiliiil(boolean all) {
      class_2535 var1;
      synchronized(IIIliIIill) {
         if (lIIliIIill.IliIlllilIi()) {
            return;
         }

         var1 = llIliIIill;
      }

      Channel var2 = IIIiillllIIiilll.IIlllIlliIll(var1);
      if (var2 != null) {
         if (all || iIIliIIill.compareAndSet(false, true)) {
            try {
               var2.eventLoop().execute(() -> {
                  if (!all) {
                     iIIliIIill.set(false);
                  }

                  List var2;
                  synchronized(IIIliIIill) {
                     if (llIliIIill != var1) {
                        return;
                     }

                     var2 = all ? lIIliIIill.IiIlliIliiIl() : lIIliIIill.IlIlllIlilIl(IIIiillllIIiilll.IliIlllilIi());
                     IIillIiliIil();
                  }

                  IIIilIIiiIIi(var1, var2);
               });
            } catch (RejectedExecutionException var4) {
               if (!all) {
                  iIIliIIill.set(false);
               }
            }

         }
      }
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5485756621599813168L ^ Long.rotateLeft(745649293086774417L, 60) ^ 3894411540062782914L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2071023336408660795L ^ Long.rotateLeft(-3085845911476247807L, 35) ^ -1315748770015241712L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 744822479989300062L ^ Long.rotateLeft(6228338490176312521L, 9) ^ 7023355008790801096L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -2767597994239653556L ^ Long.rotateLeft(-7666049512261045848L, 16) ^ -223826610343105688L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 2193474992103811977L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 3133616972581558870L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2599806345694823643L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2185889743794487805L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -5402682805964548912L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 306639858365478199L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIlilIliiIli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Illillliilli<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iilililiiili<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IIiilIiiiIii<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iliilliiilii<invokedynamic>());
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

   private static void IIIilIIiiIIi(class_2535 c, List<class_2596<?>> packets) {
      for(class_2596 var3 : packets) {
         if (!c.method_10758()) {
            return;
         }

         class_2547 var4 = c.method_10744();
         if (var4 instanceof class_634 && var4.method_52413(var3)) {
            try {
               AccessorClientConnection.corzHandlePacket(var3, var4);
            } catch (class_2987 var6) {
            } catch (RejectedExecutionException var7) {
               c.method_10747(class_2561.method_43471(IiIiliIiiiIi<invokedynamic>()));
               return;
            } catch (ClassCastException var8) {
               c.method_10747(class_2561.method_43471(IiIiliIiiiIi<invokedynamic>()));
               return;
            }
         }
      }

   }

   public static void IiIlliIliiIl() {
      synchronized(IIIliIIill) {
         Iilllilliill();
      }
   }

   public static boolean IIlllIlliIll(class_2535 p, class_2596<?> c) {
      long var18 = -3627016596555839440L;
      if (!IIIiillllIIiilll.IIIllIIliIIl(p)) {
         return false;
      } else {
         class_2547 var2 = p.method_10744();
         if (!(var2 instanceof class_634)) {
            IiIlliIliiIl();
            return false;
         } else {
            long var3 = IIIiillllIIiilll.IliIlllilIi();
            illIllilIilIllil.liiiIIllIl(c, var3);
            long var6;
            List var8;
            synchronized(IIIliIIill) {
               var6 = IlIliIIill.IliIlllilIi();
               if (llIliIIill != p) {
                  Iilllilliill();
               }

               var8 = lIIliIIill.IliIlllilIi() ? List.of() : lIIliIIill.IlIlllIlilIl(var3);
               IIillIiliIil();
            }

            IIIilIIiiIIi(p, var8);
            if (c instanceof class_2708) {
               IIIiillllIIiilll.iIIiiIlill = var3;
            }

            if (!Ililllililil(c) && !IIiIIllIiIIl.IliIlllilIi()) {
               synchronized(IIIliIIill) {
                  var18 ^= ((long)(!lIIliIIill.IliIlllilIi() ? 1 : 0) << 32 ^ var18) & -1L << 32;
               }

               ArrayList var25 = null;
               ArrayList var10 = null;

               for(ilIllIiIll var12 : llilIllililIll.IilliliilIIi()) {
                  if (var12 instanceof lIlliiIlli) {
                     lIlliiIlli var13 = (lIlliiIlli)var12;
                     if (var12.IliIlllilIi()) {
                        long var14;
                        try {
                           var14 = var13.iiiIlIIIll(c, (boolean)((int)(var18 >>> 32)), var3);
                        } catch (RuntimeException var23) {
                           continue;
                        }

                        if (var14 > var3) {
                           if (var25 == null) {
                              var25 = new ArrayList(2);
                              var10 = new ArrayList(2);
                           }

                           var25.add(var12);
                           var10.add(Math.min(var14, var3 + 1000L));
                        }
                     }
                  }
               }

               if ((int)(var18 >>> 32) == 0 && var25 == null) {
                  return false;
               } else {
                  synchronized(IIIliIIill) {
                     if (llIliIIill != p) {
                        Iilllilliill();
                     }

                     lIiIlliIiIll var26 = null;
                     if (var25 != null) {
                        for(long var29 = var18 ^ (0L ^ var18) & -1L >>> 32; (int)var29 < var25.size(); var29 ^= (var29 ^ var29 + (long)1) & -1L >>> 32) {
                           ilIllIiIll var27 = (ilIllIiIll)var25.get((int)var29);
                           long var15 = IlIliIIill.IilliliilIIi(var27, var6, (Long)var10.get((int)var29));
                           if (var15 > var3 && var27.IliIlllilIi()) {
                              if (var26 == null) {
                                 var26 = lIIliIIill.iIlIlllllill(c, var3);
                              }

                              var26.IilliliilIIi(var27, var15);
                           }
                        }
                     }

                     if (var26 == null) {
                        if (lIIliIIill.IliIlllilIi()) {
                           return false;
                        }

                        lIIliIIill.iIlIlllllill(c, var3);
                     }

                     llIliIIill = p;
                     return true;
                  }
               }
            } else {
               List var9;
               synchronized(IIIliIIill) {
                  var9 = lIIliIIill.IiIlliIliiIl();
                  IIillIiliIil();
               }

               IIIilIIiiIIi(p, var9);
               if (c instanceof class_2708 || c instanceof class_8588 || c instanceof class_2661) {
                  iiIliillIIlliill.IiIlliIliiIl();
               }

               return false;
            }
         }
      }
   }

   public static long IilliliilIIi() {
      synchronized(IIIliIIill) {
         return lIIliIIill.Ililllililil(IIIiillllIIiilll.IliIlllilIi());
      }
   }

   private static void IIillIiliIil() {
      if (lIIliIIill.IliIlllilIi()) {
         llIliIIill = null;
      }

   }

   static void Illlllllilll() {
      synchronized(IIIliIIill) {
         if (lIIliIIill.IliIlllilIi()) {
            return;
         }

         if (!IIIiillllIIiilll.IiIlliIliiIl(llIliIIill)) {
            Iilllilliill();
            return;
         }
      }

      Iiilliiliiil(false);
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) + '鷴') ^ var5) - var5) - '\uf8e6') + var5))) - var5))) - 26459) << 11 | (char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) + '鷴') ^ var5) - var5) - '\uf8e6') + var5))) - var5))) - 26459) >>> 5) + '램') ^ var5) ^ var5) << 11 | (char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) + '鷴') ^ var5) - var5) - '\uf8e6') + var5))) - var5))) - 26459) << 11 | (char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) + '鷴') ^ var5) - var5) - '\uf8e6') + var5))) - var5))) - 26459) >>> 5) + '램') ^ var5) ^ var5) >>> 5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) << 14 | (char)((char)(var4[var5] ^ var5) ^ var5) >>> 2))) ^ var5) + 15222) + '죫') ^ var5) << 12 | (char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) << 14 | (char)((char)(var4[var5] ^ var5) ^ var5) >>> 2))) ^ var5) + 15222) + '죫') ^ var5) >>> 4) + var5) - 23706) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) << 14 | (char)((char)(var4[var5] ^ var5) ^ var5) >>> 2))) ^ var5) + 15222) + '죫') ^ var5) << 12 | (char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) << 14 | (char)((char)(var4[var5] ^ var5) ^ var5) >>> 2))) ^ var5) + 15222) + '죫') ^ var5) >>> 4) + var5) - 23706) << 7));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static void lIiiIiIlilli(Object owner) {
      synchronized(IIIliIIill) {
         IlIliIIill.liiiIIllIl(owner);
         lIIliIIill.Illlllllilll(owner);
      }

      Iiilliiliiil(false);
   }

   private iillIlllIIilIlll() {
   }

   private static void Iilllilliill() {
      lIIliIIill.IIlllIlliIll();
      llIliIIill = null;
   }

   public static int iIlIlllllill() {
      synchronized(IIIliIIill) {
         return lIIliIIill.liiiIIllIl();
      }
   }

   public static boolean IliIlllilIi() {
      synchronized(IIIliIIill) {
         return !lIIliIIill.IliIlllilIi();
      }
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 21057) ^ var5) ^ '씐') << 2 | (char)((char)((char)(var4[var5] + 21057) ^ var5) ^ '씐') >>> 14) ^ var5) + var5))) ^ var5) << 8 | (char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 21057) ^ var5) ^ '씐') << 2 | (char)((char)((char)(var4[var5] + 21057) ^ var5) ^ '씐') >>> 14) ^ var5) + var5))) ^ var5) >>> 8) - 'ﴨ'))) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean liiiIIllIl(Object owner) {
      synchronized(IIIliIIill) {
         return lIIliIIill.IIillIiliIil(owner);
      }
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(-((char)((char)((char)(~((char)(var4[var5] << 7 | var4[var5] >>> 9))) + 'ꚾ') >>> 11 | (char)((char)(~((char)(var4[var5] << 7 | var4[var5] >>> 9))) + 'ꚾ') << 5))) - var5))))) << 6 | (char)(~((char)(-((char)((char)(-((char)((char)((char)(~((char)(var4[var5] << 7 | var4[var5] >>> 9))) + 'ꚾ') >>> 11 | (char)((char)(~((char)(var4[var5] << 7 | var4[var5] >>> 9))) + 'ꚾ') << 5))) - var5))))) >>> 10) << 9 | (char)((char)(~((char)(-((char)((char)(-((char)((char)((char)(~((char)(var4[var5] << 7 | var4[var5] >>> 9))) + 'ꚾ') >>> 11 | (char)((char)(~((char)(var4[var5] << 7 | var4[var5] >>> 9))) + 'ꚾ') << 5))) - var5))))) << 6 | (char)(~((char)(-((char)((char)(-((char)((char)((char)(~((char)(var4[var5] << 7 | var4[var5] >>> 9))) + 'ꚾ') >>> 11 | (char)((char)(~((char)(var4[var5] << 7 | var4[var5] >>> 9))) + 'ꚾ') << 5))) - var5))))) >>> 10) >>> 7) - var5) + 19005)) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static void iliIiiliiiii(Object latestUntilMs, long owner) {
      synchronized(IIIliIIill) {
         IlIliIIill.iIlIlllllill(latestUntilMs, owner);
         lIIliIIill.Iilllilliill(latestUntilMs, owner);
      }

      Iiilliiliiil(false);
   }

   public static void IIIllIIliIIl() {
      Iiilliiliiil(false);
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + '跞') + '齟') - var5))) ^ var5) + 'ﲸ') >>> 14 | (char)((char)((char)(-((char)((char)((char)(var4[var5] + '跞') + '齟') - var5))) ^ var5) + 'ﲸ') << 2))) >>> 11 | (char)(-((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + '跞') + '齟') - var5))) ^ var5) + 'ﲸ') >>> 14 | (char)((char)((char)(-((char)((char)((char)(var4[var5] + '跞') + '齟') - var5))) ^ var5) + 'ﲸ') << 2))) << 5) ^ 3055)));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
