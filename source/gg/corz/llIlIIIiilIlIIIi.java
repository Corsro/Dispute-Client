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
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2960;

public final class llIlIIIiilIlIIIi {
   private static final Map<String, liIlIliiIlIl> IIilIIliil = new HashMap();
   private static final Map<String, liIlIliiIlIl> lillIIliil = new LinkedHashMap();
   private static final List<liIlIliiIlIl> iillIIliil = new ArrayList();
   public static final boolean IlllIIliil = false;
   public static final class_2960 illlIIliil = class_2960.method_60655(IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>());
   public static final List<liIlIliiIlIl> IillIIliil = List.of(liIlIliiIlIl.iliIiiliiiii(IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>()), liIlIliiIlIl.IIIllIIliIIl(IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>()).Ililllililil(), liIlIliiIlIl.Iilllilliill(IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>()), liIlIliiIlIl.Iilllilliill(IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>()).IIillIiliIil(IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>()), liIlIliiIlIl.IlIlllIlilIl(IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>()), liIlIliiIlIl.IlIlllIlilIl(IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>()).Ililllililil(), liIlIliiIlIl.Illlllllilll(IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>()).Ililllililil(), liIlIliiIlIl.IlIlllIlilIl(IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>()), liIlIliiIlIl.IIlllIlliIll(IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>()).Ililllililil(), liIlIliiIlIl.Illlllllilll(IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>()), liIlIliiIlIl.Illlllllilll(IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>()), liIlIliiIlIl.IlIlllIlilIl(IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>()), liIlIliiIlIl.IlIlllIlilIl(IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>()), liIlIliiIlIl.IiIlliIliiIl(IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>(), IIillIiliIil<invokedynamic>()));
   public static final String llllIIliil = "BOT-00";

   public static List<ilIllIiIll> IlIlllIlilIl(List<ilIllIiIll> mods) {
      ArrayList var1 = new ArrayList(mods);
      var1.sort(Comparator.comparingInt((m) -> ilIIlilIiIIlil.IiIlliIliiIl(m) ? 0 : 1).thenComparingInt(ilIIlilIiIIlil::Iilllilliill));
      return var1;
   }

   private llIlIIIiilIlIIIi() {
   }

