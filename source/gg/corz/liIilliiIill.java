package gg.corz;

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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.IntPredicate;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class liIilliiIill {
   private int ilIlilIiIiIlilIi = -1;
   private lIIiiiIiiIIiiiIi llllilIiilllilIi;
   private int lIililIiiIililIi;
   private static final String[] iIiIilIiIliIilIi = new String[]{lilIliilIl<invokedynamic>(), lilIliilIl<invokedynamic>(), lilIliilIl<invokedynamic>(), lilIliilIl<invokedynamic>(), lilIliilIl<invokedynamic>(), lilIliilIl<invokedynamic>()};
   private int lIIlilIiiIIlilIi;
   private int iIllilIiIlllilIi;
   private final Set<Integer> IiiIilIiliiIilIi;
   private int IlililIillililIi;
   private int IillilIilillilIi;
   private static final int[] lilIilIiiilIilIi = new int[]{-1, 1, 0, 0, 0, 0};
   private int liIlilIiiiIlilIi = -1;
   private static final int[] IllIilIilllIilIi = new int[]{1, 0, 3, 2, 5, 4};
   private int iillilIiIIililIi;
   private static final int[] illIilIiIilIilIi = new int[]{0, 0, 0, 0, -1, 1};
   private int IIllilIilIllilIi = -1;
   private static final int[] IIiIilIilIiIilIi = new int[]{0, 0, -1, 1, 0, 0};
   private int IlIlilIillIlilIi = -1;
   private final Set<Integer> iiiIilIiIIIlilIi = new TreeSet();
   private final long lliIilIiiliIilIi;
   public static final int ilililIiIiililIi = 2;

   public void Illillliilli(int tick, int face) {
      this.liIlilIiiiIlilIi = tick;
      this.IIllilIilIllilIi = face;
      this.llllilIiilllilIi = lIIiiiIiiIIiiiIi.ilIilIIlIi;
      this.Iilllilliill(tick, face);
   }

   public void IilliliilIIi(Set<Integer> presentFaces) {
      this.iiiIilIiIIIlilIi.clear();
      if (presentFaces != null) {
         for(Integer var3 : presentFaces) {
            if (var3 != null && var3 >= 0 && var3 < 6) {
               this.iiiIilIiIIIlilIi.add(var3);
            }
         }
      }

   }

   public int IIIIllIIIl() {
      return this.IillilIilillilIi;
   }

   public liIilliiIill(long wantedFaces, Set<Integer> target) {
      this.llllilIiilllilIi = lIIiiiIiiIIiiiIi.llIilIIlIi;
      this.IlililIillililIi = -1;
      this.lliIilIiiliIilIi = wantedFaces;
      TreeSet var4 = new TreeSet();
      if (target != null) {
         for(Integer var6 : target) {
            if (var6 != null && var6 >= 0 && var6 < 6) {
               var4.add(var6);
            }
         }
      }

      this.IiiIilIiliiIilIi = Collections.unmodifiableSet(var4);
   }

   public int Iiiiliiiiiii() {
      return this.IlililIillililIi;
   }

   public int Illlllllilll() {
      return this.lIIlilIiiIIlilIi;
   }

   public void lIlIliIlIl(Set<Integer> predicted, Set<Integer> authoritative, int tick) {
      this.IilliliilIIi(predicted);
      if (this.liIlilIiiiIlilIi >= 0 && authoritative != null && authoritative.contains(this.liIlilIiiiIlilIi)) {
         this.llllilIiilllilIi = lIIiiiIiiIIiiiIi.IiIilIIlIi;
         ++this.IillilIilillilIi;
         this.IlililIillililIi = this.IIllilIilIllilIi < 0 ? -1 : tick - this.IIllilIilIllilIi;
         this.liIlilIiiiIlilIi = -1;
         this.IIllilIilIllilIi = -1;
         this.iIllilIiIlllilIi = 0;
      }

   }

   // $FF: synthetic method
   private static CallSite IiiIlliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ 19531) - '깧') >>> 10 | (char)((char)(var4[var5] ^ 19531) - '깧') << 6) + var5))) ^ var5) + 22363) ^ var5) + 20997) << 14 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ 19531) - '깧') >>> 10 | (char)((char)(var4[var5] ^ 19531) - '깧') << 6) + var5))) ^ var5) + 22363) ^ var5) + 20997) >>> 2))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void Iilllilliill(int tick, int face) {
      ++this.lIIlilIiiIIlilIi;
      this.ilIlilIiIiIlilIi = tick;
      this.IlIlilIillIlilIi = face;
   }

   public boolean IIlilIliiIli() {
      return this.iIllilIiIlllilIi > 2;
   }

   public lIIiiiIiiIIiiiIi Iliilliiilii() {
      return this.llllilIiilllilIi;
   }

   public Set<Integer> iIlIlllllill() {
      return Collections.unmodifiableSet(this.iiiIilIiIIIlilIi);
   }

   // $FF: synthetic method
   private static CallSite iiiIlIIIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) << 11 | (char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) >>> 5) >>> 2 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) << 11 | (char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) >>> 5) << 14) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) << 11 | (char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) >>> 5) >>> 2 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) << 11 | (char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) >>> 5) << 14) >>> 11) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) << 11 | (char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) >>> 5) >>> 2 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) << 11 | (char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) >>> 5) << 14) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) << 11 | (char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) >>> 5) >>> 2 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) << 11 | (char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) >>> 5) << 14) >>> 11) << 8) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) << 11 | (char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) >>> 5) >>> 2 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) << 11 | (char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) >>> 5) << 14) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) << 11 | (char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) >>> 5) >>> 2 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) << 11 | (char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) >>> 5) << 14) >>> 11) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) << 11 | (char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) >>> 5) >>> 2 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) << 11 | (char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) >>> 5) << 14) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) << 11 | (char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) >>> 5) >>> 2 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) << 11 | (char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) >>> 2 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) >>> 9 | (char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) << 7) << 14) ^ var5) - 16342) >>> 5) << 14) >>> 11) << 8) << 15))) + var5) ^ var5) - var5) ^ 46) - 17016) + 17748) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lliIliliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 7 | var4[var5] << 9))) - var5) ^ 14597) ^ var5) + var5) ^ var5))) >>> 13 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 7 | var4[var5] << 9))) - var5) ^ 14597) ^ var5) + var5) ^ var5))) << 3) ^ var5) + var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean Iilililiiili() {
      return this.liIlilIiiiIlilIi >= 0;
   }

   public List<Integer> IIIllIIliIIl() {
      ArrayList var1 = new ArrayList();

      for(Integer var3 : this.IiiIilIiliiIilIi) {
         if (!this.iiiIilIiIIIlilIi.contains(var3)) {
            var1.add(var3);
         }
      }

      return var1;
   }

   // $FF: synthetic method
   private static CallSite lilIliilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -3692836002989732082L ^ Long.rotateLeft(426393080094557898L, 34) ^ -43489430962918848L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 5262597082333481736L ^ Long.rotateLeft(3021317436566040390L, 45) ^ -1720469965070340595L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -6576902126758260316L ^ Long.rotateLeft(-7933101069620374237L, 48) ^ -9030810746971858662L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 6148882354610410073L ^ Long.rotateLeft(-2249295147071200042L, 51) ^ 1497801382061128398L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3590661392035260391L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -4615567776084248470L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -5556165942921867611L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1809578698904046241L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6341960406699702479L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4549696785388389147L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIiIllIiIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iIiIlIliIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, lliIliliIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IiiIlliiIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iiiIlIIIll<invokedynamic>());
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

   public static Set<Integer> IlIillIiilIi(Map<String, String> props) {
      long var4 = -2363616345658954489L;
      TreeSet var1 = new TreeSet();
      if (props == null) {
         return var1;
      } else {
         for(long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < 6; var6 += 4294967296L) {
            String var3 = (String)props.get(iIiIilIiIliIilIi[(int)(var6 >>> 32)]);
            if (var3 != null && var3.trim().equalsIgnoreCase(lilIliilIl<invokedynamic>())) {
               var1.add((int)(var6 >>> 32));
            }
         }

         return var1;
      }
   }

   // $FF: synthetic method
   private static CallSite iIiIlIliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) >>> 14 | (char)(var4[var5] >>> 3 | var4[var5] << 13) << 2) ^ var5))) - var5) ^ var5) ^ var5) - var5))) - var5) + var5) << 10 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) >>> 14 | (char)(var4[var5] >>> 3 | var4[var5] << 13) << 2) ^ var5))) - var5) ^ var5) ^ var5) - var5))) - var5) + var5) >>> 6))) + 'ﭸ') >>> 1 | (char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) >>> 14 | (char)(var4[var5] >>> 3 | var4[var5] << 13) << 2) ^ var5))) - var5) ^ var5) ^ var5) - var5))) - var5) + var5) << 10 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) >>> 14 | (char)(var4[var5] >>> 3 | var4[var5] << 13) << 2) ^ var5))) - var5) ^ var5) ^ var5) - var5))) - var5) + var5) >>> 6))) + 'ﭸ') << 15));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IllIllllIl() {
      this.liIlilIiiiIlilIi = -1;
      this.IIllilIilIllilIi = -1;
      this.iIllilIiIlllilIi = 0;
      this.llllilIiilllilIi = lIIiiiIiiIIiiiIi.llIilIIlIi;
   }

   public int IIiilIiiiIii() {
      return this.liIlilIiiiIlilIi;
   }

   public int IIillIiliIil() {
      return this.IlIlilIillIlilIi;
   }

   public void iiIIlIIlIl(Set<Integer> presentFaces, int tick) {
      this.lIlIliIlIl(presentFaces, presentFaces, tick);
   }

   public static long Iiilliiliiil(long cell, int face) {
      return llIiIiililIiIiil.IIIllIIliIIl(llIiIiililIiIiil.IiIlliIliiIl(cell) + illIilIiIilIilIi[face], llIiIiililIiIiil.IIlllIlliIll(cell) + lilIilIiiilIilIi[face], llIiIiililIiIiil.Illlllllilll(cell) + IIiIilIilIiIilIi[face]);
   }

   public int IiIIlliIIl() {
      return this.iIllilIiIlllilIi;
   }

   public boolean lIiiIiIlilli() {
      return this.iiiIilIiIIIlilIi.equals(this.IiiIilIiliiIilIi);
   }

   public lIIllliliIIlllil IlIlllIlilIl(IntPredicate supportSolid) {
      for(Integer var3 : this.IIIllIIliIIl()) {
         if (supportSolid == null || supportSolid.test(var3)) {
            return new lIIllliliIIlllil(var3, Iiilliiliiil(this.lliIilIiiliIilIi, var3), IIIilIIiiIIi(var3));
         }
      }

      return null;
   }

   public boolean iliIiiliiiii() {
      for(Integer var2 : this.iiiIilIiIIIlilIi) {
         if (!this.IiiIilIiliiIilIi.contains(var2)) {
            return true;
         }
      }

      return false;
   }

   public Set<Integer> liiiIIllIl() {
      return this.IiiIilIiliiIilIi;
   }

   public int llIIlilIIl() {
      return this.lIililIiiIililIi;
   }

   public String illIlIilIl() {
      return String.format(Locale.ROOT, lilIliilIl<invokedynamic>(), this.lliIilIiiliIilIi, this.IiiIilIiliiIilIi, this.iiiIilIiIIIlilIi, this.IIIllIIliIIl(), this.lIiiIiIlilli(), this.lIIlilIiiIIlilIi, this.llllilIiilllilIi, this.liIlilIiiiIlilIi, this.IillilIilillilIi, this.iillilIiIIililIi, this.lIililIiiIililIi, this.iIllilIiIlllilIi, this.IlililIillililIi);
   }

   public Set<Long> IIlllIlliIll(IntPredicate supportSolid) {
      LinkedHashSet var2 = new LinkedHashSet();

      for(Integer var4 : this.IiIlliIliiIl(supportSolid)) {
         var2.add(Iiilliiliiil(this.lliIilIiiliIilIi, var4));
      }

      return var2;
   }

   public static int IIIilIIiiIIi(int face) {
      return IllIilIilllIilIi[face];
   }

   // $FF: synthetic method
   private static CallSite IIiIllIiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(~((char)(-((char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)(-((char)(-var4[var5]))))) << 8 | (char)(~((char)(-((char)(-var4[var5]))))) >>> 8) - 16737) - var5))))) - var5) >>> 7 | (char)((char)(~((char)(~((char)((char)((char)((char)(~((char)(-((char)(-var4[var5]))))) << 8 | (char)(~((char)(-((char)(-var4[var5]))))) >>> 8) - 16737) - var5))))) - var5) << 9))))))) << 11 | (char)(~((char)(~((char)(-((char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)(-((char)(-var4[var5]))))) << 8 | (char)(~((char)(-((char)(-var4[var5]))))) >>> 8) - 16737) - var5))))) - var5) >>> 7 | (char)((char)(~((char)(~((char)((char)((char)((char)(~((char)(-((char)(-var4[var5]))))) << 8 | (char)(~((char)(-((char)(-var4[var5]))))) >>> 8) - 16737) - var5))))) - var5) << 9))))))) >>> 5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public List<Integer> IiIlliIliiIl(IntPredicate supportSolid) {
      ArrayList var2 = new ArrayList();
      if (supportSolid == null) {
         return var2;
      } else {
         for(Integer var4 : this.IIIllIIliIIl()) {
            if (!supportSolid.test(var4)) {
               var2.add(var4);
            }
         }

         return var2;
      }
   }

   public long IliIlllilIi() {
      return this.lliIilIiiliIilIi;
   }

   public int Ililllililil() {
      return this.ilIlilIiIiIlilIi;
   }

   public boolean IiIiliIiiiIi(int timeoutTicks, int tick, int face) {
      if (timeoutTicks >= 0 && timeoutTicks < 6 && this.iiiIilIiIIIlilIi.contains(timeoutTicks)) {
         ++this.lIililIiiIililIi;
         return false;
      } else {
         if (this.liIlilIiiiIlilIi >= 0) {
            if (tick - this.IIllilIilIllilIi < Math.max(1, face)) {
               ++this.lIililIiiIililIi;
               return false;
            }

            this.llllilIiilllilIi = lIIiiiIiiIIiiiIi.liIilIIlIi;
            ++this.iillilIiIIililIi;
            ++this.iIllilIiIlllilIi;
            this.liIlilIiiiIlilIi = -1;
            this.IIllilIilIllilIi = -1;
         }

         return this.iIllilIiIlllilIi <= 2;
      }
   }

   public int iIIIlIlIIl() {
      return this.iillilIiIIililIi;
   }
}
