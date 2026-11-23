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
import java.util.Locale;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_332;
import org.lwjgl.glfw.GLFW;

public class illiIlllIiliIlll {
   private static final float ilIlIlIill = 7.0F;
   private static final int lillIlIill = 66;
   private static final int IillIlIill = 44;
   private static final int IlllIlIill = 88;
   private static final float iiIlIlIill = 0.5F;
   private final String[] liilIlIill;
   private static final int iillIlIill = 24;
   private final iIliililIlliilil llIiIlIill;
   private IIIIlilllIIIlill IIliIlIill;
   private double IlliIlIill;
   private static final int llllIlIill = 16;
   private final int[] iiilIlIill;
   private static final int llIlIlIill = 36;
   private final iiiiilIiIIIIIiIi lIIiIlIill;
   private static final int iIIlIlIill = 3;
   private int iIliIlIill;
   private final IliiIIIilliiIIIi IlilIlIill;
   private static final int IlIlIlIill = 2;
   private static final int IIIlIlIill = 1;
   private int lIliIlIill;
   private int IiIiIlIill;
   private final IIllIIIllIllIIIl IlIiIlIill;
   private final List<IlIiillIii> IiilIlIill;
   private final iIIliiIiIlIliiIi ilIiIlIill;
   private static final int illlIlIill = 8;
   private static final int IIilIlIill = 16;
   private int IIIiIlIill;
   private static final String IIllIlIill = "pill:bind";
   private boolean llliIlIill;
   private static int iIilIlIill = -1;
   private int iiIiIlIill;
   private final List<List<IlIiillIii>> ililIlIill;
   private static final int iiiIIlIill = 0;
   private boolean iIIiIlIill;
   private static final int lIIlIlIill = 2;
   private int illiIlIill;
   private static final int lIllIlIill = 130;
   private static final int lIilIlIill = 6;
   private static final float IiIlIlIill = 18.0F;
   private static final String[] liiIIlIill = new String[]{IllIllllIl<invokedynamic>(), IllIllllIl<invokedynamic>(), IllIllllIl<invokedynamic>(), IllIllllIl<invokedynamic>()};
   private final llIilIiilIilIi llilIlIill;
   private static final int iIllIlIill = 56;
   private int liIiIlIill;
   private static final float liIlIlIill = 11.0F;

