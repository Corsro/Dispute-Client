#!/usr/bin/env python3
"""
Prepares the clean Dispute Client v2.0.3 upstream mod JAR for ASM patching and overlay compilation.

Uses upstream/CorzClient-2.0.3-clean.jar (malware-stripped, vm.dll-free 2.0.3 Fabric mod JAR),
or falls back to stripping net/fabric/*, gg/corz/injector/*, assets/wvbwipuv.cfg, and vm.dll
from any local 2.0.3 archive (CorzClient-1.21.11.jar.zip / CorzClient-1.21.11.jar).
No native libvm.so or dummy ELF stubs are required in v2.0.3 Pure-Java mode.
"""
import shutil
import sys
import zipfile
from pathlib import Path

CLEAN_UPSTREAM = Path("upstream/CorzClient-2.0.3-clean.jar")
OUT_DIR = Path("build/upstream")
FORBIDDEN_PREFIXES = ("net/fabric/", "gg/corz/injector/")
FORBIDDEN_EXACT = {"assets/wvbwipuv.cfg", "META-INF/jars/client-rpc-1.0.0-bundled.jar"}


def norm_path(p: str) -> str:
    return p.replace("\\", "/").lstrip("/")


def is_forbidden(norm_name: str) -> bool:
    if any(norm_name.startswith(p) for p in FORBIDDEN_PREFIXES):
        return True
    if norm_name in FORBIDDEN_EXACT:
        return True
    if norm_name.endswith(".dll") or norm_name.endswith(".exe"):
        return True
    if norm_name.startswith("META-INF/") and (norm_name.endswith(".SF") or norm_name.endswith(".DSA") or norm_name.endswith(".RSA")):
        return True
    return False


def is_corz_mod_jar(jar_path: Path) -> bool:
    try:
        with zipfile.ZipFile(jar_path, "r") as zf:
            names = {norm_path(n) for n in zf.namelist()}
            return (
                "com/corz/client/CorzClient.class" in names
                and "corz-client.mixins.json" in names
                and any(n.startswith("gg/corz/") for n in names)
            )
    except Exception:
        return False


def strip_archive_to_clean_jar(src_jar: Path, dst_jar: Path) -> None:
    dst_jar.parent.mkdir(parents=True, exist_ok=True)
    with zipfile.ZipFile(src_jar, "r") as zin, zipfile.ZipFile(dst_jar, "w", compression=zipfile.ZIP_DEFLATED) as zout:
        for member in zin.infolist():
            norm = norm_path(member.filename)
            if not norm or norm.endswith("/") or is_forbidden(norm):
                continue
            zout.writestr(norm, zin.read(member.filename))


def main():
    if OUT_DIR.exists():
        shutil.rmtree(OUT_DIR)
    OUT_DIR.mkdir(parents=True, exist_ok=True)

    target_jar = OUT_DIR / "corzclient-upstream.jar"

    if CLEAN_UPSTREAM.is_file() and is_corz_mod_jar(CLEAN_UPSTREAM):
        strip_archive_to_clean_jar(CLEAN_UPSTREAM, target_jar)
        print(f"Prepared clean v2.0.3 upstream mod JAR from {CLEAN_UPSTREAM} -> {target_jar}")
    else:
        candidates = [
            p for p in sorted(Path(".").glob("*.jar*")) + sorted(Path("upstream").glob("*.jar*"))
            if p.is_file() and is_corz_mod_jar(p)
        ]
        if not candidates:
            print("ERROR: Could not locate clean 2.0.3 mod JAR (upstream/CorzClient-2.0.3-clean.jar).", file=sys.stderr)
            sys.exit(1)
        strip_archive_to_clean_jar(candidates[0], target_jar)
        print(f"Sanitized v2.0.3 mod JAR from {candidates[0]} -> {target_jar}")

    env_file = OUT_DIR / "paths.env"
    env_file.write_text(f"UPSTREAM_MOD_JAR={target_jar.resolve()}\n")
    print(f"Wrote {env_file} (pure-Java mode; zero native libvm.so needed)")


if __name__ == "__main__":
    main()
