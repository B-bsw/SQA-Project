# Generic Algorithm — EvoSuite

ทดลองสร้าง test ด้วย EvoSuite `STANDARD_GA` จาก Defects4J buggy revision แล้ว
นำ generated tests ชุดเดียวกันไปรันกับทั้ง buggy และ fixed revision

## ใช้งาน

```bash
cp Configuration/.env.example Configuration/.env
```

```bash
cd GenericAlgorithm/Code
./run_evosuite_ga.sh Chart 1 1 120
./collect_ga_reports.sh 1
./merge_round_reports.sh

# รันหลาย target พร้อมกันและรวม report อัตโนมัติ
./run_evosuite_ga.sh Chart 1,2,3 1 120
```

Arguments ของสคริปต์หลัก:

```text
run_evosuite_ga.sh PROJECT BUG_ID[,BUG_ID...] RESULT_ROUND [BUDGET_SECONDS]
```

ตัวอย่าง Round 2:

```bash
./run_evosuite_ga.sh Chart 1 2 120
./collect_ga_reports.sh 2
```

## โครงสร้าง

```text
GenericAlgorithm/
├── Code/
│   ├── run_evosuite_ga.sh
│   ├── collect_ga_reports.sh
│   ├── merge_round_reports.sh
│   ├── evosuite-1.2.0.jar
│   └── README.md
├── TestCode/
│   ├── Chart_1/                 generated Java ของ Chart-1
│   └── Chart_2/                 generated Java ของ Chart-2
├── Result_Round1/
│   ├── Chart_1/result.csv
│   ├── Chart_1/result.json
│   └── report.csv
└── Result_Round2/
    ├── Chart_1/result.csv
    ├── Chart_1/result.json
    └── report.csv
```

รายงานรวมของทั้งสอง round อยู่ที่:

```text
GenericAlgorithm/report.csv
```

checkout, build, log และ `evosuite-tests.tar.bz2` ถูกสร้างใน `/tmp` เท่านั้น
และลบอัตโนมัติเมื่อจบงาน สิ่งที่เก็บใน `TestCode/PROJECT_BUG` จึงมีเฉพาะ
generated `.java` files

รายละเอียด workflow และ report schema อยู่ใน [Code/README.md](Code/README.md)
