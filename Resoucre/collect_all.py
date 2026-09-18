#!/usr/bin/env python3
"""Collect every active Defects4J bug's modified Java sources, with resume."""
import concurrent.futures
import hashlib
import json
import os
import re
from pathlib import Path
import shutil
import subprocess
import tempfile

ROOT = Path(__file__).resolve().parent
META = ROOT / '_collection'
META.mkdir(exist_ok=True)
JAVA = os.environ.get('JAVA11_HOME', '/Users/bb/.sdkman/candidates/java/11.0.31-amzn')
D4J = os.environ.get('DEFECTS4J_BIN', shutil.which('defects4j') or 'defects4j')
ENV = dict(os.environ, JAVA_HOME=JAVA, PATH=JAVA + '/bin:' + os.environ['PATH'])


def command(args, log=None):
    result = subprocess.run([D4J] + args, env=ENV, text=True, stdout=subprocess.PIPE,
                            stderr=subprocess.PIPE, timeout=600)
    if log:
        log.write(result.stderr)
    if result.returncode:
        raise RuntimeError(' '.join(args[:4]) + ': ' + result.stderr[-2000:])
    return result.stdout.strip()


def sha(path):
    return hashlib.sha256(path.read_bytes()).hexdigest()


def collect(task):
    pid, bid = task
    name = pid + '_' + bid
    manifest = META / (name + '.json')
    try:
        if manifest.exists():
            record = json.loads(manifest.read_text())
            if record['status'] == 'ok' and all((ROOT / f['path']).is_file() and
                    sha(ROOT / f['path']) == f['sha256'] for f in record['files']):
                return record
        with (META / (name + '.log')).open('w') as log:
            with tempfile.TemporaryDirectory(prefix='.checkout-', dir=ROOT) as temp:
                work = Path(temp) / 'work'
                command(['checkout', '-p', pid, '-v', bid + 'b', '-w', str(work)], log)
                classes = command(['export', '-w', str(work), '-p', 'classes.modified'], log).splitlines()
                src = command(['export', '-w', str(work), '-p', 'dir.src.classes'], log)
                files = []
                absent = []
                patch = Path(D4J).resolve().parents[1] / 'projects' / pid / 'patches' / (bid + '.src.patch')
                patch_text = patch.read_text()
                patch_paths = [line.split()[1][2:] for line in patch_text.splitlines()
                               if line.startswith('--- a/')]
                for cls in sorted(set(classes)):
                    relative = Path(cls.replace('.', '/') + '.java')
                    source = work / src / relative
                    if not source.is_file() and '$' in cls and not cls.rsplit('.', 1)[-1].startswith('$'):
                        relative = Path(cls.split('$')[0].replace('.', '/') + '.java')
                        source = work / src / relative
                    target = ROOT / name / relative
                    if not source.is_file():
                        candidates = [p for p in patch_paths if p == str(Path(src) / relative)
                                      or p.replace('/', '.') == cls]
                        if not candidates:
                            raise FileNotFoundError(source)
                        source = work / candidates[0]
                        if not source.is_file():
                            absent.append({'class': cls, 'path': candidates[0],
                                           'reason': 'File absent in buggy checkout; referenced by fix patch'})
                            continue
                        relative = Path(candidates[0])
                        target = ROOT / name / relative
                    checksum = sha(source)
                    if target.exists() and sha(target) != checksum:
                        backup = META / 'previous' / name / relative
                        backup.parent.mkdir(parents=True, exist_ok=True)
                        shutil.copy2(target, backup)
                    target.parent.mkdir(parents=True, exist_ok=True)
                    shutil.copy2(source, target)
                    assert sha(target) == checksum
                    files.append({'class': cls, 'path': str(target.relative_to(ROOT)), 'sha256': checksum})
        record = dict(project=pid, bug_id=int(bid), version=bid + 'b', status='ok', files=files,
                      absent_in_buggy=absent)
    except Exception as exc:
        record = dict(project=pid, bug_id=int(bid), status='error', error=str(exc))
    manifest.write_text(json.dumps(record, indent=2) + '\n')
    return record


def main():
    tasks = [(pid, bid) for pid in command(['pids']).splitlines()
             for bid in command(['bids', '-p', pid]).splitlines()]
    (META / 'inventory.json').write_text(json.dumps(tasks, indent=2) + '\n')
    print('Collecting {} active bugs from {} projects'.format(len(tasks), len({p for p, b in tasks})), flush=True)
    records = []
    with concurrent.futures.ThreadPoolExecutor(max_workers=4) as pool:
        for i, record in enumerate(pool.map(collect, tasks), 1):
            records.append(record)
            if i % 10 == 0 or record['status'] != 'ok':
                print('{}/{} {}_{} {}'.format(i, len(tasks), record['project'], record['bug_id'], record['status']), flush=True)
    (META / 'results.json').write_text(json.dumps(records, indent=2) + '\n')
    failures = [r for r in records if r['status'] != 'ok']
    counts = []
    for pid in sorted({p for p, b in tasks}):
        selected = [r for r in records if r['project'] == pid]
        counts.append({'project': pid, 'expected_bugs': len(selected),
                       'verified_bugs': sum(r['status'] == 'ok' for r in selected),
                       'source_files': sum(len(r.get('files', [])) for r in selected)})
    folder_count = sum(p.is_dir() and bool(re.fullmatch(r'[A-Za-z]+_[0-9]+', p.name))
                       for p in ROOT.iterdir())
    summary = {'expected_active_bugs': len(tasks), 'bug_folders': folder_count,
               'verified_bugs': len(records)-len(failures), 'failed_bugs': len(failures),
               'projects': counts}
    (ROOT / 'bug_counts.json').write_text(json.dumps(summary, indent=2) + '\n')
    lines = ['# Defects4J bug counts', '',
             'Scope: all active bug IDs returned by defects4j pids / bids.',
             'Sources: buggy checkout, selected using classes.modified and dir.src.classes.',
             '', 'Bug folders: **{}**; verified: **{} / {}**.'.format(
                 folder_count, len(records)-len(failures), len(tasks)), '',
             '| Project | Expected bugs | Verified bugs | Source files |',
             '| --- | ---: | ---: | ---: |']
    lines += ['| {project} | {expected_bugs} | {verified_bugs} | {source_files} |'.format(**r)
              for r in counts]
    lines += ['', 'Missing bug ID numbers are inactive/deprecated IDs excluded by defects4j bids.',
              'Files introduced only in the fix are recorded as absent_in_buggy in _collection manifests.',
              'Existing extra files are preserved; counts above use the collected manifests.',
              'Reproduce/resume: python3 Resoucre/collect_all.py']
    (ROOT / 'BUG_COUNTS.md').write_text('\n'.join(lines) + '\n')
    print('Completed: {} successful, {} failed'.format(len(records)-len(failures), len(failures)), flush=True)
    raise SystemExit(bool(failures))


if __name__ == '__main__':
    main()
