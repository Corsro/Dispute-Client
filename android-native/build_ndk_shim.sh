#!/usr/bin/env bash
set -euo pipefail

NDK_HOME="${ANDROID_NDK_HOME:-${ANDROID_NDK_ROOT:-}}"
if [[ -z "${NDK_HOME}" ]]; then
  echo "ERROR: ANDROID_NDK_HOME / ANDROID_NDK_ROOT is not set." >&2
  exit 1
fi

HOST_TAG="linux-x86_64"
TOOLCHAIN="${NDK_HOME}/toolchains/llvm/prebuilt/${HOST_TAG}"
CLANG="${TOOLCHAIN}/bin/aarch64-linux-android28-clang"
SYSROOT_LIB="${TOOLCHAIN}/sysroot/usr/lib/aarch64-linux-android/28"
LIBCXX="${TOOLCHAIN}/sysroot/usr/lib/aarch64-linux-android/libc++_shared.so"
LLVM_READELF="${TOOLCHAIN}/bin/llvm-readelf"
LLVM_NM="${TOOLCHAIN}/bin/llvm-nm"

OUT_DIR="${1:-build/android-native}"
LINUX_LIBVM="${2:-}"

mkdir -p "${OUT_DIR}"

echo "[NDK] Building libcorz_bionic_shim.so with ${CLANG}"
"${CLANG}" \
  -shared -fPIC -O2 -Wall -Wextra \
  -Wl,-soname,libcorz_bionic_shim.so \
  android-native/src/corz_bionic_shim.c \
  -o "${OUT_DIR}/libcorz_bionic_shim.so" \
  -llog -ldl -lm -lc

if [[ -n "${LINUX_LIBVM}" && -f "${LINUX_LIBVM}" ]]; then
  echo "[ELF] Patching ${LINUX_LIBVM} -> ${OUT_DIR}/libvm.so"
  python3 tools/patch_qvm_bionic.py \
    --input "${LINUX_LIBVM}" \
    --output "${OUT_DIR}/libvm.so" \
    --shim "${OUT_DIR}/libcorz_bionic_shim.so" \
    --ndk-sysroot-lib "${SYSROOT_LIB}" \
    --libcxx "${LIBCXX}" \
    --out-dir "${OUT_DIR}" \
    --readelf "${LLVM_READELF}" \
    --nm "${LLVM_NM}"
fi
