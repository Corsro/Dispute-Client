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

public final class IIIiiiillIIiiiil {
   private final llliiiiilliiii lIliilIiil = new llliiiiilliiii();
   private static final float IIIiilIiil = ((float)Math.PI * 2F);
   private long liliilIiil;
   private static final float liililIiil = 2.5F;
   private liIIiilliiIIiill lliiilIiil;
   private long IiliilIiil;
   private IIliiIlllIliiIll IiiiilIiil;
   private final iiIiIliIIliIli IIliilIiil = new iiIiIliIIliIli();
   private long iiliilIiil;
   private static class_2960 llIiilIiil;
   private final iiIiIliIIliIli iiIiilIiil = new iiIiIliIIliIli();
   private boolean IIiiilIiil = true;
   private static final float llililIiil = 10.0F;
   private final llliiiiilliiii illiilIiil = new llliiiiilliiii();
   public static final String llllilIiil = "bloodhound";
   private static final float iIililIiil = 168.0F;
   private static final float IlililIiil = 236.0F;
   private static final long iIIiilIiil = 1800000000L;
   private static final float ilililIiil = 4.0F;
   private int iIiiilIiil;
   private static final float IiililIiil = 6.0F;
   private static final String iillilIiil = "Chunks";
   private int IliiilIiil;
   private float liiiilIiil;
   private static final long lIIiilIiil = 220000000L;
   private static final String[] IlIiilIiil;
   private static final String lillilIiil = "Best";
   private final iiIIlillIIlIlill IiIiilIiil = new iiIIlillIIlIlill();
   private static final String IillilIiil = "Bases";
   private final class_4587 ilIiilIiil = new class_4587();
   private static final int lIililIiil = iilIllIiIIiIllIi.IlIlllIlilIl(0, 316291561 * -55 * -723362913 ^ 1173189248);
   private float iiiiilIiil;
   private boolean lIiiilIiil;
   private float lIIIIiIiil;
   private float IIIIIiIiil;
   private static final String IIililIiil = "...";
   private static final String illlilIiil = "Bloodhound";
   private final llliiiiilliiii iIliilIiil = new llliiiiilliiii();
   private String iliiilIiil = "";
   private final iiIIlIIiIIlIlIIi liIiilIiil = new iiIIlIIiIIlIlIIi();
   private static final float iiililIiil = 0.22F;
   private final llliiiiilliiii llliilIiil = new llliiiiilliiii();
   private final llliiiiilliiii IlliilIiil = new llliiiiilliiii();

