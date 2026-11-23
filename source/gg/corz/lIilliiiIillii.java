package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.ShortBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.ALC10;
import org.lwjgl.system.MemoryUtil;

public final class lIilliiiIillii {
   static final int IlilIliIIl = 8;
   private int IlIiIliIIl;
   private final Map<Integer, IiIlIlilliIlIlil> ililIliIIl = new ConcurrentHashMap();
   private int iIIiIliIIl;
   private final Set<Integer> IiilIliIIl = ConcurrentHashMap.newKeySet();
   private int[] liilIliIIl = new int[0];
   private long iiilIliIIl;
   private int lIIiIliIIl = -1;
   private final int[] llilIliIIl = new int[(~(1973893166 << 27 | 1973893166 >>> 5) >>> 25 | ~(1973893166 << 27 | 1973893166 >>> 5) << 7) ^ 694361934];
   private int IIIiIliIIl = -1;

   private void Ililllililil(int preset) {
      try {
         IiIlIlilliIlIlil var2 = IiIlIlilliIlIlil.iIlIlllllill(preset);
         this.ililIliIIl.put(preset, var2);
      } catch (Throwable var6) {
         Iiilliiliiil(IlIillIiilIi<invokedynamic>() + IiIlIlilliIlIlil.iillIIiIil[preset] + IlIillIiilIi<invokedynamic>() + var6);
      } finally {
         this.IiilIliIIl.remove(preset);
      }

   }

   public synchronized void iIlIlllllill() {
      if (this.IlIiIliIIl <= (~(~-1059742177 >>> 3 | ~-1059742177 << 29) ^ -132467753)) {
         try {
            this.IlIlllIlilIl();
         } catch (Throwable var2) {
            if (this.IlIiIliIIl++ < ((-(1487083973 >>> 15 | 1487083973 << 17) >>> 27 | -(1487083973 >>> 15 | 1487083973 << 17) << 5) ^ -1901471910)) {
               Iiilliiliiil(IlIillIiilIi<invokedynamic>() + var2);
            }
         }

      }
   }

   private boolean IlIlllIlilIl() {
      long var1 = ALC10.alcGetCurrentContext();
      if (var1 == (-7748487817348108156L ^ -7748487817348108156L)) {
         return false;
      } else {
         if (var1 != this.iiilIliIIl) {
            this.IIillIiliIil();
            if (!this.IiIlliIliiIl()) {
               ++this.IlIiIliIIl;
               return false;
            }

            this.iiilIliIIl = var1;
         }

         if (this.IIIiIliIIl != this.lIIiIliIIl) {
            IiIlIlilliIlIlil var3 = (IiIlIlilliIlIlil)this.ililIliIIl.get(this.lIIiIliIIl);
            if (var3 != null) {
               this.IIlllIlliIll(var3);
            }
         }

         return this.IIIiIliIIl >= 0;
      }
   }

   private void Iilllilliill() {
      for(int var4 : this.liilIliIIl) {
         if (var4 != 0) {
            AL10.alDeleteBuffers(var4);
         }
      }

      this.liilIliIIl = new int[0];
   }

