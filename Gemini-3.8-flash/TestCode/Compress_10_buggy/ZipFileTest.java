package org.apache.commons.compress.archivers.zip;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipException;

public class ZipFileTest {

    private List<File> tempFiles;

    @Before
    public void setUp() {
        tempFiles = new ArrayList<File>();
    }

    @After
    public void tearDown() {
        for (int i = 0; i < tempFiles.size(); i++) {
            File f = tempFiles.get(i);
            if (f != null && f.exists()) {
                f.delete();
            }
        }
        tempFiles.clear();
    }

    private File createTempZipFile(byte[] content) throws IOException {
        File file = File.createTempFile("legacy_zip_", ".zip");
        file.deleteOnExit();
        tempFiles.add(file);
        FileOutputStream fos = new FileOutputStream(file);
        try {
            fos.write(content);
        } finally {
            fos.close();
        }
        return file;
    }

    private byte[] createSimpleZipData(String entryName, byte[] data, int method) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        long lfhOffset = 0;

        CRC32 crc = new CRC32();
        crc.update(data);
        long crcValue = crc.getValue();

        byte[] compressedData = data;
        if (method == ZipArchiveEntry.DEFLATED) {
            Deflater deflater = new Deflater(Deflater.DEFAULT_COMPRESSION, true);
            deflater.setInput(data);
            deflater.finish();
            byte[] buf = new byte[1024];
            ByteArrayOutputStream defOut = new ByteArrayOutputStream();
            while (!deflater.finished()) {
                int count = deflater.deflate(buf);
                defOut.write(buf, 0, count);
            }
            deflater.end();
            compressedData = defOut.toByteArray();
        }

        byte[] nameBytes = entryName.getBytes("US-ASCII");

        baos.write(ZipArchiveOutputStream.LFH_SIG);
        baos.write(new ZipShort(20).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(method).getBytes());
        baos.write(new ZipLong(0).getBytes());
        baos.write(new ZipLong(crcValue).getBytes());
        baos.write(new ZipLong(compressedData.length).getBytes());
        baos.write(new ZipLong(data.length).getBytes());
        baos.write(new ZipShort(nameBytes.length).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(nameBytes);
        baos.write(compressedData);

        long cfdOffset = baos.size();

        baos.write(ZipArchiveOutputStream.CFH_SIG);
        baos.write(new ZipShort(20).getBytes());
        baos.write(new ZipShort(20).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(method).getBytes());
        baos.write(new ZipLong(0).getBytes());
        baos.write(new ZipLong(crcValue).getBytes());
        baos.write(new ZipLong(compressedData.length).getBytes());
        baos.write(new ZipLong(data.length).getBytes());
        baos.write(new ZipShort(nameBytes.length).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipLong(0).getBytes());
        baos.write(new ZipLong(lfhOffset).getBytes());
        baos.write(nameBytes);

        long cfdSize = baos.size() - cfdOffset;

        baos.write(ZipArchiveOutputStream.EOCD_SIG);
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(1).getBytes());
        baos.write(new ZipShort(1).getBytes());
        baos.write(new ZipLong(cfdSize).getBytes());
        baos.write(new ZipLong(cfdOffset).getBytes());
        baos.write(new ZipShort(0).getBytes());

