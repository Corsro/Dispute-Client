package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1703;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2561;
import net.minecraft.class_465;

public class IiiilIIiliiilIIi extends ilIllIiIll {
   private final lliliIIiililiIIi IilIiIiiil = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private final IIIlIlIllIIlIlIl lilIiIiiil;
   private int lliIiIiiil;
   private boolean liiIiIiiil;
   private int iliIiIiiil;
   private static final int IliIiIiiil = 20;
   private final iilliIlIIiliIl iilIiIiiil;
   private final iiIiiilIIliiil IIiIiIiiil;
   private final iiIiiilIIliiil iIiIiIiiil;
   private long IiiIiIiiil;
   private final iilliIlIIiliIl lIiIiIiiil;

   public void Illillliilli() {
      this.lliIiIiiil = -794576752 ^ 61 ^ -794576711;
      this.iliIiIiiil = 0;
      this.IiiIiIiiil = System.currentTimeMillis();
   }

   private int ilIllIiIll(class_1703 handler, int containerSlots) {
      int var3 = -1;

      for(int var4 = 0; var4 < containerSlots; ++var4) {
         class_1799 var5 = handler.method_7611(var4).method_7677();
         if (!var5.method_7960()) {
            String var6 = var5.method_7964().getString().toLowerCase(Locale.ROOT);
            if (var6.contains(IliIlllilIi<invokedynamic>())) {
               return var4;
            }

            class_1792 var7 = var5.method_7909();
            if (var7 == class_1802.field_8581 || var7 == class_1802.field_8656) {
               var3 = var4;
            }
         }
      }

      return var3;
   }

   private boolean IIllllIlll(class_1703 handler) {
      if (Iiiilllliiilll.field_1755 != null && Iiiilllliiilll.field_1755.method_25440().getString().toLowerCase(Locale.ROOT).contains(IliIlllilIi<invokedynamic>())) {
         return true;
      } else {
         return this.ilIllIiIll(handler, Math.max(0, handler.field_7761.size() - ((((33740760 >>> 29 | 33740760 << 3) + 73) * 101 << 1 | ((33740760 >>> 29 | 33740760 << 3) + 73) * 101 >>> 31) ^ -1309491906))) >= 0;
      }
   }

