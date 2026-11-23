package gg.corz;

import java.util.List;
import java.util.function.Predicate;

public record IilIiilllilIiill(long now, IIIiIiillIIiIiil at, boolean ground, boolean menu, boolean dead, List<String> lines, Predicate<String> online) {
   private final boolean iiIliliill;
   private final List<String> lIlliliill;
   private final IIIiIiillIIiIiil IiIliliill;
   private final long ilIliliill;
   private final Predicate<String> iIlliliill;
   private final boolean liIliliill;
   private final boolean IIlliliill;

   public boolean IilliliilIIi() {
      return this.iiIliliill;
   }

   public boolean lIiiIiIlilli() {
      return this.IIlliliill;
   }

   public Predicate<String> IIIllIIliIIl() {
      return this.iIlliliill;
   }

   public IIIiIiillIIiIiil liiiIIllIl() {
      return this.IiIliliill;
   }

   public boolean iIlIlllllill() {
      return this.liIliliill;
   }

   public IilIiilllilIiill(long lines, IIIiIiillIIiIiil dead, boolean online, boolean at, boolean menu, List<String> now, Predicate<String> ground) {
      this.ilIliliill = lines;
      this.IiIliliill = dead;
      this.liIliliill = online;
      this.iiIliliill = at;
      this.IIlliliill = menu;
      this.lIlliliill = now;
      this.iIlliliill = ground;
   }

   public List<String> iliIiiliiiii() {
      return this.lIlliliill;
   }

   public long IliIlllilIi() {
      return this.ilIliliill;
   }
}
