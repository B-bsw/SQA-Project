package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TarUtilsTest {

    private byte[] buf;
    private static final int BUFFER_SIZE = 32;

    @Before
    public void setUp() {
        buf = new byte[BUFFER_SIZE];
    }

    @Test
    public void testParseOctalNormalCase() {
        byte[] data = "     17 ".getBytes();
        assertEquals(15L, TarUtils.parseOctal(data, 0, data.length));
    }

    @Test
    public void testParseOctalWithNulTerminator() {
        byte[] data = "000123\0".getBytes();
        assertEquals(83L, TarUtils.parseOctal(data, 0, data.length));
    }

    @Test
    public void testParseOctalAllNulls() {
        byte[] data = new byte[8];
        assertEquals(0L, TarUtils.parseOctal(data, 0, data.length));
    }

    @Test
    public void testParseOctalInvalidCharacter() {
        byte[] data = "12a7 ".getBytes();
        try {
            TarUtils.parseOctal(data, 0, data.length);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid byte 97 at offset 2 in '12a7 ' len=5", e.getMessage());
        }
    }

    @Test
    public void testParseNameNormalCase() {
        byte[] data = "hello\0world".getBytes();
        assertEquals("hello", TarUtils.parseName(data, 0, data.length));
    }

    @Test
    public void testParseNameExactLength() {
        byte[] data = "abcdefgh".getBytes();
        assertEquals("abcdefgh", TarUtils.parseName(data, 0, data.length));
    }

    @Test
    public void testParseNameWithNull() {
        byte[] data = new byte[5];
        data[0] = 'a';
        data[1] = 'b';
        data[2] = 0;
        data[3] = 'c';
        data[4] = 'd';
        assertEquals("ab", TarUtils.parseName(data, 0, data.length));
    }

    @Test
    public void testFormatNameBytesShorterThanBuffer() {
        int result = TarUtils.formatNameBytes("test", buf, 0, 10);
        assertEquals(10, result);
        byte[] expected = new byte[10];
        expected[0] = 't';
        expected[1] = 'e';
        expected[2] = 's';
        expected[3] = 't';
        for (int i = 4; i < expected.length; i++) {
            expected[i] = 0;
        }
        assertArrayEquals(expected, buf);
    }

    @Test
    public void testFormatNameBytesExactlyFit() {
        int result = TarUtils.formatNameBytes("abcdefgh", buf, 0, 8);
        assertEquals(8, result);
        byte[] expected = "abcdefgh".getBytes();
        assertArrayEquals(expected, buf);
    }

    @Test
    public void testFormatNameBytesLongerThanBuffer() {
        int result = TarUtils.formatNameBytes("abcdefghij", buf, 0, 5);
        assertEquals(5, result);
        byte[] expected = "abcde".getBytes();
        assertArrayEquals(expected, buf);
    }

    @Test
    public void testFormatUnsignedOctalStringZero() {
        TarUtils.formatUnsignedOctalString(0, buf, 0, 8);
        byte[] expected = "00000000".getBytes();
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], buf[i]);
        }
    }

    @Test
    public void testFormatUnsignedOctalStringPositive() {
        TarUtils.formatUnsignedOctalString(64, buf, 0, 8);
        byte[] expected = "00000100".getBytes();
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], buf[i]);
        }
    }

    @Test
    public void testFormatUnsignedOctalStringMaxFit() {
        TarUtils.formatUnsignedOctalString(0777777L, buf, 0, 8);
        byte[] expected = "0777777 ".getBytes();
        for (int i = 0; i < expected.length; i++) {
            assertEquals("Position " + i, expected[i], buf[i]);
        }
    }

    @Test
    public void testFormatUnsignedOctalStringTooLarge() {
        try {
            TarUtils.formatUnsignedOctalString(01000000L, buf, 0, 8);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("262144=1000000 will not fit in octal number buffer of length 8", e.getMessage());
        }
    }

    @Test
    public void testFormatOctalBytesNormal() {
        int result = TarUtils.formatOctalBytes(8, buf, 0, 8);
        assertEquals(8, result);
        byte[] expected = new byte[8];
        expected[6] = '1';
        expected[7] = ' ';
        expected[6] = '1';
        expected[7] = ' ';
        // Actually formatOctalBytes writes octet string then space and null
        // Let's manually construct expected: value 8 -> "000010" + space + null
        // Since length-2 = 6 for octal string, then buf[6]=' ', buf[7]=0
        byte[] manualExpected = new byte[8];
        manualExpected[5] = '1';
        manualExpected[6] = ' ';
        manualExpected[7] = 0;
        // Careful: formatUnsignedOctalString writes leading zeros, so buffer[0..5] = '0', buffer[5]='1'
        // Actually "000010" -> positions 0-5: '0','0','0','0','1','0'
        // But let's check: formatUnsignedOctalString(value, buf, offset, idx) with idx=length-2=6
        // It writes octal digits into buf[offset..offset+idx-1], so buf[0..5] = "000010"
        for (int i = 0; i < 6; i++) {
            assertEquals("Pos " + i, (byte) ((i == 5) ? '1' : '0'), buf[i]);
        }
        assertEquals(' ', buf[6]);
        assertEquals(0, buf[7]);
    }

    @Test
    public void testFormatOctalBytesFitsExactly() {
        int result = TarUtils.formatOctalBytes(07777777777L, buf, 0, 12);
        assertEquals(12, result);
        // Check last two bytes: space and null
        assertEquals(' ', buf[10]);
        assertEquals(0, buf[11]);
        // Check some octal digits
        assertEquals('7', buf[9]);
    }

    @Test
    public void testFormatOctalBytesTooLargeForBuffer() {
        try {
            // 8 octal digits would need 10 bytes (8 digits + space + null)
            TarUtils.formatOctalBytes(010000000000L, buf, 0, 10);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testFormatCheckSumOctalBytesNormal() {
        int result = TarUtils.formatCheckSumOctalBytes(10, buf, 0, 8);
        assertEquals(8, result);
        byte[] expected = new byte[8];
        expected[5] = '1';
        expected[6] = ' ';
        expected[7] = 0;
        for (int i = 0; i < 6; i++) {
            if (i == 5) {
                assertEquals('1', buf[i]);
            } else {
                assertEquals('0', buf[i]);
            }
        }
        assertEquals(' ', buf[6]);
        assertEquals(0, buf[7]);
    }

    @Test
    public void testFormatCheckSumOctalBytesEdgeValue() {
        int result = TarUtils.formatCheckSumOctalBytes(0, buf, 0, 8);
        assertEquals(8, result);
        // All zeros except space and null
        for (int i = 0; i < 6; i++) {
            assertEquals("Pos " + i, '0', buf[i]);
        }
        assertEquals(' ', buf[6]);
        assertEquals(0, buf[7]);
    }

    @Test
    public void testComputeCheckSumAllZeros() {
        byte[] allZeros = new byte[12];
        assertEquals(0L, TarUtils.computeCheckSum(allZeros));
    }

    @Test
    public void testComputeCheckSumMixed() {
        byte[] mixed = new byte[5];
        mixed[0] = 1;
        mixed[1] = 2;
        mixed[2] = 3;
        mixed[3] = 4;
        mixed[4] = 5;
        long sum = 1 + 2 + 3 + 4 + 5;
        assertEquals(sum, TarUtils.computeCheckSum(mixed));
    }

    @Test
    public void testComputeCheckSumNegativeByte() {
        byte[] negative = new byte[2];
        negative[0] = (byte) 0xFF;
        negative[1] = (byte) 0xFF;
        assertEquals(510L, TarUtils.computeCheckSum(negative));
    }

    @Test
    public void testFormatLongOctalBytes() {
        int result = TarUtils.formatLongOctalBytes(10, buf, 0, 8);
        assertEquals(8, result);
        // Check octet and trailer
        byte[] expected = new byte[8];
        expected[5] = '1';
        expected[6] = ' ';
        expected[7] = 0;
        for (int i = 0; i < 6; i++) {
            if (i == 5) {
                assertEquals('1', buf[i]);
            } else {
                assertEquals('0', buf[i]);
            }
        }
        assertEquals(' ', buf[6]);
        assertEquals(0, buf[7]);
    }

    @Test
    public void testParseOctalBoundaryLongest() {
        byte[] data = "77777777 ".getBytes();
        assertEquals(0xFFFFFFL, TarUtils.parseOctal(data, 0, data.length));
    }

    @Test
    public void testParseOctalWithSpacesThenDigits() {
        byte[] data = "   123 ".getBytes();
        assertEquals(83L, TarUtils.parseOctal(data, 0, data.length));
    }

    @Test
    public void testParseOctalLeadingZeros() {
        byte[] data = "00000123 ".getBytes();
        assertEquals(83L, TarUtils.parseOctal(data, 0, data.length));
    }

    @Test
    public void testFormatNameBytesEmptyName() {
        int result = TarUtils.formatNameBytes("", buf, 0, 5);
        assertEquals(5, result);
        byte[] expected = new byte[5];
        assertArrayEquals(expected, buf);
    }
}