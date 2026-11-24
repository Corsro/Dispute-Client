#!/usr/bin/env python3
"""
Fetches the exact intermediary Minecraft 1.21.11 + Fabric Loader + Fabric API +
Mixin + MixinExtras + LWJGL + ASM compile classpath without needing Loom remapping,
so sources already in intermediary (class_310, method_1551, etc.) compile cleanly.
"""
import json
import os
import shutil
import subprocess
import sys
import urllib.request
import xml.etree.ElementTree as ET
import zipfile
from pathlib import Path

MC_VERSION = os.environ.get("MC_VERSION", "1.21.11")
FABRIC_LOADER_VERSION = os.environ.get("FABRIC_LOADER_VERSION", "0.19.3")
FABRIC_API_VERSION = os.environ.get("FABRIC_API_VERSION", "")  # auto-resolve latest for MC_VERSION if empty
MIXIN_VERSION = "0.15.4+mixin.0.8.7"
MIXIN_EXTRAS_VERSION = "0.5.4"
TINY_REMAPPER_VERSION = "0.10.4"
MAPPING_IO_VERSION = "0.7.1"
ASM_VERSION = "9.7.1"

DEPS_DIR = Path("build/deps")
CP_FILE = DEPS_DIR / "compile_classpath.txt"
ASM_CP_FILE = DEPS_DIR / "asm_classpath.txt"


def download(url: str, dest: Path) -> Path:
    dest.parent.mkdir(parents=True, exist_ok=True)
    if dest.is_file() and dest.stat().st_size > 0:
        return dest
    print(f"[fetch] {url}")
    req = urllib.request.Request(url, headers={"User-Agent": "CorzClient-Android-CI/1.0"})
    with urllib.request.urlopen(req, timeout=60) as resp, open(dest, "wb") as out:
        shutil.copyfileobj(resp, out)
    return dest


def fetch_json(url: str) -> dict:
    req = urllib.request.Request(url, headers={"User-Agent": "CorzClient-Android-CI/1.0"})
    with urllib.request.urlopen(req, timeout=60) as resp:
        return json.loads(resp.read().decode("utf-8"))


def resolve_latest_fabric_api_version() -> str:
    if FABRIC_API_VERSION:
        return FABRIC_API_VERSION
    url = "https://maven.fabricmc.net/net/fabricmc/fabric-api/fabric-api/maven-metadata.xml"
    req = urllib.request.Request(url, headers={"User-Agent": "CorzClient-Android-CI/1.0"})
    with urllib.request.urlopen(req, timeout=60) as resp:
        xml_bytes = resp.read()
    root = ET.fromstring(xml_bytes)
    versions = [el.text for el in root.findall("./versioning/versions/version") if el.text]
    suffix = f"+{MC_VERSION}"
    matching = [v for v in versions if v.endswith(suffix)]
    if not matching:
        raise RuntimeError(f"No fabric-api version found for {MC_VERSION}")
    return matching[-1]


def resolve_maven_version(metadata_url: str, fallback: str, preferred_prefix: str = "") -> str:
    try:
        req = urllib.request.Request(metadata_url, headers={"User-Agent": "CorzClient-Android-CI/1.0"})
        with urllib.request.urlopen(req, timeout=30) as resp:
            xml_bytes = resp.read()
        root = ET.fromstring(xml_bytes)
        versions = [el.text for el in root.findall("./versioning/versions/version") if el.text]
        if preferred_prefix:
            pref = [v for v in versions if v.startswith(preferred_prefix)]
            if pref:
                return pref[-1]
        release = root.findtext("./versioning/release") or root.findtext("./versioning/latest")
        if release:
            return release
        if versions:
            return versions[-1]
    except Exception as exc:
        print(f"[warn] Could not resolve {metadata_url} ({exc}); using fallback {fallback}")
    return fallback


def extract_jij_jars(fat_jar: Path, target_dir: Path) -> list[Path]:
    extracted = []
    target_dir.mkdir(parents=True, exist_ok=True)
    with zipfile.ZipFile(fat_jar, "r") as zf:
        for member in zf.namelist():
            if member.startswith("META-INF/jars/") and member.endswith(".jar"):
                out = target_dir / Path(member).name
                with zf.open(member) as src, open(out, "wb") as dst:
                    shutil.copyfileobj(src, dst)
                extracted.append(out)
    return extracted


