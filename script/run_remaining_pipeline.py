#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import subprocess
import sys
import time
from pathlib import Path

projects = ['Compress', 'Jsoup', 'JacksonDatabind', 'Math', 'Closure']
workspace = Path('/home/manamo/wan/SQA-Project')
venv_python = workspace / 'script' / '.venv' / 'bin' / 'python3'
generate_script = workspace / 'script' / 'generate_gemini_tests.py'
update_script = workspace / 'script' / 'update_readme_status.py'

print("================================================================================")
print("🚀 RUNNING AUTOMATED BATCH PIPELINE FOR REMAINING DEFECTS4J PROJECTS")
print(f"📋 Projects queue: {', '.join(projects)}")
print("================================================================================\n")

for p in projects:
    print(f"\n{'='*70}")
    print(f"▶️  STARTING BATCH: {p}")
    print(f"{'='*70}\n")
    
    cmd = [
        str(venv_python),
        str(generate_script),
        '--project', p,
        '--timeout', '90'
    ]
    
    ret = subprocess.run(cmd, cwd=str(workspace))
    print(f"\n🏁 Finished {p} with return code: {ret.returncode}")
    
    # Update readme after each project
    print("📝 Updating readm.md status...")
    subprocess.run([str(venv_python), str(update_script)], cwd=str(workspace))
    time.sleep(2)

print("\n================================================================================")
print("🎉 ALL REMAINING PROJECTS PROCESSED IN PIPELINE!")
print("================================================================================\n")
