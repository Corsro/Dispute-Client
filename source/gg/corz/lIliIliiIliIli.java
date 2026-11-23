package gg.corz;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2338;
import net.minecraft.class_638;

public final class lIliIliiIliIli {
   private volatile List<IiiiIlliiiIl> IliiIlIIIl = List.of();
   private final Map<String, IiiiIlliiiIl> iIiiIlIIIl = new LinkedHashMap();

   public synchronized void Iilllilliill(JsonElement element) {
      this.iIiiIlIIIl.clear();
      if (element != null && element.isJsonArray()) {
         for(JsonElement var3 : element.getAsJsonArray()) {
            try {
               JsonObject var4 = var3.getAsJsonObject();
               long var5 = var4.get(IIillIiliIil<invokedynamic>()).getAsLong();
               String var7 = var4.get(IIillIiliIil<invokedynamic>()).getAsString();
               IliliIllliliIl var8 = IliliIllliliIl.valueOf(var4.get(IIillIiliIil<invokedynamic>()).getAsString());
               this.iIiiIlIIIl.put(IliIlllilIi(var7, var5), new IiiiIlliiiIl(var5, var7, var8));
            } catch (Exception var9) {
            }
         }
      }

      this.IiIlliIliiIl();
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - '\udeed') ^ '뾩') - var5) + 7112) >>> 3 | (char)((char)((char)((char)(var4[var5] - '\udeed') ^ '뾩') - var5) + 7112) << 13))) ^ 'ꖓ') + var5) >>> 1 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - '\udeed') ^ '뾩') - var5) + 7112) >>> 3 | (char)((char)((char)((char)(var4[var5] - '\udeed') ^ '뾩') - var5) + 7112) << 13))) ^ 'ꖓ') + var5) << 15) - '옕'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public List<IiiiIlliiiIl> IlIlllIlilIl() {
      return this.IliiIlIIIl;
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - '귝') << 11 | (char)(var4[var5] - '귝') >>> 5) >>> 7 | (char)((char)(var4[var5] - '귝') << 11 | (char)(var4[var5] - '귝') >>> 5) << 9) << 5 | (char)((char)((char)(var4[var5] - '귝') << 11 | (char)(var4[var5] - '귝') >>> 5) >>> 7 | (char)((char)(var4[var5] - '귝') << 11 | (char)(var4[var5] - '귝') >>> 5) << 9) >>> 11) >>> 10 | (char)((char)((char)((char)(var4[var5] - '귝') << 11 | (char)(var4[var5] - '귝') >>> 5) >>> 7 | (char)((char)(var4[var5] - '귝') << 11 | (char)(var4[var5] - '귝') >>> 5) << 9) << 5 | (char)((char)((char)(var4[var5] - '귝') << 11 | (char)(var4[var5] - '귝') >>> 5) >>> 7 | (char)((char)(var4[var5] - '귝') << 11 | (char)(var4[var5] - '귝') >>> 5) << 9) >>> 11) << 6))) ^ var5) ^ var5) - 26231) + '댆') + var5) ^ '쨓') + var5) + 17217) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public synchronized List<IiiiIlliiiIl> IIlllIlliIll(class_638 world) {
      if (world == null) {
         return List.of();
      } else {
         String var2 = world.method_27983().method_29177().toString();
         ArrayList var3 = null;
         Iterator var4 = this.iIiiIlIIIl.entrySet().iterator();

         while(var4.hasNext()) {
            IiiiIlliiiIl var5 = (IiiiIlliiiIl)((Map.Entry)var4.next()).getValue();
            if (var5.IilliliilIIi().equals(var2)) {
               class_2338 var6 = var5.liiiIIllIl();
               if (world.method_8393(var6.method_10263() >> 4, var6.method_10260() >> 4) && IliliIllliliIl.IliIlllilIi(world.method_8320(var6).method_26204()) == null) {
                  var4.remove();
                  if (var3 == null) {
                     var3 = new ArrayList();
                  }

                  var3.add(var5);
               }
            }
         }

         if (var3 == null) {
            return List.of();
         } else {
            this.IiIlliIliiIl();
            return var3;
         }
      }
   }

   public synchronized boolean iIlIlllllill(class_2338 type, String pos, IliliIllliliIl dimension) {
      long var6 = -1512621006510763136L;
      String var4 = IliIlllilIi(pos, type.method_10063());
      var6 ^= ((long)(!this.iIiiIlIIIl.containsKey(var4) ? 1 : 0) << 32 ^ var6) & -1L << 32;
      this.iIiiIlIIIl.put(var4, IiiiIlliiiIl.IliIlllilIi(type, pos, dimension));
      this.IiIlliIliiIl();
      return (boolean)((int)(var6 >>> 32));
   }

   public synchronized JsonElement Illlllllilll() {
      JsonArray var1 = new JsonArray();

      for(IiiiIlliiiIl var3 : this.iIiiIlIIIl.values()) {
         JsonObject var4 = new JsonObject();
         var4.addProperty(IIillIiliIil<invokedynamic>(), var3.iIlIlllllill());
         var4.addProperty(IIillIiliIil<invokedynamic>(), var3.IilliliilIIi());
         var4.addProperty(IIillIiliIil<invokedynamic>(), var3.lIiiIiIlilli().name());
         var1.add(var4);
      }

      return var1;
   }

   public synchronized void iliIiiliiiii() {
      this.iIiiIlIIIl.clear();
      this.IiIlliIliiIl();
   }

   private void IiIlliIliiIl() {
      this.IliiIlIIIl = List.copyOf(this.iIiiIlIIIl.values());
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1059449467168210755L ^ Long.rotateLeft(5058641289833410558L, 46) ^ 5042430137017076651L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 2406369965585005042L ^ Long.rotateLeft(43365530496852914L, 48) ^ 7233535452247297576L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 923605275311877218L ^ Long.rotateLeft(8371448629502756379L, 27) ^ -4592167560947245821L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 1215786054057583797L ^ Long.rotateLeft(-4035100071179610078L, 39) ^ 2543999721259522942L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -375623130811848102L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -7143787035282493799L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4403080612678067121L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -4210740540657461898L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -3634651107500796360L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -840389751124271980L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IlIillIiilIi<invokedynamic>());
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

   private static String IliIlllilIi(String pos, long dimension) {
      return pos + IIillIiliIil<invokedynamic>() + dimension;
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + '\uf8e0') ^ var5) - 9100) ^ '냐') << 12 | (char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + '\uf8e0') ^ var5) - 9100) ^ '냐') >>> 4))) - var5) + var5))) << 14 | (char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + '\uf8e0') ^ var5) - 9100) ^ '냐') << 12 | (char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + '\uf8e0') ^ var5) - 9100) ^ '냐') >>> 4))) - var5) + var5))) >>> 2) - 27230) - '\uf2ee') >>> 10 | (char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + '\uf8e0') ^ var5) - 9100) ^ '냐') << 12 | (char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + '\uf8e0') ^ var5) - 9100) ^ '냐') >>> 4))) - var5) + var5))) << 14 | (char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + '\uf8e0') ^ var5) - 9100) ^ '냐') << 12 | (char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + '\uf8e0') ^ var5) - 9100) ^ '냐') >>> 4))) - var5) + var5))) >>> 2) - 27230) - '\uf2ee') << 6) + '釭') + 24353) ^ '젟'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public synchronized boolean IilliliilIIi(class_2338 pos, String dimension) {
      if (this.iIiiIlIIIl.remove(IliIlllilIi(dimension, pos.method_10063())) != null) {
         this.IiIlliIliiIl();
         return true;
      } else {
         return false;
      }
   }

   public synchronized boolean lIiiIiIlilli(class_2338 pos, String dimension) {
      return this.iIiiIlIIIl.containsKey(IliIlllilIi(dimension, pos.method_10063()));
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ var5) ^ var5) - '씗'))) - var5) >>> 2 | (char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ var5) ^ var5) - '씗'))) - var5) << 14) - '헂') ^ '\uddcd') - var5) - var5) << 2 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ var5) ^ var5) - '씗'))) - var5) >>> 2 | (char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ var5) ^ var5) - '씗'))) - var5) << 14) - '헂') ^ '\uddcd') - var5) - var5) >>> 14) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ var5) ^ var5) - '씗'))) - var5) >>> 2 | (char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ var5) ^ var5) - '씗'))) - var5) << 14) - '헂') ^ '\uddcd') - var5) - var5) << 2 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ var5) ^ var5) - '씗'))) - var5) >>> 2 | (char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ var5) ^ var5) - '씗'))) - var5) << 14) - '헂') ^ '\uddcd') - var5) - var5) >>> 14) << 13));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public synchronized boolean liiiIIllIl(class_2338 type, String pos, IliliIllliliIl dimension) {
      String var4 = IliIlllilIi(pos, type.method_10063());
      if (this.iIiiIlIIIl.remove(var4) != null) {
         this.IiIlliIliiIl();
         return false;
      } else {
         this.iIiiIlIIIl.put(var4, IiiiIlliiiIl.IliIlllilIi(type, pos, dimension));
         this.IiIlliIliiIl();
         return true;
      }
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) >>> 8 | (char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) << 8) >>> 11 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) >>> 8 | (char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) << 8) << 5) << 14 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) >>> 8 | (char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) << 8) >>> 11 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) >>> 8 | (char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) << 8) << 5) >>> 2) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) >>> 8 | (char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) << 8) >>> 11 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) >>> 8 | (char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) << 8) << 5) << 14 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) >>> 8 | (char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) << 8) >>> 11 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) >>> 8 | (char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) << 8) << 5) >>> 2) << 5) ^ var5) ^ 23352))) - 12340) ^ '꿞') << 10 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) >>> 8 | (char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) << 8) >>> 11 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) >>> 8 | (char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) << 8) << 5) << 14 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) >>> 8 | (char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) << 8) >>> 11 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) >>> 8 | (char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) << 8) << 5) >>> 2) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) >>> 8 | (char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) << 8) >>> 11 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) >>> 8 | (char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) << 8) << 5) << 14 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) >>> 8 | (char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) << 8) >>> 11 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) >>> 8 | (char)((char)((char)((char)((char)(-((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ 3586) ^ var5) ^ var5) + var5) << 8) << 5) >>> 2) << 5) ^ var5) ^ 23352))) - 12340) ^ '꿞') >>> 6));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public synchronized int IIIllIIliIIl() {
      return this.iIiiIlIIIl.size();
   }
}
