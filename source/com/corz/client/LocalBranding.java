package com.corz.client;

/**
 * Dispute Client dynamic runtime branding helper.
 * Formats client titles, watermark strings, and UI labels.
 */
public final class LocalBranding {
   private LocalBranding() {
   }

   public static String clientName() {
      return "Dispute Client";
   }

   public static String clientVersion() {
      return "2.0.1";
   }

   public static String rowValue(String key, String fallback) {
      if (key != null && key.strip().equalsIgnoreCase("Device id")) {
         return "Dispute Client";
      }
      return fallback;
   }

   public static String text(String val) {
      if (val == null) {
         return null;
      }
      if ("corz.gg".equalsIgnoreCase(val) || "corz client".equalsIgnoreCase(val) || "corz".equalsIgnoreCase(val)) {
         return "Dispute Client";
      }
      if (val.contains("Corz Client")) {
         return val.replace("Corz Client", "Dispute Client");
      }
      if (val.contains("CorzClient")) {
         return val.replace("CorzClient", "Dispute Client");
      }
      if (val.contains("CORZ CLIENT")) {
         return val.replace("CORZ CLIENT", "DISPUTE CLIENT");
      }
      if (val.contains("corz.gg")) {
         return val.replace("corz.gg", "dispute.gg");
      }
      return val;
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
