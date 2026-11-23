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
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class iilllIIiIIillIIi {
   private int ilIIIIiiil;
   private int IiIIIIiiil;
   private String IlIIIIiiil;
   private int llIIIIiiil;
   public static final String Iiiiiiliil = "MISSING_MATERIAL";
   public static final String iliiiiliil = "WAITING_SUPPORT";
   public static final String iIiiiiliil = "NO_ACCESS_ROUTE";
   public static final String lIiiiiliil = "DIRT_LOOP_BAN";
   private final ArrayList<Long> liIIIIiiil = new ArrayList();
   public static final String lliiiiliil = "POSE_BLOCKED";
   public static final String liiiiiliil = "ROI_REFUSED";
   public static final int iIIIIIiiil = 200;
   public static final String Iliiiiliil = "NO_STAND";
   public static final String IIiiiiliil = "TEMP_DEBT_NO_RECYCLE";
   public static final String iiiiiiliil = "ISOLATED_AFTER_ACCESS";
   public static final String IIIIIIiiil = "OTHER";
   public static final int lIIIIIiiil = 6;

   public void iIlIlllllill(String blocker, int tick, long targetKey) {
      if (blocker.equals(this.IlIIIIiiil)) {
         ++this.llIIIIiiil;
      } else {
         this.IlIIIIiiil = blocker;
         this.llIIIIiiil = 1;
         this.ilIIIIiiil = tick;
         this.liIIIIiiil.clear();
      }

      if (targetKey != 0L && this.liIIIIiiil.size() < 16 && !this.liIIIIiiil.contains(targetKey)) {
         this.liIIIIiiil.add(targetKey);
      }

   }

   public String iliIiiliiiii(int lastProgressTick, int tick) {
      if (this.IlIIIIiiil != null && this.llIIIIiiil >= 6) {
         return lastProgressTick - tick < 200 ? null : this.IlIIIIiiil;
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -552156682979265014L ^ Long.rotateLeft(-5205789709836919701L, 52) ^ 4376512691859038886L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -835780170910399971L ^ Long.rotateLeft(-4183673159457932370L, 62) ^ -3580751009718323634L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 682722084640031042L ^ Long.rotateLeft(1409435069569148441L, 54) ^ 2754118591054160666L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8254707027618915476L ^ Long.rotateLeft(3644783361584906280L, 50) ^ -7404459548406963315L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1426127343910290555L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 4132053204024050741L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8115323069761993705L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5902364407641309434L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -3079474669597709329L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8227972954160716075L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIillIiliIil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Ililllililil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iiilliiliiil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIIilIIiiIIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IlIillIiilIi<invokedynamic>());
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

   public int Illlllllilll() {
      return this.IiIIIIiiil;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] ^ '証') >>> 1 | (char)(var4[var5] ^ '証') << 15))) - '\uee3b'))) + var5) ^ var5) << 7 | (char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] ^ '証') >>> 1 | (char)(var4[var5] ^ '証') << 15))) - '\uee3b'))) + var5) ^ var5) >>> 9) - var5) ^ '턷') >>> 10 | (char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] ^ '証') >>> 1 | (char)(var4[var5] ^ '証') << 15))) - '\uee3b'))) + var5) ^ var5) << 7 | (char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] ^ '証') >>> 1 | (char)(var4[var5] ^ '証') << 15))) - '\uee3b'))) + var5) ^ var5) >>> 9) - var5) ^ '턷') << 6) >>> 15 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] ^ '証') >>> 1 | (char)(var4[var5] ^ '証') << 15))) - '\uee3b'))) + var5) ^ var5) << 7 | (char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] ^ '証') >>> 1 | (char)(var4[var5] ^ '証') << 15))) - '\uee3b'))) + var5) ^ var5) >>> 9) - var5) ^ '턷') >>> 10 | (char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] ^ '証') >>> 1 | (char)(var4[var5] ^ '証') << 15))) - '\uee3b'))) + var5) ^ var5) << 7 | (char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] ^ '証') >>> 1 | (char)(var4[var5] ^ '証') << 15))) - '\uee3b'))) + var5) ^ var5) >>> 9) - var5) ^ '턷') << 6) << 1)))) << 2 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] ^ '証') >>> 1 | (char)(var4[var5] ^ '証') << 15))) - '\uee3b'))) + var5) ^ var5) << 7 | (char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] ^ '証') >>> 1 | (char)(var4[var5] ^ '証') << 15))) - '\uee3b'))) + var5) ^ var5) >>> 9) - var5) ^ '턷') >>> 10 | (char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] ^ '証') >>> 1 | (char)(var4[var5] ^ '証') << 15))) - '\uee3b'))) + var5) ^ var5) << 7 | (char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] ^ '証') >>> 1 | (char)(var4[var5] ^ '証') << 15))) - '\uee3b'))) + var5) ^ var5) >>> 9) - var5) ^ '턷') << 6) >>> 15 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] ^ '証') >>> 1 | (char)(var4[var5] ^ '証') << 15))) - '\uee3b'))) + var5) ^ var5) << 7 | (char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] ^ '証') >>> 1 | (char)(var4[var5] ^ '証') << 15))) - '\uee3b'))) + var5) ^ var5) >>> 9) - var5) ^ '턷') >>> 10 | (char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] ^ '証') >>> 1 | (char)(var4[var5] ^ '証') << 15))) - '\uee3b'))) + var5) ^ var5) << 7 | (char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] ^ '証') >>> 1 | (char)(var4[var5] ^ '証') << 15))) - '\uee3b'))) + var5) ^ var5) >>> 9) - var5) ^ '턷') << 6) << 1)))) >>> 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '趟'))) << 15 | (char)(-((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '趟'))) >>> 1) >>> 11 | (char)((char)(-((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '趟'))) << 15 | (char)(-((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '趟'))) >>> 1) << 5) + var5) ^ '\ue54a') + 8281) ^ 26245) - var5) ^ 15182) + '\ue575') + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '趟'))) << 15 | (char)(-((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '趟'))) >>> 1) >>> 11 | (char)((char)(-((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '趟'))) << 15 | (char)(-((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '趟'))) >>> 1) << 5) + var5) ^ '\ue54a') + 8281) ^ 26245) - var5) ^ 15182) + '\ue575') + var5) << 4))) - '黯') - 18297))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void lIiiIiIlilli() {
      this.IlIIIIiiil = null;
      this.llIIIIiiil = 0;
      this.liIIIIiiil.clear();
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\ud8ca') + '\ud939') ^ var5) >>> 3 | (char)((char)((char)(var4[var5] ^ '\ud8ca') + '\ud939') ^ var5) << 13) << 9 | (char)((char)((char)((char)(var4[var5] ^ '\ud8ca') + '\ud939') ^ var5) >>> 3 | (char)((char)((char)(var4[var5] ^ '\ud8ca') + '\ud939') ^ var5) << 13) >>> 7) ^ 20995) >>> 5 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '\ud8ca') + '\ud939') ^ var5) >>> 3 | (char)((char)((char)(var4[var5] ^ '\ud8ca') + '\ud939') ^ var5) << 13) << 9 | (char)((char)((char)((char)(var4[var5] ^ '\ud8ca') + '\ud939') ^ var5) >>> 3 | (char)((char)((char)(var4[var5] ^ '\ud8ca') + '\ud939') ^ var5) << 13) >>> 7) ^ 20995) << 11))) - var5) ^ var5) ^ 'ꍳ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IIIllIIliIIl() {
      ++this.IiIIIIiiil;
      this.llIIIIiiil = 0;
      this.liIIIIiiil.clear();
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 7 | (char)((char)(var4[var5] + var5) - var5) >>> 9) ^ var5) << 12 | (char)((char)((char)((char)(var4[var5] + var5) - var5) << 7 | (char)((char)(var4[var5] + var5) - var5) >>> 9) ^ var5) >>> 4) ^ 'ꤒ'))) ^ var5))) >>> 7 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 7 | (char)((char)(var4[var5] + var5) - var5) >>> 9) ^ var5) << 12 | (char)((char)((char)((char)(var4[var5] + var5) - var5) << 7 | (char)((char)(var4[var5] + var5) - var5) >>> 9) ^ var5) >>> 4) ^ 'ꤒ'))) ^ var5))) << 9) + '\uef4d') >>> 11 | (char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 7 | (char)((char)(var4[var5] + var5) - var5) >>> 9) ^ var5) << 12 | (char)((char)((char)((char)(var4[var5] + var5) - var5) << 7 | (char)((char)(var4[var5] + var5) - var5) >>> 9) ^ var5) >>> 4) ^ 'ꤒ'))) ^ var5))) >>> 7 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 7 | (char)((char)(var4[var5] + var5) - var5) >>> 9) ^ var5) << 12 | (char)((char)((char)((char)(var4[var5] + var5) - var5) << 7 | (char)((char)(var4[var5] + var5) - var5) >>> 9) ^ var5) >>> 4) ^ 'ꤒ'))) ^ var5))) << 9) + '\uef4d') << 5) + 9086) - '\ue5ea') ^ 24905))) ^ '\ue21d'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public List<Long> IilliliilIIi() {
      return List.copyOf(this.liIIIIiiil);
   }

   public int IIlllIlliIll() {
      return this.ilIIIIiiil;
   }

   public void liiiIIllIl(String blocker, int tick) {
      this.iIlIlllllill(blocker, tick, 0L);
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)(~((char)((char)(-var4[var5]) - '븪'))) + var5))))) ^ '\uf677') - '蒡') + 18099) + 23932) >>> 4 | (char)((char)((char)((char)((char)(-((char)(-((char)((char)(~((char)((char)(-var4[var5]) - '븪'))) + var5))))) ^ '\uf677') - '蒡') + 18099) + 23932) << 12) >>> 7 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)(~((char)((char)(-var4[var5]) - '븪'))) + var5))))) ^ '\uf677') - '蒡') + 18099) + 23932) >>> 4 | (char)((char)((char)((char)((char)(-((char)(-((char)((char)(~((char)((char)(-var4[var5]) - '븪'))) + var5))))) ^ '\uf677') - '蒡') + 18099) + 23932) << 12) << 9) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IiIlliIliiIl() {
      return this.llIIIIiiil;
   }

   public static String IliIlllilIi(String reason) {
      String var1 = reason == null ? "" : reason.toLowerCase(Locale.ROOT);
      if (!var1.contains(Iilllilliill<invokedynamic>()) && !var1.contains(Iilllilliill<invokedynamic>()) && !var1.contains(Iilllilliill<invokedynamic>())) {
         if (var1.contains(Iilllilliill<invokedynamic>())) {
            return Iilllilliill<invokedynamic>();
         } else if (var1.contains(Iilllilliill<invokedynamic>())) {
            return Iilllilliill<invokedynamic>();
         } else if (!var1.contains(Iilllilliill<invokedynamic>()) && !var1.contains(Iilllilliill<invokedynamic>())) {
            if (!var1.contains(Iilllilliill<invokedynamic>()) && !var1.contains(Iilllilliill<invokedynamic>()) && !var1.contains(Iilllilliill<invokedynamic>())) {
               if (!var1.contains(Iilllilliill<invokedynamic>()) && !var1.contains(Iilllilliill<invokedynamic>()) && !var1.contains(Iilllilliill<invokedynamic>())) {
                  if (var1.contains(Iilllilliill<invokedynamic>())) {
                     return Iilllilliill<invokedynamic>();
                  } else if (!var1.contains(Iilllilliill<invokedynamic>()) && !var1.contains(Iilllilliill<invokedynamic>())) {
                     return var1.contains(Iilllilliill<invokedynamic>()) ? Iilllilliill<invokedynamic>() : Iilllilliill<invokedynamic>();
                  } else {
                     return Iilllilliill<invokedynamic>();
                  }
               } else {
                  return Iilllilliill<invokedynamic>();
               }
            } else {
               return Iilllilliill<invokedynamic>();
            }
         } else {
            return Iilllilliill<invokedynamic>();
         }
      } else {
         return Iilllilliill<invokedynamic>();
      }
   }

   public String IlIlllIlilIl() {
      return this.IlIIIIiiil;
   }
}
