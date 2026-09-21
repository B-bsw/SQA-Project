#!/usr/bin/env python3
# -*- coding: utf-8 -*-

"""
generate_deepseek_tests.py
--------------------------
Pipeline สำหรับสร้าง JUnit Test Suite อัตโนมัติด้วยโมเดล deepseek-v4-flash
ผ่าน KKU IntelSphere API (https://gen.ai.kku.ac.th/api/v1/chat/completions)

คุณสมบัติสำคัญและการแก้ไขข้อจำกัดจากเวอร์ชันก่อนหน้า:
1. การจัดการโฟลเดอร์ผลลัพธ์: บันทึกลง Deepseek-flash-v4/TestCode/<Project>_buggy/
   โดยใช้ชื่อโปรเจกต์จริง (เช่น Closure_28_buggy, Chart_1_buggy) ไม่เติม _1 ซ้ำซ้อน
2. แยก SSE Reasoning Content: รองรับ Server-Sent Events (SSE) โดยแยก delta.content
   ออกจาก delta.reasoning / delta.reasoning_content อย่างเด็ดขาด และบันทึกเฉพาะ content
   ลงในไฟล์ Java
3. การวิเคราะห์ Usage และ Reasoning Tokens: บันทึก finish_reason, prompt_tokens,
   completion_tokens, total_tokens, content_char_count, reasoning_char_count
   เพื่อวิเคราะห์และอธิบายกรณีที่ completion tokens มีจำนวนมากกว่าตัวอักษรของโค้ดที่มองเห็น
4. Atomic File & State Writes: ทั้งไฟล์ .java และ generation_state.json จะถูกเขียนลงไฟล์
   ชั่วคราว (.tmp) ก่อนทำการ atomic rename/replace เพื่อป้องกันไฟล์เสียหายกรณีถูกขัดจังหวะ
5. การป้องกันไฟล์สมบูรณ์เดิม & Truncation Retry: หากได้ finish_reason=length หรือโค้ดไม่สมบูรณ์
   จะไม่บันทึกสถานะเป็น GENERATED/COMPLETED และจะไม่เขียนทับไฟล์เดิมที่สมบูรณ์อยู่แล้ว
   พร้อมทั้งทำการ retry ด้วยการย่อโค้ด (compact) และกำชับคำสั่งให้กระชับ
6. การแยกสถานะ GENERATED vs VERIFIED: ตรวจสอบความถูกต้องเบื้องต้น (structural validation)
   เพื่อระบุสถานะ GENERATED เท่านั้น สถานะ VERIFIED จะสงวนไว้สำหรับการคอมไพล์และรันเทสต์ผ่านจริง
7. โควต้าและการจำกัด Token:
   - เพดานโควต้าเซิร์ฟเวอร์ตั้งต้น 4,000,000 tokens/วัน (อัปเดตจาก model_quota ของ API แบบเรียลไทม์)
   - งบประมาณภายในเครื่อง (DailyBudget) ตั้งต้น 3,200,000 tokens/วัน เพื่อเผื่อ retry และความคลาดเคลื่อน
   - กำหนด --max-tokens ได้อย่างอิสระ ไม่ฟิกซ์ 8,192
   - ตัวเลือก --skip-limits ข้ามไฟล์ที่เคยติดลิมิต และ --no-budget ปิดการคุมงบภายใน
8. การจัดการ Rate Limit (HTTP 429): สลับคีย์ทันทีและพักการใช้งานตาม Retry-After header
9. ความปลอดภัย: ปิดบัง API Key ทั้งหมดใน Log, Console และ State File
10. ความปลอดภัยในโหมดตรวจสอบ: --dry-run, --plan และ --status จะไม่เรียก API และปฏิเสธการใช้ร่วมกับ --check-quota
11. การตรวจหา JUnit Version แบบ Dynamic: ตรวจสอบจาก pom.xml / build.xml ของ Defects4J
"""

import os
import sys
import re
import time
import json
import argparse
import threading
from datetime import datetime
from pathlib import Path

# ปรับปรุงการแสดงผล UTF-8 บน Windows Console
if hasattr(sys.stdout, 'reconfigure'):
    try:
        sys.stdout.reconfigure(encoding='utf-8', errors='replace')
    except Exception:
        pass
if hasattr(sys.stderr, 'reconfigure'):
    try:
        sys.stderr.reconfigure(encoding='utf-8', errors='replace')
    except Exception:
        pass

try:
    import requests
except ImportError:
    print("Error: ไม่พบโมดูล 'requests' กรุณาติดตั้งด้วยคำสั่ง: pip install requests")
    sys.exit(1)


# ==============================================================================
# 1. การจัดการสภาพแวดล้อมและ API Keys
# ==============================================================================
def load_env_file(env_path: Path) -> dict:
    """อ่านไฟล์ .env และแปลงเป็น key-value dictionary"""
    env_vars = {}
    if not env_path or not env_path.is_file():
        return env_vars

    with open(env_path, "r", encoding="utf-8", errors="replace") as f:
        for line in f:
            line = line.strip()
            if not line or line.startswith("#"):
                continue
            if "=" in line:
                k, v = line.split("=", 1)
                env_vars[k.strip()] = v.strip().strip("'\"")
    return env_vars


def mask_key(key: str) -> str:
    """ปิดบัง API Key เพื่อความปลอดภัย ห้ามแสดงหรือบันทึกคีย์เต็ม"""
    if not key:
        return ""
    k = key.strip()
    if len(k) <= 10:
        return k[:2] + "..." + k[-2:]
    return f"{k[:6]}...{k[-4:]}"


def get_all_api_keys(cli_keys: list = None, env_file_arg: str = None) -> list:
    """
    รวบรวม API Key จากทุกแหล่ง:
    1. CLI Argument (--api-key / -k)
    2. ไฟล์ .env (API_KEY, API_KEY2, DEEPSEEK_API_KEY, KKU_API_KEY, API_KEYS)
    3. ตัวแปรสภาพแวดล้อมระบบ (OS Environment Variables)
    """
    keys = []

    # 1. จาก CLI Arguments
    if cli_keys:
        for item in cli_keys:
            if "," in item:
                keys.extend([k.strip() for k in item.split(",") if k.strip()])
            elif item.strip():
                keys.append(item.strip())

    # 2. จากไฟล์ .env
    workspace_dir = Path(__file__).resolve().parent.parent
    env_path = Path(env_file_arg) if env_file_arg else (workspace_dir / ".env")
    if env_path.is_file():
        env_vars = load_env_file(env_path)
        comma_keys = ["API_KEYS", "DEEPSEEK_API_KEYS", "KKU_API_KEYS"]
        for ck in comma_keys:
            if ck in env_vars and env_vars[ck]:
                keys.extend([k.strip() for k in env_vars[ck].split(",") if k.strip()])

        key_patterns = [
            r"^API_KEY\d*$",
            r"^DEEPSEEK_API_KEY\d*$",
            r"^KKU_API_KEY\d*$",
            r"^CLAUDE_API_KEY\d*$"
        ]
        for k_name, k_val in env_vars.items():
            if any(re.match(pat, k_name, re.IGNORECASE) for pat in key_patterns) and k_val:
                if "," in k_val:
                    keys.extend([x.strip() for x in k_val.split(",") if x.strip()])
                else:
                    keys.append(k_val.strip())

    # 3. จาก System Environment Variables
    env_sys_patterns = [
        "DEEPSEEK_API_KEY", "KKU_API_KEY", "API_KEY",
        "DEEPSEEK_API_KEYS", "API_KEYS"
    ]
    for env_k in env_sys_patterns:
        val = os.environ.get(env_k)
        if val:
            if "," in val:
                keys.extend([x.strip() for x in val.split(",") if x.strip()])
            else:
                keys.append(val.strip())

    # กรองคีย์ซ้ำและค่าว่าง
    seen = set()
    unique_keys = []
    for k in keys:
        if k and k not in seen:
            seen.add(k)
            unique_keys.append(k)

    return unique_keys


