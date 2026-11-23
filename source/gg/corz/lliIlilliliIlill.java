package gg.corz;

import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class lliIlilliliIlill {
   public final int IillIIiill;
   public final int lillIIiill;
   public final int lIllIIiill;
   public final int iiIlIIiill;
   public final int IIllIIiill;
   public final int IlllIIiill;
   public final int illlIIiill;
   public final String IIilIIiill;
   public final long iillIIiill;
   public final int llllIIiill;
   public final String liIlIIiill;
   public final int iIllIIiill;

   public String liiiIIllIl() {
      return this.IIilIIiill.substring(0, Math.min(4, this.IIilIIiill.length())).toUpperCase(Locale.ROOT);
   }

   private static String IIIllIIliIIl(JsonObject k, String o) {
      return k.has(o) ? k.get(o).getAsString() : "";
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(~((char)((char)(~((char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5)) << 8 | (char)((char)(var4[var5] ^ var5)) >>> 8) << 13 | (char)((char)((char)(var4[var5] ^ var5)) << 8 | (char)((char)(var4[var5] ^ var5)) >>> 8) >>> 3) + 19437) + var5))) >>> 2 | (char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5)) << 8 | (char)((char)(var4[var5] ^ var5)) >>> 8) << 13 | (char)((char)((char)(var4[var5] ^ var5)) << 8 | (char)((char)(var4[var5] ^ var5)) >>> 8) >>> 3) + 19437) + var5))) << 14) + var5))) + var5) ^ 19225))))) - var5))) ^ 'ꫪ'))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IilliliilIIi(lliIlilliliIlill other) {
      if (other == null) {
         return IiIlliIliiIl<invokedynamic>();
      } else if (this.IIilIIiill.equals(other.IIilIIiill)) {
         return null;
      } else if (!this.liIlIIiill.equals(other.liIlIIiill)) {
         return IiIlliIliiIl<invokedynamic>() + this.liIlIIiill + IiIlliIliiIl<invokedynamic>() + other.liIlIIiill + IiIlliIliiIl<invokedynamic>();
      } else if (this.iiIlIIiill == other.iiIlIIiill && this.IIllIIiill == other.IIllIIiill && this.lIllIIiill == other.lIllIIiill) {
         if (this.IlllIIiill == other.IlllIIiill && this.llllIIiill == other.llllIIiill && this.illlIIiill == other.illlIIiill) {
            if (this.IillIIiill != other.IillIIiill) {
               return IiIlliIliiIl<invokedynamic>();
            } else {
               return this.lillIIiill != other.lillIIiill ? IiIlliIliiIl<invokedynamic>() : IiIlliIliiIl<invokedynamic>();
            }
         } else {
            return IiIlliIliiIl<invokedynamic>();
         }
      } else {
         return IiIlliIliiIl<invokedynamic>();
      }
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) - 1419) - '믺') ^ var5) >>> 1 | (char)((char)((char)((char)((char)(~var4[var5]) ^ var5) - 1419) - '믺') ^ var5) << 15) - 16933))) - '\udef6') << 6 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) - 1419) - '믺') ^ var5) >>> 1 | (char)((char)((char)((char)((char)(~var4[var5]) ^ var5) - 1419) - '믺') ^ var5) << 15) - 16933))) - '\udef6') >>> 10) ^ var5) - '뜵'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public JsonObject lIiiIiIlilli() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(IiIlliIliiIl<invokedynamic>(), this.liIlIIiill);
      var1.addProperty(IiIlliIliiIl<invokedynamic>(), this.iiIlIIiill);
      var1.addProperty(IiIlliIliiIl<invokedynamic>(), this.IIllIIiill);
      var1.addProperty(IiIlliIliiIl<invokedynamic>(), this.lIllIIiill);
      var1.addProperty(IiIlliIliiIl<invokedynamic>(), this.iIllIIiill);
      var1.addProperty(IiIlliIliiIl<invokedynamic>(), this.IlllIIiill);
      var1.addProperty(IiIlliIliiIl<invokedynamic>(), this.llllIIiill);
      var1.addProperty(IiIlliIliiIl<invokedynamic>(), this.illlIIiill);
      var1.addProperty(IiIlliIliiIl<invokedynamic>(), this.IillIIiill);
      var1.addProperty(IiIlliIliiIl<invokedynamic>(), this.lillIIiill);
      var1.addProperty(IiIlliIliiIl<invokedynamic>(), Long.toHexString(this.iillIIiill));
      var1.addProperty(IiIlliIliiIl<invokedynamic>(), this.IIilIIiill);
      return var1;
   }

   public static lliIlilliliIlill iliIiiliiiii(JsonObject o) {
      if (o == null) {
         return null;
      } else {
         try {
            long var1 = 0L;
            if (o.has(IiIlliIliiIl<invokedynamic>())) {
               try {
                  var1 = Long.parseUnsignedLong(o.get(IiIlliIliiIl<invokedynamic>()).getAsString(), 16);
               } catch (Exception var4) {
               }
            }

            return new lliIlilliliIlill(IIIllIIliIIl(o, IiIlliIliiIl<invokedynamic>()), IlIlllIlilIl(o, IiIlliIliiIl<invokedynamic>()), IlIlllIlilIl(o, IiIlliIliiIl<invokedynamic>()), IlIlllIlilIl(o, IiIlliIliiIl<invokedynamic>()), IlIlllIlilIl(o, IiIlliIliiIl<invokedynamic>()), IlIlllIlilIl(o, IiIlliIliiIl<invokedynamic>()), IlIlllIlilIl(o, IiIlliIliiIl<invokedynamic>()), IlIlllIlilIl(o, IiIlliIliiIl<invokedynamic>()), IlIlllIlilIl(o, IiIlliIliiIl<invokedynamic>()), IlIlllIlilIl(o, IiIlliIliiIl<invokedynamic>()), var1);
         } catch (Exception var5) {
            return null;
         }
      }
   }

   public lliIlilliliIlill(String width, int cellCount, int length, int originX, int height, int cellDigest, int mirrorIndex, int schematicName, int originZ, int rotationIndex, long originY) {
      this.liIlIIiill = width == null ? "" : width;
      this.iiIlIIiill = cellCount;
      this.IIllIIiill = length;
      this.lIllIIiill = originX;
      this.iIllIIiill = height;
      this.IlllIIiill = cellDigest;
      this.llllIIiill = mirrorIndex;
      this.illlIIiill = schematicName;
      this.IillIIiill = originZ;
      this.lillIIiill = rotationIndex;
      this.iillIIiill = originY;
      this.IIilIIiill = this.IliIlllilIi();
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ '\uf3ab') ^ var5) ^ var5) - var5) + 6592) + '\ue8fe') + 26640) << 12 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ '\uf3ab') ^ var5) ^ var5) - var5) + 6592) + '\ue8fe') + 26640) >>> 4) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ '\uf3ab') ^ var5) ^ var5) - var5) + 6592) + '\ue8fe') + 26640) << 12 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ '\uf3ab') ^ var5) ^ var5) - var5) + 6592) + '\ue8fe') + 26640) >>> 4) << 5))) + var5))) >>> 12 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ '\uf3ab') ^ var5) ^ var5) - var5) + 6592) + '\ue8fe') + 26640) << 12 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ '\uf3ab') ^ var5) ^ var5) - var5) + 6592) + '\ue8fe') + 26640) >>> 4) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ '\uf3ab') ^ var5) ^ var5) - var5) + 6592) + '\ue8fe') + 26640) << 12 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ '\uf3ab') ^ var5) ^ var5) - var5) + 6592) + '\ue8fe') + 26640) >>> 4) << 5))) + var5))) << 4) << 2 | (char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ '\uf3ab') ^ var5) ^ var5) - var5) + 6592) + '\ue8fe') + 26640) << 12 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ '\uf3ab') ^ var5) ^ var5) - var5) + 6592) + '\ue8fe') + 26640) >>> 4) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ '\uf3ab') ^ var5) ^ var5) - var5) + 6592) + '\ue8fe') + 26640) << 12 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ '\uf3ab') ^ var5) ^ var5) - var5) + 6592) + '\ue8fe') + 26640) >>> 4) << 5))) + var5))) >>> 12 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ '\uf3ab') ^ var5) ^ var5) - var5) + 6592) + '\ue8fe') + 26640) << 12 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ '\uf3ab') ^ var5) ^ var5) - var5) + 6592) + '\ue8fe') + 26640) >>> 4) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ '\uf3ab') ^ var5) ^ var5) - var5) + 6592) + '\ue8fe') + 26640) << 12 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ '\uf3ab') ^ var5) ^ var5) - var5) + 6592) + '\ue8fe') + 26640) >>> 4) << 5))) + var5))) << 4) >>> 14) + 8852));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private String IliIlllilIi() {
      long var6 = -1821740498711119414L;
      String var1 = this.liIlIIiill + '|' + this.iiIlIIiill + 'x' + this.IIllIIiill + 'x' + this.lIllIIiill + '|' + this.iIllIIiill + '|' + this.IlllIIiill + ',' + this.llllIIiill + ',' + this.illlIIiill + '|' + this.IillIIiill + '|' + this.lillIIiill + '|' + Long.toHexString(this.iillIIiill);

      try {
         MessageDigest var2 = MessageDigest.getInstance(IiIlliIliiIl<invokedynamic>());
         byte[] var3 = var2.digest(var1.getBytes(StandardCharsets.UTF_8));
         StringBuilder var4 = new StringBuilder(16);

         for(long var9 = var6 ^ (0L ^ var6) & -1L << 32; (int)(var9 >>> 32) < 8; var9 += 4294967296L) {
            var4.append(Character.forDigit(var3[(int)(var9 >>> 32)] >> 4 & 15, 16)).append(Character.forDigit(var3[(int)(var9 >>> 32)] & 15, 16));
         }

         return var4.toString();
      } catch (Exception var8) {
         return Integer.toHexString(var1.hashCode());
      }
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1418523397669793066L ^ Long.rotateLeft(-6543536403686083596L, 38) ^ -2897366475330514071L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2239676157558366319L ^ Long.rotateLeft(-3666240515342536451L, 47) ^ 7659685557661163720L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 435759576819163078L ^ Long.rotateLeft(804791776297056208L, 3) ^ -7803645515525323202L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6032017488599963133L ^ Long.rotateLeft(8066466403182468494L, 56) ^ -4463635178289196062L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2353940265866564902L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 3189137333700820442L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 8996583119665911885L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5371924066845527420L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 2711218352538943111L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6920716050951848885L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIlllIlliIll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Illlllllilll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iilllilliill<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIillIiliIil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Ililllililil<invokedynamic>());
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
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 20516) - '뫡') >>> 14 | (char)((char)(var4[var5] ^ 20516) - '뫡') << 2) + '칗') - var5) >>> 12 | (char)((char)((char)((char)((char)(var4[var5] ^ 20516) - '뫡') >>> 14 | (char)((char)(var4[var5] ^ 20516) - '뫡') << 2) + '칗') - var5) << 4) + 'ￛ'))))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean iIlIlllllill(lliIlilliliIlill other) {
      return other != null && this.IIilIIiill.equals(other.IIilIIiill);
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - 3272) - '뷻') >>> 13 | (char)((char)(var4[var5] - 3272) - '뷻') << 3) - var5) + 'ꎐ'))) >>> 8 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - 3272) - '뷻') >>> 13 | (char)((char)(var4[var5] - 3272) - '뷻') << 3) - var5) + 'ꎐ'))) << 8))) ^ '\ue0d9') ^ var5) >>> 10 | (char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - 3272) - '뷻') >>> 13 | (char)((char)(var4[var5] - 3272) - '뷻') << 3) - var5) + 'ꎐ'))) >>> 8 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - 3272) - '뷻') >>> 13 | (char)((char)(var4[var5] - 3272) - '뷻') << 3) - var5) + 'ꎐ'))) << 8))) ^ '\ue0d9') ^ var5) << 6));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static int IlIlllIlilIl(JsonObject o, String k) {
      return o.has(k) ? o.get(k).getAsInt() : 0;
   }
}
