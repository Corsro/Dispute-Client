#!/usr/bin/env python3
"""
Extracts and inspects Corz-Client.zip (fetched via Git LFS in GitHub Actions),
locates the primary corzclient Fabric mod JAR and native/linux-aarch64/libvm.so,
and writes build/upstream/paths.env for downstream NDK/ASM/javac steps.

Handles Windows backslash archive entries, nested .zip/.mrpack/.jar files,
and loose class tree layouts seamlessly.
"""
import os
import shutil
import sys
import zipfile
from pathlib import Path

ZIP_PATH = Path("Corz-Client.zip")
OUT_DIR = Path("build/upstream")


def norm_path(p: str) -> str:
    return p.replace("\\", "/").lstrip("/")


def is_corz_mod_jar(jar_path: Path) -> bool:
    try:
        with zipfile.ZipFile(jar_path, "r") as zf:
            names = {norm_path(n) for n in zf.namelist()}
            has_client = any(n == "com/corz/client/CorzClient.class" or n.endswith("/com/corz/client/CorzClient.class") for n in names)
            has_marker = any("gg/corz/" in n or "com/corz/client/qvm/" in n or "corz-client.mixins.json" in n for n in names)
            return has_client and has_marker
    except Exception:
        return False


def safe_extract_zip(zf: zipfile.ZipFile, target_dir: Path) -> None:
    for member in zf.infolist():
        norm = norm_path(member.filename)
        if not norm or norm.endswith("/") or norm.startswith("../"):
            continue
        dest = target_dir / norm
        dest.parent.mkdir(parents=True, exist_ok=True)
        with zf.open(member) as src, open(dest, "wb") as dst:
            shutil.copyfileobj(src, dst)


def unpack_nested_zips(root: Path, max_depth: int = 3) -> None:
    seen: set[Path] = set()
    for depth in range(max_depth):
        archives = [
            p for p in sorted(root.rglob("*"))
            if p.is_file() and p.suffix.lower() in (".zip", ".mrpack", ".jar") and p not in seen
        ]
        if not archives:
            break
        for ap in archives:
            seen.add(ap)
            target = ap.parent / f"_unpacked_{ap.stem}"
            target.mkdir(parents=True, exist_ok=True)
            try:
                with zipfile.ZipFile(ap, "r") as nested:
                    safe_extract_zip(nested, target)
                print(f"Unpacked nested archive (depth {depth + 1}): {ap}")
            except Exception as exc:
                print(f"Skipping unextractable archive {ap}: {exc}", file=sys.stderr)


def pack_unpacked_class_dir_if_present(unpacked: Path, out_jar: Path) -> Path | None:
    for hit in sorted(unpacked.rglob("CorzClient.class")):
        parts = hit.parts
        if len(parts) >= 4 and parts[-4:] == ("com", "corz", "client", "CorzClient.class"):
            cls_root = hit.parents[3]
            with zipfile.ZipFile(out_jar, "w", compression=zipfile.ZIP_DEFLATED) as zout:
                for item in sorted(cls_root.rglob("*")):
                    if item.is_file():
                        rel = item.relative_to(cls_root).as_posix()
                        zout.write(item, arcname=rel)
            print(f"Packed unpacked class tree {cls_root} -> {out_jar}")
            return out_jar

    for hit in sorted(unpacked.rglob("*CorzClient.class")):
        curr = hit.parent
        while curr != unpacked and curr != curr.parent:
            if (curr / "fabric.mod.json").is_file() or (curr / "corz-client.mixins.json").is_file() or (curr / "META-INF").is_dir():
                with zipfile.ZipFile(out_jar, "w", compression=zipfile.ZIP_DEFLATED) as zout:
                    for item in sorted(curr.rglob("*")):
                        if item.is_file():
                            zout.write(item, arcname=item.relative_to(curr).as_posix())
                print(f"Packed mod root {curr} -> {out_jar}")
                return out_jar
            curr = curr.parent
    return None


def is_lfs_pointer(p: Path) -> bool:
    try:
        if p.stat().st_size < 1024:
            txt = p.read_text(errors="ignore")
            return "git-lfs.github.com/spec/v1" in txt
    except Exception:
        pass
    return False


