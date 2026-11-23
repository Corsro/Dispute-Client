package gg.corz;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_2960;
import net.minecraft.class_310;

public final class lIlIIiliIlIIil {
   private static final float IllllilIilllllilIi = 2.0F;
   private static final class_2960 iillIilIiIIilIilIi = class_2960.method_60655(lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>());
   private static boolean IiiiIilIiliiiIilIi;
   private static final class_2960 IIIiIilIilIIiIilIi = class_2960.method_60655(lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>());
   private static boolean iIiiIilIiIliiIilIi;
   private static final float lIlIIilIiiIlIIilIi = 4.608F;
   private static final Map<String, class_2960> iliIlilIiIiiIlilIi = new HashMap();
   private static final float llIllilIiilIllilIi = 1.5F;
   private static boolean ilIIlilIiIiIIlilIi;
   private static boolean iiIiIilIiIIliIilIi;
   private static boolean iiiiIilIiIIIIlilIi;
   private static final class_2960 IlIlIilIillIlIilIi = class_2960.method_60655(lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>());
   private static boolean IlIIlilIillIIlilIi;
   private static final class_2960 IillIilIilillIilIi = class_2960.method_60655(lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>());
   private static final class_2960 liilIilIiiiilIilIi = class_2960.method_60655(lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>());
   private static boolean IIlIlilIilIlIlilIi;
   private static final Map<String, class_2960> IiIllilIiliIllilIi = new HashMap();
   private static final class_2960 illIIilIiIilIIilIi = class_2960.method_60655(lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>());
   private static final class_2960 iIiIIilIiIliIIilIi = class_2960.method_60655(lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>());
   private static boolean iIlIlilIiIllIlilIi;
   private static boolean liIIlilIiiiIIlilIi;
   private static final class_2960 IIiIIilIilIiIIilIi = class_2960.method_60655(lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>());
   private static final class_2960 lilIIilIiiilIIilIi = class_2960.method_60655(lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>());
   private static final class_2960 IllIIilIilllIIilIi = class_2960.method_60655(lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>());
   private static final class_2960 IiiIIilIiliiIIilIi = class_2960.method_60655(lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>());
   private static final float iIIllilIiIlIllilIi = 16.0F;
   private static final class_2960 lliIIilIiiliIIilIi = class_2960.method_60655(lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>());
   private static final float iiIIIilIiIIlIIilIi = 7.36F;
   private static final float lIlllilIiiIlllilIi = 24.0F;
   private static final class_2960 iIllIilIiIlllIilIi = class_2960.method_60655(lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>());
   private static final int IIIllilIilIIllilIi = 48;
   private static boolean lIIIlilIiiIIIlilIi;
   private static final class_2960 ililIilIiIiilIilIi = class_2960.method_60655(lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>());
   private static boolean liliIilIiiiliIilIi;
   private static boolean IliIlilIilliIlilIi;
   private static boolean IIiiIilIilIiiIilIi;
   private static final class_2960 IlilIilIillilIilIi = class_2960.method_60655(lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>());
   private static boolean lIliIilIiiIliIilIi;
   private static final class_2960 lIilIilIiiIilIilIi = class_2960.method_60655(lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>());
   private static final class_2960 llllIilIiilllIilIi = class_2960.method_60655(lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>());
   private static boolean llIiIilIiilIiIilIi;
   private static boolean lliiIilIiiliiIilIi;
   private static final class_2960 lIiIlilIiiIiIlilIi = class_2960.method_60655(lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>());
   private static boolean IilIlilIililIlilIi;
   private static final Map<String, class_2960> illllilIiIilllilIi = new HashMap();
   private static boolean lllIlilIiillIlilIi;
   private static final int iiIllilIiIIlllilIi = 96;
   private static boolean iIIiIilIiIlIiIilIi;
   private static final Map<String, class_2960> liiIlilIiiiiIlilIi = new HashMap();
   private static final int IiIIIilIiliIIIilIi = 64;
   private static final class_2960 lIIlIilIiiIIlIilIi = class_2960.method_60655(lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>());
   private static final class_2960 iiiIIilIiIIIlIilIi = class_2960.method_60655(lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>());
   private static boolean iilIlilIiIIiIlilIi;
   private static final class_2960 ilIlIilIiIiIlIilIi = class_2960.method_60655(lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>());
   private static boolean IlliIilIillliIilIi;
   private static final class_2960 IIllIilIilIllIilIi = class_2960.method_60655(lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>());
   private static final class_2960 liIlIilIiiiIlIilIi = class_2960.method_60655(lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>());
   private static boolean IiIiIilIiliIiIilIi;
   private static boolean illiIilIiIiliIilIi;

   private static boolean lIlIliIlIl(class_2960 id, String paint, lilIIiIliilIIiIl strokeW, float label) {
      long var9 = -591567816280792367L;

      try {
         BufferedImage var4 = new BufferedImage(64, 64, 2);
         Graphics2D var5 = var4.createGraphics();
         var5.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         var5.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
         var5.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
         var5.setColor(Color.WHITE);
         if (label > 0.0F) {
            var5.setStroke(new BasicStroke(label, 1, 1));
         }

         strokeW.paint(var5);
         var5.dispose();
         class_1011 var6 = new class_1011(64, 64, false);
         int[] var7 = var4.getRGB(0, 0, 64, 64, (int[])null, 0, 64);

         for(long var12 = var9 ^ (0L ^ var9) & -1L << 32; (int)(var12 >>> 32) < var7.length; var12 += 4294967296L) {
            var6.method_61941((int)(var12 >>> 32) % 64, (int)(var12 >>> 32) / 64, var7[(int)(var12 >>> 32)]);
         }

         class_1043 var8 = new class_1043(() -> paint, var6);
         class_310.method_1551().method_1531().method_4616(id, var8);
         return true;
      } catch (Throwable var11) {
         return false;
      }
   }

   private static double IlIllllIll(String pos, int[] d) {
      long var8 = 8833180110201308740L;
      long var10 = 8699452615713629224L;
      long var12 = -1983293660516861024L;
      lIIlliIIll(pos, d);
      var8 ^= ((long)pos.length() << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)d[0] ^ var8) & -1L >>> 32;
      var10 ^= ((long)((int)var8) << 32 ^ var10) & -1L << 32;
      if ((int)(var10 >>> 32) < (int)(var8 >>> 32) && (pos.charAt((int)(var10 >>> 32)) == '-' || pos.charAt((int)(var10 >>> 32)) == '+')) {
         var10 += 4294967296L;
      }

      var10 ^= (0L ^ var10) & -1L >>> 32;
      var12 ^= (0L ^ var12) & -1L << 32;

      while((int)(var10 >>> 32) < (int)(var8 >>> 32)) {
         var12 ^= ((long)pos.charAt((int)(var10 >>> 32)) ^ var12) & -1L >>> 32;
         if ((int)var12 >= 48 && (int)var12 <= 57) {
            var12 ^= (4294967296L ^ var12) & -1L << 32;
            var10 += 4294967296L;
         } else {
            if ((int)var12 != 46 || (int)var10 != 0) {
               break;
            }

            var10 ^= (1L ^ var10) & -1L >>> 32;
            var10 += 4294967296L;
         }
      }

      if ((int)(var12 >>> 32) != 0 && (int)(var10 >>> 32) < (int)(var8 >>> 32) && (pos.charAt((int)(var10 >>> 32)) == 'e' || pos.charAt((int)(var10 >>> 32)) == 'E')) {
         var12 ^= ((long)((int)(var10 >>> 32) + 1) ^ var12) & -1L >>> 32;
         if ((int)var12 < (int)(var8 >>> 32) && (pos.charAt((int)var12) == '-' || pos.charAt((int)var12) == '+')) {
            var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32;
         }

         if ((int)var12 < (int)(var8 >>> 32) && Character.isDigit(pos.charAt((int)var12))) {
            for(var10 ^= ((long)((int)var12) << 32 ^ var10) & -1L << 32; (int)(var10 >>> 32) < (int)(var8 >>> 32) && Character.isDigit(pos.charAt((int)(var10 >>> 32))); var10 += 4294967296L) {
            }
         }
      }

