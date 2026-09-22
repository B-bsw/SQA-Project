package org.apache.commons.compress.archivers.zip;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Assert;
import org.junit.Test;

public class ZipArchiveInputStreamTest {

    private static final byte[] LFH_SIG_BYTES = new byte[] {0x50, 0x4b, 0x03, 0x04};
    private static final byte[] CFH_SIG_BYTES = new byte[] {0x50, 0x4b, 0x01, 0x02};
    private static final byte[] EOCD_SIG_BYTES = new byte[] {0x50, 0x4b, 0x05, 0x06};

    private static void writeShort(ByteArrayOutputStream out, int val) {
        out.write(val & 0xFF);
        out.write((val >> 8) & 0xFF);
    }

    private static void writeInt(ByteArrayOutputStream out, long val) {
        out.write((int) (val & 0xFF));
        out.write((int) ((val >> 8) & 0xFF));
        out.write((int) ((val >> 16) & 0xFF));
        out.write((int) ((val >> 24) & 0xFF));
    }

    private static byte[] deflateData(byte[] input) {
        Deflater deflater = new Deflater(Deflater.DEFAULT_COMPRESSION, true);
        deflater.setInput(input);
        deflater.finish();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buf = new byte[512];
        while (!deflater.finished()) {
            int count = deflater.deflate(buf);
            baos.write(buf, 0, count);
        }
        deflater.end();
        return baos.toByteArray();
    }

