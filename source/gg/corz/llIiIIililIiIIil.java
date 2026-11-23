package gg.corz;

import com.corz.client.CorzClient;
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
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_4587;

public final class llIiIIililIiIIil {
   private static final String[] IlIlilIIil = new String[]{Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>()};
   private long iillilIIil;
   private static class_2960 llIlilIIil;
   public static final String iIlIilIIil = "autotpahere";
   private static final String[] iIIlilIIil = new String[]{Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>()};
   private static final float IiiIilIIil = 2.5F;
   private static final String iilIilIIil = "...";
   private static final String illIilIIil = "Deaths";
   private final llliiiiilliiii illlilIIil = new llliiiiilliiii();
   private static final String lilIilIIil = " came";
   private static final float iliIilIIil = 6.0F;
   private final llliiiiilliiii IlllilIIil = new llliiiiilliiii();
   private final llliiiiilliiii iIllilIIil = new llliiiiilliiii();
   private static final String lllIilIIil = "Sent";
   private static final float iiiIilIIil = ((float)Math.PI * 2F);
   private static final String IllIilIIil = "Auto TPA Here";
   private final iiIIlillIIlIlill IiIlilIIil = new iiIIlillIIlIlill();
   private float liililIIil;
   private float iiililIIil;
   private final iiIiIliIIliIli IIllilIIil = new iiIiIliIIliIli();
   private final llliiiiilliiii lIllilIIil = new llliiiiilliiii();
   private static final float IliIilIIil = 10.0F;
   private int lIililIIil = -1;
   private final iiIIlIIiIIlIlIIi liIlilIIil = new iiIIlIIiIIlIlIIi();
   private final llliiiiilliiii llllilIIil = new llliiiiilliiii();
   private static final float iIiIilIIil = 220.0F;
   private int iIililIIil;
   private static final float lliIilIIil = 4.0F;
   private int IlililIIil;
   private boolean IIililIIil = true;
   private float lIIiilIIil;
   private long IillilIIil;
   private final iiIiIliIIliIli iiIlilIIil = new iiIiIliIIliIli();
   private static final long lIIlilIIil = 1800000000L;
   private IIliiIlllIliiIll IiililIIil;
   private long lillilIIil;
   private final class_4587 ilIlilIIil = new class_4587();
   private static final float lIiIilIIil = 150.0F;
   private static final int IIiIilIIil = iilIllIiIIiIllIi.IlIlllIlilIl(0, ~1640473750 + -61 ^ -1640473802);
   private static final float liiIilIIil = 0.22F;
   private static final long IIIlilIIil = 220000000L;
   private liIIiilliiIIiill llililIIil;
   private String ilililIIil = "";
   private static final String IilIilIIil = "Home";
   private float IIIiilIIil;

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - '\ue9eb'))) << 4 | (char)(~((char)(var4[var5] - '\ue9eb'))) >>> 12) + var5) - 26817) + 9509) - var5) ^ 2346))) ^ 'ꣳ') ^ '\ue834') + 28259) + var5))) + var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void IIIllIIliIIl(float argb, float now, int y, long x) {
      float var6 = llliIlIlilliIlIl.IIIllIIliIIl(argb);
      float var7 = llliIlIlilliIlIl.IIIllIIliIIl(now);
      float var8 = 0.5F + 0.5F * (float)Math.cos((double)((float)(x % 1800000000L) * 3.4906587E-9F));
      llliIlIlilliIlIl.Ililllililil(var6, var7, 4.0F, 4.0F, 2.0F, llliIlIlilliIlIl.iliIiiliiiii(y, 0.22F * (0.35F + 0.65F * var8)), 2.5F, true);
      llliIlIlilliIlIl.IIillIiliIil(var6, var7, 4.0F, 4.0F, 2.0F, 0.0F, y);
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(~((char)(~((char)((char)(var4[var5] ^ var5) ^ 10913))))) + var5))) >>> 1 | (char)(~((char)((char)(~((char)(~((char)((char)(var4[var5] ^ var5) ^ 10913))))) + var5))) << 15) - '쌆'))) ^ '煮') ^ var5) + 5024))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void IilliliilIIi(class_332 ctx, int now, float sw, long dt) {
      IIliiIlllIliiIll var6 = llliIlIlilliIlIl.IliIlllilIi();
      if (var6 != this.IiililIIil) {
         this.IiililIIil = var6;
         this.liililIIil = llliIlIlilliIlIl.lIliliIlil(Iilllilliill<invokedynamic>(), 0.95F);
         this.iiililIIil = llliIlIlilliIlIl.lIliliIlil(Iilllilliill<invokedynamic>(), 0.78F);
         this.IIIiilIIil = llliIlIlilliIlIl.lIliliIlil(Iilllilliill<invokedynamic>(), 0.78F);
         this.lIIiilIIil = llliIlIlilliIlIl.lIliliIlil(Iilllilliill<invokedynamic>(), 0.78F);
      }

      if (this.iIllilIIil.IliIlllilIi((long)this.ilililIIil.hashCode() * 31L + (long)System.identityHashCode(var6))) {
         float var7 = 196.0F;
         this.iIllilIIil.liiiIIllIl(Illlllllilll(IiiIliiliiIlii.liiiIIllIl(this.ilililIIil), var7), 0.9F, false, !this.IIililIIil);
      }

      float var32 = 7.0F;
      float var8 = 4.0F;
      float var9 = 15.0F;
      float var10 = var32 + this.iiililIIil + var8 + this.IlllilIIil.iliillIlIl + 10.0F + this.IIIiilIIil + var8 + this.llllilIIil.iliillIlIl + 10.0F + this.lIIiilIIil + var8 + this.illlilIIil.iliillIlIl + var32;
      float var11 = Math.max(llliIlIlilliIlIl.lIlIliIlIl(this.liililIIil, this.lIllilIIil.iliillIlIl), Math.max(var32 + 4.0F + 6.0F + this.iIllilIIil.IliillIlIl + var32, var10));
      float var12 = this.iiIlilIIil.IilliliilIIi(Math.max(150.0F, Math.min(220.0F, (float)Math.ceil((double)var11))), sw, 0.08F);
      float var13 = llliIlIlilliIlIl.IlIlllIlilIl(30.0F + 2.0F * var9 + 5.0F);
      float var14 = ((float)now - var12) / 2.0F;
      float var15 = this.IIllilIIil.IliIlllilIi(IIililillIililil.liIIlliiIIll(var14, IiIlliIliiIl(), var12, var13, lIiiIiIlilli()), sw, 0.08F);
      float var16 = IIililillIililil.IiiiIlliiiIl(Iilllilliill<invokedynamic>());
      float var17 = IIililillIililil.iiiiIlIIIIll(Iilllilliill<invokedynamic>());
      iiIliiiIIlliii var18 = IIililillIililil.ilIIllIiIIll(Iilllilliill<invokedynamic>(), var14 + var16, var15 + var17, var12, var13);
      float var19 = llliIlIlilliIlIl.IIIllIIliIIl(var14 + var16);
      float var20 = llliIlIlilliIlIl.IIIllIIliIIl(var15 + var17);
      if (var18 != null) {
         var18.IilliliilIIi(this.ilIlilIIil);
      }

      float var21 = IliiIilliiIi.IilliliilIIi(this.IiIlilIIil.IliIlllilIi());
      boolean var22 = llliIlIlilliIlIl.lIIIiiIIIi(ctx, var19 + var12 / 2.0F, var20 + var13 / 2.0F, this.IiIlilIIil.liiiIIllIl());

      try {
         llliIlIlilliIlIl.Iiilliiliiil(IIiIilIIil, var19, var20, var12, var13, 1.0F);
         float var23 = llliIlIlilliIlIl.IllIllllIl(ctx, var19, var20, var12, IIlllIlliIll(), Iilllilliill<invokedynamic>(), this.lIllilIIil, this.liIlilIIil, 1.0F);
         float var24 = var19 + var32;
         this.IIIllIIliIIl(var24, var23 + llliIlIlilliIlIl.IIIllIIliIIl((var9 - 4.0F) / 2.0F), this.IlIlllIlilIl(dt), dt);
         llliIlIlilliIlIl.lliililiil(this.iIllilIIil, var24 + 4.0F + 6.0F, llliIlIlilliIlIl.illilIilil(var23, var9, 0.9F), 0.9F, llliIlIlilliIlIl.liIlIlIiIl);
         float var25 = var23 + var9;
         float var26 = llliIlIlilliIlIl.illilIilil(var25, var9, 0.78F);
         float var27 = llliIlIlilliIlIl.illilIilil(var25, var9, 0.9F);
         float var28 = iliIiiliiiii(Iilllilliill<invokedynamic>(), this.iiililIIil, this.IlllilIIil, var24, var26, var27) + 10.0F;
         var28 = iliIiiliiiii(Iilllilliill<invokedynamic>(), this.IIIiilIIil, this.llllilIIil, var28, var26, var27) + 10.0F;
         iliIiiliiiii(Iilllilliill<invokedynamic>(), this.lIIiilIIil, this.illlilIIil, var28, var26, var27);
      } finally {
         llliIlIlilliIlIl.IlIIillIIi(ctx, var22);
         IliiIilliiIi.lIiiIiIlilli(var21);
         if (var18 != null) {
            this.ilIlilIIil.method_22909();
         }

      }

   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8131798850150704710L ^ Long.rotateLeft(2587870882315406376L, 13) ^ -6879290565958225609L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1741876263571335123L ^ Long.rotateLeft(1049912916035038353L, 53) ^ -1801127878135994377L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8967509746358879422L ^ Long.rotateLeft(7480686746035624396L, 13) ^ -2427474839534160134L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 8548612202357761381L ^ Long.rotateLeft(1599067229678506898L, 52) ^ -1998944033808053748L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 145638269249560699L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8159115753383866621L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -3070698984760540867L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7247082610519872700L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -815056412486794679L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4619157505833638787L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IIIilIIiiIIi<invokedynamic>());
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

   private static float IiIlliIliiIl() {
      long var3 = 4603618867808649654L;
      var3 ^= ((long)IiIiIIliliIiIIli.iIlllIllll() << 32 ^ var3) & -1L << 32;
      float var1 = (int)(var3 >>> 32) > 0 ? (float)((int)(var3 >>> 32)) + 5.0F : 6.0F;
      ilIllIiIll var2 = llilIllililIll.iliIiiliiiii(IIililillIililil.class);
      if (var2 != null && var2.IliIlllilIi() && IiIlIiIiliIlIiIi.Illlllllilll().iIlIlllllill()) {
         var1 += 26.0F * IIililillIililil.iIlIllIllIll(Iilllilliill<invokedynamic>()) + 6.0F;
      }

      return var1;
   }

   private static class_2960 IIlllIlliIll() {
      if (llIlilIIil == null) {
         llIlilIIil = lIlIIiliIlIIil.illIlIilIl(Iilllilliill<invokedynamic>());
      }

      return llIlilIIil;
   }

   private static String Illlllllilll(String avail, float s) {
      if (avail != null && !avail.isEmpty()) {
         if (llliIlIlilliIlIl.lIliliIlil(avail, 0.9F) <= s) {
            return avail;
         } else {
            int var2 = 0;
            int var3 = avail.length();

            while(var2 < var3) {
               int var4 = var2 + var3 + 1 >>> 1;
               if (llliIlIlilliIlIl.lIliliIlil(avail.substring(0, var4) + Iilllilliill<invokedynamic>(), 0.9F) <= s) {
                  var2 = var4;
               } else {
                  var3 = var4 - 1;
               }
            }

            return avail.substring(0, var2).stripTrailing() + Iilllilliill<invokedynamic>();
         }
      } else {
         return "";
      }
   }

   public void IliIlllilIi() {
      this.IillilIIil += 2L;
      this.IIililIIil = true;
      this.lillilIIil = 0L;
      this.iillilIIil = 0L;
      this.lIililIIil = -1;
      this.llililIIil = null;
      this.iiIlilIIil.iIlIlllllill();
      this.IIllilIIil.iIlIlllllill();
   }

   private static String[] lIiiIiIlilli() {
      ilIllIiIll var0 = llilIllililIll.iliIiiliiiii(iIIiIlIlIiIl.class);
      return var0 != null && var0.IliIlllilIi() ? IlIlilIIil : iIIlilIIil;
   }

   private void iIlIlllllill(IlillIIillillIIi deaths, int s, int now, long homeTrips) {
      boolean var6 = !this.IIililIIil;
      String var7 = deaths.IIIllIIliIIl() != null ? deaths.IIIllIIliIIl() : deaths.iIlIlllllill();
      this.ilililIIil = var7 == null ? "" : var7;
      int var8 = deaths.iliIiiliiiii();
      if (this.lIllilIIil.IliIlllilIi((long)var8)) {
         this.lIllilIIil.liiiIIllIl(var8 > 0 ? var8 + Iilllilliill<invokedynamic>() : "", 0.8F, true, false);
         if (this.lIililIIil >= 0 && var8 > this.lIililIIil) {
            this.liIlilIIil.IliIlllilIi();
         }
      }

      this.lIililIIil = var8;
      if (deaths.liiiIIllIl() != this.llililIIil) {
         boolean var9 = this.llililIIil == null || this.IIililIIil;
         this.iIililIIil = this.IlililIIil;
         this.llililIIil = deaths.liiiIIllIl();
         this.iillilIIil = var9 ? 0L : homeTrips;
      }

      if (this.IlllilIIil.IliIlllilIi((long)deaths.lIiiIiIlilli())) {
         this.IlllilIIil.liiiIIllIl(String.valueOf(deaths.lIiiIiIlilli()), 0.9F, true, var6);
      }

      if (this.llllilIIil.IliIlllilIi((long)s)) {
         this.llllilIIil.liiiIIllIl(String.valueOf(Math.max(0, s)), 0.9F, true, var6);
      }

      if (this.illlilIIil.IliIlllilIi((long)now)) {
         this.illlilIIil.liiiIIllIl(String.valueOf(Math.max(0, now)), 0.9F, true, var6);
      }

   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - '裥') >>> 14 | (char)((char)(-((char)(var4[var5] ^ var5))) - '裥') << 2) ^ '왪') + 'ꗚ') ^ 9094) + 19724))))))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void liiiIIllIl(class_332 ctx, IlillIIillillIIi s, int homeTrips, int deaths) {
      class_310 var5 = class_310.method_1551();
      if (ctx != null && var5.field_1724 != null && s != null) {
         CorzClient.fontManager.iIlIlllllill(this.ilIlilIIil);
         IIIiiIillIIiiIil.IliIlllilIi(this.ilIlilIIil);
         double var6 = (double)var5.method_22683().method_4495();
         int var8 = var5.method_22683().method_4476(IIililillIililil.iiiIlIIIll(var5), var5.method_1573());
         float var9 = (float)((double)var8 / var6);
         boolean var10 = Math.abs(var9 - 1.0F) > 1.0E-4F;
         int var11 = var10 ? Math.round((float)var5.method_22683().method_4486() / var9) : var5.method_22683().method_4486();
         if (var10) {
            IliiIilliiIi.lIIlllIIliIIlllIIl = (float)var11;
            IliiIilliiIi.IlIlllIIlllIlllIIl = (float)Math.round((float)var5.method_22683().method_4502() / var9);
         }

         try {
            float var12 = IIililillIililil.ilIllIiIll();
            if (!(var12 < 0.004F)) {
               long var13 = System.nanoTime();
               float var15 = this.lillilIIil == 0L ? 0.016F : Math.min(0.05F, (float)(var13 - this.lillilIIil) / 1.0E9F);
               this.lillilIIil = var13;
               this.iIlIlllllill(s, homeTrips, deaths, var13);
               if (!this.IiIlilIIil.IilliliilIIi(true, ++this.IillilIIil)) {
                  return;
               }

               float var16 = IliiIilliiIi.IilliliilIIi(var12);

               try {
                  this.IilliliilIIi(ctx, var11, var15, var13);
               } finally {
                  IliiIilliiIi.lIiiIiIlilli(var16);
               }

               this.IIililIIil = false;
               return;
            }
         } finally {
            if (var10) {
               IliiIilliiIi.lIIlllIIliIIlllIIl = 0.0F;
               IliiIilliiIi.IlIlllIIlllIlllIIl = 0.0F;
            }

         }

      }
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 8669) - var5) << 7 | (char)((char)((char)(var4[var5] + var5) ^ 8669) - var5) >>> 9) >>> 11 | (char)((char)((char)((char)(var4[var5] + var5) ^ 8669) - var5) << 7 | (char)((char)((char)(var4[var5] + var5) ^ 8669) - var5) >>> 9) << 5) ^ var5) ^ var5))) + var5) + var5))) + var5) ^ 7344) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private int IlIlllIlilIl(long now) {
      int var10000;
      if (this.llililIIil == null) {
         var10000 = llliIlIlilliIlIl.Illlllllilll();
      } else {
         switch (this.llililIIil) {
            case IIlIiliill -> var10000 = -8393375;
            case lIlIiliill -> var10000 = -1535700;
            case iIlIiliill -> var10000 = -1750963;
            default -> var10000 = llliIlIlilliIlIl.Illlllllilll();
         }
      }

      int var3 = var10000;
      float var4 = this.iillilIIil == 0L ? 1.0F : llliIlIlilliIlIl.liiiIIllIl((float)(now - this.iillilIIil) / 2.2E8F);
      if (var4 >= 1.0F) {
         this.iillilIIil = 0L;
      }

      this.IlililIIil = var4 >= 1.0F ? var3 : IilIIIIililIIIIi.Illlllllilll(this.iIililIIil, var3, (double)llliIlIlilliIlIl.iIlIlllllill(var4));
      return this.IlililIIil;
   }

   private static float iliIiiliiiii(String v, float vy, llliiiiilliiii label, float labelW, float ly, float x) {
      llliIlIlilliIlIl.lililiilil(v, labelW, ly, 0.78F, llliIlIlilliIlIl.iiIlIlIiIl);
      float var6 = labelW + vy + 4.0F + label.iliillIlIl;
      llliIlIlilliIlIl.iIiilIliil(label, var6, x, 0.9F, llliIlIlilliIlIl.liIlIlIiIl);
      return var6;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] + '\uef62') - 28716))) + 3374))) + var5) + var5))) - var5) >>> 14 | (char)((char)(-((char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] + '\uef62') - 28716))) + 3374))) + var5) + var5))) - var5) << 2) - 4470))) - var5) ^ var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