        return baos.toByteArray();
    }

    private byte[] createTwoEntriesZipData(String name1, byte[] data1, String name2, byte[] data2) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        CRC32 crc1 = new CRC32();
        crc1.update(data1);
        long crcVal1 = crc1.getValue();
        byte[] name1Bytes = name1.getBytes("US-ASCII");

        long lfh1Offset = baos.size();
        baos.write(ZipArchiveOutputStream.LFH_SIG);
        baos.write(new ZipShort(20).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(ZipArchiveEntry.STORED).getBytes());
        baos.write(new ZipLong(0).getBytes());
        baos.write(new ZipLong(crcVal1).getBytes());
        baos.write(new ZipLong(data1.length).getBytes());
        baos.write(new ZipLong(data1.length).getBytes());
        baos.write(new ZipShort(name1Bytes.length).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(name1Bytes);
        baos.write(data1);

        CRC32 crc2 = new CRC32();
        crc2.update(data2);
        long crcVal2 = crc2.getValue();
        byte[] name2Bytes = name2.getBytes("US-ASCII");

        long lfh2Offset = baos.size();
        baos.write(ZipArchiveOutputStream.LFH_SIG);
        baos.write(new ZipShort(20).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(ZipArchiveEntry.STORED).getBytes());
        baos.write(new ZipLong(0).getBytes());
        baos.write(new ZipLong(crcVal2).getBytes());
        baos.write(new ZipLong(data2.length).getBytes());
        baos.write(new ZipLong(data2.length).getBytes());
        baos.write(new ZipShort(name2Bytes.length).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(name2Bytes);
        baos.write(data2);

        long cfdOffset = baos.size();

        baos.write(ZipArchiveOutputStream.CFH_SIG);
        baos.write(new ZipShort(20).getBytes());
        baos.write(new ZipShort(20).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(ZipArchiveEntry.STORED).getBytes());
        baos.write(new ZipLong(0).getBytes());
        baos.write(new ZipLong(crcVal1).getBytes());
        baos.write(new ZipLong(data1.length).getBytes());
        baos.write(new ZipLong(data1.length).getBytes());
        baos.write(new ZipShort(name1Bytes.length).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipLong(0).getBytes());
        baos.write(new ZipLong(lfh1Offset).getBytes());
        baos.write(name1Bytes);

        baos.write(ZipArchiveOutputStream.CFH_SIG);
        baos.write(new ZipShort(20).getBytes());
        baos.write(new ZipShort(20).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(ZipArchiveEntry.STORED).getBytes());
        baos.write(new ZipLong(0).getBytes());
        baos.write(new ZipLong(crcVal2).getBytes());
        baos.write(new ZipLong(data2.length).getBytes());
        baos.write(new ZipLong(data2.length).getBytes());
        baos.write(new ZipShort(name2Bytes.length).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipLong(0).getBytes());
        baos.write(new ZipLong(lfh2Offset).getBytes());
        baos.write(name2Bytes);

        long cfdSize = baos.size() - cfdOffset;

        baos.write(ZipArchiveOutputStream.EOCD_SIG);
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(2).getBytes());
        baos.write(new ZipShort(2).getBytes());
        baos.write(new ZipLong(cfdSize).getBytes());
        baos.write(new ZipLong(cfdOffset).getBytes());
        baos.write(new ZipShort(0).getBytes());

        return baos.toByteArray();
    }

    private byte[] createZipWithUnicodeExtra(String asciiName, String unicodeName, byte[] data) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CRC32 crc = new CRC32();
        crc.update(data);
        long crcValue = crc.getValue();

        byte[] nameBytes = asciiName.getBytes("US-ASCII");
        byte[] uniBytes = unicodeName.getBytes("UTF-8");

        ByteArrayOutputStream extraOut = new ByteArrayOutputStream();
        extraOut.write(new ZipShort(0x7075).getBytes());
        extraOut.write(new ZipShort(1 + 4 + uniBytes.length).getBytes());
        extraOut.write(1);
        CRC32 nameCrc = new CRC32();
        nameCrc.update(nameBytes);
        extraOut.write(new ZipLong(nameCrc.getValue()).getBytes());
        extraOut.write(uniBytes);
        byte[] extraData = extraOut.toByteArray();

        long lfhOffset = baos.size();
        baos.write(ZipArchiveOutputStream.LFH_SIG);
        baos.write(new ZipShort(20).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(ZipArchiveEntry.STORED).getBytes());
        baos.write(new ZipLong(0).getBytes());
        baos.write(new ZipLong(crcValue).getBytes());
        baos.write(new ZipLong(data.length).getBytes());
        baos.write(new ZipLong(data.length).getBytes());
        baos.write(new ZipShort(nameBytes.length).getBytes());
        baos.write(new ZipShort(extraData.length).getBytes());
        baos.write(nameBytes);
        baos.write(extraData);
        baos.write(data);

        long cfdOffset = baos.size();
        baos.write(ZipArchiveOutputStream.CFH_SIG);
        baos.write(new ZipShort(20).getBytes());
        baos.write(new ZipShort(20).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(ZipArchiveEntry.STORED).getBytes());
        baos.write(new ZipLong(0).getBytes());
        baos.write(new ZipLong(crcValue).getBytes());
        baos.write(new ZipLong(data.length).getBytes());
        baos.write(new ZipLong(data.length).getBytes());
        baos.write(new ZipShort(nameBytes.length).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipLong(0).getBytes());
        baos.write(new ZipLong(lfhOffset).getBytes());
        baos.write(nameBytes);

        long cfdSize = baos.size() - cfdOffset;
        baos.write(ZipArchiveOutputStream.EOCD_SIG);
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(1).getBytes());
        baos.write(new ZipShort(1).getBytes());
        baos.write(new ZipLong(cfdSize).getBytes());
        baos.write(new ZipLong(cfdOffset).getBytes());
        baos.write(new ZipShort(0).getBytes());

        return baos.toByteArray();
    }

    private byte[] createZip64Archive(String entryName, byte[] data) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        CRC32 crc = new CRC32();
        crc.update(data);
        long crcValue = crc.getValue();

        byte[] nameBytes = entryName.getBytes("US-ASCII");

        ByteArrayOutputStream lfhExtra = new ByteArrayOutputStream();
        lfhExtra.write(new ZipShort(1).getBytes());
        lfhExtra.write(new ZipShort(16).getBytes());
        lfhExtra.write(new ZipEightByteInteger(data.length).getBytes());
        lfhExtra.write(new ZipEightByteInteger(data.length).getBytes());
        byte[] lfhExtraBytes = lfhExtra.toByteArray();

        long lfhOffset = baos.size();
        baos.write(ZipArchiveOutputStream.LFH_SIG);
        baos.write(new ZipShort(45).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(ZipArchiveEntry.STORED).getBytes());
        baos.write(new ZipLong(0).getBytes());
        baos.write(new ZipLong(crcValue).getBytes());
        baos.write(new ZipLong(0xFFFFFFFFL).getBytes());
        baos.write(new ZipLong(0xFFFFFFFFL).getBytes());
        baos.write(new ZipShort(nameBytes.length).getBytes());
        baos.write(new ZipShort(lfhExtraBytes.length).getBytes());
        baos.write(nameBytes);
        baos.write(lfhExtraBytes);
        baos.write(data);

        ByteArrayOutputStream cfdExtra = new ByteArrayOutputStream();
        cfdExtra.write(new ZipShort(1).getBytes());
        cfdExtra.write(new ZipShort(24).getBytes());
        cfdExtra.write(new ZipEightByteInteger(data.length).getBytes());
        cfdExtra.write(new ZipEightByteInteger(data.length).getBytes());
        cfdExtra.write(new ZipEightByteInteger(lfhOffset).getBytes());
        byte[] cfdExtraBytes = cfdExtra.toByteArray();

        long cfdOffset = baos.size();
        baos.write(ZipArchiveOutputStream.CFH_SIG);
        baos.write(new ZipShort(45).getBytes());
        baos.write(new ZipShort(45).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(ZipArchiveEntry.STORED).getBytes());
        baos.write(new ZipLong(0).getBytes());
        baos.write(new ZipLong(crcValue).getBytes());
        baos.write(new ZipLong(0xFFFFFFFFL).getBytes());
        baos.write(new ZipLong(0xFFFFFFFFL).getBytes());
        baos.write(new ZipShort(nameBytes.length).getBytes());
        baos.write(new ZipShort(cfdExtraBytes.length).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipLong(0).getBytes());
        baos.write(new ZipLong(0xFFFFFFFFL).getBytes());
        baos.write(nameBytes);
        baos.write(cfdExtraBytes);

        long cfdSize = baos.size() - cfdOffset;

        long zip64EocdOffset = baos.size();
        baos.write(ZipArchiveOutputStream.ZIP64_EOCD_SIG);
        baos.write(new ZipEightByteInteger(44).getBytes());
        baos.write(new ZipShort(45).getBytes());
        baos.write(new ZipShort(45).getBytes());
        baos.write(new ZipLong(0).getBytes());
        baos.write(new ZipLong(0).getBytes());
        baos.write(new ZipEightByteInteger(1).getBytes());
        baos.write(new ZipEightByteInteger(1).getBytes());
        baos.write(new ZipEightByteInteger(cfdSize).getBytes());
        baos.write(new ZipEightByteInteger(cfdOffset).getBytes());

        baos.write(ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG);
        baos.write(new ZipLong(0).getBytes());
        baos.write(new ZipEightByteInteger(zip64EocdOffset).getBytes());
        baos.write(new ZipLong(1).getBytes());

        baos.write(ZipArchiveOutputStream.EOCD_SIG);
        baos.write(new ZipShort(0xFFFF).getBytes());
        baos.write(new ZipShort(0xFFFF).getBytes());
        baos.write(new ZipShort(0xFFFF).getBytes());
        baos.write(new ZipShort(0xFFFF).getBytes());
        baos.write(new ZipLong(0xFFFFFFFFL).getBytes());
        baos.write(new ZipLong(0xFFFFFFFFL).getBytes());
        baos.write(new ZipShort(0).getBytes());

        return baos.toByteArray();
    }

    @Test
    public void constructor_givenValidStoredFile_shouldOpenAndReadSuccessfully() throws Exception {
        byte[] content = "Hello Legacy Zip".getBytes("UTF-8");
        byte[] zipBytes = createSimpleZipData("test.txt", content, ZipArchiveEntry.STORED);
        File tempFile = createTempZipFile(zipBytes);

        ZipFile zf = new ZipFile(tempFile);
        try {
            Assert.assertNotNull(zf);
            Assert.assertEquals(ZipEncodingHelper.UTF8, zf.getEncoding());

            ZipArchiveEntry entry = zf.getEntry("test.txt");
            Assert.assertNotNull(entry);
            Assert.assertEquals("test.txt", entry.getName());
            Assert.assertEquals(content.length, entry.getSize());
            Assert.assertTrue(zf.canReadEntryData(entry));

            InputStream is = zf.getInputStream(entry);
            Assert.assertNotNull(is);
            byte[] readBuf = new byte[content.length];
            int readBytes = is.read(readBuf);
            Assert.assertEquals(content.length, readBytes);
            Assert.assertArrayEquals(content, readBuf);

            int eof = is.read();
            Assert.assertEquals(-1, eof);
            is.close();
        } finally {
            zf.close();
        }
    }

    @Test
    public void constructor_givenStringPath_shouldOpenArchive() throws Exception {
        byte[] content = "String path test".getBytes("UTF-8");
        byte[] zipBytes = createSimpleZipData("path_test.txt", content, ZipArchiveEntry.STORED);
        File tempFile = createTempZipFile(zipBytes);

        ZipFile zf = new ZipFile(tempFile.getAbsolutePath());
        try {
            Assert.assertNotNull(zf.getEntry("path_test.txt"));
        } finally {
            zf.close();
        }
    }

    @Test
    public void constructor_givenStringPathAndEncoding_shouldOpenArchive() throws Exception {
        byte[] content = "Path with encoding".getBytes("UTF-8");
        byte[] zipBytes = createSimpleZipData("enc_test.txt", content, ZipArchiveEntry.STORED);
        File tempFile = createTempZipFile(zipBytes);

        ZipFile zf = new ZipFile(tempFile.getAbsolutePath(), "US-ASCII");
        try {
            Assert.assertEquals("US-ASCII", zf.getEncoding());
            Assert.assertNotNull(zf.getEntry("enc_test.txt"));
        } finally {
            zf.close();
        }
    }

    @Test
    public void constructor_givenFileAndEncoding_shouldOpenArchive() throws Exception {
        byte[] content = "File with encoding".getBytes("UTF-8");
        byte[] zipBytes = createSimpleZipData("file_enc.txt", content, ZipArchiveEntry.STORED);
        File tempFile = createTempZipFile(zipBytes);

        ZipFile zf = new ZipFile(tempFile, "UTF-8");
        try {
            Assert.assertEquals("UTF-8", zf.getEncoding());
            Assert.assertNotNull(zf.getEntry("file_enc.txt"));
        } finally {
            zf.close();
        }
    }

    @Test
    public void getInputStream_givenDeflatedEntry_shouldDecompressCorrectly() throws Exception {
        byte[] content = "Deflated content that can be compressed properly".getBytes("UTF-8");
        byte[] zipBytes = createSimpleZipData("deflated.txt", content, ZipArchiveEntry.DEFLATED);
        File tempFile = createTempZipFile(zipBytes);

        ZipFile zf = new ZipFile(tempFile);
        try {
            ZipArchiveEntry entry = zf.getEntry("deflated.txt");
            Assert.assertNotNull(entry);
            Assert.assertEquals(ZipArchiveEntry.DEFLATED, entry.getMethod());

            InputStream is = zf.getInputStream(entry);
            Assert.assertNotNull(is);
            byte[] outBytes = new byte[content.length];
            int totalRead = 0;
            int r;
            while (totalRead < outBytes.length && (r = is.read(outBytes, totalRead, outBytes.length - totalRead)) != -1) {
                totalRead += r;
            }
            Assert.assertEquals(content.length, totalRead);
            Assert.assertArrayEquals(content, outBytes);

            int eof = is.read();
            Assert.assertEquals(-1, eof);
            is.close();
        } finally {
            zf.close();
        }
    }

    @Test
    public void getInputStream_givenUnknownEntry_shouldReturnNull() throws Exception {
        byte[] content = "content".getBytes("UTF-8");
        byte[] zipBytes = createSimpleZipData("file.txt", content, ZipArchiveEntry.STORED);
        File tempFile = createTempZipFile(zipBytes);

        ZipFile zf = new ZipFile(tempFile);
        try {
            ZipArchiveEntry ze = new ZipArchiveEntry("nonexistent.txt");
            InputStream is = zf.getInputStream(ze);
            Assert.assertNull(is);
        } finally {
            zf.close();
        }
    }

    @Test
    public void getInputStream_givenUnsupportedCompressionMethod_shouldThrowZipException() throws Exception {
        byte[] content = "Dummy".getBytes("UTF-8");
        byte[] zipBytes = createSimpleZipData("unsupported.txt", content, ZipArchiveEntry.STORED);

        for (int i = 0; i < zipBytes.length - 4; i++) {
            if (zipBytes[i] == ZipArchiveOutputStream.CFH_SIG[0]
                    && zipBytes[i + 1] == ZipArchiveOutputStream.CFH_SIG[1]
                    && zipBytes[i + 2] == ZipArchiveOutputStream.CFH_SIG[2]
                    && zipBytes[i + 3] == ZipArchiveOutputStream.CFH_SIG[3]) {
                zipBytes[i + 10] = (byte) 99;
                zipBytes[i + 11] = 0;
                break;
            }
        }

        File tempFile = createTempZipFile(zipBytes);
        ZipFile zf = new ZipFile(tempFile);
        try {
            ZipArchiveEntry entry = zf.getEntry("unsupported.txt");
            Assert.assertNotNull(entry);
            try {
                zf.getInputStream(entry);
                Assert.fail("Expected ZipException for unsupported compression method");
            } catch (ZipException ex) {
                Assert.assertTrue(ex.getMessage().indexOf("unsupported compression method") >= 0);
            }
        } finally {
            zf.close();
        }
    }

    @Test
    public void getEntries_givenMultipleEntries_shouldReturnAllInEnumeration() throws Exception {
        byte[] data1 = "first entry".getBytes("UTF-8");
        byte[] data2 = "second entry data".getBytes("UTF-8");
        byte[] zipBytes = createTwoEntriesZipData("first.txt", data1, "second.txt", data2);
        File tempFile = createTempZipFile(zipBytes);

        ZipFile zf = new ZipFile(tempFile);
        try {
            Enumeration<ZipArchiveEntry> en = zf.getEntries();
            Assert.assertNotNull(en);

            int count = 0;
            while (en.hasMoreElements()) {
                ZipArchiveEntry entry = en.nextElement();
                Assert.assertNotNull(entry);
                count++;
            }
            Assert.assertEquals(2, count);
        } finally {
            zf.close();
        }
    }

    @Test
    public void getEntriesInPhysicalOrder_givenEntries_shouldOrderCorrectly() throws Exception {
        byte[] data1 = "data one".getBytes("UTF-8");
        byte[] data2 = "data two longer".getBytes("UTF-8");
        byte[] zipBytes = createTwoEntriesZipData("a.txt", data1, "b.txt", data2);
        File tempFile = createTempZipFile(zipBytes);

        ZipFile zf = new ZipFile(tempFile);
        try {
            Enumeration<ZipArchiveEntry> en = zf.getEntriesInPhysicalOrder();
            Assert.assertTrue(en.hasMoreElements());
            ZipArchiveEntry e1 = en.nextElement();
            Assert.assertTrue(en.hasMoreElements());
            ZipArchiveEntry e2 = en.nextElement();
            Assert.assertFalse(en.hasMoreElements());

            Assert.assertEquals("a.txt", e1.getName());
            Assert.assertEquals("b.txt", e2.getName());
        } finally {
            zf.close();
        }
    }

    @Test
    public void getEntry_givenNonExistentName_shouldReturnNull() throws Exception {
        byte[] content = "text".getBytes("UTF-8");
        byte[] zipBytes = createSimpleZipData("sample.txt", content, ZipArchiveEntry.STORED);
        File tempFile = createTempZipFile(zipBytes);

        ZipFile zf = new ZipFile(tempFile);
        try {
            Assert.assertNull(zf.getEntry("not_found.txt"));
        } finally {
            zf.close();
        }
    }

    @Test
    public void closeQuietly_givenNullZipFile_shouldNotThrow() {
        ZipFile.closeQuietly(null);
    }

    @Test
    public void closeQuietly_givenOpenZipFile_shouldCloseSilently() throws Exception {
        byte[] content = "text".getBytes("UTF-8");
        byte[] zipBytes = createSimpleZipData("sample.txt", content, ZipArchiveEntry.STORED);
        File tempFile = createTempZipFile(zipBytes);

        ZipFile zf = new ZipFile(tempFile);
        ZipFile.closeQuietly(zf);
    }

    @Test
    public void constructor_givenEmptyFile_shouldThrowZipException() throws Exception {
        File emptyFile = createTempZipFile(new byte[0]);
        try {
            new ZipFile(emptyFile);
            Assert.fail("Expected ZipException for empty file");
        } catch (ZipException e) {
            Assert.assertTrue(e.getMessage().indexOf("archive is not a ZIP archive") >= 0);
        }
    }

    @Test
    public void constructor_givenCorruptArchive_shouldThrowZipException() throws Exception {
        byte[] randomBytes = new byte[100];
        for (int i = 0; i < randomBytes.length; i++) {
            randomBytes[i] = (byte) (i + 1);
        }
        File corruptFile = createTempZipFile(randomBytes);
        try {
            new ZipFile(corruptFile);
            Assert.fail("Expected ZipException for non-zip file");
        } catch (ZipException e) {
            Assert.assertTrue(e.getMessage().indexOf("archive is not a ZIP archive") >= 0);
        }
    }

    @Test
    public void constructor_givenLfhWithoutCentralDirectory_shouldThrowIOException() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ZipArchiveOutputStream.LFH_SIG);
        baos.write(new ZipShort(20).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipLong(0).getBytes());
        baos.write(new ZipLong(0).getBytes());
        baos.write(new ZipLong(0).getBytes());
        baos.write(new ZipLong(0).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(0).getBytes());

        baos.write(ZipArchiveOutputStream.EOCD_SIG);
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipShort(0).getBytes());
        baos.write(new ZipLong(0).getBytes());
        baos.write(new ZipLong(baos.size() - 22).getBytes());
        baos.write(new ZipShort(0).getBytes());

        File invalidZip = createTempZipFile(baos.toByteArray());
        try {
            new ZipFile(invalidZip);
            Assert.fail("Expected IOException for empty central directory with LFH signature");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("central directory is empty") >= 0);
        }
    }

    @Test
    public void constructor_givenZip64Archive_shouldParseSizesAndOffsets() throws Exception {
        byte[] content = "Zip64 content payload".getBytes("UTF-8");
        byte[] zip64Bytes = createZip64Archive("zip64_entry.txt", content);
        File tempFile = createTempZipFile(zip64Bytes);

        ZipFile zf = new ZipFile(tempFile);
        try {
            ZipArchiveEntry ze = zf.getEntry("zip64_entry.txt");
            Assert.assertNotNull(ze);
            Assert.assertEquals(content.length, ze.getSize());
            Assert.assertEquals(content.length, ze.getCompressedSize());

            InputStream is = zf.getInputStream(ze);
            Assert.assertNotNull(is);
            byte[] readContent = new byte[content.length];
            int r = is.read(readContent);
            Assert.assertEquals(content.length, r);
            Assert.assertArrayEquals(content, readContent);
            is.close();
        } finally {
            zf.close();
        }
    }

    @Test
    public void constructor_givenZipWithUnicodeExtraFields_shouldUpdateName() throws Exception {
        byte[] content = "Data with unicode extra".getBytes("UTF-8");
        byte[] zipBytes = createZipWithUnicodeExtra("ascii_name.txt", "unicode_name.txt", content);
        File tempFile = createTempZipFile(zipBytes);

        ZipFile zf = new ZipFile(tempFile, "US-ASCII", true);
        try {
            ZipArchiveEntry entry = zf.getEntry("unicode_name.txt");
            Assert.assertNotNull(entry);
            Assert.assertEquals("unicode_name.txt", entry.getName());
            Assert.assertNull(zf.getEntry("ascii_name.txt"));
        } finally {
            zf.close();
        }
    }

    @Test
    public void boundedInputStream_givenSingleByteReads_shouldReadByteByByte() throws Exception {
        byte[] content = new byte[] { 10, 20, 30, 40 };
        byte[] zipBytes = createSimpleZipData("single_bytes.bin", content, ZipArchiveEntry.STORED);
        File tempFile = createTempZipFile(zipBytes);

        ZipFile zf = new ZipFile(tempFile);
        try {
            ZipArchiveEntry ze = zf.getEntry("single_bytes.bin");
            InputStream is = zf.getInputStream(ze);
            for (int i = 0; i < content.length; i++) {
                int val = is.read();
                Assert.assertEquals(content[i], (byte) val);
            }
            int eof = is.read();
            Assert.assertEquals(-1, eof);
            is.close();
        } finally {
            zf.close();
        }
    }

    @Test
    public void boundedInputStream_givenZeroLengthRead_shouldReturnZero() throws Exception {
        byte[] content = new byte[] { 1, 2, 3 };
        byte[] zipBytes = createSimpleZipData("zero_len.bin", content, ZipArchiveEntry.STORED);
        File tempFile = createTempZipFile(zipBytes);

        ZipFile zf = new ZipFile(tempFile);
        try {
            ZipArchiveEntry ze = zf.getEntry("zero_len.bin");
            InputStream is = zf.getInputStream(ze);
            byte[] buf = new byte[5];
            int ret = is.read(buf, 0, 0);
            Assert.assertEquals(0, ret);
            is.close();
        } finally {
            zf.close();
        }
    }

    @Test
    public void finalize_givenUnclosedZipFile_shouldNotThrowException() throws Throwable {
        byte[] content = "Finalize test".getBytes("UTF-8");
        byte[] zipBytes = createSimpleZipData("fin.txt", content, ZipArchiveEntry.STORED);
        File tempFile = createTempZipFile(zipBytes);

        ZipFile zf = new ZipFile(tempFile);
        zf.finalize();
    }

    @Test
    public void finalize_givenAlreadyClosedZipFile_shouldNotThrowException() throws Throwable {
        byte[] content = "Closed finalize test".getBytes("UTF-8");
        byte[] zipBytes = createSimpleZipData("closed_fin.txt", content, ZipArchiveEntry.STORED);
        File tempFile = createTempZipFile(zipBytes);

        ZipFile zf = new ZipFile(tempFile);
        zf.close();
        zf.finalize();
    }
}