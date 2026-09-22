package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TarUtilsTest {

    @Test
    public void testParseOctalNormal() {
        byte[] buffer = "        712".getBytes();
        assertEquals(458, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalAllSpaces() {
        byte[] buffer = "         ".getBytes();
        assertEquals(0, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalNullTerminated() {
        byte[] buffer = new byte[] { '1', '0', '0', 0 };
        assertEquals(100, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalLengthLessThanTwo() {
        byte[] buffer = new byte[] { '1' };
        try {
            TarUtils.parseOctal(buffer, 0, 1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testParseOctalInvalidChar() {
        byte[] buffer = "12a4".getBytes();
        try {
            TarUtils.parseOctal(buffer, 0, 4);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testParseOctalInvalidEnd() {
        byte[] buffer = "123".getBytes();
        try {
            TarUtils.parseOctal(buffer, 0, 3);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testParseOctalOrBinaryOctal() {
        byte[] buffer = "       10 ".getBytes();
        assertEquals(8, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalOrBinaryBinaryLong() {
        byte[] buffer = new byte[] { (byte) 0x80, 0, 0, 0, 0, 0, 0, 10 };
        assertEquals(10, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalOrBinaryBinaryLongNegative() {
        byte[] buffer = new byte[] { (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, 10 };
        assertEquals(-10, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalOrBinaryBinaryBigInteger() {
        byte[] buffer = new byte[] { (byte) 0x80, 0, 0, 0, 0, 0, 0, 1, 0 };
        assertEquals(256, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    @Test
    public void testParseBooleanTrue() {
        byte[] buffer = new byte[] { 1 };
        assertTrue(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseBooleanFalse() {
        byte[] buffer = new byte[] { 0 };
        assertFalse(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseNameWithNull() throws Exception {
        byte[] buffer = new byte[] { 't', 'e', 's', 't', 0, 'x', 'y' };
        assertEquals("test", TarUtils.parseName(buffer, 0, 7));
    }

    @Test
    public void testParseNameFullLength() throws Exception {
        byte[] buffer = "hello".getBytes();
        assertEquals("hello", TarUtils.parseName(buffer, 0, 5));
    }

    @Test
    public void testParseNameEmpty() throws Exception {
        byte[] buffer = new byte[] { 0 };
        assertEquals("", TarUtils.parseName(buffer, 0, 1));
    }

    @Test
    public void testParseNameNullTerminatedEarly() throws Exception {
        byte[] buffer = new byte[] { 'a', 'b', 0, 'c' };
        assertEquals("ab", TarUtils.parseName(buffer, 0, 4));
    }

    @Test
    public void testFormatNameBytes() {
        byte[] buf = new byte[10];
        String name = "test";
        int offset = 2;
        int length = 4;
        int newOffset = TarUtils.formatNameBytes(name, buf, offset, length);
        assertEquals(offset + length, newOffset);
        assertEquals("te", new String(buf, 0, 4).substring(0, 2));
    }

    @Test
    public void testFormatUnsignedOctalStringZero() {
        byte[] buf = new byte[10];
        TarUtils.formatUnsignedOctalString(0, buf, 0, 10);
        assertEquals("0000000000", new String(buf));
    }

    @Test
    public void testFormatUnsignedOctalStringPositive() {
        byte[] buf = new byte[10];
        TarUtils.formatUnsignedOctalString(64, buf, 0, 10);
        assertEquals("0000000100", new String(buf));
    }

    @Test
    public void testFormatUnsignedOctalStringOverflow() {
        byte[] buf = new byte[3];
        try {
            TarUtils.formatUnsignedOctalString(100, buf, 0, 3);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testFormatOctalBytes() {
        byte[] buf = new byte[10];
        int offset = 0;
        int length = 8;
        int newOffset = TarUtils.formatOctalBytes(64, buf, offset, length);
        assertEquals(length, newOffset);
        assertEquals("00000100 ", new String(buf));
    }

    @Test
    public void testFormatLongOctalBytes() {
        byte[] buf = new byte[10];
        int offset = 0;
        int length = 8;
        int newOffset = TarUtils.formatLongOctalBytes(100, buf, offset, length);
        assertEquals(8, newOffset);
        assertEquals("00000140 ", new String(buf));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesOctal() {
        byte[] buf = new byte[10];
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(100, buf, 0, 10);
        assertEquals(10, newOffset);
        assertEquals("0000000140", new String(buf).substring(0, 10));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesBinary() {
        byte[] buf = new byte[10];
        long value = 1000000000L;
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 10);
        assertEquals(10, newOffset);
        assertEquals(1000000000L, TarUtils.parseOctalOrBinary(buf, 0, 10));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesNegativeBinary() {
        byte[] buf = new byte[10];
        long value = -100;
        int newOffset = TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 10);
        assertEquals(10, newOffset);
        assertEquals(-100L, TarUtils.parseOctalOrBinary(buf, 0, 10));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesOverflow() {
        byte[] buf = new byte[8];
        long value = 1L << 62;
        try {
            TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 8);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testVerifyCheckSumValid() {
        byte[] header = new byte[512];
        for (byte b = 0; b < 512; b++) {
            header[b] = b;
        }
        // Clear checksum field first
        for (int i = TarConstants.CHKSUM_OFFSET; i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN; i++) {
            header[i] = ' ';
        }
        long sum = 0;
        for (byte b : header) {
            sum += (b & 0xff);
        }
        String sumStr = Long.toOctalString(sum);
        int len = sumStr.length();
        int start = TarConstants.CHKSUM_OFFSET + (TarConstants.CHKSUMLEN / 2) - (len / 2);
        for (int i = 0; i < len; i++) {
            header[start + i] = (byte) sumStr.charAt(i);
        }
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSumInvalid() {
        byte[] header = new byte[512];
        for (int i = 0; i < 512; i++) {
            header[i] = 0;
        }
        assertFalse(TarUtils.verifyCheckSum(header));
    }
}