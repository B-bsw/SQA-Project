package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

public class TarUtilsTest {

    @Test
    public void testParseOctalValid() {
        byte[] buffer = " 12345 ".getBytes();
        assertEquals(12345L, TarUtils.parseOctal(buffer, 0, 7));
    }

    @Test
    public void testParseOctalAllNul() {
        byte[] buffer = new byte[8];
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, 8));
    }

    @Test
    public void testParseOctalLeadingNul() {
        byte[] buffer = new byte[8];
        buffer[0] = 0;
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, 8));
    }

    @Test
    public void testParseOctalInvalidLength() {
        byte[] buffer = new byte[2];
        try {
            TarUtils.parseOctal(buffer, 0, 1);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testParseOctalTrailingMissing() {
        byte[] buffer = "12345".getBytes();
        try {
            TarUtils.parseOctal(buffer, 0, 6);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testParseOctalInvalidChar() {
        byte[] buffer = "12Z45 ".getBytes();
        try {
            TarUtils.parseOctal(buffer, 0, 6);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testParseOctalLeadingSpaces() {
        byte[] buffer = "   123 ".getBytes();
        assertEquals(123L, TarUtils.parseOctal(buffer, 0, 7));
    }

    @Test
    public void testParseOctalEmpty() {
        byte[] buffer = "       ".getBytes();
        try {
            TarUtils.parseOctal(buffer, 0, 8);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testParseOctalOrBinaryOctalPath() {
        byte[] buffer = " 123 ".getBytes();
        assertEquals(123L, TarUtils.parseOctalOrBinary(buffer, 0, 5));
    }

    @Test
    public void testParseOctalOrBinaryBinaryNegative() {
        byte[] buffer = new byte[]{(byte) 0xff, (byte) 0xfe, 0, 0, 0, 0, 0, 0, 0};
        assertEquals(-256L, TarUtils.parseOctalOrBinary(buffer, 0, 9));
    }

    @Test
    public void testParseOctalOrBinaryBinaryPositive() {
        byte[] buffer = new byte[]{(byte) 0x80, 0, 0, 0, 0, 0, 0, 0, 1};
        assertEquals(1L, TarUtils.parseOctalOrBinary(buffer, 0, 9));
    }

    @Test
    public void testParseOctalOrBinaryBinaryNegativeSigned() {
        byte[] buffer = new byte[]{(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff};
        assertEquals(-1L, TarUtils.parseOctalOrBinary(buffer, 0, 9));
    }

    @Test
    public void testParseBooleanTrue() {
        byte[] buffer = {1};
        assertTrue(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseBooleanFalse() {
        byte[] buffer = {0};
        assertFalse(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseNameBasic() {
        byte[] buffer = "hello\0".getBytes();
        assertEquals("hello", TarUtils.parseName(buffer, 0, 6));
    }

    @Test
    public void testParseNameNoNull() {
        byte[] buffer = "hello".getBytes();
        assertEquals("hello", TarUtils.parseName(buffer, 0, 5));
    }

    @Test
    public void testParseNameEmpty() {
        byte[] buffer = new byte[10];
        assertEquals("", TarUtils.parseName(buffer, 0, 10));
    }

    @Test
    public void testParseNameLengthZero() {
        byte[] buffer = "hello".getBytes();
        assertEquals("", TarUtils.parseName(buffer, 0, 0));
    }

    @Test
    public void testFormatNameBytesShortName() {
        byte[] buffer = new byte[20];
        int offset = TarUtils.formatNameBytes("test", buffer, 0, 20);
        assertEquals(4, offset);
        assertEquals("test", new String(buffer, 0, 4));
    }

    @Test
    public void testFormatNameBytesLongName() {
        byte[] buffer = new byte[10];
        String longName = "abcdefghijklmno";
        int offset = TarUtils.formatNameBytes(longName, buffer, 0, 10);
        assertEquals(10, offset);
        assertEquals("abcdefghij", new String(buffer, 0, 10));
    }

    @Test
    public void testFormatNameBytesEmpty() {
        byte[] buffer = new byte[10];
        int offset = TarUtils.formatNameBytes("", buffer, 0, 10);
        assertEquals(0, offset);
    }

    @Test
    public void testParseOctalOrBinaryBinaryInvalidLength() {
        byte[] buffer = new byte[11];
        buffer[0] = (byte) 0x80;
        try {
            TarUtils.parseOctalOrBinary(buffer, 0, 11);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testFormatOctalBytesFit() {
        byte[] buffer = new byte[10];
        int offset = TarUtils.formatOctalBytes(123L, buffer, 0, 10);
        assertEquals(5, offset);
        assertEquals("0000123\0 ", new String(buffer, 0, 8));
    }

    @Test
    public void testFormatOctalBytesCannotFit() {
        byte[] buffer = new byte[5];
        try {
            TarUtils.formatOctalBytes(1000000L, buffer, 0, 5);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testFormatLongOctalBytesFit() {
        byte[] buffer = new byte[10];
        int offset = TarUtils.formatLongOctalBytes(123L, buffer, 0, 10);
        assertEquals(5, offset);
        assertEquals("0000123\0 ", new String(buffer, 0, 8));
    }

    @Test
    public void testFormatLongOctalBytesCannotFit() {
        byte[] buffer = new byte[3];
        try {
            TarUtils.formatLongOctalBytes(1000000L, buffer, 0, 3);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testFormatLongOctalOrBinaryOctalPath() {
        byte[] buffer = new byte[10];
        long value = 100;
        int offset = TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, 10);
        assertEquals(5, offset);
    }

    @Test
    public void testFormatLongOctalOrBinaryBinaryPath() {
        byte[] buffer = new byte[10];
        long value = Long.MAX_VALUE;
        int offset = TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, 10);
        assertEquals(10, offset);
    }

    @Test
    public void testFormatLongOctalOrBinaryNegativeBinary() {
        byte[] buffer = new byte[10];
        long value = -100;
        int offset = TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, 10);
        assertEquals(10, offset);
    }

    @Test
    public void testFormatLongOctalOrBinaryNegativeTooLarge() {
        byte[] buffer = new byte[2];
        try {
            TarUtils.formatLongOctalOrBinaryBytes(100000L, buffer, 0, 2);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testComputeCheckSum() {
        byte[] header = new byte[512];
        for (int i = 0; i < header.length; i++) {
            header[i] = (byte) (i % 128);
        }
        long sum = 0;
        for (byte b : header) {
            sum += (b & 0xFF);
        }
        // Add checksum field as spaces (32) for 1-6 digits, but we just zeroed it
        // So sum has 0 for checksum bytes; we need to adjust
        for (int i = 0; i < 8; i++) {
            sum -= (header[CHKSUM_OFFSET + i] & 0xFF);
        }
        sum += 8 * 32; // spaces for checksum field
        long expected = sum;
        // Since the checksum field is zero, computeCheckSum should return sum including the zero, but we want to simulate
        // Better to just test the method
        long computed = 0;
        for (byte b : header) {
            computed += (b & 0xFF);
        }
        // Replace checksum with spaces for calculation
        for (int i = CHKSUM_OFFSET; i < CHKSUM_OFFSET + 8; i++) {
            computed -= (header[i] & 0xFF);
            computed += 32;
        }
        assertEquals(computed, TarUtils.computeCheckSum(header));
    }

    @Test
    public void testVerifyCheckSumValid() {
        byte[] header = new byte[512];
        // Set checksum to spaces
        for (int i = CHKSUM_OFFSET; i < CHKSUM_OFFSET + 8; i++) {
            header[i] = (byte) ' ';
        }
        // Compute sum with spaces as checksum
        long sum = 0;
        for (byte b : header) {
            if ((b & 0xFF) == ' ') {
                sum += 32;
            } else {
                sum += (b & 0xFF);
            }
        }
        // Store checksum as octal in the field (first 6 digits)
        String octal = Long.toOctalString(sum);
        // Pad to 6 digits with leading zeros
        String padded = String.format("%6s", octal).replace(' ', '0');
        byte[] octalBytes = padded.getBytes();
        System.arraycopy(octalBytes, 0, header, CHKSUM_OFFSET, 6);
        header[CHKSUM_OFFSET + 6] = 0;
        header[CHKSUM_OFFSET + 7] = ' ';
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSumInvalid() {
        byte[] header = new byte[512];
        assertFalse(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testFormatUnsignedOctalStringZero() {
        byte[] buffer = new byte[10];
        TarUtils.formatUnsignedOctalString(0, buffer, 0, 10);
        assertEquals("0", new String(buffer, 0, 1));
    }

    @Test
    public void testFormatUnsignedOctalStringNonZero() {
        byte[] buffer = new byte[10];
        TarUtils.formatUnsignedOctalString(123L, buffer, 0, 10);
        assertEquals("173", new String(buffer, 0, 3));
    }

    @Test
    public void testFormatUnsignedOctalStringTooLarge() {
        byte[] buffer = new byte[2];
        try {
            TarUtils.formatUnsignedOctalString(100L, buffer, 0, 2);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }
}