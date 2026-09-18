#!/usr/bin/env python3
# -*- coding: utf-8 -*-

"""
================================================================================
Randoop Automated JUnit Test Generator for Defect4J (Feedback-Directed Random Testing)
================================================================================
สคริปต์นี้ทำหน้าที่:
1. สแกนหาโฟลเดอร์โปรเจกต์และไฟล์ .java ทั้งหมดใน Resoucre/ (เช่น Codec_1, Chart_1 เป็นต้น)
2. วิเคราะห์หา Fully Qualified Class Name (FQCN) และ Package Name ของแต่ละไฟล์
3. สร้าง classlist.txt อัตโนมัติสำหรับแต่ละโฟลเดอร์โปรเจกต์
4. ค้นหาและเตรียม Classpath (เช่น target/classes หรือ build/classes จาก data/ หรือที่ผู้ใช้ระบุ)
5. รัน Randoop gentests ตามรูปแบบคำสั่ง:
   java -cp "<randoop.jar>;<classes_dir>" randoop.main.Main gentests \
        --classlist=<classlist.txt> \
        --junit-package-name=<package> \
        --junit-output-dir=<output_dir> \
        --time-limit=<seconds>
6. จัดเก็บไฟล์ Test ที่สร้างได้ (RegressionTest*.java, ErrorTest*.java) ลงใน:
   Feedback-Directed Random Test Generation/TestCode/<Project>_buggy/
7. มีระบบ Memory State (generation_state.json) จดจำสถานะ ป้องกันการรันซ้ำ และรองรับการ Resume
================================================================================
"""

import os
import sys
import json
import time
import shutil
import tempfile
import argparse
import subprocess
import platform
from pathlib import Path
from datetime import datetime
from typing import List, Dict, Optional, Tuple, Set

# Fix UTF-8 output on Windows consoles
if sys.platform == "win32":
    try:
        sys.stdout.reconfigure(encoding="utf-8")
        sys.stderr.reconfigure(encoding="utf-8")
    except AttributeError:
        pass


# ==============================================================================
# Helper: Class & Package Parser
# ==============================================================================

def parse_java_file_info(file_path: Path, project_root: Path) -> Dict[str, str]:
    """
    วิเคราะห์ไฟล์ .java เพื่อดึงข้อมูล:
    - package_name
    - class_name
    - fqcn (Fully Qualified Class Name)
    """
    package_name = ""
    class_name = file_path.stem
    
    try:
        with open(file_path, "r", encoding="utf-8", errors="ignore") as f:
            for line in f:
                line = line.strip()
                if line.startswith("package ") and line.endswith(";"):
                    package_name = line[8:-1].strip()
                    break
    except Exception:
        pass

    # หากอ่าน package จากโค้ดไม่ได้ ให้คำนวณจาก relative path จาก project_root
    if not package_name:
        try:
            rel_path = file_path.relative_to(project_root)
            parts = list(rel_path.parent.parts)
            if parts:
                package_name = ".".join(parts)
        except Exception:
            package_name = ""

    if package_name:
        fqcn = f"{package_name}.{class_name}"
    else:
        fqcn = class_name

    return {
        "file_path": str(file_path),
        "class_name": class_name,
        "package_name": package_name,
        "fqcn": fqcn
    }


# ==============================================================================
# Helper: Classpath & Randoop Jar Resolver
# ==============================================================================

def find_randoop_jar(custom_jar: Optional[str], workspace_dir: Path) -> Optional[Path]:
    """
    ค้นหาไฟล์ randoop-all-4.3.4.jar ตามลำดับความสำคัญ:
    1. Custom path ที่ผู้ใช้ระบุผ่าน CLI (--randoop-jar)
    2. Feedback-Directed Random Test Generation/Configuration/randoop-all-4.3.4.jar (ค่าเริ่มต้นหลักของโปรเจกต์)
    3. Configuration/randoop-all-4.3.4.jar
    4. C:\\randoop\\randoop-all-4.3.4.jar
    """
    candidates = []
    if custom_jar:
        candidates.append(Path(custom_jar))
        
    candidates.append(workspace_dir / "Feedback-Directed Random Test Generation" / "Configuration" / "randoop-all-4.3.4.jar")
    candidates.append(workspace_dir / "Configuration" / "randoop-all-4.3.4.jar")
    candidates.append(Path(r"C:\randoop\randoop-all-4.3.4.jar"))

    for c in candidates:
        if c.is_file():
            return c.resolve()

    return None


def find_defects4j_bin() -> Optional[str]:
    """
    ค้นหา binary ของ defects4j ตามลำดับ:
    1. DEFECTS4J_BIN environment variable
    2. which defects4j in PATH
    3. ~/defect4j/defects4j/framework/bin/defects4j (Linux / WSL)
    """
    if os.environ.get("DEFECTS4J_BIN"):
        cand = Path(os.environ["DEFECTS4J_BIN"])
        if cand.is_file():
            return str(cand)

    which_d4j = shutil.which("defects4j")
    if which_d4j:
        return which_d4j

    home_d4j = Path.home() / "defect4j" / "defects4j" / "framework" / "bin" / "defects4j"
    if home_d4j.is_file():
        return str(home_d4j)

    return None


