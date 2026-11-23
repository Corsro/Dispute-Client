package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class iiIliIIlli {
   private IlillIIillillIIi IIiIiIIllIiIiIIl;
   public static final String iliilIIlIiiilIIl = "CAME ";
   public static final String liiilIIliiiilIIl = " · ";
   public static final float iiIIiIIlIIlIiIIl = 6.0F;
   public static final String IliilIIllliilIIl = "SENT ";
   public static final float lIlIiIIliIlIiIIl = 24.0F;
   private boolean lilIiIIliilIiIIl;
   public static final String IililIIllililIIl = "TGT ";
   public static final String lllilIIlillilIIl = "ONLINE";
   public static final String IIlilIIllIlilIIl = "SOON";
   private String IiiIiIIlliiIiIIl = "";
   private String iiiIiIIlIIIliIIl = "";
   public static final String llIIiIIlilIIiIIl = "...";
   public static final String iIlilIIlIllilIIl = "OFFLINE";
   public static final String lIiilIIliIiilIIl = "TAKEN ";
   public static final float IiIIiIIlliIIiIIl = 64.0F;
   public static final String iililIIlIIiilIIl = "POPS ";
   private String iIiIiIIlIliIiIIl = "";
   private boolean illIiIIlIilIiIIl;
   private static final List<String> iIIIiIIlIlIIiIIl = List.of(IIIilIIiiIIi<invokedynamic>(), IIIilIIiiIIi<invokedynamic>());
   private String lliIiIIliliIiIIl = "";
   private liIlIliiIlIl IllIiIIllllIiIIl;
   private static final Map<String, List<String>> IIIIiIIllIIIiIIl = Map.of(IIIilIIiiIIi<invokedynamic>(), List.of(IIIilIIiiIIi<invokedynamic>(), IIIilIIiiIIi<invokedynamic>()));

   public static float Ililllililil(float popsW, float row, float lead) {
      return Math.max(0.0F, popsW - row - 6.0F - lead);
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -5384527517126242830L ^ Long.rotateLeft(-63485000169495846L, 56) ^ -5025318484370594015L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8151059456669504769L ^ Long.rotateLeft(594789459297172613L, 17) ^ 8262407360806772876L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 606590624840038610L ^ Long.rotateLeft(-2322165584720044910L, 32) ^ 4716311825980905905L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3864774129597174351L ^ Long.rotateLeft(9057396085163052068L, 3) ^ -4787612786276817996L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3896015437620395585L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -5214487790824694313L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -1114203323083289925L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -4165801804427441964L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -1331651519738992753L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -8835806824065239449L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IlIillIiilIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIiliIiiiIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIlilIliiIli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Illillliilli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iilililiiili<invokedynamic>());
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
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ 'ꎈ'))) ^ 24301))) + var5) - var5) ^ var5) + var5) << 7 | (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ 'ꎈ'))) ^ 24301))) + var5) - var5) ^ var5) + var5) >>> 9) ^ 28367) - 23167) ^ '팵') ^ '욃'))) + var5) - '蠓') + 1497));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static List<String> Illlllllilll(liIlIliiIlIl look) {
      return look == null ? iIIIiIIlIlIIiIIl : (List)IIIIiIIllIIIiIIl.getOrDefault(look.Iiilliiliiil(), iIIIiIIlIlIIiIIl);
   }

   public static float IIillIiliIil(float lead, float row) {
      return Math.max(0.0F, lead - row - 6.0F - 24.0F);
   }

   public void liiiIIllIl() {
      this.lilIiIIliilIiIIl = false;
      this.IllIiIIllllIiIIl = null;
      this.IIiIiIIllIiIiIIl = null;
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 4 | (char)(var4[var5] - var5) << 12) + 29669) + var5) + var5) + var5) ^ 3968) ^ var5))) + 21191) >>> 9 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 4 | (char)(var4[var5] - var5) << 12) + 29669) + var5) + var5) + var5) ^ 3968) ^ var5))) + 21191) << 7) ^ 'Ꝝ') + 14380) - 25337))) + var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String IIlllIlliIll(liIlIliiIlIl enabled, boolean look, IlillIIillillIIi snap) {
      if (Iilllilliill(enabled, look, snap) && snap.IliIlllilIi()) {
         List var3 = Illlllllilll(enabled);
         String var4 = (String)var3.get(0) + snap.lIiiIiIlilli();
         return snap.iliIiiliiiii() > 0 ? var4 + IIIilIIiiIIi<invokedynamic>() + (String)var3.get(1) + snap.iliIiiliiiii() : var4;
      } else {
         return "";
      }
   }

   public static String IiIlliIliiIl(liIlIliiIlIl look, boolean enabled, IlillIIillillIIi snap) {
      return Iilllilliill(look, enabled, snap) && snap.IliIlllilIi() && snap.IilliliilIIi() != null ? IIIilIIiiIIi<invokedynamic>() + snap.IilliliilIIi() : "";
   }

   public boolean IIIllIIliIIl() {
      return !this.IiiIiIIlliiIiIIl.isEmpty() || !this.iiiIiIIlIIIliIIl.isEmpty();
   }

   public String iliIiiliiiii() {
      return this.iiiIiIIlIIIliIIl;
   }

   public static String IlIlllIlilIl(liIlIliiIlIl enabled, boolean look, IlillIIillillIIi snap) {
      if (enabled == null) {
         return "";
      } else if (enabled.iiIIlIIlIl()) {
         return IIIilIIiiIIi<invokedynamic>();
      } else if (!look) {
         return IIIilIIiiIIi<invokedynamic>();
      } else {
         return snap != null ? snap.iIlIlllllill().toUpperCase(Locale.ROOT) : IIIilIIiiIIi<invokedynamic>();
      }
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) - 1970)) ^ 12776) + var5))) - 5647) + var5) - var5) - var5) + var5) >>> 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) - 1970)) ^ 12776) + var5))) - 5647) + var5) - var5) - var5) + var5) << 3) << 1 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) - 1970)) ^ 12776) + var5))) - 5647) + var5) - var5) - var5) + var5) >>> 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) - 1970)) ^ 12776) + var5))) - 5647) + var5) - var5) - var5) + var5) << 3) >>> 15) + 13440) + '舞') - var5) ^ var5) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) - 1970)) ^ 12776) + var5))) - 5647) + var5) - var5) - var5) + var5) >>> 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) - 1970)) ^ 12776) + var5))) - 5647) + var5) - var5) - var5) + var5) << 3) << 1 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) - 1970)) ^ 12776) + var5))) - 5647) + var5) - var5) - var5) + var5) >>> 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) - 1970)) ^ 12776) + var5))) - 5647) + var5) - var5) - var5) + var5) << 3) >>> 15) + 13440) + '舞') - var5) ^ var5) << 2) - '醆'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ 17039) - var5))) + var5) - var5) ^ '锫'))) + var5) ^ '컍') >>> 1 | (char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ 17039) - var5))) + var5) - var5) ^ '锫'))) + var5) ^ '컍') << 15))) - var5) << 12 | (char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ 17039) - var5))) + var5) - var5) ^ '锫'))) + var5) ^ '컍') >>> 1 | (char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ 17039) - var5))) + var5) - var5) ^ '锫'))) + var5) ^ '컍') << 15))) - var5) >>> 4) ^ 14202));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String iIlIlllllill() {
      return this.iIiIiIIlIliIiIIl;
   }

   public String IilliliilIIi() {
      return this.lliIiIIliliIiIIl;
   }

   public static String Iiilliiliiil(String m, float text, ililIilIiilIil maxW) {
      if (m != null && !m.isEmpty()) {
         if (maxW.width(m) <= text) {
            return m;
         } else {
            String var3;
            for(var3 = m; var3.length() > 1 && maxW.width(var3 + IIIilIIiiIIi<invokedynamic>()) > text; var3 = var3.substring(0, var3.length() - 1)) {
            }

            return var3.stripTrailing() + IIIilIIiiIIi<invokedynamic>();
         }
      } else {
         return "";
      }
   }

   public String lIiiIiIlilli() {
      return this.IiiIiIIlliiIiIIl;
   }

   public boolean IliIlllilIi(liIlIliiIlIl snap, boolean enabled, IlillIIillillIIi look) {
      if (this.lilIiIIliilIiIIl && snap == this.IllIiIIllllIiIIl && enabled == this.illIiIIlIilIiIIl && Objects.equals(look, this.IIiIiIIllIiIiIIl)) {
         return false;
      } else {
         this.IllIiIIllllIiIIl = snap;
         this.illIiIIlIilIiIIl = enabled;
         this.IIiIiIIllIiIiIIl = look;
         this.lilIiIIliilIiIIl = true;
         this.iIiIiIIlIliIiIIl = snap == null ? "" : snap.IiIiliIiiiIi();
         this.lliIiIIliliIiIIl = IlIlllIlilIl(snap, enabled, look);
         this.IiiIiIIlliiIiIIl = IiIlliIliiIl(snap, enabled, look);
         this.iiiIiIIlIIIliIIl = IIlllIlliIll(snap, enabled, look);
         return true;
      }
   }

   private static boolean Iilllilliill(liIlIliiIlIl look, boolean snap, IlillIIillillIIi enabled) {
      return look != null && !look.iiIIlIIlIl() && snap && enabled != null;
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) >>> 13 | (char)(var4[var5] << 9 | var4[var5] >>> 7) << 3))) ^ '\ue54f'))) ^ '뱾') ^ var5)))) - var5) + var5))) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
