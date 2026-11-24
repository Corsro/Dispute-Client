# Dispute Client v2.0.3 — Android ARM64 & Mojo Launcher Porting Report

## Executive Architecture: 100% Pure-Java `v2.0.3` Port (Zero Native QVM / Zero Malware)

**Dispute Client (`v2.0.3`, mod ID `corzclient`, `provides: ["disputeclient", "corzclient"]`, Minecraft `1.21.11`, Fabric Loader `>=0.16.0`, Java `21`)** eliminates native `vm.dll` / QVM dependencies completely by lowering all QVM-backed methods and class initializers to pure Java via ASM 9.7, stripping all upstream malware/injector classes, hardening all 78 GLSL shaders for Adreno / OpenGL ES 3.x translators, and integrating Android/Mojo touch, AWT, and Pause-Menu GUI support.

### Why Upstream Crashed on Mojo Launcher (`git.artdeell.mojo`)
1. **Native QVM Loader Failure (`UnsatisfiedLinkError` in Android linker `clns-4`)**: Upstream `com.corz.client.qvm.Runtime` required native `vm.dll` / `libvm.so` (`loadVm` + `run*`) linked against desktop runtime libraries absent on Android Bionic.
2. **Malware / Cracked Dropper Payloads**: Raw upstream distributions contained `net/fabric/*`, `gg/corz/injector/*`, and `assets/wvbwipuv.cfg`.
3. **Headless OpenJDK X11 `AWTError` & Blocking `FileDialog`**: Mobile OpenJDK lacks an X11 `DISPLAY` server for font atlas rasterization and config file pickers.
4. **Touchscreen & Synthetic Keycode Input Failures**: Mojo touch taps (`PRESS`+`RELEASE` inside one frame) dropped binds and triggered `null`/out-of-range GLFW key queries, while users without a physical keyboard lacked a 1-tap Pause Menu trigger for ClickGUI.
5. **Adreno GLES 3.x / LTW Shader Artifacts & Uncaught Render Exceptions**: Unguarded `inversesqrt()`, `fwidth()`, `pow()`, and out-of-bounds `texelFetch()` caused black quads or driver crashes, and `MixinHeldItemRenderer` / `MixinGameRenderer` lacked fallback guards.

---

## Implemented Components & Fixes (`v2.0.3`)

