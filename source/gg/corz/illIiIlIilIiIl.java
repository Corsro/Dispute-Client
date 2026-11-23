package gg.corz;

import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents;
import net.minecraft.class_1923;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_4588;
import net.minecraft.class_638;
import org.joml.Matrix4f;

public class illIiIlIilIiIl extends ilIllIiIll {
   private static final long IliIIIilllliIIIill = 260000000L;
   private ilIIlIIlIiIIlIIl[] lIIiIIilliIIiIIill = new ilIIlIIlIiIIlIIl[16];
   private final ArrayList<ilIIlIIlIiIIlIIl> IiliIIillliliIIill = new ArrayList();
   private final LongArrayList IIliIIilllIliIIill = new LongArrayList();
   private final iilliIlIIiliIl IlIIIIillllIIIIill = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 8, 5, 32);
   private static final long iilIIIillIIiIIIill = 300L;
   private final Long2ObjectOpenHashMap<ilIIlIIlIiIIlIIl> IIilIIilllIilIIill = new Long2ObjectOpenHashMap();
   private final liillIIiiiillIIi illlIIillIillIIill = new liillIIiiiillIIi();
   private long iiliIIillIIiiIIill;
   private int iiIIlIillIIlIlIill = -1;
   private int llIIlIillilIIlIill;
   private final iiIiiilIIliiil IIlIIIilllIlIIIill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final int IiIlIIillliIlIIill = 40;
   private final Long2ObjectOpenHashMap<LongArrayList> iIilIIillIlilIIill = new Long2ObjectOpenHashMap();
   private final iiIiiilIIliiil iIlIIIillIllIIIill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private static final float iliIIIillIiiIIIill = 1.5F;
   private boolean illIlIillIilIlIill;
   private class_638 IiIIlIillliIIlIill;
   private final ArrayList<ilIIlIIlIiIIlIIl> iIliIIillIlliIIill = new ArrayList();
   private final ArrayList<ilIIlIIlIiIIlIIl> iiilIIillIIIiIIill = new ArrayList();
   private final iilliIlIIiliIl lIIIIIilliIIIIIill = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 64, 16, 128);
   private int IlIiIIillllIiIIill;
   private static final int lllIIIillillIIIill = 450;
   private int iliiIIillIiiiIIill;
   private IiIiliIiliIiliIi lillIIilliillIIill = IiIiliIiliIiliIi.IliIlllilIi(8);
   private static illIiIlIilIiIl iiIlIIillIIllIIill;
   private static final float iIIlIIillIlIlIIill = 0.35F;
   private final lIlIIllliIlIIlll IlllIIillllllIIill = new lIlIIllliIlIIlll();
   private static final float IIIlIIilllIIlIIill = 0.075F;
   private final Long2LongOpenHashMap IiilIIillliilIIill = new Long2LongOpenHashMap();
   private final iiIiiilIIliiil ilIIIIillIiIIIIill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private long IliiIIilllliiIIill;
   private static final float llIlIIillilIlIIill = 12.0F;
   private static final float liiIIIilliiiIIIill = 0.9F;
   private static final long IilIIIilllilIIIill = 30000L;
   private boolean ilIiIIillIiIiIIill;
   private final iIIlIIIiIlIlIIIi lIllIIilliIllIIill = new iIIlIIIiIlIlIIIi();
   private final LongOpenHashSet liIiIIilliiIiIIill = new LongOpenHashSet();
   private int lIlIlIilliIlIlIill;
   private final iiIiiilIIliiil liIIIIilliiIIIIill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final Long2ObjectOpenHashMap<LongArrayList> llilIIillililIIill = new Long2ObjectOpenHashMap();
   private static final long lIiIIIilliIiIIIill = 320000000L;
   private boolean IllIlIilllllIlIill;
   private final ArrayList<ilIIlIIlIiIIlIIl> llliIIillilliIIill = new ArrayList();
   private long lIiiIIilliIiiIIill;
   private int liiiIIilliiiiIIill;
   private int IIIIlIilllIIIlIill;
   private int iIIIlIillIlIIlIill;

   private static float Illillllil(ilIIlIIlIiIIlIIl e, long now) {
      float var3 = Math.min(1.0F, Math.max(0.0F, (float)(now - e.IiiiilllIl) / 3.2E8F));
      float var4 = 1.0F - var3;
      float var5 = 1.0F - var4 * var4 * var4;
      if (e.liiiilllIl != (-5266342993085832951L ^ -5266342993085832951L)) {
         float var6 = Math.min(1.0F, Math.max(0.0F, (float)(now - e.liiiilllIl) / 2.6E8F));
         var5 *= 1.0F - var6 * var6 * (3.0F - 2.0F * var6);
      }

      return var5;
   }

   private static float lIliliIlil(float v) {
      return v * v;
   }

   protected void Illillliilli() {
      this.iiiIlIIIll();
   }

   public static void Ilillllill(class_2338 pos, class_2680 oldState, class_2680 newState) {
      illIiIlIilIiIl var3 = iiIlIIillIIllIIill;
      if (var3 != null && oldState != newState && !var3.IllIlIilllllIlIill && var3.IliIlllilIi() && var3.IiIIlIillliIIlIill != null) {
         try {
            var3.ilillIiill(pos.method_10263(), pos.method_10264(), pos.method_10260(), oldState, newState);
         } catch (Throwable var5) {
            var3.ilIllIiIll(var5);
         }

      }
   }

   private void lIilliIill(int chunkZ, int chunkX) {
      long var3 = iiIIIlllIIlIIlll.iliIiiliiiii(chunkZ, chunkX);
      this.IlllIIillllllIIill.IIillIiliIil(chunkZ, chunkX);
      this.lIllIIilliIllIIill.iIlIlllllill(var3);
      LongArrayList var5 = (LongArrayList)this.iIilIIillIlilIIill.get(var3);
      if (var5 != null) {
         this.IIliIIilllIliIIill.clear();
         this.IIliIIilllIliIIill.addAll(var5);
         long var6 = System.nanoTime();
         int var8 = 0;

         for(int var9 = this.IIliIIilllIliIIill.size(); var8 < var9; ++var8) {
            ilIIlIIlIiIIlIIl var10 = (ilIIlIIlIiIIlIIl)this.IIilIIilllIilIIill.get(this.IIliIIilllIliIIill.getLong(var8));
            if (var10 != null) {
               this.lllllillll(var10);
               var10.liiiilllIl = var6;
               this.iiilIIillIIIiIIill.add(var10);
               this.ilIiIIillIiIiIIill = true;
            }
         }

      }
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) << 10 | (char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) >>> 6))))))) >>> 6 | (char)(-((char)(-((char)(~((char)((char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) << 10 | (char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) >>> 6))))))) << 10) ^ var5) - 13595) + var5) - var5) ^ var5) << 4 | (char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) << 10 | (char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) >>> 6))))))) >>> 6 | (char)(-((char)(-((char)(~((char)((char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) << 10 | (char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) >>> 6))))))) << 10) ^ var5) - 13595) + var5) - var5) ^ var5) >>> 12) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) << 10 | (char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) >>> 6))))))) >>> 6 | (char)(-((char)(-((char)(~((char)((char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) << 10 | (char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) >>> 6))))))) << 10) ^ var5) - 13595) + var5) - var5) ^ var5) << 4 | (char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) << 10 | (char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) >>> 6))))))) >>> 6 | (char)(-((char)(-((char)(~((char)((char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) << 10 | (char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) >>> 6))))))) << 10) ^ var5) - 13595) + var5) - var5) ^ var5) >>> 12) >>> 15) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) << 10 | (char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) >>> 6))))))) >>> 6 | (char)(-((char)(-((char)(~((char)((char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) << 10 | (char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) >>> 6))))))) << 10) ^ var5) - 13595) + var5) - var5) ^ var5) << 4 | (char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) << 10 | (char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) >>> 6))))))) >>> 6 | (char)(-((char)(-((char)(~((char)((char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) << 10 | (char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) >>> 6))))))) << 10) ^ var5) - 13595) + var5) - var5) ^ var5) >>> 12) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) << 10 | (char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) >>> 6))))))) >>> 6 | (char)(-((char)(-((char)(~((char)((char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) << 10 | (char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) >>> 6))))))) << 10) ^ var5) - 13595) + var5) - var5) ^ var5) << 4 | (char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) << 10 | (char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) >>> 6))))))) >>> 6 | (char)(-((char)(-((char)(~((char)((char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) << 10 | (char)((char)(~((char)((char)(-var4[var5]) ^ var5))) >>> 2 | (char)(~((char)((char)(-var4[var5]) ^ var5))) << 14) >>> 6))))))) << 10) ^ var5) - 13595) + var5) - var5) ^ var5) >>> 12) >>> 15) >>> 9))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iiIilIIlil() {
      boolean var1 = this.ilIIIIillIiIIIIill.Iilllilliill();
      boolean var2 = this.liIIIIilliiIIIIill.Iilllilliill();
      if (var1 || var2) {
         Matrix4f var3 = iIiiIIilIliiIIil.IIillIiliIil();
         class_243 var4 = Iiiilllliiilll.field_1773.method_19418().method_71156();
         double var5 = var4.field_1352;
         double var7 = var4.field_1351;
         double var9 = var4.field_1350;
         int var11 = (int)Math.floor(var5);
         int var12 = (int)Math.floor(var7);
         int var13 = (int)Math.floor(var9);
         long var14 = System.nanoTime();
         float var16 = (float)this.lIIIIIilliIIIIIill.Iilllilliill();
         int var17 = IlIIilIlllIIilIl.lliiIlliIl & 16777215;
         boolean var18 = this.IIlIIIilllIlIIIill.Iilllilliill();
         boolean var19 = this.iIlIIIillIllIIIill.Iilllilliill();
         class_4588 var20 = var18 ? iIiiIIilIliiIIil.IilliliilIIi() : null;
         class_4588 var21 = iIiiIIilIliiIIil.IIlllIlliIll();

         for(int var22 = 0; var22 < this.IlIiIIillllIiIIill; ++var22) {
            ilIIlIIlIiIIlIIl var23 = this.lIIiIIilliIIiIIill[var22];
            iIIiliIlIili var24 = var23.iliiilllIl;
            if (var24.iilIiIlIlIIiIiIlIl == 1) {
               if (!var2) {
                  continue;
               }
            } else if (!var1) {
               continue;
            }

            double var25 = Math.max(Math.max((double)var24.lIiIiIlIliIiIiIlIl - var5, var5 - (double)(var24.liiIiIlIliiiIiIlIl + 1)), (double)0.0F);
            double var27 = Math.max(Math.max((double)var24.iliIiIlIlIiiIiIlIl - var9, var9 - (double)(var24.iIIliIlIlIlIliIlIl + 1)), (double)0.0F);
            double var29 = Math.sqrt(var25 * var25 + var27 * var27);
            if (!(var29 >= (double)var16)) {
               float var31 = Illillllil(var23, var14) * illilIilil((float)var29, var16);
               if (var24.IliIlllilIi(var11, var12, var13)) {
                  var31 *= 0.35F;
               }

               if (!(var31 <= 0.004F)) {
                  double var32 = (double)(var24.lIiIiIlIliIiIiIlIl + var24.liiIiIlIliiiIiIlIl + 1) * (double)0.5F;
                  double var34 = (double)(var24.IliIiIlIllliIiIlIl + var24.IIIliIlIllIIliIlIl + 1) * (double)0.5F;
                  double var36 = (double)(var24.iliIiIlIlIiiIiIlIl + var24.iIIliIlIlIlIliIlIl + 1) * (double)0.5F;
                  float var38 = 0.5F * (float)Math.sqrt((double)(lIliliIlil((float)(var24.liiIiIlIliiiIiIlIl - var24.lIiIiIlIliIiIiIlIl + 1)) + lIliliIlil((float)(var24.IIIliIlIllIIliIlIl - var24.IliIiIlIllliIiIlIl + 1)) + lIliliIlil((float)(var24.iIIliIlIlIlIliIlIl - var24.iliIiIlIlIiiIiIlIl + 1))));
                  if (!iIiiIIilIliiIIil.IlIillIiilIi(var32, var34, var36, var38)) {
                     float var39 = iIiiIIilIliiIIil.Ililllililil((double)var24.lIiIiIlIliIiIiIlIl);
                     float var40 = iIiiIIilIliiIIil.Iiilliiliiil((double)var24.IliIiIlIllliIiIlIl);
                     float var41 = iIiiIIilIliiIIil.IIIilIIiiIIi((double)var24.iliIiIlIlIiiIiIlIl);
                     if (var20 != null) {
                        int var42 = lililiilil(var31 * 0.075F, var17);
                        float[] var43 = var24.IIiliIlIllIiliIlIl;

                        for(int var44 = 0; var44 < var43.length; var44 += 3) {
                           var20.method_22918(var3, var39 + var43[var44], var40 + var43[var44 + 1], var41 + var43[var44 + 2]).method_39415(var42);
                        }
                     }

                     int var48 = lililiilil(var31 * 0.9F, var17);
                     float[] var49 = var24.lilliIlIliilliIlIl;

                     for(int var50 = 0; var50 < var49.length; var50 += 6) {
                        float var45 = var49[var50 + 3] != var49[var50] ? 1.0F : 0.0F;
                        float var46 = var49[var50 + 4] != var49[var50 + 1] ? 1.0F : 0.0F;
                        float var47 = var49[var50 + 5] != var49[var50 + 2] ? 1.0F : 0.0F;
                        var21.method_22918(var3, var39 + var49[var50], var40 + var49[var50 + 1], var41 + var49[var50 + 2]).method_39415(var48).method_22914(var45, var46, var47).method_75298(1.5F);
                        var21.method_22918(var3, var39 + var49[var50 + 3], var40 + var49[var50 + 4], var41 + var49[var50 + 5]).method_39415(var48).method_22914(var45, var46, var47).method_75298(1.5F);
                     }

                     if (var19) {
                        Iillllilll.Illlllllilll((double)var24.lIlliIlIliIlliIlIl + (double)0.5F, (double)var24.IllliIlIllllliIlIl + (double)0.5F, (double)var24.illliIlIlIilliIlIl + (double)0.5F, lililiilil(var31 * 0.35F, var17), lililiilil(var31 * 0.85F, var17), 1.2F);
                     }
                  }
               }
            }
         }

      }
   }

   private void IIIillIIil() {
      if (!this.IiilIIillliilIIill.isEmpty()) {
         long var1 = System.currentTimeMillis();
         ObjectIterator var3 = this.IiilIIillliilIIill.long2LongEntrySet().fastIterator();

         while(var3.hasNext()) {
            Long2LongMap.Entry var4 = (Long2LongMap.Entry)var3.next();
            if (var4.getLongValue() <= var1) {
               long var5 = var4.getLongKey();
               var3.remove();
               this.lIllIIilliIllIIill.iIlIlllllill(var5);
            }
         }

      }
   }

   protected void IIiilIiiiIii(illlllIillll event) {
      if (!this.illIlIillIilIlIill && this.IlIiIIillllIiIIill != 0 && Iiiilllliiilll.field_1724 != null) {
         try {
            this.iiIilIIlil();
         } catch (Throwable var3) {
            this.illIlIillIilIlIill = true;
         }

      }
   }

   public static String iIiilIliil() {
      illIiIlIilIiIl var0 = iiIlIIillIIllIIill;
      if (var0 == null) {
         return IliIlllilIi<invokedynamic>();
      } else {
         StringBuilder var1 = new StringBuilder();
         var1.append(IliIlllilIi<invokedynamic>()).append(var0.IliIlllilIi()).append(IliIlllilIi<invokedynamic>()).append(var0.IllIlIilllllIlIill).append(IliIlllilIi<invokedynamic>()).append(var0.illIlIillIilIlIill).append(IliIlllilIi<invokedynamic>()).append(var0.lIllIIilliIllIIill.IlIlllIlilIl()).append(IliIlllilIi<invokedynamic>()).append(var0.IlllIIillllllIIill.Ililllililil()).append(IliIlllilIi<invokedynamic>()).append(var0.IIilIIilllIilIIill.size()).append(String.format(Locale.ROOT, IliIlllilIi<invokedynamic>(), var0.iliiIIillIiiiIIill, var0.iliiIIillIiiiIIill == 0 ? (double)0.0F : (double)var0.iiliIIillIIiiIIill / (double)1000000.0F / (double)var0.iliiIIillIiiiIIill, (double)var0.lIiiIIilliIiiIIill / (double)1000000.0F, var0.liiiIIilliiiiIIill, var0.IIIIlIilllIIIlIill, var0.iIIIlIillIlIIlIill, var0.llIIlIillilIIlIill, (double)var0.IliiIIilllliiIIill / (double)1000000.0F));
         ObjectIterator var2 = var0.IIilIIilllIilIIill.values().iterator();

         while(var2.hasNext()) {
            ilIIlIIlIiIIlIIl var3 = (ilIIlIIlIiIIlIIl)var2.next();
            iIIiliIlIili var4 = var3.iliiilllIl;
            var1.append(IliIlllilIi<invokedynamic>()).append(var4.iilIiIlIlIIiIiIlIl == 1 ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>()).append(IliIlllilIi<invokedynamic>()).append(var4.IiIliIlIlliIliIlIl).append(IliIlllilIi<invokedynamic>()).append(var4.llIliIlIlilIliIlIl).append(String.format(Locale.ROOT, IliIlllilIi<invokedynamic>(), var4.iiIliIlIlIIlliIlIl)).append(IliIlllilIi<invokedynamic>()).append(var4.lIiIiIlIliIiIiIlIl).append(',').append(var4.IliIiIlIllliIiIlIl).append(',').append(var4.iliIiIlIlIiiIiIlIl).append(IliIlllilIi<invokedynamic>()).append(var4.liiIiIlIliiiIiIlIl).append(',').append(var4.IIIliIlIllIIliIlIl).append(',').append(var4.iIIliIlIlIlIliIlIl).append(IliIlllilIi<invokedynamic>()).append(var4.lIiiIiIlilli()).append(IliIlllilIi<invokedynamic>()).append(var4.iliIiiliiiii());
         }

         var1.append(IliIlllilIi<invokedynamic>());

         for(int var5 = 0; var5 < 16; ++var5) {
            int var6 = var0.illlIIillIillIIill.iliIiiliiiii(var5);
            if (var6 > 0) {
               var1.append(' ').append(IIIiiIIllIIiiIIl.iIlIlllllill(var5)).append('=').append(var6);
            }
         }

         return var1.toString();
      }
   }

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null && !this.IllIlIilllllIlIill) {
         long var1 = System.nanoTime();

         try {
            class_638 var3 = Iiiilllliiilll.field_1687;
            if (var3 != this.IiIIlIillliIIlIill) {
               this.lIIlliIIll(false);
               this.iiilIIillIIIiIIill.clear();
               this.IiIIlIillliIIlIill = var3;
            }

            this.IlllIIillllllIIill.IIlllIlliIll(var3);
            int var4 = this.IlIIIIillllIIIIill.Iilllilliill();
            if (var4 != this.iiIIlIillIIlIlIill) {
               if (this.iiIIlIillIIlIlIill != -1) {
                  this.lIIlliIIll(true);
               }

               this.iiIIlIillIIlIlIill = var4;
               this.lillIIilliillIIill = IiIiliIiliIiliIi.IliIlllilIi(var4);
            }

            class_1923 var5 = Iiiilllliiilll.field_1724.method_31476();
            int var6 = this.IlIllllIll();
            this.IIIillIIil();
            this.lIllIIilliIllIIill.IIlllIlliIll(var3, var5.field_9181, var5.field_9180, var6, 30000L, iIIlIIIiIlIlIIIi.IliIlllilIi(450), this::liIlliiIll);
            if (++this.lIlIlIilliIlIlIill >= 40) {
               this.lIlIlIilliIlIlIill = 0;
               this.iIIilIlIil(var5.field_9181, var5.field_9180, var6);
            }

            this.llIililIil();
            if (this.ilIiIIillIiIiIIill) {
               this.IiIilliIil();
            }
         } catch (Throwable var7) {
            this.ilIllIiIll(var7);
         }

         long var8 = System.nanoTime() - var1;
         if (var8 > this.IliiIIilllliiIIill) {
            this.IliiIIilllliiIIill = var8;
         }

      }
   }

   private void iiiIlIIIll() {
      this.IIilIIilllIilIIill.clear();
      this.iIilIIillIlilIIill.clear();
      this.llilIIillililIIill.clear();
      this.IiilIIillliilIIill.clear();
      this.iiilIIillIIIiIIill.clear();
      this.lIllIIilliIllIIill.liiiIIllIl();
      this.IlllIIillllllIIill.Illlllllilll();
      this.illlIIillIillIIill.IIIllIIliIIl();
      this.IlIiIIillllIiIIill = 0;
      this.ilIiIIillIiIiIIill = false;
      this.IiIIlIillliIIlIill = null;
      this.iiIIlIillIIlIlIill = -1;
      this.lIlIlIilliIlIlIill = 0;
      this.iiliIIillIIiiIIill = this.lIiiIIilliIiiIIill = this.IliiIIilllliiIIill = 0L;
      this.iliiIIillIiiiIIill = this.iIIIlIillIlIIlIill = this.llIIlIillilIIlIill = 0;
   }

   protected void Iilililiiili() {
      this.iiiIlIIIll();
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) ^ '쑸') - var5))) + '躜'))) - var5) << 13 | (char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) ^ '쑸') - var5))) + '躜'))) - var5) >>> 3) ^ var5) - var5))))) - var5) << 10 | (char)((char)(-((char)(-((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) ^ '쑸') - var5))) + '躜'))) - var5) << 13 | (char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) ^ '쑸') - var5))) + '躜'))) - var5) >>> 3) ^ var5) - var5))))) - var5) >>> 6));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void IiIilliIil() {
      this.ilIiIIillIiIiIIill = false;
      int var1 = this.IIilIIilllIilIIill.size() + this.iiilIIillIIIiIIill.size();
      if (this.lIIiIIilliIIiIIill.length < var1) {
         this.lIIiIIilliIIiIIill = new ilIIlIIlIiIIlIIl[Math.max(var1, this.lIIiIIilliIIiIIill.length * 2)];
      }

      int var2 = 0;

      ilIIlIIlIiIIlIIl var4;
      for(ObjectIterator var3 = this.IIilIIilllIilIIill.values().iterator(); var3.hasNext(); this.lIIiIIilliIIiIIill[var2++] = var4) {
         var4 = (ilIIlIIlIiIIlIIl)var3.next();
      }

      for(ilIIlIIlIiIIlIIl var7 : this.iiilIIillIIIiIIill) {
         this.lIIiIIilliIIiIIill[var2++] = var7;
      }

      for(int var6 = var2; var6 < this.IlIiIIillllIiIIill; ++var6) {
         this.lIIiIIilliIIiIIill[var6] = null;
      }

      this.IlIiIIillllIiIIill = var2;
   }

   private void iIlllIllll(ilIIlIIlIiIIlIIl e) {
      this.IIilIIilllIilIIill.put(e.iliiilllIl.lllIiIlIlillIiIlIl, e);

      for(long var5 : e.iliiilllIl.iIiliIlIlIliliIlIl) {
         LongArrayList var7 = (LongArrayList)this.iIilIIillIlilIIill.get(var5);
         if (var7 == null) {
            var7 = new LongArrayList(4);
            this.iIilIIillIlilIIill.put(var5, var7);
         }

         if (!var7.contains(e.iliiilllIl.lllIiIlIlillIiIlIl)) {
            var7.add(e.iliiilllIl.lllIiIlIlillIiIlIl);
         }
      }

   }

   private int IlIllllIll() {
      long var2 = 5286673669401855340L;
      var2 ^= ((long)((this.lIIIIIilliIIIIIill.Iilllilliill() + (121228763 * -724452315 ^ -85 ^ 363686659)) / ((1222637681 * 97 * -954437177 << 19 | 1222637681 * 97 * -954437177 >>> 13) ^ -1950445294) + 1) << 32 ^ var2) & -1L << 32;
      return Math.max(1, Math.min((int)(var2 >>> 32), Iiiilllliiilll.field_1690.method_38521() + 1));
   }

   private void liilliiill(long chunkKey, long due) {
      if (!this.IiilIIillliilIIill.containsKey(chunkKey)) {
         this.IiilIIillliilIIill.put(chunkKey, due);
      }

   }

   private void IIllllIlll(long chunkKey) {
      long var3 = System.nanoTime();
      this.liIiIIilliiIiIIill.clear();
      this.iIliIIillIlliIIill.clear();
      this.llliIIillilliIIill.clear();
      List var5 = this.illlIIillIillIIill.IliIlllilIi();
      int var6 = 0;

      for(int var7 = var5.size(); var6 < var7; ++var6) {
         iIIiliIlIili var8 = (iIIiliIlIili)var5.get(var6);
         if (this.liIiIIilliiIiIIill.add(var8.lllIiIlIlillIiIlIl)) {
            ilIIlIIlIiIIlIIl var9 = (ilIIlIIlIiIIlIIl)this.IIilIIilllIilIIill.get(var8.lllIiIlIlillIiIlIl);
            if (var9 == null || var9.iliiilllIl.IilIiIlIllilIiIlIl != var8.IilIiIlIllilIiIlIl) {
               ilIIlIIlIiIIlIIl var10 = new ilIIlIIlIiIIlIIl(var8, var9 != null ? var9.IiiiilllIl : var3);
               if (var9 != null) {
                  this.lllllillll(var9);
               }

               this.iIlllIllll(var10);
               this.iIliIIillIlliIIill.add(var10);
               this.ilIiIIillIiIiIIill = true;
            }
         }
      }

      LongArrayList var12 = (LongArrayList)this.iIilIIillIlilIIill.get(chunkKey);
      if (var12 != null) {
         this.IIliIIilllIliIIill.clear();
         this.IIliIIilllIliIIill.addAll(var12);
         int var13 = 0;

         for(int var17 = this.IIliIIilllIliIIill.size(); var13 < var17; ++var13) {
            long var21 = this.IIliIIilllIliIIill.getLong(var13);
            if (!this.liIiIIilliiIiIIill.contains(var21)) {
               ilIIlIIlIiIIlIIl var11 = (ilIIlIIlIiIIlIIl)this.IIilIIilllIilIIill.get(var21);
               if (var11 != null) {
                  this.lllllillll(var11);
                  this.llliIIillilliIIill.add(var11);
               }
            }
         }
      }

      int var14 = 0;

      for(int var18 = this.iIliIIillIlliIIill.size(); var14 < var18; ++var14) {
         ilIIlIIlIiIIlIIl var22 = (ilIIlIIlIiIIlIIl)this.iIliIIillIlliIIill.get(var14);
         this.IiliIIillliliIIill.clear();
         ObjectIterator var23 = this.IIilIIilllIilIIill.values().iterator();

         while(var23.hasNext()) {
            ilIIlIIlIiIIlIIl var26 = (ilIIlIIlIiIIlIIl)var23.next();
            if (var26 != var22 && var22.iliiilllIl.iIlIlllllill(var26.iliiilllIl)) {
               this.IiliIIillliliIIill.add(var26);
            }
         }

         for(ilIIlIIlIiIIlIIl var27 : this.IiliIIillliliIIill) {
            this.lllllillll(var27);
            this.llliIIillilliIIill.add(var27);
         }

         for(ilIIlIIlIiIIlIIl var28 : this.llliIIillilliIIill) {
            if (!var28.iiiiilllIl && var28.iliiilllIl.iIlIlllllill(var22.iliiilllIl)) {
               var22.IiiiilllIl = Math.min(var22.IiiiilllIl, var28.IiiiilllIl);
               var28.iiiiilllIl = true;
            }
         }
      }

      for(ilIIlIIlIiIIlIIl var19 : this.llliIIillilliIIill) {
         if (!var19.iiiiilllIl) {
            var19.liiiilllIl = var3;
            this.iiilIIillIIIiIIill.add(var19);
         }
      }

      if (!this.llliIIillilliIIill.isEmpty()) {
         this.ilIiIIillIiIiIIill = true;
      }

      var14 = 0;

      for(int var20 = this.illlIIillIillIIill.liiiIIllIl(); var14 < var20; ++var14) {
         this.Iillllilll(this.illlIIillIillIIill.iIlIlllllill(var14), chunkKey);
      }

   }

   private void iIIilIlIil(int centerX, int radius, int centerZ) {
      int var4 = centerZ + 2;
      this.IiliIIillliliIIill.clear();
      ObjectIterator var5 = this.IIilIIilllIilIIill.values().iterator();

      while(var5.hasNext()) {
         ilIIlIIlIiIIlIIl var6 = (ilIIlIIlIiIIlIIl)var5.next();
         int var7 = var6.iliiilllIl.lIiIiIlIliIiIiIlIl + var6.iliiilllIl.liiIiIlIliiiIiIlIl >> 1 >> 4;
         int var8 = var6.iliiilllIl.iliIiIlIlIiiIiIlIl + var6.iliiilllIl.iIIliIlIlIlIliIlIl >> 1 >> 4;
         if (Math.abs(var7 - centerX) > var4 || Math.abs(var8 - radius) > var4) {
            this.IiliIIillliliIIill.add(var6);
         }
      }

      long var14 = System.nanoTime();

      for(ilIIlIIlIiIIlIIl var17 : this.IiliIIillliliIIill) {
         this.lllllillll(var17);

         for(long var12 : var17.iliiilllIl.iIiliIlIlIliliIlIl) {
            this.lIllIIilliIllIIill.iIlIlllllill(var12);
         }

         var17.liiiilllIl = var14;
         this.iiilIIillIIIiIIill.add(var17);
         this.ilIiIIillIiIiIIill = true;
      }

      this.lIllIIilliIllIIill.IiIlliIliiIl(centerX, radius, var4 + 1);
      ObjectIterator var16 = this.llilIIillililIIill.long2ObjectEntrySet().fastIterator();

      while(var16.hasNext()) {
         long var18 = ((Long2ObjectMap.Entry)var16.next()).getLongKey();
         if (Math.abs(iiIIIlllIIlIIlll.IIIllIIliIIl(var18) - centerX) > var4 + 2 || Math.abs(iiIIIlllIIlIIlll.IlIlllIlilIl(var18) - radius) > var4 + 2) {
            var16.remove();
         }
      }

   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '鮐') - 30762) + 29574) >>> 14 | (char)((char)((char)(var4[var5] ^ '鮐') - 30762) + 29574) << 2) ^ var5) + var5) + 12435) >>> 6 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '鮐') - 30762) + 29574) >>> 14 | (char)((char)((char)(var4[var5] ^ '鮐') - 30762) + 29574) << 2) ^ var5) + var5) + 12435) << 10) ^ var5) + var5) << 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '鮐') - 30762) + 29574) >>> 14 | (char)((char)((char)(var4[var5] ^ '鮐') - 30762) + 29574) << 2) ^ var5) + var5) + 12435) >>> 6 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '鮐') - 30762) + 29574) >>> 14 | (char)((char)((char)(var4[var5] ^ '鮐') - 30762) + 29574) << 2) ^ var5) + var5) + 12435) << 10) ^ var5) + var5) >>> 7) - '샥') >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '鮐') - 30762) + 29574) >>> 14 | (char)((char)((char)(var4[var5] ^ '鮐') - 30762) + 29574) << 2) ^ var5) + var5) + 12435) >>> 6 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '鮐') - 30762) + 29574) >>> 14 | (char)((char)((char)(var4[var5] ^ '鮐') - 30762) + 29574) << 2) ^ var5) + var5) + 12435) << 10) ^ var5) + var5) << 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '鮐') - 30762) + 29574) >>> 14 | (char)((char)((char)(var4[var5] ^ '鮐') - 30762) + 29574) << 2) ^ var5) + var5) + 12435) >>> 6 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '鮐') - 30762) + 29574) >>> 14 | (char)((char)((char)(var4[var5] ^ '鮐') - 30762) + 29574) << 2) ^ var5) + var5) + 12435) << 10) ^ var5) + var5) >>> 7) - '샥') << 13) + var5) + var5))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void lllllillll(ilIIlIIlIiIIlIIl e) {
      if (this.IIilIIilllIilIIill.get(e.iliiilllIl.lllIiIlIlillIiIlIl) == e) {
         this.IIilIIilllIilIIill.remove(e.iliiilllIl.lllIiIlIlillIiIlIl);
      }

      for(long var5 : e.iliiilllIl.iIiliIlIlIliliIlIl) {
         LongArrayList var7 = (LongArrayList)this.iIilIIillIlilIIill.get(var5);
         if (var7 != null) {
            var7.rem(e.iliiilllIl.lllIiIlIlillIiIlIl);
            if (var7.isEmpty()) {
               this.iIilIIillIlilIIill.remove(var5);
            }
         }
      }

   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 31810) >>> 11 | (char)((char)(var4[var5] ^ var5) + 31810) << 5))) ^ var5) ^ var5) >>> 6 | (char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 31810) >>> 11 | (char)((char)(var4[var5] ^ var5) + 31810) << 5))) ^ var5) ^ var5) << 10))) >>> 5 | (char)(~((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 31810) >>> 11 | (char)((char)(var4[var5] ^ var5) + 31810) << 5))) ^ var5) ^ var5) >>> 6 | (char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 31810) >>> 11 | (char)((char)(var4[var5] ^ var5) + 31810) << 5))) ^ var5) ^ var5) << 10))) << 11))) + '죂'))) ^ '샥') ^ 14387) ^ var5) + '\uef75') - var5) - '퓤') - '읜'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public illIiIlIilIiIl() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.llIlIIIiilIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lIIIIIilliIIIIIill, this.IlIIIIillllIIIIill, this.ilIIIIillIiIIIIill, this.liIIIIilliiIIIIill, this.IIlIIIilllIlIIIill, this.iIlIIIillIllIIIill});
      iiIlIIillIIllIIill = this;
      ClientChunkEvents.CHUNK_LOAD.register((ClientChunkEvents.Load)(chunk, world) -> {
         if (this.IliIlllilIi() && chunk == this.IiIIlIillliIIlIill && !this.IllIlIilllllIlIill) {
            try {
               this.iilllIIill(world.method_12004().field_9181, world.method_12004().field_9180);
            } catch (Throwable var4) {
               this.ilIllIiIll(var4);
            }

         }
      });
      ClientChunkEvents.CHUNK_UNLOAD.register((ClientChunkEvents.Unload)(chunk, world) -> {
         if (this.IliIlllilIi() && chunk == this.IiIIlIillliIIlIill && !this.IllIlIilllllIlIill) {
            try {
               this.lIilliIill(world.method_12004().field_9181, world.method_12004().field_9180);
            } catch (Throwable var4) {
               this.ilIllIiIll(var4);
            }

         }
      });
   }

   private static int lililiilil(float alpha, int rgb) {
      long var3 = 4944532842588996945L;
      var3 ^= ((long)Math.round(Math.max(0.0F, Math.min(1.0F, alpha)) * 255.0F) << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) << (-((-1449329863 + 11) * -2014922929 + 17) ^ -707208725) | rgb;
   }

   private void iilllIIill(int chunkX, int chunkZ) {
      long var3 = iiIIIlllIIlIIlll.iliIiiliiiii(chunkX, chunkZ);
      this.IlllIIillllllIIill.IIillIiliIil(chunkX, chunkZ);
      this.lIllIIilliIllIIill.iIlIlllllill(var3);
      LongArrayList var5 = (LongArrayList)this.llilIIillililIIill.remove(var3);
      if (var5 != null) {
         int var6 = 0;

         for(int var7 = var5.size(); var6 < var7; ++var6) {
            this.lIllIIilliIllIIill.iIlIlllllill(var5.getLong(var6));
         }
      }

   }

   public int IIiillIiil() {
      return this.IIilIIilllIilIIill.size();
   }

   private void ilIllIiIll(Throwable t) {
      if (!this.IllIlIilllllIlIill) {
         this.IllIlIilllllIlIill = true;
      }
   }

   private static float illilIilil(float distance, float maxDistance) {
      float var2 = maxDistance - 12.0F;
      if (distance <= var2) {
         return 1.0F;
      } else {
         float var3 = Math.min(1.0F, (distance - var2) / 12.0F);
         return 1.0F - var3 * var3 * (3.0F - 2.0F * var3);
      }
   }

   private void lIIlliIIll(boolean fade) {
      long var2 = System.nanoTime();
      if (fade) {
         ObjectIterator var4 = this.IIilIIilllIilIIill.values().iterator();

         while(var4.hasNext()) {
            ilIIlIIlIiIIlIIl var5 = (ilIIlIIlIiIIlIIl)var4.next();
            var5.liiiilllIl = var2;
            this.iiilIIillIIIiIIill.add(var5);
         }
      }

      this.IIilIIilllIilIIill.clear();
      this.iIilIIillIlilIIill.clear();
      this.llilIIillililIIill.clear();
      this.IiilIIillliilIIill.clear();
      this.lIllIIilliIllIIill.liiiIIllIl();
      this.IlllIIillllllIIill.Illlllllilll();
      this.ilIiIIillIiIiIIill = true;
   }

   private void liIlliiIll(class_2818 chunk, long key) {
      if (!this.IllIlIilllllIlIill) {
         class_1923 var4 = chunk.method_12004();
         long var6 = System.nanoTime();

         boolean var5;
         try {
            var5 = this.illlIIillIillIIill.IiIlliIliiIl(this.IlllIIillllllIIill, var4.field_9181, var4.field_9180, this.lillIIilliillIIill);
         } catch (Throwable var10) {
            this.ilIllIiIll(var10);
            return;
         }

         long var8 = System.nanoTime() - var6;
         ++this.iliiIIillIiiiIIill;
         this.iiliIIillIIiiIIill += var8;
         if (var8 > this.lIiiIIilliIiiIIill) {
            this.lIiiIIilliIiiIIill = var8;
            this.liiiIIilliiiiIIill = var4.field_9181;
            this.IIIIlIilllIIIlIill = var4.field_9180;
            this.iIIIlIillIlIIlIill = this.illlIIillIillIIill.IilliliilIIi();
            this.llIIlIillilIIlIill = this.illlIIillIillIIill.lIiiIiIlilli();
         }

         if (var5) {
            this.IIllllIlll(key);
         }

      }
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)(-var4[var5]) - '說') ^ var5) - '\ud8c3') << 2 | (char)((char)((char)((char)(-var4[var5]) - '說') ^ var5) - '\ud8c3') >>> 14))) >>> 6 | (char)(-((char)((char)((char)((char)((char)(-var4[var5]) - '說') ^ var5) - '\ud8c3') << 2 | (char)((char)((char)((char)(-var4[var5]) - '說') ^ var5) - '\ud8c3') >>> 14))) << 10) - var5))))) << 10 | (char)(-((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)(-var4[var5]) - '說') ^ var5) - '\ud8c3') << 2 | (char)((char)((char)((char)(-var4[var5]) - '說') ^ var5) - '\ud8c3') >>> 14))) >>> 6 | (char)(-((char)((char)((char)((char)((char)(-var4[var5]) - '說') ^ var5) - '\ud8c3') << 2 | (char)((char)((char)((char)(-var4[var5]) - '說') ^ var5) - '\ud8c3') >>> 14))) << 10) - var5))))) >>> 6) + 23650) + '껤') << 5 | (char)((char)((char)((char)(-((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)(-var4[var5]) - '說') ^ var5) - '\ud8c3') << 2 | (char)((char)((char)((char)(-var4[var5]) - '說') ^ var5) - '\ud8c3') >>> 14))) >>> 6 | (char)(-((char)((char)((char)((char)((char)(-var4[var5]) - '說') ^ var5) - '\ud8c3') << 2 | (char)((char)((char)((char)(-var4[var5]) - '說') ^ var5) - '\ud8c3') >>> 14))) << 10) - var5))))) << 10 | (char)(-((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)(-var4[var5]) - '說') ^ var5) - '\ud8c3') << 2 | (char)((char)((char)((char)(-var4[var5]) - '說') ^ var5) - '\ud8c3') >>> 14))) >>> 6 | (char)(-((char)((char)((char)((char)((char)(-var4[var5]) - '說') ^ var5) - '\ud8c3') << 2 | (char)((char)((char)((char)(-var4[var5]) - '說') ^ var5) - '\ud8c3') >>> 14))) << 10) - var5))))) >>> 6) + 23650) + '껤') >>> 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void ilillIiill(int y, int oldState, int z, class_2680 x, class_2680 newState) {
      if (iiiliIIiIIIiiIIi.IliIlllilIi(x) != iiiliIIiIIIiiIIi.IliIlllilIi(newState)) {
         this.IlllIIillllllIIill.Iilllilliill(y, oldState, z);
         long var6 = System.currentTimeMillis() + 300L;
         this.liilliiill(iiIIIlllIIlIIlll.iliIiiliiiii(y >> 4, z >> 4), var6);

         for(int var8 = 0; var8 < this.IlIiIIillllIiIIill; ++var8) {
            ilIIlIIlIiIIlIIl var9 = this.lIIiIIilliIIiIIill[var8];
            if (var9.liiiilllIl == 0L && var9.iliiilllIl.liiiIIllIl(y, oldState, z, 1)) {
               for(long var13 : var9.iliiilllIl.iIiliIlIlIliliIlIl) {
                  this.liilliiill(var13, var6);
               }
            }
         }

      }
   }

   private void llIililIil() {
      if (!this.iiilIIillIIIiIIill.isEmpty()) {
         long var1 = System.nanoTime();
         if (this.iiilIIillIIIiIIill.removeIf((e) -> var1 - e.liiiilllIl >= (5754868043915451631L ^ 5754868043694773743L))) {
            this.ilIiIIillIiIiIIill = true;
         }

      }
   }

   private void Iillllilll(long unknownChunk, long owner) {
      LongArrayList var5 = (LongArrayList)this.llilIIillililIIill.get(unknownChunk);
      if (var5 == null) {
         var5 = new LongArrayList(2);
         this.llilIIillililIIill.put(unknownChunk, var5);
      }

      if (!var5.contains(owner)) {
         var5.add(owner);
      }

   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3146086651640899555L ^ Long.rotateLeft(2142403658531444832L, 10) ^ -1376464596122190176L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1623724467374113505L ^ Long.rotateLeft(8755388987310812262L, 7) ^ 3175108341012423768L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7304636282837195433L ^ Long.rotateLeft(-1753393316825618234L, 11) ^ -428870452610646978L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 8529040290456586465L ^ Long.rotateLeft(3241338624406471754L, 27) ^ 5122034611493937076L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7144537579229137185L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 2774086262352696191L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5240831442079891449L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3583316404394851140L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 2075263842022749878L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -7034689719585321849L;
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
}
