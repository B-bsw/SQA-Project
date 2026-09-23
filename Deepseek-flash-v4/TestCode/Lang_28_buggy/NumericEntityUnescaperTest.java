package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class NumericEntityUnescaperTest {

    private NumericEntityUnescaper unescaper;
    private StringWriter writer;

    @Before
    public void setUp() {
        unescaper = new NumericEntityUnescaper();
        writer = new StringWriter();
    }

    @After
    public void tearDown() {
        unescaper = null;
        writer = null;
    }

    @Test
    public void testTranslateDecimalEntity() throws IOException {
        int result = unescaper.translate("&#65;", 0, writer);
        Assert.assertEquals(5, result);
        Assert.assertEquals("A", writer.toString());
    }

    @Test
    public void testTranslateHexEntityLowercase() throws IOException {
        int result = unescaper.translate("&#x41;", 0, writer);
        Assert.assertEquals(6, result);
        Assert.assertEquals("A", writer.toString());
    }

    @Test
    public void testTranslateHexEntityUppercase() throws IOException {
        int result = unescaper.translate("&#X41;", 0, writer);
        Assert.assertEquals(6, result);
        Assert.assertEquals("A", writer.toString());
    }

    @Test
    public void testTranslateEntityWithMultipleDigits() throws IOException {
        int result = unescaper.translate("&#128;", 0, writer);
        Assert.assertEquals(7, result);
        Assert.assertEquals("\u0080", writer.toString());
    }

    @Test
    public void testTranslateNoEntityAtIndex() throws IOException {
        int result = unescaper.translate("abc&#65;", 3, writer);
        Assert.assertEquals(0, result);
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateEntityAtStartButIndexBeyond() throws IOException {
        int result = unescaper.translate("abc", 3, writer);
        Assert.assertEquals(0, result);
        Assert.assertEquals("", writer.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testTranslateWithIndexAtEnd() throws IOException {
        unescaper.translate("abc", 3, writer);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testTranslateWithInvalidHex() throws IOException {
        unescaper.translate("&#xZZ;", 0, writer);
    }

    @Test
    public void testTranslateNotAnEntityJustAmpersand() throws IOException {
        int result = unescaper.translate("&#;", 0, writer);
        Assert.assertEquals(0, result);
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void testTranslateEntityWithoutSemicolonReturnsZero() throws IOException {
        int result = unescaper.translate("&#65", 0, writer);
        Assert.assertEquals(0, result);
        Assert.assertEquals("", writer.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testTranslateWithEmptyInputAtIndexZero() throws IOException {
        unescaper.translate("", 0, writer);
    }

    @Test
    public void testTranslateEntityAtNonZeroStart() throws IOException {
        int result = unescaper.translate("abc&#65;def", 3, writer);
        Assert.assertEquals(5, result);
        Assert.assertEquals("A", writer.toString());
    }

    @Test
    public void testTranslateHexEntityAtNonZeroStart() throws IOException {
        int result = unescaper.translate("abc&#x1F600;def", 3, writer);
        Assert.assertEquals(10, result);
        Assert.assertEquals("\uD83D\uDE00", writer.toString());
    }

    @Test(expected = NumberFormatException.class)
    public void testTranslateHexExceedsIntegerRange() throws IOException {
        unescaper.translate("&#xFFFFFFFFF;", 0, writer);
    }

    @Test(expected = NumberFormatException.class)
    public void testTranslateDecimalExceedsIntegerRange() throws IOException {
        unescaper.translate("&#4294967296;", 0, writer);
    }
}