package org.apache.commons.math.complex;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.text.*;
import java.util.Locale;

public class ComplexFormatTest {
    private ComplexFormat format;
    private static final double EPSILON = 1e-10;

    @Before
    public void setUp() {
        format = new ComplexFormat();
    }

    @After
    public void tearDown() {
        format = null;
    }

    @Test
    public void testDefaultConstructor() {
        ComplexFormat f = new ComplexFormat();
        assertEquals("i", f.getImaginaryCharacter());
        assertNotNull(f.getRealFormat());
        assertNotNull(f.getImaginaryFormat());
    }

    @Test
    public void testConstructorWithNumberFormat() {
        NumberFormat nf = NumberFormat.getInstance();
        ComplexFormat f = new ComplexFormat(nf);
        assertEquals("i", f.getImaginaryCharacter());
        assertSame(nf, f.getRealFormat());
        assertNotNull(f.getImaginaryFormat());
    }

    @Test
    public void testConstructorWithTwoNumberFormats() {
        NumberFormat real = NumberFormat.getInstance();
        NumberFormat imag = NumberFormat.getInstance();
        ComplexFormat f = new ComplexFormat(real, imag);
        assertEquals("i", f.getImaginaryCharacter());
        assertSame(real, f.getRealFormat());
        assertSame(imag, f.getImaginaryFormat());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNullImaginaryCharacter() {
        new ComplexFormat(null, NumberFormat.getInstance(), NumberFormat.getInstance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithEmptyImaginaryCharacter() {
        new ComplexFormat("", NumberFormat.getInstance(), NumberFormat.getInstance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNullRealFormat() {
        new ComplexFormat("i", null, NumberFormat.getInstance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNullImaginaryFormat() {
        new ComplexFormat("i", NumberFormat.getInstance(), null);
    }

    @Test
    public void testFormatPositiveComplex() {
        Complex c = new Complex(12.5, 3.75);
        String result = format.format(c);
        assertTrue(result.contains("12.5"));
        assertTrue(result.contains("+"));
        assertTrue(result.contains("3.75i"));
    }

    @Test
    public void testFormatNegativeImaginary() {
        Complex c = new Complex(5.0, -2.5);
        String result = format.format(c);
        assertTrue(result.contains("5"));
        assertTrue(result.contains("-"));
        assertTrue(result.contains("2.5i"));
    }

    @Test
    public void testFormatZeroImaginary() {
        Complex c = new Complex(7.0, 0.0);
        String result = format.format(c);
        assertFalse(result.contains("+"));
        assertFalse(result.contains("-"));
        assertEquals("7", result.trim());
    }

    @Test
    public void testFormatNaNImaginary() {
        Complex c = new Complex(1.0, Double.NaN);
        String result = format.format(c);
        assertTrue(result.contains("+"));
        assertTrue(result.contains("NaN"));
    }

    @Test
    public void testFormatNaNReal() {
        Complex c = new Complex(Double.NaN, 1.0);
        String result = format.format(c);
        assertTrue(result.contains("(NaN)"));
    }

    @Test
    public void testFormatInfiniteImaginary() {
        Complex c = new Complex(1.0, Double.POSITIVE_INFINITY);
        String result = format.format(c);
        assertTrue(result.contains("(Infinity)"));
    }

    @Test
    public void testFormatNegativeInfiniteReal() {
        Complex c = new Complex(Double.NEGATIVE_INFINITY, 0.0);
        String result = format.format(c);
        assertTrue(result.contains("(-Infinity)"));
    }

    @Test
    public void testFormatComplexObject() {
        Complex c = new Complex(3.0, 4.0);
        StringBuffer sb = new StringBuffer();
        StringBuffer result = (StringBuffer) format.format(c, sb, new FieldPosition(0));
        assertSame(sb, result);
        assertTrue(result.length() > 0);
    }

    @Test
    public void testFormatNumberObject() {
        StringBuffer sb = new StringBuffer();
        StringBuffer result = (StringBuffer) format.format(42.5, sb, new FieldPosition(0));
        assertSame(sb, result);
        assertTrue(result.toString().contains("42.5"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatInvalidObject() {
        format.format(new Object(), new StringBuffer(), new FieldPosition(0));
    }

    @Test
    public void testParseValidComplex() throws ParseException {
        Complex c = format.parse("2.5 + 3.5i");
        assertEquals(2.5, c.getReal(), EPSILON);
        assertEquals(3.5, c.getImaginary(), EPSILON);
    }

    @Test
    public void testParseNegativeImaginary() throws ParseException {
        Complex c = format.parse("2 - 3i");
        assertEquals(2.0, c.getReal(), EPSILON);
        assertEquals(-3.0, c.getImaginary(), EPSILON);
    }

    @Test
    public void testParseRealOnly() throws ParseException {
        Complex c = format.parse("5");
        assertEquals(5.0, c.getReal(), EPSILON);
        assertEquals(0.0, c.getImaginary(), EPSILON);
    }

    @Test(expected = ParseException.class)
    public void testParseInvalidInput() throws ParseException {
        format.parse("not a complex number");
    }

    @Test
    public void testParseWithPositions() {
        String source = "1+2i extra";
        ParsePosition pos = new ParsePosition(0);
        Complex c = format.parse(source, pos);
        assertNotNull(c);
        assertEquals(1.0, c.getReal(), EPSILON);
        assertEquals(2.0, c.getImaginary(), EPSILON);
        assertEquals(4, pos.getIndex());
    }

    @Test
    public void testParseWhitespace() {
        String source = "   3 + 4i";
        ParsePosition pos = new ParsePosition(0);
        Complex c = format.parse(source, pos);
        assertNotNull(c);
        assertEquals(3.0, c.getReal(), EPSILON);
        assertEquals(4.0, c.getImaginary(), EPSILON);
    }

    @Test
    public void testParseInvalidCharacter() {
        String source = "1 + 2x";
        ParsePosition pos = new ParsePosition(0);
        Complex c = format.parse(source, pos);
        assertNull(c);
        assertTrue(pos.getErrorIndex() >= 0);
    }

    @Test
    public void testParseObjectMethod() {
        ParsePosition pos = new ParsePosition(0);
        Object result = format.parseObject("1 + 2i", pos);
        assertNotNull(result);
        assertTrue(result instanceof Complex);
    }

    @Test
    public void testSetImaginaryCharacter() {
        format.setImaginaryCharacter("j");
        assertEquals("j", format.getImaginaryCharacter());
        String result = format.format(new Complex(1.0, 1.0));
        assertTrue(result.contains("1j"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNullImaginaryCharacter() {
        format.setImaginaryCharacter(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetEmptyImaginaryCharacter() {
        format.setImaginaryCharacter("");
    }

    @Test
    public void testSetRealFormat() {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(3);
        format.setRealFormat(nf);
        assertSame(nf, format.getRealFormat());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNullRealFormat() {
        format.setRealFormat(null);
    }

    @Test
    public void testSetImaginaryFormat() {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(1);
        format.setImaginaryFormat(nf);
        assertSame(nf, format.getImaginaryFormat());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNullImaginaryFormat() {
        format.setImaginaryFormat(null);
    }

    @Test
    public void testGetInstance() {
        ComplexFormat f = ComplexFormat.getInstance();
        assertNotNull(f);
        assertEquals("i", f.getImaginaryCharacter());
    }

    @Test
    public void testGetInstanceWithLocale() {
        ComplexFormat f = ComplexFormat.getInstance(Locale.US);
        assertNotNull(f);
        assertEquals("i", f.getImaginaryCharacter());
    }

    @Test
    public void testGetAvailableLocales() {
        Locale[] locales = ComplexFormat.getAvailableLocales();
        assertNotNull(locales);
        assertTrue(locales.length > 0);
    }

    @Test
    public void testFormatComplexStaticMethod() {
        Complex c = new Complex(2.0, 3.0);
        String result = ComplexFormat.formatComplex(c);
        assertTrue(result.contains("2"));
        assertTrue(result.contains("3i"));
    }

    @Test
    public void testParseWithSpecialNaN() throws ParseException {
        Complex c = format.parse("(NaN) + 2i");
        assertEquals(Double.NaN, c.getReal(), EPSILON);
        assertEquals(2.0, c.getImaginary(), EPSILON);
    }

    @Test
    public void testParseWithSpecialInfinity() throws ParseException {
        Complex c = format.parse("1 + (Infinity)i");
        assertEquals(1.0, c.getReal(), EPSILON);
        assertEquals(Double.POSITIVE_INFINITY, c.getImaginary(), EPSILON);
    }

    @Test
    public void testParseWithNegativeSignAndNoSpaces() throws ParseException {
        Complex c = format.parse("-3-4i");
        assertEquals(-3.0, c.getReal(), EPSILON);
        assertEquals(-4.0, c.getImaginary(), EPSILON);
    }

    @Test
    public void testParseRealOnlyWithWhitespace() throws ParseException {
        Complex c = format.parse("  5  ");
        assertNotNull(c);
        assertEquals(5.0, c.getReal(), EPSILON);
        assertEquals(0.0, c.getImaginary(), EPSILON);
    }
}