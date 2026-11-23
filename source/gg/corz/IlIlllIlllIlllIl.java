package gg.corz;

import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.fabricmc.loader.api.FabricLoader;

public final class IlIlllIlllIlllIl {
   private static final Pattern IlilliIiIl = Pattern.compile(lilIliilIl<invokedynamic>());
   private static final long liilliIiIl = Long.MIN_VALUE;
   private final ConcurrentLinkedQueue<llililililililil> IIliliIiIl = new ConcurrentLinkedQueue();
   private final LinkedHashMap<String, IIiliIIilIiliIIi> iiIiliIiIl = new LinkedHashMap(16, 0.75F, true);
   public static final int IillliIiIl = 200;
   private static final String IlIiliIiIl = "corz-bot-learn";
   private static final int iiilliIiIl = 0;
   private static final long IiilliIiIl = 60000L;
   private static final String llilliIiIl = ".json";
   private final ConcurrentLinkedQueue<IIiliIIilIiliIIi> lIliliIiIl = new ConcurrentLinkedQueue();
   private boolean llliliIiIl;
   private static final int IIIiliIiIl = 1;
   private final Supplier<Path> llIiliIiIl;
   private static final Pattern lIilliIiIl = Pattern.compile(lilIliilIl<invokedynamic>());
   private volatile int IlliliIiIl = -1;
   private final Executor ilIiliIiIl;
   private static final String ililliIiIl = ".json.tmp";
   private final LongSupplier IiIiliIiIl;
   private boolean illiliIiIl;
   public static final long iillliIiIl = 30000L;
   private static final Pattern iIilliIiIl = Pattern.compile(lilIliilIl<invokedynamic>());
   private static final int lIIiliIiIl = 2;
   private volatile Path iIliliIiIl;
   private static final int iIIiliIiIl = 16;
   public static final int lillliIiIl = 64;
   private static final Pattern IIilliIiIl = Pattern.compile(lilIliilIl<invokedynamic>());
   private final Random liIiliIiIl;

