# Feedback-Directed Random Test Generation (Randoop) Result Runner

Directory นี้ประกอบด้วยสคริปต์สำหรับรันผลทดสอบ (Result Runner), วัด Code Coverage (Line & Branch) และบันทึกผลการทดสอบของ **Feedback-Directed Random Test Generation (Randoop)** บน Defects4J โดยอิงรูปแบบและ Workflow ตาม `GeneticAlgorithm/Code` (รันรอบเดียว ไม่มีคอลัมน์ Round):

```text
Code/
├── run_feedback_directed_tests.py     Main Python runner (รองรับ multi-worker, auto-resume, coverage, logs)
├── run_feedback_directed.sh           Bash wrapper script (ตรวจหา Defects4J & SDKMAN อัตโนมัติ)
├── collect_feedback_directed_reports.sh รวม per-bug result.csv เป็น report.csv
└── README.md                          คู่มือการใช้งานและคำอธิบาย Format Report
```

---

## 🚀 การใช้งาน (Usage)

สามารถรันได้ทั้งบน Linux, WSL หรือ macOS ที่ติดตั้ง Defects4J, Java (แนะนำ Java 11 หรือ 8 ตาม Defects4J) และ Python 3.8+

### 1. รูปแบบ Positional Syntax (ง่ายที่สุด)

```bash
cd "Feedback-Directed Random Test Generation/Code"

# PROJECT BUG_IDS [BUDGET]
./run_feedback_directed.sh Chart 1
./run_feedback_directed.sh Chart 1 60

# หลาย bug พร้อมกัน (Batch mode: Chart 1, 2, 3 เวลา 60 วิ)
./run_feedback_directed.sh Chart 1,2,3 60

# ปรับจำนวน worker ให้รันขนานกัน 4 งานพร้อมกัน
MAX_PARALLEL=4 ./run_feedback_directed.sh Chart 1,2,3,4 60
```

### 2. รูปแบบ CLI Flags (ยืดหยุ่นสูง)

```bash
# ทดสอบดูรายการเป้าหมายก่อน (Dry-run ไม่แก้ไฟล์)
python3 run_feedback_directed_tests.py --dry-run --projects Chart

# รันเฉพาะบางโปรเจกต์พร้อมกัน 4 workers
python3 run_feedback_directed_tests.py --projects Chart Cli --workers 4

# รันเฉพาะ Target ที่ต้องการ
python3 run_feedback_directed_tests.py --targets Chart_1 Cli_1 Mockito_1 --workers 2

# รันทุก test suite ที่มีใน TestCode ทั้งหมด (836 targets)
python3 run_feedback_directed_tests.py --workers 4

# รันซ้ำ target ที่เคยทำแล้ว (Overwrite)
python3 run_feedback_directed_tests.py --targets Chart_1 --overwrite

# รวบรวม report.csv จากไฟล์ result.csv ที่มีอยู่แล้วโดยไม่รันใหม่
python3 run_feedback_directed_tests.py --collect-only
```

### 3. การรวม Report

```bash
# รวมผลของ Result/ เข้าสู่ report.csv
./collect_feedback_directed_reports.sh
```

---

## ⚙️ ขั้นตอนการทำงาน (Workflow)

```text
1. ค้นหาชุดทดสอบใน TestCode/<Project>_<Bug>_buggy/
2. ตรวจสอบ Package และบีบอัดเป็น Archive tar.bz2 โดยจัดโครงสร้าง Directory ตาม Java Package
3. Checkout Defects4J รุ่น Buggy (b) ใน Temporary Directory
4. Compile รุ่น Buggy
5. รันคำสั่ง defects4j test -s <archive> บนรุ่น Buggy และบันทึกผล Failures
6. รันคำสั่ง defects4j coverage -s <archive> วัด Line และ Branch Coverage บน Modified Classes
7. ลบ Directory Checkout ของรุ่น Buggy ทันทีเพื่อประหยัดพื้นที่ดิสก์
8. Checkout Defects4J รุ่น Fixed (f) ใน Temporary Directory
9. Compile รุ่น Fixed
10. รันคำสั่ง defects4j test -s <archive> ด้วย Test Suite ชุดเดิมบนรุ่น Fixed
11. ลบ Directory Checkout ของรุ่น Fixed ทันที
12. ประเมินผล Verdict (REVEALING / NOT_REVEALING / INCONCLUSIVE / NOT_AVAILABLE)
13. บันทึกผลลัพธ์ลงใน Result/<Target>/ (result.json, result.csv, logs/) และอัปเดต report.csv
```

---

## 📁 โครงสร้างผลลัพธ์ (Output Structure)

```text
TestCode/
  └── Chart_1_buggy/                          # Generated Randoop JUnit tests
Result/
  ├── Chart_1/
  │   ├── result.json                         # ข้อมูลผลลัพธ์ละเอียด JSON
  │   ├── result.csv                          # รายงานผลระดับ Target
  │   └── logs/
  │       ├── buggy.log                       # Log checkout & compile (buggy)
  │       ├── buggy_test.log                  # Log การรัน test (buggy)
  │       ├── buggy_coverage.log              # Log การวัด coverage
  │       ├── buggy_failing_tests.txt         # รายชื่อ test ที่ fail บน buggy
  │       ├── fixed.log                       # Log checkout & compile (fixed)
  │       ├── fixed_test.log                  # Log การรัน test (fixed)
  │       └── fixed_failing_tests.txt         # รายชื่อ test ที่ fail บน fixed
  └── report.csv                              # Aggregated report รวมทุก targets
report.csv                                    # Global aggregated report
```

