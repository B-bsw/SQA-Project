package org.apache.commons.math3.optimization.fitting;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric3 = null;
        double[] doubleArray8 = new double[] { 0L, (-1.0f), 10.0f, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = harmonicFitter1.fit((int) (byte) 1, parametric3, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, (-1.0d), 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        java.lang.Class<?> wildcardClass2 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        double[] doubleArray2 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = harmonicFitter1.fit(doubleArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint0 = null;
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray1 = new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { weightedObservedPoint0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser2 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray1);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray1, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric3 = null;
        double[] doubleArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = harmonicFitter1.fit((int) 'a', parametric3, doubleArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric2 = null;
        double[] doubleArray9 = new double[] { 100.0f, (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = harmonicFitter1.fit(parametric2, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, (-1.0d), 100.0d, 1.0d, 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass4 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric4 = null;
        double[] doubleArray7 = new double[] { (byte) 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = harmonicFitter1.fit(100, parametric4, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        double[] doubleArray6 = new double[] { 0L, 0, '4' };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = harmonicFitter1.fit(doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 0.0d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        double[] doubleArray7 = new double[] { (-1L), 1L, 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = harmonicFitter1.fit(doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), 1.0d, 100.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric6 = null;
        double[] doubleArray7 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = harmonicFitter1.fit(0, parametric6, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric6 = null;
        double[] doubleArray12 = new double[] { 0L, 10L, 10.0d, (short) -1, 10L };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = harmonicFitter1.fit((-1), parametric6, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 10.0d, 10.0d, (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 100L, (double) 100);
        double[] doubleArray13 = new double[] { 0, (byte) 100, (-1), (byte) 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = harmonicFitter1.fit(doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 100.0d, (-1.0d), 100.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric3 = null;
        double[] doubleArray6 = new double[] { '#', 0 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = harmonicFitter1.fit(parametric3, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 35.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser4 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric6 = null;
        double[] doubleArray11 = new double[] { 0, 100.0f, 0, 100 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = harmonicFitter1.fit(parametric6, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray5, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d, 100.0d, 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        java.lang.Class<?> wildcardClass5 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric11 = null;
        double[] doubleArray15 = new double[] { 10.0d, 'a', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = harmonicFitter1.fit(parametric11, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 97.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) 1, (double) 0);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric9 = null;
        double[] doubleArray14 = new double[] { 100L, 10, (byte) 100, 0 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = harmonicFitter1.fit(parametric9, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d, 10.0d, 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray0 = new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray0);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray0, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = harmonicFitter1.fit(doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric5 = null;
        double[] doubleArray6 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = harmonicFitter1.fit((int) (short) -1, parametric5, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) 1, (double) 0);
        double[] doubleArray9 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = harmonicFitter1.fit(doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 100L, (double) 100);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 1, 1.0d);
        java.lang.Class<?> wildcardClass12 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser4 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        double[] doubleArray8 = new double[] { (byte) 0, (byte) 1, (short) 10, 1 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = harmonicFitter1.fit(doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 1.0d, 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        double[] doubleArray4 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = harmonicFitter1.fit(doubleArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) (short) -1, (-1.0d));
        java.lang.Class<?> wildcardClass12 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric4 = null;
        double[] doubleArray6 = new double[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = harmonicFitter1.fit((int) (byte) -1, parametric4, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser6 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray5, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        java.lang.Class<?> wildcardClass5 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        double[] doubleArray12 = new double[] { (-1.0d), 100L, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = harmonicFitter1.fit(doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric6 = null;
        double[] doubleArray12 = new double[] { 0.0d, (byte) 1, '#', 100.0d, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = harmonicFitter1.fit(0, parametric6, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 1.0d, 35.0d, 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        double[] doubleArray8 = new double[] { 10.0f, (short) 0, (short) 100, '#', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = harmonicFitter1.fit(doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 100.0d, 35.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        double[] doubleArray17 = new double[] { '4', 10.0f, (short) 0, 10.0f, '4', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = harmonicFitter1.fit(doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 52.0d, 10.0d, 0.0d, 10.0d, 52.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric9 = null;
        double[] doubleArray11 = new double[] { 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = harmonicFitter1.fit(parametric9, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass4 = weightedObservedPointArray3.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 100L, (double) 100);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 3 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        double[] doubleArray19 = new double[] { 100.0d, 0.0f, 1L, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = harmonicFitter1.fit(doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 0.0d, 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        java.lang.Class<?> wildcardClass5 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) 10.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        double[] doubleArray20 = new double[] { 100.0d, 10L, 1.0f, 100L, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = harmonicFitter1.fit(doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d, 10.0d, 1.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric9 = null;
        double[] doubleArray11 = new double[] { (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = harmonicFitter1.fit(100, parametric9, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        harmonicFitter1.addObservedPoint(1.0d, (double) (short) -1);
        double[] doubleArray24 = new double[] { (-1L), (byte) 0, 100.0d, (-1.0f), 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray25 = harmonicFitter1.fit(doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { (-1.0d), 0.0d, 100.0d, (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric2 = null;
        double[] doubleArray7 = new double[] { 0, 'a', 10.0f, 10 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = harmonicFitter1.fit(parametric2, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 97.0d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric5 = null;
        double[] doubleArray9 = new double[] { 1.0f, 1.0f, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = harmonicFitter1.fit(100, parametric5, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric10 = null;
        double[] doubleArray16 = new double[] { (byte) 10, (-1L), (short) 10, 0.0f, 10 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = harmonicFitter1.fit((int) ' ', parametric10, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, (-1.0d), 10.0d, 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser3 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric12 = null;
        double[] doubleArray19 = new double[] { (byte) 0, (short) 0, 0L, (-1.0d), 10.0d, 10L };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = harmonicFitter1.fit((int) ' ', parametric12, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 0.0d, 0.0d, 0.0d, (-1.0d), 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric16 = null;
        double[] doubleArray17 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = harmonicFitter1.fit((int) (byte) -1, parametric16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 100L, (double) 100);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 1, 1.0d);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric13 = null;
        double[] doubleArray17 = new double[] { (short) 1, (byte) 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = harmonicFitter1.fit((int) '#', parametric13, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser14 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 3 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric5 = null;
        double[] doubleArray9 = new double[] { 10.0f, (short) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = harmonicFitter1.fit(10, parametric5, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        java.lang.Class<?> wildcardClass11 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric5 = null;
        double[] doubleArray11 = new double[] { (-1.0f), (byte) 10, '#', (byte) 0, 10L };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = harmonicFitter1.fit(parametric5, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 10.0d, 35.0d, 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser8 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric8 = null;
        double[] doubleArray11 = new double[] { 100, 1 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = harmonicFitter1.fit(parametric8, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        double[] doubleArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = harmonicFitter1.fit(doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) -1);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric15 = null;
        double[] doubleArray18 = new double[] { (byte) 100, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = harmonicFitter1.fit((int) ' ', parametric15, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (-1), (double) '#');
        double[] doubleArray13 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = harmonicFitter1.fit(doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) 100, (double) (short) 0, (double) '4');
        double[] doubleArray24 = new double[] { (byte) 10, 1L, (byte) 10, (-1.0d), 1L };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray25 = harmonicFitter1.fit(doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 10.0d, 1.0d, 10.0d, (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        double[] doubleArray12 = new double[] { 10L, (-1.0d), 100, (-1.0f), 100 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = harmonicFitter1.fit(doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, (-1.0d), 100.0d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric18 = null;
        double[] doubleArray20 = new double[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = harmonicFitter1.fit((int) 'a', parametric18, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint10);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric13 = null;
        double[] doubleArray17 = new double[] { 10L, 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = harmonicFitter1.fit((int) (byte) 100, parametric13, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric19 = null;
        double[] doubleArray20 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = harmonicFitter1.fit(parametric19, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        java.lang.Class<?> wildcardClass9 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser10 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser5 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric4 = null;
        double[] doubleArray9 = new double[] { 10, ' ', (-1.0f), 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = harmonicFitter1.fit((int) '4', parametric4, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 32.0d, (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((double) (byte) 1, (double) ' ');
        double[] doubleArray14 = new double[] { 0L, (-1.0d), 1L, (-1), '4', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = harmonicFitter1.fit(doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d, (-1.0d), 1.0d, (-1.0d), 52.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric15 = null;
        double[] doubleArray21 = new double[] { 0.0d, (byte) 10, (-1.0f), (short) 100, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = harmonicFitter1.fit(0, parametric15, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 0.0d, 10.0d, (-1.0d), 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass4 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric9 = null;
        double[] doubleArray10 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = harmonicFitter1.fit((-1), parametric9, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint(100.0d, (double) (short) 1, (double) (byte) 0);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric11 = null;
        double[] doubleArray18 = new double[] { 100, (-1L), (byte) 0, (short) -1, 'a', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = harmonicFitter1.fit((int) (byte) -1, parametric11, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray5, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, (-1.0d), 0.0d, (-1.0d), 97.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((-1.0d), (double) 1.0f);
        java.lang.Class<?> wildcardClass7 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) 1L, 0.0d, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint18);
        java.lang.Class<?> wildcardClass20 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric5 = null;
        double[] doubleArray10 = new double[] { 1L, (short) 100, '#', 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = harmonicFitter1.fit(0, parametric5, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 100.0d, 35.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        harmonicFitter1.addObservedPoint((double) 0, (double) 'a', (double) 100.0f);
        java.lang.Class<?> wildcardClass17 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        harmonicFitter1.addObservedPoint((-1.0d), (double) (-1L), (double) 0.0f);
        java.lang.Class<?> wildcardClass13 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) 1, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass10 = weightedObservedPointArray9.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint(1.0d, (double) 0.0f, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        harmonicFitter1.addObservedPoint((double) 0, (double) 'a', (double) 100.0f);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric18 = null;
        double[] doubleArray23 = new double[] { 100, (byte) 1, (byte) 1, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray24 = harmonicFitter1.fit((int) (short) 1, parametric18, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint4);
        double[] doubleArray7 = new double[] { 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = harmonicFitter1.fit(doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (byte) 100);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric18 = null;
        double[] doubleArray25 = new double[] { 10L, '4', 0.0f, 1.0d, (-1), (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray26 = harmonicFitter1.fit(100, parametric18, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d, 52.0d, 0.0d, 1.0d, (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) 1L, (double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 3 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) (short) 0);
        java.lang.Class<?> wildcardClass19 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric11 = null;
        double[] doubleArray12 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = harmonicFitter1.fit(parametric11, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        double[] doubleArray13 = new double[] { 1L, 1.0d, (short) 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = harmonicFitter1.fit(doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, 1.0d, 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint(0.0d, (double) (-1.0f), (double) 10L);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric15 = null;
        double[] doubleArray21 = new double[] { (short) 0, (-1.0d), (byte) 0, 10L, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = harmonicFitter1.fit(parametric15, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 0.0d, (-1.0d), 0.0d, 10.0d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (byte) 100);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) 1L, (double) 1.0f);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric21 = null;
        double[] doubleArray27 = new double[] { (-1.0d), 100.0f, 10.0f, (byte) -1, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray28 = harmonicFitter1.fit(parametric21, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { (-1.0d), 100.0d, 10.0d, (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        harmonicFitter1.addObservedPoint((-1.0d), (double) (-1L), (double) 0.0f);
        double[] doubleArray18 = new double[] { (byte) 1, 100.0f, (short) 100, ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = harmonicFitter1.fit(doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 1.0d, 100.0d, 100.0d, 32.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass11 = weightedObservedPointArray10.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 100L, (double) 100);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (-1.0d));
        harmonicFitter1.addObservedPoint((double) (byte) 1, 1.0d);
        double[] doubleArray17 = new double[] { (-1L), (byte) -1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = harmonicFitter1.fit(doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d), (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass10 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        java.lang.Class<?> wildcardClass6 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric22 = null;
        double[] doubleArray23 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray24 = harmonicFitter1.fit(parametric22, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric4 = null;
        double[] doubleArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = harmonicFitter1.fit((int) 'a', parametric4, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint(1.0d, (double) 0.0f, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser10 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        harmonicFitter1.addObservedPoint((-1.0d), (double) (-1L), (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 3 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) 10.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser15 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray14);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = parameterGuesser15.guess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        double[] doubleArray18 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = harmonicFitter1.fit(doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass14 = weightedObservedPointArray13.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass16 = weightedObservedPointArray15.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser16 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) 1, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass13 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray12, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) 1, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser13 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray12, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint(1.0d, (double) 0.0f, (double) 0);
        java.lang.Class<?> wildcardClass9 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser10 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric3 = null;
        double[] doubleArray10 = new double[] { (short) 10, (-1.0f), (short) 1, 100L, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = harmonicFitter1.fit(parametric3, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, (-1.0d), 1.0d, 100.0d, 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser11 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        double[] doubleArray15 = new double[] { (-1), 10.0f, 100, (short) 10, (short) -1, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = harmonicFitter1.fit(doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 10.0d, 100.0d, 10.0d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        double[] doubleArray13 = new double[] { (byte) -1, 10.0f, (short) -1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = harmonicFitter1.fit(doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d), 10.0d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        harmonicFitter1.clearObservations();
        java.lang.Class<?> wildcardClass10 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric16 = null;
        double[] doubleArray23 = new double[] { 'a', (byte) 1, 0, 1L, '4', 1 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray24 = harmonicFitter1.fit((int) ' ', parametric16, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 97.0d, 1.0d, 0.0d, 1.0d, 52.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        java.lang.Class<?> wildcardClass8 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint4);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric6 = null;
        double[] doubleArray12 = new double[] { 100.0d, 1.0d, (byte) -1, '4', 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = harmonicFitter1.fit(parametric6, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 1.0d, (-1.0d), 52.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) 1L, 0.0d, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint18);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric21 = null;
        double[] doubleArray26 = new double[] { (short) 10, 1.0f, 'a', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray27 = harmonicFitter1.fit((int) (short) 100, parametric21, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.clearObservations();
        double[] doubleArray9 = new double[] { (byte) 100, 10, 0, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = harmonicFitter1.fit(doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 10.0d, 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint(0.0d, (double) (-1.0f), (double) 10L);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric16 = null;
        double[] doubleArray21 = new double[] { '4', ' ', 10.0f, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = harmonicFitter1.fit(100, parametric16, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 52.0d, 32.0d, 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 100L, (double) 100);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric9 = null;
        double[] doubleArray10 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = harmonicFitter1.fit((int) (byte) 1, parametric9, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric10 = null;
        double[] doubleArray11 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = harmonicFitter1.fit((int) ' ', parametric10, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        harmonicFitter1.clearObservations();
        double[] doubleArray16 = new double[] { 1L, 1, 0.0f, (short) 10, '4', 0L };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = harmonicFitter1.fit(doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0d, 1.0d, 0.0d, 10.0d, 52.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric17 = null;
        double[] doubleArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = harmonicFitter1.fit(parametric17, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric16 = null;
        double[] doubleArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = harmonicFitter1.fit((int) (byte) 10, parametric16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint4);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        java.lang.Class<?> wildcardClass8 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) 10.0f, 0.0d);
        double[] doubleArray12 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = harmonicFitter1.fit(doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric6 = null;
        double[] doubleArray13 = new double[] { '#', (byte) 100, (-1), ' ', (short) -1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = harmonicFitter1.fit(0, parametric6, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 35.0d, 100.0d, (-1.0d), 32.0d, (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser9 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray8, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass5 = weightedObservedPointArray4.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric17 = null;
        double[] doubleArray20 = new double[] { (short) 100, 10 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = harmonicFitter1.fit(parametric17, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint(0.0d, (double) (-1.0f), (double) 10L);
        double[] doubleArray16 = new double[] { 1 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = harmonicFitter1.fit(doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        double[] doubleArray23 = new double[] { (short) 1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray24 = harmonicFitter1.fit(doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) ' ');
        harmonicFitter1.addObservedPoint((double) '#', (double) (-1L), (double) 0L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser15 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric12 = null;
        double[] doubleArray16 = new double[] { 100, '4', 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = harmonicFitter1.fit(10, parametric12, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 52.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) 1, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric13 = null;
        double[] doubleArray17 = new double[] { 'a', (short) -1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = harmonicFitter1.fit((int) (byte) 1, parametric13, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 97.0d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) (short) -1, (-1.0d));
        harmonicFitter1.addObservedPoint((double) '#', (double) (byte) 100);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric15 = null;
        double[] doubleArray21 = new double[] { 1, (short) 0, 'a', 100.0d, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = harmonicFitter1.fit(parametric15, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, 0.0d, 97.0d, 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 10, 1.0d);
        java.lang.Class<?> wildcardClass18 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.clearObservations();
        java.lang.Class<?> wildcardClass9 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        double[] doubleArray12 = new double[] { (short) -1, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = harmonicFitter1.fit(doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = harmonicFitter1.getObservations();
        double[] doubleArray23 = new double[] { (byte) 100, 10.0d, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray24 = harmonicFitter1.fit(doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d, 10.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L), (double) (byte) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) 1L, 1.0d);
        java.lang.Class<?> wildcardClass15 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (byte) 100);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) 1L, (double) 1.0f);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) 10L, (double) 0L);
        double[] doubleArray30 = new double[] { 100L, (-1), 'a', (short) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray31 = harmonicFitter1.fit(doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d, (-1.0d), 97.0d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        double[] doubleArray17 = new double[] { 1.0f, 0L, (short) -1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = harmonicFitter1.fit(doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 0.0d, (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        double[] doubleArray9 = new double[] { (-1.0d), 1.0d, (-1), (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = harmonicFitter1.fit(doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 1.0d, (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.clearObservations();
        double[] doubleArray20 = new double[] { '#', (short) 1, '#', 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = harmonicFitter1.fit(doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 35.0d, 1.0d, 35.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        double[] doubleArray8 = new double[] { 0.0f, 100, 1.0f, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = harmonicFitter1.fit(doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 100.0d, 1.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric10 = null;
        double[] doubleArray16 = new double[] { 0.0f, (byte) 10, 0.0d, 0L, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = harmonicFitter1.fit((int) (short) 100, parametric10, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d, 10.0d, 0.0d, 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser16 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass10 = weightedObservedPointArray9.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        double[] doubleArray16 = new double[] { (byte) 1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = harmonicFitter1.fit(doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint8);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric10 = null;
        double[] doubleArray12 = new double[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = harmonicFitter1.fit(parametric10, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 3 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) -1);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric15 = null;
        double[] doubleArray17 = new double[] { 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = harmonicFitter1.fit(0, parametric15, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        double[] doubleArray17 = new double[] { 1, 1, 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = harmonicFitter1.fit(doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 100L, (double) 100);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (-1.0d));
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric11 = null;
        double[] doubleArray12 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = harmonicFitter1.fit(parametric11, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric16 = null;
        double[] doubleArray21 = new double[] { 10L, 10L, 10L, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = harmonicFitter1.fit((-1), parametric16, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, 10.0d, 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint(1.0d, (double) 0.0f, (double) 0);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric9 = null;
        double[] doubleArray15 = new double[] { ' ', (short) 100, 10.0d, (short) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = harmonicFitter1.fit(parametric9, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 32.0d, 100.0d, 10.0d, 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint10);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric12 = null;
        double[] doubleArray14 = new double[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = harmonicFitter1.fit(parametric12, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        harmonicFitter1.addObservedPoint((-1.0d), (double) (-1L), (double) 0.0f);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric14 = null;
        double[] doubleArray15 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = harmonicFitter1.fit((int) (byte) 1, parametric14, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint(0.0d, (-1.0d), (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint(0.0d, (double) (-1.0f), (double) 10L);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric15 = null;
        double[] doubleArray17 = new double[] { (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = harmonicFitter1.fit(parametric15, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((double) (byte) 1, (double) ' ');
        double[] doubleArray13 = new double[] { 100.0f, 10L, 10, 100.0d, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = harmonicFitter1.fit(doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, 10.0d, 10.0d, 100.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser19 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray18);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = parameterGuesser19.guess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric11 = null;
        double[] doubleArray13 = new double[] { (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = harmonicFitter1.fit(parametric11, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.addObservedPoint(10.0d, (double) 'a', 0.0d);
        harmonicFitter1.addObservedPoint((double) 100, 0.0d, (double) (byte) -1);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric17 = null;
        double[] doubleArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = harmonicFitter1.fit(parametric17, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L), (double) (byte) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) 1L, 1.0d);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric16 = null;
        double[] doubleArray21 = new double[] { ' ', 100.0f, 100L, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = harmonicFitter1.fit((int) (byte) 0, parametric16, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 32.0d, 100.0d, 100.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((-1.0d), (double) 1.0f);
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (byte) 100);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) 1L, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.clearObservations();
        double[] doubleArray11 = new double[] { ' ', 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = harmonicFitter1.fit(doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 32.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.addObservedPoint(10.0d, (double) 'a', 0.0d);
        harmonicFitter1.addObservedPoint((double) 100, 0.0d, (double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 3 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) (short) -1, (double) (short) 0, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric20 = null;
        double[] doubleArray21 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = harmonicFitter1.fit(parametric20, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        double[] doubleArray14 = new double[] { 1L, (short) 10, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = harmonicFitter1.fit(doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 100L);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric24 = null;
        double[] doubleArray25 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray26 = harmonicFitter1.fit(parametric24, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (-1), (double) '#');
        double[] doubleArray17 = new double[] { 'a', 10.0d, ' ', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = harmonicFitter1.fit(doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 97.0d, 10.0d, 32.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser19 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray18);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser20 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray18);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = parameterGuesser20.guess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) (short) -1, (-1.0d));
        harmonicFitter1.addObservedPoint((double) '#', (double) (byte) 100);
        harmonicFitter1.addObservedPoint(0.0d, (double) 10, (double) 10);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric20 = null;
        double[] doubleArray27 = new double[] { (short) 1, (-1.0f), 0.0f, (byte) 0, 'a', 0L };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray28 = harmonicFitter1.fit((int) (byte) 1, parametric20, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 1.0d, (-1.0d), 0.0d, 0.0d, 97.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint8);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric11 = null;
        double[] doubleArray14 = new double[] { (-1L), '#' };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = harmonicFitter1.fit(1, parametric11, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), 35.0d }, 1.0E-15);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint(0.0d, (double) (byte) 0, (-1.0d));
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric9 = null;
        double[] doubleArray14 = new double[] { (-1.0f), 10, 100.0d, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = harmonicFitter1.fit((int) (byte) 1, parametric9, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), 10.0d, 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) 1, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray12, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray13, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) ' ');
        harmonicFitter1.addObservedPoint((double) '#', (double) (-1L), (double) 0L);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric15 = null;
        double[] doubleArray20 = new double[] { 1.0d, (-1.0d), (-1.0f), 100 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = harmonicFitter1.fit((int) (byte) 1, parametric15, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1.0d, (-1.0d), (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass9 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray8, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.addObservedPoint(10.0d, (double) 'a', 0.0d);
        harmonicFitter1.addObservedPoint((double) 100, 0.0d, (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) 0L, (double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        harmonicFitter1.addObservedPoint((double) 0, (double) (byte) 0);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric22 = null;
        double[] doubleArray29 = new double[] { 1L, '4', (short) 1, (-1.0d), 10.0f, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray30 = harmonicFitter1.fit(parametric22, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 52.0d, 1.0d, (-1.0d), 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) 1, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        double[] doubleArray16 = new double[] { 1, 0.0f, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = harmonicFitter1.fit(doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0d, 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        harmonicFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 1L, 10.0d);
        java.lang.Class<?> wildcardClass17 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser19 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray18);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser20 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray18);
        java.lang.Class<?> wildcardClass21 = weightedObservedPointArray18.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric5 = null;
        double[] doubleArray7 = new double[] { 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = harmonicFitter1.fit(parametric5, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        harmonicFitter1.addObservedPoint((-1.0d), (double) (-1L), (double) 0.0f);
        double[] doubleArray14 = new double[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = harmonicFitter1.fit(doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint(1.0d, (double) 0.0f, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass10 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        harmonicFitter1.clearObservations();
        java.lang.Class<?> wildcardClass16 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) ' ');
        harmonicFitter1.addObservedPoint((double) '#', (double) (-1L), (double) 0L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass15 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        double[] doubleArray16 = new double[] { '#', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = harmonicFitter1.fit(doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 35.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) (short) -1, (-1.0d));
        harmonicFitter1.addObservedPoint((double) '#', (double) (byte) 100);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric15 = null;
        double[] doubleArray21 = new double[] { (byte) 100, 1, 10L, (short) -1, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = harmonicFitter1.fit(parametric15, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d, 1.0d, 10.0d, (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter1.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric22 = null;
        double[] doubleArray29 = new double[] { 10.0d, 'a', 0, 100.0d, 1.0d, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray30 = harmonicFitter1.fit((int) (byte) 100, parametric22, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, 97.0d, 0.0d, 100.0d, 1.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) 1, (double) 0);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric10 = null;
        double[] doubleArray12 = new double[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = harmonicFitter1.fit((int) (short) 1, parametric10, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 32.0d }, 1.0E-15);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint10);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric13 = null;
        double[] doubleArray18 = new double[] { (byte) 10, '#', '4', 100L };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = harmonicFitter1.fit(1, parametric13, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, 35.0d, 52.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 100L, (double) 100);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 1, 1.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser13 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 3 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) 1L, (double) (-1L));
        harmonicFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric15 = null;
        double[] doubleArray19 = new double[] { 100L, ' ', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = harmonicFitter1.fit((int) (byte) 100, parametric15, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 32.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) 100, (double) (short) 0, (double) '4');
        double[] doubleArray25 = new double[] { 10.0d, 0L, (-1.0f), (-1.0d), 10L, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray26 = harmonicFitter1.fit(doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d, 0.0d, (-1.0d), (-1.0d), 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) 10.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric15 = null;
        double[] doubleArray16 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = harmonicFitter1.fit((int) (short) 100, parametric15, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) 1, (double) (short) 10);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric13 = null;
        double[] doubleArray14 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = harmonicFitter1.fit(parametric13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        double[] doubleArray20 = new double[] { 100.0f, ' ', (byte) -1, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = harmonicFitter1.fit(doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d, 32.0d, (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        harmonicFitter1.addObservedPoint((double) 0L, (double) 10, (double) 10.0f);
        harmonicFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray26 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        double[] doubleArray10 = new double[] { 0, 0.0f, '#', (short) 0, 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = harmonicFitter1.fit(doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 0.0d, 35.0d, 0.0d, 1.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        java.lang.Class<?> wildcardClass5 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric9 = null;
        double[] doubleArray14 = new double[] { '#', (-1.0d), 100.0f, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = harmonicFitter1.fit(parametric9, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 35.0d, (-1.0d), 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric14 = null;
        double[] doubleArray20 = new double[] { 10.0d, 1.0d, (short) 10, 0.0d, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = harmonicFitter1.fit((int) (byte) 1, parametric14, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d, 1.0d, 10.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass12 = weightedObservedPointArray11.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint(0.0d, (double) (byte) 0, (-1.0d));
        java.lang.Class<?> wildcardClass8 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (byte) 100);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) 1L, (double) 1.0f);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) 10L, (double) 0L);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric25 = null;
        double[] doubleArray32 = new double[] { 'a', (short) 1, 10L, 1, 0L, 0 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray33 = harmonicFitter1.fit(parametric25, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 97.0d, 1.0d, 10.0d, 1.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) ' ');
        harmonicFitter1.addObservedPoint((double) '#', (double) (-1L), (double) 0L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass15 = weightedObservedPointArray14.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        harmonicFitter1.addObservedPoint((double) 0, (double) 'a', (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass20 = weightedObservedPointArray19.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) 0.0f, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        java.lang.Class<?> wildcardClass21 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) 1, (double) 0);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric10 = null;
        double[] doubleArray13 = new double[] { 10L, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = harmonicFitter1.fit((-1), parametric10, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 100L, (double) 100);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 1, 1.0d);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric14 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer15 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter16 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer15);
        harmonicFitter16.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter16.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter16.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter16.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter16.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = harmonicFitter16.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray35);
        double[] doubleArray37 = parameterGuesser36.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray38 = harmonicFitter1.fit((int) (byte) 0, parametric14, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric19 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer20 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter21 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer20);
        harmonicFitter21.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter21.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter21.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter21.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter21.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray40 = harmonicFitter21.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser41 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray40);
        double[] doubleArray42 = parameterGuesser41.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = harmonicFitter1.fit(parametric19, doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray40);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint8);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        harmonicFitter1.addObservedPoint((double) (short) 0, 0.0d);
        harmonicFitter1.addObservedPoint((double) 0, (double) (-1L));
        double[] doubleArray29 = new double[] { 100, (byte) 100, (short) 0, 100L };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray30 = harmonicFitter1.fit(doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d, 100.0d, 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric10 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer11 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter12 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer11);
        harmonicFitter12.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter12.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter12.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter12.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter12.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray31 = harmonicFitter12.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser32 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray31);
        double[] doubleArray33 = parameterGuesser32.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray34 = harmonicFitter1.fit(parametric10, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray31);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) (short) -1, (-1.0d));
        harmonicFitter1.addObservedPoint((double) '#', (double) (byte) 100);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric15 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer16 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter17 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer16);
        harmonicFitter17.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter17.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter17.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter17.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter17.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = harmonicFitter17.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray36);
        double[] doubleArray38 = parameterGuesser37.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray39 = harmonicFitter1.fit(parametric15, doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric9 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer10 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter11 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer10);
        harmonicFitter11.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter11.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter11.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter11.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter11.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = harmonicFitter11.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray30);
        double[] doubleArray32 = parameterGuesser31.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray33 = harmonicFitter1.fit(parametric9, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (byte) 100);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) 1L, (double) 1.0f);
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray24 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric15 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer16 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter17 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer16);
        harmonicFitter17.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter17.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter17.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter17.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter17.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = harmonicFitter17.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray36);
        double[] doubleArray38 = parameterGuesser37.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray39 = harmonicFitter1.fit(parametric15, doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        harmonicFitter1.addObservedPoint((double) (short) 0, 0.0d);
        harmonicFitter1.addObservedPoint((double) 0, (double) (-1L));
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer25 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter26 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer25);
        harmonicFitter26.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter26.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter26.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter26.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter26.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray45 = harmonicFitter26.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser46 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray45);
        double[] doubleArray47 = parameterGuesser46.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray48 = harmonicFitter1.fit(doubleArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray45);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        double[] doubleArray17 = new double[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = harmonicFitter1.fit(doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray15, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint4);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) 1L, (double) (-1L));
        harmonicFitter1.clearObservations();
        java.lang.Class<?> wildcardClass14 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser10 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L), (double) (byte) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) 1L, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass9 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer5 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter6 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer5);
        harmonicFitter6.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter6.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter6.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter6.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter6.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = harmonicFitter6.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser26 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray25);
        double[] doubleArray27 = parameterGuesser26.guess();
        double[] doubleArray28 = parameterGuesser26.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray29 = harmonicFitter1.fit(doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray10, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer13 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter14 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer13);
        harmonicFitter14.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter14.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter14.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter14.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter14.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = harmonicFitter14.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray35 = parameterGuesser34.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray36 = harmonicFitter1.fit(doubleArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric6 = null;
        double[] doubleArray13 = new double[] { '#', (short) 1, 10.0d, 1L, 1.0f, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = harmonicFitter1.fit(parametric6, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 35.0d, 1.0d, 10.0d, 1.0d, 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric10 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer11 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter12 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer11);
        harmonicFitter12.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter12.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter12.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter12.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter12.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray31 = harmonicFitter12.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser32 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray31);
        double[] doubleArray33 = parameterGuesser32.guess();
        double[] doubleArray34 = parameterGuesser32.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray35 = harmonicFitter1.fit(parametric10, doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray31);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 'a', 1.0d);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser14 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray13, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 100L, (double) 100);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric9 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer10 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter11 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer10);
        harmonicFitter11.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter11.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter11.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter11.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter11.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = harmonicFitter11.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray30);
        double[] doubleArray32 = parameterGuesser31.guess();
        double[] doubleArray33 = parameterGuesser31.guess();
        double[] doubleArray34 = parameterGuesser31.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray35 = harmonicFitter1.fit((int) (short) 100, parametric9, doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint(100.0d, (double) (short) 1, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) 1, (double) (byte) 1, (double) (-1));
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric15 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer16 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter17 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer16);
        harmonicFitter17.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter17.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter17.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter17.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter17.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = harmonicFitter17.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray36);
        double[] doubleArray38 = parameterGuesser37.guess();
        double[] doubleArray39 = parameterGuesser37.guess();
        double[] doubleArray40 = parameterGuesser37.guess();
        double[] doubleArray41 = parameterGuesser37.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray42 = harmonicFitter1.fit((int) ' ', parametric15, doubleArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray5, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric8 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer9 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter10 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer9);
        harmonicFitter10.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter10.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter10.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter10.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter10.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = harmonicFitter10.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray29);
        double[] doubleArray31 = parameterGuesser30.guess();
        double[] doubleArray32 = parameterGuesser30.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray33 = harmonicFitter1.fit(parametric8, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        harmonicFitter1.addObservedPoint((double) 0L, (double) 10, (double) 10.0f);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint26 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint26);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray28 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer20 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter21 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer20);
        harmonicFitter21.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter21.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter21.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter21.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter21.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray40 = harmonicFitter21.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser41 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray40);
        double[] doubleArray42 = parameterGuesser41.guess();
        double[] doubleArray43 = parameterGuesser41.guess();
        double[] doubleArray44 = parameterGuesser41.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray45 = harmonicFitter1.fit(doubleArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertNotNull(weightedObservedPointArray40);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 3 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        harmonicFitter1.addObservedPoint(1.0d, (double) (short) -1);
        java.lang.Class<?> wildcardClass19 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric6 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer7 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter8 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer7);
        harmonicFitter8.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter8.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter8.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter8.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter8.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = harmonicFitter8.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser28 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray27);
        double[] doubleArray29 = parameterGuesser28.guess();
        double[] doubleArray30 = parameterGuesser28.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray31 = harmonicFitter1.fit(parametric6, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L), (double) (byte) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) 10.0f, 100.0d);
        harmonicFitter1.clearObservations();
        java.lang.Class<?> wildcardClass16 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer9 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter10 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer9);
        harmonicFitter10.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter10.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter10.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter10.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter10.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = harmonicFitter10.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray29);
        double[] doubleArray31 = parameterGuesser30.guess();
        double[] doubleArray32 = parameterGuesser30.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray33 = harmonicFitter1.fit(doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (-1), (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 3 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        harmonicFitter1.addObservedPoint((double) (short) 0, 0.0d);
        harmonicFitter1.addObservedPoint((double) 0, (double) (-1L));
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric26 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer27 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter28 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer27);
        harmonicFitter28.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter28.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter28.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter28.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter28.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray47 = harmonicFitter28.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser48 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray47);
        double[] doubleArray49 = parameterGuesser48.guess();
        double[] doubleArray50 = parameterGuesser48.guess();
        double[] doubleArray51 = parameterGuesser48.guess();
        double[] doubleArray52 = parameterGuesser48.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray53 = harmonicFitter1.fit(parametric26, doubleArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray47);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 0, (double) (short) 0);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric7 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer8 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter9 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer8);
        harmonicFitter9.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter9.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter9.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter9.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter9.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = harmonicFitter9.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser29 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray28);
        double[] doubleArray30 = parameterGuesser29.guess();
        double[] doubleArray31 = parameterGuesser29.guess();
        double[] doubleArray32 = parameterGuesser29.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray33 = harmonicFitter1.fit(parametric7, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) ' ');
        harmonicFitter1.addObservedPoint((double) '#', (double) (-1L), (double) 0L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        double[] doubleArray21 = new double[] { (short) 10, 10.0d, 1, (-1L), '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = harmonicFitter1.fit(doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, 10.0d, 1.0d, (-1.0d), 52.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser19 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray18);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser20 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray18);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser21 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray18);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = parameterGuesser21.guess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        double[] doubleArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = harmonicFitter1.fit(doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray10, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        harmonicFitter1.addObservedPoint((double) 0, (double) (byte) 0);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer22 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter23 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer22);
        harmonicFitter23.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter23.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter23.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter23.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter23.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray42 = harmonicFitter23.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser43 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray42);
        double[] doubleArray44 = parameterGuesser43.guess();
        double[] doubleArray45 = parameterGuesser43.guess();
        double[] doubleArray46 = parameterGuesser43.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray47 = harmonicFitter1.fit(doubleArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray42);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer4 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter5 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer4);
        harmonicFitter5.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter5.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter5.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter5.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter5.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = harmonicFitter5.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser25 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray24);
        double[] doubleArray26 = parameterGuesser25.guess();
        double[] doubleArray27 = parameterGuesser25.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray28 = harmonicFitter1.fit(doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        harmonicFitter1.addObservedPoint((double) 10L, (double) 100.0f);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric21 = null;
        double[] doubleArray26 = new double[] { (short) 0, (short) 100, (-1.0f), 10 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray27 = harmonicFitter1.fit(parametric21, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 0.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) 1L, (double) (-1L));
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        java.lang.Class<?> wildcardClass15 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint(100.0d, (double) (short) 1, (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray5, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric14 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer15 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter16 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer15);
        harmonicFitter16.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter16.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter16.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter16.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter16.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = harmonicFitter16.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray35);
        double[] doubleArray37 = parameterGuesser36.guess();
        double[] doubleArray38 = parameterGuesser36.guess();
        double[] doubleArray39 = parameterGuesser36.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray40 = harmonicFitter1.fit(100, parametric14, doubleArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer9 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter10 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer9);
        harmonicFitter10.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter10.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter10.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter10.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter10.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = harmonicFitter10.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray29);
        double[] doubleArray31 = parameterGuesser30.guess();
        double[] doubleArray32 = parameterGuesser30.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray33 = harmonicFitter1.fit(doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray8, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser12 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric12 = null;
        double[] doubleArray18 = new double[] { 100.0f, '4', 100, (-1L), 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = harmonicFitter1.fit((int) (short) 0, parametric12, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray10, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 52.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass14 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        harmonicFitter1.addObservedPoint(1.0d, (double) (short) -1);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer19 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter20 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer19);
        harmonicFitter20.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter20.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter20.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter20.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter20.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray38 = harmonicFitter20.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray39 = harmonicFitter20.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser40 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray39);
        double[] doubleArray41 = parameterGuesser40.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray42 = harmonicFitter1.fit(doubleArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray38);
        org.junit.Assert.assertNotNull(weightedObservedPointArray39);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 100L, (double) 100);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (-1.0d));
        harmonicFitter1.addObservedPoint((double) (byte) 1, 1.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        java.lang.Class<?> wildcardClass16 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        java.lang.Class<?> wildcardClass9 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric12 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer13 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter14 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer13);
        harmonicFitter14.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter14.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter14.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter14.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter14.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = harmonicFitter14.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray35 = parameterGuesser34.guess();
        double[] doubleArray36 = parameterGuesser34.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray37 = harmonicFitter1.fit(parametric12, doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 10.0f, 10.0d, (double) ' ');
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer16 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter17 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer16);
        harmonicFitter17.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter17.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter17.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter17.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter17.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = harmonicFitter17.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray36);
        double[] doubleArray38 = parameterGuesser37.guess();
        double[] doubleArray39 = parameterGuesser37.guess();
        double[] doubleArray40 = parameterGuesser37.guess();
        double[] doubleArray41 = parameterGuesser37.guess();
        double[] doubleArray42 = parameterGuesser37.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = harmonicFitter1.fit(doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) '4', (double) (byte) 10, (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray26 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric16 = null;
        double[] doubleArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = harmonicFitter1.fit(parametric16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) 1L, (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser14 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 3 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) '4', (double) (byte) 10, (double) (short) 1);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric27 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer28 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter29 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer28);
        harmonicFitter29.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter29.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter29.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter29.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter29.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray48 = harmonicFitter29.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser49 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray48);
        double[] doubleArray50 = parameterGuesser49.guess();
        double[] doubleArray51 = parameterGuesser49.guess();
        double[] doubleArray52 = parameterGuesser49.guess();
        double[] doubleArray53 = parameterGuesser49.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray54 = harmonicFitter1.fit((int) (short) 100, parametric27, doubleArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray48);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric17 = null;
        double[] doubleArray22 = new double[] { ' ', 100, (byte) 0, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray23 = harmonicFitter1.fit((int) '4', parametric17, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 32.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.addObservedPoint(10.0d, (double) 'a', 0.0d);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer13 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter14 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer13);
        harmonicFitter14.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter14.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter14.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter14.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter14.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = harmonicFitter14.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray35 = parameterGuesser34.guess();
        double[] doubleArray36 = parameterGuesser34.guess();
        double[] doubleArray37 = parameterGuesser34.guess();
        double[] doubleArray38 = parameterGuesser34.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray39 = harmonicFitter1.fit(doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        harmonicFitter1.addObservedPoint(1.0d, (double) (short) -1);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer19 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter20 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer19);
        harmonicFitter20.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter20.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter20.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter20.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter20.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray39 = harmonicFitter20.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser40 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray39);
        double[] doubleArray41 = parameterGuesser40.guess();
        double[] doubleArray42 = parameterGuesser40.guess();
        double[] doubleArray43 = parameterGuesser40.guess();
        double[] doubleArray44 = parameterGuesser40.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray45 = harmonicFitter1.fit(doubleArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray39);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        harmonicFitter1.addObservedPoint((-1.0d), (double) (-1L), (double) 0.0f);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric14 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer15 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter16 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer15);
        harmonicFitter16.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter16.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter16.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter16.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter16.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = harmonicFitter16.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray35);
        double[] doubleArray37 = parameterGuesser36.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray38 = harmonicFitter1.fit((int) (byte) 100, parametric14, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) 1, (double) 0);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer9 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter10 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer9);
        harmonicFitter10.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter10.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter10.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter10.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter10.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = harmonicFitter10.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray29);
        double[] doubleArray31 = parameterGuesser30.guess();
        double[] doubleArray32 = parameterGuesser30.guess();
        double[] doubleArray33 = parameterGuesser30.guess();
        double[] doubleArray34 = parameterGuesser30.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray35 = harmonicFitter1.fit(doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint(0.0d, (double) (-1.0f), (double) 10L);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer15 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter16 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer15);
        harmonicFitter16.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter16.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter16.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter16.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter16.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = harmonicFitter16.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray35);
        double[] doubleArray37 = parameterGuesser36.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray38 = harmonicFitter1.fit(doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L), (double) (byte) -1);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer9 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter10 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer9);
        harmonicFitter10.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter10.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter10.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter10.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter10.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = harmonicFitter10.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray29);
        double[] doubleArray31 = parameterGuesser30.guess();
        double[] doubleArray32 = parameterGuesser30.guess();
        double[] doubleArray33 = parameterGuesser30.guess();
        double[] doubleArray34 = parameterGuesser30.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray35 = harmonicFitter1.fit(doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) 1L, (double) (-1L));
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric13 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer14 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter15 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer14);
        harmonicFitter15.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter15.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter15.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter15.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter15.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray34 = harmonicFitter15.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray34);
        double[] doubleArray36 = parameterGuesser35.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray37 = harmonicFitter1.fit(parametric13, doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) 1L, (double) (-1L));
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric14 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer15 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter16 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer15);
        harmonicFitter16.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter16.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter16.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter16.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter16.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = harmonicFitter16.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray35);
        double[] doubleArray37 = parameterGuesser36.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray38 = harmonicFitter1.fit((int) (short) 0, parametric14, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 1L, 10.0d);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric18 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer19 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter20 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer19);
        harmonicFitter20.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter20.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter20.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter20.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter20.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray39 = harmonicFitter20.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser40 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray39);
        double[] doubleArray41 = parameterGuesser40.guess();
        double[] doubleArray42 = parameterGuesser40.guess();
        double[] doubleArray43 = parameterGuesser40.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray44 = harmonicFitter1.fit(0, parametric18, doubleArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray39);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint(0.0d, (-1.0d), (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint15);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 'a', 1.0d);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric13 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer14 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter15 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer14);
        harmonicFitter15.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter15.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter15.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter15.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter15.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray34 = harmonicFitter15.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray34);
        double[] doubleArray36 = parameterGuesser35.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray37 = harmonicFitter1.fit((int) (byte) 100, parametric13, doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (byte) 100);
        harmonicFitter1.addObservedPoint(1.0d, (double) 0L, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 100L);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer24 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter25 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer24);
        harmonicFitter25.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter25.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter25.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter25.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter25.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray44 = harmonicFitter25.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser45 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray44);
        double[] doubleArray46 = parameterGuesser45.guess();
        double[] doubleArray47 = parameterGuesser45.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray48 = harmonicFitter1.fit(doubleArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray44);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric11 = null;
        double[] doubleArray16 = new double[] { (byte) -1, 100.0d, 100.0f, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = harmonicFitter1.fit(parametric11, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), 100.0d, 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint4);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer8 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter9 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer8);
        harmonicFitter9.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter9.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter9.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter9.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter9.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = harmonicFitter9.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser29 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray28);
        double[] doubleArray30 = parameterGuesser29.guess();
        double[] doubleArray31 = parameterGuesser29.guess();
        double[] doubleArray32 = parameterGuesser29.guess();
        double[] doubleArray33 = parameterGuesser29.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray34 = harmonicFitter1.fit(doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        java.lang.Class<?> wildcardClass13 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) 'a', (double) 0L);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer18 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter19 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer18);
        harmonicFitter19.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter19.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter19.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter19.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter19.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray38 = harmonicFitter19.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser39 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray38);
        double[] doubleArray40 = parameterGuesser39.guess();
        double[] doubleArray41 = parameterGuesser39.guess();
        double[] doubleArray42 = parameterGuesser39.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = harmonicFitter1.fit(doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 100L, (double) 100);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (-1.0d));
        harmonicFitter1.addObservedPoint((double) (byte) 1, 1.0d);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric15 = null;
        double[] doubleArray20 = new double[] { '#', (-1), (byte) 100, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = harmonicFitter1.fit((int) (short) 0, parametric15, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 35.0d, (-1.0d), 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) 1);
        java.lang.Class<?> wildcardClass7 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint(1.0d, (double) 0.0f, (double) 0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        double[] doubleArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = harmonicFitter1.fit(doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter1.addObservedPoint((double) 0L, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer15 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter16 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer15);
        harmonicFitter16.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter16.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter16.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter16.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter16.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = harmonicFitter16.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray35);
        double[] doubleArray37 = parameterGuesser36.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray38 = harmonicFitter1.fit(doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint4);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.addObservedPoint(1.0d, (double) 10L);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric11 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer12 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter13 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer12);
        harmonicFitter13.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter13.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter13.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter13.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter13.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray32 = harmonicFitter13.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser33 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray32);
        double[] doubleArray34 = parameterGuesser33.guess();
        double[] doubleArray35 = parameterGuesser33.guess();
        double[] doubleArray36 = parameterGuesser33.guess();
        double[] doubleArray37 = parameterGuesser33.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray38 = harmonicFitter1.fit(parametric11, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) '#', (double) 10L);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric12 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer13 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter14 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer13);
        harmonicFitter14.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter14.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter14.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter14.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter14.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = harmonicFitter14.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray35 = parameterGuesser34.guess();
        double[] doubleArray36 = parameterGuesser34.guess();
        double[] doubleArray37 = parameterGuesser34.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray38 = harmonicFitter1.fit(parametric12, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        harmonicFitter1.addObservedPoint(1.0d, (double) (short) -1);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric20 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer21 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter22 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer21);
        harmonicFitter22.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter22.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter22.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter22.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter22.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray40 = harmonicFitter22.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray41 = harmonicFitter22.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser42 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray41);
        double[] doubleArray43 = parameterGuesser42.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray44 = harmonicFitter1.fit(1, parametric20, doubleArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray40);
        org.junit.Assert.assertNotNull(weightedObservedPointArray41);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.addObservedPoint(10.0d, (double) 'a', 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser13 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        java.lang.Class<?> wildcardClass11 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        java.lang.Class<?> wildcardClass13 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 3 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) 1L, (double) (-1L));
        harmonicFitter1.addObservedPoint((double) 10, 10.0d, (double) '4');
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) 'a');
        java.lang.Class<?> wildcardClass20 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer9 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter10 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer9);
        harmonicFitter10.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter10.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter10.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter10.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter10.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = harmonicFitter10.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray29);
        double[] doubleArray31 = parameterGuesser30.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray32 = harmonicFitter1.fit(doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray8, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint(1.0d, (double) 0.0f, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass10 = weightedObservedPointArray9.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser12 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 3 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) 1, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.clearObservations();
        java.lang.Class<?> wildcardClass14 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer9 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter10 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer9);
        harmonicFitter10.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter10.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter10.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter10.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter10.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = harmonicFitter10.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray29);
        double[] doubleArray31 = parameterGuesser30.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray32 = harmonicFitter1.fit(doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer15 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter16 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer15);
        harmonicFitter16.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter16.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter16.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter16.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter16.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = harmonicFitter16.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray35);
        double[] doubleArray37 = parameterGuesser36.guess();
        double[] doubleArray38 = parameterGuesser36.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray39 = harmonicFitter1.fit(doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint4);
        harmonicFitter1.addObservedPoint((double) (byte) 1, (double) ' ', 0.0d);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer10 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter11 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer10);
        harmonicFitter11.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter11.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter11.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter11.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter11.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = harmonicFitter11.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray30);
        double[] doubleArray32 = parameterGuesser31.guess();
        double[] doubleArray33 = parameterGuesser31.guess();
        double[] doubleArray34 = parameterGuesser31.guess();
        double[] doubleArray35 = parameterGuesser31.guess();
        double[] doubleArray36 = parameterGuesser31.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray37 = harmonicFitter1.fit(doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((double) (byte) 1, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric5 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer6 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter7 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer6);
        harmonicFitter7.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter7.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter7.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter7.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter7.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = harmonicFitter7.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser27 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray26);
        double[] doubleArray28 = parameterGuesser27.guess();
        double[] doubleArray29 = parameterGuesser27.guess();
        double[] doubleArray30 = parameterGuesser27.guess();
        double[] doubleArray31 = parameterGuesser27.guess();
        double[] doubleArray32 = parameterGuesser27.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray33 = harmonicFitter1.fit(parametric5, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint(1.0d, (double) 0.0f, (double) 0);
        harmonicFitter1.clearObservations();
        java.lang.Class<?> wildcardClass10 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 100L, (double) 100);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (-1.0d));
        harmonicFitter1.clearObservations();
        java.lang.Class<?> wildcardClass12 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) (short) -1, (-1.0d));
        harmonicFitter1.addObservedPoint((double) '#', (double) (byte) 100);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric16 = null;
        double[] doubleArray23 = new double[] { (short) -1, 0.0d, ' ', 1.0f, 1, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray24 = harmonicFitter1.fit((int) (byte) 1, parametric16, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), 0.0d, 32.0d, 1.0d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        harmonicFitter1.addObservedPoint((double) 0L, (double) 10, (double) 10.0f);
        java.lang.Class<?> wildcardClass25 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) 1, (double) 1L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass28 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray22, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric10 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer11 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter12 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer11);
        harmonicFitter12.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter12.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter12.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter12.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter12.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray31 = harmonicFitter12.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser32 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray31);
        double[] doubleArray33 = parameterGuesser32.guess();
        double[] doubleArray34 = parameterGuesser32.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray35 = harmonicFitter1.fit((int) (byte) 1, parametric10, doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertNotNull(weightedObservedPointArray31);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 'a', 1.0d);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray13, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric8 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer9 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter10 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer9);
        harmonicFitter10.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter10.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter10.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter10.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter10.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = harmonicFitter10.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray29);
        double[] doubleArray31 = parameterGuesser30.guess();
        double[] doubleArray32 = parameterGuesser30.guess();
        double[] doubleArray33 = parameterGuesser30.guess();
        double[] doubleArray34 = parameterGuesser30.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray35 = harmonicFitter1.fit(parametric8, doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray5, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer12 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter13 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer12);
        harmonicFitter13.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter13.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter13.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter13.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter13.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray32 = harmonicFitter13.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser33 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray32);
        double[] doubleArray34 = parameterGuesser33.guess();
        double[] doubleArray35 = parameterGuesser33.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray36 = harmonicFitter1.fit(doubleArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint(1.0d, (double) 0.0f, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer10 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter11 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer10);
        harmonicFitter11.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter11.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter11.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter11.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter11.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = harmonicFitter11.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray30);
        double[] doubleArray32 = parameterGuesser31.guess();
        double[] doubleArray33 = parameterGuesser31.guess();
        double[] doubleArray34 = parameterGuesser31.guess();
        double[] doubleArray35 = parameterGuesser31.guess();
        double[] doubleArray36 = parameterGuesser31.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray37 = harmonicFitter1.fit(doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric13 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer14 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter15 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer14);
        harmonicFitter15.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter15.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter15.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter15.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter15.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray34 = harmonicFitter15.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray34);
        double[] doubleArray36 = parameterGuesser35.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray37 = harmonicFitter1.fit((int) (short) -1, parametric13, doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint10);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric12 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer13 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter14 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer13);
        harmonicFitter14.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter14.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter14.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter14.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter14.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = harmonicFitter14.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray35 = parameterGuesser34.guess();
        double[] doubleArray36 = parameterGuesser34.guess();
        double[] doubleArray37 = parameterGuesser34.guess();
        double[] doubleArray38 = parameterGuesser34.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray39 = harmonicFitter1.fit(parametric12, doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer16 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter17 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer16);
        harmonicFitter17.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter17.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter17.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter17.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter17.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = harmonicFitter17.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray36);
        double[] doubleArray38 = parameterGuesser37.guess();
        double[] doubleArray39 = parameterGuesser37.guess();
        double[] doubleArray40 = parameterGuesser37.guess();
        double[] doubleArray41 = parameterGuesser37.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray42 = harmonicFitter1.fit(doubleArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter1.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser21 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray20);
        java.lang.Class<?> wildcardClass22 = parameterGuesser21.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) 0, (double) 100);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer10 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter11 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer10);
        harmonicFitter11.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter11.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter11.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter11.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter11.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = harmonicFitter11.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray30);
        double[] doubleArray32 = parameterGuesser31.guess();
        double[] doubleArray33 = parameterGuesser31.guess();
        double[] doubleArray34 = parameterGuesser31.guess();
        double[] doubleArray35 = parameterGuesser31.guess();
        double[] doubleArray36 = parameterGuesser31.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray37 = harmonicFitter1.fit(doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        java.lang.Class<?> wildcardClass17 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer16 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter17 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer16);
        harmonicFitter17.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter17.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter17.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter17.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter17.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = harmonicFitter17.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray36);
        double[] doubleArray38 = parameterGuesser37.guess();
        double[] doubleArray39 = parameterGuesser37.guess();
        double[] doubleArray40 = parameterGuesser37.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray41 = harmonicFitter1.fit(doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) 10.0f, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 3 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 3 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint(0.0d, (double) 1L);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric15 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer16 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter17 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer16);
        harmonicFitter17.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter17.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter17.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter17.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter17.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = harmonicFitter17.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray36);
        double[] doubleArray38 = parameterGuesser37.guess();
        double[] doubleArray39 = parameterGuesser37.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray40 = harmonicFitter1.fit((int) (byte) 10, parametric15, doubleArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass12 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass23 = weightedObservedPointArray22.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray22, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray8, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 10.0f, 10.0d, (double) ' ');
        harmonicFitter1.addObservedPoint((double) (byte) 1, (double) (short) -1);
        java.lang.Class<?> wildcardClass19 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 100L, (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) 0.0f, (double) 10);
        harmonicFitter1.clearObservations();
        java.lang.Class<?> wildcardClass13 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = harmonicFitter1.getObservations();
        double[] doubleArray13 = new double[] { 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = harmonicFitter1.fit(doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (byte) 100);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) 1L, (double) 1.0f);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric21 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer22 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter23 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer22);
        harmonicFitter23.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter23.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter23.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter23.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter23.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray42 = harmonicFitter23.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser43 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray42);
        double[] doubleArray44 = parameterGuesser43.guess();
        double[] doubleArray45 = parameterGuesser43.guess();
        double[] doubleArray46 = parameterGuesser43.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray47 = harmonicFitter1.fit(parametric21, doubleArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray42);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 100L, (double) 100);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (-1.0d));
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 1, 10.0d, (double) (-1));
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric17 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer18 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter19 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer18);
        harmonicFitter19.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter19.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter19.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter19.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter19.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray38 = harmonicFitter19.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser39 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray38);
        double[] doubleArray40 = parameterGuesser39.guess();
        double[] doubleArray41 = parameterGuesser39.guess();
        double[] doubleArray42 = parameterGuesser39.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = harmonicFitter1.fit((int) '#', parametric17, doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 0, (double) (short) 0);
        java.lang.Class<?> wildcardClass7 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        harmonicFitter1.addObservedPoint((double) (short) 0, 0.0d);
        harmonicFitter1.addObservedPoint((double) 0, (double) (-1L));
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric26 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer27 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter28 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer27);
        harmonicFitter28.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter28.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter28.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter28.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter28.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray47 = harmonicFitter28.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser48 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray47);
        double[] doubleArray49 = parameterGuesser48.guess();
        double[] doubleArray50 = parameterGuesser48.guess();
        double[] doubleArray51 = parameterGuesser48.guess();
        double[] doubleArray52 = parameterGuesser48.guess();
        double[] doubleArray53 = parameterGuesser48.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray54 = harmonicFitter1.fit(0, parametric26, doubleArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray47);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer16 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter17 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer16);
        harmonicFitter17.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter17.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter17.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter17.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter17.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = harmonicFitter17.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = harmonicFitter17.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray36);
        double[] doubleArray38 = parameterGuesser37.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray39 = harmonicFitter1.fit(doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 0, (double) (short) 0);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric7 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer8 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter9 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer8);
        harmonicFitter9.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter9.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter9.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter9.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter9.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = harmonicFitter9.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser29 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray28);
        double[] doubleArray30 = parameterGuesser29.guess();
        double[] doubleArray31 = parameterGuesser29.guess();
        double[] doubleArray32 = parameterGuesser29.guess();
        double[] doubleArray33 = parameterGuesser29.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray34 = harmonicFitter1.fit(parametric7, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        java.lang.Class<?> wildcardClass11 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 0, 1.0d);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric6 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer7 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter8 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer7);
        harmonicFitter8.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter8.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter8.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter8.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter8.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = harmonicFitter8.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser28 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray27);
        double[] doubleArray29 = parameterGuesser28.guess();
        double[] doubleArray30 = parameterGuesser28.guess();
        double[] doubleArray31 = parameterGuesser28.guess();
        double[] doubleArray32 = parameterGuesser28.guess();
        double[] doubleArray33 = parameterGuesser28.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray34 = harmonicFitter1.fit(parametric6, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) 1L, (double) (-1L));
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 1, (double) (-1.0f), (double) 1.0f);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric19 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer20 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter21 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer20);
        harmonicFitter21.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter21.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter21.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter21.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter21.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray39 = harmonicFitter21.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray40 = harmonicFitter21.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser41 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray40);
        double[] doubleArray42 = parameterGuesser41.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = harmonicFitter1.fit(0, parametric19, doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray39);
        org.junit.Assert.assertNotNull(weightedObservedPointArray40);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 1, 100.0d);
        harmonicFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric15 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer16 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter17 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer16);
        harmonicFitter17.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter17.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter17.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter17.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter17.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = harmonicFitter17.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray36);
        double[] doubleArray38 = parameterGuesser37.guess();
        double[] doubleArray39 = parameterGuesser37.guess();
        double[] doubleArray40 = parameterGuesser37.guess();
        double[] doubleArray41 = parameterGuesser37.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray42 = harmonicFitter1.fit(parametric15, doubleArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((-1.0d), (double) 1.0f);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric7 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer8 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter9 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer8);
        harmonicFitter9.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter9.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter9.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter9.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter9.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = harmonicFitter9.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser29 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray28);
        double[] doubleArray30 = parameterGuesser29.guess();
        double[] doubleArray31 = parameterGuesser29.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray32 = harmonicFitter1.fit(parametric7, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter1.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint21 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint21);
        harmonicFitter1.addObservedPoint((double) (-1), (double) 0L);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer26 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter27 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer26);
        harmonicFitter27.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter27.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter27.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter27.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter27.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray46 = harmonicFitter27.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser47 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray46);
        double[] doubleArray48 = parameterGuesser47.guess();
        double[] doubleArray49 = parameterGuesser47.guess();
        double[] doubleArray50 = parameterGuesser47.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray51 = harmonicFitter1.fit(doubleArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(weightedObservedPointArray46);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        double[] doubleArray21 = new double[] { '4', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = harmonicFitter1.fit(doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 52.0d, 52.0d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric8 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer9 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter10 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer9);
        harmonicFitter10.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter10.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter10.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter10.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter10.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = harmonicFitter10.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray29);
        double[] doubleArray31 = parameterGuesser30.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray32 = harmonicFitter1.fit(parametric8, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) 1L, (double) (-1L));
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 1, (double) (-1.0f), (double) 1.0f);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer18 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter19 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer18);
        harmonicFitter19.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter19.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter19.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter19.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter19.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray38 = harmonicFitter19.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser39 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray38);
        double[] doubleArray40 = parameterGuesser39.guess();
        double[] doubleArray41 = parameterGuesser39.guess();
        double[] doubleArray42 = parameterGuesser39.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = harmonicFitter1.fit(doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser14 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        harmonicFitter1.addObservedPoint((double) 0, (double) 'a', (double) 100.0f);
        harmonicFitter1.addObservedPoint((-1.0d), (double) (short) 100, 0.0d);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric9 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer10 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter11 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer10);
        harmonicFitter11.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter11.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter11.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter11.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter11.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = harmonicFitter11.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray30);
        double[] doubleArray32 = parameterGuesser31.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray33 = harmonicFitter1.fit(parametric9, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 0L, (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) 1, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 3 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.clearObservations();
        double[] doubleArray18 = new double[] { (-1), (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = harmonicFitter1.fit(doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer19 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter20 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer19);
        harmonicFitter20.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter20.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter20.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter20.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter20.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray39 = harmonicFitter20.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser40 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray39);
        double[] doubleArray41 = parameterGuesser40.guess();
        double[] doubleArray42 = parameterGuesser40.guess();
        double[] doubleArray43 = parameterGuesser40.guess();
        double[] doubleArray44 = parameterGuesser40.guess();
        double[] doubleArray45 = parameterGuesser40.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray46 = harmonicFitter1.fit(doubleArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray39);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        java.lang.Class<?> wildcardClass21 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric16 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer17 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter18 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer17);
        harmonicFitter18.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter18.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter18.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter18.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter18.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray37 = harmonicFitter18.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser38 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray37);
        double[] doubleArray39 = parameterGuesser38.guess();
        double[] doubleArray40 = parameterGuesser38.guess();
        double[] doubleArray41 = parameterGuesser38.guess();
        double[] doubleArray42 = parameterGuesser38.guess();
        double[] doubleArray43 = parameterGuesser38.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray44 = harmonicFitter1.fit((int) (short) 1, parametric16, doubleArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray37);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric14 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer15 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter16 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer15);
        harmonicFitter16.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter16.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter16.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter16.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter16.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = harmonicFitter16.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray35);
        double[] doubleArray37 = parameterGuesser36.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray38 = harmonicFitter1.fit((int) (short) 10, parametric14, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.addObservedPoint((double) 10L, 0.0d, (double) '#');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric13 = null;
        double[] doubleArray20 = new double[] { 10, (short) 100, 1.0f, '4', (byte) 100, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = harmonicFitter1.fit((int) (byte) 0, parametric13, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d, 100.0d, 1.0d, 52.0d, 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        harmonicFitter1.addObservedPoint((double) 1, (double) 0, (-1.0d));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser14 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 3 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        java.lang.Class<?> wildcardClass13 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric6 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer7 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter8 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer7);
        harmonicFitter8.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter8.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter8.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter8.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter8.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = harmonicFitter8.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser28 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray27);
        double[] doubleArray29 = parameterGuesser28.guess();
        double[] doubleArray30 = parameterGuesser28.guess();
        double[] doubleArray31 = parameterGuesser28.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray32 = harmonicFitter1.fit(parametric6, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer13 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter14 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer13);
        harmonicFitter14.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter14.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter14.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter14.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter14.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = harmonicFitter14.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray35 = parameterGuesser34.guess();
        double[] doubleArray36 = parameterGuesser34.guess();
        double[] doubleArray37 = parameterGuesser34.guess();
        double[] doubleArray38 = parameterGuesser34.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray39 = harmonicFitter1.fit(doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (-1L), (double) 100.0f, (double) (short) 10);
        java.lang.Class<?> wildcardClass18 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) 1L, 0.0d, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint18);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer20 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter21 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer20);
        harmonicFitter21.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter21.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter21.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter21.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter21.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray40 = harmonicFitter21.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser41 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray40);
        double[] doubleArray42 = parameterGuesser41.guess();
        double[] doubleArray43 = parameterGuesser41.guess();
        double[] doubleArray44 = parameterGuesser41.guess();
        double[] doubleArray45 = parameterGuesser41.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray46 = harmonicFitter1.fit(doubleArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray40);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint10);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric12 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer13 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter14 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer13);
        harmonicFitter14.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter14.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter14.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter14.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter14.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = harmonicFitter14.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray35 = parameterGuesser34.guess();
        double[] doubleArray36 = parameterGuesser34.guess();
        double[] doubleArray37 = parameterGuesser34.guess();
        double[] doubleArray38 = parameterGuesser34.guess();
        double[] doubleArray39 = parameterGuesser34.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray40 = harmonicFitter1.fit(parametric12, doubleArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) 0, (double) 100);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer11 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter12 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer11);
        harmonicFitter12.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter12.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter12.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter12.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter12.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray31 = harmonicFitter12.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser32 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray31);
        double[] doubleArray33 = parameterGuesser32.guess();
        double[] doubleArray34 = parameterGuesser32.guess();
        double[] doubleArray35 = parameterGuesser32.guess();
        double[] doubleArray36 = parameterGuesser32.guess();
        double[] doubleArray37 = parameterGuesser32.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray38 = harmonicFitter1.fit(doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray31);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) 1, (double) 1L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser28 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray22, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 10.0f, 1.0d, (double) 100L);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric24 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer25 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter26 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer25);
        harmonicFitter26.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter26.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter26.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter26.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter26.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray45 = harmonicFitter26.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser46 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray45);
        double[] doubleArray47 = parameterGuesser46.guess();
        double[] doubleArray48 = parameterGuesser46.guess();
        double[] doubleArray49 = parameterGuesser46.guess();
        double[] doubleArray50 = parameterGuesser46.guess();
        double[] doubleArray51 = parameterGuesser46.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray52 = harmonicFitter1.fit((int) 'a', parametric24, doubleArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray45);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) 0.0f, (double) (byte) 10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint10);
        harmonicFitter1.clearObservations();
        java.lang.Class<?> wildcardClass13 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) 0, (double) 100);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer9 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter10 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer9);
        harmonicFitter10.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter10.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter10.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter10.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter10.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = harmonicFitter10.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray29);
        double[] doubleArray31 = parameterGuesser30.guess();
        double[] doubleArray32 = parameterGuesser30.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray33 = harmonicFitter1.fit(doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) (short) -1, (-1.0d));
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric12 = null;
        double[] doubleArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = harmonicFitter1.fit(parametric12, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer9 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter10 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer9);
        harmonicFitter10.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter10.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter10.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter10.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter10.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = harmonicFitter10.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = harmonicFitter10.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray29);
        double[] doubleArray31 = parameterGuesser30.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray32 = harmonicFitter1.fit(doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) 1, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) 10);
        double[] doubleArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = harmonicFitter1.fit(doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray12, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric5 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer6 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter7 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer6);
        harmonicFitter7.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter7.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter7.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter7.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter7.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = harmonicFitter7.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = harmonicFitter7.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser27 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray26);
        double[] doubleArray28 = parameterGuesser27.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray29 = harmonicFitter1.fit(parametric5, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 'a', 1.0d);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric13 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer14 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter15 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer14);
        harmonicFitter15.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter15.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter15.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter15.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter15.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray34 = harmonicFitter15.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray34);
        double[] doubleArray36 = parameterGuesser35.guess();
        double[] doubleArray37 = parameterGuesser35.guess();
        double[] doubleArray38 = parameterGuesser35.guess();
        double[] doubleArray39 = parameterGuesser35.guess();
        double[] doubleArray40 = parameterGuesser35.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray41 = harmonicFitter1.fit(parametric13, doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (-1), (double) '#');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser14 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 3 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric24 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer25 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter26 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer25);
        harmonicFitter26.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter26.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter26.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter26.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter26.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray45 = harmonicFitter26.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser46 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray45);
        double[] doubleArray47 = parameterGuesser46.guess();
        double[] doubleArray48 = parameterGuesser46.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray49 = harmonicFitter1.fit(parametric24, doubleArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray22, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray23, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray45);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        harmonicFitter1.addObservedPoint((double) (short) 0, 0.0d);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint23 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint23);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric26 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer27 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter28 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer27);
        harmonicFitter28.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter28.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter28.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter28.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter28.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray47 = harmonicFitter28.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser48 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray47);
        double[] doubleArray49 = parameterGuesser48.guess();
        double[] doubleArray50 = parameterGuesser48.guess();
        double[] doubleArray51 = parameterGuesser48.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray52 = harmonicFitter1.fit(0, parametric26, doubleArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray47);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.addObservedPoint(10.0d, (double) 'a', 0.0d);
        harmonicFitter1.addObservedPoint((double) 100, 0.0d, (double) (byte) -1);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) (-1L));
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric20 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer21 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter22 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer21);
        harmonicFitter22.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter22.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter22.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter22.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter22.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray41 = harmonicFitter22.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser42 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray41);
        double[] doubleArray43 = parameterGuesser42.guess();
        double[] doubleArray44 = parameterGuesser42.guess();
        double[] doubleArray45 = parameterGuesser42.guess();
        double[] doubleArray46 = parameterGuesser42.guess();
        double[] doubleArray47 = parameterGuesser42.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray48 = harmonicFitter1.fit(parametric20, doubleArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray41);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass24 = weightedObservedPointArray23.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray22, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray23, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L), (double) (byte) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) 1L, 0.0d, (double) (-1.0f));
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric18 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer19 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter20 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer19);
        harmonicFitter20.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter20.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter20.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter20.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter20.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray39 = harmonicFitter20.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser40 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray39);
        double[] doubleArray41 = parameterGuesser40.guess();
        double[] doubleArray42 = parameterGuesser40.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = harmonicFitter1.fit(parametric18, doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray39);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer13 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter14 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer13);
        harmonicFitter14.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter14.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter14.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter14.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter14.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = harmonicFitter14.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray35 = parameterGuesser34.guess();
        double[] doubleArray36 = parameterGuesser34.guess();
        double[] doubleArray37 = parameterGuesser34.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray38 = harmonicFitter1.fit(doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        harmonicFitter1.addObservedPoint((double) (short) 0, 0.0d);
        harmonicFitter1.addObservedPoint((double) 0, (double) (-1L));
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric27 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer28 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter29 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer28);
        harmonicFitter29.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter29.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter29.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter29.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter29.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray47 = harmonicFitter29.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray48 = harmonicFitter29.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser49 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray48);
        double[] doubleArray50 = parameterGuesser49.guess();
        double[] doubleArray51 = parameterGuesser49.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray52 = harmonicFitter1.fit((int) (short) 10, parametric27, doubleArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray47);
        org.junit.Assert.assertNotNull(weightedObservedPointArray48);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.addObservedPoint(10.0d, (double) 'a', 0.0d);
        harmonicFitter1.addObservedPoint((double) 100, 0.0d, (double) (byte) -1);
        harmonicFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint22);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray24 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) ' ');
        harmonicFitter1.addObservedPoint((double) '#', (double) (-1L), (double) 0L);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric15 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer16 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter17 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer16);
        harmonicFitter17.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter17.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter17.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter17.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter17.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = harmonicFitter17.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray36);
        double[] doubleArray38 = parameterGuesser37.guess();
        double[] doubleArray39 = parameterGuesser37.guess();
        double[] doubleArray40 = parameterGuesser37.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray41 = harmonicFitter1.fit((int) (short) 100, parametric15, doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric23 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer24 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter25 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer24);
        harmonicFitter25.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter25.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter25.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter25.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter25.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray44 = harmonicFitter25.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser45 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray44);
        double[] doubleArray46 = parameterGuesser45.guess();
        double[] doubleArray47 = parameterGuesser45.guess();
        double[] doubleArray48 = parameterGuesser45.guess();
        double[] doubleArray49 = parameterGuesser45.guess();
        double[] doubleArray50 = parameterGuesser45.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray51 = harmonicFitter1.fit(parametric23, doubleArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray22, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray44);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.addObservedPoint((double) 1, (double) (short) 0, (double) 0);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric12 = null;
        double[] doubleArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = harmonicFitter1.fit(parametric12, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer13 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter14 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer13);
        harmonicFitter14.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter14.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter14.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter14.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter14.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = harmonicFitter14.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray35 = parameterGuesser34.guess();
        double[] doubleArray36 = parameterGuesser34.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray37 = harmonicFitter1.fit(doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        harmonicFitter1.addObservedPoint(1.0d, 0.0d, (double) ' ');
        java.lang.Class<?> wildcardClass13 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (byte) 100);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) 1L, (double) 1.0f);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) 10L, (double) 0L);
        harmonicFitter1.addObservedPoint((double) 1.0f, (double) ' ');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray30 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass11 = weightedObservedPointArray10.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray10, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 10, (double) (short) 0, (double) 0.0f);
        java.lang.Class<?> wildcardClass15 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) (short) -1, (-1.0d));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer15 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter16 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer15);
        harmonicFitter16.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter16.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter16.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter16.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter16.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray34 = harmonicFitter16.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = harmonicFitter16.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray35);
        double[] doubleArray37 = parameterGuesser36.guess();
        double[] doubleArray38 = parameterGuesser36.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray39 = harmonicFitter1.fit(doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) 10.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric16 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer17 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter18 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer17);
        harmonicFitter18.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter18.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter18.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter18.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter18.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray37 = harmonicFitter18.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser38 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray37);
        double[] doubleArray39 = parameterGuesser38.guess();
        double[] doubleArray40 = parameterGuesser38.guess();
        double[] doubleArray41 = parameterGuesser38.guess();
        double[] doubleArray42 = parameterGuesser38.guess();
        double[] doubleArray43 = parameterGuesser38.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray44 = harmonicFitter1.fit((int) (byte) 100, parametric16, doubleArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray37);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer9 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter10 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer9);
        harmonicFitter10.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter10.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter10.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter10.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter10.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = harmonicFitter10.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray29);
        double[] doubleArray31 = parameterGuesser30.guess();
        double[] doubleArray32 = parameterGuesser30.guess();
        double[] doubleArray33 = parameterGuesser30.guess();
        double[] doubleArray34 = parameterGuesser30.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray35 = harmonicFitter1.fit(doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray8, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) 100.0f, (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray5, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint(100.0d, (double) (short) 1, (double) (byte) 0);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer10 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter11 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer10);
        harmonicFitter11.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter11.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter11.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter11.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter11.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = harmonicFitter11.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray30);
        double[] doubleArray32 = parameterGuesser31.guess();
        double[] doubleArray33 = parameterGuesser31.guess();
        double[] doubleArray34 = parameterGuesser31.guess();
        double[] doubleArray35 = parameterGuesser31.guess();
        double[] doubleArray36 = parameterGuesser31.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray37 = harmonicFitter1.fit(doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray5, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) 1, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) ' ');
        harmonicFitter1.addObservedPoint((double) 10L, (double) 0.0f, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint(0.0d, (double) (-1.0f), (double) 10L);
        java.lang.Class<?> wildcardClass15 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) '4', (double) (byte) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric21 = null;
        double[] doubleArray26 = new double[] { 10.0d, 0.0f, (byte) 100, 0L };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray27 = harmonicFitter1.fit((int) (short) -1, parametric21, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d, 0.0d, 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser9 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) 1L, (double) (-1L));
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric15 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer16 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter17 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer16);
        harmonicFitter17.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter17.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter17.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter17.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter17.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = harmonicFitter17.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray36);
        double[] doubleArray38 = parameterGuesser37.guess();
        double[] doubleArray39 = parameterGuesser37.guess();
        double[] doubleArray40 = parameterGuesser37.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray41 = harmonicFitter1.fit((int) '#', parametric15, doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) (short) 0, (double) '4');
        double[] doubleArray14 = new double[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = harmonicFitter1.fit(doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 35.0d }, 1.0E-15);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) 1, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric14 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer15 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter16 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer15);
        harmonicFitter16.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter16.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter16.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter16.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter16.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray34 = harmonicFitter16.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = harmonicFitter16.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray35);
        double[] doubleArray37 = parameterGuesser36.guess();
        double[] doubleArray38 = parameterGuesser36.guess();
        double[] doubleArray39 = parameterGuesser36.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray40 = harmonicFitter1.fit((int) '4', parametric14, doubleArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray12, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) 100, (double) (short) 0, (double) '4');
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric19 = null;
        double[] doubleArray21 = new double[] { 1L };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = harmonicFitter1.fit(parametric19, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) 0, (double) 100);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric9 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer10 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter11 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer10);
        harmonicFitter11.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter11.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter11.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter11.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter11.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = harmonicFitter11.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = harmonicFitter11.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray30);
        double[] doubleArray32 = parameterGuesser31.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray33 = harmonicFitter1.fit(parametric9, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L), (double) (byte) -1);
        java.lang.Class<?> wildcardClass9 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) 100.0f, (double) 100L);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric17 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer18 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter19 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer18);
        harmonicFitter19.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter19.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter19.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter19.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter19.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray37 = harmonicFitter19.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray38 = harmonicFitter19.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser39 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray38);
        double[] doubleArray40 = parameterGuesser39.guess();
        double[] doubleArray41 = parameterGuesser39.guess();
        double[] doubleArray42 = parameterGuesser39.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = harmonicFitter1.fit(parametric17, doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray37);
        org.junit.Assert.assertNotNull(weightedObservedPointArray38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint17);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric12 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer13 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter14 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer13);
        harmonicFitter14.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter14.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter14.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter14.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter14.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = harmonicFitter14.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray35 = parameterGuesser34.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray36 = harmonicFitter1.fit((int) '#', parametric12, doubleArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint(0.0d, (-1.0d), (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint15);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric17 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer18 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter19 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer18);
        harmonicFitter19.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter19.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter19.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter19.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter19.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray37 = harmonicFitter19.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray38 = harmonicFitter19.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser39 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray38);
        double[] doubleArray40 = parameterGuesser39.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray41 = harmonicFitter1.fit(parametric17, doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray37);
        org.junit.Assert.assertNotNull(weightedObservedPointArray38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) ' ');
        harmonicFitter1.addObservedPoint((double) (short) -1, (double) 0);
        java.lang.Class<?> wildcardClass13 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 100L, (double) 100);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (-1.0d));
        harmonicFitter1.addObservedPoint((double) (byte) 1, 1.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer16 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter17 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer16);
        harmonicFitter17.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter17.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter17.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter17.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter17.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = harmonicFitter17.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = harmonicFitter17.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray36);
        double[] doubleArray38 = parameterGuesser37.guess();
        double[] doubleArray39 = parameterGuesser37.guess();
        double[] doubleArray40 = parameterGuesser37.guess();
        double[] doubleArray41 = parameterGuesser37.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray42 = harmonicFitter1.fit(doubleArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 100L, (double) 100);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 1, 1.0d);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric12 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer13 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter14 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer13);
        harmonicFitter14.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter14.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter14.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter14.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter14.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = harmonicFitter14.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray35 = parameterGuesser34.guess();
        double[] doubleArray36 = parameterGuesser34.guess();
        double[] doubleArray37 = parameterGuesser34.guess();
        double[] doubleArray38 = parameterGuesser34.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray39 = harmonicFitter1.fit(parametric12, doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer16 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter17 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer16);
        harmonicFitter17.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter17.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter17.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter17.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter17.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = harmonicFitter17.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = harmonicFitter17.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray36);
        double[] doubleArray38 = parameterGuesser37.guess();
        double[] doubleArray39 = parameterGuesser37.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray40 = harmonicFitter1.fit(doubleArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 1, (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer20 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter21 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer20);
        harmonicFitter21.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter21.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter21.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter21.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter21.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray39 = harmonicFitter21.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray40 = harmonicFitter21.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser41 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray40);
        double[] doubleArray42 = parameterGuesser41.guess();
        double[] doubleArray43 = parameterGuesser41.guess();
        double[] doubleArray44 = parameterGuesser41.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray45 = harmonicFitter1.fit(doubleArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertNotNull(weightedObservedPointArray39);
        org.junit.Assert.assertNotNull(weightedObservedPointArray40);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        harmonicFitter1.addObservedPoint((double) (short) 0, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint22);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric25 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer26 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter27 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer26);
        harmonicFitter27.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter27.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter27.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter27.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter27.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray46 = harmonicFitter27.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser47 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray46);
        double[] doubleArray48 = parameterGuesser47.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray49 = harmonicFitter1.fit((int) (short) -1, parametric25, doubleArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray46);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100L, 10.0d);
        java.lang.Class<?> wildcardClass12 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint(0.0d, (-1.0d), (double) 0);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric15 = null;
        double[] doubleArray21 = new double[] { 100, 100L, 10L, 0L, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = harmonicFitter1.fit(parametric15, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d, 100.0d, 10.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) ' ', (double) 0.0f);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric11 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer12 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter13 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer12);
        harmonicFitter13.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter13.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter13.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter13.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter13.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray32 = harmonicFitter13.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser33 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray32);
        double[] doubleArray34 = parameterGuesser33.guess();
        double[] doubleArray35 = parameterGuesser33.guess();
        double[] doubleArray36 = parameterGuesser33.guess();
        double[] doubleArray37 = parameterGuesser33.guess();
        double[] doubleArray38 = parameterGuesser33.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray39 = harmonicFitter1.fit(0, parametric11, doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray5, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric17 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer18 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter19 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer18);
        harmonicFitter19.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter19.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        harmonicFitter19.addObservedPoint((double) (short) -1, (-1.0d));
        harmonicFitter19.addObservedPoint((double) '#', (double) (byte) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = harmonicFitter19.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray35 = parameterGuesser34.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray36 = harmonicFitter1.fit((int) (short) 100, parametric17, doubleArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint(100.0d, (double) (short) 1, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) 1, (double) (byte) 1, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray5, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser10 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric9 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer10 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter11 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer10);
        harmonicFitter11.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter11.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter11.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter11.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter11.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = harmonicFitter11.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray30);
        double[] doubleArray32 = parameterGuesser31.guess();
        double[] doubleArray33 = parameterGuesser31.guess();
        double[] doubleArray34 = parameterGuesser31.guess();
        double[] doubleArray35 = parameterGuesser31.guess();
        double[] doubleArray36 = parameterGuesser31.guess();
        double[] doubleArray37 = parameterGuesser31.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray38 = harmonicFitter1.fit(parametric9, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        java.lang.Class<?> wildcardClass3 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) '#', (double) 10L);
        java.lang.Class<?> wildcardClass12 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint4);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer6 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter7 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer6);
        harmonicFitter7.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter7.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        harmonicFitter7.addObservedPoint((double) (short) -1, (-1.0d));
        harmonicFitter7.addObservedPoint((double) '#', (double) (byte) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = harmonicFitter7.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser22 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray21);
        double[] doubleArray23 = parameterGuesser22.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray24 = harmonicFitter1.fit(doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) 'a', (double) 0L);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric19 = null;
        double[] doubleArray20 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = harmonicFitter1.fit((int) (short) 100, parametric19, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) (short) 0, (double) '4');
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric14 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer15 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter16 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer15);
        harmonicFitter16.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter16.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter16.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter16.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter16.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = harmonicFitter16.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray35);
        double[] doubleArray37 = parameterGuesser36.guess();
        double[] doubleArray38 = parameterGuesser36.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray39 = harmonicFitter1.fit((int) (short) -1, parametric14, doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.addObservedPoint(10.0d, (double) 'a', 0.0d);
        harmonicFitter1.addObservedPoint((double) 100, 0.0d, (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) 0L, (double) (short) 0);
        harmonicFitter1.addObservedPoint((double) 0, (double) (short) 0, (double) (byte) -1);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric24 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer25 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter26 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer25);
        harmonicFitter26.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter26.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter26.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter26.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter26.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray44 = harmonicFitter26.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray45 = harmonicFitter26.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser46 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray45);
        double[] doubleArray47 = parameterGuesser46.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray48 = harmonicFitter1.fit((int) '4', parametric24, doubleArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray44);
        org.junit.Assert.assertNotNull(weightedObservedPointArray45);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) 1, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass14 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) 1L, 0.0d, (double) (-1.0f));
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 0, (double) (byte) 100);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric22 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer23 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter24 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer23);
        harmonicFitter24.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter24.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter24.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter24.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter24.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray42 = harmonicFitter24.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray43 = harmonicFitter24.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser44 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray43);
        double[] doubleArray45 = parameterGuesser44.guess();
        double[] doubleArray46 = parameterGuesser44.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray47 = harmonicFitter1.fit(parametric22, doubleArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray42);
        org.junit.Assert.assertNotNull(weightedObservedPointArray43);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint(0.0d, (-1.0d), (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint15);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer17 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter18 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer17);
        harmonicFitter18.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter18.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter18.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter18.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter18.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray37 = harmonicFitter18.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser38 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray37);
        double[] doubleArray39 = parameterGuesser38.guess();
        double[] doubleArray40 = parameterGuesser38.guess();
        double[] doubleArray41 = parameterGuesser38.guess();
        double[] doubleArray42 = parameterGuesser38.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = harmonicFitter1.fit(doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray37);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric16 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer17 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter18 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer17);
        harmonicFitter18.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter18.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter18.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter18.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter18.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = harmonicFitter18.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray37 = harmonicFitter18.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser38 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray37);
        double[] doubleArray39 = parameterGuesser38.guess();
        double[] doubleArray40 = parameterGuesser38.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray41 = harmonicFitter1.fit(parametric16, doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(weightedObservedPointArray37);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 0, (double) (short) 0);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric8 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer9 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter10 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer9);
        harmonicFitter10.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter10.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter10.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter10.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter10.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = harmonicFitter10.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray29);
        double[] doubleArray31 = parameterGuesser30.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray32 = harmonicFitter1.fit((int) (byte) 1, parametric8, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser21 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray20);
        double[] doubleArray22 = parameterGuesser21.guess();
        double[] doubleArray23 = parameterGuesser21.guess();
        java.lang.Class<?> wildcardClass24 = parameterGuesser21.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L), (double) (byte) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric13 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer14 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter15 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer14);
        harmonicFitter15.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter15.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter15.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter15.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter15.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = harmonicFitter15.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray34 = harmonicFitter15.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray34);
        double[] doubleArray36 = parameterGuesser35.guess();
        double[] doubleArray37 = parameterGuesser35.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray38 = harmonicFitter1.fit((int) (short) 0, parametric13, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric14 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer15 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter16 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer15);
        harmonicFitter16.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter16.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter16.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter16.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter16.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray34 = harmonicFitter16.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = harmonicFitter16.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray35);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray35);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser38 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray35);
        double[] doubleArray39 = parameterGuesser38.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray40 = harmonicFitter1.fit(0, parametric14, doubleArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) 1, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass14 = weightedObservedPointArray13.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray12, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray13, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        harmonicFitter1.addObservedPoint((double) 0L, (double) 10, (double) 10.0f);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint26 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint26);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint28 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint28);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer30 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter31 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer30);
        harmonicFitter31.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter31.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter31.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter31.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter31.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray49 = harmonicFitter31.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray50 = harmonicFitter31.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser51 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray50);
        double[] doubleArray52 = parameterGuesser51.guess();
        double[] doubleArray53 = parameterGuesser51.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray54 = harmonicFitter1.fit(doubleArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray49);
        org.junit.Assert.assertNotNull(weightedObservedPointArray50);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric21 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer22 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter23 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer22);
        harmonicFitter23.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter23.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter23.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter23.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter23.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray42 = harmonicFitter23.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser43 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray42);
        double[] doubleArray44 = parameterGuesser43.guess();
        double[] doubleArray45 = parameterGuesser43.guess();
        double[] doubleArray46 = parameterGuesser43.guess();
        double[] doubleArray47 = parameterGuesser43.guess();
        double[] doubleArray48 = parameterGuesser43.guess();
        double[] doubleArray49 = parameterGuesser43.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray50 = harmonicFitter1.fit(parametric21, doubleArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertNotNull(weightedObservedPointArray42);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric14 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer15 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter16 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer15);
        harmonicFitter16.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter16.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter16.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter16.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter16.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = harmonicFitter16.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray35);
        double[] doubleArray37 = parameterGuesser36.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray38 = harmonicFitter1.fit(parametric14, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        harmonicFitter1.addObservedPoint((double) (short) 0, 0.0d);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer22 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter23 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer22);
        harmonicFitter23.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter23.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        harmonicFitter23.addObservedPoint((double) (short) -1, (-1.0d));
        harmonicFitter23.addObservedPoint((double) '#', (double) (byte) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray37 = harmonicFitter23.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser38 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray37);
        double[] doubleArray39 = parameterGuesser38.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray40 = harmonicFitter1.fit(doubleArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray37);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((double) (byte) 1, (double) ' ');
        harmonicFitter1.addObservedPoint((double) 0.0f, 0.0d);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric12 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer13 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter14 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer13);
        harmonicFitter14.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter14.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter14.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter14.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter14.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray32 = harmonicFitter14.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = harmonicFitter14.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray34 = harmonicFitter14.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray34);
        double[] doubleArray36 = parameterGuesser35.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray37 = harmonicFitter1.fit(parametric12, doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) (-1L), 0.0d);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric16 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer17 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter18 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer17);
        harmonicFitter18.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter18.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter18.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter18.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter18.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray37 = harmonicFitter18.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser38 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray37);
        double[] doubleArray39 = parameterGuesser38.guess();
        double[] doubleArray40 = parameterGuesser38.guess();
        double[] doubleArray41 = parameterGuesser38.guess();
        double[] doubleArray42 = parameterGuesser38.guess();
        double[] doubleArray43 = parameterGuesser38.guess();
        double[] doubleArray44 = parameterGuesser38.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray45 = harmonicFitter1.fit(parametric16, doubleArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray37);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) (short) -1, (-1.0d));
        harmonicFitter1.addObservedPoint((double) '#', (double) (byte) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer16 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter17 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer16);
        harmonicFitter17.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter17.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter17.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter17.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter17.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = harmonicFitter17.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = harmonicFitter17.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray36);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser38 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray36);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser39 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray36);
        double[] doubleArray40 = parameterGuesser39.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray41 = harmonicFitter1.fit(doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric4 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer5 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter6 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer5);
        harmonicFitter6.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter6.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter6.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter6.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter6.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = harmonicFitter6.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser26 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray25);
        double[] doubleArray27 = parameterGuesser26.guess();
        double[] doubleArray28 = parameterGuesser26.guess();
        double[] doubleArray29 = parameterGuesser26.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray30 = harmonicFitter1.fit(parametric4, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric17 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer18 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter19 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer18);
        harmonicFitter19.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter19.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter19.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter19.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter19.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray38 = harmonicFitter19.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser39 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray38);
        double[] doubleArray40 = parameterGuesser39.guess();
        double[] doubleArray41 = parameterGuesser39.guess();
        double[] doubleArray42 = parameterGuesser39.guess();
        double[] doubleArray43 = parameterGuesser39.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray44 = harmonicFitter1.fit((int) (short) 10, parametric17, doubleArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L), (double) (byte) -1);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer9 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter10 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer9);
        harmonicFitter10.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter10.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter10.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter10.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter10.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = harmonicFitter10.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = harmonicFitter10.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = harmonicFitter10.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray30);
        double[] doubleArray32 = parameterGuesser31.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray33 = harmonicFitter1.fit(doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) ' ');
        harmonicFitter1.addObservedPoint((double) '#', (double) (-1L), (double) 0L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser16 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric9 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer10 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter11 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer10);
        harmonicFitter11.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter11.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter11.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter11.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter11.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = harmonicFitter11.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray30);
        double[] doubleArray32 = parameterGuesser31.guess();
        double[] doubleArray33 = parameterGuesser31.guess();
        double[] doubleArray34 = parameterGuesser31.guess();
        double[] doubleArray35 = parameterGuesser31.guess();
        double[] doubleArray36 = parameterGuesser31.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray37 = harmonicFitter1.fit((int) (short) 0, parametric9, doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 100L);
        harmonicFitter1.addObservedPoint(0.0d, (double) 1L);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer27 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter28 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer27);
        harmonicFitter28.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter28.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter28.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter28.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter28.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray47 = harmonicFitter28.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser48 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray47);
        double[] doubleArray49 = parameterGuesser48.guess();
        double[] doubleArray50 = parameterGuesser48.guess();
        double[] doubleArray51 = parameterGuesser48.guess();
        double[] doubleArray52 = parameterGuesser48.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray53 = harmonicFitter1.fit(doubleArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray47);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (byte) 100);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) 1L, (double) 1.0f);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) 10L, (double) 0L);
        harmonicFitter1.addObservedPoint((double) 1.0f, (double) ' ');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric30 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer31 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter32 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer31);
        harmonicFitter32.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter32.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter32.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter32.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter32.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray51 = harmonicFitter32.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser52 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray51);
        double[] doubleArray53 = parameterGuesser52.guess();
        double[] doubleArray54 = parameterGuesser52.guess();
        double[] doubleArray55 = parameterGuesser52.guess();
        double[] doubleArray56 = parameterGuesser52.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray57 = harmonicFitter1.fit(parametric30, doubleArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(weightedObservedPointArray51);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }
}

