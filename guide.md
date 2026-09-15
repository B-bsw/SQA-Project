นี่คือไฟล์คู่มือฉบับสมบูรณ์เนื้อหาทั้งหมดรวมอยู่ในไฟล์เดียว สามารถคัดลอกบล็อกโค้ดด้านล่างนี้ไปบันทึกเป็นไฟล์ `DEFECTS4J_WSL_SETUP.md` ได้ทันทีครับ

```markdown
# Defects4J Setup Guide on WSL (Ubuntu) from Scratch

คู่มือติดตั้งและตั้งค่าสภาพแวดล้อมสำหรับรัน **Defects4J (v3)** บน Windows Subsystem for Linux (WSL) โดยทำงานบน Linux Native Filesystem ทั้งหมดเพื่อป้องกันปัญหา Permission, Symlink และ Line Endings (CRLF)

---

## สารบัญ
1. [ข้อกำหนดเบื้องต้น (Prerequisites)](#1-ข้อกำหนดเบื้องต้น-prerequisites)
2. [ติดตั้ง Dependencies บน WSL](#2-ติดตั้ง-dependencies-บน-wsl)
3. [ดาวน์โหลดและติดตั้ง Defects4J](#3-ดาวน์โหลดและติดตั้ง-defects4j)
4. [ดาวน์โหลด Project Repositories (init.sh)](#4-ดาวน์โหลด-project-repositories-initsh)
5. [ตั้งค่า Environment Variables](#5-ตั้งค่า-environment-variables)
6. [ทดสอบการใช้งาน (Checkout & Compile)](#6-ทดสอบการใช้งาน-checkout--compile)
7. [สคริปต์เสริมสำหรับ Checkout ทุกโปรเจกต์](#7-สคริปต์เสริมสำหรับ-checkout-ทุกโปรเจกต์)
8. [ปัญหาที่พบบ่อยและวิธีแก้ไข (Troubleshooting)](#8-ปัญหาที่พบบ่อยและวิธีแก้ไข-troubleshooting)

---

## 1. ข้อกำหนดเบื้องต้น (Prerequisites)
* ระบบปฏิบัติการ Windows 10/11 พร้อมติดตั้ง WSL2 (Ubuntu 20.04 หรือ 22.04 LTS)
* **สำคัญมาก:** คำสั่งทั้งหมดต้องรันใน Home Directory ของ Linux (`~` หรือ `/home/<user>/`) **ห้าม** ทำงานบนพาธ Windows Mount เช่น `/mnt/c/` หรือ `/mnt/e/`

---

## 2. ติดตั้ง Dependencies บน WSL
เปิด Ubuntu Terminal แล้วรันคำสั่งอัปเดตระบบและติดตั้งซอฟต์แวร์พื้นฐาน (รวมถึง OpenJDK 11 และเครื่องมือ Perl):

```bash
sudo apt update && sudo apt install -y \
    openjdk-11-jdk \
    subversion \
    cpanminus \
    git \
    unzip \
    build-essential \
    curl

# ตรวจสอบเวอร์ชัน Java (Defects4J v3 บังคับใช้ Java 11)
java -version

```

---

## 3. ดาวน์โหลดและติดตั้ง Defects4J

Clone repository มายัง Home directory และติดตั้ง Perl dependencies:

```bash
# ย้ายไปยัง Home Directory และสร้างโฟลเดอร์ทำงาน
cd ~
mkdir -p ~/defect4j
cd ~/defect4j

