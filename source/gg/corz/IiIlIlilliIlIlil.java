package gg.corz;

import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IiIlIlilliIlIlil {
   public static final String illlIIiIil = "Cherry MX Blue";
   private final int IiilIIiIil;
   static final String lIilIIiIil = "/assets/corzclient/creamykeys/";
   public static final String IillIIiIil = "Holy Pandas";
   public static final String[] iillIIiIil = new String[]{Illlllllilll<invokedynamic>(), Illlllllilll<invokedynamic>(), Illlllllilll<invokedynamic>(), Illlllllilll<invokedynamic>()};
   static final String[] IIilIIiIil = new String[]{Illlllllilll<invokedynamic>(), Illlllllilll<invokedynamic>(), Illlllllilll<invokedynamic>(), Illlllllilll<invokedynamic>()};
   private final Map<Integer, Integer> llilIIiIil;
   public final illIIIliIilIIIli[] IlilIIiIil;
   private final Map<Integer, Integer> ililIIiIil;
   public static final String llllIIiIil = "NK Cream";
   public final int iIilIIiIil;
   public static final String lillIIiIil = "Topre";

   private static int IlIlllIlilIl(iIlIlIlIllIlIl clips, ilIllllIiIllll clip, Map<String, illIIIliIilIIIli> decoded, Map<iIlIlIlIllIlIl, Integer> files, List<illIIIliIilIIIli> ids) {
      long var9 = 6263535097091421119L;
      if (clips == null) {
         return -1;
      } else {
         Integer var5 = (Integer)files.get(clips);
         if (var5 != null) {
            return var5;
         } else {
            var9 ^= (-4294967296L ^ var9) & -1L << 32;
            illIIIliIilIIIli var7 = (illIIIliIilIIIli)decoded.get(clips.liiiIIllIl());
            if (var7 == null && !decoded.containsKey(clips.liiiIIllIl())) {
               try {
                  var7 = clip.load(clips.liiiIIllIl());
               } catch (RuntimeException | IOException var11) {
                  var7 = null;
               }

               decoded.put(clips.liiiIIllIl(), var7);
            }

            if (var7 != null) {
               illIIIliIilIIIli var8 = clips.IliIlllilIi() ? var7.iIlIlllllill(clips.iIlIlllllill(), clips.IilliliilIIi()) : var7;
               if (var8.IliIlllilIi() > 0) {
                  var9 ^= ((long)ids.size() << 32 ^ var9) & -1L << 32;
                  ids.add(var8);
               }
            }

            files.put(clips, (int)(var9 >>> 32));
            return (int)(var9 >>> 32);
         }
      }
   }

   public static int liiiIIllIl(int preset) {
      return preset >= 0 && preset < iillIIiIil.length ? preset : 0;
   }

   public int lIiiIiIlilli(int code) {
      Integer var2 = (Integer)this.llilIIiIil.get(code);
      return var2 != null ? var2 : this.IiilIIiIil;
   }

   public int iliIiiliiiii(int code) {
      Integer var2 = (Integer)this.ililIIiIil.get(code);
      return var2 != null ? var2 : -1;
   }

   private IiIlIlilliIlIlil(int fallbackDown, illIIIliIilIIIli[] clips, Map<Integer, Integer> preset, Map<Integer, Integer> down, int up) {
      this.iIilIIiIil = fallbackDown;
      this.IlilIIiIil = clips;
      this.llilIIiIil = preset;
      this.ililIIiIil = down;
      this.IiilIIiIil = up;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '뿚') ^ 18618) ^ '뼤') - var5) - '聞') >>> 14 | (char)((char)((char)((char)((char)(var4[var5] ^ '뿚') ^ 18618) ^ '뼤') - var5) - '聞') << 2) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '뿚') ^ 18618) ^ '뼤') - var5) - '聞') >>> 14 | (char)((char)((char)((char)((char)(var4[var5] ^ '뿚') ^ 18618) ^ '뼤') - var5) - '聞') << 2) >>> 9) ^ var5) - '큛') << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '뿚') ^ 18618) ^ '뼤') - var5) - '聞') >>> 14 | (char)((char)((char)((char)((char)(var4[var5] ^ '뿚') ^ 18618) ^ '뼤') - var5) - '聞') << 2) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '뿚') ^ 18618) ^ '뼤') - var5) - '聞') >>> 14 | (char)((char)((char)((char)((char)(var4[var5] ^ '뿚') ^ 18618) ^ '뼤') - var5) - '聞') << 2) >>> 9) ^ var5) - '큛') >>> 10) - 29501)) ^ 6467) - 'ꭳ') + '駛'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 6 | (char)((char)(var4[var5] + var5) - var5) >>> 10) - var5) - var5) ^ '틉') + var5) ^ 8178) >>> 7 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 6 | (char)((char)(var4[var5] + var5) - var5) >>> 10) - var5) - var5) ^ '틉') + var5) ^ 8178) << 9))) >>> 6 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 6 | (char)((char)(var4[var5] + var5) - var5) >>> 10) - var5) - var5) ^ '틉') + var5) ^ 8178) >>> 7 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 6 | (char)((char)(var4[var5] + var5) - var5) >>> 10) - var5) - var5) ^ '틉') + var5) ^ 8178) << 9))) << 10) + var5) + var5) ^ 19780) >>> 11 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 6 | (char)((char)(var4[var5] + var5) - var5) >>> 10) - var5) - var5) ^ '틉') + var5) ^ 8178) >>> 7 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 6 | (char)((char)(var4[var5] + var5) - var5) >>> 10) - var5) - var5) ^ '틉') + var5) ^ 8178) << 9))) >>> 6 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 6 | (char)((char)(var4[var5] + var5) - var5) >>> 10) - var5) - var5) ^ '틉') + var5) ^ 8178) >>> 7 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 6 | (char)((char)(var4[var5] + var5) - var5) >>> 10) - var5) - var5) ^ '틉') + var5) ^ 8178) << 9))) << 10) + var5) + var5) ^ 19780) << 5) + '꾍') ^ 19190) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8911914233372774798L ^ Long.rotateLeft(-7886254393729962866L, 34) ^ 6296307436744627650L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -4702343103139721054L ^ Long.rotateLeft(-6744281764755156856L, 26) ^ 2326602152006227357L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8258152020817546189L ^ Long.rotateLeft(8120191118568240556L, 12) ^ -1597823027925953514L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 1819200716742200692L ^ Long.rotateLeft(-1963326026533195161L, 7) ^ 3611382267163605499L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8188782205966814916L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 2874975361542016830L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -5906662823264720859L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3584804241605471525L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -4701052282872822925L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1438138445467849354L;
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

   public static IiIlIlilliIlIlil IilliliilIIi(int preset, IIIililllIIilill pack, ilIllllIiIllll files) {
      HashMap var3 = new HashMap();
      HashMap var4 = new HashMap();
      ArrayList var5 = new ArrayList();
      TreeSet var6 = new TreeSet(pack.lIiiIiIlilli());

      for(int var10 : illiilIiliil.IIIllIIliIIl()) {
         var6.add(var10);
      }

      HashMap var13 = new HashMap();
      HashMap var14 = new HashMap();

      for(int var17 : var6) {
         int var11 = IlIlllIlilIl(pack.liiiIIllIl(var17), files, var3, var4, var5);
         if (var11 >= 0) {
            var13.put(var17, var11);
         }

         int var12 = IlIlllIlilIl(pack.iIlIlllllill(var17), files, var3, var4, var5);
         if (var12 >= 0) {
            var14.put(var17, var12);
         }
      }

      int var16 = IlIlllIlilIl(pack.liiiIIllIl(-1), files, var3, var4, var5);
      return new IiIlIlilliIlIlil(preset, (illIIIliIilIIIli[])var5.toArray(new illIIIliIilIIIli[0]), var13, var14, var16);
   }

   public static int IliIlllilIi(String name) {
      for(int var1 = 0; var1 < iillIIiIil.length; ++var1) {
         if (iillIIiIil[var1].equals(name)) {
            return var1;
         }
      }

      return 0;
   }

   public static IiIlIlilliIlIlil iIlIlllllill(int preset) {
      long var4 = 2529506360607301781L;
      var4 ^= ((long)liiiIIllIl(preset) << 32 ^ var4) & -1L << 32;
      String var2 = Illlllllilll<invokedynamic>() + IIilIIiIil[(int)(var4 >>> 32)] + Illlllllilll<invokedynamic>();
      IIIililllIIilill var3 = IIIililllIIilill.IliIlllilIi(new String(IiIlliIliiIl(var2 + Illlllllilll<invokedynamic>()), StandardCharsets.UTF_8));
      return IilliliilIIi((int)(var4 >>> 32), var3, (file) -> {
         byte[] var2x = IiIlliIliiIl(var2 + file);
         return file.toLowerCase().endsWith(Illlllllilll<invokedynamic>()) ? ilIliilIiIliil.IliIlllilIi(var2x) : illIIIliIilIIIli.liiiIIllIl(var2x);
      });
   }

   private static byte[] IiIlliIliiIl(String path) {
      InputStream var1 = IiIlIlilliIlIlil.class.getResourceAsStream(path);

      byte[] var2;
      try {
         if (var1 == null) {
            throw new IOException(Illlllllilll<invokedynamic>() + path);
         }

         var2 = var1.readAllBytes();
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

      return var2;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 'ﶘ') << 3 | (char)(var4[var5] + 'ﶘ') >>> 13) - var5) + var5) + var5) + '뱇') ^ var5))) ^ 23303))) >>> 1 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 'ﶘ') << 3 | (char)(var4[var5] + 'ﶘ') >>> 13) - var5) + var5) + var5) + '뱇') ^ var5))) ^ 23303))) << 15) + var5) >>> 2 | (char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 'ﶘ') << 3 | (char)(var4[var5] + 'ﶘ') >>> 13) - var5) + var5) + var5) + '뱇') ^ var5))) ^ 23303))) >>> 1 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 'ﶘ') << 3 | (char)(var4[var5] + 'ﶘ') >>> 13) - var5) + var5) + var5) + '뱇') ^ var5))) ^ 23303))) << 15) + var5) << 14) - var5) >>> 14 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 'ﶘ') << 3 | (char)(var4[var5] + 'ﶘ') >>> 13) - var5) + var5) + var5) + '뱇') ^ var5))) ^ 23303))) >>> 1 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 'ﶘ') << 3 | (char)(var4[var5] + 'ﶘ') >>> 13) - var5) + var5) + var5) + '뱇') ^ var5))) ^ 23303))) << 15) + var5) >>> 2 | (char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 'ﶘ') << 3 | (char)(var4[var5] + 'ﶘ') >>> 13) - var5) + var5) + var5) + '뱇') ^ var5))) ^ 23303))) >>> 1 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 'ﶘ') << 3 | (char)(var4[var5] + 'ﶘ') >>> 13) - var5) + var5) + var5) + '뱇') ^ var5))) ^ 23303))) << 15) + var5) << 14) - var5) << 2) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long IIIllIIliIIl() {
      long var1 = 0L;

      for(illIIIliIilIIIli var6 : this.IlilIIiIil) {
         var1 += (long)var6.IIlllIlliIll().length;
      }

      return var1;
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 15 | (char)(-var4[var5]) << 1) ^ '찶') - '\uf215') - var5) + 29374) - var5) - 19838))) ^ var5) << 12 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 15 | (char)(-var4[var5]) << 1) ^ '찶') - '\uf215') - var5) + 29374) - var5) - 19838))) ^ var5) >>> 4) << 7 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 15 | (char)(-var4[var5]) << 1) ^ '찶') - '\uf215') - var5) + 29374) - var5) - 19838))) ^ var5) << 12 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 15 | (char)(-var4[var5]) << 1) ^ '찶') - '\uf215') - var5) + 29374) - var5) - 19838))) ^ var5) >>> 4) >>> 9) + var5) >>> 12 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 15 | (char)(-var4[var5]) << 1) ^ '찶') - '\uf215') - var5) + 29374) - var5) - 19838))) ^ var5) << 12 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 15 | (char)(-var4[var5]) << 1) ^ '찶') - '\uf215') - var5) + 29374) - var5) - 19838))) ^ var5) >>> 4) << 7 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 15 | (char)(-var4[var5]) << 1) ^ '찶') - '\uf215') - var5) + 29374) - var5) - 19838))) ^ var5) << 12 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 15 | (char)(-var4[var5]) << 1) ^ '찶') - '\uf215') - var5) + 29374) - var5) - 19838))) ^ var5) >>> 4) >>> 9) + var5) << 4));
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
         var4[var5] = (char)((char)(~((char)(~((char)(~((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) >>> 12 | (char)(~((char)(~var4[var5]))) << 4) - var5) >>> 15 | (char)((char)((char)(~((char)(~var4[var5]))) >>> 12 | (char)(~((char)(~var4[var5]))) << 4) - var5) << 1) ^ '\ud8e8') - 12277))) - '\udcd3') << 8 | (char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) >>> 12 | (char)(~((char)(~var4[var5]))) << 4) - var5) >>> 15 | (char)((char)((char)(~((char)(~var4[var5]))) >>> 12 | (char)(~((char)(~var4[var5]))) << 4) - var5) << 1) ^ '\ud8e8') - 12277))) - '\udcd3') >>> 8))) + 2221) ^ 15975))))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