   private static int Illillliilli(Path d) {
      long var5 = -8897619128645230595L;
      var5 ^= (0L ^ var5) & -1L << 32;
      DirectoryStream var2 = Files.newDirectoryStream(d);

      try {
         for(Path var4 : var2) {
            if (iIilliIiIl.matcher(var4.getFileName().toString()).matches() && Files.isRegularFile(var4, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})) {
               var5 += 4294967296L;
            }
         }
      } catch (Throwable var8) {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Throwable var7) {
               var8.addSuppressed(var7);
            }
         }

         throw var8;
      }

      if (var2 != null) {
         var2.close();
      }

      return (int)(var5 >>> 32);
   }

   private String IIIIllIIIl(IIiliIIilIiliIIi e) {
      if (e.lIIliliiil.IIlllIlliIll()) {
         return lilIliilIl<invokedynamic>();
      } else {
         return e.iIIliliiil == 1 ? lilIliilIl<invokedynamic>() : lilIliilIl<invokedynamic>();
      }
   }

   public void iIlIlllllill(boolean on) {
      long var5 = -3376519870983663716L;
      var5 ^= ((long)this.llliliIiIl << 32 ^ var5) & -1L << 32;
      this.llliliIiIl = on;
      if (on && (int)(var5 >>> 32) == 0) {
         for(IIiliIIilIiliIIi var4 : new ArrayList(this.iiIiliIiIl.values())) {
            this.IIillIiliIil(var4);
         }
      }

   }

   private void IIIilIIiiIIi(IIiliIIilIiliIIi key, String e) {
      ililllilIiilllil var3 = null;

      try {
         if (!IIiIIllIiIIl.IliIlllilIi()) {
            Path var4 = this.Iiiiliiiiiii();
            Path var5 = var4.resolve(e + lilIliilIl<invokedynamic>());
            if (Files.isRegularFile(var5, new LinkOption[]{LinkOption.NOFOLLOW_LINKS}) && Files.size(var5) <= 16384L) {
               String var6 = Iilililiiili(var5);
               if (var6 != null) {
                  var3 = IIIIIillIIIIil.liiiIIllIl(var6);
               }
            }

            if (Files.isDirectory(var4, new LinkOption[0])) {
               this.IlliliIiIl = Illillliilli(var4);
            }
         }
      } catch (IOException | RuntimeException var7) {
         IiIIlliIIl(lilIliilIl<invokedynamic>(), var7);
      }

      this.IIliliIiIl.add(new llililililililil(key, var3));
   }

   public static String liiiIIllIl(String playerName) {
      if (playerName == null) {
         return null;
      } else {
         String var1 = playerName.toLowerCase(Locale.ROOT);
         return IIilliIiIl.matcher(var1).matches() ? lilIliilIl<invokedynamic>() + var1 : null;
      }
   }

   private void Iilllilliill(IIiliIIilIiliIIi force, boolean e) {
      long var9 = -3078693380840074444L;
      ilIliliIiIlili var3 = force.lIIliliiil;
      if (this.llliliIiIl && var3.iIlIlllllill() != null && var3.Illlllllilll() && !IIiIIllIiIIl.IliIlllilIi()) {
         if (force.iIIliliiil != 2) {
            this.IIillIiliIil(force);
         } else {
            long var4 = this.IiIiliIiIl.getAsLong();
            if (e || force.IlIliliiil == Long.MIN_VALUE || var4 < force.IlIliliiil || var4 - force.IlIliliiil >= 30000L) {
               String var6 = IIIIIillIIIIil.IliIlllilIi(var3.IIillIiliIil(var4));
               if (var6 != null) {
                  force.IlIliliiil = var4;
                  var9 ^= ((long)(!this.illiliIiIl ? 1 : 0) << 32 ^ var9) & -1L << 32;
                  this.illiliIiIl = true;
                  String var8 = var3.iIlIlllllill();
                  this.Iiilliiliiil(() -> this.IlIillIiilIi(force, var8, var6, prune));
               }
            }
         }
      }
   }

   private static long IIiilIiiiIii(Path p) {
      return Files.getLastModifiedTime(p, LinkOption.NOFOLLOW_LINKS).toMillis();
   }

   public String IIlllIlliIll() {
      long var8 = 7240874722101169648L;
      StringBuilder var1 = new StringBuilder(lilIliilIl<invokedynamic>());

      Path var2;
      try {
         var2 = this.Iiiiliiiiiii();
      } catch (RuntimeException var10) {
         var2 = null;
      }

      var1.append(var2 == null ? lilIliilIl<invokedynamic>() : var2.toString());
      var1.append(lilIliilIl<invokedynamic>()).append(this.llliliIiIl ? lilIliilIl<invokedynamic>() : lilIliilIl<invokedynamic>());
      var8 ^= ((long)this.IlliliIiIl << 32 ^ var8) & -1L << 32;
      var1.append(lilIliilIl<invokedynamic>()).append((int)(var8 >>> 32) < 0 ? lilIliilIl<invokedynamic>() : String.valueOf((int)(var8 >>> 32)));
      ArrayList var4 = new ArrayList(this.iiIiliIiIl.values());
      Collections.reverse(var4);
      var8 ^= (0L ^ var8) & -1L >>> 32;

      for(IIiliIIilIiliIIi var7 : var4) {
         int var10000 = (int)var8;
         var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32;
         if (var10000 >= 16) {
            break;
         }

         var1.append(' ').append(var7.lIIliliiil.iIlIlllllill() == null ? lilIliilIl<invokedynamic>() : var7.lIIliliiil.iIlIlllllill()).append(':').append(var7.lIIliliiil.IlIlllIlilIl()).append(':').append(this.IIIIllIIIl(var7));
      }

      return var1.toString();
   }

   private void IIillIiliIil(IIiliIIilIiliIIi e) {
      String var2 = e.lIIliliiil.iIlIlllllill();
      if (e.iIIliliiil == 0 && var2 != null && this.llliliIiIl && !IIiIIllIiIIl.IliIlllilIi()) {
         e.iIIliliiil = 1;
         if (!this.Iiilliiliiil(() -> this.IIIilIIiiIIi(e, var2))) {
            e.iIIliliiil = 0;
         }

      }
   }

   // $FF: synthetic method
   private static CallSite IIiIllIiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) ^ '鞥') + var5) - 21685))) ^ '룴') + var5))) + var5) << 10 | (char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) ^ '鞥') + var5) - 21685))) ^ '룴') + var5))) + var5) >>> 6) - var5) + var5) ^ 26119) + '閭') ^ 6395))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIiIlIliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) + var5) - '螥') ^ var5) + '션') - 9098) - var5))) - '\ue8b2'))) - var5))) >>> 3 | (char)(~((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) + var5) - '螥') ^ var5) + '션') - 9098) - var5))) - '\ue8b2'))) - var5))) << 13) << 15 | (char)((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) + var5) - '螥') ^ var5) + '션') - 9098) - var5))) - '\ue8b2'))) - var5))) >>> 3 | (char)(~((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) + var5) - '螥') ^ var5) + '션') - 9098) - var5))) - '\ue8b2'))) - var5))) << 13) >>> 1) << 14 | (char)((char)((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) + var5) - '螥') ^ var5) + '션') - 9098) - var5))) - '\ue8b2'))) - var5))) >>> 3 | (char)(~((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) + var5) - '螥') ^ var5) + '션') - 9098) - var5))) - '\ue8b2'))) - var5))) << 13) << 15 | (char)((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) + var5) - '螥') ^ var5) + '션') - 9098) - var5))) - '\ue8b2'))) - var5))) >>> 3 | (char)(~((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) + var5) - '螥') ^ var5) + '션') - 9098) - var5))) - '\ue8b2'))) - var5))) << 13) >>> 1) >>> 2) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiiIlliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) >>> 15 | (char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) << 1) << 14 | (char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) >>> 15 | (char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) << 1) >>> 2) << 3 | (char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) >>> 15 | (char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) << 1) << 14 | (char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) >>> 15 | (char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) << 1) >>> 2) >>> 13) + '뵅'))))) + 591) ^ 29481) >>> 8 | (char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) >>> 15 | (char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) << 1) << 14 | (char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) >>> 15 | (char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) << 1) >>> 2) << 3 | (char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) >>> 15 | (char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) << 1) << 14 | (char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) >>> 15 | (char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) << 1) >>> 2) >>> 13) + '뵅'))))) + 591) ^ 29481) << 8) + '\ueca2') - 22547) + '\udcd8') ^ 12029));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IiIlliIliiIl(String name) {
      this.iiIiliIiIl.remove(llIIlilIIl(name));
      String var2 = liiiIIllIl(name);
      if (var2 != null && this.llliliIiIl && !IIiIIllIiIIl.IliIlllilIi()) {
         this.Iiilliiliiil(() -> this.IiIiliIiiiIi(var2));
      }
   }

   private static String llIIlilIIl(String name) {
      return name == null ? "" : name.toLowerCase(Locale.ROOT);
   }

   // $FF: synthetic method
   private static CallSite lilIliilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2749273596826742175L ^ Long.rotateLeft(5437442818627719958L, 33) ^ -7723781824309583262L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5770380514753545340L ^ Long.rotateLeft(-4099541478348845733L, 10) ^ -3382999132125040270L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 185852420100729797L ^ Long.rotateLeft(-8666124024801280117L, 58) ^ 6395005559944372895L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1327284225931206200L ^ Long.rotateLeft(1809362784971122141L, 24) ^ 7573089064591035886L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -5713461165857590602L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 7227982926184051507L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4229819362818932748L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2582516937140272203L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 7998849860877005677L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4006517275812655872L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIiIllIiIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iIiIlIliIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, lliIliliIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IiiIlliiIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iiiIlIIIll<invokedynamic>());
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

   public static IlIlllIlllIlllIl IliIlllilIi() {
      return new IlIlllIlllIlllIl(IlIlllIlllIlllIl::iiIIlIIlIl, new liiliiiliiiliiil(), System::currentTimeMillis, new Random());
   }

   private void IiIiliIiiiIi(String key) {
      if (!IIiIIllIiIIl.IliIlllilIi() && lIilliIiIl.matcher(key).matches()) {
         try {
            Path var2 = this.Iiiiliiiiiii();
            Files.deleteIfExists(var2.resolve(key + lilIliilIl<invokedynamic>()));
            Files.deleteIfExists(var2.resolve(key + lilIliilIl<invokedynamic>()));
            if (Files.isDirectory(var2, new LinkOption[0])) {
               this.IlliliIiIl = Illillliilli(var2);
            }
         } catch (RuntimeException | IOException var3) {
            IiIIlliIIl(lilIliilIl<invokedynamic>(), var3);
         }

      }
   }

   public String Illlllllilll(ilIliliIiIlili p) {
      if (p == null) {
         return lilIliilIl<invokedynamic>();
      } else {
         IIiliIIilIiliIIi var2 = (IIiliIIilIiliIIi)this.iiIiliIiIl.get(llIIlilIIl(p.IliIlllilIi()));
         String var3 = !this.llliliIiIl ? lilIliilIl<invokedynamic>() : (p.iIlIlllllill() == null ? lilIliilIl<invokedynamic>() : p.iIlIlllllill());
         String var4 = var2 != null && var2.lIIliliiil == p ? this.IIIIllIIIl(var2) : (p.IIlllIlliIll() ? lilIliilIl<invokedynamic>() : lilIliilIl<invokedynamic>());
         return var3 + lilIliilIl<invokedynamic>() + p.IlIlllIlilIl() + lilIliilIl<invokedynamic>() + var4;
      }
   }

   // $FF: synthetic method
   private static CallSite lliIliliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + 17616) - '鴂') ^ var5) - var5) ^ 15944))) << 15 | (char)(~((char)((char)((char)((char)((char)(var4[var5] + 17616) - '鴂') ^ var5) - var5) ^ 15944))) >>> 1))) + 5421) + var5) - var5) << 14 | (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + 17616) - '鴂') ^ var5) - var5) ^ 15944))) << 15 | (char)(~((char)((char)((char)((char)((char)(var4[var5] + 17616) - '鴂') ^ var5) - var5) ^ 15944))) >>> 1))) + 5421) + var5) - var5) >>> 2) >>> 14 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + 17616) - '鴂') ^ var5) - var5) ^ 15944))) << 15 | (char)(~((char)((char)((char)((char)((char)(var4[var5] + 17616) - '鴂') ^ var5) - var5) ^ 15944))) >>> 1))) + 5421) + var5) - var5) << 14 | (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + 17616) - '鴂') ^ var5) - var5) ^ 15944))) << 15 | (char)(~((char)((char)((char)((char)((char)(var4[var5] + 17616) - '鴂') ^ var5) - var5) ^ 15944))) >>> 1))) + 5421) + var5) - var5) >>> 2) << 2) + 10058))))) << 12 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + 17616) - '鴂') ^ var5) - var5) ^ 15944))) << 15 | (char)(~((char)((char)((char)((char)((char)(var4[var5] + 17616) - '鴂') ^ var5) - var5) ^ 15944))) >>> 1))) + 5421) + var5) - var5) << 14 | (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + 17616) - '鴂') ^ var5) - var5) ^ 15944))) << 15 | (char)(~((char)((char)((char)((char)((char)(var4[var5] + 17616) - '鴂') ^ var5) - var5) ^ 15944))) >>> 1))) + 5421) + var5) - var5) >>> 2) >>> 14 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + 17616) - '鴂') ^ var5) - var5) ^ 15944))) << 15 | (char)(~((char)((char)((char)((char)((char)(var4[var5] + 17616) - '鴂') ^ var5) - var5) ^ 15944))) >>> 1))) + 5421) + var5) - var5) << 14 | (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + 17616) - '鴂') ^ var5) - var5) ^ 15944))) << 15 | (char)(~((char)((char)((char)((char)((char)(var4[var5] + 17616) - '鴂') ^ var5) - var5) ^ 15944))) >>> 1))) + 5421) + var5) - var5) >>> 2) << 2) + 10058))))) >>> 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void Ililllililil() {
      Iterator var1 = this.iiIiliIiIl.values().iterator();

      while(this.iiIiliIiIl.size() > 64 && var1.hasNext()) {
         IIiliIIilIiliIIi var2 = (IIiliIIilIiliIIi)var1.next();
         var1.remove();
         if (var2.lIIliliiil.Illlllllilll()) {
            this.Iilllilliill(var2, true);
         }
      }

   }

   public void iliIiiliiiii() {
      llililililililil var1;
      while((var1 = (llililililililil)this.IIliliIiIl.poll()) != null) {
         IIiliIIilIiliIIi var2 = var1.IliIlllilIi();
         var2.iIIliliiil = 2;
         ililllilIiilllil var3 = var1.liiiIIllIl();
         if (var3 != null && iIIIlIlIIl(var2.lIIliliiil.liiiIIllIl(), var3.lIiiIiIlilli())) {
            var2.lIIliliiil.Ililllililil(var3);
         }
      }

      IIiliIIilIiliIIi var4;
      while((var4 = (IIiliIIilIiliIIi)this.lIliliIiIl.poll()) != null) {
         var4.IlIliliiil = Long.MIN_VALUE;
         var4.lIIliliiil.Iilllilliill();
      }

   }

   private static String Iilililiiili(Path file) {
      InputStream var1 = Files.newInputStream(file);

      String var6;
      label43: {
         try {
            byte[] var2 = var1.readNBytes(16385);
            if (var2.length > 16384) {
               var6 = null;
               break label43;
            }

            var6 = new String(var2, StandardCharsets.UTF_8);
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

         return var6;
      }

      if (var1 != null) {
         var1.close();
      }

      return var6;
   }

   public boolean IilliliilIIi() {
      return this.llliliIiIl;
   }

   private static Path iiIIlIIlIl() {
      try {
         return FabricLoader.getInstance().getConfigDir().resolve(lilIliilIl<invokedynamic>()).resolve(lilIliilIl<invokedynamic>()).resolve(lilIliilIl<invokedynamic>());
      } catch (Throwable var1) {
         return Path.of(System.getProperty(lilIliilIl<invokedynamic>()), lilIliilIl<invokedynamic>(), lilIliilIl<invokedynamic>(), lilIliilIl<invokedynamic>(), lilIliilIl<invokedynamic>());
      }
   }

   private static boolean iIIIlIlIIl(UUID u, String s) {
      return u != null && s != null && u.toString().equalsIgnoreCase(s);
   }

   public void IlIlllIlilIl() {
      for(IIiliIIilIiliIIi var2 : new ArrayList(this.iiIiliIiIl.values())) {
         if (var2.lIIliliiil.Illlllllilll()) {
            this.Iilllilliill(var2, true);
         }
      }

   }

   private void IlIillIiilIi(IIiliIIilIiliIIi text, String prune, String owner, boolean key) {
      long var10 = -3689444274420553165L;
      if (!IIiIIllIiIIl.IliIlllilIi() && lIilliIiIl.matcher(prune).matches()) {
         byte[] var5 = owner.getBytes(StandardCharsets.UTF_8);
         if (var5.length <= 16384) {
            Path var7 = null;

            Path var6;
            try {
               var6 = this.Iiiiliiiiiii();
               Files.createDirectories(var6);
               Path var8 = var6.resolve(prune + lilIliilIl<invokedynamic>());
               var7 = var6.resolve(prune + lilIliilIl<invokedynamic>());
               Files.write(var7, var5, new OpenOption[]{StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE});
               if (IIiIIllIiIIl.IliIlllilIi()) {
                  Files.deleteIfExists(var7);
                  return;
               }

               try {
                  Files.move(var7, var8, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
               } catch (AtomicMoveNotSupportedException var12) {
                  Files.move(var7, var8, StandardCopyOption.REPLACE_EXISTING);
               }

               var7 = null;
            } catch (RuntimeException | IOException var14) {
               IiIIlliIIl(lilIliilIl<invokedynamic>(), var14);
               if (var7 != null) {
                  Iliilliiilii(var7);
               }

               this.lIliliIiIl.add(text);
               return;
            }

            try {
               var10 ^= ((long)Illillliilli(var6) << 32 ^ var10) & -1L << 32;
               if (key || (int)(var10 >>> 32) > 200) {
                  this.IIlilIliiIli(var6, prune);
                  var10 ^= ((long)Illillliilli(var6) << 32 ^ var10) & -1L << 32;
               }

               this.IlliliIiIl = (int)(var10 >>> 32);
            } catch (IOException | RuntimeException var13) {
               IiIIlliIIl(lilIliilIl<invokedynamic>(), var13);
            }

         }
      }
   }

   private static void Iliilliiilii(Path p) {
      try {
         Files.deleteIfExists(p);
      } catch (IOException | RuntimeException var2) {
         IiIIlliIIl(lilIliilIl<invokedynamic>(), var2);
      }

   }

   public ilIliliIiIlili lIiiIiIlilli(String name, UUID uuid) {
      String var3 = llIIlilIIl(name);
      IIiliIIilIiliIIi var4 = (IIiliIIilIiliIIi)this.iiIiliIiIl.get(var3);
      if (var4 != null && uuid != null && !uuid.equals(var4.lIIliliiil.liiiIIllIl())) {
         this.iiIiliIiIl.remove(var3);
         var4 = null;
      }

      if (var4 == null) {
         var4 = new IIiliIIilIiliIIi(new ilIliliIiIlili(name, uuid, this.liIiliIiIl));
         this.iiIiliIiIl.put(var3, var4);
         this.Ililllililil();
      }

      if (this.llliliIiIl) {
         this.IIillIiliIil(var4);
      }

      return var4.lIIliliiil;
   }

   private static void IiIIlliIIl(String what, Throwable t) {
   }

   private Path Iiiiliiiiiii() {
      Path var1 = this.iIliliIiIl;
      if (var1 == null) {
         var1 = (Path)this.llIiliIiIl.get();
         this.iIliliIiIl = var1;
      }

      return var1;
   }

   public void IIIllIIliIIl(ilIliliIiIlili force, boolean p) {
      if (force != null) {
         IIiliIIilIiliIIi var3 = (IIiliIIilIiliIIi)this.iiIiliIiIl.get(llIIlilIIl(force.IliIlllilIi()));
         if (var3 != null && var3.lIIliliiil == force) {
            this.Iilllilliill(var3, p);
         }
      }
   }

   // $FF: synthetic method
   private static CallSite iiiIlIIIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(-((char)(-var4[var5]))) >>> 11 | (char)(-((char)(-var4[var5]))) << 5))) >>> 3 | (char)(-((char)((char)(-((char)(-var4[var5]))) >>> 11 | (char)(-((char)(-var4[var5]))) << 5))) << 13) - var5))) - '쩑') >>> 10 | (char)((char)(~((char)((char)((char)(-((char)((char)(-((char)(-var4[var5]))) >>> 11 | (char)(-((char)(-var4[var5]))) << 5))) >>> 3 | (char)(-((char)((char)(-((char)(-var4[var5]))) >>> 11 | (char)(-((char)(-var4[var5]))) << 5))) << 13) - var5))) - '쩑') << 6) << 7 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)(-((char)(-var4[var5]))) >>> 11 | (char)(-((char)(-var4[var5]))) << 5))) >>> 3 | (char)(-((char)((char)(-((char)(-var4[var5]))) >>> 11 | (char)(-((char)(-var4[var5]))) << 5))) << 13) - var5))) - '쩑') >>> 10 | (char)((char)(~((char)((char)((char)(-((char)((char)(-((char)(-var4[var5]))) >>> 11 | (char)(-((char)(-var4[var5]))) << 5))) >>> 3 | (char)(-((char)((char)(-((char)(-var4[var5]))) >>> 11 | (char)(-((char)(-var4[var5]))) << 5))) << 13) - var5))) - '쩑') << 6) >>> 9))) << 6 | (char)(~((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(-((char)(-var4[var5]))) >>> 11 | (char)(-((char)(-var4[var5]))) << 5))) >>> 3 | (char)(-((char)((char)(-((char)(-var4[var5]))) >>> 11 | (char)(-((char)(-var4[var5]))) << 5))) << 13) - var5))) - '쩑') >>> 10 | (char)((char)(~((char)((char)((char)(-((char)((char)(-((char)(-var4[var5]))) >>> 11 | (char)(-((char)(-var4[var5]))) << 5))) >>> 3 | (char)(-((char)((char)(-((char)(-var4[var5]))) >>> 11 | (char)(-((char)(-var4[var5]))) << 5))) << 13) - var5))) - '쩑') << 6) << 7 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)(-((char)(-var4[var5]))) >>> 11 | (char)(-((char)(-var4[var5]))) << 5))) >>> 3 | (char)(-((char)((char)(-((char)(-var4[var5]))) >>> 11 | (char)(-((char)(-var4[var5]))) << 5))) << 13) - var5))) - '쩑') >>> 10 | (char)((char)(~((char)((char)((char)(-((char)((char)(-((char)(-var4[var5]))) >>> 11 | (char)(-((char)(-var4[var5]))) << 5))) >>> 3 | (char)(-((char)((char)(-((char)(-var4[var5]))) >>> 11 | (char)(-((char)(-var4[var5]))) << 5))) << 13) - var5))) - '쩑') << 6) >>> 9))) >>> 10) - '\ud87c') - 12122) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean Iiilliiliiil(Runnable job) {
      try {
         this.ilIiliIiIl.execute(job);
         return true;
      } catch (RejectedExecutionException var3) {
         IiIIlliIIl(lilIliilIl<invokedynamic>(), var3);
         return false;
      }
   }

   private void IIlilIliiIli(Path keep, String d) {
      long var10 = 5533583856458394092L;
      long var3 = this.IiIiliIiIl.getAsLong();
      ArrayList var5 = new ArrayList();
      DirectoryStream var6 = Files.newDirectoryStream(keep);

      try {
         for(Path var8 : var6) {
            String var9 = var8.getFileName().toString();
            if (Files.isRegularFile(var8, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})) {
               if (iIilliIiIl.matcher(var9).matches()) {
                  if (!var9.equals(d + lilIliilIl<invokedynamic>())) {
                     var5.add(new IlIlIlIillIlIlIi(var8, IIiilIiiiIii(var8), var9));
                  }
               } else if (IlilliIiIl.matcher(var9).matches() && !var9.equals(d + lilIliilIl<invokedynamic>()) && var3 - IIiilIiiiIii(var8) > 60000L) {
                  Files.deleteIfExists(var8);
               }
            }
         }
      } catch (Throwable var13) {
         if (var6 != null) {
            try {
               var6.close();
            } catch (Throwable var12) {
               var13.addSuppressed(var12);
            }
         }

         throw var13;
      }

      if (var6 != null) {
         var6.close();
      }

      var10 ^= ((long)(var5.size() + 1 - 200) << 32 ^ var10) & -1L << 32;
      if ((int)(var10 >>> 32) > 0) {
         var5.sort(Comparator.comparingLong(IlIlIlIillIlIlIi::liiiIIllIl).thenComparing(IlIlIlIillIlIlIi::iIlIlllllill));

         for(long var15 = var10 ^ (0L ^ var10) & -1L >>> 32; (int)var15 < (int)(var15 >>> 32) && (int)var15 < var5.size(); var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32) {
            Files.deleteIfExists(((IlIlIlIillIlIlIi)var5.get((int)var15)).IliIlllilIi());
         }

      }
   }

   public IlIlllIlllIlllIl(Supplier<Path> rnd, Executor io, LongSupplier dir, Random clockMs) {
      this.llIiliIiIl = (Supplier)Objects.requireNonNull(rnd, lilIliilIl<invokedynamic>());
      this.ilIiliIiIl = (Executor)Objects.requireNonNull(io, lilIliilIl<invokedynamic>());
      this.IiIiliIiIl = (LongSupplier)Objects.requireNonNull(dir, lilIliilIl<invokedynamic>());
      this.liIiliIiIl = clockMs == null ? new Random() : clockMs;
   }
}
