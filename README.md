# Dispute Client — Android (Mojo Launcher ARM64) & PC Port

[![Build Dispute Client Android (Mojo ARM64) Port](https://img.shields.io/badge/build-GitHub%20Actions-brightgreen)](.github/workflows/build-android-port.yml)
[![Minecraft Version](https://img.shields.io/badge/Minecraft-1.21.11-blue)](https://fabricmc.net/)
[![Fabric Loader](https://img.shields.io/badge/Fabric%20Loader-%3E%3D0.16.0-blueviolet)](https://fabricmc.net/)
[![Target Architecture](https://img.shields.io/badge/Architecture-Android%20ARM64%20(Bionic)%20%2B%20x86__64-orange)](https://github.com/artdeell/MojoLauncher)
[![Security Audit](https://img.shields.io/badge/Malware%20Audit-Zero%20net%2Ffabric%20Payloads-success)]()

**Dispute Client** (`v2.0.1`) is a high-performance Minecraft utility client and autonomous AI bot suite for Minecraft **1.21.11** (Fabric Loader `>=0.16.0`, Java 21), specifically ported and hardened for **Android ARM64** devices running **Mojo Launcher** (`git.artdeell.mojo`), while maintaining full desktop compatibility.

Formerly known as Corz Client, the client has been rebranded to **Dispute Client** while **strictly preserving 100% of the underlying codebase**:
- **1:1 Native QVM Preserved**: `com.corz.client.qvm.Runtime` and `libvm.so` run natively on Android Bionic without breaking JNI links or internal package bindings (`com.corz.client.*`, `gg.corz.*`).
- **All 287 Obfuscated Modules & Anti-Cheat Bypasses Intact**: All original bypass mixins, `<invokedynamic>` string callsites, and combat/movement mechanics are preserved.
- **5 Clean Autonomous Bots Integrated**: SMP PvP, UHC PvP, Mace PvP + SpearMace, Tree Farmer, and Auto Ore Miner.
- **Offline Physics & Compute Solvers**: Built-in Java physics solvers (`LocalCombat`, `LocalCompute`) and bundled protobuf RPC (`libs/client-rpc-1.0.0-bundled.jar`), eliminating reliance on external cloud servers.
- **Strict Security Clean**: Upstream session-stealer malware (`net/fabric/*`, `CorzPreLaunch`) and Windows `vm.dll` have been completely stripped.

---

## Key Features & Port Architecture

### 1. Android ARM64 Bionic Compatibility (Mojo Launcher `clns-4`)
Mojo Launcher runs OpenJDK 21 inside Android Bionic. Standard Linux binaries fail with `UnsatisfiedLinkError: dlopen failed: library "libm.so.6" not found`.
- **NDK ABI Shim (`libcorz_bionic_shim.so`)**: Built with Android NDK `r27c` against API 28. Dynamically remaps glibc dependencies (`libc.so.6`, `libm.so.6`, `libdl.so.2`, `libpthread.so.0`) to Android Bionic equivalents and exports missing C runtime symbols (`__isoc99_*`, `__errno_location`, `rawmemchr`, `mempcpy`).
- **ELF64 Dynamic Header Patcher (`tools/patch_qvm_bionic.py`)**: Rewrites `DT_NEEDED` headers in `libvm.so`, strips GNU version requirements (`DT_VERSYM`, `DT_VERNEED`), and places `libcorz_bionic_shim.so` as the primary dependency.
- **Native Loader (`Runtime.java`)**: Detects Mojo OpenJDK 21 / Android and extracts `libcorz_bionic_shim.so` and `libvm.so` to `/data/data/git.artdeell.mojo/cache/corz-qvm-android-aarch64/`, ensuring `$ORIGIN` resolution succeeds in Android namespace `clns-4`.

### 2. Autonomous Bot Suite (5 Clean Bots)
Accessible via the Pause Menu (**`§eDispute Bots`**), chat commands (**`.dispute`**, **`/dispute`**, **`.bots`**, **`/corzbots`**), or keybinds (**`Right-Alt`** / **`F8`**):
1. **SMP PvP Bot**: Autonomous attack timing, criticals, W-tap, shield break, web placement, pearl escapes, and auto-gapple.
2. **UHC PvP Bot**: Human-like aim tracking, bow prediction, rod/lava tricks, and defensive boxing.
3. **Mace PvP + SpearMace Bot**: Mace dive smashes (Auto, Elytra + Rocket, Wind Charge) with Spear/Lunge combos and armor swapping.
4. **Tree Farmer Bot**: Auto tree scanner, hotbar axe auto-selection, leaf clearing, and auto-replanting.
5. **Auto Ore Miner Bot**: 3D ore vein pathfinder (Ancient Debris, Diamond, Emerald, Gold, Iron, Copper, etc.) with lava hazard protection and strip-tunneling.

### 3. GPU & Rendering Hardening (75 GLSL Shaders Audited)
Mojo Launcher commonly utilizes Adreno GPUs with Turnip/Zink/LTW OpenGL ES translators.
- All 75 shaders under `assets/corzclient/shaders/` audited and normalized to OpenGL 3.3 / ES 3.x compliance.
- Fixed unguarded `inversesqrt()` and division-by-zero operations that cause black quad artifacts on Adreno.
- Added boundary clamping to `texelFetch` and normalized array bounds.
- Wrapped rendering mixins (`MixinGameRenderer`) in `Throwable` circuit-breakers.

### 4. Headless AWT & Touch Input Bridge
- **`java.awt.headless=true`**: Automatically enforced on client initialization to prevent X11 `AWTError` crashes on mobile OpenJDK.
- **`CompatFileDialog`**: Drop-in POJO replacement for AWT `FileDialog`, routing config/schematic file selections to mobile paths (`/sdcard/Download`, `schematics/`).
- **`MojoInputBridge`**: 75ms touch-tap latching across 20 TPS polling to prevent missed inputs on touchscreen devices.

---

## GitHub Actions Automated Build

The mod is compiled and packaged automatically via GitHub Actions:
- **Workflow File**: `.github/workflows/build-android-port.yml`
- **Output Artifacts**:
  - `DisputeClient-2.0.1-Android-Mojo.jar` (Primary output mod JAR)
  - `CorzClient-2.0.1-Android-Mojo.jar` (Compatibility alias)
  - `DisputeClient-2.0.1-Android-Mojo-Bundle.zip` (Full bundle with native libraries)
  - `jar_verification_report.txt` (Automated integrity and security audit)

### Fixed Commit #3 Build Failure
In earlier builds, `tools/prepare_upstream_jar.py` failed with:
`ERROR: Could not locate JAR containing com/corz/client/CorzClient.class inside Corz-Client.zip`
- **Root Cause**: Windows-created ZIP archives containing backslashes (`\`) and top-level directory wrappers (e.g. `Corz-Client/com/corz/...`) prevented exact POSIX path matching.
- **Resolution**: `tools/prepare_upstream_jar.py` was enhanced with path normalization (`\` &rarr; `/`), automatic root prefix detection/stripping, nested archive extraction, and automatic class tree packaging.

---

## How to Build & Install

### 1. Trigger the Build
Commit and push your changes to your GitHub repository:
```bash
git add .
git commit -m "feat: rebrand to Dispute Client and fix upstream archive extractor"
git push
```
The **Build Dispute Client Android (Mojo ARM64) Port** workflow will execute on GitHub's Ubuntu runners (with Java 21, Android NDK r27c, and Git LFS).

### 2. Download the Artifact
1. Go to the **Actions** tab in your GitHub repository.
2. Select the latest workflow run.
3. Under **Artifacts**, download `DisputeClient-2.0.1-Android-Mojo`.

### 3. Install on Mojo Launcher
1. Copy `DisputeClient-2.0.1-Android-Mojo.jar` to your device's Minecraft mods folder:
   ```
   /sdcard/Android/data/git.artdeell.mojo/files/.minecraft/mods/
   ```
   (or the corresponding path inside your Pojav/Mojo launcher directory).
2. Launch Minecraft **1.21.11** with **Fabric Loader >= 0.16.0**.
3. Open the Pause Menu and tap **§eDispute Bots** (or type `.dispute` / `.bots` in chat) to configure bots and modules. ClickGUI is toggled via **Right-Shift**.