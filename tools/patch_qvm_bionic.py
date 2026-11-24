#!/usr/bin/env python3
"""
Patches a glibc-linked ARM64 Linux shared library (libvm.so) for native execution
under Android 14+ Bionic linker (Mojo Launcher clns namespace), and audits every
undefined dynamic symbol against Android NDK Bionic stubs + libcorz_bionic_shim.so.
"""
import argparse
import os
import shutil
import struct
import subprocess
import sys

DT_NEEDED = 1
DT_STRTAB = 5
DT_STRSZ = 10
PT_LOAD = 1
PT_DYNAMIC = 2
DT_NULL = 0
DT_RPATH = 15
DT_RUNPATH = 29
DT_FLAGS_1 = 0x6FFFFFFB
DT_VERSYM = 0x6FFFFFF0
DT_VERNEED = 0x6FFFFFFE
DT_VERNEEDNUM = 0x6FFFFFFF

NEEDED_REWRITES = {
    "libm.so.6": "libm.so",
    "libc.so.6": "libc.so",
    "libdl.so.2": "libdl.so",
    "libpthread.so.0": "libc.so",
    "librt.so.1": "libc.so",
    "libutil.so.1": "libc.so",
    "ld-linux-aarch64.so.1": "libc.so",
    "libstdc++.so.6": "libc++_shared.so",
}

def run(cmd, capture=True):
    res = subprocess.run(cmd, text=True, capture_output=capture)
    if res.returncode != 0:
        raise RuntimeError(f"Command failed ({res.returncode}): {' '.join(cmd)}\n{res.stderr}\n{res.stdout}")
    return res.stdout

def get_dynamic_needed(readelf_bin, elf_path):
    out = run([readelf_bin, "-d", elf_path])
    needed = []
    for line in out.splitlines():
        if "(NEEDED)" in line and "[" in line:
            needed.append(line.split("[", 1)[1].split("]", 1)[0].strip())
    return needed

def vaddr_to_offset(load_segments, vaddr):
    for p_offset, p_vaddr, p_filesz in load_segments:
        if p_vaddr <= vaddr < p_vaddr + p_filesz:
            return p_offset + (vaddr - p_vaddr)
    return None

def read_cstr(data, offset):
    if offset is None or offset < 0 or offset >= len(data):
        return ""
    end = data.find(b"\x00", offset)
    if end == -1:
        return ""
    return data[offset:end].decode("utf-8", errors="replace")

def patch_elf64_dynamic_for_bionic(elf_path, first_needed="libcorz_bionic_shim.so"):
    """
    1) Neutralize DT_VERNEED / DT_VERNEEDNUM / DT_VERSYM dynamic tags and GNU_versym / GNU_verneed sections.
    2) Move `first_needed` (libcorz_bionic_shim.so) to the FIRST DT_NEEDED slot so shim overrides (dlopen,
       __assert_fail, etc.) resolve before libdl.so / libc.so inside Bionic's clns linker namespace.
    """
    with open(elf_path, "rb") as f:
        data = bytearray(f.read())

    if data[:4] != b"\x7fELF" or data[4] != 2 or data[5] != 1:
        raise RuntimeError(f"{elf_path} is not a little-endian 64-bit ELF")

    e_phoff = struct.unpack_from("<Q", data, 32)[0]
    e_shoff = struct.unpack_from("<Q", data, 40)[0]
    e_phentsize, e_phnum, e_shentsize, e_shnum, e_shstrndx = struct.unpack_from("<HHHHH", data, 54)

    load_segments = []
    dyn_off = dyn_size = 0
    for i in range(e_phnum):
        off = e_phoff + i * e_phentsize
        p_type, p_flags, p_offset, p_vaddr, p_paddr, p_filesz, p_memsz, p_align = struct.unpack_from("<IIQQQQQQ", data, off)
        if p_type == PT_LOAD:
            load_segments.append((p_offset, p_vaddr, p_filesz))
        elif p_type == PT_DYNAMIC:
            dyn_off, dyn_size = p_offset, p_filesz

    if dyn_off == 0:
        raise RuntimeError("No PT_DYNAMIC segment found in ELF")

    raw_entries = []
    strtab_vaddr = None
    pos = dyn_off
    end = dyn_off + dyn_size
    while pos + 16 <= end:
        d_tag, d_val = struct.unpack_from("<qQ", data, pos)
        pos += 16
        if d_tag == DT_NULL:
            break
        if d_tag == DT_STRTAB:
            strtab_vaddr = d_val
        raw_entries.append((d_tag, d_val))

    strtab_off = vaddr_to_offset(load_segments, strtab_vaddr) if strtab_vaddr is not None else None

    needed_entries = []
    other_entries = []
    removed_tags = []
    for d_tag, d_val in raw_entries:
        if d_tag in (DT_VERSYM, DT_VERNEED, DT_VERNEEDNUM):
            removed_tags.append(hex(d_tag))
            continue
        if d_tag == DT_NEEDED:
            needed_entries.append((d_tag, d_val))
        else:
            other_entries.append((d_tag, d_val))

    if strtab_off is not None:
        needed_entries.sort(
            key=lambda item: 0 if read_cstr(data, strtab_off + item[1]) == first_needed else 1
        )

    kept_entries = needed_entries + other_entries
    write_pos = dyn_off
    for d_tag, d_val in kept_entries:
        struct.pack_into("<qQ", data, write_pos, d_tag, d_val)
        write_pos += 16
    while write_pos + 16 <= end:
        struct.pack_into("<qQ", data, write_pos, DT_NULL, 0)
        write_pos += 16

    if e_shoff != 0 and e_shnum > 0:
        SHT_GNU_VERSYM = 0x6FFFFFFF
        SHT_GNU_VERNEED = 0x6FFFFFFE
        SHT_NULL = 0
        for i in range(e_shnum):
            sh_off = e_shoff + i * e_shentsize
            sh_name, sh_type, sh_flags, sh_addr, sh_offset, sh_size, sh_link, sh_info, sh_addralign, sh_entsize = struct.unpack_from("<IIQQQQIIQQ", data, sh_off)
            if sh_type == SHT_GNU_VERSYM:
                for k in range(0, sh_size, 2):
                    val = struct.unpack_from("<H", data, sh_offset + k)[0]
                    if val > 1:
                        struct.pack_into("<H", data, sh_offset + k, 1)
                struct.pack_into("<I", data, sh_off + 4, SHT_NULL)
                struct.pack_into("<II", data, sh_off + 40, 0, 0)
            elif sh_type == SHT_GNU_VERNEED:
                struct.pack_into("<I", data, sh_off + 4, SHT_NULL)
                struct.pack_into("<II", data, sh_off + 40, 0, 0)

    with open(elf_path, "wb") as f:
        f.write(data)
    print(f"Stripped GNU symbol versioning tags & prioritized {first_needed} in {elf_path}: {removed_tags}")