# ==============================================================================
# 2. คลาสควบคุมงบประมาณภายในเครื่อง (DailyBudget)
# ==============================================================================
class DailyBudget:
    """
    ควบคุมงบประมาณ token ภายในเครื่อง (Client-side Ledger)
    - ค่าเริ่มต้น: 3,200,000 tokens/วัน (เผื่อ buffer 20% จากโควต้าเซิร์ฟเวอร์ 4,000,000)
    - แยกบัญชีงบประมาณภายในออกจาก server quota ชัดเจน
    """
    def __init__(self, ledger_path: Path, daily_limit: int = 3200000):
        self.path = Path(ledger_path)
        self.limit = daily_limit
        self.data = self._load()

    def _load(self) -> dict:
        if self.path.is_file():
            try:
                with open(self.path, "r", encoding="utf-8") as f:
                    return json.load(f)
            except Exception:
                return {}
        return {}

    def _save(self):
        self.path.parent.mkdir(parents=True, exist_ok=True)
        temp_file = self.path.with_name(f".{self.path.name}.tmp_{int(time.time()*1000)}")
        try:
            with open(temp_file, "w", encoding="utf-8") as f:
                json.dump(self.data, f, ensure_ascii=False, indent=2)
                f.flush()
                os.fsync(f.fileno())
            temp_file.replace(self.path)
        except Exception as e:
            if temp_file.exists():
                try:
                    temp_file.unlink()
                except Exception:
                    pass
            raise RuntimeError(f"Cannot save daily budget ledger: {self.path}") from e

    def get_today_str(self) -> str:
        return datetime.now().date().isoformat()

    def get_today_used(self) -> int:
        return self.data.get(self.get_today_str(), 0)

    def get_today_remaining(self) -> int:
        return max(0, self.limit - self.get_today_used())

    def reserve(self, messages: list, max_tokens: int):
        day = self.get_today_str()
        input_estimate = sum(len(m.get("content", "").encode("utf-8")) for m in messages) + 256
        estimated_amount = max_tokens + input_estimate
        used = self.data.get(day, 0)
        if used + estimated_amount > self.limit:
            return None
        self.data[day] = used + estimated_amount
        self._save()
        return day, estimated_amount

    def settle(self, reservation, usage: dict):
        if not reservation or not isinstance(usage, dict):
            return
        day, reserved_amount = reservation
        total_tokens = usage.get("total_tokens")
        if total_tokens is None and "prompt_tokens" in usage and "completion_tokens" in usage:
            total_tokens = usage["prompt_tokens"] + usage["completion_tokens"]

        if isinstance(total_tokens, int) and total_tokens > 0:
            diff = total_tokens - reserved_amount
            self.data[day] = max(0, self.data.get(day, 0) + diff)
            self._save()


# ==============================================================================
# 3. คลาสบริหารจัดการ API Keys (KeyManager)
# ==============================================================================
class KeyManager:
    """
    คลาสบริหารจัดการ API Keys:
    - Round-robin rotation สำหรับกระจายโหลด
    - ตรวจจับ 429 rate limit หรือ 401 daily quota exceeded
    - จัดการเวลาพักคีย์ตาม Retry-After header
    - บันทึกและแสดงผลยอดโควต้าเซิร์ฟเวอร์จริง (model_quota)
    - ปิดบังคีย์เสมอ ไม่เปิดเผยคีย์เต็ม
    """
    DEFAULT_SERVER_QUOTA = 4000000

    def __init__(self, keys: list, budget: DailyBudget = None):
        self.keys = list(keys)
        self.current_idx = 0
        self.exhausted_keys = set()
        self.rate_limited_keys = {}  # key -> available_after_timestamp
        self.key_quota = {}  # key -> dict จาก model_quota
        self.budget = budget

    @property
    def total_count(self) -> int:
        return len(self.keys)

    def get_active_keys(self) -> list:
        now = time.time()
        active = []
        for k in self.keys:
            if k in self.exhausted_keys:
                continue
            if k in self.rate_limited_keys:
                if now < self.rate_limited_keys[k]:
                    continue
                else:
                    del self.rate_limited_keys[k]
            active.append(k)
        return active

    def get_current_key(self) -> str:
        active = self.get_active_keys()
        if not active:
            return None
        return active[self.current_idx % len(active)]

    def rotate(self):
        active = self.get_active_keys()
        if len(active) > 1:
            self.current_idx = (self.current_idx + 1) % len(active)

    def update_quota_info(self, key: str, quota_info: dict):
        if not key or not quota_info:
            return
        self.key_quota[key] = quota_info
        rem = quota_info.get("daily_remaining_tokens")
        if rem is not None and rem <= 500:
            self.mark_exhausted(key, reason=f"โควต้าเซิร์ฟเวอร์คงเหลือต่ำ ({rem:,} tokens)")

    def mark_rate_limited(self, key: str, duration_sec: int = 30):
        self.rate_limited_keys[key] = time.time() + duration_sec
        masked = mask_key(key)
        print(f"  ⏳ [RATE LIMITED] คีย์ ({masked}) ติด Rate Limit ชั่วคราว พักการใช้งาน {duration_sec} วินาที")
        self.rotate()

    def mark_exhausted(self, key: str, reason: str = ""):
        if key not in self.exhausted_keys:
            self.exhausted_keys.add(key)
            masked = mask_key(key)
            idx = self.keys.index(key) + 1
            print(f"\n  🛑 [KEY EXHAUSTED] คีย์ #{idx} ({masked}) โควต้าหมด: {reason}")
            active = self.get_active_keys()
            if active:
                print(f"  🔄 สลับไปใช้คีย์สำรองถัดไปทันที (เหลือพร้อมใช้งาน {len(active)}/{self.total_count} คีย์)")
                self.current_idx = self.current_idx % len(active)
            else:
                print(f"  ❌ คีย์ทั้งหมด ({self.total_count} คีย์) โควต้าหมดหรือถูกระงับแล้ว!")

    def has_active_keys(self) -> bool:
        return len(self.get_active_keys()) > 0


# ==============================================================================
# 4. การจัดการ State และการบันทึกไฟล์แบบ Atomic
# ==============================================================================
def save_atomic_text(target_path: Path, content: str):
    """บันทึกไฟล์ข้อความแบบ Atomic Write โดยเขียนลง .tmp ก่อนแล้ว replace"""
    target_path = Path(target_path)
    target_path.parent.mkdir(parents=True, exist_ok=True)
    temp_path = target_path.with_name(f".{target_path.name}.tmp_{int(time.time()*1000)}")
    try:
        with open(temp_path, "w", encoding="utf-8") as f:
            f.write(content)
            f.flush()
            os.fsync(f.fileno())
        temp_path.replace(target_path)
    except Exception as e:
        if temp_path.exists():
            try:
                temp_path.unlink()
            except Exception:
                pass
        raise RuntimeError(f"Cannot atomic write file: {target_path}") from e


def save_atomic_json(target_path: Path, data: dict):
    """บันทึกไฟล์ JSON แบบ Atomic Write"""
    target_path = Path(target_path)
    target_path.parent.mkdir(parents=True, exist_ok=True)
    temp_path = target_path.with_name(f".{target_path.name}.tmp_{int(time.time()*1000)}")
    try:
        with open(temp_path, "w", encoding="utf-8") as f:
            json.dump(data, f, ensure_ascii=False, indent=2)
            f.flush()
            os.fsync(f.fileno())
        temp_path.replace(target_path)
    except Exception as e:
        if temp_path.exists():
            try:
                temp_path.unlink()
            except Exception:
                pass
        raise RuntimeError(f"Cannot atomic write JSON: {target_path}") from e


def load_state(state_file_path: Path, read_only: bool = False) -> dict:
    """โหลดประวัติการทำงานจาก generation_state.json"""
    state_file_path = Path(state_file_path)
    if state_file_path.is_file():
        try:
            with open(state_file_path, "r", encoding="utf-8", errors="replace") as f:
                data = json.load(f)
            changed = False
            for k, v in data.items():
                if isinstance(v, dict):
                    if v.get("finish_reason") == "length" and v.get("status") in ("COMPLETED", "GENERATED"):
                        v["status"] = "LIMIT_REACHED"
                        changed = True
            if changed and not read_only:
                save_atomic_json(state_file_path, data)
            return data
        except Exception as e:
            raise RuntimeError(f"Failed to read state file {state_file_path}: {e}") from e
    return {}


# ==============================================================================
# 5. การตรวจสอบความสมบูรณ์ของโค้ด Java และการตัดทอน (Compaction)
# ==============================================================================
def compact_java_source(source_code: str) -> str:
    """
    ลดขนาด Java Source Code สำหรับส่งเข้าโมเดล
    ตัด Comments (// และ /* */) ที่ไม่จำเป็นออก โดยคง string literals ไว้อย่างปลอดภัย 100%
    """
    def replacer(match):
        s = match.group(0)
        if s.startswith('/'):
            return " "
        return s

    pattern = re.compile(
        r'//.*?$|/\*.*?\*/|"(?:\\.|[^\\"])*"|\'(?:\\.|[^\\\'])*\'',
        re.DOTALL | re.MULTILINE
    )
    code = re.sub(pattern, replacer, source_code)
    lines = [line.rstrip() for line in code.splitlines() if line.strip()]
    return '\n'.join(lines)


def is_valid_complete_java_test(code_content_or_path) -> bool:
    """
    ตรวจสอบโครงสร้างโค้ด Java เบื้องต้น (Sanity Check):
    - ไม่เป็นค่าว่าง และขนาดตัวอักษรสมเหตุสมผล (> 100 chars)
    - ปิดท้ายด้วยปีกกาปิด '}'
    - ปีกกาเปิด '{' และ ปีกกาปิด '}' ต้องสมดุลกัน (depth ไม่ติดลบ และ depth รวมเป็น 0)
    - มีการประกาศคลาส (class <Name>)
    - มี Annotation @Test หรือ method test

    หมายเหตุสำคัญ: การผ่านฟังก์ชันนี้ หมายถึงสถานะ GENERATED เท่านั้น
    สถานะ VERIFIED ต้องผ่านการ compile และ run test บน Defect4J จริง
    """
    if not code_content_or_path:
        return False

    if isinstance(code_content_or_path, (Path, str)) and os.path.exists(str(code_content_or_path)):
        try:
            with open(str(code_content_or_path), "r", encoding="utf-8", errors="replace") as f:
                code = f.read().strip()
        except Exception:
            return False
    else:
        code = str(code_content_or_path).strip()

    if len(code) < 100:
        return False

    cleaned = compact_java_source(code)
    if not cleaned.endswith("}"):
        return False

    code_no_strings = re.sub(r'"(?:\\.|[^"\\])*"|\'(?:\\.|[^\'\\])*\'', '""', cleaned)
    if not re.search(r'\bclass\s+\w+', code_no_strings):
        return False

    has_test = bool(re.search(r'@(?:org\.junit\.(?:jupiter\.api\.)?)?Test\b|\bvoid\s+test\w*\s*\(', code_no_strings))
    if not has_test:
        return False

    depth = 0
    for char in code_no_strings:
        if char == '{':
            depth += 1
        elif char == '}':
            depth -= 1
            if depth < 0:
                return False
    return depth == 0


