# EvoSuite Genetic Algorithm

Directory นี้เหลือเฉพาะไฟล์ที่จำเป็นสำหรับรัน EvoSuite แบบ `STANDARD_GA`:

```text
Code/
├── run_evosuite_ga.sh       รัน experiment สำหรับหนึ่ง project/bug
├── collect_ga_reports.sh    รวม per-bug report ของแต่ละ round
├── merge_round_reports.sh   รวม report ของ Round 1 และ Round 2
├── evosuite-1.2.0.jar       EvoSuite
└── README.md
```

## การใช้งาน

```bash
cd GenericAlgorithm/Code

# PROJECT BUG_IDS RESULT_ROUND BUDGET_SECONDS
./run_evosuite_ga.sh Chart 1 1 120
./run_evosuite_ga.sh Chart 1 2 120

# หลาย bug พร้อมกัน (default สูงสุด 2 processes)
./run_evosuite_ga.sh Chart 1,2,3 1 120

# ปรับจำนวนที่รันพร้อมกัน
MAX_PARALLEL=4 ./run_evosuite_ga.sh Chart 1,2,3,4 1 120

# รวม report ของแต่ละ round
./collect_ga_reports.sh 1
./collect_ga_reports.sh 2

# รวมทั้งสอง round เป็น GenericAlgorithm/report.csv
./merge_round_reports.sh
```

Java ถูกตั้งเป็น `11.0.31-amzn` ผ่าน SDKMAN ภายในสคริปต์ ค่า default คือ
budget 120 วินาทีและ seed `20260918`

สคริปต์ใส่ compiled subject classes ไว้ทั้งใน JVM classpath และ EvoSuite
`projectCP` เพื่อรองรับการ instrument dependency ของโปรเจกต์เก่า เช่น
`org.jfree.data.Range` ใน Chart-26

Batch mode จะรวม `Result_RoundN/report.csv` ให้อัตโนมัติเมื่อทุก target จบ
EvoSuite ใช้ memory สูงสุดประมาณ 2 GB ต่อ process จึงควรกำหนด
`MAX_PARALLEL` ให้เหมาะกับ RAM

## ขั้นตอน

```text
checkout buggy → compile → generate tests ด้วย EvoSuite GA → test buggy
ลบ buggy checkout
checkout fixed → compile → test ด้วย generated tests ชุดเดิม
ลบ fixed checkout
บันทึก generated Java และ report
```

checkout, build, log และ `evosuite-tests.tar.bz2` อยู่ใน temporary directory
ระหว่างการทำงานเท่านั้น และถูกลบเมื่อสคริปต์จบ จึงไม่มี archive อยู่ใน
`TestCode`

## Output

```text
TestCode/Chart_1/                         generated `.java` files
Result_Round1/Chart_1/result.csv          Round 1 report
Result_Round1/Chart_1/result.json
Result_Round2/Chart_1/result.csv          Round 2 report
Result_Round2/Chart_1/result.json
Result_Round1/report.csv                  aggregated Round 1 report
Result_Round2/report.csv                  aggregated Round 2 report
report.csv                                report รวม Round 1 และ Round 2
```

CSV schema:

```csv
"round","project","bug_id","seed","budget","tests","coverage","line_cov","branch_cov","total_goals","covered_goals","lines","covered_lines","total_branches","covered_branches","buggy_result","buggy_fails","fixed_result","fixed_fails","verdict"
```

`result.csv` เก็บ overall, line และ branch coverage รวมถึง goal, line และ
branch counts ส่วน `result.json` เก็บ method counts และข้อมูลแยกตาม target
class เพิ่มเติม โดยไม่มีไฟล์ statistics แยกต่างหาก

- `REVEALING`: buggy fail และ fixed pass
- `NOT_REVEALING`: buggy และ fixed pass ทั้งคู่
- `INCONCLUSIVE`: ผลการทดสอบคู่อื่น
- `NOT_AVAILABLE`: checkout, compile หรือ test ไม่สำเร็จ
