package com.corz.client.mixins;

import com.corz.client.android.MojoInputBridge;
import gg.corz.IIIiiilI;
import gg.corz.IIIilliI;
import net.minecraft.class_11908;
import net.minecraft.class_309;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_309.class})
public class MixinKeyboard {
   @Inject(
      method = {"method_1466(JILnet/minecraft/class_11908;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onKey(long window, int action, class_11908 input, CallbackInfo ci) {
      MojoInputBridge.onKeyCallback(input.comp_4795(), action);
      IIIiiilI event = new IIIiiilI(input.comp_4795(), action);
      IIIilliI.IIIli(event);
      if (event.IIi()) {
         ci.cancel();
      }
   }
}
