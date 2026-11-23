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
import net.minecraft.class_3532;

public class lIilillliIililll extends ilIllIiIll {
   private final lliliIIiililiIIi iiIliIlill = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private final IIIIlilllIIIlill IllliIlill = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)0.0F, (double)0.0F, (double)1.0F, 0.1);
   private final iiIiiilIIliiil lllliIlill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private float iilliIlill = 0.0F;
   private final lliliIIiililiIIi lIlliIlill = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private final iliiliilIiiiliil ilIliIlill = new iliiliilIiiiliil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), -14811076);
   private final IIIIlilllIIIlill iIlliIlill = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)0.0F, (double)0.0F, (double)1.0F, 0.1);
   private final iliiliilIiiiliil liIliIlill = new iliiliilIiiiliil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), -3631361);
   private final iiIiiilIIliiil llIliIlill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final IIIIlilllIIIlill lilliIlill = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)32.0F, (double)0.0F, (double)512.0F, (double)4.0F);
   private final IIIIlilllIIIlill IIlliIlill = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)1000.0F, (double)0.0F, (double)24000.0F, (double)100.0F);
   private final iiIiiilIIliiil IiIliIlill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final IIIIlilllIIIlill IilliIlill = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)64.0F, (double)4.0F, (double)512.0F, (double)4.0F);
   private final iliiliilIiiiliil illliIlill = new iliiliilIiiiliil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), -20561);

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 8186696343451441603L ^ Long.rotateLeft(-1020254149661870555L, 36) ^ -1027867356448638434L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -848838810547823108L ^ Long.rotateLeft(6509938549040984383L, 61) ^ -299003658048337854L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6023564986789232995L ^ Long.rotateLeft(4529594471798343079L, 36) ^ -2732952857690393512L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -573170264448922678L ^ Long.rotateLeft(-7855129228551575635L, 19) ^ -2667182188744005257L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3098044053573339203L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -9092420549391755220L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5631310802175383189L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 6494742828552159963L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 58275303400731394L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -885582526144939541L;
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

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) << 10 | (char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) >>> 6) >>> 15 | (char)((char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) << 10 | (char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) >>> 6) << 1)) - var5) << 11 | (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) << 10 | (char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) >>> 6) >>> 15 | (char)((char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) << 10 | (char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) >>> 6) << 1)) - var5) >>> 5))) >>> 12 | (char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) << 10 | (char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) >>> 6) >>> 15 | (char)((char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) << 10 | (char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) >>> 6) << 1)) - var5) << 11 | (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) << 10 | (char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) >>> 6) >>> 15 | (char)((char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) << 10 | (char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) >>> 6) << 1)) - var5) >>> 5))) << 4) << 1 | (char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) << 10 | (char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) >>> 6) >>> 15 | (char)((char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) << 10 | (char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) >>> 6) << 1)) - var5) << 11 | (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) << 10 | (char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) >>> 6) >>> 15 | (char)((char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) << 10 | (char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) >>> 6) << 1)) - var5) >>> 5))) >>> 12 | (char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) << 10 | (char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) >>> 6) >>> 15 | (char)((char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) << 10 | (char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) >>> 6) << 1)) - var5) << 11 | (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) << 10 | (char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) >>> 6) >>> 15 | (char)((char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) << 10 | (char)(~((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) >>> 12 | (char)(~((char)((char)(var4[var5] + var5) + var5))) << 4))) >>> 6) << 1)) - var5) >>> 5))) << 4) >>> 15) + var5)));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] ^ '閟') << 10 | (char)(var4[var5] ^ '閟') >>> 6))) + 22994))) >>> 13 | (char)(-((char)((char)(~((char)((char)(var4[var5] ^ '閟') << 10 | (char)(var4[var5] ^ '閟') >>> 6))) + 22994))) << 3) - '뵻') + '됖') + var5) - var5) ^ var5) << 8 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] ^ '閟') << 10 | (char)(var4[var5] ^ '閟') >>> 6))) + 22994))) >>> 13 | (char)(-((char)((char)(~((char)((char)(var4[var5] ^ '閟') << 10 | (char)(var4[var5] ^ '閟') >>> 6))) + 22994))) << 3) - '뵻') + '됖') + var5) - var5) ^ var5) >>> 8) - '\ue9f3') ^ 13340) - var5) ^ 2807) ^ var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] ^ '閟') << 10 | (char)(var4[var5] ^ '閟') >>> 6))) + 22994))) >>> 13 | (char)(-((char)((char)(~((char)((char)(var4[var5] ^ '閟') << 10 | (char)(var4[var5] ^ '閟') >>> 6))) + 22994))) << 3) - '뵻') + '됖') + var5) - var5) ^ var5) << 8 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] ^ '閟') << 10 | (char)(var4[var5] ^ '閟') >>> 6))) + 22994))) >>> 13 | (char)(-((char)((char)(~((char)((char)(var4[var5] ^ '閟') << 10 | (char)(var4[var5] ^ '閟') >>> 6))) + 22994))) << 3) - '뵻') + '됖') + var5) - var5) ^ var5) >>> 8) - '\ue9f3') ^ 13340) - var5) ^ 2807) ^ var5) << 10) ^ '逭'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IIllllIlll() {
      return this.liIliIlill.Iilllilliill();
   }

   public float Ilillllill() {
      if (this.lIIlliIIll() && !this.lIlliIlill.Iilllilliill().equals(IliIlllilIi<invokedynamic>())) {
         String var1 = this.lIlliIlill.Iilllilliill();
         byte var2 = -1;
         switch (var1.hashCode()) {
            case 78722885:
               if (var1.equals(IliIlllilIi<invokedynamic>())) {
                  var2 = 1;
               }
               break;
            case 80039734:
               if (var1.equals(IliIlllilIi<invokedynamic>())) {
                  var2 = 3;
               }
               break;
            case 80247031:
               if (var1.equals(IliIlllilIi<invokedynamic>())) {
                  var2 = 0;
               }
               break;
            case 329757892:
               if (var1.equals(IliIlllilIi<invokedynamic>())) {
                  var2 = 2;
               }
               break;
            case 2029746065:
               if (var1.equals(IliIlllilIi<invokedynamic>())) {
                  var2 = 4;
               }
         }

         float var10000;
         switch (var2) {
            case 0 -> var10000 = 0.0F;
            case 1 -> var10000 = 1.0F;
            case 2 -> var10000 = 1.0F;
            case 3 -> var10000 = 0.9F;
            case 4 -> var10000 = (float)this.iIlliIlill.Iilllilliill();
            default -> var10000 = -1.0F;
         }

         return var10000;
      } else {
         return -1.0F;
      }
   }

   public float ilillIiill() {
      if (this.lIIlliIIll() && !this.lIlliIlill.Iilllilliill().equals(IliIlllilIi<invokedynamic>())) {
         String var1 = this.lIlliIlill.Iilllilliill();
         byte var2 = -1;
         switch (var1.hashCode()) {
            case 78722885:
               if (var1.equals(IliIlllilIi<invokedynamic>())) {
                  var2 = 3;
               }
               break;
            case 80039734:
               if (var1.equals(IliIlllilIi<invokedynamic>())) {
                  var2 = 4;
               }
               break;
            case 80247031:
               if (var1.equals(IliIlllilIi<invokedynamic>())) {
                  var2 = 2;
               }
               break;
            case 329757892:
               if (var1.equals(IliIlllilIi<invokedynamic>())) {
                  var2 = 0;
               }
               break;
            case 2029746065:
               if (var1.equals(IliIlllilIi<invokedynamic>())) {
                  var2 = 1;
               }
         }

         float var10000;
         switch (var2) {
            case 0:
               var10000 = 1.0F;
               break;
            case 1:
               var10000 = (float)this.IllliIlill.Iilllilliill();
               break;
            case 2:
            case 3:
            case 4:
               var10000 = 0.0F;
               break;
            default:
               var10000 = -1.0F;
         }

         return var10000;
      } else {
         return -1.0F;
      }
   }

   public float lllllillll() {
      return (float)this.lilliIlill.Iilllilliill();
   }

   public int iIlllIllll() {
      return this.illliIlill.Iilllilliill();
   }

   public static lIilillliIililll iiiIlIIIll() {
      return (lIilillliIililll)llilIllililIll.iliIiiliiiii(lIilillliIililll.class);
   }

   public boolean liIlliiIll() {
      return this.lIIlliIIll() && this.lllliIlill.Iilllilliill();
   }

   public boolean ilIllIiIll() {
      return this.lIIlliIIll() && this.IiIliIlill.Iilllilliill();
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(~((char)(-((char)(-((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) << 9 | (char)(var4[var5] >>> 4 | var4[var5] << 12) >>> 7) + '폝') + var5) + var5) - var5))))) ^ var5) + var5))))))) >>> 15 | (char)(~((char)(-((char)(-((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) << 9 | (char)(var4[var5] >>> 4 | var4[var5] << 12) >>> 7) + '폝') + var5) + var5) - var5))))) ^ var5) + var5))))))) << 1))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) + var5))) - var5) - var5) ^ var5) ^ var5))) - var5) - 26354) + var5) >>> 10 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) + var5))) - var5) - var5) ^ var5) ^ var5))) - var5) - 26354) + var5) << 6) + 3023) - var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) + var5))) - var5) - var5) ^ var5) ^ var5))) - var5) - 26354) + var5) >>> 10 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) + var5))) - var5) - var5) ^ var5) ^ var5))) - var5) - 26354) + var5) << 6) + 3023) - var5) << 12) ^ 21264) + 19313) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IlIllllIll() {
      return this.lIIlliIIll() && this.llIliIlill.Iilllilliill();
   }

   public lIilillliIililll() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.llIlIIIiilIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.llIliIlill, this.ilIliIlill, this.IiIliIlill, this.liIliIlill, this.iiIliIlill, this.IIlliIlill, this.lIlliIlill, this.iIlliIlill, this.IllliIlill, this.lllliIlill, this.illliIlill, this.IilliIlill, this.lilliIlill});
   }

   private boolean lIIlliIIll() {
      return this.IliIlllilIi() && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null;
   }

   private long iilllIIill() {
      String var1 = this.iiIliIlill.Iilllilliill();
      byte var2 = -1;
      switch (var1.hashCode()) {
         case -1576218896:
            if (var1.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 1;
            }
            break;
         case 68476:
            if (var1.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 0;
            }
            break;
         case 75265016:
            if (var1.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 2;
            }
      }

      long var10000;
      switch (var2) {
         case 0 -> var10000 = 1000L;
         case 1 -> var10000 = 18000L;
         case 2 -> var10000 = 12300L;
         default -> var10000 = -1L;
      }

      return var10000;
   }

   public long lIilliIill(long original) {
      if (this.lIIlliIIll() && !this.iiIliIlill.Iilllilliill().equals(IliIlllilIi<invokedynamic>())) {
         return this.iiIliIlill.Iilllilliill().equals(IliIlllilIi<invokedynamic>()) ? (long)this.IIlliIlill.Iilllilliill() : (long)this.iilliIlill;
      } else {
         return original;
      }
   }

   public float Iillllilll() {
      return (float)this.IilliIlill.Iilllilliill();
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(-((char)(var4[var5] - var5))) << 4 | (char)(-((char)(var4[var5] - var5))) >>> 12) ^ var5))) ^ '퉦'))) + var5) + var5) - var5) - 30360) ^ 7745) << 7 | (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(-((char)(var4[var5] - var5))) << 4 | (char)(-((char)(var4[var5] - var5))) >>> 12) ^ var5))) ^ '퉦'))) + var5) + var5) - var5) - 30360) ^ 7745) >>> 9) - var5) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(-((char)(var4[var5] - var5))) << 4 | (char)(-((char)(var4[var5] - var5))) >>> 12) ^ var5))) ^ '퉦'))) + var5) + var5) - var5) - 30360) ^ 7745) << 7 | (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(-((char)(var4[var5] - var5))) << 4 | (char)(-((char)(var4[var5] - var5))) >>> 12) ^ var5))) ^ '퉦'))) + var5) + var5) - var5) - 30360) ^ 7745) >>> 9) - var5) >>> 9) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IIiilIiiiIii(illlllIillll event) {
      long var2 = this.iilllIIill();
      if (var2 >= 0L) {
         float var4 = Iiiilllliiilll.method_61966().method_60637(true);
         this.iilliIlill = class_3532.method_16439(var4, this.iilliIlill, this.iilliIlill + ((float)var2 - this.iilliIlill) * 0.01F);
      }

   }
}
