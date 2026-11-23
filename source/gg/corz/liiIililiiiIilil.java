package gg.corz;

public record liiIililiiiIilil(lIiliiliIiliil cell, String name, Ililliillillii kind, int facing, IIiIllillIiIllil shape, boolean interactive, lIiliiliIiliil partner, int supportDir) {
   private final int IlilIlIlil;
   private final IIiIllillIiIllil llilIlIlil;
   private final lIiliiliIiliil IIilIlIlil;
   private final Ililliillillii iIilIlIlil;
   private final int liilIlIlil;
   private final String lIilIlIlil;
   private final lIiliiliIiliil IiilIlIlil;
   private final boolean ililIlIlil;

   public int lIiiIiIlilli() {
      return this.IlilIlIlil;
   }

   public lIiliiliIiliil IlIlllIlilIl() {
      return this.IiilIlIlil;
   }

   public liiIililiiiIilil(lIiliiliIiliil cell, String kind, Ililliillillii shape, int name, IIiIllillIiIllil interactive, boolean facing, lIiliiliIiliil partner) {
      this(cell, kind, shape, name, interactive, facing, partner, -1);
   }

   public boolean IliIlllilIi() {
      return this.iIilIlIlil == Ililliillillii.lIliIliIIl;
   }

   public IIiIllillIiIllil iliIiiliiiii() {
      return this.llilIlIlil;
   }

   public String iIlIlllllill() {
      return this.lIilIlIlil;
   }

   public boolean IIIllIIliIIl() {
      return this.ililIlIlil;
   }

   public liiIililiiiIilil(lIiliiliIiliil cell, String supportDir, Ililliillillii kind, int interactive, IIiIllillIiIllil facing, boolean name, lIiliiliIiliil shape, int partner) {
      this.IIilIlIlil = cell;
      this.lIilIlIlil = supportDir;
      this.iIilIlIlil = kind;
      this.IlilIlIlil = interactive;
      this.llilIlIlil = facing;
      this.ililIlIlil = name;
      this.IiilIlIlil = shape;
      this.liilIlIlil = partner;
   }

   public Ililliillillii IilliliilIIi() {
      return this.iIilIlIlil;
   }

   public int IiIlliIliiIl() {
      return this.liilIlIlil;
   }

   public lIiliiliIiliil liiiIIllIl() {
      return this.IIilIlIlil;
   }
}
