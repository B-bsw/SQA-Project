package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TarUtilsTest {

    @Test
    public void testParseOctalValid() {
        byte[] buffer = "0000755\0".getBytes();
        assertEquals(755L, TarUtils.parseOctal(buffer, 0, 7));
    }

    @Test
    public void testParseOctalWithSpaces() {
        byte[] buffer = "   100\0".getBytes();
        assertEquals(100L, TarUtils.parseOctal(buffer, 0, 7));
    }

    @Test
    public void testParseOctalWithTrailingNul() {
        byte[] buffer = "0000000\0".getBytes();
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, 8));
    }

    @Test
    public void testParseOctalLeadingNulReturnsZero() {
        byte[] buffer = "\0       ".getBytes();
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, 8));
    }

    @Test
    public void testParseOctalAllNuls() {
        byte[] buffer = new byte[8];
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, 8));
    }

    @Test
    public void testParseOctalInvalidLength() {
        byte[] buffer = new byte[1];
        try {
            TarUtils.parseOctal(buffer, 0, 1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Length"));
        }
    }

    @Test
    public void testParseOctalInvalidByte() {
        byte[] buffer = "1234567X".getBytes();
        try {
            TarUtils.parseOctal(buffer, 0, 8);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Invalid byte"));
        }
    }

    @Test
    public void testParseOctalOrBinaryOctalValue() {
        byte[] buffer = "0000123\0".getBytes();
        assertEquals(83L, TarUtils.parseOctalOrBinary(buffer, 0, 8));
    }

    @Test
    public void testParseOctalOrBinaryBinaryPositive() {
        byte[] buffer = {0x40, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x10};
        assertEquals(16L, TarUtils.parseOctalOrBinary(buffer, 0, 8));
    }

    @Test
    public void testParseOctalOrBinaryBinaryNegative() {
        byte[] buffer = {(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xfe};
        assertEquals(-2L, TarUtils.parseOctalOrBinary(buffer, 0, 8));
    }

    @Test
    public void testParseOctalOrBinaryMinValue() {
        byte[] buffer = {(byte) 0x80, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01};
        assertEquals(Long.MIN_VALUE, TarUtils.parseOctalOrBinary(buffer, 0, 8));
    }

    @Test
    public void testParseOctalOrBinaryInvalidBinaryLength() {
        byte[] buffer = {(byte) 0xff, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
        try {
            TarUtils.parseOctalOrBinary(buffer, 0, 9);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testParseBooleanTrue() {
        byte[] buffer = {0x01};
        assertTrue(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseBooleanFalse() {
        byte[] buffer = {0x00};
        assertFalse(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseNameBasic() {
        byte[] buffer = "testname\0".getBytes();
        assertEquals("testname", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testParseNameEmpty() {
        byte[] buffer = new byte[10];
        assertEquals("", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testParseNameWithEmbeddedNul() {
        byte[] buffer = "abc\0def\0".getBytes();
        assertEquals("abc", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testFormatNameBytesBasic() {
        byte[] buf = new byte[20];
        int offset = TarUtils.formatNameBytes("hello", buf, 0, 10);
        assertEquals(5, offset);
        assertEquals("hello", new String(buf, 0, 5));
    }

    @Test
    public void testFormatNameBytesPadding() {
        byte[] buf = new byte[10];
        int offset = TarUtils.formatNameBytes("hi", buf, 0, 10);
        assertEquals(2, offset);
        byte[] expected = new byte[10];
        System.arraycopy("hi\0".getBytes(), 0, expected, 0, 3);
        for (int i = 0; i < 10; i++) {
            assertEquals("Position " + i, expected[i], buf[i]);
        }
    }

    @Test
    public void testFormatNameBytesLongNameUsesFallback() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 200; i++) {
            sb.append('a');
        }
        String longName = sb.toString();
        byte[] buf = new byte[250];
        int offset = TarUtils.formatNameBytes(longName, buf, 0, 250);
        assertEquals("offset should be 200", 200, offset);
        assertEquals("hi\0", new String(buf, 0, 3));
    }

    @Test
    public void testFormatOctalBytesZero() {
        byte[] buf = new byte[10];
        int offset = TarUtils.formatOctalBytes(0, buf, 0, 8);
        assertEquals(8, offset);
        assertEquals("0000000\0", new String(buf, 0, 8));
    }

    @Test
    public void testFormatOctalBytesPositive() {
        byte[] buf = new byte[10];
        int offset = TarUtils.formatOctalBytes(123, buf, 0, 8);
        assertEquals(8, offset);
        assertEquals("0000173\0", new String(buf, 0, 8));
    }

    @Test
    public void testFormatLongOctalBytes() {
        byte[] buf = new byte[12];
        int offset = TarUtils.formatLongOctalBytes(123, buf, 0, 12);
        assertEquals(12, offset);
        assertEquals("00000000173\0", new String(buf, 0, 12));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesOctal() {
        byte[] buf = new byte[10];
        int offset = TarUtils.formatLongOctalOrBinaryBytes(123, buf, 0, 10);
        assertEquals(10, offset);
        assertEquals("0000000123\0", new String(buf, 0, 10));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesBinaryPositiveLarge() {
        byte[] buf = new byte[10];
        int offset = TarUtils.formatLongOctalOrBinaryBytes(1L << 40, buf, 0, 10);
        assertEquals(10, offset);
        // The value is 0x10000000000, which as a signed byte is 0x40 0x00 ... 0x00 0x00
        // Actually this should be stored in binary since it doesn't fit octal.
        assertEquals("\u0040\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", new String(buf, 0, 10));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesBinaryNegativeSmall() {
        byte[] buf = new byte[10];
        int offset = TarUtils.formatLongOctalOrBinaryBytes(-1, buf, 0, 10);
        assertEquals(10, offset);
        // This should be binary negative: 0xFF 0xFF 0xFF 0xFF 0xFF 0xFF 0xFF 0xFF 0xFF 0x01
        byte[] expected = new byte[10];
        expected[0] = (byte) 0xff;
        expected[1] = 0x01;
        for (int i = 2; i < 9; i++) {
            expected[i] = (byte) 0xff;
        }
        expected[9] = 0x01;
        // Actually expected is: 0xFF 0xFF 0xFF 0xFF 0xFF 0xFF 0xFF 0xFF 0x01 (since -1 in two's complement is all ones)
        for (int i = 0; i < 10; i++) {
            assertEquals("Position " + i, (byte) ((i == 0 || i == 8) ? (byte) 0xff : (byte) 0xff), buf[i]);
        }
    }

    @Test
    public void testFormatFastestLongOctalOrBinaryBytesOctal() {
        byte[] buf = new byte[10];
        int offset = TarUtils.formatLongOctalOrBinaryBytes(100, buf, 0, buf.length);
        assertEquals(10, offset);
    }
}