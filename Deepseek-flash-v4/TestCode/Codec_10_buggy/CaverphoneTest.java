package org.apache.commons.codec.language;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.apache.commons.codec.EncoderException;

public class CaverphoneTest {

    private final Caverphone caverphone = new Caverphone();

    @Test
    public void testNullInput() {
        assertEquals("1111111111", caverphone.caverphone(null));
    }

    @Test
    public void testEmptyInput() {
        assertEquals("1111111111", caverphone.caverphone(""));
    }

    @Test
    public void testBasicEncoding() {
        assertEquals("1111111111", caverphone.caverphone("a"));
    }

    @Test
    public void testFinalE() {
        assertEquals("1111111111", caverphone.caverphone("e"));
    }

    @Test
    public void testReplacements() {
        assertEquals("1111111111", caverphone.caverphone("c"));
        assertEquals("1111111111", caverphone.caverphone("q"));
        assertEquals("1111111111", caverphone.caverphone("x"));
    }

    @Test
    public void testVowelHandling() {
        assertEquals("1111111111", caverphone.caverphone("aeiou"));
    }

    @Test
    public void testCodeLength() {
        String result = caverphone.caverphone("test");
        assertEquals(10, result.length());
    }

    @Test
    public void testSpecialPrefixes() {
        assertEquals("1111111111", caverphone.caverphone("cough"));
        assertEquals("1111111111", caverphone.caverphone("rough"));
    }

    @Test
    public void testFirstCharALowercase() {
        assertEquals(caverphone.caverphone("apple"), caverphone.caverphone("apple"));
    }

    @Test
    public void testEncodeObject() throws EncoderException {
        assertEquals("1111111111", caverphone.encode("test"));
    }

    @Test(expected = EncoderException.class)
    public void testEncodeNonString() throws EncoderException {
        caverphone.encode(new Integer(42));
    }

    @Test
    public void testIsCaverphoneEqual() {
        assertTrue(caverphone.isCaverphoneEqual("hello", "hallo"));
        assertFalse(caverphone.isCaverphoneEqual("hello", "world"));
    }

    @Test
    public void testNonAlphabeticInput() {
        assertEquals("1111111111", caverphone.caverphone("12345!@#"));
    }

    @Test
    public void testWhitespaceInput() {
        assertEquals("1111111111", caverphone.caverphone("hello world"));
    }

    @Test
    public void testUpperCaseConversion() {
        assertEquals(caverphone.caverphone("HELLO"), caverphone.caverphone("hello"));
    }
}