package org.apache.commons.codec.binary;

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
import java.io.SequenceInputStream;
import java.util.Arrays;

import org.junit.Test;

public class Base64InputStreamTest {

    private static final String SAMPLE_TEXT = "Hello, World! This is a test string for Base64 streaming.";
    private static final String BASE64_SAMPLE = "SGVsbG8sIFdvcmxkIQ=="; // "Hello, World!"

    // Helper to convert byte[] to int for read() method expected output
    private static int byteToInt(byte b) {
        return b < 0 ? 256 + b : b;
    }

    @Test
    public void testDecodeSingleByte() throws IOException {
        byte[] decoded = SAMPLE_TEXT.getBytes("US-ASCII");
        Base64 base64 = new Base64();
        String encoded = base64.encodeToString(decoded);
        byte[] encodedBytes = encoded.getBytes("US-ASCII");

        try (Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(encodedBytes), false)) {
            int b;
            int count = 0;
            while ((b = in.read()) != -1) {
                assertEquals(byteToInt(decoded[count]), b);
                count++;
            }
            assertEquals(decoded.length, count);
        }
    }

    @Test
    public void testEncodeSingleByte() throws IOException {
        byte[] plain = SAMPLE_TEXT.getBytes("US-ASCII");
        Base64 base64 = new Base64();
        String expectedEncoded = base64.encodeToString(plain);

        try (Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(plain), true)) {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
            String actual = new String(out.toByteArray(), "US-ASCII");
            assertEquals(expectedEncoded, actual);
        }
    }

    @Test
    public void testDecodeReadArray() throws IOException {
        byte[] decoded = SAMPLE_TEXT.getBytes("US-ASCII");
        Base64 base64 = new Base64();
        String encoded = base64.encodeToString(decoded);
        byte[] encodedBytes = encoded.getBytes("US-ASCII");

        try (Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(encodedBytes), false)) {
            byte[] buffer = new byte[10];
            int count = 0;
            int r;
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            while ((r = in.read(buffer, 0, buffer.length)) != -1) {
                out.write(buffer, 0, r);
                count += r;
            }
            assertArrayEquals(decoded, out.toByteArray());
            assertEquals(decoded.length, count);
        }
    }

    @Test
    public void testEncodeReadArray() throws IOException {
        byte[] plain = SAMPLE_TEXT.getBytes("US-ASCII");
        Base64 base64 = new Base64();
        String expectedEncoded = base64.encodeToString(plain);

        try (Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(plain), true)) {
            byte[] buffer = new byte[7];
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            int r;
            while ((r = in.read(buffer, 0, buffer.length)) != -1) {
                out.write(buffer, 0, r);
            }
            assertEquals(expectedEncoded, new String(out.toByteArray(), "US-ASCII"));
        }
    }

    @Test
    public void testReadZeroLength() throws IOException {
        byte[] data = BASE64_SAMPLE.getBytes("US-ASCII");
        try (Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(data), false)) {
            byte[] buf = new byte[5];
            assertEquals(0, in.read(buf, 0, 0));
        }
    }

    @Test
    public void testReadNullArray() throws IOException {
        byte[] data = BASE64_SAMPLE.getBytes("US-ASCII");
        try (Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(data), false)) {
            try {
                in.read(null, 0, 0);
                fail("Expected NullPointerException");
            } catch (NullPointerException e) {
                // expected
            }
        } catch (IOException e) {
            fail("Unexpected IOException: " + e.getMessage());
        }
    }

    @Test
    public void testReadNegativeOffset() throws IOException {
        byte[] data = BASE64_SAMPLE.getBytes("US-ASCII");
        try (Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(data), false)) {
            byte[] buf = new byte[5];
            try {
                in.read(buf, -1, 0);
                fail("Expected IndexOutOfBoundsException");
            } catch (IndexOutOfBoundsException e) {
                // expected
            }
        }
    }

    @Test
    public void testReadNegativeLength() throws IOException {
        byte[] data = BASE64_SAMPLE.getBytes("US-ASCII");
        try (Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(data), false)) {
            byte[] buf = new byte[5];
            try {
                in.read(buf, 0, -1);
                fail("Expected IndexOutOfBoundsException");
            } catch (IndexOutOfBoundsException e) {
                // expected
            }
        }
    }

    @Test
    public void testReadOffsetBeyondLength() throws IOException {
        byte[] data = BASE64_SAMPLE.getBytes("US-ASCII");
        try (Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(data), false)) {
            byte[] buf = new byte[5];
            try {
                in.read(buf, 6, 0);
                fail("Expected IndexOutOfBoundsException");
            } catch (IndexOutOfBoundsException e) {
                // expected
            }
        }
    }

    @Test
    public void testReadOffsetPlusLengthBeyondLength() throws IOException {
        byte[] data = BASE64_SAMPLE.getBytes("US-ASCII");
        try (Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(data), false)) {
            byte[] buf = new byte[5];
            try {
                in.read(buf, 2, 5);
                fail("Expected IndexOutOfBoundsException");
            } catch (IndexOutOfBoundsException e) {
                // expected
            }
        }
    }

    @Test
    public void testLargeDataDecode() throws IOException {
        // Create large byte array (e.g., 100KB) to test multi-chunk decode
        byte[] decoded = new byte[100 * 1024];
        for (int i = 0; i < decoded.length; i++) {
            decoded[i] = (byte) (i % 256);
        }
        Base64 base64 = new Base64();
        String encoded = base64.encodeToString(decoded);
        byte[] encodedBytes = encoded.getBytes("US-ASCII");

        try (Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(encodedBytes), false)) {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buffer = new byte[5000];
            int r;
            while ((r = in.read(buffer)) != -1) {
                out.write(buffer, 0, r);
            }
            assertArrayEquals(decoded, out.toByteArray());
        }
    }

    @Test
    public void testLargeDataEncode() throws IOException {
        byte[] plain = new byte[100 * 1024];
        for (int i = 0; i < plain.length; i++) {
            plain[i] = (byte) (i % 256);
        }
        Base64 base64 = new Base64();
        String expectedEncoded = base64.encodeToString(plain);

        try (Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(plain), true)) {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buffer = new byte[7000];
            int r;
            while ((r = in.read(buffer)) != -1) {
                out.write(buffer, 0, r);
            }
            assertEquals(expectedEncoded, new String(out.toByteArray(), "US-ASCII"));
        }
    }

    @Test
    public void testEmptyInputDecode() throws IOException {
        byte[] empty = new byte[0];
        Base64 base64 = new Base64();
        String encoded = base64.encodeToString(empty);
        byte[] encodedBytes = encoded.getBytes("US-ASCII");

        try (Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(encodedBytes), false)) {
            byte[] buffer = new byte[10];
            int r = in.read(buffer, 0, 10);
            assertEquals(-1, r);
        }
    }

    @Test
    public void testEmptyInputEncode() throws IOException {
        byte[] empty = new byte[0];
        try (Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(empty), true)) {
            byte[] buffer = new byte[10];
            int r = in.read(buffer, 0, 10);
            assertEquals(-1, r);
        }
    }

    @Test
    public void testLineLengthZero() throws IOException {
        byte[] plain = SAMPLE_TEXT.getBytes("US-ASCII");
        Base64 base64 = new Base64(0, new byte[] { '\r', '\n' });
        String expectedEncoded = base64.encodeToString(plain);

        try (Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(plain), true, 0, new byte[] { '\r', '\n' })) {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buffer = new byte[32];
            int r;
            while ((r = in.read(buffer)) != -1) {
                out.write(buffer, 0, r);
            }
            assertEquals(expectedEncoded, new String(out.toByteArray(), "US-ASCII"));
        }
    }

    @Test
    public void testLineLengthPositive() throws IOException {
        byte[] plain = SAMPLE_TEXT.getBytes("US-ASCII");
        Base64 base64 = new Base64(20, new byte[] { '\n' });
        String expectedEncoded = base64.encodeToString(plain);

        try (Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(plain), true, 20, new byte[] { '\n' })) {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buffer = new byte[128];
            int r;
            while ((r = in.read(buffer)) != -1) {
                out.write(buffer, 0, r);
            }
            assertEquals(expectedEncoded, new String(out.toByteArray(), "US-ASCII"));
        }
    }

    @Test
    public void testMarkSupportedReturnsFalse() throws IOException {
        byte[] data = BASE64_SAMPLE.getBytes("US-ASCII");
        try (Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(data), false)) {
            assertFalse(in.markSupported());
        }
    }

    @Test
    public void testConstructorWithBooleanFalse() throws IOException {
        byte[] data = BASE64_SAMPLE.getBytes("US-ASCII");
        Base64 base64 = new Base64(false);
        String expected = new String(base64.decode(data), "US-ASCII");

        try (Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(data), false)) {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
            assertEquals(expected, new String(out.toByteArray(), "US-ASCII"));
        }
    }

    @Test
    public void testConstructorWithBooleanTrue() throws IOException {
        byte[] plain = SAMPLE_TEXT.getBytes("US-ASCII");
        Base64 base64 = new Base64();
        String expectedEncoded = base64.encodeToString(plain);

        try (Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(plain), true)) {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
            assertEquals(expectedEncoded, new String(out.toByteArray(), "US-ASCII"));
        }
    }

    @Test
    public void testReadWithOffsetAndLengthMax() throws IOException {
        byte[] decoded = SAMPLE_TEXT.getBytes("US-ASCII");
        Base64 base64 = new Base64();
        String encoded = base64.encodeToString(decoded);
        byte[] encodedBytes = encoded.getBytes("US-ASCII");

        try (Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(encodedBytes), false)) {
            byte[] buffer = new byte[64];
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            int r;
            while ((r = in.read(buffer, 0, buffer.length)) != -1) {
                out.write(buffer, 0, r);
            }
            assertArrayEquals(decoded, out.toByteArray());
        }
    }

    @Test
    public void testReadReturnZeroScenario() throws IOException {
        // Create a string that when decoded may produce zero-length reads initially
        byte[] encoded = BASE64_SAMPLE.getBytes("US-ASCII");
        try (Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(encoded), false)) {
            byte[] buffer = new byte[1];
            int r = in.read(buffer, 0, 0);
            assertEquals(0, r);
        }
    }

    @Test
    public void testReadManySmallChunks() throws IOException {
        byte[] decoded = SAMPLE_TEXT.getBytes("US-ASCII");
        Base64 base64 = new Base64();
        String encoded = base64.encodeToString(decoded);
        byte[] encodedBytes = encoded.getBytes("US-ASCII");

        try (Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(encodedBytes), false)) {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buffer = new byte[3];
            int r;
            while ((r = in.read(buffer, 0, buffer.length)) != -1) {
                out.write(buffer, 0, r);
            }
            assertArrayEquals(decoded, out.toByteArray());
        }
    }

    @Test
    public void testReadWithNoDataAfterRead() throws IOException {
        byte[] empty = new byte[0];
        try (Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(empty), false)) {
            byte[] buffer = new byte[10];
            int r = in.read(buffer);
            assertEquals(-1, r);
        }
    }

    @Test
    public void testReadWithDataOverflow() throws IOException {
        byte[] data = SAMPLE_TEXT.getBytes("US-ASCII");
        try (Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(data), false)) {
            byte[] buffer = new byte[5];
            int r = in.read(buffer, 0, 10);
            // Even though len=10, the number of available bytes is smaller
            assertTrue(r >= 0 && r <= 5);
        }
    }
}