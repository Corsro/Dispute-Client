package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1297;
import net.minecraft.class_1311;
import net.minecraft.class_1657;
import net.minecraft.class_2561;

public class IlllilIlllllilIl extends ilIllIiIll {
   private long iilIlilIll = -1L;
   private long lllIlilIll = -1L;
   private int liiIlilIll = 0;
   private int iiIIlilIll = 0;
   private final lliliIIiililiIIi liiiIilIll = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private final lliliIIiililiIIi lIIIlilIll = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private boolean lliIlilIll = false;
   private long iliIlilIll = 0L;
   private boolean iIiIlilIll = false;
   private boolean lilIlilIll = false;
   private final iiIiiilIIliiil IlIIlilIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private final iilliIlIIiliIl iiiiIilIll = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 5, 1, 15);
   private boolean IIiIlilIll = false;
   private final iilliIlIIiliIl IIIIlilIll = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 1, 1, 10);
   private long lIiIlilIll = -1L;
   private final iiIiiilIIliiil ilIIlilIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private long IilIlilIll = -1L;
   private boolean lIlIlilIll = false;
   private final IIiiIIIllIiiIIIl llIIlilIll = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), "");
   private boolean iiiIlilIll = false;
   private boolean IIlIlilIll = false;
   private final ArrayDeque<String> illIlilIll = new ArrayDeque();
   private boolean IllIlilIll = false;
   private boolean IliIlilIll = false;
   private final iilliIlIIiliIl IiIIlilIll = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 5, 1, 20);
   private int IiiIlilIll = 0;
   private static final long IiiiIilIll = 30000L;
   private int iIlIlilIll = 0;
   private final iiIiiilIIliiil liIIlilIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final lliliIIiililiIIi iIIIlilIll = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});

   protected void Iilililiiili() {
      this.lllIlilIll = -1L;
      this.illIlilIll.clear();
      this.IilIlilIll = -1L;
      this.IllIlilIll = false;
      this.lilIlilIll = false;
      this.iilIlilIll = -1L;
      this.IIiIlilIll = false;
      this.lIiIlilIll = -1L;
      this.iIiIlilIll = false;
      this.IliIlilIll = false;
      this.lliIlilIll = false;
      this.iiiIlilIll = false;
   }

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         if (this.iiiIlilIll) {
            this.iiiIlilIll = false;
            this.lIIlliIIll(this.lIIIlilIll.Iilllilliill());
            this.lllIlilIll = System.currentTimeMillis() + (long)this.iiiiIilIll.Iilllilliill() * 1000L;
         } else {
            if (this.ilIIlilIll.Iilllilliill() && !this.IllIlilIll && Iiiilllliiilll.field_1724.method_6032() <= (float)this.IiIIlilIll.Iilllilliill()) {
               double var1 = Iiiilllliiilll.field_1724.method_23317();
               double var3 = Iiiilllliiilll.field_1724.method_23318();
               double var5 = Iiiilllliiilll.field_1724.method_23321();

               for(class_1297 var8 : Iiiilllliiilll.field_1687.method_18112()) {
                  if (var8.method_5864().method_5891() == class_1311.field_6302) {
                     double var9 = var8.method_23317() - var1;
                     double var11 = var8.method_23318() - var3;
                     double var13 = var8.method_23321() - var5;
                     if (var9 * var9 + var11 * var11 + var13 * var13 <= (double)64.0F) {
                        this.IlIllllIll(IliIlllilIi<invokedynamic>());
                        break;
                     }
                  }
               }
            }

            if (this.liIIlilIll.Iilllilliill() && !this.lilIlilIll && !this.iIiIlilIll) {
               for(class_1297 var2 : Iiiilllliiilll.field_1687.method_18112()) {
                  if (var2 instanceof class_1657 && var2 != Iiiilllliiilll.field_1724) {
                     String var21 = var2.method_5477().getString();
                     boolean var4 = false;

                     for(String var6 : this.IIllllIlll()) {
                        if (var6.equalsIgnoreCase(var21)) {
                           var4 = true;
                           break;
                        }
                     }

                     if (!var4) {
                        this.lllllillll(IliIlllilIi<invokedynamic>());
                        this.IIillIiliIil(false);
                        return;
                     }
                  }
               }
            }

            if (this.lilIlilIll) {
               if (!this.illIlilIll.isEmpty() && System.currentTimeMillis() >= this.IilIlilIll) {
                  this.iIlllIllll(IliIlllilIi<invokedynamic>() + (String)this.illIlilIll.poll());
                  this.IilIlilIll = System.currentTimeMillis() + 1000L;
               }

               if (!this.IIiIlilIll) {
                  for(class_1297 var20 : Iiiilllliiilll.field_1687.method_18112()) {
                     if (var20 instanceof class_1657 && var20 != Iiiilllliiilll.field_1724) {
                        String var23 = var20.method_5477().getString();

                        for(String var27 : this.IIllllIlll()) {
                           if (var27.equalsIgnoreCase(var23)) {
                              this.IIiIlilIll = true;
                              this.lIiIlilIll = System.currentTimeMillis() + 5000L;
                              this.lllllillll(IliIlllilIi<invokedynamic>() + var23 + IliIlllilIi<invokedynamic>());
                              break;
                           }
                        }

                        if (this.IIiIlilIll) {
                           break;
                        }
                     }
                  }
               }

               if (this.IIiIlilIll && System.currentTimeMillis() >= this.lIiIlilIll) {
                  this.iiiIlIIIll();
               } else if (System.currentTimeMillis() >= this.iilIlilIll) {
                  this.lllllillll(IliIlllilIi<invokedynamic>());
                  this.iiiIlIIIll();
               }

            } else if (this.lliIlilIll) {
               long var17 = System.currentTimeMillis();
               int var22 = Iiiilllliiilll.field_1724.method_31477() >> 4;
               int var24 = Iiiilllliiilll.field_1724.method_31479() >> 4;
               if (var22 != this.IiiIlilIll || var24 != this.liiIlilIll || var17 - this.iliIlilIll >= 30000L) {
                  this.lliIlilIll = false;
                  this.lllIlilIll = var17 + (long)this.iiiiIilIll.Iilllilliill() * 1000L;
               }

            } else if (this.lllIlilIll < 0L) {
               if (!this.illIlilIll.isEmpty()) {
                  if (System.currentTimeMillis() >= this.IilIlilIll) {
                     this.iIlllIllll(IliIlllilIi<invokedynamic>() + (String)this.illIlilIll.poll());
                     this.IilIlilIll = System.currentTimeMillis() + 1000L;
                  }
               } else if (this.IilIlilIll >= 0L && !this.lilIlilIll) {
                  this.IilIlilIll = -1L;
                  this.IIillIiliIil(false);
               }

            } else if (System.currentTimeMillis() >= this.lllIlilIll) {
               this.lllIlilIll = -1L;
               if (this.IliIlilIll) {
                  this.IliIlilIll = false;
               } else {
                  this.iIiIlilIll = false;
               }

               if (this.liIlliiIll() - this.iIlIlilIll >= this.IIIIlilIll.Iilllilliill()) {
                  if (this.liiiIilIll.Iilllilliill().equals(IliIlllilIi<invokedynamic>())) {
                     this.lllllillll(IliIlllilIi<invokedynamic>());
                     this.lilIlilIll = true;
                     this.iilIlilIll = System.currentTimeMillis() + 600000L;
                     if (this.IlIIlilIll.Iilllilliill() && !this.IIllllIlll().isEmpty()) {
                        this.illIlilIll.addAll(this.IIllllIlll());
                        this.IilIlilIll = System.currentTimeMillis();
                     }
                  } else {
                     this.lllllillll(IliIlllilIi<invokedynamic>());
                     if (this.IlIIlilIll.Iilllilliill() && !this.IIllllIlll().isEmpty()) {
                        this.illIlilIll.addAll(this.IIllllIlll());
                        this.IilIlilIll = System.currentTimeMillis();
                     } else {
                        this.IIillIiliIil(false);
                     }
                  }

               } else {
                  if (this.iIIIlilIll.Iilllilliill().equals(this.lIIIlilIll.Iilllilliill()) && !this.lIlIlilIll) {
                     this.lIlIlilIll = true;
                     this.Iillllilll(IliIlllilIi<invokedynamic>() + this.lIIIlilIll.Iilllilliill() + IliIlllilIi<invokedynamic>());
                  }

                  ++this.iiIIlilIll;
                  boolean var16 = !this.iIIIlilIll.Iilllilliill().equals(this.lIIIlilIll.Iilllilliill()) && this.iiIIlilIll % 10 == 0 && !this.IIlIlilIll;
                  String var19 = var16 ? this.iIIIlilIll.Iilllilliill() : this.lIIIlilIll.Iilllilliill();
                  this.IIlIlilIll = var16;
                  this.lIIlliIIll(var19);
                  this.lllIlilIll = System.currentTimeMillis() + (long)this.iiiiIilIll.Iilllilliill() * 1000L;
               }
            }
         }
      }
   }

   private int liIlliiIll() {
      ilIllIiIll var1 = llilIllililIll.iliIiiliiiii(lliIIiililiIIiil.class);
      int var10000;
      if (var1 instanceof lliIIiililiIIiil var2) {
         var10000 = var2.IIllllIlll();
      } else {
         var10000 = 0;
      }

      return var10000;
   }

   private void ilIllIiIll() {
      ilIllIiIll var1 = llilIllililIll.iliIiiliiiii(lliIIiililiIIiil.class);
      if (var1 != null && !var1.IliIlllilIi()) {
         var1.IIillIiliIil(true);
      }

   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ 'ꛉ') << 6 | (char)(var4[var5] ^ 'ꛉ') >>> 10) + var5) << 11 | (char)((char)((char)(var4[var5] ^ 'ꛉ') << 6 | (char)(var4[var5] ^ 'ꛉ') >>> 10) + var5) >>> 5) + 'ꔱ'))) >>> 2 | (char)(-((char)((char)((char)((char)((char)(var4[var5] ^ 'ꛉ') << 6 | (char)(var4[var5] ^ 'ꛉ') >>> 10) + var5) << 11 | (char)((char)((char)(var4[var5] ^ 'ꛉ') << 6 | (char)(var4[var5] ^ 'ꛉ') >>> 10) + var5) >>> 5) + 'ꔱ'))) << 14) - var5))) ^ '\uf1e2') + '腝') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void Illillliilli() {
      this.ilIllIiIll();
      this.iIlIlilIll = this.liIlliiIll();
      this.iiIIlilIll = 0;
      this.IIlIlilIll = false;
      this.lIlIlilIll = false;
      this.lilIlilIll = false;
      this.iilIlilIll = -1L;
      this.IIiIlilIll = false;
      this.lIiIlilIll = -1L;
      this.iIiIlilIll = false;
      this.IliIlilIll = false;
      this.lliIlilIll = false;
      this.IllIlilIll = false;
      this.lllIlilIll = -1L;
      this.illIlilIll.clear();
      this.IilIlilIll = -1L;
      this.iiiIlilIll = true;
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ '젢') << 14 | (char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ '젢') >>> 2) + var5) - '\ue189') >>> 12 | (char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ '젢') << 14 | (char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ '젢') >>> 2) + var5) - '\ue189') << 4) - var5) - var5) ^ '\uffc8') + '맛'));
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
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] ^ 22978) << 1 | (char)(var4[var5] ^ 22978) >>> 15) << 9 | (char)((char)(var4[var5] ^ 22978) << 1 | (char)(var4[var5] ^ 22978) >>> 15) >>> 7))))) + var5) + 18917) << 10 | (char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] ^ 22978) << 1 | (char)(var4[var5] ^ 22978) >>> 15) << 9 | (char)((char)(var4[var5] ^ 22978) << 1 | (char)(var4[var5] ^ 22978) >>> 15) >>> 7))))) + var5) + 18917) >>> 6) - '꿐') - '붗') ^ 30823) + '쥶') << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] ^ 22978) << 1 | (char)(var4[var5] ^ 22978) >>> 15) << 9 | (char)((char)(var4[var5] ^ 22978) << 1 | (char)(var4[var5] ^ 22978) >>> 15) >>> 7))))) + var5) + 18917) << 10 | (char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] ^ 22978) << 1 | (char)(var4[var5] ^ 22978) >>> 15) << 9 | (char)((char)(var4[var5] ^ 22978) << 1 | (char)(var4[var5] ^ 22978) >>> 15) >>> 7))))) + var5) + 18917) >>> 6) - '꿐') - '붗') ^ 30823) + '쥶') >>> 2) - var5) ^ var5) - '멡'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void lllllillll(String s) {
      if (Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1724.method_7353(class_2561.method_43470(IliIlllilIi<invokedynamic>() + s), false);
      }

   }

   private void lIIlliIIll(String dir) {
      this.iIlllIllll(IliIlllilIi<invokedynamic>() + dir);
      this.lliIlilIll = true;
      this.iliIlilIll = System.currentTimeMillis();
      this.IiiIlilIll = Iiiilllliiilll.field_1724.method_31477() >> 4;
      this.liiIlilIll = Iiiilllliiilll.field_1724.method_31479() >> 4;
   }

   public IlllilIlllllilIl() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.liiiIilIll, this.iiiiIilIll, this.IIIIlilIll, this.lIIIlilIll, this.iIIIlilIll, this.IlIIlilIll, this.llIIlilIll, this.ilIIlilIll, this.IiIIlilIll, this.liIIlilIll});
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) ^ var5))) + '쑩') + var5) << 12 | (char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) ^ var5))) + '쑩') + var5) >>> 4))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private List<String> IIllllIlll() {
      ArrayList var1 = new ArrayList();
      String var2 = this.llIIlilIll.Iilllilliill();
      if (var2 != null) {
         for(String var6 : var2.split(IliIlllilIi<invokedynamic>())) {
            String var7 = var6.trim();
            if (!var7.isEmpty()) {
               var1.add(var7);
            }
         }
      }

      return var1;
   }

   private void iIlllIllll(String command) {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1724.field_3944 != null) {
         Iiiilllliiilll.field_1724.field_3944.method_45730(command);
      }

   }

   private void IlIllllIll(String reason) {
      this.IllIlilIll = true;
      this.lllllillll(IliIlllilIi<invokedynamic>() + reason);
      this.IIillIiliIil(false);
      if (Iiiilllliiilll.method_1562() != null) {
         Iiiilllliiilll.method_1562().method_48296().method_10747(class_2561.method_43470(IliIlllilIi<invokedynamic>() + reason));
      }

   }

   private void iiiIlIIIll() {
      this.lilIlilIll = false;
      this.iilIlilIll = -1L;
      this.IIiIlilIll = false;
      this.lIiIlilIll = -1L;
      this.illIlilIll.clear();
      this.IilIlilIll = -1L;
      this.iIiIlilIll = true;
      this.IliIlilIll = true;
      this.iIlIlilIll = this.liIlliiIll();
      this.lllllillll(IliIlllilIi<invokedynamic>());
      this.lllIlilIll = System.currentTimeMillis() + (long)this.iiiiIilIll.Iilllilliill() * (1931265355759818725L ^ 1931265355759817741L);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2415438916479785287L ^ Long.rotateLeft(-584684891967143151L, 43) ^ -873422970265038115L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 3815297609467115902L ^ Long.rotateLeft(-8902867100438667196L, 11) ^ -759509853866144466L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7359717756655057665L ^ Long.rotateLeft(7096232369667804423L, 38) ^ -5996353136127667999L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7868400928003122114L ^ Long.rotateLeft(3404678222166464485L, 9) ^ 585632461290313278L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3808790583686961798L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 568165558771973434L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6501508492454092094L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 6892403851036517712L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6108138811998351936L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8763894996338134789L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, lIiiIiIlilli<invokedynamic>());
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

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) - var5) ^ var5) ^ var5) ^ var5) << 7 | (char)((char)((char)((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) - var5) ^ var5) ^ var5) ^ var5) >>> 9) + var5) - 2152) + var5) ^ var5) + 7003));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void Iillllilll(String s) {
      if (Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1724.method_7353(class_2561.method_43470(IliIlllilIi<invokedynamic>() + s), false);
      }

   }
}
