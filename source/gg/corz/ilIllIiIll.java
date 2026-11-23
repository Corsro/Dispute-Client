package gg.corz;

import com.corz.client.qvm.Runtime;
import com.google.gson.JsonElement;
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
import net.minecraft.class_2960;
import net.minecraft.class_310;

public class ilIllIiIll implements lIIlliIIll, IlIllllIll {
   private final String iiiilllIIIIill;
   private boolean ilIIillIiIIill = false;
   private final List<IilliIllilliIl> IlIIillllIIill = new ArrayList();
   public static class_310 Iiiilllliiilll;
   private int liIIilliiIIill = -1;
   private final lllIllillIll lIIIilliIIIill;

   public void Ililllililil() {
      this.IIillIiliIil(!this.ilIIillIiIIill);
   }

   public boolean IliIlllilIi() {
      return this.ilIIillIiIIill;
   }

   // $FF: synthetic method
   private static CallSite IIllllIlll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 25161) ^ '舽') - 8826) - 15315) - 28070) >>> 6 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 25161) ^ '舽') - 8826) - 15315) - 28070) << 10) ^ var5) + 3351) + var5) ^ '꤮'))) + var5) ^ var5) + var5))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static {
      Runtime.loadVm(ilIllIiIll.class, MethodHandles.lookup());
      Iiiilllliiilll = class_310.method_1551();
   }

   public void iIiIlIliIl(JsonElement element) {
   }

   public final String lIiiIiIlilli() {
      return liiliIIliiiliIIl.liiiIIllIl(this.getClass());
   }

   protected void illIlIilIl(iilIIlilIIiIIlil event) {
   }

   protected void IIiilIiiiIii(illlllIillll render3DEvent) {
   }

   protected void lIlIliIlIl(IIilllilIillli event) {
   }

   protected void Illillliilli() {
   }

   // $FF: synthetic method
   private static CallSite IlIllllIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ '\ud841'))) >>> 2 | (char)(~((char)(var4[var5] ^ '\ud841'))) << 14) ^ var5) - 21464) << 15 | (char)((char)((char)((char)(~((char)(var4[var5] ^ '\ud841'))) >>> 2 | (char)(~((char)(var4[var5] ^ '\ud841'))) << 14) ^ var5) - 21464) >>> 1) << 10 | (char)((char)((char)((char)((char)(~((char)(var4[var5] ^ '\ud841'))) >>> 2 | (char)(~((char)(var4[var5] ^ '\ud841'))) << 14) ^ var5) - 21464) << 15 | (char)((char)((char)((char)(~((char)(var4[var5] ^ '\ud841'))) >>> 2 | (char)(~((char)(var4[var5] ^ '\ud841'))) << 14) ^ var5) - 21464) >>> 1) >>> 6) << 10 | (char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ '\ud841'))) >>> 2 | (char)(~((char)(var4[var5] ^ '\ud841'))) << 14) ^ var5) - 21464) << 15 | (char)((char)((char)((char)(~((char)(var4[var5] ^ '\ud841'))) >>> 2 | (char)(~((char)(var4[var5] ^ '\ud841'))) << 14) ^ var5) - 21464) >>> 1) << 10 | (char)((char)((char)((char)((char)(~((char)(var4[var5] ^ '\ud841'))) >>> 2 | (char)(~((char)(var4[var5] ^ '\ud841'))) << 14) ^ var5) - 21464) << 15 | (char)((char)((char)((char)(~((char)(var4[var5] ^ '\ud841'))) >>> 2 | (char)(~((char)(var4[var5] ^ '\ud841'))) << 14) ^ var5) - 21464) >>> 1) >>> 6) >>> 6))) << 3 | (char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ '\ud841'))) >>> 2 | (char)(~((char)(var4[var5] ^ '\ud841'))) << 14) ^ var5) - 21464) << 15 | (char)((char)((char)((char)(~((char)(var4[var5] ^ '\ud841'))) >>> 2 | (char)(~((char)(var4[var5] ^ '\ud841'))) << 14) ^ var5) - 21464) >>> 1) << 10 | (char)((char)((char)((char)((char)(~((char)(var4[var5] ^ '\ud841'))) >>> 2 | (char)(~((char)(var4[var5] ^ '\ud841'))) << 14) ^ var5) - 21464) << 15 | (char)((char)((char)((char)(~((char)(var4[var5] ^ '\ud841'))) >>> 2 | (char)(~((char)(var4[var5] ^ '\ud841'))) << 14) ^ var5) - 21464) >>> 1) >>> 6) << 10 | (char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ '\ud841'))) >>> 2 | (char)(~((char)(var4[var5] ^ '\ud841'))) << 14) ^ var5) - 21464) << 15 | (char)((char)((char)((char)(~((char)(var4[var5] ^ '\ud841'))) >>> 2 | (char)(~((char)(var4[var5] ^ '\ud841'))) << 14) ^ var5) - 21464) >>> 1) << 10 | (char)((char)((char)((char)((char)(~((char)(var4[var5] ^ '\ud841'))) >>> 2 | (char)(~((char)(var4[var5] ^ '\ud841'))) << 14) ^ var5) - 21464) << 15 | (char)((char)((char)((char)(~((char)(var4[var5] ^ '\ud841'))) >>> 2 | (char)(~((char)(var4[var5] ^ '\ud841'))) << 14) ^ var5) - 21464) >>> 1) >>> 6) >>> 6))) >>> 13));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IlIillIiilIi(int bindKey) {
      this.liIIilliiIIill = bindKey;
      iiiIIIlIIIlIIl.liiiIIllIl();
   }

   protected void Iilililiiili() {
   }

   public void IiiIlliiIl() {
   }

   public boolean liiiIIllIl() {
      return this.Iilllilliill();
   }

   public boolean Iilllilliill() {
      return false;
   }

   public class_2960 Iiilliiliiil() {
      return this.iliIiiliiiii().liiiIIllIl();
   }

   protected void IiIIlliIIl(IliIliIllliIliIl packetReceiveEvent) {
   }

   // $FF: synthetic method
   private static CallSite ilIllIiIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) << 15 | (char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) >>> 1) ^ var5) + 11231) + 'ꩲ') >>> 12 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) << 15 | (char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) >>> 1) ^ var5) + 11231) + 'ꩲ') << 4) ^ 16399) - '삥') ^ '뽱') << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) << 15 | (char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) >>> 1) ^ var5) + 11231) + 'ꩲ') >>> 12 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) << 15 | (char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) >>> 1) ^ var5) + 11231) + 'ꩲ') << 4) ^ 16399) - '삥') ^ '뽱') >>> 10) ^ var5))) + '퍟') << 11 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) << 15 | (char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) >>> 1) ^ var5) + 11231) + 'ꩲ') >>> 12 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) << 15 | (char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) >>> 1) ^ var5) + 11231) + 'ꩲ') << 4) ^ 16399) - '삥') ^ '뽱') << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) << 15 | (char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) >>> 1) ^ var5) + 11231) + 'ꩲ') >>> 12 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) << 15 | (char)((char)((char)(var4[var5] + var5) ^ var5) ^ var5) >>> 1) ^ var5) + 11231) + 'ꩲ') << 4) ^ 16399) - '삥') ^ '뽱') >>> 10) ^ var5))) + '퍟') >>> 5) ^ '엊') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public lllIllillIll iliIiiliiiii() {
      return ilIIlilIiIIlil.Illlllllilll(this) ? lllIllillIll.lIllIIIiiIllIIIi : this.lIIIilliIIIill;
   }

   public void IIlllIlliIll() {
      for(IilliIllilliIl var2 : this.IlIIillllIIill) {
         if (var2 instanceof iiIiiilIIliiil var3) {
            var3.IIillIiliIil(var3.Iiilliiliiil());
         } else if (var2 instanceof iilliIlIIiliIl var4) {
            var4.IIillIiliIil(var4.IIIilIIiiIIi());
         } else if (var2 instanceof IIIIlilllIIIlill var5) {
            var5.IIillIiliIil(var5.IIIilIIiiIIi());
         } else if (var2 instanceof lliliIIiililiIIi var6) {
            var6.Iiilliiliiil(var6.IIIilIIiiIIi());
         } else if (var2 instanceof IIiiIIIllIiiIIIl var7) {
            var7.IIillIiliIil(var7.Ililllililil());
         } else if (var2 instanceof iliiliilIiiiliil var8) {
            var8.IIIilIIiiIIi();
         } else if (var2 instanceof Iiiliillliiliill var9) {
            var9.IIillIiliIil(var9.IIlilIliiIli());
            var9.Iiilliiliiil(var9.Illillliilli());
         } else if (var2 instanceof illlIlIlIillIlIl var10) {
            var10.Iiilliiliiil(var10.IIIilIIiiIIi());
         }
      }

      iiiIIIlIIIlIIl.IilliliilIIi();
   }

   protected void Iiiiliiiiiii(iillIIIlIIilIIIl postItemUseEvent) {
   }

   public ilIlIliIiIlIli IiIiliIiiiIi() {
      return ilIlIliIiIlIli.IlilIIIIIl;
   }

   public boolean iIlIlllllill() {
      return !this.Iilllilliill();
   }

   public boolean IIlilIliiIli() {
      return false;
   }

   public JsonElement IIiIllIiIl() {
      return null;
   }

   protected void iiIIlIIlIl(iIIlIlIlIlIlIlIl cameraEvent) {
   }

   public boolean Illlllllilll() {
      return this.lIIIilliIIIill != lllIllillIll.IlllIIIillllIIIi;
   }

   // $FF: synthetic method
   private static CallSite liIlliiIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(~((char)(-((char)(-((char)((char)(~((char)((char)((char)(var4[var5] ^ 'ꞿ') << 7 | (char)(var4[var5] ^ 'ꞿ') >>> 9) - var5))) ^ var5))))))) >>> 7 | (char)(~((char)(-((char)(-((char)((char)(~((char)((char)((char)(var4[var5] ^ 'ꞿ') << 7 | (char)(var4[var5] ^ 'ꞿ') >>> 9) - var5))) ^ var5))))))) << 9))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void iIIIlIlIIl() {
   }

   protected void Iliilliiilii(lIiIlliiIiIlli render2DEvent) {
   }

   public void IIillIiliIil(boolean enabled) {
      Runtime.run(-4263779310227578119L, -1713666479, new Object[]{this, enabled, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
   }

   public boolean lliIliliIl() {
      return false;
   }

   protected void IIIIllIIIl(iiiIliIIIlli preItemUseEvent) {
   }

   public ilIllIiIll(String category, lllIllillIll name) {
      this.iiiilllIIIIill = category != null ? category : iiiIlIIIll<invokedynamic>();
      this.lIIIilliIIIill = name != null ? name : lllIllillIll.IiIlIIIiliIlIIIi;
   }

   // $FF: synthetic method
   private static CallSite lIIlliIIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - '뤃') << 6 | (char)(var4[var5] - '뤃') >>> 10) - 7265) + '왘') + 23315) - var5))) << 3 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - '뤃') << 6 | (char)(var4[var5] - '뤃') >>> 10) - 7265) + '왘') + 23315) - var5))) >>> 13))) + 5893) ^ 26876) + 8270))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iiiIlIIIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -2068572060150365215L ^ Long.rotateLeft(2016204294251816873L, 9) ^ -4700578627237257704L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 4831462512507861233L ^ Long.rotateLeft(-6338866603442005997L, 26) ^ 4153796948622757479L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -9169178302255859829L ^ Long.rotateLeft(7790307925605364144L, 1) ^ 3974845424362375912L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 6082263349541899091L ^ Long.rotateLeft(3710923972223813501L, 60) ^ 2336737503737394718L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1512601500504124062L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -9047304734379386794L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 8370849749624770082L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4064398179199626395L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8196521189225380720L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -5139903792270801636L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(lIIlliIIll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IlIllllIll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, ilIllIiIll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, liIlliiIll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIllllIlll<invokedynamic>());
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

   protected void lilIliilIl(IiiIlllliiIlll event) {
   }

   protected void IllIllllIl(IiiiIIIlliiiIIIl event) {
   }

   public List<IilliIllilliIl> IiIlliIliiIl() {
      return this.IlIIillllIIill;
   }

   public void IIIllIIliIIl(IilliIllilliIl setting) {
      this.IlIIillllIIill.add(setting);
   }

   public String IilliliilIIi() {
      return this.iiiilllIIIIill;
   }

   public void IlIlllIlilIl(IilliIllilliIl... settings) {
      long var6 = 8653506713235512850L;
      IilliIllilliIl[] var2 = settings;
      var6 ^= ((long)settings.length << 32 ^ var6) & -1L << 32;

      for(long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
         IilliIllilliIl var5 = var2[(int)var9];
         this.IIIllIIliIIl(var5);
      }

   }

   protected void llIIlilIIl(IiIiIlIiliIiIlIi packetSendEvent) {
   }

   public int IIIilIIiiIIi() {
      return this.liIIilliiIIill;
   }
}
