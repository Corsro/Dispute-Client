package gg.corz;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class iIiIliIiIliIliIi {
   private JsonObject llIilliIIi;
   private volatile long iIillliIIi;
   private static final int IIlllliIIi = 64;
   private long liIilliIIi;
   private volatile IiiIiIilliiIiIil lllllliIIi;
   private volatile long iIlilliIIi;
   private volatile String ilillliIIi;
   private volatile String lIillliIIi;
   private volatile long lIIilliIIi;
   private volatile Thread iIlllliIIi;
   private volatile boolean IilllliIIi;
   private volatile long IIIilliIIi;
   private final ConcurrentLinkedQueue<ilIllIiIiIllIi> lllilliIIi;
   private volatile String IlillliIIi;
   private static final long iiIllliIIi = 3000L;
   private volatile JsonObject liillliIIi;
   private JsonArray IlIilliIIi;
   private volatile String IiillliIIi;
   private volatile JsonObject iiillliIIi;
   private long iiIilliIIi;
   private final Object iIIilliIIi;
   private volatile String illllliIIi;
   private final IIiliIlllIiliIll lIlllliIIi;
   private long IiIilliIIi;
   private volatile boolean IIlilliIIi;
   private volatile String iilllliIIi;
   private volatile int lIlilliIIi;
   private volatile String lilllliIIi;
   private long ilIilliIIi;
   private volatile boolean IllllliIIi;
   private volatile String llillliIIi;
   private final ConcurrentLinkedQueue<ilIllIiIiIllIi> IllilliIIi;
   private volatile String IIillliIIi;
   private static final long liIllliIIi = 900L;

   public long Iiilliiliiil() {
      return Math.max(0L, this.iIlilliIIi);
   }

   public boolean Ililllililil() {
      return this.IIlilliIIi;
   }

   private void IiIiliIiiiIi() {
      long var17 = -1257947695421203050L;
      long var15 = -756025025599294005L;
      ArrayList var1 = new ArrayList();

      ilIllIiIiIllIi var2;
      while(var1.size() < 64 && (var2 = (ilIllIiIiIllIi)this.lllilliIIi.poll()) != null) {
         var1.add(var2);
      }

      JsonArray var3 = new JsonArray();

      for(ilIllIiIiIllIi var5 : var1) {
         var3.add(var5.liiiIIllIl());
      }

      var15 ^= ((long)(this.iilllliIIi != null && this.iilllliIIi.equals(this.IIillliIIi) ? 1 : 0) << 32 ^ var15) & -1L << 32;
      JsonObject var20 = (int)(var15 >>> 32) != 0 ? this.iiillliIIi : null;
      iIIlIiIlIlIi var6 = this.lIlllliIIi.liiiIIllIl(this.lilllliIIi, this.iilllliIIi, this.liillliIIi, var3, this.liIilliIIi, var20, this.IIIilliIIi, this.lIIilliIIi);
      if (!var6.iiiliiiiIIIiiiii) {
         for(ilIllIiIiIllIi var8 : var1) {
            this.lllilliIIi.offer(var8);
         }

         if (!Illillliilli<invokedynamic>().equals(var6.IlIiiiiillIiiiii) && !Illillliilli<invokedynamic>().equals(var6.IlIiiiiillIiiiii)) {
            this.IilllliIIi = true;
            this.illllliIIi = var6.IlIiiiiillIiiiii;
         } else {
            this.lllllliIIi = IiiIiIilliiIiIil.ilIIIilIil;
         }
      } else {
         this.IilllliIIi = false;
         this.illllliIIi = "";
         ilIillIiIiIillIi var7 = (ilIillIiIiIillIi)var6.lIIiiiiiiIIiiiii;
         if (var7.lIiIIIlIIi) {
            this.lllllliIIi = IiiIiIilliiIiIil.ilIIIilIil;
         } else {
            this.IIillliIIi = var7.iilIIIlIIi != null ? var7.iilIIIlIIi : this.IIillliIIi;
            this.lIillliIIi = var7.IIiIIIlIIi != null ? var7.IIiIIIlIIi : this.lIillliIIi;
            this.iIillliIIi = var7.iIiIIIlIIi;
            var15 ^= ((long)this.IIlilliIIi ^ var15) & -1L >>> 32;
            if ((int)var15 != 0) {
               this.IIlilliIIi = false;
               long var9 = var7.lliIIIlIIi != null && var7.lliIIIlIIi.has(Illillliilli<invokedynamic>()) ? var7.lliIIIlIIi.get(Illillliilli<invokedynamic>()).getAsLong() : 0L;
               this.iIlilliIIi = var9;
               var17 ^= (0L ^ var17) & -1L << 32;
               if (var7.iliIIIlIIi != null) {
                  for(JsonElement var13 : var7.iliIIIlIIi) {
                     if (var13.isJsonObject()) {
                        var17 += 4294967296L;
                     }
                  }
               }

               this.lIlilliIIi = (int)(var17 >>> 32);
            }

            synchronized(this.iIIilliIIi) {
               if (var7.IliIIIlIIi != null) {
                  this.IlIilliIIi = var7.IliIIIlIIi;
               }

               if (var7.lliIIIlIIi != null && var7.lliIIIlIIi.has(Illillliilli<invokedynamic>())) {
                  long var10 = var7.lliIIIlIIi.get(Illillliilli<invokedynamic>()).getAsLong();
                  if (var10 > this.ilIilliIIi && var10 > this.iIlilliIIi) {
                     this.llIilliIIi = var7.lliIIIlIIi;
                     this.ilIilliIIi = var10;
                  }
               }

               this.iiIilliIIi = Math.max(this.iiIilliIIi, var7.IiiIIIlIIi);
            }

            if ((int)var15 != 0) {
               this.liIilliIIi = Math.max(this.liIilliIIi, var7.IiiIIIlIIi);
            } else if (var7.iliIIIlIIi != null) {
               long var22 = this.liIilliIIi;

               for(JsonElement var23 : var7.iliIIIlIIi) {
                  if (var23.isJsonObject()) {
                     ilIllIiIiIllIi var24 = ilIllIiIiIllIi.iIlIlllllill(var23.getAsJsonObject());
                     if (var24 != null && (var24.llilllIiiililllIii < 0L || var24.llilllIiiililllIii > this.liIilliIIi)) {
                        if (this.iilllliIIi != null && this.iilllliIIi.equals(var24.iIilllIiiIlilllIii)) {
                           var22 = Math.max(var22, var24.llilllIiiililllIii);
                        } else {
                           this.IllilliIIi.offer(var24);
                           if (var24.llilllIiiililllIii > var22) {
                              var22 = var24.llilllIiiililllIii;
                           }
                        }
                     }
                  }
               }

               this.liIilliIIi = Math.max(this.liIilliIIi, Math.max(var22, var7.IiiIIIlIIi));
            }

         }
      }
   }

   public void lIiiIiIlilli(ilIllIiIiIllIi m) {
      if (m != null) {
         this.lllilliIIi.offer(m);
      }

   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6469962436989255223L ^ Long.rotateLeft(-1225104199738488849L, 19) ^ -8205982759577551190L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 865834046858657605L ^ Long.rotateLeft(2478920342547120399L, 17) ^ 3217074133756641681L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 4798902219568209136L ^ Long.rotateLeft(-6660393166887634969L, 3) ^ 4599521223681080963L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7354239816331707678L ^ Long.rotateLeft(-9166168492282977275L, 20) ^ 1766668370311648108L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1327886101573936048L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 4441204825375018360L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5981238895357573479L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2785374916861204277L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5635468722938151241L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -441431266100560680L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iilililiiili<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIiilIiiiIii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iliilliiilii<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Iiiiliiiiiii<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIIIllIIIl<invokedynamic>());
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

   public iIiIliIiIliIliIi(IIiliIlllIiliIll transport) {
      this.lllllliIIi = IiiIiIilliiIiIil.iIIIIilIil;
      this.illllliIIi = "";
      this.liillliIIi = new JsonObject();
      this.iIIilliIIi = new Object();
      this.IlIilliIIi = new JsonArray();
      this.ilIilliIIi = -1L;
      this.IiIilliIIi = -1L;
      this.iIlilliIIi = -1L;
      this.IllilliIIi = new ConcurrentLinkedQueue();
      this.lllilliIIi = new ConcurrentLinkedQueue();
      this.lIlllliIIi = transport;
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5])) - var5) - var5) ^ 19914) - 8230) ^ var5) - var5) + 2845) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5])) - var5) - var5) ^ 19914) - 8230) ^ var5) - var5) + 2845) << 13) + var5))) ^ 11344))) - 2052));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void liiiIIllIl() {
      this.IllllliIIi = false;
      Thread var1 = this.iIlllliIIi;
      if (var1 != null) {
         var1.interrupt();
      }

      this.iIlllliIIi = null;
      String var2 = this.lilllliIIi;
      String var3 = this.iilllliIIi;
      if (var2 != null && var3 != null) {
         Thread var4 = new Thread(() -> {
            try {
               this.lIlllliIIi.iIlIlllllill(var2, var3);
            } catch (Exception var4) {
            }

         }, Illillliilli<invokedynamic>());
         var4.setDaemon(true);
         var4.start();
      }

      this.lllllliIIi = IiiIiIilliiIiIil.iIIIIilIil;
   }

   public String Illlllllilll() {
      return this.IIillliIIi;
   }

   public void iliIiiliiiii(iiiIIilIIIlIil c) {
      JsonObject var3 = null;
      long var4 = -1L;
      JsonArray var2;
      synchronized(this.iIIilliIIi) {
         var2 = this.IlIilliIIi;
         if (this.llIilliIIi != null && this.ilIilliIIi > this.IiIilliIIi) {
            var3 = this.llIilliIIi;
            var4 = this.ilIilliIIi;
            this.IiIilliIIi = this.ilIilliIIi;
            this.lIIilliIIi = this.ilIilliIIi;
         }
      }

      if (var2 != null) {
         c.IliIlllilIi(var2, this.IIillliIIi, this.iIillliIIi);
      }

      if (var3 != null && var3.has(Illillliilli<invokedynamic>()) && var3.get(Illillliilli<invokedynamic>()).isJsonObject()) {
         c.liiiIIllIl(var4, var3.getAsJsonObject(Illillliilli<invokedynamic>()));
      }

      ilIllIiIiIllIi var6;
      while((var6 = (ilIllIiIiIllIi)this.IllilliIIi.poll()) != null) {
         c.iIlIlllllill(var6);
      }

   }

   public void IilliliilIIi(JsonObject doc, long version) {
      this.iiillliIIi = doc;
      this.IIIilliIIi = version;
   }

   public IiiIiIilliiIiIil IIIllIIliIIl() {
      return this.lllllliIIi;
   }

   private void IIIilIIiiIIi() {
      while(this.IllllliIIi) {
         try {
            switch (this.lllllliIIi.ordinal()) {
               case 1 -> this.IlIillIiilIi();
               case 2 -> this.IiIiliIiiiIi();
               default -> {
                  return;
               }
            }
         } catch (Exception var3) {
            this.illllliIIi = Illillliilli<invokedynamic>();
         }

         try {
            Thread.sleep(this.IilllliIIi ? 3000L : 900L);
         } catch (InterruptedException var2) {
            return;
         }
      }

   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '谧') >>> 6 | (char)(var4[var5] ^ '谧') << 10) ^ 29566) >>> 6 | (char)((char)((char)(var4[var5] ^ '谧') >>> 6 | (char)(var4[var5] ^ '谧') << 10) ^ 29566) << 10) ^ 18383) << 13 | (char)((char)((char)((char)((char)(var4[var5] ^ '谧') >>> 6 | (char)(var4[var5] ^ '谧') << 10) ^ 29566) >>> 6 | (char)((char)((char)(var4[var5] ^ '谧') >>> 6 | (char)(var4[var5] ^ '谧') << 10) ^ 29566) << 10) ^ 18383) >>> 3) + var5))) ^ var5) ^ var5) ^ '\ue2eb') - '驱') ^ var5) - 2812) >>> 6 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '谧') >>> 6 | (char)(var4[var5] ^ '谧') << 10) ^ 29566) >>> 6 | (char)((char)((char)(var4[var5] ^ '谧') >>> 6 | (char)(var4[var5] ^ '谧') << 10) ^ 29566) << 10) ^ 18383) << 13 | (char)((char)((char)((char)((char)(var4[var5] ^ '谧') >>> 6 | (char)(var4[var5] ^ '谧') << 10) ^ 29566) >>> 6 | (char)((char)((char)(var4[var5] ^ '谧') >>> 6 | (char)(var4[var5] ^ '谧') << 10) ^ 29566) << 10) ^ 18383) >>> 3) + var5))) ^ var5) ^ var5) ^ '\ue2eb') - '驱') ^ var5) - 2812) << 10) + 21733))) + 24061) >>> 3 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '谧') >>> 6 | (char)(var4[var5] ^ '谧') << 10) ^ 29566) >>> 6 | (char)((char)((char)(var4[var5] ^ '谧') >>> 6 | (char)(var4[var5] ^ '谧') << 10) ^ 29566) << 10) ^ 18383) << 13 | (char)((char)((char)((char)((char)(var4[var5] ^ '谧') >>> 6 | (char)(var4[var5] ^ '谧') << 10) ^ 29566) >>> 6 | (char)((char)((char)(var4[var5] ^ '谧') >>> 6 | (char)(var4[var5] ^ '谧') << 10) ^ 29566) << 10) ^ 18383) >>> 3) + var5))) ^ var5) ^ var5) ^ '\ue2eb') - '驱') ^ var5) - 2812) >>> 6 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '谧') >>> 6 | (char)(var4[var5] ^ '谧') << 10) ^ 29566) >>> 6 | (char)((char)((char)(var4[var5] ^ '谧') >>> 6 | (char)(var4[var5] ^ '谧') << 10) ^ 29566) << 10) ^ 18383) << 13 | (char)((char)((char)((char)((char)(var4[var5] ^ '谧') >>> 6 | (char)(var4[var5] ^ '谧') << 10) ^ 29566) >>> 6 | (char)((char)((char)(var4[var5] ^ '谧') >>> 6 | (char)(var4[var5] ^ '谧') << 10) ^ 29566) << 10) ^ 18383) >>> 3) + var5))) ^ var5) ^ var5) ^ '\ue2eb') - '驱') ^ var5) - 2812) << 10) + 21733))) + 24061) << 13));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String Iilllilliill() {
      return this.lIillliIIi;
   }

   private void IlIillIiilIi() {
      iIIlIiIlIlIi var1 = this.lIlllliIIi.IliIlllilIi(this.IlillliIIi, this.llillliIIi, this.ilillliIIi, this.IiillliIIi);
      if (!var1.iiiliiiiIIIiiiii) {
         this.IilllliIIi = Illillliilli<invokedynamic>().equals(var1.IlIiiiiillIiiiii);
         this.illllliIIi = var1.IlIiiiiillIiiiii;
         if (!this.IilllliIIi) {
            this.lllllliIIi = IiiIiIilliiIiIil.IiIIIilIil;
         }

      } else {
         iiIilllIIlilll var2 = (iiIilllIIlilll)var1.lIIiiiiiiIIiiiii;
         this.lilllliIIi = var2.lIIIllIIiiIIIllIIi;
         this.iilllliIIi = var2.IlIIllIIillIIllIIi;
         this.IIillliIIi = var2.ilIIllIIiIiIIllIIi;
         this.lIillliIIi = var2.liIIllIIiiiIIllIIi;
         this.IilllliIIi = false;
         this.illllliIIi = "";
         this.lllllliIIi = IiiIiIilliiIiIil.llIIIilIil;
      }
   }

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3) + 'ﲜ') << 11 | (char)((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3) + 'ﲜ') >>> 5))))) + var5) + var5) >>> 3 | (char)((char)((char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3) + 'ﲜ') << 11 | (char)((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3) + 'ﲜ') >>> 5))))) + var5) + var5) << 13) - '턡') >>> 3 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3) + 'ﲜ') << 11 | (char)((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3) + 'ﲜ') >>> 5))))) + var5) + var5) >>> 3 | (char)((char)((char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3) + 'ﲜ') << 11 | (char)((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3) + 'ﲜ') >>> 5))))) + var5) + var5) << 13) - '턡') << 13) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IIlllIlliIll() {
      return this.iilllliIIi;
   }

   public String IiIlliIliiIl() {
      return this.illllliIIi;
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ '\udf9f') + var5) - var5) + '\udcda'))) + var5) ^ var5) ^ var5) + var5) ^ 23559) + var5))) << 9 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ '\udf9f') + var5) - var5) + '\udcda'))) + var5) ^ var5) ^ var5) + var5) ^ 23559) + var5))) >>> 7) ^ '\ufb0b'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iIlIlllllill(JsonObject s) {
      if (s != null) {
         this.liillliIIi = s;
      }

   }

   public void IliIlllilIi(String uuid, String roomId, String buildHash, String displayName) {
      this.liiiIIllIl();
      this.IlillliIIi = uuid;
      this.llillliIIi = roomId;
      this.ilillliIIi = buildHash;
      this.IiillliIIi = displayName;
      this.lilllliIIi = null;
      this.iilllliIIi = null;
      this.IIillliIIi = null;
      this.lIillliIIi = null;
      this.illllliIIi = "";
      this.IilllliIIi = false;
      this.iiillliIIi = null;
      this.IIIilliIIi = 0L;
      this.lIIilliIIi = 0L;
      synchronized(this.iIIilliIIi) {
         this.IlIilliIIi = new JsonArray();
         this.llIilliIIi = null;
         this.ilIilliIIi = -1L;
         this.IiIilliIIi = -1L;
         this.liIilliIIi = 0L;
         this.iiIilliIIi = 0L;
         this.IIlilliIIi = true;
         this.lIlilliIIi = 0;
         this.iIlilliIIi = -1L;
         this.IllilliIIi.clear();
         this.lllilliIIi.clear();
      }

      this.lllllliIIi = IiiIiIilliiIiIil.IlIIIilIil;
      this.IllllliIIi = true;
      Thread var5 = new Thread(this::IIIilIIiiIIi, Illillliilli<invokedynamic>());
      var5.setDaemon(true);
      this.iIlllliIIi = var5;
      var5.start();
   }

   public int IIillIiliIil() {
      return this.lIlilliIIi;
   }

   public boolean IlIlllIlilIl() {
      return this.IilllliIIi;
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(-((char)((char)((char)((char)(~((char)((char)(~((char)(~((char)(~((char)(var4[var5] + var5))))))) + 7131))) - var5) + '鐊') ^ '멩'))) + '鯷'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
