package org.apache.commons.math3.optimization.fitting;

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
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint15);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) (-1L), 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) 100);
        harmonicFitter1.addObservedPoint((double) 10L, (double) ' ', 0.0d);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer29 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter30 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer29);
        harmonicFitter30.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter30.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter30.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray42 = harmonicFitter30.getObservations();
        harmonicFitter30.addObservedPoint((double) (-1L), (double) 100.0f, (double) (short) 10);
        harmonicFitter30.addObservedPoint((double) 1, (double) 1.0f);
        harmonicFitter30.addObservedPoint(0.0d, (double) (byte) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray53 = harmonicFitter30.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser54 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray53);
        double[] doubleArray55 = parameterGuesser54.guess();
        double[] doubleArray56 = parameterGuesser54.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray57 = harmonicFitter1.fit(doubleArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray42);
        org.junit.Assert.assertNotNull(weightedObservedPointArray53);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 'a', 1.0d);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((-1.0d), (double) 0.0f);
        harmonicFitter1.addObservedPoint((double) 100, (double) '4');
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray13, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (byte) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) 1L, (double) (-1L));
        harmonicFitter1.addObservedPoint((double) 10, 10.0d, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser18 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray17);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser19 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray17);
        double[] doubleArray20 = parameterGuesser19.guess();
        double[] doubleArray21 = parameterGuesser19.guess();
        double[] doubleArray22 = parameterGuesser19.guess();
        double[] doubleArray23 = parameterGuesser19.guess();
        double[] doubleArray24 = parameterGuesser19.guess();
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100L, (double) 10L);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 100L, (double) 100);
        harmonicFitter1.addObservedPoint((double) 10.0f, (double) 1);
        harmonicFitter1.addObservedPoint((double) (byte) 1, (double) (byte) 10);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint(10.0d, 0.0d);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric19 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer20 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter21 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer20);
        harmonicFitter21.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter21.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        harmonicFitter21.addObservedPoint((double) (short) -1, (-1.0d));
        harmonicFitter21.addObservedPoint((double) '#', (double) (byte) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = harmonicFitter21.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray35);
        double[] doubleArray37 = parameterGuesser36.guess();
        double[] doubleArray38 = parameterGuesser36.guess();
        double[] doubleArray39 = parameterGuesser36.guess();
        double[] doubleArray40 = parameterGuesser36.guess();
        double[] doubleArray41 = parameterGuesser36.guess();
        double[] doubleArray42 = parameterGuesser36.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = harmonicFitter1.fit(parametric19, doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint4);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.addObservedPoint(1.0d, (double) 10L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.addObservedPoint((double) 0, (double) 1, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint7);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint10);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) 'a');
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
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
        harmonicFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray24 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
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
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser27 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray26);
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        harmonicFitter1.addObservedPoint((double) 1, (double) 0, (-1.0d));
        harmonicFitter1.addObservedPoint((double) 10L, (double) 0L, (double) 10);
        harmonicFitter1.addObservedPoint(0.0d, (double) 10L, (double) (byte) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint21 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint21);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric25 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer26 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter27 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer26);
        harmonicFitter27.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter27.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter27.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter27.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter27.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray45 = harmonicFitter27.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray46 = harmonicFitter27.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray47 = harmonicFitter27.getObservations();
        harmonicFitter27.addObservedPoint(0.0d, (double) (short) 10);
        harmonicFitter27.addObservedPoint((double) '4', (double) (byte) 100, (double) 0.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray55 = harmonicFitter27.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser56 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray55);
        double[] doubleArray57 = parameterGuesser56.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray58 = harmonicFitter1.fit((int) (short) -1, parametric25, doubleArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
        org.junit.Assert.assertNotNull(weightedObservedPointArray45);
        org.junit.Assert.assertNotNull(weightedObservedPointArray46);
        org.junit.Assert.assertNotNull(weightedObservedPointArray47);
        org.junit.Assert.assertNotNull(weightedObservedPointArray55);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint(0.0d, (double) (-1.0f), (double) 10L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 'a', (double) 100, (double) 1);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint21 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint21);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric23 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer24 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter25 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer24);
        harmonicFitter25.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter25.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter25.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter25.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter25.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray43 = harmonicFitter25.getObservations();
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
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray43);
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
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint20);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 10, (-1.0d));
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint27 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint27);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric30 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer31 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter32 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer31);
        harmonicFitter32.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter32.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        harmonicFitter32.addObservedPoint((double) (short) -1, (-1.0d));
        harmonicFitter32.addObservedPoint((double) '#', (double) (byte) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray46 = harmonicFitter32.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser47 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray46);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser48 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray46);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser49 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray46);
        double[] doubleArray50 = parameterGuesser49.guess();
        double[] doubleArray51 = parameterGuesser49.guess();
        double[] doubleArray52 = parameterGuesser49.guess();
        double[] doubleArray53 = parameterGuesser49.guess();
        double[] doubleArray54 = parameterGuesser49.guess();
        double[] doubleArray55 = parameterGuesser49.guess();
        double[] doubleArray56 = parameterGuesser49.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray57 = harmonicFitter1.fit(parametric30, doubleArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertNotNull(weightedObservedPointArray46);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
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
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser22 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray21);
        double[] doubleArray23 = parameterGuesser22.guess();
        double[] doubleArray24 = parameterGuesser22.guess();
        double[] doubleArray25 = parameterGuesser22.guess();
        java.lang.Class<?> wildcardClass26 = doubleArray25.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint7);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 100, (-1.0d), (double) 100L);
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
        double[] doubleArray41 = parameterGuesser37.guess();
        double[] doubleArray42 = parameterGuesser37.guess();
        double[] doubleArray43 = parameterGuesser37.guess();
        double[] doubleArray44 = parameterGuesser37.guess();
        double[] doubleArray45 = parameterGuesser37.guess();
        double[] doubleArray46 = parameterGuesser37.guess();
        double[] doubleArray47 = parameterGuesser37.guess();
        double[] doubleArray48 = parameterGuesser37.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray49 = harmonicFitter1.fit(parametric15, doubleArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
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
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.addObservedPoint(10.0d, (double) 'a', 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 0.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) -1, (double) 1.0f, (double) (short) 1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) (short) -1, (-1.0d));
        harmonicFitter1.addObservedPoint((double) '#', (double) (byte) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser16 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray15);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser17 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray15);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser18 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray15);
        java.lang.Class<?> wildcardClass19 = parameterGuesser18.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 10, (double) '#', (double) ' ');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser14 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 2 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) 10, (double) (byte) 100);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) -1, 10.0d);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) 10.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser15 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray14);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser16 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray14);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser17 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 0, 1.0d);
        harmonicFitter1.addObservedPoint((double) 1.0f, (double) 1.0f, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) (short) 0, (double) '4');
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (byte) 10, (double) (short) -1);
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
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser42 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray40);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser43 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray40);
        double[] doubleArray44 = parameterGuesser43.guess();
        double[] doubleArray45 = parameterGuesser43.guess();
        double[] doubleArray46 = parameterGuesser43.guess();
        double[] doubleArray47 = parameterGuesser43.guess();
        double[] doubleArray48 = parameterGuesser43.guess();
        double[] doubleArray49 = parameterGuesser43.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray50 = harmonicFitter1.fit(doubleArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray39);
        org.junit.Assert.assertNotNull(weightedObservedPointArray40);
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
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) ' ');
        harmonicFitter1.addObservedPoint(0.0d, (double) 1.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
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
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint21 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint21);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric24 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer25 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter26 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer25);
        harmonicFitter26.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter26.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        harmonicFitter26.addObservedPoint((double) (short) -1, (-1.0d));
        harmonicFitter26.addObservedPoint((double) '#', (double) (byte) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray40 = harmonicFitter26.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser41 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray40);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser42 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray40);
        double[] doubleArray43 = parameterGuesser42.guess();
        double[] doubleArray44 = parameterGuesser42.guess();
        double[] doubleArray45 = parameterGuesser42.guess();
        double[] doubleArray46 = parameterGuesser42.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray47 = harmonicFitter1.fit((-1), parametric24, doubleArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(weightedObservedPointArray40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray4 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer8 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter9 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer8);
        harmonicFitter9.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter9.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter9.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter9.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter9.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = harmonicFitter9.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = harmonicFitter9.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser29 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray28);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray28);
        double[] doubleArray31 = parameterGuesser30.guess();
        double[] doubleArray32 = parameterGuesser30.guess();
        double[] doubleArray33 = parameterGuesser30.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray34 = harmonicFitter1.fit(doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray7, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (byte) -1);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) 1, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint15);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint17);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray12, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray19, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null, null, null });
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint(1.0d, (double) 0.0f, (double) 0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        java.lang.Class<?> wildcardClass17 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray12, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray15, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
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
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint18);
        harmonicFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray12, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray17, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 100.0f, 1.0d, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) '4', (double) (byte) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer26 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter27 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer26);
        harmonicFitter27.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter27.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter27.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter27.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter27.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray45 = harmonicFitter27.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray46 = harmonicFitter27.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser47 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray46);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser48 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray46);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser49 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray46);
        double[] doubleArray50 = parameterGuesser49.guess();
        double[] doubleArray51 = parameterGuesser49.guess();
        double[] doubleArray52 = parameterGuesser49.guess();
        double[] doubleArray53 = parameterGuesser49.guess();
        double[] doubleArray54 = parameterGuesser49.guess();
        double[] doubleArray55 = parameterGuesser49.guess();
        double[] doubleArray56 = parameterGuesser49.guess();
        double[] doubleArray57 = parameterGuesser49.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray58 = harmonicFitter1.fit(doubleArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(weightedObservedPointArray45);
        org.junit.Assert.assertNotNull(weightedObservedPointArray46);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
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
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 1, (double) 100L, (double) 10.0f);
        harmonicFitter1.addObservedPoint((double) (-1), (double) 10.0f);
        harmonicFitter1.clearObservations();
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 10L, (double) 1L);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 1, (double) (byte) 10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 1L, (double) 0L, (double) (byte) 1);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer24 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter25 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer24);
        harmonicFitter25.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter25.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        harmonicFitter25.addObservedPoint((double) (short) -1, (-1.0d));
        harmonicFitter25.addObservedPoint((double) '#', (double) (byte) 100);
        harmonicFitter25.addObservedPoint(0.0d, (double) 10, (double) 10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray43 = harmonicFitter25.getObservations();
        harmonicFitter25.addObservedPoint((double) (byte) 0, (double) 0, 1.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray48 = harmonicFitter25.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser49 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray48);
        double[] doubleArray50 = parameterGuesser49.guess();
        double[] doubleArray51 = parameterGuesser49.guess();
        double[] doubleArray52 = parameterGuesser49.guess();
        double[] doubleArray53 = parameterGuesser49.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray54 = harmonicFitter1.fit(doubleArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray11, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertNotNull(weightedObservedPointArray43);
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
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
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
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray28, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 1, 100.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        harmonicFitter1.addObservedPoint(10.0d, (double) 100, (double) (byte) 10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint18);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer20 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter21 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer20);
        harmonicFitter21.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter21.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        harmonicFitter21.addObservedPoint((double) (short) -1, (-1.0d));
        harmonicFitter21.addObservedPoint((double) '#', (double) (byte) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = harmonicFitter21.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray35);
        double[] doubleArray37 = parameterGuesser36.guess();
        double[] doubleArray38 = parameterGuesser36.guess();
        double[] doubleArray39 = parameterGuesser36.guess();
        double[] doubleArray40 = parameterGuesser36.guess();
        double[] doubleArray41 = parameterGuesser36.guess();
        double[] doubleArray42 = parameterGuesser36.guess();
        double[] doubleArray43 = parameterGuesser36.guess();
        double[] doubleArray44 = parameterGuesser36.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray45 = harmonicFitter1.fit(doubleArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.addObservedPoint((double) 10L, 0.0d, (double) '#');
        harmonicFitter1.addObservedPoint((-1.0d), (double) '#');
        harmonicFitter1.addObservedPoint((double) '#', (double) (-1L), (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint21 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint21);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (byte) 100, (-1.0d));
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) 1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 10L, (double) (byte) -1);
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) 1L, (double) (-1L));
        harmonicFitter1.addObservedPoint((double) (-1), (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 100L, (double) 100);
        harmonicFitter1.addObservedPoint((double) 10.0f, (double) 1);
        harmonicFitter1.addObservedPoint((double) (byte) 1, (double) (byte) 10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric17 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer18 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter19 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer18);
        harmonicFitter19.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter19.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint27 = null;
        harmonicFitter19.addObservedPoint(weightedObservedPoint27);
        harmonicFitter19.clearObservations();
        harmonicFitter19.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter19.addObservedPoint((double) 100, (double) (short) 0, (double) '4');
        harmonicFitter19.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter19.addObservedPoint((double) (byte) 0, (double) (byte) 100, (double) 1);
        harmonicFitter19.addObservedPoint((double) 0L, (double) 100L, (double) 1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray48 = harmonicFitter19.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser49 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray48);
        double[] doubleArray50 = parameterGuesser49.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray51 = harmonicFitter1.fit((-1), parametric17, doubleArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray48);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (byte) 100);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) 1L, (double) 1.0f);
        harmonicFitter1.addObservedPoint((double) 10.0f, (double) (-1.0f), (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass27 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter1.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser23 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray22, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
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
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray4);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray4, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray15, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
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
        harmonicFitter1.addObservedPoint((double) '#', 1.0d);
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray31 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint32 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint32);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint34 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint34);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint36 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint36);
        org.junit.Assert.assertNotNull(weightedObservedPointArray31);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (byte) 100);
        harmonicFitter1.addObservedPoint(1.0d, (double) 0L, 10.0d);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric22 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer23 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter24 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer23);
        harmonicFitter24.clearObservations();
        harmonicFitter24.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter24.addObservedPoint((double) (byte) -1, (double) 10);
        harmonicFitter24.addObservedPoint((double) (byte) 0, (double) 1L, (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = harmonicFitter24.getObservations();
        harmonicFitter24.addObservedPoint((double) (short) 10, 100.0d, (double) '#');
        harmonicFitter24.addObservedPoint((double) (-1), (double) 1L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray44 = harmonicFitter24.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser45 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray44);
        double[] doubleArray46 = parameterGuesser45.guess();
        double[] doubleArray47 = parameterGuesser45.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray48 = harmonicFitter1.fit((int) '#', parametric22, doubleArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(weightedObservedPointArray44);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint4);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.addObservedPoint(1.0d, (double) 10L);
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
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray32);
        double[] doubleArray35 = parameterGuesser34.guess();
        double[] doubleArray36 = parameterGuesser34.guess();
        double[] doubleArray37 = parameterGuesser34.guess();
        double[] doubleArray38 = parameterGuesser34.guess();
        double[] doubleArray39 = parameterGuesser34.guess();
        double[] doubleArray40 = parameterGuesser34.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray41 = harmonicFitter1.fit(doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
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
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (-1), (double) '#');
        harmonicFitter1.addObservedPoint((double) 100L, 100.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser17 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray16);
        double[] doubleArray18 = parameterGuesser17.guess();
        double[] doubleArray19 = parameterGuesser17.guess();
        double[] doubleArray20 = parameterGuesser17.guess();
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
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
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint27 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint27);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint29 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint29);
        harmonicFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray25, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] { null });
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) '#');
        java.lang.Class<?> wildcardClass16 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
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
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint30 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint30);
        harmonicFitter1.addObservedPoint(0.0d, (double) (byte) -1);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer35 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter36 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer35);
        harmonicFitter36.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter36.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter36.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter36.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter36.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray54 = harmonicFitter36.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray55 = harmonicFitter36.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser56 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray55);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser57 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray55);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser58 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray55);
        double[] doubleArray59 = parameterGuesser58.guess();
        double[] doubleArray60 = parameterGuesser58.guess();
        double[] doubleArray61 = parameterGuesser58.guess();
        double[] doubleArray62 = parameterGuesser58.guess();
        double[] doubleArray63 = parameterGuesser58.guess();
        double[] doubleArray64 = parameterGuesser58.guess();
        double[] doubleArray65 = parameterGuesser58.guess();
        double[] doubleArray66 = parameterGuesser58.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray67 = harmonicFitter1.fit(doubleArray66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray54);
        org.junit.Assert.assertNotNull(weightedObservedPointArray55);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) 1L, (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, 100.0d, (double) '#');
        harmonicFitter1.addObservedPoint((double) ' ', 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint21 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint21);
        java.lang.Class<?> wildcardClass23 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
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
        harmonicFitter1.addObservedPoint(0.0d, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint28 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint28);
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint4);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.addObservedPoint(10.0d, (double) (byte) 0);
        harmonicFitter1.addObservedPoint(10.0d, (double) (byte) 1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        harmonicFitter1.addObservedPoint(100.0d, 100.0d);
        harmonicFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
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
        harmonicFitter1.addObservedPoint((double) '#', 1.0d);
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray31 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint32 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint32);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint34 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint34);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer36 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter37 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer36);
        harmonicFitter37.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter37.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter37.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter37.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter37.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray56 = harmonicFitter37.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser57 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray56);
        double[] doubleArray58 = parameterGuesser57.guess();
        double[] doubleArray59 = parameterGuesser57.guess();
        double[] doubleArray60 = parameterGuesser57.guess();
        double[] doubleArray61 = parameterGuesser57.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray62 = harmonicFitter1.fit(doubleArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray31);
        org.junit.Assert.assertNotNull(weightedObservedPointArray56);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 100L, (double) 100);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 1, 1.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint17);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer6 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter7 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer6);
        harmonicFitter7.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter7.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter7.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter7.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter7.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = harmonicFitter7.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = harmonicFitter7.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = harmonicFitter7.getObservations();
        harmonicFitter7.addObservedPoint(0.0d, (double) (short) 10);
        harmonicFitter7.addObservedPoint((double) '4', (double) (byte) 100, (double) 0.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = harmonicFitter7.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray35);
        double[] doubleArray37 = parameterGuesser36.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray38 = harmonicFitter1.fit(doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint(1.0d, (double) 100, (double) '4');
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (-1.0f));
        harmonicFitter1.addObservedPoint((double) ' ', (double) 1.0f, (double) (byte) 10);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric8 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer9 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter10 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer9);
        harmonicFitter10.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter10.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter10.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter10.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter10.addObservedPoint((double) (byte) 1, (double) (short) 100, (-1.0d));
        harmonicFitter10.addObservedPoint((double) (-1), (double) 1, (double) (short) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray34 = harmonicFitter10.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray34);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray34);
        double[] doubleArray37 = parameterGuesser36.guess();
        double[] doubleArray38 = parameterGuesser36.guess();
        double[] doubleArray39 = parameterGuesser36.guess();
        double[] doubleArray40 = parameterGuesser36.guess();
        double[] doubleArray41 = parameterGuesser36.guess();
        double[] doubleArray42 = parameterGuesser36.guess();
        double[] doubleArray43 = parameterGuesser36.guess();
        double[] doubleArray44 = parameterGuesser36.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray45 = harmonicFitter1.fit(0, parametric8, doubleArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
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
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 100);
        harmonicFitter1.addObservedPoint(100.0d, (double) 0.0f, (double) (byte) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint(0.0d, (double) 1.0f, (double) 100L);
        harmonicFitter1.clearObservations();
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
        double[] doubleArray37 = parameterGuesser34.guess();
        double[] doubleArray38 = parameterGuesser34.guess();
        double[] doubleArray39 = parameterGuesser34.guess();
        double[] doubleArray40 = parameterGuesser34.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray41 = harmonicFitter1.fit(parametric12, doubleArray40);
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
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint4);
        harmonicFitter1.addObservedPoint((double) (byte) 1, (double) ' ', 0.0d);
        harmonicFitter1.addObservedPoint((double) (short) -1, (double) 0.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 100, 100.0d);
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
        double[] doubleArray45 = parameterGuesser41.guess();
        double[] doubleArray46 = parameterGuesser41.guess();
        double[] doubleArray47 = parameterGuesser41.guess();
        double[] doubleArray48 = parameterGuesser41.guess();
        double[] doubleArray49 = parameterGuesser41.guess();
        double[] doubleArray50 = parameterGuesser41.guess();
        double[] doubleArray51 = parameterGuesser41.guess();
        double[] doubleArray52 = parameterGuesser41.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray53 = harmonicFitter1.fit(doubleArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray39);
        org.junit.Assert.assertNotNull(weightedObservedPointArray40);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
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
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
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
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 100L, (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) 0.0f, (double) 10);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint17);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) 10L, (double) 100L);
        harmonicFitter1.addObservedPoint((double) (byte) 0, 10.0d);
        double[] doubleArray26 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray27 = harmonicFitter1.fit(doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
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
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass24 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.addObservedPoint(10.0d, (double) 'a', 0.0d);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        harmonicFitter1.addObservedPoint(10.0d, (double) 10.0f, (double) 10.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric22 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer23 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter24 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer23);
        harmonicFitter24.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter24.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        harmonicFitter24.addObservedPoint((double) (short) -1, (-1.0d));
        harmonicFitter24.addObservedPoint((double) '#', (double) (byte) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray38 = harmonicFitter24.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser39 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray38);
        double[] doubleArray40 = parameterGuesser39.guess();
        double[] doubleArray41 = parameterGuesser39.guess();
        double[] doubleArray42 = parameterGuesser39.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = harmonicFitter1.fit((-1), parametric22, doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 'a');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser17 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
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
        harmonicFitter1.addObservedPoint(100.0d, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint25 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint25);
        harmonicFitter1.addObservedPoint((double) 100L, (double) 10L);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) (short) -1, (-1.0d));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer14 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter15 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer14);
        harmonicFitter15.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter15.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter15.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter15.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter15.addObservedPoint((double) (byte) 1, (double) (short) 100, (-1.0d));
        harmonicFitter15.addObservedPoint((double) (-1), (double) 1, (double) (short) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray39 = harmonicFitter15.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser40 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray39);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser41 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray39);
        double[] doubleArray42 = parameterGuesser41.guess();
        double[] doubleArray43 = parameterGuesser41.guess();
        double[] doubleArray44 = parameterGuesser41.guess();
        double[] doubleArray45 = parameterGuesser41.guess();
        double[] doubleArray46 = parameterGuesser41.guess();
        double[] doubleArray47 = parameterGuesser41.guess();
        double[] doubleArray48 = parameterGuesser41.guess();
        double[] doubleArray49 = parameterGuesser41.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray50 = harmonicFitter1.fit(doubleArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray39);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
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
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) 1L, (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, 100.0d, (double) '#');
        harmonicFitter1.addObservedPoint((double) ' ', 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric23 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer24 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter25 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer24);
        harmonicFitter25.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter25.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter25.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter25.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter25.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray43 = harmonicFitter25.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray44 = harmonicFitter25.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser45 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray44);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser46 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray44);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser47 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray44);
        double[] doubleArray48 = parameterGuesser47.guess();
        double[] doubleArray49 = parameterGuesser47.guess();
        double[] doubleArray50 = parameterGuesser47.guess();
        double[] doubleArray51 = parameterGuesser47.guess();
        double[] doubleArray52 = parameterGuesser47.guess();
        double[] doubleArray53 = parameterGuesser47.guess();
        double[] doubleArray54 = parameterGuesser47.guess();
        double[] doubleArray55 = parameterGuesser47.guess();
        double[] doubleArray56 = parameterGuesser47.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray57 = harmonicFitter1.fit(parametric23, doubleArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(weightedObservedPointArray43);
        org.junit.Assert.assertNotNull(weightedObservedPointArray44);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
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
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) 100, (double) (short) 0, (double) '4');
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (byte) 100, (double) 1);
        harmonicFitter1.addObservedPoint(1.0d, (double) (byte) 10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray29);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray29);
        double[] doubleArray32 = parameterGuesser31.guess();
        double[] doubleArray33 = parameterGuesser31.guess();
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint4);
        harmonicFitter1.addObservedPoint((double) (byte) 1, (double) ' ', 0.0d);
        harmonicFitter1.addObservedPoint((double) (short) -1, (double) 0.0f);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint(0.0d, 0.0d);
        java.lang.Class<?> wildcardClass17 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) '#', (double) 10.0f);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 0L, (double) (short) -1);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint(0.0d, (double) (byte) 100, (double) '#');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray21, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        harmonicFitter1.addObservedPoint((double) 10L, (double) 100.0f);
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) 0, (double) 0.0f, (double) (short) 10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint28 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint28);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint33 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint33);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        harmonicFitter1.addObservedPoint((double) 10L, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint21 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint21);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer23 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter24 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer23);
        harmonicFitter24.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter24.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter24.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter24.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter24.addObservedPoint((double) (byte) 1, (double) (short) 100, (-1.0d));
        harmonicFitter24.addObservedPoint((double) (-1), (double) 1, (double) (short) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray48 = harmonicFitter24.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser49 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray48);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser50 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray48);
        double[] doubleArray51 = parameterGuesser50.guess();
        double[] doubleArray52 = parameterGuesser50.guess();
        double[] doubleArray53 = parameterGuesser50.guess();
        double[] doubleArray54 = parameterGuesser50.guess();
        double[] doubleArray55 = parameterGuesser50.guess();
        double[] doubleArray56 = parameterGuesser50.guess();
        double[] doubleArray57 = parameterGuesser50.guess();
        double[] doubleArray58 = parameterGuesser50.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray59 = harmonicFitter1.fit(doubleArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray48);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.addObservedPoint((double) 100L, (double) 100);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (-1.0d));
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) (short) -1);
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) (short) 100, 1.0d);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) 0, (double) 100);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric12 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer13 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter14 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer13);
        harmonicFitter14.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter14.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter14.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter14.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter14.addObservedPoint((double) (byte) 1, (double) (short) 100, (-1.0d));
        harmonicFitter14.addObservedPoint((double) (-1), (double) 1, (double) (short) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray38 = harmonicFitter14.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser39 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray38);
        double[] doubleArray40 = parameterGuesser39.guess();
        double[] doubleArray41 = parameterGuesser39.guess();
        double[] doubleArray42 = parameterGuesser39.guess();
        double[] doubleArray43 = parameterGuesser39.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray44 = harmonicFitter1.fit(parametric12, doubleArray43);
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
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) (-1L));
        harmonicFitter1.addObservedPoint((double) ' ', 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) '4');
        harmonicFitter1.addObservedPoint((double) (-1L), (double) 0L);
        harmonicFitter1.addObservedPoint((double) 10, (double) (byte) 100, (double) 100.0f);
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        harmonicFitter1.addObservedPoint(1.0d, (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint21 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint21);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray23 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        harmonicFitter1.addObservedPoint((double) (short) -1, (-1.0d));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint15);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint17);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint3);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint7);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 0L, (double) 10L);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (short) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint17);
        harmonicFitter1.addObservedPoint((double) 1.0f, (double) (short) 10, (double) (byte) 0);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray10, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 10, 10.0d, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) 1, (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray14, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray15, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint4);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) (short) -1);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer12 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter13 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer12);
        harmonicFitter13.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter13.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter13.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter13.addObservedPoint((double) (-1L), 0.0d);
        harmonicFitter13.addObservedPoint((double) (short) 0, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray31 = harmonicFitter13.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray32 = harmonicFitter13.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = harmonicFitter13.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray35 = parameterGuesser34.guess();
        double[] doubleArray36 = parameterGuesser34.guess();
        double[] doubleArray37 = parameterGuesser34.guess();
        double[] doubleArray38 = parameterGuesser34.guess();
        double[] doubleArray39 = parameterGuesser34.guess();
        double[] doubleArray40 = parameterGuesser34.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray41 = harmonicFitter1.fit(doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray2, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray31);
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
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
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        harmonicFitter1.addObservedPoint(1.0d, (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
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
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint25 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint25);
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) (short) 100, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray31 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray31);
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        harmonicFitter1.addObservedPoint((double) 10L, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) (short) 0);
        harmonicFitter1.clearObservations();
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
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray3, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray9, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.addObservedPoint((double) '4', (double) 1.0f);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
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
        harmonicFitter1.addObservedPoint((double) 'a', (double) (short) 100);
        harmonicFitter1.addObservedPoint((double) 0L, 0.0d);
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) 0, (double) 100);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        harmonicFitter1.addObservedPoint(10.0d, 100.0d, (double) '4');
        harmonicFitter1.addObservedPoint((double) '4', (double) 0.0f);
        harmonicFitter1.addObservedPoint((double) 10, (double) 0.0f);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray10, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) '#', (double) 10.0f);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint22);
        harmonicFitter1.addObservedPoint((double) '#', (double) 10.0f);
        harmonicFitter1.addObservedPoint((double) 10.0f, 100.0d);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric31 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer32 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter33 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer32);
        harmonicFitter33.addObservedPoint((double) 0.0f, (double) (byte) 0);
        harmonicFitter33.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (byte) -1);
        harmonicFitter33.addObservedPoint((double) (short) -1, (-1.0d));
        harmonicFitter33.addObservedPoint((double) '#', (double) (byte) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray47 = harmonicFitter33.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser48 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray47);
        double[] doubleArray49 = parameterGuesser48.guess();
        double[] doubleArray50 = parameterGuesser48.guess();
        double[] doubleArray51 = parameterGuesser48.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray52 = harmonicFitter1.fit((int) (byte) 10, parametric31, doubleArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray21, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
        org.junit.Assert.assertNotNull(weightedObservedPointArray47);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 50.5d, 0.17453292519943295d, (-0.09920309459519693d) }, 1.0E-15);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 1, (double) 1);
        harmonicFitter1.addObservedPoint((-1.0d), 10.0d, (double) ' ');
        harmonicFitter1.addObservedPoint((double) 1, (double) 0, (-1.0d));
        harmonicFitter1.addObservedPoint((double) 10L, (double) 0L, (double) 10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint17);
        harmonicFitter1.addObservedPoint((double) 'a', (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) (-1), (double) (byte) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = harmonicFitter1.getObservations();
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
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser50 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray48);
        double[] doubleArray51 = parameterGuesser50.guess();
        double[] doubleArray52 = parameterGuesser50.guess();
        double[] doubleArray53 = parameterGuesser50.guess();
        double[] doubleArray54 = parameterGuesser50.guess();
        double[] doubleArray55 = parameterGuesser50.guess();
        double[] doubleArray56 = parameterGuesser50.guess();
        double[] doubleArray57 = parameterGuesser50.guess();
        double[] doubleArray58 = parameterGuesser50.guess();
        double[] doubleArray59 = parameterGuesser50.guess();
        double[] doubleArray60 = parameterGuesser50.guess();
        double[] doubleArray61 = parameterGuesser50.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray62 = harmonicFitter1.fit(parametric27, doubleArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
        org.junit.Assert.assertNotNull(weightedObservedPointArray47);
        org.junit.Assert.assertNotNull(weightedObservedPointArray48);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { Double.NaN, Double.NaN, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
        harmonicFitter1.addObservedPoint((double) 10L, (double) (byte) 0);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint17);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint(1.0d, (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray23 = harmonicFitter1.fit();
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
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 10);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (-1.0f), (double) 100);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (short) 1, 1.0d);
        harmonicFitter1.addObservedPoint((double) 0L, (double) (-1L), 100.0d);
        harmonicFitter1.addObservedPoint((double) 0L, 10.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray23 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertArrayEquals(weightedObservedPointArray22, new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] {});
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 0, (double) 0L, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
    }
}

