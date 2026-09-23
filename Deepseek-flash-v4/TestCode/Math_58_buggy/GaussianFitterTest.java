package org.apache.commons.math.optimization.fitting;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.exception.ZeroException;
import org.apache.commons.math.analysis.function.Gaussian;

public class GaussianFitterTest {

    private static class MockOptimizer implements DifferentiableMultivariateVectorialOptimizer {
        public org.apache.commons.math.optimization.OptimizationException getMaxEvaluations() { return null; }
        public int getMaxIterations() { return 100; }
        public double[][] getConstraints() { return null; }
        public double[] optimize(int maxEval, org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction f, double[] target, double[] weights, double[] startPoint) { return new double[]{1.0, 0.0, 1.0}; }
        public double[] optimize(int maxEval, org.apache.commons.math.analysis.MultivariateVectorialFunction f, double[] target, double[] weights, double[] startPoint) { return new double[]{1.0, 0.0, 1.0}; }
        public double getRMS() { return 0; }
        public double getChiSquare() { return 0; }
        public int getIterations() { return 0; }
        public int getEvaluations() { return 0; }
        public void setMaxIterations(int maxIterations) {}
        public void setMaxEvaluations(int maxEvaluations) {}
        public void setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker checker) {}
    }

    private WeightedObservedPoint[] points;
    private GaussianFitter fitter;

    @Before
    public void setUp() {
        fitter = new GaussianFitter(new MockOptimizer());
        points = new WeightedObservedPoint[]{
            new WeightedObservedPoint(1.0, 0.0, 1.0),
            new WeightedObservedPoint(2.0, 1.0, 3.0),
            new WeightedObservedPoint(3.0, 2.0, 2.0),
            new WeightedObservedPoint(4.0, 3.0, 0.5)
        };
    }

    @Test
    public void testParameterGuesserNullObservations() {
        try {
            new GaussianFitter.ParameterGuesser(null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }

    @Test
    public void testParameterGuesserTooFewObservations() {
        WeightedObservedPoint[] tooFew = new WeightedObservedPoint[]{points[0], points[1]};
        try {
            new GaussianFitter.ParameterGuesser(tooFew);
            fail("Expected NumberIsTooSmallException");
        } catch (NumberIsTooSmallException e) {
            // expected
        }
    }

    @Test
    public void testParameterGuesserGuess() {
        GaussianFitter.ParameterGuesser guesser = new GaussianFitter.ParameterGuesser(points);
        double[] guess = guesser.guess();
        assertEquals(3, guess.length);
        assertNotNull(guess);
        // Should be non-null and have plausible values
        assertTrue(guess[0] > 0); // norm
    }

    @Test
    public void testBasicGuessSorting() throws Exception {
        WeightedObservedPoint[] unsorted = new WeightedObservedPoint[]{
            new WeightedObservedPoint(1.0, 2.0, 1.0),
            new WeightedObservedPoint(1.0, 1.0, 3.0),
            new WeightedObservedPoint(1.0, 0.0, 2.0)
        };
        GaussianFitter.ParameterGuesser guesser = new GaussianFitter.ParameterGuesser(unsorted);
        double[] guess = guesser.guess();
        assertEquals(3, guess.length);
        // points should be sorted by x, max y should be at index 1 (x=1.0, y=1.0)
        assertEquals(1.0, guess[1], 0.0001); // mean
    }

    @Test
    public void testInterpolateXAtY() throws Exception {
        GaussianFitter.ParameterGuesser guesser = new GaussianFitter.ParameterGuesser(points);
        // Use reflection to test private method or test through guess
        // Testing basic guess for a simple case
        WeightedObservedPoint[] sorted = new WeightedObservedPoint[]{
            new WeightedObservedPoint(1.0, 0.0, 1.0),
            new WeightedObservedPoint(1.0, 1.0, 3.0),
            new WeightedObservedPoint(1.0, 2.0, 2.0)
        };
        double[] guess = guesser.guess();
        assertNotNull(guess);
    }

    @Test
    public void testInterpolateXAtYZeroStep() throws Exception {
        // Using reflection to access private method
        java.lang.reflect.Method method = GaussianFitter.ParameterGuesser.class.getDeclaredMethod(
            "interpolateXAtY", WeightedObservedPoint[].class, int.class, int.class, double.class);
        method.setAccessible(true);
        
        GaussianFitter.ParameterGuesser guesser = new GaussianFitter.ParameterGuesser(points);
        try {
            method.invoke(guesser, points, 0, 0, 1.0);
            fail("Expected ZeroException");
        } catch (java.lang.reflect.InvocationTargetException e) {
            assertTrue(e.getCause() instanceof ZeroException);
        }
    }

    @Test
    public void testInterpolateXAtYOutOfRange() throws Exception {
        java.lang.reflect.Method method = GaussianFitter.ParameterGuesser.class.getDeclaredMethod(
            "interpolateXAtY", WeightedObservedPoint[].class, int.class, int.class, double.class);
        method.setAccessible(true);
        
        WeightedObservedPoint[] testPoints = new WeightedObservedPoint[]{
            new WeightedObservedPoint(1.0, 0.0, 0.0),
            new WeightedObservedPoint(1.0, 1.0, 10.0),
            new WeightedObservedPoint(1.0, 2.0, 5.0)
        };
        GaussianFitter.ParameterGuesser guesser = new GaussianFitter.ParameterGuesser(testPoints);
        try {
            method.invoke(guesser, testPoints, 1, 1, 20.0);
            fail("Expected OutOfRangeException");
        } catch (java.lang.reflect.InvocationTargetException e) {
            assertTrue(e.getCause() instanceof OutOfRangeException);
        }
    }

    @Test
    public void testGetInterpolationPointsForY() throws Exception {
        java.lang.reflect.Method method = GaussianFitter.ParameterGuesser.class.getDeclaredMethod(
            "getInterpolationPointsForY", WeightedObservedPoint[].class, int.class, int.class, double.class);
        method.setAccessible(true);
        
        WeightedObservedPoint[] testPoints = new WeightedObservedPoint[]{
            new WeightedObservedPoint(1.0, 0.0, 0.0),
            new WeightedObservedPoint(1.0, 1.0, 10.0),
            new WeightedObservedPoint(1.0, 2.0, 5.0)
        };
        GaussianFitter.ParameterGuesser guesser = new GaussianFitter.ParameterGuesser(testPoints);
        
        // Test with y between first two points
        WeightedObservedPoint[] result = (WeightedObservedPoint[]) method.invoke(guesser, testPoints, 1, 1, 5.0);
        assertEquals(2, result.length);
        assertEquals(0.0, result[0].getX(), 0.0001);
        assertEquals(1.0, result[1].getX(), 0.0001);
    }

    @Test
    public void testFitWithInitialGuess() {
        // Test fit method with initial guess
        WeightedObservedPoint[] testPoints = new WeightedObservedPoint[]{
            new WeightedObservedPoint(1.0, 0.0, 1.0),
            new WeightedObservedPoint(1.0, 1.0, 3.0),
            new WeightedObservedPoint(1.0, 2.0, 2.0)
        };
        for (WeightedObservedPoint p : testPoints) {
            fitter.addObservedPoint(p);
        }
        double[] result = fitter.fit(new double[]{1.0, 1.0, 1.0});
        assertNotNull(result);
        assertEquals(3, result.length);
    }

    @Test
    public void testFitNoInitialGuess() {
        WeightedObservedPoint[] testPoints = new WeightedObservedPoint[]{
            new WeightedObservedPoint(1.0, 0.0, 1.0),
            new WeightedObservedPoint(1.0, 1.0, 3.0),
            new WeightedObservedPoint(1.0, 2.0, 2.0)
        };
        for (WeightedObservedPoint p : testPoints) {
            fitter.addObservedPoint(p);
        }
        double[] result = fitter.fit();
        assertNotNull(result);
        assertEquals(3, result.length);
    }

    @Test
    public void testIsBetween() throws Exception {
        java.lang.reflect.Method method = GaussianFitter.ParameterGuesser.class.getDeclaredMethod(
            "isBetween", double.class, double.class, double.class);
        method.setAccessible(true);
        
        GaussianFitter.ParameterGuesser guesser = new GaussianFitter.ParameterGuesser(points);
        assertTrue((Boolean) method.invoke(guesser, 5.0, 1.0, 10.0));
        assertTrue((Boolean) method.invoke(guesser, 1.0, 1.0, 10.0));
        assertTrue((Boolean) method.invoke(guesser, 10.0, 1.0, 10.0));
        assertFalse((Boolean) method.invoke(guesser, 0.5, 1.0, 10.0));
        assertFalse((Boolean) method.invoke(guesser, 10.5, 1.0, 10.0));
        assertTrue((Boolean) method.invoke(guesser, 10.0, 10.0, 1.0));
    }

    @Test
    public void testCreateWeightedObservedPointComparator() throws Exception {
        java.lang.reflect.Method method = GaussianFitter.ParameterGuesser.class.getDeclaredMethod(
            "createWeightedObservedPointComparator");
        method.setAccessible(true);
        
        GaussianFitter.ParameterGuesser guesser = new GaussianFitter.ParameterGuesser(points);
        java.util.Comparator<WeightedObservedPoint> comparator = 
            (java.util.Comparator<WeightedObservedPoint>) method.invoke(guesser);
        
        WeightedObservedPoint p1 = new WeightedObservedPoint(1.0, 0.0, 1.0);
        WeightedObservedPoint p2 = new WeightedObservedPoint(1.0, 1.0, 2.0);
        WeightedObservedPoint p3 = new WeightedObservedPoint(1.0, 1.0, 1.0);
        
        assertTrue(comparator.compare(null, null) == 0);
        assertTrue(comparator.compare(p1, null) == -1);
        assertTrue(comparator.compare(null, p1) == 1);
        assertTrue(comparator.compare(p1, p2) < 0);
        assertTrue(comparator.compare(p2, p1) > 0);
        
        // Same x, different y
        assertTrue(comparator.compare(p2, p3) > 0);
        assertTrue(comparator.compare(p3, p2) < 0);
        
        // Same x and y, different weight
        WeightedObservedPoint p4 = new WeightedObservedPoint(2.0, 1.0, 1.0);
        WeightedObservedPoint p5 = new WeightedObservedPoint(1.0, 1.0, 1.0);
        assertTrue(comparator.compare(p4, p5) > 0);
        assertTrue(comparator.compare(p5, p4) < 0);
        
        // Equal points
        WeightedObservedPoint p6 = new WeightedObservedPoint(1.0, 1.0, 1.0);
        assertTrue(comparator.compare(p5, p6) == 0);
    }
}