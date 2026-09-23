package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertNotNull;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import org.junit.Test;

public class CharSequenceTranslatorTest {

    // Concrete implementation for testing abstract class
    private static class TestTranslator extends CharSequenceTranslator {
        private final int consumedPerCall;
        private final String replacement;

        TestTranslator(int consumedPerCall, String replacement) {
            this.consumedPerCall = consumedPerCall;
            this.replacement = replacement;
        }

        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            if (index >= input.length()) {
                return 0;
            }
            // Handle surrogate pairs correctly
            int codePoint = Character.codePointAt(input, index);
            String hex = hex(codePoint);
            out.write(replacement != null ? replacement + hex : hex);
            return Character.charCount(codePoint);
        }
    }

    private static class ZeroConsumingTranslator extends CharSequenceTranslator {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            return 0;
        }
    }

    private static class ExceptionTranslator extends CharSequenceTranslator {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            throw new IOException("Test IO Exception");
        }
    }

    @Test
    public void testTranslateWithNullInput() {
        CharSequenceTranslator translator = new TestTranslator(1, "x");
        assertNull(translator.translate((CharSequence) null));
    }

    @Test
    public void testTranslateNormalCase() {
        CharSequenceTranslator translator = new TestTranslator(1, "&");
        assertEquals("&61", translator.translate("a"));
        assertEquals("&62&63", translator.translate("bc"));
    }

    @Test
    public void testTranslateWithEmptyString() {
        CharSequenceTranslator translator = new TestTranslator(1, "");
        assertEquals("", translator.translate(""));
    }

    @Test
    public void testTranslateWithSurrogatePair() {
        // Test emoji (surrogate pair)
        String emoji = "😀";
        CharSequenceTranslator translator = new TestTranslator(1, "&#");
        String result = translator.translate(emoji);
        assertNotNull(result);
        assertEquals("&#1f600", result.toLowerCase());
    }

    @Test
    public void testTranslateToWriter() throws IOException {
        CharSequenceTranslator translator = new TestTranslator(1, "x");
        StringWriter writer = new StringWriter();
        translator.translate("hello", writer);
        assertEquals("x68x65x6cx6cx6f", writer.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTranslateWithNullWriter() throws IOException {
        CharSequenceTranslator translator = new TestTranslator(1, "x");
        translator.translate("test", (Writer) null);
    }

    @Test
    public void testTranslateWithNullInputToWriter() throws IOException {
        CharSequenceTranslator translator = new TestTranslator(1, "x");
        StringWriter writer = new StringWriter();
        translator.translate(null, writer);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateWithZeroConsumption() {
        CharSequenceTranslator translator = new ZeroConsumingTranslator();
        assertNotNull(translator.translate("test"));
        assertEquals("test", translator.translate("test"));
    }

    @Test
    public void testTranslateWithIOException() {
        CharSequenceTranslator translator = new ExceptionTranslator();
        try {
            translator.translate("test");
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertEquals("java.io.IOException: Test IO Exception", e.getMessage());
        }
    }

    @Test
    public void testWithSingleTranslator() {
        CharSequenceTranslator translator = new TestTranslator(1, "a");
        CharSequenceTranslator combined = translator.with(new TestTranslator(1, "b"));
        assertNotNull(combined);
    }

    @Test
    public void testWithMultipleTranslators() {
        CharSequenceTranslator translator = new TestTranslator(1, "a");
        CharSequenceTranslator combined = translator.with(
            new TestTranslator(1, "b"), 
            new TestTranslator(1, "c")
        );
        assertNotNull(combined);
    }

    @Test
    public void testHex() {
        assertEquals("61", CharSequenceTranslator.hex(97));
        assertEquals("1F600", CharSequenceTranslator.hex(128512));
        assertEquals("ABC", CharSequenceTranslator.hex(2748));
        assertEquals("0", CharSequenceTranslator.hex(0));
    }

    @Test
    public void testHexWithUppercase() {
        assertEquals("FF", CharSequenceTranslator.hex(255));
        assertEquals("DEADBEEF", CharSequenceTranslator.hex(3735928559L));
    }

    @Test
    public void testTranslateWithRepeatedChar() {
        CharSequenceTranslator translator = new TestTranslator(1, "x");
        assertEquals("x61x61x61", translator.translate("aaa"));
    }

    @Test
    public void testTranslateWithMultipleTypes() {
        CharSequenceTranslator translator = new TestTranslator(1, "&#");
        assertEquals("&#61&#62", translator.translate("ab"));
    }

    @Test
    public void testTranslateWithNullReplacement() {
        CharSequenceTranslator translator = new TestTranslator(1, null);
        assertNotNull(translator.translate("hello"));
    }

    @Test
    public void testWithWithNullArray() {
        CharSequenceTranslator translator = new TestTranslator(1, "x");
        try {
            translator.with((CharSequenceTranslator[]) null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testTranslateWithTabChar() {
        CharSequenceTranslator translator = new TestTranslator(1, "\\t");
        assertEquals("\\t68", translator.translate("h"));
    }

    @Test
    public void testTranslateWithUnicodeChar() {
        CharSequenceTranslator translator = new TestTranslator(1, "u");
        assertEquals("u20ac", translator.translate("€"));
    }

    @Test
    public void testTranslateWithChineseCharacters() {
        CharSequenceTranslator translator = new TestTranslator(1, "&#");
        assertEquals("&#4e2d", translator.translate("中"));
    }

    @Test
    public void testTranslateWithJapaneseCharacters() {
        CharSequenceTranslator translator = new TestTranslator(1, "&#");
        assertEquals("&#30ab", translator.translate("カ"));
    }

    @Test
    public void testTranslateWithKoreanCharacters() {
        CharSequenceTranslator translator = new TestTranslator(1, "&#");
        assertEquals("&#1102", translator.translate("ю"));
    }

    @Test
    public void testTranslateWithRussianCharacters() {
        CharSequenceTranslator translator = new TestTranslator(1, "&#");
        assertEquals("&#1102", translator.translate("ю"));
    }

    @Test
    public void testTranslateWithArabicCharacters() {
        CharSequenceTranslator translator = new TestTranslator(1, "&#");
        assertEquals("&#627", translator.translate("ا"));
    }

    @Test
    public void testTranslateWithHebrewCharacters() {
        CharSequenceTranslator translator = new TestTranslator(1, "&#");
        assertEquals("&#1488", translator.translate("א"));
    }

    @Test
    public void testTranslateWithAccentedCharacters() {
        CharSequenceTranslator translator = new TestTranslator(1, "&#");
        assertEquals("&#e9", translator.translate("é"));
    }
}