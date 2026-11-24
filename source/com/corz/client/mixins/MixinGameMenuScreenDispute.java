package com.corz.client.mixins;

import gg.corz.IIlillIIi;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_4185;
import net.minecraft.class_433;
import net.minecraft.class_437;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Adds a 1-tap "Dispute GUI" button to the Minecraft Pause Menu so Mojo Launcher
 * touchscreen users can open the ClickGUI without requiring a physical Right-Shift key.
 */
@Mixin({class_433.class})
public abstract class MixinGameMenuScreenDispute extends class_437 {
   protected MixinGameMenuScreenDispute(class_2561 title) {
      super(title);
   }

   @Inject(
      method = {"method_25426()V"},
      at = {@At("TAIL")}
   )
   private void dispute$addPauseGuiButton(CallbackInfo ci) {
      int btnX = Math.max(8, this.field_22789 - 108);
      this.method_37063(
         class_4185.method_46430(
            class_2561.method_43470("\u00a7eDispute GUI"),
            btn -> class_310.method_1551().method_1507(new IIlillIIi())
         ).method_46434(btnX, 8, 100, 20).method_46431()
      );
   }
}