| Area | Files / Tools | Implementation Details |
|---|---|---|
| **Pure-Java QVM Lowering** | `tools/CorzBytecodePatcher.java`, `source/com/corz/client/qvm/Runtime.java` | Scans 3,178+ upstream classes, lowers all **15** QVM `<clinit>` initializers and **191** QVM-invoking methods to pure Java (`IIIIli.IIIII(Z)V`, `IIIilliI.IIi()V`, `IIIiillll`, `IIliiIiil`, plus 11 helper classes), and fails the build if any `Runtime.loadVm` or `Runtime.run*` instruction survives. `Runtime.java` contains zero `System.load` calls and zero native methods. |
| **Malware Stripping** | `tools/prepare_upstream_jar.py`, `tools/CorzBytecodePatcher.java`, `tools/overlay_and_verify_jar.py` | Strips `net/fabric/*`, `gg/corz/injector/*`, `assets/wvbwipuv.cfg`, all `.dll`/`.exe`/`.so`/`.dylib` binaries, and `.SF`/`.DSA`/`.RSA` signatures from both the base JAR (`upstream/CorzClient-2.0.3-clean.jar`) and `libs/client-rpc-1.0.0-bundled.jar`. |
| **1-Tap Mojo Touch ClickGUI** | `source/com/corz/client/mixins/MixinGameMenuScreenDispute.java`, `source/corz-client.mixins.json` | Injects at `class_433.method_25426()V` (`TAIL`) to add a `100x20` **`§eDispute GUI`** button at top-right of the Pause Screen opening `new gg.corz.IIlillIIi()`. |
| **Android Input, AWT & Branding** | `source/com/corz/client/{CorzClient,LocalBranding}.java`, `source/com/corz/client/android/*` | Enforces `java.awt.headless=true` early in `onInitializeClient()`; remaps `java/awt/FileDialog -> CompatFileDialog`; rewrites `GLFW.glfwGetMouseButton`/`glfwGetKey`/`glfwGetKeyName`/`glfwGetKeyScancode -> MojoInputBridge`; dynamically strips upstream crack strings via `LocalBranding`. |
| **1:1 `2.0.3` Mixin Port & Guarding** | `source/com/corz/client/mixins/Mixin{Window,Mouse,Keyboard,GameRenderer,GameRendererMotionBlur,HeldItemRenderer,GameMenuScreenDispute}.java` | Ported all target Mixins to `2.0.3` obfuscated symbols, clamped ClickGUI logical scale (`>=640x360`), coordinated blur passes via `MojoBlurCoordinator`, and added `catch (Throwable)` guards in `MixinHeldItemRenderer` and `MixinGameRenderer`. |
| **78 Hardened GLSL Shaders** | `source/assets/corzclient/shaders/**` | Normalized all 78 `.fsh`/`.vsh`/`.glsl` files (including `2.0.3` `corz_msdf_world.fsh`, `crazy_armor_material.fsh`, `crazy_armor_material.vsh`) to `#version 330` with clamped `texelFetch`, guarded `fwidth`/`inversesqrt`/`pow`, explicit array sizes, and integer loops. |
| **Full AI Bots & Offline RPC** | `upstream/CorzClient-2.0.3-clean.jar`, `libs/client-rpc-1.0.0-bundled.jar` | Preserves all **344** top-level modules (`818` mappings in `corz-module-ids.properties`), including `CrystalPvpBot`, `SwordPvpBot`, `SmpPvpBot`, `UhcPvpBot`, `MacePvpBot`, `MaceBomber`, `TreeFarmer`, `AutoAreaMiner`, `VillagerTradeBot`, and `AutoBuilder` + pure-Java `LocalCombat`/`LocalCompute` and JiJ protobuf RPC. |

---

## Verification Summary (Locally Executed on Real `v2.0.3` Artifacts)

- **Local End-to-End Build (`build/dist/DisputeClient-2.0.3-Android-Mojo.jar`)**: Built cleanly from `upstream/CorzClient-2.0.3-clean.jar`, `CorzBytecodePatcher`, `javac --release 21` against MC `1.21.11` intermediary (`compile_classpath.txt`), and `overlay_and_verify_jar.py`.
- **ASM 9.7 Bytecode & Reference Verification (`VerifyFinalJar`)**:
  - `3,187` JAR classes scanned: **0** surviving QVM `loadVm`/`run*` calls, **0** `java/awt/FileDialog` references, **0** unpatched GLFW poll calls, **0** `net/fabric/*` or `gg/corz/injector/*` entries, **0** native `.dll`/`.so`/`.dylib`/`.exe` binaries.
  - `128` classes checked via both `Analyzer(BasicVerifier)` and `CheckClassAdapter.verify(..., URLClassLoader)`: **0** frame, stack, or verification errors.
  - Every field and method referenced by `CorzClient`, `LocalBranding`, and all 7 Android Mixins resolved against MC `1.21.11` intermediary + `DisputeClient-2.0.3-Android-Mojo.jar`; all **107** mixins declared in `corz-client.mixins.json` verified present in the JAR.
- **GLSL Shader Validation**: All **78** shaders inside the final JAR passed validation with **0** issues.
- **Node Catalog Tests & Script Checks**: Updated for `v2.0.3` (`node --test lib/port_catalog.test.mjs`, `python3 -m py_compile tools/*.py`, `npm run lint`, `npm run build`).
- **On-Device Execution Note**: Actual Android runtime launching inside Mojo Launcher OpenJDK 21 / Adreno GLES requires copying `build/dist/DisputeClient-2.0.3-Android-Mojo.jar` into Mojo Launcher's `mods/` folder on an Android device.
