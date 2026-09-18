#!/usr/bin/env python3
# -*- coding: utf-8 -*-

"""
generate_claude_tests.py
------------------------
สคริปต์สำหรับอ่านไฟล์ Java Source Code จาก Resoucre ทีละไฟล์ ทีละโปรเจกต์
แล้วส่ง Request ไปยัง KKU GenAI API (โมเดล claude-sonnet-5) ตาม Template ใน promt.md
จากนั้นดึงโค้ด JUnit Test จาก Response มาบันทึกลงใน Claude-sonnet-5/TestCode/<Project>_1_buggy/

คุณสมบัติพิเศษ:
- Real-time Live Progress & Streaming: แสดงสถานะการสร้างโค้ดแบบวินาทีต่อวินาที ไม่ค้างเงียบ ไม่ทำให้รู้สึกว่าแฮงก์
- Multi-Key Rotation & Auto-Failover: รองรับหลาย API Key สลับใช้งานแบบ Round-Robin และสลับคีย์อัตโนมัติเมื่อคีย์ใดคีย์หนึ่งติด Quota/Rate Limit
- ระบบ Memory / State Tracking: จดจำสถานะแต่ละไฟล์ลงใน generation_state.json อัตโนมัติ รันต่อได้ทันทีไม่เสียเวลา
- Handle Token / Quota Exhausted: ตรวจจับกรณีโควต้าหมดทุกคีย์แล้วหยุดทำงานทันที ไม่ฝืนยิงต่อให้เสียเวลา
- Safe Interrupt: ดักจับ Ctrl+C และบันทึกสถานะล่าสุดก่อนปิดโปรแกรมเสมอ
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

# ปรับปรุงการแสดงผล UTF-8 บน Windows Console ป้องกัน UnicodeEncodeError
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


# ==========================================
# 1. ฟังก์ชันโหลดค่าคอนฟิกจาก .env
# ==========================================
def load_env(env_path: Path = None) -> dict:
    """อ่านไฟล์ .env แบบ Native โดยไม่ต้องติดตั้ง python-dotenv"""
    env_vars = {}
    search_paths = []
    if env_path:
        search_paths.append(Path(env_path))
    
    current_dir = Path(__file__).resolve().parent
    workspace_root = current_dir.parent
    
    search_paths.extend([
        workspace_root / ".env",
        current_dir / ".env",
        Path.cwd() / ".env"
    ])
    
    found_file = None
    for p in search_paths:
        if p.is_file():
            found_file = p
            break
            
    if found_file:
        with open(found_file, "r", encoding="utf-8") as f:
            for line in f:
                line = line.strip()
                if not line or line.startswith("#"):
                    continue
                if "=" in line:
                    k, v = line.split("=", 1)
                    k = k.strip()
                    v = v.strip().strip("'\"")
                    env_vars[k] = v
                    
    return env_vars


def get_all_api_keys(cli_keys: list = None, env_path: str = None) -> list:
    """
    ค้นหา API Keys ทั้งหมดที่ระบุไว้ใน:
    1. CLI Argument (--api-key)
    2. ไฟล์ .env (เช่น API_KEY, API_KEY2, API_KEY_1, API_KEYS=k1,k2)
    3. System Environment Variables
    """
    keys = []
    
    # 1. จาก CLI Arguments
    if cli_keys:
        for k in cli_keys:
            if "," in k:
                keys.extend([x.strip() for x in k.split(",") if x.strip()])
            elif k.strip():
                keys.append(k.strip())
                
    # 2. จากไฟล์ .env
    env_vars = load_env(Path(env_path) if env_path else None)
    key_pattern = re.compile(r'^(API_KEY|CLAUDE_API_KEY|KKU_API_KEY)(_?\d+)?$', re.IGNORECASE)
    comma_pattern = re.compile(r'^(API_KEYS|CLAUDE_API_KEYS|KKU_API_KEYS)$', re.IGNORECASE)
    
    for k, v in env_vars.items():
        if not v:
            continue
        if comma_pattern.match(k):
            keys.extend([x.strip() for x in v.split(",") if x.strip()])
        elif key_pattern.match(k):
            if "," in v:
                keys.extend([x.strip() for x in v.split(",") if x.strip()])
            else:
                keys.append(v.strip())

    # 3. จาก System Environment Variables
    for k, v in os.environ.items():
        if not v:
            continue
        if comma_pattern.match(k):
            keys.extend([x.strip() for x in v.split(",") if x.strip()])
        elif key_pattern.match(k):
            if "," in v:
                keys.extend([x.strip() for x in v.split(",") if x.strip()])
            else:
                keys.append(v.strip())

    # ตัดคีย์ที่ซ้ำกันออกโดยรักษาลำดับเดิม
    seen = set()
    unique_keys = []
    for k in keys:
        if k and k not in seen:
            seen.add(k)
            unique_keys.append(k)
            
    return unique_keys


# ==========================================
# 2. คลาส KeyManager จัดการการสลับคีย์ API
# ==========================================
class KeyManager:
    """
    คลาสบริหารจัดการ API Keys หลายชุด:
    - สลับคีย์แบบ Round-Robin ทุกครั้งที่เรียกสำเร็จ
    - สลับคีย์ทันที (Failover) เมื่อพบคีย์ใดโควต้าหมด หรือติด Rate Limit
    - ตัดคีย์ที่โควต้าหมดออกจากคิว ไม่ให้ถูกนำมาใช้อีกในรอบการทำงานนี้
    """
    def __init__(self, keys: list):
        self.keys = list(keys)
        self.current_idx = 0
        self.exhausted_keys = set()
        self.key_quota = {}  # key -> dict ของ model_quota
        
    @property
    def total_count(self) -> int:
        return len(self.keys)
        
    def get_active_keys(self) -> list:
        return [k for k in self.keys if k not in self.exhausted_keys]
        
    def get_current_key(self) -> str:
        active = self.get_active_keys()
        if not active:
            return None
        return active[self.current_idx % len(active)]
        
    def rotate(self):
        """หมุนเวียนไปยังคีย์ถัดไป (Round-Robin)"""
        active = self.get_active_keys()
        if len(active) > 1:
            self.current_idx = (self.current_idx + 1) % len(active)
            
    def update_quota(self, key: str, quota_info: dict):
        """บันทึกข้อมูลโควต้าล่าสุดของคีย์ และตรวจสอบว่าใกล้หมดหรือยัง"""
        if key and quota_info:
            self.key_quota[key] = quota_info
            rem = quota_info.get("daily_remaining_tokens")
            if rem is not None and rem <= 500:
                self.mark_exhausted(key, reason=f"โควต้าประจำวันใกล้หมด (เหลือ {rem:,} tokens)")

    def mark_exhausted(self, key: str, reason: str = ""):
        """มาร์คว่าคีย์นี้โควต้าหมด และจะไม่นำมาใช้อีก"""
        if key not in self.exhausted_keys:
            self.exhausted_keys.add(key)
            masked = self.mask_key(key)
            key_idx = self.keys.index(key) + 1
            print(f"\n  🛑 [KEY EXHAUSTED] คีย์ #{key_idx} ({masked}) โควต้าหมด ({reason})")
            
            active = self.get_active_keys()
            if active:
                print(f"  🔄 สลับไปใช้คีย์สำรองถัดไปทันที (เหลือพร้อมใช้งาน {len(active)}/{self.total_count} คีย์)")
                self.current_idx = self.current_idx % len(active)
            else:
                print(f"  ❌ คีย์ทั้งหมด ({self.total_count} คีย์) โควต้าหมดแล้ว!")
                
    def has_active_keys(self) -> bool:
        return len(self.get_active_keys()) > 0
        
    @staticmethod
    def mask_key(key: str) -> str:
        if not key:
            return ""
        if len(key) <= 12:
            return key[:3] + "..." + key[-3:]
        return f"{key[:8]}...{key[-6:]}"


# ==========================================
# 3. ระบบ Memory & State Management
# ==========================================
def load_state(state_file_path: Path) -> dict:
    """โหลดประวัติการทำงานจากไฟล์ generation_state.json"""
    if state_file_path.is_file():
        try:
            with open(state_file_path, "r", encoding="utf-8") as f:
                return json.load(f)
        except Exception as e:
            print(f"⚠️ Warning: ไม่สามารถอ่าน State file ({e}) จะเริ่มสร้าง State ใหม่")
    return {}


def save_state(state_file_path: Path, state_data: dict):
    """บันทึกประวัติการทำงานลง State file แบบทันที (Atomic Write)"""
    state_file_path.parent.mkdir(parents=True, exist_ok=True)
    temp_file = state_file_path.with_suffix(".tmp")
    try:
        with open(temp_file, "w", encoding="utf-8") as f:
            json.dump(state_data, f, ensure_ascii=False, indent=2)
        if temp_file.is_file():
            temp_file.replace(state_file_path)
    except Exception as e:
        print(f"⚠️ Warning: บันทึก State file ล้มเหลว: {e}")


# ==========================================
# 4. จัดการ Prompt และ Response
# ==========================================
def load_prompt_template(prompt_path: Path) -> str:
    """โหลด Template จาก promt.md"""
    if not prompt_path.is_file():
        raise FileNotFoundError(f"ไม่พบไฟล์ Template: {prompt_path}")
    with open(prompt_path, "r", encoding="utf-8") as f:
        return f.read()


def build_prompt(template: str, source_code: str, dependencies: str = "") -> str:
    """แทนที่ source code ลงใน Prompt Template"""
    prompt = template
    placeholder_src = "[full class source code ของ target class]"
    if placeholder_src in prompt:
        prompt = prompt.replace(placeholder_src, source_code)
    else:
        prompt = re.sub(r'(<source_code>)([\s\S]*?)(</source_code>)',
                        rf'\1\n{source_code}\n\3', prompt)
        
    placeholder_dep = "[signature ของ class ที่ target class เรียกใช้ ถ้ามี]"
    if placeholder_dep in prompt:
        dep_content = dependencies.strip() if dependencies else "// No specific dependencies provided"
        prompt = prompt.replace(placeholder_dep, dep_content)
        
    return prompt


def extract_java_code(response_text: str) -> str:
    """
    สกัดโค้ด Java จาก Response ที่ได้รับจากโมเดล
    รองรับทั้งโค้ดล้วน และโค้ดที่ครอบด้วย ```java ... ```
    คำเตือน: สกัดเฉพาะโค้ดจาก Response เท่านั้น ห้ามเขียนขึ้นมาเองเด็ดขาด
    """
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
    """ตรวจสอบชื่อ Class ของ Test เพื่อนำมาใช้ตั้งชื่อไฟล์ .java"""
    match = re.search(r'\bpublic\s+class\s+(\w+)', java_code)
    if match:
        return f"{match.group(1)}.java"
        
    match = re.search(r'\bclass\s+(\w*Test\w*)', java_code)
    if match:
        return f"{match.group(1)}.java"
        
    base_name = os.path.splitext(os.path.basename(source_filename))[0]
    return f"{base_name}Test.java"


def compact_java_source(source_code: str) -> str:
    """
    ลดขนาด Java Source Code สำหรับกรณีคลาสมีขนาดใหญ่มาก
    ตัด Comments และ Javadoc ที่ไม่จำเป็นออก เพื่อลดขนาด Token ลง 25-40%
    ช่วยให้ TTFT เร็วขึ้นมาก และแก้ปัญหา Request Entity Too Large, Gateway Timeout (504/502)
    โดยคง string literals และ logic ของ Class/Method/Field ไว้ครบ 100%
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


