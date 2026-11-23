package gg.corz;

import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.ref.Reference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.sound.sampled.AudioFormat;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_2960;
import net.minecraft.class_4231;
import org.lwjgl.stb.STBVorbis;
import org.lwjgl.stb.STBVorbisAlloc;
import org.lwjgl.stb.STBVorbisInfo;
import org.lwjgl.system.MemoryStack;

public final class IillIlilillIli {
   static final String illIlIIIIl = "sounds/c2pack/";
   public static final int IiIIlIIIIl = 8;
   public static final long IllIlIIIIl = 8388608L;
   private static volatile Map<String, IiliIllliliIll> lIiIlIIIIl;
   private static long IiiIlIIIIl;
   public static final int iiIIlIIIIl = 2048;
   public static final long lllIlIIIIl = 134217728L;
   public static final String ilIIlIIIIl = "knife_packs";
   static final Pattern IilIlIIIIl = Pattern.compile(IiiIlliiIl<invokedynamic>());
   static final Pattern lilIlIIIIl = Pattern.compile(IiiIlliiIl<invokedynamic>());
   private static long iliIlIIIIl;
   public static final long lIlIlIIIIl = 67108864L;
   private static CompletableFuture<Void> iIiIlIIIIl;
   private static final ExecutorService IIiIlIIIIl = Executors.newSingleThreadExecutor((r) -> {
      Thread var1 = new Thread(r, IiiIlliiIl<invokedynamic>());
      var1.setDaemon(true);
      var1.setPriority(4);
      return var1;
   });
   static final Pattern iilIlIIIIl = Pattern.compile(IiiIlliiIl<invokedynamic>());
   private static long liiIlIIIIl;
   private static final Map<String, Integer> lliIlIIIIl = new HashMap();
   public static final int liIIlIIIIl = 8192;
   private static final List<String> IliIlIIIIl = new ArrayList();
   public static final String llIIlIIIIl = "c2pack|";
   public static final long iIlIlIIIIl = 2097152L;
   public static final float IIlIlIIIIl = 0.7F;

   public static synchronized void IIIIllIIIl() {
      liiIlIIIIl = 0L;
   }

