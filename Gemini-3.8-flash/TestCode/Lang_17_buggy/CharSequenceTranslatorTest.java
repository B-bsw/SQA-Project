package org.apache.commons.lang3.text.translate;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class CharSequenceTranslatorTest {

    private static class DummyTranslator extends CharSequenceTranslator {
        private final int consumedCount;
        private final String replacement;

        public DummyTranslator(int consumedCount, String replacement) {
            this.consumedCount = consumedCount;
            this.replacement = replacement;
        }

        public int translate(CharSequence input, int index, Writer out) throws IOException {
            if (consumedCount > 0 && replacement != null) {
                out.write(replacement);
            }
            return consumedCount;
        }
    }

    private static class ExceptionThrowingTranslator extends CharSequenceTranslator {
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            throw new IOException("Simulated IO failure");
        }
    }

    private static class FaultyWriter extends Writer {
        public void write(char[] cbuf, int off, int len) throws IOException {
            throw new IOException("FaultyWriter write failed");
        }

        public void flush() throws IOException {
            throw new IOException("FaultyWriter flush failed");
        }

        public void close() throws IOException {
            throw new IOException("FaultyWriter close failed");
        }
    }

    @Test
    public void translateString_givenNullInput_shouldReturnNull() {
        CharSequenceTranslator translator = new DummyTranslator(0, null);

        String result = translator.translate(null);

        Assert.assertNull(result);
    }

    @Test
    public void translateString_givenEmptyString_shouldReturnEmptyString() {
        CharSequenceTranslator translator = new DummyTranslator(0, null);

        String result = translator.translate("");

        Assert.assertEquals("", result);
    }

    @Test
    public void translateString_givenTranslatorConsumesZero_shouldCopyCharactersVerbatim() {
        CharSequenceTranslator translator = new DummyTranslator(0, null);

        String result = translator.translate("Hello World");

        Assert.assertEquals("Hello World", result);
    }

    @Test
    public void translateString_givenTranslatorConsumesCharacters_shouldOutputReplacement() {
        CharSequenceTranslator translator = new DummyTranslator(1, "X");

        String result = translator.translate("abc");

        Assert.assertEquals("XXX", result);
    }

    @Test
    public void translateString_givenTranslatorThrowsIOException_shouldWrapInRuntimeException() {
        CharSequenceTranslator translator = new ExceptionThrowingTranslator();

        try {
            translator.translate("test");
            Assert.fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException ex) {
            Assert.assertNotNull(ex.getCause());
            Assert.assertTrue(ex.getCause() instanceof IOException);
            Assert.assertEquals("Simulated IO failure", ex.getCause().getMessage());
        }
    }

    @Test
    public void translateWriter_givenNullWriter_shouldThrowIllegalArgumentException() throws IOException {
        CharSequenceTranslator translator = new DummyTranslator(0, null);

        try {
            translator.translate("Hello", (Writer) null);
            Assert.fail("Expected IllegalArgumentException for null Writer");
        } catch (IllegalArgumentException ex) {
            Assert.assertEquals("The Writer must not be null", ex.getMessage());
        }
    }

    @Test
    public void translateWriter_givenNullInput_shouldReturnWithoutWriting() throws IOException {
        CharSequenceTranslator translator = new DummyTranslator(0, null);
        StringWriter writer = new StringWriter();

        translator.translate(null, writer);

        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void translateWriter_givenEmptyInput_shouldProduceEmptyOutput() throws IOException {
        CharSequenceTranslator translator = new DummyTranslator(0, null);
        StringWriter writer = new StringWriter();

        translator.translate("", writer);

        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void translateWriter_givenFaultyWriterAndZeroConsumed_shouldPropagateIOException() {
        CharSequenceTranslator translator = new DummyTranslator(0, null);
        Writer faultyWriter = new FaultyWriter();

        try {
            translator.translate("data", faultyWriter);
            Assert.fail("Expected IOException to be thrown");
        } catch (IOException ex) {
            Assert.assertEquals("FaultyWriter write failed", ex.getMessage());
        }
    }

    @Test
    public void translateWriter_givenFaultyWriterAndPositiveConsumed_shouldPropagateIOException() {
        CharSequenceTranslator translator = new DummyTranslator(1, "replacement");
        Writer faultyWriter = new FaultyWriter();

        try {
            translator.translate("data", faultyWriter);
            Assert.fail("Expected IOException to be thrown");
        } catch (IOException ex) {
            Assert.assertEquals("FaultyWriter write failed", ex.getMessage());
        }
    }

    @Test
    public void translateWriter_givenConsumedGreaterThanOneAndPosLessThanLenMinusTwo_shouldAdvanceCorrectly() throws IOException {
        // len is 6, index 0 is translated consuming 3 code points (< 6 - 2 = 4)
        CharSequenceTranslator translator = new CharSequenceTranslator() {
            public int translate(CharSequence input, int index, Writer out) throws IOException {
                if (index == 0) {
                    out.write("REPLACED");
                    return 3;
                }
                return 0;
            }
        };
        StringWriter writer = new StringWriter();

        translator.translate("abcdef", writer);

        Assert.assertEquals("REPLACEDdef", writer.toString());
    }

    @Test
    public void translateWriter_givenConsumedGreaterThanOneAndPosGreaterOrEqualLenMinusTwo_shouldAdvanceCorrectly() throws IOException {
        // len is 3, index 1: pos is 1, len - 2 is 1 (pos is not < len - 2), so hits else pos++ branch
        CharSequenceTranslator translator = new CharSequenceTranslator() {
            public int translate(CharSequence input, int index, Writer out) throws IOException {
                if (index == 1) {
                    out.write("Z");
                    return 2;
                }
                return 0;
            }
        };
        StringWriter writer = new StringWriter();

        translator.translate("abc", writer);

        Assert.assertEquals("aZ", writer.toString());
    }

    @Test
    public void translateWriter_givenSupplementaryCharactersAndConsumedZero_shouldWriteSurrogatePairCorrectly() throws IOException {
        // U+1F600 consists of high surrogate \uD83D and low surrogate \uDE00
        String surrogatePair = "\uD83D\uDE00";
        CharSequenceTranslator translator = new DummyTranslator(0, null);
        StringWriter writer = new StringWriter();

        translator.translate(surrogatePair, writer);

        Assert.assertEquals(surrogatePair, writer.toString());
    }

    @Test
    public void translateWriter_givenSupplementaryCharactersAndConsumedPositive_shouldAdvanceAcrossSurrogates() throws IOException {
        // "\uD83D\uDE00ABC" has 4 codepoints (len = 4). index 0 has Character.charCount == 2.
        // At pos 0: pos < 4 - 2 (0 < 2 is true), advances by Character.charCount(codePointAt(0)) which is 2.
        final String input = "\uD83D\uDE00ABC";
        CharSequenceTranslator translator = new CharSequenceTranslator() {
            public int translate(CharSequence in, int index, Writer out) throws IOException {
                if (index == 0) {
                    out.write("EMOJI_REPLACED");
                    return 1;
                }
                return 0;
            }
        };
        StringWriter writer = new StringWriter();

        translator.translate(input, writer);

        Assert.assertEquals("EMOJI_REPLACEDBC", writer.toString());
    }

    @Test
    public void with_givenAdditionalTranslators_shouldReturnAggregateTranslatorMergingThem() {
        CharSequenceTranslator first = new DummyTranslator(0, null);
        CharSequenceTranslator second = new DummyTranslator(1, "B");
        CharSequenceTranslator third = new DummyTranslator(1, "C");

        CharSequenceTranslator combined = first.with(second, third);

        Assert.assertNotNull(combined);
        Assert.assertTrue(combined instanceof AggregateTranslator);
    }

    @Test
    public void with_givenEmptyArray_shouldReturnAggregateTranslatorWithSelfOnly() {
        CharSequenceTranslator translator = new DummyTranslator(0, null);

        CharSequenceTranslator combined = translator.with();

        Assert.assertNotNull(combined);
        Assert.assertTrue(combined instanceof AggregateTranslator);
    }

    @Test
    public void hex_givenZeroCodePoint_shouldReturnUpperZero() {
        String result = CharSequenceTranslator.hex(0);

        Assert.assertEquals("0", result);
    }

    @Test
    public void hex_givenDecimalTen_shouldReturnUpperCaseA() {
        String result = CharSequenceTranslator.hex(10);

        Assert.assertEquals("A", result);
    }

    @Test
    public void hex_givenAsciiCodePoint_shouldReturnExpectedHex() {
        String result = CharSequenceTranslator.hex('z');

        Assert.assertEquals("7A", result);
    }

    @Test
    public void hex_givenLargeCodePoint_shouldReturnUpperCaseHex() {
        String result = CharSequenceTranslator.hex(0x1F600);

        Assert.assertEquals("1F600", result);
    }

    @Test
    public void hex_givenNegativeCodePoint_shouldReturnHexRepresentation() {
        String result = CharSequenceTranslator.hex(-1);

        Assert.assertEquals("FFFFFFFF", result);
    }
}