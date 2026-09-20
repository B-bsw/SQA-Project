package org.apache.commons.compress.archivers.ar;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Assert;
import org.junit.Test;

public class ArArchiveInputStreamTest {

    private static class CloseTrackerInputStream extends InputStream {
        private final InputStream in;
        private int closeCount = 0;

        public CloseTrackerInputStream(InputStream in) {
            this.in = in;
        }

        public int read() throws IOException {
            return in.read();
        }

        public int read(byte[] b, int off, int len) throws IOException {
            return in.read(b, off, len);
        }

        public int available() throws IOException {
            return in.available();
        }

        public void close() throws IOException {
            closeCount++;
            in.close();
        }

        public int getCloseCount() {
            return closeCount;
        }
    }

    private static class ZeroReturningInputStream extends InputStream {
        private boolean returnedZero = false;

        public int read() throws IOException {
            if (!returnedZero) {
                returnedZero = true;
                return 0;
            }
            return -1;
        }

        public int read(byte[] b, int off, int len) throws IOException {
            if (len == 0) {
                return 0;
            }
            if (!returnedZero) {
                returnedZero = true;
                b[off] = 0;
                return 0;
            }
            return -1;
        }
    }

    private static class MockNonAvailableInputStream extends InputStream {
        private final InputStream in;

        public MockNonAvailableInputStream(InputStream in) {
            this.in = in;
        }

        public int read() throws IOException {
            return in.read();
        }

        public int read(byte[] b, int off, int len) throws IOException {
            return in.read(b, off, len);
        }

        public int available() throws IOException {
            return 0;
        }

        public void close() throws IOException {
            in.close();
        }
    }

    private byte[] createPaddedField(String value, int length) {
        byte[] field = new byte[length];
        byte[] bytes = value.getBytes();
        int copyLen = bytes.length < length ? bytes.length : length;
        System.arraycopy(bytes, 0, field, 0, copyLen);
        for (int i = copyLen; i < length; i++) {
            field[i] = (byte) ' ';
        }
        return field;
    }

