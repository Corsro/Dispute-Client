package gg.corz;

import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_156;

public final class lIIiIiIiiIIiIiIi {
   private volatile String iIillIiIIi = IlIillIiilIi<invokedynamic>();
   private volatile int llillIiIIi;
   private volatile String lIillIiIIi = "";
   private static final Path lilllIiIIi = FabricLoader.getInstance().getGameDir().resolve(IlIillIiilIi<invokedynamic>()).resolve(IlIillIiilIi<invokedynamic>());
   private volatile boolean IlillIiIIi = false;
   private volatile iIilliIlIlilliIl IIillIiIIi;
   private final List<String> iilllIiIIi = new ArrayList();

   public String iliIiiliiiii() {
      return this.lIillIiIIi;
   }

   public void IiIlliIliiIl(String fileName) {
      long var6 = -172135104432614129L;
      if (fileName != null && !fileName.isBlank()) {
         Path var2 = lilllIiIIi.resolve(fileName);
         if (!Files.exists(var2, new LinkOption[0])) {
            this.iIillIiIIi = IlIillIiilIi<invokedynamic>() + fileName;
            Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IlIillIiilIi<invokedynamic>(), IlIillIiilIi<invokedynamic>(), false);
            this.iIlIlllllill();
         } else {
            this.IlillIiIIi = true;
            this.iIillIiIIi = IlIillIiilIi<invokedynamic>() + fileName + IlIillIiilIi<invokedynamic>();
            String var3 = fileName.toLowerCase();
            var6 ^= ((long)this.llillIiIIi << 32 ^ var6) & -1L << 32;
            Thread var5 = new Thread(() -> {
               try {
                  iIilliIlIlilliIl var5 = var3.endsWith(IlIillIiilIi<invokedynamic>()) ? iiiIlIiIIIllIi.IliIlllilIi(var2) : lliillIliliillIl.IliIlllilIi(var2);
                  if (ticket == this.llillIiIIi) {
                     this.IIillIiIIi = var5;
                     this.lIillIiIIi = fileName;
                     this.iIillIiIIi = var5.iliIiiiIll + IlIillIiilIi<invokedynamic>() + var5.iIIliiiIll + IlIillIiilIi<invokedynamic>();
                     Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IlIillIiilIi<invokedynamic>(), IlIillIiilIi<invokedynamic>() + var5.iliIiiiIll + IlIillIiilIi<invokedynamic>() + var5.iIIliiiIll + IlIillIiilIi<invokedynamic>(), true);
                     if (!var5.IlIliiiIll.isEmpty()) {
                        Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IlIillIiilIi<invokedynamic>(), var5.IlIliiiIll.size() + IlIillIiilIi<invokedynamic>(), false);
                     }

                     return;
                  }
               } catch (Exception var9) {
                  if (ticket == this.llillIiIIi) {
                     this.iIillIiIIi = IlIillIiilIi<invokedynamic>() + fileName;
                     Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IlIillIiilIi<invokedynamic>(), IlIillIiilIi<invokedynamic>(), false);
                     return;
                  }

                  return;
               } finally {
                  this.IlillIiIIi = false;
               }

            }, IlIillIiilIi<invokedynamic>());
            var5.setDaemon(true);
            var5.start();
         }
      }
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) - 'ꪎ') - '胷'))) - var5) >>> 8 | (char)((char)(~((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) - 'ꪎ') - '胷'))) - var5) << 8) - var5))))) << 2 | (char)(-((char)(~((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) - 'ꪎ') - '胷'))) - var5) >>> 8 | (char)((char)(~((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) - 'ꪎ') - '胷'))) - var5) << 8) - var5))))) >>> 14))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public lIIiIiIiiIIiIiIi() {
      liiiIIllIl();
      this.iIlIlllllill();
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 'ꃝ') + var5) << 11 | (char)((char)(var4[var5] - 'ꃝ') + var5) >>> 5) << 1 | (char)((char)((char)(var4[var5] - 'ꃝ') + var5) << 11 | (char)((char)(var4[var5] - 'ꃝ') + var5) >>> 5) >>> 15) - 11429) + '\ud9c9') ^ var5) ^ var5) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 'ꃝ') + var5) << 11 | (char)((char)(var4[var5] - 'ꃝ') + var5) >>> 5) << 1 | (char)((char)((char)(var4[var5] - 'ꃝ') + var5) << 11 | (char)((char)(var4[var5] - 'ꃝ') + var5) >>> 5) >>> 15) - 11429) + '\ud9c9') ^ var5) ^ var5) >>> 5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public List<String> IilliliilIIi() {
      return this.iilllIiIIi;
   }

   public void Illlllllilll() {
      this.Iilllilliill(1);
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) << 4 | (char)(var4[var5] ^ var5) >>> 12) ^ var5) << 1 | (char)((char)((char)(var4[var5] ^ var5) << 4 | (char)(var4[var5] ^ var5) >>> 12) ^ var5) >>> 15) >>> 11 | (char)((char)((char)((char)(var4[var5] ^ var5) << 4 | (char)(var4[var5] ^ var5) >>> 12) ^ var5) << 1 | (char)((char)((char)(var4[var5] ^ var5) << 4 | (char)(var4[var5] ^ var5) >>> 12) ^ var5) >>> 15) << 5) ^ 16565) - var5))) ^ var5) - var5))) - 2504) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public synchronized void iIlIlllllill() {
      liiiIIllIl();
      this.iilllIiIIi.clear();

      try {
         Stream var1 = Files.list(lilllIiIIi);

         try {
            Stream var10000 = var1.filter((p) -> {
               String var1 = p.getFileName().toString().toLowerCase();
               return var1.endsWith(IlIillIiilIi<invokedynamic>()) || var1.endsWith(IlIillIiilIi<invokedynamic>()) || var1.endsWith(IlIillIiilIi<invokedynamic>());
            }).map((p) -> p.getFileName().toString()).sorted(Comparator.naturalOrder());
            List var10001 = this.iilllIiIIi;
            Objects.requireNonNull(var10001);
            var10000.forEach(var10001::add);
         } catch (Throwable var5) {
            if (var1 != null) {
               try {
                  var1.close();
               } catch (Throwable var4) {
                  var5.addSuppressed(var4);
               }
            }

            throw var5;
         }

         if (var1 != null) {
            var1.close();
         }
      } catch (IOException var6) {
      }

      if (!this.iilllIiIIi.contains(this.lIillIiIIi)) {
         this.lIillIiIIi = "";
      }

   }

   public iIilliIlIlilliIl lIiiIiIlilli() {
      return this.IIillIiIIi;
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) + 3469) + '찝') - '\uf76f') - 28427))))) - var5) + var5) << 6 | (char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) + 3469) + '찝') - '\uf76f') - 28427))))) - var5) + var5) >>> 10) >>> 8 | (char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) + 3469) + '찝') - '\uf76f') - 28427))))) - var5) + var5) << 6 | (char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) + 3469) + '찝') - '\uf76f') - 28427))))) - var5) + var5) >>> 10) << 8) ^ var5))) ^ var5))) ^ 31427));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] - '袜'))) + '딜') + '\uf430') << 11 | (char)((char)((char)(-((char)(var4[var5] - '袜'))) + '딜') + '\uf430') >>> 5))) - var5) >>> 10 | (char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] - '袜'))) + '딜') + '\uf430') << 11 | (char)((char)((char)(-((char)(var4[var5] - '袜'))) + '딜') + '\uf430') >>> 5))) - var5) << 6) - 29066) ^ 28441) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -3122904448719959778L ^ Long.rotateLeft(1644333014179675721L, 23) ^ -2167346919949369341L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1204302888861007754L ^ Long.rotateLeft(-8635887586232841569L, 27) ^ -6339728014540891524L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6669353027213812475L ^ Long.rotateLeft(-8750880908560406107L, 16) ^ 5511304668426167705L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 5155642409857290120L ^ Long.rotateLeft(-4706336780807550795L, 24) ^ -2026838887721783415L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3775513921457203103L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 7394946198550607419L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2469640928748542534L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3256861510708619923L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 8038505141172957087L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 5615407229019867397L;
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

   public String IIIllIIliIIl() {
      return this.iIillIiIIi;
   }

   private void Iilllilliill(int dir) {
      long var3 = 6268093208415003581L;
      if (this.iilllIiIIi.isEmpty()) {
         this.iIillIiIIi = IlIillIiilIi<invokedynamic>();
      } else {
         var3 ^= ((long)this.iilllIiIIi.indexOf(this.lIillIiIIi) << 32 ^ var3) & -1L << 32;
         var3 ^= ((long)(((int)(var3 >>> 32) + dir + this.iilllIiIIi.size() * 2) % this.iilllIiIIi.size()) << 32 ^ var3) & -1L << 32;
         this.IiIlliIliiIl((String)this.iilllIiIIi.get((int)(var3 >>> 32)));
      }
   }

   private static void liiiIIllIl() {
      try {
         Files.createDirectories(lilllIiIIi);
      } catch (IOException var1) {
      }

   }

   public void IIillIiliIil() {
      ++this.llillIiIIi;
      this.IIillIiIIi = null;
      this.lIillIiIIi = "";
      this.iIillIiIIi = IlIillIiilIi<invokedynamic>();
   }

   public static Path IliIlllilIi() {
      return lilllIiIIi;
   }

   public void IIlllIlliIll() {
      this.Iilllilliill(-1);
   }

   public void IlIlllIlilIl() {
      liiiIIllIl();

      try {
         class_156.method_668().method_673(lilllIiIIi.toUri());
      } catch (Exception var2) {
         Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IlIillIiilIi<invokedynamic>(), IlIillIiilIi<invokedynamic>(), false);
      }

   }
}