   public static liIlIliiIlIl IIIllIIliIIl(ilIllIiIll m) {
      illIIlIiIilIIlIi var1 = ilIIlilIiIIlil.IiIlliIliiIl(m) ? illIIlIiIilIIlIi.lIIliiiiil : illIIlIiIilIIlIi.iIIliiiiil;
      return new liIlIliiIlIl(iIlIlllllill(m), var1, (String)null, IIillIiliIil<invokedynamic>(), "", illlIIliil, illlIIliil, (class_2960)null, (class_2960)null, (class_2960)null, (class_2960)null, false, (class_2960)null, (class_2960)null, false, false, false, iliIIIIiIiiIIIIi.llIIIIliil);
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) << 8 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) >>> 8) ^ '\uf027') + '\ue474') - var5) ^ '\uf389') >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) << 8 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) >>> 8) ^ '\uf027') + '\ue474') - var5) ^ '\uf389') << 2) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) << 8 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) >>> 8) ^ '\uf027') + '\ue474') - var5) ^ '\uf389') >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) << 8 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) >>> 8) ^ '\uf027') + '\ue474') - var5) ^ '\uf389') << 2) << 7) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) << 8 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) >>> 8) ^ '\uf027') + '\ue474') - var5) ^ '\uf389') >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) << 8 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) >>> 8) ^ '\uf027') + '\ue474') - var5) ^ '\uf389') << 2) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) << 8 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) >>> 8) ^ '\uf027') + '\ue474') - var5) ^ '\uf389') >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) << 8 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) >>> 8) ^ '\uf027') + '\ue474') - var5) ^ '\uf389') << 2) << 7) << 10) ^ 12105) >>> 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) << 8 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) >>> 8) ^ '\uf027') + '\ue474') - var5) ^ '\uf389') >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) << 8 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) >>> 8) ^ '\uf027') + '\ue474') - var5) ^ '\uf389') << 2) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) << 8 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) >>> 8) ^ '\uf027') + '\ue474') - var5) ^ '\uf389') >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) << 8 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) >>> 8) ^ '\uf027') + '\ue474') - var5) ^ '\uf389') << 2) << 7) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) << 8 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) >>> 8) ^ '\uf027') + '\ue474') - var5) ^ '\uf389') >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) << 8 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) >>> 8) ^ '\uf027') + '\ue474') - var5) ^ '\uf389') << 2) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) << 8 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) >>> 8) ^ '\uf027') + '\ue474') - var5) ^ '\uf389') >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) << 8 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) >>> 8 | (char)((char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) << 5 | (char)((char)(~((char)(-var4[var5]))) << 8 | (char)(~((char)(-var4[var5]))) >>> 8) >>> 11) << 8) - var5) - 6829) >>> 8) ^ '\uf027') + '\ue474') - var5) ^ '\uf389') << 2) << 7) << 10) ^ 12105) << 9));
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
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) >>> 15 | (char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) << 1) - '\uf8ae') >>> 5 | (char)((char)((char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) >>> 15 | (char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) << 1) - '\uf8ae') << 11))) + 6008) - 15892) - '脈') + var5))) ^ '껑') << 10 | (char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) >>> 15 | (char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) << 1) - '\uf8ae') >>> 5 | (char)((char)((char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) >>> 15 | (char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) << 1) - '\uf8ae') << 11))) + 6008) - 15892) - '脈') + var5))) ^ '껑') >>> 6) << 1 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) >>> 15 | (char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) << 1) - '\uf8ae') >>> 5 | (char)((char)((char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) >>> 15 | (char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) << 1) - '\uf8ae') << 11))) + 6008) - 15892) - '脈') + var5))) ^ '껑') << 10 | (char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) >>> 15 | (char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) << 1) - '\uf8ae') >>> 5 | (char)((char)((char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) >>> 15 | (char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) << 1) - '\uf8ae') << 11))) + 6008) - 15892) - '脈') + var5))) ^ '껑') >>> 6) >>> 15) << 15 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) >>> 15 | (char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) << 1) - '\uf8ae') >>> 5 | (char)((char)((char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) >>> 15 | (char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) << 1) - '\uf8ae') << 11))) + 6008) - 15892) - '脈') + var5))) ^ '껑') << 10 | (char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) >>> 15 | (char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) << 1) - '\uf8ae') >>> 5 | (char)((char)((char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) >>> 15 | (char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) << 1) - '\uf8ae') << 11))) + 6008) - 15892) - '脈') + var5))) ^ '껑') >>> 6) << 1 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) >>> 15 | (char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) << 1) - '\uf8ae') >>> 5 | (char)((char)((char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) >>> 15 | (char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) << 1) - '\uf8ae') << 11))) + 6008) - 15892) - '脈') + var5))) ^ '껑') << 10 | (char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) >>> 15 | (char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) << 1) - '\uf8ae') >>> 5 | (char)((char)((char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) >>> 15 | (char)((char)((char)(var4[var5] ^ '霄') + 17279) >>> 4 | (char)((char)(var4[var5] ^ '霄') + 17279) << 12) << 1) - '\uf8ae') << 11))) + 6008) - 15892) - '脈') + var5))) ^ '껑') >>> 6) >>> 15) >>> 1))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-var4[var5]) << 10 | (char)(-var4[var5]) >>> 6) - 21251))) - '씋') + var5) - 11198) - '﹘') - '齴') + 20815));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static {
      for(liIlIliiIlIl var1 : IillIIliil) {
         lillIIliil.put(var1.Iiilliiliiil(), var1);
         if (var1.iiIIlIIlIl()) {
            iillIIliil.add(var1);
         }
      }

   }

   public static List<liIlIliiIlIl> liiiIIllIl() {
      return List.copyOf(iillIIliil);
   }

   public static llIiliilIili IIlllIlliIll(List<ilIllIiIll> mods) {
      return Illlllllilll(mods, IiIlliIliiIl());
   }

   public static boolean lIiiIiIlilli(ilIllIiIll m) {
      liIlIliiIlIl var1 = (liIlIliiIlIl)lillIIliil.get(iIlIlllllill(m));
      return var1 != null && !var1.iiIIlIIlIl();
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) << 13 | (char)(var4[var5] - var5) >>> 3) << 11 | (char)((char)(var4[var5] - var5) << 13 | (char)(var4[var5] - var5) >>> 3) >>> 5))) << 4 | (char)(-((char)((char)((char)(var4[var5] - var5) << 13 | (char)(var4[var5] - var5) >>> 3) << 11 | (char)((char)(var4[var5] - var5) << 13 | (char)(var4[var5] - var5) >>> 3) >>> 5))) >>> 12) + '\ud8a6'))) ^ '닍'))) - var5) - var5) - '鯻') + 21110) - var5) + '鵶') + '\uf506') << 4 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) << 13 | (char)(var4[var5] - var5) >>> 3) << 11 | (char)((char)(var4[var5] - var5) << 13 | (char)(var4[var5] - var5) >>> 3) >>> 5))) << 4 | (char)(-((char)((char)((char)(var4[var5] - var5) << 13 | (char)(var4[var5] - var5) >>> 3) << 11 | (char)((char)(var4[var5] - var5) << 13 | (char)(var4[var5] - var5) >>> 3) >>> 5))) >>> 12) + '\ud8a6'))) ^ '닍'))) - var5) - var5) - '鯻') + 21110) - var5) + '鵶') + '\uf506') >>> 12))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5])) << 9 | (char)((char)(~var4[var5])) >>> 7) + var5))) + var5) + var5) >>> 8 | (char)((char)((char)(~((char)((char)((char)((char)(~var4[var5])) << 9 | (char)((char)(~var4[var5])) >>> 7) + var5))) + var5) + var5) << 8))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static liIlIliiIlIl IilliliilIIi(String id) {
      return id == null ? null : (liIlIliiIlIl)lillIIliil.get(id);
   }

   public static boolean IiIlliIliiIl() {
      return false;
   }

   public static String iIlIlllllill(ilIllIiIll m) {
      return m.lIiiIiIlilli();
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 8830807423229375959L ^ Long.rotateLeft(4151214963795828467L, 42) ^ 3338342619282649825L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 2891384031735917180L ^ Long.rotateLeft(-2205092554339519551L, 7) ^ -2300719638871093576L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 529581517841563991L ^ Long.rotateLeft(-8992424740957746964L, 24) ^ 782401392635806000L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 1952737119576189068L ^ Long.rotateLeft(-1286602664386076627L, 11) ^ 3810545963459971408L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 7522972110941318847L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -5077232710462055775L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7551838368931192457L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2969017606407721464L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 7775881511596185579L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -3004741881851027488L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IlIillIiilIi<invokedynamic>());
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

   public static llIiliilIili Illlllllilll(List<ilIllIiIll> withPlanned, boolean mods) {
      long var9 = 4170486916129193887L;
      List var2 = IlIlllIlilIl(withPlanned);
      ArrayList var3 = new ArrayList();
      HashSet var4 = new HashSet();
      var9 ^= (0L ^ var9) & -1L << 32;
      var9 ^= (0L ^ var9) & -1L >>> 32;

      for(ilIllIiIll var8 : var2) {
         var4.add(iIlIlllllill(var8));
         if (iliIiiliiiii(var8).IIIilIIiiIIi() == illIIlIiIilIIlIi.lIIliiiiil) {
            var3.add(new iIillIlIlillIl(iliIiiliiiii(var8), var8));
            var9 += 4294967296L;
         }
      }

      if (mods) {
         for(liIlIliiIlIl var13 : iillIIliil) {
            if (!var4.contains(var13.Iiilliiliiil())) {
               var3.add(new iIillIlIlillIl(var13, (ilIllIiIll)null));
               var9 += 4294967296L;
            }
         }
      }

      for(ilIllIiIll var14 : var2) {
         if (iliIiiliiiii(var14).IIIilIIiiIIi() != illIIlIiIilIIlIi.lIIliiiiil) {
            var3.add(new iIillIlIlillIl(iliIiiliiiii(var14), var14));
            var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32;
         }
      }

      return new llIiliilIili(List.copyOf(var3), (int)(var9 >>> 32), (int)var9);
   }

   public static liIlIliiIlIl iliIiiliiiii(ilIllIiIll m) {
      String var1 = iIlIlllllill(m);
      liIlIliiIlIl var2 = (liIlIliiIlIl)lillIIliil.get(var1);
      if (var2 != null && !var2.iiIIlIIlIl()) {
         return var2;
      } else {
         liIlIliiIlIl var3 = (liIlIliiIlIl)IIilIIliil.get(var1);
         if (var3 == null) {
            var3 = IIIllIIliIIl(m);
            IIilIIliil.put(var1, var3);
         }

         return var3;
      }
   }

   public static List<liIlIliiIlIl> IliIlllilIi() {
      return IillIIliil;
   }
}
