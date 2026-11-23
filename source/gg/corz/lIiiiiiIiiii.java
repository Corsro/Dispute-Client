package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1657;

public class lIiiiiiIiiii extends ilIllIiIll {
   private static final long lIlllIiIliIlllIiIl = 10000L;
   private final Map<UUID, String> IllllIiIllllllIiIl = new HashMap();
   private final Map<UUID, Long> iiIllIiIlIIlllIiIl = new HashMap();
   private final IIiiIIIllIiiIIIl llIllIiIlilIllIiIl = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
   private final iiIiiilIIliiil IiIllIiIlliIllIiIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);

   public lIiiiiiIiiii() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.llIllIiIlilIllIiIl, this.IiIllIiIlliIllIiIl});
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) + 12080) ^ '鎥'))) + var5) + var5) + var5) + '\udb33') + 22261) + var5) ^ '跶') - var5) ^ var5) + var5) + '럅') ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void lIIlliIIll(class_1657 target) {
      if (this.IliIlllilIi()) {
         this.iiIllIiIlIIlllIiIl.put(target.method_5667(), System.currentTimeMillis());
         this.IllllIiIllllllIiIl.put(target.method_5667(), target.method_5477().getString());
      }
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + '뼂') + '\ue40a') >>> 9 | (char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + '뼂') + '\ue40a') << 7) - var5) - 13796) - 18651) << 1 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + '뼂') + '\ue40a') >>> 9 | (char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + '뼂') + '\ue40a') << 7) - var5) - 13796) - 18651) >>> 15) + 29771) + '왈') >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + '뼂') + '\ue40a') >>> 9 | (char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + '뼂') + '\ue40a') << 7) - var5) - 13796) - 18651) << 1 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + '뼂') + '\ue40a') >>> 9 | (char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + '뼂') + '\ue40a') << 7) - var5) - 13796) - 18651) >>> 15) + 29771) + '왈') << 5))))) + var5) + var5) - '\uf369') - '갻'))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + '뼂') + '\ue40a') >>> 9 | (char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + '뼂') + '\ue40a') << 7) - var5) - 13796) - 18651) << 1 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + '뼂') + '\ue40a') >>> 9 | (char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + '뼂') + '\ue40a') << 7) - var5) - 13796) - 18651) >>> 15) + 29771) + '왈') >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + '뼂') + '\ue40a') >>> 9 | (char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + '뼂') + '\ue40a') << 7) - var5) - 13796) - 18651) << 1 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + '뼂') + '\ue40a') >>> 9 | (char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + '뼂') + '\ue40a') << 7) - var5) - 13796) - 18651) >>> 15) + 29771) + '왈') << 5))))) + var5) + var5) - '\uf369') - '갻'))) << 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)((char)((char)(~((char)(-((char)((char)(var4[var5] - var5) >>> 15 | (char)(var4[var5] - var5) << 1))))) + var5) ^ 6739))))) ^ var5) ^ var5) >>> 10 | (char)((char)((char)(-((char)(~((char)((char)((char)(~((char)(-((char)((char)(var4[var5] - var5) >>> 15 | (char)(var4[var5] - var5) << 1))))) + var5) ^ 6739))))) ^ var5) ^ var5) << 6))) ^ var5) >>> 15 | (char)((char)(-((char)((char)((char)((char)(-((char)(~((char)((char)((char)(~((char)(-((char)((char)(var4[var5] - var5) >>> 15 | (char)(var4[var5] - var5) << 1))))) + var5) ^ 6739))))) ^ var5) ^ var5) >>> 10 | (char)((char)((char)(-((char)(~((char)((char)((char)(~((char)(-((char)((char)(var4[var5] - var5) >>> 15 | (char)(var4[var5] - var5) << 1))))) + var5) ^ 6739))))) ^ var5) ^ var5) << 6))) ^ var5) << 1) - var5) >>> 11 | (char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)((char)((char)(~((char)(-((char)((char)(var4[var5] - var5) >>> 15 | (char)(var4[var5] - var5) << 1))))) + var5) ^ 6739))))) ^ var5) ^ var5) >>> 10 | (char)((char)((char)(-((char)(~((char)((char)((char)(~((char)(-((char)((char)(var4[var5] - var5) >>> 15 | (char)(var4[var5] - var5) << 1))))) + var5) ^ 6739))))) ^ var5) ^ var5) << 6))) ^ var5) >>> 15 | (char)((char)(-((char)((char)((char)((char)(-((char)(~((char)((char)((char)(~((char)(-((char)((char)(var4[var5] - var5) >>> 15 | (char)(var4[var5] - var5) << 1))))) + var5) ^ 6739))))) ^ var5) ^ var5) >>> 10 | (char)((char)((char)(-((char)(~((char)((char)((char)(~((char)(-((char)((char)(var4[var5] - var5) >>> 15 | (char)(var4[var5] - var5) << 1))))) + var5) ^ 6739))))) ^ var5) ^ var5) << 6))) ^ var5) << 1) - var5) << 5) ^ var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         long var1 = System.currentTimeMillis();
         this.iiIllIiIlIIlllIiIl.entrySet().removeIf((e) -> var1 - (Long)e.getValue() > 10000L);
         if (this.IiIllIiIlliIllIiIl.Iilllilliill()) {
            for(UUID var4 : new HashSet(this.iiIllIiIlIIlllIiIl.keySet())) {
               boolean var5 = Iiiilllliiilll.field_1687.method_18456().stream().anyMatch((p) -> p.method_5667().equals(var4) && p.method_5805());
               if (!var5) {
                  String var6 = this.IlIllllIll(var4);
                  this.iiIllIiIlIIlllIiIl.remove(var4);
                  if (var6 != null) {
                     this.ilIllIiIll(var6);
                  }
               }
            }

         }
      }
   }

   private String IlIllllIll(UUID id) {
      return (String)this.IllllIiIllllllIiIl.remove(id);
   }

   public void iiiIlIIIll(String killedName) {
      if (this.IliIlllilIi()) {
         if (!this.IiIllIiIlliIllIiIl.Iilllilliill()) {
            this.ilIllIiIll(killedName);
         }

      }
   }

   public void Iilililiiili() {
      this.iiIllIiIlIIlllIiIl.clear();
   }

   public void Illillliilli() {
      this.iiIllIiIlIIlllIiIl.clear();
   }

   private void ilIllIiIll(String playerName) {
      if (Iiiilllliiilll.field_1724 != null) {
         String var2 = this.llIllIiIlilIllIiIl.Iilllilliill();
         Iiiilllliiilll.field_1724.field_3944.method_45730(IliIlllilIi<invokedynamic>() + playerName + IliIlllilIi<invokedynamic>() + var2);
      }
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ '貈')) << 8 | (char)((char)((char)(var4[var5] + var5) ^ '貈')) >>> 8) ^ var5) - '\uf406'))) ^ '黼') - '鴰') ^ '찁') - var5) + '\uf409') ^ var5) ^ 30339) ^ '\ua6f8') ^ 32716));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '餹') + '뎻') - var5) + '쬯') - '\ue565') << 7 | (char)((char)((char)((char)((char)((char)(~var4[var5]) + '餹') + '뎻') - var5) + '쬯') - '\ue565') >>> 9) ^ 3685) ^ var5) - '\uddc1') ^ '蒘'))) + 558) ^ var5) >>> 15 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '餹') + '뎻') - var5) + '쬯') - '\ue565') << 7 | (char)((char)((char)((char)((char)((char)(~var4[var5]) + '餹') + '뎻') - var5) + '쬯') - '\ue565') >>> 9) ^ 3685) ^ var5) - '\uddc1') ^ '蒘'))) + 558) ^ var5) << 1) ^ '훦'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4630331599587539793L ^ Long.rotateLeft(-1409073365956024337L, 42) ^ -6425021408606032612L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -7427906451722343894L ^ Long.rotateLeft(-1760682889496871914L, 58) ^ -1310228189771357721L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5799752977058151949L ^ Long.rotateLeft(4841148850827384647L, 33) ^ 4464519976256439042L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 4195416869618761547L ^ Long.rotateLeft(-2156455039297122054L, 42) ^ 4579576163167493239L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8653439096884061857L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -75839154195778620L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1196364968411595629L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 8647461538650008526L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4577048574251144596L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1825519846189442658L;
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
}