def try_fast_javac_compile(
    project_info: dict,
    workspace_dir: Path,
    build_base_dir: Path
) -> Optional[Path]:
    """
    พยายามคอมไพล์ .java ของโปรเจกต์นั้นทันทีด้วย javac เข้าไปที่ BuildClasses/<project_name>
    1. ลองคอมไพล์แบบ Standalone
    2. ลองคอมไพล์โดยดึง classpath จาก data/<Project>1buggy (classes + jars)
    3. ลองดึง jars จาก defects4j/framework/projects/<Prefix>/lib/
    """
    proj_name = project_info["project_name"]
    java_files = project_info.get("java_files", [])
    if not java_files:
        return None

    target_build_dir = build_base_dir / proj_name
    target_build_dir.mkdir(parents=True, exist_ok=True)

    if any(target_build_dir.glob("**/*.class")):
        return target_build_dir.resolve()

    prefix = proj_name.split("_")[0]
    candidate_data_dirs = [
        workspace_dir / "data" / f"{prefix}1buggy",
        workspace_dir / "data" / f"{prefix}_1_buggy",
        workspace_dir / "data" / f"{prefix}1fixed",
        Path.home() / "defect4j" / "Code" / f"{prefix}1buggy",
        Path.home() / "defect4j" / "Code" / f"{prefix}_1_buggy",
    ]

    cp_entries = []
    for cd in candidate_data_dirs:
        if cd.is_dir():
            for sub in ["target/classes", "build/classes", "classes", "build"]:
                p = cd / sub
                if p.is_dir() and any(p.glob("**/*.class")):
                    cp_entries.append(str(p))
            for jar in cd.glob("**/*.jar"):
                cp_entries.append(str(jar))

    # เพิ่ม jar libraries ใน Defects4J framework projects ถ้ามี
    d4j_proj_lib = Path.home() / "defect4j" / "defects4j" / "framework" / "projects" / prefix / "lib"
    if d4j_proj_lib.is_dir():
        for jar in d4j_proj_lib.glob("**/*.jar"):
            cp_entries.append(str(jar))

    # กรองเฉพาะ classpath ที่ไม่มี space หรือมีอยู่จริง
    valid_cp = [c for c in cp_entries if Path(c).exists()]

    cmd = ["javac", "-source", "1.8", "-target", "1.8", "-d", str(target_build_dir)]
    if valid_cp:
        cmd += ["-cp", os.pathsep.join(valid_cp)]
    cmd += [str(f) for f in java_files]

    try:
        res = subprocess.run(cmd, capture_output=True, text=True, timeout=30)
        if res.returncode != 0:
            cmd_fallback = ["javac", "-d", str(target_build_dir)]
            if valid_cp:
                cmd_fallback += ["-cp", os.pathsep.join(valid_cp)]
            cmd_fallback += [str(f) for f in java_files]
            res = subprocess.run(cmd_fallback, capture_output=True, text=True, timeout=30)

        if res.returncode == 0 and any(target_build_dir.glob("**/*.class")):
            print(f"  ⚡ [FAST-COMPILE] คอมไพล์ .class ด้วย javac สำเร็จ ({proj_name})")
            return target_build_dir.resolve()
    except Exception:
        pass

    return None


def try_defects4j_auto_checkout_compile(
    project_info: dict,
    workspace_dir: Path,
    build_base_dir: Path,
    defects4j_bin: str
) -> Optional[Path]:
    """
    ใช้ defects4j checkout และ defects4j compile อัตโนมัติเมื่อไม่พบ .class
    ใช้พื้นที่ทำงานชั่วคราวที่ไม่มีเว้นวรรค (/tmp/sqa_d4j_work หรือ build_base_dir/d4j_work)
    เพื่อป้องกัน Bug ของ Defects4J Perl script ที่แตกพาธเมื่อมีช่องว่าง
    เมื่อ compile สำเร็จ จะคัดลอก .class ไปยัง build_base_dir/<Project> เพื่อแคชถาวร
    """
    proj_name = project_info["project_name"]
    parts = proj_name.split("_")
    if len(parts) != 2:
        return None

    pid, bid = parts[0], parts[1]
    target_cache_dir = build_base_dir / proj_name
    if target_cache_dir.is_dir() and any(target_cache_dir.glob("**/*.class")):
        return target_cache_dir.resolve()

    # เลือกไดเรกทอรีทำงานที่ปราศจาก space โดยเด็ดขาด เพื่อป้องกัน bug ใน Perl script ของ Defects4J
    if platform.system() != "Windows" or os.environ.get("WSL_DISTRO_NAME"):
        d4j_work_base = Path("/tmp/sqa_d4j_work")
    else:
        d4j_work_base = build_base_dir / "d4j_work"

    d4j_work_base.mkdir(parents=True, exist_ok=True)
    checkout_dir = d4j_work_base / f"{proj_name}_buggy"

    # หากเคย checkout และ compile ไว้แล้วใน d4j_work_base
    for sub in ["target/classes", "build/classes", "classes", "build"]:
        cand = checkout_dir / sub
        if cand.is_dir() and any(cand.glob("**/*.class")):
            target_cache_dir.mkdir(parents=True, exist_ok=True)
            shutil.copytree(cand, target_cache_dir, dirs_exist_ok=True)
            return target_cache_dir.resolve()

    print(f"  🔧 [DEFECTS4J] กำลัง Checkout และ Compile {pid}-{bid}b อัตโนมัติ...")
    try:
        # หาก checkout_dir มีอยู่แต่ยังไม่มี class ให้ลบก่อนเพื่อให้ checkout ใหม่สะอาด
        if checkout_dir.exists():
            shutil.rmtree(checkout_dir, ignore_errors=True)

        checkout_cmd = [defects4j_bin, "checkout", "-p", pid, "-v", f"{bid}b", "-w", str(checkout_dir)]
        res_co = subprocess.run(checkout_cmd, capture_output=True, text=True, timeout=180)
        if res_co.returncode != 0:
            err_msg = res_co.stderr.strip() or res_co.stdout.strip()
            print(f"  ⚠️ Defects4J checkout ไม่สำเร็จ: {err_msg[:120]}")
            return None

        compile_cmd = [defects4j_bin, "compile", "-w", str(checkout_dir)]
        res_cp = subprocess.run(compile_cmd, capture_output=True, text=True, timeout=180)
        if res_cp.returncode != 0:
            err_msg = res_cp.stderr.strip() or res_cp.stdout.strip()
            print(f"  ⚠️ Defects4J compile ไม่สำเร็จ: {err_msg[:120]}")
            return None

        # ส่งออก compile classpath เพื่อบันทึก dependency JARs ทั้งหมดไว้ใช้ตอนรัน Randoop
        try:
            export_cmd = [defects4j_bin, "export", "-p", "cp.compile", "-w", str(checkout_dir)]
            res_exp = subprocess.run(export_cmd, capture_output=True, text=True, timeout=60)
            if res_exp.returncode == 0:
                lines = [l.strip() for l in res_exp.stdout.splitlines() if l.strip()]
                if lines:
                    target_cache_dir.mkdir(parents=True, exist_ok=True)
                    cp_file = target_cache_dir / "classpath.txt"
                    cp_file.write_text(lines[-1], encoding="utf-8")
        except Exception:
            pass

        # ค้นหาไดเรกทอรี classes ที่แม่นยำที่สุด
        for sub in [
            "target/classes",
            "build/classes/java/main",
            "build/classes/main",
            "build/classes",
            "classes",
            "build"
        ]:
            cand = checkout_dir / sub
            if cand.is_dir() and any(cand.glob("**/*.class")):
                target_cache_dir.mkdir(parents=True, exist_ok=True)
                shutil.copytree(cand, target_cache_dir, dirs_exist_ok=True)
                print(f"  ✅ [DEFECTS4J] คอมไพล์โปรเจกต์ {pid}-{bid}b สำเร็จ (บันทึกลง BuildClasses/{proj_name})")
                return target_cache_dir.resolve()
    except Exception as e:
        print(f"  ⚠️ Defects4J error: {e}")

    return None


