package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2338;
import net.minecraft.class_2350;

public final class IiIIiiIlliIIiiIl {
   public final class_2338[] iiillIIlll;
   public final int iIIilIIlll;
   public final int lIIilIIlll;
   public final int IlIilIIlll;
   public final int IIIilIIlll;
   public final class_2350 liillIIlll;
   public final class_2338 IiillIIlll;

   private IiIIiiIlliIIiiIl(class_2338 outsideArea, class_2350 cells, class_2338[] center, int insideArea, int outsideSolid, int face, int usefulCells) {
      this.IiillIIlll = outsideArea;
      this.liillIIlll = cells;
      this.iiillIIlll = center;
      this.IIIilIIlll = insideArea;
      this.lIIilIIlll = outsideSolid;
      this.iIIilIIlll = face;
      this.IlIilIIlll = usefulCells;
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) - 4150) ^ 26036) ^ 10593) >>> 7 | (char)((char)((char)((char)(-((char)(-var4[var5]))) - 4150) ^ 26036) ^ 10593) << 9))) << 2 | (char)(-((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) - 4150) ^ 26036) ^ 10593) >>> 7 | (char)((char)((char)((char)(-((char)(-var4[var5]))) - 4150) ^ 26036) ^ 10593) << 9))) >>> 14) >>> 7 | (char)((char)(-((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) - 4150) ^ 26036) ^ 10593) >>> 7 | (char)((char)((char)((char)(-((char)(-var4[var5]))) - 4150) ^ 26036) ^ 10593) << 9))) << 2 | (char)(-((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) - 4150) ^ 26036) ^ 10593) >>> 7 | (char)((char)((char)((char)(-((char)(-var4[var5]))) - 4150) ^ 26036) ^ 10593) << 9))) >>> 14) << 9) << 4 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) - 4150) ^ 26036) ^ 10593) >>> 7 | (char)((char)((char)((char)(-((char)(-var4[var5]))) - 4150) ^ 26036) ^ 10593) << 9))) << 2 | (char)(-((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) - 4150) ^ 26036) ^ 10593) >>> 7 | (char)((char)((char)((char)(-((char)(-var4[var5]))) - 4150) ^ 26036) ^ 10593) << 9))) >>> 14) >>> 7 | (char)((char)(-((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) - 4150) ^ 26036) ^ 10593) >>> 7 | (char)((char)((char)((char)(-((char)(-var4[var5]))) - 4150) ^ 26036) ^ 10593) << 9))) << 2 | (char)(-((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) - 4150) ^ 26036) ^ 10593) >>> 7 | (char)((char)((char)((char)(-((char)(-var4[var5]))) - 4150) ^ 26036) ^ 10593) << 9))) >>> 14) << 9) >>> 12) ^ 10668));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String toString() {
      return lIiiIiIlilli<invokedynamic>() + this.IiillIIlll.method_10263() + lIiiIiIlilli<invokedynamic>() + this.IiillIIlll.method_10264() + lIiiIiIlilli<invokedynamic>() + this.IiillIIlll.method_10260() + lIiiIiIlilli<invokedynamic>() + this.liillIIlll + lIiiIiIlilli<invokedynamic>() + 9 + lIiiIiIlilli<invokedynamic>() + this.IIIilIIlll + lIiiIiIlilli<invokedynamic>() + this.lIIilIIlll + lIiiIiIlilli<invokedynamic>() + this.iIIilIIlll + lIiiIiIlilli<invokedynamic>() + this.IlIilIIlll + lIiiIiIlilli<invokedynamic>() + this.liiiIIllIl();
   }

   public boolean iIlIlllllill(class_2350.class_2351 normal) {
      return this.liillIIlll.method_10166() == normal;
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - var5) << 1 | (char)(var4[var5] - var5) >>> 15) - var5) >>> 12 | (char)((char)((char)(var4[var5] - var5) << 1 | (char)(var4[var5] - var5) >>> 15) - var5) << 4))) >>> 2 | (char)(~((char)((char)((char)((char)(var4[var5] - var5) << 1 | (char)(var4[var5] - var5) >>> 15) - var5) >>> 12 | (char)((char)((char)(var4[var5] - var5) << 1 | (char)(var4[var5] - var5) >>> 15) - var5) << 4))) << 14) + var5) - '뙆') << 11 | (char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - var5) << 1 | (char)(var4[var5] - var5) >>> 15) - var5) >>> 12 | (char)((char)((char)(var4[var5] - var5) << 1 | (char)(var4[var5] - var5) >>> 15) - var5) << 4))) >>> 2 | (char)(~((char)((char)((char)((char)(var4[var5] - var5) << 1 | (char)(var4[var5] - var5) >>> 15) - var5) >>> 12 | (char)((char)((char)(var4[var5] - var5) << 1 | (char)(var4[var5] - var5) >>> 15) - var5) << 4))) << 14) + var5) - '뙆') >>> 5))) >>> 11 | (char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - var5) << 1 | (char)(var4[var5] - var5) >>> 15) - var5) >>> 12 | (char)((char)((char)(var4[var5] - var5) << 1 | (char)(var4[var5] - var5) >>> 15) - var5) << 4))) >>> 2 | (char)(~((char)((char)((char)((char)(var4[var5] - var5) << 1 | (char)(var4[var5] - var5) >>> 15) - var5) >>> 12 | (char)((char)((char)(var4[var5] - var5) << 1 | (char)(var4[var5] - var5) >>> 15) - var5) << 4))) << 14) + var5) - '뙆') << 11 | (char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - var5) << 1 | (char)(var4[var5] - var5) >>> 15) - var5) >>> 12 | (char)((char)((char)(var4[var5] - var5) << 1 | (char)(var4[var5] - var5) >>> 15) - var5) << 4))) >>> 2 | (char)(~((char)((char)((char)((char)(var4[var5] - var5) << 1 | (char)(var4[var5] - var5) >>> 15) - var5) >>> 12 | (char)((char)((char)(var4[var5] - var5) << 1 | (char)(var4[var5] - var5) >>> 15) - var5) << 4))) << 14) + var5) - '뙆') >>> 5))) << 5))) - var5) + 16431))) - var5) + var5) ^ var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) ^ 8808))) ^ var5))) >>> 7 | (char)(~((char)((char)(-((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) ^ 8808))) ^ var5))) << 9) >>> 5 | (char)((char)(~((char)((char)(-((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) ^ 8808))) ^ var5))) >>> 7 | (char)(~((char)((char)(-((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) ^ 8808))) ^ var5))) << 9) << 11) ^ 7264) - '袕') + var5) ^ var5) - 26159) ^ 24911));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean liiiIIllIl() {
      return this.iIIilIIlll == 0 && this.IlIilIIlll >= 1;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 32420) ^ 23957) - var5) - 14233) + '貔') + var5) ^ var5) << 12 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 32420) ^ 23957) - var5) - 14233) + '貔') + var5) ^ var5) >>> 4))) - 14648))) >>> 1 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 32420) ^ 23957) - var5) - 14233) + '貔') + var5) ^ var5) << 12 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 32420) ^ 23957) - var5) - 14233) + '貔') + var5) ^ var5) >>> 4))) - 14648))) << 15) - var5) >>> 15 | (char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 32420) ^ 23957) - var5) - 14233) + '貔') + var5) ^ var5) << 12 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 32420) ^ 23957) - var5) - 14233) + '貔') + var5) ^ var5) >>> 4))) - 14648))) >>> 1 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 32420) ^ 23957) - var5) - 14233) + '貔') + var5) ^ var5) << 12 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 32420) ^ 23957) - var5) - 14233) + '貔') + var5) ^ var5) >>> 4))) - 14648))) << 15) - var5) << 1) - '\uf8fd'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static IiIIiiIlliIIiiIl IliIlllilIi(lilIIliilIIl w, class_2338 face, class_2350 center) {
      class_2338[] var3 = new class_2338[9];
      int[] var4 = new int[4];
      int[] var5 = new int[]{0};
      IiIIIlIiliIIIlIi.liiiIIllIl(face, center, (cells, x, y) -> {
         int var10004 = var5[0];
         int var10001 = var5[0];
         var5[0] = var10004 + 1;
         var3[var10001] = new class_2338(cells, x, y);
         if (w.IliIlllilIi(cells, x, y)) {
            int var10002 = var4[0]++;
            if (w.liiiIIllIl(cells, x, y)) {
               var10002 = var4[3]++;
            }
         } else {
            int var8 = var4[1]++;
            if (w.iIlIlllllill(cells, x, y)) {
               var8 = var4[2]++;
            }
         }

      });
      return new IiIIiiIlliIIiiIl(face, center, var3, var4[0], var4[1], var4[2], var4[3]);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) >>> 12 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) << 4) >>> 3 | (char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) >>> 12 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) << 4) << 13) + var5) + var5) ^ var5) << 14 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) >>> 12 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) << 4) >>> 3 | (char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) >>> 12 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) << 4) << 13) + var5) + var5) ^ var5) >>> 2) + '\ue603') ^ 4731) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) >>> 12 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) << 4) >>> 3 | (char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) >>> 12 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) << 4) << 13) + var5) + var5) ^ var5) << 14 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) >>> 12 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) << 4) >>> 3 | (char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) >>> 12 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) << 4) << 13) + var5) + var5) ^ var5) >>> 2) + '\ue603') ^ 4731) << 8) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) >>> 12 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) << 4) >>> 3 | (char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) >>> 12 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) << 4) << 13) + var5) + var5) ^ var5) << 14 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) >>> 12 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) << 4) >>> 3 | (char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) >>> 12 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) << 4) << 13) + var5) + var5) ^ var5) >>> 2) + '\ue603') ^ 4731) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) >>> 12 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) << 4) >>> 3 | (char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) >>> 12 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) << 4) << 13) + var5) + var5) ^ var5) << 14 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) >>> 12 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) << 4) >>> 3 | (char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) >>> 12 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') >>> 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 16198) ^ var5) - var5) ^ '蔁') << 5))) << 4) << 13) + var5) + var5) ^ var5) >>> 2) + '\ue603') ^ 4731) << 8) >>> 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2031727714044413021L ^ Long.rotateLeft(-6895947430984438719L, 13) ^ 8760659589618590322L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -8182247245120519087L ^ Long.rotateLeft(799551787112056379L, 10) ^ 8626120591897240811L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -403001298777311797L ^ Long.rotateLeft(5291899324701471747L, 47) ^ -3075676937592237354L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 2719364910580124403L ^ Long.rotateLeft(3702576061027231277L, 1) ^ -8815617117407787866L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2956145060239141265L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 3855778735602592042L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5927668855614655319L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7288975871872862030L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6021456606483249126L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4964181883440419097L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iliIiiliiiii<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIIllIIliIIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IlIlllIlilIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IiIlliIliiIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIlllIlliIll<invokedynamic>());
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
}