   // $FF: synthetic method
   private static CallSite iiiIlIIIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 11967) ^ var5) >>> 6 | (char)((char)(var4[var5] + 11967) ^ var5) << 10) - var5) - '\uec78') - var5) ^ var5))) ^ var5) ^ 20064) + var5) + 4240))) - var5) ^ var5) + var5) << 5 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 11967) ^ var5) >>> 6 | (char)((char)(var4[var5] + 11967) ^ var5) << 10) - var5) - '\uec78') - var5) ^ var5))) ^ var5) ^ 20064) + var5) + 4240))) - var5) ^ var5) + var5) >>> 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String IiIlliIliiIl(String entry) {
      if (entry != null && !entry.contains(IiiIlliiIl<invokedynamic>()) && !entry.contains(IiiIlliiIl<invokedynamic>())) {
         Matcher var1 = lilIlIIIIl.matcher(entry);
         return var1.matches() ? var1.group(1) + IiiIlliiIl<invokedynamic>() + var1.group(3) : null;
      } else {
         return null;
      }
   }

   public static String IIlllIlliIll(String pack, String effect) {
      return IiiIlliiIl<invokedynamic>() + pack + IiiIlliiIl<invokedynamic>() + effect;
   }

   static synchronized String IIiilIiiiIii(class_2960 location) {
      long var3 = 2331780218273455611L;
      if (location != null && IiiIlliiIl<invokedynamic>().equals(location.method_12836())) {
         Matcher var1 = iilIlIIIIl.matcher(location.method_12832());
         if (!var1.matches()) {
            return null;
         } else {
            var3 ^= ((long)Integer.parseInt(var1.group(1)) << 32 ^ var3) & -1L << 32;
            return (int)(var3 >>> 32) < IliIlIIIIl.size() ? (String)IliIlIIIIl.get((int)(var3 >>> 32)) : null;
         }
      } else {
         return null;
      }
   }

   public static boolean Illlllllilll(String sound) {
      return sound != null && sound.startsWith(IiiIlliiIl<invokedynamic>());
   }

   public static List<Path> lIiiIiIlilli(Path dir) {
      ArrayList var1 = new ArrayList();
      if (dir != null && Files.isDirectory(dir, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})) {
         try {
            DirectoryStream var2 = Files.newDirectoryStream(dir);

            try {
               for(Path var4 : var2) {
                  if (IilliliilIIi(var4.getFileName().toString()) != null && Files.isRegularFile(var4, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})) {
                     long var5 = Files.size(var4);
                     if (var5 > 0L && var5 <= 67108864L) {
                        var1.add(var4);
                     }
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
         } catch (IOException | RuntimeException var9) {
            return new ArrayList();
         }

         var1.sort((a, b) -> a.getFileName().toString().compareTo(b.getFileName().toString()));
         return var1.size() > 8 ? new ArrayList(var1.subList(0, 8)) : var1;
      } else {
         return var1;
      }
   }

   // $FF: synthetic method
   private static CallSite ilIllIiIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(-((char)(-((char)(var4[var5] + var5))))) << 8 | (char)(-((char)(-((char)(var4[var5] + var5))))) >>> 8))) ^ 21148) ^ 9861))) + '뀒') + '껋') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static List<iIiiiilIliiiil> Ililllililil(List<IIIilIIilIIilIIi> length, float cues, Function<String, String> resolve) {
      if (length != null && !length.isEmpty()) {
         ArrayList var3 = new ArrayList();
         float var4 = IIillIiliIil();

         for(IIIilIIilIIilIIi var6 : length) {
            if (!(var6.IliIlllilIi() < 0.0F) && !(var6.IliIlllilIi() > cues)) {
               String var7 = (String)resolve.apply(var6.liiiIIllIl());
               if (var7 != null) {
                  var3.add(new iIiiiilIliiiil(var6.IliIlllilIi(), var7, var4, 1.0F));
               }
            }
         }

         return var3.isEmpty() ? null : List.copyOf(var3);
      } else {
         return null;
      }
   }

   public static List<IIIilIIilIIilIIi> Iiilliiliiil(List<IIIilIIilIIilIIi> cues, float to, float from) {
      if (cues != null && !cues.isEmpty()) {
         float var3 = to > 0.0F && from > 0.0F ? from / to : 1.0F;
         ArrayList var4 = new ArrayList(cues.size());

         for(IIIilIIilIIilIIi var6 : cues) {
            var4.add(new IIIilIIilIIilIIi(var3 == 1.0F ? var6.IliIlllilIi() : Math.min(from, var6.IliIlllilIi() * var3), var6.liiiIIllIl()));
         }

         return List.copyOf(var4);
      } else {
         return List.of();
      }
   }

   public static boolean Illillliilli(String sound) {
      long var5 = -7663149555616549181L;
      var5 ^= ((long)(!IiiIlliiIl<invokedynamic>().equals(sound) && !IiiIlliiIl<invokedynamic>().equals(sound) ? 0 : 1) << 32 ^ var5) & -1L << 32;
      if ((int)(var5 >>> 32) == 0 && !IiiIlliiIl<invokedynamic>().equals(sound)) {
         return false;
      } else if (lIiIlIIIIl != null && iIiIiliIliIili.liiiIIllIl()) {
         iiIiliiIIlilii var2 = iIiIiliIliIili.lIiiIiIlilli();
         if (var2 == null) {
            return false;
         } else {
            liIlIiliiIlIil var3 = iIllliIlllli.iliIiiliiiii(var2);
            lIIiilIliIIiilIl var4 = var3 == null ? null : var3.liiiIIllIl();
            return IIlilIliiIli(var2, var4, (int)(var5 >>> 32) != 0 ? (var4 == null ? var2.IIIllIIliIIl() : iIIIIilIlIIIil.liiiIIllIl(var2, var4)) : IiiIlliiIl<invokedynamic>());
         }
      } else {
         return false;
      }
   }

   public static iiIiliiIIlilii IIIilIIiiIIi(iiIiliiIIlilii knife) {
      return knife == iiIiliiIIlilii.lIIllliIIl ? iiIiliiIIlilii.llIllliIIl : null;
   }

   private IillIlilillIli() {
   }

   public static boolean Iliilliiilii(class_2960 location) {
      return location != null && IiiIlliiIl<invokedynamic>().equals(location.method_12836()) && location.method_12832().startsWith(IiiIlliiIl<invokedynamic>());
   }

   public static Map<String, String> IlIlllIlilIl(List<String> names) {
      LinkedHashMap var1 = new LinkedHashMap();
      LinkedHashMap var2 = new LinkedHashMap();

      for(String var4 : names) {
         String var5 = IiIlliIliiIl(var4);
         if (var5 != null) {
            LinkedHashMap var6 = var4.contains(IiiIlliiIl<invokedynamic>()) ? var1 : var2;
            if (var6.size() < 2048) {
               var6.putIfAbsent(var5, var4);
            }
         }
      }

      LinkedHashMap var7 = new LinkedHashMap(var1);

      for(Map.Entry var9 : var2.entrySet()) {
         if (var7.size() < 2048) {
            var7.putIfAbsent((String)var9.getKey(), (String)var9.getValue());
         }
      }

      return Collections.unmodifiableMap(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIllllIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14) ^ 15444) ^ 22435) ^ '꣤') + 27408) ^ '뉷') + 1728) ^ var5) - 19585) - 13605))) << 11 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14) ^ 15444) ^ 22435) ^ '꣤') + 27408) ^ '뉷') + 1728) ^ var5) - 19585) - 13605))) >>> 5))) + 15464)))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static Path IliIlllilIi() {
      return FabricLoader.getInstance().getConfigDir().resolve(IiiIlliiIl<invokedynamic>()).resolve(IiiIlliiIl<invokedynamic>());
   }

   public static synchronized String llIIlilIIl() {
      return IiiIlliiIl<invokedynamic>() + iliIlIIIIl + IiiIlliiIl<invokedynamic>() + IiiIlIIIIl + IiiIlliiIl<invokedynamic>() + IliIlIIIIl.size();
   }

   public static synchronized void liiiIIllIl() {
      if (iIiIlIIIIl == null) {
         iIiIlIIIIl = CompletableFuture.runAsync(() -> {
            Map var0;
            try {
               var0 = iliIiiliiiii(IliIlllilIi());
            } catch (RuntimeException var4) {
               System.err.println(IiiIlliiIl<invokedynamic>() + var4);
               var0 = Map.of();
            }

            lIiIlIIIIl = var0;
            int var1 = 0;

            for(IiliIllliliIll var3 : var0.values()) {
               var1 += var3.iIlIlllllill().size();
            }

         }, IIiIlIIIIl);
      }
   }

   public static CompletableFuture<class_4231> IiIIlliIIl(class_2960 location) {
      String var1 = IIiilIiiiIii(location);
      return CompletableFuture.supplyAsync(() -> {
         try {
            if (var1 == null) {
               throw new IOException(IiiIlliiIl<invokedynamic>() + location);
            } else {
               synchronized(IillIlilillIli.class) {
                  if (liiIlIIIIl > (2707231748511253871L ^ 2707231748645471599L)) {
                     throw new IOException(IiiIlliiIl<invokedynamic>());
                  }
               }

               iIiIIilIliIIil var8 = iiIIlIIlIl(var1);
               synchronized(IillIlilillIli.class) {
                  ++IiiIlIIIIl;
                  liiIlIIIIl += (long)var8.IliIlllilIi().limit();
               }

               return new class_4231(var8.IliIlllilIi(), var8.liiiIIllIl());
            }
         } catch (IOException | RuntimeException var7) {
            System.err.println(IiiIlliiIl<invokedynamic>() + var1 + IiiIlliiIl<invokedynamic>() + var7);
            throw new CompletionException(var7);
         }
      }, IIiIlIIIIl);
   }

   static String Iilllilliill(Map<String, IiliIllliliIll> all, String pack, String effect) {
      if (all != null && effect != null) {
         IiliIllliliIll var3 = pack == null ? null : (IiliIllliliIll)all.get(pack);
         if (var3 != null && var3.iIlIlllllill().containsKey(effect)) {
            return IIlllIlliIll(var3.IliIlllilIi(), effect);
         } else {
            for(IiliIllliliIll var5 : all.values()) {
               if (var5.iIlIlllllill().containsKey(effect)) {
                  return IIlllIlliIll(var5.IliIlllilIi(), effect);
               }
            }

            return null;
         }
      } else {
         return null;
      }
   }

   static iIiIIilIliIIil iiIIlIIlIl(String key) {
      long var12 = 4529534867603604897L;
      String var1 = key.substring(IiiIlliiIl<invokedynamic>().length());
      var12 ^= ((long)var1.indexOf((-1437676413 * -45 + 69 ^ -69) - -51 ^ -270929212) << 32 ^ var12) & -1L << 32;
      if ((int)(var12 >>> 32) < 0) {
         throw new IOException(IiiIlliiIl<invokedynamic>());
      } else {
         Map var3 = lIiIlIIIIl;
         IiliIllliliIll var4 = var3 == null ? null : (IiliIllliliIll)var3.get(var1.substring(0, (int)(var12 >>> 32)));
         String var5 = var4 == null ? null : (String)var4.iIlIlllllill().get(var1.substring((int)(var12 >>> 32) + 1));
         if (var5 == null) {
            throw new IOException(IiiIlliiIl<invokedynamic>());
         } else {
            ZipFile var7 = new ZipFile(var4.liiiIIllIl().toFile());

            byte[] var6;
            try {
               ZipEntry var8 = var7.getEntry(var5);
               if (var8 == null) {
                  throw new IOException(IiiIlliiIl<invokedynamic>());
               }

               InputStream var9 = var7.getInputStream(var8);

               try {
                  var6 = var9.readNBytes(-(-(--1783856675 * 5)) ^ 327251630);
               } catch (Throwable var16) {
                  if (var9 != null) {
                     try {
                        var9.close();
                     } catch (Throwable var15) {
                        var16.addSuppressed(var15);
                     }
                  }

                  throw var16;
               }

               if (var9 != null) {
                  var9.close();
               }
            } catch (Throwable var17) {
               try {
                  var7.close();
               } catch (Throwable var14) {
                  var17.addSuppressed(var14);
               }

               throw var17;
            }

            var7.close();
            if ((long)var6.length > (528755340837270155L ^ 528755340835173003L)) {
               throw new IOException(IiiIlliiIl<invokedynamic>());
            } else {
               return lIlIliIlIl(var6);
            }
         }
      }
   }

   static iIiIIilIliIIil lIlIliIlIl(byte[] ogg) {
      ByteBuffer var1 = ByteBuffer.allocateDirect(ogg.length);
      var1.put(ogg).flip();
      MemoryStack var2 = MemoryStack.stackPush();

      iIiIIilIliIIil var16;
      try {
         IntBuffer var3 = var2.mallocInt(1);
         long var4 = STBVorbis.stb_vorbis_open_memory(var1, var3, (STBVorbisAlloc)null);
         if (var4 == 0L) {
            throw new IOException(IiiIlliiIl<invokedynamic>() + var3.get(0) + IiiIlliiIl<invokedynamic>());
         }

         try {
            label117: {
               STBVorbisInfo var6 = STBVorbis.stb_vorbis_get_info(var4, STBVorbisInfo.malloc(var2));
               int var7 = var6.channels();
               int var8 = var6.sample_rate();
               if (var7 >= 1 && var7 <= 2 && var8 >= 8000 && var8 <= 96000) {
                  long var9 = (long)STBVorbis.stb_vorbis_stream_length_in_samples(var4);
                  long var11 = var9 * (long)var7 * 2L;
                  if (var9 > 0L && var11 <= 8388608L) {
                     ByteBuffer var13 = ByteBuffer.allocateDirect((int)var11).order(ByteOrder.nativeOrder());
                     int var14 = STBVorbis.stb_vorbis_get_samples_short_interleaved(var4, var7, var13.asShortBuffer());
                     if (var14 <= 0) {
                        throw new IOException(IiiIlliiIl<invokedynamic>());
                     }

                     var13.limit(Math.min(var13.capacity(), var14 * var7 * 2));
                     AudioFormat var15 = new AudioFormat((float)var8, 16, var7, true, ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);
                     var16 = new iIiIIilIliIIil(var13, var15);
                     break label117;
                  }

                  throw new IOException(IiiIlliiIl<invokedynamic>());
               }

               throw new IOException(IiiIlliiIl<invokedynamic>());
            }
         } finally {
            STBVorbis.stb_vorbis_close(var4);
            Reference.reachabilityFence(var1);
         }
      } catch (Throwable var23) {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Throwable var21) {
               var23.addSuppressed(var21);
            }
         }

         throw var23;
      }

      if (var2 != null) {
         var2.close();
      }

      return var16;
   }

   // $FF: synthetic method
   private static CallSite liIlliiIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)(-((char)(~var4[var5]))) ^ var5)) >>> 8 | (char)((char)((char)(-((char)(~var4[var5]))) ^ var5)) << 8) - var5))) ^ '픻'))) << 8 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)(-((char)(~var4[var5]))) ^ var5)) >>> 8 | (char)((char)((char)(-((char)(~var4[var5]))) ^ var5)) << 8) - var5))) ^ '픻'))) >>> 8))) << 7 | (char)(~((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)(-((char)(~var4[var5]))) ^ var5)) >>> 8 | (char)((char)((char)(-((char)(~var4[var5]))) ^ var5)) << 8) - var5))) ^ '픻'))) << 8 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)(-((char)(~var4[var5]))) ^ var5)) >>> 8 | (char)((char)((char)(-((char)(~var4[var5]))) ^ var5)) << 8) - var5))) ^ '픻'))) >>> 8))) >>> 9) + '\udb58') ^ 9762))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static lliIiiililiIiiil IlIillIiilIi(iiIiliiIIlilii clip, lliIiiililiIiiil knife) {
      iiIiliiIIlilii var2 = IIIilIIiiIIi(clip);
      if (var2 == null) {
         return null;
      } else {
         iIllliIlllli.iIlIlllllill(var2);
         liIlIiliiIlIil var3 = iIllliIlllli.iliIiiliiiii(clip);
         liIlIiliiIlIil var4 = iIllliIlllli.iliIiiliiiii(var2);
         if (var4 == null) {
            return null;
         } else {
            String var5 = iIIIIilIlIIIil.lIiiIiIlilli(clip, var3 == null ? null : var3.liiiIIllIl(), knife.liiiIIllIl(), var2, var4.liiiIIllIl());
            return var5 == null ? null : (lliIiiililiIiiil)var4.liiiIIllIl().iiiililIll.get(var5);
         }
      }
   }

   public static List<iIiiiilIliiiil> IiIiliIiiiIi(iiIiliiIIlilii knife, lliIiiililiIiiil clip) {
      if (knife != null && clip != null && iIlIlllllill()) {
         Map var2 = lIiIlIIIIl;
         if (!knife.IliIlllilIi()) {
            return Ililllililil(clip.lIiiIiIlilli(), clip.iIlIlllllill(), (e) -> Iilllilliill(var2, knife.illilliIIl, e));
         } else {
            lliIiiililiIiiil var3 = IlIillIiilIi(knife, clip);
            if (var3 == null) {
               return null;
            } else {
               String var4 = IIIilIIiiIIi(knife).illilliIIl;
               return Ililllililil(Iiilliiliiil(var3.lIiiIiIlilli(), var3.iIlIlllllill(), clip.iIlIlllllill()), clip.iIlIlllllill(), (all) -> Iilllilliill(var2, var4, all));
            }
         }
      } else {
         return null;
      }
   }

   public static boolean iIlIlllllill() {
      Map var0 = lIiIlIIIIl;
      if (var0 == null) {
         liiiIIllIl();
      }

      return var0 != null && !var0.isEmpty();
   }

   static String IilliliilIIi(String fileName) {
      if (fileName == null) {
         return null;
      } else {
         Matcher var1 = IilIlIIIIl.matcher(fileName);
         return var1.matches() ? var1.group(1) : null;
      }
   }

   static Map<String, String> IIIllIIliIIl(ZipFile zip) {
      ArrayList var1 = new ArrayList();
      Enumeration var2 = zip.entries();
      int var3 = 0;

      while(var2.hasMoreElements() && var3++ < 8192) {
         ZipEntry var4 = (ZipEntry)var2.nextElement();
         if (!var4.isDirectory()) {
            var1.add(var4.getName());
         }
      }

      return IlIlllIlilIl(var1);
   }

   public static synchronized class_2960 Iilililiiili(String key) {
      Integer var1 = (Integer)lliIlIIIIl.get(key);
      if (var1 == null) {
         if (IliIlIIIIl.size() >= (-(-(-1021059881 * 15 - -13)) ^ 1863954598)) {
            return null;
         }

         var1 = IliIlIIIIl.size();
         IliIlIIIIl.add(key);
         lliIlIIIIl.put(key, var1);
      }

      return class_2960.method_60655(IiiIlliiIl<invokedynamic>(), IiiIlliiIl<invokedynamic>() + var1);
   }

   public static synchronized void Iiiiliiiiiii() {
      ++iliIlIIIIl;
   }

   public static Map<String, IiliIllliliIll> iliIiiliiiii(Path dir) {
      LinkedHashMap var1 = new LinkedHashMap();

      for(Path var3 : lIiiIiIlilli(dir)) {
         String var4 = IilliliilIIi(var3.getFileName().toString());

         try {
            ZipFile var5 = new ZipFile(var3.toFile());

            try {
               Map var6 = IIIllIIliIIl(var5);
               if (!var6.isEmpty()) {
                  var1.put(var4, new IiliIllliliIll(var4, var3, var6));
               }
            } catch (Throwable var9) {
               try {
                  var5.close();
               } catch (Throwable var8) {
                  var9.addSuppressed(var8);
               }

               throw var9;
            }

            var5.close();
         } catch (RuntimeException | IOException var10) {
            System.err.println(IiiIlliiIl<invokedynamic>() + var3.getFileName() + IiiIlliiIl<invokedynamic>() + var10);
         }
      }

      return Collections.unmodifiableMap(var1);
   }

   // $FF: synthetic method
   private static CallSite lIIlliIIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(~var4[var5]) << 5 | (char)(~var4[var5]) >>> 11) - '퓎') - '躧'))))) << 9 | (char)(~((char)(~((char)((char)((char)((char)(~var4[var5]) << 5 | (char)(~var4[var5]) >>> 11) - '퓎') - '躧'))))) >>> 7) << 13 | (char)((char)(~((char)(~((char)((char)((char)((char)(~var4[var5]) << 5 | (char)(~var4[var5]) >>> 11) - '퓎') - '躧'))))) << 9 | (char)(~((char)(~((char)((char)((char)((char)(~var4[var5]) << 5 | (char)(~var4[var5]) >>> 11) - '퓎') - '躧'))))) >>> 7) >>> 3) >>> 4 | (char)((char)((char)(~((char)(~((char)((char)((char)((char)(~var4[var5]) << 5 | (char)(~var4[var5]) >>> 11) - '퓎') - '躧'))))) << 9 | (char)(~((char)(~((char)((char)((char)((char)(~var4[var5]) << 5 | (char)(~var4[var5]) >>> 11) - '퓎') - '躧'))))) >>> 7) << 13 | (char)((char)(~((char)(~((char)((char)((char)((char)(~var4[var5]) << 5 | (char)(~var4[var5]) >>> 11) - '퓎') - '躧'))))) << 9 | (char)(~((char)(~((char)((char)((char)((char)(~var4[var5]) << 5 | (char)(~var4[var5]) >>> 11) - '퓎') - '躧'))))) >>> 7) >>> 3) << 12) + 13417))) >>> 14 | (char)(-((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(~var4[var5]) << 5 | (char)(~var4[var5]) >>> 11) - '퓎') - '躧'))))) << 9 | (char)(~((char)(~((char)((char)((char)((char)(~var4[var5]) << 5 | (char)(~var4[var5]) >>> 11) - '퓎') - '躧'))))) >>> 7) << 13 | (char)((char)(~((char)(~((char)((char)((char)((char)(~var4[var5]) << 5 | (char)(~var4[var5]) >>> 11) - '퓎') - '躧'))))) << 9 | (char)(~((char)(~((char)((char)((char)((char)(~var4[var5]) << 5 | (char)(~var4[var5]) >>> 11) - '퓎') - '躧'))))) >>> 7) >>> 3) >>> 4 | (char)((char)((char)(~((char)(~((char)((char)((char)((char)(~var4[var5]) << 5 | (char)(~var4[var5]) >>> 11) - '퓎') - '躧'))))) << 9 | (char)(~((char)(~((char)((char)((char)((char)(~var4[var5]) << 5 | (char)(~var4[var5]) >>> 11) - '퓎') - '躧'))))) >>> 7) << 13 | (char)((char)(~((char)(~((char)((char)((char)((char)(~var4[var5]) << 5 | (char)(~var4[var5]) >>> 11) - '퓎') - '躧'))))) << 9 | (char)(~((char)(~((char)((char)((char)((char)(~var4[var5]) << 5 | (char)(~var4[var5]) >>> 11) - '퓎') - '躧'))))) >>> 7) >>> 3) << 12) + 13417))) << 2) ^ var5))) - var5) ^ 'ꋔ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean IIlilIliiIli(iiIiliiIIlilii knife, lIIiilIliIIiilIl model, String clip) {
      if (knife != null && clip != null && iIlIlllllill()) {
         if (model == null) {
            return !knife.IliIlllilIi() && lIiIlIIIIl.get(knife.illilliIIl) != null;
         } else if (clip.endsWith(IiiIlliiIl<invokedynamic>())) {
            String var7 = clip.substring(0, clip.length() - 1);

            for(lliIiiililiIiiil var5 : model.iiiililIll.values()) {
               if (var5.liiiIIllIl().startsWith(var7) && knife.IlIlllIlilIl(var5.liiiIIllIl())) {
                  List var6 = IiIiliIiiiIi(knife, var5);
                  if (var6 != null && !var6.isEmpty()) {
                     return true;
                  }
               }
            }

            return false;
         } else {
            List var3 = IiIiliIiiiIi(knife, (lliIiiililiIiiil)model.iiiililIll.get(clip));
            return var3 != null && !var3.isEmpty();
         }
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite IiiIlliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6253317321906893737L ^ Long.rotateLeft(3397214341449618423L, 24) ^ -4331646847705578815L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1102954004132221276L ^ Long.rotateLeft(440751075758685870L, 50) ^ 4525386264073479789L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -827485421064630682L ^ Long.rotateLeft(1614821013524045706L, 61) ^ -464946369134091063L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1331356211610350393L ^ Long.rotateLeft(3403760052955459347L, 63) ^ 8521105932840593276L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -5949477766117566267L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3869723832028604716L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -3380876398233545498L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -1080898257502819496L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 693730761660570766L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8842026874605079149L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iiiIlIIIll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, lIIlliIIll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IlIllllIll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, ilIllIiIll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(liIlliiIll<invokedynamic>());
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

   static synchronized long iIIIlIlIIl() {
      return liiIlIIIIl;
   }

   public static float IIillIiliIil() {
      float var0 = iilliliIIilili.IliIlllilIi(Double.longBitsToDouble(-776419433568186720L ^ -3832559734965348550L));
      return var0 > 0.0F ? 0.7F / var0 : 0.7F;
   }
}
