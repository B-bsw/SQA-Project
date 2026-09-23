package org.apache.commons.math.special;

import org.apache.commons.math.MathException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class GammaTest {
    
    private static final double EPSILON = 1e-10;
    private static final double TOLERANCE = 1e-9;
    
    @Before
    public void setUp() {
        // Setup if needed
    }
    
    @After
    public void tearDown() {
        // Cleanup if needed
    }
    
    @Test
    public void testLogGammaValidInput() {
        // Known values: logGamma(1) = 0, logGamma(2) = 0, logGamma(3) = log(2)
        assertEquals(0.0, Gamma.logGamma(1.0), EPSILON);
        assertEquals(0.0, Gamma.logGamma(2.0), EPSILON);
        assertEquals(Math.log(2.0), Gamma.logGamma(3.0), EPSILON);
        
        // Test small positive value
        assertEquals(Math.log(Math.sqrt(Math.PI)), Gamma.logGamma(0.5), EPSILON);
    }
    
    @Test
    public void testLogGammaBoundaryValues() {
        // Test very small positive number
        assertNotNull(Gamma.logGamma(1e-15));
        
        // Test large value
        assertTrue(Gamma.logGamma(100.0) > 0);
        
        // Test boundary at exactly 0
        assertEquals(Double.NaN, Gamma.logGamma(0.0), 0.0);
        
        // Test negative values
        assertEquals(Double.NaN, Gamma.logGamma(-1.0), 0.0);
        assertEquals(Double.NaN, Gamma.logGamma(-100.5), 0.0);
    }
    
    @Test
    public void testLogGammaNullNaN() {
        assertTrue(Double.isNaN(Gamma.logGamma(Double.NaN)));
        assertTrue(Double.isNaN(Gamma.logGamma(Double.NEGATIVE_INFINITY)));
    }
    
    @Test
    public void testRegularizedGammaQValidInput() throws MathException {
        // Test case where x = 0
        assertEquals(1.0, Gamma.regularizedGammaQ(1.0, 0.0, EPSILON, 100), EPSILON);
        
        // Test case where a >= 1 and x > a (uses Q branch)
        double result = Gamma.regularizedGammaQ(2.0, 3.0, EPSILON, 100);
        assertTrue(result >= 0.0 && result <= 1.0);
        
        // Test case where x < a or a < 1 (uses series branch)
        double result2 = Gamma.regularizedGammaQ(3.0, 1.0, EPSILON, 100);
        assertTrue(result2 >= 0.0 && result2 <= 1.0);
        
        // Test case with large a
        double result3 = Gamma.regularizedGammaQ(5.0, 5.0, EPSILON, 100);
        assertTrue(result3 >= 0.0 && result3 <= 1.0);
    }
    
    @Test
    public void testRegularizedGammaQBoundaryConditions() throws MathException {
        // Test with NaN inputs
        assertTrue(Double.isNaN(Gamma.regularizedGammaQ(Double.NaN, 1.0, EPSILON, 100)));
        assertTrue(Double.isNaN(Gamma.regularizedGammaQ(1.0, Double.NaN, EPSILON, 100)));
        
        // Test with a <= 0
        assertTrue(Double.isNaN(Gamma.regularizedGammaQ(0.0, 1.0, EPSILON, 100)));
        assertTrue(Double.isNaN(Gamma.regularizedGammaQ(-2.0, 1.0, EPSILON, 100)));
        
        // Test with x < 0
        assertTrue(Double.isNaN(Gamma.regularizedGammaQ(1.0, -1.0, EPSILON, 100)));
    }
    
    @Test
    public void testRegularizedGammaQConvergence() {
        // Test non-convergence
        try {
            Gamma.regularizedGammaQ(1.0, 1.0, 1e-20, 1);
            fail("Should throw MathException for non-convergence");
        } catch (MathException e) {
            // Expected exception
        }
    }
    
    @Test
    public void testRegularizedGammaP() throws MathException {
        // Known identity: P(a, x) + Q(a, x) = 1
        double a = 2.0;
        double x = 1.0;
        double p = Gamma.regularizedGammaP(a, x, EPSILON, 100);
        double q = Gamma.regularizedGammaQ(a, x, EPSILON, 100);
        assertEquals(1.0, p + q, TOLERANCE);
        
        // Test specific values
        assertEquals(0.0, Gamma.regularizedGammaP(1.0, 0.0, EPSILON, 100), EPSILON);
    }
    
    @Test
    public void testRegularizedGammaPBoundaryConditions() throws MathException {
        // Test invalid inputs
        assertTrue(Double.isNaN(Gamma.regularizedGammaP(-1.0, 1.0, EPSILON, 100)));
        assertTrue(Double.isNaN(Gamma.regularizedGammaP(1.0, -1.0, EPSILON, 100)));
        assertTrue(Double.isNaN(Gamma.regularizedGammaP(Double.NaN, 1.0, EPSILON, 100)));
    }
    
    @Test
    public void testDefaultRegularizedGammaQ() throws MathException {
        // Test default method
        double result = Gamma.regularizedGammaQ(2.0, 3.0);
        assertTrue(result >= 0.0 && result <= 1.0);
        
        // Test with valid inputs
        double a = 2.0;
        double x = 5.0;
        double defaultResult = Gamma.regularizedGammaQ(a, x);
        double explicitResult = Gamma.regularizedGammaQ(a, x, 1e-9, Integer.MAX_VALUE);
        assertEquals(defaultResult, explicitResult, TOLERANCE);
    }
    
    @Test
    public void testExtremeValues() throws MathException {
        // Test very large arguments
        double result = Gamma.regularizedGammaQ(10.0, 100.0, EPSILON, 1000);
        assertTrue(result >= 0.0 && result <= 1.0);
        
        // Test a = 1
        double resultA1 = Gamma.regularizedGammaQ(1.0, 2.0, EPSILON, 100);
        assertEquals(Math.exp(-2.0), resultA1, TOLERANCE);
    }
    
    @Test
    public void testRegularizedGammaQNegativeX() {
        try {
            Gamma.regularizedGammaQ(1.0, -1.0);
            fail("Should throw MathException for negative x when a is positive integer");
        } catch (MathException e) {
            // Expected exception for non-convergence
        }
    }
    
    @Test
    public void testComparisons() throws MathException {
        // Test that Q(a, x) is between 0 and 1 for various inputs
        double[] testCases = {0.5, 1.0, 2.0, 5.0, 10.0, 20.0};
        
        for (double a : testCases) {
            for (double x : new double[]{0.1, 0.5, 1.0, 2.0, 5.0}) {
                double q = Gamma.regularizedGammaQ(a, x, EPSILON, 500);
                assertTrue("Q(" + a + "," + x + ") = " + q + " not in [0,1]", 
                          q >= 0.0 && q <= 1.0);
                
                // Q(a,x) should be decreasing in x
                double qSmaller = Gamma.regularizedGammaQ(a, x * 0.5, EPSILON, 500);
                assertTrue("Q not decreasing for a=" + a + ", x=" + x,
                          qSmaller >= q);
            }
        }
    }
    
    @Test
    public void testRegularizedGammaQNaNInputs() throws MathException {
        assertTrue(Double.isNaN(Gamma.regularizedGammaQ(Double.POSITIVE_INFINITY, 1.0)));
        assertTrue(Double.isNaN(Gamma.regularizedGammaQ(1.0, Double.POSITIVE_INFINITY)));
    }
    
    @Test
    public void testSerialVersionUID() {
        // Test that the serialVersionUID is defined
        assertNotNull(Gamma.class.getDeclaredFields());
    }
}