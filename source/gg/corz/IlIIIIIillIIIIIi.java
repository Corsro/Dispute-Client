package gg.corz;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

final class IlIIIIIillIIIIIi {
   private static volatile Process llilliIiil;
   private static volatile boolean IiilliIiil;
   private static final String liilliIiil = "$ErrorActionPreference = 'SilentlyContinue'\n[Console]::OutputEncoding = [System.Text.Encoding]::UTF8\nAdd-Type -AssemblyName System.Runtime.WindowsRuntime\n$asTaskGeneric = ([System.WindowsRuntimeSystemExtensions].GetMethods() | Where-Object { $_.Name -eq 'AsTask' -and $_.GetParameters().Count -eq 1 -and $_.GetParameters()[0].ParameterType.Name -eq 'IAsyncOperation`1' })[0]\nfunction Await($op, $type) { $t = $asTaskGeneric.MakeGenericMethod($type).Invoke($null, @($op)); $t.Wait(-1) | Out-Null; $t.Result }\n$mgrType = [Windows.Media.Control.GlobalSystemMediaTransportControlsSessionManager, Windows.Media.Control, ContentType=WindowsRuntime]\n$mgr = Await ($mgrType::RequestAsync()) $mgrType\n$sep = [char]31\nwhile ($true) {\n  try {\n    $sessions = $mgr.GetSessions()\n    $s = $sessions | Where-Object { $_.SourceAppUserModelId -like '*Spotify*' } | Select-Object -First 1\n    if (-not $s) { $s = $mgr.GetCurrentSession() }\n    if ($s) {\n      $m = Await ($s.TryGetMediaPropertiesAsync()) ([Windows.Media.Control.GlobalSystemMediaTransportControlsSessionMediaProperties])\n      $tl = $s.GetTimelineProperties()\n      $pb = $s.GetPlaybackInfo()\n      $posMs = $tl.Position.TotalMilliseconds\n      if ([int]$pb.PlaybackStatus -eq 4) { $age = ([DateTimeOffset]::Now - $tl.LastUpdatedTime).TotalMilliseconds; if ($age -gt 0 -and $age -lt 900000) { $posMs += $age } }\n      Write-Output (\"T\" + $sep + $m.Title + $sep + $m.Artist + $sep + ([int]$tl.Position.TotalSeconds) + $sep + ([int]$tl.EndTime.TotalSeconds) + $sep + ([int]$pb.PlaybackStatus) + $sep + ([long]$posMs))\n    } else { Write-Output \"NONE\" }\n  } catch { Write-Output \"NONE\" }\n  [Console]::Out.Flush()\n  Start-Sleep -Milliseconds 350\n}\n";
   private static volatile long ililliIiil;

