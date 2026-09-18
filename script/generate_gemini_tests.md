# คู่มือการใช้งาน Script สร้าง JUnit Test ด้วย Gemini 3.8 Flash (KKU GenAI)

สคริปต์นี้ถูกออกแบบมาเพื่อนำ Source Code ที่มี Bug จากโฟลเดอร์ **`Resoucre/`** (รองรับมากกว่า 800+ โฟลเดอร์โปรเจกต์) ส่ง Request ไปยัง KKU GenAI API (`https://gen.ai.kku.ac.th/api/v1/chat/completions`) โดยใช้โมเดล **`gemini-3.8-flash`** และ Template ใน `Gemini-3.8-flash/promt/promt.md` เพื่อสร้าง JUnit Test Suite อัตโนมัติทีละไฟล์ ทีละโปรเจกต์ แล้วนำโค้ดที่ได้รับจาก Response มาจัดเก็บลงใน **`Gemini-3.8-flash/TestCode/<Project>_1_buggy/`**

---

## 📌 สารบัญ
1. [ภาพรวมการทำงานและระบบ Memory State](#1-ภาพรวมการทำงานและระบบ-memory-state)
2. [ระบบรองรับหลาย API Key (Multi-Key Rotation & Failover)](#2-ระบบรองรับหลาย-api-key-multi-key-rotation--failover)
3. [ระบบจัดการ Quota Token และการรันต่อ (Resume)](#3-ระบบจัดการ-quota-token-และการรันต่อ-resume)
4. [ระบบประสิทธิภาพระดับสูง (High Scale Performance Features)](#4-ระบบประสิทธิภาพระดับสูง-high-scale-performance-features)
5. [การตั้งค่า API Key ใน .env](#5-การตั้งค่า-api-key-ใน-env)
6. [วิธีรันคำสั่ง (Usage Examples)](#6-วิธีรันคำสั่ง-usage-examples)
7. [พารามิเตอร์ทั้งหมด (CLI Arguments)](#7-พารามิเตอร์ทั้งหมด-cli-arguments)
8. [ข้อควรระวังและระบบความปลอดภัยของโค้ด](#8-ข้อควรระวังและระบบความปลอดภัยของโค้ด)

---

## 1. ภาพรวมการทำงานและระบบ Memory State

สคริปต์มีระบบ **Memory State Tracking** ในไฟล์ `Gemini-3.8-flash/generation_state.json` ซึ่งจะบันทึกสถานะของแต่ละไฟล์ (COMPLETED / FAILED / tokens / เวลาที่รัน) ทันทีหลังประมวลผลเสร็จในแต่ละไฟล์ หากโปรแกรมหยุดกลางคัน หรือ Token หมด เมื่อสั่งรันใหม่จะข้ามไฟล์ที่สำเร็จแล้วทันที ไม่เสียเวลาและไม่เสีย Token ซ้ำซ้อน

```mermaid
flowchart TD
    Start([เริ่มทำงาน]) --> LoadEnv[1. โหลด API Keys ทั้งหมดจาก .env]
    LoadEnv --> LoadState[2. โหลด Memory State จาก generation_state.json]
    LoadEnv --> IndexTests[3. In-Memory Pre-Indexing ตรวจหา Test เดิมในดิสก์]
    IndexTests --> SyncState[4. Pre-Run Sync: อัปเดต Test ภายนอกเข้า Memory State]
    LoadState --> LoadPrompt[5. โหลด Template จาก promt.md]
    LoadPrompt --> ScanResource[6. สแกนหาไฟล์ .java ใน Resoucre/ แบบ Fast Scan + Live Ticker]
    
    ScanResource --> SortTasks[7. Priority Sorting: จัดเรียงงาน Smallest First]
    SortTasks --> LoopFiles{วนซ้ำทีละไฟล์}
    LoopFiles -- พบไฟล์ --> CheckMemory{ตรวจ Memory State หรือไฟล์ Test เดิม?}
    
    CheckMemory -- มีอยู่แล้ว & ไม่ได้ใส่ --overwrite --> Skip[ข้ามทันที SKIP ประหยัดเวลา]
    CheckMemory -- ยังไม่เคยทำ หรือใส่ --overwrite --> PreCompact{ไฟล์ใหญ่เกิน 20,000 ตัวอักษร?}
    
    PreCompact -- ใช่ --> DoCompact[Proactive Pre-compact ย่อ Comments/Javadoc ล่วงหน้า]
    PreCompact -- ไม่ใช่ --> BuildReq[แทนที่ Code ลงใน Template]
    DoCompact --> BuildReq
    
    BuildReq --> SendAPI[8. ยิง Streaming Request: Round-Robin + Live SSE Tokens]
    SendAPI --> CheckResp{ผลลัพธ์จาก API}
    
    CheckResp -- สำเร็จ --> ExtractCode[9. สกัด JUnit Java Code จาก Response]
    CheckResp -- คีย์นี้ Quota หมด/ค้าง --> SwitchKey[สลับไปใช้คีย์สำรองทันที Failover]
    SwitchKey --> SendAPI
    CheckResp -- หมดทุกคีย์แล้ว --> SaveHalt[บันทึกสถานะและหยุดทำงาน HALT]
    
    ExtractCode --> SaveFile[10. บันทึกลง Gemini-3.8-flash/TestCode/Project_1_buggy/]
    SaveFile --> UpdateMemory[11. อัปเดต Memory State: COMPLETED ลงดิสก์ทันที]
    
    Skip --> NextFile[ไฟล์ถัดไป]
    UpdateMemory --> NextFile
    NextFile --> LoopFiles
    LoopFiles -- ครบทุกไฟล์ --> Finish([เสร็จสิ้น พร้อมสรุปรายงาน])
```

---

## 2. ระบบรองรับหลาย API Key (Multi-Key Rotation & Failover)

สคริปต์รองรับการใส่หลาย API Key พร้อมกันเพื่อกระจายโหลดและป้องกันปัญหางานสะดุด:

1. **Round-Robin Load Balancing**:
   - สลับใช้งานคีย์ถัดไปอัตโนมัติในแต่ละ Request (เช่น Request 1 ใช้ Key 1, Request 2 ใช้ Key 2, Request 3 ใช้ Key 3 ...)
   - ช่วยลดความเสี่ยงจากการติด Rate Limit ของแต่ละคีย์

2. **Auto-Failover เมื่อคีย์ใดคีย์หนึ่งโควต้าหมดหรือหลุด Timeout**:
   - หากคีย์ปัจจุบันเจอ HTTP 429 หรือโควต้าหมด สคริปต์จะ **ตัดคีย์นั้นออกจากคิวทันที**
   - หากคำขอค้างที่ TTFT เกิน 60 วินาที ระบบจะตัดบทและสลับไปคีย์ถัดไปทันที
   - จะหยุดทำงานเฉพาะเมื่อ **ทุกคีย์ที่มีในระบบหมดโควต้าแล้วจริงๆ เท่านั้น**

3. **โควต้าสูงของ Gemini 3.8 Flash**:
   - โมเดล `gemini-3.8-flash` บน KKU GenAI ให้โควต้าสูงถึง **350,000 tokens/วัน** ต่อ API Key (เทียบกับ Claude ที่ 200,000 tokens/วัน)

---

## 3. ระบบจัดการ Quota Token และการรันต่อ (Resume)

### 🛑 กรณี Token / Quota หมดทุกคีย์:
1. สคริปต์จะตรวจสอบ Error `insufficient_quota`, `exceeded your current quota`, `HTTP 402` หรือ `HTTP 429`
2. หากคีย์ทั้งหมดหมดโควต้า สคริปต์จะ **หยุดการทำงานทันที (HALT)** และบันทึกสถานะไฟล์ล่าสุดไว้ใน `Gemini-3.8-flash/generation_state.json`

### 🔄 การรันต่อหลังจากข้ามวันหรือเปลี่ยนคีย์:
- เพียงรันคำสั่งเดิม:
  ```bash
  python script/generate_gemini_tests.py
  ```
- สคริปต์จะอ่าน Memory State และ **ข้าม (SKIP) ทุกไฟล์ที่ทำเสร็จไปแล้วโดยอัตโนมัติ** และจะเริ่มทำงานต่อที่ไฟล์ที่ค้างอยู่ทันที

### ⌨️ กรณีผู้ใช้กดหยุดเอง (Ctrl+C):
- สคริปต์มี Handler ดักจับ `KeyboardInterrupt` เพื่อบันทึกสถานะล่าสุดลงดิสก์ก่อนปิดโปรแกรมเสมอ ข้อมูลไม่สูญหายแน่นอน

---

## 4. ระบบประสิทธิภาพระดับสูง (High Scale Performance Features)

เนื่องจากโฟลเดอร์ `Resoucre/` มีมากกว่า 840+ โฟลเดอร์โปรเจกต์และ 1,000+ ไฟล์ Java สคริปต์จึงติดตั้งฟีเจอร์ระดับ Production ดังต่อไปนี้:

1. **Fast Directory Scanner พร้อม Live Ticker Counter**:
   - ค้นหาไฟล์โครงสร้างขนาดใหญ่โดยใช้ `os.walk` ความเร็วสูง ใช้เวลาไม่ถึง 1 วินาที และแสดงหลอดนับไฟล์สดบนคอนโซล
2. **In-Memory Test Indexing (`O(1)` Search)**:
   - ทำดัชนีไฟล์ Test ใน `Gemini-3.8-flash/TestCode/` เข้าหน่วยความจำตั้งแต่ต้น ทำให้ตรวจสอบไฟล์ซ้ำได้เร็วกว่า 0.001ms ต่อไฟล์
3. **Pre-run Disk & Memory Sync**:
   - ตรวจหาไฟล์ Test ที่ผู้ใช้สร้างหรือคัดลอกมาไว้เองล่วงหน้า (เช่น `CaverphoneTest.java`, `DoubleMetaphoneTest.java`) แล้วซิงค์เข้าสถานะ `COMPLETED` ใน Memory ทันที
4. **Proactive Pre-compact สำหรับคลาสขนาดใหญ่**:
   - คลาสที่มีขนาดยาวเกิน 20,000 ตัวอักษร จะถูกย่อเอา Javadoc และ Comments ที่ไม่จำเป็นออก เพื่อลด Token ขาเข้า และป้องกันปัญหา API TTFT Timeout
5. **Priority Sorting (Smallest Files First)**:
   - จัดคิวทำไฟล์ขนาดเล็กก่อนไฟล์ขนาดใหญ่ เพื่อให้ได้จำนวน Test Suites สำเร็จสูงสุดในเวลาที่เร็วที่สุด

---

## 5. การตั้งค่า API Key ใน .env

สคริปต์รองรับรูปแบบการใส่คีย์ในไฟล์ `.env` ได้หลายแบบ:

### แบบที่ 1: แยกรายบรรทัด (แนะนำ)
```env
API_KEY=sk_E3pJjTWdbtdZ7TPB2IGkonjaYFbkhvnjYNIRUardUM0uRVelBBkZ7RNKL4wHDrbt
API_KEY2=sk_nWIdRGlat6gkYVqUWjM5fEYfE4I4mP6wN10ITjNt6bniGmph14qw3aMj1b7X6ADW
API_KEY3=sk_3ZmE4...
API_KEY4=sk_tPXl1...
```

### แบบที่ 2: คั่นด้วยจุลภาค (Comma-separated)
```env
API_KEYS=sk_key1...,sk_key2...,sk_key3...,sk_key4...
```

---

## 6. วิธีรันคำสั่ง (Usage Examples)

### 6.1 ตรวจสอบโควต้าคงเหลือจริงของทุก API Key (`--check-quota`)
ยิงตรวจสอบ Quota คงเหลือของ `gemini-3.8-flash` จากเซิร์ฟเวอร์ KKU โดยตรง:
```bash
python script/generate_gemini_tests.py --check-quota
```

### 6.2 ตรวจสอบสถานะความคืบหน้าของโปรเจกต์ (`--status`)
ดูว่ามีคีย์ไหนใช้งานได้บ้าง มีไฟล์ใดสร้างเสร็จแล้วหรือค้างอยู่:
```bash
python script/generate_gemini_tests.py --status
```

### 6.3 ทดสอบก่อนรันจริง (Dry-Run Mode)
แสดงรายการไฟล์ที่จะถูกประมวลผลทั้งหมดโดยยังไม่ยิง API:
```bash
python script/generate_gemini_tests.py --dry-run
```
หรือทดสอบเฉพาะ 5 ไฟล์แรก:
```bash
python script/generate_gemini_tests.py --dry-run -n 5
```

### 6.4 รันต่อเนื่องจากจุดเดิม (Resume / Run All)
```bash
python script/generate_gemini_tests.py
```

### 6.5 รันเฉพาะโปรเจกต์ที่ต้องการ (เช่น Codec_1 หรือ Chart_1)
```bash
python script/generate_gemini_tests.py --project Codec_1
```

### 6.6 รันแบบกำหนดจำนวนไฟล์ต่อรอบ (`-n` หรือ `--limit`)
รันคราวละ 10 ไฟล์ (เหมาะสำหรับการทยอยรันตามโควต้า):
```bash
python script/generate_gemini_tests.py -n 10
```

### 6.7 ดูโค้ดที่ Gemini กำลังเขียนแบบสตรีมสดลงหน้าจอ (`-v` หรือ `--show-stream`)
```bash
python script/generate_gemini_tests.py --project Codec_1 -v
```

### 6.8 บังคับสร้างใหม่ทั้งหมด (`--overwrite`)
ละเว้น Memory State และบังคับยิงสร้างใหม่ทุกไฟล์:
```bash
python script/generate_gemini_tests.py --project Codec_1 --overwrite
```

### 6.9 ล้าง Memory State เพื่อเริ่มต้นนับหนึ่งใหม่ (`--reset-state`)
```bash
python script/generate_gemini_tests.py --reset-state
```

---

## 7. พารามิเตอร์ทั้งหมด (CLI Arguments)

| Argument | ชนิด | ค่าเริ่มต้น | คำอธิบาย |
| :--- | :--- | :--- | :--- |
| `--check-quota` | flag | `False` | ตรวจสอบโควต้าคงเหลือจริง (Real-time Token Quota) ของทุก API Key จากเซิร์ฟเวอร์ KKU |
| `--status` | flag | `False` | แสดงรายงานความคืบหน้าปัจจุบัน (Completed/Pending/Failed) และสถานะคีย์ทั้งหมด |
| `--reset-state` | flag | `False` | ล้างประวัติ Memory State เริ่มต้นใหม่ |
| `--state-file` | string | `Gemini-3.8-flash/generation_state.json` | กำหนดตำแหน่งไฟล์บันทึกสถานะ Memory |
| `--project`, `-p` | string | `None` | ระบุชื่อโปรเจกต์ เช่น `Codec_1`, `Chart_1` (ไม่ระบุ = ทุกโปรเจกต์) |
| `--file`, `-f` | string | `None` | ระบุชื่อไฟล์เฉพาะ เช่น `Caverphone.java` |
| `--limit`, `-n` | int | `None` | จำกัดจำนวนไฟล์ที่จะประมวลผลในรอบนี้ (เช่น `-n 10` ทำ 10 ไฟล์แรก) |
| `--api-key`, `-k` | string (list) | `[]` | API Key (สามารถระบุซ้ำได้หลายครั้ง `-k key1 -k key2`) |
| `--env-file` | string | `None` | ระบุพาธไฟล์ `.env` เอง |
| `--overwrite` | flag | `False` | บังคับเขียนทับและสร้างใหม่ แม้เคยทำเสร็จแล้วใน Memory หรือมีไฟล์บนดิสก์ |
| `--delay` | float | `1.5` | หน่วงเวลาระหว่าง Request แต่ละครั้ง (วินาที) ป้องกัน Rate Limit |
| `--dry-run` | flag | `False` | โหมดจำลอง แสดงรายการไฟล์และ Prompt โดยไม่ยิง API |
| `--model` | string | `gemini-3.8-flash` | โมเดลที่ต้องการเรียกใช้ |
| `--timeout` | int | `60` | เวลา Timeout สูงสุดต่อ Request (วินาที) ตัดจบและ Failover คีย์เร็วขึ้น |
| `--sort-by-size` | flag | `True` | จัดเรียงคิวงานตามขนาดไฟล์ (Smallest first) ทำไฟล์เล็กก่อนไฟล์ใหญ่ (เปิดเป็นค่าเริ่มต้น) |
| `--no-sort-by-size` | flag | `False` | ปิดการจัดเรียงตามขนาดไฟล์ (เรียงตามลำดับโฟลเดอร์เดิม) |
| `--no-auto-compact`| flag | `False` | ปิดระบบย่อโค้ดอัตโนมัติ (ตัด Javadoc/Comments) สำหรับคลาสขนาดใหญ่ |

---

## 8. ข้อควรระวังและระบบความปลอดภัยของโค้ด

1. **สกัดเฉพาะ JUnit Java Test Code เท่านั้น**: Template ของ Gemini อาจมีการวิเคราะห์ Phase 1 (Class Analysis) และ Phase 2 (JUnit Code) สคริปต์ถูกติดตั้ง Parser พิเศษเพื่อสกัดเฉพาะบล็อก JUnit Java Test Class (`import org.junit... public class ...Test { ... }`) เท่านั้น ทำให้ไฟล์ `.java` ที่ได้สะอาดและ compile ผ่านได้ทันที
2. **Auto Markdown Fence Stripping**: สคริปต์รองรับทั้ง Response ที่ส่งมาเป็น Java ล้วน และ Response ที่ครอบด้วย markdown code block (```` ```java ... ``` ````) โดยจะตัด fence ออกให้เหลือเฉพาะโค้ด Java แท้
3. **Atomic State Writing**: การบันทึก Memory ใช้การเขียนลงไฟล์ Temp ก่อนแล้วทำการ Replace ป้องกันไฟล์ State เสียหายแม้ไฟดับหรือโปรแกรมถูกปิดกะทันหัน
