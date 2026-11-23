package gg.corz;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
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
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1792;
import net.minecraft.class_2960;
import net.minecraft.class_7923;

public class IIIlIlIllIIlIlIl extends IilliIllilliIl {
   private final List<class_1792> ilIIliilIl;
   private final List<class_1792> IiIIliilIl;

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) << 6 | (char)(-var4[var5]) >>> 10) ^ var5) + var5) - 18104) + 'ꙥ'))) ^ 5255) - '\uea0c') - '휙'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IiIiliIiiiIi() {
      long var3 = 1770235172947398638L;
      StringBuilder var1 = new StringBuilder();

      for(long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < this.IiIIliilIl.size(); var5 += 4294967296L) {
         var1.append(class_7923.field_41178.method_10221((class_1792)this.IiIIliilIl.get((int)(var5 >>> 32))).toString());
         if ((int)(var5 >>> 32) < this.IiIIliilIl.size() - 1) {
            var1.append(IliIlllilIi<invokedynamic>());
         }
      }

      return var1.toString();
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ '闸'))) ^ var5) + var5) - 20618) ^ var5))) - var5) ^ var5)) ^ 'ꠑ') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) + '跿') ^ 19018) + var5) + var5) - var5))))) >>> 3 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) + '跿') ^ 19018) + var5) + var5) - var5))))) << 13) + var5))) << 11 | (char)(-((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) + '跿') ^ 19018) + var5) + var5) - var5))))) >>> 3 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) + '跿') ^ 19018) + var5) + var5) - var5))))) << 13) + var5))) >>> 5) - var5) - 15379))) << 2 | (char)(~((char)((char)((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) + '跿') ^ 19018) + var5) + var5) - var5))))) >>> 3 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) + '跿') ^ 19018) + var5) + var5) - var5))))) << 13) + var5))) << 11 | (char)(-((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) + '跿') ^ 19018) + var5) + var5) - var5))))) >>> 3 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) + '跿') ^ 19018) + var5) + var5) - var5))))) << 13) + var5))) >>> 5) - var5) - 15379))) >>> 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public JsonElement IIlllIlliIll() {
      return new JsonPrimitive(this.IiIiliIiiiIi());
   }

   public void Ililllililil(class_1792 item) {
      if (this.IiIIliilIl.remove(item)) {
         iiiIIIlIIIlIIl.liiiIIllIl();
      }

   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) << 10 | (char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) >>> 6) + var5) >>> 11 | (char)((char)((char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) << 10 | (char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) >>> 6) + var5) << 5))) << 15 | (char)(-((char)((char)((char)((char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) << 10 | (char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) >>> 6) + var5) >>> 11 | (char)((char)((char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) << 10 | (char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) >>> 6) + var5) << 5))) >>> 1))) + var5) + var5))) ^ 'ꆡ') << 1 | (char)((char)(~((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) << 10 | (char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) >>> 6) + var5) >>> 11 | (char)((char)((char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) << 10 | (char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) >>> 6) + var5) << 5))) << 15 | (char)(-((char)((char)((char)((char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) << 10 | (char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) >>> 6) + var5) >>> 11 | (char)((char)((char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) << 10 | (char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) >>> 6) + var5) << 5))) >>> 1))) + var5) + var5))) ^ 'ꆡ') >>> 15))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(~var4[var5]))) >>> 2 | (char)(~((char)(~var4[var5]))) << 14) ^ '耞') ^ var5))) << 8 | (char)(~((char)((char)((char)((char)(~((char)(~var4[var5]))) >>> 2 | (char)(~((char)(~var4[var5]))) << 14) ^ '耞') ^ var5))) >>> 8) + 8592) - '뚮') + var5) - 6765) - var5) + 14416));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean Iiilliiliiil(class_1792 item) {
      return this.IiIIliilIl.contains(item);
   }

   public void IIillIiliIil(class_1792 item) {
      if (!this.IiIIliilIl.contains(item)) {
         this.IiIIliilIl.add(item);
         iiiIIIlIIIlIIl.liiiIIllIl();
      }

   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -1872798958876530584L ^ Long.rotateLeft(5316688074083309624L, 58) ^ 529642963961353813L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6448579918992296136L ^ Long.rotateLeft(9184037614344448667L, 34) ^ -5264146294067199629L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 614207525967800565L ^ Long.rotateLeft(6969475096888039506L, 35) ^ 1213883250686564513L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1964619699569990171L ^ Long.rotateLeft(-6657791615361203801L, 9) ^ 341377083347514173L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1181686538584457932L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3233822388846238371L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4590876178472501263L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2058823624579641350L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -5440791503303134424L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -375613615206683346L;
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

   public void IIlilIliiIli(String data) {
      long var7 = -5991454515831817989L;
      this.IiIIliilIl.clear();
      if (data != null && !data.isBlank()) {
         String[] var2 = data.split(IliIlllilIi<invokedynamic>());
         var7 ^= ((long)var2.length << 32 ^ var7) & -1L << 32;

         for(long var11 = var7 ^ (0L ^ var7) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
            String var5 = var2[(int)var11];
            var5 = var5.trim();
            if (!var5.isEmpty()) {
               class_1792 var6 = (class_1792)class_7923.field_41178.method_63535(class_2960.method_60654(var5));
               if (var6 != null) {
                  this.IiIIliilIl.add(var6);
               }
            }
         }

         iiiIIIlIIIlIIl.liiiIIllIl();
      }
   }

   public void IlIillIiilIi() {
      this.IiIIliilIl.clear();
      this.IiIIliilIl.addAll(this.ilIIliilIl);
      iiiIIIlIIIlIIl.liiiIIllIl();
   }

   public iiiiIlllIIIIllll Illlllllilll(JsonElement element) {
      if (element != null && element.isJsonPrimitive()) {
         try {
            this.IIlilIliiIli(element.getAsString());
            return iiiiIlllIIIIllll.lIilllIill;
         } catch (Exception var3) {
            return iiiiIlllIIIIllll.IIilllIill;
         }
      } else {
         return iiiiIlllIIIIllll.IIilllIill;
      }
   }

   public IIIlIlIllIIlIlIl(String name, String description, List<class_1792> defaultItems) {
      super(name, description);
      this.ilIIliilIl = new ArrayList(defaultItems);
      this.IiIIliilIl = new ArrayList(defaultItems);
   }

   public List<class_1792> Iilllilliill() {
      return this.IiIIliilIl;
   }

   public iIiIiIIlIliIiIIl IiIlliIliiIl() {
      return iIiIiIIlIliIiIIl.lIiIlIilIl;
   }

   public void IIIilIIiiIIi(class_1792 item) {
      if (this.Iiilliiliiil(item)) {
         this.Ililllililil(item);
      } else {
         this.IIillIiliIil(item);
      }

   }
}