   static synchronized void IliIlllilIi() {
      if (llilliIiil == null || !llilliIiil.isAlive()) {
         if (System.getProperty(IIIllIIliIIl<invokedynamic>(), "").toLowerCase(Locale.ROOT).contains(IIIllIIliIIl<invokedynamic>())) {
            long var0 = System.currentTimeMillis();
            if (var0 - ililliIiil >= 5000L) {
               ililliIiil = var0;

               try {
                  File var2 = File.createTempFile(IIIllIIliIIl<invokedynamic>(), IIIllIIliIIl<invokedynamic>());
                  var2.deleteOnExit();
                  Files.writeString(var2.toPath(), IIIllIIliIIl<invokedynamic>() + IIIllIIliIIl<invokedynamic>() + IIIllIIliIIl<invokedynamic>());
                  Process var3 = (new ProcessBuilder(new String[]{IIIllIIliIIl<invokedynamic>(), IIIllIIliIIl<invokedynamic>(), IIIllIIliIIl<invokedynamic>(), IIIllIIliIIl<invokedynamic>(), IIIllIIliIIl<invokedynamic>(), IIIllIIliIIl<invokedynamic>(), IIIllIIliIIl<invokedynamic>(), var2.getAbsolutePath()})).start();
                  llilliIiil = var3;
                  Thread var4 = new Thread(() -> iIlIlllllill(var3), IIIllIIliIIl<invokedynamic>());
                  var4.setDaemon(true);
                  var4.start();
                  if (!IiilliIiil) {
                     IiilliIiil = true;
                     Runtime.getRuntime().addShutdownHook(new Thread(IlIIIIIillIIIIIi::liiiIIllIl));
                  }
               } catch (Exception var5) {
               }

            }
         }
      }
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ 8105) + 883) ^ 17046) ^ var5))) + var5)) ^ 18540) + '뼸') ^ 7149) << 2 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ 8105) + 883) ^ 17046) ^ var5))) + var5)) ^ 18540) + '뼸') ^ 7149) >>> 14) + var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static synchronized void liiiIIllIl() {
      Process var0 = llilliIiil;
      llilliIiil = null;
      if (var0 != null) {
         var0.destroyForcibly();
      }

   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] - var5) + var5))))) >>> 4 | (char)(-((char)(~((char)((char)(var4[var5] - var5) + var5))))) << 12) ^ 31653) - var5) + var5) + var5) << 6 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] - var5) + var5))))) >>> 4 | (char)(-((char)(~((char)((char)(var4[var5] - var5) + var5))))) << 12) ^ 31653) - var5) + var5) + var5) >>> 10))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) ^ 10786) >>> 13 | (char)((char)((char)(-var4[var5]) - var5) ^ 10786) << 3) + 15234) >>> 2 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) ^ 10786) >>> 13 | (char)((char)((char)(-var4[var5]) - var5) ^ 10786) << 3) + 15234) << 14) ^ var5) - var5) + 8591) + 23338))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private IlIIIIIillIIIIIi() {
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) >>> 5 | (char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) << 11))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) >>> 5 | (char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) << 11))) << 1))) << 14 | (char)(~((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) >>> 5 | (char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) << 11))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) >>> 5 | (char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) << 11))) << 1))) >>> 2) << 2 | (char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) >>> 5 | (char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) << 11))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) >>> 5 | (char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) << 11))) << 1))) << 14 | (char)(~((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) >>> 5 | (char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) << 11))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) >>> 5 | (char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) << 11))) << 1))) >>> 2) >>> 14))))) << 6 | (char)(~((char)(-((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) >>> 5 | (char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) << 11))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) >>> 5 | (char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) << 11))) << 1))) << 14 | (char)(~((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) >>> 5 | (char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) << 11))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) >>> 5 | (char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) << 11))) << 1))) >>> 2) << 2 | (char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) >>> 5 | (char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) << 11))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) >>> 5 | (char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) << 11))) << 1))) << 14 | (char)(~((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) >>> 5 | (char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) << 11))) >>> 15 | (char)(-((char)((char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) >>> 5 | (char)((char)(var4[var5] + var5) << 8 | (char)(var4[var5] + var5) >>> 8) << 11))) << 1))) >>> 2) >>> 14))))) >>> 10) + var5) + 27357) ^ var5) ^ var5) ^ var5) + 11377));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void iIlIlllllill(Process p) {
      String var1 = null;
      String var2 = null;
      String var3 = null;
      String var4 = null;
      int var5 = 0;
      int var6 = 0;

      try {
         BufferedReader var7 = new BufferedReader(new InputStreamReader(p.getInputStream(), StandardCharsets.UTF_8));

         String var8;
         try {
            while((var8 = var7.readLine()) != null) {
               if (!var8.isEmpty() && !var8.startsWith(IIIllIIliIIl<invokedynamic>())) {
                  String[] var9 = var8.split(IIIllIIliIIl<invokedynamic>(), -1);
                  if (var9.length >= 6 && IIIllIIliIIl<invokedynamic>().equals(var9[0])) {
                     String var10 = var9[1];
                     String var11 = var9[2];
                     int var12 = Math.max(1, IilliliilIIi(var9[4]));
                     boolean var13 = IilliliilIIi(var9[5]) == 4;
                     long var14 = var9.length >= 7 ? lIiiIiIlilli(var9[6], -1L) : -1L;
                     IiIiIIliliIiIIli.IlIIillIIi(var11, var10);
                     if (var12 <= 1) {
                        ++var6;
                        if (var6 < 4) {
                           IiIiIIliliIiIIli.IlIllllIll(var10, var11, var13);
                           continue;
                        }
                     } else {
                        var6 = 0;
                     }

                     long var16 = var14 >= 0L ? var14 : (long)IilliliilIIi(var9[3]) * 1000L;
                     boolean var18 = !var10.equals(var1) || !var11.equals(var2);
                     if (!var18 || var12 <= 1 || var12 != var5 || var16 <= 3000L || var10.equals(var3) && var11.equals(var4)) {
                        var3 = null;
                        var4 = null;
                        if (var14 >= 0L) {
                           IiIiIIliliIiIIli.lIIlliIIll(var10, var11, var14, var12, var13, 900L);
                        } else {
                           IiIiIIliliIiIIli.iiiIlIIIll(var10, var11, IilliliilIIi(var9[3]), var12, var13);
                        }

                        if (var12 > 1) {
                           var1 = var10;
                           var2 = var11;
                           var5 = var12;
                           Iiilililliililil.iIlIlllllill(var11, var10, var12);
                        }
                     } else {
                        var3 = var10;
                        var4 = var11;
                        IiIiIIliliIiIIli.IlIllllIll(var10, var11, var13);
                     }
                  }
               }
            }
         } catch (Throwable var20) {
            try {
               var7.close();
            } catch (Throwable var19) {
               var20.addSuppressed(var19);
            }

            throw var20;
         }

         var7.close();
      } catch (Exception var21) {
      }

   }

   private static long lIiiIiIlilli(String def, long s) {
      try {
         return Long.parseLong(def.trim());
      } catch (Exception var4) {
         return s;
      }
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -3249340667876465041L ^ Long.rotateLeft(-6746396796529410045L, 61) ^ 1269113057477524380L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5728474916961428744L ^ Long.rotateLeft(-7020789577594300638L, 16) ^ -5349476101251838384L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -9167084582988807893L ^ Long.rotateLeft(-2635804949559952910L, 14) ^ -3277142376582788650L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 6366468066326821867L ^ Long.rotateLeft(-5685048771036872514L, 28) ^ -3924374463173830855L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4870966255009723487L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 4209821568281459784L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4104819042374278364L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 8048220583503516135L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6162512160524534121L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -2070471676831480012L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Illlllllilll<invokedynamic>());
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

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) << 12 | (char)(var4[var5] - var5) >>> 4) - '锜') - '륑') ^ var5))))) << 2 | (char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) << 12 | (char)(var4[var5] - var5) >>> 4) - '锜') - '륑') ^ var5))))) >>> 14) - 4677))) + '쁷') ^ '꒨') + var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static int IilliliilIIi(String s) {
      try {
         return Integer.parseInt(s.trim());
      } catch (Exception var2) {
         return 0;
      }
   }
}
