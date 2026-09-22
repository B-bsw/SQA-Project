package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.io.IOException;
import org.apache.commons.compress.archivers.zip.ZipEncoding;

public class TarUtilsTest {
    private static final int BUFFER_SIZE = 100;
    private byte[] buffer;

    @Before
    public void setUp() {
        buffer = new byte[BUFFER_SIZE];
    }

    @After
    public void tearDown() {
        buffer = null;
    }

    @Test
    public void testParseOctalNormal() {
        byte[] buf = "0000755 ".getBytes();
        assertEquals(493, TarUtils.parseOctal(buf, 0, 8));
    }

    @Test
    public void testParseOctalLeadingSpaces() {
        byte[] buf = "   1234 ".getBytes();
        assertEquals(668, TarUtils.parseOctal(buf, 0, 7));
    }

    @Test
    public void testParseOctalEmpty() {
        byte[] buf = "\0\0\0\0".getBytes();
        assertEquals(0, TarUtils.parseOctal(buf, 0, 4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalTooShort() {
        TarUtils.parseOctal("1".getBytes(), 0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalInvalidCharacter() {
        byte[] buf = "123a45 ".getBytes();
        TarUtils.parseOctal(buf, 0, 7);
    }

    @Test
    public void testParseOctalOrBinaryNegativeLong() {
        byte[] buf = {(byte)0xff, (byte)0xff, (byte)0xf0, (byte)0x00,
                      (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00};
        assertEquals(-1048576L, TarUtils.parseOctalOrBinary(buf, 0, 8));
    }

    @Test
    public void testParseOctalOrBinaryPositive() {
        byte[] buf = "0000001 ".getBytes();
        assertEquals(1L, TarUtils.parseOctalOrBinary(buf, 0, 8));
    }

    @Test
    public void testParseBooleanTrue() {
        byte[] buf = {1};
        assertTrue(TarUtils.parseBoolean(buf, 0));
    }

    @Test
    public void testParseBooleanFalse() {
        byte[] buf = {0};
        assertFalse(TarUtils.parseBoolean(buf, 0));
    }

    @Test
    public void testParseNameEmpty() {
        byte[] buf = {0, 0, 0};
        assertEquals("", TarUtils.parseName(buf, 0, 3));
    }

    @Test
    public void testParseNameWithContent() {
        byte[] buf = "hello\0".getBytes();
        assertEquals("hello", TarUtils.parseName(buf, 0, 6));
    }

    @Test
    public void testParseNameWithEncoding() throws IOException {
        byte[] buf = "test\0".getBytes();
        assertEquals("test", TarUtils.parseName(buf, 0, 5,
            TarUtils.DEFAULT_ENCODING));
    }

    @Test
    public void testFormatUnsignedOctalStringZero() {
        TarUtils.formatUnsignedOctalString(0, buffer, 0, 8);
        assertEquals("0", new String(buffer, 0, 8).trim());
    }

    @Test
    public void testFormatUnsignedOctalStringValue() {
        TarUtils.formatUnsignedOctalString(8, buffer, 0, 8);
        assertEquals("10", new String(buffer, 0, 8).trim());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalStringOverflow() {
        byte[] buf = new byte[2];
        TarUtils.formatUnsignedOctalString(64, buf, 0, 2);
    }

    @Test
    public void testFormatOctalBytes() {
        byte[] buf = new byte[10];
        int result = TarUtils.formatOctalBytes(7, buf, 0, 8);
        assertEquals(8, result);
        assertEquals("\0\0\0\0\0\0\7 ", new String(buf, 0, 8));
    }

    @Test
    public void testFormatLongOctalBytes() {
        byte[] buf = new byte[10];
        int result = TarUtils.formatLongOctalBytes(7, buf, 0, 8);
        assertEquals(8, result);
        assertEquals("\0\0\0\0\0\0\7 ", new String(buf, 0, 8));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes() {
        byte[] buf = new byte[8];
        TarUtils.formatLongOctalOrBinaryBytes(10, buf, 0, 8);
        assertEquals(8, TarUtils.parseOctalOrBinary(buf, 0, 8));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesOverflow() {
        byte[] buf = new byte[8];
        TarUtils.formatLongOctalOrBinaryBytes(Long.MAX_VALUE, buf, 0, 8);
        assertEquals(Long.MAX_VALUE, TarUtils.parseOctalOrBinary(buf, 0, 8));
    }

    @Test
    public void testComputeCheckSum() {
        byte[] buf = new byte[512];
        buf[0] = 1;
        buf[511] = 2;
        assertEquals(3, TarUtils.computeCheckSum(buf));
    }

    @Test
    public void testVerifyCheckSum() {
        byte[] header = new byte[512];
        int offset = 0;
        for (int i = 0; i < 8; i++) {
            header[offset + i] = (byte) '0';
        }
        header[148] = (byte) '0';
        header[149] = (byte) '0';
        header[150] = (byte) '0';
        header[151] = (byte) '0';
        header[152] = (byte) '0';
        header[153] = (byte) '0';
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSumInvalid() {
        byte[] header = new byte[512];
        for (int i = 0; i < 512; i++) {
            header[i] = (byte) 0xff;
        }
        assertFalse(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testFormatNameBytes() {
        byte[] buf = new byte[100];
        int result = TarUtils.formatNameBytes("hello", buf, 0, 10);
        assertEquals(10, result);
        assertEquals("hello\0\0\0\0\0", new String(buf, 0, 10));
    }

    @Test
    public void testFormatNameBytesEmpty() {
        byte[] buf = new byte[10];
        int result = TarUtils.formatNameBytes("", buf, 0, 5);
        assertEquals(5, result);
        assertEquals("\0\0\0\0\0", new String(buf, 0, 5));
    }

    @Test
    public void testFormatNameBytesWithEncoding() throws IOException {
        byte[] buf = new byte[100];
        int result = TarUtils.formatNameBytes("test", buf, 0, 10,
            TarUtils.DEFAULT_ENCODING);
        assertEquals(10, result);
        assertEquals("test\0\0\0\0\0\0", new String(buf, 0, 10));
    }

    @Test
    public void testParseOctalZeroLength() {
        byte[] buf = {0, 0, 0};
        assertEquals(0, TarUtils.parseOctal(buf, 0, 3));
    }

    @Test
    public void testParseOctalWithNUL() {
        byte[] buf = {'1', '2', '3', '\0', '4'};
        assertEquals(012, TarUtils.parseOctal(buf, 0, 4));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesZero() {
        byte[] buf = new byte[9];
        TarUtils.formatLongOctalOrBinaryBytes(0, buf, 0, 9);
        assertEquals(9, TarUtils.formatLongOctalBytes(0, buf, 0, 9));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalOrBinaryBytesTooSmall() {
        byte[] buf = new byte[1];
        TarUtils.formatLongOctalOrBinaryBytes(100, buf, 0, 1);
    }
}