def resolve_project_classes_dir(
    project_folder: str,
    workspace_dir: Path,
    custom_classes_dir: Optional[str] = None,
    project_info: Optional[dict] = None,
    auto_compile: bool = True
) -> Optional[Path]:
    """
    ค้นหาโฟลเดอร์ที่เก็บ .class ที่คอมไพล์แล้วของโปรเจกต์นั้น:
    1. Custom dir ที่ผู้ใช้ระบุผ่าน --classes-dir
    2. BuildClasses/<Project> (ที่เคยคอมไพล์ไว้แล้ว - ไม่มี space)
    3. data/<ProjectName><BugNum>buggy/...
    4. ~/defect4j/Code/<ProjectName><BugNum>buggy/...
    5. target/classes หรือ build/classes ใน CWD
    6. หากไม่พบและ auto_compile=True:
       a. Fast on-the-fly javac compile (บันทึกลง BuildClasses/<Project>)
       b. Defects4j checkout & compile (บันทึกลง BuildClasses/<Project>)
    """
    if custom_classes_dir:
        p = Path(custom_classes_dir)
        if p.exists():
            return p.resolve()

    # ใช้ BuildClasses โดยตรงใน workspace (ไม่มี space ป้องกัน sub-jvm แตกคำสั่ง)
    build_base = workspace_dir / "BuildClasses"
    proj_build = build_base / project_folder
    if proj_build.is_dir() and any(proj_build.glob("**/*.class")):
        return proj_build.resolve()

    # ตรวจสอบ BuildClasses ใน Feedback-Directed... ด้วย (หากมีเดิม)
    legacy_build_base = workspace_dir / "Feedback-Directed Random Test Generation" / "BuildClasses" / project_folder
    if legacy_build_base.is_dir() and any(legacy_build_base.glob("**/*.class")):
        return legacy_build_base.resolve()

    clean_name = project_folder
    folder_without_underscore = project_folder.replace("_", "")
    
    potential_data_folders = [
        f"{folder_without_underscore}buggy",
        f"{project_folder}_buggy",
        f"{project_folder}buggy",
        f"{clean_name}",
        f"{folder_without_underscore}fixed"
    ]

    sub_class_dirs = [
        Path("target") / "classes",
        Path("build") / "classes",
        Path("classes"),
        Path("build"),
        Path("bin"),
        Path("target") / "test-classes"
    ]

    candidate_roots = [
        workspace_dir / "BuildClasses",
        workspace_dir / "data",
        Path.home() / "defect4j" / "Code",
        Path("/tmp/sqa_d4j_work"),
        workspace_dir / "Feedback-Directed Random Test Generation" / "Code",
    ]

    for base in candidate_roots:
        if not base.is_dir():
            continue
        for df in potential_data_folders:
            proj_data = base / df
            if proj_data.is_dir():
                for scd in sub_class_dirs:
                    target = proj_data / scd
                    if target.is_dir() and any(target.glob("**/*.class")):
                        return target.resolve()

    for scd in sub_class_dirs:
        target = workspace_dir / scd
        if target.is_dir() and any(target.glob("**/*.class")):
            return target.resolve()

    if auto_compile and project_info:
        compiled_path = try_fast_javac_compile(project_info, workspace_dir, build_base)
        if compiled_path:
            return compiled_path

        d4j_bin = find_defects4j_bin()
        if d4j_bin:
            compiled_path = try_defects4j_auto_checkout_compile(project_info, workspace_dir, build_base, d4j_bin)
            if compiled_path:
                return compiled_path

    return None


# ==============================================================================
# Helper: Memory State Manager
# ==============================================================================

class MemoryStateManager:
    """
    จัดการบันทึกและโหลดสถานะความคืบหน้าของ Randoop Test Generation
    บันทึกเป็น JSON File ป้องกันการสูญหายและรองรับ Resume
    """
    def __init__(self, state_file_path: Path):
        self.state_file_path = state_file_path
        self.state_data: Dict[str, dict] = {}
        self.load()

    def load(self):
        if self.state_file_path.is_file():
            try:
                with open(self.state_file_path, "r", encoding="utf-8") as f:
                    self.state_data = json.load(f)
            except Exception as e:
                print(f"⚠️ ไม่สามารถอ่าน Memory State เดิมได้ ({e}) - เริ่มต้นใหม่")
                self.state_data = {}
        else:
            self.state_data = {}

    def save(self):
        self.state_file_path.parent.mkdir(parents=True, exist_ok=True)
        temp_file = self.state_file_path.with_suffix(".tmp")
        try:
            with open(temp_file, "w", encoding="utf-8") as f:
                json.dump(self.state_data, f, indent=2, ensure_ascii=False)
            if temp_file.exists():
                temp_file.replace(self.state_file_path)
        except Exception as e:
            print(f"⚠️ บันทึก Memory State ไม่สำเร็จ: {e}")

    def is_completed(self, project_folder: str) -> bool:
        rec = self.state_data.get(project_folder)
        return bool(rec and rec.get("status") == "COMPLETED")

    def record_completed(self, project_folder: str, info: dict):
        info["status"] = "COMPLETED"
        info["timestamp"] = datetime.now().isoformat()
        self.state_data[project_folder] = info
        self.save()

    def record_failed(self, project_folder: str, error_msg: str, classes: List[str]):
        self.state_data[project_folder] = {
            "status": "FAILED",
            "error": error_msg,
            "classes": classes,
            "timestamp": datetime.now().isoformat()
        }
        self.save()

    def reset(self):
        self.state_data = {}
        self.save()


