package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import org.junit.Assert;
import org.junit.Test;

public class CharSequenceTranslatorTest {

    private static class PassThroughTranslator extends CharSequenceTranslator {
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            return 0;
        }
    }

    private static class ReplaceTranslator extends CharSequenceTranslator {
        private final char target;
        private final String replacement;

        public ReplaceTranslator(char target, String replacement) {
            this.target = target;
            this.replacement = replacement;
        }

        public int translate(CharSequence input, int index, Writer out) throws IOException {
            if (input.charAt(index) == this.target) {
                out.write(this.replacement);
                return 1;
            }
            return 0;
        }
    }

    private static class SurrogatePairConsumingTranslator extends CharSequenceTranslator {
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            int codePoint = Character.codePointAt(input, index);
            if (Character.isSupplementaryCodePoint(codePoint)) {
                out.write("[SUPPLEMENTARY]");
                return 1;
            }
            return 0;
        }
    }

    private static class FaultyTranslator extends CharSequenceTranslator {
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            throw new IOException("Simulated IO failure");
        }
    }

    private static class CustomFaultyWriter extends Writer {
        public void write(char[] cbuf, int off, int len) throws IOException {
            throw new IOException("Writer write error");
        }

        public void flush() throws IOException {
            throw new IOException("Writer flush error");
        }

        public void close() throws IOException {
            throw new IOException("Writer close error");
        }
    }

    @Test
    public void translate_givenNullCharSequence_shouldReturnNull() {
        CharSequenceTranslator translator = new PassThroughTranslator();
        String result = translator.translate((CharSequence) null);
        Assert.assertNull(result);
    }

    @Test
    public void translate_givenEmptyCharSequence_shouldReturnEmptyString() {
        CharSequenceTranslator translator = new PassThroughTranslator();
        String result = translator.translate("");
        Assert.assertEquals("", result);
    }

    @Test
    public void translate_givenPassThrough_shouldEchoAllCharacters() {
        CharSequenceTranslator translator = new PassThroughTranslator();
        String result = translator.translate("HelloWorld");
        Assert.assertEquals("HelloWorld", result);
    }

    @Test
    public void translate_givenReplacingTranslator_shouldReplaceMatchingCharacters() {
        CharSequenceTranslator translator = new ReplaceTranslator('a', "XYZ");
        String result = translator.translate("banana");
        Assert.assertEquals("bXYZnXYZnXYZ", result);
    }

    @Test
    public void translate_givenSurrogatePairWithZeroConsumption_shouldPreserveSurrogatePair() {
        CharSequenceTranslator translator = new PassThroughTranslator();
        String surrogatePair = "\uD83D\uDE00";
        String input = "A" + surrogatePair + "B";

        String result = translator.translate(input);
        Assert.assertEquals(input, result);
    }

    @Test
    public void translate_givenSurrogatePairWithConsumption_shouldConsumeProperSurrogatePair() {
        CharSequenceTranslator translator = new SurrogatePairConsumingTranslator();
        String surrogatePair = "\uD83D\uDE00";
        String input = "A" + surrogatePair + "B";

        String result = translator.translate(input);
        Assert.assertEquals("A[SUPPLEMENTARY]B", result);
    }

    @Test
    public void translate_givenTranslatorThrowsIOException_shouldWrapInRuntimeException() {
        CharSequenceTranslator translator = new FaultyTranslator();
        try {
            translator.translate("Test");
            Assert.fail("Expected RuntimeException was not thrown");
        } catch (RuntimeException re) {
            Assert.assertNotNull(re.getCause());
            Assert.assertTrue(re.getCause() instanceof IOException);
            Assert.assertEquals("Simulated IO failure", re.getCause().getMessage());
        }
    }

    @Test
    public void translateToWriter_givenNullWriter_shouldThrowIllegalArgumentException() throws IOException {
        CharSequenceTranslator translator = new PassThroughTranslator();
        try {
            translator.translate("Test", null);
            Assert.fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException iae) {
            Assert.assertEquals("The Writer must not be null", iae.getMessage());
        }
    }

    @Test
    public void translateToWriter_givenNullInput_shouldNotWriteAnything() throws IOException {
        CharSequenceTranslator translator = new PassThroughTranslator();
        StringWriter writer = new StringWriter();

        translator.translate(null, writer);
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void translateToWriter_givenCustomWriterProducingIOException_shouldRethrowIOException() {
        CharSequenceTranslator translator = new PassThroughTranslator();
        Writer faultyWriter = new CustomFaultyWriter();
        try {
            translator.translate("Fail", faultyWriter);
            Assert.fail("Expected IOException was not thrown");
        } catch (IOException ioe) {
            Assert.assertEquals("Writer write error", ioe.getMessage());
        }
    }

    @Test
    public void with_givenEmptyAdditionalTranslators_shouldReturnNonNullMergedTranslator() {
        CharSequenceTranslator translator = new PassThroughTranslator();
        CharSequenceTranslator merged = translator.with(new CharSequenceTranslator[0]);
        Assert.assertNotNull(merged);
    }

    @Test
    public void with_givenMultipleTranslators_shouldReturnWorkingMergedTranslator() {
        CharSequenceTranslator t1 = new ReplaceTranslator('a', "A");
        CharSequenceTranslator t2 = new ReplaceTranslator('b', "B");
        CharSequenceTranslator merged = t1.with(new CharSequenceTranslator[] { t2 });

        Assert.assertNotNull(merged);
        String result = merged.translate("ab");
        Assert.assertEquals("AB", result);
    }

    @Test
    public void hex_givenZero_shouldReturnZeroString() {
        String result = CharSequenceTranslator.hex(0);
        Assert.assertEquals("0", result);
    }

    @Test
    public void hex_givenPositiveCodepoint_shouldReturnUpperCaseHex() {
        String result = CharSequenceTranslator.hex(10);
        Assert.assertEquals("A", result);

        result = CharSequenceTranslator.hex(255);
        Assert.assertEquals("FF", result);

        result = CharSequenceTranslator.hex(0x1f600);
        Assert.assertEquals("1F600", result);
    }
}