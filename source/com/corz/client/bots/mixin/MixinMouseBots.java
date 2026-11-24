package com.corz.client.bots.mixin;

import com.corz.client.bots.MaceSpearBot;
import de.neo.uhcbot.UhcBotMod;
import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_312.class})
public class MixinMouseBots {
   @Inject(method = {"method_55793()V"}, at = {@At("HEAD")})
   private void corzbots$onFrame(CallbackInfo ci) {
      UhcBotMod.onFrame();
      MaceSpearBot.INSTANCE.onFrame();
   }
}
