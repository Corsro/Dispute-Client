package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_746;

public final class illIIliIilIIli {
   public static final long IliiIiiiilliiIiiii = 60000L;
   public static final String liiiIiiiiiiiiIiiii = " and more";
   private String iiIIliiiiIIlIliiii;
   private final ilIllIiIll IIIIliiiilIIIliiii;
   private String IiIIliiiiliIIliiii;
   private boolean lIlIliiiiiIlIliiii;
   private final Map<String, Long> iIIIliiiiIlIIliiii = new HashMap();
   public static final int iliiIiiiiIiiiIiiii = 2;
   private long llIIliiiiilIIliiii = Long.MIN_VALUE;

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '탐') << 7 | (char)(var4[var5] + '탐') >>> 9) + 'ꐊ') ^ 27150) ^ var5) + '\ue4be') >>> 7 | (char)((char)((char)((char)((char)((char)(var4[var5] + '탐') << 7 | (char)(var4[var5] + '탐') >>> 9) + 'ꐊ') ^ 27150) ^ var5) + '\ue4be') << 9) << 5 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '탐') << 7 | (char)(var4[var5] + '탐') >>> 9) + 'ꐊ') ^ 27150) ^ var5) + '\ue4be') >>> 7 | (char)((char)((char)((char)((char)((char)(var4[var5] + '탐') << 7 | (char)(var4[var5] + '탐') >>> 9) + 'ꐊ') ^ 27150) ^ var5) + '\ue4be') << 9) >>> 11) + var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '탐') << 7 | (char)(var4[var5] + '탐') >>> 9) + 'ꐊ') ^ 27150) ^ var5) + '\ue4be') >>> 7 | (char)((char)((char)((char)((char)((char)(var4[var5] + '탐') << 7 | (char)(var4[var5] + '탐') >>> 9) + 'ꐊ') ^ 27150) ^ var5) + '\ue4be') << 9) << 5 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '탐') << 7 | (char)(var4[var5] + '탐') >>> 9) + 'ꐊ') ^ 27150) ^ var5) + '\ue4be') >>> 7 | (char)((char)((char)((char)((char)((char)(var4[var5] + '탐') << 7 | (char)(var4[var5] + '탐') >>> 9) + 'ꐊ') ^ 27150) ^ var5) + '\ue4be') << 9) >>> 11) + var5) << 5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IilliliilIIi(String title, String key, String text, long nowMs) {
      if (title != null && text != null) {
         Long var6 = (Long)this.iIIIliiiiIlIIliiii.get(title);
         if (var6 == null || nowMs < var6 || nowMs - var6 >= 60000L) {
            this.iIIIliiiiIlIIliiii.put(title, nowMs);
            Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(key == null ? IIIllIIliIIl<invokedynamic>() : key, text, false);
            class_746 var7 = class_310.method_1551().field_1724;
            if (var7 != null) {
               var7.method_7353(class_2561.method_43470(IIIllIIliIIl<invokedynamic>()).method_27692(class_124.field_1061).method_10852(class_2561.method_43470(text).method_27692(class_124.field_1068)), false);
            }

         }
      }
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) + '\ue6f0') ^ var5) ^ var5) ^ var5) ^ 2328) ^ var5))) - 24808))) + var5) >>> 12 | (char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) + '\ue6f0') ^ var5) ^ var5) ^ var5) ^ 2328) ^ var5))) - 24808))) + var5) << 4) - var5))))) >>> 6 | (char)(~((char)(~((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) + '\ue6f0') ^ var5) ^ var5) ^ var5) ^ 2328) ^ var5))) - 24808))) + var5) >>> 12 | (char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) + '\ue6f0') ^ var5) ^ var5) ^ var5) ^ 2328) ^ var5))) - 24808))) + var5) << 4) - var5))))) << 10) - '趖'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - 'ퟹ') - var5) + '읋') ^ var5))) >>> 5 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - 'ퟹ') - var5) + '읋') ^ var5))) << 11) >>> 1 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - 'ퟹ') - var5) + '읋') ^ var5))) >>> 5 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - 'ퟹ') - var5) + '읋') ^ var5))) << 11) << 15) + 11445) ^ var5) - var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void lIiiIiIlilli() {
      this.iIIIliiiiIlIIliiii.clear();
      this.llIIliiiiilIIliiii = Long.MIN_VALUE;
      this.IiIIliiiiliIIliiii = null;
      this.iiIIliiiiIIlIliiii = null;
      this.lIlIliiiiiIlIliiii = false;
   }

   public String liiiIIllIl() {
      this.iliIiiliiiii();
      return this.iiIIliiiiIIlIliiii;
   }

   private void iliIiiliiiii() {
      long var11 = 3022608036005393056L;
      long var1 = IIllIIlilIllIIli.IlIlllIlilIl();
      if (var1 != this.llIIliiiiilIIliiii) {
         this.llIIliiiiilIIliiii = var1;
         String var3 = null;
         StringBuilder var4 = null;
         var11 ^= (0L ^ var11) & -1L << 32;
         var11 ^= (0L ^ var11) & -1L >>> 32;

         for(ilIllIiIll var8 : llilIllililIll.IilliliilIIi()) {
            if (var8 != null && var8 != this.IIIIliiiilIIIliiii && var8.IliIlllilIi()) {
               String var9 = var8.lIiiIiIlilli();
               if (var3 == null && (ilIIlilIiIIlil.Illlllllilll(var8) || IIiilIIilIiilIIi.IllIiIiiil.contains(var9))) {
                  var3 = var8.IilliliilIIi();
               }

               if (IIiilIIilIiilIIi.lIlIiIiiil.contains(var9)) {
                  if ((int)(var11 >>> 32) < 2) {
                     if (var4 == null) {
                        var4 = new StringBuilder(var8.IilliliilIIi());
                     } else {
                        var4.append(IIIllIIliIIl<invokedynamic>()).append(var8.IilliliilIIi());
                     }
                  } else if ((int)(var11 >>> 32) == 2) {
                     var4.append(IIIllIIliIIl<invokedynamic>());
                  }

                  var11 += 4294967296L;
               }

               if (IIiilIIilIiilIIi.iIlIiIiiil.contains(var9)) {
                  var11 ^= (1L ^ var11) & -1L >>> 32;
               }

               if (var8 instanceof iIIliIiIlIliIi) {
                  iIIliIiIlIliIi var10 = (iIIliIiIlIliIi)var8;
                  if (var10.liIlliiIll()) {
                     var11 ^= (1L ^ var11) & -1L >>> 32;
                  }
               }

               if (var8 instanceof IIiiIillIiiIil) {
                  IIiiIillIiiIil var13 = (IIiiIillIiiIil)var8;
                  if (var13.lliIIliliIIl()) {
                     var11 ^= (1L ^ var11) & -1L >>> 32;
                  }
               }
            }
         }

         this.IiIIliiiiliIIliiii = var3;
         this.iiIIliiiiIIlIliiii = var4 == null ? null : var4.toString();
         this.lIlIliiiiiIlIliiii = (boolean)((int)var11);
      }
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -7525350737718377601L ^ Long.rotateLeft(-8866662865954325518L, 34) ^ -3400364557489761679L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -6784832816742439460L ^ Long.rotateLeft(7146645952996134348L, 59) ^ 6367559737544856196L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -3128541980477218283L ^ Long.rotateLeft(-2336042496677816986L, 27) ^ 8883890263926776508L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -9045971026528203311L ^ Long.rotateLeft(1658934192833325649L, 44) ^ 1910305129672675688L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1946000302737411142L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 3236016004442285749L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 568116761383156792L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 298654434420193998L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6536334303805132931L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -632401667212272339L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IlIlllIlilIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIlliIliiIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIlllIlliIll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Illlllllilll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iilllilliill<invokedynamic>());
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
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) << 5 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) >>> 11) >>> 7 | (char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) << 5 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) >>> 11) << 9)) - var5))) << 9 | (char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) << 5 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) >>> 11) >>> 7 | (char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) << 5 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) >>> 11) << 9)) - var5))) >>> 7) >>> 1 | (char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) << 5 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) >>> 11) >>> 7 | (char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) << 5 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) >>> 11) << 9)) - var5))) << 9 | (char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) << 5 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) >>> 11) >>> 7 | (char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) << 5 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) >>> 11) << 9)) - var5))) >>> 7) << 15) ^ '\ue4a1') << 15 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) << 5 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) >>> 11) >>> 7 | (char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) << 5 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) >>> 11) << 9)) - var5))) << 9 | (char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) << 5 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) >>> 11) >>> 7 | (char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) << 5 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) >>> 11) << 9)) - var5))) >>> 7) >>> 1 | (char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) << 5 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) >>> 11) >>> 7 | (char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) << 5 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) >>> 11) << 9)) - var5))) << 9 | (char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) << 5 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) >>> 11) >>> 7 | (char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) << 5 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] - var5))) ^ var5) ^ var5) + var5))) >>> 13) >>> 11) << 9)) - var5))) >>> 7) << 15) ^ '\ue4a1') >>> 1) ^ var5) ^ '\uf5fb') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public illIIliIilIIli(ilIllIiIll self) {
      this.IIIIliiiilIIIliiii = self;
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3))) + 11816) - var5) >>> 6 | (char)((char)((char)(~((char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3))) + 11816) - var5) << 10))) ^ var5) + var5) << 14 | (char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3))) + 11816) - var5) >>> 6 | (char)((char)((char)(~((char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3))) + 11816) - var5) << 10))) ^ var5) + var5) >>> 2) + 10801) + var5) + var5) + 31830) ^ var5))) ^ 16062))) - 3615));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean iIlIlllllill() {
      this.iliIiiliiiii();
      return this.lIlIliiiiiIlIliiii;
   }

   public String IliIlllilIi() {
      this.iliIiiliiiii();
      return this.IiIIliiiiliIIliiii;
   }
}
