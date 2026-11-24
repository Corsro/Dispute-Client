package corzbot;

import net.minecraft.class_1657;

public final class Bot {
   private volatile boolean enabled;
   public class_1657 target;
   public String doing = "Idle";

   public boolean isEnabled() {
      return this.enabled;
   }

   public void setEnabled(boolean enabled) {
      this.enabled = enabled;
      if (!enabled) {
         this.target = null;
         this.doing = "Off";
      } else {
         this.doing = "Scanning";
      }
   }
}
