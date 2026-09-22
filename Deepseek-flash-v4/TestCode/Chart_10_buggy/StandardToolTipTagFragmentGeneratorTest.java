package org.jfree.chart.imagemap;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Assert;

public class StandardToolTipTagFragmentGeneratorTest {

    private StandardToolTipTagFragmentGenerator generator;

    @Before
    public void setUp() {
        generator = new StandardToolTipTagFragmentGenerator();
    }

    @After
    public void tearDown() {
        generator = null;
    }

    @Test
    public void testGenerateToolTipFragment_NormalText() {
        String result = generator.generateToolTipFragment("Hello World");
        Assert.assertEquals(" title=\"Hello World\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_EmptyText() {
        String result = generator.generateToolTipFragment("");
        Assert.assertEquals(" title=\"\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_SpecialCharacters() {
        String result = generator.generateToolTipFragment("<test&\"value\">");
        Assert.assertEquals(" title=\"<test&\"value\">\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_SingleCharacter() {
        String result = generator.generateToolTipFragment("x");
        Assert.assertEquals(" title=\"x\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_SpacesOnly() {
        String result = generator.generateToolTipFragment("   ");
        Assert.assertEquals(" title=\"   \" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_HtmlContent() {
        String result = generator.generateToolTipFragment("<b>Bold</b>");
        Assert.assertEquals(" title=\"<b>Bold</b>\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_NullInput() {
        String result = generator.generateToolTipFragment(null);
        Assert.assertEquals(" title=\"null\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_LongText() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append("a");
        }
        String longText = sb.toString();
        String result = generator.generateToolTipFragment(longText);
        Assert.assertTrue(result.startsWith(" title=\""));
        Assert.assertTrue(result.endsWith("\" alt=\"\""));
        Assert.assertEquals(longText.length() + 18, result.length());
    }

    @Test
    public void testGenerateToolTipFragment_QuotationMarks() {
        String result = generator.generateToolTipFragment("\"quoted\"");
        Assert.assertEquals(" title=\"\"quoted\"\" alt=\"\"", result);
    }
}