package org.apache.commons.compress.archivers.zip;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Assert;
import org.junit.Test;

public class ZipArchiveInputStreamTest {

    private static final byte[] LFH_SIG = new byte[] { 0x50, 0x4b, 0x03, 0x04 };
    private static final byte[] CFH_SIG = new byte[] { 0x50, 0x4b, 0x01, 0x02 };
    private static final byte[] EOCD_SIG = new byte[] { 0x50, 0x4b, 0x05, 0x06 };
    private static final byte[] DD_SIG = new byte[] { 0x50, 0x4b, 0x07, 0x08 };
    private static final byte[] SPLIT_SIG = new byte[] { 0x50, 0x4b, 0x30, 0x30 };

    private void writeShort(ByteArrayOutputStream out, int val) {
        out.write(val & 0xFF);
        out.write((val >> 8) & 0xFF);
    }

    private void writeInt(ByteArrayOutputStream out, long val) {
        out.write((int) (val & 0xFF));
        out.write((int) ((val >> 8) & 0xFF));
        out.write((int) ((val >> 16) & 0xFF));
        out.write((int) ((val >> 24) & 0xFF));
    }

    private void writeLong(ByteArrayOutputStream out, long val) {
        for (int i = 0; i < 8; i++) {
            out.write((int) ((val >> (8 * i)) & 0xFF));
        }
    }

    private byte[] deflateData(byte[] input) {
        Deflater deflater = new Deflater(Deflater.DEFAULT_COMPRESSION, true);
        deflater.setInput(input);
        deflater.finish();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buf = new byte[128];
        while (!deflater.finished()) {
            int count = deflater.deflate(buf);
            baos.write(buf, 0, count);
        }
        deflater.end();
        return baos.toByteArray();
    }

    private byte[] createBasicZipEntry(String name, int method, int gpFlag, byte[] data, byte[] extra) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(LFH_SIG);
        writeShort(baos, 20);
        writeShort(baos, gpFlag);
        writeShort(baos, method);
        writeInt(baos, 0);

        byte[] payload;
        long crcVal;
        long compSize;
        long uncompSize;

        if (method == ZipArchiveOutputStream.DEFLATED) {
            payload = deflateData(data);
            CRC32 crc = new CRC32();
            crc.update(data);
            crcVal = crc.getValue();
            compSize = payload.length;
            uncompSize = data.length;
        } else {
            payload = data;
            CRC32 crc = new CRC32();
            crc.update(data);
            crcVal = crc.getValue();
            compSize = data.length;
            uncompSize = data.length;
        }

        if ((gpFlag & 8) != 0) {
            writeInt(baos, 0);
            writeInt(baos, 0);
            writeInt(baos, 0);
        } else {
            writeInt(baos, crcVal);
            writeInt(baos, compSize);
            writeInt(baos, uncompSize);
        }

        byte[] nameBytes = name.getBytes("UTF-8");
        writeShort(baos, nameBytes.length);
        writeShort(baos, extra == null ? 0 : extra.length);
        baos.write(nameBytes);
        if (extra != null) {
            baos.write(extra);
        }
        baos.write(payload);

        if ((gpFlag & 8) != 0) {
            baos.write(DD_SIG);
            writeInt(baos, crcVal);
            writeInt(baos, compSize);
            writeInt(baos, uncompSize);
        }