    private byte[] buildArArchive(String entryName, String content) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ArArchiveEntry.HEADER.getBytes());
        baos.write(createPaddedField(entryName, 16));
        baos.write(createPaddedField("1000000000", 12));
        baos.write(createPaddedField("1000", 6));
        baos.write(createPaddedField("1000", 6));
        baos.write(createPaddedField("100644", 8));
        baos.write(createPaddedField(String.valueOf(content.length()), 10));
        baos.write(ArArchiveEntry.TRAILER.getBytes());
        baos.write(content.getBytes());
        return baos.toByteArray();
    }

    @Test
    public void matches_givenShortLength_shouldReturnFalse() {
        byte[] signature = new byte[] { 0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a };
        Assert.assertFalse(ArArchiveInputStream.matches(signature, 7));
    }

    @Test
    public void matches_givenValidSignature_shouldReturnTrue() {
        byte[] signature = new byte[] { 0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a };
        Assert.assertTrue(ArArchiveInputStream.matches(signature, 8));
        Assert.assertTrue(ArArchiveInputStream.matches(signature, 16));
    }

    @Test
    public void matches_givenInvalidByteAtPosition0_shouldReturnFalse() {
        byte[] signature = new byte[] { 0x00, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a };
        Assert.assertFalse(ArArchiveInputStream.matches(signature, 8));
    }

    @Test
    public void matches_givenInvalidByteAtPosition1_shouldReturnFalse() {
        byte[] signature = new byte[] { 0x21, 0x00, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a };
        Assert.assertFalse(ArArchiveInputStream.matches(signature, 8));
    }

    @Test
    public void matches_givenInvalidByteAtPosition2_shouldReturnFalse() {
        byte[] signature = new byte[] { 0x21, 0x3c, 0x00, 0x72, 0x63, 0x68, 0x3e, 0x0a };
        Assert.assertFalse(ArArchiveInputStream.matches(signature, 8));
    }

    @Test
    public void matches_givenInvalidByteAtPosition3_shouldReturnFalse() {
        byte[] signature = new byte[] { 0x21, 0x3c, 0x61, 0x00, 0x63, 0x68, 0x3e, 0x0a };
        Assert.assertFalse(ArArchiveInputStream.matches(signature, 8));
    }

    @Test
    public void matches_givenInvalidByteAtPosition4_shouldReturnFalse() {
        byte[] signature = new byte[] { 0x21, 0x3c, 0x61, 0x72, 0x00, 0x68, 0x3e, 0x0a };
        Assert.assertFalse(ArArchiveInputStream.matches(signature, 8));
    }

    @Test
    public void matches_givenInvalidByteAtPosition5_shouldReturnFalse() {
        byte[] signature = new byte[] { 0x21, 0x3c, 0x61, 0x72, 0x63, 0x00, 0x3e, 0x0a };
        Assert.assertFalse(ArArchiveInputStream.matches(signature, 8));
    }

    @Test
    public void matches_givenInvalidByteAtPosition6_shouldReturnFalse() {
        byte[] signature = new byte[] { 0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x00, 0x0a };
        Assert.assertFalse(ArArchiveInputStream.matches(signature, 8));
    }

    @Test
    public void matches_givenInvalidByteAtPosition7_shouldReturnFalse() {
        byte[] signature = new byte[] { 0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x00 };
        Assert.assertFalse(ArArchiveInputStream.matches(signature, 8));
    }

    @Test
    public void getNextArEntry_givenEmptyStream_shouldThrowIOExceptionForShortHeader() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        ArArchiveInputStream in = new ArArchiveInputStream(bais);
        try {
            in.getNextArEntry();
            Assert.fail("Expected IOException on truncated header");
        } catch (IOException ex) {
            Assert.assertEquals("failed to read header", ex.getMessage());
        }
    }

    @Test
    public void getNextArEntry_givenInvalidHeaderContent_shouldThrowIOExceptionForInvalidHeader() {
        byte[] invalidHeader = "BAD_HDR\n".getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(invalidHeader);
        ArArchiveInputStream in = new ArArchiveInputStream(bais);
        try {
            in.getNextArEntry();
            Assert.fail("Expected IOException on invalid header content");
        } catch (IOException ex) {
            Assert.assertTrue(ex.getMessage().startsWith("invalid header "));
        }
    }

    @Test
    public void getNextArEntry_givenValidHeaderAndNothingAvailable_shouldReturnNull() throws IOException {
        byte[] headerOnly = ArArchiveEntry.HEADER.getBytes();
        MockNonAvailableInputStream mnais = new MockNonAvailableInputStream(new ByteArrayInputStream(headerOnly));
        ArArchiveInputStream in = new ArArchiveInputStream(mnais);

        ArArchiveEntry entry = in.getNextArEntry();
        Assert.assertNull(entry);
    }

    @Test
    public void getNextArEntry_givenValidArchive_shouldReturnPopulatedEntry() throws IOException {
        String entryName = "test.txt";
        String content = "Hello World";
        byte[] archive = buildArArchive(entryName, content);

        ByteArrayInputStream bais = new ByteArrayInputStream(archive);
        ArArchiveInputStream in = new ArArchiveInputStream(bais);

        ArArchiveEntry entry = in.getNextArEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals(entryName, entry.getName());
        Assert.assertEquals(content.length(), entry.getSize());
    }

    @Test
    public void getNextEntry_givenValidArchive_shouldDelegateToGetNextArEntry() throws IOException {
        String entryName = "file1.bin";
        String content = "TestData";
        byte[] archive = buildArArchive(entryName, content);

        ByteArrayInputStream bais = new ByteArrayInputStream(archive);
        ArArchiveInputStream in = new ArArchiveInputStream(bais);

        ArchiveEntry entry = in.getNextEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals(entryName, entry.getName());
        Assert.assertEquals(content.length(), entry.getSize());
    }

    @Test
    public void getNextArEntry_givenTruncatedEntryTrailer_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ArArchiveEntry.HEADER.getBytes());
        baos.write(createPaddedField("test.txt", 16));
        baos.write(createPaddedField("0", 12));
        baos.write(createPaddedField("0", 6));
        baos.write(createPaddedField("0", 6));
        baos.write(createPaddedField("0", 8));
        baos.write(createPaddedField("0", 10));
        // Missing trailer bytes

        ArArchiveInputStream in = new ArArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        try {
            in.getNextArEntry();
            Assert.fail("Expected IOException on truncated trailer");
        } catch (IOException ex) {
            Assert.assertEquals("failed to read entry header", ex.getMessage());
        }
    }

    @Test
    public void getNextArEntry_givenInvalidTrailer_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ArArchiveEntry.HEADER.getBytes());
        baos.write(createPaddedField("test.txt", 16));
        baos.write(createPaddedField("0", 12));
        baos.write(createPaddedField("0", 6));
        baos.write(createPaddedField("0", 6));
        baos.write(createPaddedField("0", 8));
        baos.write(createPaddedField("0", 10));
        baos.write("XX".getBytes()); // Invalid trailer content

        ArArchiveInputStream in = new ArArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        try {
            in.getNextArEntry();
            Assert.fail("Expected IOException on invalid trailer content");
        } catch (IOException ex) {
            Assert.assertEquals("invalid entry header. not read the content?", ex.getMessage());
        }
    }

    @Test
    public void getNextArEntry_givenNonNumericLength_shouldThrowNumberFormatException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ArArchiveEntry.HEADER.getBytes());
        baos.write(createPaddedField("test.txt", 16));
        baos.write(createPaddedField("0", 12));
        baos.write(createPaddedField("0", 6));
        baos.write(createPaddedField("0", 6));
        baos.write(createPaddedField("0", 8));
        baos.write(createPaddedField("NOT_NUM", 10));
        baos.write(ArArchiveEntry.TRAILER.getBytes());

        ArArchiveInputStream in = new ArArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        try {
            in.getNextArEntry();
            Assert.fail("Expected NumberFormatException for non-numeric length");
        } catch (NumberFormatException ex) {
            Assert.assertNotNull(ex);
        }
    }

    @Test
    public void getNextArEntry_givenOddOffset_shouldPadSingleByte() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ArArchiveEntry.HEADER.getBytes());
        baos.write(createPaddedField("entry1", 16));
        baos.write(createPaddedField("0", 12));
        baos.write(createPaddedField("0", 6));
        baos.write(createPaddedField("0", 6));
        baos.write(createPaddedField("0", 8));
        baos.write(createPaddedField("3", 10));
        baos.write(ArArchiveEntry.TRAILER.getBytes());
        baos.write("ABC".getBytes()); // 3 bytes content
        baos.write(0x0A); // padding byte for odd boundary
        baos.write(createPaddedField("entry2", 16));
        baos.write(createPaddedField("0", 12));
        baos.write(createPaddedField("0", 6));
        baos.write(createPaddedField("0", 6));
        baos.write(createPaddedField("0", 8));
        baos.write(createPaddedField("4", 10));
        baos.write(ArArchiveEntry.TRAILER.getBytes());
        baos.write("DEFG".getBytes());

        ArArchiveInputStream in = new ArArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        ArArchiveEntry entry1 = in.getNextArEntry();
        Assert.assertNotNull(entry1);
        Assert.assertEquals("entry1", entry1.getName());
        Assert.assertEquals(3L, entry1.getSize());

        byte[] content1 = new byte[3];
        int read1 = in.read(content1);
        Assert.assertEquals(3, read1);
        Assert.assertEquals("ABC", new String(content1));

        ArArchiveEntry entry2 = in.getNextArEntry();
        Assert.assertNotNull(entry2);
        Assert.assertEquals("entry2", entry2.getName());
        Assert.assertEquals(4L, entry2.getSize());

        byte[] content2 = new byte[4];
        int read2 = in.read(content2);
        Assert.assertEquals(4, read2);
        Assert.assertEquals("DEFG", new String(content2));
    }

    @Test
    public void read_givenSingleByteReads_shouldReadAndTrackOffset() throws IOException {
        byte[] data = new byte[] { 65, 66 };
        ArArchiveInputStream in = new ArArchiveInputStream(new ByteArrayInputStream(data));

        int b1 = in.read();
        Assert.assertEquals(65, b1);

        int b2 = in.read();
        Assert.assertEquals(66, b2);

        int eof = in.read();
        Assert.assertEquals(-1, eof);
    }

    @Test
    public void read_givenZeroByteRead_shouldNotAdvanceOffset() throws IOException {
        ArArchiveInputStream in = new ArArchiveInputStream(new ZeroReturningInputStream());

        int r1 = in.read();
        Assert.assertEquals(0, r1);

        int r2 = in.read();
        Assert.assertEquals(-1, r2);
    }

    @Test
    public void read_givenZeroBytesChunkRead_shouldNotAdvanceOffset() throws IOException {
        ArArchiveInputStream in = new ArArchiveInputStream(new ZeroReturningInputStream());
        byte[] buf = new byte[1];

        int r1 = in.read(buf, 0, 1);
        Assert.assertEquals(0, r1);

        int r2 = in.read(buf, 0, 1);
        Assert.assertEquals(-1, r2);
    }

    @Test
    public void read_givenByteArrayAndOffset_shouldReadSuccessfully() throws IOException {
        byte[] source = new byte[] { 1, 2, 3, 4, 5 };
        ArArchiveInputStream in = new ArArchiveInputStream(new ByteArrayInputStream(source));

        byte[] target = new byte[5];
        int bytesRead = in.read(target, 1, 3);
        Assert.assertEquals(3, bytesRead);
        Assert.assertEquals(0, target[0]);
        Assert.assertEquals(1, target[1]);
        Assert.assertEquals(2, target[2]);
        Assert.assertEquals(3, target[3]);
        Assert.assertEquals(0, target[4]);
    }

    @Test
    public void close_givenOpenStream_shouldCloseUnderlyingOnceOnly() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        CloseTrackerInputStream tracker = new CloseTrackerInputStream(bais);
        ArArchiveInputStream in = new ArArchiveInputStream(tracker);

        Assert.assertEquals(0, tracker.getCloseCount());

        in.close();
        Assert.assertEquals(1, tracker.getCloseCount());

        in.close();
        Assert.assertEquals(1, tracker.getCloseCount());
    }
}