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
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2561;
import net.minecraft.class_3417;
import net.minecraft.class_640;

public class illiIliIiliIli extends ilIllIiIll {
   private final iilliIlIIiliIl IlIIllIIIl = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 2, 0, (-1881978147 ^ 93 ^ -35) * -29 ^ 1257206879);
   private final List<IIillIllIillIl> ilIIllIIIl = new ArrayList();
   private final iiIiiilIIliiil lIIIllIIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final String IiIIllIIIl = "&aYou have sent &f${amount} &ato &f{player}&a.";
   private final iiIiiilIIliiil iIIIllIIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil llIIllIIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final IIiiIIIllIiiIIIl iiiiIlIIIl = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) - 28350) - 26268) - var5) + '鹽') + var5) ^ 13570) + var5) + 13331) - var5) + 32172) ^ var5))) ^ var5) + var5) << 6 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) - 28350) - 26268) - var5) + '鹽') + var5) ^ 13570) + var5) + 13331) - var5) + 32172) ^ var5))) ^ var5) + var5) >>> 10) - '肎'));
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
         var4[var5] = (char)((char)((char)(~((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)var4[var5] ^ var5) - var5) ^ var5) ^ 32662))) + var5) ^ '묄'))))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static String IIllllIlll(long v) {
      String[] var2 = new String[]{"", IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()};
      double var3 = (double)v;

      int var5;
      for(var5 = 0; Math.abs(var3) >= (double)1000.0F && var5 < var2.length - 1; ++var5) {
         var3 /= (double)1000.0F;
      }

      if (var5 == 0) {
         return String.format(IliIlllilIi<invokedynamic>(), v);
      } else {
         String var6 = var3 == Math.floor(var3) ? String.valueOf((long)var3) : String.format(IliIlllilIi<invokedynamic>(), var3);
         return var6 + var2[var5];
      }
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6414732050444857443L ^ Long.rotateLeft(-1041208992110491508L, 62) ^ -1666699224028023894L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -185008939375437036L ^ Long.rotateLeft(4007494433565487087L, 7) ^ -5234640028152764231L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -1200971109837556617L ^ Long.rotateLeft(6901478603872571938L, 61) ^ 4714765559610676378L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 4005545657112946926L ^ Long.rotateLeft(8835669721160241753L, 20) ^ -3794587285328677202L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3103711564096632990L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5214841353448925224L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7079972047476324613L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 6208755811064523737L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6293254688131642479L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -3590637611826570902L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, lIiiIiIlilli<invokedynamic>());
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

   public illiIliIiliIli() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iiiiIlIIIl, this.lIIIllIIIl, this.iIIIllIIIl, this.IlIIllIIIl, this.llIIllIIIl});
   }

   public void IiiIlliiIl() {
      if (IliIlllilIi<invokedynamic>().equals(this.iiiiIlIIIl.Iilllilliill())) {
         this.iiiiIlIIIl.IIillIiliIil(this.iiiiIlIIIl.Ililllililil());
         iiiIIIlIIIlIIl.liiiIIllIl();
      }

   }

   public void Iilililiiili() {
      this.ilIIllIIIl.clear();
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ var5) - var5))) ^ 20421) - var5) << 11 | (char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ var5) - var5))) ^ 20421) - var5) >>> 5) ^ var5) << 1 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ var5) - var5))) ^ 20421) - var5) << 11 | (char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ var5) - var5))) ^ 20421) - var5) >>> 5) ^ var5) >>> 15))) >>> 5 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ var5) - var5))) ^ 20421) - var5) << 11 | (char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ var5) - var5))) ^ 20421) - var5) >>> 5) ^ var5) << 1 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ var5) - var5))) ^ 20421) - var5) << 11 | (char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ var5) - var5))) ^ 20421) - var5) >>> 5) ^ var5) >>> 15))) << 11) - var5) - 19002) + var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private String IlIllllIll(String typed) {
      if (Iiiilllliiilll.method_1562() != null) {
         for(class_640 var3 : Iiiilllliiilll.method_1562().method_2880()) {
            if (var3.method_2966() != null) {
               String var4 = var3.method_2966().name();
               if (var4 != null && var4.equalsIgnoreCase(typed)) {
                  return var4;
               }
            }
         }
      }

      return typed;
   }

   static Long liIlliiIll(String s) {
      if (s == null) {
         return null;
      } else {
         s = s.trim().replace(IliIlllilIi<invokedynamic>(), "");
         if (s.startsWith(IliIlllilIi<invokedynamic>())) {
            s = s.substring(1);
         }

         if (s.isEmpty()) {
            return null;
         } else {
            double var1 = (double)1.0F;
            char var3 = Character.toLowerCase(s.charAt(s.length() - 1));
            if (Character.isLetter(var3)) {
               switch (var3) {
                  case 'b' -> var1 = (double)1.0E9F;
                  case 'k' -> var1 = (double)1000.0F;
                  case 'm' -> var1 = (double)1000000.0F;
                  case 't' -> var1 = 1.0E12;
                  default -> {
                     return null;
                  }
               }

               s = s.substring(0, s.length() - 1);
               if (s.isEmpty()) {
                  return null;
               }
            }

            try {
               double var4 = Double.parseDouble(s);
               return !(var4 < (double)0.0F) && !Double.isNaN(var4) && !Double.isInfinite(var4) ? Math.round(var4 * var1) : null;
            } catch (NumberFormatException var6) {
               return null;
            }
         }
      }
   }

   public void iIIIlIlIIl() {
      if (!this.ilIIllIIIl.isEmpty()) {
         for(int var1 = this.ilIIllIIIl.size() - 1; var1 >= 0; --var1) {
            IIillIllIillIl var2 = (IIillIllIillIl)this.ilIIllIIIl.get(var1);
            if (--var2.lIililIlliIililIll <= 0) {
               this.ilIllIiIll(var2.iillilIllIIililIll);
               this.ilIIllIIIl.remove(var1);
            }
         }

      }
   }

   static String iIlllIllll(String s) {
      return s == null ? "" : s.replaceAll(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ '\uedc0') - var5))) >>> 1 | (char)(~((char)((char)(var4[var5] ^ '\uedc0') - var5))) << 15) ^ var5) ^ var5) >>> 15 | (char)((char)((char)((char)(~((char)((char)(var4[var5] ^ '\uedc0') - var5))) >>> 1 | (char)(~((char)((char)(var4[var5] ^ '\uedc0') - var5))) << 15) ^ var5) ^ var5) << 1))) ^ '\udf27') + '\ue5d2') - var5) - 13558) + '蓚'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private String lIIlliIIll(String amount, long player, String raw) {
      String var5 = String.format(IliIlllilIi<invokedynamic>(), player);
      String var6 = IIllllIlll(player);
      String var7 = this.iiiiIlIIIl.Iilllilliill().replace(IliIlllilIi<invokedynamic>(), this.IlIllllIll(amount)).replace(IliIlllilIi<invokedynamic>(), var6).replace(IliIlllilIi<invokedynamic>(), var5).replace(IliIlllilIi<invokedynamic>(), var6).replace(IliIlllilIi<invokedynamic>(), raw);
      return iIlllIllll(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(-((char)(var4[var5] - 27990))))) ^ var5))) - var5) >>> 2 | (char)((char)(-((char)((char)(-((char)(-((char)(var4[var5] - 27990))))) ^ var5))) - var5) << 14) ^ 19212) ^ var5) - var5))) + var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean iiiIlIIIll(String command) {
      long var8 = -394883987294749996L;
      if (command == null) {
         return false;
      } else {
         String[] var2 = command.trim().split(IliIlllilIi<invokedynamic>());
         if (var2.length == (((180960199 ^ -77) - 65) * -23 ^ -132882584) && var2[0].equalsIgnoreCase(IliIlllilIi<invokedynamic>())) {
            String var3 = var2[1];
            Long var4 = liIlliiIll(var2[2]);
            if (var4 == null) {
               return false;
            } else if (this.llIIllIIIl.Iilllilliill() && Iiiilllliiilll.field_1724 != null && var3.equalsIgnoreCase(Iiiilllliiilll.field_1724.method_5477().getString())) {
               return true;
            } else {
               IIilliillIilliil var5 = (IIilliillIilliil)llilIllililIll.iliIiiliiiii(IIilliillIilliil.class);
               if (var5 != null && var5.IliIlllilIi() && var5.ilIllIiIll()) {
                  var5.IlIllllIll((double)var4);
               }

               String var6 = this.lIIlliIIll(var3, var4, var2[2]);
               var8 ^= ((long)this.IlIIllIIIl.Iilllilliill() << 32 ^ var8) & -1L << 32;
               if ((int)(var8 >>> 32) <= 0) {
                  this.ilIllIiIll(var6);
               } else {
                  this.ilIIllIIIl.add(new IIillIllIillIl(var6, (int)(var8 >>> 32)));
               }

               return true;
            }
         } else {
            return false;
         }
      }
   }

   private void ilIllIiIll(String text) {
      if (Iiiilllliiilll.field_1705 != null) {
         class_2561 var2 = IlIllllllIllll.lllllillll(class_2561.method_43470(text));
         Iiiilllliiilll.field_1705.method_1743().method_1812(var2);
         if (this.iIIIllIIIl.Iilllilliill()) {
            Iiiilllliiilll.field_1705.method_1758(var2, false);
         }

         if (this.lIIIllIIIl.Iilllilliill() && Iiiilllliiilll.field_1724 != null) {
            Iiiilllliiilll.field_1724.method_5783(class_3417.field_14627, 1.0F, 1.0F);
         }

      }
   }
}
