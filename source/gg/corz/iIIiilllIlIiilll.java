package gg.corz;

final class iIIiilllIlIiilll {
   liIIliIliiIIliIl IiIiiIlill;
   boolean IIliiIlill;
   final String IlIiiIlill;
   iIilliIlIlilliIl llIiiIlill;
   IlIIllillIIlli liIiiIlill;
   lIlIlilliIlIlill lIliiIlill;
   long iiIiiIlill;
   int llliiIlill = -1;
   int IlliiIlill = -1;
   int illiiIlill = -1;
   lliiIIIliliiIIIl ilIiiIlill;
   IlIIllillIIlli iIliiIlill;
   float IiliiIlill = 1.0F;

   void IliIlllilIi() {
      if (this.ilIiiIlill != null) {
         this.ilIiiIlill.IliIlllilIi();
      }

      this.ilIiiIlill = null;
      if (this.lIliiIlill != null) {
         this.lIliiIlill.IliIlllilIi();
      }

      this.lIliiIlill = null;
      if (this.liIiiIlill != null) {
         this.liIiiIlill.close();
      }

      this.liIiiIlill = null;
      if (this.iIliiIlill != null) {
         this.iIliiIlill.close();
      }

      this.iIliiIlill = null;
      this.IlliiIlill = -1;
      this.IiIiiIlill = null;
      this.llIiiIlill = null;
   }

   iIIiilllIlIiilll(String file) {
      this.IlIiiIlill = file;
   }
}