      if ((int)(var12 >>> 32) == 0) {
         throw new IllegalArgumentException(lIIlIliIIlIl<invokedynamic>() + (int)var8);
      } else {
         d[0] = (int)(var10 >>> 32);
         return Double.parseDouble(pos.substring((int)var8, (int)(var10 >>> 32)));
      }
   }

   private static boolean llIIlilIIl(class_2960 label, String paint, lilIIiIliilIIiIl id) {
      return lIlIliIlIl(label, paint, id, 7.36F);
   }

   public static class_2960 IiiIlliiIl(String name) {
      long var6 = 3564065926887522766L;
      class_2960 var1 = (class_2960)illllilIiIilllilIi.get(name);
      if (var1 != null) {
         return var1;
      } else {
         class_2960 var2 = class_2960.method_60655(lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>() + name.replace('-', '_'));
         var6 ^= (-4294967296L ^ var6) & -1L << 32;
         switch (name.hashCode()) {
            case -1695069083:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (68719476736L ^ var6) & -1L << 32;
               }
               break;
            case -1249503706:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (21474836480L ^ var6) & -1L << 32;
               }
               break;
            case -1109732030:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (64424509440L ^ var6) & -1L << 32;
               }
               break;
            case -889296362:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (73014444032L ^ var6) & -1L << 32;
               }
               break;
            case -807062458:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (30064771072L ^ var6) & -1L << 32;
               }
               break;
            case -734622710:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (55834574848L ^ var6) & -1L << 32;
               }
               break;
            case -620676243:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (38654705664L ^ var6) & -1L << 32;
               }
               break;
            case -79909723:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (60129542144L ^ var6) & -1L << 32;
               }
               break;
            case 120:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (12884901888L ^ var6) & -1L << 32;
               }
               break;
            case 97735:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (77309411328L ^ var6) & -1L << 32;
               }
               break;
            case 3444122:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (47244640256L ^ var6) & -1L << 32;
               }
               break;
            case 103901296:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (42949672960L ^ var6) & -1L << 32;
               }
               break;
            case 530081012:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (34359738368L ^ var6) & -1L << 32;
               }
               break;
            case 530309209:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (51539607552L ^ var6) & -1L << 32;
               }
               break;
            case 835567012:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (4294967296L ^ var6) & -1L << 32;
               }
               break;
            case 1397962786:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (17179869184L ^ var6) & -1L << 32;
               }
               break;
            case 1640633897:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (25769803776L ^ var6) & -1L << 32;
               }
               break;
            case 1965038601:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (8589934592L ^ var6) & -1L << 32;
               }
               break;
            case 2121767808:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (0L ^ var6) & -1L << 32;
               }
         }

         String[] var10000;
         switch ((int)(var6 >>> 32)) {
            case 0 -> var10000 = new String[]{lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>()};
            case 1 -> var10000 = new String[]{lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>()};
            case 2 -> var10000 = new String[]{lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>()};
            case 3 -> var10000 = new String[]{lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>()};
            case 4 -> var10000 = new String[]{lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>()};
            case 5 -> var10000 = new String[]{lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>()};
            case 6 -> var10000 = new String[]{lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>()};
            case 7 -> var10000 = new String[]{lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>()};
            case 8 -> var10000 = new String[]{lIIlIliIIlIl<invokedynamic>()};
            case 9 -> var10000 = new String[]{lIIlIliIIlIl<invokedynamic>()};
            case 10 -> var10000 = new String[]{lIIlIliIIlIl<invokedynamic>()};
            case 11 -> var10000 = new String[]{lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>()};
            case 12 -> var10000 = new String[]{lIIlIliIIlIl<invokedynamic>()};
            case 13 -> var10000 = new String[]{lIIlIliIIlIl<invokedynamic>()};
            case 14 -> var10000 = new String[]{lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>()};
            case 15 -> var10000 = new String[]{lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>()};
            case 16 -> var10000 = new String[]{lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>()};
            case 17 -> var10000 = new String[]{lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>()};
            case 18 -> var10000 = new String[]{lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>()};
            default -> var10000 = null;
         }

         String[] var3 = var10000;
         if (var3 != null) {
            iIlllIllll(var2, lIIlIliIIlIl<invokedynamic>() + name, 96, 24.0F, 2.0F, (paths) -> {
               long var6 = -4138220904846890770L;
               String[] var2 = var3;
               var6 ^= ((long)var3.length << 32 ^ var6) & -1L << 32;

               for(long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
                  String var5 = var2[(int)var9];
                  paths.draw(iiiIlIIIll(var5));
               }

            });
         }

         illllilIiIilllilIi.put(name, var2);
         return var2;
      }
   }

   public static class_2960 IIlilIliiIli() {
      if (!iIlIlilIiIllIlilIi) {
         iIlIlilIiIllIlilIi = iiIIlIIlIl(IlilIilIillilIilIi, lIIlIliIIlIl<invokedynamic>(), (g) -> {
            GeneralPath var1 = new GeneralPath();
            var1.moveTo(17.92, 25.6);
            var1.lineTo((double)32.0F, 39.68);
            var1.lineTo(46.08, 25.6);
            g.draw(var1);
         });
      }

      return IlilIilIillilIilIi;
   }

   public static class_2960 IlIlllIlilIl() {
      if (!liliIilIiiiliIilIi) {
         liliIilIiiiliIilIi = IiIIlliIIl(iiiIIilIiIIIlIilIi, lIIlIliIIlIl<invokedynamic>(), (g) -> {
            GeneralPath var1 = new GeneralPath();
            var1.moveTo((double)32.0F, 11.52);
            var1.lineTo(47.36, 51.2);
            var1.lineTo((double)32.0F, 40.96);
            var1.lineTo(16.64, 51.2);
            var1.closePath();
            g.fill(var1);
         });
      }

      return iiiIIilIiIIIlIilIi;
   }

   private static void lIIlliIIll(String pos, int[] d) {
      while(d[0] < pos.length() && (Character.isWhitespace(pos.charAt(d[0])) || pos.charAt(d[0]) == ',')) {
         int var10002 = d[0]++;
      }

   }

   private static boolean iiIIlIIlIl(class_2960 paint, String id, lilIIiIliilIIiIl label) {
      return lIlIliIlIl(paint, id, label, 4.608F);
   }

   private static boolean IIllllIlll(class_2960 paint, String label, lilIIiIliilIIiIl id) {
      return iIlllIllll(paint, label, 48, 16.0F, 1.5F, id);
   }

   public static class_2960 Iiilliiliiil() {
      if (!IlIIlilIillIIlilIi) {
         IlIIlilIillIIlilIi = IiIIlliIIl(llllIilIiilllIilIi, lIIlIliIIlIl<invokedynamic>(), (g) -> {
            g.fill(new Ellipse2D.Double(17.92, 35.84, 14.08, 10.88));
            g.fill(new RoundRectangle2D.Double(30.08, 15.36, 3.2, 26.88, 1.28, 1.28));
            GeneralPath var1 = new GeneralPath();
            var1.moveTo(33.28, 15.36);
            var1.lineTo(43.52, 19.84);
            var1.lineTo(43.52, 28.16);
            var1.lineTo(33.28, 23.68);
            var1.closePath();
            g.fill(var1);
         });
      }

      return llllIilIiilllIilIi;
   }

   public static class_2960 illIlIilIl(String name) {
      long var6 = 8031316433233508727L;
      class_2960 var1 = (class_2960)IiIllilIiliIllilIi.get(name);
      if (var1 != null) {
         return var1;
      } else {
         class_2960 var2 = class_2960.method_60655(lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>() + name);
         String var3 = lIIlIliIIlIl<invokedynamic>() + name;
         var6 ^= (-4294967296L ^ var6) & -1L << 32;
         switch (name.hashCode()) {
            case -1618876223:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (64424509440L ^ var6) & -1L << 32;
               }
               break;
            case -991716523:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (42949672960L ^ var6) & -1L << 32;
               }
               break;
            case -905826493:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (17179869184L ^ var6) & -1L << 32;
               }
               break;
            case -903340183:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (34359738368L ^ var6) & -1L << 32;
               }
               break;
            case -902467928:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (12884901888L ^ var6) & -1L << 32;
               }
               break;
            case -880905839:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (38654705664L ^ var6) & -1L << 32;
               }
               break;
            case 110997:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (30064771072L ^ var6) & -1L << 32;
               }
               break;
            case 3064885:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (47244640256L ^ var6) & -1L << 32;
               }
               break;
            case 3443508:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (60129542144L ^ var6) & -1L << 32;
               }
               break;
            case 3649547:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (68719476736L ^ var6) & -1L << 32;
               }
               break;
            case 94627080:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (51539607552L ^ var6) & -1L << 32;
               }
               break;
            case 94755854:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (0L ^ var6) & -1L << 32;
               }
               break;
            case 94935104:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (55834574848L ^ var6) & -1L << 32;
               }
               break;
            case 97513459:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (25769803776L ^ var6) & -1L << 32;
               }
               break;
            case 110364485:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (4294967296L ^ var6) & -1L << 32;
               }
               break;
            case 503739367:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (21474836480L ^ var6) & -1L << 32;
               }
               break;
            case 1236319578:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (8589934592L ^ var6) & -1L << 32;
               }
         }

         switch ((int)(var6 >>> 32)) {
            case 0 -> IIllllIlll(var2, var3, (g) -> {
   iIiIlIliIl(g, (double)7.5F, (double)7.5F, (double)5.0F);
   GeneralPath var1 = new GeneralPath();
   var1.moveTo((double)7.5F, (double)4.5F);
   var1.lineTo((double)7.5F, (double)7.5F);
   var1.lineTo((double)9.5F, (double)9.0F);
   g.draw(var1);
});
            case 1 -> IIllllIlll(var2, var3, (g) -> {
   iIiIlIliIl(g, (double)7.5F, (double)8.5F, (double)4.0F);
   lilIliilIl(g, (double)6.5F, (double)2.5F, (double)8.5F, (double)2.5F);
   lilIliilIl(g, (double)7.5F, (double)8.5F, (double)7.5F, (double)6.5F);
});
            case 2 -> IIllllIlll(var2, var3, (g) -> {
   lliIliliIl(g, (double)2.5F, (double)2.5F, (double)10.0F, (double)7.0F, (double)1.5F);
   lilIliilIl(g, (double)7.5F, (double)9.5F, (double)7.5F, (double)12.5F);
   lilIliilIl(g, (double)5.5F, (double)12.5F, (double)9.5F, (double)12.5F);
});
            case 3 -> IIllllIlll(var2, var3, (g) -> {
   lilIliilIl(g, (double)3.5F, (double)12.5F, (double)3.5F, (double)10.5F);
   lilIliilIl(g, (double)7.5F, (double)12.5F, (double)7.5F, (double)6.5F);
   lilIliilIl(g, (double)11.5F, (double)12.5F, (double)11.5F, (double)2.5F);
});
            case 4 -> IIllllIlll(var2, var3, (g) -> {
   lliIliliIl(g, (double)2.5F, (double)2.5F, (double)11.0F, (double)4.0F, (double)1.25F);
   lliIliliIl(g, (double)2.5F, (double)9.5F, (double)11.0F, (double)4.0F, (double)1.25F);
   IIiIllIiIl(g, (double)5.5F, (double)4.5F, (double)1.5F);
   IIiIllIiIl(g, (double)5.5F, (double)11.5F, (double)1.5F);
});
            case 5 -> IIllllIlll(var2, var3, (g) -> {
   lliIliliIl(g, (double)2.5F, (double)4.5F, (double)10.0F, (double)6.0F, (double)1.5F);
   IIiIllIiIl(g, (double)5.5F, (double)6.5F, (double)1.5F);
   IIiIllIiIl(g, (double)7.5F, (double)6.5F, (double)1.5F);
   IIiIllIiIl(g, (double)9.5F, (double)6.5F, (double)1.5F);
   lilIliilIl(g, (double)5.5F, (double)8.5F, (double)9.5F, (double)8.5F);
});
            case 6 -> IIllllIlll(var2, var3, (g) -> {
   lilIliilIl(g, (double)5.5F, (double)2.5F, (double)10.5F, (double)2.5F);
   GeneralPath var1 = new GeneralPath();
   var1.moveTo((double)6.5F, (double)2.5F);
   var1.lineTo((double)6.5F, (double)6.0F);
   var1.lineTo(3.3, (double)11.0F);
   var1.quadTo(2.4, (double)12.5F, 4.2, (double)12.5F);
   var1.lineTo(11.8, (double)12.5F);
   var1.quadTo(13.6, (double)12.5F, 12.7, (double)11.0F);
   var1.lineTo((double)9.5F, (double)6.0F);
   var1.lineTo((double)9.5F, (double)2.5F);
   g.draw(var1);
   lilIliilIl(g, (double)5.5F, (double)9.5F, (double)10.5F, (double)9.5F);
});
            case 7 -> IIllllIlll(var2, var3, (g) -> {
   GeneralPath var1 = new GeneralPath();
   var1.moveTo((double)7.5F, 12.6);
   var1.curveTo((double)5.5F, 10.9, (double)3.5F, 8.9, (double)3.5F, (double)6.5F);
   var1.curveTo((double)3.5F, 4.29, 5.29, (double)2.5F, (double)7.5F, (double)2.5F);
   var1.curveTo(9.71, (double)2.5F, (double)11.5F, 4.29, (double)11.5F, (double)6.5F);
   var1.curveTo((double)11.5F, 8.9, (double)9.5F, 10.9, (double)7.5F, 12.6);
   var1.closePath();
   g.draw(var1);
   IIiIllIiIl(g, (double)7.5F, (double)6.5F, (double)2.5F);
});
            case 8 -> IIllllIlll(var2, var3, (g) -> {
   GeneralPath var1 = new GeneralPath();
   var1.moveTo((double)7.5F, (double)2.5F);
   var1.lineTo((double)11.5F, (double)4.0F);
   var1.lineTo((double)11.5F, (double)7.5F);
   var1.curveTo((double)11.5F, 10.2, 9.8, 11.8, (double)7.5F, 12.6);
   var1.curveTo(5.2, 11.8, (double)3.5F, 10.2, (double)3.5F, (double)7.5F);
   var1.lineTo((double)3.5F, (double)4.0F);
   var1.closePath();
   g.draw(var1);
});
            case 9 -> IIllllIlll(var2, var3, (g) -> {
   iIiIlIliIl(g, (double)7.5F, (double)7.5F, (double)5.0F);
   IIiIllIiIl(g, (double)7.5F, (double)7.5F, (double)3.0F);
});
            case 10 -> IIllllIlll(var2, var3, (g) -> {
   iIiIlIliIl(g, (double)7.5F, (double)4.5F, (double)2.0F);
   GeneralPath var1 = new GeneralPath();
   var1.moveTo((double)3.5F, (double)12.5F);
   var1.lineTo((double)3.5F, (double)12.0F);
   var1.quadTo((double)3.5F, (double)9.5F, (double)6.0F, (double)9.5F);
   var1.lineTo((double)9.0F, (double)9.5F);
   var1.quadTo((double)11.5F, (double)9.5F, (double)11.5F, (double)12.0F);
   var1.lineTo((double)11.5F, (double)12.5F);
   g.draw(var1);
});
            case 11 -> IIllllIlll(var2, var3, (g) -> {
   GeneralPath var1 = new GeneralPath();
   var1.moveTo((double)7.5F, (double)2.5F);
   var1.lineTo((double)11.5F, (double)4.75F);
   var1.lineTo((double)11.5F, (double)10.25F);
   var1.lineTo((double)7.5F, (double)12.5F);
   var1.lineTo((double)3.5F, (double)10.25F);
   var1.lineTo((double)3.5F, (double)4.75F);
   var1.closePath();
   g.draw(var1);
   GeneralPath var2 = new GeneralPath();
   var2.moveTo((double)3.5F, (double)4.75F);
   var2.lineTo((double)7.5F, (double)7.0F);
   var2.lineTo((double)11.5F, (double)4.75F);
   g.draw(var2);
   lilIliilIl(g, (double)7.5F, (double)7.0F, (double)7.5F, (double)12.5F);
});
            case 12 -> IIllllIlll(var2, var3, (g) -> {
   GeneralPath var1 = new GeneralPath();
   var1.moveTo((double)3.5F, (double)7.5F);
   var1.lineTo((double)6.5F, (double)10.5F);
   var1.lineTo((double)12.5F, (double)4.5F);
   g.draw(var1);
});
            case 13 -> IIllllIlll(var2, var3, (g) -> {
   lilIliilIl(g, (double)4.5F, (double)4.5F, (double)11.5F, (double)11.5F);
   lilIliilIl(g, (double)11.5F, (double)4.5F, (double)4.5F, (double)11.5F);
});
            case 14 -> IIllllIlll(var2, var3, (g) -> {
   GeneralPath var1 = new GeneralPath();
   var1.moveTo((double)6.0F, (double)4.0F);
   var1.lineTo((double)12.0F, (double)8.0F);
   var1.lineTo((double)6.0F, (double)12.0F);
   var1.closePath();
   g.draw(var1);
});
            case 15 -> IIllllIlll(var2, var3, (g) -> {
   IIiIllIiIl(g, (double)8.0F, (double)8.0F, (double)2.5F);
   g.draw(new Arc2D.Double((double)4.75F, (double)4.75F, (double)6.5F, (double)6.5F, (double)-45.0F, (double)90.0F, 0));
   g.draw(new Arc2D.Double((double)4.75F, (double)4.75F, (double)6.5F, (double)6.5F, (double)135.0F, (double)90.0F, 0));
   g.draw(new Arc2D.Double((double)2.0F, (double)2.0F, (double)12.0F, (double)12.0F, (double)-45.0F, (double)90.0F, 0));
   g.draw(new Arc2D.Double((double)2.0F, (double)2.0F, (double)12.0F, (double)12.0F, (double)135.0F, (double)90.0F, 0));
});
            case 16 -> IIllllIlll(var2, var3, (g) -> {
   GeneralPath var1 = new GeneralPath();
   var1.moveTo(6.6, (double)3.0F);
   var1.curveTo(5.2, (double)2.5F, 3.6, 2.9, 2.9, 4.8);
   var1.curveTo(2.3, 7.4, 2.4, 10.6, 3.2, 13.2);
   var1.quadTo(4.6, 11.4, 6.3, 10.2);
   var1.curveTo(6.2, 8.2, 6.6, 5.6, 6.6, (double)3.0F);
   var1.closePath();
   g.draw(var1);
   g.draw((new AffineTransform(-1.0F, 0.0F, 0.0F, 1.0F, 16.0F, 0.0F)).createTransformedShape(var1));
});
         }

         IiIllilIiliIllilIi.put(name, var2);
         return var2;
      }
   }

   private static void lliIliliIl(Graphics2D r, double g, double w, double h, double y, double x) {
      r.draw(new RoundRectangle2D.Double(g, w, h, y, x * (double)2.0F, x * (double)2.0F));
   }

   // $FF: synthetic method
   private static CallSite IlIlIlllIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '잽') << 12 | (char)(var4[var5] ^ '잽') >>> 4) >>> 4 | (char)((char)(var4[var5] ^ '잽') << 12 | (char)(var4[var5] ^ '잽') >>> 4) << 12) ^ 28521) ^ var5) + '\ue502') + '룻') >>> 6 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '잽') << 12 | (char)(var4[var5] ^ '잽') >>> 4) >>> 4 | (char)((char)(var4[var5] ^ '잽') << 12 | (char)(var4[var5] ^ '잽') >>> 4) << 12) ^ 28521) ^ var5) + '\ue502') + '룻') << 10))) - var5) ^ var5) - '꽦'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static class_2960 IilliliilIIi() {
      if (!iiIiIilIiIIliIilIi) {
         iiIiIilIiIIliIilIi = llIIlilIIl(IIiIIilIilIiIIilIi, lIIlIliIIlIl<invokedynamic>(), (g) -> {
            GeneralPath var1 = new GeneralPath();
            var1.moveTo(10.24, 33.28);
            var1.lineTo(23.04, 33.28);
            var1.lineTo(29.44, 19.2);
            var1.lineTo(37.12, 46.08);
            var1.lineTo(42.24, 33.28);
            var1.lineTo(55.04, 33.28);
            g.draw(var1);
         });
      }

      return IIiIIilIilIiIIilIi;
   }

   // $FF: synthetic method
   private static CallSite IIllIllIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) - var5))) >>> 5 | (char)(-((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) - var5))) << 11))) ^ var5) + var5) + 18680) << 10 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) - var5))) >>> 5 | (char)(-((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) - var5))) << 11))) ^ var5) + var5) + 18680) >>> 6) ^ '턓') + '뀂') + 1092) - 9766));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static GeneralPath iiiIlIIIll(String d) {
      long var37 = 7928329325503216395L;
      long var39 = -6735808204313051834L;
      long var41 = -4391225527702804362L;
      long var43 = -4954371856564316370L;
      long var45 = -3795078066771316952L;
      GeneralPath var1 = new GeneralPath();
      int[] var2 = new int[]{0};
      var37 ^= ((long)d.length() << 32 ^ var37) & -1L << 32;
      double var4 = (double)0.0F;
      double var6 = (double)0.0F;
      double var8 = (double)0.0F;
      double var10 = (double)0.0F;
      double var12 = (double)0.0F;
      double var14 = (double)0.0F;
      var37 ^= (0L ^ var37) & -1L >>> 32;
      var39 ^= (0L ^ var39) & -1L << 32;

      while(true) {
         lIIlliIIll(d, var2);
         if (var2[0] >= (int)(var37 >>> 32)) {
            return var1;
         }

         var39 ^= ((long)d.charAt(var2[0]) ^ var39) & -1L >>> 32;
         if (Character.isLetter((char)((int)var39))) {
            var37 ^= ((long)((int)var39) ^ var37) & -1L >>> 32;
            int var10002 = var2[0]++;
         } else if ((int)var37 == 77) {
            var37 ^= (76L ^ var37) & -1L >>> 32;
         } else if ((int)var37 == 109) {
            var37 ^= (108L ^ var37) & -1L >>> 32;
         } else if ((int)var37 == 0 || (int)var37 == 90 || (int)var37 == 122) {
            throw new IllegalArgumentException(lIIlIliIIlIl<invokedynamic>() + var2[0]);
         }

         var41 ^= ((long)Character.isLowerCase((char)((int)var37)) << 32 ^ var41) & -1L << 32;
         double var20 = (int)(var41 >>> 32) != 0 ? var4 : (double)0.0F;
         double var22 = (int)(var41 >>> 32) != 0 ? var6 : (double)0.0F;
         var41 ^= ((long)Character.toUpperCase((char)((int)var37)) ^ var41) & -1L >>> 32;
         switch ((int)var41) {
            case 65:
               double var48 = IlIllllIll(d, var2);
               double var51 = IlIllllIll(d, var2);
               double var53 = IlIllllIll(d, var2);
               var43 ^= ((long)ilIllIiIll(d, var2) ^ var43) & -1L >>> 32;
               var45 ^= ((long)ilIllIiIll(d, var2) << 32 ^ var45) & -1L << 32;
               double var33 = var20 + IlIllllIll(d, var2);
               double var35 = var22 + IlIllllIll(d, var2);
               liIlliiIll(var1, var4, var6, var48, var51, var53, (boolean)((int)var43), (boolean)((int)(var45 >>> 32)), var33, var35);
               var4 = var33;
               var6 = var35;
               break;
            case 66:
            case 68:
            case 69:
            case 70:
            case 71:
            case 73:
            case 74:
            case 75:
            case 78:
            case 79:
            case 80:
            case 82:
            case 85:
            case 87:
            case 88:
            case 89:
            default:
               throw new IllegalArgumentException(lIIlIliIIlIl<invokedynamic>() + (int)var37);
            case 67:
               double var47 = var20 + IlIllllIll(d, var2);
               double var50 = var22 + IlIllllIll(d, var2);
               double var29 = var20 + IlIllllIll(d, var2);
               double var31 = var22 + IlIllllIll(d, var2);
               var4 = var20 + IlIllllIll(d, var2);
               var6 = var22 + IlIllllIll(d, var2);
               var1.curveTo(var47, var50, var29, var31, var4, var6);
               var12 = var29;
               var14 = var31;
               break;
            case 72:
               var4 = var20 + IlIllllIll(d, var2);
               var1.lineTo(var4, var6);
               break;
            case 76:
               var4 = var20 + IlIllllIll(d, var2);
               var6 = var22 + IlIllllIll(d, var2);
               var1.lineTo(var4, var6);
               break;
            case 77:
               var4 = var20 + IlIllllIll(d, var2);
               var6 = var22 + IlIllllIll(d, var2);
               var1.moveTo(var4, var6);
               var8 = var4;
               var10 = var6;
               break;
            case 81:
               double var25 = var20 + IlIllllIll(d, var2);
               double var27 = var22 + IlIllllIll(d, var2);
               var4 = var20 + IlIllllIll(d, var2);
               var6 = var22 + IlIllllIll(d, var2);
               var1.quadTo(var25, var27, var4, var6);
               var12 = var25;
               var14 = var27;
               break;
            case 83:
               var43 ^= ((long)((int)(var39 >>> 32) != 67 && (int)(var39 >>> 32) != 83 ? 0 : 1) << 32 ^ var43) & -1L << 32;
               double var49 = (int)(var43 >>> 32) != 0 ? (double)2.0F * var4 - var12 : var4;
               double var52 = (int)(var43 >>> 32) != 0 ? (double)2.0F * var6 - var14 : var6;
               double var30 = var20 + IlIllllIll(d, var2);
               double var32 = var22 + IlIllllIll(d, var2);
               var4 = var20 + IlIllllIll(d, var2);
               var6 = var22 + IlIllllIll(d, var2);
               var1.curveTo(var49, var52, var30, var32, var4, var6);
               var12 = var30;
               var14 = var32;
               break;
            case 84:
               var43 ^= ((long)((int)(var39 >>> 32) != 81 && (int)(var39 >>> 32) != 84 ? 0 : 1) << 32 ^ var43) & -1L << 32;
               double var26 = (int)(var43 >>> 32) != 0 ? (double)2.0F * var4 - var12 : var4;
               double var28 = (int)(var43 >>> 32) != 0 ? (double)2.0F * var6 - var14 : var6;
               var4 = var20 + IlIllllIll(d, var2);
               var6 = var22 + IlIllllIll(d, var2);
               var1.quadTo(var26, var28, var4, var6);
               var12 = var26;
               var14 = var28;
               break;
            case 86:
               var6 = var22 + IlIllllIll(d, var2);
               var1.lineTo(var4, var6);
               break;
            case 90:
               var1.closePath();
               var4 = var8;
               var6 = var10;
         }

         var39 ^= ((long)((int)var41) << 32 ^ var39) & -1L << 32;
      }
   }

   private lIlIIiliIlIIil() {
   }

   public static class_2960 IlIillIiilIi() {
      if (!liIIlilIiiiIIlilIi) {
         liIIlilIiiiIIlilIi = iiIIlIIlIl(iillIilIiIIilIilIi, lIIlIliIIlIl<invokedynamic>(), (g) -> {
            GeneralPath var1 = new GeneralPath();
            var1.moveTo((double)32.0F, 10.24);
            var1.lineTo(51.2, 17.28);
            var1.curveTo(51.2, 38.4, 46.08, 48.64, (double)32.0F, 55.04);
            var1.curveTo(17.92, 48.64, 12.8, 38.4, 12.8, 17.28);
            var1.closePath();
            g.draw(var1);
         });
      }

      return iillIilIiIIilIilIi;
   }

   public static class_2960 IIlllIlliIll() {
      if (!iIiiIilIiIliiIilIi) {
         iIiiIilIiIliiIilIi = IiIIlliIIl(IlIlIilIillIlIilIi, lIIlIliIIlIl<invokedynamic>(), (g) -> {
            double var1 = 12.8;
            double var3 = 38.4;
            double var5 = 9.92;
            double var7 = 3.52;
            g.fill(new RoundRectangle2D.Double(var1, 15.36, var3, var5, var7, var7));
            g.fill(new RoundRectangle2D.Double(var1, 27.04, var3, var5, var7, var7));
            g.fill(new RoundRectangle2D.Double(var1, 38.72, var3, var5, var7, var7));
         });
      }

      return IlIlIilIillIlIilIi;
   }

   private static boolean Iiiiliiiiiii(class_2960 strokeW, String label, lilIIiIliilIIiIl paint, float id, int shrink) {
      long var17 = 667313372187238315L;
      long var19 = 3212948100664023947L;
      long var15 = -8396439406840519299L;

      try {
         BufferedImage var5 = new BufferedImage(64, 64, 2);
         Graphics2D var6 = var5.createGraphics();
         var6.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         var6.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
         var6.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
         var6.setColor(Color.WHITE);
         if (id > 0.0F) {
            var6.setStroke(new BasicStroke(id, 1, 1));
         }

         paint.paint(var6);
         var6.dispose();
         var15 ^= ((long)(64 / shrink) << 32 ^ var15) & -1L << 32;
         int[] var8 = var5.getRGB(0, 0, 64, 64, (int[])null, 0, 64);
         class_1011 var9 = new class_1011((int)(var15 >>> 32), (int)(var15 >>> 32), false);

         for(long var23 = var15 ^ (0L ^ var15) & -1L >>> 32; (int)var23 < (int)(var23 >>> 32); var23 ^= (var23 ^ var23 + (long)1) & -1L >>> 32) {
            for(var17 ^= (0L ^ var17) & -1L << 32; (int)(var17 >>> 32) < (int)(var23 >>> 32); var17 += 4294967296L) {
               var17 ^= (0L ^ var17) & -1L >>> 32;

               for(var19 ^= (0L ^ var19) & -1L << 32; (int)(var19 >>> 32) < shrink; var19 += 4294967296L) {
                  for(var19 ^= (0L ^ var19) & -1L >>> 32; (int)var19 < shrink; var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
                     var17 ^= ((long)((int)var17 + (var8[((int)var23 * shrink + (int)(var19 >>> 32)) * 64 + (int)(var17 >>> 32) * shrink + (int)var19] >>> 24 & 255)) ^ var17) & -1L >>> 32;
                  }
               }

               var9.method_61941((int)(var17 >>> 32), (int)var23, (int)var17 / (shrink * shrink) << 24 | 16777215);
            }
         }

         class_1043 var10 = new class_1043(() -> label, var9);
         class_310.method_1551().method_1531().method_4616(strokeW, var10);
         return true;
      } catch (Throwable var21) {
         return false;
      }
   }

   private static boolean ilIllIiIll(String pos, int[] d) {
      long var3 = 2207760019431513195L;
      lIIlliIIll(pos, d);
      var3 ^= ((long)(d[0] < pos.length() ? pos.charAt(d[0]) : 32) << 32 ^ var3) & -1L << 32;
      if ((int)(var3 >>> 32) != 48 && (int)(var3 >>> 32) != 49) {
         throw new IllegalArgumentException(lIIlIliIIlIl<invokedynamic>() + d[0]);
      } else {
         int var10002 = d[0]++;
         return (int)(var3 >>> 32) == 49;
      }
   }

   private static GeneralPath lllllillll(double R, double cy, double cx) {
      long var18 = 1433296764044665673L;
      double var6 = cx * 0.28;
      GeneralPath var8 = new GeneralPath();

      for(long var20 = var18 ^ (0L ^ var18) & -1L << 32; (int)(var20 >>> 32) < 8; var20 += 4294967296L) {
         double var10 = (-Math.PI / 2D) + (double)((int)(var20 >>> 32)) * Math.PI / (double)4.0F;
         double var12 = (int)(var20 >>> 32) % 2 == 0 ? cx : var6;
         double var14 = R + Math.cos(var10) * var12;
         double var16 = cy + Math.sin(var10) * var12;
         if ((int)(var20 >>> 32) == 0) {
            var8.moveTo(var14, var16);
         } else {
            var8.lineTo(var14, var16);
         }
      }

      var8.closePath();
      return var8;
   }

   public static class_2960 Iliilliiilii() {
      if (!IliIlilIilliIlilIi) {
         IliIlilIilliIlilIi = Iiiiliiiiiii(lIiIlilIiiIiIlilIi, lIIlIliIIlIl<invokedynamic>(), (g) -> {
            g.draw(new Ellipse2D.Double(10.88, 10.88, 42.24, 42.24));
            g.draw(new Line2D.Double((double)32.0F, (double)32.0F, (double)32.0F, 20.48));
            g.draw(new Line2D.Double((double)32.0F, (double)32.0F, 44.8, (double)32.0F));
         }, 7.36F, 2);
      }

      return lIiIlilIiiIiIlilIi;
   }

   public static class_2960 IiIlliIliiIl() {
      if (!IIiiIilIilIiiIilIi) {
         IIiiIilIilIiiIilIi = IiIIlliIIl(lIIlIilIiiIIlIilIi, lIIlIliIIlIl<invokedynamic>(), (g) -> {
            Area var1 = new Area();
            var1.add(new Area(new Ellipse2D.Double(8.96, 26.88, 21.76, 21.76)));
            var1.add(new Area(new Ellipse2D.Double(21.12, 17.92, 25.6, 25.6)));
            var1.add(new Area(new Ellipse2D.Double(33.28, 26.88, 21.76, 21.76)));
            var1.add(new Area(new RoundRectangle2D.Double(11.52, 35.84, 40.96, 12.8, 12.8, 12.8)));
            g.fill(var1);
         });
      }

      return lIIlIilIiiIIlIilIi;
   }

   public static class_2960 IIIilIIiiIIi() {
      if (!ilIIlilIiIiIIlilIi) {
         ilIIlilIiIiIIlilIi = iiIIlIIlIl(IillIilIilillIilIi, lIIlIliIIlIl<invokedynamic>(), (g) -> {
            double var1 = (double)32.0F;
            double var3 = (double)32.0F;
            double var5 = (double)16.0F;
            g.draw(new Arc2D.Double(var1 - var5, var3 - var5, var5 * (double)2.0F, var5 * (double)2.0F, (double)75.0F, (double)285.0F, 0));
            double var7 = Math.toRadians((double)75.0F);
            double var9 = var1 + var5 * Math.cos(var7);
            double var11 = var3 - var5 * Math.sin(var7);
            g.draw(new Line2D.Double(var9, var11, var9 - 7.68, var11 + 1.92));
            g.draw(new Line2D.Double(var9, var11, var9 + 1.28, var11 + 8.32));
         });
      }

      return IillIilIilillIilIi;
   }

   private static void iIiIlIliIl(Graphics2D g, double r, double cx, double cy) {
      g.draw(new Ellipse2D.Double(r - cy, cx - cy, cy * (double)2.0F, cy * (double)2.0F));
   }

   // $FF: synthetic method
   private static CallSite lIIlIliIIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 9046011935506971893L ^ Long.rotateLeft(137505401937518752L, 32) ^ 7176533265866562581L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -7948649702245306470L ^ Long.rotateLeft(-7517858565221934119L, 34) ^ -6520635321351530308L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3441033292407866662L ^ Long.rotateLeft(-5512823076748769475L, 19) ^ 3788667087989359197L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5444832100517703236L ^ Long.rotateLeft(-74851298062188056L, 63) ^ -4122177398999668631L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 7738937174257274761L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 2407178090401607698L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5517522198055572356L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 694646882817018748L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 7066930786734991496L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -519384649366327510L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IlIlIlllIlIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, ilIlIlIiIlIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, liIlIliiIlIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IIllIllIllIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iIllIlIlllIl<invokedynamic>());
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

   public static class_2960 Iilllilliill() {
      if (!IiiiIilIiliiiIilIi) {
         IiiiIilIiliiiIilIi = IiIIlliIIl(liIlIilIiiiIlIilIi, lIIlIliIIlIl<invokedynamic>(), (g) -> {
            GeneralPath var1 = new GeneralPath();
            var1.moveTo(16.64, 17.92);
            var1.lineTo(38.4, (double)32.0F);
            var1.lineTo(16.64, 46.08);
            var1.closePath();
            g.fill(var1);
            g.fill(new RoundRectangle2D.Double(43.2, 19.2, 5.44, 25.6, 3.2, 3.2));
         });
      }

      return liIlIilIiiiIlIilIi;
   }

   // $FF: synthetic method
   private static CallSite iIllIlIlllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + 25586) - var5) - 'ﮕ') + var5) - 564) << 10 | (char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + 25586) - var5) - 'ﮕ') + var5) - 564) >>> 6) ^ var5))) ^ '\uf5d2') ^ 29895))) - 26332)));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void liIlliiIll(GeneralPath sweep, double y, double y0, double p, double x, double ry, boolean rotDeg, boolean large, double x0, double rx) {
      long var83 = 2798862047836202280L;
      if (y != x0 || y0 != rx) {
         p = Math.abs(p);
         x = Math.abs(x);
         if (p != (double)0.0F && x != (double)0.0F) {
            double var17 = Math.toRadians(ry);
            double var19 = Math.cos(var17);
            double var21 = Math.sin(var17);
            double var23 = (y - x0) / (double)2.0F;
            double var25 = (y0 - rx) / (double)2.0F;
            double var27 = var19 * var23 + var21 * var25;
            double var29 = -var21 * var23 + var19 * var25;
            double var31 = var27 * var27 / (p * p) + var29 * var29 / (x * x);
            if (var31 > (double)1.0F) {
               double var33 = Math.sqrt(var31);
               p *= var33;
               x *= var33;
            }

            double var87 = p * p;
            double var35 = x * x;
            double var37 = var87 * var29 * var29 + var35 * var27 * var27;
            double var39 = (double)(rotDeg == large ? -1 : 1) * Math.sqrt(Math.max((double)0.0F, (var87 * var35 - var37) / var37));
            double var41 = var39 * p * var29 / x;
            double var43 = -var39 * x * var27 / p;
            double var45 = var19 * var41 - var21 * var43 + (y + x0) / (double)2.0F;
            double var47 = var21 * var41 + var19 * var43 + (y0 + rx) / (double)2.0F;
            double var49 = (var27 - var41) / p;
            double var51 = (var29 - var43) / x;
            double var53 = (-var27 - var41) / p;
            double var55 = (-var29 - var43) / x;
            double var57 = Math.atan2(var51, var49);
            double var59 = Math.atan2(var49 * var55 - var51 * var53, var49 * var53 + var51 * var55);
            if (!large && var59 > (double)0.0F) {
               var59 -= (Math.PI * 2D);
            } else if (large && var59 < (double)0.0F) {
               var59 += (Math.PI * 2D);
            }

            var83 ^= ((long)Math.max(1, (int)Math.ceil(Math.abs(var59) / (Math.PI / 2D) - 1.0E-9)) << 32 ^ var83) & -1L << 32;
            double var62 = var59 / (double)((int)(var83 >>> 32));
            double var64 = 1.3333333333333333 * Math.tan(var62 / (double)4.0F);

            for(long var89 = var83 ^ (0L ^ var83) & -1L >>> 32; (int)var89 < (int)(var89 >>> 32); var89 ^= (var89 ^ var89 + (long)1) & -1L >>> 32) {
               double var67 = Math.cos(var57);
               double var69 = Math.sin(var57);
               double var71 = Math.cos(var57 + var62);
               double var73 = Math.sin(var57 + var62);
               double var75 = var67 - var64 * var69;
               double var77 = var69 + var64 * var67;
               double var79 = var71 + var64 * var73;
               double var81 = var73 - var64 * var71;
               sweep.curveTo(var45 + p * var75 * var19 - x * var77 * var21, var47 + p * var75 * var21 + x * var77 * var19, var45 + p * var79 * var19 - x * var81 * var21, var47 + p * var79 * var21 + x * var81 * var19, var45 + p * var71 * var19 - x * var73 * var21, var47 + p * var71 * var21 + x * var73 * var19);
               var57 += var62;
            }

         } else {
            sweep.lineTo(x0, rx);
         }
      }
   }

   public static class_2960 IIiilIiiiIii() {
      if (!IilIlilIililIlilIi) {
         IilIlilIililIlilIi = llIIlilIIl(liilIilIiiiilIilIi, lIIlIliIIlIl<invokedynamic>(), (g) -> {
            g.draw(new Ellipse2D.Double(10.88, 10.88, 42.24, 42.24));
            g.draw(new Line2D.Double((double)32.0F, (double)32.0F, (double)32.0F, 20.48));
            g.draw(new Line2D.Double((double)32.0F, (double)32.0F, 44.8, (double)32.0F));
         });
      }

      return liilIilIiiiilIilIi;
   }

   public static class_2960 lIiiIiIlilli() {
      if (!lIliIilIiiIliIilIi) {
         lIliIilIiiIliIilIi = llIIlilIIl(iIiIIilIiIliIIilIi, lIIlIliIIlIl<invokedynamic>(), (g) -> {
            double var1 = 46.08;
            g.draw(new Line2D.Double(17.92, var1, 17.92, 38.4));
            g.draw(new Line2D.Double((double)32.0F, var1, (double)32.0F, 28.16));
            g.draw(new Line2D.Double(46.08, var1, 46.08, 17.92));
         });
      }

      return iIiIIilIiIliIIilIi;
   }

   public static class_2960 IIIllIIliIIl() {
      if (!illiIilIiIiliIilIi) {
         illiIilIiIiliIilIi = IiIIlliIIl(IiiIIilIiliiIIilIi, lIIlIliIIlIl<invokedynamic>(), (g) -> {
            GeneralPath var1 = new GeneralPath();
            var1.moveTo((double)32.0F, 52.48);
            var1.curveTo((double)32.0F, 52.48, 15.36, 33.28, 15.36, 24.32);
            var1.curveTo(15.36, 12.16, 48.64, 12.16, 48.64, 24.32);
            var1.curveTo(48.64, 33.28, (double)32.0F, 52.48, (double)32.0F, 52.48);
            var1.closePath();
            g.fill(var1);
         });
      }

      return IiiIIilIiliiIIilIi;
   }

   public static class_2960 iliIiiliiiii() {
      if (!IlliIilIillliIilIi) {
         IlliIilIillliIilIi = llIIlilIIl(lliIIilIiiliIIilIi, lIIlIliIIlIl<invokedynamic>(), (g) -> {
            GeneralPath var1 = new GeneralPath();
            var1.moveTo(21.76, 17.92);
            var1.lineTo(33.28, (double)32.0F);
            var1.lineTo(21.76, 46.08);
            GeneralPath var2 = new GeneralPath();
            var2.moveTo(34.56, 17.92);
            var2.lineTo(46.08, (double)32.0F);
            var2.lineTo(34.56, 46.08);
            g.draw(var1);
            g.draw(var2);
         });
      }

      return lliIIilIiiliIIilIi;
   }

   // $FF: synthetic method
   private static CallSite liIlIliiIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)(-var4[var5]))))) + '臒') - var5) << 9 | (char)((char)((char)(-((char)(~((char)(-var4[var5]))))) + '臒') - var5) >>> 7))) ^ '턪') ^ var5))) ^ 31027))) >>> 13 | (char)(~((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)(-var4[var5]))))) + '臒') - var5) << 9 | (char)((char)((char)(-((char)(~((char)(-var4[var5]))))) + '臒') - var5) >>> 7))) ^ '턪') ^ var5))) ^ 31027))) << 3))) >>> 1 | (char)(~((char)((char)(~((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)(-var4[var5]))))) + '臒') - var5) << 9 | (char)((char)((char)(-((char)(~((char)(-var4[var5]))))) + '臒') - var5) >>> 7))) ^ '턪') ^ var5))) ^ 31027))) >>> 13 | (char)(~((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)(-var4[var5]))))) + '臒') - var5) << 9 | (char)((char)((char)(-((char)(~((char)(-var4[var5]))))) + '臒') - var5) >>> 7))) ^ '턪') ^ var5))) ^ 31027))) << 3))) << 15) + var5) ^ 4887) - var5) ^ '\uf228'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static class_2960 IliIlllilIi() {
      if (!iIIiIilIiIlIiIilIi) {
         iIIiIilIiIlIiIilIi = llIIlilIIl(IllIIilIilllIIilIi, lIIlIliIIlIl<invokedynamic>(), (g) -> {
            GeneralPath var1 = new GeneralPath();
            var1.moveTo(23.04, 14.08);
            var1.lineTo(42.24, (double)32.0F);
            var1.lineTo(23.04, 49.92);
            g.draw(var1);
         });
      }

      return IllIIilIilllIIilIi;
   }

   private static GeneralPath iIIIlIlIIl(double R, double r, double cy, double cx) {
      long var18 = 8757653999955863309L;
      GeneralPath var8 = new GeneralPath();

      for(long var20 = var18 ^ (0L ^ var18) & -1L << 32; (int)(var20 >>> 32) < 10; var20 += 4294967296L) {
         double var10 = (-Math.PI / 2D) + (double)((int)(var20 >>> 32)) * Math.PI / (double)5.0F;
         double var12 = (int)(var20 >>> 32) % 2 == 0 ? cy : cx;
         double var14 = R + Math.cos(var10) * var12;
         double var16 = r + Math.sin(var10) * var12;
         if ((int)(var20 >>> 32) == 0) {
            var8.moveTo(var14, var16);
         } else {
            var8.lineTo(var14, var16);
         }
      }

      var8.closePath();
      return var8;
   }

   public static class_2960 liiiIIllIl() {
      if (!llIiIilIiilIiIilIi) {
         llIiIilIiilIiIilIi = llIIlilIIl(illIIilIiIilIIilIi, lIIlIliIIlIl<invokedynamic>(), (g) -> {
            GeneralPath var1 = new GeneralPath();
            var1.moveTo(15.36, 32.64);
            var1.lineTo(26.88, 44.8);
            var1.lineTo(48.64, 19.2);
            g.draw(var1);
         });
      }

      return illIIilIiIilIIilIi;
   }

   public static class_2960 Ililllililil() {
      if (!lIIIlilIiiIIIlilIi) {
         lIIIlilIiiIIIlilIi = IiIIlliIIl(iIllIilIiIlllIilIi, lIIlIliIIlIl<invokedynamic>(), (g) -> {
            double var1 = 9.6;
            double var3 = 17.92;
            double var5 = 28.16;
            double var7 = 3.2;
            g.fill(new RoundRectangle2D.Double(21.12, var3, var1, var5, var7, var7));
            g.fill(new RoundRectangle2D.Double(33.28, var3, var1, var5, var7, var7));
         });
      }

      return iIllIilIiIlllIilIi;
   }

   public static class_2960 Illillliilli() {
      if (!lllIlilIiillIlilIi) {
         lllIlilIiillIlilIi = IiIIlliIIl(ililIilIiIiilIilIi, lIIlIliIIlIl<invokedynamic>(), (g) -> g.fill(iIIIlIlIIl((double)32.0F, 33.28, 26.88, 11.2)));
      }

      return ililIilIiIiilIilIi;
   }

   private static void lilIliilIl(Graphics2D y1, double y2, double g, double x2, double x1) {
      y1.draw(new Line2D.Double(y2, g, x2, x1));
   }

   public static class_2960 iIlIlllllill() {
      if (!IiIiIilIiliIiIilIi) {
         IiIiIilIiliIiIilIi = llIIlilIIl(lilIIilIiiilIIilIi, lIIlIliIIlIl<invokedynamic>(), (g) -> {
            GeneralPath var1 = new GeneralPath();
            var1.moveTo(17.28, 17.28);
            var1.lineTo(46.72, 46.72);
            GeneralPath var2 = new GeneralPath();
            var2.moveTo(46.72, 17.28);
            var2.lineTo(17.28, 46.72);
            g.draw(var1);
            g.draw(var2);
         });
      }

      return lilIIilIiiilIIilIi;
   }

   // $FF: synthetic method
   private static CallSite ilIlIlIiIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) >>> 1 | (char)(var4[var5] >>> 12 | var4[var5] << 4) << 15))))))) + 24775) - '臚') - 3262) - var5) ^ 29592) - 6059))) >>> 8 | (char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) >>> 1 | (char)(var4[var5] >>> 12 | var4[var5] << 4) << 15))))))) + 24775) - '臚') - 3262) - var5) ^ 29592) - 6059))) << 8) << 4 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) >>> 1 | (char)(var4[var5] >>> 12 | var4[var5] << 4) << 15))))))) + 24775) - '臚') - 3262) - var5) ^ 29592) - 6059))) >>> 8 | (char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) >>> 1 | (char)(var4[var5] >>> 12 | var4[var5] << 4) << 15))))))) + 24775) - '臚') - 3262) - var5) ^ 29592) - 6059))) << 8) >>> 12))) + 19448) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static class_2960 Iilililiiili() {
      if (!iilIlilIiIIiIlilIi) {
         iilIlilIiIIiIlilIi = IiIIlliIIl(IIIiIilIilIIiIilIi, lIIlIliIIlIl<invokedynamic>(), (g) -> {
            double var1 = 11.84;
            g.fill(new Ellipse2D.Double(21.44 - var1, (double)24.0F - var1, var1 * (double)2.0F, var1 * (double)2.0F));
            g.fill(new Ellipse2D.Double(42.56 - var1, (double)24.0F - var1, var1 * (double)2.0F, var1 * (double)2.0F));
            GeneralPath var3 = new GeneralPath();
            var3.moveTo(10.24, 28.16);
            var3.lineTo(53.76, 28.16);
            var3.lineTo((double)32.0F, 53.76);
            var3.closePath();
            g.fill(var3);
         });
      }

      return IIIiIilIilIIiIilIi;
   }

   public static class_2960 IIillIiliIil() {
      if (!iiiiIilIiIIIIlilIi) {
         iiiiIilIiIIIIlilIi = IiIIlliIIl(IIllIilIilIllIilIi, lIIlIliIIlIl<invokedynamic>(), (g) -> {
            GeneralPath var1 = new GeneralPath();
            var1.moveTo(21.76, 16.64);
            var1.lineTo(47.36, (double)32.0F);
            var1.lineTo(21.76, 47.36);
            var1.closePath();
            g.fill(var1);
         });
      }

      return IIllIilIilIllIilIi;
   }

   private static void IIiIllIiIl(Graphics2D cx, double g, double cy, double d) {
      cx.fill(new Ellipse2D.Double(g - d / (double)2.0F, cy - d / (double)2.0F, d, d));
   }

   public static class_2960 IIIIllIIIl(String name) {
      long var9 = -2237114255714242336L;
      class_2960 var1 = (class_2960)iliIlilIiIiiIlilIi.get(name);
      if (var1 != null) {
         return var1;
      } else {
         class_2960 var2 = class_2960.method_60655(lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>() + name);
         String var3 = lIIlIliIIlIl<invokedynamic>() + name;
         double var4 = (double)64.0F;
         var9 ^= (-4294967296L ^ var9) & -1L << 32;
         switch (name.hashCode()) {
            case -1268966290:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var9 ^= (38654705664L ^ var9) & -1L << 32;
               }
               break;
            case -991851251:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var9 ^= (8589934592L ^ var9) & -1L << 32;
               }
               break;
            case -906336856:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var9 ^= (55834574848L ^ var9) & -1L << 32;
               }
               break;
            case -873960692:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var9 ^= (51539607552L ^ var9) & -1L << 32;
               }
               break;
            case -838595071:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var9 ^= (17179869184L ^ var9) & -1L << 32;
               }
               break;
            case -827512079:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var9 ^= (42949672960L ^ var9) & -1L << 32;
               }
               break;
            case 106079:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var9 ^= (25769803776L ^ var9) & -1L << 32;
               }
               break;
            case 3089482:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var9 ^= (64424509440L ^ var9) & -1L << 32;
               }
               break;
            case 3444122:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var9 ^= (0L ^ var9) & -1L << 32;
               }
               break;
            case 3522941:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var9 ^= (47244640256L ^ var9) & -1L << 32;
               }
               break;
            case 3599307:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var9 ^= (30064771072L ^ var9) & -1L << 32;
               }
               break;
            case 94756344:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var9 ^= (60129542144L ^ var9) & -1L << 32;
               }
               break;
            case 98449901:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var9 ^= (34359738368L ^ var9) & -1L << 32;
               }
               break;
            case 109400031:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var9 ^= (21474836480L ^ var9) & -1L << 32;
               }
               break;
            case 110621496:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var9 ^= (4294967296L ^ var9) & -1L << 32;
               }
               break;
            case 1427818632:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var9 ^= (12884901888L ^ var9) & -1L << 32;
               }
         }

         byte var10000;
         switch ((int)(var9 >>> 32)) {
            case 0 -> var10000 = iiIIlIIlIl(var2, var3, (r) -> {
   r.draw(new Line2D.Double(var4 * (double)0.5F, var4 * 0.22, var4 * (double)0.5F, var4 * 0.78));
   r.draw(new Line2D.Double(var4 * 0.22, var4 * (double)0.5F, var4 * 0.78, var4 * (double)0.5F));
});
            case 1 -> var10000 = iiIIlIIlIl(var2, var3, (g) -> {
   g.draw(new Line2D.Double(var4 * 0.2, var4 * 0.28, var4 * 0.8, var4 * 0.28));
   GeneralPath var3 = new GeneralPath();
   var3.moveTo(var4 * 0.4, var4 * 0.28);
   var3.lineTo(var4 * 0.4, var4 * 0.18);
   var3.lineTo(var4 * 0.6, var4 * 0.18);
   var3.lineTo(var4 * 0.6, var4 * 0.28);
   g.draw(var3);
   GeneralPath var4x = new GeneralPath();
   var4x.moveTo(var4 * 0.27, var4 * 0.28);
   var4x.lineTo(var4 * 0.31, var4 * 0.82);
   var4x.lineTo(var4 * 0.69, var4 * 0.82);
   var4x.lineTo(var4 * 0.73, var4 * 0.28);
   g.draw(var4x);
   g.draw(new Line2D.Double(var4 * 0.43, var4 * 0.42, var4 * 0.43, var4 * 0.68));
   g.draw(new Line2D.Double(var4 * 0.57, var4 * 0.42, var4 * 0.57, var4 * 0.68));
});
            case 2 -> var10000 = iiIIlIIlIl(var2, var3, (g) -> {
   GeneralPath var3 = new GeneralPath();
   var3.moveTo(var4 * 0.22, var4 * 0.78);
   var3.lineTo(var4 * 0.26, var4 * 0.62);
   var3.lineTo(var4 * 0.62, var4 * 0.26);
   var3.lineTo(var4 * 0.74, var4 * 0.38);
   var3.lineTo(var4 * 0.38, var4 * 0.74);
   var3.closePath();
   g.draw(var3);
   g.draw(new Line2D.Double(var4 * 0.53, var4 * 0.35, var4 * 0.65, var4 * 0.47));
});
            case 3 -> var10000 = iiIIlIIlIl(var2, var3, (r) -> {
   r.draw(new Line2D.Double(var4 * (double)0.5F, var4 * 0.18, var4 * (double)0.5F, var4 * 0.6));
   GeneralPath var3 = new GeneralPath();
   var3.moveTo(var4 * 0.32, var4 * 0.44);
   var3.lineTo(var4 * (double)0.5F, var4 * 0.62);
   var3.lineTo(var4 * 0.68, var4 * 0.44);
   r.draw(var3);
   GeneralPath var4x = new GeneralPath();
   var4x.moveTo(var4 * 0.2, var4 * 0.66);
   var4x.lineTo(var4 * 0.2, var4 * 0.8);
   var4x.lineTo(var4 * 0.8, var4 * 0.8);
   var4x.lineTo(var4 * 0.8, var4 * 0.66);
   r.draw(var4x);
});
            case 4 -> var10000 = iiIIlIIlIl(var2, var3, (r) -> {
   r.draw(new Line2D.Double(var4 * (double)0.5F, var4 * 0.62, var4 * (double)0.5F, var4 * 0.2));
   GeneralPath var3 = new GeneralPath();
   var3.moveTo(var4 * 0.32, var4 * 0.38);
   var3.lineTo(var4 * (double)0.5F, var4 * 0.2);
   var3.lineTo(var4 * 0.68, var4 * 0.38);
   r.draw(var3);
   GeneralPath var4x = new GeneralPath();
   var4x.moveTo(var4 * 0.2, var4 * 0.66);
   var4x.lineTo(var4 * 0.2, var4 * 0.8);
   var4x.lineTo(var4 * 0.8, var4 * 0.8);
   var4x.lineTo(var4 * 0.8, var4 * 0.66);
   r.draw(var4x);
});
            case 5 -> var10000 = iiIIlIIlIl(var2, var3, (r) -> {
   double var3 = var4 * 0.16;
   r.draw(new Ellipse2D.Double(var4 * 0.72 - var3 / (double)2.0F, var4 * 0.24 - var3 / (double)2.0F, var3, var3));
   r.draw(new Ellipse2D.Double(var4 * 0.28 - var3 / (double)2.0F, var4 * (double)0.5F - var3 / (double)2.0F, var3, var3));
   r.draw(new Ellipse2D.Double(var4 * 0.72 - var3 / (double)2.0F, var4 * 0.76 - var3 / (double)2.0F, var3, var3));
   r.draw(new Line2D.Double(var4 * 0.36, var4 * 0.45, var4 * 0.64, var4 * 0.29));
   r.draw(new Line2D.Double(var4 * 0.36, var4 * 0.55, var4 * 0.64, var4 * 0.71));
});
            case 6 -> var10000 = iiIIlIIlIl(var2, var3, (r) -> {
   r.draw(new Ellipse2D.Double(var4 * 0.2, var4 * 0.36, var4 * 0.28, var4 * 0.28));
   r.draw(new Line2D.Double(var4 * 0.48, var4 * (double)0.5F, var4 * 0.82, var4 * (double)0.5F));
   r.draw(new Line2D.Double(var4 * 0.68, var4 * (double)0.5F, var4 * 0.68, var4 * 0.62));
   r.draw(new Line2D.Double(var4 * 0.8, var4 * (double)0.5F, var4 * 0.8, var4 * 0.6));
});
            case 7 -> var10000 = iiIIlIIlIl(var2, var3, (r) -> {
   r.draw(new Ellipse2D.Double(var4 * 0.36, var4 * 0.18, var4 * 0.28, var4 * 0.28));
   r.draw(new Arc2D.Double(var4 * 0.22, var4 * 0.6, var4 * 0.56, var4 * 0.46, (double)0.0F, (double)180.0F, 0));
});
            case 8 -> var10000 = iiIIlIIlIl(var2, var3, (g) -> {
   g.draw(new Ellipse2D.Double(var4 * 0.2, var4 * 0.2, var4 * 0.6, var4 * 0.6));
   g.draw(new Ellipse2D.Double(var4 * 0.37, var4 * 0.2, var4 * 0.26, var4 * 0.6));
   g.draw(new Line2D.Double(var4 * 0.2, var4 * (double)0.5F, var4 * 0.8, var4 * (double)0.5F));
});
            case 9 -> var10000 = iiIIlIIlIl(var2, var3, (g) -> {
   GeneralPath var3 = new GeneralPath();
   var3.moveTo(var4 * 0.18, var4 * 0.3);
   var3.lineTo(var4 * 0.42, var4 * 0.3);
   var3.lineTo(var4 * (double)0.5F, var4 * 0.38);
   var3.lineTo(var4 * 0.82, var4 * 0.38);
   var3.lineTo(var4 * 0.82, var4 * 0.76);
   var3.lineTo(var4 * 0.18, var4 * 0.76);
   var3.closePath();
   g.draw(var3);
});
            case 10 -> var10000 = IiIIlliIIl(var2, var3, (r) -> {
   Area var3 = new Area(new RoundRectangle2D.Double(var4 * 0.14, var4 * 0.2, var4 * 0.36, var4 * 0.3, var4 * 0.12, var4 * 0.12));
   var3.add(new Area(new RoundRectangle2D.Double(var4 * 0.14, var4 * 0.32, var4 * 0.72, var4 * 0.48, var4 * 0.14, var4 * 0.14)));
   r.fill(var3);
});
            case 11 -> var10000 = iiIIlIIlIl(var2, var3, (r) -> {
   GeneralPath var3 = new GeneralPath();
   var3.moveTo(var4 * 0.2, var4 * 0.2);
   var3.lineTo(var4 * 0.68, var4 * 0.2);
   var3.lineTo(var4 * 0.8, var4 * 0.32);
   var3.lineTo(var4 * 0.8, var4 * 0.8);
   var3.lineTo(var4 * 0.2, var4 * 0.8);
   var3.closePath();
   r.draw(var3);
   r.draw(new Rectangle2D.Double(var4 * 0.34, var4 * 0.54, var4 * 0.32, var4 * 0.26));
   r.draw(new Line2D.Double(var4 * 0.34, var4 * 0.2, var4 * 0.34, var4 * 0.36));
   r.draw(new Line2D.Double(var4 * 0.34, var4 * 0.36, var4 * 0.6, var4 * 0.36));
   r.draw(new Line2D.Double(var4 * 0.6, var4 * 0.36, var4 * 0.6, var4 * 0.2));
});
            case 12 -> var10000 = iiIIlIIlIl(var2, var3, (r) -> {
   r.draw(new RoundRectangle2D.Double(var4 * 0.16, var4 * 0.3, var4 * 0.68, var4 * 0.4, var4 * 0.1, var4 * 0.1));
   r.draw(new Line2D.Double(var4 * 0.6, var4 * 0.36, var4 * 0.6, var4 * 0.44));
   r.draw(new Line2D.Double(var4 * 0.6, var4 * 0.56, var4 * 0.6, var4 * 0.64));
});
            case 13 -> var10000 = iiIIlIIlIl(var2, var3, (r) -> {
   r.draw(new Ellipse2D.Double(var4 * 0.2, var4 * 0.2, var4 * 0.42, var4 * 0.42));
   r.draw(new Line2D.Double(var4 * 0.57, var4 * 0.57, var4 * 0.8, var4 * 0.8));
});
            case 14 -> var10000 = iiIIlIIlIl(var2, var3, (g) -> {
   g.draw(new Line2D.Double(var4 * 0.28, var4 * 0.28, var4 * 0.72, var4 * 0.72));
   g.draw(new Line2D.Double(var4 * 0.72, var4 * 0.28, var4 * 0.28, var4 * 0.72));
});
            case 15 -> var10000 = IiIIlliIIl(var2, var3, (g) -> {
   double var3 = var4 * 0.13;
   g.fill(new Ellipse2D.Double(var4 * 0.24 - var3 / (double)2.0F, var4 * (double)0.5F - var3 / (double)2.0F, var3, var3));
   g.fill(new Ellipse2D.Double(var4 * (double)0.5F - var3 / (double)2.0F, var4 * (double)0.5F - var3 / (double)2.0F, var3, var3));
   g.fill(new Ellipse2D.Double(var4 * 0.76 - var3 / (double)2.0F, var4 * (double)0.5F - var3 / (double)2.0F, var3, var3));
});
            default -> var10000 = 0;
         }

         var9 ^= ((long)var10000 ^ var9) & -1L >>> 32;
         if ((int)var9 == 0) {
            return iIlIlllllill();
         } else {
            iliIlilIiIiiIlilIi.put(name, var2);
            return var2;
         }
      }
   }

   public static class_2960 IiIiliIiiiIi() {
      if (!IIlIlilIilIlIlilIi) {
         IIlIlilIilIlIlilIi = iiIIlIIlIl(lIilIilIiiIilIilIi, lIIlIliIIlIl<invokedynamic>(), (g) -> {
            double var1 = (double)32.0F;
            double var5 = 10.88;
            double var7 = 52.48;
            double var9 = 21.44;
            double var11 = 11.52;
            double var13 = 42.56;
            double var15 = 53.12;
            GeneralPath var17 = new GeneralPath();
            var17.moveTo(var1, var5);
            var17.lineTo(var7, var9);
            var17.lineTo(var7, var13);
            var17.lineTo(var1, var15);
            var17.lineTo(var11, var13);
            var17.lineTo(var11, var9);
            var17.closePath();
            g.draw(var17);
            double var20 = (double)32.0F;
            g.draw(new Line2D.Double(var1, var5, var1, var20));
            g.draw(new Line2D.Double(var11, var13, var1, var20));
            g.draw(new Line2D.Double(var7, var13, var1, var20));
         });
      }

      return lIilIilIiiIilIilIi;
   }

   public static class_2960 Illlllllilll() {
      if (!lliiIilIiiliiIilIi) {
         lliiIilIiiliiIilIi = IiIIlliIIl(ilIlIilIiIiIlIilIi, lIIlIliIIlIl<invokedynamic>(), (g) -> {
            g.fill(new RoundRectangle2D.Double(15.36, 19.2, 5.44, 25.6, 3.2, 3.2));
            GeneralPath var1 = new GeneralPath();
            var1.moveTo(47.36, 17.92);
            var1.lineTo(25.6, (double)32.0F);
            var1.lineTo(47.36, 46.08);
            var1.closePath();
            g.fill(var1);
         });
      }

      return ilIlIilIiIiIlIilIi;
   }

   public static class_2960 IllIllllIl(String name) {
      long var6 = 393182602230310193L;
      class_2960 var1 = (class_2960)liiIlilIiiiiIlilIi.get(name);
      if (var1 != null) {
         return var1;
      } else {
         class_2960 var2 = class_2960.method_60655(lIIlIliIIlIl<invokedynamic>(), lIIlIliIIlIl<invokedynamic>() + name);
         String var3 = lIIlIliIIlIl<invokedynamic>() + name;
         var6 ^= (-4294967296L ^ var6) & -1L << 32;
         switch (name.hashCode()) {
            case -991716523:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (0L ^ var6) & -1L << 32;
               }
               break;
            case -905826493:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (25769803776L ^ var6) & -1L << 32;
               }
               break;
            case -903340183:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (47244640256L ^ var6) & -1L << 32;
               }
               break;
            case -902467928:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (17179869184L ^ var6) & -1L << 32;
               }
               break;
            case -880905839:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (55834574848L ^ var6) & -1L << 32;
               }
               break;
            case 100913:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (51539607552L ^ var6) & -1L << 32;
               }
               break;
            case 110997:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (4294967296L ^ var6) & -1L << 32;
               }
               break;
            case 3064885:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (30064771072L ^ var6) & -1L << 32;
               }
               break;
            case 3540562:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (34359738368L ^ var6) & -1L << 32;
               }
               break;
            case 94755854:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (38654705664L ^ var6) & -1L << 32;
               }
               break;
            case 94756405:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (8589934592L ^ var6) & -1L << 32;
               }
               break;
            case 98128121:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (12884901888L ^ var6) & -1L << 32;
               }
               break;
            case 109641799:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (21474836480L ^ var6) & -1L << 32;
               }
               break;
            case 2061493789:
               if (name.equals(lIIlIliIIlIl<invokedynamic>())) {
                  var6 ^= (42949672960L ^ var6) & -1L << 32;
               }
         }

         switch ((int)(var6 >>> 32)) {
            case 0 -> Iiiiliiiiiii(var2, var3, (g) -> {
   g.fill(new Ellipse2D.Double(22.4, 8.96, 19.2, 19.2));
   Area var1 = new Area(new Ellipse2D.Double(11.52, (double)32.0F, 40.96, 35.84));
   var1.intersect(new Area(new Rectangle2D.Double((double)0.0F, (double)0.0F, (double)64.0F, 52.48)));
   g.fill(var1);
}, 0.0F, 2);
            case 1 -> Iiiiliiiiiii(var2, var3, (g) -> {
   GeneralPath var1 = new GeneralPath();
   var1.moveTo((double)32.0F, 52.48);
   var1.curveTo((double)32.0F, 52.48, 15.36, 33.28, 15.36, 24.32);
   var1.curveTo(15.36, 12.16, 48.64, 12.16, 48.64, 24.32);
   var1.curveTo(48.64, 33.28, (double)32.0F, 52.48, (double)32.0F, 52.48);
   var1.closePath();
   g.fill(var1);
}, 0.0F, 2);
            case 2 -> Iiiiliiiiiii(var2, var3, (g) -> {
   Area var1 = new Area();
   var1.add(new Area(new Ellipse2D.Double(8.96, 26.88, 21.76, 21.76)));
   var1.add(new Area(new Ellipse2D.Double(21.12, 17.92, 25.6, 25.6)));
   var1.add(new Area(new Ellipse2D.Double(33.28, 26.88, 21.76, 21.76)));
   var1.add(new Area(new RoundRectangle2D.Double(11.52, 35.84, 40.96, 12.8, 12.8, 12.8)));
   g.fill(var1);
}, 0.0F, 2);
            case 3 -> Iiiiliiiiiii(var2, var3, (g) -> {
   GeneralPath var1 = new GeneralPath();
   var1.moveTo(10.24, 33.28);
   var1.lineTo(23.04, 33.28);
   var1.lineTo(29.44, 19.2);
   var1.lineTo(37.12, 46.08);
   var1.lineTo(42.24, 33.28);
   var1.lineTo(55.04, 33.28);
   g.draw(var1);
}, 7.36F, 2);
            case 4 -> Iiiiliiiiiii(var2, var3, (g) -> {
   double var1 = 46.08;
   g.draw(new Line2D.Double(17.92, var1, 17.92, 38.4));
   g.draw(new Line2D.Double((double)32.0F, var1, (double)32.0F, 28.16));
   g.draw(new Line2D.Double(46.08, var1, 46.08, 17.92));
}, 7.36F, 2);
            case 5 -> Iiiiliiiiiii(var2, var3, (g) -> {
   GeneralPath var1 = new GeneralPath();
   var1.moveTo(21.76, 17.92);
   var1.lineTo(33.28, (double)32.0F);
   var1.lineTo(21.76, 46.08);
   GeneralPath var2 = new GeneralPath();
   var2.moveTo(34.56, 17.92);
   var2.lineTo(46.08, (double)32.0F);
   var2.lineTo(34.56, 46.08);
   g.draw(var1);
   g.draw(var2);
}, 7.36F, 2);
            case 6 -> Iiiiliiiiiii(var2, var3, (g) -> {
   double var1 = 12.8;
   double var3 = 38.4;
   double var5 = 9.92;
   double var7 = 3.52;
   g.fill(new RoundRectangle2D.Double(var1, 15.36, var3, var5, var7, var7));
   g.fill(new RoundRectangle2D.Double(var1, 27.04, var3, var5, var7, var7));
   g.fill(new RoundRectangle2D.Double(var1, 38.72, var3, var5, var7, var7));
}, 0.0F, 2);
            case 7 -> Iiiiliiiiiii(var2, var3, (g) -> {
   double var1 = (double)32.0F;
   double var3 = 10.88;
   double var5 = 52.48;
   double var7 = 21.44;
   double var9 = 11.52;
   double var11 = 42.56;
   double var13 = 53.12;
   GeneralPath var15 = new GeneralPath();
   var15.moveTo(var1, var3);
   var15.lineTo(var5, var7);
   var15.lineTo(var5, var11);
   var15.lineTo(var1, var13);
   var15.lineTo(var9, var11);
   var15.lineTo(var9, var7);
   var15.closePath();
   g.draw(var15);
   g.draw(new Line2D.Double(var9, var7, var1, (double)32.0F));
   g.draw(new Line2D.Double(var5, var7, var1, (double)32.0F));
   g.draw(new Line2D.Double(var1, (double)32.0F, var1, var13));
}, 6.4511995F, 2);
            case 8 -> Iiiiliiiiiii(var2, var3, (g) -> g.fill(iIIIlIlIIl((double)32.0F, 33.28, 26.88, 11.2)), 0.0F, 2);
            case 9 -> Iiiiliiiiiii(var2, var3, (g) -> {
   g.draw(new Ellipse2D.Double(10.88, 10.88, 42.24, 42.24));
   g.draw(new Line2D.Double((double)32.0F, (double)32.0F, (double)32.0F, 20.48));
   g.draw(new Line2D.Double((double)32.0F, (double)32.0F, 44.8, (double)32.0F));
}, 7.36F, 2);
            case 10 -> Iiiiliiiiiii(var2, var3, (g) -> {
   g.fill(lllllillll(26.88, 34.56, 19.2));
   g.fill(lllllillll(47.36, 16.64, 8.96));
}, 0.0F, 2);
            case 11 -> Iiiiliiiiiii(var2, var3, (g) -> {
   GeneralPath var1 = new GeneralPath();
   var1.moveTo((double)32.0F, 10.24);
   var1.lineTo(51.2, 17.28);
   var1.curveTo(51.2, 38.4, 46.08, 48.64, (double)32.0F, 55.04);
   var1.curveTo(17.92, 48.64, 12.8, 38.4, 12.8, 17.28);
   var1.closePath();
   g.fill(var1);
}, 0.0F, 2);
            case 12 -> Iiiiliiiiiii(var2, var3, (g) -> {
   GeneralPath var1 = new GeneralPath();
   var1.moveTo(7.68, (double)32.0F);
   var1.quadTo((double)32.0F, 6.4, 56.32, (double)32.0F);
   var1.quadTo((double)32.0F, 57.6, 7.68, (double)32.0F);
   var1.closePath();
   g.draw(var1);
   double var2 = 14.08;
   g.fill(new Ellipse2D.Double((double)32.0F - var2 / (double)2.0F, (double)32.0F - var2 / (double)2.0F, var2, var2));
}, 6.4511995F, 2);
            case 13 -> Iiiiliiiiiii(var2, var3, (g) -> {
   g.draw(new Ellipse2D.Double(10.88, 10.88, 42.24, 42.24));
   double var1 = 15.36;
   g.fill(new Ellipse2D.Double((double)32.0F - var1 / (double)2.0F, (double)32.0F - var1 / (double)2.0F, var1, var1));
}, 7.36F, 2);
         }

         liiIlilIiiiiIlilIi.put(name, var2);
         return var2;
      }
   }

   private static boolean iIlllIllll(class_2960 paint, String res, int stroke, float id, float grid, lilIIiIliilIIiIl label) {
      long var11 = 209270383871161962L;

      try {
         BufferedImage var6 = new BufferedImage(stroke, stroke, 2);
         Graphics2D var7 = var6.createGraphics();
         var7.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         var7.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
         var7.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
         var7.setColor(Color.WHITE);
         var7.scale((double)((float)stroke / id), (double)((float)stroke / id));
         var7.setStroke(new BasicStroke(grid, 1, 1));
         label.paint(var7);
         var7.dispose();
         class_1011 var8 = new class_1011(stroke, stroke, false);
         int[] var9 = var6.getRGB(0, 0, stroke, stroke, (int[])null, 0, stroke);

         for(long var14 = var11 ^ (0L ^ var11) & -1L << 32; (int)(var14 >>> 32) < var9.length; var14 += 4294967296L) {
            var8.method_61941((int)(var14 >>> 32) % stroke, (int)(var14 >>> 32) / stroke, var9[(int)(var14 >>> 32)] & -16777216 | 16777215);
         }

         class_1043 var10 = new class_1043(() -> res, var8);
         class_310.method_1551().method_1531().method_4616(paint, var10);
         return true;
      } catch (Throwable var13) {
         return false;
      }
   }

   private static boolean IiIIlliIIl(class_2960 id, String label, lilIIiIliilIIiIl paint) {
      return lIlIliIlIl(id, label, paint, 0.0F);
   }
}
