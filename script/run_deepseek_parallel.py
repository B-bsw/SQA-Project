#!/usr/bin/env python3
"""Run disjoint Defects4J project groups with one API key per worker."""

import argparse
import hashlib
import queue
import re
import subprocess
import sys
import threading
from concurrent.futures import ThreadPoolExecutor, as_completed
from pathlib import Path

from generate_deepseek_tests import get_all_api_keys, load_state, save_atomic_json


def discover_groups(resource_dir: Path) -> list[str]:
    """Return project prefixes such as Cli and Chart from Resoucre/* directories."""
    return sorted({p.name.split("_", 1)[0] for p in resource_dir.iterdir()
                   if p.is_dir() and re.fullmatch(r"[A-Za-z][A-Za-z0-9]*_\d+", p.name)})


def worker_command(generator: Path, output_dir: Path, group: str, slot: int,
                   key: str, daily_budget: int, env_file: str | None,
                   max_tokens: int | None, skip_limits: bool,
                   no_budget: bool = False) -> list[str]:
    """Give each project its own state and each key its own persistent budget."""
    fingerprint = hashlib.sha256(key.encode("utf-8")).hexdigest()[:16]
    cmd = [sys.executable, "-u", str(generator), "--project", group,
           "--key-index", str(slot),
           "--state-file", str(output_dir / "state" / f"{group}.json"),
           "--budget-file", str(output_dir / "budget" / f"key-{fingerprint}.json"),
           "--budget-limit", str(daily_budget)]
    if env_file:
        cmd.extend(["--env-file", env_file])
    if max_tokens is not None:
        cmd.extend(["--max-tokens", str(max_tokens)])
    if skip_limits:
        cmd.append("--skip-limits")
    if no_budget:
        cmd.append("--no-budget")
    return cmd


def seed_project_states(output_dir: Path, groups: list[str]) -> None:
    """Keep completed work from the original shared state on the first run."""
    legacy_file = output_dir / "generation_state.json"
    if not legacy_file.is_file():
        return
    legacy = load_state(legacy_file, read_only=True)
    for group in groups:
        target = output_dir / "state" / f"{group}.json"
        if target.exists():
            continue
        entries = {task_id: entry for task_id, entry in legacy.items()
                   if task_id.split("/", 1)[0].startswith(group + "_")}
        if entries:
            save_atomic_json(target, entries)


def prefer_newer(current: dict | None, candidate: dict) -> bool:
    """Prefer the state entry written most recently by a worker."""
    if current is None:
        return True
    return str(candidate.get("updated_at", "")) >= str(current.get("updated_at", ""))


def sync_global_state(output_dir: Path) -> bool:
    """Mirror every worker shard into the state used by the original generator."""
    global_file = output_dir / "generation_state.json"
    combined = load_state(global_file, read_only=True)
    changed = False
    for shard in sorted((output_dir / "state").glob("*.json")):
        for task_id, entry in load_state(shard, read_only=True).items():
            if combined.get(task_id) != entry and prefer_newer(combined.get(task_id), entry):
                combined[task_id] = entry
                changed = True
    if changed:
        save_atomic_json(global_file, combined)
    return changed


