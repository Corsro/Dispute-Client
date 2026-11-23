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
import net.minecraft.class_1802;
import net.minecraft.class_239;
import net.minecraft.class_3965;
import net.minecraft.class_239.class_240;
import org.lwjgl.glfw.GLFW;

public class iIillIIlIlillIIl extends ilIllIiIll {
   private int ililiillIl = -1;

   public static void iiiIlIIIll(int slot) {
      if (slot >= 0 && slot <= ((15466895 * -67 * -1643291835 << 11 | 15466895 * -67 * -1643291835 >>> 21) ^ -61 ^ -1088225184)) {
         ilIllIiIll var2 = llilIllililIll.iliIiiliiiii(iIillIIlIlillIIl.class);
         if (var2 instanceof iIillIIlIlillIIl) {
            iIillIIlIlillIIl var1 = (iIillIIlIlillIIl)var2;
            var1.ililiillIl = slot;
         }

      }
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) + var5) + var5))) + var5) ^ var5) + var5))) ^ 'ꏳ') - 777) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iIillIIlIlillIIl() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.liiIIIIiiiiIIIIi);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8697997955291063620L ^ Long.rotateLeft(-1103321227806723333L, 22) ^ -5827829792352854672L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2771613808229857824L ^ Long.rotateLeft(-1296755644557097415L, 55) ^ 6176091608902261240L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8999759860289894991L ^ Long.rotateLeft(5335212746283879913L, 21) ^ -990490653459707973L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 8700988286259494586L ^ Long.rotateLeft(-541070780872202712L, 33) ^ -4020735788597224202L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2979241174641429422L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -7168395099529384773L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 6327238286592687789L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4439122003310698898L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4211272081995085115L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -6501180419706460464L;
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

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) - '헿') ^ '춾')))))))))) - var5) + '홆') - '끓') >>> 5 | (char)((char)((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) - '헿') ^ '춾')))))))))) - var5) + '홆') - '끓') << 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1761 != null && Iiiilllliiilll.field_1687 != null) {
         if (Iiiilllliiilll.field_1755 == null) {
            int var1 = Iiiilllliiilll.field_1724.method_31548().method_67532();
            int var2 = this.ililiillIl;
            this.ililiillIl = var1;
            if (!IIllIIlilIllIIli.Iiilliiliiil() && !IIllIIlilIllIIli.IIIilIIiiIIi()) {
               if (var1 != var2) {
                  if (Iiiilllliiilll.field_1724.method_31548().method_5438(var1).method_31574(class_1802.field_8281)) {
                     if (GLFW.glfwGetMouseButton(Iiiilllliiilll.method_22683().method_4490(), 1) != 1) {
                        class_239 var4 = Iiiilllliiilll.field_1765;
                        if (var4 instanceof class_3965) {
                           class_3965 var3 = (class_3965)var4;
                           if (var3.method_17783() == class_240.field_1332 && Iiiilllliiilll.field_1761.method_2896(Iiiilllliiilll.field_1724, class_1268.field_5808, var3).method_23665()) {
                              Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
                           }
                        }

                     }
                  }
               }
            }
         }
      }
   }

   public void Illillliilli() {
      this.ililiillIl = Iiiilllliiilll.field_1724 != null ? Iiiilllliiilll.field_1724.method_31548().method_67532() : -1;
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + 7153) - '혩'))) << 9 | (char)(~((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + 7153) - '혩'))) >>> 7) - 26406) + '鴀') >>> 10 | (char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + 7153) - '혩'))) << 9 | (char)(~((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + 7153) - '혩'))) >>> 7) - 26406) + '鴀') << 6) >>> 14 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + 7153) - '혩'))) << 9 | (char)(~((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + 7153) - '혩'))) >>> 7) - 26406) + '鴀') >>> 10 | (char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + 7153) - '혩'))) << 9 | (char)(~((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + 7153) - '혩'))) >>> 7) - 26406) + '鴀') << 6) << 2))) + '\ue5d8'))) ^ 7814) << 1 | (char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + 7153) - '혩'))) << 9 | (char)(~((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + 7153) - '혩'))) >>> 7) - 26406) + '鴀') >>> 10 | (char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + 7153) - '혩'))) << 9 | (char)(~((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + 7153) - '혩'))) >>> 7) - 26406) + '鴀') << 6) >>> 14 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + 7153) - '혩'))) << 9 | (char)(~((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + 7153) - '혩'))) >>> 7) - 26406) + '鴀') >>> 10 | (char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + 7153) - '혩'))) << 9 | (char)(~((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + 7153) - '혩'))) >>> 7) - 26406) + '鴀') << 6) << 2))) + '\ue5d8'))) ^ 7814) >>> 15));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(~((char)(-var4[var5]))))) >>> 2 | (char)(~((char)(~((char)(-var4[var5]))))) << 14) - var5))) + '訂') - 26050) >>> 12 | (char)((char)((char)(-((char)((char)((char)(~((char)(~((char)(-var4[var5]))))) >>> 2 | (char)(~((char)(~((char)(-var4[var5]))))) << 14) - var5))) + '訂') - 26050) << 4) >>> 15 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)(~((char)(-var4[var5]))))) >>> 2 | (char)(~((char)(~((char)(-var4[var5]))))) << 14) - var5))) + '訂') - 26050) >>> 12 | (char)((char)((char)(-((char)((char)((char)(~((char)(~((char)(-var4[var5]))))) >>> 2 | (char)(~((char)(~((char)(-var4[var5]))))) << 14) - var5))) + '訂') - 26050) << 4) << 1) + 22382) ^ '젾') - var5))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + '誵') - 29157) + 12954) >>> 13 | (char)((char)((char)((char)(-var4[var5]) + '誵') - 29157) + 12954) << 3) ^ '\uf6c6') + 20777) ^ var5) ^ 'ꂰ') - 12974) ^ var5) + '鬅') - var5) ^ 3981) ^ var5) - 8405) ^ var5) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + '誵') - 29157) + 12954) >>> 13 | (char)((char)((char)((char)(-var4[var5]) + '誵') - 29157) + 12954) << 3) ^ '\uf6c6') + 20777) ^ var5) ^ 'ꂰ') - 12974) ^ var5) + '鬅') - var5) ^ 3981) ^ var5) - 8405) ^ var5) >>> 15));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
