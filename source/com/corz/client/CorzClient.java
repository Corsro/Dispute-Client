package com.corz.client;

import com.corz.client.android.AndroidRuntimeEnv;
import com.corz.client.android.MojoInputBridge;
import gg.corz.IIIIIllI;
import gg.corz.IIIIiiIil;
import gg.corz.IIIIli;
import gg.corz.IIIIlii;
import gg.corz.IIIIlili;
import gg.corz.IIIIlliIi;
import gg.corz.IIIIllilI;
import gg.corz.IIIiIIliI;
import gg.corz.IIIiIiIli;
import gg.corz.IIIiilIlI;
import gg.corz.IIIiill;
import gg.corz.IIIiillll;
import gg.corz.IIIilliI;
import gg.corz.IIIlIIiII;
import gg.corz.IIIlIiIIi;
import gg.corz.IIIliiIi;
import gg.corz.IIIlllill;
import gg.corz.IIIllllii;
import gg.corz.IIiIllIil;
import gg.corz.IIiiill;
import gg.corz.IIiilIl;
import gg.corz.IIiili;
import gg.corz.IIilI;
import gg.corz.IIilIIi;
import gg.corz.IIilIiIlI;
import gg.corz.IIilliIil;
import gg.corz.IIilllll;
import gg.corz.IIlIiIil;
import gg.corz.IIlIlIIIi;
import gg.corz.IIliIIiii;
import gg.corz.IIliiilli;
import gg.corz.IIlillIIi;
import gg.corz.IIllIIill;
import gg.corz.IIllIlili;
import gg.corz.IIlliIil;
import gg.corz.IIllilII;
import gg.corz.IIllillli;
import gg.corz.IIlllIii;
import java.util.HashMap;
import java.util.Map;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents;
import net.minecraft.class_1041;
import net.minecraft.class_310;
import net.minecraft.class_437;
import net.minecraft.class_4587;
import net.minecraft.class_476;
import net.minecraft.class_480;
import org.joml.Matrix4f;

public class CorzClient implements ClientModInitializer {
   public static IIlliIil fontManager;
   private static final Map<IIIIli, Boolean> keyDown = new HashMap<>();
   private static boolean guiKeyWasPressed = false;

   private static boolean ownsKeyAsSetting(IIIIli m, int key) {
      for (IIIliiIi var3 : m.IIli()) {
         if (var3 instanceof IIIlIiIIi var4) {
            if (var4.IIIII() && IIllIIill.III(key, var4.IIIIl())) {
               return true;
            }
         }
      }

      return false;
   }

   public static IIIiilIlI fontRenderer() {
      return fontManager.IIIl();
   }

   private static boolean bindDown(class_1041 code, int window) {
      if (window < 0) {
         return false;
      } else if (IIIiIIliI.III(window)) {
         return MojoInputBridge.isMouseButtonDown(code, IIIiIIliI.IIl(window));
      } else {
         return MojoInputBridge.isKeyDown(code, window);
      }
   }

   private static void pollContainerBind(class_1041 m, IIIIli window) {
      long var5 = 9026980723302747695L;
      long var7 = 1207295393866013943L;
      var5 ^= ((long)window.IIIlI() << 32 ^ var5) & -1L << 32;
      if ((int)(var5 >>> 32) >= 0 && !ownsKeyAsSetting(window, (int)(var5 >>> 32))) {
         var5 ^= ((long)(bindDown(m, (int)(var5 >>> 32)) ? 1 : 0) ^ var5) & -1L >>> 32;
         var7 ^= ((long)(keyDown.getOrDefault(window, false) ? 1 : 0) << 32 ^ var7) & -1L << 32;
         keyDown.put(window, (int)var5 != 0);
         if (window.III() || !IIlllIii.IIl(window) || IIlllIii.IIIII(window)) {
            if (window.IIIli() == IIilllll.IIIIIlIIili) {
               if ((int)var5 != 0 && (int)(var7 >>> 32) == 0) {
                  window.IIIII(true);
               } else if ((int)var5 == 0 && (int)(var7 >>> 32) != 0) {
                  window.IIIII(false);
               }
            } else if ((int)var5 != 0 && (int)(var7 >>> 32) == 0) {
               window.IIIIl();
            }
         }
      } else {
         keyDown.put(window, false);
      }
   }

