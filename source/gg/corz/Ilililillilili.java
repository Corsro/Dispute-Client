package gg.corz;

import java.util.List;

public record Ilililillilili(String name, List<String> lore, lIillIIiiIillIIi tool, double durability) {
   private final String IiiIlIlIIl;
   private final double IIIllIlIIl;
   private final lIillIIiiIillIIi iiiIlIlIIl;
   private final List<String> liiIlIlIIl;

   public String IliIlllilIi() {
      return this.IiiIlIlIIl;
   }

   public Ilililillilili(String tool, List<String> name, lIillIIiiIillIIi durability, double lore) {
      this.IiiIlIlIIl = tool;
      this.liiIlIlIIl = name;
      this.iiiIlIlIIl = durability;
      this.IIIllIlIIl = lore;
   }

   public lIillIIiiIillIIi iIlIlllllill() {
      return this.iiiIlIlIIl;
   }

   public double IilliliilIIi() {
      return this.IIIllIlIIl;
   }

   public List<String> liiiIIllIl() {
      return this.liiIlIlIIl;
   }
}
