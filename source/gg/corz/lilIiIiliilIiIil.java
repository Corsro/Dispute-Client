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
import java.util.List;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1646;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_3850;
import net.minecraft.class_3852;
import net.minecraft.class_6880;

public final class lilIiIiliilIiIil {
   public long IIliillIil;
   public long liIiillIil;
   private static final long IlIiillIil = -4611686018427387904L;
   public class_243 IlilillIil;
   public long ilIiillIil;
   public long llIiillIil;
   public boolean IIIiillIil;
   public int iIilillIil;
   public long IiIiillIil;
   public long iiIiillIil;
   public final UUID lIilillIil;
   public class_2338 llilillIil;
   public int liilillIil;
   public String IiilillIil;
   public List<lIllIilliIllIill> lIIiillIil;
   public class_6880<class_3852> ililillIil;
   public int iiilillIil;
   public int lIliillIil;
   private String iIIiillIil;

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(-((char)(var4[var5] ^ 17349))) - 30021))))) + '칃') + '\uda85') ^ 3142) - '춢') + 22859) + 'ꬌ') ^ '\uddf3') ^ 11389) - var5))) << 10 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(-((char)(var4[var5] ^ 17349))) - 30021))))) + '칃') + '\uda85') ^ 3142) - '춢') + 22859) + 'ꬌ') ^ '\uddf3') ^ 11389) - var5))) >>> 6));
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
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) >>> 7 | (char)(var4[var5] << 8 | var4[var5] >>> 8) << 9) + '뜉') + '\uefa7') ^ 20757) ^ var5))) + var5) + '耵') + var5) - 10903) ^ 18862) - var5))) ^ var5))) ^ '앋') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void liiiIIllIl(int newLevel) {
      if (this.liilillIil > 0 && newLevel != this.liilillIil) {
         this.lIIiillIil = new ArrayList();
         this.iIIiillIil = "";
         this.liIiillIil = -4611686018427387904L;
      }

      this.liilillIil = newLevel;
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -504513118119045652L ^ Long.rotateLeft(5391294663030063347L, 57) ^ -8362626202968296745L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 2600859291994104684L ^ Long.rotateLeft(54454221434456452L, 17) ^ 3285690241451901802L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6315138128006112851L ^ Long.rotateLeft(-6092411091614559487L, 16) ^ -9159169101247848731L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6865408009441675060L ^ Long.rotateLeft(-8574050224465059095L, 3) ^ -5595866936700912092L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 7158797020944738493L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1961045349057408145L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -2536779950626234361L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5509697620095273588L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5682373760713608445L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 3110359541254274516L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Illlllllilll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iilllilliill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIillIiliIil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Ililllililil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iiilliiliiil<invokedynamic>());
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

   public void lIiiIiIlilli(boolean hinted, boolean stillDrained) {
      if (!stillDrained) {
         this.lIliillIil = 0;
      } else if (hinted) {
         this.lIliillIil = Math.min(this.lIliillIil + 1, 4);
      }

   }

   public boolean IilliliilIIi(List<lIllIilliIllIill> parsed) {
      long var5 = -1789097101990116682L;
      StringBuilder var2 = new StringBuilder();

      for(lIllIilliIllIill var4 : parsed) {
         var2.append(var4.lIiiIiIlilli()).append('|');
      }

      String var7 = var2.toString();
      var5 ^= ((long)(!var7.equals(this.iIIiillIil) ? 1 : 0) << 32 ^ var5) & -1L << 32;
      this.lIIiillIil = new ArrayList(parsed);
      this.iIIiillIil = var7;
      return (boolean)((int)(var5 >>> 32));
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) << 9 | (char)(var4[var5] + var5) >>> 7) + var5) + var5) - 8138) << 12 | (char)((char)((char)((char)((char)(var4[var5] + var5) << 9 | (char)(var4[var5] + var5) >>> 7) + var5) + var5) - 8138) >>> 4) ^ '줼') << 4 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) << 9 | (char)(var4[var5] + var5) >>> 7) + var5) + var5) - 8138) << 12 | (char)((char)((char)((char)((char)(var4[var5] + var5) << 9 | (char)(var4[var5] + var5) >>> 7) + var5) + var5) - 8138) >>> 4) ^ '줼') >>> 12) ^ 'ꯑ'))))) + var5) >>> 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) << 9 | (char)(var4[var5] + var5) >>> 7) + var5) + var5) - 8138) << 12 | (char)((char)((char)((char)((char)(var4[var5] + var5) << 9 | (char)(var4[var5] + var5) >>> 7) + var5) + var5) - 8138) >>> 4) ^ '줼') << 4 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) << 9 | (char)(var4[var5] + var5) >>> 7) + var5) + var5) - 8138) << 12 | (char)((char)((char)((char)((char)(var4[var5] + var5) << 9 | (char)(var4[var5] + var5) >>> 7) + var5) + var5) - 8138) >>> 4) ^ '줼') >>> 12) ^ 'ꯑ'))))) + var5) << 1));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean iIlIlllllill(IiIlIIiliIlIIi t) {
      long var3 = -4144249891799216581L;
      var3 ^= ((long)(t == null ? 0 : t.IlIlllIlilIl()) << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) > 0 && this.liilillIil > 0 && this.liilillIil < (int)(var3 >>> 32);
   }

   public lilIiIiliilIiIil(UUID uuid) {
      this.IlilillIil = class_243.field_1353;
      this.llilillIil = class_2338.field_10980;
      this.IiilillIil = IIlllIlliIll<invokedynamic>();
      this.IIIiillIil = true;
      this.lIIiillIil = new ArrayList();
      this.iIIiillIil = "";
      this.ilIiillIil = -4611686018427387904L;
      this.IiIiillIil = -4611686018427387904L;
      this.liIiillIil = -4611686018427387904L;
      this.iiIiillIil = -4611686018427387904L;
      this.IIliillIil = -4611686018427387904L;
      this.lIilillIil = uuid;
   }

   public boolean IlIlllIlilIl(IiIlIIiliIlIIi t) {
      return this.IIIllIIliIIl(t) != iIIIlIllIlIIlIll.IIiiIlllll;
   }

   public lIllIilliIllIill IiIlliIliiIl(IiIlIIiliIlIIi t) {
      if (t != null && t.IIIiiIililIIiiIili == llIlIlIlilIlIlIl.IilIliilIl && t.IlliiIilillliiIili > 0) {
         for(lIllIilliIllIill var3 : this.lIIiillIil) {
            if (var3.iIlIlllllill() && IIilIlIllIilIlIl.liiiIIllIl(t, var3, true) && !IIilIlIllIilIlIl.iIlIlllllill(t, var3)) {
               return var3;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public boolean iliIiiliiiii(long tick) {
      return tick < this.iiIiillIil;
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 20599) >>> 7 | (char)((char)(var4[var5] + var5) + 20599) << 9) + 19029) >>> 5 | (char)((char)((char)((char)(var4[var5] + var5) + 20599) >>> 7 | (char)((char)(var4[var5] + var5) + 20599) << 9) + 19029) << 11) << 4 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 20599) >>> 7 | (char)((char)(var4[var5] + var5) + 20599) << 9) + 19029) >>> 5 | (char)((char)((char)((char)(var4[var5] + var5) + 20599) >>> 7 | (char)((char)(var4[var5] + var5) + 20599) << 9) + 19029) << 11) >>> 12))) ^ '藦') - var5) >>> 7 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 20599) >>> 7 | (char)((char)(var4[var5] + var5) + 20599) << 9) + 19029) >>> 5 | (char)((char)((char)((char)(var4[var5] + var5) + 20599) >>> 7 | (char)((char)(var4[var5] + var5) + 20599) << 9) + 19029) << 11) << 4 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 20599) >>> 7 | (char)((char)(var4[var5] + var5) + 20599) << 9) + 19029) >>> 5 | (char)((char)((char)((char)(var4[var5] + var5) + 20599) >>> 7 | (char)((char)(var4[var5] + var5) + 20599) << 9) + 19029) << 11) >>> 12))) ^ '藦') - var5) << 9));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IliIlllilIi(class_1646 villager, long tick) {
      this.iIilillIil = villager.method_5628();
      this.IlilillIil = villager.method_73189();
      this.llilillIil = villager.method_24515();
      class_3850 var4 = villager.method_7231();
      this.ililillIil = var4.comp_3521();
      this.IiilillIil = lIIllilliIIllill.lIiiIiIlilli(this.ililillIil);
      this.liiiIIllIl(var4.comp_3522());
      this.iiilillIil = villager.method_19269();
      this.IIIiillIil = !villager.method_6109() && this.ililillIil != null && !this.ililillIil.method_40225(class_3852.field_17051) && !this.ililillIil.method_40225(class_3852.field_17062);
      this.llIiillIil = tick;
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) << 1 | (char)(-((char)((char)(~var4[var5]) - var5))) >>> 15) - 19277) ^ 32096))) ^ 8296) - '\ud7ae') + 'ꕹ') + var5) << 3 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) << 1 | (char)(-((char)((char)(~var4[var5]) - var5))) >>> 15) - 19277) ^ 32096))) ^ 8296) - '\ud7ae') + 'ꕹ') + var5) >>> 13))) ^ var5) ^ var5) + var5))) - var5) - '됾'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iIIIlIllIlIIlIll IIIllIIliIIl(IiIlIIiliIlIIi t) {
      long var6 = -7456834620572762175L;
      if (t != null && IIilIlIllIilIlIl.IilliliilIIi(this, t)) {
         iIIIlIllIlIIlIll var2 = iIIIlIllIlIIlIll.IIiiIlllll;

         for(lIllIilliIllIill var4 : this.lIIiillIil) {
            if (IIilIlIllIilIlIl.liiiIIllIl(t, var4, true)) {
               var6 ^= ((long)IIilIlIllIilIlIl.iIlIlllllill(t, var4) << 32 ^ var6) & -1L << 32;
               if (var4.iIlIlllllill() && (int)(var6 >>> 32) != 0) {
                  return iIIIlIllIlIIlIll.IIiiIlllll;
               }

               if (!var4.iIlIlllllill()) {
                  var2 = iIIIlIllIlIIlIll.lIiiIlllll;
               } else if (var2 == iIIIlIllIlIIlIll.IIiiIlllll) {
                  var2 = iIIIlIllIlIIlIll.iIiiIlllll;
               }
            }
         }

         return var2;
      } else {
         return iIIIlIllIlIIlIll.IIiiIlllll;
      }
   }
}
