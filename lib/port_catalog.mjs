import fs from 'node:fs';
import path from 'node:path';

export function parseModuleProperties(rawText) {
  const entries = [];
  for (const rawLine of rawText.split(/\r?\n/)) {
    const line = rawLine.trim();
    if (!line || line.startsWith('#')) continue;
    const eq = line.indexOf('=');
    if (eq <= 0) continue;
    const obfClass = line.slice(0, eq).trim();
    const logicalName = line.slice(eq + 1).trim();
    const topLevel = logicalName.split('$')[0];
    entries.push({ obfClass, logicalName, topLevel });
  }
  return entries;
}

export function categorizeModule(topLevel) {
  if (/Bot$|Aura$|Macro$|Aim$|Trigger|Reach|BackTrack|Tap|Criticals|Break|Breaker|Totem|Bomb|Bomber|Trap|Velocity|Optimizer|HitSelect|HitSwap/i.test(topLevel)) {
    return 'Combat & Bots';
  }
  if (/Finder|Xray|ESP|Scanner|Bloodhound|Sensor|Watch|Tags|Protect|Radar|Locator|Roster|AntiVanish/i.test(topLevel)) {
    return 'World & ESP';
  }
  if (/Builder|Pilot|Pather|Driver|Elytra|Sell|Buy|Flipper|Trade|Relog|Stash|Mine|Miner|Farm|Farmer|Scaffold|Walk|Hop|Tpa|Home|Flight|Speed|Surface|Landing|Approach|Flee|Glide/i.test(topLevel)) {
    return 'Automation & Movement';
  }
  if (/Knife|C2|Hud|HUD|Blur|Sky|World|Shader|Trail|Circle|Flame|Water|Creamy|Radio|Spotify|Capes|Keys|Viewmodel|Sword|Crosshair|FireFly|Particle|Fullbright|Weather|Time|Hand|Sound|Arrival/i.test(topLevel)) {
    return 'Visuals, Knives & Audio';
  }
  return 'Core & Utilities';
}

const AUTONOMOUS_BOT_NAMES = new Set([
  'AutoAreaMiner',
  'AutoBuilder',
  'CrystalPvpBot',
  'MaceBomber',
  'MacePvpBot',
  'SmpPvpBot',
  'SwordPvpBot',
  'TreeFarmer',
  'VillagerTradeBot',
  'UhcPvpBot',
]);

export function resolveModJarArtifact(rootDir) {
  const filename = 'DisputeClient-2.0.3-Android-Mojo.jar';
  const candidates = [
    path.join(rootDir, 'build', 'dist', filename),
    path.join(rootDir, 'public', 'downloads', filename),
  ];
  for (const candidate of candidates) {
    if (fs.existsSync(candidate)) {
      const stat = fs.statSync(candidate);
      if (stat.isFile() && stat.size > 0) {
        return {
          exists: true,
          filename,
          filePath: candidate,
          sizeBytes: stat.size,
          sizeMB: (stat.size / (1024 * 1024)).toFixed(2),
        };
      }
    }
  }
  return {
    exists: false,
    filename,
    filePath: null,
    sizeBytes: 0,
    sizeMB: '0.00',
  };
}

export function loadPortSummary(rootDir) {
  const propsPath = path.join(rootDir, 'source', 'META-INF', 'corz-module-ids.properties');
  const modJsonPath = path.join(rootDir, 'source', 'fabric.mod.json');
  const shadersDir = path.join(rootDir, 'source', 'assets', 'corzclient', 'shaders');

  const modMeta = fs.existsSync(modJsonPath)
    ? JSON.parse(fs.readFileSync(modJsonPath, 'utf8'))
    : { id: 'corzclient', version: '2.0.3', name: 'Dispute Client' };

  const rawProps = fs.existsSync(propsPath) ? fs.readFileSync(propsPath, 'utf8') : '';
  const allEntries = parseModuleProperties(rawProps);

  const uniqueTopLevel = [];
  const seen = new Set();
  for (const item of allEntries) {
    if (!seen.has(item.topLevel)) {
      seen.add(item.topLevel);
      uniqueTopLevel.push({
        name: item.topLevel,
        obfClass: item.obfClass,
        category: categorizeModule(item.topLevel),
      });
    }
  }

  uniqueTopLevel.sort((a, b) => a.name.localeCompare(b.name));

  const botCount = uniqueTopLevel.filter((m) => AUTONOMOUS_BOT_NAMES.has(m.name)).length;

  let shaderCount = 0;
  if (fs.existsSync(shadersDir)) {
    const walk = (dir) => {
      for (const entry of fs.readdirSync(dir, { withFileTypes: true })) {
        const full = path.join(dir, entry.name);
        if (entry.isDirectory()) walk(full);
        else if (/\.(fsh|vsh|glsl)$/i.test(entry.name)) shaderCount++;
      }
    };
    walk(shadersDir);
  }

  return {
    modMeta,
    totalClassMappings: allEntries.length,
    uniqueModuleCount: uniqueTopLevel.length,
    botCount,
    shaderCount,
    jarArtifact: resolveModJarArtifact(rootDir),
    modules: uniqueTopLevel,
  };
}