def main():
    candidate_zips = [ZIP_PATH] + sorted(Path(".").glob("*.zip")) + sorted(Path(".").glob("*.jar"))
    archive_to_use = None
    for cand in candidate_zips:
        if cand.is_file() and not is_lfs_pointer(cand):
            archive_to_use = cand
            break

    if archive_to_use is None:
        if ZIP_PATH.is_file() and is_lfs_pointer(ZIP_PATH):
            size = ZIP_PATH.stat().st_size
            print(
                f"ERROR: {ZIP_PATH} is a {size}-byte Git LFS pointer, not the actual archive. "
                "Ensure actions/checkout uses `lfs: true`.",
                file=sys.stderr,
            )
            sys.exit(1)
        print(f"ERROR: No valid CorzClient archive found (checked {ZIP_PATH}).", file=sys.stderr)
        sys.exit(1)

    print(f"Using upstream archive: {archive_to_use} ({archive_to_use.stat().st_size} bytes)")

    if OUT_DIR.exists():
        shutil.rmtree(OUT_DIR)
    OUT_DIR.mkdir(parents=True, exist_ok=True)
    unpacked = OUT_DIR / "unpacked"
    unpacked.mkdir(parents=True, exist_ok=True)

    mod_jar: Path | None = None
    with zipfile.ZipFile(archive_to_use, "r") as zf:
        names = {norm_path(n) for n in zf.namelist()}
        target = "com/corz/client/CorzClient.class"

        # Check for direct or subfolder-wrapped CorzClient.class
        detected_prefix: str | None = None
        for n in names:
            if n == target:
                detected_prefix = ""
                break
            elif n.endswith("/" + target):
                detected_prefix = n[:-len(target)]
                break

        if detected_prefix is not None:
            mod_jar = OUT_DIR / "corzclient-upstream.jar"
            with zipfile.ZipFile(mod_jar, "w", compression=zipfile.ZIP_DEFLATED) as zout:
                for member in zf.infolist():
                    norm = norm_path(member.filename)
                    if not norm or norm.endswith("/"):
                        continue
                    if detected_prefix and norm.startswith(detected_prefix):
                        rel = norm[len(detected_prefix):]
                    elif not detected_prefix:
                        rel = norm
                    else:
                        rel = norm
                    if rel and not rel.endswith("/"):
                        zout.writestr(rel, zf.read(member))
            print(f"Extracted and normalized upstream archive (prefix={repr(detected_prefix)}) -> {mod_jar}")
            # Also safe-extract to unpacked for diagnostics and loose native libs
            safe_extract_zip(zf, unpacked)
        else:
            safe_extract_zip(zf, unpacked)
            candidates = [p for p in sorted(unpacked.rglob("*.jar")) if p.is_file() and is_corz_mod_jar(p)]
            if candidates:
                mod_jar = candidates[0]
            else:
                unpack_nested_zips(unpacked)
                candidates = [p for p in sorted(unpacked.rglob("*.jar")) if p.is_file() and is_corz_mod_jar(p)]
                if candidates:
                    mod_jar = candidates[0]
                else:
                    mod_jar = pack_unpacked_class_dir_if_present(unpacked, OUT_DIR / "corzclient-upstream.jar")

    if mod_jar is None:
        for loose_jar in sorted(Path(".").glob("*.jar")) + sorted(Path("mods").glob("*.jar")):
            if is_corz_mod_jar(loose_jar):
                mod_jar = loose_jar
                print(f"Found loose mod JAR in workspace: {loose_jar}")
                break

    if mod_jar is None:
        print("ERROR: Could not locate JAR containing com/corz/client/CorzClient.class inside archive", file=sys.stderr)
        all_files = [p.relative_to(unpacked).as_posix() for p in sorted(unpacked.rglob("*")) if p.is_file()]
        print(f"Archive {archive_to_use} unpacked file count={len(all_files)}", file=sys.stderr)
        for sample in all_files[:60]:
            print(f"  [entry] {sample}", file=sys.stderr)
        sys.exit(1)

    native_dir = OUT_DIR / "native"
    native_dir.mkdir(parents=True, exist_ok=True)
    linux_vm = None

    with zipfile.ZipFile(mod_jar, "r") as zf:
        for member in zf.namelist():
            norm = norm_path(member)
            if not norm or norm.endswith("/"):
                continue
            if norm.startswith("native/"):
                rel_native = norm[len("native/"):]
            elif norm.startswith("com/corz/client/qvm/native/"):
                rel_native = norm[len("com/corz/client/qvm/native/"):]
            elif norm.endswith("libvm.so"):
                rel_native = "linux-aarch64/libvm.so"
            else:
                continue
            dest = native_dir / rel_native
            dest.parent.mkdir(parents=True, exist_ok=True)
            with zf.open(member) as src, open(dest, "wb") as dst:
                shutil.copyfileobj(src, dst)
            if rel_native.endswith("linux-aarch64/libvm.so"):
                linux_vm = dest

    if linux_vm is None:
        for cand_vm in sorted(unpacked.rglob("libvm.so")):
            if "linux-aarch64" in str(cand_vm) or "aarch64" in str(cand_vm) or "arm64" in str(cand_vm):
                dest = native_dir / "linux-aarch64" / "libvm.so"
                dest.parent.mkdir(parents=True, exist_ok=True)
                shutil.copy2(cand_vm, dest)
                linux_vm = dest
                break
        if linux_vm is None:
            for cand_vm in sorted(unpacked.rglob("libvm.so")):
                dest = native_dir / "linux-aarch64" / "libvm.so"
                dest.parent.mkdir(parents=True, exist_ok=True)
                shutil.copy2(cand_vm, dest)
                linux_vm = dest
                break

    if linux_vm is None:
        for loose_vm in sorted(Path(".").rglob("libvm.so")):
            dest = native_dir / "linux-aarch64" / "libvm.so"
            dest.parent.mkdir(parents=True, exist_ok=True)
            shutil.copy2(loose_vm, dest)
            linux_vm = dest
            break

    if linux_vm is None or not linux_vm.is_file():
        print("ERROR: linux-aarch64/libvm.so not found inside upstream JAR or unpacked archive", file=sys.stderr)
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
