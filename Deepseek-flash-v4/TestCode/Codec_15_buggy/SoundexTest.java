package org.apache.commons.codec.language;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.apache.commons.codec.EncoderException;
import org.junit.Test;

public class SoundexTest {

    private final Soundex soundex = new Soundex();

    @Test
    public void testEncodeString() {
        assertEquals("R163", soundex.encode("Robert"));
    }

    @Test
    public void testEncodeObject() throws EncoderException {
        assertEquals("R163", soundex.encode((Object) "Robert"));
    }

    @Test
    public void testEncodeObjectNonString() {
        try {
            soundex.encode((Object) new Object());
            fail("Expected EncoderException");
        } catch (EncoderException e) {
            // expected
        }
    }

    @Test
    public void testDifferenceSameStrings() throws EncoderException {
        assertEquals(4, soundex.difference("Smith", "Smith"));
    }

    @Test
    public void testDifferenceDifferentStrings() throws EncoderException {
        assertEquals(0, soundex.difference("Robert", "Ashcraft"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidMappingCharacter() {
        soundex.encode("abc9");
    }

    @Test
    public void testNullInput() {
        assertNull(soundex.soundex(null));
        assertNull(soundex.encode((String) null));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", soundex.soundex(""));
        assertEquals("", soundex.soundex("   "));
    }

    @Test
    public void testSingleCharacter() {
        assertEquals("A000", soundex.soundex("A"));
    }

    @Test
    public void testHWRule() {
        assertEquals("A261", soundex.soundex("Ashcraft"));
        assertEquals("B530", soundex.soundex("Burroughs"));
    }

    @Test
    public void testVowelsPhonemesRule() {
        assertEquals("B500", soundex.soundex("B"));
        assertEquals("R163", soundex.soundex("Robert"));
    }

    @Test
    public void testCustomMappingConstructor() {
        char[] mapping = new char[26];
        System.arraycopy("01230120022455012623010202".toCharArray(), 0, mapping, 0, 26);
        Soundex custom = new Soundex(mapping);
        assertEquals("R163", custom.encode("Robert"));
    }

    @Test
    public void testStringMappingConstructor() {
        Soundex custom = new Soundex("01230120022455012623010202");
        assertEquals("R163", custom.encode("Robert"));
    }

    @Test
    public void testClearSameCodeSeparatedByH() {
        assertEquals("B000", soundex.soundex("BB"));
        assertEquals("B000", soundex.soundex("BH"));
    }
}