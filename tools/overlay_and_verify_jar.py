#!/usr/bin/env python3
"""
Builds the final Android ARM64 / Mojo Launcher-ready Dispute Client v2.0.3 JAR by overlaying:
  - ASM-patched pure-Java gg/corz/*, corzbot/*, de/neo/uhcbot/*, com/corz/client/bot/* classes
  - Freshly compiled com/corz/client/{android,qvm,mixins,CorzClient,LocalBranding} classes
  - Updated 2.0.3 metadata (fabric.mod.json, corz-client.mixins.json, META-INF/corz-module-ids.properties)
  - All 78 GLSL ES-safe shaders from source/assets/corzclient/shaders
  - Bundled pure-Java RPC protobuf jar (libs/client-rpc-1.0.0-bundled.jar)
and runs strict automated verification checks on the output JAR.
"""
import argparse
import json
import re
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
    if name.endswith("corz_msdf_world.fsh") and "vec2 w = fwidth(" in text:
        errs.append(f"{name}: contains unguarded fwidth() without max(..., 1.0e-6)")
    return errs


def patch_fabric_mod_json(raw_bytes: bytes, has_rpc_jar: bool) -> bytes:
    meta = json.loads(raw_bytes.decode("utf-8"))

    entrypoints = meta.setdefault("entrypoints", {})
    if "main" in entrypoints and isinstance(entrypoints["main"], list):
        clean_main = [e for e in entrypoints["main"] if not str(e).startswith("net.fabric.")]
        if clean_main:
            entrypoints["main"] = clean_main
        else:
            entrypoints.pop("main", None)

    entrypoints["client"] = ["com.corz.client.CorzClient"]
    meta["mixins"] = ["corz-client.mixins.json"]

    if has_rpc_jar:
        jars = list(meta.get("jars", []))
        rpc_ref = "META-INF/jars/client-rpc-1.0.0-bundled.jar"
        if not any(isinstance(j, dict) and j.get("file") == rpc_ref for j in jars):
            jars.append({"file": rpc_ref})
        meta["jars"] = jars

    meta["id"] = "corzclient"
    meta["version"] = "2.0.3"
    meta["name"] = "Dispute Client"
    meta["description"] = "Dispute Client — a pure-Java high-performance utility client and autonomous AI bot suite for Minecraft 1.21.11 (Android ARM64 Mojo Launcher & PC)."
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
    parser.add_argument("--shaders-dir", default="source/assets/corzclient/shaders", help="Fixed GLSL shaders directory")
    parser.add_argument("--rpc-jar", default="libs/client-rpc-1.0.0-bundled.jar", help="Bundled pure-Java RPC protobuf jar")
    parser.add_argument("--source-dir", default="source", help="Source metadata/resources directory")
    parser.add_argument("--output-jar", required=True, help="Final output Dispute Client Android JAR")
    parser.add_argument("--report", required=True, help="Verification report output path")
    args = parser.parse_args()

    compiled_root = Path(args.compiled_classes)
    shaders_root = Path(args.shaders_dir)
    source_root = Path(args.source_dir)
    rpc_jar_path = Path(args.rpc_jar) if args.rpc_jar else None
    out_jar = Path(args.output_jar)
    out_jar.parent.mkdir(parents=True, exist_ok=True)

    overlays: dict[str, Path] = {}
    byte_overlays: dict[str, bytes] = {}

    for cls in sorted(compiled_root.rglob("*.class")):
        rel = cls.relative_to(compiled_root).as_posix()
        if rel.startswith("net/fabric/") or rel.startswith("gg/corz/injector/"):
            raise RuntimeError(f"Refusing to bundle disallowed class: {rel}")
        overlays[rel] = cls

    for sh in sorted(shaders_root.rglob("*")):
        if sh.is_file():
            rel = f"assets/corzclient/shaders/{sh.relative_to(shaders_root).as_posix()}"
            overlays[rel] = sh

    for meta_rel in ("corz-client.mixins.json", "META-INF/corz-module-ids.properties"):
        mp = source_root / meta_rel
        if mp.is_file():
            overlays[meta_rel] = mp

    has_rpc_jar = bool(rpc_jar_path and rpc_jar_path.is_file())
    if has_rpc_jar:
        with zipfile.ZipFile(rpc_jar_path, "r") as zrpc:
            bad_rpc = [
                n for n in zrpc.namelist()
                if n.startswith("net/fabric/") or n.endswith(".dll") or n.endswith(".so")
            ]
            if bad_rpc:
                raise RuntimeError(f"RPC jar contains forbidden native/malware entries: {bad_rpc}")
        overlays["META-INF/jars/client-rpc-1.0.0-bundled.jar"] = rpc_jar_path

    fmod_source = source_root / "fabric.mod.json"
    if fmod_source.is_file():
        byte_overlays["fabric.mod.json"] = patch_fabric_mod_json(fmod_source.read_bytes(), has_rpc_jar)
    else:
        with zipfile.ZipFile(args.asm_jar, "r") as zin:
            if "fabric.mod.json" in zin.namelist():
                byte_overlays["fabric.mod.json"] = patch_fabric_mod_json(zin.read("fabric.mod.json"), has_rpc_jar)

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
            if not name or name.endswith("/"):
                continue
            if (
                name.startswith("net/fabric/")
                or name.startswith("gg/corz/injector/")
                or name == "assets/wvbwipuv.cfg"
                or name.endswith(".dll")
                or name.endswith(".exe")
            ):
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
                zout.writestr(name, zin.read(name))
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

    report_lines = [
        "Final Output JAR Verification Report (Dispute Client v2.0.3)",
        "============================================================",
        f"Output JAR: {out_jar} ({out_jar.stat().st_size} bytes)",
        f"Base entries preserved/updated: {written}",
        f"Entries overwritten from compiled/fixed sources: {overwritten}",
        f"New entries added: {added}",
    ]

    with zipfile.ZipFile(out_jar, "r") as zchk:
        names = set(zchk.namelist())
        forbidden_entries = [
            n for n in names
            if n.startswith("net/fabric/")
            or n.startswith("gg/corz/injector/")
            or n == "assets/wvbwipuv.cfg"
            or n.endswith(".dll")
            or n.endswith(".exe")
            or n.endswith(".so")
            or n.endswith(".dylib")
        ]
        if forbidden_entries:
            raise RuntimeError(f"Final JAR contains forbidden malware/native binary entries: {forbidden_entries}")

        fmod = json.loads(zchk.read("fabric.mod.json").decode("utf-8"))
        if fmod.get("version") != "2.0.3" or fmod.get("name") != "Dispute Client":
            raise RuntimeError(f"Unexpected fabric.mod.json metadata: {fmod}")
        fmod_text = json.dumps(fmod)
        if "CorzClientCrackedBYM4" in fmod_text or "net.fabric." in fmod_text:
            raise RuntimeError("fabric.mod.json still contains banned crack/malware identifiers!")

        mixins_cfg = json.loads(zchk.read("corz-client.mixins.json").decode("utf-8"))
        if "MixinGameMenuScreenDispute" not in mixins_cfg.get("client", []):
            raise RuntimeError("corz-client.mixins.json missing MixinGameMenuScreenDispute")

        required_entries = [
            "fabric.mod.json",
            "corz-client.mixins.json",
            "META-INF/corz-module-ids.properties",
            "META-INF/jars/client-rpc-1.0.0-bundled.jar",
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
            "com/corz/client/mixins/MixinWindow.class",
            "com/corz/client/mixins/MixinMouse.class",
            "com/corz/client/mixins/MixinKeyboard.class",
            "com/corz/client/mixins/MixinGameRenderer.class",
            "com/corz/client/mixins/MixinGameRendererMotionBlur.class",
            "com/corz/client/mixins/MixinHeldItemRenderer.class",
            "com/corz/client/mixins/MixinGameMenuScreenDispute.class",
            "corzbot/CorzBot.class",
            "de/neo/uhcbot/UhcBotMod.class",
            "de/neo/uhcbot/Fighter.class",
            "gg/corz/IIIIli.class",
            "gg/corz/IIIilliI.class",
            "gg/corz/IIIiillll.class",
            "gg/corz/IIlillIIi.class",
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

        report_lines.append(f"Required core/android/QVM-free/bot entries: ALL {len(required_entries)} PRESENT")
        report_lines.append("Security & native audit: ZERO net/fabric/* malware, ZERO injector/*, ZERO vm.dll / .so binaries")
        report_lines.append(f"GLSL shaders validated inside JAR: {shader_count} (0 issues)")
        report_lines.append("Branding & metadata: Dispute Client v2.0.3 verified")

    Path(args.report).parent.mkdir(parents=True, exist_ok=True)
    Path(args.report).write_text("\n".join(report_lines) + "\n")
    print("\n".join(report_lines))


if __name__ == "__main__":
    main()
