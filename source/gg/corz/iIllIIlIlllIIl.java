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
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_12079;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_742;

public class iIllIIlIlllIIl extends ilIllIiIll implements IiIiilliIiil {
   private static final String IIlllliIllIlllliIl = "corzclient";
   private final lliliIIiililiIIi lIIllliIliIIllliIl = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IIllllIlll());
   private static final Map<class_2960, IiilllIiliilllIi> liIllliIliiIllliIl;
   public static class_2960 IilllliIllilllliIl;
   public final IiIllIliliIllIli iilllliIlIIillliIl = new IiIllIliliIllIli();
   private static iIllIIlIlllIIl lllllliIlillllliIl;
   private final iiIiiilIIliiil IlIllliIlllIllliIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final String iIlllliIlIllllliIl = "textures/capes/";
   public static final String IiiIlliIlliiIlliIl = "None";
   private static final Map<String, class_2960> iiiIlliIlIIIllliIl = new LinkedHashMap();
   private final iiIiiilIIliiil ilIllliIlIiIllliIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);

   public iIllIIlIlllIIl() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lIIllliIliIIllliIl, this.IlIllliIlllIllliIl, this.ilIllliIlIiIllliIl});
      lllllliIlillllliIl = this;
   }

   public static class_12079.class_12081 Ilillllill(class_2960 tex) {
      return (class_12079.class_12081)liIllliIliiIllliIl.computeIfAbsent(tex, IiilllIiliilllIi::new);
   }

   public class_2960 Iillllilll() {
      String var1 = this.lIIllliIliIIllliIl.Iilllilliill();
      return IliIlllilIi<invokedynamic>().equals(var1) ? null : (class_2960)iiiIlliIlIIIllliIl.get(var1);
   }

   public static boolean iIlllIllll() {
      iIllIIlIlllIIl var0 = lllllliIlillllliIl;
      return var0 == null || var0.ilIllliIlIiIllliIl.Iilllilliill();
   }

   public void IlIllllIll(double mx, double my) {
      this.iilllliIlIIillliIl.iIlIlllllill(mx, my);
   }

   public void ilIllIiIll() {
      this.iilllliIlIIillliIl.IilliliilIIi();
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) + '\uf2bb') << 5 | (char)((char)(-var4[var5]) + '\uf2bb') >>> 11) << 1 | (char)((char)((char)(-var4[var5]) + '\uf2bb') << 5 | (char)((char)(-var4[var5]) + '\uf2bb') >>> 11) >>> 15) - '턔') >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + '\uf2bb') << 5 | (char)((char)(-var4[var5]) + '\uf2bb') >>> 11) << 1 | (char)((char)((char)(-var4[var5]) + '\uf2bb') << 5 | (char)((char)(-var4[var5]) + '\uf2bb') >>> 11) >>> 15) - '턔') << 14))) ^ var5) ^ 'ﳄ') >>> 14 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) + '\uf2bb') << 5 | (char)((char)(-var4[var5]) + '\uf2bb') >>> 11) << 1 | (char)((char)((char)(-var4[var5]) + '\uf2bb') << 5 | (char)((char)(-var4[var5]) + '\uf2bb') >>> 11) >>> 15) - '턔') >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + '\uf2bb') << 5 | (char)((char)(-var4[var5]) + '\uf2bb') >>> 11) << 1 | (char)((char)((char)(-var4[var5]) + '\uf2bb') << 5 | (char)((char)(-var4[var5]) + '\uf2bb') >>> 11) >>> 15) - '턔') << 14))) ^ var5) ^ 'ﳄ') << 2) << 9 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) + '\uf2bb') << 5 | (char)((char)(-var4[var5]) + '\uf2bb') >>> 11) << 1 | (char)((char)((char)(-var4[var5]) + '\uf2bb') << 5 | (char)((char)(-var4[var5]) + '\uf2bb') >>> 11) >>> 15) - '턔') >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + '\uf2bb') << 5 | (char)((char)(-var4[var5]) + '\uf2bb') >>> 11) << 1 | (char)((char)((char)(-var4[var5]) + '\uf2bb') << 5 | (char)((char)(-var4[var5]) + '\uf2bb') >>> 11) >>> 15) - '턔') << 14))) ^ var5) ^ 'ﳄ') >>> 14 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) + '\uf2bb') << 5 | (char)((char)(-var4[var5]) + '\uf2bb') >>> 11) << 1 | (char)((char)((char)(-var4[var5]) + '\uf2bb') << 5 | (char)((char)(-var4[var5]) + '\uf2bb') >>> 11) >>> 15) - '턔') >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) + '\uf2bb') << 5 | (char)((char)(-var4[var5]) + '\uf2bb') >>> 11) << 1 | (char)((char)((char)(-var4[var5]) + '\uf2bb') << 5 | (char)((char)(-var4[var5]) + '\uf2bb') >>> 11) >>> 15) - '턔') << 14))) ^ var5) ^ 'ﳄ') << 2) >>> 7));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static class_2960 iilllIIill(class_742 player) {
      if (class_310.method_1551().field_1724 != player) {
         return null;
      } else if (IilllliIllilllliIl != null) {
         return IilllliIllilllliIl;
      } else {
         ilIllIiIll var1 = llilIllililIll.iliIiiliiiii(iIllIIlIlllIIl.class);
         if (var1 instanceof iIllIIlIlllIIl) {
            iIllIIlIlllIIl var2 = (iIllIIlIlllIIl)var1;
            if (var2.IliIlllilIi()) {
               if (!var2.IlIllliIlllIllliIl.Iilllilliill()) {
                  return null;
               }

               return var2.Iillllilll();
            }
         }

         return null;
      }
   }

   public class_2960 lIilliIill() {
      return this.Iillllilll();
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '\uf0e3') ^ var5) - var5) >>> 15 | (char)((char)((char)(var4[var5] + '\uf0e3') ^ var5) - var5) << 1) + var5) << 7 | (char)((char)((char)((char)((char)(var4[var5] + '\uf0e3') ^ var5) - var5) >>> 15 | (char)((char)((char)(var4[var5] + '\uf0e3') ^ var5) - var5) << 1) + var5) >>> 9) + '齯'))) ^ '蛰') ^ 'ퟻ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static class_2960 liIlliiIll(String name) {
      return class_2960.method_60655(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>() + name + IliIlllilIi<invokedynamic>());
   }

   static {
      iiiIlliIlIIIllliIl.put(IliIlllilIi<invokedynamic>(), liIlliiIll(IliIlllilIi<invokedynamic>()));
      iiiIlliIlIIIllliIl.put(IliIlllilIi<invokedynamic>(), liIlliiIll(IliIlllilIi<invokedynamic>()));
      iiiIlliIlIIIllliIl.put(IliIlllilIi<invokedynamic>(), liIlliiIll(IliIlllilIi<invokedynamic>()));
      iiiIlliIlIIIllliIl.put(IliIlllilIi<invokedynamic>(), liIlliiIll(IliIlllilIi<invokedynamic>()));
      iiiIlliIlIIIllliIl.put(IliIlllilIi<invokedynamic>(), liIlliiIll(IliIlllilIi<invokedynamic>()));
      iiiIlliIlIIIllliIl.put(IliIlllilIi<invokedynamic>(), liIlliiIll(IliIlllilIi<invokedynamic>()));
      iiiIlliIlIIIllliIl.put(IliIlllilIi<invokedynamic>(), liIlliiIll(IliIlllilIi<invokedynamic>()));
      iiiIlliIlIIIllliIl.put(IliIlllilIi<invokedynamic>(), liIlliiIll(IliIlllilIi<invokedynamic>()));
      iiiIlliIlIIIllliIl.put(IliIlllilIi<invokedynamic>(), liIlliiIll(IliIlllilIi<invokedynamic>()));
      iiiIlliIlIIIllliIl.put(IliIlllilIi<invokedynamic>(), liIlliiIll(IliIlllilIi<invokedynamic>()));
      liIllliIliiIllliIl = new HashMap();
      IilllliIllilllliIl = null;
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -502296280658738572L ^ Long.rotateLeft(-6633728637135997619L, 34) ^ 7881459010745947451L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -8426523149402525533L ^ Long.rotateLeft(2981907452547273743L, 44) ^ 9188427915884945526L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2815036472811378040L ^ Long.rotateLeft(1230452026442149317L, 42) ^ 5463345810750740181L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 6996974801985070584L ^ Long.rotateLeft(-8790916657030798126L, 47) ^ -1743812088083107718L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8517998103999458989L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -4850515565579856611L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7712773363676555295L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 2938251784419243935L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 2008791600491883211L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4650636445116668377L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, lIiiIiIlilli<invokedynamic>());
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

   public static boolean lllllillll(class_2960 texture) {
      return texture != null && IliIlllilIi<invokedynamic>().equals(texture.method_12836()) && texture.method_12832().startsWith(IliIlllilIi<invokedynamic>());
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] + 21600) ^ var5) - var5))) - var5))) << 10 | (char)(-((char)((char)(-((char)((char)((char)(var4[var5] + 21600) ^ var5) - var5))) - var5))) >>> 6) - var5) - '耳'))) ^ 1634) + var5) ^ var5))) - '\ud8db'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) ^ var5) ^ 23848) ^ 12979) ^ 10587))))) << 11 | (char)(-((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) ^ var5) ^ 23848) ^ 12979) ^ 10587))))) >>> 5) + var5) ^ '\uec80') + 6252) >>> 10 | (char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) ^ var5) ^ 23848) ^ 12979) ^ 10587))))) << 11 | (char)(-((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) ^ var5) ^ 23848) ^ 12979) ^ 10587))))) >>> 5) + var5) ^ '\uec80') + 6252) << 6) + var5))) - 'ﴘ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] - var5) >>> 4 | (char)(var4[var5] - var5) << 12) - '螃') << 1 | (char)((char)((char)(var4[var5] - var5) >>> 4 | (char)(var4[var5] - var5) << 12) - '螃') >>> 15))))) + var5) + var5))))) >>> 7 | (char)(~((char)(~((char)((char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] - var5) >>> 4 | (char)(var4[var5] - var5) << 12) - '螃') << 1 | (char)((char)((char)(var4[var5] - var5) >>> 4 | (char)(var4[var5] - var5) << 12) - '螃') >>> 15))))) + var5) + var5))))) << 9) + var5) << 1 | (char)((char)((char)(~((char)(~((char)((char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] - var5) >>> 4 | (char)(var4[var5] - var5) << 12) - '螃') << 1 | (char)((char)((char)(var4[var5] - var5) >>> 4 | (char)(var4[var5] - var5) << 12) - '螃') >>> 15))))) + var5) + var5))))) >>> 7 | (char)(~((char)(~((char)((char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] - var5) >>> 4 | (char)(var4[var5] - var5) << 12) - '螃') << 1 | (char)((char)((char)(var4[var5] - var5) >>> 4 | (char)(var4[var5] - var5) << 12) - '螃') >>> 15))))) + var5) + var5))))) << 9) + var5) >>> 15) ^ '똚'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iiiIlIIIll(class_332 w, int x, int h, int ctx, int y) {
      this.iilllliIlIIillliIl.IliIlllilIi(w, x, h, ctx, y, this.lIilliIill());
   }

   public boolean lIIlliIIll(double mx, double my, int y, int button, int w, int h, int x) {
      return this.iilllliIlIIillliIl.liiiIIllIl(mx, my, y, button, w, h, x);
   }

   private static String[] IIllllIlll() {
      String[] var0 = new String[iiiIlliIlIIIllliIl.size() + 1];
      var0[0] = IliIlllilIi<invokedynamic>();
      int var1 = 1;

      for(String var3 : iiiIlliIlIIIllliIl.keySet()) {
         var0[var1++] = var3;
      }

      return var0;
   }
}