        return baos.toByteArray();
    }

    @Test
    public void matches_givenValidSignatures_shouldReturnTrue() {
        byte[] lfh = Arrays.copyOf(LFH_SIG, 4);
        byte[] eocd = Arrays.copyOf(EOCD_SIG, 4);
        byte[] dd = Arrays.copyOf(DD_SIG, 4);
        byte[] split = Arrays.copyOf(SPLIT_SIG, 4);

        Assert.assertTrue(ZipArchiveInputStream.matches(lfh, 4));
        Assert.assertTrue(ZipArchiveInputStream.matches(eocd, 4));
        Assert.assertTrue(ZipArchiveInputStream.matches(dd, 4));
        Assert.assertTrue(ZipArchiveInputStream.matches(split, 4));
    }

    @Test
    public void matches_givenShortLengthOrInvalidSignature_shouldReturnFalse() {
        byte[] lfh = Arrays.copyOf(LFH_SIG, 4);
        Assert.assertFalse(ZipArchiveInputStream.matches(lfh, 3));

        byte[] invalid = new byte[] { 0x00, 0x00, 0x00, 0x00 };
        Assert.assertFalse(ZipArchiveInputStream.matches(invalid, 4));

        byte[] partial = new byte[] { 0x50, 0x4b, 0x03, 0x00 };
        Assert.assertFalse(ZipArchiveInputStream.matches(partial, 4));
    }

    @Test
    public void constructors_givenDifferentParameters_shouldInitializeProperly() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream z1 = new ZipArchiveInputStream(in);
        Assert.assertEquals("UTF8", z1.encoding);
        z1.close();

        ZipArchiveInputStream z2 = new ZipArchiveInputStream(in, "ASCII");
        Assert.assertEquals("ASCII", z2.encoding);
        z2.close();

        ZipArchiveInputStream z3 = new ZipArchiveInputStream(in, "UTF-8", false);
        Assert.assertEquals("UTF-8", z3.encoding);
        z3.close();

        ZipArchiveInputStream z4 = new ZipArchiveInputStream(in, "UTF-8", true, true);
        Assert.assertEquals("UTF-8", z4.encoding);
        z4.close();
    }

    @Test
    public void getNextZipEntry_givenEmptyStream_shouldReturnNull() throws IOException {
        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Assert.assertNull(zIn.getNextZipEntry());
        Assert.assertNull(zIn.getNextEntry());
        zIn.close();
    }

    @Test
    public void getNextZipEntry_givenCorruptSignature_shouldReturnNull() throws IOException {
        byte[] invalid = new byte[] { 0x12, 0x34, 0x56, 0x78, 0x00, 0x00, 0x00, 0x00 };
        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(invalid));
        Assert.assertNull(zIn.getNextZipEntry());
        zIn.close();
    }

    @Test(expected = UnsupportedZipFeatureException.class)
    public void getNextZipEntry_givenSplittingSignatureAtStart_shouldThrowException() throws IOException {
        byte[] data = new byte[30];
        System.arraycopy(DD_SIG, 0, data, 0, 4);
        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        zIn.getNextZipEntry();
    }

    @Test
    public void getNextZipEntry_givenSingleSegmentSplitMarker_shouldAdvanceAndReadHeader() throws IOException {
        byte[] entryData = createBasicZipEntry("file.txt", ZipArchiveOutputStream.STORED, 0, "test".getBytes(), null);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(SPLIT_SIG);
        baos.write(entryData);

        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        ZipArchiveEntry entry = zIn.getNextZipEntry();

        Assert.assertNotNull(entry);
        Assert.assertEquals("file.txt", entry.getName());
        Assert.assertEquals(4, entry.getSize());
        zIn.close();
    }

    @Test
    public void getNextZipEntry_givenCentralDirectoryHeaderFirst_shouldSkipRemainderAndReturnNull() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(CFH_SIG);
        for (int i = 0; i < 42; i++) {
            baos.write(0);
        }
        baos.write(EOCD_SIG);
        for (int i = 0; i < 16; i++) {
            baos.write(0);
        }
        writeShort(baos, 0);

        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        Assert.assertNull(zIn.getNextZipEntry());
        Assert.assertNull(zIn.getNextZipEntry());
        zIn.close();
    }

    @Test
    public void read_givenStoredEntry_shouldReadCorrectPayload() throws IOException {
        byte[] content = "Hello Legacy World!".getBytes("UTF-8");
        byte[] zipBytes = createBasicZipEntry("hello.txt", ZipArchiveOutputStream.STORED, 0, content, null);

        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        ZipArchiveEntry entry = zIn.getNextZipEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("hello.txt", entry.getName());

        byte[] readBuf = new byte[content.length];
        int bytesRead = zIn.read(readBuf, 0, readBuf.length);
        Assert.assertEquals(content.length, bytesRead);
        Assert.assertArrayEquals(content, readBuf);

        Assert.assertEquals(-1, zIn.read(readBuf, 0, readBuf.length));
        zIn.close();
    }

    @Test
    public void read_givenDeflatedEntry_shouldInflateCorrectPayload() throws IOException {
        byte[] content = "Compressible String Compressible String Compressible String".getBytes("UTF-8");
        byte[] zipBytes = createBasicZipEntry("deflate.txt", ZipArchiveOutputStream.DEFLATED, 0, content, null);

        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        ZipArchiveEntry entry = zIn.getNextZipEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("deflate.txt", entry.getName());

        ByteArrayOutputStream uncompressed = new ByteArrayOutputStream();
        byte[] buffer = new byte[16];
        int n;
        while ((n = zIn.read(buffer, 0, buffer.length)) != -1) {
            uncompressed.write(buffer, 0, n);
        }

        Assert.assertArrayEquals(content, uncompressed.toByteArray());
        zIn.close();
    }

    @Test
    public void read_givenDeflatedEntryWithDataDescriptor_shouldInflateAndVerifyDD() throws IOException {
        byte[] content = "Deflated with descriptor test content".getBytes("UTF-8");
        byte[] zipBytes = createBasicZipEntry("desc.txt", ZipArchiveOutputStream.DEFLATED, 8, content, null);

        ByteArrayOutputStream fullZip = new ByteArrayOutputStream();
        fullZip.write(zipBytes);
        fullZip.write(CFH_SIG);
        for (int i = 0; i < 42; i++) {
            fullZip.write(0);
        }

        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(fullZip.toByteArray()));
        ZipArchiveEntry entry = zIn.getNextZipEntry();
        Assert.assertNotNull(entry);

        ByteArrayOutputStream uncompressed = new ByteArrayOutputStream();
        byte[] buffer = new byte[32];
        int n;
        while ((n = zIn.read(buffer, 0, buffer.length)) != -1) {
            uncompressed.write(buffer, 0, n);
        }

        Assert.assertArrayEquals(content, uncompressed.toByteArray());
        Assert.assertNull(zIn.getNextZipEntry());
        zIn.close();
    }

    @Test
    public void read_givenMultipleConsecutiveEntries_shouldAdvanceProperly() throws IOException {
        byte[] c1 = "Entry Number 1".getBytes("UTF-8");
        byte[] c2 = "Entry Number 2 with more payload".getBytes("UTF-8");
        byte[] e1 = createBasicZipEntry("first.txt", ZipArchiveOutputStream.STORED, 0, c1, null);
        byte[] e2 = createBasicZipEntry("second.txt", ZipArchiveOutputStream.DEFLATED, 0, c2, null);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(e1);
        baos.write(e2);

        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));

        ZipArchiveEntry entry1 = zIn.getNextZipEntry();
        Assert.assertNotNull(entry1);
        Assert.assertEquals("first.txt", entry1.getName());

        ZipArchiveEntry entry2 = zIn.getNextZipEntry();
        Assert.assertNotNull(entry2);
        Assert.assertEquals("second.txt", entry2.getName());

        ByteArrayOutputStream out2 = new ByteArrayOutputStream();
        byte[] b = new byte[8];
        int len;
        while ((len = zIn.read(b, 0, b.length)) != -1) {
            out2.write(b, 0, len);
        }
        Assert.assertArrayEquals(c2, out2.toByteArray());

        zIn.close();
    }

    @Test
    public void read_givenOutOfBoundsParameters_shouldThrowException() throws IOException {
        byte[] zipBytes = createBasicZipEntry("test.txt", ZipArchiveOutputStream.STORED, 0, "test".getBytes(), null);
        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zIn.getNextZipEntry();

        byte[] buf = new byte[10];

        try {
            zIn.read(buf, -1, 5);
            Assert.fail("Should throw ArrayIndexOutOfBoundsException for negative offset");
        } catch (ArrayIndexOutOfBoundsException e) {
            // expected
        }

        try {
            zIn.read(buf, 0, -1);
            Assert.fail("Should throw ArrayIndexOutOfBoundsException for negative length");
        } catch (ArrayIndexOutOfBoundsException e) {
            // expected
        }

        try {
            zIn.read(buf, 8, 5);
            Assert.fail("Should throw ArrayIndexOutOfBoundsException when offset + length > buf.length");
        } catch (ArrayIndexOutOfBoundsException e) {
            // expected
        }

        try {
            zIn.read(buf, 11, 0);
            Assert.fail("Should throw ArrayIndexOutOfBoundsException when offset > buf.length");
        } catch (ArrayIndexOutOfBoundsException e) {
            // expected
        }

        zIn.close();
    }

    @Test
    public void read_givenStreamClosed_shouldThrowIOException() throws IOException {
        byte[] zipBytes = createBasicZipEntry("test.txt", ZipArchiveOutputStream.STORED, 0, "test".getBytes(), null);
        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zIn.close();

        try {
            zIn.read(new byte[10], 0, 10);
            Assert.fail("Should throw IOException when reading a closed stream");
        } catch (IOException e) {
            Assert.assertEquals("The stream is closed", e.getMessage());
        }
    }

    @Test
    public void read_givenNoCurrentEntry_shouldReturnMinusOne() throws IOException {
        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Assert.assertEquals(-1, zIn.read(new byte[10], 0, 10));
        zIn.close();
    }

    @Test(expected = UnsupportedZipFeatureException.class)
    public void read_givenStoredEntryWithDataDescriptorAndNotAllowed_shouldThrowException() throws IOException {
        byte[] content = "test content".getBytes();
        byte[] zipBytes = createBasicZipEntry("stored_dd.txt", ZipArchiveOutputStream.STORED, 8, content, null);

        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes), "UTF-8", true, false);
        zIn.getNextZipEntry();
        zIn.read(new byte[10], 0, 10);
    }

    @Test(expected = UnsupportedZipFeatureException.class)
    public void read_givenUnsupportedCompressionMethod_shouldThrowException() throws IOException {
        byte[] dummy = "dummy".getBytes();
        byte[] zipBytes = createBasicZipEntry("unsupported.bin", 99, 0, dummy, null);

        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zIn.getNextZipEntry();
        zIn.read(new byte[10], 0, 10);
    }

    @Test
    public void skip_givenValidAndInvalidArguments_shouldBehaveCorrectly() throws IOException {
        byte[] content = "0123456789ABCDEF".getBytes("UTF-8");
        byte[] zipBytes = createBasicZipEntry("skip.txt", ZipArchiveOutputStream.STORED, 0, content, null);

        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zIn.getNextZipEntry();

        try {
            zIn.skip(-1);
            Assert.fail("skip should throw IllegalArgumentException on negative argument");
        } catch (IllegalArgumentException e) {
            // expected
        }

        long skipped = zIn.skip(5);
        Assert.assertEquals(5, skipped);

        byte[] remaining = new byte[11];
        int r = zIn.read(remaining, 0, remaining.length);
        Assert.assertEquals(11, r);
        Assert.assertEquals("56789ABCDEF", new String(remaining, "UTF-8"));

        Assert.assertEquals(0, zIn.skip(10));
        zIn.close();
    }

    @Test
    public void canReadEntryData_givenDifferentArchiveEntries_shouldReturnExpected() {
        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));

        ArchiveEntry nonZipEntry = new ArchiveEntry() {
            public String getName() {
                return "test";
            }
            public long getSize() {
                return 0;
            }
            public boolean isDirectory() {
                return false;
            }
            public Date getLastModifiedDate() {
                return new Date();
            }
        };
        Assert.assertFalse(zIn.canReadEntryData(nonZipEntry));

        ZipArchiveEntry storedEntry = new ZipArchiveEntry("stored.txt");
        storedEntry.setMethod(ZipEntry.STORED);
        Assert.assertTrue(zIn.canReadEntryData(storedEntry));

        ZipArchiveEntry deflatedEntry = new ZipArchiveEntry("deflated.txt");
        deflatedEntry.setMethod(ZipEntry.DEFLATED);
        Assert.assertTrue(zIn.canReadEntryData(deflatedEntry));

        ZipArchiveEntry unsupportedMethodEntry = new ZipArchiveEntry("unsupported.txt");
        unsupportedMethodEntry.setMethod(99);
        Assert.assertFalse(zIn.canReadEntryData(unsupportedMethodEntry));

        GeneralPurposeBit gpb = new GeneralPurposeBit();
        gpb.useDataDescriptor(true);
        storedEntry.setGeneralPurposeBit(gpb);
        Assert.assertFalse(zIn.canReadEntryData(storedEntry));

        ZipArchiveInputStream zInAllowed = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]), "UTF-8", true, true);
        Assert.assertTrue(zInAllowed.canReadEntryData(storedEntry));

        try {
            zIn.close();
            zInAllowed.close();
        } catch (IOException e) {
            // ignore
        }
    }

    @Test
    public void processZip64Extra_givenZip64ExtraField_shouldPopulateCorrectSizes() throws IOException {
        ByteArrayOutputStream extraOut = new ByteArrayOutputStream();
        writeShort(extraOut, Zip64ExtendedInformationExtraField.HEADER_ID.getValue());
        writeShort(extraOut, 16);
        writeLong(extraOut, 12345678901L);
        writeLong(extraOut, 9876543210L);
        byte[] zip64Extra = extraOut.toByteArray();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(LFH_SIG);
        writeShort(baos, 45);
        writeShort(baos, 0);
        writeShort(baos, ZipArchiveOutputStream.STORED);
        writeInt(baos, 0);
        writeInt(baos, 12345);
        writeInt(baos, ZipConstants.ZIP64_MAGIC);
        writeInt(baos, ZipConstants.ZIP64_MAGIC);

        byte[] nameBytes = "zip64.txt".getBytes("UTF-8");
        writeShort(baos, nameBytes.length);
        writeShort(baos, zip64Extra.length);
        baos.write(nameBytes);
        baos.write(zip64Extra);

        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        ZipArchiveEntry entry = zIn.getNextZipEntry();

        Assert.assertNotNull(entry);
        Assert.assertEquals(12345678901L, entry.getSize());
        Assert.assertEquals(9876543210L, entry.getCompressedSize());
        zIn.close();
    }

    @Test
    public void getNextZipEntry_givenTruncatedLocalFileHeader_shouldReturnNull() throws IOException {
        byte[] incomplete = new byte[] { 0x50, 0x4b, 0x03, 0x04, 0x14, 0x00 };
        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(incomplete));
        Assert.assertNull(zIn.getNextZipEntry());
        zIn.close();
    }

    @Test
    public void close_calledMultipleTimes_shouldBeIdempotent() throws IOException {
        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        zIn.close();
        zIn.close();
    }

    @Test(expected = IOException.class)
    public void readDeflated_givenCorruptDeflatedData_shouldThrowException() throws IOException {
        byte[] corruptData = new byte[] { 0x78, (byte) 0x9c, 0x05, (byte) 0xc1, 0x01, 0x01 };
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(LFH_SIG);
        writeShort(baos, 20);
        writeShort(baos, 0);
        writeShort(baos, ZipArchiveOutputStream.DEFLATED);
        writeInt(baos, 0);
        writeInt(baos, 12345);
        writeInt(baos, corruptData.length);
        writeInt(baos, 100);
        byte[] nameBytes = "corrupt.txt".getBytes("UTF-8");
        writeShort(baos, nameBytes.length);
        writeShort(baos, 0);
        baos.write(nameBytes);
        baos.write(corruptData);

        ZipArchiveInputStream zIn = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        ZipArchiveEntry entry = zIn.getNextZipEntry();
        Assert.assertNotNull(entry);

        byte[] buf = new byte[64];
        zIn.read(buf, 0, buf.length);
    }
}