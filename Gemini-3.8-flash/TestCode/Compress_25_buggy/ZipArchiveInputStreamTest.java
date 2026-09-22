package org.apache.commons.compress.archivers.zip;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;

public class ZipArchiveInputStreamTest {

    private static void writeShort(ByteArrayOutputStream out, int value) {
        out.write(value & 0xFF);
        out.write((value >> 8) & 0xFF);
    }

    private static void writeInt(ByteArrayOutputStream out, long value) {
        out.write((int) (value & 0xFF));
        out.write((int) ((value >> 8) & 0xFF));
        out.write((int) ((value >> 16) & 0xFF));
        out.write((int) ((value >> 24) & 0xFF));
    }

    private static void writeLong(ByteArrayOutputStream out, long value) {
        writeInt(out, value & 0xFFFFFFFFL);
        writeInt(out, (value >> 32) & 0xFFFFFFFFL);
    }

    private static byte[] createLfh(String name, int method, byte[] data, int gpFlag, byte[] extra) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        writeInt(out, 0x04034b50L);
        writeShort(out, 20);
        writeShort(out, gpFlag);
        writeShort(out, method);
        writeInt(out, 0);
        if (data != null && (gpFlag & 8) == 0) {
            CRC32 crc = new CRC32();
            crc.update(data);
            writeInt(out, crc.getValue());
            writeInt(out, data.length);
            writeInt(out, data.length);
        } else {
            writeInt(out, 0);
            writeInt(out, 0);
            writeInt(out, 0);
        }
        byte[] nameBytes = name.getBytes("UTF-8");
        writeShort(out, nameBytes.length);
        writeShort(out, extra != null ? extra.length : 0);
        out.write(nameBytes);
        if (extra != null) {
            out.write(extra);
        }
        if (data != null) {
            out.write(data);
        }
        return out.toByteArray();
    }

    private static byte[] createLfhWithSizes(String name, int method, long cSize, long size, long crc, byte[] extra) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        writeInt(out, 0x04034b50L);
        writeShort(out, 20);
        writeShort(out, 0);
        writeShort(out, method);
        writeInt(out, 0);
        writeInt(out, crc);
        writeInt(out, cSize);
        writeInt(out, size);
        byte[] nameBytes = name.getBytes("UTF-8");
        writeShort(out, nameBytes.length);
        writeShort(out, extra != null ? extra.length : 0);
        out.write(nameBytes);
        if (extra != null) {
            out.write(extra);
        }
        return out.toByteArray();
    }

    private static byte[] deflateData(byte[] input) {
        Deflater deflater = new Deflater(Deflater.DEFAULT_COMPRESSION, true);
        deflater.setInput(input);
        deflater.finish();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[256];
        while (!deflater.finished()) {
            int count = deflater.deflate(buf);
            bos.write(buf, 0, count);
        }
        deflater.end();
        return bos.toByteArray();
    }

    @Test
    public void matches_givenLengthLessThanFour_shouldReturnFalse() {
        byte[] sig = new byte[] { 0x50, 0x4b, 0x03 };
        Assert.assertFalse(ZipArchiveInputStream.matches(sig, 3));
    }

    @Test
    public void matches_givenLfhSignature_shouldReturnTrue() {
        byte[] sig = ZipArchiveOutputStream.LFH_SIG;
        Assert.assertTrue(ZipArchiveInputStream.matches(sig, 4));
    }

    @Test
    public void matches_givenEocdSignature_shouldReturnTrue() {
        byte[] sig = ZipArchiveOutputStream.EOCD_SIG;
        Assert.assertTrue(ZipArchiveInputStream.matches(sig, 4));
    }

    @Test
    public void matches_givenDdSignature_shouldReturnTrue() {
        byte[] sig = ZipArchiveOutputStream.DD_SIG;
        Assert.assertTrue(ZipArchiveInputStream.matches(sig, 4));
    }

    @Test
    public void matches_givenSingleSegmentSplitMarker_shouldReturnTrue() {
        byte[] sig = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes();
        Assert.assertTrue(ZipArchiveInputStream.matches(sig, 4));
    }

    @Test
    public void matches_givenUnknownSignature_shouldReturnFalse() {
        byte[] sig = new byte[] { 0x00, 0x01, 0x02, 0x03 };
        Assert.assertFalse(ZipArchiveInputStream.matches(sig, 4));
    }

    @Test
    public void constructor_givenVariousParameters_shouldInitializeProperly() throws IOException {
        InputStream in1 = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream stream1 = new ZipArchiveInputStream(in1);
        stream1.close();

        InputStream in2 = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream stream2 = new ZipArchiveInputStream(in2, "UTF-8");
        stream2.close();

        InputStream in3 = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream stream3 = new ZipArchiveInputStream(in3, "UTF-8", true);
        stream3.close();

        InputStream in4 = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream stream4 = new ZipArchiveInputStream(in4, "UTF-8", false, true);
        stream4.close();
    }

    @Test
    public void canReadEntryData_givenNullOrNonZipArchiveEntry_shouldReturnFalse() throws IOException {
        ZipArchiveInputStream stream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Assert.assertFalse(stream.canReadEntryData(null));

        ArchiveEntry customEntry = new ArchiveEntry() {
            public String getName() { return "entry"; }
            public long getSize() { return 0; }
            public boolean isDirectory() { return false; }
            public Date getLastModifiedDate() { return new Date(); }
        };
        Assert.assertFalse(stream.canReadEntryData(customEntry));
        stream.close();
    }

    @Test
    public void canReadEntryData_givenStoredEntryWithoutDataDescriptor_shouldReturnTrue() throws IOException {
        ZipArchiveInputStream stream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(ZipEntry.STORED);
        entry.setSize(10);
        entry.setCrc(12345);
        Assert.assertTrue(stream.canReadEntryData(entry));
        stream.close();
    }

    @Test
    public void canReadEntryData_givenDeflatedEntryWithDataDescriptor_shouldReturnTrue() throws IOException {
        ZipArchiveInputStream stream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(ZipEntry.DEFLATED);
        GeneralPurposeBit gpb = new GeneralPurposeBit();
        gpb.useDataDescriptor(true);
        entry.setGeneralPurposeBit(gpb);
        Assert.assertTrue(stream.canReadEntryData(entry));
        stream.close();
    }

    @Test
    public void canReadEntryData_givenStoredEntryWithDataDescriptorWhenNotAllowed_shouldReturnFalse() throws IOException {
        ZipArchiveInputStream stream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]), "UTF-8", true, false);
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(ZipEntry.STORED);
        GeneralPurposeBit gpb = new GeneralPurposeBit();
        gpb.useDataDescriptor(true);
        entry.setGeneralPurposeBit(gpb);
        Assert.assertFalse(stream.canReadEntryData(entry));
        stream.close();
    }

    @Test
    public void canReadEntryData_givenStoredEntryWithDataDescriptorWhenAllowed_shouldReturnTrue() throws IOException {
        ZipArchiveInputStream stream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]), "UTF-8", true, true);
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setMethod(ZipEntry.STORED);
        GeneralPurposeBit gpb = new GeneralPurposeBit();
        gpb.useDataDescriptor(true);
        entry.setGeneralPurposeBit(gpb);
        Assert.assertTrue(stream.canReadEntryData(entry));
        stream.close();
    }

    @Test
    public void getNextZipEntry_givenEmptyStream_shouldReturnNull() throws IOException {
        ZipArchiveInputStream stream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Assert.assertNull(stream.getNextZipEntry());
        stream.close();
    }

    @Test
    public void getNextZipEntry_givenClosedStream_shouldReturnNull() throws IOException {
        ZipArchiveInputStream stream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        stream.close();
        Assert.assertNull(stream.getNextZipEntry());
    }

    @Test(expected = UnsupportedZipFeatureException.class)
    public void getNextZipEntry_givenSplitArchiveSignature_shouldThrowUnsupportedZipFeatureException() throws IOException {
        byte[] data = new byte[30];
        System.arraycopy(ZipLong.DD_SIG.getBytes(), 0, data, 0, 4);
        ZipArchiveInputStream stream = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        try {
            stream.getNextZipEntry();
        } finally {
            stream.close();
        }
    }

    @Test
    public void getNextZipEntry_givenUnknownSignature_shouldReturnNull() throws IOException {
        byte[] data = new byte[30];
        data[0] = 0x01;
        data[1] = 0x02;
        data[2] = 0x03;
        data[3] = 0x04;
        ZipArchiveInputStream stream = new ZipArchiveInputStream(new ByteArrayInputStream(data));
        Assert.assertNull(stream.getNextZipEntry());
        stream.close();
    }

    @Test
    public void getNextZipEntry_givenSingleSegmentSplitMarker_shouldReadValidEntry() throws IOException {
        byte[] lfh = createLfh("single.txt", ZipEntry.STORED, "Hello".getBytes("UTF-8"), 0, null);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes());
        out.write(lfh);

        ZipArchiveInputStream stream = new ZipArchiveInputStream(new ByteArrayInputStream(out.toByteArray()));
        ZipArchiveEntry entry = stream.getNextZipEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("single.txt", entry.getName());
        Assert.assertEquals(5, entry.getSize());
        stream.close();
    }

    @Test
    public void getNextZipEntry_givenValidStoredEntry_shouldReadMetadataCorrectly() throws IOException {
        byte[] data = "SampleContent".getBytes("UTF-8");
        byte[] lfh = createLfh("file.txt", ZipEntry.STORED, data, 0, null);

        ZipArchiveInputStream stream = new ZipArchiveInputStream(new ByteArrayInputStream(lfh));
        ZipArchiveEntry entry = stream.getNextZipEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("file.txt", entry.getName());
        Assert.assertEquals(data.length, entry.getSize());
        Assert.assertEquals(ZipEntry.STORED, entry.getMethod());
        stream.close();
    }

    @Test
    public void getNextEntry_givenValidArchive_shouldReturnArchiveEntry() throws IOException {
        byte[] data = "Data".getBytes("UTF-8");
        byte[] lfh = createLfh("file.txt", ZipEntry.STORED, data, 0, null);

        ZipArchiveInputStream stream = new ZipArchiveInputStream(new ByteArrayInputStream(lfh));
        ArchiveEntry entry = stream.getNextEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("file.txt", entry.getName());
        stream.close();
    }

    @Test
    public void getNextZipEntry_givenZip64ExtraField_shouldParseZip64Sizes() throws IOException {
        ByteArrayOutputStream extraOut = new ByteArrayOutputStream();
        writeShort(extraOut, Zip64ExtendedInformationExtraField.HEADER_ID.getValue());
        writeShort(extraOut, 16);
        writeLong(extraOut, 5000000000L);
        writeLong(extraOut, 4000000000L);
        byte[] extra = extraOut.toByteArray();

        byte[] lfh = createLfhWithSizes("zip64.txt", ZipEntry.STORED, 0xFFFFFFFFL, 0xFFFFFFFFL, 123456L, extra);

        ZipArchiveInputStream stream = new ZipArchiveInputStream(new ByteArrayInputStream(lfh));
        ZipArchiveEntry entry = stream.getNextZipEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("zip64.txt", entry.getName());
        Assert.assertEquals(5000000000L, entry.getSize());
        Assert.assertEquals(4000000000L, entry.getCompressedSize());
        stream.close();
    }

    @Test(expected = IOException.class)
    public void read_givenClosedStream_shouldThrowIOException() throws IOException {
        ZipArchiveInputStream stream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        stream.close();
        stream.read(new byte[10], 0, 10);
    }

    @Test
    public void read_givenNoCurrentEntry_shouldReturnMinusOne() throws IOException {
        ZipArchiveInputStream stream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        int read = stream.read(new byte[10], 0, 10);
        Assert.assertEquals(-1, read);
        stream.close();
    }

    @Test
    public void read_givenInvalidBounds_shouldThrowArrayIndexOutOfBoundsException() throws IOException {
        byte[] lfh = createLfh("test.txt", ZipEntry.STORED, "data".getBytes("UTF-8"), 0, null);
        ZipArchiveInputStream stream = new ZipArchiveInputStream(new ByteArrayInputStream(lfh));
        stream.getNextZipEntry();
        byte[] buf = new byte[10];

        try {
            stream.read(buf, -1, 5);
            Assert.fail("Expected ArrayIndexOutOfBoundsException for negative offset");
        } catch (ArrayIndexOutOfBoundsException e) {}

        try {
            stream.read(buf, 0, -1);
            Assert.fail("Expected ArrayIndexOutOfBoundsException for negative length");
        } catch (ArrayIndexOutOfBoundsException e) {}

        try {
            stream.read(buf, 6, 5);
            Assert.fail("Expected ArrayIndexOutOfBoundsException for offset + len > length");
        } catch (ArrayIndexOutOfBoundsException e) {}

        try {
            stream.read(buf, 11, 0);
            Assert.fail("Expected ArrayIndexOutOfBoundsException for offset > length");
        } catch (ArrayIndexOutOfBoundsException e) {}

        stream.close();
    }

    @Test
    public void read_givenStoredEntry_shouldReadAndValidateData() throws IOException {
        byte[] payload = "Hello Legacy World!".getBytes("UTF-8");
        byte[] lfh = createLfh("hello.txt", ZipEntry.STORED, payload, 0, null);

        ZipArchiveInputStream stream = new ZipArchiveInputStream(new ByteArrayInputStream(lfh));
        ZipArchiveEntry entry = stream.getNextZipEntry();
        Assert.assertNotNull(entry);

        byte[] buffer = new byte[payload.length];
        int totalRead = 0;
        int read;
        while ((read = stream.read(buffer, totalRead, buffer.length - totalRead)) != -1) {
            totalRead += read;
            if (totalRead == buffer.length) {
                break;
            }
        }
        Assert.assertEquals(payload.length, totalRead);
        Assert.assertEquals("Hello Legacy World!", new String(buffer, "UTF-8"));
        Assert.assertEquals(-1, stream.read(buffer, 0, 1));
        stream.close();
    }

    @Test
    public void read_givenDeflatedEntry_shouldDecompressCorrectly() throws IOException {
        byte[] uncompressed = "Commons Compress Deflated Test String Commons Compress Deflated Test String".getBytes("UTF-8");
        byte[] compressed = deflateData(uncompressed);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        writeInt(out, 0x04034b50L);
        writeShort(out, 20);
        writeShort(out, 0);
        writeShort(out, ZipEntry.DEFLATED);
        writeInt(out, 0);
        CRC32 crc = new CRC32();
        crc.update(uncompressed);
        writeInt(out, crc.getValue());
        writeInt(out, compressed.length);
        writeInt(out, uncompressed.length);
        byte[] nameBytes = "deflate.txt".getBytes("UTF-8");
        writeShort(out, nameBytes.length);
        writeShort(out, 0);
        out.write(nameBytes);
        out.write(compressed);

        ZipArchiveInputStream stream = new ZipArchiveInputStream(new ByteArrayInputStream(out.toByteArray()));
        ZipArchiveEntry entry = stream.getNextZipEntry();
        Assert.assertNotNull(entry);

        ByteArrayOutputStream resultBos = new ByteArrayOutputStream();
        byte[] buffer = new byte[32];
        int read;
        while ((read = stream.read(buffer, 0, buffer.length)) != -1) {
            resultBos.write(buffer, 0, read);
        }

        Assert.assertArrayEquals(uncompressed, resultBos.toByteArray());
        stream.close();
    }

    @Test(expected = UnsupportedZipFeatureException.class)
    public void read_givenUnsupportedMethod_shouldThrowUnsupportedZipFeatureException() throws IOException {
        byte[] lfh = createLfh("unsupported.txt", 99, new byte[10], 0, null);
        ZipArchiveInputStream stream = new ZipArchiveInputStream(new ByteArrayInputStream(lfh));
        stream.getNextZipEntry();
        try {
            stream.read(new byte[10], 0, 10);
        } finally {
            stream.close();
        }
    }

    @Test(expected = UnsupportedZipFeatureException.class)
    public void read_givenStoredWithUnsupportedDataDescriptor_shouldThrowUnsupportedZipFeatureException() throws IOException {
        byte[] lfh = createLfh("stored_dd.txt", ZipEntry.STORED, new byte[10], 8, null);
        ZipArchiveInputStream stream = new ZipArchiveInputStream(new ByteArrayInputStream(lfh), "UTF-8", true, false);
        stream.getNextZipEntry();
        try {
            stream.read(new byte[10], 0, 10);
        } finally {
            stream.close();
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void skip_givenNegativeValue_shouldThrowIllegalArgumentException() throws IOException {
        byte[] lfh = createLfh("test.txt", ZipEntry.STORED, "data".getBytes("UTF-8"), 0, null);
        ZipArchiveInputStream stream = new ZipArchiveInputStream(new ByteArrayInputStream(lfh));
        stream.getNextZipEntry();
        try {
            stream.skip(-1);
        } finally {
            stream.close();
        }
    }

    @Test
    public void skip_givenValidValue_shouldSkipBytes() throws IOException {
        byte[] payload = "0123456789".getBytes("UTF-8");
        byte[] lfh = createLfh("skip.txt", ZipEntry.STORED, payload, 0, null);

        ZipArchiveInputStream stream = new ZipArchiveInputStream(new ByteArrayInputStream(lfh));
        stream.getNextZipEntry();

        long skipped = stream.skip(4);
        Assert.assertEquals(4, skipped);

        byte[] remaining = new byte[6];
        int read = stream.read(remaining, 0, 6);
        Assert.assertEquals(6, read);
        Assert.assertEquals("456789", new String(remaining, "UTF-8"));

        Assert.assertEquals(0, stream.skip(10));
        stream.close();
    }

    @Test
    public void close_givenOpenStream_shouldCloseUnderlyingStreamIdempotently() throws IOException {
        ZipArchiveInputStream stream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        stream.close();
        stream.close();
    }

    @Test
    public void getNextZipEntry_givenMultipleEntries_shouldClosePreviousEntryAndReadNext() throws IOException {
        byte[] data1 = "Content of File One".getBytes("UTF-8");
        byte[] data2 = "Content of File Two!".getBytes("UTF-8");

        byte[] lfh1 = createLfh("file1.txt", ZipEntry.STORED, data1, 0, null);
        byte[] lfh2 = createLfh("file2.txt", ZipEntry.STORED, data2, 0, null);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(lfh1);
        out.write(lfh2);

        ZipArchiveInputStream stream = new ZipArchiveInputStream(new ByteArrayInputStream(out.toByteArray()));

        ZipArchiveEntry entry1 = stream.getNextZipEntry();
        Assert.assertNotNull(entry1);
        Assert.assertEquals("file1.txt", entry1.getName());

        byte[] buf1 = new byte[10];
        stream.read(buf1, 0, 10);

        ZipArchiveEntry entry2 = stream.getNextZipEntry();
        Assert.assertNotNull(entry2);
        Assert.assertEquals("file2.txt", entry2.getName());

        ByteArrayOutputStream bos2 = new ByteArrayOutputStream();
        byte[] buf2 = new byte[32];
        int read;
        while ((read = stream.read(buf2, 0, buf2.length)) != -1) {
            bos2.write(buf2, 0, read);
        }
        Assert.assertArrayEquals(data2, bos2.toByteArray());

        Assert.assertNull(stream.getNextZipEntry());
        stream.close();
    }

    @Test
    public void getNextZipEntry_givenCentralDirectoryAfterEntry_shouldHitCentralDirectoryAndReturnNull() throws IOException {
        byte[] data = "FileData".getBytes("UTF-8");
        byte[] lfh = createLfh("entry.txt", ZipEntry.STORED, data, 0, null);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(lfh);

        writeInt(out, 0x02014b50L);
        writeShort(out, 20);
        writeShort(out, 20);
        writeShort(out, 0);
        writeShort(out, 0);
        writeInt(out, 0);
        writeInt(out, 0);
        writeInt(out, 0);
        writeInt(out, 0);
        writeShort(out, 0);
        writeShort(out, 0);
        writeShort(out, 0);
        writeShort(out, 0);
        writeShort(out, 0);
        writeInt(out, 0);
        writeInt(out, 0);

        out.write(ZipArchiveOutputStream.EOCD_SIG);
        for (int i = 0; i < 16; i++) {
            out.write(0);
        }
        writeShort(out, 0);

        ZipArchiveInputStream stream = new ZipArchiveInputStream(new ByteArrayInputStream(out.toByteArray()));

        ZipArchiveEntry entry = stream.getNextZipEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("entry.txt", entry.getName());

        byte[] buf = new byte[data.length];
        stream.read(buf, 0, buf.length);

        ZipArchiveEntry nextEntry = stream.getNextZipEntry();
        Assert.assertNull(nextEntry);

        Assert.assertNull(stream.getNextZipEntry());
        stream.close();
    }

    @Test(expected = EOFException.class)
    public void getNextZipEntry_givenTruncatedEntryData_shouldThrowEOFExceptionOnDrain() throws IOException {
        byte[] lfh = createLfhWithSizes("truncated.txt", ZipEntry.STORED, 100, 100, 0, null);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(lfh);
        out.write(new byte[10]);

        ZipArchiveInputStream stream = new ZipArchiveInputStream(new ByteArrayInputStream(out.toByteArray()));
        ZipArchiveEntry entry = stream.getNextZipEntry();
        Assert.assertNotNull(entry);
        try {
            stream.getNextZipEntry();
        } finally {
            stream.close();
        }
    }
}