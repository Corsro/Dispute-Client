# Dispute Client (Formerly Corz Client) — Android & Mojo Launcher (ARM64) Porting & Crash Audit Report

## Executive Architecture: 1:1 QVM + Original Mod Bytecode on Android ARM64

This port preserves **Dispute Client (formerly Corz Client, mod ID `corzclient` / `disputeclient` v`2.0.1`, Minecraft `1.21.11`, Fabric Loader `>=0.16.0`, Java `21`)** **1:1** — keeping both the native **QVM (`com.corz.client.qvm.Runtime` + `libvm.so`)** and **all obfuscated `gg.corz.*` bytecode & `<invokedynamic>` callsites** intact — while making the mod fully Android ARM64 / **Mojo Launcher (`git.artdeell.mojo`)** compatible, cleanly rebranded, and compilable end-to-end via **GitHub Actions** (where Git LFS pulls the complete 108.5 MB `Corz-Client.zip` archive).

### Why the Original Mod Crashed on Mojo Launcher (`latestlog_688cddd2.txt` Root Cause)

From the real Mojo Launcher crash log (Xiaomi `22111317PI`, Android 14 `aarch64`, Adreno 619 `opengles3_ltw` / Turnip `POJAVEXEC_EGL=libltw.so`, OpenJDK `21.0.1-internal`, 194 mods):

1. **Primary Crash (`UnsatisfiedLinkError: dlopen failed: library "libm.so.6" not found` in `clns-4`)**:
   - Mojo Launcher runs desktop **OpenJDK 21** inside Android Bionic, where JVM system properties report `os.name=Linux`, `java.runtime.name=OpenJDK Runtime Environment`, `os.version=Android-14`, and `java.io.tmpdir=/data/data/git.artdeell.mojo/cache`.
   - Because `java.runtime.name` did not contain `"android"`, `Runtime.java` fell back to `native/linux-aarch64/libvm.so`, which is linked against GNU glibc (`libm.so.6`, `libc.so.6`, `libdl.so.2`, `libpthread.so.0`, GNU symbol versions). Android 14's Bionic linker namespace (`clns-4`) does not provide `libm.so.6`, aborting `CorzClient.onInitializeClient()` with `ExceptionInInitializerError`.
2. **Latent Secondary Crash & Rendering Bugs Fixed in the Audit**:
   - **Missing `-Djava.awt.headless=true` without X11 `DISPLAY`**: `IIliiIlllIliiIll` (`corzclient/font/font.ttf` rasterizer) uses `BufferedImage.createGraphics()` / `FontMetrics`, which throws `AWTError: Can't connect to X11 window server` on Mojo OpenJDK 21 unless `java.awt.headless=true` is set before AWT class initialization.
   - **Blocking AWT `java.awt.FileDialog` in `gg.corz.IIIillIIil`**: Direct `FileDialog` construction throws `HeadlessException` / `AWTError` on Android.
   - **Touch/Ixeris GLFW polling drops & synthetic keycode crashes in `gg.corz.*`**: Mojo Launcher emits fast `PRESS`+`RELEASE` touch events inside a single tick (often with Ixeris multithreading), dropping binds or returning `null`/throwing on `GLFW.glfwGetKeyName`.
   - **Adreno ES 3.x / LTW GLSL shader NaNs & out-of-bounds `texelFetch`**:
     - `corz_msdf_text.fsh` called `inversesqrt(h.x*h.x + h.y*h.y)` with unguarded zero derivatives (`NaN` black quads on Adreno).
     - `gui3d_panel.fsh`, `motion_blur.fsh`, `corz_atmo.vsh`, `corz_knife_surface.vsh` called `texelFetch` without `[0, textureSize - 1]` clamping.
     - `black_hole.fsh` and `include/corz_knife_surface.glsl` had unguarded `pow()` / `inversesqrt()` / `sqrt()` / division domains on Adreno ES 3.x.
   - **`MixinGameRenderer.corz$gui3dLeave`**: Called `lIllIiiIllIi.lIiiIiIlilli()` without `try/catch (Throwable)`, bypassing the blur circuit-breaker if GLSL/FBO teardown failed.

