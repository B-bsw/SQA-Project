#!/usr/bin/env python3
"""Run disjoint Defects4J project groups with independent Randoop state files."""

import argparse
import json
import queue
import re
import subprocess
import sys
import threading
from concurrent.futures import ThreadPoolExecutor
from pathlib import Path


def discover_groups(resource_dir: Path) -> list[str]:
    return sorted({p.name.split("_", 1)[0] for p in resource_dir.iterdir()
                   if p.is_dir() and re.fullmatch(r"[A-Za-z][A-Za-z0-9]*_\d+", p.name)})


def load_state(path: Path) -> dict:
    if not path.is_file():
        return {}
    with path.open(encoding="utf-8") as stream:
        data = json.load(stream)
    if not isinstance(data, dict):
        raise ValueError(f"State must be a JSON object: {path}")
    return data


def prefer_newer(current: dict | None, candidate: dict) -> bool:
    """Keep a later direct-generator result when reconciling legacy and shard state."""
    if current is None:
        return True
    return str(candidate.get("timestamp", "")) >= str(current.get("timestamp", ""))


def seed_group_states(output_dir: Path, groups: list[str]) -> None:
    """Resume from both state formats without losing newer direct-generator results."""
    legacy = load_state(output_dir / "generation_state.json")
    for group in groups:
        target = output_dir / "state" / f"{group}.json"
        entries = load_state(target)
        updated = not target.exists()
        for name, value in legacy.items():
            if name.startswith(group + "_") and prefer_newer(entries.get(name), value):
                if entries.get(name) != value:
                    entries[name] = value
                    updated = True
        if not entries or not updated:
            continue
        target.parent.mkdir(parents=True, exist_ok=True)
        temporary = target.with_suffix(".tmp")
        with temporary.open("w", encoding="utf-8") as stream:
            json.dump(entries, stream, ensure_ascii=False, indent=2)
        temporary.replace(target)


def sync_global_state(output_dir: Path, groups: list[str]) -> bool:
    """Mirror shard progress so the original generator's status and skip logic still work."""
    legacy_file = output_dir / "generation_state.json"
    combined = load_state(legacy_file)
    changed = False
    all_groups = set(groups) | {path.stem for path in (output_dir / "state").glob("*.json")}
    for group in sorted(all_groups):
        shard = output_dir / "state" / f"{group}.json"
        for name, entry in load_state(shard).items():
            if (name.startswith(group + "_") and combined.get(name) != entry
                    and prefer_newer(combined.get(name), entry)):
                combined[name] = entry
                changed = True
    if changed:
        temporary = legacy_file.with_suffix(".parallel.tmp")
        with temporary.open("w", encoding="utf-8") as stream:
            json.dump(combined, stream, ensure_ascii=False, indent=2)
        temporary.replace(legacy_file)
    return changed


def worker_command(generator: Path, output_dir: Path, group: str, args) -> list[str]:
    cmd = [sys.executable, "-u", str(generator), "--project", group,
           "--state-file", str(output_dir / "state" / f"{group}.json"),
           "--time-limit", str(args.time_limit), "--jvm-memory", args.jvm_memory]
    if args.data_dir:
        cmd.extend(["--data-dir", args.data_dir])
    if args.overwrite:
        cmd.append("--overwrite")
    return cmd


def group_status(output_dir: Path, resource_dir: Path, group: str) -> tuple[int, int, int]:
    shard = output_dir / "state" / f"{group}.json"
    state = load_state(output_dir / "generation_state.json")
    for name, entry in load_state(shard).items():
        if name.startswith(group + "_") and prefer_newer(state.get(name), entry):
            state[name] = entry
    projects = [p.name for p in resource_dir.iterdir() if p.is_dir()
                and re.fullmatch(re.escape(group) + r"_\d+", p.name)]
    completed = sum(state.get(name, {}).get("status") == "COMPLETED" for name in projects)
    failed = sum(state.get(name, {}).get("status") == "FAILED" for name in projects)
    return completed, failed, len(projects) - completed - failed


