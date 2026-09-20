package org.apache.commons.lang3.text.translate;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class LookupTranslatorTest {

    @Test
    public void constructor_givenNullLookup_shouldInitializeWithoutException() {
        // Arrange & Act
        LookupTranslator translator = new LookupTranslator((CharSequence[][]) null);

        // Assert
        Assert.assertNotNull(translator);
    }

    @Test
    public void constructor_givenEmptyLookup_shouldInitializeWithoutException() {
        // Arrange & Act
        LookupTranslator translator = new LookupTranslator(new CharSequence[0][0]);

        // Assert
        Assert.assertNotNull(translator);
    }

    @Test
    public void translate_givenNullLookup_shouldReturnZeroAndNotWrite() throws IOException {
        // Arrange
        LookupTranslator translator = new LookupTranslator((CharSequence[][]) null);
        StringWriter writer = new StringWriter();

        // Act
        int consumed = translator.translate("test", 0, writer);

        // Assert
        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void translate_givenEmptyLookup_shouldReturnZeroAndNotWrite() throws IOException {
        // Arrange
        LookupTranslator translator = new LookupTranslator(new CharSequence[0][0]);
        StringWriter writer = new StringWriter();

        // Act
        int consumed = translator.translate("test", 0, writer);

        // Assert
        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void translate_givenExactMatchAtBeginning_shouldWriteTranslationAndReturnLength() throws IOException {
        // Arrange
        CharSequence[][] lookup = new CharSequence[][] {
            new CharSequence[] { "foo", "bar" }
        };
        LookupTranslator translator = new LookupTranslator(lookup);
        StringWriter writer = new StringWriter();

        // Act
        int consumed = translator.translate("foobar", 0, writer);

        // Assert
        Assert.assertEquals(3, consumed);
        Assert.assertEquals("bar", writer.toString());
    }

    @Test
    public void translate_givenMatchAtMiddleIndex_shouldWriteTranslationAndReturnLength() throws IOException {
        // Arrange
        CharSequence[][] lookup = new CharSequence[][] {
            new CharSequence[] { "two", "2" }
        };
        LookupTranslator translator = new LookupTranslator(lookup);
        StringWriter writer = new StringWriter();

        // Act
        int consumed = translator.translate("onetwothree", 3, writer);

        // Assert
        Assert.assertEquals(3, consumed);
        Assert.assertEquals("2", writer.toString());
    }

    @Test
    public void translate_givenGreedyMatchingPrefix_shouldMatchLongestPrefix() throws IOException {
        // Arrange
        CharSequence[][] lookup = new CharSequence[][] {
            new CharSequence[] { "ab", "1" },
            new CharSequence[] { "abc", "2" }
        };
        LookupTranslator translator = new LookupTranslator(lookup);
        StringWriter writer = new StringWriter();

        // Act
        int consumed = translator.translate("abcd", 0, writer);

        // Assert
        Assert.assertEquals(3, consumed);
        Assert.assertEquals("2", writer.toString());
    }

    @Test
    public void translate_givenShorterMatchWhenLongerFails_shouldFallbackToShorter() throws IOException {
        // Arrange
        CharSequence[][] lookup = new CharSequence[][] {
            new CharSequence[] { "ab", "1" },
            new CharSequence[] { "abcd", "2" }
        };
        LookupTranslator translator = new LookupTranslator(lookup);
        StringWriter writer = new StringWriter();

        // Act
        int consumed = translator.translate("abce", 0, writer);

        // Assert
        Assert.assertEquals(2, consumed);
        Assert.assertEquals("1", writer.toString());
    }

    @Test
    public void translate_givenNoMatchingSequence_shouldReturnZeroAndNotWrite() throws IOException {
        // Arrange
        CharSequence[][] lookup = new CharSequence[][] {
            new CharSequence[] { "abc", "xyz" }
        };
        LookupTranslator translator = new LookupTranslator(lookup);
        StringWriter writer = new StringWriter();

        // Act
        int consumed = translator.translate("def", 0, writer);

        // Assert
        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void translate_givenIndexNearEndOfInput_shouldAdjustMaxAndMatch() throws IOException {
        // Arrange
        CharSequence[][] lookup = new CharSequence[][] {
            new CharSequence[] { "end", "fin" },
            new CharSequence[] { "verylongstring", "long" }
        };
        LookupTranslator translator = new LookupTranslator(lookup);
        StringWriter writer = new StringWriter();

        // Act
        int consumed = translator.translate("the_end", 4, writer);

        // Assert
        Assert.assertEquals(3, consumed);
        Assert.assertEquals("fin", writer.toString());
    }

    @Test
    public void translate_givenIndexAtEndOfInput_shouldReturnZero() throws IOException {
        // Arrange
        CharSequence[][] lookup = new CharSequence[][] {
            new CharSequence[] { "a", "1" }
        };
        LookupTranslator translator = new LookupTranslator(lookup);
        StringWriter writer = new StringWriter();

        // Act
        int consumed = translator.translate("hello", 5, writer);

        // Assert
        Assert.assertEquals(0, consumed);
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void translate_givenMultipleLookups_shouldCorrectlyTranslateDifferentKeys() throws IOException {
        // Arrange
        CharSequence[][] lookup = new CharSequence[][] {
            new CharSequence[] { "red", "color_red" },
            new CharSequence[] { "blue", "color_blue" },
            new CharSequence[] { "green", "color_green" }
        };
        LookupTranslator translator = new LookupTranslator(lookup);

        StringWriter writer1 = new StringWriter();
        StringWriter writer2 = new StringWriter();
        StringWriter writer3 = new StringWriter();

        // Act
        int consumed1 = translator.translate("red", 0, writer1);
        int consumed2 = translator.translate("blue", 0, writer2);
        int consumed3 = translator.translate("green", 0, writer3);

        // Assert
        Assert.assertEquals(3, consumed1);
        Assert.assertEquals("color_red", writer1.toString());

        Assert.assertEquals(4, consumed2);
        Assert.assertEquals("color_blue", writer2.toString());

        Assert.assertEquals(5, consumed3);
        Assert.assertEquals("color_green", writer3.toString());
    }

    @Test
    public void translate_givenEmptyKeyInLookup_shouldMatchEmptySequence() throws IOException {
        // Arrange
        CharSequence[][] lookup = new CharSequence[][] {
            new CharSequence[] { "", "EMPTY" }
        };
        LookupTranslator translator = new LookupTranslator(lookup);
        StringWriter writer = new StringWriter();

        // Act
        int consumed = translator.translate("test", 0, writer);

        // Assert
        Assert.assertEquals(0, consumed);
        Assert.assertEquals("EMPTY", writer.toString());
    }

    @Test(expected = IOException.class)
    public void translate_givenIOExceptionFromWriter_shouldPropagateIOException() throws IOException {
        // Arrange
        CharSequence[][] lookup = new CharSequence[][] {
            new CharSequence[] { "error", "throw" }
        };
        LookupTranslator translator = new LookupTranslator(lookup);
        Writer failingWriter = new Writer() {
            public void write(char[] cbuf, int off, int len) throws IOException {
                throw new IOException("Simulated I/O failure");
            }

            public void flush() throws IOException {
            }

            public void close() throws IOException {
            }
        };

        // Act
        translator.translate("error_input", 0, failingWriter);
    }

    @Test(expected = NullPointerException.class)
    public void translate_givenNullWriterOnMatch_shouldThrowNullPointerException() throws IOException {
        // Arrange
        CharSequence[][] lookup = new CharSequence[][] {
            new CharSequence[] { "match", "found" }
        };
        LookupTranslator translator = new LookupTranslator(lookup);

        // Act
        translator.translate("match", 0, (Writer) null);
    }

    @Test
    public void translate_givenNullWriterOnNoMatch_shouldReturnZeroWithoutThrowing() throws IOException {
        // Arrange
        CharSequence[][] lookup = new CharSequence[][] {
            new CharSequence[] { "match", "found" }
        };
        LookupTranslator translator = new LookupTranslator(lookup);

        // Act
        int consumed = translator.translate("nomatch", 0, (Writer) null);

        // Assert
        Assert.assertEquals(0, consumed);
    }
}