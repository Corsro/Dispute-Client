package gg.corz.injector.bootstrap;

import com.corz.client.qvm.Runtime;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public final class PayloadBootstrap {
   private static boolean initialized;
   private static String launchKey;
   private static String ticket;
   private static boolean payloadAuthorized;
   private static String payloadHash;

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      return (CallSite)Runtime.run(-2504475494105407650L, 58130355, new Object[]{var0, var1, var2, var3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      return (CallSite)Runtime.run(1043413445735908660L, -1385352198, new Object[]{var0, var1, var2, var3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
   }

   private PayloadBootstrap() {
      Runtime.run(-6782897435431839320L, 398886376, new Object[]{this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
   }

   public static synchronized void initializeFromProperties() {
      Runtime.run(-5406457770471979937L, 1324825584, new Object[18]);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      return (CallSite)Runtime.run(-8504979845531530149L, 1306434911, new Object[]{var0, var1, var2, var3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      return (CallSite)Runtime.run(-1151402243582481455L, 277837956, new Object[]{var0, var1, var2, var3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      return (CallSite)Runtime.run(-7931399692173506831L, -632654326, new Object[]{var0, var1, var2, var3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      return (CallSite)Runtime.run(8019696558103643018L, 982535852, new Object[]{var0, var1, var2, var3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
   }

   public static synchronized void authorizePayload() {
      Runtime.run(-4914338643098637265L, 1486753247, new Object[15]);
   }

   static {
      Runtime.loadVm(PayloadBootstrap.class, MethodHandles.lookup());
   }
}