def parse_undefined_symbols(nm_bin, elf_path):
    out = run([nm_bin, "-D", "-u", elf_path])
    syms = set()
    for line in out.splitlines():
        parts = line.strip().split()
        if not parts:
            continue
        sym = parts[-1]
        if "@" in sym:
            sym = sym.split("@", 1)[0]
        if sym and sym != "U":
            syms.add(sym)
    return syms

def parse_defined_symbols(nm_bin, elf_path):
    out = run([nm_bin, "-D", "--defined-only", elf_path])
    syms = set()
    for line in out.splitlines():
        parts = line.strip().split()
        if len(parts) >= 3:
            sym = parts[-1]
            if "@" in sym:
                sym = sym.split("@", 1)[0]
            syms.add(sym)
    return syms

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--input", required=True, help="Original linux-aarch64 libvm.so")
    parser.add_argument("--output", required=True, help="Patched android-aarch64 libvm.so")
    parser.add_argument("--shim", required=True, help="Compiled Android ARM64 libcorz_bionic_shim.so")
    parser.add_argument("--ndk-sysroot-lib", required=True, help="NDK sysroot/usr/lib/aarch64-linux-android/28")
    parser.add_argument("--libcxx", default="", help="Optional libc++_shared.so path to copy if needed")
    parser.add_argument("--out-dir", required=True, help="Output directory for auxiliary runtime libs")
    parser.add_argument("--readelf", default="llvm-readelf")
    parser.add_argument("--nm", default="llvm-nm")
    parser.add_argument("--patchelf", default="patchelf")
    args = parser.parse_args()

    os.makedirs(os.path.dirname(args.output), exist_ok=True)
    os.makedirs(args.out_dir, exist_ok=True)
    shutil.copy2(args.input, args.output)

    needed_before = get_dynamic_needed(args.readelf, args.output)
    print("DT_NEEDED before:", needed_before)

    present_needed = set(needed_before)
    needs_libcxx = "libstdc++.so.6" in present_needed or "libc++_shared.so" in present_needed
    for old_lib, new_lib in NEEDED_REWRITES.items():
        if old_lib in present_needed:
            if new_lib not in present_needed:
                run([args.patchelf, "--replace-needed", old_lib, new_lib, args.output])
                present_needed.add(new_lib)
            else:
                run([args.patchelf, "--remove-needed", old_lib, args.output])
            present_needed.discard(old_lib)

    if "libcorz_bionic_shim.so" not in present_needed:
        run([args.patchelf, "--add-needed", "libcorz_bionic_shim.so", args.output])

    run([args.patchelf, "--set-rpath", "$ORIGIN", args.output])
    patch_elf64_dynamic_for_bionic(args.output, first_needed="libcorz_bionic_shim.so")

    needed_after = get_dynamic_needed(args.readelf, args.output)
    print("DT_NEEDED after:", needed_after)

    shutil.copy2(args.shim, os.path.join(args.out_dir, "libcorz_bionic_shim.so"))
    available_libs = [
        args.shim,
        os.path.join(args.ndk_sysroot_lib, "libc.so"),
        os.path.join(args.ndk_sysroot_lib, "libm.so"),
        os.path.join(args.ndk_sysroot_lib, "libdl.so"),
    ]
    if needs_libcxx and args.libcxx and os.path.isfile(args.libcxx):
        shutil.copy2(args.libcxx, os.path.join(args.out_dir, "libc++_shared.so"))
        available_libs.append(args.libcxx)

    defined = set()
    for lib_path in available_libs:
        if os.path.isfile(lib_path):
            defined |= parse_defined_symbols(args.nm, lib_path)

    needed_syms = parse_undefined_symbols(args.nm, args.output)
    missing = sorted(s for s in needed_syms if s not in defined and not s.startswith("__aeabi_"))

    print(f"Total undefined symbols in libvm.so: {len(needed_syms)}")
    print(f"Provided by Bionic API28 + shim: {len(needed_syms) - len(missing)}")
    if missing:
        print("MISSING_BIONIC_SYMBOLS:", missing)
        sys.exit(2)
    print("ALL symbols in patched libvm.so resolved cleanly against Android Bionic + libcorz_bionic_shim.so!")

if __name__ == "__main__":
    main()
