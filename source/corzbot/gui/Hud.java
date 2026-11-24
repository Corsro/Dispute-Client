package corzbot.gui;

import corzbot.Bot;
import corzbot.Config;
import corzbot.CorzBot;
import net.minecraft.class_1657;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_9779;

public final class Hud {
   private Hud() {
   }

   public static void render(class_332 g, class_9779 delta) {
      class_310 mc = class_310.method_1551();
      Config c = CorzBot.CONFIG;
      Bot b = CorzBot.BOT;
      if (c.hud && b != null && b.isEnabled() && mc.field_1724 != null && !mc.field_1690.field_1842 && !(mc.field_1755 instanceof BotScreen)) {
         class_327 f = mc.field_1772;
         class_1657 t = b.target;
         String head = "DISPUTE BOT";
         String var13 = c.reaction.label;
         String var14 = c.mode.label;
         String sub = var14 + " · " + var13;
         String var10000;
         if (t == null) {
            var10000 = "No target";
         } else {
            var10000 = t.method_5477().getString();
            String var10001 = String.format("%.1fm", t.method_5739(mc.field_1724));
            int var15 = Math.round(t.method_6032());
            String var16 = var10001;
            String var17 = var10000;
            var10000 = var17 + "  " + var16 + "  " + var15 + " ♥";
         }

         String target = var10000;
         int w = Math.max(f.method_1727(head) + 8 + f.method_1727(sub), Math.max(f.method_1727(target), f.method_1727(b.doing))) + 16;
         int x = 6;
         int y = 6;
         Ui.box(g, x, y, w, 44, -1072689132);
         g.method_25294(x + 6, y + 8, x + 9, y + 11, -12200829);
         g.method_51433(f, head, x + 13, y + 6, -9663233, false);
         g.method_51433(f, sub, x + 21 + f.method_1727(head), y + 6, -7566182, false);
         g.method_51433(f, target, x + 8, y + 19, -1447439, false);
         g.method_51433(f, b.doing, x + 8, y + 31, -9663233, false);
      }
   }
}