# ==============================================================================
# Helper: Fast In-Memory Test Indexer & Sync
# ==============================================================================

def pre_index_test_code_dir(test_code_dir: Path) -> Set[str]:
    """
    สแกนโฟลเดอร์ TestCode เพื่อทำดัชนีว่ามีโฟลเดอร์โปรเจกต์ใดที่มีไฟล์ Test อยู่แล้ว
    """
    completed_projects = set()
    if not test_code_dir.exists():
        return completed_projects

    for p in test_code_dir.iterdir():
        if p.is_dir():
            # หากมีไฟล์ RegressionTest หรือ Test.java ถือว่ามีผลลัพธ์แล้ว
            test_files = list(p.glob("**/*Test*.java"))
            if test_files:
                # Codec_1_buggy -> Codec_1
                clean_name = p.name
                if clean_name.endswith("_buggy"):
                    clean_name = clean_name[:-6]
                completed_projects.add(clean_name)
                completed_projects.add(p.name)

    return completed_projects


def sync_existing_tests_to_memory(
    memory_manager: MemoryStateManager,
    test_code_dir: Path,
    project_folders: List[str]
):
    """
    ตรวจหาไฟล์ Test ที่มีอยู่ในโฟลเดอร์ TestCode อยู่แล้ว แล้วซิงค์เข้าสถานะ COMPLETED
    """
    existing_index = pre_index_test_code_dir(test_code_dir)
    synced_count = 0

    for proj in project_folders:
        if not memory_manager.is_completed(proj):
            if proj in existing_index or f"{proj}_buggy" in existing_index:
                target_dir = test_code_dir / f"{proj}_buggy"
                if not target_dir.exists():
                    target_dir = test_code_dir / proj

                found_tests = [str(f.relative_to(test_code_dir)) for f in target_dir.glob("**/*Test*.java")]
                memory_manager.record_completed(proj, {
                    "source": "DISK_SYNC",
                    "output_dir": str(target_dir),
                    "generated_tests": found_tests,
                    "note": "ตรวจพบไฟล์ Test ที่มีอยู่แล้วบนดิสก์"
                })
                synced_count += 1

    if synced_count > 0:
        print(f"💾 [SYNC: COMPLETED] ตรวจพบและซิงค์การทำงานเดิมจากดิสก์เข้า Memory สำเร็จ {synced_count} โปรเจกต์")


# ==============================================================================
# Helper: Scanner for Resoucre Directory
# ==============================================================================

def scan_resource_projects(
    resource_dir: Path,
    filter_project: Optional[str] = None
) -> List[Dict]:
    """
    สแกนหาโฟลเดอร์ทั้งหมดใน Resoucre/ รวบรวมรายชื่อไฟล์ .java และ FQCN
    """
    if not resource_dir.is_dir():
        print(f"❌ Error: ไม่พบโฟลเดอร์ Resource ที่: {resource_dir}")
        return []

    entries = [d for d in resource_dir.iterdir() if d.is_dir()]
    if filter_project:
        entries = [d for d in entries if d.name.lower() == filter_project.lower()]
    entries.sort(key=lambda x: x.name)

    projects_data = []

    print(f"📂 กำลังสแกนหาไฟล์ Java จาก {len(entries)} โฟลเดอร์โปรเจกต์...")
    start_time = time.time()

    for idx, proj_dir in enumerate(entries, start=1):
        if idx % 25 == 0 or idx == len(entries):
            print(f"\r  ⏳ กำลังสแกนโปรเจกต์: [{idx}/{len(entries)}]", end="", flush=True)

        if filter_project and proj_dir.name.lower() != filter_project.lower():
            continue

        java_files = list(proj_dir.glob("**/*.java"))
        if not java_files:
            continue

        class_infos = []
        packages_found = set()

        for jf in java_files:
            info = parse_java_file_info(jf, proj_dir)
            class_infos.append(info)
            if info["package_name"]:
                packages_found.add(info["package_name"])

        # เลือก package หลัก (หากมี 1 package ให้ใช้ค่านั้น หากมีหลาย package ให้หา common prefix)
        primary_package = ""
        if len(packages_found) == 1:
            primary_package = list(packages_found)[0]
        elif len(packages_found) > 1:
            # ใช้ package ของคลาสแรก หรือ package ที่พบบ่อยที่สุด
            pkg_counts = {}
            for info in class_infos:
                pkg = info["package_name"]
                pkg_counts[pkg] = pkg_counts.get(pkg, 0) + 1
            primary_package = max(pkg_counts.items(), key=lambda x: x[1])[0]

        total_bytes = sum(jf.stat().st_size for jf in java_files)

        projects_data.append({
            "project_name": proj_dir.name,
            "project_dir": proj_dir,
            "java_files": java_files,
            "class_infos": class_infos,
            "fqcns": [ci["fqcn"] for ci in class_infos],
            "primary_package": primary_package,
            "packages": list(packages_found),
            "total_bytes": total_bytes
        })

    elapsed = time.time() - start_time
    print(f"\r  ✅ สแกนครบ {len(entries)} โฟลเดอร์ | พบโปรเจกต์ที่มี Java: {len(projects_data)} โปรเจกต์ (ใช้เวลา {elapsed:.2f}s)")
    return projects_data


