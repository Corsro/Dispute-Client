package gg.corz;

import com.corz.client.CorzClient;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_4588;

public class iIiilIiIliilIi {
   private lllIllillIll liliiIliiiiliiIlii;
   private static final double lIiliIliiiIiliIlii = 0.12;
   private static final float iiiIiIliiIIIliIlii = 2.4E8F;
   private static final int IIiIiIliilIiIiIlii = 0;
   private float lIIiIlliiiIIiIllii;
   private float iiIlIlliiIIllIllii;
   private boolean IiiiiIliiliiiiIlii;
   private float lillIlliiiillIllii;
   private lllIllillIll lllIIlliiillIIllii;
   private static final float ilIliIliiIiIliIlii = 2.6E8F;
   private static final float lIIliIliiiIIliIlii = 3.0F;
   private float ilIiIlliiIiIiIllii;
   private static final DateTimeFormatter IllIiIliilllIiIlii = DateTimeFormatter.ofPattern(Iliilliiilii<invokedynamic>());
   private long llilIlliiililIllii;
   private static final int lliIiIliiiliIiIlii = 2;
   private static final int llIIiIliiilIIiIlii = 7;
   private static final int iiIIiIliiIIlIiIlii = 18;
   private static final float IIlliIliilIlliIlii = 4.5E8F;
   private long liIiIlliiiiIiIllii;
   private static final double IilliIliililliIlii = 0.35;
   private String IIilIlliilIilIllii;
   private static final int lIlIiIliiiIlIiIlii = 12;
   private long iIilIlliiIlilIllii;
   private float IlIiIlliillIiIllii;
   private int IIlIIlliilIlIIllii;
   private final int llIiiIliiilIiiIlii;
   private lllIllillIll illiiIliiIiliiIlii;
   public static final int IIIIiIliilIIIiIlii = 28;
   private int iIiiiIliiIliiiIlii;
   private boolean IlliiIliillliiIlii;
   private static final int iIiIiIliiIliIiIlii = 1;
   private static final int IiIIiIliiliIIiIlii = 150;
   private float illlIlliiIillIllii;
   private int iIlIIlliiIllIIllii;
   private float iilIIlliiIIiIIllii;
   private int lliiiIliiiliiiIlii;
   private boolean iiilIlliiIIIiIllii;
   private static boolean iIIiiIliiIlIiiIlii;
   private int IiIiiIliiliIiiIlii;
   private int IlIIIlliillIIIllii;
   private static final double lllliIliiillliIlii = 0.9;
   private final iIlIlilIllIlil liiIIlliiiiiIIllii;
   private static final iIIliiIiIlIliiIi liiliIliiiiiliIlii = new iIIliiIiIlIliiIi();
   private static final float IlIliIliillIliIlii = 2.6E8F;
   private static final int ililiIliiIiiliIlii = -100000;
   private float lIllIlliiiIllIllii;
   private long llIlIlliiilIlIllii;
   private final ililIIliIiilIIli IliIIlliilliIIllii;
   private boolean IIIlIlliilIIlIllii;
   private static final String illIiIliiIilIiIlii = "Hello, ";
   private float IlllIlliillllIllii;
   private long lIIIIlliiiIIIIllii;
   private static final long IiiIiIliiliiIiIlii = 2600000000L;
   private static int IIIiiIliilIIiiIlii;
   private boolean iIIlIlliiIlIlIllii;
   private int liIIIlliiiiIIIllii;
   private int iiIiiIliiIIliiIlii;
   private int IIiiiIliilIiiiIlii;
   private String IilIIlliililIIllii;
   private static final float iIlliIliiIllliIlii = 56.0F;
   private int ilIIIlliiIiIIIllii;
   private long IIliIlliilIliIllii;
   private final iIlIlilIllIlil iliIIlliiIiiIIllii;
   private static final String lilIiIliiiilIiIlii = "  ·  ";
   private boolean iiiiiIliiIIIIIllii;
   private static final float liIliIliiiiIliIlii = 2.0F;
   private static final double iilliIliiIIiliIlii = 0.55;
   private final ililIIliIiilIIli lIiIIlliiiIiIIllii;
   private float IiIlIlliiliIlIllii;
   private static final double IliliIliilliliIlii = 0.55;
   private final iiiiilIiIIIIIiIi lIliiIliiiIliiIlii;
   private static final int iIIIiIliiIlIIiIlii = 8;
   private float IiilIlliiliilIllii;