# ==========================================
# 5. ฟังก์ชันตรวจสอบ Token / Quota Exhaustion & Size Errors
# ==========================================
def is_quota_exceeded(status_code: int, error_text: str) -> bool:
    """
    ตรวจสอบว่า Error นั้นเกิดจาก Token หรือ Quota หมด หรือ Daily/Rate Limit หรือไม่
    เช่น 401 daily limit, 429 insufficient_quota, 402 payment required
    """
    low = error_text.lower()
    quota_keywords = [
        "quota", "credit", "balance", "insufficient", "exceeded your current quota",
        "billing", "token limit", "usage limit", "out of credits",
        "daily limit", "rate limit", "reached daily limit", "limit reached", "exhausted",
        "too many requests"
    ]
    if status_code in [401, 402, 403, 429]:
        return any(k in low for k in quota_keywords)
    return any(k in low for k in ["daily limit", "reached daily limit", "exceeded your current quota"])


def is_context_or_payload_error(status_code: int, error_text: str) -> bool:
    """
    ตรวจสอบว่า Error เกิดจากคลาสมีขนาดใหญ่เกินไปหรือไม่ (Context Length / Payload Too Large / Timeout)
    """
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


# ==========================================
# 6. ฟังก์ชันยิง API แบบ Streaming & Real-time Logging
# ==========================================
class WaitingTicker:
    """Thread ช่วยพิมพ์สถานะแสดงว่ายังเชื่อมต่ออยู่ระหว่างรอแพ็กเกจแรกจากเซิร์ฟเวอร์"""
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
        if self.thread:
            self.thread.join(timeout=0.5)
        # ล้างบรรทัดปัจจุบัน
        sys.stdout.write("\r" + " " * 95 + "\r")
        sys.stdout.flush()