---

## 📊 รูปแบบ Report (Report Format Schema)

Header และ Schema ของ `result.csv` และ `report.csv` (ไม่มี Round):

```csv
"project","bug_id","seed","budget","tests","coverage","line_cov","branch_cov","total_goals","covered_goals","lines","covered_lines","total_branches","covered_branches","buggy_result","buggy_fails","fixed_result","fixed_fails","verdict"
```

ตัวอย่างข้อมูลผลลัพธ์:
```csv
"Chart",1,20260918,60,4,9.46,9.06,9.85,848,79,66,52,242,24,"PASS",0,"PASS",0,"NOT_REVEALING"
```

### คำอธิบายแต่ละคอลัมน์:

| คอลัมน์ | ชนิดข้อมูล | คำอธิบาย |
|---|---|---|
| `project` | String | ชื่อโปรเจกต์ Defects4J (เช่น `"Chart"`, `"Cli"`, `"Codec"`) |
| `bug_id` | Integer | หมายเลขบั๊ก (เช่น `1`, `10`) |
| `seed` | Integer | Random Seed ที่ใช้สร้างชุดทดสอบ (ค่าเริ่มต้น: `20260918`) |
| `budget` | Integer | Search / Time budget ในหน่วยวินาทีที่ใช้สร้างเทสต์ (ดึงจาก `time_limit` ใน state หรือ CLI) |
| `tests` | Integer | จำนวน test cases ทั้งหมดที่รัน (นับจาก `@Test` ใน suite) |
| `coverage` | Float / Empty | เปอร์เซ็นต์ความครอบคลุมภาพรวม (`covered_goals / total_goals * 100`) |
| `line_cov` | Float / Empty | เปอร์เซ็นต์ Line Coverage บน modified classes |
| `branch_cov` | Float / Empty | เปอร์เซ็นต์ Branch Coverage บน modified classes |
| `total_goals` | Integer | จำนวนเป้าหมายทั้งหมด (`lines + total_branches`) |
| `covered_goals` | Integer | จำนวนเป้าหมายที่ครอบคลุม (`covered_lines + covered_branches`) |
| `lines` | Integer | จำนวนบรรทัดทั้งหมด (`LinesTotal` จาก Defects4J) |
| `covered_lines` | Integer | จำนวนบรรทัดที่ครอบคลุม (`LinesCovered` จาก Defects4J) |
| `total_branches` | Integer | จำนวน Branch ทั้งหมด (`ConditionsTotal` จาก Defects4J) |
| `covered_branches` | Integer | จำนวน Branch ที่ครอบคลุม (`ConditionsCovered` จาก Defects4J) |
| `buggy_result` | String | ผลทดสอบบนรุ่น Buggy (`"PASS"`, `"FAIL"`, `"NOT_RUN"`) |
| `buggy_fails` | Integer / Empty | จำนวน test ที่ fail บนรุ่น Buggy |
| `fixed_result` | String | ผลทดสอบบนรุ่น Fixed (`"PASS"`, `"FAIL"`, `"NOT_RUN"`) |
| `fixed_fails` | Integer / Empty | จำนวน test ที่ fail บนรุ่น Fixed |
| `verdict` | String | ผลการประเมินชุดทดสอบตามเกณฑ์ Benchmark |

> **หมายเหตุเกี่ยวกับเวลา (Execution Time vs Budget):**
> - **`budget` (ใน CSV และ JSON)**: คือ Time Limit ที่ตั้งค่าไว้ให้ Randoop ตอนสร้างชุดทดสอบ (Generation Budget)
> - **`duration_seconds` (ใน `result.json`)**: คือ เวลาจริง (Execution Time) ที่ใช้ในการรันทั้งกระบวนการบน Defects4J (Checkout, Compile, Test, และ Coverage) รวมถึงแยกย่อยเวลาของฝั่ง `buggy` และ `fixed` ในฟิลด์ `validations[].duration_seconds`

---

## 🎯 คำนิยาม Verdict (Verdict Definitions)

- **`REVEALING`**: บั๊กรุ่น `buggy` รันแล้ว **FAIL** (ตรวจจับบั๊กได้) และรุ่น `fixed` รันแล้ว **PASS** (ชุดทดสอบถูกต้อง ไม่ใช่ Flaky test)
- **`NOT_REVEALING`**: รันผ่านทั้งสองรุ่น (`buggy` = **PASS**, `fixed` = **PASS**) ไม่สามารถเปิดโปงบั๊กได้
- **`INCONCLUSIVE`**: ผลการทดสอบคู่อื่น ๆ (เช่น `buggy` = **FAIL** และ `fixed` = **FAIL**)
- **`NOT_AVAILABLE`**: ไม่สามารถรันทดสอบได้ เช่น Checkout ไม่สำเร็จ, Compile Test Suite ไม่ผ่าน หรือคำสั่ง Timeout
