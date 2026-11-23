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
import java.util.Objects;
import java.util.function.IntConsumer;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_437;
import org.joml.Matrix4f;

public class ilillllIiillll extends Iliilliiilii {
   private static float illilIIIiIililIIIi = -1.0F;
   private static final String llIilIIIiilIilIIIi = "  ·  loading skin";
   private String iiliiIIIiIIiiiIIIi;
   private boolean iiiliIIIiIIIiiIIIi;
   private float IiIliIIIiliIliIIIi;
   private float IIiliIIIilIiliIIIi;
   private static final float lllllIIIiillllIIIi = 8.0F;
   private final iIIllilIlIllil ilIIiIIIiIiIIiIIIi;
   private float illliIIIiIilliIIIi;
   private final IntConsumer iIlIiIIIiIllIiIIIi;
   private float iiIliIIIiIIlliIIIi;
   static final float IlIllIIIillIllIIIi = 0.25F;
   private float liiIiIIIiiiiIiIIIi;
   private static final float iilllIIIiIIillIIIi = 0.35F;
   private float lilliIIIiiilliIIIi;
   private final IIllIllllIllIlll[] iiiilIIIiIIIIiIIIi;
   private final illIilllIilIilll IiiilIIIiliiilIIIi;
   private static final float lIillIIIiiIillIIIi = 2.5F;
   private static final float liIllIIIiiiIllIIIi = 0.42F;
   private String IliiiIIIilliiiIIIi;
   private static final String[] iIIilIIIiIlIilIIIi = new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()};
   private int iliiiIIIiIiiiiIIIi;
   private static final float IIlllIIIilIlllIIIi = 0.6F;
   private lIIllIiiIIllIi IiiliIIIiliiliIIIi;
   private static final float IlillIIIillillIIIi = 0.4F;
   private int IliIiIIIilliIiIIIi;
   private final Runnable lllIiIIIiillIiIIIi;
   private static final float IilllIIIililllIIIi = 0.6F;
   private boolean IlIiiIIIillIiiIIIi;
   private final IIlllIIilIlllIIi IIiilIIIilIiilIIIi;
   private int iIliiIIIiIlliiIIIi;
   private static boolean lililIIIiiililIIIi;
   private float iIiliIIIiIliliIIIi;
   private static final float IIIilIIIilIIilIIIi = 0.3F;
   static final float lIIllIIIiiIIllIIIi = 0.32F;
   private static final float ilIllIIIiIiIllIIIi = 22.0F;
   private float IIIliIIIilIIliIIIi;
   private static final float liillIIIiiiillIIIi = 0.25F;
   private boolean liIiiIIIiiiIiiIIIi;
   private boolean IIliiIIIilIliiIIIi;
   private static final float[] iiIilIIIiIIlilIIIi = new float[0];
   private boolean ilIiiIIIiIiIiiIIIi;
   private static boolean lIlilIIIiiIlilIIIi = true;
   private final lililiiiililii IIlIiIIIilIlIiIIIi;
   private static final String[] IiIilIIIiliIilIIIi = new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()};
   private IIllIllllIllIlll IlIIiIIIillIIiIIIi;
   static final float iiiIlIIIiIIIllIIIi = 0.5F;
   private float IiliiIIIililiiIIIi;
   private final Runnable iilIiIIIiIIiIiIIIi;
   private static boolean IllilIIIilllilIIIi;
   private boolean lIIiiIIIiiIIiiIIIi;
   private final IlIlIIilllIlIIil liIIiIIIiiiIIiIIIi;
   private String lIiiiIIIiiIiiiIIIi;
   private final llIiiIlilIiiIl[] lliilIIIiiliilIIIi;
   private String IllliIIIilllliIIIi;
   private int liiiiIIIiiiiiiIIIi;
   private static final float iIlllIIIiIllllIIIi = 0.0F;
   private float llIliIIIiilIliIIIi;
   private static final float ilillIIIiIiillIIIi = 22.0F;
   private final List<String> iIiilIIIiIliilIIIi;
   private IIllIllllIllIlll lIIIiIIIiiIIIiIIIi;
   private String lIlliIIIiiIlliIIIi;
   private final Runnable IilIiIIIililIiIIIi;
   private int lIiIiIIIiiIiIiIIIi;
   private float iliIiIIIiIiiIiIIIi;
   private float lliliIIIiililiIIIi;
   static final float IiiIlIIIiliiIlIIIi = 0.8F;
   private int llliiIIIiilliiIIIi;
   static final float lliIlIIIiiliIlIIIi = 0.35F;
   private float iIIliIIIiIlIliIIIi;

   public void iliIiiliiiii(float dt) {
      long var7 = 6769997935247802216L;
      long var9 = -6421733339912129383L;
      this.liiIiIIIiiiiIiIIIi += dt;
      this.IiliiIIIililiiIIIi += dt;
      var7 ^= ((long)this.iIiilIIIiIliilIIIi.indexOf(this.IIiilIIIilIiilIIIi.Iiililiili()) << 32 ^ var7) & -1L << 32;
      if ((int)(var7 >>> 32) >= 0 && (int)(var7 >>> 32) != this.iiilllIIIill.iliIiiliiiii()) {
         this.iiilllIIIill.Iilllilliill((int)(var7 >>> 32), true);
      }

      var7 ^= ((long)this.iiilllIIIill.iliIiiliiiii() ^ var7) & -1L >>> 32;
      if ((int)var7 != this.lIiIiIIIiiIiIiIIIi) {
         this.IliIiIIIilliIiIIIi = this.lIiIiIIIiiIiIiIIIi;
         this.iliIiIIIiIiiIiIIIi = 0.32F;
         this.lIiIiIIIiiIiIiIIIi = (int)var7;
         if (this.lIiIiIIIiiIiIiIIIi >= 0) {
            this.lliilIIIiiliilIIIi[this.lIiIiIIIiiIiIiIIIi].IliIlllilIi();
         }
      }

      float var4 = dt * (IllilIIIilllilIIIi ? 0.5F : 1.0F);
      if (this.lIiIiIIIiiIiIiIIIi >= 0) {
         llIiiIlilIiiIl var5 = this.lliilIIIiiliilIIIi[this.lIiIiIIIiiIiIiIIIi];
         var5.liiiIIllIl(illilIIIiIililIIIi >= 0.0F ? 0.0F : var4);
         if (illilIIIiIililIIIi >= 0.0F) {
            var5.lIliliilliIliliill = 0.35F + Math.min(illilIIIiIililIIIi, var5.Illiliillllliliill);
         }
      }

      if (this.IliIiIIIilliIiIIIi >= 0 && this.iliIiIIIiIiiIiIIIi > 0.0F) {
         this.lliilIIIiiliilIIIi[this.IliIiIIIilliIiIIIi].liiiIIllIl(var4);
         this.iliIiIIIiIiiIiIIIi -= dt;
      }

      this.ilIIiIIIiIiIIiIIIi.IIlllIlliIll(dt);
      this.IIIliIIIilIIliIIIi = lliiiIliliiiIl.IIIllIIliIIl(this.IIIliIIIilIIliIIIi, !this.ilIIiIIIiIiIIiIIIi.lIiiIiIlilli() && !(Math.abs(this.ilIIiIIIiIiIIiIIIi.Iiilliiliiil()) > 1.0F) ? 1.0F : 0.0F, this.ilIIiIIIiIiIIiIIIi.lIiiIiIlilli() ? 10.0F : 0.6F, dt, 0.001F);
      this.lllllillll(dt);

      try {
         this.IiiilIIIiliiilIIIi.IliIlllilIi(this.IIiilIIIilIiilIIIi);
      } catch (Throwable var11) {
      }

      if (this.lIiIiIIIiiIiIiIIIi >= 0) {
         llIiiIlilIiiIl var12 = this.lliilIIIiiliilIIIi[this.lIiIiIIIiiIiIiIIIi];
         var9 ^= ((long)(lIlilIIIiiIlilIIIi && !IliIlllilIi<invokedynamic>().equals(this.IIiilIIIilIiilIIIi.llliiillii()) && this.iiilllIIIill.iIlIlllllill() ? 0 : 1) << 32 ^ var9) & -1L << 32;
         this.liIIiIIIiiiIIiIIIi.lIiiIiIlilli(var12.iIiiliillIliiliill, var12.lliiliilliliiliill, var12.Illiliillllliliill, var12.lIliliilliIliliill - 0.35F, (boolean)((int)(var9 >>> 32)), this.IIlIiIIIilIlIiIIIi);
      }

      this.Iillllilll(dt);
      this.IiIliIIIiliIliIIIi = lliiiIliliiiIl.IIIllIIliIIl(this.IiIliIIIiliIliIIIi, this.lIIIiIIIiiIIIiIIIi.iIlIlllllill() > 0 ? 1.0F : 0.0F, 7.0F, dt, 0.002F);
      String var13 = this.lIiIiIIIiiIiIiIIIi >= 0 ? this.lliilIIIiiliilIIIi[this.lIiIiIIIiiIiIiIIIi].llIiliillilIiliill : null;
      var9 ^= ((long)(var13 != null && this.IiiilIIIiliiilIIIi.liiiIIllIl(var13) ? 1 : 0) << 32 ^ var9) & -1L << 32;
      if (!Objects.equals(var13, this.lIlliIIIiiIlliIIIi) || (int)(var9 >>> 32) == 0) {
         this.lIlliIIIiiIlliIIIi = (int)(var9 >>> 32) != 0 ? var13 : null;
         this.iiIliIIIiIIlliIIIi = 0.0F;
      }

      this.iiIliIIIiIIlliIIIi = lliiiIliliiiIl.IIIllIIliIIl(this.iiIliIIIiIIlliIIIi, (int)(var9 >>> 32) != 0 ? 1.0F : 0.0F, 7.0F, dt, 0.002F);
   }

   public float IilliliilIIi() {
      return 500.0F;
   }

   public ilillllIiillll(class_437 module, IIlllIIilIlllIIi parent) {
      long var4 = -7270629657624319136L;
      super(module, IliIlllilIi<invokedynamic>());
      this.IiiilIIIiliiilIIIi = new illIilllIilIilll();
      this.iiiilIIIiIIIIiIIIi = new IIllIllllIllIlll[]{new IIllIllllIllIlll(IliIlllilIi<invokedynamic>()), new IIllIllllIllIlll(IliIlllilIi<invokedynamic>())};
      this.lIIIiIIIiiIIIiIIIi = new IIllIllllIllIlll(IliIlllilIi<invokedynamic>());
      this.IlIIiIIIillIIiIIIi = new IIllIllllIllIlll(IliIlllilIi<invokedynamic>());
      this.ilIIiIIIiIiIIiIIIi = new iIIllilIlIllil(0.0F, 8.0F, 1.0F, 0.8F, 1.7F, 45.0F);
      this.liIIiIIIiiiIIiIIIi = new IlIlIIilllIlIIil();
      this.lIiIiIIIiiIiIiIIIi = -1;
      this.IliIiIIIilliIiIIIi = -1;
      this.IIIliIIIilIIliIIIi = 1.0F;
      this.iiiliIIIiIIIiiIIIi = true;
      this.liIiiIIIiiiIiiIIIi = true;
      this.IIliiIIIilIliiIIIi = true;
      this.iIliiIIIiIlliiIIIi = -1;
      this.iliiiIIIiIiiiiIIIi = -1;
      this.liiiiIIIiiiiiiIIIi = -1;
      this.IIiilIIIilIiilIIIi = parent;
      this.iIiilIIIiIliilIIIi = IIlllIIilIlllIIi.iIiliIlili();
      this.lliilIIIiiliilIIIi = new llIiiIlilIiiIl[this.iIiilIIIiIliilIIIi.size()];

      for(var4 ^= (0L ^ var4) & -1L << 32; (int)(var4 >>> 32) < this.lliilIIIiiliilIIIi.length; var4 += 4294967296L) {
         this.lliilIIIiiliilIIIi[(int)(var4 >>> 32)] = new llIiiIlilIiiIl(this, (String)this.iIiilIIIiIliilIIIi.get((int)(var4 >>> 32)));
      }

      this.IiiliIIIiliiliIIIi = this.iIlllIllll();
      this.IIlIiIIIilIlIiIIIi = new lililiiiililii() {
         public void liiiIIllIl(long run) {
            IIiiIIlilIiiIIli.lIiiIiIlilli(run);
         }

         public void IliIlllilIi(int cue) {
            if (ilillllIiillll.this.lIiIiIIIiiIiIiIIIi >= 0) {
               ilillllIiillll.this.lliilIIIiiliilIIIi[ilillllIiillll.this.lIiIiIIIiiIiIiIIIi].IilliliilIIi(cue);
            }

         }
      };
      this.iIlIiIIIiIllIiIIIi = this::IIIillIIil;
      this.lllIiIIIiillIiIIIi = () -> lIlilIIIiiIlilIIIi = !lIlilIIIiiIlilIIIi;
      this.IilIiIIIililIiIIIi = () -> IllilIIIilllilIIIi = !IllilIIIilllilIIIi;
      this.iilIiIIIiIIiIiIIIi = this::iIIilIlIil;
      var4 ^= ((long)this.iIiilIIIiIliilIIIi.indexOf(parent.Iiililiili()) << 32 ^ var4) & -1L << 32;
      this.iiilllIIIill.Iilllilliill(Math.max(0, (int)(var4 >>> 32)), false);
      llIiilIiilIiilIi.IilliliilIIi();
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))) + var5))) ^ var5)) ^ 20180) + var5) ^ 1884))) - var5) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   static liiiliiliiiiliil illilIilil(ilillllIiillll x0) {
      return x0.iiilllIIIill;
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - '驙') + var5) - '\ue2df'))) ^ var5) >>> 10 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - '驙') + var5) - '\ue2df'))) ^ var5) << 6) >>> 2 | (char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - '驙') + var5) - '\ue2df'))) ^ var5) >>> 10 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - '驙') + var5) - '\ue2df'))) ^ var5) << 6) << 14))) - var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void ilillIiill() {
      long var5 = 5794835584647221812L;
      IIllIllllIllIlll[] var1 = this.iiiilIIIiIIIIiIIIi;
      var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

      for(long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         IIllIllllIllIlll var4 = var1[(int)var8];
         var4.Iilllilliill();
      }

      this.lIIIiIIIiiIIIiIIIi.Iilllilliill();
      this.IlIIiIIIillIIiIIIi.Iilllilliill();
      this.iIliiIIIiIlliiIIIi = -1;
      this.iiiliIIIiIIIiiIIIi = true;
      this.lIIiiIIIiiIIiiIIIi = false;
   }

   public String iIlIlllllill() {
      long var5 = -1256462186898387598L;
      var5 ^= ((long)this.iiilllIIIill.iliIiiliiiii() << 32 ^ var5) & -1L << 32;
      if ((int)(var5 >>> 32) >= 0 && (int)(var5 >>> 32) < this.lliilIIIiiliilIIIi.length) {
         llIiiIlilIiiIl var2 = this.lliilIIIiiliilIIIi[(int)(var5 >>> 32)];
         lIIllIiiIIllIi var3 = this.iIlllIllll();
         String var4 = var3.lIiIllIiiiIiIllIii + (var3 == this.IiiliIIIiliiliIIIi && this.liIiiIIIiiiIiiIIIi ? "" : IliIlllilIi<invokedynamic>());
         if (this.iiliiIIIiIIiiiIIIi == null || (int)(var5 >>> 32) != this.iliiiIIIiIiiiiIIIi || !Objects.equals(var2.llIiliillilIiliill, this.lIiiiIIIiiIiiiIIIi) || var2.lililiilliililiill != this.liiiiIIIiiiiiiIIIi || !var4.equals(this.IliiiIIIilliiiIIIi)) {
            this.iliiiIIIiIiiiiIIIi = (int)(var5 >>> 32);
            this.lIiiiIIIiiIiiiIIIi = var2.llIiliillilIiliill;
            this.liiiiIIIiiiiiiIIIi = var2.lililiilliililiill;
            this.IliiiIIIilliiiIIIi = var4;
            this.iiliiIIIiIIiiiIIIi = this.IIllllIlll(var2, var4);
         }

         return this.iiliiIIIiIIiiiIIIi;
      } else {
         return null;
      }
   }

   public int Illlllllilll() {
      return this.iIiilIIIiIliilIIIi.size();
   }

   private void lllllillll(float dt) {
      long var9 = 4757408436743469222L;
      long var11 = -4907580720195290085L;
      lIIllIiiIIllIi var2 = this.iIlllIllll();
      String var3 = this.lIiIiIIIiiIiIiIIIi >= 0 ? this.lliilIIIiiliilIIIi[this.lIiIiIIIiiIiIiIIIi].llIiliillilIiliill : null;
      var9 ^= (4294967296L ^ var9) & -1L << 32;
      String[] var5 = iIIilIIIiIlIilIIIi;
      var9 ^= ((long)var5.length ^ var9) & -1L >>> 32;

      for(var11 ^= (0L ^ var11) & -1L << 32; (int)(var11 >>> 32) < (int)var9; var11 += 4294967296L) {
         String var8 = var5[(int)(var11 >>> 32)];
         if (!var8.equals(var3)) {
            var9 ^= ((long)((int)(var9 >>> 32) & illIilllIilIilll.IilliliilIIi(var8, var2)) << 32 ^ var9) & -1L << 32;
         }
      }

      var11 ^= ((long)illIilllIilIilll.IilliliilIIi(var3, var2) ^ var11) & -1L >>> 32;
      var9 ^= ((long)((int)(var9 >>> 32) & (int)var11) << 32 ^ var9) & -1L << 32;
      if ((int)var11 == 0) {
         String var6 = var3 + IliIlllilIi<invokedynamic>() + var2.lIiIllIiiiIiIllIii;
         if (!var6.equals(this.IllliIIIilllliIIIi)) {
            this.IllliIIIilllliIIIi = var6;
            illIilllIilIilll.lIiiIiIlilli(var3, var2);
         }
      }

      if (var2 == this.IiiliIIIiliiliIIIi) {
         this.iIIliIIIiIlIliIIIi = 0.0F;
         if ((int)var11 != 0 && !this.liIiiIIIiiiIiiIIIi) {
            this.iiilllIIIill.Ililllililil();
         }

         if ((int)(var9 >>> 32) != 0 && !this.IIliiIIIilIliiIIIi) {
            this.iiiliIIIiIIIiiIIIi = true;
         }

         this.liIiiIIIiiiIiiIIIi = (boolean)((int)var11);
         this.IIliiIIIilIliiIIIi = (boolean)((int)(var9 >>> 32));
      } else {
         this.iIIliIIIiIlIliIIIi += dt;
         if ((int)var11 != 0 || this.iIIliIIIiIlIliIIIi >= 2.5F) {
            this.IiiliIIIiliiliIIIi = var2;
            this.iIIliIIIiIlIliIIIi = 0.0F;
            this.liIiiIIIiiiIiiIIIi = (boolean)((int)var11);
            this.IIliiIIIilIliiIIIi = (boolean)((int)(var9 >>> 32));
            this.iiiliIIIiIIIiiIIIi = true;
            this.iiilllIIIill.Ililllililil();
         }

      }
   }

   public void IlIlllIlilIl(class_332 s, iIIiliiIlIilii ctx) {
      ilIiiiiIiIiiii.IilliliilIIi(s, 0, ctx.lIIIlliIIl, ctx.iIIIlliIIl, ctx.IlIIlliIIl, ctx.llIIlliIIl, ctx.IilIlliIIl);
      float var3 = ctx.IliIlllilIi();
      float var4 = ctx.liiiIIllIl() - ctx.llIIlliIIl * 0.03F;
      float var5 = ctx.IlIIlliIIl * 0.34F;
      float var6 = ctx.llIIlliIIl * 0.34F;
      IIIiiIillIIiiIil.IiIlliIliiIl(s, var3 - var5 / 2.0F, var4 - var6 / 2.0F, var5, var6, Math.min(var5, var6) / 2.0F, IilIIIIililIIIIi.IIlllIlliIll(0.07), Math.min(ctx.IlIIlliIIl, ctx.llIIlliIIl) * 0.22F, 1.0F);
      this.illliIIIiIilliIIIi = lIlIIIliIlIIIl.Illillliilli(ctx.lIIIlliIIl);
      this.lilliIIIiiilliIIIi = lIlIIIliIlIIIl.Iilililiiili(ctx.iIIIlliIIl);
      this.IIiliIIIilIiliIIIi = lIlIIIliIlIIIl.Illillliilli(ctx.lIIIlliIIl + ctx.IlIIlliIIl);
      this.iIiliIIIiIliliIIIi = lIlIIIliIlIIIl.Iilililiiili(ctx.iIIIlliIIl + ctx.llIIlliIIl);
      this.lliliIIIiililiIIIi = ctx.IilIlliIIl * lIlIIIliIlIIIl.IIiilIiiiIii();
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 19290) + 18022) - '싢') << 14 | (char)((char)((char)(var4[var5] - 19290) + 18022) - '싢') >>> 2) - '藩') + '閏') >>> 10 | (char)((char)((char)((char)((char)((char)(var4[var5] - 19290) + 18022) - '싢') << 14 | (char)((char)((char)(var4[var5] - 19290) + 18022) - '싢') >>> 2) - '藩') + '閏') << 6))) + '\ue0c0') + var5) + var5) >>> 1 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 19290) + 18022) - '싢') << 14 | (char)((char)((char)(var4[var5] - 19290) + 18022) - '싢') >>> 2) - '藩') + '閏') >>> 10 | (char)((char)((char)((char)((char)((char)(var4[var5] - 19290) + 18022) - '싢') << 14 | (char)((char)((char)(var4[var5] - 19290) + 18022) - '싢') >>> 2) - '藩') + '閏') << 6))) + '\ue0c0') + var5) + var5) << 15) - '틛') - var5) - 14625) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iilllIIill(float dt) {
      long var4 = -5334710879381156193L;
      if (!(this.IiliiIIIililiiIIIi < 0.3F)) {
         var4 ^= ((long)this.lIilliIill() << 32 ^ var4) & -1L << 32;
         if (this.iIliiIIIiIlliiIIIi >= 0 && (int)(var4 >>> 32) != this.llliiIIIiilliiIIIi) {
            this.iIliiIIIiIlliiIIIi = -1;
            this.iiiliIIIiIIIiiIIIi = true;
         }

         if (this.iIliiIIIiIlliiIIIi < 0) {
            if (!this.iiiliIIIiIIIiiIIIi) {
               if (this.lIIiiIIIiiIIiiIIIi) {
                  return;
               }

               this.llIliIIIiilIliIIIi += dt;
               if (this.llIliIIIiilIliIIIi < 0.4F) {
                  return;
               }
            }

            this.llIliIIIiilIliIIIi = 0.0F;
            this.ilIiiIIIiIiIiiIIIi = this.iiiliIIIiIIIiiIIIi && this.lIIIiIIIiiIIIiIIIi.iIlIlllllill() > 0;
            this.iiiliIIIiIIIiiIIIi = false;
            this.llliiIIIiilliiIIIi = (int)(var4 >>> 32);
            this.IlIiiIIIillIiiIIIi = true;
            this.IlIIiIIIillIIiIIIi.lIiiIiIlilli((int)(var4 >>> 32) * this.iIiilIIIiIliilIIIi.size(), (int)(var4 >>> 32));
            this.iIliiIIIiIlliiIIIi = 0;
         }

         this.IlIiiIIIillIiiIIIi &= this.IiiilIIIiliiilIIIi.IIlllIlliIll(this.IlIIiIIIillIIiIIIi, this.iIliiIIIiIlliiIIIi * (int)(var4 >>> 32), (int)(var4 >>> 32), (String)this.iIiilIIIiIliilIIIi.get(this.iIliiIIIiIlliiIIIi), this.IiiliIIIiliiliIIIi);
         if (++this.iIliiIIIiIlliiIIIi >= this.iIiilIIIiIliilIIIi.size()) {
            IIllIllllIllIlll var3 = this.IlIIiIIIillIIiIIIi;
            this.IlIIiIIIillIIiIIIi = this.lIIIiIIIiiIIIiIIIi;
            this.lIIIiIIIiiIIIiIIIi = var3;
            this.iIliiIIIiIlliiIIIi = -1;
            this.lIIiiIIIiiIIiiIIIi = this.IlIiiIIIillIiiIIIi;
            if (this.ilIiiIIIiIiIiiIIIi) {
               this.IiIliIIIiliIliIIIi = Math.min(this.IiIliIIIiliIliIIIi, 0.25F);
            }

         }
      }
   }

   public float lIiiIiIlilli() {
      return 340.0F;
   }

   public boolean Ililllililil() {
      return true;
   }

   static iiIiliiIIlilii IiIilliIil(String shown) {
      return IliIlllilIi<invokedynamic>().equals(shown) ? iiIiliiIIlilii.lIIllliIIl : iiIiliiIIlilii.IIillIiliIil(shown);
   }

   public static String llIililIil(String arg) {
      String var1 = arg == null ? "" : arg.trim();
      if (var1.startsWith(IliIlllilIi<invokedynamic>())) {
         IIlllIIilIlllIIi var2 = (IIlllIIilIlllIIi)llilIllililIll.iliIiiliiiii(IIlllIIilIlllIIi.class);
         return var2 == null ? IliIlllilIi<invokedynamic>() : var2.iiiIlIIIll(var1.substring(7).trim());
      } else if (var1.startsWith(IliIlllilIi<invokedynamic>())) {
         try {
            illilIIIiIililIIIi = Math.max(0.0F, Float.parseFloat(var1.substring(4).trim()));
         } catch (NumberFormatException var3) {
            return IliIlllilIi<invokedynamic>() + var1;
         }

         return IliIlllilIi<invokedynamic>() + illilIIIiIililIIIi + IliIlllilIi<invokedynamic>();
      } else {
         illilIIIiIililIIIi = -1.0F;
         return IliIlllilIi<invokedynamic>();
      }
   }

   private String IIllllIlll(llIiiIlilIiiIl t, String finish) {
      long var6 = -8098255919787281963L;
      var6 ^= ((long)iliiiIiiii.lIiiIiIlilli(t.llIiliillilIiliill) << 32 ^ var6) & -1L << 32;
      StringBuilder var4 = new StringBuilder();
      iiIiliiIIlilii var5 = iiIiliiIIlilii.IIillIiliIil(t.llIiliillilIiliill);
      if (var5 != null) {
         var4.append(t.llIiliillilIiliill);
         if (t.IIiiliilllIiiliill > 1) {
            var4.append(IliIlllilIi<invokedynamic>()).append(t.lililiilliililiill + 1).append(IliIlllilIi<invokedynamic>()).append(t.IIiiliilllIiiliill);
         }

         var4.append(IliIlllilIi<invokedynamic>()).append(var5.lIiiIiIlilli()).append(IliIlllilIi<invokedynamic>());
         return var4.toString();
      } else {
         if (IliIlllilIi<invokedynamic>().equals(t.iIIiliillIlIiliill)) {
            var4.append(IliIlllilIi<invokedynamic>()).append(t.llIiliillilIiliill);
         } else {
            var4.append(t.llIiliillilIiliill);
         }

         if (IliIlllilIi<invokedynamic>().equals(t.llIiliillilIiliill) && t.IIiiliilllIiiliill > 0) {
            var4.append(IliIlllilIi<invokedynamic>()).append(t.lililiilliililiill + 1).append(IliIlllilIi<invokedynamic>()).append(t.IIiiliilllIiiliill);
         }

         if ((int)(var6 >>> 32) != 0) {
            var4.append(IliIlllilIi<invokedynamic>()).append(finish);
         } else {
            var4.append(IliIlllilIi<invokedynamic>());
         }

         return var4.toString();
      }
   }

   public void IiIlliIliiIl(class_332 s, iIIiliiIlIilii ctx) {
      long var8 = -5899969566723945062L;
      var8 ^= ((long)this.iiilllIIIill.iliIiiliiiii() << 32 ^ var8) & -1L << 32;
      if ((int)(var8 >>> 32) >= 0 && (int)(var8 >>> 32) < this.lliilIIIiiliilIIIi.length) {
         llIiiIlilIiiIl var4 = this.lliilIIIiiliilIIIi[(int)(var8 >>> 32)];
         if (var4.Illiliillllliliill > 0.0F && !(this.iiIliIIIiIIlliIIIi <= 0.002F)) {
            float var5 = Math.min(lliiiIliliiiIl.IliIlllilIi(var4.lIliliilliIliliill / 0.35F), lliiiIliliiiIl.IliIlllilIi((0.35F + var4.Illiliillllliliill + 0.8F - var4.lIliliilliIliliill) / 0.25F));
            float var6 = IliiIilliiIi.IilliliilIIi(lliiiIliliiiIl.liiiIIllIl(this.iiIliIIIiIIlliIIIi) * lliiiIliliiiIl.iIlIlllllill(var5));

            try {
               this.Ilillllill(s, ctx, var4);
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var6);
            }

         }
      }
   }

   public float IIIilIIiiIIi() {
      return 134.0F;
   }

   public void IlIillIiilIi(int index) {
      if (index >= 0 && index < this.iIiilIIIiIliilIIIi.size()) {
         this.IIiilIIIilIiilIIIi.liIiiiiIii((String)this.iIiilIIIiIliilIIIi.get(index));
      }

   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '녌') + var5) + var5) >>> 3 | (char)((char)((char)(var4[var5] - '녌') + var5) + var5) << 13) - var5) - 1866) - '캔') >>> 7 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - '녌') + var5) + var5) >>> 3 | (char)((char)((char)(var4[var5] - '녌') + var5) + var5) << 13) - var5) - 1866) - '캔') << 9))) + var5) + '\uf7f8') - var5) >>> 6 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '녌') + var5) + var5) >>> 3 | (char)((char)((char)(var4[var5] - '녌') + var5) + var5) << 13) - var5) - 1866) - '캔') >>> 7 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - '녌') + var5) + var5) >>> 3 | (char)((char)((char)(var4[var5] - '녌') + var5) + var5) << 13) - var5) - 1866) - '캔') << 9))) + var5) + '\uf7f8') - var5) << 10) ^ 8742) + var5) >>> 7 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '녌') + var5) + var5) >>> 3 | (char)((char)((char)(var4[var5] - '녌') + var5) + var5) << 13) - var5) - 1866) - '캔') >>> 7 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - '녌') + var5) + var5) >>> 3 | (char)((char)((char)(var4[var5] - '녌') + var5) + var5) << 13) - var5) - 1866) - '캔') << 9))) + var5) + '\uf7f8') - var5) >>> 6 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '녌') + var5) + var5) >>> 3 | (char)((char)((char)(var4[var5] - '녌') + var5) + var5) << 13) - var5) - 1866) - '캔') >>> 7 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - '녌') + var5) + var5) >>> 3 | (char)((char)((char)(var4[var5] - '녌') + var5) + var5) << 13) - var5) - 1866) - '캔') << 9))) + var5) + '\uf7f8') - var5) << 10) ^ 8742) + var5) << 9) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '녌') + var5) + var5) >>> 3 | (char)((char)((char)(var4[var5] - '녌') + var5) + var5) << 13) - var5) - 1866) - '캔') >>> 7 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - '녌') + var5) + var5) >>> 3 | (char)((char)((char)(var4[var5] - '녌') + var5) + var5) << 13) - var5) - 1866) - '캔') << 9))) + var5) + '\uf7f8') - var5) >>> 6 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '녌') + var5) + var5) >>> 3 | (char)((char)((char)(var4[var5] - '녌') + var5) + var5) << 13) - var5) - 1866) - '캔') >>> 7 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - '녌') + var5) + var5) >>> 3 | (char)((char)((char)(var4[var5] - '녌') + var5) + var5) << 13) - var5) - 1866) - '캔') << 9))) + var5) + '\uf7f8') - var5) << 10) ^ 8742) + var5) >>> 7 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '녌') + var5) + var5) >>> 3 | (char)((char)((char)(var4[var5] - '녌') + var5) + var5) << 13) - var5) - 1866) - '캔') >>> 7 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - '녌') + var5) + var5) >>> 3 | (char)((char)((char)(var4[var5] - '녌') + var5) + var5) << 13) - var5) - 1866) - '캔') << 9))) + var5) + '\uf7f8') - var5) >>> 6 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '녌') + var5) + var5) >>> 3 | (char)((char)((char)(var4[var5] - '녌') + var5) + var5) << 13) - var5) - 1866) - '캔') >>> 7 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - '녌') + var5) + var5) >>> 3 | (char)((char)((char)(var4[var5] - '녌') + var5) + var5) << 13) - var5) - 1866) - '캔') << 9))) + var5) + '\uf7f8') - var5) << 10) ^ 8742) + var5) << 9) << 5) + '蜂'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IiIIlliIIl(iIIiliiIlIilii y, double stage, double x, double amount) {
      this.ilIIiIIIiIiIIiIIIi.iliIiiliiiii(amount);
      return true;
   }

   protected void lilIliilIl() {
      this.liIIiIIIiiiIIiIIIi.iliIiiliiiii(this.IIlIiIIIilIlIiIIIi);
      this.ilillIiill();
   }

   public void llIIlilIIl(iIIiliiIlIilii y, double x, double button, int stage) {
      if (this.ilIIiIIIiIiIIiIIIi.lIiiIiIlilli()) {
         this.ilIIiIIIiIiIIiIIIi.IilliliilIIi();
      }

   }

   public void method_25432() {
      super.method_25432();
      this.liIIiIIIiiiIIiIIIi.iliIiiliiiii(this.IIlIiIIIilIlIiIIIi);
      this.ilillIiill();
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5270397566775483875L ^ Long.rotateLeft(-5190532060226052728L, 63) ^ -4305604802027290586L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -28465575562161765L ^ Long.rotateLeft(4593530048532623040L, 7) ^ 4281316508106489463L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7713764138282914784L ^ Long.rotateLeft(-3092981776064206180L, 52) ^ -3010271696114948919L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3355958600229113965L ^ Long.rotateLeft(7688006665870551048L, 24) ^ 3842309742954575408L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4828979249260731021L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5833217729143249650L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -3044463920474482606L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7237882631156610020L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -2197961907109297855L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4132502827324117863L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(liiiIIllIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIiliIiiiIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIlilIliiIli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Illillliilli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iilililiiili<invokedynamic>());
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

   private void Ilillllill(class_332 s, iIIiliiIlIilii ctx, llIiiIlilIiiIl t) {
      long var22 = -6470575876790140325L;
      long var24 = 4711352117147023523L;
      float var4 = 14.0F;
      float var5 = ctx.lIIIlliIIl + var4;
      float var6 = ctx.lIIIlliIIl + ctx.IlIIlliIIl - var4;
      float var7 = ctx.iIIIlliIIl + ctx.llIIlliIIl - 11.0F;
      float var8 = var6 - var5;
      float var9 = IIIiiIillIIiiIil.Illlllllilll();
      float var10 = t.lIliliilliIliliill - 0.35F;
      float var11 = lliiiIliliiiIl.IliIlllilIi(var10 / t.Illiliillllliliill);
      float var12 = var10 > t.Illiliillllliliill ? 1.0F - lliiiIliliiiIl.iIlIlllllill((var10 - t.Illiliillllliliill) / 0.8F) : 1.0F;
      IIIiiIillIIiiIil.IilliliilIIi(s, var5, var7, var8, var9, lIlIIIliIlIIIl.Iiiiliiiiiii(-1, 0.1F));
      if (var11 > 0.0F && var12 > 0.002F) {
         IIIiiIillIIiiIil.IilliliilIIi(s, var5, var7, var8 * var11, var9, lIlIIIliIlIIIl.Iiiiliiiiiii(IlIIilIlllIIilIl.lliiIlliIl, 0.85F * var12));
      }

      float[] var13 = t.lliiliilliliiliill;

      for(var22 ^= (0L ^ var22) & -1L << 32; (int)(var22 >>> 32) < var13.length; var22 += 4294967296L) {
         float var15 = var5 + var8 * lliiiIliliiiIl.IliIlllilIi(var13[(int)(var22 >>> 32)] / t.Illiliillllliliill);
         float var16 = (t.lIliliilliIliliill - 0.35F - var13[(int)(var22 >>> 32)]) / (IllilIIIilllilIIIi ? 0.5F : 1.0F);
         float var17 = var16 >= 0.0F && var16 < 0.35F ? 1.0F - lliiiIliliiiIl.liiiIIllIl(var16 / 0.35F) : 0.0F;
         float var18 = var10 >= var13[(int)(var22 >>> 32)] ? var12 : 0.0F;
         float var19 = 1.4F + 1.3F * var17;
         var22 ^= ((long)IilIIIIililIIIIi.Illlllllilll(lIlIIIliIlIIIl.Iiiiliiiiiii(-1, 0.28F), lIlIIIliIlIIIl.Iiiiliiiiiii(IlIIilIlllIIilIl.lliiIlliIl, 0.9F), (double)var18) ^ var22) & -1L >>> 32;
         var24 ^= ((long)IilIIIIililIIIIi.Illlllllilll((int)var22, -1, 0.6 * (double)var17) << 32 ^ var24) & -1L << 32;
         if (var17 > 0.01F) {
            IIIiiIillIIiiIil.IiIlliIliiIl(s, var15 - var19, var7 + var9 / 2.0F - var19, var19 * 2.0F, var19 * 2.0F, var19, lIlIIIliIlIIIl.Iiiiliiiiiii(IlIIilIlllIIilIl.lliiIlliIl, 0.35F * var17), 5.0F * var17, 1.0F);
         }

         IIIiiIillIIiiIil.IlIlllIlilIl(s, var15 - var19, var7 + var9 / 2.0F - var19, var19 * 2.0F, var19 * 2.0F, var19, (int)(var24 >>> 32));
      }

   }

   private lIIllIiiIIllIi iIlllIllll() {
      lIIllIiiIIllIi var1 = IlIliIlllIliIl.IIIllIIliIIl(this.IIiilIIIilIiilIIIi.IIliilIlii());
      return var1 != null ? var1 : IlIliIlllIliIl.IIIllIIliIIl(IliIlllilIi<invokedynamic>());
   }

   public void IIIllIIliIIl(class_332 ctx, iIIiliiIlIilii s) {
      long var16 = -8786335545192178361L;
      long var18 = 3401123525253965109L;
      var16 ^= ((long)s.iIlIlliIIl << 32 ^ var16) & -1L << 32;
      if ((int)(var16 >>> 32) >= 0 && (int)(var16 >>> 32) < this.lliilIIIiiliilIIIi.length) {
         llIiiIlilIiiIl var4 = this.lliilIIIiiliilIIIi[(int)(var16 >>> 32)];
         if (!this.IiiilIIIiliiilIIIi.liiiIIllIl(var4.llIiliillilIiliill)) {
            String var20 = this.IiiilIIIiliiilIIIi.iIlIlllllill(var4.llIiliillilIiliill) ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>();
            lIlIIIliIlIIIl.Iiilliiliiil(ctx, s.lIIIlliIIl, s.iIIIlliIIl, s.IlIIlliIIl, s.llIIlliIIl, lIlIIIliIlIIIl.IlIillIiilIi(IliIlllilIi<invokedynamic>()), IliIlllilIi<invokedynamic>(), var20);
         } else if (!IIllIllllIllIlll.IliIlllilIi()) {
            throw new IllegalStateException(IliIlllilIi<invokedynamic>());
         } else {
            class_310 var5 = class_310.method_1551();
            float var6 = (float)var5.method_22683().method_4495();
            float var7 = lIlIIIliIlIIIl.Illillliilli(s.lIIIlliIIl);
            float var8 = lIlIIIliIlIIIl.Iilililiiili(s.iIIIlliIIl);
            float var9 = lIlIIIliIlIIIl.Illillliilli(s.lIIIlliIIl + s.IlIIlliIIl);
            float var10 = lIlIIIliIlIIIl.Iilililiiili(s.iIIIlliIIl + s.llIIlliIIl);
            var16 ^= ((long)Math.max(1, Math.round((var9 - var7) * var6 * 2.0F)) ^ var16) & -1L >>> 32;
            var18 ^= ((long)Math.max(1, Math.round((var10 - var8) * var6 * 2.0F)) << 32 ^ var18) & -1L << 32;
            IIllIllllIllIlll var13 = this.iiiilIIIiIIIIiIIIi[s.lilIlliIIl ? 1 : 0];
            var13.lIiiIiIlilli((int)var16, (int)(var18 >>> 32));
            float var14 = this.ilIIiIIIiIiIIiIIIi.Illlllllilll() + 22.0F * (float)Math.sin((double)(this.liiIiIIIiiiiIiIIIi * 0.42F)) * this.IIIliIIIilIIliIIIi;
            this.IiiilIIIiliiilIIIi.IiIlliIliiIl(var13, (int)var16, (int)(var18 >>> 32), var4.llIiliillilIiliill, var4.IiIiliillliIiliill, var4.iiIiliillIIliliill, var4.lIliliilliIliliill - 0.35F, var4.Illiliillllliliill, var14, this.ilIIiIIIiIiIIiIIIi.Iilllilliill(), this.ilIIiIIIiIiIIiIIIi.IIillIiliIil(), this.IiiliIIIiliiliIIIi);
            Matrix4f var15 = IIIiiIillIIiiIil.liiiIIllIl().method_23760().method_23761();
            var13.IlIlllIlilIl(var15, s.lIIIlliIIl, s.iIIIlliIIl, s.IlIIlliIIl, s.llIIlliIIl, var13.IiIlliIliiIl(0), var13.IIlllIlliIll(0), var13.IiIlliIliiIl((int)var16), var13.IIlllIlliIll((int)(var18 >>> 32)), this.illliIIIiIilliIIIi, this.lilliIIIiiilliIIIi, this.IIiliIIIilIiliIIIi, this.iIiliIIIiIliliIIIi, this.lliliIIIiililiIIIi, IliiIilliiIi.IIIllIIliIIl());
         }
      }
   }

   public void iIIIlIlIIl(iIIiliiIlIilii button, double stage, double y, double dx, double x, int dy) {
      if (dy == 0) {
         this.ilIIiIIIiIiIIiIIIi.iIlIlllllill(dx, x);
      }

   }

   private int lIilliIill() {
      long var3 = -4357520195861114025L;
      class_310 var1 = class_310.method_1551();
      var3 ^= ((long)Math.max(8, Math.round(22.0F * (float)var1.method_22683().method_4495() * 2.0F)) << 32 ^ var3) & -1L << 32;
      return Math.max(1, Math.min((int)(var3 >>> 32), IIllIllllIllIlll.liiiIIllIl() / Math.max(1, this.iIiilIIIiIliilIIIi.size())));
   }

   // $FF: synthetic method
   static liiiliiliiiiliil Illillllil(ilillllIiillll x0) {
      return x0.iiilllIIIill;
   }

   private boolean liilliiill() {
      long var2 = 8771485731214569108L;
      var2 ^= ((long)this.iiilllIIIill.iliIiiliiiii() << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) >= 0 && (int)(var2 >>> 32) < this.lliilIIIiiliilIIIi.length && iiIiliiIIlilii.IIillIiliIil(this.lliilIIIiiliilIIIi[(int)(var2 >>> 32)].llIiliillilIiliill) != null;
   }

   private void IIIillIIil(int dir) {
      if (!this.liilliiill()) {
         this.IIiilIIIilIiilIIIi.iIliiIllii(dir);
      }
   }

   public void Iiilliiliiil(class_332 ctx, int y, float size, float x, float index) {
      long var10 = -6032730263257558428L;
      if (!lililIIIiiililIIIi && this.lIIIiIIIiiIIIiIIIi.iIlIlllllill() > 0 && !(this.IiIliIIIiliIliIIIi <= 0.002F)) {
         var10 ^= ((long)this.lIilliIill() << 32 ^ var10) & -1L << 32;
         if (this.lIIIiIIIiiIIIiIIIi.iIlIlllllill() >= (int)(var10 >>> 32) * this.iIiilIIIiIliilIIIi.size()) {
            Matrix4f var7 = IIIiiIillIIiiIil.liiiIIllIl().method_23760().method_23761();
            float var8 = IIIiiIillIIiiIil.Illlllllilll();

            try {
               this.lIIIiIIIiiIIIiIIIi.IlIlllIlilIl(var7, size, x, index, index, this.lIIIiIIIiiIIIiIIIi.IiIlliIliiIl(y * (int)(var10 >>> 32)), this.lIIIiIIIiiIIIiIIIi.IIlllIlliIll(0), this.lIIIiIIIiiIIIiIIIi.IiIlliIliiIl((y + 1) * (int)(var10 >>> 32)), this.lIIIiIIIiiIIIiIIIi.IIlllIlliIll((int)(var10 >>> 32)), lIlIIIliIlIIIl.Illillliilli(size + var8), lIlIIIliIlIIIl.Iilililiiili(x + var8), lIlIIIliIlIIIl.Illillliilli(size + index - var8), lIlIIIliIlIIIl.Iilililiiili(x + index - var8), (5.0F - var8) * lIlIIIliIlIIIl.IIiilIiiiIii(), IliiIilliiIi.IIIllIIliIIl() * this.IiIliIIIiliIliIIIi);
            } catch (Throwable var12) {
               lililIIIiiililIIIi = true;
            }

         }
      }
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '胃') + var5) >>> 15 | (char)((char)(var4[var5] ^ '胃') + var5) << 1) >>> 6 | (char)((char)((char)(var4[var5] ^ '胃') + var5) >>> 15 | (char)((char)(var4[var5] ^ '胃') + var5) << 1) << 10) - var5))) << 2 | (char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '胃') + var5) >>> 15 | (char)((char)(var4[var5] ^ '胃') + var5) << 1) >>> 6 | (char)((char)((char)(var4[var5] ^ '胃') + var5) >>> 15 | (char)((char)(var4[var5] ^ '胃') + var5) << 1) << 10) - var5))) >>> 14) - 5963))) >>> 1 | (char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '胃') + var5) >>> 15 | (char)((char)(var4[var5] ^ '胃') + var5) << 1) >>> 6 | (char)((char)((char)(var4[var5] ^ '胃') + var5) >>> 15 | (char)((char)(var4[var5] ^ '胃') + var5) << 1) << 10) - var5))) << 2 | (char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '胃') + var5) >>> 15 | (char)((char)(var4[var5] ^ '胃') + var5) << 1) >>> 6 | (char)((char)((char)(var4[var5] ^ '胃') + var5) >>> 15 | (char)((char)(var4[var5] ^ '胃') + var5) << 1) << 10) - var5))) >>> 14) - 5963))) << 15) + 10600))) - var5))) - var5) ^ 2291));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IIillIiliIil(int index) {
      String var2 = (String)this.iIiilIIIiIliilIIIi.get(index);
      if (IliIlllilIi<invokedynamic>().equals(var2)) {
         return IliIlllilIi<invokedynamic>();
      } else {
         iiIiliiIIlilii var3 = iiIiliiIIlilii.IIillIiliIil(var2);
         if (var3 != null) {
            return var3.lIiiIiIlilli();
         } else if (iliiiIiiii.lIiiIiIlilli(var2)) {
            return IliIlllilIi<invokedynamic>();
         } else {
            return IliIlllilIi<invokedynamic>().equals(var2) ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>();
         }
      }
   }

   public boolean iiIIlIIlIl(int key, int modifiers) {
      switch (key) {
         case 32 -> this.iIIilIlIil();
         case 91 -> this.IIIillIIil(-1);
         case 93 -> this.IIIillIIil(1);
         default -> {
            return false;
         }
      }

      return true;
   }

   private void iIIilIlIil() {
      if (this.lIiIiIIIiiIiIiIIIi >= 0) {
         this.lliilIIIiiliilIIIi[this.lIiIiIIIiiIiIiIIIi].IliIlllilIi();
         this.iiilllIIIill.Ililllililil();
      }

   }

   private void Iillllilll(float dt) {
      if (!lililIIIiiililIIIi && IIllIllllIllIlll.IliIlllilIi()) {
         try {
            this.iilllIIill(dt);
         } catch (Throwable var3) {
            lililIIIiiililIIIi = true;
            this.lIIIiIIIiiIIIiIIIi.Iilllilliill();
            this.IlIIiIIIillIIiIIIi.Iilllilliill();
            this.iIliiIIIiIlliiIIIi = -1;
         }

      }
   }

   public void IIlllIlliIll(iiIiIlIIliIl f) {
      if (this.liilliiill()) {
         f.lIiiIiIlilli(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
      } else {
         String var2 = this.IiiliIIIiliiliIIIi == null ? IliIlllilIi<invokedynamic>() : this.IIiilIIIilIiilIIIi.IIliilIlii();
         f.IiIlliIliiIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), var2, this.iIlIiIIIiIllIiIIIi);
      }

      f.IIIllIIliIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), lIlilIIIiiIlilIIIi, this.lllIiIIIiillIiIIIi).IIIllIIliIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IllilIIIilllilIIIi, this.IilIiIIIililIiIIIi).IilliliilIIi().Illlllllilll(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this.iilIiIIIiIIiIiIIIi);
   }

   public String Iilllilliill(int index) {
      return (String)this.iIiilIIIiIliilIIIi.get(index);
   }

   public boolean IIIIllIIIl(iIIiliiIlIilii stage, double x, double y, int button) {
      if (button == 1) {
         this.ilIIiIIIiIiIIiIIIi.IlIlllIlilIl();
         return true;
      } else {
         this.ilIIiIIIiIiIIiIIIi.liiiIIllIl();
         return true;
      }
   }
}
