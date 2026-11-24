# Dispute Client — Android (Mojo Launcher ARM64) & PC Port

[![Build Dispute Client Android (Mojo ARM64) Port](https://img.shields.io/badge/build-GitHub%20Actions-brightgreen)](.github/workflows/build-android-port.yml)
[![Minecraft Version](https://img.shields.io/badge/Minecraft-1.21.11-blue)](https://fabricmc.net/)
[![Fabric Loader](https://img.shields.io/badge/Fabric%20Loader-%3E%3D0.16.0-blueviolet)](https://fabricmc.net/)
[![Target Architecture](https://img.shields.io/badge/Architecture-Pure%20Java%20(Android%20ARM64%20%2B%20x86__64)-orange)](https://github.com/artdeell/MojoLauncher)
[![Security Audit](https://img.shields.io/badge/Malware%20Audit-Zero%20net%2Ffabric%20%7C%20Zero%20vm.dll-success)]()

**Dispute Client** (`v2.0.3`, mod ID `corzclient`, `provides: ["disputeclient", "corzclient"]`) is a pure-Java high-performance Minecraft utility client and autonomous AI bot suite for Minecraft **1.21.11** (Fabric Loader `>=0.16.0`, Java 21), specifically ported and verified for **Android ARM64** devices running **Mojo Launcher** (`git.artdeell.mojo`), while remaining 100% compatible with desktop Fabric.

---

## Key Features & Pure-Java Port Architecture

### 1. Zero-Native Pure-Java QVM Lowering (Android ARM64 / `clns-4` Safe)
Upstream desktop builds loaded a native `vm.dll` / QVM payload (`com.corz.client.qvm.Runtime`) and failed on Mojo Launcher OpenJDK 21 / Android Bionic.
- **ASM 9.7 QVM Lowering (`tools/CorzBytecodePatcher.java`)**: Lowers all **15** `gg.corz.*` QVM classes (**191** methods) directly to pure Java bytecode (including `IIIIli` module enable/disable state, `IIIilliI` lifecycle initialization without `loadVm` + no-op `IIi()`, `IIIiillll` offline auth null-checks, and `IIliiIiil` helpers), verified to have **0 surviving `Runtime.loadVm`/`Runtime.run*` calls**.
- **Pure-Java `Runtime.java` Stub**: Zero `System.load` calls and zero native `libvm.so` / `vm.dll` dependencies — runs out of the box inside Android linker namespace `clns-4` on any ARM64 device.
- **Strict Security Clean**: Upstream session-stealer/injector payloads (`net/fabric/*`, `gg/corz/injector/*`, `assets/wvbwipuv.cfg`, `vm.dll`) are completely stripped and disallowed by CI and verification scripts.

### 2. Full `v2.0.3` Modules, Autonomous AI Bots & 1-Tap Mojo Touch GUI
- **All 344 Modules & 107 Mixins Preserved**: Includes **CrystalPvpBot**, **SwordPvpBot**, **SmpPvpBot**, **UhcPvpBot**, **MacePvpBot**, **MaceBomber**, **TreeFarmer**, **AutoAreaMiner**, **VillagerTradeBot**, **AutoBuilder**, and offline physics solvers (`LocalCombat`, `LocalCompute`) + bundled RPC (`META-INF/jars/client-rpc-1.0.0-bundled.jar`).
- **1-Tap Pause Menu Button (`MixinGameMenuScreenDispute`)**: Adds a top-right **`§eDispute GUI`** button to the Minecraft Pause Screen (`class_433`) that opens the full ClickGUI (`new gg.corz.IIlillIIi()`) in 1 tap without needing a physical `Right-Shift` key.

### 3. GPU & Shader Hardening (All 78 GLSL Shaders Audited)
Mojo Launcher commonly runs Adreno GPUs via Turnip/Zink/LTW OpenGL ES translators.
- All **78** shaders under `assets/corzclient/shaders/` (including new `2.0.3` shaders `corz_msdf_world.fsh`, `crazy_armor_material.fsh`, `crazy_armor_material.vsh`) are audited and hardened for OpenGL 3.3 / ES 3.x compliance (`texelFetch` clamping, guarded `inversesqrt`/`fwidth`/`pow`, fixed-size arrays, integer loops).
- Rendering mixins (`MixinGameRenderer`, `MixinGameRendererMotionBlur`, `MixinHeldItemRenderer`) wrap shader/FBO calls in `Throwable` circuit-breakers.

### 4. Headless AWT, Touch Input Latch & Clean Rebranding
- **`java.awt.headless=true`** via `AndroidRuntimeEnv.ensureAndroidHeadlessAwtIfNeeded()` prevents X11 `AWTError` crashes on mobile OpenJDK.
- **`CompatFileDialog`** replaces blocking `java.awt.FileDialog` calls for mobile `/sdcard/Download` & `schematics/` paths.
- **`MojoInputBridge`** provides 75 ms touch-tap latching and safe `glfwGetMouseButton`/`glfwGetKey`/`glfwGetKeyName`/`glfwGetKeyScancode` fallbacks.
- **`LocalBranding`** strips upstream crack/hijack strings cleanly and rebrands runtime UI labels to **Dispute Client** (`2.0.3`).

---

## Local Build & Verification

The full `v2.0.3` Android/Mojo JAR builds and verifies locally on Java 21 + Python 3:
```bash
python3 tools/prepare_upstream_jar.py
javac --release 21 -cp "$(cat build/deps/asm_classpath.txt)" -d build/tools-classes tools/CorzBytecodePatcher.java
java -cp "build/tools-classes:$(cat build/deps/asm_classpath.txt)" CorzBytecodePatcher \
  build/upstream/corzclient-upstream.jar build/patched/corzclient-asm-patched.jar build/reports/asm_patch_report.txt
javac --release 21 -encoding UTF-8 -Xlint:none -proc:none \
  -cp "build/patched/corzclient-asm-patched.jar:libs/client-rpc-1.0.0-bundled.jar:$(cat build/deps/compile_classpath.txt)" \
  -d build/mod-classes \
  source/com/corz/client/android/*.java \
  source/com/corz/client/qvm/Runtime.java \
  source/com/corz/client/LocalBranding.java \
  source/com/corz/client/CorzClient.java \
  source/com/corz/client/mixins/*.java
python3 tools/overlay_and_verify_jar.py \
  --asm-jar build/patched/corzclient-asm-patched.jar \
  --compiled-classes build/mod-classes \
  --shaders-dir source/assets/corzclient/shaders \
  --rpc-jar libs/client-rpc-1.0.0-bundled.jar \
  --source-dir source \
  --output-jar build/dist/DisputeClient-2.0.3-Android-Mojo.jar \
  --report build/reports/jar_verification_report.txt
```

Output JAR: `build/dist/DisputeClient-2.0.3-Android-Mojo.jar` (also built automatically in GitHub Actions via `.github/workflows/build-android-port.yml`).

### Install on Mojo Launcher
1. Copy `DisputeClient-2.0.3-Android-Mojo.jar` to your device's Fabric mods folder:
   ```
   /sdcard/Android/data/git.artdeell.mojo/files/.minecraft/mods/
   ```
2. Launch Minecraft **1.21.11** with **Fabric Loader >= 0.16.0** (Java 21).
3. Press **Pause** and tap **`§eDispute GUI`** in the top-right corner (or press **Right-Shift** on keyboard) to open the ClickGUI.