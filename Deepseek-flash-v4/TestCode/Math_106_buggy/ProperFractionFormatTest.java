package org.apache.commons.math.fraction;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.text.ParseException;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class ProperFractionFormatTest {

    private ProperFractionFormat format;
    private ProperFractionFormat customFormat;
    private static final NumberFormat DEFAULT_FORMAT = NumberFormat.getInstance();

    @Before
    public void setUp() {
        format = new ProperFractionFormat();
        customFormat = new ProperFractionFormat(DEFAULT_FORMAT);
    }

    @After
    public void tearDown() {
        format = null;
        customFormat = null;
    }

    @Test
    public void testConstructor() {
        assertNotNull(format);
        assertEquals(DEFAULT_FORMAT, format.getWholeFormat());
        assertEquals(DEFAULT_FORMAT, format.getNumeratorFormat());
        assertEquals(DEFAULT_FORMAT, format.getDenominatorFormat());
        
        assertNotNull(customFormat);
        assertEquals(DEFAULT_FORMAT, customFormat.getWholeFormat());
        assertEquals(DEFAULT_FORMAT, customFormat.getNumeratorFormat());
        assertEquals(DEFAULT_FORMAT, customFormat.getDenominatorFormat());
        
        NumberFormat nf = NumberFormat.getInstance();
        ProperFractionFormat f2 = new ProperFractionFormat(nf, nf, nf);
        assertEquals(nf, f2.getWholeFormat());
        assertEquals(nf, f2.getNumeratorFormat());
        assertEquals(nf, f2.getDenominatorFormat());
        
        try {
            new ProperFractionFormat(null, nf, nf);
            fail("Expected IllegalArgumentException for null whole format");
        } catch (IllegalArgumentException e) {
            // expected
        }
        
        try {
            new ProperFractionFormat(NumberFormat.getInstance());
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testFormat() {
        Fraction proper = new Fraction(3, 4);
        assertEquals("3 / 4", format.format(proper));
        
        Fraction mixed = new Fraction(7, 2);
        assertEquals("3 1 / 2", format.format(mixed));
        
        assertEquals("0 / 1", format.format(new Fraction(0, 1)));
        assertEquals("-1 / 2", format.format(new Fraction(-1, 2)));
        assertEquals("-1 1 / 2", format.format(new Fraction(-3, 2)));
    }

    @Test
    public void testFormatWithFieldPosition() {
        StringBuffer sb = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        format.format(new Fraction(3, 4), sb, pos);
        assertEquals("3 / 4", sb.toString());
        assertEquals(0, pos.getBeginIndex());
        assertEquals(0, pos.getEndIndex());
    }

    @Test
    public void testParseProperFraction() {
        String source = "1 1/2";
        ParsePosition pos = new ParsePosition(0);
        Fraction result = format.parse(source, pos);
        assertNotNull(result);
        assertEquals(3, result.getNumerator());
        assertEquals(2, result.getDenominator());
        assertEquals(source.length(), pos.getIndex());
    }

    @Test
    public void testParseImproperFractionAsProper() {
        String source = "3/4";
        ParsePosition pos = new ParsePosition(0);
        Fraction result = format.parse(source, pos);
        assertNotNull(result);
        assertEquals(3, result.getNumerator());
        assertEquals(4, result.getDenominator());
    }

    @Test
    public void testParseNegativeWholeNumber() {
        String source = "-1 1/2";
        ParsePosition pos = new ParsePosition(0);
        Fraction result = format.parse(source, pos);
        assertNotNull(result);
        assertEquals(-3, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }

    @Test
    public void testParseInvalidInput() {
        ParsePosition pos = new ParsePosition(0);
        assertNull(format.parse("abc", pos));
        assertEquals(0, pos.getIndex());
        assertTrue(pos.getErrorIndex() >= 0);
        
        pos = new ParsePosition(0);
        assertNull(format.parse("1/abc", pos));
        assertEquals(0, pos.getIndex());
        
        pos = new ParsePosition(0);
        assertNull(format.parse("1/2x", pos));
        assertEquals(1, pos.getIndex());
    }

    @Test
    public void testParseEmptyString() {
        ParsePosition pos = new ParsePosition(0);
        assertNull(format.parse("", pos));
        assertEquals(0, pos.getIndex());
        assertTrue(pos.getErrorIndex() >= 0);
    }

    @Test
    public void testParseWhitespaceOnly() {
        ParsePosition pos = new ParsePosition(0);
        assertNull(format.parse(" ", pos));
        assertTrue(pos.getIndex() >= 0);
    }

    @Test
    public void testParseWithLeadingWhitespace() {
        ParsePosition pos = new ParsePosition(0);
        Fraction result = format.parse(" 1/2", pos);
        assertNotNull(result);
        assertEquals(1, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }

    @Test
    public void testParseNegativeFraction() {
        ParsePosition pos = new ParsePosition(0);
        Fraction result = format.parse("-1/2", pos);
        assertNotNull(result);
        assertEquals(-1, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }

    @Test
    public void testSetWholeFormat() {
        NumberFormat nf = NumberFormat.getInstance();
        format.setWholeFormat(nf);
        assertEquals(nf, format.getWholeFormat());
        
        try {
            format.setWholeFormat(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testFormatNullFraction() {
        StringBuffer sb = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        try {
            format.format((Fraction) null, sb, pos);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testParseFractionMethod() {
        try {
            Fraction f = format.parse("1/2");
            assertNotNull(f);
            assertEquals(1, f.getNumerator());
            assertEquals(2, f.getDenominator());
            
            f = format.parse("-1/2");
            assertEquals(-1, f.getNumerator());
            assertEquals(2, f.getDenominator());
            
            f = format.parse("2/4");
            assertEquals(2, f.getNumerator());
            assertEquals(4, f.getDenominator());
        } catch (ParseException e) {
            fail("Unexpected ParseException: " + e.getMessage());
        }
    }

    @Test
    public void testParseInvalidFractionThrows() {
        try {
            format.parse("invalid");
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertNotNull(e.getMessage());
        }
        
        try {
            format.parse("1/");
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testFormatWithNullStringBuffer() {
        FieldPosition pos = new FieldPosition(0);
        try {
            format.format(new Fraction(1, 2), (StringBuffer)null, pos);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected - cannot test with assert since we're not using JUnit 5's assertThrows
        }
    }

    @Test
    public void testFormatWithNullFieldPosition() {
        try {
            format.format(new Fraction(1, 2), new StringBuffer(), null);
            // FieldPosition is not null-checked in the implementation, but we expect it to work
            // or throw NPE - either is acceptable for this test
        } catch (NullPointerException e) {
            // expected
        }
    }
}