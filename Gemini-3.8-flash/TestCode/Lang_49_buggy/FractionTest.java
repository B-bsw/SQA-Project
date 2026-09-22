package org.apache.commons.lang.math;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Comprehensive Unit Tests for {@link Fraction}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class FractionTest {

    @Test
    public void getFraction_andArithmetic_shouldCalculateAccurately() {
        // Arrange
        Fraction half = Fraction.getFraction(1, 2);
        Fraction third = Fraction.getFraction(1, 3);

        // Act
        Fraction sum = half.add(third);
        Fraction diff = half.subtract(third);
        Fraction prod = half.multiplyBy(third);
        Fraction quot = half.divideBy(third);

        // Assert
        assertEquals(Fraction.getFraction(5, 6), sum);
        assertEquals(Fraction.getFraction(1, 6), diff);
        assertEquals(Fraction.getFraction(1, 6), prod);
        assertEquals(Fraction.getFraction(3, 2), quot);
    }

    @Test
    public void reduceAndInvert_shouldSimplify() {
        // Arrange
        Fraction f = Fraction.getFraction(4, 8);

        // Act
        Fraction reduced = f.reduce();
        Fraction inverted = reduced.invert();

        // Assert
        assertEquals(1, reduced.getNumerator());
        assertEquals(2, reduced.getDenominator());
        assertEquals(2, inverted.getNumerator());
        assertEquals(1, inverted.getDenominator());
    }
}
