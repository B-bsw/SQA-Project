package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.Test;

public class CharSequenceTranslatorTest {

    // Concrete implementation for testing abstract class methods
    private static class TestTranslator extends CharSequenceTranslator {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            // Simple translation: consume one codepoint and write 'x'
            char[] chars = Character.toChars(Character.codePointAt(input, index));
            out.write('x');
            return chars.length;
        }
    }

    private static class ZeroConsumeTranslator extends CharSequenceTranslator {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            return 0; // consumes nothing, output nothing
        }
    }

    private static class MultiConsumeTranslator extends CharSequenceTranslator {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            // Consume 2 characters (one surrogate pair)
            out.write('y');
            return 2;
        }
    }

    @Test
    public void testTranslateCharSequence() {
        TestTranslator translator = new TestTranslator();
        assertEquals("x", translator.translate("a"));
        assertEquals("xx", translator.translate("ab"));
        assertEquals("xx", translator.translate("a\uD800\uDC00b")); // surrogate pair, but TestTranslator consumes 1 char
    }

    @Test
    public void testTranslateNullInput() {
        TestTranslator translator = new TestTranslator();
        assertNull(translator.translate(null));
    }

    @Test
    public void testTranslateWithWriter() throws IOException {
        TestTranslator translator = new TestTranslator();
        StringWriter writer = new StringWriter();
        translator.translate("abc", writer);
        assertEquals("xxx", writer.toString());
    }

    @Test
    public void testTranslateWithNullWriter() throws IOException {
        TestTranslator translator = new TestTranslator();
        try {
            translator.translate("abc", (Writer) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testTranslateWithNullInputAndWriter() throws IOException {
        TestTranslator translator = new TestTranslator();
        StringWriter writer = new StringWriter();
        translator.translate(null, writer);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateEmptyString() throws IOException {
        TestTranslator translator = new TestTranslator();
        assertEquals("", translator.translate(""));
        StringWriter writer = new StringWriter();
        translator.translate("", writer);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateZeroConsume() throws IOException {
        ZeroConsumeTranslator translator = new ZeroConsumeTranslator();
        StringWriter writer = new StringWriter();
        translator.translate("abc", writer);
        assertEquals("abc", writer.toString()); // original characters copied
    }

    @Test
    public void testTranslateMultiConsumeSurrogatePair() throws IOException {
        MultiConsumeTranslator translator = new MultiConsumeTranslator();
        StringWriter writer = new StringWriter();
        translator.translate("a\uD800\uDC00b", writer);
        // Surrogate pair consumed, writes 'y', then 'b' consumed by next iteration
        assertEquals("ayb", writer.toString());
    }

    @Test
    public void testWith() {
        TestTranslator translator = new TestTranslator();
        CharSequenceTranslator result = translator.with(new TestTranslator());
        assertEquals("x", ((AggregateTranslator) result).translate("a"));
        assertSame(AggregateTranslator.class, result.getClass());
    }

    @Test(expected = NullPointerException.class)
    public void testWithNullArray() {
        TestTranslator translator = new TestTranslator();
        CharSequenceTranslator result = translator.with((CharSequenceTranslator[]) null);
        // Should throw NPE because translators.length
    }

    @Test
    public void testHex() {
        assertEquals("0", CharSequenceTranslator.hex(0));
        assertEquals("a", CharSequenceTranslator.hex(10));
        assertEquals("ff", CharSequenceTranslator.hex(255));
        assertEquals("abcd", CharSequenceTranslator.hex(0xabcd));
    }

    @Test(expected = RuntimeException.class)
    public void testTranslateIOExceptionWrapped() {
        CharSequenceTranslator translator = new CharSequenceTranslator() {
            @Override
            public int translate(CharSequence input, int index, Writer out) throws IOException {
                throw new IOException("test");
            }
        };
        translator.translate("input");
    }

    @Test
    public void testTranslateWithWriterIOException() throws IOException {
        final Writer failingWriter = new Writer() {
            @Override
            public void write(char[] cbuf, int off, int len) throws IOException {
                throw new IOException("write failed");
            }

            @Override
            public void flush() throws IOException {}

            @Override
            public void close() throws IOException {}
        };

        try {
            CharSequenceTranslator translator = new TestTranslator();
            translator.translate("abc", failingWriter);
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }
}