   private static class_2960 IiIlliIliiIl() {
      if (llIiilIiil == null) {
         llIiilIiil = lIlIIiliIlIIil.illIlIilIl(Illlllllilll<invokedynamic>());
      }

      return llIiilIiil;
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) << 6 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) >>> 10) ^ '\uf539') ^ '얁') >>> 6 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) << 6 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) >>> 10) ^ '\uf539') ^ '얁') << 10) >>> 3 | (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) << 6 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) >>> 10) ^ '\uf539') ^ '얁') >>> 6 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) << 6 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) >>> 10) ^ '\uf539') ^ '얁') << 10) << 13))) - var5) >>> 8 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) << 6 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) >>> 10) ^ '\uf539') ^ '얁') >>> 6 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) << 6 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) >>> 10) ^ '\uf539') ^ '얁') << 10) >>> 3 | (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) << 6 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) >>> 10) ^ '\uf539') ^ '얁') >>> 6 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) << 6 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) >>> 10) ^ '\uf539') ^ '얁') << 10) << 13))) - var5) << 8) ^ var5) >>> 10 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) << 6 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) >>> 10) ^ '\uf539') ^ '얁') >>> 6 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) << 6 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) >>> 10) ^ '\uf539') ^ '얁') << 10) >>> 3 | (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) << 6 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) >>> 10) ^ '\uf539') ^ '얁') >>> 6 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) << 6 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) >>> 10) ^ '\uf539') ^ '얁') << 10) << 13))) - var5) >>> 8 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) << 6 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) >>> 10) ^ '\uf539') ^ '얁') >>> 6 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) << 6 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) >>> 10) ^ '\uf539') ^ '얁') << 10) >>> 3 | (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) << 6 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) >>> 10) ^ '\uf539') ^ '얁') >>> 6 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) << 6 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) << 13 | (char)((char)((char)((char)(var4[var5] ^ 'ﬣ') >>> 9 | (char)(var4[var5] ^ 'ﬣ') << 7) + var5) + var5) >>> 3))) - var5))) >>> 10) ^ '\uf539') ^ '얁') << 10) << 13))) - var5) << 8) ^ var5) << 6) + 3404));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private int IIIllIIliIIl(long now) {
      int var10000;
      if (this.lliiilIiil == null) {
         var10000 = llliIlIlilliIlIl.Illlllllilll();
      } else {
         switch (this.lliiilIiil) {
            case IIlIiliill -> var10000 = -8393375;
            case lIlIiliill -> var10000 = -1535700;
            case iIlIiliill -> var10000 = -1750963;
            default -> var10000 = llliIlIlilliIlIl.Illlllllilll();
         }
      }

      int var3 = var10000;
      float var4 = this.iiliilIiil == 0L ? 1.0F : llliIlIlilliIlIl.liiiIIllIl((float)(now - this.iiliilIiil) / 2.2E8F);
      if (var4 >= 1.0F) {
         this.iiliilIiil = 0L;
      }

      this.IliiilIiil = var4 >= 1.0F ? var3 : IilIIIIililIIIIi.Illlllllilll(this.iIiiilIiil, var3, (double)llliIlIlilliIlIl.iIlIlllllill(var4));
      return this.IliiilIiil;
   }

   private static float IlIlllIlilIl() {
      long var3 = 5453939424705197172L;
      var3 ^= ((long)IiIiIIliliIiIIli.iIlllIllll() << 32 ^ var3) & -1L << 32;
      float var1 = (int)(var3 >>> 32) > 0 ? (float)((int)(var3 >>> 32)) + 5.0F : 6.0F;
      ilIllIiIll var2 = llilIllililIll.iliIiiliiiii(IIililillIililil.class);
      if (var2 != null && var2.IliIlllilIi() && IiIlIiIiliIlIiIi.Illlllllilll().iIlIlllllill()) {
         var1 += 26.0F * IIililillIililil.iIlIllIllIll(Illlllllilll<invokedynamic>()) + 6.0F;
      }

      return var1;
   }

   private void iIlIlllllill(liIIiilliiIIiill now, String warn, int best, int status, int t, String chunks, long bases) {
      boolean var9 = !this.IIiiilIiil;
      this.iliiilIiil = warn == null ? "" : warn;
      String var10 = chunks == null ? "" : chunks;
      if (this.lIliilIiil.IliIlllilIi((long)var10.hashCode())) {
         this.lIliilIiil.liiiIIllIl(var10, 0.8F, true, false);
         boolean var11 = !var10.isEmpty();
         if (var11 && !this.lIiiilIiil) {
            this.liIiilIiil.IliIlllilIi();
         }

         this.lIiiilIiil = var11;
      }

      if (now != this.lliiilIiil) {
         boolean var12 = this.lliiilIiil == null || this.IIiiilIiil;
         this.iIiiilIiil = this.IliiilIiil;
         this.lliiilIiil = now;
         this.iiliilIiil = var12 ? 0L : bases;
      }

      if (this.IlliilIiil.IliIlllilIi((long)best)) {
         this.IlliilIiil.liiiIIllIl(String.valueOf(Math.max(0, best)), 0.9F, true, var9);
      }

      if (this.llliilIiil.IliIlllilIi((long)Math.max(0, status))) {
         this.llliilIiil.liiiIIllIl(status <= 0 ? Illlllllilll<invokedynamic>() : status + Illlllllilll<invokedynamic>(), 0.9F, true, var9);
      }

      if (this.illiilIiil.IliIlllilIi((long)t)) {
         this.illiilIiil.liiiIIllIl(String.valueOf(Math.max(0, t)), 0.9F, true, var9);
      }

   }

   private void IilliliilIIi(class_332 now, int ctx, float dt, long sw) {
      IIliiIlllIliiIll var6 = llliIlIlilliIlIl.IliIlllilIi();
      if (var6 != this.IiiiilIiil) {
         this.IiiiilIiil = var6;
         this.lIIIIiIiil = llliIlIlilliIlIl.lIliliIlil(Illlllllilll<invokedynamic>(), 0.95F);
         this.liiiilIiil = llliIlIlilliIlIl.lIliliIlil(Illlllllilll<invokedynamic>(), 0.78F);
         this.iiiiilIiil = llliIlIlilliIlIl.lIliliIlil(Illlllllilll<invokedynamic>(), 0.78F);
         this.IIIIIiIiil = llliIlIlilliIlIl.lIliliIlil(Illlllllilll<invokedynamic>(), 0.78F);
         this.IlliilIiil.liiiIIllIl(this.IlliilIiil.lIiillIlIl, 0.9F, true, false);
         this.llliilIiil.liiiIIllIl(this.llliilIiil.lIiillIlIl, 0.9F, true, false);
         this.illiilIiil.liiiIIllIl(this.illiilIiil.lIiillIlIl, 0.9F, true, false);
      }

      if (this.iIliilIiil.IliIlllilIi((long)this.iliiilIiil.hashCode() * 31L + (long)System.identityHashCode(var6))) {
         float var7 = 212.0F;
         this.iIliilIiil.liiiIIllIl(IIlllIlliIll(IiiIliiliiIlii.liiiIIllIl(this.iliiilIiil), var7), 0.9F, false, !this.IIiiilIiil);
      }

      float var32 = 7.0F;
      float var8 = 4.0F;
      float var9 = 15.0F;
      float var10 = var32 + this.liiiilIiil + var8 + this.IlliilIiil.iliillIlIl + 10.0F + this.iiiiilIiil + var8 + this.llliilIiil.iliillIlIl + 10.0F + this.IIIIIiIiil + var8 + this.illiilIiil.iliillIlIl + var32;
      float var11 = Math.max(llliIlIlilliIlIl.lIlIliIlIl(this.lIIIIiIiil, this.lIliilIiil.iliillIlIl), Math.max(var32 + 4.0F + 6.0F + this.iIliilIiil.IliillIlIl + var32, var10));
      float var12 = this.iiIiilIiil.IilliliilIIi(Math.max(168.0F, Math.min(236.0F, (float)Math.ceil((double)var11))), dt, 0.08F);
      float var13 = llliIlIlilliIlIl.IlIlllIlilIl(30.0F + 2.0F * var9 + 5.0F);
      float var14 = ((float)ctx - var12) / 2.0F;
      float var15 = this.IIliilIiil.IliIlllilIi(IIililillIililil.liIIlliiIIll(var14, IlIlllIlilIl(), var12, var13, IlIiilIiil), dt, 0.08F);
      float var16 = IIililillIililil.IiiiIlliiiIl(Illlllllilll<invokedynamic>());
      float var17 = IIililillIililil.iiiiIlIIIIll(Illlllllilll<invokedynamic>());
      iiIliiiIIlliii var18 = IIililillIililil.ilIIllIiIIll(Illlllllilll<invokedynamic>(), var14 + var16, var15 + var17, var12, var13);
      float var19 = llliIlIlilliIlIl.IIIllIIliIIl(var14 + var16);
      float var20 = llliIlIlilliIlIl.IIIllIIliIIl(var15 + var17);
      if (var18 != null) {
         var18.IilliliilIIi(this.ilIiilIiil);
      }

      float var21 = IliiIilliiIi.IilliliilIIi(this.IiIiilIiil.IliIlllilIi());
      boolean var22 = llliIlIlilliIlIl.lIIIiiIIIi(now, var19 + var12 / 2.0F, var20 + var13 / 2.0F, this.IiIiilIiil.liiiIIllIl());

      try {
         llliIlIlilliIlIl.Iiilliiliiil(lIililIiil, var19, var20, var12, var13, 1.0F);
         float var23 = llliIlIlilliIlIl.IllIllllIl(now, var19, var20, var12, IiIlliIliiIl(), Illlllllilll<invokedynamic>(), this.lIliilIiil, this.liIiilIiil, 1.0F);
         float var24 = var19 + var32;
         this.iliIiiliiiii(var24, var23 + llliIlIlilliIlIl.IIIllIIliIIl((var9 - 4.0F) / 2.0F), this.IIIllIIliIIl(sw), sw);
         llliIlIlilliIlIl.lliililiil(this.iIliilIiil, var24 + 4.0F + 6.0F, llliIlIlilliIlIl.illilIilil(var23, var9, 0.9F), 0.9F, llliIlIlilliIlIl.liIlIlIiIl);
         float var25 = var23 + var9;
         float var26 = llliIlIlilliIlIl.illilIilil(var25, var9, 0.78F);
         float var27 = llliIlIlilliIlIl.illilIilil(var25, var9, 0.9F);
         float var28 = lIiiIiIlilli(Illlllllilll<invokedynamic>(), this.liiiilIiil, this.IlliilIiil, var24, var26, var27) + 10.0F;
         var28 = lIiiIiIlilli(Illlllllilll<invokedynamic>(), this.iiiiilIiil, this.llliilIiil, var28, var26, var27) + 10.0F;
         lIiiIiIlilli(Illlllllilll<invokedynamic>(), this.IIIIIiIiil, this.illiilIiil, var28, var26, var27);
      } finally {
         llliIlIlilliIlIl.IlIIillIIi(now, var22);
         IliiIilliiIi.lIiiIiIlilli(var21);
         if (var18 != null) {
            this.ilIiilIiil.method_22909();
         }

      }

   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) + var5) - '\uf484') + 26984) - var5) - 30532) + 8796) + var5))) << 11 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) + var5) - '\uf484') + 26984) - var5) - 30532) + 8796) + var5))) >>> 5) + 5742))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IliIlllilIi() {
      this.IiliilIiil += 2L;
      this.IIiiilIiil = true;
      this.liliilIiil = 0L;
      this.iiliilIiil = 0L;
      this.lIiiilIiil = false;
      this.lliiilIiil = null;
      this.iiIiilIiil.iIlIlllllill();
      this.IIliilIiil.iIlIlllllill();
   }

   private static String IIlllIlliIll(String s, float avail) {
      if (s != null && !s.isEmpty()) {
         if (llliIlIlilliIlIl.lIliliIlil(s, 0.9F) <= avail) {
            return s;
         } else {
            int var2 = 0;
            int var3 = s.length();

            while(var2 < var3) {
               int var4 = var2 + var3 + 1 >>> 1;
               if (llliIlIlilliIlIl.lIliliIlil(s.substring(0, var4) + Illlllllilll<invokedynamic>(), 0.9F) <= avail) {
                  var2 = var4;
               } else {
                  var3 = var4 - 1;
               }
            }

            return s.substring(0, var2).stripTrailing() + Illlllllilll<invokedynamic>();
         }
      } else {
         return "";
      }
   }

   static {
      String[] var10000 = new String[((1707144509 << 3 | 1707144509 >>> 29) * -67 >>> 15 | (1707144509 << 3 | 1707144509 >>> 29) * -67 << 17) ^ 251652091];
      var10000[0] = Illlllllilll<invokedynamic>();
      var10000[1] = Illlllllilll<invokedynamic>();
      var10000[2] = Illlllllilll<invokedynamic>();
      var10000[3] = Illlllllilll<invokedynamic>();
      var10000[4] = Illlllllilll<invokedynamic>();
      var10000[5] = Illlllllilll<invokedynamic>();
      IlIiilIiil = var10000;
   }

   private void iliIiiliiiii(float y, float argb, int x, long now) {
      float var6 = llliIlIlilliIlIl.IIIllIIliIIl(y);
      float var7 = llliIlIlilliIlIl.IIIllIIliIIl(argb);
      float var8 = 0.5F + 0.5F * (float)Math.cos((double)((float)(now % 1800000000L) * 3.4906587E-9F));
      llliIlIlilliIlIl.Ililllililil(var6, var7, 4.0F, 4.0F, 2.0F, llliIlIlilliIlIl.iliIiiliiiii(x, 0.22F * (0.35F + 0.65F * var8)), 2.5F, true);
      llliIlIlilliIlIl.IIillIiliIil(var6, var7, 4.0F, 4.0F, 2.0F, 0.0F, x);
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 27704) ^ '\uee43') + var5) << 11 | (char)((char)((char)((char)(var4[var5] ^ var5) + 27704) ^ '\uee43') + var5) >>> 5) ^ 14861) ^ '뢍') + 18810) ^ var5) - var5) ^ var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1738000035866286805L ^ Long.rotateLeft(4324553773584118807L, 10) ^ 5049839993720314926L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5351151767870590529L ^ Long.rotateLeft(7511557317228951071L, 7) ^ 1954675679230560541L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6817666853843097158L ^ Long.rotateLeft(8963737385660444388L, 30) ^ 3906182013686864677L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 8199282546126481197L ^ Long.rotateLeft(-7038985152368853632L, 30) ^ 2950895497481378659L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 5477931937614856345L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -5565979857562957483L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4467310171276364350L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -640376292848601075L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -3047287058959241599L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2445567895457491009L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iilllilliill<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIillIiliIil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Ililllililil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Iiilliiliiil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIIilIIiiIIi<invokedynamic>());
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

   public void liiiIIllIl(class_332 status, liIIiilliiIIiill bases, String best, int chunks, int warn, int t, String ctx) {
      class_310 var8 = class_310.method_1551();
      if (status != null && var8.field_1724 != null) {
         CorzClient.fontManager.iIlIlllllill(this.ilIiilIiil);
         IIIiiIillIIiiIil.IliIlllilIi(this.ilIiilIiil);
         double var9 = (double)var8.method_22683().method_4495();
         int var11 = var8.method_22683().method_4476(IIililillIililil.iiiIlIIIll(var8), var8.method_1573());
         float var12 = (float)((double)var11 / var9);
         boolean var13 = Math.abs(var12 - 1.0F) > 1.0E-4F;
         int var14 = var13 ? Math.round((float)var8.method_22683().method_4486() / var12) : var8.method_22683().method_4486();
         if (var13) {
            IliiIilliiIi.lIIlllIIliIIlllIIl = (float)var14;
            IliiIilliiIi.IlIlllIIlllIlllIIl = (float)Math.round((float)var8.method_22683().method_4502() / var12);
         }

         try {
            float var15 = IIililillIililil.ilIllIiIll();
            if (!(var15 < 0.004F)) {
               long var16 = System.nanoTime();
               float var18 = this.liliilIiil == 0L ? 0.016F : Math.min(0.05F, (float)(var16 - this.liliilIiil) / 1.0E9F);
               this.liliilIiil = var16;
               this.iIlIlllllill(bases, best, chunks, warn, t, ctx, var16);
               if (!this.IiIiilIiil.IilliliilIIi(true, ++this.IiliilIiil)) {
                  return;
               }

               float var19 = IliiIilliiIi.IilliliilIIi(var15);

               try {
                  this.IilliliilIIi(status, var14, var18, var16);
               } finally {
                  IliiIilliiIi.lIiiIiIlilli(var19);
               }

               this.IIiiilIiil = false;
               return;
            }
         } finally {
            if (var13) {
               IliiIilliiIi.lIIlllIIliIIlllIIl = 0.0F;
               IliiIilliiIi.IlIlllIIlllIlllIIl = 0.0F;
            }

         }

      }
   }

   private static float lIiiIiIlilli(String labelW, float ly, llliiiiilliiii label, float x, float v, float vy) {
      llliIlIlilliIlIl.lililiilil(labelW, x, v, 0.78F, llliIlIlilliIlIl.iiIlIlIiIl);
      float var6 = x + ly + 4.0F + label.iliillIlIl;
      llliIlIlilliIlIl.iIiilIliil(label, var6, vy, 0.9F, llliIlIlilliIlIl.liIlIlIiIl);
      return var6;
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) + 16342) << 2 | (char)((char)((char)(var4[var5] + var5) + var5) + 16342) >>> 14) ^ 3824))) - '詺') + 4275) - var5) >>> 15 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) + 16342) << 2 | (char)((char)((char)(var4[var5] + var5) + var5) + 16342) >>> 14) ^ 3824))) - '詺') + 4275) - var5) << 1) + '\ue151') >>> 10 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) + 16342) << 2 | (char)((char)((char)(var4[var5] + var5) + var5) + 16342) >>> 14) ^ 3824))) - '詺') + 4275) - var5) >>> 15 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) + 16342) << 2 | (char)((char)((char)(var4[var5] + var5) + var5) + 16342) >>> 14) ^ 3824))) - '詺') + 4275) - var5) << 1) + '\ue151') << 6));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)(var4[var5] - var5)))))) ^ '\uf08b') ^ '钛'))) ^ 12452) << 1 | (char)((char)(-((char)((char)((char)((char)(-((char)(~((char)(var4[var5] - var5)))))) ^ '\uf08b') ^ '钛'))) ^ 12452) >>> 15) ^ 1778) ^ var5))) >>> 1 | (char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)(var4[var5] - var5)))))) ^ '\uf08b') ^ '钛'))) ^ 12452) << 1 | (char)((char)(-((char)((char)((char)((char)(-((char)(~((char)(var4[var5] - var5)))))) ^ '\uf08b') ^ '钛'))) ^ 12452) >>> 15) ^ 1778) ^ var5))) << 15) << 8 | (char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)(var4[var5] - var5)))))) ^ '\uf08b') ^ '钛'))) ^ 12452) << 1 | (char)((char)(-((char)((char)((char)((char)(-((char)(~((char)(var4[var5] - var5)))))) ^ '\uf08b') ^ '钛'))) ^ 12452) >>> 15) ^ 1778) ^ var5))) >>> 1 | (char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)(var4[var5] - var5)))))) ^ '\uf08b') ^ '钛'))) ^ 12452) << 1 | (char)((char)(-((char)((char)((char)((char)(-((char)(~((char)(var4[var5] - var5)))))) ^ '\uf08b') ^ '钛'))) ^ 12452) >>> 15) ^ 1778) ^ var5))) << 15) >>> 8) - var5))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
