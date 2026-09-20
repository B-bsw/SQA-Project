package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.Before;
import org.junit.Test;

public class LookupTranslatorTest {

    private LookupTranslator translator;

    @Before
    public void setUp() {
        CharSequence[][] table = new CharSequence[][] {
                {"one", "1"},
                {"two", "2"},
                {"three", "3"},
                {"a", "A"}
        };
        translator = new LookupTranslator(table);
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructorWithNullLookup() throws IOException {
        LookupTranslator t = new LookupTranslator((CharSequence[][]) null);
        // shortest = Integer.MAX_VALUE, longest = 0 -> max computed as 0
        StringWriter writer = new StringWriter();
        int result = t.translate("anything", 0, writer);
        assertEquals(0, result);
        assertEquals("", writer.toString());
    }

    @Test
    public void testConstructorWithEmptyLookup() throws IOException {
        CharSequence[][] emptyTable = new CharSequence[0][0];
        LookupTranslator t = new LookupTranslator(emptyTable);
        StringWriter writer = new StringWriter();
        int result = t.translate("test", 0, writer);
        assertEquals(0, result);
        assertEquals("", writer.toString());
    }

    @Test
    public void testConstructorWithSingleEntry() throws IOException {
        CharSequence[][] table = new CharSequence[][] {
                {"x", "X"}
        };
        LookupTranslator t = new LookupTranslator(table);
        StringWriter writer = new StringWriter();
        int result = t.translate("x", 0, writer);
        assertEquals(1, result);
        assertEquals("X", writer.toString());
    }

    // ---------- translate() normal case ----------

    @Test
    public void testTranslateMatchFound() throws IOException {
        StringWriter writer = new StringWriter();
        int result = translator.translate("one", 0, writer);
        assertEquals(3, result);
        assertEquals("1", writer.toString());
    }

    @Test
    public void testTranslateMatchFoundAtOffset() throws IOException {
        StringWriter writer = new StringWriter();
        String input = "xtwoy";
        int result = translator.translate(input, 1, writer);
        assertEquals(3, result);
        assertEquals("2", writer.toString());
    }

    @Test
    public void testTranslateGreedyLongestMatch() throws IOException {
        // "three" (len 5) should be matched greedily over any shorter substring match
        StringWriter writer = new StringWriter();
        int result = translator.translate("three", 0, writer);
        assertEquals(5, result);
        assertEquals("3", writer.toString());
    }

    @Test
    public void testTranslateNoMatch() throws IOException {
        StringWriter writer = new StringWriter();
        int result = translator.translate("zzz", 0, writer);
        assertEquals(0, result);
        assertEquals("", writer.toString());
    }

    // ---------- boundary value tests ----------

    @Test
    public void testTranslateIndexPlusLongestExceedsInputLength() throws IOException {
        // longest in translator is 5 ("three"). Input shorter than longest from index.
        StringWriter writer = new StringWriter();
        String input = "a"; // matches single char entry "a" -> "A"
        int result = translator.translate(input, 0, writer);
        assertEquals(1, result);
        assertEquals("A", writer.toString());
    }

    @Test
    public void testTranslateLoopZeroIterations() throws IOException {
        // shortest length in translator is 1 ("a"), so to force zero iterations
        // we need max < shortest. Build a translator whose shortest is larger.
        CharSequence[][] table = new CharSequence[][] {
                {"abc", "X"},
                {"abcdef", "Y"}
        };
        LookupTranslator t = new LookupTranslator(table);
        StringWriter writer = new StringWriter();
        String input = "ab"; // length 2, shortest required is 3 -> max = 2 < shortest=3
        int result = t.translate(input, 0, writer);
        assertEquals(0, result);
        assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateLoopOneIteration() throws IOException {
        CharSequence[][] table = new CharSequence[][] {
                {"ab", "AB"}
        };
        LookupTranslator t = new LookupTranslator(table);
        StringWriter writer = new StringWriter();
        String input = "ab";
        int result = t.translate(input, 0, writer);
        assertEquals(2, result);
        assertEquals("AB", writer.toString());
    }

    @Test
    public void testTranslateLoopMultipleIterations() throws IOException {
        CharSequence[][] table = new CharSequence[][] {
                {"a", "SHORT"},
                {"ab", "MID"},
                {"abc", "LONG"}
        };
        LookupTranslator t = new LookupTranslator(table);
        StringWriter writer = new StringWriter();
        String input = "abcd";
        int result = t.translate(input, 0, writer);
        // Gre