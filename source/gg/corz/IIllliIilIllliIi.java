package gg.corz;

import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IIllliIilIllliIi {
   private static final String IIIliliIIi = "PRIVATE";

   public static boolean IliIlllilIi() {
      return IIIIIllllIIIIlll.Ililllililil() != null;
   }

   private static Set<String> IIIllIIliIIl() {
      HashSet var0 = new HashSet();

      for(IlIIillllIIill var2 : lilllIiliilllIil.lIiiIiIlilli()) {
         try {
            var0.add(var2.IIIIilIIilIIIilIIi.IIIllIIliIIl());
         } catch (Exception var5) {
         }

         try {
            lIlIllIliIlIllIl var3 = IlliIilllliIil.IliIlllilIi(var2.IIIIilIIilIIIilIIi);
            if (var3 != null) {
               var0.add(var3.IIIllIIliIIl());
            }
         } catch (Exception var4) {
         }
      }

      return var0;
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2927235554269399160L ^ Long.rotateLeft(-2419254015118754051L, 23) ^ 5064967359521997068L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1823862936553602198L ^ Long.rotateLeft(1196421064331160075L, 7) ^ -2004128855578434690L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -1304633840313370272L ^ Long.rotateLeft(6029361738085287985L, 27) ^ 269234194252665953L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4812623669458879397L ^ Long.rotateLeft(3733065748881973502L, 35) ^ 7638253472294321047L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6606502821628161343L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 2960861758614279434L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7422279515380585790L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -6876587342924272259L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 2300960865800633247L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2967436441986876769L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Ililllililil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iiilliiliiil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIilIIiiIIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IlIillIiilIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIiliIiiiIi<invokedynamic>());
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
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 308) + 30790) - '\ue500') ^ 6699) ^ var5))) << 4 | (char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 308) + 30790) - '\ue500') ^ 6699) ^ var5))) >>> 12) + '頵') ^ 20966))))) >>> 15 | (char)(-((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 308) + 30790) - '\ue500') ^ 6699) ^ var5))) << 4 | (char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 308) + 30790) - '\ue500') ^ 6699) ^ var5))) >>> 12) + '頵') ^ 20966))))) << 1) ^ var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '숇'))) >>> 10 | (char)(-((char)(var4[var5] - '숇'))) << 6) + 20479) + var5) << 8 | (char)((char)((char)((char)(-((char)(var4[var5] - '숇'))) >>> 10 | (char)(-((char)(var4[var5] - '숇'))) << 6) + 20479) + var5) >>> 8) + '떁'))) + 20446) << 1 | (char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '숇'))) >>> 10 | (char)(-((char)(var4[var5] - '숇'))) << 6) + 20479) + var5) << 8 | (char)((char)((char)((char)(-((char)(var4[var5] - '숇'))) >>> 10 | (char)(-((char)(var4[var5] - '숇'))) << 6) + 20479) + var5) >>> 8) + '떁'))) + 20446) >>> 15) + var5) << 15 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '숇'))) >>> 10 | (char)(-((char)(var4[var5] - '숇'))) << 6) + 20479) + var5) << 8 | (char)((char)((char)((char)(-((char)(var4[var5] - '숇'))) >>> 10 | (char)(-((char)(var4[var5] - '숇'))) << 6) + 20479) + var5) >>> 8) + '떁'))) + 20446) << 1 | (char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '숇'))) >>> 10 | (char)(-((char)(var4[var5] - '숇'))) << 6) + 20479) + var5) << 8 | (char)((char)((char)((char)(-((char)(var4[var5] - '숇'))) >>> 10 | (char)(-((char)(var4[var5] - '숇'))) << 6) + 20479) + var5) >>> 8) + '떁'))) + 20446) >>> 15) + var5) >>> 1) ^ 31106));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static void iIlIlllllill(Consumer<Integer> onDone) {
      if (!IliIlllilIi()) {
         if (onDone != null) {
            onDone.accept(0);
         }

      } else {
         IlliIilllliIil.IIIllIIliIIl((onDonex) -> {
            if (onDonex.iiiIilIllIIIlilIll && onDonex.lIIlilIlliIIlilIll != null) {
               Set var2 = IIIllIIliIIl();
               int[] var3 = new int[]{0};
               int[] var4 = new int[]{0};
               boolean[] var5 = new boolean[]{false};

               for(lllililillilil var7 : ((Ilillillilli)onDonex.lIIlilIlliIIlilIll).ilillIlIlIiillIlIl) {
                  if (var7.lIiIilIliiIiIilIli == null || !var2.contains(var7.lIiIilIliiIiIilIli)) {
                     String var8 = lilllIiliilllIil.Iilllilliill(var7.IlIIilIlillIIilIli);
                     if (var8 == null || !lilllIiliilllIil.IlIlllIlilIl(var8)) {
                        int var10002 = var3[0]++;
                        IlliIilllliIil.iliIiiliiiii(var7.IlIIilIlillIIilIli, (String)null, (listed) -> {
                           if (listed.iiiIilIllIIIlilIll) {
                              try {
                                 lIlIllIliIlIllIl var6 = lIlIllIliIlIllIl.lIiiIiIlilli(((iIlIiillIllIiill)listed.lIIlilIlliIIlilIll).iIIliliill, (iliiIIllIiiiIIll[])null);
                                 if (var6 != null) {
                                    String var7x = lilllIiliilllIil.Illlllllilll(var6, var7.IlIIilIlillIIilIli);
                                    lIiiIiIlilli(var7x, var7.IlIIilIlillIIilIli);
                                    synchronized(var4) {
                                       int var10002 = var4[0]++;
                                    }
                                 }
                              } catch (IOException var13) {
                              }
                           }

                           synchronized(var3) {
                              int var14 = var3[0]--;
                              if (var5[0] && var3[0] == 0 && onDone != null) {
                                 onDone.accept(var4[0]);
                              }

                           }
                        });
                     }
                  }
               }

               synchronized(var3) {
                  var5[0] = true;
                  if (var3[0] == 0 && onDone != null) {
                     onDone.accept(var4[0]);
                  }

               }
            } else {
               if (onDone != null) {
                  onDone.accept(-1);
               }

            }
         });
      }
   }

   private IIllliIilIllliIi() {
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)var4[var5] ^ var5) - var5) - '豗'))) ^ var5) - '遦') - var5) >>> 2 | (char)((char)((char)((char)(-((char)((char)((char)((char)var4[var5] ^ var5) - var5) - '豗'))) ^ var5) - '遦') - var5) << 14) - var5) + 29552) >>> 13 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)var4[var5] ^ var5) - var5) - '豗'))) ^ var5) - '遦') - var5) >>> 2 | (char)((char)((char)((char)(-((char)((char)((char)((char)var4[var5] ^ var5) - var5) - '豗'))) ^ var5) - '遦') - var5) << 14) - var5) + 29552) << 3))) << 10 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)var4[var5] ^ var5) - var5) - '豗'))) ^ var5) - '遦') - var5) >>> 2 | (char)((char)((char)((char)(-((char)((char)((char)((char)var4[var5] ^ var5) - var5) - '豗'))) ^ var5) - '遦') - var5) << 14) - var5) + 29552) >>> 13 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)var4[var5] ^ var5) - var5) - '豗'))) ^ var5) - '遦') - var5) >>> 2 | (char)((char)((char)((char)(-((char)((char)((char)((char)var4[var5] ^ var5) - var5) - '豗'))) ^ var5) - '遦') - var5) << 14) - var5) + 29552) << 3))) >>> 6))) ^ '\ued64'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void lIiiIiIlilli(String slug, String id) {
      try {
         IillilIilillilIi var2 = lilllIiliilllIil.lllllillll(slug);
         if (var2.lllIillIIi == null) {
            var2.lllIillIIi = ilIIIllIiIIIll.IlIIlIIilllIIlIIil;
         }

         var2.illIillIIi = id;
         lilllIiliilllIil.iilllIIill(slug, var2);
      } catch (IOException var3) {
      }

   }

   public static void IilliliilIIi(String slug) {
      IillilIilillilIi var1 = lilllIiliilllIil.lllllillll(slug);
      if (var1.illIillIIi != null && !var1.illIillIIi.isBlank() && IliIlllilIi()) {
         IlliIilllliIil.Iilllilliill(var1.illIillIIi, (r) -> {
         });
      }

   }

   public static void liiiIIllIl(String cb, Consumer<lIlliiiIllii> slug) {
      if (!IliIlllilIi()) {
         slug.accept(lIlliiiIllii.liiiIIllIl(IIillIiliIil<invokedynamic>()));
      } else {
         IillilIilillilIi var2 = lilllIiliilllIil.lllllillll(cb);
         if (var2.illIillIIi != null && !var2.illIillIIi.isBlank()) {
            slug.accept(lIlliiiIllii.IliIlllilIi(var2.illIillIIi));
         } else {
            lIlIllIliIlIllIl var3;
            try {
               var3 = lilllIiliilllIil.iliIiiliiiii(cb);
            } catch (IOException var6) {
               slug.accept(lIlliiiIllii.liiiIIllIl(IIillIiliIil<invokedynamic>()));
               return;
            }

            if (var3 == null) {
               slug.accept(lIlliiiIllii.liiiIIllIl(IIillIiliIil<invokedynamic>()));
            } else {
               lIlIllIliIlIllIl var4 = IlliIilllliIil.IliIlllilIi(var3);
               if (var4 == null) {
                  slug.accept(lIlliiiIllii.liiiIIllIl(IIillIiliIil<invokedynamic>()));
               } else {
                  String var5 = var4.IIIllIIliIIl();
                  IlliIilllliIil.IlIlllIlilIl(var3, var3.llIiilIiIl, IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), (cbx) -> {
                     if (cbx.iiiIilIllIIIlilIll) {
                        lIiiIiIlilli(cb, ((lllililillilil)cbx.lIIlilIlliIIlilIll).IlIIilIlillIIilIli);
                        slug.accept(lIlliiiIllii.IliIlllilIi(((lllililillilil)cbx.lIIlilIlliIIlilIll).IlIIilIlillIIilIli));
                     } else if (IIillIiliIil<invokedynamic>().equals(cbx.IlIlilIllllIlilIll)) {
                        IlliIilllliIil.IIIllIIliIIl((mineRes) -> {
                           if (mineRes.iiiIilIllIIIlilIll) {
                              String var4 = iliIiiliiiii((Ilillillilli)mineRes.lIIlilIlliIIlilIll, var5);
                              if (var4 != null) {
                                 lIiiIiIlilli(cb, var4);
                                 slug.accept(lIlliiiIllii.IliIlllilIi(var4));
                                 return;
                              }
                           }

                           slug.accept(lIlliiiIllii.liiiIIllIl(IIillIiliIil<invokedynamic>()));
                        });
                     } else {
                        slug.accept(lIlliiiIllii.liiiIIllIl(cbx.ilIlilIllIiIlilIll != null ? cbx.ilIlilIllIiIlilIll : IIillIiliIil<invokedynamic>()));
                     }

                  });
               }
            }
         }
      }
   }

   private static String iliIiiliiiii(Ilillillilli listing, String sha) {
      if (listing != null && sha != null) {
         for(lllililillilil var3 : listing.ilillIlIlIiillIlIl) {
            if (sha.equalsIgnoreCase(var3.lIiIilIliiIiIilIli)) {
               return var3.IlIIilIlillIIilIli;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] - '\ue61d') << 15 | (char)(var4[var5] - '\ue61d') >>> 1) + var5))))) >>> 10 | (char)(-((char)(~((char)((char)((char)(var4[var5] - '\ue61d') << 15 | (char)(var4[var5] - '\ue61d') >>> 1) + var5))))) << 6) - 3484)) + var5) ^ var5))) >>> 12 | (char)(~((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] - '\ue61d') << 15 | (char)(var4[var5] - '\ue61d') >>> 1) + var5))))) >>> 10 | (char)(-((char)(~((char)((char)((char)(var4[var5] - '\ue61d') << 15 | (char)(var4[var5] - '\ue61d') >>> 1) + var5))))) << 6) - 3484)) + var5) ^ var5))) << 4) - var5))) ^ var5) ^ '\udf5c') + var5)) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) - var5))) - '싾') - 'ꁅ') ^ '뚁') - '\udf73') - '홱') + '꺄') ^ '\ueabe') << 5 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) - var5))) - '싾') - 'ꁅ') ^ '뚁') - '\udf73') - '홱') + '꺄') ^ '\ueabe') >>> 11))))) ^ var5) - '웝') << 7 | (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) - var5))) - '싾') - 'ꁅ') ^ '뚁') - '\udf73') - '홱') + '꺄') ^ '\ueabe') << 5 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) - var5))) - '싾') - 'ꁅ') ^ '뚁') - '\udf73') - '홱') + '꺄') ^ '\ueabe') >>> 11))))) ^ var5) - '웝') >>> 9))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
