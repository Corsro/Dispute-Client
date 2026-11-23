package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public record ililllilIiilllil(int v, String name, String uuid, long updated, int fights, iilIlIilIIiIlIil cal, lliiliiliili habits, Map<String, Map<String, double[]>> arms, int[] stats) {
   private final Map<String, Map<String, double[]>> iillliiIil;
   private final int illlliiIil;
   private final String IlllliiIil;
   private final String iIllliiIil;
   private final int[] IIilliiIil;
   private final lliiliiliili lillliiIil;
   private final iilIlIilIIiIlIil IillliiIil;
   private final int lIllliiIil;
   private final long llllliiIil;

   public String lIiiIiIlilli() {
      return this.IlllliiIil;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -2411945750675235904L ^ Long.rotateLeft(-5074914228952071557L, 27) ^ 3835624300963941033L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 585196921863713146L ^ Long.rotateLeft(7538735722961497340L, 34) ^ -1916488937410295411L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8496831278494062234L ^ Long.rotateLeft(-8291842385172844141L, 37) ^ 5589109121883515576L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1003095706733606979L ^ Long.rotateLeft(4212857468012791772L, 30) ^ -1188691401385071267L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3713378081479434689L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 3537446480350763956L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1035754140965881919L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -4261795805628364598L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 109157404517198341L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 7907755055691942738L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIillIiliIil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Ililllililil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iiilliiliiil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIIilIIiiIIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IlIillIiilIi<invokedynamic>());
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

   public long iliIiiliiiii() {
      return this.llllliiIil;
   }

   private static boolean IliIlllilIi(Map<String, Map<String, double[]>> b, Map<String, Map<String, double[]>> a) {
      if (b == a) {
         return true;
      } else if (b != null && a != null && b.size() == a.size()) {
         label47:
         for(Map.Entry var3 : b.entrySet()) {
            Map var4 = (Map)var3.getValue();
            Map var5 = (Map)a.get(var3.getKey());
            if (var4 != var5) {
               if (var4 != null && var5 != null && var4.size() == var5.size()) {
                  Iterator var6 = var4.entrySet().iterator();

                  Map.Entry var7;
                  do {
                     if (!var6.hasNext()) {
                        continue label47;
                     }

                     var7 = (Map.Entry)var6.next();
                  } while(var5.containsKey(var7.getKey()) && Arrays.equals((double[])var7.getValue(), (double[])var5.get(var7.getKey())));

                  return false;
               }

               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public int iIlIlllllill() {
      return this.lIllliiIil;
   }

   public int[] Illlllllilll() {
      return this.IIilliiIil;
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) - 6050) ^ var5) + var5) - '\ued7f') + var5) ^ 31414) + 14628))) + var5) + var5) + var5)))));
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
         var4[var5] = (char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) + 32158) ^ 20163))))) >>> 12 | (char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) + 32158) ^ 20163))))) << 4) + 11111) ^ '\uda7a') >>> 13 | (char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) + 32158) ^ 20163))))) >>> 12 | (char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) + 32158) ^ 20163))))) << 4) + 11111) ^ '\uda7a') << 3) - var5) ^ var5))) >>> 2 | (char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) + 32158) ^ 20163))))) >>> 12 | (char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) + 32158) ^ 20163))))) << 4) + 11111) ^ '\uda7a') >>> 13 | (char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) + 32158) ^ 20163))))) >>> 12 | (char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) + 32158) ^ 20163))))) << 4) + 11111) ^ '\uda7a') << 3) - var5) ^ var5))) << 14) + 25382))))) >>> 9 | (char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) + 32158) ^ 20163))))) >>> 12 | (char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) + 32158) ^ 20163))))) << 4) + 11111) ^ '\uda7a') >>> 13 | (char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) + 32158) ^ 20163))))) >>> 12 | (char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) + 32158) ^ 20163))))) << 4) + 11111) ^ '\uda7a') << 3) - var5) ^ var5))) >>> 2 | (char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) + 32158) ^ 20163))))) >>> 12 | (char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) + 32158) ^ 20163))))) << 4) + 11111) ^ '\uda7a') >>> 13 | (char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) + 32158) ^ 20163))))) >>> 12 | (char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) + 32158) ^ 20163))))) << 4) + 11111) ^ '\uda7a') << 3) - var5) ^ var5))) << 14) + 25382))))) << 7) ^ '螄') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public lliiliiliili IiIlliIliiIl() {
      return this.lillliiIil;
   }

   private static int liiiIIllIl(Map<String, Map<String, double[]>> arms) {
      long var7 = -5913062332573240302L;
      if (arms == null) {
         return 0;
      } else {
         var7 ^= (0L ^ var7) & -1L << 32;

         for(Map.Entry var3 : arms.entrySet()) {
            var7 ^= (0L ^ var7) & -1L >>> 32;
            if (var3.getValue() != null) {
               for(Map.Entry var6 : ((Map)var3.getValue()).entrySet()) {
                  var7 ^= ((long)((int)var7 + (Objects.hashCode(var6.getKey()) ^ Arrays.hashCode((double[])var6.getValue()))) ^ var7) & -1L >>> 32;
               }
            }

            var7 ^= ((long)((int)(var7 >>> 32) + (Objects.hashCode(var3.getKey()) ^ (int)var7)) << 32 ^ var7) & -1L << 32;
         }

         return (int)(var7 >>> 32);
      }
   }

   public String toString() {
      StringBuilder var1 = (new StringBuilder(Iilllilliill<invokedynamic>())).append(this.lIllliiIil).append(Iilllilliill<invokedynamic>()).append(this.iIllliiIil).append(Iilllilliill<invokedynamic>()).append(this.IlllliiIil).append(Iilllilliill<invokedynamic>()).append(this.llllliiIil).append(Iilllilliill<invokedynamic>()).append(this.illlliiIil).append(Iilllilliill<invokedynamic>()).append(this.IillliiIil).append(Iilllilliill<invokedynamic>()).append(this.lillliiIil).append(Iilllilliill<invokedynamic>());
      if (this.iillliiIil != null) {
         for(Map.Entry var3 : this.iillliiIil.entrySet()) {
            var1.append((String)var3.getKey()).append(Iilllilliill<invokedynamic>());
            if (var3.getValue() != null) {
               for(Map.Entry var5 : ((Map)var3.getValue()).entrySet()) {
                  var1.append((String)var5.getKey()).append('=').append(Arrays.toString((double[])var5.getValue())).append(' ');
               }
            }

            var1.append(Iilllilliill<invokedynamic>());
         }
      }

      return var1.append(Iilllilliill<invokedynamic>()).append(Arrays.toString(this.IIilliiIil)).append(']').toString();
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(~((char)((char)(~var4[var5]) + '理'))) - var5))) ^ var5) >>> 9 | (char)((char)(~((char)((char)(~((char)((char)(~var4[var5]) + '理'))) - var5))) ^ var5) << 7))) >>> 13 | (char)(~((char)((char)((char)(~((char)((char)(~((char)((char)(~var4[var5]) + '理'))) - var5))) ^ var5) >>> 9 | (char)((char)(~((char)((char)(~((char)((char)(~var4[var5]) + '理'))) - var5))) ^ var5) << 7))) << 3) << 6 | (char)((char)(~((char)((char)((char)(~((char)((char)(~((char)((char)(~var4[var5]) + '理'))) - var5))) ^ var5) >>> 9 | (char)((char)(~((char)((char)(~((char)((char)(~var4[var5]) + '理'))) - var5))) ^ var5) << 7))) >>> 13 | (char)(~((char)((char)((char)(~((char)((char)(~((char)((char)(~var4[var5]) + '理'))) - var5))) ^ var5) >>> 9 | (char)((char)(~((char)((char)(~((char)((char)(~var4[var5]) + '理'))) - var5))) ^ var5) << 7))) << 3) >>> 10) ^ '麚') + var5) + '釪') << 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(~((char)((char)(~var4[var5]) + '理'))) - var5))) ^ var5) >>> 9 | (char)((char)(~((char)((char)(~((char)((char)(~var4[var5]) + '理'))) - var5))) ^ var5) << 7))) >>> 13 | (char)(~((char)((char)((char)(~((char)((char)(~((char)((char)(~var4[var5]) + '理'))) - var5))) ^ var5) >>> 9 | (char)((char)(~((char)((char)(~((char)((char)(~var4[var5]) + '理'))) - var5))) ^ var5) << 7))) << 3) << 6 | (char)((char)(~((char)((char)((char)(~((char)((char)(~((char)((char)(~var4[var5]) + '理'))) - var5))) ^ var5) >>> 9 | (char)((char)(~((char)((char)(~((char)((char)(~var4[var5]) + '理'))) - var5))) ^ var5) << 7))) >>> 13 | (char)(~((char)((char)((char)(~((char)((char)(~((char)((char)(~var4[var5]) + '理'))) - var5))) ^ var5) >>> 9 | (char)((char)(~((char)((char)(~((char)((char)(~var4[var5]) + '理'))) - var5))) ^ var5) << 7))) << 3) >>> 10) ^ '麚') + var5) + '釪') >>> 3))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (!(o instanceof ililllilIiilllil)) {
         return false;
      } else {
         ililllilIiilllil var2 = (ililllilIiilllil)o;
         return this.lIllliiIil == var2.lIllliiIil && this.llllliiIil == var2.llllliiIil && this.illlliiIil == var2.illlliiIil && Objects.equals(this.iIllliiIil, var2.iIllliiIil) && Objects.equals(this.IlllliiIil, var2.IlllliiIil) && Objects.equals(this.IillliiIil, var2.IillliiIil) && Objects.equals(this.lillliiIil, var2.lillliiIil) && IliIlllilIi(this.iillliiIil, var2.iillliiIil) && Arrays.equals(this.IIilliiIil, var2.IIilliiIil);
      }
   }

   public ililllilIiilllil(int cal, String fights, String arms, long stats, int name, iilIlIilIIiIlIil updated, lliiliiliili habits, Map<String, Map<String, double[]>> uuid, int[] v) {
      this.lIllliiIil = cal;
      this.iIllliiIil = fights;
      this.IlllliiIil = arms;
      this.llllliiIil = stats;
      this.illlliiIil = name;
      this.IillliiIil = updated;
      this.lillliiIil = habits;
      this.iillliiIil = uuid;
      this.IIilliiIil = v;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 13284) + var5) - '몐') - var5)) + '\uf388') >>> 11 | (char)((char)((char)((char)((char)((char)(var4[var5] + 13284) + var5) - '몐') - var5)) + '\uf388') << 5) + '\uf759'))))) >>> 12 | (char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 13284) + var5) - '몐') - var5)) + '\uf388') >>> 11 | (char)((char)((char)((char)((char)((char)(var4[var5] + 13284) + var5) - '몐') - var5)) + '\uf388') << 5) + '\uf759'))))) << 4) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IIIllIIliIIl() {
      return this.illlliiIil;
   }

   public String IilliliilIIi() {
      return this.iIllliiIil;
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '芻') ^ var5) + '츹') << 4 | (char)((char)((char)(var4[var5] - '芻') ^ var5) + '츹') >>> 12) ^ 12243) - 6484) - var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - '芻') ^ var5) + '츹') << 4 | (char)((char)((char)(var4[var5] - '芻') ^ var5) + '츹') >>> 12) ^ 12243) - 6484) - var5) << 5) ^ var5))) >>> 15 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '芻') ^ var5) + '츹') << 4 | (char)((char)((char)(var4[var5] - '芻') ^ var5) + '츹') >>> 12) ^ 12243) - 6484) - var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - '芻') ^ var5) + '츹') << 4 | (char)((char)((char)(var4[var5] - '芻') ^ var5) + '츹') >>> 12) ^ 12243) - 6484) - var5) << 5) ^ var5))) << 1) - var5) - var5) ^ var5) + var5) - 24851));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int hashCode() {
      long var2 = 5829920984602847456L;
      var2 ^= ((long)Objects.hash(new Object[]{this.lIllliiIil, this.iIllliiIil, this.IlllliiIil, this.llllliiIil, this.illlliiIil, this.IillliiIil, this.lillliiIil}) << 32 ^ var2) & -1L << 32;
      var2 ^= ((long)(31 * (int)(var2 >>> 32) + liiiIIllIl(this.iillliiIil)) << 32 ^ var2) & -1L << 32;
      return 31 * (int)(var2 >>> 32) + Arrays.hashCode(this.IIilliiIil);
   }

   public Map<String, Map<String, double[]>> IIlllIlliIll() {
      return this.iillliiIil;
   }

   public iilIlIilIIiIlIil IlIlllIlilIl() {
      return this.IillliiIil;
   }
}
