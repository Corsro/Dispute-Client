package gg.corz;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.net.UnixDomainSocketAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class iiIiliIIlili {
   private static final String liiiiIlIliiiiiIlIl = "https://discord.gg/corzgg";
   private static long lIlIIllIliIlIIllIl;
   private static final String IiliiIlIlliliiIlIl = "corz_logo_v2";
   private static final long llliiIlIlilliiIlIl = 1476045767755174113L;
   private static final String lIiiiIlIliIiiiIlIl = "Playing CorzClient";
   private static InputStream lilIIllIliilIIllIl;
   private static final String iliiiIlIlIiiiiIlIl = "https://www.corz.gg/";
   private static final String IliiiIlIllliiiIlIl = "corz.gg";
   private static volatile boolean IllIIllIllllIIllIl = false;
   private static final String iiliiIlIlIIiiiIlIl = "CorzClient";
   private static final int IIIIIllIllIIIIllIl = 0;
   private static final int llIIIllIlilIIIllIl = 2;
   private static Closeable IIiIIllIllIiIIllIl;
   private static ScheduledExecutorService IiIIIllIlliIIIllIl;
   private static OutputStream illIIllIlIilIIllIl;
   private static final int iIIIIllIlIlIIIllIl = 1;
   private static final AtomicInteger iiIIIllIlIIlIIllIl = new AtomicInteger(1);

   public static void lIiiIiIlilli() {
      IllIIllIllllIIllIl = false;
      if (IiIIIllIlliIIIllIl != null) {
         IiIIIllIlliIIIllIl.shutdownNow();
      }

      try {
         if (illIIllIlIilIIllIl != null) {
            JsonObject var0 = new JsonObject();
            var0.addProperty(IIillIiliIil<invokedynamic>(), 1);
            var0.addProperty(IIillIiliIil<invokedynamic>(), String.valueOf(1476045767755174113L));
            IIIllIIliIIl(2, var0.toString());
         }
      } catch (Exception var1) {
      }

      IIlllIlliIll();
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) - var5) + var5) ^ 1912) >>> 10 | (char)((char)((char)((char)((char)(var4[var5] + var5) - var5) - var5) + var5) ^ 1912) << 6) - var5))) - 31285) - var5) + 7377))) ^ var5) - var5) + '췄') ^ 'ퟲ'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '\ue3b7') + var5) + '둺') - var5) - var5) << 4 | (char)((char)((char)((char)((char)((char)(~var4[var5]) + '\ue3b7') + var5) + '둺') - var5) - var5) >>> 12) ^ 11993) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '\ue3b7') + var5) + '둺') - var5) - var5) << 4 | (char)((char)((char)((char)((char)((char)(~var4[var5]) + '\ue3b7') + var5) + '둺') - var5) - var5) >>> 12) ^ 11993) >>> 10) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static byte[] IiIlliIliiIl(int n) {
      long var4 = -2663682399088260545L;
      byte[] var1 = new byte[n];

      for(var4 ^= (0L ^ var4) & -1L << 32; (int)(var4 >>> 32) < n; var4 ^= ((long)((int)(var4 >>> 32) + (int)var4) << 32 ^ var4) & -1L << 32) {
         var4 ^= ((long)lilIIllIliilIIllIl.read(var1, (int)(var4 >>> 32), n - (int)(var4 >>> 32)) ^ var4) & -1L >>> 32;
         if ((int)var4 < 0) {
            return null;
         }
      }

      return var1;
   }

   public static void IliIlllilIi() {
      lIlIIllIliIlIIllIl = System.currentTimeMillis() / 1000L;
      IiIIIllIlliIIIllIl = Executors.newSingleThreadScheduledExecutor((r) -> {
         Thread var1 = new Thread(r, IIillIiliIil<invokedynamic>());
         var1.setDaemon(true);
         return var1;
      });
      IiIIIllIlliIIIllIl.scheduleAtFixedRate(iiIiliIIlili::liiiIIllIl, 0L, 15L, TimeUnit.SECONDS);
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - 28120) << 6 | (char)((char)(-var4[var5]) - 28120) >>> 10) + var5) + var5) ^ var5) - '霫') + '랯') ^ var5) + var5) ^ var5) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - 28120) << 6 | (char)((char)(-var4[var5]) - 28120) >>> 10) + var5) + var5) ^ var5) - '霫') + '랯') ^ var5) + var5) ^ var5) >>> 2) + var5) ^ 25492) - 24941))) - 30746) - 7359));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3237592516095443617L ^ Long.rotateLeft(7334870136716765247L, 34) ^ 8596976041694401877L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 4971131696559001898L ^ Long.rotateLeft(6740581850806998966L, 21) ^ -4182807453702957468L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2856702410457500040L ^ Long.rotateLeft(6448974609051320836L, 7) ^ -7910793524868038258L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 7993968616180082345L ^ Long.rotateLeft(6133745076660909027L, 19) ^ 3911403853657957461L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -9070031382805180845L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 7213251792362757572L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5901125437391832104L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7047667094054488051L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -4207550173885688955L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -7474292814047598174L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Ililllililil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iiilliiliiil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIilIIiiIIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IlIillIiilIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIiliIiiiIi<invokedynamic>());
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

   private static void iliIiiliiiii() {
      long var9 = -2160642868652135092L;
      long var11 = 9053105333073264285L;
      long var13 = 6904000284830722491L;
      var9 ^= ((long)System.getProperty(IIillIiliIil<invokedynamic>(), "").toLowerCase().contains(IIillIiliIil<invokedynamic>()) << 32 ^ var9) & -1L << 32;
      if ((int)(var9 >>> 32) != 0) {
         for(long var19 = var9 ^ (0L ^ var9) & -1L >>> 32; (int)var19 < 10; var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
            try {
               String var17 = IIillIiliIil<invokedynamic>() + (int)var19;
               RandomAccessFile var3 = new RandomAccessFile(var17, IIillIiliIil<invokedynamic>());
               IIiIIllIllIiIIllIl = var3;
               lilIIllIliilIIllIl = new FileInputStream(var3.getFD());
               illIIllIlIilIIllIl = new FileOutputStream(var3.getFD());
               return;
            }
         }
      } else {
         String[] var1 = new String[]{System.getenv(IIillIiliIil<invokedynamic>()), System.getenv(IIillIiliIil<invokedynamic>()), System.getProperty(IIillIiliIil<invokedynamic>()), IIillIiliIil<invokedynamic>()};
         String[] var2 = var1;
         var11 ^= ((long)var1.length << 32 ^ var11) & -1L << 32;

         for(long var21 = var11 ^ (0L ^ var11) & -1L >>> 32; (int)var21 < (int)(var21 >>> 32); var21 ^= (var21 ^ var21 + (long)1) & -1L >>> 32) {
            String var5 = var2[(int)var21];
            if (var5 != null) {
               for(var13 ^= (0L ^ var13) & -1L << 32; (int)(var13 >>> 32) < 10; var13 += 4294967296L) {
                  try {
                     UnixDomainSocketAddress var7 = UnixDomainSocketAddress.of(var5 + IIillIiliIil<invokedynamic>() + (int)(var13 >>> 32));
                     SocketChannel var8 = SocketChannel.open(var7);
                     var8.configureBlocking(true);
                     IIiIIllIllIiIIllIl = var8;
                     lilIIllIliilIIllIl = var8.socket().getInputStream();
                     illIIllIlIilIIllIl = var8.socket().getOutputStream();
                     return;
                  }
               }
            }
         }
      }

   }

   private static void IilliliilIIi() {
      if (IllIIllIllllIIllIl && illIIllIlIilIIllIl != null) {
         try {
            JsonObject var0 = new JsonObject();
            var0.addProperty(IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>());
            var0.addProperty(IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>());
            JsonObject var1 = new JsonObject();
            var1.addProperty(IIillIiliIil<invokedynamic>(), lIlIIllIliIlIIllIl);
            var0.add(IIillIiliIil<invokedynamic>(), var1);
            JsonObject var2 = new JsonObject();
            var2.addProperty(IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>());
            var2.addProperty(IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>());
            var0.add(IIillIiliIil<invokedynamic>(), var2);
            JsonArray var3 = new JsonArray();
            JsonObject var4 = new JsonObject();
            var4.addProperty(IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>());
            var4.addProperty(IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>());
            var3.add(var4);
            JsonObject var5 = new JsonObject();
            var5.addProperty(IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>());
            var5.addProperty(IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>());
            var3.add(var5);
            var0.add(IIillIiliIil<invokedynamic>(), var3);
            JsonObject var6 = new JsonObject();
            var6.addProperty(IIillIiliIil<invokedynamic>(), (int)(ProcessHandle.current().pid() & 2147483647L));
            var6.add(IIillIiliIil<invokedynamic>(), var0);
            JsonObject var7 = new JsonObject();
            var7.addProperty(IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>());
            var7.addProperty(IIillIiliIil<invokedynamic>(), String.valueOf(iiIIIllIlIIlIIllIl.getAndIncrement()));
            var7.add(IIillIiliIil<invokedynamic>(), var6);
            IIIllIIliIIl(1, var7.toString());
         } catch (Exception var8) {
            IIlllIlliIll();
         }

      }
   }

   private static void IIIllIIliIIl(int op, String json) {
      byte[] var2 = json.getBytes(StandardCharsets.UTF_8);
      ByteBuffer var3 = ByteBuffer.allocate(8 + var2.length).order(ByteOrder.LITTLE_ENDIAN);
      var3.putInt(op);
      var3.putInt(var2.length);
      var3.put(var2);
      illIIllIlIilIIllIl.write(var3.array());
      illIIllIlIilIIllIl.flush();
   }

   private static String IlIlllIlilIl() {
      long var4 = -7642989291487246192L;

      try {
         byte[] var0 = IiIlliIliiIl(8);
         if (var0 == null) {
            return null;
         } else {
            ByteBuffer var1 = ByteBuffer.wrap(var0).order(ByteOrder.LITTLE_ENDIAN);
            var1.getInt();
            var4 ^= ((long)var1.getInt() << 32 ^ var4) & -1L << 32;
            byte[] var3 = IiIlliIliiIl((int)(var4 >>> 32));
            return var3 == null ? null : new String(var3, StandardCharsets.UTF_8);
         }
      } catch (Exception var6) {
         return null;
      }
   }

   private static void iIlIlllllill() {
      IIlllIlliIll();

      try {
         iliIiiliiiii();
         if (illIIllIlIilIIllIl == null) {
            return;
         }

         JsonObject var0 = new JsonObject();
         var0.addProperty(IIillIiliIil<invokedynamic>(), 1);
         var0.addProperty(IIillIiliIil<invokedynamic>(), String.valueOf(1476045767755174113L));
         IIIllIIliIIl(0, var0.toString());
         Future var1 = Executors.newSingleThreadExecutor().submit(() -> IlIlllIlilIl());
         String var2 = (String)var1.get(3L, TimeUnit.SECONDS);
         if (var2 == null || !var2.contains(IIillIiliIil<invokedynamic>())) {
            IIlllIlliIll();
            return;
         }

         IllIIllIllllIIllIl = true;
         Thread.sleep(200L);
         IilliliilIIi();
      } catch (Exception var3) {
         IIlllIlliIll();
      }

   }

   private static void IIlllIlliIll() {
      IllIIllIllllIIllIl = false;

      try {
         if (illIIllIlIilIIllIl != null) {
            illIIllIlIilIIllIl.close();
         }
      } catch (Exception var3) {
      }

      try {
         if (lilIIllIliilIIllIl != null) {
            lilIIllIliilIIllIl.close();
         }
      } catch (Exception var2) {
      }

      try {
         if (IIiIIllIllIiIIllIl != null) {
            IIiIIllIllIiIIllIl.close();
         }
      } catch (Exception var1) {
      }

      illIIllIlIilIIllIl = null;
      lilIIllIliilIIllIl = null;
      IIiIIllIllIiIIllIl = null;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] - 11611) - '隘') >>> 3 | (char)((char)(var4[var5] - 11611) - '隘') << 13) ^ var5))) ^ var5))) - var5) + 22073) - var5) + '鹹') - 16517))) ^ 18413))) - 7136) << 11 | (char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] - 11611) - '隘') >>> 3 | (char)((char)(var4[var5] - 11611) - '隘') << 13) ^ var5))) ^ var5))) - var5) + 22073) - var5) + '鹹') - 16517))) ^ 18413))) - 7136) >>> 5) ^ '遥') - 570));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '聳') + '\uedfd') ^ '쯠'))))) ^ 26782) - 17746) + var5))) ^ var5) + var5) - var5) >>> 2 | (char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '聳') + '\uedfd') ^ '쯠'))))) ^ 26782) - 17746) + var5))) ^ var5) + var5) - var5) << 14) ^ 10337));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void liiiIIllIl() {
      if (!IllIIllIllllIIllIl) {
         iIlIlllllill();
      }

   }
}
