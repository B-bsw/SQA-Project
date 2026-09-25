package org.apache.commons.math.optimization.general;

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
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction1 = null;
        double[] doubleArray2 = null;
        double[] doubleArray3 = new double[] {};
        double[] doubleArray8 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair9 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction1, doubleArray2, doubleArray3, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray1 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        int int0 = org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.DEFAULT_MAX_ITERATIONS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = vectorialConvergenceChecker5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair6 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray5 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker4);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray6 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction2 = null;
        double[] doubleArray8 = new double[] { (-1), (short) 0, 0.0f, Double.NaN, (byte) 1 };
        double[] doubleArray15 = new double[] { '#', 1.0d, (short) -1, '4', 1L, (byte) 1 };
        double[] doubleArray18 = new double[] { (byte) 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction2, doubleArray8, doubleArray15, doubleArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 5 != 6");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 0.0d, 0.0d, Double.NaN, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 35.0d, 1.0d, (-1.0d), 52.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker4);
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1000 + "'", int7 == 1000);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray2 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        java.lang.Class<?> wildcardClass3 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction2 = null;
        double[] doubleArray8 = new double[] { (short) 100, (short) -1, (-1.0d), 1L, 100L };
        double[] doubleArray12 = new double[] { ' ', 100, 0.0f };
        double[] doubleArray16 = new double[] { 10.0d, '4', 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction2, doubleArray8, doubleArray12, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 5 != 3");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, (-1.0d), (-1.0d), 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 32.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 52.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray9 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer3.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker6);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray10 = new double[] { 0.0d };
        double[] doubleArray17 = new double[] { 0L, 10.0d, (short) -1, Double.NaN, (short) 1, 10 };
        double[] doubleArray22 = new double[] { 10, (-1), (short) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair23 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction8, doubleArray10, doubleArray17, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 1 != 6");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, 10.0d, (-1.0d), Double.NaN, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, (-1.0d), 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker4);
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray14 = new double[] { (-1L), 52, 10.0d, (short) -1 };
        double[] doubleArray20 = new double[] { (short) 100, Double.NaN, 100, 0.0f, ' ' };
        double[] doubleArray24 = new double[] { 52, (byte) 0, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair25 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction9, doubleArray14, doubleArray20, doubleArray24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 4 != 5");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), 52.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d, Double.NaN, 100.0d, 0.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 52.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair9 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 100);
        java.lang.Class<?> wildcardClass10 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction4 = null;
        double[] doubleArray10 = new double[] { 1, '4', 10L, 1, 100L };
        double[] doubleArray12 = new double[] { (short) 0 };
        double[] doubleArray14 = new double[] { (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction4, doubleArray10, doubleArray12, doubleArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 5 != 1");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 52.0d, 10.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        java.lang.Class<?> wildcardClass5 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray9 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getEvaluations();
        double double2 = levenbergMarquardtOptimizer0.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setConvergenceChecker(vectorialConvergenceChecker12);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        java.lang.Class<?> wildcardClass15 = vectorialConvergenceChecker12.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray9 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray12 = new double[] { 1.0f, (byte) 0, 10L };
        double[] doubleArray17 = new double[] { 1L, (short) 0, 1, 2147483647 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction7, doubleArray8, doubleArray12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 0 != 3");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 0.0d, 1.0d, 2.147483647E9d }, 1.0E-15);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10);
        java.lang.Class<?> wildcardClass9 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer7.setMaxEvaluations(1);
        double double10 = levenbergMarquardtOptimizer7.getRMS();
        double double11 = levenbergMarquardtOptimizer7.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setMaxEvaluations(1);
        double double15 = levenbergMarquardtOptimizer12.getRMS();
        levenbergMarquardtOptimizer12.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer12.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialConvergenceChecker20);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker20);
        java.lang.Class<?> wildcardClass23 = vectorialConvergenceChecker20.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1000 + "'", int14 == 1000);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray16 = new double[] { (short) 1, 100.0f, 100.0d, (-1.0f), (-1L), (short) -1 };
        double[] doubleArray22 = new double[] { ' ', 52, '#', (-1.0f), 52 };
        double[] doubleArray26 = new double[] { (short) 1, (-1.0f), (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair27 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction9, doubleArray16, doubleArray22, doubleArray26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 6 != 5");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0d, 100.0d, 100.0d, (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 32.0d, 52.0d, 35.0d, (-1.0d), 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 1.0d, (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer2 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer2.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer5.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        levenbergMarquardtOptimizer2.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray10 = new double[] { 52, 0L, 10L };
        double[] doubleArray11 = new double[] {};
        double[] doubleArray17 = new double[] { 100.0f, (short) 100, (short) 0, (byte) 100, 1000 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction6, doubleArray10, doubleArray11, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 3 != 0");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 52.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 100.0d, 0.0d, 100.0d, 1000.0d }, 1.0E-15);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker4);
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray9 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getEvaluations();
        int int2 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray2 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction12 = null;
        double[] doubleArray15 = new double[] { (short) -1, 100.0d };
        double[] doubleArray19 = new double[] { (-1.0d), 0.0f, 1000 };
        double[] doubleArray24 = new double[] { (byte) 0, (byte) -1, 'a', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair25 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction12, doubleArray15, doubleArray19, doubleArray24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 2 != 3");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { (-1.0d), 0.0d, 1000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 0.0d, (-1.0d), 97.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction12 = null;
        double[] doubleArray17 = new double[] { 100, (-1.0d), ' ', 1L };
        double[] doubleArray18 = null;
        double[] doubleArray21 = new double[] { 10.0f, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction12, doubleArray17, doubleArray18, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, (-1.0d), 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker4);
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray11 = new double[] { '#', 0.0d };
        double[] doubleArray14 = new double[] { (byte) -1, 100L };
        double[] doubleArray17 = new double[] { (byte) 1, 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction8, doubleArray11, doubleArray14, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 35.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray12 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance(1.0d);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray12 = new double[] { 10, (short) 100, 10.0d, (-1), (byte) 100, (-1L) };
        double[] doubleArray15 = new double[] { 1.0d, (short) 1 };
        double[] doubleArray17 = new double[] { 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction5, doubleArray12, doubleArray15, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 6 != 2");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d), 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray8 = new double[] { 1 };
        double[] doubleArray11 = new double[] { (short) 1, (short) 0 };
        double[] doubleArray13 = new double[] { 52 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction6, doubleArray8, doubleArray11, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 1 != 2");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 52.0d }, 1.0E-15);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        java.lang.Class<?> wildcardClass12 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction14 = null;
        double[] doubleArray17 = new double[] { 52, 2147483647 };
        double[] doubleArray18 = new double[] {};
        double[] doubleArray25 = new double[] { (short) 10, 0.0f, (byte) 1, ' ', (short) -1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction14, doubleArray17, doubleArray18, doubleArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 2 != 0");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 52.0d, 2.147483647E9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d, 0.0d, 1.0d, 32.0d, (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        java.lang.Class<?> wildcardClass11 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction4 = null;
        double[] doubleArray8 = new double[] { (byte) 10, 0.0d, (-1.0d) };
        double[] doubleArray15 = new double[] { 100, 1.0d, 0, 1.0d, 1.0f, 10.0f };
        double[] doubleArray18 = new double[] { (short) 0, 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction4, doubleArray8, doubleArray15, doubleArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 3 != 6");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 1.0d, 0.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 1);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray12 = new double[] { 1.0f };
        double[] doubleArray13 = null;
        double[] doubleArray20 = new double[] { 1.0f, (byte) 0, 100L, 10.0d, 0.0f, '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction10, doubleArray12, doubleArray13, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1.0d, 0.0d, 100.0d, 10.0d, 0.0d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        java.lang.Class<?> wildcardClass13 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        java.lang.Class<?> wildcardClass10 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 1);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair10 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray13 = new double[] { 0, 0.0d, 0.0d, (short) -1 };
        double[] doubleArray15 = new double[] { '#' };
        double[] doubleArray21 = new double[] { Double.NaN, 10.0f, 10.0d, 1L, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction8, doubleArray13, doubleArray15, doubleArray21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 4 != 1");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 0.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { Double.NaN, 10.0d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer7.setMaxEvaluations(1);
        double double10 = levenbergMarquardtOptimizer7.getRMS();
        double double11 = levenbergMarquardtOptimizer7.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setMaxEvaluations(1);
        double double15 = levenbergMarquardtOptimizer12.getRMS();
        levenbergMarquardtOptimizer12.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer12.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialConvergenceChecker20);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker20);
        int int23 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction24 = null;
        double[] doubleArray25 = new double[] {};
        double[] doubleArray27 = new double[] { 10.0f };
        double[] doubleArray33 = new double[] { (-1.0d), 0L, (-1), (short) 1, 52 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair34 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction24, doubleArray25, doubleArray27, doubleArray33);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 0 != 1");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { (-1.0d), 0.0d, (-1.0d), 1.0d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction12 = null;
        double[] doubleArray16 = new double[] { (-1), 0L, (-1) };
        double[] doubleArray22 = new double[] { 100, 52, (short) -1, 10L, 52 };
        double[] doubleArray29 = new double[] { 52, 1L, (byte) -1, (short) 100, Double.NaN, 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair30 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction12, doubleArray16, doubleArray22, doubleArray29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 3 != 5");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 52.0d, (-1.0d), 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 52.0d, 1.0d, (-1.0d), 100.0d, Double.NaN, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        java.lang.Class<?> wildcardClass14 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 10);
        java.lang.Class<?> wildcardClass5 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        levenbergMarquardtOptimizer0.setOrthoTolerance(1.0d);
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker4);
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray9 = new double[] {};
        double[] doubleArray12 = new double[] { 1.0d, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction7, doubleArray8, doubleArray9, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair9 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction5, doubleArray6, doubleArray7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1);
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction16 = null;
        double[] doubleArray17 = new double[] {};
        double[] doubleArray19 = new double[] { 10 };
        double[] doubleArray20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction16, doubleArray17, doubleArray19, doubleArray20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 0 != 1");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 1);
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        java.lang.Class<?> wildcardClass16 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray13 = new double[] { 10L, '4', 0.0f, (short) 1, 100L };
        double[] doubleArray18 = new double[] { 1000, 0.0d, (short) 10, 10.0f };
        double[] doubleArray25 = new double[] { 10L, 100.0f, 0, 100L, 0.0d, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction7, doubleArray13, doubleArray18, doubleArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 5 != 4");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, 52.0d, 0.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 1000.0d, 0.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d, 100.0d, 0.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray12 = new double[] { 52, (short) 10 };
        double[] doubleArray13 = new double[] {};
        double[] doubleArray19 = new double[] { ' ', (-1), 10.0f, (byte) 10, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction9, doubleArray12, doubleArray13, doubleArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 2 != 0");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 52.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 32.0d, (-1.0d), 10.0d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        levenbergMarquardtOptimizer0.setOrthoTolerance(10.0d);
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        java.lang.Class<?> wildcardClass9 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        java.lang.Class<?> wildcardClass11 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray15 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray12 = new double[] { '#', (short) -1, 2147483647, (-1.0d) };
        double[] doubleArray19 = new double[] { 0.0f, '#', 0, 0L, 1.0f, 100L };
        double[] doubleArray25 = new double[] { 100.0f, 0.0f, (short) 10, (short) 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction7, doubleArray12, doubleArray19, doubleArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 4 != 6");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 35.0d, (-1.0d), 2.147483647E9d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 0.0d, 35.0d, 0.0d, 0.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 0.0d, 10.0d, 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction12 = null;
        double[] doubleArray17 = new double[] { ' ', 'a', 'a', 0L };
        double[] doubleArray20 = new double[] { 10, (short) 10 };
        double[] doubleArray24 = new double[] { 52, 2147483647, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair25 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction12, doubleArray17, doubleArray20, doubleArray24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 4 != 2");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 32.0d, 97.0d, 97.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 52.0d, 2.147483647E9d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer6.setMaxEvaluations((int) (short) -1);
        int int11 = levenbergMarquardtOptimizer6.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction14 = null;
        double[] doubleArray18 = new double[] { '#', 10.0f, (byte) 0 };
        double[] doubleArray20 = new double[] { (short) 100 };
        double[] doubleArray21 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction14, doubleArray18, doubleArray20, doubleArray21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 3 != 1");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 35.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker4);
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(vectorialConvergenceChecker7);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setOrthoTolerance((double) (byte) -1);
        int int19 = levenbergMarquardtOptimizer13.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer20.setParRelativeTolerance((double) (byte) 10);
        int int23 = levenbergMarquardtOptimizer20.getMaxIterations();
        double double24 = levenbergMarquardtOptimizer20.getChiSquare();
        levenbergMarquardtOptimizer20.setCostRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer27.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker30 = null;
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialConvergenceChecker30);
        levenbergMarquardtOptimizer27.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer27.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer36 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer36.setMaxEvaluations((int) '4');
        int int39 = levenbergMarquardtOptimizer36.getIterations();
        levenbergMarquardtOptimizer36.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer42 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer42.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer45 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer45.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker48 = levenbergMarquardtOptimizer45.getConvergenceChecker();
        levenbergMarquardtOptimizer42.setConvergenceChecker(vectorialConvergenceChecker48);
        levenbergMarquardtOptimizer36.setConvergenceChecker(vectorialConvergenceChecker48);
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialConvergenceChecker48);
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialConvergenceChecker48);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialConvergenceChecker48);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker48);
        java.lang.Class<?> wildcardClass55 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1000 + "'", int23 == 1000);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker48);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 1);
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations(52);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray11 = new double[] { Double.NaN, (short) 10, (short) 10, 10.0f, 52 };
        double[] doubleArray17 = new double[] { '4', 10, (byte) 0, 0L, (byte) 10 };
        double[] doubleArray24 = new double[] { (byte) 100, 100, (short) 0, (-1.0f), 0L, 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair25 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction5, doubleArray11, doubleArray17, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { Double.NaN, 10.0d, 10.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 52.0d, 10.0d, 0.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 100.0d, 100.0d, 0.0d, (-1.0d), 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer3.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker6);
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        java.lang.Class<?> wildcardClass9 = vectorialConvergenceChecker8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        java.lang.Class<?> wildcardClass12 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker12);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker4);
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setOrthoTolerance((double) (byte) -1);
        int int19 = levenbergMarquardtOptimizer13.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer20.setParRelativeTolerance((double) (byte) 10);
        int int23 = levenbergMarquardtOptimizer20.getMaxIterations();
        double double24 = levenbergMarquardtOptimizer20.getChiSquare();
        levenbergMarquardtOptimizer20.setCostRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer27.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker30 = null;
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialConvergenceChecker30);
        levenbergMarquardtOptimizer27.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer27.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer36 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer36.setMaxEvaluations((int) '4');
        int int39 = levenbergMarquardtOptimizer36.getIterations();
        levenbergMarquardtOptimizer36.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer42 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer42.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer45 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer45.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker48 = levenbergMarquardtOptimizer45.getConvergenceChecker();
        levenbergMarquardtOptimizer42.setConvergenceChecker(vectorialConvergenceChecker48);
        levenbergMarquardtOptimizer36.setConvergenceChecker(vectorialConvergenceChecker48);
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialConvergenceChecker48);
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialConvergenceChecker48);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialConvergenceChecker48);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker48);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction55 = null;
        double[] doubleArray57 = new double[] { '#' };
        double[] doubleArray58 = new double[] {};
        double[] doubleArray60 = new double[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair61 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction55, doubleArray57, doubleArray58, doubleArray60);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 1 != 0");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1000 + "'", int23 == 1000);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker48);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 35.0d }, 1.0E-15);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        java.lang.Class<?> wildcardClass15 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        java.lang.Class<?> wildcardClass9 = vectorialConvergenceChecker8.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray11 = new double[] { 0, 0L, 0L };
        double[] doubleArray16 = new double[] { (byte) 0, 1.0f, (-1), 10.0d };
        double[] doubleArray22 = new double[] { (byte) 10, 'a', (-1), 10, 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair23 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction7, doubleArray11, doubleArray16, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 3 != 4");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d, 1.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 97.0d, (-1.0d), 10.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer8.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialConvergenceChecker11);
        levenbergMarquardtOptimizer8.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer8.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer17.setMaxEvaluations((int) '4');
        int int20 = levenbergMarquardtOptimizer17.getIterations();
        levenbergMarquardtOptimizer17.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer23.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer26.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker29 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        levenbergMarquardtOptimizer23.setConvergenceChecker(vectorialConvergenceChecker29);
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialConvergenceChecker29);
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialConvergenceChecker29);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker29);
        int int34 = levenbergMarquardtOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray35 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 1);
        java.lang.Class<?> wildcardClass9 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray9 = new double[] { 1L, Double.NaN, 100L };
        double[] doubleArray14 = new double[] { (short) -1, (short) 10, 0.0f, (short) 100 };
        double[] doubleArray17 = new double[] { (short) 1, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction5, doubleArray9, doubleArray14, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 3 != 4");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, Double.NaN, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), 10.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction4 = null;
        double[] doubleArray9 = new double[] { (-1.0d), (-1.0f), 0L, (short) 10 };
        double[] doubleArray11 = new double[] { '4' };
        double[] doubleArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction4, doubleArray9, doubleArray11, doubleArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 4 != 1");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 52.0d }, 1.0E-15);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        java.lang.Class<?> wildcardClass5 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair8 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer7.setParRelativeTolerance((double) (byte) 10);
        int int10 = levenbergMarquardtOptimizer7.getMaxIterations();
        double double11 = levenbergMarquardtOptimizer7.getChiSquare();
        levenbergMarquardtOptimizer7.setCostRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer14.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = null;
        levenbergMarquardtOptimizer14.setConvergenceChecker(vectorialConvergenceChecker17);
        levenbergMarquardtOptimizer14.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer14.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer23.setMaxEvaluations((int) '4');
        int int26 = levenbergMarquardtOptimizer23.getIterations();
        levenbergMarquardtOptimizer23.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer29.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer32 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer32.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker35 = levenbergMarquardtOptimizer32.getConvergenceChecker();
        levenbergMarquardtOptimizer29.setConvergenceChecker(vectorialConvergenceChecker35);
        levenbergMarquardtOptimizer23.setConvergenceChecker(vectorialConvergenceChecker35);
        levenbergMarquardtOptimizer14.setConvergenceChecker(vectorialConvergenceChecker35);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialConvergenceChecker35);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker35);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction41 = null;
        double[] doubleArray43 = new double[] { 100L };
        double[] doubleArray45 = new double[] { 'a' };
        double[] doubleArray49 = new double[] { 1.0d, ' ', 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair50 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction41, doubleArray43, doubleArray45, doubleArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker35);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 1.0d, 32.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setConvergenceChecker(vectorialConvergenceChecker12);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker12);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray7 = new double[] {};
        double[] doubleArray14 = new double[] { 0L, 1.0d, 10.0d, 0.0d, 0.0d, (byte) 1 };
        double[] doubleArray17 = new double[] { 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction6, doubleArray7, doubleArray14, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 0 != 6");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d, 1.0d, 10.0d, 0.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray15 = new double[] { '4', 100L, 100.0f, 10L, 100, (-1L) };
        double[] doubleArray20 = new double[] { (-1.0f), 10.0f, (byte) 10, 1.0f };
        double[] doubleArray23 = new double[] { (byte) -1, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair24 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction8, doubleArray15, doubleArray20, doubleArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 6 != 4");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 52.0d, 100.0d, 100.0d, 10.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { (-1.0d), 10.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 52);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NaN);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass12 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray11 = new double[] { (-1.0d), 0.0d, 10L };
        double[] doubleArray14 = new double[] { 2147483647, 100L };
        double[] doubleArray18 = new double[] { 100, 1000, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction7, doubleArray11, doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 3 != 2");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 2.147483647E9d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 1000.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(1.0d);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction12 = null;
        double[] doubleArray19 = new double[] { (short) 10, 100.0d, 1, (short) 0, 0, 1.0d };
        double[] doubleArray20 = new double[] {};
        double[] doubleArray26 = new double[] { 2147483647, (byte) 0, 100.0f, 100.0f, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair27 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction12, doubleArray19, doubleArray20, doubleArray26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 6 != 0");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d, 100.0d, 1.0d, 0.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 2.147483647E9d, 0.0d, 100.0d, 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer2 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer2.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer5.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        levenbergMarquardtOptimizer2.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction14 = null;
        double[] doubleArray20 = new double[] { 1L, 100.0f, (byte) -1, ' ', 10L };
        double[] doubleArray24 = new double[] { 100.0f, 1.0d, 10L };
        double[] doubleArray30 = new double[] { (-1.0d), (-1.0d), 10.0d, (short) 0, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair31 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction14, doubleArray20, doubleArray24, doubleArray30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 5 != 3");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1.0d, 100.0d, (-1.0d), 32.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 100.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { (-1.0d), (-1.0d), 10.0d, 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray9 = new double[] { 0L, 0L };
        double[] doubleArray11 = new double[] { (byte) 0 };
        double[] doubleArray15 = new double[] { 2147483647, 0, 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair16 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction6, doubleArray9, doubleArray11, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 2 != 1");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 2.147483647E9d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair9 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 52);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NaN);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer16.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer19.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer16.setConvergenceChecker(vectorialConvergenceChecker22);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialConvergenceChecker22);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker22);
        java.lang.Class<?> wildcardClass26 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker22);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray12 = null;
        double[] doubleArray16 = new double[] { (short) -1, 10.0f, 10.0d };
        double[] doubleArray17 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction11, doubleArray12, doubleArray16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer3.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker6);
        levenbergMarquardtOptimizer0.setMaxIterations(52);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setMaxEvaluations(1);
        double double13 = levenbergMarquardtOptimizer10.getRMS();
        levenbergMarquardtOptimizer10.setOrthoTolerance((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker16);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction18 = null;
        double[] doubleArray24 = new double[] { 100, 2147483647, (-1.0d), (short) 10, (byte) 10 };
        double[] doubleArray25 = null;
        double[] doubleArray31 = new double[] { (short) -1, (byte) 1, 0, (short) 10, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair32 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction18, doubleArray24, doubleArray25, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 100.0d, 2.147483647E9d, (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { (-1.0d), 1.0d, 0.0d, 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair7 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setConvergenceChecker(vectorialConvergenceChecker12);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 0);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction18 = null;
        double[] doubleArray23 = new double[] { (-1), (short) -1, (short) 0, 1 };
        double[] doubleArray29 = new double[] { ' ', (byte) 1, 1, 10, 100.0d };
        double[] doubleArray35 = new double[] { 0, (short) 100, (byte) 1, 1L, 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair36 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction18, doubleArray23, doubleArray29, doubleArray35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 4 != 5");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), (-1.0d), 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 32.0d, 1.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 0.0d, 100.0d, 1.0d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) -1);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray11 = new double[] { (short) -1, 1, (byte) 0 };
        double[] doubleArray15 = new double[] { 1.0d, (-1.0d), (byte) 1 };
        double[] doubleArray17 = new double[] { 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction7, doubleArray11, doubleArray15, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker6);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction12 = null;
        double[] doubleArray16 = new double[] { ' ', (byte) 0, (byte) 1 };
        double[] doubleArray21 = new double[] { 10, 10.0d, (short) 0, 0.0f };
        double[] doubleArray23 = new double[] { (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair24 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction12, doubleArray16, doubleArray21, doubleArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 3 != 4");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 32.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, 10.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1);
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction16 = null;
        double[] doubleArray17 = null;
        double[] doubleArray19 = new double[] { (byte) 10 };
        double[] doubleArray26 = new double[] { 100.0d, 0L, Double.NaN, (-1.0d), 100.0d, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair27 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction16, doubleArray17, doubleArray19, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 100.0d, 0.0d, Double.NaN, (-1.0d), 100.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray9 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer5.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setOrthoTolerance((double) (byte) -1);
        int int11 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setParRelativeTolerance((double) (byte) 10);
        int int15 = levenbergMarquardtOptimizer12.getMaxIterations();
        double double16 = levenbergMarquardtOptimizer12.getChiSquare();
        levenbergMarquardtOptimizer12.setCostRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer19.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = null;
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialConvergenceChecker22);
        levenbergMarquardtOptimizer19.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer19.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer28.setMaxEvaluations((int) '4');
        int int31 = levenbergMarquardtOptimizer28.getIterations();
        levenbergMarquardtOptimizer28.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer34.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer37 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer37.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker40 = levenbergMarquardtOptimizer37.getConvergenceChecker();
        levenbergMarquardtOptimizer34.setConvergenceChecker(vectorialConvergenceChecker40);
        levenbergMarquardtOptimizer28.setConvergenceChecker(vectorialConvergenceChecker40);
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialConvergenceChecker40);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker40);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialConvergenceChecker40);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker40);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray47 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1000 + "'", int15 == 1000);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker40);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray11 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer4.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer4.setMaxEvaluations((int) (short) -1);
        int int9 = levenbergMarquardtOptimizer4.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer0.setMaxIterations((int) ' ');
        java.lang.Class<?> wildcardClass14 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker7);
        java.lang.Class<?> wildcardClass9 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray16 = new double[] { 1L, (short) 10, (byte) -1, 100, (short) 10 };
        double[] doubleArray17 = null;
        double[] doubleArray21 = new double[] { Double.NaN, 10L, 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction10, doubleArray16, doubleArray17, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0d, 10.0d, (-1.0d), 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { Double.NaN, 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer2 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer2.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer5.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        levenbergMarquardtOptimizer2.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        java.lang.Class<?> wildcardClass16 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray14 = new double[] { '4', 1.0f, (byte) 100, '#', 1L };
        double[] doubleArray19 = new double[] { 100L, (byte) 0, (-1), 10L };
        double[] doubleArray25 = new double[] { 0L, 100.0d, (byte) 10, 10, 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction8, doubleArray14, doubleArray19, doubleArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 5 != 4");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 52.0d, 1.0d, 100.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 0.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 0.0d, 100.0d, 10.0d, 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass12 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray16 = new double[] { (short) 100, 2147483647, (-1.0f), (byte) 10 };
        double[] doubleArray18 = new double[] { 52 };
        double[] doubleArray20 = new double[] { (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction11, doubleArray16, doubleArray18, doubleArray20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 4 != 1");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 2.147483647E9d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0.0f);
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray7 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer3.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker6);
        levenbergMarquardtOptimizer0.setMaxIterations(52);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setMaxEvaluations((int) '4');
        int int13 = levenbergMarquardtOptimizer10.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer14.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer14.setMaxEvaluations((int) (short) -1);
        int int19 = levenbergMarquardtOptimizer14.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialConvergenceChecker20);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker20);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int24 = levenbergMarquardtOptimizer0.getIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray25 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker20);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        levenbergMarquardtOptimizer0.setOrthoTolerance(1.0d);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray11 = new double[] { (-1.0d), 52 };
        double[] doubleArray15 = new double[] { (short) 100, ' ', 10L };
        double[] doubleArray21 = new double[] { (byte) 1, '4', 'a', (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction8, doubleArray11, doubleArray15, doubleArray21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 2 != 3");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 32.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, 52.0d, 97.0d, 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray7 = new double[] {};
        double[] doubleArray11 = new double[] { 1.0f, 1, (-1.0f) };
        double[] doubleArray15 = new double[] { 1.0d, 0.0d, 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair16 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction6, doubleArray7, doubleArray11, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 0 != 3");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setConvergenceChecker(vectorialConvergenceChecker12);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 0);
        double double18 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction19 = null;
        double[] doubleArray23 = new double[] { 1.0d, '#', (short) 10 };
        double[] doubleArray30 = new double[] { ' ', (short) 1, 100.0d, 1.0f, Double.NaN, (short) 10 };
        double[] doubleArray34 = new double[] { 1L, 0L, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair35 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction19, doubleArray23, doubleArray30, doubleArray34);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 3 != 6");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 35.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 32.0d, 1.0d, 100.0d, 1.0d, Double.NaN, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 1.0d, 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker4);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray8 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray14 = new double[] { 10.0f, (short) -1, (short) -1, 100, 52 };
        double[] doubleArray19 = new double[] { 1.0d, '4', '4', 100L };
        double[] doubleArray26 = new double[] { 0L, (short) 100, 0, (byte) -1, 1L, 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair27 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction8, doubleArray14, doubleArray19, doubleArray26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 5 != 4");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d, (-1.0d), (-1.0d), 100.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 1.0d, 52.0d, 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 0.0d, 100.0d, 0.0d, (-1.0d), 1.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray12 = new double[] { 1000, (byte) -1, '4' };
        double[] doubleArray13 = new double[] {};
        double[] doubleArray18 = new double[] { 10, (-1L), 0.0f, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction8, doubleArray12, doubleArray13, doubleArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 3 != 0");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1000.0d, (-1.0d), 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer7.setParRelativeTolerance((double) (byte) 10);
        int int10 = levenbergMarquardtOptimizer7.getMaxIterations();
        double double11 = levenbergMarquardtOptimizer7.getChiSquare();
        levenbergMarquardtOptimizer7.setCostRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer14.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = null;
        levenbergMarquardtOptimizer14.setConvergenceChecker(vectorialConvergenceChecker17);
        levenbergMarquardtOptimizer14.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer14.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer23.setMaxEvaluations((int) '4');
        int int26 = levenbergMarquardtOptimizer23.getIterations();
        levenbergMarquardtOptimizer23.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer29.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer32 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer32.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker35 = levenbergMarquardtOptimizer32.getConvergenceChecker();
        levenbergMarquardtOptimizer29.setConvergenceChecker(vectorialConvergenceChecker35);
        levenbergMarquardtOptimizer23.setConvergenceChecker(vectorialConvergenceChecker35);
        levenbergMarquardtOptimizer14.setConvergenceChecker(vectorialConvergenceChecker35);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialConvergenceChecker35);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker35);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray41 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker35);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer3.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker6);
        levenbergMarquardtOptimizer0.setMaxIterations(52);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setMaxEvaluations((int) '4');
        int int13 = levenbergMarquardtOptimizer10.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer14.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer14.setMaxEvaluations((int) (short) -1);
        int int19 = levenbergMarquardtOptimizer14.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialConvergenceChecker20);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker20);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray23 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker20);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        java.lang.Class<?> wildcardClass16 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer11.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer11.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer20.setMaxEvaluations((int) '4');
        int int23 = levenbergMarquardtOptimizer20.getIterations();
        levenbergMarquardtOptimizer20.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer26.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer29.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker32 = levenbergMarquardtOptimizer29.getConvergenceChecker();
        levenbergMarquardtOptimizer26.setConvergenceChecker(vectorialConvergenceChecker32);
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialConvergenceChecker32);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker32);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair37 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker32);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer3.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialConvergenceChecker9);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker9);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer10.setMaxEvaluations((int) (short) -1);
        int int15 = levenbergMarquardtOptimizer10.getJacobianEvaluations();
        int int16 = levenbergMarquardtOptimizer10.getJacobianEvaluations();
        levenbergMarquardtOptimizer10.setCostRelativeTolerance((double) 52);
        levenbergMarquardtOptimizer10.setInitialStepBoundFactor(Double.NaN);
        int int21 = levenbergMarquardtOptimizer10.getIterations();
        int int22 = levenbergMarquardtOptimizer10.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer23.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer26.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer29.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker32 = levenbergMarquardtOptimizer29.getConvergenceChecker();
        levenbergMarquardtOptimizer26.setConvergenceChecker(vectorialConvergenceChecker32);
        levenbergMarquardtOptimizer23.setConvergenceChecker(vectorialConvergenceChecker32);
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialConvergenceChecker32);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer36 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer36.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer36.setMaxEvaluations((int) (short) -1);
        int int41 = levenbergMarquardtOptimizer36.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker42 = levenbergMarquardtOptimizer36.getConvergenceChecker();
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialConvergenceChecker42);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker44 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker44);
        java.lang.Class<?> wildcardClass46 = vectorialConvergenceChecker44.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1000 + "'", int22 == 1000);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker32);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker42);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker44);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker4);
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray11 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10);
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        java.lang.Class<?> wildcardClass13 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 52);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NaN);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer16.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer19.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer16.setConvergenceChecker(vectorialConvergenceChecker22);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialConvergenceChecker22);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker22);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer26.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer26.setMaxEvaluations((int) (short) -1);
        int int31 = levenbergMarquardtOptimizer26.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker32 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker32);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker34 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction35 = null;
        double[] doubleArray40 = new double[] { 0.0f, 100, (short) 0, 100 };
        double[] doubleArray45 = new double[] { (-1), (-1), 10L, (byte) -1 };
        double[] doubleArray52 = new double[] { ' ', 100, Double.NaN, 1L, 2147483647, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair53 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction35, doubleArray40, doubleArray45, doubleArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker22);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker32);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker34);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 0.0d, 100.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { (-1.0d), (-1.0d), 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 32.0d, 100.0d, Double.NaN, 1.0d, 2.147483647E9d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker4);
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1000 + "'", int7 == 1000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setConvergenceChecker(vectorialConvergenceChecker12);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        java.lang.Class<?> wildcardClass17 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction12 = null;
        double[] doubleArray14 = new double[] { (byte) 100 };
        double[] doubleArray19 = new double[] { 52, 1.0d, 1L, '#' };
        double[] doubleArray24 = new double[] { 0L, 0.0f, (byte) 100, 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair25 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction12, doubleArray14, doubleArray19, doubleArray24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 1 != 4");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 52.0d, 1.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 0.0d, 0.0d, 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker4);
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        java.lang.Class<?> wildcardClass9 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1000 + "'", int7 == 1000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer5.setMaxEvaluations(1);
        double double8 = levenbergMarquardtOptimizer5.getRMS();
        levenbergMarquardtOptimizer5.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer5.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker13);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer8.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialConvergenceChecker11);
        levenbergMarquardtOptimizer8.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer8.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer17.setMaxEvaluations((int) '4');
        int int20 = levenbergMarquardtOptimizer17.getIterations();
        levenbergMarquardtOptimizer17.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer23.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer26.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker29 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        levenbergMarquardtOptimizer23.setConvergenceChecker(vectorialConvergenceChecker29);
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialConvergenceChecker29);
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialConvergenceChecker29);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker29);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair34 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker29);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray13 = new double[] { (short) 10, (byte) 0 };
        double[] doubleArray18 = new double[] { 1000, (byte) 100, 2147483647, 10.0f };
        double[] doubleArray19 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction10, doubleArray13, doubleArray18, doubleArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 2 != 4");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 1000.0d, 100.0d, 2.147483647E9d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        java.lang.Class<?> wildcardClass5 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        java.lang.Class<?> wildcardClass9 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 100);
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1));
        int int18 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10.0f);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(10.0d);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray14 = new double[] { (short) 1, 1, 1.0d, (byte) 10, 0L };
        double[] doubleArray15 = new double[] {};
        double[] doubleArray16 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction8, doubleArray14, doubleArray15, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 5 != 0");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, 1.0d, 1.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer5.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setOrthoTolerance((double) (byte) -1);
        int int11 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setParRelativeTolerance((double) (byte) 10);
        int int15 = levenbergMarquardtOptimizer12.getMaxIterations();
        double double16 = levenbergMarquardtOptimizer12.getChiSquare();
        levenbergMarquardtOptimizer12.setCostRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer19.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = null;
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialConvergenceChecker22);
        levenbergMarquardtOptimizer19.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer19.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer28.setMaxEvaluations((int) '4');
        int int31 = levenbergMarquardtOptimizer28.getIterations();
        levenbergMarquardtOptimizer28.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer34.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer37 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer37.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker40 = levenbergMarquardtOptimizer37.getConvergenceChecker();
        levenbergMarquardtOptimizer34.setConvergenceChecker(vectorialConvergenceChecker40);
        levenbergMarquardtOptimizer28.setConvergenceChecker(vectorialConvergenceChecker40);
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialConvergenceChecker40);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker40);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialConvergenceChecker40);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker40);
        int int47 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1000 + "'", int15 == 1000);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker40);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray16 = new double[] { (short) 0, (byte) -1, 0, 10.0d };
        double[] doubleArray18 = new double[] { 1L };
        double[] doubleArray25 = new double[] { (-1.0f), (-1), (byte) 1, (-1.0f), 10.0d, Double.NaN };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction11, doubleArray16, doubleArray18, doubleArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 4 != 1");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d, (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { (-1.0d), (-1.0d), 1.0d, (-1.0d), 10.0d, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        java.lang.Class<?> wildcardClass5 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray10 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        java.lang.Class<?> wildcardClass9 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray7 = new double[] {};
        double[] doubleArray12 = new double[] { (short) 1, Double.NaN, 10.0d, (-1) };
        double[] doubleArray13 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction6, doubleArray7, doubleArray12, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 0 != 4");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d, Double.NaN, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray2 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer4.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer4.setMaxEvaluations((int) (short) -1);
        int int9 = levenbergMarquardtOptimizer4.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        java.lang.Class<?> wildcardClass12 = vectorialConvergenceChecker10.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker5);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction14 = null;
        double[] doubleArray20 = new double[] { 52, 1.0f, (-1.0d), 1, (-1L) };
        double[] doubleArray22 = new double[] { (-1L) };
        double[] doubleArray28 = new double[] { (byte) 0, 10.0f, Double.NaN, '4', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair29 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction14, doubleArray20, doubleArray22, doubleArray28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 5 != 1");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1000 + "'", int13 == 1000);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 52.0d, 1.0d, (-1.0d), 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 0.0d, 10.0d, Double.NaN, 52.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 'a');
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray10 = new double[] { (-1.0d) };
        double[] doubleArray12 = new double[] { 1 };
        double[] doubleArray14 = new double[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction8, doubleArray10, doubleArray12, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 32.0d }, 1.0E-15);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NaN);
        java.lang.Class<?> wildcardClass15 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer3.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker6);
        levenbergMarquardtOptimizer0.setMaxIterations(52);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setMaxEvaluations((int) '4');
        int int13 = levenbergMarquardtOptimizer10.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer14.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer14.setMaxEvaluations((int) (short) -1);
        int int19 = levenbergMarquardtOptimizer14.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialConvergenceChecker20);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker20);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray24 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker20);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker23);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer15.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker18);
        levenbergMarquardtOptimizer12.setMaxIterations(52);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer22.setMaxEvaluations((int) '4');
        int int25 = levenbergMarquardtOptimizer22.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer26.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer26.setMaxEvaluations((int) (short) -1);
        int int31 = levenbergMarquardtOptimizer26.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker32 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        levenbergMarquardtOptimizer22.setConvergenceChecker(vectorialConvergenceChecker32);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker32);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker35 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker35);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker32);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker35);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1000 + "'", int7 == 1000);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 0);
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray9 = new double[] { 1L };
        double[] doubleArray15 = new double[] { 1.0f, (byte) 10, 0.0f, (short) 1, (short) -1 };
        double[] doubleArray22 = new double[] { (byte) 10, 1.0d, (byte) 1, 10L, 1L, 32 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair23 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction7, doubleArray9, doubleArray15, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 1 != 5");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, 10.0d, 0.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 1.0d, 1.0d, 10.0d, 1.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer4.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer7.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialConvergenceChecker13);
        levenbergMarquardtOptimizer4.setConvergenceChecker(vectorialConvergenceChecker13);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        java.lang.Class<?> wildcardClass17 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10.0f);
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations(52);
        java.lang.Class<?> wildcardClass17 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations(52);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray15 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 100);
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray14 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer8.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialConvergenceChecker11);
        levenbergMarquardtOptimizer8.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer8.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer8.setMaxEvaluations((int) (byte) -1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer19.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = null;
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialConvergenceChecker22);
        levenbergMarquardtOptimizer19.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer19.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer28.setMaxEvaluations((int) '4');
        int int31 = levenbergMarquardtOptimizer28.getIterations();
        levenbergMarquardtOptimizer28.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer34.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer37 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer37.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker40 = levenbergMarquardtOptimizer37.getConvergenceChecker();
        levenbergMarquardtOptimizer34.setConvergenceChecker(vectorialConvergenceChecker40);
        levenbergMarquardtOptimizer28.setConvergenceChecker(vectorialConvergenceChecker40);
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialConvergenceChecker40);
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialConvergenceChecker40);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker40);
        int int46 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker40);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1000 + "'", int46 == 1000);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 32);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 52);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray9 = new double[] { 'a', 10.0d };
        double[] doubleArray12 = new double[] { (short) 10, (byte) 1 };
        double[] doubleArray19 = new double[] { 0.0f, 100L, (-1.0f), (-1L), 100.0f, 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction6, doubleArray9, doubleArray12, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 97.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 0.0d, 100.0d, (-1.0d), (-1.0d), 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1L);
        int int18 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker19);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        java.lang.Class<?> wildcardClass7 = vectorialConvergenceChecker6.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 100);
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer11.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer11.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer20.setMaxEvaluations((int) '4');
        int int23 = levenbergMarquardtOptimizer20.getIterations();
        levenbergMarquardtOptimizer20.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer26.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer29.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker32 = levenbergMarquardtOptimizer29.getConvergenceChecker();
        levenbergMarquardtOptimizer26.setConvergenceChecker(vectorialConvergenceChecker32);
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialConvergenceChecker32);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker32);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker32);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray37 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker32);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray18 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1.0f));
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker4);
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1000 + "'", int7 == 1000);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setConvergenceChecker(vectorialConvergenceChecker12);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        int int15 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1000 + "'", int15 == 1000);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 52);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1000 + "'", int7 == 1000);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray14 = new double[] { (-1.0f), 52, 10.0d, 100L };
        double[] doubleArray19 = new double[] { (byte) 100, Double.NaN, 0L, (byte) 0 };
        double[] doubleArray24 = new double[] { (byte) 0, (-1.0f), 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair25 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction9, doubleArray14, doubleArray19, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), 52.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, Double.NaN, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 0.0d, (-1.0d), 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray13 = new double[] { (byte) -1, 1L, 1L, 1.0f };
        double[] doubleArray17 = new double[] { (short) 100, 1.0f, 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction7, doubleArray8, doubleArray13, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d), 1.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 1.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setConvergenceChecker(vectorialConvergenceChecker12);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        int int15 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction18 = null;
        double[] doubleArray19 = new double[] {};
        double[] doubleArray22 = new double[] { (byte) 10, 0.0f };
        double[] doubleArray29 = new double[] { 2147483647, 1.0d, 100L, 2147483647, (short) 0, 10L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair30 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction18, doubleArray19, doubleArray22, doubleArray29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 0 != 2");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1000 + "'", int15 == 1000);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 2.147483647E9d, 1.0d, 100.0d, 2.147483647E9d, 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer4.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer4.setMaxEvaluations((int) (short) -1);
        int int9 = levenbergMarquardtOptimizer4.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer0.setMaxIterations((int) ' ');
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction15 = null;
        double[] doubleArray22 = new double[] { 0.0f, 1.0f, (byte) 100, (short) 10, 52, 10 };
        double[] doubleArray23 = new double[] {};
        double[] doubleArray25 = new double[] { 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction15, doubleArray22, doubleArray23, doubleArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 6 != 0");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, 1.0d, 100.0d, 10.0d, 52.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int11 = levenbergMarquardtOptimizer10.getEvaluations();
        int int12 = levenbergMarquardtOptimizer10.getJacobianEvaluations();
        levenbergMarquardtOptimizer10.setParRelativeTolerance((double) 100.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double16 = levenbergMarquardtOptimizer15.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer17.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer20.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialConvergenceChecker23);
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialConvergenceChecker23);
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialConvergenceChecker23);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker23);
        int int28 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray29 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 52);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NaN);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer16.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer19.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer16.setConvergenceChecker(vectorialConvergenceChecker22);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialConvergenceChecker22);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker22);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer26.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer26.setMaxEvaluations((int) (short) -1);
        int int31 = levenbergMarquardtOptimizer26.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker32 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker32);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker34 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 52);
        int int37 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int38 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker22);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker32);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 52);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer7.setMaxEvaluations(1);
        double double10 = levenbergMarquardtOptimizer7.getRMS();
        double double11 = levenbergMarquardtOptimizer7.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setMaxEvaluations(1);
        double double15 = levenbergMarquardtOptimizer12.getRMS();
        levenbergMarquardtOptimizer12.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer12.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialConvergenceChecker20);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker20);
        int int23 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction24 = null;
        double[] doubleArray31 = new double[] { (-1L), (-1), 1000, 0L, '4', 10 };
        double[] doubleArray32 = new double[] {};
        double[] doubleArray38 = new double[] { 100.0d, (byte) 10, (byte) 0, 'a', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair39 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction24, doubleArray31, doubleArray32, doubleArray38);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 6 != 0");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { (-1.0d), (-1.0d), 1000.0d, 0.0d, 52.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 10.0d, 0.0d, 97.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) ' ');
        java.lang.Class<?> wildcardClass13 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        java.lang.Class<?> wildcardClass10 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray10 = null;
        double[] doubleArray16 = new double[] { '#', (short) 10, 100.0f, (byte) -1, 1.0d };
        double[] doubleArray22 = new double[] { 100L, (short) 100, 10.0d, (byte) -1, 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair23 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction9, doubleArray10, doubleArray16, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 35.0d, 10.0d, 100.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 100.0d, 10.0d, (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 100);
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setConvergenceChecker(vectorialConvergenceChecker12);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 0);
        double double18 = levenbergMarquardtOptimizer0.getChiSquare();
        java.lang.Class<?> wildcardClass19 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker12);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray8 = new double[] { (short) -1 };
        double[] doubleArray10 = new double[] { (byte) 0 };
        double[] doubleArray12 = new double[] { (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction6, doubleArray8, doubleArray10, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker4);
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray15 = new double[] { (short) 100, 100.0f, 1.0f };
        double[] doubleArray16 = new double[] {};
        double[] doubleArray17 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction11, doubleArray15, doubleArray16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 3 != 0");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(100.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer14.setParRelativeTolerance((double) (byte) 10);
        int int17 = levenbergMarquardtOptimizer14.getMaxIterations();
        double double18 = levenbergMarquardtOptimizer14.getChiSquare();
        levenbergMarquardtOptimizer14.setCostRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer21.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = null;
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker24);
        levenbergMarquardtOptimizer21.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer21.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer30 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer30.setMaxEvaluations((int) '4');
        int int33 = levenbergMarquardtOptimizer30.getIterations();
        levenbergMarquardtOptimizer30.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer36 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer36.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer39 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer39.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker42 = levenbergMarquardtOptimizer39.getConvergenceChecker();
        levenbergMarquardtOptimizer36.setConvergenceChecker(vectorialConvergenceChecker42);
        levenbergMarquardtOptimizer30.setConvergenceChecker(vectorialConvergenceChecker42);
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker42);
        levenbergMarquardtOptimizer14.setConvergenceChecker(vectorialConvergenceChecker42);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker42);
        int int48 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1000 + "'", int17 == 1000);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker42);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int20 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double25 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        java.lang.Class<?> wildcardClass12 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction12 = null;
        double[] doubleArray16 = new double[] { (short) 1, (byte) -1, (-1.0f) };
        double[] doubleArray21 = new double[] { 0.0d, 1.0f, 0.0f, (short) -1 };
        double[] doubleArray24 = new double[] { 52, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair25 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction12, doubleArray16, doubleArray21, doubleArray24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 3 != 4");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 0.0d, 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 52.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray12 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray10 = new double[] { 100 };
        double[] doubleArray11 = new double[] {};
        double[] doubleArray14 = new double[] { 0L, 52 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction8, doubleArray10, doubleArray11, doubleArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 1 != 0");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray14 = new double[] { (-1L), (short) -1, 1, (short) 10 };
        double[] doubleArray15 = null;
        double[] doubleArray21 = new double[] { 0, (short) 10, (byte) 0, 2147483647, '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction9, doubleArray14, doubleArray15, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), (-1.0d), 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 0.0d, 10.0d, 0.0d, 2.147483647E9d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray11 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 52);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NaN);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer7.setMaxEvaluations(1);
        double double10 = levenbergMarquardtOptimizer7.getRMS();
        levenbergMarquardtOptimizer7.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer7.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        double double16 = levenbergMarquardtOptimizer7.getChiSquare();
        levenbergMarquardtOptimizer7.setMaxEvaluations(1);
        levenbergMarquardtOptimizer7.setParRelativeTolerance(100.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer21.setParRelativeTolerance((double) (byte) 10);
        int int24 = levenbergMarquardtOptimizer21.getMaxIterations();
        double double25 = levenbergMarquardtOptimizer21.getChiSquare();
        levenbergMarquardtOptimizer21.setCostRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer28.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker31 = null;
        levenbergMarquardtOptimizer28.setConvergenceChecker(vectorialConvergenceChecker31);
        levenbergMarquardtOptimizer28.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer28.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer37 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer37.setMaxEvaluations((int) '4');
        int int40 = levenbergMarquardtOptimizer37.getIterations();
        levenbergMarquardtOptimizer37.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer43 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer43.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer46 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer46.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker49 = levenbergMarquardtOptimizer46.getConvergenceChecker();
        levenbergMarquardtOptimizer43.setConvergenceChecker(vectorialConvergenceChecker49);
        levenbergMarquardtOptimizer37.setConvergenceChecker(vectorialConvergenceChecker49);
        levenbergMarquardtOptimizer28.setConvergenceChecker(vectorialConvergenceChecker49);
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker49);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialConvergenceChecker49);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker49);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction56 = null;
        double[] doubleArray63 = new double[] { 100.0f, 0.0f, 10.0d, 2147483647, 'a', 100L };
        double[] doubleArray65 = new double[] { 1 };
        double[] doubleArray68 = new double[] { 1.0d, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair69 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction56, doubleArray63, doubleArray65, doubleArray68);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 6 != 1");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1000 + "'", int24 == 1000);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker49);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 100.0d, 0.0d, 10.0d, 2.147483647E9d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray12 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray7 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getEvaluations();
        int int2 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass3 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setConvergenceChecker(vectorialConvergenceChecker12);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        int int15 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer18.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = levenbergMarquardtOptimizer18.getConvergenceChecker();
        levenbergMarquardtOptimizer18.setMaxEvaluations(1000);
        levenbergMarquardtOptimizer18.setOrthoTolerance(10.0d);
        int int26 = levenbergMarquardtOptimizer18.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker27 = levenbergMarquardtOptimizer18.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker27);
        int int29 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int30 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1000 + "'", int15 == 1000);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1000 + "'", int26 == 1000);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair10 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1L);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer15.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker18);
        levenbergMarquardtOptimizer12.setMaxIterations(52);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer22.setMaxEvaluations((int) '4');
        int int25 = levenbergMarquardtOptimizer22.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer26.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer26.setMaxEvaluations((int) (short) -1);
        int int31 = levenbergMarquardtOptimizer26.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker32 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        levenbergMarquardtOptimizer22.setConvergenceChecker(vectorialConvergenceChecker32);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker32);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker35 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker35);
        int int37 = levenbergMarquardtOptimizer0.getEvaluations();
        int int38 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        double double41 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker32);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setMaxEvaluations((int) '4');
        int int12 = levenbergMarquardtOptimizer9.getIterations();
        levenbergMarquardtOptimizer9.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer15.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer18.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = levenbergMarquardtOptimizer18.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialConvergenceChecker21);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialConvergenceChecker21);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker21);
        java.lang.Class<?> wildcardClass25 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker21);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction18 = null;
        double[] doubleArray23 = new double[] { 2147483647, (-1L), (-1.0f), (short) -1 };
        double[] doubleArray25 = new double[] { 0L };
        double[] doubleArray28 = new double[] { 1L, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair29 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction18, doubleArray23, doubleArray25, doubleArray28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 4 != 1");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 2.147483647E9d, (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 1.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(52);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '4');
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray13 = new double[] { 1.0d };
        double[] doubleArray18 = new double[] { (byte) 100, (byte) 0, (-1.0f), 10L };
        double[] doubleArray24 = new double[] { 2147483647, 0.0f, (byte) 0, (-1L), (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair25 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction11, doubleArray13, doubleArray18, doubleArray24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 1 != 4");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 0.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 2.147483647E9d, 0.0d, 0.0d, (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 52);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NaN);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1000 + "'", int13 == 1000);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker6);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray10 = new double[] { (byte) -1 };
        double[] doubleArray14 = new double[] { (byte) 100, 0.0d, (byte) 0 };
        double[] doubleArray19 = new double[] { 0, 1L, 10, 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction8, doubleArray10, doubleArray14, doubleArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 1 != 3");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 0.0d, 1.0d, 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 52);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NaN);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction14 = null;
        double[] doubleArray21 = new double[] { (-1L), (-1.0d), (-1.0d), 1, (short) -1, 1.0d };
        double[] doubleArray22 = new double[] {};
        double[] doubleArray25 = new double[] { Double.NaN, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction14, doubleArray21, doubleArray22, doubleArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 6 != 0");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1000 + "'", int13 == 1000);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { Double.NaN, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer7.setMaxEvaluations((int) '4');
        int int10 = levenbergMarquardtOptimizer7.getIterations();
        levenbergMarquardtOptimizer7.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer16.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialConvergenceChecker19);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialConvergenceChecker19);
        levenbergMarquardtOptimizer7.setOrthoTolerance((double) (byte) 0);
        int int24 = levenbergMarquardtOptimizer7.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double26 = levenbergMarquardtOptimizer25.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer27.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer30 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer30.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker33 = levenbergMarquardtOptimizer30.getConvergenceChecker();
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialConvergenceChecker33);
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialConvergenceChecker33);
        int int36 = levenbergMarquardtOptimizer25.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer37 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double38 = levenbergMarquardtOptimizer37.getChiSquare();
        levenbergMarquardtOptimizer37.setCostRelativeTolerance((double) (short) 10);
        int int41 = levenbergMarquardtOptimizer37.getJacobianEvaluations();
        levenbergMarquardtOptimizer37.setOrthoTolerance((double) (byte) -1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer44 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer44.setMaxEvaluations(1);
        double double47 = levenbergMarquardtOptimizer44.getRMS();
        double double48 = levenbergMarquardtOptimizer44.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer49 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer49.setMaxEvaluations(1);
        double double52 = levenbergMarquardtOptimizer49.getRMS();
        levenbergMarquardtOptimizer49.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer49.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker57 = levenbergMarquardtOptimizer49.getConvergenceChecker();
        levenbergMarquardtOptimizer44.setConvergenceChecker(vectorialConvergenceChecker57);
        levenbergMarquardtOptimizer37.setConvergenceChecker(vectorialConvergenceChecker57);
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialConvergenceChecker57);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialConvergenceChecker57);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker57);
        int int63 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer64 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer64.setMaxEvaluations((int) '4');
        int int67 = levenbergMarquardtOptimizer64.getMaxIterations();
        int int68 = levenbergMarquardtOptimizer64.getJacobianEvaluations();
        int int69 = levenbergMarquardtOptimizer64.getIterations();
        int int70 = levenbergMarquardtOptimizer64.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker71 = levenbergMarquardtOptimizer64.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker72 = levenbergMarquardtOptimizer64.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker72);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker57);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 52 + "'", int63 == 52);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1000 + "'", int67 == 1000);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker71);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker72);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setMaxIterations((int) ' ');
        int int16 = levenbergMarquardtOptimizer0.getIterations();
        int int17 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction20 = null;
        double[] doubleArray23 = new double[] { 97, (byte) 100 };
        double[] doubleArray25 = new double[] { '4' };
        double[] doubleArray29 = new double[] { 10.0d, 1.0f, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair30 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction20, doubleArray23, doubleArray25, doubleArray29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 2 != 1");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1L);
        int int18 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        java.lang.Class<?> wildcardClass20 = vectorialConvergenceChecker19.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker4);
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray8 = new double[] { 10.0f };
        double[] doubleArray14 = new double[] { 100.0f, (-1), 10.0f, 100.0d, (byte) 100 };
        double[] doubleArray17 = new double[] { (-1.0d), '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction6, doubleArray8, doubleArray14, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 1 != 5");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d, (-1.0d), 10.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d), 35.0d }, 1.0E-15);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer7.setMaxEvaluations(1);
        double double10 = levenbergMarquardtOptimizer7.getRMS();
        levenbergMarquardtOptimizer7.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer7.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        double double16 = levenbergMarquardtOptimizer7.getChiSquare();
        levenbergMarquardtOptimizer7.setMaxEvaluations(1);
        levenbergMarquardtOptimizer7.setParRelativeTolerance(100.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer21.setParRelativeTolerance((double) (byte) 10);
        int int24 = levenbergMarquardtOptimizer21.getMaxIterations();
        double double25 = levenbergMarquardtOptimizer21.getChiSquare();
        levenbergMarquardtOptimizer21.setCostRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer28.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker31 = null;
        levenbergMarquardtOptimizer28.setConvergenceChecker(vectorialConvergenceChecker31);
        levenbergMarquardtOptimizer28.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer28.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer37 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer37.setMaxEvaluations((int) '4');
        int int40 = levenbergMarquardtOptimizer37.getIterations();
        levenbergMarquardtOptimizer37.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer43 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer43.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer46 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer46.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker49 = levenbergMarquardtOptimizer46.getConvergenceChecker();
        levenbergMarquardtOptimizer43.setConvergenceChecker(vectorialConvergenceChecker49);
        levenbergMarquardtOptimizer37.setConvergenceChecker(vectorialConvergenceChecker49);
        levenbergMarquardtOptimizer28.setConvergenceChecker(vectorialConvergenceChecker49);
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker49);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialConvergenceChecker49);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker49);
        int int56 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double57 = levenbergMarquardtOptimizer0.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray58 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1000 + "'", int24 == 1000);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker49);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double9 = levenbergMarquardtOptimizer8.getChiSquare();
        levenbergMarquardtOptimizer8.setCostRelativeTolerance((double) (short) 10);
        int int12 = levenbergMarquardtOptimizer8.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer13.setInitialStepBoundFactor((double) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialConvergenceChecker18);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker18);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker18);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker21);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray6 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer4.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer7.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer4.setMaxIterations(0);
        int int14 = levenbergMarquardtOptimizer4.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker15);
        java.lang.Class<?> wildcardClass17 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer8.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialConvergenceChecker11);
        levenbergMarquardtOptimizer8.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer8.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer17.setMaxEvaluations((int) '4');
        int int20 = levenbergMarquardtOptimizer17.getIterations();
        levenbergMarquardtOptimizer17.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer23.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer26.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker29 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        levenbergMarquardtOptimizer23.setConvergenceChecker(vectorialConvergenceChecker29);
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialConvergenceChecker29);
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialConvergenceChecker29);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker29);
        int int34 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 52);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray39 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer3.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker6);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        java.lang.Class<?> wildcardClass12 = vectorialConvergenceChecker11.getClass();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray10 = new double[] {};
        double[] doubleArray17 = new double[] { (short) 10, 10.0f, 1L, 1.0f, 1L, 10L };
        double[] doubleArray18 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction9, doubleArray10, doubleArray17, doubleArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 0 != 6");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 10.0d, 1.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int18 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction19 = null;
        double[] doubleArray21 = new double[] { 10 };
        double[] doubleArray22 = new double[] {};
        double[] doubleArray27 = new double[] { 100.0f, 2147483647, 0.0f, 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair28 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction19, doubleArray21, doubleArray22, doubleArray27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 1 != 0");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 100.0d, 2.147483647E9d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer3.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker6);
        levenbergMarquardtOptimizer0.setMaxIterations(52);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setMaxEvaluations((int) '4');
        int int13 = levenbergMarquardtOptimizer10.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer14.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer14.setMaxEvaluations((int) (short) -1);
        int int19 = levenbergMarquardtOptimizer14.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialConvergenceChecker20);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker20);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int24 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction25 = null;
        double[] doubleArray32 = new double[] { 0.0d, 1000, (byte) 1, (short) 100, 1.0f, '4' };
        double[] doubleArray38 = new double[] { (short) -1, (byte) 100, (byte) 0, (short) 1, 10L };
        double[] doubleArray44 = new double[] { (byte) 100, 100L, 10.0f, Double.NaN, 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair45 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction25, doubleArray32, doubleArray38, doubleArray44);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 6 != 5");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker20);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 0.0d, 1000.0d, 1.0d, 100.0d, 1.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { (-1.0d), 100.0d, 0.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 100.0d, 100.0d, 10.0d, Double.NaN, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        java.lang.Class<?> wildcardClass9 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100.0f);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray15 = new double[] { 10, 32, (byte) 0, 100.0d };
        double[] doubleArray17 = new double[] { 1 };
        double[] doubleArray24 = new double[] { 32, 10.0d, (short) 10, 1.0d, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair25 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction10, doubleArray15, doubleArray17, doubleArray24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 4 != 1");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 32.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 32.0d, 10.0d, 10.0d, 1.0d, (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray12 = null;
        double[] doubleArray14 = new double[] { (-1.0d) };
        double[] doubleArray20 = new double[] { (short) -1, (byte) 0, 100, 10L, 1000 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction11, doubleArray12, doubleArray14, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { (-1.0d), 0.0d, 100.0d, 10.0d, 1000.0d }, 1.0E-15);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) 'a');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 10);
        java.lang.Class<?> wildcardClass18 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker10);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 0);
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        levenbergMarquardtOptimizer0.setOrthoTolerance(10.0d);
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        levenbergMarquardtOptimizer0.setMaxIterations((int) 'a');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer13.setMaxEvaluations((int) (short) -1);
        int int18 = levenbergMarquardtOptimizer13.getMaxEvaluations();
        double double19 = levenbergMarquardtOptimizer13.getRMS();
        int int20 = levenbergMarquardtOptimizer13.getEvaluations();
        levenbergMarquardtOptimizer13.setMaxEvaluations((int) (byte) 10);
        int int23 = levenbergMarquardtOptimizer13.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer24.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker27 = null;
        levenbergMarquardtOptimizer24.setConvergenceChecker(vectorialConvergenceChecker27);
        int int29 = levenbergMarquardtOptimizer24.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer30 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double31 = levenbergMarquardtOptimizer30.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer32 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer32.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer35.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker38 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer32.setConvergenceChecker(vectorialConvergenceChecker38);
        levenbergMarquardtOptimizer30.setConvergenceChecker(vectorialConvergenceChecker38);
        levenbergMarquardtOptimizer24.setConvergenceChecker(vectorialConvergenceChecker38);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialConvergenceChecker38);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker38);
        int int44 = levenbergMarquardtOptimizer0.getEvaluations();
        int int45 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker38);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1000 + "'", int45 == 1000);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1.0f));
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(vectorialConvergenceChecker15);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(1.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction13 = null;
        double[] doubleArray15 = new double[] { (byte) -1 };
        double[] doubleArray20 = new double[] { 2147483647, (short) -1, 10.0d, (-1L) };
        double[] doubleArray22 = new double[] { 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair23 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction13, doubleArray15, doubleArray20, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 1 != 4");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 2.147483647E9d, (-1.0d), 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray11 = new double[] { (short) -1 };
        double[] doubleArray18 = new double[] { (byte) -1, 1L, 1, 10L, 1000, (byte) -1 };
        double[] doubleArray25 = new double[] { 1.0d, 32, 10L, 'a', 1000, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction9, doubleArray11, doubleArray18, doubleArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 1 != 6");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { (-1.0d), 1.0d, 1.0d, 10.0d, 1000.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 1.0d, 32.0d, 10.0d, 97.0d, 1000.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray13 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1000 + "'", int7 == 1000);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setMaxIterations(52);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray9 = new double[] { Double.NaN, Double.NaN, (-1.0d) };
        double[] doubleArray16 = new double[] { (short) 0, 100L, 100.0f, 10.0f, 0L, (byte) 1 };
        double[] doubleArray23 = new double[] { (byte) 100, 10.0d, 1, '4', (byte) 1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair24 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction5, doubleArray9, doubleArray16, doubleArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 3 != 6");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { Double.NaN, Double.NaN, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d, 100.0d, 100.0d, 10.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d, 10.0d, 1.0d, 52.0d, 1.0d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double10 = levenbergMarquardtOptimizer9.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer14.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker17);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialConvergenceChecker17);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker17);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 0);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray17 = new double[] { 10.0f, (-1.0d), (short) 10, (byte) 1, 1, (short) 1 };
        double[] doubleArray20 = new double[] { '#', (-1L) };
        double[] doubleArray22 = new double[] { 97 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair23 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction10, doubleArray17, doubleArray20, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 6 != 2");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, (-1.0d), 10.0d, 1.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 35.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 97.0d }, 1.0E-15);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 'a');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double11 = levenbergMarquardtOptimizer10.getChiSquare();
        levenbergMarquardtOptimizer10.setCostRelativeTolerance((double) (short) 10);
        int int14 = levenbergMarquardtOptimizer10.getJacobianEvaluations();
        levenbergMarquardtOptimizer10.setOrthoTolerance((double) (byte) -1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer17.setMaxEvaluations(1);
        double double20 = levenbergMarquardtOptimizer17.getRMS();
        double double21 = levenbergMarquardtOptimizer17.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer22.setMaxEvaluations(1);
        double double25 = levenbergMarquardtOptimizer22.getRMS();
        levenbergMarquardtOptimizer22.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer22.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker30 = levenbergMarquardtOptimizer22.getConvergenceChecker();
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialConvergenceChecker30);
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialConvergenceChecker30);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker30);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray34 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker30);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(10.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        java.lang.Class<?> wildcardClass11 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer11.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer11.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer20.setMaxEvaluations((int) '4');
        int int23 = levenbergMarquardtOptimizer20.getIterations();
        levenbergMarquardtOptimizer20.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer26.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer29.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker32 = levenbergMarquardtOptimizer29.getConvergenceChecker();
        levenbergMarquardtOptimizer26.setConvergenceChecker(vectorialConvergenceChecker32);
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialConvergenceChecker32);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker32);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker32);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray37 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker32);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer8.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialConvergenceChecker11);
        levenbergMarquardtOptimizer8.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer8.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer8.setMaxEvaluations((int) (byte) -1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer19.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = null;
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialConvergenceChecker22);
        levenbergMarquardtOptimizer19.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer19.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer28.setMaxEvaluations((int) '4');
        int int31 = levenbergMarquardtOptimizer28.getIterations();
        levenbergMarquardtOptimizer28.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer34.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer37 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer37.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker40 = levenbergMarquardtOptimizer37.getConvergenceChecker();
        levenbergMarquardtOptimizer34.setConvergenceChecker(vectorialConvergenceChecker40);
        levenbergMarquardtOptimizer28.setConvergenceChecker(vectorialConvergenceChecker40);
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialConvergenceChecker40);
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialConvergenceChecker40);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker40);
        java.lang.Class<?> wildcardClass46 = vectorialConvergenceChecker40.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker40);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getEvaluations();
        double double2 = levenbergMarquardtOptimizer0.getChiSquare();
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setConvergenceChecker(vectorialConvergenceChecker12);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0.0f);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 2147483647);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray13 = new double[] { ' ', 0.0f, (short) 100, 10L };
        double[] doubleArray14 = new double[] {};
        double[] doubleArray18 = new double[] { 10.0d, (short) 100, Double.NaN };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction8, doubleArray13, doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 4 != 0");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1000 + "'", int7 == 1000);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 32.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, 100.0d, Double.NaN }, 1.0E-15);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 1);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction13 = null;
        double[] doubleArray19 = new double[] { (byte) 0, 0.0f, 'a', (short) 1, (short) 100 };
        double[] doubleArray23 = new double[] { 100.0d, (byte) 10, (short) 1 };
        double[] doubleArray28 = new double[] { 100L, 0, 10.0f, 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair29 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction13, doubleArray19, doubleArray23, doubleArray28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 5 != 3");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 0.0d, 0.0d, 97.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d, 0.0d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer5.setMaxEvaluations(1);
        double double8 = levenbergMarquardtOptimizer5.getRMS();
        levenbergMarquardtOptimizer5.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer5.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        java.lang.Class<?> wildcardClass15 = vectorialConvergenceChecker13.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setOrthoTolerance((double) (byte) -1);
        int int19 = levenbergMarquardtOptimizer13.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer20.setParRelativeTolerance((double) (byte) 10);
        int int23 = levenbergMarquardtOptimizer20.getMaxIterations();
        double double24 = levenbergMarquardtOptimizer20.getChiSquare();
        levenbergMarquardtOptimizer20.setCostRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer27.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker30 = null;
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialConvergenceChecker30);
        levenbergMarquardtOptimizer27.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer27.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer36 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer36.setMaxEvaluations((int) '4');
        int int39 = levenbergMarquardtOptimizer36.getIterations();
        levenbergMarquardtOptimizer36.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer42 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer42.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer45 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer45.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker48 = levenbergMarquardtOptimizer45.getConvergenceChecker();
        levenbergMarquardtOptimizer42.setConvergenceChecker(vectorialConvergenceChecker48);
        levenbergMarquardtOptimizer36.setConvergenceChecker(vectorialConvergenceChecker48);
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialConvergenceChecker48);
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialConvergenceChecker48);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialConvergenceChecker48);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker48);
        int int55 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray56 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1000 + "'", int23 == 1000);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker48);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1000 + "'", int55 == 1000);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer15.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker18);
        levenbergMarquardtOptimizer12.setMaxIterations(52);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer22.setMaxEvaluations((int) '4');
        int int25 = levenbergMarquardtOptimizer22.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer26.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer26.setMaxEvaluations((int) (short) -1);
        int int31 = levenbergMarquardtOptimizer26.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker32 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        levenbergMarquardtOptimizer22.setConvergenceChecker(vectorialConvergenceChecker32);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker32);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker35 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker35);
        int int37 = levenbergMarquardtOptimizer0.getEvaluations();
        int int38 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction41 = null;
        double[] doubleArray47 = new double[] { (short) 1, 'a', (byte) 10, 0.0d, 100L };
        double[] doubleArray51 = new double[] { 10.0f, 'a', ' ' };
        double[] doubleArray53 = new double[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair54 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction41, doubleArray47, doubleArray51, doubleArray53);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 5 != 3");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker32);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 1.0d, 97.0d, 10.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 10.0d, 97.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10.0f);
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1000 + "'", int14 == 1000);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(10);
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setMaxEvaluations((int) '4');
        int int12 = levenbergMarquardtOptimizer9.getIterations();
        levenbergMarquardtOptimizer9.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer15.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer18.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = levenbergMarquardtOptimizer18.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialConvergenceChecker21);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialConvergenceChecker21);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker21);
        int int25 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations(52);
        java.lang.Class<?> wildcardClass15 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray8 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray8 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker4);
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer7.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialConvergenceChecker13);
        levenbergMarquardtOptimizer7.setMaxIterations(52);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer17.setMaxEvaluations((int) '4');
        int int20 = levenbergMarquardtOptimizer17.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer21.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer21.setMaxEvaluations((int) (short) -1);
        int int26 = levenbergMarquardtOptimizer21.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker27 = levenbergMarquardtOptimizer21.getConvergenceChecker();
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialConvergenceChecker27);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialConvergenceChecker27);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker27);
        java.lang.Class<?> wildcardClass31 = vectorialConvergenceChecker27.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker27);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = null;
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker14);
        int int16 = levenbergMarquardtOptimizer11.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double18 = levenbergMarquardtOptimizer17.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer19.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer22.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker25 = levenbergMarquardtOptimizer22.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialConvergenceChecker25);
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialConvergenceChecker25);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker25);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker25);
        double double30 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction31 = null;
        double[] doubleArray38 = new double[] { '#', ' ', (short) -1, Double.NaN, 32, (short) 0 };
        double[] doubleArray45 = new double[] { 52, 1.0f, (byte) 0, 'a', 10.0f, (byte) 100 };
        double[] doubleArray49 = new double[] { 'a', 10L, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair50 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction31, doubleArray38, doubleArray45, doubleArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker25);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 35.0d, 32.0d, (-1.0d), Double.NaN, 32.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 52.0d, 1.0d, 0.0d, 97.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 97.0d, 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray10 = new double[] { 32, '#', (-1.0f) };
        double[] doubleArray16 = new double[] { (byte) -1, (byte) -1, 1L, (-1L), (byte) 1 };
        double[] doubleArray23 = new double[] { (byte) 100, 0, 1L, 1, 1L, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair24 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction6, doubleArray10, doubleArray16, doubleArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 3 != 5");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 32.0d, 35.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), (-1.0d), 1.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d, 0.0d, 1.0d, 1.0d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 1);
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer2 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer2.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer5.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        levenbergMarquardtOptimizer2.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1000);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        java.lang.Class<?> wildcardClass5 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer7.setMaxEvaluations(1);
        double double10 = levenbergMarquardtOptimizer7.getRMS();
        double double11 = levenbergMarquardtOptimizer7.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setMaxEvaluations(1);
        double double15 = levenbergMarquardtOptimizer12.getRMS();
        levenbergMarquardtOptimizer12.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer12.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialConvergenceChecker20);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker20);
        int int23 = levenbergMarquardtOptimizer0.getIterations();
        int int24 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double25 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction26 = null;
        double[] doubleArray31 = new double[] { (-1L), 10, (short) 100, 100.0f };
        double[] doubleArray38 = new double[] { (short) -1, 1, 1, 0L, (short) 10, '#' };
        double[] doubleArray39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair40 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction26, doubleArray31, doubleArray38, doubleArray39);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 4 != 6");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1000 + "'", int24 == 1000);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { (-1.0d), 10.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { (-1.0d), 1.0d, 1.0d, 0.0d, 10.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setConvergenceChecker(vectorialConvergenceChecker12);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        int int15 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int17 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        int int20 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1000 + "'", int15 == 1000);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(100.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer14.setParRelativeTolerance((double) (byte) 10);
        int int17 = levenbergMarquardtOptimizer14.getMaxIterations();
        double double18 = levenbergMarquardtOptimizer14.getChiSquare();
        levenbergMarquardtOptimizer14.setCostRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer21.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = null;
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker24);
        levenbergMarquardtOptimizer21.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer21.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer30 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer30.setMaxEvaluations((int) '4');
        int int33 = levenbergMarquardtOptimizer30.getIterations();
        levenbergMarquardtOptimizer30.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer36 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer36.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer39 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer39.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker42 = levenbergMarquardtOptimizer39.getConvergenceChecker();
        levenbergMarquardtOptimizer36.setConvergenceChecker(vectorialConvergenceChecker42);
        levenbergMarquardtOptimizer30.setConvergenceChecker(vectorialConvergenceChecker42);
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker42);
        levenbergMarquardtOptimizer14.setConvergenceChecker(vectorialConvergenceChecker42);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker42);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        int int50 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair51 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1000 + "'", int17 == 1000);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker42);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1000 + "'", int50 == 1000);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer5.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setOrthoTolerance((double) (byte) -1);
        int int11 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setParRelativeTolerance((double) (byte) 10);
        int int15 = levenbergMarquardtOptimizer12.getMaxIterations();
        double double16 = levenbergMarquardtOptimizer12.getChiSquare();
        levenbergMarquardtOptimizer12.setCostRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer19.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = null;
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialConvergenceChecker22);
        levenbergMarquardtOptimizer19.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer19.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer28.setMaxEvaluations((int) '4');
        int int31 = levenbergMarquardtOptimizer28.getIterations();
        levenbergMarquardtOptimizer28.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer34.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer37 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer37.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker40 = levenbergMarquardtOptimizer37.getConvergenceChecker();
        levenbergMarquardtOptimizer34.setConvergenceChecker(vectorialConvergenceChecker40);
        levenbergMarquardtOptimizer28.setConvergenceChecker(vectorialConvergenceChecker40);
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialConvergenceChecker40);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker40);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialConvergenceChecker40);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker40);
        int int47 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1000 + "'", int15 == 1000);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker40);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer8.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialConvergenceChecker11);
        levenbergMarquardtOptimizer8.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer8.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer17.setMaxEvaluations((int) '4');
        int int20 = levenbergMarquardtOptimizer17.getIterations();
        levenbergMarquardtOptimizer17.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer23.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer26.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker29 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        levenbergMarquardtOptimizer23.setConvergenceChecker(vectorialConvergenceChecker29);
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialConvergenceChecker29);
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialConvergenceChecker29);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker29);
        int int34 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 52);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray37 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction13 = null;
        double[] doubleArray20 = new double[] { (-1), 10L, 0.0f, 97, (-1.0f), (-1L) };
        double[] doubleArray22 = new double[] { '4' };
        double[] doubleArray25 = new double[] { 1, 10L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction13, doubleArray20, doubleArray22, doubleArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 6 != 1");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { (-1.0d), 10.0d, 0.0d, 97.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setConvergenceChecker(vectorialConvergenceChecker12);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        int int15 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1000 + "'", int15 == 1000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker6);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1000 + "'", int13 == 1000);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100.0f);
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction14 = null;
        double[] doubleArray17 = new double[] { 100.0f, 0 };
        double[] doubleArray20 = new double[] { 100L, '#' };
        double[] doubleArray21 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction14, doubleArray17, doubleArray20, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer3.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker6);
        levenbergMarquardtOptimizer0.setMaxIterations(52);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        double double17 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 0);
        int int20 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1000 + "'", int14 == 1000);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double10 = levenbergMarquardtOptimizer9.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer14.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker17);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialConvergenceChecker17);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker17);
        java.lang.Class<?> wildcardClass21 = vectorialConvergenceChecker17.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker17);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(100.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer14.setParRelativeTolerance((double) (byte) 10);
        int int17 = levenbergMarquardtOptimizer14.getMaxIterations();
        double double18 = levenbergMarquardtOptimizer14.getChiSquare();
        levenbergMarquardtOptimizer14.setCostRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer21.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = null;
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker24);
        levenbergMarquardtOptimizer21.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer21.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer30 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer30.setMaxEvaluations((int) '4');
        int int33 = levenbergMarquardtOptimizer30.getIterations();
        levenbergMarquardtOptimizer30.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer36 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer36.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer39 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer39.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker42 = levenbergMarquardtOptimizer39.getConvergenceChecker();
        levenbergMarquardtOptimizer36.setConvergenceChecker(vectorialConvergenceChecker42);
        levenbergMarquardtOptimizer30.setConvergenceChecker(vectorialConvergenceChecker42);
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker42);
        levenbergMarquardtOptimizer14.setConvergenceChecker(vectorialConvergenceChecker42);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker42);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        java.lang.Class<?> wildcardClass50 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1000 + "'", int17 == 1000);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker42);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray11 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 1);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair12 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer3.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker6);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer11.setMaxEvaluations((int) (short) -1);
        int int16 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        double double17 = levenbergMarquardtOptimizer11.getRMS();
        int int18 = levenbergMarquardtOptimizer11.getEvaluations();
        int int19 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        int int20 = levenbergMarquardtOptimizer11.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker21);
        double double23 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker21);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker12);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer3.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker6);
        levenbergMarquardtOptimizer0.setMaxIterations(52);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 1);
        java.lang.Class<?> wildcardClass12 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 52);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NaN);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int14 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1000 + "'", int13 == 1000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 1);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction16 = null;
        double[] doubleArray17 = new double[] {};
        double[] doubleArray22 = new double[] { 1.0d, 10.0d, 100L, 0 };
        double[] doubleArray26 = new double[] { 'a', (-1.0f), 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair27 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction16, doubleArray17, doubleArray22, doubleArray26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 0 != 4");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 1.0d, 10.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 97.0d, (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker4);
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        int int8 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10.0f);
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        levenbergMarquardtOptimizer0.setOrthoTolerance(10.0d);
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        java.lang.Class<?> wildcardClass13 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        java.lang.Class<?> wildcardClass9 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1));
        int int18 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer21.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer24.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker27 = levenbergMarquardtOptimizer24.getConvergenceChecker();
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker27);
        levenbergMarquardtOptimizer21.setMaxIterations(52);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer31 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer31.setMaxEvaluations((int) '4');
        int int34 = levenbergMarquardtOptimizer31.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer35.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer35.setMaxEvaluations((int) (short) -1);
        int int40 = levenbergMarquardtOptimizer35.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker41 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer31.setConvergenceChecker(vectorialConvergenceChecker41);
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker41);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker44 = levenbergMarquardtOptimizer21.getConvergenceChecker();
        int int45 = levenbergMarquardtOptimizer21.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker46 = levenbergMarquardtOptimizer21.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker46);
        int int48 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker41);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setMaxEvaluations(1);
        double double16 = levenbergMarquardtOptimizer13.getRMS();
        levenbergMarquardtOptimizer13.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer13.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer13.setParRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer13.setParRelativeTolerance((double) 1);
        int int25 = levenbergMarquardtOptimizer13.getIterations();
        int int26 = levenbergMarquardtOptimizer13.getEvaluations();
        levenbergMarquardtOptimizer13.setCostRelativeTolerance((double) 0L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker29 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker29);
        java.lang.Class<?> wildcardClass31 = vectorialConvergenceChecker29.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker29);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray12 = new double[] { 'a', 0.0f, Double.NaN, (-1L) };
        double[] doubleArray17 = new double[] { (short) 10, (byte) 100, 10L, (-1.0d) };
        double[] doubleArray20 = new double[] { 10.0f, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction7, doubleArray12, doubleArray17, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 97.0d, 0.0d, Double.NaN, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) ' ');
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 1);
        int int15 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray13 = new double[] { Double.NaN, 10L, (byte) 100, (-1.0f) };
        double[] doubleArray19 = new double[] { (short) 10, (byte) 0, (short) 10, (short) -1, 1 };
        double[] doubleArray24 = new double[] { (short) 0, 32, 10, 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair25 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction8, doubleArray13, doubleArray19, doubleArray24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 4 != 5");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { Double.NaN, 10.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d, 0.0d, 10.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 0.0d, 32.0d, 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(52);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1000 + "'", int7 == 1000);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer7.setMaxEvaluations(1);
        double double10 = levenbergMarquardtOptimizer7.getRMS();
        levenbergMarquardtOptimizer7.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer7.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        double double16 = levenbergMarquardtOptimizer7.getChiSquare();
        levenbergMarquardtOptimizer7.setMaxEvaluations(1);
        levenbergMarquardtOptimizer7.setParRelativeTolerance(100.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer21.setParRelativeTolerance((double) (byte) 10);
        int int24 = levenbergMarquardtOptimizer21.getMaxIterations();
        double double25 = levenbergMarquardtOptimizer21.getChiSquare();
        levenbergMarquardtOptimizer21.setCostRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer28.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker31 = null;
        levenbergMarquardtOptimizer28.setConvergenceChecker(vectorialConvergenceChecker31);
        levenbergMarquardtOptimizer28.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer28.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer37 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer37.setMaxEvaluations((int) '4');
        int int40 = levenbergMarquardtOptimizer37.getIterations();
        levenbergMarquardtOptimizer37.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer43 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer43.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer46 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer46.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker49 = levenbergMarquardtOptimizer46.getConvergenceChecker();
        levenbergMarquardtOptimizer43.setConvergenceChecker(vectorialConvergenceChecker49);
        levenbergMarquardtOptimizer37.setConvergenceChecker(vectorialConvergenceChecker49);
        levenbergMarquardtOptimizer28.setConvergenceChecker(vectorialConvergenceChecker49);
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker49);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialConvergenceChecker49);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker49);
        int int56 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double57 = levenbergMarquardtOptimizer0.getRMS();
        int int58 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction59 = null;
        double[] doubleArray63 = new double[] { 97, (short) 100, 1.0f };
        double[] doubleArray64 = new double[] {};
        double[] doubleArray66 = new double[] { 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair67 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction59, doubleArray63, doubleArray64, doubleArray66);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 3 != 0");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1000 + "'", int24 == 1000);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker49);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1000 + "'", int58 == 1000);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 97.0d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int14 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1000 + "'", int13 == 1000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1.0f));
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int15 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setMaxEvaluations(1);
        levenbergMarquardtOptimizer10.setOrthoTolerance((double) 1000);
        levenbergMarquardtOptimizer10.setMaxEvaluations((int) (byte) 0);
        levenbergMarquardtOptimizer10.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer10.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker21);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker21);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(1.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer3.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker6);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker6);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        levenbergMarquardtOptimizer0.setOrthoTolerance(10.0d);
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        levenbergMarquardtOptimizer0.setMaxIterations((int) 'a');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer13.setMaxEvaluations((int) (short) -1);
        int int18 = levenbergMarquardtOptimizer13.getMaxEvaluations();
        double double19 = levenbergMarquardtOptimizer13.getRMS();
        int int20 = levenbergMarquardtOptimizer13.getEvaluations();
        levenbergMarquardtOptimizer13.setMaxEvaluations((int) (byte) 10);
        int int23 = levenbergMarquardtOptimizer13.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer24.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker27 = null;
        levenbergMarquardtOptimizer24.setConvergenceChecker(vectorialConvergenceChecker27);
        int int29 = levenbergMarquardtOptimizer24.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer30 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double31 = levenbergMarquardtOptimizer30.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer32 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer32.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer35.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker38 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer32.setConvergenceChecker(vectorialConvergenceChecker38);
        levenbergMarquardtOptimizer30.setConvergenceChecker(vectorialConvergenceChecker38);
        levenbergMarquardtOptimizer24.setConvergenceChecker(vectorialConvergenceChecker38);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialConvergenceChecker38);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker38);
        int int44 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker45 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker38);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker45);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-1.0d));
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray10 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 'a');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double11 = levenbergMarquardtOptimizer10.getChiSquare();
        levenbergMarquardtOptimizer10.setCostRelativeTolerance((double) (short) 10);
        int int14 = levenbergMarquardtOptimizer10.getJacobianEvaluations();
        levenbergMarquardtOptimizer10.setOrthoTolerance((double) (byte) -1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer17.setMaxEvaluations(1);
        double double20 = levenbergMarquardtOptimizer17.getRMS();
        double double21 = levenbergMarquardtOptimizer17.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer22.setMaxEvaluations(1);
        double double25 = levenbergMarquardtOptimizer22.getRMS();
        levenbergMarquardtOptimizer22.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer22.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker30 = levenbergMarquardtOptimizer22.getConvergenceChecker();
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialConvergenceChecker30);
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialConvergenceChecker30);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker30);
        double double34 = levenbergMarquardtOptimizer0.getRMS();
        java.lang.Class<?> wildcardClass35 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker30);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer6.setMaxEvaluations((int) (short) -1);
        int int11 = levenbergMarquardtOptimizer6.getMaxEvaluations();
        double double12 = levenbergMarquardtOptimizer6.getRMS();
        int int13 = levenbergMarquardtOptimizer6.getEvaluations();
        int int14 = levenbergMarquardtOptimizer6.getMaxEvaluations();
        int int15 = levenbergMarquardtOptimizer6.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker16);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction18 = null;
        double[] doubleArray22 = new double[] { 0.0f, 100, 0.0d };
        double[] doubleArray28 = new double[] { 32, 10.0f, 10, 2147483647, (short) 1 };
        double[] doubleArray34 = new double[] { (short) 100, (-1), 52, (byte) 100, 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair35 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction18, doubleArray22, doubleArray28, doubleArray34);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 3 != 5");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 32.0d, 10.0d, 10.0d, 2.147483647E9d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d, (-1.0d), 52.0d, 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer8.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialConvergenceChecker11);
        levenbergMarquardtOptimizer8.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer8.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer17.setMaxEvaluations((int) '4');
        int int20 = levenbergMarquardtOptimizer17.getIterations();
        levenbergMarquardtOptimizer17.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer23.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer26.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker29 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        levenbergMarquardtOptimizer23.setConvergenceChecker(vectorialConvergenceChecker29);
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialConvergenceChecker29);
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialConvergenceChecker29);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker29);
        int int34 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer35.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer35.setMaxEvaluations((int) (short) -1);
        int int40 = levenbergMarquardtOptimizer35.getJacobianEvaluations();
        int int41 = levenbergMarquardtOptimizer35.getJacobianEvaluations();
        levenbergMarquardtOptimizer35.setCostRelativeTolerance((double) 52);
        levenbergMarquardtOptimizer35.setInitialStepBoundFactor(Double.NaN);
        int int46 = levenbergMarquardtOptimizer35.getIterations();
        int int47 = levenbergMarquardtOptimizer35.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer48 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer48.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer51 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer51.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer54 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer54.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker57 = levenbergMarquardtOptimizer54.getConvergenceChecker();
        levenbergMarquardtOptimizer51.setConvergenceChecker(vectorialConvergenceChecker57);
        levenbergMarquardtOptimizer48.setConvergenceChecker(vectorialConvergenceChecker57);
        levenbergMarquardtOptimizer35.setConvergenceChecker(vectorialConvergenceChecker57);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker57);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        java.lang.Class<?> wildcardClass64 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1000 + "'", int47 == 1000);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker57);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray16 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1L);
        java.lang.Class<?> wildcardClass18 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        java.lang.Class<?> wildcardClass11 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10.0f);
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setConvergenceChecker(vectorialConvergenceChecker12);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker12);
        int int15 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction18 = null;
        double[] doubleArray21 = new double[] { (-1.0f), 0 };
        double[] doubleArray26 = new double[] { 'a', 32, (-1.0d), '#' };
        double[] doubleArray30 = new double[] { 0, (short) 10, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair31 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction18, doubleArray21, doubleArray26, doubleArray30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 2 != 4");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1000 + "'", int15 == 1000);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 97.0d, 32.0d, (-1.0d), 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 0.0d, 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair6 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker4);
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((-1.0d));
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(1.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray17 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer3.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker6);
        levenbergMarquardtOptimizer0.setMaxIterations(52);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setMaxEvaluations((int) '4');
        int int13 = levenbergMarquardtOptimizer10.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer14.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer14.setMaxEvaluations((int) (short) -1);
        int int19 = levenbergMarquardtOptimizer14.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialConvergenceChecker20);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker20);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int24 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker25 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker20);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker25);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        java.lang.Class<?> wildcardClass12 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10.0f);
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer14.setMaxEvaluations((int) '4');
        int int17 = levenbergMarquardtOptimizer14.getMaxIterations();
        int int18 = levenbergMarquardtOptimizer14.getJacobianEvaluations();
        int int19 = levenbergMarquardtOptimizer14.getIterations();
        int int20 = levenbergMarquardtOptimizer14.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker22);
        java.lang.Class<?> wildcardClass24 = vectorialConvergenceChecker22.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1000 + "'", int17 == 1000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker21);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1.0f));
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        java.lang.Class<?> wildcardClass10 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = null;
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialConvergenceChecker13);
        int int15 = levenbergMarquardtOptimizer10.getMaxEvaluations();
        levenbergMarquardtOptimizer10.setMaxEvaluations((int) (short) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        int int19 = levenbergMarquardtOptimizer10.getMaxIterations();
        levenbergMarquardtOptimizer10.setMaxEvaluations((int) (byte) 10);
        int int22 = levenbergMarquardtOptimizer10.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer23.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer23.setMaxEvaluations((int) (short) -1);
        int int28 = levenbergMarquardtOptimizer23.getJacobianEvaluations();
        int int29 = levenbergMarquardtOptimizer23.getJacobianEvaluations();
        levenbergMarquardtOptimizer23.setCostRelativeTolerance((double) 52);
        levenbergMarquardtOptimizer23.setInitialStepBoundFactor(Double.NaN);
        int int34 = levenbergMarquardtOptimizer23.getIterations();
        int int35 = levenbergMarquardtOptimizer23.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer36 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer36.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer39 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer39.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer42 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer42.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker45 = levenbergMarquardtOptimizer42.getConvergenceChecker();
        levenbergMarquardtOptimizer39.setConvergenceChecker(vectorialConvergenceChecker45);
        levenbergMarquardtOptimizer36.setConvergenceChecker(vectorialConvergenceChecker45);
        levenbergMarquardtOptimizer23.setConvergenceChecker(vectorialConvergenceChecker45);
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialConvergenceChecker45);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker45);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNull(vectorialConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1000 + "'", int19 == 1000);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1000 + "'", int35 == 1000);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker45);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        double double17 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 0);
        int int20 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction21 = null;
        double[] doubleArray28 = new double[] { 10.0d, (-1L), (short) 10, 100, '#', 10.0d };
        double[] doubleArray35 = new double[] { (-1L), (short) -1, (short) 100, (byte) 1, 100, 0.0d };
        double[] doubleArray41 = new double[] { 100L, 0, 10.0f, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair42 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction21, doubleArray28, doubleArray35, doubleArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1000 + "'", int14 == 1000);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 10.0d, (-1.0d), 10.0d, 100.0d, 35.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d), (-1.0d), 100.0d, 1.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 100.0d, 0.0d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 'a');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double11 = levenbergMarquardtOptimizer10.getChiSquare();
        levenbergMarquardtOptimizer10.setCostRelativeTolerance((double) (short) 10);
        int int14 = levenbergMarquardtOptimizer10.getJacobianEvaluations();
        levenbergMarquardtOptimizer10.setOrthoTolerance((double) (byte) -1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer17.setMaxEvaluations(1);
        double double20 = levenbergMarquardtOptimizer17.getRMS();
        double double21 = levenbergMarquardtOptimizer17.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer22.setMaxEvaluations(1);
        double double25 = levenbergMarquardtOptimizer22.getRMS();
        levenbergMarquardtOptimizer22.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer22.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker30 = levenbergMarquardtOptimizer22.getConvergenceChecker();
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialConvergenceChecker30);
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialConvergenceChecker30);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker30);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction34 = null;
        double[] doubleArray35 = null;
        double[] doubleArray38 = new double[] { (byte) 1, 1L };
        double[] doubleArray40 = new double[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair41 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction34, doubleArray35, doubleArray38, doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker30);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 52);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NaN);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 0);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(vectorialConvergenceChecker5);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1));
        int int18 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        levenbergMarquardtOptimizer0.setMaxIterations(97);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction23 = null;
        double[] doubleArray25 = new double[] { 0.0d };
        double[] doubleArray27 = new double[] { 100.0f };
        double[] doubleArray30 = new double[] { '4', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair31 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction23, doubleArray25, doubleArray27, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 52.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction13 = null;
        double[] doubleArray18 = new double[] { 0.0f, (-1.0f), 100.0f, '4' };
        double[] doubleArray19 = null;
        double[] doubleArray20 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction13, doubleArray18, doubleArray19, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d, (-1.0d), 100.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialConvergenceChecker16);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker16);
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker16);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray7 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0.0f);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray7 = new double[] {};
        double[] doubleArray14 = new double[] { 10L, Double.NaN, 100.0f, (-1.0d), 52, '4' };
        double[] doubleArray17 = new double[] { 52, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction6, doubleArray7, doubleArray14, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 0 != 6");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d, Double.NaN, 100.0d, (-1.0d), 52.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 52.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer5.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setOrthoTolerance((double) (byte) -1);
        int int11 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setParRelativeTolerance((double) (byte) 10);
        int int15 = levenbergMarquardtOptimizer12.getMaxIterations();
        double double16 = levenbergMarquardtOptimizer12.getChiSquare();
        levenbergMarquardtOptimizer12.setCostRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer19.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = null;
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialConvergenceChecker22);
        levenbergMarquardtOptimizer19.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer19.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer28.setMaxEvaluations((int) '4');
        int int31 = levenbergMarquardtOptimizer28.getIterations();
        levenbergMarquardtOptimizer28.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer34.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer37 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer37.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker40 = levenbergMarquardtOptimizer37.getConvergenceChecker();
        levenbergMarquardtOptimizer34.setConvergenceChecker(vectorialConvergenceChecker40);
        levenbergMarquardtOptimizer28.setConvergenceChecker(vectorialConvergenceChecker40);
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialConvergenceChecker40);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker40);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialConvergenceChecker40);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker40);
        int int47 = levenbergMarquardtOptimizer0.getIterations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair48 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1000 + "'", int15 == 1000);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker40);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer15.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker18);
        levenbergMarquardtOptimizer12.setMaxIterations(52);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer22.setMaxEvaluations((int) '4');
        int int25 = levenbergMarquardtOptimizer22.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer26.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer26.setMaxEvaluations((int) (short) -1);
        int int31 = levenbergMarquardtOptimizer26.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker32 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        levenbergMarquardtOptimizer22.setConvergenceChecker(vectorialConvergenceChecker32);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker32);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker35 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker35);
        int int37 = levenbergMarquardtOptimizer0.getEvaluations();
        int int38 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        int int41 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker32);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction4 = null;
        double[] doubleArray6 = new double[] { 97 };
        double[] doubleArray10 = new double[] { 1.0d, (-1.0f), 10.0d };
        double[] doubleArray13 = new double[] { 32, 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction4, doubleArray6, doubleArray10, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 1 != 3");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 32.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1L);
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer17.setMaxEvaluations(1);
        double double20 = levenbergMarquardtOptimizer17.getRMS();
        levenbergMarquardtOptimizer17.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer17.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker25 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker25);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction27 = null;
        double[] doubleArray31 = new double[] { 1.0d, Double.NaN, (-1.0d) };
        double[] doubleArray37 = new double[] { 100, (short) 1, ' ', 1L, (short) 1 };
        double[] doubleArray43 = new double[] { (short) 100, 1.0f, (byte) 0, 1.0d, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair44 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction27, doubleArray31, doubleArray37, doubleArray43);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 3 != 5");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker25);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 1.0d, Double.NaN, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d, 1.0d, 32.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d, 1.0d, 0.0d, 1.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer8.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = null;
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialConvergenceChecker11);
        levenbergMarquardtOptimizer8.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer8.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer17.setMaxEvaluations((int) '4');
        int int20 = levenbergMarquardtOptimizer17.getIterations();
        levenbergMarquardtOptimizer17.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer23.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer26.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker29 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        levenbergMarquardtOptimizer23.setConvergenceChecker(vectorialConvergenceChecker29);
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialConvergenceChecker29);
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialConvergenceChecker29);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker29);
        int int34 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer35.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer35.setMaxEvaluations((int) (short) -1);
        int int40 = levenbergMarquardtOptimizer35.getJacobianEvaluations();
        int int41 = levenbergMarquardtOptimizer35.getJacobianEvaluations();
        levenbergMarquardtOptimizer35.setCostRelativeTolerance((double) 52);
        levenbergMarquardtOptimizer35.setInitialStepBoundFactor(Double.NaN);
        int int46 = levenbergMarquardtOptimizer35.getIterations();
        int int47 = levenbergMarquardtOptimizer35.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer48 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer48.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer51 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer51.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer54 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer54.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker57 = levenbergMarquardtOptimizer54.getConvergenceChecker();
        levenbergMarquardtOptimizer51.setConvergenceChecker(vectorialConvergenceChecker57);
        levenbergMarquardtOptimizer48.setConvergenceChecker(vectorialConvergenceChecker57);
        levenbergMarquardtOptimizer35.setConvergenceChecker(vectorialConvergenceChecker57);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker57);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray64 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1000 + "'", int47 == 1000);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker57);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker4);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(1.0d);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 32);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer5.setMaxEvaluations(1);
        double double8 = levenbergMarquardtOptimizer5.getRMS();
        levenbergMarquardtOptimizer5.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer5.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker13);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        levenbergMarquardtOptimizer0.setMaxIterations(52);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setOrthoTolerance((double) (byte) -1);
        int int19 = levenbergMarquardtOptimizer13.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer20.setParRelativeTolerance((double) (byte) 10);
        int int23 = levenbergMarquardtOptimizer20.getMaxIterations();
        double double24 = levenbergMarquardtOptimizer20.getChiSquare();
        levenbergMarquardtOptimizer20.setCostRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer27.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker30 = null;
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialConvergenceChecker30);
        levenbergMarquardtOptimizer27.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer27.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer36 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer36.setMaxEvaluations((int) '4');
        int int39 = levenbergMarquardtOptimizer36.getIterations();
        levenbergMarquardtOptimizer36.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer42 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer42.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer45 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer45.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker48 = levenbergMarquardtOptimizer45.getConvergenceChecker();
        levenbergMarquardtOptimizer42.setConvergenceChecker(vectorialConvergenceChecker48);
        levenbergMarquardtOptimizer36.setConvergenceChecker(vectorialConvergenceChecker48);
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialConvergenceChecker48);
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialConvergenceChecker48);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialConvergenceChecker48);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker48);
        int int55 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1000);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray58 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1000 + "'", int23 == 1000);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker48);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1000 + "'", int55 == 1000);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer3.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker6);
        levenbergMarquardtOptimizer0.setMaxIterations(52);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setMaxEvaluations((int) '4');
        int int13 = levenbergMarquardtOptimizer10.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer14.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer14.setMaxEvaluations((int) (short) -1);
        int int19 = levenbergMarquardtOptimizer14.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialConvergenceChecker20);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker20);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int24 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker25 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int26 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker20);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(100.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer14.setParRelativeTolerance((double) (byte) 10);
        int int17 = levenbergMarquardtOptimizer14.getMaxIterations();
        double double18 = levenbergMarquardtOptimizer14.getChiSquare();
        levenbergMarquardtOptimizer14.setCostRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer21.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = null;
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker24);
        levenbergMarquardtOptimizer21.setCostRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer21.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer30 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer30.setMaxEvaluations((int) '4');
        int int33 = levenbergMarquardtOptimizer30.getIterations();
        levenbergMarquardtOptimizer30.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer36 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer36.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer39 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer39.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker42 = levenbergMarquardtOptimizer39.getConvergenceChecker();
        levenbergMarquardtOptimizer36.setConvergenceChecker(vectorialConvergenceChecker42);
        levenbergMarquardtOptimizer30.setConvergenceChecker(vectorialConvergenceChecker42);
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker42);
        levenbergMarquardtOptimizer14.setConvergenceChecker(vectorialConvergenceChecker42);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker42);
        int int48 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray51 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1000 + "'", int17 == 1000);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker42);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setMaxEvaluations(1000);
        levenbergMarquardtOptimizer11.setOrthoTolerance(10.0d);
        int int19 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker20);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1000 + "'", int19 == 1000);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker20);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker4);
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(1.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray12 = new double[] {};
        double[] doubleArray18 = new double[] { (short) -1, 100.0d, 0.0f, (short) 100, '#' };
        double[] doubleArray23 = new double[] { 0, 0L, (short) 10, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair24 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction11, doubleArray12, doubleArray18, doubleArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 0 != 5");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { (-1.0d), 100.0d, 0.0d, 100.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 0.0d, 0.0d, 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer4.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer4.setMaxEvaluations((int) (short) -1);
        int int9 = levenbergMarquardtOptimizer4.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker10);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray12 = new double[] { (byte) -1, 'a', 0, 1.0d, 0.0f, 100L };
        double[] doubleArray14 = new double[] { 0.0d };
        double[] doubleArray18 = new double[] { (short) 1, (-1), 97 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction5, doubleArray12, doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 6 != 1");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 97.0d, 0.0d, 1.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 1.0d, (-1.0d), 97.0d }, 1.0E-15);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer10.setMaxEvaluations((int) (short) -1);
        int int15 = levenbergMarquardtOptimizer10.getJacobianEvaluations();
        int int16 = levenbergMarquardtOptimizer10.getJacobianEvaluations();
        levenbergMarquardtOptimizer10.setCostRelativeTolerance((double) 52);
        levenbergMarquardtOptimizer10.setInitialStepBoundFactor(Double.NaN);
        int int21 = levenbergMarquardtOptimizer10.getIterations();
        int int22 = levenbergMarquardtOptimizer10.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer23.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer26.setMaxEvaluations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer29.setParRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker32 = levenbergMarquardtOptimizer29.getConvergenceChecker();
        levenbergMarquardtOptimizer26.setConvergenceChecker(vectorialConvergenceChecker32);
        levenbergMarquardtOptimizer23.setConvergenceChecker(vectorialConvergenceChecker32);
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialConvergenceChecker32);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer36 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer36.setParRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer36.setMaxEvaluations((int) (short) -1);
        int int41 = levenbergMarquardtOptimizer36.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker42 = levenbergMarquardtOptimizer36.getConvergenceChecker();
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialConvergenceChecker42);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker44 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker44);
        int int46 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1000 + "'", int22 == 1000);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker32);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker42);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass12 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 1);
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10.0f);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        java.lang.Class<?> wildcardClass9 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations(97);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations(52);
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }
}