def find_effective_class_root(classes_dir: Path, primary_package: str) -> Path:
    """
    ตรวจหา Root Directory ที่เก็บ package ของ Java อย่างถูกต้อง
    เช่น หาก classes_dir มีโครงสร้าง java/main/org/... ให้คืนค่า path ที่ชี้ไปยัง java/main
    """
    if not primary_package or not classes_dir.is_dir():
        return classes_dir

    top_pkg = primary_package.split(".")[0]
    if (classes_dir / top_pkg).is_dir():
        return classes_dir

    matching_dirs = []
    try:
        for d in classes_dir.glob(f"**/{top_pkg}"):
            if d.is_dir() and any(d.glob("**/*.class")):
                matching_dirs.append(d.parent)
    except Exception:
        pass

    if matching_dirs:
        # ให้ความสำคัญกับ java/main หรือ main ก่อน
        matching_dirs.sort(key=lambda p: (0 if "main" in str(p) else 1, len(str(p))))
        return matching_dirs[0]

    return classes_dir


def collect_project_classpath_entries(
    project_name: str,
    workspace_dir: Path
) -> List[str]:
    """
    รวบรวม dependency JARs และ classpath ที่จำเป็นสำหรับโปรเจกต์
    """
    extra_cps = []
    prefix = project_name.split("_")[0]

    # 1. ไฟล์ classpath.txt ที่เคย export ไว้ตอน Defects4J compile
    for base in [workspace_dir / "BuildClasses", workspace_dir / "Feedback-Directed Random Test Generation" / "BuildClasses"]:
        cp_file = base / project_name / "classpath.txt"
        if cp_file.exists():
            try:
                for entry in cp_file.read_text(encoding="utf-8").strip().split(os.pathsep):
                    entry = entry.strip()
                    if entry and Path(entry).exists() and entry not in extra_cps:
                        extra_cps.append(entry)
            except Exception:
                pass

    # 2. Defect4J framework lib JARs ของโปรเจกต์นั้น
    d4j_lib_dir = Path.home() / "defect4j" / "defects4j" / "framework" / "projects" / prefix / "lib"
    if d4j_lib_dir.is_dir():
        for jar in d4j_lib_dir.glob("**/*.jar"):
            s = str(jar)
            if s not in extra_cps:
                extra_cps.append(s)

    # 3. JARs ใน data/<prefix>1buggy
    for data_dir in [
        workspace_dir / "data" / f"{prefix}1buggy",
        workspace_dir / "data" / f"{prefix}_1_buggy",
        workspace_dir / "data" / f"{prefix}1fixed"
    ]:
        if data_dir.is_dir():
            for jar in data_dir.glob("**/*.jar"):
                s = str(jar)
                if s not in extra_cps:
                    extra_cps.append(s)

    # 4. หากมีใน /tmp/sqa_d4j_work/<project>_buggy
    tmp_work = Path("/tmp/sqa_d4j_work") / f"{project_name}_buggy"
    if tmp_work.is_dir():
        for jar in tmp_work.glob("**/*.jar"):
            s = str(jar)
            if s not in extra_cps:
                extra_cps.append(s)

    return extra_cps


# ==============================================================================
# Core Randoop Runner Function
# ==============================================================================

