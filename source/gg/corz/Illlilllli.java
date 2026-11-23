package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2596;
import net.minecraft.class_2664;
import net.minecraft.class_2743;
import net.minecraft.class_742;
import net.minecraft.class_746;

public class Illlilllli extends ilIllIiIll implements lIlliiIlli {
   private final iiIiiilIIliiil lIiliIIliIiliIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private static final double IlIliIIlllIliIIl = (double)45.0F;
   private final Iiiliillliiliill iilliIIlIIiliIIl = new Iiiliillliiliill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)200.0F, (double)250.0F, (double)0.0F, (double)500.0F, (double)10.0F);
   private class_746 IIIiiIIllIIiiIIl;
   private static final double lIIliIIliIIliIIl = (double)5.0F;
   private static final long liIliIIliiIliIIl = 475L;
   private volatile long ililiIIlIiiliIIl = -1L;
   private volatile long liiliIIliiiliIIl = -1L;
   private int iIIiiIIlIlIiiIIl;
   private static final long iIlliIIlIllliIIl = 150L;
   private boolean iiIiiIIlIIliiIIl;
   private volatile IIIIIIIllIIIIIIl IliliIIllliliIIl;
   private static final double ilIliIIlIiIliIIl = (double)90.0F;
   private static final long IIlliIIllIlliIIl = 500L;
   private final Iiiliillliiliill IilliIIllilliIIl = new Iiiliillliiliill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)50.0F, (double)100.0F, (double)0.0F, (double)500.0F, (double)10.0F);
   private final iilliIlIIiliIl lllliIIlillliIIl = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 40, 0, 100);
   private long llIiiIIlilIiiIIl = -1L;
   private boolean IiIiiIIlliIiiIIl;

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)(~((char)((char)(-((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) - 'ﾉ') ^ 'ﵨ') << 10 | (char)((char)((char)((char)(var4[var5] + var5) - var5) - 'ﾉ') ^ 'ﵨ') >>> 6) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + var5) - var5) - 'ﾉ') ^ 'ﵨ') << 10 | (char)((char)((char)((char)(var4[var5] + var5) - var5) - 'ﾉ') ^ 'ﵨ') >>> 6) << 8) - 25854))))) >>> 14 | (char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) - 'ﾉ') ^ 'ﵨ') << 10 | (char)((char)((char)((char)(var4[var5] + var5) - var5) - 'ﾉ') ^ 'ﵨ') >>> 6) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + var5) - var5) - 'ﾉ') ^ 'ﵨ') << 10 | (char)((char)((char)((char)(var4[var5] + var5) - var5) - 'ﾉ') ^ 'ﵨ') >>> 6) << 8) - 25854))))) << 2) << 4 | (char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) - 'ﾉ') ^ 'ﵨ') << 10 | (char)((char)((char)((char)(var4[var5] + var5) - var5) - 'ﾉ') ^ 'ﵨ') >>> 6) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + var5) - var5) - 'ﾉ') ^ 'ﵨ') << 10 | (char)((char)((char)((char)(var4[var5] + var5) - var5) - 'ﾉ') ^ 'ﵨ') >>> 6) << 8) - 25854))))) >>> 14 | (char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) - 'ﾉ') ^ 'ﵨ') << 10 | (char)((char)((char)((char)(var4[var5] + var5) - var5) - 'ﾉ') ^ 'ﵨ') >>> 6) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] + var5) - var5) - 'ﾉ') ^ 'ﵨ') << 10 | (char)((char)((char)((char)(var4[var5] + var5) - var5) - 'ﾉ') ^ 'ﵨ') >>> 6) << 8) - 25854))))) << 2) >>> 12))) + '集'))))) ^ '휷') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long iiiIlIIIll(class_2596<?> packet, boolean queued, long nowMs) {
      long var10 = -993318201141670802L;
      IIIIIIIllIIIIIIl var5 = this.IliliIIllliliIIl;
      if (var5 != null && illllIlIilllIl.Iilllilliill(nowMs, this.ililiIIlIiiliIIl, 1406118633106900198L ^ 1406118633106900285L)) {
         var10 ^= ((long)var5.IliIlllilIi() << 32 ^ var10) & -1L << 32;
         if (!IIIiillllIIiilll.iliIiiliiiii(packet, (q) -> IIllllIlll(q, self))) {
            return 0L;
         } else if (!illllIlIilllIl.IIillIiliIil(nowMs, illIllilIilIllil.Illlllllilll((int)(var10 >>> 32)), 90409681870100682L ^ 90409681870100572L)) {
            return 0L;
         } else {
            ThreadLocalRandom var7 = ThreadLocalRandom.current();
            if (!illllIlIilllIl.IliIlllilIi((double)var5.liiiIIllIl(), var7.nextDouble())) {
               return 0L;
            } else {
               long var8 = illllIlIilllIl.Iiilliiliiil(var5.iIlIlllllill(), var5.IilliliilIIi(), var5.lIiiIiIlilli(), var5.iliIiiliiiii(), var5.IIIllIIliIIl(), var7.nextDouble(), -7368688479364135110L ^ -7368688479364135218L);
               if (var8 <= (303349081733610763L ^ 303349081733610763L)) {
                  return 0L;
               } else {
                  this.ililiIIlIiiliIIl = nowMs;
                  this.liiliIIliiiliIIl = nowMs;
                  return nowMs + var8;
               }
            }
         }
      } else {
         return 0L;
      }
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 10 | (char)(~var4[var5]) << 6) ^ '\ud86e') + 12131) - 2394) - '薚') + 20584) + '햀') - 4498) - '쟼'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '맢') + var5) ^ 29613) << 7 | (char)((char)((char)(var4[var5] - '맢') + var5) ^ 29613) >>> 9) - var5) - 21771) + var5) << 15 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - '맢') + var5) ^ 29613) << 7 | (char)((char)((char)(var4[var5] - '맢') + var5) ^ 29613) >>> 9) - var5) - 21771) + var5) >>> 1) ^ '齌'))) ^ 27238) + var5) ^ '\uf039') + var5) - var5));
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
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '낟') + var5) ^ var5) - 23320) - 5972) << 8 | (char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '낟') + var5) ^ var5) - 23320) - 5972) >>> 8))) ^ '숒') >>> 8 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '낟') + var5) ^ var5) - 23320) - 5972) << 8 | (char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '낟') + var5) ^ var5) - 23320) - 5972) >>> 8))) ^ '숒') << 8))) >>> 11 | (char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '낟') + var5) ^ var5) - 23320) - 5972) << 8 | (char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '낟') + var5) ^ var5) - 23320) - 5972) >>> 8))) ^ '숒') >>> 8 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '낟') + var5) ^ var5) - 23320) - 5972) << 8 | (char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '낟') + var5) ^ var5) - 23320) - 5972) >>> 8))) ^ '숒') << 8))) << 5) + 26470) << 11 | (char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '낟') + var5) ^ var5) - 23320) - 5972) << 8 | (char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '낟') + var5) ^ var5) - 23320) - 5972) >>> 8))) ^ '숒') >>> 8 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '낟') + var5) ^ var5) - 23320) - 5972) << 8 | (char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '낟') + var5) ^ var5) - 23320) - 5972) >>> 8))) ^ '숒') << 8))) >>> 11 | (char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '낟') + var5) ^ var5) - 23320) - 5972) << 8 | (char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '낟') + var5) ^ var5) - 23320) - 5972) >>> 8))) ^ '숒') >>> 8 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '낟') + var5) ^ var5) - 23320) - 5972) << 8 | (char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '낟') + var5) ^ var5) - 23320) - 5972) >>> 8))) ^ '숒') << 8))) << 5) + 26470) >>> 5) - 28124) ^ '핗'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void Iilililiiili() {
      this.IliliIIllliliIIl = null;
      iillIlllIIilIlll.lIiiIiIlilli(this);
      this.liIlliiIll();
   }

   private void ilIllIiIll(class_746 player) {
      long var2 = this.liiliIIliiiliIIl;
      if (var2 >= (-4788780427776573137L ^ -4788780427776573137L)) {
         if (var2 != this.llIiiIIlilIiiIIl) {
            this.llIiiIIlilIiiIIl = var2;
            this.IiIiiIIlliIiiIIl = false;
            this.iiIiiIIlIIliiIIl = false;
         }

         if (!this.IiIiiIIlliIiiIIl && iillIlllIIilIlll.liiiIIllIl(this)) {
            if (player.field_6235 > 0) {
               this.iiIiiIIlIIliiIIl = true;
            }

            if (illllIlIilllIl.IIIilIIiiIIi(this.iiIiiIIlIIliiIIl, player.field_6235, IIIiillllIIiilll.IliIlllilIi() - var2, 8596105689352046813L ^ 8596105689352046889L)) {
               this.IiIiiIIlliIiiIIl = true;
               iillIlllIIilIlll.lIiiIiIlilli(this);
            }

         }
      }
   }

   private static boolean IIllllIlll(class_2596<?> packet, int selfId) {
      if (packet instanceof class_2743 var3) {
         return var3.method_11818() == selfId;
      } else {
         boolean var10000;
         if (packet instanceof class_2664 var2) {
            if (var2.comp_2884().isPresent()) {
               var10000 = true;
               return var10000;
            }
         }

         var10000 = false;
         return var10000;
      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - 'ﶿ') + '쩗') - var5) - var5))) + var5))) - 1742) - 15757) + 16543) + var5) - 18691) ^ 23495));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean IlIllllIll(class_746 self) {
      double var2 = ilIiiIiIii.IiIlliIliiIl() ? (double)ilIiiIiIii.Iilllilliill() : (double)self.method_36454();

      for(class_742 var5 : Iiiilllliiilll.field_1687.method_18456()) {
         if (var5 != self && liiIIIlliiiIIIll.IliIlllilIi(var5, lilllliiilllli.iiIiIiIIIl) && !((double)self.method_5739(var5) >= (double)5.0F) && illllIlIilllIl.iliIiiliiiii(var2, self.method_23317(), self.method_23321(), var5.method_23317(), var5.method_23321(), (double)45.0F) && illllIlIilllIl.iliIiiliiiii((double)var5.method_36454(), var5.method_23317(), var5.method_23321(), self.method_23317(), self.method_23321(), (double)90.0F)) {
            return true;
         }
      }

      return false;
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -484993284641000830L ^ Long.rotateLeft(-5926268283004398755L, 9) ^ 4201300295936651660L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -941272259004494207L ^ Long.rotateLeft(5397697727371265938L, 56) ^ 344070226493997372L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7235745720604567118L ^ Long.rotateLeft(4023092463971976946L, 62) ^ -7227729379532753200L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 2342453338538546391L ^ Long.rotateLeft(-1088192031707869072L, 47) ^ -4643832028749459073L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 4016144425380994399L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -133633430803083957L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 3854619608078249706L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5650080342160985301L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 418562816877281797L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1029893621478900078L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, lIiiIiIlilli<invokedynamic>());
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
      class_746 var1 = Iiiilllliiilll.field_1724;
      if (var1 != null && Iiiilllliiilll.field_1687 != null) {
         if (var1 != this.IIIiiIIllIIiiIIl) {
            if (this.IIIiiIIllIIiiIIl != null) {
               iillIlllIIilIlll.lIiiIiIlilli(this);
            }

            this.IIIiiIIllIIiiIIl = var1;
            this.iIIiiIIlIlIiiIIl = 0;
         }

         this.iIIiiIIlIlIiiIIl = var1.method_24828() ? Math.min(this.iIIiiIIlIlIiiIIl + 1, 1000) : 0;
         this.IliliIIllliliIIl = this.lIIlliIIll(var1) ? new IIIIIIIllIIIIIIl(var1.method_5628(), this.lllliIIlillliIIl.Iilllilliill(), illllIlIilllIl.Ililllililil(this.iIIiiIIlIlIiiIIl), this.IilliIIllilliIIl.Iilllilliill(), this.IilliIIllilliIIl.Ililllililil(), this.iilliIIlIIiliIIl.Iilllilliill(), this.iilliIIlIIiliIIl.Ililllililil()) : null;
         this.ilIllIiIll(var1);
      } else {
         this.IliliIIllliliIIl = null;
      }
   }

   public Illlilllli() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.iiIlIIIiIIllIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lllliIIlillliIIl, this.IilliIIllilliIIl, this.iilliIIlIIiliIIl, this.lIiliIIliIiliIIl});
   }

   private void liIlliiIll() {
      this.IliliIIllliliIIl = null;
      this.ililiIIlIiiliIIl = -1L;
      this.liiliIIliiiliIIl = -1L;
      this.IIIiiIIllIIiiIIl = null;
      this.iIIiiIIlIlIiiIIl = 0;
      this.llIiiIIlilIiiIIl = -1L;
      this.IiIiiIIlliIiiIIl = false;
      this.iiIiiIIlIIliiIIl = false;
   }

   protected void Illillliilli() {
      this.liIlliiIll();
   }

   private boolean lIIlliIIll(class_746 player) {
      if (this.lllliIIlillliIIl.Iilllilliill() <= 0) {
         return false;
      } else {
         return this.lIiliIIliIiliIIl.Iilllilliill() && player.method_5799() ? false : this.IlIllllIll(player);
      }
   }
}
