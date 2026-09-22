package org.apache.commons.math.fraction;

import org.junit.Test;
import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.ParsePosition;

/**
 * Comprehensive Unit Tests for {@link ProperFractionFormat}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class ProperFractionFormatTest {

    @Test
    public void format_givenProperAndImproperFractions_shouldFormatCorrectly() {
        // Arrange
        ProperFractionFormat format = new ProperFractionFormat();

        // Act & Assert: 1/2 stays 1 / 2 (or 1/2)
        Fraction fProper = new Fraction(1, 2);
        String sProper = format.format(fProper);
        assertTrue(sProper.contains("1 / 2"));

        // 7/2 becomes 3 1 / 2
        Fraction fImproper = new Fraction(7, 2);
        String sImproper = format.format(fImproper);
        assertTrue(sImproper.contains("3 1 / 2"));
    }

    @Test
    public void parse_givenValidProperFractionString_shouldParseToFraction() throws ParseException {
        // Arrange
        ProperFractionFormat format = new ProperFractionFormat();

        // Act
        Fraction f1 = format.parse("1 1 / 2");
        Fraction f2 = format.parse("2 / 3");

        // Assert
        assertNotNull(f1);
        assertEquals(new Fraction(3, 2), f1);

        assertNotNull(f2);
        assertEquals(new Fraction(2, 3), f2);
    }

    @Test
    public void parse_givenParsePosition_shouldParseAndAdvanceIndex() {
        // Arrange
        ProperFractionFormat format = new ProperFractionFormat();
        ParsePosition pos = new ParsePosition(0);

        // Act
        Fraction f = format.parse("2 1 / 4 trailing", pos);

        // Assert
        assertNotNull(f);
        assertEquals(new Fraction(9, 4), f);
        assertTrue(pos.getIndex() > 0);
    }
}