def run_randoop_for_project(
    project_info: dict,
    randoop_jar: Path,
    classes_dir: Path,
    output_dir: Path,
    time_limit: int,
    tests_per_file: int = 500,
    jvm_max_memory: str = "3000m",
    workspace_dir: Optional[Path] = None,
    dry_run: bool = False,
    quiet: bool = False
) -> Tuple[bool, str, List[str]]:
    """
    ดำเนินการรัน Randoop gentests สำหรับโปรเจกต์ที่กำหนด:
    1. จัดการ Staging Directory ที่ไม่มีเว้นวรรค (ป้องกันปัญหา Java subprocess บน Linux/WSL)
    2. ค้นหา package root ที่ถูกต้อง และรวบรวม dependency JARs
    3. สร้าง classlist.txt
    4. รัน Randoop gentests
    5. คัดลอกผลลัพธ์กลับสู่ output_dir (Feedback-Directed.../TestCode/<Project>_buggy/)
    """
    proj_name = project_info["project_name"]
    fqcns = project_info["fqcns"]
    primary_pkg = project_info["primary_package"]

    if workspace_dir is None:
        workspace_dir = project_info.get("project_dir", Path.cwd()).parent.parent

    # 0. ตรวจหา Root Directory ที่ถูกต้องสำหรับ Package (เช่น BuildClasses/Mockito_11/java/main)
    classes_dir = find_effective_class_root(classes_dir, primary_pkg)

    output_dir.mkdir(parents=True, exist_ok=True)

    # ตรวจสอบว่ามี path ที่มีเว้นวรรคหรือไม่ (เช่น "Feedback-Directed Random Test Generation")
    has_spaces = (" " in str(randoop_jar)) or (" " in str(classes_dir)) or (" " in str(output_dir))

    # ถ้ามีเว้นวรรค ให้ใช้ Staging directory ใน tempfile (ไม่มีเว้นวรรค)
    if has_spaces and not dry_run:
        staging_root = Path(tempfile.gettempdir()) / "sqa_randoop"
        staging_root.mkdir(parents=True, exist_ok=True)

        # 1. Staged Jar
        if " " in str(randoop_jar):
            staged_jar = staging_root / randoop_jar.name
            if not staged_jar.exists() or staged_jar.stat().st_mtime < randoop_jar.stat().st_mtime:
                try:
                    shutil.copy2(str(randoop_jar), str(staged_jar))
                except Exception:
                    staged_jar = randoop_jar
        else:
            staged_jar = randoop_jar

        # 2. Staged Classes Dir
        if " " in str(classes_dir):
            staged_classes = staging_root / "classes" / proj_name
            staged_classes.mkdir(parents=True, exist_ok=True)
            for cf in classes_dir.glob("**/*.class"):
                rel = cf.relative_to(classes_dir)
                dest = staged_classes / rel
                dest.parent.mkdir(parents=True, exist_ok=True)
                if not dest.exists() or dest.stat().st_mtime < cf.stat().st_mtime:
                    try:
                        shutil.copy2(str(cf), str(dest))
                    except Exception:
                        pass
        else:
            staged_classes = classes_dir

        # 3. Staged Output Dir
        staged_out = staging_root / "out" / proj_name
        staged_out.mkdir(parents=True, exist_ok=True)
        exec_out_dir = staged_out
        exec_jar = staged_jar
        exec_classes = staged_classes
    else:
        exec_out_dir = output_dir
        exec_jar = randoop_jar
        exec_classes = classes_dir

    temp_classlist = exec_out_dir / f"classlist_{proj_name}.txt"

    # 1. สร้าง classlist.txt
    try:
        with open(temp_classlist, "w", encoding="utf-8") as f:
            for fqcn in fqcns:
                f.write(f"{fqcn}\n")
    except Exception as e:
        return False, f"ไม่สามารถสร้างไฟล์ classlist.txt ได้: {e}", []

    # 2. เตรียม Classpath พร้อมรวบรวม dependency JARs
    extra_cps = collect_project_classpath_entries(proj_name, workspace_dir)
    all_cps = [str(exec_jar), str(exec_classes)] + extra_cps
    classpath_str = os.pathsep.join(all_cps)

    cmd = [
        "java",
        f"-Xmx{jvm_max_memory}",
        "-cp", classpath_str,
        "randoop.main.Main", "gentests",
        f"--classlist={temp_classlist}",
        f"--junit-output-dir={exec_out_dir}",
        f"--time-limit={time_limit}",
        f"--testsperfile={tests_per_file}"
    ]

    if primary_pkg:
        cmd.append(f"--junit-package-name={primary_pkg}")

    if dry_run:
        if temp_classlist.exists():
            temp_classlist.unlink()
        cmd_display = " ".join(f'"{c}"' if " " in c or os.pathsep in c else c for c in cmd)
        return True, f"[DRY-RUN] คำสั่งจำลอง:\n    {cmd_display}", []

    # 3. รัน subprocess
    start_time = time.time()
    try:
        process = subprocess.Popen(
            cmd,
            cwd=str(exec_out_dir),
            stdout=subprocess.PIPE,
            stderr=subprocess.PIPE,
            text=True,
            encoding="utf-8",
            errors="replace"
        )
        stdout, stderr = process.communicate()
    except Exception as e:
        if temp_classlist.exists():
            temp_classlist.unlink()
        return False, f"เกิดข้อผิดพลาดในการเรียก Java: {e}", []

    elapsed = time.time() - start_time

    if temp_classlist.exists():
        temp_classlist.unlink()

    # หากใช้ Staging: คัดลอกไฟล์ Test ทั้งหมดที่สร้างได้กลับมาที่ output_dir จริง
    if has_spaces and exec_out_dir != output_dir:
        for tf in exec_out_dir.glob("**/*Test*.java"):
            rel_path = tf.relative_to(exec_out_dir)
            target_file = output_dir / rel_path
            target_file.parent.mkdir(parents=True, exist_ok=True)
            shutil.copy2(str(tf), str(target_file))

    # 4. ตรวจสอบผลลัพธ์
    generated_files = list(output_dir.glob("**/*Test*.java"))
    rel_gen_files = [str(f.relative_to(output_dir)) for f in generated_files]

    if process.returncode == 0:
        msg = f"สำเร็จ (ใช้เวลา {elapsed:.1f}s, พบไฟล์ Test: {len(generated_files)} ไฟล์)"
        return True, msg, rel_gen_files
    else:
        err_snippet = (stderr.strip() or stdout.strip() or "Unknown error")
        lines = err_snippet.splitlines()
        short_err = "\n".join(lines[:5]) if len(lines) > 5 else err_snippet
        return False, f"Randoop ออกจากระบบด้วยรหัส {process.returncode}\n{short_err}", rel_gen_files


# ==============================================================================
# Status Report Function
# ==============================================================================

def print_status_report(
    memory_manager: MemoryStateManager,
    all_projects: List[Dict],
    randoop_jar: Optional[Path],
    workspace_dir: Path
):
    """
    แสดงรายงานสถานะปัจจุบันของ Randoop Test Generation
    """
    total_proj = len(all_projects)
    completed_count = 0
    failed_count = 0
    pending_count = 0

    print("\n" + "=" * 80)
    print("📊 รายงานสถานะ Randoop Test Generation (Feedback-Directed Random Testing)")
    print("=" * 80)
    print(f"📦 โฟลเดอร์โปรเจกต์ทั้งหมด: {total_proj} รายการ")
    print(f"⚙️ Randoop JAR: {randoop_jar if randoop_jar else '❌ ไม่พบไฟล์'}")
    print(f"🧠 Memory State: {memory_manager.state_file_path}")
    print("-" * 80)

    for p in all_projects:
        pname = p["project_name"]
        rec = memory_manager.state_data.get(pname)
        if rec:
            status = rec.get("status", "UNKNOWN")
            if status == "COMPLETED":
                completed_count += 1
                tests_count = len(rec.get("generated_tests", []))
                print(f"  ✅ [COMPLETED] {pname:<20} | {len(p['class_infos'])} คลาส | {tests_count} ไฟล์ Test")
            elif status == "FAILED":
                failed_count += 1
                err = rec.get("error", "")[:40]
                print(f"  ❌ [FAILED]    {pname:<20} | {len(p['class_infos'])} คลาส | ข้อผิดพลาด: {err}")
            else:
                pending_count += 1
                print(f"  ⏳ [PENDING]   {pname:<20} | {len(p['class_infos'])} คลาส")
        else:
            pending_count += 1
            print(f"  ⏳ [PENDING]   {pname:<20} | {len(p['class_infos'])} คลาส")

    print("-" * 80)
    print(f"📈 สรุปผล: สำเร็จแล้ว: {completed_count} | ผิดพลาด: {failed_count} | คงเหลือ: {pending_count} / {total_proj}")
    print("=" * 80 + "\n")


# ==============================================================================
# Main CLI Entry Point
# ==============================================================================

