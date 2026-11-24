package com.corz.client.bots.mixin;

import com.corz.client.bots.CorzBotsAddon;
import net.minecraft.class_634;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_634.class})
public class MixinChatBots {
   @Inject(method = {"method_45729(Ljava/lang/String;)V"}, at = {@At("HEAD")}, cancellable = true)
   private void corzbots$onChatMessage(String content, CallbackInfo ci) {
      if (CorzBotsAddon.handleCommand(content)) {
         ci.cancel();
      }
   }

   @Inject(method = {"method_45730(Ljava/lang/String;)V"}, at = {@At("HEAD")}, cancellable = true)
   private void corzbots$onChatCommand(String command, CallbackInfo ci) {
      if (CorzBotsAddon.handleCommand("/" + command)) {
         ci.cancel();
      }
   }
}
