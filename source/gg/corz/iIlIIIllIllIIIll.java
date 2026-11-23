package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class iIlIIIllIllIIIll {
   private boolean IiiiliIlll;
   private final IIiliIlllIiliIll IliiliIlll;
   private lIIiIIIiiIIiIIIi lliiliIlll;
   private String iliiliIlll;
   private IIIIliilIIIlii liiiliIlll;

   public boolean Ililllililil() {
      return this.lliiliIlll != null;
   }

   public iIlIIIllIllIIIll(IIiliIlllIiliIll transport) {
      this.iliiliIlll = "";
      this.IliiliIlll = transport;
   }

   public boolean lIiiIiIlilli(llIillIlilIillIl ctx, boolean host) {
      return this.lliiliIlll != null && this.lliiliIlll.Iillllilll(ctx, host);
   }

   public boolean Iilllilliill() {
      return this.lliiliIlll != null && this.lliiliIlll.IiiIlliiIl();
   }

   public boolean IlIillIiilIi(int z, int y, int x) {
      return this.lliiliIlll == null || this.lliiliIlll.iIIilIlIil(z, y, x);
   }

   // $FF: synthetic method
   private static CallSite IllIllllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - 23379) + var5) + 28314) ^ var5) + 'ꢽ') - var5))) ^ 4248) >>> 14 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - 23379) + var5) + 28314) ^ var5) + 'ꢽ') - var5))) ^ 4248) << 2) - '꧋'))) << 9 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - 23379) + var5) + 28314) ^ var5) + 'ꢽ') - var5))) ^ 4248) >>> 14 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - 23379) + var5) + 28314) ^ var5) + 'ꢽ') - var5))) ^ 4248) << 2) - '꧋'))) >>> 7) << 15 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - 23379) + var5) + 28314) ^ var5) + 'ꢽ') - var5))) ^ 4248) >>> 14 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - 23379) + var5) + 28314) ^ var5) + 'ꢽ') - var5))) ^ 4248) << 2) - '꧋'))) << 9 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - 23379) + var5) + 28314) ^ var5) + 'ꢽ') - var5))) ^ 4248) >>> 14 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - 23379) + var5) + 28314) ^ var5) + 'ꢽ') - var5))) ^ 4248) << 2) - '꧋'))) >>> 7) >>> 1))) + '\udb04'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IiIlliIliiIl(llIillIlilIillIl ctx) {
      if (this.lliiliIlll != null) {
         if (this.IIIIllIIIl(ctx)) {
            ctx.IllIllllIl(llIIlilIIl<invokedynamic>());
            this.iIlIlllllill();
         } else {
            this.iIIIlIlIIl(ctx);
            this.lliiliIlll.IIIllIIliIIl(ctx);
            if (this.lliiliIlll.Ilillllill()) {
               this.iliiliIlll = this.lliiliIlll.liilliiill();
               this.IiiiliIlll = true;
               this.liiiliIlll = this.lliiliIlll.liiiIIllIl();
               this.lliiliIlll = null;
            }

         }
      }
   }

   private void iIIIlIlIIl(llIillIlilIillIl ctx) {
      if (this.lliiliIlll != null && this.lliiliIlll.iiiIlIIIll()) {
         llIIliIiilIIliIi var2 = ctx.Ililllililil();
         if (var2 != null && var2.IliIlllilIi()) {
            if (this.lliiliIlll.lIIlliIIll() == null || !this.lliiliIlll.lIIlliIIll().liiiIIllIl(var2)) {
               this.lliiliIlll.lIilliIill();
            }
         }
      }
   }

   public boolean Iilililiiili(int staleMs, int z, int y, long x) {
      return this.lliiliIlll != null && this.lliiliIlll.Illillllil(staleMs, z, y, x);
   }

   public boolean Iliilliiilii() {
      return this.lliiliIlll != null && this.lliiliIlll.lililiilil();
   }

   public void IliIlllilIi(llIillIlilIillIl ctx) {
      this.iIlIlllllill();
      this.Illlllllilll();
      this.lliiliIlll = new lIIiIIIiiIIiIIIi(ctx, true, this.IliiliIlll);
      this.lliiliIlll.lIiiIiIlilli();
   }

   // $FF: synthetic method
   private static CallSite iiIIlIIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 22060) >>> 3 | (char)(var4[var5] - 22060) << 13) - 'ꐲ') << 11 | (char)((char)((char)(var4[var5] - 22060) >>> 3 | (char)(var4[var5] - 22060) << 13) - 'ꐲ') >>> 5) - var5) - '隉') + 19540))) << 1 | (char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 22060) >>> 3 | (char)(var4[var5] - 22060) << 13) - 'ꐲ') << 11 | (char)((char)((char)(var4[var5] - 22060) >>> 3 | (char)(var4[var5] - 22060) << 13) - 'ꐲ') >>> 5) - var5) - '隉') + 19540))) >>> 15) - 1377) - var5))) >>> 10 | (char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 22060) >>> 3 | (char)(var4[var5] - 22060) << 13) - 'ꐲ') << 11 | (char)((char)((char)(var4[var5] - 22060) >>> 3 | (char)(var4[var5] - 22060) << 13) - 'ꐲ') >>> 5) - var5) - '隉') + 19540))) << 1 | (char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 22060) >>> 3 | (char)(var4[var5] - 22060) << 13) - 'ꐲ') << 11 | (char)((char)((char)(var4[var5] - 22060) >>> 3 | (char)(var4[var5] - 22060) << 13) - 'ꐲ') >>> 5) - var5) - '隉') + 19540))) >>> 15) - 1377) - var5))) << 6) - var5) + var5) ^ var5))) - 'ꖵ') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -7475488790815226408L ^ Long.rotateLeft(3288147846186991905L, 2) ^ 504166248241118995L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -4324492795851466011L ^ Long.rotateLeft(-971928130208059626L, 2) ^ -127353941815616996L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 4076041890286870314L ^ Long.rotateLeft(3411231222071289705L, 19) ^ -8514607736629305018L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8965719082850389874L ^ Long.rotateLeft(6483633615915807340L, 49) ^ 8067425124225788044L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1240671024030283458L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 91394370419404964L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2224933382034281545L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7379505923986704032L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8881098761379358229L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 226897076566171386L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IiIIlliIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iiIIlIIlIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, lIlIliIlIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IllIllllIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(illIlIilIl<invokedynamic>());
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

   public void IIlilIliiIli(String reason) {
      if (this.lliiliIlll != null) {
         this.lliiliIlll.IiIilliIil(reason);
      }

   }

   public lIIiIIIiiIIiIIIi Iiilliiliiil() {
      return this.lliiliIlll;
   }

   public boolean IlIlllIlilIl() {
      return this.lliiliIlll != null && this.lliiliIlll.iilllIIill();
   }

   // $FF: synthetic method
   private static CallSite lIlIliIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 7 | var4[var5] << 9))) - 2699) >>> 4 | (char)((char)(-((char)(var4[var5] >>> 7 | var4[var5] << 9))) - 2699) << 12) + var5) << 12 | (char)((char)((char)((char)(-((char)(var4[var5] >>> 7 | var4[var5] << 9))) - 2699) >>> 4 | (char)((char)(-((char)(var4[var5] >>> 7 | var4[var5] << 9))) - 2699) << 12) + var5) >>> 4))) ^ 4548) ^ var5) + 'ꑩ') ^ var5) + 21775) + 31756) ^ var5) + var5))) >>> 9 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 7 | var4[var5] << 9))) - 2699) >>> 4 | (char)((char)(-((char)(var4[var5] >>> 7 | var4[var5] << 9))) - 2699) << 12) + var5) << 12 | (char)((char)((char)((char)(-((char)(var4[var5] >>> 7 | var4[var5] << 9))) - 2699) >>> 4 | (char)((char)(-((char)(var4[var5] >>> 7 | var4[var5] << 9))) - 2699) << 12) + var5) >>> 4))) ^ 4548) ^ var5) + 'ꑩ') ^ var5) + 21775) + 31756) ^ var5) + var5))) << 7));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IIlllIlliIll(llIillIlilIillIl ctx) {
      if (!this.IiiiliIlll) {
         return false;
      } else {
         if (this.liiiliIlll != null && ctx != null && ctx.IliIlllilIi()) {
            IIIIliilIIIlii var2 = ctx.IIillIiliIil();
            if (var2 != null && !this.liiiliIlll.iIlIlllllill(var2)) {
               this.Illlllllilll();
               return false;
            }
         }

         return true;
      }
   }

   public String Illillliilli(int z, int x, int y) {
      return this.lliiliIlll == null ? null : this.lliiliIlll.iiIilIIlil(z, x, y);
   }

   public IIIIliilIIIlii IIIilIIiiIIi() {
      return this.lliiliIlll == null ? null : this.lliiliIlll.liiiIIllIl();
   }

   // $FF: synthetic method
   private static CallSite IiIIlliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') << 3 | (char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') >>> 13) >>> 7 | (char)((char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') << 3 | (char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') >>> 13) << 9) >>> 13 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') << 3 | (char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') >>> 13) >>> 7 | (char)((char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') << 3 | (char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') >>> 13) << 9) << 3) << 4 | (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') << 3 | (char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') >>> 13) >>> 7 | (char)((char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') << 3 | (char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') >>> 13) << 9) >>> 13 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') << 3 | (char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') >>> 13) >>> 7 | (char)((char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') << 3 | (char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') >>> 13) << 9) << 3) >>> 12) + var5) + var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') << 3 | (char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') >>> 13) >>> 7 | (char)((char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') << 3 | (char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') >>> 13) << 9) >>> 13 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') << 3 | (char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') >>> 13) >>> 7 | (char)((char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') << 3 | (char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') >>> 13) << 9) << 3) << 4 | (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') << 3 | (char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') >>> 13) >>> 7 | (char)((char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') << 3 | (char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') >>> 13) << 9) >>> 13 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') << 3 | (char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') >>> 13) >>> 7 | (char)((char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') << 3 | (char)((char)((char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) >>> 14 | (char)(~((char)((char)(-((char)(-var4[var5]))) - var5))) << 2) ^ '鍰') >>> 13) << 9) << 3) >>> 12) + var5) + var5) << 13) ^ var5) + 31079) + 8882) + '꧅') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IilliliilIIi() {
      return this.iliiliIlll;
   }

   public void IiIiliIiiiIi(int z, int x, int y) {
      if (this.lliiliIlll != null) {
         this.lliiliIlll.llIililIil(z, x, y);
      }

   }

   public void iIlIlllllill() {
      if (this.lliiliIlll != null) {
         this.iliiliIlll = this.lliiliIlll.liilliiill();

         try {
            this.lliiliIlll.iliIiiliiiii();
         } catch (Exception var2) {
         }

         this.lliiliIlll = null;
      }

   }

   public boolean IIIllIIliIIl() {
      return this.lliiliIlll != null && this.lliiliIlll.iiiIlIIIll();
   }

   public iIlIIIllIllIIIll() {
      this(new iIiliIllIliliIll());
   }

   public void Illlllllilll() {
      this.IiiiliIlll = false;
      this.liiiliIlll = null;
   }

   private boolean IIIIllIIIl(llIillIlilIillIl ctx) {
      if (!ctx.IliIlllilIi()) {
         return true;
      } else {
         IIIIliilIIIlii var2 = this.lliiliIlll.liiiIIllIl();
         return var2 != null && !var2.iIlIlllllill(ctx.IIillIiliIil());
      }
   }

   public Set<Long> Iiiiliiiiiii() {
      return this.lliiliIlll == null ? Collections.emptySet() : this.lliiliIlll.IIiillIiil();
   }

   // $FF: synthetic method
   private static CallSite illIlIilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] + var5) >>> 3 | (char)(var4[var5] + var5) << 13) + var5) + var5))))) - var5) << 11 | (char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] + var5) >>> 3 | (char)(var4[var5] + var5) << 13) + var5) + var5))))) - var5) >>> 5))) - var5) >>> 8 | (char)((char)(~((char)((char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] + var5) >>> 3 | (char)(var4[var5] + var5) << 13) + var5) + var5))))) - var5) << 11 | (char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] + var5) >>> 3 | (char)(var4[var5] + var5) << 13) + var5) + var5))))) - var5) >>> 5))) - var5) << 8) + 18293));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean iliIiiliiiii() {
      return this.lliiliIlll != null && this.lliiliIlll.IlIllllIll();
   }

   public boolean IIiilIiiiIii() {
      return this.lliiliIlll != null && this.lliiliIlll.illilIilil();
   }

   public boolean IIillIiliIil() {
      return this.lliiliIlll != null && this.lliiliIlll.lliIliliIl();
   }

   public void liiiIIllIl(llIillIlilIillIl ctx) {
      this.iIlIlllllill();
      this.Illlllllilll();
      this.lliiliIlll = new lIIiIIIiiIIiIIIi(ctx, false, this.IliiliIlll);
      this.lliiliIlll.lIiiIiIlilli();
   }
}