def main(argv=None) -> int:
    parser = argparse.ArgumentParser(description="Run Randoop project groups in parallel")
    parser.add_argument("--projects", nargs="+", metavar="NAME",
                        help="Groups such as Cli Chart (default: all groups)")
    parser.add_argument("--workers", type=int, default=2,
                        help="Concurrent Randoop processes (default: 2)")
    parser.add_argument("--time-limit", type=int, default=60,
                        help="Seconds per Defects4J project (default: 60)")
    parser.add_argument("--jvm-memory", default="3000m",
                        help="Maximum heap per worker (default: 3000m)")
    parser.add_argument("--data-dir", help="Existing Defects4J checkouts")
    parser.add_argument("--overwrite", action="store_true", help="Regenerate completed projects")
    parser.add_argument("--dry-run", action="store_true", help="Show assignments without writing")
    parser.add_argument("--status", action="store_true", help="Read group states without writing")
    args = parser.parse_args(argv)
    if args.workers < 1 or args.time_limit < 1:
        parser.error("--workers and --time-limit must be positive")

    workspace = Path(__file__).resolve().parent.parent
    resource_dir = workspace / "Resoucre"
    output_dir = workspace / "Feedback-Directed Random Test Generation"
    generator = workspace / "script" / "generate_randoop_tests.py"
    if not resource_dir.is_dir():
        parser.error(f"Source directory not found: {resource_dir}")
    available = discover_groups(resource_dir)
    groups = list(dict.fromkeys(args.projects)) if args.projects else available
    unknown = [group for group in groups if group not in available]
    if unknown:
        parser.error(f"Unknown project group(s): {', '.join(unknown)}")
    if not groups:
        parser.error("No Defects4J project groups found")

    if args.status:
        total_completed = total_failed = total_pending = 0
        for group in groups:
            completed, failed, pending = group_status(output_dir, resource_dir, group)
            print(f"{group}: completed={completed} failed={failed} pending={pending}")
            total_completed += completed
            total_failed += failed
            total_pending += pending
        print(f"Total Randoop ({len(groups)} groups): completed={total_completed} "
              f"failed={total_failed} pending={total_pending} "
              f"total={total_completed + total_failed + total_pending}")
        return 0
    if args.dry_run:
        for index, group in enumerate(groups):
            print(f"worker {index % args.workers + 1}: {group} -> state/{group}.json")
        print(f"{len(groups)} groups, up to {min(args.workers, len(groups))} workers")
        return 0

    seed_group_states(output_dir, groups)
    jobs = queue.Queue()
    for group in groups:
        jobs.put(group)
    output_lock = threading.Lock()
    active_lock = threading.Lock()
    active = {}
    results = {}
    stop_sync = threading.Event()
    refresh_sync = threading.Event()
    sync_failed = threading.Event()

    def say(message: str) -> None:
        with output_lock:
            print(message, flush=True)

    def mirror_progress() -> None:
        while True:
            refresh_sync.wait(timeout=10)
            refresh_sync.clear()
            try:
                sync_global_state(output_dir, groups)
            except (OSError, ValueError, json.JSONDecodeError) as exc:
                sync_failed.set()
                say(f"Could not update generation_state.json: {exc}")
            if stop_sync.is_set():
                return

    def run_worker(slot: int) -> None:
        while True:
            try:
                group = jobs.get_nowait()
            except queue.Empty:
                return
            cmd = worker_command(generator, output_dir, group, args)
            say(f"[worker {slot}] starting {group}")
            try:
                with subprocess.Popen(cmd, cwd=workspace, stdout=subprocess.PIPE,
                                      stderr=subprocess.STDOUT, text=True, encoding="utf-8",
                                      errors="replace", bufsize=1) as process:
                    with active_lock:
                        active[slot] = process
                    for line in process.stdout:
                        say(f"[{slot}:{group}] {line.rstrip()}")
                    code = process.wait()
            except OSError as exc:
                say(f"[worker {slot}] could not start {group}: {exc}")
                code = 1
            finally:
                with active_lock:
                    active.pop(slot, None)
            _, failed, pending = group_status(output_dir, resource_dir, group)
            results[group] = code == 0 and failed == 0 and pending == 0
            say(f"[worker {slot}] {group}: exit={code} failed={failed} pending={pending}")
            refresh_sync.set()

    sync_thread = threading.Thread(target=mirror_progress, daemon=True)
    sync_thread.start()
    try:
        with ThreadPoolExecutor(max_workers=min(args.workers, len(groups))) as pool:
            futures = [pool.submit(run_worker, slot) for slot in range(1, min(args.workers, len(groups)) + 1)]
            try:
                for future in futures:
                    future.result()
            except KeyboardInterrupt:
                with active_lock:
                    for process in active.values():
                        process.terminate()
                say("Interrupted; run the same command to resume.")
                return 130
    finally:
        stop_sync.set()
        refresh_sync.set()
        sync_thread.join()

    if sync_failed.is_set():
        return 1

    unfinished = [group for group in groups if not results.get(group)]
    if unfinished:
        say(f"Groups with failed or pending projects: {', '.join(unfinished)}")
        return 1
    say(f"Completed all {len(groups)} groups. Run generated JUnit tests and coverage separately.")
    return 0


if __name__ == "__main__":
    sys.exit(main())
