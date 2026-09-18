#!/usr/bin/env bash

# ใช้โฟลเดอร์ปัจจุบันที่ cd เข้าไป
export PATH="$PATH:$HOME/defect4j/defects4j/framework/bin"
PROJECT_NAME=$(basename "$PWD")
OUTPUT_CSV="report.csv"

echo "=========================================="
echo "Processing: $PROJECT_NAME"
echo "=========================================="

# 1. Compile
echo "Compiling..."
if defects4j compile > /dev/null 2>&1; then
  compile_status="PASS"
else
  compile_status="FAIL"
fi

# 2. Test
tests_total="0"
tests_failed="0"
failed_list="None"

if [ "$compile_status" = "PASS" ]; then
  echo "Running tests..."
  defects4j test > /dev/null 2>&1

  if [ -f "failing_tests" ]; then
    tests_failed=$(grep -c "^---" failing_tests 2>/dev/null || echo "0")
    
    # ดึงชื่อ test ที่ตกมารวมเป็นบรรทัดเดียวคั่นด้วย ';'
    if [ "$tests_failed" -gt 0 ]; then
      failed_list=$(grep "^---" failing_tests | sed 's/^--- //' | tr '\n' ';' | sed 's/;$//')
    fi
  fi

  if [ -f "all_tests" ]; then
    tests_total=$(wc -l < all_tests | tr -d ' ')
  fi
fi

# 3. Coverage
line_cov="N/A"
branch_cov="N/A"

if [ "$compile_status" = "PASS" ]; then
  echo "Running coverage..."
  defects4j coverage > /dev/null 2>&1

  if [ -f "coverage.xml" ]; then
    raw_line=$(grep -m 1 -o 'line-rate="[^"]*"' coverage.xml | cut -d'"' -f2)
    raw_branch=$(grep -m 1 -o 'branch-rate="[^"]*"' coverage.xml | cut -d'"' -f2)

    if [ -n "$raw_line" ]; then
      line_cov=$(awk "BEGIN {printf \"%.2f%%\", $raw_line * 100}")
    fi
    if [ -n "$raw_branch" ]; then
      branch_cov=$(awk "BEGIN {printf \"%.2f%%\", $raw_branch * 100}")
    fi
  fi
fi

# สร้าง Header หากยังไม่มีไฟล์ CSV
if [ ! -f "$OUTPUT_CSV" ]; then
  echo "Project_Folder,Compile_Status,Tests_Total,Tests_Failed,Failed_Test_List,Line_Coverage,Branch_Coverage" > "$OUTPUT_CSV"
fi

# บันทึกข้อมูลลงใน report.csv ของโฟลเดอร์นั้น
echo "$PROJECT_NAME,$compile_status,$tests_total,$tests_failed,\"$failed_list\",$line_cov,$branch_cov" >> "$OUTPUT_CSV"

echo "=========================================="
echo "Done! Report saved to: $PWD/$OUTPUT_CSV"
