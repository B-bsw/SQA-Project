package org.apache.commons.compress.compressors.bzip2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BZip2CompressorInputStreamTest {

    private InputStream emptyInput;
    private InputStream invalidInput;
    private InputStream shortInput;
    private InputStream bzip2Input;

    @Before
    public void setUp() throws Exception {
        // Setup test input streams
        emptyInput = new ByteArrayInputStream(new byte[0]);
        invalidInput = new ByteArrayInputStream("not a bzip2 stream".getBytes("UTF-8"));
        shortInput = new ByteArrayInputStream(new byte[] { 'B', 'Z' });
        // Create a minimal valid bzip2 stream (empty block)
        bzip2Input = createEmptyBzip2Stream();
    }

    @After
    public void tearDown() throws Exception {
        emptyInput.close();
        invalidInput.close();
        shortInput.close();
        bzip2Input.close();
    }

    @Test(expected = IOException.class)
    public void testConstructor_NullInput() throws IOException {
        new BZip2CompressorInputStream(null);
    }

    @Test(expected = IOException.class)
    public void testConstructor_EmptyStream_SingleArg() throws IOException {
        new BZip2CompressorInputStream(emptyInput);
    }

    @Test(expected = IOException.class)
    public void testConstructor_EmptyStream_TwoArgs() throws IOException {
        new BZip2CompressorInputStream(emptyInput, false);
    }

    @Test(expected = IOException.class)
    public void testConstructor_InvalidMagic() throws IOException {
        new BZip2CompressorInputStream(invalidInput);
    }

    @Test(expected = IOException.class)
    public void testConstructor_ShortHeader() throws IOException {
        new BZip2CompressorInputStream(shortInput);
    }

    @Test(expected = IOException.class)
    public void testConstructor_InvalidBlockSize() throws IOException {
        InputStream badBlockSize = new ByteArrayInputStream(new byte[] {
            'B', 'Z', 'h', '0'
        });
        new BZip2CompressorInputStream(badBlockSize);
    }

    @Test
    public void testConstructor_ValidStream() throws Exception {
        BZip2CompressorInputStream bz2 = null;
        try {
            bz2 = new BZip2CompressorInputStream(bzip2Input);
            assertNotNull(bz2);
        } finally {
            if (bz2 != null) {
                bz2.close();
            }
        }
    }

    @Test
    public void testRead_ReturnEOF_WhenStreamEmpty() throws Exception {
        try (BZip2CompressorInputStream bz2 = new BZip2CompressorInputStream(bzip2Input)) {
            // read after init should return -1 for empty block
            int result = bz2.read();
            assertTrue(result == -1);
        }
    }

    @Test
    public void testRead_NullInput_ThrowsIOException() throws Exception {
        BZip2CompressorInputStream bz2 = new BZip2CompressorInputStream(bzip2Input);
        bz2.close();
        try {
            bz2.read();
            fail("Expected IOException for closed stream");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("closed"));
        }
    }

    @Test
    public void testRead_ZeroLengthBuffer() throws Exception {
        try (BZip2CompressorInputStream bz2 = new BZip2CompressorInputStream(bzip2Input)) {
            byte[] dest = new byte[0];
            assertEquals(0, bz2.read(dest, 0, 0));
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_NegativeOffset() throws Exception {
        try (BZip2CompressorInputStream bz2 = new BZip2CompressorInputStream(bzip2Input)) {
            byte[] dest = new byte[10];
            bz2.read(dest, -1, 5);
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_NegativeLength() throws Exception {
        try (BZip2CompressorInputStream bz2 = new BZip2CompressorInputStream(bzip2Input)) {
            byte[] dest = new byte[10];
            bz2.read(dest, 0, -1);
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRead_OffsetPlusLengthExceedsArray() throws Exception {
        try (BZip2CompressorInputStream bz2 = new BZip2CompressorInputStream(bzip2Input)) {
            byte[] dest = new byte[10];
            bz2.read(dest, 8, 3);
        }
    }

    @Test
    public void testRead_AllocateLargeBuffer() throws Exception {
        try (BZip2CompressorInputStream bz2 = new BZip2CompressorInputStream(bzip2Input)) {
            byte[] dest = new byte[1024];
            int result = bz2.read(dest, 0, dest.length);
            assertTrue(result == -1); // empty block
            // buffer should not be filled since EOF immediately
            for (int i = 0; i < dest.length; i++) {
                assertEquals((byte) 0, dest[i]);
            }
        }
    }

    @Test
    public void testRead_ReturnsZero_FullLengthInput() throws Exception {
        // This test needs a non-empty bzip2 stream, so let's create one
        byte[] compressedData = createNonEmptyBzip2Stream("test data");
        try (BZip2CompressorInputStream bz2 = new BZip2CompressorInputStream(new ByteArrayInputStream(compressedData))) {
            byte[] dest = new byte[9]; // "test data" is 9 bytes
            int result = bz2.read(dest, 0, dest.length);
            assertEquals(9, result);
            assertArrayEquals("test data".getBytes("UTF-8"), dest);
        }
    }

    @Test
    public void testRead_ReadsDataInChunks() throws Exception {
        byte[] compressedData = createNonEmptyBzip2Stream("Hello BZip2 World");
        try (BZip2CompressorInputStream bz2 = new BZip2CompressorInputStream(new ByteArrayInputStream(compressedData))) {
            byte[] dest = new byte[10];
            int read1 = bz2.read(dest, 0, 5);
            assertEquals(5, read1);
            assertEquals("Hello", new String(dest, 0, read1, "UTF-8"));

            int read2 = bz2.read(dest, 0, 5);
            assertEquals(5, read2);
            assertEquals(" BZip", new String(dest, 0, read2, "UTF-8"));

            int read3 = bz2.read(dest, 0, 10);
            assertEquals(6, read3);
            assertEquals("2 World", new String(dest, 0, read3, "UTF-8"));

            assertEquals(-1, bz2.read(dest, 0, 10));
        }
    }

    @Test
    public void testMatches_ValidSignature() {
        byte[] sig = new byte[] { 'B', 'Z', 'h' };
        assertTrue(BZip2CompressorInputStream.matches(sig, 3));
    }

    @Test
    public void testMatches_TooShort() {
        byte[] sig = new byte[] { 'B', 'Z' };
        assertFalse(BZip2CompressorInputStream.matches(sig, 2));
        assertFalse(BZip2CompressorInputStream.matches(sig, 0));
        assertFalse(BZip2CompressorInputStream.matches(sig, -1));
    }

    @Test
    public void testMatches_InvalidFirstByte() {
        byte[] sig = new byte[] { 'A', 'Z', 'h' };
        assertFalse(BZip2CompressorInputStream.matches(sig, 3));
    }

    @Test
    public void testMatches_InvalidSecondByte() {
        byte[] sig = new byte[] { 'B', 'Y', 'h' };
        assertFalse(BZip2CompressorInputStream.matches(sig, 3));
    }

    @Test
    public void testMatches_InvalidThirdByte() {
        byte[] sig = new byte[] { 'B', 'Z', 'z' };
        assertFalse(BZip2CompressorInputStream.matches(sig, 3));
    }

    @Test
    public void testClose_DoubleCloseSafe() throws Exception {
        BZip2CompressorInputStream bz2 = new BZip2CompressorInputStream(bzip2Input);
        bz2.close();
        bz2.close();
    }

    @Test
    public void testClose_ReleasesStream() throws Exception {
        BZip2CompressorInputStream bz2 = new BZip2CompressorInputStream(bzip2Input);
        bz2.close();
        assertNull(fielfOf(bz2, "in"));
    }

    private BZip2CompressorInputStream createStreamForTest(byte[] input) throws IOException {
        return new BZip2CompressorInputStream(new ByteArrayInputStream(input));
    }

    private Object fielfOf(Object obj, String fieldName) {
        try {
            java.lang.reflect.Field field = obj.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private java.io.InputStream createEmptyBzip2Stream() throws IOException {
        // Minimal valid BZip2 stream with empty block
        byte[] header = new byte[] {
            'B', 'Z', 'h', '1',
            0x17, 0x72, (byte) 0x45, 0x38,
            0x50, (byte) 0x90,
            0x00, 0x00, 0x00, 0x00,
            0x00, 0x00, 0x00, 0x00,
        };
        // No block data, just end-of-block marker
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(header);
        return new ByteArrayInputStream(baos.toByteArray());
    }

    private byte[] createNonEmptyBzip2Stream(String data) throws IOException {
        // Simple BZip2 encoder not available in tests, so we'll manually create a valid stream.
        // Since this is a test, we're limited in creating valid compressed data.
        // This method would need real BZip2 compression. For demonstration we just return a placeholder.
        // Use commons-compress BZip2CompressorOutputStream to create actual compressed data.
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream bz2 =
                new org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream(baos)) {
            bz2.write(data.getBytes("UTF-8"));
        }
        return baos.toByteArray();
    }

    private static final int MAX_CODE_LEN = 23;

    private static final class CRC {
        private int value = 0xffffffff;

        void initialiseCRC() {
            value = 0xffffffff;
        }

        int getFinalCRC() {
            return ~value;
        }

        void updateCRCOneByte(int b) {
            // Placeholder - actual implementation would update the CRC
        }

        void updateCRC(byte[] data, int offset, int length) {
            // Placeholder
        }
    }

    private static final class Data {
        private boolean[] inUse;
        private byte[] seqToUnseq;
        private byte[] selector;
        private byte[] selectorMtf;
        private int[] limit;
        private int[] base;
        private int[] perm;
        private short[] length;
        private byte[] unzftab;
        private int[] cftab;
        private byte[] recvDecodingTables_pos;

        Data(int blockSize100k) {
            inUse = new boolean[256];
            seqToUnseq = new byte[256];
            selector = new byte[32768];
            selectorMtf = new byte[32768];
            int maxLengths = blockSize100k * 100000 + 1;
            limit = new int[MAX_CODE_LEN];
            base = new int[MAX_CODE_LEN];
            perm = new int[65536];
            length = new short[MAX_CODE_LEN];
            unzftab = new int[256];
            cftab = new int[257];
            recvDecodingTables_pos = new byte[(1024 * 1024)];
        }
    }
}