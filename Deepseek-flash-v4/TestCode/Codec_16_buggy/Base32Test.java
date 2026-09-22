package org.apache.commons.codec.binary;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.apache.commons.codec.binary.BaseNCodec.Context;

public class Base32Test {

    private Base32 base32;
    private Context context;

    @Before
    public void setUp() {
        base32 = new Base32();
        context = new Context();
    }

    @After
    public void tearDown() {
        base32 = null;
        context = null;
    }

    private byte[] stringToBytes(String str) {
        byte[] bytes = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            bytes[i] = (byte) str.charAt(i);
        }
        return bytes;
    }

    private String bytesToString(byte[] bytes, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append((char) bytes[i]);
        }
        return sb.toString();
    }

    @Test
    public void testDefaultConstructor() {
        assertNotNull(new Base32());
        assertNotNull(new Base32());
    }

    @Test
    public void testConstructorWithPad() {
        assertNotNull(new Base32((byte) '='));
        assertNotNull(new Base32(true));
        assertNotNull(new Base32(true, (byte) '='));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidLineLengthNoSeparator() {
        new Base32(10, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorLineSeparatorContainsBase32Char() {
        new Base32(10, new byte[]{'A'});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidPad() {
        new Base32(false, (byte)'A');
    }

    @Test
    public void testIsInAlphabet() {
        base32 = new Base32();
        assertTrue(base32.isInAlphabet((byte)'A'));
        assertTrue(base32.isInAlphabet((byte)'Z'));
        assertTrue(base32.isInAlphabet((byte)'2'));
        assertTrue(base32.isInAlphabet((byte)'7'));
        assertFalse(base32.isInAlphabet((byte)'0'));
        assertFalse(base32.isInAlphabet((byte)'1'));
        assertFalse(base32.isInAlphabet((byte)'-'));
        assertFalse(base32.isInAlphabet((byte)0));
        assertFalse(base32.isInAlphabet((byte)255));
        assertFalse(base32.isInAlphabet((byte)'a'));
    }

    @Test
    public void testIsInAlphabetHex() {
        base32 = new Base32(true);
        assertTrue(base32.isInAlphabet((byte)'0'));
        assertTrue(base32.isInAlphabet((byte)'9'));
        assertTrue(base32.isInAlphabet((byte)'N'));
        assertTrue(base32.isInAlphabet((byte)'V'));
        assertFalse(base32.isInAlphabet((byte)'B'));
        assertFalse(base32.isInAlphabet((byte)'Z'));
    }

    @Test
    public void testEncodeBasicNoLineLength() {
        base32 = new Base32();
        byte[] input = stringToBytes("foo");
        byte[] output = new byte[10];
        Context ctx = new Context();
        ctx.pos = 0;
        ctx.currentLinePos = 0;
        ctx.modulus = 0;
        ctx.lbitWorkArea = 0;
        base32.encode(input, 0, input.length, ctx);
        assertEquals(10, ctx.pos);
        assertEquals("MZXW6===", bytesToString(output, ctx.pos));
        assertEquals(8, ctx.currentLinePos);
        assertEquals(0, ctx.modulus);
    }

    @Test
    public void testEncodeSimpleInput() {
        base32 = new Base32();
        byte[] input = stringToBytes("A");
        byte[] output = new byte[10];
        Context ctx = new Context();
        ctx.pos = 0;
        ctx.currentLinePos = 0;
        ctx.modulus = 0;
        ctx.lbitWorkArea = 0;
        base32.encode(input, 0, input.length, ctx);
        assertEquals(8, ctx.pos);
        assertEquals("IE======", bytesToString(output, ctx.pos));
        assertEquals(8, ctx.currentLinePos);
        assertEquals(1, ctx.modulus);
    }

    @Test
    public void testEncodeTwoBytes() {
        base32 = new Base32();
        byte[] input = stringToBytes("ab");
        byte[] output = new byte[10];
        Context ctx = new Context();
        ctx.pos = 0;
        ctx.currentLinePos = 0;
        ctx.modulus = 0;
        ctx.lbitWorkArea = 0;
        base32.encode(input, 0, input.length, ctx);
        assertEquals(10, ctx.pos);
        assertEquals("MFRGG===", bytesToString(output, ctx.pos));
        assertEquals(2, ctx.modulus);
    }

    @Test
    public void testEncodeModulus3() {
        base32 = new Base32();
        byte[] input = stringToBytes("abc");
        byte[] output = new byte[10];
        Context ctx = new Context();
        ctx.pos = 0;
        ctx.currentLinePos = 0;
        ctx.modulus = 0;
        ctx.lbitWorkArea = 0;
        base32.encode(input, 0, input.length, ctx);
        assertEquals(10, ctx.pos);
        assertEquals("MFRGGZBR", bytesToString(output, ctx.pos));
        assertEquals(3, ctx.modulus);
    }

    @Test
    public void testEncodeModulus4() {
        base32 = new Base32();
        byte[] input = stringToBytes("abcd");
        byte[] output = new byte[10];
        Context ctx = new Context();
        ctx.pos = 0;
        ctx.currentLinePos = 0;
        ctx.modulus = 0;
        ctx.lbitWorkArea = 0;
        base32.encode(input, 0, input.length, ctx);
        assertEquals(10, ctx.pos);
        assertEquals("MFRGGZDF", bytesToString(output, ctx.pos));
        assertEquals(4, ctx.modulus);
    }

    @Test
    public void testEncodeEmptyInput() {
        base32 = new Base32();
        byte[] input = new byte[0];
        byte[] output = new byte[10];
        Context ctx = new Context();
        ctx.pos = 0;
        ctx.currentLinePos = 0;
        ctx.modulus = 0;
        ctx.lbitWorkArea = 0;
        base32.encode(input, 0, 0, ctx);
        assertEquals(0, ctx.pos);
        assertEquals(0, ctx.currentLinePos);
        assertEquals(0, ctx.modulus);
    }

    @Test
    public void testEncodeEofContext() {
        base32 = new Base32();
        byte[] input = new byte[0];
        byte[] output = new byte[10];
        Context ctx = new Context();
        ctx.eof = true;
        ctx.pos = 0;
        ctx.currentLinePos = 0;
        ctx.modulus = 2;
        ctx.lbitWorkArea = 0x123456;
        base32.encode(input, 0, 0, ctx);
        assertEquals(1, ctx.pos);
        assertEquals(0, ctx.modulus);
    }

    @Test
    public void testEncodeEofModulus3() {
        base32 = new Base32();
        byte[] input = new byte[0];
        byte[] output = new byte[10];
        Context ctx = new Context();
        ctx.eof = true;
        ctx.pos = 0;
        ctx.currentLinePos = 0;
        ctx.modulus = 3;
        ctx.lbitWorkArea = 0x123456;
        base32.encode(input, 0, 0, ctx);
        assertEquals(2, ctx.pos);
    }

    @Test
    public void testEncodeEofModulus4() {
        base32 = new Base32();
        byte[] input = new byte[0];
        byte[] output = new byte[10];
        Context ctx = new Context();
        ctx.eof = true;
        ctx.pos = 0;
        ctx.currentLinePos = 0;
        ctx.modulus = 4;
        ctx.lbitWorkArea = 0x123456;
        base32.encode(input, 0, 0, ctx);
        assertEquals(3, ctx.pos);
    }

    @Test
    public void testEncodeEofModulus5() {
        base32 = new Base32();
        byte[] input = new byte[0];
        byte[] output = new byte[10];
        Context ctx = new Context();
        ctx.eof = true;
        ctx.pos = 0;
        ctx.currentLinePos = 0;
        ctx.modulus = 5;
        ctx.lbitWorkArea = 0x123456;
        base32.encode(input, 0, 0, ctx);
        assertEquals(4, ctx.pos);
    }

    @Test
    public void testEncodeEofModulus6() {
        base32 = new Base32();
        byte[] input = new byte[0];
        byte[] output = new byte[10];
        Context ctx = new Context();
        ctx.eof = true;
        ctx.pos = 0;
        ctx.currentLinePos = 0;
        ctx.modulus = 6;
        ctx.lbitWorkArea = 0x123456;
        base32.encode(input, 0, 0, ctx);
        assertEquals(5, ctx.pos);
    }

    @Test
    public void testEncodeEofModulus7() {
        base32 = new Base32();
        byte[] input = new byte[0];
        byte[] output = new byte[10];
        Context ctx = new Context();
        ctx.eof = true;
        ctx.pos = 0;
        ctx.currentLinePos = 0;
        ctx.modulus = 7;
        ctx.lbitWorkArea = 0x123456;
        base32.encode(input, 0, 0, ctx);
        assertEquals(6, ctx.pos);
    }

    @Test(expected = IllegalStateException.class)
    public void testEncodeEofInvalidModulus() {
        base32 = new Base32();
        byte[] input = new byte[0];
        byte[] output = new byte[10];
        Context ctx = new Context();
        ctx.eof = true;
        ctx.pos = 0;
        ctx.currentLinePos = 0;
        ctx.modulus = 8;
        ctx.lbitWorkArea = 0x123456;
        base32.encode(input, 0, 0, ctx);
    }

    @Test
    public void testEncodeWithLineLength() {
        base32 = new Base32(8, new byte[]{'\r', '\n'});
        byte[] input = stringToBytes("foobar");
        byte[] output = new byte[20];
        Context ctx = new Context();
        ctx.pos = 0;
        ctx.currentLinePos = 0;
        ctx.modulus = 0;
        ctx.lbitWorkArea = 0;
        base32.encode(input, 0, input.length, ctx);
        assertEquals(12, ctx.pos);
        assertEquals(8, ctx.currentLinePos);
    }

    @Test
    public void testEncodeWithLineLengthExceeded() {
        base32 = new Base32(4, new byte[]{'\r', '\n'});
        byte[] input = stringToBytes("foobar");
        byte[] output = new byte[20];
        Context ctx = new Context();
        ctx.pos = 0;
        ctx.currentLinePos = 0;
        ctx.modulus = 0;
        ctx.lbitWorkArea = 0;
        base32.encode(input, 0, input.length, ctx);
        assertEquals(16, ctx.pos);
        assertEquals(0, ctx.currentLinePos);
    }

    @Test
    public void testDecodeEof() {
        base32 = new Base32();
        byte[] input = new byte[0];
        Context ctx = new Context();
        ctx.eof = true;
        base32.decode(input, 0, -1, ctx);
        assertTrue(ctx.eof);
    }

    @Test
    public void testDecodeSimpleInput() {
        base32 = new Base32();
        byte[] input = stringToBytes("MZXW6===");
        byte[] output = new byte[10];
        Context ctx = new Context();
        ctx.pos = 0;
        ctx.modulus = 0;
        ctx.lbitWorkArea = 0;
        base32.decode(input, 0, input.length, ctx);
        assertEquals(3, ctx.pos);
        assertEquals(0, ctx.modulus);
    }

    @Test
    public void testDecodeWithPadEarlyTermination() {
        base32 = new Base32();
        byte[] input = stringToBytes("MZ==");
        byte[] output = new byte[10];
        Context ctx = new Context();
        ctx.pos = 0;
        ctx.modulus = 0;
        ctx.lbitWorkArea = 0;
        base32.decode(input, 0, input.length, ctx);
        assertEquals(1, ctx.pos);
        assertEquals(2, ctx.modulus);
    }

    @Test
    public void testDecodeInvalidByteIgnored() {
        base32 = new Base32();
        byte[] input = stringToBytes("!MZ");
        byte[] output = new byte[10];
        Context ctx = new Context();
        ctx.pos = 0;
        ctx.modulus = 0;
        ctx.lbitWorkArea = 0;
        base32.decode(input, 0, input.length, ctx);
        assertEquals(0, ctx.modulus);
    }
}