def extract_java_code(response_text: str) -> str:
    """สกัดเฉพาะโค้ด Java จากคำตอบ ไม่ให้มี markdown fences หรือข้อความบทนำ"""
    text = response_text.strip()
    pattern = r"```(?:java|Java)?\s*([\s\S]*?)\s*```"
    code_blocks = re.findall(pattern, text)

    if code_blocks:
        for block in code_blocks:
            if re.search(r'\bclass\s+\w*Test\w*', block) or "@Test" in block:
                return block.strip()
        return max(code_blocks, key=len).strip()

    return text


def get_test_class_name(source_filename: str, java_code: str) -> str:
    """ดึงชื่อ Class ของ Test เพื่อนำมาตั้งชื่อไฟล์ .java"""
    match = re.search(r'\bpublic\s+(?:(?:final|abstract)\s+)*class\s+(\w+)', java_code)
    if match:
        return f"{match.group(1)}.java"
    match = re.search(r'\bclass\s+(\w*Test\w*)', java_code)
    if match:
        return f"{match.group(1)}.java"
    base_name = Path(source_filename).stem
    return f"{base_name}Test.java"


# ==============================================================================
# 6. การตรวจหา JUnit Version แบบ Dynamic และการสร้าง Prompt
# ==============================================================================
def detect_junit_version(project_name: str, workspace_root: Path = None, preferred: str = "auto") -> str:
    """
    ตรวจสอบเวอร์ชัน JUnit ที่เหมาะสมจาก Build configuration จริง:
    1. หาก preferred ระบุ 'junit4' หรือ 'junit5' ให้ใช้ตามที่ระบุ
    2. ตรวจสอบ pom.xml / build.xml ใน data/<Project>buggy หรือ data/<Project>1buggy
    3. ตรวจสอบ dependencies / imports ใน test code หรือ source code ที่มีอยู่
    4. ค่าเริ่มต้นสำหรับ Defects4J คือ 'junit4'
    """
    if preferred in ("junit4", "4", "JUnit4"):
        return "junit4"
    if preferred in ("junit5", "5", "JUnit5"):
        return "junit5"

    if not workspace_root:
        workspace_root = Path(__file__).resolve().parent.parent

    data_dir = workspace_root / "data"
    prefix = project_name.split("_")[0] if "_" in project_name else project_name
    candidate_dirs = [
        data_dir / f"{project_name}buggy",
        data_dir / f"{prefix}1buggy",
        data_dir / f"{prefix}buggy",
        data_dir / f"{project_name}fixed",
        data_dir / f"{prefix}1fixed"
    ]

    for c_dir in candidate_dirs:
        if not c_dir.is_dir():
            continue
        # ตรวจสอบ pom.xml / maven files
        for pom in c_dir.glob("*pom*.xml"):
            try:
                content = pom.read_text(encoding="utf-8", errors="replace")
                if "junit-jupiter" in content or "org.junit.jupiter" in content:
                    return "junit5"
                if "junit" in content:
                    return "junit4"
            except Exception:
                pass
        # ตรวจสอบ build.xml / ant
        for build_xml in c_dir.glob("*build*.xml"):
            try:
                content = build_xml.read_text(encoding="utf-8", errors="replace")
                if "junit-jupiter" in content or "junit5" in content:
                    return "junit5"
                if "junit" in content:
                    return "junit4"
            except Exception:
                pass
        # ตรวจสอบ test sources เดิมถ้ามี
        test_dir = c_dir / "src" / "test"
        if test_dir.is_dir():
            for t_file in list(test_dir.rglob("*.java"))[:10]:
                try:
                    tc = t_file.read_text(encoding="utf-8", errors="replace")
                    if "org.junit.jupiter" in tc:
                        return "junit5"
                    if "org.junit." in tc or "junit.framework." in tc:
                        return "junit4"
                except Exception:
                    pass

    # ตรวจสอบไฟล์ใน Resoucre/<project_name>
    res_proj = workspace_root / "Resoucre" / project_name
    if res_proj.is_dir():
        for jf in list(res_proj.rglob("*.java"))[:5]:
            try:
                jc = jf.read_text(encoding="utf-8", errors="replace")
                if "org.junit.jupiter" in jc:
                    return "junit5"
            except Exception:
                pass

    return "junit4"


def build_prompt(template: str, source_code: str, dependencies: str = "", junit_version: str = "junit4") -> str:
    """แทนที่ source code และ dependency requirements ลงใน Prompt Template"""
    prompt = template

    if junit_version == "junit5":
        framework_spec = (
            "- โปรเจกต์นี้ใช้ **JUnit 5 (Jupiter)**\n"
            "- ใช้ imports: `org.junit.jupiter.api.Test`, `org.junit.jupiter.api.Assertions.*`, `@BeforeEach`, `@AfterEach`\n"
            "- ใช้ `assertThrows(...)` สำหรับ Exception tests\n"
            "- ❌ ห้าม import `org.junit.Test` หรือ `junit.framework.*`"
        )
    else:
        framework_spec = (
            "- โปรเจกต์นี้ใช้ **JUnit 4** (หรือ JUnit 3.8.1 สไตล์ Defects4J)\n"
            "- ใช้ imports: `org.junit.Test`, `org.junit.Before`, `org.junit.After`\n"
            "- ใช้ assertions: `org.junit.Assert.*` (`assertEquals`, `assertNull`, `assertNotNull`, `assertSame`, `fail`)\n"
            "- ใช้ `@Test(expected = XxxException.class)` หรือ try/catch + fail() สำหรับ exception tests\n"
            "- ❌ ห้าม import `org.junit.jupiter.*`"
        )

    prompt = prompt.replace("[FRAMEWORK_SPECIFICATION]", framework_spec)

    dep_spec = dependencies.strip() if dependencies else "<!-- Standard Defects4J Maven dependencies -->"
    prompt = prompt.replace("[DEPENDENCY_SPECIFICATION]", dep_spec)

    placeholder_src = "[full class source code ของ target class]"
    if placeholder_src in prompt:
        prompt = prompt.replace(placeholder_src, source_code)
    else:
        prompt = re.sub(
            r'(<source_code>)([\s\S]*?)(</source_code>)',
            lambda m: m.group(1) + '\n' + source_code + '\n' + m.group(3),
            prompt
        )

    placeholder_dep = "[signature ของ class ที่ target class เรียกใช้ ถ้ามี]"
    prompt = prompt.replace(placeholder_dep, dependencies.strip() if dependencies else "// No specific signatures")

    return prompt


# ==============================================================================
# 7. การเรียก KKU IntelSphere API ด้วย SSE Streaming
# ==============================================================================
def is_quota_exceeded(status_code: int, error_text: str) -> bool:
    """ตรวจสอบว่า Error เกิดจาก Quota หรือ Daily Limit หมดหรือไม่ (ไม่รวม rate limit ชั่วคราว)"""
    low = error_text.lower()
    quota_keywords = [
        "quota", "credit", "balance", "insufficient", "exceeded your current quota",
        "billing", "daily limit", "daily token", "daily quota", "reached daily limit", "exhausted"
    ]
    if status_code in [401, 402, 403]:
        return any(k in low for k in quota_keywords)
    if status_code == 429:
        return any(k in low for k in ["daily limit", "reached daily limit", "quota", "balance", "credit"])
    return any(k in low for k in ["daily limit", "reached daily limit", "exceeded your current quota"])


def is_context_or_payload_error(status_code: int, error_text: str) -> bool:
    """ตรวจสอบว่า Error เกิดจากขนาด Payload หรือ Context Length เกินกำหนดหรือไม่"""
    low = error_text.lower()
    size_keywords = [
        "payload too large", "context length", "context window", "too long",
        "too large", "maximum context", "tokens limit", "prompt is too large",
        "request entity too large", "content too large", "gateway timeout"
    ]
    if status_code in [413, 504]:
        return True
    if status_code in [400, 500, 502]:
        return any(k in low for k in size_keywords)
    return False


