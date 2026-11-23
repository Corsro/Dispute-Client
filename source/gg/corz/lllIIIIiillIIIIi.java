package gg.corz;

import com.google.gson.JsonParser;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.JsonOps;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2561;
import net.minecraft.class_268;
import net.minecraft.class_310;
import net.minecraft.class_634;
import net.minecraft.class_640;
import net.minecraft.class_642;
import net.minecraft.class_8824;

public class lllIIIIiillIIIIi extends ilIllIiIll {
   private long lliIiiIiil;
   private final Illillllllilll iIiIiiIiil = new Illillllllilll();
   private int iliIiiIiil;
   private final HashMap<UUID, liIIliiliiIIliil> lIiIiiIiil = new HashMap();
   private final iliillIiiill IIiIiiIiil = new iliillIiiill();
   private final iiIiiilIIliiil iIlIiiIiil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final int IIlIiiIiil = 128;
   private class_634 IliIiiIiil;
   private static String[] iilIiiIiil;
   private static final String lIlIiiIiil = "donutsmp";
   private static final Map<String, UUID> lllIiiIiil = new LinkedHashMap();
   private boolean IiiIiiIiil;
   private static final long iiIIiiIiil = 250000000L;
   public static final String[] liIIiiIiil = new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()};
   private static boolean IilIiiIiil;
   private static String illIiiIiil;
   private static lllIIIIiillIIIIi lilIiiIiil;
   private final iiIiiilIIliiil IllIiiIiil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);

   public int IIllllIlll() {
      return this.IIiIiiIiil.IlIlllIlilIl();
   }

   public static boolean iiiIlIIIll(UUID name, String id) {
      lllIIIIiillIIIIi var2 = lilIiiIiil;
      if (var2 != null) {
         if (!var2.IliIlllilIi()) {
            long var3 = System.nanoTime();
            if (var2.lliIiiIiil == 0L || var3 - var2.lliIiiIiil >= 250000000L) {
               var2.lliIiiIiil = var3;
               var2.Iillllilll();
            }
         }

         List var8 = var2.IIiIiiIiil.iliIiiliiiii();
         if (!var8.isEmpty()) {
            for(int var11 = 0; var11 < var8.size(); ++var11) {
               liliIIIliiliIIIl var12 = (liliIIIliiliIIIl)var8.get(var11);
               if (name != null && name.equals(var12.ilIIllllIl) || id != null && id.equalsIgnoreCase(var12.llIIllllIl)) {
                  return true;
               }
            }

            return false;
         }
      }

      if (id != null && !id.isEmpty()) {
         String[] var9 = iilIiiIiil;
         if (var9 == null) {
            var9 = new String[liIIiiIiil.length];

            for(int var4 = 0; var4 < liIIiiIiil.length; ++var4) {
               var9[var4] = liIIiiIiil[var4].trim();
            }

            iilIiiIiil = var9;
         }

         for(String var7 : var9) {
            if (!var7.isEmpty() && var7.equalsIgnoreCase(id)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   protected void Illillliilli() {
      this.lliIiiIiil = 0L;
      this.Iillllilll();
   }

   public static boolean iIlllIllll() {
      try {
         class_642 var0 = class_310.method_1551().method_1558();
         String var1 = var0 == null ? null : var0.field_3761;
         if (var1 == null) {
            return false;
         } else {
            if (var1 != illIiiIiil) {
               illIiiIiil = var1;
               IilIiiIiil = lllllillll(var1, IliIlllilIi<invokedynamic>());
            }

            return IilIiiIiil;
         }
      } catch (Throwable var2) {
         return false;
      }
   }

   public boolean lIIlliIIll() {
      return this.iIlIiiIiil.Iilllilliill();
   }

   private void Iillllilll() {
      if (!this.IiiIiiIiil) {
         try {
            this.lIilliIill();
         } catch (Throwable var2) {
            this.IiiIiiIiil = true;
            this.iilllIIill();
         }

      }
   }

   protected void Iilililiiili() {
      this.iilllIIill();
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)(~((char)(~((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5))))))) - 24011) ^ var5))) - 24384) + var5) ^ 28428)) + var5) + '낏') << 15 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)(~((char)(~((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5))))))) - 24011) ^ var5))) - 24384) + var5) ^ 28428)) + var5) + '낏') >>> 1))) + 32083));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -705648810287134714L ^ Long.rotateLeft(574622674575178202L, 17) ^ -8376128498208958455L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 2603112426474946818L ^ Long.rotateLeft(-2531475357905006001L, 50) ^ -2709608702481529895L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -5928672169523501633L ^ Long.rotateLeft(-4033342680176608968L, 15) ^ -1003011073586558671L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5183469724069077247L ^ Long.rotateLeft(6351548112422144325L, 22) ^ 7542045818452581710L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3884380384638185647L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2505977544737114152L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -5520822382802137743L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5804397468515984381L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 2853143847032593218L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -3770326121592796462L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(liiiIIllIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iIlIlllllill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IilliliilIIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, lIiiIiIlilli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iliIiiliiiii<invokedynamic>());
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

   private void iilllIIill() {
      this.lIiIiiIiil.clear();
      this.IliIiiIiil = null;
      this.IIiIiiIiil.IilliliilIIi();
   }

   public List<liliIIIliiliIIIl> ilIllIiIll() {
      return this.IIiIiiIiil.iliIiiliiiii();
   }

   public lllIIIIiillIIIIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iIlIiiIiil, this.IllIiiIiil});
      lilIiiIiil = this;
   }

   public static void liilliiill(String arg) {
      class_634 var1 = class_310.method_1551().method_1562();
      if (var1 != null) {
         String var2 = arg == null ? "" : arg.trim();

         try {
            Field var3 = class_634.class.getDeclaredField(IliIlllilIi<invokedynamic>());
            Field var4 = class_634.class.getDeclaredField(IliIlllilIi<invokedynamic>());
            var3.setAccessible(true);
            var4.setAccessible(true);
            Map var5 = (Map)var3.get(var1);
            Set var6 = (Set)var4.get(var1);
            if (!var2.isEmpty() && !var2.equalsIgnoreCase(IliIlllilIi<invokedynamic>())) {
               if (var2.startsWith(IliIlllilIi<invokedynamic>())) {
                  UUID var14 = (UUID)lllIiiIiil.remove(var2.substring(1).trim());
                  if (var14 != null) {
                     var6.remove(var5.remove(var14));
                  }
               } else {
                  int var15 = var2.indexOf(32);
                  String var16 = var15 < 0 ? var2 : var2.substring(0, var15);
                  String var9 = var15 < 0 ? var16 : var2.substring(var15 + 1).trim();
                  UUID var10 = UUID.nameUUIDFromBytes((IliIlllilIi<invokedynamic>() + var16).getBytes(StandardCharsets.UTF_8));
                  class_640 var11 = (class_640)var5.get(var10);
                  if (var11 == null) {
                     var11 = new class_640(new GameProfile(var10, var16), false);
                     var5.put(var10, var11);
                     var6.add(var11);
                  }

                  var11.method_2962((class_2561)(!var9.startsWith(IliIlllilIi<invokedynamic>()) && !var9.startsWith(IliIlllilIi<invokedynamic>()) ? class_2561.method_43470(var9.replace('&', '§')) : (class_2561)class_8824.field_46597.parse(JsonOps.INSTANCE, JsonParser.parseString(var9)).getOrThrow()));
                  lllIiiIiil.put(var16, var10);
               }
            } else {
               for(UUID var8 : lllIiiIiil.values()) {
                  var6.remove(var5.remove(var8));
               }

               lllIiiIiil.clear();
            }
         } catch (Throwable var12) {
         }

         lllIIIIiillIIIIi var13 = (lllIIIIiillIIIIi)llilIllililIll.iliIiiliiiii(lllIIIIiillIIIIi.class);
         if (var13 != null && var13.IliIlllilIi()) {
            var13.lliIiiIiil = 0L;
            var13.Iillllilll();
         }

      }
   }

   protected void iIIIlIlIIl() {
      long var1 = System.nanoTime();
      if (this.lliIiiIiil == 0L || var1 - this.lliIiiIiil >= 250000000L) {
         this.lliIiiIiil = var1;
         this.Iillllilll();
      }
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(~var4[var5]) + var5))) ^ '邱') - '\ue882') - var5) - 5964))) ^ var5))) << 15 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(~var4[var5]) + var5))) ^ '邱') - '\ue882') - var5) - 5964))) ^ var5))) >>> 1) >>> 14 | (char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(~var4[var5]) + var5))) ^ '邱') - '\ue882') - var5) - 5964))) ^ var5))) << 15 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(~var4[var5]) + var5))) ^ '邱') - '\ue882') - var5) - 5964))) ^ var5))) >>> 1) << 2) >>> 1 | (char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(~var4[var5]) + var5))) ^ '邱') - '\ue882') - var5) - 5964))) ^ var5))) << 15 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(~var4[var5]) + var5))) ^ '邱') - '\ue882') - var5) - 5964))) ^ var5))) >>> 1) >>> 14 | (char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(~var4[var5]) + var5))) ^ '邱') - '\ue882') - var5) - 5964))) ^ var5))) << 15 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(~var4[var5]) + var5))) ^ '邱') - '\ue882') - var5) - 5964))) ^ var5))) >>> 1) << 2) << 15))) + 24127));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(-((char)((char)((char)(var4[var5] ^ 10832) ^ '认') + 'ꏞ'))))))) ^ var5) ^ var5) ^ 6409) - '郎') ^ var5) ^ var5) - 18318))) ^ '꼌') - var5) << 9 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(-((char)((char)((char)(var4[var5] ^ 10832) ^ '认') + 'ꏞ'))))))) ^ var5) ^ var5) ^ 6409) - '郎') ^ var5) ^ var5) - 18318))) ^ '꼌') - var5) >>> 7) ^ '觋') + 4185));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IlIllllIll() {
      return this.IllIiiIiil.Iilllilliill();
   }

   private void lIilliIill() {
      class_634 var1 = Iiiilllliiilll.method_1562();
      if (var1 != null && Iiiilllliiilll.field_1687 != null && (!this.iIlIiiIiil.Iilllilliill() || iIlllIllll())) {
         if (var1 != this.IliIiiIiil) {
            this.lIiIiiIiil.clear();
            this.IliIiiIiil = var1;
         }

         int var2 = ++this.iliIiiIiil;
         int var3 = 128;
         int var4 = 0;
         this.IIiIiiIiil.IliIlllilIi();

         for(class_640 var6 : var1.method_45732()) {
            GameProfile var7 = var6.method_2966();
            if (var7 != null && var7.id() != null) {
               UUID var8 = var7.id();
               liIIliiliiIIliil var9 = (liIIliiliiIIliil)this.lIiIiiIiil.get(var8);
               if (var9 == null) {
                  var9 = new liIIliiliiIIliil();
                  this.lIiIiiIiil.put(var8, var9);
               }

               if (var9.liIilIilil != var2) {
                  ++var4;
               }

               var9.liIilIilil = var2;
               if (!var9.IliIlllilIi(var6, var7) && var3 > 0) {
                  --var3;
                  var9.liiiIIllIl(var6, var7);
                  var9.IiIilIilil = this.Ilillllill(var6, var7);
               }

               IliIilllliIill var10 = var9.IiIilIilil;
               if (var10 != null) {
                  this.IIiIiiIiil.liiiIIllIl(var10.IliIlllilIi(), var8, var10.liiiIIllIl(), var10.iIlIlllllill());
               }
            }
         }

         if (var4 != this.lIiIiiIiil.size()) {
            this.lIiIiiIiil.values().removeIf((p) -> p.liIilIilil != var2);
         }

         this.IIiIiiIiil.iIlIlllllill();
      } else {
         this.iilllIIill();
      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - 6000))) << 3 | (char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - 6000))) >>> 13) + var5))) - '\uf5e1') + var5))) + var5) - var5) - '列') >>> 9 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - 6000))) << 3 | (char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - 6000))) >>> 13) + var5))) - '\uf5e1') + var5))) + var5) - var5) - '列') << 7) + var5) + 'ꗁ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 12 | (char)(var4[var5] ^ var5) << 4) + 3908) << 8 | (char)((char)((char)(var4[var5] ^ var5) >>> 12 | (char)(var4[var5] ^ var5) << 4) + 3908) >>> 8) << 7 | (char)((char)((char)((char)(var4[var5] ^ var5) >>> 12 | (char)(var4[var5] ^ var5) << 4) + 3908) << 8 | (char)((char)((char)(var4[var5] ^ var5) >>> 12 | (char)(var4[var5] ^ var5) << 4) + 3908) >>> 8) >>> 9) + var5) ^ '閱') + var5) - var5))) << 11 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 12 | (char)(var4[var5] ^ var5) << 4) + 3908) << 8 | (char)((char)((char)(var4[var5] ^ var5) >>> 12 | (char)(var4[var5] ^ var5) << 4) + 3908) >>> 8) << 7 | (char)((char)((char)((char)(var4[var5] ^ var5) >>> 12 | (char)(var4[var5] ^ var5) << 4) + 3908) << 8 | (char)((char)((char)(var4[var5] ^ var5) >>> 12 | (char)(var4[var5] ^ var5) << 4) + 3908) >>> 8) >>> 9) + var5) ^ '閱') + var5) - var5))) >>> 5) + '\ue5ad') - var5))) - var5) >>> 1 | (char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 12 | (char)(var4[var5] ^ var5) << 4) + 3908) << 8 | (char)((char)((char)(var4[var5] ^ var5) >>> 12 | (char)(var4[var5] ^ var5) << 4) + 3908) >>> 8) << 7 | (char)((char)((char)((char)(var4[var5] ^ var5) >>> 12 | (char)(var4[var5] ^ var5) << 4) + 3908) << 8 | (char)((char)((char)(var4[var5] ^ var5) >>> 12 | (char)(var4[var5] ^ var5) << 4) + 3908) >>> 8) >>> 9) + var5) ^ '閱') + var5) - var5))) << 11 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 12 | (char)(var4[var5] ^ var5) << 4) + 3908) << 8 | (char)((char)((char)(var4[var5] ^ var5) >>> 12 | (char)(var4[var5] ^ var5) << 4) + 3908) >>> 8) << 7 | (char)((char)((char)((char)(var4[var5] ^ var5) >>> 12 | (char)(var4[var5] ^ var5) << 4) + 3908) << 8 | (char)((char)((char)(var4[var5] ^ var5) >>> 12 | (char)(var4[var5] ^ var5) << 4) + 3908) >>> 8) >>> 9) + var5) ^ '閱') + var5) - var5))) >>> 5) + '\ue5ad') - var5))) - var5) << 15) - '첪') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static boolean lllllillll(String part, String s) {
      int var2 = s.length();

      for(int var3 = 0; var3 + var2 <= part.length(); ++var3) {
         if (part.regionMatches(true, var3, s, 0, var2)) {
            return true;
         }
      }

      return false;
   }

   public List<String> liIlliiIll() {
      return this.IIiIiiIiil.IIIllIIliIIl();
   }

   private IliIilllliIill ilillIiill(class_2561 shown, String name) {
      this.iIiIiiIiil.IliIlllilIi();
      shown.method_30937().accept(this.iIiIiiIiil);
      this.iIiIiiIiil.liiiIIllIl();
      return IiIIIIIlliIIIIIl.iIlIlllllill(this.iIiIiiIiil.iIlIllIIiIllIllIIi, name);
   }

   private IliIilllliIill Ilillllill(class_640 e, GameProfile prof) {
      String var3 = prof.name();
      class_268 var4 = e.method_2955();
      class_2561 var5 = e.method_2971();
      Object var6 = var5 != null ? var5 : class_268.method_1142(var4, class_2561.method_43470(var3 == null ? "" : var3));
      return IiIIIIIlliIIIIIl.liiiIIllIl(this.ilillIiill((class_2561)var6, var3), IiIIIIIlliIIIIIl.IliIlllilIi(var4 == null ? null : var4.method_1197(), var3), var3);
   }
}
