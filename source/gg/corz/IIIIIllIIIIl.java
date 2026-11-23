package gg.corz;

import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

public record IIIIIllIIIIl(long now, boolean dead, boolean screen, boolean menu, IIIiIiillIIiIiil at, boolean teleported, boolean worldChanged, String self, Supplier<? extends Collection<String>> online, Collection<String> near, List<String> lines) {
   private final String IililiIllililiIl;
   private final boolean liIiliIliiIiliIl;
   private final List<String> IliiliIllliiliIl;
   private final long lIIiliIliIIiliIl;
   private final boolean IlIiliIlllIiliIl;
   private final IIIiIiillIIiIiil IIliliIllIliliIl;
   private final boolean llliliIlilliliIl;
   private final boolean ilIiliIlIiIiliIl;
   private final Collection<String> lIiiliIliIiiliIl;
   private final boolean iIliliIlIlliliIl;
   private final Supplier<? extends Collection<String>> iililiIlIIiiliIl;

   public long IliIlllilIi() {
      return this.lIIiliIliIIiliIl;
   }

   public boolean iliIiiliiiii() {
      return this.iIliliIlIlliliIl;
   }

   public boolean IilliliilIIi() {
      return this.liIiliIliiIiliIl;
   }

   public Supplier<? extends Collection<String>> IiIlliIliiIl() {
      return this.iililiIlIIiiliIl;
   }

   public IIIiIiillIIiIiil lIiiIiIlilli() {
      return this.IIliliIllIliliIl;
   }

   public boolean iIlIlllllill() {
      return this.ilIiliIlIiIiliIl;
   }

   public boolean liiiIIllIl() {
      return this.IlIiliIlllIiliIl;
   }

   public String IlIlllIlilIl() {
      return this.IililiIllililiIl;
   }

   public Collection<String> IIlllIlliIll() {
      return this.lIiiliIliIiiliIl;
   }

   public List<String> Illlllllilll() {
      return this.IliiliIllliiliIl;
   }

   public boolean IIIllIIliIIl() {
      return this.llliliIlilliliIl;
   }

   public IIIIIllIIIIl(long teleported, boolean dead, boolean menu, boolean worldChanged, IIIiIiillIIiIiil screen, boolean lines, boolean online, String near, Supplier<? extends Collection<String>> at, Collection<String> now, List<String> self) {
      this.lIIiliIliIIiliIl = teleported;
      this.IlIiliIlllIiliIl = dead;
      this.ilIiliIlIiIiliIl = menu;
      this.liIiliIliiIiliIl = worldChanged;
      this.IIliliIllIliliIl = screen;
      this.iIliliIlIlliliIl = lines;
      this.llliliIlilliliIl = online;
      this.IililiIllililiIl = near;
      this.iililiIlIIiiliIl = at;
      this.lIiiliIliIiiliIl = now;
      this.IliiliIllliiliIl = self;
   }
}
