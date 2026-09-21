package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.Test;

public class CharSequenceTranslatorTest {

    // A translator that never consumes anything (always returns 0)
    private static class NoOpTranslator extends CharSequenceTranslator {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            return 0;
        }
    }

    // A translator that consumes exactly one codepoint and writes it upper-cased
    private static class UpperCaseTranslator extends CharSequenceTranslator {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            char c = input.charAt(index);
            out.write(Character.toUpperCase(c));
            return 1;
        }
    }

    // A translator that consumes two codepoints at a time (simulate multi-consume)
    private static class DoubleConsumeTranslator extends CharSequenceTranslator {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            if (index + 1 < input.length()) {
                out.write(input.charAt(index));
                out.write(input.charAt(index + 1));
                return 2;
            }
            return 0;
        }
    }

    // A translator that always throws IOException from translate() itself
    private static class ThrowingTranslator extends CharSequenceTranslator {
        @Override
        public int translate(CharSequence input, int index, Writer out) throws IOException {
            throw new IOException("forced failure");
        }
    }

    // ---------- translate(CharSequence) tests ----------

    @Test
    public void testTranslateCharSequence_nullInput() {
        CharSequenceTranslator t = new UpperCaseTranslator();
        assertNull(t.translate((CharSequence) null));
    }

    @Test
    public void testTranslateCharSequence_emptyInput() {
        CharSequenceTranslator t = new UpperCaseTranslator();
        assertEquals("", t.translate(""));
    }

    @Test
    public void testTranslateCharSequence_normalCase() {
        CharSequenceTranslator t = new UpperCaseTranslator();
        assertEquals("ABC", t.translate("abc"));
    }

    @Test
    public void testTranslateCharSequence_noOpTranslatorCopiesChars() {
        CharSequenceTranslator t = new NoOpTranslator();
        assertEquals("hello", t.translate("hello"));
    }

    @Test
    public void testTranslateCharSequence_multipleLoopIterations() {
        CharSequenceTranslator t = new UpperCaseTranslator();
        assertEquals("HELLO WORLD", t.translate("hello world"));
    }

    @Test
    public void testTranslateCharSequence_doubleConsumeTranslator() {
        CharSequenceTranslator t = new DoubleConsumeTranslator();
        assertEquals("abcd", t.translate("abcd"));
    }

    @Test
    public void testTranslateCharSequence_doubleConsumeOddLengthFallsBackToNoOp() {
        // odd length string: last char won't be consumed by pair logic, falls into consumed==0 branch
        CharSequenceTranslator t = new DoubleConsumeTranslator();
        assertEquals("abc", t.translate("abc"));
    }

    @Test(expected = RuntimeException.class)
    public void testTranslateCharSequence_ioExceptionWrappedAsRuntimeException() {
        CharSequenceTranslator t = new ThrowingTranslator();
        t.translate("x");
    }

    // ---------- translate(CharSequence, Writer) tests ----------

    @Test(expected = IllegalArgumentException.class)
    public void testTranslateWriter_nullWriterThrows() throws IOException {
        CharSequenceTranslator t = new UpperCaseTranslator();
        t.translate("abc", (Writer) null);
    }

    @Test
    public void testTranslateWriter_nullInputDoesNothing() throws IOException {
        CharSequenceTranslator t = new UpperCaseTranslator();
        StringWriter writer = new StringWriter();
        t.translate((CharSequence) null, writer);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateWriter_emptyInputZeroLoopIterations() throws IOException {
        CharSequenceTranslator t = new UpperCaseTranslator();
        StringWriter writer = new StringWriter();
        t.translate("", writer);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateWriter_singleLoopIteration() throws IOException {
        CharSequenceTranslator t = new UpperCaseTranslator();
        StringWriter writer = new StringWriter();
        t.translate("a", writer);
        assertEquals("A", writer.toString());
    }

    @Test
    public void testTranslateWriter_multipleLoopIterations() throws IOException {
        CharSequenceTranslator t = new UpperCaseTranslator();
        StringWriter writer = new StringWriter();
        t.translate("abcdef", writer);
        assertEquals("ABCDEF", writer.toString());
    }

    @Test
    public void testTranslateWriter_consumedZeroBranchWritesRawChar() throws IOException {
        CharSequenceTranslator t = new NoOpTranslator();
        StringWriter writer = new StringWriter();
        t.translate("xyz", writer);
        assertEquals("xyz", writer.toString());
    }

    @Test
    public void testTranslateWriter_surrogatePairHandledByNoOp() throws IOException {
        CharSequenceTranslator t = new NoOpTranslator();
        StringWriter writer = new StringWriter();
        String surrogatePair = new String(Character.toChars(0x1F600)); // emoji codepoint
        t.translate(surrogatePair, writer);
        assertEquals(surrogatePair, writer.toString());
    }

    @Test
    public void testTranslateWriter_consumedGreaterThanZeroAdvancesCorrectly() throws IOException {
        CharSequenceTranslator t = new DoubleConsumeTranslator();
        StringWriter writer = new StringWriter();
        t.translate("abcd", writer);
        assertEquals("abcd", writer.toString());
    }

    @Test(expected = IOException.class)
    public void testTranslateWriter_propagatesIOExceptionFromTranslate() throws IOException {
        CharSequenceTranslator t = new ThrowingTranslator();
        StringWriter writer = new StringWriter();
        t.translate("x", writer);
    }

    // ---------- with() tests ----------

    @Test
    public void testWith_mergesTranslatorsAndAppliesFirstMatch() {
        CharSequenceTranslator first = new UpperCaseTranslator();
        CharSequenceTranslator second = new NoOpTranslator();
        CharSequenceTranslator merged = first.with(second);
        assertTrue(merged instanceof AggregateTranslator);
        String result = merged.translate("abc");
        assertEquals("ABC", result);
    }

    @Test
    public void testWith_emptyTranslatorArray() {
        CharSequenceTranslator first = new UpperCaseTranslator();
        CharSequenceTranslator merged = first.with();
        assertTrue(merged instanceof AggregateTranslator);
        assertEquals("ABC", merged.translate("abc"));
    }

    @Test
    public void testWith_multipleTranslators() {
        CharSequenceTranslator first = new NoOpTranslator();
        CharSequenceTranslator second = new NoOpTranslator();
        CharSequenceTranslator third = new UpperCaseTranslator();
        CharSequenceTranslator merged = first.with(second, third);
        assertNotNull(merged);
        assertTrue(merged instanceof AggregateTranslator);
    }

    // ---------- hex() tests ----------

    @Test
    public void testHex_normalCharacter() {
        assertEquals("41", CharSequenceTranslator.hex('A'));
    }

    @Test
    public void testHex_zeroCodepoint() {
        assertEquals("0", CharSequenceTranslator.hex(0));
    }

    @Test
    public void testHex_largeCodepoint() {
        assertEquals("1F600", CharSequenceTranslator.hex(0x1F600));
    }

    @Test
    public void testHex_upperCaseOutput() {
        String hex = CharSequenceTranslator.hex(0xABCDEF);
        assertEquals(hex.toUpperCase(java.util.Locale.ENGLISH), hex);
    }
}