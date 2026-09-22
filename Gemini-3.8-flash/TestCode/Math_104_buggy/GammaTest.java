package org.apache.commons.math.special;

import org.junit.Test;
import static org.junit.Assert.*;

import org.apache.commons.math.MathException;

/**
 * Comprehensive Unit Tests for {@link Gamma}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class GammaTest {

    @Test
    public void logGamma_givenPositiveNumbers_shouldComputeAccurately() {
        // Arrange & Act & Assert: Gamma(1) = 1, logGamma(1) = 0
        assertEquals(0.0, Gamma.logGamma(1.0), 1e-9);

        // Gamma(2) = 1, logGamma(2) = 0
        assertEquals(0.0, Gamma.logGamma(2.0), 1e-9);

        // Gamma(3) = 2, logGamma(3) = ln(2) ~= 0.69314718056
        assertEquals(Math.log(2.0), Gamma.logGamma(3.0), 1e-9);

        // Gamma(4) = 6, logGamma(4) = ln(6) ~= 1.79175946923
        assertEquals(Math.log(6.0), Gamma.logGamma(4.0), 1e-9);
    }

    @Test
    public void logGamma_givenNonPositiveAndNaN_shouldReturnNaN() {
        // Arrange & Act & Assert
        assertTrue(Double.isNaN(Gamma.logGamma(0.0)));
        assertTrue(Double.isNaN(Gamma.logGamma(-1.5)));
        assertTrue(Double.isNaN(Gamma.logGamma(Double.NaN)));
    }

    @Test
    public void regularizedGammaPAndQ_shouldBeComplementary() throws MathException {
        // Arrange
        double a = 2.0;
        double x = 1.0;

        // Act
        double p = Gamma.regularizedGammaP(a, x);
        double q = Gamma.regularizedGammaQ(a, x);

        // Assert: P(a, x) + Q(a, x) = 1.0
        assertTrue(p >= 0.0 && p <= 1.0);
        assertTrue(q >= 0.0 && q <= 1.0);
        assertEquals(1.0, p + q, 1e-9);
    }

    @Test
    public void regularizedGamma_boundaryConditions_shouldReturnExpectedValues() throws MathException {
        // Arrange & Act & Assert: P(a, 0) = 0, Q(a, 0) = 1
        assertEquals(0.0, Gamma.regularizedGammaP(2.0, 0.0), 1e-9);
        assertEquals(1.0, Gamma.regularizedGammaQ(2.0, 0.0), 1e-9);

        // Invalid arguments return NaN
        assertTrue(Double.isNaN(Gamma.regularizedGammaP(-1.0, 1.0)));
        assertTrue(Double.isNaN(Gamma.regularizedGammaP(1.0, -1.0)));
    }
}
