package gg.corz;

import com.corz.client.mixins.AccessorClientPlayNetworkHandler;
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
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2535;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_2680;
import net.minecraft.class_332;
import net.minecraft.class_5894;
import net.minecraft.class_634;
import net.minecraft.class_642;
import net.minecraft.class_7439;

public final class llIIlIIiilIIlIIi extends ilIllIiIll {
   private Object liIlllliil;
   private int lliIllliil;
   private final liiIilIliiiIilIl lllIllliil;
   private lliIIIliliIIIl IIiIllliil;
   private final iIilliilIlilliil iiIlllliil;
   private Object IiIlllliil;
   private final iiIiiilIIliiil IIlIllliil;
   private final IlIiiIillIiiIi illIllliil;
   private final illlIlIlIillIlIl lIlIllliil;
   private int IlIlllliil;
   private String lIiIllliil;
   private final lliliIIiililiIIi iiIIllliil;
   static final int iIiiIlliil = 24;
   private int llIlllliil;
   private final llliliIlilliliIl IllIllliil;
   private final iiIiiilIIliiil ilIIllliil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final ilIlllilIiIlllil IilIllliil;
   private volatile List<iiliIiiIIiiIii> iIiIllliil;
   static final int liliIlliil = 16;
   private final iiIiiilIIliiil llIIllliil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private String iiiIllliil;
   private final iiIiiilIIliiil IlIIllliil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private boolean iliIllliil;
   private long liiIllliil;
   private liIIiilliiIIiill iIIlllliil;
   private final iilliIlIIiliIl lIIIllliil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 6, 1, 8);
   private int IliIllliil;
   static final long lliiIlliil = 30000L;
   private String IIIlllliil;
   private final lliliIIiililiIIi iIIIllliil = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   public static volatile llIIlIIiilIIlIIi IiliIlliil;
   private final ililliIiIiilliIi iIlIllliil;
   static final String IIIIllliil = "§7[§cBloodhound§7]§r ";
   static final String liiiIlliil = "Sniffing for bases";
   static final int IIiiIlliil = 96;
   static final long IliiIlliil = 1500L;
   private final IIIiiiillIIiiiil lilIllliil;
   static final String iiiiIlliil = "bases4";
   static final int lIiiIlliil = 40;
   static final int iliiIlliil = 40;
   static final int iiliIlliil = 8;
   private final Map<String, lliIIIliliIIIl> iilIllliil;
   static final int IiiiIlliil = 55;
   private final lliliIIiililiIIi IiIIllliil = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private long ilIlllliil;
   private final lliliIIiililiIIi liIIllliil = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private String lIIlllliil;
   private boolean IiiIllliil;

   private void liilliiill(long now) {
      if (this.IiIIllliil.Ililllililil() != 2) {
         int var12 = this.ilIllIiIll();
         boolean var13 = false;

         for(iiliIiiIIiiIii var6 : this.IIiIllliil.IIiilIiiiIii(Iiiilllliiilll.field_1724.method_23317(), Iiiilllliiilll.field_1724.method_23321(), var12, 320)) {
            if (var6.lIiiIiIlilli() >= var12 && !var6.Illlllllilll() && var6.Ililllililil(now, 1500L)) {
               var6.Iilllilliill();
               if (!this.IIiIllliil.Illlllllilll(var6.IliIlllilIi(), var6.iIlIlllllill())) {
                  this.IIiIllliil.IIlllIlliIll((int)Math.round(var6.IliIlllilIi()), (int)Math.round(var6.iIlIlllllill()));
                  iiiIIIlIIIlIIl.liiiIIllIl();
                  double var7 = var6.IliIlllilIi() - Iiiilllliiilll.field_1724.method_23317();
                  double var9 = var6.iIlIlllllill() - Iiiilllliiilll.field_1724.method_23321();
                  String var11 = var6.IiIlliIliiIl().isEmpty() ? "" : IliIlllilIi<invokedynamic>() + String.join(IliIlllilIi<invokedynamic>(), var6.IiIlliIliiIl());
                  this.IIIillIIil(IliIlllilIi<invokedynamic>() + var6.IilliliilIIi() + IliIlllilIi<invokedynamic>() + lilIIiiliilIIiil.IliIlllilIi(Math.sqrt(var7 * var7 + var9 * var9)) + IliIlllilIi<invokedynamic>() + lilIIiiliilIIiil.liiiIIllIl(var7, var9) + IliIlllilIi<invokedynamic>() + lilIIiiliilIIiil.iIlIlllllill(var6.IliIlllilIi(), var6.liiiIIllIl(), var6.iIlIlllllill()) + IliIlllilIi<invokedynamic>() + var11);
                  if (this.IiIIllliil.Ililllililil() == 0 && !var13) {
                     IilIlllilIll.IliIlllilIi();
                     var13 = true;
                  }
               }
            }
         }

      } else {
         for(iiliIiiIIiiIii var4 : this.IIiIllliil.IIiilIiiiIii(Iiiilllliiilll.field_1724.method_23317(), Iiiilllliiilll.field_1724.method_23321(), this.ilIllIiIll(), 320)) {
            var4.Iilllilliill();
         }

      }
   }

   public List<iiliIiiIIiiIii> liIlliiIll() {
      return this.iIiIllliil;
   }

   protected void Illillliilli() {
      this.IllIllliil.IliIlllilIi();
      this.illIllliil.IliIlllilIi();
      this.lilIllliil.IliIlllilIi();
      this.IliIllliil = 0;
      this.lIiIllliil = null;
      this.lliIllliil = 0;
      this.iliIllliil = Iiiilllliiilll != null && Iiiilllliiilll.field_1687 != null;
      this.IiIlllliil = null;
      this.lllIllliil.IliIlllilIi();
      this.iiiIllliil = IliIlllilIi<invokedynamic>();
      this.IIIlllliil = "";
      this.lIIlllliil = null;
      this.iIIlllliil = liIIiilliiIIiill.iiIIiliill;
      this.IlIlllliil = 0;
      this.llIlllliil = 0;
      this.ilIlllliil = 6466885317758167369L ^ -2756486719096608439L;
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) << 5 | (char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) >>> 11) - '\uea65') << 4 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) << 5 | (char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) >>> 11) - '\uea65') >>> 12) - var5) >>> 10 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) << 5 | (char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) >>> 11) - '\uea65') << 4 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) << 5 | (char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) >>> 11) - '\uea65') >>> 12) - var5) << 6) - 20404) ^ var5) + '앓') ^ 21471) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) << 5 | (char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) >>> 11) - '\uea65') << 4 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) << 5 | (char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) >>> 11) - '\uea65') >>> 12) - var5) >>> 10 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) << 5 | (char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) >>> 11) - '\uea65') << 4 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) << 5 | (char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) >>> 11) - '\uea65') >>> 12) - var5) << 6) - 20404) ^ var5) + '앓') ^ 21471) << 10) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) << 5 | (char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) >>> 11) - '\uea65') << 4 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) << 5 | (char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) >>> 11) - '\uea65') >>> 12) - var5) >>> 10 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) << 5 | (char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) >>> 11) - '\uea65') << 4 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) << 5 | (char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) >>> 11) - '\uea65') >>> 12) - var5) << 6) - 20404) ^ var5) + '앓') ^ 21471) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) << 5 | (char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) >>> 11) - '\uea65') << 4 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) << 5 | (char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) >>> 11) - '\uea65') >>> 12) - var5) >>> 10 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) << 5 | (char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) >>> 11) - '\uea65') << 4 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) << 5 | (char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) << 1 | (char)((char)(~((char)(var4[var5] - var5))) + var5) >>> 15))) + 13457) >>> 11) - '\uea65') >>> 12) - var5) << 6) - 20404) ^ var5) + '앓') ^ 21471) << 10) << 5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int ilIllIiIll() {
      return ~(925089666 ^ 113) ^ -925089733;
   }

   public void iIIilIlIil(class_332 ctx) {
      if (ctx != null && Iiiilllliiilll.field_1724 != null && !Iiiilllliiilll.field_1690.field_1842 && this.ilIIllliil.Iilllilliill()) {
         this.lilIllliil.liiiIIllIl(ctx, this.iIIlllliil, this.iiiIllliil, this.IlIlllliil, this.llIlllliil, this.IllIllliil.iIlIlllllill(), (String)null);
      }
   }

   private void iilllIIill(long now) {
      long var4 = 19166187979959672L;
      var4 ^= ((long)this.liIIllliil.Ililllililil() << 32 ^ var4) & -1L << 32;
      if ((int)(var4 >>> 32) != this.lliIllliil) {
         this.lliIllliil = (int)(var4 >>> 32);
         if ((int)(var4 >>> 32) == 0) {
            this.iiIlllliil.iliIiiliiiii(IliIlllilIi<invokedynamic>());
         } else {
            this.iiIlllliil.lIiiIiIlilli(IIIIiIIllIIIiIIl.values()[(int)(var4 >>> 32)], Iiiilllliiilll, this.lIilliIill(), now);
         }
      }

      this.iiIlllliil.IIlllIlliIll(Iiiilllliiilll, now);
      if (this.lliIllliil != 0 && this.iiIlllliil.IliIlllilIi() == IIIIiIIllIIIiIIl.iiIlIIilIl) {
         this.lliIllliil = 0;
         this.liIIllliil.IIillIiliIil(IliIlllilIi<invokedynamic>());
      }

   }

   protected void Iilililiiili() {
      this.iiIlllliil.iliIiiliiiii(this.iiIlllliil.IliIlllilIi() == IIIIiIIllIIIiIIl.iiIlIIilIl ? null : IliIlllilIi<invokedynamic>());
      this.lliIllliil = 0;
      if (this.liIIllliil.Ililllililil() != 0) {
         this.liIIllliil.IIillIiliIil(IliIlllilIi<invokedynamic>());
      }

      this.illIllliil.IliIlllilIi();
      this.iIiIllliil = List.of();
      if (this.IiiIllliil) {
         this.IiiIllliil = false;
         iiiIIIlIIIlIIl.liiiIIllIl();
      }

   }

   public int lIIlliIIll() {
      return (1658718566 >>> 27 | 1658718566 << 5) - 69 ^ 1539386543;
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) >>> 8 | (char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) << 8) >>> 7 | (char)((char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) >>> 8 | (char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) << 8) << 9) + 4490) ^ '闳'))) << 8 | (char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) >>> 8 | (char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) << 8) >>> 7 | (char)((char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) >>> 8 | (char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) << 8) << 9) + 4490) ^ '闳'))) >>> 8) ^ var5) ^ var5) << 13 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) >>> 8 | (char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) << 8) >>> 7 | (char)((char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) >>> 8 | (char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) << 8) << 9) + 4490) ^ '闳'))) << 8 | (char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) >>> 8 | (char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) << 8) >>> 7 | (char)((char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) >>> 8 | (char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) << 8) << 9) + 4490) ^ '闳'))) >>> 8) ^ var5) ^ var5) >>> 3) + '윱') - 13650))) - var5) >>> 4 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) >>> 8 | (char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) << 8) >>> 7 | (char)((char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) >>> 8 | (char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) << 8) << 9) + 4490) ^ '闳'))) << 8 | (char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) >>> 8 | (char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) << 8) >>> 7 | (char)((char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) >>> 8 | (char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) << 8) << 9) + 4490) ^ '闳'))) >>> 8) ^ var5) ^ var5) << 13 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) >>> 8 | (char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) << 8) >>> 7 | (char)((char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) >>> 8 | (char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) << 8) << 9) + 4490) ^ '闳'))) << 8 | (char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) >>> 8 | (char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) << 8) >>> 7 | (char)((char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) >>> 8 | (char)((char)((char)(var4[var5] ^ '鉨') + var5) + var5) << 8) << 9) + 4490) ^ '闳'))) >>> 8) ^ var5) ^ var5) >>> 3) + '윱') - 13650))) - var5) << 12));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iIlllIllll() {
      this.IIiIllliil.IilliliilIIi();
      iiiIIIlIIIlIIl.liiiIIllIl();
      this.IllIllliil.IliIlllilIi();
      this.iIiIllliil = List.of();
      this.IIIillIIil(IliIlllilIi<invokedynamic>());
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 11772) ^ '흨') ^ '葀') - 3321) + var5) + var5) >>> 3 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 11772) ^ '흨') ^ '葀') - 3321) + var5) + var5) << 13) << 4 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 11772) ^ '흨') ^ '葀') - 3321) + var5) + var5) >>> 3 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 11772) ^ '흨') ^ '葀') - 3321) + var5) + var5) << 13) >>> 12) ^ 22543) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 11772) ^ '흨') ^ '葀') - 3321) + var5) + var5) >>> 3 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 11772) ^ '흨') ^ '葀') - 3321) + var5) + var5) << 13) << 4 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 11772) ^ '흨') ^ '葀') - 3321) + var5) + var5) >>> 3 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 11772) ^ '흨') ^ '葀') - 3321) + var5) + var5) << 13) >>> 12) ^ 22543) << 2) - var5) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void lllllillll(long now) {
      for(iiliIiiIIiiIii var4 : this.IIiIllliil.iIlIlllllill()) {
         if (var4.IIillIiliIil(40)) {
            this.IiiIllliil = true;
         }
      }

      if (this.IiiIllliil && now - this.liiIllliil >= 30000L) {
         this.IiiIllliil = false;
         this.liiIllliil = now;
         iiiIIIlIIIlIIl.liiiIIllIl();
      }
   }

   public static void iiiIlIIIll(class_2338 newState, class_2680 oldState, class_2680 pos) {
      llIIlIIiilIIlIIi var3 = IiliIlliil;
      if (var3 != null && var3.IliIlllilIi()) {
         var3.IllIllliil.lIiiIiIlilli(newState, oldState, pos);
      }

   }

   protected void IiIIlliIIl(IliIliIllliIliIl event) {
      this.illIllliil.liiiIIllIl(event.iilIIiiIll);
      class_2596 var4 = event.iilIIiiIll;
      if (var4 instanceof class_7439 var2) {
         if (var2.comp_763() != null) {
            this.iiIlllliil.IilliliilIIi(var2.comp_763().getString());
            return;
         }
      }

      var4 = event.iilIIiiIll;
      if (var4 instanceof class_5894 var3) {
         if (var3.comp_2279() != null) {
            this.iiIlllliil.IilliliilIIi(var3.comp_2279().getString());
         }
      }

   }

   protected void lilIliilIl(IiiIlllliiIlll e) {
      if (e.liiiIIllIl() == ((-(~1235203442) << 1 | -(~1235203442) >>> 31) ^ -1824560409) && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1755 == null) {
         if (this.lIlIllliil.IiIiliIiiiIi(e.IliIlllilIi())) {
            List var2 = this.iIiIllliil;
            if (var2.isEmpty()) {
               this.IIIillIIil(IliIlllilIi<invokedynamic>());
            } else {
               if (this.iiIlllliil.IliIlllilIi() != IIIIiIIllIIIiIIl.iiIlIIilIl) {
                  this.iiIlllliil.iliIiiliiiii((String)null);
                  this.lliIllliil = 0;
                  this.liIIllliil.IIillIiliIil(IliIlllilIi<invokedynamic>());
                  this.IIIillIIil(IliIlllilIi<invokedynamic>());
               }

               iiliIiiIIiiIii var3 = (iiliIiiIIiiIii)var2.get(0);
               if (iIilliilIlilliil.IIiilIiiiIii(Iiiilllliiilll, var3.IliIlllilIi(), var3.iIlIlllllill())) {
                  this.IIIillIIil(IliIlllilIi<invokedynamic>() + var3.IilliliilIIi() + IliIlllilIi<invokedynamic>() + lilIIiiliilIIiil.iIlIlllllill(var3.IliIlllilIi(), var3.liiiIIllIl(), var3.iIlIlllllill()) + IliIlllilIi<invokedynamic>());
               } else {
                  this.IIIillIIil(IliIlllilIi<invokedynamic>());
               }

            }
         }
      }
   }

   private String ilillIiill() {
      try {
         if (Iiiilllliiilll.method_1576() != null) {
            return IliIlllilIi<invokedynamic>() + Iiiilllliiilll.method_1576().method_27728().method_150();
         }
      } catch (Throwable var2) {
      }

      return IliIlllilIi<invokedynamic>();
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) << 12 | (char)((char)(var4[var5] + var5) ^ var5) >>> 4) - '臛') - '\uf7c2') - var5) - 8645) - var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) << 12 | (char)((char)(var4[var5] + var5) ^ var5) >>> 4) - '臛') - '\uf7c2') - var5) - 8645) - var5) << 12))) << 14 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) << 12 | (char)((char)(var4[var5] + var5) ^ var5) >>> 4) - '臛') - '\uf7c2') - var5) - 8645) - var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) << 12 | (char)((char)(var4[var5] + var5) ^ var5) >>> 4) - '臛') - '\uf7c2') - var5) - 8645) - var5) << 12))) >>> 2) >>> 12 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) << 12 | (char)((char)(var4[var5] + var5) ^ var5) >>> 4) - '臛') - '\uf7c2') - var5) - 8645) - var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) << 12 | (char)((char)(var4[var5] + var5) ^ var5) >>> 4) - '臛') - '\uf7c2') - var5) - 8645) - var5) << 12))) << 14 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) << 12 | (char)((char)(var4[var5] + var5) ^ var5) >>> 4) - '臛') - '\uf7c2') - var5) - 8645) - var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) << 12 | (char)((char)(var4[var5] + var5) ^ var5) >>> 4) - '臛') - '\uf7c2') - var5) - 8645) - var5) << 12))) >>> 2) << 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iIiIlIliIl(JsonElement element) {
      if (element != null && element.isJsonObject()) {
         JsonObject var2 = element.getAsJsonObject();
         if (var2.has(IliIlllilIi<invokedynamic>()) && var2.get(IliIlllilIi<invokedynamic>()).isJsonObject()) {
            long var3 = System.currentTimeMillis();
            ArrayList var5 = new ArrayList();

            for(Map.Entry var7 : var2.getAsJsonObject(IliIlllilIi<invokedynamic>()).entrySet()) {
               if (((JsonElement)var7.getValue()).isJsonArray()) {
                  var5.add(var7);
                  if (var5.size() >= 24) {
                     break;
                  }
               }
            }

            Collections.reverse(var5);

            for(Map.Entry var16 : var5) {
               lliIIIliliIIIl var8 = (lliIIIliliIIIl)this.iilIllliil.computeIfAbsent((String)var16.getKey(), (k) -> new lliIIIliliIIIl());
               int var9 = 0;

               for(JsonElement var11 : ((JsonElement)var16.getValue()).getAsJsonArray()) {
                  if (var9++ >= 96) {
                     break;
                  }

                  try {
                     JsonArray var12 = var11.getAsJsonArray();
                     String var13 = var12.size() > 4 ? var12.get(4).getAsString() : "";
                     var8.IiIlliIliiIl(var12.get(0).getAsInt(), var12.get(1).getAsInt(), var12.get(2).getAsInt(), var12.get(3).getAsInt(), var13.isBlank() ? List.of() : List.of(var13.split(Pattern.quote(IliIlllilIi<invokedynamic>()))), var12.size() > 5 ? var12.get(5).getAsLong() : var3, var3);
                  } catch (Throwable var14) {
                  }
               }

               var8.Ililllililil(var3, (double)0.0F, (double)0.0F);
            }

         }
      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(-((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) + var5) + var5) + '컝') << 4 | (char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) + var5) + var5) + '컝') >>> 12) - '蘬'))))))))) << 7 | (char)(~((char)(-((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) + var5) + var5) + '컝') << 4 | (char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) + var5) + var5) + '컝') >>> 12) - '蘬'))))))))) >>> 9) ^ '逶') << 2 | (char)((char)((char)(~((char)(-((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) + var5) + var5) + '컝') << 4 | (char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) + var5) + var5) + '컝') >>> 12) - '蘬'))))))))) << 7 | (char)(~((char)(-((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) + var5) + var5) + '컝') << 4 | (char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) + var5) + var5) + '컝') >>> 12) - '蘬'))))))))) >>> 9) ^ '逶') >>> 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public JsonElement IIiIllIiIl() {
      JsonObject var1 = new JsonObject();
      int var2 = 0;
      ArrayList var3 = new ArrayList(this.iilIllliil.entrySet());
      Collections.reverse(var3);
      var3.sort((a, b) -> Boolean.compare(!((String)a.getKey()).equals(this.lIiIllliil), !((String)b.getKey()).equals(this.lIiIllliil)));

      for(Map.Entry var5 : var3) {
         JsonArray var6 = new JsonArray();

         for(iiliIiiIIiiIii var8 : ((lliIIIliliIIIl)var5.getValue()).Iilllilliill(40, 96)) {
            int var9 = Math.min(var8.IilliliilIIi(), Math.max(var8.iliIiiliiiii(), var8.IlIlllIlilIl(lIiiIlliIiiIll.liIIllliliiIIlllil)));
            if (var9 >= 40) {
               JsonArray var10 = new JsonArray();
               var10.add((int)Math.round(var8.IliIlllilIi()));
               var10.add((int)Math.round(var8.liiiIIllIl()));
               var10.add((int)Math.round(var8.iIlIlllllill()));
               var10.add(var9);
               var10.add(String.join(IliIlllilIi<invokedynamic>(), var8.IIlllIlliIll()));
               var10.add(var8.Iiilliiliiil());
               var6.add(var10);
            }
         }

         if (!var6.isEmpty()) {
            ++var2;
            if (var2 > 24) {
               break;
            }

            var1.add((String)var5.getKey(), var6);
         }
      }

      if (var1.isEmpty()) {
         return null;
      } else {
         JsonObject var11 = new JsonObject();
         var11.add(IliIlllilIi<invokedynamic>(), var1);
         return var11;
      }
   }

   public llIIlIIiilIIlIIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.iiIIllliil = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (String[])iiiIIIIlIIIlIIIl.iIiIliIlIl.toArray(new String[0]));
      this.IIlIllliil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
      this.lIlIllliil = new illlIlIlIillIlIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
      this.iIlIllliil = new ililliIiIiilliIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this::iIlllIllll);
      this.IllIllliil = new llliliIlilliliIl();
      this.lllIllliil = new liiIilIliiiIilIl();
      this.illIllliil = new IlIiiIillIiiIi();
      this.IilIllliil = new ilIlllilIiIlllil();
      this.lilIllliil = new IIIiiiillIIiiiil();
      this.iilIllliil = new LinkedHashMap(16, 0.75F, true);
      this.IIiIllliil = new lliIIIliliIIIl();
      this.iIiIllliil = List.of();
      this.iiiIllliil = IliIlllilIi<invokedynamic>();
      this.IIIlllliil = "";
      this.iIIlllliil = liIIiilliiIIiill.iiIIiliill;
      this.ilIlllliil = Long.MIN_VALUE;
      this.iiIlllliil = new iIilliilIlilliil(new liiilllliiiillll() {
         public boolean iIlIlllllill() {
            return llIIlIIiilIIlIIi.this.IIlIllliil.Iilllilliill();
         }

         public lliIIIliliIIIl IliIlllilIi() {
            return llIIlIIiilIIlIIi.this.IIiIllliil;
         }

         public void IIIllIIliIIl(String msg) {
            llIIlIIiilIIlIIi.this.IIIillIIil(msg);
         }

         public String IilliliilIIi() {
            return llIIlIIiilIIlIIi.this.iiIIllliil.Iilllilliill();
         }

         public boolean iliIiiliiiii(long ms) {
            return llIIlIIiilIIlIIi.this.IllIllliil.IilliliilIIi(ms);
         }

         public int liiiIIllIl() {
            return llIIlIIiilIIlIIi.this.ilIllIiIll();
         }

         public int lIiiIiIlilli() {
            return llIIlIIiilIIlIIi.this.IllIllliil.liiiIIllIl();
         }
      });
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lIIIllliil, this.iIIIllliil, this.IlIIllliil, this.llIIllliil, this.ilIIllliil, this.IiIIllliil, this.liIIllliil, this.iiIIllliil, this.IIlIllliil, this.lIlIllliil, this.iIlIllliil});
      IiliIlliil = this;
   }

   protected void IIiilIiiiIii(illlllIillll event) {
      if (this.IlIIllliil.Iilllilliill() || this.llIIllliil.Iilllilliill()) {
         this.IilIllliil.iIlIlllllill(this.iIiIllliil, this.IlIIllliil.Iilllilliill(), this.llIIllliil.Iilllilliill());
      }
   }

   boolean IlIllllIll() {
      return this.iIIIllliil.Ililllililil() == 0;
   }

   private int lIilliIill() {
      long var4 = 8725492531954528646L;
      var4 ^= ((long)Iiiilllliiilll.field_1690.method_38521() << 32 ^ var4) & -1L << 32;

      try {
         class_634 var3 = Iiiilllliiilll.method_1562();
         if (var3 instanceof AccessorClientPlayNetworkHandler var2) {
            if (var2.getChunkLoadDistance() > 0) {
               var4 ^= ((long)var2.getChunkLoadDistance() << 32 ^ var4) & -1L << 32;
            }
         }
      } catch (Throwable var6) {
      }

      return Math.max(2, Math.min(~(-2115209237 + -77) + -103 ^ 2115209194, (int)(var4 >>> 32)));
   }

   public lliIIIliliIIIl IIllllIlll() {
      return this.IIiIllliil;
   }

   private void IIIillIIil(String msg) {
      if (Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1724.method_7353(class_2561.method_43470(IliIlllilIi<invokedynamic>() + msg), false);
      }

   }

   protected void Iliilliiilii(lIiIlliiIiIlli event) {
      if (Iiiilllliiilll.field_1724 != null && !Iiiilllliiilll.field_1690.field_1842) {
         if (this.IlIIllliil.Iilllilliill()) {
            this.IilIllliil.IilliliilIIi(event.IIiIilIIIl, this.iIiIllliil);
         }

         if (Iiiilllliiilll.field_1755 == null) {
            this.iIIilIlIil(event.IIiIilIIIl);
         }

      }
   }

   private String Ilillllill() {
      class_642 var1 = Iiiilllliiilll.method_1558();
      String var2 = var1 != null ? var1.field_3761 : this.ilillIiill();
      return var2 + IliIlllilIi<invokedynamic>() + Iiiilllliiilll.field_1687.method_27983().method_29177();
   }

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         class_2535 var1 = Iiiilllliiilll.method_1562() == null ? null : Iiiilllliiilll.method_1562().method_48296();
         boolean var2 = this.IiIlllliil != null && var1 != this.IiIlllliil;
         this.IiIlllliil = var1;
         boolean var3 = this.liIlllliil != null && Iiiilllliiilll.field_1687 != this.liIlllliil;
         this.liIlllliil = Iiiilllliiilll.field_1687;
         String var4 = this.Ilillllill();
         if (var4.equals(this.lIiIllliil) && !var2) {
            if (var3) {
               this.IllIllliil.IliIlllilIi();
               this.illIllliil.IliIlllilIi();
               this.lllIllliil.IliIlllilIi();
            }
         } else {
            boolean var5 = this.lIiIllliil == null;
            this.lIiIllliil = var4;
            if (!var5 || !this.iliIllliil || var2) {
               this.iiIlllliil.iliIiiliiiii((String)null);
               this.lliIllliil = 0;
               if (this.liIIllliil.Ililllililil() != 0) {
                  this.liIIllliil.IIillIiliIil(IliIlllilIi<invokedynamic>());
               }
            }

            this.iliIllliil = false;
            this.IIiIllliil = (lliIIIliliIIIl)this.iilIllliil.computeIfAbsent(var4, (k) -> new lliIIIliliIIIl());
            this.IllIllliil.IliIlllilIi();
            this.illIllliil.IliIlllilIi();
            this.lllIllliil.IliIlllilIi();
            this.iIiIllliil = List.of();
         }

         long var9 = System.currentTimeMillis();
         int var7 = Iiiilllliiilll.field_1724.method_31477() >> 4;
         int var8 = Iiiilllliiilll.field_1724.method_31479() >> 4;
         this.IllIllliil.iliIiiliiiii(Iiiilllliiilll.field_1687, var7, var8, this.lIilliIill(), this.IIiIllliil, this.lIIIllliil.Iilllilliill(), this.IlIllllIll(), var9);
         this.illIllliil.IIIllIIliIIl(Iiiilllliiilll.field_1687, Iiiilllliiilll.field_1724, this.IIiIllliil, var9);
         ++this.IliIllliil;
         this.iilllIIill(var9);
         if (this.IliIllliil % 20 == 0) {
            this.lllIllliil.liiiIIllIl(Iiiilllliiilll.field_1687, Iiiilllliiilll.field_1724, this.IIiIllliil, Iiiilllliiilll.field_1687.method_27983() == class_1937.field_25181, this.IlIllllIll(), var9);
         }

         if (this.IliIllliil % 10 == 0) {
            this.IIiIllliil.Ililllililil(var9, Iiiilllliiilll.field_1724.method_23317(), Iiiilllliiilll.field_1724.method_23321());
            this.iIiIllliil = this.IIiIllliil.Iiiiliiiiiii(Iiiilllliiilll.field_1724.method_23317(), Iiiilllliiilll.field_1724.method_23321(), this.lIIlliIIll(), 8, Math.max((double)1024.0F, (double)this.lIilliIill() * (double)32.0F), 2, this.IlIllllIll() && Iiiilllliiilll.field_1687.method_27983() == class_1937.field_25179 ? 0 : Integer.MAX_VALUE);
            this.liilliiill(var9);
            this.lllllillll(var9);
         }

         if (this.ilIIllliil.Iilllilliill()) {
            this.Iillllilll();
         }

      }
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -4408617182963925875L ^ Long.rotateLeft(5061560270089883129L, 43) ^ -8224040099688710591L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -802828391538331477L ^ Long.rotateLeft(5064419859048404964L, 38) ^ -7172582521235630374L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3718605372387768450L ^ Long.rotateLeft(712738111224314957L, 21) ^ 2631554423513137661L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 8402221558053429131L ^ Long.rotateLeft(-40407477220814886L, 59) ^ 6415123182069801369L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -5308688845065838603L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 6313048818191317095L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2904970118786528974L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -6314896346782071230L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 7008087676725938578L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4772104934306639405L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, lIiiIiIlilli<invokedynamic>());
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

   private void Iillllilll() {
      List var1 = this.iIiIllliil;
      iiliIiiIIiiIii var2 = var1.isEmpty() ? null : (iiliIiiIIiiIii)var1.get(0);
      this.IlIlllliil = var1.size();
      this.llIlllliil = var2 == null ? 0 : var2.IilliliilIIi();
      double var3 = var2 == null ? (double)0.0F : var2.IliIlllilIi() - Iiiilllliiilll.field_1724.method_23317();
      double var5 = var2 == null ? (double)0.0F : var2.iIlIlllllill() - Iiiilllliiilll.field_1724.method_23321();
      double var7 = Math.sqrt(var3 * var3 + var5 * var5);
      boolean var9 = var2 != null && var2.lIiiIiIlilli() >= this.ilIllIiIll();
      String var10 = this.iiIlllliil.iIlIlllllill();
      if (!this.iiIlllliil.liiiIIllIl() || var10.isEmpty() || var9 && var7 <= (double)320.0F) {
         this.IIIlllliil = "";
         if (var2 == null) {
            this.iiiIllliil = IliIlllilIi<invokedynamic>();
            this.ilIlllliil = Long.MIN_VALUE;
            this.iIIlllliil = liIIiilliiIIiill.iiIIiliill;
         } else {
            String var11 = lilIIiiliilIIiil.liiiIIllIl(var3, var5);
            long var12 = (long)var2.IilliliilIIi() << 32 | (var7 < (double)1000.0F ? Math.round(var7) : 1000000L + Math.round(var7 / (double)100.0F));
            if (var12 != this.ilIlllliil || !var11.equals(this.lIIlllliil)) {
               this.ilIlllliil = var12;
               this.lIIlllliil = var11;
               this.iiiIllliil = IliIlllilIi<invokedynamic>() + var2.IilliliilIIi() + IliIlllilIi<invokedynamic>() + lilIIiiliilIIiil.IliIlllilIi(var7) + IliIlllilIi<invokedynamic>() + var11;
            }

            this.iIIlllliil = var9 ? liIIiilliiIIiill.IIlIiliill : liIIiilliiIIiill.lIlIiliill;
         }
      } else {
         if (!var10.equals(this.IIIlllliil)) {
            this.IIIlllliil = var10;
            this.iiiIllliil = IliIlllilIi<invokedynamic>() + var10;
         }

         this.ilIlllliil = Long.MIN_VALUE;
         this.iIIlllliil = liIIiilliiIIiill.IIlIiliill;
      }
   }
}
