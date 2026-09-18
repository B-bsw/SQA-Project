package org.jfree.chart.imagemap;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StandardToolTipTagFragmentGeneratorTest {

    @Test
    public void testConstructor() {
        StandardToolTipTagFragmentGenerator generator 
            = new StandardToolTipTagFragmentGenerator();
        assertNotNull(generator);
    }

    @Test
    public void testGenerateToolTipFragment_NormalCase() {
        StandardToolTipTagFragmentGenerator generator 
            = new StandardToolTipTagFragmentGenerator();
        String result = generator.generateToolTipFragment("Hello World");
        assertEquals(" title=\"Hello World\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_EmptyString() {
        StandardToolTipTagFragmentGenerator generator 
            = new StandardToolTipTagFragmentGenerator();
        String result = generator.generateToolTipFragment("");
        assertEquals(" title=\"\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_NullInput() {
        StandardToolTipTagFragmentGenerator generator 
            = new StandardToolTipTagFragmentGenerator();
        String result = generator.generateToolTipFragment(null);
        assertEquals(" title=\"null\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_SpecialCharacters() {
        StandardToolTipTagFragmentGenerator generator 
            = new StandardToolTipTagFragmentGenerator();
        String result = generator.generateToolTipFragment("<script>alert('xss')</script>");
        assertEquals(" title=\"<script>alert('xss')</script>\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_WithQuotes() {
        StandardToolTipTagFragmentGenerator generator 
            = new StandardToolTipTagFragmentGenerator();
        String result = generator.generateToolTipFragment("Say \"Hello\"");
        assertEquals(" title=\"Say \"Hello\"\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_LongString() {
        StandardToolTipTagFragmentGenerator generator 
            = new StandardToolTipTagFragmentGenerator();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append("a");
        }
        String longText = sb.toString();
        String result = generator.generateToolTipFragment(longText);
        assertEquals(" title=\"" + longText + "\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_SingleCharacter() {
        StandardToolTipTagFragmentGenerator generator 
            = new StandardToolTipTagFragmentGenerator();
        String result = generator.generateToolTipFragment("A");
        assertEquals(" title=\"A\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_WhitespaceOnly() {
        StandardToolTipTagFragmentGenerator generator 
            = new StandardToolTipTagFragmentGenerator();
        String result = generator.generateToolTipFragment("   ");
        assertEquals(" title=\"   \" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_NumericString() {
        StandardToolTipTagFragmentGenerator generator 
            = new StandardToolTipTagFragmentGenerator();
        String result = generator.generateToolTipFragment("12345");
        assertEquals(" title=\"12345\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_MultipleCalls() {
        StandardToolTipTagFragmentGenerator generator 
            = new StandardToolTipTagFragmentGenerator();
        String result1 = generator.generateToolTipFragment("First");
        String result2 = generator.generateToolTipFragment("Second");
        assertEquals(" title=\"First\" alt=\"\"", result1);
        assertEquals(" title=\"Second\" alt=\"\"", result2);
    }

    @Test
    public void testImplementsInterface() {
        StandardToolTipTagFragmentGenerator generator 
            = new StandardToolTipTagFragmentGenerator();
        assertNotNull(generator);
        boolean isInstance = generator instanceof ToolTipTagFragmentGenerator;
        assertEquals(true, isInstance);
    }
}