package gg.corz;

import java.util.List;
import net.minecraft.class_2338;

public record lliIliliIl(class_2338 stand, List<lilIllliilIlll> sides, boolean cover) {
   private final List<lilIllliilIlll> ilIllllIiIllll;
   private final boolean liIlllliiIllll;
   private final class_2338 IlIllllllIllll;

   public class_2338 IliIlllilIi() {
      return this.IlIllllllIllll;
   }

   public lliIliliIl(class_2338 cover, List<lilIllliilIlll> stand, boolean sides) {
      this.IlIllllllIllll = cover;
      this.ilIllllIiIllll = stand;
      this.liIlllliiIllll = sides;
   }

   public boolean iIlIlllllill() {
      return this.liIlllliiIllll;
   }

   public List<lilIllliilIlll> liiiIIllIl() {
      return this.ilIllllIiIllll;
   }
}