# Clone source code ของ Defects4J
git clone [https://github.com/rjust/defects4j.git](https://github.com/rjust/defects4j.git)
cd defects4j

# ติดตั้งโมดูล Perl
cpanm --installdeps .
# หมายเหตุ: หากพบ Permission denied ให้ใช้ sudo cpanm --installdeps .

```

---

## 4. ดาวน์โหลด Project Repositories (init.sh)

ขั้นตอนนี้เป็นการดาวน์โหลดฐานข้อมูลบั๊กและ repository ส่วนกลาง:

```bash
cd ~/defect4j/defects4j

# สร้างโฟลเดอร์ project_repos ล่วงหน้าเพื่อป้องกันสคริปต์ขัดข้อง
mkdir -p project_repos

# ทางเลือกที่ 1: ดาวน์โหลดเฉพาะโปรเจกต์ที่ต้องการใช้งานทันที เช่น Lang (แนะนำ รวดเร็ว ใช้เวลา 1-2 นาที)
./init.sh -p Lang

# ทางเลือกที่ 2: ดาวน์โหลดทุกโปรเจกต์ทั้งหมด (Chart, Math, Time ฯลฯ ขนาดไฟล์ ~600MB+ ห้ามกด Ctrl+C ระหว่างโหลด)
 ./init.sh

```

*รอจนกว่าเทอร์มินัลจะแสดงข้อความ `Defects4J successfully initialized.` อย่างสมบูรณ์*

---

## 5. ตั้งค่า Environment Variables

เพิ่มพาธคำสั่ง `defects4j` และ Timezone ลงใน `~/.bashrc`:

```bash
echo 'export PATH=$PATH:"$HOME/defect4j/defects4j/framework/bin"' >> ~/.bashrc
echo 'export TZ="America/Los_Angeles"' >> ~/.bashrc
source ~/.bashrc

```

**ทดสอบการตั้งค่า:**

```bash
defects4j info -p Lang

```

*หากแสดงตารางรายละเอียดบั๊กของ Commons Lang แสดงว่าระบบพร้อมใช้งานแล้ว*

---

## 6. ทดสอบการใช้งาน (Checkout & Compile)

สร้างโฟลเดอร์สำหรับเก็บโค้ด แล้วทดลอง Checkout บั๊กหมายเลข 1 (`1b`) ของ Commons Lang พร้อมสั่งคอมไพล์:

```bash
# สร้างโฟลเดอร์เก็บซอร์สโค้ด
mkdir -p ~/defect4j/Code

# Checkout บั๊กเวอร์ชัน 1b
defects4j checkout -p Lang -v 1b -w ~/defect4j/Code/Lang_1_buggy

# เข้าไปยังไดเรกทอรีและสั่ง Compile
cd ~/defect4j/Code/Lang_1_buggy
defects4j compile

```

*เมื่อคอมไพล์สำเร็จ จะขึ้นข้อความแจ้งว่า `BUILD SUCCESSFUL*`

---

## 7. สคริปต์เสริมสำหรับ Checkout ทุกโปรเจกต์

หากต้องการดึงซอร์สโค้ดบั๊กตัวแรก (`1b`) ของทั้ง 17 โปรเจกต์มาไว้ในโฟลเดอร์ `~/defect4j/Code` โดยอัตโนมัติ:

```bash
mkdir -p ~/defect4j/Code

for p in Chart Cli Closure Codec Collections Compress Csv Gson JacksonCore JacksonDatabind JacksonXml Jsoup JxPath Lang Math Mockito Time; do
    echo "=========================================="
    echo "Checking out $p (1b)..."
    echo "=========================================="
    defects4j checkout -p $p -v 1b -w ~/defect4j/Code/${p}_1_buggy
done

```

---

## 8. ปัญหาที่พบบ่อยและวิธีแก้ไข (Troubleshooting)

### 1. Error: `Couldn't find up-to-date project repositories! Did you (re)run 'defects4j/init.sh'?`

* **สาเหตุ:** `./init.sh` โหลดไม่สมบูรณ์ หรือถูกกดยกเลิก (`Ctrl+C`) ไปก่อน
* **วิธีแก้:**
```bash
cd ~/defect4j/defects4j
rm -rf project_repos
mkdir -p project_repos
./init.sh -p Lang

```



### 2. ดูโฟลเดอร์ผ่าน Windows File Explorer ได้อย่างไร?

สามารถเปิด File Explorer จากโฟลเดอร์ที่กำลังทำงานอยู่ใน WSL ได้ทันทีโดยพิมพ์:

```bash
explorer.exe .

```

หรือเข้าถึงผ่าน Network Path บน Windows Run (`Win + R`):

```text
\\wsl$\Ubuntu\home\<ชื่อ-user>\defect4j\Code

```

### 3. รันเทสต์โปรเจกต์ที่ checkout มาอย่างไร?

```bash
cd ~/defect4j/Code/Lang_1_buggy

# รันชุดเทสต์ทั้งหมด
defects4j test

# รันเฉพาะเทสต์ที่กระตุ้นให้เกิดบั๊ก (Triggering Tests)
defects4j test -t

```

```

<FollowUp label="ต้องการดูวิธีสั่งรัน defects4j test เพื่อสรุปผลเทสต์ของทุกโปรเจกต์ไหม?" query="ขอตัวอย่างคำสั่งสคริปต์รัน defects4j test ทุกโฟลเดอร์ใน ~/defect4j/Code แล้วบันทึกผลลงไฟล์ log ครับ"/>

```