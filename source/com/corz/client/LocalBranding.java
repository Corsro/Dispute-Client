package com.corz.client;

/**
 * Dispute Client v2.0.3 dynamic runtime branding helper.
 * Formats client titles, watermark strings, and UI labels while stripping
 * upstream crack/hijack strings.
 */
public final class LocalBranding {
   private LocalBranding() {
   }

   public static String clientName() {
      return "Dispute Client";
   }

   public static String clientVersion() {
      return "2.0.3";
   }

   private static String kwCracked() {
      return new StringBuilder("CorzClient").append("CrackedBYM4").toString();
   }

   private static String kwMogwarts() {
      return new StringBuilder("Mog").append("warts").toString();
   }

   private static String kwMogwartsTop() {
      return new StringBuilder("Mog").append("warts on Top").toString();
   }

   private static String kwOwned() {
      return new StringBuilder("Owned").append("byM4").toString();
   }

   public static String rowValue(String key, String fallback) {
      if (key != null && key.strip().equalsIgnoreCase("Device id")) {
         return "Dispute Client";
      }
      if (fallback != null) {
         if (fallback.contains(kwMogwarts()) || fallback.contains(kwOwned()) || fallback.contains(kwCracked())) {
            return "Dispute Client";
         }
         return text(fallback);
      }
      return null;
   }

   public static String text(String val) {
      if (val == null) {
         return null;
      }
      if ("corz.gg".equalsIgnoreCase(val)
         || "corz client".equalsIgnoreCase(val)
         || "corzclient".equalsIgnoreCase(val)
         || "corz".equalsIgnoreCase(val)
         || kwOwned().equalsIgnoreCase(val)
         || kwMogwartsTop().equalsIgnoreCase(val)
         || kwCracked().equalsIgnoreCase(val)) {
         return "Dispute Client";
      }
      String out = val;
      if (out.contains(kwCracked())) {
         out = out.replace(kwCracked(), "Dispute Client");
      }
      if (out.contains(kwMogwartsTop())) {
         out = out.replace(kwMogwartsTop(), "Dispute Client");
      }
      if (out.contains(kwOwned())) {
         out = out.replace(kwOwned(), "Dispute Client");
      }
      if (out.contains("Corz Client")) {
         out = out.replace("Corz Client", "Dispute Client");
      }
      if (out.contains("CorzClient")) {
         out = out.replace("CorzClient", "Dispute Client");
      }
      if (out.contains("CORZ CLIENT")) {
         out = out.replace("CORZ CLIENT", "DISPUTE CLIENT");
      }
      if (out.contains("corz.gg")) {
         out = out.replace("corz.gg", "dispute.gg");
      }
      return out;
   }

   public static String[] texts(String[] arr) {
      if (arr == null) {
         return null;
      }
      String[] copy = new String[arr.length];
      for (int i = 0; i < arr.length; i++) {
         copy[i] = text(arr[i]);
      }
      return copy;
   }
}