    private static byte[] createZipStreamBytes(int method, int gpFlag, String name, byte[] extra, byte[] data, boolean includeDescriptor) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] nameBytes = name.getBytes("UTF-8");
        byte[] extraBytes = (extra != null) ? extra : new byte[0];

        long crcValue = 0;
        if (data != null && data.length > 0) {
            CRC32 crc = new CRC32();
            crc.update(data);
            crcValue = crc.getValue();
        }

        byte[] payload;
        long compressedSize;
        long uncompressedSize;
        if (data != null) {
            uncompressedSize = data.length;
            if (method == ZipArchiveOutputStream.DEFLATED) {
                payload = deflateData(data);
                compressedSize = payload.length;
            } else {
                payload = data;
                compressedSize = payload.length;
            }
        } else {
            payload = new byte[0];
            compressedSize = 0;
            uncompressedSize = 0;
        }

        baos.write(LFH_SIG_BYTES);
        writeShort(baos, 20);
        writeShort(baos, gpFlag);
        writeShort(baos, method);
        writeInt(baos, 0);

        if ((gpFlag & 8) != 0) {
            writeInt(baos, 0);
            writeInt(baos, 0);
            writeInt(baos, 0);
        } else {
            writeInt(baos, crcValue);
            writeInt(baos, compressedSize);
            writeInt(baos, uncompressedSize);
        }

        writeShort(baos, nameBytes.length);
        writeShort(baos, extraBytes.length);
        baos.write(nameBytes);
        baos.write(extraBytes);
        baos.write(payload);

        if (includeDescriptor && ((gpFlag & 8) != 0)) {
            baos.write(new byte[] {0x50, 0x4b, 0x07, 0x08});
            writeInt(baos, crcValue);
            writeInt(baos, compressedSize);
            writeInt(baos, uncompressedSize);
        }

        return baos.toByteArray();
    }

    @Test
    public void matches_givenShortSignature_shouldReturnFalse() {
        byte[] shortSig = new byte[] {0x50, 0x4b};
        boolean result = ZipArchiveInputStream.matches(shortSig, shortSig.length);
        Assert.assertFalse(result);
    }

    @Test
    public void matches_givenLfhSignature_shouldReturnTrue() {
        byte[] sig = new byte[] {0x50, 0x4b, 0x03, 0x04};
        boolean result = ZipArchiveInputStream.matches(sig, 4);
        Assert.assertTrue(result);
    }

    @Test
    public void matches_givenEocdSignature_shouldReturnTrue() {
        byte[] sig = new byte[] {0x50, 0x4b, 0x05, 0x06};
        boolean result = ZipArchiveInputStream.matches(sig, 4);
        Assert.assertTrue(result);
    }

    @Test
    public void matches_givenInvalidSignature_shouldReturnFalse() {
        byte[] sig = new byte[] {0x00, 0x00, 0x00, 0x00};
        boolean result = ZipArchiveInputStream.matches(sig, 4);
        Assert.assertFalse(result);
    }

    @Test
    public void constructor_givenInputStream_shouldInitializeProperly() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(is);
        Assert.assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test
    public void constructor_givenEncodingAndUnicodeFlag_shouldInitializeProperly() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(is, "UTF-8", false);
        Assert.assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test
    public void getNextZipEntry_givenEmptyStream_shouldReturnNull() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        ZipArchiveEntry entry = zis.getNextZipEntry();
        Assert.assertNull(entry);
        zis.close();
    }

    @Test
    public void getNextZipEntry_givenInvalidHeaderSignature_shouldReturnNull() throws IOException {
        byte[] invalidHeader = new byte[30];
        invalidHeader[0] = 0x12;
        invalidHeader[1] = 0x34;
        invalidHeader[2] = 0x56;
        invalidHeader[3] = 0x78;
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(invalidHeader));
        ZipArchiveEntry entry = zis.getNextZipEntry();
        Assert.assertNull(entry);
        zis.close();
    }

    @Test
    public void getNextZipEntry_givenCentralDirectoryHeader_shouldReturnNullAndSetHitCentralDirectory() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(CFH_SIG_BYTES);
        baos.write(new byte[26]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        ZipArchiveEntry entry = zis.getNextZipEntry();
        Assert.assertNull(entry);
        Assert.assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test
    public void getNextZipEntry_givenClosedStream_shouldReturnNull() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        zis.close();
        Assert.assertNull(zis.getNextZipEntry());
    }

    @Test
    public void getNextEntry_givenValidStream_shouldDelegateToGetNextZipEntry() throws IOException {
        byte[] zipBytes = createZipStreamBytes(ZipArchiveOutputStream.STORED, 0, "test.txt", null, "Hello".getBytes("UTF-8"), false);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        ArchiveEntry entry = zis.getNextEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("test.txt", entry.getName());
        zis.close();
    }

    @Test
    public void read_givenNoCurrentEntry_shouldReturnMinusOne() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        byte[] buf = new byte[10];
        int read = zis.read(buf, 0, buf.length);
        Assert.assertEquals(-1, read);
        zis.close();
    }

    @Test(expected = IOException.class)
    public void read_givenClosedStream_shouldThrowIOException() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        zis.close();
        byte[] buf = new byte[10];
        zis.read(buf, 0, buf.length);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void read_givenNegativeOffset_shouldThrowArrayIndexOutOfBoundsException() throws IOException {
        byte[] zipBytes = createZipStreamBytes(ZipArchiveOutputStream.STORED, 0, "test.txt", null, "Data".getBytes("UTF-8"), false);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zis.getNextZipEntry();
        byte[] buf = new byte[10];
        try {
            zis.read(buf, -1, 5);
        } finally {
            zis.close();
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void read_givenNegativeLength_shouldThrowArrayIndexOutOfBoundsException() throws IOException {
        byte[] zipBytes = createZipStreamBytes(ZipArchiveOutputStream.STORED, 0, "test.txt", null, "Data".getBytes("UTF-8"), false);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zis.getNextZipEntry();
        byte[] buf = new byte[10];
        try {
            zis.read(buf, 0, -1);
        } finally {
            zis.close();
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void read_givenOutOfBoundsOffsetAndLength_shouldThrowArrayIndexOutOfBoundsException() throws IOException {
        byte[] zipBytes = createZipStreamBytes(ZipArchiveOutputStream.STORED, 0, "test.txt", null, "Data".getBytes("UTF-8"), false);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zis.getNextZipEntry();
        byte[] buf = new byte[10];
        try {
            zis.read(buf, 5, 6);
        } finally {
            zis.close();
        }
    }

    @Test
    public void read_givenStoredEntry_shouldReadExactData() throws IOException {
        byte[] content = "Hello Legacy Zip!".getBytes("UTF-8");
        byte[] zipBytes = createZipStreamBytes(ZipArchiveOutputStream.STORED, 0, "stored.txt", null, content, false);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        ZipArchiveEntry entry = zis.getNextZipEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("stored.txt", entry.getName());
        Assert.assertEquals(ZipArchiveOutputStream.STORED, entry.getMethod());

        byte[] readBuf = new byte[content.length];
        int totalRead = 0;
        int r;
        while ((r = zis.read(readBuf, totalRead, readBuf.length - totalRead)) != -1) {
            totalRead += r;
        }
        Assert.assertEquals(content.length, totalRead);
        Assert.assertEquals(new String(content, "UTF-8"), new String(readBuf, "UTF-8"));
        Assert.assertEquals(-1, zis.read(readBuf, 0, readBuf.length));
        zis.close();
    }

    @Test
    public void read_givenDeflatedEntry_shouldInflateDataCorrectly() throws IOException {
        byte[] content = "Repeated content for deflater test. Repeated content for deflater test.".getBytes("UTF-8");
        byte[] zipBytes = createZipStreamBytes(ZipArchiveOutputStream.DEFLATED, 0, "deflated.txt", null, content, false);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        ZipArchiveEntry entry = zis.getNextZipEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("deflated.txt", entry.getName());
        Assert.assertEquals(ZipArchiveOutputStream.DEFLATED, entry.getMethod());

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] readBuf = new byte[16];
        int r;
        while ((r = zis.read(readBuf, 0, readBuf.length)) != -1) {
            out.write(readBuf, 0, r);
        }
        Assert.assertArrayEquals(content, out.toByteArray());
        Assert.assertEquals(-1, zis.read(readBuf, 0, readBuf.length));
        zis.close();
    }

    @Test(expected = ZipException.class)
    public void read_givenCorruptedDeflatedData_shouldThrowZipException() throws IOException {
        byte[] content = "Some content".getBytes("UTF-8");
        byte[] zipBytes = createZipStreamBytes(ZipArchiveOutputStream.DEFLATED, 0, "corrupt.txt", null, content, false);
        for (int i = 30 + "corrupt.txt".getBytes("UTF-8").length; i < zipBytes.length; i++) {
            zipBytes[i] = (byte) 0xFF;
        }
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zis.getNextZipEntry();
        byte[] buf = new byte[32];
        try {
            zis.read(buf, 0, buf.length);
        } finally {
            zis.close();
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void skip_givenNegativeValue_shouldThrowIllegalArgumentException() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        try {
            zis.skip(-1);
        } finally {
            zis.close();
        }
    }

    @Test
    public void skip_givenZeroValue_shouldReturnZero() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        long skipped = zis.skip(0);
        Assert.assertEquals(0, skipped);
        zis.close();
    }

    @Test
    public void skip_givenPositiveValueOnStoredEntry_shouldSkipRequestedBytes() throws IOException {
        byte[] content = "1234567890ABCDEF".getBytes("UTF-8");
        byte[] zipBytes = createZipStreamBytes(ZipArchiveOutputStream.STORED, 0, "skip.txt", null, content, false);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zis.getNextZipEntry();

        long skipped = zis.skip(10);
        Assert.assertEquals(10, skipped);
        byte[] remaining = new byte[6];
        int read = zis.read(remaining, 0, remaining.length);
        Assert.assertEquals(6, read);
        Assert.assertEquals("ABCDEF", new String(remaining, "UTF-8"));
        zis.close();
    }

    @Test
    public void skip_givenValueLargerThanRemaining_shouldReturnActualSkipped() throws IOException {
        byte[] content = "12345".getBytes("UTF-8");
        byte[] zipBytes = createZipStreamBytes(ZipArchiveOutputStream.STORED, 0, "skip_eof.txt", null, content, false);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zis.getNextZipEntry();

        long skipped = zis.skip(100);
        Assert.assertEquals(5, skipped);
        zis.close();
    }

    @Test
    public void getNextZipEntry_givenMultipleEntries_shouldClosePreviousEntryAndReadNext() throws IOException {
        byte[] entry1 = createZipStreamBytes(ZipArchiveOutputStream.STORED, 0, "file1.txt", null, "Content1".getBytes("UTF-8"), false);
        byte[] entry2 = createZipStreamBytes(ZipArchiveOutputStream.STORED, 0, "file2.txt", null, "Content2".getBytes("UTF-8"), false);
        byte[] all = new byte[entry1.length + entry2.length];
        System.arraycopy(entry1, 0, all, 0, entry1.length);
        System.arraycopy(entry2, 0, all, entry1.length, entry2.length);

        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(all));
        ZipArchiveEntry first = zis.getNextZipEntry();
        Assert.assertNotNull(first);
        Assert.assertEquals("file1.txt", first.getName());

        ZipArchiveEntry second = zis.getNextZipEntry();
        Assert.assertNotNull(second);
        Assert.assertEquals("file2.txt", second.getName());

        byte[] buf = new byte[8];
        int r = zis.read(buf, 0, buf.length);
        Assert.assertEquals(8, r);
        Assert.assertEquals("Content2", new String(buf, "UTF-8"));

        Assert.assertNull(zis.getNextZipEntry());
        zis.close();
    }

    @Test
    public void getNextZipEntry_givenDataDescriptor_shouldSkipDescriptorOnCloseEntry() throws IOException {
        byte[] content = "Descriptor Content".getBytes("UTF-8");
        byte[] entry1 = createZipStreamBytes(ZipArchiveOutputStream.STORED, 8, "desc.txt", null, content, true);
        byte[] entry2 = createZipStreamBytes(ZipArchiveOutputStream.STORED, 0, "second.txt", null, "Second".getBytes("UTF-8"), false);
        byte[] all = new byte[entry1.length + entry2.length];
        System.arraycopy(entry1, 0, all, 0, entry1.length);
        System.arraycopy(entry2, 0, all, entry1.length, entry2.length);

        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(all));
        ZipArchiveEntry first = zis.getNextZipEntry();
        Assert.assertNotNull(first);
        Assert.assertEquals("desc.txt", first.getName());

        ZipArchiveEntry second = zis.getNextZipEntry();
        Assert.assertNotNull(second);
        Assert.assertEquals("second.txt", second.getName());

        byte[] buf = new byte[6];
        int r = zis.read(buf, 0, buf.length);
        Assert.assertEquals(6, r);
        Assert.assertEquals("Second", new String(buf, "UTF-8"));
        zis.close();
    }

    @Test
    public void getNextZipEntry_givenEfsFlag_shouldHandleUtf8Encoding() throws IOException {
        byte[] content = "EFS Test".getBytes("UTF-8");
        int efsFlag = ZipArchiveOutputStream.EFS_FLAG;
        byte[] zipBytes = createZipStreamBytes(ZipArchiveOutputStream.STORED, efsFlag, "efs_file.txt", null, content, false);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        ZipArchiveEntry entry = zis.getNextZipEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("efs_file.txt", entry.getName());
        zis.close();
    }

    @Test
    public void close_whenCalledMultipleTimes_shouldBeIdempotent() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        zis.close();
        zis.close();
    }
}