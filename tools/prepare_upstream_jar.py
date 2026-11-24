#!/usr/bin/env python3
"""
Extracts and inspects Corz-Client.zip (fetched via Git LFS in GitHub Actions),
locates the primary corzclient Fabric mod JAR and native/linux-aarch64/libvm.so,
and writes build/upstream/paths.env for downstream NDK/ASM/javac steps.
"""
import os
import shutil
import sys
import zipfile
from pathlib import Path

ZIP_PATH = Path("Corz-Client.zip")
OUT_DIR = Path("build/upstream")


def is_corz_mod_jar(jar_path: Path) -> bool:
    try:
        with zipfile.ZipFile(jar_path, "r") as zf:
            names = set(zf.namelist())
            return (
                "com/corz/client/CorzClient.class" in names
                and "com/corz/client/qvm/Runtime.class" in names
            )
    except zipfile.BadZipFile:
        return False


def main():
    if not ZIP_PATH.is_file():
        print(f"ERROR: {ZIP_PATH} not found.", file=sys.stderr)
        sys.exit(1)

    size = ZIP_PATH.stat().st_size
    if size < 1024 * 1024:
        content = ZIP_PATH.read_text(errors="replace")
        if "git-lfs.github.com/spec/v1" in content:
            print(
                f"ERROR: {ZIP_PATH} is a {size}-byte Git LFS pointer, not the actual archive. "
                "Ensure actions/checkout uses `lfs: true`.",
                file=sys.stderr,
            )
            sys.exit(1)

    if OUT_DIR.exists():
        shutil.rmtree(OUT_DIR)
    OUT_DIR.mkdir(parents=True, exist_ok=True)
    unpacked = OUT_DIR / "unpacked"
    unpacked.mkdir(parents=True, exist_ok=True)

    mod_jar: Path | None = None
    with zipfile.ZipFile(ZIP_PATH, "r") as zf:
        names = set(zf.namelist())
        if "com/corz/client/CorzClient.class" in names and "com/corz/client/qvm/Runtime.class" in names:
            mod_jar = OUT_DIR / "corzclient-upstream.jar"
            shutil.copy2(ZIP_PATH, mod_jar)
        else:
            zf.extractall(unpacked)
            candidates = sorted(unpacked.rglob("*.jar"))
            for cand in candidates:
                if is_corz_mod_jar(cand):
                    mod_jar = cand
                    break

    if mod_jar is None:
        print("ERROR: Could not locate JAR containing com/corz/client/CorzClient.class inside Corz-Client.zip", file=sys.stderr)
        sys.exit(1)

    native_dir = OUT_DIR / "native"
    native_dir.mkdir(parents=True, exist_ok=True)
    linux_vm = None
    with zipfile.ZipFile(mod_jar, "r") as zf:
        for member in zf.namelist():
            if member.startswith("native/") and not member.endswith("/"):
                dest = native_dir / Path(member).relative_to("native")
                dest.parent.mkdir(parents=True, exist_ok=True)
                with zf.open(member) as src, open(dest, "wb") as dst:
                    shutil.copyfileobj(src, dst)
                if member == "native/linux-aarch64/libvm.so":
                    linux_vm = dest

    if linux_vm is None or not linux_vm.is_file():
        print("ERROR: native/linux-aarch64/libvm.so not found inside upstream JAR", file=sys.stderr)
        sys.exit(1)

    env_file = OUT_DIR / "paths.env"
    env_file.write_text(
        f"UPSTREAM_MOD_JAR={mod_jar.resolve()}\n"
        f"UPSTREAM_LINUX_ARM64_VM={linux_vm.resolve()}\n"
        f"UPSTREAM_UNPACKED_DIR={unpacked.resolve()}\n"
    )
    print(f"Prepared upstream mod JAR: {mod_jar}")
    print(f"Prepared linux-aarch64 libvm.so: {linux_vm} ({linux_vm.stat().st_size} bytes)")


if __name__ == "__main__":
    main()
