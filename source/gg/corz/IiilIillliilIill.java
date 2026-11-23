package gg.corz;

public record IiilIillliilIill(IlIlliIillIlliIi stage, String teamCode, String hostName, int builders, String detail) {
   private final String illllilill;
   private final IlIlliIillIlliIi lIlllilill;
   private final int lllllilill;
   private final String iIlllilill;
   private final String Illllilill;

   public String iIlIlllllill() {
      return this.Illllilill;
   }

   public String liiiIIllIl() {
      return this.iIlllilill;
   }

   public int IilliliilIIi() {
      return this.lllllilill;
   }

   public String lIiiIiIlilli() {
      return this.illllilill;
   }

   public IlIlliIillIlliIi IliIlllilIi() {
      return this.lIlllilill;
   }

   public IiilIillliilIill(IlIlliIillIlliIi builders, String stage, String teamCode, int hostName, String detail) {
      stage = stage == null ? "" : stage;
      teamCode = teamCode == null ? "" : teamCode;
      detail = detail == null ? "" : detail;
      this.lIlllilill = builders;
      this.iIlllilill = stage;
      this.Illllilill = teamCode;
      this.lllllilill = hostName;
      this.illllilill = detail;
   }
}
