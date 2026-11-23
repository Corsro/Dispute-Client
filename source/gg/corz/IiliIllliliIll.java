package gg.corz;

import java.nio.file.Path;
import java.util.Map;

public record IiliIllliliIll(String name, Path zip, Map<String, String> entries) {
   private final Path iiliiIlilIIiiiIlil;
   private final Map<String, String> lIiiiIliliIiiiIlil;
   private final String IiliiIlilliliiIlil;

   public Map<String, String> iIlIlllllill() {
      return this.lIiiiIliliIiiiIlil;
   }

   public IiliIllliliIll(String zip, Path entries, Map<String, String> name) {
      this.IiliiIlilliliiIlil = zip;
      this.iiliiIlilIIiiiIlil = entries;
      this.lIiiiIliliIiiiIlil = name;
   }

   public Path liiiIIllIl() {
      return this.iiliiIlilIIiiiIlil;
   }

   public String IliIlllilIi() {
      return this.IiliiIlilliliiIlil;
   }
}
