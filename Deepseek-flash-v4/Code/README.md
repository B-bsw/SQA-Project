# Run generated DeepSeek tests

สคริปต์นี้นำ Java ใน `Deepseek-flash-v4/TestCode/<Project>_<Bug>_buggy/` ไปรันกับ
Defects4J รุ่น buggy และ fixed โดยใช้ test archive ชุดเดียวกัน ตาม workflow ของ
`GeneticAlgorithm/Code/run_evosuite_ga.sh` ไม่เรียก API หรือสร้าง test ใหม่

ต้องรันบน WSL/Linux ที่ติดตั้ง Defects4J, Java และ Python 3.9+ แล้ว
Defects4J ต้องอยู่ใน `PATH` หรือระบุ `--defects4j-bin` / `DEFECTS4J_BIN`
ใช้ Java version ตามที่ Defects4J ของเครื่องรองรับ (GA เดิมใช้ Java 11)

```bash
cd /mnt/e/JavaEclipe/defect4j/SQA-Project

# ดูรายการก่อน (ไม่มี checkout หรือแก้ไฟล์)
python3 Deepseek-flash-v4/Code/run_deepseek_tests.py --dry-run --targets Chart_1 Cli_5

# ทดลองสอง bug ด้วยสอง worker
python3 Deepseek-flash-v4/Code/run_deepseek_tests.py --targets Chart_1 Cli_5 --workers 2

# รันทั้งหมดพร้อมกันสูงสุด 4 worker
python3 Deepseek-flash-v4/Code/run_deepseek_tests.py --workers 4

# เลือก project หรือจำกัดจำนวนงานค้าง
python3 Deepseek-flash-v4/Code/run_deepseek_tests.py --projects Chart Cli --workers 4 --limit 10

# จำกัดแต่ละคำสั่ง test/coverage ที่อาจวนไม่จบ (ค่าเริ่มต้น 600 วินาที)
python3 Deepseek-flash-v4/Code/run_deepseek_tests.py --workers 2 --test-timeout 180

# รัน target ที่เคยทำแล้วอีกครั้งหลังแก้ Java test
python3 Deepseek-flash-v4/Code/run_deepseek_tests.py --targets Chart_1 --overwrite

# wrapper จะหา Defects4J ใน ~/defect4j/defects4j/framework/bin ให้ด้วย
bash Deepseek-flash-v4/Code/run_deepseek_tests.sh --workers 4
```

แต่ละ worker ใช้ checkout และ archive ใน temporary directory แยกกัน สคริปต์
checkout/compile/test ทั้ง `b` และ `f`; กับ buggy ยังเรียก `coverage -s` เพื่อวัด
line และ branch coverage เฉพาะ modified classes ตามค่า default ของ Defects4J
ใช้ `--no-coverage` เมื่อต้องการข้ามขั้นตอน coverage
หาก generated test ค้างเกิน `--test-timeout` สคริปต์จะหยุด Java ของคำสั่งนั้น
และระบุ `test_status: TIMEOUT` ใน `result.json` (verdict เป็น `NOT_AVAILABLE`)
ถ้า coverage ค้างจะระบุ `coverage_status: TIMEOUT` โดยยังเก็บผล test ไว้

ผลของแต่ละ bug อยู่ที่ `Deepseek-flash-v4/Result/<Project>_<Bug>/result.json`,
`result.csv` และ `logs/` ส่วนผลรวมอยู่ที่ `Deepseek-flash-v4/Result/report.csv`
เมื่อกด Ctrl+C สคริปต์จะหยุดคำสั่ง Defects4J ของ worker ที่กำลังรัน ยกเลิกงาน
ที่ยังไม่เริ่ม แล้วอัปเดต `Result/report.csv` จาก `result.json` ของ target ที่
เสร็จสมบูรณ์แล้วก่อนออก (exit code 130) target ที่ถูกขัดจังหวะจะไม่มีผลรอบใหม่
และรันต่อได้ด้วยคำสั่งเดิม
หากหยุดโปรเซสที่เริ่มก่อนแก้สคริปต์นี้ ให้รวมผลเดิมโดยไม่เริ่มงานใหม่ด้วย:

```bash
python3 Deepseek-flash-v4/Code/run_deepseek_tests.py --collect-only
```

งานที่มี `result.json` จะถูกข้ามเมื่อรันคำสั่งเดิมอีกครั้ง ใช้ `--overwrite`
เพื่อรันซ้ำ หาก test compile ไม่ผ่านหรือคำสั่ง Defects4J มีปัญหา ให้ดู log
ของรุ่นนั้นแล้วแก้ Java ก่อนรันซ้ำ
ไฟล์ `logs/*_failing_tests.txt` เก็บ stack trace ของ test ที่ fail

`REVEALING` คือ buggy fail และ fixed pass; `NOT_REVEALING` คือ pass ทั้งคู่;
`INCONCLUSIVE` คือผลคู่อื่นที่รันทดสอบได้; `NOT_AVAILABLE` คือขั้นตอนใด
ขั้นตอนหนึ่งไม่สามารถรันทดสอบได้ Coverage ว่างเมื่อวัดไม่สำเร็จ

## ทดลองซ่อม test ที่ compile ไม่ผ่าน 10 ไฟล์

`repair_not_available.py` เลือก 10 target ที่เป็น `NOT_AVAILABLE` เพราะ
generated test compile ไม่ผ่านและมี Java test เพียงหนึ่งไฟล์ โดยเลือกไฟล์
ขนาดเล็กก่อนเพื่อลด input tokens สคริปต์ส่งไฟล์ test และ compiler error ให้
DeepSeek ตอบเป็นรายการแก้ข้อความสั้น ๆ ไม่ขอสร้าง test ทั้งไฟล์ใหม่

```bash
# ดูรายการ 10 ไฟล์ ไม่มี API call และไม่แก้ TestCode
python3 Deepseek-flash-v4/Code/repair_not_available.py

# ตรวจ API และ token ที่ใช้กับไฟล์เดียวก่อน แล้วค่อยต่ออีก 9 ไฟล์
python3 Deepseek-flash-v4/Code/repair_not_available.py --execute --limit 1
python3 Deepseek-flash-v4/Code/repair_not_available.py --execute --limit 9

# ดูผลและ diff ก่อนนำไปใช้
cat Deepseek-flash-v4/RepairCandidates/pilot_summary.csv
cat Deepseek-flash-v4/RepairCandidates/Chart_20/patch.diff

# ใช้เฉพาะ candidate ที่มี status COMPILE_PASS หลังตรวจ diff แล้ว
python3 Deepseek-flash-v4/Code/repair_not_available.py --apply Chart_20

# รัน report ของ target ที่แก้ใหม่ (ตั้งใจ overwrite เฉพาะ target นี้)
bash Deepseek-flash-v4/Code/run_deepseek_tests.sh --targets Chart_20 --overwrite
```

`--execute` ค่าเริ่มต้น 10 ไฟล์, output cap 4096 tokens ต่อ request
ถ้าไฟล์มี Java code fence สคริปต์จะลองถอดและ compile โดยไม่ใช้ API ก่อน
เมื่อ API ตอบ 401/403/429 จะลองคีย์ถัดไปที่ตั้งค่าไว้ (ไม่สร้าง response ซ้ำ
จากคีย์ที่ตอบสำเร็จ) และไม่เขียนทับ `TestCode` หรือ `Result` Candidate, diff,
ผลตรวจ compile, usage และ log อยู่ใน `RepairCandidates/<target>/`
ถ้า API patch ไม่ถูกต้องหรือ compile ไม่ผ่าน สถานะจะไม่เป็น `COMPILE_PASS`
`--apply` จะตรวจ hash ของต้นฉบับและ candidate อีกครั้ง แล้วสำรอง test เดิม
กับผลรอบแรกไว้ใน `RepairHistory/<target>/` ก่อนคัดลอกไฟล์ที่แก้
ควรใช้ `--apply` หลังงานรัน baseline จบแล้ว

สถานะ `COMPILE_PASS` หมายถึง test compile ผ่านทั้ง buggy และ fixed เท่านั้น
ผล test อาจยังเป็น `INCONCLUSIVE` ต้องอ่าน `result.json` หลังรัน report ใหม่
