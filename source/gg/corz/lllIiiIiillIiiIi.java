package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class lllIiiIiillIiiIi {
   private final LinkedHashMap<String, Integer> IiiIiiiIIi;
   private static final iilllllIIillll[] lliIiiiIIi = iilllllIIillll.values();
   private final int[] iliIiiiIIi;
   private boolean IlIliiiIIi;
   private String llIliiiIIi;
   private int iiiIiiiIIi;
   private IlIIliIlllIIliIl liiIiiiIIi;
   public static final int iIiIiiiIIi = 4;
   public static final int IliIiiiIIi = 16;
   private int lIIliiiIIi;
   private int IIIliiiIIi;
   private iilllllIIillll ilIliiiIIi;
   private long iIIliiiIIi;
   public static final int lIiIiiiIIi = 40;

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] ^ 962) + var5))) - var5))) - var5) - 10170) >>> 12 | (char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] ^ 962) + var5))) - var5))) - var5) - 10170) << 4) + var5))) ^ 25625) + 14768) + '飹') - var5) >>> 5 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] ^ 962) + var5))) - var5))) - var5) - 10170) >>> 12 | (char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] ^ 962) + var5))) - var5))) - var5) - 10170) << 4) + var5))) ^ 25625) + 14768) + '飹') - var5) << 11))) - 7667) + 725) ^ '\uef38'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Ililllililil() {
      return this.IiiIiiiIIi.size();
   }

   public lllIiiIiillIiiIi() {
      this.iliIiiiIIi = new int[lliIiiiIIi.length];
      this.IiiIiiiIIi = new LinkedHashMap<String, Integer>(this, 0.75F, false) {
         protected boolean removeEldestEntry(Map.Entry<String, Integer> e) {
            return this.size() > 16;
         }
      };
      this.llIliiiIIi = "";
      this.ilIliiiIIi = iilllllIIillll.liIliiiiliiIliiiil;
   }

   public void Iiilliiliiil() {
      Arrays.fill(this.iliIiiiIIi, 0);
      this.IiiIiiiIIi.clear();
      this.liiIiiiIIi = null;
      this.iiiIiiiIIi = 0;
      this.IIIliiiIIi = 0;
      this.lIIliiiIIi = 0;
      this.iIIliiiIIi = 0L;
      this.IlIliiiIIi = false;
      this.llIliiiIIi = "";
      this.ilIliiiIIi = iilllllIIillll.liIliiiiliiIliiiil;
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(~((char)(~((char)((char)((char)((char)((char)(var4[var5] - '\ude50') - var5) + '욲') - '짾') + var5))))) - 27888)))) + var5))) << 8 | (char)(~((char)((char)((char)(~((char)((char)(~((char)(~((char)((char)((char)((char)((char)(var4[var5] - '\ude50') - var5) + '욲') - '짾') + var5))))) - 27888)))) + var5))) >>> 8) ^ var5) + var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) << 6) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) << 6) >>> 2) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) << 6) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) << 6) >>> 2) >>> 9) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) << 6) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) << 6) >>> 2) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) << 6) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) << 6) >>> 2) >>> 9) >>> 15) + '놥') >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) << 6) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) << 6) >>> 2) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) << 6) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) << 6) >>> 2) >>> 9) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) << 6) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) << 6) >>> 2) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) << 6) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '锭') ^ '졤') ^ 30004) + var5) - 'ꞙ') + 22480) << 6) >>> 2) >>> 9) >>> 15) + '놥') << 7));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IlIlllIlilIl(iilllllIIillll r) {
      return r == iilllllIIillll.liIliiiiliiIliiiil ? 0 : this.iliIiiiIIi[r.ordinal()];
   }

   public iilllllIIillll IliIlllilIi(IlIIliIlllIIliIl tick, int compressedTick, boolean now) {
      iilllllIIillll var4 = this.liiiIIllIl(tick, compressedTick, now);
      int var10002 = this.iliIiiiIIi[var4.ordinal()]++;
      this.ilIliiiIIi = var4;
      if (var4 == iilllllIIillll.liIliiiiliiIliiiil) {
         ++this.lIIliiiIIi;
         return var4;
      } else {
         ++this.IIIliiiIIi;
         this.liiIiiiIIi = tick;
         this.iiiIiiiIIi = compressedTick;
         this.IlIliiiIIi = false;
         if (var4 != iilllllIIillll.IlIliiiilllIliiiil && var4 != iilllllIIillll.ilIliiiilIiIliiiil) {
            this.iIIliiiIIi = 0L;
         } else {
            ++this.iIIliiiIIi;
         }

         return var4;
      }
   }

   public int IIlllIlliIll() {
      return this.iiiIiiiIIi;
   }

   public iilllllIIillll lIiiIiIlilli() {
      return this.ilIliiiIIi;
   }

   public String IIIilIIiiIIi() {
      long var6 = 8388443395004406274L;
      StringBuilder var1 = (new StringBuilder(128)).append(IlIillIiilIi<invokedynamic>()).append(this.IIIliiiIIi).append(IlIillIiilIi<invokedynamic>()).append(this.lIIliiiIIi).append(IlIillIiilIi<invokedynamic>()).append(this.iIIliiiIIi).append(IlIillIiilIi<invokedynamic>()).append(this.ilIliiiIIi).append(IlIillIiilIi<invokedynamic>()).append(this.iiiIiiiIIi);
      iilllllIIillll[] var2 = lliIiiiIIi;
      var6 ^= ((long)var2.length << 32 ^ var6) & -1L << 32;

      for(long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
         iilllllIIillll var5 = var2[(int)var9];
         if (var5 != iilllllIIillll.liIliiiiliiIliiiil && this.iliIiiiIIi[var5.ordinal()] > 0) {
            var1.append(' ').append(var5).append('=').append(this.iliIiiiIIi[var5.ordinal()]);
         }
      }

      var1.append(IlIillIiilIi<invokedynamic>()).append(this.IlIliiiIIi ? (this.llIliiiIIi.isEmpty() ? IlIillIiilIi<invokedynamic>() : this.llIliiiIIi) : IlIillIiilIi<invokedynamic>());
      return var1.toString();
   }

   public String Iilllilliill() {
      return this.llIliiiIIi;
   }

   public boolean IilliliilIIi() {
      return this.ilIliiiIIi != iilllllIIillll.liIliiiiliiIliiiil;
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)(~((char)((char)((char)((char)(-var4[var5]) ^ 22282) ^ var5) ^ 8051))))))) + 14903) ^ 19911) ^ var5) - 'ꈪ') - 28319) - var5) ^ '靫') - var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int iliIiiliiiii() {
      return this.IIIliiiIIi;
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8218570361414379028L ^ Long.rotateLeft(-260170891129385876L, 3) ^ -4223775581867030844L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -7907673389503107028L ^ Long.rotateLeft(250857407848630535L, 13) ^ -7932837922645337954L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -6166867952966228576L ^ Long.rotateLeft(8793081357970433655L, 10) ^ -7064961575608681850L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1380683002918742335L ^ Long.rotateLeft(-171909847342837957L, 4) ^ -951630258041132697L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -6669354795444299390L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5754549509920982391L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5866500741432250787L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -4665753441922591243L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 3667461061505599242L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6708076972806258838L;
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

   public long IiIlliIliiIl() {
      return this.iIIliiiIIi;
   }

   public boolean Illlllllilll() {
      return this.IlIliiiIIi;
   }

   public int IIIllIIliIIl() {
      return this.lIIliiiIIi;
   }

   private iilllllIIillll liiiIIllIl(IlIIliIlllIIliIl tick, int compressedTick, boolean now) {
      if (this.liiIiiiIIi == null) {
         return iilllllIIillll.IllIiiiillllIiiiil;
      } else if (tick.IliIlllilIi() != this.liiIiiiIIi.IliIlllilIi()) {
         return iilllllIIillll.illIiiiilIilIiiiil;
      } else if (tick.liiiIIllIl() != this.liiIiiiIIi.liiiIIllIl()) {
         return iilllllIIillll.lilIiiiiliilIiiiil;
      } else if (tick.iIlIlllllill() != this.liiIiiiIIi.iIlIlllllill()) {
         return iilllllIIillll.IIiIiiiillIiIiiiil;
      } else if (tick.IilliliilIIi() != this.liiIiiiIIi.IilliliilIIi()) {
         return iilllllIIillll.iIiIiiiilIliIiiiil;
      } else if (tick.lIiiIiIlilli() != this.liiIiiiIIi.lIiiIiIlilli()) {
         return iilllllIIillll.lliIiiiililiIiiiil;
      } else if (tick.iliIiiliiiii() != this.liiIiiiIIi.iliIiiliiiii()) {
         return iilllllIIillll.IiiIiiiilliiIiiiil;
      } else if (tick.IIIllIIliIIl() != this.liiIiiiIIi.IIIllIIliIIl()) {
         return iilllllIIillll.iiiIiiiilIIIliiiil;
      } else if (tick.IlIlllIlilIl() != this.liiIiiiIIi.IlIlllIlilIl()) {
         return iilllllIIillll.lIIliiiiliIIliiiil;
      } else if (this.IlIliiiIIi) {
         return iilllllIIillll.IlIliiiilllIliiiil;
      } else {
         return (long)compressedTick - (long)this.iiiIiiiIIi >= (now ? 160L : 40L) ? iilllllIIillll.ilIliiiilIiIliiiil : iilllllIIillll.liIliiiiliiIliiiil;
      }
   }

   public void iIlIlllllill(String why) {
      this.IlIliiiIIi = true;
      this.llIliiiIIi = why == null ? "" : why;
      this.IiiIiiiIIi.merge(this.llIliiiIIi, 1, Integer::sum);
   }

   public int IIillIiliIil(String why) {
      return (Integer)this.IiiIiiiIIi.getOrDefault(why == null ? "" : why, 0);
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '\ue5ea') - '핢') + '\uecac'))))) ^ var5))) ^ 25219) ^ var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
