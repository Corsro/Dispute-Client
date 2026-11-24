package corzbot.gui;

import net.minecraft.class_332;

public final class Ui {
   private Ui() {
   }

   public static void box(class_332 g, int x, int y, int w, int h, int color) {
      g.method_25294(x, y, x + w, y + h, color);
   }
}
