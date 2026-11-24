package com.corz.client.mixins;

import com.corz.client.android.MojoInputBridge;
import gg.corz.IIlIl;
import net.minecraft.class_1041;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin({class_1041.class})
public class MixinWindow {
   @ModifyVariable(
      method = {"method_4476(IZ)I"},
      at = @At("HEAD"),
      argsOnly = true,
      ordinal = 0
   )
   private int corz$forceCorzGuiScale(int guiScale) {
      class_310 mc = class_310.method_1551();
      if (mc != null && mc.field_1755 instanceof IIlIl) {
         class_1041 self = (class_1041)(Object)this;
         int fbW = self.method_4489();
         int fbH = self.method_4506();
         return MojoInputBridge.adaptGuiScaleForMobile(IIlIl.III(fbW, fbH), fbW, fbH);
      } else {
         return guiScale;
      }
   }
}
