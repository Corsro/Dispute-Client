package gg.corz;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class liiIlliiiIll {
   private final HashMap<Long, LinkedHashMap<Long, Integer>> IllIlIIilllIlIIi = new HashMap();
   private String illIlIIiIilIlIIi = "";
   public static final int lIlIlIIiiIlIlIIi = 512;

   public int iliIiiliiiii() {
      return this.IllIlIIilllIlIIi.size();
   }

   public void IIIllIIliIIl() {
      this.IllIlIIilllIlIIi.clear();
      this.illIlIIiIilIlIIi = "";
   }

   public int IliIlllilIi(long stand, long component, String failureClass) {
      this.illIlIIiIilIlIIi = failureClass == null ? "" : failureClass;
      LinkedHashMap var6 = (LinkedHashMap)this.IllIlIIilllIlIIi.computeIfAbsent(component, (k) -> new LinkedHashMap<Long, Integer>(this, 16, 0.75F) {
            protected boolean removeEldestEntry(Map.Entry<Long, Integer> e) {
               return this.size() > 512;
            }
         });
      return (Integer)var6.merge(stand, 1, Integer::sum);
   }

   public String lIiiIiIlilli() {
      return this.illIlIIiIilIlIIi;
   }

   public Set<Long> iIlIlllllill(long component) {
      Map var3 = (Map)this.IllIlIIilllIlIIi.get(component);
      return var3 == null ? Set.of() : Collections.unmodifiableSet(var3.keySet());
   }

   public int IilliliilIIi(long stand, long component) {
      Map var5 = (Map)this.IllIlIIilllIlIIi.get(component);
      return var5 == null ? 0 : (Integer)var5.getOrDefault(stand, 0);
   }

   public boolean liiiIIllIl(long stand, long component) {
      Map var5 = (Map)this.IllIlIIilllIlIIi.get(component);
      return var5 != null && var5.containsKey(stand);
   }
}
