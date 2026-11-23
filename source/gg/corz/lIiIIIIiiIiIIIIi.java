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

public class lIiIIIIiiIiIIIIi extends ilIllIiIll {
   private final iiIiiilIIliiil IIiiiiIiil;
   private double lliiiiIiil;
   private final lIilliiiIillii lIiiiiIiil;
   private final lliliIIiililiIIi iiliiiIiil;
   private static final int IiliiiIiil = 60;
   private final boolean[] iIiiiiIiil;
   private int iliiiiIiil;
   private int IliiiiIiil;
   private final IIIIlilllIIIlill liliiiIiil = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0.6, 0.05, (double)1.0F, 0.05);
   private int IiiiiiIiil;
   private static final int illiiiIiil = 4;

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 7934) >>> 8 | (char)(var4[var5] ^ 7934) << 8) >>> 15 | (char)((char)(var4[var5] ^ 7934) >>> 8 | (char)(var4[var5] ^ 7934) << 8) << 1) >>> 11 | (char)((char)((char)(var4[var5] ^ 7934) >>> 8 | (char)(var4[var5] ^ 7934) << 8) >>> 15 | (char)((char)(var4[var5] ^ 7934) >>> 8 | (char)(var4[var5] ^ 7934) << 8) << 1) << 5) - var5) - var5) - var5))) + var5))) ^ var5) << 12 | (char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 7934) >>> 8 | (char)(var4[var5] ^ 7934) << 8) >>> 15 | (char)((char)(var4[var5] ^ 7934) >>> 8 | (char)(var4[var5] ^ 7934) << 8) << 1) >>> 11 | (char)((char)((char)(var4[var5] ^ 7934) >>> 8 | (char)(var4[var5] ^ 7934) << 8) >>> 15 | (char)((char)(var4[var5] ^ 7934) >>> 8 | (char)(var4[var5] ^ 7934) << 8) << 1) << 5) - var5) - var5) - var5))) + var5))) ^ var5) >>> 4))) + var5) << 12 | (char)((char)(-((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 7934) >>> 8 | (char)(var4[var5] ^ 7934) << 8) >>> 15 | (char)((char)(var4[var5] ^ 7934) >>> 8 | (char)(var4[var5] ^ 7934) << 8) << 1) >>> 11 | (char)((char)((char)(var4[var5] ^ 7934) >>> 8 | (char)(var4[var5] ^ 7934) << 8) >>> 15 | (char)((char)(var4[var5] ^ 7934) >>> 8 | (char)(var4[var5] ^ 7934) << 8) << 1) << 5) - var5) - var5) - var5))) + var5))) ^ var5) << 12 | (char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 7934) >>> 8 | (char)(var4[var5] ^ 7934) << 8) >>> 15 | (char)((char)(var4[var5] ^ 7934) >>> 8 | (char)(var4[var5] ^ 7934) << 8) << 1) >>> 11 | (char)((char)((char)(var4[var5] ^ 7934) >>> 8 | (char)(var4[var5] ^ 7934) << 8) >>> 15 | (char)((char)(var4[var5] ^ 7934) >>> 8 | (char)(var4[var5] ^ 7934) << 8) << 1) << 5) - var5) - var5) - var5))) + var5))) ^ var5) >>> 4))) + var5) >>> 4) + var5) + var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4908342853114333693L ^ Long.rotateLeft(-6562782471536560651L, 44) ^ 2132150772918370554L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -6771830740059385415L ^ Long.rotateLeft(702241309827041062L, 27) ^ 7317459099574562347L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6417662763415950637L ^ Long.rotateLeft(8964065382942044111L, 46) ^ -578284265917530106L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 151083882754916778L ^ Long.rotateLeft(5131957169551450085L, 41) ^ 4659169332258050441L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -9037767663625379527L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 246977605735043285L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4099080391964675890L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7070027441157072284L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -4961772337277979152L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 3715164769917110181L;
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

   protected void Illillliilli() {
      this.IliiiiIiil = this.lIIlliIIll();
      this.lliiiiIiil = this.liliiiIiil.Iilllilliill();
      this.iliiiiIiil = -1;
      Arrays.fill(this.iIiiiiIiil, false);
      this.lIiiiiIiil.IliIlllilIi(this.IliiiiIiil);
   }

   public lIiIIIIiiIiIIIIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.iiliiiIiil = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IiIlIlilliIlIlil.iillIIiIil);
      this.IIiiiiIiil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
      this.lIiiiiIiil = new lIilliiiIillii();
      this.iIiiiiIiil = new boolean[349];
      this.IliiiiIiil = -1;
      this.lliiiiIiil = (double)-1.0F;
      this.iliiiiIiil = -1;
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.liliiiIiil, this.iiliiiIiil, this.IIiiiiIiil});
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(var4[var5] ^ '荞') + 'ꯨ'))))) ^ var5) + var5) << 11 | (char)((char)((char)(~((char)(~((char)((char)(var4[var5] ^ '荞') + 'ꯨ'))))) ^ var5) + var5) >>> 5) - var5) >>> 4 | (char)((char)((char)((char)((char)(~((char)(~((char)((char)(var4[var5] ^ '荞') + 'ꯨ'))))) ^ var5) + var5) << 11 | (char)((char)((char)(~((char)(~((char)((char)(var4[var5] ^ '荞') + 'ꯨ'))))) ^ var5) + var5) >>> 5) - var5) << 12) << 14 | (char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(var4[var5] ^ '荞') + 'ꯨ'))))) ^ var5) + var5) << 11 | (char)((char)((char)(~((char)(~((char)((char)(var4[var5] ^ '荞') + 'ꯨ'))))) ^ var5) + var5) >>> 5) - var5) >>> 4 | (char)((char)((char)((char)((char)(~((char)(~((char)((char)(var4[var5] ^ '荞') + 'ꯨ'))))) ^ var5) + var5) << 11 | (char)((char)((char)(~((char)(~((char)((char)(var4[var5] ^ '荞') + 'ꯨ'))))) ^ var5) + var5) >>> 5) - var5) << 12) >>> 2) - var5) + '쏊') ^ var5) ^ '\ue3b9'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static void iiiIlIIIll() {
      try {
         ilIllIiIll var1 = llilIllililIll.iliIiiliiiii(lIiIIIIiiIiIIIIi.class);
         if (var1 instanceof lIiIIIIiiIiIIIIi var0) {
            var0.lIiiiiIiil.lIiiIiIlilli();
         }
      } catch (Throwable var2) {
      }

   }

   protected void iIIIlIlIIl() {
      int var1 = this.lIIlliIIll();
      if (var1 != this.IliiiiIiil) {
         this.IliiiiIiil = var1;
         this.lIiiiiIiil.IliIlllilIi(var1);
         this.iliiiiIiil = 4;
         this.IiiiiiIiil = 0;
      }

      if (this.liliiiIiil.Iilllilliill() != this.lliiiiIiil) {
         this.lliiiiIiil = this.liliiiIiil.Iilllilliill();
         this.iliiiiIiil = 4;
         this.IiiiiiIiil = 0;
      }

      this.lIiiiiIiil.iIlIlllllill();
      if (this.iliiiiIiil >= 0) {
         if (this.iliiiiIiil > 0) {
            --this.iliiiiIiil;
         } else {
            if (this.lIiiiiIiil.liiiIIllIl(var1)) {
               this.lIiiiiIiil.IilliliilIIi(30, false, (float)this.liliiiIiil.Iilllilliill());
               this.iliiiiIiil = -1;
            } else if (++this.IiiiiiIiil > 60) {
               this.iliiiiIiil = -1;
            }

         }
      }
   }

   private int lIIlliIIll() {
      return IiIlIlilliIlIlil.IliIlllilIi(this.iiliiiIiil.Iilllilliill());
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) << 1 | (char)((char)(var4[var5] + var5) + var5) >>> 15) + 'ꦛ') + var5))) - var5))) - '舿') << 6 | (char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) << 1 | (char)((char)(var4[var5] + var5) + var5) >>> 15) + 'ꦛ') + var5))) - var5))) - '舿') >>> 10) ^ '赊') - var5));
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
         var4[var5] = (char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) + var5) ^ var5) + 29445))) ^ '魅') >>> 4 | (char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) + var5) ^ var5) + 29445))) ^ '魅') << 12) ^ '\ue9c7') - var5) ^ var5))))) + var5) + var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void Iilililiiili() {
      this.lIiiiiIiil.lIiiIiIlilli();
      this.iliiiiIiil = -1;
      Arrays.fill(this.iIiiiiIiil, false);
   }

   protected void lilIliilIl(IiiIlllliiIlll event) {
      long var6 = -6285610644737281997L;
      long var8 = 8730186005714881991L;
      var6 ^= ((long)event.IliIlllilIi() << 32 ^ var6) & -1L << 32;
      var6 ^= ((long)event.liiiIIllIl() ^ var6) & -1L >>> 32;
      var8 ^= ((long)((int)(var6 >>> 32) >= 0 && (int)(var6 >>> 32) < this.iIiiiiIiil.length ? 1 : 0) << 32 ^ var8) & -1L << 32;
      if ((int)var6 == 0) {
         if ((int)(var8 >>> 32) != 0 && this.iIiiiiIiil[(int)(var6 >>> 32)]) {
            this.iIiiiiIiil[(int)(var6 >>> 32)] = false;
            this.lIiiiiIiil.IilliliilIIi(illiilIiliil.iliIiiliiiii((int)(var6 >>> 32)), true, (float)this.liliiiIiil.Iilllilliill());
         }

      } else if ((int)var6 == (-492809068 * -33 ^ -917169939)) {
         if ((int)(var8 >>> 32) == 0 || !this.iIiiiiIiil[(int)(var6 >>> 32)]) {
            if (Iiiilllliiilll.field_1755 != null || this.IIiiiiIiil.Iilllilliill()) {
               var8 ^= ((long)this.lIIlliIIll() ^ var8) & -1L >>> 32;
               if ((int)var8 != this.IliiiiIiil) {
                  this.IliiiiIiil = (int)var8;
                  this.lIiiiiIiil.IliIlllilIi((int)var8);
               }

               if ((int)(var8 >>> 32) != 0) {
                  this.iIiiiiIiil[(int)(var6 >>> 32)] = true;
               }

               this.lIiiiiIiil.IilliliilIIi(illiilIiliil.iliIiiliiiii((int)(var6 >>> 32)), false, (float)this.liliiiIiil.Iilllilliill());
            }
         }
      }
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 5 | (char)((char)(var4[var5] + var5) - var5) >>> 11) + var5) + var5) ^ 9661) ^ var5))) - var5) << 9 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 5 | (char)((char)(var4[var5] + var5) - var5) >>> 11) + var5) + var5) ^ 9661) ^ var5))) - var5) >>> 7) + 'ﭚ') << 1 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 5 | (char)((char)(var4[var5] + var5) - var5) >>> 11) + var5) + var5) ^ 9661) ^ var5))) - var5) << 9 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 5 | (char)((char)(var4[var5] + var5) - var5) >>> 11) + var5) + var5) ^ 9661) ^ var5))) - var5) >>> 7) + 'ﭚ') >>> 15) + '\uee9f') >>> 11 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 5 | (char)((char)(var4[var5] + var5) - var5) >>> 11) + var5) + var5) ^ 9661) ^ var5))) - var5) << 9 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 5 | (char)((char)(var4[var5] + var5) - var5) >>> 11) + var5) + var5) ^ 9661) ^ var5))) - var5) >>> 7) + 'ﭚ') << 1 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 5 | (char)((char)(var4[var5] + var5) - var5) >>> 11) + var5) + var5) ^ 9661) ^ var5))) - var5) << 9 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 5 | (char)((char)(var4[var5] + var5) - var5) >>> 11) + var5) + var5) ^ 9661) ^ var5))) - var5) >>> 7) + 'ﭚ') >>> 15) + '\uee9f') << 5)))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