class WaitingTicker:
    """Thread ช่วยพิมพ์สถานะแสดงว่ายังเชื่อมต่ออยู่ระหว่างรอแพ็กเกจแรกจากเซิร์ฟเวอร์ (TTFT)"""
    def __init__(self, message: str = "กำลังรอการตอบกลับจากเซิร์ฟเวอร์", is_large: bool = False):
        self.message = message
        self.is_large = is_large
        self.running = False
        self.thread = None
        self.start_time = 0

    def start(self):
        self.running = True
        self.start_time = time.time()
        self.thread = threading.Thread(target=self._run, daemon=True)
        self.thread.start()

    def _run(self):
        spin_chars = ["⠋", "⠙", "⠹", "⠸", "⠼", "⠴", "⠦", "⠧", "⠇", "⠏"]
        idx = 0
        while self.running:
            elapsed = time.time() - self.start_time
            char = spin_chars[idx % len(spin_chars)]
            extra = ""
            if elapsed > 60:
                extra = " (คลาสขนาดใหญ่ โมเดลกำลังประมวลผลโค้ด...)"
            elif elapsed > 25 and self.is_large:
                extra = " (ไฟล์ขนาดใหญ่ กำลังเตรียม context...)"

            sys.stdout.write(f"\r  {char} {self.message}... [{elapsed:.1f}s]{extra}")
            sys.stdout.flush()
            idx += 1
            time.sleep(0.3)

    def stop(self):
        self.running = False
        if self.thread and self.thread.is_alive():
            self.thread.join(timeout=0.5)
        # ล้างบรรทัดปัจจุบัน
        sys.stdout.write("\r" + " " * 95 + "\r")
        sys.stdout.flush()