def extract_intermediary_tiny(intermediary_jar: Path, out_tiny: Path) -> Path:
    with zipfile.ZipFile(intermediary_jar, "r") as zf:
        for candidate in ("mappings/mappings.tiny",):
            if candidate in zf.namelist():
                with zf.open(candidate) as src, open(out_tiny, "wb") as dst:
                    shutil.copyfileobj(src, dst)
                return out_tiny
    raise RuntimeError(f"mappings/mappings.tiny not found inside {intermediary_jar}")


def main():
    DEPS_DIR.mkdir(parents=True, exist_ok=True)
    libs_dir = DEPS_DIR / "libs"
    libs_dir.mkdir(parents=True, exist_ok=True)
    classpath_jars: list[Path] = []

    # 1. Resolve Minecraft version manifest from Mojang Piston-Meta
    manifest = fetch_json("https://piston-meta.mojang.com/mc/game/version_manifest_v2.json")
    ver_entry = next((v for v in manifest["versions"] if v["id"] == MC_VERSION), None)
    if ver_entry is None:
        raise RuntimeError(f"Minecraft version {MC_VERSION} not found in Mojang manifest")
    ver_json = fetch_json(ver_entry["url"])

    client_url = ver_json["downloads"]["client"]["url"]
    official_client = download(client_url, DEPS_DIR / f"minecraft-{MC_VERSION}-official.jar")

    for lib in ver_json["libraries"]:
        rules = lib.get("rules")
        if rules:
            allowed = False
            for r in rules:
                os_rule = r.get("os", {})
                if r["action"] == "allow" and (not os_rule or os_rule.get("name") == "linux"):
                    allowed = True
                elif r["action"] == "disallow" and (not os_rule or os_rule.get("name") == "linux"):
                    allowed = False
            if not allowed:
                continue
        artifact = lib.get("downloads", {}).get("artifact")
        if artifact and artifact.get("url"):
            # Skip platform-native-only classifier jars for compile classpath
            name = Path(artifact["path"]).name
            if "natives-" in name:
                continue
            jar = download(artifact["url"], libs_dir / name)
            classpath_jars.append(jar)

    # 2. Fetch ASM + Tiny-Remapper + Mapping-IO (resolving live metadata with fallbacks)
    asm_ver = resolve_maven_version("https://repo1.maven.org/maven2/org/ow2/asm/asm/maven-metadata.xml", ASM_VERSION, "9.7")
    tiny_ver = resolve_maven_version("https://maven.fabricmc.net/net/fabricmc/tiny-remapper/maven-metadata.xml", TINY_REMAPPER_VERSION)
    mapping_io_ver = resolve_maven_version("https://maven.fabricmc.net/net/fabricmc/mapping-io/maven-metadata.xml", MAPPING_IO_VERSION)

    asm_core_jars = [
        download(f"https://repo1.maven.org/maven2/org/ow2/asm/asm/{asm_ver}/asm-{asm_ver}.jar", DEPS_DIR / f"asm-{asm_ver}.jar"),
        download(f"https://repo1.maven.org/maven2/org/ow2/asm/asm-commons/{asm_ver}/asm-commons-{asm_ver}.jar", DEPS_DIR / f"asm-commons-{asm_ver}.jar"),
        download(f"https://repo1.maven.org/maven2/org/ow2/asm/asm-tree/{asm_ver}/asm-tree-{asm_ver}.jar", DEPS_DIR / f"asm-tree-{asm_ver}.jar"),
    ]
    remap_extra_jars = [
        download(f"https://repo1.maven.org/maven2/org/ow2/asm/asm-analysis/{asm_ver}/asm-analysis-{asm_ver}.jar", DEPS_DIR / f"asm-analysis-{asm_ver}.jar"),
        download(f"https://repo1.maven.org/maven2/org/ow2/asm/asm-util/{asm_ver}/asm-util-{asm_ver}.jar", DEPS_DIR / f"asm-util-{asm_ver}.jar"),
        download(f"https://maven.fabricmc.net/net/fabricmc/tiny-remapper/{tiny_ver}/tiny-remapper-{tiny_ver}.jar", DEPS_DIR / f"tiny-remapper-{tiny_ver}.jar"),
        download(f"https://maven.fabricmc.net/net/fabricmc/mapping-io/{mapping_io_ver}/mapping-io-{mapping_io_ver}.jar", DEPS_DIR / f"mapping-io-{mapping_io_ver}.jar"),
    ]
    ASM_CP_FILE.write_text(":".join(str(p.resolve()) for p in asm_core_jars))

    # 3. Fetch Fabric Intermediary mappings and remap Minecraft official -> intermediary
    intermediary_jar = download(
        f"https://maven.fabricmc.net/net/fabricmc/intermediary/{MC_VERSION}/intermediary-{MC_VERSION}-v2.jar",
        DEPS_DIR / f"intermediary-{MC_VERSION}-v2.jar",
    )
    intermediary_tiny = extract_intermediary_tiny(intermediary_jar, DEPS_DIR / f"intermediary-{MC_VERSION}.tiny")
    intermediary_mc = DEPS_DIR / f"minecraft-{MC_VERSION}-intermediary.jar"

    if not intermediary_mc.is_file():
        remap_cp = ":".join(str(p.resolve()) for p in (asm_core_jars + remap_extra_jars))
        cmd = [
            "java", "-cp", remap_cp,
            "net.fabricmc.tinyremapper.Main",
            str(official_client), str(intermediary_mc),
            str(intermediary_tiny), "official", "intermediary",
            "--ignoreConflicts",
        ] + [str(j) for j in classpath_jars]
        print("[remap] Remapping Minecraft client official -> intermediary...")
        subprocess.run(cmd, check=True)

    classpath_jars.insert(0, intermediary_mc)

    # 4. Fetch Fabric Loader + Mixin + MixinExtras + Fabric API (and JiJ modules)
    loader_ver = resolve_maven_version("https://maven.fabricmc.net/net/fabricmc/fabric-loader/maven-metadata.xml", FABRIC_LOADER_VERSION, "0.1")
    mixin_ver = resolve_maven_version("https://maven.fabricmc.net/net/fabricmc/sponge-mixin/maven-metadata.xml", MIXIN_VERSION)
    mixin_extras_ver = resolve_maven_version("https://maven.fabricmc.net/io/github/llamalad7/mixinextras-fabric/maven-metadata.xml", MIXIN_EXTRAS_VERSION)

    fabric_loader_jar = download(
        f"https://maven.fabricmc.net/net/fabricmc/fabric-loader/{loader_ver}/fabric-loader-{loader_ver}.jar",
        libs_dir / f"fabric-loader-{loader_ver}.jar",
    )
    sponge_mixin_jar = download(
        f"https://maven.fabricmc.net/net/fabricmc/sponge-mixin/{mixin_ver}/sponge-mixin-{mixin_ver}.jar",
        libs_dir / f"sponge-mixin-{mixin_ver}.jar",
    )
    mixin_extras_jar = download(
        f"https://maven.fabricmc.net/io/github/llamalad7/mixinextras-fabric/{mixin_extras_ver}/mixinextras-fabric-{mixin_extras_ver}.jar",
        libs_dir / f"mixinextras-fabric-{mixin_extras_ver}.jar",
    )
    fapi_ver = resolve_latest_fabric_api_version()
    fapi_jar = download(
        f"https://maven.fabricmc.net/net/fabricmc/fabric-api/fabric-api/{fapi_ver}/fabric-api-{fapi_ver}.jar",
        libs_dir / f"fabric-api-{fapi_ver}.jar",
    )
    fapi_modules = extract_jij_jars(fapi_jar, DEPS_DIR / "fapi-modules")

    classpath_jars.extend([fabric_loader_jar, sponge_mixin_jar, mixin_extras_jar, fapi_jar])
    classpath_jars.extend(fapi_modules)
    classpath_jars.extend(asm_core_jars)

    # Deduplicate preserving order
    seen = set()
    final_cp = []
    for p in classpath_jars:
        rp = str(p.resolve())
        if rp not in seen:
            seen.add(rp)
            final_cp.append(rp)

    CP_FILE.write_text(":".join(final_cp))
    print(f"Compile classpath prepared ({len(final_cp)} jars) -> {CP_FILE}")


if __name__ == "__main__":
    main()
