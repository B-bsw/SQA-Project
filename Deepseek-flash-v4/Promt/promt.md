# Prompt: สร้าง JUnit Test Suite (JUnit 4 / JUnit 5 Compatible)

## 🎯 วัตถุประสงค์
สร้าง JUnit test suite สำหรับ Java class ในส่วน `<source_code>` โดยต้อง:
1. **เลือกใช้ Test Framework ตาม Dependency ของโปรเจกต์ (JUnit 4 หรือ JUnit 5)**
2. ครอบคลุม public methods และ logic หลักอย่างกระชับ ไม่สร้าง test cases ซ้ำซ้อน
3. มี test case สำหรับ: normal case, boundary value, null/empty input, exception path
4. ครอบคลุม branch สำคัญ (if/else, switch, loop: 0 รอบ, 1 รอบ, หลายรอบ)
5. ใช้ assertion ที่ตรวจสอบ return value และ side effect จริง หลีกเลี่ยง assertion ปลอม เช่น `assertTrue(true)`
6. โค้ดทั้งหมดต้องเขียนเป็นไฟล์ Java ที่จบสมบูรณ์ 100% ปิดคลาสด้วย `}` เสมอ ห้ามหยุดกลางคัน

---

## ⚙️ SYSTEM SPECIFICATIONS & COMPATIBILITY

### 1. Framework Selection (เลือกตาม Dependency ของโปรเจกต์)

[FRAMEWORK_SPECIFICATION]
- **หากเป็น JUnit 4 (ค่าเริ่มต้นของ Defects4J):**
  - ใช้ imports: `org.junit.Test`, `org.junit.Before`, `org.junit.After`
  - ใช้ assertion: `org.junit.Assert.*` (`assertEquals`, `assertNull`, `assertNotNull`, `assertSame`, `fail`)
  - Exception handling: `@Test(expected = XxxException.class)` หรือ `try { ... fail(); } catch (XxxException e) { ... }`
  - Setup/Teardown: `@Before` / `@After`
  - ❌ ห้ามใช้ JUnit Jupiter / JUnit 5 annotations ในโปรเจกต์ JUnit 4

- **หากเป็น JUnit 5 (Jupiter):**
  - ใช้ imports: `org.junit.jupiter.api.Test`, `org.junit.jupiter.api.BeforeEach`, `org.junit.jupiter.api.AfterEach`
  - ใช้ assertion: `org.junit.jupiter.api.Assertions.*` (`assertEquals`, `assertNull`, `assertNotNull`, `assertThrows`)
  - Exception handling: `assertThrows(XxxException.class, () -> { ... });`
  - Setup/Teardown: `@BeforeEach` / `@AfterEach`

### 2. Language & Dependency Constraints
- ใช้ syntax ที่เข้ากันได้กับโปรเจกต์ (Java 7/8 ขึ้นกับโปรเจกต์)
- ❌ **ห้ามใช้ Mockito / PowerMock / AssertJ / Hamcrest** เว้นแต่มีระบุไว้ใน dependency ของโปรเจกต์
- ✅ สำหรับ Mock/Stub/Spy ให้เขียนเป็น Plain Java Objects (Static Inner Classes) ภายใน Test File
- ✅ **Package declaration ของ Test class ต้องตรงกับ Source Code ที่ให้มา**
- ✅ ตั้งชื่อ Test class ว่า `<SourceClass>Test`

### 3. Concise Branch Coverage (กระชับและไม่ซ้ำซ้อน)
- **เน้น Branch ที่สำคัญ**: เจาะจงกรณีที่กระทบต่อเงื่อนไขการตัดสินใจ (decision branches), ขอบเขตค่า (boundary values), ค่าว่าง/null, และ exception handling
- **หลีกเลี่ยงการสร้างเทสต์ซ้ำซ้อน (Non-redundant)**: ไม่สร้าง method ย่อยหลายตัวที่ทดสอบพฤติกรรมเดียวกันเพียงแค่เปลี่ยน literal เล็กน้อย
- **ป้องกันปัญหา Output Truncation**: เขียนโค้ดให้กระชับ เพื่อให้สามารถส่งออกไฟล์ Java ที่สมบูรณ์ครบถ้วน ไม่ติด token output limit

---

## 📦 Project Dependencies (pom.xml)

```xml
[DEPENDENCY_SPECIFICATION]
```

Dependencies เพิ่มเติมของโปรเจกต์:
[signature ของ class ที่ target class เรียกใช้ ถ้ามี]

---

## 💻 Source Code ที่ต้องการ Test

<source_code>
[full class source code ของ target class]
</source_code>

---

## 📤 Output ที่ต้องการ

1. ตอบเฉพาะโค้ดภาษา Java ทั้งไฟล์ตั้งแต่ `package ...` จนถึงปีกกาปิด `}` เท่านั้น
2. **ห้ามมีคำอธิบาย บทนำ สรุป หรือข้อความใดๆ นอกเหนือจากโค้ด Java**
3. **ห้ามใส่ Markdown Code Fence** (เช่น ```java หรือ ```) เพื่อให้บันทึกเป็นไฟล์ .java ได้ทันที
4. ตรวจสอบให้มั่นใจว่าปีกกาเปิด-ปิด `{}` มีจำนวนครบถ้วนและปิดคลาสสมบูรณ์
