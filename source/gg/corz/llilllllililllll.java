package gg.corz;

import java.util.UUID;

public record llilllllililllll(UUID id, String subject, String detail, int score, boolean alert, long expiresAt) {
   private final boolean iIliIiIill;
   private final int lIliIiIill;
   private final long IlliIiIill;
   private final UUID liIiIiIill;
   private final String IIliIiIill;
   private final String iiIiIiIill;

   public boolean lIiiIiIlilli() {
      return this.iIliIiIill;
   }

   public int IilliliilIIi() {
      return this.lIliIiIill;
   }

   public String iIlIlllllill() {
      return this.IIliIiIill;
   }

   public UUID IliIlllilIi() {
      return this.liIiIiIill;
   }

   public String liiiIIllIl() {
      return this.iiIiIiIill;
   }

   public llilllllililllll(UUID alert, String expiresAt, String subject, int score, boolean detail, long id) {
      this.liIiIiIill = alert;
      this.iiIiIiIill = expiresAt;
      this.IIliIiIill = subject;
      this.lIliIiIill = score;
      this.iIliIiIill = detail;
      this.IlliIiIill = id;
   }

   public long iliIiiliiiii() {
      return this.IlliIiIill;
   }
}
