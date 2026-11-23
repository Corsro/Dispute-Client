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
import net.minecraft.class_1268;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_1802;

public class lliIlIiiliIlIi extends ilIllIiIll {
   public final iilliIlIIiliIl IiiiIlIiiliiiIlIii = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 1, 1, (~1605854297 * -1108378657 >>> 5 | ~1605854297 * -1108378657 << 27) * -29 ^ 419291325);
   private int iiiiIlIiiIIIIllIii;
   private int lIIIllIiiiIIIllIii;
   private static final int lliiIlIiiiliiIlIii = 10;

   private int iiiIlIIIll() {
      for(int var1 = 0; var1 < 9; ++var1) {
         if (Iiiilllliiilll.field_1724.method_31548().method_5438(var1).method_31574(class_1802.field_8634)) {
            return var1;
         }
      }

      return -1;
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + var5) ^ '왹') + var5) - '딑') - 23322) + var5) - var5) ^ var5) - var5) + var5))));
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
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - '꣬') - 13766) >>> 14 | (char)((char)((char)(var4[var5] - var5) - '꣬') - 13766) << 2) + 7702))) - var5))) << 5 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - '꣬') - 13766) >>> 14 | (char)((char)((char)(var4[var5] - var5) - '꣬') - 13766) << 2) + 7702))) - var5))) >>> 11))) + 23646) << 10 | (char)((char)(~((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - '꣬') - 13766) >>> 14 | (char)((char)((char)(var4[var5] - var5) - '꣬') - 13766) << 2) + 7702))) - var5))) << 5 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - '꣬') - 13766) >>> 14 | (char)((char)((char)(var4[var5] - var5) - '꣬') - 13766) << 2) + 7702))) - var5))) >>> 11))) + 23646) >>> 6));
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
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) + var5)) << 8 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) + var5)) >>> 8))) + 6250) ^ var5) - '\udce6') ^ 11611) ^ 'ꎥ') >>> 5 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) + var5)) << 8 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) + var5)) >>> 8))) + 6250) ^ var5) - '\udce6') ^ 11611) ^ 'ꎥ') << 11) + var5))) - 16250) >>> 4 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) + var5)) << 8 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) + var5)) >>> 8))) + 6250) ^ var5) - '\udce6') ^ 11611) ^ 'ꎥ') >>> 5 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) + var5)) << 8 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) + var5)) >>> 8))) + 6250) ^ var5) - '\udce6') ^ 11611) ^ 'ꎥ') << 11) + var5))) - 16250) << 12) ^ '\udb5e'));
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
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - var5))) - 1461) ^ var5) >>> 13 | (char)((char)((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - var5))) - 1461) ^ var5) << 3) ^ '\ue6c2') << 3 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - var5))) - 1461) ^ var5) >>> 13 | (char)((char)((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - var5))) - 1461) ^ var5) << 3) ^ '\ue6c2') >>> 13) - 9891) << 11 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - var5))) - 1461) ^ var5) >>> 13 | (char)((char)((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - var5))) - 1461) ^ var5) << 3) ^ '\ue6c2') << 3 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - var5))) - 1461) ^ var5) >>> 13 | (char)((char)((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - var5))) - 1461) ^ var5) << 3) ^ '\ue6c2') >>> 13) - 9891) >>> 5) + var5))))) - 13245) ^ var5) >>> 11 | (char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - var5))) - 1461) ^ var5) >>> 13 | (char)((char)((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - var5))) - 1461) ^ var5) << 3) ^ '\ue6c2') << 3 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - var5))) - 1461) ^ var5) >>> 13 | (char)((char)((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - var5))) - 1461) ^ var5) << 3) ^ '\ue6c2') >>> 13) - 9891) << 11 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - var5))) - 1461) ^ var5) >>> 13 | (char)((char)((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - var5))) - 1461) ^ var5) << 3) ^ '\ue6c2') << 3 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - var5))) - 1461) ^ var5) >>> 13 | (char)((char)((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - var5))) - 1461) ^ var5) << 3) ^ '\ue6c2') >>> 13) - 9891) >>> 5) + var5))))) - 13245) ^ var5) << 5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 8965161095102753802L ^ Long.rotateLeft(-186179644391790512L, 6) ^ -373128345819858848L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 4838497921518566555L ^ Long.rotateLeft(3236619911850489619L, 5) ^ 4986203586317391158L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 2097790401158122184L ^ Long.rotateLeft(4377155299499837090L, 29) ^ 6564662761388064929L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8639218694370980641L ^ Long.rotateLeft(-5596122985503028516L, 62) ^ 482473523122077555L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8724538197125562898L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 6346481403398936749L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5990149154612362463L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 6468074616824678901L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 7755568150750947744L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -7348335543360344811L;
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

   protected void Illillliilli() {
      this.iiiiIlIiiIIIIllIii = 0;
      this.lIIIllIiiiIIIllIii = 0;
   }

   public lliIlIiiliIlIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IiiiIlIiiliiiIlIii});
   }

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1761 != null) {
         if (Iiiilllliiilll.field_1755 == null) {
            class_1661 var1 = Iiiilllliiilll.field_1724.method_31548();
            switch (this.iiiiIlIiiIIIIllIii) {
               case 0:
                  int var3 = this.iiiIlIIIll();
                  if (var3 == -1) {
                     this.Ililllililil();
                     return;
                  }

                  if (var1.method_67532() != var3) {
                     var1.method_61496(var3);
                  }

                  this.iiiiIlIiiIIIIllIii = 1;
                  break;
               case 1:
                  class_1799 var2 = Iiiilllliiilll.field_1724.method_6047();
                  if (!var2.method_31574(class_1802.field_8634)) {
                     this.iiiiIlIiiIIIIllIii = 2;
                     return;
                  }

                  if (Iiiilllliiilll.field_1724.method_7357().method_7904(var2)) {
                     if (++this.lIIIllIiiiIIIllIii > 10) {
                        this.iiiiIlIiiIIIIllIii = 2;
                     }

                     return;
                  }

                  Iiiilllliiilll.field_1761.method_2919(Iiiilllliiilll.field_1724, class_1268.field_5808);
                  this.iiiiIlIiiIIIIllIii = 2;
                  break;
               default:
                  int var4 = this.IiiiIlIiiliiiIlIii.Iilllilliill() - 1;
                  if (var1.method_67532() != var4) {
                     var1.method_61496(var4);
                  }

                  this.Ililllililil();
            }

         }
      } else {
         this.Ililllililil();
      }
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') >>> 14) >>> 14 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') >>> 14) << 2) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') >>> 14) >>> 14 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') >>> 14) << 2) >>> 8) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') >>> 14) >>> 14 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') >>> 14) << 2) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') >>> 14) >>> 14 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') >>> 14) << 2) >>> 8) >>> 15) ^ '\ue53b') - 23138))) << 14 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') >>> 14) >>> 14 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') >>> 14) << 2) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') >>> 14) >>> 14 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') >>> 14) << 2) >>> 8) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') >>> 14) >>> 14 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') >>> 14) << 2) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') >>> 14) >>> 14 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') << 5 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 28615) ^ 'פֿ') >>> 11) + '쏯') >>> 14) << 2) >>> 8) >>> 15) ^ '\ue53b') - 23138))) >>> 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
