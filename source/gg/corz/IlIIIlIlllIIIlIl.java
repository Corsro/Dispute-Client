package gg.corz;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_3986;
import net.minecraft.class_3989;
import net.minecraft.class_4587;
import org.joml.Matrix4f;

public class IlIIIlIlllIIIlIl extends ilIllIiIll {
   private final List<class_3989> iIIlIiilIl = new ArrayList();
   private final iiIiiilIIliiil IliIIiilIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil iIlIIiilIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private int llIlIiilIl = 0;
   private final iiIiiilIIliiil lIlIIiilIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil IiiIIiilIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil iilIIiilIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iilliIlIIiliIl IllIIiilIl = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 60, 10, 300);
   private final Map<Integer, Long> IIIlIiilIl = new HashMap();
   private final iiIiiilIIliiil lilIIiilIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil lllIIiilIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iilliIlIIiliIl lliIIiilIl = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 12, 5, 30);
   private final iiIiiilIIliiil IIiIIiilIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final List<class_3986> IlIlIiilIl = new ArrayList();
   private final iiIiiilIIliiil illIIiilIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final IIIIlilllIIIlill lIiIIiilIl = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0.7, 0.1, (double)1.0F, 0.05);
   private final Map<Integer, class_243> lIIlIiilIl = new HashMap();
   private final Set<Integer> liiIIiilIl = new HashSet();
   private final IIIIlilllIIIlill iIiIIiilIl = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)1.5F, (double)0.5F, (double)4.0F, (double)0.5F);
   private final iilliIlIIiliIl iliIIiilIl = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 20, 5, 50);
   private final Map<Integer, Long> iiiIIiilIl = new HashMap();
   private final iiIiiilIIliiil IilIIiilIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);

   private Color Iillllilll() {
      Color var1 = new Color(IlIIilIlllIIilIl.lliiIlliIl);
      return new Color(var1.getRed(), var1.getGreen(), var1.getBlue(), (~(-(-499654690 - 41)) >>> 17 | ~(-(-499654690 - 41)) << 15) ^ -270896668);
   }

   protected void Illillliilli() {
      this.iiiIlIIIll();
   }

   private void iiiIlIIIll() {
      this.liiIIiilIl.clear();
      this.iiiIIiilIl.clear();
      this.IIIlIiilIl.clear();
      this.lIIlIiilIl.clear();
      this.iIIlIiilIl.clear();
      this.IlIlIiilIl.clear();
      this.llIlIiilIl = 0;
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) - var5) + '駞') << 5 | (char)((char)((char)(~((char)(var4[var5] - var5))) - var5) + '駞') >>> 11) >>> 6 | (char)((char)((char)((char)(~((char)(var4[var5] - var5))) - var5) + '駞') << 5 | (char)((char)((char)(~((char)(var4[var5] - var5))) - var5) + '駞') >>> 11) << 10) + var5) >>> 4 | (char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) - var5) + '駞') << 5 | (char)((char)((char)(~((char)(var4[var5] - var5))) - var5) + '駞') >>> 11) >>> 6 | (char)((char)((char)((char)(~((char)(var4[var5] - var5))) - var5) + '駞') << 5 | (char)((char)((char)(~((char)(var4[var5] - var5))) - var5) + '駞') >>> 11) << 10) + var5) << 12))))) ^ '칁') + 5235));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void IlIllllIll(class_3989 trader) {
      long var11 = -3965157257960294447L;
      long var13 = -654142929731783770L;
      long var15 = 2692623544570730307L;
      if (this.lIlIIiilIl.Iilllilliill()) {
         var11 ^= ((long)trader.method_5628() << 32 ^ var11) & -1L << 32;
         long var3 = System.currentTimeMillis();
         Long var5 = (Long)this.iiiIIiilIl.get((int)(var11 >>> 32));
         if (var5 == null || var3 - var5 >= (long)this.IllIIiilIl.Iilllilliill() * (4841672407077246560L ^ 4841672407077246344L)) {
            if (!this.liiIIiilIl.contains((int)(var11 >>> 32)) || var5 == null) {
               this.liiIIiilIl.add((int)(var11 >>> 32));
               this.iiiIIiilIl.put((int)(var11 >>> 32), var3);
               var11 ^= ((long)class_3532.method_15357(trader.method_23317()) ^ var11) & -1L >>> 32;
               var13 ^= ((long)class_3532.method_15357(trader.method_23318()) << 32 ^ var13) & -1L << 32;
               var13 ^= ((long)class_3532.method_15357(trader.method_23321()) ^ var13) & -1L >>> 32;
               var15 ^= ((long)((int)Iiiilllliiilll.field_1724.method_5739(trader)) << 32 ^ var15) & -1L << 32;
               String var10 = String.format(IliIlllilIi<invokedynamic>(), (int)var11, (int)(var13 >>> 32), (int)var13, (int)(var15 >>> 32));
               Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<invokedynamic>(), var10, true);
               if (this.iIlIIiilIl.Iilllilliill()) {
                  IilIlllilIll.IliIlllilIi();
               }

               if (this.IiiIIiilIl.Iilllilliill()) {
                  this.ilIllIiIll(trader, (int)var11, (int)(var13 >>> 32), (int)var13, (int)(var15 >>> 32));
               }

            }
         }
      }
   }

   private Color iilllIIill() {
      Color var1 = new Color(IlIIilIlllIIilIl.lliiIlliIl);
      return new Color((int)((float)var1.getRed() * 0.65F), (int)((float)var1.getGreen() * 0.65F), (int)((float)var1.getBlue() * 0.65F), --163708088 + -85 ^ 163708075);
   }

   public IlIIIlIlllIIIlIl() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lIlIIiilIl, this.iIlIIiilIl, this.IllIIiilIl, this.lllIIiilIl, this.illIIiilIl, this.IilIIiilIl, this.lilIIiilIl, this.iilIIiilIl, this.IIiIIiilIl, this.lIiIIiilIl, this.iIiIIiilIl, this.IliIIiilIl, this.lliIIiilIl, this.iliIIiilIl, this.IiiIIiilIl});
   }

   private void IIllllIlll(class_4587 color, float stack, float x1, float y2, float z2, float x2, float y1, Color z1) {
      Matrix4f var9 = color.method_23760().method_23761();
      int var10 = z1.getRGB();
      float var11 = (z2 - stack) * 0.25F;
      float var12 = (x2 - x1) * 0.25F;
      float var13 = (y1 - y2) * 0.25F;
      this.iIlllIllll(var9, stack, x1, y2, var11, var12, var13, var10);
      this.iIlllIllll(var9, z2, x1, y2, -var11, var12, var13, var10);
      this.iIlllIllll(var9, z2, x1, y1, -var11, var12, -var13, var10);
      this.iIlllIllll(var9, stack, x1, y1, var11, var12, -var13, var10);
      this.iIlllIllll(var9, stack, x2, y2, var11, -var12, var13, var10);
      this.iIlllIllll(var9, z2, x2, y2, -var11, -var12, var13, var10);
      this.iIlllIllll(var9, z2, x2, y1, -var11, -var12, -var13, var10);
      this.iIlllIllll(var9, stack, x2, y1, var11, -var12, -var13, var10);
      iIiiIIilIliiIIil.IiIiliIiiiIi();
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - '郄') - 17856) << 3 | (char)((char)(var4[var5] - '郄') - 17856) >>> 13) + '鬆'))) ^ '\udc84') - var5) << 2 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - '郄') - 17856) << 3 | (char)((char)(var4[var5] - '郄') - 17856) >>> 13) + '鬆'))) ^ '\udc84') - var5) >>> 14) ^ var5) >>> 15 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - '郄') - 17856) << 3 | (char)((char)(var4[var5] - '郄') - 17856) >>> 13) + '鬆'))) ^ '\udc84') - var5) << 2 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - '郄') - 17856) << 3 | (char)((char)(var4[var5] - '郄') - 17856) >>> 13) + '鬆'))) ^ '\udc84') - var5) >>> 14) ^ var5) << 1) - var5) - var5) + 'ꖏ') + var5) + '蜣') ^ '\ue492'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void liIlliiIll(class_4587 entity, class_243 stack, class_1297 td, float color, Color cam) {
      double var6 = class_3532.method_16436((double)color, td.field_6014, td.method_23317());
      double var8 = class_3532.method_16436((double)color, td.field_6036, td.method_23318());
      double var10 = class_3532.method_16436((double)color, td.field_5969, td.method_23321());
      float var12 = td.method_17681() / 2.0F;
      float var13 = td.method_17682();
      float var14 = (float)(var6 - (double)var12 - stack.field_1352);
      float var15 = (float)(var8 - stack.field_1351);
      float var16 = (float)(var10 - (double)var12 - stack.field_1350);
      float var17 = (float)(var6 + (double)var12 - stack.field_1352);
      float var18 = (float)(var8 + (double)var13 - stack.field_1351);
      float var19 = (float)(var10 + (double)var12 - stack.field_1350);
      this.IIllllIlll(entity, var14, var15, var16, var17, var18, var19, cam);
   }

   private void iIlllIllll(Matrix4f cz, float argb, float dz, float cy, float dx, float cx, float dy, int m) {
      iIiiIIilIliiIIil.Iliilliiilii(cz, argb, dz, cy, argb + dx, dz, cy, m, 2.0F);
      iIiiIIilIliiIIil.Iliilliiilii(cz, argb, dz, cy, argb, dz + cx, cy, m, 2.0F);
      iIiiIIilIliiIIil.Iliilliiilii(cz, argb, dz, cy, argb, dz, cy + dy, m, 2.0F);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 7467414587498657466L ^ Long.rotateLeft(-8051234817938242999L, 51) ^ 790156018938120252L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -3352132222026049977L ^ Long.rotateLeft(4071061541273769491L, 56) ^ -3075485725090457468L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5054887283318228785L ^ Long.rotateLeft(-3367872054593596907L, 21) ^ 558518174576920128L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -2036123310201905203L ^ Long.rotateLeft(-7312639268096860079L, 22) ^ 1860340098894312378L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 2412786556153393381L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -5026395991850036352L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7257258258034662772L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 2591035802816404953L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6269510507305373893L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1943806018664217525L;
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

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         IilIlllilIll.liiiIIllIl();
         ++this.llIlIiilIl;
         if (this.llIlIiilIl % 8 == 0) {
            this.iIIlIiilIl.clear();
            this.IlIlIiilIl.clear();

            for(class_1297 var2 : Iiiilllliiilll.field_1687.method_18112()) {
               if (var2 instanceof class_3989) {
                  class_3989 var3 = (class_3989)var2;
                  if (var3.method_5805() && !var3.method_31481()) {
                     this.iIIlIiilIl.add(var3);
                  }
               }
            }

            double var8 = (double)(this.iliIIiilIl.Iilllilliill() * this.iliIIiilIl.Iilllilliill());

            for(class_3989 var4 : this.iIIlIiilIl) {
               for(class_1297 var6 : Iiiilllliiilll.field_1687.method_18112()) {
                  if (var6 instanceof class_3986) {
                     class_3986 var7 = (class_3986)var6;
                     if (var7.method_5805() && !var7.method_31481() && var7.method_5858(var4) <= var8 && !this.IlIlIiilIl.contains(var7)) {
                        this.IlIlIiilIl.add(var7);
                     }
                  }
               }

               this.IlIllllIll(var4);
               if (this.IliIIiilIl.Iilllilliill()) {
                  this.lIIlliIIll(var4);
               }
            }

            HashSet var10 = new HashSet();

            for(class_3989 var12 : this.iIIlIiilIl) {
               var10.add(var12.method_5628());
            }

            this.IIIlIiilIl.keySet().retainAll(var10);
            this.lIIlIiilIl.keySet().retainAll(var10);
         }
      }
   }

   private void ilIllIiIll(class_3989 x, int z, int dist, int y, int trader) {
      try {
         BufferedWriter var6 = new BufferedWriter(new FileWriter(IliIlllilIi<invokedynamic>(), true));

         try {
            String var7 = LocalDateTime.now().format(DateTimeFormatter.ofPattern(IliIlllilIi<invokedynamic>()));
            String var10001 = IliIlllilIi<invokedynamic>();
            Object[] var10002 = new Object[((-1581440148 << 25 | -1581440148 >>> 7) * -101 << 19 | (-1581440148 << 25 | -1581440148 >>> 7) * -101 >>> 13) ^ 319963904];
            var10002[0] = var7;
            var10002[1] = z;
            var10002[2] = dist;
            var10002[3] = y;
            var10002[4] = trader;
            var10002[5] = x.method_5628();
            var6.write(String.format(var10001, var10002));
         } catch (Throwable var10) {
            try {
               var6.close();
            } catch (Throwable var9) {
               var10.addSuppressed(var9);
            }

            throw var10;
         }

         var6.close();
      } catch (IOException var11) {
      }

   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - var5))) ^ var5) - '\uecc4') - '\uee44') + 11866) + '鹂') - '좏'))) >>> 11 | (char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - var5))) ^ var5) - '\uecc4') - '\uee44') + 11866) + '鹂') - '좏'))) << 5) ^ '몗'))) + var5) - '茺'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue66e') - 9889) + '\uebba') - var5))) - var5) ^ var5) << 14 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue66e') - 9889) + '\uebba') - var5))) - var5) ^ var5) >>> 2) ^ var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void Iilililiiili() {
      this.iiiIlIIIll();
   }

   private void lIIlliIIll(class_3989 trader) {
      int var2 = trader.method_5628();
      class_243 var3 = trader.method_73189();
      double var4 = (double)this.lliIIiilIl.Iilllilliill();
      if (!this.IIIlIiilIl.containsKey(var2)) {
         this.IIIlIiilIl.put(var2, System.currentTimeMillis());
         this.lIIlIiilIl.put(var2, var3);
      } else {
         class_243 var6 = (class_243)this.lIIlIiilIl.get(var2);
         if (var6.method_1022(var3) > var4) {
            this.IIIlIiilIl.put(var2, System.currentTimeMillis());
            this.lIIlIiilIl.put(var2, var3);
         }

      }
   }

   private void lllllillll(class_4587 entity, class_243 cam, class_1297 color, float stack, Color td) {
      double var6 = class_3532.method_16436((double)stack, color.field_6014, color.method_23317());
      double var8 = class_3532.method_16436((double)stack, color.field_6036, color.method_23318()) + (double)color.method_17682() / (double)2.0F;
      double var10 = class_3532.method_16436((double)stack, color.field_5969, color.method_23321());
      float var12 = (float)this.lIiIIiilIl.Iilllilliill();
      int var13 = (new Color((float)td.getRed() / 255.0F, (float)td.getGreen() / 255.0F, (float)td.getBlue() / 255.0F, Math.min(1.0F, Math.max(0.0F, var12)))).getRGB();
      int var14 = (new Color((float)td.getRed() / 255.0F, (float)td.getGreen() / 255.0F, (float)td.getBlue() / 255.0F, Math.min(1.0F, Math.max(0.0F, var12 * 0.4F)))).getRGB();
      Iillllilll.Illlllllilll(var6, var8, var10, var13, var14, (float)this.iIiIIiilIl.Iilllilliill());
      iIiiIIilIliiIIil.IiIiliIiiiIi();
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - '詔') ^ var5) ^ 16911) - var5))) ^ var5) + var5) + var5) ^ 29623) >>> 7 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - '詔') ^ var5) ^ 16911) - var5))) ^ var5) + var5) + var5) ^ 29623) << 9) ^ 21846) ^ 6955) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - '詔') ^ var5) ^ 16911) - var5))) ^ var5) + var5) + var5) ^ 29623) >>> 7 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - '詔') ^ var5) ^ 16911) - var5))) ^ var5) + var5) + var5) ^ 29623) << 9) ^ 21846) ^ 6955) >>> 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void IIiilIiiiIii(illlllIillll event) {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         class_243 var2 = Iiiilllliiilll.field_1773.method_19418().method_71156();
         float var3 = event.liiiiIIiiiiiiIIi;
         Color var4 = this.Iillllilll();
         Color var5 = this.iilllIIill();

         for(class_3989 var7 : this.iIIlIiilIl) {
            if (var7.method_5805() && !var7.method_31481()) {
               if (this.lllIIiilIl.Iilllilliill()) {
                  this.liIlliiIll(event.IliiiIIilliiiIIi, var2, var7, var3, var4);
               }

               if (this.lilIIiilIl.Iilllilliill() && this.iilIIiilIl.Iilllilliill()) {
                  this.lllllillll(event.IliiiIIilliiiIIi, var2, var7, var3, var4);
               }
            }
         }

         for(class_3986 var10 : this.IlIlIiilIl) {
            if (var10.method_5805() && !var10.method_31481()) {
               if (this.illIIiilIl.Iilllilliill()) {
                  this.liIlliiIll(event.IliiiIIilliiiIIi, var2, var10, var3, var5);
               }

               if (this.lilIIiilIl.Iilllilliill() && this.IIiIIiilIl.Iilllilliill()) {
                  Color var8 = new Color(var5.getRed(), var5.getGreen(), var5.getBlue(), (int)(this.lIiIIiilIl.Iilllilliill() * (double)150.0F));
                  this.lllllillll(event.IliiiIIilliiiIIi, var2, var10, var3, var8);
               }
            }
         }

      }
   }
}
