package gg.corz;

import com.corz.client.mixins.AccessorKeyBinding;
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
import net.minecraft.class_3532;
import net.minecraft.class_3675;
import net.minecraft.class_3675.class_307;
import org.lwjgl.glfw.GLFW;

public class iliIIllIiiIIll extends ilIllIiIll {
   private boolean lIiliIIiliIiliIIil;
   private static final float IiiIiIIilliiIiIIil = 0.5F;
   private float ililiIIilIiiliIIil;
   private int IIlliIIillIlliIIil = -1;
   private int iilliIIilIIiliIIil;
   private boolean IilliIIillilliIIil;
   private static final int ilIliIIilIiIliIIil = 2;
   private final iiIiiilIIliiil liIliIIiliiIliIIil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private boolean lllliIIilillliIIil;
   private static final float IlIliIIilllIliIIil = 1.0F;
   private boolean iIlliIIilIllliIIil;
   private static final float lIIliIIiliIIliIIil = 8.0F;
   private float IliliIIillliliIIil;
   private static final float iiiIiIIilIIIliIIil = 60.0F;

   private boolean lIIlliIIll() {
      if (Iiiilllliiilll.field_1690 != null && Iiiilllliiilll.method_22683() != null) {
         long var1 = Iiiilllliiilll.method_22683().method_4490();
         class_3675.class_306 var3 = ((AccessorKeyBinding)Iiiilllliiilll.field_1690.field_1903).getBoundKey();
         if (var3.method_1442() == class_307.field_1668) {
            return GLFW.glfwGetKey(var1, var3.method_1444()) == (-(~(-(1922101676 * -99))) ^ 1309504900);
         } else if (var3.method_1442() == class_307.field_1672) {
            return GLFW.glfwGetMouseButton(var1, var3.method_1444()) == ((-1168675134 >>> 9 | -1168675134 << 23) * 1749801491 * 123 + -45 ^ 1237640043);
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1761 != null && Iiiilllliiilll.field_1724.field_3944 != null) {
         if (Iiiilllliiilll.field_1755 != null) {
            this.lIiliIIiliIiliIIil = false;
         } else if (this.lllliIIilillliIIil) {
            this.iiiIlIIIll();
            if (this.IIlliIIillIlliIIil != -1 && Iiiilllliiilll.field_1724.method_31548().method_67532() != this.IIlliIIillIlliIIil) {
               Iiiilllliiilll.field_1724.method_31548().method_61496(this.IIlliIIillIlliIIil);
            }

            this.IIlliIIillIlliIIil = -1;
            this.lIiliIIiliIiliIIil = false;
            this.IIillIiliIil(false);
         } else {
            int var1 = IilIIililIIi.lIiiIiIlilli(class_1802.field_49098);
            if (var1 == -1) {
               this.lIiliIIiliIiliIIil = false;
               this.IIillIiliIil(false);
            } else {
               if (!this.iIlliIIilIllliIIil) {
                  int var2 = Iiiilllliiilll.field_1724.method_31548().method_67532();
                  this.IIlliIIillIlliIIil = var2 != var1 ? var2 : -1;
                  if (var2 != var1) {
                     Iiiilllliiilll.field_1724.method_31548().method_61496(var1);
                  }

                  this.iIlliIIilIllliIIil = true;
               }

               this.IliliIIillliliIIil = Iiiilllliiilll.field_1724.method_36455();
               this.lIiliIIiliIiliIIil = true;
               float var3 = class_3532.method_15363(lilllliillll.liiiIIllIl(this.IliliIIillliliIIil, 90.0F, 0.5F, 60.0F, 8.0F), -90.0F, 90.0F);
               Iiiilllliiilll.field_1724.method_36457(var3);
               this.ililiIIilIiiliIIil = var3;
               ++this.iilliIIilIIiliIIil;
               if (this.iilliIIilIIiliIIil >= 2 && 90.0F - var3 <= 1.0F && Iiiilllliiilll.field_1724.method_24828()) {
                  if (this.liIliIIiliiIliIIil.Iilllilliill() && Iiiilllliiilll.field_1690 != null) {
                     Iiiilllliiilll.field_1690.field_1903.method_23481(true);
                     this.IilliIIillilliIIil = true;
                  }

                  Iiiilllliiilll.field_1761.method_2919(Iiiilllliiilll.field_1724, class_1268.field_5808);
                  Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
                  this.lllliIIilillliIIil = true;
               }

            }
         }
      }
   }

   protected void iiIIlIIlIl(iIIlIlIlIlIlIlIl e) {
      if (this.lIiliIIiliIiliIIil && Iiiilllliiilll.field_1724 != null) {
         e.IIlllIlliIll(class_3532.method_16439(e.Illlllllilll(), this.IliliIIillliliIIil, this.ililiIIilIiiliIIil));
         e.IIillIiliIil();
      }
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -3897142547657283956L ^ Long.rotateLeft(1317915966149791586L, 34) ^ 2544465708075776304L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6712544855205853592L ^ Long.rotateLeft(4886286300453682509L, 58) ^ -5034104382127198212L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -890236188800344943L ^ Long.rotateLeft(-5726504792580100393L, 59) ^ 8047287465207818453L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 3755120709451786754L ^ Long.rotateLeft(-5252068747482566270L, 30) ^ 1482210773601356052L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2791742572113939858L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3029405524999441185L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -1946313859028028008L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -8054057568662960684L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 2499646351151872172L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1692234237878169474L;
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

   protected void Iilililiiili() {
      this.iiiIlIIIll();
      this.lIiliIIiliIiliIIil = false;
      if (this.IIlliIIillIlliIIil != ((-1376087598 - -5 - -75) * 59 ^ -415215063) && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1724.method_31548().method_67532() != this.IIlliIIillIlliIIil) {
         Iiiilllliiilll.field_1724.method_31548().method_61496(this.IIlliIIillIlliIIil);
      }

      this.IIlliIIillIlliIIil = -1;
      this.iIlliIIilIllliIIil = false;
      this.lllliIIilillliIIil = false;
      this.iilliIIilIIiliIIil = 0;
   }

   public iliIIllIiiIIll() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.liIliIIiliiIliIIil});
   }

   protected void Illillliilli() {
      this.IIlliIIillIlliIIil = -1;
      this.iIlliIIilIllliIIil = false;
      this.lllliIIilillliIIil = false;
      this.iilliIIilIIiliIIil = 0;
      this.lIiliIIiliIiliIIil = false;
      this.iiiIlIIIll();
   }

   private void iiiIlIIIll() {
      if (this.IilliIIillilliIIil && Iiiilllliiilll.field_1690 != null) {
         Iiiilllliiilll.field_1690.field_1903.method_23481(this.lIIlliIIll());
      }

      this.IilliIIillilliIIil = false;
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) << 1 | (char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) >>> 15) >>> 11 | (char)((char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) << 1 | (char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) >>> 15) << 5) << 1 | (char)((char)((char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) << 1 | (char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) >>> 15) >>> 11 | (char)((char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) << 1 | (char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) >>> 15) << 5) >>> 15) << 2 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) << 1 | (char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) >>> 15) >>> 11 | (char)((char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) << 1 | (char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) >>> 15) << 5) << 1 | (char)((char)((char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) << 1 | (char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) >>> 15) >>> 11 | (char)((char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) << 1 | (char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) >>> 15) << 5) >>> 15) >>> 14))) - var5) - '\uf297') - var5) >>> 7 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) << 1 | (char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) >>> 15) >>> 11 | (char)((char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) << 1 | (char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) >>> 15) << 5) << 1 | (char)((char)((char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) << 1 | (char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) >>> 15) >>> 11 | (char)((char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) << 1 | (char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) >>> 15) << 5) >>> 15) << 2 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) << 1 | (char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) >>> 15) >>> 11 | (char)((char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) << 1 | (char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) >>> 15) << 5) << 1 | (char)((char)((char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) << 1 | (char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) >>> 15) >>> 11 | (char)((char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) << 1 | (char)((char)((char)((char)(-var4[var5]) - '諛') + '\ufbd0') - 2544) >>> 15) << 5) >>> 15) >>> 14))) - var5) - '\uf297') - var5) << 9) + '꽳'));
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
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) - '빀') << 1 | (char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) - '빀') >>> 15) - '鞎') >>> 13 | (char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) - '빀') << 1 | (char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) - '빀') >>> 15) - '鞎') << 3))) ^ var5) ^ '\uec8f') >>> 2 | (char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) - '빀') << 1 | (char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) - '빀') >>> 15) - '鞎') >>> 13 | (char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) - '빀') << 1 | (char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) - '빀') >>> 15) - '鞎') << 3))) ^ var5) ^ '\uec8f') << 14) >>> 6 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) - '빀') << 1 | (char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) - '빀') >>> 15) - '鞎') >>> 13 | (char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) - '빀') << 1 | (char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) - '빀') >>> 15) - '鞎') << 3))) ^ var5) ^ '\uec8f') >>> 2 | (char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) - '빀') << 1 | (char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) - '빀') >>> 15) - '鞎') >>> 13 | (char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) - '빀') << 1 | (char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) - '빀') >>> 15) - '鞎') << 3))) ^ var5) ^ '\uec8f') << 14) << 10) ^ var5))) - var5) + 6100));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] - var5))) + var5) ^ var5) - '\ue584'))) >>> 15 | (char)(~((char)((char)((char)((char)(-((char)(var4[var5] - var5))) + var5) ^ var5) - '\ue584'))) << 1) + var5) - var5) << 11 | (char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] - var5))) + var5) ^ var5) - '\ue584'))) >>> 15 | (char)(~((char)((char)((char)((char)(-((char)(var4[var5] - var5))) + var5) ^ var5) - '\ue584'))) << 1) + var5) - var5) >>> 5) << 9 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] - var5))) + var5) ^ var5) - '\ue584'))) >>> 15 | (char)(~((char)((char)((char)((char)(-((char)(var4[var5] - var5))) + var5) ^ var5) - '\ue584'))) << 1) + var5) - var5) << 11 | (char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] - var5))) + var5) ^ var5) - '\ue584'))) >>> 15 | (char)(~((char)((char)((char)((char)(-((char)(var4[var5] - var5))) + var5) ^ var5) - '\ue584'))) << 1) + var5) - var5) >>> 5) >>> 7));
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
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + '蕢') - '\ue59a'))) ^ var5) ^ var5) - 27109))) << 10 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + '蕢') - '\ue59a'))) ^ var5) ^ var5) - 27109))) >>> 6) >>> 2 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + '蕢') - '\ue59a'))) ^ var5) ^ var5) - 27109))) << 10 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + '蕢') - '\ue59a'))) ^ var5) ^ var5) - 27109))) >>> 6) << 14) >>> 14 | (char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + '蕢') - '\ue59a'))) ^ var5) ^ var5) - 27109))) << 10 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + '蕢') - '\ue59a'))) ^ var5) ^ var5) - 27109))) >>> 6) >>> 2 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + '蕢') - '\ue59a'))) ^ var5) ^ var5) - 27109))) << 10 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + '蕢') - '\ue59a'))) ^ var5) ^ var5) - 27109))) >>> 6) << 14) << 2));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) ^ '賯') + var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) ^ '賯') + var5) - var5) ^ var5) >>> 10) >>> 14 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) ^ '賯') + var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) ^ '賯') + var5) - var5) ^ var5) >>> 10) << 2) + var5) ^ 26963));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
