package org.apache.commons.math3.fraction;

import org.junit.Test;
import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.apache.commons.math3.exception.ZeroException;

/**
 * Comprehensive Unit Tests for {@link BigFraction}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class BigFractionTest {

    @Test
    public void constructorAndAccessors_shouldReduceAndStoreBigInts() {
        // Arrange & Act
        BigFraction bf = new BigFraction(new BigInteger("100"), new BigInteger("200"));

        // Assert
        assertEquals(BigInteger.ONE, bf.getNumerator());
        assertEquals(BigInteger.valueOf(2), bf.getDenominator());
        assertEquals(0.5, bf.doubleValue(), 0.0001);
        assertEquals(new BigDecimal("0.5"), bf.bigDecimalValue());
    }

    @Test
    public void arithmeticOperations_shouldComputeAccurately() {
        // Arrange
        BigFraction f1 = new BigFraction(1, 3);
        BigFraction f2 = new BigFraction(1, 6);

        // Act
        BigFraction sum = f1.add(f2);
        BigFraction diff = f1.subtract(f2);
        BigFraction prod = f1.multiply(f2);
        BigFraction quot = f1.divide(f2);

        // Assert
        assertEquals(new BigFraction(1, 2), sum);
        assertEquals(new BigFraction(1, 6), diff);
        assertEquals(new BigFraction(1, 18), prod);
        assertEquals(new BigFraction(2, 1), quot);
    }

    @Test
    public void powAndReciprocal_shouldTransformFraction() {
        // Arrange
        BigFraction bf = new BigFraction(2, 3);

        // Act & Assert
        assertEquals(new BigFraction(4, 9), bf.pow(2));
        assertEquals(new BigFraction(3, 2), bf.reciprocal());
        assertEquals(new BigFraction(-2, 3), bf.negate());
    }

    @Test(expected = ZeroException.class)
    public void constructor_givenZeroDenominator_shouldThrowException() {
        // Arrange & Act
        new BigFraction(BigInteger.ONE, BigInteger.ZERO);
    }

    @Test
    public void equalsAndCompareTo_shouldBehaveConsistently() {
        // Arrange
        BigFraction bf1 = new BigFraction(2, 4);
        BigFraction bf2 = new BigFraction(1, 2);
        BigFraction bf3 = new BigFraction(3, 4);

        // Act & Assert
        assertTrue(bf1.equals(bf2));
        assertFalse(bf1.equals(bf3));
        assertEquals(0, bf1.compareTo(bf2));
        assertTrue(bf1.compareTo(bf3) < 0);
    }
}