   // $FF: synthetic method
   private static CallSite lilIliilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(var4[var5] + 14356) >>> 4 | (char)(var4[var5] + 14356) << 12) + var5) << 1 | (char)((char)((char)(var4[var5] + 14356) >>> 4 | (char)(var4[var5] + 14356) << 12) + var5) >>> 15))))) - '텫') ^ 27221) - '잋') ^ '\ue8d8'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void Illlllllilll(int index) {
      this.IIIiIlIill = index;
      iIilIlIill = this.iiilIlIill[index];
      this.lIIiIlIill.IiIiliIiiiIi("");
   }

   public int lIiiIiIlilli() {
      return this.illiIlIill;
   }

   private void IlIillIiilIi() {
      this.lIIiIlIill.lIiiIiIlilli();
      this.llliIlIill = true;
   }

   public boolean IIlilIliiIli(double mx, double btn, int my) {
      long var7 = -8233581648129643630L;
      var7 ^= ((long)(this.iIIiIlIill && this.lIIiIlIill.Illillliilli(mx, btn) ? 1 : 0) << 32 ^ var7) & -1L << 32;
      this.lIIiIlIill.IiIlliIliiIl(mx, btn, my);
      if (!this.iIIiIlIill) {
         this.lIIiIlIill.lIiiIiIlilli();
      }

      if ((int)(var7 >>> 32) != 0) {
         return true;
      } else if (my != 0) {
         return false;
      } else {
         this.IlliIlIill = mx;
         return this.IlIiIlIill.IilliliilIIi(mx, btn);
      }
   }

   private void IIillIiliIil(class_332 ctx, IlIiillIii x, int mx, int y, int w, int r, int my) {
      long var19 = 8497561512175532093L;
      iIIliiIiIlIliiIi var8 = this.ilIiIlIill.lIiiIiIlilli(this.iiIiIlIill++);
      if (!var8.iliIiiliiiii()) {
         float var9 = var8.IiilIIIlIi;
         float var10 = var8.liilIIIlIi;
         IIllIIIllIllIIIl var11 = var8.lIIiIIIlIi ? this.IlIiIlIill : IIllIIIllIllIIIl.ililiiIlIl;
         var19 ^= ((long)(var8.IIIiIIIlIi ? r : mx - 4000) << 32 ^ var19) & -1L << 32;
         String var13 = IllIllllIl<invokedynamic>() + x.IliIlllilIi();
         var19 ^= ((long)llilliilililliil.IlIlllIlilIl(ctx, (float)mx + (float)w / 2.0F, (float)y + 18.0F, var8.iiilIIIlIi * this.llIiIlIill.IilliliilIIi(var13, 0.025F)) ^ var19) & -1L >>> 32;

         try {
            if (var9 > 0.004F) {
               float var15 = IliiIilliiIi.IilliliilIIi(var9);

               try {
                  llilliilililliil.illilIilil(ctx, (float)mx, (float)y, (float)w, 36.0F, 0.0F, 0.0F, 0.0F);
               } finally {
                  IliiIilliiIi.lIiiIiIlilli(var15);
               }
            }

            if (var10 > 0.002F) {
               float var33 = IliiIilliiIi.IilliliilIIi(var10);

               try {
                  this.Ililllililil(ctx, x, var13, var11, mx, y, w, (int)(var19 >>> 32), my);
               } finally {
                  IliiIilliiIi.lIiiIiIlilli(var33);
               }
            }
         } finally {
            llilliilililliil.IiIlliIliiIl(ctx, (boolean)((int)var19));
         }

      }
   }

   public boolean IIIllIIliIIl() {
      return this.llliIlIill;
   }

   private static <T extends IilliIllilliIl> T iIlIlllllill(ilIllIiIll m, Class<T> type) {
      if (m == null) {
         return null;
      } else {
         for(IilliIllilliIl var3 : m.IiIlliIliiIl()) {
            if (type.isInstance(var3)) {
               return (T)(type.cast(var3));
            }
         }

         return null;
      }
   }

   public void iIIIlIlIIl(int glfwButton) {
      if (this.IlilIlIill != null) {
         this.IlilIlIill.IlIillIiilIi(IlIiliIlllIiliIl.iIlIlllllill(glfwButton));
      }

      this.llliIlIill = false;
      this.llIiIlIill.iIlIlllllill(IllIllllIl<invokedynamic>());
   }

   private String IiIiliIiiiIi() {
      long var4 = -6405698681326764196L;
      var4 ^= ((long)(this.IlilIlIill != null ? this.IlilIlIill.IIIilIIiiIIi() : 344) << 32 ^ var4) & -1L << 32;
      String var2 = IlIiliIlllIiliIl.IlIlllIlilIl((int)(var4 >>> 32));
      if (var2 != null) {
         return var2;
      } else {
         String var3 = GLFW.glfwGetKeyName((int)(var4 >>> 32), 0);
         return var3 != null ? var3.toUpperCase() : IlIiliIlllIiliIl.IIIllIIliIIl((int)(var4 >>> 32));
      }
   }

   public void IIIIllIIIl(int key) {
      if (this.IlilIlIill != null) {
         this.IlilIlIill.IlIillIiilIi(IlIiliIlllIiliIl.IilliliilIIi(key) ? -1 : key);
      }

      this.llliIlIill = false;
      this.llIiIlIill.iIlIlllllill(IllIllllIl<invokedynamic>());
   }

   public illiIlllIiliIlll() {
      long var9 = -3931194483865016423L;
      long var11 = -7437297627688784634L;
      super();
      this.ililIlIill = new ArrayList();
      this.IiilIlIill = new ArrayList();
      this.lIIiIlIill = new iiiiilIiIIIIIiIi(0, 0, 0, 0);
      this.iIIiIlIill = false;
      this.IlIiIlIill = new IIllIIIllIllIIIl();
      this.llIiIlIill = new iIliililIlliilil();
      this.ilIiIlIill = new iIIliiIiIlIliiIi();
      this.IiIiIlIill = 0;
      this.liIiIlIill = -1;
      this.iiIiIlIill = 0;
      this.IIliIlIill = null;
      this.llliIlIill = false;
      this.illiIlIill = 200;
      this.IlilIlIill = (IliiIIIilliiIIIi)llilIllililIll.iliIiiliiiii(IliiIIIilliiIIIi.class);
      this.llilIlIill = (llIilIiilIilIi)llilIllililIll.iliIiiliiiii(llIilIiilIilIi.class);
      ililliIiIiilliIi var1 = (ililliIiIiilliIi)iIlIlllllill(llilIllililIll.iliIiiliiiii(ilIIiiIiIiIIiiIi.class), ililliIiIiilliIi.class);
      ililliIiIiilliIi var2 = (ililliIiIiilliIi)iIlIlllllill(llilIllililIll.iliIiiliiiii(lilllIliiilllIli.class), ililliIiIiilliIi.class);
      ililliIiIiilliIi var3 = (ililliIiIiilliIi)iIlIlllllill(llilIllililIll.iliIiiliiiii(lIllliiliIllliil.class), ililliIiIiilliIi.class);
      ilIllIiIll var4 = llilIllililIll.iliIiiliiiii(lllIlliillIlli.class);
      ilIllIiIll var5 = llilIllililIll.iliIiiliiiii(IliiliIllliiliIl.class);

      for(var9 ^= (0L ^ var9) & -1L << 32; (int)(var9 >>> 32) < liiIIlIill.length; var9 += 4294967296L) {
         this.ililIlIill.add(new ArrayList());
      }

      this.liiiIIllIl(0, lillIIlliillIIll.lIIIlIllll, IllIllllIl<invokedynamic>(), IllIllllIl<invokedynamic>(), IllIllllIl<invokedynamic>(), (IilliIllilliIl)null);
      this.IliIlllilIi(0, lillIIlliillIIll.iIIIlIllll, IllIllllIl<invokedynamic>(), (iiIiiilIIliiil)IilliliilIIi(this.IlilIlIill, IllIllllIl<invokedynamic>()));
      if (this.llilIlIill != null) {
         this.liiiIIllIl(0, lillIIlliillIIll.iIIIlIllll, IllIllllIl<invokedynamic>(), this.llilIlIill.IilliliilIIi(), IllIllllIl<invokedynamic>(), (IilliIllilliIl)null);
      }

      this.IliIlllilIi(0, lillIIlliillIIll.iIIIlIllll, IllIllllIl<invokedynamic>(), (iiIiiilIIliiil)IilliliilIIi(var5, IllIllllIl<invokedynamic>()));
      this.IliIlllilIi(0, lillIIlliillIIll.iIIIlIllll, IllIllllIl<invokedynamic>(), (iiIiiilIIliiil)IilliliilIIi(var5, IllIllllIl<invokedynamic>()));
      this.IliIlllilIi(1, lillIIlliillIIll.iIIIlIllll, IllIllllIl<invokedynamic>(), (iiIiiilIIliiil)IilliliilIIi(var4, IllIllllIl<invokedynamic>()));
      this.IliIlllilIi(1, lillIIlliillIIll.iIIIlIllll, IllIllllIl<invokedynamic>(), (iiIiiilIIliiil)IilliliilIIi(var4, IllIllllIl<invokedynamic>()));
      this.IliIlllilIi(1, lillIIlliillIIll.iIIIlIllll, IllIllllIl<invokedynamic>(), (iiIiiilIIliiil)IilliliilIIi(var4, IllIllllIl<invokedynamic>()));
      this.IliIlllilIi(1, lillIIlliillIIll.iIIIlIllll, IllIllllIl<invokedynamic>(), (iiIiiilIIliiil)IilliliilIIi(var4, IllIllllIl<invokedynamic>()));
      this.IliIlllilIi(1, lillIIlliillIIll.IlIIlIllll, IllIllllIl<invokedynamic>(), (lliliIIiililiIIi)IilliliilIIi(var4, IllIllllIl<invokedynamic>()));
      this.IliIlllilIi(1, lillIIlliillIIll.IlIIlIllll, IllIllllIl<invokedynamic>(), (lliliIIiililiIIi)IilliliilIIi(var4, IllIllllIl<invokedynamic>()));
      this.IliIlllilIi(1, lillIIlliillIIll.llIIlIllll, IllIllllIl<invokedynamic>(), (IIIIlilllIIIlill)IilliliilIIi(var4, IllIllllIl<invokedynamic>()));
      this.IliIlllilIi(1, lillIIlliillIIll.llIIlIllll, IllIllllIl<invokedynamic>(), (IIIIlilllIIIlill)IilliliilIIi(var4, IllIllllIl<invokedynamic>()));
      if (var1 != null) {
         this.liiiIIllIl(2, lillIIlliillIIll.ilIIlIllll, IllIllllIl<invokedynamic>(), IllIllllIl<invokedynamic>(), (String)null, var1);
      }

      if (var2 != null) {
         this.liiiIIllIl(3, lillIIlliillIIll.IiIIlIllll, IllIllllIl<invokedynamic>(), IllIllllIl<invokedynamic>(), var2.IliIlllilIi(), var2);
      }

      if (var3 != null) {
         this.liiiIIllIl(3, lillIIlliillIIll.IiIIlIllll, IllIllllIl<invokedynamic>(), var3.IliIlllilIi(), IllIllllIl<invokedynamic>(), var3);
      }

      var9 ^= (0L ^ var9) & -1L << 32;

      for(List var8 : this.ililIlIill) {
         if (!var8.isEmpty()) {
            var9 += 4294967296L;
         }
      }

      this.liilIlIill = new String[(int)(var9 >>> 32) + 1];
      this.iiilIlIill = new int[(int)(var9 >>> 32) + 1];
      this.liilIlIill[0] = IllIllllIl<invokedynamic>();
      this.iiilIlIill[0] = -1;
      var9 ^= (1L ^ var9) & -1L >>> 32;

      for(long var16 = var11 ^ (0L ^ var11) & -1L << 32; (int)(var16 >>> 32) < liiIIlIill.length; var16 += 4294967296L) {
         if (!((List)this.ililIlIill.get((int)(var16 >>> 32))).isEmpty()) {
            this.liilIlIill[(int)var9] = liiIIlIill[(int)(var16 >>> 32)];
            this.iiilIlIill[(int)var9] = (int)(var16 >>> 32);
            if ((int)(var16 >>> 32) == iIilIlIill) {
               this.IIIiIlIill = (int)var9;
            }

            var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32;
         }
      }

      this.lIIiIlIill.liiiIIllIl(IllIllllIl<invokedynamic>());
      this.lIIiIlIill.iIlIlllllill(false);
      this.lIIiIlIill.IilliliilIIi(6);
   }

   // $FF: synthetic method
   private static CallSite IllIllllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2755789385299833898L ^ Long.rotateLeft(7094781248076771792L, 60) ^ 6587284384836372358L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1163453559646636344L ^ Long.rotateLeft(-9155572165211979894L, 61) ^ 5004171700217327568L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 260310872145987950L ^ Long.rotateLeft(-4421901048668344171L, 14) ^ -8011233412705891578L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 1969258574398122413L ^ Long.rotateLeft(-9106421400093893907L, 19) ^ -7264750561002251673L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7032754725642439194L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1608226850289650792L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1630534863927078356L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7047209324566374436L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7322041072728271535L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2927249115737138627L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(illIlIilIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, lilIliilIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIiIllIiIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, iIiIlIliIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(lliIliliIl<invokedynamic>());
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
   private static CallSite iIiIlIliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(-((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) + var5) - var5) + 18382))) >>> 15 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) + var5) - var5) + 18382))) << 1))))) + var5) << 9 | (char)((char)(-((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) + var5) - var5) + 18382))) >>> 15 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) + var5) - var5) + 18382))) << 1))))) + var5) >>> 7) + '鹯'))))) - 26876) - '읨') - '십')))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void llIIlilIIl() {
      this.llliIlIill = false;
   }

   public boolean Iliilliiilii(char chr, int mod) {
      if (!this.lIIiIlIill.IIlilIliiIli()) {
         return false;
      } else {
         this.lIIiIlIill.Illlllllilll(chr, mod);
         return true;
      }
   }

   private static IilliIllilliIl IilliliilIIi(ilIllIiIll name, String m) {
      if (name == null) {
         return null;
      } else {
         for(IilliIllilliIl var3 : name.IiIlliIliiIl()) {
            if (var3.IliIlllilIi().equalsIgnoreCase(m)) {
               return var3;
            }
         }

         return null;
      }
   }

   public void IiIlliIliiIl(class_332 ctx, int w, int my, int mx, int top, int x) {
      long var22 = 149693314717177515L;
      long var24 = -94981605339721830L;
      long var26 = -5561417498144468051L;
      long var28 = 4781020204729809393L;
      long var30 = -8293561920886221177L;
      this.IlIiIlIill.IliIlllilIi();
      var22 ^= ((long)this.ilIiIlIill.iIlIlllllill() << 32 ^ var22) & -1L << 32;
      String var8 = this.lIIiIlIill.IlIillIiilIi().trim().toLowerCase(Locale.ROOT);
      var22 ^= ((long)(!var8.isEmpty() ? 1 : 0) ^ var22) & -1L >>> 32;
      var24 ^= ((long)(-1 - this.IIIiIlIill) << 32 ^ var24) & -1L << 32;
      var24 ^= ~var24 & -1L >>> 32;
      if ((int)var22 != 0) {
         this.IiilIlIill.clear();
         var24 ^= (4294967296L ^ var24) & -1L << 32;

         for(List var13 : this.ililIlIill) {
            for(IlIiillIii var15 : var13) {
               if (var15.iliIiiliiiii().contains(var8)) {
                  this.IiilIlIill.add(var15);
                  var24 ^= ((long)((int)(var24 >>> 32) * 31 + var15.IliIlllilIi().hashCode()) << 32 ^ var24) & -1L << 32;
               }
            }
         }

         var24 ^= ((long)this.IiilIlIill.size() ^ var24) & -1L >>> 32;
         if ((int)(var24 >>> 32) < 0) {
            var24 ^= ((long)(~((int)(var24 >>> 32))) << 32 ^ var24) & -1L << 32;
         }
      }

      if ((int)(var22 >>> 32) != 0) {
         this.ilIiIlIill.IliIlllilIi();
      } else if ((int)(var24 >>> 32) != this.IiIiIlIill) {
         if ((int)var24 > 0 && this.liIiIlIill > 0 && (int)var24 <= this.liIiIlIill) {
            this.ilIiIlIill.liiiIIllIl();
         } else {
            this.ilIiIlIill.IliIlllilIi();
         }
      }

      this.IiIiIlIill = (int)(var24 >>> 32);
      this.liIiIlIill = (int)var24;
      this.iiIiIlIill = 0;
      float var34 = llilliilililliil.IiiIlliiIl(ctx, IllIllllIl<invokedynamic>(), (float)w, (float)my, 22.0F);
      float var35 = llilliilililliil.iiiIlIIIll(ctx, this.IlIiIlIill, this.llIiIlIill, IllIllllIl<invokedynamic>(), this.liilIlIill, (int)var22 != 0 ? 0 : this.IIIiIlIill, var34 + 10.0F, (float)my, 22.0F, top, x, this::Illlllllilll);
      var26 ^= ((long)((int)Math.ceil((double)(var35 + 8.0F))) << 32 ^ var26) & -1L << 32;
      var26 ^= ((long)Math.min(130, w + mx - (int)(var26 >>> 32)) ^ var26) & -1L >>> 32;
      this.iIIiIlIill = (int)var26 >= 56;
      if (this.iIIiIlIill) {
         this.lIIiIlIill.IliIlllilIi((int)(var26 >>> 32), my + 2, (int)var26, 18);
         this.lIIiIlIill.iliIiiliiiii(ctx, top, x, 0.0F);
      } else {
         this.lIIiIlIill.lIiiIiIlilli();
      }

      var28 ^= ((long)(my + 22 + 6) << 32 ^ var28) & -1L << 32;
      if ((int)var22 != 0) {
         if (this.IiilIlIill.isEmpty()) {
            llilliilililliil.IilIililIi(ctx, this.IlIiIlIill, this.llIiIlIill, IllIllllIl<invokedynamic>(), (float)w, (float)((int)(var28 >>> 32)), (float)mx, 88.0F, lIlIIiliIlIIil.IIIIllIIIl(IllIllllIl<invokedynamic>()), IllIllllIl<invokedynamic>(), IllIllllIl<invokedynamic>(), (String)null, top, x, (Runnable)null);
            var28 += 377957122048L;
         } else {
            var28 ^= ((long)((int)(var28 >>> 32) + this.Iilllilliill(ctx, this.IiilIlIill, w, (int)(var28 >>> 32), mx, top, x)) << 32 ^ var28) & -1L << 32;
         }
      } else if (this.iiilIlIill[this.IIIiIlIill] < 0) {
         var28 ^= (1L ^ var28) & -1L >>> 32;

         for(long var47 = var30 ^ (0L ^ var30) & -1L << 32; (int)(var47 >>> 32) < liiIIlIill.length; var47 += 4294967296L) {
            List var19 = (List)this.ililIlIill.get((int)(var47 >>> 32));
            if (!var19.isEmpty()) {
               if ((int)var28 == 0) {
                  var28 += 38654705664L;
               }

               var28 ^= (0L ^ var28) & -1L >>> 32;
               float var20 = IliiIilliiIi.IilliliilIIi(this.ilIiIlIill.IIIllIIliIIl(this.iiIiIlIill));

               try {
                  llilliilililliil.lllIiillIi(ctx, liiIIlIill[(int)(var47 >>> 32)], (float)w, (float)((int)(var28 >>> 32)), (float)mx);
               } finally {
                  IliiIilliiIi.lIiiIiIlilli(var20);
               }

               var28 += 51539607552L;
               var28 ^= ((long)((int)(var28 >>> 32) + this.Iilllilliill(ctx, var19, w, (int)(var28 >>> 32), mx, top, x)) << 32 ^ var28) & -1L << 32;
            }
         }
      } else {
         var28 ^= ((long)((int)(var28 >>> 32) + this.Iilllilliill(ctx, (List)this.ililIlIill.get(this.iiilIlIill[this.IIIiIlIill]), w, (int)(var28 >>> 32), mx, top, x)) << 32 ^ var28) & -1L << 32;
      }

      this.illiIlIill = (int)(var28 >>> 32) - my;
   }

   // $FF: synthetic method
   private static CallSite IIiIllIiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - var5) - '\ud8e7') + 641) + var5) ^ 22908) ^ 28544) ^ '쮁') ^ var5) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - var5) - '\ud8e7') + 641) + var5) ^ 22908) ^ 28544) ^ '쮁') ^ var5) >>> 11) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - var5) - '\ud8e7') + 641) + var5) ^ 22908) ^ 28544) ^ '쮁') ^ var5) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - var5) - '\ud8e7') + 641) + var5) ^ 22908) ^ 28544) ^ '쮁') ^ var5) >>> 11) >>> 12) ^ var5))) - var5) - '鸺') - 'ﵶ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean iliIiiliiiii() {
      return false;
   }

   // $FF: synthetic method
   private static CallSite lliIliliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) ^ 'ﱫ') >>> 4 | (char)((char)(var4[var5] - var5) ^ 'ﱫ') << 12))) ^ 31441) ^ '뽿') >>> 15 | (char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) ^ 'ﱫ') >>> 4 | (char)((char)(var4[var5] - var5) ^ 'ﱫ') << 12))) ^ 31441) ^ '뽿') << 1))))) << 10 | (char)(-((char)(~((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) ^ 'ﱫ') >>> 4 | (char)((char)(var4[var5] - var5) ^ 'ﱫ') << 12))) ^ 31441) ^ '뽿') >>> 15 | (char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) ^ 'ﱫ') >>> 4 | (char)((char)(var4[var5] - var5) ^ 'ﱫ') << 12))) ^ 31441) ^ '뽿') << 1))))) >>> 6))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IIlllIlliIll(class_332 ctx) {
   }

   public boolean IlIlllIlilIl() {
      return this.lIIiIlIill.IIlilIliiIli();
   }

   // $FF: synthetic method
   private static CallSite illIlIilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 1 | (char)(~((char)(-var4[var5]))) >>> 15) + 29402) << 1 | (char)((char)((char)(~((char)(-var4[var5]))) << 1 | (char)(~((char)(-var4[var5]))) >>> 15) + 29402) >>> 15) << 12 | (char)((char)((char)((char)(~((char)(-var4[var5]))) << 1 | (char)(~((char)(-var4[var5]))) >>> 15) + 29402) << 1 | (char)((char)((char)(~((char)(-var4[var5]))) << 1 | (char)(~((char)(-var4[var5]))) >>> 15) + 29402) >>> 15) >>> 4) >>> 2 | (char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 1 | (char)(~((char)(-var4[var5]))) >>> 15) + 29402) << 1 | (char)((char)((char)(~((char)(-var4[var5]))) << 1 | (char)(~((char)(-var4[var5]))) >>> 15) + 29402) >>> 15) << 12 | (char)((char)((char)((char)(~((char)(-var4[var5]))) << 1 | (char)(~((char)(-var4[var5]))) >>> 15) + 29402) << 1 | (char)((char)((char)(~((char)(-var4[var5]))) << 1 | (char)(~((char)(-var4[var5]))) >>> 15) + 29402) >>> 15) >>> 4) << 14) ^ 3994) + var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void IIIilIIiiIIi(double mx) {
      if (this.IIliIlIill != null && this.iIliIlIill > 0) {
         double var3 = Math.max((double)0.0F, Math.min((double)1.0F, (mx - (double)this.lIliIlIill) / (double)this.iIliIlIill));
         double var5 = this.IIliIlIill.Ililllililil() + var3 * (this.IIliIlIill.Iiilliiliiil() - this.IIliIlIill.Ililllililil());
         double var7 = this.IIliIlIill.IlIillIiilIi();
         if (var7 > (double)0.0F) {
            var5 = (double)Math.round(var5 / var7) * var7;
         }

         this.IIliIlIill.IIillIiliIil(var5);
         iiiIIIlIIIlIIl.liiiIIllIl();
      }
   }

   public void Illillliilli(double mx, double btn, int my) {
      if (this.IIliIlIill != null) {
         this.IIIilIIiiIIi(mx);
      }

   }

   private float Iiilliiliiil(class_332 w, IIllIIIllIllIIIl x, IIIIlilllIIIlill hits, String labelY, int key, int mx, int s, float y, int ctx, int my) {
      long var24 = -7495756229397814940L;
      long var26 = -6135994276458642105L;
      long var28 = 4635942562984307664L;
      var24 ^= ((long)(key + 8) << 32 ^ var24) & -1L << 32;
      var24 ^= ((long)(s - 16) ^ var24) & -1L >>> 32;
      var26 ^= ((long)((int)(var24 >>> 32) - 6) << 32 ^ var26) & -1L << 32;
      var26 ^= ((long)(mx + 16) ^ var26) & -1L >>> 32;
      var28 ^= ((long)((int)var24 + 12) << 32 ^ var28) & -1L << 32;
      var28 ^= (20L ^ var28) & -1L >>> 32;
      float var17 = this.llIiIlIill.IIIllIIliIIl(IllIllllIl<invokedynamic>() + labelY, this.IIliIlIill == hits || llilliilililliil.Iliilliiilii((double)ctx, (double)my, (float)((int)(var26 >>> 32)), (float)((int)var26), (float)((int)(var28 >>> 32)), (float)((int)var28)));
      double var18 = hits.Iiilliiliiil() - hits.Ililllililil();
      float var20 = this.llIiIlIill.iliIiiliiiii(IllIllllIl<invokedynamic>() + labelY, (float)hits.Iilllilliill(), 12.0F);
      float var21 = var18 <= (double)0.0F ? 0.0F : (float)(((double)var20 - hits.Ililllililil()) / var18);
      llilliilililliil.ilIllIiIll(w, (float)((int)(var24 >>> 32)), (float)(mx + 24), (float)((int)var24), var21, var17);
      String var22 = Math.round(var20 * 100.0F) + IllIllllIl<invokedynamic>();
      float var23 = (float)(key + s - 8) - llilliilililliil.llIIlilIIl(var22);
      llilliilililliil.iiIIlIIlIl(var22, var23, y, IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)var17));
      x.liiiIIllIl((float)((int)(var26 >>> 32)), (float)((int)var26), (float)((int)(var28 >>> 32)), (float)((int)var28), () -> {
         this.IIliIlIill = hits;
         this.lIliIlIill = trackW;
         this.iIliIlIill = trackX;
         this.IIIilIIiiIIi(this.IlliIlIill);
      });
      return var23;
   }

   private void liiiIIllIl(int desc, lillIIlliillIIll section, String label, String key, String kind, IilliIllilliIl s) {
      StringBuilder var7 = (new StringBuilder(key)).append(' ').append(liiIIlIill[desc]);
      if (kind != null) {
         var7.append(' ').append(kind);
      }

      if (s != null && s.liiiIIllIl() != null) {
         var7.append(' ').append(s.liiiIIllIl());
      }

      if (s instanceof ililliIiIiilliIi var8) {
         var7.append(' ').append(var8.Iilllilliill());
      }

      if (section == lillIIlliillIIll.lIIIlIllll) {
         var7.append(IllIllllIl<invokedynamic>());
      }

      ((List)this.ililIlIill.get(desc)).add(new IlIiillIii(label, section, key, kind, s, var7.toString().toLowerCase(Locale.ROOT)));
   }

   public boolean IIiilIiiiIii(int mod, int key, int scan) {
      if (!this.lIIiIlIill.IIlilIliiIli()) {
         return false;
      } else {
         this.lIIiIlIill.IIlllIlliIll(mod, key, scan);
         return true;
      }
   }

   public void Iiiiliiiiiii() {
      this.llliIlIill = false;
      this.lIIiIlIill.lIiiIiIlilli();
      this.iIIiIlIill = false;
      this.IlIiIlIill.IliIlllilIi();
   }

   private void Ililllililil(class_332 w, IlIiillIii hits, String id, IIllIIIllIllIIIl ctx, int x, int mx, int r, int y, int my) {
      long var22 = 6701869481982159589L;
      IIliiIlllIliiIll var10 = llilliilililliil.IIiilIiiiIii();
      String var11 = hits.IliIlllilIi();
      float var12 = this.llIiIlIill.IIIllIIliIIl(id, llilliilililliil.Iliilliiilii((double)y, (double)my, (float)x, (float)mx, (float)r, 36.0F));
      float var13 = (float)(x + r - 8);
      float var14 = (float)mx + 10.0F;
      float var15 = (float)(x + 8);
      float var16 = llilliilililliil.IllIllllIl((float)mx + 7.0F, 11.0F, 1.0F);
      float var10000;
      switch (hits.liiiIIllIl().ordinal()) {
         case 0:
            float var25 = this.llIiIlIill.iliIiiliiiii(IllIllllIl<invokedynamic>(), this.llliIlIill ? 1.0F : 0.0F, 16.0F);
            llilliilililliil.illilIilil(w, (float)x, (float)mx, (float)r, 36.0F, var12 * 0.5F, 0.0F, var25);
            var10000 = llilliilililliil.iIIilIlIil(w, ctx, this.llIiIlIill, IllIllllIl<invokedynamic>(), this.llliIlIill ? IllIllllIl<invokedynamic>() : this.IiIiliIiiiIi(), var13, var14, 16.0F, 44.0F, y, my, var25, this::IlIillIiilIi);
            break;
         case 1:
            byte var34;
            if (var20 instanceof iiIiiilIIliiil var19) {
               var34 = var19.Iilllilliill();
            } else {
               var34 = this.llilIlIill.IliIlllilIi();
            }

            var22 ^= ((long)var34 << 32 ^ var22) & -1L << 32;
            IilliIllilliIl var21 = hits.lIiiIiIlilli();
            Runnable var35;
            if (var21 instanceof iiIiiilIIliiil var20) {
               Objects.requireNonNull(var20);
               var35 = var20::Ililllililil;
            } else {
               llIilIiilIilIi var36 = this.llilIlIill;
               Objects.requireNonNull(var36);
               var35 = var36::Ililllililil;
            }

            Runnable var27 = var35;
            float var30 = this.llIiIlIill.iliIiiliiiii(IllIllllIl<invokedynamic>() + var11, (int)(var22 >>> 32) != 0 ? 1.0F : 0.0F, 16.0F);
            String var32 = IllIllllIl<invokedynamic>() + var11;
            llilliilililliil.illilIilil(w, (float)x, (float)mx, (float)r, 36.0F, var12, this.llIiIlIill.iliIiiliiiii(var32, 0.0F, 10.0F), var30);
            iIiIIlIiIliIIlIi.iliIiiliiiii(w, x + r, mx, 36, 8, (double)var30, (double)var12);
            ctx.iIlIlllllill((float)x, (float)mx, (float)r, 36.0F, () -> {
               this.llIiIlIill.IiIlliIliiIl(var32, 1.0F);
               var27.run();
            }, this.llIiIlIill, id);
            var10000 = var13 - 22.0F;
            break;
         case 2:
            lliliIIiililiIIi var24 = (lliliIIiililiIIi)hits.lIiiIiIlilli();
            llilliilililliil.illilIilil(w, (float)x, (float)mx, (float)r, 36.0F, var12 * 0.5F, 0.0F, 0.0F);
            var10000 = llilliilililliil.IIIillIIil(w, ctx, this.llIiIlIill, IllIllllIl<invokedynamic>() + var11, var24.Iilllilliill(), lIlIIiliIlIIil.IIlilIliiIli(), var13, var14, 16.0F, 66.0F, y, my, 0.0F, () -> {
               long var2 = -4932697488435700124L;
               var2 ^= ((long)var24.IiIiliIiiiIi().size() << 32 ^ var2) & -1L << 32;
               if ((int)(var2 >>> 32) > 0) {
                  var24.Iiilliiliiil((var24.Ililllililil() + 1) % (int)(var2 >>> 32));
               }

            });
            break;
         case 3:
            llilliilililliil.illilIilil(w, (float)x, (float)mx, (float)r, 36.0F, var12 * 0.5F, 0.0F, 0.0F);
            var10000 = this.Iiilliiliiil(w, ctx, (IIIIlilllIIIlill)hits.lIiiIiIlilli(), var11, x, mx, r, var16, y, my);
            break;
         case 4:
         case 5:
            ililliIiIiilliIi var18 = (ililliIiIiilliIi)hits.lIiiIiIlilli();
            llilliilililliil.illilIilil(w, (float)x, (float)mx, (float)r, 36.0F, var12 * 0.5F, 0.0F, 0.0F);
            iIliililIlliilil var10002 = this.llIiIlIill;
            String var10003 = IllIllllIl<invokedynamic>() + var11;
            String var10004 = var18.Iilllilliill();
            boolean var10010 = var18.Iiilliiliiil();
            Objects.requireNonNull(var18);
            var10000 = llilliilililliil.lIilliIill(w, ctx, var10002, var10003, var10004, var13, var14, 16.0F, y, my, var10010, var18::IIlilIliiIli);
            break;
         default:
            throw new MatchException((String)null, (Throwable)null);
      }

      float var17 = var10000;
      float var26 = var17 - 8.0F - var15;
      llilliilililliil.iiIIlIIlIl(var10.Iiilliiliiil(hits.iIlIlllllill(), var26), var15, var16, -920587);
      float var28 = llilliilililliil.IllIllllIl((float)mx + 18.0F, 11.0F, 0.82F);
      if (hits.liiiIIllIl() == lillIIlliillIIll.ilIIlIllll) {
         ililliIiIiilliIi var31 = (ililliIiIiilliIi)hits.lIiiIiIlilli();
         llilliilililliil.IlIIillIIi(w, IIIIIllllIIIIlll.IIIilIIiiIIi(), var10.Iiilliiliiil(var31.IlIillIiilIi(), (var26 - 8.0F) / 0.82F), var15, var28);
      } else if (hits.liiiIIllIl() != lillIIlliillIIll.llIIlIllll && hits.IilliliilIIi() != null) {
         llilliilililliil.lIlIliIlIl(var10.Iiilliiliiil(hits.IilliliilIIi(), var26 / 0.82F), var15, var28, 0.82F, -7630437);
      }

   }

   public void Iilililiiili(double btn, double mx, int my) {
      this.IIliIlIill = null;
   }

   private int Iilllilliill(class_332 ctx, List<IlIiillIii> my, int y, int list, int mx, int x, int w) {
      long var10 = -3857808000032377825L;
      if (my.size() == 1 && ((IlIiillIii)my.get(0)).liiiIIllIl() == lillIIlliillIIll.ilIIlIllll) {
         this.IIillIiliIil(ctx, (IlIiillIii)my.get(0), y, list, mx, x, w);
         return 36;
      } else {
         for(var10 ^= (0L ^ var10) & -1L << 32; (int)(var10 >>> 32) < my.size(); var10 += 4294967296L) {
            var10 ^= ((long)((int)(var10 >>> 32) % 2) ^ var10) & -1L >>> 32;
            this.IIillIiliIil(ctx, (IlIiillIii)my.get((int)(var10 >>> 32)), llilliilililliil.iIiIlIliIl(y, mx, 2, 4, (int)var10), list + (int)(var10 >>> 32) / 2 * 40, llilliilililliil.lliIliliIl(y, mx, 2, 4, (int)var10), x, w);
         }

         var10 ^= ((long)((my.size() + 2 - 1) / 2) << 32 ^ var10) & -1L << 32;
         return (int)(var10 >>> 32) == 0 ? 0 : (int)(var10 >>> 32) * 40 - 4;
      }
   }

   private void IliIlllilIi(int section, lillIIlliillIIll s, String kind, IilliIllilliIl key) {
      if (key != null) {
         this.liiiIIllIl(section, s, kind, key.IliIlllilIi(), key.liiiIIllIl(), key);
      }

   }
}