   public synchronized boolean IilliliilIIi(int gain, boolean release, float code) {
      long var5 = -41414091733716718L;
      if (this.IlIiIliIIl > ((~(-(198523183 << 27 | 198523183 >>> 5)) >>> 27 | ~(-(198523183 << 27 | 198523183 >>> 5)) << 5) ^ 198523163)) {
         return false;
      } else {
         try {
            var5 ^= ((long)this.iliIiiliiiii(gain, release, code) << 32 ^ var5) & -1L << 32;
            return (boolean)((int)(var5 >>> 32));
         } catch (Throwable var7) {
            if (this.IlIiIliIIl++ < (((744606132 >>> 31 | 744606132 << 1) + -119 + -73) * 15 ^ 863344603)) {
               Iiilliiliiil(IlIillIiilIi<invokedynamic>() + var7);
            }

            return false;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(-((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] + 4162) - var5))) >>> 15 | (char)(-((char)((char)(var4[var5] + 4162) - var5))) << 1) + var5))) + '펳'))) ^ var5) ^ '衻'))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) << 11 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) >>> 5))) << 3 | (char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) << 11 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) >>> 5))) >>> 13) - 15539) << 4 | (char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) << 11 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) >>> 5))) << 3 | (char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) << 11 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) >>> 5))) >>> 13) - 15539) >>> 12) - var5) >>> 2 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) << 11 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) >>> 5))) << 3 | (char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) << 11 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) >>> 5))) >>> 13) - 15539) << 4 | (char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) << 11 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) >>> 5))) << 3 | (char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) << 11 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) >>> 5))) >>> 13) - 15539) >>> 12) - var5) << 14) + '鯰') << 4 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) << 11 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) >>> 5))) << 3 | (char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) << 11 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) >>> 5))) >>> 13) - 15539) << 4 | (char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) << 11 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) >>> 5))) << 3 | (char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) << 11 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) >>> 5))) >>> 13) - 15539) >>> 12) - var5) >>> 2 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) << 11 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) >>> 5))) << 3 | (char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) << 11 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) >>> 5))) >>> 13) - 15539) << 4 | (char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) << 11 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) >>> 5))) << 3 | (char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) << 11 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6))) + var5))) ^ 17000) + var5) ^ var5) >>> 5))) >>> 13) - 15539) >>> 12) - var5) << 14) + '鯰') >>> 12) - '\ue05c'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void IIIllIIliIIl() {
      if (this.iiilIliIIl != 0L && this.iiilIliIIl == ALC10.alcGetCurrentContext()) {
         AL10.alGetError();

         for(int var4 : this.llilIliIIl) {
            if (var4 != 0) {
               AL10.alSourceStop(var4);
               AL10.alSourcei(var4, 4105, 0);
               AL10.alDeleteSources(var4);
            }
         }

         this.Iilllilliill();
         AL10.alGetError();
      }
   }

   private boolean IiIlliIliiIl() {
      AL10.alGetError();

      for(int var1 = 0; var1 < 8; ++var1) {
         int var2 = AL10.alGenSources();
         if (AL10.alGetError() != 0 || var2 == 0) {
            for(int var3 = 0; var3 < var1; ++var3) {
               AL10.alDeleteSources(this.llilIliIIl[var3]);
            }

            Arrays.fill(this.llilIliIIl, 0);
            AL10.alGetError();
            return false;
         }

         AL10.alSourcei(var2, 514, 1);
         AL10.alSource3f(var2, 4100, 0.0F, 0.0F, 0.0F);
         AL10.alSourcef(var2, 4129, 0.0F);
         this.llilIliIIl[var1] = var2;
      }

      AL10.alGetError();
      return true;
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ 25787) >>> 11 | (char)(var4[var5] ^ 25787) << 5) >>> 4 | (char)((char)(var4[var5] ^ 25787) >>> 11 | (char)(var4[var5] ^ 25787) << 5) << 12) + var5))) ^ '\ueea2') ^ var5) ^ var5) ^ var5) - '\ue569'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void IIlllIlliIll(IiIlIlilliIlIlil b) {
      AL10.alGetError();

      for(int var5 : this.llilIliIIl) {
         if (var5 != 0) {
            AL10.alSourceStop(var5);
            AL10.alSourcei(var5, 4105, 0);
         }
      }

      this.Iilllilliill();
      this.liilIliIIl = Illlllllilll(b.IlilIIiIil);
      int var6 = AL10.alGetError();
      if (var6 == 0 && this.liilIliIIl.length != 0) {
         this.IIIiIliIIl = b.iIilIIiIil;
      } else {
         Iiilliiliiil(IlIillIiilIi<invokedynamic>() + Integer.toHexString(var6));
         this.Iilllilliill();
         this.IIIiIliIIl = -1;
         ++this.IlIiIliIIl;
      }
   }

   private boolean iliIiiliiiii(int release, boolean gain, float code) {
      if (!this.IlIlllIlilIl()) {
         return false;
      } else {
         IiIlIlilliIlIlil var4 = (IiIlIlilliIlIlil)this.ililIliIIl.get(this.IIIiIliIIl);
         if (var4 == null) {
            return false;
         } else {
            int var5 = gain ? var4.iliIiiliiiii(release) : var4.lIiiIiIlilli(release);
            if (var5 >= 0 && var5 < this.liilIliIIl.length && this.liilIliIIl[var5] != 0) {
               int var6 = this.llilIliIIl[this.iIIiIliIIl];
               this.iIIiIliIIl = (this.iIIiIliIIl + 1) % 8;
               AL10.alGetError();
               AL10.alSourceStop(var6);
               AL10.alSourcei(var6, 4105, this.liilIliIIl[var5]);
               AL10.alSourcef(var6, 4106, Math.max(0.0F, code));
               AL10.alSourcef(var6, 4099, 1.0F);
               AL10.alSourcePlay(var6);
               int var7 = AL10.alGetError();
               if (var7 != 0) {
                  if (this.IlIiIliIIl++ < 3) {
                     Iiilliiliiil(IlIillIiilIi<invokedynamic>() + Integer.toHexString(var7) + IlIillIiilIi<invokedynamic>());
                  }

                  return false;
               } else {
                  return true;
               }
            } else {
               return false;
            }
         }
      }
   }

   private void IIillIiliIil() {
      Arrays.fill(this.llilIliIIl, 0);
      this.liilIliIIl = new int[0];
      this.iiilIliIIl = 0L;
      this.IIIiIliIIl = -1;
      this.iIIiIliIIl = 0;
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ 'רּ') ^ var5) - 24685))) ^ var5) - var5))) ^ var5) - 18675) - 10447) + var5) ^ var5) >>> 10 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ 'רּ') ^ var5) - 24685))) ^ var5) - var5))) ^ var5) - 18675) - 10447) + var5) ^ var5) << 6))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public synchronized boolean liiiIIllIl(int preset) {
      try {
         return this.iiilIliIIl != (2916587478547975359L ^ 2916587478547975359L) && this.IIIiIliIIl == preset && this.iiilIliIIl == ALC10.alcGetCurrentContext();
      } catch (Throwable var3) {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -5926088560416178536L ^ Long.rotateLeft(2178713923181783173L, 13) ^ -7750962846564616907L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -8264299100730975585L ^ Long.rotateLeft(-263029163490786532L, 22) ^ 6142054854959006908L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -9153612177540564122L ^ Long.rotateLeft(-1884738892253379123L, 42) ^ 7435464414045741626L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 4199494258416259876L ^ Long.rotateLeft(-4187638419300680233L, 50) ^ -1954220304989275399L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1049505973770346293L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5292972311592261391L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4574311341655988596L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3584614614617751957L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 3390725391299719166L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2296331360716985765L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Iilililiiili<invokedynamic>());
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

   private static void Iiilliiliiil(String msg) {
   }

   public synchronized void lIiiIiIlilli() {
      try {
         this.IIIllIIliIIl();
      } catch (Throwable var2) {
      }

      this.IIillIiliIil();
      this.IlIiIliIIl = 0;
   }

   private static int[] Illlllllilll(illIIIliIilIIIli[] clips) {
      int[] var1 = new int[clips.length];

      for(int var2 = 0; var2 < clips.length; ++var2) {
         illIIIliIilIIIli var3 = clips[var2];
         int var4 = AL10.alGenBuffers();
         ShortBuffer var5 = MemoryUtil.memAllocShort(var3.IIlllIlliIll().length);

         try {
            var5.put(var3.IIlllIlliIll()).flip();
            AL10.alBufferData(var4, var3.Illlllllilll() == 2 ? 4355 : 4353, var5, var3.Iilllilliill());
         } finally {
            MemoryUtil.memFree(var5);
         }

         var1[var2] = var4;
      }

      return var1;
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - '餅'))) + var5) << 9 | (char)((char)(~((char)(var4[var5] - '餅'))) + var5) >>> 7))) - var5) ^ 6085) + var5))) << 6 | (char)(~((char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - '餅'))) + var5) << 9 | (char)((char)(~((char)(var4[var5] - '餅'))) + var5) >>> 7))) - var5) ^ 6085) + var5))) >>> 10) ^ var5) - var5) ^ '\uefac') ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public synchronized void IliIlllilIi(int preset) {
      long var4 = -1192621611416556134L;
      var4 ^= ((long)IiIlIlilliIlIlil.liiiIIllIl(preset) << 32 ^ var4) & -1L << 32;
      this.lIIiIliIIl = (int)(var4 >>> 32);
      if (!this.ililIliIIl.containsKey((int)(var4 >>> 32)) && this.IiilIliIIl.add((int)(var4 >>> 32))) {
         Thread var3 = new Thread(() -> this.Ililllililil(p), IlIillIiilIi<invokedynamic>());
         var3.setDaemon(true);
         var3.setPriority(1);
         var3.start();
      }
   }
}
