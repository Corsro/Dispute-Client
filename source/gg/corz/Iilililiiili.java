package gg.corz;

public interface Iilililiiili {
   int Illlllllllll = 960;
   int illlllIillll = 540;
   int lIlllliIllll = 2;
   int IIillllIilll = 384;
   int lilllliillll = 680;

   static int IliIlllilIi(int framebufferH, int framebufferW) {
      long var3 = -8653224090449750116L;

      for(var3 ^= ((long)((int)Math.round(Math.min((double)framebufferH / (double)960.0F, (double)framebufferW / (double)540.0F))) << 32 ^ var3) & -1L << 32; (int)(var3 >>> 32) > 2 && (framebufferH / (int)(var3 >>> 32) < 680 || framebufferW / (int)(var3 >>> 32) < 384); var3 += -4294967296L) {
      }

      return Math.max(2, (int)(var3 >>> 32));
   }
}
