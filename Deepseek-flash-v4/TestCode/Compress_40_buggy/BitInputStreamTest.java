package org.apache.commons.compress.utils;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

public class BitInputStreamTest {
    private InputStream in;
    private BitInputStream bitInput;

    @Before
    public void setUp() {
        in = new ByteArrayInputStream(new byte[]{0x0F, 0xFF, 0x00, 0x0A});
        bitInput = new BitInputStream(in, ByteOrder.BIG_ENDIAN);
    }

    @After
    public void tearDown() throws IOException {
        bitInput.close();
    }

    @Test
    public void testReadBitsBigEndianNormal() throws IOException {
        assertEquals(0x0F, bitInput.readBits(8));
        assertEquals(0xFF, bitInput.readBits(8));
        assertEquals(0x00, bitInput.readBits(8));
        assertEquals(0x0A, bitInput.readBits(8));
    }

    @Test
    public void testReadBitsLittleEndianNormal() throws IOException {
        bitInput = new BitInputStream(new ByteArrayInputStream(new byte[]{0x0F, 0xFF, 0x00, 0x0A}), ByteOrder.LITTLE_ENDIAN);
        assertEquals(0x0F, bitInput.readBits(8));
        assertEquals(0xFF, bitInput.readBits(8));
        assertEquals(0x00, bitInput.readBits(8));
        assertEquals(0x0A, bitInput.readBits(8));
    }

    @Test
    public void testReadBitsBigEndianCrossByte() throws IOException {
        assertEquals(0x01, bitInput.readBits(4));
        assertEquals(0x1F, bitInput.readBits(8));
    }

    @Test
    public void testReadBitsLittleEndianCrossByte() throws IOException {
        bitInput = new BitInputStream(new ByteArrayInputStream(new byte[]{0x0F, 0xFF, 0x00, 0x0A}), ByteOrder.LITTLE_ENDIAN);
        assertEquals(0x0F, bitInput.readBits(4));
        assertEquals(0xFF, bitInput.readBits(5));
    }

    @Test
    public void testReadBitsZeroCount() throws IOException {
        assertEquals(0, bitInput.readBits(0));
    }

    @Test
    public void testReadBitsMaxCount() throws IOException {
        in = new ByteArrayInputStream(new byte[]{(byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF});
        bitInput = new BitInputStream(in, ByteOrder.BIG_ENDIAN);
        assertEquals(0x7FFFFFFFFFFFFFFFL, bitInput.readBits(63));
    }

    @Test
    public void testReadBitsNegativeCount() {
        try {
            bitInput.readBits(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("count must not be negative or greater than 63", e.getMessage());
        } catch (IOException e) {
            fail("Unexpected IOException");
        }
    }

    @Test
    public void testReadBitsCountTooLarge() {
        try {
            bitInput.readBits(64);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("count must not be negative or greater than 63", e.getMessage());
        } catch (IOException e) {
            fail("Unexpected IOException");
        }
    }

    @Test
    public void testReadBitsEndOfStream() throws IOException {
        bitInput.readBits(32);
        assertEquals(-1, bitInput.readBits(1));
    }

    @Test
    public void testReadBitsPartialEndOfStream() throws IOException {
        bitInput = new BitInputStream(new ByteArrayInputStream(new byte[]{0x01}), ByteOrder.BIG_ENDIAN);
        assertEquals(-1, bitInput.readBits(16));
    }

    @Test
    public void testReadBitsAcrossMultipleBytes() throws IOException {
        in = new ByteArrayInputStream(new byte[]{0x00, 0x01, 0x02, 0x03});
        bitInput = new BitInputStream(in, ByteOrder.BIG_ENDIAN);
        assertEquals(0x00010203L & 0x1FFFFL, bitInput.readBits(17));
    }

    @Test
    public void testReadBitsLittleEndianAcrossMultipleBytes() throws IOException {
        in = new ByteArrayInputStream(new byte[]{0x00, 0x01, 0x02, 0x03});
        bitInput = new BitInputStream(in, ByteOrder.LITTLE_ENDIAN);
        assertEquals(0x03020100L & 0x1FFFFL, bitInput.readBits(17));
    }

    @Test
    public void testReadBitsAfterClearCache() throws IOException {
        assertEquals(0x0F, bitInput.readBits(8));
        bitInput.clearBitCache();
        assertEquals(0xFF, bitInput.readBits(8));
    }

    @Test
    public void testClearBitCache() {
        bitInput.clearBitCache();
        assertNotNull(bitInput);
    }

    @Test
    public void testNullInputStreamConstructor() {
        try {
            new BitInputStream(null, ByteOrder.BIG_ENDIAN);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testNullByteOrderConstructor() {
        try {
            new BitInputStream(new ByteArrayInputStream(new byte[0]), null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testClose() throws IOException {
        bitInput.close();
        // Should not throw
    }
}