   @Override
   public void onInitializeClient() {
      AndroidRuntimeEnv.ensureAndroidHeadlessAwtIfNeeded();
      IIIIIllI.IIi();
      IIIiillll.IIl();
      IIIIiiIil.IIi();
      fontManager = new IIlliIil();
      IIIilliI.III();
      IIiilIl.III();
      ClientLifecycleEvents.CLIENT_STOPPING.register((ClientLifecycleEvents.ClientStopping)(client) -> IIiilIl.IIIl());
      ClientPlayConnectionEvents.DISCONNECT.register((ClientPlayConnectionEvents.Disconnect)(client, handler) -> IIilI.IIl());
      ClientPlayConnectionEvents.DISCONNECT.register((ClientPlayConnectionEvents.Disconnect)(handler, client) -> {
         IIIIli var3 = IIIilliI.IIIi(IIIlllill.class);
         if (var3 instanceof IIIlllill var2) {
            var2.IIIliiIii();
         }
      });
      ClientPlayConnectionEvents.DISCONNECT.register((ClientPlayConnectionEvents.Disconnect)(client, handler) -> {
         IIlIlIIIi.IIIl();
         IIllillli.IIII();
         IIilliIil.IIiII();
         IIiIllIil.IIii();
      });
      IIlIiIil.III();
      WorldRenderEvents.END_EXTRACTION.register((WorldRenderEvents.EndExtraction)(context) -> IIIIllilI.III(context.frustum()));
      WorldRenderEvents.AFTER_ENTITIES.register((WorldRenderEvents.AfterEntities)(context) -> {
         if (!IIIIlii.III()) {
            class_310 var1 = class_310.method_1551();
            if (var1.field_1687 != null && var1.field_1724 != null) {
               float var2 = var1.method_61966().method_60637(false);
               IIIiill var3 = new IIIiill(context.matrices(), new Matrix4f(), var2);
               var3.IIliIliII = context.commandQueue();
               IIIilliI.IIlI(var3);
               IIllIlili.IIIil();
            }
         }
      });
      ScreenEvents.AFTER_INIT.register((ScreenEvents.AfterInit)(client, screen, scaledWidth, scaledHeight) -> {
         if (screen instanceof class_480 var4) {
            IIiili var5 = (IIiili)IIIilliI.IIIi(IIiili.class);
            if (var5 != null) {
               IIIlIIiII var6 = new IIIlIIiII(var4, var5);
               ScreenEvents.afterRender(screen).register((ScreenEvents.AfterRender)(mx, td, s, my, ctx) -> var6.IIIII(td, s, my));
               ScreenMouseEvents.allowMouseClick(screen).register((ScreenMouseEvents.AllowMouseClick)(s, panel) -> !var6.IIIli(panel.comp_4798(), panel.comp_4799(), panel.method_74245()));
            }
         }
      });
      ClientTickEvents.END_CLIENT_TICK.register((ClientTickEvents.EndTick)(client) -> {
         long var8 = 6095126464138896770L;
         long var10 = -3845172132902994995L;
         long var12 = -7558568501249690783L;
         if (!IIIIlii.III()) {
            IIIilliI.IIi();
            IIIIlili.IIi();
            IIliiilli var1 = (IIliiilli)IIIilliI.IIIi(IIliiilli.class);
            if (var1 != null && client.field_1755 == null && client.field_1724 != null) {
               var8 ^= ((long)var1.IIIlI() << 32 ^ var8) & -1L << 32;
               if ((int)(var8 >>> 32) >= 0) {
                  class_1041 var3 = client.method_22683();
                  var8 ^= ((long)(bindDown(var3, (int)(var8 >>> 32)) ? 1 : 0) ^ var8) & -1L >>> 32;
                  if ((int)var8 != 0 && !guiKeyWasPressed) {
                     var10 ^= ((long)(!MojoInputBridge.isKeyDown(var3, 341) && !MojoInputBridge.isKeyDown(var3, 345) ? 0 : 1) << 32 ^ var10) & -1L << 32;
                     if (IIIiillll.IIli()) {
                        client.method_1507(new IIlillIIi());
                     } else {
                        client.method_1507(new IIIiIiIli((class_437)null, true));
                     }
                  }

                  guiKeyWasPressed = (int)var8 != 0;
               }
            }

            if (client.field_1755 == null) {
               class_1041 var2 = client.method_22683();

               for (IIIIli var4 : IIilIiIlI.III().IIII()) {
                  if (!(var4 instanceof IIliiilli)) {
                     var10 ^= ((long)var4.IIIlI() << 32 ^ var10) & -1L << 32;
                     if (((int)(var10 >>> 32) < 0 || !ownsKeyAsSetting(var4, (int)(var10 >>> 32))) && (int)(var10 >>> 32) >= 0) {
                        var10 ^= ((long)(bindDown(var2, (int)(var10 >>> 32)) ? 1 : 0) ^ var10) & -1L >>> 32;
                        var12 ^= ((long)(keyDown.getOrDefault(var4, false) ? 1 : 0) << 32 ^ var12) & -1L << 32;
                        keyDown.put(var4, (int)var10 != 0);
                        if ((int)var10 != 0 && (int)(var12 >>> 32) == 0 && !var4.III() && IIlllIii.IIl(var4) && !IIlllIii.IIIII(var4) && IIIiillll.IIli()) {
                           client.method_1507(new IIlillIIi(var4));
                        } else if (var4.IIIli() == IIilllll.IIIIIlIIili) {
                           if ((int)var10 != 0 && (int)(var12 >>> 32) == 0) {
                              var4.IIIII(true);
                           } else if ((int)var10 == 0 && (int)(var12 >>> 32) != 0) {
                              var4.IIIII(false);
                           }
                        } else if ((int)var10 != 0 && (int)(var12 >>> 32) == 0) {
                           var4.IIIIl();
                        }
                     }
                  }
               }
            } else {
               var8 ^= ((long)(client.field_1755 instanceof class_476 ? 1 : 0) << 32 ^ var8) & -1L << 32;

               for (IIIIli var16 : IIilIiIlI.III().IIII()) {
                  if ((int)(var8 >>> 32) != 0 && var16.IIIiI()) {
                     pollContainerBind(client.method_22683(), var16);
                  } else {
                     if (var16.IIIli() == IIilllll.IIIIIlIIili && var16.III()) {
                        var16.IIIII(false);
                     }

                     keyDown.put(var16, false);
                  }
               }

               guiKeyWasPressed = false;
            }
         }
      });
      HudRenderCallback.EVENT.register((HudRenderCallback)(tick, ctx) -> {
         long var7 = 7285294444275662907L;
         if (!IIIIlii.III()) {
            IIiiill.III();
            if (IIIllllii.IIl()) {
               IIIllllii.IIII();
            }

            class_310 var2 = class_310.method_1551();
            fontManager.IIi((class_4587)null);
            IIilIIi.IIlil();

            try {
               var7 ^= ((long)(IIliIIiii.IIIIIi() ? 1 : 0) << 32 ^ var7) & -1L << 32;
               if ((int)(var7 >>> 32) == 0) {
                  IIIIlliIi.III().IIII(tick);
               }

               IIIIli var5 = IIIilliI.IIIi(IIliIIiii.class);
               if (var5 instanceof IIliIIiii var4) {
                  var4.IIIlIi(tick);
               }

               if ((int)(var7 >>> 32) != 0) {
                  IIIIlliIi.III().IIII(tick);
               }

               IIllilII.IIiI(tick);
            } finally {
               IIilIIi.IIlii();
            }
         }
      });
   }
}
