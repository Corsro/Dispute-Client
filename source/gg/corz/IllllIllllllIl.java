package gg.corz;

public final class IllllIllllllIl<T> {
   public final String ilIlilIllIiIlilIll;
   public final T lIIlilIlliIIlilIll;
   public final boolean iiiIilIllIIIlilIll;
   public final String IlIlilIllllIlilIll;

   static <T> IllllIllllllIl<T> IliIlllilIi(T v) {
      return new IllllIllllllIl<T>(true, v, (String)null, (String)null);
   }

   private IllllIllllllIl(boolean error, T message, String ok, String value) {
      this.iiiIilIllIIIlilIll = error;
      this.lIIlilIlliIIlilIll = message;
      this.IlIlilIllllIlilIll = ok;
      this.ilIlilIllIiIlilIll = value;
   }

   static <T> IllllIllllllIl<T> liiiIIllIl(String error, String message) {
      return new IllllIllllllIl<T>(false, (Object)null, error, message);
   }
}
