package org.apache.commons.math3.util;

import org.junit.Test;
import static org.junit.Assert.*;

import org.apache.commons.math3.exception.DimensionMismatchException;

/**
 * Comprehensive Unit Tests for {@link MathArrays}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class MathArraysTest {

    @Test
    public void linearCombination_shouldCalculateAccurately() {
        // Arrange
        double[] a = new double[] { 1.0, 2.0, 3.0 };
        double[] b = new double[] { 4.0, 5.0, 6.0 };

        // Act
        double result = MathArrays.linearCombination(a, b);

        // Assert: 1*4 + 2*5 + 3*6 = 4 + 10 + 18 = 32
        assertEquals(32.0, result, 0.00001);
    }

    @Test
    public void distances_shouldCalculateL1L2LInf() {
        // Arrange
        double[] p1 = new double[] { 1.0, 2.0 };
        double[] p2 = new double[] { 4.0, 6.0 };

        // Act & Assert: dx=3, dy=4
        assertEquals(5.0, MathArrays.distance(p1, p2), 0.0001);     // sqrt(9+16) = 5
        assertEquals(7.0, MathArrays.distance1(p1, p2), 0.0001);    // 3 + 4 = 7
        assertEquals(4.0, MathArrays.distanceInf(p1, p2), 0.0001);  // max(3, 4) = 4
    }

    @Test
    public void scaleAndEbeOperations_shouldPerformElementWiseMath() {
        // Arrange
        double[] a = new double[] { 10.0, 20.0 };
        double[] b = new double[] { 2.0, 4.0 };

        // Act
        double[] scaled = MathArrays.scale(2.0, a);
        double[] add = MathArrays.ebeAdd(a, b);
        double[] sub = MathArrays.ebeSubtract(a, b);
        double[] mul = MathArrays.ebeMultiply(a, b);
        double[] div = MathArrays.ebeDivide(a, b);

        // Assert
        assertArrayEquals(new double[] { 20.0, 40.0 }, scaled, 0.0001);
        assertArrayEquals(new double[] { 12.0, 24.0 }, add, 0.0001);
        assertArrayEquals(new double[] { 8.0, 16.0 }, sub, 0.0001);
        assertArrayEquals(new double[] { 20.0, 80.0 }, mul, 0.0001);
        assertArrayEquals(new double[] { 5.0, 5.0 }, div, 0.0001);
    }

    @Test
    public void normalizeArray_shouldScaleToRequestedSum() {
        // Arrange
        double[] values = new double[] { 1.0, 2.0, 3.0, 4.0 };

        // Act
        double[] normalized = MathArrays.normalizeArray(values, 1.0);

        // Assert
        double sum = 0.0;
        for (int i = 0; i < normalized.length; i++) {
            sum += normalized[i];
        }
        assertEquals(1.0, sum, 0.0001);
    }

    @Test(expected = DimensionMismatchException.class)
    public void checkEqualLength_givenMismatchedArrays_shouldThrowException() {
        // Arrange & Act
        MathArrays.checkEqualLength(new double[] { 1.0 }, new double[] { 1.0, 2.0 });
    }
}
