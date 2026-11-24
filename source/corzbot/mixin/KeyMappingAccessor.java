package corzbot.mixin;

import net.minecraft.class_304;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(class_304.class)
public interface KeyMappingAccessor {
   @Accessor("field_1653")
   void corzbot$setDown(boolean down);
}
