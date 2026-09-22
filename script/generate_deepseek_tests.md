# คู่มือการใช้งาน DeepSeek-V4-Flash JUnit Test Generation Pipeline

เอกสารอธิบายการทำงาน โครงสร้าง และคำสั่งสำหรับรันสคริปต์ **`script/generate_deepseek_tests.py`** เพื่อสร้าง JUnit Test Suite อัตโนมัติด้วยโมเดล **`deepseek-v4-flash`** ผ่าน KKU IntelSphere API (`https://gen.ai.kku.ac.th/api/v1/chat/completions`) สำหรับโปรเจกต์ Defects4J

---

## 📌 สารบัญ
1. [ภาพรวมและข้อจำกัดที่ได้รับการแก้ไขจากเวอร์ชัน Claude](#1-ภาพรวมและข้อจำกัดที่ได้รับการแก้ไขจากเวอร์ชัน-claude)
2. [การจัดการโฟลเดอร์ผลลัพธ์และชื่อโปรเจกต์](#2-การจัดการโฟลเดอร์ผลลัพธ์และชื่อโปรเจกต์)
3. [SSE Streaming และการแยก Reasoning Tokens](#3-sse-streaming-และการแยก-reasoning-tokens)
4. [การจัดการ Token และการประเมิน Usage](#4-การจัดการ-token-และการประเมิน-usage)
5. [การจัดการ Output Truncation (finish_reason=length)](#5-การจัดการ-output-truncation-finish_reasonlength)
6. [การแยกสถานะ GENERATED และ VERIFIED](#6-การแยกสถานะ-generated-และ-verified)
7. [ระบบหลาย API Key (Key Rotation & Failover)](#7-ระบบหลาย-api-key-key-rotation--failover)
8. [ระบบงบประมาณภายใน (Internal Budget vs Server Quota)](#8-ระบบงบประมาณภายใน-internal-budget-vs-server-quota)
9. [การตั้งค่าใน .env](#9-การตั้งค่าใน-env)
10. [พารามิเตอร์ CLI ทั้งหมด](#10-พารามิเตอร์-cli-ทั้งหมด)
11. [ตัวอย่างคำสั่งการใช้งาน](#11-ตัวอย่างคำสั่งการใช้งาน)
12. [การทดสอบแบบ Offline Unit Tests](#12-การทดสอบแบบ-offline-unit-tests)

---

## 1. ภาพรวมและข้อจำกัดที่ได้รับการแก้ไขจากเวอร์ชัน Claude

สคริปต์นี้พัฒนาต่อยอดโดยใช้สถาปัตยกรรมและ CLI ที่เป็นระเบียบจาก `generate_claude_tests.py` และ `generate_gemini_tests.py` แต่ได้แก้ไขข้อจำกัดทางเทคนิคสำคัญที่พบในเวอร์ชันเดิม:

| ข้อจำกัดเดิม (Claude version) | การแก้ไขในเวอร์ชัน DeepSeek-V4-Flash |
|---|---|
| เติม `_1` ซ้ำในชื่อโปรเจกต์ เช่น `Closure_28_1_buggy` | ใช้ชื่อโปรเจกต์จริงเสมอ เช่น `Closure_28_buggy`, `Chart_1_buggy` |
| ฮาร์ดโค้ดเพดาน Token ไว้ที่ 8,192 โดยไม่สามารถปรับได้ | `--max-tokens` ปรับค่าได้อิสระ พร้อมตรวจจับข้อผิดพลาดจาก API |
| ไม่แยก Reasoning Content ใน SSE Stream | แยก `delta.content` ออกจาก `delta.reasoning` / `delta.reasoning_content` อย่างเด็ดขาด และเขียนเฉพาะโค้ดลงไฟล์ Java |
| บันทึกไฟล์ตรงๆ หากโปรแกรมหลุดไฟล์อาจเสียหาย | ใช้ **Atomic Writes** ทั้งไฟล์ Java และ State File (`.tmp` -> `replace()`) |
| สับสนระหว่างสร้างสำเร็จกับคอมไพล์ผ่าน | แยกสถานะ **`GENERATED`** (ผ่านโครงสร้างไวยากรณ์เบื้องต้น) ออกจาก **`VERIFIED`** (ต้องคอมไพล์และรันเทสต์ผ่านจริง) |
| หากติด `finish_reason=length` ไฟล์สมบูรณ์เดิมอาจถูกเขียนทับ | เมื่อเกิด truncation จะ **ไม่เขียนทับ** ไฟล์เดิมที่สมบูรณ์ และบันทึกสถานะเป็น `LIMIT_REACHED` |
| บัญชีงบประมาณผูกกับตัวเลขสมมติ | แยกบัญชีงบประมาณภายในออกจากโควต้าจริงของเซิร์ฟเวอร์ ซึ่งอ่านจาก `model_quota` ของ API |

---

## 2. การจัดการโฟลเดอร์ผลลัพธ์และชื่อโปรเจกต์

- **ต้นทาง (Source Code)**: อ่านจาก `Resoucre/<Project>/` (เช่น `Resoucre/Closure_28/`, `Resoucre/Chart_1/`)
- **ปลายทาง (Target Test Code)**: บันทึกลงใน:
  ```text
  Deepseek-flash-v4/TestCode/<Project>_buggy/
  ```
  ตัวอย่าง:
  - `Resoucre/Closure_28/` -> `Deepseek-flash-v4/TestCode/Closure_28_buggy/InlineCostEstimatorTest.java`
  - `Resoucre/Chart_1/` -> `Deepseek-flash-v4/TestCode/Chart_1_buggy/AbstractCategoryItemRendererTest.java`

> ⚠️ **จุดแก้ไขสำคัญ**: ไม่มีการเติม `_1` ซ้ำซ้อนลงในชื่อโฟลเดอร์อีกต่อไป

---

## 3. SSE Streaming และการแยก Reasoning Tokens

โมเดลในตระกูล DeepSeek มีความสามารถในการใช้ Reasoning Tokens (Chain of Thought) ระหว่างประมวลผลคำตอบ ซึ่งใน Server-Sent Events (SSE) ก้อนข้อมูล delta อาจประกอบไปด้วย:
- `delta.reasoning_content` หรือ `delta.reasoning`: โทเค็นความคิดเชิงเหตุผลภายในของโมเดล
- `delta.content`: โค้ดภาษา Java ที่เป็นคำตอบจริง

### กลไกการแยกข้อมูลและการแสดงสถานะแบบ Real-time:
1. **WaitingTicker (TTFT Spinner)**: มี Thread เบื้องหลังแสดงสถานะ `⠋ 📡 ส่งคำขอแล้ว กำลังรอเซิร์ฟเวอร์ตอบกลับ (TTFT)... [xx.xs]` เพื่อให้ทราบว่าการเชื่อมต่อยังทำงานอยู่ระหว่างที่เซิร์ฟเวอร์กำลังจัดคิวหรือประมวลผล context
2. **Real-time Streaming Status**: ระหว่างการรับข้อมูลแบบ SSE หากไม่ได้เปิด `--show-stream` สคริปต์จะอัปเดตสถานะแบบสดทุก 0.25 วินาที แสดงระยะเวลา, ตัวอักษร Reasoning (ความคิด), ตัวอักษรโค้ด (~tokens) และความเร็วสตรีม (`c/s`):
   ```text
   ⏳ กำลังสร้างโค้ด... [เวลา: 18.5s | คิด: 1,420 chars | โค้ด: 3,210 chars (~802 tokens) | 245 c/s]
   ```
3. **การแยกเนื้อหาโค้ด**: สะสม `delta.content` ไว้ใน `full_content` และสะสม reasoning ไว้ใน `full_reasoning` โดย**เฉพาะ `full_content` เท่านั้น** ที่จะถูกนำไปสกัดและบันทึกลงในไฟล์ `.java`
4. **สรุปผลลัพธ์และโควต้า**: เมื่อเสร็จสิ้นจะแสดงสรุป Response ครบถ้วน (เวลา, ขนาดโค้ด, ขนาด reasoning, ชิ้นข้อมูล, TTFT) พร้อมแสดงยอดโควต้าคงเหลือจริงจาก `model_quota` ของ API
5. สคริปต์บันทึกสถิติทั้ง `content_char_count` และ `reasoning_char_count` ลงใน State File เพื่อใช้วิเคราะห์

---

## 4. การจัดการ Token และการประเมิน Usage

### ทำไม Completion Tokens ถึงสูงกว่าจำนวนตัวอักษรของโค้ดที่เห็น?
ใน API ของโมเดลที่มี Reasoning โทเค็นในส่วน **`completion_tokens`** จะนับรวม:
$$\text{completion\_tokens} = \text{reasoning\_tokens} + \text{content\_tokens}$$

ดังนั้น หากพบว่าไฟล์ Test มีความยาว 2,000 ตัวอักษร (~500 tokens) แต่ API รายงาน `completion_tokens: 1,800` นั่นเป็นเพราะโมเดลใช้ reasoning tokens ไปประมาณ 1,300 tokens ในการคิดวิเคราะห์ก่อนเขียนโค้ด

### เพดาน Token (--max-tokens) และความเป็นจริงของ LLM:
- สคริปต์ **ไม่ถือว่า 8,192 เป็นเพดานถาวร** คุณสามารถกำหนดค่าผ่าน `--max-tokens` ได้
- **คำเตือน**: โมเดลภาษาขนาดใหญ่ทุกตัวมีขีดจำกัด Context Window และ Maximum Output Token ของเซิร์ฟเวอร์ จึง**ไม่สามารถสร้างคำตอบแบบไม่จำกัด (infinite output)** ได้ หากกำหนดค่าสูงเกินขีดจำกัดของเซิร์ฟเวอร์ API จะส่งกลับเป็น HTTP 400/413 ซึ่งสคริปต์มีระบบตรวจจับและแจ้งเตือน

---

## 5. การจัดการ Output Truncation (finish_reason=length)

เมื่อโมเดลสร้างคำตอบยาวจนชนเพดาน `--max-tokens` ผลลัพธ์จะส่ง `finish_reason="length"` หรือโค้ดขาดตอนก่อนปิดปีกกา `}`

### กฎความปลอดภัยของสคริปต์:
1. **ห้ามบันทึกเป็น GENERATED หรือ COMPLETED**: จะบันทึกสถานะเป็น **`LIMIT_REACHED`** ใน `generation_state.json`
2. **ห้ามเขียนทับไฟล์เดิมที่สมบูรณ์**: หากบนดิสก์มีไฟล์เทสต์เดิมที่สมบูรณ์อยู่แล้ว สคริปต์จะคงไฟล์เดิมไว้ ไม่ทำลายไฟล์ที่ดี
3. **การ Retry ที่ถูกต้อง**: การลองใหม่ต้องไม่ส่ง Prompt เดิมซ้ำๆ แต่จะใช้ **Proactive/Reactive Compaction** (ตัด Javadoc และ Comments เพื่อลดขนาด prompt) หรือสั่งให้โมเดลเน้นเฉพาะ branch สำคัญ

---

## 6. การแยกสถานะ GENERATED และ VERIFIED

เพื่อความถูกต้องตามหลักการประกันคุณภาพซอฟต์แวร์ (SQA):

| สถานะ | ความหมาย | เกณฑ์การตัดสิน |
|---|---|---|
| **`GENERATED`** | สคริปต์สร้างไฟล์เทสต์สำเร็จและผ่าน Sanity Check | มีไฟล์อยู่จริง, ปีกกา `{}` สมดุล, มี `@Test`, มีคลาสประกาศ |
| **`VERIFIED`** | เทสต์ผ่านการคอมไพล์และรันได้จริง | **ต้องรันผ่าน Defects4J (`defects4j compile && defects4j test`) สำเร็จจริงเท่านั้น** สคริปต์ Generator จะไม่ตั้งสถานะนี้เองโดยพลการ |
| **`LIMIT_REACHED`** | ได้รับคำตอบขาดตอน | `finish_reason == "length"` หรือปีกกาไม่ครบคู่ |
| **`FAILED`** | เกิดข้อผิดพลาดทางเทคนิค | API Error, Network Timeout, อ่านไฟล์ไม่สำเร็จ |

---

## 7. ระบบหลาย API Key (Key Rotation & Failover)

สคริปต์รองรับการใส่หลาย API Key เพื่อกระจายโหลดและป้องกันปัญหางานหยุดชะงัก:
- **Round-Robin Rotation**: สลับคีย์ใช้งานวนไปเรื่อยๆ เพื่อเฉลี่ยโควต้าและเลี่ยง rate limit
- **Rate Limit (HTTP 429)**: สคริปต์จะพักคีย์นั้นไว้ชั่วคราว (Backoff) แล้วสลับไปใช้คีย์สำรอง
- **Quota Exhausted (HTTP 401 Daily Limit / Out of credits)**: สคริปต์จะตัดคีย์ที่หมดออกจากคิวทันทีในรอบการรันนั้น และสลับไปใช้คีย์ถัดไป
- **Key Masking**: ทุก Log, Console และ State File จะปิดบังคีย์เสมอ เช่น `sk_E3p...Drbt` ไม่มีทางหลุดคีย์เต็ม

---

## 8. ระบบงบประมาณภายใน (Internal Budget vs Server Quota)

เพื่อป้องกันความผิดพลาด สคริปต์แบ่งการจัดการโควต้าออกเป็น 2 ชั้น:

1. **Server Quota (โควต้าของ KKU IntelSphere API)**:
   - ค่าในสคริปต์ **4,000,000 tokens/วัน** เป็นเพียงค่าที่ใช้แสดงก่อนมีข้อมูลจริง; API ที่เคยรันรายงาน **1,000,000 tokens/วันต่อคีย์** ให้ยึดยอดจาก `model_quota`
   - อัปเดตยอดจริงทันทีที่ได้รับออบเจกต์ `model_quota` จาก API response (`daily_quota_tokens`, `daily_usage_tokens`, `daily_remaining_tokens`)
2. **Internal Daily Budget (งบประมาณภายในเครื่อง)**:
   - บันทึกใน `Deepseek-flash-v4/budget_ledger.json`
   - ค่าเริ่มต้นของ generator แบบเดิม: **3,200,000 tokens/วันรวมทุกคีย์**; ควรปรับตามโควต้าจริง
   - ปรับเปลี่ยนได้ด้วย `--budget-limit <ตัวเลข>` หรือข้ามด้วย `--skip-limits`

---

## 9. การตั้งค่าใน .env

ไฟล์ `.env` ที่ root ของโปรเจกต์ (`E:\JavaEclipe\defect4j\SQA-Project\.env`):

```env
# รูปแบบที่ 1: แยกรายคีย์ (แนะนำ)
API_KEY=sk_key1...
API_KEY2=sk_key2...
API_KEY3=sk_key3...
API_KEY4=sk_key4...

# รูปแบบที่ 2: คั่นด้วยจุลภาค
DEEPSEEK_API_KEYS=sk_key1...,sk_key2...
```

---

## 10. พารามิเตอร์ CLI ทั้งหมด

| พารามิเตอร์ | ตัวย่อ | คำอธิบาย |
|---|---|---|
| `--project` | `-p` | กรองเฉพาะโปรเจกต์ที่ระบุ (เช่น `Closure_28` หรือ `Chart_1`) |
| `--file` | `-f` | กรองเฉพาะชื่อไฟล์ Java |
| `--limit` | `-n` | จำกัดจำนวนไฟล์ที่จะประมวลผล (กรองเฉพาะงานที่ค้างก่อนตัดตาม limit) |
| `--api-key` | `-k` | ระบุ API Key ผ่าน CLI (ใส่ได้หลายตัว หรือคั่นด้วยจุลภาค) |
| `--env-file` | - | ระบุ path ของไฟล์ `.env` ที่ต้องการโหลด |
| `--key-index` | - | เลือกเฉพาะคีย์ลำดับที่ N จาก `.env`/environment สำหรับ worker หนึ่งตัว |
| `--state-file` | - | แยกไฟล์สถานะของโปรเจกต์เมื่อรันขนาน |
| `--budget-file` | - | แยกบัญชี token ของคีย์เมื่อรันขนาน |
| `--max-tokens` | - | กำหนดเพดาน output tokens (ค่าเริ่มต้น: `8192`) |
| `--budget-limit` | - | กำหนดงบประมาณ token ภายในต่อวัน (ค่าเริ่มต้น: `3200000`) |
| `--no-budget` | - | ปิดการควบคุมงบประมาณ token ภายในเครื่อง |
| `--skip-limits` | - | **ข้ามไฟล์ที่เคยติดลิมิต** (`LIMIT_REACHED` / `length`) ไม่นำมารันซ้ำ (ค่าเริ่มต้น: จะนำมา retry ด้วย compaction) |
| `--overwrite` | - | บังคับสร้างใหม่ แม้เคยทำเสร็จแล้วใน State หรือบนดิสก์ |
| `--dry-run` | - | **จำลองการทำงาน** โดยไม่เรียก API และไม่แก้ไขไฟล์/State |
| `--plan` | - | **แสดงแผนการประมวลผล** (รายชื่อไฟล์, ขนาด, เป้าหมาย) โดยไม่เรียก API |
| `--status` | - | **แสดงรายงานสถานะ** งบประมาณ คีย์ และสถิติ โดยไม่เรียก API |
| `--check-quota` | - | **ตรวจสอบโควต้าจริง** จากเซิร์ฟเวอร์ (*หมายเหตุ: จะส่ง request สั้นๆ และใช้ token เล็กน้อย ~2-5 tokens; ห้ามใช้ร่วมกับ --dry-run/--plan/--status*) |
| `--show-stream` | `-v` | แสดงข้อความและโค้ดที่โมเดลกำลังสตรีมสดลงหน้าจอ |
| `--timeout` | - | กำหนด Timeout ต่อ Request เป็นวินาที (ค่าเริ่มต้น: `60`) |
| `--delay` | - | หน่วงเวลาระหว่างไฟล์เป็นวินาที (ค่าเริ่มต้น: `1.0`) |
| `--model` | - | กำหนดชื่อโมเดล (ค่าเริ่มต้น: `deepseek-v4-flash`) |
| `--junit` | - | ระบุเวอร์ชัน JUnit (`auto`, `junit4`, `junit5` ค่าเริ่มต้น: `auto` ตรวจจับจาก pom.xml/build.xml) |

---

## 11. ตัวอย่างคำสั่งการใช้งาน

### 11.1 ดูสถานะระบบและความคืบหน้า (ปลอดภัย ไม่ยิง API)
```bash
python script/generate_deepseek_tests.py --status
```

คำสั่งนี้รวม `generation_state.json` เดิมกับ `Deepseek-flash-v4/state/*.json` ของตัวรันขนาน โดยใช้ task ID กันการนับซ้ำ แสดงงบเดิมและยอดใช้ของบัญชี worker แยกกัน ข้อมูลโควต้าเซิร์ฟเวอร์ที่แสดงมาจาก state พร้อมเวลาที่บันทึกไว้; หากต้องการยอดสดให้ใช้ `--check-quota` (มีการเรียก API)

### 11.2 ดูแผนงานก่อนรันจริง
```bash
python script/generate_deepseek_tests.py --project Closure_28 --plan
```

`--plan` และ `--dry-run` แบบไม่ระบุ `--state-file` อ่าน state ทั้งสองแบบเหมือน `--status` แต่ไม่แก้ไขไฟล์ใดๆ หากระบุ `--state-file` จะอ่านเฉพาะไฟล์นั้น

### 11.3 ทดสอบการทำงานแบบ Dry-Run
```bash
python script/generate_deepseek_tests.py --project Chart_1 --dry-run
```

### 11.4 ตรวจสอบโควต้าจริงของแต่ละคีย์จากเซิร์ฟเวอร์
```bash
python script/generate_deepseek_tests.py --check-quota
```

### 11.5 รันจริงเฉพาะโปรเจกต์ที่ต้องการ
```bash
python script/generate_deepseek_tests.py --project Closure_28
```

### 11.6 รันจริงพร้อมแสดงผลการสตรีมสดลงหน้าจอ
```bash
python script/generate_deepseek_tests.py --project Chart_1 -v
```

### 11.7 รันผ่าน Shell Script Wrapper บน WSL / Linux
```bash
bash script/generate_deepseek_tests.sh --project Closure_28 --status
```

### 11.8 รันหลายโปรเจกต์พร้อมกันโดยแยกคีย์และสถานะ

หยุด generator ที่กำลังรันอยู่ก่อนเริ่ม launcher เพื่อไม่ให้สองรอบเขียนไฟล์ test เดียวกัน จากนั้นเรียกครั้งเดียว; launcher ใช้ 1 API key ต่อ worker, แยก state ต่อกลุ่มโปรเจกต์, และแยกบัญชี token ต่อคีย์ คำสั่งเดิมใช้รันต่อในวันถัดไปได้

```bash
python3 script/run_deepseek_parallel.py --workers 4
```

เฉพาะ Cli และ Chart หรือดูการแบ่งงานแบบ offline ก่อนรัน:

```bash
python3 script/run_deepseek_parallel.py --workers 2 --projects Cli Chart
python3 script/run_deepseek_parallel.py --workers 2 --projects Cli Chart --dry-run
```

ต้องมีคีย์อย่างน้อยเท่าจำนวน worker ใน `.env` (หรือ environment) ตัวเลือก `--budget-limit` ของ launcher มีค่าเริ่มต้น **800,000 tokens/วันต่อคีย์** ตามโควต้า 1,000,000 tokens/วันต่อคีย์ที่เคยเห็นจาก API; ปรับตามยอดจริงได้ด้วย `--budget-limit N` ค่าเริ่มต้นนี้แยกจากค่า 3,200,000 ของ generator แบบรันโปรเซสเดียว

ไฟล์สถานะของ launcher อยู่ที่ `Deepseek-flash-v4/state/<กลุ่ม>.json` และบัญชี token อยู่ที่ `Deepseek-flash-v4/budget/key-<fingerprint>.json` โดยไม่บันทึกคีย์จริงในชื่อไฟล์ เมื่อเริ่มใช้ครั้งแรก launcher คัดลอกสถานะเดิมจาก `generation_state.json` ไปยัง state ของแต่ละกลุ่มที่ยังไม่มีไฟล์อยู่ ผลลัพธ์ Java เดิมบนดิสก์ยังถูกใช้ตรวจการข้ามงาน

ระหว่างรัน launcher จะรวม state ของทุกกลุ่มกลับเข้า `Deepseek-flash-v4/generation_state.json` ทุก 10 วินาที หลัง worker จบแต่ละกลุ่ม และก่อนโปรแกรมออกหรือถูกยกเลิกด้วย Ctrl+C โดยใช้รายการที่มี `updated_at` ใหม่กว่า จึงยังใช้ global state กับ generator แบบเดิมและคำสั่ง resume ได้

หาก worker หยุดเพราะงบหรือโควต้าหมด กลุ่มที่ยังค้างจะถูกรันต่อเมื่อเรียกคำสั่งเดิมอีกครั้ง การที่ generator จบรอบหมายถึงสร้างไฟล์แล้วเท่านั้น; การคอมไพล์และรัน JUnit ยังต้องตรวจแยก

---

## 12. การทดสอบแบบ Offline Unit Tests

สามารถรันชุดการทดสอบทั้งหมด 23 รายการได้แบบออฟไลน์ 100% โดยไม่ต้องเชื่อมต่ออินเทอร์เน็ตและไม่ใช้โควต้า:

```bash
python script/test_generate_deepseek_tests.py
```

ผลลัพธ์ที่คาดหวัง:
```text
Ran 23 tests
OK
```
