package gg.corz;

public record iIIIlllIlIIlll(lilIiIiliilIiIil villager, IiIlIIiliIlIIi target, boolean hinted) {
   private final IiIlIIiliIlIIi IliIiilillliIiilil;
   private final boolean iliIiililIiiIiilil;
   private final lilIiIiliilIiIil lIiIiililiIiIiilil;

   public lilIiIiliilIiIil IliIlllilIi() {
      return this.lIiIiililiIiIiilil;
   }

   public IiIlIIiliIlIIi liiiIIllIl() {
      return this.IliIiilillliIiilil;
   }

   public iIIIlllIlIIlll(lilIiIiliilIiIil villager, IiIlIIiliIlIIi hinted, boolean target) {
      this.lIiIiililiIiIiilil = villager;
      this.IliIiilillliIiilil = hinted;
      this.iliIiililIiiIiilil = target;
   }

   public boolean iIlIlllllill() {
      return this.iliIiililIiiIiilil;
   }
}
