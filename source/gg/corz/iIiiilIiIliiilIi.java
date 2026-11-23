package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum iIiiilIiIliiilIi {
   lIIIIilIIi,
   IIIIIilIIi;

   public static final String IlIIIilIIi = "Reveals itself on 1 December";
   private static final long llIIIilIIi = 30000L;
   private static long ilIIIilIIi;
   private static boolean iiIIIilIIi;
   iIIIIilIIi;

   private static iIiiilIiIliiilIi IiIIIilIIi = IIIIIilIIi;
   private static long liIIIilIIi;

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) >>> 8 | (char)(var4[var5] << 10 | var4[var5] >>> 6) << 8) >>> 5 | (char)((char)(var4[var5] << 10 | var4[var5] >>> 6) >>> 8 | (char)(var4[var5] << 10 | var4[var5] >>> 6) << 8) << 11) + '멥') + var5) >>> 14 | (char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) >>> 8 | (char)(var4[var5] << 10 | var4[var5] >>> 6) << 8) >>> 5 | (char)((char)(var4[var5] << 10 | var4[var5] >>> 6) >>> 8 | (char)(var4[var5] << 10 | var4[var5] >>> 6) << 8) << 11) + '멥') + var5) << 2) + 'ﲈ') ^ 12509) ^ var5) + '苬') - 20377) - var5))) ^ '諓') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean lIiiIiIlilli() {
      long var3 = -7720697454406153339L;
      long var0 = System.currentTimeMillis();
      if (liIIIilIIi == 0L || var0 - liIIIilIIi > 30000L) {
         liIIIilIIi = var0;
         var3 ^= ((long)iliIiiliiiii(LocalDate.now()) << 32 ^ var3) & -1L << 32;
         iiIIIilIIi = (boolean)((int)(var3 >>> 32));
      }

      return iiIIIilIIi;
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) << 8 | (char)(var4[var5] >>> 11 | var4[var5] << 5) >>> 8))) - var5))) << 15 | (char)(-((char)((char)(-((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) << 8 | (char)(var4[var5] >>> 11 | var4[var5] << 5) >>> 8))) - var5))) >>> 1) ^ var5) - var5))) - 30983))) - 12515) ^ 21572))) >>> 1 | (char)(~((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) << 8 | (char)(var4[var5] >>> 11 | var4[var5] << 5) >>> 8))) - var5))) << 15 | (char)(-((char)((char)(-((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) << 8 | (char)(var4[var5] >>> 11 | var4[var5] << 5) >>> 8))) - var5))) >>> 1) ^ var5) - var5))) - 30983))) - 12515) ^ 21572))) << 15));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static iIiiilIiIliiilIi IliIlllilIi() {
      iIiiilIiIliiilIi var0 = liiiIIllIl();
      if (var0 != null) {
         return var0;
      } else {
         long var1 = System.currentTimeMillis();
         if (ilIIIilIIi == 0L || var1 - ilIIIilIIi > 30000L) {
            ilIIIilIIi = var1;
            iIiiilIiIliiilIi var3 = IIIllIIliIIl(LocalDate.now());
            IiIIIilIIi = var3 == iIIIIilIIi && !lIiiIiIlilli() ? IIIIIilIIi : var3;
         }

         return IiIIIilIIi;
      }
   }

   public static iIiiilIiIliiilIi IIIllIIliIIl(LocalDate d) {
      long var3 = -6387750233219705738L;
      var3 ^= ((long)d.getMonthValue() << 32 ^ var3) & -1L << 32;
      var3 ^= ((long)d.getDayOfMonth() ^ var3) & -1L >>> 32;
      if ((int)(var3 >>> 32) != 10 && ((int)(var3 >>> 32) != 11 || (int)var3 != 1)) {
         return (int)(var3 >>> 32) != 12 && ((int)(var3 >>> 32) != 1 || (int)var3 != 1) ? IIIIIilIIi : iIIIIilIIi;
      } else {
         return lIIIIilIIi;
      }
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8121640953637738612L ^ Long.rotateLeft(-5347644891555659796L, 56) ^ 5428165877374460588L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 5199973451242122347L ^ Long.rotateLeft(7661605845472098242L, 8) ^ -4104371442356229764L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7920690594898857742L ^ Long.rotateLeft(4858266237065449912L, 38) ^ -6632804390877646574L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 7757179212981603364L ^ Long.rotateLeft(5298811131046020774L, 60) ^ -9193632470736220557L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1220767997847977712L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -990494574729660491L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6077454351777981274L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -6754866657913017667L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -3687277098072805708L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -5173521757649188974L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Iiilliiliiil<invokedynamic>());
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

   public static int IlIlllIlilIl(LocalDate d) {
      return d.getMonthValue() == 1 ? d.getYear() - 1 : d.getYear();
   }

   public static iIiiilIiIliiilIi iIlIlllllill(String value, boolean christmasOpen) {
      long var4 = -5093044352701278874L;
      var4 ^= (-4294967296L ^ var4) & -1L << 32;
      switch (value.hashCode()) {
         case 525429805:
            if (value.equals(Illlllllilll<invokedynamic>())) {
               var4 ^= (0L ^ var4) & -1L << 32;
            }
            break;
         case 1235317602:
            if (value.equals(Illlllllilll<invokedynamic>())) {
               var4 ^= (4294967296L ^ var4) & -1L << 32;
            }
      }

      iIiiilIiIliiilIi var10000;
      switch ((int)(var4 >>> 32)) {
         case 0 -> var10000 = lIIIIilIIi;
         case 1 -> var10000 = christmasOpen ? iIIIIilIIi : lIIIIilIIi;
         default -> var10000 = null;
      }

      return var10000;
   }

   public static iIiiilIiIliiilIi liiiIIllIl() {
      Iiliililliliilil var0 = Iiliililliliilil.llllllllil;
      return var0 == null ? null : iIlIlllllill(var0.iIIillllil.Iilllilliill(), lIiiIiIlilli());
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + '肌')) + var5) >>> 3 | (char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + '肌')) + var5) << 13) + 'ꇴ') >>> 10 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + '肌')) + var5) >>> 3 | (char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + '肌')) + var5) << 13) + 'ꇴ') << 6) - var5) + 14618) + var5) + 17121));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean iliIiiliiiii(LocalDate d) {
      return IIIllIIliIIl(d) == iIIIIilIIi;
   }

   public static String IilliliilIIi(String christmasOpen, boolean value) {
      return !value && Illlllllilll<invokedynamic>().equals(christmasOpen) ? Illlllllilll<invokedynamic>() : christmasOpen;
   }

   // $FF: synthetic method
   private static iIiiilIiIliiilIi[] IIlllIlliIll() {
      return new iIiiilIiIliiilIi[]{IIIIIilIIi, lIIIIilIIi, iIIIIilIIi};
   }

   public static String IiIlliIliiIl(String base) {
      return base + Illlllllilll<invokedynamic>() + IlIlllIlilIl(LocalDate.now());
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ 20961) ^ '\udec4') ^ 8244) + 27033) - '튘'))) - var5) + var5) ^ '큶') ^ '\ue7dc') + 31330));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') >>> 4 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') << 12) << 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') >>> 4 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') << 12) >>> 10) >>> 9 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') >>> 4 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') << 12) << 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') >>> 4 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') << 12) >>> 10) << 7))) + var5) << 9 | (char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') >>> 4 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') << 12) << 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') >>> 4 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') << 12) >>> 10) >>> 9 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') >>> 4 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') << 12) << 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') >>> 4 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') << 12) >>> 10) << 7))) + var5) >>> 7))) << 2 | (char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') >>> 4 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') << 12) << 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') >>> 4 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') << 12) >>> 10) >>> 9 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') >>> 4 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') << 12) << 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') >>> 4 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') << 12) >>> 10) << 7))) + var5) << 9 | (char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') >>> 4 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') << 12) << 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') >>> 4 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') << 12) >>> 10) >>> 9 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') >>> 4 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') << 12) << 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') >>> 4 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - var5) ^ var5) + var5) ^ '\uf24b') - var5))) + '쨨') << 12) >>> 10) << 7))) + var5) >>> 7))) >>> 14))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
