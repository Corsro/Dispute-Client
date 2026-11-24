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
  assert.equal(categorizeModule('AutoBuilder'), 'Automation & Movement');
  assert.equal(categorizeModule('MotionBlur'), 'Visuals, Knives & Audio');
  assert.equal(categorizeModule('ChunkFinderV2'), 'World & ESP');
});

test('loadPortSummary reads workspace module catalog, 5 added clean bots, and 75 shaders', () => {
  const summary = loadPortSummary(path.resolve('.'));
  assert.equal(summary.modMeta.id, 'corzclient');
  assert.equal(summary.shaderCount, 75);
  assert.equal(summary.addedBotCount, 5);
  assert.ok(summary.totalClassMappings >= 600);
  for (const name of [
    'CrystalPvpBot',
    'VillagerTradeBot',
    'SmpPvpBot',
    'UhcPvpBot',
    'MaceSpearBot',
    'TreeFarmerBot',
    'AutoOreMinerBot',
  ]) {
    assert.ok(summary.modules.some((m) => m.name === name), `Missing ${name}`);
  }
});
