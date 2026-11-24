package gg.corz.rpc;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public final class CombatWire {
   private static final Gson GSON = new Gson();

   private CombatWire() {
   }

   public static JsonObject snapshot(Object obj) {
      if (obj == null) {
         return new JsonObject();
      }
      return GSON.toJsonTree(obj).getAsJsonObject();
   }

   public static <T> T read(Class<T> type, JsonObject json) {
      if (json == null) {
         return null;
      }
      try {
         return GSON.fromJson(json, type);
      } catch (Exception e) {
         return null;
      }
   }
}
