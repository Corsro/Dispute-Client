#!/usr/bin/env python3
"""
Builds the final Android/Mojo-ready CorzClient JAR by overlaying:
  - ASM-patched gg/corz/* classes from upstream JAR
  - Freshly compiled com/corz/client/{android,qvm,mixins,CorzClient} classes
  - Audited GLSL 330/ES-safe shaders from source/assets/
  - Android ARM64 NDK natives (libvm.so + libcorz_bionic_shim.so + optional libc++_shared.so)
and runs strict automated verification checks on the output JAR.
"""
import argparse
import json
import os
import re
import subprocess
import sys
import zipfile
from pathlib import Path


def validate_glsl_bytes(name: str, text: str) -> list[str]:
    errs = []
    if "#version 150" in text:
        errs.append(f"{name}: still contains #version 150")
    if re.search(r"for\s*\(\s*float\s+", text):
        errs.append(f"{name}: contains ES-illegal float loop counter")
    if re.search(r"\bvec[234]\s*\[\s*\]", text):
        errs.append(f"{name}: contains unsized vec[] array constructor")
    if name.endswith("corz_msdf_text.fsh") and "inversesqrt(h.x" in text:
        errs.append(f"{name}: contains unguarded inversesqrt(h.x...)")
    return errs


def patch_fabric_mod_json(raw_bytes: bytes, has_rpc_jar: bool, extra_mixins: list[str]) -> bytes:
    meta = json.loads(raw_bytes.decode("utf-8"))

    entrypoints = meta.setdefault("entrypoints", {})
    # Strip any malicious net.fabric.* entrypoint if ever present
    if "main" in entrypoints and isinstance(entrypoints["main"], list):
        clean_main = [e for e in entrypoints["main"] if not str(e).startswith("net.fabric.")]
        if clean_main:
            entrypoints["main"] = clean_main
        else:
            entrypoints.pop("main", None)

    client_eps = list(entrypoints.get("client", []))
    for ep in ("com.corz.client.CorzClient", "com.corz.client.bots.CorzBotsAddon"):
        if ep not in client_eps:
            client_eps.append(ep)
    entrypoints["client"] = client_eps

    mixins = list(meta.get("mixins", []))
    for m in extra_mixins:
        if m not in mixins:
            mixins.append(m)
    meta["mixins"] = mixins

    if has_rpc_jar:
        jars = list(meta.get("jars", []))
        rpc_ref = "META-INF/jars/client-rpc-1.0.0-bundled.jar"
        if not any(isinstance(j, dict) and j.get("file") == rpc_ref for j in jars):
            jars.append({"file": rpc_ref})
        meta["jars"] = jars

    meta["name"] = "Dispute Client"
    meta["description"] = "Dispute Client — a high-performance utility client and autonomous AI bot suite for Minecraft 1.21.11 (Android ARM64 & PC)."
    meta["authors"] = ["Dispute Team"]
    provides = list(meta.get("provides", []))
    for p in ("disputeclient", "corzclient"):
        if p not in provides:
            provides.append(p)
    meta["provides"] = provides

    return (json.dumps(meta, indent=2) + "\n").encode("utf-8")


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--asm-jar", required=True, help="ASM-patched upstream mod JAR")
    parser.add_argument("--compiled-classes", required=True, help="Directory with freshly compiled .class files")
    parser.add_argument("--android-native-dir", required=True, help="Directory with android-aarch64 .so files")
    parser.add_argument("--shaders-dir", default="source/assets/corzclient/shaders", help="Fixed GLSL shaders directory")
    parser.add_argument("--rpc-jar", default="libs/client-rpc-1.0.0-bundled.jar", help="Bundled pure-Java RPC protobuf jar")
    parser.add_argument(
        "--mixin-configs",
        nargs="*",
        default=["source/corzbot.mixins.json", "source/corzbots-addon.mixins.json"],
        help="Additional mixin JSON configs to include at JAR root",
    )
    parser.add_argument("--output-jar", required=True, help="Final output CorzClient Android JAR")
    parser.add_argument("--report", required=True, help="Verification report output path")
    parser.add_argument("--readelf", default="readelf")
    args = parser.parse_args()

    compiled_root = Path(args.compiled_classes)
    native_root = Path(args.android_native_dir)
    shaders_root = Path(args.shaders_dir)
    rpc_jar_path = Path(args.rpc_jar) if args.rpc_jar else None
    out_jar = Path(args.output_jar)
    out_jar.parent.mkdir(parents=True, exist_ok=True)

    overlays: dict[str, Path] = {}
    byte_overlays: dict[str, bytes] = {}

    for cls in compiled_root.rglob("*.class"):
        rel = cls.relative_to(compiled_root).as_posix()
        if rel.startswith("net/fabric/"):
            raise RuntimeError(f"Refusing to bundle disallowed net/fabric class: {rel}")
        overlays[rel] = cls

    for sh in shaders_root.rglob("*"):
        if sh.is_file():
            rel = f"assets/corzclient/shaders/{sh.relative_to(shaders_root).as_posix()}"
            overlays[rel] = sh

    for so_name in ("libcorz_bionic_shim.so", "libvm.so", "libc++_shared.so"):
        so_path = native_root / so_name
        if so_path.is_file():
            overlays[f"native/android-aarch64/{so_name}"] = so_path

    has_rpc_jar = bool(rpc_jar_path and rpc_jar_path.is_file())
    if has_rpc_jar:
        with zipfile.ZipFile(rpc_jar_path, "r") as zrpc:
            bad_rpc = [n for n in zrpc.namelist() if n.startswith("net/fabric/")]
            if bad_rpc:
                raise RuntimeError(f"RPC jar contains forbidden net/fabric entries: {bad_rpc}")
        overlays["META-INF/jars/client-rpc-1.0.0-bundled.jar"] = rpc_jar_path

    extra_mixin_names: list[str] = []
    for m_str in args.mixin_configs:
        mp = Path(m_str)
        if mp.is_file():
            overlays[mp.name] = mp
            extra_mixin_names.append(mp.name)

    with zipfile.ZipFile(args.asm_jar, "r") as zin:
        if "fabric.mod.json" in zin.namelist():
            byte_overlays["fabric.mod.json"] = patch_fabric_mod_json(
                zin.read("fabric.mod.json"), has_rpc_jar, extra_mixin_names
            )

    # Remove old inner classes belonging to replaced top-level Java classes cleanly
    replaced_prefixes = tuple(
        k[:-6] + "$" for k in overlays if k.endswith(".class") and "$" not in k
    )

    written = 0
    overwritten = 0
    added = 0

    with zipfile.ZipFile(args.asm_jar, "r") as zin, zipfile.ZipFile(
        out_jar, "w", compression=zipfile.ZIP_DEFLATED
    ) as zout:
        written_names = set()
        for info in zin.infolist():
            name = info.filename
            # Security & Android hygiene: strip any net/fabric malware or Windows vm.dll
            if name.startswith("net/fabric/") or name.endswith("vm.dll"):
                continue
            if name.endswith(".class") and name.startswith(replaced_prefixes) and name not in overlays:
                continue
            if name in byte_overlays:
                zout.writestr(name, byte_overlays[name])
                overwritten += 1
            elif name in overlays:
                zout.write(overlays[name], arcname=name)
                overwritten += 1
            else:
                zout.writestr(info, zin.read(name))
            written_names.add(name)
            written += 1

        for name, raw_b in sorted(byte_overlays.items()):
            if name not in written_names:
                zout.writestr(name, raw_b)
                added += 1

        for name, path in sorted(overlays.items()):
            if name not in written_names:
                zout.write(path, arcname=name)
                added += 1

    # Automated verification of the final artifact
    report_lines = [
        "Final Output JAR Verification Report",
        "====================================",
        f"Output JAR: {out_jar} ({out_jar.stat().st_size} bytes)",
        f"Base entries preserved/updated: {written}",
        f"Entries overwritten from compiled/fixed sources: {overwritten}",
        f"New entries added (android compat/natives/bots): {added}",
    ]

    with zipfile.ZipFile(out_jar, "r") as zchk:
        names = set(zchk.namelist())
        forbidden_entries = [n for n in names if n.startswith("net/fabric/") or n.endswith("vm.dll")]
        if forbidden_entries:
            raise RuntimeError(f"Final JAR contains forbidden malware/Windows entries: {forbidden_entries}")

        required_entries = [
            "fabric.mod.json",
            "corz-client.mixins.json",
            "corzbot.mixins.json",
            "corzbots-addon.mixins.json",
            "com/corz/client/CorzClient.class",
            "com/corz/client/LocalBranding.class",
            "com/corz/client/LocalCombat.class",
            "com/corz/client/LocalCompute.class",
            "com/corz/client/qvm/Runtime.class",
            "com/corz/client/android/AndroidRuntimeEnv.class",
            "com/corz/client/android/MojoInputBridge.class",
            "com/corz/client/android/MojoBlurCoordinator.class",
            "com/corz/client/android/AndroidFilePicker.class",
            "com/corz/client/android/CompatFileDialog.class",
            "com/corz/client/bots/CorzBotsAddon.class",
            "com/corz/client/bots/CorzBotsScreen.class",
            "com/corz/client/bots/MaceSpearBot.class",
            "com/corz/client/bots/TreeFarmerBot.class",
            "com/corz/client/bots/AutoOreMinerBot.class",
            "corzbot/CorzBot.class",
            "de/neo/uhcbot/UhcBotMod.class",
            "de/neo/uhcbot/Fighter.class",
            "META-INF/jars/client-rpc-1.0.0-bundled.jar",
            "gg/corz/iiIliiIIllii.class",
            "native/android-aarch64/libcorz_bionic_shim.so",
            "native/android-aarch64/libvm.so",
        ]
        missing_req = [r for r in required_entries if r not in names]
        if missing_req:
            raise RuntimeError(f"Final JAR missing required entries: {missing_req}")

        shader_errors = []
        shader_count = 0
        for member in sorted(names):
            if member.startswith("assets/corzclient/shaders/") and (
                member.endswith(".fsh") or member.endswith(".vsh") or member.endswith(".glsl")
            ):
                shader_count += 1
                shader_errors.extend(
                    validate_glsl_bytes(member, zchk.read(member).decode("utf-8", errors="replace"))
                )
        if shader_errors:
            raise RuntimeError("Shader validation failed:\n" + "\n".join(shader_errors))

        report_lines.append(f"Required core/android/QVM/native/bot entries: ALL {len(required_entries)} PRESENT")
        report_lines.append("Security check: ZERO net/fabric malware or vm.dll entries")
        report_lines.append(f"GLSL shaders validated inside JAR: {shader_count} (0 issues)")

    # Verify patched ELF inside android-native dir has zero glibc DT_NEEDED
    readelf_out = subprocess.check_output(
        [args.readelf, "-d", str(native_root / "libvm.so")], text=True
    )
    forbidden = ("libm.so.6", "libc.so.6", "libdl.so.2", "libpthread.so.0", "librt.so.1", "libstdc++.so.6")
    for bad in forbidden:
        if bad in readelf_out:
            raise RuntimeError(f"Patched android-aarch64/libvm.so still references glibc library {bad}!")
    report_lines.append("Patched libvm.so DT_NEEDED audit: ZERO glibc sonames remaining")

    Path(args.report).parent.mkdir(parents=True, exist_ok=True)
    Path(args.report).write_text("\n".join(report_lines) + "\n")
    print("\n".join(report_lines))


if __name__ == "__main__":
    main()
