#!/usr/bin/env bash

# ==============================================================================
# Script wrapper สำหรับรัน generate_deepseek_tests.py บน WSL / Linux / Git Bash
# ==============================================================================

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
WORKSPACE_DIR="$(dirname "$SCRIPT_DIR")"

# ตรวจสอบคำสั่ง Python 3
if command -v python3 &>/dev/null; then
    PYTHON_CMD="python3"
elif command -v python &>/dev/null; then
    PYTHON_CMD="python"
else
    echo "❌ Error: ไม่พบ Python ในระบบ กรุณาติดตั้ง Python 3 ก่อนใช้งาน"
    exit 1
fi

"$PYTHON_CMD" "$SCRIPT_DIR/generate_deepseek_tests.py" "$@"