def call_single_api_stream(
    api_key: str,
    prompt: str,
    base_url: str = "https://gen.ai.kku.ac.th/api/v1",
    model: str = "claude-sonnet-5",
    timeout: int = 60,
    max_retries: int = 1,
    retry_delay: int = 4,
    show_stream: bool = False
) -> dict:
    """
    ยิง Request ไปยัง KKU GenAI แบบ Streaming (SSE)
    แสดงผล Real-time ให้ผู้ใช้เห็นความคืบหน้าตลอดเวลาทุกวินาที
    พร้อมระบบตรวจจับ Error ก่อน Response และ Error ในสตรีม
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
                "content": "คุณคือวิศวกรทดสอบซอฟต์แวร์ที่เชี่ยวชาญ JUnit และ code coverage ตอบเป็นโค้ด Java ทั้งไฟล์เท่านั้น ไม่มีคำอธิบายก่อน/หลังโค้ด ไม่มี markdown fence"
            },
            {
                "role": "user",
                "content": prompt
            }
        ],
        "stream": True
    }
    
    is_large_file = len(prompt) > 30000
    last_err = None
    
    for attempt in range(1, max_retries + 1):
        ticker = WaitingTicker("📡 ส่งคำขอแล้ว กำลังรอเซิร์ฟเวอร์ตอบกลับ (TTFT)", is_large=is_large_file)
        resp = None
        try:
            ticker.start()
            t0 = time.time()
            
            # ใช้ connect timeout 15s และ read timeout ตาม timeout ที่กำหนด
            resp = requests.post(
                url,
                headers=headers,
                json=payload,
                stream=True,
                timeout=(15, timeout)
            )
            
            # ตรวจสอบกรณีเกิด Error ทันที (เช่น HTTP 400/401/402/413/429/500/504)
            if resp.status_code != 200:
                ticker.stop()
                err_text = resp.text
                try:
                    err_json = resp.json()
                    err_text = err_json.get("error", {}).get("message", resp.text)
                    if isinstance(err_json.get("error"), str):
                        err_text = err_json["error"]
                except Exception:
                    pass
                
                # 1. ตรวจสอบกรณีโควต้าหมด หรือติด Daily / Rate Limit
                if is_quota_exceeded(resp.status_code, err_text):
                    return {
                        "success": False,
                        "quota_exhausted": True,
                        "error": f"Token/Quota/Daily Limit หมด (HTTP {resp.status_code}): {err_text}"
                    }
                
                # 2. ตรวจสอบกรณีคลาส/Prompt ใหญ่เกินไป (Payload too large / Context limit)
                if is_context_or_payload_error(resp.status_code, err_text):
                    return {
                        "success": False,
                        "payload_too_large": True,
                        "quota_exhausted": False,
                        "error": f"ไฟล์/Prompt มีขนาดใหญ่เกินขีดจำกัดของเซิร์ฟเวอร์ (HTTP {resp.status_code}): {err_text}"
                    }
                
                # 3. กรณีปัญหา Server ชั่วคราว (429, 500, 502, 503, 504)
                if resp.status_code in [429, 500, 502, 503, 504]:
                    print(f"    ⚠️ Warning: ได้รับ HTTP {resp.status_code} ({err_text[:80]}) - กำลังลองใหม่รอบที่ {attempt}/{max_retries}...")
                    time.sleep(retry_delay * attempt)
                    continue
                else:
                    return {
                        "success": False,
                        "quota_exhausted": False,
                        "error": f"HTTP {resp.status_code}: {err_text}"
                    }

            # กรณีสำเร็จ HTTP 200 -> เริ่มอ่าน Stream Chunks ทีละบรรทัด
            full_text = ""
            chunks_count = 0
            finish_reason = "stop"
            last_progress_time = 0
            ttft = 0
            first_chunk_received = False
            stream_error = None
            usage_data = None
            model_quota = None

            for line in resp.iter_lines(chunk_size=1024):
                if not line:
                    continue
                decoded = line.decode("utf-8", errors="replace")
                
                # ตรวจสอบ Error ที่อาจส่งมาในรูปแบบ JSON ตรงๆ ก่อนหรือระหว่างสตรีม
                if decoded.startswith("{") and '"error"' in decoded:
                    try:
                        err_obj = json.loads(decoded)
                        if "error" in err_obj:
                            err_val = err_obj["error"]
                            stream_error = err_val.get("message", decoded) if isinstance(err_val, dict) else str(err_val)
                            break
                    except Exception:
                        pass
                
                if decoded.startswith("data: "):
                    data_str = decoded[6:].strip()
                    if data_str == "[DONE]":
                        break
                    try:
                        chunk_json = json.loads(data_str)
                        
                        # ตรวจสอบ error ที่หุ้มใน data: {"error": ...}
                        if "error" in chunk_json:
                            err_val = chunk_json["error"]
                            stream_error = err_val.get("message", data_str) if isinstance(err_val, dict) else str(err_val)
                            break
                        
                        if "usage" in chunk_json:
                            usage_data = chunk_json["usage"]
                        if "model_quota" in chunk_json:
                            model_quota = chunk_json["model_quota"]

                        choice = chunk_json["choices"][0]
                        delta = choice.get("delta", {})
                        content = delta.get("content", "")
                        if choice.get("finish_reason"):
                            finish_reason = choice["finish_reason"]
                            
                        if content:
                            if not first_chunk_received:
                                first_chunk_received = True
                                ticker.stop()
                                ttft = time.time() - t0
                                if show_stream:
                                    print(f"  ⚡ เริ่มสร้างโค้ด (TTFT: {ttft:.1f}s) | โค้ดกำลังสตรีมสด:")
                                    print("  " + "-" * 70)

                            full_text += content
                            chunks_count += 1
                            
                            if show_stream:
                                sys.stdout.write(content)
                                sys.stdout.flush()
                            else:
                                now = time.time()
                                if now - last_progress_time >= 0.25:
                                    last_progress_time = now
                                    elapsed = now - t0
                                    est_tokens = len(full_text) // 4
                                    rate = (len(full_text) / (elapsed - ttft)) if (elapsed - ttft) > 0.1 else 0
                                    sys.stdout.write(
                                        f"\r  ⏳ กำลังสร้างโค้ด... [เวลา: {elapsed:.1f}s | ได้รับ: {len(full_text):,} chars (~{est_tokens:,} tokens) | {rate:.0f} c/s]"
                                    )
                                    sys.stdout.flush()
                    except Exception:
                        pass

            ticker.stop()
            total_elapsed = time.time() - t0
            est_tokens = len(full_text) // 4

            # กรณีพบ Error ในสตรีม
            if stream_error:
                print(f"\n    ⚠️ ได้รับ Error ในสตรีม: {stream_error}")
                if is_quota_exceeded(429, stream_error):
                    return {
                        "success": False,
                        "quota_exhausted": True,
                        "error": f"Quota/Daily Limit หมด: {stream_error}"
                    }
                if is_context_or_payload_error(400, stream_error):
                    return {
                        "success": False,
                        "payload_too_large": True,
                        "quota_exhausted": False,
                        "error": f"ไฟล์/Prompt มีขนาดใหญ่เกินไป: {stream_error}"
                    }
                last_err = stream_error
                time.sleep(retry_delay * attempt)
                continue

            # ตรวจสอบว่าได้รับเนื้อหาจริงหรือไม่ ไม่ปล่อยให้ผ่านกรณีได้ empty string
            if not full_text.strip() or len(full_text.strip()) < 50:
                last_err = "ไม่ได้รับเนื้อหาโค้ดจากเซิร์ฟเวอร์ (Empty response) อาจเกิดจากการประมวลผลล้มเหลวหรือตัดการเชื่อมต่อก่อนเริ่มส่ง"
                print(f"\n    ⚠️ {last_err} - กำลังลองใหม่รอบที่ {attempt}/{max_retries}...")
                time.sleep(retry_delay * attempt)
                continue

            if show_stream:
                print("\n  " + "-" * 70)

            sys.stdout.write(
                f"\r  ✅ ได้รับ Response ครบถ้วน! [เวลา: {total_elapsed:.1f}s | รวม: {len(full_text):,} ตัวอักษร (~{est_tokens:,} tokens) | ชิ้นข้อมูล: {chunks_count:,}]\n"
            )
            sys.stdout.flush()

            if model_quota:
                rem = model_quota.get("daily_remaining_tokens")
                tot = model_quota.get("daily_quota_tokens")
                used = model_quota.get("daily_usage_tokens")
                if rem is not None and tot is not None:
                    print(f"  📊 Quota โมเดล: คงเหลือ {rem:,} / {tot:,} tokens (ใช้สะสมวันนี้ {used:,} tokens)")

            return {
                "success": True,
                "content": full_text,
                "finish_reason": finish_reason,
                "elapsed": total_elapsed,
                "usage": usage_data or {
                    "estimated_completion_tokens": est_tokens
                },
                "model_quota": model_quota
            }

        except (requests.exceptions.Timeout, requests.exceptions.ReadTimeout) as e:
            ticker.stop()
            last_err = f"Gateway TTFT Timeout ({timeout}s) - เซิร์ฟเวอร์/คิวค้าง: {e}"
            print(f"\n    ⚠️ {last_err}")
            return {
                "success": False,
                "is_timeout": True,
                "timeout_seconds": timeout,
                "quota_exhausted": False,
                "error": f"Gateway TTFT Timeout ({timeout}s)"
            }
        except requests.exceptions.RequestException as e:
            ticker.stop()
            last_err = e
            print(f"\n    ⚠️ Network Exception ({e}) - กำลังลองใหม่รอบที่ {attempt}/{max_retries}...")
            time.sleep(retry_delay * attempt)
        finally:
            ticker.stop()
            if resp:
                try:
                    resp.close()
                except Exception:
                    pass
            
    return {
        "success": False,
        "quota_exhausted": False,
        "error": f"Failed after {max_retries} retries: {str(last_err)}"
    }


def call_claude_api_with_rotation(
    key_manager: KeyManager,
    prompt: str,
    base_url: str = "https://gen.ai.kku.ac.th/api/v1",
    model: str = "claude-sonnet-5",
    timeout: int = 60,
    show_stream: bool = False
) -> dict:
    """
    ยิง API พร้อมระบบ Multi-Key Rotation & Auto-Failover:
    - สลับคีย์แบบ Round-Robin
    - สลับคีย์สำรองทันทีเมื่อพบคีย์โควต้าหมด หรือเกิด Timeout
    - สตรีมผลลัพธ์แบบ Real-time ให้เห็นความคืบหน้าตลอดเวลา
    """
    tried_in_request = set()
    last_res = None
    
    while key_manager.has_active_keys():
        current_key = key_manager.get_current_key()
        
        if current_key in tried_in_request and len(tried_in_request) >= len(key_manager.get_active_keys()):
            break
        tried_in_request.add(current_key)
        
        key_idx = key_manager.keys.index(current_key) + 1
        masked = key_manager.mask_key(current_key)
        print(f"  🔑 ใช้ API Key #{key_idx} ({masked})...")
        
        res = call_single_api_stream(
            api_key=current_key,
            prompt=prompt,
            base_url=base_url,
            model=model,
            timeout=timeout,
            show_stream=show_stream
        )
        last_res = res
        
        if res["success"]:
            if res.get("model_quota"):
                key_manager.update_quota(current_key, res["model_quota"])
            key_manager.rotate()
            res["used_key_idx"] = key_idx
            res["used_key_masked"] = masked
            return res
            
        if res.get("quota_exhausted"):
            key_manager.mark_exhausted(current_key, res.get("error", ""))
            continue

        # หากเป็นข้อผิดพลาดจากขนาดไฟล์ใหญ่เกินไป (Payload too large) การเปลี่ยนคีย์จะไม่ช่วย
        if res.get("payload_too_large"):
            return res

        # กรณี TTFT Timeout ให้ทำ Fast Failover สลับไปลองคีย์ถัดไปทันที
        if res.get("is_timeout"):
            active_keys = key_manager.get_active_keys()
            if len(tried_in_request) < len(active_keys):
                print(f"  ⏱️ [TIMEOUT FAILOVER] เซิร์ฟเวอร์ไม่ตอบกลับภายใน {timeout}s คาดว่าคิวค้าง กำลังสลับไปใช้คีย์สำรองถัดไป...")
                key_manager.rotate()
                continue
            else:
                return {
                    "success": False,
                    "is_timeout": True,
                    "all_keys_exhausted": False,
                    "error": f"Gateway TTFT Timeout ({timeout}s)"
                }
            
        if len(key_manager.get_active_keys()) > 1:
            print(f"  ⚠️ ลองสลับไปใช้คีย์สำรองถัดไปเนื่องจาก Error: {res.get('error')[:60]}")
            key_manager.rotate()
            continue
        else:
            return res
            
    if not key_manager.has_active_keys():
        return {
            "success": False,
            "all_keys_exhausted": True,
            "error": "คีย์ API ทั้งหมดในระบบโควต้าหมดแล้ว หรือไม่สามารถเชื่อมต่อได้"
        }
    
    return {
        "success": False,
        "all_keys_exhausted": False,
        "is_timeout": last_res.get("is_timeout", False) if last_res else False,
        "error": last_res.get("error", "ไม่สามารถเรียกใช้งาน API ได้หลังลองทุกคีย์ที่พร้อมใช้งาน") if last_res else "Failed after trying all keys"
    }


# ==========================================
# 7. ฟังก์ชันค้นหาไฟล์ Test และ Sync Memory State
# ==========================================
def find_existing_test_file(target_proj_dir: Path, source_file: Path, recorded_test_path: str = None):
    """
    ตรวจสอบไฟล์ Test ปลายทางที่สอดคล้องกับคลาสต้นทางบนดิสก์
    รองรับทั้ง:
      1. ไฟล์ที่บันทึกไว้ใน Memory State (recorded_test_path)
      2. ไฟล์ชื่อตามแบบมาตรฐาน เช่น {ClassName}Test.java ในโฟลเดอร์ปลายทาง
      3. ไฟล์ที่อาจอยู่ในโฟลเดอร์โปรเจกต์คู่ขนาน (_buggy หรือแบบไม่มี _buggy)
      4. ค้นหาไฟล์ *Test.java หรือ Test*.java ที่ชื่อคลาสตรงกันในโฟลเดอร์ของโปรเจกต์
    โดยต้องมีขนาดสมบูรณ์ (> 50 ไบต์)
    """
    stem = source_file.stem
    stem_lower = stem.lower()
    
    # 1. ตรวจสอบจากพาธที่บันทึกไว้ใน Memory
    if recorded_test_path:
        p = Path(recorded_test_path)
        if p.is_file() and p.stat().st_size > 50:
            return p
            
    # 2. ตรวจสอบชื่อมาตรฐาน {ClassName}Test.java ในโฟลเดอร์ปลายทาง
    expected = target_proj_dir / f"{stem}Test.java"
    if expected.is_file() and expected.stat().st_size > 50:
        return expected

    # 3. ตรวจสอบโฟลเดอร์โปรเจกต์คู่ขนาน (กรณีลงท้ายด้วย _buggy หรือไม่มี _buggy)
    dirs_to_check = [target_proj_dir]
    if target_proj_dir.name.endswith("_buggy"):
        alt_name = target_proj_dir.name[:-6]
        dirs_to_check.append(target_proj_dir.parent / alt_name)
    else:
        dirs_to_check.append(target_proj_dir.parent / f"{target_proj_dir.name}_buggy")

    for d in dirs_to_check:
        if not d.is_dir():
            continue
            
        cand_expected = d / f"{stem}Test.java"
        if cand_expected.is_file() and cand_expected.stat().st_size > 50:
            return cand_expected
            
        cand_prefix = d / f"Test{stem}.java"
        if cand_prefix.is_file() and cand_prefix.stat().st_size > 50:
            return cand_prefix

        # ค้นหาไฟล์ *Test.java ในโฟลเดอร์ของโปรเจกต์ที่สอดคล้องกับคลาสต้นทาง
        for cand in d.glob("*.java"):
            if cand.is_file() and cand.stat().st_size > 50:
                c_stem_lower = cand.stem.lower()
                if c_stem_lower == f"{stem_lower}test" or c_stem_lower == f"test{stem_lower}":
                    return cand
                    
    return None


def sync_existing_tests_to_memory(tasks: list, state_data: dict, state_file: Path) -> int:
    """
    สแกนโฟลเดอร์ปลายทาง (test_code_dir) ของแต่ละ task ก่อนเริ่มประมวลผล (Pre-run Sync)
    หากตรวจพบไฟล์ Test ที่มีอยู่จริงบนดิสก์และมีขนาดสมบูรณ์ (> 50 bytes)
    แต่ใน Memory (state_data) ยังไม่ได้ถูกบันทึกเป็น COMPLETED
    จะทำการซิงค์เข้า Memory ให้อัตโนมัติ (รองรับกรณีสร้างหรือคัดลอกไฟล์มาจากภายนอก)
    """
    synced_count = 0
    for task in tasks:
        task_id = task["task_id"]
        target_dir = task["target_proj_dir"]
        src_path = task["source_file"]
        
        entry = state_data.get(task_id, {})
        recorded_path = entry.get("test_file")
        found_file = find_existing_test_file(target_dir, src_path, recorded_path)

        if found_file:
            if entry.get("status") != "COMPLETED":
                state_data[task_id] = {
                    "project": task["project_name"],
                    "source_file": src_path.as_posix(),
                    "status": "COMPLETED",
                    "test_file": found_file.as_posix(),
                    "file_size_bytes": found_file.stat().st_size,
                    "note": "MANUAL_DETECTED",
                    "updated_at": datetime.now().isoformat()
                }
                synced_count += 1
                print(f"  🔍 [SYNC: MANUAL] ตรวจพบไฟล์ Test ที่ทำไว้แล้วภายนอก: {task_id} -> {found_file.name} (ซิงค์เข้า Memory เรียบร้อย)")

    if synced_count > 0:
        save_state(state_file, state_data)
        print(f"💾 [SYNC: COMPLETED] บันทึกการซิงค์เข้า Memory ({state_file}) สำเร็จ {synced_count} ไฟล์\n")

    return synced_count


def check_live_quotas(key_manager: KeyManager, model: str = "claude-sonnet-5", base_url: str = "https://gen.ai.kku.ac.th/api/v1"):
    """
    ตรวจสอบโควต้าคงเหลือจริงของทุกคีย์จาก KKU IntelSphere API
    """
    print("\n================================================================================")
    print(f"📊 ตรวจสอบโควต้า API Key ประจำวัน (KKU IntelSphere API - Model: {model})")
    print("================================================================================")
    url = f"{base_url.rstrip('/')}/chat/completions"
    for i, k in enumerate(key_manager.keys, 1):
        masked = key_manager.mask_key(k)
        headers = {
            "Content-Type": "application/json",
            "Authorization": f"Bearer {k}"
        }
        payload = {
            "model": model,
            "messages": [{"role": "user", "content": "ping"}],
            "max_tokens": 1
        }
        try:
            resp = requests.post(url, headers=headers, json=payload, timeout=15)
            if resp.status_code == 200:
                data = resp.json()
                quota = data.get("model_quota", {})
                rem = quota.get("daily_remaining_tokens")
                tot = quota.get("daily_quota_tokens")
                used = quota.get("daily_usage_tokens")
                key_manager.update_quota(k, quota)
                status_icon = "🟢" if (isinstance(rem, int) and rem > 5000) else ("🟡" if isinstance(rem, int) and rem > 0 else "🛑")
                rem_str = f"{rem:,}" if isinstance(rem, int) else str(rem)
                tot_str = f"{tot:,}" if isinstance(tot, int) else str(tot)
                used_str = f"{used:,}" if isinstance(used, int) else str(used)
                print(f"  {status_icon} Key #{i} ({masked}): คงเหลือ {rem_str} / {tot_str} tokens (ใช้ไปแล้ว {used_str} tokens)")
            else:
                err_text = resp.text
                if "daily limit" in err_text.lower():
                    key_manager.mark_exhausted(k, reason="Reached daily limit")
                    print(f"  🛑 Key #{i} ({masked}): โควต้าประจำวันหมดแล้ว (This model reached daily limit)")
                else:
                    print(f"  ⚠️ Key #{i} ({masked}): HTTP {resp.status_code} ({err_text[:80]})")
        except Exception as e:
            print(f"  ⚠️ Key #{i} ({masked}): ไม่สามารถเชื่อมต่อเซิร์ฟเวอร์ ({e})")
    print("================================================================================\n")


def print_memory_status(state_file: Path, tasks: list, key_manager: KeyManager):
    """พิมพ์สถานะภาพรวมจาก Memory File พร้อมสถานะ API Keys"""
    state_data = load_state(state_file)
    print("\n================================================================================")
    print("📊 รายงานสถานะความคืบหน้าปัจจุบัน (Memory Status)")
    print(f"📄 State File: {state_file}")
    print(f"🔑 API Keys:   {key_manager.total_count} คีย์ที่ตรวจพบ")
    for i, k in enumerate(key_manager.keys, 1):
        status_str = "🛑 หมดโควต้า" if k in key_manager.exhausted_keys else "🟢 พร้อมใช้งาน"
        quota_str = ""
        if k in key_manager.key_quota:
            q = key_manager.key_quota[k]
            rem = q.get("daily_remaining_tokens")
            tot = q.get("daily_quota_tokens")
            if rem is not None and tot is not None:
                quota_str = f" [เหลือ: {rem:,}/{tot:,} tokens]"
        print(f"    Key #{i}: {key_manager.mask_key(k)} ({status_str}){quota_str}")
    print("================================================================================")
    
    completed_count = 0
    failed_count = 0
    pending_count = 0
    
    for task in tasks:
        task_id = task["task_id"]
        entry = state_data.get(task_id)
        
        if entry and entry.get("status") == "COMPLETED":
            completed_count += 1
            test_file = entry.get("test_file", "N/A")
            print(f"  ✅ [COMPLETED] {task_id} -> {test_file}")
        elif entry and entry.get("status") == "FAILED":
            failed_count += 1
            err = entry.get("error", "Unknown error")
            print(f"  ❌ [FAILED]    {task_id} -> Error: {err}")
        else:
            pending_count += 1
            print(f"  ⏳ [PENDING]   {task_id}")
            
    print("--------------------------------------------------------------------------------")
    print(f"รวมทั้งหมด: {len(tasks)} | สำเร็จ: {completed_count} | ล้มเหลว: {failed_count} | คงเหลือ: {pending_count}")
    print("================================================================================\n")


# ==========================================
# 8. ฟังก์ชันหลัก (Main Execution)
# ==========================================
def main():
    parser = argparse.ArgumentParser(
        description="สคริปต์ส่ง Code จาก Resoucre ไป Gen JUnit Test ด้วย Claude Sonnet 5 (KKU GenAI)"
    )
    parser.add_argument("--project", "-p", type=str, default=None,
                        help="ระบุโปรเจกต์เฉพาะที่ต้องการรัน (เช่น Codec_1 หรือ Chart_1) ถ้าไม่ระบุจะรันทุกโปรเจกต์")
    parser.add_argument("--file", "-f", type=str, default=None,
                        help="ระบุชื่อไฟล์เฉพาะ (เช่น Caverphone.java)")
    parser.add_argument("--api-key", "-k", action="append", default=[],
                        help="API Key (สามารถระบุซ้ำได้หลายครั้งหรือคั่นด้วยจุลภาค เช่น -k key1 -k key2 หรือดึงจาก .env)")
    parser.add_argument("--env-file", type=str, default=None,
                        help="พาธไฟล์ .env")
    parser.add_argument("--state-file", type=str, default=None,
                        help="พาธไฟล์บันทึกสถานะ Memory (ค่าเริ่มต้น: Claude-sonnet-5/generation_state.json)")
    parser.add_argument("--overwrite", action="store_true", default=False,
                        help="บังคับเขียนทับไฟล์ Test และสร้างใหม่ แม้เคยทำเสร็จแล้ว")
    parser.add_argument("--reset-state", action="store_true", default=False,
                        help="ล้างประวัติสถานะใน Memory file ทั้งหมดและเริ่มใหม่")
    parser.add_argument("--status", action="store_true", default=False,
                        help="แสดงรายงานสถานะปัจจุบันจาก Memory file โดยไม่เรียกใช้งาน API")
    parser.add_argument("--show-stream", "-v", action="store_true", default=False,
                        help="แสดงโค้ด Java ที่กำลังสตรีมแบบสดลงบนหน้าจอคอนโซล")
    parser.add_argument("--delay", type=float, default=2.0,
                        help="หน่วงเวลาระหว่าง Request แต่ละครั้ง (วินาที, ค่าเริ่มต้น: 2.0)")
    parser.add_argument("--dry-run", action="store_true", default=False,
                        help="ทดสอบแสดงรายการไฟล์ที่จะถูกประมวลผล โดยไม่ยิง API จริง")
    parser.add_argument("--model", type=str, default="claude-sonnet-5",
                        help="โมเดลที่ใช้ (ค่าเริ่มต้น: claude-sonnet-5)")
    parser.add_argument("--timeout", type=int, default=60,
                        help="เวลา Timeout สูงสุดต่อ Request (วินาที, ค่าเริ่มต้น: 60)")
    parser.add_argument("--no-auto-compact", action="store_true", default=False,
                        help="ปิดการทำงานของ Auto-compact โค้ดสำหรับคลาสขนาดใหญ่")
    parser.add_argument("--sort-by-size", action="store_true", default=False,
                        help="จัดเรียงคิวงานตามขนาดไฟล์จากน้อยไปมาก (Smallest first)")
    parser.add_argument("--check-quota", action="store_true", default=False,
                        help="ตรวจสอบและแสดงโควต้าคงเหลือจริงของทุก API Key จากเซิร์ฟเวอร์ KKU แล้วหยุดทำงาน")
    args = parser.parse_args()

    # กำหนดพาธหลักของโฟลเดอร์
    workspace_dir = Path(__file__).resolve().parent.parent
    resource_dir = workspace_dir / "Resoucre"
    prompt_file = workspace_dir / "Claude-sonnet-5" / "Promt" / "promt.md"
    test_code_dir = workspace_dir / "Claude-sonnet-5" / "TestCode"
    state_file = Path(args.state_file) if args.state_file else (workspace_dir / "Claude-sonnet-5" / "generation_state.json")

    # 1. ตรวจหาและโหลด API Keys ทั้งหมด
    all_keys = get_all_api_keys(args.api_key, args.env_file)
    key_manager = KeyManager(all_keys)

    # หากผู้ใช้ต้องการตรวจสอบโควต้าสดจากเซิร์ฟเวอร์ (--check-quota)
    if args.check_quota:
        check_live_quotas(key_manager, model=args.model)
        sys.exit(0)

    print("================================================================================")
    print("🚀 Claude Sonnet 5 - JUnit Test Generation (Live Stream & Multi-Key)")
    print("================================================================================")
    print(f"📂 Workspace:    {workspace_dir}")
    print(f"📂 Resource Dir: {resource_dir}")
    print(f"📄 Prompt File:  {prompt_file}")
    print(f"📂 Output Dir:   {test_code_dir}")
    print(f"🧠 Memory State: {state_file}")
    print(f"🤖 Model:        {args.model}")
    print("================================================================================")

    # จัดการ Reset State
    if args.reset_state:
        if state_file.is_file():
            state_file.unlink()
            print("🗑️ ล้าง State file เรียบร้อยแล้ว (Reset State)")

    # โหลด Memory State เดิม
    state_data = load_state(state_file)

    # 1. ตรวจสอบ API Keys
    if not args.dry_run:
        if not key_manager.has_active_keys():
            print("\n❌ [ERROR] ไม่พบ API_KEY ในระบบ!")
            print("กรุณาดำเนินการข้อใดข้อหนึ่งต่อไปนี้:")
            print("  1. ใส่ในไฟล์ .env เช่น:")
            print("     API_KEY=sk_key1...")
            print("     API_KEY2=sk_key2...")
            print("  2. หรือระบุผ่าน Command line: python script/generate_claude_tests.py -k key1 -k key2")
            print("  3. หรือตั้งค่าตัวแปรระบบ: export API_KEY=<YOUR_KEY>\n")
            sys.exit(1)
        print(f"🔑 โหลด API Keys สำเร็จ: {key_manager.total_count} คีย์ (เปิดใช้งานระบบสลับคีย์อัตโนมัติ)")
        for i, k in enumerate(key_manager.keys, 1):
            print(f"    Key #{i}: {key_manager.mask_key(k)}")
    else:
        print("🔍 Mode: DRY-RUN (ไม่มีการยิง API จริง)")

    # 2. ค้นหาไฟล์ Java ใน Resoucre แยกตามโปรเจกต์
    if not resource_dir.is_dir():
        print(f"❌ [ERROR] ไม่พบโฟลเดอร์ Resoucre: {resource_dir}")
        sys.exit(1)

    project_dirs = sorted([d for d in resource_dir.iterdir() if d.is_dir()])
    if args.project:
        project_dirs = [d for d in project_dirs if d.name.lower() == args.project.lower()]

    if not project_dirs:
        print(f"⚠️ ไม่พบโฟลเดอร์โปรเจกต์ที่ตรงกับเงื่อนไขใน {resource_dir}")
        sys.exit(0)

    # รวบรวมรายการงานทั้งหมด
    tasks = []
    for p_dir in project_dirs:
        java_files = sorted(list(p_dir.rglob("*.java")))
        if args.file:
            java_files = [f for f in java_files if f.name.lower() == args.file.lower()]
            
        for j_file in java_files:
            rel_src_path = j_file.relative_to(p_dir).as_posix()
            target_proj_folder_name = p_dir.name
            if not target_proj_folder_name.endswith("_buggy"):
                target_proj_folder_name = f"{target_proj_folder_name}_buggy"
            
            target_proj_dir = test_code_dir / target_proj_folder_name
            task_id = f"{p_dir.name}/{rel_src_path}"
            file_size = j_file.stat().st_size if j_file.exists() else 0
            
            tasks.append({
                "task_id": task_id,
                "project_name": p_dir.name,
                "target_proj_dir": target_proj_dir,
                "source_file": j_file,
                "rel_src_path": rel_src_path,
                "file_size": file_size
            })

    # จัดเรียงคิวงานตามขนาดไฟล์ หากเปิดใช้งาน --sort-by-size
    if args.sort_by_size:
        tasks.sort(key=lambda x: x["file_size"])

    # ตรวจสอบและซิงค์ไฟล์ Test ที่มีอยู่แล้วบนดิสก์เข้าสู่ Memory (Disk & Memory Sync)
    sync_existing_tests_to_memory(tasks, state_data, state_file)

    # หากผู้ใช้ต้องการดูสถานะเท่านั้น (--status)
    if args.status:
        print_memory_status(state_file, tasks, key_manager)
        sys.exit(0)

    # 3. โหลด Prompt Template
    try:
        prompt_template = load_prompt_template(prompt_file)
        print("📄 Prompt Template: Loaded successfully")
    except Exception as e:
        print(f"❌ [ERROR] โหลด Prompt Template ล้มเหลว: {e}")
        sys.exit(1)

    if args.sort_by_size:
        print("⚡ [PRIORITY] จัดลำดับประมวลผล: ทำงานจากไฟล์ขนาดเล็กไปใหญ่ (Smallest first)")

    print(f"\n📋 รวมรายการไฟล์ที่ตรวจพบทั้งหมด: {len(tasks)} ไฟล์")
    print("--------------------------------------------------------------------------------")

    stats = {
        "total": len(tasks),
        "success": 0,
        "skipped": 0,
        "failed": 0
    }

    # 4. ประมวลผลทีละไฟล์ ทีละโปรเจกต์ (พร้อมดักจับ Ctrl+C)
    try:
        for idx, task in enumerate(tasks, 1):
            task_id = task["task_id"]
            proj_name = task["project_name"]
            src_path = task["source_file"]
            target_dir = task["target_proj_dir"]
            file_basename = src_path.name
            expected_test_filename = f"{src_path.stem}Test.java"
            target_file_path = target_dir / expected_test_filename

            print(f"\n[{idx}/{len(tasks)}] 📦 Project: {proj_name} | 📄 File: {file_basename}")

            # ตรวจสอบจาก Memory State และไฟล์จริงบนดิสก์เพื่อ Skip
            entry = state_data.get(task_id, {})
            is_completed_in_memory = (entry.get("status") == "COMPLETED")
            
            # ค้นหาไฟล์จริงบนดิสก์ (ทั้งชื่อที่คาดหมาย, ชื่อที่บันทึกใน test_file, หรือค้นหาใน target_dir)
            actual_disk_file = find_existing_test_file(target_dir, src_path, entry.get("test_file"))
            output_file_exists = actual_disk_file is not None

            if not args.overwrite and (is_completed_in_memory or output_file_exists):
                display_file_name = actual_disk_file.name if actual_disk_file else (Path(entry.get("test_file", "")).name if entry.get("test_file") else expected_test_filename)
                completed_time = entry.get("updated_at", "ก่อนหน้า")
                print(f"  ⏭️ [MEMORY: SKIP] ข้าม: ไฟล์นี้สร้างสำเร็จแล้ว ({display_file_name}) เมื่อ {completed_time}")
                print(f"     (หากต้องการสร้างใหม่ให้ระบุ --overwrite)")
                stats["skipped"] += 1
                
                # หากมีไฟล์จริงบนดิสก์แต่ยังไม่ได้บันทึกลง Memory ให้ซิงค์ทันที
                if not is_completed_in_memory and actual_disk_file:
                    state_data[task_id] = {
                        "project": proj_name,
                        "source_file": src_path.as_posix(),
                        "status": "COMPLETED",
                        "test_file": actual_disk_file.as_posix(),
                        "file_size_bytes": actual_disk_file.stat().st_size,
                        "note": "MANUAL_DETECTED",
                        "updated_at": datetime.now().isoformat()
                    }
                    save_state(state_file, state_data)
                continue

            # อ่าน Source Code จาก Resoucre
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
                    "error": f"Read error: {str(e)}",
                    "updated_at": datetime.now().isoformat()
                }
                save_state(state_file, state_data)
                continue

            # 1. ทำ Pre-compact โค้ดล่วงหน้าก่อนส่ง API (Proactive Compact) สำหรับคลาสขนาดใหญ่
            code_to_send = source_code
            if not args.no_auto_compact and len(source_code) > 20000:
                compacted = compact_java_source(source_code)
                saved = len(source_code) - len(compacted)
                if saved > 0:
                    code_to_send = compacted
                    print(f"  ⚡ [PRE-COMPACT] คลาสขนาดใหญ่ ({len(source_code):,} chars) ย่อโค้ดล่วงหน้าก่อนส่ง (ลดลง {saved:,} chars)")

            # สร้าง Prompt
            full_prompt = build_prompt(prompt_template, code_to_send)

            if args.dry_run:
                print(f"  [DRY-RUN] เป้าหมาย: {target_file_path}")
                print(f"  [DRY-RUN] ขนาด Source Code: {len(code_to_send)} ตัวอักษร, Prompt: {len(full_prompt)} ตัวอักษร")
                stats["success"] += 1
                continue

            # ยิง Request ไปยัง Claude API พร้อมระบบสลับคีย์และ Streaming
            api_result = call_claude_api_with_rotation(
                key_manager=key_manager,
                prompt=full_prompt,
                model=args.model,
                timeout=args.timeout,
                show_stream=args.show_stream
            )

            # 🛑 กรณีที่ล้มเหลว และอาจเกิดจากขนาดคลาสใหญ่เกินไป (Payload Too Large หรือ Timeout จากไฟล์ขนาดใหญ่)
            # ทำการย่อโค้ด (Compact: ตัด comments/javadoc) แล้วลองใหม่โดยอัตโนมัติ (เฉพาะกรณีที่ยังไม่ได้ Pre-compact)
            if not api_result["success"] and not api_result.get("all_keys_exhausted"):
                is_size_or_timeout = (
                    api_result.get("payload_too_large")
                    or "timeout" in str(api_result.get("error", "")).lower()
                )
                if is_size_or_timeout and not args.no_auto_compact and code_to_send == source_code:
                    compacted_code = compact_java_source(source_code)
                    saved = len(source_code) - len(compacted_code)
                    if saved > 500:
                        print(f"\n  ⚡ [AUTO-COMPACT] ตรวจพบคลาสขนาดใหญ่ ({len(source_code):,} chars) กำลังย่อโค้ด (ตัด Javadoc/Comments ลดลง {saved:,} chars) แล้วลองส่งใหม่...")
                        compacted_prompt = build_prompt(prompt_template, compacted_code)
                        api_result = call_claude_api_with_rotation(
                            key_manager=key_manager,
                            prompt=compacted_prompt,
                            model=args.model,
                            timeout=args.timeout,
                            show_stream=args.show_stream
                        )

            # 🛑 กรณี Token / Quota หมดทุกคีย์แล้ว -> หยุดรันทันที!
            if api_result.get("all_keys_exhausted"):
                print(f"\n{'='*80}")
                print(f"🛑 [HALTED] คีย์ API ทั้งหมด ({key_manager.total_count} คีย์) โควต้าหมดแล้ว!")
                print(f"รายละเอียด: {api_result['error']}")
                print(f"💾 สคริปต์ได้บันทึกสถานะล่าสุดลง Memory ({state_file}) เรียบร้อยแล้ว")
                print(f"💡 คำแนะนำ: เมื่อเติม Token หรือได้โควต้าเพิ่ม สามารถรันคำสั่งเดิมเพื่อทำงานต่อได้ทันที!")
                print(f"{'='*80}\n")
                
                state_data[task_id] = {
                    "project": proj_name,
                    "source_file": src_path.as_posix(),
                    "status": "FAILED",
                    "error": api_result["error"],
                    "updated_at": datetime.now().isoformat()
                }
                save_state(state_file, state_data)
                stats["failed"] += 1
                break

            # กรณีเกิด Error อื่นๆ หรือ Timeout ครบทุกคีย์
            if not api_result["success"]:
                err_label = "Gateway TTFT Timeout" if api_result.get("is_timeout") else api_result["error"]
                print(f"  ❌ ข้ามไฟล์นี้ชั่วคราว: {err_label}")
                stats["failed"] += 1
                state_data[task_id] = {
                    "project": proj_name,
                    "source_file": src_path.as_posix(),
                    "status": "FAILED",
                    "error": err_label,
                    "updated_at": datetime.now().isoformat()
                }
                save_state(state_file, state_data)
                continue

            raw_content = api_result["content"]
            finish_reason = api_result.get("finish_reason", "stop")
            elapsed = api_result.get("elapsed", 0)
            
            if finish_reason == "length":
                print(f"  ⚠️ Warning: Response สิ้นสุดเพราะติด Token Output Limit (finish_reason=length)")

            # สกัด Java Test Code จาก Response (ใช้เฉพาะโค้ดที่ได้จากการยิงมาเท่านั้น)
            extracted_code = extract_java_code(raw_content)

            if not extracted_code or len(extracted_code) < 50:
                print(f"  ❌ ไม่พบโค้ด Java ที่สมบูรณ์จาก Response (ได้รับเนื้อหาว่างหรือสั้นเกินไป)")
                stats["failed"] += 1
                state_data[task_id] = {
                    "project": proj_name,
                    "source_file": src_path.as_posix(),
                    "status": "FAILED",
                    "error": "Extracted Java code is empty or incomplete",
                    "updated_at": datetime.now().isoformat()
                }
                save_state(state_file, state_data)
                continue

            # ตรวจสอบชื่อไฟล์คลาสที่แท้จริง
            actual_filename = get_test_class_name(file_basename, extracted_code)
            final_output_path = target_dir / actual_filename

            # บันทึกไฟล์ Test Code
            target_dir.mkdir(parents=True, exist_ok=True)
            with open(final_output_path, "w", encoding="utf-8") as f:
                f.write(extracted_code)

            file_size = final_output_path.stat().st_size
            print(f"  💾 บันทึกไฟล์เรียบร้อย: {final_output_path} ({file_size:,} bytes)")
            stats["success"] += 1

            # บันทึกลง Memory State ทันที
            state_data[task_id] = {
                "project": proj_name,
                "source_file": src_path.as_posix(),
                "status": "COMPLETED",
                "test_file": final_output_path.as_posix(),
                "file_size_bytes": file_size,
                "used_key": api_result.get("used_key_masked"),
                "elapsed_seconds": round(elapsed, 2),
                "finish_reason": finish_reason,
                "usage": api_result.get("usage"),
                "model_quota": api_result.get("model_quota"),
                "updated_at": datetime.now().isoformat()
            }
            save_state(state_file, state_data)

            # หน่วงเวลาเพื่อป้องกัน Rate Limit
            if idx < len(tasks) and args.delay > 0:
                time.sleep(args.delay)

    except KeyboardInterrupt:
        print("\n\n⚠️ [INTERRUPTED] ได้รับคำสั่งยกเลิก (Ctrl+C)")
        print(f"💾 กำลังบันทึกสถานะ Memory ล่าสุดลงใน {state_file}...")
        save_state(state_file, state_data)
        print("✅ บันทึกสถานะเรียบร้อย สามารถสั่งรันต่อจากจุดเดิมได้ทันที!")
        sys.exit(0)

    # 5. สรุปผลการทำงาน
    print("\n================================================================================")
    print("📊 สรุปผลการประมวลผล (Summary Report)")
    print("================================================================================")
    print(f"• ทั้งหมด (Total):     {stats['total']}")
    print(f"• สำเร็จ (Success):   {stats['success']}")
    print(f"• ข้ามไป (Skipped):   {stats['skipped']} (มีใน Memory หรือไฟล์เดิมสมบูรณ์)")
    print(f"• ล้มเหลว (Failed):    {stats['failed']}")
    print(f"🔑 สถานะคีย์:         {len(key_manager.get_active_keys())}/{key_manager.total_count} คีย์ยังใช้งานได้")
    print(f"📄 Memory State บันทึกไว้ที่: {state_file}")
    print("================================================================================")
    print("✨ เสร็จสิ้นกระบวนการ!")


if __name__ == "__main__":
    main()
