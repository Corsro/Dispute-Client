import test from 'node:test';
import assert from 'node:assert/strict';
import path from 'node:path';
import { categorizeModule, loadPortSummary, parseModuleProperties } from './port_catalog.mjs';

test('parseModuleProperties parses obfuscated to logical mappings', () => {
  const parsed = parseModuleProperties(`
    # comment
    gg.corz.iIiIliiIliIlii=CrystalPvpBot
    gg.corz.lliliiiililiii=SwordPvpBot
    gg.corz.llIiIlilIiIl=VillagerTradeBot
    gg.corz.iIlIilIlIllIilIl=AutoBuilder$1
  `);
  assert.equal(parsed.length, 4);
  assert.equal(parsed[0].topLevel, 'CrystalPvpBot');
  assert.equal(parsed[3].topLevel, 'AutoBuilder');
});

test('categorizeModule groups bots, visuals, and automation cleanly', () => {
  assert.equal(categorizeModule('CrystalPvpBot'), 'Combat & Bots');
  assert.equal(categorizeModule('MaceBomber'), 'Combat & Bots');
  assert.equal(categorizeModule('AutoBuilder'), 'Automation & Movement');
  assert.equal(categorizeModule('TreeFarmer'), 'Automation & Movement');
  assert.equal(categorizeModule('AutoAreaMiner'), 'Automation & Movement');
  assert.equal(categorizeModule('MotionBlur'), 'Visuals, Knives & Audio');
  assert.equal(categorizeModule('ChunkFinderV2'), 'World & ESP');
});

test('loadPortSummary reads Dispute Client 2.0.3 module catalog, 10 autonomous bots, and 78 shaders', () => {
  const summary = loadPortSummary(path.resolve('.'));
  assert.equal(summary.modMeta.id, 'corzclient');
  assert.equal(summary.modMeta.version, '2.0.3');
  assert.equal(summary.modMeta.name, 'Dispute Client');
  assert.ok(summary.modMeta.provides?.includes('disputeclient'));
  assert.equal(summary.shaderCount, 78);
  assert.equal(summary.botCount, 10);
  assert.equal(summary.jarArtifact.exists, true);
  assert.equal(summary.jarArtifact.filename, 'DisputeClient-2.0.3-Android-Mojo.jar');
  assert.ok(summary.jarArtifact.sizeBytes > 30_000_000);
  assert.ok(summary.totalClassMappings >= 800);
  for (const name of [
    'CrystalPvpBot',
    'SwordPvpBot',
    'SmpPvpBot',
    'UhcPvpBot',
    'MacePvpBot',
    'MaceBomber',
    'TreeFarmer',
    'AutoAreaMiner',
    'VillagerTradeBot',
    'AutoBuilder',
  ]) {
    assert.ok(summary.modules.some((m) => m.name === name), `Missing ${name}`);
  }
});
