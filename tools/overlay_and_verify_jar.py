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


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--asm-jar", required=True, help="ASM-patched upstream mod JAR")
    parser.add_argument("--compiled-classes", required=True, help="Directory with freshly compiled .class files")
    parser.add_argument("--android-native-dir", required=True, help="Directory with android-aarch64 .so files")
    parser.add_argument("--shaders-dir", default="source/assets/corzclient/shaders", help="Fixed GLSL shaders directory")
    parser.add_argument("--output-jar", required=True, help="Final output CorzClient Android JAR")
    parser.add_argument("--report", required=True, help="Verification report output path")
    parser.add_argument("--readelf", default="readelf")
    args = parser.parse_args()

    compiled_root = Path(args.compiled_classes)
    native_root = Path(args.android_native_dir)
    shaders_root = Path(args.shaders_dir)
    out_jar = Path(args.output_jar)
    out_jar.parent.mkdir(parents=True, exist_ok=True)

    overlays: dict[str, Path] = {}

    for cls in compiled_root.rglob("*.class"):
        rel = cls.relative_to(compiled_root).as_posix()
        overlays[rel] = cls

    for sh in shaders_root.rglob("*"):
        if sh.is_file():
            rel = f"assets/corzclient/shaders/{sh.relative_to(shaders_root).as_posix()}"
            overlays[rel] = sh

    for so_name in ("libcorz_bionic_shim.so", "libvm.so", "libc++_shared.so"):
        so_path = native_root / so_name
        if so_path.is_file():
            overlays[f"native/android-aarch64/{so_name}"] = so_path

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
            if name.endswith(".class") and name.startswith(replaced_prefixes) and name not in overlays:
                # Skip stale anonymous/inner class of a freshly recompiled class
                continue
            if name in overlays:
                zout.write(overlays[name], arcname=name)
                overwritten += 1
            else:
                zout.writestr(info, zin.read(name))
            written_names.add(name)
            written += 1

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
        f"New entries added (android compat/natives): {added}",
    ]

    with zipfile.ZipFile(out_jar, "r") as zchk:
        names = set(zchk.namelist())
        required_entries = [
            "fabric.mod.json",
            "corz-client.mixins.json",
            "com/corz/client/CorzClient.class",
            "com/corz/client/qvm/Runtime.class",
            "com/corz/client/android/AndroidRuntimeEnv.class",
            "com/corz/client/android/MojoInputBridge.class",
            "com/corz/client/android/MojoBlurCoordinator.class",
            "com/corz/client/android/AndroidFilePicker.class",
            "com/corz/client/android/CompatFileDialog.class",
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
            raise RuntimeError(f"Shader validation failed:\n" + "\n".join(shader_errors))

        report_lines.append(f"Required core/android/QVM/native entries: ALL {len(required_entries)} PRESENT")
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
