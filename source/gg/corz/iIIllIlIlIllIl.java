package gg.corz;

import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public record iIIllIlIlIllIl(int protocolVersion, String minecraftVersion, String plannerGeneration, String gitCommit, String buildDigest, String schematicDigest, String transformDigest) {
   private final String lIiillIlliIiillIll;
   public static final int iliillIllIiiillIll = 2;
   private final String IilillIlllilillIll;
   private final String IliillIlllliillIll;
   private final String iilillIllIIiillIll;
   private final String lllillIllillillIll;
   private final String iIlillIllIllillIll;
   private final int IIlillIlllIlillIll;

   public String IilliliilIIi(iIIllIlIlIllIl peer, liiiiilliiiiiill v) {
      if (v == liiiiilliiiiiill.IiillIIIil) {
         return IlIillIiilIi<invokedynamic>();
      } else {
         String var3;
         String var4;
         switch (v.ordinal()) {
            case 1:
               var3 = String.valueOf(this.IIlillIlllIlillIll);
               var4 = peer == null ? IlIillIiilIi<invokedynamic>() : String.valueOf(peer.IIlillIlllIlillIll);
               break;
            case 2:
               var3 = this.iIlillIllIllillIll;
               var4 = peer.iIlillIllIllillIll;
               break;
            case 3:
               var3 = this.lllillIllillillIll;
               var4 = peer.lllillIllillillIll;
               break;
            case 4:
               var3 = this.iilillIllIIiillIll;
               var4 = peer.iilillIllIIiillIll;
               break;
            default:
               var3 = this.lIiillIlliIiillIll;
               var4 = peer.lIiillIlliIiillIll;
         }

         return IlIillIiilIi<invokedynamic>() + v + IlIillIiilIi<invokedynamic>() + var3 + IlIillIiilIi<invokedynamic>() + var4;
      }
   }

   public boolean liiiIIllIl(iIIllIlIlIllIl peer) {
      return peer != null && !lIiiIiIlilli(this.IliillIlllliillIll, peer.IliillIlllliillIll);
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ var5) - 2467))) ^ 17385) - '\ue91f'))) ^ '\uee1f') << 11 | (char)((char)(-((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ var5) - 2467))) ^ 17385) - '\ue91f'))) ^ '\uee1f') >>> 5) ^ '툳') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String Ililllililil() {
      return this.iilillIllIIiillIll;
   }

   public iIIllIlIlIllIl(int plannerGeneration, String transformDigest, String protocolVersion, String schematicDigest, String minecraftVersion, String gitCommit, String buildDigest) {
      this.IIlillIlllIlillIll = plannerGeneration;
      this.iIlillIllIllillIll = transformDigest;
      this.lllillIllillillIll = protocolVersion;
      this.IilillIlllilillIll = schematicDigest;
      this.iilillIllIIiillIll = minecraftVersion;
      this.lIiillIlliIiillIll = gitCommit;
      this.IliillIlllliillIll = buildDigest;
   }

   public boolean iIlIlllllill(iIIllIlIlIllIl peer) {
      return this.IliIlllilIi(peer) == liiiiilliiiiiill.IiillIIIil;
   }

   public String Iiilliiliiil() {
      return this.lIiillIlliIiillIll;
   }

   public static iIIllIlIlIllIl IIIllIIliIIl(JsonObject o) {
      if (o != null && o.has(IlIillIiilIi<invokedynamic>()) && o.has(IlIillIiilIi<invokedynamic>())) {
         try {
            return new iIIllIlIlIllIl(o.get(IlIillIiilIi<invokedynamic>()).getAsInt(), IlIlllIlilIl(o, IlIillIiilIi<invokedynamic>()), IlIlllIlilIl(o, IlIillIiilIi<invokedynamic>()), IlIlllIlilIl(o, IlIillIiilIi<invokedynamic>()), IlIlllIlilIl(o, IlIillIiilIi<invokedynamic>()), IlIlllIlilIl(o, IlIillIiilIi<invokedynamic>()), IlIlllIlilIl(o, IlIillIiilIi<invokedynamic>()));
         } catch (Exception var2) {
            return null;
         }
      } else {
         return null;
      }
   }

   private static String IlIlllIlilIl(JsonObject k, String o) {
      return k.has(o) ? k.get(o).getAsString() : "";
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5416496854841269639L ^ Long.rotateLeft(598883316731971377L, 37) ^ 7980702953002511784L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -215862107284165542L ^ Long.rotateLeft(180597196392506982L, 42) ^ -5367707794949221033L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 4952956653153521886L ^ Long.rotateLeft(5390158682513626186L, 18) ^ 1579082582958387735L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5034279718974837093L ^ Long.rotateLeft(6177633252639983679L, 8) ^ -7997226424316098331L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3886517796284314169L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 830083830371256145L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4368997536299286153L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4437965719360401384L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -4416864387501030480L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -70834762412277558L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IiIiliIiiiIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIlilIliiIli<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Illillliilli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Iilililiiili<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIiilIiiiIii<invokedynamic>());
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
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)(~((char)((char)(~((char)(var4[var5] >>> 7 | var4[var5] << 9))) ^ var5))))) ^ var5) + var5))) + var5))) + var5) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(~((char)(~((char)(-((char)((char)((char)(var4[var5] + '앐') - var5) ^ '퀸'))))))) << 12 | (char)(~((char)(~((char)(-((char)((char)((char)(var4[var5] + '앐') - var5) ^ '퀸'))))))) >>> 4) ^ 'ꦙ'))) + '퇣') << 4 | (char)((char)(-((char)((char)((char)(~((char)(~((char)(-((char)((char)((char)(var4[var5] + '앐') - var5) ^ '퀸'))))))) << 12 | (char)(~((char)(~((char)(-((char)((char)((char)(var4[var5] + '앐') - var5) ^ '퀸'))))))) >>> 4) ^ 'ꦙ'))) + '퇣') >>> 12) ^ '蟉'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static boolean lIiiIiIlilli(String a, String b) {
      return a == null ? b == null : a.equals(b);
   }

   public String IiIlliIliiIl() {
      return String.format(Locale.ROOT, IlIillIiilIi<invokedynamic>(), this.IIlillIlllIlillIll, this.iIlillIllIllillIll, this.lllillIllillillIll, this.IilillIlllilillIll, this.iilillIllIIiillIll, this.lIiillIlliIiillIll, this.IliillIlllliillIll);
   }

   public String Illlllllilll() {
      return this.iIlillIllIllillIll;
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + 9536) ^ var5))) << 15 | (char)(-((char)((char)(var4[var5] + 9536) ^ var5))) >>> 1) - var5) ^ 10437) + '뜐') + var5))))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public JsonObject iliIiiliiiii() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(IlIillIiilIi<invokedynamic>(), this.IIlillIlllIlillIll);
      var1.addProperty(IlIillIiilIi<invokedynamic>(), this.iIlillIllIllillIll);
      var1.addProperty(IlIillIiilIi<invokedynamic>(), this.lllillIllillillIll);
      var1.addProperty(IlIillIiilIi<invokedynamic>(), this.IilillIlllilillIll);
      var1.addProperty(IlIillIiilIi<invokedynamic>(), this.iilillIllIIiillIll);
      var1.addProperty(IlIillIiilIi<invokedynamic>(), this.lIiillIlliIiillIll);
      var1.addProperty(IlIillIiilIi<invokedynamic>(), this.IliillIlllliillIll);
      return var1;
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) + 10544) + '떎') ^ var5))) >>> 12 | (char)(-((char)((char)((char)((char)(var4[var5] + var5) + 10544) + '떎') ^ var5))) << 4) ^ 12844) + 2013))))) >>> 9 | (char)(-((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) + 10544) + '떎') ^ var5))) >>> 12 | (char)(-((char)((char)((char)((char)(var4[var5] + var5) + 10544) + '떎') ^ var5))) << 4) ^ 12844) + 2013))))) << 7) ^ 27142) >>> 5 | (char)((char)((char)(-((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) + 10544) + '떎') ^ var5))) >>> 12 | (char)(-((char)((char)((char)((char)(var4[var5] + var5) + 10544) + '떎') ^ var5))) << 4) ^ 12844) + 2013))))) >>> 9 | (char)(-((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) + 10544) + '떎') ^ var5))) >>> 12 | (char)(-((char)((char)((char)((char)(var4[var5] + var5) + 10544) + '떎') ^ var5))) << 4) ^ 12844) + 2013))))) << 7) ^ 27142) << 11) + '\uf249') ^ 8344));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IIillIiliIil() {
      return this.IilillIlllilillIll;
   }

   public String Iilllilliill() {
      return this.lllillIllillillIll;
   }

   public int IIlllIlliIll() {
      return this.IIlillIlllIlillIll;
   }

   public liiiiilliiiiiill IliIlllilIi(iIIllIlIlIllIl peer) {
      if (peer == null) {
         return liiiiilliiiiiill.liillIIIil;
      } else if (peer.IIlillIlllIlillIll != this.IIlillIlllIlillIll) {
         return liiiiilliiiiiill.liillIIIil;
      } else if (!lIiiIiIlilli(this.iIlillIllIllillIll, peer.iIlillIllIllillIll)) {
         return liiiiilliiiiiill.iiillIIIil;
      } else if (!lIiiIiIlilli(this.lllillIllillillIll, peer.lllillIllillillIll)) {
         return liiiiilliiiiiill.IIIilIIIil;
      } else if (!lIiiIiIlilli(this.iilillIllIIiillIll, peer.iilillIllIIiillIll)) {
         return liiiiilliiiiiill.lIIilIIIil;
      } else {
         return !lIiiIiIlilli(this.lIiillIlliIiillIll, peer.lIiillIlliIiillIll) ? liiiiilliiiiiill.iIIilIIIil : liiiiilliiiiiill.IiillIIIil;
      }
   }

   public String IIIilIIiiIIi() {
      return this.IliillIlllliillIll;
   }
}
