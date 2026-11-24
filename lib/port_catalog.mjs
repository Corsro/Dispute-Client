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
  if (/Bot$|Aura$|Macro$|Aim$|Trigger|Reach|BackTrack|Tap|Criticals|Break|Breaker|Totem|Bomb|Trap|Velocity|Optimizer|HitSelect|HitSwap/i.test(topLevel)) {
    return 'Combat & Bots';
  }
  if (/Finder|Xray|ESP|Scanner|Bloodhound|Sensor|Watch|Tags|Protect|Radar|Locator|Roster|AntiVanish/i.test(topLevel)) {
    return 'World & ESP';
  }
  if (/Builder|Pilot|Pather|Driver|Elytra|Sell|Buy|Flipper|Trade|Relog|Stash|Mine|Scaffold|Walk|Hop|Tpa|Home|Flight|Speed|Surface|Landing|Approach|Flee|Glide/i.test(topLevel)) {
    return 'Automation & Movement';
  }
  if (/Knife|C2|Hud|HUD|Blur|Sky|World|Shader|Trail|Circle|Flame|Water|Creamy|Radio|Spotify|Capes|Keys|Viewmodel|Sword|Crosshair|FireFly|Particle|Fullbright|Weather|Time|Hand|Sound|Arrival/i.test(topLevel)) {
    return 'Visuals, Knives & Audio';
  }
  return 'Core & Utilities';
}

export function loadPortSummary(rootDir) {
  const propsPath = path.join(rootDir, 'source', 'META-INF', 'corz-module-ids.properties');
  const modJsonPath = path.join(rootDir, 'source', 'fabric.mod.json');
  const shadersDir = path.join(rootDir, 'source', 'assets', 'corzclient', 'shaders');

  const modMeta = fs.existsSync(modJsonPath)
    ? JSON.parse(fs.readFileSync(modJsonPath, 'utf8'))
    : { id: 'corzclient', version: '2.0.1', name: 'CorzClient' };

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
    shaderCount,
    modules: uniqueTopLevel,
  };
}
