package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class LookupTranslatorTest {
    private LookupTranslator translator;
    private StringWriter writer;

    @Before
    public void setUp() {
        translator = new LookupTranslator(
            new CharSequence[]{"&lt;", "<"},
            new CharSequence[]{"&gt;", ">"},
            new CharSequence[]{"&amp;", "&"},
            new CharSequence[]{"&quot;", "\""},
            new CharSequence[]{"&#39;", "'"}
        );
        writer = new StringWriter();
    }

    @After
    public void tearDown() {
        writer = null;
        translator = null;
    }

    @Test
    public void testTranslateNormalCase() throws IOException {
        Assert.assertEquals(4, translator.translate("&lt;", 0, writer));
        Assert.assertEquals("<", writer.toString());
    }

    @Test
    public void testTranslateMultipleCharacters() throws IOException {
        Assert.assertEquals(5, translator.translate("&#39;", 0, writer));
        Assert.assertEquals("'", writer.toString());
    }

    @Test
    public void testTranslateNoMatch() throws IOException {
        Assert.assertEquals(0, translator.translate("abc", 0, writer));
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateIndexAtEnd() throws IOException {
        Assert.assertEquals(0, translator.translate("&lt;", 4, writer));
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateIndexBeyondLength() throws IOException {
        Assert.assertEquals(0, translator.translate("&lt;", 5, writer));
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void testTranslatePartialMatch() throws IOException {
        Assert.assertEquals(0, translator.translate("&", 0, writer));
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateExactMatchAtBoundary() throws IOException {
        Assert.assertEquals(4, translator.translate("&lt;remaining", 0, writer));
        Assert.assertEquals("<", writer.toString());
    }

    @Test(expected = java.lang.NullPointerException.class)
    public void testTranslateNullInput() throws IOException {
        translator.translate(null, 0, writer);
    }

    @Test(expected = java.lang.StringIndexOutOfBoundsException.class)
    public void testTranslateNegativeIndex() throws IOException {
        translator.translate("&lt;", -1, writer);
    }

    @Test
    public void testTranslateWithEmptyLookupTable() throws IOException {
        LookupTranslator emptyTranslator = new LookupTranslator();
        StringWriter emptyWriter = new StringWriter();
        Assert.assertEquals(0, emptyTranslator.translate("abc", 0, emptyWriter));
        Assert.assertEquals("", emptyWriter.toString());
    }

    @Test
    public void testTranslateWithNullLookupParameter() throws IOException {
        LookupTranslator nullTranslator = new LookupTranslator((CharSequence[][]) null);
        StringWriter nullWriter = new StringWriter();
        Assert.assertEquals(0, nullTranslator.translate("abc", 0, nullWriter));
        Assert.assertEquals("", nullWriter.toString());
    }

    @Test
    public void testTranslateMultipleEntities() throws IOException {
        Assert.assertEquals(4, translator.translate("&lt;&gt;", 0, writer));
        Assert.assertEquals("<", writer.toString());
    }

    @Test
    public void testTranslateShortestMatchWhenMultipleOptions() throws IOException {
        LookupTranslator multiTranslator = new LookupTranslator(
            new CharSequence[]{"a", "X"},
            new CharSequence[]{"ab", "Y"}
        );
        StringWriter multiWriter = new StringWriter();
        Assert.assertEquals(1, multiTranslator.translate("a", 0, multiWriter));
        Assert.assertEquals("X", multiWriter.toString());
    }

    @Test
    public void testTranslateGreedyMatching() throws IOException {
        LookupTranslator greedyTranslator = new LookupTranslator(
            new CharSequence[]{"&", "&amp;"},
            new CharSequence[]{"&amp;", "&"}
        );
        StringWriter greedyWriter = new StringWriter();
        Assert.assertEquals(5, greedyTranslator.translate("&amp;", 0, greedyWriter));
        Assert.assertEquals("&", greedyWriter.toString());
    }

    @Test
    public void testTranslateIndexInMiddle() throws IOException {
        Assert.assertEquals(4, translator.translate("abc&lt;def", 3, writer));
        Assert.assertEquals("<", writer.toString());
    }

    @Test(expected = IOException.class)
    public void testTranslateWithNullWriter() throws IOException {
        String source = "source";
        String target = "target";
        LookupTranslator nullWriterTranslator = new LookupTranslator(
            new CharSequence[][]{new CharSequence[]{source, target}}
        );
        nullWriterTranslator.translate(source, 0, null);
    }
}