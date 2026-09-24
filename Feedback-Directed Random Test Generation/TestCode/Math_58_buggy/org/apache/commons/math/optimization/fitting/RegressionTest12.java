package org.apache.commons.math.optimization.fitting;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

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
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100L, (double) (short) 1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(0.0d, (double) 10, (double) 10);
        gaussianFitter1.addObservedPoint((double) 'a', (double) (-1), (double) 1.0f);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint29 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint29);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer32 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter33 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer32);
        gaussianFitter33.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter33.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint41 = null;
        gaussianFitter33.addObservedPoint(weightedObservedPoint41);
        gaussianFitter33.clearObservations();
        gaussianFitter33.addObservedPoint((double) 100.0f, (double) (short) 1);
        gaussianFitter33.addObservedPoint((-1.0d), (double) 1.0f);
        gaussianFitter33.addObservedPoint((double) 0.0f, (double) 10L, (double) 0L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray54 = gaussianFitter33.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser55 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray54);
        double[] doubleArray56 = parameterGuesser55.guess();
        double[] doubleArray57 = parameterGuesser55.guess();
        double[] doubleArray58 = parameterGuesser55.guess();
        double[] doubleArray59 = parameterGuesser55.guess();
        double[] doubleArray60 = parameterGuesser55.guess();
        double[] doubleArray61 = parameterGuesser55.guess();
        double[] doubleArray62 = parameterGuesser55.guess();
        double[] doubleArray63 = parameterGuesser55.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray64 = gaussianFitter1.fit(doubleArray63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray26, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray27, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray54);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 1.0d, (-1.0d), 42.89075091454496d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 1.0d, (-1.0d), 42.89075091454496d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 1.0d, (-1.0d), 42.89075091454496d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 1.0d, (-1.0d), 42.89075091454496d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 1.0d, (-1.0d), 42.89075091454496d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 1.0d, (-1.0d), 42.89075091454496d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 1.0d, (-1.0d), 42.89075091454496d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 1.0d, (-1.0d), 42.89075091454496d }, 1.0E-15);
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        gaussianFitter1.addObservedPoint(1.0d, (double) 100.0f, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.addObservedPoint((double) (short) 100, (double) (byte) 100);
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        gaussianFitter1.addObservedPoint((double) 0, (double) (-1L));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        gaussianFitter1.addObservedPoint(0.0d, (double) (-1.0f), (double) (short) 0);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (-1.0f), (-1.0d));
        gaussianFitter1.addObservedPoint((double) 100, (-1.0d));
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 'a', (double) 100L);
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) (-1));
        gaussianFitter1.addObservedPoint((double) 'a', 1.0d);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray5, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray18, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] { null });
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) (-1L), 0.0d);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0, (double) (short) -1, (double) (byte) 10);
        gaussianFitter1.addObservedPoint((double) 1L, (double) '4', (double) (byte) 1);
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray22, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 0, 10.0d);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser17 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray16, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 10L, (double) 1L);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction7 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer8 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter9 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer8);
        gaussianFitter9.addObservedPoint((double) 0.0f, (double) (byte) 0);
        gaussianFitter9.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        gaussianFitter9.addObservedPoint((double) (short) -1, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = gaussianFitter9.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser21 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray20);
        double[] doubleArray22 = parameterGuesser21.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray23 = gaussianFitter1.fit(parametricUnivariateRealFunction7, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) 100, (double) (short) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction16 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer17 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter18 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer17);
        gaussianFitter18.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter18.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter18.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = gaussianFitter18.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray30);
        double[] doubleArray32 = parameterGuesser31.guess();
        double[] doubleArray33 = parameterGuesser31.guess();
        double[] doubleArray34 = parameterGuesser31.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray35 = gaussianFitter1.fit(parametricUnivariateRealFunction16, doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.addObservedPoint((double) 0L, (double) 1.0f, (double) (byte) 100);
        java.lang.Class<?> wildcardClass15 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) 100L, (double) 100);
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) ' ', (double) 0L, (double) (byte) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 1L, (double) 1, (double) 100);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 'a', (double) (short) 100);
        gaussianFitter1.addObservedPoint((double) (byte) 100, 1.0d, (double) (byte) 1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1L, 10.0d, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint25 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint25);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        gaussianFitter1.addObservedPoint((double) 1, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0.0f, 0.0d);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1), (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser21 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 2 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        gaussianFitter1.addObservedPoint((double) 10.0f, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) '#', (double) 10);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) 100, (double) (short) 0);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 10L, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint15);
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass20 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        gaussianFitter1.addObservedPoint((-1.0d), 10.0d);
        gaussianFitter1.addObservedPoint((double) '#', 0.0d, (-1.0d));
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) (byte) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint22);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        gaussianFitter1.addObservedPoint((double) 10.0f, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) ' ', (double) (byte) 0);
        gaussianFitter1.addObservedPoint((double) 10L, 1.0d, (-1.0d));
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 10L, 1.0d, (double) '4');
        gaussianFitter1.addObservedPoint(0.0d, 100.0d, (double) 0);
        gaussianFitter1.addObservedPoint((double) 10L, (double) '#', 0.0d);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        java.lang.Class<?> wildcardClass28 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray26, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint(0.0d, (double) 1L);
        gaussianFitter1.addObservedPoint((double) ' ', 1.0d);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(0.0d, (double) 10, (double) 10);
        gaussianFitter1.addObservedPoint((double) 'a', (double) (-1), (double) 1.0f);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 1, (double) 1);
        gaussianFitter1.addObservedPoint((double) 100, 0.0d, (double) (byte) -1);
        gaussianFitter1.addObservedPoint((-1.0d), (double) ' ', (double) (-1));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1), (double) 1L);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction18 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer19 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter20 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer19);
        gaussianFitter20.addObservedPoint((double) 0.0f, (double) (byte) 0);
        gaussianFitter20.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        gaussianFitter20.addObservedPoint((double) (short) -1, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray31 = gaussianFitter20.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray32 = gaussianFitter20.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser33 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray32);
        double[] doubleArray34 = parameterGuesser33.guess();
        double[] doubleArray35 = parameterGuesser33.guess();
        double[] doubleArray36 = parameterGuesser33.guess();
        double[] doubleArray37 = parameterGuesser33.guess();
        double[] doubleArray38 = parameterGuesser33.guess();
        double[] doubleArray39 = parameterGuesser33.guess();
        double[] doubleArray40 = parameterGuesser33.guess();
        double[] doubleArray41 = parameterGuesser33.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray42 = gaussianFitter1.fit((int) '4', parametricUnivariateRealFunction18, doubleArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray31);
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) 100.0f, (double) (short) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.addObservedPoint(0.0d, (double) 10L, (double) (-1));
        gaussianFitter1.addObservedPoint((double) 0L, 10.0d);
        gaussianFitter1.addObservedPoint(10.0d, (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint25 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint25);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(0.0d, 0.0d);
        gaussianFitter1.addObservedPoint((double) 1.0f, (double) 10L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint34 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint34);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint36 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint36);
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
        gaussianFitter1.addObservedPoint(0.0d, (double) 10L, (double) (byte) 0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 10L, (double) (-1L), (double) 1.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint30 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint30);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction33 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer34 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter35 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer34);
        gaussianFitter35.addObservedPoint((double) 0.0f, (double) (byte) 0);
        gaussianFitter35.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        gaussianFitter35.addObservedPoint((double) (short) -1, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray46 = gaussianFitter35.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray47 = gaussianFitter35.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser48 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray47);
        double[] doubleArray49 = parameterGuesser48.guess();
        double[] doubleArray50 = parameterGuesser48.guess();
        double[] doubleArray51 = parameterGuesser48.guess();
        double[] doubleArray52 = parameterGuesser48.guess();
        double[] doubleArray53 = parameterGuesser48.guess();
        double[] doubleArray54 = parameterGuesser48.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray55 = gaussianFitter1.fit((int) (short) 1, parametricUnivariateRealFunction33, doubleArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(weightedObservedPointArray46);
        org.junit.Assert.assertNotNull(weightedObservedPointArray47);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint6);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.addObservedPoint((double) (short) 100, (double) (short) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 0L, (double) 0L);
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) (short) 10);
        gaussianFitter1.addObservedPoint((double) 0, (double) (byte) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (byte) -1);
        gaussianFitter1.addObservedPoint((double) 1L, 0.0d, (double) (-1.0f));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0, (double) (byte) 0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 100L, 0.0d);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint29 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint29);
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray24, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 1L, (double) (byte) 100, 0.0d);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray15, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray17, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint6);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (-1L), (double) (byte) -1);
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) ' ', 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) '#');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint22);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) 0.0f);
        gaussianFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray28 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        gaussianFitter1.addObservedPoint((double) 1.0f, (double) 10);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) -1, (double) 1.0f);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (-1L), (double) (short) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint20);
        gaussianFitter1.addObservedPoint((double) (short) 0, 100.0d);
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        gaussianFitter1.addObservedPoint((double) 10.0f, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0, (double) (-1));
        gaussianFitter1.addObservedPoint((-1.0d), (double) 0.0f, (double) (byte) -1);
        gaussianFitter1.addObservedPoint((-1.0d), (double) 100.0f, 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray28 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray16, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f, 0.0d);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) 10.0f, (double) 1L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray20, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) 100L);
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) 10L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser22 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray21);
        double[] doubleArray23 = parameterGuesser22.guess();
        double[] doubleArray24 = parameterGuesser22.guess();
        double[] doubleArray25 = parameterGuesser22.guess();
        double[] doubleArray26 = parameterGuesser22.guess();
        double[] doubleArray27 = parameterGuesser22.guess();
        double[] doubleArray28 = parameterGuesser22.guess();
        double[] doubleArray29 = parameterGuesser22.guess();
        double[] doubleArray30 = parameterGuesser22.guess();
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d, (-1.0d), 21.87861536550021d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 100.0d, (-1.0d), 21.87861536550021d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, (-1.0d), 21.87861536550021d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 100.0d, (-1.0d), 21.87861536550021d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 100.0d, (-1.0d), 21.87861536550021d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d, (-1.0d), 21.87861536550021d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d, (-1.0d), 21.87861536550021d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d, (-1.0d), 21.87861536550021d }, 1.0E-15);
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        gaussianFitter1.addObservedPoint((double) 0, (double) (-1L));
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (-1L), (double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (byte) 100);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 1, (double) (byte) 0);
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) 100L, (double) 100);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 10L, (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) 'a', (double) 10L);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction16 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer17 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter18 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer17);
        gaussianFitter18.clearObservations();
        gaussianFitter18.addObservedPoint((double) (byte) 10, 0.0d);
        gaussianFitter18.addObservedPoint((double) 1, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = gaussianFitter18.getObservations();
        gaussianFitter18.addObservedPoint((double) 0.0f, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = gaussianFitter18.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray30);
        double[] doubleArray32 = parameterGuesser31.guess();
        double[] doubleArray33 = parameterGuesser31.guess();
        double[] doubleArray34 = parameterGuesser31.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray35 = gaussianFitter1.fit((int) (byte) 10, parametricUnivariateRealFunction16, doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 0.0d, 0.0d, 4.2466090014400955d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 0.0d, 0.0d, 4.2466090014400955d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 0.0d, 0.0d, 4.2466090014400955d }, 1.0E-15);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) 10);
        gaussianFitter1.addObservedPoint((-1.0d), 10.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction17 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer18 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter19 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer18);
        gaussianFitter19.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter19.addObservedPoint(1.0d, (double) 0.0f, (double) 0);
        gaussianFitter19.addObservedPoint((double) 100L, (double) 1);
        gaussianFitter19.addObservedPoint((double) 0.0f, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = gaussianFitter19.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray38 = parameterGuesser37.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray39 = gaussianFitter1.fit((int) (short) 100, parametricUnivariateRealFunction17, doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 0.0d, 7.549527113671281d }, 1.0E-15);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) ' ');
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1L, 1.0d);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray18, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        gaussianFitter1.addObservedPoint((-1.0d), (double) 1.0f);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) 10L, (double) 0L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) ' ', (double) 0.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint27 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint27);
        gaussianFitter1.addObservedPoint((double) '#', 100.0d, (double) (byte) 10);
        gaussianFitter1.addObservedPoint((double) (byte) -1, 0.0d, (double) (short) 100);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10L);
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        gaussianFitter1.addObservedPoint(0.0d, (double) 1L, (double) 0);
        gaussianFitter1.addObservedPoint((double) 100, (double) 0L, 10.0d);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        gaussianFitter1.addObservedPoint((-1.0d), (double) 1.0f);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) 10L, (double) 0L);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 10, 100.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint27 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint27);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint30 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint30);
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) 100, (double) (short) 0);
        gaussianFitter1.addObservedPoint((double) (-1), (double) (short) 0, (double) (-1L));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction17 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer18 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter19 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer18);
        gaussianFitter19.clearObservations();
        gaussianFitter19.addObservedPoint((double) (byte) 10, 0.0d);
        gaussianFitter19.addObservedPoint((double) (-1.0f), (double) (-1L));
        gaussianFitter19.addObservedPoint((double) 'a', 1.0d);
        gaussianFitter19.addObservedPoint((double) '4', (double) (byte) 10, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray34 = gaussianFitter19.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = gaussianFitter19.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray35);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray35);
        double[] doubleArray38 = parameterGuesser37.guess();
        double[] doubleArray39 = parameterGuesser37.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray40 = gaussianFitter1.fit(parametricUnivariateRealFunction17, doubleArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 1.0d, 10.0d, 41.61676821411294d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 1.0d, 10.0d, 41.61676821411294d }, 1.0E-15);
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1L, (double) (-1L));
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) 100L, (double) 100);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        java.lang.Class<?> wildcardClass14 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray12, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray13, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 10, (double) 1.0f, (double) 10);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) (-1.0f));
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction16 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer17 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter18 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer17);
        gaussianFitter18.clearObservations();
        gaussianFitter18.addObservedPoint((double) (byte) 10, 0.0d);
        gaussianFitter18.addObservedPoint((double) 1, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = gaussianFitter18.getObservations();
        gaussianFitter18.addObservedPoint((double) 0.0f, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = gaussianFitter18.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray30);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser32 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray30);
        double[] doubleArray33 = parameterGuesser32.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray34 = gaussianFitter1.fit((-1), parametricUnivariateRealFunction16, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray7, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 0.0d, 0.0d, 4.2466090014400955d }, 1.0E-15);
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) 1.0f, (double) (short) 100);
        gaussianFitter1.addObservedPoint((double) (-1), (double) '4', (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 0, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100, (double) 10, (double) 100L);
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) 100L, (double) 100);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (short) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) 0L, 0.0d, (double) (byte) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, 1.0d, (double) '4');
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        gaussianFitter1.addObservedPoint((double) 'a', 1.0d);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 10, (double) 1.0f);
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray21, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 1, (double) 1);
        gaussianFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(0.0d, (double) 100.0f, (double) (short) 1);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 1, (double) 1);
        gaussianFitter1.addObservedPoint((double) 100, 0.0d, (double) (byte) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 1L, (double) 1, (double) 100);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(1.0d, 0.0d, (double) ' ');
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (byte) 10);
        gaussianFitter1.addObservedPoint((double) 100, (double) '#', (-1.0d));
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction30 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer31 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter32 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer31);
        gaussianFitter32.clearObservations();
        gaussianFitter32.addObservedPoint((double) (byte) 10, 0.0d);
        gaussianFitter32.addObservedPoint((double) (-1.0f), (double) (-1L));
        gaussianFitter32.addObservedPoint((double) 'a', 1.0d);
        gaussianFitter32.addObservedPoint((double) '4', (double) (byte) 10, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray47 = gaussianFitter32.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray48 = gaussianFitter32.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser49 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray48);
        double[] doubleArray50 = parameterGuesser49.guess();
        double[] doubleArray51 = parameterGuesser49.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray52 = gaussianFitter1.fit((int) (short) 100, parametricUnivariateRealFunction30, doubleArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray21, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(weightedObservedPointArray47);
        org.junit.Assert.assertNotNull(weightedObservedPointArray48);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 1.0d, 10.0d, 41.61676821411294d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 1.0d, 10.0d, 41.61676821411294d }, 1.0E-15);
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) 100L, (double) 100);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 2 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray13, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] { null, null });
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (short) 1, (double) (-1L));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint15);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        gaussianFitter1.addObservedPoint(0.0d, (double) '4', (double) (-1L));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint24 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint24);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(0.0d, (double) 10, (double) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint21 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint21);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint26 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint26);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint29 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint29);
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer19 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter20 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer19);
        gaussianFitter20.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter20.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter20.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        gaussianFitter20.addObservedPoint((double) (-1L), 0.0d);
        gaussianFitter20.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint38 = null;
        gaussianFitter20.addObservedPoint(weightedObservedPoint38);
        gaussianFitter20.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray41 = gaussianFitter20.getObservations();
        gaussianFitter20.addObservedPoint((double) 1.0f, (double) 10L, (double) (-1L));
        gaussianFitter20.addObservedPoint(1.0d, (double) 'a', (double) (byte) 0);
        gaussianFitter20.addObservedPoint((double) 0, (double) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray54 = gaussianFitter20.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser55 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray54);
        double[] doubleArray56 = parameterGuesser55.guess();
        double[] doubleArray57 = parameterGuesser55.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray58 = gaussianFitter1.fit(doubleArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray41);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray41, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray54);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 1, (double) 1);
        gaussianFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) 0L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray10, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        gaussianFitter1.addObservedPoint((-1.0d), 10.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint15);
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) '#');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint20);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint22);
        gaussianFitter1.addObservedPoint((double) 100, (double) 0);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) 100L);
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) 10L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 100, (-1.0d), (double) 100L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint26 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint26);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint28 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint28);
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 1, (double) 1);
        gaussianFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 0, (double) 'a', (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.addObservedPoint((double) 10.0f, 10.0d, (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint20);
        gaussianFitter1.addObservedPoint((double) 1L, (double) 0, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint26 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint26);
        gaussianFitter1.addObservedPoint((double) 100, (double) (-1L));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint31 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint31);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint33 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint33);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 1L, (double) 1, (double) 100);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction15 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer16 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter17 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer16);
        gaussianFitter17.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter17.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter17.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        gaussianFitter17.addObservedPoint((double) (-1L), 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray32 = gaussianFitter17.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser33 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray32);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray32);
        double[] doubleArray35 = parameterGuesser34.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray36 = gaussianFitter1.fit(0, parametricUnivariateRealFunction15, doubleArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray13, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d, (-1.0d), 0.43323990822772684d }, 1.0E-15);
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) 100L);
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) 10L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint23 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint23);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 1, (double) 1);
        gaussianFitter1.addObservedPoint((double) 100, 0.0d, (double) (byte) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.addObservedPoint((double) 100L, (double) (byte) 0);
        gaussianFitter1.addObservedPoint((double) '#', 0.0d);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (byte) 0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(0.0d, (double) 'a');
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        gaussianFitter1.addObservedPoint((double) 'a', 1.0d);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100);
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) (short) -1, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint28 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint28);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint30 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint30);
        gaussianFitter1.addObservedPoint(100.0d, (double) '4', (double) (byte) 0);
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray39 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        gaussianFitter1.addObservedPoint((-1.0d), (double) 1.0f);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) 10L, (double) 0L);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 10, 100.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint27 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint27);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) '4', (double) (byte) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint34 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint34);
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        gaussianFitter1.addObservedPoint((double) (short) -1, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.addObservedPoint((double) 0L, 1.0d, (double) 1.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) 0.0f, (double) (byte) 1);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) 100L, (double) 100);
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        gaussianFitter1.addObservedPoint(1.0d, (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) 'a', (-1.0d), (double) '#');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint23 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint23);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint28 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint28);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) '#');
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) '4', (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint37 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint37);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) '4', (double) (-1L));
        gaussianFitter1.addObservedPoint(100.0d, (double) ' ', (double) (byte) 1);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        gaussianFitter1.addObservedPoint((-1.0d), (double) 1.0f);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) 10L, (double) 0L);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(10.0d, (double) (byte) 100, 10.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint27 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint27);
        gaussianFitter1.addObservedPoint((double) 0L, (double) (-1.0f), (double) 10);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 10, (double) 0.0f);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) 100.0f, (double) (short) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.addObservedPoint(0.0d, (double) 10L, (double) (-1));
        gaussianFitter1.addObservedPoint((double) 0L, 10.0d);
        gaussianFitter1.addObservedPoint((double) ' ', 10.0d, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) (byte) 100, (double) (byte) 1);
        gaussianFitter1.addObservedPoint((double) 10L, 10.0d, (double) 100L);
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer35 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter36 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer35);
        gaussianFitter36.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter36.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter36.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray48 = gaussianFitter36.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser49 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray48);
        double[] doubleArray50 = parameterGuesser49.guess();
        double[] doubleArray51 = parameterGuesser49.guess();
        double[] doubleArray52 = parameterGuesser49.guess();
        double[] doubleArray53 = parameterGuesser49.guess();
        double[] doubleArray54 = parameterGuesser49.guess();
        double[] doubleArray55 = parameterGuesser49.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray56 = gaussianFitter1.fit(doubleArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
        org.junit.Assert.assertNotNull(weightedObservedPointArray48);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (-1), (double) '#');
        gaussianFitter1.addObservedPoint((double) (byte) -1, 10.0d, (double) 0L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0L, 100.0d, (double) (short) -1);
        gaussianFitter1.addObservedPoint(1.0d, 0.0d, (double) (-1.0f));
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) '#', (double) (-1L), (double) 0L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) (-1.0f), (double) (byte) 10);
        gaussianFitter1.addObservedPoint((double) 'a', (double) (byte) 0, (double) 100L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser26 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray25);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser27 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray25);
        double[] doubleArray28 = parameterGuesser27.guess();
        double[] doubleArray29 = parameterGuesser27.guess();
        double[] doubleArray30 = parameterGuesser27.guess();
        double[] doubleArray31 = parameterGuesser27.guess();
        double[] doubleArray32 = parameterGuesser27.guess();
        double[] doubleArray33 = parameterGuesser27.guess();
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d, 0.0d, 0.42466090014400953d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d, 0.0d, 0.42466090014400953d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d, 0.0d, 0.42466090014400953d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d, 0.0d, 0.42466090014400953d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, 0.0d, 0.42466090014400953d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, 0.0d, 0.42466090014400953d }, 1.0E-15);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint(100.0d, (double) (short) 1, (double) (byte) 0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(1.0d, (double) (byte) 10, 10.0d);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray5, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 0, (double) 0L, (double) 100);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction11 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer12 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter13 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer12);
        gaussianFitter13.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter13.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter13.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = gaussianFitter13.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser26 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray25);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser27 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray25);
        double[] doubleArray28 = parameterGuesser27.guess();
        double[] doubleArray29 = parameterGuesser27.guess();
        double[] doubleArray30 = parameterGuesser27.guess();
        double[] doubleArray31 = parameterGuesser27.guess();
        double[] doubleArray32 = parameterGuesser27.guess();
        double[] doubleArray33 = parameterGuesser27.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray34 = gaussianFitter1.fit(parametricUnivariateRealFunction11, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.addObservedPoint((double) 0L, (double) 1.0f, (double) (byte) 100);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray16, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray17, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray20, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] { null });
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(0.0d, (double) 10, (double) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint21 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint21);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint25 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint25);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (short) 10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 'a', (double) 100.0f);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (byte) 100);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray5, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint(1.0d, (double) 0.0f, (double) 0);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) 100, (double) 0L);
        gaussianFitter1.addObservedPoint((double) 1, (double) 100, (double) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction19 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer20 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter21 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer20);
        gaussianFitter21.clearObservations();
        gaussianFitter21.addObservedPoint((double) (byte) 10, 0.0d);
        gaussianFitter21.addObservedPoint((double) (-1.0f), (double) (-1L));
        gaussianFitter21.addObservedPoint((double) 'a', 1.0d);
        gaussianFitter21.addObservedPoint((double) '4', (double) (byte) 10, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = gaussianFitter21.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray37 = gaussianFitter21.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser38 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray37);
        double[] doubleArray39 = parameterGuesser38.guess();
        double[] doubleArray40 = parameterGuesser38.guess();
        double[] doubleArray41 = parameterGuesser38.guess();
        double[] doubleArray42 = parameterGuesser38.guess();
        double[] doubleArray43 = parameterGuesser38.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray44 = gaussianFitter1.fit(parametricUnivariateRealFunction19, doubleArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(weightedObservedPointArray37);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 1.0d, 10.0d, 41.61676821411294d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 1.0d, 10.0d, 41.61676821411294d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 1.0d, 10.0d, 41.61676821411294d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 1.0d, 10.0d, 41.61676821411294d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 1.0d, 10.0d, 41.61676821411294d }, 1.0E-15);
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (byte) 100);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 10, (double) (-1.0f));
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction15 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer16 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter17 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer16);
        gaussianFitter17.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter17.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter17.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        gaussianFitter17.addObservedPoint((double) (-1L), 0.0d);
        gaussianFitter17.addObservedPoint((double) (short) 0, (double) (short) 0);
        gaussianFitter17.addObservedPoint((double) '#', (double) (byte) 100, (double) (short) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray39 = gaussianFitter17.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser40 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray39);
        double[] doubleArray41 = parameterGuesser40.guess();
        double[] doubleArray42 = parameterGuesser40.guess();
        double[] doubleArray43 = parameterGuesser40.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray44 = gaussianFitter1.fit((int) (short) 100, parametricUnivariateRealFunction15, doubleArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray13, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(weightedObservedPointArray39);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 100.0d, (-1.0d), 0.2144537545727248d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d, (-1.0d), 0.2144537545727248d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d, (-1.0d), 0.2144537545727248d }, 1.0E-15);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        gaussianFitter1.addObservedPoint((double) 0, (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction11 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer12 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter13 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer12);
        gaussianFitter13.clearObservations();
        gaussianFitter13.addObservedPoint((double) (byte) 10, 0.0d);
        gaussianFitter13.addObservedPoint((double) (byte) -1, (double) 10);
        gaussianFitter13.clearObservations();
        gaussianFitter13.addObservedPoint((double) '#', (double) (byte) 100);
        gaussianFitter13.addObservedPoint((double) (short) 1, (double) 1);
        gaussianFitter13.addObservedPoint((double) 1L, (double) 0.0f, (double) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray32 = gaussianFitter13.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser33 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray32);
        double[] doubleArray34 = parameterGuesser33.guess();
        double[] doubleArray35 = parameterGuesser33.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray36 = gaussianFitter1.fit((int) (byte) 0, parametricUnivariateRealFunction11, doubleArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d, 35.0d, 14.863131505040334d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d, 35.0d, 14.863131505040334d }, 1.0E-15);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) '#', (double) (-1L), (double) 0L);
        gaussianFitter1.addObservedPoint((double) 1L, (double) 0.0f, (double) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0L, (double) 1.0f, (double) (byte) 0);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction25 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer26 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter27 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer26);
        gaussianFitter27.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter27.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter27.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray39 = gaussianFitter27.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser40 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray39);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser41 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray39);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser42 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray39);
        double[] doubleArray43 = parameterGuesser42.guess();
        double[] doubleArray44 = parameterGuesser42.guess();
        double[] doubleArray45 = parameterGuesser42.guess();
        double[] doubleArray46 = parameterGuesser42.guess();
        double[] doubleArray47 = parameterGuesser42.guess();
        double[] doubleArray48 = parameterGuesser42.guess();
        double[] doubleArray49 = parameterGuesser42.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray50 = gaussianFitter1.fit(parametricUnivariateRealFunction25, doubleArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(weightedObservedPointArray39);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        gaussianFitter1.addObservedPoint(1.0d, (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) 'a', (-1.0d), (double) '#');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint23 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint23);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray27, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) '#', (double) (-1L), (double) 0L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) (-1.0f), (double) (byte) 10);
        gaussianFitter1.addObservedPoint((double) 'a', (double) (byte) 0, (double) 100L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint25 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint25);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint28 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint28);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint30 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint30);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray32 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) ' ');
        java.lang.Class<?> wildcardClass36 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint6);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (-1L), (double) (byte) -1);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer16 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter17 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer16);
        gaussianFitter17.clearObservations();
        gaussianFitter17.clearObservations();
        gaussianFitter17.addObservedPoint((double) 10L, (double) 1L);
        gaussianFitter17.addObservedPoint((double) 100.0f, (double) (short) 10, (-1.0d));
        gaussianFitter17.addObservedPoint((double) '4', (-1.0d), (double) 0.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray31 = gaussianFitter17.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser32 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray31);
        double[] doubleArray33 = parameterGuesser32.guess();
        double[] doubleArray34 = parameterGuesser32.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray35 = gaussianFitter1.fit(doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray13, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray15, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray31);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 1.0d, 10.0d, 4.671269901584105d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 1.0d, 10.0d, 4.671269901584105d }, 1.0E-15);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser16 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray15);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser17 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray15);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = parameterGuesser17.guess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) 100, (double) (short) 0);
        gaussianFitter1.addObservedPoint(0.0d, (double) 'a', (double) 0.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) 1, (double) (short) 10);
        gaussianFitter1.addObservedPoint((double) '#', (double) 10L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 0, (double) 0L, (double) (byte) 10);
        gaussianFitter1.addObservedPoint((double) (short) 100, (double) '#', (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint24 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint24);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray5, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, 100.0d, (double) '#');
        gaussianFitter1.addObservedPoint((double) '4', (double) (byte) 100, (double) 0.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 1, (double) 1L);
        gaussianFitter1.addObservedPoint(1.0d, (double) 0L, 10.0d);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 10.0f, (double) (byte) 0);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction26 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer27 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter28 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer27);
        gaussianFitter28.clearObservations();
        gaussianFitter28.addObservedPoint((double) (byte) 10, 0.0d);
        gaussianFitter28.addObservedPoint((double) (-1.0f), (double) (-1L));
        gaussianFitter28.addObservedPoint((double) 'a', 1.0d);
        gaussianFitter28.addObservedPoint((double) '4', (double) (byte) 10, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray43 = gaussianFitter28.getObservations();
        gaussianFitter28.addObservedPoint(0.0d, (double) 100.0f, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray48 = gaussianFitter28.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser49 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray48);
        double[] doubleArray50 = parameterGuesser49.guess();
        double[] doubleArray51 = parameterGuesser49.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray52 = gaussianFitter1.fit(100, parametricUnivariateRealFunction26, doubleArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray43);
        org.junit.Assert.assertNotNull(weightedObservedPointArray48);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 97.0d, 100.0d, 42.89075091454496d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 97.0d, 100.0d, 42.89075091454496d }, 1.0E-15);
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 0, 10.0d);
        gaussianFitter1.addObservedPoint((double) (byte) 10, 10.0d, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 2 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, 100.0d, (double) 0);
        gaussianFitter1.addObservedPoint((double) 100.0f, 0.0d, (double) (-1L));
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) 0.0f, (double) (byte) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint20);
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) '4');
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray6 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (short) -1, (double) 1L);
        java.lang.Class<?> wildcardClass12 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray6);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray6, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray7, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray6 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 10L, 0.0d, (double) '#');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray6);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray6, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) 100L, (double) 100);
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        gaussianFitter1.addObservedPoint(0.0d, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        gaussianFitter1.addObservedPoint((double) 100, (double) 0L, (double) 10);
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) 100L, (double) 100);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (short) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) 10, 10.0d, (double) '4');
        gaussianFitter1.addObservedPoint(100.0d, (double) 100.0f);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 100L, (double) (short) 0);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction23 = null;
        double[] doubleArray24 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray25 = gaussianFitter1.fit(parametricUnivariateRealFunction23, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) 1, (double) (short) 10);
        gaussianFitter1.addObservedPoint((double) '#', (double) 10L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.addObservedPoint((double) 'a', (double) (short) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint(0.0d, (double) (byte) 100);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint25 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint25);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray5, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 1, (double) 1);
        gaussianFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        gaussianFitter1.addObservedPoint(0.0d, (double) 1.0f);
        gaussianFitter1.addObservedPoint(0.0d, (double) (short) 100, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint20);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray10, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray23, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint6);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray5, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 1L, (double) 1, (double) 100);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) 0.0f);
        gaussianFitter1.addObservedPoint((double) 'a', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) 1L, (double) 0.0f);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) 1, (double) 100.0f);
        gaussianFitter1.clearObservations();
        java.lang.Class<?> wildcardClass27 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        gaussianFitter1.addObservedPoint((double) 'a', 1.0d);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 10, (double) 1.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint25 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint25);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray21, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) (-1L), 0.0d);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray17, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 1, (double) 1);
        gaussianFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 10L, (double) (short) 10, (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray11, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 1, (double) 1);
        gaussianFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 100, (double) 0, (double) 100);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 'a', (double) (byte) 10);
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) '#');
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer21 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter22 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer21);
        gaussianFitter22.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter22.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter22.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray34 = gaussianFitter22.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray34);
        double[] doubleArray36 = parameterGuesser35.guess();
        double[] doubleArray37 = parameterGuesser35.guess();
        double[] doubleArray38 = parameterGuesser35.guess();
        double[] doubleArray39 = parameterGuesser35.guess();
        double[] doubleArray40 = parameterGuesser35.guess();
        double[] doubleArray41 = parameterGuesser35.guess();
        double[] doubleArray42 = parameterGuesser35.guess();
        double[] doubleArray43 = parameterGuesser35.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray44 = gaussianFitter1.fit(doubleArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint6);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray11, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] { null, null });
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = gaussianFitter1.getObservations();
        java.lang.Class<?> wildcardClass3 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) 1, (double) (short) -1);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction18 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer19 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter20 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer19);
        gaussianFitter20.addObservedPoint((double) 0.0f, (double) (byte) 0);
        gaussianFitter20.addObservedPoint((double) (-1), (double) 1.0f);
        gaussianFitter20.addObservedPoint((double) (byte) 10, (double) (short) 10, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray31 = gaussianFitter20.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser32 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray31);
        double[] doubleArray33 = parameterGuesser32.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray34 = gaussianFitter1.fit(0, parametricUnivariateRealFunction18, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray16, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray31);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 97.0d, 10.0d, 4.671269901584105d }, 1.0E-15);
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 0, (-1.0d));
        gaussianFitter1.addObservedPoint((double) 1, (double) (byte) 1, (double) (-1));
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.addObservedPoint((double) 1.0f, (double) (-1.0f));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        gaussianFitter1.addObservedPoint((double) 'a', 1.0d);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1L), 1.0d, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0, (double) 1.0f);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction34 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer35 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter36 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer35);
        gaussianFitter36.addObservedPoint((double) 0.0f, (double) (byte) 0);
        gaussianFitter36.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        gaussianFitter36.addObservedPoint((double) (short) -1, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray47 = gaussianFitter36.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray48 = gaussianFitter36.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser49 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray48);
        double[] doubleArray50 = parameterGuesser49.guess();
        double[] doubleArray51 = parameterGuesser49.guess();
        double[] doubleArray52 = parameterGuesser49.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray53 = gaussianFitter1.fit((int) (short) -1, parametricUnivariateRealFunction34, doubleArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(weightedObservedPointArray47);
        org.junit.Assert.assertNotNull(weightedObservedPointArray48);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) (short) 100, (double) (byte) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer18 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter19 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer18);
        gaussianFitter19.clearObservations();
        gaussianFitter19.addObservedPoint((double) (byte) 10, 0.0d);
        gaussianFitter19.addObservedPoint((double) (byte) -1, (double) 10);
        gaussianFitter19.clearObservations();
        gaussianFitter19.addObservedPoint((double) '#', (double) (byte) 100);
        gaussianFitter19.addObservedPoint((double) (short) 1, (double) 1);
        gaussianFitter19.addObservedPoint((double) 1L, (double) 0.0f, (double) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray38 = gaussianFitter19.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser39 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray38);
        double[] doubleArray40 = parameterGuesser39.guess();
        double[] doubleArray41 = parameterGuesser39.guess();
        double[] doubleArray42 = parameterGuesser39.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = gaussianFitter1.fit(doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertNotNull(weightedObservedPointArray38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 100.0d, 35.0d, 14.863131505040334d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 100.0d, 35.0d, 14.863131505040334d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d, 35.0d, 14.863131505040334d }, 1.0E-15);
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint6);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (-1L), (double) (byte) -1);
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) ' ', 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) '#');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint22);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) 0.0f);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (short) 1, (double) 1L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint31 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint31);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer35 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter36 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer35);
        gaussianFitter36.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter36.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray44 = gaussianFitter36.getObservations();
        gaussianFitter36.addObservedPoint((double) (byte) 1, (double) (-1), (double) (short) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray49 = gaussianFitter36.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser50 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray49);
        double[] doubleArray51 = parameterGuesser50.guess();
        double[] doubleArray52 = parameterGuesser50.guess();
        double[] doubleArray53 = parameterGuesser50.guess();
        double[] doubleArray54 = parameterGuesser50.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray55 = gaussianFitter1.fit(doubleArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray44);
        org.junit.Assert.assertNotNull(weightedObservedPointArray49);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (-1), (double) '#');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint6);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (-1L), (double) (byte) -1);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        java.lang.Class<?> wildcardClass15 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray13, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 'a', (double) 100L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) 10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray5, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 1, (double) 1);
        gaussianFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 0, (double) 'a', (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.addObservedPoint((double) 10.0f, 10.0d, (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint20);
        gaussianFitter1.addObservedPoint((double) 1L, (double) 0, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint26 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint26);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint28 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint28);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint30 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint30);
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) 100.0f, (double) 1.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 100, (double) (byte) 10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) (-1L), 0.0d);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) (short) 0);
        gaussianFitter1.addObservedPoint((double) '#', (double) (byte) 100, (double) (short) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1), 0.0d);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser29 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray28, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0, 0.0d);
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) (byte) 0);
        gaussianFitter1.addObservedPoint((double) 1, (double) (byte) 1);
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) 1, (double) 1L);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 10L, (double) 1L);
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        gaussianFitter1.addObservedPoint((double) (byte) 1, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) 1);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction14 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer15 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter16 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer15);
        gaussianFitter16.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter16.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter16.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        gaussianFitter16.addObservedPoint((double) (-1L), 0.0d);
        gaussianFitter16.addObservedPoint((double) (short) 0, (double) (short) 0);
        gaussianFitter16.addObservedPoint((double) '#', (double) (byte) 100, (double) (short) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray38 = gaussianFitter16.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser39 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray38);
        double[] doubleArray40 = parameterGuesser39.guess();
        double[] doubleArray41 = parameterGuesser39.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray42 = gaussianFitter1.fit((int) (byte) 0, parametricUnivariateRealFunction14, doubleArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 100.0d, (-1.0d), 0.2144537545727248d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 100.0d, (-1.0d), 0.2144537545727248d }, 1.0E-15);
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (-1), (double) '#');
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
        java.lang.Class<?> wildcardClass19 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) (short) 100, (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray23 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(0.0d, (double) 10, (double) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint21 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint21);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint26 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint26);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 'a', (double) (short) 100);
        gaussianFitter1.addObservedPoint((double) 'a', 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint35 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint35);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint37 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint37);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint39 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint39);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray41 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(weightedObservedPointArray41);
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) '#', (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 1, (double) 1);
        gaussianFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) '4', (double) 100.0f, (double) (-1));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray11, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray12, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray13, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (byte) 100);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 10L, (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint15);
        gaussianFitter1.addObservedPoint((double) (short) 100, (double) ' ');
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) (-1), (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint24 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint24);
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        gaussianFitter1.addObservedPoint((double) (short) -1, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.addObservedPoint((double) 0L, 1.0d, (double) 1.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        gaussianFitter1.addObservedPoint(1.0d, (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) 'a', (-1.0d), (double) '#');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint23 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint23);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint28 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint28);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) '#');
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) '4', (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint37 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint37);
        gaussianFitter1.clearObservations();
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 10L, (double) 0.0f, (double) 1L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (byte) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) (short) -1, (double) (byte) 100);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (-1), (double) '#');
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 0L, 10.0d);
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 0.0f, 100.0d);
        gaussianFitter1.addObservedPoint((double) 'a', (double) 1L);
        gaussianFitter1.addObservedPoint((double) 10, 100.0d, (double) 100.0f);
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer28 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter29 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer28);
        gaussianFitter29.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter29.addObservedPoint(1.0d, (double) 0.0f, (double) 0);
        gaussianFitter29.addObservedPoint((double) 100L, (double) 1);
        gaussianFitter29.addObservedPoint((double) 0.0f, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray43 = gaussianFitter29.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser44 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray43);
        double[] doubleArray45 = parameterGuesser44.guess();
        double[] doubleArray46 = parameterGuesser44.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray47 = gaussianFitter1.fit(doubleArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray43);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d, 0.0d, 7.549527113671281d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 100.0d, 0.0d, 7.549527113671281d }, 1.0E-15);
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (byte) 100);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100L, (double) (byte) -1);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction19 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer20 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter21 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer20);
        gaussianFitter21.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter21.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint29 = null;
        gaussianFitter21.addObservedPoint(weightedObservedPoint29);
        gaussianFitter21.clearObservations();
        gaussianFitter21.addObservedPoint((double) '#', (double) (-1L), (double) 0L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = gaussianFitter21.getObservations();
        gaussianFitter21.addObservedPoint((double) (byte) 100, (double) (-1.0f), (double) (byte) 10);
        gaussianFitter21.addObservedPoint((double) 'a', (double) (byte) 0, (double) 100L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray45 = gaussianFitter21.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser46 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray45);
        double[] doubleArray47 = parameterGuesser46.guess();
        double[] doubleArray48 = parameterGuesser46.guess();
        double[] doubleArray49 = parameterGuesser46.guess();
        double[] doubleArray50 = parameterGuesser46.guess();
        double[] doubleArray51 = parameterGuesser46.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray52 = gaussianFitter1.fit(0, parametricUnivariateRealFunction19, doubleArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(weightedObservedPointArray45);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 100.0d, 0.0d, 0.42466090014400953d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 100.0d, 0.0d, 0.42466090014400953d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 100.0d, 0.0d, 0.42466090014400953d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 100.0d, 0.0d, 0.42466090014400953d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 100.0d, 0.0d, 0.42466090014400953d }, 1.0E-15);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(0.0d, (double) 10, (double) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint21 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint21);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint26 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint26);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 100L, 10.0d);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint34 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint34);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint36 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint36);
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) (-1L), 0.0d);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) 100.0f, 100.0d);
        gaussianFitter1.addObservedPoint((double) (short) 100, (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer25 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter26 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer25);
        gaussianFitter26.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter26.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter26.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray38 = gaussianFitter26.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser39 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray38);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser40 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray38);
        double[] doubleArray41 = parameterGuesser40.guess();
        double[] doubleArray42 = parameterGuesser40.guess();
        double[] doubleArray43 = parameterGuesser40.guess();
        double[] doubleArray44 = parameterGuesser40.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray45 = gaussianFitter1.fit(doubleArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
        org.junit.Assert.assertNotNull(weightedObservedPointArray38);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) ' ');
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (-1.0f));
        gaussianFitter1.addObservedPoint((double) (short) 100, (double) 1L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint24 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint24);
        java.lang.Class<?> wildcardClass26 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) (byte) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
        java.lang.Class<?> wildcardClass19 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) (short) 0, (double) 1L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 1, (double) 0, (double) 10L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint22);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(0.0d, (double) 10, (double) 10);
        gaussianFitter1.addObservedPoint((double) 'a', (double) (-1), (double) 1.0f);
        gaussianFitter1.addObservedPoint((double) 0, (double) 0.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) ' ', (double) (byte) 1, (double) 0L);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction33 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer34 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter35 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer34);
        gaussianFitter35.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter35.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter35.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        gaussianFitter35.addObservedPoint((double) (-1L), 0.0d);
        gaussianFitter35.addObservedPoint((double) (short) 0, (double) (short) 0);
        gaussianFitter35.addObservedPoint((double) '#', (double) (byte) 100, (double) (short) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray57 = gaussianFitter35.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser58 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray57);
        double[] doubleArray59 = parameterGuesser58.guess();
        double[] doubleArray60 = parameterGuesser58.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray61 = gaussianFitter1.fit(parametricUnivariateRealFunction33, doubleArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(weightedObservedPointArray57);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 100.0d, (-1.0d), 0.2144537545727248d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 100.0d, (-1.0d), 0.2144537545727248d }, 1.0E-15);
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.addObservedPoint((double) 100L, (double) 100);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (-1.0d));
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) (-1L));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1L), (double) 10L);
        gaussianFitter1.addObservedPoint((double) (short) 100, (double) (short) 0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(1.0d, (double) 1L);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction27 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer28 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter29 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer28);
        gaussianFitter29.clearObservations();
        gaussianFitter29.addObservedPoint((double) (byte) 10, 0.0d);
        gaussianFitter29.addObservedPoint((double) (-1.0f), (double) (-1L));
        gaussianFitter29.addObservedPoint((double) 'a', 1.0d);
        gaussianFitter29.addObservedPoint((double) '4', (double) (byte) 10, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray44 = gaussianFitter29.getObservations();
        gaussianFitter29.addObservedPoint(0.0d, (double) 100.0f, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray49 = gaussianFitter29.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser50 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray49);
        double[] doubleArray51 = parameterGuesser50.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray52 = gaussianFitter1.fit((int) (byte) 0, parametricUnivariateRealFunction27, doubleArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray44);
        org.junit.Assert.assertNotNull(weightedObservedPointArray49);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 97.0d, 100.0d, 42.89075091454496d }, 1.0E-15);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 1.0f, (double) (short) 0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0, (double) (short) 0, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray16, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray17, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray24, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray17, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray18, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) 1, (double) 1L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser9 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) (-1), (double) (short) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser15 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray14);
        double[] doubleArray16 = parameterGuesser15.guess();
        double[] doubleArray17 = parameterGuesser15.guess();
        double[] doubleArray18 = parameterGuesser15.guess();
        double[] doubleArray19 = parameterGuesser15.guess();
        double[] doubleArray20 = parameterGuesser15.guess();
        java.lang.Class<?> wildcardClass21 = doubleArray20.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 0L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.addObservedPoint((double) '4', 0.0d);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) 1L);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray12, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray13, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        gaussianFitter1.addObservedPoint((double) 1.0f, (double) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        java.lang.Class<?> wildcardClass14 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint(1.0d, (double) 0.0f, (double) 0);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction10 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer11 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter12 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer11);
        gaussianFitter12.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter12.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter12.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = gaussianFitter12.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser25 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray24);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser26 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray24);
        double[] doubleArray27 = parameterGuesser26.guess();
        double[] doubleArray28 = parameterGuesser26.guess();
        double[] doubleArray29 = parameterGuesser26.guess();
        double[] doubleArray30 = parameterGuesser26.guess();
        double[] doubleArray31 = parameterGuesser26.guess();
        double[] doubleArray32 = parameterGuesser26.guess();
        double[] doubleArray33 = parameterGuesser26.guess();
        double[] doubleArray34 = parameterGuesser26.guess();
        double[] doubleArray35 = parameterGuesser26.guess();
        double[] doubleArray36 = parameterGuesser26.guess();
        double[] doubleArray37 = parameterGuesser26.guess();
        double[] doubleArray38 = parameterGuesser26.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray39 = gaussianFitter1.fit((-1), parametricUnivariateRealFunction10, doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (-1), (double) '#');
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 1, (double) 1);
        gaussianFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        gaussianFitter1.addObservedPoint((double) 1, (double) (-1L), (double) (byte) 100);
        gaussianFitter1.addObservedPoint((double) 0L, (double) (-1));
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        gaussianFitter1.addObservedPoint((double) 1, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0.0f, 0.0d);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) '#');
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) '4');
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction19 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer20 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter21 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer20);
        gaussianFitter21.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter21.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter21.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = gaussianFitter21.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray36 = parameterGuesser35.guess();
        double[] doubleArray37 = parameterGuesser35.guess();
        double[] doubleArray38 = parameterGuesser35.guess();
        double[] doubleArray39 = parameterGuesser35.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray40 = gaussianFitter1.fit(parametricUnivariateRealFunction19, doubleArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d, (-1.0d), 14.013809704752315d }, 1.0E-15);
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (-1), (double) '#');
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 10.0f, 100.0d);
        gaussianFitter1.addObservedPoint((double) 1, 10.0d);
        gaussianFitter1.addObservedPoint(10.0d, (double) (byte) 1);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction24 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer25 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter26 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer25);
        gaussianFitter26.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter26.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        gaussianFitter26.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        gaussianFitter26.addObservedPoint((double) (-1L), 0.0d);
        gaussianFitter26.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint44 = null;
        gaussianFitter26.addObservedPoint(weightedObservedPoint44);
        gaussianFitter26.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray47 = gaussianFitter26.getObservations();
        gaussianFitter26.addObservedPoint((double) 1.0f, (double) 10L, (double) (-1L));
        gaussianFitter26.addObservedPoint(1.0d, (double) 'a', (double) (byte) 0);
        gaussianFitter26.addObservedPoint((double) 0, (double) 100, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray60 = gaussianFitter26.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser61 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray60);
        double[] doubleArray62 = parameterGuesser61.guess();
        double[] doubleArray63 = parameterGuesser61.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray64 = gaussianFitter1.fit((int) '#', parametricUnivariateRealFunction24, doubleArray63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray47);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray47, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray60);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 100.0d, 100.0d, 38.219481012960856d }, 1.0E-15);
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 0, (-1.0d));
        gaussianFitter1.addObservedPoint((double) 1, (double) (byte) 1, (double) (-1));
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) 100L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) (short) -1, (double) ' ');
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) 0.0f);
        java.lang.Class<?> wildcardClass22 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] { null, null });
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.addObservedPoint(100.0d, (double) 'a');
        gaussianFitter1.addObservedPoint((double) (short) 100, (double) 0.0f, (double) (short) 100);
    }
}