   // $FF: synthetic method
   private static CallSite IiIIlliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] << 3 | var4[var5] >>> 13))) ^ 4625))) + '묗') - 6563) - var5) ^ '膙') + 'ﺒ') ^ var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)(-((char)(~var4[var5]))) + 'בֿ') + var5) + var5))) - '뻽') - 26111))) << 5 | (char)(-((char)((char)((char)(~((char)((char)((char)((char)(-((char)(~var4[var5]))) + 'בֿ') + var5) + var5))) - '뻽') - 26111))) >>> 11))) ^ var5))) ^ var5))) - var5) + '醀') - 13736));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void Iilllilliill(ililIIliIiilIIli alpha, float l, float textX, float textY) {
      IIillIiliIil(alpha.liiIilIlIi, l, textX, alpha.IIIlilIlIi, textY);
      IIillIiliIil(alpha.iiiIilIlIi, l + alpha.iIIlilIlIi, textX, alpha.lIIlilIlIi, textY);
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -2097609303780137922L ^ Long.rotateLeft(4345880082952220894L, 20) ^ -8693317356981810849L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5601648613112833107L ^ Long.rotateLeft(2571512359774425214L, 30) ^ -5644945582464739701L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -1554180593925319404L ^ Long.rotateLeft(-296209938858716330L, 43) ^ 8191015377364579135L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 3369333027694430685L ^ Long.rotateLeft(-8423431668113860238L, 21) ^ -6499753066292578427L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 2848994332601607474L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 8091795858990744457L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7438994790579946868L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 6457476055953328051L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6565456990251261993L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4051104558659471712L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iiiiliiiiiii<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIIIllIIIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, iIIIlIlIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, llIIlilIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIIlliIIl<invokedynamic>());
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

   public void liiiIIllIl(int x, int width) {
      if (x != this.IiIiiIliiliIiiIlii || width != this.iiIiiIliiIIliiIlii) {
         float var3 = (float)(x - this.IiIiiIliiliIiiIlii) + (float)(width - this.iiIiiIliiIIliiIlii) / 2.0F;
         this.IiIiiIliiliIiiIlii = x;
         this.iiIiiIliiIIliiIlii = width;
         this.lIIiIlliiiIIiIllii += var3;
         this.IlIiIlliillIiIllii += var3;
         this.ilIiIlliiIiIiIllii += var3;
         this.lIliiIliiiIliiIlii.IliIlllilIi(x + width - 150 - 8, this.llIiiIliiilIiiIlii + 5, 150, 18);
      }
   }

   public void IilliliilIIi(class_332 my, int ctx, int delta, float mx) {
      long var17 = 2632034807897352204L;
      long var19 = -6461264341743264651L;
      if (this.IlliiIliillliiIlii) {
         IIliiIlllIliiIll var5 = CorzClient.fontRenderer();
         long var6 = System.nanoTime();
         liiliIliiiiiliIlii.iIlIlllllill();
         if (iIIiiIliiIlIiiIlii) {
            liiliIliiiiiliIlii.IliIlllilIi();
            iIIiiIliiIlIiiIlii = false;
         }

         IIiIllIllIiIllIl.lIiiIiIlilli(my, (float)this.IiIiiIliiliIiiIlii, (float)this.llIiiIliiilIiiIlii, (float)this.iiIiiIliiIIliiIlii, 28.0F, 7.0F, IilIIIIililIIIIi.iliIiiliiiii(), 234881023);
         var17 ^= ((long)var5.IlIillIiilIi(this.llIiiIliiilIiiIlii, 28) << 32 ^ var17) & -1L << 32;
         var17 ^= ((long)(this.IiIiiIliiliIiiIlii + this.iiIiiIliiIIliiIlii - 150 - 8) ^ var17) & -1L >>> 32;
         float var10 = (float)(this.IiIiiIliiliIiiIlii + 8);
         float var11 = (float)this.llIiiIliiilIiiIlii + 14.0F;
         this.lIiiIiIlilli(var5, var6);
         this.iliIiiliiiii(var5, var6, (float)((int)var17 - 24) - this.IiilIlliiliilIllii - var10);
         this.IiIlliIliiIl(var6);
         this.IIlllIlliIll(var6, llilliilililliil.IIIllIIliIIl((var10 + this.lIiIIlliiiIiIIllii.IlIlilIlIi + (float)((int)var17)) / 2.0F - this.IiilIlliiliilIllii / 2.0F));
         liiliIliiiiiliIlii.lIiiIiIlilli(0);
         if (liiliIliiiiiliIlii.liilIIIlIi > 0.002F) {
            var19 ^= ((long)llilliilililliil.IlIlllIlilIl(my, var10 + this.lIiIIlliiiIiIIllii.IlIlilIlIi / 2.0F, var11, liiliIliiiiiliIlii.iiilIIIlIi) << 32 ^ var19) & -1L << 32;
            float var13 = IliiIilliiIi.IilliliilIIi(liiliIliiiiiliIlii.liilIIIlIi);

            try {
               this.Illlllllilll(var10, (float)((int)(var17 >>> 32)));
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var13);
               llilliilililliil.IiIlliIliiIl(my, (boolean)((int)(var19 >>> 32)));
            }
         }

         liiliIliiiiiliIlii.lIiiIiIlilli(1);
         if (liiliIliiiiiliIlii.liilIIIlIi > 0.002F) {
            var19 ^= ((long)llilliilililliil.IlIlllIlilIl(my, this.lIIiIlliiiIIiIllii + this.IiilIlliiliilIllii / 2.0F, var11, liiliIliiiiiliIlii.iiilIIIlIi) << 32 ^ var19) & -1L << 32;
            float var33 = IliiIilliiIi.IilliliilIIi(liiliIliiiiiliIlii.liilIIIlIi);

            try {
               this.Ililllililil((float)((int)(var17 >>> 32)), var6);
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var33);
               llilliilililliil.IiIlliIliiIl(my, (boolean)((int)(var19 >>> 32)));
            }
         }

         liiliIliiiiiliIlii.lIiiIiIlilli(2);
         if (liiliIliiiiiliIlii.liilIIIlIi > 0.002F) {
            var19 ^= ((long)liiliIliiiiiliIlii.IIIiIIIlIi << 32 ^ var19) & -1L << 32;
            var19 ^= ((long)llilliilililliil.IlIlllIlilIl(my, (float)((int)var17) + 75.0F, var11, liiliIliiiiiliIlii.iiilIIIlIi) ^ var19) & -1L >>> 32;
            float var14 = IliiIilliiIi.IilliliilIIi(liiliIliiiiiliIlii.liilIIIlIi);

            try {
               this.lIliiIliiiIliiIlii.iliIiiliiiii(my, (int)(var19 >>> 32) != 0 ? ctx : -100000, delta, mx);
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var14);
               llilliilililliil.IiIlliIliiIl(my, (boolean)((int)var19));
            }
         }

         this.Iiilliiliiil(var6);
      }
   }

   private void IiIlliIliiIl(long now) {
      float var3 = this.llIlIlliiilIlIllii == 0L ? 1.0F : (float)(now - this.llIlIlliiilIlIllii) / 2.4E8F;
      if (var3 >= 1.0F) {
         this.llIlIlliiilIlIllii = 0L;
         this.lIllIlliiiIllIllii = 0.0F;
         this.IlllIlliillllIllii = 0.0F;
         this.illlIlliiIillIllii = 1.0F;
         this.lillIlliiiillIllii = 0.0F;
      } else {
         float var4 = llilliilililliil.IliIlllilIi(var3 / 0.45F);
         float var5 = llilliilililliil.liiiIIllIl((var3 - 0.3F) / 0.7F);
         this.lIllIlliiiIllIllii = this.IiIlIlliiliIlIllii * (1.0F - var4);
         this.IlllIlliillllIllii = this.iiIlIlliiIIllIllii + (-3.0F - this.iiIlIlliiIIllIllii) * var4;
         this.illlIlliiIillIllii = var5;
         this.lillIlliiiillIllii = 3.0F * (1.0F - var5);
      }
   }

   // $FF: synthetic method
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)(~((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - 24863) - var5) >>> 10 | (char)((char)((char)(~var4[var5]) - 24863) - var5) << 6) + var5) ^ '쀾') - 3500) ^ '\uece0'))) ^ '\udbb3') + 13802))) - var5) >>> 4 | (char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - 24863) - var5) >>> 10 | (char)((char)((char)(~var4[var5]) - 24863) - var5) << 6) + var5) ^ '쀾') - 3500) ^ '\uece0'))) ^ '\udbb3') + 13802))) - var5) << 12))))) - var5) - 6700));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iIlIlllllill(lllIllillIll modules, int category, int results, boolean enabled, int searching) {
      this.illiiIliiIiliiIlii = modules;
      this.IIiiiIliilIiiiIlii = category;
      this.iIiiiIliiIliiiIlii = results;
      this.IiiiiIliiliiiiIlii = enabled;
      this.lliiiIliiiliiiIlii = searching;
   }

   public iIiilIiIliilIi(int width, int x, int y) {
      long var8 = -4437769292507999682L;
      long var10 = -5953875154529386264L;
      super();
      this.IlliiIliillliiIlii = true;
      this.IlIIIlliillIIIllii = -1;
      this.lIiIIlliiiIiIIllii = new ililIIliIiilIIli();
      this.IliIIlliilliIIllii = new ililIIliIiilIIli();
      this.iliIIlliiIiiIIllii = new iIlIlilIllIlil();
      this.liiIIlliiiiiIIllii = new iIlIlilIllIlil();
      this.illlIlliiIillIllii = 1.0F;
      this.IIilIlliilIilIllii = "";
      this.iIilIlliiIlilIllii = -1L;
      this.IiIiiIliiliIiiIlii = width;
      this.llIiiIliiilIiiIlii = x;
      this.iiIiiIliiIIliiIlii = y;
      var8 ^= ((long)(width + y - 150 - 8) << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)(x + 5) ^ var8) & -1L >>> 32;
      this.lIliiIliiiIliiIlii = new iiiiilIiIIIIIiIi((int)(var8 >>> 32), (int)var8, 150, 18);
      var10 ^= ((long)System.identityHashCode(class_310.method_1551().field_1755) << 32 ^ var10) & -1L << 32;
      var10 ^= ((long)liiliIliiiiiliIlii.iIlIlllllill() ^ var10) & -1L >>> 32;
      if ((int)(var10 >>> 32) != IIIiiIliilIIiiIlii || (int)var10 != 0) {
         IIIiiIliilIIiiIlii = (int)(var10 >>> 32);
         iIIiiIliiIlIiiIlii = true;
      }

   }

   private void Iiilliiliiil(long now) {
      long var19 = -8808040827573819680L;
      long var21 = -6361295009555045127L;
      long var23 = 6568645884656872080L;
      float var3 = 0.0F;
      float var4 = 0.0F;
      if (this.IIliIlliilIliIllii != 0L) {
         float var5 = (float)(now - this.IIliIlliilIliIllii) / 4.5E8F;
         if (var5 >= 1.0F) {
            this.IIliIlliilIliIllii = 0L;
         } else {
            var3 = -56.0F + ((float)this.iiIiiIliiIIliiIlii + 112.0F) * (1.0F - (1.0F - var5) * (1.0F - var5));
            var4 = 1.0F - var5 * var5 * var5;
         }
      }

      var19 ^= ((long)(-16777216 | IlIIilIlllIIilIl.lliiIlliIl) << 32 ^ var19) & -1L << 32;
      var19 ^= ((long)(this.llIiiIliiilIiiIlii + 28 - 1) ^ var19) & -1L >>> 32;
      var21 ^= ((long)(this.iiIiiIliiIIliiIlii * 2) << 32 ^ var21) & -1L << 32;
      class_4588 var8 = llIllIililIllIil.IilliliilIIi();

      for(long var28 = var21 ^ (0L ^ var21) & -1L >>> 32; (int)var28 < (int)(var28 >>> 32); var28 ^= (var28 ^ var28 + (long)1) & -1L >>> 32) {
         double var10 = ((double)((int)var28) + (double)0.5F) / (double)((int)(var28 >>> 32));
         double var12 = 0.9 * IIIilIIiiIIi(var10, 0.35);
         var23 ^= ((long)((int)(var19 >>> 32)) << 32 ^ var23) & -1L << 32;
         if (var4 > 0.0F) {
            double var15 = (((double)((int)var28) + (double)0.5F) * (double)0.5F - (double)var3) / (double)56.0F;
            if (var15 > (double)-1.0F && var15 < (double)1.0F) {
               double var17 = ((double)1.0F - var15 * var15) * ((double)1.0F - var15 * var15) * (double)var4;
               var12 = Math.min((double)1.0F, var12 + 0.55 * var17 * IIIilIIiiIIi(var10, 0.12));
               var23 ^= ((long)IilIIIIililIIIIi.Illlllllilll((int)(var19 >>> 32), -1, 0.55 * var17) << 32 ^ var23) & -1L << 32;
            }
         }

         var23 ^= ((long)IliiIilliiIi.IlIlllIlilIl((int)Math.round(var12 * (double)255.0F) << 24 | (int)(var23 >>> 32) & 16777215) ^ var23) & -1L >>> 32;
         if ((int)var23 >>> 24 != 0) {
            llIllIililIllIil.iliIiiliiiii(var8, (float)this.IiIiiIliiliIiiIlii + (float)((int)var28) * 0.5F, (float)((int)var19), (float)this.IiIiiIliiliIiiIlii + (float)((int)var28 + 1) * 0.5F, (float)((int)var19 + 1), (int)var23);
         }
      }

      llIllIililIllIil.IIillIiliIil();
   }

   public boolean IIlilIliiIli(int scanCode, int modifiers, int keyCode) {
      return this.lIliiIliiiIliiIlii.IIlllIlliIll(scanCode, modifiers, keyCode);
   }

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) + 18665) - var5) << 9 | (char)((char)((char)(~((char)(~var4[var5]))) + 18665) - var5) >>> 7) + var5))) << 4 | (char)(~((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) + 18665) - var5) << 9 | (char)((char)((char)(~((char)(~var4[var5]))) + 18665) - var5) >>> 7) + var5))) >>> 12))) - var5) + var5))) >>> 11 | (char)(-((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) + 18665) - var5) << 9 | (char)((char)((char)(~((char)(~var4[var5]))) + 18665) - var5) >>> 7) + var5))) << 4 | (char)(~((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) + 18665) - var5) << 9 | (char)((char)((char)(~((char)(~var4[var5]))) + 18665) - var5) >>> 7) + var5))) >>> 12))) - var5) + var5))) << 5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IiIiliIiiiIi(double my, double mx) {
      return this.lIliiIliiiIliiIlii.Illillliilli(my, mx);
   }

   private static void IIillIiliIil(String alpha, float textY, float textX, int s, float col) {
      if (!(col <= 0.004F) && !alpha.isEmpty()) {
         llilliilililliil.iiIIlIIlIl(alpha, textY, textX, col >= 1.0F ? s : llilliilililliil.IIIIllIIIl(s, col));
      }
   }

   public boolean IlIillIiilIi(double mx, double my, int button) {
      return this.lIliiIliiiIliiIlii.IiIlliIliiIl(mx, my, button);
   }

   public String Iilililiiili() {
      return this.lIliiIliiiIliiIlii.IlIillIiilIi();
   }

   private void lIiiIiIlilli(IIliiIlllIliiIll font, long now) {
      long var4 = System.currentTimeMillis() / 60000L;
      if (var4 != this.iIilIlliiIlilIllii) {
         this.iIilIlliiIlilIllii = var4;
         String var6 = LocalTime.now().format(IllIiIliilllIiIlii);
         if (!var6.equals(this.IIilIlliilIilIllii)) {
            if (!this.IIilIlliilIilIllii.isEmpty()) {
               this.liiIIlliiiiiIIllii.IliIlllilIi(font, this.IIilIlliilIilIllii, var6);
               this.llilIlliiililIllii = now;
            }

            this.IIilIlliilIilIllii = var6;
            this.IiilIlliiliilIllii = font.iIlIlllllill(var6);
         }
      }
   }

   private void IIlllIlliIll(long target, float now) {
      if (!this.iiilIlliiIIIiIllii) {
         this.iiilIlliiIIIiIllii = true;
         this.lIIiIlliiiIIiIllii = this.ilIiIlliiIiIiIllii = now;
      } else {
         if (Math.abs(now - this.ilIiIlliiIiIiIllii) > 0.01F) {
            this.IlIiIlliillIiIllii = this.lIIiIlliiiIIiIllii;
            this.ilIiIlliiIiIiIllii = now;
            this.liIiIlliiiiIiIllii = target;
         }

         if (this.liIiIlliiiiIiIllii != 0L) {
            float var4 = (float)(target - this.liIiIlliiiiIiIllii) / 2.6E8F;
            if (var4 >= 1.0F) {
               this.liIiIlliiiiIiIllii = 0L;
               this.lIIiIlliiiIIiIllii = this.ilIiIlliiIiIiIllii;
            } else {
               float var5 = this.ilIiIlliiIiIiIllii < this.IlIiIlliillIiIllii ? llilliilililliil.iIlIlllllill(var4) : llilliilililliil.liiiIIllIl(var4);
               this.lIIiIlliiiIIiIllii = this.IlIiIlliillIiIllii + (this.ilIiIlliiIiIiIllii - this.IlIiIlliillIiIllii) * var5;
            }
         }
      }
   }

   public void IliIlllilIi(boolean v) {
      this.IlliiIliillliiIlii = v;
   }

   private void Illlllllilll(float baseline, float textX) {
      if (this.llIlIlliiilIlIllii == 0L) {
         Iilllilliill(this.lIiIIlliiiIiIIllii, baseline, textX, 1.0F);
      } else if (this.iIIlIlliiIlIlIllii) {
         float var3 = baseline + this.lIiIIlliiiIiIIllii.iIIlilIlIi;
         IIillIiliIil(this.lIiIIlliiiIiIIllii.liiIilIlIi, baseline, textX, this.lIiIIlliiiIiIIllii.IIIlilIlIi, 1.0F);
         IIillIiliIil(this.iliIIlliiIiiIIllii.iiIIliiIiIIlIliiIi, var3, textX, this.lIiIIlliiiIiIIllii.lIIlilIlIi, 1.0F);
         IIillIiliIil(this.iliIIlliiIiiIIllii.lIlIliiIiiIlIliiIi, var3 + this.iliIIlliiIiiIIllii.illIliiIiIilIliiIi, textX + this.IlllIlliillllIllii, this.lIiIIlliiiIiIIllii.lIIlilIlIi, this.lIllIlliiiIllIllii);
         IIillIiliIil(this.iliIIlliiIiiIIllii.IllIliiIilllIliiIi, var3 + this.iliIIlliiIiiIIllii.lilIliiIiiilIliiIi, textX + this.lillIlliiiillIllii, this.lIiIIlliiiIiIIllii.lIIlilIlIi, this.illlIlliiIillIllii);
      } else {
         Iilllilliill(this.IliIIlliilliIIllii, baseline, textX + this.IlllIlliillllIllii, this.lIllIlliiiIllIllii);
         Iilllilliill(this.lIiIIlliiiIiIIllii, baseline, textX + this.lillIlliiiillIllii, this.illlIlliiIillIllii);
      }
   }

   private void Ililllililil(float baseline, long now) {
      long var8 = -1789968392832109408L;
      var8 ^= ((long)(-16777216 | IlIIilIlllIIilIl.lliiIlliIl) << 32 ^ var8) & -1L << 32;
      if (this.llilIlliiililIllii != 0L) {
         float var5 = (float)(now - this.llilIlliiililIllii) / 2.6E8F;
         if (var5 < 1.0F) {
            float var6 = llilliilililliil.IliIlllilIi(var5 / 0.45F);
            float var7 = llilliilililliil.liiiIIllIl((var5 - 0.3F) / 0.7F);
            IIillIiliIil(this.liiIIlliiiiiIIllii.iiIIliiIiIIlIliiIi, this.lIIiIlliiiIIiIllii, baseline, (int)(var8 >>> 32), 1.0F);
            IIillIiliIil(this.liiIIlliiiiiIIllii.lIlIliiIiiIlIliiIi, this.lIIiIlliiiIIiIllii + this.liiIIlliiiiiIIllii.illIliiIiIilIliiIi, baseline - 2.0F * var6, (int)(var8 >>> 32), 1.0F - var6);
            IIillIiliIil(this.liiIIlliiiiiIIllii.IllIliiIilllIliiIi, this.lIIiIlliiiIIiIllii + this.liiIIlliiiiiIIllii.lilIliiIiiilIliiIi, baseline + 2.0F * (1.0F - var7), (int)(var8 >>> 32), var7);
            return;
         }

         this.llilIlliiililIllii = 0L;
      }

      IIillIiliIil(this.IIilIlliilIilIllii, this.lIIiIlliiiIIiIllii, baseline, (int)(var8 >>> 32), 1.0F);
   }

   private static String IIIllIIliIIl(int n, String noun) {
      return n == 1 ? Iliilliiilii<invokedynamic>() + noun : n + Iliilliiilii<invokedynamic>() + noun + Iliilliiilii<invokedynamic>();
   }

   private void iliIiiliiiii(IIliiIlllIliiIll font, long room, float now) {
      long var10 = -1182050224872224774L;
      long var12 = -3764142320618921763L;
      if (this.illiiIliiIiliiIlii != this.liliiIliiiiliiIlii) {
         if (this.liliiIliiiiliiIlii != null) {
            this.lIIIIlliiiIIIIllii = room + 2600000000L;
            this.IIliIlliilIliIllii = room;
         }

         this.liliiIliiiiliiIlii = this.illiiIliiIiliiIlii;
      }

      if (this.IiiiiIliiliiiiIlii && !this.iiiiiIliiIIIIIllii) {
         this.IIliIlliilIliIllii = room;
         this.lIIIIlliiiIIIIllii = room;
      }

      this.iiiiiIliiIIIIIllii = this.IiiiiIliiliiiiIlii;
      var10 ^= ((long)(this.IiiiiIliiliiiiIlii ? 2 : (this.illiiIliiIiliiIlii != null && room < this.lIIIIlliiiIIIIllii ? 1 : 0)) << 32 ^ var10) & -1L << 32;
      String var6 = (int)(var10 >>> 32) == 0 ? liIlliIiiiIlliIi.lllllillll(class_310.method_1551().method_1548().method_1676()) : null;
      var10 ^= ((long)((int)(var10 >>> 32) == 1 && this.illiiIliiIiliiIlii == lllIllillIll.IIilIIIilIilIIIi ? iIIiIiIlIlIiIiIl.lIiiIiIlilli() : 0) ^ var10) & -1L >>> 32;
      if ((int)(var10 >>> 32) != this.IlIIIlliillIIIllii || this.illiiIliiIiliiIlii != this.lllIIlliiillIIllii || this.IIiiiIliilIiiiIlii != this.ilIIIlliiIiIIIllii || this.iIiiiIliiIliiiIlii != this.liIIIlliiiiIIIllii || this.lliiiIliiiliiiIlii != this.IIlIIlliilIlIIllii || (int)var10 != this.iIlIIlliiIllIIllii || now != this.iilIIlliiIIiIIllii || !Objects.equals(var6, this.IilIIlliililIIllii)) {
         this.IlIIIlliillIIIllii = (int)(var10 >>> 32);
         this.lllIIlliiillIIllii = this.illiiIliiIiliiIlii;
         this.ilIIIlliiIiIIIllii = this.IIiiiIliilIiiiIlii;
         this.liIIIlliiiiIIIllii = this.iIiiiIliiIliiiIlii;
         this.IIlIIlliilIlIIllii = this.lliiiIliiiliiiIlii;
         this.iIlIIlliiIllIIllii = (int)var10;
         this.iilIIlliiIIiIIllii = now;
         this.IilIIlliililIIllii = var6;
         if ((int)(var10 >>> 32) == 0) {
            this.IlIlllIlilIl(font, Iliilliiilii<invokedynamic>(), var6 == null ? "" : var6, -7630437, -920587, now, room);
         } else if ((int)(var10 >>> 32) == 2) {
            var12 ^= ((long)(this.lliiiIliiiliiiIlii > 0 ? 1 : 0) << 32 ^ var12) & -1L << 32;
            this.IlIlllIlilIl(font, (int)(var12 >>> 32) != 0 ? Iliilliiilii<invokedynamic>() : Iliilliiilii<invokedynamic>(), (int)(var12 >>> 32) != 0 ? Iliilliiilii<invokedynamic>() + IIIllIIliIIl(this.lliiiIliiiliiiIlii, Iliilliiilii<invokedynamic>()) : "", -920587, -7630437, now, room);
         } else {
            String var8 = "";
            if (this.IIiiiIliilIiiiIlii >= 0) {
               var12 ^= ((long)(this.illiiIliiIiliiIlii == lllIllillIll.lIllIIIiiIllIIIi ? 1 : 0) ^ var12) & -1L >>> 32;
               var8 = Iliilliiilii<invokedynamic>() + IIIllIIliIIl(this.IIiiiIliilIiiiIlii, (int)var12 != 0 ? Iliilliiilii<invokedynamic>() : Iliilliiilii<invokedynamic>());
               if (this.iIiiiIliiIliiiIlii > 0) {
                  var8 = var8 + Iliilliiilii<invokedynamic>() + this.iIiiiIliiIliiiIlii + ((int)var12 != 0 ? Iliilliiilii<invokedynamic>() : Iliilliiilii<invokedynamic>());
               }
            } else if ((int)var10 > 0) {
               var8 = Iliilliiilii<invokedynamic>() + IIIllIIliIIl((int)var10, Iliilliiilii<invokedynamic>());
            }

            this.IlIlllIlilIl(font, this.illiiIliiIiliiIlii.IliIlllilIi(), var8, -920587, -7630437, now, room);
         }

      }
   }

   public boolean Illillliilli(char modifiers, int chr) {
      return this.lIliiIliiiIliiIlii.Illlllllilll(modifiers, chr);
   }

   private static double IIIilIIiiIIi(double t, double fade) {
      double var4 = t < fade ? t / fade : (t > (double)1.0F - fade ? ((double)1.0F - t) / fade : (double)1.0F);
      return var4 * var4 * ((double)3.0F - (double)2.0F * var4);
   }

   public iiiiilIiIIIIIiIi IIiilIiiiIii() {
      return this.lIliiIliiiIliiIlii;
   }

   private void IlIlllIlilIl(IIliiIlllIliiIll leadCol, String room, String restCol, int lead, int rest, float font, long now) {
      long var11 = -3814299934263137311L;
      float var9 = leadCol.iIlIlllllill(room);
      if (var9 > font) {
         room = leadCol.Iiilliiliiil(room, font);
         restCol = "";
      } else if (!restCol.isEmpty()) {
         restCol = leadCol.Iiilliiliiil(restCol, font - var9);
      }

      if (!this.IIIlIlliilIIlIllii) {
         this.lIiIIlliiiIiIIllii.IliIlllilIi(leadCol, room, restCol, lead, rest);
         this.IIIlIlliilIIlIllii = true;
      } else if (!this.lIiIIlliiiIiIIllii.iIlIlllllill(room, restCol, lead, rest)) {
         var11 ^= ((long)(this.lIiIIlliiiIiIIllii.IIIlilIlIi == lead && this.lIiIIlliiiIiIIllii.lIIlilIlIi == rest && this.lIiIIlliiiIiIIllii.liiIilIlIi.equals(room) ? 1 : 0) << 32 ^ var11) & -1L << 32;
         this.IiIlliIliiIl(now);
         if (this.llIlIlliiilIlIllii == 0L) {
            this.IliIIlliilliIIllii.liiiIIllIl(this.lIiIIlliiiIiIIllii);
            this.IiIlIlliiliIlIllii = 1.0F;
            this.iiIlIlliiIIllIllii = 0.0F;
            this.iIIlIlliiIlIlIllii = (boolean)((int)(var11 >>> 32));
         } else {
            if (!this.iIIlIlliiIlIlIllii && (int)(var11 >>> 32) != 0) {
               this.lIiIIlliiiIiIIllii.IliIlllilIi(leadCol, room, restCol, lead, rest);
               return;
            }

            if (this.iIIlIlliiIlIlIllii && (int)(var11 >>> 32) == 0) {
               this.IliIIlliilliIIllii.liiiIIllIl(this.lIiIIlliiiIiIIllii);
               this.IiIlIlliiliIlIllii = 1.0F;
               this.iiIlIlliiIIllIllii = 0.0F;
               this.iIIlIlliiIlIlIllii = false;
            } else if (this.illlIlliiIillIllii >= this.lIllIlliiiIllIllii) {
               this.IliIIlliilliIIllii.liiiIIllIl(this.lIiIIlliiiIiIIllii);
               this.IiIlIlliiliIlIllii = this.illlIlliiIillIllii;
               this.iiIlIlliiIIllIllii = this.lillIlliiiillIllii;
            } else {
               this.IiIlIlliiliIlIllii = this.lIllIlliiiIllIllii;
               this.iiIlIlliiIIllIllii = this.IlllIlliillllIllii;
            }
         }

         this.lIiIIlliiiIiIIllii.IliIlllilIi(leadCol, room, restCol, lead, rest);
         if (this.iIIlIlliiIlIlIllii) {
            this.iliIIlliiIiiIIllii.IliIlllilIi(leadCol, this.IliIIlliilliIIllii.iiiIilIlIi, this.lIiIIlliiiIiIIllii.iiiIilIlIi);
         }

         this.llIlIlliiilIlIllii = now;
         this.IiIlliIliiIl(now);
      }
   }

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 7 | (char)((char)(-var4[var5]) - var5) >>> 9) - var5) ^ '되'))) - var5) ^ var5) - var5) - 21992) + var5))))) + var5) ^ '튑') ^ var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