def main(argv=None) -> int:
    parser = argparse.ArgumentParser(description="Run DeepSeek project groups in parallel")
    parser.add_argument("--projects", nargs="+", metavar="NAME",
                        help="Project groups to run, for example Cli Chart (default: all groups)")
    parser.add_argument("--workers", type=int, default=4,
                        help="Number of concurrent keys/processes (default: 4)")
    parser.add_argument("--budget-limit", type=int, default=800000,
                        help="Local daily token budget per key (default: 800000)")
    parser.add_argument("--no-budget", action="store_true",
                        help="Disable the local daily token budget for each worker")
    parser.add_argument("--env-file", help="Path to the API key .env file")
    parser.add_argument("--max-tokens", type=int, help="Output token cap per request")
    parser.add_argument("--skip-limits", action="store_true",
                        help="Skip files previously marked LIMIT_REACHED")
    parser.add_argument("--dry-run", action="store_true",
                        help="Show project/key assignments without calling the API or writing files")
    args = parser.parse_args(argv)

    if args.workers < 1 or args.budget_limit < 1 or (args.max_tokens is not None and args.max_tokens < 1):
        parser.error("--workers, --budget-limit and --max-tokens must be positive")

    workspace = Path(__file__).resolve().parent.parent
    generator = workspace / "script" / "generate_deepseek_tests.py"
    output_dir = workspace / "Deepseek-flash-v4"
    resource_dir = workspace / "Resoucre"
    if not resource_dir.is_dir():
        parser.error(f"Source directory not found: {resource_dir}")
    available = discover_groups(resource_dir)
    groups = list(dict.fromkeys(args.projects)) if args.projects else available
    unknown = [g for g in groups if g not in available]
    if unknown:
        parser.error(f"Unknown project group(s): {', '.join(unknown)}")
    keys = get_all_api_keys(env_file_arg=args.env_file)
    if not keys:
        parser.error("No API keys found in .env or environment")
    if args.workers > len(keys):
        parser.error(f"--workers {args.workers} needs {args.workers} distinct keys; found {len(keys)}")

    if args.dry_run:
        for index, group in enumerate(groups):
            print(f"{group}: key #{index % args.workers + 1} (one project at a time per key)")
        budget_label = "local budget disabled" if args.no_budget else f"{args.budget_limit:,} tokens/day per key"
        print(f"{len(groups)} groups, {args.workers} workers, {budget_label}")
        return 0

    seed_project_states(output_dir, groups)

    jobs = queue.Queue()
    for group in groups:
        jobs.put(group)
    active = {}
    active_lock = threading.Lock()
    output_lock = threading.Lock()
    results = {}
    stop_sync = threading.Event()
    refresh_sync = threading.Event()
    sync_failed = threading.Event()

    def say(message: str):
        with output_lock:
            print(message, flush=True)

    def mirror_progress():
        while True:
            refresh_sync.wait(timeout=10)
            refresh_sync.clear()
            try:
                sync_global_state(output_dir)
            except (OSError, RuntimeError, ValueError) as exc:
                sync_failed.set()
                say(f"Could not update generation_state.json: {exc}")
            if stop_sync.is_set():
                return

    def run_worker(slot: int):
        while True:
            try:
                group = jobs.get(timeout=0.2)
            except queue.Empty:
                # Another worker may still be running a group that needs retrying.
                with jobs.all_tasks_done:
                    if jobs.unfinished_tasks == 0:
                        return
                continue
            cmd = worker_command(generator, output_dir, group, slot, keys[slot - 1],
                                 args.budget_limit, args.env_file, args.max_tokens,
                                 args.skip_limits, args.no_budget)
            say(f"[key #{slot}] Starting {group}")
            try:
                with subprocess.Popen(cmd, cwd=workspace, stdout=subprocess.PIPE,
                                      stderr=subprocess.STDOUT, text=True,
                                      encoding="utf-8", errors="replace", bufsize=1) as process:
                    with active_lock:
                        active[slot] = process
                    for line in process.stdout:
                        say(f"[{slot}:{group}] {line.rstrip()}")
                    code = process.wait()
            except OSError as exc:
                say(f"[key #{slot}] Could not start {group}: {exc}")
                code = 1
            finally:
                with active_lock:
                    active.pop(slot, None)
            results[group] = code
            say(f"[key #{slot}] {group} exited with code {code}")
            refresh_sync.set()
            if code == 3:
                # The key is exhausted, but another key can resume this group's state.
                jobs.put(group)
                say(f"[key #{slot}] Requeued {group} for another available key")
            jobs.task_done()
            if code != 0:
                # Code 3 means the key's daily budget or server quota was exhausted.
                return

    sync_thread = threading.Thread(target=mirror_progress, daemon=True)
    sync_thread.start()
    try:
        with ThreadPoolExecutor(max_workers=args.workers) as pool:
            futures = [pool.submit(run_worker, slot) for slot in range(1, args.workers + 1)]
            try:
                for future in as_completed(futures):
                    future.result()
            except KeyboardInterrupt:
                with active_lock:
                    for process in active.values():
                        process.terminate()
                say("Interrupted; active generators were stopped. Run the same command to resume.")
                return 130
    finally:
        stop_sync.set()
        refresh_sync.set()
        sync_thread.join()

    if sync_failed.is_set():
        return 1

    unfinished = [group for group in groups if results.get(group) != 0]
    if unfinished:
        say(f"Groups needing another run: {', '.join(unfinished)}")
        return 3
    say(f"Finished generator runs for {len(groups)} project groups. Generated tests still need compilation and verification.")
    return 0


if __name__ == "__main__":
    sys.exit(main())
