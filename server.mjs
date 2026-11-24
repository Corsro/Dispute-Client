import fs from 'node:fs';
import http from 'node:http';
import path from 'node:path';
import { fileURLToPath } from 'node:url';
import { loadPortSummary, resolveModJarArtifact } from './lib/port_catalog.mjs';

const __dirname = path.dirname(fileURLToPath(import.meta.url));
const PORT = Number(process.env.PORT || 3000);
const summary = loadPortSummary(__dirname);

function escapeHtml(str) {
  return String(str)
    .replace(/&/g, '&amp;')
    .replace(/</g, '&lt;')
    .replace(/>/g, '&gt;')
    .replace(/"/g, '&quot;');
}

function renderHtml(data) {
  const categories = ['All', 'Combat & Bots', 'Automation & Movement', 'World & ESP', 'Visuals, Knives & Audio', 'Core & Utilities'];
  const moduleRows = data.modules
    .map(
      (m) => `
      <tr data-name="${escapeHtml(m.name.toLowerCase())}" data-obf="${escapeHtml(m.obfClass.toLowerCase())}" data-cat="${escapeHtml(m.category)}">
        <td class="mod-name">${escapeHtml(m.name)}</td>
        <td class="mod-cat">${escapeHtml(m.category)}</td>
        <td class="mod-obf"><code>${escapeHtml(m.obfClass)}</code></td>
      </tr>`
    )
    .join('\n');

  return `<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>${escapeHtml(data.modMeta.name || 'Dispute Client')} ${escapeHtml(data.modMeta.version)} — Android ARM64 / Mojo Port</title>
  <style>
    :root {
      color-scheme: dark;
      --bg: #0c0f14;
      --surface: #141923;
      --border: #252e3f;
      --text: #eef2f8;
      --muted: #9aa7bd;
      --accent: #38bdf8;
      --accent-soft: rgba(56, 189, 248, 0.12);
    }
    * { box-sizing: border-box; }
    body {
      margin: 0;
      font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Inter, Roboto, sans-serif;
      background: var(--bg);
      color: var(--text);
      line-height: 1.5;
    }
    main {
      max-width: 1080px;
      margin: 0 auto;
      padding: 32px 20px 64px;
    }
    header {
      border-bottom: 1px solid var(--border);
      padding-bottom: 24px;
      margin-bottom: 28px;
    }
    h1 {
      margin: 0 0 8px;
      font-size: clamp(1.6rem, 3vw, 2.2rem);
      letter-spacing: -0.02em;
    }
    .subtitle {
      margin: 0;
      color: var(--muted);
      max-width: 72ch;
    }
    .download-bar {
      display: flex;
      flex-wrap: wrap;
      align-items: center;
      gap: 14px;
      margin-top: 20px;
    }
    .download-btn {
      display: inline-flex;
      align-items: center;
      justify-content: center;
      gap: 8px;
      min-height: 44px;
      padding: 11px 20px;
      border-radius: 9px;
      background: var(--accent);
      color: #06131f;
      font-weight: 700;
      font-size: 0.96rem;
      text-decoration: none;
      transition: filter 0.15s ease, transform 0.1s ease;
    }
    .download-btn:hover { filter: brightness(1.08); }
    .download-btn:focus-visible { outline: 2px solid #ffffff; outline-offset: 2px; }
    .download-meta {
      font-size: 0.875rem;
      color: var(--muted);
    }
    .metrics {
      display: grid;
      grid-template-columns: repeat(auto-fit, minmax(180px, 1fr));
      gap: 12px;
      margin: 24px 0 32px;
    }
    .metric {
      background: var(--surface);
      border: 1px solid var(--border);
      border-radius: 10px;
      padding: 16px;
    }
    .metric-val {
      font-size: 1.5rem;
      font-weight: 700;
      color: var(--accent);
    }
    .metric-label {
      font-size: 0.875rem;
      color: var(--muted);
      margin-top: 2px;
    }
    section {
      margin-bottom: 36px;
    }
    h2 {
      font-size: 1.15rem;
      margin: 0 0 12px;
    }
    .arch-grid {
      display: grid;
      grid-template-columns: repeat(auto-fit, minmax(340px, 1fr));
      gap: 14px;
    }
    .card {
      background: var(--surface);
      border: 1px solid var(--border);
      border-radius: 10px;
      padding: 16px 18px;
    }
    .card h3 {
      margin: 0 0 6px;
      font-size: 0.98rem;
    }
    .card p {
      margin: 0;
      font-size: 0.9rem;
      color: var(--muted);
    }
    .controls {
      display: flex;
      flex-wrap: wrap;
      gap: 10px;
      margin-bottom: 14px;
      align-items: center;
    }
    input[type="search"], select {
      background: var(--surface);
      color: var(--text);
      border: 1px solid var(--border);
      border-radius: 8px;
      padding: 10px 12px;
      font-size: 0.95rem;
    }
    input[type="search"] {
      flex: 1 1 240px;
    }
    .count-note {
      font-size: 0.875rem;
      color: var(--muted);
      margin-left: auto;
    }
    .table-wrap {
      background: var(--surface);
      border: 1px solid var(--border);
      border-radius: 10px;
      overflow-x: auto;
    }
    table {
      width: 100%;
      border-collapse: collapse;
      text-align: left;
      font-size: 0.9rem;
    }
    th, td {
      padding: 10px 14px;
      border-bottom: 1px solid var(--border);
    }
    th {
      color: var(--muted);
      font-weight: 600;
      font-size: 0.8rem;
      text-transform: uppercase;
      letter-spacing: 0.04em;
    }
    tbody tr:last-child td { border-bottom: 0; }
    tbody tr:hover { background: var(--accent-soft); }
    code {
      font-family: ui-monospace, SFMono-Regular, Menlo, Consolas, monospace;
      font-size: 0.84rem;
      color: var(--muted);
    }
    .steps {
      background: var(--surface);
      border: 1px solid var(--border);
      border-radius: 10px;
      padding: 16px 20px;
      margin: 0;
    }
    .steps li {
      margin: 6px 0;
      color: var(--muted);
    }
    .steps strong { color: var(--text); }
    .sr-only {
      position: absolute;
      width: 1px;
      height: 1px;
      padding: 0;
      margin: -1px;
      overflow: hidden;
      clip: rect(0, 0, 0, 0);
      white-space: nowrap;
      border: 0;
    }
    @media (max-width: 640px) {
      .count-note { margin-left: 0; width: 100%; }
      .mod-obf { display: none; }
    }
  </style>
</head>
<body>
  <main>
    <header>
      <h1>${escapeHtml(data.modMeta.name || 'Dispute Client')} ${escapeHtml(data.modMeta.version)} — Android ARM64 &amp; Mojo Launcher Port</h1>
      <p class="subtitle">
        Pure-Java Android ARM64 / Mojo Launcher port of Dispute Client v2.0.3 — zero native <code>vm.dll</code> / QVM binaries,
        all <code>gg.corz.*</code> modules and autonomous AI bots lowered to pure Java, plus 78 Adreno-safe GLSL shaders for Minecraft 1.21.11 (Fabric).
      </p>
      <div class="download-bar">
        ${data.jarArtifact.exists
          ? `<a class="download-btn" href="/download/${escapeHtml(data.jarArtifact.filename)}" download="${escapeHtml(data.jarArtifact.filename)}">Download ${escapeHtml(data.jarArtifact.filename)} (${escapeHtml(data.jarArtifact.sizeMB)} MB)</a>
             <span class="download-meta">MC 1.21.11 Fabric &bull; Java 21 &bull; Android ARM64 / Mojo Ready</span>`
          : `<span class="download-meta">JAR artifact not found on disk.</span>`}
      </div>
      <div class="metrics">
        <div class="metric">
          <div class="metric-val">${data.uniqueModuleCount}</div>
          <div class="metric-label">Total Modules &amp; Bots</div>
        </div>
        <div class="metric">
          <div class="metric-val">${data.botCount}</div>
          <div class="metric-label">Autonomous AI Bots</div>
        </div>
        <div class="metric">
          <div class="metric-val">${data.shaderCount}</div>
          <div class="metric-label">Audited GLSL 330/ES Shaders</div>
        </div>
        <div class="metric">
          <div class="metric-val">Pure Java</div>
          <div class="metric-label">Zero Native QVM / Zero Malware</div>
        </div>
      </div>
    </header>

    <section aria-labelledby="arch-heading">
      <h2 id="arch-heading">Key Android &amp; Mojo Launcher Engineering</h2>
      <div class="arch-grid">
        <article class="card">
          <h3>Zero-Native Pure-Java QVM Lowering</h3>
          <p><code>CorzBytecodePatcher</code> lowers all 15 QVM classes (191 methods) directly to pure Java with <code>Runtime.java</code> no-op stubs — zero <code>vm.dll</code>, zero <code>libvm.so</code>, zero glibc <code>dlopen</code> failures.</p>
        </article>
        <article class="card">
          <h3>1-Tap Pause Menu GUI + Touch Bridge</h3>
          <p><code>MixinGameMenuScreenDispute</code> adds a top-right <strong>§eDispute GUI</strong> button to the Pause Screen, paired with <code>MojoInputBridge</code> (75 ms touch latching) and headless <code>CompatFileDialog</code>.</p>
        </article>
        <article class="card">
          <h3>Full 2.0.3 AI Bots + Offline Compute</h3>
          <p>Includes <strong>CrystalPvpBot</strong>, <strong>SwordPvpBot</strong>, <strong>SmpPvpBot</strong>, <strong>UhcPvpBot</strong>, <strong>MacePvpBot</strong>, <strong>MaceBomber</strong>, <strong>TreeFarmer</strong>, <strong>AutoAreaMiner</strong>, <strong>VillagerTradeBot</strong>, &amp; <strong>AutoBuilder</strong> with <code>net/fabric/*</code> malware completely stripped.</p>
        </article>
        <article class="card">
          <h3>Adreno 619 / LTW Shader Safety (78 Files)</h3>
          <p>All ${data.shaderCount} shaders (including 2.0.3 <code>corz_msdf_world.fsh</code> &amp; <code>crazy_armor_material.*</code>) normalized to <code>#version 330</code> with clamped <code>texelFetch</code> and guarded <code>fwidth</code>/<code>inversesqrt</code>/<code>pow</code>.</p>
        </article>
      </div>
    </section>

    <section aria-labelledby="build-heading">
      <h2 id="build-heading">Build &amp; Mojo Launcher Install</h2>
      <ol class="steps">
        <li>Local build output: <code>build/dist/DisputeClient-2.0.3-Android-Mojo.jar</code> (verified via ASM 9.7 <code>CheckClassAdapter</code> &amp; shader auditor).</li>
        <li>GitHub Actions workflow: <strong>Actions &rarr; Build Dispute Client Android (Mojo ARM64) Port</strong> builds <code>DisputeClient-2.0.3-Android-Mojo.jar</code>.</li>
        <li>Copy <code>DisputeClient-2.0.3-Android-Mojo.jar</code> into Mojo Launcher's <code>mods/</code> folder for Minecraft 1.21.11 (Fabric Loader &gt;= 0.16.0) and tap <strong>Pause &rarr; §eDispute GUI</strong>.</li>
      </ol>
    </section>

    <section aria-labelledby="catalog-heading">
      <h2 id="catalog-heading">Preserved Module &amp; AI Bot Catalog</h2>
      <div class="controls">
        <label for="search" class="sr-only">Filter modules</label>
        <input id="search" type="search" placeholder="Search bots or modules (e.g. CrystalPvpBot, AutoBuilder, VillagerTradeBot)..." />
        <label for="category" class="sr-only">Category</label>
        <select id="category">
          ${categories.map((c) => `<option value="${escapeHtml(c)}">${escapeHtml(c)}</option>`).join('')}
        </select>
        <span id="visible-count" class="count-note">${data.uniqueModuleCount} modules</span>
      </div>
      <div class="table-wrap">
        <table>
          <thead>
            <tr>
              <th scope="col">Module / Component</th>
              <th scope="col">Category</th>
              <th scope="col" class="mod-obf">Bytecode Class</th>
            </tr>
          </thead>
          <tbody id="module-tbody">
            ${moduleRows}
          </tbody>
        </table>
      </div>
    </section>
  </main>
  <script>
    const searchInput = document.getElementById('search');
    const categorySelect = document.getElementById('category');
    const rows = Array.from(document.querySelectorAll('#module-tbody tr'));
    const countEl = document.getElementById('visible-count');

    function applyFilter() {
      const q = searchInput.value.trim().toLowerCase();
      const cat = categorySelect.value;
      let shown = 0;
      for (const row of rows) {
        const matchQ = !q || row.dataset.name.includes(q) || row.dataset.obf.includes(q);
        const matchCat = cat === 'All' || row.dataset.cat === cat;
        const visible = matchQ && matchCat;
        row.style.display = visible ? '' : 'none';
        if (visible) shown++;
      }
      countEl.textContent = shown + (shown === 1 ? ' module' : ' modules');
    }

    searchInput.addEventListener('input', applyFilter);
    categorySelect.addEventListener('change', applyFilter);
  </script>
</body>
</html>`;
}

const htmlPayload = renderHtml(summary);

const server = http.createServer((req, res) => {
  const reqPath = (req.url || '/').split('?')[0];
  if (reqPath === '/health') {
    const artifact = resolveModJarArtifact(__dirname);
    res.writeHead(200, { 'Content-Type': 'application/json' });
    res.end(JSON.stringify({ ok: true, modules: summary.uniqueModuleCount, shaders: summary.shaderCount, jarAvailable: artifact.exists, jarSizeBytes: artifact.sizeBytes }));
    return;
  }
  if (reqPath === '/download' || reqPath === '/download/DisputeClient-2.0.3-Android-Mojo.jar') {
    const artifact = resolveModJarArtifact(__dirname);
    if (!artifact.exists || !artifact.filePath) {
      res.writeHead(404, { 'Content-Type': 'text/plain; charset=utf-8' });
      res.end('DisputeClient-2.0.3-Android-Mojo.jar not found on server.');
      return;
    }
    res.writeHead(200, {
      'Content-Type': 'application/java-archive',
      'Content-Length': String(artifact.sizeBytes),
      'Content-Disposition': `attachment; filename="${artifact.filename}"`,
      'X-Content-Type-Options': 'nosniff',
      'Cache-Control': 'no-cache',
    });
    if (req.method === 'HEAD') {
      res.end();
      return;
    }
    const stream = fs.createReadStream(artifact.filePath);
    stream.on('error', () => {
      if (!res.headersSent) res.writeHead(500);
      res.end();
    });
    stream.pipe(res);
    return;
  }
  res.writeHead(200, { 'Content-Type': 'text/html; charset=utf-8' });
  res.end(htmlPayload);
});

server.listen(PORT, '0.0.0.0', () => {
  console.log(`Dispute Client Android Port overview & download server listening on http://0.0.0.0:${PORT}`);
});
