package gg.corz;

import [Ljava.lang.Object;;
import com.corz.client.mixins.AccessorTranslatableTextContent;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2561;
import net.minecraft.class_2588;
import net.minecraft.class_310;
import net.minecraft.class_5250;
import net.minecraft.class_634;
import net.minecraft.class_640;
import net.minecraft.class_7417;
import net.minecraft.class_742;
import net.minecraft.class_8828;

public class liIlliIiiiIlliIi extends ilIllIiIll {
   private final iiIiiilIIliiil iIiIiliIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private final Map<String, Integer> iiiIiliIIi;
   private static final long iilIiliIIi = 500000000L;
   private static final int IIiIiliIIi = 4096;
   private final iiIiiilIIliiil IliIiliIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private int IiiIiliIIi;
   private final IIiiIIIllIiiIIIl lIiIiliIIi = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
   private long liiIiliIIi;
   public static final String lilIiliIIi = "Friend";
   public static final String IilIiliIIi = "Player";
   private volatile iiiiIlIiIIIIllIi lliIiliIIi;
   private int iliIiliIIi;

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - '﨡') << 11 | (char)((char)(-var4[var5]) - '﨡') >>> 5)) >>> 10 | (char)((char)((char)((char)(-var4[var5]) - '﨡') << 11 | (char)((char)(-var4[var5]) - '﨡') >>> 5)) << 6) << 9 | (char)((char)((char)((char)((char)(-var4[var5]) - '﨡') << 11 | (char)((char)(-var4[var5]) - '﨡') >>> 5)) >>> 10 | (char)((char)((char)((char)(-var4[var5]) - '﨡') << 11 | (char)((char)(-var4[var5]) - '﨡') >>> 5)) << 6) >>> 7) ^ var5))) + var5) >>> 6 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - '﨡') << 11 | (char)((char)(-var4[var5]) - '﨡') >>> 5)) >>> 10 | (char)((char)((char)((char)(-var4[var5]) - '﨡') << 11 | (char)((char)(-var4[var5]) - '﨡') >>> 5)) << 6) << 9 | (char)((char)((char)((char)((char)(-var4[var5]) - '﨡') << 11 | (char)((char)(-var4[var5]) - '﨡') >>> 5)) >>> 10 | (char)((char)((char)((char)(-var4[var5]) - '﨡') << 11 | (char)((char)(-var4[var5]) - '﨡') >>> 5)) << 6) >>> 7) ^ var5))) + var5) << 10) - 18232) ^ var5) - '\uec33'))) - var5) - 13434) >>> 6 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - '﨡') << 11 | (char)((char)(-var4[var5]) - '﨡') >>> 5)) >>> 10 | (char)((char)((char)((char)(-var4[var5]) - '﨡') << 11 | (char)((char)(-var4[var5]) - '﨡') >>> 5)) << 6) << 9 | (char)((char)((char)((char)((char)(-var4[var5]) - '﨡') << 11 | (char)((char)(-var4[var5]) - '﨡') >>> 5)) >>> 10 | (char)((char)((char)((char)(-var4[var5]) - '﨡') << 11 | (char)((char)(-var4[var5]) - '﨡') >>> 5)) << 6) >>> 7) ^ var5))) + var5) >>> 6 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - '﨡') << 11 | (char)((char)(-var4[var5]) - '﨡') >>> 5)) >>> 10 | (char)((char)((char)((char)(-var4[var5]) - '﨡') << 11 | (char)((char)(-var4[var5]) - '﨡') >>> 5)) << 6) << 9 | (char)((char)((char)((char)((char)(-var4[var5]) - '﨡') << 11 | (char)((char)(-var4[var5]) - '﨡') >>> 5)) >>> 10 | (char)((char)((char)((char)(-var4[var5]) - '﨡') << 11 | (char)((char)(-var4[var5]) - '﨡') >>> 5)) << 6) >>> 7) ^ var5))) + var5) << 10) - 18232) ^ var5) - '\uec33'))) - var5) - 13434) << 10))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static class_7417 IiIilliIil(class_7417 self, String content, String alias, iiiiIlIiIIIIllIi names) {
      if (self instanceof class_8828 var13) {
         String var14 = var13.comp_737();
         String var15 = llIililIil(var14, content, alias, names);
         return (class_7417)(var15.equals(var14) ? self : class_8828.method_54232(var15));
      } else if (self instanceof class_2588 var4) {
         AccessorTranslatableTextContent var5 = (AccessorTranslatableTextContent)var4;
         Object[] var6 = var5.corzArgs();
         if (var6 != null && var6.length != 0) {
            Object[] var7 = null;

            for(int var8 = 0; var8 < var6.length; ++var8) {
               Object var9 = var6[var8];
               Object var10 = var9;
               if (var9 instanceof class_2561) {
                  class_2561 var11 = (class_2561)var9;
                  var10 = iIIilIlIil(var11, content, alias, names);
               } else if (var9 instanceof String) {
                  String var12 = (String)var9;
                  var10 = llIililIil(var12, content, alias, names);
               }

               if (var10 != var9) {
                  if (var7 == null) {
                     var7 = ((Object;)var6).clone();
                  }

                  var7[var8] = var10;
               }
            }

            if (var7 == null) {
               return self;
            } else {
               return new class_2588(var5.corzKey(), var5.corzFallback(), var7);
            }
         } else {
            return self;
         }
      } else {
         return self;
      }
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '\ue39f'))) ^ 13723) ^ var5))) + '\uf898') >>> 10 | (char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '\ue39f'))) ^ 13723) ^ var5))) + '\uf898') << 6) + var5))))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean iIlllIllll(String playerName) {
      return llilillililill.liiiIIllIl(playerName, IIllllIlll());
   }

   public static String lllllillll(String playerName) {
      liIlliIiiiIlliIi var1 = lIIlliIIll();
      if (var1 != null && var1.IliIlllilIi()) {
         String var2 = IIllllIlll();
         if (llilillililill.liiiIIllIl(playerName, var2)) {
            return var1.iiiIlIIIll();
         } else {
            String var3 = var1.Ilillllill().IilliliilIIi(playerName);
            return var3 != null ? var3 : playerName;
         }
      } else {
         return playerName;
      }
   }

   public static boolean ilIllIiIll() {
      liIlliIiiiIlliIi var0 = lIIlliIIll();
      return var0 != null && var0.IliIlllilIi() && var0.lIilliIill() != 0;
   }

   public liIlliIiiiIlliIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.lliIiliIIi = iiiiIlIiIIIIllIi.ililIlIIIi;
      this.iliIiliIIi = -1;
      this.IiiIiliIIi = -1;
      this.iiiIiliIIi = new HashMap();
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lIiIiliIIi, this.iIiIiliIIi, this.IliIiliIIi});
   }

   public String iiiIlIIIll() {
      String var1 = this.lIiIiliIIi.Iilllilliill();
      return var1 != null && !var1.isEmpty() ? var1 : IliIlllilIi<invokedynamic>();
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] - var5) ^ var5) - 27158) - var5))))) >>> 4 | (char)(~((char)(~((char)((char)((char)((char)(var4[var5] - var5) ^ var5) - 27158) - var5))))) << 12) - 7756) >>> 2 | (char)((char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] - var5) ^ var5) - 27158) - var5))))) >>> 4 | (char)(~((char)(~((char)((char)((char)((char)(var4[var5] - var5) ^ var5) - 27158) - var5))))) << 12) - 7756) << 14) >>> 15 | (char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] - var5) ^ var5) - 27158) - var5))))) >>> 4 | (char)(~((char)(~((char)((char)((char)((char)(var4[var5] - var5) ^ var5) - 27158) - var5))))) << 12) - 7756) >>> 2 | (char)((char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] - var5) ^ var5) - 27158) - var5))))) >>> 4 | (char)(~((char)(~((char)((char)((char)((char)(var4[var5] - var5) ^ var5) - 27158) - var5))))) << 12) - 7756) << 14) << 1) - 20231) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6333577627377532884L ^ Long.rotateLeft(1078821528528339377L, 10) ^ 1312817157107436249L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -3224376384595212142L ^ Long.rotateLeft(-2465990933967764993L, 28) ^ 7764176598826747669L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -6006486797308423386L ^ Long.rotateLeft(-1016606038410588615L, 53) ^ -1419145647012019265L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7287648563055204950L ^ Long.rotateLeft(-4957550400634254970L, 33) ^ 325124750072943010L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3573544618120285798L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 4280215566285749645L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5619611698230256767L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5424779299680477930L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4340740677434227204L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4067838505374371414L;
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

   public static class_2561 iilllIIill(class_2561 text) {
      if (text == null) {
         return text;
      } else {
         liIlliIiiiIlliIi var1 = lIIlliIIll();
         if (var1 != null && var1.IliIlllilIi()) {
            String var2 = IIllllIlll();
            iiiiIlIiIIIIllIi var3 = var1.Ilillllill();
            return var2 == null && var3.liiiIIllIl() ? text : iIIilIlIil(text, var2, var1.iiiIlIIIll(), var3);
         } else {
            return text;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + 'ꓚ') << 8 | (char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + 'ꓚ') >>> 8) << 9 | (char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + 'ꓚ') << 8 | (char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + 'ꓚ') >>> 8) >>> 7) ^ var5) - var5) + var5) - var5))) + var5) + var5) >>> 13 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + 'ꓚ') << 8 | (char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + 'ꓚ') >>> 8) << 9 | (char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + 'ꓚ') << 8 | (char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + 'ꓚ') >>> 8) >>> 7) ^ var5) - var5) + var5) - var5))) + var5) + var5) << 3) + var5) << 6 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + 'ꓚ') << 8 | (char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + 'ꓚ') >>> 8) << 9 | (char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + 'ꓚ') << 8 | (char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + 'ꓚ') >>> 8) >>> 7) ^ var5) - var5) + var5) - var5))) + var5) + var5) >>> 13 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + 'ꓚ') << 8 | (char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + 'ꓚ') >>> 8) << 9 | (char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + 'ꓚ') << 8 | (char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + 'ꓚ') >>> 8) >>> 7) ^ var5) - var5) + var5) - var5))) + var5) + var5) << 3) + var5) >>> 10) - 2384));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean IlIllllIll() {
      liIlliIiiiIlliIi var0 = lIIlliIIll();
      return var0 != null && var0.IliIlllilIi();
   }

   private iiiiIlIiIIIIllIi liilliiill(class_310 mc, int mode) {
      String var3 = IIllllIlll();
      List var4 = iIIiIiIlIlIiIiIl.IilliliilIIi();
      HashSet var5 = new HashSet();

      for(String var7 : var4) {
         var5.add(var7.toLowerCase(Locale.ROOT));
      }

      liIiIliliiIiIlil var10 = new liIiIliliiIiIlil();
      if ((mode & 2) != 0) {
         for(int var11 = 0; var11 < var4.size(); ++var11) {
            String var8 = (String)var4.get(var11);
            if (!llilillililill.liiiIIllIl(var8, var3)) {
               var10.put(var8, IliIlllilIi<invokedynamic>() + (var11 + 1));
            }
         }
      }

      if ((mode & 1) != 0) {
         class_634 var12 = mc.method_1562();
         if (var12 != null) {
            for(class_640 var9 : var12.method_2880()) {
               if (var9 != null && var9.method_2966() != null) {
                  this.IIIillIIil(var10, var9.method_2966().name(), var3, var5);
               }
            }
         }

         if (mc.field_1687 != null) {
            for(class_742 var15 : mc.field_1687.method_18456()) {
               if (var15 != null && var15.method_7334() != null) {
                  this.IIIillIIil(var10, var15.method_7334().name(), var3, var5);
               }
            }
         }
      }

      return var10.build();
   }

   public static String IIllllIlll() {
      try {
         class_310 var0 = class_310.method_1551();
         if (var0 != null && var0.method_1548() != null) {
            String var1 = var0.method_1548().method_1676();
            return var1 != null && !var1.isEmpty() ? var1 : null;
         } else {
            return null;
         }
      } catch (Exception var2) {
         return null;
      }
   }

   private static liIlliIiiiIlliIi lIIlliIIll() {
      return (liIlliIiiiIlliIi)llilIllililIll.iliIiiliiiii(liIlliIiiiIlliIi.class);
   }

   iiiiIlIiIIIIllIi Ilillllill() {
      long var6 = -6111096133410851935L;
      var6 ^= ((long)this.lIilliIill() << 32 ^ var6) & -1L << 32;
      if ((int)(var6 >>> 32) == 0) {
         return iiiiIlIiIIIIllIi.ililIlIIIi;
      } else {
         class_310 var2 = class_310.method_1551();
         if (var2 != null && var2.method_18854()) {
            long var3 = System.nanoTime();
            var6 ^= ((long)ilillIiill(var2) ^ var6) & -1L >>> 32;
            if ((int)(var6 >>> 32) != this.iliIiliIIi || (int)var6 != this.IiiIiliIIi || var3 - this.liiIiliIIi >= (6922274091839366311L ^ 6922274091474141607L)) {
               this.iliIiliIIi = (int)(var6 >>> 32);
               this.IiiIiliIIi = (int)var6;
               this.liiIiliIIi = var3;
               this.lliIiliIIi = this.liilliiill(var2, (int)(var6 >>> 32));
            }
         }

         return this.lliIiliIIi;
      }
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) >>> 3 | (char)(var4[var5] << 13 | var4[var5] >>> 3) << 13) + 29080) << 3 | (char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) >>> 3 | (char)(var4[var5] << 13 | var4[var5] >>> 3) << 13) + 29080) >>> 13) ^ 20370) - '셆') + var5) ^ var5))) + var5) + 18899));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String liIlliiIll() {
      liIlliIiiiIlliIi var0 = lIIlliIIll();
      return var0 == null ? IliIlllilIi<invokedynamic>() : var0.iiiIlIIIll();
   }

   static class_2561 iIIilIlIil(class_2561 text, String self, String alias, iiiiIlIiIIIIllIi names) {
      class_7417 var4 = text.method_10851();
      class_7417 var5 = IiIilliIil(var4, self, alias, names);
      List var6 = text.method_10855();
      class_2561[] var7 = null;

      for(int var8 = 0; var8 < var6.size(); ++var8) {
         class_2561 var9 = (class_2561)var6.get(var8);
         class_2561 var10 = iIIilIlIil(var9, self, alias, names);
         if (var10 != var9 && var7 == null) {
            var7 = (class_2561[])var6.toArray(new class_2561[0]);
         }

         if (var7 != null) {
            var7[var8] = var10;
         }
      }

      if (var5 == var4 && var7 == null) {
         return text;
      } else {
         class_5250 var12 = class_5250.method_43477(var5).method_10862(text.method_10866());

         for(class_2561 var11 : var7 != null ? List.of(var7) : var6) {
            var12.method_10852(var11);
         }

         return var12;
      }
   }

   private static String llIililIil(String names, String s, String self, iiiiIlIiIIIIllIi alias) {
      return llilillililill.IiIlliIliiIl(alias.lIiiIiIlilli(names), s, self);
   }

   private int lIilliIill() {
      return (this.iIiIiliIIi.Iilllilliill() ? 1 : 0) | (this.IliIiliIIi.Iilllilliill() ? 2 : 0);
   }

   private static int ilillIiill(class_310 mc) {
      long var4 = -7448930041918222045L;
      class_634 var1 = mc.method_1562();
      var4 ^= ((long)(var1 == null ? 0 : var1.method_2880().size()) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)(mc.field_1687 == null ? 0 : mc.field_1687.method_18456().size()) ^ var4) & -1L >>> 32;
      return (int)(var4 >>> 32) * (-(~(1091037959 + -109) * 97) ^ -1543576390) + (int)var4;
   }

   private void IIIillIIil(liIiIliliiIiIlil b, String self, String friendKeys, Set<String> name) {
      if (iiiiIlIiIIIIllIi.IliIlllilIi(self) && !llilillililill.liiiIIllIl(self, friendKeys) && !b.has(self)) {
         String var5 = self.toLowerCase(Locale.ROOT);
         if (!name.contains(var5)) {
            Integer var6 = (Integer)this.iiiIiliIIi.get(var5);
            if (var6 == null) {
               if (this.iiiIiliIIi.size() >= (~(1843954383 ^ -53) * 1455319497 ^ 831642131)) {
                  this.iiiIiliIIi.clear();
               }

               var6 = this.iiiIiliIIi.size() + 1;
               this.iiiIiliIIi.put(var5, var6);
            }

            b.put(self, IliIlllilIi<invokedynamic>() + var6);
         }
      }
   }

   public static String Iillllilll(String text) {
      liIlliIiiiIlliIi var1 = lIIlliIIll();
      return var1 != null && var1.IliIlllilIi() ? llilillililill.IiIlliIliiIl(var1.Ilillllill().lIiiIiIlilli(text), IIllllIlll(), var1.iiiIlIIIll()) : text;
   }
}