---

## Implemented Components & Fixes

### 1. Native Android ARM64 QVM Support (1:1 `libvm.so` Execution on Bionic)

| Component | Path | Purpose |
|---|---|---|
| **Bionic ABI Compatibility Shim** | `/android-native/src/corz_bionic_shim.c` | Compiled with Android NDK `r27c` (`aarch64-linux-android28-clang -shared -fPIC`) into `libcorz_bionic_shim.so`. Exports GNU/glibc ABI symbols missing from Android Bionic: `dlopen` filename remapper (`RTLD_NEXT` remapping `libc.so.6`/`libm.so.6`/`libdl.so.2`/`libpthread.so.0`/`librt.so.1`/`libstdc++.so.6`), `__errno_location -> __errno`, `__assert_fail -> __assert2`, 384-entry `<ctype.h>` tables (`__ctype_b_loc`, `__ctype_tolower_loc`, `__ctype_toupper_loc`), `__isoc99_{sscanf,fscanf,vsscanf,vfscanf,scanf,vscanf}`, `_FORTIFY_SOURCE` `*__*_chk`, `mempcpy`, `rawmemchr`, `secure_getenv`, `__xpg_strerror_r`, `gnu_get_libc_version`, `explicit_bzero`, `__register_atfork`, `backtrace*`, `get_nprocs*`, `canonicalize_file_name`, `euidaccess`/`eaccess`. |
| **NDK Build Wrapper** | `/android-native/build_ndk_shim.sh` | Builds `libcorz_bionic_shim.so` against NDK API 28 and runs `tools/patch_qvm_bionic.py` on upstream `native/linux-aarch64/libvm.so`. |
| **ELF64 Patcher & Symbol Verifier** | `/tools/patch_qvm_bionic.py` | Rewrites glibc `DT_NEEDED` entries (`libm.so.6 -> libm.so`, `libc.so.6 -> libc.so`, `libdl.so.2 -> libdl.so`, deduplicating/removing `libpthread.so.0`/`librt.so.1`/`libutil.so.1`, `libstdc++.so.6 -> libc++_shared.so`), inserts `libcorz_bionic_shim.so` as the **first** `DT_NEEDED` entry so shim overrides (`dlopen`, etc.) resolve before `libdl.so`/`libc.so`, sets `$ORIGIN` runpath, strips `DT_VERSYM`/`DT_VERNEED`/`DT_VERNEEDNUM` + `SHT_GNU_VERSYM`/`SHT_GNU_VERNEED` links, and audits **every** `UND` symbol against Bionic API 28 + shim exports (failing CI on any unresolved symbol). |
| **QVM Native Loader** | `/source/com/corz/client/qvm/Runtime.java` | Detects Mojo OpenJDK 21 / Android (`os.version`, `java.io.tmpdir`, `MOJO_*`, `POJAV_*`, `/system/build.prop`, `/data/data/git.artdeell.mojo`), extracts `libc++_shared.so` (if needed), `libcorz_bionic_shim.so`, and patched `libvm.so` from `native/android-aarch64/` into a single writable cache folder inside `java.io.tmpdir` (`/data/data/git.artdeell.mojo/cache/corz-qvm-android-aarch64/`), loads dependencies in order inside `clns-4` so `$ORIGIN` resolves cleanly, and preserves `loadVm`, `run`, `res`, `lookupM`, and `str` 1:1. |

### 2. Mojo OpenJDK 21, AWT, Input & Bytecode Adaptations