   private void lIIlliIIll() {
      if (this.IIiIiIiiil.Iilllilliill() && Iiiilllliiilll.field_1724 != null) {
         long var1 = System.currentTimeMillis();
         if (var1 - this.IiiIiIiiil >= (long)this.lIiIiIiiil.Iilllilliill() * 1000L) {
            float var3 = this.liiIiIiiil ? 8.0F : -8.0F;
            this.liiIiIiiil = !this.liiIiIiiil;
            Iiiilllliiilll.field_1724.method_36456(Iiiilllliiilll.field_1724.method_36454() + var3);
            this.IiiIiIiiil = var1;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] >>> 4 | var4[var5] << 12))))) - var5) + 1087) - var5) - 11969))))) ^ 22321) ^ var5) ^ '톯'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iiiIlIIIll(class_1703 handler) {
      int var2 = handler.field_7761.size();
      int var3 = Math.max(0, var2 - 36);
      int var4 = this.ilIllIiIll(handler, var3);
      if (this.liIlliiIll(handler, var3, var4)) {
         for(int var5 = var3; var5 < var2; ++var5) {
            class_1799 var6 = handler.method_7611(var5).method_7677();
            if (!var6.method_7960() && this.iIlllIllll(var6.method_7909())) {
               Iiiilllliiilll.field_1761.method_2906(handler.field_7763, var5, 0, class_1713.field_7794, Iiiilllliiilll.field_1724);
               ++this.iliIiIiiil;
               this.lliIiIiiil = this.iilIiIiiil.Iilllilliill();
               this.IlIllllIll();
               return;
            }
         }
      }

      if (var4 >= 0) {
         if (this.iliIiIiiil > 0) {
            Iiiilllliiilll.field_1761.method_2906(handler.field_7763, var4, 0, class_1713.field_7790, Iiiilllliiilll.field_1724);
            if (this.iIiIiIiiil.Iilllilliill()) {
               Iiiilllliiilll.field_1724.method_7353(class_2561.method_43470(IliIlllilIi<invokedynamic>() + this.iliIiIiiil + IliIlllilIi<invokedynamic>()), false);
            }

            this.iliIiIiiil = 0;
            this.lliIiIiiil = this.iilIiIiiil.Iilllilliill();
            this.IlIllllIll();
         }

      } else {
         if (!this.liIlliiIll(handler, var3, -1)) {
            Iiiilllliiilll.field_1724.method_7346();
            this.lliIiIiiil = 20;
         }

      }
   }

   public void Iilililiiili() {
      this.iliIiIiiil = 0;
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) << 11 | (char)(-((char)((char)(var4[var5] - var5) + var5))) >>> 5) - var5) ^ 7173) ^ var5) - 1418) ^ '葀') >>> 9 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) << 11 | (char)(-((char)((char)(var4[var5] - var5) + var5))) >>> 5) - var5) ^ 7173) ^ var5) - 1418) ^ '葀') << 7) - 27616)))) << 10 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) << 11 | (char)(-((char)((char)(var4[var5] - var5) + var5))) >>> 5) - var5) ^ 7173) ^ var5) - 1418) ^ '葀') >>> 9 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) << 11 | (char)(-((char)((char)(var4[var5] - var5) + var5))) >>> 5) - var5) ^ 7173) ^ var5) - 1418) ^ '葀') << 7) - 27616)))) >>> 6) << 11 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) << 11 | (char)(-((char)((char)(var4[var5] - var5) + var5))) >>> 5) - var5) ^ 7173) ^ var5) - 1418) ^ '葀') >>> 9 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) << 11 | (char)(-((char)((char)(var4[var5] - var5) + var5))) >>> 5) - var5) ^ 7173) ^ var5) - 1418) ^ '葀') << 7) - 27616)))) << 10 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) << 11 | (char)(-((char)((char)(var4[var5] - var5) + var5))) >>> 5) - var5) ^ 7173) ^ var5) - 1418) ^ '葀') >>> 9 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) << 11 | (char)(-((char)((char)(var4[var5] - var5) + var5))) >>> 5) - var5) ^ 7173) ^ var5) - 1418) ^ '葀') << 7) - 27616)))) >>> 6) >>> 5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IiiilIIiliiilIIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.lilIiIiiil = new IIIlIlIllIIlIlIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), List.of(class_1802.field_17498));
      this.iilIiIiiil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 1, 0, 20);
      this.IIiIiIiiil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
      this.lIiIiIiiil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 25, 5, 120);
      this.iIiIiIiiil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IilIiIiiil, this.lilIiIiiil, this.iilIiIiiil, this.IIiIiIiiil, this.lIiIiIiiil, this.iIiIiIiiil});
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) + '톱') ^ '꾧') - '\ue18e') + var5))) + 'ﷇ') ^ 21466) >>> 1 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) + '톱') ^ '꾧') - '\ue18e') + var5))) + 'ﷇ') ^ 21466) << 15) << 1 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) + '톱') ^ '꾧') - '\ue18e') + var5))) + 'ﷇ') ^ 21466) >>> 1 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) + '톱') ^ '꾧') - '\ue18e') + var5))) + 'ﷇ') ^ 21466) << 15) >>> 15) - '詛') - var5) - 15347));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void IlIllllIll() {
      this.IiiIiIiiil = System.currentTimeMillis();
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -2988536568843258723L ^ Long.rotateLeft(-2555258915721531638L, 55) ^ 8628893297188917455L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1400226454975206248L ^ Long.rotateLeft(6956932180511081329L, 25) ^ -3184600035316786545L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7565332421411005088L ^ Long.rotateLeft(-4514013124425147619L, 15) ^ -6283575460778861787L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 1123183016277829375L ^ Long.rotateLeft(1993266260885866002L, 36) ^ 6118454331837988347L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4936492755148387059L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3729808400117857658L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7936574319643108199L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -123917594839164729L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -4904324568615474991L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 7008626245313708349L;
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

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(-((char)(~((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - 12937) + 29858))))) + '첑'))))) ^ var5) << 10 | (char)((char)(-((char)(-((char)((char)(-((char)(~((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - 12937) + 29858))))) + '첑'))))) ^ var5) >>> 6) << 8 | (char)((char)((char)(-((char)(-((char)((char)(-((char)(~((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - 12937) + 29858))))) + '첑'))))) ^ var5) << 10 | (char)((char)(-((char)(-((char)((char)(-((char)(~((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - 12937) + 29858))))) + '첑'))))) ^ var5) >>> 6) >>> 8) ^ var5))) - var5) - var5))) << 5 | (char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)(-((char)(~((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - 12937) + 29858))))) + '첑'))))) ^ var5) << 10 | (char)((char)(-((char)(-((char)((char)(-((char)(~((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - 12937) + 29858))))) + '첑'))))) ^ var5) >>> 6) << 8 | (char)((char)((char)(-((char)(-((char)((char)(-((char)(~((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - 12937) + 29858))))) + '첑'))))) ^ var5) << 10 | (char)((char)(-((char)(-((char)((char)(-((char)(~((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - 12937) + 29858))))) + '첑'))))) ^ var5) >>> 6) >>> 8) ^ var5))) - var5) - var5))) >>> 11))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean liIlliiIll(class_1703 containerSlots, int handler, int sellButton) {
      for(int var4 = 0; var4 < handler; ++var4) {
         if (var4 != sellButton && containerSlots.method_7611(var4).method_7677().method_7960()) {
            return true;
         }
      }

      return false;
   }

   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1761 != null) {
         if (Iiiilllliiilll.field_1755 == null || Iiiilllliiilll.field_1755 instanceof class_465) {
            this.lIIlliIIll();
            if (this.lliIiIiiil > 0) {
               --this.lliIiIiiil;
            } else {
               class_1703 var1 = Iiiilllliiilll.field_1724.field_7512;
               boolean var2 = var1 instanceof class_1707 && this.IIllllIlll(var1);
               if (!var2) {
                  if (!(var1 instanceof class_1707)) {
                     Iiiilllliiilll.field_1724.field_3944.method_45730(IliIlllilIi<invokedynamic>());
                     this.lliIiIiiil = 20;
                  }
               } else {
                  this.iiiIlIIIll(var1);
               }
            }
         }
      }
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) + '裸') ^ '긟') ^ var5) ^ var5) ^ '얋') << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) + '裸') ^ '긟') ^ var5) ^ var5) ^ '얋') >>> 4) + var5) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) + '裸') ^ '긟') ^ var5) ^ var5) ^ '얋') << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) + '裸') ^ '긟') ^ var5) ^ var5) ^ '얋') >>> 4) + var5) >>> 1) ^ 18309) - '팋') - 10054) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean iIlllIllll(class_1792 item) {
      long var3 = -3164740452432965209L;
      var3 ^= ((long)this.IilIiIiiil.Iilllilliill().equals(IliIlllilIi<invokedynamic>()) << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) != 0 ? this.lilIiIiiil.Iiilliiliiil(item) : !this.lilIiIiiil.Iiilliiliiil(item);
   }
}