def main():
    workspace_dir = Path(__file__).resolve().parent.parent

    parser = argparse.ArgumentParser(
        description="สคริปต์สร้าง JUnit Test อัตโนมัติด้วย Randoop (Feedback-Directed Random Testing)",
        formatter_class=argparse.RawDescriptionHelpFormatter,
        epilog="""
ตัวอย่างการใช้งาน (Examples):
  1. ทดสอบจำลองคำสั่งก่อนรันจริง 5 โฟลเดอร์แรก:
     python script/generate_randoop_tests.py --dry-run -n 5

  2. รันเฉพาะโปรเจกต์ Codec_1 ด้วยเวลา 60 วินาที:
     python script/generate_randoop_tests.py --project Codec_1 --time-limit 60

  3. รันโดยระบุตำแหน่งโฟลเดอร์ classes เอง:
     python script/generate_randoop_tests.py --project Codec_1 --classes-dir data/Codec1buggy/target/classes

  4. ดูสถานะความคืบหน้าของงานทั้งหมด:
     python script/generate_randoop_tests.py --status

  5. บังคับสร้างใหม่ทั้งหมด (Overwrite):
     python script/generate_randoop_tests.py --project Codec_1 --overwrite
        """
    )

    parser.add_argument("--project", "-p", help="ระบุโปรเจกต์เฉพาะที่ต้องการรัน (เช่น Codec_1 หรือ Chart_1)")
    parser.add_argument("--time-limit", "-t", type=int, default=60, help="ระยะเวลาสร้างเทสต์ต่อโปรเจกต์ (วินาที, ค่าเริ่มต้น: 60)")
    parser.add_argument("--classes-dir", "-cp", help="ตำแหน่งโฟลเดอร์ compiled .class (เช่น target/classes หรือ build/classes)")
    parser.add_argument("--randoop-jar", help="พาธไฟล์ randoop-all-4.3.4.jar (หากไม่ระบุจะค้นหาอัตโนมัติ)")
    parser.add_argument("--output-dir", help="โฟลเดอร์ปลายทางสำหรับจัดเก็บ Test Code")
    parser.add_argument("--resource-dir", help="โฟลเดอร์ต้นทางที่เก็บ Source Code (ค่าเริ่มต้น: Resoucre)")
    parser.add_argument("--state-file", help="พาธไฟล์บันทึก Memory State (ค่าเริ่มต้น: Feedback-Directed Random Test Generation/generation_state.json)")
    parser.add_argument("--overwrite", action="store_true", help="บังคับสร้างเทสต์ใหม่ แม้เคยทำเสร็จแล้ว")
    parser.add_argument("--status", action="store_true", help="แสดงรายงานสถานะความคืบหน้าปัจจุบันแล้วหยุดทำงาน")
    parser.add_argument("--reset-state", action="store_true", help="ล้างข้อมูล Memory State ทั้งหมดเริ่มต้นใหม่")
    parser.add_argument("--dry-run", action="store_true", help="โหมดจำลอง: แสดงคำสั่งที่จะถูกเรียกโดยไม่รัน Java จริง")
    parser.add_argument("--limit", "-n", type=int, help="จำกัดจำนวนโปรเจกต์ที่จะประมวลผลในรอบนี้")
    parser.add_argument("--tests-per-file", type=int, default=500, help="จำนวนเทสต์สูงสุดต่อ 1 ไฟล์ JUnit (ค่าเริ่มต้น: 500)")
    parser.add_argument("--jvm-memory", default="3000m", help="ขนาดหน่วยความจำ JVM สูงสุด เช่น 3000m หรือ 4g (ค่าเริ่มต้น: 3000m)")
    parser.add_argument("--sort-by-size", dest="sort_by_size", action="store_true", default=True, help="จัดคิวทำโปรเจกต์ขนาดเล็กก่อน (Smallest first, เปิดเป็นค่าเริ่มต้น)")
    parser.add_argument("--no-sort-by-size", dest="sort_by_size", action="store_false", help="ปิดการจัดเรียงตามขนาด (ใช้ลำดับชื่อโฟลเดอร์เดิม)")
    parser.add_argument("--no-auto-compile", action="store_true", help="ปิดระบบคอมไพล์ .class อัตโนมัติ (fast javac / defects4j)")
    parser.add_argument("--skip-missing", action="store_true", help="ข้ามโปรเจกต์ที่ไม่พบ .class อัตโนมัติโดยไม่บันทึกล้มเหลว")

    args = parser.parse_args()

    # 1. กำหนดค่าเส้นทางโฟลเดอร์
    resource_dir = Path(args.resource_dir) if args.resource_dir else (workspace_dir / "Resoucre")
    
    if args.output_dir:
        test_code_base = Path(args.output_dir)
    else:
        test_code_base = workspace_dir / "Feedback-Directed Random Test Generation" / "TestCode"

    if args.state_file:
        state_file = Path(args.state_file)
    else:
        state_file = workspace_dir / "Feedback-Directed Random Test Generation" / "generation_state.json"

    # 2. ค้นหา Randoop JAR
    randoop_jar = find_randoop_jar(args.randoop_jar, workspace_dir)

    print("=" * 80)
    print("🚀 Randoop JUnit Test Generator (Feedback-Directed Random Testing)")
    print("=" * 80)
    print(f"📂 Workspace:    {workspace_dir}")
    print(f"📂 Resource Dir: {resource_dir}")
    print(f"📂 Output Base:  {test_code_base}")
    print(f"🧠 State File:   {state_file}")
    print(f"⏱️ Time Limit:   {args.time_limit} วินาที / โปรเจกต์")
    print(f"📦 Randoop JAR:  {randoop_jar if randoop_jar else '❌ ไม่พบไฟล์ JAR'}")
    print("=" * 80)

    # โหลด Memory State
    memory_manager = MemoryStateManager(state_file)

    if args.reset_state:
        memory_manager.reset()
        print("🔄 ล้างข้อมูลสถานะ Memory State เรียบร้อยแล้ว")

    # สแกนโฟลเดอร์โปรเจกต์
    all_projects = scan_resource_projects(resource_dir, args.project)

    if not all_projects:
        print("⚠️ ไม่พบโฟลเดอร์โปรเจกต์ที่ต้องประมวลผล")
        sys.exit(0)

    # ตรวจสอบ Pre-run Sync กับไฟล์ที่มีอยู่บนดิสก์
    sync_existing_tests_to_memory(memory_manager, test_code_base, [p["project_name"] for p in all_projects])

    # หากต้องการดู Status อย่างเดียว
    if args.status:
        print_status_report(memory_manager, all_projects, randoop_jar, workspace_dir)
        sys.exit(0)

    # ตรวจสอบ Randoop JAR ก่อนรันจริง
    if not randoop_jar and not args.dry_run:
        print("\n❌ Error: ไม่พบไฟล์ randoop-all-4.3.4.jar ในระบบ!")
        print("💡 กรุณาวางไฟล์ที่ 'C:\\randoop\\randoop-all-4.3.4.jar'")
        print("   หรือ 'Feedback-Directed Random Test Generation/Configuration/randoop-all-4.3.4.jar'")
        print("   หรือระบุผ่านพารามิเตอร์: --randoop-jar <path_to_jar>\n")
        sys.exit(1)

    # จัดเรียงลำดับการทำงาน (Smallest First หรือตามลำดับโฟลเดอร์)
    if args.sort_by_size:
        all_projects.sort(key=lambda x: (x["total_bytes"], len(x["class_infos"])))
        print("⚡ [PRIORITY] จัดลำดับประมวลผล: เริ่มต้นจากโปรเจกต์ขนาดเล็กไปใหญ่ (Smallest first)")

    # ตัดขอบเขตตาม --limit
    if args.limit and args.limit > 0:
        all_projects = all_projects[:args.limit]
        print(f"🎯 [LIMIT] จำกัดการทำงานเฉพาะ {len(all_projects)} โปรเจกต์แรก")

    print(f"\n📋 เตรียมประมวลผลทั้งหมด: {len(all_projects)} โปรเจกต์")
    print("-" * 80)

    success_count = 0
    skipped_count = 0
    failed_count = 0

    for idx, proj in enumerate(all_projects, start=1):
        pname = proj["project_name"]
        class_count = len(proj["class_infos"])
        dest_folder = test_code_base / f"{pname}_buggy"

        print(f"\n[{idx}/{len(all_projects)}] 📦 Project: {pname} ({class_count} คลาส, {proj['total_bytes']:,} ไบต์)")

        # ตรวจสอบสถานะเดิม
        if not args.overwrite and memory_manager.is_completed(pname):
            print(f"  ⏭️ [MEMORY: SKIP] ข้าม: โปรเจกต์นี้สร้าง Test สำเร็จแล้วใน Memory")
            print(f"     (หากต้องการสร้างใหม่ให้ระบุ --overwrite)")
            skipped_count += 1
            continue

        # ค้นหา Classes Directory (พร้อม Auto-Compile หากยังไม่มี .class)
        classes_dir = resolve_project_classes_dir(
            project_folder=pname,
            workspace_dir=workspace_dir,
            custom_classes_dir=args.classes_dir,
            project_info=proj,
            auto_compile=not args.no_auto_compile
        )

        if not classes_dir:
            if args.dry_run:
                classes_dir = Path("target/classes")
            elif args.skip_missing:
                print(f"  ⏭️ [SKIP MISSING] ข้าม: ไม่พบ .class และไม่สามารถคอมไพล์ {pname} ได้")
                skipped_count += 1
                continue
            else:
                print(f"  ⚠️ [MISSING CLASSES] ไม่พบโฟลเดอร์ compiled .class สำหรับ {pname}")
                print(f"     💡 กำหนดพาธผ่าน --classes-dir หรือรัน 'defects4j compile' ในโฟลเดอร์ data/{pname.replace('_', '')}buggy")
                memory_manager.record_failed(pname, "Missing compiled classes directory", proj["fqcns"])
                failed_count += 1
                continue

        print(f"  🏷️ Package: {proj['primary_package'] or '(default)'}")
        print(f"  📂 Target Classes: {classes_dir}")
        print(f"  📁 Output Dir:     {dest_folder}")

        # รัน Randoop
        success, msg, gen_files = run_randoop_for_project(
            project_info=proj,
            randoop_jar=randoop_jar,
            classes_dir=classes_dir,
            output_dir=dest_folder,
            time_limit=args.time_limit,
            tests_per_file=args.tests_per_file,
            jvm_max_memory=args.jvm_memory,
            workspace_dir=workspace_dir,
            dry_run=args.dry_run
        )

        if success:
            if args.dry_run:
                print(f"  {msg}")
                success_count += 1
            else:
                print(f"  ✨ {msg}")
                if gen_files:
                    for gf in gen_files[:3]:
                        print(f"     📄 {gf}")
                    if len(gen_files) > 3:
                        print(f"     ...และอีก {len(gen_files)-3} ไฟล์")
                memory_manager.record_completed(pname, {
                    "output_dir": str(dest_folder),
                    "classes_dir": str(classes_dir),
                    "classes_tested": proj["fqcns"],
                    "generated_tests": gen_files,
                    "time_limit": args.time_limit
                })
                success_count += 1
        else:
            print(f"  ❌ ล้มเหลว: {msg}")
            if not args.dry_run:
                memory_manager.record_failed(pname, msg, proj["fqcns"])
            failed_count += 1

    # สรุปผลลัพธ์
    print("\n" + "=" * 80)
    print("📊 สรุปผลการประมวลผล Randoop (Summary Report)")
    print("=" * 80)
    print(f"• ทั้งหมด (Total):     {len(all_projects)}")
    print(f"• สำเร็จ (Success):   {success_count}")
    print(f"• ข้ามไป (Skipped):   {skipped_count}")
    print(f"• ล้มเหลว (Failed):    {failed_count}")
    print(f"📄 Memory State บันทึกไว้ที่: {state_file}")
    print("=" * 80)
    print("✨ เสร็จสิ้นกระบวนการ!")


if __name__ == "__main__":
    main()
