package corzbot.gui;

import corzbot.CorzBot;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_4185;
import net.minecraft.class_437;

public final class BotScreen extends class_437 {
   public BotScreen() {
      super(class_2561.method_43470("Dispute SMP Bot"));
   }

   @Override
   protected void method_25426() {
      int cx = this.field_22789 / 2;
      int cy = this.field_22790 / 2;

      this.method_37063(
         class_4185.method_46430(
            class_2561.method_43470(CorzBot.BOT.isEnabled() ? "§aBot Enabled" : "§cBot Disabled"),
            btn -> {
               CorzBot.BOT.setEnabled(!CorzBot.BOT.isEnabled());
               btn.method_25355(class_2561.method_43470(CorzBot.BOT.isEnabled() ? "§aBot Enabled" : "§cBot Disabled"));
            }
         ).method_46434(cx - 100, cy - 20, 200, 20).method_46431()
      );

      this.method_37063(
         class_4185.method_46430(
            class_2561.method_43470("Back"),
            btn -> this.method_25419()
         ).method_46434(cx - 100, cy + 10, 200, 20).method_46431()
      );
   }

   @Override
   public void method_25394(class_332 context, int mouseX, int mouseY, float delta) {
      super.method_25394(context, mouseX, mouseY, delta);
      context.method_51433(this.field_22793, "Dispute SMP PvP Bot", this.field_22789 / 2 - 60, 20, 0xFFFFFF, true);
   }
}
