package gg.corz;

import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;

public record IIiIllIiIl(class_2338 cell, boolean release, class_243 feetAt, class_238 boxAt) {
   private final class_243 IllllIllllllIl;
   private final class_2338 iiIllIlIIlllIl;
   private final class_238 illllIlIilllIl;
   private final boolean lIlllIliIlllIl;

   public IIiIllIiIl(class_2338 cell, boolean release) {
      this(cell, release, (class_243)null, (class_238)null);
   }

   public class_243 iIlIlllllill() {
      return this.IllllIllllllIl;
   }

   public class_2338 IliIlllilIi() {
      return this.iiIllIlIIlllIl;
   }

   public boolean liiiIIllIl() {
      return this.lIlllIliIlllIl;
   }

   public class_238 IilliliilIIi() {
      return this.illllIlIilllIl;
   }

   public IIiIllIiIl(class_2338 feetAt, boolean cell, class_243 release, class_238 boxAt) {
      this.iiIllIlIIlllIl = feetAt;
      this.lIlllIliIlllIl = cell;
      this.IllllIllllllIl = release;
      this.illllIlIilllIl = boxAt;
   }
}