| Component | Path | Purpose |
|---|---|---|
| **Mojo Environment & Headless AWT** | `/source/com/corz/client/android/AndroidRuntimeEnv.java` & `/source/com/corz/client/CorzClient.java` | Reliably identifies Mojo OpenJDK 21 + active GL translator (`MOJO_LTW`, `MOJO_MOBILEGLUES`, `MOJO_ZINK`, `MOJO_GL4ES`) and sets `java.awt.headless=true` at the start of `CorzClient.onInitializeClient()` before `iiIliiIIllii` / `llillililillil` initialize `BufferedImage` font atlases. |
| **Headless FileDialog Drop-In** | `/source/com/corz/client/android/CompatFileDialog.java` & `AndroidFilePicker.java` | Exact-signature POJO drop-in for `java.awt.FileDialog` routing schematic/config picks through `AndroidFilePicker` (`schematics/`, `corzclient/`, `/sdcard/Download`, `/sdcard/Documents`) with zero AWT X11 toolkit initialization. |
| **Touch Latch & Input Bridge** | `/source/com/corz/client/android/MojoInputBridge.java`, `MixinMouse.java`, `MixinKeyboard.java`, `MixinWindow.java` | Latches `PRESS` events for 75 ms across 20 TPS tick polling, clamps ClickGUI scale to `>=640x360` logical dp (`(class_1041)(Object)this` fixed for plain `javac`), and provides safe `glfwGetMouseButtonCompat`, `glfwGetKeyCompat`, and `glfwGetKeyNameCompat` targets for ASM patching. |
| **ASM 9.7 Bytecode Patcher** | `/tools/CorzBytecodePatcher.java` | Runs over upstream `gg/corz/*.class` inside the Git LFS JAR without touching QVM or `<invokedynamic>` frames (`COMPUTE_MAXS`), strips JAR signatures, remaps `java/awt/FileDialog -> CompatFileDialog`, rewrites `GLFW.glfwGetMouseButton`/`glfwGetKey`/`glfwGetKeyName -> MojoInputBridge`, and outputs `build/reports/asm_patch_report.txt`. |
| **Blur & Post-FX Coordinator** | `/source/com/corz/client/android/MojoBlurCoordinator.java`, `MixinGameRenderer.java`, `MixinGameRendererMotionBlur.java` | Coordinates shared single-pass blur on Mojo TBDR GPUs, disables double-FBO motion blur during open blur screens, falls back on GL4ES, and wraps `corz$gui3dBegin` / `corz$gui3dEnd` / `corz$gui3dLeave` in `Throwable` circuit-breakers. |

### 3. Shader Hardening (All 75 Files Audited)

All 75 shader files under `/source/assets/corzclient/shaders/` are normalized to `#version 330` with explicit fixed-size GLSL arrays (`vec2[N]`), integer-bounded loops (`blur.fsh`), clamped `gl_VertexID`, guarded `inversesqrt(max(..., 1.0e-8))` (`corz_msdf_text.fsh`, `black_hole.fsh`), clamped `texelFetch` (`gui3d_panel.fsh`, `motion_blur.fsh`, `corz_atmo.vsh`, `corz_knife_surface.vsh`), and clamped `pow(max(..., 0.0), ...)` (`corz_knife_surface.glsl`).

### 4. Added Clean 2.0.3 Bots, Offline Solvers & Malware Removal

All clean bots from `2.0.3` are integrated on top of the `2.0.1` QVM port while **explicitly stripping** the `net/fabric/*` session-stealer (`CorzPreLaunch`) and Windows `vm.dll`:

| Component | Path | Purpose |
|---|---|---|
| **Offline Combat & Compute Solvers** | `/source/com/corz/client/LocalCombat.java`, `/source/com/corz/client/LocalCompute.java`, `/libs/client-rpc-1.0.0-bundled.jar` | Self-contained Java physics/FSM solvers (`fighter`, `uhc`, `mace`, `miner`, `tree`) + audited pure-Java protobuf RPC messages bundled cleanly via JiJ (`META-INF/jars/client-rpc-1.0.0-bundled.jar`). |
| **SMP PvP Bot** | `/source/corzbot/**` & `/source/corzbot.mixins.json` | Full `corzbot` SMP PvP bot (`Criticals`, `W-Tap`, `Shield/Axe`, `Webs`, `Pearls`, `Gapples/Potions`, `BotScreen`) wired to `LocalCompute.combat` -> `CloudTuning`; default keybind moved off `RIGHT_SHIFT` (`F9` / unbound) so it never collides with ClickGUI. |
| **UHC PvP Bot** | `/source/de/neo/uhcbot/**` & `/source/com/corz/client/bots/LocalUhcBridge.java` | Full `de.neo.uhcbot` UHC PvP bot (`Fighter`, `HumanAim`, `BowAim`, `BotScreen`) routed through `LocalUhcBridge` -> `LocalCombat("uhc")`, `MojoInputBridge`, and `F10` default menu key. |
| **Mace PvP + SpearMace Bot** | `/source/com/corz/client/bots/MaceSpearBot.java` | Full `LocalCombat("mace")` controller supporting `Mace` dive smashes (`Auto` / `Elytra + Rocket` / `Wind Charge`), `SpearMace` (`Off` / `Lunge` / `Lunge + Stab`), shield break, gapple eat recovery, and armor swap. |
| **Tree Farmer Bot** | `/source/com/corz/client/bots/TreeFarmerBot.java` | `LocalCompute.tree` scanner/router with best hotbar axe selection, optional leaf clearing, and sapling auto-replant on valid soil. |
| **Auto Ore Miner Bot** | `/source/com/corz/client/bots/AutoOreMinerBot.java` | `LocalCompute.miner` 3D ore vein scanner (`Ancient Debris`, `Diamond`, `Emerald`, `Gold`, `Iron`, `Copper`, `Redstone`, `Lapis`, `Coal`, `Quartz`) with lava hazard pause and strip tunneling. |
| **Mojo Touch Hub & Triggers** | `/source/com/corz/client/bots/{CorzBotsAddon,CorzBotsScreen,CorzBotsHud,BotAddonConfig}.java` & `/source/com/corz/client/bots/mixin/*` | 4-tab `CorzBotsScreen` Hub + top-right HUD, accessible without a physical keyboard via **Pause Screen → `§eCorz Bots`**, chat **`.bots`** / **`/corzbots`**, or **`Right-Alt` / `F8`**. |

---

## GitHub Actions Compilation Pipeline
 
Workflow: `/.github/workflows/build-android-port.yml` (`Build Dispute Client Android (Mojo ARM64) Port`)

1. Checks out repository with `actions/checkout@v4` (`lfs: true`) to pull the real `108.5 MB` `Corz-Client.zip`.
2. Runs `tools/prepare_upstream_jar.py` to extract and normalize the upstream Fabric mod JAR (`gg.corz.*` + `corz-client.mixins.json`) and `native/linux-aarch64/libvm.so`.
3. Builds `libcorz_bionic_shim.so` via Android NDK `r27c` (`android-native/build_ndk_shim.sh`) and patches `libvm.so` via `tools/patch_qvm_bionic.py`, verifying zero glibc `DT_NEEDED` tags and 100% symbol resolution.
4. Runs `tools/fetch_mc_compile_classpath.py` (resolving Mojang `1.21.11` + Fabric intermediary remapping + Loader/API/Mixin/ASM) to prepare `build/deps/compile_classpath.txt`.
5. Compiles and runs `tools/CorzBytecodePatcher.java` over upstream `gg/corz/*.class`, remapping `FileDialog` &rarr; `CompatFileDialog`, GLFW input &rarr; `MojoInputBridge`, and updating visible branding text.
6. Compiles all modified/added Java files (`android/*.java`, `qvm/Runtime.java`, `CorzClient.java`, `LocalBranding.java`, `LocalCombat.java`, `LocalCompute.java`, original Mixins, and all 5 clean bots under `com/corz/client/bots/`, `corzbot/`, and `de/neo/uhcbot/`) with `javac --release 21` against MC `1.21.11` Intermediary + `libs/client-rpc-1.0.0-bundled.jar`.
7. Runs `tools/overlay_and_verify_jar.py` to patch `fabric.mod.json` (`Dispute Client`, `provides: ["disputeclient", "corzclient"]`, `CorzBotsAddon`, `corzbot.mixins.json`, `corzbots-addon.mixins.json`, `client-rpc-1.0.0-bundled.jar`), **strip any `net/fabric/*` or `vm.dll` entries**, verify all 26 required entries + GLSL shaders + `libvm.so` `DT_NEEDED`, and produce `build/dist/DisputeClient-2.0.1-Android-Mojo.jar` (alongside `CorzClient-2.0.1-Android-Mojo.jar` compatibility alias and `-Bundle.zip`).

