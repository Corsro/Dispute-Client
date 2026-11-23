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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class iliilIIlIiiilIIl {
   public static final List<String> IIiIIIilIl = List.of(IiIiliIiiiIi<invokedynamic>(), IiIiliIiiiIi<invokedynamic>(), IiIiliIiiiIi<invokedynamic>());
   public static final List<String> lilIIIilIl = List.of(IiIiliIiiiIi<invokedynamic>(), IiIiliIiiiIi<invokedynamic>(), IiIiliIiiiIi<invokedynamic>(), IiIiliIiiiIi<invokedynamic>(), IiIiliIiiiIi<invokedynamic>());
   private final EnumMap<lIlIIliIlIIl, LinkedHashMap<String, LinkedHashMap<String, double[]>>> iIiIIIilIl;
   public static final List<String> iilIIIilIl = List.of(IiIiliIiiiIi<invokedynamic>(), IiIiliIiiiIi<invokedynamic>(), IiIiliIiiiIi<invokedynamic>());
   private final Random lIiIIIilIl;

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 8174021516569581917L ^ Long.rotateLeft(-6981782174696465979L, 47) ^ -8359352082310238609L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -3451641848383723819L ^ Long.rotateLeft(-8758030235992659257L, 37) ^ -5483715983501605136L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 4135026376331460057L ^ Long.rotateLeft(-2557744091205596895L, 43) ^ 2325903686913050825L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3486818476848953514L ^ Long.rotateLeft(-5291352615273842328L, 55) ^ 8530816512409514094L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -6387387254823176000L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 8177934126186612220L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -538739125747298252L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3659168023761648670L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 8466517451777495991L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4583357014662211780L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIiilIiiiIii<invokedynamic>());
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

   public void IiIlliIliiIl(Map<String, Map<String, IillIIillillIIil>> state) {
      long var18 = 3983245477363675529L;
      this.IIlllIlliIll();
      if (state != null) {
         for(Map.Entry var3 : state.entrySet()) {
            String var4 = (String)var3.getKey();
            if (var4 != null && var3.getValue() != null) {
               var18 ^= ((long)var4.indexOf(124) << 32 ^ var18) & -1L << 32;
               if ((int)(var18 >>> 32) >= 0) {
                  lIlIIliIlIIl var6 = Illlllllilll(var4.substring(0, (int)(var18 >>> 32)));
                  String var7 = var4.substring((int)(var18 >>> 32) + 1);
                  if (var6 != null && IilliliilIIi(var7)) {
                     List var8 = IliIlllilIi(var6);
                     LinkedHashMap var9 = new LinkedHashMap();

                     for(Map.Entry var11 : ((Map)var3.getValue()).entrySet()) {
                        String var12 = (String)var11.getKey();
                        IillIIillillIIil var13 = (IillIIillillIIil)var11.getValue();
                        if (var12 != null && var13 != null && var8.contains(var12) && var9.size() < 8) {
                           double var14 = Double.isNaN(var13.IliIlllilIi()) ? (double)0.0F : IiIIIlliIIIl.IIiilIiiiIii(var13.IliIlllilIi(), (double)0.0F, (double)1000000.0F);
                           double var16 = IiIIIlliIIIl.Iliilliiilii(var13.liiiIIllIl(), (double)-1.0F, (double)1.0F, liiiIIllIl(var6, var12));
                           var9.put(var12, new double[]{var14, var16});
                        }
                     }

                     if (!var9.isEmpty()) {
                        LinkedHashMap var20 = (LinkedHashMap)this.iIiIIIilIl.get(var6);
                        var20.remove(var7);
                        var20.put(var7, var9);
                        IIillIiliIil(var20);
                     }
                  }
               }
            }
         }

      }
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) - '赕') + 21105) << 5 | (char)((char)((char)(~var4[var5]) - '赕') + 21105) >>> 11))) + var5) + var5) - 12198) >>> 13 | (char)((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) - '赕') + 21105) << 5 | (char)((char)((char)(~var4[var5]) - '赕') + 21105) >>> 11))) + var5) + var5) - 12198) << 3) + var5))) + '\uf85f') >>> 2 | (char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) - '赕') + 21105) << 5 | (char)((char)((char)(~var4[var5]) - '赕') + 21105) >>> 11))) + var5) + var5) - 12198) >>> 13 | (char)((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) - '赕') + 21105) << 5 | (char)((char)((char)(~var4[var5]) - '赕') + 21105) >>> 11))) + var5) + var5) - 12198) << 3) + var5))) + '\uf85f') << 14) << 1 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) - '赕') + 21105) << 5 | (char)((char)((char)(~var4[var5]) - '赕') + 21105) >>> 11))) + var5) + var5) - 12198) >>> 13 | (char)((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) - '赕') + 21105) << 5 | (char)((char)((char)(~var4[var5]) - '赕') + 21105) >>> 11))) + var5) + var5) - 12198) << 3) + var5))) + '\uf85f') >>> 2 | (char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) - '赕') + 21105) << 5 | (char)((char)((char)(~var4[var5]) - '赕') + 21105) >>> 11))) + var5) + var5) - 12198) >>> 13 | (char)((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) - '赕') + 21105) << 5 | (char)((char)((char)(~var4[var5]) - '赕') + 21105) >>> 11))) + var5) + var5) - 12198) << 3) + var5))) + '\uf85f') << 14) >>> 15) + 26119));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static boolean IlIillIiilIi(char c) {
      return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || c == '_' || c == '.' || c == '|' || c == '-';
   }

   private static double IIIilIIiiIIi(Map<String, Double> values, String arm) {
      Double var2 = values == null ? null : (Double)values.get(arm);
      if (var2 == null) {
         return (double)0.0F;
      } else if (Double.isNaN(var2)) {
         return Double.NEGATIVE_INFINITY;
      } else {
         return var2 == Double.POSITIVE_INFINITY ? Double.MAX_VALUE : var2;
      }
   }

   public void IIlllIlliIll() {
      for(LinkedHashMap var2 : this.iIiIIIilIl.values()) {
         var2.clear();
      }

   }

   private static double Iiilliiliiil(Map<String, double[]> stored) {
      if (stored == null) {
         return (double)0.0F;
      } else {
         double var1 = (double)0.0F;

         for(double[] var4 : stored.values()) {
            var1 += var4[0];
         }

         return var1;
      }
   }

   public static List<String> IliIlllilIi(lIlIIliIlIIl f) {
      if (f == null) {
         return List.of();
      } else {
         List var10000;
         switch (f.ordinal()) {
            case 0 -> var10000 = lilIIIilIl;
            case 1 -> var10000 = iilIIIilIl;
            case 2 -> var10000 = IIiIIIilIl;
            default -> throw new MatchException((String)null, (Throwable)null);
         }

         return var10000;
      }
   }

   public iliilIIlIiiilIIl(Random rnd) {
      long var6 = 1350994941914597081L;
      super();
      this.iIiIIIilIl = new EnumMap(lIlIIliIlIIl.class);
      this.lIiIIIilIl = rnd == null ? new Random() : rnd;
      lIlIIliIlIIl[] var2 = lIlIIliIlIIl.values();
      var6 ^= ((long)var2.length << 32 ^ var6) & -1L << 32;

      for(long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
         lIlIIliIlIIl var5 = var2[(int)var9];
         this.iIiIIIilIl.put(var5, new LinkedHashMap(32, 0.75F, true));
      }

   }

   public static String iIlIlllllill(String context) {
      long var5 = -4603232161225094067L;
      long var7 = 4027092235561120598L;
      if (context == null) {
         return "";
      } else {
         var5 ^= ((long)Math.min(context.length(), 48) << 32 ^ var5) & -1L << 32;
         StringBuilder var2 = new StringBuilder((int)(var5 >>> 32));

         for(long var10 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var10 < (int)(var10 >>> 32); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
            var7 ^= ((long)context.charAt((int)var10) << 32 ^ var7) & -1L << 32;
            var2.append((char)(IlIillIiilIi((char)((int)(var7 >>> 32))) ? (int)(var7 >>> 32) : '_'));
         }

         return var2.toString();
      }
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15) + 2583) + 12854) << 1 | (char)((char)((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15) + 2583) + 12854) >>> 15) + 22626))) ^ '髲'))) - 19769));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public Map<String, Map<String, IillIIillillIIil>> IlIlllIlilIl() {
      long var11 = 489539144159274864L;
      LinkedHashMap var1 = new LinkedHashMap();
      lIlIIliIlIIl[] var2 = lIlIIliIlIIl.values();
      var11 ^= ((long)var2.length << 32 ^ var11) & -1L << 32;

      for(long var14 = var11 ^ (0L ^ var11) & -1L >>> 32; (int)var14 < (int)(var14 >>> 32); var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32) {
         lIlIIliIlIIl var5 = var2[(int)var14];

         for(Map.Entry var7 : ((LinkedHashMap)this.iIiIIIilIl.get(var5)).entrySet()) {
            LinkedHashMap var8 = new LinkedHashMap();

            for(Map.Entry var10 : ((LinkedHashMap)var7.getValue()).entrySet()) {
               var8.put((String)var10.getKey(), new IillIIillillIIil(((double[])var10.getValue())[0], ((double[])var10.getValue())[1]));
            }

            var1.put(var5.name() + IiIiliIiiiIi<invokedynamic>() + (String)var7.getKey(), var8);
         }
      }

      return var1;
   }

   public static boolean IilliliilIIi(String context) {
      long var2 = 3150966683183192584L;
      if (context != null && context.length() <= 48) {
         for(long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < context.length(); var4 += 4294967296L) {
            if (!IlIillIiilIi(context.charAt((int)(var4 >>> 32)))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static lIlIIliIlIIl Illlllllilll(String name) {
      long var5 = -4819721973620057520L;
      if (name == null) {
         return null;
      } else {
         lIlIIliIlIIl[] var1 = lIlIIliIlIIl.values();
         var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

         for(long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
            lIlIIliIlIIl var4 = var1[(int)var8];
            if (var4.name().equals(name)) {
               return var4;
            }
         }

         return null;
      }
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(~((char)((char)((char)(-((char)((char)(~((char)((char)((char)(var4[var5] ^ '꼃') ^ '饷') - 226))) >>> 4 | (char)(~((char)((char)((char)(var4[var5] ^ '꼃') ^ '饷') - 226))) << 12))) - var5) + var5))) ^ '虩'))) << 8 | (char)(-((char)((char)(~((char)((char)((char)(-((char)((char)(~((char)((char)((char)(var4[var5] ^ '꼃') ^ '饷') - 226))) >>> 4 | (char)(~((char)((char)((char)(var4[var5] ^ '꼃') ^ '饷') - 226))) << 12))) - var5) + var5))) ^ '虩'))) >>> 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - 17981) - var5) - var5) ^ var5) - '팯'))) - var5) << 13 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - 17981) - var5) - var5) ^ var5) - '팯'))) - var5) >>> 3) ^ 20685) - '駧') - '肵') ^ var5))) + var5) >>> 5 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - 17981) - var5) - var5) ^ var5) - '팯'))) - var5) << 13 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - 17981) - var5) - var5) ^ var5) - '팯'))) - var5) >>> 3) ^ 20685) - '駧') - '肵') ^ var5))) + var5) << 11) << 14 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - 17981) - var5) - var5) ^ var5) - '팯'))) - var5) << 13 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - 17981) - var5) - var5) ^ var5) - '팯'))) - var5) >>> 3) ^ 20685) - '駧') - '肵') ^ var5))) + var5) >>> 5 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - 17981) - var5) - var5) ^ var5) - '팯'))) - var5) << 13 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - 17981) - var5) - var5) ^ var5) - '팯'))) - var5) >>> 3) ^ 20685) - '駧') - '肵') ^ var5))) + var5) << 11) >>> 2) - 15351))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void Ililllililil(LinkedHashMap<String, double[]> m) {
      String var1 = null;
      double var2 = Double.POSITIVE_INFINITY;

      for(Map.Entry var5 : m.entrySet()) {
         if (((double[])var5.getValue())[0] < var2) {
            var2 = ((double[])var5.getValue())[0];
            var1 = (String)var5.getKey();
         }
      }

      if (var1 == null) {
         m.clear();
      } else {
         m.remove(var1);
      }

   }

   private static void IIillIiliIil(LinkedHashMap<String, LinkedHashMap<String, double[]>> fam) {
      Iterator var1 = fam.keySet().iterator();

      while(fam.size() > 16 && var1.hasNext()) {
         var1.next();
         var1.remove();
      }

   }

   public static double liiiIIllIl(lIlIIliIlIIl arm, String f) {
      long var4 = -529764793763448843L;
      if (arm == lIlIIliIlIIl.IlIIIIllllIIIIll && f != null) {
         var4 ^= (-4294967296L ^ var4) & -1L << 32;
         switch (f.hashCode()) {
            case -1705242105:
               if (f.equals(IiIiliIiiiIi<invokedynamic>())) {
                  var4 ^= (4294967296L ^ var4) & -1L << 32;
               }
               break;
            case -1439578270:
               if (f.equals(IiIiliIiiiIi<invokedynamic>())) {
                  var4 ^= (0L ^ var4) & -1L << 32;
               }
               break;
            case -587546152:
               if (f.equals(IiIiliIiiiIi<invokedynamic>())) {
                  var4 ^= (17179869184L ^ var4) & -1L << 32;
               }
               break;
            case 1092288764:
               if (f.equals(IiIiliIiiiIi<invokedynamic>())) {
                  var4 ^= (12884901888L ^ var4) & -1L << 32;
               }
               break;
            case 1740920704:
               if (f.equals(IiIiliIiiiIi<invokedynamic>())) {
                  var4 ^= (8589934592L ^ var4) & -1L << 32;
               }
         }

         double var10000;
         switch ((int)(var4 >>> 32)) {
            case 0:
               var10000 = 0.3;
               break;
            case 1:
            case 2:
               var10000 = (double)0.25F;
               break;
            case 3:
               var10000 = 0.2;
               break;
            case 4:
               var10000 = 0.15;
               break;
            default:
               var10000 = (double)0.0F;
         }

         return var10000;
      } else {
         return arm == lIlIIliIlIIl.liIIIIlliiIIIIll && IiIiliIiiiIi<invokedynamic>().equals(f) ? 0.1 : (double)0.0F;
      }
   }

   public IillIIillillIIil IIIllIIliIIl(lIlIIliIlIIl f, String context, String name) {
      if (f == null) {
         return new IillIIillillIIil((double)0.0F, (double)0.0F);
      } else {
         LinkedHashMap var4 = (LinkedHashMap)((LinkedHashMap)this.iIiIIIilIl.get(f)).get(iIlIlllllill(context));
         double[] var5 = var4 == null ? null : (double[])var4.get(name);
         return var5 == null ? new IillIIillillIIil((double)0.0F, liiiIIllIl(f, name)) : new IillIIillillIIil(var5[0], var5[1]);
      }
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 6 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 10) + var5) >>> 7 | (char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 6 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 10) + var5) << 9) + var5) ^ 32751) ^ var5) ^ var5) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 6 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 10) + var5) >>> 7 | (char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 6 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 10) + var5) << 9) + var5) ^ 32751) ^ var5) ^ var5) >>> 8) ^ var5) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 6 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 10) + var5) >>> 7 | (char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 6 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 10) + var5) << 9) + var5) ^ 32751) ^ var5) ^ var5) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 6 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 10) + var5) >>> 7 | (char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 6 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 10) + var5) << 9) + var5) ^ 32751) ^ var5) ^ var5) >>> 8) ^ var5) << 8) + 'ﳣ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private LinkedHashMap<String, double[]> Iilllilliill(lIlIIliIlIIl f, String key) {
      LinkedHashMap var3 = (LinkedHashMap)this.iIiIIIilIl.get(f);
      LinkedHashMap var4 = (LinkedHashMap)var3.get(key);
      if (var4 == null) {
         var4 = new LinkedHashMap();
         var3.put(key, var4);
         IIillIiliIil(var3);
      }

      return var4;
   }

   public void iliIiiliiiii(lIlIIliIlIIl arm, String context, String reward, double f) {
      if (arm != null && reward != null && IliIlllilIi(arm).contains(reward)) {
         double var6 = Double.isNaN(f) ? (double)0.0F : IiIIIlliIIIl.IIiilIiiiIii(f, (double)-1.0F, (double)1.0F);
         LinkedHashMap var8 = this.Iilllilliill(arm, iIlIlllllill(context));

         for(double[] var10 : var8.values()) {
            var10[0] *= 0.97;
         }

         double[] var11 = (double[])var8.get(reward);
         if (var11 == null) {
            while(var8.size() >= 8) {
               Ililllililil(var8);
            }

            var11 = new double[]{(double)0.0F, liiiIIllIl(arm, reward)};
            var8.put(reward, var11);
         }

         var11[0] = Math.min((double)1000000.0F, var11[0] + (double)1.0F);
         var11[1] = IiIIIlliIIIl.IIiilIiiiIii(var11[1] + (var6 - var11[1]) / (var11[0] + (double)2.0F), (double)-1.0F, (double)1.0F);
      }
   }

   public String lIiiIiIlilli(lIlIIliIlIIl f, String context, List<String> explore, Map<String, Double> plannerValue, boolean eligible) {
      long var34 = 6795894182834428525L;
      long var36 = 2440255322282486509L;
      if (f != null && explore != null && !explore.isEmpty()) {
         List var6 = IliIlllilIi(f);
         ArrayList var7 = new ArrayList();
         ArrayList var8 = new ArrayList();

         for(String var10 : explore) {
            if (var10 != null && var6.contains(var10) && !var7.contains(var10)) {
               var7.add(var10);
               var8.add(IIIilIIiiIIi(plannerValue, var10));
            }
         }

         if (var7.isEmpty()) {
            return null;
         } else {
            double var38 = Double.NEGATIVE_INFINITY;

            for(double var12 : var8) {
               var38 = Math.max(var38, var12);
            }

            ArrayList var39 = new ArrayList();
            ArrayList var40 = new ArrayList();

            for(var34 ^= (0L ^ var34) & -1L << 32; (int)(var34 >>> 32) < var7.size(); var34 += 4294967296L) {
               double var14 = (Double)var8.get((int)(var34 >>> 32));
               var34 ^= ((long)(var38 > (double)0.0F ? (var14 >= 0.85 * var38 ? 1 : 0) : (var14 >= var38 - (double)0.5F ? 1 : 0)) ^ var34) & -1L >>> 32;
               if ((int)var34 != 0) {
                  var39.add((String)var7.get((int)(var34 >>> 32)));
                  var40.add(var14);
               }
            }

            if (var39.size() == 1) {
               return (String)var39.get(0);
            } else {
               LinkedHashMap var13 = (LinkedHashMap)((LinkedHashMap)this.iIiIIIilIl.get(f)).get(iIlIlllllill(context));
               double var41 = Iiilliiliiil(var13);
               if (eligible) {
                  double var16 = Math.max(0.05, (double)3.0F / ((double)20.0F + var41));
                  if (this.lIiIIIilIl.nextDouble() < var16) {
                     return (String)var39.get(this.lIiIIIilIl.nextInt(var39.size()));
                  }
               }

               double var42 = Math.log((double)1.0F + var41);
               String var18 = null;
               double var19 = Double.NEGATIVE_INFINITY;
               double var21 = Double.NEGATIVE_INFINITY;

               for(long var45 = var36 ^ (0L ^ var36) & -1L << 32; (int)(var45 >>> 32) < var39.size(); var45 += 4294967296L) {
                  String var24 = (String)var39.get((int)(var45 >>> 32));
                  double[] var25 = var13 == null ? null : (double[])var13.get(var24);
                  double var26 = var25 == null ? (double)0.0F : var25[0];
                  double var28 = var25 == null ? liiiIIllIl(f, var24) : var25[1];
                  double var30 = IiIIIlliIIIl.IIiilIiiiIii(var28, -0.8, (double)1.0F);
                  if (eligible) {
                     var30 += 0.4 * Math.sqrt(var42 / (var26 + (double)2.0F));
                  }

                  double var32 = (Double)var40.get((int)(var45 >>> 32));
                  if (var18 == null || var30 > var19 || var30 == var19 && var32 > var21) {
                     var18 = var24;
                     var19 = var30;
                     var21 = var32;
                  }
               }

               return var18;
            }
         }
      } else {
         return null;
      }
   }
}
