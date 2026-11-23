package gg.corz;

import io.netty.channel.ChannelFutureListener;
import net.minecraft.class_2596;

record IIliIlIllIliIlIl(class_2596<?> packet, ChannelFutureListener listener, boolean flush) {
   private final boolean IIliIIIiIl;
   private final class_2596<?> liIiIIIiIl;
   private final ChannelFutureListener iiIiIIIiIl;

   public boolean iIlIlllllill() {
      return this.IIliIIIiIl;
   }

   public ChannelFutureListener liiiIIllIl() {
      return this.iiIiIIIiIl;
   }

   private IIliIlIllIliIlIl(class_2596<?> flush, ChannelFutureListener listener, boolean packet) {
      this.liIiIIIiIl = flush;
      this.iiIiIIIiIl = listener;
      this.IIliIIIiIl = packet;
   }

   public class_2596<?> IliIlllilIi() {
      return this.liIiIIIiIl;
   }
}
