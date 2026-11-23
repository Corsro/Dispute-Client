package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class llllliIiilllliIi {
   private static final int IIlliliIIi = 20;
   private final Map<IIliiilIliii, llillliilillli> iiIliliIIi = new EnumMap(IIliiilIliii.class);

   private llillliilillli IlIlllIlilIl(IIliiilIliii g) {
      return (llillliilillli)this.iiIliliIIi.computeIfAbsent(g == null ? IIliiilIliii.iiiiIIiIlIIIIlIiIl : g, (k) -> new llillliilillli());
   }

   public double iliIiiliiiii(IIliiilIliii g) {
      llillliilillli var2 = this.IlIlllIlilIl(g);
      return var2.llliIiIIIl <= 0L ? (double)0.0F : (double)var2.llliIiIIIl / (IiIlliIliiIl(var2) / (double)60.0F);
   }

   private static double IiIlliIliiIl(llillliilillli s) {
      long var2 = -4907061852654364517L;
      var2 ^= ((long)(s.lliiIiIIIl < 0 ? 0 : s.iliiIiIIIl - s.lliiIiIIIl) << 32 ^ var2) & -1L << 32;
      return Math.max((double)1.0F, (double)((int)(var2 >>> 32)) / (double)20.0F);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -3692375498169629619L ^ Long.rotateLeft(-8435339747932900967L, 63) ^ 7525072620975936975L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6013598308480585826L ^ Long.rotateLeft(647919665102534770L, 58) ^ 5536813193954427906L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2281408536565363557L ^ Long.rotateLeft(4549840576317566384L, 31) ^ -7755366714148205023L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 6821957760379864754L ^ Long.rotateLeft(7825564533280343846L, 10) ^ 8745995134174259966L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8856666348404496465L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -4108095824037512661L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -2489976921244694329L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2827702628976058293L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8865383488252606076L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -3837005075269690770L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iilllilliill<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIillIiliIil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Ililllililil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Iiilliiliiil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIIilIIiiIIi<invokedynamic>());
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
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) + var5) << 3 | (char)((char)(~((char)(-var4[var5]))) + var5) >>> 13) - var5) + '\ue16f') - 24012) + '쐏'))) - '\uda9c'))) + var5) - '遮') - var5) >>> 15 | (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) + var5) << 3 | (char)((char)(~((char)(-var4[var5]))) + var5) >>> 13) - var5) + '\ue16f') - 24012) + '쐏'))) - '\uda9c'))) + var5) - '遮') - var5) << 1) + '\udc73') - var5) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static IIliiilIliii IliIlllilIi(String deck, boolean recipeKind, boolean interactiveBlock, boolean accessPlan, boolean missionKind, boolean multiface, String sixWay) {
      long var10 = 2000023310874173809L;
      String var7 = sixWay == null ? "" : sixWay;
      if (accessPlan) {
         return IIliiilIliii.lliiIIiIliliiIIiIl;
      } else if (multiface) {
         return IIliiilIliii.IiiiIIiIlliiiIIiIl;
      } else if (!interactiveBlock && !var7.equals(Illlllllilll<invokedynamic>())) {
         if (!recipeKind && !var7.equals(Illlllllilll<invokedynamic>())) {
            if (missionKind) {
               return IIliiilIliii.iIiiIIiIlIliiIIiIl;
            } else {
               var10 ^= ((long)Illlllllilll<invokedynamic>().equals(deck) << 32 ^ var10) & -1L << 32;
               var10 ^= ((long)(!var7.equals(Illlllllilll<invokedynamic>()) && !var7.equals(Illlllllilll<invokedynamic>()) && !var7.equals(Illlllllilll<invokedynamic>()) ? 0 : 1) ^ var10) & -1L >>> 32;
               return (int)(var10 >>> 32) != 0 && (int)var10 != 0 ? IIliiilIliii.illiIIiIlIiliIIiIl : IIliiilIliii.iiiiIIiIlIIIIlIiIl;
            }
         } else {
            return IIliiilIliii.liliIIiIliiliIIiIl;
         }
      } else {
         return IIliiilIliii.IIiiIIiIllIiiIIiIl;
      }
   }

   public void iIlIlllllill(IIliiilIliii g) {
      ++this.IlIlllIlilIl(g).liliIiIIIl;
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) >>> 2) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) >>> 2) >>> 5) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) >>> 2) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) >>> 2) >>> 5) << 8) + var5))) + 1554) << 2 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) >>> 2) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) >>> 2) >>> 5) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) >>> 2) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) >>> 2) >>> 5) << 8) + var5))) + 1554) >>> 14) + var5) >>> 6 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) >>> 2) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) >>> 2) >>> 5) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) >>> 2) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) >>> 2) >>> 5) << 8) + var5))) + 1554) << 2 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) >>> 2) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) >>> 2) >>> 5) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) >>> 2) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) ^ var5) + var5) >>> 9) ^ '郛') ^ var5) + 31883) + var5) >>> 2) >>> 5) << 8) + var5))) + 1554) >>> 14) + var5) << 10));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 26299) >>> 1 | (char)(var4[var5] ^ 26299) << 15) - var5) - var5) << 5 | (char)((char)((char)((char)(var4[var5] ^ 26299) >>> 1 | (char)(var4[var5] ^ 26299) << 15) - var5) - var5) >>> 11) ^ var5))))) + var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) + '츸') + 18522) + 32311))) + var5) - '\udff1') - '렋') + var5))) + var5))) >>> 14 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) + '츸') + 18522) + 32311))) + var5) - '\udff1') - '렋') + var5))) + var5))) << 2) ^ var5) + 29865) - var5))))) + '騯'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IIIllIIliIIl(int tick) {
      long var12 = 5063774035518119402L;
      StringBuilder var2 = new StringBuilder();
      IIliiilIliii[] var3 = IIliiilIliii.values();
      var12 ^= ((long)var3.length << 32 ^ var12) & -1L << 32;

      for(long var15 = var12 ^ (0L ^ var12) & -1L >>> 32; (int)var15 < (int)(var15 >>> 32); var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32) {
         IIliiilIliii var6 = var3[(int)var15];
         llillliilillli var7 = (llillliilillli)this.iiIliliIIi.get(var6);
         if (var7 != null && var7.llliIiIIIl > 0L) {
            if (var2.length() > 0) {
               var2.append(' ');
            }

            double var8 = IiIlliIliiIl(var7);
            double var10 = var7.lIiiIiIIIl <= 0L ? (double)0.0F : (double)var7.IIiiIiIIIl / (double)var7.lIiiIiIIIl;
            var2.append(String.format(Locale.ROOT, Illlllllilll<invokedynamic>(), var6.name(), var7.llliIiIIIl, (double)var7.llliIiIIIl / (var8 / (double)60.0F), var7.iIiiIiIIIl / (double)var7.llliIiIIIl, var7.IliiIiIIIl / (double)var7.llliIiIIIl, (double)var7.illiIiIIIl / (var8 * (double)20.0F), var7.IiliIiIIIl, var7.liliIiIIIl, var7.iiliIiIIIl, var10));
         }
      }

      return var2.toString();
   }

   public void liiiIIllIl(IIliiilIliii sneakTicks, int rotationDegrees, double rollback, double g, int missionSwitches, boolean walkBlocks, int tick) {
      llillliilillli var10 = this.IlIlllIlilIl(sneakTicks);
      ++var10.llliIiIIIl;
      if (var10.lliiIiIIIl < 0) {
         var10.lliiIiIIIl = rotationDegrees;
      }

      var10.iliiIiIIIl = rotationDegrees;
      var10.iIiiIiIIIl += rollback;
      var10.IliiIiIIIl += g;
      var10.illiIiIIIl += (long)Math.max(0, missionSwitches);
      if (walkBlocks) {
         ++var10.IiliIiIIIl;
      }

      var10.iiliIiIIIl += (long)Math.max(0, tick);
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) >>> 2 | (char)(var4[var5] ^ var5) << 14) >>> 14 | (char)((char)(var4[var5] ^ var5) >>> 2 | (char)(var4[var5] ^ var5) << 14) << 2) >>> 2 | (char)((char)((char)(var4[var5] ^ var5) >>> 2 | (char)(var4[var5] ^ var5) << 14) >>> 14 | (char)((char)(var4[var5] ^ var5) >>> 2 | (char)(var4[var5] ^ var5) << 14) << 2) << 14))) << 6 | (char)(-((char)((char)((char)((char)(var4[var5] ^ var5) >>> 2 | (char)(var4[var5] ^ var5) << 14) >>> 14 | (char)((char)(var4[var5] ^ var5) >>> 2 | (char)(var4[var5] ^ var5) << 14) << 2) >>> 2 | (char)((char)((char)(var4[var5] ^ var5) >>> 2 | (char)(var4[var5] ^ var5) << 14) >>> 14 | (char)((char)(var4[var5] ^ var5) >>> 2 | (char)(var4[var5] ^ var5) << 14) << 2) << 14))) >>> 10) + var5) + '룝'))) - '걱') + var5) << 11 | (char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) >>> 2 | (char)(var4[var5] ^ var5) << 14) >>> 14 | (char)((char)(var4[var5] ^ var5) >>> 2 | (char)(var4[var5] ^ var5) << 14) << 2) >>> 2 | (char)((char)((char)(var4[var5] ^ var5) >>> 2 | (char)(var4[var5] ^ var5) << 14) >>> 14 | (char)((char)(var4[var5] ^ var5) >>> 2 | (char)(var4[var5] ^ var5) << 14) << 2) << 14))) << 6 | (char)(-((char)((char)((char)((char)(var4[var5] ^ var5) >>> 2 | (char)(var4[var5] ^ var5) << 14) >>> 14 | (char)((char)(var4[var5] ^ var5) >>> 2 | (char)(var4[var5] ^ var5) << 14) << 2) >>> 2 | (char)((char)((char)(var4[var5] ^ var5) >>> 2 | (char)(var4[var5] ^ var5) << 14) >>> 14 | (char)((char)(var4[var5] ^ var5) >>> 2 | (char)(var4[var5] ^ var5) << 14) << 2) << 14))) >>> 10) + var5) + '룝'))) - '걱') + var5) >>> 5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IilliliilIIi(IIliiilIliii g, int length) {
      llillliilillli var3 = this.IlIlllIlilIl(g);
      ++var3.lIiiIiIIIl;
      var3.IIiiIiIIIl += (long)length;
   }

   public long lIiiIiIlilli(IIliiilIliii g) {
      return this.IlIlllIlilIl(g).llliIiIIIl;
   }
}
