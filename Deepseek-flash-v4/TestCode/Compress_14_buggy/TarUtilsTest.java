package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;

public class TarUtilsTest {
    private byte[] buf;

    @Before
    public void setUp() {
        buf = new byte[64];
    }

    @After
    public void tearDown() {
        buf = null;
    }

    @Test
    public void testParseOctal_whenLengthLessThanTwo_throwsIllegalArgumentException() {
        try {
            TarUtils.parseOctal(new byte[]{'0'}, 0, 1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Length 1 must be at least 2", e.getMessage());
        }
    }

    @Test
    public void testParseOctal_whenBufferAllNUL_returnsZero() {
        byte[] buffer = new byte[]{0, 0, 0, 0, 0, 0};
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctal_whenValidOctal_returnsValue() {
        byte[] buffer = "0000421 ".getBytes();
        assertEquals(273L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctal_whenInvalidByte_throwsIllegalArgumentException() {
        byte[] buffer = "0000A21 ".getBytes();
        try {
            TarUtils.parseOctal(buffer, 0, buffer.length);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Invalid byte"));
        }
    }

    @Test
    public void testParseOctal_whenTrailingSpaceMissing_throwsIllegalArgumentException() {
        byte[] buffer = "0000421".getBytes();
        try {
            TarUtils.parseOctal(buffer, 0, buffer.length);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Invalid byte"));
        }
    }

    @Test
    public void testParseOctal_whenLeadingNUL_returnsZero() {
        byte[] buffer = new byte[]{0, '0', '0', '1', '0', ' ', 0};
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, 7));
    }

    @Test
    public void testFormatUnsignedOctalString_whenValueFits_returnsCorrectString() {
        byte[] buf = new byte[5];
        TarUtils.formatUnsignedOctalString(123, buf, 0, buf.length);
        assertEquals("00173", new String(buf));
    }

    @Test
    public void testFormatUnsignedOctalString_whenValueTooLarge_throwsIllegalArgumentException() {
        byte[] buf = new byte[2];
        try {
            TarUtils.formatUnsignedOctalString(1239, buf, 0, 2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("will not fit"));
        }
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_whenOctalFits_returnsUpdatedOffset() {
        byte[] dest = new byte[10];
        int result = TarUtils.formatLongOctalOrBinaryBytes(100L, dest, 0, 10);
        assertEquals(10, result);
        assertEquals((byte) ' ', dest[8]);
        assertEquals((byte) 0, dest[9]);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_whenBinaryFits_returnsUpdatedOffset() {
        byte[] dest = new byte[10];
        long value = (1L << 30) + 10;
        int result = TarUtils.formatLongOctalOrBinaryBytes(value, dest, 0, 10);
        assertEquals(10, result);
        assertEquals((byte) 0x80, (byte) (dest[0] & 0x80));
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_whenValueTooLarge_throwsIllegalArgumentException() {
        byte[] dest = new byte[4];
        long value = (1L << 32) + 1;
        try {
            TarUtils.formatLongOctalOrBinaryBytes(value, dest, 0, 4);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("too large"));
        }
    }

    @Test
    public void testParseBoolean_whenByteIsOne_returnsTrue() {
        assertTrue(TarUtils.parseBoolean(new byte[]{1}, 0));
    }

    @Test
    public void testParseBoolean_whenByteIsZero_returnsFalse() {
        assertFalse(TarUtils.parseBoolean(new byte[]{0}, 0));
    }

    @Test
    public void testParseBoolean_ignoresLeadingSpacesAndNULs() {
        assertTrue(TarUtils.parseBoolean(new byte[]{' ', 0, 1}, 2));
        assertFalse(TarUtils.parseBoolean(new byte[]{0, ' ', 0}, 2));
    }

    @Test
    public void testParseBoolean_whenByteInvalid_returnsFalse() {
        assertFalse(TarUtils.parseBoolean(new byte[]{2}, 0));
    }

    @Test
    public void testFormatOctalBytes_withValueWritesCorrectly() {
        byte[] target = new byte[10];
        int updatedOffset = TarUtils.formatOctalBytes(273L, target, 0, 10);
        assertEquals(10, updatedOffset);
        assertEquals("0000000421 ", new String(target, 0, 10));
    }

    @Test
    public void testFormatOctalBytes_whenBufferTooShort_throwsIllegalArgumentException() {
        byte[] target = new byte[4];
        try {
            TarUtils.formatOctalBytes(123456789L, target, 0, 4);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("will not fit"));
        }
    }

    @Test
    public void testFormatNameBytes_whenNameShorterThanBuffer_padsWithNULs() {
        byte[] target = new byte[10];
        int result = TarUtils.formatNameBytes("abc", target, 0, 10);
        assertEquals(10, result);
        assertEquals("abc", new String(target, 0, 3));
        for (int i = 3; i < 10; i++) {
            assertEquals(0, target[i]);
        }
    }

    @Test
    public void testFormatNameBytes_whenNameLongerThanBuffer_truncates() {
        byte[] target = new byte[3];
        int result = TarUtils.formatNameBytes("abcdef", target, 0, 3);
        assertEquals(3, result);
        assertEquals("abc", new String(target));
    }

    @Test
    public void testFormatNameBytes_whenNameExactlyFits_returnsCorrectLength() {
        byte[] target = new byte[3];
        int result = TarUtils.formatNameBytes("abc", target, 0, 3);
        assertEquals(3, result);
        assertEquals("abc", new String(target));
    }

    @Test
    public void testParseName_stopsAtFirstNUL() {
        byte[] input = new byte[]{'a', 'b', 0, 'c', 0};
        assertEquals("ab", TarUtils.parseName(input, 0, 5));
    }

    @Test
    public void testParseName_whenNoNUL_returnsEntireBuffer() {
        byte[] input = "hello".getBytes();
        assertEquals("hello", TarUtils.parseName(input, 0, 5));
    }

    @Test
    public void testFormatNameBytes_withSingleCharName() {
        byte[] target = new byte[5];
        int result = TarUtils.formatNameBytes("x", target, 0, 5);
        assertEquals(5, result);
        assertEquals("x", new String(target, 0, 1));
        for (int i = 1; i < 5; i++) {
            assertEquals(0, target[i]);
        }
    }

    @Test
    public void testFormatOctalBytes_whenValueZero_writesCorrectly() {
        byte[] target = new byte[4];
        TarUtils.formatLongOctalBytes(0, target, 0, 4);
        assertEquals("0 \u0000", new String(target));
    }

    @Test
    public void testFormatLongOctalBytes_whenValueZero_returnsOffset() {
        assertEquals(4, TarUtils.formatLongOctalBytes(0, new byte[4], 0, 4));
    }

    @Test
    public void testFormatLongOctalBytes_whenValueFits_containsTrailingSpaceAndNUL() {
        byte[] target = new byte[4];
        int result = TarUtils.formatLongOctalBytes(7, target, 0, 4);
        assertEquals(4, result);
        assertEquals("7 \u0000", new String(target));
    }

    @Test
    public void testParseOctal_whenBufferIsSingleCharZero_returnsZero() {
        byte[] input = new byte[]{'0', ' ', ' '};
        assertEquals(0, TarUtils.parseOctal(input, 0, 3));
    }
}