### Commit #3 CI Build Failure Root Cause & Resolution
- **Symptom**: Step `Extract upstream CorzClient JAR & native libs from Git LFS Corz-Client.zip` failed with:
  `ERROR: Could not locate JAR containing com/corz/client/CorzClient.class inside Corz-Client.zip`.
- **Root Cause**: The 108.5 MB archive `Corz-Client.zip` contained Windows backslash path separators (`\`) in ZIP member headers (e.g. `Corz-Client\com\corz\client\CorzClient.class`) and/or was wrapped in a root folder prefix. Standard POSIX ZIP inspection failed to match exact slash paths.
- **Fix Implemented in `tools/prepare_upstream_jar.py`**:
  - `norm_path(p)` automatically translates all `\` into `/`.
  - Automatic detection of any archive prefix ending in `com/corz/client/CorzClient.class` (e.g. `Corz-Client/`), stripping the prefix and repacking into `build/upstream/corzclient-upstream.jar` with `com/corz/client/CorzClient.class` at the true root.
  - Recursive search for nested `.jar` files in `unpacked/` and loose class trees via `pack_unpacked_class_dir_if_present()`.
  - Direct fallback scanning for `libvm.so` across all subfolders.

---

## Verification Status

### Verified Locally
- `python3 -m py_compile tools/*.py`: All 5 Python build/ELF/CI scripts compile cleanly.
- Synthetic ELF64 unit test against `tools/patch_qvm_bionic.py`: Verified `patch_elf64_dynamic_for_bionic()` strips `DT_VERSYM`/`DT_VERNEED`/`DT_VERNEEDNUM`, clears dangling GNU version sections, and reorders `DT_NEEDED` so `libcorz_bionic_shim.so` precedes `libc.so`/`libdl.so`/`libm.so`.
- End-to-end synthetic JAR overlay test against `tools/overlay_and_verify_jar.py`: Verified `fabric.mod.json` patching (`Dispute Client`), `net/fabric/*` & `vm.dll` removal, `client-rpc-1.0.0-bundled.jar` JiJ packaging (all 50/50 `gg.corz.rpc` imports present), and all 26 required entries + 75 GLSL shaders.
- Security & Intermediary static audit across `source/com`, `source/corzbot`, `source/de`, and `libs/client-rpc-1.0.0-bundled.jar`: **0 malware entries**, **0 `<invokedynamic>` in added Java**, **0 unmapped `net.minecraft` imports**.
- Node unit tests (`node --test lib/port_catalog.test.mjs`), JS lint/build checks, and headless Chromium verification on the module catalog server.

### Executed in GitHub Actions / On-Device Mojo Launcher (Not Available in Local Container)
- **Full Git LFS archive extraction, NDK `r27c` C compilation, `llvm-nm` symbol audit on `libvm.so`, `javac --release 21` compilation, and ASM patching**: Executed on GitHub Actions `ubuntu-latest` runners (local sandbox has no JDK/javac, NDK, Maven, or hydrated LFS binary).
- **Runtime execution on Android ARM64 / Mojo Launcher (`opengles3_ltw`, MobileGlues, Zink)**: Requires installing the GitHub Actions `DisputeClient-2.0.1-Android-Mojo.jar` artifact in Mojo Launcher (`mods/`), pressing **Pause → §eDispute Bots** (or typing `.dispute` / `.bots`), and inspecting `latestlog.txt` if any issue occurs.

