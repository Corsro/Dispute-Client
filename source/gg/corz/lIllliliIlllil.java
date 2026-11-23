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
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2828;
import org.joml.Matrix4f;

public class lIllliliIlllil extends ilIllIiIll {
   private static final int llIiIIIliilIiIIIli = -872415232;
   private static final int iiIiIIIliIIliIIIli = -866792193;
   private final iilliIlIIiliIl IIiiIIIlilIiiIIIli = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), -2134445069 * 57 - -53 ^ -1404284574, 0, (((-1978410434 + -23) * -89 << 25 | (-1978410434 + -23) * -89 >>> 7) << 29 | ((-1978410434 + -23) * -89 << 25 | (-1978410434 + -23) * -89 >>> 7) >>> 3) ^ 478135854);
   private static final float liilIIIliiiilIIIli = 0.01F;
   private float iiiiIIIliIIIIlIIli;
   private final iiIiiilIIliiil liliIIIliiiliIIIli = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private long iilIlIIliIIiIlIIli;
   private int lllIlIIliillIlIIli;
   private static final int IlilIIIlillilIIIli = 512;
   private final List<class_243> iIiiIIIliIliiIIIli = new ArrayList();
   private final iiIiiilIIliiil illiIIIliIiliIIIli = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final IiIllliliIllli lliiIIIliiliiIIIli = new IiIllliliIllli();
   private static final int IiIiIIIliliIiIIIli = 861261055;
   private int iIlIlIIliIllIlIIli;
   private float liIIlIIliiiIIlIIli;
   private static final float ililIIIliIiilIIIli = 0.1F;
   private float ilIIlIIliIiIIlIIli;
   private float IIlIlIIlilIlIlIIli;
   private static final float lIliIIIliiIliIIIli = 1.5F;
   private static final long lIilIIIliiIilIIIli = 10000L;
   private final iiIiiilIIliiil IlliIIIlillliIIIli = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private long IilIlIIlililIlIIli;
   private float lIIIlIIliiIIIlIIli;
   private static final int IIIiIIIlilIIiIIIli = -855644672;
   private class_243 IiiiIIIliliiiIIIli;
   private float IlIIlIIlillIIlIIli;
   private static final int iIIiIIIliIlIiIIIli = -855691216;

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) ^ var5) ^ var5) << 8 | (char)((char)((char)((char)(-var4[var5]) ^ var5) ^ var5) ^ var5) >>> 8) ^ 5895) ^ '분') - var5) ^ '풀') + var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void IIiilIiiiIii(illlllIillll event) {
      if (Iiiilllliiilll.field_1724 != null) {
         Matrix4f var2 = iIiiIIilIliiIIil.IIillIiliIil();
         if (this.IlliIIIlillliIIIli.Iilllilliill() && !this.iIiiIIIliIliiIIIli.isEmpty()) {
            this.ilIllIiIll(var2);
         }

         if (this.IiiiIIIliliiiIIIli != null && !lillliliilllil.iIlIlllllill(Iiiilllliiilll.field_1687)) {
            this.liIlliiIll(var2);
         }

      }
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) + 31484) >>> 3 | (char)((char)((char)(var4[var5] - var5) - var5) + 31484) << 13) + var5) + '꣡') + '\ue9cc') ^ var5) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) + 31484) >>> 3 | (char)((char)((char)(var4[var5] - var5) - var5) + 31484) << 13) + var5) + '꣡') + '\ue9cc') ^ var5) >>> 9) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) + 31484) >>> 3 | (char)((char)((char)(var4[var5] - var5) - var5) + 31484) << 13) + var5) + '꣡') + '\ue9cc') ^ var5) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) + 31484) >>> 3 | (char)((char)((char)(var4[var5] - var5) - var5) + 31484) << 13) + var5) + '꣡') + '\ue9cc') ^ var5) >>> 9) >>> 6) ^ var5) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) + 31484) >>> 3 | (char)((char)((char)(var4[var5] - var5) - var5) + 31484) << 13) + var5) + '꣡') + '\ue9cc') ^ var5) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) + 31484) >>> 3 | (char)((char)((char)(var4[var5] - var5) - var5) + 31484) << 13) + var5) + '꣡') + '\ue9cc') ^ var5) >>> 9) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) + 31484) >>> 3 | (char)((char)((char)(var4[var5] - var5) - var5) + 31484) << 13) + var5) + '꣡') + '\ue9cc') ^ var5) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) + 31484) >>> 3 | (char)((char)((char)(var4[var5] - var5) - var5) + 31484) << 13) + var5) + '꣡') + '\ue9cc') ^ var5) >>> 9) >>> 6) ^ var5) << 2) ^ 16178) - 21611) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) + 31484) >>> 3 | (char)((char)((char)(var4[var5] - var5) - var5) + 31484) << 13) + var5) + '꣡') + '\ue9cc') ^ var5) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) + 31484) >>> 3 | (char)((char)((char)(var4[var5] - var5) - var5) + 31484) << 13) + var5) + '꣡') + '\ue9cc') ^ var5) >>> 9) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) + 31484) >>> 3 | (char)((char)((char)(var4[var5] - var5) - var5) + 31484) << 13) + var5) + '꣡') + '\ue9cc') ^ var5) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) + 31484) >>> 3 | (char)((char)((char)(var4[var5] - var5) - var5) + 31484) << 13) + var5) + '꣡') + '\ue9cc') ^ var5) >>> 9) >>> 6) ^ var5) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) + 31484) >>> 3 | (char)((char)((char)(var4[var5] - var5) - var5) + 31484) << 13) + var5) + '꣡') + '\ue9cc') ^ var5) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) + 31484) >>> 3 | (char)((char)((char)(var4[var5] - var5) - var5) + 31484) << 13) + var5) + '꣡') + '\ue9cc') ^ var5) >>> 9) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) + 31484) >>> 3 | (char)((char)((char)(var4[var5] - var5) - var5) + 31484) << 13) + var5) + '꣡') + '\ue9cc') ^ var5) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) + 31484) >>> 3 | (char)((char)((char)(var4[var5] - var5) - var5) + 31484) << 13) + var5) + '꣡') + '\ue9cc') ^ var5) >>> 9) >>> 6) ^ var5) << 2) ^ 16178) - 21611) >>> 13) ^ var5) ^ 26849));
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
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ 'Ꙉ') + 20813) - var5) ^ '쉕') ^ var5))) + var5) - '븖') + var5))) - '킞') - '\uf7af'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) - var5) ^ 2476) + 23480))) << 2 | (char)(~((char)((char)((char)((char)(-var4[var5]) - var5) ^ 2476) + 23480))) >>> 14) - var5))) + '쭅') - 28616) + 18957) + '\ue39f') - var5) - '꾑') << 2 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) - var5) ^ 2476) + 23480))) << 2 | (char)(~((char)((char)((char)((char)(-var4[var5]) - var5) ^ 2476) + 23480))) >>> 14) - var5))) + '쭅') - 28616) + 18957) + '\ue39f') - var5) - '꾑') >>> 14) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void lIIlliIIll() {
      if (this.IiiiIIIliliiiIIIli != null) {
         lillliliilllil.IliIlllilIi(Iiiilllliiilll.field_1687, Iiiilllliiilll.field_1724, this.IiiiIIIliliiiIIIli, this.iiiiIIIliIIIIlIIli, this.lIIIlIIliiIIIlIIli, this.IlIIlIIlillIIlIIli, this.ilIIlIIliIiIIlIIli);
      }
   }

   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      if (Iiiilllliiilll.method_18854() && Iiiilllliiilll.field_1724 != null && this.lliiIIIliiliiIIIli.liiiIIllIl(Iiiilllliiilll.field_1687)) {
         if (!event.lIiiIiIlilli()) {
            if (iiIliillIIlliill.IliIlllilIi(this, event, 730276941449267202L ^ 8493095095405508605L)) {
               ++this.iIlIlIIliIllIlIIli;
               class_2596 var3 = event.lIiilIIIIi;
               if (var3 instanceof class_2828) {
                  class_2828 var2 = (class_2828)var3;
                  if (var2.method_36171()) {
                     this.IlIllllIll(var2);
                  }
               }

            }
         }
      }
   }

   private void IlIllllIll(class_2828 move) {
      ++this.lllIlIIliillIlIIli;
      if (lillIiiiillIii.IliIlllilIi(this.lllIlIIliillIlIIli) && this.iIiiIIIliIliiIIIli.size() < (-1202440203 * 83 + -89 ^ -1018288618)) {
         double var2 = move.method_12269(Iiiilllliiilll.field_1724.method_23317());
         double var4 = move.method_12268(Iiiilllliiilll.field_1724.method_23318());
         double var6 = move.method_12274(Iiiilllliiilll.field_1724.method_23321());
         class_243 var8 = this.iIiiIIIliIliiIIIli.isEmpty() ? null : (class_243)this.iIiiIIIliIliiIIIli.get(this.iIiiIIIliIliiIIIli.size() - 1);
         if (var8 == null || lillIiiiillIii.iIlIlllllill(var8.field_1352, var8.field_1350, var2, var6)) {
            double[] var9 = lillIiiiillIii.liiiIIllIl(this.iIiiIIIliIliiIIIli.size(), move.method_12271(Iiiilllliiilll.field_1724.method_36454()));
            this.iIiiIIIliIliiIIIli.add(new class_243(var2 + var9[0], var4, var6 + var9[1]));
         }
      }
   }

   private void ilIllIiIll(Matrix4f m) {
      for(int var2 = 0; var2 < this.iIiiIIIliIliiIIIli.size(); ++var2) {
         class_243 var3 = (class_243)this.iIiiIIIliIliiIIIli.get(var2);
         if (!iIiiIIilIliiIIil.IlIillIiilIi(var3.field_1352, var3.field_1351, var3.field_1350, 0.5F)) {
            float var4 = iIiiIIilIliiIIil.Ililllililil(var3.field_1352 - (double)0.1F);
            float var5 = iIiiIIilIliiIIil.Ililllililil(var3.field_1352 + (double)0.1F);
            float var6 = iIiiIIilIliiIIil.IIIilIIiiIIi(var3.field_1350 - (double)0.1F);
            float var7 = iIiiIIilIliiIIil.IIIilIIiiIIi(var3.field_1350 + (double)0.1F);
            float var8 = iIiiIIilIliiIIil.Iiilliiliiil(var3.field_1351 + (double)0.01F);
            iIiiIIilIliiIIil.Illillliilli(m, var4, var8, var6, var4, var8, var7, var5, var8, var7, var5, var8, var6, var2 == 0 ? -855644672 : -855691216);
            iIiiIIilIliiIIil.Iliilliiilii(m, var4, var8, var6, var5, var8, var6, -872415232, 1.5F);
            iIiiIIilIliiIIil.Iliilliiilii(m, var5, var8, var6, var5, var8, var7, -872415232, 1.5F);
            iIiiIIilIliiIIil.Iliilliiilii(m, var5, var8, var7, var4, var8, var7, -872415232, 1.5F);
            iIiiIIilIliiIIil.Iliilliiilii(m, var4, var8, var7, var4, var8, var6, -872415232, 1.5F);
         }
      }

   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6283152544797706877L ^ Long.rotateLeft(-1273383922017611631L, 26) ^ 4194877949451350380L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -8514725629766569577L ^ Long.rotateLeft(-8521610260172691517L, 9) ^ 1444011328265224111L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 9218213253767241769L ^ Long.rotateLeft(-5141429355321123643L, 54) ^ 3132804948850071716L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 7494729727829458225L ^ Long.rotateLeft(1655260329717543506L, 32) ^ -1057890676167572262L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1816883241703707126L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -4221149028166797430L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -2316721121568048417L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 607564968222016535L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6027558894171151793L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8661697790484817491L;
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

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ '촞') >>> 3 | (char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ '촞') << 13) + var5) + var5) + 12065) ^ var5) - var5) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ '촞') >>> 3 | (char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ '촞') << 13) + var5) + var5) + 12065) ^ var5) - var5) >>> 11) + var5)))) ^ var5) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public lIllliliIlllil() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.iiIlIIIiIIllIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IlliIIIlillliIIIli, this.illiIIIliIiliIIIli, this.liliIIIliiiliIIIli, this.IIiiIIIlilIiiIIIli});
   }

   protected void Iilililiiili() {
      iiIliillIIlliill.iliIiiliiiii(this);
      lillliliilllil.liiiIIllIl();
      this.iIiiIIIliIliiIIIli.clear();
      this.IiiiIIIliliiiIIIli = null;
      this.iIlIlIIliIllIlIIli = 0;
      this.lllIlIIliillIlIIli = 0;
      this.lliiIIIliiliiIIIli.iIlIlllllill();
   }

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         if (this.lliiIIIliiliiIIIli.liiiIIllIl(Iiiilllliiilll.field_1687) && !Iiiilllliiilll.field_1724.method_29504()) {
            long var1 = IIIiillllIIiilll.iIlIlllllill();
            if (var1 != this.iilIlIIliIIiIlIIli) {
               this.iilIlIIliIIiIlIIli = var1;
               if (!this.liliIIIliiiliIIIli.Iilllilliill()) {
                  this.IIillIiliIil(false);
               } else {
                  iiIliillIIlliill.iliIiiliiiii(this);
                  this.iiiIlIIIll();
               }
            } else if (!lillIiiiillIii.IilliliilIIi(this.liliIIIliiiliIIIli.Iilllilliill(), this.IIiiIIIlilIiiIIIli.Iilllilliill(), this.iIlIlIIliIllIlIIli) && !lillIiiiillIii.lIiiIiIlilli(this.IilIlIIlililIlIIli, IIIiillllIIiilll.IliIlllilIi(), 10000L)) {
               if (!this.illiIIIliIiliIIIli.Iilllilliill()) {
                  lillliliilllil.liiiIIllIl();
               } else if (!lillliliilllil.iIlIlllllill(Iiiilllliiilll.field_1687)) {
                  this.lIIlliIIll();
               }

            } else {
               iiIliillIIlliill.iliIiiliiiii(this);
               this.iiiIlIIIll();
            }
         } else {
            this.IIillIiliIil(false);
         }
      }
   }

   private void iiiIlIIIll() {
      this.iIlIlIIliIllIlIIli = 0;
      this.lllIlIIliillIlIIli = 0;
      this.IilIlIIlililIlIIli = IIIiillllIIiilll.IliIlllilIi();
      this.IiiiIIIliliiiIIIli = Iiiilllliiilll.field_1724.method_73189();
      this.iiiiIIIliIIIIlIIli = Iiiilllliiilll.field_1724.method_36454();
      this.lIIIlIIliiIIIlIIli = Iiiilllliiilll.field_1724.method_36455();
      this.IlIIlIIlillIIlIIli = Iiiilllliiilll.field_1724.method_5791();
      this.ilIIlIIliIiIIlIIli = Iiiilllliiilll.field_1724.method_73188();
      this.liIIlIIliiiIIlIIli = Iiiilllliiilll.field_1724.method_17681();
      this.IIlIlIIlilIlIlIIli = Iiiilllliiilll.field_1724.method_17682();
      this.iIiiIIIliIliiIIIli.clear();
      this.iIiiIIIliIliiIIIli.add(this.IiiiIIIliliiiIIIli);
      if (this.illiIIIliIiliIIIli.Iilllilliill()) {
         this.lIIlliIIll();
      } else {
         lillliliilllil.liiiIIllIl();
      }

   }

   private void liIlliiIll(Matrix4f m) {
      class_243 var2 = this.IiiiIIIliliiiIIIli;
      float var3 = this.liIIlIIliiiIIlIIli / 2.0F;
      if (!iIiiIIilIliiIIil.IlIillIiilIi(var2.field_1352, var2.field_1351 + (double)this.IIlIlIIlilIlIlIIli / (double)2.0F, var2.field_1350, this.IIlIlIIlilIlIlIIli)) {
         float var4 = iIiiIIilIliiIIil.Ililllililil(var2.field_1352 - (double)var3);
         float var5 = iIiiIIilIliiIIil.Iiilliiliiil(var2.field_1351);
         float var6 = iIiiIIilIliiIIil.IIIilIIiiIIi(var2.field_1350 - (double)var3);
         float var7 = iIiiIIilIliiIIil.Ililllililil(var2.field_1352 + (double)var3);
         float var8 = iIiiIIilIliiIIil.Iiilliiliiil(var2.field_1351 + (double)this.IIlIlIIlilIlIlIIli);
         float var9 = iIiiIIilIliiIIil.IIIilIIiiIIi(var2.field_1350 + (double)var3);
         iIiiIIilIliiIIil.IIlilIliiIli(m, var4, var5, var6, var7, var8, var9, 0.33333334F, 0.8F, 1.0F, 0.2F);
         iIiiIIilIliiIIil.iIIIlIlIIl(m, var4, var5, var6, var7, var8, var9, -866792193, 1.5F);
      }
   }

   protected void Illillliilli() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         this.lliiIIIliiliiIIIli.IliIlllilIi(Iiiilllliiilll.field_1687);
         this.iilIlIIliIIiIlIIli = IIIiillllIIiilll.iIlIlllllill();
         this.iiiIlIIIll();
      } else {
         this.IIillIiliIil(false);
      }
   }
}
