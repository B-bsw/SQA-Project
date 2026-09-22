package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class TarUtilsTest {

    @Test
    public void testParseOctalNormalCase() {
        byte[] buffer = new byte[10];
        for (int i = 0; i < 10; i++) buffer[i] = ' ';
        buffer[0] = '1';
        buffer[1] = '2';
        buffer[2] = '3';
        buffer[3] = ' ';
        assertEquals(83, TarUtils.parseOctal(buffer, 0, 4));
    }

    @Test
    public void testParseOctalWithNULAtStart() {
        byte[] buffer = new byte[10];
        buffer[0] = 0;
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, 4));
    }

    @Test
    public void testParseOctalLengthLessThanTwo() {
        byte[] buffer = new byte[1];
        try {
            TarUtils.parseOctal(buffer, 0, 1);
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testParseOctalInvalidByte() {
        byte[] buffer = new byte[10];
        for (int i = 0; i < 5; i++) buffer[i] = ' ';
        buffer[4] = '8';
        buffer[5] = ' ';
        try {
            TarUtils.parseOctal(buffer, 0, 6);
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Invalid byte"));
        }
    }

    @Test
    public void testParseOctalOrBinaryBinaryLong() {
        byte[] buffer = new byte[10];
        buffer[0] = (byte) 0x80;
        buffer[1] = 0;
        buffer[2] = 0;
        buffer[3] = 0;
        buffer[4] = 0;
        buffer[5] = 0;
        buffer[6] = 0;
        buffer[7] = 0;
        buffer[8] = 100;
        buffer[9] = ' ';
        assertEquals(100L, TarUtils.parseOctalOrBinary(buffer, 0, 10));
    }

    @Test
    public void testParseOctalOrBinaryNegativeBinaryLong() {
        byte[] buffer = new byte[10];
        buffer[0] = (byte) 0xFF;
        buffer[1] = (byte) 0xFF;
        buffer[2] = (byte) 0xFF;
        buffer[3] = (byte) 0xFF;
        buffer[4] = (byte) 0xFF;
        buffer[5] = (byte) 0xFF;
        buffer[6] = (byte) 0xFF;
        buffer[7] = (byte) 0xFF;
        buffer[8] = (byte) 0xFF;
        buffer[9] = ' ';
        assertEquals(-1L, TarUtils.parseOctalOrBinary(buffer, 0, 10));
    }

    @Test
    public void testParseBooleanTrue() {
        byte[] buffer = new byte[1];
        buffer[0] = 1;
        assertTrue(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseBooleanFalse() {
        byte[] buffer = new byte[1];
        buffer[0] = 0;
        assertFalse(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseNameNullTerminated() {
        byte[] buffer = new byte[20];
        buffer[0] = 'h';
        buffer[1] = 'e';
        buffer[2] = 'l';
        buffer[3] = 'l';
        buffer[4] = 'o';
        buffer[5] = 0;
        buffer[6] = 'w';
        String name = TarUtils.parseName(buffer, 0, 6);
        assertEquals("hello", name);
    }

    @Test
    public void testParseNameWithTrailingSpaces() {
        byte[] buffer = new byte[20];
        buffer[0] = 't';
        buffer[1] = 'e';
        buffer[2] = 's';
        buffer[3] = 't';
        buffer[4] = ' ';
        buffer[5] = ' ';
        String name = TarUtils.parseName(buffer, 0, 6);
        assertNotNull(name);
        assertTrue(name.startsWith("test"));
    }

    @Test
    public void testFormatNameBytes() {
        String name = "test";
        byte[] buf = new byte[10];
        int offset = 0;
        int length = 10;
        int resultOffset = TarUtils.formatNameBytes(name, buf, offset, length);
        assertEquals(length, resultOffset - offset);
        assertEquals("test", new String(buf, 0, 4));
        assertEquals(0, buf[4]);
    }

    @Test
    public void testFormatNameBytesShortBuffer() {
        String name = "hello";
        byte[] buf = new byte[3];
        try {
            TarUtils.formatNameBytes(name, buf, 0, 3);
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testFormatUnsignedOctalStringZero() {
        byte[] buf = new byte[6];
        TarUtils.formatUnsignedOctalString(0L, buf, 0, 6);
        assertEquals("     0", new String(buf).substring(0, 6));
    }

    @Test
    public void testFormatUnsignedOctalStringNormal() {
        byte[] buf = new byte[6];
        TarUtils.formatUnsignedOctalString(10L, buf, 0, 6);
        assertEquals("    12", new String(buf).substring(0, 6));
    }

    @Test
    public void testFormatUnsignedOctalStringValueTooLarge() {
        byte[] buf = new byte[6];
        try {
            TarUtils.formatUnsignedOctalString(1000000L, buf, 0, 6);
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testFormatOctalBytes() {
        byte[] buf = new byte[10];
        int result = TarUtils.formatOctalBytes(10L, buf, 0, 6);
        assertEquals(6, result);
        String s = new String(buf, 0, 6);
        assertTrue(s.startsWith("    12"));
        assertEquals(' ', s.charAt(5));
    }

    @Test
    public void testFormatLongOctalBytes() {
        byte[] buf = new byte[10];
        int result = TarUtils.formatLongOctalBytes(10L, buf, 0, 6);
        assertEquals(6, result);
        String s = new String(buf, 0, 6);
        assertTrue(s.startsWith("    12"));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesOctal() {
        byte[] buf = new byte[10];
        long value = 100;
        int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 8);
        assertEquals(8, result - 0);
        String s = new String(buf, 0, 8);
        assertTrue(s.startsWith("     14"));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesBinary() {
        byte[] buf = new byte[10];
        long value = 1000000L;
        int result = TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 8);
        assertEquals(8, result - 0);
    }

    @Test
    public void testComputeCheckSum() {
        byte[] header = new byte[512];
        for (int i = 0; i < header.length; i++) header[i] = (byte) i;
        long sum = TarUtils.computeCheckSum(header);
        assertTrue(sum > 0);
    }

    @Test
    public void testVerifyCheckSumWithValidData() {
        byte[] header = new byte[512];
        // Add some data with valid checksum calculation
        for (int i = 0; i < header.length; i++) header[i] = 0;
        // Write some actual content
        for (int i = 0; i < 10; i++) header[i] = (byte) (i + 65);
        // Fill checksum field with spaces
        for (int i = CHKSUM_OFFSET; i < CHKSUM_OFFSET + CHKSUMLEN; i++) {
            header[i] = ' ';
        }
        long checksum = TarUtils.computeCheckSum(header);
        // Format checksum into header
        String checksumStr = Long.toOctalString(checksum);
        int pos = CHKSUM_OFFSET;
        for (int i = 0; i < CHKSUMLEN - checksumStr.length() - 1; i++) {
            header[pos++] = ' ';
        }
        for (int i = 0; i < checksumStr.length(); i++) {
            header[pos++] = (byte) checksumStr.charAt(i);
        }
        header[pos] = ' ';
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSumWithInvalidData() {
        byte[] header = new byte[512];
        for (int i = 0; i < header.length; i++) header[i] = 0;
        assertFalse(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesTooLarge() {
        byte[] buf = new byte[10];
        long value = Long.MAX_VALUE;
        try {
            TarUtils.formatLongOctalOrBinaryBytes(value, buf, 0, 1);
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }
}