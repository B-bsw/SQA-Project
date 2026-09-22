package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class TarUtilsTest {

    @Before
    public void setUp() {
        // No setup needed for static utility class
    }

    @After
    public void tearDown() {
        // No teardown needed
    }

    // --- parseOctal tests ---

    @Test
    public void testParseOctal_NormalCase() {
        byte[] buffer = "0000755".getBytes();
        assertEquals(493, TarUtils.parseOctal(buffer, 0, 7));
    }

    @Test
    public void testParseOctal_WithSpacesAndNull() {
        byte[] buffer = " 12  \0xxx".getBytes();
        assertEquals(10, TarUtils.parseOctal(buffer, 0, 8));
    }

    @Test
    public void testParseOctal_LeadingSpacesOnly() {
        byte[] buffer = "     ".getBytes();
        assertEquals(0, TarUtils.parseOctal(buffer, 0, 5));
    }

    @Test
    public void testParseOctal_EmptyBuffer() {
        byte[] buffer = new byte[0];
        assertEquals(0, TarUtils.parseOctal(buffer, 0, 0));
    }

    @Test
    public void testParseOctal_AllZeros() {
        byte[] buffer = "0000000".getBytes();
        assertEquals(0, TarUtils.parseOctal(buffer, 0, 7));
    }

    @Test
    public void testParseOctal_InvalidDigit() {
        byte[] buffer = "12a3456".getBytes();
        try {
            TarUtils.parseOctal(buffer, 0, 7);
            fail("Expected IllegalArgumentException for invalid octal digit");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testParseOctal_MaxValue() {
        byte[] buffer = "7777777".getBytes();
        assertEquals(2097151, TarUtils.parseOctal(buffer, 0, 7));
    }

    @Test
    public void testParseOctal_BoundaryLength() {
        byte[] buffer = "0000123".getBytes();
        assertEquals(83, TarUtils.parseOctal(buffer, 0, 7));
        assertEquals(83, TarUtils.parseOctal(buffer, 0, 7));
    }

    @Test
    public void testParseOctal_TrailingSpaceAfterDigits() {
        byte[] buffer = "123    ".getBytes();
        assertEquals(83, TarUtils.parseOctal(buffer, 0, 7));
    }

    // --- parseName tests ---

    @Test
    public void testParseName_NormalCase() {
        byte[] buffer = "hello\0world".getBytes();
        assertEquals("hello", TarUtils.parseName(buffer, 0, 11));
    }

    @Test
    public void testParseName_EmptyString() {
        byte[] buffer = new byte[5];
        assertEquals("", TarUtils.parseName(buffer, 0, 5));
    }

    @Test
    public void testParseName_FullBufferNoNull() {
        byte[] buffer = "abcdefg".getBytes();
        assertEquals("abcdefg", TarUtils.parseName(buffer, 0, 7));
    }

    @Test
    public void testParseName_MaxLength() {
        byte[] buffer = "test\0rest".getBytes();
        assertEquals("test", TarUtils.parseName(buffer, 0, 9));
    }

    @Test
    public void testParseName_BufferOfSpaces() {
        byte[] buffer = "   \0rest".getBytes();
        assertEquals("   ", TarUtils.parseName(buffer, 0, 8));
    }

    // --- formatNameBytes tests ---

    @Test
    public void testFormatNameBytes_NameShorterThanBuffer() {
        byte[] buffer = new byte[10];
        int result = TarUtils.formatNameBytes("ab", buffer, 0, 10);
        assertEquals(10, result);
        assertEquals('a', buffer[0]);
        assertEquals('b', buffer[1]);
        assertEquals((byte) 0, buffer[2]);
        assertEquals((byte) 0, buffer[9]);
    }

    @Test
    public void testFormatNameBytes_NameLongerThanBuffer() {
        byte[] buffer = new byte[5];
        int result = TarUtils.formatNameBytes("abcdefgh", buffer, 0, 5);
        assertEquals(5, result);
        assertEquals('a', buffer[0]);
        assertEquals('e', buffer[4]);
    }

    @Test
    public void testFormatNameBytes_ExactFit() {
        byte[] buffer = new byte[3];
        int result = TarUtils.formatNameBytes("abc", buffer, 0, 3);
        assertEquals(3, result);
        assertEquals('a', buffer[0]);
        assertEquals('c', buffer[2]);
    }

    @Test
    public void testFormatNameBytes_EmptyName() {
        byte[] buffer = new byte[4];
        int result = TarUtils.formatNameBytes("", buffer, 1, 3);
        assertEquals(4, result);
        assertEquals((byte) 0, buffer[1]);
        assertEquals((byte) 0, buffer[3]);
    }

    @Test
    public void testFormatNameBytes_OffsetWithinBuffer() {
        byte[] buffer = new byte[8];
        int result = TarUtils.formatNameBytes("xy", buffer, 2, 3);
        assertEquals(5, result);
        assertEquals('x', buffer[2]);
        assertEquals('y', buffer[3]);
        assertEquals((byte) 0, buffer[4]);
    }

    // --- formatUnsignedOctalString (indirectly via formatOctalBytes) ---

    @Test
    public void testFormatUnsignedOctalString_ZeroValue() {
        byte[] buffer = new byte[5];
        TarUtils.formatUnsignedOctalString(0, buffer, 0, 5);
        // After formatting, remaining becomes -1, and the loop fills with '0'
        // But direct testing is not exposed, so we test through formatOctalBytes
    }

    // --- formatOctalBytes tests ---

    @Test
    public void testFormatOctalBytes_NormalValue() {
        byte[] buffer = new byte[10];
        int result = TarUtils.formatOctalBytes(64, buffer, 0, 10);
        assertEquals(10, result);
        // 64 octal = 100 -> with leading zeros to fill 8 chars: "00000100\0 "
        assertEquals('0', buffer[0]);
        assertEquals('0', buffer[7]);
        assertEquals(' ', buffer[8]);
        assertEquals((byte) 0, buffer[9]);
    }

    @Test
    public void testFormatOctalBytes_ZeroValue() {
        byte[] buffer = new byte[6];
        int result = TarUtils.formatOctalBytes(0, buffer, 0, 6);
        assertEquals(6, result);
        assertEquals('0', buffer[0]);
        assertEquals('0', buffer[3]);
        assertEquals(' ', buffer[4]);
        assertEquals((byte) 0, buffer[5]);
    }

    @Test
    public void testFormatOctalBytes_MinimalLength() {
        byte[] buffer = new byte[4];
        int result = TarUtils.formatOctalBytes(7, buffer, 0, 4);
        assertEquals(4, result);
        assertEquals('7', buffer[0]);
        assertEquals(' ', buffer[1]);
        assertEquals((byte) 0, buffer[2]);
    }

    @Test
    public void testFormatOctalBytes_ValueTooLargeForBuffer() {
        byte[] buffer = new byte[3];
        try {
            TarUtils.formatOctalBytes(100, buffer, 0, 3);
            fail("Expected IllegalArgumentException for buffer too small");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    // --- formatCheckSumOctalBytes tests ---

    @Test
    public void testFormatCheckSumOctalBytes_Normal() {
        byte[] buffer = new byte[10];
        int result = TarUtils.formatCheckSumOctalBytes(8, buffer, 0, 10);
        assertEquals(10, result);
        // 8 octal = 10, with 8 bytes for number: "00000010\0 "
        assertEquals('0', buffer[0]);
        assertEquals('1', buffer[7]);
        assertEquals((byte) 0, buffer[8]);
        assertEquals(' ', buffer[9]);
    }

    @Test
    public void testFormatCheckSumOctalBytes_Zero() {
        byte[] buffer = new byte[5];
        int result = TarUtils.formatCheckSumOctalBytes(0, buffer, 0, 5);
        assertEquals(5, result);
        assertEquals('0', buffer[0]);
        assertEquals(' ', buffer[4]);
    }

    @Test
    public void testFormatCheckSumOctalBytes_MaxOctalValue() {
        byte[] buffer = new byte[8];
        int result = TarUtils.formatCheckSumOctalBytes(63, buffer, 0, 8);
        assertEquals(8, result);
        // 63 octal = 77, buffer length 8 -> number 6 digits: "000077\0 "
        assertEquals('0', buffer[0]);
        assertEquals('7', buffer[5]);
        assertEquals((byte) 0, buffer[6]);
        assertEquals(' ', buffer[7]);
    }

    @Test
    public void testFormatCheckSumOctalBytes_OneByteLength() {
        byte[] buffer = new byte[2];
        try {
            TarUtils.formatCheckSumOctalBytes(1, buffer, 0, 2);
            fail("Expected IllegalArgumentException for too small buffer");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    // --- computeCheckSum tests ---

    @Test
    public void testComputeCheckSum_EmptyBuffer() {
        byte[] buffer = new byte[0];
        assertEquals(0, TarUtils.computeCheckSum(buffer));
    }

    @Test
    public void testComputeCheckSum_SingleByte() {
        byte[] buffer = new byte[] { (byte) 1 };
        assertEquals(1, TarUtils.computeCheckSum(buffer));
    }

    @Test
    public void testComputeCheckSum_MultipleBytes() {
        byte[] buffer = new byte[] { 1, 2, 3 };
        assertEquals(6, TarUtils.computeCheckSum(buffer));
    }

    @Test
    public void testComputeCheckSum_All255() {
        byte[] buffer = new byte[] { (byte) 255, (byte) 255 };
        // 255 + 255 = 510
        assertEquals(510, TarUtils.computeCheckSum(buffer));
    }

    @Test
    public void testComputeCheckSum_MixedValues() {
        byte[] buffer = new byte[] { 0, 127, -1, 128 };
        // 0 + 127 + 255 + 128 = 510
        assertEquals(510, TarUtils.computeCheckSum(buffer));
    }

    @Test
    public void testComputeCheckSum_LargeBuffer() {
        byte[] buffer = new byte[100];
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = (byte) (i % 10);
        }
        long expected = 0;
        for (byte b : buffer) {
            expected += b & 0xFF;
        }
        assertEquals(expected, TarUtils.computeCheckSum(buffer));
    }
}