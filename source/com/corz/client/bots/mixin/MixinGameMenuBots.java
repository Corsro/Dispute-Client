package com.corz.client.bots.mixin;

import com.corz.client.bots.CorzBotsScreen;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_4185;
import net.minecraft.class_433;
import net.minecraft.class_437;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_433.class})
public abstract class MixinGameMenuBots extends class_437 {
   protected MixinGameMenuBots(class_2561 title) {
      super(title);
   }

   @Inject(method = {"method_25426()V"}, at = {@At("TAIL")})
   private void corzbots$addPauseButton(CallbackInfo ci) {
      this.method_37063(
         class_4185.method_46430(
            class_2561.method_43470("§eDispute Bots"),
            (btn) -> class_310.method_1551().method_1507(new CorzBotsScreen())
         ).method_46434(Math.max(8, this.field_22789 - 108), 8, 100, 20).method_46431()
      );
   }
}
