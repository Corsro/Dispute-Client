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
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_243;

public class llIlIiIiilIlIiIi extends ilIllIiIll {
   private int lliIIIiIIi = -1;
   private long iliIIIiIIi = Long.MIN_VALUE;
   private final iiIiiilIIliiil lIiIIIiIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private final IIIIlilllIIIlill IIiIIIiIIi = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)5.0F, (double)2.0F, (double)6.0F, 0.1);
   private final iilliIlIIiliIl iIiIIIiIIi = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0, 0, 1000);
   private final IllIIiIllllIIiIl IliIIIiIIi = new IllIIiIllllIIiIl();

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(-((char)((char)((char)(-((char)(~((char)((char)(~((char)((char)(-((char)(var4[var5] + var5))) ^ '萐'))) ^ var5))))) >>> 15 | (char)(-((char)(~((char)((char)(~((char)((char)(-((char)(var4[var5] + var5))) ^ '萐'))) ^ var5))))) << 1) - var5))))) >>> 5 | (char)(~((char)(-((char)((char)((char)(-((char)(~((char)((char)(~((char)((char)(-((char)(var4[var5] + var5))) ^ '萐'))) ^ var5))))) >>> 15 | (char)(-((char)(~((char)((char)(~((char)((char)(-((char)(var4[var5] + var5))) ^ '萐'))) ^ var5))))) << 1) - var5))))) << 11));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 6 | (char)(~var4[var5]) >>> 10) << 10 | (char)((char)(~var4[var5]) << 6 | (char)(~var4[var5]) >>> 10) >>> 6))) + 31489) - '칤') - 29375) ^ var5) >>> 10 | (char)((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 6 | (char)(~var4[var5]) >>> 10) << 10 | (char)((char)(~var4[var5]) << 6 | (char)(~var4[var5]) >>> 10) >>> 6))) + 31489) - '칤') - 29375) ^ var5) << 6) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public llIlIiIiilIlIiIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IIiIIIiIIi, this.lIiIIIiIIi, this.iIiIIIiIIi});
   }

   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1761 != null && Iiiilllliiilll.field_1687 != null) {
         if (Iiiilllliiilll.field_1755 == null) {
            if (!Iiiilllliiilll.field_1724.method_6115()) {
               if (!IIllIIlilIllIIli.IIillIiliIil() && !IIllIIlilIllIIli.IIIilIIiiIIi() && !IIllIIlilIllIIli.IliIlllilIi()) {
                  if (this.IliIIIiIIi.iIlIlllllill((long)this.iIiIIIiIIi.Iilllilliill())) {
                     class_243 var1 = Iiiilllliiilll.field_1724.method_33571();
                     double var2 = this.IIiIIIiIIi.Iilllilliill() * this.IIiIIIiIIi.Iilllilliill();
                     class_1511 var4 = null;
                     double var5 = Double.MAX_VALUE;

                     for(class_1297 var8 : Iiiilllliiilll.field_1687.method_18112()) {
                        if (var8 instanceof class_1511) {
                           class_1511 var9 = (class_1511)var8;
                           if (var9.method_5805()) {
                              double var10 = var1.method_1025(var9.method_73189());
                              if (var10 <= var2 && var10 < var5) {
                                 var4 = var9;
                                 var5 = var10;
                              }
                           }
                        }
                     }

                     if (var4 != null) {
                        if (this.lIiIIIiIIi.Iilllilliill()) {
                           ilIiiIiIii.lIiiIiIlilli(this, var4.method_73189(), 60, true, true, false);
                           long var12 = IIllIIlilIllIIli.IlIlllIlilIl();
                           boolean var13 = this.lliIIIiIIi == var4.method_5628() && this.iliIIIiIIi == var12 - 1L;
                           this.lliIIIiIIi = var4.method_5628();
                           this.iliIIIiIIi = var12;
                           if (!var13) {
                              return;
                           }
                        }

                        Iiiilllliiilll.field_1761.method_2918(Iiiilllliiilll.field_1724, var4);
                        Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
                        this.IliIIIiIIi.IliIlllilIi();
                     }
                  }
               }
            }
         }
      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) >>> 1 | (char)(-var4[var5]) << 15))) ^ 19399) - var5) << 4 | (char)((char)((char)(-((char)((char)(-var4[var5]) >>> 1 | (char)(-var4[var5]) << 15))) ^ 19399) - var5) >>> 12) + var5) ^ 19442) + var5) + 'ﶴ') << 1 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) >>> 1 | (char)(-var4[var5]) << 15))) ^ 19399) - var5) << 4 | (char)((char)((char)(-((char)((char)(-var4[var5]) >>> 1 | (char)(-var4[var5]) << 15))) ^ 19399) - var5) >>> 12) + var5) ^ 19442) + var5) + 'ﶴ') >>> 15) ^ 'ꦧ') - var5) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) >>> 1 | (char)(-var4[var5]) << 15))) ^ 19399) - var5) << 4 | (char)((char)((char)(-((char)((char)(-var4[var5]) >>> 1 | (char)(-var4[var5]) << 15))) ^ 19399) - var5) >>> 12) + var5) ^ 19442) + var5) + 'ﶴ') << 1 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) >>> 1 | (char)(-var4[var5]) << 15))) ^ 19399) - var5) << 4 | (char)((char)((char)(-((char)((char)(-var4[var5]) >>> 1 | (char)(-var4[var5]) << 15))) ^ 19399) - var5) >>> 12) + var5) ^ 19442) + var5) + 'ﶴ') >>> 15) ^ 'ꦧ') - var5) >>> 14) - var5) ^ var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)(~((char)((char)((char)(~var4[var5]) ^ var5) - var5))))))) - var5) - var5) - 4968) - '\ue9d5') + var5) ^ 7748) << 5 | (char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)(~((char)((char)((char)(~var4[var5]) ^ var5) - var5))))))) - var5) - var5) - 4968) - '\ue9d5') + var5) ^ 7748) >>> 11))) + var5)) - var5) >>> 8 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)(~((char)((char)((char)(~var4[var5]) ^ var5) - var5))))))) - var5) - var5) - 4968) - '\ue9d5') + var5) ^ 7748) << 5 | (char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)(~((char)((char)((char)(~var4[var5]) ^ var5) - var5))))))) - var5) - var5) - 4968) - '\ue9d5') + var5) ^ 7748) >>> 11))) + var5)) - var5) << 8));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) >>> 10 | (char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) << 6) - '뙮') << 13 | (char)((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) >>> 10 | (char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) << 6) - '뙮') >>> 3) ^ 30759) ^ 1302) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) >>> 10 | (char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) << 6) - '뙮') << 13 | (char)((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) >>> 10 | (char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) << 6) - '뙮') >>> 3) ^ 30759) ^ 1302) << 5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) >>> 10 | (char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) << 6) - '뙮') << 13 | (char)((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) >>> 10 | (char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) << 6) - '뙮') >>> 3) ^ 30759) ^ 1302) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) >>> 10 | (char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) << 6) - '뙮') << 13 | (char)((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) >>> 10 | (char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) << 6) - '뙮') >>> 3) ^ 30759) ^ 1302) << 5) << 6) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) >>> 10 | (char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) << 6) - '뙮') << 13 | (char)((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) >>> 10 | (char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) << 6) - '뙮') >>> 3) ^ 30759) ^ 1302) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) >>> 10 | (char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) << 6) - '뙮') << 13 | (char)((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) >>> 10 | (char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) << 6) - '뙮') >>> 3) ^ 30759) ^ 1302) << 5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) >>> 10 | (char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) << 6) - '뙮') << 13 | (char)((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) >>> 10 | (char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) << 6) - '뙮') >>> 3) ^ 30759) ^ 1302) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) >>> 10 | (char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) << 6) - '뙮') << 13 | (char)((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) >>> 10 | (char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) << 4 | (char)(~((char)(-((char)(var4[var5] >>> 15 | var4[var5] << 1))))) >>> 12) ^ var5))) ^ var5) << 6) - '뙮') >>> 3) ^ 30759) ^ 1302) << 5) << 6) << 12) - var5) + var5) + 32049) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -4009185720819771848L ^ Long.rotateLeft(-3055424992745721014L, 9) ^ 3805993760010001852L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 3666867696435026423L ^ Long.rotateLeft(-6800602912489796395L, 44) ^ -2627068298036519369L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 4187561987659679850L ^ Long.rotateLeft(1668211055594670216L, 33) ^ 6518898538916857302L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4781459034569700491L ^ Long.rotateLeft(7929556831887647387L, 36) ^ -3654469177551644550L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 4826239337354923808L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5688538980461342040L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1032296339966764785L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5045668070685879253L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8721835739827786528L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -148284991118474098L;
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
}