def call_single_api_stream(
    api_key: str,
    prompt: str,
    base_url: str = "https://gen.ai.kku.ac.th/api/v1",
    model: str = "deepseek-v4-flash",
    timeout: int = 60,
    max_retries: int = 2,
    retry_delay: int = 2,
    show_stream: bool = False,
    max_tokens: int = 8192,
    budget: DailyBudget = None
) -> dict:
    """
    เรียก KKU IntelSphere API แบบ SSE Streaming:
    - แยก delta.content ออกจาก delta.reasoning / delta.reasoning_content อย่างเด็ดขาด
    - แสดงสถานะเรียลไทม์ระหว่างรอ (TTFT) และระหว่างสตรีมผลลัพธ์ (ความเร็ว c/s, จำนวน token/chars)
    - รวบรวมข้อมูล usage, model_quota, finish_reason
    - ดักจับ HTTP 429 พร้อมอ่าน Retry-After header
    - ยืนยันสถานะความสำเร็จจาก finish_reason ของเซิร์ฟเวอร์จริงเท่านั้น ไม่ fabricate finish_reason="stop"
    """
    url = f"{base_url.rstrip('/')}/chat/completions"
    headers = {
        "Content-Type": "application/json",
        "Authorization": f"Bearer {api_key}"
    }

    payload = {
        "model": model,
        "messages": [
            {
                "role": "system",
                "content": (
                    "คุณคือวิศวกรทดสอบซอฟต์แวร์ที่เชี่ยวชาญ JUnit และ Code Coverage "
                    "ตอบเป็นโค้ดภาษา Java ทั้งไฟล์เท่านั้น ไม่มีคำอธิบายก่อนหรือหลังโค้ด "
                    "ไม่มี markdown code fence ข้อกำหนดสำคัญสูงสุด: ต้องเขียนโค้ด Test Suite ให้สมบูรณ์ตั้งแต่ต้นจนจบ "
                    "และปิด Class ด้วย '}' เสมอ ห้ามหยุดเขียนกลางคัน เน้นเทสต์ branch สำคัญอย่างกระชับ ไม่สร้างกรณีซ้ำซ้อน"
                )
            },
            {
                "role": "user",
                "content": prompt
            }
        ],
        "max_tokens": max_tokens,
        "stream": True
    }

    is_large_file = len(prompt) > 25000
    last_err = None

    for attempt in range(1, max_retries + 1):
        reservation = budget.reserve(payload["messages"], max_tokens) if budget else None
        if budget and reservation is None:
            return {
                "success": False,
                "budget_exhausted": True,
                "error": "Daily local token budget reached; resume on the next date."
            }

        ticker = WaitingTicker("📡 ส่งคำขอแล้ว กำลังรอเซิร์ฟเวอร์ตอบกลับ (TTFT)", is_large=is_large_file)
        t0 = time.time()
        resp = None
        try:
            ticker.start()
            resp = requests.post(
                url,
                headers=headers,
                json=payload,
                stream=True,
                timeout=(15, timeout)
            )

            # ตรวจสอบ HTTP Error รหัสต่างๆ
            if resp.status_code != 200:
                ticker.stop()
                err_text = resp.text
                try:
                    err_json = resp.json()
                    error_obj = err_json.get("error", {})
                    err_text = error_obj.get("message", resp.text) if isinstance(error_obj, dict) else str(error_obj)
                except Exception:
                    pass

                # 1. กรณี HTTP 429 Rate Limit
                if resp.status_code == 429:
                    # ตรวจสอบว่าเป็นโควต้าหมดหรือแค่ rate limit
                    if is_quota_exceeded(429, err_text):
                        return {
                            "success": False,
                            "quota_exhausted": True,
                            "status_code": 429,
                            "error": f"Daily Quota หมด (HTTP 429): {err_text}"
                        }
                    retry_after = 30
                    retry_header = resp.headers.get("Retry-After")
                    if retry_header:
                        try:
                            retry_after = int(retry_header)
                        except ValueError:
                            pass
                    return {
                        "success": False,
                        "status_code": 429,
                        "retry_after": retry_after,
                        "error": f"Rate limit (HTTP 429): {err_text}"
                    }

                # 2. กรณี Quota หมด (401 daily limit, etc.)
                if is_quota_exceeded(resp.status_code, err_text):
                    return {
                        "success": False,
                        "quota_exhausted": True,
                        "status_code": resp.status_code,
                        "error": f"Token/Daily Quota หมด (HTTP {resp.status_code}): {err_text}"
                    }

                # 3. Payload / Context size
                if is_context_or_payload_error(resp.status_code, err_text):
                    return {
                        "success": False,
                        "payload_too_large": True,
                        "status_code": resp.status_code,
                        "error": f"ขนาดข้อมูลเกินขีดจำกัดเซิร์ฟเวอร์ (HTTP {resp.status_code}): {err_text}"
                    }

                # 4. Server transient errors
                if resp.status_code in [500, 502, 503, 504]:
                    print(f"    ⚠️ Warning: HTTP {resp.status_code} ({err_text[:80]}) - กำลังลองใหม่รอบ {attempt}/{max_retries}...")
                    time.sleep(retry_delay * attempt)
                    continue
                else:
                    return {
                        "success": False,
                        "status_code": resp.status_code,
                        "error": f"HTTP {resp.status_code}: {err_text}"
                    }

            # อ่าน SSE Stream Chunks
            full_content = ""
            full_reasoning = ""
            chunks_count = 0
            finish_reason = None
            usage_data = None
            model_quota = None
            stream_error = None
            first_chunk_received = False
            last_progress_time = 0
            ttft = 0

            try:
                for line in resp.iter_lines(chunk_size=1024):
                    if not line:
                        continue
                    decoded = line.decode("utf-8", errors="replace")

                    if decoded.startswith("{") and '"error"' in decoded:
                        try:
                            err_obj = json.loads(decoded)
                            if "error" in err_obj:
                                err_val = err_obj["error"]
                                stream_error = err_val.get("message", decoded) if isinstance(err_val, dict) else str(err_val)
                                break
                        except Exception:
                            pass

                    if decoded.startswith("data:"):
                        data_str = decoded[5:].strip()
                        if data_str == "[DONE]":
                            break
                        try:
                            chunk = json.loads(data_str)
                            if "error" in chunk:
                                err_val = chunk["error"]
                                stream_error = err_val.get("message", data_str) if isinstance(err_val, dict) else str(err_val)
                                break

                            if "usage" in chunk and chunk["usage"]:
                                usage_data = chunk["usage"]
                            if "model_quota" in chunk and chunk["model_quota"]:
                                model_quota = chunk["model_quota"]

                            choices = chunk.get("choices") or []
                            if not choices:
                                continue
                            choice = choices[0]
                            delta = choice.get("delta", {})

                            content_part = delta.get("content") or ""
                            reasoning_part = delta.get("reasoning_content") or delta.get("reasoning") or ""

                            if choice.get("finish_reason"):
                                finish_reason = choice["finish_reason"]

                            if content_part or reasoning_part:
                                if not first_chunk_received:
                                    first_chunk_received = True
                                    ticker.stop()
                                    ttft = time.time() - t0
                                    if show_stream:
                                        print(f"  ⚡ เริ่มรับข้อมูล (TTFT: {ttft:.1f}s) | กำลังสตรีมสด:")
                                        print("  " + "-" * 70)

                                chunks_count += 1

                                if reasoning_part:
                                    full_reasoning += reasoning_part
                                    if show_stream:
                                        sys.stdout.write(f"[Reasoning: {reasoning_part}]")
                                        sys.stdout.flush()

                                if content_part:
                                    full_content += content_part
                                    if show_stream:
                                        sys.stdout.write(content_part)
                                        sys.stdout.flush()

                                if not show_stream:
                                    now = time.time()
                                    if now - last_progress_time >= 0.25:
                                        last_progress_time = now
                                        elapsed = now - t0
                                        total_chars = len(full_content) + len(full_reasoning)
                                        rate = (total_chars / (elapsed - ttft)) if (elapsed - ttft) > 0.1 else 0
                                        est_tokens = len(full_content) // 4
                                        if len(full_content) == 0 and len(full_reasoning) > 0:
                                            msg = f"\r  ⏳ กำลังคิด (Reasoning)... [เวลา: {elapsed:.1f}s | คิด: {len(full_reasoning):,} chars | {rate:.0f} c/s]"
                                        else:
                                            reasoning_txt = f"คิด: {len(full_reasoning):,} chars | " if full_reasoning else ""
                                            msg = f"\r  ⏳ กำลังสร้างโค้ด... [เวลา: {elapsed:.1f}s | {reasoning_txt}โค้ด: {len(full_content):,} chars (~{est_tokens:,} tokens) | {rate:.0f} c/s]"
                                        sys.stdout.write(msg[:95].ljust(95))
                                        sys.stdout.flush()
                        except Exception:
                            pass
            finally:
                ticker.stop()
                resp.close()

            total_elapsed = time.time() - t0
            if budget:
                budget.settle(reservation, usage_data)

            if stream_error:
                print(f"\n    ⚠️ ได้รับ Error ในสตรีม: {stream_error}")
                if is_quota_exceeded(429, stream_error):
                    return {"success": False, "quota_exhausted": True, "error": f"Quota หมด: {stream_error}"}
                last_err = stream_error
                time.sleep(retry_delay * attempt)
                continue

            # ตรวจสอบการจบของสตรีม: ต้องได้ finish_reason จากเซิร์ฟเวอร์จริง
            if not finish_reason:
                return {
                    "success": False,
                    "error": "Incomplete stream: stream terminated without finish_reason from API",
                    "content": full_content,
                    "reasoning": full_reasoning
                }

            content_chars = len(full_content)
            reasoning_chars = len(full_reasoning)
            completion_tokens = (usage_data or {}).get("completion_tokens", 0)

            # แสดงผลสรุปเมื่อสำเร็จหรือจบการสตรีม
            if show_stream:
                print("\n  " + "-" * 70)
            sys.stdout.write("\r" + " " * 95 + "\r")
            sys.stdout.write(
                f"  ✅ ได้รับ Response ครบถ้วน! [เวลา: {total_elapsed:.1f}s | โค้ด: {content_chars:,} ตัวอักษร (~{completion_tokens or (content_chars//4):,} tokens) | คิด: {reasoning_chars:,} chars | ชิ้นข้อมูล: {chunks_count:,} | TTFT: {ttft:.1f}s]\n"
            )
            sys.stdout.flush()

            if model_quota:
                rem = model_quota.get("daily_remaining_tokens")
                tot = model_quota.get("daily_quota_tokens")
                used = model_quota.get("daily_usage_tokens")
                if rem is not None and tot is not None:
                    print(f"  📊 Quota โมเดล: คงเหลือ {rem:,} / {tot:,} tokens (ใช้สะสมวันนี้ {used:,} tokens)")

            # หาก finish_reason == 'length' ให้ระบุเป็น failure/is_truncated ชัดเจน
            if finish_reason == "length":
                return {
                    "success": False,
                    "is_truncated": True,
                    "finish_reason": "length",
                    "error": "Output truncated: reached max_tokens limit",
                    "content": full_content,
                    "reasoning": full_reasoning,
                    "elapsed": total_elapsed,
                    "ttft": ttft,
                    "usage": usage_data or {"completion_tokens": completion_tokens or ((content_chars + reasoning_chars) // 4)},
                    "model_quota": model_quota,
                    "content_char_count": content_chars,
                    "reasoning_char_count": reasoning_chars
                }

            if finish_reason != "stop":
                return {
                    "success": False,
                    "finish_reason": finish_reason,
                    "error": f"Unexpected finish_reason: {finish_reason}",
                    "content": full_content,
                    "reasoning": full_reasoning
                }

            if not full_content.strip() or len(full_content.strip()) < 50:
                last_err = "ไม่ได้รับเนื้อหาโค้ดจากเซิร์ฟเวอร์ (Empty response)"
                if attempt < max_retries:
                    time.sleep(retry_delay * attempt)
                    continue
                return {"success": False, "error": last_err}

            return {
                "success": True,
                "content": full_content,
                "reasoning": full_reasoning,
                "finish_reason": finish_reason,
                "elapsed": total_elapsed,
                "ttft": ttft,
                "usage": usage_data or {
                    "prompt_tokens": 0,
                    "completion_tokens": completion_tokens or ((content_chars + reasoning_chars) // 4),
                    "total_tokens": completion_tokens or ((content_chars + reasoning_chars) // 4)
                },
                "model_quota": model_quota,
                "content_char_count": content_chars,
                "reasoning_char_count": reasoning_chars
            }

        except (requests.exceptions.Timeout, requests.exceptions.ReadTimeout) as e:
            ticker.stop()
            last_err = f"Request Timeout ({timeout}s): {e}"
            print(f"\n    ⚠️ Gateway TTFT Timeout ({timeout}s) - {e}")
            time.sleep(retry_delay * attempt)
        except Exception as e:
            ticker.stop()
            last_err = f"Request Exception: {e}"
            print(f"\n    ⚠️ Request Exception: {e}")
            time.sleep(retry_delay * attempt)

    return {
        "success": False,
        "error": last_err or "Unknown error after retries"
    }


def call_deepseek_api_with_rotation(
    key_manager: KeyManager,
    prompt: str,
    model: str = "deepseek-v4-flash",
    timeout: int = 60,
    show_stream: bool = False,
    max_tokens: int = 8192
) -> dict:
    """
    ยิงคำขอไปยัง API พร้อมระบบหมุนเวียนคีย์ (Round-Robin) และ Auto-Failover
    - เมื่อได้ HTTP 429 จะพักคีย์ตาม retry_after และสลับไปคีย์ถัดไป
    """
    tried_keys = set()

    while key_manager.has_active_keys():
        current_key = key_manager.get_current_key()
        if not current_key or current_key in tried_keys:
            break

        tried_keys.add(current_key)
        masked = mask_key(current_key)
        key_idx = key_manager.keys.index(current_key) + 1 if current_key in key_manager.keys else "?"
        print(f"  🔑 ใช้ API Key #{key_idx} ({masked})...")

        result = call_single_api_stream(
            api_key=current_key,
            prompt=prompt,
            model=model,
            timeout=timeout,
            show_stream=show_stream,
            max_tokens=max_tokens,
            budget=key_manager.budget
        )

        if result.get("budget_exhausted"):
            return {
                "success": False,
                "budget_exhausted": True,
                "error": result["error"]
            }

        if result.get("model_quota"):
            key_manager.update_quota_info(current_key, result["model_quota"])

        # 1. กรณี HTTP 429 Rate Limit -> พักคีย์และหมุนไปคีย์ถัดไป
        if result.get("status_code") == 429:
            duration = result.get("retry_after", 30)
            key_manager.mark_rate_limited(current_key, duration_sec=duration)
            continue

        # 2. กรณีโควต้าหมด -> มาร์ค exhausted และหมุนไปคีย์ถัดไป
        if result.get("quota_exhausted"):
            key_manager.mark_exhausted(current_key, reason=result["error"])
            continue

        if result.get("success"):
            result["used_key_masked"] = masked
            key_manager.rotate()
            return result

        # หากติด truncated ให้ส่งผลกลับเพื่อให้ caller จัดการ retry แบบ compaction
        if result.get("is_truncated"):
            result["used_key_masked"] = masked
            key_manager.rotate()
            return result

        if not result.get("success"):
            err_msg = result.get("error", "")
            if len(key_manager.get_active_keys()) > 1:
                print(f"  🔄 [FAILOVER] สลับไปใช้คีย์สำรองถัดไปเนื่องจาก Error: {err_msg[:80]}")

        key_manager.rotate()

    return {
        "success": False,
        "all_keys_exhausted": not key_manager.has_active_keys(),
        "error": "ทุกคีย์ไม่สามารถประมวลผลคำขอได้ หรือโควต้าหมดทั้งหมด"
    }


# ==============================================================================
# 8. การสแกน Resource และการจับคู่ Target Code
# ==============================================================================
def find_all_source_files(resource_dir: Path, project_filter: str = None, file_filter: str = None) -> list:
    """
    ค้นหาไฟล์ .java ใน Resoucre/<Project>/
    รองรับการกรองตามชื่อโปรเจกต์ (--project):
    - หากชื่อตรงกันแบบพอดี (exact match เช่น Chart_1) จะเลือกเฉพาะโปรเจกต์นั้น
    - หากไม่มี exact match จะค้นหาแบบ prefix/contains (เช่น Chart จะได้ Chart_1, Chart_2 ...)
    """
    results = []
    if not resource_dir.is_dir():
        return results

    projects = sorted([d for d in resource_dir.iterdir() if d.is_dir()])
    if project_filter:
        p_filter_lower = project_filter.strip().lower()
        exact_matches = [d for d in projects if d.name.lower() == p_filter_lower]
        if exact_matches:
            projects = exact_matches
        else:
            projects = [d for d in projects if p_filter_lower in d.name.lower()]

    for proj_dir in projects:
        proj_name = proj_dir.name
        java_files = sorted(proj_dir.rglob("*.java"))
        for jf in java_files:
            if file_filter and file_filter.lower() not in jf.name.lower():
                continue
            rel_path = jf.relative_to(proj_dir).as_posix()
            results.append({
                "project": proj_name,
                "source_file": jf,
                "rel_path": rel_path,
                "file_size": jf.stat().st_size
            })

    return results


def resolve_test_target_dir(workspace_root: Path, project_name: str) -> Path:
    """
    คำนวณโฟลเดอร์สำหรับบันทึก Test Code:
    แก้ไขข้อจำกัดของ Claude: ใช้ชื่อโปรเจกต์จริงเสมอ เช่น Closure_28 -> Closure_28_buggy
    ไม่เติม _1 ซ้ำซ้อน
    """
    folder_name = f"{project_name}_buggy" if not project_name.endswith("_buggy") else project_name
    return workspace_root / "Deepseek-flash-v4" / "TestCode" / folder_name


# ==============================================================================
# 9. CLI Implementation & Handlers
# ==============================================================================
def print_status_report(key_manager: KeyManager, state_data: dict, budget: DailyBudget):
    """แสดงสถานะระบบ โควต้า และความคืบหน้า (--status) โดยไม่เรียก API"""
    print("\n" + "=" * 80)
    print("📊 รายงานสถานะระบบ DeepSeek-V4-Flash Test Generation Pipeline")
    print("=" * 80)

    # 1. ข้อมูลงบประมาณภายในเครื่อง
    if budget:
        used = budget.get_today_used()
        rem = budget.get_today_remaining()
        limit = budget.limit
        pct = (used / limit * 100) if limit else 0
        print(f"💰 งบประมาณภายใน (Internal Daily Budget):")
        print(f"   • วงเงินรายวัน : {limit:,} tokens")
        print(f"   • ใช้ไปวันนี้  : {used:,} tokens ({pct:.1f}%)")
        print(f"   • คงเหลือวันนี้: {rem:,} tokens")
    else:
        print("💰 งบประมาณภายใน: ปิดการใช้งาน (--no-budget)")
    print("-" * 80)

    # 2. สถานะ API Keys
    print(f"🔑 สถานะ API Keys ({key_manager.total_count} คีย์):")
    for idx, k in enumerate(key_manager.keys, 1):
        m = mask_key(k)
        is_exh = k in key_manager.exhausted_keys
        status_str = "🛑 โควต้าหมด (Exhausted)" if is_exh else "✅ พร้อมใช้งาน (Active)"
        q_info = key_manager.key_quota.get(k)
        if q_info:
            q_rem = q_info.get("daily_remaining_tokens", "N/A")
            q_tot = q_info.get("daily_quota_tokens", "N/A")
            quota_detail = f" | โควต้าเซิร์ฟเวอร์: {q_rem:,}/{q_tot:,} tokens" if isinstance(q_rem, int) else ""
        else:
            quota_detail = " | โควต้าเซิร์ฟเวอร์ตั้งต้น: 4,000,000 tokens/วัน (รอ sync จาก API response)"
        print(f"   [{idx}] {m} : {status_str}{quota_detail}")
    print("-" * 80)

    # 3. สรุป State ความคืบหน้า
    total_tasks = len(state_data)
    counts = {"GENERATED": 0, "COMPLETED": 0, "LIMIT_REACHED": 0, "FAILED": 0, "OTHER": 0}
    for entry in state_data.values():
        st = entry.get("status", "OTHER")
        if st in counts:
            counts[st] += 1
        else:
            counts["OTHER"] += 1

    print(f"📁 ประวัติการประมวลผล (generation_state.json):")
    print(f"   • บันทึกทั้งหมด      : {total_tasks:,} รายการ")
    print(f"   • สร้างสำเร็จ (GENERATED): {counts['GENERATED'] + counts['COMPLETED']:,} ไฟล์")
    print(f"   • ติด Token Limit   : {counts['LIMIT_REACHED']:,} ไฟล์")
    print(f"   • ล้มเหลว (FAILED)  : {counts['FAILED']:,} ไฟล์")
    print("=" * 80 + "\n")


def check_quota_online(keys: list, base_url: str = "https://gen.ai.kku.ac.th/api/v1"):
    """
    ตรวจสอบโควต้าจริงของแต่ละคีย์จากเซิร์ฟเวอร์ (--check-quota)
    คำเตือน: ฟังก์ชันนี้จะส่งคำขอขนาดเล็ก (1 token) ไปยัง API เพื่อดึง model_quota
    """
    print("\n" + "=" * 80)
    print("📡 กำลังตรวจสอบยอดโควต้าคงเหลือจริงจาก KKU IntelSphere API...")
    print("⚠️ หมายเหตุ: การตรวจสอบนี้จะส่ง request สั้นๆ ไปยัง API และอาจใช้ token เล็กน้อย (~2-5 tokens)")
    print("=" * 80)

    url = f"{base_url.rstrip('/')}/chat/completions"
    for idx, k in enumerate(keys, 1):
        m = mask_key(k)
        headers = {
            "Content-Type": "application/json",
            "Authorization": f"Bearer {k}"
        }
        payload = {
            "model": "deepseek-v4-flash",
            "messages": [{"role": "user", "content": "hi"}],
            "max_tokens": 1,
            "stream": False
        }
        try:
            resp = requests.post(url, headers=headers, json=payload, timeout=15)
            if resp.status_code == 200:
                data = resp.json()
                quota = data.get("model_quota", {})
                rem = quota.get("daily_remaining_tokens", "N/A")
                tot = quota.get("daily_quota_tokens", "N/A")
                used = quota.get("daily_usage_tokens", "N/A")
                print(f"[{idx}] {m} : ✅ เชื่อมต่อสำเร็จ | โควต้าคงเหลือ: {rem:,} / {tot:,} (ใช้ไปแล้ว {used:,} tokens)")
            else:
                err_text = resp.text[:100]
                print(f"[{idx}] {m} : ❌ HTTP {resp.status_code}: {err_text}")
        except Exception as e:
            print(f"[{idx}] {m} : ❌ การเชื่อมต่อล้มเหลว: {e}")
    print("=" * 80 + "\n")


def is_task_pending(task: dict, state_data: dict, workspace_dir: Path, overwrite: bool, skip_limits: bool) -> bool:
    """
    ตรวจสอบว่างานนี้ต้องประมวลผลหรือไม่:
    - overwrite=True: ทุกไฟล์ต้องประมวลผล
    - หากสถานะเป็น GENERATED/COMPLETED หรือมีไฟล์ที่สมบูรณ์อยู่แล้ว: ไม่ต้องทำ (skip)
    - หากสถานะเป็น LIMIT_REACHED:
      - ถ้าใส่ --skip-limits: ให้ข้าม (ไม่ทำ)
      - ถ้าไม่ได้ใส่ --skip-limits: ให้นำมาลองทำใหม่ (pending)
    """
    if overwrite:
        return True

    proj = task["project"]
    src_path = task["source_file"]
    rel_path = task.get("rel_path", src_path.name)
    task_id = f"{proj}/{rel_path}"
    entry = state_data.get(task_id, {})
    status = entry.get("status")

    target_dir = resolve_test_target_dir(workspace_dir, proj)
    expected_test_file = target_dir / f"{src_path.stem}Test.java"
    has_valid_disk = expected_test_file.is_file() and is_valid_complete_java_test(expected_test_file)

    if status in ("GENERATED", "COMPLETED") or has_valid_disk:
        return False

    if status == "LIMIT_REACHED" or entry.get("finish_reason") == "length":
        # ถ้าสั่ง --skip-limits ให้ข้ามไฟล์ที่ติดลิมิต
        return not skip_limits

    return True


def main(cli_args=None):
    parser = argparse.ArgumentParser(
        description="DeepSeek-V4-Flash JUnit Test Generation Pipeline สำหรับ Defects4J",
        formatter_class=argparse.RawTextHelpFormatter
    )

    parser.add_argument("-p", "--project", type=str, help="กรองเฉพาะโปรเจกต์ที่ระบุ (เช่น Closure_28 หรือ Chart_1)")
    parser.add_argument("-f", "--file", type=str, help="กรองเฉพาะชื่อไฟล์ Java ที่ระบุ")
    parser.add_argument("-n", "--limit", type=int, default=None, help="จำกัดจำนวนไฟล์ที่จะประมวลผล (กรองเฉพาะงานที่ค้างก่อนตัดตาม limit)")
    parser.add_argument("-k", "--api-key", action="append", help="ระบุ API Key (สามารถใส่หลายตัว หรือคั่นด้วยจุลภาค)")
    parser.add_argument("--env-file", type=str, help="ระบุตำแหน่งไฟล์ .env ที่ต้องการโหลด")
    parser.add_argument("--max-tokens", type=int, default=8192, help="กำหนดเพดาน completion tokens (ค่าเริ่มต้น: 8192)")
    parser.add_argument("--budget-limit", type=int, default=3200000, help="กำหนดงบประมาณ token ภายในต่อวัน (ค่าเริ่มต้น: 3,200,000)")
    parser.add_argument("--no-budget", action="store_true", help="ปิดการตรวจสอบงบประมาณภายในเครื่อง")
    parser.add_argument("--skip-limits", action="store_true", help="ข้ามไฟล์ที่เคยติดขีดจำกัดโทเค็น (LIMIT_REACHED / length) ไม่นำมารันซ้ำ")
    parser.add_argument("--overwrite", action="store_true", help="สร้างไฟล์เทสต์ใหม่ แม้ไฟล์เดิมจะสร้างเสร็จแล้ว")
    parser.add_argument("--dry-run", action="store_true", help="จำลองการทำงานโดยไม่ยิง API และไม่แก้ไข State")
    parser.add_argument("--plan", action="store_true", help="แสดงแผนการประมวลผลไฟล์ทั้งหมดโดยไม่ยิง API และไม่แก้ไข State")
    parser.add_argument("--status", action="store_true", help="แสดงสถานะระบบ โควต้า และความคืบหน้าโดยไม่ยิง API")
    parser.add_argument("--check-quota", action="store_true", help="ตรวจสอบโควต้าจริงของแต่ละคีย์จากเซิร์ฟเวอร์ (ใช้ token เล็กน้อย)")
    parser.add_argument("--show-stream", "-v", action="store_true", help="แสดงผลการตอบกลับจากโมเดลแบบสดลง Console")
    parser.add_argument("--timeout", type=int, default=60, help="Timeout สำหรับแต่ละ Request เป็นวินาที (ค่าเริ่มต้น: 60)")
    parser.add_argument("--delay", type=float, default=1.0, help="หน่วงเวลาระหว่างไฟล์เป็นวินาที (ค่าเริ่มต้น: 1.0)")
    parser.add_argument("--model", type=str, default="deepseek-v4-flash", help="ชื่อโมเดล (ค่าเริ่มต้น: deepseek-v4-flash)")
    parser.add_argument("--junit", type=str, default="auto", choices=["auto", "junit4", "junit5", "4", "5"], help="ระบุเวอร์ชัน JUnit (auto, junit4, junit5)")

    args = parser.parse_args(cli_args)

    # ตรวจสอบตัวเลือกที่ขัดแย้งกัน: --check-quota ไม่สามารถใช้ร่วมกับโหมด Offline ได้
    offline_flags = [f for f, val in [("--dry-run", args.dry_run), ("--plan", args.plan), ("--status", args.status)] if val]
    if args.check_quota and offline_flags:
        print(f"❌ Error: --check-quota ต้องส่งคำขอไปยังเซิร์ฟเวอร์จริง จึงไม่สามารถใช้ร่วมกับแฟล็กโหมด Offline ({', '.join(offline_flags)}) ได้")
        sys.exit(2)

    # ตรวจสอบความถูกต้องของ max-tokens
    if args.max_tokens <= 0:
        print("❌ Error: --max-tokens ต้องเป็นจำนวนเต็มบวก")
        sys.exit(2)

    workspace_dir = Path(__file__).resolve().parent.parent
    resource_dir = workspace_dir / "Resoucre"
    prompt_template_path = workspace_dir / "Deepseek-flash-v4" / "Promt" / "promt.md"
    state_file = workspace_dir / "Deepseek-flash-v4" / "generation_state.json"
    budget_file = workspace_dir / "Deepseek-flash-v4" / "budget_ledger.json"

    # โหลด API Keys
    api_keys = get_all_api_keys(args.api_key, args.env_file)

    # 1. ตรวจสอบโควต้าสด (--check-quota)
    if args.check_quota:
        if not api_keys:
            print("❌ ไม่พบคีย์ API สำหรับตรวจสอบโควต้า กรุณาตั้งค่าใน .env หรือระบุผ่าน --api-key")
            sys.exit(1)
        check_quota_online(api_keys)
        return

    # 2. ตรวจสอบสถานะ (--status)
    if args.status:
        state_data = load_state(state_file, read_only=True)
        budget = DailyBudget(budget_file, args.budget_limit) if not args.no_budget else None
        key_mgr = KeyManager(api_keys, budget=budget)
        print_status_report(key_mgr, state_data, budget)
        return

    # สแกนหาไฟล์ต้นฉบับทั้งหมด
    all_tasks = find_all_source_files(resource_dir, args.project, args.file)
    if not all_tasks:
        print(f"⚠️ ไม่พบไฟล์ Java ใน {resource_dir} ที่ตรงกับเงื่อนไข")
        return

    # โหลด State (Read-only สำหรับ dry-run และ plan)
    is_read_only = args.dry_run or args.plan
    state_data = load_state(state_file, read_only=is_read_only)
    budget = DailyBudget(budget_file, args.budget_limit) if (not args.no_budget and not is_read_only) else None
    key_manager = KeyManager(api_keys, budget=budget)

    # 3. แสดงแผนการทำงาน (--plan)
    if args.plan:
        print("\n" + "=" * 80)
        print(f"📋 แผนการทำงาน DeepSeek-V4-Flash Test Generation Pipeline (พบทั้งหมด {len(all_tasks)} ไฟล์)")
        print("=" * 80)
        to_generate = 0
        to_skip = 0
        for i, t in enumerate(all_tasks, 1):
            src_path = t["source_file"]
            proj = t["project"]
            pending = is_task_pending(t, state_data, workspace_dir, args.overwrite, args.skip_limits)
            action = "GENERATE" if pending else "SKIP (เสร็จแล้วหรือข้าม)"
            if pending:
                to_generate += 1
            else:
                to_skip += 1
            print(f"[{i:3d}] {proj:20s} | {src_path.name:30s} | ขนาด: {t['file_size']:6,d} B | เป้าหมาย: {action}")
        print("-" * 80)
        print(f"สรุปแผน: ต้องสร้างใหม่ {to_generate} ไฟล์ | ข้ามไป {to_skip} ไฟล์ | ทั้งหมด {len(all_tasks)} ไฟล์")
        print("=" * 80 + "\n")
        return

    # กรองเฉพาะงานที่ค้างอยู่ (Pending Tasks) ก่อนทำการจำกัดจำนวนด้วย --limit
    pending_tasks = [t for t in all_tasks if is_task_pending(t, state_data, workspace_dir, args.overwrite, args.skip_limits)]

    # 4. จำลองการทำงาน (--dry-run)
    if args.dry_run:
        print("\n" + "=" * 80)
        print(f"🧪 [DRY-RUN] กำลังจำลองการทำงาน (ไม่ยิง API จริง และไม่แก้ไข State)")
        print(f"   งานที่ต้องทำ: {len(pending_tasks)} / {len(all_tasks)} ไฟล์")
        print("=" * 80)
        tasks_to_dry_run = pending_tasks[:args.limit] if args.limit else pending_tasks
        if not tasks_to_dry_run:
            print("  ℹ️ ไม่มีงานที่ต้องทำ ทุกไฟล์เสร็จสมบูรณ์หรือถูกข้ามทั้งหมด")
        for i, t in enumerate(tasks_to_dry_run, 1):
            src_path = t["source_file"]
            proj = t["project"]
            target_dir = resolve_test_target_dir(workspace_dir, proj)
            expected_test = target_dir / f"{src_path.stem}Test.java"
            task_id = f"{proj}/{t.get('rel_path', src_path.name)}"
            detected_junit = detect_junit_version(proj, workspace_dir, args.junit)
            print(f"  [{i}/{len(tasks_to_dry_run)}] 🚀 [SIMULATE] {task_id} -> {expected_test} (JUnit: {detected_junit}, max_tokens={args.max_tokens})")
        print("=" * 80)
        print("✅ [DRY-RUN เสร็จสมบูรณ์] ไม่มีการใช้ Token และไม่มีการเปลี่ยนแปลงไฟล์")
        return

    # ==========================================================================
    # การรันจริง (Actual Execution)
    # ==========================================================================
    if not api_keys:
        print("❌ ไม่พบ API Key กรุณากำหนดใน .env หรือระบุผ่าน -k / --api-key")
        sys.exit(1)

    if not prompt_template_path.is_file():
        print(f"❌ ไม่พบไฟล์ Template ที่: {prompt_template_path}")
        sys.exit(1)
    with open(prompt_template_path, "r", encoding="utf-8") as f:
        prompt_template = f.read()

    # ตัดตาม limit จากรายการงานที่ยังค้างอยู่
    tasks_to_run = pending_tasks[:args.limit] if args.limit else pending_tasks

    print("\n" + "=" * 80)
    print(f"🚀 เริ่มการสร้าง Test Code ด้วย DeepSeek-V4-Flash ({len(tasks_to_run)} ไฟล์เป้าหมาย)")
    print(f"🔑 จำนวนคีย์ API พร้อมใช้งาน: {key_manager.total_count} คีย์ (หมุนเวียน Round-Robin)")
    print(f"🎯 เพดาน Output Token: {args.max_tokens} tokens")
    if budget:
        print(f"💰 งบประมาณภายใน: {budget.get_today_remaining():,} tokens คงเหลือวันนี้ (จากจำกัด {budget.limit:,})")
    print("=" * 80 + "\n")

    stats = {"total": len(tasks_to_run), "generated": 0, "limit_reached": 0, "failed": 0}

    try:
        for idx, task in enumerate(tasks_to_run, 1):
            src_path = task["source_file"]
            proj_name = task["project"]
            target_dir = resolve_test_target_dir(workspace_dir, proj_name)
            task_id = f"{proj_name}/{task.get('rel_path', src_path.name)}"

            expected_test_filename = f"{src_path.stem}Test.java"
            existing_disk_file = target_dir / expected_test_filename
            has_complete_disk_file = existing_disk_file.is_file() and is_valid_complete_java_test(existing_disk_file)

            print(f"\n[{idx}/{len(tasks_to_run)}] ⚙️ กำลังประมวลผล: {task_id} ({task['file_size']:,} bytes)")

            # อ่าน Source Code
            try:
                with open(src_path, "r", encoding="utf-8", errors="replace") as f:
                    source_code = f.read()
            except Exception as e:
                print(f"  ❌ ไม่สามารถอ่านไฟล์ {src_path}: {e}")
                stats["failed"] += 1
                state_data[task_id] = {
                    "project": proj_name,
                    "source_file": src_path.as_posix(),
                    "status": "FAILED",
                    "error": f"Read error: {e}",
                    "updated_at": datetime.now().isoformat()
                }
                save_atomic_json(state_file, state_data)
                continue

            # Proactive Compact สำหรับไฟล์ขนาดใหญ่ (> 25,000 ตัวอักษร)
            code_to_send = source_code
            if len(source_code) > 25000:
                compacted = compact_java_source(source_code)
                if len(compacted) < len(source_code):
                    code_to_send = compacted
                    print(f"  ⚡ ย่อโค้ดล่วงหน้า (ตัด Comment/Javadoc ลดลง {len(source_code)-len(compacted):,} chars)")

            junit_ver = detect_junit_version(proj_name, workspace_dir, args.junit)
            full_prompt = build_prompt(prompt_template, code_to_send, junit_version=junit_ver)

            # เรียก API
            api_result = call_deepseek_api_with_rotation(
                key_manager=key_manager,
                prompt=full_prompt,
                model=args.model,
                timeout=args.timeout,
                show_stream=args.show_stream,
                max_tokens=args.max_tokens
            )

            # 🛑 กรณีงบประมาณหรือโควต้าหมด
            if api_result.get("budget_exhausted") or api_result.get("all_keys_exhausted"):
                print(f"\n🛑 [HALTED] การทำงานหยุดชะงัก: {api_result.get('error')}")
                print(f"💾 บันทึกสถานะล่าสุดลง {state_file} เรียบร้อยแล้ว")
                break

            # กรณีเกิด Truncation หรือ โค้ดไม่สมบูรณ์ -> ทำการ Retry โดยลดขนาดและกำชับคำสั่ง
            extracted_code = extract_java_code(api_result.get("content", ""))
            is_valid = is_valid_complete_java_test(extracted_code)
            is_truncated = api_result.get("is_truncated") or api_result.get("finish_reason") == "length" or not is_valid

            if is_truncated and api_result.get("content"):
                print(f"  ⚠️ [TRUNCATION DETECTED] โค้ดขาดตอนรอบแรก กำลังลองใหม่ (Retry) โดยลดขนาดและเน้นเฉพาะ Core Branches...")
                # 1. ย่อโค้ดหากยังไม่ได้ย่อ
                if code_to_send == source_code:
                    compacted = compact_java_source(source_code)
                    if len(compacted) < len(source_code):
                        code_to_send = compacted

                # 2. ปรับ Prompt กำชับเป็นพิเศษ
                retry_prompt = build_prompt(prompt_template, code_to_send, junit_version=junit_ver) + (
                    "\n\n[ข้อกำหนดพิเศษสำหรับการลองใหม่]:\n"
                    "คำตอบรอบก่อนหน้ายาวเกินไปจนถูกตัดทอน (Output Truncated)! "
                    "ในรอบนี้ห้ามเขียน boilerplate หรือเทสต์ซ้ำซ้อนเด็ดขาด ให้เขียนเฉพาะ unit tests ที่กระชับที่สุด "
                    "สำหรับ public methods สำคัญและ core branches ที่จำเป็นเท่านั้น เพื่อให้ได้โค้ดที่ปิดคลาสสมบูรณ์ 100% ปิดด้วย '}'"
                )

                retry_result = call_deepseek_api_with_rotation(
                    key_manager=key_manager,
                    prompt=retry_prompt,
                    model=args.model,
                    timeout=args.timeout,
                    show_stream=args.show_stream,
                    max_tokens=args.max_tokens
                )

                if retry_result.get("success"):
                    retry_extracted = extract_java_code(retry_result["content"])
                    if is_valid_complete_java_test(retry_extracted):
                        print("  ✅ [RETRY SUCCESS] การลองใหม่สำเร็จ ได้รับโค้ดที่สมบูรณ์ครบถ้วน!")
                        api_result = retry_result
                        extracted_code = retry_extracted
                        is_valid = True
                        is_truncated = False

            # กรณีที่ผลลัพธ์ล้มเหลวโดยไม่ใช่ปัญหา truncation
            if not api_result.get("success") and not is_truncated:
                err_msg = api_result.get("error", "API request failed")
                print(f"  ❌ ไม่สำเร็จ: {err_msg}")
                stats["failed"] += 1
                state_data[task_id] = {
                    "project": proj_name,
                    "source_file": src_path.as_posix(),
                    "status": "FAILED",
                    "error": err_msg,
                    "updated_at": datetime.now().isoformat()
                }
                save_atomic_json(state_file, state_data)
                continue

            finish_reason = api_result.get("finish_reason", "unknown")
            content_chars = api_result.get("content_char_count", len(api_result.get("content", "")))
            reasoning_chars = api_result.get("reasoning_char_count", 0)
            usage = api_result.get("usage", {})
            completion_tokens = usage.get("completion_tokens", 0)

            # หากยังคงเป็น Truncated หรือ โค้ดไม่ผ่าน Sanity Check
            if is_truncated or not is_valid:
                print(f"  ⚠️ [LIMIT_REACHED] โค้ดขาดตอน (finish_reason={finish_reason}, valid={is_valid})")
                print(f"     จะไม่บันทึกเป็น GENERATED และจะไม่เขียนทับไฟล์เดิมที่สมบูรณ์")
                stats["limit_reached"] += 1

                state_data[task_id] = {
                    "project": proj_name,
                    "source_file": src_path.as_posix(),
                    "status": "LIMIT_REACHED",
                    "finish_reason": finish_reason,
                    "is_syntax_valid": is_valid,
                    "usage": usage,
                    "content_char_count": content_chars,
                    "reasoning_char_count": reasoning_chars,
                    "used_key": api_result.get("used_key_masked"),
                    "note": "Output truncated or bracket unbalanced after retry",
                    "updated_at": datetime.now().isoformat()
                }
                save_atomic_json(state_file, state_data)
                continue

            # บันทึกไฟล์ที่สำเร็จแบบ Atomic Write
            test_filename = get_test_class_name(src_path.name, extracted_code)
            final_output_path = target_dir / test_filename

            save_atomic_text(final_output_path, extracted_code)
            file_size = final_output_path.stat().st_size
            print(f"  💾 บันทึกไฟล์สำเร็จ: {final_output_path.name} ({file_size:,} bytes)")

            if reasoning_chars > 0:
                print(f"     🧠 Reasoning Chars: {reasoning_chars:,} | Content Chars: {content_chars:,} | Completion Tokens: {completion_tokens:,}")

            state_data[task_id] = {
                "project": proj_name,
                "source_file": src_path.as_posix(),
                "status": "GENERATED",
                "test_file": final_output_path.as_posix(),
                "file_size_bytes": file_size,
                "finish_reason": finish_reason,
                "usage": usage,
                "content_char_count": content_chars,
                "reasoning_char_count": reasoning_chars,
                "used_key": api_result.get("used_key_masked"),
                "elapsed_seconds": round(api_result.get("elapsed", 0), 2),
                "model_quota": api_result.get("model_quota"),
                "updated_at": datetime.now().isoformat()
            }
            save_atomic_json(state_file, state_data)
            stats["generated"] += 1

            if idx < len(tasks_to_run) and args.delay > 0:
                time.sleep(args.delay)

    except KeyboardInterrupt:
        print("\n\n⚠️ [INTERRUPTED] ได้รับสัญญาณยกเลิก (Ctrl+C)")
        print(f"💾 กำลังบันทึก State ล่าสุดลง {state_file}...")
        save_atomic_json(state_file, state_data)
        print("✅ บันทึก State เรียบร้อยแล้ว")
        sys.exit(0)

    # สรุปผล
    print("\n" + "=" * 80)
    print("📊 สรุปผลการทำงาน (DeepSeek-V4-Flash Test Generation)")
    print("=" * 80)
    print(f"• ทั้งหมดในรอบนี้         : {stats['total']}")
    print(f"• สร้างสำเร็จ (GENERATED): {stats['generated']}")
    print(f"• ติดขีดจำกัด (Limit)     : {stats['limit_reached']}")
    print(f"• ล้มเหลว (Failed)       : {stats['failed']}")
    print(f"📄 บันทึก State ไว้ที่  : {state_file}")
    print("=" * 80 + "\n")


if __name__ == "__main__":
    main()
