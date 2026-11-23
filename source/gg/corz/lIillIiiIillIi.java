package gg.corz;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class lIillIiiIillIi {
   public static final int iiIIliIiiIIlIliIii = 826691147;
   public final float[] iIiIliIiiIliIliIii;
   private static final Map<String, int[]> lilIliIiiiilIliIii = new ConcurrentHashMap();
   public final int[] IiiIliIiiliiIliIii;
   public static final int IllIliIiilllIliIii = 256;
   public final float[] lliIliIiiiliIliIii;
   public final int[] iiiIliIiiIIIlliIii;
   private static final Map<String, lIillIiiIillIi> illIliIiiIilIliIii = new ConcurrentHashMap();
   public final int[] lIIlliIiiiIIlliIii;
   public final float[] IIiIliIiilIiIliIii;
   public static final String lIlIliIiiiIlIliIii = "/assets/corzclient/textures/knife/knife.png";

   public static int[] IiIlliIliiIl(String path) {
      int[] var1 = (int[])lilIliIiiiilIliIii.get(path);
      if (var1 != null) {
         return var1;
      } else {
         try {
            InputStream var2 = lIillIiiIillIi.class.getResourceAsStream(path);

            label78: {
               int[] var10;
               label79: {
                  Object var4;
                  try {
                     if (var2 == null) {
                        var10 = null;
                        break label79;
                     }

                     var10 = IIlllIlliIll(var2.readAllBytes());
                     if (var10 != null && var10[0] == ((~-73295064 << 27 | ~-73295064 >>> 5) ^ -1205669338) && var10[1] == ((-446421749 - 65) * 101 * 77 ^ -1488872054)) {
                        var1 = Arrays.copyOfRange(var10, 2, var10.length);
                        break label78;
                     }

                     var4 = null;
                  } catch (Throwable var6) {
                     if (var2 != null) {
                        try {
                           var2.close();
                        } catch (Throwable var5) {
                           var6.addSuppressed(var5);
                        }
                     }

                     throw var6;
                  }

                  if (var2 != null) {
                     var2.close();
                  }

                  return (int[])var4;
               }

               if (var2 != null) {
                  var2.close();
               }

               return var10;
            }

            if (var2 != null) {
               var2.close();
            }
         } catch (RuntimeException | IOException var7) {
            return null;
         }

         int[] var9 = (int[])lilIliIiiiilIliIii.putIfAbsent(path, var1);
         return var9 != null ? var9 : var1;
      }
   }

   public static lIillIiiIillIi IilliliilIIi(byte[] data) {
      ByteBuffer var1 = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
      if (data.length >= 12 && var1.getInt() == 826691147) {
         int var2 = var1.getInt();
         int var3 = var1.getInt();
         if (var2 > 0 && var3 > 0 && var3 % 3 == 0 && (long)var2 * 36L + (long)var3 * 4L + 12L == (long)data.length) {
            float[] var4 = new float[var2 * 3];
            float[] var5 = new float[var2 * 3];
            float[] var6 = new float[var2 * 2];
            int[] var7 = new int[var2];
            int[] var8 = new int[var3];

            for(int var9 = 0; var9 < var2; ++var9) {
               var4[var9 * 3] = var1.getFloat();
               var4[var9 * 3 + 1] = var1.getFloat();
               var4[var9 * 3 + 2] = var1.getFloat();
               var5[var9 * 3] = var1.getFloat();
               var5[var9 * 3 + 1] = var1.getFloat();
               var5[var9 * 3 + 2] = var1.getFloat();
               var6[var9 * 2] = var1.getFloat();
               var6[var9 * 2 + 1] = var1.getFloat();
               var7[var9] = var1.getInt();
            }

            for(int var11 = 0; var11 < var3; ++var11) {
               int var10 = var1.getInt();
               if (var10 < 0 || var10 >= var2) {
                  throw new IllegalArgumentException(IIIilIIiiIIi<invokedynamic>());
               }

               var8[var11] = var10;
            }

            return new lIillIiiIillIi(var4, var5, var6, var7, var8);
         } else {
            throw new IllegalArgumentException(IIIilIIiiIIi<invokedynamic>());
         }
      } else {
         throw new IllegalArgumentException(IIIilIIiiIIi<invokedynamic>());
      }
   }

   private lIillIiiIillIi(float[] idx, float[] uv, float[] pos, int[] nrm, int[] argb) {
      this.IIiIliIiilIiIliIii = idx;
      this.iIiIliIiiIliIliIii = uv;
      this.lliIliIiiiliIliIii = pos;
      this.IiiIliIiiliiIliIii = nrm;
      this.iiiIliIiiIIIlliIii = argb;
      this.lIIlliIiiiIIlliIii = this.Illlllllilll();
   }

   public static int[] IlIlllIlilIl(illIIlllIilIIlll rig) {
      return IiIlliIliiIl(rig == null ? IIIilIIiiIIi<invokedynamic>() : rig.IilliliilIIi());
   }

   private static long IIillIiliIil(int a, int b) {
      return a < b ? (long)a << (-(-1347908916 + 3) ^ 1347908881) | (long)b & (5483692356739120265L ^ 5483692360867660662L) : (long)b << (-(-1094111867 - -121) ^ -33 ^ -1094111747) | (long)a & (-5359115222190624430L ^ -5359115221349724499L);
   }

   public static lIillIiiIillIi[] iliIiiliiiii(illIIlllIilIIlll rig) {
      lIillIiiIillIi[] var1 = new lIillIiiIillIi[rig.IlIlllIlilIl()];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         var1[var2] = lIiiIiIlilli(rig.IiIlliIliiIl(var2).IliIlllilIi());
         if (var1[var2] == null) {
            return null;
         }
      }

      return var1;
   }

   public int iIlIlllllill() {
      return this.lIIlliIiiiIIlliIii.length / 4;
   }

   private int[] Ililllililil() {
      int var1 = this.IiiIliIiiliiIliIii.length;
      int[] var2 = new int[var1];
      HashMap var3 = new HashMap();

      for(int var4 = 0; var4 < var1; ++var4) {
         String var5 = Float.floatToIntBits(this.IIiIliIiilIiIliIii[var4 * 3]) + IIIilIIiiIIi<invokedynamic>() + Float.floatToIntBits(this.IIiIliIiilIiIliIii[var4 * 3 + 1]) + IIIilIIiiIIi<invokedynamic>() + Float.floatToIntBits(this.IIiIliIiilIiIliIii[var4 * 3 + 2]) + IIIilIIiiIIi<invokedynamic>() + Float.floatToIntBits(this.lliIliIiiiliIliIii[var4 * 2]) + IIIilIIiiIIi<invokedynamic>() + Float.floatToIntBits(this.lliIliIiiiliIliIii[var4 * 2 + 1]) + IIIilIIiiIIi<invokedynamic>() + this.IiiIliIiiliiIliIii[var4] + IIIilIIiiIIi<invokedynamic>() + Math.round(this.iIiIliIiiIliIliIii[var4 * 3] * 2000.0F) + IIIilIIiiIIi<invokedynamic>() + Math.round(this.iIiIliIiiIliIliIii[var4 * 3 + 1] * 2000.0F) + IIIilIIiiIIi<invokedynamic>() + Math.round(this.iIiIliIiiIliIliIii[var4 * 3 + 2] * 2000.0F);
         Integer var6 = (Integer)var3.putIfAbsent(var5, var4);
         var2[var4] = var6 == null ? var4 : var6;
      }

      return var2;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 7017187424108599431L ^ Long.rotateLeft(6214882922231730685L, 18) ^ 8505320410932050688L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7235850408070846872L ^ Long.rotateLeft(-6869368379889584435L, 10) ^ 3432778919088255818L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 212864381467443876L ^ Long.rotateLeft(-2370676823571435937L, 57) ^ 4077422386810262499L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6739585497626513307L ^ Long.rotateLeft(-8424514593587903628L, 35) ^ -345858556950264027L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3346423815656296378L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2265745022247389038L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6131089851138654221L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -863030412351823483L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -5782069661687302534L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1306230762371660572L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IlIillIiilIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIiliIiiiIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIlilIliiIli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Illillliilli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iilililiiili<invokedynamic>());
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

   public int IliIlllilIi() {
      return this.IiiIliIiiliiIliIii.length;
   }

   public static int[] IIIllIIliIIl() {
      return IiIlliIliiIl(IIIilIIiiIIi<invokedynamic>());
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - 22266) >>> 6 | (char)(var4[var5] - 22266) << 10) - var5) + 9115))) - '쮧') ^ 5466) >>> 12 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - 22266) >>> 6 | (char)(var4[var5] - 22266) << 10) - var5) + 9115))) - '쮧') ^ 5466) << 4) + 10328) ^ 22202) ^ var5) + '鍶') - var5))) - var5) - var5) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(-((char)(-((char)((char)(var4[var5] - 14572) + '뽷'))))) - 28356))) ^ 12152) + '욷'))) - var5) - var5) + 24060) + var5) - var5))) - 4317) + 10561) ^ var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static lIillIiiIillIi lIiiIiIlilli(String model) {
      lIillIiiIillIi var1 = (lIillIiiIillIi)illIliIiiIilIliIii.get(model);
      if (var1 != null) {
         return var1;
      } else {
         try {
            InputStream var2 = lIillIiiIillIi.class.getResourceAsStream(IIIilIIiiIIi<invokedynamic>() + model + IIIilIIiiIIi<invokedynamic>());

            label61: {
               Object var3;
               try {
                  if (var2 != null) {
                     var1 = IilliliilIIi(var2.readAllBytes());
                     break label61;
                  }

                  var3 = null;
               } catch (Throwable var6) {
                  if (var2 != null) {
                     try {
                        var2.close();
                     } catch (Throwable var5) {
                        var6.addSuppressed(var5);
                     }
                  }

                  throw var6;
               }

               if (var2 != null) {
                  var2.close();
               }

               return (lIillIiiIillIi)var3;
            }

            if (var2 != null) {
               var2.close();
            }
         } catch (IOException | IllegalArgumentException var7) {
            return null;
         }

         lIillIiiIillIi var9 = (lIillIiiIillIi)illIliIiiIilIliIii.putIfAbsent(model, var1);
         return var9 != null ? var9 : var1;
      }
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)(-((char)((char)(-((char)(var4[var5] + var5))) + 23379))))))) ^ '\ufafc') << 14 | (char)((char)(~((char)(~((char)(-((char)((char)(-((char)(var4[var5] + var5))) + 23379))))))) ^ '\ufafc') >>> 2) ^ var5) - 12867) >>> 15 | (char)((char)((char)((char)((char)(~((char)(~((char)(-((char)((char)(-((char)(var4[var5] + var5))) + 23379))))))) ^ '\ufafc') << 14 | (char)((char)(~((char)(~((char)(-((char)((char)(-((char)(var4[var5] + var5))) + 23379))))))) ^ '\ufafc') >>> 2) ^ var5) - 12867) << 1) + '釓') + var5) + '餥'))) - 15135) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int liiiIIllIl() {
      return this.iiiIliIiiIIIlliIii.length / 3;
   }

   static int[] IIlllIlliIll(byte[] d) {
      if (d.length >= 8 && (d[0] & 255) == 137 && d[1] == 80 && d[2] == 78 && d[3] == 71) {
         int var1 = 8;
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = -1;
         byte[] var6 = null;
         byte[] var7 = null;
         ByteArrayOutputStream var8 = new ByteArrayOutputStream();

         while(true) {
            if (var1 + 8 <= d.length) {
               int var9 = (d[var1] & 255) << 24 | (d[var1 + 1] & 255) << 16 | (d[var1 + 2] & 255) << 8 | d[var1 + 3] & 255;
               String var10 = new String(d, var1 + 4, 4, StandardCharsets.US_ASCII);
               int var11 = var1 + 8;
               if (var9 < 0 || var11 + var9 > d.length) {
                  return null;
               }

               byte var13 = -1;
               switch (var10.hashCode()) {
                  case 2242190:
                     if (var10.equals(IIIilIIiiIIi<invokedynamic>())) {
                        var13 = 3;
                     }
                     break;
                  case 2246125:
                     if (var10.equals(IIIilIIiiIIi<invokedynamic>())) {
                        var13 = 0;
                     }
                     break;
                  case 2458989:
                     if (var10.equals(IIIilIIiiIIi<invokedynamic>())) {
                        var13 = 1;
                     }
                     break;
                  case 3537059:
                     if (var10.equals(IIIilIIiiIIi<invokedynamic>())) {
                        var13 = 2;
                     }
               }

               switch (var13) {
                  case 0:
                     var2 = (d[var11] & 255) << 24 | (d[var11 + 1] & 255) << 16 | (d[var11 + 2] & 255) << 8 | d[var11 + 3] & 255;
                     var3 = (d[var11 + 4] & 255) << 24 | (d[var11 + 5] & 255) << 16 | (d[var11 + 6] & 255) << 8 | d[var11 + 7] & 255;
                     var4 = d[var11 + 8] & 255;
                     var5 = d[var11 + 9] & 255;
                     if (d[var11 + 12] != 0) {
                        return null;
                     }
                     break;
                  case 1:
                     var6 = Arrays.copyOfRange(d, var11, var11 + var9);
                     break;
                  case 2:
                     var7 = Arrays.copyOfRange(d, var11, var11 + var9);
                     break;
                  case 3:
                     var8.write(d, var11, var9);
               }

               if (!var10.equals(IIIilIIiiIIi<invokedynamic>())) {
                  var1 = var11 + var9 + 4;
                  continue;
               }
            }

            if (var4 == 8 && var2 > 0 && var3 > 0) {
               byte var10000;
               switch (var5) {
                  case 0:
                     var10000 = 1;
                     break;
                  case 1:
                  case 5:
                  default:
                     var10000 = -1;
                     break;
                  case 2:
                     var10000 = 3;
                     break;
                  case 3:
                     var10000 = 1;
                     break;
                  case 4:
                     var10000 = 2;
                     break;
                  case 6:
                     var10000 = 4;
               }

               byte var33 = (byte)var10000;
               if (var33 < 0) {
                  return null;
               }

               int var34 = var2 * var33;
               byte[] var35 = new byte[(var34 + 1) * var3];
               Inflater var12 = new Inflater();

               try {
                  var12.setInput(var8.toByteArray());

                  int var36;
                  int var38;
                  for(var36 = 0; var36 < var35.length && !var12.finished(); var36 += var38) {
                     var38 = var12.inflate(var35, var36, var35.length - var36);
                     if (var38 == 0 && (var12.needsInput() || var12.needsDictionary())) {
                        break;
                     }
                  }

                  if (var36 < var35.length) {
                     Object var39 = null;
                     return (int[])var39;
                  }
               } catch (DataFormatException var31) {
                  Object var14 = null;
                  return (int[])var14;
               } finally {
                  var12.end();
               }

               byte[] var37 = new byte[var34];
               byte[] var40 = new byte[var34];
               int[] var15 = new int[2 + var2 * var3];
               var15[0] = var2;
               var15[1] = var3;

               for(int var16 = 0; var16 < var3; ++var16) {
                  int var17 = var35[var16 * (var34 + 1)] & 255;
                  int var18 = var16 * (var34 + 1) + 1;

                  for(int var19 = 0; var19 < var34; ++var19) {
                     int var20 = var35[var18 + var19] & 255;
                     int var21 = var19 >= var33 ? var37[var19 - var33] & 255 : 0;
                     int var22 = var40[var19] & 255;
                     int var23 = var19 >= var33 ? var40[var19 - var33] & 255 : 0;
                     switch (var17) {
                        case 0:
                           var10000 = var20;
                           break;
                        case 1:
                           var10000 = var20 + var21;
                           break;
                        case 2:
                           var10000 = var20 + var22;
                           break;
                        case 3:
                           var10000 = var20 + (var21 + var22 >> 1);
                           break;
                        case 4:
                           int var25 = var21 + var22 - var23;
                           int var26 = Math.abs(var25 - var21);
                           int var27 = Math.abs(var25 - var22);
                           int var28 = Math.abs(var25 - var23);
                           var10000 = var20 + (var26 <= var27 && var26 <= var28 ? var21 : (var27 <= var28 ? var22 : var23));
                           break;
                        default:
                           var10000 = -1;
                     }

                     int var24 = var10000;
                     if (var24 < 0) {
                        return null;
                     }

                     var37[var19] = (byte)var24;
                  }

                  for(int var41 = 0; var41 < var2; ++var41) {
                     int var46 = 255;
                     int var47 = var41 * var33;
                     int var43;
                     int var44;
                     int var45;
                     switch (var5) {
                        case 0:
                           var43 = var44 = var45 = var37[var47] & 255;
                           break;
                        case 1:
                        default:
                           var43 = var37[var47] & 255;
                           var44 = var37[var47 + 1] & 255;
                           var45 = var37[var47 + 2] & 255;
                           var46 = var37[var47 + 3] & 255;
                           break;
                        case 2:
                           var43 = var37[var47] & 255;
                           var44 = var37[var47 + 1] & 255;
                           var45 = var37[var47 + 2] & 255;
                           break;
                        case 3:
                           int var48 = var37[var47] & 255;
                           if (var6 == null || var48 * 3 + 2 >= var6.length) {
                              return null;
                           }

                           var43 = var6[var48 * 3] & 255;
                           var44 = var6[var48 * 3 + 1] & 255;
                           var45 = var6[var48 * 3 + 2] & 255;
                           if (var7 != null && var48 < var7.length) {
                              var46 = var7[var48] & 255;
                           }
                           break;
                        case 4:
                           var43 = var44 = var45 = var37[var47] & 255;
                           var46 = var37[var47 + 1] & 255;
                     }

                     var15[2 + var16 * var2 + var41] = var46 << 24 | var43 << 16 | var44 << 8 | var45;
                  }

                  byte[] var42 = var40;
                  var40 = var37;
                  var37 = var42;
               }

               return var15;
            }

            return null;
         }
      } else {
         return null;
      }
   }

   private boolean Iilllilliill(int[] canon, int t) {
      long var6 = -7614079284079489485L;
      long var8 = 2560247788036916072L;
      var6 ^= ((long)canon[this.iiiIliIiiIIIlliIii[t * 3]] << 32 ^ var6) & -1L << 32;
      var6 ^= ((long)canon[this.iiiIliIiiIIIlliIii[t * 3 + 1]] ^ var6) & -1L >>> 32;
      var8 ^= ((long)canon[this.iiiIliIiiIIIlliIii[t * 3 + 2]] << 32 ^ var8) & -1L << 32;
      return (int)(var6 >>> 32) == (int)var6 || (int)var6 == (int)(var8 >>> 32) || (int)(var6 >>> 32) == (int)(var8 >>> 32);
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(-((char)((char)(-((char)(-((char)((char)((char)(-var4[var5]) - var5) - var5))))) - 14613))))) ^ var5))) + var5) ^ var5)) - '\uf840') - 15709) >>> 8 | (char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(-((char)((char)(-((char)(-((char)((char)((char)(-var4[var5]) - var5) - var5))))) - 14613))))) ^ var5))) + var5) ^ var5)) - '\uf840') - 15709) << 8) - var5))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - 32037))) - var5) ^ var5))) >>> 15 | (char)(-((char)((char)((char)(~((char)(var4[var5] - 32037))) - var5) ^ var5))) << 1) + '颈') ^ var5) + var5) - var5) + '觹') + var5) ^ var5) - '껷')) ^ var5) - var5) - '읷'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private int[] Illlllllilll() {
      int var1 = this.iiiIliIiiIIIlliIii.length / 3;
      int[] var2 = this.Ililllililil();
      HashMap var3 = new HashMap();

      for(int var4 = 0; var4 < var1; ++var4) {
         for(int var5 = 0; var5 < 3; ++var5) {
            ((List)var3.computeIfAbsent(IIillIiliIil(var2[this.iiiIliIiiIIIlliIii[var4 * 3 + var5]], var2[this.iiiIliIiiIIIlliIii[var4 * 3 + (var5 + 1) % 3]]), (k) -> new ArrayList(2))).add(var4);
         }
      }

      boolean[] var16 = new boolean[var1];
      int[] var17 = new int[var1 * 4];
      int var6 = 0;

      for(int var7 = 0; var7 < var1; ++var7) {
         if (!var16[var7]) {
            var16[var7] = true;
            int var8 = -1;
            int var9 = -1;

            for(int var10 = 0; var10 < 3 && var8 < 0; ++var10) {
               for(int var12 : (List)var3.get(IIillIiliIil(var2[this.iiiIliIiiIIIlliIii[var7 * 3 + var10]], var2[this.iiiIliIiiIIIlliIii[var7 * 3 + (var10 + 1) % 3]]))) {
                  if (!var16[var12] && !this.Iilllilliill(var2, var12)) {
                     var8 = var12;
                     var9 = var10;
                     break;
                  }
               }
            }

            if (var8 >= 0 && !this.Iilllilliill(var2, var7)) {
               var16[var8] = true;
               int var29 = this.iiiIliIiiIIIlliIii[var7 * 3 + var9];
               int var25 = this.iiiIliIiiIIIlliIii[var7 * 3 + (var9 + 1) % 3];
               int var27 = this.iiiIliIiiIIIlliIii[var7 * 3 + (var9 + 2) % 3];
               int var13 = -1;

               for(int var14 = 0; var14 < 3; ++var14) {
                  int var15 = this.iiiIliIiiIIIlliIii[var8 * 3 + var14];
                  if (var2[var15] != var2[var25] && var2[var15] != var2[var29]) {
                     var13 = var15;
                  }
               }

               var17[var6++] = var25;
               var17[var6++] = var27;
               var17[var6++] = var29;
               var17[var6++] = var13;
            } else {
               int var24 = this.iiiIliIiiIIIlliIii[var7 * 3];
               int var26 = this.iiiIliIiiIIIlliIii[var7 * 3 + 1];
               int var28 = this.iiiIliIiiIIIlliIii[var7 * 3 + 2];
               var17[var6++] = var24;
               var17[var6++] = var26;
               var17[var6++] = var28;
               var17[var6++] = var28;
            }
         }
      }

      return Arrays.copyOf(var17, var6);
   }
}
