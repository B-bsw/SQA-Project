package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class TarUtilsTest {

    @Test
    public void testParseOctalNormal() {
        byte[] buffer = "        ".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(0L, result);
    }

    @Test
    public void testParseOctalWithValue() {
        byte[] buffer = "      17 ".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(15L, result);
    }

    @Test
    public void testParseOctalInvalidLength() {
        byte[] buffer = new byte[1];
        try {
            TarUtils.parseOctal(buffer, 0, 1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Length 1 must be at least 2", e.getMessage());
        }
    }

    @Test
    public void testParseOctalLeadingNULReturnsZero() {
        byte[] buffer = new byte[] {0, ' ', ' '};
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, 3));
    }

    @Test
    public void testParseOctalInvalidCharacters() {
        byte[] buffer = "  12a ".getBytes();
        try {
            TarUtils.parseOctal(buffer, 0, buffer.length);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("invalid byte"));
        }
    }

    @Test
    public void testParseOctalOrBinaryOctalValue() {
        byte[] buffer = "      17 ".getBytes();
        assertEquals(15L, TarUtils.parseOctalOrBinary(buffer, 0, 10));
    }

    @Test
    public void testParseOctalOrBinaryNegativeBinary() {
        byte[] buffer = new byte[] {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF};
        assertEquals(-1L, TarUtils.parseOctalOrBinary(buffer, 0, 9));
    }

    @Test
    public void testParseBooleanTrue() {
        byte[] buffer = new byte[] {1};
        assertTrue(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseBooleanFalse() {
        byte[] buffer = new byte[] {0};
        assertFalse(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseNameSimple() {
        byte[] buffer = "file.txt\0".getBytes();
        assertEquals("file.txt", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testParseNameNoNull() {
        byte[] buffer = "file".getBytes();
        assertEquals("file", TarUtils.parseName(buffer, 0, 4));
    }

    @Test
    public void testParseNameFallsBackForIllegalHeader() {
        byte[] buffer = new byte[10];
        buffer[0] = (byte) 0x80;
        String result = TarUtils.parseName(buffer, 0, 10);
        assertNotNull(result);
    }

    @Test
    public void testFormatNameBytes() {
        byte[] buf = new byte[10];
        String name = "short";
        int offset = TarUtils.formatNameBytes(name, buf, 0, buf.length);
        assertEquals(10, offset);
        assertEquals("short", new String(buf, 0, 5));
    }

    @Test
    public void testFormatNameBytesLongName() {
        byte[] buf = new byte[5];
        String name = "toolong";
        int offset = TarUtils.formatNameBytes(name, buf, 0, 5);
        assertEquals(5, offset);
        assertEquals("toolo", new String(buf));
    }

    @Test
    public void testFormatUnsignedOctalString() {
        byte[] buf = new byte[10];
        TarUtils.formatUnsignedOctalString(21L, buf, 0, 3);
        assertEquals("25", new String(buf, 0, 3).trim());
    }

    @Test
    public void testFormatUnsignedOctalStringValueTooLarge() {
        byte[] buf = new byte[3];
        try {
            TarUtils.formatUnsignedOctalString(64L, buf, 0, 3);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("will not fit"));
        }
    }

    @Test
    public void testFormatOctalBytes() {
        byte[] buf = new byte[8];
        int offset = TarUtils.formatOctalBytes(64L, buf, 0, 8);
        assertEquals(8, offset);
        assertEquals("100\0", new String(buf, 0, 4));
    }

    @Test
    public void testFormatLongOctalBytes() {
        byte[] buf = new byte[10];
        int offset = TarUtils.formatLongOctalBytes(100L, buf, 0, 10);
        assertEquals(10, offset);
    }

    @Test
    public void testFormatLongOctalBytesValueTooLarge() {
        byte[] buf = new byte[3];
        try {
            TarUtils.formatLongOctalBytes(512L, buf, 0, 3);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("will not fit"));
        }
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesOctal() {
        byte[] buf = new byte[10];
        long value = 100L;
        int offset = TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 10);
        assertEquals(10, offset);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesBinary() {
        byte[] buf = new byte[10];
        long value = 100000L;
        int offset = TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 10);
        assertEquals(10, offset);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesNegative() {
        byte[] buf = new byte[10];
        long value = -100L;
        int offset = TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 10);
        assertEquals(10, offset);
    }

    @Test
    public void testParseBinaryLongPositive() throws Exception {
        byte[] buffer = new byte[8];
        buffer[0] = 0;
        buffer[1] = 0;
        buffer[2] = 0;
        buffer[3] = 0;
        buffer[4] = 0;
        buffer[5] = 0;
        buffer[6] = 0;
        buffer[7] = 5;
        assertEquals(5L, TarUtils.parseOctalOrBinary(buffer, 0, 8));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseBinaryLongTooLarge() {
        byte[] buffer = new byte[9];
        TarUtils.parseOctalOrBinary(buffer, 0, 9);
    }

    @Test
    public void testVerifyCheckSumValid() {
        byte[] header = new byte[512];
        for (int i = 0; i < 512; i++) {
            header[i] = (byte) i;
        }
        // Manually compute checksum
        long sum = 0;
        for (int i = 0; i < 512; i++) {
            sum += header[i] & 0xff;
        }
        String octal = String.format("%6o", sum);
        byte[] checkSumBytes = new byte[8];
        byte[] temp = octal.getBytes();
        System.arraycopy(temp, 0, checkSumBytes, 6 - temp.length, temp.length);
        checkSumBytes[7] = 0;
        for (int i = 0; i < 8; i++) {
            header[148 + i] = checkSumBytes[i];
        }
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSumInvalid() {
        byte[] header = new byte[512];
        for (int i = 0; i < 512; i++) {
            header[i] = (byte) i;
        }
        assertFalse(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testComputeCheckSum() {
        byte[] buf = new byte[512];
        for (int i = 0; i < 512; i++) {
            buf[i] = (byte) i;
        }
        long sum = 0;
        for (int i = 0; i < 512; i++) {
            if (i < 148 || i >= 156) {
                sum += buf[i] & 0xff;
            }
        }
        assertEquals(sum, TarUtils.computeCheckSum(buf));
    }
}